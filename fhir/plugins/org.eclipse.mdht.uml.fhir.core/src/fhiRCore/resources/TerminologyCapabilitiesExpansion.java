/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.BackboneElement;
import fhiRCore.dataTypes.Markdown;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Terminology Capabilities Expansion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.TerminologyCapabilitiesExpansion#getHierarchical <em>Hierarchical</em>}</li>
 *   <li>{@link fhiRCore.resources.TerminologyCapabilitiesExpansion#getPaging <em>Paging</em>}</li>
 *   <li>{@link fhiRCore.resources.TerminologyCapabilitiesExpansion#getIncomplete <em>Incomplete</em>}</li>
 *   <li>{@link fhiRCore.resources.TerminologyCapabilitiesExpansion#getParameters <em>Parameter</em>}</li>
 *   <li>{@link fhiRCore.resources.TerminologyCapabilitiesExpansion#getTextFilter <em>Text Filter</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getTerminologyCapabilitiesExpansion()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='TerminologyCapabilities_Expansion'"
 * @generated
 */
public interface TerminologyCapabilitiesExpansion extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Hierarchical</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hierarchical</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hierarchical</em>' containment reference.
	 * @see #setHierarchical(fhiRCore.dataTypes.Boolean)
	 * @see fhiRCore.resources.ResourcesPackage#getTerminologyCapabilitiesExpansion_Hierarchical()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.Boolean getHierarchical();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.TerminologyCapabilitiesExpansion#getHierarchical <em>Hierarchical</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hierarchical</em>' containment reference.
	 * @see #getHierarchical()
	 * @generated
	 */
	void setHierarchical(fhiRCore.dataTypes.Boolean value);

	/**
	 * Returns the value of the '<em><b>Paging</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Paging</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Paging</em>' containment reference.
	 * @see #setPaging(fhiRCore.dataTypes.Boolean)
	 * @see fhiRCore.resources.ResourcesPackage#getTerminologyCapabilitiesExpansion_Paging()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.Boolean getPaging();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.TerminologyCapabilitiesExpansion#getPaging <em>Paging</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Paging</em>' containment reference.
	 * @see #getPaging()
	 * @generated
	 */
	void setPaging(fhiRCore.dataTypes.Boolean value);

	/**
	 * Returns the value of the '<em><b>Incomplete</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incomplete</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incomplete</em>' containment reference.
	 * @see #setIncomplete(fhiRCore.dataTypes.Boolean)
	 * @see fhiRCore.resources.ResourcesPackage#getTerminologyCapabilitiesExpansion_Incomplete()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.Boolean getIncomplete();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.TerminologyCapabilitiesExpansion#getIncomplete <em>Incomplete</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Incomplete</em>' containment reference.
	 * @see #getIncomplete()
	 * @generated
	 */
	void setIncomplete(fhiRCore.dataTypes.Boolean value);

	/**
	 * Returns the value of the '<em><b>Parameter</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.resources.TerminologyCapabilitiesExpansionParameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameter</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getTerminologyCapabilitiesExpansion_Parameter()
	 * @model containment="true"
	 * @generated
	 */
	EList<TerminologyCapabilitiesExpansionParameter> getParameters();

	/**
	 * Returns the value of the '<em><b>Text Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text Filter</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text Filter</em>' containment reference.
	 * @see #setTextFilter(Markdown)
	 * @see fhiRCore.resources.ResourcesPackage#getTerminologyCapabilitiesExpansion_TextFilter()
	 * @model containment="true"
	 * @generated
	 */
	Markdown getTextFilter();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.TerminologyCapabilitiesExpansion#getTextFilter <em>Text Filter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text Filter</em>' containment reference.
	 * @see #getTextFilter()
	 * @generated
	 */
	void setTextFilter(Markdown value);

} // TerminologyCapabilitiesExpansion
