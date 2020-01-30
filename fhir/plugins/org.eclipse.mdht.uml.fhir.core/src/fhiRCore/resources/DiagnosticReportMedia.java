/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.BackboneElement;
import fhiRCore.dataTypes.Reference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Diagnostic Report Media</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.DiagnosticReportMedia#getComment <em>Comment</em>}</li>
 *   <li>{@link fhiRCore.resources.DiagnosticReportMedia#getLink <em>Link</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getDiagnosticReportMedia()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='DiagnosticReport_Media'"
 * @generated
 */
public interface DiagnosticReportMedia extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Comment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comment</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comment</em>' containment reference.
	 * @see #setComment(fhiRCore.dataTypes.String)
	 * @see fhiRCore.resources.ResourcesPackage#getDiagnosticReportMedia_Comment()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getComment();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.DiagnosticReportMedia#getComment <em>Comment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comment</em>' containment reference.
	 * @see #getComment()
	 * @generated
	 */
	void setComment(fhiRCore.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Link</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Link</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link</em>' containment reference.
	 * @see #setLink(Reference)
	 * @see fhiRCore.resources.ResourcesPackage#getDiagnosticReportMedia_Link()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Reference getLink();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.DiagnosticReportMedia#getLink <em>Link</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Link</em>' containment reference.
	 * @see #getLink()
	 * @generated
	 */
	void setLink(Reference value);

} // DiagnosticReportMedia
