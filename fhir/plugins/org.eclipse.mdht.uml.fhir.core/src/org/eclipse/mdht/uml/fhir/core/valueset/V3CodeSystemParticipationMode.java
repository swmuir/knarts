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
 * A representation of the literals of the enumeration '<em><b>V3 Code System Participation Mode</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.mdht.uml.fhir.core.valueset.FhirValuesetPackage#getV3CodeSystemParticipationMode()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='v3 Code System ParticipationMode'"
 * @generated
 */
public enum V3CodeSystemParticipationMode implements Enumerator {
	/**
	 * The '<em><b>Electronic</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ELECTRONIC_VALUE
	 * @generated
	 * @ordered
	 */
	ELECTRONIC(0, "electronic", "electronic"),

	/**
	 * The '<em><b>Physical</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PHYSICAL_VALUE
	 * @generated
	 * @ordered
	 */
	PHYSICAL(1, "physical", "physical"),

	/**
	 * The '<em><b>Remote</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REMOTE_VALUE
	 * @generated
	 * @ordered
	 */
	REMOTE(2, "remote", "remote"),

	/**
	 * The '<em><b>Verbal</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VERBAL_VALUE
	 * @generated
	 * @ordered
	 */
	VERBAL(3, "verbal", "verbal"),

	/**
	 * The '<em><b>Written</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WRITTEN_VALUE
	 * @generated
	 * @ordered
	 */
	WRITTEN(4, "written", "written");

	/**
	 * The '<em><b>Electronic</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Electronic</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ELECTRONIC
	 * @model name="electronic"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='ELECTRONIC'"
	 * @generated
	 * @ordered
	 */
	public static final int ELECTRONIC_VALUE = 0;

	/**
	 * The '<em><b>Physical</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Physical</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PHYSICAL
	 * @model name="physical"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='PHYSICAL'"
	 * @generated
	 * @ordered
	 */
	public static final int PHYSICAL_VALUE = 1;

	/**
	 * The '<em><b>Remote</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Remote</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REMOTE
	 * @model name="remote"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='REMOTE'"
	 * @generated
	 * @ordered
	 */
	public static final int REMOTE_VALUE = 2;

	/**
	 * The '<em><b>Verbal</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Verbal</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #VERBAL
	 * @model name="verbal"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='VERBAL'"
	 * @generated
	 * @ordered
	 */
	public static final int VERBAL_VALUE = 3;

	/**
	 * The '<em><b>Written</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Written</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WRITTEN
	 * @model name="written"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='WRITTEN'"
	 * @generated
	 * @ordered
	 */
	public static final int WRITTEN_VALUE = 4;

	/**
	 * An array of all the '<em><b>V3 Code System Participation Mode</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final V3CodeSystemParticipationMode[] VALUES_ARRAY =
		new V3CodeSystemParticipationMode[] {
			ELECTRONIC,
			PHYSICAL,
			REMOTE,
			VERBAL,
			WRITTEN,
		};

	/**
	 * A public read-only list of all the '<em><b>V3 Code System Participation Mode</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<V3CodeSystemParticipationMode> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>V3 Code System Participation Mode</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static V3CodeSystemParticipationMode get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			V3CodeSystemParticipationMode result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>V3 Code System Participation Mode</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static V3CodeSystemParticipationMode getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			V3CodeSystemParticipationMode result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>V3 Code System Participation Mode</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static V3CodeSystemParticipationMode get(int value) {
		switch (value) {
			case ELECTRONIC_VALUE: return ELECTRONIC;
			case PHYSICAL_VALUE: return PHYSICAL;
			case REMOTE_VALUE: return REMOTE;
			case VERBAL_VALUE: return VERBAL;
			case WRITTEN_VALUE: return WRITTEN;
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
	private V3CodeSystemParticipationMode(int value, String name, String literal) {
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
	
} //V3CodeSystemParticipationMode
