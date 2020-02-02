/**
 */
package org.hl7.knowledgeartifact.r2.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.hl7.knowledgeartifact.r2.ArtifactTypeType;
import org.hl7.knowledgeartifact.r2.BindingNameType;
import org.hl7.knowledgeartifact.r2.Completion;
import org.hl7.knowledgeartifact.r2.ContainedArtifact;
import org.hl7.knowledgeartifact.r2.Context;
import org.hl7.knowledgeartifact.r2.EventBinding;
import org.hl7.knowledgeartifact.r2.KnowledgeDocument;
import org.hl7.knowledgeartifact.r2.MetadataBinding;
import org.hl7.knowledgeartifact.r2.NameType;
import org.hl7.knowledgeartifact.r2.R2Package;
import org.hl7.knowledgeartifact.r2.Reference;
import org.hl7.knowledgeartifact.r2.WrappedContent;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Contained Artifact</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.knowledgeartifact.r2.impl.ContainedArtifactImpl#getArtifactType <em>Artifact Type</em>}</li>
 *   <li>{@link org.hl7.knowledgeartifact.r2.impl.ContainedArtifactImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.hl7.knowledgeartifact.r2.impl.ContainedArtifactImpl#getBindingName <em>Binding Name</em>}</li>
 *   <li>{@link org.hl7.knowledgeartifact.r2.impl.ContainedArtifactImpl#getInclusionCriteria <em>Inclusion Criteria</em>}</li>
 *   <li>{@link org.hl7.knowledgeartifact.r2.impl.ContainedArtifactImpl#getContext <em>Context</em>}</li>
 *   <li>{@link org.hl7.knowledgeartifact.r2.impl.ContainedArtifactImpl#getEventBinding <em>Event Binding</em>}</li>
 *   <li>{@link org.hl7.knowledgeartifact.r2.impl.ContainedArtifactImpl#getMetadataBinding <em>Metadata Binding</em>}</li>
 *   <li>{@link org.hl7.knowledgeartifact.r2.impl.ContainedArtifactImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.hl7.knowledgeartifact.r2.impl.ContainedArtifactImpl#getWrappedContent <em>Wrapped Content</em>}</li>
 *   <li>{@link org.hl7.knowledgeartifact.r2.impl.ContainedArtifactImpl#getReference <em>Reference</em>}</li>
 *   <li>{@link org.hl7.knowledgeartifact.r2.impl.ContainedArtifactImpl#getKnowledgeDocument <em>Knowledge Document</em>}</li>
 *   <li>{@link org.hl7.knowledgeartifact.r2.impl.ContainedArtifactImpl#getMustUnderstand <em>Must Understand</em>}</li>
 *   <li>{@link org.hl7.knowledgeartifact.r2.impl.ContainedArtifactImpl#getOnCompletion <em>On Completion</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContainedArtifactImpl extends MinimalEObjectImpl.Container implements ContainedArtifact {
	/**
	 * The cached value of the '{@link #getArtifactType() <em>Artifact Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArtifactType()
	 * @generated
	 * @ordered
	 */
	protected ArtifactTypeType artifactType;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected NameType name;

	/**
	 * The cached value of the '{@link #getBindingName() <em>Binding Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBindingName()
	 * @generated
	 * @ordered
	 */
	protected BindingNameType bindingName;

	/**
	 * The cached value of the '{@link #getInclusionCriteria() <em>Inclusion Criteria</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInclusionCriteria()
	 * @generated
	 * @ordered
	 */
	protected EObject inclusionCriteria;

	/**
	 * The cached value of the '{@link #getContext() <em>Context</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContext()
	 * @generated
	 * @ordered
	 */
	protected Context context;

	/**
	 * The cached value of the '{@link #getEventBinding() <em>Event Binding</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventBinding()
	 * @generated
	 * @ordered
	 */
	protected EventBinding eventBinding;

	/**
	 * The cached value of the '{@link #getMetadataBinding() <em>Metadata Binding</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetadataBinding()
	 * @generated
	 * @ordered
	 */
	protected MetadataBinding metadataBinding;

	/**
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap group;

	/**
	 * The cached value of the '{@link #getMustUnderstand() <em>Must Understand</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMustUnderstand()
	 * @generated
	 * @ordered
	 */
	protected EObject mustUnderstand;

	/**
	 * The cached value of the '{@link #getOnCompletion() <em>On Completion</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnCompletion()
	 * @generated
	 * @ordered
	 */
	protected Completion onCompletion;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContainedArtifactImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return R2Package.eINSTANCE.getContainedArtifact();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArtifactTypeType getArtifactType() {
		return artifactType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetArtifactType(ArtifactTypeType newArtifactType, NotificationChain msgs) {
		ArtifactTypeType oldArtifactType = artifactType;
		artifactType = newArtifactType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, R2Package.CONTAINED_ARTIFACT__ARTIFACT_TYPE, oldArtifactType, newArtifactType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArtifactType(ArtifactTypeType newArtifactType) {
		if (newArtifactType != artifactType) {
			NotificationChain msgs = null;
			if (artifactType != null)
				msgs = ((InternalEObject)artifactType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - R2Package.CONTAINED_ARTIFACT__ARTIFACT_TYPE, null, msgs);
			if (newArtifactType != null)
				msgs = ((InternalEObject)newArtifactType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - R2Package.CONTAINED_ARTIFACT__ARTIFACT_TYPE, null, msgs);
			msgs = basicSetArtifactType(newArtifactType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, R2Package.CONTAINED_ARTIFACT__ARTIFACT_TYPE, newArtifactType, newArtifactType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NameType getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetName(NameType newName, NotificationChain msgs) {
		NameType oldName = name;
		name = newName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, R2Package.CONTAINED_ARTIFACT__NAME, oldName, newName);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(NameType newName) {
		if (newName != name) {
			NotificationChain msgs = null;
			if (name != null)
				msgs = ((InternalEObject)name).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - R2Package.CONTAINED_ARTIFACT__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject)newName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - R2Package.CONTAINED_ARTIFACT__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, R2Package.CONTAINED_ARTIFACT__NAME, newName, newName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BindingNameType getBindingName() {
		return bindingName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBindingName(BindingNameType newBindingName, NotificationChain msgs) {
		BindingNameType oldBindingName = bindingName;
		bindingName = newBindingName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, R2Package.CONTAINED_ARTIFACT__BINDING_NAME, oldBindingName, newBindingName);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBindingName(BindingNameType newBindingName) {
		if (newBindingName != bindingName) {
			NotificationChain msgs = null;
			if (bindingName != null)
				msgs = ((InternalEObject)bindingName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - R2Package.CONTAINED_ARTIFACT__BINDING_NAME, null, msgs);
			if (newBindingName != null)
				msgs = ((InternalEObject)newBindingName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - R2Package.CONTAINED_ARTIFACT__BINDING_NAME, null, msgs);
			msgs = basicSetBindingName(newBindingName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, R2Package.CONTAINED_ARTIFACT__BINDING_NAME, newBindingName, newBindingName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getInclusionCriteria() {
		return inclusionCriteria;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInclusionCriteria(EObject newInclusionCriteria, NotificationChain msgs) {
		EObject oldInclusionCriteria = inclusionCriteria;
		inclusionCriteria = newInclusionCriteria;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, R2Package.CONTAINED_ARTIFACT__INCLUSION_CRITERIA, oldInclusionCriteria, newInclusionCriteria);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInclusionCriteria(EObject newInclusionCriteria) {
		if (newInclusionCriteria != inclusionCriteria) {
			NotificationChain msgs = null;
			if (inclusionCriteria != null)
				msgs = ((InternalEObject)inclusionCriteria).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - R2Package.CONTAINED_ARTIFACT__INCLUSION_CRITERIA, null, msgs);
			if (newInclusionCriteria != null)
				msgs = ((InternalEObject)newInclusionCriteria).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - R2Package.CONTAINED_ARTIFACT__INCLUSION_CRITERIA, null, msgs);
			msgs = basicSetInclusionCriteria(newInclusionCriteria, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, R2Package.CONTAINED_ARTIFACT__INCLUSION_CRITERIA, newInclusionCriteria, newInclusionCriteria));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Context getContext() {
		return context;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContext(Context newContext, NotificationChain msgs) {
		Context oldContext = context;
		context = newContext;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, R2Package.CONTAINED_ARTIFACT__CONTEXT, oldContext, newContext);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContext(Context newContext) {
		if (newContext != context) {
			NotificationChain msgs = null;
			if (context != null)
				msgs = ((InternalEObject)context).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - R2Package.CONTAINED_ARTIFACT__CONTEXT, null, msgs);
			if (newContext != null)
				msgs = ((InternalEObject)newContext).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - R2Package.CONTAINED_ARTIFACT__CONTEXT, null, msgs);
			msgs = basicSetContext(newContext, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, R2Package.CONTAINED_ARTIFACT__CONTEXT, newContext, newContext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventBinding getEventBinding() {
		return eventBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEventBinding(EventBinding newEventBinding, NotificationChain msgs) {
		EventBinding oldEventBinding = eventBinding;
		eventBinding = newEventBinding;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, R2Package.CONTAINED_ARTIFACT__EVENT_BINDING, oldEventBinding, newEventBinding);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEventBinding(EventBinding newEventBinding) {
		if (newEventBinding != eventBinding) {
			NotificationChain msgs = null;
			if (eventBinding != null)
				msgs = ((InternalEObject)eventBinding).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - R2Package.CONTAINED_ARTIFACT__EVENT_BINDING, null, msgs);
			if (newEventBinding != null)
				msgs = ((InternalEObject)newEventBinding).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - R2Package.CONTAINED_ARTIFACT__EVENT_BINDING, null, msgs);
			msgs = basicSetEventBinding(newEventBinding, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, R2Package.CONTAINED_ARTIFACT__EVENT_BINDING, newEventBinding, newEventBinding));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetadataBinding getMetadataBinding() {
		return metadataBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMetadataBinding(MetadataBinding newMetadataBinding, NotificationChain msgs) {
		MetadataBinding oldMetadataBinding = metadataBinding;
		metadataBinding = newMetadataBinding;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, R2Package.CONTAINED_ARTIFACT__METADATA_BINDING, oldMetadataBinding, newMetadataBinding);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMetadataBinding(MetadataBinding newMetadataBinding) {
		if (newMetadataBinding != metadataBinding) {
			NotificationChain msgs = null;
			if (metadataBinding != null)
				msgs = ((InternalEObject)metadataBinding).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - R2Package.CONTAINED_ARTIFACT__METADATA_BINDING, null, msgs);
			if (newMetadataBinding != null)
				msgs = ((InternalEObject)newMetadataBinding).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - R2Package.CONTAINED_ARTIFACT__METADATA_BINDING, null, msgs);
			msgs = basicSetMetadataBinding(newMetadataBinding, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, R2Package.CONTAINED_ARTIFACT__METADATA_BINDING, newMetadataBinding, newMetadataBinding));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, R2Package.CONTAINED_ARTIFACT__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WrappedContent> getWrappedContent() {
		return getGroup().list(R2Package.eINSTANCE.getContainedArtifact_WrappedContent());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getReference() {
		return getGroup().list(R2Package.eINSTANCE.getContainedArtifact_Reference());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<KnowledgeDocument> getKnowledgeDocument() {
		return getGroup().list(R2Package.eINSTANCE.getContainedArtifact_KnowledgeDocument());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getMustUnderstand() {
		return mustUnderstand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMustUnderstand(EObject newMustUnderstand, NotificationChain msgs) {
		EObject oldMustUnderstand = mustUnderstand;
		mustUnderstand = newMustUnderstand;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, R2Package.CONTAINED_ARTIFACT__MUST_UNDERSTAND, oldMustUnderstand, newMustUnderstand);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMustUnderstand(EObject newMustUnderstand) {
		if (newMustUnderstand != mustUnderstand) {
			NotificationChain msgs = null;
			if (mustUnderstand != null)
				msgs = ((InternalEObject)mustUnderstand).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - R2Package.CONTAINED_ARTIFACT__MUST_UNDERSTAND, null, msgs);
			if (newMustUnderstand != null)
				msgs = ((InternalEObject)newMustUnderstand).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - R2Package.CONTAINED_ARTIFACT__MUST_UNDERSTAND, null, msgs);
			msgs = basicSetMustUnderstand(newMustUnderstand, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, R2Package.CONTAINED_ARTIFACT__MUST_UNDERSTAND, newMustUnderstand, newMustUnderstand));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Completion getOnCompletion() {
		return onCompletion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOnCompletion(Completion newOnCompletion, NotificationChain msgs) {
		Completion oldOnCompletion = onCompletion;
		onCompletion = newOnCompletion;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, R2Package.CONTAINED_ARTIFACT__ON_COMPLETION, oldOnCompletion, newOnCompletion);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOnCompletion(Completion newOnCompletion) {
		if (newOnCompletion != onCompletion) {
			NotificationChain msgs = null;
			if (onCompletion != null)
				msgs = ((InternalEObject)onCompletion).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - R2Package.CONTAINED_ARTIFACT__ON_COMPLETION, null, msgs);
			if (newOnCompletion != null)
				msgs = ((InternalEObject)newOnCompletion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - R2Package.CONTAINED_ARTIFACT__ON_COMPLETION, null, msgs);
			msgs = basicSetOnCompletion(newOnCompletion, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, R2Package.CONTAINED_ARTIFACT__ON_COMPLETION, newOnCompletion, newOnCompletion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case R2Package.CONTAINED_ARTIFACT__ARTIFACT_TYPE:
				return basicSetArtifactType(null, msgs);
			case R2Package.CONTAINED_ARTIFACT__NAME:
				return basicSetName(null, msgs);
			case R2Package.CONTAINED_ARTIFACT__BINDING_NAME:
				return basicSetBindingName(null, msgs);
			case R2Package.CONTAINED_ARTIFACT__INCLUSION_CRITERIA:
				return basicSetInclusionCriteria(null, msgs);
			case R2Package.CONTAINED_ARTIFACT__CONTEXT:
				return basicSetContext(null, msgs);
			case R2Package.CONTAINED_ARTIFACT__EVENT_BINDING:
				return basicSetEventBinding(null, msgs);
			case R2Package.CONTAINED_ARTIFACT__METADATA_BINDING:
				return basicSetMetadataBinding(null, msgs);
			case R2Package.CONTAINED_ARTIFACT__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case R2Package.CONTAINED_ARTIFACT__WRAPPED_CONTENT:
				return ((InternalEList<?>)getWrappedContent()).basicRemove(otherEnd, msgs);
			case R2Package.CONTAINED_ARTIFACT__REFERENCE:
				return ((InternalEList<?>)getReference()).basicRemove(otherEnd, msgs);
			case R2Package.CONTAINED_ARTIFACT__KNOWLEDGE_DOCUMENT:
				return ((InternalEList<?>)getKnowledgeDocument()).basicRemove(otherEnd, msgs);
			case R2Package.CONTAINED_ARTIFACT__MUST_UNDERSTAND:
				return basicSetMustUnderstand(null, msgs);
			case R2Package.CONTAINED_ARTIFACT__ON_COMPLETION:
				return basicSetOnCompletion(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case R2Package.CONTAINED_ARTIFACT__ARTIFACT_TYPE:
				return getArtifactType();
			case R2Package.CONTAINED_ARTIFACT__NAME:
				return getName();
			case R2Package.CONTAINED_ARTIFACT__BINDING_NAME:
				return getBindingName();
			case R2Package.CONTAINED_ARTIFACT__INCLUSION_CRITERIA:
				return getInclusionCriteria();
			case R2Package.CONTAINED_ARTIFACT__CONTEXT:
				return getContext();
			case R2Package.CONTAINED_ARTIFACT__EVENT_BINDING:
				return getEventBinding();
			case R2Package.CONTAINED_ARTIFACT__METADATA_BINDING:
				return getMetadataBinding();
			case R2Package.CONTAINED_ARTIFACT__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case R2Package.CONTAINED_ARTIFACT__WRAPPED_CONTENT:
				return getWrappedContent();
			case R2Package.CONTAINED_ARTIFACT__REFERENCE:
				return getReference();
			case R2Package.CONTAINED_ARTIFACT__KNOWLEDGE_DOCUMENT:
				return getKnowledgeDocument();
			case R2Package.CONTAINED_ARTIFACT__MUST_UNDERSTAND:
				return getMustUnderstand();
			case R2Package.CONTAINED_ARTIFACT__ON_COMPLETION:
				return getOnCompletion();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case R2Package.CONTAINED_ARTIFACT__ARTIFACT_TYPE:
				setArtifactType((ArtifactTypeType)newValue);
				return;
			case R2Package.CONTAINED_ARTIFACT__NAME:
				setName((NameType)newValue);
				return;
			case R2Package.CONTAINED_ARTIFACT__BINDING_NAME:
				setBindingName((BindingNameType)newValue);
				return;
			case R2Package.CONTAINED_ARTIFACT__INCLUSION_CRITERIA:
				setInclusionCriteria((EObject)newValue);
				return;
			case R2Package.CONTAINED_ARTIFACT__CONTEXT:
				setContext((Context)newValue);
				return;
			case R2Package.CONTAINED_ARTIFACT__EVENT_BINDING:
				setEventBinding((EventBinding)newValue);
				return;
			case R2Package.CONTAINED_ARTIFACT__METADATA_BINDING:
				setMetadataBinding((MetadataBinding)newValue);
				return;
			case R2Package.CONTAINED_ARTIFACT__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case R2Package.CONTAINED_ARTIFACT__WRAPPED_CONTENT:
				getWrappedContent().clear();
				getWrappedContent().addAll((Collection<? extends WrappedContent>)newValue);
				return;
			case R2Package.CONTAINED_ARTIFACT__REFERENCE:
				getReference().clear();
				getReference().addAll((Collection<? extends Reference>)newValue);
				return;
			case R2Package.CONTAINED_ARTIFACT__KNOWLEDGE_DOCUMENT:
				getKnowledgeDocument().clear();
				getKnowledgeDocument().addAll((Collection<? extends KnowledgeDocument>)newValue);
				return;
			case R2Package.CONTAINED_ARTIFACT__MUST_UNDERSTAND:
				setMustUnderstand((EObject)newValue);
				return;
			case R2Package.CONTAINED_ARTIFACT__ON_COMPLETION:
				setOnCompletion((Completion)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case R2Package.CONTAINED_ARTIFACT__ARTIFACT_TYPE:
				setArtifactType((ArtifactTypeType)null);
				return;
			case R2Package.CONTAINED_ARTIFACT__NAME:
				setName((NameType)null);
				return;
			case R2Package.CONTAINED_ARTIFACT__BINDING_NAME:
				setBindingName((BindingNameType)null);
				return;
			case R2Package.CONTAINED_ARTIFACT__INCLUSION_CRITERIA:
				setInclusionCriteria((EObject)null);
				return;
			case R2Package.CONTAINED_ARTIFACT__CONTEXT:
				setContext((Context)null);
				return;
			case R2Package.CONTAINED_ARTIFACT__EVENT_BINDING:
				setEventBinding((EventBinding)null);
				return;
			case R2Package.CONTAINED_ARTIFACT__METADATA_BINDING:
				setMetadataBinding((MetadataBinding)null);
				return;
			case R2Package.CONTAINED_ARTIFACT__GROUP:
				getGroup().clear();
				return;
			case R2Package.CONTAINED_ARTIFACT__WRAPPED_CONTENT:
				getWrappedContent().clear();
				return;
			case R2Package.CONTAINED_ARTIFACT__REFERENCE:
				getReference().clear();
				return;
			case R2Package.CONTAINED_ARTIFACT__KNOWLEDGE_DOCUMENT:
				getKnowledgeDocument().clear();
				return;
			case R2Package.CONTAINED_ARTIFACT__MUST_UNDERSTAND:
				setMustUnderstand((EObject)null);
				return;
			case R2Package.CONTAINED_ARTIFACT__ON_COMPLETION:
				setOnCompletion((Completion)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case R2Package.CONTAINED_ARTIFACT__ARTIFACT_TYPE:
				return artifactType != null;
			case R2Package.CONTAINED_ARTIFACT__NAME:
				return name != null;
			case R2Package.CONTAINED_ARTIFACT__BINDING_NAME:
				return bindingName != null;
			case R2Package.CONTAINED_ARTIFACT__INCLUSION_CRITERIA:
				return inclusionCriteria != null;
			case R2Package.CONTAINED_ARTIFACT__CONTEXT:
				return context != null;
			case R2Package.CONTAINED_ARTIFACT__EVENT_BINDING:
				return eventBinding != null;
			case R2Package.CONTAINED_ARTIFACT__METADATA_BINDING:
				return metadataBinding != null;
			case R2Package.CONTAINED_ARTIFACT__GROUP:
				return group != null && !group.isEmpty();
			case R2Package.CONTAINED_ARTIFACT__WRAPPED_CONTENT:
				return !getWrappedContent().isEmpty();
			case R2Package.CONTAINED_ARTIFACT__REFERENCE:
				return !getReference().isEmpty();
			case R2Package.CONTAINED_ARTIFACT__KNOWLEDGE_DOCUMENT:
				return !getKnowledgeDocument().isEmpty();
			case R2Package.CONTAINED_ARTIFACT__MUST_UNDERSTAND:
				return mustUnderstand != null;
			case R2Package.CONTAINED_ARTIFACT__ON_COMPLETION:
				return onCompletion != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (group: ");
		result.append(group);
		result.append(')');
		return result.toString();
	}

} //ContainedArtifactImpl
