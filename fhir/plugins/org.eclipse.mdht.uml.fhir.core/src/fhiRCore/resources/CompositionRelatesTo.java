/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.BackboneElement;
import fhiRCore.dataTypes.Code;
import fhiRCore.dataTypes.DataType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composition Relates To</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.CompositionRelatesTo#getCode <em>Code</em>}</li>
 *   <li>{@link fhiRCore.resources.CompositionRelatesTo#getTargetx <em>Targetx</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getCompositionRelatesTo()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Composition_RelatesTo'"
 * @generated
 */
public interface CompositionRelatesTo extends BackboneElement {
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
	 * @see fhiRCore.resources.ResourcesPackage#getCompositionRelatesTo_Code()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Code getCode();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.CompositionRelatesTo#getCode <em>Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' containment reference.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(Code value);

	/**
	 * Returns the value of the '<em><b>Targetx</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Targetx</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Targetx</em>' containment reference.
	 * @see #setTargetx(DataType)
	 * @see fhiRCore.resources.ResourcesPackage#getCompositionRelatesTo_Targetx()
	 * @model containment="true" required="true"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='target[x]'"
	 * @generated
	 */
	DataType getTargetx();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.CompositionRelatesTo#getTargetx <em>Targetx</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Targetx</em>' containment reference.
	 * @see #getTargetx()
	 * @generated
	 */
	void setTargetx(DataType value);

} // CompositionRelatesTo
