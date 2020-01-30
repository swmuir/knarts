/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.BackboneElement;
import fhiRCore.dataTypes.CodeableConcept;
import fhiRCore.dataTypes.DataType;
import fhiRCore.dataTypes.DateTime;
import fhiRCore.dataTypes.PositiveInt;
import fhiRCore.dataTypes.Reference;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Explanation Of Benefit Procedure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.ExplanationOfBenefitProcedure#getSequence <em>Sequence</em>}</li>
 *   <li>{@link fhiRCore.resources.ExplanationOfBenefitProcedure#getTypes <em>Type</em>}</li>
 *   <li>{@link fhiRCore.resources.ExplanationOfBenefitProcedure#getDate <em>Date</em>}</li>
 *   <li>{@link fhiRCore.resources.ExplanationOfBenefitProcedure#getProcedurex <em>Procedurex</em>}</li>
 *   <li>{@link fhiRCore.resources.ExplanationOfBenefitProcedure#getUdis <em>Udi</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getExplanationOfBenefitProcedure()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='ExplanationOfBenefit_Procedure'"
 * @generated
 */
public interface ExplanationOfBenefitProcedure extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Sequence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sequence</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sequence</em>' containment reference.
	 * @see #setSequence(PositiveInt)
	 * @see fhiRCore.resources.ResourcesPackage#getExplanationOfBenefitProcedure_Sequence()
	 * @model containment="true" required="true"
	 * @generated
	 */
	PositiveInt getSequence();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ExplanationOfBenefitProcedure#getSequence <em>Sequence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sequence</em>' containment reference.
	 * @see #getSequence()
	 * @generated
	 */
	void setSequence(PositiveInt value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getExplanationOfBenefitProcedure_Type()
	 * @model containment="true"
	 * @generated
	 */
	EList<CodeableConcept> getTypes();

	/**
	 * Returns the value of the '<em><b>Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date</em>' containment reference.
	 * @see #setDate(DateTime)
	 * @see fhiRCore.resources.ResourcesPackage#getExplanationOfBenefitProcedure_Date()
	 * @model containment="true"
	 * @generated
	 */
	DateTime getDate();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ExplanationOfBenefitProcedure#getDate <em>Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' containment reference.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(DateTime value);

	/**
	 * Returns the value of the '<em><b>Procedurex</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Procedurex</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Procedurex</em>' containment reference.
	 * @see #setProcedurex(DataType)
	 * @see fhiRCore.resources.ResourcesPackage#getExplanationOfBenefitProcedure_Procedurex()
	 * @model containment="true" required="true"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='procedure[x]'"
	 * @generated
	 */
	DataType getProcedurex();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ExplanationOfBenefitProcedure#getProcedurex <em>Procedurex</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Procedurex</em>' containment reference.
	 * @see #getProcedurex()
	 * @generated
	 */
	void setProcedurex(DataType value);

	/**
	 * Returns the value of the '<em><b>Udi</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.Reference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Udi</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Udi</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getExplanationOfBenefitProcedure_Udi()
	 * @model containment="true"
	 * @generated
	 */
	EList<Reference> getUdis();

} // ExplanationOfBenefitProcedure
