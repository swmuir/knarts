/**
 */
package org.hl7.knowledgeartifact.r2;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.hl7.elm.r1.ExpressionDef;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trigger</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.knowledgeartifact.r2.Trigger#getDef <em>Def</em>}</li>
 *   <li>{@link org.hl7.knowledgeartifact.r2.Trigger#getIdentifiers <em>Identifiers</em>}</li>
 *   <li>{@link org.hl7.knowledgeartifact.r2.Trigger#getTextEquivalent <em>Text Equivalent</em>}</li>
 * </ul>
 *
 * @see org.hl7.knowledgeartifact.r2.R2Package#getTrigger()
 * @model abstract="true"
 *        extendedMetaData="name='Trigger' kind='elementOnly'"
 * @generated
 */
public interface Trigger extends EObject {
	/**
	 * Returns the value of the '<em><b>Def</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The event expression that must be met for the
	 * 						trigger to activate the record. Note that when accessing this expression within the artifact,
	 * 						only the data that triggered the artifact will be present. For example, if the trigger is an
	 * 						add of a medication, only the added medication will be returned from this expression.
	 * 					
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Def</em>' containment reference.
	 * @see #setDef(ExpressionDef)
	 * @see org.hl7.knowledgeartifact.r2.R2Package#getTrigger_Def()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='def' namespace='##targetNamespace'"
	 * @generated
	 */
	ExpressionDef getDef();

	/**
	 * Sets the value of the '{@link org.hl7.knowledgeartifact.r2.Trigger#getDef <em>Def</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Def</em>' containment reference.
	 * @see #getDef()
	 * @generated
	 */
	void setDef(ExpressionDef value);

	/**
	 * Returns the value of the '<em><b>Identifiers</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.knowledgeartifact.r2.VersionedIdentifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An identifier for the Trigger/Event
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifiers</em>' containment reference list.
	 * @see org.hl7.knowledgeartifact.r2.R2Package#getTrigger_Identifiers()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='identifiers' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<VersionedIdentifier> getIdentifiers();

	/**
	 * Returns the value of the '<em><b>Text Equivalent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text Equivalent</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text Equivalent</em>' containment reference.
	 * @see #setTextEquivalent(EObject)
	 * @see org.hl7.knowledgeartifact.r2.R2Package#getTrigger_TextEquivalent()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='textEquivalent' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getTextEquivalent();

	/**
	 * Sets the value of the '{@link org.hl7.knowledgeartifact.r2.Trigger#getTextEquivalent <em>Text Equivalent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text Equivalent</em>' containment reference.
	 * @see #getTextEquivalent()
	 * @generated
	 */
	void setTextEquivalent(EObject value);

} // Trigger
