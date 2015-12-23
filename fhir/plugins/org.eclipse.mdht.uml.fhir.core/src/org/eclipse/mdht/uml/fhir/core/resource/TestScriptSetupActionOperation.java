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
import org.eclipse.mdht.uml.fhir.core.datatype.Id;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Test Script Setup Action Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.TestScriptSetupActionOperation#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.TestScriptSetupActionOperation#getResource <em>Resource</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.TestScriptSetupActionOperation#getLabel <em>Label</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.TestScriptSetupActionOperation#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.TestScriptSetupActionOperation#getAccept <em>Accept</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.TestScriptSetupActionOperation#getContentType <em>Content Type</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.TestScriptSetupActionOperation#getDestination <em>Destination</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.TestScriptSetupActionOperation#getEncodeRequestUrl <em>Encode Request Url</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.TestScriptSetupActionOperation#getParams <em>Params</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.TestScriptSetupActionOperation#getRequestHeaders <em>Request Header</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.TestScriptSetupActionOperation#getResponseId <em>Response Id</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.TestScriptSetupActionOperation#getSourceId <em>Source Id</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.TestScriptSetupActionOperation#getTargetId <em>Target Id</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.TestScriptSetupActionOperation#getUrl <em>Url</em>}</li>
 * </ul>
 *
 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getTestScriptSetupActionOperation()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Action_Operation'"
 * @generated
 */
public interface TestScriptSetupActionOperation extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(Coding)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getTestScriptSetupActionOperation_Type()
	 * @model
	 * @generated
	 */
	Coding getType();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.TestScriptSetupActionOperation#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(Coding value);

	/**
	 * Returns the value of the '<em><b>Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource</em>' reference.
	 * @see #setResource(Code)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getTestScriptSetupActionOperation_Resource()
	 * @model
	 * @generated
	 */
	Code getResource();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.TestScriptSetupActionOperation#getResource <em>Resource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource</em>' reference.
	 * @see #getResource()
	 * @generated
	 */
	void setResource(Code value);

	/**
	 * Returns the value of the '<em><b>Label</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' reference.
	 * @see #setLabel(org.eclipse.mdht.uml.fhir.core.datatype.String)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getTestScriptSetupActionOperation_Label()
	 * @model
	 * @generated
	 */
	org.eclipse.mdht.uml.fhir.core.datatype.String getLabel();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.TestScriptSetupActionOperation#getLabel <em>Label</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' reference.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(org.eclipse.mdht.uml.fhir.core.datatype.String value);

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
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getTestScriptSetupActionOperation_Description()
	 * @model
	 * @generated
	 */
	org.eclipse.mdht.uml.fhir.core.datatype.String getDescription();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.TestScriptSetupActionOperation#getDescription <em>Description</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(org.eclipse.mdht.uml.fhir.core.datatype.String value);

	/**
	 * Returns the value of the '<em><b>Accept</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Accept</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Accept</em>' reference.
	 * @see #setAccept(Code)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getTestScriptSetupActionOperation_Accept()
	 * @model
	 * @generated
	 */
	Code getAccept();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.TestScriptSetupActionOperation#getAccept <em>Accept</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Accept</em>' reference.
	 * @see #getAccept()
	 * @generated
	 */
	void setAccept(Code value);

	/**
	 * Returns the value of the '<em><b>Content Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content Type</em>' reference.
	 * @see #setContentType(Code)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getTestScriptSetupActionOperation_ContentType()
	 * @model
	 * @generated
	 */
	Code getContentType();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.TestScriptSetupActionOperation#getContentType <em>Content Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content Type</em>' reference.
	 * @see #getContentType()
	 * @generated
	 */
	void setContentType(Code value);

	/**
	 * Returns the value of the '<em><b>Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Destination</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Destination</em>' reference.
	 * @see #setDestination(org.eclipse.mdht.uml.fhir.core.datatype.Integer)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getTestScriptSetupActionOperation_Destination()
	 * @model
	 * @generated
	 */
	org.eclipse.mdht.uml.fhir.core.datatype.Integer getDestination();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.TestScriptSetupActionOperation#getDestination <em>Destination</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Destination</em>' reference.
	 * @see #getDestination()
	 * @generated
	 */
	void setDestination(org.eclipse.mdht.uml.fhir.core.datatype.Integer value);

	/**
	 * Returns the value of the '<em><b>Encode Request Url</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Encode Request Url</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Encode Request Url</em>' reference.
	 * @see #setEncodeRequestUrl(org.eclipse.mdht.uml.fhir.core.datatype.Boolean)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getTestScriptSetupActionOperation_EncodeRequestUrl()
	 * @model
	 * @generated
	 */
	org.eclipse.mdht.uml.fhir.core.datatype.Boolean getEncodeRequestUrl();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.TestScriptSetupActionOperation#getEncodeRequestUrl <em>Encode Request Url</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Encode Request Url</em>' reference.
	 * @see #getEncodeRequestUrl()
	 * @generated
	 */
	void setEncodeRequestUrl(org.eclipse.mdht.uml.fhir.core.datatype.Boolean value);

	/**
	 * Returns the value of the '<em><b>Params</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Params</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Params</em>' reference.
	 * @see #setParams(org.eclipse.mdht.uml.fhir.core.datatype.String)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getTestScriptSetupActionOperation_Params()
	 * @model
	 * @generated
	 */
	org.eclipse.mdht.uml.fhir.core.datatype.String getParams();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.TestScriptSetupActionOperation#getParams <em>Params</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Params</em>' reference.
	 * @see #getParams()
	 * @generated
	 */
	void setParams(org.eclipse.mdht.uml.fhir.core.datatype.String value);

	/**
	 * Returns the value of the '<em><b>Request Header</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.mdht.uml.fhir.core.resource.TestScriptSetupActionOperationRequestHeader}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Request Header</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Request Header</em>' containment reference list.
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getTestScriptSetupActionOperation_RequestHeader()
	 * @model containment="true"
	 * @generated
	 */
	EList<TestScriptSetupActionOperationRequestHeader> getRequestHeaders();

	/**
	 * Returns the value of the '<em><b>Response Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Response Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Response Id</em>' reference.
	 * @see #setResponseId(Id)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getTestScriptSetupActionOperation_ResponseId()
	 * @model
	 * @generated
	 */
	Id getResponseId();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.TestScriptSetupActionOperation#getResponseId <em>Response Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Response Id</em>' reference.
	 * @see #getResponseId()
	 * @generated
	 */
	void setResponseId(Id value);

	/**
	 * Returns the value of the '<em><b>Source Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Id</em>' reference.
	 * @see #setSourceId(Id)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getTestScriptSetupActionOperation_SourceId()
	 * @model
	 * @generated
	 */
	Id getSourceId();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.TestScriptSetupActionOperation#getSourceId <em>Source Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Id</em>' reference.
	 * @see #getSourceId()
	 * @generated
	 */
	void setSourceId(Id value);

	/**
	 * Returns the value of the '<em><b>Target Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Id</em>' reference.
	 * @see #setTargetId(Id)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getTestScriptSetupActionOperation_TargetId()
	 * @model
	 * @generated
	 */
	Id getTargetId();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.TestScriptSetupActionOperation#getTargetId <em>Target Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Id</em>' reference.
	 * @see #getTargetId()
	 * @generated
	 */
	void setTargetId(Id value);

	/**
	 * Returns the value of the '<em><b>Url</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Url</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Url</em>' reference.
	 * @see #setUrl(org.eclipse.mdht.uml.fhir.core.datatype.String)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getTestScriptSetupActionOperation_Url()
	 * @model
	 * @generated
	 */
	org.eclipse.mdht.uml.fhir.core.datatype.String getUrl();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.TestScriptSetupActionOperation#getUrl <em>Url</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Url</em>' reference.
	 * @see #getUrl()
	 * @generated
	 */
	void setUrl(org.eclipse.mdht.uml.fhir.core.datatype.String value);

} // TestScriptSetupActionOperation
