/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.BackboneElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Effect Evidence Synthesis Sample Size</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.EffectEvidenceSynthesisSampleSize#getDescription <em>Description</em>}</li>
 *   <li>{@link fhiRCore.resources.EffectEvidenceSynthesisSampleSize#getNumberOfStudies <em>Number Of Studies</em>}</li>
 *   <li>{@link fhiRCore.resources.EffectEvidenceSynthesisSampleSize#getNumberOfParticipants <em>Number Of Participants</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getEffectEvidenceSynthesisSampleSize()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='EffectEvidenceSynthesis_SampleSize'"
 * @generated
 */
public interface EffectEvidenceSynthesisSampleSize extends BackboneElement {
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
	 * @see fhiRCore.resources.ResourcesPackage#getEffectEvidenceSynthesisSampleSize_Description()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getDescription();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.EffectEvidenceSynthesisSampleSize#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(fhiRCore.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Number Of Studies</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number Of Studies</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Of Studies</em>' containment reference.
	 * @see #setNumberOfStudies(fhiRCore.dataTypes.Integer)
	 * @see fhiRCore.resources.ResourcesPackage#getEffectEvidenceSynthesisSampleSize_NumberOfStudies()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.Integer getNumberOfStudies();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.EffectEvidenceSynthesisSampleSize#getNumberOfStudies <em>Number Of Studies</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Studies</em>' containment reference.
	 * @see #getNumberOfStudies()
	 * @generated
	 */
	void setNumberOfStudies(fhiRCore.dataTypes.Integer value);

	/**
	 * Returns the value of the '<em><b>Number Of Participants</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number Of Participants</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Of Participants</em>' containment reference.
	 * @see #setNumberOfParticipants(fhiRCore.dataTypes.Integer)
	 * @see fhiRCore.resources.ResourcesPackage#getEffectEvidenceSynthesisSampleSize_NumberOfParticipants()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.Integer getNumberOfParticipants();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.EffectEvidenceSynthesisSampleSize#getNumberOfParticipants <em>Number Of Participants</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Participants</em>' containment reference.
	 * @see #getNumberOfParticipants()
	 * @generated
	 */
	void setNumberOfParticipants(fhiRCore.dataTypes.Integer value);

} // EffectEvidenceSynthesisSampleSize
