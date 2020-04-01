/**
 */
package org.eclipse.mdht.hl7.fhir.resources.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.mdht.hl7.fhir.dataTypes.CodeableConcept;
import org.eclipse.mdht.hl7.fhir.dataTypes.Identifier;
import org.eclipse.mdht.hl7.fhir.dataTypes.Reference;

import org.eclipse.mdht.hl7.fhir.resources.MedicinalProductPharmaceutical;
import org.eclipse.mdht.hl7.fhir.resources.MedicinalProductPharmaceuticalCharacteristics;
import org.eclipse.mdht.hl7.fhir.resources.MedicinalProductPharmaceuticalRouteOfAdministration;
import org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Medicinal Product Pharmaceutical</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.MedicinalProductPharmaceuticalImpl#getIdentifiers <em>Identifier</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.MedicinalProductPharmaceuticalImpl#getSubjects <em>Subject</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.MedicinalProductPharmaceuticalImpl#getAdministrableDoseForm <em>Administrable Dose Form</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.MedicinalProductPharmaceuticalImpl#getUnitOfPresentation <em>Unit Of Presentation</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.MedicinalProductPharmaceuticalImpl#getIngredients <em>Ingredient</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.MedicinalProductPharmaceuticalImpl#getDevices <em>Device</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.MedicinalProductPharmaceuticalImpl#getCharacteristics <em>Characteristics</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.MedicinalProductPharmaceuticalImpl#getRouteOfAdministrations <em>Route Of Administration</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MedicinalProductPharmaceuticalImpl extends DomainResourceImpl implements MedicinalProductPharmaceutical {
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
	 * The cached value of the '{@link #getSubjects() <em>Subject</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubjects()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> subjects;

	/**
	 * The cached value of the '{@link #getAdministrableDoseForm() <em>Administrable Dose Form</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdministrableDoseForm()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept administrableDoseForm;

	/**
	 * The cached value of the '{@link #getUnitOfPresentation() <em>Unit Of Presentation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnitOfPresentation()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept unitOfPresentation;

	/**
	 * The cached value of the '{@link #getIngredients() <em>Ingredient</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIngredients()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> ingredients;

	/**
	 * The cached value of the '{@link #getDevices() <em>Device</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDevices()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> devices;

	/**
	 * The cached value of the '{@link #getCharacteristics() <em>Characteristics</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCharacteristics()
	 * @generated
	 * @ordered
	 */
	protected EList<MedicinalProductPharmaceuticalCharacteristics> characteristics;

	/**
	 * The cached value of the '{@link #getRouteOfAdministrations() <em>Route Of Administration</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRouteOfAdministrations()
	 * @generated
	 * @ordered
	 */
	protected EList<MedicinalProductPharmaceuticalRouteOfAdministration> routeOfAdministrations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MedicinalProductPharmaceuticalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getMedicinalProductPharmaceutical();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Identifier> getIdentifiers() {
		if (identifiers == null) {
			identifiers = new EObjectContainmentEList<Identifier>(Identifier.class, this, ResourcesPackage.MEDICINAL_PRODUCT_PHARMACEUTICAL__IDENTIFIER);
		}
		return identifiers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reference> getSubjects() {
		if (subjects == null) {
			subjects = new EObjectContainmentEList<Reference>(Reference.class, this, ResourcesPackage.MEDICINAL_PRODUCT_PHARMACEUTICAL__SUBJECT);
		}
		return subjects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getAdministrableDoseForm() {
		return administrableDoseForm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAdministrableDoseForm(CodeableConcept newAdministrableDoseForm, NotificationChain msgs) {
		CodeableConcept oldAdministrableDoseForm = administrableDoseForm;
		administrableDoseForm = newAdministrableDoseForm;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICINAL_PRODUCT_PHARMACEUTICAL__ADMINISTRABLE_DOSE_FORM, oldAdministrableDoseForm, newAdministrableDoseForm);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAdministrableDoseForm(CodeableConcept newAdministrableDoseForm) {
		if (newAdministrableDoseForm != administrableDoseForm) {
			NotificationChain msgs = null;
			if (administrableDoseForm != null)
				msgs = ((InternalEObject)administrableDoseForm).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICINAL_PRODUCT_PHARMACEUTICAL__ADMINISTRABLE_DOSE_FORM, null, msgs);
			if (newAdministrableDoseForm != null)
				msgs = ((InternalEObject)newAdministrableDoseForm).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICINAL_PRODUCT_PHARMACEUTICAL__ADMINISTRABLE_DOSE_FORM, null, msgs);
			msgs = basicSetAdministrableDoseForm(newAdministrableDoseForm, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICINAL_PRODUCT_PHARMACEUTICAL__ADMINISTRABLE_DOSE_FORM, newAdministrableDoseForm, newAdministrableDoseForm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getUnitOfPresentation() {
		return unitOfPresentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUnitOfPresentation(CodeableConcept newUnitOfPresentation, NotificationChain msgs) {
		CodeableConcept oldUnitOfPresentation = unitOfPresentation;
		unitOfPresentation = newUnitOfPresentation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICINAL_PRODUCT_PHARMACEUTICAL__UNIT_OF_PRESENTATION, oldUnitOfPresentation, newUnitOfPresentation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUnitOfPresentation(CodeableConcept newUnitOfPresentation) {
		if (newUnitOfPresentation != unitOfPresentation) {
			NotificationChain msgs = null;
			if (unitOfPresentation != null)
				msgs = ((InternalEObject)unitOfPresentation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICINAL_PRODUCT_PHARMACEUTICAL__UNIT_OF_PRESENTATION, null, msgs);
			if (newUnitOfPresentation != null)
				msgs = ((InternalEObject)newUnitOfPresentation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICINAL_PRODUCT_PHARMACEUTICAL__UNIT_OF_PRESENTATION, null, msgs);
			msgs = basicSetUnitOfPresentation(newUnitOfPresentation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICINAL_PRODUCT_PHARMACEUTICAL__UNIT_OF_PRESENTATION, newUnitOfPresentation, newUnitOfPresentation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reference> getIngredients() {
		if (ingredients == null) {
			ingredients = new EObjectContainmentEList<Reference>(Reference.class, this, ResourcesPackage.MEDICINAL_PRODUCT_PHARMACEUTICAL__INGREDIENT);
		}
		return ingredients;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reference> getDevices() {
		if (devices == null) {
			devices = new EObjectContainmentEList<Reference>(Reference.class, this, ResourcesPackage.MEDICINAL_PRODUCT_PHARMACEUTICAL__DEVICE);
		}
		return devices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MedicinalProductPharmaceuticalCharacteristics> getCharacteristics() {
		if (characteristics == null) {
			characteristics = new EObjectContainmentEList<MedicinalProductPharmaceuticalCharacteristics>(MedicinalProductPharmaceuticalCharacteristics.class, this, ResourcesPackage.MEDICINAL_PRODUCT_PHARMACEUTICAL__CHARACTERISTICS);
		}
		return characteristics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MedicinalProductPharmaceuticalRouteOfAdministration> getRouteOfAdministrations() {
		if (routeOfAdministrations == null) {
			routeOfAdministrations = new EObjectContainmentEList<MedicinalProductPharmaceuticalRouteOfAdministration>(MedicinalProductPharmaceuticalRouteOfAdministration.class, this, ResourcesPackage.MEDICINAL_PRODUCT_PHARMACEUTICAL__ROUTE_OF_ADMINISTRATION);
		}
		return routeOfAdministrations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.MEDICINAL_PRODUCT_PHARMACEUTICAL__IDENTIFIER:
				return ((InternalEList<?>)getIdentifiers()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.MEDICINAL_PRODUCT_PHARMACEUTICAL__SUBJECT:
				return ((InternalEList<?>)getSubjects()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.MEDICINAL_PRODUCT_PHARMACEUTICAL__ADMINISTRABLE_DOSE_FORM:
				return basicSetAdministrableDoseForm(null, msgs);
			case ResourcesPackage.MEDICINAL_PRODUCT_PHARMACEUTICAL__UNIT_OF_PRESENTATION:
				return basicSetUnitOfPresentation(null, msgs);
			case ResourcesPackage.MEDICINAL_PRODUCT_PHARMACEUTICAL__INGREDIENT:
				return ((InternalEList<?>)getIngredients()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.MEDICINAL_PRODUCT_PHARMACEUTICAL__DEVICE:
				return ((InternalEList<?>)getDevices()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.MEDICINAL_PRODUCT_PHARMACEUTICAL__CHARACTERISTICS:
				return ((InternalEList<?>)getCharacteristics()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.MEDICINAL_PRODUCT_PHARMACEUTICAL__ROUTE_OF_ADMINISTRATION:
				return ((InternalEList<?>)getRouteOfAdministrations()).basicRemove(otherEnd, msgs);
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
			case ResourcesPackage.MEDICINAL_PRODUCT_PHARMACEUTICAL__IDENTIFIER:
				return getIdentifiers();
			case ResourcesPackage.MEDICINAL_PRODUCT_PHARMACEUTICAL__SUBJECT:
				return getSubjects();
			case ResourcesPackage.MEDICINAL_PRODUCT_PHARMACEUTICAL__ADMINISTRABLE_DOSE_FORM:
				return getAdministrableDoseForm();
			case ResourcesPackage.MEDICINAL_PRODUCT_PHARMACEUTICAL__UNIT_OF_PRESENTATION:
				return getUnitOfPresentation();
			case ResourcesPackage.MEDICINAL_PRODUCT_PHARMACEUTICAL__INGREDIENT:
				return getIngredients();
			case ResourcesPackage.MEDICINAL_PRODUCT_PHARMACEUTICAL__DEVICE:
				return getDevices();
			case ResourcesPackage.MEDICINAL_PRODUCT_PHARMACEUTICAL__CHARACTERISTICS:
				return getCharacteristics();
			case ResourcesPackage.MEDICINAL_PRODUCT_PHARMACEUTICAL__ROUTE_OF_ADMINISTRATION:
				return getRouteOfAdministrations();
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
			case ResourcesPackage.MEDICINAL_PRODUCT_PHARMACEUTICAL__IDENTIFIER:
				getIdentifiers().clear();
				getIdentifiers().addAll((Collection<? extends Identifier>)newValue);
				return;
			case ResourcesPackage.MEDICINAL_PRODUCT_PHARMACEUTICAL__SUBJECT:
				getSubjects().clear();
				getSubjects().addAll((Collection<? extends Reference>)newValue);
				return;
			case ResourcesPackage.MEDICINAL_PRODUCT_PHARMACEUTICAL__ADMINISTRABLE_DOSE_FORM:
				setAdministrableDoseForm((CodeableConcept)newValue);
				return;
			case ResourcesPackage.MEDICINAL_PRODUCT_PHARMACEUTICAL__UNIT_OF_PRESENTATION:
				setUnitOfPresentation((CodeableConcept)newValue);
				return;
			case ResourcesPackage.MEDICINAL_PRODUCT_PHARMACEUTICAL__INGREDIENT:
				getIngredients().clear();
				getIngredients().addAll((Collection<? extends Reference>)newValue);
				return;
			case ResourcesPackage.MEDICINAL_PRODUCT_PHARMACEUTICAL__DEVICE:
				getDevices().clear();
				getDevices().addAll((Collection<? extends Reference>)newValue);
				return;
			case ResourcesPackage.MEDICINAL_PRODUCT_PHARMACEUTICAL__CHARACTERISTICS:
				getCharacteristics().clear();
				getCharacteristics().addAll((Collection<? extends MedicinalProductPharmaceuticalCharacteristics>)newValue);
				return;
			case ResourcesPackage.MEDICINAL_PRODUCT_PHARMACEUTICAL__ROUTE_OF_ADMINISTRATION:
				getRouteOfAdministrations().clear();
				getRouteOfAdministrations().addAll((Collection<? extends MedicinalProductPharmaceuticalRouteOfAdministration>)newValue);
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
			case ResourcesPackage.MEDICINAL_PRODUCT_PHARMACEUTICAL__IDENTIFIER:
				getIdentifiers().clear();
				return;
			case ResourcesPackage.MEDICINAL_PRODUCT_PHARMACEUTICAL__SUBJECT:
				getSubjects().clear();
				return;
			case ResourcesPackage.MEDICINAL_PRODUCT_PHARMACEUTICAL__ADMINISTRABLE_DOSE_FORM:
				setAdministrableDoseForm((CodeableConcept)null);
				return;
			case ResourcesPackage.MEDICINAL_PRODUCT_PHARMACEUTICAL__UNIT_OF_PRESENTATION:
				setUnitOfPresentation((CodeableConcept)null);
				return;
			case ResourcesPackage.MEDICINAL_PRODUCT_PHARMACEUTICAL__INGREDIENT:
				getIngredients().clear();
				return;
			case ResourcesPackage.MEDICINAL_PRODUCT_PHARMACEUTICAL__DEVICE:
				getDevices().clear();
				return;
			case ResourcesPackage.MEDICINAL_PRODUCT_PHARMACEUTICAL__CHARACTERISTICS:
				getCharacteristics().clear();
				return;
			case ResourcesPackage.MEDICINAL_PRODUCT_PHARMACEUTICAL__ROUTE_OF_ADMINISTRATION:
				getRouteOfAdministrations().clear();
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
			case ResourcesPackage.MEDICINAL_PRODUCT_PHARMACEUTICAL__IDENTIFIER:
				return identifiers != null && !identifiers.isEmpty();
			case ResourcesPackage.MEDICINAL_PRODUCT_PHARMACEUTICAL__SUBJECT:
				return subjects != null && !subjects.isEmpty();
			case ResourcesPackage.MEDICINAL_PRODUCT_PHARMACEUTICAL__ADMINISTRABLE_DOSE_FORM:
				return administrableDoseForm != null;
			case ResourcesPackage.MEDICINAL_PRODUCT_PHARMACEUTICAL__UNIT_OF_PRESENTATION:
				return unitOfPresentation != null;
			case ResourcesPackage.MEDICINAL_PRODUCT_PHARMACEUTICAL__INGREDIENT:
				return ingredients != null && !ingredients.isEmpty();
			case ResourcesPackage.MEDICINAL_PRODUCT_PHARMACEUTICAL__DEVICE:
				return devices != null && !devices.isEmpty();
			case ResourcesPackage.MEDICINAL_PRODUCT_PHARMACEUTICAL__CHARACTERISTICS:
				return characteristics != null && !characteristics.isEmpty();
			case ResourcesPackage.MEDICINAL_PRODUCT_PHARMACEUTICAL__ROUTE_OF_ADMINISTRATION:
				return routeOfAdministrations != null && !routeOfAdministrations.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MedicinalProductPharmaceuticalImpl
