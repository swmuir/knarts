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
import org.eclipse.mdht.uml.fhir.core.datatype.Base;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Communication Payload</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.CommunicationPayload#getContentx <em>Contentx</em>}</li>
 * </ul>
 *
 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getCommunicationPayload()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Communication_Payload'"
 * @generated
 */
public interface CommunicationPayload extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Contentx</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contentx</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contentx</em>' reference.
	 * @see #setContentx(Base)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getCommunicationPayload_Contentx()
	 * @model required="true"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='content[x]'"
	 * @generated
	 */
	Base getContentx();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.CommunicationPayload#getContentx <em>Contentx</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contentx</em>' reference.
	 * @see #getContentx()
	 * @generated
	 */
	void setContentx(Base value);

} // CommunicationPayload
