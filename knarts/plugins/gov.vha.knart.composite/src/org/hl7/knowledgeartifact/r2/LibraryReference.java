/**
 */
package org.hl7.knowledgeartifact.r2;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Library Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A reference to a library.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.knowledgeartifact.r2.LibraryReference#getMediaType <em>Media Type</em>}</li>
 *   <li>{@link org.hl7.knowledgeartifact.r2.LibraryReference#getName <em>Name</em>}</li>
 *   <li>{@link org.hl7.knowledgeartifact.r2.LibraryReference#getPath <em>Path</em>}</li>
 *   <li>{@link org.hl7.knowledgeartifact.r2.LibraryReference#getVersion <em>Version</em>}</li>
 * </ul>
 *
 * @see org.hl7.knowledgeartifact.r2.R2Package#getLibraryReference()
 * @model extendedMetaData="name='LibraryReference' kind='empty'"
 * @generated
 */
public interface LibraryReference extends EObject {
	/**
	 * Returns the value of the '<em><b>Media Type</b></em>' attribute.
	 * The default value is <code>"application/hed+xml"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines the type of the library. If this attribute is omitted, the library is assumed to be an HeD library artifact.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Media Type</em>' attribute.
	 * @see #isSetMediaType()
	 * @see #unsetMediaType()
	 * @see #setMediaType(String)
	 * @see org.hl7.knowledgeartifact.r2.R2Package#getLibraryReference_MediaType()
	 * @model default="application/hed+xml" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 *        extendedMetaData="kind='attribute' name='mediaType'"
	 * @generated
	 */
	String getMediaType();

	/**
	 * Sets the value of the '{@link org.hl7.knowledgeartifact.r2.LibraryReference#getMediaType <em>Media Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Media Type</em>' attribute.
	 * @see #isSetMediaType()
	 * @see #unsetMediaType()
	 * @see #getMediaType()
	 * @generated
	 */
	void setMediaType(String value);

	/**
	 * Unsets the value of the '{@link org.hl7.knowledgeartifact.r2.LibraryReference#getMediaType <em>Media Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMediaType()
	 * @see #getMediaType()
	 * @see #setMediaType(String)
	 * @generated
	 */
	void unsetMediaType();

	/**
	 * Returns whether the value of the '{@link org.hl7.knowledgeartifact.r2.LibraryReference#getMediaType <em>Media Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Media Type</em>' attribute is set.
	 * @see #unsetMediaType()
	 * @see #getMediaType()
	 * @see #setMediaType(String)
	 * @generated
	 */
	boolean isSetMediaType();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A unique name within this artifact for the library reference. This name is used within this artifact to reference components of this library.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.hl7.knowledgeartifact.r2.R2Package#getLibraryReference_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.hl7.knowledgeartifact.r2.LibraryReference#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines the path to the library.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Path</em>' attribute.
	 * @see #setPath(String)
	 * @see org.hl7.knowledgeartifact.r2.R2Package#getLibraryReference_Path()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI" required="true"
	 *        extendedMetaData="kind='attribute' name='path'"
	 * @generated
	 */
	String getPath();

	/**
	 * Sets the value of the '{@link org.hl7.knowledgeartifact.r2.LibraryReference#getPath <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path</em>' attribute.
	 * @see #getPath()
	 * @generated
	 */
	void setPath(String value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Optionally defines the required version number of the referenced library.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see org.hl7.knowledgeartifact.r2.R2Package#getLibraryReference_Version()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='version'"
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link org.hl7.knowledgeartifact.r2.LibraryReference#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

} // LibraryReference
