/*******************************************************************************
 * Copyright (c) 2015 David Carlson and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David Carlson (Clinical Cloud Solutions, LLC) - initial API and implementation
 *******************************************************************************/
/**
 */
package org.eclipse.mdht.uml.fhir.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.mdht.uml.fhir.ElementDefinition;
import org.eclipse.mdht.uml.fhir.FHIRPackage;
import org.eclipse.mdht.uml.fhir.PropertyRepresentationKind;

import org.eclipse.mdht.uml.fhir.types.DataType;

import org.eclipse.uml2.uml.Property;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Element Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.impl.ElementDefinitionImpl#getBase_Property <em>Base Property</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.impl.ElementDefinitionImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.impl.ElementDefinitionImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.impl.ElementDefinitionImpl#getMustSupport <em>Must Support</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.impl.ElementDefinitionImpl#getIsModifier <em>Is Modifier</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.impl.ElementDefinitionImpl#getIsSummary <em>Is Summary</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.impl.ElementDefinitionImpl#getRepresentations <em>Representation</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.impl.ElementDefinitionImpl#getDefault <em>Default</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.impl.ElementDefinitionImpl#getMeaningWhenMissing <em>Meaning When Missing</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.impl.ElementDefinitionImpl#getFixed <em>Fixed</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.impl.ElementDefinitionImpl#getPattern <em>Pattern</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.impl.ElementDefinitionImpl#getExample <em>Example</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.impl.ElementDefinitionImpl#getComment <em>Comment</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ElementDefinitionImpl extends ElementImpl implements ElementDefinition {
	/**
	 * The cached value of the '{@link #getBase_Property() <em>Base Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_Property()
	 * @generated
	 * @ordered
	 */
	protected Property base_Property;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected String label = LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getMustSupport() <em>Must Support</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMustSupport()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean MUST_SUPPORT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMustSupport() <em>Must Support</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMustSupport()
	 * @generated
	 * @ordered
	 */
	protected Boolean mustSupport = MUST_SUPPORT_EDEFAULT;

	/**
	 * The default value of the '{@link #getIsModifier() <em>Is Modifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsModifier()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_MODIFIER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsModifier() <em>Is Modifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsModifier()
	 * @generated
	 * @ordered
	 */
	protected Boolean isModifier = IS_MODIFIER_EDEFAULT;

	/**
	 * The default value of the '{@link #getIsSummary() <em>Is Summary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsSummary()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_SUMMARY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsSummary() <em>Is Summary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsSummary()
	 * @generated
	 * @ordered
	 */
	protected Boolean isSummary = IS_SUMMARY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRepresentations() <em>Representation</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepresentations()
	 * @generated
	 * @ordered
	 */
	protected EList<PropertyRepresentationKind> representations;

	/**
	 * The cached value of the '{@link #getDefault() <em>Default</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefault()
	 * @generated
	 * @ordered
	 */
	protected DataType default_;

	/**
	 * The default value of the '{@link #getMeaningWhenMissing() <em>Meaning When Missing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeaningWhenMissing()
	 * @generated
	 * @ordered
	 */
	protected static final String MEANING_WHEN_MISSING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMeaningWhenMissing() <em>Meaning When Missing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeaningWhenMissing()
	 * @generated
	 * @ordered
	 */
	protected String meaningWhenMissing = MEANING_WHEN_MISSING_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFixed() <em>Fixed</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFixed()
	 * @generated
	 * @ordered
	 */
	protected DataType fixed;

	/**
	 * The cached value of the '{@link #getPattern() <em>Pattern</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPattern()
	 * @generated
	 * @ordered
	 */
	protected DataType pattern;

	/**
	 * The cached value of the '{@link #getExample() <em>Example</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExample()
	 * @generated
	 * @ordered
	 */
	protected DataType example;

	/**
	 * The default value of the '{@link #getComment() <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getComment() <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected String comment = COMMENT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ElementDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FHIRPackage.Literals.ELEMENT_DEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property getBase_Property() {
		if (base_Property != null && base_Property.eIsProxy()) {
			InternalEObject oldBase_Property = (InternalEObject)base_Property;
			base_Property = (Property)eResolveProxy(oldBase_Property);
			if (base_Property != oldBase_Property) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FHIRPackage.ELEMENT_DEFINITION__BASE_PROPERTY, oldBase_Property, base_Property));
			}
		}
		return base_Property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property basicGetBase_Property() {
		return base_Property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_Property(Property newBase_Property) {
		Property oldBase_Property = base_Property;
		base_Property = newBase_Property;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.ELEMENT_DEFINITION__BASE_PROPERTY, oldBase_Property, base_Property));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.ELEMENT_DEFINITION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLabel() {
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabel(String newLabel) {
		String oldLabel = label;
		label = newLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.ELEMENT_DEFINITION__LABEL, oldLabel, label));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getMustSupport() {
		return mustSupport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMustSupport(Boolean newMustSupport) {
		Boolean oldMustSupport = mustSupport;
		mustSupport = newMustSupport;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.ELEMENT_DEFINITION__MUST_SUPPORT, oldMustSupport, mustSupport));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsModifier() {
		return isModifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsModifier(Boolean newIsModifier) {
		Boolean oldIsModifier = isModifier;
		isModifier = newIsModifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.ELEMENT_DEFINITION__IS_MODIFIER, oldIsModifier, isModifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsSummary() {
		return isSummary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsSummary(Boolean newIsSummary) {
		Boolean oldIsSummary = isSummary;
		isSummary = newIsSummary;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.ELEMENT_DEFINITION__IS_SUMMARY, oldIsSummary, isSummary));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PropertyRepresentationKind> getRepresentations() {
		if (representations == null) {
			representations = new EDataTypeUniqueEList.Unsettable<PropertyRepresentationKind>(PropertyRepresentationKind.class, this, FHIRPackage.ELEMENT_DEFINITION__REPRESENTATION);
		}
		return representations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRepresentations() {
		if (representations != null) ((InternalEList.Unsettable<?>)representations).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRepresentations() {
		return representations != null && ((InternalEList.Unsettable<?>)representations).isSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType getDefault() {
		return default_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefault(DataType newDefault, NotificationChain msgs) {
		DataType oldDefault = default_;
		default_ = newDefault;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.ELEMENT_DEFINITION__DEFAULT, oldDefault, newDefault);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefault(DataType newDefault) {
		if (newDefault != default_) {
			NotificationChain msgs = null;
			if (default_ != null)
				msgs = ((InternalEObject)default_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.ELEMENT_DEFINITION__DEFAULT, null, msgs);
			if (newDefault != null)
				msgs = ((InternalEObject)newDefault).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.ELEMENT_DEFINITION__DEFAULT, null, msgs);
			msgs = basicSetDefault(newDefault, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.ELEMENT_DEFINITION__DEFAULT, newDefault, newDefault));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMeaningWhenMissing() {
		return meaningWhenMissing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMeaningWhenMissing(String newMeaningWhenMissing) {
		String oldMeaningWhenMissing = meaningWhenMissing;
		meaningWhenMissing = newMeaningWhenMissing;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.ELEMENT_DEFINITION__MEANING_WHEN_MISSING, oldMeaningWhenMissing, meaningWhenMissing));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType getFixed() {
		return fixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFixed(DataType newFixed, NotificationChain msgs) {
		DataType oldFixed = fixed;
		fixed = newFixed;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.ELEMENT_DEFINITION__FIXED, oldFixed, newFixed);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFixed(DataType newFixed) {
		if (newFixed != fixed) {
			NotificationChain msgs = null;
			if (fixed != null)
				msgs = ((InternalEObject)fixed).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.ELEMENT_DEFINITION__FIXED, null, msgs);
			if (newFixed != null)
				msgs = ((InternalEObject)newFixed).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.ELEMENT_DEFINITION__FIXED, null, msgs);
			msgs = basicSetFixed(newFixed, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.ELEMENT_DEFINITION__FIXED, newFixed, newFixed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType getPattern() {
		return pattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPattern(DataType newPattern, NotificationChain msgs) {
		DataType oldPattern = pattern;
		pattern = newPattern;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.ELEMENT_DEFINITION__PATTERN, oldPattern, newPattern);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPattern(DataType newPattern) {
		if (newPattern != pattern) {
			NotificationChain msgs = null;
			if (pattern != null)
				msgs = ((InternalEObject)pattern).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.ELEMENT_DEFINITION__PATTERN, null, msgs);
			if (newPattern != null)
				msgs = ((InternalEObject)newPattern).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.ELEMENT_DEFINITION__PATTERN, null, msgs);
			msgs = basicSetPattern(newPattern, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.ELEMENT_DEFINITION__PATTERN, newPattern, newPattern));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType getExample() {
		return example;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExample(DataType newExample, NotificationChain msgs) {
		DataType oldExample = example;
		example = newExample;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.ELEMENT_DEFINITION__EXAMPLE, oldExample, newExample);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExample(DataType newExample) {
		if (newExample != example) {
			NotificationChain msgs = null;
			if (example != null)
				msgs = ((InternalEObject)example).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.ELEMENT_DEFINITION__EXAMPLE, null, msgs);
			if (newExample != null)
				msgs = ((InternalEObject)newExample).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.ELEMENT_DEFINITION__EXAMPLE, null, msgs);
			msgs = basicSetExample(newExample, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.ELEMENT_DEFINITION__EXAMPLE, newExample, newExample));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getComment() {
		return comment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComment(String newComment) {
		String oldComment = comment;
		comment = newComment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.ELEMENT_DEFINITION__COMMENT, oldComment, comment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FHIRPackage.ELEMENT_DEFINITION__DEFAULT:
				return basicSetDefault(null, msgs);
			case FHIRPackage.ELEMENT_DEFINITION__FIXED:
				return basicSetFixed(null, msgs);
			case FHIRPackage.ELEMENT_DEFINITION__PATTERN:
				return basicSetPattern(null, msgs);
			case FHIRPackage.ELEMENT_DEFINITION__EXAMPLE:
				return basicSetExample(null, msgs);
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
			case FHIRPackage.ELEMENT_DEFINITION__BASE_PROPERTY:
				if (resolve) return getBase_Property();
				return basicGetBase_Property();
			case FHIRPackage.ELEMENT_DEFINITION__NAME:
				return getName();
			case FHIRPackage.ELEMENT_DEFINITION__LABEL:
				return getLabel();
			case FHIRPackage.ELEMENT_DEFINITION__MUST_SUPPORT:
				return getMustSupport();
			case FHIRPackage.ELEMENT_DEFINITION__IS_MODIFIER:
				return getIsModifier();
			case FHIRPackage.ELEMENT_DEFINITION__IS_SUMMARY:
				return getIsSummary();
			case FHIRPackage.ELEMENT_DEFINITION__REPRESENTATION:
				return getRepresentations();
			case FHIRPackage.ELEMENT_DEFINITION__DEFAULT:
				return getDefault();
			case FHIRPackage.ELEMENT_DEFINITION__MEANING_WHEN_MISSING:
				return getMeaningWhenMissing();
			case FHIRPackage.ELEMENT_DEFINITION__FIXED:
				return getFixed();
			case FHIRPackage.ELEMENT_DEFINITION__PATTERN:
				return getPattern();
			case FHIRPackage.ELEMENT_DEFINITION__EXAMPLE:
				return getExample();
			case FHIRPackage.ELEMENT_DEFINITION__COMMENT:
				return getComment();
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
			case FHIRPackage.ELEMENT_DEFINITION__BASE_PROPERTY:
				setBase_Property((Property)newValue);
				return;
			case FHIRPackage.ELEMENT_DEFINITION__NAME:
				setName((String)newValue);
				return;
			case FHIRPackage.ELEMENT_DEFINITION__LABEL:
				setLabel((String)newValue);
				return;
			case FHIRPackage.ELEMENT_DEFINITION__MUST_SUPPORT:
				setMustSupport((Boolean)newValue);
				return;
			case FHIRPackage.ELEMENT_DEFINITION__IS_MODIFIER:
				setIsModifier((Boolean)newValue);
				return;
			case FHIRPackage.ELEMENT_DEFINITION__IS_SUMMARY:
				setIsSummary((Boolean)newValue);
				return;
			case FHIRPackage.ELEMENT_DEFINITION__REPRESENTATION:
				getRepresentations().clear();
				getRepresentations().addAll((Collection<? extends PropertyRepresentationKind>)newValue);
				return;
			case FHIRPackage.ELEMENT_DEFINITION__DEFAULT:
				setDefault((DataType)newValue);
				return;
			case FHIRPackage.ELEMENT_DEFINITION__MEANING_WHEN_MISSING:
				setMeaningWhenMissing((String)newValue);
				return;
			case FHIRPackage.ELEMENT_DEFINITION__FIXED:
				setFixed((DataType)newValue);
				return;
			case FHIRPackage.ELEMENT_DEFINITION__PATTERN:
				setPattern((DataType)newValue);
				return;
			case FHIRPackage.ELEMENT_DEFINITION__EXAMPLE:
				setExample((DataType)newValue);
				return;
			case FHIRPackage.ELEMENT_DEFINITION__COMMENT:
				setComment((String)newValue);
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
			case FHIRPackage.ELEMENT_DEFINITION__BASE_PROPERTY:
				setBase_Property((Property)null);
				return;
			case FHIRPackage.ELEMENT_DEFINITION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case FHIRPackage.ELEMENT_DEFINITION__LABEL:
				setLabel(LABEL_EDEFAULT);
				return;
			case FHIRPackage.ELEMENT_DEFINITION__MUST_SUPPORT:
				setMustSupport(MUST_SUPPORT_EDEFAULT);
				return;
			case FHIRPackage.ELEMENT_DEFINITION__IS_MODIFIER:
				setIsModifier(IS_MODIFIER_EDEFAULT);
				return;
			case FHIRPackage.ELEMENT_DEFINITION__IS_SUMMARY:
				setIsSummary(IS_SUMMARY_EDEFAULT);
				return;
			case FHIRPackage.ELEMENT_DEFINITION__REPRESENTATION:
				unsetRepresentations();
				return;
			case FHIRPackage.ELEMENT_DEFINITION__DEFAULT:
				setDefault((DataType)null);
				return;
			case FHIRPackage.ELEMENT_DEFINITION__MEANING_WHEN_MISSING:
				setMeaningWhenMissing(MEANING_WHEN_MISSING_EDEFAULT);
				return;
			case FHIRPackage.ELEMENT_DEFINITION__FIXED:
				setFixed((DataType)null);
				return;
			case FHIRPackage.ELEMENT_DEFINITION__PATTERN:
				setPattern((DataType)null);
				return;
			case FHIRPackage.ELEMENT_DEFINITION__EXAMPLE:
				setExample((DataType)null);
				return;
			case FHIRPackage.ELEMENT_DEFINITION__COMMENT:
				setComment(COMMENT_EDEFAULT);
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
			case FHIRPackage.ELEMENT_DEFINITION__BASE_PROPERTY:
				return base_Property != null;
			case FHIRPackage.ELEMENT_DEFINITION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case FHIRPackage.ELEMENT_DEFINITION__LABEL:
				return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
			case FHIRPackage.ELEMENT_DEFINITION__MUST_SUPPORT:
				return MUST_SUPPORT_EDEFAULT == null ? mustSupport != null : !MUST_SUPPORT_EDEFAULT.equals(mustSupport);
			case FHIRPackage.ELEMENT_DEFINITION__IS_MODIFIER:
				return IS_MODIFIER_EDEFAULT == null ? isModifier != null : !IS_MODIFIER_EDEFAULT.equals(isModifier);
			case FHIRPackage.ELEMENT_DEFINITION__IS_SUMMARY:
				return IS_SUMMARY_EDEFAULT == null ? isSummary != null : !IS_SUMMARY_EDEFAULT.equals(isSummary);
			case FHIRPackage.ELEMENT_DEFINITION__REPRESENTATION:
				return isSetRepresentations();
			case FHIRPackage.ELEMENT_DEFINITION__DEFAULT:
				return default_ != null;
			case FHIRPackage.ELEMENT_DEFINITION__MEANING_WHEN_MISSING:
				return MEANING_WHEN_MISSING_EDEFAULT == null ? meaningWhenMissing != null : !MEANING_WHEN_MISSING_EDEFAULT.equals(meaningWhenMissing);
			case FHIRPackage.ELEMENT_DEFINITION__FIXED:
				return fixed != null;
			case FHIRPackage.ELEMENT_DEFINITION__PATTERN:
				return pattern != null;
			case FHIRPackage.ELEMENT_DEFINITION__EXAMPLE:
				return example != null;
			case FHIRPackage.ELEMENT_DEFINITION__COMMENT:
				return COMMENT_EDEFAULT == null ? comment != null : !COMMENT_EDEFAULT.equals(comment);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", label: ");
		result.append(label);
		result.append(", mustSupport: ");
		result.append(mustSupport);
		result.append(", isModifier: ");
		result.append(isModifier);
		result.append(", isSummary: ");
		result.append(isSummary);
		result.append(", representation: ");
		result.append(representations);
		result.append(", meaningWhenMissing: ");
		result.append(meaningWhenMissing);
		result.append(", comment: ");
		result.append(comment);
		result.append(')');
		return result.toString();
	}

} //ElementDefinitionImpl
