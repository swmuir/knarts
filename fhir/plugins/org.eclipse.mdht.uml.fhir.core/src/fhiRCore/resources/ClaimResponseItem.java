/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.BackboneElement;
import fhiRCore.dataTypes.PositiveInt;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Claim Response Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.ClaimResponseItem#getItemSequence <em>Item Sequence</em>}</li>
 *   <li>{@link fhiRCore.resources.ClaimResponseItem#getNoteNumbers <em>Note Number</em>}</li>
 *   <li>{@link fhiRCore.resources.ClaimResponseItem#getAdjudications <em>Adjudication</em>}</li>
 *   <li>{@link fhiRCore.resources.ClaimResponseItem#getDetails <em>Detail</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getClaimResponseItem()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='ClaimResponse_Item'"
 * @generated
 */
public interface ClaimResponseItem extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Item Sequence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Item Sequence</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Item Sequence</em>' containment reference.
	 * @see #setItemSequence(PositiveInt)
	 * @see fhiRCore.resources.ResourcesPackage#getClaimResponseItem_ItemSequence()
	 * @model containment="true" required="true"
	 * @generated
	 */
	PositiveInt getItemSequence();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ClaimResponseItem#getItemSequence <em>Item Sequence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Item Sequence</em>' containment reference.
	 * @see #getItemSequence()
	 * @generated
	 */
	void setItemSequence(PositiveInt value);

	/**
	 * Returns the value of the '<em><b>Note Number</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.PositiveInt}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Note Number</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Note Number</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getClaimResponseItem_NoteNumber()
	 * @model containment="true"
	 * @generated
	 */
	EList<PositiveInt> getNoteNumbers();

	/**
	 * Returns the value of the '<em><b>Adjudication</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.resources.ClaimResponseItemAdjudication}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Adjudication</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Adjudication</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getClaimResponseItem_Adjudication()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ClaimResponseItemAdjudication> getAdjudications();

	/**
	 * Returns the value of the '<em><b>Detail</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.resources.ClaimResponseItemItemDetail}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Detail</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Detail</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getClaimResponseItem_Detail()
	 * @model containment="true"
	 * @generated
	 */
	EList<ClaimResponseItemItemDetail> getDetails();

} // ClaimResponseItem
