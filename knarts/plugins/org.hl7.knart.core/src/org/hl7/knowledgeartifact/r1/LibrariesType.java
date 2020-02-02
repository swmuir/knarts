/**
 */
package org.hl7.knowledgeartifact.r1;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Libraries Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.knowledgeartifact.r1.LibrariesType#getLibraryReference <em>Library Reference</em>}</li>
 * </ul>
 *
 * @see org.hl7.knowledgeartifact.r1.R1Package#getLibrariesType()
 * @model extendedMetaData="name='libraries_._type' kind='elementOnly'"
 * @generated
 */
public interface LibrariesType extends EObject {
	/**
	 * Returns the value of the '<em><b>Library Reference</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.knowledgeartifact.r1.LibraryReference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A reference to a library whose component can be referenced 
	 * 								within the artifact.
	 * 								
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Library Reference</em>' containment reference list.
	 * @see org.hl7.knowledgeartifact.r1.R1Package#getLibrariesType_LibraryReference()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='libraryReference' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<LibraryReference> getLibraryReference();

} // LibrariesType
