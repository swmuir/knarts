/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.BackboneElement;
import fhiRCore.dataTypes.DateTime;
import fhiRCore.dataTypes.Reference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Immunization Reaction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.ImmunizationReaction#getDate <em>Date</em>}</li>
 *   <li>{@link fhiRCore.resources.ImmunizationReaction#getDetail <em>Detail</em>}</li>
 *   <li>{@link fhiRCore.resources.ImmunizationReaction#getReported <em>Reported</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getImmunizationReaction()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Immunization_Reaction'"
 * @generated
 */
public interface ImmunizationReaction extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date</em>' containment reference.
	 * @see #setDate(DateTime)
	 * @see fhiRCore.resources.ResourcesPackage#getImmunizationReaction_Date()
	 * @model containment="true"
	 * @generated
	 */
	DateTime getDate();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ImmunizationReaction#getDate <em>Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' containment reference.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(DateTime value);

	/**
	 * Returns the value of the '<em><b>Detail</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Detail</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Detail</em>' containment reference.
	 * @see #setDetail(Reference)
	 * @see fhiRCore.resources.ResourcesPackage#getImmunizationReaction_Detail()
	 * @model containment="true"
	 * @generated
	 */
	Reference getDetail();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ImmunizationReaction#getDetail <em>Detail</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Detail</em>' containment reference.
	 * @see #getDetail()
	 * @generated
	 */
	void setDetail(Reference value);

	/**
	 * Returns the value of the '<em><b>Reported</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reported</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reported</em>' containment reference.
	 * @see #setReported(fhiRCore.dataTypes.Boolean)
	 * @see fhiRCore.resources.ResourcesPackage#getImmunizationReaction_Reported()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.Boolean getReported();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ImmunizationReaction#getReported <em>Reported</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reported</em>' containment reference.
	 * @see #getReported()
	 * @generated
	 */
	void setReported(fhiRCore.dataTypes.Boolean value);

} // ImmunizationReaction
