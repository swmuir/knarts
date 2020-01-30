/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.BackboneElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Implementation Guide Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.ImplementationGuideDefinition#getGroupings <em>Grouping</em>}</li>
 *   <li>{@link fhiRCore.resources.ImplementationGuideDefinition#getResources <em>Resource</em>}</li>
 *   <li>{@link fhiRCore.resources.ImplementationGuideDefinition#getPage <em>Page</em>}</li>
 *   <li>{@link fhiRCore.resources.ImplementationGuideDefinition#getParameters <em>Parameter</em>}</li>
 *   <li>{@link fhiRCore.resources.ImplementationGuideDefinition#getTemplates <em>Template</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getImplementationGuideDefinition()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='ImplementationGuide_Definition'"
 * @generated
 */
public interface ImplementationGuideDefinition extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Grouping</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.resources.ImplementationGuideDefinitionGrouping}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Grouping</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Grouping</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getImplementationGuideDefinition_Grouping()
	 * @model containment="true"
	 * @generated
	 */
	EList<ImplementationGuideDefinitionGrouping> getGroupings();

	/**
	 * Returns the value of the '<em><b>Resource</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.resources.ImplementationGuideDefinitionResource}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getImplementationGuideDefinition_Resource()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ImplementationGuideDefinitionResource> getResources();

	/**
	 * Returns the value of the '<em><b>Page</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Page</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Page</em>' containment reference.
	 * @see #setPage(ImplementationGuideDefinitionPage)
	 * @see fhiRCore.resources.ResourcesPackage#getImplementationGuideDefinition_Page()
	 * @model containment="true"
	 * @generated
	 */
	ImplementationGuideDefinitionPage getPage();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ImplementationGuideDefinition#getPage <em>Page</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Page</em>' containment reference.
	 * @see #getPage()
	 * @generated
	 */
	void setPage(ImplementationGuideDefinitionPage value);

	/**
	 * Returns the value of the '<em><b>Parameter</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.resources.ImplementationGuideDefinitionParameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameter</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getImplementationGuideDefinition_Parameter()
	 * @model containment="true"
	 * @generated
	 */
	EList<ImplementationGuideDefinitionParameter> getParameters();

	/**
	 * Returns the value of the '<em><b>Template</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.resources.ImplementationGuideDefinitionTemplate}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Template</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Template</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getImplementationGuideDefinition_Template()
	 * @model containment="true"
	 * @generated
	 */
	EList<ImplementationGuideDefinitionTemplate> getTemplates();

} // ImplementationGuideDefinition
