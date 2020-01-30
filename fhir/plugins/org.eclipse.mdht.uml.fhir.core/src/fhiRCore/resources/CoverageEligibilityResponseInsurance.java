/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.BackboneElement;
import fhiRCore.dataTypes.Period;
import fhiRCore.dataTypes.Reference;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Coverage Eligibility Response Insurance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.CoverageEligibilityResponseInsurance#getCoverage <em>Coverage</em>}</li>
 *   <li>{@link fhiRCore.resources.CoverageEligibilityResponseInsurance#getInforce <em>Inforce</em>}</li>
 *   <li>{@link fhiRCore.resources.CoverageEligibilityResponseInsurance#getBenefitPeriod <em>Benefit Period</em>}</li>
 *   <li>{@link fhiRCore.resources.CoverageEligibilityResponseInsurance#getItems <em>Item</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getCoverageEligibilityResponseInsurance()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='CoverageEligibilityResponse_Insurance'"
 * @generated
 */
public interface CoverageEligibilityResponseInsurance extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Coverage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Coverage</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Coverage</em>' containment reference.
	 * @see #setCoverage(Reference)
	 * @see fhiRCore.resources.ResourcesPackage#getCoverageEligibilityResponseInsurance_Coverage()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Reference getCoverage();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.CoverageEligibilityResponseInsurance#getCoverage <em>Coverage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coverage</em>' containment reference.
	 * @see #getCoverage()
	 * @generated
	 */
	void setCoverage(Reference value);

	/**
	 * Returns the value of the '<em><b>Inforce</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inforce</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inforce</em>' containment reference.
	 * @see #setInforce(fhiRCore.dataTypes.Boolean)
	 * @see fhiRCore.resources.ResourcesPackage#getCoverageEligibilityResponseInsurance_Inforce()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.Boolean getInforce();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.CoverageEligibilityResponseInsurance#getInforce <em>Inforce</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inforce</em>' containment reference.
	 * @see #getInforce()
	 * @generated
	 */
	void setInforce(fhiRCore.dataTypes.Boolean value);

	/**
	 * Returns the value of the '<em><b>Benefit Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Benefit Period</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Benefit Period</em>' containment reference.
	 * @see #setBenefitPeriod(Period)
	 * @see fhiRCore.resources.ResourcesPackage#getCoverageEligibilityResponseInsurance_BenefitPeriod()
	 * @model containment="true"
	 * @generated
	 */
	Period getBenefitPeriod();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.CoverageEligibilityResponseInsurance#getBenefitPeriod <em>Benefit Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Benefit Period</em>' containment reference.
	 * @see #getBenefitPeriod()
	 * @generated
	 */
	void setBenefitPeriod(Period value);

	/**
	 * Returns the value of the '<em><b>Item</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.resources.CoverageEligibilityResponseInsuranceItems}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Item</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Item</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getCoverageEligibilityResponseInsurance_Item()
	 * @model containment="true"
	 * @generated
	 */
	EList<CoverageEligibilityResponseInsuranceItems> getItems();

} // CoverageEligibilityResponseInsurance
