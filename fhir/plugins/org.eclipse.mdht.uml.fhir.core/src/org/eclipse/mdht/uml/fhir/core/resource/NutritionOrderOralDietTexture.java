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
import org.eclipse.mdht.uml.fhir.core.datatype.CodeableConcept;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Nutrition Order Oral Diet Texture</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.NutritionOrderOralDietTexture#getModifier <em>Modifier</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.NutritionOrderOralDietTexture#getFoodType <em>Food Type</em>}</li>
 * </ul>
 *
 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getNutritionOrderOralDietTexture()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='OralDiet_Texture'"
 * @generated
 */
public interface NutritionOrderOralDietTexture extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Modifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modifier</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modifier</em>' reference.
	 * @see #setModifier(CodeableConcept)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getNutritionOrderOralDietTexture_Modifier()
	 * @model
	 * @generated
	 */
	CodeableConcept getModifier();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.NutritionOrderOralDietTexture#getModifier <em>Modifier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modifier</em>' reference.
	 * @see #getModifier()
	 * @generated
	 */
	void setModifier(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Food Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Food Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Food Type</em>' reference.
	 * @see #setFoodType(CodeableConcept)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getNutritionOrderOralDietTexture_FoodType()
	 * @model
	 * @generated
	 */
	CodeableConcept getFoodType();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.NutritionOrderOralDietTexture#getFoodType <em>Food Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Food Type</em>' reference.
	 * @see #getFoodType()
	 * @generated
	 */
	void setFoodType(CodeableConcept value);

} // NutritionOrderOralDietTexture
