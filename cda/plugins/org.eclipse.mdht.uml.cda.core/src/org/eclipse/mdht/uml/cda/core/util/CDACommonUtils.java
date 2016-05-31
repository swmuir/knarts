/**
 * Copyright: NEHTA 2016
 * Author: Joerg Kiegeland, Distributed Models Pty Ltd
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.mdht.uml.cda.core.util;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.WeakHashMap;

import org.apache.commons.lang.StringUtils;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.mdht.uml.cda.core.profile.CDAFactory;
import org.eclipse.mdht.uml.cda.core.profile.Inline;
import org.eclipse.mdht.uml.cda.core.profile.LogicalConstraint;
import org.eclipse.mdht.uml.cda.core.profile.PropertyValidation;
import org.eclipse.mdht.uml.cda.core.profile.SeverityKind;
import org.eclipse.mdht.uml.cda.core.profile.TextValue;
import org.eclipse.mdht.uml.common.UmlPlugin;
import org.eclipse.mdht.uml.common.util.NamedElementComparator;
import org.eclipse.mdht.uml.common.util.NamedElementUtil;
import org.eclipse.mdht.uml.common.util.PropertyComparator;
import org.eclipse.mdht.uml.common.util.PropertyList;
import org.eclipse.mdht.uml.term.core.profile.CodeSystemConstraint;
import org.eclipse.mdht.uml.term.core.profile.ValueSetCode;
import org.eclipse.mdht.uml.term.core.profile.ValueSetVersion;
import org.eclipse.mdht.uml.term.core.util.ITermProfileConstants;
import org.eclipse.mdht.uml.term.core.util.TermProfileUtil;
import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Enumeration;
import org.eclipse.uml2.uml.EnumerationLiteral;
import org.eclipse.uml2.uml.Generalization;
import org.eclipse.uml2.uml.InstanceValue;
import org.eclipse.uml2.uml.MultiplicityElement;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.TypedElement;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.VisibilityKind;

/**
 * Various utility methods around CDA
 */
public class CDACommonUtils {

	private static final String PLUGIN = "org.eclipse.mdht.uml.cda.core";

	// savings: from 664ms to 50ms
	public static Map<NamedElement, String> propertyStepCache = new WeakHashMap<NamedElement, String>();

	private static Map<Property, CodeSystemConstraint> cachedCodeSystemConstraint = new WeakHashMap<Property, CodeSystemConstraint>();

	private static Map<Property, Property> cacheCDAProperty = new WeakHashMap<Property, Property>();

	private static Map<Property, TextValue> cacheTextValue = new WeakHashMap<Property, TextValue>();

	private static Map<Class, String> cacheTemplateId = new WeakHashMap<Class, String>();

	private static Map<Classifier, Classifier> cacheCDAType = new WeakHashMap<Classifier, Classifier>();

	private static Map<Classifier, Integer> cacheMainSection = new WeakHashMap<Classifier, Integer>();

	/**
	 * Map from a class to the list of classes which are in the same main section of the PDF file as well, or to <code>null</code> if the class is not
	 * directly contained in a main section (i.e. nested classes)
	 */
	private static Map<EObject, SortedSet<Class>> cacheCDAContents = new WeakHashMap<EObject, SortedSet<Class>>();

	private static Map<Element, Boolean> cacheDatatypeModel = new WeakHashMap<Element, Boolean>();

	private static Map<NamedElement, String> cacheBusinessName = new WeakHashMap<NamedElement, String>();

	public static Map<EObject, EObject> cachePropertyForClass = new WeakHashMap<EObject, EObject>();

	public static Map<EObject, EObject> cacheClassForProperty = cachePropertyForClass;

	public static Collection<EObject> getAllContents(Resource res) {
		return getAllContents(res, EObject.class);
	}

	/**
	 * @param res
	 * @param clazz
	 * @return all objects in the given resource of the given type
	 */
	@SuppressWarnings("unchecked")
	public static <T extends EObject> Collection<T> getAllContents(Collection<?> res, java.lang.Class<T> clazz) {
		TreeIterator<Object> it = EcoreUtil.getAllContents(res, true);
		Collection<T> result = new ArrayList<T>();
		while (it.hasNext()) {
			Object o = it.next();
			if (o != null && clazz.isAssignableFrom(o.getClass())) {
				result.add((T) o);
			}
		}
		return result;
	}

	public static <T extends EObject> Collection<T> getAllContents(Resource res, java.lang.Class<T> clazz) {
		return getAllContents(Arrays.asList(res), clazz);
	}

	public static Collection<EObject> getAllContents(Collection<?> res) {
		return getAllContents(res, EObject.class);
	}

	/**
	 * @param content
	 * @param file
	 * @throws IOException
	 */
	public static void stringToFile(String content, File file) throws IOException {
		file.getParentFile().mkdirs();
		FileOutputStream out = new FileOutputStream(file);
		out.write(content.getBytes(Charset.forName("UTF-8")));
		out.close();
	}

	public static String stringFromFile(File sourceLocation) throws IOException {
		return toString(new FileInputStream(sourceLocation));
	}

	public static String toString(InputStream in) throws IOException {
		ByteArrayOutputStream out = new ByteArrayOutputStream();

		byte[] buf = new byte[1024];
		int len;
		while ((len = in.read(buf)) > 0) {
			out.write(buf, 0, len);
		}
		in.close();
		out.close();

		return new String(out.toByteArray(), "UTF-8");
	}

	/**
	 * Writes a file only if the not-generated comment is not included
	 *
	 * @param content
	 * @param file
	 * @throws IOException
	 */
	public static void stringToFileIfGenerated(String content, File file) throws IOException {
		if (!(file.exists() && stringFromFile(file).contains("<!--NOT GENERATED-->"))) {
			stringToFile(content, file);
		}
	}

	/**
	 * Removes all XML tags
	 *
	 * @param text
	 * @return
	 */
	public static String withoutTags(String text) {
		int i;
		int i2;
		while ((i = text.indexOf("<")) != -1 && (i2 = text.indexOf(">")) > i) {
			text = text.substring(0, i) + text.substring(i2 + 1);
		}
		return text;
	}

	/**
	 * @param result
	 * @param element
	 * @param appendNestedConformanceRules
	 * @return
	 */
	static public String getConformance(Element element) {
		return getConformance(element, true, false);
	}

	/**
	 * @param result
	 * @param element
	 * @param appendNestedConformanceRules
	 * @return
	 */
	static public String getConformance(Element element, boolean markup, boolean appendNestedConformanceRules) {
		String result = null;
		if (element instanceof Property) {
			Property property = (Property) element;
			result = CDAModelUtil.computeConformanceMessage(property, markup, null, appendNestedConformanceRules);
		}
		if (element instanceof Constraint) {
			Constraint constraint = (Constraint) element;
			result = CDAModelUtil.computeConformanceMessage(constraint, markup);
		}
		if (element instanceof Class) {
			Class class1 = (Class) element;
			Property property = getOverallPropertyReference(class1);
			if (property != null) {
				result = CDAModelUtil.computeConformanceMessage(property, markup, null, appendNestedConformanceRules);
			} else {
				result = "";
			}
		}
		if (element instanceof EnumerationLiteral) {
			EnumerationLiteral enumerationLiteral = (EnumerationLiteral) element;
			ValueSetCode code = TermProfileUtil.getValueSetCode(enumerationLiteral);
			if (code != null) {
				result = code.getConceptName();
			}
		}
		if (element instanceof Enumeration) {
			Enumeration enumeration = (Enumeration) element;
			ValueSetVersion version = TermProfileUtil.getValueSetVersion(enumeration);
			if (version != null) {
				result = version.getIdentifier();
			}
		}
		return result;
	}

	/**
	 * @param element
	 * @param fullSection
	 *            whether to return the full section number or only the last digit
	 * @return
	 */
	static public String getPDFSection(Element element, boolean fullSection, boolean level2) {
		int incr = Integer.getInteger("MDHT_SECTION_INCREMENT", 0);
		if (incr == 0 && element.eResource() != null && element.eResource().getResourceSet() != null) {
			Resource resource = element.eResource().getResourceSet().getResources().get(0);
			String uri = resource.getURI().toString();
			int index = uri.indexOf(".model/");
			if (index != -1) {
				try {
					uri = uri.substring(0, index) + ".doc/dita/spec-book.ditamap";
					InputStream inputStream = new URL(uri).openConnection().getInputStream();
					String specBook = CDACommonUtils.toString(inputStream);
					index = specBook.indexOf("<chapter format=\"ditamap\" href=\"content/content.ditamap\"/>");
					if (index != -1) {
						incr = StringUtils.countMatches(specBook.substring(0, index), "<chapter") - 1;
					}
				} catch (Exception e) {
					System.err.println(e.getMessage());
				}
			}
		}
		String result = "";
		EObject eObject = element;
		while (eObject != null && !(eObject instanceof Package)) {
			String step = "?";
			if (eObject instanceof Class) {
				Class class1 = (Class) eObject;
				int mainSection = getMainSection(class1);
				if (mainSection != -1) {
					step = (mainSection + incr) + "." + (getCDAContents(class1).indexOf(class1) + 1);
					if (!fullSection || level2) {
						return step + " " + CDACommonUtils.getBusinessName(class1);
					} else if (fullSection) {
						result = step + "." + result;
						break;
					}
				} else {
					Property property = getOverallPropertyReference(class1);
					if (property != null) {
						step = getPropertyStep(getClassReference(property), property);

					}
				}
			} else if (eObject instanceof Constraint &&
					CDACommonUtils.getParentingProperty((Constraint) eObject) != null) {
				Property prop = CDACommonUtils.getParentingProperty((Constraint) eObject);
				if (prop.getType() instanceof Class && getMainSection((Class) prop.getType()) == -1) {
					Class class1 = (Class) prop.getType();
					step = getPropertyStep(class1, class1);
				} else {
					step = getCustomizedBulletItem(prop, 0);
				}
				eObject = prop;
				result = step + "." + result;
				continue;
			} else if (eObject instanceof NamedElement && getContainerReference(eObject) instanceof Class) {
				NamedElement property = (NamedElement) eObject;
				Class parentClass = (Class) getContainerReference(eObject);
				step = getPropertyStep(parentClass, property);
			} else if (eObject instanceof Enumeration && getContainerReference(eObject) instanceof Package) {
				Package package1 = (Package) getContainerReference(eObject);
				Enumeration enumeration = (Enumeration) eObject;
				return "6." + (package1.getPackagedElements().indexOf(eObject) + 1) + " " + enumeration.getName();
			} else if (eObject instanceof EnumerationLiteral) {
				EnumerationLiteral enumerationLiteral = (EnumerationLiteral) eObject;
				return enumerationLiteral.getName();
			}
			if (!fullSection) {
				return step + ".";
			}
			result = step + "." + result;
			if (!fullSection) {
				return step;
			}
			eObject = getContainerReference(eObject);
		}
		return result.endsWith(".")
				? result.substring(0, result.length() - 1)
				: result;
	}

	/**
	 * @param class1
	 *            the class to retrieve the section number for
	 * @param package1
	 *            the package the given class is contained
	 * @return if class is not nested in the PDF file, then returns its section number, otherwise returns -1
	 */
	private static int getMainSection_(Class class1) {
		if (CDAModelUtil.isDisplayInline(class1) || CDACommonUtils.getCDAType(class1) == null) {
			return -1;
		}
		if (CDACommonUtils.isClinicalDocument(class1)) {
			return 2;
		}
		if (CDACommonUtils.isSection(class1)) {
			return 3;
		}
		if (CDACommonUtils.isClinicalStatement(class1)) {
			return 4;
		}
		Resource res = class1.eResource();
		if (res != null && res.getResourceSet() != null && res.getResourceSet().getResources().get(0) == res) {
			return 5;
		}
		return 6;
	}

	public static int getMainSection(Class class1) {
		Integer result = cacheMainSection.get(class1);
		if (result == null) {
			cacheMainSection.put(class1, result = getMainSection_(class1));
		}
		return result;
	}

	/**
	 * @param property
	 * @return in case the element is associated with a section, returns the associated class of the parent section, otherwise returns the containing
	 *         class
	 */
	public static Class getClassReference(EObject property) {
		if (cacheClassForProperty.get(property) instanceof Class) {
			return (Class) cacheClassForProperty.get(property);
		}
		return (Class) property.eContainer();
	}

	/**
	 * @param property
	 * @return in case the element is associated with a section, returns the associated element of the parent section, otherwise returns the container
	 */
	private static EObject getContainerReference(EObject child) {
		if (cacheClassForProperty.get(child) instanceof Class) {
			return cacheClassForProperty.get(child);
		}
		if (cachePropertyForClass.get(child) != null) {
			return getContainerReference(cachePropertyForClass.get(child));
		}
		return child.eContainer();
	}

	static public String getPDFSection(Element element, boolean fullSection) {
		return getPDFSection(element, fullSection, false);
	}

	/**
	 * As only the property of an association is processed, redirect association to the corresponding MDHT property
	 *
	 * @param dataComponent
	 * @return
	 */
	public static NamedElement getMDHTRepresentative(NamedElement dataComponent) {
		if (dataComponent instanceof Association) {
			Association association = (Association) dataComponent;
			if (association.getMemberEnds().size() != 0) {
				return association.getMemberEnds().get(0);
			}
		}
		return dataComponent;
	}

	/**
	 * @param package1
	 * @param typeName
	 * @return all packaged elements in the given package having the given type string
	 */
	public static List<Class> getCDAContents(Class class1) {
		if (cacheCDAContents.get(class1) != null) {
			return new ArrayList<Class>(cacheCDAContents.get(class1));
		}
		return Collections.emptyList();
	}

	/**
	 * Checks recursively all classes associated to umlClass for inclusion in the main sections of the PDF file
	 *
	 * @param source
	 *            a top level class of the main UML model (esp. not a participation class)
	 * @param umlClass
	 * @param sets
	 *            five sorted sets for the main sections "Document templates", ..., "Class References"
	 * @return <code>false</code> if umlClass is not required to be checked for inclusion in the main sections, otherwise <code>true</code>
	 */
	static private boolean checkClassReferences(Class source, Class umlClass, List<SortedSet<Class>> sets) {
		if (cacheCDAContents.containsKey(umlClass) || !inSameModel(source, umlClass)) {
			return false;
		}

		int section = getMainSection(umlClass) - 2;
		if (section >= 0) {
			sets.get(section).add(umlClass);
			cacheCDAContents.put(umlClass, sets.get(section));
		} else {
			cacheCDAContents.put(umlClass, null);
		}

		// Loop over properties and generalizations
		for (Property property : umlClass.getOwnedAttributes()) {
			if (property.getType() instanceof Class && checkClassReferences(source, (Class) property.getType(), sets)) {
			}
		}

		for (Generalization generalization : umlClass.getGeneralizations()) {
			if (generalization.getGeneral() instanceof Class &&
					checkClassReferences(source, (Class) generalization.getGeneral(), sets)) {
			}
		}

		return true;
	}

	/**
	 * @param class1
	 * @return the property having the given class as type
	 */
	public static Property getPropertyReference(Class class1) {
		if (class1.eContainer() instanceof Class) {
			Class parentClass = (Class) class1.eContainer();
			for (Property property : parentClass.getAttributes()) {
				if (property.getType() == class1) {
					return property;
				}
			}
		}
		return null;
	}

	/**
	 * @param parentClass
	 * @param focusedProperty
	 * @return
	 */
	public static String getPropertyStep(Class umlClass, NamedElement focusedProperty) {
		String result = propertyStepCache.get(focusedProperty);
		if (result != null) {
			return result;
		}
		List<Property> allProperties = new ArrayList<Property>();
		int offset = 0;
		if (umlClass.eContainer() instanceof Package) {
			// see TransformClassContent#appendConformanceRules()

			if (CDACommonUtils.getTemplateId(umlClass) != null) {
				offset++;
			}
			if (!CDAModelUtil.isInlineClass(umlClass)) {
				for (Generalization generalization : umlClass.getGeneralizations()) {
					Classifier general = generalization.getGeneral();
					if (!RIMModelUtil.isRIMModel(general) && !CDACommonUtils.isCDAModel(general) &&
							!CDACommonUtils.isDatatypeModel(general)) {
						String message = CDAModelUtil.computeConformanceMessage(generalization, true);
						if (message.length() > 0) {
							offset++;
						}
					}
				}
			}

			allProperties = new ArrayList<Property>(umlClass.getOwnedAttributes());
			List<Property> allAttributes = new ArrayList<Property>();

			for (Property property : allProperties) {
				if (CDAModelUtil.isXMLAttribute(property)) {
					allAttributes.add(property);
				}

				// Check to see if the property is part of a logical constraint - if so do not create process as a property

			}

			for (Constraint constraint : umlClass.getOwnedRules()) {
				LogicalConstraint logicConstraint = CDAProfileUtil.getLogicalConstraint(constraint);
				if (logicConstraint != null) {
					for (Element constrainedElement : constraint.getConstrainedElements()) {
						if (constrainedElement instanceof Property) {
							allProperties.remove(constrainedElement);
						}
					}
				}
			}

			allProperties.removeAll(allAttributes);
			Collections.sort(allAttributes, new NamedElementComparator());
			Collections.sort(allProperties, new PropertyComparator());

			allProperties.addAll(0, allAttributes);
		} else {
			// see CDAModelUtil#appendConformanceRules()

			PropertyList propertyList = new PropertyList(umlClass, CDAModelUtil.isInlineClass(umlClass));

			// XML attributes
			for (Property property : propertyList.getAttributes()) {
				if (!CDACommonUtils.isCDAModel(umlClass) && !CDACommonUtils.isCDAModel(property) &&
						!CDACommonUtils.isDatatypeModel(property)) {
					if (!CDAModelUtil.hasOwnPDFSection(property)) {
						continue;
					}
					allProperties.add(property);
				}
			}
			// XML elements
			for (Property property : propertyList.getAssociationEnds()) {
				if (!CDACommonUtils.isCDAModel(umlClass) && !CDACommonUtils.isCDAModel(property) &&
						!CDACommonUtils.isDatatypeModel(property)) {
					allProperties.add(property);
				}
			}
		}
		for (Property prop : allProperties) {
			propertyStepCache.put(prop, getCustomizedBulletItem(umlClass, offset));
			offset++;
		}
		for (Constraint constraint : umlClass.getOwnedRules()) {
			if (constraint.getConstrainedElements().size() == 1 &&
					constraint.getConstrainedElements().get(0) == umlClass && constraint.getName() != null &&
					!constraint.getName().endsWith("TemplateId") || constraint.getConstrainedElements().size() > 1) {
				String constraintItem = getCustomizedBulletItem(umlClass, offset);
				propertyStepCache.put(constraint, constraintItem);
				offset++;

				// some properties get nested into a logical constaint as opposed to the containing class
				LogicalConstraint logicConstraint = CDAProfileUtil.getLogicalConstraint(constraint);
				if (logicConstraint != null) {
					int propertyIndex = 0;
					for (Element constrainedElement : constraint.getConstrainedElements()) {
						if (constrainedElement instanceof Property) {
							Property property = (Property) constrainedElement;
							String propertyItem = getCustomizedBulletItem(constraint, propertyIndex);
							propertyStepCache.put(property, constraintItem + "." + propertyItem);
							propertyIndex++;
						}
					}
				}
			}
		}

		// store single appended item to the class, that could usually be a constraint
		propertyStepCache.put(umlClass, getCustomizedBulletItem(umlClass, offset));

		return propertyStepCache.get(focusedProperty);
	}

	/**
	 *
	 * Examines whether the given constraint is hand-crafted (i.e. has a severity applied and is not auto-generated by MDHT) and constrains a single
	 * property (thus, the constraint would be listed in the PDF file as new sub-section to the property and to its containing context class)
	 *
	 * @param constraint
	 * @return the property it is subordinated to, or <code>null</code>
	 */
	static public Property getParentingProperty(Constraint constraint) {

		if (constraint.getConstrainedElements().size() == 1 &&
				constraint.getConstrainedElements().get(0) instanceof Property) {

			Property property = (Property) constraint.getConstrainedElements().get(0);

			Stereotype stereotype = CDAProfileUtil.getAppliedCDAStereotype(
				constraint, ICDAProfileConstants.CONSTRAINT_VALIDATION);

			if (stereotype != null) {
				return property;
			}
		}

		return null;
	}

	/**
	 * @param umlClass
	 *            used to determine the nesting level of the element - in most cases a Class - but can also be a Constraint as properties are nested
	 *            within a constraint and not its containing class within the PDF file
	 * @param index
	 *            index of the conformance rule starting from zero in the level designated by the given class
	 * @return
	 */
	public static String getCustomizedBulletItem(Element umlClass, int index) {
		int level = 0;
		EObject eObject = umlClass;
		while (eObject != null && !(eObject instanceof Package)) {
			if (eObject instanceof Class && getMainSection((Class) eObject) != -1) {
				break;
			}
			EObject constrainedProperty = cachePropertyForClass.get(eObject);
			eObject = getContainerReference(eObject);
			if (constrainedProperty instanceof Property && eObject instanceof Class) {
				Class class1 = (Class) eObject;
				for (Constraint constraint : class1.getOwnedRules()) {
					if (constraint.getConstrainedElements().contains(constrainedProperty) &&
							CDAProfileUtil.getLogicalConstraint(constraint) != null) {
						level++;
						break;
					}
				}

			}
			level++;
		}
		level = level % 3;
		if (level == 1) {
			String[] romans = new String[] { "i", "ii", "iii", "iv", "v", "vi", "vii", "viii", "ix", "x" };
			return StringUtils.repeat("x", index / 10) + romans[index % 10];
		}
		if (level == 2) {
			return "" + (char) ('a' + index);
		}
		return "" + (index + 1);
	}

	/**
	 * Patch resource set to recognize pathmaps for even workspace projects.
	 *
	 * @param rset
	 */
	public static void patchResourceSet(ResourceSet rset) {
		UmlPlugin.computeModelPathMapExtensions();
		rset.getURIConverter().getURIMap().putAll(EcorePlugin.computePlatformURIMap(false));
	}

	/**
	 * Returns a property of the passed clazz that has a class type defining a predicate to qualify instances of the passed clazz
	 *
	 * @param clazz
	 * @return
	 */
	public static Property getPropertyForTypeCheck(Class clazz) {
		if (CDACommonUtils.isClinicalDocument(clazz)) {
			return null;
		}
		if (CDACommonUtils.getTemplateId(clazz) != null) {
			return null;
		}
		Inline inline = CDAProfileUtil.getInline(clazz);
		if (inline != null && inline.getFilter() != null) {
			return null;
		}
		Property containerProperty = null;
		EObject predicate = null;
		for (Property property : allAttributes(clazz)) {
			if (getCDAProperty(property) != null && property.getType() instanceof Class && property.lowerBound() != 0) {
				EObject oldPredicate = predicate;
				predicate = getPredicateForCodeOrClasscodeCheck(predicate, (Class) property.getType());
				if (oldPredicate != predicate) {
					containerProperty = property;
				}
			}
		}
		return containerProperty;
	}

	public static boolean isClinicalDocument(Type templateClass) {
		return isCDAType(templateClass, "ClinicalDocument");
	}

	public static boolean isSection(Type templateClass) {
		return isCDAType(templateClass, "Section");
	}

	public static boolean isOrganizer(Type templateClass) {
		return isCDAType(templateClass, "Organizer");
	}

	public static boolean isEntry(Type templateClass) {
		return isCDAType(templateClass, "Entry");
	}

	public static boolean isClinicalStatement(Type templateClass) {
		return CDAModelUtil.isClinicalStatement(templateClass);
	}

	public static Property getLeafPropertyForTypeCheck(Class clazz) {
		EObject predicate = getPredicateForTypeCheck(clazz);
		if (predicate instanceof Property) {
			return (Property) predicate;
		} else if (predicate instanceof CodeSystemConstraint) {
			return ((CodeSystemConstraint) predicate).getBase_Property();
		} else {
			return null;
		}
	}

	public static EObject getPredicateForTypeCheck(Class clazz) {
		Inline inline = CDAProfileUtil.getInline(clazz);
		if (inline != null && inline.getFilter() != null) {
			return inline;
		}
		if (CDACommonUtils.isClinicalDocument(clazz)) {
			return null;
		}
		if (CDACommonUtils.getTemplateId(clazz) != null) {
			return clazz;
		}
		EObject predicate = null;
		for (Property actproperty : allAttributes(clazz)) {
			if (CDACommonUtils.getCDAProperty(actproperty) != null && actproperty.getType() instanceof Class &&
					actproperty.lowerBound() != 0) {
				Class class1 = (Class) actproperty.getType();
				predicate = CDACommonUtils.getPredicateForCodeOrClasscodeCheck(predicate, class1);
			}
		}
		return predicate;
	}

	/**
	 * Returns the "predicate" suitable to qualify instances for the given class
	 *
	 * @param predicate
	 *            a previous calculated predicate that may be returned if it remains higher priority; "code" has higher priority than "classCode"
	 * @param clazz
	 * @return
	 */
	public static EObject getPredicateForCodeOrClasscodeCheck(EObject predicate, Class clazz) {
		if (CDACommonUtils.isClinicalDocument(clazz)) {
			return predicate;
		}
		if (CDACommonUtils.getTemplateId(clazz) != null) {
			return clazz;
		}
		for (Property property : allAttributes(clazz)) {
			if (property.lowerBound() == 0) {
				continue;
			}
			CodeSystemConstraint codeSystemConstraint = CDACommonUtils.getCodeSystemConstraint(property);
			if (codeSystemConstraint != null && codeSystemConstraint.getCode() != null) {
				predicate = codeSystemConstraint;
			}
			if (predicate == null && getDefault(property) != null && "classCode".equals(property.getName())) {
				predicate = property;
			}
		}
		return predicate;
	}

	public static CodeSystemConstraint getCodeSystemConstraint(Property property) {
		if (!cachedCodeSystemConstraint.containsKey(property)) {
			cachedCodeSystemConstraint.put(property, TermProfileUtil.getCodeSystemConstraint(property));
		}
		return cachedCodeSystemConstraint.get(property);
	}

	/**
	 *
	 * Just calling <code>property.getDefault()</code> may return <code>null</code> for dynamic metamodels, so better use this helper function here
	 *
	 * @param property
	 * @return
	 */
	public static String getDefault(Property property) {
		return property.getDefaultValue() instanceof InstanceValue
				? ((InstanceValue) property.getDefaultValue()).getName()
				: property.getDefault();
	}

	/**
	 * @param namedElement
	 * @return
	 */
	public static String getMultiplicityString(NamedElement namedElement) {
		NamedElement dataItem = getMDHTRepresentative(namedElement);
		if (dataItem instanceof MultiplicityElement) {
			MultiplicityElement multiplicityElement = (MultiplicityElement) dataItem;
			return multiplicityElement.getLower() + ".." + (-1 == multiplicityElement.getUpper()
					? "*"
					: multiplicityElement.getUpper());
		} else {
			return null;
		}
	}

	// copied from CDAModelUtil
	public static String getMultiplicityRange(Class template) {
		String templateId = null;
		Stereotype hl7Template = CDAProfileUtil.getAppliedCDAStereotype(template, ICDAProfileConstants.CDA_TEMPLATE);
		if (hl7Template != null && template.hasValue(hl7Template, ICDAProfileConstants.CDA_TEMPLATE_MULTIPLICITY)) {
			templateId = (String) template.getValue(hl7Template, ICDAProfileConstants.CDA_TEMPLATE_MULTIPLICITY);
		} else {
			for (Classifier parent : template.getGenerals()) {
				templateId = getMultiplicityRange((Class) parent);
				if (templateId != null) {
					break;
				}
			}
		}

		return templateId;
	}

	/**
	 * @param templateProperty
	 * @return
	 */
	public static Property getCDAProperty(Property property, Collection<ModelStatus> statuses) {
		if (!cacheCDAProperty.containsKey(property)) {
			Property cdaProperty = property;
			while (!cdaProperty.getRedefinedProperties().isEmpty()) {
				cdaProperty = cdaProperty.getRedefinedProperties().get(0);
			}
			while (!cdaProperty.getSubsettedProperties().isEmpty()) {
				cdaProperty = cdaProperty.getSubsettedProperties().get(0);
			}
			cdaProperty = CDAModelUtil.getCDAProperty(cdaProperty);
			if (cdaProperty == null) {
				for (Classifier parent : property.getClass_().allParents()) {
					for (Property inherited : parent.getAttributes()) {
						if (property.getType() != null && property.getType().conformsTo(inherited.getType()) &&
								(CDACommonUtils.isCDAModel(inherited) || CDACommonUtils.isDatatypeModel(inherited))) {
							if (cdaProperty != null) {
								if (statuses != null) {
									addStatus(
										statuses, IStatus.WARNING, PLUGIN, 12,
										"Found ambiguous CDA base properties for " + getUmlContext(property) + ": " +
												getUmlContext(cdaProperty) + " and " + getUmlContext(inherited),
										property);
								}
							} else {
								cdaProperty = inherited;
							}
						}
					}
				}
			}
			if (cdaProperty == null && statuses != null) {
				addStatus(
					statuses, IStatus.WARNING, PLUGIN, 13, "Found no CDA base property for " + getUmlContext(property),
					property);
			}
			cacheCDAProperty.put(property, cdaProperty);
		}
		return cacheCDAProperty.get(property);
	}

	public static Property getCDAProperty(Property property) {
		return getCDAProperty(property, null);
	}

	/**
	 * @param namedElement
	 * @return
	 */
	public static Type getType(NamedElement namedElement) {
		NamedElement dataItem = getMDHTRepresentative(namedElement);
		if (dataItem instanceof TypedElement) {
			TypedElement typedElement = (TypedElement) dataItem;
			if (typedElement.getType() != null) {
				return typedElement.getType();
			}
		} else if (dataItem instanceof org.eclipse.uml2.uml.Class) {
			org.eclipse.uml2.uml.Class clazz = (org.eclipse.uml2.uml.Class) dataItem;
			for (org.eclipse.uml2.uml.Class superclazz : clazz.getSuperClasses()) {
				return superclazz;
			}
		}
		return null;
	}

	/**
	 * @param namedElement
	 * @return
	 */
	public static String getTypeString(NamedElement namedElement) {
		Type cellData = getType(namedElement);
		if (cellData != null) {
			return cellData.getName();
		}
		return null;
	}

	/**
	 * @param clazz
	 * @return the property of a "predicate" for the given class
	 */
	public static Property getPropertyForCodeOrClasscodeCheck(Class clazz) {
		EObject predicate = getPredicateForCodeOrClasscodeCheck(null, clazz);
		if (predicate instanceof Property) {
			return (Property) predicate;
		} else if (predicate instanceof CodeSystemConstraint) {
			return ((CodeSystemConstraint) predicate).getBase_Property();
		} else {
			return null;
		}
	}

	public static TextValue getTextValue(Property property) {
		if (!cacheTextValue.containsKey(property)) {
			cacheTextValue.put(property, CDAProfileUtil.getTextValue(property));
		}
		return cacheTextValue.get(property);
	}

	public static String getTemplateId(Class clazz) {
		if (!cacheTemplateId.containsKey(clazz)) {
			cacheTemplateId.put(clazz, CDAModelUtil.getTemplateId(clazz));
		}
		return cacheTemplateId.get(clazz);
	}

	public static boolean isDatatypeModel(Element element) {
		if (!cacheDatatypeModel.containsKey(element)) {
			cacheDatatypeModel.put(element, CDAModelUtil.isDatatypeModel(element));
		}
		return cacheDatatypeModel.get(element);
	}

	public static boolean isCDAModel(Element element) {
		return CDAModelUtil.isCDAModel(element);
	}

	public static Classifier getCDAType(Classifier clazz) {
		if (!cacheCDAType.containsKey(clazz)) {
			Class cdaClass = CDAModelUtil.getCDAClass(clazz);
			if (cdaClass == null) {
				cdaClass = CDAModelUtil.getCDADatatype(clazz);
			}
			cacheCDAType.put(clazz, cdaClass);
		}
		return cacheCDAType.get(clazz);
	}

	public static String getBusinessName(NamedElement namedElement) {
		if (!cacheBusinessName.containsKey(namedElement)) {
			cacheBusinessName.put(namedElement, NamedElementUtil.getBusinessName(namedElement));
		}
		return cacheBusinessName.get(namedElement);
	}

	public static boolean isCDAType(Type templateClass, String typeName) {
		if (templateClass instanceof Classifier && typeName != null) {
			Classifier cdaClass = getCDAType((Classifier) templateClass);
			if (cdaClass != null && typeName.equals(cdaClass.getName())) {
				return true;
			}
		}

		return false;
	}

	public static boolean addStatus(Collection<ModelStatus> statuses, int severity, String plugin, int errorCode,
			String message, Exception e, EObject... participants) {
		ModelStatus status = new ModelStatus(severity, plugin, errorCode, message, e, participants);
		for (IStatus existingStatus : statuses) {
			if (existingStatus.getMessage().equals(status.getMessage())) {
				return false;
			}
		}
		statuses.add(status);
		return true;
	}

	public static boolean addStatus(Collection<ModelStatus> statuses, int severity, String plugin, int errorCode,
			String message, EObject... participants) {
		return addStatus(statuses, severity, plugin, errorCode, message, null, participants);
	}

	public static Property getOverallPropertyReference(Class class1) {
		if (cachePropertyForClass.get(class1) instanceof Property) {
			return (Property) cachePropertyForClass.get(class1);
		}
		return getPropertyReference(class1);
	}

	static public void buildupPropertyForClinicalDocument(Class umlClinicalDocument) {
		CDACommonUtils.cachePropertyForClass.put(umlClinicalDocument, null);
		recursePropertyPaths(umlClinicalDocument);
		List<SortedSet<Class>> sets = new ArrayList<SortedSet<Class>>();
		NamedElementComparator comparator = new NamedElementComparator();
		sets.add(new TreeSet<Class>(comparator));
		sets.add(new TreeSet<Class>(comparator));
		sets.add(new TreeSet<Class>(comparator));
		sets.add(new TreeSet<Class>(comparator));
		sets.add(new TreeSet<Class>(comparator));
		for (Class umlClass : getAllContents(umlClinicalDocument.eResource(), Class.class)) {
			checkClassReferences(umlClinicalDocument, umlClass, sets);
		}
	}

	public static boolean hasPropertyPath(Property property) {
		return CDACommonUtils.cacheClassForProperty.containsKey(property);
	}

	public static boolean inSameModel(Class a, Class b) {
		return isCDAModel(a) == isCDAModel(b) && isDatatypeModel(a) == isDatatypeModel(b);
	}

	static private void recursePropertyPaths(Class parentClass) {
		Collection<Property> allProperties = CDACommonUtils.allAttributes(parentClass);
		for (Property property : allProperties) {
			if (property.eContainer() instanceof Class && inSameModel((Class) property.eContainer(), parentClass)) {
				CDACommonUtils.cacheClassForProperty.put(property, parentClass);
			}
			if (property.getType() instanceof Class && inSameModel((Class) property.getType(), parentClass)) {
				Class nestedClass = (Class) property.getType();
				if (CDACommonUtils.cachePropertyForClass.containsKey(nestedClass)) {
					continue;
				}
				CDACommonUtils.cachePropertyForClass.put(nestedClass, property);
				recursePropertyPaths(nestedClass);
			}
		}

	}

	/**
	 * @param clazz
	 * @return an array of properties, that, starting normally from the clinical document root element, points finally to the given clazz
	 */
	public static List<Property> getPropertyPath(Class clazz) {
		List<Property> propertyPath = new ArrayList<Property>();
		EObject eObject = clazz;
		while (eObject instanceof Class) {
			Class class1 = (Class) eObject;
			Property childProperty = CDACommonUtils.getOverallPropertyReference(class1);
			if (childProperty != null) {
				eObject = getClassReference(childProperty);
				propertyPath.add(0, childProperty);
			} else {
				break;
			}
		}
		return propertyPath;
	}

	public static String getUmlContext(Property property) {
		return property.getQualifiedName();
	}

	public static String getUmlContextDoubled(Property property) {
		String result = getUmlContext(property);
		Property cdaProperty = CDACommonUtils.getCDAProperty(property);
		if (cdaProperty != null) {
			return result + " (" + getUmlContext(cdaProperty) + ")";
		}
		return result;
	}

	public static String getUmlContext(Class clazz) {
		return getUmlContext(clazz, true);
	}

	public static String getUmlContext(Class clazz, boolean abbr) {
		if (CDACommonUtils.isDatatypeModel(clazz)) {
			return "/datatypes:" + clazz.getName();
		}
		List<Property> propertyPath = CDACommonUtils.getPropertyPath(clazz);
		if (propertyPath.isEmpty()) {
			// is either clinical document itself or has no property path leading from a clinicial document
			return "/" + clazz.getName();
		}
		EObject eContainer = propertyPath.get(0).eContainer();
		StringBuilder umlContext = new StringBuilder("/" + (eContainer instanceof Class
				? ((Class) eContainer).getName()
				: "root"));
		for (Property property : propertyPath) {
			Class class1 = (Class) property.getType();
			umlContext.append("/" + property.getName());
			if (abbr && class1 != null && !(class1.eContainer() instanceof Class)) {
				umlContext.replace(0, umlContext.length(), "/" + class1.getName());
			}
		}
		return umlContext.toString();
	}

	/**
	 * Finds a attribute with the given name in the given class; note that Classifier.getAttribute(name,null) cannot find inherited "private"
	 * attributes where this methods proves useful
	 *
	 * @param cls
	 * @param name
	 * @return
	 */
	public static Property findAttribute(Class cls, String name) {
		for (Property property : allAttributes(cls)) {
			if (name.equals(property.getName())) {
				return property;
			}
		}
		return null;
	}

	private static void addInheritedPrivateAttributes(Class cls, Collection<Property> result,
			Set<String> propertyNames) {
		for (Generalization gen : cls.getGeneralizations()) {
			Class general = (Class) gen.getGeneral();
			if (general == null) {
				continue;
			}
			for (Property prop : general.getOwnedAttributes()) {
				if (prop.getVisibility() == VisibilityKind.PRIVATE_LITERAL && propertyNames.add(prop.getName())) {
					result.add(prop);
				}
			}
			addInheritedPrivateAttributes(general, result, propertyNames);
		}
	}

	/**
	 * @param cls
	 * @return all attributes, including inherited private attributes, minus properties that have been redefined, of the given class
	 */
	public static Collection<Property> allAttributes(Class cls) {
		List<Property> result = new ArrayList<Property>();
		Set<String> propertyNames = new HashSet<String>();
		for (Property prop : cls.getAllAttributes()) {
			if (propertyNames.add(prop.getName())) {
				result.add(prop);
			}
		}
		addInheritedPrivateAttributes(cls, result, propertyNames);
		Set<Property> redefinedProperties = new HashSet<Property>();
		for (Property prop : result) {
			redefinedProperties.addAll(prop.getRedefinedProperties());
		}
		result.removeAll(redefinedProperties);
		return result;
	}

	/**
	 * @param cls
	 * @return all owned rules from the given clazz plus those from its parent classes
	 */
	public static List<Constraint> getAllRules(Class clazz) {
		Collection<Property> allProperties = CDACommonUtils.allAttributes(clazz);
		Set<String> ruleNames = new HashSet<String>();
		List<Constraint> rules = new ArrayList<Constraint>(clazz.getOwnedRules());
		for (Constraint constraint : rules) {
			ruleNames.add(constraint.getName());
		}
		for (Classifier generalClass : clazz.allParents()) {
			if (CDACommonUtils.getCDAType(generalClass) != generalClass) {
				for (final Constraint constraint : generalClass.getOwnedRules()) {
					for (Element ele : constraint.getConstrainedElements()) {
						ele = ele instanceof NamedElement
								? getMDHTRepresentative((NamedElement) ele)
								: ele;
						if (ele instanceof Property && allProperties.contains(ele) &&
								ruleNames.add(constraint.getName())) {
							rules.add(constraint);
							break;
						}
					}
				}
			}
		}
		return rules;
	}

	/**
	 * Adds a templateId property to the given class mirroring the constraints from an applied templateId stereotype including the
	 * assigningAuthorityName attribute
	 *
	 * @param umlClass
	 * @return the newly added property, or <code>null</code> if there are no constraints to be mirrored
	 */
	public static Property createTemplateIdProperty(Class umlClass) {
		String templateId = CDAModelUtil.getTemplateId(umlClass);
		if (templateId != null) {
			Property templateIdProp = createProperty3(umlClass, "templateId", SeverityKind.ERROR);
			if (templateIdProp != null) {
				String templateVersion = CDAModelUtil.getTemplateVersion(umlClass);
				String assigningAuthorityName = CDAModelUtil.getAssigningAuthorityName(umlClass);

				// created nested class
				Class nestedClass = UMLFactory.eINSTANCE.createClass();
				Generalization gen = UMLFactory.eINSTANCE.createGeneralization();
				Classifier type = (Classifier) templateIdProp.getType();
				gen.setGeneral(type);
				nestedClass.getGeneralizations().add(gen);
				nestedClass.setName(type.getName() + "_for_" + templateIdProp.getName());
				umlClass.getNestedClassifiers().add(nestedClass);
				templateIdProp.setType(nestedClass);

				// directly constrain properties
				createProperty2(nestedClass, "root", templateId, SeverityKind.ERROR);
				createProperty2(nestedClass, "extension", templateVersion, SeverityKind.ERROR);
				createProperty2(nestedClass, "assigningAuthorityName", assigningAuthorityName, SeverityKind.WARNING);
				return templateIdProp;
			}
		}
		return null;
	}

	/**
	 *
	 * Creates a property for the given class deriving from a base property of the given name and sets the given default value and the given severity
	 *
	 * @param cls
	 * @param name
	 * @param defaultValue
	 * @param severity
	 */
	private static void createProperty2(Class cls, String name, String defaultValue, SeverityKind severity) {
		if (defaultValue == null) {
			return;
		}
		Property property = CDACommonUtils.createProperty3(cls, name, severity);
		if (property != null) {
			property.setDefault(defaultValue);
		}
	}

	/**
	 *
	 * Creates a property for the given class deriving from a base property of the given name and sets the given severity
	 *
	 * @param cls
	 * @param name
	 * @param value
	 * @return
	 */
	private static Property createProperty3(Class cls, String name, SeverityKind severity) {
		Property existing = CDACommonUtils.findAttribute(cls, name);
		if (existing != null && existing.eContainer() != cls) {
			Property derivedProperty = UMLFactory.eINSTANCE.createProperty();
			derivedProperty.setName(existing.getName());
			derivedProperty.setType(existing.getType());
			if (severity == SeverityKind.WARNING) {
				derivedProperty.setLower(0);
			}
			cls.getOwnedAttributes().add(derivedProperty);
			PropertyValidation pv = CDAFactory.eINSTANCE.createPropertyValidation();
			pv.setBase_Property(derivedProperty);
			pv.setSeverity(severity);
			cls.eResource().getContents().add(pv);
			return derivedProperty;
		}
		return null;
	}

	/**
	 * @param element
	 *            MDHT model element
	 * @return the MDHT clinical document
	 */
	public static Class getClinicalDocument(Element element) {
		for (NamedElement ne : element.getNearestPackage().getPackagedElements()) {
			if (ne instanceof Class && CDACommonUtils.isClinicalDocument((Class) ne)) {
				return (Class) ne;
			}
		}
		return null;
	}

	public static String getCodeSystem(CodeSystemConstraint codeSystemConstraint) {
		if (codeSystemConstraint.getReference() != null) {
			return codeSystemConstraint.getReference().getIdentifier();
		}
		return codeSystemConstraint.getIdentifier();
	}

	/**
	 * Replace recursively all constraints implied by the Terminology tab by equivalent constraints operating directly on attributes
	 *
	 * @param umlClass
	 * @param alreadyHandled
	 */
	public static void printTerminologyConstraintAsList(Class umlClass, Set<Class> alreadyHandled) {
		if (!alreadyHandled.add(umlClass)) {
			return;
		}

		if (CDAModelUtil.isCDAModel(umlClass) || CDAModelUtil.isDatatypeModel(umlClass)) {
			return;
		}

		for (Property property : umlClass.getOwnedAttributes()) {
			if (property.getType() instanceof Class) {
				Class codeClass = (Class) property.getType();
				CodeSystemConstraint codeSystemConstraint = TermProfileUtil.getCodeSystemConstraint(property);
				if (codeSystemConstraint != null) {

					if (codeClass.eContainer() != umlClass) {
						// created nested class
						Class nestedClass = UMLFactory.eINSTANCE.createClass();
						Generalization gen = UMLFactory.eINSTANCE.createGeneralization();
						gen.setGeneral(codeClass);
						nestedClass.getGeneralizations().add(gen);
						nestedClass.setName(codeClass.getName() + "_for_" + property.getName());
						umlClass.getNestedClassifiers().add(nestedClass);
						property.setType(nestedClass);
						codeClass = nestedClass;
					}

					// retrieve values from terminology tab and put them into new attributes
					String codeSystem = null;
					String codeSystemName = null;
					@SuppressWarnings("unused")
					String codeSystemVersion = null;
					String code = null;
					String displayName = null;

					if (codeSystemConstraint.getReference() != null) {
						codeSystem = codeSystemConstraint.getReference().getIdentifier();
						codeSystemName = codeSystemConstraint.getReference().getEnumerationName();
						codeSystemVersion = codeSystemConstraint.getReference().getVersion();
					} else {
						codeSystem = codeSystemConstraint.getIdentifier();
						codeSystemName = codeSystemConstraint.getName();
						codeSystemVersion = codeSystemConstraint.getVersion();
					}
					code = codeSystemConstraint.getCode();
					displayName = codeSystemConstraint.getDisplayName();

					createProperty(codeClass, "code", code, SeverityKind.ERROR);
					createProperty(codeClass, "codeSystem", codeSystem, SeverityKind.ERROR);
					createProperty(codeClass, "codeSystemName", codeSystemName, SeverityKind.WARNING);
					createProperty(codeClass, "displayName", displayName, SeverityKind.WARNING);

					// don't create traditional terminology dita
					Stereotype stereotype = TermProfileUtil.getAppliedStereotype(
						property, ITermProfileConstants.CODE_SYSTEM_CONSTRAINT);
					if (stereotype != null) {
						property.unapplyStereotype(stereotype);
					}
				}
				printTerminologyConstraintAsList(codeClass, alreadyHandled);
			}
		}

		for (Generalization generalization : umlClass.getGeneralizations()) {
			if (generalization.getGeneral() instanceof Class) {
				printTerminologyConstraintAsList((Class) generalization.getGeneral(), alreadyHandled);
			}
		}

	}

	/**
	 *
	 * Creates a property for the given class deriving from a base property of the given name and sets it default value to the given value and the
	 * severity to SHALL
	 *
	 * @param parentClass
	 * @param name
	 * @param value
	 */
	private static void createProperty(Class cls, String name, String value, SeverityKind severity) {
		Property existing = CDACommonUtils.findAttribute(cls, name);
		if (existing != null && existing.eContainer() != cls && value != null) {
			Property derivedProperty = UMLFactory.eINSTANCE.createProperty();
			derivedProperty.setName(existing.getName());
			derivedProperty.setType(existing.getType());
			derivedProperty.setDefault(value);
			if (severity == SeverityKind.WARNING) {
				derivedProperty.setLower(0);
			}
			cls.getOwnedAttributes().add(derivedProperty);
			PropertyValidation pv = CDAFactory.eINSTANCE.createPropertyValidation();
			pv.setBase_Property(derivedProperty);
			pv.setSeverity(severity);
			derivedProperty.eResource().getContents().add(pv);
		}
	}

	/**
	 * See {@link #printTerminologyConstraintAsList(Class, Set)}, applied to a general set of EMF resources
	 *
	 * @param emfObjects
	 */
	public static void printTerminologyConstraintAsList(Collection<?> emfObjects) {
		Set<Class> alreadyHandledForPrintTerminologyConstraintAsList = new HashSet<Class>();
		for (Class cls : CDACommonUtils.getAllContents(emfObjects, Class.class)) {
			CDACommonUtils.printTerminologyConstraintAsList(cls, alreadyHandledForPrintTerminologyConstraintAsList);
		}
	}
}
