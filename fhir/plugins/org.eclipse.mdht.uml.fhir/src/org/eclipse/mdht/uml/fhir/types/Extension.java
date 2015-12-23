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
package org.eclipse.mdht.uml.fhir.types;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Extension</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.types.Extension#getUrl <em>Url</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.types.Extension#getValueString <em>Value String</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.types.Extension#getValueInteger <em>Value Integer</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.types.Extension#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.eclipse.mdht.uml.fhir.types.FHIRTypesPackage#getExtension()
 * @model
 * @generated
 */
public interface Extension extends EObject {
	/**
	 * Returns the value of the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Url</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Url</em>' attribute.
	 * @see #setUrl(String)
	 * @see org.eclipse.mdht.uml.fhir.types.FHIRTypesPackage#getExtension_Url()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	String getUrl();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.types.Extension#getUrl <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Url</em>' attribute.
	 * @see #getUrl()
	 * @generated
	 */
	void setUrl(String value);

	/**
	 * Returns the value of the '<em><b>Value String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value String</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value String</em>' attribute.
	 * @see #setValueString(String)
	 * @see org.eclipse.mdht.uml.fhir.types.FHIRTypesPackage#getExtension_ValueString()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	String getValueString();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.types.Extension#getValueString <em>Value String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value String</em>' attribute.
	 * @see #getValueString()
	 * @generated
	 */
	void setValueString(String value);

	/**
	 * Returns the value of the '<em><b>Value Integer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Integer</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Integer</em>' attribute.
	 * @see #setValueInteger(Integer)
	 * @see org.eclipse.mdht.uml.fhir.types.FHIRTypesPackage#getExtension_ValueInteger()
	 * @model ordered="false"
	 * @generated
	 */
	Integer getValueInteger();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.types.Extension#getValueInteger <em>Value Integer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Integer</em>' attribute.
	 * @see #getValueInteger()
	 * @generated
	 */
	void setValueInteger(Integer value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(DataType)
	 * @see org.eclipse.mdht.uml.fhir.types.FHIRTypesPackage#getExtension_Value()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	DataType getValue();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.types.Extension#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(DataType value);

} // Extension
