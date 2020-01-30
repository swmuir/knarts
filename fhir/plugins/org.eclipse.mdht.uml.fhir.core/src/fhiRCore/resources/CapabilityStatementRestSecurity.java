/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.BackboneElement;
import fhiRCore.dataTypes.CodeableConcept;
import fhiRCore.dataTypes.Markdown;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Capability Statement Rest Security</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.CapabilityStatementRestSecurity#getCors <em>Cors</em>}</li>
 *   <li>{@link fhiRCore.resources.CapabilityStatementRestSecurity#getServices <em>Service</em>}</li>
 *   <li>{@link fhiRCore.resources.CapabilityStatementRestSecurity#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getCapabilityStatementRestSecurity()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Rest_Security'"
 * @generated
 */
public interface CapabilityStatementRestSecurity extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Cors</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cors</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cors</em>' containment reference.
	 * @see #setCors(fhiRCore.dataTypes.Boolean)
	 * @see fhiRCore.resources.ResourcesPackage#getCapabilityStatementRestSecurity_Cors()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.Boolean getCors();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.CapabilityStatementRestSecurity#getCors <em>Cors</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cors</em>' containment reference.
	 * @see #getCors()
	 * @generated
	 */
	void setCors(fhiRCore.dataTypes.Boolean value);

	/**
	 * Returns the value of the '<em><b>Service</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getCapabilityStatementRestSecurity_Service()
	 * @model containment="true"
	 * @generated
	 */
	EList<CodeableConcept> getServices();

	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(Markdown)
	 * @see fhiRCore.resources.ResourcesPackage#getCapabilityStatementRestSecurity_Description()
	 * @model containment="true"
	 * @generated
	 */
	Markdown getDescription();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.CapabilityStatementRestSecurity#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(Markdown value);

} // CapabilityStatementRestSecurity
