/**
 */
package fhiRCore.dataTypes;

import fhiRCore.resources.ValueSet;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Requirement Element1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.dataTypes.DataRequirementElement1#getPath <em>Path</em>}</li>
 *   <li>{@link fhiRCore.dataTypes.DataRequirementElement1#getSearchParam <em>Search Param</em>}</li>
 *   <li>{@link fhiRCore.dataTypes.DataRequirementElement1#getValueSet <em>Value Set</em>}</li>
 *   <li>{@link fhiRCore.dataTypes.DataRequirementElement1#getCodes <em>Code</em>}</li>
 * </ul>
 *
 * @see fhiRCore.dataTypes.DataTypesPackage#getDataRequirementElement1()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='DataRequirement_Element1'"
 * @generated
 */
public interface DataRequirementElement1 extends Element {
	/**
	 * Returns the value of the '<em><b>Path</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Path</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path</em>' containment reference.
	 * @see #setPath(fhiRCore.dataTypes.String)
	 * @see fhiRCore.dataTypes.DataTypesPackage#getDataRequirementElement1_Path()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getPath();

	/**
	 * Sets the value of the '{@link fhiRCore.dataTypes.DataRequirementElement1#getPath <em>Path</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path</em>' containment reference.
	 * @see #getPath()
	 * @generated
	 */
	void setPath(fhiRCore.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Search Param</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Search Param</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Search Param</em>' containment reference.
	 * @see #setSearchParam(fhiRCore.dataTypes.String)
	 * @see fhiRCore.dataTypes.DataTypesPackage#getDataRequirementElement1_SearchParam()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getSearchParam();

	/**
	 * Sets the value of the '{@link fhiRCore.dataTypes.DataRequirementElement1#getSearchParam <em>Search Param</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Search Param</em>' containment reference.
	 * @see #getSearchParam()
	 * @generated
	 */
	void setSearchParam(fhiRCore.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Value Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Set</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Set</em>' containment reference.
	 * @see #setValueSet(ValueSet)
	 * @see fhiRCore.dataTypes.DataTypesPackage#getDataRequirementElement1_ValueSet()
	 * @model containment="true"
	 * @generated
	 */
	ValueSet getValueSet();

	/**
	 * Sets the value of the '{@link fhiRCore.dataTypes.DataRequirementElement1#getValueSet <em>Value Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Set</em>' containment reference.
	 * @see #getValueSet()
	 * @generated
	 */
	void setValueSet(ValueSet value);

	/**
	 * Returns the value of the '<em><b>Code</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.Coding}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' containment reference list.
	 * @see fhiRCore.dataTypes.DataTypesPackage#getDataRequirementElement1_Code()
	 * @model containment="true"
	 * @generated
	 */
	EList<Coding> getCodes();

} // DataRequirementElement1
