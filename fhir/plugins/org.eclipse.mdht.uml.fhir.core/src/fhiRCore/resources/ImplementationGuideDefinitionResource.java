/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.BackboneElement;
import fhiRCore.dataTypes.Code;
import fhiRCore.dataTypes.DataType;
import fhiRCore.dataTypes.Id;
import fhiRCore.dataTypes.Reference;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Implementation Guide Definition Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.ImplementationGuideDefinitionResource#getReference <em>Reference</em>}</li>
 *   <li>{@link fhiRCore.resources.ImplementationGuideDefinitionResource#getFhirVersions <em>Fhir Version</em>}</li>
 *   <li>{@link fhiRCore.resources.ImplementationGuideDefinitionResource#getName <em>Name</em>}</li>
 *   <li>{@link fhiRCore.resources.ImplementationGuideDefinitionResource#getDescription <em>Description</em>}</li>
 *   <li>{@link fhiRCore.resources.ImplementationGuideDefinitionResource#getExamplex <em>Examplex</em>}</li>
 *   <li>{@link fhiRCore.resources.ImplementationGuideDefinitionResource#getGroupingId <em>Grouping Id</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getImplementationGuideDefinitionResource()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Definition_Resource'"
 * @generated
 */
public interface ImplementationGuideDefinitionResource extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reference</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference</em>' containment reference.
	 * @see #setReference(Reference)
	 * @see fhiRCore.resources.ResourcesPackage#getImplementationGuideDefinitionResource_Reference()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Reference getReference();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ImplementationGuideDefinitionResource#getReference <em>Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference</em>' containment reference.
	 * @see #getReference()
	 * @generated
	 */
	void setReference(Reference value);

	/**
	 * Returns the value of the '<em><b>Fhir Version</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.Code}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fhir Version</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fhir Version</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getImplementationGuideDefinitionResource_FhirVersion()
	 * @model containment="true"
	 * @generated
	 */
	EList<Code> getFhirVersions();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(fhiRCore.dataTypes.String)
	 * @see fhiRCore.resources.ResourcesPackage#getImplementationGuideDefinitionResource_Name()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getName();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ImplementationGuideDefinitionResource#getName <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' containment reference.
	 * @see #getName()
	 * @generated
	 */
	void setName(fhiRCore.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(fhiRCore.dataTypes.String)
	 * @see fhiRCore.resources.ResourcesPackage#getImplementationGuideDefinitionResource_Description()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getDescription();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ImplementationGuideDefinitionResource#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(fhiRCore.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Examplex</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Examplex</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Examplex</em>' containment reference.
	 * @see #setExamplex(DataType)
	 * @see fhiRCore.resources.ResourcesPackage#getImplementationGuideDefinitionResource_Examplex()
	 * @model containment="true"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='example[x]'"
	 * @generated
	 */
	DataType getExamplex();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ImplementationGuideDefinitionResource#getExamplex <em>Examplex</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Examplex</em>' containment reference.
	 * @see #getExamplex()
	 * @generated
	 */
	void setExamplex(DataType value);

	/**
	 * Returns the value of the '<em><b>Grouping Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Grouping Id</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Grouping Id</em>' containment reference.
	 * @see #setGroupingId(Id)
	 * @see fhiRCore.resources.ResourcesPackage#getImplementationGuideDefinitionResource_GroupingId()
	 * @model containment="true"
	 * @generated
	 */
	Id getGroupingId();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ImplementationGuideDefinitionResource#getGroupingId <em>Grouping Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Grouping Id</em>' containment reference.
	 * @see #getGroupingId()
	 * @generated
	 */
	void setGroupingId(Id value);

} // ImplementationGuideDefinitionResource
