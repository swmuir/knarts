/**
 */
package org.hl7.knowledgeartifact.r1;

import org.eclipse.emf.ecore.EObject;

import org.hl7.cdsdt.r2.TEL;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Knowledge Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * KnowledgeResource specifies a reference to an
 * 				associated resource of relevance to the artifact such as a
 * 				guideline, a performance measure, another knowledge artifact, or a
 * 				source of evidence for the artifact.
 * 			
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.knowledgeartifact.r1.KnowledgeResource#getIdentifiers <em>Identifiers</em>}</li>
 *   <li>{@link org.hl7.knowledgeartifact.r1.KnowledgeResource#getTemplateIds <em>Template Ids</em>}</li>
 *   <li>{@link org.hl7.knowledgeartifact.r1.KnowledgeResource#getTitle <em>Title</em>}</li>
 *   <li>{@link org.hl7.knowledgeartifact.r1.KnowledgeResource#getLocation <em>Location</em>}</li>
 *   <li>{@link org.hl7.knowledgeartifact.r1.KnowledgeResource#getDescription <em>Description</em>}</li>
 *   <li>{@link org.hl7.knowledgeartifact.r1.KnowledgeResource#getCitation <em>Citation</em>}</li>
 * </ul>
 *
 * @see org.hl7.knowledgeartifact.r1.R1Package#getKnowledgeResource()
 * @model extendedMetaData="name='KnowledgeResource' kind='elementOnly'"
 * @generated
 */
public interface KnowledgeResource extends EObject {
	/**
	 * Returns the value of the '<em><b>Identifiers</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The set of unique identifiers for this resource.
	 * 					
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifiers</em>' containment reference.
	 * @see #setIdentifiers(IdentifiersType)
	 * @see org.hl7.knowledgeartifact.r1.R1Package#getKnowledgeResource_Identifiers()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='identifiers' namespace='##targetNamespace'"
	 * @generated
	 */
	IdentifiersType getIdentifiers();

	/**
	 * Sets the value of the '{@link org.hl7.knowledgeartifact.r1.KnowledgeResource#getIdentifiers <em>Identifiers</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identifiers</em>' containment reference.
	 * @see #getIdentifiers()
	 * @generated
	 */
	void setIdentifiers(IdentifiersType value);

	/**
	 * Returns the value of the '<em><b>Template Ids</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The set of unique identifiers for the templates
	 * 						associated with this resource.
	 * 					
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Template Ids</em>' containment reference.
	 * @see #setTemplateIds(TemplateIdsType)
	 * @see org.hl7.knowledgeartifact.r1.R1Package#getKnowledgeResource_TemplateIds()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='templateIds' namespace='##targetNamespace'"
	 * @generated
	 */
	TemplateIdsType getTemplateIds();

	/**
	 * Sets the value of the '{@link org.hl7.knowledgeartifact.r1.KnowledgeResource#getTemplateIds <em>Template Ids</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Template Ids</em>' containment reference.
	 * @see #getTemplateIds()
	 * @generated
	 */
	void setTemplateIds(TemplateIdsType value);

	/**
	 * Returns the value of the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The title of the document
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Title</em>' containment reference.
	 * @see #setTitle(FormattedText)
	 * @see org.hl7.knowledgeartifact.r1.R1Package#getKnowledgeResource_Title()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='title' namespace='##targetNamespace'"
	 * @generated
	 */
	FormattedText getTitle();

	/**
	 * Sets the value of the '{@link org.hl7.knowledgeartifact.r1.KnowledgeResource#getTitle <em>Title</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' containment reference.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(FormattedText value);

	/**
	 * Returns the value of the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The URL of the given resource.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Location</em>' containment reference.
	 * @see #setLocation(TEL)
	 * @see org.hl7.knowledgeartifact.r1.R1Package#getKnowledgeResource_Location()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='location' namespace='##targetNamespace'"
	 * @generated
	 */
	TEL getLocation();

	/**
	 * Sets the value of the '{@link org.hl7.knowledgeartifact.r1.KnowledgeResource#getLocation <em>Location</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' containment reference.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(TEL value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A short textual description of the resource.
	 * 					
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(FormattedText)
	 * @see org.hl7.knowledgeartifact.r1.R1Package#getKnowledgeResource_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	FormattedText getDescription();

	/**
	 * Sets the value of the '{@link org.hl7.knowledgeartifact.r1.KnowledgeResource#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(FormattedText value);

	/**
	 * Returns the value of the '<em><b>Citation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The resource citation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Citation</em>' containment reference.
	 * @see #setCitation(FormattedText)
	 * @see org.hl7.knowledgeartifact.r1.R1Package#getKnowledgeResource_Citation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='citation' namespace='##targetNamespace'"
	 * @generated
	 */
	FormattedText getCitation();

	/**
	 * Sets the value of the '{@link org.hl7.knowledgeartifact.r1.KnowledgeResource#getCitation <em>Citation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Citation</em>' containment reference.
	 * @see #getCitation()
	 * @generated
	 */
	void setCitation(FormattedText value);

} // KnowledgeResource
