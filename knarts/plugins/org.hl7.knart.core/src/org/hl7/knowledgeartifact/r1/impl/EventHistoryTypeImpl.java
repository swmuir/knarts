/**
 */
package org.hl7.knowledgeartifact.r1.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.hl7.knowledgeartifact.r1.ArtifactLifeCycleEvent;
import org.hl7.knowledgeartifact.r1.EventHistoryType;
import org.hl7.knowledgeartifact.r1.R1Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Event History Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.knowledgeartifact.r1.impl.EventHistoryTypeImpl#getArtifactLifeCycleEvent <em>Artifact Life Cycle Event</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EventHistoryTypeImpl extends MinimalEObjectImpl.Container implements EventHistoryType {
	/**
	 * The cached value of the '{@link #getArtifactLifeCycleEvent() <em>Artifact Life Cycle Event</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArtifactLifeCycleEvent()
	 * @generated
	 * @ordered
	 */
	protected EList<ArtifactLifeCycleEvent> artifactLifeCycleEvent;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EventHistoryTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return R1Package.Literals.EVENT_HISTORY_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ArtifactLifeCycleEvent> getArtifactLifeCycleEvent() {
		if (artifactLifeCycleEvent == null) {
			artifactLifeCycleEvent = new EObjectContainmentEList<ArtifactLifeCycleEvent>(ArtifactLifeCycleEvent.class, this, R1Package.EVENT_HISTORY_TYPE__ARTIFACT_LIFE_CYCLE_EVENT);
		}
		return artifactLifeCycleEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case R1Package.EVENT_HISTORY_TYPE__ARTIFACT_LIFE_CYCLE_EVENT:
				return ((InternalEList<?>)getArtifactLifeCycleEvent()).basicRemove(otherEnd, msgs);
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
			case R1Package.EVENT_HISTORY_TYPE__ARTIFACT_LIFE_CYCLE_EVENT:
				return getArtifactLifeCycleEvent();
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
			case R1Package.EVENT_HISTORY_TYPE__ARTIFACT_LIFE_CYCLE_EVENT:
				getArtifactLifeCycleEvent().clear();
				getArtifactLifeCycleEvent().addAll((Collection<? extends ArtifactLifeCycleEvent>)newValue);
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
			case R1Package.EVENT_HISTORY_TYPE__ARTIFACT_LIFE_CYCLE_EVENT:
				getArtifactLifeCycleEvent().clear();
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
			case R1Package.EVENT_HISTORY_TYPE__ARTIFACT_LIFE_CYCLE_EVENT:
				return artifactLifeCycleEvent != null && !artifactLifeCycleEvent.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //EventHistoryTypeImpl
