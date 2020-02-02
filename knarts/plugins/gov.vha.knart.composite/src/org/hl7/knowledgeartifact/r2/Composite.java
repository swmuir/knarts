/**
 */
package org.hl7.knowledgeartifact.r2;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composite</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.knowledgeartifact.r2.Composite#getMetadata <em>Metadata</em>}</li>
 *   <li>{@link org.hl7.knowledgeartifact.r2.Composite#getControlBlock <em>Control Block</em>}</li>
 *   <li>{@link org.hl7.knowledgeartifact.r2.Composite#getManifest <em>Manifest</em>}</li>
 *   <li>{@link org.hl7.knowledgeartifact.r2.Composite#getContainedArtifacts <em>Contained Artifacts</em>}</li>
 * </ul>
 *
 * @see org.hl7.knowledgeartifact.r2.R2Package#getComposite()
 * @model extendedMetaData="name='Composite' kind='elementOnly'"
 * @generated
 */
public interface Composite extends EObject {
	/**
	 * Returns the value of the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Metadata</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metadata</em>' containment reference.
	 * @see #setMetadata(Metadata)
	 * @see org.hl7.knowledgeartifact.r2.R2Package#getComposite_Metadata()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='metadata' namespace='##targetNamespace'"
	 * @generated
	 */
	Metadata getMetadata();

	/**
	 * Sets the value of the '{@link org.hl7.knowledgeartifact.r2.Composite#getMetadata <em>Metadata</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Metadata</em>' containment reference.
	 * @see #getMetadata()
	 * @generated
	 */
	void setMetadata(Metadata value);

	/**
	 * Returns the value of the '<em><b>Control Block</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Control Block</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Control Block</em>' containment reference.
	 * @see #setControlBlock(ControlBlock)
	 * @see org.hl7.knowledgeartifact.r2.R2Package#getComposite_ControlBlock()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='controlBlock' namespace='##targetNamespace'"
	 * @generated
	 */
	ControlBlock getControlBlock();

	/**
	 * Sets the value of the '{@link org.hl7.knowledgeartifact.r2.Composite#getControlBlock <em>Control Block</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Control Block</em>' containment reference.
	 * @see #getControlBlock()
	 * @generated
	 */
	void setControlBlock(ControlBlock value);

	/**
	 * Returns the value of the '<em><b>Manifest</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Provides a summary location and content metadata and a single access point for stream
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Manifest</em>' containment reference.
	 * @see #setManifest(Manifest)
	 * @see org.hl7.knowledgeartifact.r2.R2Package#getComposite_Manifest()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='manifest' namespace='##targetNamespace'"
	 * @generated
	 */
	Manifest getManifest();

	/**
	 * Sets the value of the '{@link org.hl7.knowledgeartifact.r2.Composite#getManifest <em>Manifest</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Manifest</em>' containment reference.
	 * @see #getManifest()
	 * @generated
	 */
	void setManifest(Manifest value);

	/**
	 * Returns the value of the '<em><b>Contained Artifacts</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contained Artifacts</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contained Artifacts</em>' containment reference.
	 * @see #setContainedArtifacts(ContainedArtifactList)
	 * @see org.hl7.knowledgeartifact.r2.R2Package#getComposite_ContainedArtifacts()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='containedArtifacts' namespace='##targetNamespace'"
	 * @generated
	 */
	ContainedArtifactList getContainedArtifacts();

	/**
	 * Sets the value of the '{@link org.hl7.knowledgeartifact.r2.Composite#getContainedArtifacts <em>Contained Artifacts</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contained Artifacts</em>' containment reference.
	 * @see #getContainedArtifacts()
	 * @generated
	 */
	void setContainedArtifacts(ContainedArtifactList value);

} // Composite
