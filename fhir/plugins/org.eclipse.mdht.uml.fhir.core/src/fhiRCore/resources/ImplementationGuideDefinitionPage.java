/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.BackboneElement;
import fhiRCore.dataTypes.Code;
import fhiRCore.dataTypes.DataType;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Implementation Guide Definition Page</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.ImplementationGuideDefinitionPage#getNamex <em>Namex</em>}</li>
 *   <li>{@link fhiRCore.resources.ImplementationGuideDefinitionPage#getTitle <em>Title</em>}</li>
 *   <li>{@link fhiRCore.resources.ImplementationGuideDefinitionPage#getGeneration <em>Generation</em>}</li>
 *   <li>{@link fhiRCore.resources.ImplementationGuideDefinitionPage#getPages <em>Page</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getImplementationGuideDefinitionPage()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Definition_Page'"
 * @generated
 */
public interface ImplementationGuideDefinitionPage extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Namex</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Namex</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Namex</em>' containment reference.
	 * @see #setNamex(DataType)
	 * @see fhiRCore.resources.ResourcesPackage#getImplementationGuideDefinitionPage_Namex()
	 * @model containment="true" required="true"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='name[x]'"
	 * @generated
	 */
	DataType getNamex();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ImplementationGuideDefinitionPage#getNamex <em>Namex</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Namex</em>' containment reference.
	 * @see #getNamex()
	 * @generated
	 */
	void setNamex(DataType value);

	/**
	 * Returns the value of the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Title</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' containment reference.
	 * @see #setTitle(fhiRCore.dataTypes.String)
	 * @see fhiRCore.resources.ResourcesPackage#getImplementationGuideDefinitionPage_Title()
	 * @model containment="true" required="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getTitle();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ImplementationGuideDefinitionPage#getTitle <em>Title</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' containment reference.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(fhiRCore.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Generation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generation</em>' containment reference.
	 * @see #setGeneration(Code)
	 * @see fhiRCore.resources.ResourcesPackage#getImplementationGuideDefinitionPage_Generation()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Code getGeneration();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ImplementationGuideDefinitionPage#getGeneration <em>Generation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generation</em>' containment reference.
	 * @see #getGeneration()
	 * @generated
	 */
	void setGeneration(Code value);

	/**
	 * Returns the value of the '<em><b>Page</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.resources.ImplementationGuideDefinitionPage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Page</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Page</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getImplementationGuideDefinitionPage_Page()
	 * @model containment="true"
	 * @generated
	 */
	EList<ImplementationGuideDefinitionPage> getPages();

} // ImplementationGuideDefinitionPage
