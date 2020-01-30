/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.Annotation;
import fhiRCore.dataTypes.BackboneElement;
import fhiRCore.dataTypes.Code;
import fhiRCore.dataTypes.CodeableConcept;
import fhiRCore.dataTypes.Decimal;
import fhiRCore.dataTypes.Quantity;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vision Prescription Lens Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.VisionPrescriptionLensSpecification#getProduct <em>Product</em>}</li>
 *   <li>{@link fhiRCore.resources.VisionPrescriptionLensSpecification#getEye <em>Eye</em>}</li>
 *   <li>{@link fhiRCore.resources.VisionPrescriptionLensSpecification#getSphere <em>Sphere</em>}</li>
 *   <li>{@link fhiRCore.resources.VisionPrescriptionLensSpecification#getCylinder <em>Cylinder</em>}</li>
 *   <li>{@link fhiRCore.resources.VisionPrescriptionLensSpecification#getAxis <em>Axis</em>}</li>
 *   <li>{@link fhiRCore.resources.VisionPrescriptionLensSpecification#getPrisms <em>Prism</em>}</li>
 *   <li>{@link fhiRCore.resources.VisionPrescriptionLensSpecification#getAdd <em>Add</em>}</li>
 *   <li>{@link fhiRCore.resources.VisionPrescriptionLensSpecification#getPower <em>Power</em>}</li>
 *   <li>{@link fhiRCore.resources.VisionPrescriptionLensSpecification#getBackCurve <em>Back Curve</em>}</li>
 *   <li>{@link fhiRCore.resources.VisionPrescriptionLensSpecification#getDiameter <em>Diameter</em>}</li>
 *   <li>{@link fhiRCore.resources.VisionPrescriptionLensSpecification#getDuration <em>Duration</em>}</li>
 *   <li>{@link fhiRCore.resources.VisionPrescriptionLensSpecification#getColor <em>Color</em>}</li>
 *   <li>{@link fhiRCore.resources.VisionPrescriptionLensSpecification#getBrand <em>Brand</em>}</li>
 *   <li>{@link fhiRCore.resources.VisionPrescriptionLensSpecification#getNotes <em>Note</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getVisionPrescriptionLensSpecification()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='VisionPrescription_LensSpecification'"
 * @generated
 */
public interface VisionPrescriptionLensSpecification extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Product</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product</em>' containment reference.
	 * @see #setProduct(CodeableConcept)
	 * @see fhiRCore.resources.ResourcesPackage#getVisionPrescriptionLensSpecification_Product()
	 * @model containment="true" required="true"
	 * @generated
	 */
	CodeableConcept getProduct();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.VisionPrescriptionLensSpecification#getProduct <em>Product</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product</em>' containment reference.
	 * @see #getProduct()
	 * @generated
	 */
	void setProduct(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Eye</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Eye</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Eye</em>' containment reference.
	 * @see #setEye(Code)
	 * @see fhiRCore.resources.ResourcesPackage#getVisionPrescriptionLensSpecification_Eye()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Code getEye();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.VisionPrescriptionLensSpecification#getEye <em>Eye</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Eye</em>' containment reference.
	 * @see #getEye()
	 * @generated
	 */
	void setEye(Code value);

	/**
	 * Returns the value of the '<em><b>Sphere</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sphere</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sphere</em>' containment reference.
	 * @see #setSphere(Decimal)
	 * @see fhiRCore.resources.ResourcesPackage#getVisionPrescriptionLensSpecification_Sphere()
	 * @model containment="true"
	 * @generated
	 */
	Decimal getSphere();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.VisionPrescriptionLensSpecification#getSphere <em>Sphere</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sphere</em>' containment reference.
	 * @see #getSphere()
	 * @generated
	 */
	void setSphere(Decimal value);

	/**
	 * Returns the value of the '<em><b>Cylinder</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cylinder</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cylinder</em>' containment reference.
	 * @see #setCylinder(Decimal)
	 * @see fhiRCore.resources.ResourcesPackage#getVisionPrescriptionLensSpecification_Cylinder()
	 * @model containment="true"
	 * @generated
	 */
	Decimal getCylinder();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.VisionPrescriptionLensSpecification#getCylinder <em>Cylinder</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cylinder</em>' containment reference.
	 * @see #getCylinder()
	 * @generated
	 */
	void setCylinder(Decimal value);

	/**
	 * Returns the value of the '<em><b>Axis</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Axis</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Axis</em>' containment reference.
	 * @see #setAxis(fhiRCore.dataTypes.Integer)
	 * @see fhiRCore.resources.ResourcesPackage#getVisionPrescriptionLensSpecification_Axis()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.Integer getAxis();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.VisionPrescriptionLensSpecification#getAxis <em>Axis</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Axis</em>' containment reference.
	 * @see #getAxis()
	 * @generated
	 */
	void setAxis(fhiRCore.dataTypes.Integer value);

	/**
	 * Returns the value of the '<em><b>Prism</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.resources.VisionPrescriptionLensSpecificationPrism}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prism</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prism</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getVisionPrescriptionLensSpecification_Prism()
	 * @model containment="true"
	 * @generated
	 */
	EList<VisionPrescriptionLensSpecificationPrism> getPrisms();

	/**
	 * Returns the value of the '<em><b>Add</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Add</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Add</em>' containment reference.
	 * @see #setAdd(Decimal)
	 * @see fhiRCore.resources.ResourcesPackage#getVisionPrescriptionLensSpecification_Add()
	 * @model containment="true"
	 * @generated
	 */
	Decimal getAdd();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.VisionPrescriptionLensSpecification#getAdd <em>Add</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Add</em>' containment reference.
	 * @see #getAdd()
	 * @generated
	 */
	void setAdd(Decimal value);

	/**
	 * Returns the value of the '<em><b>Power</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Power</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Power</em>' containment reference.
	 * @see #setPower(Decimal)
	 * @see fhiRCore.resources.ResourcesPackage#getVisionPrescriptionLensSpecification_Power()
	 * @model containment="true"
	 * @generated
	 */
	Decimal getPower();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.VisionPrescriptionLensSpecification#getPower <em>Power</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Power</em>' containment reference.
	 * @see #getPower()
	 * @generated
	 */
	void setPower(Decimal value);

	/**
	 * Returns the value of the '<em><b>Back Curve</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Back Curve</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Back Curve</em>' containment reference.
	 * @see #setBackCurve(Decimal)
	 * @see fhiRCore.resources.ResourcesPackage#getVisionPrescriptionLensSpecification_BackCurve()
	 * @model containment="true"
	 * @generated
	 */
	Decimal getBackCurve();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.VisionPrescriptionLensSpecification#getBackCurve <em>Back Curve</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Back Curve</em>' containment reference.
	 * @see #getBackCurve()
	 * @generated
	 */
	void setBackCurve(Decimal value);

	/**
	 * Returns the value of the '<em><b>Diameter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Diameter</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diameter</em>' containment reference.
	 * @see #setDiameter(Decimal)
	 * @see fhiRCore.resources.ResourcesPackage#getVisionPrescriptionLensSpecification_Diameter()
	 * @model containment="true"
	 * @generated
	 */
	Decimal getDiameter();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.VisionPrescriptionLensSpecification#getDiameter <em>Diameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Diameter</em>' containment reference.
	 * @see #getDiameter()
	 * @generated
	 */
	void setDiameter(Decimal value);

	/**
	 * Returns the value of the '<em><b>Duration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Duration</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duration</em>' containment reference.
	 * @see #setDuration(Quantity)
	 * @see fhiRCore.resources.ResourcesPackage#getVisionPrescriptionLensSpecification_Duration()
	 * @model containment="true"
	 * @generated
	 */
	Quantity getDuration();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.VisionPrescriptionLensSpecification#getDuration <em>Duration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration</em>' containment reference.
	 * @see #getDuration()
	 * @generated
	 */
	void setDuration(Quantity value);

	/**
	 * Returns the value of the '<em><b>Color</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Color</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Color</em>' containment reference.
	 * @see #setColor(fhiRCore.dataTypes.String)
	 * @see fhiRCore.resources.ResourcesPackage#getVisionPrescriptionLensSpecification_Color()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getColor();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.VisionPrescriptionLensSpecification#getColor <em>Color</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color</em>' containment reference.
	 * @see #getColor()
	 * @generated
	 */
	void setColor(fhiRCore.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Brand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Brand</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Brand</em>' containment reference.
	 * @see #setBrand(fhiRCore.dataTypes.String)
	 * @see fhiRCore.resources.ResourcesPackage#getVisionPrescriptionLensSpecification_Brand()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getBrand();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.VisionPrescriptionLensSpecification#getBrand <em>Brand</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Brand</em>' containment reference.
	 * @see #getBrand()
	 * @generated
	 */
	void setBrand(fhiRCore.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Note</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.Annotation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Note</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Note</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getVisionPrescriptionLensSpecification_Note()
	 * @model containment="true"
	 * @generated
	 */
	EList<Annotation> getNotes();

} // VisionPrescriptionLensSpecification
