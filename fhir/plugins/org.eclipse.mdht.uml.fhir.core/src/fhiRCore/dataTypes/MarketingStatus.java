/**
 */
package fhiRCore.dataTypes;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Marketing Status</b></em>'.
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
 *   <li>{@link fhiRCore.dataTypes.MarketingStatus#getCountry <em>Country</em>}</li>
 *   <li>{@link fhiRCore.dataTypes.MarketingStatus#getJurisdiction <em>Jurisdiction</em>}</li>
 *   <li>{@link fhiRCore.dataTypes.MarketingStatus#getStatus <em>Status</em>}</li>
 *   <li>{@link fhiRCore.dataTypes.MarketingStatus#getDateRange <em>Date Range</em>}</li>
 *   <li>{@link fhiRCore.dataTypes.MarketingStatus#getRestoreDate <em>Restore Date</em>}</li>
 * </ul>
 *
 * @see fhiRCore.dataTypes.DataTypesPackage#getMarketingStatus()
 * @model
 * @generated
 */
public interface MarketingStatus extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Country</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Country</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Country</em>' containment reference.
	 * @see #setCountry(CodeableConcept)
	 * @see fhiRCore.dataTypes.DataTypesPackage#getMarketingStatus_Country()
	 * @model containment="true" required="true"
	 * @generated
	 */
	CodeableConcept getCountry();

	/**
	 * Sets the value of the '{@link fhiRCore.dataTypes.MarketingStatus#getCountry <em>Country</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Country</em>' containment reference.
	 * @see #getCountry()
	 * @generated
	 */
	void setCountry(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Jurisdiction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Jurisdiction</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jurisdiction</em>' containment reference.
	 * @see #setJurisdiction(CodeableConcept)
	 * @see fhiRCore.dataTypes.DataTypesPackage#getMarketingStatus_Jurisdiction()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getJurisdiction();

	/**
	 * Sets the value of the '{@link fhiRCore.dataTypes.MarketingStatus#getJurisdiction <em>Jurisdiction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Jurisdiction</em>' containment reference.
	 * @see #getJurisdiction()
	 * @generated
	 */
	void setJurisdiction(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' containment reference.
	 * @see #setStatus(CodeableConcept)
	 * @see fhiRCore.dataTypes.DataTypesPackage#getMarketingStatus_Status()
	 * @model containment="true" required="true"
	 * @generated
	 */
	CodeableConcept getStatus();

	/**
	 * Sets the value of the '{@link fhiRCore.dataTypes.MarketingStatus#getStatus <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' containment reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Date Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Range</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Range</em>' containment reference.
	 * @see #setDateRange(Period)
	 * @see fhiRCore.dataTypes.DataTypesPackage#getMarketingStatus_DateRange()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Period getDateRange();

	/**
	 * Sets the value of the '{@link fhiRCore.dataTypes.MarketingStatus#getDateRange <em>Date Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Range</em>' containment reference.
	 * @see #getDateRange()
	 * @generated
	 */
	void setDateRange(Period value);

	/**
	 * Returns the value of the '<em><b>Restore Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Restore Date</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Restore Date</em>' containment reference.
	 * @see #setRestoreDate(DateTime)
	 * @see fhiRCore.dataTypes.DataTypesPackage#getMarketingStatus_RestoreDate()
	 * @model containment="true"
	 * @generated
	 */
	DateTime getRestoreDate();

	/**
	 * Sets the value of the '{@link fhiRCore.dataTypes.MarketingStatus#getRestoreDate <em>Restore Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Restore Date</em>' containment reference.
	 * @see #getRestoreDate()
	 * @generated
	 */
	void setRestoreDate(DateTime value);

} // MarketingStatus
