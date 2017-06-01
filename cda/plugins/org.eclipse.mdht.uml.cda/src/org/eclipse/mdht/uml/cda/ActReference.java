/**
 */
package org.eclipse.mdht.uml.cda;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.mdht.uml.hl7.datatypes.CS;
import org.eclipse.mdht.uml.hl7.datatypes.II;

import org.eclipse.mdht.uml.hl7.vocab.EntityDeterminer;
import org.eclipse.mdht.uml.hl7.vocab.x_ActClassDocumentEntryAct;
import org.eclipse.mdht.uml.hl7.vocab.x_DocumentActMood;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Act Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.cda.ActReference#getRealmCodes <em>Realm Code</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.cda.ActReference#getTypeId <em>Type Id</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.cda.ActReference#getTemplateIds <em>Template Id</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.cda.ActReference#getIds <em>Id</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.cda.ActReference#getClassCode <em>Class Code</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.cda.ActReference#getMoodCode <em>Mood Code</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.cda.ActReference#getDeterminerCode <em>Determiner Code</em>}</li>
 * </ul>
 *
 * @see org.eclipse.mdht.uml.cda.CDAPackage#getActReference()
 * @model
 * @generated
 */
public interface ActReference extends EObject {
	/**
	 * Returns the value of the '<em><b>Realm Code</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.mdht.uml.hl7.datatypes.CS}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Realm Code</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Realm Code</em>' containment reference list.
	 * @see org.eclipse.mdht.uml.cda.CDAPackage#getActReference_RealmCode()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="namespace='urn:hl7-org:sdtc' kind='element'"
	 * @generated
	 */
	EList<CS> getRealmCodes();

	/**
	 * Returns the value of the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Id</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Id</em>' containment reference.
	 * @see #setTypeId(InfrastructureRootTypeId)
	 * @see org.eclipse.mdht.uml.cda.CDAPackage#getActReference_TypeId()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="namespace='urn:hl7-org:sdtc' kind='element'"
	 * @generated
	 */
	InfrastructureRootTypeId getTypeId();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.cda.ActReference#getTypeId <em>Type Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Id</em>' containment reference.
	 * @see #getTypeId()
	 * @generated
	 */
	void setTypeId(InfrastructureRootTypeId value);

	/**
	 * Returns the value of the '<em><b>Template Id</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.mdht.uml.hl7.datatypes.II}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Template Id</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Template Id</em>' containment reference list.
	 * @see org.eclipse.mdht.uml.cda.CDAPackage#getActReference_TemplateId()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="namespace='urn:hl7-org:sdtc' kind='element'"
	 * @generated
	 */
	EList<II> getTemplateIds();

	/**
	 * Returns the value of the '<em><b>Id</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.mdht.uml.hl7.datatypes.II}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' containment reference list.
	 * @see org.eclipse.mdht.uml.cda.CDAPackage#getActReference_Id()
	 * @model containment="true" required="true" ordered="false"
	 *        extendedMetaData="namespace='urn:hl7-org:sdtc' kind='element'"
	 * @generated
	 */
	EList<II> getIds();

	/**
	 * Returns the value of the '<em><b>Class Code</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.mdht.uml.hl7.vocab.x_ActClassDocumentEntryAct}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class Code</em>' attribute.
	 * @see org.eclipse.mdht.uml.hl7.vocab.x_ActClassDocumentEntryAct
	 * @see #setClassCode(x_ActClassDocumentEntryAct)
	 * @see org.eclipse.mdht.uml.cda.CDAPackage#getActReference_ClassCode()
	 * @model required="true" ordered="false"
	 *        extendedMetaData="namespace='urn:hl7-org:sdtc' kind='attribute'"
	 * @generated
	 */
	x_ActClassDocumentEntryAct getClassCode();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.cda.ActReference#getClassCode <em>Class Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class Code</em>' attribute.
	 * @see org.eclipse.mdht.uml.hl7.vocab.x_ActClassDocumentEntryAct
	 * @see #getClassCode()
	 * @generated
	 */
	void setClassCode(x_ActClassDocumentEntryAct value);

	/**
	 * Returns the value of the '<em><b>Mood Code</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.mdht.uml.hl7.vocab.x_DocumentActMood}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mood Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mood Code</em>' attribute.
	 * @see org.eclipse.mdht.uml.hl7.vocab.x_DocumentActMood
	 * @see #setMoodCode(x_DocumentActMood)
	 * @see org.eclipse.mdht.uml.cda.CDAPackage#getActReference_MoodCode()
	 * @model required="true" ordered="false"
	 *        extendedMetaData="namespace='urn:hl7-org:sdtc' kind='attribute'"
	 * @generated
	 */
	x_DocumentActMood getMoodCode();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.cda.ActReference#getMoodCode <em>Mood Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mood Code</em>' attribute.
	 * @see org.eclipse.mdht.uml.hl7.vocab.x_DocumentActMood
	 * @see #getMoodCode()
	 * @generated
	 */
	void setMoodCode(x_DocumentActMood value);

	/**
	 * Returns the value of the '<em><b>Determiner Code</b></em>' attribute.
	 * The default value is <code>"INSTANCE"</code>.
	 * The literals are from the enumeration {@link org.eclipse.mdht.uml.hl7.vocab.EntityDeterminer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Determiner Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Determiner Code</em>' attribute.
	 * @see org.eclipse.mdht.uml.hl7.vocab.EntityDeterminer
	 * @see #setDeterminerCode(EntityDeterminer)
	 * @see org.eclipse.mdht.uml.cda.CDAPackage#getActReference_DeterminerCode()
	 * @model default="INSTANCE" ordered="false"
	 *        extendedMetaData="namespace='urn:hl7-org:sdtc' kind='attribute'"
	 * @generated
	 */
	EntityDeterminer getDeterminerCode();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.cda.ActReference#getDeterminerCode <em>Determiner Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Determiner Code</em>' attribute.
	 * @see org.eclipse.mdht.uml.hl7.vocab.EntityDeterminer
	 * @see #getDeterminerCode()
	 * @generated
	 */
	void setDeterminerCode(EntityDeterminer value);

} // ActReference
