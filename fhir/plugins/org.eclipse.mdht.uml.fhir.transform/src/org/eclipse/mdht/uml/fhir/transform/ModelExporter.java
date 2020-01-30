/*******************************************************************************
 * Copyright (c) 2015 David A Carlson
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     David A Carlson (Clinical Cloud Solutions, LLC) - initial API and implementation
 *
 *******************************************************************************/
package org.eclipse.mdht.uml.fhir.transform;

 
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.mdht.uml.common.util.UMLUtil;
import org.eclipse.mdht.uml.fhir.DerivationKind;
import org.eclipse.mdht.uml.fhir.FHIRPackage;
import org.eclipse.mdht.uml.fhir.TypeChoice;
import org.eclipse.mdht.uml.fhir.common.util.FhirModelUtil;
import org.eclipse.mdht.uml.fhir.common.util.ModelConstants;
import org.eclipse.mdht.uml.fhir.common.util.ModelIndexer;
import org.eclipse.mdht.uml.validation.Diagnostic;
import org.eclipse.mdht.uml.validation.ValidationPackage;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.OpaqueExpression;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Property;
import org.hl7.fhir.BindingStrength;
import org.hl7.fhir.BindingStrengthList;
import org.hl7.fhir.Boolean;
import org.hl7.fhir.Canonical;
import org.hl7.fhir.Code;
import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.Coding;
import org.hl7.fhir.ConstraintSeverity;
import org.hl7.fhir.ConstraintSeverityList;
import org.hl7.fhir.ContactDetail;
import org.hl7.fhir.ContactPoint;
import org.hl7.fhir.ContactPointSystem;
import org.hl7.fhir.ContactPointSystemList;
import org.hl7.fhir.ContactPointUse;
import org.hl7.fhir.ContactPointUseList;
import org.hl7.fhir.ElementDefinition;
import org.hl7.fhir.ElementDefinitionBase;
import org.hl7.fhir.ElementDefinitionBinding;
import org.hl7.fhir.ElementDefinitionConstraint;
import org.hl7.fhir.ElementDefinitionDiscriminator;
import org.hl7.fhir.ElementDefinitionMapping;
import org.hl7.fhir.ElementDefinitionSlicing;
import org.hl7.fhir.ElementDefinitionType;
import org.hl7.fhir.Extension;
import org.hl7.fhir.ExtensionContextType;
import org.hl7.fhir.ExtensionContextTypeList;
import org.hl7.fhir.FHIRVersion;
import org.hl7.fhir.FHIRVersionList;
import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Id;
import org.hl7.fhir.Markdown;
import org.hl7.fhir.Narrative;
import org.hl7.fhir.NarrativeStatus;
import org.hl7.fhir.NarrativeStatusList;
import org.hl7.fhir.PublicationStatus;
import org.hl7.fhir.PublicationStatusList;
import org.hl7.fhir.Reference;
import org.hl7.fhir.SlicingRules;
import org.hl7.fhir.SlicingRulesList;
import org.hl7.fhir.StructureDefinition;
import org.hl7.fhir.StructureDefinitionContext;
import org.hl7.fhir.StructureDefinitionDifferential;
import org.hl7.fhir.StructureDefinitionKind;
import org.hl7.fhir.StructureDefinitionKindList;
import org.hl7.fhir.StructureDefinitionMapping;
import org.hl7.fhir.StructureDefinitionSnapshot;
import org.hl7.fhir.TypeDerivationRule;
import org.hl7.fhir.TypeDerivationRuleList;
import org.hl7.fhir.UnsignedInt;
import org.hl7.fhir.Uri;
 
import org.w3._1999.xhtml.DivType;
import org.w3._1999.xhtml.TableType;
import org.w3._1999.xhtml.XhtmlFactory;

public class ModelExporter implements ModelConstants {

	private ModelIndexer modelIndexer = new ModelIndexer();
	
	public void indexContents(Package umlPackage) {
		modelIndexer.indexMembers(umlPackage);
	}
	
	public StructureDefinition createStrucureDefinition(Class umlClass) {
		org.eclipse.mdht.uml.fhir.StructureDefinition structureDefStereotype = FhirModelUtil.getStructureDefinition(umlClass);
		
		boolean isForFHIM = false;
		if (structureDefStereotype == null) {
			
			structureDefStereotype = org.eclipse.mdht.uml.fhir.FHIRFactory.eINSTANCE.createStructureDefinition();
			
			isForFHIM = true;
//			System.err.println("Skipping class without <<StructureDefinition>>");
//			return null;
		}

		// This map is used at end to create FHIR constraints and condition references.
		Map<NamedElement,ElementDefinition> elementMap = new HashMap<NamedElement,ElementDefinition>();
		
		StructureDefinition structureDef = FhirFactory.eINSTANCE.createStructureDefinition();
		
		
	 
		structureDef.setName(createFhirString(umlClass.getName()));
		
		structureDef.setTitle(createFhirString(umlClass.getName()));
		structureDef.setVersion(createFhirString("0.90"));
		
		if (isForFHIM) {
			structureDef.setType(createFhirUri("http://fhims.org/fhim/template"));		
		}
	
		
		
		
		
		
		structureDef.setAbstract(createFhirBoolean(umlClass.isAbstract()));

		String id = structureDefStereotype.getId() != null 
				? structureDefStereotype.getId() : umlClass.getName().toLowerCase();
		String uri = structureDefStereotype.getUri() != null 
						? structureDefStereotype.getUri() : MDHT_STRUCTURE_URI_BASE + id;
		PublicationStatus resourceStatus = FhirFactory.eINSTANCE.createPublicationStatus();
		String status = structureDefStereotype.getStatus() != null 
				? structureDefStereotype.getStatus() : "draft";
		resourceStatus.setValue(PublicationStatusList.get(status));
		String publisher = structureDefStereotype.getPublisher() != null 
								? structureDefStereotype.getPublisher() : "Model Driven Health Tools (MDHT)";
		if (structureDefStereotype.getCopyright() != null) {
			structureDef.setCopyright(createMarkdown(structureDefStereotype.getCopyright()));
		}
		
		structureDef.setId(createFhirId(id));
		Narrative narrative = FhirFactory.eINSTANCE.createNarrative();
		
		NarrativeStatus narrativeStatus = FhirFactory.eINSTANCE.createNarrativeStatus();
		narrativeStatus.setValue(NarrativeStatusList.GENERATED);
		narrative.setStatus(narrativeStatus);
		
		DivType div = XhtmlFactory.eINSTANCE.createDivType();
		
		TableType tt = XhtmlFactory.eINSTANCE.createTableType();
		tt.setTitle("need to change type to be like structure text in cda");
		
		div.getTable().add(tt);
		
		
		narrative.setDiv(div);
		
//		narrative.
		structureDef.setText(narrative);
		structureDef.setUrl(createFhirUri(uri));
		structureDef.setStatus(resourceStatus);
		
		Boolean exper = FhirFactory.eINSTANCE.createBoolean();
		exper.setValue(false);
		structureDef.setExperimental(exper);
		structureDef.setDate(createFhirDateTimeNow());
		structureDef.setPublisher(createFhirString(publisher));
		
		ContactDetail contactDetail = FhirFactory.eINSTANCE.createContactDetail();
		ContactPoint contactPoint = FhirFactory.eINSTANCE.createContactPoint();
		ContactPointUse use = FhirFactory.eINSTANCE.createContactPointUse();;
		 
		use.setValue(ContactPointUseList.WORK);
		contactPoint.setUse(use);
		contactPoint.setValue(createFhirString("URL"));
		ContactPointSystem cps = FhirFactory.eINSTANCE.createContactPointSystem();
 
		cps.setValue(ContactPointSystemList.URL);
		contactPoint.setSystem(cps);
		contactDetail.getTelecom().add(contactPoint );
		
		
		structureDef.getContact().add(contactDetail);
		
		/*
		 * <coding>
			<system value="urn:iso:std:iso:3166"></system>
			<code value="US"></code>
			<display value="United States of America"></display>
		</coding>
		 */
		CodeableConcept cc = FhirFactory.eINSTANCE.createCodeableConcept();
		Coding coding = FhirFactory.eINSTANCE.createCoding();
		Code code = FhirFactory.eINSTANCE.createCode();
		code.setValue("US");
		
		coding.setCode(code);
		 
		coding.setDisplay(createFhirString("United States of America"));
		coding.setSystem(createFhirUri("urn:iso:std:iso:3166"));
		
		cc.getCoding().add(coding);
		
		structureDef.getJurisdiction().add(cc);
		
		
		FHIRVersion version = FhirFactory.eINSTANCE.createFHIRVersion();
		 
		version.setValue(FHIRVersionList._400);
		structureDef.setFhirVersion(version);
		
		StructureDefinitionMapping sdm  = FhirFactory.eINSTANCE.createStructureDefinitionMapping();
		
	 
		
		sdm.setIdentity(createFhirId("fhim"));
		sdm.setUri(createFhirUri("http://onc.gov/fhim"));
		sdm.setName(createFhirString("FHIM"));
		
		 
		structureDef.getMapping().add(sdm);

		if (structureDefStereotype.getName() != null) {
			structureDef.setName(createFhirString(structureDefStereotype.getName()));
		}
		if (structureDefStereotype.getDisplay() != null) {
			structureDef.setTitle(createFhirString(structureDefStereotype.getDisplay()));
		}

		for (Classifier parent : umlClass.getGenerals()) {
			Uri baseUri = getStructureDefinitionUri(parent);
			if (baseUri != null) {
				Canonical canonical = FhirFactory.eINSTANCE.createCanonical();
				canonical.setValue(baseUri.toString());
				structureDef.setBaseDefinition(canonical);
			 
				break;
				// TODO throw error if > 1 generalization
			}
		}
		
		// Set 'baseType'
		// TODO this does not work if target profile is also a core type, e.g. AllergyIntolerance isa DomainResource
		//		Exclude self from search for core base type?
		Classifier baseType = getCoreBaseType(umlClass);
		if (baseType != null) {
			if (!umlClass.equals(baseType)) {
				Uri foo = FhirFactory.eINSTANCE.createUri();
				foo.setValue(baseType.getName());
							//			structureDef.sett
							//createFhirCode(baseType.getName())
							structureDef.setType(foo);
						}		
		}
	
		
		// Set 'kind'
		// TODO does not handle datatype: primitive-type vs complex-type, but primitive-type cannot be used by profile developers
		String kindValue;
		if (structureDefStereotype.getIsLogical() != null && structureDefStereotype.getIsLogical()) {
			kindValue = "logical";
		}
		else if (modelIndexer.isKindOfDataType(umlClass)) {
			kindValue = "complex-type";
		}
		else if (modelIndexer.isKindOfResource(umlClass)) {
			kindValue = "resource";
		}
		else {
			kindValue = "logical";
		}
		
		StructureDefinitionKind kind = FhirFactory.eINSTANCE.createStructureDefinitionKind();
		kind.setValue(StructureDefinitionKindList.get(kindValue));
		structureDef.setKind(kind);
		
		// derivation (optional): constraint, specialization
		// unless is kind='logical', then only core types may use 'specialization'
		DerivationKind derivation = structureDefStereotype.getDerivation();
		if (derivation != null) {
			TypeDerivationRule derivationRule = FhirFactory.eINSTANCE.createTypeDerivationRule();
			derivationRule.setValue(TypeDerivationRuleList.get(derivation.getName()));
			structureDef.setDerivation(derivationRule);
		}
		
		// Add 'contextType' and 'context'
		if (modelIndexer.isExtension(umlClass)) {
			if (structureDefStereotype.getContextType() != null) {
Object contextType;
				StructureDefinitionContext foobar = FhirFactory.eINSTANCE.createStructureDefinitionContext();
				ExtensionContextType barfoo = FhirFactory.eINSTANCE.createExtensionContextType();
				ExtensionContextTypeList foofoo;
				barfoo.setValue(ExtensionContextTypeList.get(structureDefStereotype.getContextType()));
				foobar.setType(barfoo);
			
				for (String context : structureDefStereotype.getContexts()) {
					foobar.setExpression(createFhirString(context));
				}
				
				
				//				ExtensionContext contextType = FhirFactory.eINSTANCE.createExtensionContext();
//				contextType.setValue(ExtensionContextList.get(structureDefStereotype.getContextType()));
				structureDef.getContext().add(foobar );
			}
//			for (String context : structureDefStereotype.getContexts()) {
//				structureDef.getContext().add(createFhirString(context));
//			}
			
			//TODO can I infer contextType and/or context from model structure, if not defined in stereotype?
		}

		String description = getComment(umlClass, FHIRPackage.eINSTANCE.getDescription());
		if (description != null) {
			structureDef.setDescription(createMarkdown(description));
		}
		String requirements = getComment(umlClass, FHIRPackage.eINSTANCE.getRequirements());
		if (requirements != null) {
			structureDef.setPurpose(createMarkdown(requirements));
		}
		
		
	
		

		
		if (isForFHIM) {
			
			StructureDefinitionSnapshot structureDefinitionSnapshot = FhirFactory.eINSTANCE.createStructureDefinitionSnapshot();
			
			structureDef.setSnapshot(structureDefinitionSnapshot);
			
			
			ElementDefinition elementDef = FhirFactory.eINSTANCE.createElementDefinition();
			structureDefinitionSnapshot.getElement().add(elementDef);
			String path = baseType != null ?  baseType.getName() : umlClass.getName();
			elementDef.setPath(createFhirString(path));
			elementDef.setMin(createFhirUnsignedInt(0));
			elementDef.setMax(createFhirString("*"));
			if (baseType != null && !umlClass.getName().equals(baseType.getName())) {
				elementDef.setSliceName(createFhirString(umlClass.getName()));
			}
			
			addElementDefinitions(umlClass, structureDefinitionSnapshot, elementMap);
			
		} else {

			// Add differential ElementDefinitions
			StructureDefinitionDifferential differential = FhirFactory.eINSTANCE.createStructureDefinitionDifferential();
			structureDef.setDifferential(differential);
			
			// Add profile element definition for the Class
			ElementDefinition elementDef = FhirFactory.eINSTANCE.createElementDefinition();
			differential.getElement().add(elementDef);
			String path = baseType != null ?  baseType.getName() : umlClass.getName();
			elementDef.setPath(createFhirString(path));
			elementDef.setMin(createFhirUnsignedInt(0));
			elementDef.setMax(createFhirString("*"));
			if (baseType != null && !umlClass.getName().equals(baseType.getName())) {
				elementDef.setSliceName(createFhirString(umlClass.getName()));
			}
//			ElementDefinitionType elementDefType = FhirFactory.eINSTANCE.createElementDefinitionType();
//			elementDefType.setCode(createFhirUri(baseType.getName()));
//			elementDef.getType().add(elementDefType);
//			elementMap.put(umlClass, elementDef);

			// Add element definition for each Property
			addElementDefinitions(umlClass, differential, elementMap);
		}
		
		//TODO if only constrainedElement is a Class, add to first profile elementDef
		addConstraints(umlClass, elementMap);
		
		return structureDef;
	}
	
	private void addElementDefinitions(Class umlClass, StructureDefinitionDifferential differential,
			Map<NamedElement,ElementDefinition> elementMap) {
		for (Property property : umlClass.getOwnedAttributes()) {
			ElementDefinition elementDef = createElementDefinition(property);
			differential.getElement().add(elementDef);
			elementMap.put(property, elementDef);
			
			// TODO if this is first ElementDefinition, add 'definition' and 'short' from Class comments
			
			// Recursive, only if type is nested in this class, not nested class inherited from superclass.
			if (FhirModelUtil.hasNestedType(property) && property.getType().getOwner() == umlClass) {
				addElementDefinitions((Class) property.getType(), differential, elementMap);
			}
		}
	}

	private void addElementDefinitions(Class umlClass, StructureDefinitionSnapshot structureDefinitionSnapshot,
			Map<NamedElement,ElementDefinition> elementMap) {
		for (Property property : umlClass.getOwnedAttributes()) {
			ElementDefinition elementDef = createElementDefinition(property);
			
			Extension extension =  FhirFactory.eINSTANCE.createExtension();
			
			extension.setUrl("http://fhims.org/fhim/usage");
			
			
			extension.setValueString(createFhirString(  "mandatory"));
			
if (property.getLower() == 0) {
	extension.setValueString(createFhirString(  "optional"));
			}
 			elementDef.getExtension().add(extension );
			
			structureDefinitionSnapshot.getElement().add(elementDef);
			elementMap.put(property, elementDef);
			
			// TODO if this is first ElementDefinition, add 'definition' and 'short' from Class comments
			
			// Recursive, only if type is nested in this class, not nested class inherited from superclass.
			if (FhirModelUtil.hasNestedType(property) && property.getType().getOwner() == umlClass) {
				addElementDefinitions((Class) property.getType(), structureDefinitionSnapshot, elementMap);
			}
		}
	}

	
	private ElementDefinition createElementDefinition(Property property) {
		org.eclipse.mdht.uml.fhir.ElementDefinition elementDefStereotype = 
				(org.eclipse.mdht.uml.fhir.ElementDefinition) EcoreUtil.getObjectByType(
						property.getStereotypeApplications(), FHIRPackage.eINSTANCE.getElementDefinition());
		ElementDefinition elementDef = FhirFactory.eINSTANCE.createElementDefinition();
		
		Property inheritedProperty = UMLUtil.getInheritedProperty(property);

		ElementDefinitionMapping sdm  = FhirFactory.eINSTANCE.createElementDefinitionMapping();
		
//		Boolean vvv = new BooleanDt();
		
		Boolean vvv;
		Boolean ffff = FhirFactory.eINSTANCE.createBoolean();
		ffff.setValue(true);
		
		elementDef.setMustSupport(ffff ) ;
		
//		elementDef.set
		 
		
		NamedElement owner = (NamedElement)property.getOwner();
		
		String path =   owner.getName() +  getPath(property);
		sdm.setIdentity(createFhirId("fhim"));
		
		//FHIM::
		String fhimpath = "UNKNOWN";
		for (Comment comment : property.getOwnedComments()) {
			if (comment.getBody() != null && comment.getBody().startsWith("FHIM::")) {
				fhimpath = comment.getBody();
			}
			
		}
		
		sdm.setMap(createFhirString(fhimpath));
//		sdm.setUri(createFhirUri("http://onc.gov/fhim"));
//		sdm.setName(createFhirString("FHIM"));
//		ElementDefinitionMapping xxx;
		elementDef.getMapping().add(sdm);
		
		elementDef.setId(path);
		elementDef.setPath(createFhirString(path));
		
		// Add cardinality
		Integer minOccurs = null;
		Integer maxOccurs = null;
		if (inheritedProperty == null) {
			minOccurs = property.getLower();
			maxOccurs = property.getUpper();
		}
		else {
			if (inheritedProperty.getLower() != property.getLower()) {
				minOccurs = property.getLower();
			}
			if (inheritedProperty.getUpper() != property.getUpper()) {
				maxOccurs = property.getUpper();
			}
			
			ElementDefinitionBase edb =  FhirFactory.eINSTANCE.createElementDefinitionBase();
			edb.setMin(createFhirUnsignedInt(inheritedProperty.getLower()));
			edb.setMax(createFhirString(inheritedProperty.getUpper() == -1 ? "*" : Integer.toString(inheritedProperty.getUpper())));
			edb.setPath(createFhirString(path));
			elementDef.setBase(edb);
		}
		
		if (minOccurs != null) {
			elementDef.setMin(createFhirUnsignedInt(minOccurs));
		}
		if (maxOccurs != null) {
			elementDef.setMax(createFhirString(maxOccurs == -1 ? "*" : Integer.toString(maxOccurs)));
		}
		
		// Add type(s)
		if (property.getType() != null && !FhirModelUtil.hasNestedType(property)) {
			TypeChoice typeChoice = (TypeChoice) EcoreUtil.getObjectByType(
					property.getStereotypeApplications(), FHIRPackage.eINSTANCE.getTypeChoice());
			if (typeChoice != null) {
				for (Classifier type : typeChoice.getTypes()) {
					ElementDefinitionType elementType = createType(type);
					elementDef.getType().add(elementType);
				}
			}
			else if (property.getType() instanceof Classifier) {
				ElementDefinitionType elementType = createType((Classifier)property.getType());
				elementDef.getType().add(elementType);
			}
		}
		
		// Add slicing
		ElementDefinitionSlicing slicing = createSlicing(property);
		if (slicing != null) {
			elementDef.setSlicing(slicing);
		}
		
		// Add default or fixed values
		if (property.getDefault() != null && property.getDefault().length() > 0 && property.getType() != null) {
			String typeName = upperCaseName(property.getType());
			
			String elementNamePrefix = property.isReadOnly() ? "fixed" : "default";
			String elementName = elementNamePrefix + typeName;
			EStructuralFeature feature = elementDef.eClass().getEStructuralFeature(elementName);
			if (feature != null) {
				EObject valueObject = FhirFactory.eINSTANCE.create((EClass)FhirPackage.eINSTANCE.getEClassifier(typeName));
				EStructuralFeature valueFeature = valueObject.eClass().getEStructuralFeature("value");
				valueObject.eSet(valueFeature, property.getDefault());
				elementDef.eSet(feature, valueObject);
			}
			else {
				System.err.println(property.getQualifiedName() + " -- Cannot find feature name: " 
						+ elementName + " for type: " + typeName);
			}
		}
		
		// TODO pattern, example, minValue, maxValue
		
		// Add value set binding
		ElementDefinitionBinding binding = createBinding(property);
		if (binding != null) {
			elementDef.setBinding(binding);
		}

		// Add other element metadata
		if (elementDefStereotype != null) {
//			if (elementDefStereotype.getId() != null) {
//				elementDef.setId(elementDefStereotype.getId());
//			}
			if (elementDefStereotype.getName() != null) {
				elementDef.setSliceName(createFhirString(elementDefStereotype.getName()));
			}
			if (elementDefStereotype.getIsSummary() != null) {
				elementDef.setIsSummary(createFhirBoolean(elementDefStereotype.getIsSummary()));
			}
			if (elementDefStereotype.getIsModifier() != null) {
				elementDef.setIsModifier(createFhirBoolean(elementDefStereotype.getIsModifier()));
			}
			if (elementDefStereotype.getMustSupport() != null) {
				elementDef.setMustSupport(createFhirBoolean(elementDefStereotype.getMustSupport()));
			}
		}

		String shortDescription = getComment(property, FHIRPackage.eINSTANCE.getShortDescription());
		if (shortDescription != null) {
			elementDef.setShort(createFhirString(shortDescription));
		}
		String definition = getComment(property, FHIRPackage.eINSTANCE.getDefinition());
		if (definition != null) {
			elementDef.setDefinition(createMarkdown(definition));
		}
		String requirements = getComment(property, FHIRPackage.eINSTANCE.getRequirements());
		if (requirements != null) {
			elementDef.setRequirements(createMarkdown(requirements));
		}
		String comments = getComment(property, FHIRPackage.eINSTANCE.getComments());
		if (comments != null) {
			elementDef.setComment(createMarkdown(comments));
		}
		
		return elementDef;
	}

	private void addConstraints(Class umlClass, Map<NamedElement,ElementDefinition> elementMap) {
		for (Constraint umlConstraint : umlClass.getOwnedRules()) {
			boolean isFirst = true;
			for (Element element : umlConstraint.getConstrainedElements()) {
				ElementDefinition elementDef = elementMap.get(element);
				if (elementDef != null) {
					if (isFirst) {
						isFirst = false;
						ElementDefinitionConstraint fhirConstraint = FhirFactory.eINSTANCE.createElementDefinitionConstraint();
						elementDef.getConstraint().add(fhirConstraint);
						fhirConstraint.setKey(createFhirId(umlConstraint.getName()));

						String xpath = null;
						if (umlConstraint.getSpecification() instanceof OpaqueExpression) {
							OpaqueExpression spec = (OpaqueExpression) umlConstraint.getSpecification();
							int index = 0;
							for (String lang : spec.getLanguages()) {
								if ("XPath".equals(lang)) {
									xpath = spec.getBodies().get(index);
									break;
								}
								index++;
							}
						}
						if (xpath != null) {
							fhirConstraint.setXpath(createFhirString(xpath));
						}

						Diagnostic diagnostic = (Diagnostic) EcoreUtil.getObjectByType(
							umlConstraint.getStereotypeApplications(), ValidationPackage.Literals.DIAGNOSTIC);
						if (diagnostic != null) {
							if (diagnostic.getMessage() != null) {
								fhirConstraint.setHuman(createFhirString(diagnostic.getMessage()));
							}
							if (diagnostic.getSeverity() != null) {
								ConstraintSeverity fhirSeverity = FhirFactory.eINSTANCE.createConstraintSeverity();
								fhirSeverity.setValue(ConstraintSeverityList.get(diagnostic.getSeverity().getName()));
								fhirConstraint.setSeverity(fhirSeverity);
							}
						}
						
						// Requirements comment
						String requirements = getComment(umlConstraint, FHIRPackage.eINSTANCE.getRequirements());
						if (requirements != null) {
							fhirConstraint.setRequirements(createFhirString(requirements));
						}
						
					}
					else {
						// create 'condition' reference
						elementDef.getCondition().add(createFhirId(umlConstraint.getName()));
					}
				}
				else {
					System.err.println("Cannot find ElementDefinition for: " + element);
				}
			}
		}
	}

	private String getPath(Property property) {
		List<NamedElement> pathSegments = new ArrayList<NamedElement>();
		
		pathSegments.add(property);;
		Element container = property.getOwner();
		while (container instanceof NamedElement) {
			if (container instanceof Package) {
				break;
			}
			pathSegments.add(0, ((NamedElement) container));
			container = container.getOwner();
		}
		
		String[] pathNames = new String[pathSegments.size()];
		for (int i = 0; i < pathSegments.size(); i++) {
			NamedElement pathSegment = pathSegments.get(i);
			
			// Add root ElementDefinition
			if (i == 0) {
				// This must be a Class for top-level classifier
				Classifier constrainedType = getCoreBaseType((Classifier)pathSegment);
				pathNames[i] =  constrainedType != null ? constrainedType.getName() : "";
				continue;
			}

			/*
			 * Add path for all properties, including nested classes.
			 */
			Property pathSegmentProperty = null;
			Property constrainedProperty = null;
			
			String pathSegmentName = null;
			if (pathSegment instanceof Classifier && ((Classifier)pathSegment).getOwner() instanceof Class) {
				// Nested class. Find property from containing class that has this class as its type.
				Classifier nestedClass = (Classifier) pathSegment;
				Class nestingClass = (Class) nestedClass.getOwner();
				Property referencingProperty = nestingClass.getAttribute(null, nestedClass);
				
				pathSegmentProperty = referencingProperty;
				constrainedProperty = getConstrainedProperty(referencingProperty);
				
			}
			else if (pathSegment instanceof Property) {
				pathSegmentProperty = (Property) pathSegment;
				constrainedProperty = getConstrainedProperty(((Property)pathSegment));
			}

			if (constrainedProperty != null) {
				if (constrainedProperty.getName().endsWith("[x]")) {
					pathSegmentName = getWildcardPropertyName(pathSegmentProperty, constrainedProperty.getName());
				}
				else {
					pathSegmentName = constrainedProperty.getName();
				}
			}
			else {
				pathSegmentName = pathSegmentProperty.getName();
			}
			pathNames[i] = pathSegmentName;
		}

		StringBuffer path = new StringBuffer();
		for (int i = 0; i < pathNames.length; i++) {
			path.append(i>0 ? "." : "");
			path.append(pathNames[i]);
		}
		return path.toString();
	}

	private ElementDefinitionType createType(Classifier type) {
		ElementDefinitionType elementDefType = FhirFactory.eINSTANCE.createElementDefinitionType();
		Classifier elementType = null;
		if (modelIndexer.isCoreDataType(type)) {
			elementType = type;
		}
		else if (FhirModelUtil.isKindOf(type, RESOURCE_CLASS_NAME)) {
			elementType = modelIndexer.getStructureDefinitionForId(REFERENCE_CLASS_NAME);
		}
		else {
			elementType = getCoreBaseType(type);
		}
		
		if (elementType == null ) {
			elementType = type;
		}
		elementDefType.setCode(createFhirUri(elementType.getName()));
		
		if (!type.equals(elementType)) {
			org.eclipse.mdht.uml.fhir.StructureDefinition structureDefStereotype = FhirModelUtil.getStructureDefinition(type);
			if (structureDefStereotype != null) {
				//TODO if target is a reference, setTargetProfile()
				
			 
				elementDefType.setCode(createFhirUri(structureDefStereotype.getUri()));
			}
		}
		return elementDefType;
	}

	private Uri getStructureDefinitionUri(Classifier umlClass) {
		Uri uri = null;
		org.eclipse.mdht.uml.fhir.StructureDefinition structureDefStereotype = FhirModelUtil.getStructureDefinition(umlClass);
		if (structureDefStereotype != null && structureDefStereotype.getUri() != null) {
			uri = FhirFactory.eINSTANCE.createUri();
			uri.setValue(structureDefStereotype.getUri());
		}
		
		return uri;
	}
	
	private Classifier getCoreBaseType(Classifier profileClass) {
		return modelIndexer.getCoreBaseType(profileClass);
	}
	
	private Property getConstrainedProperty(Property property) {
		Property baseProperty = null;
		Classifier baseType = getCoreBaseType((Classifier)property.getOwner());
		if (baseType != null) {
			baseProperty = baseType.getAttribute(property.getName(), null);
		}

		if (baseProperty == null) {
			for (Property redefined : property.getRedefinedProperties()) {
				baseProperty = getConstrainedProperty(redefined);
				break;
			}
		}
		if (baseProperty == null) {
			for (Property subsetted : property.getSubsettedProperties()) {
				baseProperty = getConstrainedProperty(subsetted);
				break;
			}
		}
		
		return baseProperty;
	}

	/**
	 * 
	 * - baseProperty is wildcard
	 * - does NOT have TypeChoice, or only one member
	 * - get core data type for property.getType() (not for constrained type)
	 * - strip [x] and append upper case core data type name
	 */
	private String getWildcardPropertyName(Property property, String wildcardName) {
		boolean singleType = true;
		TypeChoice typeChoice = (TypeChoice) EcoreUtil.getObjectByType(
				property.getStereotypeApplications(), FHIRPackage.eINSTANCE.getTypeChoice());
		if (typeChoice != null && typeChoice.getTypes().size() > 1) {
			singleType = false;
		}
		Classifier coreDataType = modelIndexer.getCoreBaseType((Classifier)property.getType());
		
		if (wildcardName == null || coreDataType != null || !singleType) {
			return property.getName();
		}
		
		String name = wildcardName.endsWith("[x]") ? wildcardName.substring(0, wildcardName.length()-2) : wildcardName;
		String typeName = upperCaseName(property.getType());
		name += typeName;
		
		return name;
	}
	
	private String upperCaseName(NamedElement element) {
		String typeName = element.getName();
		if (typeName != null) {
		StringBuffer camelCaseNameBuffer = new StringBuffer();
		camelCaseNameBuffer.append(typeName.substring(0, 1).toUpperCase());
		camelCaseNameBuffer.append(typeName.substring(1));
		typeName = camelCaseNameBuffer.toString();
		return typeName;
		}
		return "NULL";
	}

	private ElementDefinitionBinding createBinding(Property property) {
		ElementDefinitionBinding binding = null;
		
		org.eclipse.mdht.uml.fhir.ValueSetBinding bindingStereotype = 
				(org.eclipse.mdht.uml.fhir.ValueSetBinding) EcoreUtil.getObjectByType(
						property.getStereotypeApplications(), FHIRPackage.eINSTANCE.getValueSetBinding());
		if (bindingStereotype != null) {
			binding = FhirFactory.eINSTANCE.createElementDefinitionBinding();
			if (bindingStereotype.getStrength() != null) {
				BindingStrength strength = FhirFactory.eINSTANCE.createBindingStrength();
				strength.setValue(BindingStrengthList.get(bindingStereotype.getStrength().getName()));
				binding.setStrength(strength);
			}
			
			if (bindingStereotype.getValueSetReference() != null) {
Canonical canonical = FhirFactory.eINSTANCE.createCanonical();
canonical.setValue(bindingStereotype.getValueSetReference().getUri());
				//				Reference reference = FhirFactory.eINSTANCE.createReference();
//				reference.setReference(createFhirString(bindingStereotype.getValueSetReference().getUri()));
				binding.setValueSet(canonical);
			}
			
			if (bindingStereotype.getValueSetUri() != null) {
				
				Canonical canonical = FhirFactory.eINSTANCE.createCanonical();
				canonical.setValue(bindingStereotype.getValueSetUri());

				binding.setValueSet(canonical);
			}

			if (bindingStereotype.getDescription() != null) {
				binding.setDescription(createFhirString(bindingStereotype.getDescription()));
			}
		}
		
		return binding;
	}

	private ElementDefinitionSlicing createSlicing(Property property) {
		ElementDefinitionSlicing slicing = null;
		
		org.eclipse.mdht.uml.fhir.ElementSlicing slicingStereotype = 
				(org.eclipse.mdht.uml.fhir.ElementSlicing) EcoreUtil.getObjectByType(
						property.getStereotypeApplications(), FHIRPackage.eINSTANCE.getElementSlicing());
		if (slicingStereotype != null) {
			slicing = FhirFactory.eINSTANCE.createElementDefinitionSlicing();
			
			for (String discriminator : slicingStereotype.getDiscriminators()) {
				ElementDefinitionDiscriminator fhirElementDefinitionDiscriminator = FhirFactory.eINSTANCE.createElementDefinitionDiscriminator();
				fhirElementDefinitionDiscriminator.setPath(createFhirString(discriminator));
				slicing.getDiscriminator().add(fhirElementDefinitionDiscriminator);
			}
			if (slicingStereotype.getRules() != null) {
				SlicingRules slicingRules = FhirFactory.eINSTANCE.createSlicingRules();
				slicingRules.setValue(SlicingRulesList.get(slicingStereotype.getRules().getName()));
				slicing.setRules(slicingRules);
			}
			if (slicingStereotype.getOrdered() != null) {
				slicing.setOrdered(createFhirBoolean(slicingStereotype.getOrdered()));
			}
			if (slicingStereotype.getDescription() != null) {
				slicing.setDescription(createFhirString(slicingStereotype.getDescription()));
			}
		}
		
		return slicing;
	}

	private String getComment(Element element, EClass eClass) {
		String text = null;
		for (Comment comment : element.getOwnedComments()) {
			EObject stereotype = (EObject) EcoreUtil.getObjectByType(
					comment.getStereotypeApplications(), eClass);
			if (stereotype != null && stereotype.eClass().equals(eClass)) {
				text = comment.getBody();
				break;
			}
		}
		
		return text;
	}
	
	private Id createFhirId(String value) {
		Id id = FhirFactory.eINSTANCE.createId();
		id.setValue(value);
		return id;
	}

	private Uri createFhirUri(String value) {
		Uri uri = FhirFactory.eINSTANCE.createUri();
		uri.setValue(value);
		return uri;
	}

	private org.hl7.fhir.String createFhirString(String value) {
		org.hl7.fhir.String fhirString = FhirFactory.eINSTANCE.createString();
		fhirString.setValue(value);
		return fhirString;
	}

	private Markdown createMarkdown(String value) {
		Markdown markdown = FhirFactory.eINSTANCE.createMarkdown();
		markdown.setValue(value);
		return markdown;
	}

	private org.hl7.fhir.Boolean createFhirBoolean(boolean value) {
		org.hl7.fhir.Boolean fhirBoolean = FhirFactory.eINSTANCE.createBoolean();
		fhirBoolean.setValue(value);
		return fhirBoolean;
	}

	private org.hl7.fhir.Integer createFhirInteger(int value) {
		org.hl7.fhir.Integer fhirInteger = FhirFactory.eINSTANCE.createInteger();
		fhirInteger.setValue(value);
		return fhirInteger;
	}
	
	private UnsignedInt createFhirUnsignedInt(int value) {
		UnsignedInt fhirUnsignedInt = FhirFactory.eINSTANCE.createUnsignedInt();
		fhirUnsignedInt.setValue(BigInteger.valueOf(value));
		return fhirUnsignedInt;
	}

	private org.hl7.fhir.Code createFhirCode(String value) {
		org.hl7.fhir.Code fhirCode = FhirFactory.eINSTANCE.createCode();
		fhirCode.setValue(value);
		return fhirCode;
	}

	private org.hl7.fhir.DateTime createFhirDateTime(XMLGregorianCalendar value) {
		org.hl7.fhir.DateTime fhirDate = FhirFactory.eINSTANCE.createDateTime();
		fhirDate.setValue(value);
		return fhirDate;
	}

	private org.hl7.fhir.DateTime createFhirDateTimeNow() {
		try {
			GregorianCalendar cal = new GregorianCalendar();
			cal.setTime(new Date());
			//TODO only YYYY-MM-DD
			XMLGregorianCalendar xmlCal = DatatypeFactory.newInstance().newXMLGregorianCalendar(cal);
			return createFhirDateTime(xmlCal);
			
		} catch (DatatypeConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

	private Reference createReference(Property property) {
		Reference reference = FhirFactory.eINSTANCE.createReference();
		// TODO
		return reference;
	}
}
