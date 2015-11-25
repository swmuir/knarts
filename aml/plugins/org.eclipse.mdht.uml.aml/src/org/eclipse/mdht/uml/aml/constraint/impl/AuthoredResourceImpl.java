/**
 */
package org.eclipse.mdht.uml.aml.constraint.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

import org.eclipse.mdht.uml.aml.constraint.AuthoredResource;
import org.eclipse.mdht.uml.aml.constraint.ConstraintPackage;
import org.eclipse.mdht.uml.aml.constraint.Lifecycle_state;

import org.eclipse.uml2.uml.Namespace;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Authored Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.aml.constraint.impl.AuthoredResourceImpl#getCopyright <em>Copyright</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.aml.constraint.impl.AuthoredResourceImpl#getCurrent_revision <em>Current revision</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.aml.constraint.impl.AuthoredResourceImpl#getCustodian_namespace <em>Custodian namespace</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.aml.constraint.impl.AuthoredResourceImpl#getCustodian_organisation <em>Custodian organisation</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.aml.constraint.impl.AuthoredResourceImpl#getLicence <em>Licence</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.aml.constraint.impl.AuthoredResourceImpl#getLifecycle_state <em>Lifecycle state</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.aml.constraint.impl.AuthoredResourceImpl#getOriginal_author_date <em>Original author date</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.aml.constraint.impl.AuthoredResourceImpl#getOriginal_author_email <em>Original author email</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.aml.constraint.impl.AuthoredResourceImpl#getOriginal_author_name <em>Original author name</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.aml.constraint.impl.AuthoredResourceImpl#getOriginal_author_organization <em>Original author organization</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.aml.constraint.impl.AuthoredResourceImpl#getOriginal_namespace <em>Original namespace</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.aml.constraint.impl.AuthoredResourceImpl#getOriginal_publisher <em>Original publisher</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.aml.constraint.impl.AuthoredResourceImpl#getOther_contributors <em>Other contributors</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.aml.constraint.impl.AuthoredResourceImpl#getOtherDetails <em>Other Details</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.aml.constraint.impl.AuthoredResourceImpl#getOtherDetails_ids <em>Other Details id</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.aml.constraint.impl.AuthoredResourceImpl#getReferences <em>References</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.aml.constraint.impl.AuthoredResourceImpl#getReferences_ids <em>References id</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.aml.constraint.impl.AuthoredResourceImpl#getResourceDocumentLanguage <em>Resource Document Language</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.aml.constraint.impl.AuthoredResourceImpl#getResourceDocumentSyntax <em>Resource Document Syntax</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.aml.constraint.impl.AuthoredResourceImpl#getResourceSource <em>Resource Source</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.aml.constraint.impl.AuthoredResourceImpl#getResourceSourceURI <em>Resource Source URI</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.aml.constraint.impl.AuthoredResourceImpl#getBase_Namespace <em>Base Namespace</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.aml.constraint.impl.AuthoredResourceImpl#getResource_package_uri <em>Resource package uri</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.aml.constraint.impl.AuthoredResourceImpl#getUid <em>Uid</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.aml.constraint.impl.AuthoredResourceImpl#getIp_acknowledgements <em>Ip acknowledgements</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.aml.constraint.impl.AuthoredResourceImpl#getIp_acknowledgements_ids <em>Ip acknowledgements id</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AuthoredResourceImpl extends MinimalEObjectImpl.Container implements AuthoredResource {
	/**
	 * The default value of the '{@link #getCopyright() <em>Copyright</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCopyright()
	 * @generated
	 * @ordered
	 */
	protected static final String COPYRIGHT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCopyright() <em>Copyright</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCopyright()
	 * @generated
	 * @ordered
	 */
	protected String copyright = COPYRIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getCurrent_revision() <em>Current revision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrent_revision()
	 * @generated
	 * @ordered
	 */
	protected static final String CURRENT_REVISION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCurrent_revision() <em>Current revision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrent_revision()
	 * @generated
	 * @ordered
	 */
	protected String current_revision = CURRENT_REVISION_EDEFAULT;

	/**
	 * The default value of the '{@link #getCustodian_namespace() <em>Custodian namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustodian_namespace()
	 * @generated
	 * @ordered
	 */
	protected static final String CUSTODIAN_NAMESPACE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCustodian_namespace() <em>Custodian namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustodian_namespace()
	 * @generated
	 * @ordered
	 */
	protected String custodian_namespace = CUSTODIAN_NAMESPACE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCustodian_organisation() <em>Custodian organisation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustodian_organisation()
	 * @generated
	 * @ordered
	 */
	protected static final String CUSTODIAN_ORGANISATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCustodian_organisation() <em>Custodian organisation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustodian_organisation()
	 * @generated
	 * @ordered
	 */
	protected String custodian_organisation = CUSTODIAN_ORGANISATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getLicence() <em>Licence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLicence()
	 * @generated
	 * @ordered
	 */
	protected static final String LICENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLicence() <em>Licence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLicence()
	 * @generated
	 * @ordered
	 */
	protected String licence = LICENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLifecycle_state() <em>Lifecycle state</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLifecycle_state()
	 * @generated
	 * @ordered
	 */
	protected static final Lifecycle_state LIFECYCLE_STATE_EDEFAULT = Lifecycle_state.UNMANAGED;

	/**
	 * The cached value of the '{@link #getLifecycle_state() <em>Lifecycle state</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLifecycle_state()
	 * @generated
	 * @ordered
	 */
	protected Lifecycle_state lifecycle_state = LIFECYCLE_STATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOriginal_author_date() <em>Original author date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginal_author_date()
	 * @generated
	 * @ordered
	 */
	protected static final String ORIGINAL_AUTHOR_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOriginal_author_date() <em>Original author date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginal_author_date()
	 * @generated
	 * @ordered
	 */
	protected String original_author_date = ORIGINAL_AUTHOR_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOriginal_author_email() <em>Original author email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginal_author_email()
	 * @generated
	 * @ordered
	 */
	protected static final String ORIGINAL_AUTHOR_EMAIL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOriginal_author_email() <em>Original author email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginal_author_email()
	 * @generated
	 * @ordered
	 */
	protected String original_author_email = ORIGINAL_AUTHOR_EMAIL_EDEFAULT;

	/**
	 * The default value of the '{@link #getOriginal_author_name() <em>Original author name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginal_author_name()
	 * @generated
	 * @ordered
	 */
	protected static final String ORIGINAL_AUTHOR_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOriginal_author_name() <em>Original author name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginal_author_name()
	 * @generated
	 * @ordered
	 */
	protected String original_author_name = ORIGINAL_AUTHOR_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getOriginal_author_organization() <em>Original author organization</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginal_author_organization()
	 * @generated
	 * @ordered
	 */
	protected static final String ORIGINAL_AUTHOR_ORGANIZATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOriginal_author_organization() <em>Original author organization</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginal_author_organization()
	 * @generated
	 * @ordered
	 */
	protected String original_author_organization = ORIGINAL_AUTHOR_ORGANIZATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getOriginal_namespace() <em>Original namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginal_namespace()
	 * @generated
	 * @ordered
	 */
	protected static final String ORIGINAL_NAMESPACE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOriginal_namespace() <em>Original namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginal_namespace()
	 * @generated
	 * @ordered
	 */
	protected String original_namespace = ORIGINAL_NAMESPACE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOriginal_publisher() <em>Original publisher</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginal_publisher()
	 * @generated
	 * @ordered
	 */
	protected static final String ORIGINAL_PUBLISHER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOriginal_publisher() <em>Original publisher</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginal_publisher()
	 * @generated
	 * @ordered
	 */
	protected String original_publisher = ORIGINAL_PUBLISHER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOther_contributors() <em>Other contributors</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOther_contributors()
	 * @generated
	 * @ordered
	 */
	protected EList<String> other_contributors;

	/**
	 * The cached value of the '{@link #getOtherDetails() <em>Other Details</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherDetails()
	 * @generated
	 * @ordered
	 */
	protected EList<String> otherDetails;

	/**
	 * The cached value of the '{@link #getOtherDetails_ids() <em>Other Details id</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherDetails_ids()
	 * @generated
	 * @ordered
	 */
	protected EList<String> otherDetails_ids;

	/**
	 * The cached value of the '{@link #getReferences() <em>References</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferences()
	 * @generated
	 * @ordered
	 */
	protected EList<String> references;

	/**
	 * The cached value of the '{@link #getReferences_ids() <em>References id</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferences_ids()
	 * @generated
	 * @ordered
	 */
	protected EList<String> references_ids;

	/**
	 * The default value of the '{@link #getResourceDocumentLanguage() <em>Resource Document Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceDocumentLanguage()
	 * @generated
	 * @ordered
	 */
	protected static final String RESOURCE_DOCUMENT_LANGUAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getResourceDocumentLanguage() <em>Resource Document Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceDocumentLanguage()
	 * @generated
	 * @ordered
	 */
	protected String resourceDocumentLanguage = RESOURCE_DOCUMENT_LANGUAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getResourceDocumentSyntax() <em>Resource Document Syntax</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceDocumentSyntax()
	 * @generated
	 * @ordered
	 */
	protected static final String RESOURCE_DOCUMENT_SYNTAX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getResourceDocumentSyntax() <em>Resource Document Syntax</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceDocumentSyntax()
	 * @generated
	 * @ordered
	 */
	protected String resourceDocumentSyntax = RESOURCE_DOCUMENT_SYNTAX_EDEFAULT;

	/**
	 * The default value of the '{@link #getResourceSource() <em>Resource Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceSource()
	 * @generated
	 * @ordered
	 */
	protected static final String RESOURCE_SOURCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getResourceSource() <em>Resource Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceSource()
	 * @generated
	 * @ordered
	 */
	protected String resourceSource = RESOURCE_SOURCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getResourceSourceURI() <em>Resource Source URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceSourceURI()
	 * @generated
	 * @ordered
	 */
	protected static final String RESOURCE_SOURCE_URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getResourceSourceURI() <em>Resource Source URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceSourceURI()
	 * @generated
	 * @ordered
	 */
	protected String resourceSourceURI = RESOURCE_SOURCE_URI_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBase_Namespace() <em>Base Namespace</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_Namespace()
	 * @generated
	 * @ordered
	 */
	protected Namespace base_Namespace;

	/**
	 * The default value of the '{@link #getResource_package_uri() <em>Resource package uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResource_package_uri()
	 * @generated
	 * @ordered
	 */
	protected static final String RESOURCE_PACKAGE_URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getResource_package_uri() <em>Resource package uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResource_package_uri()
	 * @generated
	 * @ordered
	 */
	protected String resource_package_uri = RESOURCE_PACKAGE_URI_EDEFAULT;

	/**
	 * The default value of the '{@link #getUid() <em>Uid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUid()
	 * @generated
	 * @ordered
	 */
	protected static final String UID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUid() <em>Uid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUid()
	 * @generated
	 * @ordered
	 */
	protected String uid = UID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getIp_acknowledgements() <em>Ip acknowledgements</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIp_acknowledgements()
	 * @generated
	 * @ordered
	 */
	protected EList<String> ip_acknowledgements;

	/**
	 * The cached value of the '{@link #getIp_acknowledgements_ids() <em>Ip acknowledgements id</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIp_acknowledgements_ids()
	 * @generated
	 * @ordered
	 */
	protected EList<String> ip_acknowledgements_ids;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AuthoredResourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConstraintPackage.Literals.AUTHORED_RESOURCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCopyright() {
		return copyright;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCopyright(String newCopyright) {
		String oldCopyright = copyright;
		copyright = newCopyright;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConstraintPackage.AUTHORED_RESOURCE__COPYRIGHT, oldCopyright, copyright));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCurrent_revision() {
		return current_revision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrent_revision(String newCurrent_revision) {
		String oldCurrent_revision = current_revision;
		current_revision = newCurrent_revision;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConstraintPackage.AUTHORED_RESOURCE__CURRENT_REVISION, oldCurrent_revision, current_revision));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCustodian_namespace() {
		return custodian_namespace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCustodian_namespace(String newCustodian_namespace) {
		String oldCustodian_namespace = custodian_namespace;
		custodian_namespace = newCustodian_namespace;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConstraintPackage.AUTHORED_RESOURCE__CUSTODIAN_NAMESPACE, oldCustodian_namespace, custodian_namespace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCustodian_organisation() {
		return custodian_organisation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCustodian_organisation(String newCustodian_organisation) {
		String oldCustodian_organisation = custodian_organisation;
		custodian_organisation = newCustodian_organisation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConstraintPackage.AUTHORED_RESOURCE__CUSTODIAN_ORGANISATION, oldCustodian_organisation, custodian_organisation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLicence() {
		return licence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLicence(String newLicence) {
		String oldLicence = licence;
		licence = newLicence;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConstraintPackage.AUTHORED_RESOURCE__LICENCE, oldLicence, licence));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Lifecycle_state getLifecycle_state() {
		return lifecycle_state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLifecycle_state(Lifecycle_state newLifecycle_state) {
		Lifecycle_state oldLifecycle_state = lifecycle_state;
		lifecycle_state = newLifecycle_state == null ? LIFECYCLE_STATE_EDEFAULT : newLifecycle_state;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConstraintPackage.AUTHORED_RESOURCE__LIFECYCLE_STATE, oldLifecycle_state, lifecycle_state));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOriginal_author_date() {
		return original_author_date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOriginal_author_date(String newOriginal_author_date) {
		String oldOriginal_author_date = original_author_date;
		original_author_date = newOriginal_author_date;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConstraintPackage.AUTHORED_RESOURCE__ORIGINAL_AUTHOR_DATE, oldOriginal_author_date, original_author_date));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOriginal_author_email() {
		return original_author_email;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOriginal_author_email(String newOriginal_author_email) {
		String oldOriginal_author_email = original_author_email;
		original_author_email = newOriginal_author_email;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConstraintPackage.AUTHORED_RESOURCE__ORIGINAL_AUTHOR_EMAIL, oldOriginal_author_email, original_author_email));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOriginal_author_name() {
		return original_author_name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOriginal_author_name(String newOriginal_author_name) {
		String oldOriginal_author_name = original_author_name;
		original_author_name = newOriginal_author_name;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConstraintPackage.AUTHORED_RESOURCE__ORIGINAL_AUTHOR_NAME, oldOriginal_author_name, original_author_name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOriginal_author_organization() {
		return original_author_organization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOriginal_author_organization(String newOriginal_author_organization) {
		String oldOriginal_author_organization = original_author_organization;
		original_author_organization = newOriginal_author_organization;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConstraintPackage.AUTHORED_RESOURCE__ORIGINAL_AUTHOR_ORGANIZATION, oldOriginal_author_organization, original_author_organization));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOriginal_namespace() {
		return original_namespace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOriginal_namespace(String newOriginal_namespace) {
		String oldOriginal_namespace = original_namespace;
		original_namespace = newOriginal_namespace;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConstraintPackage.AUTHORED_RESOURCE__ORIGINAL_NAMESPACE, oldOriginal_namespace, original_namespace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOriginal_publisher() {
		return original_publisher;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOriginal_publisher(String newOriginal_publisher) {
		String oldOriginal_publisher = original_publisher;
		original_publisher = newOriginal_publisher;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConstraintPackage.AUTHORED_RESOURCE__ORIGINAL_PUBLISHER, oldOriginal_publisher, original_publisher));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getOther_contributors() {
		if (other_contributors == null) {
			other_contributors = new EDataTypeUniqueEList<String>(String.class, this, ConstraintPackage.AUTHORED_RESOURCE__OTHER_CONTRIBUTORS);
		}
		return other_contributors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getOtherDetails() {
		if (otherDetails == null) {
			otherDetails = new EDataTypeUniqueEList<String>(String.class, this, ConstraintPackage.AUTHORED_RESOURCE__OTHER_DETAILS);
		}
		return otherDetails;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getOtherDetails_ids() {
		if (otherDetails_ids == null) {
			otherDetails_ids = new EDataTypeUniqueEList<String>(String.class, this, ConstraintPackage.AUTHORED_RESOURCE__OTHER_DETAILS_ID);
		}
		return otherDetails_ids;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getReferences() {
		if (references == null) {
			references = new EDataTypeUniqueEList<String>(String.class, this, ConstraintPackage.AUTHORED_RESOURCE__REFERENCES);
		}
		return references;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getReferences_ids() {
		if (references_ids == null) {
			references_ids = new EDataTypeUniqueEList<String>(String.class, this, ConstraintPackage.AUTHORED_RESOURCE__REFERENCES_ID);
		}
		return references_ids;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getResourceDocumentLanguage() {
		return resourceDocumentLanguage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResourceDocumentLanguage(String newResourceDocumentLanguage) {
		String oldResourceDocumentLanguage = resourceDocumentLanguage;
		resourceDocumentLanguage = newResourceDocumentLanguage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConstraintPackage.AUTHORED_RESOURCE__RESOURCE_DOCUMENT_LANGUAGE, oldResourceDocumentLanguage, resourceDocumentLanguage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getResourceDocumentSyntax() {
		return resourceDocumentSyntax;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResourceDocumentSyntax(String newResourceDocumentSyntax) {
		String oldResourceDocumentSyntax = resourceDocumentSyntax;
		resourceDocumentSyntax = newResourceDocumentSyntax;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConstraintPackage.AUTHORED_RESOURCE__RESOURCE_DOCUMENT_SYNTAX, oldResourceDocumentSyntax, resourceDocumentSyntax));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getResourceSource() {
		return resourceSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResourceSource(String newResourceSource) {
		String oldResourceSource = resourceSource;
		resourceSource = newResourceSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConstraintPackage.AUTHORED_RESOURCE__RESOURCE_SOURCE, oldResourceSource, resourceSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getResourceSourceURI() {
		return resourceSourceURI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResourceSourceURI(String newResourceSourceURI) {
		String oldResourceSourceURI = resourceSourceURI;
		resourceSourceURI = newResourceSourceURI;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConstraintPackage.AUTHORED_RESOURCE__RESOURCE_SOURCE_URI, oldResourceSourceURI, resourceSourceURI));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Namespace getBase_Namespace() {
		if (base_Namespace != null && base_Namespace.eIsProxy()) {
			InternalEObject oldBase_Namespace = (InternalEObject)base_Namespace;
			base_Namespace = (Namespace)eResolveProxy(oldBase_Namespace);
			if (base_Namespace != oldBase_Namespace) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ConstraintPackage.AUTHORED_RESOURCE__BASE_NAMESPACE, oldBase_Namespace, base_Namespace));
			}
		}
		return base_Namespace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Namespace basicGetBase_Namespace() {
		return base_Namespace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_Namespace(Namespace newBase_Namespace) {
		Namespace oldBase_Namespace = base_Namespace;
		base_Namespace = newBase_Namespace;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConstraintPackage.AUTHORED_RESOURCE__BASE_NAMESPACE, oldBase_Namespace, base_Namespace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getResource_package_uri() {
		return resource_package_uri;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResource_package_uri(String newResource_package_uri) {
		String oldResource_package_uri = resource_package_uri;
		resource_package_uri = newResource_package_uri;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConstraintPackage.AUTHORED_RESOURCE__RESOURCE_PACKAGE_URI, oldResource_package_uri, resource_package_uri));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUid() {
		return uid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUid(String newUid) {
		String oldUid = uid;
		uid = newUid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConstraintPackage.AUTHORED_RESOURCE__UID, oldUid, uid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getIp_acknowledgements() {
		if (ip_acknowledgements == null) {
			ip_acknowledgements = new EDataTypeUniqueEList<String>(String.class, this, ConstraintPackage.AUTHORED_RESOURCE__IP_ACKNOWLEDGEMENTS);
		}
		return ip_acknowledgements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getIp_acknowledgements_ids() {
		if (ip_acknowledgements_ids == null) {
			ip_acknowledgements_ids = new EDataTypeUniqueEList<String>(String.class, this, ConstraintPackage.AUTHORED_RESOURCE__IP_ACKNOWLEDGEMENTS_ID);
		}
		return ip_acknowledgements_ids;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ConstraintPackage.AUTHORED_RESOURCE__COPYRIGHT:
				return getCopyright();
			case ConstraintPackage.AUTHORED_RESOURCE__CURRENT_REVISION:
				return getCurrent_revision();
			case ConstraintPackage.AUTHORED_RESOURCE__CUSTODIAN_NAMESPACE:
				return getCustodian_namespace();
			case ConstraintPackage.AUTHORED_RESOURCE__CUSTODIAN_ORGANISATION:
				return getCustodian_organisation();
			case ConstraintPackage.AUTHORED_RESOURCE__LICENCE:
				return getLicence();
			case ConstraintPackage.AUTHORED_RESOURCE__LIFECYCLE_STATE:
				return getLifecycle_state();
			case ConstraintPackage.AUTHORED_RESOURCE__ORIGINAL_AUTHOR_DATE:
				return getOriginal_author_date();
			case ConstraintPackage.AUTHORED_RESOURCE__ORIGINAL_AUTHOR_EMAIL:
				return getOriginal_author_email();
			case ConstraintPackage.AUTHORED_RESOURCE__ORIGINAL_AUTHOR_NAME:
				return getOriginal_author_name();
			case ConstraintPackage.AUTHORED_RESOURCE__ORIGINAL_AUTHOR_ORGANIZATION:
				return getOriginal_author_organization();
			case ConstraintPackage.AUTHORED_RESOURCE__ORIGINAL_NAMESPACE:
				return getOriginal_namespace();
			case ConstraintPackage.AUTHORED_RESOURCE__ORIGINAL_PUBLISHER:
				return getOriginal_publisher();
			case ConstraintPackage.AUTHORED_RESOURCE__OTHER_CONTRIBUTORS:
				return getOther_contributors();
			case ConstraintPackage.AUTHORED_RESOURCE__OTHER_DETAILS:
				return getOtherDetails();
			case ConstraintPackage.AUTHORED_RESOURCE__OTHER_DETAILS_ID:
				return getOtherDetails_ids();
			case ConstraintPackage.AUTHORED_RESOURCE__REFERENCES:
				return getReferences();
			case ConstraintPackage.AUTHORED_RESOURCE__REFERENCES_ID:
				return getReferences_ids();
			case ConstraintPackage.AUTHORED_RESOURCE__RESOURCE_DOCUMENT_LANGUAGE:
				return getResourceDocumentLanguage();
			case ConstraintPackage.AUTHORED_RESOURCE__RESOURCE_DOCUMENT_SYNTAX:
				return getResourceDocumentSyntax();
			case ConstraintPackage.AUTHORED_RESOURCE__RESOURCE_SOURCE:
				return getResourceSource();
			case ConstraintPackage.AUTHORED_RESOURCE__RESOURCE_SOURCE_URI:
				return getResourceSourceURI();
			case ConstraintPackage.AUTHORED_RESOURCE__BASE_NAMESPACE:
				if (resolve) return getBase_Namespace();
				return basicGetBase_Namespace();
			case ConstraintPackage.AUTHORED_RESOURCE__RESOURCE_PACKAGE_URI:
				return getResource_package_uri();
			case ConstraintPackage.AUTHORED_RESOURCE__UID:
				return getUid();
			case ConstraintPackage.AUTHORED_RESOURCE__IP_ACKNOWLEDGEMENTS:
				return getIp_acknowledgements();
			case ConstraintPackage.AUTHORED_RESOURCE__IP_ACKNOWLEDGEMENTS_ID:
				return getIp_acknowledgements_ids();
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
			case ConstraintPackage.AUTHORED_RESOURCE__COPYRIGHT:
				setCopyright((String)newValue);
				return;
			case ConstraintPackage.AUTHORED_RESOURCE__CURRENT_REVISION:
				setCurrent_revision((String)newValue);
				return;
			case ConstraintPackage.AUTHORED_RESOURCE__CUSTODIAN_NAMESPACE:
				setCustodian_namespace((String)newValue);
				return;
			case ConstraintPackage.AUTHORED_RESOURCE__CUSTODIAN_ORGANISATION:
				setCustodian_organisation((String)newValue);
				return;
			case ConstraintPackage.AUTHORED_RESOURCE__LICENCE:
				setLicence((String)newValue);
				return;
			case ConstraintPackage.AUTHORED_RESOURCE__LIFECYCLE_STATE:
				setLifecycle_state((Lifecycle_state)newValue);
				return;
			case ConstraintPackage.AUTHORED_RESOURCE__ORIGINAL_AUTHOR_DATE:
				setOriginal_author_date((String)newValue);
				return;
			case ConstraintPackage.AUTHORED_RESOURCE__ORIGINAL_AUTHOR_EMAIL:
				setOriginal_author_email((String)newValue);
				return;
			case ConstraintPackage.AUTHORED_RESOURCE__ORIGINAL_AUTHOR_NAME:
				setOriginal_author_name((String)newValue);
				return;
			case ConstraintPackage.AUTHORED_RESOURCE__ORIGINAL_AUTHOR_ORGANIZATION:
				setOriginal_author_organization((String)newValue);
				return;
			case ConstraintPackage.AUTHORED_RESOURCE__ORIGINAL_NAMESPACE:
				setOriginal_namespace((String)newValue);
				return;
			case ConstraintPackage.AUTHORED_RESOURCE__ORIGINAL_PUBLISHER:
				setOriginal_publisher((String)newValue);
				return;
			case ConstraintPackage.AUTHORED_RESOURCE__OTHER_CONTRIBUTORS:
				getOther_contributors().clear();
				getOther_contributors().addAll((Collection<? extends String>)newValue);
				return;
			case ConstraintPackage.AUTHORED_RESOURCE__OTHER_DETAILS:
				getOtherDetails().clear();
				getOtherDetails().addAll((Collection<? extends String>)newValue);
				return;
			case ConstraintPackage.AUTHORED_RESOURCE__OTHER_DETAILS_ID:
				getOtherDetails_ids().clear();
				getOtherDetails_ids().addAll((Collection<? extends String>)newValue);
				return;
			case ConstraintPackage.AUTHORED_RESOURCE__REFERENCES:
				getReferences().clear();
				getReferences().addAll((Collection<? extends String>)newValue);
				return;
			case ConstraintPackage.AUTHORED_RESOURCE__REFERENCES_ID:
				getReferences_ids().clear();
				getReferences_ids().addAll((Collection<? extends String>)newValue);
				return;
			case ConstraintPackage.AUTHORED_RESOURCE__RESOURCE_DOCUMENT_LANGUAGE:
				setResourceDocumentLanguage((String)newValue);
				return;
			case ConstraintPackage.AUTHORED_RESOURCE__RESOURCE_DOCUMENT_SYNTAX:
				setResourceDocumentSyntax((String)newValue);
				return;
			case ConstraintPackage.AUTHORED_RESOURCE__RESOURCE_SOURCE:
				setResourceSource((String)newValue);
				return;
			case ConstraintPackage.AUTHORED_RESOURCE__RESOURCE_SOURCE_URI:
				setResourceSourceURI((String)newValue);
				return;
			case ConstraintPackage.AUTHORED_RESOURCE__BASE_NAMESPACE:
				setBase_Namespace((Namespace)newValue);
				return;
			case ConstraintPackage.AUTHORED_RESOURCE__RESOURCE_PACKAGE_URI:
				setResource_package_uri((String)newValue);
				return;
			case ConstraintPackage.AUTHORED_RESOURCE__UID:
				setUid((String)newValue);
				return;
			case ConstraintPackage.AUTHORED_RESOURCE__IP_ACKNOWLEDGEMENTS:
				getIp_acknowledgements().clear();
				getIp_acknowledgements().addAll((Collection<? extends String>)newValue);
				return;
			case ConstraintPackage.AUTHORED_RESOURCE__IP_ACKNOWLEDGEMENTS_ID:
				getIp_acknowledgements_ids().clear();
				getIp_acknowledgements_ids().addAll((Collection<? extends String>)newValue);
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
			case ConstraintPackage.AUTHORED_RESOURCE__COPYRIGHT:
				setCopyright(COPYRIGHT_EDEFAULT);
				return;
			case ConstraintPackage.AUTHORED_RESOURCE__CURRENT_REVISION:
				setCurrent_revision(CURRENT_REVISION_EDEFAULT);
				return;
			case ConstraintPackage.AUTHORED_RESOURCE__CUSTODIAN_NAMESPACE:
				setCustodian_namespace(CUSTODIAN_NAMESPACE_EDEFAULT);
				return;
			case ConstraintPackage.AUTHORED_RESOURCE__CUSTODIAN_ORGANISATION:
				setCustodian_organisation(CUSTODIAN_ORGANISATION_EDEFAULT);
				return;
			case ConstraintPackage.AUTHORED_RESOURCE__LICENCE:
				setLicence(LICENCE_EDEFAULT);
				return;
			case ConstraintPackage.AUTHORED_RESOURCE__LIFECYCLE_STATE:
				setLifecycle_state(LIFECYCLE_STATE_EDEFAULT);
				return;
			case ConstraintPackage.AUTHORED_RESOURCE__ORIGINAL_AUTHOR_DATE:
				setOriginal_author_date(ORIGINAL_AUTHOR_DATE_EDEFAULT);
				return;
			case ConstraintPackage.AUTHORED_RESOURCE__ORIGINAL_AUTHOR_EMAIL:
				setOriginal_author_email(ORIGINAL_AUTHOR_EMAIL_EDEFAULT);
				return;
			case ConstraintPackage.AUTHORED_RESOURCE__ORIGINAL_AUTHOR_NAME:
				setOriginal_author_name(ORIGINAL_AUTHOR_NAME_EDEFAULT);
				return;
			case ConstraintPackage.AUTHORED_RESOURCE__ORIGINAL_AUTHOR_ORGANIZATION:
				setOriginal_author_organization(ORIGINAL_AUTHOR_ORGANIZATION_EDEFAULT);
				return;
			case ConstraintPackage.AUTHORED_RESOURCE__ORIGINAL_NAMESPACE:
				setOriginal_namespace(ORIGINAL_NAMESPACE_EDEFAULT);
				return;
			case ConstraintPackage.AUTHORED_RESOURCE__ORIGINAL_PUBLISHER:
				setOriginal_publisher(ORIGINAL_PUBLISHER_EDEFAULT);
				return;
			case ConstraintPackage.AUTHORED_RESOURCE__OTHER_CONTRIBUTORS:
				getOther_contributors().clear();
				return;
			case ConstraintPackage.AUTHORED_RESOURCE__OTHER_DETAILS:
				getOtherDetails().clear();
				return;
			case ConstraintPackage.AUTHORED_RESOURCE__OTHER_DETAILS_ID:
				getOtherDetails_ids().clear();
				return;
			case ConstraintPackage.AUTHORED_RESOURCE__REFERENCES:
				getReferences().clear();
				return;
			case ConstraintPackage.AUTHORED_RESOURCE__REFERENCES_ID:
				getReferences_ids().clear();
				return;
			case ConstraintPackage.AUTHORED_RESOURCE__RESOURCE_DOCUMENT_LANGUAGE:
				setResourceDocumentLanguage(RESOURCE_DOCUMENT_LANGUAGE_EDEFAULT);
				return;
			case ConstraintPackage.AUTHORED_RESOURCE__RESOURCE_DOCUMENT_SYNTAX:
				setResourceDocumentSyntax(RESOURCE_DOCUMENT_SYNTAX_EDEFAULT);
				return;
			case ConstraintPackage.AUTHORED_RESOURCE__RESOURCE_SOURCE:
				setResourceSource(RESOURCE_SOURCE_EDEFAULT);
				return;
			case ConstraintPackage.AUTHORED_RESOURCE__RESOURCE_SOURCE_URI:
				setResourceSourceURI(RESOURCE_SOURCE_URI_EDEFAULT);
				return;
			case ConstraintPackage.AUTHORED_RESOURCE__BASE_NAMESPACE:
				setBase_Namespace((Namespace)null);
				return;
			case ConstraintPackage.AUTHORED_RESOURCE__RESOURCE_PACKAGE_URI:
				setResource_package_uri(RESOURCE_PACKAGE_URI_EDEFAULT);
				return;
			case ConstraintPackage.AUTHORED_RESOURCE__UID:
				setUid(UID_EDEFAULT);
				return;
			case ConstraintPackage.AUTHORED_RESOURCE__IP_ACKNOWLEDGEMENTS:
				getIp_acknowledgements().clear();
				return;
			case ConstraintPackage.AUTHORED_RESOURCE__IP_ACKNOWLEDGEMENTS_ID:
				getIp_acknowledgements_ids().clear();
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
			case ConstraintPackage.AUTHORED_RESOURCE__COPYRIGHT:
				return COPYRIGHT_EDEFAULT == null ? copyright != null : !COPYRIGHT_EDEFAULT.equals(copyright);
			case ConstraintPackage.AUTHORED_RESOURCE__CURRENT_REVISION:
				return CURRENT_REVISION_EDEFAULT == null ? current_revision != null : !CURRENT_REVISION_EDEFAULT.equals(current_revision);
			case ConstraintPackage.AUTHORED_RESOURCE__CUSTODIAN_NAMESPACE:
				return CUSTODIAN_NAMESPACE_EDEFAULT == null ? custodian_namespace != null : !CUSTODIAN_NAMESPACE_EDEFAULT.equals(custodian_namespace);
			case ConstraintPackage.AUTHORED_RESOURCE__CUSTODIAN_ORGANISATION:
				return CUSTODIAN_ORGANISATION_EDEFAULT == null ? custodian_organisation != null : !CUSTODIAN_ORGANISATION_EDEFAULT.equals(custodian_organisation);
			case ConstraintPackage.AUTHORED_RESOURCE__LICENCE:
				return LICENCE_EDEFAULT == null ? licence != null : !LICENCE_EDEFAULT.equals(licence);
			case ConstraintPackage.AUTHORED_RESOURCE__LIFECYCLE_STATE:
				return lifecycle_state != LIFECYCLE_STATE_EDEFAULT;
			case ConstraintPackage.AUTHORED_RESOURCE__ORIGINAL_AUTHOR_DATE:
				return ORIGINAL_AUTHOR_DATE_EDEFAULT == null ? original_author_date != null : !ORIGINAL_AUTHOR_DATE_EDEFAULT.equals(original_author_date);
			case ConstraintPackage.AUTHORED_RESOURCE__ORIGINAL_AUTHOR_EMAIL:
				return ORIGINAL_AUTHOR_EMAIL_EDEFAULT == null ? original_author_email != null : !ORIGINAL_AUTHOR_EMAIL_EDEFAULT.equals(original_author_email);
			case ConstraintPackage.AUTHORED_RESOURCE__ORIGINAL_AUTHOR_NAME:
				return ORIGINAL_AUTHOR_NAME_EDEFAULT == null ? original_author_name != null : !ORIGINAL_AUTHOR_NAME_EDEFAULT.equals(original_author_name);
			case ConstraintPackage.AUTHORED_RESOURCE__ORIGINAL_AUTHOR_ORGANIZATION:
				return ORIGINAL_AUTHOR_ORGANIZATION_EDEFAULT == null ? original_author_organization != null : !ORIGINAL_AUTHOR_ORGANIZATION_EDEFAULT.equals(original_author_organization);
			case ConstraintPackage.AUTHORED_RESOURCE__ORIGINAL_NAMESPACE:
				return ORIGINAL_NAMESPACE_EDEFAULT == null ? original_namespace != null : !ORIGINAL_NAMESPACE_EDEFAULT.equals(original_namespace);
			case ConstraintPackage.AUTHORED_RESOURCE__ORIGINAL_PUBLISHER:
				return ORIGINAL_PUBLISHER_EDEFAULT == null ? original_publisher != null : !ORIGINAL_PUBLISHER_EDEFAULT.equals(original_publisher);
			case ConstraintPackage.AUTHORED_RESOURCE__OTHER_CONTRIBUTORS:
				return other_contributors != null && !other_contributors.isEmpty();
			case ConstraintPackage.AUTHORED_RESOURCE__OTHER_DETAILS:
				return otherDetails != null && !otherDetails.isEmpty();
			case ConstraintPackage.AUTHORED_RESOURCE__OTHER_DETAILS_ID:
				return otherDetails_ids != null && !otherDetails_ids.isEmpty();
			case ConstraintPackage.AUTHORED_RESOURCE__REFERENCES:
				return references != null && !references.isEmpty();
			case ConstraintPackage.AUTHORED_RESOURCE__REFERENCES_ID:
				return references_ids != null && !references_ids.isEmpty();
			case ConstraintPackage.AUTHORED_RESOURCE__RESOURCE_DOCUMENT_LANGUAGE:
				return RESOURCE_DOCUMENT_LANGUAGE_EDEFAULT == null ? resourceDocumentLanguage != null : !RESOURCE_DOCUMENT_LANGUAGE_EDEFAULT.equals(resourceDocumentLanguage);
			case ConstraintPackage.AUTHORED_RESOURCE__RESOURCE_DOCUMENT_SYNTAX:
				return RESOURCE_DOCUMENT_SYNTAX_EDEFAULT == null ? resourceDocumentSyntax != null : !RESOURCE_DOCUMENT_SYNTAX_EDEFAULT.equals(resourceDocumentSyntax);
			case ConstraintPackage.AUTHORED_RESOURCE__RESOURCE_SOURCE:
				return RESOURCE_SOURCE_EDEFAULT == null ? resourceSource != null : !RESOURCE_SOURCE_EDEFAULT.equals(resourceSource);
			case ConstraintPackage.AUTHORED_RESOURCE__RESOURCE_SOURCE_URI:
				return RESOURCE_SOURCE_URI_EDEFAULT == null ? resourceSourceURI != null : !RESOURCE_SOURCE_URI_EDEFAULT.equals(resourceSourceURI);
			case ConstraintPackage.AUTHORED_RESOURCE__BASE_NAMESPACE:
				return base_Namespace != null;
			case ConstraintPackage.AUTHORED_RESOURCE__RESOURCE_PACKAGE_URI:
				return RESOURCE_PACKAGE_URI_EDEFAULT == null ? resource_package_uri != null : !RESOURCE_PACKAGE_URI_EDEFAULT.equals(resource_package_uri);
			case ConstraintPackage.AUTHORED_RESOURCE__UID:
				return UID_EDEFAULT == null ? uid != null : !UID_EDEFAULT.equals(uid);
			case ConstraintPackage.AUTHORED_RESOURCE__IP_ACKNOWLEDGEMENTS:
				return ip_acknowledgements != null && !ip_acknowledgements.isEmpty();
			case ConstraintPackage.AUTHORED_RESOURCE__IP_ACKNOWLEDGEMENTS_ID:
				return ip_acknowledgements_ids != null && !ip_acknowledgements_ids.isEmpty();
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
		result.append(" (copyright: ");
		result.append(copyright);
		result.append(", current_revision: ");
		result.append(current_revision);
		result.append(", custodian_namespace: ");
		result.append(custodian_namespace);
		result.append(", custodian_organisation: ");
		result.append(custodian_organisation);
		result.append(", licence: ");
		result.append(licence);
		result.append(", lifecycle_state: ");
		result.append(lifecycle_state);
		result.append(", original_author_date: ");
		result.append(original_author_date);
		result.append(", original_author_email: ");
		result.append(original_author_email);
		result.append(", original_author_name: ");
		result.append(original_author_name);
		result.append(", original_author_organization: ");
		result.append(original_author_organization);
		result.append(", original_namespace: ");
		result.append(original_namespace);
		result.append(", original_publisher: ");
		result.append(original_publisher);
		result.append(", other_contributors: ");
		result.append(other_contributors);
		result.append(", otherDetails: ");
		result.append(otherDetails);
		result.append(", otherDetails_id: ");
		result.append(otherDetails_ids);
		result.append(", references: ");
		result.append(references);
		result.append(", references_id: ");
		result.append(references_ids);
		result.append(", resourceDocumentLanguage: ");
		result.append(resourceDocumentLanguage);
		result.append(", resourceDocumentSyntax: ");
		result.append(resourceDocumentSyntax);
		result.append(", resourceSource: ");
		result.append(resourceSource);
		result.append(", resourceSourceURI: ");
		result.append(resourceSourceURI);
		result.append(", resource_package_uri: ");
		result.append(resource_package_uri);
		result.append(", uid: ");
		result.append(uid);
		result.append(", ip_acknowledgements: ");
		result.append(ip_acknowledgements);
		result.append(", ip_acknowledgements_id: ");
		result.append(ip_acknowledgements_ids);
		result.append(')');
		return result.toString();
	}

} //AuthoredResourceImpl
