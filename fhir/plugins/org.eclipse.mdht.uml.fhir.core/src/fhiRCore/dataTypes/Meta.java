/**
 */
package fhiRCore.dataTypes;

import fhiRCore.resources.StructureDefinition;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Meta</b></em>'.
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
 *   <li>{@link fhiRCore.dataTypes.Meta#getVersionId <em>Version Id</em>}</li>
 *   <li>{@link fhiRCore.dataTypes.Meta#getLastUpdated <em>Last Updated</em>}</li>
 *   <li>{@link fhiRCore.dataTypes.Meta#getSource <em>Source</em>}</li>
 *   <li>{@link fhiRCore.dataTypes.Meta#getProfiles <em>Profile</em>}</li>
 *   <li>{@link fhiRCore.dataTypes.Meta#getSecurities <em>Security</em>}</li>
 *   <li>{@link fhiRCore.dataTypes.Meta#getTags <em>Tag</em>}</li>
 * </ul>
 *
 * @see fhiRCore.dataTypes.DataTypesPackage#getMeta()
 * @model
 * @generated
 */
public interface Meta extends DataType {
	/**
	 * Returns the value of the '<em><b>Version Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version Id</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version Id</em>' containment reference.
	 * @see #setVersionId(Id)
	 * @see fhiRCore.dataTypes.DataTypesPackage#getMeta_VersionId()
	 * @model containment="true"
	 * @generated
	 */
	Id getVersionId();

	/**
	 * Sets the value of the '{@link fhiRCore.dataTypes.Meta#getVersionId <em>Version Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version Id</em>' containment reference.
	 * @see #getVersionId()
	 * @generated
	 */
	void setVersionId(Id value);

	/**
	 * Returns the value of the '<em><b>Last Updated</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Updated</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Updated</em>' containment reference.
	 * @see #setLastUpdated(Instant)
	 * @see fhiRCore.dataTypes.DataTypesPackage#getMeta_LastUpdated()
	 * @model containment="true"
	 * @generated
	 */
	Instant getLastUpdated();

	/**
	 * Sets the value of the '{@link fhiRCore.dataTypes.Meta#getLastUpdated <em>Last Updated</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Updated</em>' containment reference.
	 * @see #getLastUpdated()
	 * @generated
	 */
	void setLastUpdated(Instant value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' containment reference.
	 * @see #setSource(Uri)
	 * @see fhiRCore.dataTypes.DataTypesPackage#getMeta_Source()
	 * @model containment="true"
	 * @generated
	 */
	Uri getSource();

	/**
	 * Sets the value of the '{@link fhiRCore.dataTypes.Meta#getSource <em>Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' containment reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Uri value);

	/**
	 * Returns the value of the '<em><b>Profile</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.resources.StructureDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Profile</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Profile</em>' containment reference list.
	 * @see fhiRCore.dataTypes.DataTypesPackage#getMeta_Profile()
	 * @model containment="true"
	 * @generated
	 */
	EList<StructureDefinition> getProfiles();

	/**
	 * Returns the value of the '<em><b>Security</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.Coding}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Security</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Security</em>' containment reference list.
	 * @see fhiRCore.dataTypes.DataTypesPackage#getMeta_Security()
	 * @model containment="true"
	 * @generated
	 */
	EList<Coding> getSecurities();

	/**
	 * Returns the value of the '<em><b>Tag</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.Coding}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tag</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tag</em>' containment reference list.
	 * @see fhiRCore.dataTypes.DataTypesPackage#getMeta_Tag()
	 * @model containment="true"
	 * @generated
	 */
	EList<Coding> getTags();

} // Meta
