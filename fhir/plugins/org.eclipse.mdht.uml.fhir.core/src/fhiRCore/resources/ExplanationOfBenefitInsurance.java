/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.BackboneElement;
import fhiRCore.dataTypes.Reference;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Explanation Of Benefit Insurance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.ExplanationOfBenefitInsurance#getFocal <em>Focal</em>}</li>
 *   <li>{@link fhiRCore.resources.ExplanationOfBenefitInsurance#getCoverage <em>Coverage</em>}</li>
 *   <li>{@link fhiRCore.resources.ExplanationOfBenefitInsurance#getPreAuthRefs <em>Pre Auth Ref</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getExplanationOfBenefitInsurance()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='ExplanationOfBenefit_Insurance'"
 * @generated
 */
public interface ExplanationOfBenefitInsurance extends BackboneElement {
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
	 * @see fhiRCore.resources.ResourcesPackage#getExplanationOfBenefitInsurance_Focal()
	 * @model containment="true" required="true"
	 * @generated
	 */
	fhiRCore.dataTypes.Boolean getFocal();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ExplanationOfBenefitInsurance#getFocal <em>Focal</em>}' containment reference.
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
	 * @see fhiRCore.resources.ResourcesPackage#getExplanationOfBenefitInsurance_Coverage()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Reference getCoverage();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ExplanationOfBenefitInsurance#getCoverage <em>Coverage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coverage</em>' containment reference.
	 * @see #getCoverage()
	 * @generated
	 */
	void setCoverage(Reference value);

	/**
	 * Returns the value of the '<em><b>Pre Auth Ref</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pre Auth Ref</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pre Auth Ref</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getExplanationOfBenefitInsurance_PreAuthRef()
	 * @model containment="true"
	 * @generated
	 */
	EList<fhiRCore.dataTypes.String> getPreAuthRefs();

} // ExplanationOfBenefitInsurance
