/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.BackboneElement;
import fhiRCore.dataTypes.Code;
import fhiRCore.dataTypes.Id;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Test Script Setup Setup Action Assert</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.TestScriptSetupSetupActionAssert#getLabel <em>Label</em>}</li>
 *   <li>{@link fhiRCore.resources.TestScriptSetupSetupActionAssert#getDescription <em>Description</em>}</li>
 *   <li>{@link fhiRCore.resources.TestScriptSetupSetupActionAssert#getDirection <em>Direction</em>}</li>
 *   <li>{@link fhiRCore.resources.TestScriptSetupSetupActionAssert#getCompareToSourceId <em>Compare To Source Id</em>}</li>
 *   <li>{@link fhiRCore.resources.TestScriptSetupSetupActionAssert#getCompareToSourceExpression <em>Compare To Source Expression</em>}</li>
 *   <li>{@link fhiRCore.resources.TestScriptSetupSetupActionAssert#getCompareToSourcePath <em>Compare To Source Path</em>}</li>
 *   <li>{@link fhiRCore.resources.TestScriptSetupSetupActionAssert#getContentType <em>Content Type</em>}</li>
 *   <li>{@link fhiRCore.resources.TestScriptSetupSetupActionAssert#getExpression <em>Expression</em>}</li>
 *   <li>{@link fhiRCore.resources.TestScriptSetupSetupActionAssert#getHeaderField <em>Header Field</em>}</li>
 *   <li>{@link fhiRCore.resources.TestScriptSetupSetupActionAssert#getMinimumId <em>Minimum Id</em>}</li>
 *   <li>{@link fhiRCore.resources.TestScriptSetupSetupActionAssert#getNavigationLinks <em>Navigation Links</em>}</li>
 *   <li>{@link fhiRCore.resources.TestScriptSetupSetupActionAssert#getOperator <em>Operator</em>}</li>
 *   <li>{@link fhiRCore.resources.TestScriptSetupSetupActionAssert#getPath <em>Path</em>}</li>
 *   <li>{@link fhiRCore.resources.TestScriptSetupSetupActionAssert#getRequestMethod <em>Request Method</em>}</li>
 *   <li>{@link fhiRCore.resources.TestScriptSetupSetupActionAssert#getRequestUrl <em>Request Url</em>}</li>
 *   <li>{@link fhiRCore.resources.TestScriptSetupSetupActionAssert#getResource <em>Resource</em>}</li>
 *   <li>{@link fhiRCore.resources.TestScriptSetupSetupActionAssert#getResponse <em>Response</em>}</li>
 *   <li>{@link fhiRCore.resources.TestScriptSetupSetupActionAssert#getResponseCode <em>Response Code</em>}</li>
 *   <li>{@link fhiRCore.resources.TestScriptSetupSetupActionAssert#getSourceId <em>Source Id</em>}</li>
 *   <li>{@link fhiRCore.resources.TestScriptSetupSetupActionAssert#getValidateProfileId <em>Validate Profile Id</em>}</li>
 *   <li>{@link fhiRCore.resources.TestScriptSetupSetupActionAssert#getValue <em>Value</em>}</li>
 *   <li>{@link fhiRCore.resources.TestScriptSetupSetupActionAssert#getWarningOnly <em>Warning Only</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getTestScriptSetupSetupActionAssert()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='SetupAction_Assert'"
 * @generated
 */
public interface TestScriptSetupSetupActionAssert extends BackboneElement {
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
	 * @see fhiRCore.resources.ResourcesPackage#getTestScriptSetupSetupActionAssert_Label()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getLabel();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.TestScriptSetupSetupActionAssert#getLabel <em>Label</em>}' containment reference.
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
	 * @see fhiRCore.resources.ResourcesPackage#getTestScriptSetupSetupActionAssert_Description()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getDescription();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.TestScriptSetupSetupActionAssert#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(fhiRCore.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Direction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Direction</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Direction</em>' containment reference.
	 * @see #setDirection(Code)
	 * @see fhiRCore.resources.ResourcesPackage#getTestScriptSetupSetupActionAssert_Direction()
	 * @model containment="true"
	 * @generated
	 */
	Code getDirection();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.TestScriptSetupSetupActionAssert#getDirection <em>Direction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direction</em>' containment reference.
	 * @see #getDirection()
	 * @generated
	 */
	void setDirection(Code value);

	/**
	 * Returns the value of the '<em><b>Compare To Source Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Compare To Source Id</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compare To Source Id</em>' containment reference.
	 * @see #setCompareToSourceId(fhiRCore.dataTypes.String)
	 * @see fhiRCore.resources.ResourcesPackage#getTestScriptSetupSetupActionAssert_CompareToSourceId()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getCompareToSourceId();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.TestScriptSetupSetupActionAssert#getCompareToSourceId <em>Compare To Source Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Compare To Source Id</em>' containment reference.
	 * @see #getCompareToSourceId()
	 * @generated
	 */
	void setCompareToSourceId(fhiRCore.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Compare To Source Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Compare To Source Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compare To Source Expression</em>' containment reference.
	 * @see #setCompareToSourceExpression(fhiRCore.dataTypes.String)
	 * @see fhiRCore.resources.ResourcesPackage#getTestScriptSetupSetupActionAssert_CompareToSourceExpression()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getCompareToSourceExpression();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.TestScriptSetupSetupActionAssert#getCompareToSourceExpression <em>Compare To Source Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Compare To Source Expression</em>' containment reference.
	 * @see #getCompareToSourceExpression()
	 * @generated
	 */
	void setCompareToSourceExpression(fhiRCore.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Compare To Source Path</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Compare To Source Path</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compare To Source Path</em>' containment reference.
	 * @see #setCompareToSourcePath(fhiRCore.dataTypes.String)
	 * @see fhiRCore.resources.ResourcesPackage#getTestScriptSetupSetupActionAssert_CompareToSourcePath()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getCompareToSourcePath();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.TestScriptSetupSetupActionAssert#getCompareToSourcePath <em>Compare To Source Path</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Compare To Source Path</em>' containment reference.
	 * @see #getCompareToSourcePath()
	 * @generated
	 */
	void setCompareToSourcePath(fhiRCore.dataTypes.String value);

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
	 * @see fhiRCore.resources.ResourcesPackage#getTestScriptSetupSetupActionAssert_ContentType()
	 * @model containment="true"
	 * @generated
	 */
	Code getContentType();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.TestScriptSetupSetupActionAssert#getContentType <em>Content Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content Type</em>' containment reference.
	 * @see #getContentType()
	 * @generated
	 */
	void setContentType(Code value);

	/**
	 * Returns the value of the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' containment reference.
	 * @see #setExpression(fhiRCore.dataTypes.String)
	 * @see fhiRCore.resources.ResourcesPackage#getTestScriptSetupSetupActionAssert_Expression()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getExpression();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.TestScriptSetupSetupActionAssert#getExpression <em>Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' containment reference.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(fhiRCore.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Header Field</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Header Field</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Header Field</em>' containment reference.
	 * @see #setHeaderField(fhiRCore.dataTypes.String)
	 * @see fhiRCore.resources.ResourcesPackage#getTestScriptSetupSetupActionAssert_HeaderField()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getHeaderField();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.TestScriptSetupSetupActionAssert#getHeaderField <em>Header Field</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Header Field</em>' containment reference.
	 * @see #getHeaderField()
	 * @generated
	 */
	void setHeaderField(fhiRCore.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Minimum Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Minimum Id</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Minimum Id</em>' containment reference.
	 * @see #setMinimumId(fhiRCore.dataTypes.String)
	 * @see fhiRCore.resources.ResourcesPackage#getTestScriptSetupSetupActionAssert_MinimumId()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getMinimumId();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.TestScriptSetupSetupActionAssert#getMinimumId <em>Minimum Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minimum Id</em>' containment reference.
	 * @see #getMinimumId()
	 * @generated
	 */
	void setMinimumId(fhiRCore.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Navigation Links</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Navigation Links</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Navigation Links</em>' containment reference.
	 * @see #setNavigationLinks(fhiRCore.dataTypes.Boolean)
	 * @see fhiRCore.resources.ResourcesPackage#getTestScriptSetupSetupActionAssert_NavigationLinks()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.Boolean getNavigationLinks();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.TestScriptSetupSetupActionAssert#getNavigationLinks <em>Navigation Links</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Navigation Links</em>' containment reference.
	 * @see #getNavigationLinks()
	 * @generated
	 */
	void setNavigationLinks(fhiRCore.dataTypes.Boolean value);

	/**
	 * Returns the value of the '<em><b>Operator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operator</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' containment reference.
	 * @see #setOperator(Code)
	 * @see fhiRCore.resources.ResourcesPackage#getTestScriptSetupSetupActionAssert_Operator()
	 * @model containment="true"
	 * @generated
	 */
	Code getOperator();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.TestScriptSetupSetupActionAssert#getOperator <em>Operator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' containment reference.
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(Code value);

	/**
	 * Returns the value of the '<em><b>Path</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Path</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path</em>' containment reference.
	 * @see #setPath(fhiRCore.dataTypes.String)
	 * @see fhiRCore.resources.ResourcesPackage#getTestScriptSetupSetupActionAssert_Path()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getPath();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.TestScriptSetupSetupActionAssert#getPath <em>Path</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path</em>' containment reference.
	 * @see #getPath()
	 * @generated
	 */
	void setPath(fhiRCore.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Request Method</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Request Method</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Request Method</em>' containment reference.
	 * @see #setRequestMethod(Code)
	 * @see fhiRCore.resources.ResourcesPackage#getTestScriptSetupSetupActionAssert_RequestMethod()
	 * @model containment="true"
	 * @generated
	 */
	Code getRequestMethod();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.TestScriptSetupSetupActionAssert#getRequestMethod <em>Request Method</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Request Method</em>' containment reference.
	 * @see #getRequestMethod()
	 * @generated
	 */
	void setRequestMethod(Code value);

	/**
	 * Returns the value of the '<em><b>Request Url</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Request Url</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Request Url</em>' containment reference.
	 * @see #setRequestUrl(fhiRCore.dataTypes.String)
	 * @see fhiRCore.resources.ResourcesPackage#getTestScriptSetupSetupActionAssert_RequestUrl()
	 * @model containment="true"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='requestURL'"
	 * @generated
	 */
	fhiRCore.dataTypes.String getRequestUrl();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.TestScriptSetupSetupActionAssert#getRequestUrl <em>Request Url</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Request Url</em>' containment reference.
	 * @see #getRequestUrl()
	 * @generated
	 */
	void setRequestUrl(fhiRCore.dataTypes.String value);

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
	 * @see fhiRCore.resources.ResourcesPackage#getTestScriptSetupSetupActionAssert_Resource()
	 * @model containment="true"
	 * @generated
	 */
	Code getResource();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.TestScriptSetupSetupActionAssert#getResource <em>Resource</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource</em>' containment reference.
	 * @see #getResource()
	 * @generated
	 */
	void setResource(Code value);

	/**
	 * Returns the value of the '<em><b>Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Response</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Response</em>' containment reference.
	 * @see #setResponse(Code)
	 * @see fhiRCore.resources.ResourcesPackage#getTestScriptSetupSetupActionAssert_Response()
	 * @model containment="true"
	 * @generated
	 */
	Code getResponse();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.TestScriptSetupSetupActionAssert#getResponse <em>Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Response</em>' containment reference.
	 * @see #getResponse()
	 * @generated
	 */
	void setResponse(Code value);

	/**
	 * Returns the value of the '<em><b>Response Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Response Code</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Response Code</em>' containment reference.
	 * @see #setResponseCode(fhiRCore.dataTypes.String)
	 * @see fhiRCore.resources.ResourcesPackage#getTestScriptSetupSetupActionAssert_ResponseCode()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getResponseCode();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.TestScriptSetupSetupActionAssert#getResponseCode <em>Response Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Response Code</em>' containment reference.
	 * @see #getResponseCode()
	 * @generated
	 */
	void setResponseCode(fhiRCore.dataTypes.String value);

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
	 * @see fhiRCore.resources.ResourcesPackage#getTestScriptSetupSetupActionAssert_SourceId()
	 * @model containment="true"
	 * @generated
	 */
	Id getSourceId();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.TestScriptSetupSetupActionAssert#getSourceId <em>Source Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Id</em>' containment reference.
	 * @see #getSourceId()
	 * @generated
	 */
	void setSourceId(Id value);

	/**
	 * Returns the value of the '<em><b>Validate Profile Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Validate Profile Id</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Validate Profile Id</em>' containment reference.
	 * @see #setValidateProfileId(Id)
	 * @see fhiRCore.resources.ResourcesPackage#getTestScriptSetupSetupActionAssert_ValidateProfileId()
	 * @model containment="true"
	 * @generated
	 */
	Id getValidateProfileId();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.TestScriptSetupSetupActionAssert#getValidateProfileId <em>Validate Profile Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Validate Profile Id</em>' containment reference.
	 * @see #getValidateProfileId()
	 * @generated
	 */
	void setValidateProfileId(Id value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(fhiRCore.dataTypes.String)
	 * @see fhiRCore.resources.ResourcesPackage#getTestScriptSetupSetupActionAssert_Value()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getValue();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.TestScriptSetupSetupActionAssert#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(fhiRCore.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Warning Only</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Warning Only</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Warning Only</em>' containment reference.
	 * @see #setWarningOnly(fhiRCore.dataTypes.Boolean)
	 * @see fhiRCore.resources.ResourcesPackage#getTestScriptSetupSetupActionAssert_WarningOnly()
	 * @model containment="true" required="true"
	 * @generated
	 */
	fhiRCore.dataTypes.Boolean getWarningOnly();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.TestScriptSetupSetupActionAssert#getWarningOnly <em>Warning Only</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Warning Only</em>' containment reference.
	 * @see #getWarningOnly()
	 * @generated
	 */
	void setWarningOnly(fhiRCore.dataTypes.Boolean value);

} // TestScriptSetupSetupActionAssert
