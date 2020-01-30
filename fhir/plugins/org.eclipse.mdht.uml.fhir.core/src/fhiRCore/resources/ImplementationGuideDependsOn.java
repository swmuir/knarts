/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.BackboneElement;
import fhiRCore.dataTypes.Id;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Implementation Guide Depends On</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.ImplementationGuideDependsOn#getUri <em>Uri</em>}</li>
 *   <li>{@link fhiRCore.resources.ImplementationGuideDependsOn#getPackageId <em>Package Id</em>}</li>
 *   <li>{@link fhiRCore.resources.ImplementationGuideDependsOn#getVersion <em>Version</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getImplementationGuideDependsOn()
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
	 * @see fhiRCore.resources.ResourcesPackage#getImplementationGuideDependsOn_Uri()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ImplementationGuide getUri();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ImplementationGuideDependsOn#getUri <em>Uri</em>}' containment reference.
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
	 * @see fhiRCore.resources.ResourcesPackage#getImplementationGuideDependsOn_PackageId()
	 * @model containment="true"
	 * @generated
	 */
	Id getPackageId();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ImplementationGuideDependsOn#getPackageId <em>Package Id</em>}' containment reference.
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
	 * @see #setVersion(fhiRCore.dataTypes.String)
	 * @see fhiRCore.resources.ResourcesPackage#getImplementationGuideDependsOn_Version()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getVersion();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ImplementationGuideDependsOn#getVersion <em>Version</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' containment reference.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(fhiRCore.dataTypes.String value);

} // ImplementationGuideDependsOn
