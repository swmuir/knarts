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
import org.eclipse.mdht.uml.fhir.core.datatype.CodeableConcept;
import org.eclipse.mdht.uml.fhir.core.datatype.SimpleQuantity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Nutrition Order Enteral Formula</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.NutritionOrderEnteralFormula#getBaseFormulaType <em>Base Formula Type</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.NutritionOrderEnteralFormula#getBaseFormulaProductName <em>Base Formula Product Name</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.NutritionOrderEnteralFormula#getAdditiveType <em>Additive Type</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.NutritionOrderEnteralFormula#getAdditiveProductName <em>Additive Product Name</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.NutritionOrderEnteralFormula#getCaloricDensity <em>Caloric Density</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.NutritionOrderEnteralFormula#getRouteofAdministration <em>Routeof Administration</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.NutritionOrderEnteralFormula#getAdministrations <em>Administration</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.NutritionOrderEnteralFormula#getMaxVolumeToDeliver <em>Max Volume To Deliver</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.NutritionOrderEnteralFormula#getAdministrationInstruction <em>Administration Instruction</em>}</li>
 * </ul>
 *
 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getNutritionOrderEnteralFormula()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='NutritionOrder_EnteralFormula'"
 * @generated
 */
public interface NutritionOrderEnteralFormula extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Base Formula Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Formula Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Formula Type</em>' reference.
	 * @see #setBaseFormulaType(CodeableConcept)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getNutritionOrderEnteralFormula_BaseFormulaType()
	 * @model
	 * @generated
	 */
	CodeableConcept getBaseFormulaType();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.NutritionOrderEnteralFormula#getBaseFormulaType <em>Base Formula Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Formula Type</em>' reference.
	 * @see #getBaseFormulaType()
	 * @generated
	 */
	void setBaseFormulaType(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Base Formula Product Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Formula Product Name</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Formula Product Name</em>' reference.
	 * @see #setBaseFormulaProductName(org.eclipse.mdht.uml.fhir.core.datatype.String)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getNutritionOrderEnteralFormula_BaseFormulaProductName()
	 * @model
	 * @generated
	 */
	org.eclipse.mdht.uml.fhir.core.datatype.String getBaseFormulaProductName();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.NutritionOrderEnteralFormula#getBaseFormulaProductName <em>Base Formula Product Name</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Formula Product Name</em>' reference.
	 * @see #getBaseFormulaProductName()
	 * @generated
	 */
	void setBaseFormulaProductName(org.eclipse.mdht.uml.fhir.core.datatype.String value);

	/**
	 * Returns the value of the '<em><b>Additive Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Additive Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Additive Type</em>' reference.
	 * @see #setAdditiveType(CodeableConcept)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getNutritionOrderEnteralFormula_AdditiveType()
	 * @model
	 * @generated
	 */
	CodeableConcept getAdditiveType();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.NutritionOrderEnteralFormula#getAdditiveType <em>Additive Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additive Type</em>' reference.
	 * @see #getAdditiveType()
	 * @generated
	 */
	void setAdditiveType(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Additive Product Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Additive Product Name</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Additive Product Name</em>' reference.
	 * @see #setAdditiveProductName(org.eclipse.mdht.uml.fhir.core.datatype.String)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getNutritionOrderEnteralFormula_AdditiveProductName()
	 * @model
	 * @generated
	 */
	org.eclipse.mdht.uml.fhir.core.datatype.String getAdditiveProductName();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.NutritionOrderEnteralFormula#getAdditiveProductName <em>Additive Product Name</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additive Product Name</em>' reference.
	 * @see #getAdditiveProductName()
	 * @generated
	 */
	void setAdditiveProductName(org.eclipse.mdht.uml.fhir.core.datatype.String value);

	/**
	 * Returns the value of the '<em><b>Caloric Density</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Caloric Density</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Caloric Density</em>' reference.
	 * @see #setCaloricDensity(SimpleQuantity)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getNutritionOrderEnteralFormula_CaloricDensity()
	 * @model
	 * @generated
	 */
	SimpleQuantity getCaloricDensity();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.NutritionOrderEnteralFormula#getCaloricDensity <em>Caloric Density</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Caloric Density</em>' reference.
	 * @see #getCaloricDensity()
	 * @generated
	 */
	void setCaloricDensity(SimpleQuantity value);

	/**
	 * Returns the value of the '<em><b>Routeof Administration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Routeof Administration</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Routeof Administration</em>' reference.
	 * @see #setRouteofAdministration(CodeableConcept)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getNutritionOrderEnteralFormula_RouteofAdministration()
	 * @model
	 * @generated
	 */
	CodeableConcept getRouteofAdministration();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.NutritionOrderEnteralFormula#getRouteofAdministration <em>Routeof Administration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Routeof Administration</em>' reference.
	 * @see #getRouteofAdministration()
	 * @generated
	 */
	void setRouteofAdministration(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Administration</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.mdht.uml.fhir.core.resource.NutritionOrderEnteralFormulaAdministration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Administration</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Administration</em>' containment reference list.
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getNutritionOrderEnteralFormula_Administration()
	 * @model containment="true"
	 * @generated
	 */
	EList<NutritionOrderEnteralFormulaAdministration> getAdministrations();

	/**
	 * Returns the value of the '<em><b>Max Volume To Deliver</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Volume To Deliver</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Volume To Deliver</em>' reference.
	 * @see #setMaxVolumeToDeliver(SimpleQuantity)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getNutritionOrderEnteralFormula_MaxVolumeToDeliver()
	 * @model
	 * @generated
	 */
	SimpleQuantity getMaxVolumeToDeliver();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.NutritionOrderEnteralFormula#getMaxVolumeToDeliver <em>Max Volume To Deliver</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Volume To Deliver</em>' reference.
	 * @see #getMaxVolumeToDeliver()
	 * @generated
	 */
	void setMaxVolumeToDeliver(SimpleQuantity value);

	/**
	 * Returns the value of the '<em><b>Administration Instruction</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Administration Instruction</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Administration Instruction</em>' reference.
	 * @see #setAdministrationInstruction(org.eclipse.mdht.uml.fhir.core.datatype.String)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getNutritionOrderEnteralFormula_AdministrationInstruction()
	 * @model
	 * @generated
	 */
	org.eclipse.mdht.uml.fhir.core.datatype.String getAdministrationInstruction();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.NutritionOrderEnteralFormula#getAdministrationInstruction <em>Administration Instruction</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Administration Instruction</em>' reference.
	 * @see #getAdministrationInstruction()
	 * @generated
	 */
	void setAdministrationInstruction(org.eclipse.mdht.uml.fhir.core.datatype.String value);

} // NutritionOrderEnteralFormula
