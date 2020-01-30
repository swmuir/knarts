/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.BackboneElement;
import fhiRCore.dataTypes.CodeableConcept;
import fhiRCore.dataTypes.DataType;
import fhiRCore.dataTypes.Duration;
import fhiRCore.dataTypes.Quantity;
import fhiRCore.dataTypes.Reference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Specimen Collection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.SpecimenCollection#getCollector <em>Collector</em>}</li>
 *   <li>{@link fhiRCore.resources.SpecimenCollection#getCollectedx <em>Collectedx</em>}</li>
 *   <li>{@link fhiRCore.resources.SpecimenCollection#getDuration <em>Duration</em>}</li>
 *   <li>{@link fhiRCore.resources.SpecimenCollection#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link fhiRCore.resources.SpecimenCollection#getMethod <em>Method</em>}</li>
 *   <li>{@link fhiRCore.resources.SpecimenCollection#getBodySite <em>Body Site</em>}</li>
 *   <li>{@link fhiRCore.resources.SpecimenCollection#getFastingStatusx <em>Fasting Statusx</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getSpecimenCollection()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Specimen_Collection'"
 * @generated
 */
public interface SpecimenCollection extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Collector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Collector</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Collector</em>' containment reference.
	 * @see #setCollector(Reference)
	 * @see fhiRCore.resources.ResourcesPackage#getSpecimenCollection_Collector()
	 * @model containment="true"
	 * @generated
	 */
	Reference getCollector();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.SpecimenCollection#getCollector <em>Collector</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Collector</em>' containment reference.
	 * @see #getCollector()
	 * @generated
	 */
	void setCollector(Reference value);

	/**
	 * Returns the value of the '<em><b>Collectedx</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Collectedx</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Collectedx</em>' containment reference.
	 * @see #setCollectedx(DataType)
	 * @see fhiRCore.resources.ResourcesPackage#getSpecimenCollection_Collectedx()
	 * @model containment="true"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='collected[x]'"
	 * @generated
	 */
	DataType getCollectedx();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.SpecimenCollection#getCollectedx <em>Collectedx</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Collectedx</em>' containment reference.
	 * @see #getCollectedx()
	 * @generated
	 */
	void setCollectedx(DataType value);

	/**
	 * Returns the value of the '<em><b>Duration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Duration</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duration</em>' containment reference.
	 * @see #setDuration(Duration)
	 * @see fhiRCore.resources.ResourcesPackage#getSpecimenCollection_Duration()
	 * @model containment="true"
	 * @generated
	 */
	Duration getDuration();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.SpecimenCollection#getDuration <em>Duration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration</em>' containment reference.
	 * @see #getDuration()
	 * @generated
	 */
	void setDuration(Duration value);

	/**
	 * Returns the value of the '<em><b>Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quantity</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantity</em>' containment reference.
	 * @see #setQuantity(Quantity)
	 * @see fhiRCore.resources.ResourcesPackage#getSpecimenCollection_Quantity()
	 * @model containment="true"
	 * @generated
	 */
	Quantity getQuantity();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.SpecimenCollection#getQuantity <em>Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantity</em>' containment reference.
	 * @see #getQuantity()
	 * @generated
	 */
	void setQuantity(Quantity value);

	/**
	 * Returns the value of the '<em><b>Method</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Method</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Method</em>' containment reference.
	 * @see #setMethod(CodeableConcept)
	 * @see fhiRCore.resources.ResourcesPackage#getSpecimenCollection_Method()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getMethod();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.SpecimenCollection#getMethod <em>Method</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Method</em>' containment reference.
	 * @see #getMethod()
	 * @generated
	 */
	void setMethod(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Body Site</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Body Site</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body Site</em>' containment reference.
	 * @see #setBodySite(CodeableConcept)
	 * @see fhiRCore.resources.ResourcesPackage#getSpecimenCollection_BodySite()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getBodySite();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.SpecimenCollection#getBodySite <em>Body Site</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body Site</em>' containment reference.
	 * @see #getBodySite()
	 * @generated
	 */
	void setBodySite(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Fasting Statusx</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fasting Statusx</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fasting Statusx</em>' containment reference.
	 * @see #setFastingStatusx(DataType)
	 * @see fhiRCore.resources.ResourcesPackage#getSpecimenCollection_FastingStatusx()
	 * @model containment="true"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='fastingStatus[x]'"
	 * @generated
	 */
	DataType getFastingStatusx();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.SpecimenCollection#getFastingStatusx <em>Fasting Statusx</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fasting Statusx</em>' containment reference.
	 * @see #getFastingStatusx()
	 * @generated
	 */
	void setFastingStatusx(DataType value);

} // SpecimenCollection
