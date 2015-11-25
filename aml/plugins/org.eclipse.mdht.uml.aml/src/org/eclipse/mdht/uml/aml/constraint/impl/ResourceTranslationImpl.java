/**
 */
package org.eclipse.mdht.uml.aml.constraint.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectValidator;

import org.eclipse.mdht.uml.aml.constraint.ConstraintPackage;
import org.eclipse.mdht.uml.aml.constraint.ResourceTranslation;

import org.eclipse.mdht.uml.aml.constraint.util.ConstraintValidator;

import org.eclipse.uml2.uml.Enumeration;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resource Translation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.aml.constraint.impl.ResourceTranslationImpl#getBase_Enumeration <em>Base Enumeration</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.aml.constraint.impl.ResourceTranslationImpl#getAccreditation <em>Accreditation</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.aml.constraint.impl.ResourceTranslationImpl#getOther_translation_details <em>Other translation details</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.aml.constraint.impl.ResourceTranslationImpl#getOther_translation_details_ids <em>Other translation details id</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.aml.constraint.impl.ResourceTranslationImpl#getPurpose <em>Purpose</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.aml.constraint.impl.ResourceTranslationImpl#getKeywords <em>Keywords</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.aml.constraint.impl.ResourceTranslationImpl#getUse <em>Use</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.aml.constraint.impl.ResourceTranslationImpl#getMisuse <em>Misuse</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.aml.constraint.impl.ResourceTranslationImpl#getCopyright <em>Copyright</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.aml.constraint.impl.ResourceTranslationImpl#getOriginal_resource_uris <em>Original resource uri</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.aml.constraint.impl.ResourceTranslationImpl#getOriginal_resource_uriIds <em>Original resource uri Id</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.aml.constraint.impl.ResourceTranslationImpl#getOther_details <em>Other details</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.aml.constraint.impl.ResourceTranslationImpl#getOther_detailsIds <em>Other details Id</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.aml.constraint.impl.ResourceTranslationImpl#getAuthor_name <em>Author name</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.aml.constraint.impl.ResourceTranslationImpl#getAuthor_organization <em>Author organization</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.aml.constraint.impl.ResourceTranslationImpl#getAuthor_email <em>Author email</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.aml.constraint.impl.ResourceTranslationImpl#getAuthor_date <em>Author date</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.aml.constraint.impl.ResourceTranslationImpl#getVersion_last_translated <em>Version last translated</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResourceTranslationImpl extends MinimalEObjectImpl.Container implements ResourceTranslation {
	/**
	 * The cached value of the '{@link #getBase_Enumeration() <em>Base Enumeration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_Enumeration()
	 * @generated
	 * @ordered
	 */
	protected Enumeration base_Enumeration;

	/**
	 * The default value of the '{@link #getAccreditation() <em>Accreditation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccreditation()
	 * @generated
	 * @ordered
	 */
	protected static final String ACCREDITATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAccreditation() <em>Accreditation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccreditation()
	 * @generated
	 * @ordered
	 */
	protected String accreditation = ACCREDITATION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOther_translation_details() <em>Other translation details</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOther_translation_details()
	 * @generated
	 * @ordered
	 */
	protected EList<String> other_translation_details;

	/**
	 * The cached value of the '{@link #getOther_translation_details_ids() <em>Other translation details id</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOther_translation_details_ids()
	 * @generated
	 * @ordered
	 */
	protected EList<String> other_translation_details_ids;

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
	 * The cached value of the '{@link #getKeywords() <em>Keywords</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeywords()
	 * @generated
	 * @ordered
	 */
	protected EList<String> keywords;

	/**
	 * The default value of the '{@link #getUse() <em>Use</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUse()
	 * @generated
	 * @ordered
	 */
	protected static final String USE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUse() <em>Use</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUse()
	 * @generated
	 * @ordered
	 */
	protected String use = USE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMisuse() <em>Misuse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMisuse()
	 * @generated
	 * @ordered
	 */
	protected static final String MISUSE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMisuse() <em>Misuse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMisuse()
	 * @generated
	 * @ordered
	 */
	protected String misuse = MISUSE_EDEFAULT;

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
	 * The cached value of the '{@link #getOriginal_resource_uris() <em>Original resource uri</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginal_resource_uris()
	 * @generated
	 * @ordered
	 */
	protected EList<String> original_resource_uris;

	/**
	 * The cached value of the '{@link #getOriginal_resource_uriIds() <em>Original resource uri Id</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginal_resource_uriIds()
	 * @generated
	 * @ordered
	 */
	protected EList<String> original_resource_uriIds;

	/**
	 * The cached value of the '{@link #getOther_details() <em>Other details</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOther_details()
	 * @generated
	 * @ordered
	 */
	protected EList<String> other_details;

	/**
	 * The cached value of the '{@link #getOther_detailsIds() <em>Other details Id</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOther_detailsIds()
	 * @generated
	 * @ordered
	 */
	protected EList<String> other_detailsIds;

	/**
	 * The default value of the '{@link #getAuthor_name() <em>Author name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthor_name()
	 * @generated
	 * @ordered
	 */
	protected static final String AUTHOR_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAuthor_name() <em>Author name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthor_name()
	 * @generated
	 * @ordered
	 */
	protected String author_name = AUTHOR_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getAuthor_organization() <em>Author organization</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthor_organization()
	 * @generated
	 * @ordered
	 */
	protected static final String AUTHOR_ORGANIZATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAuthor_organization() <em>Author organization</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthor_organization()
	 * @generated
	 * @ordered
	 */
	protected String author_organization = AUTHOR_ORGANIZATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getAuthor_email() <em>Author email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthor_email()
	 * @generated
	 * @ordered
	 */
	protected static final String AUTHOR_EMAIL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAuthor_email() <em>Author email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthor_email()
	 * @generated
	 * @ordered
	 */
	protected String author_email = AUTHOR_EMAIL_EDEFAULT;

	/**
	 * The default value of the '{@link #getAuthor_date() <em>Author date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthor_date()
	 * @generated
	 * @ordered
	 */
	protected static final String AUTHOR_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAuthor_date() <em>Author date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthor_date()
	 * @generated
	 * @ordered
	 */
	protected String author_date = AUTHOR_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getVersion_last_translated() <em>Version last translated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion_last_translated()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_LAST_TRANSLATED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVersion_last_translated() <em>Version last translated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion_last_translated()
	 * @generated
	 * @ordered
	 */
	protected String version_last_translated = VERSION_LAST_TRANSLATED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceTranslationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConstraintPackage.Literals.RESOURCE_TRANSLATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Enumeration getBase_Enumeration() {
		if (base_Enumeration != null && base_Enumeration.eIsProxy()) {
			InternalEObject oldBase_Enumeration = (InternalEObject)base_Enumeration;
			base_Enumeration = (Enumeration)eResolveProxy(oldBase_Enumeration);
			if (base_Enumeration != oldBase_Enumeration) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ConstraintPackage.RESOURCE_TRANSLATION__BASE_ENUMERATION, oldBase_Enumeration, base_Enumeration));
			}
		}
		return base_Enumeration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Enumeration basicGetBase_Enumeration() {
		return base_Enumeration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_Enumeration(Enumeration newBase_Enumeration) {
		Enumeration oldBase_Enumeration = base_Enumeration;
		base_Enumeration = newBase_Enumeration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConstraintPackage.RESOURCE_TRANSLATION__BASE_ENUMERATION, oldBase_Enumeration, base_Enumeration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAccreditation() {
		return accreditation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccreditation(String newAccreditation) {
		String oldAccreditation = accreditation;
		accreditation = newAccreditation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConstraintPackage.RESOURCE_TRANSLATION__ACCREDITATION, oldAccreditation, accreditation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getOther_translation_details() {
		if (other_translation_details == null) {
			other_translation_details = new EDataTypeUniqueEList<String>(String.class, this, ConstraintPackage.RESOURCE_TRANSLATION__OTHER_TRANSLATION_DETAILS);
		}
		return other_translation_details;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getOther_translation_details_ids() {
		if (other_translation_details_ids == null) {
			other_translation_details_ids = new EDataTypeUniqueEList<String>(String.class, this, ConstraintPackage.RESOURCE_TRANSLATION__OTHER_TRANSLATION_DETAILS_ID);
		}
		return other_translation_details_ids;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ConstraintPackage.RESOURCE_TRANSLATION__PURPOSE, oldPurpose, purpose));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getKeywords() {
		if (keywords == null) {
			keywords = new EDataTypeUniqueEList<String>(String.class, this, ConstraintPackage.RESOURCE_TRANSLATION__KEYWORDS);
		}
		return keywords;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUse() {
		return use;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUse(String newUse) {
		String oldUse = use;
		use = newUse;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConstraintPackage.RESOURCE_TRANSLATION__USE, oldUse, use));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMisuse() {
		return misuse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMisuse(String newMisuse) {
		String oldMisuse = misuse;
		misuse = newMisuse;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConstraintPackage.RESOURCE_TRANSLATION__MISUSE, oldMisuse, misuse));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ConstraintPackage.RESOURCE_TRANSLATION__COPYRIGHT, oldCopyright, copyright));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getOriginal_resource_uris() {
		if (original_resource_uris == null) {
			original_resource_uris = new EDataTypeUniqueEList<String>(String.class, this, ConstraintPackage.RESOURCE_TRANSLATION__ORIGINAL_RESOURCE_URI);
		}
		return original_resource_uris;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getOriginal_resource_uriIds() {
		if (original_resource_uriIds == null) {
			original_resource_uriIds = new EDataTypeUniqueEList<String>(String.class, this, ConstraintPackage.RESOURCE_TRANSLATION__ORIGINAL_RESOURCE_URI_ID);
		}
		return original_resource_uriIds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getOther_details() {
		if (other_details == null) {
			other_details = new EDataTypeUniqueEList<String>(String.class, this, ConstraintPackage.RESOURCE_TRANSLATION__OTHER_DETAILS);
		}
		return other_details;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getOther_detailsIds() {
		if (other_detailsIds == null) {
			other_detailsIds = new EDataTypeUniqueEList<String>(String.class, this, ConstraintPackage.RESOURCE_TRANSLATION__OTHER_DETAILS_ID);
		}
		return other_detailsIds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAuthor_name() {
		return author_name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuthor_name(String newAuthor_name) {
		String oldAuthor_name = author_name;
		author_name = newAuthor_name;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConstraintPackage.RESOURCE_TRANSLATION__AUTHOR_NAME, oldAuthor_name, author_name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAuthor_organization() {
		return author_organization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuthor_organization(String newAuthor_organization) {
		String oldAuthor_organization = author_organization;
		author_organization = newAuthor_organization;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConstraintPackage.RESOURCE_TRANSLATION__AUTHOR_ORGANIZATION, oldAuthor_organization, author_organization));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAuthor_email() {
		return author_email;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuthor_email(String newAuthor_email) {
		String oldAuthor_email = author_email;
		author_email = newAuthor_email;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConstraintPackage.RESOURCE_TRANSLATION__AUTHOR_EMAIL, oldAuthor_email, author_email));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAuthor_date() {
		return author_date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuthor_date(String newAuthor_date) {
		String oldAuthor_date = author_date;
		author_date = newAuthor_date;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConstraintPackage.RESOURCE_TRANSLATION__AUTHOR_DATE, oldAuthor_date, author_date));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVersion_last_translated() {
		return version_last_translated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion_last_translated(String newVersion_last_translated) {
		String oldVersion_last_translated = version_last_translated;
		version_last_translated = newVersion_last_translated;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConstraintPackage.RESOURCE_TRANSLATION__VERSION_LAST_TRANSLATED, oldVersion_last_translated, version_last_translated));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAOMVOTMterminologytranslationsvalidity(DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConstraintValidator.DIAGNOSTIC_SOURCE,
						 ConstraintValidator.RESOURCE_TRANSLATION__AOMVOT_MTERMINOLOGYTRANSLATIONSVALIDITY,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateAOMVOTMterminologytranslationsvalidity", EObjectValidator.getObjectLabel(this, context) }),
						 new Object [] { this }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTranslationEntries(DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConstraintValidator.DIAGNOSTIC_SOURCE,
						 ConstraintValidator.RESOURCE_TRANSLATION__TRANSLATION_ENTRIES,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateTranslationEntries", EObjectValidator.getObjectLabel(this, context) }),
						 new Object [] { this }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUniqueEntries(DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConstraintValidator.DIAGNOSTIC_SOURCE,
						 ConstraintValidator.RESOURCE_TRANSLATION__UNIQUE_ENTRIES,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateUniqueEntries", EObjectValidator.getObjectLabel(this, context) }),
						 new Object [] { this }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ConstraintPackage.RESOURCE_TRANSLATION__BASE_ENUMERATION:
				if (resolve) return getBase_Enumeration();
				return basicGetBase_Enumeration();
			case ConstraintPackage.RESOURCE_TRANSLATION__ACCREDITATION:
				return getAccreditation();
			case ConstraintPackage.RESOURCE_TRANSLATION__OTHER_TRANSLATION_DETAILS:
				return getOther_translation_details();
			case ConstraintPackage.RESOURCE_TRANSLATION__OTHER_TRANSLATION_DETAILS_ID:
				return getOther_translation_details_ids();
			case ConstraintPackage.RESOURCE_TRANSLATION__PURPOSE:
				return getPurpose();
			case ConstraintPackage.RESOURCE_TRANSLATION__KEYWORDS:
				return getKeywords();
			case ConstraintPackage.RESOURCE_TRANSLATION__USE:
				return getUse();
			case ConstraintPackage.RESOURCE_TRANSLATION__MISUSE:
				return getMisuse();
			case ConstraintPackage.RESOURCE_TRANSLATION__COPYRIGHT:
				return getCopyright();
			case ConstraintPackage.RESOURCE_TRANSLATION__ORIGINAL_RESOURCE_URI:
				return getOriginal_resource_uris();
			case ConstraintPackage.RESOURCE_TRANSLATION__ORIGINAL_RESOURCE_URI_ID:
				return getOriginal_resource_uriIds();
			case ConstraintPackage.RESOURCE_TRANSLATION__OTHER_DETAILS:
				return getOther_details();
			case ConstraintPackage.RESOURCE_TRANSLATION__OTHER_DETAILS_ID:
				return getOther_detailsIds();
			case ConstraintPackage.RESOURCE_TRANSLATION__AUTHOR_NAME:
				return getAuthor_name();
			case ConstraintPackage.RESOURCE_TRANSLATION__AUTHOR_ORGANIZATION:
				return getAuthor_organization();
			case ConstraintPackage.RESOURCE_TRANSLATION__AUTHOR_EMAIL:
				return getAuthor_email();
			case ConstraintPackage.RESOURCE_TRANSLATION__AUTHOR_DATE:
				return getAuthor_date();
			case ConstraintPackage.RESOURCE_TRANSLATION__VERSION_LAST_TRANSLATED:
				return getVersion_last_translated();
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
			case ConstraintPackage.RESOURCE_TRANSLATION__BASE_ENUMERATION:
				setBase_Enumeration((Enumeration)newValue);
				return;
			case ConstraintPackage.RESOURCE_TRANSLATION__ACCREDITATION:
				setAccreditation((String)newValue);
				return;
			case ConstraintPackage.RESOURCE_TRANSLATION__OTHER_TRANSLATION_DETAILS:
				getOther_translation_details().clear();
				getOther_translation_details().addAll((Collection<? extends String>)newValue);
				return;
			case ConstraintPackage.RESOURCE_TRANSLATION__OTHER_TRANSLATION_DETAILS_ID:
				getOther_translation_details_ids().clear();
				getOther_translation_details_ids().addAll((Collection<? extends String>)newValue);
				return;
			case ConstraintPackage.RESOURCE_TRANSLATION__PURPOSE:
				setPurpose((String)newValue);
				return;
			case ConstraintPackage.RESOURCE_TRANSLATION__KEYWORDS:
				getKeywords().clear();
				getKeywords().addAll((Collection<? extends String>)newValue);
				return;
			case ConstraintPackage.RESOURCE_TRANSLATION__USE:
				setUse((String)newValue);
				return;
			case ConstraintPackage.RESOURCE_TRANSLATION__MISUSE:
				setMisuse((String)newValue);
				return;
			case ConstraintPackage.RESOURCE_TRANSLATION__COPYRIGHT:
				setCopyright((String)newValue);
				return;
			case ConstraintPackage.RESOURCE_TRANSLATION__ORIGINAL_RESOURCE_URI:
				getOriginal_resource_uris().clear();
				getOriginal_resource_uris().addAll((Collection<? extends String>)newValue);
				return;
			case ConstraintPackage.RESOURCE_TRANSLATION__ORIGINAL_RESOURCE_URI_ID:
				getOriginal_resource_uriIds().clear();
				getOriginal_resource_uriIds().addAll((Collection<? extends String>)newValue);
				return;
			case ConstraintPackage.RESOURCE_TRANSLATION__OTHER_DETAILS:
				getOther_details().clear();
				getOther_details().addAll((Collection<? extends String>)newValue);
				return;
			case ConstraintPackage.RESOURCE_TRANSLATION__OTHER_DETAILS_ID:
				getOther_detailsIds().clear();
				getOther_detailsIds().addAll((Collection<? extends String>)newValue);
				return;
			case ConstraintPackage.RESOURCE_TRANSLATION__AUTHOR_NAME:
				setAuthor_name((String)newValue);
				return;
			case ConstraintPackage.RESOURCE_TRANSLATION__AUTHOR_ORGANIZATION:
				setAuthor_organization((String)newValue);
				return;
			case ConstraintPackage.RESOURCE_TRANSLATION__AUTHOR_EMAIL:
				setAuthor_email((String)newValue);
				return;
			case ConstraintPackage.RESOURCE_TRANSLATION__AUTHOR_DATE:
				setAuthor_date((String)newValue);
				return;
			case ConstraintPackage.RESOURCE_TRANSLATION__VERSION_LAST_TRANSLATED:
				setVersion_last_translated((String)newValue);
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
			case ConstraintPackage.RESOURCE_TRANSLATION__BASE_ENUMERATION:
				setBase_Enumeration((Enumeration)null);
				return;
			case ConstraintPackage.RESOURCE_TRANSLATION__ACCREDITATION:
				setAccreditation(ACCREDITATION_EDEFAULT);
				return;
			case ConstraintPackage.RESOURCE_TRANSLATION__OTHER_TRANSLATION_DETAILS:
				getOther_translation_details().clear();
				return;
			case ConstraintPackage.RESOURCE_TRANSLATION__OTHER_TRANSLATION_DETAILS_ID:
				getOther_translation_details_ids().clear();
				return;
			case ConstraintPackage.RESOURCE_TRANSLATION__PURPOSE:
				setPurpose(PURPOSE_EDEFAULT);
				return;
			case ConstraintPackage.RESOURCE_TRANSLATION__KEYWORDS:
				getKeywords().clear();
				return;
			case ConstraintPackage.RESOURCE_TRANSLATION__USE:
				setUse(USE_EDEFAULT);
				return;
			case ConstraintPackage.RESOURCE_TRANSLATION__MISUSE:
				setMisuse(MISUSE_EDEFAULT);
				return;
			case ConstraintPackage.RESOURCE_TRANSLATION__COPYRIGHT:
				setCopyright(COPYRIGHT_EDEFAULT);
				return;
			case ConstraintPackage.RESOURCE_TRANSLATION__ORIGINAL_RESOURCE_URI:
				getOriginal_resource_uris().clear();
				return;
			case ConstraintPackage.RESOURCE_TRANSLATION__ORIGINAL_RESOURCE_URI_ID:
				getOriginal_resource_uriIds().clear();
				return;
			case ConstraintPackage.RESOURCE_TRANSLATION__OTHER_DETAILS:
				getOther_details().clear();
				return;
			case ConstraintPackage.RESOURCE_TRANSLATION__OTHER_DETAILS_ID:
				getOther_detailsIds().clear();
				return;
			case ConstraintPackage.RESOURCE_TRANSLATION__AUTHOR_NAME:
				setAuthor_name(AUTHOR_NAME_EDEFAULT);
				return;
			case ConstraintPackage.RESOURCE_TRANSLATION__AUTHOR_ORGANIZATION:
				setAuthor_organization(AUTHOR_ORGANIZATION_EDEFAULT);
				return;
			case ConstraintPackage.RESOURCE_TRANSLATION__AUTHOR_EMAIL:
				setAuthor_email(AUTHOR_EMAIL_EDEFAULT);
				return;
			case ConstraintPackage.RESOURCE_TRANSLATION__AUTHOR_DATE:
				setAuthor_date(AUTHOR_DATE_EDEFAULT);
				return;
			case ConstraintPackage.RESOURCE_TRANSLATION__VERSION_LAST_TRANSLATED:
				setVersion_last_translated(VERSION_LAST_TRANSLATED_EDEFAULT);
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
			case ConstraintPackage.RESOURCE_TRANSLATION__BASE_ENUMERATION:
				return base_Enumeration != null;
			case ConstraintPackage.RESOURCE_TRANSLATION__ACCREDITATION:
				return ACCREDITATION_EDEFAULT == null ? accreditation != null : !ACCREDITATION_EDEFAULT.equals(accreditation);
			case ConstraintPackage.RESOURCE_TRANSLATION__OTHER_TRANSLATION_DETAILS:
				return other_translation_details != null && !other_translation_details.isEmpty();
			case ConstraintPackage.RESOURCE_TRANSLATION__OTHER_TRANSLATION_DETAILS_ID:
				return other_translation_details_ids != null && !other_translation_details_ids.isEmpty();
			case ConstraintPackage.RESOURCE_TRANSLATION__PURPOSE:
				return PURPOSE_EDEFAULT == null ? purpose != null : !PURPOSE_EDEFAULT.equals(purpose);
			case ConstraintPackage.RESOURCE_TRANSLATION__KEYWORDS:
				return keywords != null && !keywords.isEmpty();
			case ConstraintPackage.RESOURCE_TRANSLATION__USE:
				return USE_EDEFAULT == null ? use != null : !USE_EDEFAULT.equals(use);
			case ConstraintPackage.RESOURCE_TRANSLATION__MISUSE:
				return MISUSE_EDEFAULT == null ? misuse != null : !MISUSE_EDEFAULT.equals(misuse);
			case ConstraintPackage.RESOURCE_TRANSLATION__COPYRIGHT:
				return COPYRIGHT_EDEFAULT == null ? copyright != null : !COPYRIGHT_EDEFAULT.equals(copyright);
			case ConstraintPackage.RESOURCE_TRANSLATION__ORIGINAL_RESOURCE_URI:
				return original_resource_uris != null && !original_resource_uris.isEmpty();
			case ConstraintPackage.RESOURCE_TRANSLATION__ORIGINAL_RESOURCE_URI_ID:
				return original_resource_uriIds != null && !original_resource_uriIds.isEmpty();
			case ConstraintPackage.RESOURCE_TRANSLATION__OTHER_DETAILS:
				return other_details != null && !other_details.isEmpty();
			case ConstraintPackage.RESOURCE_TRANSLATION__OTHER_DETAILS_ID:
				return other_detailsIds != null && !other_detailsIds.isEmpty();
			case ConstraintPackage.RESOURCE_TRANSLATION__AUTHOR_NAME:
				return AUTHOR_NAME_EDEFAULT == null ? author_name != null : !AUTHOR_NAME_EDEFAULT.equals(author_name);
			case ConstraintPackage.RESOURCE_TRANSLATION__AUTHOR_ORGANIZATION:
				return AUTHOR_ORGANIZATION_EDEFAULT == null ? author_organization != null : !AUTHOR_ORGANIZATION_EDEFAULT.equals(author_organization);
			case ConstraintPackage.RESOURCE_TRANSLATION__AUTHOR_EMAIL:
				return AUTHOR_EMAIL_EDEFAULT == null ? author_email != null : !AUTHOR_EMAIL_EDEFAULT.equals(author_email);
			case ConstraintPackage.RESOURCE_TRANSLATION__AUTHOR_DATE:
				return AUTHOR_DATE_EDEFAULT == null ? author_date != null : !AUTHOR_DATE_EDEFAULT.equals(author_date);
			case ConstraintPackage.RESOURCE_TRANSLATION__VERSION_LAST_TRANSLATED:
				return VERSION_LAST_TRANSLATED_EDEFAULT == null ? version_last_translated != null : !VERSION_LAST_TRANSLATED_EDEFAULT.equals(version_last_translated);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ConstraintPackage.RESOURCE_TRANSLATION___VALIDATE_AOMVOT_MTERMINOLOGYTRANSLATIONSVALIDITY__DIAGNOSTICCHAIN_MAP:
				return validateAOMVOTMterminologytranslationsvalidity((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case ConstraintPackage.RESOURCE_TRANSLATION___VALIDATE_TRANSLATION_ENTRIES__DIAGNOSTICCHAIN_MAP:
				return validateTranslationEntries((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case ConstraintPackage.RESOURCE_TRANSLATION___VALIDATE_UNIQUE_ENTRIES__DIAGNOSTICCHAIN_MAP:
				return validateUniqueEntries((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (accreditation: ");
		result.append(accreditation);
		result.append(", other_translation_details: ");
		result.append(other_translation_details);
		result.append(", other_translation_details_id: ");
		result.append(other_translation_details_ids);
		result.append(", purpose: ");
		result.append(purpose);
		result.append(", keywords: ");
		result.append(keywords);
		result.append(", use: ");
		result.append(use);
		result.append(", misuse: ");
		result.append(misuse);
		result.append(", copyright: ");
		result.append(copyright);
		result.append(", original_resource_uri: ");
		result.append(original_resource_uris);
		result.append(", original_resource_uriId: ");
		result.append(original_resource_uriIds);
		result.append(", other_details: ");
		result.append(other_details);
		result.append(", other_detailsId: ");
		result.append(other_detailsIds);
		result.append(", author_name: ");
		result.append(author_name);
		result.append(", author_organization: ");
		result.append(author_organization);
		result.append(", author_email: ");
		result.append(author_email);
		result.append(", author_date: ");
		result.append(author_date);
		result.append(", version_last_translated: ");
		result.append(version_last_translated);
		result.append(')');
		return result.toString();
	}

} //ResourceTranslationImpl
