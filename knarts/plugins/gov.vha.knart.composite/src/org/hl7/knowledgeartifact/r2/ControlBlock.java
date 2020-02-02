/**
 */
package org.hl7.knowledgeartifact.r2;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Control Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Control information on how the artifact is expected to operate,This includes 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.knowledgeartifact.r2.ControlBlock#getContext <em>Context</em>}</li>
 *   <li>{@link org.hl7.knowledgeartifact.r2.ControlBlock#getEventActivation <em>Event Activation</em>}</li>
 *   <li>{@link org.hl7.knowledgeartifact.r2.ControlBlock#getPropagation <em>Propagation</em>}</li>
 *   <li>{@link org.hl7.knowledgeartifact.r2.ControlBlock#getMapping <em>Mapping</em>}</li>
 *   <li>{@link org.hl7.knowledgeartifact.r2.ControlBlock#getControllingArtifact <em>Controlling Artifact</em>}</li>
 *   <li>{@link org.hl7.knowledgeartifact.r2.ControlBlock#getInitialArtifact <em>Initial Artifact</em>}</li>
 * </ul>
 *
 * @see org.hl7.knowledgeartifact.r2.R2Package#getControlBlock()
 * @model extendedMetaData="name='ControlBlock' kind='elementOnly'"
 * @generated
 */
public interface ControlBlock extends EObject {
	/**
	 * Returns the value of the '<em><b>Context</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Context</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context</em>' containment reference.
	 * @see #setContext(Context)
	 * @see org.hl7.knowledgeartifact.r2.R2Package#getControlBlock_Context()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='context' namespace='##targetNamespace'"
	 * @generated
	 */
	Context getContext();

	/**
	 * Sets the value of the '{@link org.hl7.knowledgeartifact.r2.ControlBlock#getContext <em>Context</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context</em>' containment reference.
	 * @see #getContext()
	 * @generated
	 */
	void setContext(Context value);

	/**
	 * Returns the value of the '<em><b>Event Activation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines the events that activate a this artifact and map to the behavior.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Event Activation</em>' containment reference.
	 * @see #setEventActivation(EObject)
	 * @see org.hl7.knowledgeartifact.r2.R2Package#getControlBlock_EventActivation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='eventActivation' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getEventActivation();

	/**
	 * Sets the value of the '{@link org.hl7.knowledgeartifact.r2.ControlBlock#getEventActivation <em>Event Activation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event Activation</em>' containment reference.
	 * @see #getEventActivation()
	 * @generated
	 */
	void setEventActivation(EObject value);

	/**
	 * Returns the value of the '<em><b>Propagation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines how events and data are progated.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Propagation</em>' containment reference.
	 * @see #setPropagation(EObject)
	 * @see org.hl7.knowledgeartifact.r2.R2Package#getControlBlock_Propagation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='propagation' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getPropagation();

	/**
	 * Sets the value of the '{@link org.hl7.knowledgeartifact.r2.ControlBlock#getPropagation <em>Propagation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Propagation</em>' containment reference.
	 * @see #getPropagation()
	 * @generated
	 */
	void setPropagation(EObject value);

	/**
	 * Returns the value of the '<em><b>Mapping</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mapping</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mapping</em>' containment reference.
	 * @see #setMapping(MappingType)
	 * @see org.hl7.knowledgeartifact.r2.R2Package#getControlBlock_Mapping()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='mapping' namespace='##targetNamespace'"
	 * @generated
	 */
	MappingType getMapping();

	/**
	 * Sets the value of the '{@link org.hl7.knowledgeartifact.r2.ControlBlock#getMapping <em>Mapping</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mapping</em>' containment reference.
	 * @see #getMapping()
	 * @generated
	 */
	void setMapping(MappingType value);

	/**
	 * Returns the value of the '<em><b>Controlling Artifact</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The artifact which acts as the principle orchestrator/controller of the composite.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Controlling Artifact</em>' containment reference.
	 * @see #setControllingArtifact(ControllingArtifactType)
	 * @see org.hl7.knowledgeartifact.r2.R2Package#getControlBlock_ControllingArtifact()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='controllingArtifact' namespace='##targetNamespace'"
	 * @generated
	 */
	ControllingArtifactType getControllingArtifact();

	/**
	 * Sets the value of the '{@link org.hl7.knowledgeartifact.r2.ControlBlock#getControllingArtifact <em>Controlling Artifact</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Controlling Artifact</em>' containment reference.
	 * @see #getControllingArtifact()
	 * @generated
	 */
	void setControllingArtifact(ControllingArtifactType value);

	/**
	 * Returns the value of the '<em><b>Initial Artifact</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.knowledgeartifact.r2.InitialArtifactType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The artifacts which which are initially activated 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Initial Artifact</em>' containment reference list.
	 * @see org.hl7.knowledgeartifact.r2.R2Package#getControlBlock_InitialArtifact()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='initialArtifact' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<InitialArtifactType> getInitialArtifact();

} // ControlBlock
