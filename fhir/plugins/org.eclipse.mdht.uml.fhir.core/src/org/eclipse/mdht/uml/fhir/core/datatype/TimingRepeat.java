/*******************************************************************************
 * Copyright (c) 2015 David Carlson and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David Carlson (Clinical Cloud Solutions, LLC) - initial API and implementation
 *******************************************************************************/
/**
 */
package org.eclipse.mdht.uml.fhir.core.datatype;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Timing Repeat</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.datatype.TimingRepeat#getBoundsx <em>Boundsx</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.datatype.TimingRepeat#getCount <em>Count</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.datatype.TimingRepeat#getDuration <em>Duration</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.datatype.TimingRepeat#getDurationMax <em>Duration Max</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.datatype.TimingRepeat#getDurationUnits <em>Duration Units</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.datatype.TimingRepeat#getFrequency <em>Frequency</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.datatype.TimingRepeat#getFrequencyMax <em>Frequency Max</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.datatype.TimingRepeat#getPeriod <em>Period</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.datatype.TimingRepeat#getPeriodMax <em>Period Max</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.datatype.TimingRepeat#getPeriodUnits <em>Period Units</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.datatype.TimingRepeat#getWhen <em>When</em>}</li>
 * </ul>
 *
 * @see org.eclipse.mdht.uml.fhir.core.datatype.FhirDatatypePackage#getTimingRepeat()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Timing_Repeat'"
 * @generated
 */
public interface TimingRepeat extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Boundsx</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Boundsx</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Boundsx</em>' reference.
	 * @see #setBoundsx(DataType)
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.FhirDatatypePackage#getTimingRepeat_Boundsx()
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='bounds[x]'"
	 * @generated
	 */
	DataType getBoundsx();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.datatype.TimingRepeat#getBoundsx <em>Boundsx</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Boundsx</em>' reference.
	 * @see #getBoundsx()
	 * @generated
	 */
	void setBoundsx(DataType value);

	/**
	 * Returns the value of the '<em><b>Count</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Count</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Count</em>' reference.
	 * @see #setCount(org.eclipse.mdht.uml.fhir.core.datatype.Integer)
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.FhirDatatypePackage#getTimingRepeat_Count()
	 * @model
	 * @generated
	 */
	org.eclipse.mdht.uml.fhir.core.datatype.Integer getCount();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.datatype.TimingRepeat#getCount <em>Count</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Count</em>' reference.
	 * @see #getCount()
	 * @generated
	 */
	void setCount(org.eclipse.mdht.uml.fhir.core.datatype.Integer value);

	/**
	 * Returns the value of the '<em><b>Duration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Duration</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duration</em>' reference.
	 * @see #setDuration(Decimal)
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.FhirDatatypePackage#getTimingRepeat_Duration()
	 * @model
	 * @generated
	 */
	Decimal getDuration();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.datatype.TimingRepeat#getDuration <em>Duration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration</em>' reference.
	 * @see #getDuration()
	 * @generated
	 */
	void setDuration(Decimal value);

	/**
	 * Returns the value of the '<em><b>Duration Max</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Duration Max</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duration Max</em>' reference.
	 * @see #setDurationMax(Decimal)
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.FhirDatatypePackage#getTimingRepeat_DurationMax()
	 * @model
	 * @generated
	 */
	Decimal getDurationMax();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.datatype.TimingRepeat#getDurationMax <em>Duration Max</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration Max</em>' reference.
	 * @see #getDurationMax()
	 * @generated
	 */
	void setDurationMax(Decimal value);

	/**
	 * Returns the value of the '<em><b>Duration Units</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Duration Units</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duration Units</em>' reference.
	 * @see #setDurationUnits(Code)
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.FhirDatatypePackage#getTimingRepeat_DurationUnits()
	 * @model
	 * @generated
	 */
	Code getDurationUnits();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.datatype.TimingRepeat#getDurationUnits <em>Duration Units</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration Units</em>' reference.
	 * @see #getDurationUnits()
	 * @generated
	 */
	void setDurationUnits(Code value);

	/**
	 * Returns the value of the '<em><b>Frequency</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Frequency</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Frequency</em>' reference.
	 * @see #setFrequency(org.eclipse.mdht.uml.fhir.core.datatype.Integer)
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.FhirDatatypePackage#getTimingRepeat_Frequency()
	 * @model
	 * @generated
	 */
	org.eclipse.mdht.uml.fhir.core.datatype.Integer getFrequency();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.datatype.TimingRepeat#getFrequency <em>Frequency</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Frequency</em>' reference.
	 * @see #getFrequency()
	 * @generated
	 */
	void setFrequency(org.eclipse.mdht.uml.fhir.core.datatype.Integer value);

	/**
	 * Returns the value of the '<em><b>Frequency Max</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Frequency Max</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Frequency Max</em>' reference.
	 * @see #setFrequencyMax(org.eclipse.mdht.uml.fhir.core.datatype.Integer)
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.FhirDatatypePackage#getTimingRepeat_FrequencyMax()
	 * @model
	 * @generated
	 */
	org.eclipse.mdht.uml.fhir.core.datatype.Integer getFrequencyMax();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.datatype.TimingRepeat#getFrequencyMax <em>Frequency Max</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Frequency Max</em>' reference.
	 * @see #getFrequencyMax()
	 * @generated
	 */
	void setFrequencyMax(org.eclipse.mdht.uml.fhir.core.datatype.Integer value);

	/**
	 * Returns the value of the '<em><b>Period</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Period</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Period</em>' reference.
	 * @see #setPeriod(Decimal)
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.FhirDatatypePackage#getTimingRepeat_Period()
	 * @model
	 * @generated
	 */
	Decimal getPeriod();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.datatype.TimingRepeat#getPeriod <em>Period</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Period</em>' reference.
	 * @see #getPeriod()
	 * @generated
	 */
	void setPeriod(Decimal value);

	/**
	 * Returns the value of the '<em><b>Period Max</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Period Max</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Period Max</em>' reference.
	 * @see #setPeriodMax(Decimal)
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.FhirDatatypePackage#getTimingRepeat_PeriodMax()
	 * @model
	 * @generated
	 */
	Decimal getPeriodMax();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.datatype.TimingRepeat#getPeriodMax <em>Period Max</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Period Max</em>' reference.
	 * @see #getPeriodMax()
	 * @generated
	 */
	void setPeriodMax(Decimal value);

	/**
	 * Returns the value of the '<em><b>Period Units</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Period Units</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Period Units</em>' reference.
	 * @see #setPeriodUnits(Code)
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.FhirDatatypePackage#getTimingRepeat_PeriodUnits()
	 * @model
	 * @generated
	 */
	Code getPeriodUnits();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.datatype.TimingRepeat#getPeriodUnits <em>Period Units</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Period Units</em>' reference.
	 * @see #getPeriodUnits()
	 * @generated
	 */
	void setPeriodUnits(Code value);

	/**
	 * Returns the value of the '<em><b>When</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>When</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>When</em>' reference.
	 * @see #setWhen(Code)
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.FhirDatatypePackage#getTimingRepeat_When()
	 * @model
	 * @generated
	 */
	Code getWhen();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.datatype.TimingRepeat#getWhen <em>When</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>When</em>' reference.
	 * @see #getWhen()
	 * @generated
	 */
	void setWhen(Code value);

} // TimingRepeat
