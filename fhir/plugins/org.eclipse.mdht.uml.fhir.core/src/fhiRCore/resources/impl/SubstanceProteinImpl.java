/**
 */
package fhiRCore.resources.impl;

import fhiRCore.dataTypes.CodeableConcept;

import fhiRCore.resources.ResourcesPackage;
import fhiRCore.resources.SubstanceProtein;
import fhiRCore.resources.SubstanceProteinSubunit;

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
 * An implementation of the model object '<em><b>Substance Protein</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.impl.SubstanceProteinImpl#getSequenceType <em>Sequence Type</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.SubstanceProteinImpl#getNumberOfSubunits <em>Number Of Subunits</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.SubstanceProteinImpl#getDisulfideLinkages <em>Disulfide Linkage</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.SubstanceProteinImpl#getSubunits <em>Subunit</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubstanceProteinImpl extends DomainResourceImpl implements SubstanceProtein {
	/**
	 * The cached value of the '{@link #getSequenceType() <em>Sequence Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequenceType()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept sequenceType;

	/**
	 * The cached value of the '{@link #getNumberOfSubunits() <em>Number Of Subunits</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfSubunits()
	 * @generated
	 * @ordered
	 */
	protected fhiRCore.dataTypes.Integer numberOfSubunits;

	/**
	 * The cached value of the '{@link #getDisulfideLinkages() <em>Disulfide Linkage</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisulfideLinkages()
	 * @generated
	 * @ordered
	 */
	protected EList<fhiRCore.dataTypes.String> disulfideLinkages;

	/**
	 * The cached value of the '{@link #getSubunits() <em>Subunit</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubunits()
	 * @generated
	 * @ordered
	 */
	protected EList<SubstanceProteinSubunit> subunits;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubstanceProteinImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getSubstanceProtein();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getSequenceType() {
		return sequenceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSequenceType(CodeableConcept newSequenceType, NotificationChain msgs) {
		CodeableConcept oldSequenceType = sequenceType;
		sequenceType = newSequenceType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.SUBSTANCE_PROTEIN__SEQUENCE_TYPE, oldSequenceType, newSequenceType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSequenceType(CodeableConcept newSequenceType) {
		if (newSequenceType != sequenceType) {
			NotificationChain msgs = null;
			if (sequenceType != null)
				msgs = ((InternalEObject)sequenceType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SUBSTANCE_PROTEIN__SEQUENCE_TYPE, null, msgs);
			if (newSequenceType != null)
				msgs = ((InternalEObject)newSequenceType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SUBSTANCE_PROTEIN__SEQUENCE_TYPE, null, msgs);
			msgs = basicSetSequenceType(newSequenceType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.SUBSTANCE_PROTEIN__SEQUENCE_TYPE, newSequenceType, newSequenceType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public fhiRCore.dataTypes.Integer getNumberOfSubunits() {
		return numberOfSubunits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNumberOfSubunits(fhiRCore.dataTypes.Integer newNumberOfSubunits, NotificationChain msgs) {
		fhiRCore.dataTypes.Integer oldNumberOfSubunits = numberOfSubunits;
		numberOfSubunits = newNumberOfSubunits;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.SUBSTANCE_PROTEIN__NUMBER_OF_SUBUNITS, oldNumberOfSubunits, newNumberOfSubunits);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumberOfSubunits(fhiRCore.dataTypes.Integer newNumberOfSubunits) {
		if (newNumberOfSubunits != numberOfSubunits) {
			NotificationChain msgs = null;
			if (numberOfSubunits != null)
				msgs = ((InternalEObject)numberOfSubunits).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SUBSTANCE_PROTEIN__NUMBER_OF_SUBUNITS, null, msgs);
			if (newNumberOfSubunits != null)
				msgs = ((InternalEObject)newNumberOfSubunits).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SUBSTANCE_PROTEIN__NUMBER_OF_SUBUNITS, null, msgs);
			msgs = basicSetNumberOfSubunits(newNumberOfSubunits, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.SUBSTANCE_PROTEIN__NUMBER_OF_SUBUNITS, newNumberOfSubunits, newNumberOfSubunits));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<fhiRCore.dataTypes.String> getDisulfideLinkages() {
		if (disulfideLinkages == null) {
			disulfideLinkages = new EObjectContainmentEList<fhiRCore.dataTypes.String>(fhiRCore.dataTypes.String.class, this, ResourcesPackage.SUBSTANCE_PROTEIN__DISULFIDE_LINKAGE);
		}
		return disulfideLinkages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SubstanceProteinSubunit> getSubunits() {
		if (subunits == null) {
			subunits = new EObjectContainmentEList<SubstanceProteinSubunit>(SubstanceProteinSubunit.class, this, ResourcesPackage.SUBSTANCE_PROTEIN__SUBUNIT);
		}
		return subunits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.SUBSTANCE_PROTEIN__SEQUENCE_TYPE:
				return basicSetSequenceType(null, msgs);
			case ResourcesPackage.SUBSTANCE_PROTEIN__NUMBER_OF_SUBUNITS:
				return basicSetNumberOfSubunits(null, msgs);
			case ResourcesPackage.SUBSTANCE_PROTEIN__DISULFIDE_LINKAGE:
				return ((InternalEList<?>)getDisulfideLinkages()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.SUBSTANCE_PROTEIN__SUBUNIT:
				return ((InternalEList<?>)getSubunits()).basicRemove(otherEnd, msgs);
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
			case ResourcesPackage.SUBSTANCE_PROTEIN__SEQUENCE_TYPE:
				return getSequenceType();
			case ResourcesPackage.SUBSTANCE_PROTEIN__NUMBER_OF_SUBUNITS:
				return getNumberOfSubunits();
			case ResourcesPackage.SUBSTANCE_PROTEIN__DISULFIDE_LINKAGE:
				return getDisulfideLinkages();
			case ResourcesPackage.SUBSTANCE_PROTEIN__SUBUNIT:
				return getSubunits();
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
			case ResourcesPackage.SUBSTANCE_PROTEIN__SEQUENCE_TYPE:
				setSequenceType((CodeableConcept)newValue);
				return;
			case ResourcesPackage.SUBSTANCE_PROTEIN__NUMBER_OF_SUBUNITS:
				setNumberOfSubunits((fhiRCore.dataTypes.Integer)newValue);
				return;
			case ResourcesPackage.SUBSTANCE_PROTEIN__DISULFIDE_LINKAGE:
				getDisulfideLinkages().clear();
				getDisulfideLinkages().addAll((Collection<? extends fhiRCore.dataTypes.String>)newValue);
				return;
			case ResourcesPackage.SUBSTANCE_PROTEIN__SUBUNIT:
				getSubunits().clear();
				getSubunits().addAll((Collection<? extends SubstanceProteinSubunit>)newValue);
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
			case ResourcesPackage.SUBSTANCE_PROTEIN__SEQUENCE_TYPE:
				setSequenceType((CodeableConcept)null);
				return;
			case ResourcesPackage.SUBSTANCE_PROTEIN__NUMBER_OF_SUBUNITS:
				setNumberOfSubunits((fhiRCore.dataTypes.Integer)null);
				return;
			case ResourcesPackage.SUBSTANCE_PROTEIN__DISULFIDE_LINKAGE:
				getDisulfideLinkages().clear();
				return;
			case ResourcesPackage.SUBSTANCE_PROTEIN__SUBUNIT:
				getSubunits().clear();
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
			case ResourcesPackage.SUBSTANCE_PROTEIN__SEQUENCE_TYPE:
				return sequenceType != null;
			case ResourcesPackage.SUBSTANCE_PROTEIN__NUMBER_OF_SUBUNITS:
				return numberOfSubunits != null;
			case ResourcesPackage.SUBSTANCE_PROTEIN__DISULFIDE_LINKAGE:
				return disulfideLinkages != null && !disulfideLinkages.isEmpty();
			case ResourcesPackage.SUBSTANCE_PROTEIN__SUBUNIT:
				return subunits != null && !subunits.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SubstanceProteinImpl
