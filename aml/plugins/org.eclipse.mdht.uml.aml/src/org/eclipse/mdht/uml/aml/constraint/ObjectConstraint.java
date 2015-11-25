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
package org.eclipse.mdht.uml.aml.constraint;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.mdht.uml.aml.terminology.IdentifiedItem;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.aml.constraint.ObjectConstraint#isIs_deprecated <em>Is deprecated</em>}</li>
 * </ul>
 *
 * @see org.eclipse.mdht.uml.aml.constraint.ConstraintPackage#getObjectConstraint()
 * @model
 * @generated
 */
public interface ObjectConstraint extends IdentifiedItem {
	/**
	 * Returns the value of the '<em><b>Is deprecated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is deprecated</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is deprecated</em>' attribute.
	 * @see #setIs_deprecated(boolean)
	 * @see org.eclipse.mdht.uml.aml.constraint.ConstraintPackage#getObjectConstraint_Is_deprecated()
	 * @model dataType="org.eclipse.uml2.types.Boolean" ordered="false"
	 * @generated
	 */
	boolean isIs_deprecated();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.aml.constraint.ObjectConstraint#isIs_deprecated <em>Is deprecated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is deprecated</em>' attribute.
	 * @see #isIs_deprecated()
	 * @generated
	 */
	void setIs_deprecated(boolean value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.base_NamedElement.oclIsKindOf(Classifier) implies(
	 *     self.base_NamedElement.oclAsType(Classifier).generalization->forAll(x|x.stereotypedBy('Constrains'))
	 *     and 
	 *     (self.base_NamedElement.oclAsType(Classifier).generalization->size() = 1)
	 *  )
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateRedefinesGeneralization(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * All Reference Model types are explicitly inherited and/or referenced as types from an archetype structure.  
	 * Thus the UML model will always use types defined in the underlying Reference Model information model.  
	 * 
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='[AOM] VCORM- object constraint type name existence'"
	 * @generated
	 */
	boolean validateAOMVCORMobjectconstrainttypenameexistence(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This [AOM] validation rule is enforced by UML type conformance constraints associated with subsetted and/or redefined Properties.
	 * 
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='[AOM] VCORMT - object constraint type validity'"
	 * @generated
	 */
	boolean validateAOMVCORMTobjectconstrainttypevalidity(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This [AOM] rule is definitional; subtypes of Object Constraint define content and semantics.
	 * 
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='[AOM] VCOCD- object constraint definition validity'"
	 * @generated
	 */
	boolean validateAOMVCOCDobjectconstraintdefinitionvalidity(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An object constraint may have an id (which maps to [AOM] node_id) specified as a tag.  
	 * If not specified, than an implicit node_id is based on the object constraint name.  
	 * In case of constraints on primitive types, the derived node_id may have an implied value starting with 'id9999'.
	 * As a consequence of the UML defaults described, there will be a node identifier associated with every object constraint node.
	 * 
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='[AOM] VCOID- object node identifier validity'"
	 * @generated
	 */
	boolean validateAOMVCOIDobjectnodeidentifiervalidity(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Object node identifiers are the names of Archetype Term EnumerationLiterals within the Definition Identifier and their uniqueness is enforced by UML name constraints.
	 * 
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='[AOM] VCOSU- object node identifier validity'"
	 * @generated
	 */
	boolean validateAOMVCOSUobjectnodeidentifiervalidity(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (
	 * 	(self.base_NamedElement.stereotypedBy('ComplexObjectConstraint') and not self.base_NamedElement.oclAsType(Classifier).general->forAll(g|g.getNearestReferenceModel().oclIsUndefined()))
	 * 	implies
	 * 	self.base_NamedElement.oclAsType(Classifier).general->forAll(g|g.stereotypedBy('ComplexObjectConstraint'))
	 * )     
	 * and
	 * (
	 * 	(self.base_NamedElement.stereotypedBy('ArchetypeRoot') and not self.base_NamedElement.oclAsType(Classifier).general->forAll(g|g.getNearestReferenceModel().oclIsUndefined()))
	 * 	implies
	 * 	self.base_NamedElement.oclAsType(Classifier).general->forAll(g|g.stereotypedBy('ArchetypeRoot') or g.stereotypedBy('ArchetypeSlot'))
	 * )    
	 * and 
	 * (
	 * 	(self.base_NamedElement.stereotypedBy('ArchetypeSlot') and not self.base_NamedElement.oclAsType(Classifier).general->forAll(g|g.getNearestReferenceModel().oclIsUndefined()))
	 * 	implies
	 * 	self.base_NamedElement.oclAsType(Classifier).general->forAll(g|g.stereotypedBy('ArchetypeSlot'))
	 * )     
	 * 
	 * 
	 * 
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='[AOM] VSONT- specialised archetype object node meta-type conformance'"
	 * @generated
	 */
	boolean validateAOMVSONTspecialisedarchetypeobjectnodemetatypeconformance(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This [AOM] validation rule is enforced by UML inheritance from the specialized archetype, which itself inherits directly or indirectly from a Reference Model.
	 * 
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='[AOM] VSONCT- specialised archetype object node reference type conformance'"
	 * @generated
	 */
	boolean validateAOMVSONCTspecialisedarchetypeobjectnodereferencetypeconformance(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  If an object constraint node in a specialized archetype is a new node with respect to the flat parent, and it carries a node identifier, the identifier must be a ‘new’ node identifier, specialized at the level of the child archetype.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='[AOM] VSONIN- specialised archetype new object node identifier validity'"
	 * @generated
	 */
	boolean validateAOMVSONINspecialisedarchetypenewobjectnodeidentifiervalidity(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The [AOM] validation rule is enforced by UML multiplicity constraints for subsetted and/or redefined Properties.
	 * 
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='[AOM] VSONCO- specialised archetype redefine object node occurrences validity'"
	 * @generated
	 */
	boolean validateAOMVSONCOspecialisedarchetyperedefineobjectnodeoccurrencesvalidity(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (
	 * 	self.namespace->select(n|n.stereotypedBy('ComplexObjectConstraint') ).oclAsType(Classifier).general->forAll(g|g.stereotypedBy('ComplexObjectConstraint'))
	 * 	and (self.upper=0)
	 * )
	 * implies(
	 * self.redefinedProperty.type->forAll(t|t=self.type)
	 * and self.subsettedProperty.type->forAll(t|t=self.type)
	 * )
	 * 
	 * 
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='[AOM] VSONPT- specialised archetype prohibited object node [AOM] type validity'"
	 * @generated
	 */
	boolean validateAOMVSONPTspecialisedarchetypeprohibitedobjectnodeAOMtypevalidity(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.namespace->select(n|n.stereotypedBy('ComplexObjectConstraint') ).oclAsType(Classifier).general->select(g|g.stereotypedBy('ComplexObjectConstraint'))->isEmpty()
	 * implies
	 * (self.upper<>0)
	 * 
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='[AOM] VSONPO- specialised archetype object node prohibited occurrences validity'"
	 * @generated
	 */
	boolean validateAOMVSONPOspecialisedarchetypeobjectnodeprohibitedoccurrencesvalidity(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The order of sibling children are enforced by the UML semantics of List for the ordered Attributes of a Class.
	 * 
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='[AOM] VSSM- specialised archetype sibling order validity'"
	 * @generated
	 */
	boolean validateAOMVSSMspecialisedarchetypesiblingordervalidity(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * In AML, the path to a node is implicit.  Thus, the path is never undefined and the path exists.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='[AOM] ARCHETYPE_CONSTRAIN:Invariant:path_exists'"
	 * @generated
	 */
	boolean validateAOMARCHETYPECONSTRAINInvariantpathExists(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.base_NamedElement.oclIsKindOf(Property) implies
	 * self.base_NamedElement.oclAsType(Property)->forAll(p|p.redefinedProperty->notEmpty() or p.subsettedProperty->notEmpty())
	 * 
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='[AOM] C_ATTRIBUTE:Invariant:Rm_attribute_name_valid'"
	 * @generated
	 */
	boolean validateAOMCATTRIBUTEInvariantRmAttributeNameValid(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * In AML, existence is implicit and will have a lower, upper in the range of this invariant.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='[AOM] C_ATTRIBUTE:Invariant:Existence_valid'"
	 * @generated
	 */
	boolean validateAOMCATTRIBUTEInvariantExistenceValid(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The [AOM] Invariant is enforced during mapping from AML to [AOM].
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='[AOM] C_ATTRIBUTE:Invariant:[Differential_path_valid'"
	 * @generated
	 */
	boolean validateAOMCATTRIBUTEInvariantDifferentialPathValid(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The [AOM] invariant is implemented by UML constraints regarding cardinality of subsetted/redefined Properties.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='[AOM] C_ATTRIBUTE:Invariant:Child_occurrences_validity'"
	 * @generated
	 */
	boolean validateAOMCATTRIBUTEInvariantChildOccurrencesValidity(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * UML types lower bound as Integer (instead of UnlimitedNatural).  Thus, lower bound cannot be unbounded.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='[AOM] CARDINALITY:Invariant:Validity'"
	 * @generated
	 */
	boolean validateAOMCARDINALITYInvariantValidity(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.id
	 * ->forAll(i|i.stereotypedBy('ArchetypeTerm'))
	 * 
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='[AOM] C_OBJECT:Invariant:Node_id_valid'"
	 * @generated
	 */
	boolean validateAOMCOBJECTInvariantNodeIdValid(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This [AOM] invariant is enforced by the UML constraints covering cardinality of subsetted/redefined properties.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='[AOM] C_OBJECT:Invariant:Occurrences_validity'"
	 * @generated
	 */
	boolean validateAOMCOBJECTInvariantOccurrencesValidity(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The [AOM] sibling_order is mapped from a merge of the current attribute children with the parent Classifier in the parent Archetype.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='[AOM] C_OBJECT:Invariant:Sibling_order_validity'"
	 * @generated
	 */
	boolean validateAOMCOBJECTInvariantSiblingOrderValidity(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The order of children of an attribute is enforced by the UML semantic for Property ordering.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='[AOM] SIBLING_ORDER:Invariant:sibling_node_id_validity'"
	 * @generated
	 */
	boolean validateAOMSIBLINGORDERInvariantsiblingNodeIdValidity(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Validation of type constraints for defaultValue of a Property is enforced by UML Property type and instance semantics. 
	 *  Value restrictions are expressed as Constraints on the Property, but are not necessarily enforceable by UML semantics directly.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='[AOM] C_DEFINED_OBJECT:Invariant:Default_value_valid'"
	 * @generated
	 */
	boolean validateAOMCDEFINEDOBJECTInvariantDefaultValueValid(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.oclIsKindOf(Property) and (self.oclAsType(Property).aggregation=AggregationKind::none)and self.namespace.stereotypedBy('ComplexObjectConstraint'))
	 * implies
	 * not(self.oclAsType(Property).type.oclIsUndefined())
	 * 
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='[AOM] C_COMPLEX_OBJECT_PROXY:Target_path_valid'"
	 * @generated
	 */
	boolean validateAOMCCOMPLEXOBJECTPROXYTargetPathValid(DiagnosticChain diagnostics, Map<Object, Object> context);

} // ObjectConstraint
