/**
 */
package org.hl7.knowledgeartifact.r2;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Manifest</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The role of the manifest is to provide single access point that describes what is in the composite without incuring the cost of loading the full artifacts. The manifest should include basic type infomation, a summary of the artifacts contained within, and envelop security information like hashs and signatures.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.knowledgeartifact.r2.Manifest#getArtifactSummary <em>Artifact Summary</em>}</li>
 * </ul>
 *
 * @see org.hl7.knowledgeartifact.r2.R2Package#getManifest()
 * @model extendedMetaData="name='Manifest' kind='elementOnly'"
 * @generated
 */
public interface Manifest extends EObject {
	/**
	 * Returns the value of the '<em><b>Artifact Summary</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Artifact Summary</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Artifact Summary</em>' containment reference.
	 * @see #setArtifactSummary(ArtifactSummary)
	 * @see org.hl7.knowledgeartifact.r2.R2Package#getManifest_ArtifactSummary()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='artifactSummary' namespace='##targetNamespace'"
	 * @generated
	 */
	ArtifactSummary getArtifactSummary();

	/**
	 * Sets the value of the '{@link org.hl7.knowledgeartifact.r2.Manifest#getArtifactSummary <em>Artifact Summary</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Artifact Summary</em>' containment reference.
	 * @see #getArtifactSummary()
	 * @generated
	 */
	void setArtifactSummary(ArtifactSummary value);

} // Manifest
