/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.BackboneElement;
import fhiRCore.dataTypes.Code;
import fhiRCore.dataTypes.Uri;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Value Set Expansion Contains</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.ValueSetExpansionContains#getSystem <em>System</em>}</li>
 *   <li>{@link fhiRCore.resources.ValueSetExpansionContains#getAbstract <em>Abstract</em>}</li>
 *   <li>{@link fhiRCore.resources.ValueSetExpansionContains#getInactive <em>Inactive</em>}</li>
 *   <li>{@link fhiRCore.resources.ValueSetExpansionContains#getVersion <em>Version</em>}</li>
 *   <li>{@link fhiRCore.resources.ValueSetExpansionContains#getCode <em>Code</em>}</li>
 *   <li>{@link fhiRCore.resources.ValueSetExpansionContains#getDisplay <em>Display</em>}</li>
 *   <li>{@link fhiRCore.resources.ValueSetExpansionContains#getDesignations <em>Designation</em>}</li>
 *   <li>{@link fhiRCore.resources.ValueSetExpansionContains#getContains <em>Contains</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getValueSetExpansionContains()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Expansion_Contains'"
 * @generated
 */
public interface ValueSetExpansionContains extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>System</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>System</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System</em>' containment reference.
	 * @see #setSystem(Uri)
	 * @see fhiRCore.resources.ResourcesPackage#getValueSetExpansionContains_System()
	 * @model containment="true"
	 * @generated
	 */
	Uri getSystem();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ValueSetExpansionContains#getSystem <em>System</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System</em>' containment reference.
	 * @see #getSystem()
	 * @generated
	 */
	void setSystem(Uri value);

	/**
	 * Returns the value of the '<em><b>Abstract</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstract</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract</em>' containment reference.
	 * @see #setAbstract(fhiRCore.dataTypes.Boolean)
	 * @see fhiRCore.resources.ResourcesPackage#getValueSetExpansionContains_Abstract()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.Boolean getAbstract();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ValueSetExpansionContains#getAbstract <em>Abstract</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abstract</em>' containment reference.
	 * @see #getAbstract()
	 * @generated
	 */
	void setAbstract(fhiRCore.dataTypes.Boolean value);

	/**
	 * Returns the value of the '<em><b>Inactive</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inactive</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inactive</em>' containment reference.
	 * @see #setInactive(fhiRCore.dataTypes.Boolean)
	 * @see fhiRCore.resources.ResourcesPackage#getValueSetExpansionContains_Inactive()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.Boolean getInactive();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ValueSetExpansionContains#getInactive <em>Inactive</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inactive</em>' containment reference.
	 * @see #getInactive()
	 * @generated
	 */
	void setInactive(fhiRCore.dataTypes.Boolean value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' containment reference.
	 * @see #setVersion(fhiRCore.dataTypes.String)
	 * @see fhiRCore.resources.ResourcesPackage#getValueSetExpansionContains_Version()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getVersion();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ValueSetExpansionContains#getVersion <em>Version</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' containment reference.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(fhiRCore.dataTypes.String value);

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
	 * @see fhiRCore.resources.ResourcesPackage#getValueSetExpansionContains_Code()
	 * @model containment="true"
	 * @generated
	 */
	Code getCode();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ValueSetExpansionContains#getCode <em>Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' containment reference.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(Code value);

	/**
	 * Returns the value of the '<em><b>Display</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Display</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Display</em>' containment reference.
	 * @see #setDisplay(fhiRCore.dataTypes.String)
	 * @see fhiRCore.resources.ResourcesPackage#getValueSetExpansionContains_Display()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getDisplay();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ValueSetExpansionContains#getDisplay <em>Display</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Display</em>' containment reference.
	 * @see #getDisplay()
	 * @generated
	 */
	void setDisplay(fhiRCore.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Designation</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.resources.ValueSetComposeConceptSetConceptReferenceDesignation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Designation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Designation</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getValueSetExpansionContains_Designation()
	 * @model containment="true"
	 * @generated
	 */
	EList<ValueSetComposeConceptSetConceptReferenceDesignation> getDesignations();

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
	 * @see fhiRCore.resources.ResourcesPackage#getValueSetExpansionContains_Contains()
	 * @model containment="true"
	 * @generated
	 */
	EList<ValueSetExpansionContains> getContains();

} // ValueSetExpansionContains
