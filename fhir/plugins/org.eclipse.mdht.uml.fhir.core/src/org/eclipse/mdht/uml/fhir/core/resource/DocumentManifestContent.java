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
 * A representation of the model object '<em><b>Document Manifest Content</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.DocumentManifestContent#getPx <em>Px</em>}</li>
 * </ul>
 *
 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getDocumentManifestContent()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='DocumentManifest_Content'"
 * @generated
 */
public interface DocumentManifestContent extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Px</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Px</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Px</em>' reference.
	 * @see #setPx(Base)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getDocumentManifestContent_Px()
	 * @model required="true"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='p[x]'"
	 * @generated
	 */
	Base getPx();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.DocumentManifestContent#getPx <em>Px</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Px</em>' reference.
	 * @see #getPx()
	 * @generated
	 */
	void setPx(Base value);

} // DocumentManifestContent
