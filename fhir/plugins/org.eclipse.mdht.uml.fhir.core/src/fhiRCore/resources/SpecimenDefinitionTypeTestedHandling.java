/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.BackboneElement;
import fhiRCore.dataTypes.CodeableConcept;
import fhiRCore.dataTypes.Duration;
import fhiRCore.dataTypes.Range;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Specimen Definition Type Tested Handling</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.SpecimenDefinitionTypeTestedHandling#getTemperatureQualifier <em>Temperature Qualifier</em>}</li>
 *   <li>{@link fhiRCore.resources.SpecimenDefinitionTypeTestedHandling#getTemperatureRange <em>Temperature Range</em>}</li>
 *   <li>{@link fhiRCore.resources.SpecimenDefinitionTypeTestedHandling#getMaxDuration <em>Max Duration</em>}</li>
 *   <li>{@link fhiRCore.resources.SpecimenDefinitionTypeTestedHandling#getInstruction <em>Instruction</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getSpecimenDefinitionTypeTestedHandling()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='TypeTested_Handling'"
 * @generated
 */
public interface SpecimenDefinitionTypeTestedHandling extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Temperature Qualifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Temperature Qualifier</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Temperature Qualifier</em>' containment reference.
	 * @see #setTemperatureQualifier(CodeableConcept)
	 * @see fhiRCore.resources.ResourcesPackage#getSpecimenDefinitionTypeTestedHandling_TemperatureQualifier()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getTemperatureQualifier();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.SpecimenDefinitionTypeTestedHandling#getTemperatureQualifier <em>Temperature Qualifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Temperature Qualifier</em>' containment reference.
	 * @see #getTemperatureQualifier()
	 * @generated
	 */
	void setTemperatureQualifier(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Temperature Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Temperature Range</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Temperature Range</em>' containment reference.
	 * @see #setTemperatureRange(Range)
	 * @see fhiRCore.resources.ResourcesPackage#getSpecimenDefinitionTypeTestedHandling_TemperatureRange()
	 * @model containment="true"
	 * @generated
	 */
	Range getTemperatureRange();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.SpecimenDefinitionTypeTestedHandling#getTemperatureRange <em>Temperature Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Temperature Range</em>' containment reference.
	 * @see #getTemperatureRange()
	 * @generated
	 */
	void setTemperatureRange(Range value);

	/**
	 * Returns the value of the '<em><b>Max Duration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Duration</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Duration</em>' containment reference.
	 * @see #setMaxDuration(Duration)
	 * @see fhiRCore.resources.ResourcesPackage#getSpecimenDefinitionTypeTestedHandling_MaxDuration()
	 * @model containment="true"
	 * @generated
	 */
	Duration getMaxDuration();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.SpecimenDefinitionTypeTestedHandling#getMaxDuration <em>Max Duration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Duration</em>' containment reference.
	 * @see #getMaxDuration()
	 * @generated
	 */
	void setMaxDuration(Duration value);

	/**
	 * Returns the value of the '<em><b>Instruction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instruction</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instruction</em>' containment reference.
	 * @see #setInstruction(fhiRCore.dataTypes.String)
	 * @see fhiRCore.resources.ResourcesPackage#getSpecimenDefinitionTypeTestedHandling_Instruction()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getInstruction();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.SpecimenDefinitionTypeTestedHandling#getInstruction <em>Instruction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instruction</em>' containment reference.
	 * @see #getInstruction()
	 * @generated
	 */
	void setInstruction(fhiRCore.dataTypes.String value);

} // SpecimenDefinitionTypeTestedHandling
