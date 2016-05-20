/*******************************************************************************
 * Copyright (c) 2016 David Carlson and others.
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
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Protocol Step</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A definition of behaviors to be taken in particular circumstances, often including conditions, options and other decision points.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.ProtocolStep#getName <em>Name</em>}</li>
 *   <li>{@link org.hl7.fhir.ProtocolStep#getDescription <em>Description</em>}</li>
 *   <li>{@link org.hl7.fhir.ProtocolStep#getDuration <em>Duration</em>}</li>
 *   <li>{@link org.hl7.fhir.ProtocolStep#getPrecondition <em>Precondition</em>}</li>
 *   <li>{@link org.hl7.fhir.ProtocolStep#getExit <em>Exit</em>}</li>
 *   <li>{@link org.hl7.fhir.ProtocolStep#getFirstActivity <em>First Activity</em>}</li>
 *   <li>{@link org.hl7.fhir.ProtocolStep#getActivity <em>Activity</em>}</li>
 *   <li>{@link org.hl7.fhir.ProtocolStep#getNext <em>Next</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getProtocolStep()
 * @model extendedMetaData="name='Protocol.Step' kind='elementOnly'"
 * @generated
 */
public interface ProtocolStep extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Label for step.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getProtocolStep_Name()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getName();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ProtocolStep#getName <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' containment reference.
	 * @see #getName()
	 * @generated
	 */
	void setName(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Human description of activity.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getProtocolStep_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getDescription();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ProtocolStep#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Duration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * How long does step last?
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Duration</em>' containment reference.
	 * @see #setDuration(Duration)
	 * @see org.hl7.fhir.FhirPackage#getProtocolStep_Duration()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='duration' namespace='##targetNamespace'"
	 * @generated
	 */
	Duration getDuration();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ProtocolStep#getDuration <em>Duration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration</em>' containment reference.
	 * @see #getDuration()
	 * @generated
	 */
	void setDuration(Duration value);

	/**
	 * Returns the value of the '<em><b>Precondition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Rules prior to execution.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Precondition</em>' containment reference.
	 * @see #setPrecondition(ProtocolPrecondition)
	 * @see org.hl7.fhir.FhirPackage#getProtocolStep_Precondition()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='precondition' namespace='##targetNamespace'"
	 * @generated
	 */
	ProtocolPrecondition getPrecondition();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ProtocolStep#getPrecondition <em>Precondition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Precondition</em>' containment reference.
	 * @see #getPrecondition()
	 * @generated
	 */
	void setPrecondition(ProtocolPrecondition value);

	/**
	 * Returns the value of the '<em><b>Exit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the conditions that must be met for activities that are part of this time point to terminate.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Exit</em>' containment reference.
	 * @see #setExit(ProtocolPrecondition)
	 * @see org.hl7.fhir.FhirPackage#getProtocolStep_Exit()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='exit' namespace='##targetNamespace'"
	 * @generated
	 */
	ProtocolPrecondition getExit();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ProtocolStep#getExit <em>Exit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exit</em>' containment reference.
	 * @see #getExit()
	 * @generated
	 */
	void setExit(ProtocolPrecondition value);

	/**
	 * Returns the value of the '<em><b>First Activity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * First activity within timepoint.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>First Activity</em>' containment reference.
	 * @see #setFirstActivity(Uri)
	 * @see org.hl7.fhir.FhirPackage#getProtocolStep_FirstActivity()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='firstActivity' namespace='##targetNamespace'"
	 * @generated
	 */
	Uri getFirstActivity();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ProtocolStep#getFirstActivity <em>First Activity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First Activity</em>' containment reference.
	 * @see #getFirstActivity()
	 * @generated
	 */
	void setFirstActivity(Uri value);

	/**
	 * Returns the value of the '<em><b>Activity</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ProtocolActivity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Activities that occur within timepoint.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Activity</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getProtocolStep_Activity()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='activity' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ProtocolActivity> getActivity();

	/**
	 * Returns the value of the '<em><b>Next</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ProtocolNext}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * What happens next?
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Next</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getProtocolStep_Next()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='next' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ProtocolNext> getNext();

} // ProtocolStep
