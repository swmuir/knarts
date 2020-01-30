/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.Code;
import fhiRCore.dataTypes.CodeableConcept;
import fhiRCore.dataTypes.Identifier;
import fhiRCore.dataTypes.Period;
import fhiRCore.dataTypes.Reference;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Insurance Plan</b></em>'.
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
 *   <li>{@link fhiRCore.resources.InsurancePlan#getIdentifiers <em>Identifier</em>}</li>
 *   <li>{@link fhiRCore.resources.InsurancePlan#getStatus <em>Status</em>}</li>
 *   <li>{@link fhiRCore.resources.InsurancePlan#getTypes <em>Type</em>}</li>
 *   <li>{@link fhiRCore.resources.InsurancePlan#getName <em>Name</em>}</li>
 *   <li>{@link fhiRCore.resources.InsurancePlan#getAlias <em>Alias</em>}</li>
 *   <li>{@link fhiRCore.resources.InsurancePlan#getPeriod <em>Period</em>}</li>
 *   <li>{@link fhiRCore.resources.InsurancePlan#getOwnedBy <em>Owned By</em>}</li>
 *   <li>{@link fhiRCore.resources.InsurancePlan#getAdministeredBy <em>Administered By</em>}</li>
 *   <li>{@link fhiRCore.resources.InsurancePlan#getCoverageAreas <em>Coverage Area</em>}</li>
 *   <li>{@link fhiRCore.resources.InsurancePlan#getContacts <em>Contact</em>}</li>
 *   <li>{@link fhiRCore.resources.InsurancePlan#getEndpoints <em>Endpoint</em>}</li>
 *   <li>{@link fhiRCore.resources.InsurancePlan#getNetworks <em>Network</em>}</li>
 *   <li>{@link fhiRCore.resources.InsurancePlan#getCoverages <em>Coverage</em>}</li>
 *   <li>{@link fhiRCore.resources.InsurancePlan#getPlans <em>Plan</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getInsurancePlan()
 * @model
 * @generated
 */
public interface InsurancePlan extends DomainResource {
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
	 * @see fhiRCore.resources.ResourcesPackage#getInsurancePlan_Identifier()
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
	 * @see fhiRCore.resources.ResourcesPackage#getInsurancePlan_Status()
	 * @model containment="true"
	 * @generated
	 */
	Code getStatus();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.InsurancePlan#getStatus <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' containment reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(Code value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getInsurancePlan_Type()
	 * @model containment="true"
	 * @generated
	 */
	EList<CodeableConcept> getTypes();

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
	 * @see fhiRCore.resources.ResourcesPackage#getInsurancePlan_Name()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getName();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.InsurancePlan#getName <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' containment reference.
	 * @see #getName()
	 * @generated
	 */
	void setName(fhiRCore.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Alias</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alias</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alias</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getInsurancePlan_Alias()
	 * @model containment="true"
	 * @generated
	 */
	EList<fhiRCore.dataTypes.String> getAlias();

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
	 * @see fhiRCore.resources.ResourcesPackage#getInsurancePlan_Period()
	 * @model containment="true"
	 * @generated
	 */
	Period getPeriod();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.InsurancePlan#getPeriod <em>Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Period</em>' containment reference.
	 * @see #getPeriod()
	 * @generated
	 */
	void setPeriod(Period value);

	/**
	 * Returns the value of the '<em><b>Owned By</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned By</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned By</em>' containment reference.
	 * @see #setOwnedBy(Reference)
	 * @see fhiRCore.resources.ResourcesPackage#getInsurancePlan_OwnedBy()
	 * @model containment="true"
	 * @generated
	 */
	Reference getOwnedBy();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.InsurancePlan#getOwnedBy <em>Owned By</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned By</em>' containment reference.
	 * @see #getOwnedBy()
	 * @generated
	 */
	void setOwnedBy(Reference value);

	/**
	 * Returns the value of the '<em><b>Administered By</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Administered By</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Administered By</em>' containment reference.
	 * @see #setAdministeredBy(Reference)
	 * @see fhiRCore.resources.ResourcesPackage#getInsurancePlan_AdministeredBy()
	 * @model containment="true"
	 * @generated
	 */
	Reference getAdministeredBy();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.InsurancePlan#getAdministeredBy <em>Administered By</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Administered By</em>' containment reference.
	 * @see #getAdministeredBy()
	 * @generated
	 */
	void setAdministeredBy(Reference value);

	/**
	 * Returns the value of the '<em><b>Coverage Area</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.Reference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Coverage Area</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Coverage Area</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getInsurancePlan_CoverageArea()
	 * @model containment="true"
	 * @generated
	 */
	EList<Reference> getCoverageAreas();

	/**
	 * Returns the value of the '<em><b>Contact</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.resources.InsurancePlanContact}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contact</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contact</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getInsurancePlan_Contact()
	 * @model containment="true"
	 * @generated
	 */
	EList<InsurancePlanContact> getContacts();

	/**
	 * Returns the value of the '<em><b>Endpoint</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.Reference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Endpoint</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Endpoint</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getInsurancePlan_Endpoint()
	 * @model containment="true"
	 * @generated
	 */
	EList<Reference> getEndpoints();

	/**
	 * Returns the value of the '<em><b>Network</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.Reference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Network</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Network</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getInsurancePlan_Network()
	 * @model containment="true"
	 * @generated
	 */
	EList<Reference> getNetworks();

	/**
	 * Returns the value of the '<em><b>Coverage</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.resources.InsurancePlanCoverage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Coverage</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Coverage</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getInsurancePlan_Coverage()
	 * @model containment="true"
	 * @generated
	 */
	EList<InsurancePlanCoverage> getCoverages();

	/**
	 * Returns the value of the '<em><b>Plan</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.resources.InsurancePlanPlan}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Plan</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Plan</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getInsurancePlan_Plan()
	 * @model containment="true"
	 * @generated
	 */
	EList<InsurancePlanPlan> getPlans();

} // InsurancePlan
