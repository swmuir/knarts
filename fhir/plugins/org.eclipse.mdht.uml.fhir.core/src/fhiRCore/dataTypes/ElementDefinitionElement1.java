/**
 */
package fhiRCore.dataTypes;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element Definition Element1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.dataTypes.ElementDefinitionElement1#getDiscriminators <em>Discriminator</em>}</li>
 *   <li>{@link fhiRCore.dataTypes.ElementDefinitionElement1#getDescription <em>Description</em>}</li>
 *   <li>{@link fhiRCore.dataTypes.ElementDefinitionElement1#getOrdered <em>Ordered</em>}</li>
 *   <li>{@link fhiRCore.dataTypes.ElementDefinitionElement1#getRules <em>Rules</em>}</li>
 * </ul>
 *
 * @see fhiRCore.dataTypes.DataTypesPackage#getElementDefinitionElement1()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='ElementDefinition_Element1'"
 * @generated
 */
public interface ElementDefinitionElement1 extends Element {
	/**
	 * Returns the value of the '<em><b>Discriminator</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.ElementDefinitionElement1Element1}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Discriminator</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Discriminator</em>' containment reference list.
	 * @see fhiRCore.dataTypes.DataTypesPackage#getElementDefinitionElement1_Discriminator()
	 * @model containment="true"
	 * @generated
	 */
	EList<ElementDefinitionElement1Element1> getDiscriminators();

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
	 * @see fhiRCore.dataTypes.DataTypesPackage#getElementDefinitionElement1_Description()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getDescription();

	/**
	 * Sets the value of the '{@link fhiRCore.dataTypes.ElementDefinitionElement1#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(fhiRCore.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Ordered</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ordered</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ordered</em>' containment reference.
	 * @see #setOrdered(fhiRCore.dataTypes.Boolean)
	 * @see fhiRCore.dataTypes.DataTypesPackage#getElementDefinitionElement1_Ordered()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.Boolean getOrdered();

	/**
	 * Sets the value of the '{@link fhiRCore.dataTypes.ElementDefinitionElement1#getOrdered <em>Ordered</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ordered</em>' containment reference.
	 * @see #getOrdered()
	 * @generated
	 */
	void setOrdered(fhiRCore.dataTypes.Boolean value);

	/**
	 * Returns the value of the '<em><b>Rules</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rules</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rules</em>' containment reference.
	 * @see #setRules(Code)
	 * @see fhiRCore.dataTypes.DataTypesPackage#getElementDefinitionElement1_Rules()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Code getRules();

	/**
	 * Sets the value of the '{@link fhiRCore.dataTypes.ElementDefinitionElement1#getRules <em>Rules</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rules</em>' containment reference.
	 * @see #getRules()
	 * @generated
	 */
	void setRules(Code value);

} // ElementDefinitionElement1
