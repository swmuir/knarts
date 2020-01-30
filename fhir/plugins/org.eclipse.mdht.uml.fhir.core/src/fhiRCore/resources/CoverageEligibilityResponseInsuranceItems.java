/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.BackboneElement;
import fhiRCore.dataTypes.CodeableConcept;
import fhiRCore.dataTypes.Reference;
import fhiRCore.dataTypes.Uri;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Coverage Eligibility Response Insurance Items</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.CoverageEligibilityResponseInsuranceItems#getCategory <em>Category</em>}</li>
 *   <li>{@link fhiRCore.resources.CoverageEligibilityResponseInsuranceItems#getProductOrService <em>Product Or Service</em>}</li>
 *   <li>{@link fhiRCore.resources.CoverageEligibilityResponseInsuranceItems#getModifiers <em>Modifier</em>}</li>
 *   <li>{@link fhiRCore.resources.CoverageEligibilityResponseInsuranceItems#getProvider <em>Provider</em>}</li>
 *   <li>{@link fhiRCore.resources.CoverageEligibilityResponseInsuranceItems#getExcluded <em>Excluded</em>}</li>
 *   <li>{@link fhiRCore.resources.CoverageEligibilityResponseInsuranceItems#getName <em>Name</em>}</li>
 *   <li>{@link fhiRCore.resources.CoverageEligibilityResponseInsuranceItems#getDescription <em>Description</em>}</li>
 *   <li>{@link fhiRCore.resources.CoverageEligibilityResponseInsuranceItems#getNetwork <em>Network</em>}</li>
 *   <li>{@link fhiRCore.resources.CoverageEligibilityResponseInsuranceItems#getUnit <em>Unit</em>}</li>
 *   <li>{@link fhiRCore.resources.CoverageEligibilityResponseInsuranceItems#getTerm <em>Term</em>}</li>
 *   <li>{@link fhiRCore.resources.CoverageEligibilityResponseInsuranceItems#getBenefits <em>Benefit</em>}</li>
 *   <li>{@link fhiRCore.resources.CoverageEligibilityResponseInsuranceItems#getAuthorizationRequired <em>Authorization Required</em>}</li>
 *   <li>{@link fhiRCore.resources.CoverageEligibilityResponseInsuranceItems#getAuthorizationSupportings <em>Authorization Supporting</em>}</li>
 *   <li>{@link fhiRCore.resources.CoverageEligibilityResponseInsuranceItems#getAuthorizationUrl <em>Authorization Url</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getCoverageEligibilityResponseInsuranceItems()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Insurance_Items'"
 * @generated
 */
public interface CoverageEligibilityResponseInsuranceItems extends BackboneElement {
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
	 * @see fhiRCore.resources.ResourcesPackage#getCoverageEligibilityResponseInsuranceItems_Category()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getCategory();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.CoverageEligibilityResponseInsuranceItems#getCategory <em>Category</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Category</em>' containment reference.
	 * @see #getCategory()
	 * @generated
	 */
	void setCategory(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Product Or Service</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Or Service</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Or Service</em>' containment reference.
	 * @see #setProductOrService(CodeableConcept)
	 * @see fhiRCore.resources.ResourcesPackage#getCoverageEligibilityResponseInsuranceItems_ProductOrService()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getProductOrService();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.CoverageEligibilityResponseInsuranceItems#getProductOrService <em>Product Or Service</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Or Service</em>' containment reference.
	 * @see #getProductOrService()
	 * @generated
	 */
	void setProductOrService(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Modifier</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modifier</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modifier</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getCoverageEligibilityResponseInsuranceItems_Modifier()
	 * @model containment="true"
	 * @generated
	 */
	EList<CodeableConcept> getModifiers();

	/**
	 * Returns the value of the '<em><b>Provider</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Provider</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provider</em>' containment reference.
	 * @see #setProvider(Reference)
	 * @see fhiRCore.resources.ResourcesPackage#getCoverageEligibilityResponseInsuranceItems_Provider()
	 * @model containment="true"
	 * @generated
	 */
	Reference getProvider();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.CoverageEligibilityResponseInsuranceItems#getProvider <em>Provider</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Provider</em>' containment reference.
	 * @see #getProvider()
	 * @generated
	 */
	void setProvider(Reference value);

	/**
	 * Returns the value of the '<em><b>Excluded</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Excluded</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Excluded</em>' containment reference.
	 * @see #setExcluded(fhiRCore.dataTypes.Boolean)
	 * @see fhiRCore.resources.ResourcesPackage#getCoverageEligibilityResponseInsuranceItems_Excluded()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.Boolean getExcluded();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.CoverageEligibilityResponseInsuranceItems#getExcluded <em>Excluded</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Excluded</em>' containment reference.
	 * @see #getExcluded()
	 * @generated
	 */
	void setExcluded(fhiRCore.dataTypes.Boolean value);

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
	 * @see fhiRCore.resources.ResourcesPackage#getCoverageEligibilityResponseInsuranceItems_Name()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getName();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.CoverageEligibilityResponseInsuranceItems#getName <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' containment reference.
	 * @see #getName()
	 * @generated
	 */
	void setName(fhiRCore.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(fhiRCore.dataTypes.String)
	 * @see fhiRCore.resources.ResourcesPackage#getCoverageEligibilityResponseInsuranceItems_Description()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getDescription();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.CoverageEligibilityResponseInsuranceItems#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(fhiRCore.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Network</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Network</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Network</em>' containment reference.
	 * @see #setNetwork(CodeableConcept)
	 * @see fhiRCore.resources.ResourcesPackage#getCoverageEligibilityResponseInsuranceItems_Network()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getNetwork();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.CoverageEligibilityResponseInsuranceItems#getNetwork <em>Network</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Network</em>' containment reference.
	 * @see #getNetwork()
	 * @generated
	 */
	void setNetwork(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Unit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unit</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit</em>' containment reference.
	 * @see #setUnit(CodeableConcept)
	 * @see fhiRCore.resources.ResourcesPackage#getCoverageEligibilityResponseInsuranceItems_Unit()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getUnit();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.CoverageEligibilityResponseInsuranceItems#getUnit <em>Unit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit</em>' containment reference.
	 * @see #getUnit()
	 * @generated
	 */
	void setUnit(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Term</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Term</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Term</em>' containment reference.
	 * @see #setTerm(CodeableConcept)
	 * @see fhiRCore.resources.ResourcesPackage#getCoverageEligibilityResponseInsuranceItems_Term()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getTerm();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.CoverageEligibilityResponseInsuranceItems#getTerm <em>Term</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Term</em>' containment reference.
	 * @see #getTerm()
	 * @generated
	 */
	void setTerm(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Benefit</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.resources.CoverageEligibilityResponseInsuranceItemsBenefit}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Benefit</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Benefit</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getCoverageEligibilityResponseInsuranceItems_Benefit()
	 * @model containment="true"
	 * @generated
	 */
	EList<CoverageEligibilityResponseInsuranceItemsBenefit> getBenefits();

	/**
	 * Returns the value of the '<em><b>Authorization Required</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Authorization Required</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Authorization Required</em>' containment reference.
	 * @see #setAuthorizationRequired(fhiRCore.dataTypes.Boolean)
	 * @see fhiRCore.resources.ResourcesPackage#getCoverageEligibilityResponseInsuranceItems_AuthorizationRequired()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.Boolean getAuthorizationRequired();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.CoverageEligibilityResponseInsuranceItems#getAuthorizationRequired <em>Authorization Required</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Authorization Required</em>' containment reference.
	 * @see #getAuthorizationRequired()
	 * @generated
	 */
	void setAuthorizationRequired(fhiRCore.dataTypes.Boolean value);

	/**
	 * Returns the value of the '<em><b>Authorization Supporting</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Authorization Supporting</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Authorization Supporting</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getCoverageEligibilityResponseInsuranceItems_AuthorizationSupporting()
	 * @model containment="true"
	 * @generated
	 */
	EList<CodeableConcept> getAuthorizationSupportings();

	/**
	 * Returns the value of the '<em><b>Authorization Url</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Authorization Url</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Authorization Url</em>' containment reference.
	 * @see #setAuthorizationUrl(Uri)
	 * @see fhiRCore.resources.ResourcesPackage#getCoverageEligibilityResponseInsuranceItems_AuthorizationUrl()
	 * @model containment="true"
	 * @generated
	 */
	Uri getAuthorizationUrl();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.CoverageEligibilityResponseInsuranceItems#getAuthorizationUrl <em>Authorization Url</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Authorization Url</em>' containment reference.
	 * @see #getAuthorizationUrl()
	 * @generated
	 */
	void setAuthorizationUrl(Uri value);

} // CoverageEligibilityResponseInsuranceItems
