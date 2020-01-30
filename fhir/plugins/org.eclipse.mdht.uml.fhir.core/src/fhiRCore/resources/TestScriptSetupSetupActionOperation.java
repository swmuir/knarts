/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.BackboneElement;
import fhiRCore.dataTypes.Code;
import fhiRCore.dataTypes.Coding;
import fhiRCore.dataTypes.Id;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Test Script Setup Setup Action Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.TestScriptSetupSetupActionOperation#getType <em>Type</em>}</li>
 *   <li>{@link fhiRCore.resources.TestScriptSetupSetupActionOperation#getResource <em>Resource</em>}</li>
 *   <li>{@link fhiRCore.resources.TestScriptSetupSetupActionOperation#getLabel <em>Label</em>}</li>
 *   <li>{@link fhiRCore.resources.TestScriptSetupSetupActionOperation#getDescription <em>Description</em>}</li>
 *   <li>{@link fhiRCore.resources.TestScriptSetupSetupActionOperation#getAccept <em>Accept</em>}</li>
 *   <li>{@link fhiRCore.resources.TestScriptSetupSetupActionOperation#getContentType <em>Content Type</em>}</li>
 *   <li>{@link fhiRCore.resources.TestScriptSetupSetupActionOperation#getDestination <em>Destination</em>}</li>
 *   <li>{@link fhiRCore.resources.TestScriptSetupSetupActionOperation#getEncodeRequestUrl <em>Encode Request Url</em>}</li>
 *   <li>{@link fhiRCore.resources.TestScriptSetupSetupActionOperation#getMethod <em>Method</em>}</li>
 *   <li>{@link fhiRCore.resources.TestScriptSetupSetupActionOperation#getOrigin <em>Origin</em>}</li>
 *   <li>{@link fhiRCore.resources.TestScriptSetupSetupActionOperation#getParams <em>Params</em>}</li>
 *   <li>{@link fhiRCore.resources.TestScriptSetupSetupActionOperation#getRequestHeaders <em>Request Header</em>}</li>
 *   <li>{@link fhiRCore.resources.TestScriptSetupSetupActionOperation#getRequestId <em>Request Id</em>}</li>
 *   <li>{@link fhiRCore.resources.TestScriptSetupSetupActionOperation#getResponseId <em>Response Id</em>}</li>
 *   <li>{@link fhiRCore.resources.TestScriptSetupSetupActionOperation#getSourceId <em>Source Id</em>}</li>
 *   <li>{@link fhiRCore.resources.TestScriptSetupSetupActionOperation#getTargetId <em>Target Id</em>}</li>
 *   <li>{@link fhiRCore.resources.TestScriptSetupSetupActionOperation#getUrl <em>Url</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getTestScriptSetupSetupActionOperation()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='SetupAction_Operation'"
 * @generated
 */
public interface TestScriptSetupSetupActionOperation extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(Coding)
	 * @see fhiRCore.resources.ResourcesPackage#getTestScriptSetupSetupActionOperation_Type()
	 * @model containment="true"
	 * @generated
	 */
	Coding getType();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.TestScriptSetupSetupActionOperation#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(Coding value);

	/**
	 * Returns the value of the '<em><b>Resource</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource</em>' containment reference.
	 * @see #setResource(Code)
	 * @see fhiRCore.resources.ResourcesPackage#getTestScriptSetupSetupActionOperation_Resource()
	 * @model containment="true"
	 * @generated
	 */
	Code getResource();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.TestScriptSetupSetupActionOperation#getResource <em>Resource</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource</em>' containment reference.
	 * @see #getResource()
	 * @generated
	 */
	void setResource(Code value);

	/**
	 * Returns the value of the '<em><b>Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' containment reference.
	 * @see #setLabel(fhiRCore.dataTypes.String)
	 * @see fhiRCore.resources.ResourcesPackage#getTestScriptSetupSetupActionOperation_Label()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getLabel();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.TestScriptSetupSetupActionOperation#getLabel <em>Label</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' containment reference.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(fhiRCore.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(fhiRCore.dataTypes.String)
	 * @see fhiRCore.resources.ResourcesPackage#getTestScriptSetupSetupActionOperation_Description()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getDescription();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.TestScriptSetupSetupActionOperation#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(fhiRCore.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Accept</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Accept</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Accept</em>' containment reference.
	 * @see #setAccept(Code)
	 * @see fhiRCore.resources.ResourcesPackage#getTestScriptSetupSetupActionOperation_Accept()
	 * @model containment="true"
	 * @generated
	 */
	Code getAccept();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.TestScriptSetupSetupActionOperation#getAccept <em>Accept</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Accept</em>' containment reference.
	 * @see #getAccept()
	 * @generated
	 */
	void setAccept(Code value);

	/**
	 * Returns the value of the '<em><b>Content Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content Type</em>' containment reference.
	 * @see #setContentType(Code)
	 * @see fhiRCore.resources.ResourcesPackage#getTestScriptSetupSetupActionOperation_ContentType()
	 * @model containment="true"
	 * @generated
	 */
	Code getContentType();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.TestScriptSetupSetupActionOperation#getContentType <em>Content Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content Type</em>' containment reference.
	 * @see #getContentType()
	 * @generated
	 */
	void setContentType(Code value);

	/**
	 * Returns the value of the '<em><b>Destination</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Destination</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Destination</em>' containment reference.
	 * @see #setDestination(fhiRCore.dataTypes.Integer)
	 * @see fhiRCore.resources.ResourcesPackage#getTestScriptSetupSetupActionOperation_Destination()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.Integer getDestination();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.TestScriptSetupSetupActionOperation#getDestination <em>Destination</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Destination</em>' containment reference.
	 * @see #getDestination()
	 * @generated
	 */
	void setDestination(fhiRCore.dataTypes.Integer value);

	/**
	 * Returns the value of the '<em><b>Encode Request Url</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Encode Request Url</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Encode Request Url</em>' containment reference.
	 * @see #setEncodeRequestUrl(fhiRCore.dataTypes.Boolean)
	 * @see fhiRCore.resources.ResourcesPackage#getTestScriptSetupSetupActionOperation_EncodeRequestUrl()
	 * @model containment="true" required="true"
	 * @generated
	 */
	fhiRCore.dataTypes.Boolean getEncodeRequestUrl();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.TestScriptSetupSetupActionOperation#getEncodeRequestUrl <em>Encode Request Url</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Encode Request Url</em>' containment reference.
	 * @see #getEncodeRequestUrl()
	 * @generated
	 */
	void setEncodeRequestUrl(fhiRCore.dataTypes.Boolean value);

	/**
	 * Returns the value of the '<em><b>Method</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Method</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Method</em>' containment reference.
	 * @see #setMethod(Code)
	 * @see fhiRCore.resources.ResourcesPackage#getTestScriptSetupSetupActionOperation_Method()
	 * @model containment="true"
	 * @generated
	 */
	Code getMethod();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.TestScriptSetupSetupActionOperation#getMethod <em>Method</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Method</em>' containment reference.
	 * @see #getMethod()
	 * @generated
	 */
	void setMethod(Code value);

	/**
	 * Returns the value of the '<em><b>Origin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Origin</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Origin</em>' containment reference.
	 * @see #setOrigin(fhiRCore.dataTypes.Integer)
	 * @see fhiRCore.resources.ResourcesPackage#getTestScriptSetupSetupActionOperation_Origin()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.Integer getOrigin();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.TestScriptSetupSetupActionOperation#getOrigin <em>Origin</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Origin</em>' containment reference.
	 * @see #getOrigin()
	 * @generated
	 */
	void setOrigin(fhiRCore.dataTypes.Integer value);

	/**
	 * Returns the value of the '<em><b>Params</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Params</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Params</em>' containment reference.
	 * @see #setParams(fhiRCore.dataTypes.String)
	 * @see fhiRCore.resources.ResourcesPackage#getTestScriptSetupSetupActionOperation_Params()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getParams();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.TestScriptSetupSetupActionOperation#getParams <em>Params</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Params</em>' containment reference.
	 * @see #getParams()
	 * @generated
	 */
	void setParams(fhiRCore.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Request Header</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.resources.TestScriptSetupSetupActionOperationRequestHeader}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Request Header</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Request Header</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getTestScriptSetupSetupActionOperation_RequestHeader()
	 * @model containment="true"
	 * @generated
	 */
	EList<TestScriptSetupSetupActionOperationRequestHeader> getRequestHeaders();

	/**
	 * Returns the value of the '<em><b>Request Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Request Id</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Request Id</em>' containment reference.
	 * @see #setRequestId(Id)
	 * @see fhiRCore.resources.ResourcesPackage#getTestScriptSetupSetupActionOperation_RequestId()
	 * @model containment="true"
	 * @generated
	 */
	Id getRequestId();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.TestScriptSetupSetupActionOperation#getRequestId <em>Request Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Request Id</em>' containment reference.
	 * @see #getRequestId()
	 * @generated
	 */
	void setRequestId(Id value);

	/**
	 * Returns the value of the '<em><b>Response Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Response Id</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Response Id</em>' containment reference.
	 * @see #setResponseId(Id)
	 * @see fhiRCore.resources.ResourcesPackage#getTestScriptSetupSetupActionOperation_ResponseId()
	 * @model containment="true"
	 * @generated
	 */
	Id getResponseId();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.TestScriptSetupSetupActionOperation#getResponseId <em>Response Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Response Id</em>' containment reference.
	 * @see #getResponseId()
	 * @generated
	 */
	void setResponseId(Id value);

	/**
	 * Returns the value of the '<em><b>Source Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Id</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Id</em>' containment reference.
	 * @see #setSourceId(Id)
	 * @see fhiRCore.resources.ResourcesPackage#getTestScriptSetupSetupActionOperation_SourceId()
	 * @model containment="true"
	 * @generated
	 */
	Id getSourceId();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.TestScriptSetupSetupActionOperation#getSourceId <em>Source Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Id</em>' containment reference.
	 * @see #getSourceId()
	 * @generated
	 */
	void setSourceId(Id value);

	/**
	 * Returns the value of the '<em><b>Target Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Id</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Id</em>' containment reference.
	 * @see #setTargetId(Id)
	 * @see fhiRCore.resources.ResourcesPackage#getTestScriptSetupSetupActionOperation_TargetId()
	 * @model containment="true"
	 * @generated
	 */
	Id getTargetId();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.TestScriptSetupSetupActionOperation#getTargetId <em>Target Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Id</em>' containment reference.
	 * @see #getTargetId()
	 * @generated
	 */
	void setTargetId(Id value);

	/**
	 * Returns the value of the '<em><b>Url</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Url</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Url</em>' containment reference.
	 * @see #setUrl(fhiRCore.dataTypes.String)
	 * @see fhiRCore.resources.ResourcesPackage#getTestScriptSetupSetupActionOperation_Url()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getUrl();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.TestScriptSetupSetupActionOperation#getUrl <em>Url</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Url</em>' containment reference.
	 * @see #getUrl()
	 * @generated
	 */
	void setUrl(fhiRCore.dataTypes.String value);

} // TestScriptSetupSetupActionOperation
