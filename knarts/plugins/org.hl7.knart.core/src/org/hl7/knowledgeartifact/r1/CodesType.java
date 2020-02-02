/**
 */
package org.hl7.knowledgeartifact.r1;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.hl7.cdsdt.r2.CD;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Codes Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.knowledgeartifact.r1.CodesType#getCode <em>Code</em>}</li>
 * </ul>
 *
 * @see org.hl7.knowledgeartifact.r1.R1Package#getCodesType()
 * @model extendedMetaData="name='codes_._type' kind='elementOnly'"
 * @generated
 */
public interface CodesType extends EObject {
	/**
	 * Returns the value of the '<em><b>Code</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.cdsdt.r2.CD}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An individual code that is the equivalent
	 * 									of
	 * 									this value.
	 * 								
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Code</em>' containment reference list.
	 * @see org.hl7.knowledgeartifact.r1.R1Package#getCodesType_Code()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='code' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CD> getCode();

} // CodesType
