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

import org.eclipse.mdht.hl7.fhir.dataTypes.Code;
import org.eclipse.mdht.hl7.fhir.dataTypes.DataType;

import org.eclipse.mdht.hl7.fhir.dataTypes.impl.BackboneElementImpl;

import org.eclipse.mdht.hl7.fhir.resources.ImplementationGuideDefinitionPage;
import org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Implementation Guide Definition Page</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ImplementationGuideDefinitionPageImpl#getNamex <em>Namex</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ImplementationGuideDefinitionPageImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ImplementationGuideDefinitionPageImpl#getGeneration <em>Generation</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ImplementationGuideDefinitionPageImpl#getPages <em>Page</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ImplementationGuideDefinitionPageImpl extends BackboneElementImpl implements ImplementationGuideDefinitionPage {
	/**
	 * The cached value of the '{@link #getNamex() <em>Namex</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNamex()
	 * @generated
	 * @ordered
	 */
	protected DataType namex;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.hl7.fhir.dataTypes.String title;

	/**
	 * The cached value of the '{@link #getGeneration() <em>Generation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneration()
	 * @generated
	 * @ordered
	 */
	protected Code generation;

	/**
	 * The cached value of the '{@link #getPages() <em>Page</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPages()
	 * @generated
	 * @ordered
	 */
	protected EList<ImplementationGuideDefinitionPage> pages;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImplementationGuideDefinitionPageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getImplementationGuideDefinitionPage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataType getNamex() {
		return namex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNamex(DataType newNamex, NotificationChain msgs) {
		DataType oldNamex = namex;
		namex = newNamex;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.IMPLEMENTATION_GUIDE_DEFINITION_PAGE__NAMEX, oldNamex, newNamex);
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
	public void setNamex(DataType newNamex) {
		if (newNamex != namex) {
			NotificationChain msgs = null;
			if (namex != null)
				msgs = ((InternalEObject)namex).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.IMPLEMENTATION_GUIDE_DEFINITION_PAGE__NAMEX, null, msgs);
			if (newNamex != null)
				msgs = ((InternalEObject)newNamex).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.IMPLEMENTATION_GUIDE_DEFINITION_PAGE__NAMEX, null, msgs);
			msgs = basicSetNamex(newNamex, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.IMPLEMENTATION_GUIDE_DEFINITION_PAGE__NAMEX, newNamex, newNamex));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.eclipse.mdht.hl7.fhir.dataTypes.String getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTitle(org.eclipse.mdht.hl7.fhir.dataTypes.String newTitle, NotificationChain msgs) {
		org.eclipse.mdht.hl7.fhir.dataTypes.String oldTitle = title;
		title = newTitle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.IMPLEMENTATION_GUIDE_DEFINITION_PAGE__TITLE, oldTitle, newTitle);
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
	public void setTitle(org.eclipse.mdht.hl7.fhir.dataTypes.String newTitle) {
		if (newTitle != title) {
			NotificationChain msgs = null;
			if (title != null)
				msgs = ((InternalEObject)title).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.IMPLEMENTATION_GUIDE_DEFINITION_PAGE__TITLE, null, msgs);
			if (newTitle != null)
				msgs = ((InternalEObject)newTitle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.IMPLEMENTATION_GUIDE_DEFINITION_PAGE__TITLE, null, msgs);
			msgs = basicSetTitle(newTitle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.IMPLEMENTATION_GUIDE_DEFINITION_PAGE__TITLE, newTitle, newTitle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Code getGeneration() {
		return generation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGeneration(Code newGeneration, NotificationChain msgs) {
		Code oldGeneration = generation;
		generation = newGeneration;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.IMPLEMENTATION_GUIDE_DEFINITION_PAGE__GENERATION, oldGeneration, newGeneration);
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
	public void setGeneration(Code newGeneration) {
		if (newGeneration != generation) {
			NotificationChain msgs = null;
			if (generation != null)
				msgs = ((InternalEObject)generation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.IMPLEMENTATION_GUIDE_DEFINITION_PAGE__GENERATION, null, msgs);
			if (newGeneration != null)
				msgs = ((InternalEObject)newGeneration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.IMPLEMENTATION_GUIDE_DEFINITION_PAGE__GENERATION, null, msgs);
			msgs = basicSetGeneration(newGeneration, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.IMPLEMENTATION_GUIDE_DEFINITION_PAGE__GENERATION, newGeneration, newGeneration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ImplementationGuideDefinitionPage> getPages() {
		if (pages == null) {
			pages = new EObjectContainmentEList<ImplementationGuideDefinitionPage>(ImplementationGuideDefinitionPage.class, this, ResourcesPackage.IMPLEMENTATION_GUIDE_DEFINITION_PAGE__PAGE);
		}
		return pages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.IMPLEMENTATION_GUIDE_DEFINITION_PAGE__NAMEX:
				return basicSetNamex(null, msgs);
			case ResourcesPackage.IMPLEMENTATION_GUIDE_DEFINITION_PAGE__TITLE:
				return basicSetTitle(null, msgs);
			case ResourcesPackage.IMPLEMENTATION_GUIDE_DEFINITION_PAGE__GENERATION:
				return basicSetGeneration(null, msgs);
			case ResourcesPackage.IMPLEMENTATION_GUIDE_DEFINITION_PAGE__PAGE:
				return ((InternalEList<?>)getPages()).basicRemove(otherEnd, msgs);
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
			case ResourcesPackage.IMPLEMENTATION_GUIDE_DEFINITION_PAGE__NAMEX:
				return getNamex();
			case ResourcesPackage.IMPLEMENTATION_GUIDE_DEFINITION_PAGE__TITLE:
				return getTitle();
			case ResourcesPackage.IMPLEMENTATION_GUIDE_DEFINITION_PAGE__GENERATION:
				return getGeneration();
			case ResourcesPackage.IMPLEMENTATION_GUIDE_DEFINITION_PAGE__PAGE:
				return getPages();
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
			case ResourcesPackage.IMPLEMENTATION_GUIDE_DEFINITION_PAGE__NAMEX:
				setNamex((DataType)newValue);
				return;
			case ResourcesPackage.IMPLEMENTATION_GUIDE_DEFINITION_PAGE__TITLE:
				setTitle((org.eclipse.mdht.hl7.fhir.dataTypes.String)newValue);
				return;
			case ResourcesPackage.IMPLEMENTATION_GUIDE_DEFINITION_PAGE__GENERATION:
				setGeneration((Code)newValue);
				return;
			case ResourcesPackage.IMPLEMENTATION_GUIDE_DEFINITION_PAGE__PAGE:
				getPages().clear();
				getPages().addAll((Collection<? extends ImplementationGuideDefinitionPage>)newValue);
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
			case ResourcesPackage.IMPLEMENTATION_GUIDE_DEFINITION_PAGE__NAMEX:
				setNamex((DataType)null);
				return;
			case ResourcesPackage.IMPLEMENTATION_GUIDE_DEFINITION_PAGE__TITLE:
				setTitle((org.eclipse.mdht.hl7.fhir.dataTypes.String)null);
				return;
			case ResourcesPackage.IMPLEMENTATION_GUIDE_DEFINITION_PAGE__GENERATION:
				setGeneration((Code)null);
				return;
			case ResourcesPackage.IMPLEMENTATION_GUIDE_DEFINITION_PAGE__PAGE:
				getPages().clear();
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
			case ResourcesPackage.IMPLEMENTATION_GUIDE_DEFINITION_PAGE__NAMEX:
				return namex != null;
			case ResourcesPackage.IMPLEMENTATION_GUIDE_DEFINITION_PAGE__TITLE:
				return title != null;
			case ResourcesPackage.IMPLEMENTATION_GUIDE_DEFINITION_PAGE__GENERATION:
				return generation != null;
			case ResourcesPackage.IMPLEMENTATION_GUIDE_DEFINITION_PAGE__PAGE:
				return pages != null && !pages.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ImplementationGuideDefinitionPageImpl
