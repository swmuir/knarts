/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.BackboneElement;
import fhiRCore.dataTypes.CodeableConcept;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Measure Report Group Stratifier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.MeasureReportGroupStratifier#getCodes <em>Code</em>}</li>
 *   <li>{@link fhiRCore.resources.MeasureReportGroupStratifier#getStratums <em>Stratum</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getMeasureReportGroupStratifier()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Group_Stratifier'"
 * @generated
 */
public interface MeasureReportGroupStratifier extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Code</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getMeasureReportGroupStratifier_Code()
	 * @model containment="true"
	 * @generated
	 */
	EList<CodeableConcept> getCodes();

	/**
	 * Returns the value of the '<em><b>Stratum</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.resources.MeasureReportGroupStratifierStratifierGroup}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stratum</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stratum</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getMeasureReportGroupStratifier_Stratum()
	 * @model containment="true"
	 * @generated
	 */
	EList<MeasureReportGroupStratifierStratifierGroup> getStratums();

} // MeasureReportGroupStratifier
