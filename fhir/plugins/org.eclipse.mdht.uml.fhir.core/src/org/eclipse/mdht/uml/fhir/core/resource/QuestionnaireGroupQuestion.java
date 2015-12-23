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

import org.eclipse.mdht.uml.fhir.core.datatype.BackboneElement;
import org.eclipse.mdht.uml.fhir.core.datatype.Code;
import org.eclipse.mdht.uml.fhir.core.datatype.Coding;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Questionnaire Group Question</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.QuestionnaireGroupQuestion#getLinkId <em>Link Id</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.QuestionnaireGroupQuestion#getConcepts <em>Concept</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.QuestionnaireGroupQuestion#getText <em>Text</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.QuestionnaireGroupQuestion#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.QuestionnaireGroupQuestion#getRequired <em>Required</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.QuestionnaireGroupQuestion#getRepeats <em>Repeats</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.QuestionnaireGroupQuestion#getOptions <em>Options</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.QuestionnaireGroupQuestion#getPermittedAnswers <em>Permitted Answer</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.QuestionnaireGroupQuestion#getGroups <em>Group</em>}</li>
 * </ul>
 *
 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getQuestionnaireGroupQuestion()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Group_Question'"
 * @generated
 */
public interface QuestionnaireGroupQuestion extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Link Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Link Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link Id</em>' reference.
	 * @see #setLinkId(org.eclipse.mdht.uml.fhir.core.datatype.String)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getQuestionnaireGroupQuestion_LinkId()
	 * @model
	 * @generated
	 */
	org.eclipse.mdht.uml.fhir.core.datatype.String getLinkId();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.QuestionnaireGroupQuestion#getLinkId <em>Link Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Link Id</em>' reference.
	 * @see #getLinkId()
	 * @generated
	 */
	void setLinkId(org.eclipse.mdht.uml.fhir.core.datatype.String value);

	/**
	 * Returns the value of the '<em><b>Concept</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.mdht.uml.fhir.core.datatype.Coding}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Concept</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concept</em>' reference list.
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getQuestionnaireGroupQuestion_Concept()
	 * @model
	 * @generated
	 */
	EList<Coding> getConcepts();

	/**
	 * Returns the value of the '<em><b>Text</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' reference.
	 * @see #setText(org.eclipse.mdht.uml.fhir.core.datatype.String)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getQuestionnaireGroupQuestion_Text()
	 * @model
	 * @generated
	 */
	org.eclipse.mdht.uml.fhir.core.datatype.String getText();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.QuestionnaireGroupQuestion#getText <em>Text</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' reference.
	 * @see #getText()
	 * @generated
	 */
	void setText(org.eclipse.mdht.uml.fhir.core.datatype.String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(Code)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getQuestionnaireGroupQuestion_Type()
	 * @model
	 * @generated
	 */
	Code getType();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.QuestionnaireGroupQuestion#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(Code value);

	/**
	 * Returns the value of the '<em><b>Required</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required</em>' reference.
	 * @see #setRequired(org.eclipse.mdht.uml.fhir.core.datatype.Boolean)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getQuestionnaireGroupQuestion_Required()
	 * @model
	 * @generated
	 */
	org.eclipse.mdht.uml.fhir.core.datatype.Boolean getRequired();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.QuestionnaireGroupQuestion#getRequired <em>Required</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required</em>' reference.
	 * @see #getRequired()
	 * @generated
	 */
	void setRequired(org.eclipse.mdht.uml.fhir.core.datatype.Boolean value);

	/**
	 * Returns the value of the '<em><b>Repeats</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Repeats</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Repeats</em>' reference.
	 * @see #setRepeats(org.eclipse.mdht.uml.fhir.core.datatype.Boolean)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getQuestionnaireGroupQuestion_Repeats()
	 * @model
	 * @generated
	 */
	org.eclipse.mdht.uml.fhir.core.datatype.Boolean getRepeats();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.QuestionnaireGroupQuestion#getRepeats <em>Repeats</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Repeats</em>' reference.
	 * @see #getRepeats()
	 * @generated
	 */
	void setRepeats(org.eclipse.mdht.uml.fhir.core.datatype.Boolean value);

	/**
	 * Returns the value of the '<em><b>Options</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Options</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Options</em>' reference.
	 * @see #setOptions(ValueSet)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getQuestionnaireGroupQuestion_Options()
	 * @model
	 * @generated
	 */
	ValueSet getOptions();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.QuestionnaireGroupQuestion#getOptions <em>Options</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Options</em>' reference.
	 * @see #getOptions()
	 * @generated
	 */
	void setOptions(ValueSet value);

	/**
	 * Returns the value of the '<em><b>Permitted Answer</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.mdht.uml.fhir.core.datatype.Coding}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Permitted Answer</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Permitted Answer</em>' reference list.
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getQuestionnaireGroupQuestion_PermittedAnswer()
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='option'"
	 * @generated
	 */
	EList<Coding> getPermittedAnswers();

	/**
	 * Returns the value of the '<em><b>Group</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.mdht.uml.fhir.core.resource.QuestionnaireGroup}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' containment reference list.
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getQuestionnaireGroupQuestion_Group()
	 * @model containment="true"
	 * @generated
	 */
	EList<QuestionnaireGroup> getGroups();

} // QuestionnaireGroupQuestion
