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

import org.eclipse.uml2.uml.Classifier;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Complex Object Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.aml.constraint.ComplexObjectConstraint#getBase_Classifier <em>Base Classifier</em>}</li>
 * </ul>
 *
 * @see org.eclipse.mdht.uml.aml.constraint.ConstraintPackage#getComplexObjectConstraint()
 * @model
 * @generated
 */
public interface ComplexObjectConstraint extends ObjectConstraint {
	/**
	 * Returns the value of the '<em><b>Base Classifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Classifier</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Classifier</em>' reference.
	 * @see #setBase_Classifier(Classifier)
	 * @see org.eclipse.mdht.uml.aml.constraint.ConstraintPackage#getComplexObjectConstraint_Base_Classifier()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Classifier getBase_Classifier();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.aml.constraint.ComplexObjectConstraint#getBase_Classifier <em>Base Classifier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Classifier</em>' reference.
	 * @see #getBase_Classifier()
	 * @generated
	 */
	void setBase_Classifier(Classifier value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.base_Classifier.generalization->size() = 1
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateSingleParent(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  self.namespace.stereotypedBy('ComplexObjectConstraint')
	 *  implies
	 *  ((self.subsettedProperty->notEmpty()) or( self.redefinedProperty->notEmpty()))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateAllAttributeConstraints(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.base_Classifier.supplierDependency->exists(d|d.stereotypedBy('ArchetypeDefinition'))
	 * implies
	 * self.id.oclAsType(EnumerationLiteral)->forAll(e|e.name.match('id1(\\.1)*'))                         
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='[AOM] VARCN- archetype concept validity'"
	 * @generated
	 */
	boolean validateAOMVARCNarchetypeconceptvalidity(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This [AOM] Validation Rule is enforced by UML type constraints for subsetted and/or redefined Properties.
	 * 
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='[AOM] VCARM- attribute name reference model validity'"
	 * @generated
	 */
	boolean validateAOMVCARMattributenamereferencemodelvalidity(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The [AOM] validation rule is enforced by UML validation rules for subsetted or redefined properties.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='[AOM] VCAEX- archetype attribute reference model existence conformance'"
	 * @generated
	 */
	boolean validateAOMVCAEXarchetypeattributereferencemodelexistenceconformance(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This validation rule is enforced by UML Constraints on subsetted and/or redefined Properties.
	 * 
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='[AOM] VCAM- archetype attribute reference model multiplicity conformance'"
	 * @generated
	 */
	boolean validateAOMVCAMarchetypeattributereferencemodelmultiplicityconformance(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An archetype may only have a differential path if it is specialized.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='[AOM] VDIFV- archetype attribute differential path validity:'"
	 * @generated
	 */
	boolean validateAOMVDIFVarchetypeattributedifferentialpathvalidity(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If an attribute constraint has a differential path, 
	 * the path must exist in the flat parent, 
	 * and also be valid with respect to the reference model, 
	 * i.e. in the sense that it corresponds to a legal potential construction of objects.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='[AOM] VDIFP- specialised archetype attribute differential path validity'"
	 * @generated
	 */
	boolean validateAOMVDIFPspecialisedarchetypeattributedifferentialpathvalidity(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This [AOM] Validation Rule is enforced by UML type and cardinality constraints associated with subsetted and/or redefined Properties.
	 * 
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='[AOM] VSANCE- specialised archetype attribute node existence conformance'"
	 * @generated
	 */
	boolean validateAOMVSANCEspecialisedarchetypeattributenodeexistenceconformance(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The [AOM] validation rule is enforced by UML multiplicity constraints applicable to subsetted and/or redefined Properties.
	 * 
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='[AOM] VSAM- specialised archetype attribute multiplicity conformance'"
	 * @generated
	 */
	boolean validateAOMVSAMspecialisedarchetypeattributemultiplicityconformance(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.namespace.stereotypedBy('ComplexObjectConstraint')
	 * implies(
	 * self.subsettedProperty->notEmpty() or self.redefinedProperty->notEmpty()
	 * )
	 * 
	 * 
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='[AOM] VACSO- single-valued attribute child object occurrences validity'"
	 * @generated
	 */
	boolean validateAOMVACSOsinglevaluedattributechildobjectoccurrencesvalidity(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The [AOM] cardinality attribute of C_ATTRIBUTE is derived in UML from the set of sibling Properties subsetting/redefining a common Reference Model Property.  
	 * The derivation is implemented as part of the AML-UML to [AOM] QVT transformation.  
	 * The derived cardinality is computed from the sum of the lower and sum of the upper multiplicity ranges for the related Properties.  
	 * The collection type characteristics are also derived from the related Properties.
	 * In summary, the [AOM] validation rule is enforced during provisioning from AML-UML to [AOM].
	 * 
	 * 
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='[AOM] VACMCU- cardinality/occurrences upper bound validity'"
	 * @generated
	 */
	boolean validateAOMVACMCUcardinalityoccurrencesupperboundvalidity(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self->select(s|s.namespace.stereotypedBy('ComplexObjectConstraint'))
	 * .subsettedProperty->union(self.redefinedProperty)
	 * ->select(r|r.upper>0)
	 * ->forAll(refProperty|
	 * 	self.namespace.oclAsType(Class).ownedAttribute->select(sibling|sibling.subsettedProperty->union(sibling.redefinedProperty)->includes(refProperty))
	 * 	.lower->sum()<=(refProperty.upper-1)
	 * )
	 * 
	 * 
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='[AOM] VACMCO- cardinality/occurrences orphans'"
	 * @generated
	 */
	boolean validateAOMVACMCOcardinalityoccurrencesorphans(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This cardinality rule is enforced by UML constraints on subsetted and/or redefined properties.
	 * 
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='[AOM] VCACA- archetype attribute reference model cardinality conformance'"
	 * @generated
	 */
	boolean validateAOMVCACAarchetypeattributereferencemodelcardinalityconformance(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self->select(s|s.namespace.stereotypedBy('ComplexObjectConstraint'))
	 * .subsettedProperty->union(self.redefinedProperty)
	 * ->select(r|r.upper>0)
	 * ->forAll(refProperty|
	 * 	self.namespace.oclAsType(Class).ownedAttribute->select(sibling|sibling.subsettedProperty->union(sibling.redefinedProperty)->includes(refProperty))
	 * 	.lower->sum()<=refProperty.upper
	 * )
	 * 
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='[AOM] WACMCL- cardinality/occurrences lower bound validity'"
	 * @generated
	 */
	boolean validateAOMWACMCLcardinalityoccurrenceslowerboundvalidity(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This [AOM] validation rule is enforced by UML constraints related to cardinality of subsetted and/or redefined Properties.
	 * 
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='[AOM] VSANCC- specialised archetype attribute node cardinality conformance'"
	 * @generated
	 */
	boolean validateAOMVSANCCspecialisedarchetypeattributenodecardinalityconformance(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The [AOM] Validation Rule is enforced by UML Namespace constraints for names.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='[AOM] VCATU- attribute uniqueness'"
	 * @generated
	 */
	boolean validateAOMVCATUattributeuniqueness(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The [AOM] validation rule is enforced by UML type constraints related to subsetted and/or redefined Properties.
	 * 
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='[AOM] VUNT- use_node reference model type validity'"
	 * @generated
	 */
	boolean validateAOMVUNTuseNodereferencemodeltypevalidity(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.namespace.stereotypedBy('ComplexObjectConstraint') and self.aggregation=AggregationKind::none)
	 * implies(
	 * 	(self.type.getNearestPackage()=self.getNearestPackage())
	 * 	or self.getNearestPackage().packageImport.importedPackage->includes(self.type.getNearestPackage())
	 * )
	 * 
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='[AOM] VUNP- use_node path validity'"
	 * @generated
	 */
	boolean validateAOMVUNPuseNodepathvalidity(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A proxy is modeled using a Property aggregation of none. 
	 *  The aggregation of a redefined/subsetted Property, and consequently whether or not the node is a Proxy, may be different than the archetype Property.
	 * Therefore, it is permitted to use a proxy or regular node in a specialized archetype.
	 * 
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='[AOM] VSUNT- use_node specialisation parent validity'"
	 * @generated
	 */
	boolean validateAOMVSUNTuseNodespecialisationparentvalidity(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The value of an assumed value must fall within the value space defined by the constraint to which it is attached.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='[AOM] VOBAV- object node assumed value validity'"
	 * @generated
	 */
	boolean validateAOMVOBAVobjectnodeassumedvaluevalidity(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self._'context'.stereotypedBy('ComplexObjectConstraint') 
	 *     and self.specification.oclIsKindOf(Expression) 
	 *     and (self.specification.oclAsType(Expression).symbol='=')
	 * )    
	 * implies
	 *     self.specification.oclAsType(Expression).operand
	 *     ->forAll(o|o.oclIsKindOf(InstanceValue) 
	 *                 and o.oclAsType(InstanceValue).instance.stereotypedBy('ArchetypeTerm')
	 *                 and o.oclAsType(InstanceValue).instance.getNearestPackage().nestingPackage.nestingPackage=self.getNearestPackage()
	 *                 ) 
	 * 
	 * 
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='[AOM] VACDF- constraint code validity'"
	 * @generated
	 */
	boolean validateAOMVACDFconstraintcodevalidity(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.base_Classifier.attribute->select(a|a.upper=0).type->forAll(t|
	 *     
	 *     t.oclAsType(Classifier).general
	 *     ->forAll(g|g.appliedStereotype('ObjectConstraint').oclAsType(ObjectConstraint).id
	 *             ->forAll(e|e=t.appliedStereotype('ObjectConstraint').oclAsType(ObjectConstraint).id->asSequence()->first())               
	 *           )     
	 * )
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='[AOM] VSONPI- specialised archetype prohibited object node [AOM] node id validity'"
	 * @generated
	 */
	boolean validateAOMVSONPIspecialisedarchetypeprohibitedobjectnodeAOMnodeidvalidity(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.base_Classifier.general->forAll(g|not(g.name.oclIsUndefined()) and (g.name<>''))
	 * 
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='[AOM] C_OBJECT:Invariant:Rm_type_name_valid'"
	 * @generated
	 */
	boolean validateAOMCOBJECTInvariantRmTypeNameValid(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This Constraint is enforced by UML semantic for a Multiplicity upper bound of 0.
	 * 
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='[AOM] C_COMPLEX_OBJECT:Invariant:Prohibited_validity'"
	 * @generated
	 */
	boolean validateAOMCCOMPLEXOBJECTInvariantProhibitedValidity(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The invariant is definitional; it defines representation for a Property which has no value constraints (beyond the Reference Model type).
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='[AOM] C_COMPLEX_OBJECT:Invariant:Any_allowed_validity'"
	 * @generated
	 */
	boolean validateAOMCCOMPLEXOBJECTInvariantAnyAllowedValidity(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The [AOM] invariant is always satisfied since its mapping to UML is ownedAttributes, which is a collection and is never oclIsUndefined().
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='[AOM] C_COMPLEX_OBJECT:InvariantAttributes_valid'"
	 * @generated
	 */
	boolean validateAOMCCOMPLEXOBJECTInvariantAttributesValid(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *    self.base_Classifier.oclIsKindOf(Class)
	 *    implies
	 *    self.base_Classifier.oclAsType(Class).nestedClassifier
	 *    ->select(n|n.general->exists(g|g=self.base_Classifier)).attribute
	 *    ->forAll(a|a.subsettedProperty->forAll(s|s.namespace=self.base_Classifier)and a.redefinedProperty->forAll(s|s.namespace=self.base_Classifier))
	 *                                                    
	 *                                             
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='[AOM] C_COMPLEX_OBJECT:Tuples_valid'"
	 * @generated
	 */
	boolean validateAOMCCOMPLEXOBJECTTuplesValid(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (
	 *     self.namespace.stereotypedBy('ComplexObjectConstraint')
	 *     and (
	 *         (self.type.namespace.name='PrimitiveTypes')
	 *         or(self.type.namespace.name='XMLPrimitiveTypes')            
	 *         or self.type.clientDependency->select(d|d.stereotypedBy('MappedDataType')).supplier->exists(t|(t.namespace.name='PrimitiveTypes')or(t.namespace.name='XMLPrimitiveTypes'))
	 *     )
	 * )        
	 * implies
	 * self.namespace.ownedRule->notEmpty()
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='[AOM] C_PRIMITIVE_OBJECT:Invariant:Representation_validity'"
	 * @generated
	 */
	boolean validateAOMCPRIMITIVEOBJECTInvariantRepresentationValidity(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The [AOM] C_PRIMITIVE_OBJECT/assumed_value maps to an AML Constraint on a Property whose specification includes a type-specific declaration of the assumed value.  
	 * The assumed value is a ValueSpecification which should be typed in accordance with the type of the Property and should have a value in conformance with the constraints expressed on that Property's Type.
	 * 
	 * 
	 * 
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='[AOM] C_PRIMITIVE_OBJECT:Invariant:Assumed_value_valid'"
	 * @generated
	 */
	boolean validateAOMCPRIMITIVEOBJECTInvariantAssumedValueValid(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (
	 *     self.constrainedElement.oclIsKindOf(Property)
	 *     and  self.constrainedElement.oclAsType(Property).namespace.stereotypedBy('ComplexObjectConstraint')
	 *     and (self.constrainedElement.oclAsType(Property).type.name='Boolean')
	 *     and  self.specification.oclIsKindOf(Expression)
	 *     and ( self.specification.oclAsType(Expression).symbol='or')
	 * )
	 * implies(
	 *       
	 *     self.specification.oclAsType(Expression).operand->forAll(o|o.oclIsKindOf(LiteralBoolean))
	 * )
	 *     
	 * 
	 * 
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='[AOM] C_BOOLEAN:Invariant:Binary_consistency'"
	 * @generated
	 */
	boolean validateAOMCBOOLEANInvariantBinaryConsistency(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Each operand of an 'or' Expression must be a unique value.
	 * 
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='[AOM] C_BOOLEAN:Invariant:Prototype_value_consistency'"
	 * @generated
	 */
	boolean validateAOMCBOOLEANInvariantPrototypeValueConsistency(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An [AOM] C_DATE/pattern_constraint (if present) maps to a the first operand of a 'P_C_DATE' Expression, 
	 * where that first operand is a LiteralString named 'pattern_constraint' and its value must conform to the ISO 8601 date constraint pattern. 
	 * 
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='[AOM] C_DATE:Invariant:Pattern_validity'"
	 * @generated
	 */
	boolean validateAOMCDATEInvariantPatternValidity(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self
	 * ->forAll(constraint|
	 * 	constraint.namespace.stereotypedBy('ComplexObjectConstraint') 
	 * 	and constraint.constrainedElement->forAll(ce|ce.oclIsKindOf(Property))
	 * 	and constraint.specification.oclIsKindOf(Expression)
	 * 	and (constraint.specification.oclAsType(Expression).symbol='=')
	 * 	and constraint.specification.oclAsType(Expression).operand->forAll(o|o.oclIsKindOf(InstanceValue))
	 * )
	 * implies
	 * self.specification.oclAsType(Expression).operand->forAll(o|o.oclAsType(InstanceValue).instance.stereotypedBy('ArchetypeTerm'))
	 * 
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='[AOM] C_TERMINOLOGY_CODE:Invariant:Terminology_id_validity'"
	 * @generated
	 */
	boolean validateAOMCTERMINOLOGYCODEInvariantTerminologyIdValidity(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (
	 *     self.constrainedElement.oclIsKindOf(Property)
	 *     and    self.constrainedElement.oclAsType(Property).namespace.stereotypedBy('ComplexObjectConstraint')       
	 * )
	 * implies(
	 *     self.name.oclIsUndefined()
	 *     or (self.name<>'')
	 * )    
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='[AOM] ASSERTION:Invariant:Tag_valid'"
	 * @generated
	 */
	boolean validateAOMASSERTIONInvariantTagValid(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This [AOM] invariant is enforced by the UML constraint that a Constraint specification must be of type Boolean.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='[AOM] ASSERTION:Invariant:Expression_valid'"
	 * @generated
	 */
	boolean validateAOMASSERTIONInvariantExpressionValid(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (
	 *     self.namespace.stereotypedBy('ComplexObjectConstraint')
	 *     and not(self.specification.oclIsUndefined())
	 *     and self.specification.oclIsKindOf(OpaqueExpression)
	 * )
	 * implies(
	 *     self.specification.name.oclIsUndefined()
	 *     or(self.specification.name<>'')
	 * )    
	 *     
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='[AOM] QUERY_VARIABLE:Invariant:Context_valid'"
	 * @generated
	 */
	boolean validateAOMQUERYVARIABLEInvariantContextValid(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getNearestPackage().stereotypedBy('Archetype')       
	 * implies
	 * not(self.type.oclIsUndefined())
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='[AOM] EXPR_ITEM:Invariant:Type_valid'"
	 * @generated
	 */
	boolean validateAOMEXPRITEMInvariantTypeValid(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (
	 * 	self.getNearestPackage().stereotypedBy('Archetype') 
	 * 	and( 
	 * 		(self.symbol='=')
	 * 		or (self.symbol='<>')
	 * 		or (self.symbol='<=')
	 * 		or (self.symbol='<')
	 * 		or (self.symbol='>=')
	 * 		or (self.symbol='>')
	 * 		or (self.symbol='matches')
	 * 		or (self.symbol='and')
	 * 		or (self.symbol='or')
	 * 		or (self.symbol='xor')
	 * 		or (self.symbol='implies')
	 * 		or (self.symbol='for_all')
	 * 		or (self.symbol='exists')
	 * 		or (self.symbol='+')
	 * 		or (self.symbol='-')
	 * 		or (self.symbol='*')
	 * 		or (self.symbol='/')
	 * 		or (self.symbol='^')
	 * 
	 * 	)
	 * )
	 * implies
	 * (self.operand->size()=1)
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='[AOM] EXPR_UNARY_OPERATOR:Invariant:operand_valid'"
	 * @generated
	 */
	boolean validateAOMEXPRUNARYOPERATORInvariantoperandValid(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (
	 * 	self.getNearestPackage().stereotypedBy('Archetype') 
	 * 	and( 
	 * 		(self.symbol='=')
	 * 		or (self.symbol='<>')
	 * 		or (self.symbol='<=')
	 * 		or (self.symbol='<')
	 * 		or (self.symbol='>=')
	 * 		or (self.symbol='>')
	 * 		or (self.symbol='matches')
	 * 		or (self.symbol='and')
	 * 		or (self.symbol='or')
	 * 		or (self.symbol='xor')
	 * 		or (self.symbol='implies')
	 * 		or (self.symbol='for_all')
	 * 		or (self.symbol='exists')
	 * 		or (self.symbol='+')
	 * 		or (self.symbol='-')
	 * 		or (self.symbol='*')
	 * 		or (self.symbol='/')
	 * 		or (self.symbol='^')
	 * 
	 * 	)
	 * )
	 * implies
	 * (self.operand->size()=2)
	 * 
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='[AOM] EXPR_BINARY_OPERATOR:Invariant:left_operand_valid'"
	 * @generated
	 */
	boolean validateAOMEXPRBINARYOPERATORInvariantleftOperandValid(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (
	 * 	self.getNearestPackage().stereotypedBy('Archetype') 
	 * 	and( 
	 * 		(self.symbol='=')
	 * 		or (self.symbol='<>')
	 * 		or (self.symbol='<=')
	 * 		or (self.symbol='<')
	 * 		or (self.symbol='>=')
	 * 		or (self.symbol='>')
	 * 		or (self.symbol='matches')
	 * 		or (self.symbol='and')
	 * 		or (self.symbol='or')
	 * 		or (self.symbol='xor')
	 * 		or (self.symbol='implies')
	 * 		or (self.symbol='for_all')
	 * 		or (self.symbol='exists')
	 * 		or (self.symbol='+')
	 * 		or (self.symbol='-')
	 * 		or (self.symbol='*')
	 * 		or (self.symbol='/')
	 * 		or (self.symbol='^')
	 * 
	 * 	)
	 * )
	 * implies
	 * (self.operand->size()=2)
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='[AOM] EXPR_BINARY_OPERATOR:Invariant:right_operand_valid'"
	 * @generated
	 */
	boolean validateAOMEXPRBINARYOPERATORInvariantrightOperandValid(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (
	 * 	self.getNearestPackage().stereotypedBy('Archetype') 
	 * 	and( 
	 * 		(self.symbol='=')
	 * 		or (self.symbol='<>')
	 * 		or (self.symbol='<=')
	 * 		or (self.symbol='<')
	 * 		or (self.symbol='>=')
	 * 		or (self.symbol='>')
	 * 		or (self.symbol='matches')
	 * 		or (self.symbol='and')
	 * 		or (self.symbol='or')
	 * 		or (self.symbol='xor')
	 * 		or (self.symbol='implies')
	 * 		or (self.symbol='for_all')
	 * 		or (self.symbol='exists')
	 * 		or (self.symbol='+')
	 * 		or (self.symbol='-')
	 * 		or (self.symbol='*')
	 * 		or (self.symbol='/')
	 * 		or (self.symbol='^')
	 * 
	 * 	)
	 * )
	 * implies(
	 * (self.operand->size()=2)
	 * or (self.operand->size()=1)
	 * )
	 * 
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='[AOM] OPERATOR_KIND:Invariant:Validity'"
	 * @generated
	 */
	boolean validateAOMOPERATORKINDInvariantValidity(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self->select(constraint|constraint.namespace.stereotypedBy('ComplexObjectConstraint') and constraint.constrainedElement->forAll(ce|ce.oclIsKindOf(Property)))
	 * ->select(c|c.specification
	 * 	->forAll(e|e.oclIsKindOf(Expression) and (e.oclAsType(Expression).symbol='=') and (e.oclAsType(Expression).operand->forAll(o|o.oclIsKindOf(InstanceValue))))
	 * ).constrainedElement
	 * implies
	 * self.specification.oclAsType(Expression).operand.oclAsType(InstanceValue)
	 * ->forAll(o|o.instance.stereotypedBy('ArchetypeTerm') and (o.namespace.namespace.namespace.namespace=self.namespace.namespace))
	 * 
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='[AOM] VATDF- value code validity'"
	 * @generated
	 */
	boolean validateAOMVATDFvaluecodevalidity(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self->select(constraint|constraint.namespace.stereotypedBy('ComplexObjectConstraint') and constraint.constrainedElement->forAll(ce|ce.oclIsKindOf(Property)))
	 * ->select(c|c.specification
	 * 	->forAll(e|e.oclIsKindOf(Expression) and (e.oclAsType(Expression).symbol='=') and (e.oclAsType(Expression).operand->forAll(o|o.oclIsKindOf(InstanceValue))))
	 * ).constrainedElement
	 * implies
	 * self.specification.oclAsType(Expression).operand.oclAsType(InstanceValue)
	 * ->forAll(o|o.instance.stereotypedBy('ArchetypeTerm') and (o.namespace.namespace.namespace.namespace=self.namespace.namespace))
	 * 
	 * 
	 * 
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='[AOM] VATDA- value set assumed value code validity'"
	 * @generated
	 */
	boolean validateAOMVATDAvaluesetassumedvaluecodevalidity(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.base_Classifier.oclIsKindOf(Class)
	 * implies
	 * self.base_Classifier.oclAsType(Class).ownedAttribute->forAll(attribute|
	 * 	(
	 * 		attribute.stereotypedBy('ObjectConstraint')
	 * 		and
	 * 		(        
	 * 		  self.base_Classifier.oclAsType(Class).ownedAttribute->select(a|a<>attribute)->forAll(sibling|      
	 * 		      (
	 * 		          sibling.stereotypedBy('ObjectConstraint')      
	 * 		          and
	 * 		          not(sibling.appliedStereotype('ObjectConstraint').oclAsType(ObjectConstraint).id->includes(attribute.appliedStereotype('ObjectConstraint').oclAsType(ObjectConstraint).id->asSequence()->first()))
	 * 		      )
	 * 		      or(
	 * 		          sibling.type.stereotypedBy('ObjectConstraint')      
	 *                  and
	 *                 not(sibling.type.appliedStereotype('ObjectConstraint').oclAsType(ObjectConstraint).id->includes(attribute.appliedStereotype('ObjectConstraint').oclAsType(ObjectConstraint).id->asSequence()->first()))
	 * 		      )    
	 * 		    )
	 * 		)
	 * 	)
	 * 	or(
	 * 		attribute.type.stereotypedBy('ObjectConstraint')
	 * 		and
	 * 		(
	 * 		  self.base_Classifier.oclAsType(Class).ownedAttribute->select(a|a<>attribute)->forAll(sibling|      
	 *             (
	 *                 sibling.stereotypedBy('ObjectConstraint')      
	 *                 and
	 *                 not(sibling.appliedStereotype('ObjectConstraint').oclAsType(ObjectConstraint).id->includes(attribute.type.appliedStereotype('ObjectConstraint').oclAsType(ObjectConstraint).id->asSequence()->first()))
	 *             )
	 *             or(
	 *                 sibling.type.stereotypedBy('ObjectConstraint')      
	 *                and
	 *               not(sibling.type.appliedStereotype('ObjectConstraint').oclAsType(ObjectConstraint).id->includes(attribute.type.appliedStereotype('ObjectConstraint').oclAsType(ObjectConstraint).id->asSequence()->first()))
	 *             )    
	 *           )
	 * 		)
	 * 	)
	 * )
	 * 
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='[AOM] VSONIF- specialised archetype object node identifier validity in flat siblings'"
	 * @generated
	 */
	boolean validateAOMVSONIFspecialisedarchetypeobjectnodeidentifiervalidityinflatsiblings(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ((self.aggregation=AggregationKind::none) and self.namespace.stereotypedBy('ComplexObjectConstraint'))
	 * implies
	 * self.type.getNearestReferenceModel().oclIsUndefined()
	 * 
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='[AOM] C_COMPLEX_OBJECT_PROXY:Invariant:Consistency'"
	 * @generated
	 */
	boolean validateAOMCCOMPLEXOBJECTPROXYInvariantConsistency(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (
	 *     self.namespace.stereotypedBy('ComplexObjectConstraint')
	 *     and not(self.type.getNearestReferenceModel().oclIsUndefined())
	 * )    
	 * implies
	 *     self.namespace.oclAsType(Class).ownedAttribute
	 *     ->select(a|
	 *             (a<>self) 
	 *             and not(a.subsetsProperty->includes(self.subsetsProperty->first())) 
	 *             and not(a.redefinesProperty->includes(self.redefinesProperty->first()))
	 *        )    
	 *     ->isEmpty()
	 * 
	 * 
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='[AOM] C_ATTRIBUTE:Invariant:Children_validity'"
	 * @generated
	 */
	boolean validateAOMCATTRIBUTEInvariantChildrenValidity(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self->select(s|s.namespace.stereotypedBy('ComplexObjectConstraint'))
	 * .subsettedProperty->union(self.redefinedProperty)
	 * ->select(r|r.upper>0)
	 * ->forAll(refProperty|
	 * 	self.namespace.oclAsType(Class).ownedAttribute->select(sibling|sibling.subsettedProperty->union(sibling.redefinedProperty)->includes(refProperty))
	 * 	->select(p|p.lower>0)
	 * 	->size()<refProperty.upper
	 * )
	 * 
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='[AOM] C_ATTRIBUTE:Invariant:Children_orphans_validity'"
	 * @generated
	 */
	boolean validateAOMCATTRIBUTEInvariantChildrenOrphansValidity(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self->select(s|s.namespace.stereotypedBy('ComplexObjectConstraint'))
	 * .subsettedProperty->union(self.redefinedProperty)
	 * ->select(r|r.upper>0)
	 * ->forAll(refProperty|
	 * 	self.namespace.oclAsType(Class).ownedAttribute->select(sibling|sibling.subsettedProperty->union(sibling.redefinedProperty)->includes(refProperty))
	 * 	.lower->sum()<=refProperty.upper
	 * )
	 * 
	 * 
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='[AOM] C_ATTRIBUTE:Invariant:Children_occurrences_lower_sum_validity'"
	 * @generated
	 */
	boolean validateAOMCATTRIBUTEInvariantChildrenOccurrencesLowerSumValidity(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self->select(s|s.namespace.stereotypedBy('ComplexObjectConstraint'))
	 * .subsettedProperty->union(self.redefinedProperty)
	 * ->select(r|r.upper>0)
	 * ->forAll(refProperty|
	 * 	self.namespace.oclAsType(Class).ownedAttribute->select(sibling|sibling.subsettedProperty->union(sibling.redefinedProperty)->includes(refProperty))
	 * 	->forAll(p|p.aggregation=self.aggregation)
	 * )
	 * 
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='[AOM] C_ATTRIBUTE:Invariant:Cardinality_valid'"
	 * @generated
	 */
	boolean validateAOMCATTRIBUTEInvariantCardinalityValid(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self->select(s|s.namespace.stereotypedBy('ComplexObjectConstraint'))
	 * .subsettedProperty->union(self.redefinedProperty)
	 * ->select(r|r.upper=1)
	 * ->forAll(refProperty|
	 * 	self.namespace.oclAsType(Class).ownedAttribute->select(sibling|sibling.subsettedProperty->union(sibling.redefinedProperty)->includes(refProperty))
	 * 	->forAll(p|p.upper=1)
	 * )
	 * 
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='[AOM] C_ATTRIBUTE:Invariant:Alternatives_valid'"
	 * @generated
	 */
	boolean validateAOMCATTRIBUTEInvariantAlternativesValid(DiagnosticChain diagnostics, Map<Object, Object> context);

} // ComplexObjectConstraint
