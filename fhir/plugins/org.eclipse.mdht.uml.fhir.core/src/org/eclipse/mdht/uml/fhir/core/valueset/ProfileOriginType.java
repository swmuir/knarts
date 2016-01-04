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
 * A representation of the literals of the enumeration '<em><b>Profile Origin Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.mdht.uml.fhir.core.valueset.FhirValuesetPackage#getProfileOriginType()
 * @model
 * @generated
 */
public enum ProfileOriginType implements Enumerator {
	/**
	 * The '<em><b>Fhi RDstu2 Client</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FHI_RDSTU2_CLIENT_VALUE
	 * @generated
	 * @ordered
	 */
	FHI_RDSTU2_CLIENT(0, "fhiRDstu2Client", "fhiRDstu2Client"),

	/**
	 * The '<em><b>Fhi RDstu2 Sd CForm Filler</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FHI_RDSTU2_SD_CFORM_FILLER_VALUE
	 * @generated
	 * @ordered
	 */
	FHI_RDSTU2_SD_CFORM_FILLER(1, "fhiRDstu2SdCFormFiller", "fhiRDstu2SdCFormFiller");

	/**
	 * The '<em><b>Fhi RDstu2 Client</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Fhi RDstu2 Client</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FHI_RDSTU2_CLIENT
	 * @model name="fhiRDstu2Client"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='FHIR-DSTU2-Client'"
	 * @generated
	 * @ordered
	 */
	public static final int FHI_RDSTU2_CLIENT_VALUE = 0;

	/**
	 * The '<em><b>Fhi RDstu2 Sd CForm Filler</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Fhi RDstu2 Sd CForm Filler</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FHI_RDSTU2_SD_CFORM_FILLER
	 * @model name="fhiRDstu2SdCFormFiller"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='FHIR-DSTU2-SDC-FormFiller'"
	 * @generated
	 * @ordered
	 */
	public static final int FHI_RDSTU2_SD_CFORM_FILLER_VALUE = 1;

	/**
	 * An array of all the '<em><b>Profile Origin Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ProfileOriginType[] VALUES_ARRAY =
		new ProfileOriginType[] {
			FHI_RDSTU2_CLIENT,
			FHI_RDSTU2_SD_CFORM_FILLER,
		};

	/**
	 * A public read-only list of all the '<em><b>Profile Origin Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ProfileOriginType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Profile Origin Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ProfileOriginType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ProfileOriginType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Profile Origin Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ProfileOriginType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ProfileOriginType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Profile Origin Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ProfileOriginType get(int value) {
		switch (value) {
			case FHI_RDSTU2_CLIENT_VALUE: return FHI_RDSTU2_CLIENT;
			case FHI_RDSTU2_SD_CFORM_FILLER_VALUE: return FHI_RDSTU2_SD_CFORM_FILLER;
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
	private ProfileOriginType(int value, String name, String literal) {
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
	
} //ProfileOriginType
