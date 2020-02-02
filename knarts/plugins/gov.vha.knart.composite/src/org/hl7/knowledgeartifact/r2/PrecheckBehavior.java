/**
 */
package org.hl7.knowledgeartifact.r2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Precheck Behavior</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * For a particular action, specifies how often the action is expected to be selected in the particular context of the group containing that action.  In general, depending on the group selection behavior, there may be zero, one or more actions which are frequently selected.  This setting can serve as a hint to the system that displays the action to the end user: some systems will pre-select those actions which are (or should be) most frequently selected.
 * <!-- end-model-doc -->
 *
 *
 * @see org.hl7.knowledgeartifact.r2.R2Package#getPrecheckBehavior()
 * @model extendedMetaData="name='PrecheckBehavior' kind='empty'"
 * @generated
 */
public interface PrecheckBehavior extends Behavior {
} // PrecheckBehavior
