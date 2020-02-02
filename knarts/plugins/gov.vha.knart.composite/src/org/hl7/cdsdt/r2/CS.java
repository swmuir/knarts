/**
 */
package org.hl7.cdsdt.r2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Coded data in its simplest form, where only the code is not predetermined. 
 * 
 * The code system and code system version are implied and fixed by the context in which the CS value occurs.  
 * 
 * Due to its highly restricted functionality, CS SHALL only be used for simple structural attributes with highly controlled and stable terminologies where:
 * - all codes come from a single code system
 * - codes are not reused if their concept is deprecated
 * - the publication and extensibility properties of the code system are well described and understood
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.cdsdt.r2.CS#getCode <em>Code</em>}</li>
 * </ul>
 *
 * @see org.hl7.cdsdt.r2.R2Package#getCS()
 * @model extendedMetaData="name='CS' kind='empty'"
 * @generated
 */
public interface CS extends ANY {
	/**
	 * Returns the value of the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The plain code symbol defined by the code system.  If the code value is empty or null, then there is no code in the code system that represents the concept.
	 * Code SHALL only contain characters that are either a letter, a digit, or one of '.', '-', '_' or ':'. Code systems that are used with CS SHALL NOT define code symbols or expression syntaxes that contain whitespace or any other characters not in this list.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Code</em>' attribute.
	 * @see #setCode(String)
	 * @see org.hl7.cdsdt.r2.R2Package#getCS_Code()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='code'"
	 * @generated
	 */
	String getCode();

	/**
	 * Sets the value of the '{@link org.hl7.cdsdt.r2.CS#getCode <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' attribute.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(String value);

} // CS
