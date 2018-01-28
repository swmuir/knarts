/**
 */
package org.eclipse.mdht.uml.fhir;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.mdht.uml.fhir.types.Reference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Search Parameter Component Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.SearchParameter_ComponentClass#getDefinition <em>Definition</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.SearchParameter_ComponentClass#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @see org.eclipse.mdht.uml.fhir.FHIRPackage#getSearchParameter_ComponentClass()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='ComponentClass'"
 * @generated
 */
public interface SearchParameter_ComponentClass extends EObject {
	/**
	 * Returns the value of the '<em><b>Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Definition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Definition</em>' containment reference.
	 * @see #setDefinition(Reference)
	 * @see org.eclipse.mdht.uml.fhir.FHIRPackage#getSearchParameter_ComponentClass_Definition()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	Reference getDefinition();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.SearchParameter_ComponentClass#getDefinition <em>Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Definition</em>' containment reference.
	 * @see #getDefinition()
	 * @generated
	 */
	void setDefinition(Reference value);

	/**
	 * Returns the value of the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expression</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' attribute.
	 * @see #setExpression(String)
	 * @see org.eclipse.mdht.uml.fhir.FHIRPackage#getSearchParameter_ComponentClass_Expression()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getExpression();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.SearchParameter_ComponentClass#getExpression <em>Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' attribute.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(String value);

} // SearchParameter_ComponentClass
