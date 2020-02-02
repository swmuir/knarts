/**
 */
package org.hl7.cdsdt.r2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PIVLTS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An interval of time that recurs periodically. PIVL has two properties, phase and period/frequency. phase specifies the "interval prototype" that is repeated on the period/frequency.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.cdsdt.r2.PIVLTS#getPhase <em>Phase</em>}</li>
 *   <li>{@link org.hl7.cdsdt.r2.PIVLTS#getPeriod <em>Period</em>}</li>
 *   <li>{@link org.hl7.cdsdt.r2.PIVLTS#getFrequency <em>Frequency</em>}</li>
 *   <li>{@link org.hl7.cdsdt.r2.PIVLTS#getCount <em>Count</em>}</li>
 *   <li>{@link org.hl7.cdsdt.r2.PIVLTS#getAlignment <em>Alignment</em>}</li>
 *   <li>{@link org.hl7.cdsdt.r2.PIVLTS#isIsFlexible <em>Is Flexible</em>}</li>
 * </ul>
 *
 * @see org.hl7.cdsdt.r2.R2Package#getPIVLTS()
 * @model extendedMetaData="name='PIVL_TS' kind='elementOnly'"
 * @generated
 */
public interface PIVLTS extends QTY {
	/**
	 * Returns the value of the '<em><b>Phase</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A prototype of the repeating interval, specifying the duration of each occurrence and anchors the PIVL sequence at a certain point in time. phase also marks the anchor point in time for the entire series of periodically recurring intervals. If count is null or nullFlavored, the recurrence of a PIVL has no beginning or ending, but is infinite in both future and past. 
	 * 
	 * The width of the phase SHALL be less than or equal to the period
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Phase</em>' containment reference.
	 * @see #setPhase(IVLTS)
	 * @see org.hl7.cdsdt.r2.R2Package#getPIVLTS_Phase()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='phase' namespace='##targetNamespace'"
	 * @generated
	 */
	IVLTS getPhase();

	/**
	 * Sets the value of the '{@link org.hl7.cdsdt.r2.PIVLTS#getPhase <em>Phase</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Phase</em>' containment reference.
	 * @see #getPhase()
	 * @generated
	 */
	void setPhase(IVLTS value);

	/**
	 * Returns the value of the '<em><b>Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A time duration specified as a reciprocal measure of the frequency at which the PIVL repeats.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Period</em>' containment reference.
	 * @see #setPeriod(PQ)
	 * @see org.hl7.cdsdt.r2.R2Package#getPIVLTS_Period()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='period' namespace='##targetNamespace'"
	 * @generated
	 */
	PQ getPeriod();

	/**
	 * Sets the value of the '{@link org.hl7.cdsdt.r2.PIVLTS#getPeriod <em>Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Period</em>' containment reference.
	 * @see #getPeriod()
	 * @generated
	 */
	void setPeriod(PQ value);

	/**
	 * Returns the value of the '<em><b>Frequency</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The number of times the PIVL repeats (numerator) within a specified time-period (denominator). The numerator is an integer, and the denominator is a PQ.TIME.
	 * 
	 * Only one of period and frequency should be specified. The form chosen should be the form that most naturally conveys the idea to humans. i.e. Every 10 mins (period) or twice a day (frequency).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Frequency</em>' containment reference.
	 * @see #setFrequency(RTO)
	 * @see org.hl7.cdsdt.r2.R2Package#getPIVLTS_Frequency()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='frequency' namespace='##targetNamespace'"
	 * @generated
	 */
	RTO getFrequency();

	/**
	 * Sets the value of the '{@link org.hl7.cdsdt.r2.PIVLTS#getFrequency <em>Frequency</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Frequency</em>' containment reference.
	 * @see #getFrequency()
	 * @generated
	 */
	void setFrequency(RTO value);

	/**
	 * Returns the value of the '<em><b>Count</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The number of times the period repeats in total. If count is null, then the period repeats indefinitely both before and after the anchor implicit in the phase.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Count</em>' containment reference.
	 * @see #setCount(INT)
	 * @see org.hl7.cdsdt.r2.R2Package#getPIVLTS_Count()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='count' namespace='##targetNamespace'"
	 * @generated
	 */
	INT getCount();

	/**
	 * Sets the value of the '{@link org.hl7.cdsdt.r2.PIVLTS#getCount <em>Count</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Count</em>' containment reference.
	 * @see #getCount()
	 * @generated
	 */
	void setCount(INT value);

	/**
	 * Returns the value of the '<em><b>Alignment</b></em>' attribute.
	 * The literals are from the enumeration {@link org.hl7.cdsdt.r2.CalendarCycle}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alignment</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alignment</em>' attribute.
	 * @see org.hl7.cdsdt.r2.CalendarCycle
	 * @see #isSetAlignment()
	 * @see #unsetAlignment()
	 * @see #setAlignment(CalendarCycle)
	 * @see org.hl7.cdsdt.r2.R2Package#getPIVLTS_Alignment()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='alignment'"
	 * @generated
	 */
	CalendarCycle getAlignment();

	/**
	 * Sets the value of the '{@link org.hl7.cdsdt.r2.PIVLTS#getAlignment <em>Alignment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alignment</em>' attribute.
	 * @see org.hl7.cdsdt.r2.CalendarCycle
	 * @see #isSetAlignment()
	 * @see #unsetAlignment()
	 * @see #getAlignment()
	 * @generated
	 */
	void setAlignment(CalendarCycle value);

	/**
	 * Unsets the value of the '{@link org.hl7.cdsdt.r2.PIVLTS#getAlignment <em>Alignment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAlignment()
	 * @see #getAlignment()
	 * @see #setAlignment(CalendarCycle)
	 * @generated
	 */
	void unsetAlignment();

	/**
	 * Returns whether the value of the '{@link org.hl7.cdsdt.r2.PIVLTS#getAlignment <em>Alignment</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Alignment</em>' attribute is set.
	 * @see #unsetAlignment()
	 * @see #getAlignment()
	 * @see #setAlignment(CalendarCycle)
	 * @generated
	 */
	boolean isSetAlignment();

	/**
	 * Returns the value of the '<em><b>Is Flexible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates whether the exact timing is up to the party executing the schedule e.g., to distinguish "every 8 hours" from "3 times a day".
	 * 
	 * Note: this is sometimes referred to as "institution specified timing".
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Flexible</em>' attribute.
	 * @see #isSetIsFlexible()
	 * @see #unsetIsFlexible()
	 * @see #setIsFlexible(boolean)
	 * @see org.hl7.cdsdt.r2.R2Package#getPIVLTS_IsFlexible()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='isFlexible'"
	 * @generated
	 */
	boolean isIsFlexible();

	/**
	 * Sets the value of the '{@link org.hl7.cdsdt.r2.PIVLTS#isIsFlexible <em>Is Flexible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Flexible</em>' attribute.
	 * @see #isSetIsFlexible()
	 * @see #unsetIsFlexible()
	 * @see #isIsFlexible()
	 * @generated
	 */
	void setIsFlexible(boolean value);

	/**
	 * Unsets the value of the '{@link org.hl7.cdsdt.r2.PIVLTS#isIsFlexible <em>Is Flexible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsFlexible()
	 * @see #isIsFlexible()
	 * @see #setIsFlexible(boolean)
	 * @generated
	 */
	void unsetIsFlexible();

	/**
	 * Returns whether the value of the '{@link org.hl7.cdsdt.r2.PIVLTS#isIsFlexible <em>Is Flexible</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Is Flexible</em>' attribute is set.
	 * @see #unsetIsFlexible()
	 * @see #isIsFlexible()
	 * @see #setIsFlexible(boolean)
	 * @generated
	 */
	boolean isSetIsFlexible();

} // PIVLTS
