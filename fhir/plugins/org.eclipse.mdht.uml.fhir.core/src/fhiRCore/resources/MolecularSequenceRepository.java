/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.BackboneElement;
import fhiRCore.dataTypes.Code;
import fhiRCore.dataTypes.Uri;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Molecular Sequence Repository</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.MolecularSequenceRepository#getType <em>Type</em>}</li>
 *   <li>{@link fhiRCore.resources.MolecularSequenceRepository#getUrl <em>Url</em>}</li>
 *   <li>{@link fhiRCore.resources.MolecularSequenceRepository#getName <em>Name</em>}</li>
 *   <li>{@link fhiRCore.resources.MolecularSequenceRepository#getDatasetId <em>Dataset Id</em>}</li>
 *   <li>{@link fhiRCore.resources.MolecularSequenceRepository#getVariantsetId <em>Variantset Id</em>}</li>
 *   <li>{@link fhiRCore.resources.MolecularSequenceRepository#getReadsetId <em>Readset Id</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getMolecularSequenceRepository()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='MolecularSequence_Repository'"
 * @generated
 */
public interface MolecularSequenceRepository extends BackboneElement {
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
	 * @see fhiRCore.resources.ResourcesPackage#getMolecularSequenceRepository_Type()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Code getType();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.MolecularSequenceRepository#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(Code value);

	/**
	 * Returns the value of the '<em><b>Url</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Url</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Url</em>' containment reference.
	 * @see #setUrl(Uri)
	 * @see fhiRCore.resources.ResourcesPackage#getMolecularSequenceRepository_Url()
	 * @model containment="true"
	 * @generated
	 */
	Uri getUrl();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.MolecularSequenceRepository#getUrl <em>Url</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Url</em>' containment reference.
	 * @see #getUrl()
	 * @generated
	 */
	void setUrl(Uri value);

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
	 * @see fhiRCore.resources.ResourcesPackage#getMolecularSequenceRepository_Name()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getName();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.MolecularSequenceRepository#getName <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' containment reference.
	 * @see #getName()
	 * @generated
	 */
	void setName(fhiRCore.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Dataset Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dataset Id</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dataset Id</em>' containment reference.
	 * @see #setDatasetId(fhiRCore.dataTypes.String)
	 * @see fhiRCore.resources.ResourcesPackage#getMolecularSequenceRepository_DatasetId()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getDatasetId();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.MolecularSequenceRepository#getDatasetId <em>Dataset Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dataset Id</em>' containment reference.
	 * @see #getDatasetId()
	 * @generated
	 */
	void setDatasetId(fhiRCore.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Variantset Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variantset Id</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variantset Id</em>' containment reference.
	 * @see #setVariantsetId(fhiRCore.dataTypes.String)
	 * @see fhiRCore.resources.ResourcesPackage#getMolecularSequenceRepository_VariantsetId()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getVariantsetId();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.MolecularSequenceRepository#getVariantsetId <em>Variantset Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variantset Id</em>' containment reference.
	 * @see #getVariantsetId()
	 * @generated
	 */
	void setVariantsetId(fhiRCore.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Readset Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Readset Id</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Readset Id</em>' containment reference.
	 * @see #setReadsetId(fhiRCore.dataTypes.String)
	 * @see fhiRCore.resources.ResourcesPackage#getMolecularSequenceRepository_ReadsetId()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getReadsetId();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.MolecularSequenceRepository#getReadsetId <em>Readset Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Readset Id</em>' containment reference.
	 * @see #getReadsetId()
	 * @generated
	 */
	void setReadsetId(fhiRCore.dataTypes.String value);

} // MolecularSequenceRepository
