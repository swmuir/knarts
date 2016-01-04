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
 * A representation of the literals of the enumeration '<em><b>Observation Category Codes</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.mdht.uml.fhir.core.valueset.FhirValuesetPackage#getObservationCategoryCodes()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Observation Category Codes'"
 * @generated
 */
public enum ObservationCategoryCodes implements Enumerator {
	/**
	 * The '<em><b>Socialhistory</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SOCIALHISTORY_VALUE
	 * @generated
	 * @ordered
	 */
	SOCIALHISTORY(0, "socialhistory", "socialhistory"),

	/**
	 * The '<em><b>Vitalsigns</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VITALSIGNS_VALUE
	 * @generated
	 * @ordered
	 */
	VITALSIGNS(1, "vitalsigns", "vitalsigns"),

	/**
	 * The '<em><b>Imaging</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IMAGING_VALUE
	 * @generated
	 * @ordered
	 */
	IMAGING(2, "imaging", "imaging"),

	/**
	 * The '<em><b>Laboratory</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LABORATORY_VALUE
	 * @generated
	 * @ordered
	 */
	LABORATORY(3, "laboratory", "laboratory"),

	/**
	 * The '<em><b>Procedure</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROCEDURE_VALUE
	 * @generated
	 * @ordered
	 */
	PROCEDURE(4, "procedure", "procedure"),

	/**
	 * The '<em><b>Survey</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SURVEY_VALUE
	 * @generated
	 * @ordered
	 */
	SURVEY(5, "survey", "survey"),

	/**
	 * The '<em><b>Exam</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXAM_VALUE
	 * @generated
	 * @ordered
	 */
	EXAM(6, "exam", "exam"),

	/**
	 * The '<em><b>Therapy</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #THERAPY_VALUE
	 * @generated
	 * @ordered
	 */
	THERAPY(7, "therapy", "therapy");

	/**
	 * The '<em><b>Socialhistory</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Socialhistory</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SOCIALHISTORY
	 * @model name="socialhistory"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='social-history'"
	 * @generated
	 * @ordered
	 */
	public static final int SOCIALHISTORY_VALUE = 0;

	/**
	 * The '<em><b>Vitalsigns</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Vitalsigns</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #VITALSIGNS
	 * @model name="vitalsigns"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='vital-signs'"
	 * @generated
	 * @ordered
	 */
	public static final int VITALSIGNS_VALUE = 1;

	/**
	 * The '<em><b>Imaging</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Imaging</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IMAGING
	 * @model name="imaging"
	 * @generated
	 * @ordered
	 */
	public static final int IMAGING_VALUE = 2;

	/**
	 * The '<em><b>Laboratory</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Laboratory</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LABORATORY
	 * @model name="laboratory"
	 * @generated
	 * @ordered
	 */
	public static final int LABORATORY_VALUE = 3;

	/**
	 * The '<em><b>Procedure</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Procedure</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PROCEDURE
	 * @model name="procedure"
	 * @generated
	 * @ordered
	 */
	public static final int PROCEDURE_VALUE = 4;

	/**
	 * The '<em><b>Survey</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Survey</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SURVEY
	 * @model name="survey"
	 * @generated
	 * @ordered
	 */
	public static final int SURVEY_VALUE = 5;

	/**
	 * The '<em><b>Exam</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Exam</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EXAM
	 * @model name="exam"
	 * @generated
	 * @ordered
	 */
	public static final int EXAM_VALUE = 6;

	/**
	 * The '<em><b>Therapy</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Therapy</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #THERAPY
	 * @model name="therapy"
	 * @generated
	 * @ordered
	 */
	public static final int THERAPY_VALUE = 7;

	/**
	 * An array of all the '<em><b>Observation Category Codes</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ObservationCategoryCodes[] VALUES_ARRAY =
		new ObservationCategoryCodes[] {
			SOCIALHISTORY,
			VITALSIGNS,
			IMAGING,
			LABORATORY,
			PROCEDURE,
			SURVEY,
			EXAM,
			THERAPY,
		};

	/**
	 * A public read-only list of all the '<em><b>Observation Category Codes</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ObservationCategoryCodes> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Observation Category Codes</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ObservationCategoryCodes get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ObservationCategoryCodes result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Observation Category Codes</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ObservationCategoryCodes getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ObservationCategoryCodes result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Observation Category Codes</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ObservationCategoryCodes get(int value) {
		switch (value) {
			case SOCIALHISTORY_VALUE: return SOCIALHISTORY;
			case VITALSIGNS_VALUE: return VITALSIGNS;
			case IMAGING_VALUE: return IMAGING;
			case LABORATORY_VALUE: return LABORATORY;
			case PROCEDURE_VALUE: return PROCEDURE;
			case SURVEY_VALUE: return SURVEY;
			case EXAM_VALUE: return EXAM;
			case THERAPY_VALUE: return THERAPY;
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
	private ObservationCategoryCodes(int value, String name, String literal) {
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
	
} //ObservationCategoryCodes
