/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.Attachment;
import fhiRCore.dataTypes.BackboneElement;
import fhiRCore.dataTypes.CodeableConcept;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Substance Nucleic Acid Subunit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.SubstanceNucleicAcidSubunit#getSubunit <em>Subunit</em>}</li>
 *   <li>{@link fhiRCore.resources.SubstanceNucleicAcidSubunit#getSequence <em>Sequence</em>}</li>
 *   <li>{@link fhiRCore.resources.SubstanceNucleicAcidSubunit#getLength <em>Length</em>}</li>
 *   <li>{@link fhiRCore.resources.SubstanceNucleicAcidSubunit#getSequenceAttachment <em>Sequence Attachment</em>}</li>
 *   <li>{@link fhiRCore.resources.SubstanceNucleicAcidSubunit#getFivePrime <em>Five Prime</em>}</li>
 *   <li>{@link fhiRCore.resources.SubstanceNucleicAcidSubunit#getThreePrime <em>Three Prime</em>}</li>
 *   <li>{@link fhiRCore.resources.SubstanceNucleicAcidSubunit#getLinkages <em>Linkage</em>}</li>
 *   <li>{@link fhiRCore.resources.SubstanceNucleicAcidSubunit#getSugars <em>Sugar</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getSubstanceNucleicAcidSubunit()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='SubstanceNucleicAcid_Subunit'"
 * @generated
 */
public interface SubstanceNucleicAcidSubunit extends BackboneElement {
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
	 * @see fhiRCore.resources.ResourcesPackage#getSubstanceNucleicAcidSubunit_Subunit()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.Integer getSubunit();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.SubstanceNucleicAcidSubunit#getSubunit <em>Subunit</em>}' containment reference.
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
	 * @see fhiRCore.resources.ResourcesPackage#getSubstanceNucleicAcidSubunit_Sequence()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getSequence();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.SubstanceNucleicAcidSubunit#getSequence <em>Sequence</em>}' containment reference.
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
	 * @see fhiRCore.resources.ResourcesPackage#getSubstanceNucleicAcidSubunit_Length()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.Integer getLength();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.SubstanceNucleicAcidSubunit#getLength <em>Length</em>}' containment reference.
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
	 * @see fhiRCore.resources.ResourcesPackage#getSubstanceNucleicAcidSubunit_SequenceAttachment()
	 * @model containment="true"
	 * @generated
	 */
	Attachment getSequenceAttachment();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.SubstanceNucleicAcidSubunit#getSequenceAttachment <em>Sequence Attachment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sequence Attachment</em>' containment reference.
	 * @see #getSequenceAttachment()
	 * @generated
	 */
	void setSequenceAttachment(Attachment value);

	/**
	 * Returns the value of the '<em><b>Five Prime</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Five Prime</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Five Prime</em>' containment reference.
	 * @see #setFivePrime(CodeableConcept)
	 * @see fhiRCore.resources.ResourcesPackage#getSubstanceNucleicAcidSubunit_FivePrime()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getFivePrime();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.SubstanceNucleicAcidSubunit#getFivePrime <em>Five Prime</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Five Prime</em>' containment reference.
	 * @see #getFivePrime()
	 * @generated
	 */
	void setFivePrime(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Three Prime</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Three Prime</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Three Prime</em>' containment reference.
	 * @see #setThreePrime(CodeableConcept)
	 * @see fhiRCore.resources.ResourcesPackage#getSubstanceNucleicAcidSubunit_ThreePrime()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getThreePrime();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.SubstanceNucleicAcidSubunit#getThreePrime <em>Three Prime</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Three Prime</em>' containment reference.
	 * @see #getThreePrime()
	 * @generated
	 */
	void setThreePrime(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Linkage</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.resources.SubstanceNucleicAcidSubunitLinkage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Linkage</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Linkage</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getSubstanceNucleicAcidSubunit_Linkage()
	 * @model containment="true"
	 * @generated
	 */
	EList<SubstanceNucleicAcidSubunitLinkage> getLinkages();

	/**
	 * Returns the value of the '<em><b>Sugar</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.resources.SubstanceNucleicAcidSubunitSugar}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sugar</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sugar</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getSubstanceNucleicAcidSubunit_Sugar()
	 * @model containment="true"
	 * @generated
	 */
	EList<SubstanceNucleicAcidSubunitSugar> getSugars();

} // SubstanceNucleicAcidSubunit
