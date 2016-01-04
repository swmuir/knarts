/**
 */
package org.hl7.fhir;

import java.lang.String;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Module Metadata Type List</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.hl7.fhir.FhirPackage#getModuleMetadataTypeList()
 * @model extendedMetaData="name='ModuleMetadataType-list'"
 * @generated
 */
public enum ModuleMetadataTypeList implements Enumerator {
	/**
	 * The '<em><b>Module</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MODULE_VALUE
	 * @generated
	 * @ordered
	 */
	MODULE(0, "module", "module"),

	/**
	 * The '<em><b>Library</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LIBRARY_VALUE
	 * @generated
	 * @ordered
	 */
	LIBRARY(1, "library", "library"),

	/**
	 * The '<em><b>Decision Support Rule</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DECISION_SUPPORT_RULE_VALUE
	 * @generated
	 * @ordered
	 */
	DECISION_SUPPORT_RULE(2, "decisionSupportRule", "decision-support-rule"),

	/**
	 * The '<em><b>Documentation Template</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOCUMENTATION_TEMPLATE_VALUE
	 * @generated
	 * @ordered
	 */
	DOCUMENTATION_TEMPLATE(3, "documentationTemplate", "documentation-template"),

	/**
	 * The '<em><b>Order Set</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ORDER_SET_VALUE
	 * @generated
	 * @ordered
	 */
	ORDER_SET(4, "orderSet", "order-set");

	/**
	 * The '<em><b>Module</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The resource is a description of a knowledge module
	 * <!-- end-model-doc -->
	 * @see #MODULE
	 * @model name="module"
	 * @generated
	 * @ordered
	 */
	public static final int MODULE_VALUE = 0;

	/**
	 * The '<em><b>Library</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The resource is a shareable library of formalized knowledge
	 * <!-- end-model-doc -->
	 * @see #LIBRARY
	 * @model name="library"
	 * @generated
	 * @ordered
	 */
	public static final int LIBRARY_VALUE = 1;

	/**
	 * The '<em><b>Decision Support Rule</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An Event-Condition-Action Rule Artifact
	 * <!-- end-model-doc -->
	 * @see #DECISION_SUPPORT_RULE
	 * @model name="decisionSupportRule" literal="decision-support-rule"
	 * @generated
	 * @ordered
	 */
	public static final int DECISION_SUPPORT_RULE_VALUE = 2;

	/**
	 * The '<em><b>Documentation Template</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A Documentation Template Artifact
	 * <!-- end-model-doc -->
	 * @see #DOCUMENTATION_TEMPLATE
	 * @model name="documentationTemplate" literal="documentation-template"
	 * @generated
	 * @ordered
	 */
	public static final int DOCUMENTATION_TEMPLATE_VALUE = 3;

	/**
	 * The '<em><b>Order Set</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An Order Set Artifact
	 * <!-- end-model-doc -->
	 * @see #ORDER_SET
	 * @model name="orderSet" literal="order-set"
	 * @generated
	 * @ordered
	 */
	public static final int ORDER_SET_VALUE = 4;

	/**
	 * An array of all the '<em><b>Module Metadata Type List</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ModuleMetadataTypeList[] VALUES_ARRAY =
		new ModuleMetadataTypeList[] {
			MODULE,
			LIBRARY,
			DECISION_SUPPORT_RULE,
			DOCUMENTATION_TEMPLATE,
			ORDER_SET,
		};

	/**
	 * A public read-only list of all the '<em><b>Module Metadata Type List</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ModuleMetadataTypeList> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Module Metadata Type List</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ModuleMetadataTypeList get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ModuleMetadataTypeList result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Module Metadata Type List</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ModuleMetadataTypeList getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ModuleMetadataTypeList result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Module Metadata Type List</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ModuleMetadataTypeList get(int value) {
		switch (value) {
			case MODULE_VALUE: return MODULE;
			case LIBRARY_VALUE: return LIBRARY;
			case DECISION_SUPPORT_RULE_VALUE: return DECISION_SUPPORT_RULE;
			case DOCUMENTATION_TEMPLATE_VALUE: return DOCUMENTATION_TEMPLATE;
			case ORDER_SET_VALUE: return ORDER_SET;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private ModuleMetadataTypeList(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //ModuleMetadataTypeList
