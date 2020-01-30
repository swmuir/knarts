/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.BackboneElement;
import fhiRCore.dataTypes.Code;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Concept Map Group Source Element Target Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.ConceptMapGroupSourceElementTargetElement#getCode <em>Code</em>}</li>
 *   <li>{@link fhiRCore.resources.ConceptMapGroupSourceElementTargetElement#getDisplay <em>Display</em>}</li>
 *   <li>{@link fhiRCore.resources.ConceptMapGroupSourceElementTargetElement#getEquivalence <em>Equivalence</em>}</li>
 *   <li>{@link fhiRCore.resources.ConceptMapGroupSourceElementTargetElement#getComment <em>Comment</em>}</li>
 *   <li>{@link fhiRCore.resources.ConceptMapGroupSourceElementTargetElement#getDependsOns <em>Depends On</em>}</li>
 *   <li>{@link fhiRCore.resources.ConceptMapGroupSourceElementTargetElement#getProducts <em>Product</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getConceptMapGroupSourceElementTargetElement()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='SourceElement_TargetElement'"
 * @generated
 */
public interface ConceptMapGroupSourceElementTargetElement extends BackboneElement {
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
	 * @see fhiRCore.resources.ResourcesPackage#getConceptMapGroupSourceElementTargetElement_Code()
	 * @model containment="true"
	 * @generated
	 */
	Code getCode();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ConceptMapGroupSourceElementTargetElement#getCode <em>Code</em>}' containment reference.
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
	 * @see fhiRCore.resources.ResourcesPackage#getConceptMapGroupSourceElementTargetElement_Display()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getDisplay();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ConceptMapGroupSourceElementTargetElement#getDisplay <em>Display</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Display</em>' containment reference.
	 * @see #getDisplay()
	 * @generated
	 */
	void setDisplay(fhiRCore.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Equivalence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Equivalence</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Equivalence</em>' containment reference.
	 * @see #setEquivalence(Code)
	 * @see fhiRCore.resources.ResourcesPackage#getConceptMapGroupSourceElementTargetElement_Equivalence()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Code getEquivalence();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ConceptMapGroupSourceElementTargetElement#getEquivalence <em>Equivalence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Equivalence</em>' containment reference.
	 * @see #getEquivalence()
	 * @generated
	 */
	void setEquivalence(Code value);

	/**
	 * Returns the value of the '<em><b>Comment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comment</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comment</em>' containment reference.
	 * @see #setComment(fhiRCore.dataTypes.String)
	 * @see fhiRCore.resources.ResourcesPackage#getConceptMapGroupSourceElementTargetElement_Comment()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getComment();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ConceptMapGroupSourceElementTargetElement#getComment <em>Comment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comment</em>' containment reference.
	 * @see #getComment()
	 * @generated
	 */
	void setComment(fhiRCore.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Depends On</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.resources.ConceptMapGroupSourceElementTargetElementOtherElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Depends On</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Depends On</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getConceptMapGroupSourceElementTargetElement_DependsOn()
	 * @model containment="true"
	 * @generated
	 */
	EList<ConceptMapGroupSourceElementTargetElementOtherElement> getDependsOns();

	/**
	 * Returns the value of the '<em><b>Product</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.resources.ConceptMapGroupSourceElementTargetElementOtherElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getConceptMapGroupSourceElementTargetElement_Product()
	 * @model containment="true"
	 * @generated
	 */
	EList<ConceptMapGroupSourceElementTargetElementOtherElement> getProducts();

} // ConceptMapGroupSourceElementTargetElement
