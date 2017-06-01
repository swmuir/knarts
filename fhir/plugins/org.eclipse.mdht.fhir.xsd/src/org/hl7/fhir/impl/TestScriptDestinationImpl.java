/**
 */
package org.hl7.fhir.impl;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.hl7.fhir.Coding;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.TestScriptDestination;
import org.hl7.fhir.jaxb.IntegerImplAdapter;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Test Script Destination</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.TestScriptDestinationImpl#getIndex <em>Index</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.TestScriptDestinationImpl#getProfile <em>Profile</em>}</li>
 * </ul>
 *
 * @generated
 */
@XmlType(name = "TestScriptDestination", namespace = "http://hl7.org/fhir")
@XmlRootElement(name = "TestScriptDestination")
public class TestScriptDestinationImpl extends BackboneElementImpl implements TestScriptDestination {
	/**
	 * The cached value of the '{@link #getIndex() <em>Index</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndex()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Integer index;

	/**
	 * The cached value of the '{@link #getProfile() <em>Profile</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProfile()
	 * @generated
	 * @ordered
	 */
	protected Coding profile;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TestScriptDestinationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getTestScriptDestination();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlJavaTypeAdapter(IntegerImplAdapter.class)
	@XmlElement(required = true)
	public org.hl7.fhir.Integer getIndex() {
		return index;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIndex(org.hl7.fhir.Integer newIndex, NotificationChain msgs) {
		org.hl7.fhir.Integer oldIndex = index;
		index = newIndex;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.TEST_SCRIPT_DESTINATION__INDEX, oldIndex, newIndex);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIndex(org.hl7.fhir.Integer newIndex) {
		if (newIndex != index) {
			NotificationChain msgs = null;
			if (index != null)
				msgs = ((InternalEObject)index).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TEST_SCRIPT_DESTINATION__INDEX, null, msgs);
			if (newIndex != null)
				msgs = ((InternalEObject)newIndex).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TEST_SCRIPT_DESTINATION__INDEX, null, msgs);
			msgs = basicSetIndex(newIndex, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.TEST_SCRIPT_DESTINATION__INDEX, newIndex, newIndex));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlElement(required = true)
	public Coding getProfile() {
		return profile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProfile(Coding newProfile, NotificationChain msgs) {
		Coding oldProfile = profile;
		profile = newProfile;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.TEST_SCRIPT_DESTINATION__PROFILE, oldProfile, newProfile);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProfile(Coding newProfile) {
		if (newProfile != profile) {
			NotificationChain msgs = null;
			if (profile != null)
				msgs = ((InternalEObject)profile).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TEST_SCRIPT_DESTINATION__PROFILE, null, msgs);
			if (newProfile != null)
				msgs = ((InternalEObject)newProfile).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TEST_SCRIPT_DESTINATION__PROFILE, null, msgs);
			msgs = basicSetProfile(newProfile, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.TEST_SCRIPT_DESTINATION__PROFILE, newProfile, newProfile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.TEST_SCRIPT_DESTINATION__INDEX:
				return basicSetIndex(null, msgs);
			case FhirPackage.TEST_SCRIPT_DESTINATION__PROFILE:
				return basicSetProfile(null, msgs);
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
			case FhirPackage.TEST_SCRIPT_DESTINATION__INDEX:
				return getIndex();
			case FhirPackage.TEST_SCRIPT_DESTINATION__PROFILE:
				return getProfile();
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
			case FhirPackage.TEST_SCRIPT_DESTINATION__INDEX:
				setIndex((org.hl7.fhir.Integer)newValue);
				return;
			case FhirPackage.TEST_SCRIPT_DESTINATION__PROFILE:
				setProfile((Coding)newValue);
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
			case FhirPackage.TEST_SCRIPT_DESTINATION__INDEX:
				setIndex((org.hl7.fhir.Integer)null);
				return;
			case FhirPackage.TEST_SCRIPT_DESTINATION__PROFILE:
				setProfile((Coding)null);
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
			case FhirPackage.TEST_SCRIPT_DESTINATION__INDEX:
				return index != null;
			case FhirPackage.TEST_SCRIPT_DESTINATION__PROFILE:
				return profile != null;
		}
		return super.eIsSet(featureID);
	}

} //TestScriptDestinationImpl
