/**
 */
package fhiRCore.dataTypes;

import fhiRCore.resources.StructureDefinition;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element Definition Element3</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.dataTypes.ElementDefinitionElement3#getCode <em>Code</em>}</li>
 *   <li>{@link fhiRCore.dataTypes.ElementDefinitionElement3#getProfiles <em>Profile</em>}</li>
 *   <li>{@link fhiRCore.dataTypes.ElementDefinitionElement3#getTargetProfiles <em>Target Profile</em>}</li>
 *   <li>{@link fhiRCore.dataTypes.ElementDefinitionElement3#getAggregations <em>Aggregation</em>}</li>
 *   <li>{@link fhiRCore.dataTypes.ElementDefinitionElement3#getVersioning <em>Versioning</em>}</li>
 * </ul>
 *
 * @see fhiRCore.dataTypes.DataTypesPackage#getElementDefinitionElement3()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='ElementDefinition_Element3'"
 * @generated
 */
public interface ElementDefinitionElement3 extends Element {
	/**
	 * Returns the value of the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' containment reference.
	 * @see #setCode(Uri)
	 * @see fhiRCore.dataTypes.DataTypesPackage#getElementDefinitionElement3_Code()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Uri getCode();

	/**
	 * Sets the value of the '{@link fhiRCore.dataTypes.ElementDefinitionElement3#getCode <em>Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' containment reference.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(Uri value);

	/**
	 * Returns the value of the '<em><b>Profile</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.resources.StructureDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Profile</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Profile</em>' containment reference list.
	 * @see fhiRCore.dataTypes.DataTypesPackage#getElementDefinitionElement3_Profile()
	 * @model containment="true"
	 * @generated
	 */
	EList<StructureDefinition> getProfiles();

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
	 * @see fhiRCore.dataTypes.DataTypesPackage#getElementDefinitionElement3_TargetProfile()
	 * @model containment="true"
	 * @generated
	 */
	EList<StructureDefinition> getTargetProfiles();

	/**
	 * Returns the value of the '<em><b>Aggregation</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.Code}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Aggregation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aggregation</em>' containment reference list.
	 * @see fhiRCore.dataTypes.DataTypesPackage#getElementDefinitionElement3_Aggregation()
	 * @model containment="true"
	 * @generated
	 */
	EList<Code> getAggregations();

	/**
	 * Returns the value of the '<em><b>Versioning</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Versioning</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Versioning</em>' containment reference.
	 * @see #setVersioning(Code)
	 * @see fhiRCore.dataTypes.DataTypesPackage#getElementDefinitionElement3_Versioning()
	 * @model containment="true"
	 * @generated
	 */
	Code getVersioning();

	/**
	 * Sets the value of the '{@link fhiRCore.dataTypes.ElementDefinitionElement3#getVersioning <em>Versioning</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Versioning</em>' containment reference.
	 * @see #getVersioning()
	 * @generated
	 */
	void setVersioning(Code value);

} // ElementDefinitionElement3
