/**
 */
package org.eclipse.mdht.hl7.fhir.resources;

import org.eclipse.emf.common.util.EList;

import org.eclipse.mdht.hl7.fhir.dataTypes.BackboneElement;
import org.eclipse.mdht.hl7.fhir.dataTypes.Reference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Adverse Event Suspect Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.AdverseEventSuspectEntity#getInstance <em>Instance</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.AdverseEventSuspectEntity#getCausalities <em>Causality</em>}</li>
 * </ul>
 *
 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getAdverseEventSuspectEntity()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='AdverseEvent_SuspectEntity'"
 * @generated
 */
public interface AdverseEventSuspectEntity extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Instance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instance</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instance</em>' containment reference.
	 * @see #setInstance(Reference)
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getAdverseEventSuspectEntity_Instance()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Reference getInstance();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.resources.AdverseEventSuspectEntity#getInstance <em>Instance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instance</em>' containment reference.
	 * @see #getInstance()
	 * @generated
	 */
	void setInstance(Reference value);

	/**
	 * Returns the value of the '<em><b>Causality</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.mdht.hl7.fhir.resources.AdverseEventSuspectEntityCausality}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Causality</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Causality</em>' containment reference list.
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getAdverseEventSuspectEntity_Causality()
	 * @model containment="true"
	 * @generated
	 */
	EList<AdverseEventSuspectEntityCausality> getCausalities();

} // AdverseEventSuspectEntity
