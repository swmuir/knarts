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
import org.eclipse.mdht.uml.fhir.core.datatype.DateTime;
import org.eclipse.mdht.uml.fhir.core.datatype.Uri;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Value Set Expansion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.ValueSetExpansion#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.ValueSetExpansion#getTimestamp <em>Timestamp</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.ValueSetExpansion#getTotal <em>Total</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.ValueSetExpansion#getOffset <em>Offset</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.ValueSetExpansion#getParameters <em>Parameter</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.ValueSetExpansion#getContains <em>Contains</em>}</li>
 * </ul>
 *
 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getValueSetExpansion()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='ValueSet_Expansion'"
 * @generated
 */
public interface ValueSetExpansion extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Identifier</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identifier</em>' reference.
	 * @see #setIdentifier(Uri)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getValueSetExpansion_Identifier()
	 * @model required="true"
	 * @generated
	 */
	Uri getIdentifier();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.ValueSetExpansion#getIdentifier <em>Identifier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identifier</em>' reference.
	 * @see #getIdentifier()
	 * @generated
	 */
	void setIdentifier(Uri value);

	/**
	 * Returns the value of the '<em><b>Timestamp</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Timestamp</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timestamp</em>' reference.
	 * @see #setTimestamp(DateTime)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getValueSetExpansion_Timestamp()
	 * @model required="true"
	 * @generated
	 */
	DateTime getTimestamp();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.ValueSetExpansion#getTimestamp <em>Timestamp</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timestamp</em>' reference.
	 * @see #getTimestamp()
	 * @generated
	 */
	void setTimestamp(DateTime value);

	/**
	 * Returns the value of the '<em><b>Total</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Total</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total</em>' reference.
	 * @see #setTotal(org.eclipse.mdht.uml.fhir.core.datatype.Integer)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getValueSetExpansion_Total()
	 * @model
	 * @generated
	 */
	org.eclipse.mdht.uml.fhir.core.datatype.Integer getTotal();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.ValueSetExpansion#getTotal <em>Total</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total</em>' reference.
	 * @see #getTotal()
	 * @generated
	 */
	void setTotal(org.eclipse.mdht.uml.fhir.core.datatype.Integer value);

	/**
	 * Returns the value of the '<em><b>Offset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Offset</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Offset</em>' reference.
	 * @see #setOffset(org.eclipse.mdht.uml.fhir.core.datatype.Integer)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getValueSetExpansion_Offset()
	 * @model
	 * @generated
	 */
	org.eclipse.mdht.uml.fhir.core.datatype.Integer getOffset();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.ValueSetExpansion#getOffset <em>Offset</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Offset</em>' reference.
	 * @see #getOffset()
	 * @generated
	 */
	void setOffset(org.eclipse.mdht.uml.fhir.core.datatype.Integer value);

	/**
	 * Returns the value of the '<em><b>Parameter</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.mdht.uml.fhir.core.resource.ValueSetExpansionParameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameter</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter</em>' containment reference list.
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getValueSetExpansion_Parameter()
	 * @model containment="true"
	 * @generated
	 */
	EList<ValueSetExpansionParameter> getParameters();

	/**
	 * Returns the value of the '<em><b>Contains</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.mdht.uml.fhir.core.resource.ValueSetExpansionContains}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contains</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contains</em>' containment reference list.
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getValueSetExpansion_Contains()
	 * @model containment="true"
	 * @generated
	 */
	EList<ValueSetExpansionContains> getContains();

} // ValueSetExpansion
