/**
 */
package fhiRCore.dataTypes;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.dataTypes.Element#getId <em>Id</em>}</li>
 *   <li>{@link fhiRCore.dataTypes.Element#getExtensions <em>Extension</em>}</li>
 * </ul>
 *
 * @see fhiRCore.dataTypes.DataTypesPackage#getElement()
 * @model abstract="true"
 * @generated
 */
public interface Element extends Base {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' containment reference.
	 * @see #setId(ElementId)
	 * @see fhiRCore.dataTypes.DataTypesPackage#getElement_Id()
	 * @model containment="true"
	 * @generated
	 */
	ElementId getId();

	/**
	 * Sets the value of the '{@link fhiRCore.dataTypes.Element#getId <em>Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' containment reference.
	 * @see #getId()
	 * @generated
	 */
	void setId(ElementId value);

	/**
	 * Returns the value of the '<em><b>Extension</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.Extension}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extension</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extension</em>' containment reference list.
	 * @see fhiRCore.dataTypes.DataTypesPackage#getElement_Extension()
	 * @model containment="true"
	 * @generated
	 */
	EList<Extension> getExtensions();

} // Element
