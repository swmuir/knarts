/**
 */
package fhiRCore.resources.impl;

import fhiRCore.dataTypes.DataType;

import fhiRCore.dataTypes.impl.BackboneElementImpl;

import fhiRCore.resources.ResourcesPackage;
import fhiRCore.resources.SpecimenDefinitionTypeTestedContainerAdditive;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Specimen Definition Type Tested Container Additive</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.impl.SpecimenDefinitionTypeTestedContainerAdditiveImpl#getAdditivex <em>Additivex</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SpecimenDefinitionTypeTestedContainerAdditiveImpl extends BackboneElementImpl implements SpecimenDefinitionTypeTestedContainerAdditive {
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
	protected SpecimenDefinitionTypeTestedContainerAdditiveImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getSpecimenDefinitionTypeTestedContainerAdditive();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.SPECIMEN_DEFINITION_TYPE_TESTED_CONTAINER_ADDITIVE__ADDITIVEX, oldAdditivex, newAdditivex);
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
				msgs = ((InternalEObject)additivex).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SPECIMEN_DEFINITION_TYPE_TESTED_CONTAINER_ADDITIVE__ADDITIVEX, null, msgs);
			if (newAdditivex != null)
				msgs = ((InternalEObject)newAdditivex).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SPECIMEN_DEFINITION_TYPE_TESTED_CONTAINER_ADDITIVE__ADDITIVEX, null, msgs);
			msgs = basicSetAdditivex(newAdditivex, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.SPECIMEN_DEFINITION_TYPE_TESTED_CONTAINER_ADDITIVE__ADDITIVEX, newAdditivex, newAdditivex));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.SPECIMEN_DEFINITION_TYPE_TESTED_CONTAINER_ADDITIVE__ADDITIVEX:
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
			case ResourcesPackage.SPECIMEN_DEFINITION_TYPE_TESTED_CONTAINER_ADDITIVE__ADDITIVEX:
				return getAdditivex();
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
			case ResourcesPackage.SPECIMEN_DEFINITION_TYPE_TESTED_CONTAINER_ADDITIVE__ADDITIVEX:
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
			case ResourcesPackage.SPECIMEN_DEFINITION_TYPE_TESTED_CONTAINER_ADDITIVE__ADDITIVEX:
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
			case ResourcesPackage.SPECIMEN_DEFINITION_TYPE_TESTED_CONTAINER_ADDITIVE__ADDITIVEX:
				return additivex != null;
		}
		return super.eIsSet(featureID);
	}

} //SpecimenDefinitionTypeTestedContainerAdditiveImpl
