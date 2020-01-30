/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.BackboneElement;
import fhiRCore.dataTypes.CodeableConcept;
import fhiRCore.dataTypes.DataType;
import fhiRCore.dataTypes.Reference;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Immunization Recommendation Recommendation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.ImmunizationRecommendationRecommendation#getVaccineCodes <em>Vaccine Code</em>}</li>
 *   <li>{@link fhiRCore.resources.ImmunizationRecommendationRecommendation#getTargetDisease <em>Target Disease</em>}</li>
 *   <li>{@link fhiRCore.resources.ImmunizationRecommendationRecommendation#getContraindicatedVaccineCodes <em>Contraindicated Vaccine Code</em>}</li>
 *   <li>{@link fhiRCore.resources.ImmunizationRecommendationRecommendation#getForecastStatus <em>Forecast Status</em>}</li>
 *   <li>{@link fhiRCore.resources.ImmunizationRecommendationRecommendation#getForecastReasons <em>Forecast Reason</em>}</li>
 *   <li>{@link fhiRCore.resources.ImmunizationRecommendationRecommendation#getDateCriterions <em>Date Criterion</em>}</li>
 *   <li>{@link fhiRCore.resources.ImmunizationRecommendationRecommendation#getDescription <em>Description</em>}</li>
 *   <li>{@link fhiRCore.resources.ImmunizationRecommendationRecommendation#getSeries <em>Series</em>}</li>
 *   <li>{@link fhiRCore.resources.ImmunizationRecommendationRecommendation#getDoseNumberx <em>Dose Numberx</em>}</li>
 *   <li>{@link fhiRCore.resources.ImmunizationRecommendationRecommendation#getSeriesDosesx <em>Series Dosesx</em>}</li>
 *   <li>{@link fhiRCore.resources.ImmunizationRecommendationRecommendation#getSupportingImmunizations <em>Supporting Immunization</em>}</li>
 *   <li>{@link fhiRCore.resources.ImmunizationRecommendationRecommendation#getSupportingPatientInformations <em>Supporting Patient Information</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getImmunizationRecommendationRecommendation()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='ImmunizationRecommendation_Recommendation'"
 * @generated
 */
public interface ImmunizationRecommendationRecommendation extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Vaccine Code</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vaccine Code</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vaccine Code</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getImmunizationRecommendationRecommendation_VaccineCode()
	 * @model containment="true"
	 * @generated
	 */
	EList<CodeableConcept> getVaccineCodes();

	/**
	 * Returns the value of the '<em><b>Target Disease</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Disease</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Disease</em>' containment reference.
	 * @see #setTargetDisease(CodeableConcept)
	 * @see fhiRCore.resources.ResourcesPackage#getImmunizationRecommendationRecommendation_TargetDisease()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getTargetDisease();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ImmunizationRecommendationRecommendation#getTargetDisease <em>Target Disease</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Disease</em>' containment reference.
	 * @see #getTargetDisease()
	 * @generated
	 */
	void setTargetDisease(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Contraindicated Vaccine Code</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contraindicated Vaccine Code</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contraindicated Vaccine Code</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getImmunizationRecommendationRecommendation_ContraindicatedVaccineCode()
	 * @model containment="true"
	 * @generated
	 */
	EList<CodeableConcept> getContraindicatedVaccineCodes();

	/**
	 * Returns the value of the '<em><b>Forecast Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Forecast Status</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Forecast Status</em>' containment reference.
	 * @see #setForecastStatus(CodeableConcept)
	 * @see fhiRCore.resources.ResourcesPackage#getImmunizationRecommendationRecommendation_ForecastStatus()
	 * @model containment="true" required="true"
	 * @generated
	 */
	CodeableConcept getForecastStatus();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ImmunizationRecommendationRecommendation#getForecastStatus <em>Forecast Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Forecast Status</em>' containment reference.
	 * @see #getForecastStatus()
	 * @generated
	 */
	void setForecastStatus(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Forecast Reason</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Forecast Reason</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Forecast Reason</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getImmunizationRecommendationRecommendation_ForecastReason()
	 * @model containment="true"
	 * @generated
	 */
	EList<CodeableConcept> getForecastReasons();

	/**
	 * Returns the value of the '<em><b>Date Criterion</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.resources.ImmunizationRecommendationRecommendationDateCriterion}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Criterion</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Criterion</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getImmunizationRecommendationRecommendation_DateCriterion()
	 * @model containment="true"
	 * @generated
	 */
	EList<ImmunizationRecommendationRecommendationDateCriterion> getDateCriterions();

	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(fhiRCore.dataTypes.String)
	 * @see fhiRCore.resources.ResourcesPackage#getImmunizationRecommendationRecommendation_Description()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getDescription();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ImmunizationRecommendationRecommendation#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(fhiRCore.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Series</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Series</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Series</em>' containment reference.
	 * @see #setSeries(fhiRCore.dataTypes.String)
	 * @see fhiRCore.resources.ResourcesPackage#getImmunizationRecommendationRecommendation_Series()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getSeries();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ImmunizationRecommendationRecommendation#getSeries <em>Series</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Series</em>' containment reference.
	 * @see #getSeries()
	 * @generated
	 */
	void setSeries(fhiRCore.dataTypes.String value);

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
	 * @see fhiRCore.resources.ResourcesPackage#getImmunizationRecommendationRecommendation_DoseNumberx()
	 * @model containment="true"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='doseNumber[x]'"
	 * @generated
	 */
	DataType getDoseNumberx();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ImmunizationRecommendationRecommendation#getDoseNumberx <em>Dose Numberx</em>}' containment reference.
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
	 * @see fhiRCore.resources.ResourcesPackage#getImmunizationRecommendationRecommendation_SeriesDosesx()
	 * @model containment="true"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='seriesDoses[x]'"
	 * @generated
	 */
	DataType getSeriesDosesx();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ImmunizationRecommendationRecommendation#getSeriesDosesx <em>Series Dosesx</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Series Dosesx</em>' containment reference.
	 * @see #getSeriesDosesx()
	 * @generated
	 */
	void setSeriesDosesx(DataType value);

	/**
	 * Returns the value of the '<em><b>Supporting Immunization</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.Reference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Supporting Immunization</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supporting Immunization</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getImmunizationRecommendationRecommendation_SupportingImmunization()
	 * @model containment="true"
	 * @generated
	 */
	EList<Reference> getSupportingImmunizations();

	/**
	 * Returns the value of the '<em><b>Supporting Patient Information</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.Reference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Supporting Patient Information</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supporting Patient Information</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getImmunizationRecommendationRecommendation_SupportingPatientInformation()
	 * @model containment="true"
	 * @generated
	 */
	EList<Reference> getSupportingPatientInformations();

} // ImmunizationRecommendationRecommendation
