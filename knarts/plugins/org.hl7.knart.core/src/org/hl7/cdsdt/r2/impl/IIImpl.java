/**
 */
package org.hl7.cdsdt.r2.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.hl7.cdsdt.r2.II;
import org.hl7.cdsdt.r2.R2Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>II</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.cdsdt.r2.impl.IIImpl#getExtension <em>Extension</em>}</li>
 *   <li>{@link org.hl7.cdsdt.r2.impl.IIImpl#getIdentifierName <em>Identifier Name</em>}</li>
 *   <li>{@link org.hl7.cdsdt.r2.impl.IIImpl#getRoot <em>Root</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IIImpl extends ANYImpl implements II {
	/**
	 * The default value of the '{@link #getExtension() <em>Extension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtension()
	 * @generated
	 * @ordered
	 */
	protected static final String EXTENSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExtension() <em>Extension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtension()
	 * @generated
	 * @ordered
	 */
	protected String extension = EXTENSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getIdentifierName() <em>Identifier Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifierName()
	 * @generated
	 * @ordered
	 */
	protected static final String IDENTIFIER_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIdentifierName() <em>Identifier Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifierName()
	 * @generated
	 * @ordered
	 */
	protected String identifierName = IDENTIFIER_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getRoot() <em>Root</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoot()
	 * @generated
	 * @ordered
	 */
	protected static final String ROOT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRoot() <em>Root</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoot()
	 * @generated
	 * @ordered
	 */
	protected String root = ROOT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IIImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return R2Package.Literals.II;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExtension() {
		return extension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtension(String newExtension) {
		String oldExtension = extension;
		extension = newExtension;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, R2Package.II__EXTENSION, oldExtension, extension));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIdentifierName() {
		return identifierName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdentifierName(String newIdentifierName) {
		String oldIdentifierName = identifierName;
		identifierName = newIdentifierName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, R2Package.II__IDENTIFIER_NAME, oldIdentifierName, identifierName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRoot() {
		return root;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoot(String newRoot) {
		String oldRoot = root;
		root = newRoot;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, R2Package.II__ROOT, oldRoot, root));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case R2Package.II__EXTENSION:
				return getExtension();
			case R2Package.II__IDENTIFIER_NAME:
				return getIdentifierName();
			case R2Package.II__ROOT:
				return getRoot();
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
			case R2Package.II__EXTENSION:
				setExtension((String)newValue);
				return;
			case R2Package.II__IDENTIFIER_NAME:
				setIdentifierName((String)newValue);
				return;
			case R2Package.II__ROOT:
				setRoot((String)newValue);
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
			case R2Package.II__EXTENSION:
				setExtension(EXTENSION_EDEFAULT);
				return;
			case R2Package.II__IDENTIFIER_NAME:
				setIdentifierName(IDENTIFIER_NAME_EDEFAULT);
				return;
			case R2Package.II__ROOT:
				setRoot(ROOT_EDEFAULT);
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
			case R2Package.II__EXTENSION:
				return EXTENSION_EDEFAULT == null ? extension != null : !EXTENSION_EDEFAULT.equals(extension);
			case R2Package.II__IDENTIFIER_NAME:
				return IDENTIFIER_NAME_EDEFAULT == null ? identifierName != null : !IDENTIFIER_NAME_EDEFAULT.equals(identifierName);
			case R2Package.II__ROOT:
				return ROOT_EDEFAULT == null ? root != null : !ROOT_EDEFAULT.equals(root);
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
		result.append(" (extension: ");
		result.append(extension);
		result.append(", identifierName: ");
		result.append(identifierName);
		result.append(", root: ");
		result.append(root);
		result.append(')');
		return result.toString();
	}

} //IIImpl
