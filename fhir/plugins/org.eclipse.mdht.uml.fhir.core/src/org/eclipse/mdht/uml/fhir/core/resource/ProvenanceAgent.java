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
import org.eclipse.mdht.uml.fhir.core.datatype.Coding;
import org.eclipse.mdht.uml.fhir.core.datatype.Identifier;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Provenance Agent</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.ProvenanceAgent#getRole <em>Role</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.ProvenanceAgent#getActor <em>Actor</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.ProvenanceAgent#getUserId <em>User Id</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.ProvenanceAgent#getRelatedAgents <em>Related Agent</em>}</li>
 * </ul>
 *
 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getProvenanceAgent()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Provenance_Agent'"
 * @generated
 */
public interface ProvenanceAgent extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role</em>' reference.
	 * @see #setRole(Coding)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getProvenanceAgent_Role()
	 * @model required="true"
	 * @generated
	 */
	Coding getRole();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.ProvenanceAgent#getRole <em>Role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role</em>' reference.
	 * @see #getRole()
	 * @generated
	 */
	void setRole(Coding value);

	/**
	 * Returns the value of the '<em><b>Actor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actor</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actor</em>' reference.
	 * @see #setActor(Resource)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getProvenanceAgent_Actor()
	 * @model
	 * @generated
	 */
	Resource getActor();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.ProvenanceAgent#getActor <em>Actor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actor</em>' reference.
	 * @see #getActor()
	 * @generated
	 */
	void setActor(Resource value);

	/**
	 * Returns the value of the '<em><b>User Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Id</em>' reference.
	 * @see #setUserId(Identifier)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getProvenanceAgent_UserId()
	 * @model
	 * @generated
	 */
	Identifier getUserId();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.ProvenanceAgent#getUserId <em>User Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Id</em>' reference.
	 * @see #getUserId()
	 * @generated
	 */
	void setUserId(Identifier value);

	/**
	 * Returns the value of the '<em><b>Related Agent</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.mdht.uml.fhir.core.resource.ProvenanceAgentRelatedAgent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Related Agent</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Related Agent</em>' containment reference list.
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getProvenanceAgent_RelatedAgent()
	 * @model containment="true"
	 * @generated
	 */
	EList<ProvenanceAgentRelatedAgent> getRelatedAgents();

} // ProvenanceAgent
