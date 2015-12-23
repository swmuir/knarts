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
 * A representation of the model object '<em><b>Sampled Data</b></em>'.
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
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.datatype.SampledData#getOrigin <em>Origin</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.datatype.SampledData#getPeriod <em>Period</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.datatype.SampledData#getFactor <em>Factor</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.datatype.SampledData#getLowerLimit <em>Lower Limit</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.datatype.SampledData#getUpperLimit <em>Upper Limit</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.datatype.SampledData#getDimensions <em>Dimensions</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.datatype.SampledData#getData <em>Data</em>}</li>
 * </ul>
 *
 * @see org.eclipse.mdht.uml.fhir.core.datatype.FhirDatatypePackage#getSampledData()
 * @model
 * @generated
 */
public interface SampledData extends DataType {
	/**
	 * Returns the value of the '<em><b>Origin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Origin</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Origin</em>' reference.
	 * @see #setOrigin(SimpleQuantity)
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.FhirDatatypePackage#getSampledData_Origin()
	 * @model required="true"
	 * @generated
	 */
	SimpleQuantity getOrigin();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.datatype.SampledData#getOrigin <em>Origin</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Origin</em>' reference.
	 * @see #getOrigin()
	 * @generated
	 */
	void setOrigin(SimpleQuantity value);

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
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.FhirDatatypePackage#getSampledData_Period()
	 * @model required="true"
	 * @generated
	 */
	Decimal getPeriod();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.datatype.SampledData#getPeriod <em>Period</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Period</em>' reference.
	 * @see #getPeriod()
	 * @generated
	 */
	void setPeriod(Decimal value);

	/**
	 * Returns the value of the '<em><b>Factor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Factor</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Factor</em>' reference.
	 * @see #setFactor(Decimal)
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.FhirDatatypePackage#getSampledData_Factor()
	 * @model
	 * @generated
	 */
	Decimal getFactor();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.datatype.SampledData#getFactor <em>Factor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Factor</em>' reference.
	 * @see #getFactor()
	 * @generated
	 */
	void setFactor(Decimal value);

	/**
	 * Returns the value of the '<em><b>Lower Limit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lower Limit</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lower Limit</em>' reference.
	 * @see #setLowerLimit(Decimal)
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.FhirDatatypePackage#getSampledData_LowerLimit()
	 * @model
	 * @generated
	 */
	Decimal getLowerLimit();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.datatype.SampledData#getLowerLimit <em>Lower Limit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lower Limit</em>' reference.
	 * @see #getLowerLimit()
	 * @generated
	 */
	void setLowerLimit(Decimal value);

	/**
	 * Returns the value of the '<em><b>Upper Limit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Upper Limit</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Upper Limit</em>' reference.
	 * @see #setUpperLimit(Decimal)
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.FhirDatatypePackage#getSampledData_UpperLimit()
	 * @model
	 * @generated
	 */
	Decimal getUpperLimit();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.datatype.SampledData#getUpperLimit <em>Upper Limit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Upper Limit</em>' reference.
	 * @see #getUpperLimit()
	 * @generated
	 */
	void setUpperLimit(Decimal value);

	/**
	 * Returns the value of the '<em><b>Dimensions</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dimensions</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dimensions</em>' reference.
	 * @see #setDimensions(PositiveInt)
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.FhirDatatypePackage#getSampledData_Dimensions()
	 * @model required="true"
	 * @generated
	 */
	PositiveInt getDimensions();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.datatype.SampledData#getDimensions <em>Dimensions</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dimensions</em>' reference.
	 * @see #getDimensions()
	 * @generated
	 */
	void setDimensions(PositiveInt value);

	/**
	 * Returns the value of the '<em><b>Data</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data</em>' reference.
	 * @see #setData(org.eclipse.mdht.uml.fhir.core.datatype.String)
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.FhirDatatypePackage#getSampledData_Data()
	 * @model required="true"
	 * @generated
	 */
	org.eclipse.mdht.uml.fhir.core.datatype.String getData();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.datatype.SampledData#getData <em>Data</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data</em>' reference.
	 * @see #getData()
	 * @generated
	 */
	void setData(org.eclipse.mdht.uml.fhir.core.datatype.String value);

} // SampledData
