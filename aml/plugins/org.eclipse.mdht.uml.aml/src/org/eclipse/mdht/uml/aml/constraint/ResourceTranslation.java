/**
 */
package org.eclipse.mdht.uml.aml.constraint;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.Enumeration;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource Translation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.aml.constraint.ResourceTranslation#getBase_Enumeration <em>Base Enumeration</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.aml.constraint.ResourceTranslation#getAccreditation <em>Accreditation</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.aml.constraint.ResourceTranslation#getOther_translation_details <em>Other translation details</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.aml.constraint.ResourceTranslation#getOther_translation_details_ids <em>Other translation details id</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.aml.constraint.ResourceTranslation#getPurpose <em>Purpose</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.aml.constraint.ResourceTranslation#getKeywords <em>Keywords</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.aml.constraint.ResourceTranslation#getUse <em>Use</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.aml.constraint.ResourceTranslation#getMisuse <em>Misuse</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.aml.constraint.ResourceTranslation#getCopyright <em>Copyright</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.aml.constraint.ResourceTranslation#getOriginal_resource_uris <em>Original resource uri</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.aml.constraint.ResourceTranslation#getOriginal_resource_uriIds <em>Original resource uri Id</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.aml.constraint.ResourceTranslation#getOther_details <em>Other details</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.aml.constraint.ResourceTranslation#getOther_detailsIds <em>Other details Id</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.aml.constraint.ResourceTranslation#getAuthor_name <em>Author name</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.aml.constraint.ResourceTranslation#getAuthor_organization <em>Author organization</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.aml.constraint.ResourceTranslation#getAuthor_email <em>Author email</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.aml.constraint.ResourceTranslation#getAuthor_date <em>Author date</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.aml.constraint.ResourceTranslation#getVersion_last_translated <em>Version last translated</em>}</li>
 * </ul>
 *
 * @see org.eclipse.mdht.uml.aml.constraint.ConstraintPackage#getResourceTranslation()
 * @model
 * @generated
 */
public interface ResourceTranslation extends EObject {
	/**
	 * Returns the value of the '<em><b>Base Enumeration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Enumeration</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Enumeration</em>' reference.
	 * @see #setBase_Enumeration(Enumeration)
	 * @see org.eclipse.mdht.uml.aml.constraint.ConstraintPackage#getResourceTranslation_Base_Enumeration()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Enumeration getBase_Enumeration();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.aml.constraint.ResourceTranslation#getBase_Enumeration <em>Base Enumeration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Enumeration</em>' reference.
	 * @see #getBase_Enumeration()
	 * @generated
	 */
	void setBase_Enumeration(Enumeration value);

	/**
	 * Returns the value of the '<em><b>Accreditation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Accreditation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Accreditation</em>' attribute.
	 * @see #setAccreditation(String)
	 * @see org.eclipse.mdht.uml.aml.constraint.ConstraintPackage#getResourceTranslation_Accreditation()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	String getAccreditation();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.aml.constraint.ResourceTranslation#getAccreditation <em>Accreditation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Accreditation</em>' attribute.
	 * @see #getAccreditation()
	 * @generated
	 */
	void setAccreditation(String value);

	/**
	 * Returns the value of the '<em><b>Other translation details</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Other translation details</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Other translation details</em>' attribute list.
	 * @see org.eclipse.mdht.uml.aml.constraint.ConstraintPackage#getResourceTranslation_Other_translation_details()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	EList<String> getOther_translation_details();

	/**
	 * Returns the value of the '<em><b>Other translation details id</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Other translation details id</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Other translation details id</em>' attribute list.
	 * @see org.eclipse.mdht.uml.aml.constraint.ConstraintPackage#getResourceTranslation_Other_translation_details_id()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	EList<String> getOther_translation_details_ids();

	/**
	 * Returns the value of the '<em><b>Purpose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Purpose</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Purpose</em>' attribute.
	 * @see #setPurpose(String)
	 * @see org.eclipse.mdht.uml.aml.constraint.ConstraintPackage#getResourceTranslation_Purpose()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getPurpose();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.aml.constraint.ResourceTranslation#getPurpose <em>Purpose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Purpose</em>' attribute.
	 * @see #getPurpose()
	 * @generated
	 */
	void setPurpose(String value);

	/**
	 * Returns the value of the '<em><b>Keywords</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Keywords</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Keywords</em>' attribute list.
	 * @see org.eclipse.mdht.uml.aml.constraint.ConstraintPackage#getResourceTranslation_Keywords()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	EList<String> getKeywords();

	/**
	 * Returns the value of the '<em><b>Use</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Use</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Use</em>' attribute.
	 * @see #setUse(String)
	 * @see org.eclipse.mdht.uml.aml.constraint.ConstraintPackage#getResourceTranslation_Use()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	String getUse();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.aml.constraint.ResourceTranslation#getUse <em>Use</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use</em>' attribute.
	 * @see #getUse()
	 * @generated
	 */
	void setUse(String value);

	/**
	 * Returns the value of the '<em><b>Misuse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Misuse</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Misuse</em>' attribute.
	 * @see #setMisuse(String)
	 * @see org.eclipse.mdht.uml.aml.constraint.ConstraintPackage#getResourceTranslation_Misuse()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	String getMisuse();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.aml.constraint.ResourceTranslation#getMisuse <em>Misuse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Misuse</em>' attribute.
	 * @see #getMisuse()
	 * @generated
	 */
	void setMisuse(String value);

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
	 * @see org.eclipse.mdht.uml.aml.constraint.ConstraintPackage#getResourceTranslation_Copyright()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	String getCopyright();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.aml.constraint.ResourceTranslation#getCopyright <em>Copyright</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Copyright</em>' attribute.
	 * @see #getCopyright()
	 * @generated
	 */
	void setCopyright(String value);

	/**
	 * Returns the value of the '<em><b>Original resource uri</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Original resource uri</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Original resource uri</em>' attribute list.
	 * @see org.eclipse.mdht.uml.aml.constraint.ConstraintPackage#getResourceTranslation_Original_resource_uri()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	EList<String> getOriginal_resource_uris();

	/**
	 * Returns the value of the '<em><b>Original resource uri Id</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Original resource uri Id</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Original resource uri Id</em>' attribute list.
	 * @see org.eclipse.mdht.uml.aml.constraint.ConstraintPackage#getResourceTranslation_Original_resource_uriId()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	EList<String> getOriginal_resource_uriIds();

	/**
	 * Returns the value of the '<em><b>Other details</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Other details</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Other details</em>' attribute list.
	 * @see org.eclipse.mdht.uml.aml.constraint.ConstraintPackage#getResourceTranslation_Other_details()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	EList<String> getOther_details();

	/**
	 * Returns the value of the '<em><b>Other details Id</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Other details Id</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Other details Id</em>' attribute list.
	 * @see org.eclipse.mdht.uml.aml.constraint.ConstraintPackage#getResourceTranslation_Other_detailsId()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	EList<String> getOther_detailsIds();

	/**
	 * Returns the value of the '<em><b>Author name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Author name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Author name</em>' attribute.
	 * @see #setAuthor_name(String)
	 * @see org.eclipse.mdht.uml.aml.constraint.ConstraintPackage#getResourceTranslation_Author_name()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	String getAuthor_name();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.aml.constraint.ResourceTranslation#getAuthor_name <em>Author name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Author name</em>' attribute.
	 * @see #getAuthor_name()
	 * @generated
	 */
	void setAuthor_name(String value);

	/**
	 * Returns the value of the '<em><b>Author organization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Author organization</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Author organization</em>' attribute.
	 * @see #setAuthor_organization(String)
	 * @see org.eclipse.mdht.uml.aml.constraint.ConstraintPackage#getResourceTranslation_Author_organization()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	String getAuthor_organization();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.aml.constraint.ResourceTranslation#getAuthor_organization <em>Author organization</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Author organization</em>' attribute.
	 * @see #getAuthor_organization()
	 * @generated
	 */
	void setAuthor_organization(String value);

	/**
	 * Returns the value of the '<em><b>Author email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Author email</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Author email</em>' attribute.
	 * @see #setAuthor_email(String)
	 * @see org.eclipse.mdht.uml.aml.constraint.ConstraintPackage#getResourceTranslation_Author_email()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	String getAuthor_email();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.aml.constraint.ResourceTranslation#getAuthor_email <em>Author email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Author email</em>' attribute.
	 * @see #getAuthor_email()
	 * @generated
	 */
	void setAuthor_email(String value);

	/**
	 * Returns the value of the '<em><b>Author date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Author date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Author date</em>' attribute.
	 * @see #setAuthor_date(String)
	 * @see org.eclipse.mdht.uml.aml.constraint.ConstraintPackage#getResourceTranslation_Author_date()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	String getAuthor_date();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.aml.constraint.ResourceTranslation#getAuthor_date <em>Author date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Author date</em>' attribute.
	 * @see #getAuthor_date()
	 * @generated
	 */
	void setAuthor_date(String value);

	/**
	 * Returns the value of the '<em><b>Version last translated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version last translated</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version last translated</em>' attribute.
	 * @see #setVersion_last_translated(String)
	 * @see org.eclipse.mdht.uml.aml.constraint.ConstraintPackage#getResourceTranslation_Version_last_translated()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	String getVersion_last_translated();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.aml.constraint.ResourceTranslation#getVersion_last_translated <em>Version last translated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version last translated</em>' attribute.
	 * @see #getVersion_last_translated()
	 * @generated
	 */
	void setVersion_last_translated(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.base_Enumeration.ownedLiteral->notEmpty()
	 * 
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='[AOM] VOTM- terminology translations validity'"
	 * @generated
	 */
	boolean validateAOMVOTMterminologytranslationsvalidity(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.base_Enumeration.ownedLiteral->forAll(ol|ol.stereotypedBy('IdEntry'))
	 * 
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateTranslationEntries(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.base_Enumeration.ownedLiteral->size()
	 * =
	 * self.base_Enumeration.ownedLiteral.appliedStereotype('IdEntry').oclAsType(IdEntry).ref->asSet()->size()
	 * 
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateUniqueEntries(DiagnosticChain diagnostics, Map<Object, Object> context);

} // ResourceTranslation
