/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.BackboneElement;
import fhiRCore.dataTypes.Code;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Value Set Compose Concept Set Concept Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.ValueSetComposeConceptSetConceptReference#getCode <em>Code</em>}</li>
 *   <li>{@link fhiRCore.resources.ValueSetComposeConceptSetConceptReference#getDisplay <em>Display</em>}</li>
 *   <li>{@link fhiRCore.resources.ValueSetComposeConceptSetConceptReference#getDesignations <em>Designation</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getValueSetComposeConceptSetConceptReference()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='ConceptSet_ConceptReference'"
 * @generated
 */
public interface ValueSetComposeConceptSetConceptReference extends BackboneElement {
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
	 * @see fhiRCore.resources.ResourcesPackage#getValueSetComposeConceptSetConceptReference_Code()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Code getCode();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ValueSetComposeConceptSetConceptReference#getCode <em>Code</em>}' containment reference.
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
	 * @see fhiRCore.resources.ResourcesPackage#getValueSetComposeConceptSetConceptReference_Display()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getDisplay();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ValueSetComposeConceptSetConceptReference#getDisplay <em>Display</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Display</em>' containment reference.
	 * @see #getDisplay()
	 * @generated
	 */
	void setDisplay(fhiRCore.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Designation</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.resources.ValueSetComposeConceptSetConceptReferenceDesignation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Designation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Designation</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getValueSetComposeConceptSetConceptReference_Designation()
	 * @model containment="true"
	 * @generated
	 */
	EList<ValueSetComposeConceptSetConceptReferenceDesignation> getDesignations();

} // ValueSetComposeConceptSetConceptReference
