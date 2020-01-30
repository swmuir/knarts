/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.BackboneElement;
import fhiRCore.dataTypes.Code;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Terminology Capabilities Code System Version Filter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.TerminologyCapabilitiesCodeSystemVersionFilter#getCode <em>Code</em>}</li>
 *   <li>{@link fhiRCore.resources.TerminologyCapabilitiesCodeSystemVersionFilter#getOps <em>Op</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getTerminologyCapabilitiesCodeSystemVersionFilter()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Version_Filter'"
 * @generated
 */
public interface TerminologyCapabilitiesCodeSystemVersionFilter extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' containment reference.
	 * @see #setCode(Code)
	 * @see fhiRCore.resources.ResourcesPackage#getTerminologyCapabilitiesCodeSystemVersionFilter_Code()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Code getCode();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.TerminologyCapabilitiesCodeSystemVersionFilter#getCode <em>Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' containment reference.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(Code value);

	/**
	 * Returns the value of the '<em><b>Op</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.Code}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Op</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Op</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getTerminologyCapabilitiesCodeSystemVersionFilter_Op()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Code> getOps();

} // TerminologyCapabilitiesCodeSystemVersionFilter
