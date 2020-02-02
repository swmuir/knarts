/**
 */
package org.hl7.knowledgeartifact.r2;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sub Elements Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.knowledgeartifact.r2.SubElementsType#getGroup <em>Group</em>}</li>
 *   <li>{@link org.hl7.knowledgeartifact.r2.SubElementsType#getSimpleAction <em>Simple Action</em>}</li>
 *   <li>{@link org.hl7.knowledgeartifact.r2.SubElementsType#getActionGroup <em>Action Group</em>}</li>
 *   <li>{@link org.hl7.knowledgeartifact.r2.SubElementsType#getActionRef <em>Action Ref</em>}</li>
 * </ul>
 *
 * @see org.hl7.knowledgeartifact.r2.R2Package#getSubElementsType()
 * @model extendedMetaData="name='subElements_._type' kind='elementOnly'"
 * @generated
 */
public interface SubElementsType extends EObject {
	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' attribute list.
	 * @see org.hl7.knowledgeartifact.r2.R2Package#getSubElementsType_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:0'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Simple Action</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.knowledgeartifact.r2.AtomicAction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The subelement is an atomic or single
	 * 												action. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Simple Action</em>' containment reference list.
	 * @see org.hl7.knowledgeartifact.r2.R2Package#getSubElementsType_SimpleAction()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='simpleAction' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<AtomicAction> getSimpleAction();

	/**
	 * Returns the value of the '<em><b>Action Group</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.knowledgeartifact.r2.ActionGroup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This subelement is a group of actions
	 * 												that are specified in line. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Action Group</em>' containment reference list.
	 * @see org.hl7.knowledgeartifact.r2.R2Package#getSubElementsType_ActionGroup()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='actionGroup' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<ActionGroup> getActionGroup();

	/**
	 * Returns the value of the '<em><b>Action Ref</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.knowledgeartifact.r2.ActionRef}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This subelement specifies an action to
	 * 												be included by reference from a referenced library
	 * 												as defined in the libraries section of the
	 * 												metadata.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Action Ref</em>' containment reference list.
	 * @see org.hl7.knowledgeartifact.r2.R2Package#getSubElementsType_ActionRef()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='actionRef' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<ActionRef> getActionRef();

} // SubElementsType
