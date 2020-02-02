/**
 */
package org.hl7.knowledgeartifact.r1;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Models Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.knowledgeartifact.r1.DataModelsType#getModelReference <em>Model Reference</em>}</li>
 * </ul>
 *
 * @see org.hl7.knowledgeartifact.r1.R1Package#getDataModelsType()
 * @model extendedMetaData="name='dataModels_._type' kind='elementOnly'"
 * @generated
 */
public interface DataModelsType extends EObject {
	/**
	 * Returns the value of the '<em><b>Model Reference</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.knowledgeartifact.r1.ModelReference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A reference for the data models that are
	 * 									used in the artifact, e..g., the Virtual Medical Record. In
	 * 									this case, the name could be "vmr" and the value is
	 * 									the namespace universal resource identifier of the HL7 VMR schema
	 * 								
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Model Reference</em>' containment reference list.
	 * @see org.hl7.knowledgeartifact.r1.R1Package#getDataModelsType_ModelReference()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='modelReference' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ModelReference> getModelReference();

} // DataModelsType
