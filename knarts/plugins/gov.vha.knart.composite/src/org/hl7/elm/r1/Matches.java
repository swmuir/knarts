/**
 */
package org.hl7.elm.r1;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Matches</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The Matches operator returns true if the arguments are the same value, or if they are both null; and false otherwise.
 * 
 * For tuple types, this means that two tuple values match if and only if the tuples are of the same type, and the values for all elements by name match.
 * 
 * For list types, this means that two lists match if and only if the lists contain elements of the same type, have the same number of elements, and for each element in the lists, in order, the elements match.
 * 
 * For interval types, this means that two intervals match if and only if the intervals are over the same point type, and the starting and ending points of the intervals as determined by the Start and End operators match.
 * 
 * For Code values, matching is defined based on the code, system, and verrsion elements only. The display element is ignored for the purposes of determining Code matching.
 * 
 * For Concept values, matching is defined as a non-empty intersection of the codes in each Concept.
 * 
 * Note that this operator will always return true or false, even if either or both of its arguments are null or contain null components.
 * 
 * This operator, and the corresponding notion of matching, are used throughout ELM to define the behavior of membership and containment operators such as In, Contains, Includes, IndexOf, and others. This provides consistent and intuitive behavior in the presence of missing information in list and membership contexts.
 * <!-- end-model-doc -->
 *
 *
 * @see org.hl7.elm.r1.R1Package#getMatches()
 * @model extendedMetaData="name='Matches' kind='elementOnly'"
 * @generated
 */
public interface Matches extends BinaryExpression {
} // Matches
