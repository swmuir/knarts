/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.BackboneElement;
import fhiRCore.dataTypes.DataType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Specimen Definition Type Tested Container Additive</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.SpecimenDefinitionTypeTestedContainerAdditive#getAdditivex <em>Additivex</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getSpecimenDefinitionTypeTestedContainerAdditive()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Container_Additive'"
 * @generated
 */
public interface SpecimenDefinitionTypeTestedContainerAdditive extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Additivex</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Additivex</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Additivex</em>' containment reference.
	 * @see #setAdditivex(DataType)
	 * @see fhiRCore.resources.ResourcesPackage#getSpecimenDefinitionTypeTestedContainerAdditive_Additivex()
	 * @model containment="true" required="true"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='additive[x]'"
	 * @generated
	 */
	DataType getAdditivex();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.SpecimenDefinitionTypeTestedContainerAdditive#getAdditivex <em>Additivex</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additivex</em>' containment reference.
	 * @see #getAdditivex()
	 * @generated
	 */
	void setAdditivex(DataType value);

} // SpecimenDefinitionTypeTestedContainerAdditive
