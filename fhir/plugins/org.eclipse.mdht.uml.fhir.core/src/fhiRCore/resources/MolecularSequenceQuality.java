/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.BackboneElement;
import fhiRCore.dataTypes.Code;
import fhiRCore.dataTypes.CodeableConcept;
import fhiRCore.dataTypes.Decimal;
import fhiRCore.dataTypes.Quantity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Molecular Sequence Quality</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.MolecularSequenceQuality#getType <em>Type</em>}</li>
 *   <li>{@link fhiRCore.resources.MolecularSequenceQuality#getStandardSequence <em>Standard Sequence</em>}</li>
 *   <li>{@link fhiRCore.resources.MolecularSequenceQuality#getStart <em>Start</em>}</li>
 *   <li>{@link fhiRCore.resources.MolecularSequenceQuality#getEnd <em>End</em>}</li>
 *   <li>{@link fhiRCore.resources.MolecularSequenceQuality#getScore <em>Score</em>}</li>
 *   <li>{@link fhiRCore.resources.MolecularSequenceQuality#getMethod <em>Method</em>}</li>
 *   <li>{@link fhiRCore.resources.MolecularSequenceQuality#getTruthTp <em>Truth Tp</em>}</li>
 *   <li>{@link fhiRCore.resources.MolecularSequenceQuality#getQueryTp <em>Query Tp</em>}</li>
 *   <li>{@link fhiRCore.resources.MolecularSequenceQuality#getTruthFn <em>Truth Fn</em>}</li>
 *   <li>{@link fhiRCore.resources.MolecularSequenceQuality#getQueryFp <em>Query Fp</em>}</li>
 *   <li>{@link fhiRCore.resources.MolecularSequenceQuality#getGtFp <em>Gt Fp</em>}</li>
 *   <li>{@link fhiRCore.resources.MolecularSequenceQuality#getPrecision <em>Precision</em>}</li>
 *   <li>{@link fhiRCore.resources.MolecularSequenceQuality#getRecall <em>Recall</em>}</li>
 *   <li>{@link fhiRCore.resources.MolecularSequenceQuality#getFScore <em>FScore</em>}</li>
 *   <li>{@link fhiRCore.resources.MolecularSequenceQuality#getRoc <em>Roc</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getMolecularSequenceQuality()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='MolecularSequence_Quality'"
 * @generated
 */
public interface MolecularSequenceQuality extends BackboneElement {
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
	 * @see fhiRCore.resources.ResourcesPackage#getMolecularSequenceQuality_Type()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Code getType();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.MolecularSequenceQuality#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(Code value);

	/**
	 * Returns the value of the '<em><b>Standard Sequence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Standard Sequence</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Standard Sequence</em>' containment reference.
	 * @see #setStandardSequence(CodeableConcept)
	 * @see fhiRCore.resources.ResourcesPackage#getMolecularSequenceQuality_StandardSequence()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getStandardSequence();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.MolecularSequenceQuality#getStandardSequence <em>Standard Sequence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Standard Sequence</em>' containment reference.
	 * @see #getStandardSequence()
	 * @generated
	 */
	void setStandardSequence(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start</em>' containment reference.
	 * @see #setStart(fhiRCore.dataTypes.Integer)
	 * @see fhiRCore.resources.ResourcesPackage#getMolecularSequenceQuality_Start()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.Integer getStart();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.MolecularSequenceQuality#getStart <em>Start</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start</em>' containment reference.
	 * @see #getStart()
	 * @generated
	 */
	void setStart(fhiRCore.dataTypes.Integer value);

	/**
	 * Returns the value of the '<em><b>End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End</em>' containment reference.
	 * @see #setEnd(fhiRCore.dataTypes.Integer)
	 * @see fhiRCore.resources.ResourcesPackage#getMolecularSequenceQuality_End()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.Integer getEnd();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.MolecularSequenceQuality#getEnd <em>End</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End</em>' containment reference.
	 * @see #getEnd()
	 * @generated
	 */
	void setEnd(fhiRCore.dataTypes.Integer value);

	/**
	 * Returns the value of the '<em><b>Score</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Score</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Score</em>' containment reference.
	 * @see #setScore(Quantity)
	 * @see fhiRCore.resources.ResourcesPackage#getMolecularSequenceQuality_Score()
	 * @model containment="true"
	 * @generated
	 */
	Quantity getScore();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.MolecularSequenceQuality#getScore <em>Score</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Score</em>' containment reference.
	 * @see #getScore()
	 * @generated
	 */
	void setScore(Quantity value);

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
	 * @see fhiRCore.resources.ResourcesPackage#getMolecularSequenceQuality_Method()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getMethod();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.MolecularSequenceQuality#getMethod <em>Method</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Method</em>' containment reference.
	 * @see #getMethod()
	 * @generated
	 */
	void setMethod(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Truth Tp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Truth Tp</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Truth Tp</em>' containment reference.
	 * @see #setTruthTp(Decimal)
	 * @see fhiRCore.resources.ResourcesPackage#getMolecularSequenceQuality_TruthTp()
	 * @model containment="true"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='truthTP'"
	 * @generated
	 */
	Decimal getTruthTp();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.MolecularSequenceQuality#getTruthTp <em>Truth Tp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Truth Tp</em>' containment reference.
	 * @see #getTruthTp()
	 * @generated
	 */
	void setTruthTp(Decimal value);

	/**
	 * Returns the value of the '<em><b>Query Tp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Query Tp</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Query Tp</em>' containment reference.
	 * @see #setQueryTp(Decimal)
	 * @see fhiRCore.resources.ResourcesPackage#getMolecularSequenceQuality_QueryTp()
	 * @model containment="true"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='queryTP'"
	 * @generated
	 */
	Decimal getQueryTp();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.MolecularSequenceQuality#getQueryTp <em>Query Tp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Query Tp</em>' containment reference.
	 * @see #getQueryTp()
	 * @generated
	 */
	void setQueryTp(Decimal value);

	/**
	 * Returns the value of the '<em><b>Truth Fn</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Truth Fn</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Truth Fn</em>' containment reference.
	 * @see #setTruthFn(Decimal)
	 * @see fhiRCore.resources.ResourcesPackage#getMolecularSequenceQuality_TruthFn()
	 * @model containment="true"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='truthFN'"
	 * @generated
	 */
	Decimal getTruthFn();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.MolecularSequenceQuality#getTruthFn <em>Truth Fn</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Truth Fn</em>' containment reference.
	 * @see #getTruthFn()
	 * @generated
	 */
	void setTruthFn(Decimal value);

	/**
	 * Returns the value of the '<em><b>Query Fp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Query Fp</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Query Fp</em>' containment reference.
	 * @see #setQueryFp(Decimal)
	 * @see fhiRCore.resources.ResourcesPackage#getMolecularSequenceQuality_QueryFp()
	 * @model containment="true"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='queryFP'"
	 * @generated
	 */
	Decimal getQueryFp();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.MolecularSequenceQuality#getQueryFp <em>Query Fp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Query Fp</em>' containment reference.
	 * @see #getQueryFp()
	 * @generated
	 */
	void setQueryFp(Decimal value);

	/**
	 * Returns the value of the '<em><b>Gt Fp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gt Fp</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gt Fp</em>' containment reference.
	 * @see #setGtFp(Decimal)
	 * @see fhiRCore.resources.ResourcesPackage#getMolecularSequenceQuality_GtFp()
	 * @model containment="true"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='gtFP'"
	 * @generated
	 */
	Decimal getGtFp();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.MolecularSequenceQuality#getGtFp <em>Gt Fp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gt Fp</em>' containment reference.
	 * @see #getGtFp()
	 * @generated
	 */
	void setGtFp(Decimal value);

	/**
	 * Returns the value of the '<em><b>Precision</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Precision</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Precision</em>' containment reference.
	 * @see #setPrecision(Decimal)
	 * @see fhiRCore.resources.ResourcesPackage#getMolecularSequenceQuality_Precision()
	 * @model containment="true"
	 * @generated
	 */
	Decimal getPrecision();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.MolecularSequenceQuality#getPrecision <em>Precision</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Precision</em>' containment reference.
	 * @see #getPrecision()
	 * @generated
	 */
	void setPrecision(Decimal value);

	/**
	 * Returns the value of the '<em><b>Recall</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Recall</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Recall</em>' containment reference.
	 * @see #setRecall(Decimal)
	 * @see fhiRCore.resources.ResourcesPackage#getMolecularSequenceQuality_Recall()
	 * @model containment="true"
	 * @generated
	 */
	Decimal getRecall();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.MolecularSequenceQuality#getRecall <em>Recall</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Recall</em>' containment reference.
	 * @see #getRecall()
	 * @generated
	 */
	void setRecall(Decimal value);

	/**
	 * Returns the value of the '<em><b>FScore</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>FScore</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>FScore</em>' containment reference.
	 * @see #setFScore(Decimal)
	 * @see fhiRCore.resources.ResourcesPackage#getMolecularSequenceQuality_FScore()
	 * @model containment="true"
	 * @generated
	 */
	Decimal getFScore();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.MolecularSequenceQuality#getFScore <em>FScore</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>FScore</em>' containment reference.
	 * @see #getFScore()
	 * @generated
	 */
	void setFScore(Decimal value);

	/**
	 * Returns the value of the '<em><b>Roc</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Roc</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Roc</em>' containment reference.
	 * @see #setRoc(MolecularSequenceQualityRoc)
	 * @see fhiRCore.resources.ResourcesPackage#getMolecularSequenceQuality_Roc()
	 * @model containment="true"
	 * @generated
	 */
	MolecularSequenceQualityRoc getRoc();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.MolecularSequenceQuality#getRoc <em>Roc</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Roc</em>' containment reference.
	 * @see #getRoc()
	 * @generated
	 */
	void setRoc(MolecularSequenceQualityRoc value);

} // MolecularSequenceQuality
