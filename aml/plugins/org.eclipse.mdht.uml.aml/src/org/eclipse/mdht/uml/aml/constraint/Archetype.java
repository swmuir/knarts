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
import org.eclipse.emf.common.util.EList;

import org.eclipse.mdht.uml.aml.terminology.ArchetypeType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Archetype</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.aml.constraint.Archetype#getBase_Package <em>Base Package</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.aml.constraint.Archetype#getArchetypeType <em>Archetype Type</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.aml.constraint.Archetype#getAmlVersion <em>Aml Version</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.aml.constraint.Archetype#isIs_controlled <em>Is controlled</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.aml.constraint.Archetype#isIs_generated <em>Is generated</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.aml.constraint.Archetype#getRelease_version <em>Release version</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.aml.constraint.Archetype#getVersion_status <em>Version status</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.aml.constraint.Archetype#getBuild_count <em>Build count</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.aml.constraint.Archetype#getOther_metadatas <em>Other metadata</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.aml.constraint.Archetype#getOther_metadata_ids <em>Other metadata id</em>}</li>
 * </ul>
 *
 * @see org.eclipse.mdht.uml.aml.constraint.ConstraintPackage#getArchetype()
 * @model
 * @generated
 */
public interface Archetype extends AuthoredResource {
	/**
	 * Returns the value of the '<em><b>Base Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Package</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Package</em>' reference.
	 * @see #setBase_Package(org.eclipse.uml2.uml.Package)
	 * @see org.eclipse.mdht.uml.aml.constraint.ConstraintPackage#getArchetype_Base_Package()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	org.eclipse.uml2.uml.Package getBase_Package();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.aml.constraint.Archetype#getBase_Package <em>Base Package</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Package</em>' reference.
	 * @see #getBase_Package()
	 * @generated
	 */
	void setBase_Package(org.eclipse.uml2.uml.Package value);

	/**
	 * Returns the value of the '<em><b>Archetype Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.mdht.uml.aml.terminology.ArchetypeType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Archetype Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Archetype Type</em>' attribute.
	 * @see org.eclipse.mdht.uml.aml.terminology.ArchetypeType
	 * @see #setArchetypeType(ArchetypeType)
	 * @see org.eclipse.mdht.uml.aml.constraint.ConstraintPackage#getArchetype_ArchetypeType()
	 * @model ordered="false"
	 * @generated
	 */
	ArchetypeType getArchetypeType();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.aml.constraint.Archetype#getArchetypeType <em>Archetype Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Archetype Type</em>' attribute.
	 * @see org.eclipse.mdht.uml.aml.terminology.ArchetypeType
	 * @see #getArchetypeType()
	 * @generated
	 */
	void setArchetypeType(ArchetypeType value);

	/**
	 * Returns the value of the '<em><b>Aml Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Aml Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aml Version</em>' attribute.
	 * @see #setAmlVersion(String)
	 * @see org.eclipse.mdht.uml.aml.constraint.ConstraintPackage#getArchetype_AmlVersion()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getAmlVersion();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.aml.constraint.Archetype#getAmlVersion <em>Aml Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aml Version</em>' attribute.
	 * @see #getAmlVersion()
	 * @generated
	 */
	void setAmlVersion(String value);

	/**
	 * Returns the value of the '<em><b>Is controlled</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is controlled</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is controlled</em>' attribute.
	 * @see #setIs_controlled(boolean)
	 * @see org.eclipse.mdht.uml.aml.constraint.ConstraintPackage#getArchetype_Is_controlled()
	 * @model default="false" dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isIs_controlled();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.aml.constraint.Archetype#isIs_controlled <em>Is controlled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is controlled</em>' attribute.
	 * @see #isIs_controlled()
	 * @generated
	 */
	void setIs_controlled(boolean value);

	/**
	 * Returns the value of the '<em><b>Is generated</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is generated</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is generated</em>' attribute.
	 * @see #setIs_generated(boolean)
	 * @see org.eclipse.mdht.uml.aml.constraint.ConstraintPackage#getArchetype_Is_generated()
	 * @model default="false" dataType="org.eclipse.uml2.types.Boolean" ordered="false"
	 * @generated
	 */
	boolean isIs_generated();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.aml.constraint.Archetype#isIs_generated <em>Is generated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is generated</em>' attribute.
	 * @see #isIs_generated()
	 * @generated
	 */
	void setIs_generated(boolean value);

	/**
	 * Returns the value of the '<em><b>Release version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Release version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Release version</em>' attribute.
	 * @see #setRelease_version(String)
	 * @see org.eclipse.mdht.uml.aml.constraint.ConstraintPackage#getArchetype_Release_version()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getRelease_version();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.aml.constraint.Archetype#getRelease_version <em>Release version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Release version</em>' attribute.
	 * @see #getRelease_version()
	 * @generated
	 */
	void setRelease_version(String value);

	/**
	 * Returns the value of the '<em><b>Version status</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.mdht.uml.aml.constraint.VERSION_STATUS}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version status</em>' attribute.
	 * @see org.eclipse.mdht.uml.aml.constraint.VERSION_STATUS
	 * @see #setVersion_status(VERSION_STATUS)
	 * @see org.eclipse.mdht.uml.aml.constraint.ConstraintPackage#getArchetype_Version_status()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	VERSION_STATUS getVersion_status();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.aml.constraint.Archetype#getVersion_status <em>Version status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version status</em>' attribute.
	 * @see org.eclipse.mdht.uml.aml.constraint.VERSION_STATUS
	 * @see #getVersion_status()
	 * @generated
	 */
	void setVersion_status(VERSION_STATUS value);

	/**
	 * Returns the value of the '<em><b>Build count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Build count</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Build count</em>' attribute.
	 * @see #setBuild_count(int)
	 * @see org.eclipse.mdht.uml.aml.constraint.ConstraintPackage#getArchetype_Build_count()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getBuild_count();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.aml.constraint.Archetype#getBuild_count <em>Build count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Build count</em>' attribute.
	 * @see #getBuild_count()
	 * @generated
	 */
	void setBuild_count(int value);

	/**
	 * Returns the value of the '<em><b>Other metadata</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Other metadata</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Other metadata</em>' attribute list.
	 * @see org.eclipse.mdht.uml.aml.constraint.ConstraintPackage#getArchetype_Other_metadata()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	EList<String> getOther_metadatas();

	/**
	 * Returns the value of the '<em><b>Other metadata id</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Other metadata id</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Other metadata id</em>' attribute list.
	 * @see org.eclipse.mdht.uml.aml.constraint.ConstraintPackage#getArchetype_Other_metadata_id()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	EList<String> getOther_metadata_ids();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  self.base_Package.owningPackage.stereotypedBy('ArchetypeLibrary')
	 * 
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateMustBeOwned(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.base_Package.ownedType->select(x|x.oclIsKindOf(Classifier) and not(x.oclIsKindOf(Association)))->forAll(x|x.stereotypedBy('ObjectConstraint'))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateOwnsObjectConstraints(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  self.base_Package.packageImport.importedPackage
	 *  ->select(p|p.stereotypedBy('Archetype')).clientDependency
	 *  ->select(t|t.stereotypedBy('ArchetypeDefinition')).supplier.oclAsType(Classifier).general
	 *  ->forAll(x|self.base_Package.clientDependency->select(t|t.stereotypedBy('ArchetypeDefinition')).supplier.oclAsType(Classifier).general->includes(x))
	 *  
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateSpecializesArchetype(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This [AOM] validation rule is enforced by the UML constraint that names within a namespace must be unique.
	 * 
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='[AOM] VOKU- object key unique'"
	 * @generated
	 */
	boolean validateAOMVOKUobjectkeyunique(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * In AML, the typename in the archetype id is derived from the name of the constrained RM Type in the outer block of the archetype definition section, 
	 * so the [AOM] validity rule is always satisfied.
	 * 
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='[AOM] VARDT- archetype definition typename validity'"
	 * @generated
	 */
	boolean validateAOMVARDTarchetypedefinitiontypenamevalidity(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.release_version.match('[0-9]*(\\.[0-9]*(\\.[0-9]*)?)?')
	 * 
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='[AOM] VARID- archetype identifier validity'"
	 * @generated
	 */
	boolean validateAOMVARIDarchetypeidentifiervalidity(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.base_Package.clientDependency
	 * 	->select(d|d.oclIsKindOf(Usage) and (d.name='original_language')).supplier
	 * 	->select(s|s.stereotypedBy('ResourceTranslation'))
	 * 	->notEmpty()
	 * 
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='[AOM] VDEOL- original language specified'"
	 * @generated
	 */
	boolean validateAOMVDEOLoriginallanguagespecified(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.archetypeType.repr()<>'template_overlay')
	 * implies
	 * self.base_Package.clientDependency.supplier->select(d|d.stereotypedBy('ResourceTranslation'))->notEmpty()
	 * 
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='[AOM] VARD- description specified'"
	 * @generated
	 */
	boolean validateAOMVARDdescriptionspecified(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.base_Package.packageImport.importedPackage->select(p|p.stereotypedBy('Archetype'))->size()<=1
	 * 
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='[AOM] VASID- archetype specialisation parent identifier validity'"
	 * @generated
	 */
	boolean validateAOMVASIDarchetypespecialisationparentidentifiervalidity(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  self.base_Package.packageImport.importedPackage
	 * 	->forAll(superArch|self.base_Package.clientDependency.supplier->select(s|s.stereotypedBy('ResourceTranslation')).name
	 * 		->forAll(language|superArch.clientDependency.supplier->select(s|s.stereotypedBy('ResourceTranslation')).name->exists(n|n=language))
	 * 	)
	 * 
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='[AOM] VALC- archetype language conformance'"
	 * @generated
	 */
	boolean validateAOMVALCarchetypelanguageconformance(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This [AOM] Validation Rule is definitional for AML-UML;
	 * the specialisation_depth is implicitly derived from the number of parent-archetype specializations above the current archetype.
	 * 
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='[AOM] VACSD- archetype concept specialisation depth'"
	 * @generated
	 */
	boolean validateAOMVACSDarchetypeconceptspecialisationdepth(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The specialization level used for archetype terms and constraint codes are derived and enforced during mapping to [AOM] to conform with the specialization level validity constraint.
	 *  
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='[AOM] VATCD- archetype code specialisation level validity'"
	 * @generated
	 */
	boolean validateAOMVATCDarchetypecodespecialisationlevelvalidity(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.base_Package.clientDependency->select(d|d.oclIsKindOf(Usage) and (d.name='original_language')).supplier
	 * ->select(e|e.stereotypedBy('ResourceTranslation'))
	 * ->size()=1
	 * 
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='[AOM] ARCHETYPE:Invariant:Original_language_valid'"
	 * @generated
	 */
	boolean validateAOMARCHETYPEInvariantOriginalLanguageValid(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.base_Package.clientDependency
	 * ->select(d|d.stereotypedBy('ArchetypeDefinition')).supplier->exists(s|s.appliedStereotypeInstance.oclAsType(ComplexObjectConstraint).id->notEmpty())                 
	 *                    
	 * 
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='[AOM] ARCHETYPE:Invariant:Concept_valid'"
	 * @generated
	 */
	boolean validateAOMARCHETYPEInvariantConceptValid(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.base_Package.clientDependency
	 *    ->exists(d|d.stereotypedBy('ArchetypeDefinition') )
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='[AOM] ARCHETYPE:Invariant:Definition_exists'"
	 * @generated
	 */
	boolean validateAOMARCHETYPEInvariantDefinitionExists(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.base_Package.nestedPackage.nestedPackage.ownedType->exists(o|o.stereotypedBy('ResourceTranslation'))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='[AOM] ARCHETYPE:Invariant:Terminology_exists'"
	 * @generated
	 */
	boolean validateAOMARCHETYPEInvariantTerminologyExists(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * During AML transformations, is_specialised is derived and will be consistent with specialisation_depth, which is also derived.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='[AOM] ARCHETYPE:Invariant:Specialisation_validity'"
	 * @generated
	 */
	boolean validateAOMARCHETYPEInvariantSpecialisationValidity(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This [AOM] Invariant is definitional in AML.  In AML, if rules is empty, it implies rules are undefined. 
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='[AOM] ARCHETYPE:Invariant:Rules_valid'"
	 * @generated
	 */
	boolean validateAOMARCHETYPEInvariantRulesValid(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not(self.base_Package.name.oclIsUndefined()) and (self.base_Package.name<>'')
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='[AOM] ARCHETYPE_HRID:Invariant:Concept_id_validity'"
	 * @generated
	 */
	boolean validateAOMARCHETYPEHRIDInvariantConceptIdValidity(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The release_version tag is required, so this [AOM] invariant is enforced by [UML] semantics.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='[AOM] ARCHETYPE_HRID:Invariant:Base_version_validity'"
	 * @generated
	 */
	boolean validateAOMARCHETYPEHRIDInvariantBaseVersionValidity(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This [AOM] invariant is definitional in AML.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='[AOM] OPERATIONAL_TEMPLATE:Invariant:Is_specialised'"
	 * @generated
	 */
	boolean validateAOMOPERATIONALTEMPLATEInvariantIsSpecialised(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The compendium of terminologies from externally archetypes is derivable from the AML model.  
	 * Although not explicitly defined in AML, it is conceptually derivable from an Archetype.
	 * The derived value would contain a list of the flattened terminologies from the externally referenced archetypes.
	 * 
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='[AOM] OPERATIONAL_TEMPLATE:Invariant:Component_terminologies_existence'"
	 * @generated
	 */
	boolean validateAOMOPERATIONALTEMPLATEInvariantComponentTerminologiesExistence(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.base_Package.clientDependency->select(d|d.oclIsKindOf(Usage) and (d.name='terminology_original_language')).supplier
	 * ->select(e|e.stereotypedBy('ResourceTranslation'))
	 * ->size()=1
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='[AOM] ARCHETYPE_TERMINOLOGY:Invariant:original_language_validity'"
	 * @generated
	 */
	boolean validateAOMARCHETYPETERMINOLOGYInvariantoriginalLanguageValidity(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.base_Package.clientDependency
	 * ->select(d|d.stereotypedBy('ArchetypeDefinition')).supplier->exists(s|s.appliedStereotypeInstance.oclAsType(ComplexObjectConstraint).id->notEmpty())                 
	 *               
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='[AOM] ARCHETYPE_TERMINOLOGY:Invariant:concept_code_validity'"
	 * @generated
	 */
	boolean validateAOMARCHETYPETERMINOLOGYInvariantconceptCodeValidity(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.base_Package.clientDependency->select(d|d.oclIsKindOf(Usage) and (d.name='original_language')).supplier
	 * ->exists(e|e.stereotypedBy('ResourceTranslation'))
	 * 
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='[AOM] ARCHETYPE_TERMINOLOGY:Invariant:term_definitions_validity'"
	 * @generated
	 */
	boolean validateAOMARCHETYPETERMINOLOGYInvarianttermDefinitionsValidity(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.base_Package.nestedPackage->exists(p|p.name='ontology')
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='[AOM] ARCHETYPE_TERMINOLOGY:Invariant:Parent_archetype_valid'"
	 * @generated
	 */
	boolean validateAOMARCHETYPETERMINOLOGYInvariantParentArchetypeValid(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.namespace.stereotypedBy('Namespace')
	 * implies(
	 *                    
	 *    not( self.name.oclIsUndefined())
	 *     and(self.name<>'')
	 * )
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='[AOM] VARIABLE_DECLARATION:Invariant:Name_valid'"
	 * @generated
	 */
	boolean validateAOMVARIABLEDECLARATIONInvariantNameValid(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Archetype
