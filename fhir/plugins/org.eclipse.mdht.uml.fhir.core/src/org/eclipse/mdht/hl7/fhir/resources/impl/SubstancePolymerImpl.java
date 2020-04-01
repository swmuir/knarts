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

import org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage;
import org.eclipse.mdht.hl7.fhir.resources.SubstancePolymer;
import org.eclipse.mdht.hl7.fhir.resources.SubstancePolymerMonomerSet;
import org.eclipse.mdht.hl7.fhir.resources.SubstancePolymerRepeat;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Substance Polymer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.SubstancePolymerImpl#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.SubstancePolymerImpl#getGeometry <em>Geometry</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.SubstancePolymerImpl#getCopolymerConnectivities <em>Copolymer Connectivity</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.SubstancePolymerImpl#getModifications <em>Modification</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.SubstancePolymerImpl#getMonomerSets <em>Monomer Set</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.SubstancePolymerImpl#getRepeats <em>Repeat</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubstancePolymerImpl extends DomainResourceImpl implements SubstancePolymer {
	/**
	 * The cached value of the '{@link #getClass_() <em>Class</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClass_()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept class_;

	/**
	 * The cached value of the '{@link #getGeometry() <em>Geometry</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeometry()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept geometry;

	/**
	 * The cached value of the '{@link #getCopolymerConnectivities() <em>Copolymer Connectivity</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCopolymerConnectivities()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> copolymerConnectivities;

	/**
	 * The cached value of the '{@link #getModifications() <em>Modification</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModifications()
	 * @generated
	 * @ordered
	 */
	protected EList<org.eclipse.mdht.hl7.fhir.dataTypes.String> modifications;

	/**
	 * The cached value of the '{@link #getMonomerSets() <em>Monomer Set</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMonomerSets()
	 * @generated
	 * @ordered
	 */
	protected EList<SubstancePolymerMonomerSet> monomerSets;

	/**
	 * The cached value of the '{@link #getRepeats() <em>Repeat</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepeats()
	 * @generated
	 * @ordered
	 */
	protected EList<SubstancePolymerRepeat> repeats;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubstancePolymerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getSubstancePolymer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getClass_() {
		return class_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClass_(CodeableConcept newClass, NotificationChain msgs) {
		CodeableConcept oldClass = class_;
		class_ = newClass;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.SUBSTANCE_POLYMER__CLASS, oldClass, newClass);
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
	public void setClass_(CodeableConcept newClass) {
		if (newClass != class_) {
			NotificationChain msgs = null;
			if (class_ != null)
				msgs = ((InternalEObject)class_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SUBSTANCE_POLYMER__CLASS, null, msgs);
			if (newClass != null)
				msgs = ((InternalEObject)newClass).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SUBSTANCE_POLYMER__CLASS, null, msgs);
			msgs = basicSetClass_(newClass, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.SUBSTANCE_POLYMER__CLASS, newClass, newClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getGeometry() {
		return geometry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGeometry(CodeableConcept newGeometry, NotificationChain msgs) {
		CodeableConcept oldGeometry = geometry;
		geometry = newGeometry;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.SUBSTANCE_POLYMER__GEOMETRY, oldGeometry, newGeometry);
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
	public void setGeometry(CodeableConcept newGeometry) {
		if (newGeometry != geometry) {
			NotificationChain msgs = null;
			if (geometry != null)
				msgs = ((InternalEObject)geometry).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SUBSTANCE_POLYMER__GEOMETRY, null, msgs);
			if (newGeometry != null)
				msgs = ((InternalEObject)newGeometry).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SUBSTANCE_POLYMER__GEOMETRY, null, msgs);
			msgs = basicSetGeometry(newGeometry, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.SUBSTANCE_POLYMER__GEOMETRY, newGeometry, newGeometry));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableConcept> getCopolymerConnectivities() {
		if (copolymerConnectivities == null) {
			copolymerConnectivities = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, ResourcesPackage.SUBSTANCE_POLYMER__COPOLYMER_CONNECTIVITY);
		}
		return copolymerConnectivities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<org.eclipse.mdht.hl7.fhir.dataTypes.String> getModifications() {
		if (modifications == null) {
			modifications = new EObjectContainmentEList<org.eclipse.mdht.hl7.fhir.dataTypes.String>(org.eclipse.mdht.hl7.fhir.dataTypes.String.class, this, ResourcesPackage.SUBSTANCE_POLYMER__MODIFICATION);
		}
		return modifications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SubstancePolymerMonomerSet> getMonomerSets() {
		if (monomerSets == null) {
			monomerSets = new EObjectContainmentEList<SubstancePolymerMonomerSet>(SubstancePolymerMonomerSet.class, this, ResourcesPackage.SUBSTANCE_POLYMER__MONOMER_SET);
		}
		return monomerSets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SubstancePolymerRepeat> getRepeats() {
		if (repeats == null) {
			repeats = new EObjectContainmentEList<SubstancePolymerRepeat>(SubstancePolymerRepeat.class, this, ResourcesPackage.SUBSTANCE_POLYMER__REPEAT);
		}
		return repeats;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.SUBSTANCE_POLYMER__CLASS:
				return basicSetClass_(null, msgs);
			case ResourcesPackage.SUBSTANCE_POLYMER__GEOMETRY:
				return basicSetGeometry(null, msgs);
			case ResourcesPackage.SUBSTANCE_POLYMER__COPOLYMER_CONNECTIVITY:
				return ((InternalEList<?>)getCopolymerConnectivities()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.SUBSTANCE_POLYMER__MODIFICATION:
				return ((InternalEList<?>)getModifications()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.SUBSTANCE_POLYMER__MONOMER_SET:
				return ((InternalEList<?>)getMonomerSets()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.SUBSTANCE_POLYMER__REPEAT:
				return ((InternalEList<?>)getRepeats()).basicRemove(otherEnd, msgs);
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
			case ResourcesPackage.SUBSTANCE_POLYMER__CLASS:
				return getClass_();
			case ResourcesPackage.SUBSTANCE_POLYMER__GEOMETRY:
				return getGeometry();
			case ResourcesPackage.SUBSTANCE_POLYMER__COPOLYMER_CONNECTIVITY:
				return getCopolymerConnectivities();
			case ResourcesPackage.SUBSTANCE_POLYMER__MODIFICATION:
				return getModifications();
			case ResourcesPackage.SUBSTANCE_POLYMER__MONOMER_SET:
				return getMonomerSets();
			case ResourcesPackage.SUBSTANCE_POLYMER__REPEAT:
				return getRepeats();
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
			case ResourcesPackage.SUBSTANCE_POLYMER__CLASS:
				setClass_((CodeableConcept)newValue);
				return;
			case ResourcesPackage.SUBSTANCE_POLYMER__GEOMETRY:
				setGeometry((CodeableConcept)newValue);
				return;
			case ResourcesPackage.SUBSTANCE_POLYMER__COPOLYMER_CONNECTIVITY:
				getCopolymerConnectivities().clear();
				getCopolymerConnectivities().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case ResourcesPackage.SUBSTANCE_POLYMER__MODIFICATION:
				getModifications().clear();
				getModifications().addAll((Collection<? extends org.eclipse.mdht.hl7.fhir.dataTypes.String>)newValue);
				return;
			case ResourcesPackage.SUBSTANCE_POLYMER__MONOMER_SET:
				getMonomerSets().clear();
				getMonomerSets().addAll((Collection<? extends SubstancePolymerMonomerSet>)newValue);
				return;
			case ResourcesPackage.SUBSTANCE_POLYMER__REPEAT:
				getRepeats().clear();
				getRepeats().addAll((Collection<? extends SubstancePolymerRepeat>)newValue);
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
			case ResourcesPackage.SUBSTANCE_POLYMER__CLASS:
				setClass_((CodeableConcept)null);
				return;
			case ResourcesPackage.SUBSTANCE_POLYMER__GEOMETRY:
				setGeometry((CodeableConcept)null);
				return;
			case ResourcesPackage.SUBSTANCE_POLYMER__COPOLYMER_CONNECTIVITY:
				getCopolymerConnectivities().clear();
				return;
			case ResourcesPackage.SUBSTANCE_POLYMER__MODIFICATION:
				getModifications().clear();
				return;
			case ResourcesPackage.SUBSTANCE_POLYMER__MONOMER_SET:
				getMonomerSets().clear();
				return;
			case ResourcesPackage.SUBSTANCE_POLYMER__REPEAT:
				getRepeats().clear();
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
			case ResourcesPackage.SUBSTANCE_POLYMER__CLASS:
				return class_ != null;
			case ResourcesPackage.SUBSTANCE_POLYMER__GEOMETRY:
				return geometry != null;
			case ResourcesPackage.SUBSTANCE_POLYMER__COPOLYMER_CONNECTIVITY:
				return copolymerConnectivities != null && !copolymerConnectivities.isEmpty();
			case ResourcesPackage.SUBSTANCE_POLYMER__MODIFICATION:
				return modifications != null && !modifications.isEmpty();
			case ResourcesPackage.SUBSTANCE_POLYMER__MONOMER_SET:
				return monomerSets != null && !monomerSets.isEmpty();
			case ResourcesPackage.SUBSTANCE_POLYMER__REPEAT:
				return repeats != null && !repeats.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SubstancePolymerImpl
