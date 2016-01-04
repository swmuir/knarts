/*******************************************************************************
 * Copyright (c) 2016 David Carlson and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David Carlson (Clinical Cloud Solutions, LLC) - initial API and implementation
 *******************************************************************************/
/**
 */
package org.eclipse.mdht.uml.fhir.core.valueset;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Module Metadata Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.mdht.uml.fhir.core.valueset.FhirValuesetPackage#getModuleMetadataType()
 * @model
 * @generated
 */
public enum ModuleMetadataType implements Enumerator {
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
	 * The '<em><b>Decisionsupportrule</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DECISIONSUPPORTRULE_VALUE
	 * @generated
	 * @ordered
	 */
	DECISIONSUPPORTRULE(2, "decisionsupportrule", "decisionsupportrule"),

	/**
	 * The '<em><b>Documentationtemplate</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOCUMENTATIONTEMPLATE_VALUE
	 * @generated
	 * @ordered
	 */
	DOCUMENTATIONTEMPLATE(3, "documentationtemplate", "documentationtemplate"),

	/**
	 * The '<em><b>Orderset</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ORDERSET_VALUE
	 * @generated
	 * @ordered
	 */
	ORDERSET(4, "orderset", "orderset");

	/**
	 * The '<em><b>Module</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Module</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MODULE
	 * @model name="module"
	 * @generated
	 * @ordered
	 */
	public static final int MODULE_VALUE = 0;

	/**
	 * The '<em><b>Library</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Library</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LIBRARY
	 * @model name="library"
	 * @generated
	 * @ordered
	 */
	public static final int LIBRARY_VALUE = 1;

	/**
	 * The '<em><b>Decisionsupportrule</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Decisionsupportrule</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DECISIONSUPPORTRULE
	 * @model name="decisionsupportrule"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='decision-support-rule'"
	 * @generated
	 * @ordered
	 */
	public static final int DECISIONSUPPORTRULE_VALUE = 2;

	/**
	 * The '<em><b>Documentationtemplate</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Documentationtemplate</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DOCUMENTATIONTEMPLATE
	 * @model name="documentationtemplate"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='documentation-template'"
	 * @generated
	 * @ordered
	 */
	public static final int DOCUMENTATIONTEMPLATE_VALUE = 3;

	/**
	 * The '<em><b>Orderset</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Orderset</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ORDERSET
	 * @model name="orderset"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='order-set'"
	 * @generated
	 * @ordered
	 */
	public static final int ORDERSET_VALUE = 4;

	/**
	 * An array of all the '<em><b>Module Metadata Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ModuleMetadataType[] VALUES_ARRAY =
		new ModuleMetadataType[] {
			MODULE,
			LIBRARY,
			DECISIONSUPPORTRULE,
			DOCUMENTATIONTEMPLATE,
			ORDERSET,
		};

	/**
	 * A public read-only list of all the '<em><b>Module Metadata Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ModuleMetadataType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Module Metadata Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ModuleMetadataType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ModuleMetadataType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Module Metadata Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ModuleMetadataType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ModuleMetadataType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Module Metadata Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ModuleMetadataType get(int value) {
		switch (value) {
			case MODULE_VALUE: return MODULE;
			case LIBRARY_VALUE: return LIBRARY;
			case DECISIONSUPPORTRULE_VALUE: return DECISIONSUPPORTRULE;
			case DOCUMENTATIONTEMPLATE_VALUE: return DOCUMENTATIONTEMPLATE;
			case ORDERSET_VALUE: return ORDERSET;
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
	private ModuleMetadataType(int value, String name, String literal) {
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
	
} //ModuleMetadataType
