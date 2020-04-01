/**
 */
package org.eclipse.mdht.hl7.fhir.resources;

import org.eclipse.mdht.hl7.fhir.dataTypes.BackboneElement;
import org.eclipse.mdht.hl7.fhir.dataTypes.DataType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Coverage Eligibility Request Details Diagnosis</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.CoverageEligibilityRequestDetailsDiagnosis#getDiagnosisx <em>Diagnosisx</em>}</li>
 * </ul>
 *
 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getCoverageEligibilityRequestDetailsDiagnosis()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Details_Diagnosis'"
 * @generated
 */
public interface CoverageEligibilityRequestDetailsDiagnosis extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Diagnosisx</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Diagnosisx</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diagnosisx</em>' containment reference.
	 * @see #setDiagnosisx(DataType)
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getCoverageEligibilityRequestDetailsDiagnosis_Diagnosisx()
	 * @model containment="true"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='diagnosis[x]'"
	 * @generated
	 */
	DataType getDiagnosisx();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.resources.CoverageEligibilityRequestDetailsDiagnosis#getDiagnosisx <em>Diagnosisx</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Diagnosisx</em>' containment reference.
	 * @see #getDiagnosisx()
	 * @generated
	 */
	void setDiagnosisx(DataType value);

} // CoverageEligibilityRequestDetailsDiagnosis
