/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.BackboneElement;
import fhiRCore.dataTypes.Uri;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Concept Map Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.ConceptMapGroup#getSource <em>Source</em>}</li>
 *   <li>{@link fhiRCore.resources.ConceptMapGroup#getSourceVersion <em>Source Version</em>}</li>
 *   <li>{@link fhiRCore.resources.ConceptMapGroup#getTarget <em>Target</em>}</li>
 *   <li>{@link fhiRCore.resources.ConceptMapGroup#getTargetVersion <em>Target Version</em>}</li>
 *   <li>{@link fhiRCore.resources.ConceptMapGroup#getElements <em>Element</em>}</li>
 *   <li>{@link fhiRCore.resources.ConceptMapGroup#getUnmapped <em>Unmapped</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getConceptMapGroup()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='ConceptMap_Group'"
 * @generated
 */
public interface ConceptMapGroup extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' containment reference.
	 * @see #setSource(Uri)
	 * @see fhiRCore.resources.ResourcesPackage#getConceptMapGroup_Source()
	 * @model containment="true"
	 * @generated
	 */
	Uri getSource();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ConceptMapGroup#getSource <em>Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' containment reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Uri value);

	/**
	 * Returns the value of the '<em><b>Source Version</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Version</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Version</em>' containment reference.
	 * @see #setSourceVersion(fhiRCore.dataTypes.String)
	 * @see fhiRCore.resources.ResourcesPackage#getConceptMapGroup_SourceVersion()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getSourceVersion();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ConceptMapGroup#getSourceVersion <em>Source Version</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Version</em>' containment reference.
	 * @see #getSourceVersion()
	 * @generated
	 */
	void setSourceVersion(fhiRCore.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' containment reference.
	 * @see #setTarget(Uri)
	 * @see fhiRCore.resources.ResourcesPackage#getConceptMapGroup_Target()
	 * @model containment="true"
	 * @generated
	 */
	Uri getTarget();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ConceptMapGroup#getTarget <em>Target</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' containment reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Uri value);

	/**
	 * Returns the value of the '<em><b>Target Version</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Version</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Version</em>' containment reference.
	 * @see #setTargetVersion(fhiRCore.dataTypes.String)
	 * @see fhiRCore.resources.ResourcesPackage#getConceptMapGroup_TargetVersion()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getTargetVersion();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ConceptMapGroup#getTargetVersion <em>Target Version</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Version</em>' containment reference.
	 * @see #getTargetVersion()
	 * @generated
	 */
	void setTargetVersion(fhiRCore.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Element</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.resources.ConceptMapGroupSourceElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getConceptMapGroup_Element()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ConceptMapGroupSourceElement> getElements();

	/**
	 * Returns the value of the '<em><b>Unmapped</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unmapped</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unmapped</em>' containment reference.
	 * @see #setUnmapped(ConceptMapGroupUnmapped)
	 * @see fhiRCore.resources.ResourcesPackage#getConceptMapGroup_Unmapped()
	 * @model containment="true"
	 * @generated
	 */
	ConceptMapGroupUnmapped getUnmapped();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ConceptMapGroup#getUnmapped <em>Unmapped</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unmapped</em>' containment reference.
	 * @see #getUnmapped()
	 * @generated
	 */
	void setUnmapped(ConceptMapGroupUnmapped value);

} // ConceptMapGroup
