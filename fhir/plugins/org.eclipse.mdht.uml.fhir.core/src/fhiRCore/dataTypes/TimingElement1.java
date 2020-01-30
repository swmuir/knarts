/**
 */
package fhiRCore.dataTypes;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Timing Element1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.dataTypes.TimingElement1#getBoundsx <em>Boundsx</em>}</li>
 *   <li>{@link fhiRCore.dataTypes.TimingElement1#getCount <em>Count</em>}</li>
 *   <li>{@link fhiRCore.dataTypes.TimingElement1#getCountMax <em>Count Max</em>}</li>
 *   <li>{@link fhiRCore.dataTypes.TimingElement1#getDuration <em>Duration</em>}</li>
 *   <li>{@link fhiRCore.dataTypes.TimingElement1#getDurationMax <em>Duration Max</em>}</li>
 *   <li>{@link fhiRCore.dataTypes.TimingElement1#getDurationUnit <em>Duration Unit</em>}</li>
 *   <li>{@link fhiRCore.dataTypes.TimingElement1#getFrequency <em>Frequency</em>}</li>
 *   <li>{@link fhiRCore.dataTypes.TimingElement1#getFrequencyMax <em>Frequency Max</em>}</li>
 *   <li>{@link fhiRCore.dataTypes.TimingElement1#getPeriod <em>Period</em>}</li>
 *   <li>{@link fhiRCore.dataTypes.TimingElement1#getPeriodMax <em>Period Max</em>}</li>
 *   <li>{@link fhiRCore.dataTypes.TimingElement1#getPeriodUnit <em>Period Unit</em>}</li>
 *   <li>{@link fhiRCore.dataTypes.TimingElement1#getDayOfWeeks <em>Day Of Week</em>}</li>
 *   <li>{@link fhiRCore.dataTypes.TimingElement1#getTimeOfDaies <em>Time Of Day</em>}</li>
 *   <li>{@link fhiRCore.dataTypes.TimingElement1#getWhens <em>When</em>}</li>
 *   <li>{@link fhiRCore.dataTypes.TimingElement1#getOffset <em>Offset</em>}</li>
 * </ul>
 *
 * @see fhiRCore.dataTypes.DataTypesPackage#getTimingElement1()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Timing_Element1'"
 * @generated
 */
public interface TimingElement1 extends Element {
	/**
	 * Returns the value of the '<em><b>Boundsx</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Boundsx</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Boundsx</em>' containment reference.
	 * @see #setBoundsx(DataType)
	 * @see fhiRCore.dataTypes.DataTypesPackage#getTimingElement1_Boundsx()
	 * @model containment="true"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='bounds[x]'"
	 * @generated
	 */
	DataType getBoundsx();

	/**
	 * Sets the value of the '{@link fhiRCore.dataTypes.TimingElement1#getBoundsx <em>Boundsx</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Boundsx</em>' containment reference.
	 * @see #getBoundsx()
	 * @generated
	 */
	void setBoundsx(DataType value);

	/**
	 * Returns the value of the '<em><b>Count</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Count</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Count</em>' containment reference.
	 * @see #setCount(PositiveInt)
	 * @see fhiRCore.dataTypes.DataTypesPackage#getTimingElement1_Count()
	 * @model containment="true"
	 * @generated
	 */
	PositiveInt getCount();

	/**
	 * Sets the value of the '{@link fhiRCore.dataTypes.TimingElement1#getCount <em>Count</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Count</em>' containment reference.
	 * @see #getCount()
	 * @generated
	 */
	void setCount(PositiveInt value);

	/**
	 * Returns the value of the '<em><b>Count Max</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Count Max</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Count Max</em>' containment reference.
	 * @see #setCountMax(PositiveInt)
	 * @see fhiRCore.dataTypes.DataTypesPackage#getTimingElement1_CountMax()
	 * @model containment="true"
	 * @generated
	 */
	PositiveInt getCountMax();

	/**
	 * Sets the value of the '{@link fhiRCore.dataTypes.TimingElement1#getCountMax <em>Count Max</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Count Max</em>' containment reference.
	 * @see #getCountMax()
	 * @generated
	 */
	void setCountMax(PositiveInt value);

	/**
	 * Returns the value of the '<em><b>Duration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Duration</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duration</em>' containment reference.
	 * @see #setDuration(Decimal)
	 * @see fhiRCore.dataTypes.DataTypesPackage#getTimingElement1_Duration()
	 * @model containment="true"
	 * @generated
	 */
	Decimal getDuration();

	/**
	 * Sets the value of the '{@link fhiRCore.dataTypes.TimingElement1#getDuration <em>Duration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration</em>' containment reference.
	 * @see #getDuration()
	 * @generated
	 */
	void setDuration(Decimal value);

	/**
	 * Returns the value of the '<em><b>Duration Max</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Duration Max</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duration Max</em>' containment reference.
	 * @see #setDurationMax(Decimal)
	 * @see fhiRCore.dataTypes.DataTypesPackage#getTimingElement1_DurationMax()
	 * @model containment="true"
	 * @generated
	 */
	Decimal getDurationMax();

	/**
	 * Sets the value of the '{@link fhiRCore.dataTypes.TimingElement1#getDurationMax <em>Duration Max</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration Max</em>' containment reference.
	 * @see #getDurationMax()
	 * @generated
	 */
	void setDurationMax(Decimal value);

	/**
	 * Returns the value of the '<em><b>Duration Unit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Duration Unit</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duration Unit</em>' containment reference.
	 * @see #setDurationUnit(Code)
	 * @see fhiRCore.dataTypes.DataTypesPackage#getTimingElement1_DurationUnit()
	 * @model containment="true"
	 * @generated
	 */
	Code getDurationUnit();

	/**
	 * Sets the value of the '{@link fhiRCore.dataTypes.TimingElement1#getDurationUnit <em>Duration Unit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration Unit</em>' containment reference.
	 * @see #getDurationUnit()
	 * @generated
	 */
	void setDurationUnit(Code value);

	/**
	 * Returns the value of the '<em><b>Frequency</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Frequency</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Frequency</em>' containment reference.
	 * @see #setFrequency(PositiveInt)
	 * @see fhiRCore.dataTypes.DataTypesPackage#getTimingElement1_Frequency()
	 * @model containment="true"
	 * @generated
	 */
	PositiveInt getFrequency();

	/**
	 * Sets the value of the '{@link fhiRCore.dataTypes.TimingElement1#getFrequency <em>Frequency</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Frequency</em>' containment reference.
	 * @see #getFrequency()
	 * @generated
	 */
	void setFrequency(PositiveInt value);

	/**
	 * Returns the value of the '<em><b>Frequency Max</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Frequency Max</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Frequency Max</em>' containment reference.
	 * @see #setFrequencyMax(PositiveInt)
	 * @see fhiRCore.dataTypes.DataTypesPackage#getTimingElement1_FrequencyMax()
	 * @model containment="true"
	 * @generated
	 */
	PositiveInt getFrequencyMax();

	/**
	 * Sets the value of the '{@link fhiRCore.dataTypes.TimingElement1#getFrequencyMax <em>Frequency Max</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Frequency Max</em>' containment reference.
	 * @see #getFrequencyMax()
	 * @generated
	 */
	void setFrequencyMax(PositiveInt value);

	/**
	 * Returns the value of the '<em><b>Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Period</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Period</em>' containment reference.
	 * @see #setPeriod(Decimal)
	 * @see fhiRCore.dataTypes.DataTypesPackage#getTimingElement1_Period()
	 * @model containment="true"
	 * @generated
	 */
	Decimal getPeriod();

	/**
	 * Sets the value of the '{@link fhiRCore.dataTypes.TimingElement1#getPeriod <em>Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Period</em>' containment reference.
	 * @see #getPeriod()
	 * @generated
	 */
	void setPeriod(Decimal value);

	/**
	 * Returns the value of the '<em><b>Period Max</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Period Max</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Period Max</em>' containment reference.
	 * @see #setPeriodMax(Decimal)
	 * @see fhiRCore.dataTypes.DataTypesPackage#getTimingElement1_PeriodMax()
	 * @model containment="true"
	 * @generated
	 */
	Decimal getPeriodMax();

	/**
	 * Sets the value of the '{@link fhiRCore.dataTypes.TimingElement1#getPeriodMax <em>Period Max</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Period Max</em>' containment reference.
	 * @see #getPeriodMax()
	 * @generated
	 */
	void setPeriodMax(Decimal value);

	/**
	 * Returns the value of the '<em><b>Period Unit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Period Unit</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Period Unit</em>' containment reference.
	 * @see #setPeriodUnit(Code)
	 * @see fhiRCore.dataTypes.DataTypesPackage#getTimingElement1_PeriodUnit()
	 * @model containment="true"
	 * @generated
	 */
	Code getPeriodUnit();

	/**
	 * Sets the value of the '{@link fhiRCore.dataTypes.TimingElement1#getPeriodUnit <em>Period Unit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Period Unit</em>' containment reference.
	 * @see #getPeriodUnit()
	 * @generated
	 */
	void setPeriodUnit(Code value);

	/**
	 * Returns the value of the '<em><b>Day Of Week</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.Code}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Day Of Week</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Day Of Week</em>' containment reference list.
	 * @see fhiRCore.dataTypes.DataTypesPackage#getTimingElement1_DayOfWeek()
	 * @model containment="true"
	 * @generated
	 */
	EList<Code> getDayOfWeeks();

	/**
	 * Returns the value of the '<em><b>Time Of Day</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.Time}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time Of Day</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Of Day</em>' containment reference list.
	 * @see fhiRCore.dataTypes.DataTypesPackage#getTimingElement1_TimeOfDay()
	 * @model containment="true"
	 * @generated
	 */
	EList<Time> getTimeOfDaies();

	/**
	 * Returns the value of the '<em><b>When</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.Code}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>When</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>When</em>' containment reference list.
	 * @see fhiRCore.dataTypes.DataTypesPackage#getTimingElement1_When()
	 * @model containment="true"
	 * @generated
	 */
	EList<Code> getWhens();

	/**
	 * Returns the value of the '<em><b>Offset</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Offset</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Offset</em>' containment reference.
	 * @see #setOffset(UnsignedInt)
	 * @see fhiRCore.dataTypes.DataTypesPackage#getTimingElement1_Offset()
	 * @model containment="true"
	 * @generated
	 */
	UnsignedInt getOffset();

	/**
	 * Sets the value of the '{@link fhiRCore.dataTypes.TimingElement1#getOffset <em>Offset</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Offset</em>' containment reference.
	 * @see #getOffset()
	 * @generated
	 */
	void setOffset(UnsignedInt value);

} // TimingElement1
