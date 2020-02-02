/**
 */
package org.hl7.knowledgeartifact.r2;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Artifact Summary</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Summary of a single contained or referenced artifact
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.knowledgeartifact.r2.ArtifactSummary#getName <em>Name</em>}</li>
 *   <li>{@link org.hl7.knowledgeartifact.r2.ArtifactSummary#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.knowledgeartifact.r2.ArtifactSummary#getArtifactType <em>Artifact Type</em>}</li>
 *   <li>{@link org.hl7.knowledgeartifact.r2.ArtifactSummary#getSize <em>Size</em>}</li>
 *   <li>{@link org.hl7.knowledgeartifact.r2.ArtifactSummary#getHash <em>Hash</em>}</li>
 *   <li>{@link org.hl7.knowledgeartifact.r2.ArtifactSummary#getSignatures <em>Signatures</em>}</li>
 * </ul>
 *
 * @see org.hl7.knowledgeartifact.r2.R2Package#getArtifactSummary()
 * @model extendedMetaData="name='ArtifactSummary' kind='elementOnly'"
 * @generated
 */
public interface ArtifactSummary extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(EObject)
	 * @see org.hl7.knowledgeartifact.r2.R2Package#getArtifactSummary_Name()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getName();

	/**
	 * Sets the value of the '{@link org.hl7.knowledgeartifact.r2.ArtifactSummary#getName <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' containment reference.
	 * @see #getName()
	 * @generated
	 */
	void setName(EObject value);

	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Identifier</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference.
	 * @see #setIdentifier(EObject)
	 * @see org.hl7.knowledgeartifact.r2.R2Package#getArtifactSummary_Identifier()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='identifier' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getIdentifier();

	/**
	 * Sets the value of the '{@link org.hl7.knowledgeartifact.r2.ArtifactSummary#getIdentifier <em>Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identifier</em>' containment reference.
	 * @see #getIdentifier()
	 * @generated
	 */
	void setIdentifier(EObject value);

	/**
	 * Returns the value of the '<em><b>Artifact Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Artifact Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Artifact Type</em>' containment reference.
	 * @see #setArtifactType(EObject)
	 * @see org.hl7.knowledgeartifact.r2.R2Package#getArtifactSummary_ArtifactType()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='artifactType' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getArtifactType();

	/**
	 * Sets the value of the '{@link org.hl7.knowledgeartifact.r2.ArtifactSummary#getArtifactType <em>Artifact Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Artifact Type</em>' containment reference.
	 * @see #getArtifactType()
	 * @generated
	 */
	void setArtifactType(EObject value);

	/**
	 * Returns the value of the '<em><b>Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Size</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size</em>' containment reference.
	 * @see #setSize(EObject)
	 * @see org.hl7.knowledgeartifact.r2.R2Package#getArtifactSummary_Size()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='size' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getSize();

	/**
	 * Sets the value of the '{@link org.hl7.knowledgeartifact.r2.ArtifactSummary#getSize <em>Size</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' containment reference.
	 * @see #getSize()
	 * @generated
	 */
	void setSize(EObject value);

	/**
	 * Returns the value of the '<em><b>Hash</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hash</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hash</em>' containment reference.
	 * @see #setHash(EObject)
	 * @see org.hl7.knowledgeartifact.r2.R2Package#getArtifactSummary_Hash()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='hash' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getHash();

	/**
	 * Sets the value of the '{@link org.hl7.knowledgeartifact.r2.ArtifactSummary#getHash <em>Hash</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hash</em>' containment reference.
	 * @see #getHash()
	 * @generated
	 */
	void setHash(EObject value);

	/**
	 * Returns the value of the '<em><b>Signatures</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Signatures</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signatures</em>' containment reference.
	 * @see #setSignatures(EObject)
	 * @see org.hl7.knowledgeartifact.r2.R2Package#getArtifactSummary_Signatures()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='signatures' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getSignatures();

	/**
	 * Sets the value of the '{@link org.hl7.knowledgeartifact.r2.ArtifactSummary#getSignatures <em>Signatures</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signatures</em>' containment reference.
	 * @see #getSignatures()
	 * @generated
	 */
	void setSignatures(EObject value);

} // ArtifactSummary
