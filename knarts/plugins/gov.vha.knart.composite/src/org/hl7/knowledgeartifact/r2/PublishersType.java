/**
 */
package org.hl7.knowledgeartifact.r2;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Publishers Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.knowledgeartifact.r2.PublishersType#getPublisher <em>Publisher</em>}</li>
 * </ul>
 *
 * @see org.hl7.knowledgeartifact.r2.R2Package#getPublishersType()
 * @model extendedMetaData="name='publishers_._type' kind='elementOnly'"
 * @generated
 */
public interface PublishersType extends EObject {
	/**
	 * Returns the value of the '<em><b>Publisher</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.knowledgeartifact.r2.Party}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Publisher</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Publisher</em>' containment reference list.
	 * @see org.hl7.knowledgeartifact.r2.R2Package#getPublishersType_Publisher()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='publisher' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Party> getPublisher();

} // PublishersType
