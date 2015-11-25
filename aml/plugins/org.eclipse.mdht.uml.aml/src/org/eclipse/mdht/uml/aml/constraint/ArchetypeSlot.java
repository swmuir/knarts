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
 * A representation of the model object '<em><b>Archetype Slot</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.aml.constraint.ArchetypeSlot#getBase_Classifier <em>Base Classifier</em>}</li>
 * </ul>
 *
 * @see org.eclipse.mdht.uml.aml.constraint.ConstraintPackage#getArchetypeSlot()
 * @model
 * @generated
 */
public interface ArchetypeSlot extends ObjectConstraint {
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
	 * @see org.eclipse.mdht.uml.aml.constraint.ConstraintPackage#getArchetypeSlot_Base_Classifier()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Classifier getBase_Classifier();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.aml.constraint.ArchetypeSlot#getBase_Classifier <em>Base Classifier</em>}' reference.
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
	 * self.base_Classifier.general->forAll(g|g.stereotypedBy('ARCHETYPE_SLOT'))
	 * implies
	 * self.base_Classifier.general->forAll(g|not(g.isLeaf))
	 * 
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='[AOM] VDSSP- specialised archetype slot definition parent validity'"
	 * @generated
	 */
	boolean validateAOMVDSSPspecialisedarchetypeslotdefinitionparentvalidity(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.base_Classifier.ownedRule.specification->select(r|r.oclAsType(Expression).symbol='includes')->notEmpty()
	 * implies
	 * self.base_Classifier.ownedRule.specification->select(r|r.oclAsType(Expression).symbol='excludes')->isEmpty()
	 * 
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='[AOM] VDSEV- archetype slot \u2018exclude\u2019 constraint validity'"
	 * @generated
	 */
	boolean validateAOMVDSEVarchetypeslotexcludeconstraintvalidity(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The set of archetypes matched from a library of archetypes by a specialized archetype slot definition 
	 * must be a proper subset of the set matched from the same library by the parent slot definition.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='[AOM] VDSSM- specialised archetype slot definition match validity'"
	 * @generated
	 */
	boolean validateAOMVDSSMspecialisedarchetypeslotdefinitionmatchvalidity(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.base_Classifier.general->forAll(g|g.stereotypedBy('ArchetypeRoot'))
	 * implies
	 * (self.base_Classifier.appliedStereotype('ArchetypeRoot').oclAsType(ArchetypeRoot).id
	 *     ->forAll(e|e	=self.base_Classifier.general.appliedStereotype('ArchetypeRoot').oclAsType(ArchetypeRoot).id->asSequence()->first())
	 * )
	 * 
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='[AOM] VDSSID- slot redefinition child node id'"
	 * @generated
	 */
	boolean validateAOMVDSSIDslotredefinitionchildnodeid(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.base_Classifier.general->forAll(g|g.stereotypedBy('ARCHETYPE_ROOT'))
	 * implies
	 * (self.base_Classifier.ownedRule->isEmpty()=self.base_Classifier.isLeaf)
	 * 
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='[AOM] VDSSC- specialised archetype slot definition closed validity'"
	 * @generated
	 */
	boolean validateAOMVDSSCspecialisedarchetypeslotdefinitionclosedvalidity(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.base_Classifier.ownedRule->select(r|r.specification.oclAsType(Expression).symbol='excludes')->notEmpty())
	 * implies
	 * (self.base_Classifier.ownedRule->select(r|r.specification.oclAsType(Expression).symbol='includes')->isEmpty())
	 * 
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='[AOM] VDSIV- archetype slot \u2018include\u2019 constraint validity'"
	 * @generated
	 */
	boolean validateAOMVDSIVarchetypeslotincludeconstraintvalidity(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The [AOM] Invariant is definitional for AML.  An undefined [AOM] ARCHETYPE_SLOT/includes maps to an empty list of include Expressions.
	 * 
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='[AOM] ARCHETYPE_SLOT:Invariant:includes_valid'"
	 * @generated
	 */
	boolean validateAOMARCHETYPESLOTInvariantincludesValid(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The [AOM] Invariant is definitional for AML.  An undefined [AOM] ARCHETYPE_SLOT/excludes maps to an empty list of exclude Expressions.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='[AOM] ARCHETYPE_SLOT:Invariant:excludes_valid'"
	 * @generated
	 */
	boolean validateAOMARCHETYPESLOTInvariantexcludesValid(DiagnosticChain diagnostics, Map<Object, Object> context);

} // ArchetypeSlot
