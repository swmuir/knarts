/**
 */
package org.hl7.knowledgeartifact.r2;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Artifact Type Type1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.knowledgeartifact.r2.ArtifactTypeType1#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.hl7.knowledgeartifact.r2.R2Package#getArtifactTypeType1()
 * @model extendedMetaData="name='artifactType_._1_._type' kind='empty'"
 * @generated
 */
public interface ArtifactTypeType1 extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The literals are from the enumeration {@link org.hl7.knowledgeartifact.r2.ArtifactType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see org.hl7.knowledgeartifact.r2.ArtifactType
	 * @see #isSetValue()
	 * @see #unsetValue()
	 * @see #setValue(ArtifactType)
	 * @see org.hl7.knowledgeartifact.r2.R2Package#getArtifactTypeType1_Value()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='attribute' name='value'"
	 * @generated
	 */
	ArtifactType getValue();

	/**
	 * Sets the value of the '{@link org.hl7.knowledgeartifact.r2.ArtifactTypeType1#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see org.hl7.knowledgeartifact.r2.ArtifactType
	 * @see #isSetValue()
	 * @see #unsetValue()
	 * @see #getValue()
	 * @generated
	 */
	void setValue(ArtifactType value);

	/**
	 * Unsets the value of the '{@link org.hl7.knowledgeartifact.r2.ArtifactTypeType1#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetValue()
	 * @see #getValue()
	 * @see #setValue(ArtifactType)
	 * @generated
	 */
	void unsetValue();

	/**
	 * Returns whether the value of the '{@link org.hl7.knowledgeartifact.r2.ArtifactTypeType1#getValue <em>Value</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Value</em>' attribute is set.
	 * @see #unsetValue()
	 * @see #getValue()
	 * @see #setValue(ArtifactType)
	 * @generated
	 */
	boolean isSetValue();

} // ArtifactTypeType1
