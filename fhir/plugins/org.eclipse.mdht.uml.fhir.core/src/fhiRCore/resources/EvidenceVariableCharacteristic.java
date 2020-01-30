/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.BackboneElement;
import fhiRCore.dataTypes.Code;
import fhiRCore.dataTypes.DataType;
import fhiRCore.dataTypes.Duration;
import fhiRCore.dataTypes.UsageContext;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Evidence Variable Characteristic</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.EvidenceVariableCharacteristic#getDescription <em>Description</em>}</li>
 *   <li>{@link fhiRCore.resources.EvidenceVariableCharacteristic#getDefinitionx <em>Definitionx</em>}</li>
 *   <li>{@link fhiRCore.resources.EvidenceVariableCharacteristic#getUsageContexts <em>Usage Context</em>}</li>
 *   <li>{@link fhiRCore.resources.EvidenceVariableCharacteristic#getExclude <em>Exclude</em>}</li>
 *   <li>{@link fhiRCore.resources.EvidenceVariableCharacteristic#getParticipantEffectivex <em>Participant Effectivex</em>}</li>
 *   <li>{@link fhiRCore.resources.EvidenceVariableCharacteristic#getTimeFromStart <em>Time From Start</em>}</li>
 *   <li>{@link fhiRCore.resources.EvidenceVariableCharacteristic#getGroupMeasure <em>Group Measure</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getEvidenceVariableCharacteristic()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='EvidenceVariable_Characteristic'"
 * @generated
 */
public interface EvidenceVariableCharacteristic extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(fhiRCore.dataTypes.String)
	 * @see fhiRCore.resources.ResourcesPackage#getEvidenceVariableCharacteristic_Description()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getDescription();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.EvidenceVariableCharacteristic#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(fhiRCore.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Definitionx</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Definitionx</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Definitionx</em>' containment reference.
	 * @see #setDefinitionx(DataType)
	 * @see fhiRCore.resources.ResourcesPackage#getEvidenceVariableCharacteristic_Definitionx()
	 * @model containment="true" required="true"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='definition[x]'"
	 * @generated
	 */
	DataType getDefinitionx();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.EvidenceVariableCharacteristic#getDefinitionx <em>Definitionx</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Definitionx</em>' containment reference.
	 * @see #getDefinitionx()
	 * @generated
	 */
	void setDefinitionx(DataType value);

	/**
	 * Returns the value of the '<em><b>Usage Context</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.UsageContext}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Usage Context</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Usage Context</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getEvidenceVariableCharacteristic_UsageContext()
	 * @model containment="true"
	 * @generated
	 */
	EList<UsageContext> getUsageContexts();

	/**
	 * Returns the value of the '<em><b>Exclude</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exclude</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exclude</em>' containment reference.
	 * @see #setExclude(fhiRCore.dataTypes.Boolean)
	 * @see fhiRCore.resources.ResourcesPackage#getEvidenceVariableCharacteristic_Exclude()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.Boolean getExclude();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.EvidenceVariableCharacteristic#getExclude <em>Exclude</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exclude</em>' containment reference.
	 * @see #getExclude()
	 * @generated
	 */
	void setExclude(fhiRCore.dataTypes.Boolean value);

	/**
	 * Returns the value of the '<em><b>Participant Effectivex</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Participant Effectivex</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Participant Effectivex</em>' containment reference.
	 * @see #setParticipantEffectivex(DataType)
	 * @see fhiRCore.resources.ResourcesPackage#getEvidenceVariableCharacteristic_ParticipantEffectivex()
	 * @model containment="true"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='participantEffective[x]'"
	 * @generated
	 */
	DataType getParticipantEffectivex();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.EvidenceVariableCharacteristic#getParticipantEffectivex <em>Participant Effectivex</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Participant Effectivex</em>' containment reference.
	 * @see #getParticipantEffectivex()
	 * @generated
	 */
	void setParticipantEffectivex(DataType value);

	/**
	 * Returns the value of the '<em><b>Time From Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time From Start</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time From Start</em>' containment reference.
	 * @see #setTimeFromStart(Duration)
	 * @see fhiRCore.resources.ResourcesPackage#getEvidenceVariableCharacteristic_TimeFromStart()
	 * @model containment="true"
	 * @generated
	 */
	Duration getTimeFromStart();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.EvidenceVariableCharacteristic#getTimeFromStart <em>Time From Start</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time From Start</em>' containment reference.
	 * @see #getTimeFromStart()
	 * @generated
	 */
	void setTimeFromStart(Duration value);

	/**
	 * Returns the value of the '<em><b>Group Measure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group Measure</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group Measure</em>' containment reference.
	 * @see #setGroupMeasure(Code)
	 * @see fhiRCore.resources.ResourcesPackage#getEvidenceVariableCharacteristic_GroupMeasure()
	 * @model containment="true"
	 * @generated
	 */
	Code getGroupMeasure();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.EvidenceVariableCharacteristic#getGroupMeasure <em>Group Measure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Group Measure</em>' containment reference.
	 * @see #getGroupMeasure()
	 * @generated
	 */
	void setGroupMeasure(Code value);

} // EvidenceVariableCharacteristic
