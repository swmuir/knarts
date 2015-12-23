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
package org.eclipse.mdht.uml.fhir.core.resource;

import org.eclipse.emf.common.util.EList;

import org.eclipse.mdht.uml.fhir.core.datatype.Annotation;
import org.eclipse.mdht.uml.fhir.core.datatype.Code;
import org.eclipse.mdht.uml.fhir.core.datatype.CodeableConcept;
import org.eclipse.mdht.uml.fhir.core.datatype.DateTime;
import org.eclipse.mdht.uml.fhir.core.datatype.Identifier;
import org.eclipse.mdht.uml.fhir.core.datatype.Period;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Care Plan</b></em>'.
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
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.CarePlan#getIdentifiers <em>Identifier</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.CarePlan#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.CarePlan#getStatus <em>Status</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.CarePlan#getContext <em>Context</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.CarePlan#getPeriod <em>Period</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.CarePlan#getAuthors <em>Author</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.CarePlan#getModified <em>Modified</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.CarePlan#getCategories <em>Category</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.CarePlan#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.CarePlan#getAddresses <em>Addresses</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.CarePlan#getSupports <em>Support</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.CarePlan#getRelatedPlans <em>Related Plan</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.CarePlan#getParticipants <em>Participant</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.CarePlan#getGoals <em>Goal</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.CarePlan#getActivities <em>Activity</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.CarePlan#getNote <em>Note</em>}</li>
 * </ul>
 *
 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getCarePlan()
 * @model
 * @generated
 */
public interface CarePlan extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.mdht.uml.fhir.core.datatype.Identifier}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Identifier</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identifier</em>' reference list.
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getCarePlan_Identifier()
	 * @model
	 * @generated
	 */
	EList<Identifier> getIdentifiers();

	/**
	 * Returns the value of the '<em><b>Subject</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subject</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subject</em>' reference.
	 * @see #setSubject(Resource)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getCarePlan_Subject()
	 * @model
	 * @generated
	 */
	Resource getSubject();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.CarePlan#getSubject <em>Subject</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subject</em>' reference.
	 * @see #getSubject()
	 * @generated
	 */
	void setSubject(Resource value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' reference.
	 * @see #setStatus(Code)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getCarePlan_Status()
	 * @model required="true"
	 * @generated
	 */
	Code getStatus();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.CarePlan#getStatus <em>Status</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(Code value);

	/**
	 * Returns the value of the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Context</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context</em>' reference.
	 * @see #setContext(Resource)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getCarePlan_Context()
	 * @model
	 * @generated
	 */
	Resource getContext();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.CarePlan#getContext <em>Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context</em>' reference.
	 * @see #getContext()
	 * @generated
	 */
	void setContext(Resource value);

	/**
	 * Returns the value of the '<em><b>Period</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Period</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Period</em>' reference.
	 * @see #setPeriod(Period)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getCarePlan_Period()
	 * @model
	 * @generated
	 */
	Period getPeriod();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.CarePlan#getPeriod <em>Period</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Period</em>' reference.
	 * @see #getPeriod()
	 * @generated
	 */
	void setPeriod(Period value);

	/**
	 * Returns the value of the '<em><b>Author</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.mdht.uml.fhir.core.resource.Resource}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Author</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Author</em>' reference list.
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getCarePlan_Author()
	 * @model
	 * @generated
	 */
	EList<Resource> getAuthors();

	/**
	 * Returns the value of the '<em><b>Modified</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modified</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modified</em>' reference.
	 * @see #setModified(DateTime)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getCarePlan_Modified()
	 * @model
	 * @generated
	 */
	DateTime getModified();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.CarePlan#getModified <em>Modified</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modified</em>' reference.
	 * @see #getModified()
	 * @generated
	 */
	void setModified(DateTime value);

	/**
	 * Returns the value of the '<em><b>Category</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.mdht.uml.fhir.core.datatype.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Category</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Category</em>' reference list.
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getCarePlan_Category()
	 * @model
	 * @generated
	 */
	EList<CodeableConcept> getCategories();

	/**
	 * Returns the value of the '<em><b>Description</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' reference.
	 * @see #setDescription(org.eclipse.mdht.uml.fhir.core.datatype.String)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getCarePlan_Description()
	 * @model
	 * @generated
	 */
	org.eclipse.mdht.uml.fhir.core.datatype.String getDescription();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.CarePlan#getDescription <em>Description</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(org.eclipse.mdht.uml.fhir.core.datatype.String value);

	/**
	 * Returns the value of the '<em><b>Addresses</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.mdht.uml.fhir.core.resource.Condition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Addresses</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Addresses</em>' reference list.
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getCarePlan_Addresses()
	 * @model
	 * @generated
	 */
	EList<Condition> getAddresses();

	/**
	 * Returns the value of the '<em><b>Support</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.mdht.uml.fhir.core.resource.Resource}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Support</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Support</em>' reference list.
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getCarePlan_Support()
	 * @model
	 * @generated
	 */
	EList<Resource> getSupports();

	/**
	 * Returns the value of the '<em><b>Related Plan</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.mdht.uml.fhir.core.resource.CarePlanRelatedPlan}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Related Plan</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Related Plan</em>' containment reference list.
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getCarePlan_RelatedPlan()
	 * @model containment="true"
	 * @generated
	 */
	EList<CarePlanRelatedPlan> getRelatedPlans();

	/**
	 * Returns the value of the '<em><b>Participant</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.mdht.uml.fhir.core.resource.CarePlanParticipant}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Participant</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Participant</em>' containment reference list.
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getCarePlan_Participant()
	 * @model containment="true"
	 * @generated
	 */
	EList<CarePlanParticipant> getParticipants();

	/**
	 * Returns the value of the '<em><b>Goal</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.mdht.uml.fhir.core.resource.Goal}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Goal</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Goal</em>' reference list.
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getCarePlan_Goal()
	 * @model
	 * @generated
	 */
	EList<Goal> getGoals();

	/**
	 * Returns the value of the '<em><b>Activity</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.mdht.uml.fhir.core.resource.CarePlanActivity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activity</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activity</em>' containment reference list.
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getCarePlan_Activity()
	 * @model containment="true"
	 * @generated
	 */
	EList<CarePlanActivity> getActivities();

	/**
	 * Returns the value of the '<em><b>Note</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Note</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Note</em>' reference.
	 * @see #setNote(Annotation)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getCarePlan_Note()
	 * @model
	 * @generated
	 */
	Annotation getNote();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.CarePlan#getNote <em>Note</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Note</em>' reference.
	 * @see #getNote()
	 * @generated
	 */
	void setNote(Annotation value);

} // CarePlan
