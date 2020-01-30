/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.BackboneElement;
import fhiRCore.dataTypes.Code;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation Definition Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.OperationDefinitionParameter#getName <em>Name</em>}</li>
 *   <li>{@link fhiRCore.resources.OperationDefinitionParameter#getUse <em>Use</em>}</li>
 *   <li>{@link fhiRCore.resources.OperationDefinitionParameter#getMin <em>Min</em>}</li>
 *   <li>{@link fhiRCore.resources.OperationDefinitionParameter#getMax <em>Max</em>}</li>
 *   <li>{@link fhiRCore.resources.OperationDefinitionParameter#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link fhiRCore.resources.OperationDefinitionParameter#getType <em>Type</em>}</li>
 *   <li>{@link fhiRCore.resources.OperationDefinitionParameter#getTargetProfiles <em>Target Profile</em>}</li>
 *   <li>{@link fhiRCore.resources.OperationDefinitionParameter#getSearchType <em>Search Type</em>}</li>
 *   <li>{@link fhiRCore.resources.OperationDefinitionParameter#getBinding <em>Binding</em>}</li>
 *   <li>{@link fhiRCore.resources.OperationDefinitionParameter#getReferencedFroms <em>Referenced From</em>}</li>
 *   <li>{@link fhiRCore.resources.OperationDefinitionParameter#getParts <em>Part</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getOperationDefinitionParameter()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='OperationDefinition_Parameter'"
 * @generated
 */
public interface OperationDefinitionParameter extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(Code)
	 * @see fhiRCore.resources.ResourcesPackage#getOperationDefinitionParameter_Name()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Code getName();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.OperationDefinitionParameter#getName <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' containment reference.
	 * @see #getName()
	 * @generated
	 */
	void setName(Code value);

	/**
	 * Returns the value of the '<em><b>Use</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Use</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Use</em>' containment reference.
	 * @see #setUse(Code)
	 * @see fhiRCore.resources.ResourcesPackage#getOperationDefinitionParameter_Use()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Code getUse();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.OperationDefinitionParameter#getUse <em>Use</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use</em>' containment reference.
	 * @see #getUse()
	 * @generated
	 */
	void setUse(Code value);

	/**
	 * Returns the value of the '<em><b>Min</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min</em>' containment reference.
	 * @see #setMin(fhiRCore.dataTypes.Integer)
	 * @see fhiRCore.resources.ResourcesPackage#getOperationDefinitionParameter_Min()
	 * @model containment="true" required="true"
	 * @generated
	 */
	fhiRCore.dataTypes.Integer getMin();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.OperationDefinitionParameter#getMin <em>Min</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min</em>' containment reference.
	 * @see #getMin()
	 * @generated
	 */
	void setMin(fhiRCore.dataTypes.Integer value);

	/**
	 * Returns the value of the '<em><b>Max</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max</em>' containment reference.
	 * @see #setMax(fhiRCore.dataTypes.String)
	 * @see fhiRCore.resources.ResourcesPackage#getOperationDefinitionParameter_Max()
	 * @model containment="true" required="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getMax();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.OperationDefinitionParameter#getMax <em>Max</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max</em>' containment reference.
	 * @see #getMax()
	 * @generated
	 */
	void setMax(fhiRCore.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Documentation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Documentation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Documentation</em>' containment reference.
	 * @see #setDocumentation(fhiRCore.dataTypes.String)
	 * @see fhiRCore.resources.ResourcesPackage#getOperationDefinitionParameter_Documentation()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getDocumentation();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.OperationDefinitionParameter#getDocumentation <em>Documentation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Documentation</em>' containment reference.
	 * @see #getDocumentation()
	 * @generated
	 */
	void setDocumentation(fhiRCore.dataTypes.String value);

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
	 * @see fhiRCore.resources.ResourcesPackage#getOperationDefinitionParameter_Type()
	 * @model containment="true"
	 * @generated
	 */
	Code getType();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.OperationDefinitionParameter#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(Code value);

	/**
	 * Returns the value of the '<em><b>Target Profile</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.resources.StructureDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Profile</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Profile</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getOperationDefinitionParameter_TargetProfile()
	 * @model containment="true"
	 * @generated
	 */
	EList<StructureDefinition> getTargetProfiles();

	/**
	 * Returns the value of the '<em><b>Search Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Search Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Search Type</em>' containment reference.
	 * @see #setSearchType(Code)
	 * @see fhiRCore.resources.ResourcesPackage#getOperationDefinitionParameter_SearchType()
	 * @model containment="true"
	 * @generated
	 */
	Code getSearchType();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.OperationDefinitionParameter#getSearchType <em>Search Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Search Type</em>' containment reference.
	 * @see #getSearchType()
	 * @generated
	 */
	void setSearchType(Code value);

	/**
	 * Returns the value of the '<em><b>Binding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Binding</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Binding</em>' containment reference.
	 * @see #setBinding(OperationDefinitionParameterBinding)
	 * @see fhiRCore.resources.ResourcesPackage#getOperationDefinitionParameter_Binding()
	 * @model containment="true"
	 * @generated
	 */
	OperationDefinitionParameterBinding getBinding();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.OperationDefinitionParameter#getBinding <em>Binding</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Binding</em>' containment reference.
	 * @see #getBinding()
	 * @generated
	 */
	void setBinding(OperationDefinitionParameterBinding value);

	/**
	 * Returns the value of the '<em><b>Referenced From</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.resources.OperationDefinitionParameterReferencedFrom}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Referenced From</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referenced From</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getOperationDefinitionParameter_ReferencedFrom()
	 * @model containment="true"
	 * @generated
	 */
	EList<OperationDefinitionParameterReferencedFrom> getReferencedFroms();

	/**
	 * Returns the value of the '<em><b>Part</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.resources.OperationDefinitionParameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Part</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Part</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getOperationDefinitionParameter_Part()
	 * @model containment="true"
	 * @generated
	 */
	EList<OperationDefinitionParameter> getParts();

} // OperationDefinitionParameter
