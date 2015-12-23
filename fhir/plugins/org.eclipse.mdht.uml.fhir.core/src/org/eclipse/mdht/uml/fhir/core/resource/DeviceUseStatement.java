/*******************************************************************************
 * Copyright (c) 2015 David Carlson and others.
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
package org.eclipse.mdht.uml.fhir.core.resource;

import org.eclipse.emf.common.util.EList;

import org.eclipse.mdht.uml.fhir.core.datatype.Base;
import org.eclipse.mdht.uml.fhir.core.datatype.CodeableConcept;
import org.eclipse.mdht.uml.fhir.core.datatype.DataType;
import org.eclipse.mdht.uml.fhir.core.datatype.DateTime;
import org.eclipse.mdht.uml.fhir.core.datatype.Identifier;
import org.eclipse.mdht.uml.fhir.core.datatype.Period;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Device Use Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.DeviceUseStatement#getBodySitex <em>Body Sitex</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.DeviceUseStatement#getWhenUsed <em>When Used</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.DeviceUseStatement#getDevice <em>Device</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.DeviceUseStatement#getIdentifiers <em>Identifier</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.DeviceUseStatement#getIndications <em>Indication</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.DeviceUseStatement#getNotes <em>Notes</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.DeviceUseStatement#getRecordedOn <em>Recorded On</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.DeviceUseStatement#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.DeviceUseStatement#getTimingx <em>Timingx</em>}</li>
 * </ul>
 *
 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getDeviceUseStatement()
 * @model
 * @generated
 */
public interface DeviceUseStatement extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Body Sitex</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Body Sitex</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body Sitex</em>' reference.
	 * @see #setBodySitex(Base)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getDeviceUseStatement_BodySitex()
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='bodySite[x]'"
	 * @generated
	 */
	Base getBodySitex();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.DeviceUseStatement#getBodySitex <em>Body Sitex</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body Sitex</em>' reference.
	 * @see #getBodySitex()
	 * @generated
	 */
	void setBodySitex(Base value);

	/**
	 * Returns the value of the '<em><b>When Used</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>When Used</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>When Used</em>' reference.
	 * @see #setWhenUsed(Period)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getDeviceUseStatement_WhenUsed()
	 * @model
	 * @generated
	 */
	Period getWhenUsed();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.DeviceUseStatement#getWhenUsed <em>When Used</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>When Used</em>' reference.
	 * @see #getWhenUsed()
	 * @generated
	 */
	void setWhenUsed(Period value);

	/**
	 * Returns the value of the '<em><b>Device</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Device</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Device</em>' reference.
	 * @see #setDevice(Device)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getDeviceUseStatement_Device()
	 * @model required="true"
	 * @generated
	 */
	Device getDevice();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.DeviceUseStatement#getDevice <em>Device</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Device</em>' reference.
	 * @see #getDevice()
	 * @generated
	 */
	void setDevice(Device value);

	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.mdht.uml.fhir.core.datatype.Identifier}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Identifier</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identifier</em>' reference list.
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getDeviceUseStatement_Identifier()
	 * @model
	 * @generated
	 */
	EList<Identifier> getIdentifiers();

	/**
	 * Returns the value of the '<em><b>Indication</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.mdht.uml.fhir.core.datatype.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Indication</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Indication</em>' reference list.
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getDeviceUseStatement_Indication()
	 * @model
	 * @generated
	 */
	EList<CodeableConcept> getIndications();

	/**
	 * Returns the value of the '<em><b>Notes</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.mdht.uml.fhir.core.datatype.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Notes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Notes</em>' reference list.
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getDeviceUseStatement_Notes()
	 * @model
	 * @generated
	 */
	EList<org.eclipse.mdht.uml.fhir.core.datatype.String> getNotes();

	/**
	 * Returns the value of the '<em><b>Recorded On</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Recorded On</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Recorded On</em>' reference.
	 * @see #setRecordedOn(DateTime)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getDeviceUseStatement_RecordedOn()
	 * @model
	 * @generated
	 */
	DateTime getRecordedOn();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.DeviceUseStatement#getRecordedOn <em>Recorded On</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Recorded On</em>' reference.
	 * @see #getRecordedOn()
	 * @generated
	 */
	void setRecordedOn(DateTime value);

	/**
	 * Returns the value of the '<em><b>Subject</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subject</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subject</em>' reference.
	 * @see #setSubject(Patient)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getDeviceUseStatement_Subject()
	 * @model required="true"
	 * @generated
	 */
	Patient getSubject();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.DeviceUseStatement#getSubject <em>Subject</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subject</em>' reference.
	 * @see #getSubject()
	 * @generated
	 */
	void setSubject(Patient value);

	/**
	 * Returns the value of the '<em><b>Timingx</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Timingx</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timingx</em>' reference.
	 * @see #setTimingx(DataType)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getDeviceUseStatement_Timingx()
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='timing[x]'"
	 * @generated
	 */
	DataType getTimingx();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.DeviceUseStatement#getTimingx <em>Timingx</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timingx</em>' reference.
	 * @see #getTimingx()
	 * @generated
	 */
	void setTimingx(DataType value);

} // DeviceUseStatement
