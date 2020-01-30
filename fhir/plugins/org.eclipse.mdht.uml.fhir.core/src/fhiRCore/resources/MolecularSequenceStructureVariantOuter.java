/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.BackboneElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Molecular Sequence Structure Variant Outer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.MolecularSequenceStructureVariantOuter#getStart <em>Start</em>}</li>
 *   <li>{@link fhiRCore.resources.MolecularSequenceStructureVariantOuter#getEnd <em>End</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getMolecularSequenceStructureVariantOuter()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='StructureVariant_Outer'"
 * @generated
 */
public interface MolecularSequenceStructureVariantOuter extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start</em>' containment reference.
	 * @see #setStart(fhiRCore.dataTypes.Integer)
	 * @see fhiRCore.resources.ResourcesPackage#getMolecularSequenceStructureVariantOuter_Start()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.Integer getStart();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.MolecularSequenceStructureVariantOuter#getStart <em>Start</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start</em>' containment reference.
	 * @see #getStart()
	 * @generated
	 */
	void setStart(fhiRCore.dataTypes.Integer value);

	/**
	 * Returns the value of the '<em><b>End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End</em>' containment reference.
	 * @see #setEnd(fhiRCore.dataTypes.Integer)
	 * @see fhiRCore.resources.ResourcesPackage#getMolecularSequenceStructureVariantOuter_End()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.Integer getEnd();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.MolecularSequenceStructureVariantOuter#getEnd <em>End</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End</em>' containment reference.
	 * @see #getEnd()
	 * @generated
	 */
	void setEnd(fhiRCore.dataTypes.Integer value);

} // MolecularSequenceStructureVariantOuter
