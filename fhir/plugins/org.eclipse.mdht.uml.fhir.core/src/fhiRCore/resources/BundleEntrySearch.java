/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.BackboneElement;
import fhiRCore.dataTypes.Code;
import fhiRCore.dataTypes.Decimal;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bundle Entry Search</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.BundleEntrySearch#getMode <em>Mode</em>}</li>
 *   <li>{@link fhiRCore.resources.BundleEntrySearch#getScore <em>Score</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getBundleEntrySearch()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Entry_Search'"
 * @generated
 */
public interface BundleEntrySearch extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Mode</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mode</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mode</em>' containment reference.
	 * @see #setMode(Code)
	 * @see fhiRCore.resources.ResourcesPackage#getBundleEntrySearch_Mode()
	 * @model containment="true"
	 * @generated
	 */
	Code getMode();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.BundleEntrySearch#getMode <em>Mode</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mode</em>' containment reference.
	 * @see #getMode()
	 * @generated
	 */
	void setMode(Code value);

	/**
	 * Returns the value of the '<em><b>Score</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Score</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Score</em>' containment reference.
	 * @see #setScore(Decimal)
	 * @see fhiRCore.resources.ResourcesPackage#getBundleEntrySearch_Score()
	 * @model containment="true"
	 * @generated
	 */
	Decimal getScore();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.BundleEntrySearch#getScore <em>Score</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Score</em>' containment reference.
	 * @see #getScore()
	 * @generated
	 */
	void setScore(Decimal value);

} // BundleEntrySearch
