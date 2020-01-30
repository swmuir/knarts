/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.BackboneElement;
import fhiRCore.dataTypes.Decimal;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Molecular Sequence Quality Roc</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.MolecularSequenceQualityRoc#getScores <em>Score</em>}</li>
 *   <li>{@link fhiRCore.resources.MolecularSequenceQualityRoc#getNumTps <em>Num Tp</em>}</li>
 *   <li>{@link fhiRCore.resources.MolecularSequenceQualityRoc#getNumFps <em>Num Fp</em>}</li>
 *   <li>{@link fhiRCore.resources.MolecularSequenceQualityRoc#getNumFns <em>Num Fn</em>}</li>
 *   <li>{@link fhiRCore.resources.MolecularSequenceQualityRoc#getPrecisions <em>Precision</em>}</li>
 *   <li>{@link fhiRCore.resources.MolecularSequenceQualityRoc#getSensitivities <em>Sensitivity</em>}</li>
 *   <li>{@link fhiRCore.resources.MolecularSequenceQualityRoc#getFMeasures <em>FMeasure</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getMolecularSequenceQualityRoc()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Quality_Roc'"
 * @generated
 */
public interface MolecularSequenceQualityRoc extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Score</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.Integer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Score</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Score</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getMolecularSequenceQualityRoc_Score()
	 * @model containment="true"
	 * @generated
	 */
	EList<fhiRCore.dataTypes.Integer> getScores();

	/**
	 * Returns the value of the '<em><b>Num Tp</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.Integer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Num Tp</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Num Tp</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getMolecularSequenceQualityRoc_NumTp()
	 * @model containment="true"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='numTP'"
	 * @generated
	 */
	EList<fhiRCore.dataTypes.Integer> getNumTps();

	/**
	 * Returns the value of the '<em><b>Num Fp</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.Integer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Num Fp</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Num Fp</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getMolecularSequenceQualityRoc_NumFp()
	 * @model containment="true"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='numFP'"
	 * @generated
	 */
	EList<fhiRCore.dataTypes.Integer> getNumFps();

	/**
	 * Returns the value of the '<em><b>Num Fn</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.Integer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Num Fn</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Num Fn</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getMolecularSequenceQualityRoc_NumFn()
	 * @model containment="true"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='numFN'"
	 * @generated
	 */
	EList<fhiRCore.dataTypes.Integer> getNumFns();

	/**
	 * Returns the value of the '<em><b>Precision</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.Decimal}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Precision</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Precision</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getMolecularSequenceQualityRoc_Precision()
	 * @model containment="true"
	 * @generated
	 */
	EList<Decimal> getPrecisions();

	/**
	 * Returns the value of the '<em><b>Sensitivity</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.Decimal}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sensitivity</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sensitivity</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getMolecularSequenceQualityRoc_Sensitivity()
	 * @model containment="true"
	 * @generated
	 */
	EList<Decimal> getSensitivities();

	/**
	 * Returns the value of the '<em><b>FMeasure</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.Decimal}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>FMeasure</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>FMeasure</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getMolecularSequenceQualityRoc_FMeasure()
	 * @model containment="true"
	 * @generated
	 */
	EList<Decimal> getFMeasures();

} // MolecularSequenceQualityRoc
