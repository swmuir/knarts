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
 * A representation of the literals of the enumeration '<em><b>Profile Destination Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.mdht.uml.fhir.core.valueset.FhirValuesetPackage#getProfileDestinationType()
 * @model
 * @generated
 */
public enum ProfileDestinationType implements Enumerator {
	/**
	 * The '<em><b>Fhi RDstu2 Server</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FHI_RDSTU2_SERVER_VALUE
	 * @generated
	 * @ordered
	 */
	FHI_RDSTU2_SERVER(0, "fhiRDstu2Server", "fhiRDstu2Server"),

	/**
	 * The '<em><b>Fhi RDstu2 Sd CForm Manager</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FHI_RDSTU2_SD_CFORM_MANAGER_VALUE
	 * @generated
	 * @ordered
	 */
	FHI_RDSTU2_SD_CFORM_MANAGER(1, "fhiRDstu2SdCFormManager", "fhiRDstu2SdCFormManager"),

	/**
	 * The '<em><b>Fhi RDstu2 Sd CForm Receiver</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FHI_RDSTU2_SD_CFORM_RECEIVER_VALUE
	 * @generated
	 * @ordered
	 */
	FHI_RDSTU2_SD_CFORM_RECEIVER(2, "fhiRDstu2SdCFormReceiver", "fhiRDstu2SdCFormReceiver"),

	/**
	 * The '<em><b>Fhi RDstu2 Sd CForm Processor</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FHI_RDSTU2_SD_CFORM_PROCESSOR_VALUE
	 * @generated
	 * @ordered
	 */
	FHI_RDSTU2_SD_CFORM_PROCESSOR(3, "fhiRDstu2SdCFormProcessor", "fhiRDstu2SdCFormProcessor");

	/**
	 * The '<em><b>Fhi RDstu2 Server</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Fhi RDstu2 Server</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FHI_RDSTU2_SERVER
	 * @model name="fhiRDstu2Server"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='FHIR-DSTU2-Server'"
	 * @generated
	 * @ordered
	 */
	public static final int FHI_RDSTU2_SERVER_VALUE = 0;

	/**
	 * The '<em><b>Fhi RDstu2 Sd CForm Manager</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Fhi RDstu2 Sd CForm Manager</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FHI_RDSTU2_SD_CFORM_MANAGER
	 * @model name="fhiRDstu2SdCFormManager"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='FHIR-DSTU2-SDC-FormManager'"
	 * @generated
	 * @ordered
	 */
	public static final int FHI_RDSTU2_SD_CFORM_MANAGER_VALUE = 1;

	/**
	 * The '<em><b>Fhi RDstu2 Sd CForm Receiver</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Fhi RDstu2 Sd CForm Receiver</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FHI_RDSTU2_SD_CFORM_RECEIVER
	 * @model name="fhiRDstu2SdCFormReceiver"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='FHIR-DSTU2-SDC-FormReceiver'"
	 * @generated
	 * @ordered
	 */
	public static final int FHI_RDSTU2_SD_CFORM_RECEIVER_VALUE = 2;

	/**
	 * The '<em><b>Fhi RDstu2 Sd CForm Processor</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Fhi RDstu2 Sd CForm Processor</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FHI_RDSTU2_SD_CFORM_PROCESSOR
	 * @model name="fhiRDstu2SdCFormProcessor"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='FHIR-DSTU2-SDC-FormProcessor'"
	 * @generated
	 * @ordered
	 */
	public static final int FHI_RDSTU2_SD_CFORM_PROCESSOR_VALUE = 3;

	/**
	 * An array of all the '<em><b>Profile Destination Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ProfileDestinationType[] VALUES_ARRAY =
		new ProfileDestinationType[] {
			FHI_RDSTU2_SERVER,
			FHI_RDSTU2_SD_CFORM_MANAGER,
			FHI_RDSTU2_SD_CFORM_RECEIVER,
			FHI_RDSTU2_SD_CFORM_PROCESSOR,
		};

	/**
	 * A public read-only list of all the '<em><b>Profile Destination Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ProfileDestinationType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Profile Destination Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ProfileDestinationType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ProfileDestinationType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Profile Destination Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ProfileDestinationType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ProfileDestinationType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Profile Destination Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ProfileDestinationType get(int value) {
		switch (value) {
			case FHI_RDSTU2_SERVER_VALUE: return FHI_RDSTU2_SERVER;
			case FHI_RDSTU2_SD_CFORM_MANAGER_VALUE: return FHI_RDSTU2_SD_CFORM_MANAGER;
			case FHI_RDSTU2_SD_CFORM_RECEIVER_VALUE: return FHI_RDSTU2_SD_CFORM_RECEIVER;
			case FHI_RDSTU2_SD_CFORM_PROCESSOR_VALUE: return FHI_RDSTU2_SD_CFORM_PROCESSOR;
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
	private ProfileDestinationType(int value, String name, String literal) {
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
	
} //ProfileDestinationType
