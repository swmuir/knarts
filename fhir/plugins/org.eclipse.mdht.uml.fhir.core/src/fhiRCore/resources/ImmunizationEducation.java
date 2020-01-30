/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.BackboneElement;
import fhiRCore.dataTypes.DateTime;
import fhiRCore.dataTypes.Uri;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Immunization Education</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.ImmunizationEducation#getDocumentType <em>Document Type</em>}</li>
 *   <li>{@link fhiRCore.resources.ImmunizationEducation#getReference <em>Reference</em>}</li>
 *   <li>{@link fhiRCore.resources.ImmunizationEducation#getPublicationDate <em>Publication Date</em>}</li>
 *   <li>{@link fhiRCore.resources.ImmunizationEducation#getPresentationDate <em>Presentation Date</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getImmunizationEducation()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Immunization_Education'"
 * @generated
 */
public interface ImmunizationEducation extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Document Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Document Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Document Type</em>' containment reference.
	 * @see #setDocumentType(fhiRCore.dataTypes.String)
	 * @see fhiRCore.resources.ResourcesPackage#getImmunizationEducation_DocumentType()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getDocumentType();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ImmunizationEducation#getDocumentType <em>Document Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Document Type</em>' containment reference.
	 * @see #getDocumentType()
	 * @generated
	 */
	void setDocumentType(fhiRCore.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reference</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference</em>' containment reference.
	 * @see #setReference(Uri)
	 * @see fhiRCore.resources.ResourcesPackage#getImmunizationEducation_Reference()
	 * @model containment="true"
	 * @generated
	 */
	Uri getReference();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ImmunizationEducation#getReference <em>Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference</em>' containment reference.
	 * @see #getReference()
	 * @generated
	 */
	void setReference(Uri value);

	/**
	 * Returns the value of the '<em><b>Publication Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Publication Date</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Publication Date</em>' containment reference.
	 * @see #setPublicationDate(DateTime)
	 * @see fhiRCore.resources.ResourcesPackage#getImmunizationEducation_PublicationDate()
	 * @model containment="true"
	 * @generated
	 */
	DateTime getPublicationDate();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ImmunizationEducation#getPublicationDate <em>Publication Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Publication Date</em>' containment reference.
	 * @see #getPublicationDate()
	 * @generated
	 */
	void setPublicationDate(DateTime value);

	/**
	 * Returns the value of the '<em><b>Presentation Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Presentation Date</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Presentation Date</em>' containment reference.
	 * @see #setPresentationDate(DateTime)
	 * @see fhiRCore.resources.ResourcesPackage#getImmunizationEducation_PresentationDate()
	 * @model containment="true"
	 * @generated
	 */
	DateTime getPresentationDate();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ImmunizationEducation#getPresentationDate <em>Presentation Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Presentation Date</em>' containment reference.
	 * @see #getPresentationDate()
	 * @generated
	 */
	void setPresentationDate(DateTime value);

} // ImmunizationEducation
