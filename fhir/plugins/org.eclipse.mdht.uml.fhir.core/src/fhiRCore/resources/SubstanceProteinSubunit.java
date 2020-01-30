/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.Attachment;
import fhiRCore.dataTypes.BackboneElement;
import fhiRCore.dataTypes.Identifier;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Substance Protein Subunit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.SubstanceProteinSubunit#getSubunit <em>Subunit</em>}</li>
 *   <li>{@link fhiRCore.resources.SubstanceProteinSubunit#getSequence <em>Sequence</em>}</li>
 *   <li>{@link fhiRCore.resources.SubstanceProteinSubunit#getLength <em>Length</em>}</li>
 *   <li>{@link fhiRCore.resources.SubstanceProteinSubunit#getSequenceAttachment <em>Sequence Attachment</em>}</li>
 *   <li>{@link fhiRCore.resources.SubstanceProteinSubunit#getNTerminalModificationId <em>NTerminal Modification Id</em>}</li>
 *   <li>{@link fhiRCore.resources.SubstanceProteinSubunit#getNTerminalModification <em>NTerminal Modification</em>}</li>
 *   <li>{@link fhiRCore.resources.SubstanceProteinSubunit#getCTerminalModificationId <em>CTerminal Modification Id</em>}</li>
 *   <li>{@link fhiRCore.resources.SubstanceProteinSubunit#getCTerminalModification <em>CTerminal Modification</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getSubstanceProteinSubunit()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='SubstanceProtein_Subunit'"
 * @generated
 */
public interface SubstanceProteinSubunit extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Subunit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subunit</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subunit</em>' containment reference.
	 * @see #setSubunit(fhiRCore.dataTypes.Integer)
	 * @see fhiRCore.resources.ResourcesPackage#getSubstanceProteinSubunit_Subunit()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.Integer getSubunit();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.SubstanceProteinSubunit#getSubunit <em>Subunit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subunit</em>' containment reference.
	 * @see #getSubunit()
	 * @generated
	 */
	void setSubunit(fhiRCore.dataTypes.Integer value);

	/**
	 * Returns the value of the '<em><b>Sequence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sequence</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sequence</em>' containment reference.
	 * @see #setSequence(fhiRCore.dataTypes.String)
	 * @see fhiRCore.resources.ResourcesPackage#getSubstanceProteinSubunit_Sequence()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getSequence();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.SubstanceProteinSubunit#getSequence <em>Sequence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sequence</em>' containment reference.
	 * @see #getSequence()
	 * @generated
	 */
	void setSequence(fhiRCore.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Length</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Length</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Length</em>' containment reference.
	 * @see #setLength(fhiRCore.dataTypes.Integer)
	 * @see fhiRCore.resources.ResourcesPackage#getSubstanceProteinSubunit_Length()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.Integer getLength();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.SubstanceProteinSubunit#getLength <em>Length</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Length</em>' containment reference.
	 * @see #getLength()
	 * @generated
	 */
	void setLength(fhiRCore.dataTypes.Integer value);

	/**
	 * Returns the value of the '<em><b>Sequence Attachment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sequence Attachment</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sequence Attachment</em>' containment reference.
	 * @see #setSequenceAttachment(Attachment)
	 * @see fhiRCore.resources.ResourcesPackage#getSubstanceProteinSubunit_SequenceAttachment()
	 * @model containment="true"
	 * @generated
	 */
	Attachment getSequenceAttachment();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.SubstanceProteinSubunit#getSequenceAttachment <em>Sequence Attachment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sequence Attachment</em>' containment reference.
	 * @see #getSequenceAttachment()
	 * @generated
	 */
	void setSequenceAttachment(Attachment value);

	/**
	 * Returns the value of the '<em><b>NTerminal Modification Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>NTerminal Modification Id</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>NTerminal Modification Id</em>' containment reference.
	 * @see #setNTerminalModificationId(Identifier)
	 * @see fhiRCore.resources.ResourcesPackage#getSubstanceProteinSubunit_NTerminalModificationId()
	 * @model containment="true"
	 * @generated
	 */
	Identifier getNTerminalModificationId();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.SubstanceProteinSubunit#getNTerminalModificationId <em>NTerminal Modification Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>NTerminal Modification Id</em>' containment reference.
	 * @see #getNTerminalModificationId()
	 * @generated
	 */
	void setNTerminalModificationId(Identifier value);

	/**
	 * Returns the value of the '<em><b>NTerminal Modification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>NTerminal Modification</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>NTerminal Modification</em>' containment reference.
	 * @see #setNTerminalModification(fhiRCore.dataTypes.String)
	 * @see fhiRCore.resources.ResourcesPackage#getSubstanceProteinSubunit_NTerminalModification()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getNTerminalModification();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.SubstanceProteinSubunit#getNTerminalModification <em>NTerminal Modification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>NTerminal Modification</em>' containment reference.
	 * @see #getNTerminalModification()
	 * @generated
	 */
	void setNTerminalModification(fhiRCore.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>CTerminal Modification Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CTerminal Modification Id</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CTerminal Modification Id</em>' containment reference.
	 * @see #setCTerminalModificationId(Identifier)
	 * @see fhiRCore.resources.ResourcesPackage#getSubstanceProteinSubunit_CTerminalModificationId()
	 * @model containment="true"
	 * @generated
	 */
	Identifier getCTerminalModificationId();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.SubstanceProteinSubunit#getCTerminalModificationId <em>CTerminal Modification Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CTerminal Modification Id</em>' containment reference.
	 * @see #getCTerminalModificationId()
	 * @generated
	 */
	void setCTerminalModificationId(Identifier value);

	/**
	 * Returns the value of the '<em><b>CTerminal Modification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CTerminal Modification</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CTerminal Modification</em>' containment reference.
	 * @see #setCTerminalModification(fhiRCore.dataTypes.String)
	 * @see fhiRCore.resources.ResourcesPackage#getSubstanceProteinSubunit_CTerminalModification()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getCTerminalModification();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.SubstanceProteinSubunit#getCTerminalModification <em>CTerminal Modification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CTerminal Modification</em>' containment reference.
	 * @see #getCTerminalModification()
	 * @generated
	 */
	void setCTerminalModification(fhiRCore.dataTypes.String value);

} // SubstanceProteinSubunit
