/**
 */
package fhiRCore.dataTypes;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Prod Characteristic</b></em>'.
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
 *   <li>{@link fhiRCore.dataTypes.ProdCharacteristic#getHeight <em>Height</em>}</li>
 *   <li>{@link fhiRCore.dataTypes.ProdCharacteristic#getWidth <em>Width</em>}</li>
 *   <li>{@link fhiRCore.dataTypes.ProdCharacteristic#getDepth <em>Depth</em>}</li>
 *   <li>{@link fhiRCore.dataTypes.ProdCharacteristic#getWeight <em>Weight</em>}</li>
 *   <li>{@link fhiRCore.dataTypes.ProdCharacteristic#getNominalVolume <em>Nominal Volume</em>}</li>
 *   <li>{@link fhiRCore.dataTypes.ProdCharacteristic#getExternalDiameter <em>External Diameter</em>}</li>
 *   <li>{@link fhiRCore.dataTypes.ProdCharacteristic#getShape <em>Shape</em>}</li>
 *   <li>{@link fhiRCore.dataTypes.ProdCharacteristic#getColors <em>Color</em>}</li>
 *   <li>{@link fhiRCore.dataTypes.ProdCharacteristic#getImprints <em>Imprint</em>}</li>
 *   <li>{@link fhiRCore.dataTypes.ProdCharacteristic#getImages <em>Image</em>}</li>
 *   <li>{@link fhiRCore.dataTypes.ProdCharacteristic#getScoring <em>Scoring</em>}</li>
 * </ul>
 *
 * @see fhiRCore.dataTypes.DataTypesPackage#getProdCharacteristic()
 * @model
 * @generated
 */
public interface ProdCharacteristic extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Height</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Height</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Height</em>' containment reference.
	 * @see #setHeight(Quantity)
	 * @see fhiRCore.dataTypes.DataTypesPackage#getProdCharacteristic_Height()
	 * @model containment="true"
	 * @generated
	 */
	Quantity getHeight();

	/**
	 * Sets the value of the '{@link fhiRCore.dataTypes.ProdCharacteristic#getHeight <em>Height</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Height</em>' containment reference.
	 * @see #getHeight()
	 * @generated
	 */
	void setHeight(Quantity value);

	/**
	 * Returns the value of the '<em><b>Width</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Width</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Width</em>' containment reference.
	 * @see #setWidth(Quantity)
	 * @see fhiRCore.dataTypes.DataTypesPackage#getProdCharacteristic_Width()
	 * @model containment="true"
	 * @generated
	 */
	Quantity getWidth();

	/**
	 * Sets the value of the '{@link fhiRCore.dataTypes.ProdCharacteristic#getWidth <em>Width</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Width</em>' containment reference.
	 * @see #getWidth()
	 * @generated
	 */
	void setWidth(Quantity value);

	/**
	 * Returns the value of the '<em><b>Depth</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Depth</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Depth</em>' containment reference.
	 * @see #setDepth(Quantity)
	 * @see fhiRCore.dataTypes.DataTypesPackage#getProdCharacteristic_Depth()
	 * @model containment="true"
	 * @generated
	 */
	Quantity getDepth();

	/**
	 * Sets the value of the '{@link fhiRCore.dataTypes.ProdCharacteristic#getDepth <em>Depth</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Depth</em>' containment reference.
	 * @see #getDepth()
	 * @generated
	 */
	void setDepth(Quantity value);

	/**
	 * Returns the value of the '<em><b>Weight</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Weight</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Weight</em>' containment reference.
	 * @see #setWeight(Quantity)
	 * @see fhiRCore.dataTypes.DataTypesPackage#getProdCharacteristic_Weight()
	 * @model containment="true"
	 * @generated
	 */
	Quantity getWeight();

	/**
	 * Sets the value of the '{@link fhiRCore.dataTypes.ProdCharacteristic#getWeight <em>Weight</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Weight</em>' containment reference.
	 * @see #getWeight()
	 * @generated
	 */
	void setWeight(Quantity value);

	/**
	 * Returns the value of the '<em><b>Nominal Volume</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nominal Volume</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nominal Volume</em>' containment reference.
	 * @see #setNominalVolume(Quantity)
	 * @see fhiRCore.dataTypes.DataTypesPackage#getProdCharacteristic_NominalVolume()
	 * @model containment="true"
	 * @generated
	 */
	Quantity getNominalVolume();

	/**
	 * Sets the value of the '{@link fhiRCore.dataTypes.ProdCharacteristic#getNominalVolume <em>Nominal Volume</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nominal Volume</em>' containment reference.
	 * @see #getNominalVolume()
	 * @generated
	 */
	void setNominalVolume(Quantity value);

	/**
	 * Returns the value of the '<em><b>External Diameter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>External Diameter</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>External Diameter</em>' containment reference.
	 * @see #setExternalDiameter(Quantity)
	 * @see fhiRCore.dataTypes.DataTypesPackage#getProdCharacteristic_ExternalDiameter()
	 * @model containment="true"
	 * @generated
	 */
	Quantity getExternalDiameter();

	/**
	 * Sets the value of the '{@link fhiRCore.dataTypes.ProdCharacteristic#getExternalDiameter <em>External Diameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>External Diameter</em>' containment reference.
	 * @see #getExternalDiameter()
	 * @generated
	 */
	void setExternalDiameter(Quantity value);

	/**
	 * Returns the value of the '<em><b>Shape</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shape</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shape</em>' containment reference.
	 * @see #setShape(fhiRCore.dataTypes.String)
	 * @see fhiRCore.dataTypes.DataTypesPackage#getProdCharacteristic_Shape()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getShape();

	/**
	 * Sets the value of the '{@link fhiRCore.dataTypes.ProdCharacteristic#getShape <em>Shape</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shape</em>' containment reference.
	 * @see #getShape()
	 * @generated
	 */
	void setShape(fhiRCore.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Color</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Color</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Color</em>' containment reference list.
	 * @see fhiRCore.dataTypes.DataTypesPackage#getProdCharacteristic_Color()
	 * @model containment="true"
	 * @generated
	 */
	EList<fhiRCore.dataTypes.String> getColors();

	/**
	 * Returns the value of the '<em><b>Imprint</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Imprint</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imprint</em>' containment reference list.
	 * @see fhiRCore.dataTypes.DataTypesPackage#getProdCharacteristic_Imprint()
	 * @model containment="true"
	 * @generated
	 */
	EList<fhiRCore.dataTypes.String> getImprints();

	/**
	 * Returns the value of the '<em><b>Image</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.Attachment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Image</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Image</em>' containment reference list.
	 * @see fhiRCore.dataTypes.DataTypesPackage#getProdCharacteristic_Image()
	 * @model containment="true"
	 * @generated
	 */
	EList<Attachment> getImages();

	/**
	 * Returns the value of the '<em><b>Scoring</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scoring</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scoring</em>' containment reference.
	 * @see #setScoring(CodeableConcept)
	 * @see fhiRCore.dataTypes.DataTypesPackage#getProdCharacteristic_Scoring()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getScoring();

	/**
	 * Sets the value of the '{@link fhiRCore.dataTypes.ProdCharacteristic#getScoring <em>Scoring</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scoring</em>' containment reference.
	 * @see #getScoring()
	 * @generated
	 */
	void setScoring(CodeableConcept value);

} // ProdCharacteristic
