/**
 */
package org.eclipse.mdht.hl7.fhir.resources;

import org.eclipse.mdht.hl7.fhir.dataTypes.BackboneElement;
import org.eclipse.mdht.hl7.fhir.dataTypes.PositiveInt;
import org.eclipse.mdht.hl7.fhir.dataTypes.Reference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Coverage Eligibility Request Supporting Information</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.CoverageEligibilityRequestSupportingInformation#getSequence <em>Sequence</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.CoverageEligibilityRequestSupportingInformation#getInformation <em>Information</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.CoverageEligibilityRequestSupportingInformation#getAppliesToAll <em>Applies To All</em>}</li>
 * </ul>
 *
 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getCoverageEligibilityRequestSupportingInformation()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='CoverageEligibilityRequest_SupportingInformation'"
 * @generated
 */
public interface CoverageEligibilityRequestSupportingInformation extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Sequence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sequence</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sequence</em>' containment reference.
	 * @see #setSequence(PositiveInt)
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getCoverageEligibilityRequestSupportingInformation_Sequence()
	 * @model containment="true" required="true"
	 * @generated
	 */
	PositiveInt getSequence();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.resources.CoverageEligibilityRequestSupportingInformation#getSequence <em>Sequence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sequence</em>' containment reference.
	 * @see #getSequence()
	 * @generated
	 */
	void setSequence(PositiveInt value);

	/**
	 * Returns the value of the '<em><b>Information</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Information</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Information</em>' containment reference.
	 * @see #setInformation(Reference)
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getCoverageEligibilityRequestSupportingInformation_Information()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Reference getInformation();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.resources.CoverageEligibilityRequestSupportingInformation#getInformation <em>Information</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Information</em>' containment reference.
	 * @see #getInformation()
	 * @generated
	 */
	void setInformation(Reference value);

	/**
	 * Returns the value of the '<em><b>Applies To All</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Applies To All</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Applies To All</em>' containment reference.
	 * @see #setAppliesToAll(org.eclipse.mdht.hl7.fhir.dataTypes.Boolean)
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getCoverageEligibilityRequestSupportingInformation_AppliesToAll()
	 * @model containment="true"
	 * @generated
	 */
	org.eclipse.mdht.hl7.fhir.dataTypes.Boolean getAppliesToAll();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.resources.CoverageEligibilityRequestSupportingInformation#getAppliesToAll <em>Applies To All</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Applies To All</em>' containment reference.
	 * @see #getAppliesToAll()
	 * @generated
	 */
	void setAppliesToAll(org.eclipse.mdht.hl7.fhir.dataTypes.Boolean value);

} // CoverageEligibilityRequestSupportingInformation
