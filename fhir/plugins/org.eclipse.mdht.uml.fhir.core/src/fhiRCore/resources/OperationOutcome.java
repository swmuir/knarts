/**
 */
package fhiRCore.resources;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation Outcome</b></em>'.
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
 *   <li>{@link fhiRCore.resources.OperationOutcome#getIssues <em>Issue</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getOperationOutcome()
 * @model
 * @generated
 */
public interface OperationOutcome extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Issue</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.resources.OperationOutcomeIssue}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Issue</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Issue</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getOperationOutcome_Issue()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<OperationOutcomeIssue> getIssues();

} // OperationOutcome
