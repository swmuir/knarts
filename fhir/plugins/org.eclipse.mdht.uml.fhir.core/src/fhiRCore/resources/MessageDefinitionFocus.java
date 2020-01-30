/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.BackboneElement;
import fhiRCore.dataTypes.Code;
import fhiRCore.dataTypes.UnsignedInt;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Message Definition Focus</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.MessageDefinitionFocus#getCode <em>Code</em>}</li>
 *   <li>{@link fhiRCore.resources.MessageDefinitionFocus#getProfile <em>Profile</em>}</li>
 *   <li>{@link fhiRCore.resources.MessageDefinitionFocus#getMin <em>Min</em>}</li>
 *   <li>{@link fhiRCore.resources.MessageDefinitionFocus#getMax <em>Max</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getMessageDefinitionFocus()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='MessageDefinition_Focus'"
 * @generated
 */
public interface MessageDefinitionFocus extends BackboneElement {
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
	 * @see fhiRCore.resources.ResourcesPackage#getMessageDefinitionFocus_Code()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Code getCode();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.MessageDefinitionFocus#getCode <em>Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' containment reference.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(Code value);

	/**
	 * Returns the value of the '<em><b>Profile</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Profile</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Profile</em>' containment reference.
	 * @see #setProfile(StructureDefinition)
	 * @see fhiRCore.resources.ResourcesPackage#getMessageDefinitionFocus_Profile()
	 * @model containment="true"
	 * @generated
	 */
	StructureDefinition getProfile();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.MessageDefinitionFocus#getProfile <em>Profile</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Profile</em>' containment reference.
	 * @see #getProfile()
	 * @generated
	 */
	void setProfile(StructureDefinition value);

	/**
	 * Returns the value of the '<em><b>Min</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min</em>' containment reference.
	 * @see #setMin(UnsignedInt)
	 * @see fhiRCore.resources.ResourcesPackage#getMessageDefinitionFocus_Min()
	 * @model containment="true" required="true"
	 * @generated
	 */
	UnsignedInt getMin();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.MessageDefinitionFocus#getMin <em>Min</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min</em>' containment reference.
	 * @see #getMin()
	 * @generated
	 */
	void setMin(UnsignedInt value);

	/**
	 * Returns the value of the '<em><b>Max</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max</em>' containment reference.
	 * @see #setMax(fhiRCore.dataTypes.String)
	 * @see fhiRCore.resources.ResourcesPackage#getMessageDefinitionFocus_Max()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getMax();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.MessageDefinitionFocus#getMax <em>Max</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max</em>' containment reference.
	 * @see #getMax()
	 * @generated
	 */
	void setMax(fhiRCore.dataTypes.String value);

} // MessageDefinitionFocus
