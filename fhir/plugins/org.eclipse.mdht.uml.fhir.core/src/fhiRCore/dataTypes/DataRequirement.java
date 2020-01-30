/**
 */
package fhiRCore.dataTypes;

import fhiRCore.resources.StructureDefinition;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Requirement</b></em>'.
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
 *   <li>{@link fhiRCore.dataTypes.DataRequirement#getType <em>Type</em>}</li>
 *   <li>{@link fhiRCore.dataTypes.DataRequirement#getProfiles <em>Profile</em>}</li>
 *   <li>{@link fhiRCore.dataTypes.DataRequirement#getSubjectx <em>Subjectx</em>}</li>
 *   <li>{@link fhiRCore.dataTypes.DataRequirement#getMustSupports <em>Must Support</em>}</li>
 *   <li>{@link fhiRCore.dataTypes.DataRequirement#getCodeFilters <em>Code Filter</em>}</li>
 *   <li>{@link fhiRCore.dataTypes.DataRequirement#getDateFilters <em>Date Filter</em>}</li>
 *   <li>{@link fhiRCore.dataTypes.DataRequirement#getLimit <em>Limit</em>}</li>
 *   <li>{@link fhiRCore.dataTypes.DataRequirement#getSorts <em>Sort</em>}</li>
 * </ul>
 *
 * @see fhiRCore.dataTypes.DataTypesPackage#getDataRequirement()
 * @model
 * @generated
 */
public interface DataRequirement extends DataType {
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
	 * @see fhiRCore.dataTypes.DataTypesPackage#getDataRequirement_Type()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Code getType();

	/**
	 * Sets the value of the '{@link fhiRCore.dataTypes.DataRequirement#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(Code value);

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
	 * @see fhiRCore.dataTypes.DataTypesPackage#getDataRequirement_Profile()
	 * @model containment="true"
	 * @generated
	 */
	EList<StructureDefinition> getProfiles();

	/**
	 * Returns the value of the '<em><b>Subjectx</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subjectx</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subjectx</em>' containment reference.
	 * @see #setSubjectx(DataType)
	 * @see fhiRCore.dataTypes.DataTypesPackage#getDataRequirement_Subjectx()
	 * @model containment="true"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='subject[x]'"
	 * @generated
	 */
	DataType getSubjectx();

	/**
	 * Sets the value of the '{@link fhiRCore.dataTypes.DataRequirement#getSubjectx <em>Subjectx</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subjectx</em>' containment reference.
	 * @see #getSubjectx()
	 * @generated
	 */
	void setSubjectx(DataType value);

	/**
	 * Returns the value of the '<em><b>Must Support</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Must Support</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Must Support</em>' containment reference list.
	 * @see fhiRCore.dataTypes.DataTypesPackage#getDataRequirement_MustSupport()
	 * @model containment="true"
	 * @generated
	 */
	EList<fhiRCore.dataTypes.String> getMustSupports();

	/**
	 * Returns the value of the '<em><b>Code Filter</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.DataRequirementElement1}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code Filter</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code Filter</em>' containment reference list.
	 * @see fhiRCore.dataTypes.DataTypesPackage#getDataRequirement_CodeFilter()
	 * @model containment="true"
	 * @generated
	 */
	EList<DataRequirementElement1> getCodeFilters();

	/**
	 * Returns the value of the '<em><b>Date Filter</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.DataRequirementElement2}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Filter</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Filter</em>' containment reference list.
	 * @see fhiRCore.dataTypes.DataTypesPackage#getDataRequirement_DateFilter()
	 * @model containment="true"
	 * @generated
	 */
	EList<DataRequirementElement2> getDateFilters();

	/**
	 * Returns the value of the '<em><b>Limit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Limit</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Limit</em>' containment reference.
	 * @see #setLimit(PositiveInt)
	 * @see fhiRCore.dataTypes.DataTypesPackage#getDataRequirement_Limit()
	 * @model containment="true"
	 * @generated
	 */
	PositiveInt getLimit();

	/**
	 * Sets the value of the '{@link fhiRCore.dataTypes.DataRequirement#getLimit <em>Limit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Limit</em>' containment reference.
	 * @see #getLimit()
	 * @generated
	 */
	void setLimit(PositiveInt value);

	/**
	 * Returns the value of the '<em><b>Sort</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.DataRequirementElement3}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sort</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sort</em>' containment reference list.
	 * @see fhiRCore.dataTypes.DataTypesPackage#getDataRequirement_Sort()
	 * @model containment="true"
	 * @generated
	 */
	EList<DataRequirementElement3> getSorts();

} // DataRequirement
