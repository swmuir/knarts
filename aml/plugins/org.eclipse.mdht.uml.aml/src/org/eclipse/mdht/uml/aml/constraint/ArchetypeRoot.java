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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Archetype Root</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.eclipse.mdht.uml.aml.constraint.ConstraintPackage#getArchetypeRoot()
 * @model
 * @generated
 */
public interface ArchetypeRoot extends ComplexObjectConstraint {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.base_Classifier.general->forAll(g|g.stereotypedBy('ArchetypeRoot')or g.stereotypedBy('ArchetypeSlot'))
	 * implies
	 * self.id.oclAsType(EnumerationLiteral)
	 * ->forAll(e|e.name.startsWith(self.base_Classifier.general.appliedStereotypeInstance.oclAsType(ObjectConstraint).id.oclAsType(EnumerationLiteral).name->asSequence()->first()))
	 * 
	 * 
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='[AOM] VARXNC- external reference node identifier validity'"
	 * @generated
	 */
	boolean validateAOMVARXNCexternalreferencenodeidentifiervalidity(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The [AOM] Validation Rule is enforced by UML semantics for inheritance, 
	 * since the «ArchetypeRoot» inherits from the «ArchetypeSlot» in the archetype parent archetype
	 * 
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='[AOM] VARXTV- external reference type validity'"
	 * @generated
	 */
	boolean validateAOMVARXTVexternalreferencetypevalidity(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.base_Classifier.general.namespace.namespace->forAll(al|al=self.base_Classifier.namespace.namespace)
	 * 
	 * 
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='[AOM] VARXS- external reference conforms to slot'"
	 * @generated
	 */
	boolean validateAOMVARXSexternalreferenceconformstoslot(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * In AML-UML, the archetype reference is modeled using inheritance, which enforces that the referenced artefact is accessible.
	 * 
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='[AOM] VARXR- external reference refers to resolvable artefact'"
	 * @generated
	 */
	boolean validateAOMVARXRexternalreferencereferstoresolvableartefact(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.base_Classifier.general->forAll(g|g.stereotypedBy('ArchetypeRoot')or g.stereotypedBy('ArchetypeSlot'))
	 * implies
	 * self.id.oclAsType(EnumerationLiteral)
	 * ->forAll(e|e.name.startsWith(
	 *         self.base_Classifier.general.appliedStereotype('ObjectConstraint').oclAsType(ObjectConstraint).id.oclAsType(EnumerationLiteral).name->asSequence()->first()
	 *         )        
	 *   )
	 * 
	 * 
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='[AOM] VARXID- external reference slot filling id validity'"
	 * @generated
	 */
	boolean validateAOMVARXIDexternalreferenceslotfillingidvalidity(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.base_Classifier.general.supplierDependency.client->exists(g|g.stereotypedBy('Archetype'))
	 * 
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='[AOM] C_ARCHETYPE_ROOT:Invariant:Archetype_ref_validity'"
	 * @generated
	 */
	boolean validateAOMCARCHETYPEROOTInvariantArchetypeRefValidity(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.base_Classifier.general->forAll(g|g.stereotypedBy('ArchetypeRoot'))
	 * implies
	 * self.base_Classifier.general.general
	 * ->forAll(g|g.namespace=self.base_Classifier.namespace.oclAsType(Package).packageImport.importedPackage->select(p|p.stereotypedBy('Archetype'))->asSequence()->first())
	 * 
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='[AOM] VARXAV- external reference node archetype reference validity'"
	 * @generated
	 */
	boolean validateAOMVARXAVexternalreferencenodearchetypereferencevalidity(DiagnosticChain diagnostics, Map<Object, Object> context);

} // ArchetypeRoot
