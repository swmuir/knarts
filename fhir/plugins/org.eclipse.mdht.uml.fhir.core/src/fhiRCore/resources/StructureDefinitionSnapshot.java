/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.BackboneElement;
import fhiRCore.dataTypes.ElementDefinition;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Structure Definition Snapshot</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.StructureDefinitionSnapshot#getElements <em>Element</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getStructureDefinitionSnapshot()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='StructureDefinition_Snapshot'"
 * @generated
 */
public interface StructureDefinitionSnapshot extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Element</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.ElementDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getStructureDefinitionSnapshot_Element()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ElementDefinition> getElements();

} // StructureDefinitionSnapshot
