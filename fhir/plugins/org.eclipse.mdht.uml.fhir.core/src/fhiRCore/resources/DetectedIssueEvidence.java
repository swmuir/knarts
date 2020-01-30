/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.BackboneElement;
import fhiRCore.dataTypes.CodeableConcept;
import fhiRCore.dataTypes.Reference;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Detected Issue Evidence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.DetectedIssueEvidence#getCodes <em>Code</em>}</li>
 *   <li>{@link fhiRCore.resources.DetectedIssueEvidence#getDetails <em>Detail</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getDetectedIssueEvidence()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='DetectedIssue_Evidence'"
 * @generated
 */
public interface DetectedIssueEvidence extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Code</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getDetectedIssueEvidence_Code()
	 * @model containment="true"
	 * @generated
	 */
	EList<CodeableConcept> getCodes();

	/**
	 * Returns the value of the '<em><b>Detail</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.Reference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Detail</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Detail</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getDetectedIssueEvidence_Detail()
	 * @model containment="true"
	 * @generated
	 */
	EList<Reference> getDetails();

} // DetectedIssueEvidence
