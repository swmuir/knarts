/*******************************************************************************
 * Copyright (c) 2010 David A Carlson.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *
 * $Id$
 *******************************************************************************/
package org.eclipse.mdht.uml.term.core.profile.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.mdht.uml.term.core.profile.BindingKind;
import org.eclipse.mdht.uml.term.core.profile.Extensibility;
import org.eclipse.mdht.uml.term.core.profile.Guidance;
import org.eclipse.mdht.uml.term.core.profile.TermPackage;
import org.eclipse.mdht.uml.term.core.profile.ValueSetConstraint;
import org.eclipse.mdht.uml.term.core.profile.ValueSetVersion;
import org.eclipse.uml2.uml.Property;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Value Set Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.term.core.profile.impl.ValueSetConstraintImpl#getReference <em>Reference</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.term.core.profile.impl.ValueSetConstraintImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.term.core.profile.impl.ValueSetConstraintImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.term.core.profile.impl.ValueSetConstraintImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.term.core.profile.impl.ValueSetConstraintImpl#getBinding <em>Binding</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.term.core.profile.impl.ValueSetConstraintImpl#getBase_Property <em>Base Property</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.term.core.profile.impl.ValueSetConstraintImpl#getExtensibility <em>Extensibility</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.term.core.profile.impl.ValueSetConstraintImpl#getGuidance <em>Guidance</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.term.core.profile.impl.ValueSetConstraintImpl#getUri <em>Uri</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ValueSetConstraintImpl extends EObjectImpl implements ValueSetConstraint {
	/**
	 * The cached value of the '{@link #getReference() <em>Reference</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReference()
	 * @generated
	 * @ordered
	 */
	protected ValueSetVersion reference;

	/**
	 * The default value of the '{@link #getIdentifier() <em>Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected static final String IDENTIFIER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIdentifier() <em>Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected String identifier = IDENTIFIER_EDEFAULT;

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
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected String version = VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getBinding() <em>Binding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBinding()
	 * @generated
	 * @ordered
	 */
	protected static final BindingKind BINDING_EDEFAULT = BindingKind.STATIC;

	/**
	 * The cached value of the '{@link #getBinding() <em>Binding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBinding()
	 * @generated
	 * @ordered
	 */
	protected BindingKind binding = BINDING_EDEFAULT;

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
	 * The default value of the '{@link #getExtensibility() <em>Extensibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtensibility()
	 * @generated
	 * @ordered
	 */
	protected static final Extensibility EXTENSIBILITY_EDEFAULT = Extensibility.NEA;

	/**
	 * The cached value of the '{@link #getExtensibility() <em>Extensibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtensibility()
	 * @generated
	 * @ordered
	 */
	protected Extensibility extensibility = EXTENSIBILITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getGuidance() <em>Guidance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuidance()
	 * @generated
	 * @ordered
	 */
	protected static final Guidance GUIDANCE_EDEFAULT = Guidance.FIXED;

	/**
	 * The cached value of the '{@link #getGuidance() <em>Guidance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuidance()
	 * @generated
	 * @ordered
	 */
	protected Guidance guidance = GUIDANCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getUri() <em>Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUri()
	 * @generated
	 * @ordered
	 */
	protected static final String URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUri() <em>Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUri()
	 * @generated
	 * @ordered
	 */
	protected String uri = URI_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ValueSetConstraintImpl() {
		super();
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
	public ValueSetVersion basicGetReference() {
		return reference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TermPackage.VALUE_SET_CONSTRAINT__REFERENCE:
				if (resolve) return getReference();
				return basicGetReference();
			case TermPackage.VALUE_SET_CONSTRAINT__IDENTIFIER:
				return getIdentifier();
			case TermPackage.VALUE_SET_CONSTRAINT__NAME:
				return getName();
			case TermPackage.VALUE_SET_CONSTRAINT__VERSION:
				return getVersion();
			case TermPackage.VALUE_SET_CONSTRAINT__BINDING:
				return getBinding();
			case TermPackage.VALUE_SET_CONSTRAINT__BASE_PROPERTY:
				if (resolve) return getBase_Property();
				return basicGetBase_Property();
			case TermPackage.VALUE_SET_CONSTRAINT__EXTENSIBILITY:
				return getExtensibility();
			case TermPackage.VALUE_SET_CONSTRAINT__GUIDANCE:
				return getGuidance();
			case TermPackage.VALUE_SET_CONSTRAINT__URI:
				return getUri();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case TermPackage.VALUE_SET_CONSTRAINT__REFERENCE:
				return reference != null;
			case TermPackage.VALUE_SET_CONSTRAINT__IDENTIFIER:
				return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
			case TermPackage.VALUE_SET_CONSTRAINT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case TermPackage.VALUE_SET_CONSTRAINT__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
			case TermPackage.VALUE_SET_CONSTRAINT__BINDING:
				return binding != BINDING_EDEFAULT;
			case TermPackage.VALUE_SET_CONSTRAINT__BASE_PROPERTY:
				return base_Property != null;
			case TermPackage.VALUE_SET_CONSTRAINT__EXTENSIBILITY:
				return extensibility != EXTENSIBILITY_EDEFAULT;
			case TermPackage.VALUE_SET_CONSTRAINT__GUIDANCE:
				return guidance != GUIDANCE_EDEFAULT;
			case TermPackage.VALUE_SET_CONSTRAINT__URI:
				return URI_EDEFAULT == null ? uri != null : !URI_EDEFAULT.equals(uri);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TermPackage.VALUE_SET_CONSTRAINT__REFERENCE:
				setReference((ValueSetVersion)newValue);
				return;
			case TermPackage.VALUE_SET_CONSTRAINT__IDENTIFIER:
				setIdentifier((String)newValue);
				return;
			case TermPackage.VALUE_SET_CONSTRAINT__NAME:
				setName((String)newValue);
				return;
			case TermPackage.VALUE_SET_CONSTRAINT__VERSION:
				setVersion((String)newValue);
				return;
			case TermPackage.VALUE_SET_CONSTRAINT__BINDING:
				setBinding((BindingKind)newValue);
				return;
			case TermPackage.VALUE_SET_CONSTRAINT__BASE_PROPERTY:
				setBase_Property((Property)newValue);
				return;
			case TermPackage.VALUE_SET_CONSTRAINT__EXTENSIBILITY:
				setExtensibility((Extensibility)newValue);
				return;
			case TermPackage.VALUE_SET_CONSTRAINT__GUIDANCE:
				setGuidance((Guidance)newValue);
				return;
			case TermPackage.VALUE_SET_CONSTRAINT__URI:
				setUri((String)newValue);
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
	protected EClass eStaticClass() {
		return TermPackage.Literals.VALUE_SET_CONSTRAINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case TermPackage.VALUE_SET_CONSTRAINT__REFERENCE:
				setReference((ValueSetVersion)null);
				return;
			case TermPackage.VALUE_SET_CONSTRAINT__IDENTIFIER:
				setIdentifier(IDENTIFIER_EDEFAULT);
				return;
			case TermPackage.VALUE_SET_CONSTRAINT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case TermPackage.VALUE_SET_CONSTRAINT__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case TermPackage.VALUE_SET_CONSTRAINT__BINDING:
				setBinding(BINDING_EDEFAULT);
				return;
			case TermPackage.VALUE_SET_CONSTRAINT__BASE_PROPERTY:
				setBase_Property((Property)null);
				return;
			case TermPackage.VALUE_SET_CONSTRAINT__EXTENSIBILITY:
				setExtensibility(EXTENSIBILITY_EDEFAULT);
				return;
			case TermPackage.VALUE_SET_CONSTRAINT__GUIDANCE:
				setGuidance(GUIDANCE_EDEFAULT);
				return;
			case TermPackage.VALUE_SET_CONSTRAINT__URI:
				setUri(URI_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TermPackage.VALUE_SET_CONSTRAINT__BASE_PROPERTY, oldBase_Property, base_Property));
			}
		}
		return base_Property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BindingKind getBinding() {
		return binding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIdentifier() {
		return identifier;
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
	public ValueSetVersion getReference() {
		if (reference != null && reference.eIsProxy()) {
			InternalEObject oldReference = (InternalEObject)reference;
			reference = (ValueSetVersion)eResolveProxy(oldReference);
			if (reference != oldReference) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TermPackage.VALUE_SET_CONSTRAINT__REFERENCE, oldReference, reference));
			}
		}
		return reference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVersion() {
		return version;
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
			eNotify(new ENotificationImpl(this, Notification.SET, TermPackage.VALUE_SET_CONSTRAINT__BASE_PROPERTY, oldBase_Property, base_Property));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Extensibility getExtensibility() {
		return extensibility;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtensibility(Extensibility newExtensibility) {
		Extensibility oldExtensibility = extensibility;
		extensibility = newExtensibility == null ? EXTENSIBILITY_EDEFAULT : newExtensibility;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TermPackage.VALUE_SET_CONSTRAINT__EXTENSIBILITY, oldExtensibility, extensibility));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Guidance getGuidance() {
		return guidance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGuidance(Guidance newGuidance) {
		Guidance oldGuidance = guidance;
		guidance = newGuidance == null ? GUIDANCE_EDEFAULT : newGuidance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TermPackage.VALUE_SET_CONSTRAINT__GUIDANCE, oldGuidance, guidance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUri() {
		return uri;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUri(String newUri) {
		String oldUri = uri;
		uri = newUri;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TermPackage.VALUE_SET_CONSTRAINT__URI, oldUri, uri));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBinding(BindingKind newBinding) {
		BindingKind oldBinding = binding;
		binding = newBinding == null ? BINDING_EDEFAULT : newBinding;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TermPackage.VALUE_SET_CONSTRAINT__BINDING, oldBinding, binding));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdentifier(String newIdentifier) {
		String oldIdentifier = identifier;
		identifier = newIdentifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TermPackage.VALUE_SET_CONSTRAINT__IDENTIFIER, oldIdentifier, identifier));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TermPackage.VALUE_SET_CONSTRAINT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReference(ValueSetVersion newReference) {
		ValueSetVersion oldReference = reference;
		reference = newReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TermPackage.VALUE_SET_CONSTRAINT__REFERENCE, oldReference, reference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(String newVersion) {
		String oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TermPackage.VALUE_SET_CONSTRAINT__VERSION, oldVersion, version));
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
		result.append(" (identifier: ");
		result.append(identifier);
		result.append(", name: ");
		result.append(name);
		result.append(", version: ");
		result.append(version);
		result.append(", binding: ");
		result.append(binding);
		result.append(", extensibility: ");
		result.append(extensibility);
		result.append(", guidance: ");
		result.append(guidance);
		result.append(", uri: ");
		result.append(uri);
		result.append(')');
		return result.toString();
	}

} // ValueSetConstraintImpl
