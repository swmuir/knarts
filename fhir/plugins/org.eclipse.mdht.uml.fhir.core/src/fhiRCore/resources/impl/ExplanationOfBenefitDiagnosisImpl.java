/**
 */
package fhiRCore.resources.impl;

import fhiRCore.dataTypes.CodeableConcept;
import fhiRCore.dataTypes.DataType;
import fhiRCore.dataTypes.PositiveInt;

import fhiRCore.dataTypes.impl.BackboneElementImpl;

import fhiRCore.resources.ExplanationOfBenefitDiagnosis;
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
 * An implementation of the model object '<em><b>Explanation Of Benefit Diagnosis</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.impl.ExplanationOfBenefitDiagnosisImpl#getSequence <em>Sequence</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ExplanationOfBenefitDiagnosisImpl#getDiagnosisx <em>Diagnosisx</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ExplanationOfBenefitDiagnosisImpl#getTypes <em>Type</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ExplanationOfBenefitDiagnosisImpl#getOnAdmission <em>On Admission</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ExplanationOfBenefitDiagnosisImpl#getPackageCode <em>Package Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExplanationOfBenefitDiagnosisImpl extends BackboneElementImpl implements ExplanationOfBenefitDiagnosis {
	/**
	 * The cached value of the '{@link #getSequence() <em>Sequence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequence()
	 * @generated
	 * @ordered
	 */
	protected PositiveInt sequence;

	/**
	 * The cached value of the '{@link #getDiagnosisx() <em>Diagnosisx</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiagnosisx()
	 * @generated
	 * @ordered
	 */
	protected DataType diagnosisx;

	/**
	 * The cached value of the '{@link #getTypes() <em>Type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> types;

	/**
	 * The cached value of the '{@link #getOnAdmission() <em>On Admission</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnAdmission()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept onAdmission;

	/**
	 * The cached value of the '{@link #getPackageCode() <em>Package Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackageCode()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept packageCode;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExplanationOfBenefitDiagnosisImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getExplanationOfBenefitDiagnosis();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PositiveInt getSequence() {
		return sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSequence(PositiveInt newSequence, NotificationChain msgs) {
		PositiveInt oldSequence = sequence;
		sequence = newSequence;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.EXPLANATION_OF_BENEFIT_DIAGNOSIS__SEQUENCE, oldSequence, newSequence);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSequence(PositiveInt newSequence) {
		if (newSequence != sequence) {
			NotificationChain msgs = null;
			if (sequence != null)
				msgs = ((InternalEObject)sequence).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.EXPLANATION_OF_BENEFIT_DIAGNOSIS__SEQUENCE, null, msgs);
			if (newSequence != null)
				msgs = ((InternalEObject)newSequence).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.EXPLANATION_OF_BENEFIT_DIAGNOSIS__SEQUENCE, null, msgs);
			msgs = basicSetSequence(newSequence, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.EXPLANATION_OF_BENEFIT_DIAGNOSIS__SEQUENCE, newSequence, newSequence));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType getDiagnosisx() {
		return diagnosisx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDiagnosisx(DataType newDiagnosisx, NotificationChain msgs) {
		DataType oldDiagnosisx = diagnosisx;
		diagnosisx = newDiagnosisx;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.EXPLANATION_OF_BENEFIT_DIAGNOSIS__DIAGNOSISX, oldDiagnosisx, newDiagnosisx);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiagnosisx(DataType newDiagnosisx) {
		if (newDiagnosisx != diagnosisx) {
			NotificationChain msgs = null;
			if (diagnosisx != null)
				msgs = ((InternalEObject)diagnosisx).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.EXPLANATION_OF_BENEFIT_DIAGNOSIS__DIAGNOSISX, null, msgs);
			if (newDiagnosisx != null)
				msgs = ((InternalEObject)newDiagnosisx).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.EXPLANATION_OF_BENEFIT_DIAGNOSIS__DIAGNOSISX, null, msgs);
			msgs = basicSetDiagnosisx(newDiagnosisx, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.EXPLANATION_OF_BENEFIT_DIAGNOSIS__DIAGNOSISX, newDiagnosisx, newDiagnosisx));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getTypes() {
		if (types == null) {
			types = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, ResourcesPackage.EXPLANATION_OF_BENEFIT_DIAGNOSIS__TYPE);
		}
		return types;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getOnAdmission() {
		return onAdmission;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOnAdmission(CodeableConcept newOnAdmission, NotificationChain msgs) {
		CodeableConcept oldOnAdmission = onAdmission;
		onAdmission = newOnAdmission;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.EXPLANATION_OF_BENEFIT_DIAGNOSIS__ON_ADMISSION, oldOnAdmission, newOnAdmission);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOnAdmission(CodeableConcept newOnAdmission) {
		if (newOnAdmission != onAdmission) {
			NotificationChain msgs = null;
			if (onAdmission != null)
				msgs = ((InternalEObject)onAdmission).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.EXPLANATION_OF_BENEFIT_DIAGNOSIS__ON_ADMISSION, null, msgs);
			if (newOnAdmission != null)
				msgs = ((InternalEObject)newOnAdmission).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.EXPLANATION_OF_BENEFIT_DIAGNOSIS__ON_ADMISSION, null, msgs);
			msgs = basicSetOnAdmission(newOnAdmission, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.EXPLANATION_OF_BENEFIT_DIAGNOSIS__ON_ADMISSION, newOnAdmission, newOnAdmission));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getPackageCode() {
		return packageCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPackageCode(CodeableConcept newPackageCode, NotificationChain msgs) {
		CodeableConcept oldPackageCode = packageCode;
		packageCode = newPackageCode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.EXPLANATION_OF_BENEFIT_DIAGNOSIS__PACKAGE_CODE, oldPackageCode, newPackageCode);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPackageCode(CodeableConcept newPackageCode) {
		if (newPackageCode != packageCode) {
			NotificationChain msgs = null;
			if (packageCode != null)
				msgs = ((InternalEObject)packageCode).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.EXPLANATION_OF_BENEFIT_DIAGNOSIS__PACKAGE_CODE, null, msgs);
			if (newPackageCode != null)
				msgs = ((InternalEObject)newPackageCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.EXPLANATION_OF_BENEFIT_DIAGNOSIS__PACKAGE_CODE, null, msgs);
			msgs = basicSetPackageCode(newPackageCode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.EXPLANATION_OF_BENEFIT_DIAGNOSIS__PACKAGE_CODE, newPackageCode, newPackageCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_DIAGNOSIS__SEQUENCE:
				return basicSetSequence(null, msgs);
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_DIAGNOSIS__DIAGNOSISX:
				return basicSetDiagnosisx(null, msgs);
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_DIAGNOSIS__TYPE:
				return ((InternalEList<?>)getTypes()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_DIAGNOSIS__ON_ADMISSION:
				return basicSetOnAdmission(null, msgs);
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_DIAGNOSIS__PACKAGE_CODE:
				return basicSetPackageCode(null, msgs);
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
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_DIAGNOSIS__SEQUENCE:
				return getSequence();
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_DIAGNOSIS__DIAGNOSISX:
				return getDiagnosisx();
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_DIAGNOSIS__TYPE:
				return getTypes();
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_DIAGNOSIS__ON_ADMISSION:
				return getOnAdmission();
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_DIAGNOSIS__PACKAGE_CODE:
				return getPackageCode();
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
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_DIAGNOSIS__SEQUENCE:
				setSequence((PositiveInt)newValue);
				return;
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_DIAGNOSIS__DIAGNOSISX:
				setDiagnosisx((DataType)newValue);
				return;
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_DIAGNOSIS__TYPE:
				getTypes().clear();
				getTypes().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_DIAGNOSIS__ON_ADMISSION:
				setOnAdmission((CodeableConcept)newValue);
				return;
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_DIAGNOSIS__PACKAGE_CODE:
				setPackageCode((CodeableConcept)newValue);
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
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_DIAGNOSIS__SEQUENCE:
				setSequence((PositiveInt)null);
				return;
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_DIAGNOSIS__DIAGNOSISX:
				setDiagnosisx((DataType)null);
				return;
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_DIAGNOSIS__TYPE:
				getTypes().clear();
				return;
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_DIAGNOSIS__ON_ADMISSION:
				setOnAdmission((CodeableConcept)null);
				return;
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_DIAGNOSIS__PACKAGE_CODE:
				setPackageCode((CodeableConcept)null);
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
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_DIAGNOSIS__SEQUENCE:
				return sequence != null;
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_DIAGNOSIS__DIAGNOSISX:
				return diagnosisx != null;
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_DIAGNOSIS__TYPE:
				return types != null && !types.isEmpty();
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_DIAGNOSIS__ON_ADMISSION:
				return onAdmission != null;
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_DIAGNOSIS__PACKAGE_CODE:
				return packageCode != null;
		}
		return super.eIsSet(featureID);
	}

} //ExplanationOfBenefitDiagnosisImpl
