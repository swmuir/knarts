/**
 */
package org.hl7.knowledgeartifact.r2;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * This file defines the root knowledge document type and
 * 			element.
 * 
 * 			This file defines the meta data components used within a knowledge artifact.
 * 		
 * 
 * 			This file defines the base types used in defining
 * 			knowledge artifacts.
 * 		
 * 
 * 			This file defines the ResourceRelationshipType enumeration.
 * 		
 * Specifies data types used.  The data types are a simplified/constrained version of the HL7 version 3 datatypes specification, release 2, which is itself based on the implementable specification of ISO 21090 data types.
 * 
 *     XHTML 1.0 (Second Edition) Strict in XML Schema
 * 
 *     This is the same as HTML 4 Strict except for
 *     changes due to the differences between XML and SGML.
 * 
 *     Namespace = http://www.w3.org/1999/xhtml
 * 
 *     For further information, see: http://www.w3.org/TR/xhtml1
 * 
 *     Copyright (c) 1998-2002 W3C (MIT, INRIA, Keio),
 *     All Rights Reserved. 
 * 
 *     The DTD version is identified by the PUBLIC and SYSTEM identifiers:
 * 
 *     PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN"
 *     SYSTEM "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd"
 * 
 *     $Id: xhtml1-strict.xsd,v 1.2 2002/08/28 08:05:44 mimasa Exp $
 *     
 * 
 *     ================ Character mnemonic entities =========================
 * 
 *     XHTML entity sets are identified by the PUBLIC and SYSTEM identifiers:
 *   
 *     PUBLIC "-//W3C//ENTITIES Latin 1 for XHTML//EN"
 *     SYSTEM "http://www.w3.org/TR/xhtml1/DTD/xhtml-lat1.ent"
 * 
 *     PUBLIC "-//W3C//ENTITIES Special for XHTML//EN"
 *     SYSTEM "http://www.w3.org/TR/xhtml1/DTD/xhtml-special.ent"
 * 
 *     PUBLIC "-//W3C//ENTITIES Symbols for XHTML//EN"
 *     SYSTEM "http://www.w3.org/TR/xhtml1/DTD/xhtml-symbol.ent"
 *     
 * 
 *     ================== Imported Names ====================================
 *     
 * 
 *     these are used for image maps
 *     
 * 
 *     =================== Generic Attributes ===============================
 *     
 * 
 *     =================== Text Elements ====================================
 *     
 * 
 *     ================== Block level elements ==============================
 *     
 * 
 *     ================== Content models for exclusions =====================
 *     
 * 
 *     ================ Document Structure ==================================
 *     
 * 
 *     ================ Document Head =======================================
 *     
 * 
 *     =================== Document Body ====================================
 *     
 * 
 *     =================== Paragraphs =======================================
 *     
 * 
 *     =================== Headings =========================================
 * 
 *     There are six levels of headings from h1 (the most important)
 *     to h6 (the least important).
 *     
 * 
 *     =================== Lists ============================================
 *     
 * 
 *     definition lists - dt for term, dd for its definition
 *     
 * 
 *     =================== Address ==========================================
 *     
 * 
 *     =================== Horizontal Rule ==================================
 *     
 * 
 *     =================== Preformatted Text ================================
 *     
 * 
 *     =================== Block-like Quotes ================================
 *     
 * 
 *     =================== Inserted/Deleted Text ============================
 * 
 *     ins/del are allowed in block and inline content, but its
 *     inappropriate to include block content within an ins element
 *     occurring in inline content.
 *     
 * 
 *     ================== The Anchor Element ================================
 *     
 * 
 *     ===================== Inline Elements ================================
 *     
 * 
 *     ==================== Object ======================================
 * 
 *     object is used to embed objects as part of HTML pages.
 *     param elements should precede other content. Parameters
 *     can also be expressed as attribute/value pairs on the
 *     object element itself when brevity is desired.
 *     
 * 
 *     =================== Images ===========================================
 * 
 *     To avoid accessibility problems for people who aren't
 *     able to see the image, you should provide a text
 *     description using the alt and longdesc attributes.
 *     In addition, avoid the use of server-side image maps.
 *     Note that in this DTD there is no name attribute. That
 *     is only available in the transitional and frameset DTD.
 *     
 * 
 *     ================== Client-side image maps ============================
 * 
 *     These can be placed in the same document or grouped in a
 *     separate document although this isn't yet widely supported
 *     
 * 
 *     ================ Forms ===============================================
 *     
 * 
 *     ======================= Tables =======================================
 * 
 *     Derived from IETF HTML table standard, see [RFC1942]
 *     
 * 
 *     Use thead to duplicate headers when breaking table
 *     across page boundaries, or for static headers when
 *     tbody sections are rendered in scrolling panel.
 * 
 *     Use tfoot to duplicate footers when breaking table
 *     across page boundaries, or for static footers when
 *     tbody sections are rendered in scrolling panel.
 * 
 *     Use multiple tbody sections when rules are needed
 *     between groups of table rows.
 *     
 * 
 *     th is for headers, td for data and for cells acting as both
 *     
 * 
 *    <div xmlns="http://www.w3.org/1999/xhtml">
 *     <h1>About the XML namespace</h1>
 * 
 *     <div class="bodytext">
 *      <p>
 *       This schema document describes the XML namespace, in a form
 *       suitable for import by other schema documents.
 *      </p>
 *      <p>
 *       See <a href="http://www.w3.org/XML/1998/namespace.html">
 *       http://www.w3.org/XML/1998/namespace.html</a> and
 *       <a href="http://www.w3.org/TR/REC-xml">
 *       http://www.w3.org/TR/REC-xml</a> for information 
 *       about this namespace.
 *      </p>
 *      <p>
 *       Note that local names in this namespace are intended to be
 *       defined only by the World Wide Web Consortium or its subgroups.
 *       The names currently defined in this namespace are listed below.
 *       They should not be used with conflicting semantics by any Working
 *       Group, specification, or document instance.
 *      </p>
 *      <p>   
 *       See further below in this document for more information about <a href="#usage">how to refer to this schema document from your own
 *       XSD schema documents</a> and about <a href="#nsversioning">the
 *       namespace-versioning policy governing this schema document</a>.
 *      </p>
 *     </div>
 *    </div>
 *   
 * 
 *    <div xmlns="http://www.w3.org/1999/xhtml">
 *    
 *     <h3>Father (in any context at all)</h3> 
 * 
 *     <div class="bodytext">
 *      <p>
 *       denotes Jon Bosak, the chair of 
 *       the original XML Working Group.  This name is reserved by 
 *       the following decision of the W3C XML Plenary and 
 *       XML Coordination groups:
 *      </p>
 *      <blockquote>
 *        <p>
 * 	In appreciation for his vision, leadership and
 * 	dedication the W3C XML Plenary on this 10th day of
 * 	February, 2000, reserves for Jon Bosak in perpetuity
 * 	the XML name "xml:Father".
 *        </p>
 *      </blockquote>
 *     </div>
 *    </div>
 *   
 * 
 *    <div id="usage" xml:id="usage" xmlns="http://www.w3.org/1999/xhtml">
 *     <h2>
 *       <a name="usage">About this schema document</a>
 *     </h2>
 * 
 *     <div class="bodytext">
 *      <p>
 *       This schema defines attributes and an attribute group suitable
 *       for use by schemas wishing to allow <code>xml:base</code>,
 *       <code>xml:lang</code>, <code>xml:space</code> or
 *       <code>xml:id</code> attributes on elements they define.
 *      </p>
 *      <p>
 *       To enable this, such a schema must import this schema for
 *       the XML namespace, e.g. as follows:
 *      </p>
 *      <pre>
 *           &lt;schema . . .&gt;
 *            . . .
 *            &lt;import namespace="http://www.w3.org/XML/1998/namespace"
 *                       schemaLocation="http://www.w3.org/2001/xml.xsd"/&gt;
 *      </pre>
 *      <p>
 *       or
 *      </p>
 *      <pre>
 *            &lt;import namespace="http://www.w3.org/XML/1998/namespace"
 *                       schemaLocation="http://www.w3.org/2009/01/xml.xsd"/&gt;
 *      </pre>
 *      <p>
 *       Subsequently, qualified reference to any of the attributes or the
 *       group defined below will have the desired effect, e.g.
 *      </p>
 *      <pre>
 *           &lt;type . . .&gt;
 *            . . .
 *            &lt;attributeGroup ref="xml:specialAttrs"/&gt;
 *      </pre>
 *      <p>
 *       will define a type which will schema-validate an instance element
 *       with any of those attributes.
 *      </p>
 *     </div>
 *    </div>
 *   
 * 
 *    <div id="nsversioning" xml:id="nsversioning" xmlns="http://www.w3.org/1999/xhtml">
 *     <h2>
 *       <a name="nsversioning">Versioning policy for this schema document</a>
 *     </h2>
 *     <div class="bodytext">
 *      <p>
 *       In keeping with the XML Schema WG's standard versioning
 *       policy, this schema document will persist at
 *       <a href="http://www.w3.org/2009/01/xml.xsd">
 *        http://www.w3.org/2009/01/xml.xsd</a>.
 *      </p>
 *      <p>
 *       At the date of issue it can also be found at
 *       <a href="http://www.w3.org/2001/xml.xsd">
 *        http://www.w3.org/2001/xml.xsd</a>.
 *      </p>
 *      <p>
 *       The schema document at that URI may however change in the future,
 *       in order to remain compatible with the latest version of XML
 *       Schema itself, or with the XML namespace itself.  In other words,
 *       if the XML Schema or XML namespaces change, the version of this
 *       document at <a href="http://www.w3.org/2001/xml.xsd">
 *        http://www.w3.org/2001/xml.xsd 
 *       </a> 
 *       will change accordingly; the version at 
 *       <a href="http://www.w3.org/2009/01/xml.xsd">
 *        http://www.w3.org/2009/01/xml.xsd 
 *       </a> 
 *       will not change.
 *      </p>
 *      <p>
 *       Previous dated (and unchanging) versions of this schema 
 *       document are at:
 *      </p>
 *      <ul>
 *       <li>
 *           <a href="http://www.w3.org/2009/01/xml.xsd">
 * 	http://www.w3.org/2009/01/xml.xsd</a>
 *         </li>
 *       <li>
 *           <a href="http://www.w3.org/2007/08/xml.xsd">
 * 	http://www.w3.org/2007/08/xml.xsd</a>
 *         </li>
 *       <li>
 *           <a href="http://www.w3.org/2004/10/xml.xsd">
 * 	http://www.w3.org/2004/10/xml.xsd</a>
 *         </li>
 *       <li>
 *           <a href="http://www.w3.org/2001/03/xml.xsd">
 * 	http://www.w3.org/2001/03/xml.xsd</a>
 *         </li>
 *      </ul>
 *     </div>
 *    </div>
 *   
 * 
 * 			This file defines the ArtifactLifeCycleEventType enumeration.
 * 		
 * 
 * 			This file defines the ArtifactStatusType enumeration.
 * 		
 * 
 * 			This file defines the ArtifactType enumeration.
 * 		
 * 
 * 			This file defines the ContributorType enumeration.
 * 		
 * 
 * 			This file defines the CoverageType enumeration.
 * 		
 *  This file defines the Action types used to describe guidance within a
 * 			knowledge artifact. 
 * 
 * 			This file defines the behaviors used within knowledge documents.
 * 		
 * 
 * 			This file defines the BehaviorType enumeration.
 * 		
 * 
 * 			This file defines the Actor type.
 * 		
 * 
 * 			This file defines catalog items used to describe
 * 			questions and responses for the documentation template knowledge
 * 			artifact type.
 * 		
 * 
 * 			This file defines the Cardinality enumeration.
 * 		
 * 
 * 			This file defines the RangeConstraintType enumeration.
 * 		
 * 
 * 			This file defines the ValueType enumeration.
 * 		
 * 
 * 			This file defines the expression extensions that introduce clinically relevant dependencies such as clinical data access, terminology, and value set considerations.
 * 		
 * This file defines the core expression components used throughout artifacts based on the Expression Logical Model. The core expression components defined here are intended to be general purpose, and do not reference anything specific to the clinical quality domain. This layering is intended to isolate the conceptual elements of a general purpose expression language from the clinically-focused operations relevant to the clinical quality domain.
 * 
 * 			This file defines the condition components used in knowledge artifacts.
 * 		
 * 
 * 			This file defines the ConditionRoleType enumeration.
 * 		
 * 
 * 			This file defines the trigger components used in
 * 			knowledge artifacts.
 * 		
 * 
 * 			This file defines the DataEventType enumeration.
 * 		
 * This file defines the root knowledge document type and
 * 			element.
 * This file defines the root knowledge document type and
 * 			element.
 * This file defines the root knowledge document type and
 * 			element.
 * 
 * 			This file defines the Metadata Binding Type enumeration.
 * 		
 * <!-- end-model-doc -->
 * @see org.hl7.knowledgeartifact.r2.R2Factory
 * @model kind="package"
 * @generated
 */
public interface R2Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "r2";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "urn:hl7-org:knowledgeartifact:r2";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "r2";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	R2Package eINSTANCE = org.hl7.knowledgeartifact.r2.impl.R2PackageImpl.init();

	/**
	 * The meta object id for the '{@link org.hl7.knowledgeartifact.r2.impl.ActionBaseImpl <em>Action Base</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r2.impl.ActionBaseImpl
	 * @see org.hl7.knowledgeartifact.r2.impl.R2PackageImpl#getActionBase()
	 * @generated
	 */
	int ACTION_BASE = 0;

	/**
	 * The feature id for the '<em><b>Action Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_BASE__ACTION_ID = 0;

	/**
	 * The feature id for the '<em><b>Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_BASE__NUMBER = 1;

	/**
	 * The feature id for the '<em><b>Supporting Evidence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_BASE__SUPPORTING_EVIDENCE = 2;

	/**
	 * The feature id for the '<em><b>Supporting Resources</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_BASE__SUPPORTING_RESOURCES = 3;

	/**
	 * The feature id for the '<em><b>Actors</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_BASE__ACTORS = 4;

	/**
	 * The feature id for the '<em><b>Behaviors</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_BASE__BEHAVIORS = 5;

	/**
	 * The feature id for the '<em><b>Conditions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_BASE__CONDITIONS = 6;

	/**
	 * The feature id for the '<em><b>Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_BASE__ORDER = 7;

	/**
	 * The number of structural features of the '<em>Action Base</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_BASE_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Action Base</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_BASE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.hl7.knowledgeartifact.r2.impl.ActionGroupImpl <em>Action Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r2.impl.ActionGroupImpl
	 * @see org.hl7.knowledgeartifact.r2.impl.R2PackageImpl#getActionGroup()
	 * @generated
	 */
	int ACTION_GROUP = 1;

	/**
	 * The feature id for the '<em><b>Action Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_GROUP__ACTION_ID = ACTION_BASE__ACTION_ID;

	/**
	 * The feature id for the '<em><b>Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_GROUP__NUMBER = ACTION_BASE__NUMBER;

	/**
	 * The feature id for the '<em><b>Supporting Evidence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_GROUP__SUPPORTING_EVIDENCE = ACTION_BASE__SUPPORTING_EVIDENCE;

	/**
	 * The feature id for the '<em><b>Supporting Resources</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_GROUP__SUPPORTING_RESOURCES = ACTION_BASE__SUPPORTING_RESOURCES;

	/**
	 * The feature id for the '<em><b>Actors</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_GROUP__ACTORS = ACTION_BASE__ACTORS;

	/**
	 * The feature id for the '<em><b>Behaviors</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_GROUP__BEHAVIORS = ACTION_BASE__BEHAVIORS;

	/**
	 * The feature id for the '<em><b>Conditions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_GROUP__CONDITIONS = ACTION_BASE__CONDITIONS;

	/**
	 * The feature id for the '<em><b>Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_GROUP__ORDER = ACTION_BASE__ORDER;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_GROUP__TITLE = ACTION_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_GROUP__DESCRIPTION = ACTION_BASE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Represented Concepts</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_GROUP__REPRESENTED_CONCEPTS = ACTION_BASE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Sub Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_GROUP__SUB_ELEMENTS = ACTION_BASE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Action Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_GROUP_FEATURE_COUNT = ACTION_BASE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Action Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_GROUP_OPERATION_COUNT = ACTION_BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.knowledgeartifact.r2.impl.ActionRefImpl <em>Action Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r2.impl.ActionRefImpl
	 * @see org.hl7.knowledgeartifact.r2.impl.R2PackageImpl#getActionRef()
	 * @generated
	 */
	int ACTION_REF = 2;

	/**
	 * The feature id for the '<em><b>Action Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_REF__ACTION_ID = ACTION_BASE__ACTION_ID;

	/**
	 * The feature id for the '<em><b>Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_REF__NUMBER = ACTION_BASE__NUMBER;

	/**
	 * The feature id for the '<em><b>Supporting Evidence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_REF__SUPPORTING_EVIDENCE = ACTION_BASE__SUPPORTING_EVIDENCE;

	/**
	 * The feature id for the '<em><b>Supporting Resources</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_REF__SUPPORTING_RESOURCES = ACTION_BASE__SUPPORTING_RESOURCES;

	/**
	 * The feature id for the '<em><b>Actors</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_REF__ACTORS = ACTION_BASE__ACTORS;

	/**
	 * The feature id for the '<em><b>Behaviors</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_REF__BEHAVIORS = ACTION_BASE__BEHAVIORS;

	/**
	 * The feature id for the '<em><b>Conditions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_REF__CONDITIONS = ACTION_BASE__CONDITIONS;

	/**
	 * The feature id for the '<em><b>Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_REF__ORDER = ACTION_BASE__ORDER;

	/**
	 * The feature id for the '<em><b>Library Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_REF__LIBRARY_NAME = ACTION_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Referenced Action Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_REF__REFERENCED_ACTION_ID = ACTION_BASE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Action Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_REF_FEATURE_COUNT = ACTION_BASE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Action Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_REF_OPERATION_COUNT = ACTION_BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.knowledgeartifact.r2.impl.ActorImpl <em>Actor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r2.impl.ActorImpl
	 * @see org.hl7.knowledgeartifact.r2.impl.R2PackageImpl#getActor()
	 * @generated
	 */
	int ACTOR = 3;

	/**
	 * The feature id for the '<em><b>Actor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__ACTOR = 0;

	/**
	 * The number of structural features of the '<em>Actor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Actor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.hl7.knowledgeartifact.r2.impl.ActorsTypeImpl <em>Actors Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r2.impl.ActorsTypeImpl
	 * @see org.hl7.knowledgeartifact.r2.impl.R2PackageImpl#getActorsType()
	 * @generated
	 */
	int ACTORS_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Actor</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTORS_TYPE__ACTOR = 0;

	/**
	 * The number of structural features of the '<em>Actors Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTORS_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Actors Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTORS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.hl7.knowledgeartifact.r2.impl.AddressesTypeImpl <em>Addresses Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r2.impl.AddressesTypeImpl
	 * @see org.hl7.knowledgeartifact.r2.impl.R2PackageImpl#getAddressesType()
	 * @generated
	 */
	int ADDRESSES_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Address</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESSES_TYPE__ADDRESS = 0;

	/**
	 * The number of structural features of the '<em>Addresses Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESSES_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Addresses Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESSES_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.hl7.knowledgeartifact.r2.impl.ApplicabilityTypeImpl <em>Applicability Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r2.impl.ApplicabilityTypeImpl
	 * @see org.hl7.knowledgeartifact.r2.impl.R2PackageImpl#getApplicabilityType()
	 * @generated
	 */
	int APPLICABILITY_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Coverage</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICABILITY_TYPE__COVERAGE = 0;

	/**
	 * The number of structural features of the '<em>Applicability Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICABILITY_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Applicability Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICABILITY_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.hl7.knowledgeartifact.r2.impl.ArtifactLifeCycleEventImpl <em>Artifact Life Cycle Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r2.impl.ArtifactLifeCycleEventImpl
	 * @see org.hl7.knowledgeartifact.r2.impl.R2PackageImpl#getArtifactLifeCycleEvent()
	 * @generated
	 */
	int ARTIFACT_LIFE_CYCLE_EVENT = 7;

	/**
	 * The feature id for the '<em><b>Event Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_LIFE_CYCLE_EVENT__EVENT_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Event Date Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_LIFE_CYCLE_EVENT__EVENT_DATE_TIME = 1;

	/**
	 * The number of structural features of the '<em>Artifact Life Cycle Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_LIFE_CYCLE_EVENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Artifact Life Cycle Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_LIFE_CYCLE_EVENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.hl7.knowledgeartifact.r2.impl.ArtifactSummaryImpl <em>Artifact Summary</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r2.impl.ArtifactSummaryImpl
	 * @see org.hl7.knowledgeartifact.r2.impl.R2PackageImpl#getArtifactSummary()
	 * @generated
	 */
	int ARTIFACT_SUMMARY = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_SUMMARY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_SUMMARY__IDENTIFIER = 1;

	/**
	 * The feature id for the '<em><b>Artifact Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_SUMMARY__ARTIFACT_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_SUMMARY__SIZE = 3;

	/**
	 * The feature id for the '<em><b>Hash</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_SUMMARY__HASH = 4;

	/**
	 * The feature id for the '<em><b>Signatures</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_SUMMARY__SIGNATURES = 5;

	/**
	 * The number of structural features of the '<em>Artifact Summary</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_SUMMARY_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Artifact Summary</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_SUMMARY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.hl7.knowledgeartifact.r2.impl.ArtifactTypeTypeImpl <em>Artifact Type Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r2.impl.ArtifactTypeTypeImpl
	 * @see org.hl7.knowledgeartifact.r2.impl.R2PackageImpl#getArtifactTypeType()
	 * @generated
	 */
	int ARTIFACT_TYPE_TYPE = 9;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_TYPE_TYPE__VALUE = 0;

	/**
	 * The number of structural features of the '<em>Artifact Type Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_TYPE_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Artifact Type Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_TYPE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.hl7.knowledgeartifact.r2.impl.ArtifactTypeType1Impl <em>Artifact Type Type1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r2.impl.ArtifactTypeType1Impl
	 * @see org.hl7.knowledgeartifact.r2.impl.R2PackageImpl#getArtifactTypeType1()
	 * @generated
	 */
	int ARTIFACT_TYPE_TYPE1 = 10;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_TYPE_TYPE1__VALUE = 0;

	/**
	 * The number of structural features of the '<em>Artifact Type Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_TYPE_TYPE1_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Artifact Type Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_TYPE_TYPE1_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.hl7.knowledgeartifact.r2.impl.AtomicActionImpl <em>Atomic Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r2.impl.AtomicActionImpl
	 * @see org.hl7.knowledgeartifact.r2.impl.R2PackageImpl#getAtomicAction()
	 * @generated
	 */
	int ATOMIC_ACTION = 11;

	/**
	 * The feature id for the '<em><b>Action Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_ACTION__ACTION_ID = ACTION_BASE__ACTION_ID;

	/**
	 * The feature id for the '<em><b>Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_ACTION__NUMBER = ACTION_BASE__NUMBER;

	/**
	 * The feature id for the '<em><b>Supporting Evidence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_ACTION__SUPPORTING_EVIDENCE = ACTION_BASE__SUPPORTING_EVIDENCE;

	/**
	 * The feature id for the '<em><b>Supporting Resources</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_ACTION__SUPPORTING_RESOURCES = ACTION_BASE__SUPPORTING_RESOURCES;

	/**
	 * The feature id for the '<em><b>Actors</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_ACTION__ACTORS = ACTION_BASE__ACTORS;

	/**
	 * The feature id for the '<em><b>Behaviors</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_ACTION__BEHAVIORS = ACTION_BASE__BEHAVIORS;

	/**
	 * The feature id for the '<em><b>Conditions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_ACTION__CONDITIONS = ACTION_BASE__CONDITIONS;

	/**
	 * The feature id for the '<em><b>Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_ACTION__ORDER = ACTION_BASE__ORDER;

	/**
	 * The feature id for the '<em><b>Text Equivalent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_ACTION__TEXT_EQUIVALENT = ACTION_BASE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Atomic Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_ACTION_FEATURE_COUNT = ACTION_BASE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Atomic Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_ACTION_OPERATION_COUNT = ACTION_BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.knowledgeartifact.r2.impl.BehaviorImpl <em>Behavior</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r2.impl.BehaviorImpl
	 * @see org.hl7.knowledgeartifact.r2.impl.R2PackageImpl#getBehavior()
	 * @generated
	 */
	int BEHAVIOR = 12;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR__VALUE = 0;

	/**
	 * The number of structural features of the '<em>Behavior</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Behavior</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.hl7.knowledgeartifact.r2.impl.BehaviorsImpl <em>Behaviors</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r2.impl.BehaviorsImpl
	 * @see org.hl7.knowledgeartifact.r2.impl.R2PackageImpl#getBehaviors()
	 * @generated
	 */
	int BEHAVIORS = 13;

	/**
	 * The feature id for the '<em><b>Behavior</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIORS__BEHAVIOR = 0;

	/**
	 * The number of structural features of the '<em>Behaviors</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIORS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Behaviors</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIORS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.hl7.knowledgeartifact.r2.impl.BindingModelTypeImpl <em>Binding Model Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r2.impl.BindingModelTypeImpl
	 * @see org.hl7.knowledgeartifact.r2.impl.R2PackageImpl#getBindingModelType()
	 * @generated
	 */
	int BINDING_MODEL_TYPE = 14;

	/**
	 * The feature id for the '<em><b>Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_MODEL_TYPE__MODEL = 0;

	/**
	 * The number of structural features of the '<em>Binding Model Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_MODEL_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Binding Model Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_MODEL_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.hl7.knowledgeartifact.r2.impl.BindingModelType1Impl <em>Binding Model Type1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r2.impl.BindingModelType1Impl
	 * @see org.hl7.knowledgeartifact.r2.impl.R2PackageImpl#getBindingModelType1()
	 * @generated
	 */
	int BINDING_MODEL_TYPE1 = 15;

	/**
	 * The feature id for the '<em><b>Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_MODEL_TYPE1__MODEL = 0;

	/**
	 * The number of structural features of the '<em>Binding Model Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_MODEL_TYPE1_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Binding Model Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_MODEL_TYPE1_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.hl7.knowledgeartifact.r2.impl.BindingNameTypeImpl <em>Binding Name Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r2.impl.BindingNameTypeImpl
	 * @see org.hl7.knowledgeartifact.r2.impl.R2PackageImpl#getBindingNameType()
	 * @generated
	 */
	int BINDING_NAME_TYPE = 16;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_NAME_TYPE__VALUE = 0;

	/**
	 * The number of structural features of the '<em>Binding Name Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_NAME_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Binding Name Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_NAME_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.hl7.knowledgeartifact.r2.impl.BindingTypeImpl <em>Binding Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r2.impl.BindingTypeImpl
	 * @see org.hl7.knowledgeartifact.r2.impl.R2PackageImpl#getBindingType()
	 * @generated
	 */
	int BINDING_TYPE = 17;

	/**
	 * The feature id for the '<em><b>Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_TYPE__MODEL = 0;

	/**
	 * The number of structural features of the '<em>Binding Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Binding Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.hl7.knowledgeartifact.r2.impl.BindingTypeTypeImpl <em>Binding Type Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r2.impl.BindingTypeTypeImpl
	 * @see org.hl7.knowledgeartifact.r2.impl.R2PackageImpl#getBindingTypeType()
	 * @generated
	 */
	int BINDING_TYPE_TYPE = 18;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_TYPE_TYPE__BINDING = 0;

	/**
	 * The number of structural features of the '<em>Binding Type Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_TYPE_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Binding Type Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_TYPE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.hl7.knowledgeartifact.r2.impl.CardinalityBehaviorImpl <em>Cardinality Behavior</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r2.impl.CardinalityBehaviorImpl
	 * @see org.hl7.knowledgeartifact.r2.impl.R2PackageImpl#getCardinalityBehavior()
	 * @generated
	 */
	int CARDINALITY_BEHAVIOR = 19;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDINALITY_BEHAVIOR__VALUE = BEHAVIOR__VALUE;

	/**
	 * The number of structural features of the '<em>Cardinality Behavior</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDINALITY_BEHAVIOR_FEATURE_COUNT = BEHAVIOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Cardinality Behavior</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDINALITY_BEHAVIOR_OPERATION_COUNT = BEHAVIOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.knowledgeartifact.r2.impl.CategoriesTypeImpl <em>Categories Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r2.impl.CategoriesTypeImpl
	 * @see org.hl7.knowledgeartifact.r2.impl.R2PackageImpl#getCategoriesType()
	 * @generated
	 */
	int CATEGORIES_TYPE = 20;

	/**
	 * The feature id for the '<em><b>Category</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORIES_TYPE__CATEGORY = 0;

	/**
	 * The number of structural features of the '<em>Categories Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORIES_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Categories Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORIES_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.hl7.knowledgeartifact.r2.impl.CodesTypeImpl <em>Codes Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r2.impl.CodesTypeImpl
	 * @see org.hl7.knowledgeartifact.r2.impl.R2PackageImpl#getCodesType()
	 * @generated
	 */
	int CODES_TYPE = 21;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODES_TYPE__CODE = 0;

	/**
	 * The number of structural features of the '<em>Codes Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODES_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Codes Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODES_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.hl7.knowledgeartifact.r2.impl.CodingImpl <em>Coding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r2.impl.CodingImpl
	 * @see org.hl7.knowledgeartifact.r2.impl.R2PackageImpl#getCoding()
	 * @generated
	 */
	int CODING = 22;

	/**
	 * The feature id for the '<em><b>System</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODING__SYSTEM = 0;

	/**
	 * The feature id for the '<em><b>Version</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODING__VERSION = 1;

	/**
	 * The feature id for the '<em><b>Display</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODING__DISPLAY = 2;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODING__CODE = 3;

	/**
	 * The feature id for the '<em><b>User Seclected</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODING__USER_SECLECTED = 4;

	/**
	 * The number of structural features of the '<em>Coding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODING_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Coding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.hl7.knowledgeartifact.r2.impl.CollectInformationActionImpl <em>Collect Information Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r2.impl.CollectInformationActionImpl
	 * @see org.hl7.knowledgeartifact.r2.impl.R2PackageImpl#getCollectInformationAction()
	 * @generated
	 */
	int COLLECT_INFORMATION_ACTION = 23;

	/**
	 * The feature id for the '<em><b>Action Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECT_INFORMATION_ACTION__ACTION_ID = ATOMIC_ACTION__ACTION_ID;

	/**
	 * The feature id for the '<em><b>Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECT_INFORMATION_ACTION__NUMBER = ATOMIC_ACTION__NUMBER;

	/**
	 * The feature id for the '<em><b>Supporting Evidence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECT_INFORMATION_ACTION__SUPPORTING_EVIDENCE = ATOMIC_ACTION__SUPPORTING_EVIDENCE;

	/**
	 * The feature id for the '<em><b>Supporting Resources</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECT_INFORMATION_ACTION__SUPPORTING_RESOURCES = ATOMIC_ACTION__SUPPORTING_RESOURCES;

	/**
	 * The feature id for the '<em><b>Actors</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECT_INFORMATION_ACTION__ACTORS = ATOMIC_ACTION__ACTORS;

	/**
	 * The feature id for the '<em><b>Behaviors</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECT_INFORMATION_ACTION__BEHAVIORS = ATOMIC_ACTION__BEHAVIORS;

	/**
	 * The feature id for the '<em><b>Conditions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECT_INFORMATION_ACTION__CONDITIONS = ATOMIC_ACTION__CONDITIONS;

	/**
	 * The feature id for the '<em><b>Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECT_INFORMATION_ACTION__ORDER = ATOMIC_ACTION__ORDER;

	/**
	 * The feature id for the '<em><b>Text Equivalent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECT_INFORMATION_ACTION__TEXT_EQUIVALENT = ATOMIC_ACTION__TEXT_EQUIVALENT;

	/**
	 * The feature id for the '<em><b>Documentation Concept</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECT_INFORMATION_ACTION__DOCUMENTATION_CONCEPT = ATOMIC_ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Initial Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECT_INFORMATION_ACTION__INITIAL_VALUE = ATOMIC_ACTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Response Binding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECT_INFORMATION_ACTION__RESPONSE_BINDING = ATOMIC_ACTION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Collect Information Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECT_INFORMATION_ACTION_FEATURE_COUNT = ATOMIC_ACTION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Collect Information Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECT_INFORMATION_ACTION_OPERATION_COUNT = ATOMIC_ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.knowledgeartifact.r2.impl.CompletionImpl <em>Completion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r2.impl.CompletionImpl
	 * @see org.hl7.knowledgeartifact.r2.impl.R2PackageImpl#getCompletion()
	 * @generated
	 */
	int COMPLETION = 24;

	/**
	 * The feature id for the '<em><b>Event Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLETION__EVENT_DEFINITION = 0;

	/**
	 * The feature id for the '<em><b>Action Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLETION__ACTION_GROUP = 1;

	/**
	 * The number of structural features of the '<em>Completion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLETION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Completion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLETION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.hl7.knowledgeartifact.r2.impl.ComponentEventBindingImpl <em>Component Event Binding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r2.impl.ComponentEventBindingImpl
	 * @see org.hl7.knowledgeartifact.r2.impl.R2PackageImpl#getComponentEventBinding()
	 * @generated
	 */
	int COMPONENT_EVENT_BINDING = 25;

	/**
	 * The feature id for the '<em><b>Binding Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_EVENT_BINDING__BINDING_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Component Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_EVENT_BINDING__COMPONENT_ID = 1;

	/**
	 * The feature id for the '<em><b>Incoming Bindings</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_EVENT_BINDING__INCOMING_BINDINGS = 2;

	/**
	 * The feature id for the '<em><b>Outgoing Bindings</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_EVENT_BINDING__OUTGOING_BINDINGS = 3;

	/**
	 * The feature id for the '<em><b>Triggers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_EVENT_BINDING__TRIGGERS = 4;

	/**
	 * The number of structural features of the '<em>Component Event Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_EVENT_BINDING_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Component Event Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_EVENT_BINDING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.hl7.knowledgeartifact.r2.impl.ComponentEventMappingsImpl <em>Component Event Mappings</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r2.impl.ComponentEventMappingsImpl
	 * @see org.hl7.knowledgeartifact.r2.impl.R2PackageImpl#getComponentEventMappings()
	 * @generated
	 */
	int COMPONENT_EVENT_MAPPINGS = 26;

	/**
	 * The feature id for the '<em><b>Component Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_EVENT_MAPPINGS__COMPONENT_ID = 0;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_EVENT_MAPPINGS__BINDING = 1;

	/**
	 * The number of structural features of the '<em>Component Event Mappings</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_EVENT_MAPPINGS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Component Event Mappings</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_EVENT_MAPPINGS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.hl7.knowledgeartifact.r2.impl.CompositeImpl <em>Composite</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r2.impl.CompositeImpl
	 * @see org.hl7.knowledgeartifact.r2.impl.R2PackageImpl#getComposite()
	 * @generated
	 */
	int COMPOSITE = 27;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE__METADATA = 0;

	/**
	 * The feature id for the '<em><b>Control Block</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE__CONTROL_BLOCK = 1;

	/**
	 * The feature id for the '<em><b>Manifest</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE__MANIFEST = 2;

	/**
	 * The feature id for the '<em><b>Contained Artifacts</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE__CONTAINED_ARTIFACTS = 3;

	/**
	 * The number of structural features of the '<em>Composite</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Composite</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.hl7.knowledgeartifact.r2.impl.ConditionImpl <em>Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r2.impl.ConditionImpl
	 * @see org.hl7.knowledgeartifact.r2.impl.R2PackageImpl#getCondition()
	 * @generated
	 */
	int CONDITION = 28;

	/**
	 * The feature id for the '<em><b>Logic</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__LOGIC = 0;

	/**
	 * The feature id for the '<em><b>Condition Role</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__CONDITION_ROLE = 1;

	/**
	 * The number of structural features of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.hl7.knowledgeartifact.r2.impl.ConditionRoleType1Impl <em>Condition Role Type1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r2.impl.ConditionRoleType1Impl
	 * @see org.hl7.knowledgeartifact.r2.impl.R2PackageImpl#getConditionRoleType1()
	 * @generated
	 */
	int CONDITION_ROLE_TYPE1 = 29;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_ROLE_TYPE1__VALUE = 0;

	/**
	 * The number of structural features of the '<em>Condition Role Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_ROLE_TYPE1_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Condition Role Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_ROLE_TYPE1_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.hl7.knowledgeartifact.r2.impl.ConditionsImpl <em>Conditions</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r2.impl.ConditionsImpl
	 * @see org.hl7.knowledgeartifact.r2.impl.R2PackageImpl#getConditions()
	 * @generated
	 */
	int CONDITIONS = 30;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONS__CONDITION = 0;

	/**
	 * The number of structural features of the '<em>Conditions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Conditions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.hl7.knowledgeartifact.r2.impl.ConstraintTypeTypeImpl <em>Constraint Type Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r2.impl.ConstraintTypeTypeImpl
	 * @see org.hl7.knowledgeartifact.r2.impl.R2PackageImpl#getConstraintTypeType()
	 * @generated
	 */
	int CONSTRAINT_TYPE_TYPE = 31;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_TYPE_TYPE__VALUE = 0;

	/**
	 * The number of structural features of the '<em>Constraint Type Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_TYPE_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Constraint Type Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_TYPE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.hl7.knowledgeartifact.r2.impl.ContactsTypeImpl <em>Contacts Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r2.impl.ContactsTypeImpl
	 * @see org.hl7.knowledgeartifact.r2.impl.R2PackageImpl#getContactsType()
	 * @generated
	 */
	int CONTACTS_TYPE = 32;

	/**
	 * The feature id for the '<em><b>Contact</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACTS_TYPE__CONTACT = 0;

	/**
	 * The number of structural features of the '<em>Contacts Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACTS_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Contacts Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACTS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.hl7.knowledgeartifact.r2.impl.ContainedArtifactImpl <em>Contained Artifact</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r2.impl.ContainedArtifactImpl
	 * @see org.hl7.knowledgeartifact.r2.impl.R2PackageImpl#getContainedArtifact()
	 * @generated
	 */
	int CONTAINED_ARTIFACT = 33;

	/**
	 * The feature id for the '<em><b>Artifact Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINED_ARTIFACT__ARTIFACT_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINED_ARTIFACT__NAME = 1;

	/**
	 * The feature id for the '<em><b>Binding Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINED_ARTIFACT__BINDING_NAME = 2;

	/**
	 * The feature id for the '<em><b>Inclusion Criteria</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINED_ARTIFACT__INCLUSION_CRITERIA = 3;

	/**
	 * The feature id for the '<em><b>Context</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINED_ARTIFACT__CONTEXT = 4;

	/**
	 * The feature id for the '<em><b>Event Binding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINED_ARTIFACT__EVENT_BINDING = 5;

	/**
	 * The feature id for the '<em><b>Metadata Binding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINED_ARTIFACT__METADATA_BINDING = 6;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINED_ARTIFACT__GROUP = 7;

	/**
	 * The feature id for the '<em><b>Wrapped Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINED_ARTIFACT__WRAPPED_CONTENT = 8;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINED_ARTIFACT__REFERENCE = 9;

	/**
	 * The feature id for the '<em><b>Knowledge Document</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINED_ARTIFACT__KNOWLEDGE_DOCUMENT = 10;

	/**
	 * The feature id for the '<em><b>Must Understand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINED_ARTIFACT__MUST_UNDERSTAND = 11;

	/**
	 * The feature id for the '<em><b>On Completion</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINED_ARTIFACT__ON_COMPLETION = 12;

	/**
	 * The number of structural features of the '<em>Contained Artifact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINED_ARTIFACT_FEATURE_COUNT = 13;

	/**
	 * The number of operations of the '<em>Contained Artifact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINED_ARTIFACT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.hl7.knowledgeartifact.r2.impl.ContainedArtifactListImpl <em>Contained Artifact List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r2.impl.ContainedArtifactListImpl
	 * @see org.hl7.knowledgeartifact.r2.impl.R2PackageImpl#getContainedArtifactList()
	 * @generated
	 */
	int CONTAINED_ARTIFACT_LIST = 34;

	/**
	 * The feature id for the '<em><b>Artifact</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINED_ARTIFACT_LIST__ARTIFACT = 0;

	/**
	 * The number of structural features of the '<em>Contained Artifact List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINED_ARTIFACT_LIST_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Contained Artifact List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINED_ARTIFACT_LIST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.hl7.knowledgeartifact.r2.impl.ContentHashTypeImpl <em>Content Hash Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r2.impl.ContentHashTypeImpl
	 * @see org.hl7.knowledgeartifact.r2.impl.R2PackageImpl#getContentHashType()
	 * @generated
	 */
	int CONTENT_HASH_TYPE = 35;

	/**
	 * The feature id for the '<em><b>Hashvalue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_HASH_TYPE__HASHVALUE = 0;

	/**
	 * The number of structural features of the '<em>Content Hash Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_HASH_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Content Hash Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_HASH_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.hl7.knowledgeartifact.r2.impl.ContentSignifierImpl <em>Content Signifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r2.impl.ContentSignifierImpl
	 * @see org.hl7.knowledgeartifact.r2.impl.R2PackageImpl#getContentSignifier()
	 * @generated
	 */
	int CONTENT_SIGNIFIER = 36;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_SIGNIFIER__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Form</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_SIGNIFIER__FORM = 1;

	/**
	 * The number of structural features of the '<em>Content Signifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_SIGNIFIER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Content Signifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_SIGNIFIER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.hl7.knowledgeartifact.r2.impl.ContentTypeImpl <em>Content Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r2.impl.ContentTypeImpl
	 * @see org.hl7.knowledgeartifact.r2.impl.R2PackageImpl#getContentType()
	 * @generated
	 */
	int CONTENT_TYPE = 37;

	/**
	 * The feature id for the '<em><b>Div</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_TYPE__DIV = 0;

	/**
	 * The number of structural features of the '<em>Content Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Content Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.hl7.knowledgeartifact.r2.impl.ContextImpl <em>Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r2.impl.ContextImpl
	 * @see org.hl7.knowledgeartifact.r2.impl.R2PackageImpl#getContext()
	 * @generated
	 */
	int CONTEXT = 38;

	/**
	 * The number of structural features of the '<em>Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.hl7.knowledgeartifact.r2.impl.ContributionImpl <em>Contribution</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r2.impl.ContributionImpl
	 * @see org.hl7.knowledgeartifact.r2.impl.R2PackageImpl#getContribution()
	 * @generated
	 */
	int CONTRIBUTION = 39;

	/**
	 * The feature id for the '<em><b>Contributor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRIBUTION__CONTRIBUTOR = 0;

	/**
	 * The feature id for the '<em><b>Role</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRIBUTION__ROLE = 1;

	/**
	 * The number of structural features of the '<em>Contribution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRIBUTION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Contribution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRIBUTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.hl7.knowledgeartifact.r2.impl.ContributionsTypeImpl <em>Contributions Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r2.impl.ContributionsTypeImpl
	 * @see org.hl7.knowledgeartifact.r2.impl.R2PackageImpl#getContributionsType()
	 * @generated
	 */
	int CONTRIBUTIONS_TYPE = 40;

	/**
	 * The feature id for the '<em><b>Contribution</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRIBUTIONS_TYPE__CONTRIBUTION = 0;

	/**
	 * The number of structural features of the '<em>Contributions Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRIBUTIONS_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Contributions Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRIBUTIONS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.hl7.knowledgeartifact.r2.impl.ControlBlockImpl <em>Control Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r2.impl.ControlBlockImpl
	 * @see org.hl7.knowledgeartifact.r2.impl.R2PackageImpl#getControlBlock()
	 * @generated
	 */
	int CONTROL_BLOCK = 41;

	/**
	 * The feature id for the '<em><b>Context</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_BLOCK__CONTEXT = 0;

	/**
	 * The feature id for the '<em><b>Event Activation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_BLOCK__EVENT_ACTIVATION = 1;

	/**
	 * The feature id for the '<em><b>Propagation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_BLOCK__PROPAGATION = 2;

	/**
	 * The feature id for the '<em><b>Mapping</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_BLOCK__MAPPING = 3;

	/**
	 * The feature id for the '<em><b>Controlling Artifact</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_BLOCK__CONTROLLING_ARTIFACT = 4;

	/**
	 * The feature id for the '<em><b>Initial Artifact</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_BLOCK__INITIAL_ARTIFACT = 5;

	/**
	 * The number of structural features of the '<em>Control Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_BLOCK_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Control Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_BLOCK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.hl7.knowledgeartifact.r2.impl.ControllingArtifactTypeImpl <em>Controlling Artifact Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r2.impl.ControllingArtifactTypeImpl
	 * @see org.hl7.knowledgeartifact.r2.impl.R2PackageImpl#getControllingArtifactType()
	 * @generated
	 */
	int CONTROLLING_ARTIFACT_TYPE = 42;

	/**
	 * The feature id for the '<em><b>Binding Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLING_ARTIFACT_TYPE__BINDING_NAME = 0;

	/**
	 * The number of structural features of the '<em>Controlling Artifact Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLING_ARTIFACT_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Controlling Artifact Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLING_ARTIFACT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.hl7.knowledgeartifact.r2.impl.CoverageImpl <em>Coverage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r2.impl.CoverageImpl
	 * @see org.hl7.knowledgeartifact.r2.impl.R2PackageImpl#getCoverage()
	 * @generated
	 */
	int COVERAGE = 43;

	/**
	 * The feature id for the '<em><b>Focus</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COVERAGE__FOCUS = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COVERAGE__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COVERAGE__VALUE = 2;

	/**
	 * The number of structural features of the '<em>Coverage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COVERAGE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Coverage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COVERAGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.hl7.knowledgeartifact.r2.impl.CreateActionImpl <em>Create Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r2.impl.CreateActionImpl
	 * @see org.hl7.knowledgeartifact.r2.impl.R2PackageImpl#getCreateAction()
	 * @generated
	 */
	int CREATE_ACTION = 44;

	/**
	 * The feature id for the '<em><b>Action Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ACTION__ACTION_ID = ATOMIC_ACTION__ACTION_ID;

	/**
	 * The feature id for the '<em><b>Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ACTION__NUMBER = ATOMIC_ACTION__NUMBER;

	/**
	 * The feature id for the '<em><b>Supporting Evidence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ACTION__SUPPORTING_EVIDENCE = ATOMIC_ACTION__SUPPORTING_EVIDENCE;

	/**
	 * The feature id for the '<em><b>Supporting Resources</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ACTION__SUPPORTING_RESOURCES = ATOMIC_ACTION__SUPPORTING_RESOURCES;

	/**
	 * The feature id for the '<em><b>Actors</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ACTION__ACTORS = ATOMIC_ACTION__ACTORS;

	/**
	 * The feature id for the '<em><b>Behaviors</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ACTION__BEHAVIORS = ATOMIC_ACTION__BEHAVIORS;

	/**
	 * The feature id for the '<em><b>Conditions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ACTION__CONDITIONS = ATOMIC_ACTION__CONDITIONS;

	/**
	 * The feature id for the '<em><b>Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ACTION__ORDER = ATOMIC_ACTION__ORDER;

	/**
	 * The feature id for the '<em><b>Text Equivalent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ACTION__TEXT_EQUIVALENT = ATOMIC_ACTION__TEXT_EQUIVALENT;

	/**
	 * The feature id for the '<em><b>Action Sentence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ACTION__ACTION_SENTENCE = ATOMIC_ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Create Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ACTION_FEATURE_COUNT = ATOMIC_ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Create Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ACTION_OPERATION_COUNT = ATOMIC_ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.knowledgeartifact.r2.impl.TriggerImpl <em>Trigger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r2.impl.TriggerImpl
	 * @see org.hl7.knowledgeartifact.r2.impl.R2PackageImpl#getTrigger()
	 * @generated
	 */
	int TRIGGER = 122;

	/**
	 * The feature id for the '<em><b>Def</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER__DEF = 0;

	/**
	 * The feature id for the '<em><b>Identifiers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER__IDENTIFIERS = 1;

	/**
	 * The feature id for the '<em><b>Text Equivalent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER__TEXT_EQUIVALENT = 2;

	/**
	 * The number of structural features of the '<em>Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.hl7.knowledgeartifact.r2.impl.DataEventTriggerImpl <em>Data Event Trigger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r2.impl.DataEventTriggerImpl
	 * @see org.hl7.knowledgeartifact.r2.impl.R2PackageImpl#getDataEventTrigger()
	 * @generated
	 */
	int DATA_EVENT_TRIGGER = 45;

	/**
	 * The feature id for the '<em><b>Def</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_EVENT_TRIGGER__DEF = TRIGGER__DEF;

	/**
	 * The feature id for the '<em><b>Identifiers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_EVENT_TRIGGER__IDENTIFIERS = TRIGGER__IDENTIFIERS;

	/**
	 * The feature id for the '<em><b>Text Equivalent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_EVENT_TRIGGER__TEXT_EQUIVALENT = TRIGGER__TEXT_EQUIVALENT;

	/**
	 * The feature id for the '<em><b>Trigger Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_EVENT_TRIGGER__TRIGGER_TYPE = TRIGGER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Data Event Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_EVENT_TRIGGER_FEATURE_COUNT = TRIGGER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Data Event Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_EVENT_TRIGGER_OPERATION_COUNT = TRIGGER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.knowledgeartifact.r2.impl.DataModelsTypeImpl <em>Data Models Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r2.impl.DataModelsTypeImpl
	 * @see org.hl7.knowledgeartifact.r2.impl.R2PackageImpl#getDataModelsType()
	 * @generated
	 */
	int DATA_MODELS_TYPE = 46;

	/**
	 * The feature id for the '<em><b>Model Reference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MODELS_TYPE__MODEL_REFERENCE = 0;

	/**
	 * The number of structural features of the '<em>Data Models Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MODELS_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Data Models Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MODELS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.hl7.knowledgeartifact.r2.impl.DeclareResponseActionImpl <em>Declare Response Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r2.impl.DeclareResponseActionImpl
	 * @see org.hl7.knowledgeartifact.r2.impl.R2PackageImpl#getDeclareResponseAction()
	 * @generated
	 */
	int DECLARE_RESPONSE_ACTION = 47;

	/**
	 * The feature id for the '<em><b>Action Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARE_RESPONSE_ACTION__ACTION_ID = ATOMIC_ACTION__ACTION_ID;

	/**
	 * The feature id for the '<em><b>Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARE_RESPONSE_ACTION__NUMBER = ATOMIC_ACTION__NUMBER;

	/**
	 * The feature id for the '<em><b>Supporting Evidence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARE_RESPONSE_ACTION__SUPPORTING_EVIDENCE = ATOMIC_ACTION__SUPPORTING_EVIDENCE;

	/**
	 * The feature id for the '<em><b>Supporting Resources</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARE_RESPONSE_ACTION__SUPPORTING_RESOURCES = ATOMIC_ACTION__SUPPORTING_RESOURCES;

	/**
	 * The feature id for the '<em><b>Actors</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARE_RESPONSE_ACTION__ACTORS = ATOMIC_ACTION__ACTORS;

	/**
	 * The feature id for the '<em><b>Behaviors</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARE_RESPONSE_ACTION__BEHAVIORS = ATOMIC_ACTION__BEHAVIORS;

	/**
	 * The feature id for the '<em><b>Conditions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARE_RESPONSE_ACTION__CONDITIONS = ATOMIC_ACTION__CONDITIONS;

	/**
	 * The feature id for the '<em><b>Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARE_RESPONSE_ACTION__ORDER = ATOMIC_ACTION__ORDER;

	/**
	 * The feature id for the '<em><b>Text Equivalent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARE_RESPONSE_ACTION__TEXT_EQUIVALENT = ATOMIC_ACTION__TEXT_EQUIVALENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARE_RESPONSE_ACTION__NAME = ATOMIC_ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Declare Response Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARE_RESPONSE_ACTION_FEATURE_COUNT = ATOMIC_ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Declare Response Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARE_RESPONSE_ACTION_OPERATION_COUNT = ATOMIC_ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.knowledgeartifact.r2.impl.ItemDefinitionImpl <em>Item Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r2.impl.ItemDefinitionImpl
	 * @see org.hl7.knowledgeartifact.r2.impl.R2PackageImpl#getItemDefinition()
	 * @generated
	 */
	int ITEM_DEFINITION = 74;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_DEFINITION__IDENTIFIER = 0;

	/**
	 * The feature id for the '<em><b>Scoped Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_DEFINITION__SCOPED_IDENTIFIER = 1;

	/**
	 * The number of structural features of the '<em>Item Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_DEFINITION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Item Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_DEFINITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.hl7.knowledgeartifact.r2.impl.DocumentationItemImpl <em>Documentation Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r2.impl.DocumentationItemImpl
	 * @see org.hl7.knowledgeartifact.r2.impl.R2PackageImpl#getDocumentationItem()
	 * @generated
	 */
	int DOCUMENTATION_ITEM = 48;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTATION_ITEM__IDENTIFIER = ITEM_DEFINITION__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Scoped Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTATION_ITEM__SCOPED_IDENTIFIER = ITEM_DEFINITION__SCOPED_IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Prompt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTATION_ITEM__PROMPT = ITEM_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Additional Instructions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTATION_ITEM__ADDITIONAL_INSTRUCTIONS = ITEM_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Text After Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTATION_ITEM__TEXT_AFTER_RESPONSE = ITEM_DEFINITION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTATION_ITEM__DESCRIPTION = ITEM_DEFINITION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Item Codes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTATION_ITEM__ITEM_CODES = ITEM_DEFINITION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Response Data Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTATION_ITEM__RESPONSE_DATA_TYPE = ITEM_DEFINITION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Response Cardinality</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTATION_ITEM__RESPONSE_CARDINALITY = ITEM_DEFINITION_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Response Range</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTATION_ITEM__RESPONSE_RANGE = ITEM_DEFINITION_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Documentation Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTATION_ITEM_FEATURE_COUNT = ITEM_DEFINITION_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Documentation Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTATION_ITEM_OPERATION_COUNT = ITEM_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.knowledgeartifact.r2.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r2.impl.DocumentRootImpl
	 * @see org.hl7.knowledgeartifact.r2.impl.R2PackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 49;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MIXED = 0;

	/**
	 * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XMLNS_PREFIX_MAP = 1;

	/**
	 * The feature id for the '<em><b>XSI Schema Location</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = 2;

	/**
	 * The feature id for the '<em><b>Composite Knowledge Document</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__COMPOSITE_KNOWLEDGE_DOCUMENT = 3;

	/**
	 * The feature id for the '<em><b>Knowledge Document</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__KNOWLEDGE_DOCUMENT = 4;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.hl7.knowledgeartifact.r2.impl.RangeConstraintImpl <em>Range Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r2.impl.RangeConstraintImpl
	 * @see org.hl7.knowledgeartifact.r2.impl.R2PackageImpl#getRangeConstraint()
	 * @generated
	 */
	int RANGE_CONSTRAINT = 97;

	/**
	 * The feature id for the '<em><b>Constraint Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_CONSTRAINT__CONSTRAINT_TYPE = 0;

	/**
	 * The number of structural features of the '<em>Range Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_CONSTRAINT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Range Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_CONSTRAINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.hl7.knowledgeartifact.r2.impl.EnumerationConstraintImpl <em>Enumeration Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r2.impl.EnumerationConstraintImpl
	 * @see org.hl7.knowledgeartifact.r2.impl.R2PackageImpl#getEnumerationConstraint()
	 * @generated
	 */
	int ENUMERATION_CONSTRAINT = 50;

	/**
	 * The feature id for the '<em><b>Constraint Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_CONSTRAINT__CONSTRAINT_TYPE = RANGE_CONSTRAINT__CONSTRAINT_TYPE;

	/**
	 * The feature id for the '<em><b>Item</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_CONSTRAINT__ITEM = RANGE_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Strict Selection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_CONSTRAINT__STRICT_SELECTION = RANGE_CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Enumeration Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_CONSTRAINT_FEATURE_COUNT = RANGE_CONSTRAINT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Enumeration Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_CONSTRAINT_OPERATION_COUNT = RANGE_CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.knowledgeartifact.r2.impl.EnumerationItemImpl <em>Enumeration Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r2.impl.EnumerationItemImpl
	 * @see org.hl7.knowledgeartifact.r2.impl.R2PackageImpl#getEnumerationItem()
	 * @generated
	 */
	int ENUMERATION_ITEM = 51;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_ITEM__IDENTIFIER = 0;

	/**
	 * The feature id for the '<em><b>Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_ITEM__NUMBER = 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_ITEM__VALUE = 2;

	/**
	 * The feature id for the '<em><b>Codes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_ITEM__CODES = 3;

	/**
	 * The feature id for the '<em><b>Display Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_ITEM__DISPLAY_TEXT = 4;

	/**
	 * The feature id for the '<em><b>Additional Instructions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_ITEM__ADDITIONAL_INSTRUCTIONS = 5;

	/**
	 * The feature id for the '<em><b>Value Meaning</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_ITEM__VALUE_MEANING = 6;

	/**
	 * The feature id for the '<em><b>Fill In</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_ITEM__FILL_IN = 7;

	/**
	 * The number of structural features of the '<em>Enumeration Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_ITEM_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Enumeration Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_ITEM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.hl7.knowledgeartifact.r2.impl.EventBindingImpl <em>Event Binding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r2.impl.EventBindingImpl
	 * @see org.hl7.knowledgeartifact.r2.impl.R2PackageImpl#getEventBinding()
	 * @generated
	 */
	int EVENT_BINDING = 52;

	/**
	 * The feature id for the '<em><b>Binding Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_BINDING__BINDING_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Incoming Bindings</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_BINDING__INCOMING_BINDINGS = 1;

	/**
	 * The feature id for the '<em><b>Outgoing Bindings</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_BINDING__OUTGOING_BINDINGS = 2;

	/**
	 * The feature id for the '<em><b>Triggers</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_BINDING__TRIGGERS = 3;

	/**
	 * The number of structural features of the '<em>Event Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_BINDING_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Event Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_BINDING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.hl7.knowledgeartifact.r2.impl.EventBindingTypeTypeImpl <em>Event Binding Type Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r2.impl.EventBindingTypeTypeImpl
	 * @see org.hl7.knowledgeartifact.r2.impl.R2PackageImpl#getEventBindingTypeType()
	 * @generated
	 */
	int EVENT_BINDING_TYPE_TYPE = 53;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_BINDING_TYPE_TYPE__BINDING = 0;

	/**
	 * The number of structural features of the '<em>Event Binding Type Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_BINDING_TYPE_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Event Binding Type Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_BINDING_TYPE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.hl7.knowledgeartifact.r2.impl.EventDefTypeImpl <em>Event Def Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r2.impl.EventDefTypeImpl
	 * @see org.hl7.knowledgeartifact.r2.impl.R2PackageImpl#getEventDefType()
	 * @generated
	 */
	int EVENT_DEF_TYPE = 54;

	/**
	 * The feature id for the '<em><b>Event Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_DEF_TYPE__EVENT_TYPE = 0;

	/**
	 * The number of structural features of the '<em>Event Def Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_DEF_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Event Def Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_DEF_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.hl7.knowledgeartifact.r2.impl.EventHistoryTypeImpl <em>Event History Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r2.impl.EventHistoryTypeImpl
	 * @see org.hl7.knowledgeartifact.r2.impl.R2PackageImpl#getEventHistoryType()
	 * @generated
	 */
	int EVENT_HISTORY_TYPE = 55;

	/**
	 * The feature id for the '<em><b>Artifact Life Cycle Event</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_HISTORY_TYPE__ARTIFACT_LIFE_CYCLE_EVENT = 0;

	/**
	 * The number of structural features of the '<em>Event History Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_HISTORY_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Event History Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_HISTORY_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.hl7.knowledgeartifact.r2.impl.EventNameTypeImpl <em>Event Name Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r2.impl.EventNameTypeImpl
	 * @see org.hl7.knowledgeartifact.r2.impl.R2PackageImpl#getEventNameType()
	 * @generated
	 */
	int EVENT_NAME_TYPE = 56;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_NAME_TYPE__NAME = 0;

	/**
	 * The number of structural features of the '<em>Event Name Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_NAME_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Event Name Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_NAME_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.hl7.knowledgeartifact.r2.impl.EventTypeTypeImpl <em>Event Type Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r2.impl.EventTypeTypeImpl
	 * @see org.hl7.knowledgeartifact.r2.impl.R2PackageImpl#getEventTypeType()
	 * @generated
	 */
	int EVENT_TYPE_TYPE = 57;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_TYPE_TYPE__VALUE = 0;

	/**
	 * The number of structural features of the '<em>Event Type Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_TYPE_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Event Type Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_TYPE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.hl7.knowledgeartifact.r2.impl.EvidenceImpl <em>Evidence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r2.impl.EvidenceImpl
	 * @see org.hl7.knowledgeartifact.r2.impl.R2PackageImpl#getEvidence()
	 * @generated
	 */
	int EVIDENCE = 58;

	/**
	 * The feature id for the '<em><b>Quality Of Evidence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE__QUALITY_OF_EVIDENCE = 0;

	/**
	 * The feature id for the '<em><b>Strength Of Recommendation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE__STRENGTH_OF_RECOMMENDATION = 1;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE__RESOURCES = 2;

	/**
	 * The number of structural features of the '<em>Evidence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Evidence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.hl7.knowledgeartifact.r2.impl.ExpressionConstraintImpl <em>Expression Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r2.impl.ExpressionConstraintImpl
	 * @see org.hl7.knowledgeartifact.r2.impl.R2PackageImpl#getExpressionConstraint()
	 * @generated
	 */
	int EXPRESSION_CONSTRAINT = 59;

	/**
	 * The feature id for the '<em><b>Constraint Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_CONSTRAINT__CONSTRAINT_TYPE = RANGE_CONSTRAINT__CONSTRAINT_TYPE;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_CONSTRAINT__CONSTRAINT = RANGE_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Expression Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_CONSTRAINT_FEATURE_COUNT = RANGE_CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Expression Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_CONSTRAINT_OPERATION_COUNT = RANGE_CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.knowledgeartifact.r2.impl.ExpressionsTypeImpl <em>Expressions Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r2.impl.ExpressionsTypeImpl
	 * @see org.hl7.knowledgeartifact.r2.impl.R2PackageImpl#getExpressionsType()
	 * @generated
	 */
	int EXPRESSIONS_TYPE = 60;

	/**
	 * The feature id for the '<em><b>Def</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSIONS_TYPE__DEF = 0;

	/**
	 * The number of structural features of the '<em>Expressions Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSIONS_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Expressions Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSIONS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.hl7.knowledgeartifact.r2.impl.ExternalDataTypeImpl <em>External Data Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r2.impl.ExternalDataTypeImpl
	 * @see org.hl7.knowledgeartifact.r2.impl.R2PackageImpl#getExternalDataType()
	 * @generated
	 */
	int EXTERNAL_DATA_TYPE = 61;

	/**
	 * The feature id for the '<em><b>Codesystem</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_DATA_TYPE__CODESYSTEM = 0;

	/**
	 * The feature id for the '<em><b>Valueset</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_DATA_TYPE__VALUESET = 1;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_DATA_TYPE__PARAMETER = 2;

	/**
	 * The feature id for the '<em><b>Def</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_DATA_TYPE__DEF = 3;

	/**
	 * The feature id for the '<em><b>Trigger</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_DATA_TYPE__TRIGGER = 4;

	/**
	 * The number of structural features of the '<em>External Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_DATA_TYPE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>External Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_DATA_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.hl7.knowledgeartifact.r2.impl.FireEventActionImpl <em>Fire Event Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r2.impl.FireEventActionImpl
	 * @see org.hl7.knowledgeartifact.r2.impl.R2PackageImpl#getFireEventAction()
	 * @generated
	 */
	int FIRE_EVENT_ACTION = 62;

	/**
	 * The feature id for the '<em><b>Action Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRE_EVENT_ACTION__ACTION_ID = ATOMIC_ACTION__ACTION_ID;

	/**
	 * The feature id for the '<em><b>Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRE_EVENT_ACTION__NUMBER = ATOMIC_ACTION__NUMBER;

	/**
	 * The feature id for the '<em><b>Supporting Evidence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRE_EVENT_ACTION__SUPPORTING_EVIDENCE = ATOMIC_ACTION__SUPPORTING_EVIDENCE;

	/**
	 * The feature id for the '<em><b>Supporting Resources</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRE_EVENT_ACTION__SUPPORTING_RESOURCES = ATOMIC_ACTION__SUPPORTING_RESOURCES;

	/**
	 * The feature id for the '<em><b>Actors</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRE_EVENT_ACTION__ACTORS = ATOMIC_ACTION__ACTORS;

	/**
	 * The feature id for the '<em><b>Behaviors</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRE_EVENT_ACTION__BEHAVIORS = ATOMIC_ACTION__BEHAVIORS;

	/**
	 * The feature id for the '<em><b>Conditions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRE_EVENT_ACTION__CONDITIONS = ATOMIC_ACTION__CONDITIONS;

	/**
	 * The feature id for the '<em><b>Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRE_EVENT_ACTION__ORDER = ATOMIC_ACTION__ORDER;

	/**
	 * The feature id for the '<em><b>Text Equivalent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRE_EVENT_ACTION__TEXT_EQUIVALENT = ATOMIC_ACTION__TEXT_EQUIVALENT;

	/**
	 * The feature id for the '<em><b>Event Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRE_EVENT_ACTION__EVENT_TYPE = ATOMIC_ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Action Sentence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRE_EVENT_ACTION__ACTION_SENTENCE = ATOMIC_ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Fire Event Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRE_EVENT_ACTION_FEATURE_COUNT = ATOMIC_ACTION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Fire Event Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRE_EVENT_ACTION_OPERATION_COUNT = ATOMIC_ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.knowledgeartifact.r2.impl.FocusTypeImpl <em>Focus Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r2.impl.FocusTypeImpl
	 * @see org.hl7.knowledgeartifact.r2.impl.R2PackageImpl#getFocusType()
	 * @generated
	 */
	int FOCUS_TYPE = 63;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOCUS_TYPE__VALUE = 0;

	/**
	 * The number of structural features of the '<em>Focus Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOCUS_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Focus Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOCUS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.hl7.knowledgeartifact.r2.impl.FormattedNumberImpl <em>Formatted Number</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r2.impl.FormattedNumberImpl
	 * @see org.hl7.knowledgeartifact.r2.impl.R2PackageImpl#getFormattedNumber()
	 * @generated
	 */
	int FORMATTED_NUMBER = 64;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMATTED_NUMBER__LABEL = 0;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMATTED_NUMBER__STYLE = 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMATTED_NUMBER__VALUE = 2;

	/**
	 * The number of structural features of the '<em>Formatted Number</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMATTED_NUMBER_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Formatted Number</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMATTED_NUMBER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.hl7.knowledgeartifact.r2.impl.FormattedTextImpl <em>Formatted Text</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r2.impl.FormattedTextImpl
	 * @see org.hl7.knowledgeartifact.r2.impl.R2PackageImpl#getFormattedText()
	 * @generated
	 */
	int FORMATTED_TEXT = 65;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMATTED_TEXT__LABEL = 0;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMATTED_TEXT__STYLE = 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMATTED_TEXT__VALUE = 2;

	/**
	 * The number of structural features of the '<em>Formatted Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMATTED_TEXT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Formatted Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMATTED_TEXT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.hl7.knowledgeartifact.r2.impl.GroupOrganizationBehaviorImpl <em>Group Organization Behavior</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r2.impl.GroupOrganizationBehaviorImpl
	 * @see org.hl7.knowledgeartifact.r2.impl.R2PackageImpl#getGroupOrganizationBehavior()
	 * @generated
	 */
	int GROUP_ORGANIZATION_BEHAVIOR = 66;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_ORGANIZATION_BEHAVIOR__VALUE = BEHAVIOR__VALUE;

	/**
	 * The number of structural features of the '<em>Group Organization Behavior</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_ORGANIZATION_BEHAVIOR_FEATURE_COUNT = BEHAVIOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Group Organization Behavior</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_ORGANIZATION_BEHAVIOR_OPERATION_COUNT = BEHAVIOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.knowledgeartifact.r2.impl.GroupSelectionBehaviorImpl <em>Group Selection Behavior</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r2.impl.GroupSelectionBehaviorImpl
	 * @see org.hl7.knowledgeartifact.r2.impl.R2PackageImpl#getGroupSelectionBehavior()
	 * @generated
	 */
	int GROUP_SELECTION_BEHAVIOR = 67;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_SELECTION_BEHAVIOR__VALUE = BEHAVIOR__VALUE;

	/**
	 * The number of structural features of the '<em>Group Selection Behavior</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_SELECTION_BEHAVIOR_FEATURE_COUNT = BEHAVIOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Group Selection Behavior</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_SELECTION_BEHAVIOR_OPERATION_COUNT = BEHAVIOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.knowledgeartifact.r2.impl.IdentifiersTypeImpl <em>Identifiers Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r2.impl.IdentifiersTypeImpl
	 * @see org.hl7.knowledgeartifact.r2.impl.R2PackageImpl#getIdentifiersType()
	 * @generated
	 */
	int IDENTIFIERS_TYPE = 68;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIERS_TYPE__IDENTIFIER = 0;

	/**
	 * The number of structural features of the '<em>Identifiers Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIERS_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Identifiers Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIERS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.hl7.knowledgeartifact.r2.impl.IdentifiersType1Impl <em>Identifiers Type1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r2.impl.IdentifiersType1Impl
	 * @see org.hl7.knowledgeartifact.r2.impl.R2PackageImpl#getIdentifiersType1()
	 * @generated
	 */
	int IDENTIFIERS_TYPE1 = 69;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIERS_TYPE1__IDENTIFIER = 0;

	/**
	 * The number of structural features of the '<em>Identifiers Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIERS_TYPE1_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Identifiers Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIERS_TYPE1_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.hl7.knowledgeartifact.r2.impl.IdentifiersType2Impl <em>Identifiers Type2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r2.impl.IdentifiersType2Impl
	 * @see org.hl7.knowledgeartifact.r2.impl.R2PackageImpl#getIdentifiersType2()
	 * @generated
	 */
	int IDENTIFIERS_TYPE2 = 70;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIERS_TYPE2__IDENTIFIER = 0;

	/**
	 * The number of structural features of the '<em>Identifiers Type2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIERS_TYPE2_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Identifiers Type2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIERS_TYPE2_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.hl7.knowledgeartifact.r2.impl.InitialArtifactTypeImpl <em>Initial Artifact Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r2.impl.InitialArtifactTypeImpl
	 * @see org.hl7.knowledgeartifact.r2.impl.R2PackageImpl#getInitialArtifactType()
	 * @generated
	 */
	int INITIAL_ARTIFACT_TYPE = 71;

	/**
	 * The feature id for the '<em><b>Binding Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_ARTIFACT_TYPE__BINDING_NAME = 0;

	/**
	 * The number of structural features of the '<em>Initial Artifact Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_ARTIFACT_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Initial Artifact Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_ARTIFACT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.hl7.knowledgeartifact.r2.impl.KnowledgeResourceImpl <em>Knowledge Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r2.impl.KnowledgeResourceImpl
	 * @see org.hl7.knowledgeartifact.r2.impl.R2PackageImpl#getKnowledgeResource()
	 * @generated
	 */
	int KNOWLEDGE_RESOURCE = 77;

	/**
	 * The feature id for the '<em><b>Identifiers</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNOWLEDGE_RESOURCE__IDENTIFIERS = 0;

	/**
	 * The feature id for the '<em><b>Template Ids</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNOWLEDGE_RESOURCE__TEMPLATE_IDS = 1;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNOWLEDGE_RESOURCE__TITLE = 2;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNOWLEDGE_RESOURCE__LOCATION = 3;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNOWLEDGE_RESOURCE__DESCRIPTION = 4;

	/**
	 * The feature id for the '<em><b>Citation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNOWLEDGE_RESOURCE__CITATION = 5;

	/**
	 * The number of structural features of the '<em>Knowledge Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNOWLEDGE_RESOURCE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Knowledge Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNOWLEDGE_RESOURCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.hl7.knowledgeartifact.r2.impl.InlineResourceImpl <em>Inline Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r2.impl.InlineResourceImpl
	 * @see org.hl7.knowledgeartifact.r2.impl.R2PackageImpl#getInlineResource()
	 * @generated
	 */
	int INLINE_RESOURCE = 72;

	/**
	 * The feature id for the '<em><b>Identifiers</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE_RESOURCE__IDENTIFIERS = KNOWLEDGE_RESOURCE__IDENTIFIERS;

	/**
	 * The feature id for the '<em><b>Template Ids</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE_RESOURCE__TEMPLATE_IDS = KNOWLEDGE_RESOURCE__TEMPLATE_IDS;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE_RESOURCE__TITLE = KNOWLEDGE_RESOURCE__TITLE;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE_RESOURCE__LOCATION = KNOWLEDGE_RESOURCE__LOCATION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE_RESOURCE__DESCRIPTION = KNOWLEDGE_RESOURCE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Citation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE_RESOURCE__CITATION = KNOWLEDGE_RESOURCE__CITATION;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE_RESOURCE__CONTENT = KNOWLEDGE_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Inline Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE_RESOURCE_FEATURE_COUNT = KNOWLEDGE_RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Inline Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE_RESOURCE_OPERATION_COUNT = KNOWLEDGE_RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.knowledgeartifact.r2.impl.ItemCodesTypeImpl <em>Item Codes Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r2.impl.ItemCodesTypeImpl
	 * @see org.hl7.knowledgeartifact.r2.impl.R2PackageImpl#getItemCodesType()
	 * @generated
	 */
	int ITEM_CODES_TYPE = 73;

	/**
	 * The feature id for the '<em><b>Item Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_CODES_TYPE__ITEM_CODE = 0;

	/**
	 * The number of structural features of the '<em>Item Codes Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_CODES_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Item Codes Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_CODES_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.hl7.knowledgeartifact.r2.impl.KeyTermsTypeImpl <em>Key Terms Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r2.impl.KeyTermsTypeImpl
	 * @see org.hl7.knowledgeartifact.r2.impl.R2PackageImpl#getKeyTermsType()
	 * @generated
	 */
	int KEY_TERMS_TYPE = 75;

	/**
	 * The feature id for the '<em><b>Term</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_TERMS_TYPE__TERM = 0;

	/**
	 * The number of structural features of the '<em>Key Terms Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_TERMS_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Key Terms Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_TERMS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.hl7.knowledgeartifact.r2.impl.KnowledgeDocumentImpl <em>Knowledge Document</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r2.impl.KnowledgeDocumentImpl
	 * @see org.hl7.knowledgeartifact.r2.impl.R2PackageImpl#getKnowledgeDocument()
	 * @generated
	 */
	int KNOWLEDGE_DOCUMENT = 76;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNOWLEDGE_DOCUMENT__METADATA = 0;

	/**
	 * The feature id for the '<em><b>External Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNOWLEDGE_DOCUMENT__EXTERNAL_DATA = 1;

	/**
	 * The feature id for the '<em><b>Expressions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNOWLEDGE_DOCUMENT__EXPRESSIONS = 2;

	/**
	 * The feature id for the '<em><b>Triggers</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNOWLEDGE_DOCUMENT__TRIGGERS = 3;

	/**
	 * The feature id for the '<em><b>Conditions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNOWLEDGE_DOCUMENT__CONDITIONS = 4;

	/**
	 * The feature id for the '<em><b>Behaviors</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNOWLEDGE_DOCUMENT__BEHAVIORS = 5;

	/**
	 * The feature id for the '<em><b>Action Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNOWLEDGE_DOCUMENT__ACTION_GROUP = 6;

	/**
	 * The number of structural features of the '<em>Knowledge Document</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNOWLEDGE_DOCUMENT_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Knowledge Document</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNOWLEDGE_DOCUMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.hl7.knowledgeartifact.r2.impl.LibrariesTypeImpl <em>Libraries Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r2.impl.LibrariesTypeImpl
	 * @see org.hl7.knowledgeartifact.r2.impl.R2PackageImpl#getLibrariesType()
	 * @generated
	 */
	int LIBRARIES_TYPE = 78;

	/**
	 * The feature id for the '<em><b>Library Reference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARIES_TYPE__LIBRARY_REFERENCE = 0;

	/**
	 * The number of structural features of the '<em>Libraries Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARIES_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Libraries Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARIES_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.hl7.knowledgeartifact.r2.impl.LibraryReferenceImpl <em>Library Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r2.impl.LibraryReferenceImpl
	 * @see org.hl7.knowledgeartifact.r2.impl.R2PackageImpl#getLibraryReference()
	 * @generated
	 */
	int LIBRARY_REFERENCE = 79;

	/**
	 * The feature id for the '<em><b>Media Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY_REFERENCE__MEDIA_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY_REFERENCE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY_REFERENCE__PATH = 2;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY_REFERENCE__VERSION = 3;

	/**
	 * The number of structural features of the '<em>Library Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY_REFERENCE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Library Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY_REFERENCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.hl7.knowledgeartifact.r2.impl.LookupConstraintImpl <em>Lookup Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r2.impl.LookupConstraintImpl
	 * @see org.hl7.knowledgeartifact.r2.impl.R2PackageImpl#getLookupConstraint()
	 * @generated
	 */
	int LOOKUP_CONSTRAINT = 80;

	/**
	 * The feature id for the '<em><b>Constraint Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOKUP_CONSTRAINT__CONSTRAINT_TYPE = RANGE_CONSTRAINT__CONSTRAINT_TYPE;

	/**
	 * The feature id for the '<em><b>Items</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOKUP_CONSTRAINT__ITEMS = RANGE_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Display Field</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOKUP_CONSTRAINT__DISPLAY_FIELD = RANGE_CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Strict Selection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOKUP_CONSTRAINT__STRICT_SELECTION = RANGE_CONSTRAINT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Lookup Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOKUP_CONSTRAINT_FEATURE_COUNT = RANGE_CONSTRAINT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Lookup Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOKUP_CONSTRAINT_OPERATION_COUNT = RANGE_CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.knowledgeartifact.r2.impl.ManifestImpl <em>Manifest</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r2.impl.ManifestImpl
	 * @see org.hl7.knowledgeartifact.r2.impl.R2PackageImpl#getManifest()
	 * @generated
	 */
	int MANIFEST = 81;

	/**
	 * The feature id for the '<em><b>Artifact Summary</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANIFEST__ARTIFACT_SUMMARY = 0;

	/**
	 * The number of structural features of the '<em>Manifest</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANIFEST_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Manifest</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANIFEST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.hl7.knowledgeartifact.r2.impl.MappingTypeImpl <em>Mapping Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r2.impl.MappingTypeImpl
	 * @see org.hl7.knowledgeartifact.r2.impl.R2PackageImpl#getMappingType()
	 * @generated
	 */
	int MAPPING_TYPE = 82;

	/**
	 * The feature id for the '<em><b>Component Event Mappings</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_TYPE__COMPONENT_EVENT_MAPPINGS = 0;

	/**
	 * The number of structural features of the '<em>Mapping Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Mapping Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.hl7.knowledgeartifact.r2.impl.MaskConstraintImpl <em>Mask Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r2.impl.MaskConstraintImpl
	 * @see org.hl7.knowledgeartifact.r2.impl.R2PackageImpl#getMaskConstraint()
	 * @generated
	 */
	int MASK_CONSTRAINT = 83;

	/**
	 * The feature id for the '<em><b>Constraint Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASK_CONSTRAINT__CONSTRAINT_TYPE = RANGE_CONSTRAINT__CONSTRAINT_TYPE;

	/**
	 * The feature id for the '<em><b>Mask Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASK_CONSTRAINT__MASK_EXPRESSION = RANGE_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Mask Help</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASK_CONSTRAINT__MASK_HELP = RANGE_CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Mask Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASK_CONSTRAINT_FEATURE_COUNT = RANGE_CONSTRAINT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Mask Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASK_CONSTRAINT_OPERATION_COUNT = RANGE_CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.knowledgeartifact.r2.impl.MetadataImpl <em>Metadata</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r2.impl.MetadataImpl
	 * @see org.hl7.knowledgeartifact.r2.impl.R2PackageImpl#getMetadata()
	 * @generated
	 */
	int METADATA = 84;

	/**
	 * The feature id for the '<em><b>Identifiers</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA__IDENTIFIERS = 0;

	/**
	 * The feature id for the '<em><b>Artifact Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA__ARTIFACT_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Schema Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA__SCHEMA_IDENTIFIER = 2;

	/**
	 * The feature id for the '<em><b>Template Ids</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA__TEMPLATE_IDS = 3;

	/**
	 * The feature id for the '<em><b>Data Models</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA__DATA_MODELS = 4;

	/**
	 * The feature id for the '<em><b>Libraries</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA__LIBRARIES = 5;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA__TITLE = 6;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA__DESCRIPTION = 7;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA__DOCUMENTATION = 8;

	/**
	 * The feature id for the '<em><b>Related Resources</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA__RELATED_RESOURCES = 9;

	/**
	 * The feature id for the '<em><b>Supporting Evidence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA__SUPPORTING_EVIDENCE = 10;

	/**
	 * The feature id for the '<em><b>Applicability</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA__APPLICABILITY = 11;

	/**
	 * The feature id for the '<em><b>Key Terms</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA__KEY_TERMS = 12;

	/**
	 * The feature id for the '<em><b>Categories</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA__CATEGORIES = 13;

	/**
	 * The feature id for the '<em><b>Language</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA__LANGUAGE = 14;

	/**
	 * The feature id for the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA__STATUS = 15;

	/**
	 * The feature id for the '<em><b>Event History</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA__EVENT_HISTORY = 16;

	/**
	 * The feature id for the '<em><b>Contributions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA__CONTRIBUTIONS = 17;

	/**
	 * The feature id for the '<em><b>Publishers</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA__PUBLISHERS = 18;

	/**
	 * The feature id for the '<em><b>Usage Terms</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA__USAGE_TERMS = 19;

	/**
	 * The number of structural features of the '<em>Metadata</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA_FEATURE_COUNT = 20;

	/**
	 * The number of operations of the '<em>Metadata</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.hl7.knowledgeartifact.r2.impl.MetadataBindingImpl <em>Metadata Binding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r2.impl.MetadataBindingImpl
	 * @see org.hl7.knowledgeartifact.r2.impl.R2PackageImpl#getMetadataBinding()
	 * @generated
	 */
	int METADATA_BINDING = 85;

	/**
	 * The feature id for the '<em><b>Bindings</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA_BINDING__BINDINGS = 0;

	/**
	 * The number of structural features of the '<em>Metadata Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA_BINDING_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Metadata Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA_BINDING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.hl7.knowledgeartifact.r2.impl.ModelReferenceImpl <em>Model Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r2.impl.ModelReferenceImpl
	 * @see org.hl7.knowledgeartifact.r2.impl.R2PackageImpl#getModelReference()
	 * @generated
	 */
	int MODEL_REFERENCE = 86;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_REFERENCE__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Referenced Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_REFERENCE__REFERENCED_MODEL = 1;

	/**
	 * The number of structural features of the '<em>Model Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_REFERENCE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Model Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_REFERENCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.hl7.knowledgeartifact.r2.impl.NamedEventDefImpl <em>Named Event Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r2.impl.NamedEventDefImpl
	 * @see org.hl7.knowledgeartifact.r2.impl.R2PackageImpl#getNamedEventDef()
	 * @generated
	 */
	int NAMED_EVENT_DEF = 87;

	/**
	 * The feature id for the '<em><b>Event Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_EVENT_DEF__EVENT_NAME = 0;

	/**
	 * The number of structural features of the '<em>Named Event Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_EVENT_DEF_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Named Event Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_EVENT_DEF_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.hl7.knowledgeartifact.r2.impl.NamedEventTriggerImpl <em>Named Event Trigger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r2.impl.NamedEventTriggerImpl
	 * @see org.hl7.knowledgeartifact.r2.impl.R2PackageImpl#getNamedEventTrigger()
	 * @generated
	 */
	int NAMED_EVENT_TRIGGER = 88;

	/**
	 * The feature id for the '<em><b>Def</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_EVENT_TRIGGER__DEF = TRIGGER__DEF;

	/**
	 * The feature id for the '<em><b>Identifiers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_EVENT_TRIGGER__IDENTIFIERS = TRIGGER__IDENTIFIERS;

	/**
	 * The feature id for the '<em><b>Text Equivalent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_EVENT_TRIGGER__TEXT_EQUIVALENT = TRIGGER__TEXT_EQUIVALENT;

	/**
	 * The feature id for the '<em><b>On Event Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_EVENT_TRIGGER__ON_EVENT_NAME = TRIGGER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Named Event Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_EVENT_TRIGGER_FEATURE_COUNT = TRIGGER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Named Event Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_EVENT_TRIGGER_OPERATION_COUNT = TRIGGER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.knowledgeartifact.r2.impl.NameTypeImpl <em>Name Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r2.impl.NameTypeImpl
	 * @see org.hl7.knowledgeartifact.r2.impl.R2PackageImpl#getNameType()
	 * @generated
	 */
	int NAME_TYPE = 89;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_TYPE__VALUE = 0;

	/**
	 * The number of structural features of the '<em>Name Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Name Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.hl7.knowledgeartifact.r2.impl.PartyImpl <em>Party</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r2.impl.PartyImpl
	 * @see org.hl7.knowledgeartifact.r2.impl.R2PackageImpl#getParty()
	 * @generated
	 */
	int PARTY = 91;

	/**
	 * The feature id for the '<em><b>Addresses</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY__ADDRESSES = 0;

	/**
	 * The feature id for the '<em><b>Contacts</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY__CONTACTS = 1;

	/**
	 * The number of structural features of the '<em>Party</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Party</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.hl7.knowledgeartifact.r2.impl.OrganizationImpl <em>Organization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r2.impl.OrganizationImpl
	 * @see org.hl7.knowledgeartifact.r2.impl.R2PackageImpl#getOrganization()
	 * @generated
	 */
	int ORGANIZATION = 90;

	/**
	 * The feature id for the '<em><b>Addresses</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__ADDRESSES = PARTY__ADDRESSES;

	/**
	 * The feature id for the '<em><b>Contacts</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__CONTACTS = PARTY__CONTACTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__NAME = PARTY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Organization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION_FEATURE_COUNT = PARTY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Organization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION_OPERATION_COUNT = PARTY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.knowledgeartifact.r2.impl.PeriodicEventTriggerImpl <em>Periodic Event Trigger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r2.impl.PeriodicEventTriggerImpl
	 * @see org.hl7.knowledgeartifact.r2.impl.R2PackageImpl#getPeriodicEventTrigger()
	 * @generated
	 */
	int PERIODIC_EVENT_TRIGGER = 92;

	/**
	 * The feature id for the '<em><b>Def</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIODIC_EVENT_TRIGGER__DEF = TRIGGER__DEF;

	/**
	 * The feature id for the '<em><b>Identifiers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIODIC_EVENT_TRIGGER__IDENTIFIERS = TRIGGER__IDENTIFIERS;

	/**
	 * The feature id for the '<em><b>Text Equivalent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIODIC_EVENT_TRIGGER__TEXT_EQUIVALENT = TRIGGER__TEXT_EQUIVALENT;

	/**
	 * The number of structural features of the '<em>Periodic Event Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIODIC_EVENT_TRIGGER_FEATURE_COUNT = TRIGGER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Periodic Event Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIODIC_EVENT_TRIGGER_OPERATION_COUNT = TRIGGER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.knowledgeartifact.r2.impl.PermissionsTypeImpl <em>Permissions Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r2.impl.PermissionsTypeImpl
	 * @see org.hl7.knowledgeartifact.r2.impl.R2PackageImpl#getPermissionsType()
	 * @generated
	 */
	int PERMISSIONS_TYPE = 93;

	/**
	 * The feature id for the '<em><b>Permissions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERMISSIONS_TYPE__PERMISSIONS = 0;

	/**
	 * The number of structural features of the '<em>Permissions Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERMISSIONS_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Permissions Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERMISSIONS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.hl7.knowledgeartifact.r2.impl.PersonImpl <em>Person</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r2.impl.PersonImpl
	 * @see org.hl7.knowledgeartifact.r2.impl.R2PackageImpl#getPerson()
	 * @generated
	 */
	int PERSON = 94;

	/**
	 * The feature id for the '<em><b>Addresses</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__ADDRESSES = PARTY__ADDRESSES;

	/**
	 * The feature id for the '<em><b>Contacts</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__CONTACTS = PARTY__CONTACTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__NAME = PARTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Affiliation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__AFFILIATION = PARTY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_FEATURE_COUNT = PARTY_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_OPERATION_COUNT = PARTY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.knowledgeartifact.r2.impl.PrecheckBehaviorImpl <em>Precheck Behavior</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r2.impl.PrecheckBehaviorImpl
	 * @see org.hl7.knowledgeartifact.r2.impl.R2PackageImpl#getPrecheckBehavior()
	 * @generated
	 */
	int PRECHECK_BEHAVIOR = 95;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECHECK_BEHAVIOR__VALUE = BEHAVIOR__VALUE;

	/**
	 * The number of structural features of the '<em>Precheck Behavior</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECHECK_BEHAVIOR_FEATURE_COUNT = BEHAVIOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Precheck Behavior</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECHECK_BEHAVIOR_OPERATION_COUNT = BEHAVIOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.knowledgeartifact.r2.impl.PublishersTypeImpl <em>Publishers Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r2.impl.PublishersTypeImpl
	 * @see org.hl7.knowledgeartifact.r2.impl.R2PackageImpl#getPublishersType()
	 * @generated
	 */
	int PUBLISHERS_TYPE = 96;

	/**
	 * The feature id for the '<em><b>Publisher</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLISHERS_TYPE__PUBLISHER = 0;

	/**
	 * The number of structural features of the '<em>Publishers Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLISHERS_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Publishers Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLISHERS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.hl7.knowledgeartifact.r2.impl.ReadOnlyBehaviorImpl <em>Read Only Behavior</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r2.impl.ReadOnlyBehaviorImpl
	 * @see org.hl7.knowledgeartifact.r2.impl.R2PackageImpl#getReadOnlyBehavior()
	 * @generated
	 */
	int READ_ONLY_BEHAVIOR = 98;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_ONLY_BEHAVIOR__VALUE = BEHAVIOR__VALUE;

	/**
	 * The number of structural features of the '<em>Read Only Behavior</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_ONLY_BEHAVIOR_FEATURE_COUNT = BEHAVIOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Read Only Behavior</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_ONLY_BEHAVIOR_OPERATION_COUNT = BEHAVIOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.knowledgeartifact.r2.impl.ReferenceImpl <em>Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r2.impl.ReferenceImpl
	 * @see org.hl7.knowledgeartifact.r2.impl.R2PackageImpl#getReference()
	 * @generated
	 */
	int REFERENCE = 99;

	/**
	 * The feature id for the '<em><b>Url</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__URL = 0;

	/**
	 * The feature id for the '<em><b>Content Hash</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__CONTENT_HASH = 1;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__UUID = 2;

	/**
	 * The feature id for the '<em><b>Identifiers</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__IDENTIFIERS = 3;

	/**
	 * The number of structural features of the '<em>Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.hl7.knowledgeartifact.r2.impl.ReferencedModelTypeImpl <em>Referenced Model Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r2.impl.ReferencedModelTypeImpl
	 * @see org.hl7.knowledgeartifact.r2.impl.R2PackageImpl#getReferencedModelType()
	 * @generated
	 */
	int REFERENCED_MODEL_TYPE = 100;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCED_MODEL_TYPE__VALUE = 0;

	/**
	 * The number of structural features of the '<em>Referenced Model Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCED_MODEL_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Referenced Model Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCED_MODEL_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.hl7.knowledgeartifact.r2.impl.ReferenceListImpl <em>Reference List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r2.impl.ReferenceListImpl
	 * @see org.hl7.knowledgeartifact.r2.impl.R2PackageImpl#getReferenceList()
	 * @generated
	 */
	int REFERENCE_LIST = 101;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_LIST__REFERENCE = 0;

	/**
	 * The number of structural features of the '<em>Reference List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_LIST_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Reference List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_LIST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.hl7.knowledgeartifact.r2.impl.RelatedResourcesTypeImpl <em>Related Resources Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r2.impl.RelatedResourcesTypeImpl
	 * @see org.hl7.knowledgeartifact.r2.impl.R2PackageImpl#getRelatedResourcesType()
	 * @generated
	 */
	int RELATED_RESOURCES_TYPE = 102;

	/**
	 * The feature id for the '<em><b>Related Resource</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATED_RESOURCES_TYPE__RELATED_RESOURCE = 0;

	/**
	 * The number of structural features of the '<em>Related Resources Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATED_RESOURCES_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Related Resources Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATED_RESOURCES_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.hl7.knowledgeartifact.r2.impl.RelationshipTypeImpl <em>Relationship Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r2.impl.RelationshipTypeImpl
	 * @see org.hl7.knowledgeartifact.r2.impl.R2PackageImpl#getRelationshipType()
	 * @generated
	 */
	int RELATIONSHIP_TYPE = 103;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_TYPE__VALUE = 0;

	/**
	 * The number of structural features of the '<em>Relationship Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Relationship Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.hl7.knowledgeartifact.r2.impl.RemoveActionImpl <em>Remove Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r2.impl.RemoveActionImpl
	 * @see org.hl7.knowledgeartifact.r2.impl.R2PackageImpl#getRemoveAction()
	 * @generated
	 */
	int REMOVE_ACTION = 104;

	/**
	 * The feature id for the '<em><b>Action Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_ACTION__ACTION_ID = ATOMIC_ACTION__ACTION_ID;

	/**
	 * The feature id for the '<em><b>Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_ACTION__NUMBER = ATOMIC_ACTION__NUMBER;

	/**
	 * The feature id for the '<em><b>Supporting Evidence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_ACTION__SUPPORTING_EVIDENCE = ATOMIC_ACTION__SUPPORTING_EVIDENCE;

	/**
	 * The feature id for the '<em><b>Supporting Resources</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_ACTION__SUPPORTING_RESOURCES = ATOMIC_ACTION__SUPPORTING_RESOURCES;

	/**
	 * The feature id for the '<em><b>Actors</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_ACTION__ACTORS = ATOMIC_ACTION__ACTORS;

	/**
	 * The feature id for the '<em><b>Behaviors</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_ACTION__BEHAVIORS = ATOMIC_ACTION__BEHAVIORS;

	/**
	 * The feature id for the '<em><b>Conditions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_ACTION__CONDITIONS = ATOMIC_ACTION__CONDITIONS;

	/**
	 * The feature id for the '<em><b>Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_ACTION__ORDER = ATOMIC_ACTION__ORDER;

	/**
	 * The feature id for the '<em><b>Text Equivalent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_ACTION__TEXT_EQUIVALENT = ATOMIC_ACTION__TEXT_EQUIVALENT;

	/**
	 * The feature id for the '<em><b>Action Sentence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_ACTION__ACTION_SENTENCE = ATOMIC_ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Remove Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_ACTION_FEATURE_COUNT = ATOMIC_ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Remove Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_ACTION_OPERATION_COUNT = ATOMIC_ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.knowledgeartifact.r2.impl.RepresentedConceptsTypeImpl <em>Represented Concepts Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r2.impl.RepresentedConceptsTypeImpl
	 * @see org.hl7.knowledgeartifact.r2.impl.R2PackageImpl#getRepresentedConceptsType()
	 * @generated
	 */
	int REPRESENTED_CONCEPTS_TYPE = 105;

	/**
	 * The feature id for the '<em><b>Concept</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPRESENTED_CONCEPTS_TYPE__CONCEPT = 0;

	/**
	 * The number of structural features of the '<em>Represented Concepts Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPRESENTED_CONCEPTS_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Represented Concepts Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPRESENTED_CONCEPTS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.hl7.knowledgeartifact.r2.impl.RequiredBehaviorImpl <em>Required Behavior</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r2.impl.RequiredBehaviorImpl
	 * @see org.hl7.knowledgeartifact.r2.impl.R2PackageImpl#getRequiredBehavior()
	 * @generated
	 */
	int REQUIRED_BEHAVIOR = 106;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_BEHAVIOR__VALUE = BEHAVIOR__VALUE;

	/**
	 * The number of structural features of the '<em>Required Behavior</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_BEHAVIOR_FEATURE_COUNT = BEHAVIOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Required Behavior</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_BEHAVIOR_OPERATION_COUNT = BEHAVIOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.knowledgeartifact.r2.impl.ResourceRelationshipReferenceImpl <em>Resource Relationship Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r2.impl.ResourceRelationshipReferenceImpl
	 * @see org.hl7.knowledgeartifact.r2.impl.R2PackageImpl#getResourceRelationshipReference()
	 * @generated
	 */
	int RESOURCE_RELATIONSHIP_REFERENCE = 107;

	/**
	 * The feature id for the '<em><b>Relationship</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_RELATIONSHIP_REFERENCE__RELATIONSHIP = 0;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_RELATIONSHIP_REFERENCE__RESOURCES = 1;

	/**
	 * The number of structural features of the '<em>Resource Relationship Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_RELATIONSHIP_REFERENCE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Resource Relationship Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_RELATIONSHIP_REFERENCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.hl7.knowledgeartifact.r2.impl.ResourcesTypeImpl <em>Resources Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r2.impl.ResourcesTypeImpl
	 * @see org.hl7.knowledgeartifact.r2.impl.R2PackageImpl#getResourcesType()
	 * @generated
	 */
	int RESOURCES_TYPE = 108;

	/**
	 * The feature id for the '<em><b>Resource</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCES_TYPE__RESOURCE = 0;

	/**
	 * The number of structural features of the '<em>Resources Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCES_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Resources Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCES_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.hl7.knowledgeartifact.r2.impl.ResponseBindingImpl <em>Response Binding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r2.impl.ResponseBindingImpl
	 * @see org.hl7.knowledgeartifact.r2.impl.R2PackageImpl#getResponseBinding()
	 * @generated
	 */
	int RESPONSE_BINDING = 109;

	/**
	 * The feature id for the '<em><b>Container</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_BINDING__CONTAINER = 0;

	/**
	 * The feature id for the '<em><b>Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_BINDING__PROPERTY = 1;

	/**
	 * The number of structural features of the '<em>Response Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_BINDING_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Response Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_BINDING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.hl7.knowledgeartifact.r2.impl.ResponseCardinalityTypeImpl <em>Response Cardinality Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r2.impl.ResponseCardinalityTypeImpl
	 * @see org.hl7.knowledgeartifact.r2.impl.R2PackageImpl#getResponseCardinalityType()
	 * @generated
	 */
	int RESPONSE_CARDINALITY_TYPE = 110;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_CARDINALITY_TYPE__VALUE = 0;

	/**
	 * The number of structural features of the '<em>Response Cardinality Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_CARDINALITY_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Response Cardinality Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_CARDINALITY_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.hl7.knowledgeartifact.r2.impl.ResponseDataTypeTypeImpl <em>Response Data Type Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r2.impl.ResponseDataTypeTypeImpl
	 * @see org.hl7.knowledgeartifact.r2.impl.R2PackageImpl#getResponseDataTypeType()
	 * @generated
	 */
	int RESPONSE_DATA_TYPE_TYPE = 111;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_DATA_TYPE_TYPE__VALUE = 0;

	/**
	 * The number of structural features of the '<em>Response Data Type Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_DATA_TYPE_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Response Data Type Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_DATA_TYPE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.hl7.knowledgeartifact.r2.impl.RightsDeclarationImpl <em>Rights Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r2.impl.RightsDeclarationImpl
	 * @see org.hl7.knowledgeartifact.r2.impl.R2PackageImpl#getRightsDeclaration()
	 * @generated
	 */
	int RIGHTS_DECLARATION = 112;

	/**
	 * The feature id for the '<em><b>Asserted Rights</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHTS_DECLARATION__ASSERTED_RIGHTS = 0;

	/**
	 * The feature id for the '<em><b>Rights Holder</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHTS_DECLARATION__RIGHTS_HOLDER = 1;

	/**
	 * The feature id for the '<em><b>Permissions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHTS_DECLARATION__PERMISSIONS = 2;

	/**
	 * The number of structural features of the '<em>Rights Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHTS_DECLARATION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Rights Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHTS_DECLARATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.hl7.knowledgeartifact.r2.impl.RoleTypeImpl <em>Role Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r2.impl.RoleTypeImpl
	 * @see org.hl7.knowledgeartifact.r2.impl.R2PackageImpl#getRoleType()
	 * @generated
	 */
	int ROLE_TYPE = 113;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_TYPE__VALUE = 0;

	/**
	 * The number of structural features of the '<em>Role Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Role Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.hl7.knowledgeartifact.r2.impl.SpecificEventBindingImpl <em>Specific Event Binding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r2.impl.SpecificEventBindingImpl
	 * @see org.hl7.knowledgeartifact.r2.impl.R2PackageImpl#getSpecificEventBinding()
	 * @generated
	 */
	int SPECIFIC_EVENT_BINDING = 114;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_EVENT_BINDING__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Container Event</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_EVENT_BINDING__CONTAINER_EVENT = 1;

	/**
	 * The feature id for the '<em><b>Event Binding Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_EVENT_BINDING__EVENT_BINDING_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Component Event</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_EVENT_BINDING__COMPONENT_EVENT = 3;

	/**
	 * The feature id for the '<em><b>Mutability</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_EVENT_BINDING__MUTABILITY = 4;

	/**
	 * The number of structural features of the '<em>Specific Event Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_EVENT_BINDING_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Specific Event Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_EVENT_BINDING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.hl7.knowledgeartifact.r2.impl.SpecificMetadataBindingImpl <em>Specific Metadata Binding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r2.impl.SpecificMetadataBindingImpl
	 * @see org.hl7.knowledgeartifact.r2.impl.R2PackageImpl#getSpecificMetadataBinding()
	 * @generated
	 */
	int SPECIFIC_METADATA_BINDING = 115;

	/**
	 * The feature id for the '<em><b>Binding Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_METADATA_BINDING__BINDING_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_METADATA_BINDING__METADATA = 1;

	/**
	 * The number of structural features of the '<em>Specific Metadata Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_METADATA_BINDING_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Specific Metadata Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_METADATA_BINDING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.hl7.knowledgeartifact.r2.impl.StatusTypeImpl <em>Status Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r2.impl.StatusTypeImpl
	 * @see org.hl7.knowledgeartifact.r2.impl.R2PackageImpl#getStatusType()
	 * @generated
	 */
	int STATUS_TYPE = 116;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_TYPE__VALUE = 0;

	/**
	 * The number of structural features of the '<em>Status Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Status Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.hl7.knowledgeartifact.r2.impl.SubElementsTypeImpl <em>Sub Elements Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r2.impl.SubElementsTypeImpl
	 * @see org.hl7.knowledgeartifact.r2.impl.R2PackageImpl#getSubElementsType()
	 * @generated
	 */
	int SUB_ELEMENTS_TYPE = 117;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_ELEMENTS_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Simple Action</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_ELEMENTS_TYPE__SIMPLE_ACTION = 1;

	/**
	 * The feature id for the '<em><b>Action Group</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_ELEMENTS_TYPE__ACTION_GROUP = 2;

	/**
	 * The feature id for the '<em><b>Action Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_ELEMENTS_TYPE__ACTION_REF = 3;

	/**
	 * The number of structural features of the '<em>Sub Elements Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_ELEMENTS_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Sub Elements Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_ELEMENTS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.hl7.knowledgeartifact.r2.impl.SupportingEvidenceImpl <em>Supporting Evidence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r2.impl.SupportingEvidenceImpl
	 * @see org.hl7.knowledgeartifact.r2.impl.R2PackageImpl#getSupportingEvidence()
	 * @generated
	 */
	int SUPPORTING_EVIDENCE = 118;

	/**
	 * The feature id for the '<em><b>Evidence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORTING_EVIDENCE__EVIDENCE = 0;

	/**
	 * The number of structural features of the '<em>Supporting Evidence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORTING_EVIDENCE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Supporting Evidence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORTING_EVIDENCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.hl7.knowledgeartifact.r2.impl.SupportingResourceImpl <em>Supporting Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r2.impl.SupportingResourceImpl
	 * @see org.hl7.knowledgeartifact.r2.impl.R2PackageImpl#getSupportingResource()
	 * @generated
	 */
	int SUPPORTING_RESOURCE = 119;

	/**
	 * The feature id for the '<em><b>Resource</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORTING_RESOURCE__RESOURCE = 0;

	/**
	 * The number of structural features of the '<em>Supporting Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORTING_RESOURCE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Supporting Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORTING_RESOURCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.hl7.knowledgeartifact.r2.impl.TemplateIdsTypeImpl <em>Template Ids Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r2.impl.TemplateIdsTypeImpl
	 * @see org.hl7.knowledgeartifact.r2.impl.R2PackageImpl#getTemplateIdsType()
	 * @generated
	 */
	int TEMPLATE_IDS_TYPE = 120;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_IDS_TYPE__TEMPLATE_ID = 0;

	/**
	 * The number of structural features of the '<em>Template Ids Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_IDS_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Template Ids Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_IDS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.hl7.knowledgeartifact.r2.impl.TemplateIdsType1Impl <em>Template Ids Type1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r2.impl.TemplateIdsType1Impl
	 * @see org.hl7.knowledgeartifact.r2.impl.R2PackageImpl#getTemplateIdsType1()
	 * @generated
	 */
	int TEMPLATE_IDS_TYPE1 = 121;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_IDS_TYPE1__TEMPLATE_ID = 0;

	/**
	 * The number of structural features of the '<em>Template Ids Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_IDS_TYPE1_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Template Ids Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_IDS_TYPE1_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.hl7.knowledgeartifact.r2.impl.TriggerBindingsImpl <em>Trigger Bindings</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r2.impl.TriggerBindingsImpl
	 * @see org.hl7.knowledgeartifact.r2.impl.R2PackageImpl#getTriggerBindings()
	 * @generated
	 */
	int TRIGGER_BINDINGS = 123;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_BINDINGS__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Trigger</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_BINDINGS__TRIGGER = 1;

	/**
	 * The number of structural features of the '<em>Trigger Bindings</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_BINDINGS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Trigger Bindings</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_BINDINGS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.hl7.knowledgeartifact.r2.impl.TriggersImpl <em>Triggers</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r2.impl.TriggersImpl
	 * @see org.hl7.knowledgeartifact.r2.impl.R2PackageImpl#getTriggers()
	 * @generated
	 */
	int TRIGGERS = 124;

	/**
	 * The feature id for the '<em><b>Trigger</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGERS__TRIGGER = 0;

	/**
	 * The number of structural features of the '<em>Triggers</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGERS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Triggers</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGERS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.hl7.knowledgeartifact.r2.impl.UpdateActionImpl <em>Update Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r2.impl.UpdateActionImpl
	 * @see org.hl7.knowledgeartifact.r2.impl.R2PackageImpl#getUpdateAction()
	 * @generated
	 */
	int UPDATE_ACTION = 125;

	/**
	 * The feature id for the '<em><b>Action Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_ACTION__ACTION_ID = ATOMIC_ACTION__ACTION_ID;

	/**
	 * The feature id for the '<em><b>Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_ACTION__NUMBER = ATOMIC_ACTION__NUMBER;

	/**
	 * The feature id for the '<em><b>Supporting Evidence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_ACTION__SUPPORTING_EVIDENCE = ATOMIC_ACTION__SUPPORTING_EVIDENCE;

	/**
	 * The feature id for the '<em><b>Supporting Resources</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_ACTION__SUPPORTING_RESOURCES = ATOMIC_ACTION__SUPPORTING_RESOURCES;

	/**
	 * The feature id for the '<em><b>Actors</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_ACTION__ACTORS = ATOMIC_ACTION__ACTORS;

	/**
	 * The feature id for the '<em><b>Behaviors</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_ACTION__BEHAVIORS = ATOMIC_ACTION__BEHAVIORS;

	/**
	 * The feature id for the '<em><b>Conditions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_ACTION__CONDITIONS = ATOMIC_ACTION__CONDITIONS;

	/**
	 * The feature id for the '<em><b>Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_ACTION__ORDER = ATOMIC_ACTION__ORDER;

	/**
	 * The feature id for the '<em><b>Text Equivalent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_ACTION__TEXT_EQUIVALENT = ATOMIC_ACTION__TEXT_EQUIVALENT;

	/**
	 * The feature id for the '<em><b>Action Sentence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_ACTION__ACTION_SENTENCE = ATOMIC_ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Update Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_ACTION_FEATURE_COUNT = ATOMIC_ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Update Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_ACTION_OPERATION_COUNT = ATOMIC_ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.knowledgeartifact.r2.impl.UrlTypeImpl <em>Url Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r2.impl.UrlTypeImpl
	 * @see org.hl7.knowledgeartifact.r2.impl.R2PackageImpl#getUrlType()
	 * @generated
	 */
	int URL_TYPE = 126;

	/**
	 * The feature id for the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_TYPE__ADDRESS = 0;

	/**
	 * The number of structural features of the '<em>Url Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Url Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.hl7.knowledgeartifact.r2.impl.UsageTermsTypeImpl <em>Usage Terms Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r2.impl.UsageTermsTypeImpl
	 * @see org.hl7.knowledgeartifact.r2.impl.R2PackageImpl#getUsageTermsType()
	 * @generated
	 */
	int USAGE_TERMS_TYPE = 127;

	/**
	 * The feature id for the '<em><b>Rights Declaration</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USAGE_TERMS_TYPE__RIGHTS_DECLARATION = 0;

	/**
	 * The number of structural features of the '<em>Usage Terms Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USAGE_TERMS_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Usage Terms Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USAGE_TERMS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.hl7.knowledgeartifact.r2.impl.UuidTypeImpl <em>Uuid Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r2.impl.UuidTypeImpl
	 * @see org.hl7.knowledgeartifact.r2.impl.R2PackageImpl#getUuidType()
	 * @generated
	 */
	int UUID_TYPE = 128;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UUID_TYPE__VALUE = 0;

	/**
	 * The number of structural features of the '<em>Uuid Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UUID_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Uuid Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UUID_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.hl7.knowledgeartifact.r2.impl.ValueSetConstraintImpl <em>Value Set Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r2.impl.ValueSetConstraintImpl
	 * @see org.hl7.knowledgeartifact.r2.impl.R2PackageImpl#getValueSetConstraint()
	 * @generated
	 */
	int VALUE_SET_CONSTRAINT = 129;

	/**
	 * The feature id for the '<em><b>Constraint Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SET_CONSTRAINT__CONSTRAINT_TYPE = RANGE_CONSTRAINT__CONSTRAINT_TYPE;

	/**
	 * The feature id for the '<em><b>Value Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SET_CONSTRAINT__VALUE_SET = RANGE_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Value Set Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SET_CONSTRAINT_FEATURE_COUNT = RANGE_CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Value Set Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SET_CONSTRAINT_OPERATION_COUNT = RANGE_CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.knowledgeartifact.r2.impl.VersionedIdentifierImpl <em>Versioned Identifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r2.impl.VersionedIdentifierImpl
	 * @see org.hl7.knowledgeartifact.r2.impl.R2PackageImpl#getVersionedIdentifier()
	 * @generated
	 */
	int VERSIONED_IDENTIFIER = 130;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_IDENTIFIER__EXTENSION = org.hl7.cdsdt.r2.R2Package.II__EXTENSION;

	/**
	 * The feature id for the '<em><b>Identifier Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_IDENTIFIER__IDENTIFIER_NAME = org.hl7.cdsdt.r2.R2Package.II__IDENTIFIER_NAME;

	/**
	 * The feature id for the '<em><b>Root</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_IDENTIFIER__ROOT = org.hl7.cdsdt.r2.R2Package.II__ROOT;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_IDENTIFIER__VERSION = org.hl7.cdsdt.r2.R2Package.II_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Versioned Identifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_IDENTIFIER_FEATURE_COUNT = org.hl7.cdsdt.r2.R2Package.II_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Versioned Identifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_IDENTIFIER_OPERATION_COUNT = org.hl7.cdsdt.r2.R2Package.II_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.knowledgeartifact.r2.impl.VisualStyleBehaviorImpl <em>Visual Style Behavior</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r2.impl.VisualStyleBehaviorImpl
	 * @see org.hl7.knowledgeartifact.r2.impl.R2PackageImpl#getVisualStyleBehavior()
	 * @generated
	 */
	int VISUAL_STYLE_BEHAVIOR = 131;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUAL_STYLE_BEHAVIOR__VALUE = BEHAVIOR__VALUE;

	/**
	 * The number of structural features of the '<em>Visual Style Behavior</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUAL_STYLE_BEHAVIOR_FEATURE_COUNT = BEHAVIOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Visual Style Behavior</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUAL_STYLE_BEHAVIOR_OPERATION_COUNT = BEHAVIOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.knowledgeartifact.r2.impl.WrappedContentImpl <em>Wrapped Content</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r2.impl.WrappedContentImpl
	 * @see org.hl7.knowledgeartifact.r2.impl.R2PackageImpl#getWrappedContent()
	 * @generated
	 */
	int WRAPPED_CONTENT = 132;

	/**
	 * The feature id for the '<em><b>Content Signifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRAPPED_CONTENT__CONTENT_SIGNIFIER = 0;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRAPPED_CONTENT__CONTENT = 1;

	/**
	 * The number of structural features of the '<em>Wrapped Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRAPPED_CONTENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Wrapped Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRAPPED_CONTENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.hl7.knowledgeartifact.r2.ArtifactLifeCycleEventType <em>Artifact Life Cycle Event Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r2.ArtifactLifeCycleEventType
	 * @see org.hl7.knowledgeartifact.r2.impl.R2PackageImpl#getArtifactLifeCycleEventType()
	 * @generated
	 */
	int ARTIFACT_LIFE_CYCLE_EVENT_TYPE = 133;

	/**
	 * The meta object id for the '{@link org.hl7.knowledgeartifact.r2.ArtifactStatusType <em>Artifact Status Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r2.ArtifactStatusType
	 * @see org.hl7.knowledgeartifact.r2.impl.R2PackageImpl#getArtifactStatusType()
	 * @generated
	 */
	int ARTIFACT_STATUS_TYPE = 134;

	/**
	 * The meta object id for the '{@link org.hl7.knowledgeartifact.r2.ArtifactType <em>Artifact Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r2.ArtifactType
	 * @see org.hl7.knowledgeartifact.r2.impl.R2PackageImpl#getArtifactType()
	 * @generated
	 */
	int ARTIFACT_TYPE = 135;

	/**
	 * The meta object id for the '{@link org.hl7.knowledgeartifact.r2.Cardinality <em>Cardinality</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r2.Cardinality
	 * @see org.hl7.knowledgeartifact.r2.impl.R2PackageImpl#getCardinality()
	 * @generated
	 */
	int CARDINALITY = 136;

	/**
	 * The meta object id for the '{@link org.hl7.knowledgeartifact.r2.CardinalityBehaviorType <em>Cardinality Behavior Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r2.CardinalityBehaviorType
	 * @see org.hl7.knowledgeartifact.r2.impl.R2PackageImpl#getCardinalityBehaviorType()
	 * @generated
	 */
	int CARDINALITY_BEHAVIOR_TYPE = 137;

	/**
	 * The meta object id for the '{@link org.hl7.knowledgeartifact.r2.CompondArtifactType <em>Compond Artifact Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r2.CompondArtifactType
	 * @see org.hl7.knowledgeartifact.r2.impl.R2PackageImpl#getCompondArtifactType()
	 * @generated
	 */
	int COMPOND_ARTIFACT_TYPE = 138;

	/**
	 * The meta object id for the '{@link org.hl7.knowledgeartifact.r2.ConditionRoleType <em>Condition Role Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r2.ConditionRoleType
	 * @see org.hl7.knowledgeartifact.r2.impl.R2PackageImpl#getConditionRoleType()
	 * @generated
	 */
	int CONDITION_ROLE_TYPE = 139;

	/**
	 * The meta object id for the '{@link org.hl7.knowledgeartifact.r2.ContributorType <em>Contributor Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r2.ContributorType
	 * @see org.hl7.knowledgeartifact.r2.impl.R2PackageImpl#getContributorType()
	 * @generated
	 */
	int CONTRIBUTOR_TYPE = 140;

	/**
	 * The meta object id for the '{@link org.hl7.knowledgeartifact.r2.CoverageType <em>Coverage Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r2.CoverageType
	 * @see org.hl7.knowledgeartifact.r2.impl.R2PackageImpl#getCoverageType()
	 * @generated
	 */
	int COVERAGE_TYPE = 141;

	/**
	 * The meta object id for the '{@link org.hl7.knowledgeartifact.r2.DataEventType <em>Data Event Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r2.DataEventType
	 * @see org.hl7.knowledgeartifact.r2.impl.R2PackageImpl#getDataEventType()
	 * @generated
	 */
	int DATA_EVENT_TYPE = 142;

	/**
	 * The meta object id for the '{@link org.hl7.knowledgeartifact.r2.EventType <em>Event Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r2.EventType
	 * @see org.hl7.knowledgeartifact.r2.impl.R2PackageImpl#getEventType()
	 * @generated
	 */
	int EVENT_TYPE = 143;

	/**
	 * The meta object id for the '{@link org.hl7.knowledgeartifact.r2.GroupOrganizationBehaviorType <em>Group Organization Behavior Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r2.GroupOrganizationBehaviorType
	 * @see org.hl7.knowledgeartifact.r2.impl.R2PackageImpl#getGroupOrganizationBehaviorType()
	 * @generated
	 */
	int GROUP_ORGANIZATION_BEHAVIOR_TYPE = 144;

	/**
	 * The meta object id for the '{@link org.hl7.knowledgeartifact.r2.GroupSelectionBehaviorType <em>Group Selection Behavior Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r2.GroupSelectionBehaviorType
	 * @see org.hl7.knowledgeartifact.r2.impl.R2PackageImpl#getGroupSelectionBehaviorType()
	 * @generated
	 */
	int GROUP_SELECTION_BEHAVIOR_TYPE = 145;

	/**
	 * The meta object id for the '{@link org.hl7.knowledgeartifact.r2.MetadataBindingType <em>Metadata Binding Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r2.MetadataBindingType
	 * @see org.hl7.knowledgeartifact.r2.impl.R2PackageImpl#getMetadataBindingType()
	 * @generated
	 */
	int METADATA_BINDING_TYPE = 146;

	/**
	 * The meta object id for the '{@link org.hl7.knowledgeartifact.r2.PrecheckBehaviorType <em>Precheck Behavior Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r2.PrecheckBehaviorType
	 * @see org.hl7.knowledgeartifact.r2.impl.R2PackageImpl#getPrecheckBehaviorType()
	 * @generated
	 */
	int PRECHECK_BEHAVIOR_TYPE = 147;

	/**
	 * The meta object id for the '{@link org.hl7.knowledgeartifact.r2.RangeConstraintType <em>Range Constraint Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r2.RangeConstraintType
	 * @see org.hl7.knowledgeartifact.r2.impl.R2PackageImpl#getRangeConstraintType()
	 * @generated
	 */
	int RANGE_CONSTRAINT_TYPE = 148;

	/**
	 * The meta object id for the '{@link org.hl7.knowledgeartifact.r2.RequiredBehaviorType <em>Required Behavior Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r2.RequiredBehaviorType
	 * @see org.hl7.knowledgeartifact.r2.impl.R2PackageImpl#getRequiredBehaviorType()
	 * @generated
	 */
	int REQUIRED_BEHAVIOR_TYPE = 149;

	/**
	 * The meta object id for the '{@link org.hl7.knowledgeartifact.r2.ResourceRelationshipType <em>Resource Relationship Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r2.ResourceRelationshipType
	 * @see org.hl7.knowledgeartifact.r2.impl.R2PackageImpl#getResourceRelationshipType()
	 * @generated
	 */
	int RESOURCE_RELATIONSHIP_TYPE = 150;

	/**
	 * The meta object id for the '{@link org.hl7.knowledgeartifact.r2.ValueType <em>Value Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r2.ValueType
	 * @see org.hl7.knowledgeartifact.r2.impl.R2PackageImpl#getValueType()
	 * @generated
	 */
	int VALUE_TYPE = 151;

	/**
	 * The meta object id for the '<em>Artifact Life Cycle Event Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r2.ArtifactLifeCycleEventType
	 * @see org.hl7.knowledgeartifact.r2.impl.R2PackageImpl#getArtifactLifeCycleEventTypeObject()
	 * @generated
	 */
	int ARTIFACT_LIFE_CYCLE_EVENT_TYPE_OBJECT = 152;

	/**
	 * The meta object id for the '<em>Artifact Status Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r2.ArtifactStatusType
	 * @see org.hl7.knowledgeartifact.r2.impl.R2PackageImpl#getArtifactStatusTypeObject()
	 * @generated
	 */
	int ARTIFACT_STATUS_TYPE_OBJECT = 153;

	/**
	 * The meta object id for the '<em>Artifact Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r2.ArtifactType
	 * @see org.hl7.knowledgeartifact.r2.impl.R2PackageImpl#getArtifactTypeObject()
	 * @generated
	 */
	int ARTIFACT_TYPE_OBJECT = 154;

	/**
	 * The meta object id for the '<em>Cardinality Behavior Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r2.CardinalityBehaviorType
	 * @see org.hl7.knowledgeartifact.r2.impl.R2PackageImpl#getCardinalityBehaviorTypeObject()
	 * @generated
	 */
	int CARDINALITY_BEHAVIOR_TYPE_OBJECT = 155;

	/**
	 * The meta object id for the '<em>Cardinality Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r2.Cardinality
	 * @see org.hl7.knowledgeartifact.r2.impl.R2PackageImpl#getCardinalityObject()
	 * @generated
	 */
	int CARDINALITY_OBJECT = 156;

	/**
	 * The meta object id for the '<em>Compond Artifact Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r2.CompondArtifactType
	 * @see org.hl7.knowledgeartifact.r2.impl.R2PackageImpl#getCompondArtifactTypeObject()
	 * @generated
	 */
	int COMPOND_ARTIFACT_TYPE_OBJECT = 157;

	/**
	 * The meta object id for the '<em>Condition Role Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r2.ConditionRoleType
	 * @see org.hl7.knowledgeartifact.r2.impl.R2PackageImpl#getConditionRoleTypeObject()
	 * @generated
	 */
	int CONDITION_ROLE_TYPE_OBJECT = 158;

	/**
	 * The meta object id for the '<em>Contributor Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r2.ContributorType
	 * @see org.hl7.knowledgeartifact.r2.impl.R2PackageImpl#getContributorTypeObject()
	 * @generated
	 */
	int CONTRIBUTOR_TYPE_OBJECT = 159;

	/**
	 * The meta object id for the '<em>Coverage Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r2.CoverageType
	 * @see org.hl7.knowledgeartifact.r2.impl.R2PackageImpl#getCoverageTypeObject()
	 * @generated
	 */
	int COVERAGE_TYPE_OBJECT = 160;

	/**
	 * The meta object id for the '<em>Data Event Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r2.DataEventType
	 * @see org.hl7.knowledgeartifact.r2.impl.R2PackageImpl#getDataEventTypeObject()
	 * @generated
	 */
	int DATA_EVENT_TYPE_OBJECT = 161;

	/**
	 * The meta object id for the '<em>Event Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r2.EventType
	 * @see org.hl7.knowledgeartifact.r2.impl.R2PackageImpl#getEventTypeObject()
	 * @generated
	 */
	int EVENT_TYPE_OBJECT = 162;

	/**
	 * The meta object id for the '<em>Group Organization Behavior Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r2.GroupOrganizationBehaviorType
	 * @see org.hl7.knowledgeartifact.r2.impl.R2PackageImpl#getGroupOrganizationBehaviorTypeObject()
	 * @generated
	 */
	int GROUP_ORGANIZATION_BEHAVIOR_TYPE_OBJECT = 163;

	/**
	 * The meta object id for the '<em>Group Selection Behavior Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r2.GroupSelectionBehaviorType
	 * @see org.hl7.knowledgeartifact.r2.impl.R2PackageImpl#getGroupSelectionBehaviorTypeObject()
	 * @generated
	 */
	int GROUP_SELECTION_BEHAVIOR_TYPE_OBJECT = 164;

	/**
	 * The meta object id for the '<em>Metadata Binding Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r2.MetadataBindingType
	 * @see org.hl7.knowledgeartifact.r2.impl.R2PackageImpl#getMetadataBindingTypeObject()
	 * @generated
	 */
	int METADATA_BINDING_TYPE_OBJECT = 165;

	/**
	 * The meta object id for the '<em>Precheck Behavior Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r2.PrecheckBehaviorType
	 * @see org.hl7.knowledgeartifact.r2.impl.R2PackageImpl#getPrecheckBehaviorTypeObject()
	 * @generated
	 */
	int PRECHECK_BEHAVIOR_TYPE_OBJECT = 166;

	/**
	 * The meta object id for the '<em>Range Constraint Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r2.RangeConstraintType
	 * @see org.hl7.knowledgeartifact.r2.impl.R2PackageImpl#getRangeConstraintTypeObject()
	 * @generated
	 */
	int RANGE_CONSTRAINT_TYPE_OBJECT = 167;

	/**
	 * The meta object id for the '<em>Required Behavior Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r2.RequiredBehaviorType
	 * @see org.hl7.knowledgeartifact.r2.impl.R2PackageImpl#getRequiredBehaviorTypeObject()
	 * @generated
	 */
	int REQUIRED_BEHAVIOR_TYPE_OBJECT = 168;

	/**
	 * The meta object id for the '<em>Resource Relationship Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r2.ResourceRelationshipType
	 * @see org.hl7.knowledgeartifact.r2.impl.R2PackageImpl#getResourceRelationshipTypeObject()
	 * @generated
	 */
	int RESOURCE_RELATIONSHIP_TYPE_OBJECT = 169;

	/**
	 * The meta object id for the '<em>Value Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r2.ValueType
	 * @see org.hl7.knowledgeartifact.r2.impl.R2PackageImpl#getValueTypeObject()
	 * @generated
	 */
	int VALUE_TYPE_OBJECT = 170;


	/**
	 * Returns the meta object for class '{@link org.hl7.knowledgeartifact.r2.ActionBase <em>Action Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action Base</em>'.
	 * @see org.hl7.knowledgeartifact.r2.ActionBase
	 * @generated
	 */
	EClass getActionBase();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.knowledgeartifact.r2.ActionBase#getActionId <em>Action Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Action Id</em>'.
	 * @see org.hl7.knowledgeartifact.r2.ActionBase#getActionId()
	 * @see #getActionBase()
	 * @generated
	 */
	EReference getActionBase_ActionId();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.knowledgeartifact.r2.ActionBase#getNumber <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Number</em>'.
	 * @see org.hl7.knowledgeartifact.r2.ActionBase#getNumber()
	 * @see #getActionBase()
	 * @generated
	 */
	EReference getActionBase_Number();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.knowledgeartifact.r2.ActionBase#getSupportingEvidence <em>Supporting Evidence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Supporting Evidence</em>'.
	 * @see org.hl7.knowledgeartifact.r2.ActionBase#getSupportingEvidence()
	 * @see #getActionBase()
	 * @generated
	 */
	EReference getActionBase_SupportingEvidence();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.knowledgeartifact.r2.ActionBase#getSupportingResources <em>Supporting Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Supporting Resources</em>'.
	 * @see org.hl7.knowledgeartifact.r2.ActionBase#getSupportingResources()
	 * @see #getActionBase()
	 * @generated
	 */
	EReference getActionBase_SupportingResources();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.knowledgeartifact.r2.ActionBase#getActors <em>Actors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Actors</em>'.
	 * @see org.hl7.knowledgeartifact.r2.ActionBase#getActors()
	 * @see #getActionBase()
	 * @generated
	 */
	EReference getActionBase_Actors();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.knowledgeartifact.r2.ActionBase#getBehaviors <em>Behaviors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Behaviors</em>'.
	 * @see org.hl7.knowledgeartifact.r2.ActionBase#getBehaviors()
	 * @see #getActionBase()
	 * @generated
	 */
	EReference getActionBase_Behaviors();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.knowledgeartifact.r2.ActionBase#getConditions <em>Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Conditions</em>'.
	 * @see org.hl7.knowledgeartifact.r2.ActionBase#getConditions()
	 * @see #getActionBase()
	 * @generated
	 */
	EReference getActionBase_Conditions();

	/**
	 * Returns the meta object for the attribute '{@link org.hl7.knowledgeartifact.r2.ActionBase#getOrder <em>Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Order</em>'.
	 * @see org.hl7.knowledgeartifact.r2.ActionBase#getOrder()
	 * @see #getActionBase()
	 * @generated
	 */
	EAttribute getActionBase_Order();

	/**
	 * Returns the meta object for class '{@link org.hl7.knowledgeartifact.r2.ActionGroup <em>Action Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action Group</em>'.
	 * @see org.hl7.knowledgeartifact.r2.ActionGroup
	 * @generated
	 */
	EClass getActionGroup();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.knowledgeartifact.r2.ActionGroup#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Title</em>'.
	 * @see org.hl7.knowledgeartifact.r2.ActionGroup#getTitle()
	 * @see #getActionGroup()
	 * @generated
	 */
	EReference getActionGroup_Title();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.knowledgeartifact.r2.ActionGroup#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see org.hl7.knowledgeartifact.r2.ActionGroup#getDescription()
	 * @see #getActionGroup()
	 * @generated
	 */
	EReference getActionGroup_Description();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.knowledgeartifact.r2.ActionGroup#getRepresentedConcepts <em>Represented Concepts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Represented Concepts</em>'.
	 * @see org.hl7.knowledgeartifact.r2.ActionGroup#getRepresentedConcepts()
	 * @see #getActionGroup()
	 * @generated
	 */
	EReference getActionGroup_RepresentedConcepts();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.knowledgeartifact.r2.ActionGroup#getSubElements <em>Sub Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sub Elements</em>'.
	 * @see org.hl7.knowledgeartifact.r2.ActionGroup#getSubElements()
	 * @see #getActionGroup()
	 * @generated
	 */
	EReference getActionGroup_SubElements();

	/**
	 * Returns the meta object for class '{@link org.hl7.knowledgeartifact.r2.ActionRef <em>Action Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action Ref</em>'.
	 * @see org.hl7.knowledgeartifact.r2.ActionRef
	 * @generated
	 */
	EClass getActionRef();

	/**
	 * Returns the meta object for the attribute '{@link org.hl7.knowledgeartifact.r2.ActionRef#getLibraryName <em>Library Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Library Name</em>'.
	 * @see org.hl7.knowledgeartifact.r2.ActionRef#getLibraryName()
	 * @see #getActionRef()
	 * @generated
	 */
	EAttribute getActionRef_LibraryName();

	/**
	 * Returns the meta object for the attribute '{@link org.hl7.knowledgeartifact.r2.ActionRef#getReferencedActionId <em>Referenced Action Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Referenced Action Id</em>'.
	 * @see org.hl7.knowledgeartifact.r2.ActionRef#getReferencedActionId()
	 * @see #getActionRef()
	 * @generated
	 */
	EAttribute getActionRef_ReferencedActionId();

	/**
	 * Returns the meta object for class '{@link org.hl7.knowledgeartifact.r2.Actor <em>Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Actor</em>'.
	 * @see org.hl7.knowledgeartifact.r2.Actor
	 * @generated
	 */
	EClass getActor();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.knowledgeartifact.r2.Actor#getActor <em>Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Actor</em>'.
	 * @see org.hl7.knowledgeartifact.r2.Actor#getActor()
	 * @see #getActor()
	 * @generated
	 */
	EReference getActor_Actor();

	/**
	 * Returns the meta object for class '{@link org.hl7.knowledgeartifact.r2.ActorsType <em>Actors Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Actors Type</em>'.
	 * @see org.hl7.knowledgeartifact.r2.ActorsType
	 * @generated
	 */
	EClass getActorsType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.hl7.knowledgeartifact.r2.ActorsType#getActor <em>Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actor</em>'.
	 * @see org.hl7.knowledgeartifact.r2.ActorsType#getActor()
	 * @see #getActorsType()
	 * @generated
	 */
	EReference getActorsType_Actor();

	/**
	 * Returns the meta object for class '{@link org.hl7.knowledgeartifact.r2.AddressesType <em>Addresses Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Addresses Type</em>'.
	 * @see org.hl7.knowledgeartifact.r2.AddressesType
	 * @generated
	 */
	EClass getAddressesType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.hl7.knowledgeartifact.r2.AddressesType#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Address</em>'.
	 * @see org.hl7.knowledgeartifact.r2.AddressesType#getAddress()
	 * @see #getAddressesType()
	 * @generated
	 */
	EReference getAddressesType_Address();

	/**
	 * Returns the meta object for class '{@link org.hl7.knowledgeartifact.r2.ApplicabilityType <em>Applicability Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Applicability Type</em>'.
	 * @see org.hl7.knowledgeartifact.r2.ApplicabilityType
	 * @generated
	 */
	EClass getApplicabilityType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.hl7.knowledgeartifact.r2.ApplicabilityType#getCoverage <em>Coverage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Coverage</em>'.
	 * @see org.hl7.knowledgeartifact.r2.ApplicabilityType#getCoverage()
	 * @see #getApplicabilityType()
	 * @generated
	 */
	EReference getApplicabilityType_Coverage();

	/**
	 * Returns the meta object for class '{@link org.hl7.knowledgeartifact.r2.ArtifactLifeCycleEvent <em>Artifact Life Cycle Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Artifact Life Cycle Event</em>'.
	 * @see org.hl7.knowledgeartifact.r2.ArtifactLifeCycleEvent
	 * @generated
	 */
	EClass getArtifactLifeCycleEvent();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.knowledgeartifact.r2.ArtifactLifeCycleEvent#getEventType <em>Event Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Event Type</em>'.
	 * @see org.hl7.knowledgeartifact.r2.ArtifactLifeCycleEvent#getEventType()
	 * @see #getArtifactLifeCycleEvent()
	 * @generated
	 */
	EReference getArtifactLifeCycleEvent_EventType();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.knowledgeartifact.r2.ArtifactLifeCycleEvent#getEventDateTime <em>Event Date Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Event Date Time</em>'.
	 * @see org.hl7.knowledgeartifact.r2.ArtifactLifeCycleEvent#getEventDateTime()
	 * @see #getArtifactLifeCycleEvent()
	 * @generated
	 */
	EReference getArtifactLifeCycleEvent_EventDateTime();

	/**
	 * Returns the meta object for class '{@link org.hl7.knowledgeartifact.r2.ArtifactSummary <em>Artifact Summary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Artifact Summary</em>'.
	 * @see org.hl7.knowledgeartifact.r2.ArtifactSummary
	 * @generated
	 */
	EClass getArtifactSummary();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.knowledgeartifact.r2.ArtifactSummary#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Name</em>'.
	 * @see org.hl7.knowledgeartifact.r2.ArtifactSummary#getName()
	 * @see #getArtifactSummary()
	 * @generated
	 */
	EReference getArtifactSummary_Name();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.knowledgeartifact.r2.ArtifactSummary#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Identifier</em>'.
	 * @see org.hl7.knowledgeartifact.r2.ArtifactSummary#getIdentifier()
	 * @see #getArtifactSummary()
	 * @generated
	 */
	EReference getArtifactSummary_Identifier();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.knowledgeartifact.r2.ArtifactSummary#getArtifactType <em>Artifact Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Artifact Type</em>'.
	 * @see org.hl7.knowledgeartifact.r2.ArtifactSummary#getArtifactType()
	 * @see #getArtifactSummary()
	 * @generated
	 */
	EReference getArtifactSummary_ArtifactType();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.knowledgeartifact.r2.ArtifactSummary#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Size</em>'.
	 * @see org.hl7.knowledgeartifact.r2.ArtifactSummary#getSize()
	 * @see #getArtifactSummary()
	 * @generated
	 */
	EReference getArtifactSummary_Size();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.knowledgeartifact.r2.ArtifactSummary#getHash <em>Hash</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Hash</em>'.
	 * @see org.hl7.knowledgeartifact.r2.ArtifactSummary#getHash()
	 * @see #getArtifactSummary()
	 * @generated
	 */
	EReference getArtifactSummary_Hash();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.knowledgeartifact.r2.ArtifactSummary#getSignatures <em>Signatures</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Signatures</em>'.
	 * @see org.hl7.knowledgeartifact.r2.ArtifactSummary#getSignatures()
	 * @see #getArtifactSummary()
	 * @generated
	 */
	EReference getArtifactSummary_Signatures();

	/**
	 * Returns the meta object for class '{@link org.hl7.knowledgeartifact.r2.ArtifactTypeType <em>Artifact Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Artifact Type Type</em>'.
	 * @see org.hl7.knowledgeartifact.r2.ArtifactTypeType
	 * @generated
	 */
	EClass getArtifactTypeType();

	/**
	 * Returns the meta object for the attribute '{@link org.hl7.knowledgeartifact.r2.ArtifactTypeType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.hl7.knowledgeartifact.r2.ArtifactTypeType#getValue()
	 * @see #getArtifactTypeType()
	 * @generated
	 */
	EAttribute getArtifactTypeType_Value();

	/**
	 * Returns the meta object for class '{@link org.hl7.knowledgeartifact.r2.ArtifactTypeType1 <em>Artifact Type Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Artifact Type Type1</em>'.
	 * @see org.hl7.knowledgeartifact.r2.ArtifactTypeType1
	 * @generated
	 */
	EClass getArtifactTypeType1();

	/**
	 * Returns the meta object for the attribute '{@link org.hl7.knowledgeartifact.r2.ArtifactTypeType1#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.hl7.knowledgeartifact.r2.ArtifactTypeType1#getValue()
	 * @see #getArtifactTypeType1()
	 * @generated
	 */
	EAttribute getArtifactTypeType1_Value();

	/**
	 * Returns the meta object for class '{@link org.hl7.knowledgeartifact.r2.AtomicAction <em>Atomic Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Atomic Action</em>'.
	 * @see org.hl7.knowledgeartifact.r2.AtomicAction
	 * @generated
	 */
	EClass getAtomicAction();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.knowledgeartifact.r2.AtomicAction#getTextEquivalent <em>Text Equivalent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Text Equivalent</em>'.
	 * @see org.hl7.knowledgeartifact.r2.AtomicAction#getTextEquivalent()
	 * @see #getAtomicAction()
	 * @generated
	 */
	EReference getAtomicAction_TextEquivalent();

	/**
	 * Returns the meta object for class '{@link org.hl7.knowledgeartifact.r2.Behavior <em>Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Behavior</em>'.
	 * @see org.hl7.knowledgeartifact.r2.Behavior
	 * @generated
	 */
	EClass getBehavior();

	/**
	 * Returns the meta object for the attribute '{@link org.hl7.knowledgeartifact.r2.Behavior#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.hl7.knowledgeartifact.r2.Behavior#getValue()
	 * @see #getBehavior()
	 * @generated
	 */
	EAttribute getBehavior_Value();

	/**
	 * Returns the meta object for class '{@link org.hl7.knowledgeartifact.r2.Behaviors <em>Behaviors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Behaviors</em>'.
	 * @see org.hl7.knowledgeartifact.r2.Behaviors
	 * @generated
	 */
	EClass getBehaviors();

	/**
	 * Returns the meta object for the containment reference list '{@link org.hl7.knowledgeartifact.r2.Behaviors#getBehavior <em>Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Behavior</em>'.
	 * @see org.hl7.knowledgeartifact.r2.Behaviors#getBehavior()
	 * @see #getBehaviors()
	 * @generated
	 */
	EReference getBehaviors_Behavior();

	/**
	 * Returns the meta object for class '{@link org.hl7.knowledgeartifact.r2.BindingModelType <em>Binding Model Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binding Model Type</em>'.
	 * @see org.hl7.knowledgeartifact.r2.BindingModelType
	 * @generated
	 */
	EClass getBindingModelType();

	/**
	 * Returns the meta object for the attribute '{@link org.hl7.knowledgeartifact.r2.BindingModelType#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Model</em>'.
	 * @see org.hl7.knowledgeartifact.r2.BindingModelType#getModel()
	 * @see #getBindingModelType()
	 * @generated
	 */
	EAttribute getBindingModelType_Model();

	/**
	 * Returns the meta object for class '{@link org.hl7.knowledgeartifact.r2.BindingModelType1 <em>Binding Model Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binding Model Type1</em>'.
	 * @see org.hl7.knowledgeartifact.r2.BindingModelType1
	 * @generated
	 */
	EClass getBindingModelType1();

	/**
	 * Returns the meta object for the attribute '{@link org.hl7.knowledgeartifact.r2.BindingModelType1#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Model</em>'.
	 * @see org.hl7.knowledgeartifact.r2.BindingModelType1#getModel()
	 * @see #getBindingModelType1()
	 * @generated
	 */
	EAttribute getBindingModelType1_Model();

	/**
	 * Returns the meta object for class '{@link org.hl7.knowledgeartifact.r2.BindingNameType <em>Binding Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binding Name Type</em>'.
	 * @see org.hl7.knowledgeartifact.r2.BindingNameType
	 * @generated
	 */
	EClass getBindingNameType();

	/**
	 * Returns the meta object for the attribute '{@link org.hl7.knowledgeartifact.r2.BindingNameType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.hl7.knowledgeartifact.r2.BindingNameType#getValue()
	 * @see #getBindingNameType()
	 * @generated
	 */
	EAttribute getBindingNameType_Value();

	/**
	 * Returns the meta object for class '{@link org.hl7.knowledgeartifact.r2.BindingType <em>Binding Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binding Type</em>'.
	 * @see org.hl7.knowledgeartifact.r2.BindingType
	 * @generated
	 */
	EClass getBindingType();

	/**
	 * Returns the meta object for the attribute '{@link org.hl7.knowledgeartifact.r2.BindingType#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Model</em>'.
	 * @see org.hl7.knowledgeartifact.r2.BindingType#getModel()
	 * @see #getBindingType()
	 * @generated
	 */
	EAttribute getBindingType_Model();

	/**
	 * Returns the meta object for class '{@link org.hl7.knowledgeartifact.r2.BindingTypeType <em>Binding Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binding Type Type</em>'.
	 * @see org.hl7.knowledgeartifact.r2.BindingTypeType
	 * @generated
	 */
	EClass getBindingTypeType();

	/**
	 * Returns the meta object for the attribute '{@link org.hl7.knowledgeartifact.r2.BindingTypeType#getBinding <em>Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Binding</em>'.
	 * @see org.hl7.knowledgeartifact.r2.BindingTypeType#getBinding()
	 * @see #getBindingTypeType()
	 * @generated
	 */
	EAttribute getBindingTypeType_Binding();

	/**
	 * Returns the meta object for class '{@link org.hl7.knowledgeartifact.r2.CardinalityBehavior <em>Cardinality Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cardinality Behavior</em>'.
	 * @see org.hl7.knowledgeartifact.r2.CardinalityBehavior
	 * @generated
	 */
	EClass getCardinalityBehavior();

	/**
	 * Returns the meta object for class '{@link org.hl7.knowledgeartifact.r2.CategoriesType <em>Categories Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Categories Type</em>'.
	 * @see org.hl7.knowledgeartifact.r2.CategoriesType
	 * @generated
	 */
	EClass getCategoriesType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.hl7.knowledgeartifact.r2.CategoriesType#getCategory <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Category</em>'.
	 * @see org.hl7.knowledgeartifact.r2.CategoriesType#getCategory()
	 * @see #getCategoriesType()
	 * @generated
	 */
	EReference getCategoriesType_Category();

	/**
	 * Returns the meta object for class '{@link org.hl7.knowledgeartifact.r2.CodesType <em>Codes Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Codes Type</em>'.
	 * @see org.hl7.knowledgeartifact.r2.CodesType
	 * @generated
	 */
	EClass getCodesType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.hl7.knowledgeartifact.r2.CodesType#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Code</em>'.
	 * @see org.hl7.knowledgeartifact.r2.CodesType#getCode()
	 * @see #getCodesType()
	 * @generated
	 */
	EReference getCodesType_Code();

	/**
	 * Returns the meta object for class '{@link org.hl7.knowledgeartifact.r2.Coding <em>Coding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Coding</em>'.
	 * @see org.hl7.knowledgeartifact.r2.Coding
	 * @generated
	 */
	EClass getCoding();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.knowledgeartifact.r2.Coding#getSystem <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>System</em>'.
	 * @see org.hl7.knowledgeartifact.r2.Coding#getSystem()
	 * @see #getCoding()
	 * @generated
	 */
	EReference getCoding_System();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.knowledgeartifact.r2.Coding#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Version</em>'.
	 * @see org.hl7.knowledgeartifact.r2.Coding#getVersion()
	 * @see #getCoding()
	 * @generated
	 */
	EReference getCoding_Version();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.knowledgeartifact.r2.Coding#getDisplay <em>Display</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Display</em>'.
	 * @see org.hl7.knowledgeartifact.r2.Coding#getDisplay()
	 * @see #getCoding()
	 * @generated
	 */
	EReference getCoding_Display();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.knowledgeartifact.r2.Coding#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Code</em>'.
	 * @see org.hl7.knowledgeartifact.r2.Coding#getCode()
	 * @see #getCoding()
	 * @generated
	 */
	EReference getCoding_Code();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.knowledgeartifact.r2.Coding#getUserSeclected <em>User Seclected</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>User Seclected</em>'.
	 * @see org.hl7.knowledgeartifact.r2.Coding#getUserSeclected()
	 * @see #getCoding()
	 * @generated
	 */
	EReference getCoding_UserSeclected();

	/**
	 * Returns the meta object for class '{@link org.hl7.knowledgeartifact.r2.CollectInformationAction <em>Collect Information Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Collect Information Action</em>'.
	 * @see org.hl7.knowledgeartifact.r2.CollectInformationAction
	 * @generated
	 */
	EClass getCollectInformationAction();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.knowledgeartifact.r2.CollectInformationAction#getDocumentationConcept <em>Documentation Concept</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Documentation Concept</em>'.
	 * @see org.hl7.knowledgeartifact.r2.CollectInformationAction#getDocumentationConcept()
	 * @see #getCollectInformationAction()
	 * @generated
	 */
	EReference getCollectInformationAction_DocumentationConcept();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.knowledgeartifact.r2.CollectInformationAction#getInitialValue <em>Initial Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Initial Value</em>'.
	 * @see org.hl7.knowledgeartifact.r2.CollectInformationAction#getInitialValue()
	 * @see #getCollectInformationAction()
	 * @generated
	 */
	EReference getCollectInformationAction_InitialValue();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.knowledgeartifact.r2.CollectInformationAction#getResponseBinding <em>Response Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Response Binding</em>'.
	 * @see org.hl7.knowledgeartifact.r2.CollectInformationAction#getResponseBinding()
	 * @see #getCollectInformationAction()
	 * @generated
	 */
	EReference getCollectInformationAction_ResponseBinding();

	/**
	 * Returns the meta object for class '{@link org.hl7.knowledgeartifact.r2.Completion <em>Completion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Completion</em>'.
	 * @see org.hl7.knowledgeartifact.r2.Completion
	 * @generated
	 */
	EClass getCompletion();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.knowledgeartifact.r2.Completion#getEventDefinition <em>Event Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Event Definition</em>'.
	 * @see org.hl7.knowledgeartifact.r2.Completion#getEventDefinition()
	 * @see #getCompletion()
	 * @generated
	 */
	EReference getCompletion_EventDefinition();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.knowledgeartifact.r2.Completion#getActionGroup <em>Action Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Action Group</em>'.
	 * @see org.hl7.knowledgeartifact.r2.Completion#getActionGroup()
	 * @see #getCompletion()
	 * @generated
	 */
	EReference getCompletion_ActionGroup();

	/**
	 * Returns the meta object for class '{@link org.hl7.knowledgeartifact.r2.ComponentEventBinding <em>Component Event Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Event Binding</em>'.
	 * @see org.hl7.knowledgeartifact.r2.ComponentEventBinding
	 * @generated
	 */
	EClass getComponentEventBinding();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.knowledgeartifact.r2.ComponentEventBinding#getBindingModel <em>Binding Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Binding Model</em>'.
	 * @see org.hl7.knowledgeartifact.r2.ComponentEventBinding#getBindingModel()
	 * @see #getComponentEventBinding()
	 * @generated
	 */
	EReference getComponentEventBinding_BindingModel();

	/**
	 * Returns the meta object for the attribute '{@link org.hl7.knowledgeartifact.r2.ComponentEventBinding#getComponentId <em>Component Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Component Id</em>'.
	 * @see org.hl7.knowledgeartifact.r2.ComponentEventBinding#getComponentId()
	 * @see #getComponentEventBinding()
	 * @generated
	 */
	EAttribute getComponentEventBinding_ComponentId();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.knowledgeartifact.r2.ComponentEventBinding#getIncomingBindings <em>Incoming Bindings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Incoming Bindings</em>'.
	 * @see org.hl7.knowledgeartifact.r2.ComponentEventBinding#getIncomingBindings()
	 * @see #getComponentEventBinding()
	 * @generated
	 */
	EReference getComponentEventBinding_IncomingBindings();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.knowledgeartifact.r2.ComponentEventBinding#getOutgoingBindings <em>Outgoing Bindings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Outgoing Bindings</em>'.
	 * @see org.hl7.knowledgeartifact.r2.ComponentEventBinding#getOutgoingBindings()
	 * @see #getComponentEventBinding()
	 * @generated
	 */
	EReference getComponentEventBinding_OutgoingBindings();

	/**
	 * Returns the meta object for the containment reference list '{@link org.hl7.knowledgeartifact.r2.ComponentEventBinding#getTriggers <em>Triggers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Triggers</em>'.
	 * @see org.hl7.knowledgeartifact.r2.ComponentEventBinding#getTriggers()
	 * @see #getComponentEventBinding()
	 * @generated
	 */
	EReference getComponentEventBinding_Triggers();

	/**
	 * Returns the meta object for class '{@link org.hl7.knowledgeartifact.r2.ComponentEventMappings <em>Component Event Mappings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Event Mappings</em>'.
	 * @see org.hl7.knowledgeartifact.r2.ComponentEventMappings
	 * @generated
	 */
	EClass getComponentEventMappings();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.knowledgeartifact.r2.ComponentEventMappings#getComponentId <em>Component Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Component Id</em>'.
	 * @see org.hl7.knowledgeartifact.r2.ComponentEventMappings#getComponentId()
	 * @see #getComponentEventMappings()
	 * @generated
	 */
	EReference getComponentEventMappings_ComponentId();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.knowledgeartifact.r2.ComponentEventMappings#getBinding <em>Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Binding</em>'.
	 * @see org.hl7.knowledgeartifact.r2.ComponentEventMappings#getBinding()
	 * @see #getComponentEventMappings()
	 * @generated
	 */
	EReference getComponentEventMappings_Binding();

	/**
	 * Returns the meta object for class '{@link org.hl7.knowledgeartifact.r2.Composite <em>Composite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composite</em>'.
	 * @see org.hl7.knowledgeartifact.r2.Composite
	 * @generated
	 */
	EClass getComposite();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.knowledgeartifact.r2.Composite#getMetadata <em>Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Metadata</em>'.
	 * @see org.hl7.knowledgeartifact.r2.Composite#getMetadata()
	 * @see #getComposite()
	 * @generated
	 */
	EReference getComposite_Metadata();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.knowledgeartifact.r2.Composite#getControlBlock <em>Control Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Control Block</em>'.
	 * @see org.hl7.knowledgeartifact.r2.Composite#getControlBlock()
	 * @see #getComposite()
	 * @generated
	 */
	EReference getComposite_ControlBlock();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.knowledgeartifact.r2.Composite#getManifest <em>Manifest</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Manifest</em>'.
	 * @see org.hl7.knowledgeartifact.r2.Composite#getManifest()
	 * @see #getComposite()
	 * @generated
	 */
	EReference getComposite_Manifest();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.knowledgeartifact.r2.Composite#getContainedArtifacts <em>Contained Artifacts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Contained Artifacts</em>'.
	 * @see org.hl7.knowledgeartifact.r2.Composite#getContainedArtifacts()
	 * @see #getComposite()
	 * @generated
	 */
	EReference getComposite_ContainedArtifacts();

	/**
	 * Returns the meta object for class '{@link org.hl7.knowledgeartifact.r2.Condition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Condition</em>'.
	 * @see org.hl7.knowledgeartifact.r2.Condition
	 * @generated
	 */
	EClass getCondition();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.knowledgeartifact.r2.Condition#getLogic <em>Logic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Logic</em>'.
	 * @see org.hl7.knowledgeartifact.r2.Condition#getLogic()
	 * @see #getCondition()
	 * @generated
	 */
	EReference getCondition_Logic();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.knowledgeartifact.r2.Condition#getConditionRole <em>Condition Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition Role</em>'.
	 * @see org.hl7.knowledgeartifact.r2.Condition#getConditionRole()
	 * @see #getCondition()
	 * @generated
	 */
	EReference getCondition_ConditionRole();

	/**
	 * Returns the meta object for class '{@link org.hl7.knowledgeartifact.r2.ConditionRoleType1 <em>Condition Role Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Condition Role Type1</em>'.
	 * @see org.hl7.knowledgeartifact.r2.ConditionRoleType1
	 * @generated
	 */
	EClass getConditionRoleType1();

	/**
	 * Returns the meta object for the attribute '{@link org.hl7.knowledgeartifact.r2.ConditionRoleType1#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.hl7.knowledgeartifact.r2.ConditionRoleType1#getValue()
	 * @see #getConditionRoleType1()
	 * @generated
	 */
	EAttribute getConditionRoleType1_Value();

	/**
	 * Returns the meta object for class '{@link org.hl7.knowledgeartifact.r2.Conditions <em>Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conditions</em>'.
	 * @see org.hl7.knowledgeartifact.r2.Conditions
	 * @generated
	 */
	EClass getConditions();

	/**
	 * Returns the meta object for the containment reference list '{@link org.hl7.knowledgeartifact.r2.Conditions#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Condition</em>'.
	 * @see org.hl7.knowledgeartifact.r2.Conditions#getCondition()
	 * @see #getConditions()
	 * @generated
	 */
	EReference getConditions_Condition();

	/**
	 * Returns the meta object for class '{@link org.hl7.knowledgeartifact.r2.ConstraintTypeType <em>Constraint Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constraint Type Type</em>'.
	 * @see org.hl7.knowledgeartifact.r2.ConstraintTypeType
	 * @generated
	 */
	EClass getConstraintTypeType();

	/**
	 * Returns the meta object for the attribute '{@link org.hl7.knowledgeartifact.r2.ConstraintTypeType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.hl7.knowledgeartifact.r2.ConstraintTypeType#getValue()
	 * @see #getConstraintTypeType()
	 * @generated
	 */
	EAttribute getConstraintTypeType_Value();

	/**
	 * Returns the meta object for class '{@link org.hl7.knowledgeartifact.r2.ContactsType <em>Contacts Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contacts Type</em>'.
	 * @see org.hl7.knowledgeartifact.r2.ContactsType
	 * @generated
	 */
	EClass getContactsType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.hl7.knowledgeartifact.r2.ContactsType#getContact <em>Contact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contact</em>'.
	 * @see org.hl7.knowledgeartifact.r2.ContactsType#getContact()
	 * @see #getContactsType()
	 * @generated
	 */
	EReference getContactsType_Contact();

	/**
	 * Returns the meta object for class '{@link org.hl7.knowledgeartifact.r2.ContainedArtifact <em>Contained Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contained Artifact</em>'.
	 * @see org.hl7.knowledgeartifact.r2.ContainedArtifact
	 * @generated
	 */
	EClass getContainedArtifact();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.knowledgeartifact.r2.ContainedArtifact#getArtifactType <em>Artifact Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Artifact Type</em>'.
	 * @see org.hl7.knowledgeartifact.r2.ContainedArtifact#getArtifactType()
	 * @see #getContainedArtifact()
	 * @generated
	 */
	EReference getContainedArtifact_ArtifactType();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.knowledgeartifact.r2.ContainedArtifact#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Name</em>'.
	 * @see org.hl7.knowledgeartifact.r2.ContainedArtifact#getName()
	 * @see #getContainedArtifact()
	 * @generated
	 */
	EReference getContainedArtifact_Name();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.knowledgeartifact.r2.ContainedArtifact#getBindingName <em>Binding Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Binding Name</em>'.
	 * @see org.hl7.knowledgeartifact.r2.ContainedArtifact#getBindingName()
	 * @see #getContainedArtifact()
	 * @generated
	 */
	EReference getContainedArtifact_BindingName();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.knowledgeartifact.r2.ContainedArtifact#getInclusionCriteria <em>Inclusion Criteria</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Inclusion Criteria</em>'.
	 * @see org.hl7.knowledgeartifact.r2.ContainedArtifact#getInclusionCriteria()
	 * @see #getContainedArtifact()
	 * @generated
	 */
	EReference getContainedArtifact_InclusionCriteria();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.knowledgeartifact.r2.ContainedArtifact#getContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Context</em>'.
	 * @see org.hl7.knowledgeartifact.r2.ContainedArtifact#getContext()
	 * @see #getContainedArtifact()
	 * @generated
	 */
	EReference getContainedArtifact_Context();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.knowledgeartifact.r2.ContainedArtifact#getEventBinding <em>Event Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Event Binding</em>'.
	 * @see org.hl7.knowledgeartifact.r2.ContainedArtifact#getEventBinding()
	 * @see #getContainedArtifact()
	 * @generated
	 */
	EReference getContainedArtifact_EventBinding();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.knowledgeartifact.r2.ContainedArtifact#getMetadataBinding <em>Metadata Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Metadata Binding</em>'.
	 * @see org.hl7.knowledgeartifact.r2.ContainedArtifact#getMetadataBinding()
	 * @see #getContainedArtifact()
	 * @generated
	 */
	EReference getContainedArtifact_MetadataBinding();

	/**
	 * Returns the meta object for the attribute list '{@link org.hl7.knowledgeartifact.r2.ContainedArtifact#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.hl7.knowledgeartifact.r2.ContainedArtifact#getGroup()
	 * @see #getContainedArtifact()
	 * @generated
	 */
	EAttribute getContainedArtifact_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.hl7.knowledgeartifact.r2.ContainedArtifact#getWrappedContent <em>Wrapped Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Wrapped Content</em>'.
	 * @see org.hl7.knowledgeartifact.r2.ContainedArtifact#getWrappedContent()
	 * @see #getContainedArtifact()
	 * @generated
	 */
	EReference getContainedArtifact_WrappedContent();

	/**
	 * Returns the meta object for the containment reference list '{@link org.hl7.knowledgeartifact.r2.ContainedArtifact#getReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Reference</em>'.
	 * @see org.hl7.knowledgeartifact.r2.ContainedArtifact#getReference()
	 * @see #getContainedArtifact()
	 * @generated
	 */
	EReference getContainedArtifact_Reference();

	/**
	 * Returns the meta object for the containment reference list '{@link org.hl7.knowledgeartifact.r2.ContainedArtifact#getKnowledgeDocument <em>Knowledge Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Knowledge Document</em>'.
	 * @see org.hl7.knowledgeartifact.r2.ContainedArtifact#getKnowledgeDocument()
	 * @see #getContainedArtifact()
	 * @generated
	 */
	EReference getContainedArtifact_KnowledgeDocument();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.knowledgeartifact.r2.ContainedArtifact#getMustUnderstand <em>Must Understand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Must Understand</em>'.
	 * @see org.hl7.knowledgeartifact.r2.ContainedArtifact#getMustUnderstand()
	 * @see #getContainedArtifact()
	 * @generated
	 */
	EReference getContainedArtifact_MustUnderstand();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.knowledgeartifact.r2.ContainedArtifact#getOnCompletion <em>On Completion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>On Completion</em>'.
	 * @see org.hl7.knowledgeartifact.r2.ContainedArtifact#getOnCompletion()
	 * @see #getContainedArtifact()
	 * @generated
	 */
	EReference getContainedArtifact_OnCompletion();

	/**
	 * Returns the meta object for class '{@link org.hl7.knowledgeartifact.r2.ContainedArtifactList <em>Contained Artifact List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contained Artifact List</em>'.
	 * @see org.hl7.knowledgeartifact.r2.ContainedArtifactList
	 * @generated
	 */
	EClass getContainedArtifactList();

	/**
	 * Returns the meta object for the containment reference list '{@link org.hl7.knowledgeartifact.r2.ContainedArtifactList#getArtifact <em>Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Artifact</em>'.
	 * @see org.hl7.knowledgeartifact.r2.ContainedArtifactList#getArtifact()
	 * @see #getContainedArtifactList()
	 * @generated
	 */
	EReference getContainedArtifactList_Artifact();

	/**
	 * Returns the meta object for class '{@link org.hl7.knowledgeartifact.r2.ContentHashType <em>Content Hash Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Content Hash Type</em>'.
	 * @see org.hl7.knowledgeartifact.r2.ContentHashType
	 * @generated
	 */
	EClass getContentHashType();

	/**
	 * Returns the meta object for the attribute '{@link org.hl7.knowledgeartifact.r2.ContentHashType#getHashvalue <em>Hashvalue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hashvalue</em>'.
	 * @see org.hl7.knowledgeartifact.r2.ContentHashType#getHashvalue()
	 * @see #getContentHashType()
	 * @generated
	 */
	EAttribute getContentHashType_Hashvalue();

	/**
	 * Returns the meta object for class '{@link org.hl7.knowledgeartifact.r2.ContentSignifier <em>Content Signifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Content Signifier</em>'.
	 * @see org.hl7.knowledgeartifact.r2.ContentSignifier
	 * @generated
	 */
	EClass getContentSignifier();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.knowledgeartifact.r2.ContentSignifier#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see org.hl7.knowledgeartifact.r2.ContentSignifier#getType()
	 * @see #getContentSignifier()
	 * @generated
	 */
	EReference getContentSignifier_Type();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.knowledgeartifact.r2.ContentSignifier#getForm <em>Form</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Form</em>'.
	 * @see org.hl7.knowledgeartifact.r2.ContentSignifier#getForm()
	 * @see #getContentSignifier()
	 * @generated
	 */
	EReference getContentSignifier_Form();

	/**
	 * Returns the meta object for class '{@link org.hl7.knowledgeartifact.r2.ContentType <em>Content Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Content Type</em>'.
	 * @see org.hl7.knowledgeartifact.r2.ContentType
	 * @generated
	 */
	EClass getContentType();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.knowledgeartifact.r2.ContentType#getDiv <em>Div</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Div</em>'.
	 * @see org.hl7.knowledgeartifact.r2.ContentType#getDiv()
	 * @see #getContentType()
	 * @generated
	 */
	EReference getContentType_Div();

	/**
	 * Returns the meta object for class '{@link org.hl7.knowledgeartifact.r2.Context <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Context</em>'.
	 * @see org.hl7.knowledgeartifact.r2.Context
	 * @generated
	 */
	EClass getContext();

	/**
	 * Returns the meta object for class '{@link org.hl7.knowledgeartifact.r2.Contribution <em>Contribution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contribution</em>'.
	 * @see org.hl7.knowledgeartifact.r2.Contribution
	 * @generated
	 */
	EClass getContribution();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.knowledgeartifact.r2.Contribution#getContributor <em>Contributor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Contributor</em>'.
	 * @see org.hl7.knowledgeartifact.r2.Contribution#getContributor()
	 * @see #getContribution()
	 * @generated
	 */
	EReference getContribution_Contributor();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.knowledgeartifact.r2.Contribution#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Role</em>'.
	 * @see org.hl7.knowledgeartifact.r2.Contribution#getRole()
	 * @see #getContribution()
	 * @generated
	 */
	EReference getContribution_Role();

	/**
	 * Returns the meta object for class '{@link org.hl7.knowledgeartifact.r2.ContributionsType <em>Contributions Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contributions Type</em>'.
	 * @see org.hl7.knowledgeartifact.r2.ContributionsType
	 * @generated
	 */
	EClass getContributionsType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.hl7.knowledgeartifact.r2.ContributionsType#getContribution <em>Contribution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contribution</em>'.
	 * @see org.hl7.knowledgeartifact.r2.ContributionsType#getContribution()
	 * @see #getContributionsType()
	 * @generated
	 */
	EReference getContributionsType_Contribution();

	/**
	 * Returns the meta object for class '{@link org.hl7.knowledgeartifact.r2.ControlBlock <em>Control Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Control Block</em>'.
	 * @see org.hl7.knowledgeartifact.r2.ControlBlock
	 * @generated
	 */
	EClass getControlBlock();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.knowledgeartifact.r2.ControlBlock#getContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Context</em>'.
	 * @see org.hl7.knowledgeartifact.r2.ControlBlock#getContext()
	 * @see #getControlBlock()
	 * @generated
	 */
	EReference getControlBlock_Context();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.knowledgeartifact.r2.ControlBlock#getEventActivation <em>Event Activation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Event Activation</em>'.
	 * @see org.hl7.knowledgeartifact.r2.ControlBlock#getEventActivation()
	 * @see #getControlBlock()
	 * @generated
	 */
	EReference getControlBlock_EventActivation();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.knowledgeartifact.r2.ControlBlock#getPropagation <em>Propagation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Propagation</em>'.
	 * @see org.hl7.knowledgeartifact.r2.ControlBlock#getPropagation()
	 * @see #getControlBlock()
	 * @generated
	 */
	EReference getControlBlock_Propagation();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.knowledgeartifact.r2.ControlBlock#getMapping <em>Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Mapping</em>'.
	 * @see org.hl7.knowledgeartifact.r2.ControlBlock#getMapping()
	 * @see #getControlBlock()
	 * @generated
	 */
	EReference getControlBlock_Mapping();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.knowledgeartifact.r2.ControlBlock#getControllingArtifact <em>Controlling Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Controlling Artifact</em>'.
	 * @see org.hl7.knowledgeartifact.r2.ControlBlock#getControllingArtifact()
	 * @see #getControlBlock()
	 * @generated
	 */
	EReference getControlBlock_ControllingArtifact();

	/**
	 * Returns the meta object for the containment reference list '{@link org.hl7.knowledgeartifact.r2.ControlBlock#getInitialArtifact <em>Initial Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Initial Artifact</em>'.
	 * @see org.hl7.knowledgeartifact.r2.ControlBlock#getInitialArtifact()
	 * @see #getControlBlock()
	 * @generated
	 */
	EReference getControlBlock_InitialArtifact();

	/**
	 * Returns the meta object for class '{@link org.hl7.knowledgeartifact.r2.ControllingArtifactType <em>Controlling Artifact Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Controlling Artifact Type</em>'.
	 * @see org.hl7.knowledgeartifact.r2.ControllingArtifactType
	 * @generated
	 */
	EClass getControllingArtifactType();

	/**
	 * Returns the meta object for the attribute '{@link org.hl7.knowledgeartifact.r2.ControllingArtifactType#getBindingName <em>Binding Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Binding Name</em>'.
	 * @see org.hl7.knowledgeartifact.r2.ControllingArtifactType#getBindingName()
	 * @see #getControllingArtifactType()
	 * @generated
	 */
	EAttribute getControllingArtifactType_BindingName();

	/**
	 * Returns the meta object for class '{@link org.hl7.knowledgeartifact.r2.Coverage <em>Coverage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Coverage</em>'.
	 * @see org.hl7.knowledgeartifact.r2.Coverage
	 * @generated
	 */
	EClass getCoverage();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.knowledgeartifact.r2.Coverage#getFocus <em>Focus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Focus</em>'.
	 * @see org.hl7.knowledgeartifact.r2.Coverage#getFocus()
	 * @see #getCoverage()
	 * @generated
	 */
	EReference getCoverage_Focus();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.knowledgeartifact.r2.Coverage#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see org.hl7.knowledgeartifact.r2.Coverage#getDescription()
	 * @see #getCoverage()
	 * @generated
	 */
	EReference getCoverage_Description();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.knowledgeartifact.r2.Coverage#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see org.hl7.knowledgeartifact.r2.Coverage#getValue()
	 * @see #getCoverage()
	 * @generated
	 */
	EReference getCoverage_Value();

	/**
	 * Returns the meta object for class '{@link org.hl7.knowledgeartifact.r2.CreateAction <em>Create Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Create Action</em>'.
	 * @see org.hl7.knowledgeartifact.r2.CreateAction
	 * @generated
	 */
	EClass getCreateAction();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.knowledgeartifact.r2.CreateAction#getActionSentence <em>Action Sentence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Action Sentence</em>'.
	 * @see org.hl7.knowledgeartifact.r2.CreateAction#getActionSentence()
	 * @see #getCreateAction()
	 * @generated
	 */
	EReference getCreateAction_ActionSentence();

	/**
	 * Returns the meta object for class '{@link org.hl7.knowledgeartifact.r2.DataEventTrigger <em>Data Event Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Event Trigger</em>'.
	 * @see org.hl7.knowledgeartifact.r2.DataEventTrigger
	 * @generated
	 */
	EClass getDataEventTrigger();

	/**
	 * Returns the meta object for the attribute '{@link org.hl7.knowledgeartifact.r2.DataEventTrigger#getTriggerType <em>Trigger Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Trigger Type</em>'.
	 * @see org.hl7.knowledgeartifact.r2.DataEventTrigger#getTriggerType()
	 * @see #getDataEventTrigger()
	 * @generated
	 */
	EAttribute getDataEventTrigger_TriggerType();

	/**
	 * Returns the meta object for class '{@link org.hl7.knowledgeartifact.r2.DataModelsType <em>Data Models Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Models Type</em>'.
	 * @see org.hl7.knowledgeartifact.r2.DataModelsType
	 * @generated
	 */
	EClass getDataModelsType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.hl7.knowledgeartifact.r2.DataModelsType#getModelReference <em>Model Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Model Reference</em>'.
	 * @see org.hl7.knowledgeartifact.r2.DataModelsType#getModelReference()
	 * @see #getDataModelsType()
	 * @generated
	 */
	EReference getDataModelsType_ModelReference();

	/**
	 * Returns the meta object for class '{@link org.hl7.knowledgeartifact.r2.DeclareResponseAction <em>Declare Response Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Declare Response Action</em>'.
	 * @see org.hl7.knowledgeartifact.r2.DeclareResponseAction
	 * @generated
	 */
	EClass getDeclareResponseAction();

	/**
	 * Returns the meta object for the attribute '{@link org.hl7.knowledgeartifact.r2.DeclareResponseAction#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.hl7.knowledgeartifact.r2.DeclareResponseAction#getName()
	 * @see #getDeclareResponseAction()
	 * @generated
	 */
	EAttribute getDeclareResponseAction_Name();

	/**
	 * Returns the meta object for class '{@link org.hl7.knowledgeartifact.r2.DocumentationItem <em>Documentation Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Documentation Item</em>'.
	 * @see org.hl7.knowledgeartifact.r2.DocumentationItem
	 * @generated
	 */
	EClass getDocumentationItem();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.knowledgeartifact.r2.DocumentationItem#getPrompt <em>Prompt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Prompt</em>'.
	 * @see org.hl7.knowledgeartifact.r2.DocumentationItem#getPrompt()
	 * @see #getDocumentationItem()
	 * @generated
	 */
	EReference getDocumentationItem_Prompt();

	/**
	 * Returns the meta object for the containment reference list '{@link org.hl7.knowledgeartifact.r2.DocumentationItem#getAdditionalInstructions <em>Additional Instructions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Additional Instructions</em>'.
	 * @see org.hl7.knowledgeartifact.r2.DocumentationItem#getAdditionalInstructions()
	 * @see #getDocumentationItem()
	 * @generated
	 */
	EReference getDocumentationItem_AdditionalInstructions();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.knowledgeartifact.r2.DocumentationItem#getTextAfterResponse <em>Text After Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Text After Response</em>'.
	 * @see org.hl7.knowledgeartifact.r2.DocumentationItem#getTextAfterResponse()
	 * @see #getDocumentationItem()
	 * @generated
	 */
	EReference getDocumentationItem_TextAfterResponse();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.knowledgeartifact.r2.DocumentationItem#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see org.hl7.knowledgeartifact.r2.DocumentationItem#getDescription()
	 * @see #getDocumentationItem()
	 * @generated
	 */
	EReference getDocumentationItem_Description();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.knowledgeartifact.r2.DocumentationItem#getItemCodes <em>Item Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Item Codes</em>'.
	 * @see org.hl7.knowledgeartifact.r2.DocumentationItem#getItemCodes()
	 * @see #getDocumentationItem()
	 * @generated
	 */
	EReference getDocumentationItem_ItemCodes();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.knowledgeartifact.r2.DocumentationItem#getResponseDataType <em>Response Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Response Data Type</em>'.
	 * @see org.hl7.knowledgeartifact.r2.DocumentationItem#getResponseDataType()
	 * @see #getDocumentationItem()
	 * @generated
	 */
	EReference getDocumentationItem_ResponseDataType();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.knowledgeartifact.r2.DocumentationItem#getResponseCardinality <em>Response Cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Response Cardinality</em>'.
	 * @see org.hl7.knowledgeartifact.r2.DocumentationItem#getResponseCardinality()
	 * @see #getDocumentationItem()
	 * @generated
	 */
	EReference getDocumentationItem_ResponseCardinality();

	/**
	 * Returns the meta object for the containment reference list '{@link org.hl7.knowledgeartifact.r2.DocumentationItem#getResponseRange <em>Response Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Response Range</em>'.
	 * @see org.hl7.knowledgeartifact.r2.DocumentationItem#getResponseRange()
	 * @see #getDocumentationItem()
	 * @generated
	 */
	EReference getDocumentationItem_ResponseRange();

	/**
	 * Returns the meta object for class '{@link org.hl7.knowledgeartifact.r2.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see org.hl7.knowledgeartifact.r2.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link org.hl7.knowledgeartifact.r2.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.hl7.knowledgeartifact.r2.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link org.hl7.knowledgeartifact.r2.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see org.hl7.knowledgeartifact.r2.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link org.hl7.knowledgeartifact.r2.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see org.hl7.knowledgeartifact.r2.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.knowledgeartifact.r2.DocumentRoot#getCompositeKnowledgeDocument <em>Composite Knowledge Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Composite Knowledge Document</em>'.
	 * @see org.hl7.knowledgeartifact.r2.DocumentRoot#getCompositeKnowledgeDocument()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_CompositeKnowledgeDocument();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.knowledgeartifact.r2.DocumentRoot#getKnowledgeDocument <em>Knowledge Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Knowledge Document</em>'.
	 * @see org.hl7.knowledgeartifact.r2.DocumentRoot#getKnowledgeDocument()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_KnowledgeDocument();

	/**
	 * Returns the meta object for class '{@link org.hl7.knowledgeartifact.r2.EnumerationConstraint <em>Enumeration Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enumeration Constraint</em>'.
	 * @see org.hl7.knowledgeartifact.r2.EnumerationConstraint
	 * @generated
	 */
	EClass getEnumerationConstraint();

	/**
	 * Returns the meta object for the containment reference list '{@link org.hl7.knowledgeartifact.r2.EnumerationConstraint#getItem <em>Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Item</em>'.
	 * @see org.hl7.knowledgeartifact.r2.EnumerationConstraint#getItem()
	 * @see #getEnumerationConstraint()
	 * @generated
	 */
	EReference getEnumerationConstraint_Item();

	/**
	 * Returns the meta object for the attribute '{@link org.hl7.knowledgeartifact.r2.EnumerationConstraint#isStrictSelection <em>Strict Selection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Strict Selection</em>'.
	 * @see org.hl7.knowledgeartifact.r2.EnumerationConstraint#isStrictSelection()
	 * @see #getEnumerationConstraint()
	 * @generated
	 */
	EAttribute getEnumerationConstraint_StrictSelection();

	/**
	 * Returns the meta object for class '{@link org.hl7.knowledgeartifact.r2.EnumerationItem <em>Enumeration Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enumeration Item</em>'.
	 * @see org.hl7.knowledgeartifact.r2.EnumerationItem
	 * @generated
	 */
	EClass getEnumerationItem();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.knowledgeartifact.r2.EnumerationItem#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Identifier</em>'.
	 * @see org.hl7.knowledgeartifact.r2.EnumerationItem#getIdentifier()
	 * @see #getEnumerationItem()
	 * @generated
	 */
	EReference getEnumerationItem_Identifier();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.knowledgeartifact.r2.EnumerationItem#getNumber <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Number</em>'.
	 * @see org.hl7.knowledgeartifact.r2.EnumerationItem#getNumber()
	 * @see #getEnumerationItem()
	 * @generated
	 */
	EReference getEnumerationItem_Number();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.knowledgeartifact.r2.EnumerationItem#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see org.hl7.knowledgeartifact.r2.EnumerationItem#getValue()
	 * @see #getEnumerationItem()
	 * @generated
	 */
	EReference getEnumerationItem_Value();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.knowledgeartifact.r2.EnumerationItem#getCodes <em>Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Codes</em>'.
	 * @see org.hl7.knowledgeartifact.r2.EnumerationItem#getCodes()
	 * @see #getEnumerationItem()
	 * @generated
	 */
	EReference getEnumerationItem_Codes();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.knowledgeartifact.r2.EnumerationItem#getDisplayText <em>Display Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Display Text</em>'.
	 * @see org.hl7.knowledgeartifact.r2.EnumerationItem#getDisplayText()
	 * @see #getEnumerationItem()
	 * @generated
	 */
	EReference getEnumerationItem_DisplayText();

	/**
	 * Returns the meta object for the containment reference list '{@link org.hl7.knowledgeartifact.r2.EnumerationItem#getAdditionalInstructions <em>Additional Instructions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Additional Instructions</em>'.
	 * @see org.hl7.knowledgeartifact.r2.EnumerationItem#getAdditionalInstructions()
	 * @see #getEnumerationItem()
	 * @generated
	 */
	EReference getEnumerationItem_AdditionalInstructions();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.knowledgeartifact.r2.EnumerationItem#getValueMeaning <em>Value Meaning</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value Meaning</em>'.
	 * @see org.hl7.knowledgeartifact.r2.EnumerationItem#getValueMeaning()
	 * @see #getEnumerationItem()
	 * @generated
	 */
	EReference getEnumerationItem_ValueMeaning();

	/**
	 * Returns the meta object for the attribute '{@link org.hl7.knowledgeartifact.r2.EnumerationItem#isFillIn <em>Fill In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fill In</em>'.
	 * @see org.hl7.knowledgeartifact.r2.EnumerationItem#isFillIn()
	 * @see #getEnumerationItem()
	 * @generated
	 */
	EAttribute getEnumerationItem_FillIn();

	/**
	 * Returns the meta object for class '{@link org.hl7.knowledgeartifact.r2.EventBinding <em>Event Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event Binding</em>'.
	 * @see org.hl7.knowledgeartifact.r2.EventBinding
	 * @generated
	 */
	EClass getEventBinding();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.knowledgeartifact.r2.EventBinding#getBindingModel <em>Binding Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Binding Model</em>'.
	 * @see org.hl7.knowledgeartifact.r2.EventBinding#getBindingModel()
	 * @see #getEventBinding()
	 * @generated
	 */
	EReference getEventBinding_BindingModel();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.knowledgeartifact.r2.EventBinding#getIncomingBindings <em>Incoming Bindings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Incoming Bindings</em>'.
	 * @see org.hl7.knowledgeartifact.r2.EventBinding#getIncomingBindings()
	 * @see #getEventBinding()
	 * @generated
	 */
	EReference getEventBinding_IncomingBindings();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.knowledgeartifact.r2.EventBinding#getOutgoingBindings <em>Outgoing Bindings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Outgoing Bindings</em>'.
	 * @see org.hl7.knowledgeartifact.r2.EventBinding#getOutgoingBindings()
	 * @see #getEventBinding()
	 * @generated
	 */
	EReference getEventBinding_OutgoingBindings();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.knowledgeartifact.r2.EventBinding#getTriggers <em>Triggers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Triggers</em>'.
	 * @see org.hl7.knowledgeartifact.r2.EventBinding#getTriggers()
	 * @see #getEventBinding()
	 * @generated
	 */
	EReference getEventBinding_Triggers();

	/**
	 * Returns the meta object for class '{@link org.hl7.knowledgeartifact.r2.EventBindingTypeType <em>Event Binding Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event Binding Type Type</em>'.
	 * @see org.hl7.knowledgeartifact.r2.EventBindingTypeType
	 * @generated
	 */
	EClass getEventBindingTypeType();

	/**
	 * Returns the meta object for the attribute '{@link org.hl7.knowledgeartifact.r2.EventBindingTypeType#getBinding <em>Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Binding</em>'.
	 * @see org.hl7.knowledgeartifact.r2.EventBindingTypeType#getBinding()
	 * @see #getEventBindingTypeType()
	 * @generated
	 */
	EAttribute getEventBindingTypeType_Binding();

	/**
	 * Returns the meta object for class '{@link org.hl7.knowledgeartifact.r2.EventDefType <em>Event Def Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event Def Type</em>'.
	 * @see org.hl7.knowledgeartifact.r2.EventDefType
	 * @generated
	 */
	EClass getEventDefType();

	/**
	 * Returns the meta object for the attribute '{@link org.hl7.knowledgeartifact.r2.EventDefType#getEventType <em>Event Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Event Type</em>'.
	 * @see org.hl7.knowledgeartifact.r2.EventDefType#getEventType()
	 * @see #getEventDefType()
	 * @generated
	 */
	EAttribute getEventDefType_EventType();

	/**
	 * Returns the meta object for class '{@link org.hl7.knowledgeartifact.r2.EventHistoryType <em>Event History Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event History Type</em>'.
	 * @see org.hl7.knowledgeartifact.r2.EventHistoryType
	 * @generated
	 */
	EClass getEventHistoryType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.hl7.knowledgeartifact.r2.EventHistoryType#getArtifactLifeCycleEvent <em>Artifact Life Cycle Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Artifact Life Cycle Event</em>'.
	 * @see org.hl7.knowledgeartifact.r2.EventHistoryType#getArtifactLifeCycleEvent()
	 * @see #getEventHistoryType()
	 * @generated
	 */
	EReference getEventHistoryType_ArtifactLifeCycleEvent();

	/**
	 * Returns the meta object for class '{@link org.hl7.knowledgeartifact.r2.EventNameType <em>Event Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event Name Type</em>'.
	 * @see org.hl7.knowledgeartifact.r2.EventNameType
	 * @generated
	 */
	EClass getEventNameType();

	/**
	 * Returns the meta object for the attribute '{@link org.hl7.knowledgeartifact.r2.EventNameType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.hl7.knowledgeartifact.r2.EventNameType#getName()
	 * @see #getEventNameType()
	 * @generated
	 */
	EAttribute getEventNameType_Name();

	/**
	 * Returns the meta object for class '{@link org.hl7.knowledgeartifact.r2.EventTypeType <em>Event Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event Type Type</em>'.
	 * @see org.hl7.knowledgeartifact.r2.EventTypeType
	 * @generated
	 */
	EClass getEventTypeType();

	/**
	 * Returns the meta object for the attribute '{@link org.hl7.knowledgeartifact.r2.EventTypeType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.hl7.knowledgeartifact.r2.EventTypeType#getValue()
	 * @see #getEventTypeType()
	 * @generated
	 */
	EAttribute getEventTypeType_Value();

	/**
	 * Returns the meta object for class '{@link org.hl7.knowledgeartifact.r2.Evidence <em>Evidence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Evidence</em>'.
	 * @see org.hl7.knowledgeartifact.r2.Evidence
	 * @generated
	 */
	EClass getEvidence();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.knowledgeartifact.r2.Evidence#getQualityOfEvidence <em>Quality Of Evidence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Quality Of Evidence</em>'.
	 * @see org.hl7.knowledgeartifact.r2.Evidence#getQualityOfEvidence()
	 * @see #getEvidence()
	 * @generated
	 */
	EReference getEvidence_QualityOfEvidence();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.knowledgeartifact.r2.Evidence#getStrengthOfRecommendation <em>Strength Of Recommendation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Strength Of Recommendation</em>'.
	 * @see org.hl7.knowledgeartifact.r2.Evidence#getStrengthOfRecommendation()
	 * @see #getEvidence()
	 * @generated
	 */
	EReference getEvidence_StrengthOfRecommendation();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.knowledgeartifact.r2.Evidence#getResources <em>Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Resources</em>'.
	 * @see org.hl7.knowledgeartifact.r2.Evidence#getResources()
	 * @see #getEvidence()
	 * @generated
	 */
	EReference getEvidence_Resources();

	/**
	 * Returns the meta object for class '{@link org.hl7.knowledgeartifact.r2.ExpressionConstraint <em>Expression Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression Constraint</em>'.
	 * @see org.hl7.knowledgeartifact.r2.ExpressionConstraint
	 * @generated
	 */
	EClass getExpressionConstraint();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.knowledgeartifact.r2.ExpressionConstraint#getConstraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Constraint</em>'.
	 * @see org.hl7.knowledgeartifact.r2.ExpressionConstraint#getConstraint()
	 * @see #getExpressionConstraint()
	 * @generated
	 */
	EReference getExpressionConstraint_Constraint();

	/**
	 * Returns the meta object for class '{@link org.hl7.knowledgeartifact.r2.ExpressionsType <em>Expressions Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expressions Type</em>'.
	 * @see org.hl7.knowledgeartifact.r2.ExpressionsType
	 * @generated
	 */
	EClass getExpressionsType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.hl7.knowledgeartifact.r2.ExpressionsType#getDef <em>Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Def</em>'.
	 * @see org.hl7.knowledgeartifact.r2.ExpressionsType#getDef()
	 * @see #getExpressionsType()
	 * @generated
	 */
	EReference getExpressionsType_Def();

	/**
	 * Returns the meta object for class '{@link org.hl7.knowledgeartifact.r2.ExternalDataType <em>External Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>External Data Type</em>'.
	 * @see org.hl7.knowledgeartifact.r2.ExternalDataType
	 * @generated
	 */
	EClass getExternalDataType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.hl7.knowledgeartifact.r2.ExternalDataType#getCodesystem <em>Codesystem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Codesystem</em>'.
	 * @see org.hl7.knowledgeartifact.r2.ExternalDataType#getCodesystem()
	 * @see #getExternalDataType()
	 * @generated
	 */
	EReference getExternalDataType_Codesystem();

	/**
	 * Returns the meta object for the containment reference list '{@link org.hl7.knowledgeartifact.r2.ExternalDataType#getValueset <em>Valueset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Valueset</em>'.
	 * @see org.hl7.knowledgeartifact.r2.ExternalDataType#getValueset()
	 * @see #getExternalDataType()
	 * @generated
	 */
	EReference getExternalDataType_Valueset();

	/**
	 * Returns the meta object for the containment reference list '{@link org.hl7.knowledgeartifact.r2.ExternalDataType#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameter</em>'.
	 * @see org.hl7.knowledgeartifact.r2.ExternalDataType#getParameter()
	 * @see #getExternalDataType()
	 * @generated
	 */
	EReference getExternalDataType_Parameter();

	/**
	 * Returns the meta object for the containment reference list '{@link org.hl7.knowledgeartifact.r2.ExternalDataType#getDef <em>Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Def</em>'.
	 * @see org.hl7.knowledgeartifact.r2.ExternalDataType#getDef()
	 * @see #getExternalDataType()
	 * @generated
	 */
	EReference getExternalDataType_Def();

	/**
	 * Returns the meta object for the containment reference list '{@link org.hl7.knowledgeartifact.r2.ExternalDataType#getTrigger <em>Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Trigger</em>'.
	 * @see org.hl7.knowledgeartifact.r2.ExternalDataType#getTrigger()
	 * @see #getExternalDataType()
	 * @generated
	 */
	EReference getExternalDataType_Trigger();

	/**
	 * Returns the meta object for class '{@link org.hl7.knowledgeartifact.r2.FireEventAction <em>Fire Event Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fire Event Action</em>'.
	 * @see org.hl7.knowledgeartifact.r2.FireEventAction
	 * @generated
	 */
	EClass getFireEventAction();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.knowledgeartifact.r2.FireEventAction#getEventType <em>Event Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Event Type</em>'.
	 * @see org.hl7.knowledgeartifact.r2.FireEventAction#getEventType()
	 * @see #getFireEventAction()
	 * @generated
	 */
	EReference getFireEventAction_EventType();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.knowledgeartifact.r2.FireEventAction#getActionSentence <em>Action Sentence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Action Sentence</em>'.
	 * @see org.hl7.knowledgeartifact.r2.FireEventAction#getActionSentence()
	 * @see #getFireEventAction()
	 * @generated
	 */
	EReference getFireEventAction_ActionSentence();

	/**
	 * Returns the meta object for class '{@link org.hl7.knowledgeartifact.r2.FocusType <em>Focus Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Focus Type</em>'.
	 * @see org.hl7.knowledgeartifact.r2.FocusType
	 * @generated
	 */
	EClass getFocusType();

	/**
	 * Returns the meta object for the attribute '{@link org.hl7.knowledgeartifact.r2.FocusType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.hl7.knowledgeartifact.r2.FocusType#getValue()
	 * @see #getFocusType()
	 * @generated
	 */
	EAttribute getFocusType_Value();

	/**
	 * Returns the meta object for class '{@link org.hl7.knowledgeartifact.r2.FormattedNumber <em>Formatted Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Formatted Number</em>'.
	 * @see org.hl7.knowledgeartifact.r2.FormattedNumber
	 * @generated
	 */
	EClass getFormattedNumber();

	/**
	 * Returns the meta object for the attribute '{@link org.hl7.knowledgeartifact.r2.FormattedNumber#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see org.hl7.knowledgeartifact.r2.FormattedNumber#getLabel()
	 * @see #getFormattedNumber()
	 * @generated
	 */
	EAttribute getFormattedNumber_Label();

	/**
	 * Returns the meta object for the attribute list '{@link org.hl7.knowledgeartifact.r2.FormattedNumber#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Style</em>'.
	 * @see org.hl7.knowledgeartifact.r2.FormattedNumber#getStyle()
	 * @see #getFormattedNumber()
	 * @generated
	 */
	EAttribute getFormattedNumber_Style();

	/**
	 * Returns the meta object for the attribute '{@link org.hl7.knowledgeartifact.r2.FormattedNumber#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.hl7.knowledgeartifact.r2.FormattedNumber#getValue()
	 * @see #getFormattedNumber()
	 * @generated
	 */
	EAttribute getFormattedNumber_Value();

	/**
	 * Returns the meta object for class '{@link org.hl7.knowledgeartifact.r2.FormattedText <em>Formatted Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Formatted Text</em>'.
	 * @see org.hl7.knowledgeartifact.r2.FormattedText
	 * @generated
	 */
	EClass getFormattedText();

	/**
	 * Returns the meta object for the attribute '{@link org.hl7.knowledgeartifact.r2.FormattedText#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see org.hl7.knowledgeartifact.r2.FormattedText#getLabel()
	 * @see #getFormattedText()
	 * @generated
	 */
	EAttribute getFormattedText_Label();

	/**
	 * Returns the meta object for the attribute list '{@link org.hl7.knowledgeartifact.r2.FormattedText#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Style</em>'.
	 * @see org.hl7.knowledgeartifact.r2.FormattedText#getStyle()
	 * @see #getFormattedText()
	 * @generated
	 */
	EAttribute getFormattedText_Style();

	/**
	 * Returns the meta object for the attribute '{@link org.hl7.knowledgeartifact.r2.FormattedText#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.hl7.knowledgeartifact.r2.FormattedText#getValue()
	 * @see #getFormattedText()
	 * @generated
	 */
	EAttribute getFormattedText_Value();

	/**
	 * Returns the meta object for class '{@link org.hl7.knowledgeartifact.r2.GroupOrganizationBehavior <em>Group Organization Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Group Organization Behavior</em>'.
	 * @see org.hl7.knowledgeartifact.r2.GroupOrganizationBehavior
	 * @generated
	 */
	EClass getGroupOrganizationBehavior();

	/**
	 * Returns the meta object for class '{@link org.hl7.knowledgeartifact.r2.GroupSelectionBehavior <em>Group Selection Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Group Selection Behavior</em>'.
	 * @see org.hl7.knowledgeartifact.r2.GroupSelectionBehavior
	 * @generated
	 */
	EClass getGroupSelectionBehavior();

	/**
	 * Returns the meta object for class '{@link org.hl7.knowledgeartifact.r2.IdentifiersType <em>Identifiers Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Identifiers Type</em>'.
	 * @see org.hl7.knowledgeartifact.r2.IdentifiersType
	 * @generated
	 */
	EClass getIdentifiersType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.hl7.knowledgeartifact.r2.IdentifiersType#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Identifier</em>'.
	 * @see org.hl7.knowledgeartifact.r2.IdentifiersType#getIdentifier()
	 * @see #getIdentifiersType()
	 * @generated
	 */
	EReference getIdentifiersType_Identifier();

	/**
	 * Returns the meta object for class '{@link org.hl7.knowledgeartifact.r2.IdentifiersType1 <em>Identifiers Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Identifiers Type1</em>'.
	 * @see org.hl7.knowledgeartifact.r2.IdentifiersType1
	 * @generated
	 */
	EClass getIdentifiersType1();

	/**
	 * Returns the meta object for the containment reference list '{@link org.hl7.knowledgeartifact.r2.IdentifiersType1#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Identifier</em>'.
	 * @see org.hl7.knowledgeartifact.r2.IdentifiersType1#getIdentifier()
	 * @see #getIdentifiersType1()
	 * @generated
	 */
	EReference getIdentifiersType1_Identifier();

	/**
	 * Returns the meta object for class '{@link org.hl7.knowledgeartifact.r2.IdentifiersType2 <em>Identifiers Type2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Identifiers Type2</em>'.
	 * @see org.hl7.knowledgeartifact.r2.IdentifiersType2
	 * @generated
	 */
	EClass getIdentifiersType2();

	/**
	 * Returns the meta object for the containment reference list '{@link org.hl7.knowledgeartifact.r2.IdentifiersType2#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Identifier</em>'.
	 * @see org.hl7.knowledgeartifact.r2.IdentifiersType2#getIdentifier()
	 * @see #getIdentifiersType2()
	 * @generated
	 */
	EReference getIdentifiersType2_Identifier();

	/**
	 * Returns the meta object for class '{@link org.hl7.knowledgeartifact.r2.InitialArtifactType <em>Initial Artifact Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Initial Artifact Type</em>'.
	 * @see org.hl7.knowledgeartifact.r2.InitialArtifactType
	 * @generated
	 */
	EClass getInitialArtifactType();

	/**
	 * Returns the meta object for the attribute '{@link org.hl7.knowledgeartifact.r2.InitialArtifactType#getBindingName <em>Binding Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Binding Name</em>'.
	 * @see org.hl7.knowledgeartifact.r2.InitialArtifactType#getBindingName()
	 * @see #getInitialArtifactType()
	 * @generated
	 */
	EAttribute getInitialArtifactType_BindingName();

	/**
	 * Returns the meta object for class '{@link org.hl7.knowledgeartifact.r2.InlineResource <em>Inline Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inline Resource</em>'.
	 * @see org.hl7.knowledgeartifact.r2.InlineResource
	 * @generated
	 */
	EClass getInlineResource();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.knowledgeartifact.r2.InlineResource#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Content</em>'.
	 * @see org.hl7.knowledgeartifact.r2.InlineResource#getContent()
	 * @see #getInlineResource()
	 * @generated
	 */
	EReference getInlineResource_Content();

	/**
	 * Returns the meta object for class '{@link org.hl7.knowledgeartifact.r2.ItemCodesType <em>Item Codes Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Item Codes Type</em>'.
	 * @see org.hl7.knowledgeartifact.r2.ItemCodesType
	 * @generated
	 */
	EClass getItemCodesType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.hl7.knowledgeartifact.r2.ItemCodesType#getItemCode <em>Item Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Item Code</em>'.
	 * @see org.hl7.knowledgeartifact.r2.ItemCodesType#getItemCode()
	 * @see #getItemCodesType()
	 * @generated
	 */
	EReference getItemCodesType_ItemCode();

	/**
	 * Returns the meta object for class '{@link org.hl7.knowledgeartifact.r2.ItemDefinition <em>Item Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Item Definition</em>'.
	 * @see org.hl7.knowledgeartifact.r2.ItemDefinition
	 * @generated
	 */
	EClass getItemDefinition();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.knowledgeartifact.r2.ItemDefinition#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Identifier</em>'.
	 * @see org.hl7.knowledgeartifact.r2.ItemDefinition#getIdentifier()
	 * @see #getItemDefinition()
	 * @generated
	 */
	EReference getItemDefinition_Identifier();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.knowledgeartifact.r2.ItemDefinition#getScopedIdentifier <em>Scoped Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Scoped Identifier</em>'.
	 * @see org.hl7.knowledgeartifact.r2.ItemDefinition#getScopedIdentifier()
	 * @see #getItemDefinition()
	 * @generated
	 */
	EReference getItemDefinition_ScopedIdentifier();

	/**
	 * Returns the meta object for class '{@link org.hl7.knowledgeartifact.r2.KeyTermsType <em>Key Terms Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Key Terms Type</em>'.
	 * @see org.hl7.knowledgeartifact.r2.KeyTermsType
	 * @generated
	 */
	EClass getKeyTermsType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.hl7.knowledgeartifact.r2.KeyTermsType#getTerm <em>Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Term</em>'.
	 * @see org.hl7.knowledgeartifact.r2.KeyTermsType#getTerm()
	 * @see #getKeyTermsType()
	 * @generated
	 */
	EReference getKeyTermsType_Term();

	/**
	 * Returns the meta object for class '{@link org.hl7.knowledgeartifact.r2.KnowledgeDocument <em>Knowledge Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Knowledge Document</em>'.
	 * @see org.hl7.knowledgeartifact.r2.KnowledgeDocument
	 * @generated
	 */
	EClass getKnowledgeDocument();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.knowledgeartifact.r2.KnowledgeDocument#getMetadata <em>Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Metadata</em>'.
	 * @see org.hl7.knowledgeartifact.r2.KnowledgeDocument#getMetadata()
	 * @see #getKnowledgeDocument()
	 * @generated
	 */
	EReference getKnowledgeDocument_Metadata();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.knowledgeartifact.r2.KnowledgeDocument#getExternalData <em>External Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>External Data</em>'.
	 * @see org.hl7.knowledgeartifact.r2.KnowledgeDocument#getExternalData()
	 * @see #getKnowledgeDocument()
	 * @generated
	 */
	EReference getKnowledgeDocument_ExternalData();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.knowledgeartifact.r2.KnowledgeDocument#getExpressions <em>Expressions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expressions</em>'.
	 * @see org.hl7.knowledgeartifact.r2.KnowledgeDocument#getExpressions()
	 * @see #getKnowledgeDocument()
	 * @generated
	 */
	EReference getKnowledgeDocument_Expressions();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.knowledgeartifact.r2.KnowledgeDocument#getTriggers <em>Triggers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Triggers</em>'.
	 * @see org.hl7.knowledgeartifact.r2.KnowledgeDocument#getTriggers()
	 * @see #getKnowledgeDocument()
	 * @generated
	 */
	EReference getKnowledgeDocument_Triggers();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.knowledgeartifact.r2.KnowledgeDocument#getConditions <em>Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Conditions</em>'.
	 * @see org.hl7.knowledgeartifact.r2.KnowledgeDocument#getConditions()
	 * @see #getKnowledgeDocument()
	 * @generated
	 */
	EReference getKnowledgeDocument_Conditions();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.knowledgeartifact.r2.KnowledgeDocument#getBehaviors <em>Behaviors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Behaviors</em>'.
	 * @see org.hl7.knowledgeartifact.r2.KnowledgeDocument#getBehaviors()
	 * @see #getKnowledgeDocument()
	 * @generated
	 */
	EReference getKnowledgeDocument_Behaviors();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.knowledgeartifact.r2.KnowledgeDocument#getActionGroup <em>Action Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Action Group</em>'.
	 * @see org.hl7.knowledgeartifact.r2.KnowledgeDocument#getActionGroup()
	 * @see #getKnowledgeDocument()
	 * @generated
	 */
	EReference getKnowledgeDocument_ActionGroup();

	/**
	 * Returns the meta object for class '{@link org.hl7.knowledgeartifact.r2.KnowledgeResource <em>Knowledge Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Knowledge Resource</em>'.
	 * @see org.hl7.knowledgeartifact.r2.KnowledgeResource
	 * @generated
	 */
	EClass getKnowledgeResource();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.knowledgeartifact.r2.KnowledgeResource#getIdentifiers <em>Identifiers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Identifiers</em>'.
	 * @see org.hl7.knowledgeartifact.r2.KnowledgeResource#getIdentifiers()
	 * @see #getKnowledgeResource()
	 * @generated
	 */
	EReference getKnowledgeResource_Identifiers();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.knowledgeartifact.r2.KnowledgeResource#getTemplateIds <em>Template Ids</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Template Ids</em>'.
	 * @see org.hl7.knowledgeartifact.r2.KnowledgeResource#getTemplateIds()
	 * @see #getKnowledgeResource()
	 * @generated
	 */
	EReference getKnowledgeResource_TemplateIds();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.knowledgeartifact.r2.KnowledgeResource#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Title</em>'.
	 * @see org.hl7.knowledgeartifact.r2.KnowledgeResource#getTitle()
	 * @see #getKnowledgeResource()
	 * @generated
	 */
	EReference getKnowledgeResource_Title();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.knowledgeartifact.r2.KnowledgeResource#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Location</em>'.
	 * @see org.hl7.knowledgeartifact.r2.KnowledgeResource#getLocation()
	 * @see #getKnowledgeResource()
	 * @generated
	 */
	EReference getKnowledgeResource_Location();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.knowledgeartifact.r2.KnowledgeResource#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see org.hl7.knowledgeartifact.r2.KnowledgeResource#getDescription()
	 * @see #getKnowledgeResource()
	 * @generated
	 */
	EReference getKnowledgeResource_Description();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.knowledgeartifact.r2.KnowledgeResource#getCitation <em>Citation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Citation</em>'.
	 * @see org.hl7.knowledgeartifact.r2.KnowledgeResource#getCitation()
	 * @see #getKnowledgeResource()
	 * @generated
	 */
	EReference getKnowledgeResource_Citation();

	/**
	 * Returns the meta object for class '{@link org.hl7.knowledgeartifact.r2.LibrariesType <em>Libraries Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Libraries Type</em>'.
	 * @see org.hl7.knowledgeartifact.r2.LibrariesType
	 * @generated
	 */
	EClass getLibrariesType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.hl7.knowledgeartifact.r2.LibrariesType#getLibraryReference <em>Library Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Library Reference</em>'.
	 * @see org.hl7.knowledgeartifact.r2.LibrariesType#getLibraryReference()
	 * @see #getLibrariesType()
	 * @generated
	 */
	EReference getLibrariesType_LibraryReference();

	/**
	 * Returns the meta object for class '{@link org.hl7.knowledgeartifact.r2.LibraryReference <em>Library Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Library Reference</em>'.
	 * @see org.hl7.knowledgeartifact.r2.LibraryReference
	 * @generated
	 */
	EClass getLibraryReference();

	/**
	 * Returns the meta object for the attribute '{@link org.hl7.knowledgeartifact.r2.LibraryReference#getMediaType <em>Media Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Media Type</em>'.
	 * @see org.hl7.knowledgeartifact.r2.LibraryReference#getMediaType()
	 * @see #getLibraryReference()
	 * @generated
	 */
	EAttribute getLibraryReference_MediaType();

	/**
	 * Returns the meta object for the attribute '{@link org.hl7.knowledgeartifact.r2.LibraryReference#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.hl7.knowledgeartifact.r2.LibraryReference#getName()
	 * @see #getLibraryReference()
	 * @generated
	 */
	EAttribute getLibraryReference_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.hl7.knowledgeartifact.r2.LibraryReference#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see org.hl7.knowledgeartifact.r2.LibraryReference#getPath()
	 * @see #getLibraryReference()
	 * @generated
	 */
	EAttribute getLibraryReference_Path();

	/**
	 * Returns the meta object for the attribute '{@link org.hl7.knowledgeartifact.r2.LibraryReference#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see org.hl7.knowledgeartifact.r2.LibraryReference#getVersion()
	 * @see #getLibraryReference()
	 * @generated
	 */
	EAttribute getLibraryReference_Version();

	/**
	 * Returns the meta object for class '{@link org.hl7.knowledgeartifact.r2.LookupConstraint <em>Lookup Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lookup Constraint</em>'.
	 * @see org.hl7.knowledgeartifact.r2.LookupConstraint
	 * @generated
	 */
	EClass getLookupConstraint();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.knowledgeartifact.r2.LookupConstraint#getItems <em>Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Items</em>'.
	 * @see org.hl7.knowledgeartifact.r2.LookupConstraint#getItems()
	 * @see #getLookupConstraint()
	 * @generated
	 */
	EReference getLookupConstraint_Items();

	/**
	 * Returns the meta object for the attribute '{@link org.hl7.knowledgeartifact.r2.LookupConstraint#getDisplayField <em>Display Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Display Field</em>'.
	 * @see org.hl7.knowledgeartifact.r2.LookupConstraint#getDisplayField()
	 * @see #getLookupConstraint()
	 * @generated
	 */
	EAttribute getLookupConstraint_DisplayField();

	/**
	 * Returns the meta object for the attribute '{@link org.hl7.knowledgeartifact.r2.LookupConstraint#isStrictSelection <em>Strict Selection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Strict Selection</em>'.
	 * @see org.hl7.knowledgeartifact.r2.LookupConstraint#isStrictSelection()
	 * @see #getLookupConstraint()
	 * @generated
	 */
	EAttribute getLookupConstraint_StrictSelection();

	/**
	 * Returns the meta object for class '{@link org.hl7.knowledgeartifact.r2.Manifest <em>Manifest</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Manifest</em>'.
	 * @see org.hl7.knowledgeartifact.r2.Manifest
	 * @generated
	 */
	EClass getManifest();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.knowledgeartifact.r2.Manifest#getArtifactSummary <em>Artifact Summary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Artifact Summary</em>'.
	 * @see org.hl7.knowledgeartifact.r2.Manifest#getArtifactSummary()
	 * @see #getManifest()
	 * @generated
	 */
	EReference getManifest_ArtifactSummary();

	/**
	 * Returns the meta object for class '{@link org.hl7.knowledgeartifact.r2.MappingType <em>Mapping Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mapping Type</em>'.
	 * @see org.hl7.knowledgeartifact.r2.MappingType
	 * @generated
	 */
	EClass getMappingType();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.knowledgeartifact.r2.MappingType#getComponentEventMappings <em>Component Event Mappings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Component Event Mappings</em>'.
	 * @see org.hl7.knowledgeartifact.r2.MappingType#getComponentEventMappings()
	 * @see #getMappingType()
	 * @generated
	 */
	EReference getMappingType_ComponentEventMappings();

	/**
	 * Returns the meta object for class '{@link org.hl7.knowledgeartifact.r2.MaskConstraint <em>Mask Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mask Constraint</em>'.
	 * @see org.hl7.knowledgeartifact.r2.MaskConstraint
	 * @generated
	 */
	EClass getMaskConstraint();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.knowledgeartifact.r2.MaskConstraint#getMaskExpression <em>Mask Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Mask Expression</em>'.
	 * @see org.hl7.knowledgeartifact.r2.MaskConstraint#getMaskExpression()
	 * @see #getMaskConstraint()
	 * @generated
	 */
	EReference getMaskConstraint_MaskExpression();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.knowledgeartifact.r2.MaskConstraint#getMaskHelp <em>Mask Help</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Mask Help</em>'.
	 * @see org.hl7.knowledgeartifact.r2.MaskConstraint#getMaskHelp()
	 * @see #getMaskConstraint()
	 * @generated
	 */
	EReference getMaskConstraint_MaskHelp();

	/**
	 * Returns the meta object for class '{@link org.hl7.knowledgeartifact.r2.Metadata <em>Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Metadata</em>'.
	 * @see org.hl7.knowledgeartifact.r2.Metadata
	 * @generated
	 */
	EClass getMetadata();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.knowledgeartifact.r2.Metadata#getIdentifiers <em>Identifiers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Identifiers</em>'.
	 * @see org.hl7.knowledgeartifact.r2.Metadata#getIdentifiers()
	 * @see #getMetadata()
	 * @generated
	 */
	EReference getMetadata_Identifiers();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.knowledgeartifact.r2.Metadata#getArtifactType <em>Artifact Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Artifact Type</em>'.
	 * @see org.hl7.knowledgeartifact.r2.Metadata#getArtifactType()
	 * @see #getMetadata()
	 * @generated
	 */
	EReference getMetadata_ArtifactType();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.knowledgeartifact.r2.Metadata#getSchemaIdentifier <em>Schema Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Schema Identifier</em>'.
	 * @see org.hl7.knowledgeartifact.r2.Metadata#getSchemaIdentifier()
	 * @see #getMetadata()
	 * @generated
	 */
	EReference getMetadata_SchemaIdentifier();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.knowledgeartifact.r2.Metadata#getTemplateIds <em>Template Ids</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Template Ids</em>'.
	 * @see org.hl7.knowledgeartifact.r2.Metadata#getTemplateIds()
	 * @see #getMetadata()
	 * @generated
	 */
	EReference getMetadata_TemplateIds();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.knowledgeartifact.r2.Metadata#getDataModels <em>Data Models</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data Models</em>'.
	 * @see org.hl7.knowledgeartifact.r2.Metadata#getDataModels()
	 * @see #getMetadata()
	 * @generated
	 */
	EReference getMetadata_DataModels();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.knowledgeartifact.r2.Metadata#getLibraries <em>Libraries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Libraries</em>'.
	 * @see org.hl7.knowledgeartifact.r2.Metadata#getLibraries()
	 * @see #getMetadata()
	 * @generated
	 */
	EReference getMetadata_Libraries();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.knowledgeartifact.r2.Metadata#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Title</em>'.
	 * @see org.hl7.knowledgeartifact.r2.Metadata#getTitle()
	 * @see #getMetadata()
	 * @generated
	 */
	EReference getMetadata_Title();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.knowledgeartifact.r2.Metadata#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see org.hl7.knowledgeartifact.r2.Metadata#getDescription()
	 * @see #getMetadata()
	 * @generated
	 */
	EReference getMetadata_Description();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.knowledgeartifact.r2.Metadata#getDocumentation <em>Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Documentation</em>'.
	 * @see org.hl7.knowledgeartifact.r2.Metadata#getDocumentation()
	 * @see #getMetadata()
	 * @generated
	 */
	EReference getMetadata_Documentation();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.knowledgeartifact.r2.Metadata#getRelatedResources <em>Related Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Related Resources</em>'.
	 * @see org.hl7.knowledgeartifact.r2.Metadata#getRelatedResources()
	 * @see #getMetadata()
	 * @generated
	 */
	EReference getMetadata_RelatedResources();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.knowledgeartifact.r2.Metadata#getSupportingEvidence <em>Supporting Evidence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Supporting Evidence</em>'.
	 * @see org.hl7.knowledgeartifact.r2.Metadata#getSupportingEvidence()
	 * @see #getMetadata()
	 * @generated
	 */
	EReference getMetadata_SupportingEvidence();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.knowledgeartifact.r2.Metadata#getApplicability <em>Applicability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Applicability</em>'.
	 * @see org.hl7.knowledgeartifact.r2.Metadata#getApplicability()
	 * @see #getMetadata()
	 * @generated
	 */
	EReference getMetadata_Applicability();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.knowledgeartifact.r2.Metadata#getKeyTerms <em>Key Terms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Key Terms</em>'.
	 * @see org.hl7.knowledgeartifact.r2.Metadata#getKeyTerms()
	 * @see #getMetadata()
	 * @generated
	 */
	EReference getMetadata_KeyTerms();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.knowledgeartifact.r2.Metadata#getCategories <em>Categories</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Categories</em>'.
	 * @see org.hl7.knowledgeartifact.r2.Metadata#getCategories()
	 * @see #getMetadata()
	 * @generated
	 */
	EReference getMetadata_Categories();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.knowledgeartifact.r2.Metadata#getLanguage <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Language</em>'.
	 * @see org.hl7.knowledgeartifact.r2.Metadata#getLanguage()
	 * @see #getMetadata()
	 * @generated
	 */
	EReference getMetadata_Language();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.knowledgeartifact.r2.Metadata#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Status</em>'.
	 * @see org.hl7.knowledgeartifact.r2.Metadata#getStatus()
	 * @see #getMetadata()
	 * @generated
	 */
	EReference getMetadata_Status();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.knowledgeartifact.r2.Metadata#getEventHistory <em>Event History</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Event History</em>'.
	 * @see org.hl7.knowledgeartifact.r2.Metadata#getEventHistory()
	 * @see #getMetadata()
	 * @generated
	 */
	EReference getMetadata_EventHistory();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.knowledgeartifact.r2.Metadata#getContributions <em>Contributions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Contributions</em>'.
	 * @see org.hl7.knowledgeartifact.r2.Metadata#getContributions()
	 * @see #getMetadata()
	 * @generated
	 */
	EReference getMetadata_Contributions();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.knowledgeartifact.r2.Metadata#getPublishers <em>Publishers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Publishers</em>'.
	 * @see org.hl7.knowledgeartifact.r2.Metadata#getPublishers()
	 * @see #getMetadata()
	 * @generated
	 */
	EReference getMetadata_Publishers();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.knowledgeartifact.r2.Metadata#getUsageTerms <em>Usage Terms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Usage Terms</em>'.
	 * @see org.hl7.knowledgeartifact.r2.Metadata#getUsageTerms()
	 * @see #getMetadata()
	 * @generated
	 */
	EReference getMetadata_UsageTerms();

	/**
	 * Returns the meta object for class '{@link org.hl7.knowledgeartifact.r2.MetadataBinding <em>Metadata Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Metadata Binding</em>'.
	 * @see org.hl7.knowledgeartifact.r2.MetadataBinding
	 * @generated
	 */
	EClass getMetadataBinding();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.knowledgeartifact.r2.MetadataBinding#getBindings <em>Bindings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bindings</em>'.
	 * @see org.hl7.knowledgeartifact.r2.MetadataBinding#getBindings()
	 * @see #getMetadataBinding()
	 * @generated
	 */
	EReference getMetadataBinding_Bindings();

	/**
	 * Returns the meta object for class '{@link org.hl7.knowledgeartifact.r2.ModelReference <em>Model Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Reference</em>'.
	 * @see org.hl7.knowledgeartifact.r2.ModelReference
	 * @generated
	 */
	EClass getModelReference();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.knowledgeartifact.r2.ModelReference#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see org.hl7.knowledgeartifact.r2.ModelReference#getDescription()
	 * @see #getModelReference()
	 * @generated
	 */
	EReference getModelReference_Description();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.knowledgeartifact.r2.ModelReference#getReferencedModel <em>Referenced Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Referenced Model</em>'.
	 * @see org.hl7.knowledgeartifact.r2.ModelReference#getReferencedModel()
	 * @see #getModelReference()
	 * @generated
	 */
	EReference getModelReference_ReferencedModel();

	/**
	 * Returns the meta object for class '{@link org.hl7.knowledgeartifact.r2.NamedEventDef <em>Named Event Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Event Def</em>'.
	 * @see org.hl7.knowledgeartifact.r2.NamedEventDef
	 * @generated
	 */
	EClass getNamedEventDef();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.knowledgeartifact.r2.NamedEventDef#getEventName <em>Event Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Event Name</em>'.
	 * @see org.hl7.knowledgeartifact.r2.NamedEventDef#getEventName()
	 * @see #getNamedEventDef()
	 * @generated
	 */
	EReference getNamedEventDef_EventName();

	/**
	 * Returns the meta object for class '{@link org.hl7.knowledgeartifact.r2.NamedEventTrigger <em>Named Event Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Event Trigger</em>'.
	 * @see org.hl7.knowledgeartifact.r2.NamedEventTrigger
	 * @generated
	 */
	EClass getNamedEventTrigger();

	/**
	 * Returns the meta object for the attribute '{@link org.hl7.knowledgeartifact.r2.NamedEventTrigger#getOnEventName <em>On Event Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>On Event Name</em>'.
	 * @see org.hl7.knowledgeartifact.r2.NamedEventTrigger#getOnEventName()
	 * @see #getNamedEventTrigger()
	 * @generated
	 */
	EAttribute getNamedEventTrigger_OnEventName();

	/**
	 * Returns the meta object for class '{@link org.hl7.knowledgeartifact.r2.NameType <em>Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Name Type</em>'.
	 * @see org.hl7.knowledgeartifact.r2.NameType
	 * @generated
	 */
	EClass getNameType();

	/**
	 * Returns the meta object for the attribute '{@link org.hl7.knowledgeartifact.r2.NameType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.hl7.knowledgeartifact.r2.NameType#getValue()
	 * @see #getNameType()
	 * @generated
	 */
	EAttribute getNameType_Value();

	/**
	 * Returns the meta object for class '{@link org.hl7.knowledgeartifact.r2.Organization <em>Organization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Organization</em>'.
	 * @see org.hl7.knowledgeartifact.r2.Organization
	 * @generated
	 */
	EClass getOrganization();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.knowledgeartifact.r2.Organization#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Name</em>'.
	 * @see org.hl7.knowledgeartifact.r2.Organization#getName()
	 * @see #getOrganization()
	 * @generated
	 */
	EReference getOrganization_Name();

	/**
	 * Returns the meta object for class '{@link org.hl7.knowledgeartifact.r2.Party <em>Party</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Party</em>'.
	 * @see org.hl7.knowledgeartifact.r2.Party
	 * @generated
	 */
	EClass getParty();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.knowledgeartifact.r2.Party#getAddresses <em>Addresses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Addresses</em>'.
	 * @see org.hl7.knowledgeartifact.r2.Party#getAddresses()
	 * @see #getParty()
	 * @generated
	 */
	EReference getParty_Addresses();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.knowledgeartifact.r2.Party#getContacts <em>Contacts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Contacts</em>'.
	 * @see org.hl7.knowledgeartifact.r2.Party#getContacts()
	 * @see #getParty()
	 * @generated
	 */
	EReference getParty_Contacts();

	/**
	 * Returns the meta object for class '{@link org.hl7.knowledgeartifact.r2.PeriodicEventTrigger <em>Periodic Event Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Periodic Event Trigger</em>'.
	 * @see org.hl7.knowledgeartifact.r2.PeriodicEventTrigger
	 * @generated
	 */
	EClass getPeriodicEventTrigger();

	/**
	 * Returns the meta object for class '{@link org.hl7.knowledgeartifact.r2.PermissionsType <em>Permissions Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Permissions Type</em>'.
	 * @see org.hl7.knowledgeartifact.r2.PermissionsType
	 * @generated
	 */
	EClass getPermissionsType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.hl7.knowledgeartifact.r2.PermissionsType#getPermissions <em>Permissions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Permissions</em>'.
	 * @see org.hl7.knowledgeartifact.r2.PermissionsType#getPermissions()
	 * @see #getPermissionsType()
	 * @generated
	 */
	EReference getPermissionsType_Permissions();

	/**
	 * Returns the meta object for class '{@link org.hl7.knowledgeartifact.r2.Person <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Person</em>'.
	 * @see org.hl7.knowledgeartifact.r2.Person
	 * @generated
	 */
	EClass getPerson();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.knowledgeartifact.r2.Person#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Name</em>'.
	 * @see org.hl7.knowledgeartifact.r2.Person#getName()
	 * @see #getPerson()
	 * @generated
	 */
	EReference getPerson_Name();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.knowledgeartifact.r2.Person#getAffiliation <em>Affiliation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Affiliation</em>'.
	 * @see org.hl7.knowledgeartifact.r2.Person#getAffiliation()
	 * @see #getPerson()
	 * @generated
	 */
	EReference getPerson_Affiliation();

	/**
	 * Returns the meta object for class '{@link org.hl7.knowledgeartifact.r2.PrecheckBehavior <em>Precheck Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Precheck Behavior</em>'.
	 * @see org.hl7.knowledgeartifact.r2.PrecheckBehavior
	 * @generated
	 */
	EClass getPrecheckBehavior();

	/**
	 * Returns the meta object for class '{@link org.hl7.knowledgeartifact.r2.PublishersType <em>Publishers Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Publishers Type</em>'.
	 * @see org.hl7.knowledgeartifact.r2.PublishersType
	 * @generated
	 */
	EClass getPublishersType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.hl7.knowledgeartifact.r2.PublishersType#getPublisher <em>Publisher</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Publisher</em>'.
	 * @see org.hl7.knowledgeartifact.r2.PublishersType#getPublisher()
	 * @see #getPublishersType()
	 * @generated
	 */
	EReference getPublishersType_Publisher();

	/**
	 * Returns the meta object for class '{@link org.hl7.knowledgeartifact.r2.RangeConstraint <em>Range Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Range Constraint</em>'.
	 * @see org.hl7.knowledgeartifact.r2.RangeConstraint
	 * @generated
	 */
	EClass getRangeConstraint();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.knowledgeartifact.r2.RangeConstraint#getConstraintType <em>Constraint Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Constraint Type</em>'.
	 * @see org.hl7.knowledgeartifact.r2.RangeConstraint#getConstraintType()
	 * @see #getRangeConstraint()
	 * @generated
	 */
	EReference getRangeConstraint_ConstraintType();

	/**
	 * Returns the meta object for class '{@link org.hl7.knowledgeartifact.r2.ReadOnlyBehavior <em>Read Only Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Read Only Behavior</em>'.
	 * @see org.hl7.knowledgeartifact.r2.ReadOnlyBehavior
	 * @generated
	 */
	EClass getReadOnlyBehavior();

	/**
	 * Returns the meta object for class '{@link org.hl7.knowledgeartifact.r2.Reference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reference</em>'.
	 * @see org.hl7.knowledgeartifact.r2.Reference
	 * @generated
	 */
	EClass getReference();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.knowledgeartifact.r2.Reference#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Url</em>'.
	 * @see org.hl7.knowledgeartifact.r2.Reference#getUrl()
	 * @see #getReference()
	 * @generated
	 */
	EReference getReference_Url();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.knowledgeartifact.r2.Reference#getContentHash <em>Content Hash</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Content Hash</em>'.
	 * @see org.hl7.knowledgeartifact.r2.Reference#getContentHash()
	 * @see #getReference()
	 * @generated
	 */
	EReference getReference_ContentHash();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.knowledgeartifact.r2.Reference#getUuid <em>Uuid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Uuid</em>'.
	 * @see org.hl7.knowledgeartifact.r2.Reference#getUuid()
	 * @see #getReference()
	 * @generated
	 */
	EReference getReference_Uuid();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.knowledgeartifact.r2.Reference#getIdentifiers <em>Identifiers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Identifiers</em>'.
	 * @see org.hl7.knowledgeartifact.r2.Reference#getIdentifiers()
	 * @see #getReference()
	 * @generated
	 */
	EReference getReference_Identifiers();

	/**
	 * Returns the meta object for class '{@link org.hl7.knowledgeartifact.r2.ReferencedModelType <em>Referenced Model Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Referenced Model Type</em>'.
	 * @see org.hl7.knowledgeartifact.r2.ReferencedModelType
	 * @generated
	 */
	EClass getReferencedModelType();

	/**
	 * Returns the meta object for the attribute '{@link org.hl7.knowledgeartifact.r2.ReferencedModelType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.hl7.knowledgeartifact.r2.ReferencedModelType#getValue()
	 * @see #getReferencedModelType()
	 * @generated
	 */
	EAttribute getReferencedModelType_Value();

	/**
	 * Returns the meta object for class '{@link org.hl7.knowledgeartifact.r2.ReferenceList <em>Reference List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reference List</em>'.
	 * @see org.hl7.knowledgeartifact.r2.ReferenceList
	 * @generated
	 */
	EClass getReferenceList();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.knowledgeartifact.r2.ReferenceList#getReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Reference</em>'.
	 * @see org.hl7.knowledgeartifact.r2.ReferenceList#getReference()
	 * @see #getReferenceList()
	 * @generated
	 */
	EReference getReferenceList_Reference();

	/**
	 * Returns the meta object for class '{@link org.hl7.knowledgeartifact.r2.RelatedResourcesType <em>Related Resources Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Related Resources Type</em>'.
	 * @see org.hl7.knowledgeartifact.r2.RelatedResourcesType
	 * @generated
	 */
	EClass getRelatedResourcesType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.hl7.knowledgeartifact.r2.RelatedResourcesType#getRelatedResource <em>Related Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Related Resource</em>'.
	 * @see org.hl7.knowledgeartifact.r2.RelatedResourcesType#getRelatedResource()
	 * @see #getRelatedResourcesType()
	 * @generated
	 */
	EReference getRelatedResourcesType_RelatedResource();

	/**
	 * Returns the meta object for class '{@link org.hl7.knowledgeartifact.r2.RelationshipType <em>Relationship Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relationship Type</em>'.
	 * @see org.hl7.knowledgeartifact.r2.RelationshipType
	 * @generated
	 */
	EClass getRelationshipType();

	/**
	 * Returns the meta object for the attribute '{@link org.hl7.knowledgeartifact.r2.RelationshipType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.hl7.knowledgeartifact.r2.RelationshipType#getValue()
	 * @see #getRelationshipType()
	 * @generated
	 */
	EAttribute getRelationshipType_Value();

	/**
	 * Returns the meta object for class '{@link org.hl7.knowledgeartifact.r2.RemoveAction <em>Remove Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Remove Action</em>'.
	 * @see org.hl7.knowledgeartifact.r2.RemoveAction
	 * @generated
	 */
	EClass getRemoveAction();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.knowledgeartifact.r2.RemoveAction#getActionSentence <em>Action Sentence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Action Sentence</em>'.
	 * @see org.hl7.knowledgeartifact.r2.RemoveAction#getActionSentence()
	 * @see #getRemoveAction()
	 * @generated
	 */
	EReference getRemoveAction_ActionSentence();

	/**
	 * Returns the meta object for class '{@link org.hl7.knowledgeartifact.r2.RepresentedConceptsType <em>Represented Concepts Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Represented Concepts Type</em>'.
	 * @see org.hl7.knowledgeartifact.r2.RepresentedConceptsType
	 * @generated
	 */
	EClass getRepresentedConceptsType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.hl7.knowledgeartifact.r2.RepresentedConceptsType#getConcept <em>Concept</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Concept</em>'.
	 * @see org.hl7.knowledgeartifact.r2.RepresentedConceptsType#getConcept()
	 * @see #getRepresentedConceptsType()
	 * @generated
	 */
	EReference getRepresentedConceptsType_Concept();

	/**
	 * Returns the meta object for class '{@link org.hl7.knowledgeartifact.r2.RequiredBehavior <em>Required Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Required Behavior</em>'.
	 * @see org.hl7.knowledgeartifact.r2.RequiredBehavior
	 * @generated
	 */
	EClass getRequiredBehavior();

	/**
	 * Returns the meta object for class '{@link org.hl7.knowledgeartifact.r2.ResourceRelationshipReference <em>Resource Relationship Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Relationship Reference</em>'.
	 * @see org.hl7.knowledgeartifact.r2.ResourceRelationshipReference
	 * @generated
	 */
	EClass getResourceRelationshipReference();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.knowledgeartifact.r2.ResourceRelationshipReference#getRelationship <em>Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Relationship</em>'.
	 * @see org.hl7.knowledgeartifact.r2.ResourceRelationshipReference#getRelationship()
	 * @see #getResourceRelationshipReference()
	 * @generated
	 */
	EReference getResourceRelationshipReference_Relationship();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.knowledgeartifact.r2.ResourceRelationshipReference#getResources <em>Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Resources</em>'.
	 * @see org.hl7.knowledgeartifact.r2.ResourceRelationshipReference#getResources()
	 * @see #getResourceRelationshipReference()
	 * @generated
	 */
	EReference getResourceRelationshipReference_Resources();

	/**
	 * Returns the meta object for class '{@link org.hl7.knowledgeartifact.r2.ResourcesType <em>Resources Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resources Type</em>'.
	 * @see org.hl7.knowledgeartifact.r2.ResourcesType
	 * @generated
	 */
	EClass getResourcesType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.hl7.knowledgeartifact.r2.ResourcesType#getResource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resource</em>'.
	 * @see org.hl7.knowledgeartifact.r2.ResourcesType#getResource()
	 * @see #getResourcesType()
	 * @generated
	 */
	EReference getResourcesType_Resource();

	/**
	 * Returns the meta object for class '{@link org.hl7.knowledgeartifact.r2.ResponseBinding <em>Response Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Response Binding</em>'.
	 * @see org.hl7.knowledgeartifact.r2.ResponseBinding
	 * @generated
	 */
	EClass getResponseBinding();

	/**
	 * Returns the meta object for the attribute '{@link org.hl7.knowledgeartifact.r2.ResponseBinding#getContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Container</em>'.
	 * @see org.hl7.knowledgeartifact.r2.ResponseBinding#getContainer()
	 * @see #getResponseBinding()
	 * @generated
	 */
	EAttribute getResponseBinding_Container();

	/**
	 * Returns the meta object for the attribute '{@link org.hl7.knowledgeartifact.r2.ResponseBinding#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Property</em>'.
	 * @see org.hl7.knowledgeartifact.r2.ResponseBinding#getProperty()
	 * @see #getResponseBinding()
	 * @generated
	 */
	EAttribute getResponseBinding_Property();

	/**
	 * Returns the meta object for class '{@link org.hl7.knowledgeartifact.r2.ResponseCardinalityType <em>Response Cardinality Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Response Cardinality Type</em>'.
	 * @see org.hl7.knowledgeartifact.r2.ResponseCardinalityType
	 * @generated
	 */
	EClass getResponseCardinalityType();

	/**
	 * Returns the meta object for the attribute '{@link org.hl7.knowledgeartifact.r2.ResponseCardinalityType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.hl7.knowledgeartifact.r2.ResponseCardinalityType#getValue()
	 * @see #getResponseCardinalityType()
	 * @generated
	 */
	EAttribute getResponseCardinalityType_Value();

	/**
	 * Returns the meta object for class '{@link org.hl7.knowledgeartifact.r2.ResponseDataTypeType <em>Response Data Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Response Data Type Type</em>'.
	 * @see org.hl7.knowledgeartifact.r2.ResponseDataTypeType
	 * @generated
	 */
	EClass getResponseDataTypeType();

	/**
	 * Returns the meta object for the attribute '{@link org.hl7.knowledgeartifact.r2.ResponseDataTypeType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.hl7.knowledgeartifact.r2.ResponseDataTypeType#getValue()
	 * @see #getResponseDataTypeType()
	 * @generated
	 */
	EAttribute getResponseDataTypeType_Value();

	/**
	 * Returns the meta object for class '{@link org.hl7.knowledgeartifact.r2.RightsDeclaration <em>Rights Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rights Declaration</em>'.
	 * @see org.hl7.knowledgeartifact.r2.RightsDeclaration
	 * @generated
	 */
	EClass getRightsDeclaration();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.knowledgeartifact.r2.RightsDeclaration#getAssertedRights <em>Asserted Rights</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Asserted Rights</em>'.
	 * @see org.hl7.knowledgeartifact.r2.RightsDeclaration#getAssertedRights()
	 * @see #getRightsDeclaration()
	 * @generated
	 */
	EReference getRightsDeclaration_AssertedRights();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.knowledgeartifact.r2.RightsDeclaration#getRightsHolder <em>Rights Holder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rights Holder</em>'.
	 * @see org.hl7.knowledgeartifact.r2.RightsDeclaration#getRightsHolder()
	 * @see #getRightsDeclaration()
	 * @generated
	 */
	EReference getRightsDeclaration_RightsHolder();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.knowledgeartifact.r2.RightsDeclaration#getPermissions <em>Permissions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Permissions</em>'.
	 * @see org.hl7.knowledgeartifact.r2.RightsDeclaration#getPermissions()
	 * @see #getRightsDeclaration()
	 * @generated
	 */
	EReference getRightsDeclaration_Permissions();

	/**
	 * Returns the meta object for class '{@link org.hl7.knowledgeartifact.r2.RoleType <em>Role Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role Type</em>'.
	 * @see org.hl7.knowledgeartifact.r2.RoleType
	 * @generated
	 */
	EClass getRoleType();

	/**
	 * Returns the meta object for the attribute '{@link org.hl7.knowledgeartifact.r2.RoleType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.hl7.knowledgeartifact.r2.RoleType#getValue()
	 * @see #getRoleType()
	 * @generated
	 */
	EAttribute getRoleType_Value();

	/**
	 * Returns the meta object for class '{@link org.hl7.knowledgeartifact.r2.SpecificEventBinding <em>Specific Event Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Specific Event Binding</em>'.
	 * @see org.hl7.knowledgeartifact.r2.SpecificEventBinding
	 * @generated
	 */
	EClass getSpecificEventBinding();

	/**
	 * Returns the meta object for the attribute list '{@link org.hl7.knowledgeartifact.r2.SpecificEventBinding#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.hl7.knowledgeartifact.r2.SpecificEventBinding#getGroup()
	 * @see #getSpecificEventBinding()
	 * @generated
	 */
	EAttribute getSpecificEventBinding_Group();

	/**
	 * Returns the meta object for the attribute list '{@link org.hl7.knowledgeartifact.r2.SpecificEventBinding#getContainerEvent <em>Container Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Container Event</em>'.
	 * @see org.hl7.knowledgeartifact.r2.SpecificEventBinding#getContainerEvent()
	 * @see #getSpecificEventBinding()
	 * @generated
	 */
	EAttribute getSpecificEventBinding_ContainerEvent();

	/**
	 * Returns the meta object for the containment reference list '{@link org.hl7.knowledgeartifact.r2.SpecificEventBinding#getEventBindingType <em>Event Binding Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Event Binding Type</em>'.
	 * @see org.hl7.knowledgeartifact.r2.SpecificEventBinding#getEventBindingType()
	 * @see #getSpecificEventBinding()
	 * @generated
	 */
	EReference getSpecificEventBinding_EventBindingType();

	/**
	 * Returns the meta object for the attribute list '{@link org.hl7.knowledgeartifact.r2.SpecificEventBinding#getComponentEvent <em>Component Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Component Event</em>'.
	 * @see org.hl7.knowledgeartifact.r2.SpecificEventBinding#getComponentEvent()
	 * @see #getSpecificEventBinding()
	 * @generated
	 */
	EAttribute getSpecificEventBinding_ComponentEvent();

	/**
	 * Returns the meta object for the containment reference list '{@link org.hl7.knowledgeartifact.r2.SpecificEventBinding#getMutability <em>Mutability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Mutability</em>'.
	 * @see org.hl7.knowledgeartifact.r2.SpecificEventBinding#getMutability()
	 * @see #getSpecificEventBinding()
	 * @generated
	 */
	EReference getSpecificEventBinding_Mutability();

	/**
	 * Returns the meta object for class '{@link org.hl7.knowledgeartifact.r2.SpecificMetadataBinding <em>Specific Metadata Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Specific Metadata Binding</em>'.
	 * @see org.hl7.knowledgeartifact.r2.SpecificMetadataBinding
	 * @generated
	 */
	EClass getSpecificMetadataBinding();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.knowledgeartifact.r2.SpecificMetadataBinding#getBindingType <em>Binding Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Binding Type</em>'.
	 * @see org.hl7.knowledgeartifact.r2.SpecificMetadataBinding#getBindingType()
	 * @see #getSpecificMetadataBinding()
	 * @generated
	 */
	EReference getSpecificMetadataBinding_BindingType();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.knowledgeartifact.r2.SpecificMetadataBinding#getMetadata <em>Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Metadata</em>'.
	 * @see org.hl7.knowledgeartifact.r2.SpecificMetadataBinding#getMetadata()
	 * @see #getSpecificMetadataBinding()
	 * @generated
	 */
	EReference getSpecificMetadataBinding_Metadata();

	/**
	 * Returns the meta object for class '{@link org.hl7.knowledgeartifact.r2.StatusType <em>Status Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Status Type</em>'.
	 * @see org.hl7.knowledgeartifact.r2.StatusType
	 * @generated
	 */
	EClass getStatusType();

	/**
	 * Returns the meta object for the attribute '{@link org.hl7.knowledgeartifact.r2.StatusType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.hl7.knowledgeartifact.r2.StatusType#getValue()
	 * @see #getStatusType()
	 * @generated
	 */
	EAttribute getStatusType_Value();

	/**
	 * Returns the meta object for class '{@link org.hl7.knowledgeartifact.r2.SubElementsType <em>Sub Elements Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sub Elements Type</em>'.
	 * @see org.hl7.knowledgeartifact.r2.SubElementsType
	 * @generated
	 */
	EClass getSubElementsType();

	/**
	 * Returns the meta object for the attribute list '{@link org.hl7.knowledgeartifact.r2.SubElementsType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.hl7.knowledgeartifact.r2.SubElementsType#getGroup()
	 * @see #getSubElementsType()
	 * @generated
	 */
	EAttribute getSubElementsType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.hl7.knowledgeartifact.r2.SubElementsType#getSimpleAction <em>Simple Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Simple Action</em>'.
	 * @see org.hl7.knowledgeartifact.r2.SubElementsType#getSimpleAction()
	 * @see #getSubElementsType()
	 * @generated
	 */
	EReference getSubElementsType_SimpleAction();

	/**
	 * Returns the meta object for the containment reference list '{@link org.hl7.knowledgeartifact.r2.SubElementsType#getActionGroup <em>Action Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Action Group</em>'.
	 * @see org.hl7.knowledgeartifact.r2.SubElementsType#getActionGroup()
	 * @see #getSubElementsType()
	 * @generated
	 */
	EReference getSubElementsType_ActionGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link org.hl7.knowledgeartifact.r2.SubElementsType#getActionRef <em>Action Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Action Ref</em>'.
	 * @see org.hl7.knowledgeartifact.r2.SubElementsType#getActionRef()
	 * @see #getSubElementsType()
	 * @generated
	 */
	EReference getSubElementsType_ActionRef();

	/**
	 * Returns the meta object for class '{@link org.hl7.knowledgeartifact.r2.SupportingEvidence <em>Supporting Evidence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Supporting Evidence</em>'.
	 * @see org.hl7.knowledgeartifact.r2.SupportingEvidence
	 * @generated
	 */
	EClass getSupportingEvidence();

	/**
	 * Returns the meta object for the containment reference list '{@link org.hl7.knowledgeartifact.r2.SupportingEvidence#getEvidence <em>Evidence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Evidence</em>'.
	 * @see org.hl7.knowledgeartifact.r2.SupportingEvidence#getEvidence()
	 * @see #getSupportingEvidence()
	 * @generated
	 */
	EReference getSupportingEvidence_Evidence();

	/**
	 * Returns the meta object for class '{@link org.hl7.knowledgeartifact.r2.SupportingResource <em>Supporting Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Supporting Resource</em>'.
	 * @see org.hl7.knowledgeartifact.r2.SupportingResource
	 * @generated
	 */
	EClass getSupportingResource();

	/**
	 * Returns the meta object for the containment reference list '{@link org.hl7.knowledgeartifact.r2.SupportingResource#getResource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resource</em>'.
	 * @see org.hl7.knowledgeartifact.r2.SupportingResource#getResource()
	 * @see #getSupportingResource()
	 * @generated
	 */
	EReference getSupportingResource_Resource();

	/**
	 * Returns the meta object for class '{@link org.hl7.knowledgeartifact.r2.TemplateIdsType <em>Template Ids Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Template Ids Type</em>'.
	 * @see org.hl7.knowledgeartifact.r2.TemplateIdsType
	 * @generated
	 */
	EClass getTemplateIdsType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.hl7.knowledgeartifact.r2.TemplateIdsType#getTemplateId <em>Template Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Template Id</em>'.
	 * @see org.hl7.knowledgeartifact.r2.TemplateIdsType#getTemplateId()
	 * @see #getTemplateIdsType()
	 * @generated
	 */
	EReference getTemplateIdsType_TemplateId();

	/**
	 * Returns the meta object for class '{@link org.hl7.knowledgeartifact.r2.TemplateIdsType1 <em>Template Ids Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Template Ids Type1</em>'.
	 * @see org.hl7.knowledgeartifact.r2.TemplateIdsType1
	 * @generated
	 */
	EClass getTemplateIdsType1();

	/**
	 * Returns the meta object for the containment reference list '{@link org.hl7.knowledgeartifact.r2.TemplateIdsType1#getTemplateId <em>Template Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Template Id</em>'.
	 * @see org.hl7.knowledgeartifact.r2.TemplateIdsType1#getTemplateId()
	 * @see #getTemplateIdsType1()
	 * @generated
	 */
	EReference getTemplateIdsType1_TemplateId();

	/**
	 * Returns the meta object for class '{@link org.hl7.knowledgeartifact.r2.Trigger <em>Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trigger</em>'.
	 * @see org.hl7.knowledgeartifact.r2.Trigger
	 * @generated
	 */
	EClass getTrigger();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.knowledgeartifact.r2.Trigger#getDef <em>Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Def</em>'.
	 * @see org.hl7.knowledgeartifact.r2.Trigger#getDef()
	 * @see #getTrigger()
	 * @generated
	 */
	EReference getTrigger_Def();

	/**
	 * Returns the meta object for the containment reference list '{@link org.hl7.knowledgeartifact.r2.Trigger#getIdentifiers <em>Identifiers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Identifiers</em>'.
	 * @see org.hl7.knowledgeartifact.r2.Trigger#getIdentifiers()
	 * @see #getTrigger()
	 * @generated
	 */
	EReference getTrigger_Identifiers();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.knowledgeartifact.r2.Trigger#getTextEquivalent <em>Text Equivalent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Text Equivalent</em>'.
	 * @see org.hl7.knowledgeartifact.r2.Trigger#getTextEquivalent()
	 * @see #getTrigger()
	 * @generated
	 */
	EReference getTrigger_TextEquivalent();

	/**
	 * Returns the meta object for class '{@link org.hl7.knowledgeartifact.r2.TriggerBindings <em>Trigger Bindings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trigger Bindings</em>'.
	 * @see org.hl7.knowledgeartifact.r2.TriggerBindings
	 * @generated
	 */
	EClass getTriggerBindings();

	/**
	 * Returns the meta object for the attribute list '{@link org.hl7.knowledgeartifact.r2.TriggerBindings#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.hl7.knowledgeartifact.r2.TriggerBindings#getGroup()
	 * @see #getTriggerBindings()
	 * @generated
	 */
	EAttribute getTriggerBindings_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.hl7.knowledgeartifact.r2.TriggerBindings#getTrigger <em>Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Trigger</em>'.
	 * @see org.hl7.knowledgeartifact.r2.TriggerBindings#getTrigger()
	 * @see #getTriggerBindings()
	 * @generated
	 */
	EReference getTriggerBindings_Trigger();

	/**
	 * Returns the meta object for class '{@link org.hl7.knowledgeartifact.r2.Triggers <em>Triggers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Triggers</em>'.
	 * @see org.hl7.knowledgeartifact.r2.Triggers
	 * @generated
	 */
	EClass getTriggers();

	/**
	 * Returns the meta object for the containment reference list '{@link org.hl7.knowledgeartifact.r2.Triggers#getTrigger <em>Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Trigger</em>'.
	 * @see org.hl7.knowledgeartifact.r2.Triggers#getTrigger()
	 * @see #getTriggers()
	 * @generated
	 */
	EReference getTriggers_Trigger();

	/**
	 * Returns the meta object for class '{@link org.hl7.knowledgeartifact.r2.UpdateAction <em>Update Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Update Action</em>'.
	 * @see org.hl7.knowledgeartifact.r2.UpdateAction
	 * @generated
	 */
	EClass getUpdateAction();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.knowledgeartifact.r2.UpdateAction#getActionSentence <em>Action Sentence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Action Sentence</em>'.
	 * @see org.hl7.knowledgeartifact.r2.UpdateAction#getActionSentence()
	 * @see #getUpdateAction()
	 * @generated
	 */
	EReference getUpdateAction_ActionSentence();

	/**
	 * Returns the meta object for class '{@link org.hl7.knowledgeartifact.r2.UrlType <em>Url Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Url Type</em>'.
	 * @see org.hl7.knowledgeartifact.r2.UrlType
	 * @generated
	 */
	EClass getUrlType();

	/**
	 * Returns the meta object for the attribute '{@link org.hl7.knowledgeartifact.r2.UrlType#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Address</em>'.
	 * @see org.hl7.knowledgeartifact.r2.UrlType#getAddress()
	 * @see #getUrlType()
	 * @generated
	 */
	EAttribute getUrlType_Address();

	/**
	 * Returns the meta object for class '{@link org.hl7.knowledgeartifact.r2.UsageTermsType <em>Usage Terms Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Usage Terms Type</em>'.
	 * @see org.hl7.knowledgeartifact.r2.UsageTermsType
	 * @generated
	 */
	EClass getUsageTermsType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.hl7.knowledgeartifact.r2.UsageTermsType#getRightsDeclaration <em>Rights Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rights Declaration</em>'.
	 * @see org.hl7.knowledgeartifact.r2.UsageTermsType#getRightsDeclaration()
	 * @see #getUsageTermsType()
	 * @generated
	 */
	EReference getUsageTermsType_RightsDeclaration();

	/**
	 * Returns the meta object for class '{@link org.hl7.knowledgeartifact.r2.UuidType <em>Uuid Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Uuid Type</em>'.
	 * @see org.hl7.knowledgeartifact.r2.UuidType
	 * @generated
	 */
	EClass getUuidType();

	/**
	 * Returns the meta object for the attribute '{@link org.hl7.knowledgeartifact.r2.UuidType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.hl7.knowledgeartifact.r2.UuidType#getValue()
	 * @see #getUuidType()
	 * @generated
	 */
	EAttribute getUuidType_Value();

	/**
	 * Returns the meta object for class '{@link org.hl7.knowledgeartifact.r2.ValueSetConstraint <em>Value Set Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value Set Constraint</em>'.
	 * @see org.hl7.knowledgeartifact.r2.ValueSetConstraint
	 * @generated
	 */
	EClass getValueSetConstraint();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.knowledgeartifact.r2.ValueSetConstraint#getValueSet <em>Value Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value Set</em>'.
	 * @see org.hl7.knowledgeartifact.r2.ValueSetConstraint#getValueSet()
	 * @see #getValueSetConstraint()
	 * @generated
	 */
	EReference getValueSetConstraint_ValueSet();

	/**
	 * Returns the meta object for class '{@link org.hl7.knowledgeartifact.r2.VersionedIdentifier <em>Versioned Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Versioned Identifier</em>'.
	 * @see org.hl7.knowledgeartifact.r2.VersionedIdentifier
	 * @generated
	 */
	EClass getVersionedIdentifier();

	/**
	 * Returns the meta object for the attribute '{@link org.hl7.knowledgeartifact.r2.VersionedIdentifier#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see org.hl7.knowledgeartifact.r2.VersionedIdentifier#getVersion()
	 * @see #getVersionedIdentifier()
	 * @generated
	 */
	EAttribute getVersionedIdentifier_Version();

	/**
	 * Returns the meta object for class '{@link org.hl7.knowledgeartifact.r2.VisualStyleBehavior <em>Visual Style Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Visual Style Behavior</em>'.
	 * @see org.hl7.knowledgeartifact.r2.VisualStyleBehavior
	 * @generated
	 */
	EClass getVisualStyleBehavior();

	/**
	 * Returns the meta object for class '{@link org.hl7.knowledgeartifact.r2.WrappedContent <em>Wrapped Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Wrapped Content</em>'.
	 * @see org.hl7.knowledgeartifact.r2.WrappedContent
	 * @generated
	 */
	EClass getWrappedContent();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.knowledgeartifact.r2.WrappedContent#getContentSignifier <em>Content Signifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Content Signifier</em>'.
	 * @see org.hl7.knowledgeartifact.r2.WrappedContent#getContentSignifier()
	 * @see #getWrappedContent()
	 * @generated
	 */
	EReference getWrappedContent_ContentSignifier();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.knowledgeartifact.r2.WrappedContent#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Content</em>'.
	 * @see org.hl7.knowledgeartifact.r2.WrappedContent#getContent()
	 * @see #getWrappedContent()
	 * @generated
	 */
	EReference getWrappedContent_Content();

	/**
	 * Returns the meta object for enum '{@link org.hl7.knowledgeartifact.r2.ArtifactLifeCycleEventType <em>Artifact Life Cycle Event Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Artifact Life Cycle Event Type</em>'.
	 * @see org.hl7.knowledgeartifact.r2.ArtifactLifeCycleEventType
	 * @generated
	 */
	EEnum getArtifactLifeCycleEventType();

	/**
	 * Returns the meta object for enum '{@link org.hl7.knowledgeartifact.r2.ArtifactStatusType <em>Artifact Status Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Artifact Status Type</em>'.
	 * @see org.hl7.knowledgeartifact.r2.ArtifactStatusType
	 * @generated
	 */
	EEnum getArtifactStatusType();

	/**
	 * Returns the meta object for enum '{@link org.hl7.knowledgeartifact.r2.ArtifactType <em>Artifact Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Artifact Type</em>'.
	 * @see org.hl7.knowledgeartifact.r2.ArtifactType
	 * @generated
	 */
	EEnum getArtifactType();

	/**
	 * Returns the meta object for enum '{@link org.hl7.knowledgeartifact.r2.Cardinality <em>Cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Cardinality</em>'.
	 * @see org.hl7.knowledgeartifact.r2.Cardinality
	 * @generated
	 */
	EEnum getCardinality();

	/**
	 * Returns the meta object for enum '{@link org.hl7.knowledgeartifact.r2.CardinalityBehaviorType <em>Cardinality Behavior Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Cardinality Behavior Type</em>'.
	 * @see org.hl7.knowledgeartifact.r2.CardinalityBehaviorType
	 * @generated
	 */
	EEnum getCardinalityBehaviorType();

	/**
	 * Returns the meta object for enum '{@link org.hl7.knowledgeartifact.r2.CompondArtifactType <em>Compond Artifact Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Compond Artifact Type</em>'.
	 * @see org.hl7.knowledgeartifact.r2.CompondArtifactType
	 * @generated
	 */
	EEnum getCompondArtifactType();

	/**
	 * Returns the meta object for enum '{@link org.hl7.knowledgeartifact.r2.ConditionRoleType <em>Condition Role Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Condition Role Type</em>'.
	 * @see org.hl7.knowledgeartifact.r2.ConditionRoleType
	 * @generated
	 */
	EEnum getConditionRoleType();

	/**
	 * Returns the meta object for enum '{@link org.hl7.knowledgeartifact.r2.ContributorType <em>Contributor Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Contributor Type</em>'.
	 * @see org.hl7.knowledgeartifact.r2.ContributorType
	 * @generated
	 */
	EEnum getContributorType();

	/**
	 * Returns the meta object for enum '{@link org.hl7.knowledgeartifact.r2.CoverageType <em>Coverage Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Coverage Type</em>'.
	 * @see org.hl7.knowledgeartifact.r2.CoverageType
	 * @generated
	 */
	EEnum getCoverageType();

	/**
	 * Returns the meta object for enum '{@link org.hl7.knowledgeartifact.r2.DataEventType <em>Data Event Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Data Event Type</em>'.
	 * @see org.hl7.knowledgeartifact.r2.DataEventType
	 * @generated
	 */
	EEnum getDataEventType();

	/**
	 * Returns the meta object for enum '{@link org.hl7.knowledgeartifact.r2.EventType <em>Event Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Event Type</em>'.
	 * @see org.hl7.knowledgeartifact.r2.EventType
	 * @generated
	 */
	EEnum getEventType();

	/**
	 * Returns the meta object for enum '{@link org.hl7.knowledgeartifact.r2.GroupOrganizationBehaviorType <em>Group Organization Behavior Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Group Organization Behavior Type</em>'.
	 * @see org.hl7.knowledgeartifact.r2.GroupOrganizationBehaviorType
	 * @generated
	 */
	EEnum getGroupOrganizationBehaviorType();

	/**
	 * Returns the meta object for enum '{@link org.hl7.knowledgeartifact.r2.GroupSelectionBehaviorType <em>Group Selection Behavior Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Group Selection Behavior Type</em>'.
	 * @see org.hl7.knowledgeartifact.r2.GroupSelectionBehaviorType
	 * @generated
	 */
	EEnum getGroupSelectionBehaviorType();

	/**
	 * Returns the meta object for enum '{@link org.hl7.knowledgeartifact.r2.MetadataBindingType <em>Metadata Binding Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Metadata Binding Type</em>'.
	 * @see org.hl7.knowledgeartifact.r2.MetadataBindingType
	 * @generated
	 */
	EEnum getMetadataBindingType();

	/**
	 * Returns the meta object for enum '{@link org.hl7.knowledgeartifact.r2.PrecheckBehaviorType <em>Precheck Behavior Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Precheck Behavior Type</em>'.
	 * @see org.hl7.knowledgeartifact.r2.PrecheckBehaviorType
	 * @generated
	 */
	EEnum getPrecheckBehaviorType();

	/**
	 * Returns the meta object for enum '{@link org.hl7.knowledgeartifact.r2.RangeConstraintType <em>Range Constraint Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Range Constraint Type</em>'.
	 * @see org.hl7.knowledgeartifact.r2.RangeConstraintType
	 * @generated
	 */
	EEnum getRangeConstraintType();

	/**
	 * Returns the meta object for enum '{@link org.hl7.knowledgeartifact.r2.RequiredBehaviorType <em>Required Behavior Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Required Behavior Type</em>'.
	 * @see org.hl7.knowledgeartifact.r2.RequiredBehaviorType
	 * @generated
	 */
	EEnum getRequiredBehaviorType();

	/**
	 * Returns the meta object for enum '{@link org.hl7.knowledgeartifact.r2.ResourceRelationshipType <em>Resource Relationship Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Resource Relationship Type</em>'.
	 * @see org.hl7.knowledgeartifact.r2.ResourceRelationshipType
	 * @generated
	 */
	EEnum getResourceRelationshipType();

	/**
	 * Returns the meta object for enum '{@link org.hl7.knowledgeartifact.r2.ValueType <em>Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Value Type</em>'.
	 * @see org.hl7.knowledgeartifact.r2.ValueType
	 * @generated
	 */
	EEnum getValueType();

	/**
	 * Returns the meta object for data type '{@link org.hl7.knowledgeartifact.r2.ArtifactLifeCycleEventType <em>Artifact Life Cycle Event Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Artifact Life Cycle Event Type Object</em>'.
	 * @see org.hl7.knowledgeartifact.r2.ArtifactLifeCycleEventType
	 * @model instanceClass="org.hl7.knowledgeartifact.r2.ArtifactLifeCycleEventType"
	 *        extendedMetaData="name='ArtifactLifeCycleEventType:Object' baseType='ArtifactLifeCycleEventType'"
	 * @generated
	 */
	EDataType getArtifactLifeCycleEventTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.hl7.knowledgeartifact.r2.ArtifactStatusType <em>Artifact Status Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Artifact Status Type Object</em>'.
	 * @see org.hl7.knowledgeartifact.r2.ArtifactStatusType
	 * @model instanceClass="org.hl7.knowledgeartifact.r2.ArtifactStatusType"
	 *        extendedMetaData="name='ArtifactStatusType:Object' baseType='ArtifactStatusType'"
	 * @generated
	 */
	EDataType getArtifactStatusTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.hl7.knowledgeartifact.r2.ArtifactType <em>Artifact Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Artifact Type Object</em>'.
	 * @see org.hl7.knowledgeartifact.r2.ArtifactType
	 * @model instanceClass="org.hl7.knowledgeartifact.r2.ArtifactType"
	 *        extendedMetaData="name='ArtifactType:Object' baseType='ArtifactType'"
	 * @generated
	 */
	EDataType getArtifactTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.hl7.knowledgeartifact.r2.CardinalityBehaviorType <em>Cardinality Behavior Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Cardinality Behavior Type Object</em>'.
	 * @see org.hl7.knowledgeartifact.r2.CardinalityBehaviorType
	 * @model instanceClass="org.hl7.knowledgeartifact.r2.CardinalityBehaviorType"
	 *        extendedMetaData="name='CardinalityBehaviorType:Object' baseType='CardinalityBehaviorType'"
	 * @generated
	 */
	EDataType getCardinalityBehaviorTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.hl7.knowledgeartifact.r2.Cardinality <em>Cardinality Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Cardinality Object</em>'.
	 * @see org.hl7.knowledgeartifact.r2.Cardinality
	 * @model instanceClass="org.hl7.knowledgeartifact.r2.Cardinality"
	 *        extendedMetaData="name='Cardinality:Object' baseType='Cardinality'"
	 * @generated
	 */
	EDataType getCardinalityObject();

	/**
	 * Returns the meta object for data type '{@link org.hl7.knowledgeartifact.r2.CompondArtifactType <em>Compond Artifact Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Compond Artifact Type Object</em>'.
	 * @see org.hl7.knowledgeartifact.r2.CompondArtifactType
	 * @model instanceClass="org.hl7.knowledgeartifact.r2.CompondArtifactType"
	 *        extendedMetaData="name='CompondArtifactType:Object' baseType='CompondArtifactType'"
	 * @generated
	 */
	EDataType getCompondArtifactTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.hl7.knowledgeartifact.r2.ConditionRoleType <em>Condition Role Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Condition Role Type Object</em>'.
	 * @see org.hl7.knowledgeartifact.r2.ConditionRoleType
	 * @model instanceClass="org.hl7.knowledgeartifact.r2.ConditionRoleType"
	 *        extendedMetaData="name='ConditionRoleType:Object' baseType='ConditionRoleType'"
	 * @generated
	 */
	EDataType getConditionRoleTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.hl7.knowledgeartifact.r2.ContributorType <em>Contributor Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Contributor Type Object</em>'.
	 * @see org.hl7.knowledgeartifact.r2.ContributorType
	 * @model instanceClass="org.hl7.knowledgeartifact.r2.ContributorType"
	 *        extendedMetaData="name='ContributorType:Object' baseType='ContributorType'"
	 * @generated
	 */
	EDataType getContributorTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.hl7.knowledgeartifact.r2.CoverageType <em>Coverage Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Coverage Type Object</em>'.
	 * @see org.hl7.knowledgeartifact.r2.CoverageType
	 * @model instanceClass="org.hl7.knowledgeartifact.r2.CoverageType"
	 *        extendedMetaData="name='CoverageType:Object' baseType='CoverageType'"
	 * @generated
	 */
	EDataType getCoverageTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.hl7.knowledgeartifact.r2.DataEventType <em>Data Event Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Data Event Type Object</em>'.
	 * @see org.hl7.knowledgeartifact.r2.DataEventType
	 * @model instanceClass="org.hl7.knowledgeartifact.r2.DataEventType"
	 *        extendedMetaData="name='DataEventType:Object' baseType='DataEventType'"
	 * @generated
	 */
	EDataType getDataEventTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.hl7.knowledgeartifact.r2.EventType <em>Event Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Event Type Object</em>'.
	 * @see org.hl7.knowledgeartifact.r2.EventType
	 * @model instanceClass="org.hl7.knowledgeartifact.r2.EventType"
	 *        extendedMetaData="name='EventType:Object' baseType='EventType'"
	 * @generated
	 */
	EDataType getEventTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.hl7.knowledgeartifact.r2.GroupOrganizationBehaviorType <em>Group Organization Behavior Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Group Organization Behavior Type Object</em>'.
	 * @see org.hl7.knowledgeartifact.r2.GroupOrganizationBehaviorType
	 * @model instanceClass="org.hl7.knowledgeartifact.r2.GroupOrganizationBehaviorType"
	 *        extendedMetaData="name='GroupOrganizationBehaviorType:Object' baseType='GroupOrganizationBehaviorType'"
	 * @generated
	 */
	EDataType getGroupOrganizationBehaviorTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.hl7.knowledgeartifact.r2.GroupSelectionBehaviorType <em>Group Selection Behavior Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Group Selection Behavior Type Object</em>'.
	 * @see org.hl7.knowledgeartifact.r2.GroupSelectionBehaviorType
	 * @model instanceClass="org.hl7.knowledgeartifact.r2.GroupSelectionBehaviorType"
	 *        extendedMetaData="name='GroupSelectionBehaviorType:Object' baseType='GroupSelectionBehaviorType'"
	 * @generated
	 */
	EDataType getGroupSelectionBehaviorTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.hl7.knowledgeartifact.r2.MetadataBindingType <em>Metadata Binding Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Metadata Binding Type Object</em>'.
	 * @see org.hl7.knowledgeartifact.r2.MetadataBindingType
	 * @model instanceClass="org.hl7.knowledgeartifact.r2.MetadataBindingType"
	 *        extendedMetaData="name='MetadataBindingType:Object' baseType='MetadataBindingType'"
	 * @generated
	 */
	EDataType getMetadataBindingTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.hl7.knowledgeartifact.r2.PrecheckBehaviorType <em>Precheck Behavior Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Precheck Behavior Type Object</em>'.
	 * @see org.hl7.knowledgeartifact.r2.PrecheckBehaviorType
	 * @model instanceClass="org.hl7.knowledgeartifact.r2.PrecheckBehaviorType"
	 *        extendedMetaData="name='PrecheckBehaviorType:Object' baseType='PrecheckBehaviorType'"
	 * @generated
	 */
	EDataType getPrecheckBehaviorTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.hl7.knowledgeartifact.r2.RangeConstraintType <em>Range Constraint Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Range Constraint Type Object</em>'.
	 * @see org.hl7.knowledgeartifact.r2.RangeConstraintType
	 * @model instanceClass="org.hl7.knowledgeartifact.r2.RangeConstraintType"
	 *        extendedMetaData="name='RangeConstraintType:Object' baseType='RangeConstraintType'"
	 * @generated
	 */
	EDataType getRangeConstraintTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.hl7.knowledgeartifact.r2.RequiredBehaviorType <em>Required Behavior Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Required Behavior Type Object</em>'.
	 * @see org.hl7.knowledgeartifact.r2.RequiredBehaviorType
	 * @model instanceClass="org.hl7.knowledgeartifact.r2.RequiredBehaviorType"
	 *        extendedMetaData="name='RequiredBehaviorType:Object' baseType='RequiredBehaviorType'"
	 * @generated
	 */
	EDataType getRequiredBehaviorTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.hl7.knowledgeartifact.r2.ResourceRelationshipType <em>Resource Relationship Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Resource Relationship Type Object</em>'.
	 * @see org.hl7.knowledgeartifact.r2.ResourceRelationshipType
	 * @model instanceClass="org.hl7.knowledgeartifact.r2.ResourceRelationshipType"
	 *        extendedMetaData="name='ResourceRelationshipType:Object' baseType='ResourceRelationshipType'"
	 * @generated
	 */
	EDataType getResourceRelationshipTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.hl7.knowledgeartifact.r2.ValueType <em>Value Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Value Type Object</em>'.
	 * @see org.hl7.knowledgeartifact.r2.ValueType
	 * @model instanceClass="org.hl7.knowledgeartifact.r2.ValueType"
	 *        extendedMetaData="name='ValueType:Object' baseType='ValueType'"
	 * @generated
	 */
	EDataType getValueTypeObject();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	R2Factory getR2Factory();

} //R2Package
