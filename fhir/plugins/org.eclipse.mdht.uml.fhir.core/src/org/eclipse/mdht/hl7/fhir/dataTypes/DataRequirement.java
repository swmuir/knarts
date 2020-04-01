/**
 */
package org.eclipse.mdht.hl7.fhir.dataTypes;

import org.eclipse.emf.common.util.EList;

import org.eclipse.mdht.hl7.fhir.resources.StructureDefinition;

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
 *   <li>{@link org.eclipse.mdht.hl7.fhir.dataTypes.DataRequirement#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.dataTypes.DataRequirement#getProfiles <em>Profile</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.dataTypes.DataRequirement#getSubjectx <em>Subjectx</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.dataTypes.DataRequirement#getMustSupports <em>Must Support</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.dataTypes.DataRequirement#getCodeFilters <em>Code Filter</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.dataTypes.DataRequirement#getDateFilters <em>Date Filter</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.dataTypes.DataRequirement#getLimit <em>Limit</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.dataTypes.DataRequirement#getSorts <em>Sort</em>}</li>
 * </ul>
 *
 * @see org.eclipse.mdht.hl7.fhir.dataTypes.DataTypesPackage#getDataRequirement()
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
	 * @see org.eclipse.mdht.hl7.fhir.dataTypes.DataTypesPackage#getDataRequirement_Type()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Code getType();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.dataTypes.DataRequirement#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(Code value);

	/**
	 * Returns the value of the '<em><b>Profile</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.mdht.hl7.fhir.resources.StructureDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Profile</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Profile</em>' containment reference list.
	 * @see org.eclipse.mdht.hl7.fhir.dataTypes.DataTypesPackage#getDataRequirement_Profile()
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
	 * @see org.eclipse.mdht.hl7.fhir.dataTypes.DataTypesPackage#getDataRequirement_Subjectx()
	 * @model containment="true"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='subject[x]'"
	 * @generated
	 */
	DataType getSubjectx();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.dataTypes.DataRequirement#getSubjectx <em>Subjectx</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subjectx</em>' containment reference.
	 * @see #getSubjectx()
	 * @generated
	 */
	void setSubjectx(DataType value);

	/**
	 * Returns the value of the '<em><b>Must Support</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.mdht.hl7.fhir.dataTypes.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Must Support</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Must Support</em>' containment reference list.
	 * @see org.eclipse.mdht.hl7.fhir.dataTypes.DataTypesPackage#getDataRequirement_MustSupport()
	 * @model containment="true"
	 * @generated
	 */
	EList<org.eclipse.mdht.hl7.fhir.dataTypes.String> getMustSupports();

	/**
	 * Returns the value of the '<em><b>Code Filter</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.mdht.hl7.fhir.dataTypes.DataRequirementElement1}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code Filter</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code Filter</em>' containment reference list.
	 * @see org.eclipse.mdht.hl7.fhir.dataTypes.DataTypesPackage#getDataRequirement_CodeFilter()
	 * @model containment="true"
	 * @generated
	 */
	EList<DataRequirementElement1> getCodeFilters();

	/**
	 * Returns the value of the '<em><b>Date Filter</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.mdht.hl7.fhir.dataTypes.DataRequirementElement2}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Filter</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Filter</em>' containment reference list.
	 * @see org.eclipse.mdht.hl7.fhir.dataTypes.DataTypesPackage#getDataRequirement_DateFilter()
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
	 * @see org.eclipse.mdht.hl7.fhir.dataTypes.DataTypesPackage#getDataRequirement_Limit()
	 * @model containment="true"
	 * @generated
	 */
	PositiveInt getLimit();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.dataTypes.DataRequirement#getLimit <em>Limit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Limit</em>' containment reference.
	 * @see #getLimit()
	 * @generated
	 */
	void setLimit(PositiveInt value);

	/**
	 * Returns the value of the '<em><b>Sort</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.mdht.hl7.fhir.dataTypes.DataRequirementElement3}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sort</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sort</em>' containment reference list.
	 * @see org.eclipse.mdht.hl7.fhir.dataTypes.DataTypesPackage#getDataRequirement_Sort()
	 * @model containment="true"
	 * @generated
	 */
	EList<DataRequirementElement3> getSorts();

} // DataRequirement
