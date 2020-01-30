/**
 */
package fhiRCore.resources.impl;

import fhiRCore.dataTypes.CodeableConcept;

import fhiRCore.dataTypes.impl.BackboneElementImpl;

import fhiRCore.resources.MedicationKnowledgeRegulatorySubstitution;
import fhiRCore.resources.ResourcesPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Medication Knowledge Regulatory Substitution</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.impl.MedicationKnowledgeRegulatorySubstitutionImpl#getType <em>Type</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.MedicationKnowledgeRegulatorySubstitutionImpl#getAllowed <em>Allowed</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MedicationKnowledgeRegulatorySubstitutionImpl extends BackboneElementImpl implements MedicationKnowledgeRegulatorySubstitution {
	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept type;

	/**
	 * The cached value of the '{@link #getAllowed() <em>Allowed</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowed()
	 * @generated
	 * @ordered
	 */
	protected fhiRCore.dataTypes.Boolean allowed;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MedicationKnowledgeRegulatorySubstitutionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getMedicationKnowledgeRegulatorySubstitution();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetType(CodeableConcept newType, NotificationChain msgs) {
		CodeableConcept oldType = type;
		type = newType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICATION_KNOWLEDGE_REGULATORY_SUBSTITUTION__TYPE, oldType, newType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(CodeableConcept newType) {
		if (newType != type) {
			NotificationChain msgs = null;
			if (type != null)
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICATION_KNOWLEDGE_REGULATORY_SUBSTITUTION__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICATION_KNOWLEDGE_REGULATORY_SUBSTITUTION__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICATION_KNOWLEDGE_REGULATORY_SUBSTITUTION__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public fhiRCore.dataTypes.Boolean getAllowed() {
		return allowed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAllowed(fhiRCore.dataTypes.Boolean newAllowed, NotificationChain msgs) {
		fhiRCore.dataTypes.Boolean oldAllowed = allowed;
		allowed = newAllowed;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICATION_KNOWLEDGE_REGULATORY_SUBSTITUTION__ALLOWED, oldAllowed, newAllowed);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAllowed(fhiRCore.dataTypes.Boolean newAllowed) {
		if (newAllowed != allowed) {
			NotificationChain msgs = null;
			if (allowed != null)
				msgs = ((InternalEObject)allowed).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICATION_KNOWLEDGE_REGULATORY_SUBSTITUTION__ALLOWED, null, msgs);
			if (newAllowed != null)
				msgs = ((InternalEObject)newAllowed).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICATION_KNOWLEDGE_REGULATORY_SUBSTITUTION__ALLOWED, null, msgs);
			msgs = basicSetAllowed(newAllowed, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICATION_KNOWLEDGE_REGULATORY_SUBSTITUTION__ALLOWED, newAllowed, newAllowed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.MEDICATION_KNOWLEDGE_REGULATORY_SUBSTITUTION__TYPE:
				return basicSetType(null, msgs);
			case ResourcesPackage.MEDICATION_KNOWLEDGE_REGULATORY_SUBSTITUTION__ALLOWED:
				return basicSetAllowed(null, msgs);
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
			case ResourcesPackage.MEDICATION_KNOWLEDGE_REGULATORY_SUBSTITUTION__TYPE:
				return getType();
			case ResourcesPackage.MEDICATION_KNOWLEDGE_REGULATORY_SUBSTITUTION__ALLOWED:
				return getAllowed();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ResourcesPackage.MEDICATION_KNOWLEDGE_REGULATORY_SUBSTITUTION__TYPE:
				setType((CodeableConcept)newValue);
				return;
			case ResourcesPackage.MEDICATION_KNOWLEDGE_REGULATORY_SUBSTITUTION__ALLOWED:
				setAllowed((fhiRCore.dataTypes.Boolean)newValue);
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
			case ResourcesPackage.MEDICATION_KNOWLEDGE_REGULATORY_SUBSTITUTION__TYPE:
				setType((CodeableConcept)null);
				return;
			case ResourcesPackage.MEDICATION_KNOWLEDGE_REGULATORY_SUBSTITUTION__ALLOWED:
				setAllowed((fhiRCore.dataTypes.Boolean)null);
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
			case ResourcesPackage.MEDICATION_KNOWLEDGE_REGULATORY_SUBSTITUTION__TYPE:
				return type != null;
			case ResourcesPackage.MEDICATION_KNOWLEDGE_REGULATORY_SUBSTITUTION__ALLOWED:
				return allowed != null;
		}
		return super.eIsSet(featureID);
	}

} //MedicationKnowledgeRegulatorySubstitutionImpl
