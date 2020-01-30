/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.BackboneElement;
import fhiRCore.dataTypes.DataType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Value Set Expansion Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.ValueSetExpansionParameter#getName <em>Name</em>}</li>
 *   <li>{@link fhiRCore.resources.ValueSetExpansionParameter#getValuex <em>Valuex</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getValueSetExpansionParameter()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Expansion_Parameter'"
 * @generated
 */
public interface ValueSetExpansionParameter extends BackboneElement {
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
	 * @see fhiRCore.resources.ResourcesPackage#getValueSetExpansionParameter_Name()
	 * @model containment="true" required="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getName();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ValueSetExpansionParameter#getName <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' containment reference.
	 * @see #getName()
	 * @generated
	 */
	void setName(fhiRCore.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Valuex</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Valuex</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valuex</em>' containment reference.
	 * @see #setValuex(DataType)
	 * @see fhiRCore.resources.ResourcesPackage#getValueSetExpansionParameter_Valuex()
	 * @model containment="true"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='value[x]'"
	 * @generated
	 */
	DataType getValuex();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ValueSetExpansionParameter#getValuex <em>Valuex</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Valuex</em>' containment reference.
	 * @see #getValuex()
	 * @generated
	 */
	void setValuex(DataType value);

} // ValueSetExpansionParameter
