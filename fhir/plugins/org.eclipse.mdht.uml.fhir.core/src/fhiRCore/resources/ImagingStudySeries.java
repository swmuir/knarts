/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.BackboneElement;
import fhiRCore.dataTypes.Coding;
import fhiRCore.dataTypes.DateTime;
import fhiRCore.dataTypes.Id;
import fhiRCore.dataTypes.Reference;
import fhiRCore.dataTypes.UnsignedInt;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Imaging Study Series</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.ImagingStudySeries#getUid <em>Uid</em>}</li>
 *   <li>{@link fhiRCore.resources.ImagingStudySeries#getNumber <em>Number</em>}</li>
 *   <li>{@link fhiRCore.resources.ImagingStudySeries#getModality <em>Modality</em>}</li>
 *   <li>{@link fhiRCore.resources.ImagingStudySeries#getDescription <em>Description</em>}</li>
 *   <li>{@link fhiRCore.resources.ImagingStudySeries#getNumberOfInstances <em>Number Of Instances</em>}</li>
 *   <li>{@link fhiRCore.resources.ImagingStudySeries#getEndpoints <em>Endpoint</em>}</li>
 *   <li>{@link fhiRCore.resources.ImagingStudySeries#getBodySite <em>Body Site</em>}</li>
 *   <li>{@link fhiRCore.resources.ImagingStudySeries#getLaterality <em>Laterality</em>}</li>
 *   <li>{@link fhiRCore.resources.ImagingStudySeries#getSpecimens <em>Specimen</em>}</li>
 *   <li>{@link fhiRCore.resources.ImagingStudySeries#getStarted <em>Started</em>}</li>
 *   <li>{@link fhiRCore.resources.ImagingStudySeries#getPerformers <em>Performer</em>}</li>
 *   <li>{@link fhiRCore.resources.ImagingStudySeries#getInstances <em>Instance</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getImagingStudySeries()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='ImagingStudy_Series'"
 * @generated
 */
public interface ImagingStudySeries extends BackboneElement {
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
	 * @see fhiRCore.resources.ResourcesPackage#getImagingStudySeries_Uid()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Id getUid();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ImagingStudySeries#getUid <em>Uid</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uid</em>' containment reference.
	 * @see #getUid()
	 * @generated
	 */
	void setUid(Id value);

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
	 * @see fhiRCore.resources.ResourcesPackage#getImagingStudySeries_Number()
	 * @model containment="true"
	 * @generated
	 */
	UnsignedInt getNumber();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ImagingStudySeries#getNumber <em>Number</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number</em>' containment reference.
	 * @see #getNumber()
	 * @generated
	 */
	void setNumber(UnsignedInt value);

	/**
	 * Returns the value of the '<em><b>Modality</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modality</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modality</em>' containment reference.
	 * @see #setModality(Coding)
	 * @see fhiRCore.resources.ResourcesPackage#getImagingStudySeries_Modality()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Coding getModality();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ImagingStudySeries#getModality <em>Modality</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modality</em>' containment reference.
	 * @see #getModality()
	 * @generated
	 */
	void setModality(Coding value);

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
	 * @see fhiRCore.resources.ResourcesPackage#getImagingStudySeries_Description()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getDescription();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ImagingStudySeries#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(fhiRCore.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Number Of Instances</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number Of Instances</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Of Instances</em>' containment reference.
	 * @see #setNumberOfInstances(UnsignedInt)
	 * @see fhiRCore.resources.ResourcesPackage#getImagingStudySeries_NumberOfInstances()
	 * @model containment="true"
	 * @generated
	 */
	UnsignedInt getNumberOfInstances();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ImagingStudySeries#getNumberOfInstances <em>Number Of Instances</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Instances</em>' containment reference.
	 * @see #getNumberOfInstances()
	 * @generated
	 */
	void setNumberOfInstances(UnsignedInt value);

	/**
	 * Returns the value of the '<em><b>Endpoint</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.Reference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Endpoint</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Endpoint</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getImagingStudySeries_Endpoint()
	 * @model containment="true"
	 * @generated
	 */
	EList<Reference> getEndpoints();

	/**
	 * Returns the value of the '<em><b>Body Site</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Body Site</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body Site</em>' containment reference.
	 * @see #setBodySite(Coding)
	 * @see fhiRCore.resources.ResourcesPackage#getImagingStudySeries_BodySite()
	 * @model containment="true"
	 * @generated
	 */
	Coding getBodySite();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ImagingStudySeries#getBodySite <em>Body Site</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body Site</em>' containment reference.
	 * @see #getBodySite()
	 * @generated
	 */
	void setBodySite(Coding value);

	/**
	 * Returns the value of the '<em><b>Laterality</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Laterality</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Laterality</em>' containment reference.
	 * @see #setLaterality(Coding)
	 * @see fhiRCore.resources.ResourcesPackage#getImagingStudySeries_Laterality()
	 * @model containment="true"
	 * @generated
	 */
	Coding getLaterality();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ImagingStudySeries#getLaterality <em>Laterality</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Laterality</em>' containment reference.
	 * @see #getLaterality()
	 * @generated
	 */
	void setLaterality(Coding value);

	/**
	 * Returns the value of the '<em><b>Specimen</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.Reference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Specimen</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specimen</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getImagingStudySeries_Specimen()
	 * @model containment="true"
	 * @generated
	 */
	EList<Reference> getSpecimens();

	/**
	 * Returns the value of the '<em><b>Started</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Started</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Started</em>' containment reference.
	 * @see #setStarted(DateTime)
	 * @see fhiRCore.resources.ResourcesPackage#getImagingStudySeries_Started()
	 * @model containment="true"
	 * @generated
	 */
	DateTime getStarted();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ImagingStudySeries#getStarted <em>Started</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Started</em>' containment reference.
	 * @see #getStarted()
	 * @generated
	 */
	void setStarted(DateTime value);

	/**
	 * Returns the value of the '<em><b>Performer</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.resources.ImagingStudySeriesPerformer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Performer</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Performer</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getImagingStudySeries_Performer()
	 * @model containment="true"
	 * @generated
	 */
	EList<ImagingStudySeriesPerformer> getPerformers();

	/**
	 * Returns the value of the '<em><b>Instance</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.resources.ImagingStudySeriesInstance}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instance</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instance</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getImagingStudySeries_Instance()
	 * @model containment="true"
	 * @generated
	 */
	EList<ImagingStudySeriesInstance> getInstances();

} // ImagingStudySeries
