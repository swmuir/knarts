/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.BackboneElement;
import fhiRCore.dataTypes.Code;
import fhiRCore.dataTypes.CodeableConcept;
import fhiRCore.dataTypes.Narrative;
import fhiRCore.dataTypes.Reference;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composition Section</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.CompositionSection#getTitle <em>Title</em>}</li>
 *   <li>{@link fhiRCore.resources.CompositionSection#getCode <em>Code</em>}</li>
 *   <li>{@link fhiRCore.resources.CompositionSection#getAuthors <em>Author</em>}</li>
 *   <li>{@link fhiRCore.resources.CompositionSection#getFocus <em>Focus</em>}</li>
 *   <li>{@link fhiRCore.resources.CompositionSection#getText <em>Text</em>}</li>
 *   <li>{@link fhiRCore.resources.CompositionSection#getMode <em>Mode</em>}</li>
 *   <li>{@link fhiRCore.resources.CompositionSection#getOrderedBy <em>Ordered By</em>}</li>
 *   <li>{@link fhiRCore.resources.CompositionSection#getEntries <em>Entry</em>}</li>
 *   <li>{@link fhiRCore.resources.CompositionSection#getEmptyReason <em>Empty Reason</em>}</li>
 *   <li>{@link fhiRCore.resources.CompositionSection#getSections <em>Section</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getCompositionSection()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Composition_Section'"
 * @generated
 */
public interface CompositionSection extends BackboneElement {
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
	 * @see fhiRCore.resources.ResourcesPackage#getCompositionSection_Title()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getTitle();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.CompositionSection#getTitle <em>Title</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' containment reference.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(fhiRCore.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' containment reference.
	 * @see #setCode(CodeableConcept)
	 * @see fhiRCore.resources.ResourcesPackage#getCompositionSection_Code()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getCode();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.CompositionSection#getCode <em>Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' containment reference.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Author</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.Reference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Author</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Author</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getCompositionSection_Author()
	 * @model containment="true"
	 * @generated
	 */
	EList<Reference> getAuthors();

	/**
	 * Returns the value of the '<em><b>Focus</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Focus</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Focus</em>' containment reference.
	 * @see #setFocus(Reference)
	 * @see fhiRCore.resources.ResourcesPackage#getCompositionSection_Focus()
	 * @model containment="true"
	 * @generated
	 */
	Reference getFocus();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.CompositionSection#getFocus <em>Focus</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Focus</em>' containment reference.
	 * @see #getFocus()
	 * @generated
	 */
	void setFocus(Reference value);

	/**
	 * Returns the value of the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' containment reference.
	 * @see #setText(Narrative)
	 * @see fhiRCore.resources.ResourcesPackage#getCompositionSection_Text()
	 * @model containment="true"
	 * @generated
	 */
	Narrative getText();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.CompositionSection#getText <em>Text</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' containment reference.
	 * @see #getText()
	 * @generated
	 */
	void setText(Narrative value);

	/**
	 * Returns the value of the '<em><b>Mode</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mode</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mode</em>' containment reference.
	 * @see #setMode(Code)
	 * @see fhiRCore.resources.ResourcesPackage#getCompositionSection_Mode()
	 * @model containment="true"
	 * @generated
	 */
	Code getMode();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.CompositionSection#getMode <em>Mode</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mode</em>' containment reference.
	 * @see #getMode()
	 * @generated
	 */
	void setMode(Code value);

	/**
	 * Returns the value of the '<em><b>Ordered By</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ordered By</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ordered By</em>' containment reference.
	 * @see #setOrderedBy(CodeableConcept)
	 * @see fhiRCore.resources.ResourcesPackage#getCompositionSection_OrderedBy()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getOrderedBy();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.CompositionSection#getOrderedBy <em>Ordered By</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ordered By</em>' containment reference.
	 * @see #getOrderedBy()
	 * @generated
	 */
	void setOrderedBy(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Entry</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.Reference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entry</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entry</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getCompositionSection_Entry()
	 * @model containment="true"
	 * @generated
	 */
	EList<Reference> getEntries();

	/**
	 * Returns the value of the '<em><b>Empty Reason</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Empty Reason</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Empty Reason</em>' containment reference.
	 * @see #setEmptyReason(CodeableConcept)
	 * @see fhiRCore.resources.ResourcesPackage#getCompositionSection_EmptyReason()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getEmptyReason();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.CompositionSection#getEmptyReason <em>Empty Reason</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Empty Reason</em>' containment reference.
	 * @see #getEmptyReason()
	 * @generated
	 */
	void setEmptyReason(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Section</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.resources.CompositionSection}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Section</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Section</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getCompositionSection_Section()
	 * @model containment="true"
	 * @generated
	 */
	EList<CompositionSection> getSections();

} // CompositionSection
