/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.BackboneElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Graph Definition Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.GraphDefinitionLink#getPath <em>Path</em>}</li>
 *   <li>{@link fhiRCore.resources.GraphDefinitionLink#getSliceName <em>Slice Name</em>}</li>
 *   <li>{@link fhiRCore.resources.GraphDefinitionLink#getMin <em>Min</em>}</li>
 *   <li>{@link fhiRCore.resources.GraphDefinitionLink#getMax <em>Max</em>}</li>
 *   <li>{@link fhiRCore.resources.GraphDefinitionLink#getDescription <em>Description</em>}</li>
 *   <li>{@link fhiRCore.resources.GraphDefinitionLink#getTargets <em>Target</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getGraphDefinitionLink()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='GraphDefinition_Link'"
 * @generated
 */
public interface GraphDefinitionLink extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Path</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Path</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path</em>' containment reference.
	 * @see #setPath(fhiRCore.dataTypes.String)
	 * @see fhiRCore.resources.ResourcesPackage#getGraphDefinitionLink_Path()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getPath();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.GraphDefinitionLink#getPath <em>Path</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path</em>' containment reference.
	 * @see #getPath()
	 * @generated
	 */
	void setPath(fhiRCore.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Slice Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Slice Name</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Slice Name</em>' containment reference.
	 * @see #setSliceName(fhiRCore.dataTypes.String)
	 * @see fhiRCore.resources.ResourcesPackage#getGraphDefinitionLink_SliceName()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getSliceName();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.GraphDefinitionLink#getSliceName <em>Slice Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Slice Name</em>' containment reference.
	 * @see #getSliceName()
	 * @generated
	 */
	void setSliceName(fhiRCore.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Min</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min</em>' containment reference.
	 * @see #setMin(fhiRCore.dataTypes.Integer)
	 * @see fhiRCore.resources.ResourcesPackage#getGraphDefinitionLink_Min()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.Integer getMin();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.GraphDefinitionLink#getMin <em>Min</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min</em>' containment reference.
	 * @see #getMin()
	 * @generated
	 */
	void setMin(fhiRCore.dataTypes.Integer value);

	/**
	 * Returns the value of the '<em><b>Max</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max</em>' containment reference.
	 * @see #setMax(fhiRCore.dataTypes.String)
	 * @see fhiRCore.resources.ResourcesPackage#getGraphDefinitionLink_Max()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getMax();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.GraphDefinitionLink#getMax <em>Max</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max</em>' containment reference.
	 * @see #getMax()
	 * @generated
	 */
	void setMax(fhiRCore.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(fhiRCore.dataTypes.String)
	 * @see fhiRCore.resources.ResourcesPackage#getGraphDefinitionLink_Description()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getDescription();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.GraphDefinitionLink#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(fhiRCore.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.resources.GraphDefinitionLinkTarget}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getGraphDefinitionLink_Target()
	 * @model containment="true"
	 * @generated
	 */
	EList<GraphDefinitionLinkTarget> getTargets();

} // GraphDefinitionLink
