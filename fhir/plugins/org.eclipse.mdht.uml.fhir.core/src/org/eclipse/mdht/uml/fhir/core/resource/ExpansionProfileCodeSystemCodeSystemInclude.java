/*******************************************************************************
 * Copyright (c) 2016 David Carlson and others.
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
package org.eclipse.mdht.uml.fhir.core.resource;

import org.eclipse.emf.common.util.EList;

import org.eclipse.mdht.uml.fhir.core.datatype.BackboneElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expansion Profile Code System Code System Include</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.ExpansionProfileCodeSystemCodeSystemInclude#getCodeSystems <em>Code System</em>}</li>
 * </ul>
 *
 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getExpansionProfileCodeSystemCodeSystemInclude()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='CodeSystem_CodeSystemInclude'"
 * @generated
 */
public interface ExpansionProfileCodeSystemCodeSystemInclude extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Code System</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.mdht.uml.fhir.core.resource.ExpansionProfileCodeSystemCodeSystemIncludeCodeSystemIncludeCodeSystem}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code System</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code System</em>' containment reference list.
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getExpansionProfileCodeSystemCodeSystemInclude_CodeSystem()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ExpansionProfileCodeSystemCodeSystemIncludeCodeSystemIncludeCodeSystem> getCodeSystems();

} // ExpansionProfileCodeSystemCodeSystemInclude
