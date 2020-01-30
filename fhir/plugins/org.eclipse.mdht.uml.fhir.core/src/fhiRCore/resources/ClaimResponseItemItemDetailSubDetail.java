/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.BackboneElement;
import fhiRCore.dataTypes.PositiveInt;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Claim Response Item Item Detail Sub Detail</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.ClaimResponseItemItemDetailSubDetail#getSubDetailSequence <em>Sub Detail Sequence</em>}</li>
 *   <li>{@link fhiRCore.resources.ClaimResponseItemItemDetailSubDetail#getNoteNumbers <em>Note Number</em>}</li>
 *   <li>{@link fhiRCore.resources.ClaimResponseItemItemDetailSubDetail#getAdjudications <em>Adjudication</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getClaimResponseItemItemDetailSubDetail()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='ItemDetail_SubDetail'"
 * @generated
 */
public interface ClaimResponseItemItemDetailSubDetail extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Sub Detail Sequence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Detail Sequence</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Detail Sequence</em>' containment reference.
	 * @see #setSubDetailSequence(PositiveInt)
	 * @see fhiRCore.resources.ResourcesPackage#getClaimResponseItemItemDetailSubDetail_SubDetailSequence()
	 * @model containment="true" required="true"
	 * @generated
	 */
	PositiveInt getSubDetailSequence();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ClaimResponseItemItemDetailSubDetail#getSubDetailSequence <em>Sub Detail Sequence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sub Detail Sequence</em>' containment reference.
	 * @see #getSubDetailSequence()
	 * @generated
	 */
	void setSubDetailSequence(PositiveInt value);

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
	 * @see fhiRCore.resources.ResourcesPackage#getClaimResponseItemItemDetailSubDetail_NoteNumber()
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
	 * @see fhiRCore.resources.ResourcesPackage#getClaimResponseItemItemDetailSubDetail_Adjudication()
	 * @model containment="true"
	 * @generated
	 */
	EList<ClaimResponseItemAdjudication> getAdjudications();

} // ClaimResponseItemItemDetailSubDetail
