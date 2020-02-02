/**
 */
package org.hl7.cdsdt.r2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>QSET</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Abstract; specializes ANY
 * 
 * Parameter: T : QTY
 * 
 * An unordered set of distinct values which are quantities. 
 * 
 * Any ordered type can be the basis of an QSET; it does not matter whether the base type is discrete or continuous. If the base datatype is only partially ordered, all elements of the QSET must be elements of a totally ordered subset of the partially ordered datatype (for example, PQ is only ordered when the units are consistent. Every value in a QSET(PQ) must have the same canonical unit).
 * 
 * QSET is an abstract type. A working QSET is specified as an expression tree built using a combination of operator (QSI, QSD, QSU, QSP) and component types (QSC, QSS and IVL; and, for TS, PIVL and EIVL).
 * 
 * QSETs SHALL not contain null or nullFlavored values as members of the set.
 * 
 * 
 * This class is maintained here despite the lack of attributes to maintain compatibility with the ISO 21090 data structure.
 * <!-- end-model-doc -->
 *
 *
 * @see org.hl7.cdsdt.r2.R2Package#getQSET()
 * @model abstract="true"
 *        extendedMetaData="name='QSET' kind='empty'"
 * @generated
 */
public interface QSET extends ANY {
} // QSET
