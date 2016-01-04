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
 * A representation of the literals of the enumeration '<em><b>Media Sub Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.mdht.uml.fhir.core.valueset.FhirValuesetPackage#getMediaSubType()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Media SubType'"
 * @generated
 */
public enum MediaSubType implements Enumerator {
	/**
	 * The '<em><b>Diagram</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DIAGRAM_VALUE
	 * @generated
	 * @ordered
	 */
	DIAGRAM(0, "diagram", "diagram"),

	/**
	 * The '<em><b>Fax</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FAX_VALUE
	 * @generated
	 * @ordered
	 */
	FAX(1, "fax", "fax"),

	/**
	 * The '<em><b>Scan</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SCAN_VALUE
	 * @generated
	 * @ordered
	 */
	SCAN(2, "scan", "scan"),

	/**
	 * The '<em><b>Retina</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RETINA_VALUE
	 * @generated
	 * @ordered
	 */
	RETINA(3, "retina", "retina"),

	/**
	 * The '<em><b>Fingerprint</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FINGERPRINT_VALUE
	 * @generated
	 * @ordered
	 */
	FINGERPRINT(4, "fingerprint", "fingerprint"),

	/**
	 * The '<em><b>Iris</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IRIS_VALUE
	 * @generated
	 * @ordered
	 */
	IRIS(5, "iris", "iris"),

	/**
	 * The '<em><b>Palm</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PALM_VALUE
	 * @generated
	 * @ordered
	 */
	PALM(6, "palm", "palm"),

	/**
	 * The '<em><b>Face</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FACE_VALUE
	 * @generated
	 * @ordered
	 */
	FACE(7, "face", "face");

	/**
	 * The '<em><b>Diagram</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Diagram</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DIAGRAM
	 * @model name="diagram"
	 * @generated
	 * @ordered
	 */
	public static final int DIAGRAM_VALUE = 0;

	/**
	 * The '<em><b>Fax</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Fax</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FAX
	 * @model name="fax"
	 * @generated
	 * @ordered
	 */
	public static final int FAX_VALUE = 1;

	/**
	 * The '<em><b>Scan</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Scan</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SCAN
	 * @model name="scan"
	 * @generated
	 * @ordered
	 */
	public static final int SCAN_VALUE = 2;

	/**
	 * The '<em><b>Retina</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Retina</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RETINA
	 * @model name="retina"
	 * @generated
	 * @ordered
	 */
	public static final int RETINA_VALUE = 3;

	/**
	 * The '<em><b>Fingerprint</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Fingerprint</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FINGERPRINT
	 * @model name="fingerprint"
	 * @generated
	 * @ordered
	 */
	public static final int FINGERPRINT_VALUE = 4;

	/**
	 * The '<em><b>Iris</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Iris</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IRIS
	 * @model name="iris"
	 * @generated
	 * @ordered
	 */
	public static final int IRIS_VALUE = 5;

	/**
	 * The '<em><b>Palm</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Palm</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PALM
	 * @model name="palm"
	 * @generated
	 * @ordered
	 */
	public static final int PALM_VALUE = 6;

	/**
	 * The '<em><b>Face</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Face</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FACE
	 * @model name="face"
	 * @generated
	 * @ordered
	 */
	public static final int FACE_VALUE = 7;

	/**
	 * An array of all the '<em><b>Media Sub Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final MediaSubType[] VALUES_ARRAY =
		new MediaSubType[] {
			DIAGRAM,
			FAX,
			SCAN,
			RETINA,
			FINGERPRINT,
			IRIS,
			PALM,
			FACE,
		};

	/**
	 * A public read-only list of all the '<em><b>Media Sub Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<MediaSubType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Media Sub Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MediaSubType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MediaSubType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Media Sub Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MediaSubType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MediaSubType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Media Sub Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MediaSubType get(int value) {
		switch (value) {
			case DIAGRAM_VALUE: return DIAGRAM;
			case FAX_VALUE: return FAX;
			case SCAN_VALUE: return SCAN;
			case RETINA_VALUE: return RETINA;
			case FINGERPRINT_VALUE: return FINGERPRINT;
			case IRIS_VALUE: return IRIS;
			case PALM_VALUE: return PALM;
			case FACE_VALUE: return FACE;
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
	private MediaSubType(int value, String name, String literal) {
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
	
} //MediaSubType
