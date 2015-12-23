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

import org.eclipse.mdht.uml.fhir.core.datatype.BackboneElement;
import org.eclipse.mdht.uml.fhir.core.datatype.Oid;
import org.eclipse.mdht.uml.fhir.core.datatype.Uri;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Imaging Object Selection Study Series Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.ImagingObjectSelectionStudySeriesInstance#getSopClass <em>Sop Class</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.ImagingObjectSelectionStudySeriesInstance#getUid <em>Uid</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.ImagingObjectSelectionStudySeriesInstance#getUrl <em>Url</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.ImagingObjectSelectionStudySeriesInstance#getFrames <em>Frames</em>}</li>
 * </ul>
 *
 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getImagingObjectSelectionStudySeriesInstance()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Series_Instance'"
 * @generated
 */
public interface ImagingObjectSelectionStudySeriesInstance extends BackboneElement {
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
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getImagingObjectSelectionStudySeriesInstance_SopClass()
	 * @model required="true"
	 * @generated
	 */
	Oid getSopClass();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.ImagingObjectSelectionStudySeriesInstance#getSopClass <em>Sop Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sop Class</em>' reference.
	 * @see #getSopClass()
	 * @generated
	 */
	void setSopClass(Oid value);

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
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getImagingObjectSelectionStudySeriesInstance_Uid()
	 * @model required="true"
	 * @generated
	 */
	Oid getUid();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.ImagingObjectSelectionStudySeriesInstance#getUid <em>Uid</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uid</em>' reference.
	 * @see #getUid()
	 * @generated
	 */
	void setUid(Oid value);

	/**
	 * Returns the value of the '<em><b>Url</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Url</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Url</em>' reference.
	 * @see #setUrl(Uri)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getImagingObjectSelectionStudySeriesInstance_Url()
	 * @model required="true"
	 * @generated
	 */
	Uri getUrl();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.ImagingObjectSelectionStudySeriesInstance#getUrl <em>Url</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Url</em>' reference.
	 * @see #getUrl()
	 * @generated
	 */
	void setUrl(Uri value);

	/**
	 * Returns the value of the '<em><b>Frames</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.mdht.uml.fhir.core.resource.ImagingObjectSelectionStudySeriesInstanceFrames}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Frames</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Frames</em>' containment reference list.
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getImagingObjectSelectionStudySeriesInstance_Frames()
	 * @model containment="true"
	 * @generated
	 */
	EList<ImagingObjectSelectionStudySeriesInstanceFrames> getFrames();

} // ImagingObjectSelectionStudySeriesInstance
