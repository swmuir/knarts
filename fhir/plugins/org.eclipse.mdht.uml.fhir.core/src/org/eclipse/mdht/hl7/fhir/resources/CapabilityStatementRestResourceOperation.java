/**
 */
package org.eclipse.mdht.hl7.fhir.resources;

import org.eclipse.mdht.hl7.fhir.dataTypes.BackboneElement;
import org.eclipse.mdht.hl7.fhir.dataTypes.Markdown;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Capability Statement Rest Resource Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.CapabilityStatementRestResourceOperation#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.CapabilityStatementRestResourceOperation#getDefinition <em>Definition</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.CapabilityStatementRestResourceOperation#getDocumentation <em>Documentation</em>}</li>
 * </ul>
 *
 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getCapabilityStatementRestResourceOperation()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Resource_Operation'"
 * @generated
 */
public interface CapabilityStatementRestResourceOperation extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(org.eclipse.mdht.hl7.fhir.dataTypes.String)
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getCapabilityStatementRestResourceOperation_Name()
	 * @model containment="true" required="true"
	 * @generated
	 */
	org.eclipse.mdht.hl7.fhir.dataTypes.String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.resources.CapabilityStatementRestResourceOperation#getName <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' containment reference.
	 * @see #getName()
	 * @generated
	 */
	void setName(org.eclipse.mdht.hl7.fhir.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Definition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Definition</em>' containment reference.
	 * @see #setDefinition(OperationDefinition)
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getCapabilityStatementRestResourceOperation_Definition()
	 * @model containment="true" required="true"
	 * @generated
	 */
	OperationDefinition getDefinition();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.resources.CapabilityStatementRestResourceOperation#getDefinition <em>Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Definition</em>' containment reference.
	 * @see #getDefinition()
	 * @generated
	 */
	void setDefinition(OperationDefinition value);

	/**
	 * Returns the value of the '<em><b>Documentation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Documentation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Documentation</em>' containment reference.
	 * @see #setDocumentation(Markdown)
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getCapabilityStatementRestResourceOperation_Documentation()
	 * @model containment="true"
	 * @generated
	 */
	Markdown getDocumentation();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.resources.CapabilityStatementRestResourceOperation#getDocumentation <em>Documentation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Documentation</em>' containment reference.
	 * @see #getDocumentation()
	 * @generated
	 */
	void setDocumentation(Markdown value);

} // CapabilityStatementRestResourceOperation
