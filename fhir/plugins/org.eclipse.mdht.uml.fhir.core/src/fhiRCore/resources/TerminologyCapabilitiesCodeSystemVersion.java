/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.BackboneElement;
import fhiRCore.dataTypes.Code;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Terminology Capabilities Code System Version</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.TerminologyCapabilitiesCodeSystemVersion#getCode <em>Code</em>}</li>
 *   <li>{@link fhiRCore.resources.TerminologyCapabilitiesCodeSystemVersion#getIsDefault <em>Is Default</em>}</li>
 *   <li>{@link fhiRCore.resources.TerminologyCapabilitiesCodeSystemVersion#getCompositional <em>Compositional</em>}</li>
 *   <li>{@link fhiRCore.resources.TerminologyCapabilitiesCodeSystemVersion#getLanguages <em>Language</em>}</li>
 *   <li>{@link fhiRCore.resources.TerminologyCapabilitiesCodeSystemVersion#getFilters <em>Filter</em>}</li>
 *   <li>{@link fhiRCore.resources.TerminologyCapabilitiesCodeSystemVersion#getProperties <em>Property</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getTerminologyCapabilitiesCodeSystemVersion()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='CodeSystem_Version'"
 * @generated
 */
public interface TerminologyCapabilitiesCodeSystemVersion extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' containment reference.
	 * @see #setCode(fhiRCore.dataTypes.String)
	 * @see fhiRCore.resources.ResourcesPackage#getTerminologyCapabilitiesCodeSystemVersion_Code()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getCode();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.TerminologyCapabilitiesCodeSystemVersion#getCode <em>Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' containment reference.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(fhiRCore.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Is Default</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Default</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Default</em>' containment reference.
	 * @see #setIsDefault(fhiRCore.dataTypes.Boolean)
	 * @see fhiRCore.resources.ResourcesPackage#getTerminologyCapabilitiesCodeSystemVersion_IsDefault()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.Boolean getIsDefault();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.TerminologyCapabilitiesCodeSystemVersion#getIsDefault <em>Is Default</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Default</em>' containment reference.
	 * @see #getIsDefault()
	 * @generated
	 */
	void setIsDefault(fhiRCore.dataTypes.Boolean value);

	/**
	 * Returns the value of the '<em><b>Compositional</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Compositional</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compositional</em>' containment reference.
	 * @see #setCompositional(fhiRCore.dataTypes.Boolean)
	 * @see fhiRCore.resources.ResourcesPackage#getTerminologyCapabilitiesCodeSystemVersion_Compositional()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.Boolean getCompositional();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.TerminologyCapabilitiesCodeSystemVersion#getCompositional <em>Compositional</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Compositional</em>' containment reference.
	 * @see #getCompositional()
	 * @generated
	 */
	void setCompositional(fhiRCore.dataTypes.Boolean value);

	/**
	 * Returns the value of the '<em><b>Language</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.Code}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Language</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Language</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getTerminologyCapabilitiesCodeSystemVersion_Language()
	 * @model containment="true"
	 * @generated
	 */
	EList<Code> getLanguages();

	/**
	 * Returns the value of the '<em><b>Filter</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.resources.TerminologyCapabilitiesCodeSystemVersionFilter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Filter</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filter</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getTerminologyCapabilitiesCodeSystemVersion_Filter()
	 * @model containment="true"
	 * @generated
	 */
	EList<TerminologyCapabilitiesCodeSystemVersionFilter> getFilters();

	/**
	 * Returns the value of the '<em><b>Property</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.Code}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getTerminologyCapabilitiesCodeSystemVersion_Property()
	 * @model containment="true"
	 * @generated
	 */
	EList<Code> getProperties();

} // TerminologyCapabilitiesCodeSystemVersion
