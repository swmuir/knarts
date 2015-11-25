/**
 */
package org.eclipse.mdht.uml.aml.constraint;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.Namespace;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Authored Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.aml.constraint.AuthoredResource#getCopyright <em>Copyright</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.aml.constraint.AuthoredResource#getCurrent_revision <em>Current revision</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.aml.constraint.AuthoredResource#getCustodian_namespace <em>Custodian namespace</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.aml.constraint.AuthoredResource#getCustodian_organisation <em>Custodian organisation</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.aml.constraint.AuthoredResource#getLicence <em>Licence</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.aml.constraint.AuthoredResource#getLifecycle_state <em>Lifecycle state</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.aml.constraint.AuthoredResource#getOriginal_author_date <em>Original author date</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.aml.constraint.AuthoredResource#getOriginal_author_email <em>Original author email</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.aml.constraint.AuthoredResource#getOriginal_author_name <em>Original author name</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.aml.constraint.AuthoredResource#getOriginal_author_organization <em>Original author organization</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.aml.constraint.AuthoredResource#getOriginal_namespace <em>Original namespace</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.aml.constraint.AuthoredResource#getOriginal_publisher <em>Original publisher</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.aml.constraint.AuthoredResource#getOther_contributors <em>Other contributors</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.aml.constraint.AuthoredResource#getOtherDetails <em>Other Details</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.aml.constraint.AuthoredResource#getOtherDetails_ids <em>Other Details id</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.aml.constraint.AuthoredResource#getReferences <em>References</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.aml.constraint.AuthoredResource#getReferences_ids <em>References id</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.aml.constraint.AuthoredResource#getResourceDocumentLanguage <em>Resource Document Language</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.aml.constraint.AuthoredResource#getResourceDocumentSyntax <em>Resource Document Syntax</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.aml.constraint.AuthoredResource#getResourceSource <em>Resource Source</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.aml.constraint.AuthoredResource#getResourceSourceURI <em>Resource Source URI</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.aml.constraint.AuthoredResource#getBase_Namespace <em>Base Namespace</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.aml.constraint.AuthoredResource#getResource_package_uri <em>Resource package uri</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.aml.constraint.AuthoredResource#getUid <em>Uid</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.aml.constraint.AuthoredResource#getIp_acknowledgements <em>Ip acknowledgements</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.aml.constraint.AuthoredResource#getIp_acknowledgements_ids <em>Ip acknowledgements id</em>}</li>
 * </ul>
 *
 * @see org.eclipse.mdht.uml.aml.constraint.ConstraintPackage#getAuthoredResource()
 * @model abstract="true"
 * @generated
 */
public interface AuthoredResource extends EObject {
	/**
	 * Returns the value of the '<em><b>Copyright</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Copyright</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Copyright</em>' attribute.
	 * @see #setCopyright(String)
	 * @see org.eclipse.mdht.uml.aml.constraint.ConstraintPackage#getAuthoredResource_Copyright()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	String getCopyright();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.aml.constraint.AuthoredResource#getCopyright <em>Copyright</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Copyright</em>' attribute.
	 * @see #getCopyright()
	 * @generated
	 */
	void setCopyright(String value);

	/**
	 * Returns the value of the '<em><b>Current revision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Current revision</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current revision</em>' attribute.
	 * @see #setCurrent_revision(String)
	 * @see org.eclipse.mdht.uml.aml.constraint.ConstraintPackage#getAuthoredResource_Current_revision()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	String getCurrent_revision();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.aml.constraint.AuthoredResource#getCurrent_revision <em>Current revision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current revision</em>' attribute.
	 * @see #getCurrent_revision()
	 * @generated
	 */
	void setCurrent_revision(String value);

	/**
	 * Returns the value of the '<em><b>Custodian namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Custodian namespace</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Custodian namespace</em>' attribute.
	 * @see #setCustodian_namespace(String)
	 * @see org.eclipse.mdht.uml.aml.constraint.ConstraintPackage#getAuthoredResource_Custodian_namespace()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	String getCustodian_namespace();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.aml.constraint.AuthoredResource#getCustodian_namespace <em>Custodian namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Custodian namespace</em>' attribute.
	 * @see #getCustodian_namespace()
	 * @generated
	 */
	void setCustodian_namespace(String value);

	/**
	 * Returns the value of the '<em><b>Custodian organisation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Custodian organisation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Custodian organisation</em>' attribute.
	 * @see #setCustodian_organisation(String)
	 * @see org.eclipse.mdht.uml.aml.constraint.ConstraintPackage#getAuthoredResource_Custodian_organisation()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	String getCustodian_organisation();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.aml.constraint.AuthoredResource#getCustodian_organisation <em>Custodian organisation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Custodian organisation</em>' attribute.
	 * @see #getCustodian_organisation()
	 * @generated
	 */
	void setCustodian_organisation(String value);

	/**
	 * Returns the value of the '<em><b>Licence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Licence</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Licence</em>' attribute.
	 * @see #setLicence(String)
	 * @see org.eclipse.mdht.uml.aml.constraint.ConstraintPackage#getAuthoredResource_Licence()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	String getLicence();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.aml.constraint.AuthoredResource#getLicence <em>Licence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Licence</em>' attribute.
	 * @see #getLicence()
	 * @generated
	 */
	void setLicence(String value);

	/**
	 * Returns the value of the '<em><b>Lifecycle state</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.mdht.uml.aml.constraint.Lifecycle_state}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lifecycle state</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lifecycle state</em>' attribute.
	 * @see org.eclipse.mdht.uml.aml.constraint.Lifecycle_state
	 * @see #setLifecycle_state(Lifecycle_state)
	 * @see org.eclipse.mdht.uml.aml.constraint.ConstraintPackage#getAuthoredResource_Lifecycle_state()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Lifecycle_state getLifecycle_state();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.aml.constraint.AuthoredResource#getLifecycle_state <em>Lifecycle state</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lifecycle state</em>' attribute.
	 * @see org.eclipse.mdht.uml.aml.constraint.Lifecycle_state
	 * @see #getLifecycle_state()
	 * @generated
	 */
	void setLifecycle_state(Lifecycle_state value);

	/**
	 * Returns the value of the '<em><b>Original author date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Original author date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Original author date</em>' attribute.
	 * @see #setOriginal_author_date(String)
	 * @see org.eclipse.mdht.uml.aml.constraint.ConstraintPackage#getAuthoredResource_Original_author_date()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	String getOriginal_author_date();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.aml.constraint.AuthoredResource#getOriginal_author_date <em>Original author date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Original author date</em>' attribute.
	 * @see #getOriginal_author_date()
	 * @generated
	 */
	void setOriginal_author_date(String value);

	/**
	 * Returns the value of the '<em><b>Original author email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Original author email</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Original author email</em>' attribute.
	 * @see #setOriginal_author_email(String)
	 * @see org.eclipse.mdht.uml.aml.constraint.ConstraintPackage#getAuthoredResource_Original_author_email()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	String getOriginal_author_email();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.aml.constraint.AuthoredResource#getOriginal_author_email <em>Original author email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Original author email</em>' attribute.
	 * @see #getOriginal_author_email()
	 * @generated
	 */
	void setOriginal_author_email(String value);

	/**
	 * Returns the value of the '<em><b>Original author name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Original author name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Original author name</em>' attribute.
	 * @see #setOriginal_author_name(String)
	 * @see org.eclipse.mdht.uml.aml.constraint.ConstraintPackage#getAuthoredResource_Original_author_name()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	String getOriginal_author_name();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.aml.constraint.AuthoredResource#getOriginal_author_name <em>Original author name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Original author name</em>' attribute.
	 * @see #getOriginal_author_name()
	 * @generated
	 */
	void setOriginal_author_name(String value);

	/**
	 * Returns the value of the '<em><b>Original author organization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Original author organization</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Original author organization</em>' attribute.
	 * @see #setOriginal_author_organization(String)
	 * @see org.eclipse.mdht.uml.aml.constraint.ConstraintPackage#getAuthoredResource_Original_author_organization()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	String getOriginal_author_organization();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.aml.constraint.AuthoredResource#getOriginal_author_organization <em>Original author organization</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Original author organization</em>' attribute.
	 * @see #getOriginal_author_organization()
	 * @generated
	 */
	void setOriginal_author_organization(String value);

	/**
	 * Returns the value of the '<em><b>Original namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Original namespace</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Original namespace</em>' attribute.
	 * @see #setOriginal_namespace(String)
	 * @see org.eclipse.mdht.uml.aml.constraint.ConstraintPackage#getAuthoredResource_Original_namespace()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	String getOriginal_namespace();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.aml.constraint.AuthoredResource#getOriginal_namespace <em>Original namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Original namespace</em>' attribute.
	 * @see #getOriginal_namespace()
	 * @generated
	 */
	void setOriginal_namespace(String value);

	/**
	 * Returns the value of the '<em><b>Original publisher</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Original publisher</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Original publisher</em>' attribute.
	 * @see #setOriginal_publisher(String)
	 * @see org.eclipse.mdht.uml.aml.constraint.ConstraintPackage#getAuthoredResource_Original_publisher()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	String getOriginal_publisher();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.aml.constraint.AuthoredResource#getOriginal_publisher <em>Original publisher</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Original publisher</em>' attribute.
	 * @see #getOriginal_publisher()
	 * @generated
	 */
	void setOriginal_publisher(String value);

	/**
	 * Returns the value of the '<em><b>Other contributors</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Other contributors</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Other contributors</em>' attribute list.
	 * @see org.eclipse.mdht.uml.aml.constraint.ConstraintPackage#getAuthoredResource_Other_contributors()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	EList<String> getOther_contributors();

	/**
	 * Returns the value of the '<em><b>Other Details</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Other Details</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Other Details</em>' attribute list.
	 * @see org.eclipse.mdht.uml.aml.constraint.ConstraintPackage#getAuthoredResource_OtherDetails()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	EList<String> getOtherDetails();

	/**
	 * Returns the value of the '<em><b>Other Details id</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Other Details id</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Other Details id</em>' attribute list.
	 * @see org.eclipse.mdht.uml.aml.constraint.ConstraintPackage#getAuthoredResource_OtherDetails_id()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	EList<String> getOtherDetails_ids();

	/**
	 * Returns the value of the '<em><b>References</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>References</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>References</em>' attribute list.
	 * @see org.eclipse.mdht.uml.aml.constraint.ConstraintPackage#getAuthoredResource_References()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	EList<String> getReferences();

	/**
	 * Returns the value of the '<em><b>References id</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>References id</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>References id</em>' attribute list.
	 * @see org.eclipse.mdht.uml.aml.constraint.ConstraintPackage#getAuthoredResource_References_id()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	EList<String> getReferences_ids();

	/**
	 * Returns the value of the '<em><b>Resource Document Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource Document Language</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Document Language</em>' attribute.
	 * @see #setResourceDocumentLanguage(String)
	 * @see org.eclipse.mdht.uml.aml.constraint.ConstraintPackage#getAuthoredResource_ResourceDocumentLanguage()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	String getResourceDocumentLanguage();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.aml.constraint.AuthoredResource#getResourceDocumentLanguage <em>Resource Document Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource Document Language</em>' attribute.
	 * @see #getResourceDocumentLanguage()
	 * @generated
	 */
	void setResourceDocumentLanguage(String value);

	/**
	 * Returns the value of the '<em><b>Resource Document Syntax</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource Document Syntax</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Document Syntax</em>' attribute.
	 * @see #setResourceDocumentSyntax(String)
	 * @see org.eclipse.mdht.uml.aml.constraint.ConstraintPackage#getAuthoredResource_ResourceDocumentSyntax()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	String getResourceDocumentSyntax();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.aml.constraint.AuthoredResource#getResourceDocumentSyntax <em>Resource Document Syntax</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource Document Syntax</em>' attribute.
	 * @see #getResourceDocumentSyntax()
	 * @generated
	 */
	void setResourceDocumentSyntax(String value);

	/**
	 * Returns the value of the '<em><b>Resource Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource Source</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Source</em>' attribute.
	 * @see #setResourceSource(String)
	 * @see org.eclipse.mdht.uml.aml.constraint.ConstraintPackage#getAuthoredResource_ResourceSource()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	String getResourceSource();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.aml.constraint.AuthoredResource#getResourceSource <em>Resource Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource Source</em>' attribute.
	 * @see #getResourceSource()
	 * @generated
	 */
	void setResourceSource(String value);

	/**
	 * Returns the value of the '<em><b>Resource Source URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource Source URI</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Source URI</em>' attribute.
	 * @see #setResourceSourceURI(String)
	 * @see org.eclipse.mdht.uml.aml.constraint.ConstraintPackage#getAuthoredResource_ResourceSourceURI()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	String getResourceSourceURI();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.aml.constraint.AuthoredResource#getResourceSourceURI <em>Resource Source URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource Source URI</em>' attribute.
	 * @see #getResourceSourceURI()
	 * @generated
	 */
	void setResourceSourceURI(String value);

	/**
	 * Returns the value of the '<em><b>Base Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Namespace</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Namespace</em>' reference.
	 * @see #setBase_Namespace(Namespace)
	 * @see org.eclipse.mdht.uml.aml.constraint.ConstraintPackage#getAuthoredResource_Base_Namespace()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Namespace getBase_Namespace();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.aml.constraint.AuthoredResource#getBase_Namespace <em>Base Namespace</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Namespace</em>' reference.
	 * @see #getBase_Namespace()
	 * @generated
	 */
	void setBase_Namespace(Namespace value);

	/**
	 * Returns the value of the '<em><b>Resource package uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource package uri</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource package uri</em>' attribute.
	 * @see #setResource_package_uri(String)
	 * @see org.eclipse.mdht.uml.aml.constraint.ConstraintPackage#getAuthoredResource_Resource_package_uri()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	String getResource_package_uri();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.aml.constraint.AuthoredResource#getResource_package_uri <em>Resource package uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource package uri</em>' attribute.
	 * @see #getResource_package_uri()
	 * @generated
	 */
	void setResource_package_uri(String value);

	/**
	 * Returns the value of the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uid</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uid</em>' attribute.
	 * @see #setUid(String)
	 * @see org.eclipse.mdht.uml.aml.constraint.ConstraintPackage#getAuthoredResource_Uid()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	String getUid();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.aml.constraint.AuthoredResource#getUid <em>Uid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uid</em>' attribute.
	 * @see #getUid()
	 * @generated
	 */
	void setUid(String value);

	/**
	 * Returns the value of the '<em><b>Ip acknowledgements</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ip acknowledgements</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ip acknowledgements</em>' attribute list.
	 * @see org.eclipse.mdht.uml.aml.constraint.ConstraintPackage#getAuthoredResource_Ip_acknowledgements()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	EList<String> getIp_acknowledgements();

	/**
	 * Returns the value of the '<em><b>Ip acknowledgements id</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ip acknowledgements id</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ip acknowledgements id</em>' attribute list.
	 * @see org.eclipse.mdht.uml.aml.constraint.ConstraintPackage#getAuthoredResource_Ip_acknowledgements_id()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	EList<String> getIp_acknowledgements_ids();

} // AuthoredResource
