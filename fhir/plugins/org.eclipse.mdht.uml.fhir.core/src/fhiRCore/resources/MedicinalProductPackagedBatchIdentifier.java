/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.BackboneElement;
import fhiRCore.dataTypes.Identifier;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Medicinal Product Packaged Batch Identifier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.MedicinalProductPackagedBatchIdentifier#getOuterPackaging <em>Outer Packaging</em>}</li>
 *   <li>{@link fhiRCore.resources.MedicinalProductPackagedBatchIdentifier#getImmediatePackaging <em>Immediate Packaging</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getMedicinalProductPackagedBatchIdentifier()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='MedicinalProductPackaged_BatchIdentifier'"
 * @generated
 */
public interface MedicinalProductPackagedBatchIdentifier extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Outer Packaging</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outer Packaging</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outer Packaging</em>' containment reference.
	 * @see #setOuterPackaging(Identifier)
	 * @see fhiRCore.resources.ResourcesPackage#getMedicinalProductPackagedBatchIdentifier_OuterPackaging()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Identifier getOuterPackaging();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.MedicinalProductPackagedBatchIdentifier#getOuterPackaging <em>Outer Packaging</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outer Packaging</em>' containment reference.
	 * @see #getOuterPackaging()
	 * @generated
	 */
	void setOuterPackaging(Identifier value);

	/**
	 * Returns the value of the '<em><b>Immediate Packaging</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Immediate Packaging</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Immediate Packaging</em>' containment reference.
	 * @see #setImmediatePackaging(Identifier)
	 * @see fhiRCore.resources.ResourcesPackage#getMedicinalProductPackagedBatchIdentifier_ImmediatePackaging()
	 * @model containment="true"
	 * @generated
	 */
	Identifier getImmediatePackaging();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.MedicinalProductPackagedBatchIdentifier#getImmediatePackaging <em>Immediate Packaging</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Immediate Packaging</em>' containment reference.
	 * @see #getImmediatePackaging()
	 * @generated
	 */
	void setImmediatePackaging(Identifier value);

} // MedicinalProductPackagedBatchIdentifier
