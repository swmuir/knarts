/**
 */
package org.hl7.elm.r1;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Population Std Dev</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The PopulationStdDev operator returns the statistical standard deviation of the elements in source.
 * 			
 * If a path is specified, elements with no value for the property specified by the path are ignored.
 * 
 * If the source contains no non-null elements, null is returned.
 * 
 * If the source is null, the result is null.
 * <!-- end-model-doc -->
 *
 *
 * @see org.hl7.elm.r1.R1Package#getPopulationStdDev()
 * @model extendedMetaData="name='PopulationStdDev' kind='elementOnly'"
 * @generated
 */
public interface PopulationStdDev extends AggregateExpression {
} // PopulationStdDev
