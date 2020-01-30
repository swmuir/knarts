/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.Extension;
import fhiRCore.dataTypes.Narrative;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Domain Resource</b></em>'.
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
 *   <li>{@link fhiRCore.resources.DomainResource#getText <em>Text</em>}</li>
 *   <li>{@link fhiRCore.resources.DomainResource#getContaineds <em>Contained</em>}</li>
 *   <li>{@link fhiRCore.resources.DomainResource#getExtensions <em>Extension</em>}</li>
 *   <li>{@link fhiRCore.resources.DomainResource#getModifierExtensions <em>Modifier Extension</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getDomainResource()
 * @model abstract="true"
 * @generated
 */
public interface DomainResource extends Resource {
	/**
	 * Returns the value of the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' containment reference.
	 * @see #setText(Narrative)
	 * @see fhiRCore.resources.ResourcesPackage#getDomainResource_Text()
	 * @model containment="true"
	 * @generated
	 */
	Narrative getText();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.DomainResource#getText <em>Text</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' containment reference.
	 * @see #getText()
	 * @generated
	 */
	void setText(Narrative value);

	/**
	 * Returns the value of the '<em><b>Contained</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.resources.Resource}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contained</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contained</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getDomainResource_Contained()
	 * @model containment="true"
	 * @generated
	 */
	EList<Resource> getContaineds();

	/**
	 * Returns the value of the '<em><b>Extension</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.Extension}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extension</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extension</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getDomainResource_Extension()
	 * @model containment="true"
	 * @generated
	 */
	EList<Extension> getExtensions();

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
	 * @see fhiRCore.resources.ResourcesPackage#getDomainResource_ModifierExtension()
	 * @model containment="true"
	 * @generated
	 */
	EList<Extension> getModifierExtensions();

} // DomainResource
