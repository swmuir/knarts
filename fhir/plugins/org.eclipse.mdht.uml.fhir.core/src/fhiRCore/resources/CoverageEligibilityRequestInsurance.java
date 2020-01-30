/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.BackboneElement;
import fhiRCore.dataTypes.Reference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Coverage Eligibility Request Insurance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.CoverageEligibilityRequestInsurance#getFocal <em>Focal</em>}</li>
 *   <li>{@link fhiRCore.resources.CoverageEligibilityRequestInsurance#getCoverage <em>Coverage</em>}</li>
 *   <li>{@link fhiRCore.resources.CoverageEligibilityRequestInsurance#getBusinessArrangement <em>Business Arrangement</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getCoverageEligibilityRequestInsurance()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='CoverageEligibilityRequest_Insurance'"
 * @generated
 */
public interface CoverageEligibilityRequestInsurance extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Focal</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Focal</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Focal</em>' containment reference.
	 * @see #setFocal(fhiRCore.dataTypes.Boolean)
	 * @see fhiRCore.resources.ResourcesPackage#getCoverageEligibilityRequestInsurance_Focal()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.Boolean getFocal();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.CoverageEligibilityRequestInsurance#getFocal <em>Focal</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Focal</em>' containment reference.
	 * @see #getFocal()
	 * @generated
	 */
	void setFocal(fhiRCore.dataTypes.Boolean value);

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
	 * @see fhiRCore.resources.ResourcesPackage#getCoverageEligibilityRequestInsurance_Coverage()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Reference getCoverage();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.CoverageEligibilityRequestInsurance#getCoverage <em>Coverage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coverage</em>' containment reference.
	 * @see #getCoverage()
	 * @generated
	 */
	void setCoverage(Reference value);

	/**
	 * Returns the value of the '<em><b>Business Arrangement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Business Arrangement</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Business Arrangement</em>' containment reference.
	 * @see #setBusinessArrangement(fhiRCore.dataTypes.String)
	 * @see fhiRCore.resources.ResourcesPackage#getCoverageEligibilityRequestInsurance_BusinessArrangement()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getBusinessArrangement();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.CoverageEligibilityRequestInsurance#getBusinessArrangement <em>Business Arrangement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Business Arrangement</em>' containment reference.
	 * @see #getBusinessArrangement()
	 * @generated
	 */
	void setBusinessArrangement(fhiRCore.dataTypes.String value);

} // CoverageEligibilityRequestInsurance
