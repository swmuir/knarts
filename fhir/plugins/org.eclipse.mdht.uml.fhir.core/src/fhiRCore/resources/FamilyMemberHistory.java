/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.Annotation;
import fhiRCore.dataTypes.Code;
import fhiRCore.dataTypes.CodeableConcept;
import fhiRCore.dataTypes.DataType;
import fhiRCore.dataTypes.DateTime;
import fhiRCore.dataTypes.Identifier;
import fhiRCore.dataTypes.Reference;
import fhiRCore.dataTypes.Uri;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Family Member History</b></em>'.
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
 *   <li>{@link fhiRCore.resources.FamilyMemberHistory#getIdentifiers <em>Identifier</em>}</li>
 *   <li>{@link fhiRCore.resources.FamilyMemberHistory#getInstantiatesCanonicals <em>Instantiates Canonical</em>}</li>
 *   <li>{@link fhiRCore.resources.FamilyMemberHistory#getInstantiatesUris <em>Instantiates Uri</em>}</li>
 *   <li>{@link fhiRCore.resources.FamilyMemberHistory#getStatus <em>Status</em>}</li>
 *   <li>{@link fhiRCore.resources.FamilyMemberHistory#getDataAbsentReason <em>Data Absent Reason</em>}</li>
 *   <li>{@link fhiRCore.resources.FamilyMemberHistory#getPatient <em>Patient</em>}</li>
 *   <li>{@link fhiRCore.resources.FamilyMemberHistory#getDate <em>Date</em>}</li>
 *   <li>{@link fhiRCore.resources.FamilyMemberHistory#getName <em>Name</em>}</li>
 *   <li>{@link fhiRCore.resources.FamilyMemberHistory#getRelationship <em>Relationship</em>}</li>
 *   <li>{@link fhiRCore.resources.FamilyMemberHistory#getSex <em>Sex</em>}</li>
 *   <li>{@link fhiRCore.resources.FamilyMemberHistory#getBornx <em>Bornx</em>}</li>
 *   <li>{@link fhiRCore.resources.FamilyMemberHistory#getAgex <em>Agex</em>}</li>
 *   <li>{@link fhiRCore.resources.FamilyMemberHistory#getEstimatedAge <em>Estimated Age</em>}</li>
 *   <li>{@link fhiRCore.resources.FamilyMemberHistory#getDeceasedx <em>Deceasedx</em>}</li>
 *   <li>{@link fhiRCore.resources.FamilyMemberHistory#getReasonCodes <em>Reason Code</em>}</li>
 *   <li>{@link fhiRCore.resources.FamilyMemberHistory#getReasonReferences <em>Reason Reference</em>}</li>
 *   <li>{@link fhiRCore.resources.FamilyMemberHistory#getNotes <em>Note</em>}</li>
 *   <li>{@link fhiRCore.resources.FamilyMemberHistory#getConditions <em>Condition</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getFamilyMemberHistory()
 * @model
 * @generated
 */
public interface FamilyMemberHistory extends DomainResource {
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
	 * @see fhiRCore.resources.ResourcesPackage#getFamilyMemberHistory_Identifier()
	 * @model containment="true"
	 * @generated
	 */
	EList<Identifier> getIdentifiers();

	/**
	 * Returns the value of the '<em><b>Instantiates Canonical</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.resources.PlanDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instantiates Canonical</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instantiates Canonical</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getFamilyMemberHistory_InstantiatesCanonical()
	 * @model containment="true"
	 * @generated
	 */
	EList<PlanDefinition> getInstantiatesCanonicals();

	/**
	 * Returns the value of the '<em><b>Instantiates Uri</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.Uri}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instantiates Uri</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instantiates Uri</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getFamilyMemberHistory_InstantiatesUri()
	 * @model containment="true"
	 * @generated
	 */
	EList<Uri> getInstantiatesUris();

	/**
	 * Returns the value of the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' containment reference.
	 * @see #setStatus(Code)
	 * @see fhiRCore.resources.ResourcesPackage#getFamilyMemberHistory_Status()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Code getStatus();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.FamilyMemberHistory#getStatus <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' containment reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(Code value);

	/**
	 * Returns the value of the '<em><b>Data Absent Reason</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Absent Reason</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Absent Reason</em>' containment reference.
	 * @see #setDataAbsentReason(CodeableConcept)
	 * @see fhiRCore.resources.ResourcesPackage#getFamilyMemberHistory_DataAbsentReason()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getDataAbsentReason();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.FamilyMemberHistory#getDataAbsentReason <em>Data Absent Reason</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Absent Reason</em>' containment reference.
	 * @see #getDataAbsentReason()
	 * @generated
	 */
	void setDataAbsentReason(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Patient</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Patient</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Patient</em>' containment reference.
	 * @see #setPatient(Reference)
	 * @see fhiRCore.resources.ResourcesPackage#getFamilyMemberHistory_Patient()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Reference getPatient();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.FamilyMemberHistory#getPatient <em>Patient</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Patient</em>' containment reference.
	 * @see #getPatient()
	 * @generated
	 */
	void setPatient(Reference value);

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
	 * @see fhiRCore.resources.ResourcesPackage#getFamilyMemberHistory_Date()
	 * @model containment="true"
	 * @generated
	 */
	DateTime getDate();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.FamilyMemberHistory#getDate <em>Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' containment reference.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(DateTime value);

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
	 * @see fhiRCore.resources.ResourcesPackage#getFamilyMemberHistory_Name()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getName();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.FamilyMemberHistory#getName <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' containment reference.
	 * @see #getName()
	 * @generated
	 */
	void setName(fhiRCore.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Relationship</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relationship</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relationship</em>' containment reference.
	 * @see #setRelationship(CodeableConcept)
	 * @see fhiRCore.resources.ResourcesPackage#getFamilyMemberHistory_Relationship()
	 * @model containment="true" required="true"
	 * @generated
	 */
	CodeableConcept getRelationship();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.FamilyMemberHistory#getRelationship <em>Relationship</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relationship</em>' containment reference.
	 * @see #getRelationship()
	 * @generated
	 */
	void setRelationship(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Sex</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sex</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sex</em>' containment reference.
	 * @see #setSex(CodeableConcept)
	 * @see fhiRCore.resources.ResourcesPackage#getFamilyMemberHistory_Sex()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getSex();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.FamilyMemberHistory#getSex <em>Sex</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sex</em>' containment reference.
	 * @see #getSex()
	 * @generated
	 */
	void setSex(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Bornx</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bornx</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bornx</em>' containment reference.
	 * @see #setBornx(DataType)
	 * @see fhiRCore.resources.ResourcesPackage#getFamilyMemberHistory_Bornx()
	 * @model containment="true"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='born[x]'"
	 * @generated
	 */
	DataType getBornx();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.FamilyMemberHistory#getBornx <em>Bornx</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bornx</em>' containment reference.
	 * @see #getBornx()
	 * @generated
	 */
	void setBornx(DataType value);

	/**
	 * Returns the value of the '<em><b>Agex</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Agex</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Agex</em>' containment reference.
	 * @see #setAgex(DataType)
	 * @see fhiRCore.resources.ResourcesPackage#getFamilyMemberHistory_Agex()
	 * @model containment="true"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='age[x]'"
	 * @generated
	 */
	DataType getAgex();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.FamilyMemberHistory#getAgex <em>Agex</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Agex</em>' containment reference.
	 * @see #getAgex()
	 * @generated
	 */
	void setAgex(DataType value);

	/**
	 * Returns the value of the '<em><b>Estimated Age</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Estimated Age</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Estimated Age</em>' containment reference.
	 * @see #setEstimatedAge(fhiRCore.dataTypes.Boolean)
	 * @see fhiRCore.resources.ResourcesPackage#getFamilyMemberHistory_EstimatedAge()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.Boolean getEstimatedAge();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.FamilyMemberHistory#getEstimatedAge <em>Estimated Age</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Estimated Age</em>' containment reference.
	 * @see #getEstimatedAge()
	 * @generated
	 */
	void setEstimatedAge(fhiRCore.dataTypes.Boolean value);

	/**
	 * Returns the value of the '<em><b>Deceasedx</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deceasedx</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deceasedx</em>' containment reference.
	 * @see #setDeceasedx(DataType)
	 * @see fhiRCore.resources.ResourcesPackage#getFamilyMemberHistory_Deceasedx()
	 * @model containment="true"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='deceased[x]'"
	 * @generated
	 */
	DataType getDeceasedx();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.FamilyMemberHistory#getDeceasedx <em>Deceasedx</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deceasedx</em>' containment reference.
	 * @see #getDeceasedx()
	 * @generated
	 */
	void setDeceasedx(DataType value);

	/**
	 * Returns the value of the '<em><b>Reason Code</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reason Code</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reason Code</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getFamilyMemberHistory_ReasonCode()
	 * @model containment="true"
	 * @generated
	 */
	EList<CodeableConcept> getReasonCodes();

	/**
	 * Returns the value of the '<em><b>Reason Reference</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.Reference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reason Reference</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reason Reference</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getFamilyMemberHistory_ReasonReference()
	 * @model containment="true"
	 * @generated
	 */
	EList<Reference> getReasonReferences();

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
	 * @see fhiRCore.resources.ResourcesPackage#getFamilyMemberHistory_Note()
	 * @model containment="true"
	 * @generated
	 */
	EList<Annotation> getNotes();

	/**
	 * Returns the value of the '<em><b>Condition</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.resources.FamilyMemberHistoryCondition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getFamilyMemberHistory_Condition()
	 * @model containment="true"
	 * @generated
	 */
	EList<FamilyMemberHistoryCondition> getConditions();

} // FamilyMemberHistory
