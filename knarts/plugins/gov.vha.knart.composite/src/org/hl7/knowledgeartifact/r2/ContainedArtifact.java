/**
 */
package org.hl7.knowledgeartifact.r2;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contained Artifact</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Set of contained artifacts
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.knowledgeartifact.r2.ContainedArtifact#getArtifactType <em>Artifact Type</em>}</li>
 *   <li>{@link org.hl7.knowledgeartifact.r2.ContainedArtifact#getName <em>Name</em>}</li>
 *   <li>{@link org.hl7.knowledgeartifact.r2.ContainedArtifact#getBindingName <em>Binding Name</em>}</li>
 *   <li>{@link org.hl7.knowledgeartifact.r2.ContainedArtifact#getInclusionCriteria <em>Inclusion Criteria</em>}</li>
 *   <li>{@link org.hl7.knowledgeartifact.r2.ContainedArtifact#getContext <em>Context</em>}</li>
 *   <li>{@link org.hl7.knowledgeartifact.r2.ContainedArtifact#getEventBinding <em>Event Binding</em>}</li>
 *   <li>{@link org.hl7.knowledgeartifact.r2.ContainedArtifact#getMetadataBinding <em>Metadata Binding</em>}</li>
 *   <li>{@link org.hl7.knowledgeartifact.r2.ContainedArtifact#getGroup <em>Group</em>}</li>
 *   <li>{@link org.hl7.knowledgeartifact.r2.ContainedArtifact#getWrappedContent <em>Wrapped Content</em>}</li>
 *   <li>{@link org.hl7.knowledgeartifact.r2.ContainedArtifact#getReference <em>Reference</em>}</li>
 *   <li>{@link org.hl7.knowledgeartifact.r2.ContainedArtifact#getKnowledgeDocument <em>Knowledge Document</em>}</li>
 *   <li>{@link org.hl7.knowledgeartifact.r2.ContainedArtifact#getMustUnderstand <em>Must Understand</em>}</li>
 *   <li>{@link org.hl7.knowledgeartifact.r2.ContainedArtifact#getOnCompletion <em>On Completion</em>}</li>
 * </ul>
 *
 * @see org.hl7.knowledgeartifact.r2.R2Package#getContainedArtifact()
 * @model extendedMetaData="name='ContainedArtifact' kind='elementOnly'"
 * @generated
 */
public interface ContainedArtifact extends EObject {
	/**
	 * Returns the value of the '<em><b>Artifact Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Artifact Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Artifact Type</em>' containment reference.
	 * @see #setArtifactType(ArtifactTypeType)
	 * @see org.hl7.knowledgeartifact.r2.R2Package#getContainedArtifact_ArtifactType()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='artifactType' namespace='##targetNamespace'"
	 * @generated
	 */
	ArtifactTypeType getArtifactType();

	/**
	 * Sets the value of the '{@link org.hl7.knowledgeartifact.r2.ContainedArtifact#getArtifactType <em>Artifact Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Artifact Type</em>' containment reference.
	 * @see #getArtifactType()
	 * @generated
	 */
	void setArtifactType(ArtifactTypeType value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(NameType)
	 * @see org.hl7.knowledgeartifact.r2.R2Package#getContainedArtifact_Name()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	NameType getName();

	/**
	 * Sets the value of the '{@link org.hl7.knowledgeartifact.r2.ContainedArtifact#getName <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' containment reference.
	 * @see #getName()
	 * @generated
	 */
	void setName(NameType value);

	/**
	 * Returns the value of the '<em><b>Binding Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The name by which this artifact is known to this composite. The name is scoped to just this composite and would form that basis for intra-artifact references 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Binding Name</em>' containment reference.
	 * @see #setBindingName(BindingNameType)
	 * @see org.hl7.knowledgeartifact.r2.R2Package#getContainedArtifact_BindingName()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='bindingName' namespace='##targetNamespace'"
	 * @generated
	 */
	BindingNameType getBindingName();

	/**
	 * Sets the value of the '{@link org.hl7.knowledgeartifact.r2.ContainedArtifact#getBindingName <em>Binding Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Binding Name</em>' containment reference.
	 * @see #getBindingName()
	 * @generated
	 */
	void setBindingName(BindingNameType value);

	/**
	 * Returns the value of the '<em><b>Inclusion Criteria</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inclusion Criteria</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inclusion Criteria</em>' containment reference.
	 * @see #setInclusionCriteria(EObject)
	 * @see org.hl7.knowledgeartifact.r2.R2Package#getContainedArtifact_InclusionCriteria()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='inclusionCriteria' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getInclusionCriteria();

	/**
	 * Sets the value of the '{@link org.hl7.knowledgeartifact.r2.ContainedArtifact#getInclusionCriteria <em>Inclusion Criteria</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inclusion Criteria</em>' containment reference.
	 * @see #getInclusionCriteria()
	 * @generated
	 */
	void setInclusionCriteria(EObject value);

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
	 * @see org.hl7.knowledgeartifact.r2.R2Package#getContainedArtifact_Context()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='context' namespace='##targetNamespace'"
	 * @generated
	 */
	Context getContext();

	/**
	 * Sets the value of the '{@link org.hl7.knowledgeartifact.r2.ContainedArtifact#getContext <em>Context</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context</em>' containment reference.
	 * @see #getContext()
	 * @generated
	 */
	void setContext(Context value);

	/**
	 * Returns the value of the '<em><b>Event Binding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event Binding</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event Binding</em>' containment reference.
	 * @see #setEventBinding(EventBinding)
	 * @see org.hl7.knowledgeartifact.r2.R2Package#getContainedArtifact_EventBinding()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='eventBinding' namespace='##targetNamespace'"
	 * @generated
	 */
	EventBinding getEventBinding();

	/**
	 * Sets the value of the '{@link org.hl7.knowledgeartifact.r2.ContainedArtifact#getEventBinding <em>Event Binding</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event Binding</em>' containment reference.
	 * @see #getEventBinding()
	 * @generated
	 */
	void setEventBinding(EventBinding value);

	/**
	 * Returns the value of the '<em><b>Metadata Binding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Metadata Binding</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metadata Binding</em>' containment reference.
	 * @see #setMetadataBinding(MetadataBinding)
	 * @see org.hl7.knowledgeartifact.r2.R2Package#getContainedArtifact_MetadataBinding()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='metadataBinding' namespace='##targetNamespace'"
	 * @generated
	 */
	MetadataBinding getMetadataBinding();

	/**
	 * Sets the value of the '{@link org.hl7.knowledgeartifact.r2.ContainedArtifact#getMetadataBinding <em>Metadata Binding</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Metadata Binding</em>' containment reference.
	 * @see #getMetadataBinding()
	 * @generated
	 */
	void setMetadataBinding(MetadataBinding value);

	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' attribute list.
	 * @see org.hl7.knowledgeartifact.r2.R2Package#getContainedArtifact_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:7'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Wrapped Content</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.knowledgeartifact.r2.WrappedContent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Wrapped Content</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wrapped Content</em>' containment reference list.
	 * @see org.hl7.knowledgeartifact.r2.R2Package#getContainedArtifact_WrappedContent()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='wrappedContent' namespace='##targetNamespace' group='#group:7'"
	 * @generated
	 */
	EList<WrappedContent> getWrappedContent();

	/**
	 * Returns the value of the '<em><b>Reference</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.knowledgeartifact.r2.Reference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reference</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference</em>' containment reference list.
	 * @see org.hl7.knowledgeartifact.r2.R2Package#getContainedArtifact_Reference()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='reference' namespace='##targetNamespace' group='#group:7'"
	 * @generated
	 */
	EList<Reference> getReference();

	/**
	 * Returns the value of the '<em><b>Knowledge Document</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.knowledgeartifact.r2.KnowledgeDocument}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Knowledge Document</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Knowledge Document</em>' containment reference list.
	 * @see org.hl7.knowledgeartifact.r2.R2Package#getContainedArtifact_KnowledgeDocument()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='knowledgeDocument' namespace='##targetNamespace' group='#group:7'"
	 * @generated
	 */
	EList<KnowledgeDocument> getKnowledgeDocument();

	/**
	 * Returns the value of the '<em><b>Must Understand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Must Understand</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Must Understand</em>' containment reference.
	 * @see #setMustUnderstand(EObject)
	 * @see org.hl7.knowledgeartifact.r2.R2Package#getContainedArtifact_MustUnderstand()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='mustUnderstand' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getMustUnderstand();

	/**
	 * Sets the value of the '{@link org.hl7.knowledgeartifact.r2.ContainedArtifact#getMustUnderstand <em>Must Understand</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Must Understand</em>' containment reference.
	 * @see #getMustUnderstand()
	 * @generated
	 */
	void setMustUnderstand(EObject value);

	/**
	 * Returns the value of the '<em><b>On Completion</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>On Completion</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>On Completion</em>' containment reference.
	 * @see #setOnCompletion(Completion)
	 * @see org.hl7.knowledgeartifact.r2.R2Package#getContainedArtifact_OnCompletion()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='onCompletion' namespace='##targetNamespace'"
	 * @generated
	 */
	Completion getOnCompletion();

	/**
	 * Sets the value of the '{@link org.hl7.knowledgeartifact.r2.ContainedArtifact#getOnCompletion <em>On Completion</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>On Completion</em>' containment reference.
	 * @see #getOnCompletion()
	 * @generated
	 */
	void setOnCompletion(Completion value);

} // ContainedArtifact
