/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.Attachment;
import fhiRCore.dataTypes.BackboneElement;
import fhiRCore.dataTypes.Coding;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document Reference Content</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.DocumentReferenceContent#getAttachment <em>Attachment</em>}</li>
 *   <li>{@link fhiRCore.resources.DocumentReferenceContent#getFormat <em>Format</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getDocumentReferenceContent()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='DocumentReference_Content'"
 * @generated
 */
public interface DocumentReferenceContent extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Attachment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attachment</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attachment</em>' containment reference.
	 * @see #setAttachment(Attachment)
	 * @see fhiRCore.resources.ResourcesPackage#getDocumentReferenceContent_Attachment()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Attachment getAttachment();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.DocumentReferenceContent#getAttachment <em>Attachment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attachment</em>' containment reference.
	 * @see #getAttachment()
	 * @generated
	 */
	void setAttachment(Attachment value);

	/**
	 * Returns the value of the '<em><b>Format</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Format</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Format</em>' containment reference.
	 * @see #setFormat(Coding)
	 * @see fhiRCore.resources.ResourcesPackage#getDocumentReferenceContent_Format()
	 * @model containment="true"
	 * @generated
	 */
	Coding getFormat();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.DocumentReferenceContent#getFormat <em>Format</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Format</em>' containment reference.
	 * @see #getFormat()
	 * @generated
	 */
	void setFormat(Coding value);

} // DocumentReferenceContent
