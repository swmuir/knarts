/**
 */
package org.hl7.cdsdt.r2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ANY</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Defines the basic properties of every data value. This is conceptually an abstract type, meaning that no proper value can be just a data value without belonging to any concrete type. Every public concrete type is a specialization of this general abstract DataValue type. 
 * 
 * However exceptional values (nullFlavored values) may be of type ANY, except for the exceptional values that imply the nullFlavor INV, since this requires a type to be meaningful. Note that not all nullFlavors may be used with the type ANY.
 * 
 * This class is maintained here despite the lack of attributes to maintain compatibility with the ISO 21090 data structure.
 * 
 * We have also made it abstract to be consistent with the lack of support for nullFlavors.
 * <!-- end-model-doc -->
 *
 *
 * @see org.hl7.cdsdt.r2.R2Package#getANY()
 * @model abstract="true"
 *        extendedMetaData="name='ANY' kind='empty'"
 * @generated
 */
public interface ANY extends HXIT {
} // ANY
