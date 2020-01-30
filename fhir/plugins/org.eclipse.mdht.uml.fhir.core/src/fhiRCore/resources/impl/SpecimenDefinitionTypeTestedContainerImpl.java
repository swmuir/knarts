/**
 */
package fhiRCore.resources.impl;

import fhiRCore.dataTypes.CodeableConcept;
import fhiRCore.dataTypes.DataType;
import fhiRCore.dataTypes.Quantity;

import fhiRCore.dataTypes.impl.BackboneElementImpl;

import fhiRCore.resources.ResourcesPackage;
import fhiRCore.resources.SpecimenDefinitionTypeTestedContainer;
import fhiRCore.resources.SpecimenDefinitionTypeTestedContainerAdditive;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Specimen Definition Type Tested Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.impl.SpecimenDefinitionTypeTestedContainerImpl#getMaterial <em>Material</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.SpecimenDefinitionTypeTestedContainerImpl#getType <em>Type</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.SpecimenDefinitionTypeTestedContainerImpl#getCap <em>Cap</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.SpecimenDefinitionTypeTestedContainerImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.SpecimenDefinitionTypeTestedContainerImpl#getCapacity <em>Capacity</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.SpecimenDefinitionTypeTestedContainerImpl#getMinimumVolumex <em>Minimum Volumex</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.SpecimenDefinitionTypeTestedContainerImpl#getAdditives <em>Additive</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.SpecimenDefinitionTypeTestedContainerImpl#getPreparation <em>Preparation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SpecimenDefinitionTypeTestedContainerImpl extends BackboneElementImpl implements SpecimenDefinitionTypeTestedContainer {
	/**
	 * The cached value of the '{@link #getMaterial() <em>Material</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaterial()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept material;

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
	 * The cached value of the '{@link #getCap() <em>Cap</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCap()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept cap;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected fhiRCore.dataTypes.String description;

	/**
	 * The cached value of the '{@link #getCapacity() <em>Capacity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapacity()
	 * @generated
	 * @ordered
	 */
	protected Quantity capacity;

	/**
	 * The cached value of the '{@link #getMinimumVolumex() <em>Minimum Volumex</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimumVolumex()
	 * @generated
	 * @ordered
	 */
	protected DataType minimumVolumex;

	/**
	 * The cached value of the '{@link #getAdditives() <em>Additive</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditives()
	 * @generated
	 * @ordered
	 */
	protected EList<SpecimenDefinitionTypeTestedContainerAdditive> additives;

	/**
	 * The cached value of the '{@link #getPreparation() <em>Preparation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreparation()
	 * @generated
	 * @ordered
	 */
	protected fhiRCore.dataTypes.String preparation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpecimenDefinitionTypeTestedContainerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getSpecimenDefinitionTypeTestedContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getMaterial() {
		return material;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMaterial(CodeableConcept newMaterial, NotificationChain msgs) {
		CodeableConcept oldMaterial = material;
		material = newMaterial;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.SPECIMEN_DEFINITION_TYPE_TESTED_CONTAINER__MATERIAL, oldMaterial, newMaterial);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaterial(CodeableConcept newMaterial) {
		if (newMaterial != material) {
			NotificationChain msgs = null;
			if (material != null)
				msgs = ((InternalEObject)material).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SPECIMEN_DEFINITION_TYPE_TESTED_CONTAINER__MATERIAL, null, msgs);
			if (newMaterial != null)
				msgs = ((InternalEObject)newMaterial).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SPECIMEN_DEFINITION_TYPE_TESTED_CONTAINER__MATERIAL, null, msgs);
			msgs = basicSetMaterial(newMaterial, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.SPECIMEN_DEFINITION_TYPE_TESTED_CONTAINER__MATERIAL, newMaterial, newMaterial));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.SPECIMEN_DEFINITION_TYPE_TESTED_CONTAINER__TYPE, oldType, newType);
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
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SPECIMEN_DEFINITION_TYPE_TESTED_CONTAINER__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SPECIMEN_DEFINITION_TYPE_TESTED_CONTAINER__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.SPECIMEN_DEFINITION_TYPE_TESTED_CONTAINER__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getCap() {
		return cap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCap(CodeableConcept newCap, NotificationChain msgs) {
		CodeableConcept oldCap = cap;
		cap = newCap;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.SPECIMEN_DEFINITION_TYPE_TESTED_CONTAINER__CAP, oldCap, newCap);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCap(CodeableConcept newCap) {
		if (newCap != cap) {
			NotificationChain msgs = null;
			if (cap != null)
				msgs = ((InternalEObject)cap).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SPECIMEN_DEFINITION_TYPE_TESTED_CONTAINER__CAP, null, msgs);
			if (newCap != null)
				msgs = ((InternalEObject)newCap).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SPECIMEN_DEFINITION_TYPE_TESTED_CONTAINER__CAP, null, msgs);
			msgs = basicSetCap(newCap, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.SPECIMEN_DEFINITION_TYPE_TESTED_CONTAINER__CAP, newCap, newCap));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public fhiRCore.dataTypes.String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDescription(fhiRCore.dataTypes.String newDescription, NotificationChain msgs) {
		fhiRCore.dataTypes.String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.SPECIMEN_DEFINITION_TYPE_TESTED_CONTAINER__DESCRIPTION, oldDescription, newDescription);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(fhiRCore.dataTypes.String newDescription) {
		if (newDescription != description) {
			NotificationChain msgs = null;
			if (description != null)
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SPECIMEN_DEFINITION_TYPE_TESTED_CONTAINER__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SPECIMEN_DEFINITION_TYPE_TESTED_CONTAINER__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.SPECIMEN_DEFINITION_TYPE_TESTED_CONTAINER__DESCRIPTION, newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Quantity getCapacity() {
		return capacity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCapacity(Quantity newCapacity, NotificationChain msgs) {
		Quantity oldCapacity = capacity;
		capacity = newCapacity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.SPECIMEN_DEFINITION_TYPE_TESTED_CONTAINER__CAPACITY, oldCapacity, newCapacity);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCapacity(Quantity newCapacity) {
		if (newCapacity != capacity) {
			NotificationChain msgs = null;
			if (capacity != null)
				msgs = ((InternalEObject)capacity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SPECIMEN_DEFINITION_TYPE_TESTED_CONTAINER__CAPACITY, null, msgs);
			if (newCapacity != null)
				msgs = ((InternalEObject)newCapacity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SPECIMEN_DEFINITION_TYPE_TESTED_CONTAINER__CAPACITY, null, msgs);
			msgs = basicSetCapacity(newCapacity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.SPECIMEN_DEFINITION_TYPE_TESTED_CONTAINER__CAPACITY, newCapacity, newCapacity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType getMinimumVolumex() {
		return minimumVolumex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMinimumVolumex(DataType newMinimumVolumex, NotificationChain msgs) {
		DataType oldMinimumVolumex = minimumVolumex;
		minimumVolumex = newMinimumVolumex;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.SPECIMEN_DEFINITION_TYPE_TESTED_CONTAINER__MINIMUM_VOLUMEX, oldMinimumVolumex, newMinimumVolumex);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinimumVolumex(DataType newMinimumVolumex) {
		if (newMinimumVolumex != minimumVolumex) {
			NotificationChain msgs = null;
			if (minimumVolumex != null)
				msgs = ((InternalEObject)minimumVolumex).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SPECIMEN_DEFINITION_TYPE_TESTED_CONTAINER__MINIMUM_VOLUMEX, null, msgs);
			if (newMinimumVolumex != null)
				msgs = ((InternalEObject)newMinimumVolumex).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SPECIMEN_DEFINITION_TYPE_TESTED_CONTAINER__MINIMUM_VOLUMEX, null, msgs);
			msgs = basicSetMinimumVolumex(newMinimumVolumex, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.SPECIMEN_DEFINITION_TYPE_TESTED_CONTAINER__MINIMUM_VOLUMEX, newMinimumVolumex, newMinimumVolumex));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SpecimenDefinitionTypeTestedContainerAdditive> getAdditives() {
		if (additives == null) {
			additives = new EObjectContainmentEList<SpecimenDefinitionTypeTestedContainerAdditive>(SpecimenDefinitionTypeTestedContainerAdditive.class, this, ResourcesPackage.SPECIMEN_DEFINITION_TYPE_TESTED_CONTAINER__ADDITIVE);
		}
		return additives;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public fhiRCore.dataTypes.String getPreparation() {
		return preparation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPreparation(fhiRCore.dataTypes.String newPreparation, NotificationChain msgs) {
		fhiRCore.dataTypes.String oldPreparation = preparation;
		preparation = newPreparation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.SPECIMEN_DEFINITION_TYPE_TESTED_CONTAINER__PREPARATION, oldPreparation, newPreparation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPreparation(fhiRCore.dataTypes.String newPreparation) {
		if (newPreparation != preparation) {
			NotificationChain msgs = null;
			if (preparation != null)
				msgs = ((InternalEObject)preparation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SPECIMEN_DEFINITION_TYPE_TESTED_CONTAINER__PREPARATION, null, msgs);
			if (newPreparation != null)
				msgs = ((InternalEObject)newPreparation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SPECIMEN_DEFINITION_TYPE_TESTED_CONTAINER__PREPARATION, null, msgs);
			msgs = basicSetPreparation(newPreparation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.SPECIMEN_DEFINITION_TYPE_TESTED_CONTAINER__PREPARATION, newPreparation, newPreparation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.SPECIMEN_DEFINITION_TYPE_TESTED_CONTAINER__MATERIAL:
				return basicSetMaterial(null, msgs);
			case ResourcesPackage.SPECIMEN_DEFINITION_TYPE_TESTED_CONTAINER__TYPE:
				return basicSetType(null, msgs);
			case ResourcesPackage.SPECIMEN_DEFINITION_TYPE_TESTED_CONTAINER__CAP:
				return basicSetCap(null, msgs);
			case ResourcesPackage.SPECIMEN_DEFINITION_TYPE_TESTED_CONTAINER__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case ResourcesPackage.SPECIMEN_DEFINITION_TYPE_TESTED_CONTAINER__CAPACITY:
				return basicSetCapacity(null, msgs);
			case ResourcesPackage.SPECIMEN_DEFINITION_TYPE_TESTED_CONTAINER__MINIMUM_VOLUMEX:
				return basicSetMinimumVolumex(null, msgs);
			case ResourcesPackage.SPECIMEN_DEFINITION_TYPE_TESTED_CONTAINER__ADDITIVE:
				return ((InternalEList<?>)getAdditives()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.SPECIMEN_DEFINITION_TYPE_TESTED_CONTAINER__PREPARATION:
				return basicSetPreparation(null, msgs);
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
			case ResourcesPackage.SPECIMEN_DEFINITION_TYPE_TESTED_CONTAINER__MATERIAL:
				return getMaterial();
			case ResourcesPackage.SPECIMEN_DEFINITION_TYPE_TESTED_CONTAINER__TYPE:
				return getType();
			case ResourcesPackage.SPECIMEN_DEFINITION_TYPE_TESTED_CONTAINER__CAP:
				return getCap();
			case ResourcesPackage.SPECIMEN_DEFINITION_TYPE_TESTED_CONTAINER__DESCRIPTION:
				return getDescription();
			case ResourcesPackage.SPECIMEN_DEFINITION_TYPE_TESTED_CONTAINER__CAPACITY:
				return getCapacity();
			case ResourcesPackage.SPECIMEN_DEFINITION_TYPE_TESTED_CONTAINER__MINIMUM_VOLUMEX:
				return getMinimumVolumex();
			case ResourcesPackage.SPECIMEN_DEFINITION_TYPE_TESTED_CONTAINER__ADDITIVE:
				return getAdditives();
			case ResourcesPackage.SPECIMEN_DEFINITION_TYPE_TESTED_CONTAINER__PREPARATION:
				return getPreparation();
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
			case ResourcesPackage.SPECIMEN_DEFINITION_TYPE_TESTED_CONTAINER__MATERIAL:
				setMaterial((CodeableConcept)newValue);
				return;
			case ResourcesPackage.SPECIMEN_DEFINITION_TYPE_TESTED_CONTAINER__TYPE:
				setType((CodeableConcept)newValue);
				return;
			case ResourcesPackage.SPECIMEN_DEFINITION_TYPE_TESTED_CONTAINER__CAP:
				setCap((CodeableConcept)newValue);
				return;
			case ResourcesPackage.SPECIMEN_DEFINITION_TYPE_TESTED_CONTAINER__DESCRIPTION:
				setDescription((fhiRCore.dataTypes.String)newValue);
				return;
			case ResourcesPackage.SPECIMEN_DEFINITION_TYPE_TESTED_CONTAINER__CAPACITY:
				setCapacity((Quantity)newValue);
				return;
			case ResourcesPackage.SPECIMEN_DEFINITION_TYPE_TESTED_CONTAINER__MINIMUM_VOLUMEX:
				setMinimumVolumex((DataType)newValue);
				return;
			case ResourcesPackage.SPECIMEN_DEFINITION_TYPE_TESTED_CONTAINER__ADDITIVE:
				getAdditives().clear();
				getAdditives().addAll((Collection<? extends SpecimenDefinitionTypeTestedContainerAdditive>)newValue);
				return;
			case ResourcesPackage.SPECIMEN_DEFINITION_TYPE_TESTED_CONTAINER__PREPARATION:
				setPreparation((fhiRCore.dataTypes.String)newValue);
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
			case ResourcesPackage.SPECIMEN_DEFINITION_TYPE_TESTED_CONTAINER__MATERIAL:
				setMaterial((CodeableConcept)null);
				return;
			case ResourcesPackage.SPECIMEN_DEFINITION_TYPE_TESTED_CONTAINER__TYPE:
				setType((CodeableConcept)null);
				return;
			case ResourcesPackage.SPECIMEN_DEFINITION_TYPE_TESTED_CONTAINER__CAP:
				setCap((CodeableConcept)null);
				return;
			case ResourcesPackage.SPECIMEN_DEFINITION_TYPE_TESTED_CONTAINER__DESCRIPTION:
				setDescription((fhiRCore.dataTypes.String)null);
				return;
			case ResourcesPackage.SPECIMEN_DEFINITION_TYPE_TESTED_CONTAINER__CAPACITY:
				setCapacity((Quantity)null);
				return;
			case ResourcesPackage.SPECIMEN_DEFINITION_TYPE_TESTED_CONTAINER__MINIMUM_VOLUMEX:
				setMinimumVolumex((DataType)null);
				return;
			case ResourcesPackage.SPECIMEN_DEFINITION_TYPE_TESTED_CONTAINER__ADDITIVE:
				getAdditives().clear();
				return;
			case ResourcesPackage.SPECIMEN_DEFINITION_TYPE_TESTED_CONTAINER__PREPARATION:
				setPreparation((fhiRCore.dataTypes.String)null);
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
			case ResourcesPackage.SPECIMEN_DEFINITION_TYPE_TESTED_CONTAINER__MATERIAL:
				return material != null;
			case ResourcesPackage.SPECIMEN_DEFINITION_TYPE_TESTED_CONTAINER__TYPE:
				return type != null;
			case ResourcesPackage.SPECIMEN_DEFINITION_TYPE_TESTED_CONTAINER__CAP:
				return cap != null;
			case ResourcesPackage.SPECIMEN_DEFINITION_TYPE_TESTED_CONTAINER__DESCRIPTION:
				return description != null;
			case ResourcesPackage.SPECIMEN_DEFINITION_TYPE_TESTED_CONTAINER__CAPACITY:
				return capacity != null;
			case ResourcesPackage.SPECIMEN_DEFINITION_TYPE_TESTED_CONTAINER__MINIMUM_VOLUMEX:
				return minimumVolumex != null;
			case ResourcesPackage.SPECIMEN_DEFINITION_TYPE_TESTED_CONTAINER__ADDITIVE:
				return additives != null && !additives.isEmpty();
			case ResourcesPackage.SPECIMEN_DEFINITION_TYPE_TESTED_CONTAINER__PREPARATION:
				return preparation != null;
		}
		return super.eIsSet(featureID);
	}

} //SpecimenDefinitionTypeTestedContainerImpl
