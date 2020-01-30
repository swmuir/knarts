/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.BackboneElement;
import fhiRCore.dataTypes.Code;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Value Set Compose Concept Set Filter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.ValueSetComposeConceptSetFilter#getProperty <em>Property</em>}</li>
 *   <li>{@link fhiRCore.resources.ValueSetComposeConceptSetFilter#getOp <em>Op</em>}</li>
 *   <li>{@link fhiRCore.resources.ValueSetComposeConceptSetFilter#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getValueSetComposeConceptSetFilter()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='ConceptSet_Filter'"
 * @generated
 */
public interface ValueSetComposeConceptSetFilter extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property</em>' containment reference.
	 * @see #setProperty(Code)
	 * @see fhiRCore.resources.ResourcesPackage#getValueSetComposeConceptSetFilter_Property()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Code getProperty();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ValueSetComposeConceptSetFilter#getProperty <em>Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property</em>' containment reference.
	 * @see #getProperty()
	 * @generated
	 */
	void setProperty(Code value);

	/**
	 * Returns the value of the '<em><b>Op</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Op</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Op</em>' containment reference.
	 * @see #setOp(Code)
	 * @see fhiRCore.resources.ResourcesPackage#getValueSetComposeConceptSetFilter_Op()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Code getOp();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ValueSetComposeConceptSetFilter#getOp <em>Op</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Op</em>' containment reference.
	 * @see #getOp()
	 * @generated
	 */
	void setOp(Code value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(fhiRCore.dataTypes.String)
	 * @see fhiRCore.resources.ResourcesPackage#getValueSetComposeConceptSetFilter_Value()
	 * @model containment="true" required="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getValue();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ValueSetComposeConceptSetFilter#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(fhiRCore.dataTypes.String value);

} // ValueSetComposeConceptSetFilter
