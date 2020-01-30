/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.BackboneElement;
import fhiRCore.dataTypes.DataType;
import fhiRCore.dataTypes.Reference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Biologically Derived Product Collection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.BiologicallyDerivedProductCollection#getCollector <em>Collector</em>}</li>
 *   <li>{@link fhiRCore.resources.BiologicallyDerivedProductCollection#getSource <em>Source</em>}</li>
 *   <li>{@link fhiRCore.resources.BiologicallyDerivedProductCollection#getCollectedx <em>Collectedx</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getBiologicallyDerivedProductCollection()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='BiologicallyDerivedProduct_Collection'"
 * @generated
 */
public interface BiologicallyDerivedProductCollection extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Collector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Collector</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Collector</em>' containment reference.
	 * @see #setCollector(Reference)
	 * @see fhiRCore.resources.ResourcesPackage#getBiologicallyDerivedProductCollection_Collector()
	 * @model containment="true"
	 * @generated
	 */
	Reference getCollector();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.BiologicallyDerivedProductCollection#getCollector <em>Collector</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Collector</em>' containment reference.
	 * @see #getCollector()
	 * @generated
	 */
	void setCollector(Reference value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' containment reference.
	 * @see #setSource(Reference)
	 * @see fhiRCore.resources.ResourcesPackage#getBiologicallyDerivedProductCollection_Source()
	 * @model containment="true"
	 * @generated
	 */
	Reference getSource();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.BiologicallyDerivedProductCollection#getSource <em>Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' containment reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Reference value);

	/**
	 * Returns the value of the '<em><b>Collectedx</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Collectedx</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Collectedx</em>' containment reference.
	 * @see #setCollectedx(DataType)
	 * @see fhiRCore.resources.ResourcesPackage#getBiologicallyDerivedProductCollection_Collectedx()
	 * @model containment="true"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='collected[x]'"
	 * @generated
	 */
	DataType getCollectedx();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.BiologicallyDerivedProductCollection#getCollectedx <em>Collectedx</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Collectedx</em>' containment reference.
	 * @see #getCollectedx()
	 * @generated
	 */
	void setCollectedx(DataType value);

} // BiologicallyDerivedProductCollection
