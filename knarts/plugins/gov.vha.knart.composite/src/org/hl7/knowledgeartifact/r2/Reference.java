/**
 */
package org.hl7.knowledgeartifact.r2;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Reference to an Artifact outside of the packing of the composite.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.knowledgeartifact.r2.Reference#getUrl <em>Url</em>}</li>
 *   <li>{@link org.hl7.knowledgeartifact.r2.Reference#getContentHash <em>Content Hash</em>}</li>
 *   <li>{@link org.hl7.knowledgeartifact.r2.Reference#getUuid <em>Uuid</em>}</li>
 *   <li>{@link org.hl7.knowledgeartifact.r2.Reference#getIdentifiers <em>Identifiers</em>}</li>
 * </ul>
 *
 * @see org.hl7.knowledgeartifact.r2.R2Package#getReference()
 * @model extendedMetaData="name='Reference' kind='elementOnly'"
 * @generated
 */
public interface Reference extends EObject {
	/**
	 * Returns the value of the '<em><b>Url</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Url</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Url</em>' containment reference.
	 * @see #setUrl(UrlType)
	 * @see org.hl7.knowledgeartifact.r2.R2Package#getReference_Url()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='url' namespace='##targetNamespace'"
	 * @generated
	 */
	UrlType getUrl();

	/**
	 * Sets the value of the '{@link org.hl7.knowledgeartifact.r2.Reference#getUrl <em>Url</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Url</em>' containment reference.
	 * @see #getUrl()
	 * @generated
	 */
	void setUrl(UrlType value);

	/**
	 * Returns the value of the '<em><b>Content Hash</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content Hash</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content Hash</em>' containment reference.
	 * @see #setContentHash(ContentHashType)
	 * @see org.hl7.knowledgeartifact.r2.R2Package#getReference_ContentHash()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='contentHash' namespace='##targetNamespace'"
	 * @generated
	 */
	ContentHashType getContentHash();

	/**
	 * Sets the value of the '{@link org.hl7.knowledgeartifact.r2.Reference#getContentHash <em>Content Hash</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content Hash</em>' containment reference.
	 * @see #getContentHash()
	 * @generated
	 */
	void setContentHash(ContentHashType value);

	/**
	 * Returns the value of the '<em><b>Uuid</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uuid</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uuid</em>' containment reference.
	 * @see #setUuid(UuidType)
	 * @see org.hl7.knowledgeartifact.r2.R2Package#getReference_Uuid()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='uuid' namespace='##targetNamespace'"
	 * @generated
	 */
	UuidType getUuid();

	/**
	 * Sets the value of the '{@link org.hl7.knowledgeartifact.r2.Reference#getUuid <em>Uuid</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uuid</em>' containment reference.
	 * @see #getUuid()
	 * @generated
	 */
	void setUuid(UuidType value);

	/**
	 * Returns the value of the '<em><b>Identifiers</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Each version of a CDS knowledge artifact may have more than one identifier associated with it.  Note that each identifier must be globally unique in the universe of CDS knowledge artifacts in which a particular artifact resides.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifiers</em>' containment reference.
	 * @see #setIdentifiers(IdentifiersType)
	 * @see org.hl7.knowledgeartifact.r2.R2Package#getReference_Identifiers()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='identifiers' namespace='##targetNamespace'"
	 * @generated
	 */
	IdentifiersType getIdentifiers();

	/**
	 * Sets the value of the '{@link org.hl7.knowledgeartifact.r2.Reference#getIdentifiers <em>Identifiers</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identifiers</em>' containment reference.
	 * @see #getIdentifiers()
	 * @generated
	 */
	void setIdentifiers(IdentifiersType value);

} // Reference
