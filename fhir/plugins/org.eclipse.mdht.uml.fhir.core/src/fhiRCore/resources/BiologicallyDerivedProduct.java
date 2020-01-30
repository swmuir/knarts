/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.Code;
import fhiRCore.dataTypes.CodeableConcept;
import fhiRCore.dataTypes.Identifier;
import fhiRCore.dataTypes.Reference;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Biologically Derived Product</b></em>'.
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
 *   <li>{@link fhiRCore.resources.BiologicallyDerivedProduct#getIdentifiers <em>Identifier</em>}</li>
 *   <li>{@link fhiRCore.resources.BiologicallyDerivedProduct#getProductCategory <em>Product Category</em>}</li>
 *   <li>{@link fhiRCore.resources.BiologicallyDerivedProduct#getProductCode <em>Product Code</em>}</li>
 *   <li>{@link fhiRCore.resources.BiologicallyDerivedProduct#getStatus <em>Status</em>}</li>
 *   <li>{@link fhiRCore.resources.BiologicallyDerivedProduct#getRequests <em>Request</em>}</li>
 *   <li>{@link fhiRCore.resources.BiologicallyDerivedProduct#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link fhiRCore.resources.BiologicallyDerivedProduct#getParents <em>Parent</em>}</li>
 *   <li>{@link fhiRCore.resources.BiologicallyDerivedProduct#getCollection <em>Collection</em>}</li>
 *   <li>{@link fhiRCore.resources.BiologicallyDerivedProduct#getProcessings <em>Processing</em>}</li>
 *   <li>{@link fhiRCore.resources.BiologicallyDerivedProduct#getManipulation <em>Manipulation</em>}</li>
 *   <li>{@link fhiRCore.resources.BiologicallyDerivedProduct#getStorages <em>Storage</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getBiologicallyDerivedProduct()
 * @model
 * @generated
 */
public interface BiologicallyDerivedProduct extends DomainResource {
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
	 * @see fhiRCore.resources.ResourcesPackage#getBiologicallyDerivedProduct_Identifier()
	 * @model containment="true"
	 * @generated
	 */
	EList<Identifier> getIdentifiers();

	/**
	 * Returns the value of the '<em><b>Product Category</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Category</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Category</em>' containment reference.
	 * @see #setProductCategory(Code)
	 * @see fhiRCore.resources.ResourcesPackage#getBiologicallyDerivedProduct_ProductCategory()
	 * @model containment="true"
	 * @generated
	 */
	Code getProductCategory();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.BiologicallyDerivedProduct#getProductCategory <em>Product Category</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Category</em>' containment reference.
	 * @see #getProductCategory()
	 * @generated
	 */
	void setProductCategory(Code value);

	/**
	 * Returns the value of the '<em><b>Product Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Code</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Code</em>' containment reference.
	 * @see #setProductCode(CodeableConcept)
	 * @see fhiRCore.resources.ResourcesPackage#getBiologicallyDerivedProduct_ProductCode()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getProductCode();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.BiologicallyDerivedProduct#getProductCode <em>Product Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Code</em>' containment reference.
	 * @see #getProductCode()
	 * @generated
	 */
	void setProductCode(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' containment reference.
	 * @see #setStatus(Code)
	 * @see fhiRCore.resources.ResourcesPackage#getBiologicallyDerivedProduct_Status()
	 * @model containment="true"
	 * @generated
	 */
	Code getStatus();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.BiologicallyDerivedProduct#getStatus <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' containment reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(Code value);

	/**
	 * Returns the value of the '<em><b>Request</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.Reference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Request</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Request</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getBiologicallyDerivedProduct_Request()
	 * @model containment="true"
	 * @generated
	 */
	EList<Reference> getRequests();

	/**
	 * Returns the value of the '<em><b>Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quantity</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantity</em>' containment reference.
	 * @see #setQuantity(fhiRCore.dataTypes.Integer)
	 * @see fhiRCore.resources.ResourcesPackage#getBiologicallyDerivedProduct_Quantity()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.Integer getQuantity();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.BiologicallyDerivedProduct#getQuantity <em>Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantity</em>' containment reference.
	 * @see #getQuantity()
	 * @generated
	 */
	void setQuantity(fhiRCore.dataTypes.Integer value);

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.Reference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getBiologicallyDerivedProduct_Parent()
	 * @model containment="true"
	 * @generated
	 */
	EList<Reference> getParents();

	/**
	 * Returns the value of the '<em><b>Collection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Collection</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Collection</em>' containment reference.
	 * @see #setCollection(BiologicallyDerivedProductCollection)
	 * @see fhiRCore.resources.ResourcesPackage#getBiologicallyDerivedProduct_Collection()
	 * @model containment="true"
	 * @generated
	 */
	BiologicallyDerivedProductCollection getCollection();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.BiologicallyDerivedProduct#getCollection <em>Collection</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Collection</em>' containment reference.
	 * @see #getCollection()
	 * @generated
	 */
	void setCollection(BiologicallyDerivedProductCollection value);

	/**
	 * Returns the value of the '<em><b>Processing</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.resources.BiologicallyDerivedProductProcessing}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Processing</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Processing</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getBiologicallyDerivedProduct_Processing()
	 * @model containment="true"
	 * @generated
	 */
	EList<BiologicallyDerivedProductProcessing> getProcessings();

	/**
	 * Returns the value of the '<em><b>Manipulation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Manipulation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Manipulation</em>' containment reference.
	 * @see #setManipulation(BiologicallyDerivedProductManipulation)
	 * @see fhiRCore.resources.ResourcesPackage#getBiologicallyDerivedProduct_Manipulation()
	 * @model containment="true"
	 * @generated
	 */
	BiologicallyDerivedProductManipulation getManipulation();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.BiologicallyDerivedProduct#getManipulation <em>Manipulation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Manipulation</em>' containment reference.
	 * @see #getManipulation()
	 * @generated
	 */
	void setManipulation(BiologicallyDerivedProductManipulation value);

	/**
	 * Returns the value of the '<em><b>Storage</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.resources.BiologicallyDerivedProductStorage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Storage</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Storage</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getBiologicallyDerivedProduct_Storage()
	 * @model containment="true"
	 * @generated
	 */
	EList<BiologicallyDerivedProductStorage> getStorages();

} // BiologicallyDerivedProduct
