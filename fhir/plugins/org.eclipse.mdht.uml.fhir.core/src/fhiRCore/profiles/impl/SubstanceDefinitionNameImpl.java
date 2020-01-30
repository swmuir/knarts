/**
 */
package fhiRCore.profiles.impl;

import fhiRCore.dataTypes.CodeableConcept;
import fhiRCore.dataTypes.Reference;

import fhiRCore.dataTypes.impl.BackboneElementImpl;

import fhiRCore.profiles.ProfilesPackage;
import fhiRCore.profiles.SubstanceDefinitionName;
import fhiRCore.profiles.SubstanceDefinitionNameOfficial;

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
 * An implementation of the model object '<em><b>Substance Definition Name</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.profiles.impl.SubstanceDefinitionNameImpl#getName <em>Name</em>}</li>
 *   <li>{@link fhiRCore.profiles.impl.SubstanceDefinitionNameImpl#getType <em>Type</em>}</li>
 *   <li>{@link fhiRCore.profiles.impl.SubstanceDefinitionNameImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link fhiRCore.profiles.impl.SubstanceDefinitionNameImpl#getPreferred <em>Preferred</em>}</li>
 *   <li>{@link fhiRCore.profiles.impl.SubstanceDefinitionNameImpl#getLanguages <em>Language</em>}</li>
 *   <li>{@link fhiRCore.profiles.impl.SubstanceDefinitionNameImpl#getDomains <em>Domain</em>}</li>
 *   <li>{@link fhiRCore.profiles.impl.SubstanceDefinitionNameImpl#getJurisdictions <em>Jurisdiction</em>}</li>
 *   <li>{@link fhiRCore.profiles.impl.SubstanceDefinitionNameImpl#getSynonyms <em>Synonym</em>}</li>
 *   <li>{@link fhiRCore.profiles.impl.SubstanceDefinitionNameImpl#getTranslations <em>Translation</em>}</li>
 *   <li>{@link fhiRCore.profiles.impl.SubstanceDefinitionNameImpl#getOfficials <em>Official</em>}</li>
 *   <li>{@link fhiRCore.profiles.impl.SubstanceDefinitionNameImpl#getSources <em>Source</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubstanceDefinitionNameImpl extends BackboneElementImpl implements SubstanceDefinitionName {
	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected fhiRCore.dataTypes.String name;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept type;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept status;

	/**
	 * The cached value of the '{@link #getPreferred() <em>Preferred</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreferred()
	 * @generated
	 * @ordered
	 */
	protected fhiRCore.dataTypes.Boolean preferred;

	/**
	 * The cached value of the '{@link #getLanguages() <em>Language</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguages()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> languages;

	/**
	 * The cached value of the '{@link #getDomains() <em>Domain</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomains()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> domains;

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
	 * The cached value of the '{@link #getSynonyms() <em>Synonym</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSynonyms()
	 * @generated
	 * @ordered
	 */
	protected EList<SubstanceDefinitionName> synonyms;

	/**
	 * The cached value of the '{@link #getTranslations() <em>Translation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTranslations()
	 * @generated
	 * @ordered
	 */
	protected EList<SubstanceDefinitionName> translations;

	/**
	 * The cached value of the '{@link #getOfficials() <em>Official</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOfficials()
	 * @generated
	 * @ordered
	 */
	protected EList<SubstanceDefinitionNameOfficial> officials;

	/**
	 * The cached value of the '{@link #getSources() <em>Source</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSources()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> sources;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubstanceDefinitionNameImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProfilesPackage.Literals.SUBSTANCE_DEFINITION_NAME;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public fhiRCore.dataTypes.String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetName(fhiRCore.dataTypes.String newName, NotificationChain msgs) {
		fhiRCore.dataTypes.String oldName = name;
		name = newName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProfilesPackage.SUBSTANCE_DEFINITION_NAME__NAME, oldName, newName);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(fhiRCore.dataTypes.String newName) {
		if (newName != name) {
			NotificationChain msgs = null;
			if (name != null)
				msgs = ((InternalEObject)name).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProfilesPackage.SUBSTANCE_DEFINITION_NAME__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject)newName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProfilesPackage.SUBSTANCE_DEFINITION_NAME__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProfilesPackage.SUBSTANCE_DEFINITION_NAME__NAME, newName, newName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetType(CodeableConcept newType, NotificationChain msgs) {
		CodeableConcept oldType = type;
		type = newType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProfilesPackage.SUBSTANCE_DEFINITION_NAME__TYPE, oldType, newType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(CodeableConcept newType) {
		if (newType != type) {
			NotificationChain msgs = null;
			if (type != null)
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProfilesPackage.SUBSTANCE_DEFINITION_NAME__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProfilesPackage.SUBSTANCE_DEFINITION_NAME__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProfilesPackage.SUBSTANCE_DEFINITION_NAME__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatus(CodeableConcept newStatus, NotificationChain msgs) {
		CodeableConcept oldStatus = status;
		status = newStatus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProfilesPackage.SUBSTANCE_DEFINITION_NAME__STATUS, oldStatus, newStatus);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(CodeableConcept newStatus) {
		if (newStatus != status) {
			NotificationChain msgs = null;
			if (status != null)
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProfilesPackage.SUBSTANCE_DEFINITION_NAME__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProfilesPackage.SUBSTANCE_DEFINITION_NAME__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProfilesPackage.SUBSTANCE_DEFINITION_NAME__STATUS, newStatus, newStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public fhiRCore.dataTypes.Boolean getPreferred() {
		return preferred;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPreferred(fhiRCore.dataTypes.Boolean newPreferred, NotificationChain msgs) {
		fhiRCore.dataTypes.Boolean oldPreferred = preferred;
		preferred = newPreferred;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProfilesPackage.SUBSTANCE_DEFINITION_NAME__PREFERRED, oldPreferred, newPreferred);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPreferred(fhiRCore.dataTypes.Boolean newPreferred) {
		if (newPreferred != preferred) {
			NotificationChain msgs = null;
			if (preferred != null)
				msgs = ((InternalEObject)preferred).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProfilesPackage.SUBSTANCE_DEFINITION_NAME__PREFERRED, null, msgs);
			if (newPreferred != null)
				msgs = ((InternalEObject)newPreferred).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProfilesPackage.SUBSTANCE_DEFINITION_NAME__PREFERRED, null, msgs);
			msgs = basicSetPreferred(newPreferred, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProfilesPackage.SUBSTANCE_DEFINITION_NAME__PREFERRED, newPreferred, newPreferred));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getLanguages() {
		if (languages == null) {
			languages = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, ProfilesPackage.SUBSTANCE_DEFINITION_NAME__LANGUAGE);
		}
		return languages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getDomains() {
		if (domains == null) {
			domains = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, ProfilesPackage.SUBSTANCE_DEFINITION_NAME__DOMAIN);
		}
		return domains;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getJurisdictions() {
		if (jurisdictions == null) {
			jurisdictions = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, ProfilesPackage.SUBSTANCE_DEFINITION_NAME__JURISDICTION);
		}
		return jurisdictions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SubstanceDefinitionName> getSynonyms() {
		if (synonyms == null) {
			synonyms = new EObjectContainmentEList<SubstanceDefinitionName>(SubstanceDefinitionName.class, this, ProfilesPackage.SUBSTANCE_DEFINITION_NAME__SYNONYM);
		}
		return synonyms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SubstanceDefinitionName> getTranslations() {
		if (translations == null) {
			translations = new EObjectContainmentEList<SubstanceDefinitionName>(SubstanceDefinitionName.class, this, ProfilesPackage.SUBSTANCE_DEFINITION_NAME__TRANSLATION);
		}
		return translations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SubstanceDefinitionNameOfficial> getOfficials() {
		if (officials == null) {
			officials = new EObjectContainmentEList<SubstanceDefinitionNameOfficial>(SubstanceDefinitionNameOfficial.class, this, ProfilesPackage.SUBSTANCE_DEFINITION_NAME__OFFICIAL);
		}
		return officials;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getSources() {
		if (sources == null) {
			sources = new EObjectContainmentEList<Reference>(Reference.class, this, ProfilesPackage.SUBSTANCE_DEFINITION_NAME__SOURCE);
		}
		return sources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProfilesPackage.SUBSTANCE_DEFINITION_NAME__NAME:
				return basicSetName(null, msgs);
			case ProfilesPackage.SUBSTANCE_DEFINITION_NAME__TYPE:
				return basicSetType(null, msgs);
			case ProfilesPackage.SUBSTANCE_DEFINITION_NAME__STATUS:
				return basicSetStatus(null, msgs);
			case ProfilesPackage.SUBSTANCE_DEFINITION_NAME__PREFERRED:
				return basicSetPreferred(null, msgs);
			case ProfilesPackage.SUBSTANCE_DEFINITION_NAME__LANGUAGE:
				return ((InternalEList<?>)getLanguages()).basicRemove(otherEnd, msgs);
			case ProfilesPackage.SUBSTANCE_DEFINITION_NAME__DOMAIN:
				return ((InternalEList<?>)getDomains()).basicRemove(otherEnd, msgs);
			case ProfilesPackage.SUBSTANCE_DEFINITION_NAME__JURISDICTION:
				return ((InternalEList<?>)getJurisdictions()).basicRemove(otherEnd, msgs);
			case ProfilesPackage.SUBSTANCE_DEFINITION_NAME__SYNONYM:
				return ((InternalEList<?>)getSynonyms()).basicRemove(otherEnd, msgs);
			case ProfilesPackage.SUBSTANCE_DEFINITION_NAME__TRANSLATION:
				return ((InternalEList<?>)getTranslations()).basicRemove(otherEnd, msgs);
			case ProfilesPackage.SUBSTANCE_DEFINITION_NAME__OFFICIAL:
				return ((InternalEList<?>)getOfficials()).basicRemove(otherEnd, msgs);
			case ProfilesPackage.SUBSTANCE_DEFINITION_NAME__SOURCE:
				return ((InternalEList<?>)getSources()).basicRemove(otherEnd, msgs);
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
			case ProfilesPackage.SUBSTANCE_DEFINITION_NAME__NAME:
				return getName();
			case ProfilesPackage.SUBSTANCE_DEFINITION_NAME__TYPE:
				return getType();
			case ProfilesPackage.SUBSTANCE_DEFINITION_NAME__STATUS:
				return getStatus();
			case ProfilesPackage.SUBSTANCE_DEFINITION_NAME__PREFERRED:
				return getPreferred();
			case ProfilesPackage.SUBSTANCE_DEFINITION_NAME__LANGUAGE:
				return getLanguages();
			case ProfilesPackage.SUBSTANCE_DEFINITION_NAME__DOMAIN:
				return getDomains();
			case ProfilesPackage.SUBSTANCE_DEFINITION_NAME__JURISDICTION:
				return getJurisdictions();
			case ProfilesPackage.SUBSTANCE_DEFINITION_NAME__SYNONYM:
				return getSynonyms();
			case ProfilesPackage.SUBSTANCE_DEFINITION_NAME__TRANSLATION:
				return getTranslations();
			case ProfilesPackage.SUBSTANCE_DEFINITION_NAME__OFFICIAL:
				return getOfficials();
			case ProfilesPackage.SUBSTANCE_DEFINITION_NAME__SOURCE:
				return getSources();
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
			case ProfilesPackage.SUBSTANCE_DEFINITION_NAME__NAME:
				setName((fhiRCore.dataTypes.String)newValue);
				return;
			case ProfilesPackage.SUBSTANCE_DEFINITION_NAME__TYPE:
				setType((CodeableConcept)newValue);
				return;
			case ProfilesPackage.SUBSTANCE_DEFINITION_NAME__STATUS:
				setStatus((CodeableConcept)newValue);
				return;
			case ProfilesPackage.SUBSTANCE_DEFINITION_NAME__PREFERRED:
				setPreferred((fhiRCore.dataTypes.Boolean)newValue);
				return;
			case ProfilesPackage.SUBSTANCE_DEFINITION_NAME__LANGUAGE:
				getLanguages().clear();
				getLanguages().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case ProfilesPackage.SUBSTANCE_DEFINITION_NAME__DOMAIN:
				getDomains().clear();
				getDomains().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case ProfilesPackage.SUBSTANCE_DEFINITION_NAME__JURISDICTION:
				getJurisdictions().clear();
				getJurisdictions().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case ProfilesPackage.SUBSTANCE_DEFINITION_NAME__SYNONYM:
				getSynonyms().clear();
				getSynonyms().addAll((Collection<? extends SubstanceDefinitionName>)newValue);
				return;
			case ProfilesPackage.SUBSTANCE_DEFINITION_NAME__TRANSLATION:
				getTranslations().clear();
				getTranslations().addAll((Collection<? extends SubstanceDefinitionName>)newValue);
				return;
			case ProfilesPackage.SUBSTANCE_DEFINITION_NAME__OFFICIAL:
				getOfficials().clear();
				getOfficials().addAll((Collection<? extends SubstanceDefinitionNameOfficial>)newValue);
				return;
			case ProfilesPackage.SUBSTANCE_DEFINITION_NAME__SOURCE:
				getSources().clear();
				getSources().addAll((Collection<? extends Reference>)newValue);
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
			case ProfilesPackage.SUBSTANCE_DEFINITION_NAME__NAME:
				setName((fhiRCore.dataTypes.String)null);
				return;
			case ProfilesPackage.SUBSTANCE_DEFINITION_NAME__TYPE:
				setType((CodeableConcept)null);
				return;
			case ProfilesPackage.SUBSTANCE_DEFINITION_NAME__STATUS:
				setStatus((CodeableConcept)null);
				return;
			case ProfilesPackage.SUBSTANCE_DEFINITION_NAME__PREFERRED:
				setPreferred((fhiRCore.dataTypes.Boolean)null);
				return;
			case ProfilesPackage.SUBSTANCE_DEFINITION_NAME__LANGUAGE:
				getLanguages().clear();
				return;
			case ProfilesPackage.SUBSTANCE_DEFINITION_NAME__DOMAIN:
				getDomains().clear();
				return;
			case ProfilesPackage.SUBSTANCE_DEFINITION_NAME__JURISDICTION:
				getJurisdictions().clear();
				return;
			case ProfilesPackage.SUBSTANCE_DEFINITION_NAME__SYNONYM:
				getSynonyms().clear();
				return;
			case ProfilesPackage.SUBSTANCE_DEFINITION_NAME__TRANSLATION:
				getTranslations().clear();
				return;
			case ProfilesPackage.SUBSTANCE_DEFINITION_NAME__OFFICIAL:
				getOfficials().clear();
				return;
			case ProfilesPackage.SUBSTANCE_DEFINITION_NAME__SOURCE:
				getSources().clear();
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
			case ProfilesPackage.SUBSTANCE_DEFINITION_NAME__NAME:
				return name != null;
			case ProfilesPackage.SUBSTANCE_DEFINITION_NAME__TYPE:
				return type != null;
			case ProfilesPackage.SUBSTANCE_DEFINITION_NAME__STATUS:
				return status != null;
			case ProfilesPackage.SUBSTANCE_DEFINITION_NAME__PREFERRED:
				return preferred != null;
			case ProfilesPackage.SUBSTANCE_DEFINITION_NAME__LANGUAGE:
				return languages != null && !languages.isEmpty();
			case ProfilesPackage.SUBSTANCE_DEFINITION_NAME__DOMAIN:
				return domains != null && !domains.isEmpty();
			case ProfilesPackage.SUBSTANCE_DEFINITION_NAME__JURISDICTION:
				return jurisdictions != null && !jurisdictions.isEmpty();
			case ProfilesPackage.SUBSTANCE_DEFINITION_NAME__SYNONYM:
				return synonyms != null && !synonyms.isEmpty();
			case ProfilesPackage.SUBSTANCE_DEFINITION_NAME__TRANSLATION:
				return translations != null && !translations.isEmpty();
			case ProfilesPackage.SUBSTANCE_DEFINITION_NAME__OFFICIAL:
				return officials != null && !officials.isEmpty();
			case ProfilesPackage.SUBSTANCE_DEFINITION_NAME__SOURCE:
				return sources != null && !sources.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SubstanceDefinitionNameImpl
