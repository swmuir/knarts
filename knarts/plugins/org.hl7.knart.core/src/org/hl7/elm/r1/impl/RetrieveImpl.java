/**
 */
package org.hl7.elm.r1.impl;

import javax.xml.namespace.QName;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.hl7.elm.r1.Expression;
import org.hl7.elm.r1.R1Package;
import org.hl7.elm.r1.Retrieve;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Retrieve</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.elm.r1.impl.RetrieveImpl#getCodes <em>Codes</em>}</li>
 *   <li>{@link org.hl7.elm.r1.impl.RetrieveImpl#getDateRange <em>Date Range</em>}</li>
 *   <li>{@link org.hl7.elm.r1.impl.RetrieveImpl#getCodeProperty <em>Code Property</em>}</li>
 *   <li>{@link org.hl7.elm.r1.impl.RetrieveImpl#getDataType <em>Data Type</em>}</li>
 *   <li>{@link org.hl7.elm.r1.impl.RetrieveImpl#getDateHighProperty <em>Date High Property</em>}</li>
 *   <li>{@link org.hl7.elm.r1.impl.RetrieveImpl#getDateLowProperty <em>Date Low Property</em>}</li>
 *   <li>{@link org.hl7.elm.r1.impl.RetrieveImpl#getDateProperty <em>Date Property</em>}</li>
 *   <li>{@link org.hl7.elm.r1.impl.RetrieveImpl#getIdProperty <em>Id Property</em>}</li>
 *   <li>{@link org.hl7.elm.r1.impl.RetrieveImpl#getScope <em>Scope</em>}</li>
 *   <li>{@link org.hl7.elm.r1.impl.RetrieveImpl#getTemplateId <em>Template Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RetrieveImpl extends ExpressionImpl implements Retrieve {
	/**
	 * The cached value of the '{@link #getCodes() <em>Codes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodes()
	 * @generated
	 * @ordered
	 */
	protected Expression codes;

	/**
	 * The cached value of the '{@link #getDateRange() <em>Date Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateRange()
	 * @generated
	 * @ordered
	 */
	protected Expression dateRange;

	/**
	 * The default value of the '{@link #getCodeProperty() <em>Code Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodeProperty()
	 * @generated
	 * @ordered
	 */
	protected static final String CODE_PROPERTY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCodeProperty() <em>Code Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodeProperty()
	 * @generated
	 * @ordered
	 */
	protected String codeProperty = CODE_PROPERTY_EDEFAULT;

	/**
	 * The default value of the '{@link #getDataType() <em>Data Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataType()
	 * @generated
	 * @ordered
	 */
	protected static final QName DATA_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDataType() <em>Data Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataType()
	 * @generated
	 * @ordered
	 */
	protected QName dataType = DATA_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDateHighProperty() <em>Date High Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateHighProperty()
	 * @generated
	 * @ordered
	 */
	protected static final String DATE_HIGH_PROPERTY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDateHighProperty() <em>Date High Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateHighProperty()
	 * @generated
	 * @ordered
	 */
	protected String dateHighProperty = DATE_HIGH_PROPERTY_EDEFAULT;

	/**
	 * The default value of the '{@link #getDateLowProperty() <em>Date Low Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateLowProperty()
	 * @generated
	 * @ordered
	 */
	protected static final String DATE_LOW_PROPERTY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDateLowProperty() <em>Date Low Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateLowProperty()
	 * @generated
	 * @ordered
	 */
	protected String dateLowProperty = DATE_LOW_PROPERTY_EDEFAULT;

	/**
	 * The default value of the '{@link #getDateProperty() <em>Date Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateProperty()
	 * @generated
	 * @ordered
	 */
	protected static final String DATE_PROPERTY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDateProperty() <em>Date Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateProperty()
	 * @generated
	 * @ordered
	 */
	protected String dateProperty = DATE_PROPERTY_EDEFAULT;

	/**
	 * The default value of the '{@link #getIdProperty() <em>Id Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdProperty()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_PROPERTY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIdProperty() <em>Id Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdProperty()
	 * @generated
	 * @ordered
	 */
	protected String idProperty = ID_PROPERTY_EDEFAULT;

	/**
	 * The default value of the '{@link #getScope() <em>Scope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScope()
	 * @generated
	 * @ordered
	 */
	protected static final String SCOPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getScope() <em>Scope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScope()
	 * @generated
	 * @ordered
	 */
	protected String scope = SCOPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTemplateId() <em>Template Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemplateId()
	 * @generated
	 * @ordered
	 */
	protected static final String TEMPLATE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTemplateId() <em>Template Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemplateId()
	 * @generated
	 * @ordered
	 */
	protected String templateId = TEMPLATE_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RetrieveImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return R1Package.eINSTANCE.getRetrieve();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getCodes() {
		return codes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCodes(Expression newCodes, NotificationChain msgs) {
		Expression oldCodes = codes;
		codes = newCodes;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, R1Package.RETRIEVE__CODES, oldCodes, newCodes);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCodes(Expression newCodes) {
		if (newCodes != codes) {
			NotificationChain msgs = null;
			if (codes != null)
				msgs = ((InternalEObject)codes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - R1Package.RETRIEVE__CODES, null, msgs);
			if (newCodes != null)
				msgs = ((InternalEObject)newCodes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - R1Package.RETRIEVE__CODES, null, msgs);
			msgs = basicSetCodes(newCodes, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, R1Package.RETRIEVE__CODES, newCodes, newCodes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getDateRange() {
		return dateRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDateRange(Expression newDateRange, NotificationChain msgs) {
		Expression oldDateRange = dateRange;
		dateRange = newDateRange;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, R1Package.RETRIEVE__DATE_RANGE, oldDateRange, newDateRange);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateRange(Expression newDateRange) {
		if (newDateRange != dateRange) {
			NotificationChain msgs = null;
			if (dateRange != null)
				msgs = ((InternalEObject)dateRange).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - R1Package.RETRIEVE__DATE_RANGE, null, msgs);
			if (newDateRange != null)
				msgs = ((InternalEObject)newDateRange).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - R1Package.RETRIEVE__DATE_RANGE, null, msgs);
			msgs = basicSetDateRange(newDateRange, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, R1Package.RETRIEVE__DATE_RANGE, newDateRange, newDateRange));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCodeProperty() {
		return codeProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCodeProperty(String newCodeProperty) {
		String oldCodeProperty = codeProperty;
		codeProperty = newCodeProperty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, R1Package.RETRIEVE__CODE_PROPERTY, oldCodeProperty, codeProperty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QName getDataType() {
		return dataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataType(QName newDataType) {
		QName oldDataType = dataType;
		dataType = newDataType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, R1Package.RETRIEVE__DATA_TYPE, oldDataType, dataType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDateHighProperty() {
		return dateHighProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateHighProperty(String newDateHighProperty) {
		String oldDateHighProperty = dateHighProperty;
		dateHighProperty = newDateHighProperty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, R1Package.RETRIEVE__DATE_HIGH_PROPERTY, oldDateHighProperty, dateHighProperty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDateLowProperty() {
		return dateLowProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateLowProperty(String newDateLowProperty) {
		String oldDateLowProperty = dateLowProperty;
		dateLowProperty = newDateLowProperty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, R1Package.RETRIEVE__DATE_LOW_PROPERTY, oldDateLowProperty, dateLowProperty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDateProperty() {
		return dateProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateProperty(String newDateProperty) {
		String oldDateProperty = dateProperty;
		dateProperty = newDateProperty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, R1Package.RETRIEVE__DATE_PROPERTY, oldDateProperty, dateProperty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIdProperty() {
		return idProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdProperty(String newIdProperty) {
		String oldIdProperty = idProperty;
		idProperty = newIdProperty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, R1Package.RETRIEVE__ID_PROPERTY, oldIdProperty, idProperty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getScope() {
		return scope;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScope(String newScope) {
		String oldScope = scope;
		scope = newScope;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, R1Package.RETRIEVE__SCOPE, oldScope, scope));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTemplateId() {
		return templateId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTemplateId(String newTemplateId) {
		String oldTemplateId = templateId;
		templateId = newTemplateId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, R1Package.RETRIEVE__TEMPLATE_ID, oldTemplateId, templateId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case R1Package.RETRIEVE__CODES:
				return basicSetCodes(null, msgs);
			case R1Package.RETRIEVE__DATE_RANGE:
				return basicSetDateRange(null, msgs);
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
			case R1Package.RETRIEVE__CODES:
				return getCodes();
			case R1Package.RETRIEVE__DATE_RANGE:
				return getDateRange();
			case R1Package.RETRIEVE__CODE_PROPERTY:
				return getCodeProperty();
			case R1Package.RETRIEVE__DATA_TYPE:
				return getDataType();
			case R1Package.RETRIEVE__DATE_HIGH_PROPERTY:
				return getDateHighProperty();
			case R1Package.RETRIEVE__DATE_LOW_PROPERTY:
				return getDateLowProperty();
			case R1Package.RETRIEVE__DATE_PROPERTY:
				return getDateProperty();
			case R1Package.RETRIEVE__ID_PROPERTY:
				return getIdProperty();
			case R1Package.RETRIEVE__SCOPE:
				return getScope();
			case R1Package.RETRIEVE__TEMPLATE_ID:
				return getTemplateId();
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
			case R1Package.RETRIEVE__CODES:
				setCodes((Expression)newValue);
				return;
			case R1Package.RETRIEVE__DATE_RANGE:
				setDateRange((Expression)newValue);
				return;
			case R1Package.RETRIEVE__CODE_PROPERTY:
				setCodeProperty((String)newValue);
				return;
			case R1Package.RETRIEVE__DATA_TYPE:
				setDataType((QName)newValue);
				return;
			case R1Package.RETRIEVE__DATE_HIGH_PROPERTY:
				setDateHighProperty((String)newValue);
				return;
			case R1Package.RETRIEVE__DATE_LOW_PROPERTY:
				setDateLowProperty((String)newValue);
				return;
			case R1Package.RETRIEVE__DATE_PROPERTY:
				setDateProperty((String)newValue);
				return;
			case R1Package.RETRIEVE__ID_PROPERTY:
				setIdProperty((String)newValue);
				return;
			case R1Package.RETRIEVE__SCOPE:
				setScope((String)newValue);
				return;
			case R1Package.RETRIEVE__TEMPLATE_ID:
				setTemplateId((String)newValue);
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
			case R1Package.RETRIEVE__CODES:
				setCodes((Expression)null);
				return;
			case R1Package.RETRIEVE__DATE_RANGE:
				setDateRange((Expression)null);
				return;
			case R1Package.RETRIEVE__CODE_PROPERTY:
				setCodeProperty(CODE_PROPERTY_EDEFAULT);
				return;
			case R1Package.RETRIEVE__DATA_TYPE:
				setDataType(DATA_TYPE_EDEFAULT);
				return;
			case R1Package.RETRIEVE__DATE_HIGH_PROPERTY:
				setDateHighProperty(DATE_HIGH_PROPERTY_EDEFAULT);
				return;
			case R1Package.RETRIEVE__DATE_LOW_PROPERTY:
				setDateLowProperty(DATE_LOW_PROPERTY_EDEFAULT);
				return;
			case R1Package.RETRIEVE__DATE_PROPERTY:
				setDateProperty(DATE_PROPERTY_EDEFAULT);
				return;
			case R1Package.RETRIEVE__ID_PROPERTY:
				setIdProperty(ID_PROPERTY_EDEFAULT);
				return;
			case R1Package.RETRIEVE__SCOPE:
				setScope(SCOPE_EDEFAULT);
				return;
			case R1Package.RETRIEVE__TEMPLATE_ID:
				setTemplateId(TEMPLATE_ID_EDEFAULT);
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
			case R1Package.RETRIEVE__CODES:
				return codes != null;
			case R1Package.RETRIEVE__DATE_RANGE:
				return dateRange != null;
			case R1Package.RETRIEVE__CODE_PROPERTY:
				return CODE_PROPERTY_EDEFAULT == null ? codeProperty != null : !CODE_PROPERTY_EDEFAULT.equals(codeProperty);
			case R1Package.RETRIEVE__DATA_TYPE:
				return DATA_TYPE_EDEFAULT == null ? dataType != null : !DATA_TYPE_EDEFAULT.equals(dataType);
			case R1Package.RETRIEVE__DATE_HIGH_PROPERTY:
				return DATE_HIGH_PROPERTY_EDEFAULT == null ? dateHighProperty != null : !DATE_HIGH_PROPERTY_EDEFAULT.equals(dateHighProperty);
			case R1Package.RETRIEVE__DATE_LOW_PROPERTY:
				return DATE_LOW_PROPERTY_EDEFAULT == null ? dateLowProperty != null : !DATE_LOW_PROPERTY_EDEFAULT.equals(dateLowProperty);
			case R1Package.RETRIEVE__DATE_PROPERTY:
				return DATE_PROPERTY_EDEFAULT == null ? dateProperty != null : !DATE_PROPERTY_EDEFAULT.equals(dateProperty);
			case R1Package.RETRIEVE__ID_PROPERTY:
				return ID_PROPERTY_EDEFAULT == null ? idProperty != null : !ID_PROPERTY_EDEFAULT.equals(idProperty);
			case R1Package.RETRIEVE__SCOPE:
				return SCOPE_EDEFAULT == null ? scope != null : !SCOPE_EDEFAULT.equals(scope);
			case R1Package.RETRIEVE__TEMPLATE_ID:
				return TEMPLATE_ID_EDEFAULT == null ? templateId != null : !TEMPLATE_ID_EDEFAULT.equals(templateId);
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
		result.append(" (codeProperty: ");
		result.append(codeProperty);
		result.append(", dataType: ");
		result.append(dataType);
		result.append(", dateHighProperty: ");
		result.append(dateHighProperty);
		result.append(", dateLowProperty: ");
		result.append(dateLowProperty);
		result.append(", dateProperty: ");
		result.append(dateProperty);
		result.append(", idProperty: ");
		result.append(idProperty);
		result.append(", scope: ");
		result.append(scope);
		result.append(", templateId: ");
		result.append(templateId);
		result.append(')');
		return result.toString();
	}

} //RetrieveImpl
