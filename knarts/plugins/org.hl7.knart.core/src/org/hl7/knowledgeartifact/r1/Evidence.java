/**
 */
package org.hl7.knowledgeartifact.r1;

import org.eclipse.emf.ecore.EObject;

import org.hl7.cdsdt.r2.CD;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Evidence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Reference to research on which the artifact is
 * 				based. This evidence can be 'graded' depending on its quality and
 * 				pedigree and the strength of the recommendations it makes.
 * 			
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.knowledgeartifact.r1.Evidence#getQualityOfEvidence <em>Quality Of Evidence</em>}</li>
 *   <li>{@link org.hl7.knowledgeartifact.r1.Evidence#getStrengthOfRecommendation <em>Strength Of Recommendation</em>}</li>
 *   <li>{@link org.hl7.knowledgeartifact.r1.Evidence#getResources <em>Resources</em>}</li>
 * </ul>
 *
 * @see org.hl7.knowledgeartifact.r1.R1Package#getEvidence()
 * @model extendedMetaData="name='Evidence' kind='elementOnly'"
 * @generated
 */
public interface Evidence extends EObject {
	/**
	 * Returns the value of the '<em><b>Quality Of Evidence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The quality of the evidence associated with this
	 * 						artifact. The codeSystem attribute specifies the quality scale
	 * 						used to grade this evidence source while the code specifies the
	 * 						actual quality score (represented as a coded value) associated
	 * 						with this evidence reference. CodeSystemName specifies the name of
	 * 						the scale. DisplayName specifies the display name of the coded
	 * 						value (the score).
	 * 					
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Quality Of Evidence</em>' containment reference.
	 * @see #setQualityOfEvidence(CD)
	 * @see org.hl7.knowledgeartifact.r1.R1Package#getEvidence_QualityOfEvidence()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='qualityOfEvidence' namespace='##targetNamespace'"
	 * @generated
	 */
	CD getQualityOfEvidence();

	/**
	 * Sets the value of the '{@link org.hl7.knowledgeartifact.r1.Evidence#getQualityOfEvidence <em>Quality Of Evidence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quality Of Evidence</em>' containment reference.
	 * @see #getQualityOfEvidence()
	 * @generated
	 */
	void setQualityOfEvidence(CD value);

	/**
	 * Returns the value of the '<em><b>Strength Of Recommendation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The strength of the recommendation assigned to
	 * 						this reference. The codeSystem attribute specifies the scale used
	 * 						to grade this evidence source while the code specifies the actual
	 * 						score (represented as a coded value) for the strength of the
	 * 						evidence. CodeSystemName specifies the name of the scale.
	 * 						DisplayName specifies the display name of the coded value (the
	 * 						score).
	 * 					
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Strength Of Recommendation</em>' containment reference.
	 * @see #setStrengthOfRecommendation(CD)
	 * @see org.hl7.knowledgeartifact.r1.R1Package#getEvidence_StrengthOfRecommendation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='strengthOfRecommendation' namespace='##targetNamespace'"
	 * @generated
	 */
	CD getStrengthOfRecommendation();

	/**
	 * Sets the value of the '{@link org.hl7.knowledgeartifact.r1.Evidence#getStrengthOfRecommendation <em>Strength Of Recommendation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Strength Of Recommendation</em>' containment reference.
	 * @see #getStrengthOfRecommendation()
	 * @generated
	 */
	void setStrengthOfRecommendation(CD value);

	/**
	 * Returns the value of the '<em><b>Resources</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The set of resource references associated with
	 * 						the evidence.
	 * 					
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Resources</em>' containment reference.
	 * @see #setResources(SupportingResource)
	 * @see org.hl7.knowledgeartifact.r1.R1Package#getEvidence_Resources()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='resources' namespace='##targetNamespace'"
	 * @generated
	 */
	SupportingResource getResources();

	/**
	 * Sets the value of the '{@link org.hl7.knowledgeartifact.r1.Evidence#getResources <em>Resources</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resources</em>' containment reference.
	 * @see #getResources()
	 * @generated
	 */
	void setResources(SupportingResource value);

} // Evidence
