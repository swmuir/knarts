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


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Coding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.types.Coding#getSystem <em>System</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.types.Coding#getVersion <em>Version</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.types.Coding#getCode <em>Code</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.types.Coding#getDisplay <em>Display</em>}</li>
 * </ul>
 *
 * @see org.eclipse.mdht.uml.fhir.types.FHIRTypesPackage#getCoding()
 * @model
 * @generated
 */
public interface Coding extends DataType {
	/**
	 * Returns the value of the '<em><b>System</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>System</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System</em>' attribute.
	 * @see #setSystem(String)
	 * @see org.eclipse.mdht.uml.fhir.types.FHIRTypesPackage#getCoding_System()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	String getSystem();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.types.Coding#getSystem <em>System</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System</em>' attribute.
	 * @see #getSystem()
	 * @generated
	 */
	void setSystem(String value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see org.eclipse.mdht.uml.fhir.types.FHIRTypesPackage#getCoding_Version()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.types.Coding#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

	/**
	 * Returns the value of the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' attribute.
	 * @see #setCode(String)
	 * @see org.eclipse.mdht.uml.fhir.types.FHIRTypesPackage#getCoding_Code()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	String getCode();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.types.Coding#getCode <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' attribute.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(String value);

	/**
	 * Returns the value of the '<em><b>Display</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Display</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Display</em>' attribute.
	 * @see #setDisplay(String)
	 * @see org.eclipse.mdht.uml.fhir.types.FHIRTypesPackage#getCoding_Display()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	String getDisplay();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.types.Coding#getDisplay <em>Display</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Display</em>' attribute.
	 * @see #getDisplay()
	 * @generated
	 */
	void setDisplay(String value);

} // Coding
