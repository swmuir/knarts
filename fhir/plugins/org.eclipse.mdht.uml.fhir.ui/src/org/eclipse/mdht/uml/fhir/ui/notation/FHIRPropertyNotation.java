/*******************************************************************************
 * Copyright (c) 2015 David A Carlson.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     David A Carlson (Clinical Cloud Solutions, LLC) - initial API and implementation
 *     
 *******************************************************************************/
package org.eclipse.mdht.uml.fhir.ui.notation;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.mdht.uml.common.notation.IUMLNotation;
import org.eclipse.mdht.uml.common.notation.PropertyNotationUtil;
import org.eclipse.mdht.uml.common.util.MultiplicityElementUtil;
import org.eclipse.mdht.uml.common.util.NamedElementUtil;
import org.eclipse.mdht.uml.common.util.UMLUtil;
import org.eclipse.mdht.uml.fhir.BindingStrengthKind;
import org.eclipse.mdht.uml.fhir.ElementDefinition;
import org.eclipse.mdht.uml.fhir.FHIRPackage;
import org.eclipse.mdht.uml.fhir.TypeChoice;
import org.eclipse.mdht.uml.fhir.ValueSet;
import org.eclipse.mdht.uml.fhir.ValueSetBinding;
import org.eclipse.mdht.uml.fhir.common.util.FhirModelUtil;
import org.eclipse.mdht.uml.fhir.types.CodeableConcept;
import org.eclipse.mdht.uml.fhir.types.Coding;
import org.eclipse.mdht.uml.fhir.util.ProfileUtil;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Type;


/**
 * Utility class to display FHIR property annotations.
 */
public class FHIRPropertyNotation extends PropertyNotationUtil {

	public static final String FLAG_MODIFYING_ELEMENT = "?!";
	public static final String FLAG_MUST_BE_SUPPORTED = "S";
	public static final String FLAG_SUMMARY_SET = "Σ";
	public static final String FLAG_INVARIANT = "I";
	public static final String FLAG_CANNOT_HAVE_EXTENSIONS = "NE";
	
	/**
	 * return the custom label of the property, given UML2 specification and a
	 * custom style.
	 * 
	 * @param style
	 *            the integer representing the style of the label
	 * 
	 * @return the string corresponding to the label of the property
	 */
	public static String getCustomLabel(Property property, int style) {
		StringBuffer buffer = new StringBuffer();

		// visibility
		if ((style & IUMLNotation.DISP_VISIBILITY) != 0) {
			buffer.append(NamedElementUtil.getVisibilityAsSign(property));
		}

		// derived property
		if ((style & IUMLNotation.DISP_DERIVE) != 0) {
			if (property.isDerived()) {
				buffer.append("/");
			}
		}

		// name
		if ((style & IUMLNotation.DISP_NAME) != 0) {
			buffer.append(" ");
			buffer.append(property.getName());
		}

		if ((style & IUMLNotation.DISP_TYPE) != 0) {
			// type
			if (property.getType() != null) {
				buffer.append(" : " + property.getType().getName());
			}
		}

		if ((style & IUMLNotation.DISP_MULTIPLICITY) != 0) {
			// multiplicity -> do not display [1]
			String multiplicity = MultiplicityElementUtil.getMultiplicityAsString(property);
			if (!multiplicity.trim().equals("[1]")) {
				buffer.append(multiplicity);
			}
		}

		if ((style & IUMLNotation.DISP_DFLT_VALUE) != 0) {
			// default value
			if (property.getDefault() != null) {
				buffer.append(" = ");
				buffer.append(property.getDefault());
			}
			else {
				// display summary of FHIR profile fixed value
				// TODO FHIR default or example value??
				String fixedValue = getFixedValueAnnotation(property);
				
			}
		}

		boolean multiLine = ((style & IUMLNotation.DISP_MULTI_LINE) != 0);
		StringBuffer annotations = new StringBuffer();

		String flags = getFlags(property);
		if (flags.length() > 0) {
			annotations.append(flags);
		}
		
		if ((style & IUMLNotation.DISP_MOFIFIERS) != 0) {
			// property modifiers
//			String modifiers = PropertyNotationUtil.getModifiersAsString(property, multiLine);
			String modifiers = getModifiersAsString(property, multiLine);
			if (!modifiers.equals("")) {
				annotations.append(annotations.length() > 0 ? " ": "");
				annotations.append(modifiers);
			}
		}

		if ((style & INotationConstants.DISP_TYPE_CHOICE) != 0) {
			String typeChoice = getPropertyTypeChoice(property);
			if (typeChoice.length() > 0) {
				annotations.append(annotations.length() > 0 ? " ": "");
				annotations.append(typeChoice);
			}
		}

		String extensionMetadata = getExtensionAnnotations(property);
		if (extensionMetadata.length() > 0) {
			annotations.append(annotations.length() > 0 ? " ": "");
			annotations.append(extensionMetadata);
		}

		// extension metadata includes vocab binding, if available
		if (extensionMetadata.length() == 0 && (style & INotationConstants.DISP_VOCABULARY) != 0) {
			String termMetadata = getTerminologyAnnotations(property);
			if (termMetadata.length() > 0) {
				annotations.append(annotations.length() > 0 ? ", ": "");
				annotations.append(termMetadata);
			}
			else {
				String fixedCoding = getFixedValueAnnotation(property);
				if (fixedCoding.length() > 0) {
					annotations.append(annotations.length() > 0 ? ", ": "");
//					annotations.append("= ");
					annotations.append(fixedCoding);
				}
			}
		}

		if (annotations.length() > 0) {
			if (multiLine) {
				buffer.append("\n");
			}

			boolean showBrackets = buffer.length() > 0;
			buffer.append(showBrackets
					? " {"
					: "");
			buffer.append(annotations);
			buffer.append(showBrackets
					? "}"
					: "");
		}

		return buffer.toString().trim();
	}

	protected static String getFlags(Property property) {
		StringBuffer label = new StringBuffer();
		ElementDefinition elementDef = (ElementDefinition) ProfileUtil.getStereotypeApplication(property, FHIRPackage.eINSTANCE.getElementDefinition());
		if (elementDef != null) {
			if (Boolean.TRUE == elementDef.getIsModifier()) {
				label.append(FLAG_MODIFYING_ELEMENT);
			}
			if (Boolean.TRUE == elementDef.getMustSupport()) {
				label.append(label.length() > 0 ? " ": "");
				label.append(FLAG_MUST_BE_SUPPORTED);
			}
			if (Boolean.TRUE == elementDef.getIsSummary()) {
				label.append(label.length() > 0 ? " ": "");
				label.append(FLAG_SUMMARY_SET);
			}
//			if (hasInvariant(property)) {
//				label.append(label.length() > 0 ? " ": "");
//				label.append(FLAG_INVARIANT);
//			}
		}
		
		return label.toString();
	}
	
	private static boolean hasInvariant(Property property) {
		for (Constraint constraint : property.getClass_().getOwnedRules()) {
			for (Element element : constraint.getConstrainedElements()) {
				if (property.equals(element)) {
					return true;
				}
			}
		}
		return false;
	}

	protected static String getModifiersAsString(Property property, boolean multiLine) {
		StringBuffer buffer = new StringBuffer();
		boolean needsComma = false;
		String NL = (multiLine)
				? "\n"
				: "";

		// Return property modifiers
		if (property.isReadOnly()) {
			buffer.append("fixed");
			needsComma = true;
		}
		if (property.isDerivedUnion()) {
			if (needsComma) {
				buffer.append(",");
				buffer.append(NL);
			}
			buffer.append("union");
			needsComma = true;
		}
		if (!property.isOrdered() && property.upperBound() != 1 && property.upperBound() != 0) {
			if (needsComma) {
				buffer.append(",");
				buffer.append(NL);
			}
			buffer.append("unordered");
			needsComma = true;
		}
		if (property.isUnique() && property.getUpper() > 1) {
			if (needsComma) {
				buffer.append(",");
				buffer.append(NL);
			}
			buffer.append("unique");
			needsComma = true;
		}

		Iterator<org.eclipse.uml2.uml.Property> it;
/*
		// is the property redefining another property ?
		Iterator<org.eclipse.uml2.uml.Property> it;
		it = property.getRedefinedProperties().iterator();
		while (it.hasNext()) {
			org.eclipse.uml2.uml.Property redefinedProperty = it.next();
			// display only if redefined property has a different name (i.e., not "implicit")
			if (!redefinedProperty.eIsProxy()) {
				if (needsComma) {
					buffer.append(", ");
					buffer.append(NL);
				}
				needsComma = true;

				if (redefinedProperty.getName().equals(property.getName())) {
//					buffer.append("redefined");
				} else {
					buffer.append("redefines ");
					buffer.append(redefinedProperty.getName());
				}
			}
		}
*/

		// is the property subsetting another property ?
		it = property.getSubsettedProperties().iterator();
		while (it.hasNext()) {
			Property current = it.next();
			if (!current.eIsProxy()) {
				if (needsComma) {
					buffer.append(", ");
					buffer.append(NL);
				}
//				buffer.append("subsets ");
				buffer.append("slices ");
				buffer.append(current.getName());
				needsComma = true;
			}
		}

		return buffer.toString();
	}
	protected static String getPropertyTypeChoice(Property property) {
		StringBuffer typeLabel = new StringBuffer();
		TypeChoice typeChoice = (TypeChoice) ProfileUtil.getStereotypeApplication(property, FHIRPackage.eINSTANCE.getTypeChoice());
		if (typeChoice != null) {
			if (!typeChoice.getTypes().isEmpty()) {
				typeLabel.append("(");
			}
			for (Classifier choice : typeChoice.getTypes()) {
				if (typeLabel.length() > 1) {
					typeLabel.append(" | ");
				}
				typeLabel.append(choice.getName());
			}
			if (!typeChoice.getTypes().isEmpty()) {
				typeLabel.append(")");
			}
		}
		
		return typeLabel.toString();
	}

	protected static String getExtensionAnnotations(Property property) {
		StringBuffer annotation = new StringBuffer();
		if (property.getType() instanceof Classifier
				&& FhirModelUtil.isExtension((Classifier)property.getType())) {
			Classifier extension = (Classifier)property.getType();
			Property value = null;
			for (Property prop : extension.getAttributes()) {
				if (prop.getName().startsWith("value")) {
					value = prop;
					break;
				}
			}
			if (value != null && value.getUpper() > 0 && value.getType() != null) {
				annotation.append(value.getType().getName());

				// the property may override valueset binding, but if not, include binding from extension definition
				String termMetadata = getTerminologyAnnotations(property);
				if (termMetadata.length() == 0) {
					termMetadata = getTerminologyAnnotations(value);
				}
				if (termMetadata.length() > 0) {
					annotation.append(annotation.length() > 0 ? " ": "");
					annotation.append(termMetadata);
				}
			}
		}
		
		return annotation.toString();
	}

	protected static String getTerminologyAnnotations(Property property) {
		StringBuffer annotation = new StringBuffer();
		ValueSetBinding binding = (ValueSetBinding) ProfileUtil.getStereotypeApplication(property, FHIRPackage.eINSTANCE.getValueSetBinding());
		if (binding != null) {
			String valueSetName = null;
			if (binding.getValueSetReference() != null) {
				ValueSet valueSet = binding.getValueSetReference();
				if (valueSet.getName() != null) {
					valueSetName = valueSet.getName();
				}
				else if (valueSet.getUri() != null) {
					valueSetName = valueSet.getUri();
					valueSetName = valueSetName.substring(valueSetName.lastIndexOf("/") + 1);
				}
				else {
					valueSetName = valueSet.getBase_Enumeration().getName();
				}
			}
			else if (binding.getValueSetUri() != null) {
				valueSetName = binding.getValueSetUri();
			}

			if (valueSetName != null) {
				annotation.append("[");
				annotation.append(valueSetName);
				annotation.append("]");
			}

			if (binding.getStrength() != null) {
				//TODO toUpperCamelCase
				BindingStrengthKind bindingStrength = binding.getStrength();
//				String strengthName = binding.getStrength().getName();
//				StringBuffer camelCaseNameBuffer = new StringBuffer();
//				camelCaseNameBuffer.append(strengthName.substring(0, 1).toUpperCase());
//				camelCaseNameBuffer.append(strengthName.substring(1));
//				strengthName = camelCaseNameBuffer.toString();
//				
//				annotation.append(" (");
//				annotation.append(strengthName);
//				annotation.append(")");
				
				if (BindingStrengthKind.EXAMPLE == bindingStrength) {
					annotation.append("?");
				}
				else if (BindingStrengthKind.PREFERRED == bindingStrength) {
					annotation.append("#");
				}
				else if (BindingStrengthKind.REQUIRED == bindingStrength) {
					annotation.append("!");
				}
				else if (BindingStrengthKind.EXTENSIBLE == bindingStrength) {
					annotation.append("+");
				}
			}
		}

		return annotation.toString();
	}

	protected static String getFixedValueAnnotation(Property property) {
		StringBuffer annotation = new StringBuffer();
		ElementDefinition elementDef = (ElementDefinition) ProfileUtil.getStereotypeApplication(property, FHIRPackage.eINSTANCE.getElementDefinition());
		if (elementDef != null) {
			if (elementDef.getFixed() instanceof CodeableConcept) {
				CodeableConcept fixedCodes = (CodeableConcept) elementDef.getFixed();
				for (Coding coding : fixedCodes.getCodings()) {
					StringBuffer codingDisplay = new StringBuffer();
					if (coding.getSystem() != null) {
						codingDisplay.append(coding.getSystem());
					}
					if (coding.getCode() != null) {
						codingDisplay.append((codingDisplay.length() > 0) ? " | " : "");
						codingDisplay.append(coding.getCode());
					}
					annotation.append((annotation.length() > 0) ? ", " : "");
					annotation.append(codingDisplay);
				}
			}
		}
		
		if (annotation.length() == 0 && property.getType() != null) {
			annotation.append(getFixedValueAnnotation(property.getType()));
		}
		
		return annotation.toString();
	}
	
	protected static String getFixedValueAnnotation(Type umlType) {
		if (!(umlType instanceof Class)) {
			return null;
		}
		Class umlClass = (Class) umlType;
		StringBuffer annotation = new StringBuffer();

		//TODO Do I need to aggregate annotations from all inherited properties?
		if (isFHIRType(umlClass, "CodeableConcept")) {
			List<Property> codings = new ArrayList<Property>();
			for (Property prop : umlClass.getOwnedAttributes()) {
				if (prop.getType() instanceof Class && UMLUtil.getAllParentNames(((Class)prop.getType())).contains("Coding")) {
					codings.add(prop);
				}
			}
			for (Property coding : codings) {
				if (coding.getType() instanceof Class) {
					annotation.append((annotation.length() > 0) ? ", " : "");
					annotation.append(getCodingAnnotation((Class)coding.getType()));
				}
			}
		}
		else if (isFHIRType(umlClass, "Coding")) {
			annotation.append(getCodingAnnotation(umlClass));
		}
		else if (isFHIRType(umlClass, "Quantity")) {
			// for Quantity, use 'code' or 'system', but not both
			Property code = umlClass.getOwnedAttribute("code", null);
			Property system = umlClass.getOwnedAttribute("system", null);
			if (code != null) {
				if (code.isReadOnly() && code.getDefault() != null) {
					annotation.append(code.getDefault());
				}
				else if (system != null) {
					if (system.isReadOnly() && system.getDefault() != null) {
						annotation.append(system.getDefault());
					}
				}
				else {
					String binding = getTerminologyAnnotations(code);
					if (binding != null) {
						annotation.append(binding);
					}
				}
			}
		}
		
		return annotation.toString();
	}
	
	private static String getCodingAnnotation(Class coding) {
		StringBuffer annotation = new StringBuffer();
		Property system = coding.getOwnedAttribute("system", null);
		if (system != null) {
			if (system.isReadOnly() && system.getDefault() != null) {
				annotation.append(system.getDefault());
			}
		}
		
		Property code = coding.getOwnedAttribute("code", null);
		if (code != null) {
			if (code.isReadOnly() && code.getDefault() != null) {
				annotation.append((annotation.length() > 0) ? " | " : "");
				annotation.append(code.getDefault());
			}
		}
		
		return annotation.toString();
	}

	private static boolean isFHIRType(Classifier classifier, String typeName) {
		for (String name : UMLUtil.getAllParentNames(classifier)) {
			if (name.equals(typeName)) {
				return true;
			}
		}
		return false;
	}

}
