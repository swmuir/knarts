/**
 */
package org.eclipse.mdht.hl7.fhir.resources;

import org.eclipse.emf.common.util.EList;

import org.eclipse.mdht.hl7.fhir.dataTypes.BackboneElement;
import org.eclipse.mdht.hl7.fhir.dataTypes.CodeableConcept;
import org.eclipse.mdht.hl7.fhir.dataTypes.DataType;
import org.eclipse.mdht.hl7.fhir.dataTypes.Reference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Immunization Protocol Applied</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.ImmunizationProtocolApplied#getSeries <em>Series</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.ImmunizationProtocolApplied#getAuthority <em>Authority</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.ImmunizationProtocolApplied#getTargetDiseases <em>Target Disease</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.ImmunizationProtocolApplied#getDoseNumberx <em>Dose Numberx</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.ImmunizationProtocolApplied#getSeriesDosesx <em>Series Dosesx</em>}</li>
 * </ul>
 *
 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getImmunizationProtocolApplied()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Immunization_ProtocolApplied'"
 * @generated
 */
public interface ImmunizationProtocolApplied extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Series</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Series</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Series</em>' containment reference.
	 * @see #setSeries(org.eclipse.mdht.hl7.fhir.dataTypes.String)
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getImmunizationProtocolApplied_Series()
	 * @model containment="true"
	 * @generated
	 */
	org.eclipse.mdht.hl7.fhir.dataTypes.String getSeries();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.resources.ImmunizationProtocolApplied#getSeries <em>Series</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Series</em>' containment reference.
	 * @see #getSeries()
	 * @generated
	 */
	void setSeries(org.eclipse.mdht.hl7.fhir.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Authority</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Authority</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Authority</em>' containment reference.
	 * @see #setAuthority(Reference)
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getImmunizationProtocolApplied_Authority()
	 * @model containment="true"
	 * @generated
	 */
	Reference getAuthority();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.resources.ImmunizationProtocolApplied#getAuthority <em>Authority</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Authority</em>' containment reference.
	 * @see #getAuthority()
	 * @generated
	 */
	void setAuthority(Reference value);

	/**
	 * Returns the value of the '<em><b>Target Disease</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.mdht.hl7.fhir.dataTypes.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Disease</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Disease</em>' containment reference list.
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getImmunizationProtocolApplied_TargetDisease()
	 * @model containment="true"
	 * @generated
	 */
	EList<CodeableConcept> getTargetDiseases();

	/**
	 * Returns the value of the '<em><b>Dose Numberx</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dose Numberx</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dose Numberx</em>' containment reference.
	 * @see #setDoseNumberx(DataType)
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getImmunizationProtocolApplied_DoseNumberx()
	 * @model containment="true" required="true"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='doseNumber[x]'"
	 * @generated
	 */
	DataType getDoseNumberx();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.resources.ImmunizationProtocolApplied#getDoseNumberx <em>Dose Numberx</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dose Numberx</em>' containment reference.
	 * @see #getDoseNumberx()
	 * @generated
	 */
	void setDoseNumberx(DataType value);

	/**
	 * Returns the value of the '<em><b>Series Dosesx</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Series Dosesx</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Series Dosesx</em>' containment reference.
	 * @see #setSeriesDosesx(DataType)
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getImmunizationProtocolApplied_SeriesDosesx()
	 * @model containment="true"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='seriesDoses[x]'"
	 * @generated
	 */
	DataType getSeriesDosesx();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.resources.ImmunizationProtocolApplied#getSeriesDosesx <em>Series Dosesx</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Series Dosesx</em>' containment reference.
	 * @see #getSeriesDosesx()
	 * @generated
	 */
	void setSeriesDosesx(DataType value);

} // ImmunizationProtocolApplied
