/**
 */
package org.eclipse.mdht.hl7.fhir.resources;

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
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.Entry_Resource#getPlanDefinition <em>Plan Definition</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.Entry_Resource#getQuestionnaire <em>Questionnaire</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.Entry_Resource#getActivityDefinitions <em>Activity Definition</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.Entry_Resource#getValueSet <em>Value Set</em>}</li>
 * </ul>
 *
 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getEntry_Resource()
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
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getEntry_Resource_PlanDefinition()
	 * @model containment="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='PlanDefinition'"
	 * @generated
	 */
	PlanDefinition getPlanDefinition();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.resources.Entry_Resource#getPlanDefinition <em>Plan Definition</em>}' containment reference.
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
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getEntry_Resource_Questionnaire()
	 * @model containment="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Questionnaire'"
	 * @generated
	 */
	Questionnaire getQuestionnaire();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.resources.Entry_Resource#getQuestionnaire <em>Questionnaire</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Questionnaire</em>' containment reference.
	 * @see #getQuestionnaire()
	 * @generated
	 */
	void setQuestionnaire(Questionnaire value);

	/**
	 * Returns the value of the '<em><b>Activity Definition</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.mdht.hl7.fhir.resources.ActivityDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activity Definition</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activity Definition</em>' containment reference list.
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getEntry_Resource_ActivityDefinition()
	 * @model containment="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='ActivityDefinition'"
	 * @generated
	 */
	EList<ActivityDefinition> getActivityDefinitions();

	/**
	 * Returns the value of the '<em><b>Value Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Set</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Set</em>' containment reference.
	 * @see #setValueSet(ValueSet)
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getEntry_Resource_ValueSet()
	 * @model containment="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Questionnaire'"
	 * @generated
	 */
	ValueSet getValueSet();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.resources.Entry_Resource#getValueSet <em>Value Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Set</em>' containment reference.
	 * @see #getValueSet()
	 * @generated
	 */
	void setValueSet(ValueSet value);

} // Entry_Resource
