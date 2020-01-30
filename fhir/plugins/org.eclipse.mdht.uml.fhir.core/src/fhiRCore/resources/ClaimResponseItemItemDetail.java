/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.BackboneElement;
import fhiRCore.dataTypes.PositiveInt;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Claim Response Item Item Detail</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.ClaimResponseItemItemDetail#getDetailSequence <em>Detail Sequence</em>}</li>
 *   <li>{@link fhiRCore.resources.ClaimResponseItemItemDetail#getNoteNumbers <em>Note Number</em>}</li>
 *   <li>{@link fhiRCore.resources.ClaimResponseItemItemDetail#getAdjudications <em>Adjudication</em>}</li>
 *   <li>{@link fhiRCore.resources.ClaimResponseItemItemDetail#getSubDetails <em>Sub Detail</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getClaimResponseItemItemDetail()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Item_ItemDetail'"
 * @generated
 */
public interface ClaimResponseItemItemDetail extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Detail Sequence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Detail Sequence</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Detail Sequence</em>' containment reference.
	 * @see #setDetailSequence(PositiveInt)
	 * @see fhiRCore.resources.ResourcesPackage#getClaimResponseItemItemDetail_DetailSequence()
	 * @model containment="true" required="true"
	 * @generated
	 */
	PositiveInt getDetailSequence();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ClaimResponseItemItemDetail#getDetailSequence <em>Detail Sequence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Detail Sequence</em>' containment reference.
	 * @see #getDetailSequence()
	 * @generated
	 */
	void setDetailSequence(PositiveInt value);

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
	 * @see fhiRCore.resources.ResourcesPackage#getClaimResponseItemItemDetail_NoteNumber()
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
	 * @see fhiRCore.resources.ResourcesPackage#getClaimResponseItemItemDetail_Adjudication()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ClaimResponseItemAdjudication> getAdjudications();

	/**
	 * Returns the value of the '<em><b>Sub Detail</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.resources.ClaimResponseItemItemDetailSubDetail}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Detail</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Detail</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getClaimResponseItemItemDetail_SubDetail()
	 * @model containment="true"
	 * @generated
	 */
	EList<ClaimResponseItemItemDetailSubDetail> getSubDetails();

} // ClaimResponseItemItemDetail
