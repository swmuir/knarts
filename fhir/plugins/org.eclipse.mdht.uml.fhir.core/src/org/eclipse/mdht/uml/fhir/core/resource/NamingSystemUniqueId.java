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
import org.eclipse.mdht.uml.fhir.core.datatype.Code;
import org.eclipse.mdht.uml.fhir.core.datatype.Period;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Naming System Unique Id</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.NamingSystemUniqueId#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.NamingSystemUniqueId#getValue <em>Value</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.NamingSystemUniqueId#getPreferred <em>Preferred</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.NamingSystemUniqueId#getPeriod <em>Period</em>}</li>
 * </ul>
 *
 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getNamingSystemUniqueId()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='NamingSystem_UniqueId'"
 * @generated
 */
public interface NamingSystemUniqueId extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(Code)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getNamingSystemUniqueId_Type()
	 * @model required="true"
	 * @generated
	 */
	Code getType();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.NamingSystemUniqueId#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(Code value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' reference.
	 * @see #setValue(org.eclipse.mdht.uml.fhir.core.datatype.String)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getNamingSystemUniqueId_Value()
	 * @model required="true"
	 * @generated
	 */
	org.eclipse.mdht.uml.fhir.core.datatype.String getValue();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.NamingSystemUniqueId#getValue <em>Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(org.eclipse.mdht.uml.fhir.core.datatype.String value);

	/**
	 * Returns the value of the '<em><b>Preferred</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Preferred</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Preferred</em>' reference.
	 * @see #setPreferred(org.eclipse.mdht.uml.fhir.core.datatype.Boolean)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getNamingSystemUniqueId_Preferred()
	 * @model
	 * @generated
	 */
	org.eclipse.mdht.uml.fhir.core.datatype.Boolean getPreferred();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.NamingSystemUniqueId#getPreferred <em>Preferred</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Preferred</em>' reference.
	 * @see #getPreferred()
	 * @generated
	 */
	void setPreferred(org.eclipse.mdht.uml.fhir.core.datatype.Boolean value);

	/**
	 * Returns the value of the '<em><b>Period</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Period</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Period</em>' reference.
	 * @see #setPeriod(Period)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getNamingSystemUniqueId_Period()
	 * @model
	 * @generated
	 */
	Period getPeriod();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.NamingSystemUniqueId#getPeriod <em>Period</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Period</em>' reference.
	 * @see #getPeriod()
	 * @generated
	 */
	void setPeriod(Period value);

} // NamingSystemUniqueId
