/**
 */
package org.eclipse.mdht.hl7.fhir.resources;

import org.eclipse.emf.common.util.EList;

import org.eclipse.mdht.hl7.fhir.dataTypes.BackboneElement;
import org.eclipse.mdht.hl7.fhir.dataTypes.Code;
import org.eclipse.mdht.hl7.fhir.dataTypes.DataType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Implementation Guide Definition Page</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.ImplementationGuideDefinitionPage#getNamex <em>Namex</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.ImplementationGuideDefinitionPage#getTitle <em>Title</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.ImplementationGuideDefinitionPage#getGeneration <em>Generation</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.ImplementationGuideDefinitionPage#getPages <em>Page</em>}</li>
 * </ul>
 *
 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getImplementationGuideDefinitionPage()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Definition_Page'"
 * @generated
 */
public interface ImplementationGuideDefinitionPage extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Namex</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Namex</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Namex</em>' containment reference.
	 * @see #setNamex(DataType)
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getImplementationGuideDefinitionPage_Namex()
	 * @model containment="true" required="true"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='name[x]'"
	 * @generated
	 */
	DataType getNamex();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.resources.ImplementationGuideDefinitionPage#getNamex <em>Namex</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Namex</em>' containment reference.
	 * @see #getNamex()
	 * @generated
	 */
	void setNamex(DataType value);

	/**
	 * Returns the value of the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Title</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' containment reference.
	 * @see #setTitle(org.eclipse.mdht.hl7.fhir.dataTypes.String)
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getImplementationGuideDefinitionPage_Title()
	 * @model containment="true" required="true"
	 * @generated
	 */
	org.eclipse.mdht.hl7.fhir.dataTypes.String getTitle();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.resources.ImplementationGuideDefinitionPage#getTitle <em>Title</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' containment reference.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(org.eclipse.mdht.hl7.fhir.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Generation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generation</em>' containment reference.
	 * @see #setGeneration(Code)
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getImplementationGuideDefinitionPage_Generation()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Code getGeneration();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.resources.ImplementationGuideDefinitionPage#getGeneration <em>Generation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generation</em>' containment reference.
	 * @see #getGeneration()
	 * @generated
	 */
	void setGeneration(Code value);

	/**
	 * Returns the value of the '<em><b>Page</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.mdht.hl7.fhir.resources.ImplementationGuideDefinitionPage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Page</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Page</em>' containment reference list.
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getImplementationGuideDefinitionPage_Page()
	 * @model containment="true"
	 * @generated
	 */
	EList<ImplementationGuideDefinitionPage> getPages();

} // ImplementationGuideDefinitionPage
