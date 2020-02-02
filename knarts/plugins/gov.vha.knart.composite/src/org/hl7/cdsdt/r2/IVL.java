/**
 */
package org.hl7.cdsdt.r2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IVL</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A set of consecutive values of an ordered base datatype. 
 * 
 * Any ordered type can be the basis of an IVL; it does not matter whether the base type is discrete or continuous. If the base datatype is only partially ordered, all elements of the IVL must be elements of a totally ordered subset of the partially ordered datatype. For example, PQ is considered ordered. However the ordering of PQs is only partial; a total order is only defined among comparable quantities (quantities of the same physical dimension). While IVLs between 2 and 4 meter exists, there is no IVL between 2 meters and 4 seconds
 * 
 * This class is maintained here despite the lack of attributes to maintain compatibility with the ISO 21090 data structure.
 * <!-- end-model-doc -->
 *
 *
 * @see org.hl7.cdsdt.r2.R2Package#getIVL()
 * @model extendedMetaData="name='IVL' kind='empty'"
 * @generated
 */
public interface IVL extends QSET {
} // IVL
