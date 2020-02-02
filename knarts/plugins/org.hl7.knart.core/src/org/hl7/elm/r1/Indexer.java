/**
 */
package org.hl7.elm.r1;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Indexer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The Indexer operator returns the indexth element in a string or list.
 * 			
 * Indexes in strings and lists are defined to be 1-based.
 * 
 * If the index is greater than the length of the string or list being indexed, the result is null.
 * 
 * If either argument is null, the result is null.
 * <!-- end-model-doc -->
 *
 *
 * @see org.hl7.elm.r1.R1Package#getIndexer()
 * @model extendedMetaData="name='Indexer' kind='elementOnly'"
 * @generated
 */
public interface Indexer extends BinaryExpression {
} // Indexer
