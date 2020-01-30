/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.BackboneElement;
import fhiRCore.dataTypes.Uri;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Value Set Compose Concept Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.ValueSetComposeConceptSet#getSystem <em>System</em>}</li>
 *   <li>{@link fhiRCore.resources.ValueSetComposeConceptSet#getVersion <em>Version</em>}</li>
 *   <li>{@link fhiRCore.resources.ValueSetComposeConceptSet#getConcepts <em>Concept</em>}</li>
 *   <li>{@link fhiRCore.resources.ValueSetComposeConceptSet#getFilters <em>Filter</em>}</li>
 *   <li>{@link fhiRCore.resources.ValueSetComposeConceptSet#getValueSets <em>Value Set</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getValueSetComposeConceptSet()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Compose_ConceptSet'"
 * @generated
 */
public interface ValueSetComposeConceptSet extends BackboneElement {
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
	 * @see fhiRCore.resources.ResourcesPackage#getValueSetComposeConceptSet_System()
	 * @model containment="true"
	 * @generated
	 */
	Uri getSystem();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ValueSetComposeConceptSet#getSystem <em>System</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System</em>' containment reference.
	 * @see #getSystem()
	 * @generated
	 */
	void setSystem(Uri value);

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
	 * @see fhiRCore.resources.ResourcesPackage#getValueSetComposeConceptSet_Version()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getVersion();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ValueSetComposeConceptSet#getVersion <em>Version</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' containment reference.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(fhiRCore.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Concept</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.resources.ValueSetComposeConceptSetConceptReference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Concept</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concept</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getValueSetComposeConceptSet_Concept()
	 * @model containment="true"
	 * @generated
	 */
	EList<ValueSetComposeConceptSetConceptReference> getConcepts();

	/**
	 * Returns the value of the '<em><b>Filter</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.resources.ValueSetComposeConceptSetFilter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Filter</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filter</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getValueSetComposeConceptSet_Filter()
	 * @model containment="true"
	 * @generated
	 */
	EList<ValueSetComposeConceptSetFilter> getFilters();

	/**
	 * Returns the value of the '<em><b>Value Set</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.resources.ValueSet}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Set</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Set</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getValueSetComposeConceptSet_ValueSet()
	 * @model containment="true"
	 * @generated
	 */
	EList<ValueSet> getValueSets();

} // ValueSetComposeConceptSet
