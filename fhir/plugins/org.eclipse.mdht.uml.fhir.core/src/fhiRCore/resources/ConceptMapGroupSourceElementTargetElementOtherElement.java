/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.BackboneElement;
import fhiRCore.dataTypes.Uri;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Concept Map Group Source Element Target Element Other Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.ConceptMapGroupSourceElementTargetElementOtherElement#getProperty <em>Property</em>}</li>
 *   <li>{@link fhiRCore.resources.ConceptMapGroupSourceElementTargetElementOtherElement#getSystem <em>System</em>}</li>
 *   <li>{@link fhiRCore.resources.ConceptMapGroupSourceElementTargetElementOtherElement#getValue <em>Value</em>}</li>
 *   <li>{@link fhiRCore.resources.ConceptMapGroupSourceElementTargetElementOtherElement#getDisplay <em>Display</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getConceptMapGroupSourceElementTargetElementOtherElement()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='TargetElement_OtherElement'"
 * @generated
 */
public interface ConceptMapGroupSourceElementTargetElementOtherElement extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property</em>' containment reference.
	 * @see #setProperty(Uri)
	 * @see fhiRCore.resources.ResourcesPackage#getConceptMapGroupSourceElementTargetElementOtherElement_Property()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Uri getProperty();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ConceptMapGroupSourceElementTargetElementOtherElement#getProperty <em>Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property</em>' containment reference.
	 * @see #getProperty()
	 * @generated
	 */
	void setProperty(Uri value);

	/**
	 * Returns the value of the '<em><b>System</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>System</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System</em>' containment reference.
	 * @see #setSystem(CodeSystem)
	 * @see fhiRCore.resources.ResourcesPackage#getConceptMapGroupSourceElementTargetElementOtherElement_System()
	 * @model containment="true"
	 * @generated
	 */
	CodeSystem getSystem();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ConceptMapGroupSourceElementTargetElementOtherElement#getSystem <em>System</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System</em>' containment reference.
	 * @see #getSystem()
	 * @generated
	 */
	void setSystem(CodeSystem value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(fhiRCore.dataTypes.String)
	 * @see fhiRCore.resources.ResourcesPackage#getConceptMapGroupSourceElementTargetElementOtherElement_Value()
	 * @model containment="true" required="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getValue();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ConceptMapGroupSourceElementTargetElementOtherElement#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(fhiRCore.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Display</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Display</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Display</em>' containment reference.
	 * @see #setDisplay(fhiRCore.dataTypes.String)
	 * @see fhiRCore.resources.ResourcesPackage#getConceptMapGroupSourceElementTargetElementOtherElement_Display()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getDisplay();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ConceptMapGroupSourceElementTargetElementOtherElement#getDisplay <em>Display</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Display</em>' containment reference.
	 * @see #getDisplay()
	 * @generated
	 */
	void setDisplay(fhiRCore.dataTypes.String value);

} // ConceptMapGroupSourceElementTargetElementOtherElement
