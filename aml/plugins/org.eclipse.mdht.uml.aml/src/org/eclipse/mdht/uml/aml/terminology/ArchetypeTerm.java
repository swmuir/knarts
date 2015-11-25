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
package org.eclipse.mdht.uml.aml.terminology;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.uml2.uml.EnumerationLiteral;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Archetype Term</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.aml.terminology.ArchetypeTerm#getValue_set_members <em>Value set members</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.aml.terminology.ArchetypeTerm#getTerm_bindings <em>Term bindings</em>}</li>
 * </ul>
 *
 * @see org.eclipse.mdht.uml.aml.terminology.TerminologyPackage#getArchetypeTerm()
 * @model
 * @generated
 */
public interface ArchetypeTerm extends PermissibleValue {
	/**
	 * Returns the value of the '<em><b>Value set members</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.EnumerationLiteral}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value set members</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value set members</em>' reference list.
	 * @see org.eclipse.mdht.uml.aml.terminology.TerminologyPackage#getArchetypeTerm_Value_set_members()
	 * @model ordered="false"
	 * @generated
	 */
	EList<EnumerationLiteral> getValue_set_members();

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.EnumerationLiteral} with the specified '<em><b>Name</b></em>' from the '<em><b>Value set members</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.EnumerationLiteral} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.EnumerationLiteral} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getValue_set_members()
	 * @generated
	 */
	EnumerationLiteral getValue_set_members(String name);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.EnumerationLiteral} with the specified '<em><b>Name</b></em>' from the '<em><b>Value set members</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.EnumerationLiteral} to retrieve, or <code>null</code>.
	 * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.
	 * @return The first {@link org.eclipse.uml2.uml.EnumerationLiteral} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getValue_set_members()
	 * @generated
	 */
	EnumerationLiteral getValue_set_members(String name, boolean ignoreCase);

	/**
	 * Returns the value of the '<em><b>Term bindings</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.EnumerationLiteral}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Term bindings</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Term bindings</em>' reference list.
	 * @see org.eclipse.mdht.uml.aml.terminology.TerminologyPackage#getArchetypeTerm_Term_bindings()
	 * @model ordered="false"
	 * @generated
	 */
	EList<EnumerationLiteral> getTerm_bindings();

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.EnumerationLiteral} with the specified '<em><b>Name</b></em>' from the '<em><b>Term bindings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.EnumerationLiteral} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.EnumerationLiteral} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getTerm_bindings()
	 * @generated
	 */
	EnumerationLiteral getTerm_bindings(String name);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.EnumerationLiteral} with the specified '<em><b>Name</b></em>' from the '<em><b>Term bindings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.EnumerationLiteral} to retrieve, or <code>null</code>.
	 * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.
	 * @return The first {@link org.eclipse.uml2.uml.EnumerationLiteral} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getTerm_bindings()
	 * @generated
	 */
	EnumerationLiteral getTerm_bindings(String name, boolean ignoreCase);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.base_EnumerationLiteral.namespace.oclAsType(Enumeration).namespace.oclAsType(Package).ownedType
	 * 	->select(t|t.stereotypedBy('ResourceTranslation')).oclAsType(Enumeration)
	 * 	->forAll(sibling|sibling.ownedLiteral->exists(ol|ol.appliedStereotype('IdEntry').oclAsType(IdEntry).ref=self.base_EnumerationLiteral))             
	 * 
	 * 
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='[AOM] VTLC- language consistency'"
	 * @generated
	 */
	boolean validateAOMVTLClanguageconsistency(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This [AOM] Validity Rule is definitional in AML.  
	 * The definition of the identifying code of a value set is an Archetype Term which has a non-empty value for the value_set_members tag.
	 * 
	 * 
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='[AOM] VTVSID- value-set id defined'"
	 * @generated
	 */
	boolean validateAOMVTVSIDvaluesetiddefined(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.value_set_members->forAll(member|member.namespace=self.base_EnumerationLiteral.namespace)
	 * 
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='[AOM] VTVSUQ- value-set members unique'"
	 * @generated
	 */
	boolean validateAOMVTVSUQvaluesetmembersunique(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.value_set_members->forAll(member|member.namespace=self.base_EnumerationLiteral.namespace)
	 * 
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='[AOM] VTVSMD- value-set members defined'"
	 * @generated
	 */
	boolean validateAOMVTVSMDvaluesetmembersdefined(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not(self.base_EnumerationLiteral.name.oclIsUndefined())
	 * and(self.base_EnumerationLiteral.name<>'')
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='[AOM] ARCHETYPE_TERM:Invariant:code_valid_code'"
	 * @generated
	 */
	boolean validateAOMARCHETYPETERMInvariantcodeValidCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * In AML, the [AOM] Constraint is definitional; the ArchetypeTerm name is an Identifier Definition id as well as the Value Set definition.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='[AOM] VALUE_SET:Invariant:Id_valid'"
	 * @generated
	 */
	boolean validateAOMVALUESETInvariantIdValid(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.value_set_members->forAll(m|m.namespace=self.base_EnumerationLiteral.namespace)
	 * 
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='[AOM] VALUE_SET:Invariant:Members_valid'"
	 * @generated
	 */
	boolean validateAOMVALUESETInvariantMembersValid(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.term_bindings
	 * ->forAll(binding|
	 * 	binding.stereotypedBy('ConceptReference') 
	 * 	and (binding.namespace.namespace.namespace=self.base_EnumerationLiteral.namespace.namespace.namespace)
	 * )
	 * 
	 * 
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='[AOM] ARCHETYPE_TERMINOLOGY:Invariant:term_bindings_validity'"
	 * @generated
	 */
	boolean validateAOMARCHETYPETERMINOLOGYInvarianttermBindingsValidity(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.term_bindings->forAll(b|b.namespace.namespace.name='term_bindings')
	 * 
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='[AOM] VETDF- external term validity'"
	 * @generated
	 */
	boolean validateAOMVETDFexternaltermvalidity(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.term_bindings->forAll(b|b.namespace.namespace.name='term_bindings')
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='[AOM] VTCBK- terminology constraint binding key valid'"
	 * @generated
	 */
	boolean validateAOMVTCBKterminologyconstraintbindingkeyvalid(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Term or constraint code defined in archetype terminology must be of the same or a less specialized level then the specialization level of the Archetype. 
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='[AOM] VTSD- specialisation level of codes'"
	 * @generated
	 */
	boolean validateAOMVTSDspecialisationlevelofcodes(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.term_bindings->forAll(b|b.namespace.namespace.name='term_bindings')
	 * 
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='[AOM] VTTBK- terminology term binding key valid'"
	 * @generated
	 */
	boolean validateAOMVTTBKterminologytermbindingkeyvalid(DiagnosticChain diagnostics, Map<Object, Object> context);

} // ArchetypeTerm
