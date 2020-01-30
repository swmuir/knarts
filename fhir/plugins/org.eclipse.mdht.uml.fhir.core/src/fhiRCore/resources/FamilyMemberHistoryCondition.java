/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.Annotation;
import fhiRCore.dataTypes.BackboneElement;
import fhiRCore.dataTypes.CodeableConcept;
import fhiRCore.dataTypes.DataType;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Family Member History Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.FamilyMemberHistoryCondition#getCode <em>Code</em>}</li>
 *   <li>{@link fhiRCore.resources.FamilyMemberHistoryCondition#getOutcome <em>Outcome</em>}</li>
 *   <li>{@link fhiRCore.resources.FamilyMemberHistoryCondition#getContributedToDeath <em>Contributed To Death</em>}</li>
 *   <li>{@link fhiRCore.resources.FamilyMemberHistoryCondition#getOnsetx <em>Onsetx</em>}</li>
 *   <li>{@link fhiRCore.resources.FamilyMemberHistoryCondition#getNotes <em>Note</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getFamilyMemberHistoryCondition()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='FamilyMemberHistory_Condition'"
 * @generated
 */
public interface FamilyMemberHistoryCondition extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' containment reference.
	 * @see #setCode(CodeableConcept)
	 * @see fhiRCore.resources.ResourcesPackage#getFamilyMemberHistoryCondition_Code()
	 * @model containment="true" required="true"
	 * @generated
	 */
	CodeableConcept getCode();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.FamilyMemberHistoryCondition#getCode <em>Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' containment reference.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Outcome</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outcome</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outcome</em>' containment reference.
	 * @see #setOutcome(CodeableConcept)
	 * @see fhiRCore.resources.ResourcesPackage#getFamilyMemberHistoryCondition_Outcome()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getOutcome();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.FamilyMemberHistoryCondition#getOutcome <em>Outcome</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outcome</em>' containment reference.
	 * @see #getOutcome()
	 * @generated
	 */
	void setOutcome(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Contributed To Death</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contributed To Death</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contributed To Death</em>' containment reference.
	 * @see #setContributedToDeath(fhiRCore.dataTypes.Boolean)
	 * @see fhiRCore.resources.ResourcesPackage#getFamilyMemberHistoryCondition_ContributedToDeath()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.Boolean getContributedToDeath();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.FamilyMemberHistoryCondition#getContributedToDeath <em>Contributed To Death</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contributed To Death</em>' containment reference.
	 * @see #getContributedToDeath()
	 * @generated
	 */
	void setContributedToDeath(fhiRCore.dataTypes.Boolean value);

	/**
	 * Returns the value of the '<em><b>Onsetx</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Onsetx</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Onsetx</em>' containment reference.
	 * @see #setOnsetx(DataType)
	 * @see fhiRCore.resources.ResourcesPackage#getFamilyMemberHistoryCondition_Onsetx()
	 * @model containment="true"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='onset[x]'"
	 * @generated
	 */
	DataType getOnsetx();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.FamilyMemberHistoryCondition#getOnsetx <em>Onsetx</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Onsetx</em>' containment reference.
	 * @see #getOnsetx()
	 * @generated
	 */
	void setOnsetx(DataType value);

	/**
	 * Returns the value of the '<em><b>Note</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.Annotation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Note</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Note</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getFamilyMemberHistoryCondition_Note()
	 * @model containment="true"
	 * @generated
	 */
	EList<Annotation> getNotes();

} // FamilyMemberHistoryCondition
