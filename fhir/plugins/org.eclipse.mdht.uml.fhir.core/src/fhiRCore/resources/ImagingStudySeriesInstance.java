/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.BackboneElement;
import fhiRCore.dataTypes.Coding;
import fhiRCore.dataTypes.Id;
import fhiRCore.dataTypes.UnsignedInt;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Imaging Study Series Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.ImagingStudySeriesInstance#getUid <em>Uid</em>}</li>
 *   <li>{@link fhiRCore.resources.ImagingStudySeriesInstance#getSopClass <em>Sop Class</em>}</li>
 *   <li>{@link fhiRCore.resources.ImagingStudySeriesInstance#getNumber <em>Number</em>}</li>
 *   <li>{@link fhiRCore.resources.ImagingStudySeriesInstance#getTitle <em>Title</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getImagingStudySeriesInstance()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Series_Instance'"
 * @generated
 */
public interface ImagingStudySeriesInstance extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Uid</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uid</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uid</em>' containment reference.
	 * @see #setUid(Id)
	 * @see fhiRCore.resources.ResourcesPackage#getImagingStudySeriesInstance_Uid()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Id getUid();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ImagingStudySeriesInstance#getUid <em>Uid</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uid</em>' containment reference.
	 * @see #getUid()
	 * @generated
	 */
	void setUid(Id value);

	/**
	 * Returns the value of the '<em><b>Sop Class</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sop Class</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sop Class</em>' containment reference.
	 * @see #setSopClass(Coding)
	 * @see fhiRCore.resources.ResourcesPackage#getImagingStudySeriesInstance_SopClass()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Coding getSopClass();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ImagingStudySeriesInstance#getSopClass <em>Sop Class</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sop Class</em>' containment reference.
	 * @see #getSopClass()
	 * @generated
	 */
	void setSopClass(Coding value);

	/**
	 * Returns the value of the '<em><b>Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number</em>' containment reference.
	 * @see #setNumber(UnsignedInt)
	 * @see fhiRCore.resources.ResourcesPackage#getImagingStudySeriesInstance_Number()
	 * @model containment="true"
	 * @generated
	 */
	UnsignedInt getNumber();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ImagingStudySeriesInstance#getNumber <em>Number</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number</em>' containment reference.
	 * @see #getNumber()
	 * @generated
	 */
	void setNumber(UnsignedInt value);

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
	 * @see fhiRCore.resources.ResourcesPackage#getImagingStudySeriesInstance_Title()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getTitle();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ImagingStudySeriesInstance#getTitle <em>Title</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' containment reference.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(fhiRCore.dataTypes.String value);

} // ImagingStudySeriesInstance
