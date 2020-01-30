/**
 */
package fhiRCore.resources;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entry Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.Entry_Resource#getPlanDefinition <em>Plan Definition</em>}</li>
 *   <li>{@link fhiRCore.resources.Entry_Resource#getQuestionnaire <em>Questionnaire</em>}</li>
 *   <li>{@link fhiRCore.resources.Entry_Resource#getActivityDefinitions <em>Activity Definition</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getEntry_Resource()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Resource'"
 * @generated
 */
public interface Entry_Resource extends Resource {
	/**
	 * Returns the value of the '<em><b>Plan Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Plan Definition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Plan Definition</em>' containment reference.
	 * @see #setPlanDefinition(PlanDefinition)
	 * @see fhiRCore.resources.ResourcesPackage#getEntry_Resource_PlanDefinition()
	 * @model containment="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='PlanDefinition'"
	 * @generated
	 */
	PlanDefinition getPlanDefinition();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.Entry_Resource#getPlanDefinition <em>Plan Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Plan Definition</em>' containment reference.
	 * @see #getPlanDefinition()
	 * @generated
	 */
	void setPlanDefinition(PlanDefinition value);

	/**
	 * Returns the value of the '<em><b>Questionnaire</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Questionnaire</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Questionnaire</em>' containment reference.
	 * @see #setQuestionnaire(Questionnaire)
	 * @see fhiRCore.resources.ResourcesPackage#getEntry_Resource_Questionnaire()
	 * @model containment="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Questionnaire'"
	 * @generated
	 */
	Questionnaire getQuestionnaire();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.Entry_Resource#getQuestionnaire <em>Questionnaire</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Questionnaire</em>' containment reference.
	 * @see #getQuestionnaire()
	 * @generated
	 */
	void setQuestionnaire(Questionnaire value);

	/**
	 * Returns the value of the '<em><b>Activity Definition</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.resources.ActivityDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activity Definition</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activity Definition</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getEntry_Resource_ActivityDefinition()
	 * @model containment="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='ActivityDefinition'"
	 * @generated
	 */
	EList<ActivityDefinition> getActivityDefinitions();

} // Entry_Resource
