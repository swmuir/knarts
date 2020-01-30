/**
 */
package fhiRCore.resources.impl;

import fhiRCore.dataTypes.CodeableConcept;
import fhiRCore.dataTypes.Population;
import fhiRCore.dataTypes.Reference;

import fhiRCore.resources.MedicinalProductContraindication;
import fhiRCore.resources.MedicinalProductContraindicationOtherTherapy;
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
 * An implementation of the model object '<em><b>Medicinal Product Contraindication</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.impl.MedicinalProductContraindicationImpl#getSubjects <em>Subject</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.MedicinalProductContraindicationImpl#getDisease <em>Disease</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.MedicinalProductContraindicationImpl#getDiseaseStatus <em>Disease Status</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.MedicinalProductContraindicationImpl#getComorbidities <em>Comorbidity</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.MedicinalProductContraindicationImpl#getTherapeuticIndications <em>Therapeutic Indication</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.MedicinalProductContraindicationImpl#getOtherTherapies <em>Other Therapy</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.MedicinalProductContraindicationImpl#getPopulations <em>Population</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MedicinalProductContraindicationImpl extends DomainResourceImpl implements MedicinalProductContraindication {
	/**
	 * The cached value of the '{@link #getSubjects() <em>Subject</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubjects()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> subjects;

	/**
	 * The cached value of the '{@link #getDisease() <em>Disease</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisease()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept disease;

	/**
	 * The cached value of the '{@link #getDiseaseStatus() <em>Disease Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiseaseStatus()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept diseaseStatus;

	/**
	 * The cached value of the '{@link #getComorbidities() <em>Comorbidity</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComorbidities()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> comorbidities;

	/**
	 * The cached value of the '{@link #getTherapeuticIndications() <em>Therapeutic Indication</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTherapeuticIndications()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> therapeuticIndications;

	/**
	 * The cached value of the '{@link #getOtherTherapies() <em>Other Therapy</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherTherapies()
	 * @generated
	 * @ordered
	 */
	protected EList<MedicinalProductContraindicationOtherTherapy> otherTherapies;

	/**
	 * The cached value of the '{@link #getPopulations() <em>Population</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPopulations()
	 * @generated
	 * @ordered
	 */
	protected EList<Population> populations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MedicinalProductContraindicationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getMedicinalProductContraindication();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getSubjects() {
		if (subjects == null) {
			subjects = new EObjectContainmentEList<Reference>(Reference.class, this, ResourcesPackage.MEDICINAL_PRODUCT_CONTRAINDICATION__SUBJECT);
		}
		return subjects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getDisease() {
		return disease;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDisease(CodeableConcept newDisease, NotificationChain msgs) {
		CodeableConcept oldDisease = disease;
		disease = newDisease;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICINAL_PRODUCT_CONTRAINDICATION__DISEASE, oldDisease, newDisease);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisease(CodeableConcept newDisease) {
		if (newDisease != disease) {
			NotificationChain msgs = null;
			if (disease != null)
				msgs = ((InternalEObject)disease).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICINAL_PRODUCT_CONTRAINDICATION__DISEASE, null, msgs);
			if (newDisease != null)
				msgs = ((InternalEObject)newDisease).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICINAL_PRODUCT_CONTRAINDICATION__DISEASE, null, msgs);
			msgs = basicSetDisease(newDisease, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICINAL_PRODUCT_CONTRAINDICATION__DISEASE, newDisease, newDisease));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getDiseaseStatus() {
		return diseaseStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDiseaseStatus(CodeableConcept newDiseaseStatus, NotificationChain msgs) {
		CodeableConcept oldDiseaseStatus = diseaseStatus;
		diseaseStatus = newDiseaseStatus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICINAL_PRODUCT_CONTRAINDICATION__DISEASE_STATUS, oldDiseaseStatus, newDiseaseStatus);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiseaseStatus(CodeableConcept newDiseaseStatus) {
		if (newDiseaseStatus != diseaseStatus) {
			NotificationChain msgs = null;
			if (diseaseStatus != null)
				msgs = ((InternalEObject)diseaseStatus).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICINAL_PRODUCT_CONTRAINDICATION__DISEASE_STATUS, null, msgs);
			if (newDiseaseStatus != null)
				msgs = ((InternalEObject)newDiseaseStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICINAL_PRODUCT_CONTRAINDICATION__DISEASE_STATUS, null, msgs);
			msgs = basicSetDiseaseStatus(newDiseaseStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICINAL_PRODUCT_CONTRAINDICATION__DISEASE_STATUS, newDiseaseStatus, newDiseaseStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getComorbidities() {
		if (comorbidities == null) {
			comorbidities = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, ResourcesPackage.MEDICINAL_PRODUCT_CONTRAINDICATION__COMORBIDITY);
		}
		return comorbidities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getTherapeuticIndications() {
		if (therapeuticIndications == null) {
			therapeuticIndications = new EObjectContainmentEList<Reference>(Reference.class, this, ResourcesPackage.MEDICINAL_PRODUCT_CONTRAINDICATION__THERAPEUTIC_INDICATION);
		}
		return therapeuticIndications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MedicinalProductContraindicationOtherTherapy> getOtherTherapies() {
		if (otherTherapies == null) {
			otherTherapies = new EObjectContainmentEList<MedicinalProductContraindicationOtherTherapy>(MedicinalProductContraindicationOtherTherapy.class, this, ResourcesPackage.MEDICINAL_PRODUCT_CONTRAINDICATION__OTHER_THERAPY);
		}
		return otherTherapies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Population> getPopulations() {
		if (populations == null) {
			populations = new EObjectContainmentEList<Population>(Population.class, this, ResourcesPackage.MEDICINAL_PRODUCT_CONTRAINDICATION__POPULATION);
		}
		return populations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.MEDICINAL_PRODUCT_CONTRAINDICATION__SUBJECT:
				return ((InternalEList<?>)getSubjects()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.MEDICINAL_PRODUCT_CONTRAINDICATION__DISEASE:
				return basicSetDisease(null, msgs);
			case ResourcesPackage.MEDICINAL_PRODUCT_CONTRAINDICATION__DISEASE_STATUS:
				return basicSetDiseaseStatus(null, msgs);
			case ResourcesPackage.MEDICINAL_PRODUCT_CONTRAINDICATION__COMORBIDITY:
				return ((InternalEList<?>)getComorbidities()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.MEDICINAL_PRODUCT_CONTRAINDICATION__THERAPEUTIC_INDICATION:
				return ((InternalEList<?>)getTherapeuticIndications()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.MEDICINAL_PRODUCT_CONTRAINDICATION__OTHER_THERAPY:
				return ((InternalEList<?>)getOtherTherapies()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.MEDICINAL_PRODUCT_CONTRAINDICATION__POPULATION:
				return ((InternalEList<?>)getPopulations()).basicRemove(otherEnd, msgs);
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
			case ResourcesPackage.MEDICINAL_PRODUCT_CONTRAINDICATION__SUBJECT:
				return getSubjects();
			case ResourcesPackage.MEDICINAL_PRODUCT_CONTRAINDICATION__DISEASE:
				return getDisease();
			case ResourcesPackage.MEDICINAL_PRODUCT_CONTRAINDICATION__DISEASE_STATUS:
				return getDiseaseStatus();
			case ResourcesPackage.MEDICINAL_PRODUCT_CONTRAINDICATION__COMORBIDITY:
				return getComorbidities();
			case ResourcesPackage.MEDICINAL_PRODUCT_CONTRAINDICATION__THERAPEUTIC_INDICATION:
				return getTherapeuticIndications();
			case ResourcesPackage.MEDICINAL_PRODUCT_CONTRAINDICATION__OTHER_THERAPY:
				return getOtherTherapies();
			case ResourcesPackage.MEDICINAL_PRODUCT_CONTRAINDICATION__POPULATION:
				return getPopulations();
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
			case ResourcesPackage.MEDICINAL_PRODUCT_CONTRAINDICATION__SUBJECT:
				getSubjects().clear();
				getSubjects().addAll((Collection<? extends Reference>)newValue);
				return;
			case ResourcesPackage.MEDICINAL_PRODUCT_CONTRAINDICATION__DISEASE:
				setDisease((CodeableConcept)newValue);
				return;
			case ResourcesPackage.MEDICINAL_PRODUCT_CONTRAINDICATION__DISEASE_STATUS:
				setDiseaseStatus((CodeableConcept)newValue);
				return;
			case ResourcesPackage.MEDICINAL_PRODUCT_CONTRAINDICATION__COMORBIDITY:
				getComorbidities().clear();
				getComorbidities().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case ResourcesPackage.MEDICINAL_PRODUCT_CONTRAINDICATION__THERAPEUTIC_INDICATION:
				getTherapeuticIndications().clear();
				getTherapeuticIndications().addAll((Collection<? extends Reference>)newValue);
				return;
			case ResourcesPackage.MEDICINAL_PRODUCT_CONTRAINDICATION__OTHER_THERAPY:
				getOtherTherapies().clear();
				getOtherTherapies().addAll((Collection<? extends MedicinalProductContraindicationOtherTherapy>)newValue);
				return;
			case ResourcesPackage.MEDICINAL_PRODUCT_CONTRAINDICATION__POPULATION:
				getPopulations().clear();
				getPopulations().addAll((Collection<? extends Population>)newValue);
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
			case ResourcesPackage.MEDICINAL_PRODUCT_CONTRAINDICATION__SUBJECT:
				getSubjects().clear();
				return;
			case ResourcesPackage.MEDICINAL_PRODUCT_CONTRAINDICATION__DISEASE:
				setDisease((CodeableConcept)null);
				return;
			case ResourcesPackage.MEDICINAL_PRODUCT_CONTRAINDICATION__DISEASE_STATUS:
				setDiseaseStatus((CodeableConcept)null);
				return;
			case ResourcesPackage.MEDICINAL_PRODUCT_CONTRAINDICATION__COMORBIDITY:
				getComorbidities().clear();
				return;
			case ResourcesPackage.MEDICINAL_PRODUCT_CONTRAINDICATION__THERAPEUTIC_INDICATION:
				getTherapeuticIndications().clear();
				return;
			case ResourcesPackage.MEDICINAL_PRODUCT_CONTRAINDICATION__OTHER_THERAPY:
				getOtherTherapies().clear();
				return;
			case ResourcesPackage.MEDICINAL_PRODUCT_CONTRAINDICATION__POPULATION:
				getPopulations().clear();
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
			case ResourcesPackage.MEDICINAL_PRODUCT_CONTRAINDICATION__SUBJECT:
				return subjects != null && !subjects.isEmpty();
			case ResourcesPackage.MEDICINAL_PRODUCT_CONTRAINDICATION__DISEASE:
				return disease != null;
			case ResourcesPackage.MEDICINAL_PRODUCT_CONTRAINDICATION__DISEASE_STATUS:
				return diseaseStatus != null;
			case ResourcesPackage.MEDICINAL_PRODUCT_CONTRAINDICATION__COMORBIDITY:
				return comorbidities != null && !comorbidities.isEmpty();
			case ResourcesPackage.MEDICINAL_PRODUCT_CONTRAINDICATION__THERAPEUTIC_INDICATION:
				return therapeuticIndications != null && !therapeuticIndications.isEmpty();
			case ResourcesPackage.MEDICINAL_PRODUCT_CONTRAINDICATION__OTHER_THERAPY:
				return otherTherapies != null && !otherTherapies.isEmpty();
			case ResourcesPackage.MEDICINAL_PRODUCT_CONTRAINDICATION__POPULATION:
				return populations != null && !populations.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MedicinalProductContraindicationImpl
