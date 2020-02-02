/**
 */
package org.hl7.cdsdt.r2.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.hl7.cdsdt.r2.Compression;
import org.hl7.cdsdt.r2.ED;
import org.hl7.cdsdt.r2.IntegrityCheckAlgorithm;
import org.hl7.cdsdt.r2.R2Package;
import org.hl7.cdsdt.r2.ST;
import org.hl7.cdsdt.r2.TEL;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ED</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.cdsdt.r2.impl.EDImpl#getData <em>Data</em>}</li>
 *   <li>{@link org.hl7.cdsdt.r2.impl.EDImpl#getXml <em>Xml</em>}</li>
 *   <li>{@link org.hl7.cdsdt.r2.impl.EDImpl#getReference <em>Reference</em>}</li>
 *   <li>{@link org.hl7.cdsdt.r2.impl.EDImpl#getIntegrityCheck <em>Integrity Check</em>}</li>
 *   <li>{@link org.hl7.cdsdt.r2.impl.EDImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.hl7.cdsdt.r2.impl.EDImpl#getCharset <em>Charset</em>}</li>
 *   <li>{@link org.hl7.cdsdt.r2.impl.EDImpl#getCompression <em>Compression</em>}</li>
 *   <li>{@link org.hl7.cdsdt.r2.impl.EDImpl#getIntegrityCheckAlgorithm <em>Integrity Check Algorithm</em>}</li>
 *   <li>{@link org.hl7.cdsdt.r2.impl.EDImpl#getLanguage <em>Language</em>}</li>
 *   <li>{@link org.hl7.cdsdt.r2.impl.EDImpl#getMediaType <em>Media Type</em>}</li>
 *   <li>{@link org.hl7.cdsdt.r2.impl.EDImpl#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EDImpl extends ANYImpl implements ED {
	/**
	 * The default value of the '{@link #getData() <em>Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getData()
	 * @generated
	 * @ordered
	 */
	protected static final byte[] DATA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getData() <em>Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getData()
	 * @generated
	 * @ordered
	 */
	protected byte[] data = DATA_EDEFAULT;

	/**
	 * The cached value of the '{@link #getXml() <em>Xml</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXml()
	 * @generated
	 * @ordered
	 */
	protected EObject xml;

	/**
	 * The cached value of the '{@link #getReference() <em>Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReference()
	 * @generated
	 * @ordered
	 */
	protected TEL reference;

	/**
	 * The default value of the '{@link #getIntegrityCheck() <em>Integrity Check</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntegrityCheck()
	 * @generated
	 * @ordered
	 */
	protected static final byte[] INTEGRITY_CHECK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIntegrityCheck() <em>Integrity Check</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntegrityCheck()
	 * @generated
	 * @ordered
	 */
	protected byte[] integrityCheck = INTEGRITY_CHECK_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected ST description;

	/**
	 * The default value of the '{@link #getCharset() <em>Charset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCharset()
	 * @generated
	 * @ordered
	 */
	protected static final String CHARSET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCharset() <em>Charset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCharset()
	 * @generated
	 * @ordered
	 */
	protected String charset = CHARSET_EDEFAULT;

	/**
	 * The default value of the '{@link #getCompression() <em>Compression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompression()
	 * @generated
	 * @ordered
	 */
	protected static final Compression COMPRESSION_EDEFAULT = Compression.DF;

	/**
	 * The cached value of the '{@link #getCompression() <em>Compression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompression()
	 * @generated
	 * @ordered
	 */
	protected Compression compression = COMPRESSION_EDEFAULT;

	/**
	 * This is true if the Compression attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean compressionESet;

	/**
	 * The default value of the '{@link #getIntegrityCheckAlgorithm() <em>Integrity Check Algorithm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntegrityCheckAlgorithm()
	 * @generated
	 * @ordered
	 */
	protected static final IntegrityCheckAlgorithm INTEGRITY_CHECK_ALGORITHM_EDEFAULT = IntegrityCheckAlgorithm.SHA1;

	/**
	 * The cached value of the '{@link #getIntegrityCheckAlgorithm() <em>Integrity Check Algorithm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntegrityCheckAlgorithm()
	 * @generated
	 * @ordered
	 */
	protected IntegrityCheckAlgorithm integrityCheckAlgorithm = INTEGRITY_CHECK_ALGORITHM_EDEFAULT;

	/**
	 * This is true if the Integrity Check Algorithm attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean integrityCheckAlgorithmESet;

	/**
	 * The default value of the '{@link #getLanguage() <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguage()
	 * @generated
	 * @ordered
	 */
	protected static final String LANGUAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLanguage() <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguage()
	 * @generated
	 * @ordered
	 */
	protected String language = LANGUAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMediaType() <em>Media Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMediaType()
	 * @generated
	 * @ordered
	 */
	protected static final String MEDIA_TYPE_EDEFAULT = "text/plain";

	/**
	 * The cached value of the '{@link #getMediaType() <em>Media Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMediaType()
	 * @generated
	 * @ordered
	 */
	protected String mediaType = MEDIA_TYPE_EDEFAULT;

	/**
	 * This is true if the Media Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean mediaTypeESet;

	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected String value = VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EDImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return R2Package.Literals.ED;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte[] getData() {
		return data;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setData(byte[] newData) {
		byte[] oldData = data;
		data = newData;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, R2Package.ED__DATA, oldData, data));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getXml() {
		return xml;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetXml(EObject newXml, NotificationChain msgs) {
		EObject oldXml = xml;
		xml = newXml;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, R2Package.ED__XML, oldXml, newXml);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXml(EObject newXml) {
		if (newXml != xml) {
			NotificationChain msgs = null;
			if (xml != null)
				msgs = ((InternalEObject)xml).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - R2Package.ED__XML, null, msgs);
			if (newXml != null)
				msgs = ((InternalEObject)newXml).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - R2Package.ED__XML, null, msgs);
			msgs = basicSetXml(newXml, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, R2Package.ED__XML, newXml, newXml));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TEL getReference() {
		return reference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReference(TEL newReference, NotificationChain msgs) {
		TEL oldReference = reference;
		reference = newReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, R2Package.ED__REFERENCE, oldReference, newReference);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReference(TEL newReference) {
		if (newReference != reference) {
			NotificationChain msgs = null;
			if (reference != null)
				msgs = ((InternalEObject)reference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - R2Package.ED__REFERENCE, null, msgs);
			if (newReference != null)
				msgs = ((InternalEObject)newReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - R2Package.ED__REFERENCE, null, msgs);
			msgs = basicSetReference(newReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, R2Package.ED__REFERENCE, newReference, newReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte[] getIntegrityCheck() {
		return integrityCheck;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIntegrityCheck(byte[] newIntegrityCheck) {
		byte[] oldIntegrityCheck = integrityCheck;
		integrityCheck = newIntegrityCheck;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, R2Package.ED__INTEGRITY_CHECK, oldIntegrityCheck, integrityCheck));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ST getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDescription(ST newDescription, NotificationChain msgs) {
		ST oldDescription = description;
		description = newDescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, R2Package.ED__DESCRIPTION, oldDescription, newDescription);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(ST newDescription) {
		if (newDescription != description) {
			NotificationChain msgs = null;
			if (description != null)
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - R2Package.ED__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - R2Package.ED__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, R2Package.ED__DESCRIPTION, newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCharset() {
		return charset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCharset(String newCharset) {
		String oldCharset = charset;
		charset = newCharset;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, R2Package.ED__CHARSET, oldCharset, charset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Compression getCompression() {
		return compression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompression(Compression newCompression) {
		Compression oldCompression = compression;
		compression = newCompression == null ? COMPRESSION_EDEFAULT : newCompression;
		boolean oldCompressionESet = compressionESet;
		compressionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, R2Package.ED__COMPRESSION, oldCompression, compression, !oldCompressionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCompression() {
		Compression oldCompression = compression;
		boolean oldCompressionESet = compressionESet;
		compression = COMPRESSION_EDEFAULT;
		compressionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, R2Package.ED__COMPRESSION, oldCompression, COMPRESSION_EDEFAULT, oldCompressionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCompression() {
		return compressionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegrityCheckAlgorithm getIntegrityCheckAlgorithm() {
		return integrityCheckAlgorithm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIntegrityCheckAlgorithm(IntegrityCheckAlgorithm newIntegrityCheckAlgorithm) {
		IntegrityCheckAlgorithm oldIntegrityCheckAlgorithm = integrityCheckAlgorithm;
		integrityCheckAlgorithm = newIntegrityCheckAlgorithm == null ? INTEGRITY_CHECK_ALGORITHM_EDEFAULT : newIntegrityCheckAlgorithm;
		boolean oldIntegrityCheckAlgorithmESet = integrityCheckAlgorithmESet;
		integrityCheckAlgorithmESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, R2Package.ED__INTEGRITY_CHECK_ALGORITHM, oldIntegrityCheckAlgorithm, integrityCheckAlgorithm, !oldIntegrityCheckAlgorithmESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIntegrityCheckAlgorithm() {
		IntegrityCheckAlgorithm oldIntegrityCheckAlgorithm = integrityCheckAlgorithm;
		boolean oldIntegrityCheckAlgorithmESet = integrityCheckAlgorithmESet;
		integrityCheckAlgorithm = INTEGRITY_CHECK_ALGORITHM_EDEFAULT;
		integrityCheckAlgorithmESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, R2Package.ED__INTEGRITY_CHECK_ALGORITHM, oldIntegrityCheckAlgorithm, INTEGRITY_CHECK_ALGORITHM_EDEFAULT, oldIntegrityCheckAlgorithmESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIntegrityCheckAlgorithm() {
		return integrityCheckAlgorithmESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLanguage() {
		return language;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLanguage(String newLanguage) {
		String oldLanguage = language;
		language = newLanguage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, R2Package.ED__LANGUAGE, oldLanguage, language));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMediaType() {
		return mediaType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMediaType(String newMediaType) {
		String oldMediaType = mediaType;
		mediaType = newMediaType;
		boolean oldMediaTypeESet = mediaTypeESet;
		mediaTypeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, R2Package.ED__MEDIA_TYPE, oldMediaType, mediaType, !oldMediaTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMediaType() {
		String oldMediaType = mediaType;
		boolean oldMediaTypeESet = mediaTypeESet;
		mediaType = MEDIA_TYPE_EDEFAULT;
		mediaTypeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, R2Package.ED__MEDIA_TYPE, oldMediaType, MEDIA_TYPE_EDEFAULT, oldMediaTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMediaType() {
		return mediaTypeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(String newValue) {
		String oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, R2Package.ED__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case R2Package.ED__XML:
				return basicSetXml(null, msgs);
			case R2Package.ED__REFERENCE:
				return basicSetReference(null, msgs);
			case R2Package.ED__DESCRIPTION:
				return basicSetDescription(null, msgs);
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
			case R2Package.ED__DATA:
				return getData();
			case R2Package.ED__XML:
				return getXml();
			case R2Package.ED__REFERENCE:
				return getReference();
			case R2Package.ED__INTEGRITY_CHECK:
				return getIntegrityCheck();
			case R2Package.ED__DESCRIPTION:
				return getDescription();
			case R2Package.ED__CHARSET:
				return getCharset();
			case R2Package.ED__COMPRESSION:
				return getCompression();
			case R2Package.ED__INTEGRITY_CHECK_ALGORITHM:
				return getIntegrityCheckAlgorithm();
			case R2Package.ED__LANGUAGE:
				return getLanguage();
			case R2Package.ED__MEDIA_TYPE:
				return getMediaType();
			case R2Package.ED__VALUE:
				return getValue();
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
			case R2Package.ED__DATA:
				setData((byte[])newValue);
				return;
			case R2Package.ED__XML:
				setXml((EObject)newValue);
				return;
			case R2Package.ED__REFERENCE:
				setReference((TEL)newValue);
				return;
			case R2Package.ED__INTEGRITY_CHECK:
				setIntegrityCheck((byte[])newValue);
				return;
			case R2Package.ED__DESCRIPTION:
				setDescription((ST)newValue);
				return;
			case R2Package.ED__CHARSET:
				setCharset((String)newValue);
				return;
			case R2Package.ED__COMPRESSION:
				setCompression((Compression)newValue);
				return;
			case R2Package.ED__INTEGRITY_CHECK_ALGORITHM:
				setIntegrityCheckAlgorithm((IntegrityCheckAlgorithm)newValue);
				return;
			case R2Package.ED__LANGUAGE:
				setLanguage((String)newValue);
				return;
			case R2Package.ED__MEDIA_TYPE:
				setMediaType((String)newValue);
				return;
			case R2Package.ED__VALUE:
				setValue((String)newValue);
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
			case R2Package.ED__DATA:
				setData(DATA_EDEFAULT);
				return;
			case R2Package.ED__XML:
				setXml((EObject)null);
				return;
			case R2Package.ED__REFERENCE:
				setReference((TEL)null);
				return;
			case R2Package.ED__INTEGRITY_CHECK:
				setIntegrityCheck(INTEGRITY_CHECK_EDEFAULT);
				return;
			case R2Package.ED__DESCRIPTION:
				setDescription((ST)null);
				return;
			case R2Package.ED__CHARSET:
				setCharset(CHARSET_EDEFAULT);
				return;
			case R2Package.ED__COMPRESSION:
				unsetCompression();
				return;
			case R2Package.ED__INTEGRITY_CHECK_ALGORITHM:
				unsetIntegrityCheckAlgorithm();
				return;
			case R2Package.ED__LANGUAGE:
				setLanguage(LANGUAGE_EDEFAULT);
				return;
			case R2Package.ED__MEDIA_TYPE:
				unsetMediaType();
				return;
			case R2Package.ED__VALUE:
				setValue(VALUE_EDEFAULT);
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
			case R2Package.ED__DATA:
				return DATA_EDEFAULT == null ? data != null : !DATA_EDEFAULT.equals(data);
			case R2Package.ED__XML:
				return xml != null;
			case R2Package.ED__REFERENCE:
				return reference != null;
			case R2Package.ED__INTEGRITY_CHECK:
				return INTEGRITY_CHECK_EDEFAULT == null ? integrityCheck != null : !INTEGRITY_CHECK_EDEFAULT.equals(integrityCheck);
			case R2Package.ED__DESCRIPTION:
				return description != null;
			case R2Package.ED__CHARSET:
				return CHARSET_EDEFAULT == null ? charset != null : !CHARSET_EDEFAULT.equals(charset);
			case R2Package.ED__COMPRESSION:
				return isSetCompression();
			case R2Package.ED__INTEGRITY_CHECK_ALGORITHM:
				return isSetIntegrityCheckAlgorithm();
			case R2Package.ED__LANGUAGE:
				return LANGUAGE_EDEFAULT == null ? language != null : !LANGUAGE_EDEFAULT.equals(language);
			case R2Package.ED__MEDIA_TYPE:
				return isSetMediaType();
			case R2Package.ED__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
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
		result.append(" (data: ");
		result.append(data);
		result.append(", integrityCheck: ");
		result.append(integrityCheck);
		result.append(", charset: ");
		result.append(charset);
		result.append(", compression: ");
		if (compressionESet) result.append(compression); else result.append("<unset>");
		result.append(", integrityCheckAlgorithm: ");
		if (integrityCheckAlgorithmESet) result.append(integrityCheckAlgorithm); else result.append("<unset>");
		result.append(", language: ");
		result.append(language);
		result.append(", mediaType: ");
		if (mediaTypeESet) result.append(mediaType); else result.append("<unset>");
		result.append(", value: ");
		result.append(value);
		result.append(')');
		return result.toString();
	}

} //EDImpl
