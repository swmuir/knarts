/**
 */
package fhiRCore.dataTypes;

import fhiRCore.resources.Resource;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Related Artifact</b></em>'.
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
 *   <li>{@link fhiRCore.dataTypes.RelatedArtifact#getType <em>Type</em>}</li>
 *   <li>{@link fhiRCore.dataTypes.RelatedArtifact#getLabel <em>Label</em>}</li>
 *   <li>{@link fhiRCore.dataTypes.RelatedArtifact#getDisplay <em>Display</em>}</li>
 *   <li>{@link fhiRCore.dataTypes.RelatedArtifact#getCitation <em>Citation</em>}</li>
 *   <li>{@link fhiRCore.dataTypes.RelatedArtifact#getUrl <em>Url</em>}</li>
 *   <li>{@link fhiRCore.dataTypes.RelatedArtifact#getDocument <em>Document</em>}</li>
 *   <li>{@link fhiRCore.dataTypes.RelatedArtifact#getResource <em>Resource</em>}</li>
 * </ul>
 *
 * @see fhiRCore.dataTypes.DataTypesPackage#getRelatedArtifact()
 * @model
 * @generated
 */
public interface RelatedArtifact extends DataType {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(Code)
	 * @see fhiRCore.dataTypes.DataTypesPackage#getRelatedArtifact_Type()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Code getType();

	/**
	 * Sets the value of the '{@link fhiRCore.dataTypes.RelatedArtifact#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(Code value);

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
	 * @see fhiRCore.dataTypes.DataTypesPackage#getRelatedArtifact_Label()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getLabel();

	/**
	 * Sets the value of the '{@link fhiRCore.dataTypes.RelatedArtifact#getLabel <em>Label</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' containment reference.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(fhiRCore.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Display</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Display</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Display</em>' containment reference.
	 * @see #setDisplay(fhiRCore.dataTypes.String)
	 * @see fhiRCore.dataTypes.DataTypesPackage#getRelatedArtifact_Display()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getDisplay();

	/**
	 * Sets the value of the '{@link fhiRCore.dataTypes.RelatedArtifact#getDisplay <em>Display</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Display</em>' containment reference.
	 * @see #getDisplay()
	 * @generated
	 */
	void setDisplay(fhiRCore.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Citation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Citation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Citation</em>' containment reference.
	 * @see #setCitation(Markdown)
	 * @see fhiRCore.dataTypes.DataTypesPackage#getRelatedArtifact_Citation()
	 * @model containment="true"
	 * @generated
	 */
	Markdown getCitation();

	/**
	 * Sets the value of the '{@link fhiRCore.dataTypes.RelatedArtifact#getCitation <em>Citation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Citation</em>' containment reference.
	 * @see #getCitation()
	 * @generated
	 */
	void setCitation(Markdown value);

	/**
	 * Returns the value of the '<em><b>Url</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Url</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Url</em>' containment reference.
	 * @see #setUrl(Url)
	 * @see fhiRCore.dataTypes.DataTypesPackage#getRelatedArtifact_Url()
	 * @model containment="true"
	 * @generated
	 */
	Url getUrl();

	/**
	 * Sets the value of the '{@link fhiRCore.dataTypes.RelatedArtifact#getUrl <em>Url</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Url</em>' containment reference.
	 * @see #getUrl()
	 * @generated
	 */
	void setUrl(Url value);

	/**
	 * Returns the value of the '<em><b>Document</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Document</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Document</em>' containment reference.
	 * @see #setDocument(Attachment)
	 * @see fhiRCore.dataTypes.DataTypesPackage#getRelatedArtifact_Document()
	 * @model containment="true"
	 * @generated
	 */
	Attachment getDocument();

	/**
	 * Sets the value of the '{@link fhiRCore.dataTypes.RelatedArtifact#getDocument <em>Document</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Document</em>' containment reference.
	 * @see #getDocument()
	 * @generated
	 */
	void setDocument(Attachment value);

	/**
	 * Returns the value of the '<em><b>Resource</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource</em>' containment reference.
	 * @see #setResource(Resource)
	 * @see fhiRCore.dataTypes.DataTypesPackage#getRelatedArtifact_Resource()
	 * @model containment="true"
	 * @generated
	 */
	Resource getResource();

	/**
	 * Sets the value of the '{@link fhiRCore.dataTypes.RelatedArtifact#getResource <em>Resource</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource</em>' containment reference.
	 * @see #getResource()
	 * @generated
	 */
	void setResource(Resource value);

} // RelatedArtifact
