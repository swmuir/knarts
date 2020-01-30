/**
 */
package fhiRCore.dataTypes;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Human Name</b></em>'.
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
 *   <li>{@link fhiRCore.dataTypes.HumanName#getUse <em>Use</em>}</li>
 *   <li>{@link fhiRCore.dataTypes.HumanName#getText <em>Text</em>}</li>
 *   <li>{@link fhiRCore.dataTypes.HumanName#getFamily <em>Family</em>}</li>
 *   <li>{@link fhiRCore.dataTypes.HumanName#getGivens <em>Given</em>}</li>
 *   <li>{@link fhiRCore.dataTypes.HumanName#getPrefixes <em>Prefix</em>}</li>
 *   <li>{@link fhiRCore.dataTypes.HumanName#getSuffixes <em>Suffix</em>}</li>
 *   <li>{@link fhiRCore.dataTypes.HumanName#getPeriod <em>Period</em>}</li>
 * </ul>
 *
 * @see fhiRCore.dataTypes.DataTypesPackage#getHumanName()
 * @model
 * @generated
 */
public interface HumanName extends DataType {
	/**
	 * Returns the value of the '<em><b>Use</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Use</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Use</em>' containment reference.
	 * @see #setUse(Code)
	 * @see fhiRCore.dataTypes.DataTypesPackage#getHumanName_Use()
	 * @model containment="true"
	 * @generated
	 */
	Code getUse();

	/**
	 * Sets the value of the '{@link fhiRCore.dataTypes.HumanName#getUse <em>Use</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use</em>' containment reference.
	 * @see #getUse()
	 * @generated
	 */
	void setUse(Code value);

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
	 * @see fhiRCore.dataTypes.DataTypesPackage#getHumanName_Text()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getText();

	/**
	 * Sets the value of the '{@link fhiRCore.dataTypes.HumanName#getText <em>Text</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' containment reference.
	 * @see #getText()
	 * @generated
	 */
	void setText(fhiRCore.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Family</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Family</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Family</em>' containment reference.
	 * @see #setFamily(fhiRCore.dataTypes.String)
	 * @see fhiRCore.dataTypes.DataTypesPackage#getHumanName_Family()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getFamily();

	/**
	 * Sets the value of the '{@link fhiRCore.dataTypes.HumanName#getFamily <em>Family</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Family</em>' containment reference.
	 * @see #getFamily()
	 * @generated
	 */
	void setFamily(fhiRCore.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Given</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Given</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Given</em>' containment reference list.
	 * @see fhiRCore.dataTypes.DataTypesPackage#getHumanName_Given()
	 * @model containment="true"
	 * @generated
	 */
	EList<fhiRCore.dataTypes.String> getGivens();

	/**
	 * Returns the value of the '<em><b>Prefix</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prefix</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prefix</em>' containment reference list.
	 * @see fhiRCore.dataTypes.DataTypesPackage#getHumanName_Prefix()
	 * @model containment="true"
	 * @generated
	 */
	EList<fhiRCore.dataTypes.String> getPrefixes();

	/**
	 * Returns the value of the '<em><b>Suffix</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Suffix</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Suffix</em>' containment reference list.
	 * @see fhiRCore.dataTypes.DataTypesPackage#getHumanName_Suffix()
	 * @model containment="true"
	 * @generated
	 */
	EList<fhiRCore.dataTypes.String> getSuffixes();

	/**
	 * Returns the value of the '<em><b>Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Period</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Period</em>' containment reference.
	 * @see #setPeriod(Period)
	 * @see fhiRCore.dataTypes.DataTypesPackage#getHumanName_Period()
	 * @model containment="true"
	 * @generated
	 */
	Period getPeriod();

	/**
	 * Sets the value of the '{@link fhiRCore.dataTypes.HumanName#getPeriod <em>Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Period</em>' containment reference.
	 * @see #getPeriod()
	 * @generated
	 */
	void setPeriod(Period value);

} // HumanName
