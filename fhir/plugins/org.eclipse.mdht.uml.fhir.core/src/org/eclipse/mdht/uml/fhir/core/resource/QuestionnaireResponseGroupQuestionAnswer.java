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
import org.eclipse.mdht.uml.fhir.core.datatype.Base;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Questionnaire Response Group Question Answer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.QuestionnaireResponseGroupQuestionAnswer#getValuex <em>Valuex</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.QuestionnaireResponseGroupQuestionAnswer#getGroups <em>Group</em>}</li>
 * </ul>
 *
 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getQuestionnaireResponseGroupQuestionAnswer()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Question_Answer'"
 * @generated
 */
public interface QuestionnaireResponseGroupQuestionAnswer extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Valuex</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Valuex</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valuex</em>' reference.
	 * @see #setValuex(Base)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getQuestionnaireResponseGroupQuestionAnswer_Valuex()
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='value[x]'"
	 * @generated
	 */
	Base getValuex();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.QuestionnaireResponseGroupQuestionAnswer#getValuex <em>Valuex</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Valuex</em>' reference.
	 * @see #getValuex()
	 * @generated
	 */
	void setValuex(Base value);

	/**
	 * Returns the value of the '<em><b>Group</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.mdht.uml.fhir.core.resource.QuestionnaireResponseGroup}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' containment reference list.
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getQuestionnaireResponseGroupQuestionAnswer_Group()
	 * @model containment="true"
	 * @generated
	 */
	EList<QuestionnaireResponseGroup> getGroups();

} // QuestionnaireResponseGroupQuestionAnswer
