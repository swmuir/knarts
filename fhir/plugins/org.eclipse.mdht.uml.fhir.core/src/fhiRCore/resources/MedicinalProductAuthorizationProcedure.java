/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.BackboneElement;
import fhiRCore.dataTypes.CodeableConcept;
import fhiRCore.dataTypes.DataType;
import fhiRCore.dataTypes.Identifier;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Medicinal Product Authorization Procedure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.MedicinalProductAuthorizationProcedure#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link fhiRCore.resources.MedicinalProductAuthorizationProcedure#getType <em>Type</em>}</li>
 *   <li>{@link fhiRCore.resources.MedicinalProductAuthorizationProcedure#getDatex <em>Datex</em>}</li>
 *   <li>{@link fhiRCore.resources.MedicinalProductAuthorizationProcedure#getApplications <em>Application</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getMedicinalProductAuthorizationProcedure()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='MedicinalProductAuthorization_Procedure'"
 * @generated
 */
public interface MedicinalProductAuthorizationProcedure extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Identifier</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference.
	 * @see #setIdentifier(Identifier)
	 * @see fhiRCore.resources.ResourcesPackage#getMedicinalProductAuthorizationProcedure_Identifier()
	 * @model containment="true"
	 * @generated
	 */
	Identifier getIdentifier();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.MedicinalProductAuthorizationProcedure#getIdentifier <em>Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identifier</em>' containment reference.
	 * @see #getIdentifier()
	 * @generated
	 */
	void setIdentifier(Identifier value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(CodeableConcept)
	 * @see fhiRCore.resources.ResourcesPackage#getMedicinalProductAuthorizationProcedure_Type()
	 * @model containment="true" required="true"
	 * @generated
	 */
	CodeableConcept getType();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.MedicinalProductAuthorizationProcedure#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Datex</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Datex</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Datex</em>' containment reference.
	 * @see #setDatex(DataType)
	 * @see fhiRCore.resources.ResourcesPackage#getMedicinalProductAuthorizationProcedure_Datex()
	 * @model containment="true"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='date[x]'"
	 * @generated
	 */
	DataType getDatex();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.MedicinalProductAuthorizationProcedure#getDatex <em>Datex</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Datex</em>' containment reference.
	 * @see #getDatex()
	 * @generated
	 */
	void setDatex(DataType value);

	/**
	 * Returns the value of the '<em><b>Application</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.resources.MedicinalProductAuthorizationProcedure}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Application</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Application</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getMedicinalProductAuthorizationProcedure_Application()
	 * @model containment="true"
	 * @generated
	 */
	EList<MedicinalProductAuthorizationProcedure> getApplications();

} // MedicinalProductAuthorizationProcedure
