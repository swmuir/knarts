/**
 */
package fhiRCore.resources.impl;

import fhiRCore.dataTypes.CodeableConcept;
import fhiRCore.dataTypes.DataType;
import fhiRCore.dataTypes.Reference;

import fhiRCore.dataTypes.impl.BackboneElementImpl;

import fhiRCore.resources.ImmunizationRecommendationRecommendation;
import fhiRCore.resources.ImmunizationRecommendationRecommendationDateCriterion;
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
 * An implementation of the model object '<em><b>Immunization Recommendation Recommendation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.impl.ImmunizationRecommendationRecommendationImpl#getVaccineCodes <em>Vaccine Code</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ImmunizationRecommendationRecommendationImpl#getTargetDisease <em>Target Disease</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ImmunizationRecommendationRecommendationImpl#getContraindicatedVaccineCodes <em>Contraindicated Vaccine Code</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ImmunizationRecommendationRecommendationImpl#getForecastStatus <em>Forecast Status</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ImmunizationRecommendationRecommendationImpl#getForecastReasons <em>Forecast Reason</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ImmunizationRecommendationRecommendationImpl#getDateCriterions <em>Date Criterion</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ImmunizationRecommendationRecommendationImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ImmunizationRecommendationRecommendationImpl#getSeries <em>Series</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ImmunizationRecommendationRecommendationImpl#getDoseNumberx <em>Dose Numberx</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ImmunizationRecommendationRecommendationImpl#getSeriesDosesx <em>Series Dosesx</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ImmunizationRecommendationRecommendationImpl#getSupportingImmunizations <em>Supporting Immunization</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ImmunizationRecommendationRecommendationImpl#getSupportingPatientInformations <em>Supporting Patient Information</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ImmunizationRecommendationRecommendationImpl extends BackboneElementImpl implements ImmunizationRecommendationRecommendation {
	/**
	 * The cached value of the '{@link #getVaccineCodes() <em>Vaccine Code</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVaccineCodes()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> vaccineCodes;

	/**
	 * The cached value of the '{@link #getTargetDisease() <em>Target Disease</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetDisease()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept targetDisease;

	/**
	 * The cached value of the '{@link #getContraindicatedVaccineCodes() <em>Contraindicated Vaccine Code</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContraindicatedVaccineCodes()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> contraindicatedVaccineCodes;

	/**
	 * The cached value of the '{@link #getForecastStatus() <em>Forecast Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForecastStatus()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept forecastStatus;

	/**
	 * The cached value of the '{@link #getForecastReasons() <em>Forecast Reason</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForecastReasons()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> forecastReasons;

	/**
	 * The cached value of the '{@link #getDateCriterions() <em>Date Criterion</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateCriterions()
	 * @generated
	 * @ordered
	 */
	protected EList<ImmunizationRecommendationRecommendationDateCriterion> dateCriterions;

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
	 * The cached value of the '{@link #getSeries() <em>Series</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeries()
	 * @generated
	 * @ordered
	 */
	protected fhiRCore.dataTypes.String series;

	/**
	 * The cached value of the '{@link #getDoseNumberx() <em>Dose Numberx</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDoseNumberx()
	 * @generated
	 * @ordered
	 */
	protected DataType doseNumberx;

	/**
	 * The cached value of the '{@link #getSeriesDosesx() <em>Series Dosesx</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeriesDosesx()
	 * @generated
	 * @ordered
	 */
	protected DataType seriesDosesx;

	/**
	 * The cached value of the '{@link #getSupportingImmunizations() <em>Supporting Immunization</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportingImmunizations()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> supportingImmunizations;

	/**
	 * The cached value of the '{@link #getSupportingPatientInformations() <em>Supporting Patient Information</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportingPatientInformations()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> supportingPatientInformations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImmunizationRecommendationRecommendationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getImmunizationRecommendationRecommendation();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getVaccineCodes() {
		if (vaccineCodes == null) {
			vaccineCodes = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, ResourcesPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__VACCINE_CODE);
		}
		return vaccineCodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getTargetDisease() {
		return targetDisease;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTargetDisease(CodeableConcept newTargetDisease, NotificationChain msgs) {
		CodeableConcept oldTargetDisease = targetDisease;
		targetDisease = newTargetDisease;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__TARGET_DISEASE, oldTargetDisease, newTargetDisease);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetDisease(CodeableConcept newTargetDisease) {
		if (newTargetDisease != targetDisease) {
			NotificationChain msgs = null;
			if (targetDisease != null)
				msgs = ((InternalEObject)targetDisease).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__TARGET_DISEASE, null, msgs);
			if (newTargetDisease != null)
				msgs = ((InternalEObject)newTargetDisease).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__TARGET_DISEASE, null, msgs);
			msgs = basicSetTargetDisease(newTargetDisease, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__TARGET_DISEASE, newTargetDisease, newTargetDisease));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getContraindicatedVaccineCodes() {
		if (contraindicatedVaccineCodes == null) {
			contraindicatedVaccineCodes = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, ResourcesPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__CONTRAINDICATED_VACCINE_CODE);
		}
		return contraindicatedVaccineCodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getForecastStatus() {
		return forecastStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetForecastStatus(CodeableConcept newForecastStatus, NotificationChain msgs) {
		CodeableConcept oldForecastStatus = forecastStatus;
		forecastStatus = newForecastStatus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__FORECAST_STATUS, oldForecastStatus, newForecastStatus);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setForecastStatus(CodeableConcept newForecastStatus) {
		if (newForecastStatus != forecastStatus) {
			NotificationChain msgs = null;
			if (forecastStatus != null)
				msgs = ((InternalEObject)forecastStatus).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__FORECAST_STATUS, null, msgs);
			if (newForecastStatus != null)
				msgs = ((InternalEObject)newForecastStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__FORECAST_STATUS, null, msgs);
			msgs = basicSetForecastStatus(newForecastStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__FORECAST_STATUS, newForecastStatus, newForecastStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getForecastReasons() {
		if (forecastReasons == null) {
			forecastReasons = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, ResourcesPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__FORECAST_REASON);
		}
		return forecastReasons;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ImmunizationRecommendationRecommendationDateCriterion> getDateCriterions() {
		if (dateCriterions == null) {
			dateCriterions = new EObjectContainmentEList<ImmunizationRecommendationRecommendationDateCriterion>(ImmunizationRecommendationRecommendationDateCriterion.class, this, ResourcesPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__DATE_CRITERION);
		}
		return dateCriterions;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__DESCRIPTION, oldDescription, newDescription);
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
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__DESCRIPTION, newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public fhiRCore.dataTypes.String getSeries() {
		return series;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSeries(fhiRCore.dataTypes.String newSeries, NotificationChain msgs) {
		fhiRCore.dataTypes.String oldSeries = series;
		series = newSeries;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__SERIES, oldSeries, newSeries);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSeries(fhiRCore.dataTypes.String newSeries) {
		if (newSeries != series) {
			NotificationChain msgs = null;
			if (series != null)
				msgs = ((InternalEObject)series).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__SERIES, null, msgs);
			if (newSeries != null)
				msgs = ((InternalEObject)newSeries).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__SERIES, null, msgs);
			msgs = basicSetSeries(newSeries, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__SERIES, newSeries, newSeries));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType getDoseNumberx() {
		return doseNumberx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDoseNumberx(DataType newDoseNumberx, NotificationChain msgs) {
		DataType oldDoseNumberx = doseNumberx;
		doseNumberx = newDoseNumberx;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__DOSE_NUMBERX, oldDoseNumberx, newDoseNumberx);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDoseNumberx(DataType newDoseNumberx) {
		if (newDoseNumberx != doseNumberx) {
			NotificationChain msgs = null;
			if (doseNumberx != null)
				msgs = ((InternalEObject)doseNumberx).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__DOSE_NUMBERX, null, msgs);
			if (newDoseNumberx != null)
				msgs = ((InternalEObject)newDoseNumberx).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__DOSE_NUMBERX, null, msgs);
			msgs = basicSetDoseNumberx(newDoseNumberx, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__DOSE_NUMBERX, newDoseNumberx, newDoseNumberx));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType getSeriesDosesx() {
		return seriesDosesx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSeriesDosesx(DataType newSeriesDosesx, NotificationChain msgs) {
		DataType oldSeriesDosesx = seriesDosesx;
		seriesDosesx = newSeriesDosesx;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__SERIES_DOSESX, oldSeriesDosesx, newSeriesDosesx);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSeriesDosesx(DataType newSeriesDosesx) {
		if (newSeriesDosesx != seriesDosesx) {
			NotificationChain msgs = null;
			if (seriesDosesx != null)
				msgs = ((InternalEObject)seriesDosesx).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__SERIES_DOSESX, null, msgs);
			if (newSeriesDosesx != null)
				msgs = ((InternalEObject)newSeriesDosesx).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__SERIES_DOSESX, null, msgs);
			msgs = basicSetSeriesDosesx(newSeriesDosesx, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__SERIES_DOSESX, newSeriesDosesx, newSeriesDosesx));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getSupportingImmunizations() {
		if (supportingImmunizations == null) {
			supportingImmunizations = new EObjectContainmentEList<Reference>(Reference.class, this, ResourcesPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__SUPPORTING_IMMUNIZATION);
		}
		return supportingImmunizations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getSupportingPatientInformations() {
		if (supportingPatientInformations == null) {
			supportingPatientInformations = new EObjectContainmentEList<Reference>(Reference.class, this, ResourcesPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__SUPPORTING_PATIENT_INFORMATION);
		}
		return supportingPatientInformations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__VACCINE_CODE:
				return ((InternalEList<?>)getVaccineCodes()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__TARGET_DISEASE:
				return basicSetTargetDisease(null, msgs);
			case ResourcesPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__CONTRAINDICATED_VACCINE_CODE:
				return ((InternalEList<?>)getContraindicatedVaccineCodes()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__FORECAST_STATUS:
				return basicSetForecastStatus(null, msgs);
			case ResourcesPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__FORECAST_REASON:
				return ((InternalEList<?>)getForecastReasons()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__DATE_CRITERION:
				return ((InternalEList<?>)getDateCriterions()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case ResourcesPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__SERIES:
				return basicSetSeries(null, msgs);
			case ResourcesPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__DOSE_NUMBERX:
				return basicSetDoseNumberx(null, msgs);
			case ResourcesPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__SERIES_DOSESX:
				return basicSetSeriesDosesx(null, msgs);
			case ResourcesPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__SUPPORTING_IMMUNIZATION:
				return ((InternalEList<?>)getSupportingImmunizations()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__SUPPORTING_PATIENT_INFORMATION:
				return ((InternalEList<?>)getSupportingPatientInformations()).basicRemove(otherEnd, msgs);
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
			case ResourcesPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__VACCINE_CODE:
				return getVaccineCodes();
			case ResourcesPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__TARGET_DISEASE:
				return getTargetDisease();
			case ResourcesPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__CONTRAINDICATED_VACCINE_CODE:
				return getContraindicatedVaccineCodes();
			case ResourcesPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__FORECAST_STATUS:
				return getForecastStatus();
			case ResourcesPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__FORECAST_REASON:
				return getForecastReasons();
			case ResourcesPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__DATE_CRITERION:
				return getDateCriterions();
			case ResourcesPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__DESCRIPTION:
				return getDescription();
			case ResourcesPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__SERIES:
				return getSeries();
			case ResourcesPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__DOSE_NUMBERX:
				return getDoseNumberx();
			case ResourcesPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__SERIES_DOSESX:
				return getSeriesDosesx();
			case ResourcesPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__SUPPORTING_IMMUNIZATION:
				return getSupportingImmunizations();
			case ResourcesPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__SUPPORTING_PATIENT_INFORMATION:
				return getSupportingPatientInformations();
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
			case ResourcesPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__VACCINE_CODE:
				getVaccineCodes().clear();
				getVaccineCodes().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case ResourcesPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__TARGET_DISEASE:
				setTargetDisease((CodeableConcept)newValue);
				return;
			case ResourcesPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__CONTRAINDICATED_VACCINE_CODE:
				getContraindicatedVaccineCodes().clear();
				getContraindicatedVaccineCodes().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case ResourcesPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__FORECAST_STATUS:
				setForecastStatus((CodeableConcept)newValue);
				return;
			case ResourcesPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__FORECAST_REASON:
				getForecastReasons().clear();
				getForecastReasons().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case ResourcesPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__DATE_CRITERION:
				getDateCriterions().clear();
				getDateCriterions().addAll((Collection<? extends ImmunizationRecommendationRecommendationDateCriterion>)newValue);
				return;
			case ResourcesPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__DESCRIPTION:
				setDescription((fhiRCore.dataTypes.String)newValue);
				return;
			case ResourcesPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__SERIES:
				setSeries((fhiRCore.dataTypes.String)newValue);
				return;
			case ResourcesPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__DOSE_NUMBERX:
				setDoseNumberx((DataType)newValue);
				return;
			case ResourcesPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__SERIES_DOSESX:
				setSeriesDosesx((DataType)newValue);
				return;
			case ResourcesPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__SUPPORTING_IMMUNIZATION:
				getSupportingImmunizations().clear();
				getSupportingImmunizations().addAll((Collection<? extends Reference>)newValue);
				return;
			case ResourcesPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__SUPPORTING_PATIENT_INFORMATION:
				getSupportingPatientInformations().clear();
				getSupportingPatientInformations().addAll((Collection<? extends Reference>)newValue);
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
			case ResourcesPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__VACCINE_CODE:
				getVaccineCodes().clear();
				return;
			case ResourcesPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__TARGET_DISEASE:
				setTargetDisease((CodeableConcept)null);
				return;
			case ResourcesPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__CONTRAINDICATED_VACCINE_CODE:
				getContraindicatedVaccineCodes().clear();
				return;
			case ResourcesPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__FORECAST_STATUS:
				setForecastStatus((CodeableConcept)null);
				return;
			case ResourcesPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__FORECAST_REASON:
				getForecastReasons().clear();
				return;
			case ResourcesPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__DATE_CRITERION:
				getDateCriterions().clear();
				return;
			case ResourcesPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__DESCRIPTION:
				setDescription((fhiRCore.dataTypes.String)null);
				return;
			case ResourcesPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__SERIES:
				setSeries((fhiRCore.dataTypes.String)null);
				return;
			case ResourcesPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__DOSE_NUMBERX:
				setDoseNumberx((DataType)null);
				return;
			case ResourcesPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__SERIES_DOSESX:
				setSeriesDosesx((DataType)null);
				return;
			case ResourcesPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__SUPPORTING_IMMUNIZATION:
				getSupportingImmunizations().clear();
				return;
			case ResourcesPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__SUPPORTING_PATIENT_INFORMATION:
				getSupportingPatientInformations().clear();
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
			case ResourcesPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__VACCINE_CODE:
				return vaccineCodes != null && !vaccineCodes.isEmpty();
			case ResourcesPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__TARGET_DISEASE:
				return targetDisease != null;
			case ResourcesPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__CONTRAINDICATED_VACCINE_CODE:
				return contraindicatedVaccineCodes != null && !contraindicatedVaccineCodes.isEmpty();
			case ResourcesPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__FORECAST_STATUS:
				return forecastStatus != null;
			case ResourcesPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__FORECAST_REASON:
				return forecastReasons != null && !forecastReasons.isEmpty();
			case ResourcesPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__DATE_CRITERION:
				return dateCriterions != null && !dateCriterions.isEmpty();
			case ResourcesPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__DESCRIPTION:
				return description != null;
			case ResourcesPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__SERIES:
				return series != null;
			case ResourcesPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__DOSE_NUMBERX:
				return doseNumberx != null;
			case ResourcesPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__SERIES_DOSESX:
				return seriesDosesx != null;
			case ResourcesPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__SUPPORTING_IMMUNIZATION:
				return supportingImmunizations != null && !supportingImmunizations.isEmpty();
			case ResourcesPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION__SUPPORTING_PATIENT_INFORMATION:
				return supportingPatientInformations != null && !supportingPatientInformations.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ImmunizationRecommendationRecommendationImpl
