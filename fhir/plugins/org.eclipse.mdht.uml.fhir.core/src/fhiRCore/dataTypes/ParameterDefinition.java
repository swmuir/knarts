/**
 */
package fhiRCore.dataTypes;

import fhiRCore.resources.StructureDefinition;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter Definition</b></em>'.
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
 *   <li>{@link fhiRCore.dataTypes.ParameterDefinition#getName <em>Name</em>}</li>
 *   <li>{@link fhiRCore.dataTypes.ParameterDefinition#getUse <em>Use</em>}</li>
 *   <li>{@link fhiRCore.dataTypes.ParameterDefinition#getMin <em>Min</em>}</li>
 *   <li>{@link fhiRCore.dataTypes.ParameterDefinition#getMax <em>Max</em>}</li>
 *   <li>{@link fhiRCore.dataTypes.ParameterDefinition#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link fhiRCore.dataTypes.ParameterDefinition#getType <em>Type</em>}</li>
 *   <li>{@link fhiRCore.dataTypes.ParameterDefinition#getProfile <em>Profile</em>}</li>
 * </ul>
 *
 * @see fhiRCore.dataTypes.DataTypesPackage#getParameterDefinition()
 * @model
 * @generated
 */
public interface ParameterDefinition extends DataType {
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
	 * @see fhiRCore.dataTypes.DataTypesPackage#getParameterDefinition_Name()
	 * @model containment="true"
	 * @generated
	 */
	Code getName();

	/**
	 * Sets the value of the '{@link fhiRCore.dataTypes.ParameterDefinition#getName <em>Name</em>}' containment reference.
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
	 * @see fhiRCore.dataTypes.DataTypesPackage#getParameterDefinition_Use()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Code getUse();

	/**
	 * Sets the value of the '{@link fhiRCore.dataTypes.ParameterDefinition#getUse <em>Use</em>}' containment reference.
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
	 * @see fhiRCore.dataTypes.DataTypesPackage#getParameterDefinition_Min()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.Integer getMin();

	/**
	 * Sets the value of the '{@link fhiRCore.dataTypes.ParameterDefinition#getMin <em>Min</em>}' containment reference.
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
	 * @see fhiRCore.dataTypes.DataTypesPackage#getParameterDefinition_Max()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getMax();

	/**
	 * Sets the value of the '{@link fhiRCore.dataTypes.ParameterDefinition#getMax <em>Max</em>}' containment reference.
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
	 * @see fhiRCore.dataTypes.DataTypesPackage#getParameterDefinition_Documentation()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getDocumentation();

	/**
	 * Sets the value of the '{@link fhiRCore.dataTypes.ParameterDefinition#getDocumentation <em>Documentation</em>}' containment reference.
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
	 * @see fhiRCore.dataTypes.DataTypesPackage#getParameterDefinition_Type()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Code getType();

	/**
	 * Sets the value of the '{@link fhiRCore.dataTypes.ParameterDefinition#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(Code value);

	/**
	 * Returns the value of the '<em><b>Profile</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Profile</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Profile</em>' containment reference.
	 * @see #setProfile(StructureDefinition)
	 * @see fhiRCore.dataTypes.DataTypesPackage#getParameterDefinition_Profile()
	 * @model containment="true"
	 * @generated
	 */
	StructureDefinition getProfile();

	/**
	 * Sets the value of the '{@link fhiRCore.dataTypes.ParameterDefinition#getProfile <em>Profile</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Profile</em>' containment reference.
	 * @see #getProfile()
	 * @generated
	 */
	void setProfile(StructureDefinition value);

} // ParameterDefinition
