/**
 */
package fhiRCore.dataTypes.impl;

import fhiRCore.dataTypes.CodeableConcept;
import fhiRCore.dataTypes.DataType;
import fhiRCore.dataTypes.DataTypesPackage;
import fhiRCore.dataTypes.Dosage;
import fhiRCore.dataTypes.DosageElement1;
import fhiRCore.dataTypes.Quantity;
import fhiRCore.dataTypes.Ratio;
import fhiRCore.dataTypes.Timing;

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
 * An implementation of the model object '<em><b>Dosage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.dataTypes.impl.DosageImpl#getSequence <em>Sequence</em>}</li>
 *   <li>{@link fhiRCore.dataTypes.impl.DosageImpl#getText <em>Text</em>}</li>
 *   <li>{@link fhiRCore.dataTypes.impl.DosageImpl#getAdditionalInstructions <em>Additional Instruction</em>}</li>
 *   <li>{@link fhiRCore.dataTypes.impl.DosageImpl#getPatientInstruction <em>Patient Instruction</em>}</li>
 *   <li>{@link fhiRCore.dataTypes.impl.DosageImpl#getTiming <em>Timing</em>}</li>
 *   <li>{@link fhiRCore.dataTypes.impl.DosageImpl#getAsNeededx <em>As Neededx</em>}</li>
 *   <li>{@link fhiRCore.dataTypes.impl.DosageImpl#getSite <em>Site</em>}</li>
 *   <li>{@link fhiRCore.dataTypes.impl.DosageImpl#getRoute <em>Route</em>}</li>
 *   <li>{@link fhiRCore.dataTypes.impl.DosageImpl#getMethod <em>Method</em>}</li>
 *   <li>{@link fhiRCore.dataTypes.impl.DosageImpl#getDoseAndRates <em>Dose And Rate</em>}</li>
 *   <li>{@link fhiRCore.dataTypes.impl.DosageImpl#getMaxDosePerPeriod <em>Max Dose Per Period</em>}</li>
 *   <li>{@link fhiRCore.dataTypes.impl.DosageImpl#getMaxDosePerAdministration <em>Max Dose Per Administration</em>}</li>
 *   <li>{@link fhiRCore.dataTypes.impl.DosageImpl#getMaxDosePerLifetime <em>Max Dose Per Lifetime</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DosageImpl extends BackboneElementImpl implements Dosage {
	/**
	 * The cached value of the '{@link #getSequence() <em>Sequence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequence()
	 * @generated
	 * @ordered
	 */
	protected fhiRCore.dataTypes.Integer sequence;

	/**
	 * The cached value of the '{@link #getText() <em>Text</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected fhiRCore.dataTypes.String text;

	/**
	 * The cached value of the '{@link #getAdditionalInstructions() <em>Additional Instruction</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditionalInstructions()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> additionalInstructions;

	/**
	 * The cached value of the '{@link #getPatientInstruction() <em>Patient Instruction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatientInstruction()
	 * @generated
	 * @ordered
	 */
	protected fhiRCore.dataTypes.String patientInstruction;

	/**
	 * The cached value of the '{@link #getTiming() <em>Timing</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTiming()
	 * @generated
	 * @ordered
	 */
	protected Timing timing;

	/**
	 * The cached value of the '{@link #getAsNeededx() <em>As Neededx</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAsNeededx()
	 * @generated
	 * @ordered
	 */
	protected DataType asNeededx;

	/**
	 * The cached value of the '{@link #getSite() <em>Site</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSite()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept site;

	/**
	 * The cached value of the '{@link #getRoute() <em>Route</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoute()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept route;

	/**
	 * The cached value of the '{@link #getMethod() <em>Method</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethod()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept method;

	/**
	 * The cached value of the '{@link #getDoseAndRates() <em>Dose And Rate</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDoseAndRates()
	 * @generated
	 * @ordered
	 */
	protected EList<DosageElement1> doseAndRates;

	/**
	 * The cached value of the '{@link #getMaxDosePerPeriod() <em>Max Dose Per Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxDosePerPeriod()
	 * @generated
	 * @ordered
	 */
	protected Ratio maxDosePerPeriod;

	/**
	 * The cached value of the '{@link #getMaxDosePerAdministration() <em>Max Dose Per Administration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxDosePerAdministration()
	 * @generated
	 * @ordered
	 */
	protected Quantity maxDosePerAdministration;

	/**
	 * The cached value of the '{@link #getMaxDosePerLifetime() <em>Max Dose Per Lifetime</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxDosePerLifetime()
	 * @generated
	 * @ordered
	 */
	protected Quantity maxDosePerLifetime;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DosageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataTypesPackage.Literals.DOSAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public fhiRCore.dataTypes.Integer getSequence() {
		return sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSequence(fhiRCore.dataTypes.Integer newSequence, NotificationChain msgs) {
		fhiRCore.dataTypes.Integer oldSequence = sequence;
		sequence = newSequence;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DataTypesPackage.DOSAGE__SEQUENCE, oldSequence, newSequence);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSequence(fhiRCore.dataTypes.Integer newSequence) {
		if (newSequence != sequence) {
			NotificationChain msgs = null;
			if (sequence != null)
				msgs = ((InternalEObject)sequence).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.DOSAGE__SEQUENCE, null, msgs);
			if (newSequence != null)
				msgs = ((InternalEObject)newSequence).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.DOSAGE__SEQUENCE, null, msgs);
			msgs = basicSetSequence(newSequence, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataTypesPackage.DOSAGE__SEQUENCE, newSequence, newSequence));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public fhiRCore.dataTypes.String getText() {
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetText(fhiRCore.dataTypes.String newText, NotificationChain msgs) {
		fhiRCore.dataTypes.String oldText = text;
		text = newText;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DataTypesPackage.DOSAGE__TEXT, oldText, newText);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setText(fhiRCore.dataTypes.String newText) {
		if (newText != text) {
			NotificationChain msgs = null;
			if (text != null)
				msgs = ((InternalEObject)text).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.DOSAGE__TEXT, null, msgs);
			if (newText != null)
				msgs = ((InternalEObject)newText).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.DOSAGE__TEXT, null, msgs);
			msgs = basicSetText(newText, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataTypesPackage.DOSAGE__TEXT, newText, newText));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getAdditionalInstructions() {
		if (additionalInstructions == null) {
			additionalInstructions = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, DataTypesPackage.DOSAGE__ADDITIONAL_INSTRUCTION);
		}
		return additionalInstructions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public fhiRCore.dataTypes.String getPatientInstruction() {
		return patientInstruction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPatientInstruction(fhiRCore.dataTypes.String newPatientInstruction, NotificationChain msgs) {
		fhiRCore.dataTypes.String oldPatientInstruction = patientInstruction;
		patientInstruction = newPatientInstruction;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DataTypesPackage.DOSAGE__PATIENT_INSTRUCTION, oldPatientInstruction, newPatientInstruction);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPatientInstruction(fhiRCore.dataTypes.String newPatientInstruction) {
		if (newPatientInstruction != patientInstruction) {
			NotificationChain msgs = null;
			if (patientInstruction != null)
				msgs = ((InternalEObject)patientInstruction).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.DOSAGE__PATIENT_INSTRUCTION, null, msgs);
			if (newPatientInstruction != null)
				msgs = ((InternalEObject)newPatientInstruction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.DOSAGE__PATIENT_INSTRUCTION, null, msgs);
			msgs = basicSetPatientInstruction(newPatientInstruction, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataTypesPackage.DOSAGE__PATIENT_INSTRUCTION, newPatientInstruction, newPatientInstruction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Timing getTiming() {
		return timing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTiming(Timing newTiming, NotificationChain msgs) {
		Timing oldTiming = timing;
		timing = newTiming;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DataTypesPackage.DOSAGE__TIMING, oldTiming, newTiming);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTiming(Timing newTiming) {
		if (newTiming != timing) {
			NotificationChain msgs = null;
			if (timing != null)
				msgs = ((InternalEObject)timing).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.DOSAGE__TIMING, null, msgs);
			if (newTiming != null)
				msgs = ((InternalEObject)newTiming).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.DOSAGE__TIMING, null, msgs);
			msgs = basicSetTiming(newTiming, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataTypesPackage.DOSAGE__TIMING, newTiming, newTiming));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType getAsNeededx() {
		return asNeededx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAsNeededx(DataType newAsNeededx, NotificationChain msgs) {
		DataType oldAsNeededx = asNeededx;
		asNeededx = newAsNeededx;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DataTypesPackage.DOSAGE__AS_NEEDEDX, oldAsNeededx, newAsNeededx);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAsNeededx(DataType newAsNeededx) {
		if (newAsNeededx != asNeededx) {
			NotificationChain msgs = null;
			if (asNeededx != null)
				msgs = ((InternalEObject)asNeededx).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.DOSAGE__AS_NEEDEDX, null, msgs);
			if (newAsNeededx != null)
				msgs = ((InternalEObject)newAsNeededx).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.DOSAGE__AS_NEEDEDX, null, msgs);
			msgs = basicSetAsNeededx(newAsNeededx, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataTypesPackage.DOSAGE__AS_NEEDEDX, newAsNeededx, newAsNeededx));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getSite() {
		return site;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSite(CodeableConcept newSite, NotificationChain msgs) {
		CodeableConcept oldSite = site;
		site = newSite;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DataTypesPackage.DOSAGE__SITE, oldSite, newSite);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSite(CodeableConcept newSite) {
		if (newSite != site) {
			NotificationChain msgs = null;
			if (site != null)
				msgs = ((InternalEObject)site).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.DOSAGE__SITE, null, msgs);
			if (newSite != null)
				msgs = ((InternalEObject)newSite).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.DOSAGE__SITE, null, msgs);
			msgs = basicSetSite(newSite, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataTypesPackage.DOSAGE__SITE, newSite, newSite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getRoute() {
		return route;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRoute(CodeableConcept newRoute, NotificationChain msgs) {
		CodeableConcept oldRoute = route;
		route = newRoute;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DataTypesPackage.DOSAGE__ROUTE, oldRoute, newRoute);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoute(CodeableConcept newRoute) {
		if (newRoute != route) {
			NotificationChain msgs = null;
			if (route != null)
				msgs = ((InternalEObject)route).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.DOSAGE__ROUTE, null, msgs);
			if (newRoute != null)
				msgs = ((InternalEObject)newRoute).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.DOSAGE__ROUTE, null, msgs);
			msgs = basicSetRoute(newRoute, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataTypesPackage.DOSAGE__ROUTE, newRoute, newRoute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getMethod() {
		return method;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMethod(CodeableConcept newMethod, NotificationChain msgs) {
		CodeableConcept oldMethod = method;
		method = newMethod;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DataTypesPackage.DOSAGE__METHOD, oldMethod, newMethod);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMethod(CodeableConcept newMethod) {
		if (newMethod != method) {
			NotificationChain msgs = null;
			if (method != null)
				msgs = ((InternalEObject)method).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.DOSAGE__METHOD, null, msgs);
			if (newMethod != null)
				msgs = ((InternalEObject)newMethod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.DOSAGE__METHOD, null, msgs);
			msgs = basicSetMethod(newMethod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataTypesPackage.DOSAGE__METHOD, newMethod, newMethod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DosageElement1> getDoseAndRates() {
		if (doseAndRates == null) {
			doseAndRates = new EObjectContainmentEList<DosageElement1>(DosageElement1.class, this, DataTypesPackage.DOSAGE__DOSE_AND_RATE);
		}
		return doseAndRates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ratio getMaxDosePerPeriod() {
		return maxDosePerPeriod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMaxDosePerPeriod(Ratio newMaxDosePerPeriod, NotificationChain msgs) {
		Ratio oldMaxDosePerPeriod = maxDosePerPeriod;
		maxDosePerPeriod = newMaxDosePerPeriod;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DataTypesPackage.DOSAGE__MAX_DOSE_PER_PERIOD, oldMaxDosePerPeriod, newMaxDosePerPeriod);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxDosePerPeriod(Ratio newMaxDosePerPeriod) {
		if (newMaxDosePerPeriod != maxDosePerPeriod) {
			NotificationChain msgs = null;
			if (maxDosePerPeriod != null)
				msgs = ((InternalEObject)maxDosePerPeriod).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.DOSAGE__MAX_DOSE_PER_PERIOD, null, msgs);
			if (newMaxDosePerPeriod != null)
				msgs = ((InternalEObject)newMaxDosePerPeriod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.DOSAGE__MAX_DOSE_PER_PERIOD, null, msgs);
			msgs = basicSetMaxDosePerPeriod(newMaxDosePerPeriod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataTypesPackage.DOSAGE__MAX_DOSE_PER_PERIOD, newMaxDosePerPeriod, newMaxDosePerPeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Quantity getMaxDosePerAdministration() {
		return maxDosePerAdministration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMaxDosePerAdministration(Quantity newMaxDosePerAdministration, NotificationChain msgs) {
		Quantity oldMaxDosePerAdministration = maxDosePerAdministration;
		maxDosePerAdministration = newMaxDosePerAdministration;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DataTypesPackage.DOSAGE__MAX_DOSE_PER_ADMINISTRATION, oldMaxDosePerAdministration, newMaxDosePerAdministration);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxDosePerAdministration(Quantity newMaxDosePerAdministration) {
		if (newMaxDosePerAdministration != maxDosePerAdministration) {
			NotificationChain msgs = null;
			if (maxDosePerAdministration != null)
				msgs = ((InternalEObject)maxDosePerAdministration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.DOSAGE__MAX_DOSE_PER_ADMINISTRATION, null, msgs);
			if (newMaxDosePerAdministration != null)
				msgs = ((InternalEObject)newMaxDosePerAdministration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.DOSAGE__MAX_DOSE_PER_ADMINISTRATION, null, msgs);
			msgs = basicSetMaxDosePerAdministration(newMaxDosePerAdministration, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataTypesPackage.DOSAGE__MAX_DOSE_PER_ADMINISTRATION, newMaxDosePerAdministration, newMaxDosePerAdministration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Quantity getMaxDosePerLifetime() {
		return maxDosePerLifetime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMaxDosePerLifetime(Quantity newMaxDosePerLifetime, NotificationChain msgs) {
		Quantity oldMaxDosePerLifetime = maxDosePerLifetime;
		maxDosePerLifetime = newMaxDosePerLifetime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DataTypesPackage.DOSAGE__MAX_DOSE_PER_LIFETIME, oldMaxDosePerLifetime, newMaxDosePerLifetime);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxDosePerLifetime(Quantity newMaxDosePerLifetime) {
		if (newMaxDosePerLifetime != maxDosePerLifetime) {
			NotificationChain msgs = null;
			if (maxDosePerLifetime != null)
				msgs = ((InternalEObject)maxDosePerLifetime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.DOSAGE__MAX_DOSE_PER_LIFETIME, null, msgs);
			if (newMaxDosePerLifetime != null)
				msgs = ((InternalEObject)newMaxDosePerLifetime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.DOSAGE__MAX_DOSE_PER_LIFETIME, null, msgs);
			msgs = basicSetMaxDosePerLifetime(newMaxDosePerLifetime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataTypesPackage.DOSAGE__MAX_DOSE_PER_LIFETIME, newMaxDosePerLifetime, newMaxDosePerLifetime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DataTypesPackage.DOSAGE__SEQUENCE:
				return basicSetSequence(null, msgs);
			case DataTypesPackage.DOSAGE__TEXT:
				return basicSetText(null, msgs);
			case DataTypesPackage.DOSAGE__ADDITIONAL_INSTRUCTION:
				return ((InternalEList<?>)getAdditionalInstructions()).basicRemove(otherEnd, msgs);
			case DataTypesPackage.DOSAGE__PATIENT_INSTRUCTION:
				return basicSetPatientInstruction(null, msgs);
			case DataTypesPackage.DOSAGE__TIMING:
				return basicSetTiming(null, msgs);
			case DataTypesPackage.DOSAGE__AS_NEEDEDX:
				return basicSetAsNeededx(null, msgs);
			case DataTypesPackage.DOSAGE__SITE:
				return basicSetSite(null, msgs);
			case DataTypesPackage.DOSAGE__ROUTE:
				return basicSetRoute(null, msgs);
			case DataTypesPackage.DOSAGE__METHOD:
				return basicSetMethod(null, msgs);
			case DataTypesPackage.DOSAGE__DOSE_AND_RATE:
				return ((InternalEList<?>)getDoseAndRates()).basicRemove(otherEnd, msgs);
			case DataTypesPackage.DOSAGE__MAX_DOSE_PER_PERIOD:
				return basicSetMaxDosePerPeriod(null, msgs);
			case DataTypesPackage.DOSAGE__MAX_DOSE_PER_ADMINISTRATION:
				return basicSetMaxDosePerAdministration(null, msgs);
			case DataTypesPackage.DOSAGE__MAX_DOSE_PER_LIFETIME:
				return basicSetMaxDosePerLifetime(null, msgs);
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
			case DataTypesPackage.DOSAGE__SEQUENCE:
				return getSequence();
			case DataTypesPackage.DOSAGE__TEXT:
				return getText();
			case DataTypesPackage.DOSAGE__ADDITIONAL_INSTRUCTION:
				return getAdditionalInstructions();
			case DataTypesPackage.DOSAGE__PATIENT_INSTRUCTION:
				return getPatientInstruction();
			case DataTypesPackage.DOSAGE__TIMING:
				return getTiming();
			case DataTypesPackage.DOSAGE__AS_NEEDEDX:
				return getAsNeededx();
			case DataTypesPackage.DOSAGE__SITE:
				return getSite();
			case DataTypesPackage.DOSAGE__ROUTE:
				return getRoute();
			case DataTypesPackage.DOSAGE__METHOD:
				return getMethod();
			case DataTypesPackage.DOSAGE__DOSE_AND_RATE:
				return getDoseAndRates();
			case DataTypesPackage.DOSAGE__MAX_DOSE_PER_PERIOD:
				return getMaxDosePerPeriod();
			case DataTypesPackage.DOSAGE__MAX_DOSE_PER_ADMINISTRATION:
				return getMaxDosePerAdministration();
			case DataTypesPackage.DOSAGE__MAX_DOSE_PER_LIFETIME:
				return getMaxDosePerLifetime();
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
			case DataTypesPackage.DOSAGE__SEQUENCE:
				setSequence((fhiRCore.dataTypes.Integer)newValue);
				return;
			case DataTypesPackage.DOSAGE__TEXT:
				setText((fhiRCore.dataTypes.String)newValue);
				return;
			case DataTypesPackage.DOSAGE__ADDITIONAL_INSTRUCTION:
				getAdditionalInstructions().clear();
				getAdditionalInstructions().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case DataTypesPackage.DOSAGE__PATIENT_INSTRUCTION:
				setPatientInstruction((fhiRCore.dataTypes.String)newValue);
				return;
			case DataTypesPackage.DOSAGE__TIMING:
				setTiming((Timing)newValue);
				return;
			case DataTypesPackage.DOSAGE__AS_NEEDEDX:
				setAsNeededx((DataType)newValue);
				return;
			case DataTypesPackage.DOSAGE__SITE:
				setSite((CodeableConcept)newValue);
				return;
			case DataTypesPackage.DOSAGE__ROUTE:
				setRoute((CodeableConcept)newValue);
				return;
			case DataTypesPackage.DOSAGE__METHOD:
				setMethod((CodeableConcept)newValue);
				return;
			case DataTypesPackage.DOSAGE__DOSE_AND_RATE:
				getDoseAndRates().clear();
				getDoseAndRates().addAll((Collection<? extends DosageElement1>)newValue);
				return;
			case DataTypesPackage.DOSAGE__MAX_DOSE_PER_PERIOD:
				setMaxDosePerPeriod((Ratio)newValue);
				return;
			case DataTypesPackage.DOSAGE__MAX_DOSE_PER_ADMINISTRATION:
				setMaxDosePerAdministration((Quantity)newValue);
				return;
			case DataTypesPackage.DOSAGE__MAX_DOSE_PER_LIFETIME:
				setMaxDosePerLifetime((Quantity)newValue);
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
			case DataTypesPackage.DOSAGE__SEQUENCE:
				setSequence((fhiRCore.dataTypes.Integer)null);
				return;
			case DataTypesPackage.DOSAGE__TEXT:
				setText((fhiRCore.dataTypes.String)null);
				return;
			case DataTypesPackage.DOSAGE__ADDITIONAL_INSTRUCTION:
				getAdditionalInstructions().clear();
				return;
			case DataTypesPackage.DOSAGE__PATIENT_INSTRUCTION:
				setPatientInstruction((fhiRCore.dataTypes.String)null);
				return;
			case DataTypesPackage.DOSAGE__TIMING:
				setTiming((Timing)null);
				return;
			case DataTypesPackage.DOSAGE__AS_NEEDEDX:
				setAsNeededx((DataType)null);
				return;
			case DataTypesPackage.DOSAGE__SITE:
				setSite((CodeableConcept)null);
				return;
			case DataTypesPackage.DOSAGE__ROUTE:
				setRoute((CodeableConcept)null);
				return;
			case DataTypesPackage.DOSAGE__METHOD:
				setMethod((CodeableConcept)null);
				return;
			case DataTypesPackage.DOSAGE__DOSE_AND_RATE:
				getDoseAndRates().clear();
				return;
			case DataTypesPackage.DOSAGE__MAX_DOSE_PER_PERIOD:
				setMaxDosePerPeriod((Ratio)null);
				return;
			case DataTypesPackage.DOSAGE__MAX_DOSE_PER_ADMINISTRATION:
				setMaxDosePerAdministration((Quantity)null);
				return;
			case DataTypesPackage.DOSAGE__MAX_DOSE_PER_LIFETIME:
				setMaxDosePerLifetime((Quantity)null);
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
			case DataTypesPackage.DOSAGE__SEQUENCE:
				return sequence != null;
			case DataTypesPackage.DOSAGE__TEXT:
				return text != null;
			case DataTypesPackage.DOSAGE__ADDITIONAL_INSTRUCTION:
				return additionalInstructions != null && !additionalInstructions.isEmpty();
			case DataTypesPackage.DOSAGE__PATIENT_INSTRUCTION:
				return patientInstruction != null;
			case DataTypesPackage.DOSAGE__TIMING:
				return timing != null;
			case DataTypesPackage.DOSAGE__AS_NEEDEDX:
				return asNeededx != null;
			case DataTypesPackage.DOSAGE__SITE:
				return site != null;
			case DataTypesPackage.DOSAGE__ROUTE:
				return route != null;
			case DataTypesPackage.DOSAGE__METHOD:
				return method != null;
			case DataTypesPackage.DOSAGE__DOSE_AND_RATE:
				return doseAndRates != null && !doseAndRates.isEmpty();
			case DataTypesPackage.DOSAGE__MAX_DOSE_PER_PERIOD:
				return maxDosePerPeriod != null;
			case DataTypesPackage.DOSAGE__MAX_DOSE_PER_ADMINISTRATION:
				return maxDosePerAdministration != null;
			case DataTypesPackage.DOSAGE__MAX_DOSE_PER_LIFETIME:
				return maxDosePerLifetime != null;
		}
		return super.eIsSet(featureID);
	}

} //DosageImpl
