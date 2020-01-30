/**
 */
package fhiRCore.resources;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Substance Reference Information</b></em>'.
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
 *   <li>{@link fhiRCore.resources.SubstanceReferenceInformation#getComment <em>Comment</em>}</li>
 *   <li>{@link fhiRCore.resources.SubstanceReferenceInformation#getGenes <em>Gene</em>}</li>
 *   <li>{@link fhiRCore.resources.SubstanceReferenceInformation#getGeneElements <em>Gene Element</em>}</li>
 *   <li>{@link fhiRCore.resources.SubstanceReferenceInformation#getClassifications <em>Classification</em>}</li>
 *   <li>{@link fhiRCore.resources.SubstanceReferenceInformation#getTargets <em>Target</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getSubstanceReferenceInformation()
 * @model
 * @generated
 */
public interface SubstanceReferenceInformation extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Comment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comment</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comment</em>' containment reference.
	 * @see #setComment(fhiRCore.dataTypes.String)
	 * @see fhiRCore.resources.ResourcesPackage#getSubstanceReferenceInformation_Comment()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getComment();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.SubstanceReferenceInformation#getComment <em>Comment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comment</em>' containment reference.
	 * @see #getComment()
	 * @generated
	 */
	void setComment(fhiRCore.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Gene</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.resources.SubstanceReferenceInformationGene}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gene</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gene</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getSubstanceReferenceInformation_Gene()
	 * @model containment="true"
	 * @generated
	 */
	EList<SubstanceReferenceInformationGene> getGenes();

	/**
	 * Returns the value of the '<em><b>Gene Element</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.resources.SubstanceReferenceInformationGeneElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gene Element</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gene Element</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getSubstanceReferenceInformation_GeneElement()
	 * @model containment="true"
	 * @generated
	 */
	EList<SubstanceReferenceInformationGeneElement> getGeneElements();

	/**
	 * Returns the value of the '<em><b>Classification</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.resources.SubstanceReferenceInformationClassification}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Classification</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classification</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getSubstanceReferenceInformation_Classification()
	 * @model containment="true"
	 * @generated
	 */
	EList<SubstanceReferenceInformationClassification> getClassifications();

	/**
	 * Returns the value of the '<em><b>Target</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.resources.SubstanceReferenceInformationTarget}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getSubstanceReferenceInformation_Target()
	 * @model containment="true"
	 * @generated
	 */
	EList<SubstanceReferenceInformationTarget> getTargets();

} // SubstanceReferenceInformation
