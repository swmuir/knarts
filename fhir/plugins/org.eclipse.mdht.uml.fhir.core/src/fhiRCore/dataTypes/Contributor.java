/**
 */
package fhiRCore.dataTypes;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contributor</b></em>'.
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
 *   <li>{@link fhiRCore.dataTypes.Contributor#getType <em>Type</em>}</li>
 *   <li>{@link fhiRCore.dataTypes.Contributor#getName <em>Name</em>}</li>
 *   <li>{@link fhiRCore.dataTypes.Contributor#getContacts <em>Contact</em>}</li>
 * </ul>
 *
 * @see fhiRCore.dataTypes.DataTypesPackage#getContributor()
 * @model
 * @generated
 */
public interface Contributor extends DataType {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(Code)
	 * @see fhiRCore.dataTypes.DataTypesPackage#getContributor_Type()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Code getType();

	/**
	 * Sets the value of the '{@link fhiRCore.dataTypes.Contributor#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(Code value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(fhiRCore.dataTypes.String)
	 * @see fhiRCore.dataTypes.DataTypesPackage#getContributor_Name()
	 * @model containment="true" required="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getName();

	/**
	 * Sets the value of the '{@link fhiRCore.dataTypes.Contributor#getName <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' containment reference.
	 * @see #getName()
	 * @generated
	 */
	void setName(fhiRCore.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Contact</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.ContactDetail}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contact</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contact</em>' containment reference list.
	 * @see fhiRCore.dataTypes.DataTypesPackage#getContributor_Contact()
	 * @model containment="true"
	 * @generated
	 */
	EList<ContactDetail> getContacts();

} // Contributor
