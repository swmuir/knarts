/**
 */
package fhiRCore.dataTypes;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Backbone Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.dataTypes.BackboneElement#getModifierExtensions <em>Modifier Extension</em>}</li>
 * </ul>
 *
 * @see fhiRCore.dataTypes.DataTypesPackage#getBackboneElement()
 * @model abstract="true"
 * @generated
 */
public interface BackboneElement extends DataType {
	/**
	 * Returns the value of the '<em><b>Modifier Extension</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.Extension}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modifier Extension</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modifier Extension</em>' containment reference list.
	 * @see fhiRCore.dataTypes.DataTypesPackage#getBackboneElement_ModifierExtension()
	 * @model containment="true"
	 * @generated
	 */
	EList<Extension> getModifierExtensions();

} // BackboneElement
