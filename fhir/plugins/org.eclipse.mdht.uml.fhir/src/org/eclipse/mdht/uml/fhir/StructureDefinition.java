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
package org.eclipse.mdht.uml.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Structure Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.StructureDefinition#getBase_Class <em>Base Class</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.StructureDefinition#getDisplay <em>Display</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.StructureDefinition#getContextType <em>Context Type</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.StructureDefinition#getContexts <em>Context</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.StructureDefinition#getIsLogical <em>Is Logical</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.StructureDefinition#getDerivation <em>Derivation</em>}</li>
 * </ul>
 *
 * @see org.eclipse.mdht.uml.fhir.FHIRPackage#getStructureDefinition()
 * @model
 * @generated
 */
public interface StructureDefinition extends ConformanceResource {
	/**
	 * Returns the value of the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Class</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Class</em>' reference.
	 * @see #setBase_Class(org.eclipse.uml2.uml.Class)
	 * @see org.eclipse.mdht.uml.fhir.FHIRPackage#getStructureDefinition_Base_Class()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	org.eclipse.uml2.uml.Class getBase_Class();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.StructureDefinition#getBase_Class <em>Base Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Class</em>' reference.
	 * @see #getBase_Class()
	 * @generated
	 */
	void setBase_Class(org.eclipse.uml2.uml.Class value);

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
	 * @see org.eclipse.mdht.uml.fhir.FHIRPackage#getStructureDefinition_Display()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	String getDisplay();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.StructureDefinition#getDisplay <em>Display</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Display</em>' attribute.
	 * @see #getDisplay()
	 * @generated
	 */
	void setDisplay(String value);

	/**
	 * Returns the value of the '<em><b>Context Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Context Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context Type</em>' attribute.
	 * @see #setContextType(String)
	 * @see org.eclipse.mdht.uml.fhir.FHIRPackage#getStructureDefinition_ContextType()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	String getContextType();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.StructureDefinition#getContextType <em>Context Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context Type</em>' attribute.
	 * @see #getContextType()
	 * @generated
	 */
	void setContextType(String value);

	/**
	 * Returns the value of the '<em><b>Context</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Context</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context</em>' attribute list.
	 * @see org.eclipse.mdht.uml.fhir.FHIRPackage#getStructureDefinition_Context()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	EList<String> getContexts();

	/**
	 * Returns the value of the '<em><b>Is Logical</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Logical</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Logical</em>' attribute.
	 * @see #setIsLogical(Boolean)
	 * @see org.eclipse.mdht.uml.fhir.FHIRPackage#getStructureDefinition_IsLogical()
	 * @model ordered="false"
	 * @generated
	 */
	Boolean getIsLogical();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.StructureDefinition#getIsLogical <em>Is Logical</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Logical</em>' attribute.
	 * @see #getIsLogical()
	 * @generated
	 */
	void setIsLogical(Boolean value);

	/**
	 * Returns the value of the '<em><b>Derivation</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.mdht.uml.fhir.DerivationKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Derivation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Derivation</em>' attribute.
	 * @see org.eclipse.mdht.uml.fhir.DerivationKind
	 * @see #isSetDerivation()
	 * @see #unsetDerivation()
	 * @see #setDerivation(DerivationKind)
	 * @see org.eclipse.mdht.uml.fhir.FHIRPackage#getStructureDefinition_Derivation()
	 * @model unsettable="true" ordered="false"
	 * @generated
	 */
	DerivationKind getDerivation();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.StructureDefinition#getDerivation <em>Derivation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Derivation</em>' attribute.
	 * @see org.eclipse.mdht.uml.fhir.DerivationKind
	 * @see #isSetDerivation()
	 * @see #unsetDerivation()
	 * @see #getDerivation()
	 * @generated
	 */
	void setDerivation(DerivationKind value);

	/**
	 * Unsets the value of the '{@link org.eclipse.mdht.uml.fhir.StructureDefinition#getDerivation <em>Derivation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDerivation()
	 * @see #getDerivation()
	 * @see #setDerivation(DerivationKind)
	 * @generated
	 */
	void unsetDerivation();

	/**
	 * Returns whether the value of the '{@link org.eclipse.mdht.uml.fhir.StructureDefinition#getDerivation <em>Derivation</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Derivation</em>' attribute is set.
	 * @see #unsetDerivation()
	 * @see #getDerivation()
	 * @see #setDerivation(DerivationKind)
	 * @generated
	 */
	boolean isSetDerivation();

} // StructureDefinition
