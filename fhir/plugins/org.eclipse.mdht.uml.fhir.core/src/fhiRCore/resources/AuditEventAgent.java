/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.BackboneElement;
import fhiRCore.dataTypes.CodeableConcept;
import fhiRCore.dataTypes.Coding;
import fhiRCore.dataTypes.Reference;
import fhiRCore.dataTypes.Uri;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Audit Event Agent</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.AuditEventAgent#getType <em>Type</em>}</li>
 *   <li>{@link fhiRCore.resources.AuditEventAgent#getRoles <em>Role</em>}</li>
 *   <li>{@link fhiRCore.resources.AuditEventAgent#getWho <em>Who</em>}</li>
 *   <li>{@link fhiRCore.resources.AuditEventAgent#getAltId <em>Alt Id</em>}</li>
 *   <li>{@link fhiRCore.resources.AuditEventAgent#getName <em>Name</em>}</li>
 *   <li>{@link fhiRCore.resources.AuditEventAgent#getRequestor <em>Requestor</em>}</li>
 *   <li>{@link fhiRCore.resources.AuditEventAgent#getLocation <em>Location</em>}</li>
 *   <li>{@link fhiRCore.resources.AuditEventAgent#getPolicies <em>Policy</em>}</li>
 *   <li>{@link fhiRCore.resources.AuditEventAgent#getMedia <em>Media</em>}</li>
 *   <li>{@link fhiRCore.resources.AuditEventAgent#getNetwork <em>Network</em>}</li>
 *   <li>{@link fhiRCore.resources.AuditEventAgent#getPurposeOfUses <em>Purpose Of Use</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getAuditEventAgent()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='AuditEvent_Agent'"
 * @generated
 */
public interface AuditEventAgent extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(CodeableConcept)
	 * @see fhiRCore.resources.ResourcesPackage#getAuditEventAgent_Type()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getType();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.AuditEventAgent#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Role</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getAuditEventAgent_Role()
	 * @model containment="true"
	 * @generated
	 */
	EList<CodeableConcept> getRoles();

	/**
	 * Returns the value of the '<em><b>Who</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Who</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Who</em>' containment reference.
	 * @see #setWho(Reference)
	 * @see fhiRCore.resources.ResourcesPackage#getAuditEventAgent_Who()
	 * @model containment="true"
	 * @generated
	 */
	Reference getWho();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.AuditEventAgent#getWho <em>Who</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Who</em>' containment reference.
	 * @see #getWho()
	 * @generated
	 */
	void setWho(Reference value);

	/**
	 * Returns the value of the '<em><b>Alt Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alt Id</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alt Id</em>' containment reference.
	 * @see #setAltId(fhiRCore.dataTypes.String)
	 * @see fhiRCore.resources.ResourcesPackage#getAuditEventAgent_AltId()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getAltId();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.AuditEventAgent#getAltId <em>Alt Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alt Id</em>' containment reference.
	 * @see #getAltId()
	 * @generated
	 */
	void setAltId(fhiRCore.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(fhiRCore.dataTypes.String)
	 * @see fhiRCore.resources.ResourcesPackage#getAuditEventAgent_Name()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getName();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.AuditEventAgent#getName <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' containment reference.
	 * @see #getName()
	 * @generated
	 */
	void setName(fhiRCore.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Requestor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Requestor</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requestor</em>' containment reference.
	 * @see #setRequestor(fhiRCore.dataTypes.Boolean)
	 * @see fhiRCore.resources.ResourcesPackage#getAuditEventAgent_Requestor()
	 * @model containment="true" required="true"
	 * @generated
	 */
	fhiRCore.dataTypes.Boolean getRequestor();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.AuditEventAgent#getRequestor <em>Requestor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Requestor</em>' containment reference.
	 * @see #getRequestor()
	 * @generated
	 */
	void setRequestor(fhiRCore.dataTypes.Boolean value);

	/**
	 * Returns the value of the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Location</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' containment reference.
	 * @see #setLocation(Reference)
	 * @see fhiRCore.resources.ResourcesPackage#getAuditEventAgent_Location()
	 * @model containment="true"
	 * @generated
	 */
	Reference getLocation();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.AuditEventAgent#getLocation <em>Location</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' containment reference.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(Reference value);

	/**
	 * Returns the value of the '<em><b>Policy</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.Uri}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Policy</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Policy</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getAuditEventAgent_Policy()
	 * @model containment="true"
	 * @generated
	 */
	EList<Uri> getPolicies();

	/**
	 * Returns the value of the '<em><b>Media</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Media</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Media</em>' containment reference.
	 * @see #setMedia(Coding)
	 * @see fhiRCore.resources.ResourcesPackage#getAuditEventAgent_Media()
	 * @model containment="true"
	 * @generated
	 */
	Coding getMedia();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.AuditEventAgent#getMedia <em>Media</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Media</em>' containment reference.
	 * @see #getMedia()
	 * @generated
	 */
	void setMedia(Coding value);

	/**
	 * Returns the value of the '<em><b>Network</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Network</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Network</em>' containment reference.
	 * @see #setNetwork(AuditEventAgentNetwork)
	 * @see fhiRCore.resources.ResourcesPackage#getAuditEventAgent_Network()
	 * @model containment="true"
	 * @generated
	 */
	AuditEventAgentNetwork getNetwork();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.AuditEventAgent#getNetwork <em>Network</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Network</em>' containment reference.
	 * @see #getNetwork()
	 * @generated
	 */
	void setNetwork(AuditEventAgentNetwork value);

	/**
	 * Returns the value of the '<em><b>Purpose Of Use</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Purpose Of Use</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Purpose Of Use</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getAuditEventAgent_PurposeOfUse()
	 * @model containment="true"
	 * @generated
	 */
	EList<CodeableConcept> getPurposeOfUses();

} // AuditEventAgent
