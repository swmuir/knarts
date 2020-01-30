/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.Annotation;
import fhiRCore.dataTypes.Code;
import fhiRCore.dataTypes.CodeableConcept;
import fhiRCore.dataTypes.DataType;
import fhiRCore.dataTypes.DateTime;
import fhiRCore.dataTypes.Dosage;
import fhiRCore.dataTypes.Identifier;
import fhiRCore.dataTypes.Reference;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Medication Statement</b></em>'.
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
 *   <li>{@link fhiRCore.resources.MedicationStatement#getIdentifiers <em>Identifier</em>}</li>
 *   <li>{@link fhiRCore.resources.MedicationStatement#getBasedOns <em>Based On</em>}</li>
 *   <li>{@link fhiRCore.resources.MedicationStatement#getPartOfs <em>Part Of</em>}</li>
 *   <li>{@link fhiRCore.resources.MedicationStatement#getStatus <em>Status</em>}</li>
 *   <li>{@link fhiRCore.resources.MedicationStatement#getStatusReasons <em>Status Reason</em>}</li>
 *   <li>{@link fhiRCore.resources.MedicationStatement#getCategory <em>Category</em>}</li>
 *   <li>{@link fhiRCore.resources.MedicationStatement#getMedicationx <em>Medicationx</em>}</li>
 *   <li>{@link fhiRCore.resources.MedicationStatement#getSubject <em>Subject</em>}</li>
 *   <li>{@link fhiRCore.resources.MedicationStatement#getContext <em>Context</em>}</li>
 *   <li>{@link fhiRCore.resources.MedicationStatement#getEffectivex <em>Effectivex</em>}</li>
 *   <li>{@link fhiRCore.resources.MedicationStatement#getDateAsserted <em>Date Asserted</em>}</li>
 *   <li>{@link fhiRCore.resources.MedicationStatement#getInformationSource <em>Information Source</em>}</li>
 *   <li>{@link fhiRCore.resources.MedicationStatement#getDerivedFroms <em>Derived From</em>}</li>
 *   <li>{@link fhiRCore.resources.MedicationStatement#getReasonCodes <em>Reason Code</em>}</li>
 *   <li>{@link fhiRCore.resources.MedicationStatement#getReasonReferences <em>Reason Reference</em>}</li>
 *   <li>{@link fhiRCore.resources.MedicationStatement#getNotes <em>Note</em>}</li>
 *   <li>{@link fhiRCore.resources.MedicationStatement#getDosages <em>Dosage</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getMedicationStatement()
 * @model
 * @generated
 */
public interface MedicationStatement extends DomainResource {
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
	 * @see fhiRCore.resources.ResourcesPackage#getMedicationStatement_Identifier()
	 * @model containment="true"
	 * @generated
	 */
	EList<Identifier> getIdentifiers();

	/**
	 * Returns the value of the '<em><b>Based On</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.Reference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Based On</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Based On</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getMedicationStatement_BasedOn()
	 * @model containment="true"
	 * @generated
	 */
	EList<Reference> getBasedOns();

	/**
	 * Returns the value of the '<em><b>Part Of</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.Reference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Part Of</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Part Of</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getMedicationStatement_PartOf()
	 * @model containment="true"
	 * @generated
	 */
	EList<Reference> getPartOfs();

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
	 * @see fhiRCore.resources.ResourcesPackage#getMedicationStatement_Status()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Code getStatus();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.MedicationStatement#getStatus <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' containment reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(Code value);

	/**
	 * Returns the value of the '<em><b>Status Reason</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status Reason</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status Reason</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getMedicationStatement_StatusReason()
	 * @model containment="true"
	 * @generated
	 */
	EList<CodeableConcept> getStatusReasons();

	/**
	 * Returns the value of the '<em><b>Category</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Category</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Category</em>' containment reference.
	 * @see #setCategory(CodeableConcept)
	 * @see fhiRCore.resources.ResourcesPackage#getMedicationStatement_Category()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getCategory();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.MedicationStatement#getCategory <em>Category</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Category</em>' containment reference.
	 * @see #getCategory()
	 * @generated
	 */
	void setCategory(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Medicationx</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Medicationx</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Medicationx</em>' containment reference.
	 * @see #setMedicationx(DataType)
	 * @see fhiRCore.resources.ResourcesPackage#getMedicationStatement_Medicationx()
	 * @model containment="true" required="true"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='medication[x]'"
	 * @generated
	 */
	DataType getMedicationx();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.MedicationStatement#getMedicationx <em>Medicationx</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Medicationx</em>' containment reference.
	 * @see #getMedicationx()
	 * @generated
	 */
	void setMedicationx(DataType value);

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
	 * @see fhiRCore.resources.ResourcesPackage#getMedicationStatement_Subject()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Reference getSubject();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.MedicationStatement#getSubject <em>Subject</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subject</em>' containment reference.
	 * @see #getSubject()
	 * @generated
	 */
	void setSubject(Reference value);

	/**
	 * Returns the value of the '<em><b>Context</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Context</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context</em>' containment reference.
	 * @see #setContext(Reference)
	 * @see fhiRCore.resources.ResourcesPackage#getMedicationStatement_Context()
	 * @model containment="true"
	 * @generated
	 */
	Reference getContext();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.MedicationStatement#getContext <em>Context</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context</em>' containment reference.
	 * @see #getContext()
	 * @generated
	 */
	void setContext(Reference value);

	/**
	 * Returns the value of the '<em><b>Effectivex</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Effectivex</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Effectivex</em>' containment reference.
	 * @see #setEffectivex(DataType)
	 * @see fhiRCore.resources.ResourcesPackage#getMedicationStatement_Effectivex()
	 * @model containment="true"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='effective[x]'"
	 * @generated
	 */
	DataType getEffectivex();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.MedicationStatement#getEffectivex <em>Effectivex</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Effectivex</em>' containment reference.
	 * @see #getEffectivex()
	 * @generated
	 */
	void setEffectivex(DataType value);

	/**
	 * Returns the value of the '<em><b>Date Asserted</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Asserted</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Asserted</em>' containment reference.
	 * @see #setDateAsserted(DateTime)
	 * @see fhiRCore.resources.ResourcesPackage#getMedicationStatement_DateAsserted()
	 * @model containment="true"
	 * @generated
	 */
	DateTime getDateAsserted();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.MedicationStatement#getDateAsserted <em>Date Asserted</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Asserted</em>' containment reference.
	 * @see #getDateAsserted()
	 * @generated
	 */
	void setDateAsserted(DateTime value);

	/**
	 * Returns the value of the '<em><b>Information Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Information Source</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Information Source</em>' containment reference.
	 * @see #setInformationSource(Reference)
	 * @see fhiRCore.resources.ResourcesPackage#getMedicationStatement_InformationSource()
	 * @model containment="true"
	 * @generated
	 */
	Reference getInformationSource();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.MedicationStatement#getInformationSource <em>Information Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Information Source</em>' containment reference.
	 * @see #getInformationSource()
	 * @generated
	 */
	void setInformationSource(Reference value);

	/**
	 * Returns the value of the '<em><b>Derived From</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.Reference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Derived From</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Derived From</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getMedicationStatement_DerivedFrom()
	 * @model containment="true"
	 * @generated
	 */
	EList<Reference> getDerivedFroms();

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
	 * @see fhiRCore.resources.ResourcesPackage#getMedicationStatement_ReasonCode()
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
	 * @see fhiRCore.resources.ResourcesPackage#getMedicationStatement_ReasonReference()
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
	 * @see fhiRCore.resources.ResourcesPackage#getMedicationStatement_Note()
	 * @model containment="true"
	 * @generated
	 */
	EList<Annotation> getNotes();

	/**
	 * Returns the value of the '<em><b>Dosage</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.Dosage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dosage</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dosage</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getMedicationStatement_Dosage()
	 * @model containment="true"
	 * @generated
	 */
	EList<Dosage> getDosages();

} // MedicationStatement
