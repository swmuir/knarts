/**
 */
package fhiRCore.resources.impl;

import fhiRCore.dataTypes.Code;
import fhiRCore.dataTypes.CodeableConcept;
import fhiRCore.dataTypes.Coding;
import fhiRCore.dataTypes.Period;

import fhiRCore.dataTypes.impl.BackboneElementImpl;

import fhiRCore.resources.Consentprovision;
import fhiRCore.resources.ConsentprovisionprovisionActor;
import fhiRCore.resources.ConsentprovisionprovisionData;
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
 * An implementation of the model object '<em><b>Consentprovision</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.impl.ConsentprovisionImpl#getType <em>Type</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ConsentprovisionImpl#getPeriod <em>Period</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ConsentprovisionImpl#getActors <em>Actor</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ConsentprovisionImpl#getActions <em>Action</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ConsentprovisionImpl#getSecurityLabels <em>Security Label</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ConsentprovisionImpl#getPurposes <em>Purpose</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ConsentprovisionImpl#getClasses <em>Class</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ConsentprovisionImpl#getCodes <em>Code</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ConsentprovisionImpl#getDataPeriod <em>Data Period</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ConsentprovisionImpl#getData <em>Data</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ConsentprovisionImpl#getProvisions <em>Provision</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConsentprovisionImpl extends BackboneElementImpl implements Consentprovision {
	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected Code type;

	/**
	 * The cached value of the '{@link #getPeriod() <em>Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeriod()
	 * @generated
	 * @ordered
	 */
	protected Period period;

	/**
	 * The cached value of the '{@link #getActors() <em>Actor</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActors()
	 * @generated
	 * @ordered
	 */
	protected EList<ConsentprovisionprovisionActor> actors;

	/**
	 * The cached value of the '{@link #getActions() <em>Action</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActions()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> actions;

	/**
	 * The cached value of the '{@link #getSecurityLabels() <em>Security Label</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurityLabels()
	 * @generated
	 * @ordered
	 */
	protected EList<Coding> securityLabels;

	/**
	 * The cached value of the '{@link #getPurposes() <em>Purpose</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPurposes()
	 * @generated
	 * @ordered
	 */
	protected EList<Coding> purposes;

	/**
	 * The cached value of the '{@link #getClasses() <em>Class</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClasses()
	 * @generated
	 * @ordered
	 */
	protected EList<Coding> classes;

	/**
	 * The cached value of the '{@link #getCodes() <em>Code</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodes()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> codes;

	/**
	 * The cached value of the '{@link #getDataPeriod() <em>Data Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataPeriod()
	 * @generated
	 * @ordered
	 */
	protected Period dataPeriod;

	/**
	 * The cached value of the '{@link #getData() <em>Data</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getData()
	 * @generated
	 * @ordered
	 */
	protected EList<ConsentprovisionprovisionData> data;

	/**
	 * The cached value of the '{@link #getProvisions() <em>Provision</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvisions()
	 * @generated
	 * @ordered
	 */
	protected EList<Consentprovision> provisions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConsentprovisionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getConsentprovision();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetType(Code newType, NotificationChain msgs) {
		Code oldType = type;
		type = newType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.CONSENTPROVISION__TYPE, oldType, newType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(Code newType) {
		if (newType != type) {
			NotificationChain msgs = null;
			if (type != null)
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CONSENTPROVISION__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CONSENTPROVISION__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CONSENTPROVISION__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Period getPeriod() {
		return period;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPeriod(Period newPeriod, NotificationChain msgs) {
		Period oldPeriod = period;
		period = newPeriod;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.CONSENTPROVISION__PERIOD, oldPeriod, newPeriod);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPeriod(Period newPeriod) {
		if (newPeriod != period) {
			NotificationChain msgs = null;
			if (period != null)
				msgs = ((InternalEObject)period).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CONSENTPROVISION__PERIOD, null, msgs);
			if (newPeriod != null)
				msgs = ((InternalEObject)newPeriod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CONSENTPROVISION__PERIOD, null, msgs);
			msgs = basicSetPeriod(newPeriod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CONSENTPROVISION__PERIOD, newPeriod, newPeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConsentprovisionprovisionActor> getActors() {
		if (actors == null) {
			actors = new EObjectContainmentEList<ConsentprovisionprovisionActor>(ConsentprovisionprovisionActor.class, this, ResourcesPackage.CONSENTPROVISION__ACTOR);
		}
		return actors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getActions() {
		if (actions == null) {
			actions = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, ResourcesPackage.CONSENTPROVISION__ACTION);
		}
		return actions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Coding> getSecurityLabels() {
		if (securityLabels == null) {
			securityLabels = new EObjectContainmentEList<Coding>(Coding.class, this, ResourcesPackage.CONSENTPROVISION__SECURITY_LABEL);
		}
		return securityLabels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Coding> getPurposes() {
		if (purposes == null) {
			purposes = new EObjectContainmentEList<Coding>(Coding.class, this, ResourcesPackage.CONSENTPROVISION__PURPOSE);
		}
		return purposes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Coding> getClasses() {
		if (classes == null) {
			classes = new EObjectContainmentEList<Coding>(Coding.class, this, ResourcesPackage.CONSENTPROVISION__CLASS);
		}
		return classes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getCodes() {
		if (codes == null) {
			codes = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, ResourcesPackage.CONSENTPROVISION__CODE);
		}
		return codes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Period getDataPeriod() {
		return dataPeriod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataPeriod(Period newDataPeriod, NotificationChain msgs) {
		Period oldDataPeriod = dataPeriod;
		dataPeriod = newDataPeriod;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.CONSENTPROVISION__DATA_PERIOD, oldDataPeriod, newDataPeriod);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataPeriod(Period newDataPeriod) {
		if (newDataPeriod != dataPeriod) {
			NotificationChain msgs = null;
			if (dataPeriod != null)
				msgs = ((InternalEObject)dataPeriod).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CONSENTPROVISION__DATA_PERIOD, null, msgs);
			if (newDataPeriod != null)
				msgs = ((InternalEObject)newDataPeriod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CONSENTPROVISION__DATA_PERIOD, null, msgs);
			msgs = basicSetDataPeriod(newDataPeriod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CONSENTPROVISION__DATA_PERIOD, newDataPeriod, newDataPeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConsentprovisionprovisionData> getData() {
		if (data == null) {
			data = new EObjectContainmentEList<ConsentprovisionprovisionData>(ConsentprovisionprovisionData.class, this, ResourcesPackage.CONSENTPROVISION__DATA);
		}
		return data;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Consentprovision> getProvisions() {
		if (provisions == null) {
			provisions = new EObjectContainmentEList<Consentprovision>(Consentprovision.class, this, ResourcesPackage.CONSENTPROVISION__PROVISION);
		}
		return provisions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.CONSENTPROVISION__TYPE:
				return basicSetType(null, msgs);
			case ResourcesPackage.CONSENTPROVISION__PERIOD:
				return basicSetPeriod(null, msgs);
			case ResourcesPackage.CONSENTPROVISION__ACTOR:
				return ((InternalEList<?>)getActors()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.CONSENTPROVISION__ACTION:
				return ((InternalEList<?>)getActions()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.CONSENTPROVISION__SECURITY_LABEL:
				return ((InternalEList<?>)getSecurityLabels()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.CONSENTPROVISION__PURPOSE:
				return ((InternalEList<?>)getPurposes()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.CONSENTPROVISION__CLASS:
				return ((InternalEList<?>)getClasses()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.CONSENTPROVISION__CODE:
				return ((InternalEList<?>)getCodes()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.CONSENTPROVISION__DATA_PERIOD:
				return basicSetDataPeriod(null, msgs);
			case ResourcesPackage.CONSENTPROVISION__DATA:
				return ((InternalEList<?>)getData()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.CONSENTPROVISION__PROVISION:
				return ((InternalEList<?>)getProvisions()).basicRemove(otherEnd, msgs);
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
			case ResourcesPackage.CONSENTPROVISION__TYPE:
				return getType();
			case ResourcesPackage.CONSENTPROVISION__PERIOD:
				return getPeriod();
			case ResourcesPackage.CONSENTPROVISION__ACTOR:
				return getActors();
			case ResourcesPackage.CONSENTPROVISION__ACTION:
				return getActions();
			case ResourcesPackage.CONSENTPROVISION__SECURITY_LABEL:
				return getSecurityLabels();
			case ResourcesPackage.CONSENTPROVISION__PURPOSE:
				return getPurposes();
			case ResourcesPackage.CONSENTPROVISION__CLASS:
				return getClasses();
			case ResourcesPackage.CONSENTPROVISION__CODE:
				return getCodes();
			case ResourcesPackage.CONSENTPROVISION__DATA_PERIOD:
				return getDataPeriod();
			case ResourcesPackage.CONSENTPROVISION__DATA:
				return getData();
			case ResourcesPackage.CONSENTPROVISION__PROVISION:
				return getProvisions();
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
			case ResourcesPackage.CONSENTPROVISION__TYPE:
				setType((Code)newValue);
				return;
			case ResourcesPackage.CONSENTPROVISION__PERIOD:
				setPeriod((Period)newValue);
				return;
			case ResourcesPackage.CONSENTPROVISION__ACTOR:
				getActors().clear();
				getActors().addAll((Collection<? extends ConsentprovisionprovisionActor>)newValue);
				return;
			case ResourcesPackage.CONSENTPROVISION__ACTION:
				getActions().clear();
				getActions().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case ResourcesPackage.CONSENTPROVISION__SECURITY_LABEL:
				getSecurityLabels().clear();
				getSecurityLabels().addAll((Collection<? extends Coding>)newValue);
				return;
			case ResourcesPackage.CONSENTPROVISION__PURPOSE:
				getPurposes().clear();
				getPurposes().addAll((Collection<? extends Coding>)newValue);
				return;
			case ResourcesPackage.CONSENTPROVISION__CLASS:
				getClasses().clear();
				getClasses().addAll((Collection<? extends Coding>)newValue);
				return;
			case ResourcesPackage.CONSENTPROVISION__CODE:
				getCodes().clear();
				getCodes().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case ResourcesPackage.CONSENTPROVISION__DATA_PERIOD:
				setDataPeriod((Period)newValue);
				return;
			case ResourcesPackage.CONSENTPROVISION__DATA:
				getData().clear();
				getData().addAll((Collection<? extends ConsentprovisionprovisionData>)newValue);
				return;
			case ResourcesPackage.CONSENTPROVISION__PROVISION:
				getProvisions().clear();
				getProvisions().addAll((Collection<? extends Consentprovision>)newValue);
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
			case ResourcesPackage.CONSENTPROVISION__TYPE:
				setType((Code)null);
				return;
			case ResourcesPackage.CONSENTPROVISION__PERIOD:
				setPeriod((Period)null);
				return;
			case ResourcesPackage.CONSENTPROVISION__ACTOR:
				getActors().clear();
				return;
			case ResourcesPackage.CONSENTPROVISION__ACTION:
				getActions().clear();
				return;
			case ResourcesPackage.CONSENTPROVISION__SECURITY_LABEL:
				getSecurityLabels().clear();
				return;
			case ResourcesPackage.CONSENTPROVISION__PURPOSE:
				getPurposes().clear();
				return;
			case ResourcesPackage.CONSENTPROVISION__CLASS:
				getClasses().clear();
				return;
			case ResourcesPackage.CONSENTPROVISION__CODE:
				getCodes().clear();
				return;
			case ResourcesPackage.CONSENTPROVISION__DATA_PERIOD:
				setDataPeriod((Period)null);
				return;
			case ResourcesPackage.CONSENTPROVISION__DATA:
				getData().clear();
				return;
			case ResourcesPackage.CONSENTPROVISION__PROVISION:
				getProvisions().clear();
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
			case ResourcesPackage.CONSENTPROVISION__TYPE:
				return type != null;
			case ResourcesPackage.CONSENTPROVISION__PERIOD:
				return period != null;
			case ResourcesPackage.CONSENTPROVISION__ACTOR:
				return actors != null && !actors.isEmpty();
			case ResourcesPackage.CONSENTPROVISION__ACTION:
				return actions != null && !actions.isEmpty();
			case ResourcesPackage.CONSENTPROVISION__SECURITY_LABEL:
				return securityLabels != null && !securityLabels.isEmpty();
			case ResourcesPackage.CONSENTPROVISION__PURPOSE:
				return purposes != null && !purposes.isEmpty();
			case ResourcesPackage.CONSENTPROVISION__CLASS:
				return classes != null && !classes.isEmpty();
			case ResourcesPackage.CONSENTPROVISION__CODE:
				return codes != null && !codes.isEmpty();
			case ResourcesPackage.CONSENTPROVISION__DATA_PERIOD:
				return dataPeriod != null;
			case ResourcesPackage.CONSENTPROVISION__DATA:
				return data != null && !data.isEmpty();
			case ResourcesPackage.CONSENTPROVISION__PROVISION:
				return provisions != null && !provisions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ConsentprovisionImpl
