/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.BackboneElement;
import fhiRCore.dataTypes.Coding;
import fhiRCore.dataTypes.Reference;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Audit Event Source</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.AuditEventSource#getSite <em>Site</em>}</li>
 *   <li>{@link fhiRCore.resources.AuditEventSource#getObserver <em>Observer</em>}</li>
 *   <li>{@link fhiRCore.resources.AuditEventSource#getTypes <em>Type</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getAuditEventSource()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='AuditEvent_Source'"
 * @generated
 */
public interface AuditEventSource extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Site</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Site</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Site</em>' containment reference.
	 * @see #setSite(fhiRCore.dataTypes.String)
	 * @see fhiRCore.resources.ResourcesPackage#getAuditEventSource_Site()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getSite();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.AuditEventSource#getSite <em>Site</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Site</em>' containment reference.
	 * @see #getSite()
	 * @generated
	 */
	void setSite(fhiRCore.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Observer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Observer</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Observer</em>' containment reference.
	 * @see #setObserver(Reference)
	 * @see fhiRCore.resources.ResourcesPackage#getAuditEventSource_Observer()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Reference getObserver();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.AuditEventSource#getObserver <em>Observer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Observer</em>' containment reference.
	 * @see #getObserver()
	 * @generated
	 */
	void setObserver(Reference value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.Coding}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getAuditEventSource_Type()
	 * @model containment="true"
	 * @generated
	 */
	EList<Coding> getTypes();

} // AuditEventSource
