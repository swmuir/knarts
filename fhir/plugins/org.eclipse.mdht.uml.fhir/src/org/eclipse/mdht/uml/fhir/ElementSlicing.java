/**
 */
package org.eclipse.mdht.uml.fhir;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.Property;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element Slicing</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.ElementSlicing#getDiscriminators <em>Discriminator</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.ElementSlicing#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.ElementSlicing#getOrdered <em>Ordered</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.ElementSlicing#getRules <em>Rules</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.ElementSlicing#getBase_Property <em>Base Property</em>}</li>
 * </ul>
 *
 * @see org.eclipse.mdht.uml.fhir.FHIRPackage#getElementSlicing()
 * @model
 * @generated
 */
public interface ElementSlicing extends EObject {
	/**
	 * Returns the value of the '<em><b>Discriminator</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Discriminator</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Discriminator</em>' attribute list.
	 * @see org.eclipse.mdht.uml.fhir.FHIRPackage#getElementSlicing_Discriminator()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	EList<String> getDiscriminators();

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.eclipse.mdht.uml.fhir.FHIRPackage#getElementSlicing_Description()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.ElementSlicing#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ordered</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ordered</em>' attribute.
	 * @see #setOrdered(Boolean)
	 * @see org.eclipse.mdht.uml.fhir.FHIRPackage#getElementSlicing_Ordered()
	 * @model ordered="false"
	 * @generated
	 */
	Boolean getOrdered();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.ElementSlicing#getOrdered <em>Ordered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ordered</em>' attribute.
	 * @see #getOrdered()
	 * @generated
	 */
	void setOrdered(Boolean value);

	/**
	 * Returns the value of the '<em><b>Rules</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.mdht.uml.fhir.SlicingRulesKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rules</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rules</em>' attribute.
	 * @see org.eclipse.mdht.uml.fhir.SlicingRulesKind
	 * @see #setRules(SlicingRulesKind)
	 * @see org.eclipse.mdht.uml.fhir.FHIRPackage#getElementSlicing_Rules()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	SlicingRulesKind getRules();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.ElementSlicing#getRules <em>Rules</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rules</em>' attribute.
	 * @see org.eclipse.mdht.uml.fhir.SlicingRulesKind
	 * @see #getRules()
	 * @generated
	 */
	void setRules(SlicingRulesKind value);

	/**
	 * Returns the value of the '<em><b>Base Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Property</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Property</em>' reference.
	 * @see #setBase_Property(Property)
	 * @see org.eclipse.mdht.uml.fhir.FHIRPackage#getElementSlicing_Base_Property()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Property getBase_Property();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.ElementSlicing#getBase_Property <em>Base Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Property</em>' reference.
	 * @see #getBase_Property()
	 * @generated
	 */
	void setBase_Property(Property value);

} // ElementSlicing
