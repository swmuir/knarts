/**
 */
package fhiRCore.resources.impl;

import fhiRCore.dataTypes.CodeableConcept;
import fhiRCore.dataTypes.DataType;
import fhiRCore.dataTypes.Identifier;
import fhiRCore.dataTypes.Quantity;

import fhiRCore.dataTypes.impl.BackboneElementImpl;

import fhiRCore.resources.ResourcesPackage;
import fhiRCore.resources.SpecimenContainer;

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
 * An implementation of the model object '<em><b>Specimen Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.impl.SpecimenContainerImpl#getIdentifiers <em>Identifier</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.SpecimenContainerImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.SpecimenContainerImpl#getType <em>Type</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.SpecimenContainerImpl#getCapacity <em>Capacity</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.SpecimenContainerImpl#getSpecimenQuantity <em>Specimen Quantity</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.SpecimenContainerImpl#getAdditivex <em>Additivex</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SpecimenContainerImpl extends BackboneElementImpl implements SpecimenContainer {
	/**
	 * The cached value of the '{@link #getIdentifiers() <em>Identifier</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifiers()
	 * @generated
	 * @ordered
	 */
	protected EList<Identifier> identifiers;

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
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept type;

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
	 * The cached value of the '{@link #getSpecimenQuantity() <em>Specimen Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecimenQuantity()
	 * @generated
	 * @ordered
	 */
	protected Quantity specimenQuantity;

	/**
	 * The cached value of the '{@link #getAdditivex() <em>Additivex</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditivex()
	 * @generated
	 * @ordered
	 */
	protected DataType additivex;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpecimenContainerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getSpecimenContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Identifier> getIdentifiers() {
		if (identifiers == null) {
			identifiers = new EObjectContainmentEList<Identifier>(Identifier.class, this, ResourcesPackage.SPECIMEN_CONTAINER__IDENTIFIER);
		}
		return identifiers;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.SPECIMEN_CONTAINER__DESCRIPTION, oldDescription, newDescription);
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
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SPECIMEN_CONTAINER__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SPECIMEN_CONTAINER__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.SPECIMEN_CONTAINER__DESCRIPTION, newDescription, newDescription));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.SPECIMEN_CONTAINER__TYPE, oldType, newType);
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
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SPECIMEN_CONTAINER__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SPECIMEN_CONTAINER__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.SPECIMEN_CONTAINER__TYPE, newType, newType));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.SPECIMEN_CONTAINER__CAPACITY, oldCapacity, newCapacity);
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
				msgs = ((InternalEObject)capacity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SPECIMEN_CONTAINER__CAPACITY, null, msgs);
			if (newCapacity != null)
				msgs = ((InternalEObject)newCapacity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SPECIMEN_CONTAINER__CAPACITY, null, msgs);
			msgs = basicSetCapacity(newCapacity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.SPECIMEN_CONTAINER__CAPACITY, newCapacity, newCapacity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Quantity getSpecimenQuantity() {
		return specimenQuantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSpecimenQuantity(Quantity newSpecimenQuantity, NotificationChain msgs) {
		Quantity oldSpecimenQuantity = specimenQuantity;
		specimenQuantity = newSpecimenQuantity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.SPECIMEN_CONTAINER__SPECIMEN_QUANTITY, oldSpecimenQuantity, newSpecimenQuantity);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpecimenQuantity(Quantity newSpecimenQuantity) {
		if (newSpecimenQuantity != specimenQuantity) {
			NotificationChain msgs = null;
			if (specimenQuantity != null)
				msgs = ((InternalEObject)specimenQuantity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SPECIMEN_CONTAINER__SPECIMEN_QUANTITY, null, msgs);
			if (newSpecimenQuantity != null)
				msgs = ((InternalEObject)newSpecimenQuantity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SPECIMEN_CONTAINER__SPECIMEN_QUANTITY, null, msgs);
			msgs = basicSetSpecimenQuantity(newSpecimenQuantity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.SPECIMEN_CONTAINER__SPECIMEN_QUANTITY, newSpecimenQuantity, newSpecimenQuantity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType getAdditivex() {
		return additivex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAdditivex(DataType newAdditivex, NotificationChain msgs) {
		DataType oldAdditivex = additivex;
		additivex = newAdditivex;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.SPECIMEN_CONTAINER__ADDITIVEX, oldAdditivex, newAdditivex);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAdditivex(DataType newAdditivex) {
		if (newAdditivex != additivex) {
			NotificationChain msgs = null;
			if (additivex != null)
				msgs = ((InternalEObject)additivex).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SPECIMEN_CONTAINER__ADDITIVEX, null, msgs);
			if (newAdditivex != null)
				msgs = ((InternalEObject)newAdditivex).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SPECIMEN_CONTAINER__ADDITIVEX, null, msgs);
			msgs = basicSetAdditivex(newAdditivex, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.SPECIMEN_CONTAINER__ADDITIVEX, newAdditivex, newAdditivex));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.SPECIMEN_CONTAINER__IDENTIFIER:
				return ((InternalEList<?>)getIdentifiers()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.SPECIMEN_CONTAINER__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case ResourcesPackage.SPECIMEN_CONTAINER__TYPE:
				return basicSetType(null, msgs);
			case ResourcesPackage.SPECIMEN_CONTAINER__CAPACITY:
				return basicSetCapacity(null, msgs);
			case ResourcesPackage.SPECIMEN_CONTAINER__SPECIMEN_QUANTITY:
				return basicSetSpecimenQuantity(null, msgs);
			case ResourcesPackage.SPECIMEN_CONTAINER__ADDITIVEX:
				return basicSetAdditivex(null, msgs);
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
			case ResourcesPackage.SPECIMEN_CONTAINER__IDENTIFIER:
				return getIdentifiers();
			case ResourcesPackage.SPECIMEN_CONTAINER__DESCRIPTION:
				return getDescription();
			case ResourcesPackage.SPECIMEN_CONTAINER__TYPE:
				return getType();
			case ResourcesPackage.SPECIMEN_CONTAINER__CAPACITY:
				return getCapacity();
			case ResourcesPackage.SPECIMEN_CONTAINER__SPECIMEN_QUANTITY:
				return getSpecimenQuantity();
			case ResourcesPackage.SPECIMEN_CONTAINER__ADDITIVEX:
				return getAdditivex();
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
			case ResourcesPackage.SPECIMEN_CONTAINER__IDENTIFIER:
				getIdentifiers().clear();
				getIdentifiers().addAll((Collection<? extends Identifier>)newValue);
				return;
			case ResourcesPackage.SPECIMEN_CONTAINER__DESCRIPTION:
				setDescription((fhiRCore.dataTypes.String)newValue);
				return;
			case ResourcesPackage.SPECIMEN_CONTAINER__TYPE:
				setType((CodeableConcept)newValue);
				return;
			case ResourcesPackage.SPECIMEN_CONTAINER__CAPACITY:
				setCapacity((Quantity)newValue);
				return;
			case ResourcesPackage.SPECIMEN_CONTAINER__SPECIMEN_QUANTITY:
				setSpecimenQuantity((Quantity)newValue);
				return;
			case ResourcesPackage.SPECIMEN_CONTAINER__ADDITIVEX:
				setAdditivex((DataType)newValue);
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
			case ResourcesPackage.SPECIMEN_CONTAINER__IDENTIFIER:
				getIdentifiers().clear();
				return;
			case ResourcesPackage.SPECIMEN_CONTAINER__DESCRIPTION:
				setDescription((fhiRCore.dataTypes.String)null);
				return;
			case ResourcesPackage.SPECIMEN_CONTAINER__TYPE:
				setType((CodeableConcept)null);
				return;
			case ResourcesPackage.SPECIMEN_CONTAINER__CAPACITY:
				setCapacity((Quantity)null);
				return;
			case ResourcesPackage.SPECIMEN_CONTAINER__SPECIMEN_QUANTITY:
				setSpecimenQuantity((Quantity)null);
				return;
			case ResourcesPackage.SPECIMEN_CONTAINER__ADDITIVEX:
				setAdditivex((DataType)null);
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
			case ResourcesPackage.SPECIMEN_CONTAINER__IDENTIFIER:
				return identifiers != null && !identifiers.isEmpty();
			case ResourcesPackage.SPECIMEN_CONTAINER__DESCRIPTION:
				return description != null;
			case ResourcesPackage.SPECIMEN_CONTAINER__TYPE:
				return type != null;
			case ResourcesPackage.SPECIMEN_CONTAINER__CAPACITY:
				return capacity != null;
			case ResourcesPackage.SPECIMEN_CONTAINER__SPECIMEN_QUANTITY:
				return specimenQuantity != null;
			case ResourcesPackage.SPECIMEN_CONTAINER__ADDITIVEX:
				return additivex != null;
		}
		return super.eIsSet(featureID);
	}

} //SpecimenContainerImpl
