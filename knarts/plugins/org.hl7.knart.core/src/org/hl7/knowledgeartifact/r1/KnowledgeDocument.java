/**
 */
package org.hl7.knowledgeartifact.r1;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Knowledge Document</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A knowledge document is an instance of a CDS knowledge artifact such
 * 				as a rule, an order set, or a documentation template.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.knowledgeartifact.r1.KnowledgeDocument#getMetadata <em>Metadata</em>}</li>
 *   <li>{@link org.hl7.knowledgeartifact.r1.KnowledgeDocument#getExternalData <em>External Data</em>}</li>
 *   <li>{@link org.hl7.knowledgeartifact.r1.KnowledgeDocument#getExpressions <em>Expressions</em>}</li>
 *   <li>{@link org.hl7.knowledgeartifact.r1.KnowledgeDocument#getTriggers <em>Triggers</em>}</li>
 *   <li>{@link org.hl7.knowledgeartifact.r1.KnowledgeDocument#getConditions <em>Conditions</em>}</li>
 *   <li>{@link org.hl7.knowledgeartifact.r1.KnowledgeDocument#getBehaviors <em>Behaviors</em>}</li>
 *   <li>{@link org.hl7.knowledgeartifact.r1.KnowledgeDocument#getActionGroup <em>Action Group</em>}</li>
 * </ul>
 *
 * @see org.hl7.knowledgeartifact.r1.R1Package#getKnowledgeDocument()
 * @model extendedMetaData="name='KnowledgeDocument' kind='elementOnly'"
 * @generated
 */
public interface KnowledgeDocument extends EObject {
	/**
	 * Returns the value of the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The metadata section of the knowledge document defines the
	 * 						core metadata associated with this CDS knowledge artifact such as (1) the
	 * 						unique identifier for this artifact, (2) the unique identifier for its
	 * 						associated template(s), (3) the title and description of the artifact, (4)
	 * 						the status and history of the artifact, (5) any relevant entities associated
	 * 						with this artifact, and (6) information needed to categorize and retrieve
	 * 						the artifact.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Metadata</em>' containment reference.
	 * @see #setMetadata(Metadata)
	 * @see org.hl7.knowledgeartifact.r1.R1Package#getKnowledgeDocument_Metadata()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='metadata' namespace='##targetNamespace'"
	 * @generated
	 */
	Metadata getMetadata();

	/**
	 * Sets the value of the '{@link org.hl7.knowledgeartifact.r1.KnowledgeDocument#getMetadata <em>Metadata</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Metadata</em>' containment reference.
	 * @see #getMetadata()
	 * @generated
	 */
	void setMetadata(Metadata value);

	/**
	 * Returns the value of the '<em><b>External Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The externalData section allows a CDS artifact author to
	 * 						define 'named expressions' to fetch information from an external source and
	 * 						bind this information to the 'context' of the knowledge artifact for later
	 * 						reference by the logic modules (e.g., the condition for the knowledge
	 * 						artifact or actions). It is the responsibility of the implementation to
	 * 						determine the nature of this boundary and how to fetch this information. For
	 * 						instance, one may write an expression to retrieve from a patient vMR the age
	 * 						of a patient or a list of clinical problems whose problem code are contained
	 * 						in a given ICD-9 value set. The age value and the list of patient problems
	 * 						may then be used in the 'condition' section of the same knowledge artifact
	 * 						to determine the applicability of the knowledge document to the given
	 * 						patient.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>External Data</em>' containment reference.
	 * @see #setExternalData(ExternalDataType)
	 * @see org.hl7.knowledgeartifact.r1.R1Package#getKnowledgeDocument_ExternalData()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='externalData' namespace='##targetNamespace'"
	 * @generated
	 */
	ExternalDataType getExternalData();

	/**
	 * Sets the value of the '{@link org.hl7.knowledgeartifact.r1.KnowledgeDocument#getExternalData <em>External Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>External Data</em>' containment reference.
	 * @see #getExternalData()
	 * @generated
	 */
	void setExternalData(ExternalDataType value);

	/**
	 * Returns the value of the '<em><b>Expressions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The expressions section allows a CDS artifact author to define
	 * 						'named expressions' that can be referenced anywhere within expressions in
	 * 						the artifact. This allows expression logic to be reused, as well as to be
	 * 						organized for readability and maintainability.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Expressions</em>' containment reference.
	 * @see #setExpressions(ExpressionsType)
	 * @see org.hl7.knowledgeartifact.r1.R1Package#getKnowledgeDocument_Expressions()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='expressions' namespace='##targetNamespace'"
	 * @generated
	 */
	ExpressionsType getExpressions();

	/**
	 * Sets the value of the '{@link org.hl7.knowledgeartifact.r1.KnowledgeDocument#getExpressions <em>Expressions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expressions</em>' containment reference.
	 * @see #getExpressions()
	 * @generated
	 */
	void setExpressions(ExpressionsType value);

	/**
	 * Returns the value of the '<em><b>Triggers</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The triggers section defines the list of all triggers that 'activate' or 'trigger' the CDS knowledge artifact. For instance, opening a patient record may trigger a rule to execute if the conditions of the rule are met. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Triggers</em>' containment reference.
	 * @see #setTriggers(Triggers)
	 * @see org.hl7.knowledgeartifact.r1.R1Package#getKnowledgeDocument_Triggers()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='triggers' namespace='##targetNamespace'"
	 * @generated
	 */
	Triggers getTriggers();

	/**
	 * Sets the value of the '{@link org.hl7.knowledgeartifact.r1.KnowledgeDocument#getTriggers <em>Triggers</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Triggers</em>' containment reference.
	 * @see #getTriggers()
	 * @generated
	 */
	void setTriggers(Triggers value);

	/**
	 * Returns the value of the '<em><b>Conditions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The conditions section lists all conditions that pertain to
	 * 						the knowledge artifact. Conditions define the logic that determine the
	 * 						applicability of the artifact in the given context, any precondition or post
	 * 						condition, and/or any inclusion and exclusion criteria for the given CDS
	 * 						artifact. Conditions are structured as expressions to be evaluated in the
	 * 						target system.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Conditions</em>' containment reference.
	 * @see #setConditions(Conditions)
	 * @see org.hl7.knowledgeartifact.r1.R1Package#getKnowledgeDocument_Conditions()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='conditions' namespace='##targetNamespace'"
	 * @generated
	 */
	Conditions getConditions();

	/**
	 * Sets the value of the '{@link org.hl7.knowledgeartifact.r1.KnowledgeDocument#getConditions <em>Conditions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conditions</em>' containment reference.
	 * @see #getConditions()
	 * @generated
	 */
	void setConditions(Conditions value);

	/**
	 * Returns the value of the '<em><b>Behaviors</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The behaviors section defines the set of behaviors for this
	 * 						knowledge document. While there are no artifact-level behaviors defined at
	 * 						this time, this element is included as a point of extension, should it be
	 * 						needed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Behaviors</em>' containment reference.
	 * @see #setBehaviors(Behaviors)
	 * @see org.hl7.knowledgeartifact.r1.R1Package#getKnowledgeDocument_Behaviors()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='behaviors' namespace='##targetNamespace'"
	 * @generated
	 */
	Behaviors getBehaviors();

	/**
	 * Sets the value of the '{@link org.hl7.knowledgeartifact.r1.KnowledgeDocument#getBehaviors <em>Behaviors</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Behaviors</em>' containment reference.
	 * @see #getBehaviors()
	 * @generated
	 */
	void setBehaviors(Behaviors value);

	/**
	 * Returns the value of the '<em><b>Action Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The actionGroups element is the top-level container for the
	 * 						groups of actions that make up a given knowledge document. This container
	 * 						defines the main content of the knowledge artifact: logical grouping
	 * 						constructs such as the clinical sections and orderables in an order set, the
	 * 						tasks to be performed by a rule, or the sections and menu choices that make
	 * 						up a document template. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Action Group</em>' containment reference.
	 * @see #setActionGroup(ActionGroup)
	 * @see org.hl7.knowledgeartifact.r1.R1Package#getKnowledgeDocument_ActionGroup()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='actionGroup' namespace='##targetNamespace'"
	 * @generated
	 */
	ActionGroup getActionGroup();

	/**
	 * Sets the value of the '{@link org.hl7.knowledgeartifact.r1.KnowledgeDocument#getActionGroup <em>Action Group</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action Group</em>' containment reference.
	 * @see #getActionGroup()
	 * @generated
	 */
	void setActionGroup(ActionGroup value);

} // KnowledgeDocument
