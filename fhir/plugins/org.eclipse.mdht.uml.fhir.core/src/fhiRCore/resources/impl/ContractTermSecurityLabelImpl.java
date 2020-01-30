/**
 */
package fhiRCore.resources.impl;

import fhiRCore.dataTypes.Coding;
import fhiRCore.dataTypes.UnsignedInt;

import fhiRCore.dataTypes.impl.BackboneElementImpl;

import fhiRCore.resources.ContractTermSecurityLabel;
import fhiRCore.resources.ResourcesPackage;

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
 * An implementation of the model object '<em><b>Contract Term Security Label</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.impl.ContractTermSecurityLabelImpl#getNumbers <em>Number</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ContractTermSecurityLabelImpl#getClassification <em>Classification</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ContractTermSecurityLabelImpl#getCategories <em>Category</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ContractTermSecurityLabelImpl#getControls <em>Control</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContractTermSecurityLabelImpl extends BackboneElementImpl implements ContractTermSecurityLabel {
	/**
	 * The cached value of the '{@link #getNumbers() <em>Number</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumbers()
	 * @generated
	 * @ordered
	 */
	protected EList<UnsignedInt> numbers;

	/**
	 * The cached value of the '{@link #getClassification() <em>Classification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassification()
	 * @generated
	 * @ordered
	 */
	protected Coding classification;

	/**
	 * The cached value of the '{@link #getCategories() <em>Category</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategories()
	 * @generated
	 * @ordered
	 */
	protected EList<Coding> categories;

	/**
	 * The cached value of the '{@link #getControls() <em>Control</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControls()
	 * @generated
	 * @ordered
	 */
	protected EList<Coding> controls;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContractTermSecurityLabelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getContractTermSecurityLabel();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UnsignedInt> getNumbers() {
		if (numbers == null) {
			numbers = new EObjectContainmentEList<UnsignedInt>(UnsignedInt.class, this, ResourcesPackage.CONTRACT_TERM_SECURITY_LABEL__NUMBER);
		}
		return numbers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coding getClassification() {
		return classification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClassification(Coding newClassification, NotificationChain msgs) {
		Coding oldClassification = classification;
		classification = newClassification;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.CONTRACT_TERM_SECURITY_LABEL__CLASSIFICATION, oldClassification, newClassification);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClassification(Coding newClassification) {
		if (newClassification != classification) {
			NotificationChain msgs = null;
			if (classification != null)
				msgs = ((InternalEObject)classification).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CONTRACT_TERM_SECURITY_LABEL__CLASSIFICATION, null, msgs);
			if (newClassification != null)
				msgs = ((InternalEObject)newClassification).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CONTRACT_TERM_SECURITY_LABEL__CLASSIFICATION, null, msgs);
			msgs = basicSetClassification(newClassification, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CONTRACT_TERM_SECURITY_LABEL__CLASSIFICATION, newClassification, newClassification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Coding> getCategories() {
		if (categories == null) {
			categories = new EObjectContainmentEList<Coding>(Coding.class, this, ResourcesPackage.CONTRACT_TERM_SECURITY_LABEL__CATEGORY);
		}
		return categories;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Coding> getControls() {
		if (controls == null) {
			controls = new EObjectContainmentEList<Coding>(Coding.class, this, ResourcesPackage.CONTRACT_TERM_SECURITY_LABEL__CONTROL);
		}
		return controls;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.CONTRACT_TERM_SECURITY_LABEL__NUMBER:
				return ((InternalEList<?>)getNumbers()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.CONTRACT_TERM_SECURITY_LABEL__CLASSIFICATION:
				return basicSetClassification(null, msgs);
			case ResourcesPackage.CONTRACT_TERM_SECURITY_LABEL__CATEGORY:
				return ((InternalEList<?>)getCategories()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.CONTRACT_TERM_SECURITY_LABEL__CONTROL:
				return ((InternalEList<?>)getControls()).basicRemove(otherEnd, msgs);
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
			case ResourcesPackage.CONTRACT_TERM_SECURITY_LABEL__NUMBER:
				return getNumbers();
			case ResourcesPackage.CONTRACT_TERM_SECURITY_LABEL__CLASSIFICATION:
				return getClassification();
			case ResourcesPackage.CONTRACT_TERM_SECURITY_LABEL__CATEGORY:
				return getCategories();
			case ResourcesPackage.CONTRACT_TERM_SECURITY_LABEL__CONTROL:
				return getControls();
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
			case ResourcesPackage.CONTRACT_TERM_SECURITY_LABEL__NUMBER:
				getNumbers().clear();
				getNumbers().addAll((Collection<? extends UnsignedInt>)newValue);
				return;
			case ResourcesPackage.CONTRACT_TERM_SECURITY_LABEL__CLASSIFICATION:
				setClassification((Coding)newValue);
				return;
			case ResourcesPackage.CONTRACT_TERM_SECURITY_LABEL__CATEGORY:
				getCategories().clear();
				getCategories().addAll((Collection<? extends Coding>)newValue);
				return;
			case ResourcesPackage.CONTRACT_TERM_SECURITY_LABEL__CONTROL:
				getControls().clear();
				getControls().addAll((Collection<? extends Coding>)newValue);
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
			case ResourcesPackage.CONTRACT_TERM_SECURITY_LABEL__NUMBER:
				getNumbers().clear();
				return;
			case ResourcesPackage.CONTRACT_TERM_SECURITY_LABEL__CLASSIFICATION:
				setClassification((Coding)null);
				return;
			case ResourcesPackage.CONTRACT_TERM_SECURITY_LABEL__CATEGORY:
				getCategories().clear();
				return;
			case ResourcesPackage.CONTRACT_TERM_SECURITY_LABEL__CONTROL:
				getControls().clear();
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
			case ResourcesPackage.CONTRACT_TERM_SECURITY_LABEL__NUMBER:
				return numbers != null && !numbers.isEmpty();
			case ResourcesPackage.CONTRACT_TERM_SECURITY_LABEL__CLASSIFICATION:
				return classification != null;
			case ResourcesPackage.CONTRACT_TERM_SECURITY_LABEL__CATEGORY:
				return categories != null && !categories.isEmpty();
			case ResourcesPackage.CONTRACT_TERM_SECURITY_LABEL__CONTROL:
				return controls != null && !controls.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ContractTermSecurityLabelImpl
