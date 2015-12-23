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
package org.eclipse.mdht.uml.fhir.core.datatype;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element Definition Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.datatype.ElementDefinitionConstraint#getKey <em>Key</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.datatype.ElementDefinitionConstraint#getRequirements <em>Requirements</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.datatype.ElementDefinitionConstraint#getSeverity <em>Severity</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.datatype.ElementDefinitionConstraint#getHuman <em>Human</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.datatype.ElementDefinitionConstraint#getXpath <em>Xpath</em>}</li>
 * </ul>
 *
 * @see org.eclipse.mdht.uml.fhir.core.datatype.FhirDatatypePackage#getElementDefinitionConstraint()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='ElementDefinition_Constraint'"
 * @generated
 */
public interface ElementDefinitionConstraint extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Key</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Key</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key</em>' reference.
	 * @see #setKey(Id)
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.FhirDatatypePackage#getElementDefinitionConstraint_Key()
	 * @model required="true"
	 * @generated
	 */
	Id getKey();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.datatype.ElementDefinitionConstraint#getKey <em>Key</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key</em>' reference.
	 * @see #getKey()
	 * @generated
	 */
	void setKey(Id value);

	/**
	 * Returns the value of the '<em><b>Requirements</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Requirements</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requirements</em>' reference.
	 * @see #setRequirements(org.eclipse.mdht.uml.fhir.core.datatype.String)
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.FhirDatatypePackage#getElementDefinitionConstraint_Requirements()
	 * @model
	 * @generated
	 */
	org.eclipse.mdht.uml.fhir.core.datatype.String getRequirements();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.datatype.ElementDefinitionConstraint#getRequirements <em>Requirements</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Requirements</em>' reference.
	 * @see #getRequirements()
	 * @generated
	 */
	void setRequirements(org.eclipse.mdht.uml.fhir.core.datatype.String value);

	/**
	 * Returns the value of the '<em><b>Severity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Severity</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Severity</em>' reference.
	 * @see #setSeverity(Code)
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.FhirDatatypePackage#getElementDefinitionConstraint_Severity()
	 * @model required="true"
	 * @generated
	 */
	Code getSeverity();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.datatype.ElementDefinitionConstraint#getSeverity <em>Severity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Severity</em>' reference.
	 * @see #getSeverity()
	 * @generated
	 */
	void setSeverity(Code value);

	/**
	 * Returns the value of the '<em><b>Human</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Human</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Human</em>' reference.
	 * @see #setHuman(org.eclipse.mdht.uml.fhir.core.datatype.String)
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.FhirDatatypePackage#getElementDefinitionConstraint_Human()
	 * @model required="true"
	 * @generated
	 */
	org.eclipse.mdht.uml.fhir.core.datatype.String getHuman();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.datatype.ElementDefinitionConstraint#getHuman <em>Human</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Human</em>' reference.
	 * @see #getHuman()
	 * @generated
	 */
	void setHuman(org.eclipse.mdht.uml.fhir.core.datatype.String value);

	/**
	 * Returns the value of the '<em><b>Xpath</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Xpath</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Xpath</em>' reference.
	 * @see #setXpath(org.eclipse.mdht.uml.fhir.core.datatype.String)
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.FhirDatatypePackage#getElementDefinitionConstraint_Xpath()
	 * @model required="true"
	 * @generated
	 */
	org.eclipse.mdht.uml.fhir.core.datatype.String getXpath();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.datatype.ElementDefinitionConstraint#getXpath <em>Xpath</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Xpath</em>' reference.
	 * @see #getXpath()
	 * @generated
	 */
	void setXpath(org.eclipse.mdht.uml.fhir.core.datatype.String value);

} // ElementDefinitionConstraint
