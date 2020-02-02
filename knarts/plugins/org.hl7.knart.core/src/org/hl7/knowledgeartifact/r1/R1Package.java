/**
 */
package org.hl7.knowledgeartifact.r1;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.hl7.cdsdt.r2.R2Package;

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
 * <!-- end-model-doc -->
 * @see org.hl7.knowledgeartifact.r1.R1Factory
 * @model kind="package"
 * @generated
 */
public interface R1Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "r1";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "urn:hl7-org:knowledgeartifact:r1";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "r1";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	R1Package eINSTANCE = org.hl7.knowledgeartifact.r1.impl.R1PackageImpl.init();

	/**
	 * The meta object id for the '{@link org.hl7.knowledgeartifact.r1.impl.ActionBaseImpl <em>Action Base</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r1.impl.ActionBaseImpl
	 * @see org.hl7.knowledgeartifact.r1.impl.R1PackageImpl#getActionBase()
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
	 * The meta object id for the '{@link org.hl7.knowledgeartifact.r1.impl.ActionGroupImpl <em>Action Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r1.impl.ActionGroupImpl
	 * @see org.hl7.knowledgeartifact.r1.impl.R1PackageImpl#getActionGroup()
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
	 * The meta object id for the '{@link org.hl7.knowledgeartifact.r1.impl.ActionRefImpl <em>Action Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r1.impl.ActionRefImpl
	 * @see org.hl7.knowledgeartifact.r1.impl.R1PackageImpl#getActionRef()
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
	 * The meta object id for the '{@link org.hl7.knowledgeartifact.r1.impl.ActorImpl <em>Actor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r1.impl.ActorImpl
	 * @see org.hl7.knowledgeartifact.r1.impl.R1PackageImpl#getActor()
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
	 * The meta object id for the '{@link org.hl7.knowledgeartifact.r1.impl.ActorsTypeImpl <em>Actors Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r1.impl.ActorsTypeImpl
	 * @see org.hl7.knowledgeartifact.r1.impl.R1PackageImpl#getActorsType()
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
	 * The meta object id for the '{@link org.hl7.knowledgeartifact.r1.impl.AddressesTypeImpl <em>Addresses Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r1.impl.AddressesTypeImpl
	 * @see org.hl7.knowledgeartifact.r1.impl.R1PackageImpl#getAddressesType()
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
	 * The meta object id for the '{@link org.hl7.knowledgeartifact.r1.impl.ApplicabilityTypeImpl <em>Applicability Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r1.impl.ApplicabilityTypeImpl
	 * @see org.hl7.knowledgeartifact.r1.impl.R1PackageImpl#getApplicabilityType()
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
	 * The meta object id for the '{@link org.hl7.knowledgeartifact.r1.impl.ArtifactLifeCycleEventImpl <em>Artifact Life Cycle Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r1.impl.ArtifactLifeCycleEventImpl
	 * @see org.hl7.knowledgeartifact.r1.impl.R1PackageImpl#getArtifactLifeCycleEvent()
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
	 * The meta object id for the '{@link org.hl7.knowledgeartifact.r1.impl.ArtifactTypeTypeImpl <em>Artifact Type Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r1.impl.ArtifactTypeTypeImpl
	 * @see org.hl7.knowledgeartifact.r1.impl.R1PackageImpl#getArtifactTypeType()
	 * @generated
	 */
	int ARTIFACT_TYPE_TYPE = 8;

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
	 * The meta object id for the '{@link org.hl7.knowledgeartifact.r1.impl.AtomicActionImpl <em>Atomic Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r1.impl.AtomicActionImpl
	 * @see org.hl7.knowledgeartifact.r1.impl.R1PackageImpl#getAtomicAction()
	 * @generated
	 */
	int ATOMIC_ACTION = 9;

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
	 * The meta object id for the '{@link org.hl7.knowledgeartifact.r1.impl.BehaviorImpl <em>Behavior</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r1.impl.BehaviorImpl
	 * @see org.hl7.knowledgeartifact.r1.impl.R1PackageImpl#getBehavior()
	 * @generated
	 */
	int BEHAVIOR = 10;

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
	 * The meta object id for the '{@link org.hl7.knowledgeartifact.r1.impl.BehaviorsImpl <em>Behaviors</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r1.impl.BehaviorsImpl
	 * @see org.hl7.knowledgeartifact.r1.impl.R1PackageImpl#getBehaviors()
	 * @generated
	 */
	int BEHAVIORS = 11;

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
	 * The meta object id for the '{@link org.hl7.knowledgeartifact.r1.impl.CardinalityBehaviorImpl <em>Cardinality Behavior</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r1.impl.CardinalityBehaviorImpl
	 * @see org.hl7.knowledgeartifact.r1.impl.R1PackageImpl#getCardinalityBehavior()
	 * @generated
	 */
	int CARDINALITY_BEHAVIOR = 12;

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
	 * The meta object id for the '{@link org.hl7.knowledgeartifact.r1.impl.CategoriesTypeImpl <em>Categories Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r1.impl.CategoriesTypeImpl
	 * @see org.hl7.knowledgeartifact.r1.impl.R1PackageImpl#getCategoriesType()
	 * @generated
	 */
	int CATEGORIES_TYPE = 13;

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
	 * The meta object id for the '{@link org.hl7.knowledgeartifact.r1.impl.CodesTypeImpl <em>Codes Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r1.impl.CodesTypeImpl
	 * @see org.hl7.knowledgeartifact.r1.impl.R1PackageImpl#getCodesType()
	 * @generated
	 */
	int CODES_TYPE = 14;

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
	 * The meta object id for the '{@link org.hl7.knowledgeartifact.r1.impl.CollectInformationActionImpl <em>Collect Information Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r1.impl.CollectInformationActionImpl
	 * @see org.hl7.knowledgeartifact.r1.impl.R1PackageImpl#getCollectInformationAction()
	 * @generated
	 */
	int COLLECT_INFORMATION_ACTION = 15;

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
	 * The meta object id for the '{@link org.hl7.knowledgeartifact.r1.impl.ConditionImpl <em>Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r1.impl.ConditionImpl
	 * @see org.hl7.knowledgeartifact.r1.impl.R1PackageImpl#getCondition()
	 * @generated
	 */
	int CONDITION = 16;

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
	 * The meta object id for the '{@link org.hl7.knowledgeartifact.r1.impl.ConditionRoleType1Impl <em>Condition Role Type1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r1.impl.ConditionRoleType1Impl
	 * @see org.hl7.knowledgeartifact.r1.impl.R1PackageImpl#getConditionRoleType1()
	 * @generated
	 */
	int CONDITION_ROLE_TYPE1 = 17;

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
	 * The meta object id for the '{@link org.hl7.knowledgeartifact.r1.impl.ConditionsImpl <em>Conditions</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r1.impl.ConditionsImpl
	 * @see org.hl7.knowledgeartifact.r1.impl.R1PackageImpl#getConditions()
	 * @generated
	 */
	int CONDITIONS = 18;

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
	 * The meta object id for the '{@link org.hl7.knowledgeartifact.r1.impl.ConstraintTypeTypeImpl <em>Constraint Type Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r1.impl.ConstraintTypeTypeImpl
	 * @see org.hl7.knowledgeartifact.r1.impl.R1PackageImpl#getConstraintTypeType()
	 * @generated
	 */
	int CONSTRAINT_TYPE_TYPE = 19;

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
	 * The meta object id for the '{@link org.hl7.knowledgeartifact.r1.impl.ContactsTypeImpl <em>Contacts Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r1.impl.ContactsTypeImpl
	 * @see org.hl7.knowledgeartifact.r1.impl.R1PackageImpl#getContactsType()
	 * @generated
	 */
	int CONTACTS_TYPE = 20;

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
	 * The meta object id for the '{@link org.hl7.knowledgeartifact.r1.impl.ContentTypeImpl <em>Content Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r1.impl.ContentTypeImpl
	 * @see org.hl7.knowledgeartifact.r1.impl.R1PackageImpl#getContentType()
	 * @generated
	 */
	int CONTENT_TYPE = 21;

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
	 * The meta object id for the '{@link org.hl7.knowledgeartifact.r1.impl.ContributionImpl <em>Contribution</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r1.impl.ContributionImpl
	 * @see org.hl7.knowledgeartifact.r1.impl.R1PackageImpl#getContribution()
	 * @generated
	 */
	int CONTRIBUTION = 22;

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
	 * The meta object id for the '{@link org.hl7.knowledgeartifact.r1.impl.ContributionsTypeImpl <em>Contributions Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r1.impl.ContributionsTypeImpl
	 * @see org.hl7.knowledgeartifact.r1.impl.R1PackageImpl#getContributionsType()
	 * @generated
	 */
	int CONTRIBUTIONS_TYPE = 23;

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
	 * The meta object id for the '{@link org.hl7.knowledgeartifact.r1.impl.CoverageImpl <em>Coverage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r1.impl.CoverageImpl
	 * @see org.hl7.knowledgeartifact.r1.impl.R1PackageImpl#getCoverage()
	 * @generated
	 */
	int COVERAGE = 24;

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
	 * The meta object id for the '{@link org.hl7.knowledgeartifact.r1.impl.CreateActionImpl <em>Create Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r1.impl.CreateActionImpl
	 * @see org.hl7.knowledgeartifact.r1.impl.R1PackageImpl#getCreateAction()
	 * @generated
	 */
	int CREATE_ACTION = 25;

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
	 * The meta object id for the '{@link org.hl7.knowledgeartifact.r1.impl.TriggerImpl <em>Trigger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r1.impl.TriggerImpl
	 * @see org.hl7.knowledgeartifact.r1.impl.R1PackageImpl#getTrigger()
	 * @generated
	 */
	int TRIGGER = 88;

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
	 * The meta object id for the '{@link org.hl7.knowledgeartifact.r1.impl.DataEventTriggerImpl <em>Data Event Trigger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r1.impl.DataEventTriggerImpl
	 * @see org.hl7.knowledgeartifact.r1.impl.R1PackageImpl#getDataEventTrigger()
	 * @generated
	 */
	int DATA_EVENT_TRIGGER = 26;

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
	 * The meta object id for the '{@link org.hl7.knowledgeartifact.r1.impl.DataModelsTypeImpl <em>Data Models Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r1.impl.DataModelsTypeImpl
	 * @see org.hl7.knowledgeartifact.r1.impl.R1PackageImpl#getDataModelsType()
	 * @generated
	 */
	int DATA_MODELS_TYPE = 27;

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
	 * The meta object id for the '{@link org.hl7.knowledgeartifact.r1.impl.DeclareResponseActionImpl <em>Declare Response Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r1.impl.DeclareResponseActionImpl
	 * @see org.hl7.knowledgeartifact.r1.impl.R1PackageImpl#getDeclareResponseAction()
	 * @generated
	 */
	int DECLARE_RESPONSE_ACTION = 28;

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
	 * The meta object id for the '{@link org.hl7.knowledgeartifact.r1.impl.ItemDefinitionImpl <em>Item Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r1.impl.ItemDefinitionImpl
	 * @see org.hl7.knowledgeartifact.r1.impl.R1PackageImpl#getItemDefinition()
	 * @generated
	 */
	int ITEM_DEFINITION = 49;

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
	 * The meta object id for the '{@link org.hl7.knowledgeartifact.r1.impl.DocumentationItemImpl <em>Documentation Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r1.impl.DocumentationItemImpl
	 * @see org.hl7.knowledgeartifact.r1.impl.R1PackageImpl#getDocumentationItem()
	 * @generated
	 */
	int DOCUMENTATION_ITEM = 29;

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
	 * The meta object id for the '{@link org.hl7.knowledgeartifact.r1.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r1.impl.DocumentRootImpl
	 * @see org.hl7.knowledgeartifact.r1.impl.R1PackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 30;

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
	 * The feature id for the '<em><b>Knowledge Document</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__KNOWLEDGE_DOCUMENT = 3;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.hl7.knowledgeartifact.r1.impl.RangeConstraintImpl <em>Range Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r1.impl.RangeConstraintImpl
	 * @see org.hl7.knowledgeartifact.r1.impl.R1PackageImpl#getRangeConstraint()
	 * @generated
	 */
	int RANGE_CONSTRAINT = 67;

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
	 * The meta object id for the '{@link org.hl7.knowledgeartifact.r1.impl.EnumerationConstraintImpl <em>Enumeration Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r1.impl.EnumerationConstraintImpl
	 * @see org.hl7.knowledgeartifact.r1.impl.R1PackageImpl#getEnumerationConstraint()
	 * @generated
	 */
	int ENUMERATION_CONSTRAINT = 31;

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
	 * The meta object id for the '{@link org.hl7.knowledgeartifact.r1.impl.EnumerationItemImpl <em>Enumeration Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r1.impl.EnumerationItemImpl
	 * @see org.hl7.knowledgeartifact.r1.impl.R1PackageImpl#getEnumerationItem()
	 * @generated
	 */
	int ENUMERATION_ITEM = 32;

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
	 * The meta object id for the '{@link org.hl7.knowledgeartifact.r1.impl.EventHistoryTypeImpl <em>Event History Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r1.impl.EventHistoryTypeImpl
	 * @see org.hl7.knowledgeartifact.r1.impl.R1PackageImpl#getEventHistoryType()
	 * @generated
	 */
	int EVENT_HISTORY_TYPE = 33;

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
	 * The meta object id for the '{@link org.hl7.knowledgeartifact.r1.impl.EventTypeTypeImpl <em>Event Type Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r1.impl.EventTypeTypeImpl
	 * @see org.hl7.knowledgeartifact.r1.impl.R1PackageImpl#getEventTypeType()
	 * @generated
	 */
	int EVENT_TYPE_TYPE = 34;

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
	 * The meta object id for the '{@link org.hl7.knowledgeartifact.r1.impl.EvidenceImpl <em>Evidence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r1.impl.EvidenceImpl
	 * @see org.hl7.knowledgeartifact.r1.impl.R1PackageImpl#getEvidence()
	 * @generated
	 */
	int EVIDENCE = 35;

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
	 * The meta object id for the '{@link org.hl7.knowledgeartifact.r1.impl.ExpressionConstraintImpl <em>Expression Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r1.impl.ExpressionConstraintImpl
	 * @see org.hl7.knowledgeartifact.r1.impl.R1PackageImpl#getExpressionConstraint()
	 * @generated
	 */
	int EXPRESSION_CONSTRAINT = 36;

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
	 * The meta object id for the '{@link org.hl7.knowledgeartifact.r1.impl.ExpressionsTypeImpl <em>Expressions Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r1.impl.ExpressionsTypeImpl
	 * @see org.hl7.knowledgeartifact.r1.impl.R1PackageImpl#getExpressionsType()
	 * @generated
	 */
	int EXPRESSIONS_TYPE = 37;

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
	 * The meta object id for the '{@link org.hl7.knowledgeartifact.r1.impl.ExternalDataTypeImpl <em>External Data Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r1.impl.ExternalDataTypeImpl
	 * @see org.hl7.knowledgeartifact.r1.impl.R1PackageImpl#getExternalDataType()
	 * @generated
	 */
	int EXTERNAL_DATA_TYPE = 38;

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
	 * The meta object id for the '{@link org.hl7.knowledgeartifact.r1.impl.FireEventActionImpl <em>Fire Event Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r1.impl.FireEventActionImpl
	 * @see org.hl7.knowledgeartifact.r1.impl.R1PackageImpl#getFireEventAction()
	 * @generated
	 */
	int FIRE_EVENT_ACTION = 39;

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
	 * The feature id for the '<em><b>Event Type</b></em>' attribute.
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
	 * The meta object id for the '{@link org.hl7.knowledgeartifact.r1.impl.FocusTypeImpl <em>Focus Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r1.impl.FocusTypeImpl
	 * @see org.hl7.knowledgeartifact.r1.impl.R1PackageImpl#getFocusType()
	 * @generated
	 */
	int FOCUS_TYPE = 40;

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
	 * The meta object id for the '{@link org.hl7.knowledgeartifact.r1.impl.FormattedNumberImpl <em>Formatted Number</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r1.impl.FormattedNumberImpl
	 * @see org.hl7.knowledgeartifact.r1.impl.R1PackageImpl#getFormattedNumber()
	 * @generated
	 */
	int FORMATTED_NUMBER = 41;

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
	 * The meta object id for the '{@link org.hl7.knowledgeartifact.r1.impl.FormattedTextImpl <em>Formatted Text</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r1.impl.FormattedTextImpl
	 * @see org.hl7.knowledgeartifact.r1.impl.R1PackageImpl#getFormattedText()
	 * @generated
	 */
	int FORMATTED_TEXT = 42;

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
	 * The meta object id for the '{@link org.hl7.knowledgeartifact.r1.impl.GroupOrganizationBehaviorImpl <em>Group Organization Behavior</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r1.impl.GroupOrganizationBehaviorImpl
	 * @see org.hl7.knowledgeartifact.r1.impl.R1PackageImpl#getGroupOrganizationBehavior()
	 * @generated
	 */
	int GROUP_ORGANIZATION_BEHAVIOR = 43;

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
	 * The meta object id for the '{@link org.hl7.knowledgeartifact.r1.impl.GroupSelectionBehaviorImpl <em>Group Selection Behavior</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r1.impl.GroupSelectionBehaviorImpl
	 * @see org.hl7.knowledgeartifact.r1.impl.R1PackageImpl#getGroupSelectionBehavior()
	 * @generated
	 */
	int GROUP_SELECTION_BEHAVIOR = 44;

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
	 * The meta object id for the '{@link org.hl7.knowledgeartifact.r1.impl.IdentifiersTypeImpl <em>Identifiers Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r1.impl.IdentifiersTypeImpl
	 * @see org.hl7.knowledgeartifact.r1.impl.R1PackageImpl#getIdentifiersType()
	 * @generated
	 */
	int IDENTIFIERS_TYPE = 45;

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
	 * The meta object id for the '{@link org.hl7.knowledgeartifact.r1.impl.IdentifiersType1Impl <em>Identifiers Type1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r1.impl.IdentifiersType1Impl
	 * @see org.hl7.knowledgeartifact.r1.impl.R1PackageImpl#getIdentifiersType1()
	 * @generated
	 */
	int IDENTIFIERS_TYPE1 = 46;

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
	 * The meta object id for the '{@link org.hl7.knowledgeartifact.r1.impl.KnowledgeResourceImpl <em>Knowledge Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r1.impl.KnowledgeResourceImpl
	 * @see org.hl7.knowledgeartifact.r1.impl.R1PackageImpl#getKnowledgeResource()
	 * @generated
	 */
	int KNOWLEDGE_RESOURCE = 52;

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
	 * The meta object id for the '{@link org.hl7.knowledgeartifact.r1.impl.InlineResourceImpl <em>Inline Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r1.impl.InlineResourceImpl
	 * @see org.hl7.knowledgeartifact.r1.impl.R1PackageImpl#getInlineResource()
	 * @generated
	 */
	int INLINE_RESOURCE = 47;

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
	 * The meta object id for the '{@link org.hl7.knowledgeartifact.r1.impl.ItemCodesTypeImpl <em>Item Codes Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r1.impl.ItemCodesTypeImpl
	 * @see org.hl7.knowledgeartifact.r1.impl.R1PackageImpl#getItemCodesType()
	 * @generated
	 */
	int ITEM_CODES_TYPE = 48;

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
	 * The meta object id for the '{@link org.hl7.knowledgeartifact.r1.impl.KeyTermsTypeImpl <em>Key Terms Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r1.impl.KeyTermsTypeImpl
	 * @see org.hl7.knowledgeartifact.r1.impl.R1PackageImpl#getKeyTermsType()
	 * @generated
	 */
	int KEY_TERMS_TYPE = 50;

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
	 * The meta object id for the '{@link org.hl7.knowledgeartifact.r1.impl.KnowledgeDocumentImpl <em>Knowledge Document</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r1.impl.KnowledgeDocumentImpl
	 * @see org.hl7.knowledgeartifact.r1.impl.R1PackageImpl#getKnowledgeDocument()
	 * @generated
	 */
	int KNOWLEDGE_DOCUMENT = 51;

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
	 * The meta object id for the '{@link org.hl7.knowledgeartifact.r1.impl.LibrariesTypeImpl <em>Libraries Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r1.impl.LibrariesTypeImpl
	 * @see org.hl7.knowledgeartifact.r1.impl.R1PackageImpl#getLibrariesType()
	 * @generated
	 */
	int LIBRARIES_TYPE = 53;

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
	 * The meta object id for the '{@link org.hl7.knowledgeartifact.r1.impl.LibraryReferenceImpl <em>Library Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r1.impl.LibraryReferenceImpl
	 * @see org.hl7.knowledgeartifact.r1.impl.R1PackageImpl#getLibraryReference()
	 * @generated
	 */
	int LIBRARY_REFERENCE = 54;

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
	 * The meta object id for the '{@link org.hl7.knowledgeartifact.r1.impl.LookupConstraintImpl <em>Lookup Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r1.impl.LookupConstraintImpl
	 * @see org.hl7.knowledgeartifact.r1.impl.R1PackageImpl#getLookupConstraint()
	 * @generated
	 */
	int LOOKUP_CONSTRAINT = 55;

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
	 * The meta object id for the '{@link org.hl7.knowledgeartifact.r1.impl.MaskConstraintImpl <em>Mask Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r1.impl.MaskConstraintImpl
	 * @see org.hl7.knowledgeartifact.r1.impl.R1PackageImpl#getMaskConstraint()
	 * @generated
	 */
	int MASK_CONSTRAINT = 56;

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
	 * The meta object id for the '{@link org.hl7.knowledgeartifact.r1.impl.MetadataImpl <em>Metadata</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r1.impl.MetadataImpl
	 * @see org.hl7.knowledgeartifact.r1.impl.R1PackageImpl#getMetadata()
	 * @generated
	 */
	int METADATA = 57;

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
	 * The meta object id for the '{@link org.hl7.knowledgeartifact.r1.impl.ModelReferenceImpl <em>Model Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r1.impl.ModelReferenceImpl
	 * @see org.hl7.knowledgeartifact.r1.impl.R1PackageImpl#getModelReference()
	 * @generated
	 */
	int MODEL_REFERENCE = 58;

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
	 * The meta object id for the '{@link org.hl7.knowledgeartifact.r1.impl.NamedEventTriggerImpl <em>Named Event Trigger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r1.impl.NamedEventTriggerImpl
	 * @see org.hl7.knowledgeartifact.r1.impl.R1PackageImpl#getNamedEventTrigger()
	 * @generated
	 */
	int NAMED_EVENT_TRIGGER = 59;

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
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_EVENT_TRIGGER__NAME = TRIGGER_FEATURE_COUNT + 0;

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
	 * The meta object id for the '{@link org.hl7.knowledgeartifact.r1.impl.PartyImpl <em>Party</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r1.impl.PartyImpl
	 * @see org.hl7.knowledgeartifact.r1.impl.R1PackageImpl#getParty()
	 * @generated
	 */
	int PARTY = 61;

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
	 * The meta object id for the '{@link org.hl7.knowledgeartifact.r1.impl.OrganizationImpl <em>Organization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r1.impl.OrganizationImpl
	 * @see org.hl7.knowledgeartifact.r1.impl.R1PackageImpl#getOrganization()
	 * @generated
	 */
	int ORGANIZATION = 60;

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
	 * The meta object id for the '{@link org.hl7.knowledgeartifact.r1.impl.PeriodicEventTriggerImpl <em>Periodic Event Trigger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r1.impl.PeriodicEventTriggerImpl
	 * @see org.hl7.knowledgeartifact.r1.impl.R1PackageImpl#getPeriodicEventTrigger()
	 * @generated
	 */
	int PERIODIC_EVENT_TRIGGER = 62;

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
	 * The meta object id for the '{@link org.hl7.knowledgeartifact.r1.impl.PermissionsTypeImpl <em>Permissions Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r1.impl.PermissionsTypeImpl
	 * @see org.hl7.knowledgeartifact.r1.impl.R1PackageImpl#getPermissionsType()
	 * @generated
	 */
	int PERMISSIONS_TYPE = 63;

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
	 * The meta object id for the '{@link org.hl7.knowledgeartifact.r1.impl.PersonImpl <em>Person</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r1.impl.PersonImpl
	 * @see org.hl7.knowledgeartifact.r1.impl.R1PackageImpl#getPerson()
	 * @generated
	 */
	int PERSON = 64;

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
	 * The meta object id for the '{@link org.hl7.knowledgeartifact.r1.impl.PrecheckBehaviorImpl <em>Precheck Behavior</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r1.impl.PrecheckBehaviorImpl
	 * @see org.hl7.knowledgeartifact.r1.impl.R1PackageImpl#getPrecheckBehavior()
	 * @generated
	 */
	int PRECHECK_BEHAVIOR = 65;

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
	 * The meta object id for the '{@link org.hl7.knowledgeartifact.r1.impl.PublishersTypeImpl <em>Publishers Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r1.impl.PublishersTypeImpl
	 * @see org.hl7.knowledgeartifact.r1.impl.R1PackageImpl#getPublishersType()
	 * @generated
	 */
	int PUBLISHERS_TYPE = 66;

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
	 * The meta object id for the '{@link org.hl7.knowledgeartifact.r1.impl.ReadOnlyBehaviorImpl <em>Read Only Behavior</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r1.impl.ReadOnlyBehaviorImpl
	 * @see org.hl7.knowledgeartifact.r1.impl.R1PackageImpl#getReadOnlyBehavior()
	 * @generated
	 */
	int READ_ONLY_BEHAVIOR = 68;

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
	 * The meta object id for the '{@link org.hl7.knowledgeartifact.r1.impl.ReferencedModelTypeImpl <em>Referenced Model Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r1.impl.ReferencedModelTypeImpl
	 * @see org.hl7.knowledgeartifact.r1.impl.R1PackageImpl#getReferencedModelType()
	 * @generated
	 */
	int REFERENCED_MODEL_TYPE = 69;

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
	 * The meta object id for the '{@link org.hl7.knowledgeartifact.r1.impl.RelatedResourcesTypeImpl <em>Related Resources Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r1.impl.RelatedResourcesTypeImpl
	 * @see org.hl7.knowledgeartifact.r1.impl.R1PackageImpl#getRelatedResourcesType()
	 * @generated
	 */
	int RELATED_RESOURCES_TYPE = 70;

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
	 * The meta object id for the '{@link org.hl7.knowledgeartifact.r1.impl.RelationshipTypeImpl <em>Relationship Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r1.impl.RelationshipTypeImpl
	 * @see org.hl7.knowledgeartifact.r1.impl.R1PackageImpl#getRelationshipType()
	 * @generated
	 */
	int RELATIONSHIP_TYPE = 71;

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
	 * The meta object id for the '{@link org.hl7.knowledgeartifact.r1.impl.RemoveActionImpl <em>Remove Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r1.impl.RemoveActionImpl
	 * @see org.hl7.knowledgeartifact.r1.impl.R1PackageImpl#getRemoveAction()
	 * @generated
	 */
	int REMOVE_ACTION = 72;

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
	 * The meta object id for the '{@link org.hl7.knowledgeartifact.r1.impl.RepresentedConceptsTypeImpl <em>Represented Concepts Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r1.impl.RepresentedConceptsTypeImpl
	 * @see org.hl7.knowledgeartifact.r1.impl.R1PackageImpl#getRepresentedConceptsType()
	 * @generated
	 */
	int REPRESENTED_CONCEPTS_TYPE = 73;

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
	 * The meta object id for the '{@link org.hl7.knowledgeartifact.r1.impl.RequiredBehaviorImpl <em>Required Behavior</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r1.impl.RequiredBehaviorImpl
	 * @see org.hl7.knowledgeartifact.r1.impl.R1PackageImpl#getRequiredBehavior()
	 * @generated
	 */
	int REQUIRED_BEHAVIOR = 74;

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
	 * The meta object id for the '{@link org.hl7.knowledgeartifact.r1.impl.ResourceRelationshipReferenceImpl <em>Resource Relationship Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r1.impl.ResourceRelationshipReferenceImpl
	 * @see org.hl7.knowledgeartifact.r1.impl.R1PackageImpl#getResourceRelationshipReference()
	 * @generated
	 */
	int RESOURCE_RELATIONSHIP_REFERENCE = 75;

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
	 * The meta object id for the '{@link org.hl7.knowledgeartifact.r1.impl.ResourcesTypeImpl <em>Resources Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r1.impl.ResourcesTypeImpl
	 * @see org.hl7.knowledgeartifact.r1.impl.R1PackageImpl#getResourcesType()
	 * @generated
	 */
	int RESOURCES_TYPE = 76;

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
	 * The meta object id for the '{@link org.hl7.knowledgeartifact.r1.impl.ResponseBindingImpl <em>Response Binding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r1.impl.ResponseBindingImpl
	 * @see org.hl7.knowledgeartifact.r1.impl.R1PackageImpl#getResponseBinding()
	 * @generated
	 */
	int RESPONSE_BINDING = 77;

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
	 * The meta object id for the '{@link org.hl7.knowledgeartifact.r1.impl.ResponseCardinalityTypeImpl <em>Response Cardinality Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r1.impl.ResponseCardinalityTypeImpl
	 * @see org.hl7.knowledgeartifact.r1.impl.R1PackageImpl#getResponseCardinalityType()
	 * @generated
	 */
	int RESPONSE_CARDINALITY_TYPE = 78;

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
	 * The meta object id for the '{@link org.hl7.knowledgeartifact.r1.impl.ResponseDataTypeTypeImpl <em>Response Data Type Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r1.impl.ResponseDataTypeTypeImpl
	 * @see org.hl7.knowledgeartifact.r1.impl.R1PackageImpl#getResponseDataTypeType()
	 * @generated
	 */
	int RESPONSE_DATA_TYPE_TYPE = 79;

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
	 * The meta object id for the '{@link org.hl7.knowledgeartifact.r1.impl.RightsDeclarationImpl <em>Rights Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r1.impl.RightsDeclarationImpl
	 * @see org.hl7.knowledgeartifact.r1.impl.R1PackageImpl#getRightsDeclaration()
	 * @generated
	 */
	int RIGHTS_DECLARATION = 80;

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
	 * The meta object id for the '{@link org.hl7.knowledgeartifact.r1.impl.RoleTypeImpl <em>Role Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r1.impl.RoleTypeImpl
	 * @see org.hl7.knowledgeartifact.r1.impl.R1PackageImpl#getRoleType()
	 * @generated
	 */
	int ROLE_TYPE = 81;

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
	 * The meta object id for the '{@link org.hl7.knowledgeartifact.r1.impl.StatusTypeImpl <em>Status Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r1.impl.StatusTypeImpl
	 * @see org.hl7.knowledgeartifact.r1.impl.R1PackageImpl#getStatusType()
	 * @generated
	 */
	int STATUS_TYPE = 82;

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
	 * The meta object id for the '{@link org.hl7.knowledgeartifact.r1.impl.SubElementsTypeImpl <em>Sub Elements Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r1.impl.SubElementsTypeImpl
	 * @see org.hl7.knowledgeartifact.r1.impl.R1PackageImpl#getSubElementsType()
	 * @generated
	 */
	int SUB_ELEMENTS_TYPE = 83;

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
	 * The meta object id for the '{@link org.hl7.knowledgeartifact.r1.impl.SupportingEvidenceImpl <em>Supporting Evidence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r1.impl.SupportingEvidenceImpl
	 * @see org.hl7.knowledgeartifact.r1.impl.R1PackageImpl#getSupportingEvidence()
	 * @generated
	 */
	int SUPPORTING_EVIDENCE = 84;

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
	 * The meta object id for the '{@link org.hl7.knowledgeartifact.r1.impl.SupportingResourceImpl <em>Supporting Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r1.impl.SupportingResourceImpl
	 * @see org.hl7.knowledgeartifact.r1.impl.R1PackageImpl#getSupportingResource()
	 * @generated
	 */
	int SUPPORTING_RESOURCE = 85;

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
	 * The meta object id for the '{@link org.hl7.knowledgeartifact.r1.impl.TemplateIdsTypeImpl <em>Template Ids Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r1.impl.TemplateIdsTypeImpl
	 * @see org.hl7.knowledgeartifact.r1.impl.R1PackageImpl#getTemplateIdsType()
	 * @generated
	 */
	int TEMPLATE_IDS_TYPE = 86;

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
	 * The meta object id for the '{@link org.hl7.knowledgeartifact.r1.impl.TemplateIdsType1Impl <em>Template Ids Type1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r1.impl.TemplateIdsType1Impl
	 * @see org.hl7.knowledgeartifact.r1.impl.R1PackageImpl#getTemplateIdsType1()
	 * @generated
	 */
	int TEMPLATE_IDS_TYPE1 = 87;

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
	 * The meta object id for the '{@link org.hl7.knowledgeartifact.r1.impl.TriggersImpl <em>Triggers</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r1.impl.TriggersImpl
	 * @see org.hl7.knowledgeartifact.r1.impl.R1PackageImpl#getTriggers()
	 * @generated
	 */
	int TRIGGERS = 89;

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
	 * The meta object id for the '{@link org.hl7.knowledgeartifact.r1.impl.UpdateActionImpl <em>Update Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r1.impl.UpdateActionImpl
	 * @see org.hl7.knowledgeartifact.r1.impl.R1PackageImpl#getUpdateAction()
	 * @generated
	 */
	int UPDATE_ACTION = 90;

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
	 * The meta object id for the '{@link org.hl7.knowledgeartifact.r1.impl.UsageTermsTypeImpl <em>Usage Terms Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r1.impl.UsageTermsTypeImpl
	 * @see org.hl7.knowledgeartifact.r1.impl.R1PackageImpl#getUsageTermsType()
	 * @generated
	 */
	int USAGE_TERMS_TYPE = 91;

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
	 * The meta object id for the '{@link org.hl7.knowledgeartifact.r1.impl.ValueSetConstraintImpl <em>Value Set Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r1.impl.ValueSetConstraintImpl
	 * @see org.hl7.knowledgeartifact.r1.impl.R1PackageImpl#getValueSetConstraint()
	 * @generated
	 */
	int VALUE_SET_CONSTRAINT = 92;

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
	 * The meta object id for the '{@link org.hl7.knowledgeartifact.r1.impl.VersionedIdentifierImpl <em>Versioned Identifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r1.impl.VersionedIdentifierImpl
	 * @see org.hl7.knowledgeartifact.r1.impl.R1PackageImpl#getVersionedIdentifier()
	 * @generated
	 */
	int VERSIONED_IDENTIFIER = 93;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_IDENTIFIER__EXTENSION = R2Package.II__EXTENSION;

	/**
	 * The feature id for the '<em><b>Identifier Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_IDENTIFIER__IDENTIFIER_NAME = R2Package.II__IDENTIFIER_NAME;

	/**
	 * The feature id for the '<em><b>Root</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_IDENTIFIER__ROOT = R2Package.II__ROOT;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_IDENTIFIER__VERSION = R2Package.II_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Versioned Identifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_IDENTIFIER_FEATURE_COUNT = R2Package.II_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Versioned Identifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_IDENTIFIER_OPERATION_COUNT = R2Package.II_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.knowledgeartifact.r1.impl.VisualStyleBehaviorImpl <em>Visual Style Behavior</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r1.impl.VisualStyleBehaviorImpl
	 * @see org.hl7.knowledgeartifact.r1.impl.R1PackageImpl#getVisualStyleBehavior()
	 * @generated
	 */
	int VISUAL_STYLE_BEHAVIOR = 94;

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
	 * The meta object id for the '{@link org.hl7.knowledgeartifact.r1.ArtifactLifeCycleEventType <em>Artifact Life Cycle Event Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r1.ArtifactLifeCycleEventType
	 * @see org.hl7.knowledgeartifact.r1.impl.R1PackageImpl#getArtifactLifeCycleEventType()
	 * @generated
	 */
	int ARTIFACT_LIFE_CYCLE_EVENT_TYPE = 95;

	/**
	 * The meta object id for the '{@link org.hl7.knowledgeartifact.r1.ArtifactStatusType <em>Artifact Status Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r1.ArtifactStatusType
	 * @see org.hl7.knowledgeartifact.r1.impl.R1PackageImpl#getArtifactStatusType()
	 * @generated
	 */
	int ARTIFACT_STATUS_TYPE = 96;

	/**
	 * The meta object id for the '{@link org.hl7.knowledgeartifact.r1.ArtifactType <em>Artifact Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r1.ArtifactType
	 * @see org.hl7.knowledgeartifact.r1.impl.R1PackageImpl#getArtifactType()
	 * @generated
	 */
	int ARTIFACT_TYPE = 97;

	/**
	 * The meta object id for the '{@link org.hl7.knowledgeartifact.r1.Cardinality <em>Cardinality</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r1.Cardinality
	 * @see org.hl7.knowledgeartifact.r1.impl.R1PackageImpl#getCardinality()
	 * @generated
	 */
	int CARDINALITY = 98;

	/**
	 * The meta object id for the '{@link org.hl7.knowledgeartifact.r1.CardinalityBehaviorType <em>Cardinality Behavior Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r1.CardinalityBehaviorType
	 * @see org.hl7.knowledgeartifact.r1.impl.R1PackageImpl#getCardinalityBehaviorType()
	 * @generated
	 */
	int CARDINALITY_BEHAVIOR_TYPE = 99;

	/**
	 * The meta object id for the '{@link org.hl7.knowledgeartifact.r1.CompondArtifactType <em>Compond Artifact Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r1.CompondArtifactType
	 * @see org.hl7.knowledgeartifact.r1.impl.R1PackageImpl#getCompondArtifactType()
	 * @generated
	 */
	int COMPOND_ARTIFACT_TYPE = 100;

	/**
	 * The meta object id for the '{@link org.hl7.knowledgeartifact.r1.ConditionRoleType <em>Condition Role Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r1.ConditionRoleType
	 * @see org.hl7.knowledgeartifact.r1.impl.R1PackageImpl#getConditionRoleType()
	 * @generated
	 */
	int CONDITION_ROLE_TYPE = 101;

	/**
	 * The meta object id for the '{@link org.hl7.knowledgeartifact.r1.ContributorType <em>Contributor Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r1.ContributorType
	 * @see org.hl7.knowledgeartifact.r1.impl.R1PackageImpl#getContributorType()
	 * @generated
	 */
	int CONTRIBUTOR_TYPE = 102;

	/**
	 * The meta object id for the '{@link org.hl7.knowledgeartifact.r1.CoverageType <em>Coverage Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r1.CoverageType
	 * @see org.hl7.knowledgeartifact.r1.impl.R1PackageImpl#getCoverageType()
	 * @generated
	 */
	int COVERAGE_TYPE = 103;

	/**
	 * The meta object id for the '{@link org.hl7.knowledgeartifact.r1.DataEventType <em>Data Event Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r1.DataEventType
	 * @see org.hl7.knowledgeartifact.r1.impl.R1PackageImpl#getDataEventType()
	 * @generated
	 */
	int DATA_EVENT_TYPE = 104;

	/**
	 * The meta object id for the '{@link org.hl7.knowledgeartifact.r1.EventType <em>Event Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r1.EventType
	 * @see org.hl7.knowledgeartifact.r1.impl.R1PackageImpl#getEventType()
	 * @generated
	 */
	int EVENT_TYPE = 105;

	/**
	 * The meta object id for the '{@link org.hl7.knowledgeartifact.r1.GroupOrganizationBehaviorType <em>Group Organization Behavior Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r1.GroupOrganizationBehaviorType
	 * @see org.hl7.knowledgeartifact.r1.impl.R1PackageImpl#getGroupOrganizationBehaviorType()
	 * @generated
	 */
	int GROUP_ORGANIZATION_BEHAVIOR_TYPE = 106;

	/**
	 * The meta object id for the '{@link org.hl7.knowledgeartifact.r1.GroupSelectionBehaviorType <em>Group Selection Behavior Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r1.GroupSelectionBehaviorType
	 * @see org.hl7.knowledgeartifact.r1.impl.R1PackageImpl#getGroupSelectionBehaviorType()
	 * @generated
	 */
	int GROUP_SELECTION_BEHAVIOR_TYPE = 107;

	/**
	 * The meta object id for the '{@link org.hl7.knowledgeartifact.r1.PrecheckBehaviorType <em>Precheck Behavior Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r1.PrecheckBehaviorType
	 * @see org.hl7.knowledgeartifact.r1.impl.R1PackageImpl#getPrecheckBehaviorType()
	 * @generated
	 */
	int PRECHECK_BEHAVIOR_TYPE = 108;

	/**
	 * The meta object id for the '{@link org.hl7.knowledgeartifact.r1.RangeConstraintType <em>Range Constraint Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r1.RangeConstraintType
	 * @see org.hl7.knowledgeartifact.r1.impl.R1PackageImpl#getRangeConstraintType()
	 * @generated
	 */
	int RANGE_CONSTRAINT_TYPE = 109;

	/**
	 * The meta object id for the '{@link org.hl7.knowledgeartifact.r1.RequiredBehaviorType <em>Required Behavior Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r1.RequiredBehaviorType
	 * @see org.hl7.knowledgeartifact.r1.impl.R1PackageImpl#getRequiredBehaviorType()
	 * @generated
	 */
	int REQUIRED_BEHAVIOR_TYPE = 110;

	/**
	 * The meta object id for the '{@link org.hl7.knowledgeartifact.r1.ResourceRelationshipType <em>Resource Relationship Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r1.ResourceRelationshipType
	 * @see org.hl7.knowledgeartifact.r1.impl.R1PackageImpl#getResourceRelationshipType()
	 * @generated
	 */
	int RESOURCE_RELATIONSHIP_TYPE = 111;

	/**
	 * The meta object id for the '{@link org.hl7.knowledgeartifact.r1.ValueType <em>Value Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r1.ValueType
	 * @see org.hl7.knowledgeartifact.r1.impl.R1PackageImpl#getValueType()
	 * @generated
	 */
	int VALUE_TYPE = 112;

	/**
	 * The meta object id for the '<em>Artifact Life Cycle Event Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r1.ArtifactLifeCycleEventType
	 * @see org.hl7.knowledgeartifact.r1.impl.R1PackageImpl#getArtifactLifeCycleEventTypeObject()
	 * @generated
	 */
	int ARTIFACT_LIFE_CYCLE_EVENT_TYPE_OBJECT = 113;

	/**
	 * The meta object id for the '<em>Artifact Status Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r1.ArtifactStatusType
	 * @see org.hl7.knowledgeartifact.r1.impl.R1PackageImpl#getArtifactStatusTypeObject()
	 * @generated
	 */
	int ARTIFACT_STATUS_TYPE_OBJECT = 114;

	/**
	 * The meta object id for the '<em>Artifact Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r1.ArtifactType
	 * @see org.hl7.knowledgeartifact.r1.impl.R1PackageImpl#getArtifactTypeObject()
	 * @generated
	 */
	int ARTIFACT_TYPE_OBJECT = 115;

	/**
	 * The meta object id for the '<em>Cardinality Behavior Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r1.CardinalityBehaviorType
	 * @see org.hl7.knowledgeartifact.r1.impl.R1PackageImpl#getCardinalityBehaviorTypeObject()
	 * @generated
	 */
	int CARDINALITY_BEHAVIOR_TYPE_OBJECT = 116;

	/**
	 * The meta object id for the '<em>Cardinality Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r1.Cardinality
	 * @see org.hl7.knowledgeartifact.r1.impl.R1PackageImpl#getCardinalityObject()
	 * @generated
	 */
	int CARDINALITY_OBJECT = 117;

	/**
	 * The meta object id for the '<em>Compond Artifact Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r1.CompondArtifactType
	 * @see org.hl7.knowledgeartifact.r1.impl.R1PackageImpl#getCompondArtifactTypeObject()
	 * @generated
	 */
	int COMPOND_ARTIFACT_TYPE_OBJECT = 118;

	/**
	 * The meta object id for the '<em>Condition Role Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r1.ConditionRoleType
	 * @see org.hl7.knowledgeartifact.r1.impl.R1PackageImpl#getConditionRoleTypeObject()
	 * @generated
	 */
	int CONDITION_ROLE_TYPE_OBJECT = 119;

	/**
	 * The meta object id for the '<em>Contributor Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r1.ContributorType
	 * @see org.hl7.knowledgeartifact.r1.impl.R1PackageImpl#getContributorTypeObject()
	 * @generated
	 */
	int CONTRIBUTOR_TYPE_OBJECT = 120;

	/**
	 * The meta object id for the '<em>Coverage Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r1.CoverageType
	 * @see org.hl7.knowledgeartifact.r1.impl.R1PackageImpl#getCoverageTypeObject()
	 * @generated
	 */
	int COVERAGE_TYPE_OBJECT = 121;

	/**
	 * The meta object id for the '<em>Data Event Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r1.DataEventType
	 * @see org.hl7.knowledgeartifact.r1.impl.R1PackageImpl#getDataEventTypeObject()
	 * @generated
	 */
	int DATA_EVENT_TYPE_OBJECT = 122;

	/**
	 * The meta object id for the '<em>Event Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r1.EventType
	 * @see org.hl7.knowledgeartifact.r1.impl.R1PackageImpl#getEventTypeObject()
	 * @generated
	 */
	int EVENT_TYPE_OBJECT = 123;

	/**
	 * The meta object id for the '<em>Group Organization Behavior Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r1.GroupOrganizationBehaviorType
	 * @see org.hl7.knowledgeartifact.r1.impl.R1PackageImpl#getGroupOrganizationBehaviorTypeObject()
	 * @generated
	 */
	int GROUP_ORGANIZATION_BEHAVIOR_TYPE_OBJECT = 124;

	/**
	 * The meta object id for the '<em>Group Selection Behavior Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r1.GroupSelectionBehaviorType
	 * @see org.hl7.knowledgeartifact.r1.impl.R1PackageImpl#getGroupSelectionBehaviorTypeObject()
	 * @generated
	 */
	int GROUP_SELECTION_BEHAVIOR_TYPE_OBJECT = 125;

	/**
	 * The meta object id for the '<em>Precheck Behavior Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r1.PrecheckBehaviorType
	 * @see org.hl7.knowledgeartifact.r1.impl.R1PackageImpl#getPrecheckBehaviorTypeObject()
	 * @generated
	 */
	int PRECHECK_BEHAVIOR_TYPE_OBJECT = 126;

	/**
	 * The meta object id for the '<em>Range Constraint Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r1.RangeConstraintType
	 * @see org.hl7.knowledgeartifact.r1.impl.R1PackageImpl#getRangeConstraintTypeObject()
	 * @generated
	 */
	int RANGE_CONSTRAINT_TYPE_OBJECT = 127;

	/**
	 * The meta object id for the '<em>Required Behavior Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r1.RequiredBehaviorType
	 * @see org.hl7.knowledgeartifact.r1.impl.R1PackageImpl#getRequiredBehaviorTypeObject()
	 * @generated
	 */
	int REQUIRED_BEHAVIOR_TYPE_OBJECT = 128;

	/**
	 * The meta object id for the '<em>Resource Relationship Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r1.ResourceRelationshipType
	 * @see org.hl7.knowledgeartifact.r1.impl.R1PackageImpl#getResourceRelationshipTypeObject()
	 * @generated
	 */
	int RESOURCE_RELATIONSHIP_TYPE_OBJECT = 129;

	/**
	 * The meta object id for the '<em>Value Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.knowledgeartifact.r1.ValueType
	 * @see org.hl7.knowledgeartifact.r1.impl.R1PackageImpl#getValueTypeObject()
	 * @generated
	 */
	int VALUE_TYPE_OBJECT = 130;


	/**
	 * Returns the meta object for class '{@link org.hl7.knowledgeartifact.r1.ActionBase <em>Action Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action Base</em>'.
	 * @see org.hl7.knowledgeartifact.r1.ActionBase
	 * @generated
	 */
	EClass getActionBase();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.knowledgeartifact.r1.ActionBase#getActionId <em>Action Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Action Id</em>'.
	 * @see org.hl7.knowledgeartifact.r1.ActionBase#getActionId()
	 * @see #getActionBase()
	 * @generated
	 */
	EReference getActionBase_ActionId();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.knowledgeartifact.r1.ActionBase#getNumber <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Number</em>'.
	 * @see org.hl7.knowledgeartifact.r1.ActionBase#getNumber()
	 * @see #getActionBase()
	 * @generated
	 */
	EReference getActionBase_Number();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.knowledgeartifact.r1.ActionBase#getSupportingEvidence <em>Supporting Evidence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Supporting Evidence</em>'.
	 * @see org.hl7.knowledgeartifact.r1.ActionBase#getSupportingEvidence()
	 * @see #getActionBase()
	 * @generated
	 */
	EReference getActionBase_SupportingEvidence();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.knowledgeartifact.r1.ActionBase#getSupportingResources <em>Supporting Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Supporting Resources</em>'.
	 * @see org.hl7.knowledgeartifact.r1.ActionBase#getSupportingResources()
	 * @see #getActionBase()
	 * @generated
	 */
	EReference getActionBase_SupportingResources();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.knowledgeartifact.r1.ActionBase#getActors <em>Actors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Actors</em>'.
	 * @see org.hl7.knowledgeartifact.r1.ActionBase#getActors()
	 * @see #getActionBase()
	 * @generated
	 */
	EReference getActionBase_Actors();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.knowledgeartifact.r1.ActionBase#getBehaviors <em>Behaviors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Behaviors</em>'.
	 * @see org.hl7.knowledgeartifact.r1.ActionBase#getBehaviors()
	 * @see #getActionBase()
	 * @generated
	 */
	EReference getActionBase_Behaviors();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.knowledgeartifact.r1.ActionBase#getConditions <em>Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Conditions</em>'.
	 * @see org.hl7.knowledgeartifact.r1.ActionBase#getConditions()
	 * @see #getActionBase()
	 * @generated
	 */
	EReference getActionBase_Conditions();

	/**
	 * Returns the meta object for the attribute '{@link org.hl7.knowledgeartifact.r1.ActionBase#getOrder <em>Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Order</em>'.
	 * @see org.hl7.knowledgeartifact.r1.ActionBase#getOrder()
	 * @see #getActionBase()
	 * @generated
	 */
	EAttribute getActionBase_Order();

	/**
	 * Returns the meta object for class '{@link org.hl7.knowledgeartifact.r1.ActionGroup <em>Action Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action Group</em>'.
	 * @see org.hl7.knowledgeartifact.r1.ActionGroup
	 * @generated
	 */
	EClass getActionGroup();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.knowledgeartifact.r1.ActionGroup#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Title</em>'.
	 * @see org.hl7.knowledgeartifact.r1.ActionGroup#getTitle()
	 * @see #getActionGroup()
	 * @generated
	 */
	EReference getActionGroup_Title();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.knowledgeartifact.r1.ActionGroup#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see org.hl7.knowledgeartifact.r1.ActionGroup#getDescription()
	 * @see #getActionGroup()
	 * @generated
	 */
	EReference getActionGroup_Description();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.knowledgeartifact.r1.ActionGroup#getRepresentedConcepts <em>Represented Concepts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Represented Concepts</em>'.
	 * @see org.hl7.knowledgeartifact.r1.ActionGroup#getRepresentedConcepts()
	 * @see #getActionGroup()
	 * @generated
	 */
	EReference getActionGroup_RepresentedConcepts();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.knowledgeartifact.r1.ActionGroup#getSubElements <em>Sub Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sub Elements</em>'.
	 * @see org.hl7.knowledgeartifact.r1.ActionGroup#getSubElements()
	 * @see #getActionGroup()
	 * @generated
	 */
	EReference getActionGroup_SubElements();

	/**
	 * Returns the meta object for class '{@link org.hl7.knowledgeartifact.r1.ActionRef <em>Action Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action Ref</em>'.
	 * @see org.hl7.knowledgeartifact.r1.ActionRef
	 * @generated
	 */
	EClass getActionRef();

	/**
	 * Returns the meta object for the attribute '{@link org.hl7.knowledgeartifact.r1.ActionRef#getLibraryName <em>Library Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Library Name</em>'.
	 * @see org.hl7.knowledgeartifact.r1.ActionRef#getLibraryName()
	 * @see #getActionRef()
	 * @generated
	 */
	EAttribute getActionRef_LibraryName();

	/**
	 * Returns the meta object for the attribute '{@link org.hl7.knowledgeartifact.r1.ActionRef#getReferencedActionId <em>Referenced Action Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Referenced Action Id</em>'.
	 * @see org.hl7.knowledgeartifact.r1.ActionRef#getReferencedActionId()
	 * @see #getActionRef()
	 * @generated
	 */
	EAttribute getActionRef_ReferencedActionId();

	/**
	 * Returns the meta object for class '{@link org.hl7.knowledgeartifact.r1.Actor <em>Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Actor</em>'.
	 * @see org.hl7.knowledgeartifact.r1.Actor
	 * @generated
	 */
	EClass getActor();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.knowledgeartifact.r1.Actor#getActor <em>Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Actor</em>'.
	 * @see org.hl7.knowledgeartifact.r1.Actor#getActor()
	 * @see #getActor()
	 * @generated
	 */
	EReference getActor_Actor();

	/**
	 * Returns the meta object for class '{@link org.hl7.knowledgeartifact.r1.ActorsType <em>Actors Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Actors Type</em>'.
	 * @see org.hl7.knowledgeartifact.r1.ActorsType
	 * @generated
	 */
	EClass getActorsType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.hl7.knowledgeartifact.r1.ActorsType#getActor <em>Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actor</em>'.
	 * @see org.hl7.knowledgeartifact.r1.ActorsType#getActor()
	 * @see #getActorsType()
	 * @generated
	 */
	EReference getActorsType_Actor();

	/**
	 * Returns the meta object for class '{@link org.hl7.knowledgeartifact.r1.AddressesType <em>Addresses Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Addresses Type</em>'.
	 * @see org.hl7.knowledgeartifact.r1.AddressesType
	 * @generated
	 */
	EClass getAddressesType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.hl7.knowledgeartifact.r1.AddressesType#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Address</em>'.
	 * @see org.hl7.knowledgeartifact.r1.AddressesType#getAddress()
	 * @see #getAddressesType()
	 * @generated
	 */
	EReference getAddressesType_Address();

	/**
	 * Returns the meta object for class '{@link org.hl7.knowledgeartifact.r1.ApplicabilityType <em>Applicability Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Applicability Type</em>'.
	 * @see org.hl7.knowledgeartifact.r1.ApplicabilityType
	 * @generated
	 */
	EClass getApplicabilityType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.hl7.knowledgeartifact.r1.ApplicabilityType#getCoverage <em>Coverage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Coverage</em>'.
	 * @see org.hl7.knowledgeartifact.r1.ApplicabilityType#getCoverage()
	 * @see #getApplicabilityType()
	 * @generated
	 */
	EReference getApplicabilityType_Coverage();

	/**
	 * Returns the meta object for class '{@link org.hl7.knowledgeartifact.r1.ArtifactLifeCycleEvent <em>Artifact Life Cycle Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Artifact Life Cycle Event</em>'.
	 * @see org.hl7.knowledgeartifact.r1.ArtifactLifeCycleEvent
	 * @generated
	 */
	EClass getArtifactLifeCycleEvent();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.knowledgeartifact.r1.ArtifactLifeCycleEvent#getEventType <em>Event Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Event Type</em>'.
	 * @see org.hl7.knowledgeartifact.r1.ArtifactLifeCycleEvent#getEventType()
	 * @see #getArtifactLifeCycleEvent()
	 * @generated
	 */
	EReference getArtifactLifeCycleEvent_EventType();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.knowledgeartifact.r1.ArtifactLifeCycleEvent#getEventDateTime <em>Event Date Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Event Date Time</em>'.
	 * @see org.hl7.knowledgeartifact.r1.ArtifactLifeCycleEvent#getEventDateTime()
	 * @see #getArtifactLifeCycleEvent()
	 * @generated
	 */
	EReference getArtifactLifeCycleEvent_EventDateTime();

	/**
	 * Returns the meta object for class '{@link org.hl7.knowledgeartifact.r1.ArtifactTypeType <em>Artifact Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Artifact Type Type</em>'.
	 * @see org.hl7.knowledgeartifact.r1.ArtifactTypeType
	 * @generated
	 */
	EClass getArtifactTypeType();

	/**
	 * Returns the meta object for the attribute '{@link org.hl7.knowledgeartifact.r1.ArtifactTypeType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.hl7.knowledgeartifact.r1.ArtifactTypeType#getValue()
	 * @see #getArtifactTypeType()
	 * @generated
	 */
	EAttribute getArtifactTypeType_Value();

	/**
	 * Returns the meta object for class '{@link org.hl7.knowledgeartifact.r1.AtomicAction <em>Atomic Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Atomic Action</em>'.
	 * @see org.hl7.knowledgeartifact.r1.AtomicAction
	 * @generated
	 */
	EClass getAtomicAction();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.knowledgeartifact.r1.AtomicAction#getTextEquivalent <em>Text Equivalent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Text Equivalent</em>'.
	 * @see org.hl7.knowledgeartifact.r1.AtomicAction#getTextEquivalent()
	 * @see #getAtomicAction()
	 * @generated
	 */
	EReference getAtomicAction_TextEquivalent();

	/**
	 * Returns the meta object for class '{@link org.hl7.knowledgeartifact.r1.Behavior <em>Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Behavior</em>'.
	 * @see org.hl7.knowledgeartifact.r1.Behavior
	 * @generated
	 */
	EClass getBehavior();

	/**
	 * Returns the meta object for the attribute '{@link org.hl7.knowledgeartifact.r1.Behavior#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.hl7.knowledgeartifact.r1.Behavior#getValue()
	 * @see #getBehavior()
	 * @generated
	 */
	EAttribute getBehavior_Value();

	/**
	 * Returns the meta object for class '{@link org.hl7.knowledgeartifact.r1.Behaviors <em>Behaviors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Behaviors</em>'.
	 * @see org.hl7.knowledgeartifact.r1.Behaviors
	 * @generated
	 */
	EClass getBehaviors();

	/**
	 * Returns the meta object for the containment reference list '{@link org.hl7.knowledgeartifact.r1.Behaviors#getBehavior <em>Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Behavior</em>'.
	 * @see org.hl7.knowledgeartifact.r1.Behaviors#getBehavior()
	 * @see #getBehaviors()
	 * @generated
	 */
	EReference getBehaviors_Behavior();

	/**
	 * Returns the meta object for class '{@link org.hl7.knowledgeartifact.r1.CardinalityBehavior <em>Cardinality Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cardinality Behavior</em>'.
	 * @see org.hl7.knowledgeartifact.r1.CardinalityBehavior
	 * @generated
	 */
	EClass getCardinalityBehavior();

	/**
	 * Returns the meta object for class '{@link org.hl7.knowledgeartifact.r1.CategoriesType <em>Categories Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Categories Type</em>'.
	 * @see org.hl7.knowledgeartifact.r1.CategoriesType
	 * @generated
	 */
	EClass getCategoriesType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.hl7.knowledgeartifact.r1.CategoriesType#getCategory <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Category</em>'.
	 * @see org.hl7.knowledgeartifact.r1.CategoriesType#getCategory()
	 * @see #getCategoriesType()
	 * @generated
	 */
	EReference getCategoriesType_Category();

	/**
	 * Returns the meta object for class '{@link org.hl7.knowledgeartifact.r1.CodesType <em>Codes Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Codes Type</em>'.
	 * @see org.hl7.knowledgeartifact.r1.CodesType
	 * @generated
	 */
	EClass getCodesType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.hl7.knowledgeartifact.r1.CodesType#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Code</em>'.
	 * @see org.hl7.knowledgeartifact.r1.CodesType#getCode()
	 * @see #getCodesType()
	 * @generated
	 */
	EReference getCodesType_Code();

	/**
	 * Returns the meta object for class '{@link org.hl7.knowledgeartifact.r1.CollectInformationAction <em>Collect Information Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Collect Information Action</em>'.
	 * @see org.hl7.knowledgeartifact.r1.CollectInformationAction
	 * @generated
	 */
	EClass getCollectInformationAction();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.knowledgeartifact.r1.CollectInformationAction#getDocumentationConcept <em>Documentation Concept</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Documentation Concept</em>'.
	 * @see org.hl7.knowledgeartifact.r1.CollectInformationAction#getDocumentationConcept()
	 * @see #getCollectInformationAction()
	 * @generated
	 */
	EReference getCollectInformationAction_DocumentationConcept();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.knowledgeartifact.r1.CollectInformationAction#getInitialValue <em>Initial Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Initial Value</em>'.
	 * @see org.hl7.knowledgeartifact.r1.CollectInformationAction#getInitialValue()
	 * @see #getCollectInformationAction()
	 * @generated
	 */
	EReference getCollectInformationAction_InitialValue();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.knowledgeartifact.r1.CollectInformationAction#getResponseBinding <em>Response Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Response Binding</em>'.
	 * @see org.hl7.knowledgeartifact.r1.CollectInformationAction#getResponseBinding()
	 * @see #getCollectInformationAction()
	 * @generated
	 */
	EReference getCollectInformationAction_ResponseBinding();

	/**
	 * Returns the meta object for class '{@link org.hl7.knowledgeartifact.r1.Condition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Condition</em>'.
	 * @see org.hl7.knowledgeartifact.r1.Condition
	 * @generated
	 */
	EClass getCondition();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.knowledgeartifact.r1.Condition#getLogic <em>Logic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Logic</em>'.
	 * @see org.hl7.knowledgeartifact.r1.Condition#getLogic()
	 * @see #getCondition()
	 * @generated
	 */
	EReference getCondition_Logic();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.knowledgeartifact.r1.Condition#getConditionRole <em>Condition Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition Role</em>'.
	 * @see org.hl7.knowledgeartifact.r1.Condition#getConditionRole()
	 * @see #getCondition()
	 * @generated
	 */
	EReference getCondition_ConditionRole();

	/**
	 * Returns the meta object for class '{@link org.hl7.knowledgeartifact.r1.ConditionRoleType1 <em>Condition Role Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Condition Role Type1</em>'.
	 * @see org.hl7.knowledgeartifact.r1.ConditionRoleType1
	 * @generated
	 */
	EClass getConditionRoleType1();

	/**
	 * Returns the meta object for the attribute '{@link org.hl7.knowledgeartifact.r1.ConditionRoleType1#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.hl7.knowledgeartifact.r1.ConditionRoleType1#getValue()
	 * @see #getConditionRoleType1()
	 * @generated
	 */
	EAttribute getConditionRoleType1_Value();

	/**
	 * Returns the meta object for class '{@link org.hl7.knowledgeartifact.r1.Conditions <em>Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conditions</em>'.
	 * @see org.hl7.knowledgeartifact.r1.Conditions
	 * @generated
	 */
	EClass getConditions();

	/**
	 * Returns the meta object for the containment reference list '{@link org.hl7.knowledgeartifact.r1.Conditions#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Condition</em>'.
	 * @see org.hl7.knowledgeartifact.r1.Conditions#getCondition()
	 * @see #getConditions()
	 * @generated
	 */
	EReference getConditions_Condition();

	/**
	 * Returns the meta object for class '{@link org.hl7.knowledgeartifact.r1.ConstraintTypeType <em>Constraint Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constraint Type Type</em>'.
	 * @see org.hl7.knowledgeartifact.r1.ConstraintTypeType
	 * @generated
	 */
	EClass getConstraintTypeType();

	/**
	 * Returns the meta object for the attribute '{@link org.hl7.knowledgeartifact.r1.ConstraintTypeType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.hl7.knowledgeartifact.r1.ConstraintTypeType#getValue()
	 * @see #getConstraintTypeType()
	 * @generated
	 */
	EAttribute getConstraintTypeType_Value();

	/**
	 * Returns the meta object for class '{@link org.hl7.knowledgeartifact.r1.ContactsType <em>Contacts Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contacts Type</em>'.
	 * @see org.hl7.knowledgeartifact.r1.ContactsType
	 * @generated
	 */
	EClass getContactsType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.hl7.knowledgeartifact.r1.ContactsType#getContact <em>Contact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contact</em>'.
	 * @see org.hl7.knowledgeartifact.r1.ContactsType#getContact()
	 * @see #getContactsType()
	 * @generated
	 */
	EReference getContactsType_Contact();

	/**
	 * Returns the meta object for class '{@link org.hl7.knowledgeartifact.r1.ContentType <em>Content Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Content Type</em>'.
	 * @see org.hl7.knowledgeartifact.r1.ContentType
	 * @generated
	 */
	EClass getContentType();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.knowledgeartifact.r1.ContentType#getDiv <em>Div</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Div</em>'.
	 * @see org.hl7.knowledgeartifact.r1.ContentType#getDiv()
	 * @see #getContentType()
	 * @generated
	 */
	EReference getContentType_Div();

	/**
	 * Returns the meta object for class '{@link org.hl7.knowledgeartifact.r1.Contribution <em>Contribution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contribution</em>'.
	 * @see org.hl7.knowledgeartifact.r1.Contribution
	 * @generated
	 */
	EClass getContribution();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.knowledgeartifact.r1.Contribution#getContributor <em>Contributor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Contributor</em>'.
	 * @see org.hl7.knowledgeartifact.r1.Contribution#getContributor()
	 * @see #getContribution()
	 * @generated
	 */
	EReference getContribution_Contributor();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.knowledgeartifact.r1.Contribution#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Role</em>'.
	 * @see org.hl7.knowledgeartifact.r1.Contribution#getRole()
	 * @see #getContribution()
	 * @generated
	 */
	EReference getContribution_Role();

	/**
	 * Returns the meta object for class '{@link org.hl7.knowledgeartifact.r1.ContributionsType <em>Contributions Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contributions Type</em>'.
	 * @see org.hl7.knowledgeartifact.r1.ContributionsType
	 * @generated
	 */
	EClass getContributionsType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.hl7.knowledgeartifact.r1.ContributionsType#getContribution <em>Contribution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contribution</em>'.
	 * @see org.hl7.knowledgeartifact.r1.ContributionsType#getContribution()
	 * @see #getContributionsType()
	 * @generated
	 */
	EReference getContributionsType_Contribution();

	/**
	 * Returns the meta object for class '{@link org.hl7.knowledgeartifact.r1.Coverage <em>Coverage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Coverage</em>'.
	 * @see org.hl7.knowledgeartifact.r1.Coverage
	 * @generated
	 */
	EClass getCoverage();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.knowledgeartifact.r1.Coverage#getFocus <em>Focus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Focus</em>'.
	 * @see org.hl7.knowledgeartifact.r1.Coverage#getFocus()
	 * @see #getCoverage()
	 * @generated
	 */
	EReference getCoverage_Focus();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.knowledgeartifact.r1.Coverage#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see org.hl7.knowledgeartifact.r1.Coverage#getDescription()
	 * @see #getCoverage()
	 * @generated
	 */
	EReference getCoverage_Description();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.knowledgeartifact.r1.Coverage#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see org.hl7.knowledgeartifact.r1.Coverage#getValue()
	 * @see #getCoverage()
	 * @generated
	 */
	EReference getCoverage_Value();

	/**
	 * Returns the meta object for class '{@link org.hl7.knowledgeartifact.r1.CreateAction <em>Create Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Create Action</em>'.
	 * @see org.hl7.knowledgeartifact.r1.CreateAction
	 * @generated
	 */
	EClass getCreateAction();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.knowledgeartifact.r1.CreateAction#getActionSentence <em>Action Sentence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Action Sentence</em>'.
	 * @see org.hl7.knowledgeartifact.r1.CreateAction#getActionSentence()
	 * @see #getCreateAction()
	 * @generated
	 */
	EReference getCreateAction_ActionSentence();

	/**
	 * Returns the meta object for class '{@link org.hl7.knowledgeartifact.r1.DataEventTrigger <em>Data Event Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Event Trigger</em>'.
	 * @see org.hl7.knowledgeartifact.r1.DataEventTrigger
	 * @generated
	 */
	EClass getDataEventTrigger();

	/**
	 * Returns the meta object for the attribute '{@link org.hl7.knowledgeartifact.r1.DataEventTrigger#getTriggerType <em>Trigger Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Trigger Type</em>'.
	 * @see org.hl7.knowledgeartifact.r1.DataEventTrigger#getTriggerType()
	 * @see #getDataEventTrigger()
	 * @generated
	 */
	EAttribute getDataEventTrigger_TriggerType();

	/**
	 * Returns the meta object for class '{@link org.hl7.knowledgeartifact.r1.DataModelsType <em>Data Models Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Models Type</em>'.
	 * @see org.hl7.knowledgeartifact.r1.DataModelsType
	 * @generated
	 */
	EClass getDataModelsType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.hl7.knowledgeartifact.r1.DataModelsType#getModelReference <em>Model Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Model Reference</em>'.
	 * @see org.hl7.knowledgeartifact.r1.DataModelsType#getModelReference()
	 * @see #getDataModelsType()
	 * @generated
	 */
	EReference getDataModelsType_ModelReference();

	/**
	 * Returns the meta object for class '{@link org.hl7.knowledgeartifact.r1.DeclareResponseAction <em>Declare Response Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Declare Response Action</em>'.
	 * @see org.hl7.knowledgeartifact.r1.DeclareResponseAction
	 * @generated
	 */
	EClass getDeclareResponseAction();

	/**
	 * Returns the meta object for the attribute '{@link org.hl7.knowledgeartifact.r1.DeclareResponseAction#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.hl7.knowledgeartifact.r1.DeclareResponseAction#getName()
	 * @see #getDeclareResponseAction()
	 * @generated
	 */
	EAttribute getDeclareResponseAction_Name();

	/**
	 * Returns the meta object for class '{@link org.hl7.knowledgeartifact.r1.DocumentationItem <em>Documentation Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Documentation Item</em>'.
	 * @see org.hl7.knowledgeartifact.r1.DocumentationItem
	 * @generated
	 */
	EClass getDocumentationItem();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.knowledgeartifact.r1.DocumentationItem#getPrompt <em>Prompt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Prompt</em>'.
	 * @see org.hl7.knowledgeartifact.r1.DocumentationItem#getPrompt()
	 * @see #getDocumentationItem()
	 * @generated
	 */
	EReference getDocumentationItem_Prompt();

	/**
	 * Returns the meta object for the containment reference list '{@link org.hl7.knowledgeartifact.r1.DocumentationItem#getAdditionalInstructions <em>Additional Instructions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Additional Instructions</em>'.
	 * @see org.hl7.knowledgeartifact.r1.DocumentationItem#getAdditionalInstructions()
	 * @see #getDocumentationItem()
	 * @generated
	 */
	EReference getDocumentationItem_AdditionalInstructions();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.knowledgeartifact.r1.DocumentationItem#getTextAfterResponse <em>Text After Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Text After Response</em>'.
	 * @see org.hl7.knowledgeartifact.r1.DocumentationItem#getTextAfterResponse()
	 * @see #getDocumentationItem()
	 * @generated
	 */
	EReference getDocumentationItem_TextAfterResponse();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.knowledgeartifact.r1.DocumentationItem#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see org.hl7.knowledgeartifact.r1.DocumentationItem#getDescription()
	 * @see #getDocumentationItem()
	 * @generated
	 */
	EReference getDocumentationItem_Description();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.knowledgeartifact.r1.DocumentationItem#getItemCodes <em>Item Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Item Codes</em>'.
	 * @see org.hl7.knowledgeartifact.r1.DocumentationItem#getItemCodes()
	 * @see #getDocumentationItem()
	 * @generated
	 */
	EReference getDocumentationItem_ItemCodes();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.knowledgeartifact.r1.DocumentationItem#getResponseDataType <em>Response Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Response Data Type</em>'.
	 * @see org.hl7.knowledgeartifact.r1.DocumentationItem#getResponseDataType()
	 * @see #getDocumentationItem()
	 * @generated
	 */
	EReference getDocumentationItem_ResponseDataType();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.knowledgeartifact.r1.DocumentationItem#getResponseCardinality <em>Response Cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Response Cardinality</em>'.
	 * @see org.hl7.knowledgeartifact.r1.DocumentationItem#getResponseCardinality()
	 * @see #getDocumentationItem()
	 * @generated
	 */
	EReference getDocumentationItem_ResponseCardinality();

	/**
	 * Returns the meta object for the containment reference list '{@link org.hl7.knowledgeartifact.r1.DocumentationItem#getResponseRange <em>Response Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Response Range</em>'.
	 * @see org.hl7.knowledgeartifact.r1.DocumentationItem#getResponseRange()
	 * @see #getDocumentationItem()
	 * @generated
	 */
	EReference getDocumentationItem_ResponseRange();

	/**
	 * Returns the meta object for class '{@link org.hl7.knowledgeartifact.r1.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see org.hl7.knowledgeartifact.r1.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link org.hl7.knowledgeartifact.r1.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.hl7.knowledgeartifact.r1.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link org.hl7.knowledgeartifact.r1.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see org.hl7.knowledgeartifact.r1.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link org.hl7.knowledgeartifact.r1.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see org.hl7.knowledgeartifact.r1.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.knowledgeartifact.r1.DocumentRoot#getKnowledgeDocument <em>Knowledge Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Knowledge Document</em>'.
	 * @see org.hl7.knowledgeartifact.r1.DocumentRoot#getKnowledgeDocument()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_KnowledgeDocument();

	/**
	 * Returns the meta object for class '{@link org.hl7.knowledgeartifact.r1.EnumerationConstraint <em>Enumeration Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enumeration Constraint</em>'.
	 * @see org.hl7.knowledgeartifact.r1.EnumerationConstraint
	 * @generated
	 */
	EClass getEnumerationConstraint();

	/**
	 * Returns the meta object for the containment reference list '{@link org.hl7.knowledgeartifact.r1.EnumerationConstraint#getItem <em>Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Item</em>'.
	 * @see org.hl7.knowledgeartifact.r1.EnumerationConstraint#getItem()
	 * @see #getEnumerationConstraint()
	 * @generated
	 */
	EReference getEnumerationConstraint_Item();

	/**
	 * Returns the meta object for the attribute '{@link org.hl7.knowledgeartifact.r1.EnumerationConstraint#isStrictSelection <em>Strict Selection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Strict Selection</em>'.
	 * @see org.hl7.knowledgeartifact.r1.EnumerationConstraint#isStrictSelection()
	 * @see #getEnumerationConstraint()
	 * @generated
	 */
	EAttribute getEnumerationConstraint_StrictSelection();

	/**
	 * Returns the meta object for class '{@link org.hl7.knowledgeartifact.r1.EnumerationItem <em>Enumeration Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enumeration Item</em>'.
	 * @see org.hl7.knowledgeartifact.r1.EnumerationItem
	 * @generated
	 */
	EClass getEnumerationItem();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.knowledgeartifact.r1.EnumerationItem#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Identifier</em>'.
	 * @see org.hl7.knowledgeartifact.r1.EnumerationItem#getIdentifier()
	 * @see #getEnumerationItem()
	 * @generated
	 */
	EReference getEnumerationItem_Identifier();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.knowledgeartifact.r1.EnumerationItem#getNumber <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Number</em>'.
	 * @see org.hl7.knowledgeartifact.r1.EnumerationItem#getNumber()
	 * @see #getEnumerationItem()
	 * @generated
	 */
	EReference getEnumerationItem_Number();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.knowledgeartifact.r1.EnumerationItem#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see org.hl7.knowledgeartifact.r1.EnumerationItem#getValue()
	 * @see #getEnumerationItem()
	 * @generated
	 */
	EReference getEnumerationItem_Value();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.knowledgeartifact.r1.EnumerationItem#getCodes <em>Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Codes</em>'.
	 * @see org.hl7.knowledgeartifact.r1.EnumerationItem#getCodes()
	 * @see #getEnumerationItem()
	 * @generated
	 */
	EReference getEnumerationItem_Codes();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.knowledgeartifact.r1.EnumerationItem#getDisplayText <em>Display Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Display Text</em>'.
	 * @see org.hl7.knowledgeartifact.r1.EnumerationItem#getDisplayText()
	 * @see #getEnumerationItem()
	 * @generated
	 */
	EReference getEnumerationItem_DisplayText();

	/**
	 * Returns the meta object for the containment reference list '{@link org.hl7.knowledgeartifact.r1.EnumerationItem#getAdditionalInstructions <em>Additional Instructions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Additional Instructions</em>'.
	 * @see org.hl7.knowledgeartifact.r1.EnumerationItem#getAdditionalInstructions()
	 * @see #getEnumerationItem()
	 * @generated
	 */
	EReference getEnumerationItem_AdditionalInstructions();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.knowledgeartifact.r1.EnumerationItem#getValueMeaning <em>Value Meaning</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value Meaning</em>'.
	 * @see org.hl7.knowledgeartifact.r1.EnumerationItem#getValueMeaning()
	 * @see #getEnumerationItem()
	 * @generated
	 */
	EReference getEnumerationItem_ValueMeaning();

	/**
	 * Returns the meta object for the attribute '{@link org.hl7.knowledgeartifact.r1.EnumerationItem#isFillIn <em>Fill In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fill In</em>'.
	 * @see org.hl7.knowledgeartifact.r1.EnumerationItem#isFillIn()
	 * @see #getEnumerationItem()
	 * @generated
	 */
	EAttribute getEnumerationItem_FillIn();

	/**
	 * Returns the meta object for class '{@link org.hl7.knowledgeartifact.r1.EventHistoryType <em>Event History Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event History Type</em>'.
	 * @see org.hl7.knowledgeartifact.r1.EventHistoryType
	 * @generated
	 */
	EClass getEventHistoryType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.hl7.knowledgeartifact.r1.EventHistoryType#getArtifactLifeCycleEvent <em>Artifact Life Cycle Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Artifact Life Cycle Event</em>'.
	 * @see org.hl7.knowledgeartifact.r1.EventHistoryType#getArtifactLifeCycleEvent()
	 * @see #getEventHistoryType()
	 * @generated
	 */
	EReference getEventHistoryType_ArtifactLifeCycleEvent();

	/**
	 * Returns the meta object for class '{@link org.hl7.knowledgeartifact.r1.EventTypeType <em>Event Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event Type Type</em>'.
	 * @see org.hl7.knowledgeartifact.r1.EventTypeType
	 * @generated
	 */
	EClass getEventTypeType();

	/**
	 * Returns the meta object for the attribute '{@link org.hl7.knowledgeartifact.r1.EventTypeType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.hl7.knowledgeartifact.r1.EventTypeType#getValue()
	 * @see #getEventTypeType()
	 * @generated
	 */
	EAttribute getEventTypeType_Value();

	/**
	 * Returns the meta object for class '{@link org.hl7.knowledgeartifact.r1.Evidence <em>Evidence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Evidence</em>'.
	 * @see org.hl7.knowledgeartifact.r1.Evidence
	 * @generated
	 */
	EClass getEvidence();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.knowledgeartifact.r1.Evidence#getQualityOfEvidence <em>Quality Of Evidence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Quality Of Evidence</em>'.
	 * @see org.hl7.knowledgeartifact.r1.Evidence#getQualityOfEvidence()
	 * @see #getEvidence()
	 * @generated
	 */
	EReference getEvidence_QualityOfEvidence();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.knowledgeartifact.r1.Evidence#getStrengthOfRecommendation <em>Strength Of Recommendation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Strength Of Recommendation</em>'.
	 * @see org.hl7.knowledgeartifact.r1.Evidence#getStrengthOfRecommendation()
	 * @see #getEvidence()
	 * @generated
	 */
	EReference getEvidence_StrengthOfRecommendation();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.knowledgeartifact.r1.Evidence#getResources <em>Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Resources</em>'.
	 * @see org.hl7.knowledgeartifact.r1.Evidence#getResources()
	 * @see #getEvidence()
	 * @generated
	 */
	EReference getEvidence_Resources();

	/**
	 * Returns the meta object for class '{@link org.hl7.knowledgeartifact.r1.ExpressionConstraint <em>Expression Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression Constraint</em>'.
	 * @see org.hl7.knowledgeartifact.r1.ExpressionConstraint
	 * @generated
	 */
	EClass getExpressionConstraint();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.knowledgeartifact.r1.ExpressionConstraint#getConstraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Constraint</em>'.
	 * @see org.hl7.knowledgeartifact.r1.ExpressionConstraint#getConstraint()
	 * @see #getExpressionConstraint()
	 * @generated
	 */
	EReference getExpressionConstraint_Constraint();

	/**
	 * Returns the meta object for class '{@link org.hl7.knowledgeartifact.r1.ExpressionsType <em>Expressions Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expressions Type</em>'.
	 * @see org.hl7.knowledgeartifact.r1.ExpressionsType
	 * @generated
	 */
	EClass getExpressionsType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.hl7.knowledgeartifact.r1.ExpressionsType#getDef <em>Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Def</em>'.
	 * @see org.hl7.knowledgeartifact.r1.ExpressionsType#getDef()
	 * @see #getExpressionsType()
	 * @generated
	 */
	EReference getExpressionsType_Def();

	/**
	 * Returns the meta object for class '{@link org.hl7.knowledgeartifact.r1.ExternalDataType <em>External Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>External Data Type</em>'.
	 * @see org.hl7.knowledgeartifact.r1.ExternalDataType
	 * @generated
	 */
	EClass getExternalDataType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.hl7.knowledgeartifact.r1.ExternalDataType#getCodesystem <em>Codesystem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Codesystem</em>'.
	 * @see org.hl7.knowledgeartifact.r1.ExternalDataType#getCodesystem()
	 * @see #getExternalDataType()
	 * @generated
	 */
	EReference getExternalDataType_Codesystem();

	/**
	 * Returns the meta object for the containment reference list '{@link org.hl7.knowledgeartifact.r1.ExternalDataType#getValueset <em>Valueset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Valueset</em>'.
	 * @see org.hl7.knowledgeartifact.r1.ExternalDataType#getValueset()
	 * @see #getExternalDataType()
	 * @generated
	 */
	EReference getExternalDataType_Valueset();

	/**
	 * Returns the meta object for the containment reference list '{@link org.hl7.knowledgeartifact.r1.ExternalDataType#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameter</em>'.
	 * @see org.hl7.knowledgeartifact.r1.ExternalDataType#getParameter()
	 * @see #getExternalDataType()
	 * @generated
	 */
	EReference getExternalDataType_Parameter();

	/**
	 * Returns the meta object for the containment reference list '{@link org.hl7.knowledgeartifact.r1.ExternalDataType#getDef <em>Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Def</em>'.
	 * @see org.hl7.knowledgeartifact.r1.ExternalDataType#getDef()
	 * @see #getExternalDataType()
	 * @generated
	 */
	EReference getExternalDataType_Def();

	/**
	 * Returns the meta object for the containment reference list '{@link org.hl7.knowledgeartifact.r1.ExternalDataType#getTrigger <em>Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Trigger</em>'.
	 * @see org.hl7.knowledgeartifact.r1.ExternalDataType#getTrigger()
	 * @see #getExternalDataType()
	 * @generated
	 */
	EReference getExternalDataType_Trigger();

	/**
	 * Returns the meta object for class '{@link org.hl7.knowledgeartifact.r1.FireEventAction <em>Fire Event Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fire Event Action</em>'.
	 * @see org.hl7.knowledgeartifact.r1.FireEventAction
	 * @generated
	 */
	EClass getFireEventAction();

	/**
	 * Returns the meta object for the attribute '{@link org.hl7.knowledgeartifact.r1.FireEventAction#getEventType <em>Event Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Event Type</em>'.
	 * @see org.hl7.knowledgeartifact.r1.FireEventAction#getEventType()
	 * @see #getFireEventAction()
	 * @generated
	 */
	EAttribute getFireEventAction_EventType();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.knowledgeartifact.r1.FireEventAction#getActionSentence <em>Action Sentence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Action Sentence</em>'.
	 * @see org.hl7.knowledgeartifact.r1.FireEventAction#getActionSentence()
	 * @see #getFireEventAction()
	 * @generated
	 */
	EReference getFireEventAction_ActionSentence();

	/**
	 * Returns the meta object for class '{@link org.hl7.knowledgeartifact.r1.FocusType <em>Focus Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Focus Type</em>'.
	 * @see org.hl7.knowledgeartifact.r1.FocusType
	 * @generated
	 */
	EClass getFocusType();

	/**
	 * Returns the meta object for the attribute '{@link org.hl7.knowledgeartifact.r1.FocusType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.hl7.knowledgeartifact.r1.FocusType#getValue()
	 * @see #getFocusType()
	 * @generated
	 */
	EAttribute getFocusType_Value();

	/**
	 * Returns the meta object for class '{@link org.hl7.knowledgeartifact.r1.FormattedNumber <em>Formatted Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Formatted Number</em>'.
	 * @see org.hl7.knowledgeartifact.r1.FormattedNumber
	 * @generated
	 */
	EClass getFormattedNumber();

	/**
	 * Returns the meta object for the attribute '{@link org.hl7.knowledgeartifact.r1.FormattedNumber#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see org.hl7.knowledgeartifact.r1.FormattedNumber#getLabel()
	 * @see #getFormattedNumber()
	 * @generated
	 */
	EAttribute getFormattedNumber_Label();

	/**
	 * Returns the meta object for the attribute list '{@link org.hl7.knowledgeartifact.r1.FormattedNumber#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Style</em>'.
	 * @see org.hl7.knowledgeartifact.r1.FormattedNumber#getStyle()
	 * @see #getFormattedNumber()
	 * @generated
	 */
	EAttribute getFormattedNumber_Style();

	/**
	 * Returns the meta object for the attribute '{@link org.hl7.knowledgeartifact.r1.FormattedNumber#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.hl7.knowledgeartifact.r1.FormattedNumber#getValue()
	 * @see #getFormattedNumber()
	 * @generated
	 */
	EAttribute getFormattedNumber_Value();

	/**
	 * Returns the meta object for class '{@link org.hl7.knowledgeartifact.r1.FormattedText <em>Formatted Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Formatted Text</em>'.
	 * @see org.hl7.knowledgeartifact.r1.FormattedText
	 * @generated
	 */
	EClass getFormattedText();

	/**
	 * Returns the meta object for the attribute '{@link org.hl7.knowledgeartifact.r1.FormattedText#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see org.hl7.knowledgeartifact.r1.FormattedText#getLabel()
	 * @see #getFormattedText()
	 * @generated
	 */
	EAttribute getFormattedText_Label();

	/**
	 * Returns the meta object for the attribute list '{@link org.hl7.knowledgeartifact.r1.FormattedText#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Style</em>'.
	 * @see org.hl7.knowledgeartifact.r1.FormattedText#getStyle()
	 * @see #getFormattedText()
	 * @generated
	 */
	EAttribute getFormattedText_Style();

	/**
	 * Returns the meta object for the attribute '{@link org.hl7.knowledgeartifact.r1.FormattedText#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.hl7.knowledgeartifact.r1.FormattedText#getValue()
	 * @see #getFormattedText()
	 * @generated
	 */
	EAttribute getFormattedText_Value();

	/**
	 * Returns the meta object for class '{@link org.hl7.knowledgeartifact.r1.GroupOrganizationBehavior <em>Group Organization Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Group Organization Behavior</em>'.
	 * @see org.hl7.knowledgeartifact.r1.GroupOrganizationBehavior
	 * @generated
	 */
	EClass getGroupOrganizationBehavior();

	/**
	 * Returns the meta object for class '{@link org.hl7.knowledgeartifact.r1.GroupSelectionBehavior <em>Group Selection Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Group Selection Behavior</em>'.
	 * @see org.hl7.knowledgeartifact.r1.GroupSelectionBehavior
	 * @generated
	 */
	EClass getGroupSelectionBehavior();

	/**
	 * Returns the meta object for class '{@link org.hl7.knowledgeartifact.r1.IdentifiersType <em>Identifiers Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Identifiers Type</em>'.
	 * @see org.hl7.knowledgeartifact.r1.IdentifiersType
	 * @generated
	 */
	EClass getIdentifiersType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.hl7.knowledgeartifact.r1.IdentifiersType#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Identifier</em>'.
	 * @see org.hl7.knowledgeartifact.r1.IdentifiersType#getIdentifier()
	 * @see #getIdentifiersType()
	 * @generated
	 */
	EReference getIdentifiersType_Identifier();

	/**
	 * Returns the meta object for class '{@link org.hl7.knowledgeartifact.r1.IdentifiersType1 <em>Identifiers Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Identifiers Type1</em>'.
	 * @see org.hl7.knowledgeartifact.r1.IdentifiersType1
	 * @generated
	 */
	EClass getIdentifiersType1();

	/**
	 * Returns the meta object for the containment reference list '{@link org.hl7.knowledgeartifact.r1.IdentifiersType1#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Identifier</em>'.
	 * @see org.hl7.knowledgeartifact.r1.IdentifiersType1#getIdentifier()
	 * @see #getIdentifiersType1()
	 * @generated
	 */
	EReference getIdentifiersType1_Identifier();

	/**
	 * Returns the meta object for class '{@link org.hl7.knowledgeartifact.r1.InlineResource <em>Inline Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inline Resource</em>'.
	 * @see org.hl7.knowledgeartifact.r1.InlineResource
	 * @generated
	 */
	EClass getInlineResource();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.knowledgeartifact.r1.InlineResource#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Content</em>'.
	 * @see org.hl7.knowledgeartifact.r1.InlineResource#getContent()
	 * @see #getInlineResource()
	 * @generated
	 */
	EReference getInlineResource_Content();

	/**
	 * Returns the meta object for class '{@link org.hl7.knowledgeartifact.r1.ItemCodesType <em>Item Codes Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Item Codes Type</em>'.
	 * @see org.hl7.knowledgeartifact.r1.ItemCodesType
	 * @generated
	 */
	EClass getItemCodesType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.hl7.knowledgeartifact.r1.ItemCodesType#getItemCode <em>Item Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Item Code</em>'.
	 * @see org.hl7.knowledgeartifact.r1.ItemCodesType#getItemCode()
	 * @see #getItemCodesType()
	 * @generated
	 */
	EReference getItemCodesType_ItemCode();

	/**
	 * Returns the meta object for class '{@link org.hl7.knowledgeartifact.r1.ItemDefinition <em>Item Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Item Definition</em>'.
	 * @see org.hl7.knowledgeartifact.r1.ItemDefinition
	 * @generated
	 */
	EClass getItemDefinition();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.knowledgeartifact.r1.ItemDefinition#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Identifier</em>'.
	 * @see org.hl7.knowledgeartifact.r1.ItemDefinition#getIdentifier()
	 * @see #getItemDefinition()
	 * @generated
	 */
	EReference getItemDefinition_Identifier();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.knowledgeartifact.r1.ItemDefinition#getScopedIdentifier <em>Scoped Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Scoped Identifier</em>'.
	 * @see org.hl7.knowledgeartifact.r1.ItemDefinition#getScopedIdentifier()
	 * @see #getItemDefinition()
	 * @generated
	 */
	EReference getItemDefinition_ScopedIdentifier();

	/**
	 * Returns the meta object for class '{@link org.hl7.knowledgeartifact.r1.KeyTermsType <em>Key Terms Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Key Terms Type</em>'.
	 * @see org.hl7.knowledgeartifact.r1.KeyTermsType
	 * @generated
	 */
	EClass getKeyTermsType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.hl7.knowledgeartifact.r1.KeyTermsType#getTerm <em>Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Term</em>'.
	 * @see org.hl7.knowledgeartifact.r1.KeyTermsType#getTerm()
	 * @see #getKeyTermsType()
	 * @generated
	 */
	EReference getKeyTermsType_Term();

	/**
	 * Returns the meta object for class '{@link org.hl7.knowledgeartifact.r1.KnowledgeDocument <em>Knowledge Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Knowledge Document</em>'.
	 * @see org.hl7.knowledgeartifact.r1.KnowledgeDocument
	 * @generated
	 */
	EClass getKnowledgeDocument();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.knowledgeartifact.r1.KnowledgeDocument#getMetadata <em>Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Metadata</em>'.
	 * @see org.hl7.knowledgeartifact.r1.KnowledgeDocument#getMetadata()
	 * @see #getKnowledgeDocument()
	 * @generated
	 */
	EReference getKnowledgeDocument_Metadata();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.knowledgeartifact.r1.KnowledgeDocument#getExternalData <em>External Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>External Data</em>'.
	 * @see org.hl7.knowledgeartifact.r1.KnowledgeDocument#getExternalData()
	 * @see #getKnowledgeDocument()
	 * @generated
	 */
	EReference getKnowledgeDocument_ExternalData();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.knowledgeartifact.r1.KnowledgeDocument#getExpressions <em>Expressions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expressions</em>'.
	 * @see org.hl7.knowledgeartifact.r1.KnowledgeDocument#getExpressions()
	 * @see #getKnowledgeDocument()
	 * @generated
	 */
	EReference getKnowledgeDocument_Expressions();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.knowledgeartifact.r1.KnowledgeDocument#getTriggers <em>Triggers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Triggers</em>'.
	 * @see org.hl7.knowledgeartifact.r1.KnowledgeDocument#getTriggers()
	 * @see #getKnowledgeDocument()
	 * @generated
	 */
	EReference getKnowledgeDocument_Triggers();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.knowledgeartifact.r1.KnowledgeDocument#getConditions <em>Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Conditions</em>'.
	 * @see org.hl7.knowledgeartifact.r1.KnowledgeDocument#getConditions()
	 * @see #getKnowledgeDocument()
	 * @generated
	 */
	EReference getKnowledgeDocument_Conditions();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.knowledgeartifact.r1.KnowledgeDocument#getBehaviors <em>Behaviors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Behaviors</em>'.
	 * @see org.hl7.knowledgeartifact.r1.KnowledgeDocument#getBehaviors()
	 * @see #getKnowledgeDocument()
	 * @generated
	 */
	EReference getKnowledgeDocument_Behaviors();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.knowledgeartifact.r1.KnowledgeDocument#getActionGroup <em>Action Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Action Group</em>'.
	 * @see org.hl7.knowledgeartifact.r1.KnowledgeDocument#getActionGroup()
	 * @see #getKnowledgeDocument()
	 * @generated
	 */
	EReference getKnowledgeDocument_ActionGroup();

	/**
	 * Returns the meta object for class '{@link org.hl7.knowledgeartifact.r1.KnowledgeResource <em>Knowledge Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Knowledge Resource</em>'.
	 * @see org.hl7.knowledgeartifact.r1.KnowledgeResource
	 * @generated
	 */
	EClass getKnowledgeResource();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.knowledgeartifact.r1.KnowledgeResource#getIdentifiers <em>Identifiers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Identifiers</em>'.
	 * @see org.hl7.knowledgeartifact.r1.KnowledgeResource#getIdentifiers()
	 * @see #getKnowledgeResource()
	 * @generated
	 */
	EReference getKnowledgeResource_Identifiers();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.knowledgeartifact.r1.KnowledgeResource#getTemplateIds <em>Template Ids</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Template Ids</em>'.
	 * @see org.hl7.knowledgeartifact.r1.KnowledgeResource#getTemplateIds()
	 * @see #getKnowledgeResource()
	 * @generated
	 */
	EReference getKnowledgeResource_TemplateIds();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.knowledgeartifact.r1.KnowledgeResource#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Title</em>'.
	 * @see org.hl7.knowledgeartifact.r1.KnowledgeResource#getTitle()
	 * @see #getKnowledgeResource()
	 * @generated
	 */
	EReference getKnowledgeResource_Title();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.knowledgeartifact.r1.KnowledgeResource#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Location</em>'.
	 * @see org.hl7.knowledgeartifact.r1.KnowledgeResource#getLocation()
	 * @see #getKnowledgeResource()
	 * @generated
	 */
	EReference getKnowledgeResource_Location();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.knowledgeartifact.r1.KnowledgeResource#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see org.hl7.knowledgeartifact.r1.KnowledgeResource#getDescription()
	 * @see #getKnowledgeResource()
	 * @generated
	 */
	EReference getKnowledgeResource_Description();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.knowledgeartifact.r1.KnowledgeResource#getCitation <em>Citation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Citation</em>'.
	 * @see org.hl7.knowledgeartifact.r1.KnowledgeResource#getCitation()
	 * @see #getKnowledgeResource()
	 * @generated
	 */
	EReference getKnowledgeResource_Citation();

	/**
	 * Returns the meta object for class '{@link org.hl7.knowledgeartifact.r1.LibrariesType <em>Libraries Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Libraries Type</em>'.
	 * @see org.hl7.knowledgeartifact.r1.LibrariesType
	 * @generated
	 */
	EClass getLibrariesType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.hl7.knowledgeartifact.r1.LibrariesType#getLibraryReference <em>Library Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Library Reference</em>'.
	 * @see org.hl7.knowledgeartifact.r1.LibrariesType#getLibraryReference()
	 * @see #getLibrariesType()
	 * @generated
	 */
	EReference getLibrariesType_LibraryReference();

	/**
	 * Returns the meta object for class '{@link org.hl7.knowledgeartifact.r1.LibraryReference <em>Library Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Library Reference</em>'.
	 * @see org.hl7.knowledgeartifact.r1.LibraryReference
	 * @generated
	 */
	EClass getLibraryReference();

	/**
	 * Returns the meta object for the attribute '{@link org.hl7.knowledgeartifact.r1.LibraryReference#getMediaType <em>Media Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Media Type</em>'.
	 * @see org.hl7.knowledgeartifact.r1.LibraryReference#getMediaType()
	 * @see #getLibraryReference()
	 * @generated
	 */
	EAttribute getLibraryReference_MediaType();

	/**
	 * Returns the meta object for the attribute '{@link org.hl7.knowledgeartifact.r1.LibraryReference#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.hl7.knowledgeartifact.r1.LibraryReference#getName()
	 * @see #getLibraryReference()
	 * @generated
	 */
	EAttribute getLibraryReference_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.hl7.knowledgeartifact.r1.LibraryReference#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see org.hl7.knowledgeartifact.r1.LibraryReference#getPath()
	 * @see #getLibraryReference()
	 * @generated
	 */
	EAttribute getLibraryReference_Path();

	/**
	 * Returns the meta object for the attribute '{@link org.hl7.knowledgeartifact.r1.LibraryReference#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see org.hl7.knowledgeartifact.r1.LibraryReference#getVersion()
	 * @see #getLibraryReference()
	 * @generated
	 */
	EAttribute getLibraryReference_Version();

	/**
	 * Returns the meta object for class '{@link org.hl7.knowledgeartifact.r1.LookupConstraint <em>Lookup Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lookup Constraint</em>'.
	 * @see org.hl7.knowledgeartifact.r1.LookupConstraint
	 * @generated
	 */
	EClass getLookupConstraint();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.knowledgeartifact.r1.LookupConstraint#getItems <em>Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Items</em>'.
	 * @see org.hl7.knowledgeartifact.r1.LookupConstraint#getItems()
	 * @see #getLookupConstraint()
	 * @generated
	 */
	EReference getLookupConstraint_Items();

	/**
	 * Returns the meta object for the attribute '{@link org.hl7.knowledgeartifact.r1.LookupConstraint#getDisplayField <em>Display Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Display Field</em>'.
	 * @see org.hl7.knowledgeartifact.r1.LookupConstraint#getDisplayField()
	 * @see #getLookupConstraint()
	 * @generated
	 */
	EAttribute getLookupConstraint_DisplayField();

	/**
	 * Returns the meta object for the attribute '{@link org.hl7.knowledgeartifact.r1.LookupConstraint#isStrictSelection <em>Strict Selection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Strict Selection</em>'.
	 * @see org.hl7.knowledgeartifact.r1.LookupConstraint#isStrictSelection()
	 * @see #getLookupConstraint()
	 * @generated
	 */
	EAttribute getLookupConstraint_StrictSelection();

	/**
	 * Returns the meta object for class '{@link org.hl7.knowledgeartifact.r1.MaskConstraint <em>Mask Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mask Constraint</em>'.
	 * @see org.hl7.knowledgeartifact.r1.MaskConstraint
	 * @generated
	 */
	EClass getMaskConstraint();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.knowledgeartifact.r1.MaskConstraint#getMaskExpression <em>Mask Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Mask Expression</em>'.
	 * @see org.hl7.knowledgeartifact.r1.MaskConstraint#getMaskExpression()
	 * @see #getMaskConstraint()
	 * @generated
	 */
	EReference getMaskConstraint_MaskExpression();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.knowledgeartifact.r1.MaskConstraint#getMaskHelp <em>Mask Help</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Mask Help</em>'.
	 * @see org.hl7.knowledgeartifact.r1.MaskConstraint#getMaskHelp()
	 * @see #getMaskConstraint()
	 * @generated
	 */
	EReference getMaskConstraint_MaskHelp();

	/**
	 * Returns the meta object for class '{@link org.hl7.knowledgeartifact.r1.Metadata <em>Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Metadata</em>'.
	 * @see org.hl7.knowledgeartifact.r1.Metadata
	 * @generated
	 */
	EClass getMetadata();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.knowledgeartifact.r1.Metadata#getIdentifiers <em>Identifiers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Identifiers</em>'.
	 * @see org.hl7.knowledgeartifact.r1.Metadata#getIdentifiers()
	 * @see #getMetadata()
	 * @generated
	 */
	EReference getMetadata_Identifiers();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.knowledgeartifact.r1.Metadata#getArtifactType <em>Artifact Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Artifact Type</em>'.
	 * @see org.hl7.knowledgeartifact.r1.Metadata#getArtifactType()
	 * @see #getMetadata()
	 * @generated
	 */
	EReference getMetadata_ArtifactType();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.knowledgeartifact.r1.Metadata#getSchemaIdentifier <em>Schema Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Schema Identifier</em>'.
	 * @see org.hl7.knowledgeartifact.r1.Metadata#getSchemaIdentifier()
	 * @see #getMetadata()
	 * @generated
	 */
	EReference getMetadata_SchemaIdentifier();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.knowledgeartifact.r1.Metadata#getTemplateIds <em>Template Ids</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Template Ids</em>'.
	 * @see org.hl7.knowledgeartifact.r1.Metadata#getTemplateIds()
	 * @see #getMetadata()
	 * @generated
	 */
	EReference getMetadata_TemplateIds();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.knowledgeartifact.r1.Metadata#getDataModels <em>Data Models</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data Models</em>'.
	 * @see org.hl7.knowledgeartifact.r1.Metadata#getDataModels()
	 * @see #getMetadata()
	 * @generated
	 */
	EReference getMetadata_DataModels();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.knowledgeartifact.r1.Metadata#getLibraries <em>Libraries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Libraries</em>'.
	 * @see org.hl7.knowledgeartifact.r1.Metadata#getLibraries()
	 * @see #getMetadata()
	 * @generated
	 */
	EReference getMetadata_Libraries();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.knowledgeartifact.r1.Metadata#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Title</em>'.
	 * @see org.hl7.knowledgeartifact.r1.Metadata#getTitle()
	 * @see #getMetadata()
	 * @generated
	 */
	EReference getMetadata_Title();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.knowledgeartifact.r1.Metadata#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see org.hl7.knowledgeartifact.r1.Metadata#getDescription()
	 * @see #getMetadata()
	 * @generated
	 */
	EReference getMetadata_Description();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.knowledgeartifact.r1.Metadata#getDocumentation <em>Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Documentation</em>'.
	 * @see org.hl7.knowledgeartifact.r1.Metadata#getDocumentation()
	 * @see #getMetadata()
	 * @generated
	 */
	EReference getMetadata_Documentation();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.knowledgeartifact.r1.Metadata#getRelatedResources <em>Related Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Related Resources</em>'.
	 * @see org.hl7.knowledgeartifact.r1.Metadata#getRelatedResources()
	 * @see #getMetadata()
	 * @generated
	 */
	EReference getMetadata_RelatedResources();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.knowledgeartifact.r1.Metadata#getSupportingEvidence <em>Supporting Evidence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Supporting Evidence</em>'.
	 * @see org.hl7.knowledgeartifact.r1.Metadata#getSupportingEvidence()
	 * @see #getMetadata()
	 * @generated
	 */
	EReference getMetadata_SupportingEvidence();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.knowledgeartifact.r1.Metadata#getApplicability <em>Applicability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Applicability</em>'.
	 * @see org.hl7.knowledgeartifact.r1.Metadata#getApplicability()
	 * @see #getMetadata()
	 * @generated
	 */
	EReference getMetadata_Applicability();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.knowledgeartifact.r1.Metadata#getKeyTerms <em>Key Terms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Key Terms</em>'.
	 * @see org.hl7.knowledgeartifact.r1.Metadata#getKeyTerms()
	 * @see #getMetadata()
	 * @generated
	 */
	EReference getMetadata_KeyTerms();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.knowledgeartifact.r1.Metadata#getCategories <em>Categories</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Categories</em>'.
	 * @see org.hl7.knowledgeartifact.r1.Metadata#getCategories()
	 * @see #getMetadata()
	 * @generated
	 */
	EReference getMetadata_Categories();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.knowledgeartifact.r1.Metadata#getLanguage <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Language</em>'.
	 * @see org.hl7.knowledgeartifact.r1.Metadata#getLanguage()
	 * @see #getMetadata()
	 * @generated
	 */
	EReference getMetadata_Language();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.knowledgeartifact.r1.Metadata#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Status</em>'.
	 * @see org.hl7.knowledgeartifact.r1.Metadata#getStatus()
	 * @see #getMetadata()
	 * @generated
	 */
	EReference getMetadata_Status();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.knowledgeartifact.r1.Metadata#getEventHistory <em>Event History</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Event History</em>'.
	 * @see org.hl7.knowledgeartifact.r1.Metadata#getEventHistory()
	 * @see #getMetadata()
	 * @generated
	 */
	EReference getMetadata_EventHistory();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.knowledgeartifact.r1.Metadata#getContributions <em>Contributions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Contributions</em>'.
	 * @see org.hl7.knowledgeartifact.r1.Metadata#getContributions()
	 * @see #getMetadata()
	 * @generated
	 */
	EReference getMetadata_Contributions();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.knowledgeartifact.r1.Metadata#getPublishers <em>Publishers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Publishers</em>'.
	 * @see org.hl7.knowledgeartifact.r1.Metadata#getPublishers()
	 * @see #getMetadata()
	 * @generated
	 */
	EReference getMetadata_Publishers();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.knowledgeartifact.r1.Metadata#getUsageTerms <em>Usage Terms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Usage Terms</em>'.
	 * @see org.hl7.knowledgeartifact.r1.Metadata#getUsageTerms()
	 * @see #getMetadata()
	 * @generated
	 */
	EReference getMetadata_UsageTerms();

	/**
	 * Returns the meta object for class '{@link org.hl7.knowledgeartifact.r1.ModelReference <em>Model Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Reference</em>'.
	 * @see org.hl7.knowledgeartifact.r1.ModelReference
	 * @generated
	 */
	EClass getModelReference();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.knowledgeartifact.r1.ModelReference#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see org.hl7.knowledgeartifact.r1.ModelReference#getDescription()
	 * @see #getModelReference()
	 * @generated
	 */
	EReference getModelReference_Description();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.knowledgeartifact.r1.ModelReference#getReferencedModel <em>Referenced Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Referenced Model</em>'.
	 * @see org.hl7.knowledgeartifact.r1.ModelReference#getReferencedModel()
	 * @see #getModelReference()
	 * @generated
	 */
	EReference getModelReference_ReferencedModel();

	/**
	 * Returns the meta object for class '{@link org.hl7.knowledgeartifact.r1.NamedEventTrigger <em>Named Event Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Event Trigger</em>'.
	 * @see org.hl7.knowledgeartifact.r1.NamedEventTrigger
	 * @generated
	 */
	EClass getNamedEventTrigger();

	/**
	 * Returns the meta object for the attribute '{@link org.hl7.knowledgeartifact.r1.NamedEventTrigger#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.hl7.knowledgeartifact.r1.NamedEventTrigger#getName()
	 * @see #getNamedEventTrigger()
	 * @generated
	 */
	EAttribute getNamedEventTrigger_Name();

	/**
	 * Returns the meta object for class '{@link org.hl7.knowledgeartifact.r1.Organization <em>Organization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Organization</em>'.
	 * @see org.hl7.knowledgeartifact.r1.Organization
	 * @generated
	 */
	EClass getOrganization();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.knowledgeartifact.r1.Organization#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Name</em>'.
	 * @see org.hl7.knowledgeartifact.r1.Organization#getName()
	 * @see #getOrganization()
	 * @generated
	 */
	EReference getOrganization_Name();

	/**
	 * Returns the meta object for class '{@link org.hl7.knowledgeartifact.r1.Party <em>Party</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Party</em>'.
	 * @see org.hl7.knowledgeartifact.r1.Party
	 * @generated
	 */
	EClass getParty();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.knowledgeartifact.r1.Party#getAddresses <em>Addresses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Addresses</em>'.
	 * @see org.hl7.knowledgeartifact.r1.Party#getAddresses()
	 * @see #getParty()
	 * @generated
	 */
	EReference getParty_Addresses();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.knowledgeartifact.r1.Party#getContacts <em>Contacts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Contacts</em>'.
	 * @see org.hl7.knowledgeartifact.r1.Party#getContacts()
	 * @see #getParty()
	 * @generated
	 */
	EReference getParty_Contacts();

	/**
	 * Returns the meta object for class '{@link org.hl7.knowledgeartifact.r1.PeriodicEventTrigger <em>Periodic Event Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Periodic Event Trigger</em>'.
	 * @see org.hl7.knowledgeartifact.r1.PeriodicEventTrigger
	 * @generated
	 */
	EClass getPeriodicEventTrigger();

	/**
	 * Returns the meta object for class '{@link org.hl7.knowledgeartifact.r1.PermissionsType <em>Permissions Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Permissions Type</em>'.
	 * @see org.hl7.knowledgeartifact.r1.PermissionsType
	 * @generated
	 */
	EClass getPermissionsType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.hl7.knowledgeartifact.r1.PermissionsType#getPermissions <em>Permissions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Permissions</em>'.
	 * @see org.hl7.knowledgeartifact.r1.PermissionsType#getPermissions()
	 * @see #getPermissionsType()
	 * @generated
	 */
	EReference getPermissionsType_Permissions();

	/**
	 * Returns the meta object for class '{@link org.hl7.knowledgeartifact.r1.Person <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Person</em>'.
	 * @see org.hl7.knowledgeartifact.r1.Person
	 * @generated
	 */
	EClass getPerson();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.knowledgeartifact.r1.Person#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Name</em>'.
	 * @see org.hl7.knowledgeartifact.r1.Person#getName()
	 * @see #getPerson()
	 * @generated
	 */
	EReference getPerson_Name();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.knowledgeartifact.r1.Person#getAffiliation <em>Affiliation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Affiliation</em>'.
	 * @see org.hl7.knowledgeartifact.r1.Person#getAffiliation()
	 * @see #getPerson()
	 * @generated
	 */
	EReference getPerson_Affiliation();

	/**
	 * Returns the meta object for class '{@link org.hl7.knowledgeartifact.r1.PrecheckBehavior <em>Precheck Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Precheck Behavior</em>'.
	 * @see org.hl7.knowledgeartifact.r1.PrecheckBehavior
	 * @generated
	 */
	EClass getPrecheckBehavior();

	/**
	 * Returns the meta object for class '{@link org.hl7.knowledgeartifact.r1.PublishersType <em>Publishers Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Publishers Type</em>'.
	 * @see org.hl7.knowledgeartifact.r1.PublishersType
	 * @generated
	 */
	EClass getPublishersType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.hl7.knowledgeartifact.r1.PublishersType#getPublisher <em>Publisher</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Publisher</em>'.
	 * @see org.hl7.knowledgeartifact.r1.PublishersType#getPublisher()
	 * @see #getPublishersType()
	 * @generated
	 */
	EReference getPublishersType_Publisher();

	/**
	 * Returns the meta object for class '{@link org.hl7.knowledgeartifact.r1.RangeConstraint <em>Range Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Range Constraint</em>'.
	 * @see org.hl7.knowledgeartifact.r1.RangeConstraint
	 * @generated
	 */
	EClass getRangeConstraint();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.knowledgeartifact.r1.RangeConstraint#getConstraintType <em>Constraint Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Constraint Type</em>'.
	 * @see org.hl7.knowledgeartifact.r1.RangeConstraint#getConstraintType()
	 * @see #getRangeConstraint()
	 * @generated
	 */
	EReference getRangeConstraint_ConstraintType();

	/**
	 * Returns the meta object for class '{@link org.hl7.knowledgeartifact.r1.ReadOnlyBehavior <em>Read Only Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Read Only Behavior</em>'.
	 * @see org.hl7.knowledgeartifact.r1.ReadOnlyBehavior
	 * @generated
	 */
	EClass getReadOnlyBehavior();

	/**
	 * Returns the meta object for class '{@link org.hl7.knowledgeartifact.r1.ReferencedModelType <em>Referenced Model Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Referenced Model Type</em>'.
	 * @see org.hl7.knowledgeartifact.r1.ReferencedModelType
	 * @generated
	 */
	EClass getReferencedModelType();

	/**
	 * Returns the meta object for the attribute '{@link org.hl7.knowledgeartifact.r1.ReferencedModelType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.hl7.knowledgeartifact.r1.ReferencedModelType#getValue()
	 * @see #getReferencedModelType()
	 * @generated
	 */
	EAttribute getReferencedModelType_Value();

	/**
	 * Returns the meta object for class '{@link org.hl7.knowledgeartifact.r1.RelatedResourcesType <em>Related Resources Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Related Resources Type</em>'.
	 * @see org.hl7.knowledgeartifact.r1.RelatedResourcesType
	 * @generated
	 */
	EClass getRelatedResourcesType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.hl7.knowledgeartifact.r1.RelatedResourcesType#getRelatedResource <em>Related Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Related Resource</em>'.
	 * @see org.hl7.knowledgeartifact.r1.RelatedResourcesType#getRelatedResource()
	 * @see #getRelatedResourcesType()
	 * @generated
	 */
	EReference getRelatedResourcesType_RelatedResource();

	/**
	 * Returns the meta object for class '{@link org.hl7.knowledgeartifact.r1.RelationshipType <em>Relationship Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relationship Type</em>'.
	 * @see org.hl7.knowledgeartifact.r1.RelationshipType
	 * @generated
	 */
	EClass getRelationshipType();

	/**
	 * Returns the meta object for the attribute '{@link org.hl7.knowledgeartifact.r1.RelationshipType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.hl7.knowledgeartifact.r1.RelationshipType#getValue()
	 * @see #getRelationshipType()
	 * @generated
	 */
	EAttribute getRelationshipType_Value();

	/**
	 * Returns the meta object for class '{@link org.hl7.knowledgeartifact.r1.RemoveAction <em>Remove Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Remove Action</em>'.
	 * @see org.hl7.knowledgeartifact.r1.RemoveAction
	 * @generated
	 */
	EClass getRemoveAction();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.knowledgeartifact.r1.RemoveAction#getActionSentence <em>Action Sentence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Action Sentence</em>'.
	 * @see org.hl7.knowledgeartifact.r1.RemoveAction#getActionSentence()
	 * @see #getRemoveAction()
	 * @generated
	 */
	EReference getRemoveAction_ActionSentence();

	/**
	 * Returns the meta object for class '{@link org.hl7.knowledgeartifact.r1.RepresentedConceptsType <em>Represented Concepts Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Represented Concepts Type</em>'.
	 * @see org.hl7.knowledgeartifact.r1.RepresentedConceptsType
	 * @generated
	 */
	EClass getRepresentedConceptsType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.hl7.knowledgeartifact.r1.RepresentedConceptsType#getConcept <em>Concept</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Concept</em>'.
	 * @see org.hl7.knowledgeartifact.r1.RepresentedConceptsType#getConcept()
	 * @see #getRepresentedConceptsType()
	 * @generated
	 */
	EReference getRepresentedConceptsType_Concept();

	/**
	 * Returns the meta object for class '{@link org.hl7.knowledgeartifact.r1.RequiredBehavior <em>Required Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Required Behavior</em>'.
	 * @see org.hl7.knowledgeartifact.r1.RequiredBehavior
	 * @generated
	 */
	EClass getRequiredBehavior();

	/**
	 * Returns the meta object for class '{@link org.hl7.knowledgeartifact.r1.ResourceRelationshipReference <em>Resource Relationship Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Relationship Reference</em>'.
	 * @see org.hl7.knowledgeartifact.r1.ResourceRelationshipReference
	 * @generated
	 */
	EClass getResourceRelationshipReference();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.knowledgeartifact.r1.ResourceRelationshipReference#getRelationship <em>Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Relationship</em>'.
	 * @see org.hl7.knowledgeartifact.r1.ResourceRelationshipReference#getRelationship()
	 * @see #getResourceRelationshipReference()
	 * @generated
	 */
	EReference getResourceRelationshipReference_Relationship();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.knowledgeartifact.r1.ResourceRelationshipReference#getResources <em>Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Resources</em>'.
	 * @see org.hl7.knowledgeartifact.r1.ResourceRelationshipReference#getResources()
	 * @see #getResourceRelationshipReference()
	 * @generated
	 */
	EReference getResourceRelationshipReference_Resources();

	/**
	 * Returns the meta object for class '{@link org.hl7.knowledgeartifact.r1.ResourcesType <em>Resources Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resources Type</em>'.
	 * @see org.hl7.knowledgeartifact.r1.ResourcesType
	 * @generated
	 */
	EClass getResourcesType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.hl7.knowledgeartifact.r1.ResourcesType#getResource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resource</em>'.
	 * @see org.hl7.knowledgeartifact.r1.ResourcesType#getResource()
	 * @see #getResourcesType()
	 * @generated
	 */
	EReference getResourcesType_Resource();

	/**
	 * Returns the meta object for class '{@link org.hl7.knowledgeartifact.r1.ResponseBinding <em>Response Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Response Binding</em>'.
	 * @see org.hl7.knowledgeartifact.r1.ResponseBinding
	 * @generated
	 */
	EClass getResponseBinding();

	/**
	 * Returns the meta object for the attribute '{@link org.hl7.knowledgeartifact.r1.ResponseBinding#getContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Container</em>'.
	 * @see org.hl7.knowledgeartifact.r1.ResponseBinding#getContainer()
	 * @see #getResponseBinding()
	 * @generated
	 */
	EAttribute getResponseBinding_Container();

	/**
	 * Returns the meta object for the attribute '{@link org.hl7.knowledgeartifact.r1.ResponseBinding#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Property</em>'.
	 * @see org.hl7.knowledgeartifact.r1.ResponseBinding#getProperty()
	 * @see #getResponseBinding()
	 * @generated
	 */
	EAttribute getResponseBinding_Property();

	/**
	 * Returns the meta object for class '{@link org.hl7.knowledgeartifact.r1.ResponseCardinalityType <em>Response Cardinality Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Response Cardinality Type</em>'.
	 * @see org.hl7.knowledgeartifact.r1.ResponseCardinalityType
	 * @generated
	 */
	EClass getResponseCardinalityType();

	/**
	 * Returns the meta object for the attribute '{@link org.hl7.knowledgeartifact.r1.ResponseCardinalityType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.hl7.knowledgeartifact.r1.ResponseCardinalityType#getValue()
	 * @see #getResponseCardinalityType()
	 * @generated
	 */
	EAttribute getResponseCardinalityType_Value();

	/**
	 * Returns the meta object for class '{@link org.hl7.knowledgeartifact.r1.ResponseDataTypeType <em>Response Data Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Response Data Type Type</em>'.
	 * @see org.hl7.knowledgeartifact.r1.ResponseDataTypeType
	 * @generated
	 */
	EClass getResponseDataTypeType();

	/**
	 * Returns the meta object for the attribute '{@link org.hl7.knowledgeartifact.r1.ResponseDataTypeType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.hl7.knowledgeartifact.r1.ResponseDataTypeType#getValue()
	 * @see #getResponseDataTypeType()
	 * @generated
	 */
	EAttribute getResponseDataTypeType_Value();

	/**
	 * Returns the meta object for class '{@link org.hl7.knowledgeartifact.r1.RightsDeclaration <em>Rights Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rights Declaration</em>'.
	 * @see org.hl7.knowledgeartifact.r1.RightsDeclaration
	 * @generated
	 */
	EClass getRightsDeclaration();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.knowledgeartifact.r1.RightsDeclaration#getAssertedRights <em>Asserted Rights</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Asserted Rights</em>'.
	 * @see org.hl7.knowledgeartifact.r1.RightsDeclaration#getAssertedRights()
	 * @see #getRightsDeclaration()
	 * @generated
	 */
	EReference getRightsDeclaration_AssertedRights();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.knowledgeartifact.r1.RightsDeclaration#getRightsHolder <em>Rights Holder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rights Holder</em>'.
	 * @see org.hl7.knowledgeartifact.r1.RightsDeclaration#getRightsHolder()
	 * @see #getRightsDeclaration()
	 * @generated
	 */
	EReference getRightsDeclaration_RightsHolder();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.knowledgeartifact.r1.RightsDeclaration#getPermissions <em>Permissions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Permissions</em>'.
	 * @see org.hl7.knowledgeartifact.r1.RightsDeclaration#getPermissions()
	 * @see #getRightsDeclaration()
	 * @generated
	 */
	EReference getRightsDeclaration_Permissions();

	/**
	 * Returns the meta object for class '{@link org.hl7.knowledgeartifact.r1.RoleType <em>Role Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role Type</em>'.
	 * @see org.hl7.knowledgeartifact.r1.RoleType
	 * @generated
	 */
	EClass getRoleType();

	/**
	 * Returns the meta object for the attribute '{@link org.hl7.knowledgeartifact.r1.RoleType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.hl7.knowledgeartifact.r1.RoleType#getValue()
	 * @see #getRoleType()
	 * @generated
	 */
	EAttribute getRoleType_Value();

	/**
	 * Returns the meta object for class '{@link org.hl7.knowledgeartifact.r1.StatusType <em>Status Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Status Type</em>'.
	 * @see org.hl7.knowledgeartifact.r1.StatusType
	 * @generated
	 */
	EClass getStatusType();

	/**
	 * Returns the meta object for the attribute '{@link org.hl7.knowledgeartifact.r1.StatusType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.hl7.knowledgeartifact.r1.StatusType#getValue()
	 * @see #getStatusType()
	 * @generated
	 */
	EAttribute getStatusType_Value();

	/**
	 * Returns the meta object for class '{@link org.hl7.knowledgeartifact.r1.SubElementsType <em>Sub Elements Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sub Elements Type</em>'.
	 * @see org.hl7.knowledgeartifact.r1.SubElementsType
	 * @generated
	 */
	EClass getSubElementsType();

	/**
	 * Returns the meta object for the attribute list '{@link org.hl7.knowledgeartifact.r1.SubElementsType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.hl7.knowledgeartifact.r1.SubElementsType#getGroup()
	 * @see #getSubElementsType()
	 * @generated
	 */
	EAttribute getSubElementsType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.hl7.knowledgeartifact.r1.SubElementsType#getSimpleAction <em>Simple Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Simple Action</em>'.
	 * @see org.hl7.knowledgeartifact.r1.SubElementsType#getSimpleAction()
	 * @see #getSubElementsType()
	 * @generated
	 */
	EReference getSubElementsType_SimpleAction();

	/**
	 * Returns the meta object for the containment reference list '{@link org.hl7.knowledgeartifact.r1.SubElementsType#getActionGroup <em>Action Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Action Group</em>'.
	 * @see org.hl7.knowledgeartifact.r1.SubElementsType#getActionGroup()
	 * @see #getSubElementsType()
	 * @generated
	 */
	EReference getSubElementsType_ActionGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link org.hl7.knowledgeartifact.r1.SubElementsType#getActionRef <em>Action Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Action Ref</em>'.
	 * @see org.hl7.knowledgeartifact.r1.SubElementsType#getActionRef()
	 * @see #getSubElementsType()
	 * @generated
	 */
	EReference getSubElementsType_ActionRef();

	/**
	 * Returns the meta object for class '{@link org.hl7.knowledgeartifact.r1.SupportingEvidence <em>Supporting Evidence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Supporting Evidence</em>'.
	 * @see org.hl7.knowledgeartifact.r1.SupportingEvidence
	 * @generated
	 */
	EClass getSupportingEvidence();

	/**
	 * Returns the meta object for the containment reference list '{@link org.hl7.knowledgeartifact.r1.SupportingEvidence#getEvidence <em>Evidence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Evidence</em>'.
	 * @see org.hl7.knowledgeartifact.r1.SupportingEvidence#getEvidence()
	 * @see #getSupportingEvidence()
	 * @generated
	 */
	EReference getSupportingEvidence_Evidence();

	/**
	 * Returns the meta object for class '{@link org.hl7.knowledgeartifact.r1.SupportingResource <em>Supporting Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Supporting Resource</em>'.
	 * @see org.hl7.knowledgeartifact.r1.SupportingResource
	 * @generated
	 */
	EClass getSupportingResource();

	/**
	 * Returns the meta object for the containment reference list '{@link org.hl7.knowledgeartifact.r1.SupportingResource#getResource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resource</em>'.
	 * @see org.hl7.knowledgeartifact.r1.SupportingResource#getResource()
	 * @see #getSupportingResource()
	 * @generated
	 */
	EReference getSupportingResource_Resource();

	/**
	 * Returns the meta object for class '{@link org.hl7.knowledgeartifact.r1.TemplateIdsType <em>Template Ids Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Template Ids Type</em>'.
	 * @see org.hl7.knowledgeartifact.r1.TemplateIdsType
	 * @generated
	 */
	EClass getTemplateIdsType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.hl7.knowledgeartifact.r1.TemplateIdsType#getTemplateId <em>Template Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Template Id</em>'.
	 * @see org.hl7.knowledgeartifact.r1.TemplateIdsType#getTemplateId()
	 * @see #getTemplateIdsType()
	 * @generated
	 */
	EReference getTemplateIdsType_TemplateId();

	/**
	 * Returns the meta object for class '{@link org.hl7.knowledgeartifact.r1.TemplateIdsType1 <em>Template Ids Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Template Ids Type1</em>'.
	 * @see org.hl7.knowledgeartifact.r1.TemplateIdsType1
	 * @generated
	 */
	EClass getTemplateIdsType1();

	/**
	 * Returns the meta object for the containment reference list '{@link org.hl7.knowledgeartifact.r1.TemplateIdsType1#getTemplateId <em>Template Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Template Id</em>'.
	 * @see org.hl7.knowledgeartifact.r1.TemplateIdsType1#getTemplateId()
	 * @see #getTemplateIdsType1()
	 * @generated
	 */
	EReference getTemplateIdsType1_TemplateId();

	/**
	 * Returns the meta object for class '{@link org.hl7.knowledgeartifact.r1.Trigger <em>Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trigger</em>'.
	 * @see org.hl7.knowledgeartifact.r1.Trigger
	 * @generated
	 */
	EClass getTrigger();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.knowledgeartifact.r1.Trigger#getDef <em>Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Def</em>'.
	 * @see org.hl7.knowledgeartifact.r1.Trigger#getDef()
	 * @see #getTrigger()
	 * @generated
	 */
	EReference getTrigger_Def();

	/**
	 * Returns the meta object for the containment reference list '{@link org.hl7.knowledgeartifact.r1.Trigger#getIdentifiers <em>Identifiers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Identifiers</em>'.
	 * @see org.hl7.knowledgeartifact.r1.Trigger#getIdentifiers()
	 * @see #getTrigger()
	 * @generated
	 */
	EReference getTrigger_Identifiers();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.knowledgeartifact.r1.Trigger#getTextEquivalent <em>Text Equivalent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Text Equivalent</em>'.
	 * @see org.hl7.knowledgeartifact.r1.Trigger#getTextEquivalent()
	 * @see #getTrigger()
	 * @generated
	 */
	EReference getTrigger_TextEquivalent();

	/**
	 * Returns the meta object for class '{@link org.hl7.knowledgeartifact.r1.Triggers <em>Triggers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Triggers</em>'.
	 * @see org.hl7.knowledgeartifact.r1.Triggers
	 * @generated
	 */
	EClass getTriggers();

	/**
	 * Returns the meta object for the containment reference list '{@link org.hl7.knowledgeartifact.r1.Triggers#getTrigger <em>Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Trigger</em>'.
	 * @see org.hl7.knowledgeartifact.r1.Triggers#getTrigger()
	 * @see #getTriggers()
	 * @generated
	 */
	EReference getTriggers_Trigger();

	/**
	 * Returns the meta object for class '{@link org.hl7.knowledgeartifact.r1.UpdateAction <em>Update Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Update Action</em>'.
	 * @see org.hl7.knowledgeartifact.r1.UpdateAction
	 * @generated
	 */
	EClass getUpdateAction();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.knowledgeartifact.r1.UpdateAction#getActionSentence <em>Action Sentence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Action Sentence</em>'.
	 * @see org.hl7.knowledgeartifact.r1.UpdateAction#getActionSentence()
	 * @see #getUpdateAction()
	 * @generated
	 */
	EReference getUpdateAction_ActionSentence();

	/**
	 * Returns the meta object for class '{@link org.hl7.knowledgeartifact.r1.UsageTermsType <em>Usage Terms Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Usage Terms Type</em>'.
	 * @see org.hl7.knowledgeartifact.r1.UsageTermsType
	 * @generated
	 */
	EClass getUsageTermsType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.hl7.knowledgeartifact.r1.UsageTermsType#getRightsDeclaration <em>Rights Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rights Declaration</em>'.
	 * @see org.hl7.knowledgeartifact.r1.UsageTermsType#getRightsDeclaration()
	 * @see #getUsageTermsType()
	 * @generated
	 */
	EReference getUsageTermsType_RightsDeclaration();

	/**
	 * Returns the meta object for class '{@link org.hl7.knowledgeartifact.r1.ValueSetConstraint <em>Value Set Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value Set Constraint</em>'.
	 * @see org.hl7.knowledgeartifact.r1.ValueSetConstraint
	 * @generated
	 */
	EClass getValueSetConstraint();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.knowledgeartifact.r1.ValueSetConstraint#getValueSet <em>Value Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value Set</em>'.
	 * @see org.hl7.knowledgeartifact.r1.ValueSetConstraint#getValueSet()
	 * @see #getValueSetConstraint()
	 * @generated
	 */
	EReference getValueSetConstraint_ValueSet();

	/**
	 * Returns the meta object for class '{@link org.hl7.knowledgeartifact.r1.VersionedIdentifier <em>Versioned Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Versioned Identifier</em>'.
	 * @see org.hl7.knowledgeartifact.r1.VersionedIdentifier
	 * @generated
	 */
	EClass getVersionedIdentifier();

	/**
	 * Returns the meta object for the attribute '{@link org.hl7.knowledgeartifact.r1.VersionedIdentifier#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see org.hl7.knowledgeartifact.r1.VersionedIdentifier#getVersion()
	 * @see #getVersionedIdentifier()
	 * @generated
	 */
	EAttribute getVersionedIdentifier_Version();

	/**
	 * Returns the meta object for class '{@link org.hl7.knowledgeartifact.r1.VisualStyleBehavior <em>Visual Style Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Visual Style Behavior</em>'.
	 * @see org.hl7.knowledgeartifact.r1.VisualStyleBehavior
	 * @generated
	 */
	EClass getVisualStyleBehavior();

	/**
	 * Returns the meta object for enum '{@link org.hl7.knowledgeartifact.r1.ArtifactLifeCycleEventType <em>Artifact Life Cycle Event Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Artifact Life Cycle Event Type</em>'.
	 * @see org.hl7.knowledgeartifact.r1.ArtifactLifeCycleEventType
	 * @generated
	 */
	EEnum getArtifactLifeCycleEventType();

	/**
	 * Returns the meta object for enum '{@link org.hl7.knowledgeartifact.r1.ArtifactStatusType <em>Artifact Status Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Artifact Status Type</em>'.
	 * @see org.hl7.knowledgeartifact.r1.ArtifactStatusType
	 * @generated
	 */
	EEnum getArtifactStatusType();

	/**
	 * Returns the meta object for enum '{@link org.hl7.knowledgeartifact.r1.ArtifactType <em>Artifact Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Artifact Type</em>'.
	 * @see org.hl7.knowledgeartifact.r1.ArtifactType
	 * @generated
	 */
	EEnum getArtifactType();

	/**
	 * Returns the meta object for enum '{@link org.hl7.knowledgeartifact.r1.Cardinality <em>Cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Cardinality</em>'.
	 * @see org.hl7.knowledgeartifact.r1.Cardinality
	 * @generated
	 */
	EEnum getCardinality();

	/**
	 * Returns the meta object for enum '{@link org.hl7.knowledgeartifact.r1.CardinalityBehaviorType <em>Cardinality Behavior Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Cardinality Behavior Type</em>'.
	 * @see org.hl7.knowledgeartifact.r1.CardinalityBehaviorType
	 * @generated
	 */
	EEnum getCardinalityBehaviorType();

	/**
	 * Returns the meta object for enum '{@link org.hl7.knowledgeartifact.r1.CompondArtifactType <em>Compond Artifact Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Compond Artifact Type</em>'.
	 * @see org.hl7.knowledgeartifact.r1.CompondArtifactType
	 * @generated
	 */
	EEnum getCompondArtifactType();

	/**
	 * Returns the meta object for enum '{@link org.hl7.knowledgeartifact.r1.ConditionRoleType <em>Condition Role Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Condition Role Type</em>'.
	 * @see org.hl7.knowledgeartifact.r1.ConditionRoleType
	 * @generated
	 */
	EEnum getConditionRoleType();

	/**
	 * Returns the meta object for enum '{@link org.hl7.knowledgeartifact.r1.ContributorType <em>Contributor Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Contributor Type</em>'.
	 * @see org.hl7.knowledgeartifact.r1.ContributorType
	 * @generated
	 */
	EEnum getContributorType();

	/**
	 * Returns the meta object for enum '{@link org.hl7.knowledgeartifact.r1.CoverageType <em>Coverage Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Coverage Type</em>'.
	 * @see org.hl7.knowledgeartifact.r1.CoverageType
	 * @generated
	 */
	EEnum getCoverageType();

	/**
	 * Returns the meta object for enum '{@link org.hl7.knowledgeartifact.r1.DataEventType <em>Data Event Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Data Event Type</em>'.
	 * @see org.hl7.knowledgeartifact.r1.DataEventType
	 * @generated
	 */
	EEnum getDataEventType();

	/**
	 * Returns the meta object for enum '{@link org.hl7.knowledgeartifact.r1.EventType <em>Event Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Event Type</em>'.
	 * @see org.hl7.knowledgeartifact.r1.EventType
	 * @generated
	 */
	EEnum getEventType();

	/**
	 * Returns the meta object for enum '{@link org.hl7.knowledgeartifact.r1.GroupOrganizationBehaviorType <em>Group Organization Behavior Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Group Organization Behavior Type</em>'.
	 * @see org.hl7.knowledgeartifact.r1.GroupOrganizationBehaviorType
	 * @generated
	 */
	EEnum getGroupOrganizationBehaviorType();

	/**
	 * Returns the meta object for enum '{@link org.hl7.knowledgeartifact.r1.GroupSelectionBehaviorType <em>Group Selection Behavior Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Group Selection Behavior Type</em>'.
	 * @see org.hl7.knowledgeartifact.r1.GroupSelectionBehaviorType
	 * @generated
	 */
	EEnum getGroupSelectionBehaviorType();

	/**
	 * Returns the meta object for enum '{@link org.hl7.knowledgeartifact.r1.PrecheckBehaviorType <em>Precheck Behavior Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Precheck Behavior Type</em>'.
	 * @see org.hl7.knowledgeartifact.r1.PrecheckBehaviorType
	 * @generated
	 */
	EEnum getPrecheckBehaviorType();

	/**
	 * Returns the meta object for enum '{@link org.hl7.knowledgeartifact.r1.RangeConstraintType <em>Range Constraint Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Range Constraint Type</em>'.
	 * @see org.hl7.knowledgeartifact.r1.RangeConstraintType
	 * @generated
	 */
	EEnum getRangeConstraintType();

	/**
	 * Returns the meta object for enum '{@link org.hl7.knowledgeartifact.r1.RequiredBehaviorType <em>Required Behavior Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Required Behavior Type</em>'.
	 * @see org.hl7.knowledgeartifact.r1.RequiredBehaviorType
	 * @generated
	 */
	EEnum getRequiredBehaviorType();

	/**
	 * Returns the meta object for enum '{@link org.hl7.knowledgeartifact.r1.ResourceRelationshipType <em>Resource Relationship Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Resource Relationship Type</em>'.
	 * @see org.hl7.knowledgeartifact.r1.ResourceRelationshipType
	 * @generated
	 */
	EEnum getResourceRelationshipType();

	/**
	 * Returns the meta object for enum '{@link org.hl7.knowledgeartifact.r1.ValueType <em>Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Value Type</em>'.
	 * @see org.hl7.knowledgeartifact.r1.ValueType
	 * @generated
	 */
	EEnum getValueType();

	/**
	 * Returns the meta object for data type '{@link org.hl7.knowledgeartifact.r1.ArtifactLifeCycleEventType <em>Artifact Life Cycle Event Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Artifact Life Cycle Event Type Object</em>'.
	 * @see org.hl7.knowledgeartifact.r1.ArtifactLifeCycleEventType
	 * @model instanceClass="org.hl7.knowledgeartifact.r1.ArtifactLifeCycleEventType"
	 *        extendedMetaData="name='ArtifactLifeCycleEventType:Object' baseType='ArtifactLifeCycleEventType'"
	 * @generated
	 */
	EDataType getArtifactLifeCycleEventTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.hl7.knowledgeartifact.r1.ArtifactStatusType <em>Artifact Status Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Artifact Status Type Object</em>'.
	 * @see org.hl7.knowledgeartifact.r1.ArtifactStatusType
	 * @model instanceClass="org.hl7.knowledgeartifact.r1.ArtifactStatusType"
	 *        extendedMetaData="name='ArtifactStatusType:Object' baseType='ArtifactStatusType'"
	 * @generated
	 */
	EDataType getArtifactStatusTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.hl7.knowledgeartifact.r1.ArtifactType <em>Artifact Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Artifact Type Object</em>'.
	 * @see org.hl7.knowledgeartifact.r1.ArtifactType
	 * @model instanceClass="org.hl7.knowledgeartifact.r1.ArtifactType"
	 *        extendedMetaData="name='ArtifactType:Object' baseType='ArtifactType'"
	 * @generated
	 */
	EDataType getArtifactTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.hl7.knowledgeartifact.r1.CardinalityBehaviorType <em>Cardinality Behavior Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Cardinality Behavior Type Object</em>'.
	 * @see org.hl7.knowledgeartifact.r1.CardinalityBehaviorType
	 * @model instanceClass="org.hl7.knowledgeartifact.r1.CardinalityBehaviorType"
	 *        extendedMetaData="name='CardinalityBehaviorType:Object' baseType='CardinalityBehaviorType'"
	 * @generated
	 */
	EDataType getCardinalityBehaviorTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.hl7.knowledgeartifact.r1.Cardinality <em>Cardinality Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Cardinality Object</em>'.
	 * @see org.hl7.knowledgeartifact.r1.Cardinality
	 * @model instanceClass="org.hl7.knowledgeartifact.r1.Cardinality"
	 *        extendedMetaData="name='Cardinality:Object' baseType='Cardinality'"
	 * @generated
	 */
	EDataType getCardinalityObject();

	/**
	 * Returns the meta object for data type '{@link org.hl7.knowledgeartifact.r1.CompondArtifactType <em>Compond Artifact Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Compond Artifact Type Object</em>'.
	 * @see org.hl7.knowledgeartifact.r1.CompondArtifactType
	 * @model instanceClass="org.hl7.knowledgeartifact.r1.CompondArtifactType"
	 *        extendedMetaData="name='CompondArtifactType:Object' baseType='CompondArtifactType'"
	 * @generated
	 */
	EDataType getCompondArtifactTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.hl7.knowledgeartifact.r1.ConditionRoleType <em>Condition Role Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Condition Role Type Object</em>'.
	 * @see org.hl7.knowledgeartifact.r1.ConditionRoleType
	 * @model instanceClass="org.hl7.knowledgeartifact.r1.ConditionRoleType"
	 *        extendedMetaData="name='ConditionRoleType:Object' baseType='ConditionRoleType'"
	 * @generated
	 */
	EDataType getConditionRoleTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.hl7.knowledgeartifact.r1.ContributorType <em>Contributor Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Contributor Type Object</em>'.
	 * @see org.hl7.knowledgeartifact.r1.ContributorType
	 * @model instanceClass="org.hl7.knowledgeartifact.r1.ContributorType"
	 *        extendedMetaData="name='ContributorType:Object' baseType='ContributorType'"
	 * @generated
	 */
	EDataType getContributorTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.hl7.knowledgeartifact.r1.CoverageType <em>Coverage Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Coverage Type Object</em>'.
	 * @see org.hl7.knowledgeartifact.r1.CoverageType
	 * @model instanceClass="org.hl7.knowledgeartifact.r1.CoverageType"
	 *        extendedMetaData="name='CoverageType:Object' baseType='CoverageType'"
	 * @generated
	 */
	EDataType getCoverageTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.hl7.knowledgeartifact.r1.DataEventType <em>Data Event Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Data Event Type Object</em>'.
	 * @see org.hl7.knowledgeartifact.r1.DataEventType
	 * @model instanceClass="org.hl7.knowledgeartifact.r1.DataEventType"
	 *        extendedMetaData="name='DataEventType:Object' baseType='DataEventType'"
	 * @generated
	 */
	EDataType getDataEventTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.hl7.knowledgeartifact.r1.EventType <em>Event Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Event Type Object</em>'.
	 * @see org.hl7.knowledgeartifact.r1.EventType
	 * @model instanceClass="org.hl7.knowledgeartifact.r1.EventType"
	 *        extendedMetaData="name='EventType:Object' baseType='EventType'"
	 * @generated
	 */
	EDataType getEventTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.hl7.knowledgeartifact.r1.GroupOrganizationBehaviorType <em>Group Organization Behavior Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Group Organization Behavior Type Object</em>'.
	 * @see org.hl7.knowledgeartifact.r1.GroupOrganizationBehaviorType
	 * @model instanceClass="org.hl7.knowledgeartifact.r1.GroupOrganizationBehaviorType"
	 *        extendedMetaData="name='GroupOrganizationBehaviorType:Object' baseType='GroupOrganizationBehaviorType'"
	 * @generated
	 */
	EDataType getGroupOrganizationBehaviorTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.hl7.knowledgeartifact.r1.GroupSelectionBehaviorType <em>Group Selection Behavior Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Group Selection Behavior Type Object</em>'.
	 * @see org.hl7.knowledgeartifact.r1.GroupSelectionBehaviorType
	 * @model instanceClass="org.hl7.knowledgeartifact.r1.GroupSelectionBehaviorType"
	 *        extendedMetaData="name='GroupSelectionBehaviorType:Object' baseType='GroupSelectionBehaviorType'"
	 * @generated
	 */
	EDataType getGroupSelectionBehaviorTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.hl7.knowledgeartifact.r1.PrecheckBehaviorType <em>Precheck Behavior Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Precheck Behavior Type Object</em>'.
	 * @see org.hl7.knowledgeartifact.r1.PrecheckBehaviorType
	 * @model instanceClass="org.hl7.knowledgeartifact.r1.PrecheckBehaviorType"
	 *        extendedMetaData="name='PrecheckBehaviorType:Object' baseType='PrecheckBehaviorType'"
	 * @generated
	 */
	EDataType getPrecheckBehaviorTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.hl7.knowledgeartifact.r1.RangeConstraintType <em>Range Constraint Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Range Constraint Type Object</em>'.
	 * @see org.hl7.knowledgeartifact.r1.RangeConstraintType
	 * @model instanceClass="org.hl7.knowledgeartifact.r1.RangeConstraintType"
	 *        extendedMetaData="name='RangeConstraintType:Object' baseType='RangeConstraintType'"
	 * @generated
	 */
	EDataType getRangeConstraintTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.hl7.knowledgeartifact.r1.RequiredBehaviorType <em>Required Behavior Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Required Behavior Type Object</em>'.
	 * @see org.hl7.knowledgeartifact.r1.RequiredBehaviorType
	 * @model instanceClass="org.hl7.knowledgeartifact.r1.RequiredBehaviorType"
	 *        extendedMetaData="name='RequiredBehaviorType:Object' baseType='RequiredBehaviorType'"
	 * @generated
	 */
	EDataType getRequiredBehaviorTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.hl7.knowledgeartifact.r1.ResourceRelationshipType <em>Resource Relationship Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Resource Relationship Type Object</em>'.
	 * @see org.hl7.knowledgeartifact.r1.ResourceRelationshipType
	 * @model instanceClass="org.hl7.knowledgeartifact.r1.ResourceRelationshipType"
	 *        extendedMetaData="name='ResourceRelationshipType:Object' baseType='ResourceRelationshipType'"
	 * @generated
	 */
	EDataType getResourceRelationshipTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.hl7.knowledgeartifact.r1.ValueType <em>Value Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Value Type Object</em>'.
	 * @see org.hl7.knowledgeartifact.r1.ValueType
	 * @model instanceClass="org.hl7.knowledgeartifact.r1.ValueType"
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
	R1Factory getR1Factory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.hl7.knowledgeartifact.r1.impl.ActionBaseImpl <em>Action Base</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.knowledgeartifact.r1.impl.ActionBaseImpl
		 * @see org.hl7.knowledgeartifact.r1.impl.R1PackageImpl#getActionBase()
		 * @generated
		 */
		EClass ACTION_BASE = eINSTANCE.getActionBase();

		/**
		 * The meta object literal for the '<em><b>Action Id</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION_BASE__ACTION_ID = eINSTANCE.getActionBase_ActionId();

		/**
		 * The meta object literal for the '<em><b>Number</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION_BASE__NUMBER = eINSTANCE.getActionBase_Number();

		/**
		 * The meta object literal for the '<em><b>Supporting Evidence</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION_BASE__SUPPORTING_EVIDENCE = eINSTANCE.getActionBase_SupportingEvidence();

		/**
		 * The meta object literal for the '<em><b>Supporting Resources</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION_BASE__SUPPORTING_RESOURCES = eINSTANCE.getActionBase_SupportingResources();

		/**
		 * The meta object literal for the '<em><b>Actors</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION_BASE__ACTORS = eINSTANCE.getActionBase_Actors();

		/**
		 * The meta object literal for the '<em><b>Behaviors</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION_BASE__BEHAVIORS = eINSTANCE.getActionBase_Behaviors();

		/**
		 * The meta object literal for the '<em><b>Conditions</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION_BASE__CONDITIONS = eINSTANCE.getActionBase_Conditions();

		/**
		 * The meta object literal for the '<em><b>Order</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION_BASE__ORDER = eINSTANCE.getActionBase_Order();

		/**
		 * The meta object literal for the '{@link org.hl7.knowledgeartifact.r1.impl.ActionGroupImpl <em>Action Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.knowledgeartifact.r1.impl.ActionGroupImpl
		 * @see org.hl7.knowledgeartifact.r1.impl.R1PackageImpl#getActionGroup()
		 * @generated
		 */
		EClass ACTION_GROUP = eINSTANCE.getActionGroup();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION_GROUP__TITLE = eINSTANCE.getActionGroup_Title();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION_GROUP__DESCRIPTION = eINSTANCE.getActionGroup_Description();

		/**
		 * The meta object literal for the '<em><b>Represented Concepts</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION_GROUP__REPRESENTED_CONCEPTS = eINSTANCE.getActionGroup_RepresentedConcepts();

		/**
		 * The meta object literal for the '<em><b>Sub Elements</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION_GROUP__SUB_ELEMENTS = eINSTANCE.getActionGroup_SubElements();

		/**
		 * The meta object literal for the '{@link org.hl7.knowledgeartifact.r1.impl.ActionRefImpl <em>Action Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.knowledgeartifact.r1.impl.ActionRefImpl
		 * @see org.hl7.knowledgeartifact.r1.impl.R1PackageImpl#getActionRef()
		 * @generated
		 */
		EClass ACTION_REF = eINSTANCE.getActionRef();

		/**
		 * The meta object literal for the '<em><b>Library Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION_REF__LIBRARY_NAME = eINSTANCE.getActionRef_LibraryName();

		/**
		 * The meta object literal for the '<em><b>Referenced Action Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION_REF__REFERENCED_ACTION_ID = eINSTANCE.getActionRef_ReferencedActionId();

		/**
		 * The meta object literal for the '{@link org.hl7.knowledgeartifact.r1.impl.ActorImpl <em>Actor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.knowledgeartifact.r1.impl.ActorImpl
		 * @see org.hl7.knowledgeartifact.r1.impl.R1PackageImpl#getActor()
		 * @generated
		 */
		EClass ACTOR = eINSTANCE.getActor();

		/**
		 * The meta object literal for the '<em><b>Actor</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTOR__ACTOR = eINSTANCE.getActor_Actor();

		/**
		 * The meta object literal for the '{@link org.hl7.knowledgeartifact.r1.impl.ActorsTypeImpl <em>Actors Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.knowledgeartifact.r1.impl.ActorsTypeImpl
		 * @see org.hl7.knowledgeartifact.r1.impl.R1PackageImpl#getActorsType()
		 * @generated
		 */
		EClass ACTORS_TYPE = eINSTANCE.getActorsType();

		/**
		 * The meta object literal for the '<em><b>Actor</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTORS_TYPE__ACTOR = eINSTANCE.getActorsType_Actor();

		/**
		 * The meta object literal for the '{@link org.hl7.knowledgeartifact.r1.impl.AddressesTypeImpl <em>Addresses Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.knowledgeartifact.r1.impl.AddressesTypeImpl
		 * @see org.hl7.knowledgeartifact.r1.impl.R1PackageImpl#getAddressesType()
		 * @generated
		 */
		EClass ADDRESSES_TYPE = eINSTANCE.getAddressesType();

		/**
		 * The meta object literal for the '<em><b>Address</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADDRESSES_TYPE__ADDRESS = eINSTANCE.getAddressesType_Address();

		/**
		 * The meta object literal for the '{@link org.hl7.knowledgeartifact.r1.impl.ApplicabilityTypeImpl <em>Applicability Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.knowledgeartifact.r1.impl.ApplicabilityTypeImpl
		 * @see org.hl7.knowledgeartifact.r1.impl.R1PackageImpl#getApplicabilityType()
		 * @generated
		 */
		EClass APPLICABILITY_TYPE = eINSTANCE.getApplicabilityType();

		/**
		 * The meta object literal for the '<em><b>Coverage</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICABILITY_TYPE__COVERAGE = eINSTANCE.getApplicabilityType_Coverage();

		/**
		 * The meta object literal for the '{@link org.hl7.knowledgeartifact.r1.impl.ArtifactLifeCycleEventImpl <em>Artifact Life Cycle Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.knowledgeartifact.r1.impl.ArtifactLifeCycleEventImpl
		 * @see org.hl7.knowledgeartifact.r1.impl.R1PackageImpl#getArtifactLifeCycleEvent()
		 * @generated
		 */
		EClass ARTIFACT_LIFE_CYCLE_EVENT = eINSTANCE.getArtifactLifeCycleEvent();

		/**
		 * The meta object literal for the '<em><b>Event Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARTIFACT_LIFE_CYCLE_EVENT__EVENT_TYPE = eINSTANCE.getArtifactLifeCycleEvent_EventType();

		/**
		 * The meta object literal for the '<em><b>Event Date Time</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARTIFACT_LIFE_CYCLE_EVENT__EVENT_DATE_TIME = eINSTANCE.getArtifactLifeCycleEvent_EventDateTime();

		/**
		 * The meta object literal for the '{@link org.hl7.knowledgeartifact.r1.impl.ArtifactTypeTypeImpl <em>Artifact Type Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.knowledgeartifact.r1.impl.ArtifactTypeTypeImpl
		 * @see org.hl7.knowledgeartifact.r1.impl.R1PackageImpl#getArtifactTypeType()
		 * @generated
		 */
		EClass ARTIFACT_TYPE_TYPE = eINSTANCE.getArtifactTypeType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARTIFACT_TYPE_TYPE__VALUE = eINSTANCE.getArtifactTypeType_Value();

		/**
		 * The meta object literal for the '{@link org.hl7.knowledgeartifact.r1.impl.AtomicActionImpl <em>Atomic Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.knowledgeartifact.r1.impl.AtomicActionImpl
		 * @see org.hl7.knowledgeartifact.r1.impl.R1PackageImpl#getAtomicAction()
		 * @generated
		 */
		EClass ATOMIC_ACTION = eINSTANCE.getAtomicAction();

		/**
		 * The meta object literal for the '<em><b>Text Equivalent</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATOMIC_ACTION__TEXT_EQUIVALENT = eINSTANCE.getAtomicAction_TextEquivalent();

		/**
		 * The meta object literal for the '{@link org.hl7.knowledgeartifact.r1.impl.BehaviorImpl <em>Behavior</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.knowledgeartifact.r1.impl.BehaviorImpl
		 * @see org.hl7.knowledgeartifact.r1.impl.R1PackageImpl#getBehavior()
		 * @generated
		 */
		EClass BEHAVIOR = eINSTANCE.getBehavior();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BEHAVIOR__VALUE = eINSTANCE.getBehavior_Value();

		/**
		 * The meta object literal for the '{@link org.hl7.knowledgeartifact.r1.impl.BehaviorsImpl <em>Behaviors</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.knowledgeartifact.r1.impl.BehaviorsImpl
		 * @see org.hl7.knowledgeartifact.r1.impl.R1PackageImpl#getBehaviors()
		 * @generated
		 */
		EClass BEHAVIORS = eINSTANCE.getBehaviors();

		/**
		 * The meta object literal for the '<em><b>Behavior</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEHAVIORS__BEHAVIOR = eINSTANCE.getBehaviors_Behavior();

		/**
		 * The meta object literal for the '{@link org.hl7.knowledgeartifact.r1.impl.CardinalityBehaviorImpl <em>Cardinality Behavior</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.knowledgeartifact.r1.impl.CardinalityBehaviorImpl
		 * @see org.hl7.knowledgeartifact.r1.impl.R1PackageImpl#getCardinalityBehavior()
		 * @generated
		 */
		EClass CARDINALITY_BEHAVIOR = eINSTANCE.getCardinalityBehavior();

		/**
		 * The meta object literal for the '{@link org.hl7.knowledgeartifact.r1.impl.CategoriesTypeImpl <em>Categories Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.knowledgeartifact.r1.impl.CategoriesTypeImpl
		 * @see org.hl7.knowledgeartifact.r1.impl.R1PackageImpl#getCategoriesType()
		 * @generated
		 */
		EClass CATEGORIES_TYPE = eINSTANCE.getCategoriesType();

		/**
		 * The meta object literal for the '<em><b>Category</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATEGORIES_TYPE__CATEGORY = eINSTANCE.getCategoriesType_Category();

		/**
		 * The meta object literal for the '{@link org.hl7.knowledgeartifact.r1.impl.CodesTypeImpl <em>Codes Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.knowledgeartifact.r1.impl.CodesTypeImpl
		 * @see org.hl7.knowledgeartifact.r1.impl.R1PackageImpl#getCodesType()
		 * @generated
		 */
		EClass CODES_TYPE = eINSTANCE.getCodesType();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CODES_TYPE__CODE = eINSTANCE.getCodesType_Code();

		/**
		 * The meta object literal for the '{@link org.hl7.knowledgeartifact.r1.impl.CollectInformationActionImpl <em>Collect Information Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.knowledgeartifact.r1.impl.CollectInformationActionImpl
		 * @see org.hl7.knowledgeartifact.r1.impl.R1PackageImpl#getCollectInformationAction()
		 * @generated
		 */
		EClass COLLECT_INFORMATION_ACTION = eINSTANCE.getCollectInformationAction();

		/**
		 * The meta object literal for the '<em><b>Documentation Concept</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLLECT_INFORMATION_ACTION__DOCUMENTATION_CONCEPT = eINSTANCE.getCollectInformationAction_DocumentationConcept();

		/**
		 * The meta object literal for the '<em><b>Initial Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLLECT_INFORMATION_ACTION__INITIAL_VALUE = eINSTANCE.getCollectInformationAction_InitialValue();

		/**
		 * The meta object literal for the '<em><b>Response Binding</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLLECT_INFORMATION_ACTION__RESPONSE_BINDING = eINSTANCE.getCollectInformationAction_ResponseBinding();

		/**
		 * The meta object literal for the '{@link org.hl7.knowledgeartifact.r1.impl.ConditionImpl <em>Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.knowledgeartifact.r1.impl.ConditionImpl
		 * @see org.hl7.knowledgeartifact.r1.impl.R1PackageImpl#getCondition()
		 * @generated
		 */
		EClass CONDITION = eINSTANCE.getCondition();

		/**
		 * The meta object literal for the '<em><b>Logic</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITION__LOGIC = eINSTANCE.getCondition_Logic();

		/**
		 * The meta object literal for the '<em><b>Condition Role</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITION__CONDITION_ROLE = eINSTANCE.getCondition_ConditionRole();

		/**
		 * The meta object literal for the '{@link org.hl7.knowledgeartifact.r1.impl.ConditionRoleType1Impl <em>Condition Role Type1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.knowledgeartifact.r1.impl.ConditionRoleType1Impl
		 * @see org.hl7.knowledgeartifact.r1.impl.R1PackageImpl#getConditionRoleType1()
		 * @generated
		 */
		EClass CONDITION_ROLE_TYPE1 = eINSTANCE.getConditionRoleType1();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONDITION_ROLE_TYPE1__VALUE = eINSTANCE.getConditionRoleType1_Value();

		/**
		 * The meta object literal for the '{@link org.hl7.knowledgeartifact.r1.impl.ConditionsImpl <em>Conditions</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.knowledgeartifact.r1.impl.ConditionsImpl
		 * @see org.hl7.knowledgeartifact.r1.impl.R1PackageImpl#getConditions()
		 * @generated
		 */
		EClass CONDITIONS = eINSTANCE.getConditions();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITIONS__CONDITION = eINSTANCE.getConditions_Condition();

		/**
		 * The meta object literal for the '{@link org.hl7.knowledgeartifact.r1.impl.ConstraintTypeTypeImpl <em>Constraint Type Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.knowledgeartifact.r1.impl.ConstraintTypeTypeImpl
		 * @see org.hl7.knowledgeartifact.r1.impl.R1PackageImpl#getConstraintTypeType()
		 * @generated
		 */
		EClass CONSTRAINT_TYPE_TYPE = eINSTANCE.getConstraintTypeType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTRAINT_TYPE_TYPE__VALUE = eINSTANCE.getConstraintTypeType_Value();

		/**
		 * The meta object literal for the '{@link org.hl7.knowledgeartifact.r1.impl.ContactsTypeImpl <em>Contacts Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.knowledgeartifact.r1.impl.ContactsTypeImpl
		 * @see org.hl7.knowledgeartifact.r1.impl.R1PackageImpl#getContactsType()
		 * @generated
		 */
		EClass CONTACTS_TYPE = eINSTANCE.getContactsType();

		/**
		 * The meta object literal for the '<em><b>Contact</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTACTS_TYPE__CONTACT = eINSTANCE.getContactsType_Contact();

		/**
		 * The meta object literal for the '{@link org.hl7.knowledgeartifact.r1.impl.ContentTypeImpl <em>Content Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.knowledgeartifact.r1.impl.ContentTypeImpl
		 * @see org.hl7.knowledgeartifact.r1.impl.R1PackageImpl#getContentType()
		 * @generated
		 */
		EClass CONTENT_TYPE = eINSTANCE.getContentType();

		/**
		 * The meta object literal for the '<em><b>Div</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENT_TYPE__DIV = eINSTANCE.getContentType_Div();

		/**
		 * The meta object literal for the '{@link org.hl7.knowledgeartifact.r1.impl.ContributionImpl <em>Contribution</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.knowledgeartifact.r1.impl.ContributionImpl
		 * @see org.hl7.knowledgeartifact.r1.impl.R1PackageImpl#getContribution()
		 * @generated
		 */
		EClass CONTRIBUTION = eINSTANCE.getContribution();

		/**
		 * The meta object literal for the '<em><b>Contributor</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTRIBUTION__CONTRIBUTOR = eINSTANCE.getContribution_Contributor();

		/**
		 * The meta object literal for the '<em><b>Role</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTRIBUTION__ROLE = eINSTANCE.getContribution_Role();

		/**
		 * The meta object literal for the '{@link org.hl7.knowledgeartifact.r1.impl.ContributionsTypeImpl <em>Contributions Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.knowledgeartifact.r1.impl.ContributionsTypeImpl
		 * @see org.hl7.knowledgeartifact.r1.impl.R1PackageImpl#getContributionsType()
		 * @generated
		 */
		EClass CONTRIBUTIONS_TYPE = eINSTANCE.getContributionsType();

		/**
		 * The meta object literal for the '<em><b>Contribution</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTRIBUTIONS_TYPE__CONTRIBUTION = eINSTANCE.getContributionsType_Contribution();

		/**
		 * The meta object literal for the '{@link org.hl7.knowledgeartifact.r1.impl.CoverageImpl <em>Coverage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.knowledgeartifact.r1.impl.CoverageImpl
		 * @see org.hl7.knowledgeartifact.r1.impl.R1PackageImpl#getCoverage()
		 * @generated
		 */
		EClass COVERAGE = eINSTANCE.getCoverage();

		/**
		 * The meta object literal for the '<em><b>Focus</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COVERAGE__FOCUS = eINSTANCE.getCoverage_Focus();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COVERAGE__DESCRIPTION = eINSTANCE.getCoverage_Description();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COVERAGE__VALUE = eINSTANCE.getCoverage_Value();

		/**
		 * The meta object literal for the '{@link org.hl7.knowledgeartifact.r1.impl.CreateActionImpl <em>Create Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.knowledgeartifact.r1.impl.CreateActionImpl
		 * @see org.hl7.knowledgeartifact.r1.impl.R1PackageImpl#getCreateAction()
		 * @generated
		 */
		EClass CREATE_ACTION = eINSTANCE.getCreateAction();

		/**
		 * The meta object literal for the '<em><b>Action Sentence</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CREATE_ACTION__ACTION_SENTENCE = eINSTANCE.getCreateAction_ActionSentence();

		/**
		 * The meta object literal for the '{@link org.hl7.knowledgeartifact.r1.impl.DataEventTriggerImpl <em>Data Event Trigger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.knowledgeartifact.r1.impl.DataEventTriggerImpl
		 * @see org.hl7.knowledgeartifact.r1.impl.R1PackageImpl#getDataEventTrigger()
		 * @generated
		 */
		EClass DATA_EVENT_TRIGGER = eINSTANCE.getDataEventTrigger();

		/**
		 * The meta object literal for the '<em><b>Trigger Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_EVENT_TRIGGER__TRIGGER_TYPE = eINSTANCE.getDataEventTrigger_TriggerType();

		/**
		 * The meta object literal for the '{@link org.hl7.knowledgeartifact.r1.impl.DataModelsTypeImpl <em>Data Models Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.knowledgeartifact.r1.impl.DataModelsTypeImpl
		 * @see org.hl7.knowledgeartifact.r1.impl.R1PackageImpl#getDataModelsType()
		 * @generated
		 */
		EClass DATA_MODELS_TYPE = eINSTANCE.getDataModelsType();

		/**
		 * The meta object literal for the '<em><b>Model Reference</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_MODELS_TYPE__MODEL_REFERENCE = eINSTANCE.getDataModelsType_ModelReference();

		/**
		 * The meta object literal for the '{@link org.hl7.knowledgeartifact.r1.impl.DeclareResponseActionImpl <em>Declare Response Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.knowledgeartifact.r1.impl.DeclareResponseActionImpl
		 * @see org.hl7.knowledgeartifact.r1.impl.R1PackageImpl#getDeclareResponseAction()
		 * @generated
		 */
		EClass DECLARE_RESPONSE_ACTION = eINSTANCE.getDeclareResponseAction();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DECLARE_RESPONSE_ACTION__NAME = eINSTANCE.getDeclareResponseAction_Name();

		/**
		 * The meta object literal for the '{@link org.hl7.knowledgeartifact.r1.impl.DocumentationItemImpl <em>Documentation Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.knowledgeartifact.r1.impl.DocumentationItemImpl
		 * @see org.hl7.knowledgeartifact.r1.impl.R1PackageImpl#getDocumentationItem()
		 * @generated
		 */
		EClass DOCUMENTATION_ITEM = eINSTANCE.getDocumentationItem();

		/**
		 * The meta object literal for the '<em><b>Prompt</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENTATION_ITEM__PROMPT = eINSTANCE.getDocumentationItem_Prompt();

		/**
		 * The meta object literal for the '<em><b>Additional Instructions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENTATION_ITEM__ADDITIONAL_INSTRUCTIONS = eINSTANCE.getDocumentationItem_AdditionalInstructions();

		/**
		 * The meta object literal for the '<em><b>Text After Response</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENTATION_ITEM__TEXT_AFTER_RESPONSE = eINSTANCE.getDocumentationItem_TextAfterResponse();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENTATION_ITEM__DESCRIPTION = eINSTANCE.getDocumentationItem_Description();

		/**
		 * The meta object literal for the '<em><b>Item Codes</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENTATION_ITEM__ITEM_CODES = eINSTANCE.getDocumentationItem_ItemCodes();

		/**
		 * The meta object literal for the '<em><b>Response Data Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENTATION_ITEM__RESPONSE_DATA_TYPE = eINSTANCE.getDocumentationItem_ResponseDataType();

		/**
		 * The meta object literal for the '<em><b>Response Cardinality</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENTATION_ITEM__RESPONSE_CARDINALITY = eINSTANCE.getDocumentationItem_ResponseCardinality();

		/**
		 * The meta object literal for the '<em><b>Response Range</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENTATION_ITEM__RESPONSE_RANGE = eINSTANCE.getDocumentationItem_ResponseRange();

		/**
		 * The meta object literal for the '{@link org.hl7.knowledgeartifact.r1.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.knowledgeartifact.r1.impl.DocumentRootImpl
		 * @see org.hl7.knowledgeartifact.r1.impl.R1PackageImpl#getDocumentRoot()
		 * @generated
		 */
		EClass DOCUMENT_ROOT = eINSTANCE.getDocumentRoot();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__MIXED = eINSTANCE.getDocumentRoot_Mixed();

		/**
		 * The meta object literal for the '<em><b>XMLNS Prefix Map</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XMLNS_PREFIX_MAP = eINSTANCE.getDocumentRoot_XMLNSPrefixMap();

		/**
		 * The meta object literal for the '<em><b>XSI Schema Location</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = eINSTANCE.getDocumentRoot_XSISchemaLocation();

		/**
		 * The meta object literal for the '<em><b>Knowledge Document</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__KNOWLEDGE_DOCUMENT = eINSTANCE.getDocumentRoot_KnowledgeDocument();

		/**
		 * The meta object literal for the '{@link org.hl7.knowledgeartifact.r1.impl.EnumerationConstraintImpl <em>Enumeration Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.knowledgeartifact.r1.impl.EnumerationConstraintImpl
		 * @see org.hl7.knowledgeartifact.r1.impl.R1PackageImpl#getEnumerationConstraint()
		 * @generated
		 */
		EClass ENUMERATION_CONSTRAINT = eINSTANCE.getEnumerationConstraint();

		/**
		 * The meta object literal for the '<em><b>Item</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENUMERATION_CONSTRAINT__ITEM = eINSTANCE.getEnumerationConstraint_Item();

		/**
		 * The meta object literal for the '<em><b>Strict Selection</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENUMERATION_CONSTRAINT__STRICT_SELECTION = eINSTANCE.getEnumerationConstraint_StrictSelection();

		/**
		 * The meta object literal for the '{@link org.hl7.knowledgeartifact.r1.impl.EnumerationItemImpl <em>Enumeration Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.knowledgeartifact.r1.impl.EnumerationItemImpl
		 * @see org.hl7.knowledgeartifact.r1.impl.R1PackageImpl#getEnumerationItem()
		 * @generated
		 */
		EClass ENUMERATION_ITEM = eINSTANCE.getEnumerationItem();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENUMERATION_ITEM__IDENTIFIER = eINSTANCE.getEnumerationItem_Identifier();

		/**
		 * The meta object literal for the '<em><b>Number</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENUMERATION_ITEM__NUMBER = eINSTANCE.getEnumerationItem_Number();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENUMERATION_ITEM__VALUE = eINSTANCE.getEnumerationItem_Value();

		/**
		 * The meta object literal for the '<em><b>Codes</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENUMERATION_ITEM__CODES = eINSTANCE.getEnumerationItem_Codes();

		/**
		 * The meta object literal for the '<em><b>Display Text</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENUMERATION_ITEM__DISPLAY_TEXT = eINSTANCE.getEnumerationItem_DisplayText();

		/**
		 * The meta object literal for the '<em><b>Additional Instructions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENUMERATION_ITEM__ADDITIONAL_INSTRUCTIONS = eINSTANCE.getEnumerationItem_AdditionalInstructions();

		/**
		 * The meta object literal for the '<em><b>Value Meaning</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENUMERATION_ITEM__VALUE_MEANING = eINSTANCE.getEnumerationItem_ValueMeaning();

		/**
		 * The meta object literal for the '<em><b>Fill In</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENUMERATION_ITEM__FILL_IN = eINSTANCE.getEnumerationItem_FillIn();

		/**
		 * The meta object literal for the '{@link org.hl7.knowledgeartifact.r1.impl.EventHistoryTypeImpl <em>Event History Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.knowledgeartifact.r1.impl.EventHistoryTypeImpl
		 * @see org.hl7.knowledgeartifact.r1.impl.R1PackageImpl#getEventHistoryType()
		 * @generated
		 */
		EClass EVENT_HISTORY_TYPE = eINSTANCE.getEventHistoryType();

		/**
		 * The meta object literal for the '<em><b>Artifact Life Cycle Event</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT_HISTORY_TYPE__ARTIFACT_LIFE_CYCLE_EVENT = eINSTANCE.getEventHistoryType_ArtifactLifeCycleEvent();

		/**
		 * The meta object literal for the '{@link org.hl7.knowledgeartifact.r1.impl.EventTypeTypeImpl <em>Event Type Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.knowledgeartifact.r1.impl.EventTypeTypeImpl
		 * @see org.hl7.knowledgeartifact.r1.impl.R1PackageImpl#getEventTypeType()
		 * @generated
		 */
		EClass EVENT_TYPE_TYPE = eINSTANCE.getEventTypeType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT_TYPE_TYPE__VALUE = eINSTANCE.getEventTypeType_Value();

		/**
		 * The meta object literal for the '{@link org.hl7.knowledgeartifact.r1.impl.EvidenceImpl <em>Evidence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.knowledgeartifact.r1.impl.EvidenceImpl
		 * @see org.hl7.knowledgeartifact.r1.impl.R1PackageImpl#getEvidence()
		 * @generated
		 */
		EClass EVIDENCE = eINSTANCE.getEvidence();

		/**
		 * The meta object literal for the '<em><b>Quality Of Evidence</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVIDENCE__QUALITY_OF_EVIDENCE = eINSTANCE.getEvidence_QualityOfEvidence();

		/**
		 * The meta object literal for the '<em><b>Strength Of Recommendation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVIDENCE__STRENGTH_OF_RECOMMENDATION = eINSTANCE.getEvidence_StrengthOfRecommendation();

		/**
		 * The meta object literal for the '<em><b>Resources</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVIDENCE__RESOURCES = eINSTANCE.getEvidence_Resources();

		/**
		 * The meta object literal for the '{@link org.hl7.knowledgeartifact.r1.impl.ExpressionConstraintImpl <em>Expression Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.knowledgeartifact.r1.impl.ExpressionConstraintImpl
		 * @see org.hl7.knowledgeartifact.r1.impl.R1PackageImpl#getExpressionConstraint()
		 * @generated
		 */
		EClass EXPRESSION_CONSTRAINT = eINSTANCE.getExpressionConstraint();

		/**
		 * The meta object literal for the '<em><b>Constraint</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSION_CONSTRAINT__CONSTRAINT = eINSTANCE.getExpressionConstraint_Constraint();

		/**
		 * The meta object literal for the '{@link org.hl7.knowledgeartifact.r1.impl.ExpressionsTypeImpl <em>Expressions Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.knowledgeartifact.r1.impl.ExpressionsTypeImpl
		 * @see org.hl7.knowledgeartifact.r1.impl.R1PackageImpl#getExpressionsType()
		 * @generated
		 */
		EClass EXPRESSIONS_TYPE = eINSTANCE.getExpressionsType();

		/**
		 * The meta object literal for the '<em><b>Def</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSIONS_TYPE__DEF = eINSTANCE.getExpressionsType_Def();

		/**
		 * The meta object literal for the '{@link org.hl7.knowledgeartifact.r1.impl.ExternalDataTypeImpl <em>External Data Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.knowledgeartifact.r1.impl.ExternalDataTypeImpl
		 * @see org.hl7.knowledgeartifact.r1.impl.R1PackageImpl#getExternalDataType()
		 * @generated
		 */
		EClass EXTERNAL_DATA_TYPE = eINSTANCE.getExternalDataType();

		/**
		 * The meta object literal for the '<em><b>Codesystem</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTERNAL_DATA_TYPE__CODESYSTEM = eINSTANCE.getExternalDataType_Codesystem();

		/**
		 * The meta object literal for the '<em><b>Valueset</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTERNAL_DATA_TYPE__VALUESET = eINSTANCE.getExternalDataType_Valueset();

		/**
		 * The meta object literal for the '<em><b>Parameter</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTERNAL_DATA_TYPE__PARAMETER = eINSTANCE.getExternalDataType_Parameter();

		/**
		 * The meta object literal for the '<em><b>Def</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTERNAL_DATA_TYPE__DEF = eINSTANCE.getExternalDataType_Def();

		/**
		 * The meta object literal for the '<em><b>Trigger</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTERNAL_DATA_TYPE__TRIGGER = eINSTANCE.getExternalDataType_Trigger();

		/**
		 * The meta object literal for the '{@link org.hl7.knowledgeartifact.r1.impl.FireEventActionImpl <em>Fire Event Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.knowledgeartifact.r1.impl.FireEventActionImpl
		 * @see org.hl7.knowledgeartifact.r1.impl.R1PackageImpl#getFireEventAction()
		 * @generated
		 */
		EClass FIRE_EVENT_ACTION = eINSTANCE.getFireEventAction();

		/**
		 * The meta object literal for the '<em><b>Event Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIRE_EVENT_ACTION__EVENT_TYPE = eINSTANCE.getFireEventAction_EventType();

		/**
		 * The meta object literal for the '<em><b>Action Sentence</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIRE_EVENT_ACTION__ACTION_SENTENCE = eINSTANCE.getFireEventAction_ActionSentence();

		/**
		 * The meta object literal for the '{@link org.hl7.knowledgeartifact.r1.impl.FocusTypeImpl <em>Focus Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.knowledgeartifact.r1.impl.FocusTypeImpl
		 * @see org.hl7.knowledgeartifact.r1.impl.R1PackageImpl#getFocusType()
		 * @generated
		 */
		EClass FOCUS_TYPE = eINSTANCE.getFocusType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FOCUS_TYPE__VALUE = eINSTANCE.getFocusType_Value();

		/**
		 * The meta object literal for the '{@link org.hl7.knowledgeartifact.r1.impl.FormattedNumberImpl <em>Formatted Number</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.knowledgeartifact.r1.impl.FormattedNumberImpl
		 * @see org.hl7.knowledgeartifact.r1.impl.R1PackageImpl#getFormattedNumber()
		 * @generated
		 */
		EClass FORMATTED_NUMBER = eINSTANCE.getFormattedNumber();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORMATTED_NUMBER__LABEL = eINSTANCE.getFormattedNumber_Label();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORMATTED_NUMBER__STYLE = eINSTANCE.getFormattedNumber_Style();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORMATTED_NUMBER__VALUE = eINSTANCE.getFormattedNumber_Value();

		/**
		 * The meta object literal for the '{@link org.hl7.knowledgeartifact.r1.impl.FormattedTextImpl <em>Formatted Text</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.knowledgeartifact.r1.impl.FormattedTextImpl
		 * @see org.hl7.knowledgeartifact.r1.impl.R1PackageImpl#getFormattedText()
		 * @generated
		 */
		EClass FORMATTED_TEXT = eINSTANCE.getFormattedText();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORMATTED_TEXT__LABEL = eINSTANCE.getFormattedText_Label();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORMATTED_TEXT__STYLE = eINSTANCE.getFormattedText_Style();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORMATTED_TEXT__VALUE = eINSTANCE.getFormattedText_Value();

		/**
		 * The meta object literal for the '{@link org.hl7.knowledgeartifact.r1.impl.GroupOrganizationBehaviorImpl <em>Group Organization Behavior</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.knowledgeartifact.r1.impl.GroupOrganizationBehaviorImpl
		 * @see org.hl7.knowledgeartifact.r1.impl.R1PackageImpl#getGroupOrganizationBehavior()
		 * @generated
		 */
		EClass GROUP_ORGANIZATION_BEHAVIOR = eINSTANCE.getGroupOrganizationBehavior();

		/**
		 * The meta object literal for the '{@link org.hl7.knowledgeartifact.r1.impl.GroupSelectionBehaviorImpl <em>Group Selection Behavior</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.knowledgeartifact.r1.impl.GroupSelectionBehaviorImpl
		 * @see org.hl7.knowledgeartifact.r1.impl.R1PackageImpl#getGroupSelectionBehavior()
		 * @generated
		 */
		EClass GROUP_SELECTION_BEHAVIOR = eINSTANCE.getGroupSelectionBehavior();

		/**
		 * The meta object literal for the '{@link org.hl7.knowledgeartifact.r1.impl.IdentifiersTypeImpl <em>Identifiers Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.knowledgeartifact.r1.impl.IdentifiersTypeImpl
		 * @see org.hl7.knowledgeartifact.r1.impl.R1PackageImpl#getIdentifiersType()
		 * @generated
		 */
		EClass IDENTIFIERS_TYPE = eINSTANCE.getIdentifiersType();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IDENTIFIERS_TYPE__IDENTIFIER = eINSTANCE.getIdentifiersType_Identifier();

		/**
		 * The meta object literal for the '{@link org.hl7.knowledgeartifact.r1.impl.IdentifiersType1Impl <em>Identifiers Type1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.knowledgeartifact.r1.impl.IdentifiersType1Impl
		 * @see org.hl7.knowledgeartifact.r1.impl.R1PackageImpl#getIdentifiersType1()
		 * @generated
		 */
		EClass IDENTIFIERS_TYPE1 = eINSTANCE.getIdentifiersType1();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IDENTIFIERS_TYPE1__IDENTIFIER = eINSTANCE.getIdentifiersType1_Identifier();

		/**
		 * The meta object literal for the '{@link org.hl7.knowledgeartifact.r1.impl.InlineResourceImpl <em>Inline Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.knowledgeartifact.r1.impl.InlineResourceImpl
		 * @see org.hl7.knowledgeartifact.r1.impl.R1PackageImpl#getInlineResource()
		 * @generated
		 */
		EClass INLINE_RESOURCE = eINSTANCE.getInlineResource();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INLINE_RESOURCE__CONTENT = eINSTANCE.getInlineResource_Content();

		/**
		 * The meta object literal for the '{@link org.hl7.knowledgeartifact.r1.impl.ItemCodesTypeImpl <em>Item Codes Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.knowledgeartifact.r1.impl.ItemCodesTypeImpl
		 * @see org.hl7.knowledgeartifact.r1.impl.R1PackageImpl#getItemCodesType()
		 * @generated
		 */
		EClass ITEM_CODES_TYPE = eINSTANCE.getItemCodesType();

		/**
		 * The meta object literal for the '<em><b>Item Code</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITEM_CODES_TYPE__ITEM_CODE = eINSTANCE.getItemCodesType_ItemCode();

		/**
		 * The meta object literal for the '{@link org.hl7.knowledgeartifact.r1.impl.ItemDefinitionImpl <em>Item Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.knowledgeartifact.r1.impl.ItemDefinitionImpl
		 * @see org.hl7.knowledgeartifact.r1.impl.R1PackageImpl#getItemDefinition()
		 * @generated
		 */
		EClass ITEM_DEFINITION = eINSTANCE.getItemDefinition();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITEM_DEFINITION__IDENTIFIER = eINSTANCE.getItemDefinition_Identifier();

		/**
		 * The meta object literal for the '<em><b>Scoped Identifier</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITEM_DEFINITION__SCOPED_IDENTIFIER = eINSTANCE.getItemDefinition_ScopedIdentifier();

		/**
		 * The meta object literal for the '{@link org.hl7.knowledgeartifact.r1.impl.KeyTermsTypeImpl <em>Key Terms Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.knowledgeartifact.r1.impl.KeyTermsTypeImpl
		 * @see org.hl7.knowledgeartifact.r1.impl.R1PackageImpl#getKeyTermsType()
		 * @generated
		 */
		EClass KEY_TERMS_TYPE = eINSTANCE.getKeyTermsType();

		/**
		 * The meta object literal for the '<em><b>Term</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KEY_TERMS_TYPE__TERM = eINSTANCE.getKeyTermsType_Term();

		/**
		 * The meta object literal for the '{@link org.hl7.knowledgeartifact.r1.impl.KnowledgeDocumentImpl <em>Knowledge Document</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.knowledgeartifact.r1.impl.KnowledgeDocumentImpl
		 * @see org.hl7.knowledgeartifact.r1.impl.R1PackageImpl#getKnowledgeDocument()
		 * @generated
		 */
		EClass KNOWLEDGE_DOCUMENT = eINSTANCE.getKnowledgeDocument();

		/**
		 * The meta object literal for the '<em><b>Metadata</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KNOWLEDGE_DOCUMENT__METADATA = eINSTANCE.getKnowledgeDocument_Metadata();

		/**
		 * The meta object literal for the '<em><b>External Data</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KNOWLEDGE_DOCUMENT__EXTERNAL_DATA = eINSTANCE.getKnowledgeDocument_ExternalData();

		/**
		 * The meta object literal for the '<em><b>Expressions</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KNOWLEDGE_DOCUMENT__EXPRESSIONS = eINSTANCE.getKnowledgeDocument_Expressions();

		/**
		 * The meta object literal for the '<em><b>Triggers</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KNOWLEDGE_DOCUMENT__TRIGGERS = eINSTANCE.getKnowledgeDocument_Triggers();

		/**
		 * The meta object literal for the '<em><b>Conditions</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KNOWLEDGE_DOCUMENT__CONDITIONS = eINSTANCE.getKnowledgeDocument_Conditions();

		/**
		 * The meta object literal for the '<em><b>Behaviors</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KNOWLEDGE_DOCUMENT__BEHAVIORS = eINSTANCE.getKnowledgeDocument_Behaviors();

		/**
		 * The meta object literal for the '<em><b>Action Group</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KNOWLEDGE_DOCUMENT__ACTION_GROUP = eINSTANCE.getKnowledgeDocument_ActionGroup();

		/**
		 * The meta object literal for the '{@link org.hl7.knowledgeartifact.r1.impl.KnowledgeResourceImpl <em>Knowledge Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.knowledgeartifact.r1.impl.KnowledgeResourceImpl
		 * @see org.hl7.knowledgeartifact.r1.impl.R1PackageImpl#getKnowledgeResource()
		 * @generated
		 */
		EClass KNOWLEDGE_RESOURCE = eINSTANCE.getKnowledgeResource();

		/**
		 * The meta object literal for the '<em><b>Identifiers</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KNOWLEDGE_RESOURCE__IDENTIFIERS = eINSTANCE.getKnowledgeResource_Identifiers();

		/**
		 * The meta object literal for the '<em><b>Template Ids</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KNOWLEDGE_RESOURCE__TEMPLATE_IDS = eINSTANCE.getKnowledgeResource_TemplateIds();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KNOWLEDGE_RESOURCE__TITLE = eINSTANCE.getKnowledgeResource_Title();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KNOWLEDGE_RESOURCE__LOCATION = eINSTANCE.getKnowledgeResource_Location();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KNOWLEDGE_RESOURCE__DESCRIPTION = eINSTANCE.getKnowledgeResource_Description();

		/**
		 * The meta object literal for the '<em><b>Citation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KNOWLEDGE_RESOURCE__CITATION = eINSTANCE.getKnowledgeResource_Citation();

		/**
		 * The meta object literal for the '{@link org.hl7.knowledgeartifact.r1.impl.LibrariesTypeImpl <em>Libraries Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.knowledgeartifact.r1.impl.LibrariesTypeImpl
		 * @see org.hl7.knowledgeartifact.r1.impl.R1PackageImpl#getLibrariesType()
		 * @generated
		 */
		EClass LIBRARIES_TYPE = eINSTANCE.getLibrariesType();

		/**
		 * The meta object literal for the '<em><b>Library Reference</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIBRARIES_TYPE__LIBRARY_REFERENCE = eINSTANCE.getLibrariesType_LibraryReference();

		/**
		 * The meta object literal for the '{@link org.hl7.knowledgeartifact.r1.impl.LibraryReferenceImpl <em>Library Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.knowledgeartifact.r1.impl.LibraryReferenceImpl
		 * @see org.hl7.knowledgeartifact.r1.impl.R1PackageImpl#getLibraryReference()
		 * @generated
		 */
		EClass LIBRARY_REFERENCE = eINSTANCE.getLibraryReference();

		/**
		 * The meta object literal for the '<em><b>Media Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIBRARY_REFERENCE__MEDIA_TYPE = eINSTANCE.getLibraryReference_MediaType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIBRARY_REFERENCE__NAME = eINSTANCE.getLibraryReference_Name();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIBRARY_REFERENCE__PATH = eINSTANCE.getLibraryReference_Path();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIBRARY_REFERENCE__VERSION = eINSTANCE.getLibraryReference_Version();

		/**
		 * The meta object literal for the '{@link org.hl7.knowledgeartifact.r1.impl.LookupConstraintImpl <em>Lookup Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.knowledgeartifact.r1.impl.LookupConstraintImpl
		 * @see org.hl7.knowledgeartifact.r1.impl.R1PackageImpl#getLookupConstraint()
		 * @generated
		 */
		EClass LOOKUP_CONSTRAINT = eINSTANCE.getLookupConstraint();

		/**
		 * The meta object literal for the '<em><b>Items</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOOKUP_CONSTRAINT__ITEMS = eINSTANCE.getLookupConstraint_Items();

		/**
		 * The meta object literal for the '<em><b>Display Field</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOOKUP_CONSTRAINT__DISPLAY_FIELD = eINSTANCE.getLookupConstraint_DisplayField();

		/**
		 * The meta object literal for the '<em><b>Strict Selection</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOOKUP_CONSTRAINT__STRICT_SELECTION = eINSTANCE.getLookupConstraint_StrictSelection();

		/**
		 * The meta object literal for the '{@link org.hl7.knowledgeartifact.r1.impl.MaskConstraintImpl <em>Mask Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.knowledgeartifact.r1.impl.MaskConstraintImpl
		 * @see org.hl7.knowledgeartifact.r1.impl.R1PackageImpl#getMaskConstraint()
		 * @generated
		 */
		EClass MASK_CONSTRAINT = eINSTANCE.getMaskConstraint();

		/**
		 * The meta object literal for the '<em><b>Mask Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MASK_CONSTRAINT__MASK_EXPRESSION = eINSTANCE.getMaskConstraint_MaskExpression();

		/**
		 * The meta object literal for the '<em><b>Mask Help</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MASK_CONSTRAINT__MASK_HELP = eINSTANCE.getMaskConstraint_MaskHelp();

		/**
		 * The meta object literal for the '{@link org.hl7.knowledgeartifact.r1.impl.MetadataImpl <em>Metadata</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.knowledgeartifact.r1.impl.MetadataImpl
		 * @see org.hl7.knowledgeartifact.r1.impl.R1PackageImpl#getMetadata()
		 * @generated
		 */
		EClass METADATA = eINSTANCE.getMetadata();

		/**
		 * The meta object literal for the '<em><b>Identifiers</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METADATA__IDENTIFIERS = eINSTANCE.getMetadata_Identifiers();

		/**
		 * The meta object literal for the '<em><b>Artifact Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METADATA__ARTIFACT_TYPE = eINSTANCE.getMetadata_ArtifactType();

		/**
		 * The meta object literal for the '<em><b>Schema Identifier</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METADATA__SCHEMA_IDENTIFIER = eINSTANCE.getMetadata_SchemaIdentifier();

		/**
		 * The meta object literal for the '<em><b>Template Ids</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METADATA__TEMPLATE_IDS = eINSTANCE.getMetadata_TemplateIds();

		/**
		 * The meta object literal for the '<em><b>Data Models</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METADATA__DATA_MODELS = eINSTANCE.getMetadata_DataModels();

		/**
		 * The meta object literal for the '<em><b>Libraries</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METADATA__LIBRARIES = eINSTANCE.getMetadata_Libraries();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METADATA__TITLE = eINSTANCE.getMetadata_Title();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METADATA__DESCRIPTION = eINSTANCE.getMetadata_Description();

		/**
		 * The meta object literal for the '<em><b>Documentation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METADATA__DOCUMENTATION = eINSTANCE.getMetadata_Documentation();

		/**
		 * The meta object literal for the '<em><b>Related Resources</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METADATA__RELATED_RESOURCES = eINSTANCE.getMetadata_RelatedResources();

		/**
		 * The meta object literal for the '<em><b>Supporting Evidence</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METADATA__SUPPORTING_EVIDENCE = eINSTANCE.getMetadata_SupportingEvidence();

		/**
		 * The meta object literal for the '<em><b>Applicability</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METADATA__APPLICABILITY = eINSTANCE.getMetadata_Applicability();

		/**
		 * The meta object literal for the '<em><b>Key Terms</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METADATA__KEY_TERMS = eINSTANCE.getMetadata_KeyTerms();

		/**
		 * The meta object literal for the '<em><b>Categories</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METADATA__CATEGORIES = eINSTANCE.getMetadata_Categories();

		/**
		 * The meta object literal for the '<em><b>Language</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METADATA__LANGUAGE = eINSTANCE.getMetadata_Language();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METADATA__STATUS = eINSTANCE.getMetadata_Status();

		/**
		 * The meta object literal for the '<em><b>Event History</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METADATA__EVENT_HISTORY = eINSTANCE.getMetadata_EventHistory();

		/**
		 * The meta object literal for the '<em><b>Contributions</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METADATA__CONTRIBUTIONS = eINSTANCE.getMetadata_Contributions();

		/**
		 * The meta object literal for the '<em><b>Publishers</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METADATA__PUBLISHERS = eINSTANCE.getMetadata_Publishers();

		/**
		 * The meta object literal for the '<em><b>Usage Terms</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METADATA__USAGE_TERMS = eINSTANCE.getMetadata_UsageTerms();

		/**
		 * The meta object literal for the '{@link org.hl7.knowledgeartifact.r1.impl.ModelReferenceImpl <em>Model Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.knowledgeartifact.r1.impl.ModelReferenceImpl
		 * @see org.hl7.knowledgeartifact.r1.impl.R1PackageImpl#getModelReference()
		 * @generated
		 */
		EClass MODEL_REFERENCE = eINSTANCE.getModelReference();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_REFERENCE__DESCRIPTION = eINSTANCE.getModelReference_Description();

		/**
		 * The meta object literal for the '<em><b>Referenced Model</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_REFERENCE__REFERENCED_MODEL = eINSTANCE.getModelReference_ReferencedModel();

		/**
		 * The meta object literal for the '{@link org.hl7.knowledgeartifact.r1.impl.NamedEventTriggerImpl <em>Named Event Trigger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.knowledgeartifact.r1.impl.NamedEventTriggerImpl
		 * @see org.hl7.knowledgeartifact.r1.impl.R1PackageImpl#getNamedEventTrigger()
		 * @generated
		 */
		EClass NAMED_EVENT_TRIGGER = eINSTANCE.getNamedEventTrigger();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_EVENT_TRIGGER__NAME = eINSTANCE.getNamedEventTrigger_Name();

		/**
		 * The meta object literal for the '{@link org.hl7.knowledgeartifact.r1.impl.OrganizationImpl <em>Organization</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.knowledgeartifact.r1.impl.OrganizationImpl
		 * @see org.hl7.knowledgeartifact.r1.impl.R1PackageImpl#getOrganization()
		 * @generated
		 */
		EClass ORGANIZATION = eINSTANCE.getOrganization();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORGANIZATION__NAME = eINSTANCE.getOrganization_Name();

		/**
		 * The meta object literal for the '{@link org.hl7.knowledgeartifact.r1.impl.PartyImpl <em>Party</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.knowledgeartifact.r1.impl.PartyImpl
		 * @see org.hl7.knowledgeartifact.r1.impl.R1PackageImpl#getParty()
		 * @generated
		 */
		EClass PARTY = eINSTANCE.getParty();

		/**
		 * The meta object literal for the '<em><b>Addresses</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTY__ADDRESSES = eINSTANCE.getParty_Addresses();

		/**
		 * The meta object literal for the '<em><b>Contacts</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTY__CONTACTS = eINSTANCE.getParty_Contacts();

		/**
		 * The meta object literal for the '{@link org.hl7.knowledgeartifact.r1.impl.PeriodicEventTriggerImpl <em>Periodic Event Trigger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.knowledgeartifact.r1.impl.PeriodicEventTriggerImpl
		 * @see org.hl7.knowledgeartifact.r1.impl.R1PackageImpl#getPeriodicEventTrigger()
		 * @generated
		 */
		EClass PERIODIC_EVENT_TRIGGER = eINSTANCE.getPeriodicEventTrigger();

		/**
		 * The meta object literal for the '{@link org.hl7.knowledgeartifact.r1.impl.PermissionsTypeImpl <em>Permissions Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.knowledgeartifact.r1.impl.PermissionsTypeImpl
		 * @see org.hl7.knowledgeartifact.r1.impl.R1PackageImpl#getPermissionsType()
		 * @generated
		 */
		EClass PERMISSIONS_TYPE = eINSTANCE.getPermissionsType();

		/**
		 * The meta object literal for the '<em><b>Permissions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERMISSIONS_TYPE__PERMISSIONS = eINSTANCE.getPermissionsType_Permissions();

		/**
		 * The meta object literal for the '{@link org.hl7.knowledgeartifact.r1.impl.PersonImpl <em>Person</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.knowledgeartifact.r1.impl.PersonImpl
		 * @see org.hl7.knowledgeartifact.r1.impl.R1PackageImpl#getPerson()
		 * @generated
		 */
		EClass PERSON = eINSTANCE.getPerson();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSON__NAME = eINSTANCE.getPerson_Name();

		/**
		 * The meta object literal for the '<em><b>Affiliation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSON__AFFILIATION = eINSTANCE.getPerson_Affiliation();

		/**
		 * The meta object literal for the '{@link org.hl7.knowledgeartifact.r1.impl.PrecheckBehaviorImpl <em>Precheck Behavior</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.knowledgeartifact.r1.impl.PrecheckBehaviorImpl
		 * @see org.hl7.knowledgeartifact.r1.impl.R1PackageImpl#getPrecheckBehavior()
		 * @generated
		 */
		EClass PRECHECK_BEHAVIOR = eINSTANCE.getPrecheckBehavior();

		/**
		 * The meta object literal for the '{@link org.hl7.knowledgeartifact.r1.impl.PublishersTypeImpl <em>Publishers Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.knowledgeartifact.r1.impl.PublishersTypeImpl
		 * @see org.hl7.knowledgeartifact.r1.impl.R1PackageImpl#getPublishersType()
		 * @generated
		 */
		EClass PUBLISHERS_TYPE = eINSTANCE.getPublishersType();

		/**
		 * The meta object literal for the '<em><b>Publisher</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PUBLISHERS_TYPE__PUBLISHER = eINSTANCE.getPublishersType_Publisher();

		/**
		 * The meta object literal for the '{@link org.hl7.knowledgeartifact.r1.impl.RangeConstraintImpl <em>Range Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.knowledgeartifact.r1.impl.RangeConstraintImpl
		 * @see org.hl7.knowledgeartifact.r1.impl.R1PackageImpl#getRangeConstraint()
		 * @generated
		 */
		EClass RANGE_CONSTRAINT = eINSTANCE.getRangeConstraint();

		/**
		 * The meta object literal for the '<em><b>Constraint Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RANGE_CONSTRAINT__CONSTRAINT_TYPE = eINSTANCE.getRangeConstraint_ConstraintType();

		/**
		 * The meta object literal for the '{@link org.hl7.knowledgeartifact.r1.impl.ReadOnlyBehaviorImpl <em>Read Only Behavior</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.knowledgeartifact.r1.impl.ReadOnlyBehaviorImpl
		 * @see org.hl7.knowledgeartifact.r1.impl.R1PackageImpl#getReadOnlyBehavior()
		 * @generated
		 */
		EClass READ_ONLY_BEHAVIOR = eINSTANCE.getReadOnlyBehavior();

		/**
		 * The meta object literal for the '{@link org.hl7.knowledgeartifact.r1.impl.ReferencedModelTypeImpl <em>Referenced Model Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.knowledgeartifact.r1.impl.ReferencedModelTypeImpl
		 * @see org.hl7.knowledgeartifact.r1.impl.R1PackageImpl#getReferencedModelType()
		 * @generated
		 */
		EClass REFERENCED_MODEL_TYPE = eINSTANCE.getReferencedModelType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFERENCED_MODEL_TYPE__VALUE = eINSTANCE.getReferencedModelType_Value();

		/**
		 * The meta object literal for the '{@link org.hl7.knowledgeartifact.r1.impl.RelatedResourcesTypeImpl <em>Related Resources Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.knowledgeartifact.r1.impl.RelatedResourcesTypeImpl
		 * @see org.hl7.knowledgeartifact.r1.impl.R1PackageImpl#getRelatedResourcesType()
		 * @generated
		 */
		EClass RELATED_RESOURCES_TYPE = eINSTANCE.getRelatedResourcesType();

		/**
		 * The meta object literal for the '<em><b>Related Resource</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATED_RESOURCES_TYPE__RELATED_RESOURCE = eINSTANCE.getRelatedResourcesType_RelatedResource();

		/**
		 * The meta object literal for the '{@link org.hl7.knowledgeartifact.r1.impl.RelationshipTypeImpl <em>Relationship Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.knowledgeartifact.r1.impl.RelationshipTypeImpl
		 * @see org.hl7.knowledgeartifact.r1.impl.R1PackageImpl#getRelationshipType()
		 * @generated
		 */
		EClass RELATIONSHIP_TYPE = eINSTANCE.getRelationshipType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIONSHIP_TYPE__VALUE = eINSTANCE.getRelationshipType_Value();

		/**
		 * The meta object literal for the '{@link org.hl7.knowledgeartifact.r1.impl.RemoveActionImpl <em>Remove Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.knowledgeartifact.r1.impl.RemoveActionImpl
		 * @see org.hl7.knowledgeartifact.r1.impl.R1PackageImpl#getRemoveAction()
		 * @generated
		 */
		EClass REMOVE_ACTION = eINSTANCE.getRemoveAction();

		/**
		 * The meta object literal for the '<em><b>Action Sentence</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REMOVE_ACTION__ACTION_SENTENCE = eINSTANCE.getRemoveAction_ActionSentence();

		/**
		 * The meta object literal for the '{@link org.hl7.knowledgeartifact.r1.impl.RepresentedConceptsTypeImpl <em>Represented Concepts Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.knowledgeartifact.r1.impl.RepresentedConceptsTypeImpl
		 * @see org.hl7.knowledgeartifact.r1.impl.R1PackageImpl#getRepresentedConceptsType()
		 * @generated
		 */
		EClass REPRESENTED_CONCEPTS_TYPE = eINSTANCE.getRepresentedConceptsType();

		/**
		 * The meta object literal for the '<em><b>Concept</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPRESENTED_CONCEPTS_TYPE__CONCEPT = eINSTANCE.getRepresentedConceptsType_Concept();

		/**
		 * The meta object literal for the '{@link org.hl7.knowledgeartifact.r1.impl.RequiredBehaviorImpl <em>Required Behavior</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.knowledgeartifact.r1.impl.RequiredBehaviorImpl
		 * @see org.hl7.knowledgeartifact.r1.impl.R1PackageImpl#getRequiredBehavior()
		 * @generated
		 */
		EClass REQUIRED_BEHAVIOR = eINSTANCE.getRequiredBehavior();

		/**
		 * The meta object literal for the '{@link org.hl7.knowledgeartifact.r1.impl.ResourceRelationshipReferenceImpl <em>Resource Relationship Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.knowledgeartifact.r1.impl.ResourceRelationshipReferenceImpl
		 * @see org.hl7.knowledgeartifact.r1.impl.R1PackageImpl#getResourceRelationshipReference()
		 * @generated
		 */
		EClass RESOURCE_RELATIONSHIP_REFERENCE = eINSTANCE.getResourceRelationshipReference();

		/**
		 * The meta object literal for the '<em><b>Relationship</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_RELATIONSHIP_REFERENCE__RELATIONSHIP = eINSTANCE.getResourceRelationshipReference_Relationship();

		/**
		 * The meta object literal for the '<em><b>Resources</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_RELATIONSHIP_REFERENCE__RESOURCES = eINSTANCE.getResourceRelationshipReference_Resources();

		/**
		 * The meta object literal for the '{@link org.hl7.knowledgeartifact.r1.impl.ResourcesTypeImpl <em>Resources Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.knowledgeartifact.r1.impl.ResourcesTypeImpl
		 * @see org.hl7.knowledgeartifact.r1.impl.R1PackageImpl#getResourcesType()
		 * @generated
		 */
		EClass RESOURCES_TYPE = eINSTANCE.getResourcesType();

		/**
		 * The meta object literal for the '<em><b>Resource</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCES_TYPE__RESOURCE = eINSTANCE.getResourcesType_Resource();

		/**
		 * The meta object literal for the '{@link org.hl7.knowledgeartifact.r1.impl.ResponseBindingImpl <em>Response Binding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.knowledgeartifact.r1.impl.ResponseBindingImpl
		 * @see org.hl7.knowledgeartifact.r1.impl.R1PackageImpl#getResponseBinding()
		 * @generated
		 */
		EClass RESPONSE_BINDING = eINSTANCE.getResponseBinding();

		/**
		 * The meta object literal for the '<em><b>Container</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESPONSE_BINDING__CONTAINER = eINSTANCE.getResponseBinding_Container();

		/**
		 * The meta object literal for the '<em><b>Property</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESPONSE_BINDING__PROPERTY = eINSTANCE.getResponseBinding_Property();

		/**
		 * The meta object literal for the '{@link org.hl7.knowledgeartifact.r1.impl.ResponseCardinalityTypeImpl <em>Response Cardinality Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.knowledgeartifact.r1.impl.ResponseCardinalityTypeImpl
		 * @see org.hl7.knowledgeartifact.r1.impl.R1PackageImpl#getResponseCardinalityType()
		 * @generated
		 */
		EClass RESPONSE_CARDINALITY_TYPE = eINSTANCE.getResponseCardinalityType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESPONSE_CARDINALITY_TYPE__VALUE = eINSTANCE.getResponseCardinalityType_Value();

		/**
		 * The meta object literal for the '{@link org.hl7.knowledgeartifact.r1.impl.ResponseDataTypeTypeImpl <em>Response Data Type Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.knowledgeartifact.r1.impl.ResponseDataTypeTypeImpl
		 * @see org.hl7.knowledgeartifact.r1.impl.R1PackageImpl#getResponseDataTypeType()
		 * @generated
		 */
		EClass RESPONSE_DATA_TYPE_TYPE = eINSTANCE.getResponseDataTypeType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESPONSE_DATA_TYPE_TYPE__VALUE = eINSTANCE.getResponseDataTypeType_Value();

		/**
		 * The meta object literal for the '{@link org.hl7.knowledgeartifact.r1.impl.RightsDeclarationImpl <em>Rights Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.knowledgeartifact.r1.impl.RightsDeclarationImpl
		 * @see org.hl7.knowledgeartifact.r1.impl.R1PackageImpl#getRightsDeclaration()
		 * @generated
		 */
		EClass RIGHTS_DECLARATION = eINSTANCE.getRightsDeclaration();

		/**
		 * The meta object literal for the '<em><b>Asserted Rights</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RIGHTS_DECLARATION__ASSERTED_RIGHTS = eINSTANCE.getRightsDeclaration_AssertedRights();

		/**
		 * The meta object literal for the '<em><b>Rights Holder</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RIGHTS_DECLARATION__RIGHTS_HOLDER = eINSTANCE.getRightsDeclaration_RightsHolder();

		/**
		 * The meta object literal for the '<em><b>Permissions</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RIGHTS_DECLARATION__PERMISSIONS = eINSTANCE.getRightsDeclaration_Permissions();

		/**
		 * The meta object literal for the '{@link org.hl7.knowledgeartifact.r1.impl.RoleTypeImpl <em>Role Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.knowledgeartifact.r1.impl.RoleTypeImpl
		 * @see org.hl7.knowledgeartifact.r1.impl.R1PackageImpl#getRoleType()
		 * @generated
		 */
		EClass ROLE_TYPE = eINSTANCE.getRoleType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROLE_TYPE__VALUE = eINSTANCE.getRoleType_Value();

		/**
		 * The meta object literal for the '{@link org.hl7.knowledgeartifact.r1.impl.StatusTypeImpl <em>Status Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.knowledgeartifact.r1.impl.StatusTypeImpl
		 * @see org.hl7.knowledgeartifact.r1.impl.R1PackageImpl#getStatusType()
		 * @generated
		 */
		EClass STATUS_TYPE = eINSTANCE.getStatusType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATUS_TYPE__VALUE = eINSTANCE.getStatusType_Value();

		/**
		 * The meta object literal for the '{@link org.hl7.knowledgeartifact.r1.impl.SubElementsTypeImpl <em>Sub Elements Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.knowledgeartifact.r1.impl.SubElementsTypeImpl
		 * @see org.hl7.knowledgeartifact.r1.impl.R1PackageImpl#getSubElementsType()
		 * @generated
		 */
		EClass SUB_ELEMENTS_TYPE = eINSTANCE.getSubElementsType();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUB_ELEMENTS_TYPE__GROUP = eINSTANCE.getSubElementsType_Group();

		/**
		 * The meta object literal for the '<em><b>Simple Action</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUB_ELEMENTS_TYPE__SIMPLE_ACTION = eINSTANCE.getSubElementsType_SimpleAction();

		/**
		 * The meta object literal for the '<em><b>Action Group</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUB_ELEMENTS_TYPE__ACTION_GROUP = eINSTANCE.getSubElementsType_ActionGroup();

		/**
		 * The meta object literal for the '<em><b>Action Ref</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUB_ELEMENTS_TYPE__ACTION_REF = eINSTANCE.getSubElementsType_ActionRef();

		/**
		 * The meta object literal for the '{@link org.hl7.knowledgeartifact.r1.impl.SupportingEvidenceImpl <em>Supporting Evidence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.knowledgeartifact.r1.impl.SupportingEvidenceImpl
		 * @see org.hl7.knowledgeartifact.r1.impl.R1PackageImpl#getSupportingEvidence()
		 * @generated
		 */
		EClass SUPPORTING_EVIDENCE = eINSTANCE.getSupportingEvidence();

		/**
		 * The meta object literal for the '<em><b>Evidence</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUPPORTING_EVIDENCE__EVIDENCE = eINSTANCE.getSupportingEvidence_Evidence();

		/**
		 * The meta object literal for the '{@link org.hl7.knowledgeartifact.r1.impl.SupportingResourceImpl <em>Supporting Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.knowledgeartifact.r1.impl.SupportingResourceImpl
		 * @see org.hl7.knowledgeartifact.r1.impl.R1PackageImpl#getSupportingResource()
		 * @generated
		 */
		EClass SUPPORTING_RESOURCE = eINSTANCE.getSupportingResource();

		/**
		 * The meta object literal for the '<em><b>Resource</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUPPORTING_RESOURCE__RESOURCE = eINSTANCE.getSupportingResource_Resource();

		/**
		 * The meta object literal for the '{@link org.hl7.knowledgeartifact.r1.impl.TemplateIdsTypeImpl <em>Template Ids Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.knowledgeartifact.r1.impl.TemplateIdsTypeImpl
		 * @see org.hl7.knowledgeartifact.r1.impl.R1PackageImpl#getTemplateIdsType()
		 * @generated
		 */
		EClass TEMPLATE_IDS_TYPE = eINSTANCE.getTemplateIdsType();

		/**
		 * The meta object literal for the '<em><b>Template Id</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEMPLATE_IDS_TYPE__TEMPLATE_ID = eINSTANCE.getTemplateIdsType_TemplateId();

		/**
		 * The meta object literal for the '{@link org.hl7.knowledgeartifact.r1.impl.TemplateIdsType1Impl <em>Template Ids Type1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.knowledgeartifact.r1.impl.TemplateIdsType1Impl
		 * @see org.hl7.knowledgeartifact.r1.impl.R1PackageImpl#getTemplateIdsType1()
		 * @generated
		 */
		EClass TEMPLATE_IDS_TYPE1 = eINSTANCE.getTemplateIdsType1();

		/**
		 * The meta object literal for the '<em><b>Template Id</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEMPLATE_IDS_TYPE1__TEMPLATE_ID = eINSTANCE.getTemplateIdsType1_TemplateId();

		/**
		 * The meta object literal for the '{@link org.hl7.knowledgeartifact.r1.impl.TriggerImpl <em>Trigger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.knowledgeartifact.r1.impl.TriggerImpl
		 * @see org.hl7.knowledgeartifact.r1.impl.R1PackageImpl#getTrigger()
		 * @generated
		 */
		EClass TRIGGER = eINSTANCE.getTrigger();

		/**
		 * The meta object literal for the '<em><b>Def</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRIGGER__DEF = eINSTANCE.getTrigger_Def();

		/**
		 * The meta object literal for the '<em><b>Identifiers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRIGGER__IDENTIFIERS = eINSTANCE.getTrigger_Identifiers();

		/**
		 * The meta object literal for the '<em><b>Text Equivalent</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRIGGER__TEXT_EQUIVALENT = eINSTANCE.getTrigger_TextEquivalent();

		/**
		 * The meta object literal for the '{@link org.hl7.knowledgeartifact.r1.impl.TriggersImpl <em>Triggers</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.knowledgeartifact.r1.impl.TriggersImpl
		 * @see org.hl7.knowledgeartifact.r1.impl.R1PackageImpl#getTriggers()
		 * @generated
		 */
		EClass TRIGGERS = eINSTANCE.getTriggers();

		/**
		 * The meta object literal for the '<em><b>Trigger</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRIGGERS__TRIGGER = eINSTANCE.getTriggers_Trigger();

		/**
		 * The meta object literal for the '{@link org.hl7.knowledgeartifact.r1.impl.UpdateActionImpl <em>Update Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.knowledgeartifact.r1.impl.UpdateActionImpl
		 * @see org.hl7.knowledgeartifact.r1.impl.R1PackageImpl#getUpdateAction()
		 * @generated
		 */
		EClass UPDATE_ACTION = eINSTANCE.getUpdateAction();

		/**
		 * The meta object literal for the '<em><b>Action Sentence</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UPDATE_ACTION__ACTION_SENTENCE = eINSTANCE.getUpdateAction_ActionSentence();

		/**
		 * The meta object literal for the '{@link org.hl7.knowledgeartifact.r1.impl.UsageTermsTypeImpl <em>Usage Terms Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.knowledgeartifact.r1.impl.UsageTermsTypeImpl
		 * @see org.hl7.knowledgeartifact.r1.impl.R1PackageImpl#getUsageTermsType()
		 * @generated
		 */
		EClass USAGE_TERMS_TYPE = eINSTANCE.getUsageTermsType();

		/**
		 * The meta object literal for the '<em><b>Rights Declaration</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USAGE_TERMS_TYPE__RIGHTS_DECLARATION = eINSTANCE.getUsageTermsType_RightsDeclaration();

		/**
		 * The meta object literal for the '{@link org.hl7.knowledgeartifact.r1.impl.ValueSetConstraintImpl <em>Value Set Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.knowledgeartifact.r1.impl.ValueSetConstraintImpl
		 * @see org.hl7.knowledgeartifact.r1.impl.R1PackageImpl#getValueSetConstraint()
		 * @generated
		 */
		EClass VALUE_SET_CONSTRAINT = eINSTANCE.getValueSetConstraint();

		/**
		 * The meta object literal for the '<em><b>Value Set</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUE_SET_CONSTRAINT__VALUE_SET = eINSTANCE.getValueSetConstraint_ValueSet();

		/**
		 * The meta object literal for the '{@link org.hl7.knowledgeartifact.r1.impl.VersionedIdentifierImpl <em>Versioned Identifier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.knowledgeartifact.r1.impl.VersionedIdentifierImpl
		 * @see org.hl7.knowledgeartifact.r1.impl.R1PackageImpl#getVersionedIdentifier()
		 * @generated
		 */
		EClass VERSIONED_IDENTIFIER = eINSTANCE.getVersionedIdentifier();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERSIONED_IDENTIFIER__VERSION = eINSTANCE.getVersionedIdentifier_Version();

		/**
		 * The meta object literal for the '{@link org.hl7.knowledgeartifact.r1.impl.VisualStyleBehaviorImpl <em>Visual Style Behavior</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.knowledgeartifact.r1.impl.VisualStyleBehaviorImpl
		 * @see org.hl7.knowledgeartifact.r1.impl.R1PackageImpl#getVisualStyleBehavior()
		 * @generated
		 */
		EClass VISUAL_STYLE_BEHAVIOR = eINSTANCE.getVisualStyleBehavior();

		/**
		 * The meta object literal for the '{@link org.hl7.knowledgeartifact.r1.ArtifactLifeCycleEventType <em>Artifact Life Cycle Event Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.knowledgeartifact.r1.ArtifactLifeCycleEventType
		 * @see org.hl7.knowledgeartifact.r1.impl.R1PackageImpl#getArtifactLifeCycleEventType()
		 * @generated
		 */
		EEnum ARTIFACT_LIFE_CYCLE_EVENT_TYPE = eINSTANCE.getArtifactLifeCycleEventType();

		/**
		 * The meta object literal for the '{@link org.hl7.knowledgeartifact.r1.ArtifactStatusType <em>Artifact Status Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.knowledgeartifact.r1.ArtifactStatusType
		 * @see org.hl7.knowledgeartifact.r1.impl.R1PackageImpl#getArtifactStatusType()
		 * @generated
		 */
		EEnum ARTIFACT_STATUS_TYPE = eINSTANCE.getArtifactStatusType();

		/**
		 * The meta object literal for the '{@link org.hl7.knowledgeartifact.r1.ArtifactType <em>Artifact Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.knowledgeartifact.r1.ArtifactType
		 * @see org.hl7.knowledgeartifact.r1.impl.R1PackageImpl#getArtifactType()
		 * @generated
		 */
		EEnum ARTIFACT_TYPE = eINSTANCE.getArtifactType();

		/**
		 * The meta object literal for the '{@link org.hl7.knowledgeartifact.r1.Cardinality <em>Cardinality</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.knowledgeartifact.r1.Cardinality
		 * @see org.hl7.knowledgeartifact.r1.impl.R1PackageImpl#getCardinality()
		 * @generated
		 */
		EEnum CARDINALITY = eINSTANCE.getCardinality();

		/**
		 * The meta object literal for the '{@link org.hl7.knowledgeartifact.r1.CardinalityBehaviorType <em>Cardinality Behavior Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.knowledgeartifact.r1.CardinalityBehaviorType
		 * @see org.hl7.knowledgeartifact.r1.impl.R1PackageImpl#getCardinalityBehaviorType()
		 * @generated
		 */
		EEnum CARDINALITY_BEHAVIOR_TYPE = eINSTANCE.getCardinalityBehaviorType();

		/**
		 * The meta object literal for the '{@link org.hl7.knowledgeartifact.r1.CompondArtifactType <em>Compond Artifact Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.knowledgeartifact.r1.CompondArtifactType
		 * @see org.hl7.knowledgeartifact.r1.impl.R1PackageImpl#getCompondArtifactType()
		 * @generated
		 */
		EEnum COMPOND_ARTIFACT_TYPE = eINSTANCE.getCompondArtifactType();

		/**
		 * The meta object literal for the '{@link org.hl7.knowledgeartifact.r1.ConditionRoleType <em>Condition Role Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.knowledgeartifact.r1.ConditionRoleType
		 * @see org.hl7.knowledgeartifact.r1.impl.R1PackageImpl#getConditionRoleType()
		 * @generated
		 */
		EEnum CONDITION_ROLE_TYPE = eINSTANCE.getConditionRoleType();

		/**
		 * The meta object literal for the '{@link org.hl7.knowledgeartifact.r1.ContributorType <em>Contributor Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.knowledgeartifact.r1.ContributorType
		 * @see org.hl7.knowledgeartifact.r1.impl.R1PackageImpl#getContributorType()
		 * @generated
		 */
		EEnum CONTRIBUTOR_TYPE = eINSTANCE.getContributorType();

		/**
		 * The meta object literal for the '{@link org.hl7.knowledgeartifact.r1.CoverageType <em>Coverage Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.knowledgeartifact.r1.CoverageType
		 * @see org.hl7.knowledgeartifact.r1.impl.R1PackageImpl#getCoverageType()
		 * @generated
		 */
		EEnum COVERAGE_TYPE = eINSTANCE.getCoverageType();

		/**
		 * The meta object literal for the '{@link org.hl7.knowledgeartifact.r1.DataEventType <em>Data Event Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.knowledgeartifact.r1.DataEventType
		 * @see org.hl7.knowledgeartifact.r1.impl.R1PackageImpl#getDataEventType()
		 * @generated
		 */
		EEnum DATA_EVENT_TYPE = eINSTANCE.getDataEventType();

		/**
		 * The meta object literal for the '{@link org.hl7.knowledgeartifact.r1.EventType <em>Event Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.knowledgeartifact.r1.EventType
		 * @see org.hl7.knowledgeartifact.r1.impl.R1PackageImpl#getEventType()
		 * @generated
		 */
		EEnum EVENT_TYPE = eINSTANCE.getEventType();

		/**
		 * The meta object literal for the '{@link org.hl7.knowledgeartifact.r1.GroupOrganizationBehaviorType <em>Group Organization Behavior Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.knowledgeartifact.r1.GroupOrganizationBehaviorType
		 * @see org.hl7.knowledgeartifact.r1.impl.R1PackageImpl#getGroupOrganizationBehaviorType()
		 * @generated
		 */
		EEnum GROUP_ORGANIZATION_BEHAVIOR_TYPE = eINSTANCE.getGroupOrganizationBehaviorType();

		/**
		 * The meta object literal for the '{@link org.hl7.knowledgeartifact.r1.GroupSelectionBehaviorType <em>Group Selection Behavior Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.knowledgeartifact.r1.GroupSelectionBehaviorType
		 * @see org.hl7.knowledgeartifact.r1.impl.R1PackageImpl#getGroupSelectionBehaviorType()
		 * @generated
		 */
		EEnum GROUP_SELECTION_BEHAVIOR_TYPE = eINSTANCE.getGroupSelectionBehaviorType();

		/**
		 * The meta object literal for the '{@link org.hl7.knowledgeartifact.r1.PrecheckBehaviorType <em>Precheck Behavior Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.knowledgeartifact.r1.PrecheckBehaviorType
		 * @see org.hl7.knowledgeartifact.r1.impl.R1PackageImpl#getPrecheckBehaviorType()
		 * @generated
		 */
		EEnum PRECHECK_BEHAVIOR_TYPE = eINSTANCE.getPrecheckBehaviorType();

		/**
		 * The meta object literal for the '{@link org.hl7.knowledgeartifact.r1.RangeConstraintType <em>Range Constraint Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.knowledgeartifact.r1.RangeConstraintType
		 * @see org.hl7.knowledgeartifact.r1.impl.R1PackageImpl#getRangeConstraintType()
		 * @generated
		 */
		EEnum RANGE_CONSTRAINT_TYPE = eINSTANCE.getRangeConstraintType();

		/**
		 * The meta object literal for the '{@link org.hl7.knowledgeartifact.r1.RequiredBehaviorType <em>Required Behavior Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.knowledgeartifact.r1.RequiredBehaviorType
		 * @see org.hl7.knowledgeartifact.r1.impl.R1PackageImpl#getRequiredBehaviorType()
		 * @generated
		 */
		EEnum REQUIRED_BEHAVIOR_TYPE = eINSTANCE.getRequiredBehaviorType();

		/**
		 * The meta object literal for the '{@link org.hl7.knowledgeartifact.r1.ResourceRelationshipType <em>Resource Relationship Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.knowledgeartifact.r1.ResourceRelationshipType
		 * @see org.hl7.knowledgeartifact.r1.impl.R1PackageImpl#getResourceRelationshipType()
		 * @generated
		 */
		EEnum RESOURCE_RELATIONSHIP_TYPE = eINSTANCE.getResourceRelationshipType();

		/**
		 * The meta object literal for the '{@link org.hl7.knowledgeartifact.r1.ValueType <em>Value Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.knowledgeartifact.r1.ValueType
		 * @see org.hl7.knowledgeartifact.r1.impl.R1PackageImpl#getValueType()
		 * @generated
		 */
		EEnum VALUE_TYPE = eINSTANCE.getValueType();

		/**
		 * The meta object literal for the '<em>Artifact Life Cycle Event Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.knowledgeartifact.r1.ArtifactLifeCycleEventType
		 * @see org.hl7.knowledgeartifact.r1.impl.R1PackageImpl#getArtifactLifeCycleEventTypeObject()
		 * @generated
		 */
		EDataType ARTIFACT_LIFE_CYCLE_EVENT_TYPE_OBJECT = eINSTANCE.getArtifactLifeCycleEventTypeObject();

		/**
		 * The meta object literal for the '<em>Artifact Status Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.knowledgeartifact.r1.ArtifactStatusType
		 * @see org.hl7.knowledgeartifact.r1.impl.R1PackageImpl#getArtifactStatusTypeObject()
		 * @generated
		 */
		EDataType ARTIFACT_STATUS_TYPE_OBJECT = eINSTANCE.getArtifactStatusTypeObject();

		/**
		 * The meta object literal for the '<em>Artifact Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.knowledgeartifact.r1.ArtifactType
		 * @see org.hl7.knowledgeartifact.r1.impl.R1PackageImpl#getArtifactTypeObject()
		 * @generated
		 */
		EDataType ARTIFACT_TYPE_OBJECT = eINSTANCE.getArtifactTypeObject();

		/**
		 * The meta object literal for the '<em>Cardinality Behavior Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.knowledgeartifact.r1.CardinalityBehaviorType
		 * @see org.hl7.knowledgeartifact.r1.impl.R1PackageImpl#getCardinalityBehaviorTypeObject()
		 * @generated
		 */
		EDataType CARDINALITY_BEHAVIOR_TYPE_OBJECT = eINSTANCE.getCardinalityBehaviorTypeObject();

		/**
		 * The meta object literal for the '<em>Cardinality Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.knowledgeartifact.r1.Cardinality
		 * @see org.hl7.knowledgeartifact.r1.impl.R1PackageImpl#getCardinalityObject()
		 * @generated
		 */
		EDataType CARDINALITY_OBJECT = eINSTANCE.getCardinalityObject();

		/**
		 * The meta object literal for the '<em>Compond Artifact Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.knowledgeartifact.r1.CompondArtifactType
		 * @see org.hl7.knowledgeartifact.r1.impl.R1PackageImpl#getCompondArtifactTypeObject()
		 * @generated
		 */
		EDataType COMPOND_ARTIFACT_TYPE_OBJECT = eINSTANCE.getCompondArtifactTypeObject();

		/**
		 * The meta object literal for the '<em>Condition Role Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.knowledgeartifact.r1.ConditionRoleType
		 * @see org.hl7.knowledgeartifact.r1.impl.R1PackageImpl#getConditionRoleTypeObject()
		 * @generated
		 */
		EDataType CONDITION_ROLE_TYPE_OBJECT = eINSTANCE.getConditionRoleTypeObject();

		/**
		 * The meta object literal for the '<em>Contributor Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.knowledgeartifact.r1.ContributorType
		 * @see org.hl7.knowledgeartifact.r1.impl.R1PackageImpl#getContributorTypeObject()
		 * @generated
		 */
		EDataType CONTRIBUTOR_TYPE_OBJECT = eINSTANCE.getContributorTypeObject();

		/**
		 * The meta object literal for the '<em>Coverage Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.knowledgeartifact.r1.CoverageType
		 * @see org.hl7.knowledgeartifact.r1.impl.R1PackageImpl#getCoverageTypeObject()
		 * @generated
		 */
		EDataType COVERAGE_TYPE_OBJECT = eINSTANCE.getCoverageTypeObject();

		/**
		 * The meta object literal for the '<em>Data Event Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.knowledgeartifact.r1.DataEventType
		 * @see org.hl7.knowledgeartifact.r1.impl.R1PackageImpl#getDataEventTypeObject()
		 * @generated
		 */
		EDataType DATA_EVENT_TYPE_OBJECT = eINSTANCE.getDataEventTypeObject();

		/**
		 * The meta object literal for the '<em>Event Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.knowledgeartifact.r1.EventType
		 * @see org.hl7.knowledgeartifact.r1.impl.R1PackageImpl#getEventTypeObject()
		 * @generated
		 */
		EDataType EVENT_TYPE_OBJECT = eINSTANCE.getEventTypeObject();

		/**
		 * The meta object literal for the '<em>Group Organization Behavior Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.knowledgeartifact.r1.GroupOrganizationBehaviorType
		 * @see org.hl7.knowledgeartifact.r1.impl.R1PackageImpl#getGroupOrganizationBehaviorTypeObject()
		 * @generated
		 */
		EDataType GROUP_ORGANIZATION_BEHAVIOR_TYPE_OBJECT = eINSTANCE.getGroupOrganizationBehaviorTypeObject();

		/**
		 * The meta object literal for the '<em>Group Selection Behavior Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.knowledgeartifact.r1.GroupSelectionBehaviorType
		 * @see org.hl7.knowledgeartifact.r1.impl.R1PackageImpl#getGroupSelectionBehaviorTypeObject()
		 * @generated
		 */
		EDataType GROUP_SELECTION_BEHAVIOR_TYPE_OBJECT = eINSTANCE.getGroupSelectionBehaviorTypeObject();

		/**
		 * The meta object literal for the '<em>Precheck Behavior Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.knowledgeartifact.r1.PrecheckBehaviorType
		 * @see org.hl7.knowledgeartifact.r1.impl.R1PackageImpl#getPrecheckBehaviorTypeObject()
		 * @generated
		 */
		EDataType PRECHECK_BEHAVIOR_TYPE_OBJECT = eINSTANCE.getPrecheckBehaviorTypeObject();

		/**
		 * The meta object literal for the '<em>Range Constraint Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.knowledgeartifact.r1.RangeConstraintType
		 * @see org.hl7.knowledgeartifact.r1.impl.R1PackageImpl#getRangeConstraintTypeObject()
		 * @generated
		 */
		EDataType RANGE_CONSTRAINT_TYPE_OBJECT = eINSTANCE.getRangeConstraintTypeObject();

		/**
		 * The meta object literal for the '<em>Required Behavior Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.knowledgeartifact.r1.RequiredBehaviorType
		 * @see org.hl7.knowledgeartifact.r1.impl.R1PackageImpl#getRequiredBehaviorTypeObject()
		 * @generated
		 */
		EDataType REQUIRED_BEHAVIOR_TYPE_OBJECT = eINSTANCE.getRequiredBehaviorTypeObject();

		/**
		 * The meta object literal for the '<em>Resource Relationship Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.knowledgeartifact.r1.ResourceRelationshipType
		 * @see org.hl7.knowledgeartifact.r1.impl.R1PackageImpl#getResourceRelationshipTypeObject()
		 * @generated
		 */
		EDataType RESOURCE_RELATIONSHIP_TYPE_OBJECT = eINSTANCE.getResourceRelationshipTypeObject();

		/**
		 * The meta object literal for the '<em>Value Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.knowledgeartifact.r1.ValueType
		 * @see org.hl7.knowledgeartifact.r1.impl.R1PackageImpl#getValueTypeObject()
		 * @generated
		 */
		EDataType VALUE_TYPE_OBJECT = eINSTANCE.getValueTypeObject();

	}

} //R1Package
