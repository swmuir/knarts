/**
 */
package fhiRCore.dataTypes.impl;

import fhiRCore.dataTypes.CodeableConcept;
import fhiRCore.dataTypes.DataType;
import fhiRCore.dataTypes.DataTypesPackage;
import fhiRCore.dataTypes.Population;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Population</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.dataTypes.impl.PopulationImpl#getAgex <em>Agex</em>}</li>
 *   <li>{@link fhiRCore.dataTypes.impl.PopulationImpl#getGender <em>Gender</em>}</li>
 *   <li>{@link fhiRCore.dataTypes.impl.PopulationImpl#getRace <em>Race</em>}</li>
 *   <li>{@link fhiRCore.dataTypes.impl.PopulationImpl#getPhysiologicalCondition <em>Physiological Condition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PopulationImpl extends BackboneElementImpl implements Population {
	/**
	 * The cached value of the '{@link #getAgex() <em>Agex</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAgex()
	 * @generated
	 * @ordered
	 */
	protected DataType agex;

	/**
	 * The cached value of the '{@link #getGender() <em>Gender</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGender()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept gender;

	/**
	 * The cached value of the '{@link #getRace() <em>Race</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRace()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept race;

	/**
	 * The cached value of the '{@link #getPhysiologicalCondition() <em>Physiological Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhysiologicalCondition()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept physiologicalCondition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PopulationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataTypesPackage.Literals.POPULATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType getAgex() {
		return agex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAgex(DataType newAgex, NotificationChain msgs) {
		DataType oldAgex = agex;
		agex = newAgex;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DataTypesPackage.POPULATION__AGEX, oldAgex, newAgex);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAgex(DataType newAgex) {
		if (newAgex != agex) {
			NotificationChain msgs = null;
			if (agex != null)
				msgs = ((InternalEObject)agex).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.POPULATION__AGEX, null, msgs);
			if (newAgex != null)
				msgs = ((InternalEObject)newAgex).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.POPULATION__AGEX, null, msgs);
			msgs = basicSetAgex(newAgex, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataTypesPackage.POPULATION__AGEX, newAgex, newAgex));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getGender() {
		return gender;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGender(CodeableConcept newGender, NotificationChain msgs) {
		CodeableConcept oldGender = gender;
		gender = newGender;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DataTypesPackage.POPULATION__GENDER, oldGender, newGender);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGender(CodeableConcept newGender) {
		if (newGender != gender) {
			NotificationChain msgs = null;
			if (gender != null)
				msgs = ((InternalEObject)gender).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.POPULATION__GENDER, null, msgs);
			if (newGender != null)
				msgs = ((InternalEObject)newGender).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.POPULATION__GENDER, null, msgs);
			msgs = basicSetGender(newGender, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataTypesPackage.POPULATION__GENDER, newGender, newGender));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getRace() {
		return race;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRace(CodeableConcept newRace, NotificationChain msgs) {
		CodeableConcept oldRace = race;
		race = newRace;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DataTypesPackage.POPULATION__RACE, oldRace, newRace);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRace(CodeableConcept newRace) {
		if (newRace != race) {
			NotificationChain msgs = null;
			if (race != null)
				msgs = ((InternalEObject)race).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.POPULATION__RACE, null, msgs);
			if (newRace != null)
				msgs = ((InternalEObject)newRace).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.POPULATION__RACE, null, msgs);
			msgs = basicSetRace(newRace, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataTypesPackage.POPULATION__RACE, newRace, newRace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getPhysiologicalCondition() {
		return physiologicalCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPhysiologicalCondition(CodeableConcept newPhysiologicalCondition, NotificationChain msgs) {
		CodeableConcept oldPhysiologicalCondition = physiologicalCondition;
		physiologicalCondition = newPhysiologicalCondition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DataTypesPackage.POPULATION__PHYSIOLOGICAL_CONDITION, oldPhysiologicalCondition, newPhysiologicalCondition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhysiologicalCondition(CodeableConcept newPhysiologicalCondition) {
		if (newPhysiologicalCondition != physiologicalCondition) {
			NotificationChain msgs = null;
			if (physiologicalCondition != null)
				msgs = ((InternalEObject)physiologicalCondition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.POPULATION__PHYSIOLOGICAL_CONDITION, null, msgs);
			if (newPhysiologicalCondition != null)
				msgs = ((InternalEObject)newPhysiologicalCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.POPULATION__PHYSIOLOGICAL_CONDITION, null, msgs);
			msgs = basicSetPhysiologicalCondition(newPhysiologicalCondition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataTypesPackage.POPULATION__PHYSIOLOGICAL_CONDITION, newPhysiologicalCondition, newPhysiologicalCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DataTypesPackage.POPULATION__AGEX:
				return basicSetAgex(null, msgs);
			case DataTypesPackage.POPULATION__GENDER:
				return basicSetGender(null, msgs);
			case DataTypesPackage.POPULATION__RACE:
				return basicSetRace(null, msgs);
			case DataTypesPackage.POPULATION__PHYSIOLOGICAL_CONDITION:
				return basicSetPhysiologicalCondition(null, msgs);
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
			case DataTypesPackage.POPULATION__AGEX:
				return getAgex();
			case DataTypesPackage.POPULATION__GENDER:
				return getGender();
			case DataTypesPackage.POPULATION__RACE:
				return getRace();
			case DataTypesPackage.POPULATION__PHYSIOLOGICAL_CONDITION:
				return getPhysiologicalCondition();
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
			case DataTypesPackage.POPULATION__AGEX:
				setAgex((DataType)newValue);
				return;
			case DataTypesPackage.POPULATION__GENDER:
				setGender((CodeableConcept)newValue);
				return;
			case DataTypesPackage.POPULATION__RACE:
				setRace((CodeableConcept)newValue);
				return;
			case DataTypesPackage.POPULATION__PHYSIOLOGICAL_CONDITION:
				setPhysiologicalCondition((CodeableConcept)newValue);
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
			case DataTypesPackage.POPULATION__AGEX:
				setAgex((DataType)null);
				return;
			case DataTypesPackage.POPULATION__GENDER:
				setGender((CodeableConcept)null);
				return;
			case DataTypesPackage.POPULATION__RACE:
				setRace((CodeableConcept)null);
				return;
			case DataTypesPackage.POPULATION__PHYSIOLOGICAL_CONDITION:
				setPhysiologicalCondition((CodeableConcept)null);
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
			case DataTypesPackage.POPULATION__AGEX:
				return agex != null;
			case DataTypesPackage.POPULATION__GENDER:
				return gender != null;
			case DataTypesPackage.POPULATION__RACE:
				return race != null;
			case DataTypesPackage.POPULATION__PHYSIOLOGICAL_CONDITION:
				return physiologicalCondition != null;
		}
		return super.eIsSet(featureID);
	}

} //PopulationImpl
