/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.Code;
import fhiRCore.dataTypes.Identifier;
import fhiRCore.dataTypes.Instant;
import fhiRCore.dataTypes.Signature;
import fhiRCore.dataTypes.UnsignedInt;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bundle</b></em>'.
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
 *   <li>{@link fhiRCore.resources.Bundle#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link fhiRCore.resources.Bundle#getType <em>Type</em>}</li>
 *   <li>{@link fhiRCore.resources.Bundle#getTimestamp <em>Timestamp</em>}</li>
 *   <li>{@link fhiRCore.resources.Bundle#getTotal <em>Total</em>}</li>
 *   <li>{@link fhiRCore.resources.Bundle#getLinks <em>Link</em>}</li>
 *   <li>{@link fhiRCore.resources.Bundle#getEntries <em>Entry</em>}</li>
 *   <li>{@link fhiRCore.resources.Bundle#getSignature <em>Signature</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getBundle()
 * @model
 * @generated
 */
public interface Bundle extends Resource {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Identifier</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference.
	 * @see #setIdentifier(Identifier)
	 * @see fhiRCore.resources.ResourcesPackage#getBundle_Identifier()
	 * @model containment="true"
	 * @generated
	 */
	Identifier getIdentifier();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.Bundle#getIdentifier <em>Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identifier</em>' containment reference.
	 * @see #getIdentifier()
	 * @generated
	 */
	void setIdentifier(Identifier value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(Code)
	 * @see fhiRCore.resources.ResourcesPackage#getBundle_Type()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Code getType();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.Bundle#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(Code value);

	/**
	 * Returns the value of the '<em><b>Timestamp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Timestamp</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timestamp</em>' containment reference.
	 * @see #setTimestamp(Instant)
	 * @see fhiRCore.resources.ResourcesPackage#getBundle_Timestamp()
	 * @model containment="true"
	 * @generated
	 */
	Instant getTimestamp();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.Bundle#getTimestamp <em>Timestamp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timestamp</em>' containment reference.
	 * @see #getTimestamp()
	 * @generated
	 */
	void setTimestamp(Instant value);

	/**
	 * Returns the value of the '<em><b>Total</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Total</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total</em>' containment reference.
	 * @see #setTotal(UnsignedInt)
	 * @see fhiRCore.resources.ResourcesPackage#getBundle_Total()
	 * @model containment="true"
	 * @generated
	 */
	UnsignedInt getTotal();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.Bundle#getTotal <em>Total</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total</em>' containment reference.
	 * @see #getTotal()
	 * @generated
	 */
	void setTotal(UnsignedInt value);

	/**
	 * Returns the value of the '<em><b>Link</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.resources.BundleLink}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Link</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getBundle_Link()
	 * @model containment="true"
	 * @generated
	 */
	EList<BundleLink> getLinks();

	/**
	 * Returns the value of the '<em><b>Entry</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.resources.BundleEntry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entry</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entry</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getBundle_Entry()
	 * @model containment="true"
	 * @generated
	 */
	EList<BundleEntry> getEntries();

	/**
	 * Returns the value of the '<em><b>Signature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Signature</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signature</em>' containment reference.
	 * @see #setSignature(Signature)
	 * @see fhiRCore.resources.ResourcesPackage#getBundle_Signature()
	 * @model containment="true"
	 * @generated
	 */
	Signature getSignature();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.Bundle#getSignature <em>Signature</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signature</em>' containment reference.
	 * @see #getSignature()
	 * @generated
	 */
	void setSignature(Signature value);

} // Bundle
