/**
 */
package org.eclipse.mdht.hl7.fhir.resources;

import org.eclipse.mdht.hl7.fhir.dataTypes.BackboneElement;
import org.eclipse.mdht.hl7.fhir.dataTypes.Id;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Implementation Guide Depends On</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.ImplementationGuideDependsOn#getUri <em>Uri</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.ImplementationGuideDependsOn#getPackageId <em>Package Id</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.ImplementationGuideDependsOn#getVersion <em>Version</em>}</li>
 * </ul>
 *
 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getImplementationGuideDependsOn()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='ImplementationGuide_DependsOn'"
 * @generated
 */
public interface ImplementationGuideDependsOn extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Uri</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uri</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uri</em>' containment reference.
	 * @see #setUri(ImplementationGuide)
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getImplementationGuideDependsOn_Uri()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ImplementationGuide getUri();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.resources.ImplementationGuideDependsOn#getUri <em>Uri</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uri</em>' containment reference.
	 * @see #getUri()
	 * @generated
	 */
	void setUri(ImplementationGuide value);

	/**
	 * Returns the value of the '<em><b>Package Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Package Id</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Package Id</em>' containment reference.
	 * @see #setPackageId(Id)
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getImplementationGuideDependsOn_PackageId()
	 * @model containment="true"
	 * @generated
	 */
	Id getPackageId();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.resources.ImplementationGuideDependsOn#getPackageId <em>Package Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Package Id</em>' containment reference.
	 * @see #getPackageId()
	 * @generated
	 */
	void setPackageId(Id value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' containment reference.
	 * @see #setVersion(org.eclipse.mdht.hl7.fhir.dataTypes.String)
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getImplementationGuideDependsOn_Version()
	 * @model containment="true"
	 * @generated
	 */
	org.eclipse.mdht.hl7.fhir.dataTypes.String getVersion();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.resources.ImplementationGuideDependsOn#getVersion <em>Version</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' containment reference.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(org.eclipse.mdht.hl7.fhir.dataTypes.String value);

} // ImplementationGuideDependsOn
