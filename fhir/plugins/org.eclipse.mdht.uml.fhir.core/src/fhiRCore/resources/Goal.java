/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.Annotation;
import fhiRCore.dataTypes.Code;
import fhiRCore.dataTypes.CodeableConcept;
import fhiRCore.dataTypes.DataType;
import fhiRCore.dataTypes.Date;
import fhiRCore.dataTypes.Identifier;
import fhiRCore.dataTypes.Reference;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Goal</b></em>'.
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
 *   <li>{@link fhiRCore.resources.Goal#getIdentifiers <em>Identifier</em>}</li>
 *   <li>{@link fhiRCore.resources.Goal#getLifecycleStatus <em>Lifecycle Status</em>}</li>
 *   <li>{@link fhiRCore.resources.Goal#getAchievementStatus <em>Achievement Status</em>}</li>
 *   <li>{@link fhiRCore.resources.Goal#getCategories <em>Category</em>}</li>
 *   <li>{@link fhiRCore.resources.Goal#getPriority <em>Priority</em>}</li>
 *   <li>{@link fhiRCore.resources.Goal#getDescription <em>Description</em>}</li>
 *   <li>{@link fhiRCore.resources.Goal#getSubject <em>Subject</em>}</li>
 *   <li>{@link fhiRCore.resources.Goal#getStartx <em>Startx</em>}</li>
 *   <li>{@link fhiRCore.resources.Goal#getTargets <em>Target</em>}</li>
 *   <li>{@link fhiRCore.resources.Goal#getStatusDate <em>Status Date</em>}</li>
 *   <li>{@link fhiRCore.resources.Goal#getStatusReason <em>Status Reason</em>}</li>
 *   <li>{@link fhiRCore.resources.Goal#getExpressedBy <em>Expressed By</em>}</li>
 *   <li>{@link fhiRCore.resources.Goal#getAddresses <em>Addresses</em>}</li>
 *   <li>{@link fhiRCore.resources.Goal#getNotes <em>Note</em>}</li>
 *   <li>{@link fhiRCore.resources.Goal#getOutcomeCodes <em>Outcome Code</em>}</li>
 *   <li>{@link fhiRCore.resources.Goal#getOutcomeReferences <em>Outcome Reference</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getGoal()
 * @model
 * @generated
 */
public interface Goal extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.Identifier}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Identifier</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getGoal_Identifier()
	 * @model containment="true"
	 * @generated
	 */
	EList<Identifier> getIdentifiers();

	/**
	 * Returns the value of the '<em><b>Lifecycle Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lifecycle Status</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lifecycle Status</em>' containment reference.
	 * @see #setLifecycleStatus(Code)
	 * @see fhiRCore.resources.ResourcesPackage#getGoal_LifecycleStatus()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Code getLifecycleStatus();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.Goal#getLifecycleStatus <em>Lifecycle Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lifecycle Status</em>' containment reference.
	 * @see #getLifecycleStatus()
	 * @generated
	 */
	void setLifecycleStatus(Code value);

	/**
	 * Returns the value of the '<em><b>Achievement Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Achievement Status</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Achievement Status</em>' containment reference.
	 * @see #setAchievementStatus(CodeableConcept)
	 * @see fhiRCore.resources.ResourcesPackage#getGoal_AchievementStatus()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getAchievementStatus();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.Goal#getAchievementStatus <em>Achievement Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Achievement Status</em>' containment reference.
	 * @see #getAchievementStatus()
	 * @generated
	 */
	void setAchievementStatus(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Category</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Category</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Category</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getGoal_Category()
	 * @model containment="true"
	 * @generated
	 */
	EList<CodeableConcept> getCategories();

	/**
	 * Returns the value of the '<em><b>Priority</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Priority</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Priority</em>' containment reference.
	 * @see #setPriority(CodeableConcept)
	 * @see fhiRCore.resources.ResourcesPackage#getGoal_Priority()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getPriority();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.Goal#getPriority <em>Priority</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priority</em>' containment reference.
	 * @see #getPriority()
	 * @generated
	 */
	void setPriority(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(CodeableConcept)
	 * @see fhiRCore.resources.ResourcesPackage#getGoal_Description()
	 * @model containment="true" required="true"
	 * @generated
	 */
	CodeableConcept getDescription();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.Goal#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subject</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subject</em>' containment reference.
	 * @see #setSubject(Reference)
	 * @see fhiRCore.resources.ResourcesPackage#getGoal_Subject()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Reference getSubject();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.Goal#getSubject <em>Subject</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subject</em>' containment reference.
	 * @see #getSubject()
	 * @generated
	 */
	void setSubject(Reference value);

	/**
	 * Returns the value of the '<em><b>Startx</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Startx</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Startx</em>' containment reference.
	 * @see #setStartx(DataType)
	 * @see fhiRCore.resources.ResourcesPackage#getGoal_Startx()
	 * @model containment="true"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='start[x]'"
	 * @generated
	 */
	DataType getStartx();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.Goal#getStartx <em>Startx</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Startx</em>' containment reference.
	 * @see #getStartx()
	 * @generated
	 */
	void setStartx(DataType value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.resources.GoalTarget}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getGoal_Target()
	 * @model containment="true"
	 * @generated
	 */
	EList<GoalTarget> getTargets();

	/**
	 * Returns the value of the '<em><b>Status Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status Date</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status Date</em>' containment reference.
	 * @see #setStatusDate(Date)
	 * @see fhiRCore.resources.ResourcesPackage#getGoal_StatusDate()
	 * @model containment="true"
	 * @generated
	 */
	Date getStatusDate();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.Goal#getStatusDate <em>Status Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status Date</em>' containment reference.
	 * @see #getStatusDate()
	 * @generated
	 */
	void setStatusDate(Date value);

	/**
	 * Returns the value of the '<em><b>Status Reason</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status Reason</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status Reason</em>' containment reference.
	 * @see #setStatusReason(fhiRCore.dataTypes.String)
	 * @see fhiRCore.resources.ResourcesPackage#getGoal_StatusReason()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getStatusReason();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.Goal#getStatusReason <em>Status Reason</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status Reason</em>' containment reference.
	 * @see #getStatusReason()
	 * @generated
	 */
	void setStatusReason(fhiRCore.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Expressed By</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expressed By</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expressed By</em>' containment reference.
	 * @see #setExpressedBy(Reference)
	 * @see fhiRCore.resources.ResourcesPackage#getGoal_ExpressedBy()
	 * @model containment="true"
	 * @generated
	 */
	Reference getExpressedBy();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.Goal#getExpressedBy <em>Expressed By</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expressed By</em>' containment reference.
	 * @see #getExpressedBy()
	 * @generated
	 */
	void setExpressedBy(Reference value);

	/**
	 * Returns the value of the '<em><b>Addresses</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.Reference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Addresses</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Addresses</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getGoal_Addresses()
	 * @model containment="true"
	 * @generated
	 */
	EList<Reference> getAddresses();

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
	 * @see fhiRCore.resources.ResourcesPackage#getGoal_Note()
	 * @model containment="true"
	 * @generated
	 */
	EList<Annotation> getNotes();

	/**
	 * Returns the value of the '<em><b>Outcome Code</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outcome Code</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outcome Code</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getGoal_OutcomeCode()
	 * @model containment="true"
	 * @generated
	 */
	EList<CodeableConcept> getOutcomeCodes();

	/**
	 * Returns the value of the '<em><b>Outcome Reference</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.Reference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outcome Reference</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outcome Reference</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getGoal_OutcomeReference()
	 * @model containment="true"
	 * @generated
	 */
	EList<Reference> getOutcomeReferences();

} // Goal
