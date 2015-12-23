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

import org.eclipse.mdht.uml.fhir.core.datatype.Attachment;
import org.eclipse.mdht.uml.fhir.core.datatype.BackboneElement;
import org.eclipse.mdht.uml.fhir.core.datatype.Oid;
import org.eclipse.mdht.uml.fhir.core.datatype.UnsignedInt;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Imaging Study Series Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.ImagingStudySeriesInstance#getNumber <em>Number</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.ImagingStudySeriesInstance#getUid <em>Uid</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.ImagingStudySeriesInstance#getSopClass <em>Sop Class</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.ImagingStudySeriesInstance#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.ImagingStudySeriesInstance#getTitle <em>Title</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.ImagingStudySeriesInstance#getContents <em>Content</em>}</li>
 * </ul>
 *
 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getImagingStudySeriesInstance()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Series_Instance'"
 * @generated
 */
public interface ImagingStudySeriesInstance extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Number</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number</em>' reference.
	 * @see #setNumber(UnsignedInt)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getImagingStudySeriesInstance_Number()
	 * @model
	 * @generated
	 */
	UnsignedInt getNumber();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.ImagingStudySeriesInstance#getNumber <em>Number</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number</em>' reference.
	 * @see #getNumber()
	 * @generated
	 */
	void setNumber(UnsignedInt value);

	/**
	 * Returns the value of the '<em><b>Uid</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uid</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uid</em>' reference.
	 * @see #setUid(Oid)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getImagingStudySeriesInstance_Uid()
	 * @model required="true"
	 * @generated
	 */
	Oid getUid();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.ImagingStudySeriesInstance#getUid <em>Uid</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uid</em>' reference.
	 * @see #getUid()
	 * @generated
	 */
	void setUid(Oid value);

	/**
	 * Returns the value of the '<em><b>Sop Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sop Class</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sop Class</em>' reference.
	 * @see #setSopClass(Oid)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getImagingStudySeriesInstance_SopClass()
	 * @model required="true"
	 * @generated
	 */
	Oid getSopClass();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.ImagingStudySeriesInstance#getSopClass <em>Sop Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sop Class</em>' reference.
	 * @see #getSopClass()
	 * @generated
	 */
	void setSopClass(Oid value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(org.eclipse.mdht.uml.fhir.core.datatype.String)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getImagingStudySeriesInstance_Type()
	 * @model
	 * @generated
	 */
	org.eclipse.mdht.uml.fhir.core.datatype.String getType();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.ImagingStudySeriesInstance#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(org.eclipse.mdht.uml.fhir.core.datatype.String value);

	/**
	 * Returns the value of the '<em><b>Title</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Title</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' reference.
	 * @see #setTitle(org.eclipse.mdht.uml.fhir.core.datatype.String)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getImagingStudySeriesInstance_Title()
	 * @model
	 * @generated
	 */
	org.eclipse.mdht.uml.fhir.core.datatype.String getTitle();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.ImagingStudySeriesInstance#getTitle <em>Title</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' reference.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(org.eclipse.mdht.uml.fhir.core.datatype.String value);

	/**
	 * Returns the value of the '<em><b>Content</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.mdht.uml.fhir.core.datatype.Attachment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content</em>' reference list.
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getImagingStudySeriesInstance_Content()
	 * @model
	 * @generated
	 */
	EList<Attachment> getContents();

} // ImagingStudySeriesInstance
