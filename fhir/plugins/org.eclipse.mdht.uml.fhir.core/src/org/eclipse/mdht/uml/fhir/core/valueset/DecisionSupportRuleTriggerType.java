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
 * A representation of the literals of the enumeration '<em><b>Decision Support Rule Trigger Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.mdht.uml.fhir.core.valueset.FhirValuesetPackage#getDecisionSupportRuleTriggerType()
 * @model
 * @generated
 */
public enum DecisionSupportRuleTriggerType implements Enumerator {
	/**
	 * The '<em><b>Namedevent</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NAMEDEVENT_VALUE
	 * @generated
	 * @ordered
	 */
	NAMEDEVENT(0, "namedevent", "namedevent"),

	/**
	 * The '<em><b>Periodic</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PERIODIC_VALUE
	 * @generated
	 * @ordered
	 */
	PERIODIC(1, "periodic", "periodic"),

	/**
	 * The '<em><b>Dataadded</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATAADDED_VALUE
	 * @generated
	 * @ordered
	 */
	DATAADDED(2, "dataadded", "dataadded"),

	/**
	 * The '<em><b>Datamodified</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATAMODIFIED_VALUE
	 * @generated
	 * @ordered
	 */
	DATAMODIFIED(3, "datamodified", "datamodified"),

	/**
	 * The '<em><b>Dataremoved</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATAREMOVED_VALUE
	 * @generated
	 * @ordered
	 */
	DATAREMOVED(4, "dataremoved", "dataremoved"),

	/**
	 * The '<em><b>Dataaccessed</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATAACCESSED_VALUE
	 * @generated
	 * @ordered
	 */
	DATAACCESSED(5, "dataaccessed", "dataaccessed"),

	/**
	 * The '<em><b>Dataaccessended</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATAACCESSENDED_VALUE
	 * @generated
	 * @ordered
	 */
	DATAACCESSENDED(6, "dataaccessended", "dataaccessended");

	/**
	 * The '<em><b>Namedevent</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Namedevent</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NAMEDEVENT
	 * @model name="namedevent"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='named-event'"
	 * @generated
	 * @ordered
	 */
	public static final int NAMEDEVENT_VALUE = 0;

	/**
	 * The '<em><b>Periodic</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Periodic</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PERIODIC
	 * @model name="periodic"
	 * @generated
	 * @ordered
	 */
	public static final int PERIODIC_VALUE = 1;

	/**
	 * The '<em><b>Dataadded</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Dataadded</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DATAADDED
	 * @model name="dataadded"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='data-added'"
	 * @generated
	 * @ordered
	 */
	public static final int DATAADDED_VALUE = 2;

	/**
	 * The '<em><b>Datamodified</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Datamodified</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DATAMODIFIED
	 * @model name="datamodified"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='data-modified'"
	 * @generated
	 * @ordered
	 */
	public static final int DATAMODIFIED_VALUE = 3;

	/**
	 * The '<em><b>Dataremoved</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Dataremoved</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DATAREMOVED
	 * @model name="dataremoved"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='data-removed'"
	 * @generated
	 * @ordered
	 */
	public static final int DATAREMOVED_VALUE = 4;

	/**
	 * The '<em><b>Dataaccessed</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Dataaccessed</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DATAACCESSED
	 * @model name="dataaccessed"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='data-accessed'"
	 * @generated
	 * @ordered
	 */
	public static final int DATAACCESSED_VALUE = 5;

	/**
	 * The '<em><b>Dataaccessended</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Dataaccessended</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DATAACCESSENDED
	 * @model name="dataaccessended"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='data-access-ended'"
	 * @generated
	 * @ordered
	 */
	public static final int DATAACCESSENDED_VALUE = 6;

	/**
	 * An array of all the '<em><b>Decision Support Rule Trigger Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final DecisionSupportRuleTriggerType[] VALUES_ARRAY =
		new DecisionSupportRuleTriggerType[] {
			NAMEDEVENT,
			PERIODIC,
			DATAADDED,
			DATAMODIFIED,
			DATAREMOVED,
			DATAACCESSED,
			DATAACCESSENDED,
		};

	/**
	 * A public read-only list of all the '<em><b>Decision Support Rule Trigger Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<DecisionSupportRuleTriggerType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Decision Support Rule Trigger Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DecisionSupportRuleTriggerType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DecisionSupportRuleTriggerType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Decision Support Rule Trigger Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DecisionSupportRuleTriggerType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DecisionSupportRuleTriggerType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Decision Support Rule Trigger Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DecisionSupportRuleTriggerType get(int value) {
		switch (value) {
			case NAMEDEVENT_VALUE: return NAMEDEVENT;
			case PERIODIC_VALUE: return PERIODIC;
			case DATAADDED_VALUE: return DATAADDED;
			case DATAMODIFIED_VALUE: return DATAMODIFIED;
			case DATAREMOVED_VALUE: return DATAREMOVED;
			case DATAACCESSED_VALUE: return DATAACCESSED;
			case DATAACCESSENDED_VALUE: return DATAACCESSENDED;
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
	private DecisionSupportRuleTriggerType(int value, String name, String literal) {
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
	
} //DecisionSupportRuleTriggerType
