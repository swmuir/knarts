/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.Code;
import fhiRCore.dataTypes.Identifier;
import fhiRCore.dataTypes.Period;
import fhiRCore.dataTypes.Reference;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Research Subject</b></em>'.
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
 *   <li>{@link fhiRCore.resources.ResearchSubject#getIdentifiers <em>Identifier</em>}</li>
 *   <li>{@link fhiRCore.resources.ResearchSubject#getStatus <em>Status</em>}</li>
 *   <li>{@link fhiRCore.resources.ResearchSubject#getPeriod <em>Period</em>}</li>
 *   <li>{@link fhiRCore.resources.ResearchSubject#getStudy <em>Study</em>}</li>
 *   <li>{@link fhiRCore.resources.ResearchSubject#getIndividual <em>Individual</em>}</li>
 *   <li>{@link fhiRCore.resources.ResearchSubject#getAssignedArm <em>Assigned Arm</em>}</li>
 *   <li>{@link fhiRCore.resources.ResearchSubject#getActualArm <em>Actual Arm</em>}</li>
 *   <li>{@link fhiRCore.resources.ResearchSubject#getConsent <em>Consent</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getResearchSubject()
 * @model
 * @generated
 */
public interface ResearchSubject extends DomainResource {
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
	 * @see fhiRCore.resources.ResourcesPackage#getResearchSubject_Identifier()
	 * @model containment="true"
	 * @generated
	 */
	EList<Identifier> getIdentifiers();

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
	 * @see fhiRCore.resources.ResourcesPackage#getResearchSubject_Status()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Code getStatus();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ResearchSubject#getStatus <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' containment reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(Code value);

	/**
	 * Returns the value of the '<em><b>Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Period</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Period</em>' containment reference.
	 * @see #setPeriod(Period)
	 * @see fhiRCore.resources.ResourcesPackage#getResearchSubject_Period()
	 * @model containment="true"
	 * @generated
	 */
	Period getPeriod();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ResearchSubject#getPeriod <em>Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Period</em>' containment reference.
	 * @see #getPeriod()
	 * @generated
	 */
	void setPeriod(Period value);

	/**
	 * Returns the value of the '<em><b>Study</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Study</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Study</em>' containment reference.
	 * @see #setStudy(Reference)
	 * @see fhiRCore.resources.ResourcesPackage#getResearchSubject_Study()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Reference getStudy();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ResearchSubject#getStudy <em>Study</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Study</em>' containment reference.
	 * @see #getStudy()
	 * @generated
	 */
	void setStudy(Reference value);

	/**
	 * Returns the value of the '<em><b>Individual</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Individual</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Individual</em>' containment reference.
	 * @see #setIndividual(Reference)
	 * @see fhiRCore.resources.ResourcesPackage#getResearchSubject_Individual()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Reference getIndividual();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ResearchSubject#getIndividual <em>Individual</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Individual</em>' containment reference.
	 * @see #getIndividual()
	 * @generated
	 */
	void setIndividual(Reference value);

	/**
	 * Returns the value of the '<em><b>Assigned Arm</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assigned Arm</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assigned Arm</em>' containment reference.
	 * @see #setAssignedArm(fhiRCore.dataTypes.String)
	 * @see fhiRCore.resources.ResourcesPackage#getResearchSubject_AssignedArm()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getAssignedArm();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ResearchSubject#getAssignedArm <em>Assigned Arm</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assigned Arm</em>' containment reference.
	 * @see #getAssignedArm()
	 * @generated
	 */
	void setAssignedArm(fhiRCore.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Actual Arm</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actual Arm</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actual Arm</em>' containment reference.
	 * @see #setActualArm(fhiRCore.dataTypes.String)
	 * @see fhiRCore.resources.ResourcesPackage#getResearchSubject_ActualArm()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getActualArm();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ResearchSubject#getActualArm <em>Actual Arm</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actual Arm</em>' containment reference.
	 * @see #getActualArm()
	 * @generated
	 */
	void setActualArm(fhiRCore.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Consent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Consent</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Consent</em>' containment reference.
	 * @see #setConsent(Reference)
	 * @see fhiRCore.resources.ResourcesPackage#getResearchSubject_Consent()
	 * @model containment="true"
	 * @generated
	 */
	Reference getConsent();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ResearchSubject#getConsent <em>Consent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Consent</em>' containment reference.
	 * @see #getConsent()
	 * @generated
	 */
	void setConsent(Reference value);

} // ResearchSubject
