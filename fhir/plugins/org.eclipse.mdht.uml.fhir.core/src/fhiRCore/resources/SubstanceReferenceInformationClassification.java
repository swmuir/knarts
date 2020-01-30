/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.BackboneElement;
import fhiRCore.dataTypes.CodeableConcept;
import fhiRCore.dataTypes.Reference;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Substance Reference Information Classification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.SubstanceReferenceInformationClassification#getDomain <em>Domain</em>}</li>
 *   <li>{@link fhiRCore.resources.SubstanceReferenceInformationClassification#getClassification <em>Classification</em>}</li>
 *   <li>{@link fhiRCore.resources.SubstanceReferenceInformationClassification#getSubtypes <em>Subtype</em>}</li>
 *   <li>{@link fhiRCore.resources.SubstanceReferenceInformationClassification#getSources <em>Source</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getSubstanceReferenceInformationClassification()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='SubstanceReferenceInformation_Classification'"
 * @generated
 */
public interface SubstanceReferenceInformationClassification extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Domain</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Domain</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain</em>' containment reference.
	 * @see #setDomain(CodeableConcept)
	 * @see fhiRCore.resources.ResourcesPackage#getSubstanceReferenceInformationClassification_Domain()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getDomain();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.SubstanceReferenceInformationClassification#getDomain <em>Domain</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain</em>' containment reference.
	 * @see #getDomain()
	 * @generated
	 */
	void setDomain(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Classification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Classification</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classification</em>' containment reference.
	 * @see #setClassification(CodeableConcept)
	 * @see fhiRCore.resources.ResourcesPackage#getSubstanceReferenceInformationClassification_Classification()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getClassification();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.SubstanceReferenceInformationClassification#getClassification <em>Classification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Classification</em>' containment reference.
	 * @see #getClassification()
	 * @generated
	 */
	void setClassification(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Subtype</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subtype</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subtype</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getSubstanceReferenceInformationClassification_Subtype()
	 * @model containment="true"
	 * @generated
	 */
	EList<CodeableConcept> getSubtypes();

	/**
	 * Returns the value of the '<em><b>Source</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.Reference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getSubstanceReferenceInformationClassification_Source()
	 * @model containment="true"
	 * @generated
	 */
	EList<Reference> getSources();

} // SubstanceReferenceInformationClassification
