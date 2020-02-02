/**
 */
package org.hl7.knowledgeartifact.r2.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.hl7.knowledgeartifact.r2.ActionGroup;
import org.hl7.knowledgeartifact.r2.FormattedText;
import org.hl7.knowledgeartifact.r2.R2Package;
import org.hl7.knowledgeartifact.r2.RepresentedConceptsType;
import org.hl7.knowledgeartifact.r2.SubElementsType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Action Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.knowledgeartifact.r2.impl.ActionGroupImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.hl7.knowledgeartifact.r2.impl.ActionGroupImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.hl7.knowledgeartifact.r2.impl.ActionGroupImpl#getRepresentedConcepts <em>Represented Concepts</em>}</li>
 *   <li>{@link org.hl7.knowledgeartifact.r2.impl.ActionGroupImpl#getSubElements <em>Sub Elements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActionGroupImpl extends ActionBaseImpl implements ActionGroup {
	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected FormattedText title;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected FormattedText description;

	/**
	 * The cached value of the '{@link #getRepresentedConcepts() <em>Represented Concepts</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepresentedConcepts()
	 * @generated
	 * @ordered
	 */
	protected RepresentedConceptsType representedConcepts;

	/**
	 * The cached value of the '{@link #getSubElements() <em>Sub Elements</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubElements()
	 * @generated
	 * @ordered
	 */
	protected SubElementsType subElements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActionGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return R2Package.eINSTANCE.getActionGroup();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FormattedText getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTitle(FormattedText newTitle, NotificationChain msgs) {
		FormattedText oldTitle = title;
		title = newTitle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, R2Package.ACTION_GROUP__TITLE, oldTitle, newTitle);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitle(FormattedText newTitle) {
		if (newTitle != title) {
			NotificationChain msgs = null;
			if (title != null)
				msgs = ((InternalEObject)title).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - R2Package.ACTION_GROUP__TITLE, null, msgs);
			if (newTitle != null)
				msgs = ((InternalEObject)newTitle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - R2Package.ACTION_GROUP__TITLE, null, msgs);
			msgs = basicSetTitle(newTitle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, R2Package.ACTION_GROUP__TITLE, newTitle, newTitle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FormattedText getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDescription(FormattedText newDescription, NotificationChain msgs) {
		FormattedText oldDescription = description;
		description = newDescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, R2Package.ACTION_GROUP__DESCRIPTION, oldDescription, newDescription);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(FormattedText newDescription) {
		if (newDescription != description) {
			NotificationChain msgs = null;
			if (description != null)
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - R2Package.ACTION_GROUP__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - R2Package.ACTION_GROUP__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, R2Package.ACTION_GROUP__DESCRIPTION, newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RepresentedConceptsType getRepresentedConcepts() {
		return representedConcepts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRepresentedConcepts(RepresentedConceptsType newRepresentedConcepts, NotificationChain msgs) {
		RepresentedConceptsType oldRepresentedConcepts = representedConcepts;
		representedConcepts = newRepresentedConcepts;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, R2Package.ACTION_GROUP__REPRESENTED_CONCEPTS, oldRepresentedConcepts, newRepresentedConcepts);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRepresentedConcepts(RepresentedConceptsType newRepresentedConcepts) {
		if (newRepresentedConcepts != representedConcepts) {
			NotificationChain msgs = null;
			if (representedConcepts != null)
				msgs = ((InternalEObject)representedConcepts).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - R2Package.ACTION_GROUP__REPRESENTED_CONCEPTS, null, msgs);
			if (newRepresentedConcepts != null)
				msgs = ((InternalEObject)newRepresentedConcepts).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - R2Package.ACTION_GROUP__REPRESENTED_CONCEPTS, null, msgs);
			msgs = basicSetRepresentedConcepts(newRepresentedConcepts, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, R2Package.ACTION_GROUP__REPRESENTED_CONCEPTS, newRepresentedConcepts, newRepresentedConcepts));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubElementsType getSubElements() {
		return subElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubElements(SubElementsType newSubElements, NotificationChain msgs) {
		SubElementsType oldSubElements = subElements;
		subElements = newSubElements;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, R2Package.ACTION_GROUP__SUB_ELEMENTS, oldSubElements, newSubElements);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubElements(SubElementsType newSubElements) {
		if (newSubElements != subElements) {
			NotificationChain msgs = null;
			if (subElements != null)
				msgs = ((InternalEObject)subElements).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - R2Package.ACTION_GROUP__SUB_ELEMENTS, null, msgs);
			if (newSubElements != null)
				msgs = ((InternalEObject)newSubElements).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - R2Package.ACTION_GROUP__SUB_ELEMENTS, null, msgs);
			msgs = basicSetSubElements(newSubElements, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, R2Package.ACTION_GROUP__SUB_ELEMENTS, newSubElements, newSubElements));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case R2Package.ACTION_GROUP__TITLE:
				return basicSetTitle(null, msgs);
			case R2Package.ACTION_GROUP__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case R2Package.ACTION_GROUP__REPRESENTED_CONCEPTS:
				return basicSetRepresentedConcepts(null, msgs);
			case R2Package.ACTION_GROUP__SUB_ELEMENTS:
				return basicSetSubElements(null, msgs);
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
			case R2Package.ACTION_GROUP__TITLE:
				return getTitle();
			case R2Package.ACTION_GROUP__DESCRIPTION:
				return getDescription();
			case R2Package.ACTION_GROUP__REPRESENTED_CONCEPTS:
				return getRepresentedConcepts();
			case R2Package.ACTION_GROUP__SUB_ELEMENTS:
				return getSubElements();
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
			case R2Package.ACTION_GROUP__TITLE:
				setTitle((FormattedText)newValue);
				return;
			case R2Package.ACTION_GROUP__DESCRIPTION:
				setDescription((FormattedText)newValue);
				return;
			case R2Package.ACTION_GROUP__REPRESENTED_CONCEPTS:
				setRepresentedConcepts((RepresentedConceptsType)newValue);
				return;
			case R2Package.ACTION_GROUP__SUB_ELEMENTS:
				setSubElements((SubElementsType)newValue);
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
			case R2Package.ACTION_GROUP__TITLE:
				setTitle((FormattedText)null);
				return;
			case R2Package.ACTION_GROUP__DESCRIPTION:
				setDescription((FormattedText)null);
				return;
			case R2Package.ACTION_GROUP__REPRESENTED_CONCEPTS:
				setRepresentedConcepts((RepresentedConceptsType)null);
				return;
			case R2Package.ACTION_GROUP__SUB_ELEMENTS:
				setSubElements((SubElementsType)null);
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
			case R2Package.ACTION_GROUP__TITLE:
				return title != null;
			case R2Package.ACTION_GROUP__DESCRIPTION:
				return description != null;
			case R2Package.ACTION_GROUP__REPRESENTED_CONCEPTS:
				return representedConcepts != null;
			case R2Package.ACTION_GROUP__SUB_ELEMENTS:
				return subElements != null;
		}
		return super.eIsSet(featureID);
	}

} //ActionGroupImpl
