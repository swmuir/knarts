/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.BackboneElement;
import fhiRCore.dataTypes.PositiveInt;
import fhiRCore.dataTypes.Reference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Claim Response Insurance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.ClaimResponseInsurance#getSequence <em>Sequence</em>}</li>
 *   <li>{@link fhiRCore.resources.ClaimResponseInsurance#getFocal <em>Focal</em>}</li>
 *   <li>{@link fhiRCore.resources.ClaimResponseInsurance#getCoverage <em>Coverage</em>}</li>
 *   <li>{@link fhiRCore.resources.ClaimResponseInsurance#getBusinessArrangement <em>Business Arrangement</em>}</li>
 *   <li>{@link fhiRCore.resources.ClaimResponseInsurance#getClaimResponse <em>Claim Response</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getClaimResponseInsurance()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='ClaimResponse_Insurance'"
 * @generated
 */
public interface ClaimResponseInsurance extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Sequence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sequence</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sequence</em>' containment reference.
	 * @see #setSequence(PositiveInt)
	 * @see fhiRCore.resources.ResourcesPackage#getClaimResponseInsurance_Sequence()
	 * @model containment="true" required="true"
	 * @generated
	 */
	PositiveInt getSequence();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ClaimResponseInsurance#getSequence <em>Sequence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sequence</em>' containment reference.
	 * @see #getSequence()
	 * @generated
	 */
	void setSequence(PositiveInt value);

	/**
	 * Returns the value of the '<em><b>Focal</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Focal</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Focal</em>' containment reference.
	 * @see #setFocal(fhiRCore.dataTypes.Boolean)
	 * @see fhiRCore.resources.ResourcesPackage#getClaimResponseInsurance_Focal()
	 * @model containment="true" required="true"
	 * @generated
	 */
	fhiRCore.dataTypes.Boolean getFocal();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ClaimResponseInsurance#getFocal <em>Focal</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Focal</em>' containment reference.
	 * @see #getFocal()
	 * @generated
	 */
	void setFocal(fhiRCore.dataTypes.Boolean value);

	/**
	 * Returns the value of the '<em><b>Coverage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Coverage</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Coverage</em>' containment reference.
	 * @see #setCoverage(Reference)
	 * @see fhiRCore.resources.ResourcesPackage#getClaimResponseInsurance_Coverage()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Reference getCoverage();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ClaimResponseInsurance#getCoverage <em>Coverage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coverage</em>' containment reference.
	 * @see #getCoverage()
	 * @generated
	 */
	void setCoverage(Reference value);

	/**
	 * Returns the value of the '<em><b>Business Arrangement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Business Arrangement</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Business Arrangement</em>' containment reference.
	 * @see #setBusinessArrangement(fhiRCore.dataTypes.String)
	 * @see fhiRCore.resources.ResourcesPackage#getClaimResponseInsurance_BusinessArrangement()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getBusinessArrangement();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ClaimResponseInsurance#getBusinessArrangement <em>Business Arrangement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Business Arrangement</em>' containment reference.
	 * @see #getBusinessArrangement()
	 * @generated
	 */
	void setBusinessArrangement(fhiRCore.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Claim Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Claim Response</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Claim Response</em>' containment reference.
	 * @see #setClaimResponse(Reference)
	 * @see fhiRCore.resources.ResourcesPackage#getClaimResponseInsurance_ClaimResponse()
	 * @model containment="true"
	 * @generated
	 */
	Reference getClaimResponse();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ClaimResponseInsurance#getClaimResponse <em>Claim Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Claim Response</em>' containment reference.
	 * @see #getClaimResponse()
	 * @generated
	 */
	void setClaimResponse(Reference value);

} // ClaimResponseInsurance
