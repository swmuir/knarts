/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.CodeableConcept;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Substance Polymer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.SubstancePolymer#getClass_ <em>Class</em>}</li>
 *   <li>{@link fhiRCore.resources.SubstancePolymer#getGeometry <em>Geometry</em>}</li>
 *   <li>{@link fhiRCore.resources.SubstancePolymer#getCopolymerConnectivities <em>Copolymer Connectivity</em>}</li>
 *   <li>{@link fhiRCore.resources.SubstancePolymer#getModifications <em>Modification</em>}</li>
 *   <li>{@link fhiRCore.resources.SubstancePolymer#getMonomerSets <em>Monomer Set</em>}</li>
 *   <li>{@link fhiRCore.resources.SubstancePolymer#getRepeats <em>Repeat</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getSubstancePolymer()
 * @model
 * @generated
 */
public interface SubstancePolymer extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Class</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class</em>' containment reference.
	 * @see #setClass_(CodeableConcept)
	 * @see fhiRCore.resources.ResourcesPackage#getSubstancePolymer_Class()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getClass_();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.SubstancePolymer#getClass_ <em>Class</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class</em>' containment reference.
	 * @see #getClass_()
	 * @generated
	 */
	void setClass_(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Geometry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Geometry</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Geometry</em>' containment reference.
	 * @see #setGeometry(CodeableConcept)
	 * @see fhiRCore.resources.ResourcesPackage#getSubstancePolymer_Geometry()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getGeometry();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.SubstancePolymer#getGeometry <em>Geometry</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Geometry</em>' containment reference.
	 * @see #getGeometry()
	 * @generated
	 */
	void setGeometry(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Copolymer Connectivity</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Copolymer Connectivity</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Copolymer Connectivity</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getSubstancePolymer_CopolymerConnectivity()
	 * @model containment="true"
	 * @generated
	 */
	EList<CodeableConcept> getCopolymerConnectivities();

	/**
	 * Returns the value of the '<em><b>Modification</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modification</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modification</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getSubstancePolymer_Modification()
	 * @model containment="true"
	 * @generated
	 */
	EList<fhiRCore.dataTypes.String> getModifications();

	/**
	 * Returns the value of the '<em><b>Monomer Set</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.resources.SubstancePolymerMonomerSet}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Monomer Set</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Monomer Set</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getSubstancePolymer_MonomerSet()
	 * @model containment="true"
	 * @generated
	 */
	EList<SubstancePolymerMonomerSet> getMonomerSets();

	/**
	 * Returns the value of the '<em><b>Repeat</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.resources.SubstancePolymerRepeat}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Repeat</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Repeat</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getSubstancePolymer_Repeat()
	 * @model containment="true"
	 * @generated
	 */
	EList<SubstancePolymerRepeat> getRepeats();

} // SubstancePolymer
