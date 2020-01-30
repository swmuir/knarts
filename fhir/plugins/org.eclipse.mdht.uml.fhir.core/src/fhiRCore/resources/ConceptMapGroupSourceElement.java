/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.BackboneElement;
import fhiRCore.dataTypes.Code;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Concept Map Group Source Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.ConceptMapGroupSourceElement#getCode <em>Code</em>}</li>
 *   <li>{@link fhiRCore.resources.ConceptMapGroupSourceElement#getDisplay <em>Display</em>}</li>
 *   <li>{@link fhiRCore.resources.ConceptMapGroupSourceElement#getTargets <em>Target</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getConceptMapGroupSourceElement()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Group_SourceElement'"
 * @generated
 */
public interface ConceptMapGroupSourceElement extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' containment reference.
	 * @see #setCode(Code)
	 * @see fhiRCore.resources.ResourcesPackage#getConceptMapGroupSourceElement_Code()
	 * @model containment="true"
	 * @generated
	 */
	Code getCode();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ConceptMapGroupSourceElement#getCode <em>Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' containment reference.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(Code value);

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
	 * @see fhiRCore.resources.ResourcesPackage#getConceptMapGroupSourceElement_Display()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getDisplay();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ConceptMapGroupSourceElement#getDisplay <em>Display</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Display</em>' containment reference.
	 * @see #getDisplay()
	 * @generated
	 */
	void setDisplay(fhiRCore.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.resources.ConceptMapGroupSourceElementTargetElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getConceptMapGroupSourceElement_Target()
	 * @model containment="true"
	 * @generated
	 */
	EList<ConceptMapGroupSourceElementTargetElement> getTargets();

} // ConceptMapGroupSourceElement
