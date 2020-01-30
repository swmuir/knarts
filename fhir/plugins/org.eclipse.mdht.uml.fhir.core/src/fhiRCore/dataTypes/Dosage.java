/**
 */
package fhiRCore.dataTypes;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dosage</b></em>'.
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
 *   <li>{@link fhiRCore.dataTypes.Dosage#getSequence <em>Sequence</em>}</li>
 *   <li>{@link fhiRCore.dataTypes.Dosage#getText <em>Text</em>}</li>
 *   <li>{@link fhiRCore.dataTypes.Dosage#getAdditionalInstructions <em>Additional Instruction</em>}</li>
 *   <li>{@link fhiRCore.dataTypes.Dosage#getPatientInstruction <em>Patient Instruction</em>}</li>
 *   <li>{@link fhiRCore.dataTypes.Dosage#getTiming <em>Timing</em>}</li>
 *   <li>{@link fhiRCore.dataTypes.Dosage#getAsNeededx <em>As Neededx</em>}</li>
 *   <li>{@link fhiRCore.dataTypes.Dosage#getSite <em>Site</em>}</li>
 *   <li>{@link fhiRCore.dataTypes.Dosage#getRoute <em>Route</em>}</li>
 *   <li>{@link fhiRCore.dataTypes.Dosage#getMethod <em>Method</em>}</li>
 *   <li>{@link fhiRCore.dataTypes.Dosage#getDoseAndRates <em>Dose And Rate</em>}</li>
 *   <li>{@link fhiRCore.dataTypes.Dosage#getMaxDosePerPeriod <em>Max Dose Per Period</em>}</li>
 *   <li>{@link fhiRCore.dataTypes.Dosage#getMaxDosePerAdministration <em>Max Dose Per Administration</em>}</li>
 *   <li>{@link fhiRCore.dataTypes.Dosage#getMaxDosePerLifetime <em>Max Dose Per Lifetime</em>}</li>
 * </ul>
 *
 * @see fhiRCore.dataTypes.DataTypesPackage#getDosage()
 * @model
 * @generated
 */
public interface Dosage extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Sequence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sequence</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sequence</em>' containment reference.
	 * @see #setSequence(fhiRCore.dataTypes.Integer)
	 * @see fhiRCore.dataTypes.DataTypesPackage#getDosage_Sequence()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.Integer getSequence();

	/**
	 * Sets the value of the '{@link fhiRCore.dataTypes.Dosage#getSequence <em>Sequence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sequence</em>' containment reference.
	 * @see #getSequence()
	 * @generated
	 */
	void setSequence(fhiRCore.dataTypes.Integer value);

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
	 * @see fhiRCore.dataTypes.DataTypesPackage#getDosage_Text()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getText();

	/**
	 * Sets the value of the '{@link fhiRCore.dataTypes.Dosage#getText <em>Text</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' containment reference.
	 * @see #getText()
	 * @generated
	 */
	void setText(fhiRCore.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Additional Instruction</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Additional Instruction</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Additional Instruction</em>' containment reference list.
	 * @see fhiRCore.dataTypes.DataTypesPackage#getDosage_AdditionalInstruction()
	 * @model containment="true"
	 * @generated
	 */
	EList<CodeableConcept> getAdditionalInstructions();

	/**
	 * Returns the value of the '<em><b>Patient Instruction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Patient Instruction</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Patient Instruction</em>' containment reference.
	 * @see #setPatientInstruction(fhiRCore.dataTypes.String)
	 * @see fhiRCore.dataTypes.DataTypesPackage#getDosage_PatientInstruction()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getPatientInstruction();

	/**
	 * Sets the value of the '{@link fhiRCore.dataTypes.Dosage#getPatientInstruction <em>Patient Instruction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Patient Instruction</em>' containment reference.
	 * @see #getPatientInstruction()
	 * @generated
	 */
	void setPatientInstruction(fhiRCore.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Timing</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Timing</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timing</em>' containment reference.
	 * @see #setTiming(Timing)
	 * @see fhiRCore.dataTypes.DataTypesPackage#getDosage_Timing()
	 * @model containment="true"
	 * @generated
	 */
	Timing getTiming();

	/**
	 * Sets the value of the '{@link fhiRCore.dataTypes.Dosage#getTiming <em>Timing</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timing</em>' containment reference.
	 * @see #getTiming()
	 * @generated
	 */
	void setTiming(Timing value);

	/**
	 * Returns the value of the '<em><b>As Neededx</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>As Neededx</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>As Neededx</em>' containment reference.
	 * @see #setAsNeededx(DataType)
	 * @see fhiRCore.dataTypes.DataTypesPackage#getDosage_AsNeededx()
	 * @model containment="true"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='asNeeded[x]'"
	 * @generated
	 */
	DataType getAsNeededx();

	/**
	 * Sets the value of the '{@link fhiRCore.dataTypes.Dosage#getAsNeededx <em>As Neededx</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>As Neededx</em>' containment reference.
	 * @see #getAsNeededx()
	 * @generated
	 */
	void setAsNeededx(DataType value);

	/**
	 * Returns the value of the '<em><b>Site</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Site</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Site</em>' containment reference.
	 * @see #setSite(CodeableConcept)
	 * @see fhiRCore.dataTypes.DataTypesPackage#getDosage_Site()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getSite();

	/**
	 * Sets the value of the '{@link fhiRCore.dataTypes.Dosage#getSite <em>Site</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Site</em>' containment reference.
	 * @see #getSite()
	 * @generated
	 */
	void setSite(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Route</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Route</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Route</em>' containment reference.
	 * @see #setRoute(CodeableConcept)
	 * @see fhiRCore.dataTypes.DataTypesPackage#getDosage_Route()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getRoute();

	/**
	 * Sets the value of the '{@link fhiRCore.dataTypes.Dosage#getRoute <em>Route</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Route</em>' containment reference.
	 * @see #getRoute()
	 * @generated
	 */
	void setRoute(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Method</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Method</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Method</em>' containment reference.
	 * @see #setMethod(CodeableConcept)
	 * @see fhiRCore.dataTypes.DataTypesPackage#getDosage_Method()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getMethod();

	/**
	 * Sets the value of the '{@link fhiRCore.dataTypes.Dosage#getMethod <em>Method</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Method</em>' containment reference.
	 * @see #getMethod()
	 * @generated
	 */
	void setMethod(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Dose And Rate</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.DosageElement1}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dose And Rate</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dose And Rate</em>' containment reference list.
	 * @see fhiRCore.dataTypes.DataTypesPackage#getDosage_DoseAndRate()
	 * @model containment="true"
	 * @generated
	 */
	EList<DosageElement1> getDoseAndRates();

	/**
	 * Returns the value of the '<em><b>Max Dose Per Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Dose Per Period</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Dose Per Period</em>' containment reference.
	 * @see #setMaxDosePerPeriod(Ratio)
	 * @see fhiRCore.dataTypes.DataTypesPackage#getDosage_MaxDosePerPeriod()
	 * @model containment="true"
	 * @generated
	 */
	Ratio getMaxDosePerPeriod();

	/**
	 * Sets the value of the '{@link fhiRCore.dataTypes.Dosage#getMaxDosePerPeriod <em>Max Dose Per Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Dose Per Period</em>' containment reference.
	 * @see #getMaxDosePerPeriod()
	 * @generated
	 */
	void setMaxDosePerPeriod(Ratio value);

	/**
	 * Returns the value of the '<em><b>Max Dose Per Administration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Dose Per Administration</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Dose Per Administration</em>' containment reference.
	 * @see #setMaxDosePerAdministration(Quantity)
	 * @see fhiRCore.dataTypes.DataTypesPackage#getDosage_MaxDosePerAdministration()
	 * @model containment="true"
	 * @generated
	 */
	Quantity getMaxDosePerAdministration();

	/**
	 * Sets the value of the '{@link fhiRCore.dataTypes.Dosage#getMaxDosePerAdministration <em>Max Dose Per Administration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Dose Per Administration</em>' containment reference.
	 * @see #getMaxDosePerAdministration()
	 * @generated
	 */
	void setMaxDosePerAdministration(Quantity value);

	/**
	 * Returns the value of the '<em><b>Max Dose Per Lifetime</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Dose Per Lifetime</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Dose Per Lifetime</em>' containment reference.
	 * @see #setMaxDosePerLifetime(Quantity)
	 * @see fhiRCore.dataTypes.DataTypesPackage#getDosage_MaxDosePerLifetime()
	 * @model containment="true"
	 * @generated
	 */
	Quantity getMaxDosePerLifetime();

	/**
	 * Sets the value of the '{@link fhiRCore.dataTypes.Dosage#getMaxDosePerLifetime <em>Max Dose Per Lifetime</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Dose Per Lifetime</em>' containment reference.
	 * @see #getMaxDosePerLifetime()
	 * @generated
	 */
	void setMaxDosePerLifetime(Quantity value);

} // Dosage
