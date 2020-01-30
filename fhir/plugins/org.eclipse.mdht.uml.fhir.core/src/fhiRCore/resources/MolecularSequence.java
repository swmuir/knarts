/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.Code;
import fhiRCore.dataTypes.Identifier;
import fhiRCore.dataTypes.Quantity;
import fhiRCore.dataTypes.Reference;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Molecular Sequence</b></em>'.
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
 *   <li>{@link fhiRCore.resources.MolecularSequence#getIdentifiers <em>Identifier</em>}</li>
 *   <li>{@link fhiRCore.resources.MolecularSequence#getType <em>Type</em>}</li>
 *   <li>{@link fhiRCore.resources.MolecularSequence#getCoordinateSystem <em>Coordinate System</em>}</li>
 *   <li>{@link fhiRCore.resources.MolecularSequence#getPatient <em>Patient</em>}</li>
 *   <li>{@link fhiRCore.resources.MolecularSequence#getSpecimen <em>Specimen</em>}</li>
 *   <li>{@link fhiRCore.resources.MolecularSequence#getDevice <em>Device</em>}</li>
 *   <li>{@link fhiRCore.resources.MolecularSequence#getPerformer <em>Performer</em>}</li>
 *   <li>{@link fhiRCore.resources.MolecularSequence#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link fhiRCore.resources.MolecularSequence#getReferenceSeq <em>Reference Seq</em>}</li>
 *   <li>{@link fhiRCore.resources.MolecularSequence#getVariants <em>Variant</em>}</li>
 *   <li>{@link fhiRCore.resources.MolecularSequence#getObservedSeq <em>Observed Seq</em>}</li>
 *   <li>{@link fhiRCore.resources.MolecularSequence#getQualities <em>Quality</em>}</li>
 *   <li>{@link fhiRCore.resources.MolecularSequence#getReadCoverage <em>Read Coverage</em>}</li>
 *   <li>{@link fhiRCore.resources.MolecularSequence#getRepositories <em>Repository</em>}</li>
 *   <li>{@link fhiRCore.resources.MolecularSequence#getPointers <em>Pointer</em>}</li>
 *   <li>{@link fhiRCore.resources.MolecularSequence#getStructureVariants <em>Structure Variant</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getMolecularSequence()
 * @model
 * @generated
 */
public interface MolecularSequence extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.Identifier}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Identifier</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getMolecularSequence_Identifier()
	 * @model containment="true"
	 * @generated
	 */
	EList<Identifier> getIdentifiers();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(Code)
	 * @see fhiRCore.resources.ResourcesPackage#getMolecularSequence_Type()
	 * @model containment="true"
	 * @generated
	 */
	Code getType();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.MolecularSequence#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(Code value);

	/**
	 * Returns the value of the '<em><b>Coordinate System</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Coordinate System</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Coordinate System</em>' containment reference.
	 * @see #setCoordinateSystem(fhiRCore.dataTypes.Integer)
	 * @see fhiRCore.resources.ResourcesPackage#getMolecularSequence_CoordinateSystem()
	 * @model containment="true" required="true"
	 * @generated
	 */
	fhiRCore.dataTypes.Integer getCoordinateSystem();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.MolecularSequence#getCoordinateSystem <em>Coordinate System</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coordinate System</em>' containment reference.
	 * @see #getCoordinateSystem()
	 * @generated
	 */
	void setCoordinateSystem(fhiRCore.dataTypes.Integer value);

	/**
	 * Returns the value of the '<em><b>Patient</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Patient</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Patient</em>' containment reference.
	 * @see #setPatient(Reference)
	 * @see fhiRCore.resources.ResourcesPackage#getMolecularSequence_Patient()
	 * @model containment="true"
	 * @generated
	 */
	Reference getPatient();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.MolecularSequence#getPatient <em>Patient</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Patient</em>' containment reference.
	 * @see #getPatient()
	 * @generated
	 */
	void setPatient(Reference value);

	/**
	 * Returns the value of the '<em><b>Specimen</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Specimen</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specimen</em>' containment reference.
	 * @see #setSpecimen(Reference)
	 * @see fhiRCore.resources.ResourcesPackage#getMolecularSequence_Specimen()
	 * @model containment="true"
	 * @generated
	 */
	Reference getSpecimen();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.MolecularSequence#getSpecimen <em>Specimen</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specimen</em>' containment reference.
	 * @see #getSpecimen()
	 * @generated
	 */
	void setSpecimen(Reference value);

	/**
	 * Returns the value of the '<em><b>Device</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Device</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Device</em>' containment reference.
	 * @see #setDevice(Reference)
	 * @see fhiRCore.resources.ResourcesPackage#getMolecularSequence_Device()
	 * @model containment="true"
	 * @generated
	 */
	Reference getDevice();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.MolecularSequence#getDevice <em>Device</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Device</em>' containment reference.
	 * @see #getDevice()
	 * @generated
	 */
	void setDevice(Reference value);

	/**
	 * Returns the value of the '<em><b>Performer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Performer</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Performer</em>' containment reference.
	 * @see #setPerformer(Reference)
	 * @see fhiRCore.resources.ResourcesPackage#getMolecularSequence_Performer()
	 * @model containment="true"
	 * @generated
	 */
	Reference getPerformer();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.MolecularSequence#getPerformer <em>Performer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Performer</em>' containment reference.
	 * @see #getPerformer()
	 * @generated
	 */
	void setPerformer(Reference value);

	/**
	 * Returns the value of the '<em><b>Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quantity</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantity</em>' containment reference.
	 * @see #setQuantity(Quantity)
	 * @see fhiRCore.resources.ResourcesPackage#getMolecularSequence_Quantity()
	 * @model containment="true"
	 * @generated
	 */
	Quantity getQuantity();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.MolecularSequence#getQuantity <em>Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantity</em>' containment reference.
	 * @see #getQuantity()
	 * @generated
	 */
	void setQuantity(Quantity value);

	/**
	 * Returns the value of the '<em><b>Reference Seq</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reference Seq</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference Seq</em>' containment reference.
	 * @see #setReferenceSeq(MolecularSequenceReferenceSeq)
	 * @see fhiRCore.resources.ResourcesPackage#getMolecularSequence_ReferenceSeq()
	 * @model containment="true"
	 * @generated
	 */
	MolecularSequenceReferenceSeq getReferenceSeq();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.MolecularSequence#getReferenceSeq <em>Reference Seq</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference Seq</em>' containment reference.
	 * @see #getReferenceSeq()
	 * @generated
	 */
	void setReferenceSeq(MolecularSequenceReferenceSeq value);

	/**
	 * Returns the value of the '<em><b>Variant</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.resources.MolecularSequenceVariant}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variant</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variant</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getMolecularSequence_Variant()
	 * @model containment="true"
	 * @generated
	 */
	EList<MolecularSequenceVariant> getVariants();

	/**
	 * Returns the value of the '<em><b>Observed Seq</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Observed Seq</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Observed Seq</em>' containment reference.
	 * @see #setObservedSeq(fhiRCore.dataTypes.String)
	 * @see fhiRCore.resources.ResourcesPackage#getMolecularSequence_ObservedSeq()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getObservedSeq();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.MolecularSequence#getObservedSeq <em>Observed Seq</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Observed Seq</em>' containment reference.
	 * @see #getObservedSeq()
	 * @generated
	 */
	void setObservedSeq(fhiRCore.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Quality</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.resources.MolecularSequenceQuality}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quality</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quality</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getMolecularSequence_Quality()
	 * @model containment="true"
	 * @generated
	 */
	EList<MolecularSequenceQuality> getQualities();

	/**
	 * Returns the value of the '<em><b>Read Coverage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Read Coverage</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Read Coverage</em>' containment reference.
	 * @see #setReadCoverage(fhiRCore.dataTypes.Integer)
	 * @see fhiRCore.resources.ResourcesPackage#getMolecularSequence_ReadCoverage()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.Integer getReadCoverage();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.MolecularSequence#getReadCoverage <em>Read Coverage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Read Coverage</em>' containment reference.
	 * @see #getReadCoverage()
	 * @generated
	 */
	void setReadCoverage(fhiRCore.dataTypes.Integer value);

	/**
	 * Returns the value of the '<em><b>Repository</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.resources.MolecularSequenceRepository}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Repository</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Repository</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getMolecularSequence_Repository()
	 * @model containment="true"
	 * @generated
	 */
	EList<MolecularSequenceRepository> getRepositories();

	/**
	 * Returns the value of the '<em><b>Pointer</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.Reference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pointer</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pointer</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getMolecularSequence_Pointer()
	 * @model containment="true"
	 * @generated
	 */
	EList<Reference> getPointers();

	/**
	 * Returns the value of the '<em><b>Structure Variant</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.resources.MolecularSequenceStructureVariant}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Structure Variant</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Structure Variant</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getMolecularSequence_StructureVariant()
	 * @model containment="true"
	 * @generated
	 */
	EList<MolecularSequenceStructureVariant> getStructureVariants();

} // MolecularSequence
