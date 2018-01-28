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
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.mdht.uml.fhir.FHIRPackage;
import org.eclipse.mdht.uml.fhir.SearchParameter;
import org.eclipse.mdht.uml.fhir.SearchParameter_ComponentClass;
import org.eclipse.mdht.uml.fhir.types.CodeableConcept;
import org.eclipse.uml2.uml.NamedElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Search Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.impl.SearchParameterImpl#getBase_Class <em>Base Class</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.impl.SearchParameterImpl#getJurisdictions <em>Jurisdiction</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.impl.SearchParameterImpl#getPurpose <em>Purpose</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.impl.SearchParameterImpl#getCode <em>Code</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.impl.SearchParameterImpl#getBases <em>Base</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.impl.SearchParameterImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.impl.SearchParameterImpl#getDerivedFrom <em>Derived From</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.impl.SearchParameterImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.impl.SearchParameterImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.impl.SearchParameterImpl#getXpath <em>Xpath</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.impl.SearchParameterImpl#getXpathUsage <em>Xpath Usage</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.impl.SearchParameterImpl#getTargets <em>Target</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.impl.SearchParameterImpl#getComparators <em>Comparator</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.impl.SearchParameterImpl#getModifiers <em>Modifier</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.impl.SearchParameterImpl#getChains <em>Chain</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.impl.SearchParameterImpl#getComponents <em>Component</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.impl.SearchParameterImpl#getBaseResources <em>Base Resource</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SearchParameterImpl extends ConformanceResourceImpl implements SearchParameter {
	/**
	 * The cached value of the '{@link #getBase_Class() <em>Base Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_Class()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.uml2.uml.Class base_Class;

	/**
	 * The cached value of the '{@link #getJurisdictions() <em>Jurisdiction</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJurisdictions()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> jurisdictions;

	/**
	 * The default value of the '{@link #getPurpose() <em>Purpose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPurpose()
	 * @generated
	 * @ordered
	 */
	protected static final String PURPOSE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPurpose() <em>Purpose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPurpose()
	 * @generated
	 * @ordered
	 */
	protected String purpose = PURPOSE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCode() <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected static final String CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCode() <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected String code = CODE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBases() <em>Base</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBases()
	 * @generated
	 * @ordered
	 */
	protected EList<String> bases;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDerivedFrom() <em>Derived From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDerivedFrom()
	 * @generated
	 * @ordered
	 */
	protected static final String DERIVED_FROM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDerivedFrom() <em>Derived From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDerivedFrom()
	 * @generated
	 * @ordered
	 */
	protected String derivedFrom = DERIVED_FROM_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getExpression() <em>Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpression()
	 * @generated
	 * @ordered
	 */
	protected static final String EXPRESSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExpression() <em>Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpression()
	 * @generated
	 * @ordered
	 */
	protected String expression = EXPRESSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getXpath() <em>Xpath</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXpath()
	 * @generated
	 * @ordered
	 */
	protected static final String XPATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getXpath() <em>Xpath</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXpath()
	 * @generated
	 * @ordered
	 */
	protected String xpath = XPATH_EDEFAULT;

	/**
	 * The default value of the '{@link #getXpathUsage() <em>Xpath Usage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXpathUsage()
	 * @generated
	 * @ordered
	 */
	protected static final String XPATH_USAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getXpathUsage() <em>Xpath Usage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXpathUsage()
	 * @generated
	 * @ordered
	 */
	protected String xpathUsage = XPATH_USAGE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTargets() <em>Target</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargets()
	 * @generated
	 * @ordered
	 */
	protected EList<String> targets;

	/**
	 * The cached value of the '{@link #getComparators() <em>Comparator</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComparators()
	 * @generated
	 * @ordered
	 */
	protected EList<String> comparators;

	/**
	 * The cached value of the '{@link #getModifiers() <em>Modifier</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModifiers()
	 * @generated
	 * @ordered
	 */
	protected EList<String> modifiers;

	/**
	 * The cached value of the '{@link #getChains() <em>Chain</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChains()
	 * @generated
	 * @ordered
	 */
	protected EList<String> chains;

	/**
	 * The cached value of the '{@link #getComponents() <em>Component</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponents()
	 * @generated
	 * @ordered
	 */
	protected EList<SearchParameter_ComponentClass> components;

	/**
	 * The cached value of the '{@link #getBaseResources() <em>Base Resource</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseResources()
	 * @generated
	 * @ordered
	 */
	protected EList<NamedElement> baseResources;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SearchParameterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FHIRPackage.Literals.SEARCH_PARAMETER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.uml2.uml.Class getBase_Class() {
		if (base_Class != null && base_Class.eIsProxy()) {
			InternalEObject oldBase_Class = (InternalEObject)base_Class;
			base_Class = (org.eclipse.uml2.uml.Class)eResolveProxy(oldBase_Class);
			if (base_Class != oldBase_Class) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FHIRPackage.SEARCH_PARAMETER__BASE_CLASS, oldBase_Class, base_Class));
			}
		}
		return base_Class;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.uml2.uml.Class basicGetBase_Class() {
		return base_Class;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_Class(org.eclipse.uml2.uml.Class newBase_Class) {
		org.eclipse.uml2.uml.Class oldBase_Class = base_Class;
		base_Class = newBase_Class;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.SEARCH_PARAMETER__BASE_CLASS, oldBase_Class, base_Class));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getJurisdictions() {
		if (jurisdictions == null) {
			jurisdictions = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FHIRPackage.SEARCH_PARAMETER__JURISDICTION);
		}
		return jurisdictions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPurpose() {
		return purpose;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPurpose(String newPurpose) {
		String oldPurpose = purpose;
		purpose = newPurpose;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.SEARCH_PARAMETER__PURPOSE, oldPurpose, purpose));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCode() {
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCode(String newCode) {
		String oldCode = code;
		code = newCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.SEARCH_PARAMETER__CODE, oldCode, code));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getBases() {
		if (bases == null) {
			bases = new EDataTypeUniqueEList<String>(String.class, this, FHIRPackage.SEARCH_PARAMETER__BASE);
		}
		return bases;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.SEARCH_PARAMETER__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDerivedFrom() {
		return derivedFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDerivedFrom(String newDerivedFrom) {
		String oldDerivedFrom = derivedFrom;
		derivedFrom = newDerivedFrom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.SEARCH_PARAMETER__DERIVED_FROM, oldDerivedFrom, derivedFrom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.SEARCH_PARAMETER__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExpression() {
		return expression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpression(String newExpression) {
		String oldExpression = expression;
		expression = newExpression;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.SEARCH_PARAMETER__EXPRESSION, oldExpression, expression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getXpath() {
		return xpath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXpath(String newXpath) {
		String oldXpath = xpath;
		xpath = newXpath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.SEARCH_PARAMETER__XPATH, oldXpath, xpath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getXpathUsage() {
		return xpathUsage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXpathUsage(String newXpathUsage) {
		String oldXpathUsage = xpathUsage;
		xpathUsage = newXpathUsage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.SEARCH_PARAMETER__XPATH_USAGE, oldXpathUsage, xpathUsage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getTargets() {
		if (targets == null) {
			targets = new EDataTypeUniqueEList<String>(String.class, this, FHIRPackage.SEARCH_PARAMETER__TARGET);
		}
		return targets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getComparators() {
		if (comparators == null) {
			comparators = new EDataTypeUniqueEList<String>(String.class, this, FHIRPackage.SEARCH_PARAMETER__COMPARATOR);
		}
		return comparators;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getModifiers() {
		if (modifiers == null) {
			modifiers = new EDataTypeUniqueEList<String>(String.class, this, FHIRPackage.SEARCH_PARAMETER__MODIFIER);
		}
		return modifiers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getChains() {
		if (chains == null) {
			chains = new EDataTypeUniqueEList<String>(String.class, this, FHIRPackage.SEARCH_PARAMETER__CHAIN);
		}
		return chains;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SearchParameter_ComponentClass> getComponents() {
		if (components == null) {
			components = new EObjectContainmentEList<SearchParameter_ComponentClass>(SearchParameter_ComponentClass.class, this, FHIRPackage.SEARCH_PARAMETER__COMPONENT);
		}
		return components;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NamedElement> getBaseResources() {
		if (baseResources == null) {
			baseResources = new EObjectResolvingEList<NamedElement>(NamedElement.class, this, FHIRPackage.SEARCH_PARAMETER__BASE_RESOURCE);
		}
		return baseResources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedElement getBaseResource(String name) {
		return getBaseResource(name, false, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedElement getBaseResource(String name, boolean ignoreCase, EClass eClass) {
		baseResourceLoop: for (NamedElement baseResource : getBaseResources()) {
			if (eClass != null && !eClass.isInstance(baseResource))
				continue baseResourceLoop;
			if (name != null && !(ignoreCase ? name.equalsIgnoreCase(baseResource.getName()) : name.equals(baseResource.getName())))
				continue baseResourceLoop;
			return baseResource;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FHIRPackage.SEARCH_PARAMETER__JURISDICTION:
				return ((InternalEList<?>)getJurisdictions()).basicRemove(otherEnd, msgs);
			case FHIRPackage.SEARCH_PARAMETER__COMPONENT:
				return ((InternalEList<?>)getComponents()).basicRemove(otherEnd, msgs);
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
			case FHIRPackage.SEARCH_PARAMETER__BASE_CLASS:
				if (resolve) return getBase_Class();
				return basicGetBase_Class();
			case FHIRPackage.SEARCH_PARAMETER__JURISDICTION:
				return getJurisdictions();
			case FHIRPackage.SEARCH_PARAMETER__PURPOSE:
				return getPurpose();
			case FHIRPackage.SEARCH_PARAMETER__CODE:
				return getCode();
			case FHIRPackage.SEARCH_PARAMETER__BASE:
				return getBases();
			case FHIRPackage.SEARCH_PARAMETER__TYPE:
				return getType();
			case FHIRPackage.SEARCH_PARAMETER__DERIVED_FROM:
				return getDerivedFrom();
			case FHIRPackage.SEARCH_PARAMETER__DESCRIPTION:
				return getDescription();
			case FHIRPackage.SEARCH_PARAMETER__EXPRESSION:
				return getExpression();
			case FHIRPackage.SEARCH_PARAMETER__XPATH:
				return getXpath();
			case FHIRPackage.SEARCH_PARAMETER__XPATH_USAGE:
				return getXpathUsage();
			case FHIRPackage.SEARCH_PARAMETER__TARGET:
				return getTargets();
			case FHIRPackage.SEARCH_PARAMETER__COMPARATOR:
				return getComparators();
			case FHIRPackage.SEARCH_PARAMETER__MODIFIER:
				return getModifiers();
			case FHIRPackage.SEARCH_PARAMETER__CHAIN:
				return getChains();
			case FHIRPackage.SEARCH_PARAMETER__COMPONENT:
				return getComponents();
			case FHIRPackage.SEARCH_PARAMETER__BASE_RESOURCE:
				return getBaseResources();
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
			case FHIRPackage.SEARCH_PARAMETER__BASE_CLASS:
				setBase_Class((org.eclipse.uml2.uml.Class)newValue);
				return;
			case FHIRPackage.SEARCH_PARAMETER__JURISDICTION:
				getJurisdictions().clear();
				getJurisdictions().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FHIRPackage.SEARCH_PARAMETER__PURPOSE:
				setPurpose((String)newValue);
				return;
			case FHIRPackage.SEARCH_PARAMETER__CODE:
				setCode((String)newValue);
				return;
			case FHIRPackage.SEARCH_PARAMETER__BASE:
				getBases().clear();
				getBases().addAll((Collection<? extends String>)newValue);
				return;
			case FHIRPackage.SEARCH_PARAMETER__TYPE:
				setType((String)newValue);
				return;
			case FHIRPackage.SEARCH_PARAMETER__DERIVED_FROM:
				setDerivedFrom((String)newValue);
				return;
			case FHIRPackage.SEARCH_PARAMETER__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case FHIRPackage.SEARCH_PARAMETER__EXPRESSION:
				setExpression((String)newValue);
				return;
			case FHIRPackage.SEARCH_PARAMETER__XPATH:
				setXpath((String)newValue);
				return;
			case FHIRPackage.SEARCH_PARAMETER__XPATH_USAGE:
				setXpathUsage((String)newValue);
				return;
			case FHIRPackage.SEARCH_PARAMETER__TARGET:
				getTargets().clear();
				getTargets().addAll((Collection<? extends String>)newValue);
				return;
			case FHIRPackage.SEARCH_PARAMETER__COMPARATOR:
				getComparators().clear();
				getComparators().addAll((Collection<? extends String>)newValue);
				return;
			case FHIRPackage.SEARCH_PARAMETER__MODIFIER:
				getModifiers().clear();
				getModifiers().addAll((Collection<? extends String>)newValue);
				return;
			case FHIRPackage.SEARCH_PARAMETER__CHAIN:
				getChains().clear();
				getChains().addAll((Collection<? extends String>)newValue);
				return;
			case FHIRPackage.SEARCH_PARAMETER__COMPONENT:
				getComponents().clear();
				getComponents().addAll((Collection<? extends SearchParameter_ComponentClass>)newValue);
				return;
			case FHIRPackage.SEARCH_PARAMETER__BASE_RESOURCE:
				getBaseResources().clear();
				getBaseResources().addAll((Collection<? extends NamedElement>)newValue);
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
			case FHIRPackage.SEARCH_PARAMETER__BASE_CLASS:
				setBase_Class((org.eclipse.uml2.uml.Class)null);
				return;
			case FHIRPackage.SEARCH_PARAMETER__JURISDICTION:
				getJurisdictions().clear();
				return;
			case FHIRPackage.SEARCH_PARAMETER__PURPOSE:
				setPurpose(PURPOSE_EDEFAULT);
				return;
			case FHIRPackage.SEARCH_PARAMETER__CODE:
				setCode(CODE_EDEFAULT);
				return;
			case FHIRPackage.SEARCH_PARAMETER__BASE:
				getBases().clear();
				return;
			case FHIRPackage.SEARCH_PARAMETER__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case FHIRPackage.SEARCH_PARAMETER__DERIVED_FROM:
				setDerivedFrom(DERIVED_FROM_EDEFAULT);
				return;
			case FHIRPackage.SEARCH_PARAMETER__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case FHIRPackage.SEARCH_PARAMETER__EXPRESSION:
				setExpression(EXPRESSION_EDEFAULT);
				return;
			case FHIRPackage.SEARCH_PARAMETER__XPATH:
				setXpath(XPATH_EDEFAULT);
				return;
			case FHIRPackage.SEARCH_PARAMETER__XPATH_USAGE:
				setXpathUsage(XPATH_USAGE_EDEFAULT);
				return;
			case FHIRPackage.SEARCH_PARAMETER__TARGET:
				getTargets().clear();
				return;
			case FHIRPackage.SEARCH_PARAMETER__COMPARATOR:
				getComparators().clear();
				return;
			case FHIRPackage.SEARCH_PARAMETER__MODIFIER:
				getModifiers().clear();
				return;
			case FHIRPackage.SEARCH_PARAMETER__CHAIN:
				getChains().clear();
				return;
			case FHIRPackage.SEARCH_PARAMETER__COMPONENT:
				getComponents().clear();
				return;
			case FHIRPackage.SEARCH_PARAMETER__BASE_RESOURCE:
				getBaseResources().clear();
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
			case FHIRPackage.SEARCH_PARAMETER__BASE_CLASS:
				return base_Class != null;
			case FHIRPackage.SEARCH_PARAMETER__JURISDICTION:
				return jurisdictions != null && !jurisdictions.isEmpty();
			case FHIRPackage.SEARCH_PARAMETER__PURPOSE:
				return PURPOSE_EDEFAULT == null ? purpose != null : !PURPOSE_EDEFAULT.equals(purpose);
			case FHIRPackage.SEARCH_PARAMETER__CODE:
				return CODE_EDEFAULT == null ? code != null : !CODE_EDEFAULT.equals(code);
			case FHIRPackage.SEARCH_PARAMETER__BASE:
				return bases != null && !bases.isEmpty();
			case FHIRPackage.SEARCH_PARAMETER__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case FHIRPackage.SEARCH_PARAMETER__DERIVED_FROM:
				return DERIVED_FROM_EDEFAULT == null ? derivedFrom != null : !DERIVED_FROM_EDEFAULT.equals(derivedFrom);
			case FHIRPackage.SEARCH_PARAMETER__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case FHIRPackage.SEARCH_PARAMETER__EXPRESSION:
				return EXPRESSION_EDEFAULT == null ? expression != null : !EXPRESSION_EDEFAULT.equals(expression);
			case FHIRPackage.SEARCH_PARAMETER__XPATH:
				return XPATH_EDEFAULT == null ? xpath != null : !XPATH_EDEFAULT.equals(xpath);
			case FHIRPackage.SEARCH_PARAMETER__XPATH_USAGE:
				return XPATH_USAGE_EDEFAULT == null ? xpathUsage != null : !XPATH_USAGE_EDEFAULT.equals(xpathUsage);
			case FHIRPackage.SEARCH_PARAMETER__TARGET:
				return targets != null && !targets.isEmpty();
			case FHIRPackage.SEARCH_PARAMETER__COMPARATOR:
				return comparators != null && !comparators.isEmpty();
			case FHIRPackage.SEARCH_PARAMETER__MODIFIER:
				return modifiers != null && !modifiers.isEmpty();
			case FHIRPackage.SEARCH_PARAMETER__CHAIN:
				return chains != null && !chains.isEmpty();
			case FHIRPackage.SEARCH_PARAMETER__COMPONENT:
				return components != null && !components.isEmpty();
			case FHIRPackage.SEARCH_PARAMETER__BASE_RESOURCE:
				return baseResources != null && !baseResources.isEmpty();
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
		result.append(" (purpose: ");
		result.append(purpose);
		result.append(", code: ");
		result.append(code);
		result.append(", base: ");
		result.append(bases);
		result.append(", type: ");
		result.append(type);
		result.append(", derivedFrom: ");
		result.append(derivedFrom);
		result.append(", description: ");
		result.append(description);
		result.append(", expression: ");
		result.append(expression);
		result.append(", xpath: ");
		result.append(xpath);
		result.append(", xpathUsage: ");
		result.append(xpathUsage);
		result.append(", target: ");
		result.append(targets);
		result.append(", comparator: ");
		result.append(comparators);
		result.append(", modifier: ");
		result.append(modifiers);
		result.append(", chain: ");
		result.append(chains);
		result.append(')');
		return result.toString();
	}

} //SearchParameterImpl
