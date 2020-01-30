/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.BackboneElement;
import fhiRCore.dataTypes.CodeableConcept;
import fhiRCore.dataTypes.Reference;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contract Term Contract Asset Asset Context</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.ContractTermContractAssetAssetContext#getReference <em>Reference</em>}</li>
 *   <li>{@link fhiRCore.resources.ContractTermContractAssetAssetContext#getCodes <em>Code</em>}</li>
 *   <li>{@link fhiRCore.resources.ContractTermContractAssetAssetContext#getText <em>Text</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getContractTermContractAssetAssetContext()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='ContractAsset_AssetContext'"
 * @generated
 */
public interface ContractTermContractAssetAssetContext extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reference</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference</em>' containment reference.
	 * @see #setReference(Reference)
	 * @see fhiRCore.resources.ResourcesPackage#getContractTermContractAssetAssetContext_Reference()
	 * @model containment="true"
	 * @generated
	 */
	Reference getReference();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ContractTermContractAssetAssetContext#getReference <em>Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference</em>' containment reference.
	 * @see #getReference()
	 * @generated
	 */
	void setReference(Reference value);

	/**
	 * Returns the value of the '<em><b>Code</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getContractTermContractAssetAssetContext_Code()
	 * @model containment="true"
	 * @generated
	 */
	EList<CodeableConcept> getCodes();

	/**
	 * Returns the value of the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' containment reference.
	 * @see #setText(fhiRCore.dataTypes.String)
	 * @see fhiRCore.resources.ResourcesPackage#getContractTermContractAssetAssetContext_Text()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getText();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ContractTermContractAssetAssetContext#getText <em>Text</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' containment reference.
	 * @see #getText()
	 * @generated
	 */
	void setText(fhiRCore.dataTypes.String value);

} // ContractTermContractAssetAssetContext
