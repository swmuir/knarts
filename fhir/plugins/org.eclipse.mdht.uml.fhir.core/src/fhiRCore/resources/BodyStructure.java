/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.Attachment;
import fhiRCore.dataTypes.CodeableConcept;
import fhiRCore.dataTypes.Identifier;
import fhiRCore.dataTypes.Reference;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Body Structure</b></em>'.
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
 *   <li>{@link fhiRCore.resources.BodyStructure#getIdentifiers <em>Identifier</em>}</li>
 *   <li>{@link fhiRCore.resources.BodyStructure#getActive <em>Active</em>}</li>
 *   <li>{@link fhiRCore.resources.BodyStructure#getMorphology <em>Morphology</em>}</li>
 *   <li>{@link fhiRCore.resources.BodyStructure#getLocation <em>Location</em>}</li>
 *   <li>{@link fhiRCore.resources.BodyStructure#getLocationQualifiers <em>Location Qualifier</em>}</li>
 *   <li>{@link fhiRCore.resources.BodyStructure#getDescription <em>Description</em>}</li>
 *   <li>{@link fhiRCore.resources.BodyStructure#getImages <em>Image</em>}</li>
 *   <li>{@link fhiRCore.resources.BodyStructure#getPatient <em>Patient</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getBodyStructure()
 * @model
 * @generated
 */
public interface BodyStructure extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.Identifier}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Identifier</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getBodyStructure_Identifier()
	 * @model containment="true"
	 * @generated
	 */
	EList<Identifier> getIdentifiers();

	/**
	 * Returns the value of the '<em><b>Active</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Active</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Active</em>' containment reference.
	 * @see #setActive(fhiRCore.dataTypes.Boolean)
	 * @see fhiRCore.resources.ResourcesPackage#getBodyStructure_Active()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.Boolean getActive();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.BodyStructure#getActive <em>Active</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Active</em>' containment reference.
	 * @see #getActive()
	 * @generated
	 */
	void setActive(fhiRCore.dataTypes.Boolean value);

	/**
	 * Returns the value of the '<em><b>Morphology</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Morphology</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Morphology</em>' containment reference.
	 * @see #setMorphology(CodeableConcept)
	 * @see fhiRCore.resources.ResourcesPackage#getBodyStructure_Morphology()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getMorphology();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.BodyStructure#getMorphology <em>Morphology</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Morphology</em>' containment reference.
	 * @see #getMorphology()
	 * @generated
	 */
	void setMorphology(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Location</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' containment reference.
	 * @see #setLocation(CodeableConcept)
	 * @see fhiRCore.resources.ResourcesPackage#getBodyStructure_Location()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getLocation();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.BodyStructure#getLocation <em>Location</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' containment reference.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Location Qualifier</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Location Qualifier</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location Qualifier</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getBodyStructure_LocationQualifier()
	 * @model containment="true"
	 * @generated
	 */
	EList<CodeableConcept> getLocationQualifiers();

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
	 * @see fhiRCore.resources.ResourcesPackage#getBodyStructure_Description()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getDescription();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.BodyStructure#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(fhiRCore.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Image</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.Attachment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Image</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Image</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getBodyStructure_Image()
	 * @model containment="true"
	 * @generated
	 */
	EList<Attachment> getImages();

	/**
	 * Returns the value of the '<em><b>Patient</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Patient</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Patient</em>' containment reference.
	 * @see #setPatient(Reference)
	 * @see fhiRCore.resources.ResourcesPackage#getBodyStructure_Patient()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Reference getPatient();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.BodyStructure#getPatient <em>Patient</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Patient</em>' containment reference.
	 * @see #getPatient()
	 * @generated
	 */
	void setPatient(Reference value);

} // BodyStructure
