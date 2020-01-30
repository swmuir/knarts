/**
 */
package fhiRCore.dataTypes.impl;

import fhiRCore.dataTypes.Code;
import fhiRCore.dataTypes.DataTypesPackage;
import fhiRCore.dataTypes.ElementDefinitionElement5;
import fhiRCore.dataTypes.Id;

import fhiRCore.resources.StructureDefinition;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Element Definition Element5</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.dataTypes.impl.ElementDefinitionElement5Impl#getKey <em>Key</em>}</li>
 *   <li>{@link fhiRCore.dataTypes.impl.ElementDefinitionElement5Impl#getRequirements <em>Requirements</em>}</li>
 *   <li>{@link fhiRCore.dataTypes.impl.ElementDefinitionElement5Impl#getSeverity <em>Severity</em>}</li>
 *   <li>{@link fhiRCore.dataTypes.impl.ElementDefinitionElement5Impl#getHuman <em>Human</em>}</li>
 *   <li>{@link fhiRCore.dataTypes.impl.ElementDefinitionElement5Impl#getExpression <em>Expression</em>}</li>
 *   <li>{@link fhiRCore.dataTypes.impl.ElementDefinitionElement5Impl#getXpath <em>Xpath</em>}</li>
 *   <li>{@link fhiRCore.dataTypes.impl.ElementDefinitionElement5Impl#getSource <em>Source</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ElementDefinitionElement5Impl extends ElementImpl implements ElementDefinitionElement5 {
	/**
	 * The cached value of the '{@link #getKey() <em>Key</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKey()
	 * @generated
	 * @ordered
	 */
	protected Id key;

	/**
	 * The cached value of the '{@link #getRequirements() <em>Requirements</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequirements()
	 * @generated
	 * @ordered
	 */
	protected fhiRCore.dataTypes.String requirements;

	/**
	 * The cached value of the '{@link #getSeverity() <em>Severity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeverity()
	 * @generated
	 * @ordered
	 */
	protected Code severity;

	/**
	 * The cached value of the '{@link #getHuman() <em>Human</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHuman()
	 * @generated
	 * @ordered
	 */
	protected fhiRCore.dataTypes.String human;

	/**
	 * The cached value of the '{@link #getExpression() <em>Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpression()
	 * @generated
	 * @ordered
	 */
	protected fhiRCore.dataTypes.String expression;

	/**
	 * The cached value of the '{@link #getXpath() <em>Xpath</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXpath()
	 * @generated
	 * @ordered
	 */
	protected fhiRCore.dataTypes.String xpath;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected StructureDefinition source;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ElementDefinitionElement5Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataTypesPackage.Literals.ELEMENT_DEFINITION_ELEMENT5;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Id getKey() {
		return key;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetKey(Id newKey, NotificationChain msgs) {
		Id oldKey = key;
		key = newKey;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DataTypesPackage.ELEMENT_DEFINITION_ELEMENT5__KEY, oldKey, newKey);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKey(Id newKey) {
		if (newKey != key) {
			NotificationChain msgs = null;
			if (key != null)
				msgs = ((InternalEObject)key).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.ELEMENT_DEFINITION_ELEMENT5__KEY, null, msgs);
			if (newKey != null)
				msgs = ((InternalEObject)newKey).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.ELEMENT_DEFINITION_ELEMENT5__KEY, null, msgs);
			msgs = basicSetKey(newKey, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataTypesPackage.ELEMENT_DEFINITION_ELEMENT5__KEY, newKey, newKey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public fhiRCore.dataTypes.String getRequirements() {
		return requirements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRequirements(fhiRCore.dataTypes.String newRequirements, NotificationChain msgs) {
		fhiRCore.dataTypes.String oldRequirements = requirements;
		requirements = newRequirements;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DataTypesPackage.ELEMENT_DEFINITION_ELEMENT5__REQUIREMENTS, oldRequirements, newRequirements);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequirements(fhiRCore.dataTypes.String newRequirements) {
		if (newRequirements != requirements) {
			NotificationChain msgs = null;
			if (requirements != null)
				msgs = ((InternalEObject)requirements).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.ELEMENT_DEFINITION_ELEMENT5__REQUIREMENTS, null, msgs);
			if (newRequirements != null)
				msgs = ((InternalEObject)newRequirements).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.ELEMENT_DEFINITION_ELEMENT5__REQUIREMENTS, null, msgs);
			msgs = basicSetRequirements(newRequirements, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataTypesPackage.ELEMENT_DEFINITION_ELEMENT5__REQUIREMENTS, newRequirements, newRequirements));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getSeverity() {
		return severity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSeverity(Code newSeverity, NotificationChain msgs) {
		Code oldSeverity = severity;
		severity = newSeverity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DataTypesPackage.ELEMENT_DEFINITION_ELEMENT5__SEVERITY, oldSeverity, newSeverity);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSeverity(Code newSeverity) {
		if (newSeverity != severity) {
			NotificationChain msgs = null;
			if (severity != null)
				msgs = ((InternalEObject)severity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.ELEMENT_DEFINITION_ELEMENT5__SEVERITY, null, msgs);
			if (newSeverity != null)
				msgs = ((InternalEObject)newSeverity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.ELEMENT_DEFINITION_ELEMENT5__SEVERITY, null, msgs);
			msgs = basicSetSeverity(newSeverity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataTypesPackage.ELEMENT_DEFINITION_ELEMENT5__SEVERITY, newSeverity, newSeverity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public fhiRCore.dataTypes.String getHuman() {
		return human;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHuman(fhiRCore.dataTypes.String newHuman, NotificationChain msgs) {
		fhiRCore.dataTypes.String oldHuman = human;
		human = newHuman;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DataTypesPackage.ELEMENT_DEFINITION_ELEMENT5__HUMAN, oldHuman, newHuman);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHuman(fhiRCore.dataTypes.String newHuman) {
		if (newHuman != human) {
			NotificationChain msgs = null;
			if (human != null)
				msgs = ((InternalEObject)human).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.ELEMENT_DEFINITION_ELEMENT5__HUMAN, null, msgs);
			if (newHuman != null)
				msgs = ((InternalEObject)newHuman).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.ELEMENT_DEFINITION_ELEMENT5__HUMAN, null, msgs);
			msgs = basicSetHuman(newHuman, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataTypesPackage.ELEMENT_DEFINITION_ELEMENT5__HUMAN, newHuman, newHuman));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public fhiRCore.dataTypes.String getExpression() {
		return expression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExpression(fhiRCore.dataTypes.String newExpression, NotificationChain msgs) {
		fhiRCore.dataTypes.String oldExpression = expression;
		expression = newExpression;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DataTypesPackage.ELEMENT_DEFINITION_ELEMENT5__EXPRESSION, oldExpression, newExpression);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpression(fhiRCore.dataTypes.String newExpression) {
		if (newExpression != expression) {
			NotificationChain msgs = null;
			if (expression != null)
				msgs = ((InternalEObject)expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.ELEMENT_DEFINITION_ELEMENT5__EXPRESSION, null, msgs);
			if (newExpression != null)
				msgs = ((InternalEObject)newExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.ELEMENT_DEFINITION_ELEMENT5__EXPRESSION, null, msgs);
			msgs = basicSetExpression(newExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataTypesPackage.ELEMENT_DEFINITION_ELEMENT5__EXPRESSION, newExpression, newExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public fhiRCore.dataTypes.String getXpath() {
		return xpath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetXpath(fhiRCore.dataTypes.String newXpath, NotificationChain msgs) {
		fhiRCore.dataTypes.String oldXpath = xpath;
		xpath = newXpath;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DataTypesPackage.ELEMENT_DEFINITION_ELEMENT5__XPATH, oldXpath, newXpath);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXpath(fhiRCore.dataTypes.String newXpath) {
		if (newXpath != xpath) {
			NotificationChain msgs = null;
			if (xpath != null)
				msgs = ((InternalEObject)xpath).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.ELEMENT_DEFINITION_ELEMENT5__XPATH, null, msgs);
			if (newXpath != null)
				msgs = ((InternalEObject)newXpath).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.ELEMENT_DEFINITION_ELEMENT5__XPATH, null, msgs);
			msgs = basicSetXpath(newXpath, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataTypesPackage.ELEMENT_DEFINITION_ELEMENT5__XPATH, newXpath, newXpath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureDefinition getSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSource(StructureDefinition newSource, NotificationChain msgs) {
		StructureDefinition oldSource = source;
		source = newSource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DataTypesPackage.ELEMENT_DEFINITION_ELEMENT5__SOURCE, oldSource, newSource);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(StructureDefinition newSource) {
		if (newSource != source) {
			NotificationChain msgs = null;
			if (source != null)
				msgs = ((InternalEObject)source).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.ELEMENT_DEFINITION_ELEMENT5__SOURCE, null, msgs);
			if (newSource != null)
				msgs = ((InternalEObject)newSource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.ELEMENT_DEFINITION_ELEMENT5__SOURCE, null, msgs);
			msgs = basicSetSource(newSource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataTypesPackage.ELEMENT_DEFINITION_ELEMENT5__SOURCE, newSource, newSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DataTypesPackage.ELEMENT_DEFINITION_ELEMENT5__KEY:
				return basicSetKey(null, msgs);
			case DataTypesPackage.ELEMENT_DEFINITION_ELEMENT5__REQUIREMENTS:
				return basicSetRequirements(null, msgs);
			case DataTypesPackage.ELEMENT_DEFINITION_ELEMENT5__SEVERITY:
				return basicSetSeverity(null, msgs);
			case DataTypesPackage.ELEMENT_DEFINITION_ELEMENT5__HUMAN:
				return basicSetHuman(null, msgs);
			case DataTypesPackage.ELEMENT_DEFINITION_ELEMENT5__EXPRESSION:
				return basicSetExpression(null, msgs);
			case DataTypesPackage.ELEMENT_DEFINITION_ELEMENT5__XPATH:
				return basicSetXpath(null, msgs);
			case DataTypesPackage.ELEMENT_DEFINITION_ELEMENT5__SOURCE:
				return basicSetSource(null, msgs);
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
			case DataTypesPackage.ELEMENT_DEFINITION_ELEMENT5__KEY:
				return getKey();
			case DataTypesPackage.ELEMENT_DEFINITION_ELEMENT5__REQUIREMENTS:
				return getRequirements();
			case DataTypesPackage.ELEMENT_DEFINITION_ELEMENT5__SEVERITY:
				return getSeverity();
			case DataTypesPackage.ELEMENT_DEFINITION_ELEMENT5__HUMAN:
				return getHuman();
			case DataTypesPackage.ELEMENT_DEFINITION_ELEMENT5__EXPRESSION:
				return getExpression();
			case DataTypesPackage.ELEMENT_DEFINITION_ELEMENT5__XPATH:
				return getXpath();
			case DataTypesPackage.ELEMENT_DEFINITION_ELEMENT5__SOURCE:
				return getSource();
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
			case DataTypesPackage.ELEMENT_DEFINITION_ELEMENT5__KEY:
				setKey((Id)newValue);
				return;
			case DataTypesPackage.ELEMENT_DEFINITION_ELEMENT5__REQUIREMENTS:
				setRequirements((fhiRCore.dataTypes.String)newValue);
				return;
			case DataTypesPackage.ELEMENT_DEFINITION_ELEMENT5__SEVERITY:
				setSeverity((Code)newValue);
				return;
			case DataTypesPackage.ELEMENT_DEFINITION_ELEMENT5__HUMAN:
				setHuman((fhiRCore.dataTypes.String)newValue);
				return;
			case DataTypesPackage.ELEMENT_DEFINITION_ELEMENT5__EXPRESSION:
				setExpression((fhiRCore.dataTypes.String)newValue);
				return;
			case DataTypesPackage.ELEMENT_DEFINITION_ELEMENT5__XPATH:
				setXpath((fhiRCore.dataTypes.String)newValue);
				return;
			case DataTypesPackage.ELEMENT_DEFINITION_ELEMENT5__SOURCE:
				setSource((StructureDefinition)newValue);
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
			case DataTypesPackage.ELEMENT_DEFINITION_ELEMENT5__KEY:
				setKey((Id)null);
				return;
			case DataTypesPackage.ELEMENT_DEFINITION_ELEMENT5__REQUIREMENTS:
				setRequirements((fhiRCore.dataTypes.String)null);
				return;
			case DataTypesPackage.ELEMENT_DEFINITION_ELEMENT5__SEVERITY:
				setSeverity((Code)null);
				return;
			case DataTypesPackage.ELEMENT_DEFINITION_ELEMENT5__HUMAN:
				setHuman((fhiRCore.dataTypes.String)null);
				return;
			case DataTypesPackage.ELEMENT_DEFINITION_ELEMENT5__EXPRESSION:
				setExpression((fhiRCore.dataTypes.String)null);
				return;
			case DataTypesPackage.ELEMENT_DEFINITION_ELEMENT5__XPATH:
				setXpath((fhiRCore.dataTypes.String)null);
				return;
			case DataTypesPackage.ELEMENT_DEFINITION_ELEMENT5__SOURCE:
				setSource((StructureDefinition)null);
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
			case DataTypesPackage.ELEMENT_DEFINITION_ELEMENT5__KEY:
				return key != null;
			case DataTypesPackage.ELEMENT_DEFINITION_ELEMENT5__REQUIREMENTS:
				return requirements != null;
			case DataTypesPackage.ELEMENT_DEFINITION_ELEMENT5__SEVERITY:
				return severity != null;
			case DataTypesPackage.ELEMENT_DEFINITION_ELEMENT5__HUMAN:
				return human != null;
			case DataTypesPackage.ELEMENT_DEFINITION_ELEMENT5__EXPRESSION:
				return expression != null;
			case DataTypesPackage.ELEMENT_DEFINITION_ELEMENT5__XPATH:
				return xpath != null;
			case DataTypesPackage.ELEMENT_DEFINITION_ELEMENT5__SOURCE:
				return source != null;
		}
		return super.eIsSet(featureID);
	}

} //ElementDefinitionElement5Impl
