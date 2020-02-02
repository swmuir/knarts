/**
 */
package org.hl7.cdsdt.r2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IVLPQ</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A set of consecutive values of an ordered base datatype. 
 * 
 * Any ordered type can be the basis of an IVL; it does not matter whether the base type is discrete or continuous. If the base datatype is only partially ordered, all elements of the IVL must be elements of a totally ordered subset of the partially ordered datatype. For example, PQ is considered ordered. However the ordering of PQs is only partial; a total order is only defined among comparable quantities (quantities of the same physical dimension). While IVLs between 2 and 4 meter exists, there is no IVL between 2 meters and 4 seconds.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.cdsdt.r2.IVLPQ#getLow <em>Low</em>}</li>
 *   <li>{@link org.hl7.cdsdt.r2.IVLPQ#getHigh <em>High</em>}</li>
 *   <li>{@link org.hl7.cdsdt.r2.IVLPQ#isHighClosed <em>High Closed</em>}</li>
 *   <li>{@link org.hl7.cdsdt.r2.IVLPQ#isLowClosed <em>Low Closed</em>}</li>
 * </ul>
 *
 * @see org.hl7.cdsdt.r2.R2Package#getIVLPQ()
 * @model extendedMetaData="name='IVL_PQ' kind='elementOnly'"
 * @generated
 */
public interface IVLPQ extends IVL {
	/**
	 * Returns the value of the '<em><b>Low</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the low limit. If the low limit is not known, it may be null.
	 * The low limit SHALL NOT be positive infinity.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Low</em>' containment reference.
	 * @see #setLow(PQ)
	 * @see org.hl7.cdsdt.r2.R2Package#getIVLPQ_Low()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='low' namespace='##targetNamespace'"
	 * @generated
	 */
	PQ getLow();

	/**
	 * Sets the value of the '{@link org.hl7.cdsdt.r2.IVLPQ#getLow <em>Low</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Low</em>' containment reference.
	 * @see #getLow()
	 * @generated
	 */
	void setLow(PQ value);

	/**
	 * Returns the value of the '<em><b>High</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the high limit. If the high limit is not known, it may be null.
	 * The high limit SHALL NOT be negative infinity, and SHALL be higher than the low limit if one exists.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>High</em>' containment reference.
	 * @see #setHigh(PQ)
	 * @see org.hl7.cdsdt.r2.R2Package#getIVLPQ_High()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='high' namespace='##targetNamespace'"
	 * @generated
	 */
	PQ getHigh();

	/**
	 * Sets the value of the '{@link org.hl7.cdsdt.r2.IVLPQ#getHigh <em>High</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>High</em>' containment reference.
	 * @see #getHigh()
	 * @generated
	 */
	void setHigh(PQ value);

	/**
	 * Returns the value of the '<em><b>High Closed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether high is included in the IVL (is closed) or excluded from the IVL (is open).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>High Closed</em>' attribute.
	 * @see #isSetHighClosed()
	 * @see #unsetHighClosed()
	 * @see #setHighClosed(boolean)
	 * @see org.hl7.cdsdt.r2.R2Package#getIVLPQ_HighClosed()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='highClosed'"
	 * @generated
	 */
	boolean isHighClosed();

	/**
	 * Sets the value of the '{@link org.hl7.cdsdt.r2.IVLPQ#isHighClosed <em>High Closed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>High Closed</em>' attribute.
	 * @see #isSetHighClosed()
	 * @see #unsetHighClosed()
	 * @see #isHighClosed()
	 * @generated
	 */
	void setHighClosed(boolean value);

	/**
	 * Unsets the value of the '{@link org.hl7.cdsdt.r2.IVLPQ#isHighClosed <em>High Closed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetHighClosed()
	 * @see #isHighClosed()
	 * @see #setHighClosed(boolean)
	 * @generated
	 */
	void unsetHighClosed();

	/**
	 * Returns whether the value of the '{@link org.hl7.cdsdt.r2.IVLPQ#isHighClosed <em>High Closed</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>High Closed</em>' attribute is set.
	 * @see #unsetHighClosed()
	 * @see #isHighClosed()
	 * @see #setHighClosed(boolean)
	 * @generated
	 */
	boolean isSetHighClosed();

	/**
	 * Returns the value of the '<em><b>Low Closed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This attribute is called lowIsClosed in the ISO 21090 specification and lowClosed in the HL7 Data Types R2 specification.
	 * 
	 * Whether low is included in the IVL (is closed) or excluded from the IVL (is open).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Low Closed</em>' attribute.
	 * @see #isSetLowClosed()
	 * @see #unsetLowClosed()
	 * @see #setLowClosed(boolean)
	 * @see org.hl7.cdsdt.r2.R2Package#getIVLPQ_LowClosed()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='lowClosed'"
	 * @generated
	 */
	boolean isLowClosed();

	/**
	 * Sets the value of the '{@link org.hl7.cdsdt.r2.IVLPQ#isLowClosed <em>Low Closed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Low Closed</em>' attribute.
	 * @see #isSetLowClosed()
	 * @see #unsetLowClosed()
	 * @see #isLowClosed()
	 * @generated
	 */
	void setLowClosed(boolean value);

	/**
	 * Unsets the value of the '{@link org.hl7.cdsdt.r2.IVLPQ#isLowClosed <em>Low Closed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLowClosed()
	 * @see #isLowClosed()
	 * @see #setLowClosed(boolean)
	 * @generated
	 */
	void unsetLowClosed();

	/**
	 * Returns whether the value of the '{@link org.hl7.cdsdt.r2.IVLPQ#isLowClosed <em>Low Closed</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Low Closed</em>' attribute is set.
	 * @see #unsetLowClosed()
	 * @see #isLowClosed()
	 * @see #setLowClosed(boolean)
	 * @generated
	 */
	boolean isSetLowClosed();

} // IVLPQ
