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
import org.eclipse.mdht.uml.fhir.core.datatype.Coding;
import org.eclipse.mdht.uml.fhir.core.datatype.Decimal;
import org.eclipse.mdht.uml.fhir.core.datatype.SimpleQuantity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vision Prescription Dispense</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.VisionPrescriptionDispense#getProduct <em>Product</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.VisionPrescriptionDispense#getEye <em>Eye</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.VisionPrescriptionDispense#getSphere <em>Sphere</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.VisionPrescriptionDispense#getCylinder <em>Cylinder</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.VisionPrescriptionDispense#getAxis <em>Axis</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.VisionPrescriptionDispense#getPrism <em>Prism</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.VisionPrescriptionDispense#getBase <em>Base</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.VisionPrescriptionDispense#getAdd <em>Add</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.VisionPrescriptionDispense#getPower <em>Power</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.VisionPrescriptionDispense#getBackCurve <em>Back Curve</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.VisionPrescriptionDispense#getDiameter <em>Diameter</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.VisionPrescriptionDispense#getDuration <em>Duration</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.VisionPrescriptionDispense#getColor <em>Color</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.VisionPrescriptionDispense#getBrand <em>Brand</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.VisionPrescriptionDispense#getNotes <em>Notes</em>}</li>
 * </ul>
 *
 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getVisionPrescriptionDispense()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='VisionPrescription_Dispense'"
 * @generated
 */
public interface VisionPrescriptionDispense extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Product</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product</em>' reference.
	 * @see #setProduct(Coding)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getVisionPrescriptionDispense_Product()
	 * @model required="true"
	 * @generated
	 */
	Coding getProduct();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.VisionPrescriptionDispense#getProduct <em>Product</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product</em>' reference.
	 * @see #getProduct()
	 * @generated
	 */
	void setProduct(Coding value);

	/**
	 * Returns the value of the '<em><b>Eye</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Eye</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Eye</em>' reference.
	 * @see #setEye(Code)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getVisionPrescriptionDispense_Eye()
	 * @model
	 * @generated
	 */
	Code getEye();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.VisionPrescriptionDispense#getEye <em>Eye</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Eye</em>' reference.
	 * @see #getEye()
	 * @generated
	 */
	void setEye(Code value);

	/**
	 * Returns the value of the '<em><b>Sphere</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sphere</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sphere</em>' reference.
	 * @see #setSphere(Decimal)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getVisionPrescriptionDispense_Sphere()
	 * @model
	 * @generated
	 */
	Decimal getSphere();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.VisionPrescriptionDispense#getSphere <em>Sphere</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sphere</em>' reference.
	 * @see #getSphere()
	 * @generated
	 */
	void setSphere(Decimal value);

	/**
	 * Returns the value of the '<em><b>Cylinder</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cylinder</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cylinder</em>' reference.
	 * @see #setCylinder(Decimal)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getVisionPrescriptionDispense_Cylinder()
	 * @model
	 * @generated
	 */
	Decimal getCylinder();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.VisionPrescriptionDispense#getCylinder <em>Cylinder</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cylinder</em>' reference.
	 * @see #getCylinder()
	 * @generated
	 */
	void setCylinder(Decimal value);

	/**
	 * Returns the value of the '<em><b>Axis</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Axis</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Axis</em>' reference.
	 * @see #setAxis(org.eclipse.mdht.uml.fhir.core.datatype.Integer)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getVisionPrescriptionDispense_Axis()
	 * @model
	 * @generated
	 */
	org.eclipse.mdht.uml.fhir.core.datatype.Integer getAxis();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.VisionPrescriptionDispense#getAxis <em>Axis</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Axis</em>' reference.
	 * @see #getAxis()
	 * @generated
	 */
	void setAxis(org.eclipse.mdht.uml.fhir.core.datatype.Integer value);

	/**
	 * Returns the value of the '<em><b>Prism</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prism</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prism</em>' reference.
	 * @see #setPrism(Decimal)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getVisionPrescriptionDispense_Prism()
	 * @model
	 * @generated
	 */
	Decimal getPrism();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.VisionPrescriptionDispense#getPrism <em>Prism</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prism</em>' reference.
	 * @see #getPrism()
	 * @generated
	 */
	void setPrism(Decimal value);

	/**
	 * Returns the value of the '<em><b>Base</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base</em>' reference.
	 * @see #setBase(Code)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getVisionPrescriptionDispense_Base()
	 * @model
	 * @generated
	 */
	Code getBase();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.VisionPrescriptionDispense#getBase <em>Base</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base</em>' reference.
	 * @see #getBase()
	 * @generated
	 */
	void setBase(Code value);

	/**
	 * Returns the value of the '<em><b>Add</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Add</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Add</em>' reference.
	 * @see #setAdd(Decimal)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getVisionPrescriptionDispense_Add()
	 * @model
	 * @generated
	 */
	Decimal getAdd();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.VisionPrescriptionDispense#getAdd <em>Add</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Add</em>' reference.
	 * @see #getAdd()
	 * @generated
	 */
	void setAdd(Decimal value);

	/**
	 * Returns the value of the '<em><b>Power</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Power</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Power</em>' reference.
	 * @see #setPower(Decimal)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getVisionPrescriptionDispense_Power()
	 * @model
	 * @generated
	 */
	Decimal getPower();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.VisionPrescriptionDispense#getPower <em>Power</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Power</em>' reference.
	 * @see #getPower()
	 * @generated
	 */
	void setPower(Decimal value);

	/**
	 * Returns the value of the '<em><b>Back Curve</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Back Curve</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Back Curve</em>' reference.
	 * @see #setBackCurve(Decimal)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getVisionPrescriptionDispense_BackCurve()
	 * @model
	 * @generated
	 */
	Decimal getBackCurve();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.VisionPrescriptionDispense#getBackCurve <em>Back Curve</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Back Curve</em>' reference.
	 * @see #getBackCurve()
	 * @generated
	 */
	void setBackCurve(Decimal value);

	/**
	 * Returns the value of the '<em><b>Diameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Diameter</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diameter</em>' reference.
	 * @see #setDiameter(Decimal)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getVisionPrescriptionDispense_Diameter()
	 * @model
	 * @generated
	 */
	Decimal getDiameter();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.VisionPrescriptionDispense#getDiameter <em>Diameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Diameter</em>' reference.
	 * @see #getDiameter()
	 * @generated
	 */
	void setDiameter(Decimal value);

	/**
	 * Returns the value of the '<em><b>Duration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Duration</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duration</em>' reference.
	 * @see #setDuration(SimpleQuantity)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getVisionPrescriptionDispense_Duration()
	 * @model
	 * @generated
	 */
	SimpleQuantity getDuration();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.VisionPrescriptionDispense#getDuration <em>Duration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration</em>' reference.
	 * @see #getDuration()
	 * @generated
	 */
	void setDuration(SimpleQuantity value);

	/**
	 * Returns the value of the '<em><b>Color</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Color</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Color</em>' reference.
	 * @see #setColor(org.eclipse.mdht.uml.fhir.core.datatype.String)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getVisionPrescriptionDispense_Color()
	 * @model
	 * @generated
	 */
	org.eclipse.mdht.uml.fhir.core.datatype.String getColor();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.VisionPrescriptionDispense#getColor <em>Color</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color</em>' reference.
	 * @see #getColor()
	 * @generated
	 */
	void setColor(org.eclipse.mdht.uml.fhir.core.datatype.String value);

	/**
	 * Returns the value of the '<em><b>Brand</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Brand</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Brand</em>' reference.
	 * @see #setBrand(org.eclipse.mdht.uml.fhir.core.datatype.String)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getVisionPrescriptionDispense_Brand()
	 * @model
	 * @generated
	 */
	org.eclipse.mdht.uml.fhir.core.datatype.String getBrand();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.VisionPrescriptionDispense#getBrand <em>Brand</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Brand</em>' reference.
	 * @see #getBrand()
	 * @generated
	 */
	void setBrand(org.eclipse.mdht.uml.fhir.core.datatype.String value);

	/**
	 * Returns the value of the '<em><b>Notes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Notes</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Notes</em>' reference.
	 * @see #setNotes(org.eclipse.mdht.uml.fhir.core.datatype.String)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getVisionPrescriptionDispense_Notes()
	 * @model
	 * @generated
	 */
	org.eclipse.mdht.uml.fhir.core.datatype.String getNotes();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.VisionPrescriptionDispense#getNotes <em>Notes</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Notes</em>' reference.
	 * @see #getNotes()
	 * @generated
	 */
	void setNotes(org.eclipse.mdht.uml.fhir.core.datatype.String value);

} // VisionPrescriptionDispense
