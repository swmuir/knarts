/**
 */
package org.eclipse.mdht.uml.cda;

import org.eclipse.emf.common.util.EList;

import org.eclipse.mdht.uml.hl7.datatypes.CS;
import org.eclipse.mdht.uml.hl7.datatypes.II;

import org.eclipse.mdht.uml.hl7.rim.ActRelationship;

import org.eclipse.mdht.uml.hl7.vocab.ActRelationshipFulfills;
import org.eclipse.mdht.uml.hl7.vocab.NullFlavor;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>In Fulfillment Of1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.cda.InFulfillmentOf1#getRealmCodes <em>Realm Code</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.cda.InFulfillmentOf1#getTypeId <em>Type Id</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.cda.InFulfillmentOf1#getTemplateIds <em>Template Id</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.cda.InFulfillmentOf1#getNullFlavor <em>Null Flavor</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.cda.InFulfillmentOf1#getTypeCode <em>Type Code</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.cda.InFulfillmentOf1#getActReference <em>Act Reference</em>}</li>
 * </ul>
 *
 * @see org.eclipse.mdht.uml.cda.CDAPackage#getInFulfillmentOf1()
 * @model
 * @generated
 */
public interface InFulfillmentOf1 extends ActRelationship {
	/**
	 * Returns the value of the '<em><b>Realm Code</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.mdht.uml.hl7.datatypes.CS}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Realm Code</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Realm Code</em>' containment reference list.
	 * @see org.eclipse.mdht.uml.cda.CDAPackage#getInFulfillmentOf1_RealmCode()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="namespace='urn:hl7-org:sdtc' kind='element'"
	 * @generated
	 */
	EList<CS> getRealmCodes();

	/**
	 * Returns the value of the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Id</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Id</em>' containment reference.
	 * @see #setTypeId(InfrastructureRootTypeId)
	 * @see org.eclipse.mdht.uml.cda.CDAPackage#getInFulfillmentOf1_TypeId()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="namespace='urn:hl7-org:sdtc' kind='element'"
	 * @generated
	 */
	InfrastructureRootTypeId getTypeId();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.cda.InFulfillmentOf1#getTypeId <em>Type Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Id</em>' containment reference.
	 * @see #getTypeId()
	 * @generated
	 */
	void setTypeId(InfrastructureRootTypeId value);

	/**
	 * Returns the value of the '<em><b>Template Id</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.mdht.uml.hl7.datatypes.II}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Template Id</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Template Id</em>' containment reference list.
	 * @see org.eclipse.mdht.uml.cda.CDAPackage#getInFulfillmentOf1_TemplateId()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="namespace='urn:hl7-org:sdtc' kind='element'"
	 * @generated
	 */
	EList<II> getTemplateIds();

	/**
	 * Returns the value of the '<em><b>Null Flavor</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.mdht.uml.hl7.vocab.NullFlavor}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Null Flavor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Null Flavor</em>' attribute.
	 * @see org.eclipse.mdht.uml.hl7.vocab.NullFlavor
	 * @see #setNullFlavor(NullFlavor)
	 * @see org.eclipse.mdht.uml.cda.CDAPackage#getInFulfillmentOf1_NullFlavor()
	 * @model ordered="false"
	 *        extendedMetaData="kind='element'"
	 * @generated
	 */
	NullFlavor getNullFlavor();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.cda.InFulfillmentOf1#getNullFlavor <em>Null Flavor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Null Flavor</em>' attribute.
	 * @see org.eclipse.mdht.uml.hl7.vocab.NullFlavor
	 * @see #getNullFlavor()
	 * @generated
	 */
	void setNullFlavor(NullFlavor value);

	/**
	 * Returns the value of the '<em><b>Type Code</b></em>' attribute.
	 * The default value is <code>"FLFS"</code>.
	 * The literals are from the enumeration {@link org.eclipse.mdht.uml.hl7.vocab.ActRelationshipFulfills}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Code</em>' attribute.
	 * @see org.eclipse.mdht.uml.hl7.vocab.ActRelationshipFulfills
	 * @see #isSetTypeCode()
	 * @see #unsetTypeCode()
	 * @see #setTypeCode(ActRelationshipFulfills)
	 * @see org.eclipse.mdht.uml.cda.CDAPackage#getInFulfillmentOf1_TypeCode()
	 * @model default="FLFS" unsettable="true" ordered="false"
	 * @generated
	 */
	ActRelationshipFulfills getTypeCode();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.cda.InFulfillmentOf1#getTypeCode <em>Type Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Code</em>' attribute.
	 * @see org.eclipse.mdht.uml.hl7.vocab.ActRelationshipFulfills
	 * @see #isSetTypeCode()
	 * @see #unsetTypeCode()
	 * @see #getTypeCode()
	 * @generated
	 */
	void setTypeCode(ActRelationshipFulfills value);

	/**
	 * Unsets the value of the '{@link org.eclipse.mdht.uml.cda.InFulfillmentOf1#getTypeCode <em>Type Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTypeCode()
	 * @see #getTypeCode()
	 * @see #setTypeCode(ActRelationshipFulfills)
	 * @generated
	 */
	void unsetTypeCode();

	/**
	 * Returns whether the value of the '{@link org.eclipse.mdht.uml.cda.InFulfillmentOf1#getTypeCode <em>Type Code</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type Code</em>' attribute is set.
	 * @see #unsetTypeCode()
	 * @see #getTypeCode()
	 * @see #setTypeCode(ActRelationshipFulfills)
	 * @generated
	 */
	boolean isSetTypeCode();

	/**
	 * Returns the value of the '<em><b>Act Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Act Reference</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Act Reference</em>' containment reference.
	 * @see #setActReference(ActReference)
	 * @see org.eclipse.mdht.uml.cda.CDAPackage#getInFulfillmentOf1_ActReference()
	 * @model containment="true" required="true" ordered="false"
	 *        extendedMetaData="namespace='urn:hl7-org:sdtc' kind='element'"
	 * @generated
	 */
	ActReference getActReference();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.cda.InFulfillmentOf1#getActReference <em>Act Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Act Reference</em>' containment reference.
	 * @see #getActReference()
	 * @generated
	 */
	void setActReference(ActReference value);

} // InFulfillmentOf1
