/**
 */
package org.hl7.knowledgeartifact.r2;

import org.hl7.cdsdt.r2.II;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Versioned Identifier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * VersionedIdentifier is composed of two parts: (1)
 * 				an II identifier which identifies the set of all versions of a given
 * 				resource. (2) the actual version of the instance of interest in this
 * 				set. The VersionedIdentifier therefore points to an individual
 * 				'versioned' instance of a resource such as the third version of a
 * 				reminder rule.
 * 			
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.knowledgeartifact.r2.VersionedIdentifier#getVersion <em>Version</em>}</li>
 * </ul>
 *
 * @see org.hl7.knowledgeartifact.r2.R2Package#getVersionedIdentifier()
 * @model extendedMetaData="name='VersionedIdentifier' kind='empty'"
 * @generated
 */
public interface VersionedIdentifier extends II {
	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see org.hl7.knowledgeartifact.r2.R2Package#getVersionedIdentifier_Version()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='version'"
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link org.hl7.knowledgeartifact.r2.VersionedIdentifier#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

} // VersionedIdentifier
