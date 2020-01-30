/**
 */
package fhiRCore.profiles.impl;

import fhiRCore.dataTypes.Attachment;
import fhiRCore.dataTypes.CodeableConcept;

import fhiRCore.dataTypes.impl.BackboneElementImpl;

import fhiRCore.profiles.ProfilesPackage;
import fhiRCore.profiles.SubstanceDefinitionStructureRepresentation;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Substance Definition Structure Representation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.profiles.impl.SubstanceDefinitionStructureRepresentationImpl#getType <em>Type</em>}</li>
 *   <li>{@link fhiRCore.profiles.impl.SubstanceDefinitionStructureRepresentationImpl#getRepresentation <em>Representation</em>}</li>
 *   <li>{@link fhiRCore.profiles.impl.SubstanceDefinitionStructureRepresentationImpl#getAttachment <em>Attachment</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubstanceDefinitionStructureRepresentationImpl extends BackboneElementImpl implements SubstanceDefinitionStructureRepresentation {
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
	 * The cached value of the '{@link #getRepresentation() <em>Representation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepresentation()
	 * @generated
	 * @ordered
	 */
	protected fhiRCore.dataTypes.String representation;

	/**
	 * The cached value of the '{@link #getAttachment() <em>Attachment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttachment()
	 * @generated
	 * @ordered
	 */
	protected Attachment attachment;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubstanceDefinitionStructureRepresentationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProfilesPackage.Literals.SUBSTANCE_DEFINITION_STRUCTURE_REPRESENTATION;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProfilesPackage.SUBSTANCE_DEFINITION_STRUCTURE_REPRESENTATION__TYPE, oldType, newType);
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
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProfilesPackage.SUBSTANCE_DEFINITION_STRUCTURE_REPRESENTATION__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProfilesPackage.SUBSTANCE_DEFINITION_STRUCTURE_REPRESENTATION__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProfilesPackage.SUBSTANCE_DEFINITION_STRUCTURE_REPRESENTATION__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public fhiRCore.dataTypes.String getRepresentation() {
		return representation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRepresentation(fhiRCore.dataTypes.String newRepresentation, NotificationChain msgs) {
		fhiRCore.dataTypes.String oldRepresentation = representation;
		representation = newRepresentation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProfilesPackage.SUBSTANCE_DEFINITION_STRUCTURE_REPRESENTATION__REPRESENTATION, oldRepresentation, newRepresentation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRepresentation(fhiRCore.dataTypes.String newRepresentation) {
		if (newRepresentation != representation) {
			NotificationChain msgs = null;
			if (representation != null)
				msgs = ((InternalEObject)representation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProfilesPackage.SUBSTANCE_DEFINITION_STRUCTURE_REPRESENTATION__REPRESENTATION, null, msgs);
			if (newRepresentation != null)
				msgs = ((InternalEObject)newRepresentation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProfilesPackage.SUBSTANCE_DEFINITION_STRUCTURE_REPRESENTATION__REPRESENTATION, null, msgs);
			msgs = basicSetRepresentation(newRepresentation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProfilesPackage.SUBSTANCE_DEFINITION_STRUCTURE_REPRESENTATION__REPRESENTATION, newRepresentation, newRepresentation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attachment getAttachment() {
		return attachment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAttachment(Attachment newAttachment, NotificationChain msgs) {
		Attachment oldAttachment = attachment;
		attachment = newAttachment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProfilesPackage.SUBSTANCE_DEFINITION_STRUCTURE_REPRESENTATION__ATTACHMENT, oldAttachment, newAttachment);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttachment(Attachment newAttachment) {
		if (newAttachment != attachment) {
			NotificationChain msgs = null;
			if (attachment != null)
				msgs = ((InternalEObject)attachment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProfilesPackage.SUBSTANCE_DEFINITION_STRUCTURE_REPRESENTATION__ATTACHMENT, null, msgs);
			if (newAttachment != null)
				msgs = ((InternalEObject)newAttachment).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProfilesPackage.SUBSTANCE_DEFINITION_STRUCTURE_REPRESENTATION__ATTACHMENT, null, msgs);
			msgs = basicSetAttachment(newAttachment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProfilesPackage.SUBSTANCE_DEFINITION_STRUCTURE_REPRESENTATION__ATTACHMENT, newAttachment, newAttachment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProfilesPackage.SUBSTANCE_DEFINITION_STRUCTURE_REPRESENTATION__TYPE:
				return basicSetType(null, msgs);
			case ProfilesPackage.SUBSTANCE_DEFINITION_STRUCTURE_REPRESENTATION__REPRESENTATION:
				return basicSetRepresentation(null, msgs);
			case ProfilesPackage.SUBSTANCE_DEFINITION_STRUCTURE_REPRESENTATION__ATTACHMENT:
				return basicSetAttachment(null, msgs);
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
			case ProfilesPackage.SUBSTANCE_DEFINITION_STRUCTURE_REPRESENTATION__TYPE:
				return getType();
			case ProfilesPackage.SUBSTANCE_DEFINITION_STRUCTURE_REPRESENTATION__REPRESENTATION:
				return getRepresentation();
			case ProfilesPackage.SUBSTANCE_DEFINITION_STRUCTURE_REPRESENTATION__ATTACHMENT:
				return getAttachment();
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
			case ProfilesPackage.SUBSTANCE_DEFINITION_STRUCTURE_REPRESENTATION__TYPE:
				setType((CodeableConcept)newValue);
				return;
			case ProfilesPackage.SUBSTANCE_DEFINITION_STRUCTURE_REPRESENTATION__REPRESENTATION:
				setRepresentation((fhiRCore.dataTypes.String)newValue);
				return;
			case ProfilesPackage.SUBSTANCE_DEFINITION_STRUCTURE_REPRESENTATION__ATTACHMENT:
				setAttachment((Attachment)newValue);
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
			case ProfilesPackage.SUBSTANCE_DEFINITION_STRUCTURE_REPRESENTATION__TYPE:
				setType((CodeableConcept)null);
				return;
			case ProfilesPackage.SUBSTANCE_DEFINITION_STRUCTURE_REPRESENTATION__REPRESENTATION:
				setRepresentation((fhiRCore.dataTypes.String)null);
				return;
			case ProfilesPackage.SUBSTANCE_DEFINITION_STRUCTURE_REPRESENTATION__ATTACHMENT:
				setAttachment((Attachment)null);
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
			case ProfilesPackage.SUBSTANCE_DEFINITION_STRUCTURE_REPRESENTATION__TYPE:
				return type != null;
			case ProfilesPackage.SUBSTANCE_DEFINITION_STRUCTURE_REPRESENTATION__REPRESENTATION:
				return representation != null;
			case ProfilesPackage.SUBSTANCE_DEFINITION_STRUCTURE_REPRESENTATION__ATTACHMENT:
				return attachment != null;
		}
		return super.eIsSet(featureID);
	}

} //SubstanceDefinitionStructureRepresentationImpl
