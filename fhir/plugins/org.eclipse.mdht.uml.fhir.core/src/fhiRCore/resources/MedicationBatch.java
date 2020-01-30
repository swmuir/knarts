/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.BackboneElement;
import fhiRCore.dataTypes.DateTime;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Medication Batch</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.MedicationBatch#getLotNumber <em>Lot Number</em>}</li>
 *   <li>{@link fhiRCore.resources.MedicationBatch#getExpirationDate <em>Expiration Date</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getMedicationBatch()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Medication_Batch'"
 * @generated
 */
public interface MedicationBatch extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Lot Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lot Number</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lot Number</em>' containment reference.
	 * @see #setLotNumber(fhiRCore.dataTypes.String)
	 * @see fhiRCore.resources.ResourcesPackage#getMedicationBatch_LotNumber()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getLotNumber();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.MedicationBatch#getLotNumber <em>Lot Number</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lot Number</em>' containment reference.
	 * @see #getLotNumber()
	 * @generated
	 */
	void setLotNumber(fhiRCore.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Expiration Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expiration Date</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expiration Date</em>' containment reference.
	 * @see #setExpirationDate(DateTime)
	 * @see fhiRCore.resources.ResourcesPackage#getMedicationBatch_ExpirationDate()
	 * @model containment="true"
	 * @generated
	 */
	DateTime getExpirationDate();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.MedicationBatch#getExpirationDate <em>Expiration Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expiration Date</em>' containment reference.
	 * @see #getExpirationDate()
	 * @generated
	 */
	void setExpirationDate(DateTime value);

} // MedicationBatch
