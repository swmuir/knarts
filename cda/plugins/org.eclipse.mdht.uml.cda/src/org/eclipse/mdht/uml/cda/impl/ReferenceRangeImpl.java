/*******************************************************************************
 * Copyright (c) 2009, 2011 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.eclipse.mdht.uml.cda.impl;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.mdht.uml.cda.CDAPackage;
import org.eclipse.mdht.uml.cda.InfrastructureRootTypeId;
import org.eclipse.mdht.uml.cda.ObservationRange;
import org.eclipse.mdht.uml.cda.ReferenceRange;
import org.eclipse.mdht.uml.cda.operations.ReferenceRangeOperations;
import org.eclipse.mdht.uml.hl7.datatypes.CS;
import org.eclipse.mdht.uml.hl7.datatypes.II;
import org.eclipse.mdht.uml.hl7.rim.impl.ActRelationshipImpl;
import org.eclipse.mdht.uml.hl7.vocab.ActRelationshipType;
import org.eclipse.mdht.uml.hl7.vocab.NullFlavor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reference Range</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.cda.impl.ReferenceRangeImpl#getRealmCodes <em>Realm Code</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.cda.impl.ReferenceRangeImpl#getTypeId <em>Type Id</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.cda.impl.ReferenceRangeImpl#getTemplateIds <em>Template Id</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.cda.impl.ReferenceRangeImpl#getObservationRange <em>Observation Range</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.cda.impl.ReferenceRangeImpl#getNullFlavor <em>Null Flavor</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.cda.impl.ReferenceRangeImpl#getTypeCode <em>Type Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReferenceRangeImpl extends ActRelationshipImpl implements ReferenceRange {
	/**
	 * The cached value of the '{@link #getRealmCodes() <em>Realm Code</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRealmCodes()
	 * @generated
	 * @ordered
	 */
	protected EList<CS> realmCodes;

	/**
	 * The cached value of the '{@link #getTypeId() <em>Type Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeId()
	 * @generated
	 * @ordered
	 */
	protected InfrastructureRootTypeId typeId;

	/**
	 * The cached value of the '{@link #getTemplateIds() <em>Template Id</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemplateIds()
	 * @generated
	 * @ordered
	 */
	protected EList<II> templateIds;

	/**
	 * The cached value of the '{@link #getObservationRange() <em>Observation Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObservationRange()
	 * @generated
	 * @ordered
	 */
	protected ObservationRange observationRange;

	/**
	 * The default value of the '{@link #getNullFlavor() <em>Null Flavor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNullFlavor()
	 * @generated
	 * @ordered
	 */
	protected static final NullFlavor NULL_FLAVOR_EDEFAULT = NullFlavor.ASKU;

	/**
	 * The cached value of the '{@link #getNullFlavor() <em>Null Flavor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNullFlavor()
	 * @generated
	 * @ordered
	 */
	protected NullFlavor nullFlavor = NULL_FLAVOR_EDEFAULT;

	/**
	 * This is true if the Null Flavor attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nullFlavorESet;

	/**
	 * The default value of the '{@link #getTypeCode() <em>Type Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeCode()
	 * @generated
	 * @ordered
	 */
	protected static final ActRelationshipType TYPE_CODE_EDEFAULT = ActRelationshipType.REFV;

	/**
	 * The cached value of the '{@link #getTypeCode() <em>Type Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeCode()
	 * @generated
	 * @ordered
	 */
	protected ActRelationshipType typeCode = TYPE_CODE_EDEFAULT;

	/**
	 * This is true if the Type Code attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean typeCodeESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReferenceRangeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CDAPackage.Literals.REFERENCE_RANGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CS> getRealmCodes() {
		if (realmCodes == null) {
			realmCodes = new EObjectContainmentEList<CS>(CS.class, this, CDAPackage.REFERENCE_RANGE__REALM_CODE);
		}
		return realmCodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InfrastructureRootTypeId getTypeId() {
		return typeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTypeId(InfrastructureRootTypeId newTypeId, NotificationChain msgs) {
		InfrastructureRootTypeId oldTypeId = typeId;
		typeId = newTypeId;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, CDAPackage.REFERENCE_RANGE__TYPE_ID, oldTypeId, newTypeId);
			if (msgs == null) {
				msgs = notification;
			} else {
				msgs.add(notification);
			}
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeId(InfrastructureRootTypeId newTypeId) {
		if (newTypeId != typeId) {
			NotificationChain msgs = null;
			if (typeId != null) {
				msgs = ((InternalEObject) typeId).eInverseRemove(
					this, EOPPOSITE_FEATURE_BASE - CDAPackage.REFERENCE_RANGE__TYPE_ID, null, msgs);
			}
			if (newTypeId != null) {
				msgs = ((InternalEObject) newTypeId).eInverseAdd(
					this, EOPPOSITE_FEATURE_BASE - CDAPackage.REFERENCE_RANGE__TYPE_ID, null, msgs);
			}
			msgs = basicSetTypeId(newTypeId, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, CDAPackage.REFERENCE_RANGE__TYPE_ID, newTypeId,
				newTypeId));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<II> getTemplateIds() {
		if (templateIds == null) {
			templateIds = new EObjectContainmentEList<II>(II.class, this, CDAPackage.REFERENCE_RANGE__TEMPLATE_ID);
		}
		return templateIds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObservationRange getObservationRange() {
		return observationRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetObservationRange(ObservationRange newObservationRange, NotificationChain msgs) {
		ObservationRange oldObservationRange = observationRange;
		observationRange = newObservationRange;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, CDAPackage.REFERENCE_RANGE__OBSERVATION_RANGE, oldObservationRange,
				newObservationRange);
			if (msgs == null) {
				msgs = notification;
			} else {
				msgs.add(notification);
			}
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObservationRange(ObservationRange newObservationRange) {
		if (newObservationRange != observationRange) {
			NotificationChain msgs = null;
			if (observationRange != null) {
				msgs = ((InternalEObject) observationRange).eInverseRemove(
					this, EOPPOSITE_FEATURE_BASE - CDAPackage.REFERENCE_RANGE__OBSERVATION_RANGE, null, msgs);
			}
			if (newObservationRange != null) {
				msgs = ((InternalEObject) newObservationRange).eInverseAdd(
					this, EOPPOSITE_FEATURE_BASE - CDAPackage.REFERENCE_RANGE__OBSERVATION_RANGE, null, msgs);
			}
			msgs = basicSetObservationRange(newObservationRange, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, CDAPackage.REFERENCE_RANGE__OBSERVATION_RANGE,
				newObservationRange, newObservationRange));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NullFlavor getNullFlavor() {
		return nullFlavor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNullFlavor(NullFlavor newNullFlavor) {
		NullFlavor oldNullFlavor = nullFlavor;
		nullFlavor = newNullFlavor == null
				? NULL_FLAVOR_EDEFAULT
				: newNullFlavor;
		boolean oldNullFlavorESet = nullFlavorESet;
		nullFlavorESet = true;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, CDAPackage.REFERENCE_RANGE__NULL_FLAVOR,
				oldNullFlavor, nullFlavor, !oldNullFlavorESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNullFlavor() {
		NullFlavor oldNullFlavor = nullFlavor;
		boolean oldNullFlavorESet = nullFlavorESet;
		nullFlavor = NULL_FLAVOR_EDEFAULT;
		nullFlavorESet = false;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.UNSET, CDAPackage.REFERENCE_RANGE__NULL_FLAVOR,
				oldNullFlavor, NULL_FLAVOR_EDEFAULT, oldNullFlavorESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNullFlavor() {
		return nullFlavorESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ActRelationshipType getTypeCode() {
		return typeCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeCode(ActRelationshipType newTypeCode) {
		ActRelationshipType oldTypeCode = typeCode;
		typeCode = newTypeCode == null
				? TYPE_CODE_EDEFAULT
				: newTypeCode;
		boolean oldTypeCodeESet = typeCodeESet;
		typeCodeESet = true;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, CDAPackage.REFERENCE_RANGE__TYPE_CODE, oldTypeCode,
				typeCode, !oldTypeCodeESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTypeCode() {
		ActRelationshipType oldTypeCode = typeCode;
		boolean oldTypeCodeESet = typeCodeESet;
		typeCode = TYPE_CODE_EDEFAULT;
		typeCodeESet = false;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.UNSET, CDAPackage.REFERENCE_RANGE__TYPE_CODE, oldTypeCode,
				TYPE_CODE_EDEFAULT, oldTypeCodeESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTypeCode() {
		return typeCodeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ReferenceRangeOperations.validateTypeCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CDAPackage.REFERENCE_RANGE__REALM_CODE:
				return ((InternalEList<?>) getRealmCodes()).basicRemove(otherEnd, msgs);
			case CDAPackage.REFERENCE_RANGE__TYPE_ID:
				return basicSetTypeId(null, msgs);
			case CDAPackage.REFERENCE_RANGE__TEMPLATE_ID:
				return ((InternalEList<?>) getTemplateIds()).basicRemove(otherEnd, msgs);
			case CDAPackage.REFERENCE_RANGE__OBSERVATION_RANGE:
				return basicSetObservationRange(null, msgs);
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
			case CDAPackage.REFERENCE_RANGE__REALM_CODE:
				return getRealmCodes();
			case CDAPackage.REFERENCE_RANGE__TYPE_ID:
				return getTypeId();
			case CDAPackage.REFERENCE_RANGE__TEMPLATE_ID:
				return getTemplateIds();
			case CDAPackage.REFERENCE_RANGE__OBSERVATION_RANGE:
				return getObservationRange();
			case CDAPackage.REFERENCE_RANGE__NULL_FLAVOR:
				return getNullFlavor();
			case CDAPackage.REFERENCE_RANGE__TYPE_CODE:
				return getTypeCode();
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
			case CDAPackage.REFERENCE_RANGE__REALM_CODE:
				getRealmCodes().clear();
				getRealmCodes().addAll((Collection<? extends CS>) newValue);
				return;
			case CDAPackage.REFERENCE_RANGE__TYPE_ID:
				setTypeId((InfrastructureRootTypeId) newValue);
				return;
			case CDAPackage.REFERENCE_RANGE__TEMPLATE_ID:
				getTemplateIds().clear();
				getTemplateIds().addAll((Collection<? extends II>) newValue);
				return;
			case CDAPackage.REFERENCE_RANGE__OBSERVATION_RANGE:
				setObservationRange((ObservationRange) newValue);
				return;
			case CDAPackage.REFERENCE_RANGE__NULL_FLAVOR:
				setNullFlavor((NullFlavor) newValue);
				return;
			case CDAPackage.REFERENCE_RANGE__TYPE_CODE:
				setTypeCode((ActRelationshipType) newValue);
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
			case CDAPackage.REFERENCE_RANGE__REALM_CODE:
				getRealmCodes().clear();
				return;
			case CDAPackage.REFERENCE_RANGE__TYPE_ID:
				setTypeId((InfrastructureRootTypeId) null);
				return;
			case CDAPackage.REFERENCE_RANGE__TEMPLATE_ID:
				getTemplateIds().clear();
				return;
			case CDAPackage.REFERENCE_RANGE__OBSERVATION_RANGE:
				setObservationRange((ObservationRange) null);
				return;
			case CDAPackage.REFERENCE_RANGE__NULL_FLAVOR:
				unsetNullFlavor();
				return;
			case CDAPackage.REFERENCE_RANGE__TYPE_CODE:
				unsetTypeCode();
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
			case CDAPackage.REFERENCE_RANGE__REALM_CODE:
				return realmCodes != null && !realmCodes.isEmpty();
			case CDAPackage.REFERENCE_RANGE__TYPE_ID:
				return typeId != null;
			case CDAPackage.REFERENCE_RANGE__TEMPLATE_ID:
				return templateIds != null && !templateIds.isEmpty();
			case CDAPackage.REFERENCE_RANGE__OBSERVATION_RANGE:
				return observationRange != null;
			case CDAPackage.REFERENCE_RANGE__NULL_FLAVOR:
				return isSetNullFlavor();
			case CDAPackage.REFERENCE_RANGE__TYPE_CODE:
				return isSetTypeCode();
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
		if (eIsProxy()) {
			return super.toString();
		}

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (nullFlavor: ");
		if (nullFlavorESet) {
			result.append(nullFlavor);
		} else {
			result.append("<unset>");
		}
		result.append(", typeCode: ");
		if (typeCodeESet) {
			result.append(typeCode);
		} else {
			result.append("<unset>");
		}
		result.append(')');
		return result.toString();
	}

} // ReferenceRangeImpl
