/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.BackboneElement;
import fhiRCore.dataTypes.DateTime;
import fhiRCore.dataTypes.Uri;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Value Set Expansion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.ValueSetExpansion#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link fhiRCore.resources.ValueSetExpansion#getTimestamp <em>Timestamp</em>}</li>
 *   <li>{@link fhiRCore.resources.ValueSetExpansion#getTotal <em>Total</em>}</li>
 *   <li>{@link fhiRCore.resources.ValueSetExpansion#getOffset <em>Offset</em>}</li>
 *   <li>{@link fhiRCore.resources.ValueSetExpansion#getParameters <em>Parameter</em>}</li>
 *   <li>{@link fhiRCore.resources.ValueSetExpansion#getContains <em>Contains</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getValueSetExpansion()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='ValueSet_Expansion'"
 * @generated
 */
public interface ValueSetExpansion extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Identifier</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference.
	 * @see #setIdentifier(Uri)
	 * @see fhiRCore.resources.ResourcesPackage#getValueSetExpansion_Identifier()
	 * @model containment="true"
	 * @generated
	 */
	Uri getIdentifier();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ValueSetExpansion#getIdentifier <em>Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identifier</em>' containment reference.
	 * @see #getIdentifier()
	 * @generated
	 */
	void setIdentifier(Uri value);

	/**
	 * Returns the value of the '<em><b>Timestamp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Timestamp</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timestamp</em>' containment reference.
	 * @see #setTimestamp(DateTime)
	 * @see fhiRCore.resources.ResourcesPackage#getValueSetExpansion_Timestamp()
	 * @model containment="true" required="true"
	 * @generated
	 */
	DateTime getTimestamp();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ValueSetExpansion#getTimestamp <em>Timestamp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timestamp</em>' containment reference.
	 * @see #getTimestamp()
	 * @generated
	 */
	void setTimestamp(DateTime value);

	/**
	 * Returns the value of the '<em><b>Total</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Total</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total</em>' containment reference.
	 * @see #setTotal(fhiRCore.dataTypes.Integer)
	 * @see fhiRCore.resources.ResourcesPackage#getValueSetExpansion_Total()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.Integer getTotal();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ValueSetExpansion#getTotal <em>Total</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total</em>' containment reference.
	 * @see #getTotal()
	 * @generated
	 */
	void setTotal(fhiRCore.dataTypes.Integer value);

	/**
	 * Returns the value of the '<em><b>Offset</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Offset</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Offset</em>' containment reference.
	 * @see #setOffset(fhiRCore.dataTypes.Integer)
	 * @see fhiRCore.resources.ResourcesPackage#getValueSetExpansion_Offset()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.Integer getOffset();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ValueSetExpansion#getOffset <em>Offset</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Offset</em>' containment reference.
	 * @see #getOffset()
	 * @generated
	 */
	void setOffset(fhiRCore.dataTypes.Integer value);

	/**
	 * Returns the value of the '<em><b>Parameter</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.resources.ValueSetExpansionParameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameter</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getValueSetExpansion_Parameter()
	 * @model containment="true"
	 * @generated
	 */
	EList<ValueSetExpansionParameter> getParameters();

	/**
	 * Returns the value of the '<em><b>Contains</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.resources.ValueSetExpansionContains}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contains</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contains</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getValueSetExpansion_Contains()
	 * @model containment="true"
	 * @generated
	 */
	EList<ValueSetExpansionContains> getContains();

} // ValueSetExpansion
