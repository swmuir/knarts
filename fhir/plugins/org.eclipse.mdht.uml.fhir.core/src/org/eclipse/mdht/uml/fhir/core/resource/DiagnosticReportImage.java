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

import org.eclipse.mdht.uml.fhir.core.datatype.BackboneElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Diagnostic Report Image</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.DiagnosticReportImage#getComment <em>Comment</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.DiagnosticReportImage#getLink <em>Link</em>}</li>
 * </ul>
 *
 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getDiagnosticReportImage()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='DiagnosticReport_Image'"
 * @generated
 */
public interface DiagnosticReportImage extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Comment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comment</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comment</em>' reference.
	 * @see #setComment(org.eclipse.mdht.uml.fhir.core.datatype.String)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getDiagnosticReportImage_Comment()
	 * @model
	 * @generated
	 */
	org.eclipse.mdht.uml.fhir.core.datatype.String getComment();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.DiagnosticReportImage#getComment <em>Comment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comment</em>' reference.
	 * @see #getComment()
	 * @generated
	 */
	void setComment(org.eclipse.mdht.uml.fhir.core.datatype.String value);

	/**
	 * Returns the value of the '<em><b>Link</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Link</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link</em>' reference.
	 * @see #setLink(Media)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getDiagnosticReportImage_Link()
	 * @model required="true"
	 * @generated
	 */
	Media getLink();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.DiagnosticReportImage#getLink <em>Link</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Link</em>' reference.
	 * @see #getLink()
	 * @generated
	 */
	void setLink(Media value);

} // DiagnosticReportImage
