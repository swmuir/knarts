/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.BackboneElement;
import fhiRCore.dataTypes.Coding;
import fhiRCore.dataTypes.UnsignedInt;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contract Term Security Label</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.ContractTermSecurityLabel#getNumbers <em>Number</em>}</li>
 *   <li>{@link fhiRCore.resources.ContractTermSecurityLabel#getClassification <em>Classification</em>}</li>
 *   <li>{@link fhiRCore.resources.ContractTermSecurityLabel#getCategories <em>Category</em>}</li>
 *   <li>{@link fhiRCore.resources.ContractTermSecurityLabel#getControls <em>Control</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getContractTermSecurityLabel()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Term_SecurityLabel'"
 * @generated
 */
public interface ContractTermSecurityLabel extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Number</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.UnsignedInt}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getContractTermSecurityLabel_Number()
	 * @model containment="true"
	 * @generated
	 */
	EList<UnsignedInt> getNumbers();

	/**
	 * Returns the value of the '<em><b>Classification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Classification</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classification</em>' containment reference.
	 * @see #setClassification(Coding)
	 * @see fhiRCore.resources.ResourcesPackage#getContractTermSecurityLabel_Classification()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Coding getClassification();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ContractTermSecurityLabel#getClassification <em>Classification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Classification</em>' containment reference.
	 * @see #getClassification()
	 * @generated
	 */
	void setClassification(Coding value);

	/**
	 * Returns the value of the '<em><b>Category</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.Coding}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Category</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Category</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getContractTermSecurityLabel_Category()
	 * @model containment="true"
	 * @generated
	 */
	EList<Coding> getCategories();

	/**
	 * Returns the value of the '<em><b>Control</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.Coding}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Control</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Control</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getContractTermSecurityLabel_Control()
	 * @model containment="true"
	 * @generated
	 */
	EList<Coding> getControls();

} // ContractTermSecurityLabel
