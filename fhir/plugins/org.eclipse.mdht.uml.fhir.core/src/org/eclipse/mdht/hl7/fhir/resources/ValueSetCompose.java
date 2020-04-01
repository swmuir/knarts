/**
 */
package org.eclipse.mdht.hl7.fhir.resources;

import org.eclipse.emf.common.util.EList;

import org.eclipse.mdht.hl7.fhir.dataTypes.BackboneElement;
import org.eclipse.mdht.hl7.fhir.dataTypes.Date;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Value Set Compose</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.ValueSetCompose#getLockedDate <em>Locked Date</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.ValueSetCompose#getInactive <em>Inactive</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.ValueSetCompose#getIncludes <em>Include</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.ValueSetCompose#getExcludes <em>Exclude</em>}</li>
 * </ul>
 *
 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getValueSetCompose()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='ValueSet_Compose'"
 * @generated
 */
public interface ValueSetCompose extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Locked Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Locked Date</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Locked Date</em>' containment reference.
	 * @see #setLockedDate(Date)
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getValueSetCompose_LockedDate()
	 * @model containment="true"
	 * @generated
	 */
	Date getLockedDate();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.resources.ValueSetCompose#getLockedDate <em>Locked Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Locked Date</em>' containment reference.
	 * @see #getLockedDate()
	 * @generated
	 */
	void setLockedDate(Date value);

	/**
	 * Returns the value of the '<em><b>Inactive</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inactive</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inactive</em>' containment reference.
	 * @see #setInactive(org.eclipse.mdht.hl7.fhir.dataTypes.Boolean)
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getValueSetCompose_Inactive()
	 * @model containment="true"
	 * @generated
	 */
	org.eclipse.mdht.hl7.fhir.dataTypes.Boolean getInactive();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.resources.ValueSetCompose#getInactive <em>Inactive</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inactive</em>' containment reference.
	 * @see #getInactive()
	 * @generated
	 */
	void setInactive(org.eclipse.mdht.hl7.fhir.dataTypes.Boolean value);

	/**
	 * Returns the value of the '<em><b>Include</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.mdht.hl7.fhir.resources.ValueSetComposeConceptSet}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Include</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Include</em>' containment reference list.
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getValueSetCompose_Include()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ValueSetComposeConceptSet> getIncludes();

	/**
	 * Returns the value of the '<em><b>Exclude</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.mdht.hl7.fhir.resources.ValueSetComposeConceptSet}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exclude</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exclude</em>' containment reference list.
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getValueSetCompose_Exclude()
	 * @model containment="true"
	 * @generated
	 */
	EList<ValueSetComposeConceptSet> getExcludes();

} // ValueSetCompose
