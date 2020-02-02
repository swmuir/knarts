/**
 */
package org.hl7.cdsdt.r2;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Specifies data types used.  The data types are a simplified/constrained version of the HL7 version 3 datatypes specification, release 2, which is itself based on the implementable specification of ISO 21090 data types.
 * <!-- end-model-doc -->
 * @see org.hl7.cdsdt.r2.R2Factory
 * @model kind="package"
 * @generated
 */
public interface R2Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "r2";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "urn:hl7-org:cdsdt:r2";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "r2";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	R2Package eINSTANCE = org.hl7.cdsdt.r2.impl.R2PackageImpl.init();

	/**
	 * The meta object id for the '{@link org.hl7.cdsdt.r2.impl.HXITImpl <em>HXIT</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.cdsdt.r2.impl.HXITImpl
	 * @see org.hl7.cdsdt.r2.impl.R2PackageImpl#getHXIT()
	 * @generated
	 */
	int HXIT = 10;

	/**
	 * The number of structural features of the '<em>HXIT</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HXIT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>HXIT</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HXIT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.hl7.cdsdt.r2.impl.ANYImpl <em>ANY</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.cdsdt.r2.impl.ANYImpl
	 * @see org.hl7.cdsdt.r2.impl.R2PackageImpl#getANY()
	 * @generated
	 */
	int ANY = 2;

	/**
	 * The number of structural features of the '<em>ANY</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY_FEATURE_COUNT = HXIT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ANY</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY_OPERATION_COUNT = HXIT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.cdsdt.r2.impl.ADImpl <em>AD</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.cdsdt.r2.impl.ADImpl
	 * @see org.hl7.cdsdt.r2.impl.R2PackageImpl#getAD()
	 * @generated
	 */
	int AD = 0;

	/**
	 * The feature id for the '<em><b>Part</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AD__PART = ANY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Use</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AD__USE = ANY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>AD</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AD_FEATURE_COUNT = ANY_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>AD</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AD_OPERATION_COUNT = ANY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.cdsdt.r2.impl.XPImpl <em>XP</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.cdsdt.r2.impl.XPImpl
	 * @see org.hl7.cdsdt.r2.impl.R2PackageImpl#getXP()
	 * @generated
	 */
	int XP = 29;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XP__VALUE = 0;

	/**
	 * The number of structural features of the '<em>XP</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XP_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>XP</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.hl7.cdsdt.r2.impl.ADXPImpl <em>ADXP</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.cdsdt.r2.impl.ADXPImpl
	 * @see org.hl7.cdsdt.r2.impl.R2PackageImpl#getADXP()
	 * @generated
	 */
	int ADXP = 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADXP__VALUE = XP__VALUE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADXP__TYPE = XP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>ADXP</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADXP_FEATURE_COUNT = XP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>ADXP</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADXP_OPERATION_COUNT = XP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.cdsdt.r2.impl.BLImpl <em>BL</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.cdsdt.r2.impl.BLImpl
	 * @see org.hl7.cdsdt.r2.impl.R2PackageImpl#getBL()
	 * @generated
	 */
	int BL = 3;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BL__VALUE = ANY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>BL</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BL_FEATURE_COUNT = ANY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>BL</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BL_OPERATION_COUNT = ANY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.cdsdt.r2.impl.CDImpl <em>CD</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.cdsdt.r2.impl.CDImpl
	 * @see org.hl7.cdsdt.r2.impl.R2PackageImpl#getCD()
	 * @generated
	 */
	int CD = 4;

	/**
	 * The feature id for the '<em><b>Display Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CD__DISPLAY_NAME = ANY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Original Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CD__ORIGINAL_TEXT = ANY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Translation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CD__TRANSLATION = ANY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CD__CODE = ANY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Code System</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CD__CODE_SYSTEM = ANY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Code System Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CD__CODE_SYSTEM_NAME = ANY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Code System Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CD__CODE_SYSTEM_VERSION = ANY_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Value Set</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CD__VALUE_SET = ANY_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Value Set Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CD__VALUE_SET_VERSION = ANY_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>CD</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CD_FEATURE_COUNT = ANY_FEATURE_COUNT + 9;

	/**
	 * The number of operations of the '<em>CD</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CD_OPERATION_COUNT = ANY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.cdsdt.r2.impl.QTYImpl <em>QTY</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.cdsdt.r2.impl.QTYImpl
	 * @see org.hl7.cdsdt.r2.impl.R2PackageImpl#getQTY()
	 * @generated
	 */
	int QTY = 23;

	/**
	 * The number of structural features of the '<em>QTY</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QTY_FEATURE_COUNT = ANY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>QTY</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QTY_OPERATION_COUNT = ANY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.cdsdt.r2.impl.COImpl <em>CO</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.cdsdt.r2.impl.COImpl
	 * @see org.hl7.cdsdt.r2.impl.R2PackageImpl#getCO()
	 * @generated
	 */
	int CO = 5;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CO__CODE = QTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CO__VALUE = QTY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>CO</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CO_FEATURE_COUNT = QTY_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>CO</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CO_OPERATION_COUNT = QTY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.cdsdt.r2.impl.CSImpl <em>CS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.cdsdt.r2.impl.CSImpl
	 * @see org.hl7.cdsdt.r2.impl.R2PackageImpl#getCS()
	 * @generated
	 */
	int CS = 6;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS__CODE = ANY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>CS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_FEATURE_COUNT = ANY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>CS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_OPERATION_COUNT = ANY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.cdsdt.r2.impl.EDImpl <em>ED</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.cdsdt.r2.impl.EDImpl
	 * @see org.hl7.cdsdt.r2.impl.R2PackageImpl#getED()
	 * @generated
	 */
	int ED = 7;

	/**
	 * The feature id for the '<em><b>Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ED__DATA = ANY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Xml</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ED__XML = ANY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ED__REFERENCE = ANY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Integrity Check</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ED__INTEGRITY_CHECK = ANY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ED__DESCRIPTION = ANY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Charset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ED__CHARSET = ANY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Compression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ED__COMPRESSION = ANY_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Integrity Check Algorithm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ED__INTEGRITY_CHECK_ALGORITHM = ANY_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ED__LANGUAGE = ANY_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Media Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ED__MEDIA_TYPE = ANY_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ED__VALUE = ANY_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>ED</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ED_FEATURE_COUNT = ANY_FEATURE_COUNT + 11;

	/**
	 * The number of operations of the '<em>ED</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ED_OPERATION_COUNT = ANY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.cdsdt.r2.impl.ENImpl <em>EN</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.cdsdt.r2.impl.ENImpl
	 * @see org.hl7.cdsdt.r2.impl.R2PackageImpl#getEN()
	 * @generated
	 */
	int EN = 8;

	/**
	 * The feature id for the '<em><b>Part</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EN__PART = ANY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Use</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EN__USE = ANY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>EN</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EN_FEATURE_COUNT = ANY_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>EN</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EN_OPERATION_COUNT = ANY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.cdsdt.r2.impl.ENXPImpl <em>ENXP</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.cdsdt.r2.impl.ENXPImpl
	 * @see org.hl7.cdsdt.r2.impl.R2PackageImpl#getENXP()
	 * @generated
	 */
	int ENXP = 9;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENXP__VALUE = XP__VALUE;

	/**
	 * The feature id for the '<em><b>Qualifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENXP__QUALIFIER = XP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENXP__TYPE = XP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>ENXP</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENXP_FEATURE_COUNT = XP_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>ENXP</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENXP_OPERATION_COUNT = XP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.cdsdt.r2.impl.IIImpl <em>II</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.cdsdt.r2.impl.IIImpl
	 * @see org.hl7.cdsdt.r2.impl.R2PackageImpl#getII()
	 * @generated
	 */
	int II = 11;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int II__EXTENSION = ANY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Identifier Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int II__IDENTIFIER_NAME = ANY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Root</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int II__ROOT = ANY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>II</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int II_FEATURE_COUNT = ANY_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>II</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int II_OPERATION_COUNT = ANY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.cdsdt.r2.impl.INTImpl <em>INT</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.cdsdt.r2.impl.INTImpl
	 * @see org.hl7.cdsdt.r2.impl.R2PackageImpl#getINT()
	 * @generated
	 */
	int INT = 12;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT__VALUE = QTY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>INT</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_FEATURE_COUNT = QTY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>INT</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_OPERATION_COUNT = QTY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.cdsdt.r2.impl.QSETImpl <em>QSET</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.cdsdt.r2.impl.QSETImpl
	 * @see org.hl7.cdsdt.r2.impl.R2PackageImpl#getQSET()
	 * @generated
	 */
	int QSET = 22;

	/**
	 * The number of structural features of the '<em>QSET</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QSET_FEATURE_COUNT = ANY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>QSET</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QSET_OPERATION_COUNT = ANY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.cdsdt.r2.impl.IVLImpl <em>IVL</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.cdsdt.r2.impl.IVLImpl
	 * @see org.hl7.cdsdt.r2.impl.R2PackageImpl#getIVL()
	 * @generated
	 */
	int IVL = 13;

	/**
	 * The number of structural features of the '<em>IVL</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IVL_FEATURE_COUNT = QSET_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>IVL</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IVL_OPERATION_COUNT = QSET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.cdsdt.r2.impl.IVLCOImpl <em>IVLCO</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.cdsdt.r2.impl.IVLCOImpl
	 * @see org.hl7.cdsdt.r2.impl.R2PackageImpl#getIVLCO()
	 * @generated
	 */
	int IVLCO = 14;

	/**
	 * The feature id for the '<em><b>Low</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IVLCO__LOW = IVL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>High</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IVLCO__HIGH = IVL_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>High Closed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IVLCO__HIGH_CLOSED = IVL_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Low Closed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IVLCO__LOW_CLOSED = IVL_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>IVLCO</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IVLCO_FEATURE_COUNT = IVL_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>IVLCO</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IVLCO_OPERATION_COUNT = IVL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.cdsdt.r2.impl.IVLINTImpl <em>IVLINT</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.cdsdt.r2.impl.IVLINTImpl
	 * @see org.hl7.cdsdt.r2.impl.R2PackageImpl#getIVLINT()
	 * @generated
	 */
	int IVLINT = 15;

	/**
	 * The feature id for the '<em><b>Low</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IVLINT__LOW = IVL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>High</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IVLINT__HIGH = IVL_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>High Closed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IVLINT__HIGH_CLOSED = IVL_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Low Closed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IVLINT__LOW_CLOSED = IVL_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>IVLINT</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IVLINT_FEATURE_COUNT = IVL_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>IVLINT</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IVLINT_OPERATION_COUNT = IVL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.cdsdt.r2.impl.IVLPQImpl <em>IVLPQ</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.cdsdt.r2.impl.IVLPQImpl
	 * @see org.hl7.cdsdt.r2.impl.R2PackageImpl#getIVLPQ()
	 * @generated
	 */
	int IVLPQ = 16;

	/**
	 * The feature id for the '<em><b>Low</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IVLPQ__LOW = IVL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>High</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IVLPQ__HIGH = IVL_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>High Closed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IVLPQ__HIGH_CLOSED = IVL_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Low Closed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IVLPQ__LOW_CLOSED = IVL_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>IVLPQ</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IVLPQ_FEATURE_COUNT = IVL_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>IVLPQ</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IVLPQ_OPERATION_COUNT = IVL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.cdsdt.r2.impl.IVLQTYImpl <em>IVLQTY</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.cdsdt.r2.impl.IVLQTYImpl
	 * @see org.hl7.cdsdt.r2.impl.R2PackageImpl#getIVLQTY()
	 * @generated
	 */
	int IVLQTY = 17;

	/**
	 * The feature id for the '<em><b>Low</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IVLQTY__LOW = IVL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>High</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IVLQTY__HIGH = IVL_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>High Closed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IVLQTY__HIGH_CLOSED = IVL_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Low Closed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IVLQTY__LOW_CLOSED = IVL_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>IVLQTY</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IVLQTY_FEATURE_COUNT = IVL_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>IVLQTY</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IVLQTY_OPERATION_COUNT = IVL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.cdsdt.r2.impl.IVLREALImpl <em>IVLREAL</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.cdsdt.r2.impl.IVLREALImpl
	 * @see org.hl7.cdsdt.r2.impl.R2PackageImpl#getIVLREAL()
	 * @generated
	 */
	int IVLREAL = 18;

	/**
	 * The feature id for the '<em><b>Low</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IVLREAL__LOW = IVL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>High</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IVLREAL__HIGH = IVL_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>High Closed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IVLREAL__HIGH_CLOSED = IVL_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Low Closed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IVLREAL__LOW_CLOSED = IVL_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>IVLREAL</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IVLREAL_FEATURE_COUNT = IVL_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>IVLREAL</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IVLREAL_OPERATION_COUNT = IVL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.cdsdt.r2.impl.IVLTSImpl <em>IVLTS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.cdsdt.r2.impl.IVLTSImpl
	 * @see org.hl7.cdsdt.r2.impl.R2PackageImpl#getIVLTS()
	 * @generated
	 */
	int IVLTS = 19;

	/**
	 * The feature id for the '<em><b>Low</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IVLTS__LOW = IVL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>High</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IVLTS__HIGH = IVL_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>High Closed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IVLTS__HIGH_CLOSED = IVL_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Low Closed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IVLTS__LOW_CLOSED = IVL_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>IVLTS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IVLTS_FEATURE_COUNT = IVL_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>IVLTS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IVLTS_OPERATION_COUNT = IVL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.cdsdt.r2.impl.PIVLTSImpl <em>PIVLTS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.cdsdt.r2.impl.PIVLTSImpl
	 * @see org.hl7.cdsdt.r2.impl.R2PackageImpl#getPIVLTS()
	 * @generated
	 */
	int PIVLTS = 20;

	/**
	 * The feature id for the '<em><b>Phase</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIVLTS__PHASE = QTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIVLTS__PERIOD = QTY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Frequency</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIVLTS__FREQUENCY = QTY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Count</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIVLTS__COUNT = QTY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Alignment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIVLTS__ALIGNMENT = QTY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Is Flexible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIVLTS__IS_FLEXIBLE = QTY_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>PIVLTS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIVLTS_FEATURE_COUNT = QTY_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>PIVLTS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIVLTS_OPERATION_COUNT = QTY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.cdsdt.r2.impl.PQImpl <em>PQ</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.cdsdt.r2.impl.PQImpl
	 * @see org.hl7.cdsdt.r2.impl.R2PackageImpl#getPQ()
	 * @generated
	 */
	int PQ = 21;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PQ__UNIT = QTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PQ__VALUE = QTY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>PQ</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PQ_FEATURE_COUNT = QTY_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>PQ</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PQ_OPERATION_COUNT = QTY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.cdsdt.r2.impl.REALImpl <em>REAL</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.cdsdt.r2.impl.REALImpl
	 * @see org.hl7.cdsdt.r2.impl.R2PackageImpl#getREAL()
	 * @generated
	 */
	int REAL = 24;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL__VALUE = QTY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>REAL</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_FEATURE_COUNT = QTY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>REAL</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_OPERATION_COUNT = QTY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.cdsdt.r2.impl.RTOImpl <em>RTO</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.cdsdt.r2.impl.RTOImpl
	 * @see org.hl7.cdsdt.r2.impl.R2PackageImpl#getRTO()
	 * @generated
	 */
	int RTO = 25;

	/**
	 * The feature id for the '<em><b>Numerator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTO__NUMERATOR = QTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Denominator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTO__DENOMINATOR = QTY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>RTO</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTO_FEATURE_COUNT = QTY_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>RTO</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTO_OPERATION_COUNT = QTY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.cdsdt.r2.impl.STImpl <em>ST</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.cdsdt.r2.impl.STImpl
	 * @see org.hl7.cdsdt.r2.impl.R2PackageImpl#getST()
	 * @generated
	 */
	int ST = 26;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ST__VALUE = ANY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>ST</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ST_FEATURE_COUNT = ANY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>ST</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ST_OPERATION_COUNT = ANY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.cdsdt.r2.impl.TELImpl <em>TEL</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.cdsdt.r2.impl.TELImpl
	 * @see org.hl7.cdsdt.r2.impl.R2PackageImpl#getTEL()
	 * @generated
	 */
	int TEL = 27;

	/**
	 * The feature id for the '<em><b>Capabilities</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEL__CAPABILITIES = ANY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Use</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEL__USE = ANY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEL__VALUE = ANY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>TEL</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEL_FEATURE_COUNT = ANY_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>TEL</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEL_OPERATION_COUNT = ANY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.cdsdt.r2.impl.TSImpl <em>TS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.cdsdt.r2.impl.TSImpl
	 * @see org.hl7.cdsdt.r2.impl.R2PackageImpl#getTS()
	 * @generated
	 */
	int TS = 28;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TS__VALUE = QTY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>TS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TS_FEATURE_COUNT = QTY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>TS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TS_OPERATION_COUNT = QTY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.cdsdt.r2.AddressPartType <em>Address Part Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.cdsdt.r2.AddressPartType
	 * @see org.hl7.cdsdt.r2.impl.R2PackageImpl#getAddressPartType()
	 * @generated
	 */
	int ADDRESS_PART_TYPE = 30;

	/**
	 * The meta object id for the '{@link org.hl7.cdsdt.r2.CalendarCycle <em>Calendar Cycle</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.cdsdt.r2.CalendarCycle
	 * @see org.hl7.cdsdt.r2.impl.R2PackageImpl#getCalendarCycle()
	 * @generated
	 */
	int CALENDAR_CYCLE = 31;

	/**
	 * The meta object id for the '{@link org.hl7.cdsdt.r2.Compression <em>Compression</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.cdsdt.r2.Compression
	 * @see org.hl7.cdsdt.r2.impl.R2PackageImpl#getCompression()
	 * @generated
	 */
	int COMPRESSION = 32;

	/**
	 * The meta object id for the '{@link org.hl7.cdsdt.r2.EntityNamePartQualifier <em>Entity Name Part Qualifier</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.cdsdt.r2.EntityNamePartQualifier
	 * @see org.hl7.cdsdt.r2.impl.R2PackageImpl#getEntityNamePartQualifier()
	 * @generated
	 */
	int ENTITY_NAME_PART_QUALIFIER = 33;

	/**
	 * The meta object id for the '{@link org.hl7.cdsdt.r2.EntityNamePartType <em>Entity Name Part Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.cdsdt.r2.EntityNamePartType
	 * @see org.hl7.cdsdt.r2.impl.R2PackageImpl#getEntityNamePartType()
	 * @generated
	 */
	int ENTITY_NAME_PART_TYPE = 34;

	/**
	 * The meta object id for the '{@link org.hl7.cdsdt.r2.EntityNameUse <em>Entity Name Use</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.cdsdt.r2.EntityNameUse
	 * @see org.hl7.cdsdt.r2.impl.R2PackageImpl#getEntityNameUse()
	 * @generated
	 */
	int ENTITY_NAME_USE = 35;

	/**
	 * The meta object id for the '{@link org.hl7.cdsdt.r2.IntegrityCheckAlgorithm <em>Integrity Check Algorithm</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.cdsdt.r2.IntegrityCheckAlgorithm
	 * @see org.hl7.cdsdt.r2.impl.R2PackageImpl#getIntegrityCheckAlgorithm()
	 * @generated
	 */
	int INTEGRITY_CHECK_ALGORITHM = 36;

	/**
	 * The meta object id for the '{@link org.hl7.cdsdt.r2.PostalAddressUse <em>Postal Address Use</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.cdsdt.r2.PostalAddressUse
	 * @see org.hl7.cdsdt.r2.impl.R2PackageImpl#getPostalAddressUse()
	 * @generated
	 */
	int POSTAL_ADDRESS_USE = 37;

	/**
	 * The meta object id for the '{@link org.hl7.cdsdt.r2.TelecommunicationAddressUse <em>Telecommunication Address Use</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.cdsdt.r2.TelecommunicationAddressUse
	 * @see org.hl7.cdsdt.r2.impl.R2PackageImpl#getTelecommunicationAddressUse()
	 * @generated
	 */
	int TELECOMMUNICATION_ADDRESS_USE = 38;

	/**
	 * The meta object id for the '{@link org.hl7.cdsdt.r2.TelecommunicationCapability <em>Telecommunication Capability</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.cdsdt.r2.TelecommunicationCapability
	 * @see org.hl7.cdsdt.r2.impl.R2PackageImpl#getTelecommunicationCapability()
	 * @generated
	 */
	int TELECOMMUNICATION_CAPABILITY = 39;

	/**
	 * The meta object id for the '<em>Address Part Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.cdsdt.r2.AddressPartType
	 * @see org.hl7.cdsdt.r2.impl.R2PackageImpl#getAddressPartTypeObject()
	 * @generated
	 */
	int ADDRESS_PART_TYPE_OBJECT = 40;

	/**
	 * The meta object id for the '<em>Calendar Cycle Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.cdsdt.r2.CalendarCycle
	 * @see org.hl7.cdsdt.r2.impl.R2PackageImpl#getCalendarCycleObject()
	 * @generated
	 */
	int CALENDAR_CYCLE_OBJECT = 41;

	/**
	 * The meta object id for the '<em>Code</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.hl7.cdsdt.r2.impl.R2PackageImpl#getCode()
	 * @generated
	 */
	int CODE = 42;

	/**
	 * The meta object id for the '<em>Compression Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.cdsdt.r2.Compression
	 * @see org.hl7.cdsdt.r2.impl.R2PackageImpl#getCompressionObject()
	 * @generated
	 */
	int COMPRESSION_OBJECT = 43;

	/**
	 * The meta object id for the '<em>Decimal</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.cdsdt.r2.impl.R2PackageImpl#getDecimal()
	 * @generated
	 */
	int DECIMAL = 44;

	/**
	 * The meta object id for the '<em>Decimal Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Double
	 * @see org.hl7.cdsdt.r2.impl.R2PackageImpl#getDecimalObject()
	 * @generated
	 */
	int DECIMAL_OBJECT = 45;

	/**
	 * The meta object id for the '<em>Entity Name Part Qualifier Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.cdsdt.r2.EntityNamePartQualifier
	 * @see org.hl7.cdsdt.r2.impl.R2PackageImpl#getEntityNamePartQualifierObject()
	 * @generated
	 */
	int ENTITY_NAME_PART_QUALIFIER_OBJECT = 46;

	/**
	 * The meta object id for the '<em>Entity Name Part Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.cdsdt.r2.EntityNamePartType
	 * @see org.hl7.cdsdt.r2.impl.R2PackageImpl#getEntityNamePartTypeObject()
	 * @generated
	 */
	int ENTITY_NAME_PART_TYPE_OBJECT = 47;

	/**
	 * The meta object id for the '<em>Entity Name Use Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.cdsdt.r2.EntityNameUse
	 * @see org.hl7.cdsdt.r2.impl.R2PackageImpl#getEntityNameUseObject()
	 * @generated
	 */
	int ENTITY_NAME_USE_OBJECT = 48;

	/**
	 * The meta object id for the '<em>Integrity Check Algorithm Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.cdsdt.r2.IntegrityCheckAlgorithm
	 * @see org.hl7.cdsdt.r2.impl.R2PackageImpl#getIntegrityCheckAlgorithmObject()
	 * @generated
	 */
	int INTEGRITY_CHECK_ALGORITHM_OBJECT = 49;

	/**
	 * The meta object id for the '<em>Postal Address Use Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.cdsdt.r2.PostalAddressUse
	 * @see org.hl7.cdsdt.r2.impl.R2PackageImpl#getPostalAddressUseObject()
	 * @generated
	 */
	int POSTAL_ADDRESS_USE_OBJECT = 50;

	/**
	 * The meta object id for the '<em>Set Entity Name Part Qualifier</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.List
	 * @see org.hl7.cdsdt.r2.impl.R2PackageImpl#getSetEntityNamePartQualifier()
	 * @generated
	 */
	int SET_ENTITY_NAME_PART_QUALIFIER = 51;

	/**
	 * The meta object id for the '<em>Set Entity Name Use</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.List
	 * @see org.hl7.cdsdt.r2.impl.R2PackageImpl#getSetEntityNameUse()
	 * @generated
	 */
	int SET_ENTITY_NAME_USE = 52;

	/**
	 * The meta object id for the '<em>Set Postal Address Use</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.List
	 * @see org.hl7.cdsdt.r2.impl.R2PackageImpl#getSetPostalAddressUse()
	 * @generated
	 */
	int SET_POSTAL_ADDRESS_USE = 53;

	/**
	 * The meta object id for the '<em>Set Telecommunication Address Use</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.List
	 * @see org.hl7.cdsdt.r2.impl.R2PackageImpl#getSetTelecommunicationAddressUse()
	 * @generated
	 */
	int SET_TELECOMMUNICATION_ADDRESS_USE = 54;

	/**
	 * The meta object id for the '<em>Set Telecommunication Capability</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.List
	 * @see org.hl7.cdsdt.r2.impl.R2PackageImpl#getSetTelecommunicationCapability()
	 * @generated
	 */
	int SET_TELECOMMUNICATION_CAPABILITY = 55;

	/**
	 * The meta object id for the '<em>Telecommunication Address Use Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.cdsdt.r2.TelecommunicationAddressUse
	 * @see org.hl7.cdsdt.r2.impl.R2PackageImpl#getTelecommunicationAddressUseObject()
	 * @generated
	 */
	int TELECOMMUNICATION_ADDRESS_USE_OBJECT = 56;

	/**
	 * The meta object id for the '<em>Telecommunication Capability Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.cdsdt.r2.TelecommunicationCapability
	 * @see org.hl7.cdsdt.r2.impl.R2PackageImpl#getTelecommunicationCapabilityObject()
	 * @generated
	 */
	int TELECOMMUNICATION_CAPABILITY_OBJECT = 57;

	/**
	 * The meta object id for the '<em>Time Stamp</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.hl7.cdsdt.r2.impl.R2PackageImpl#getTimeStamp()
	 * @generated
	 */
	int TIME_STAMP = 58;

	/**
	 * The meta object id for the '<em>Uid</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.hl7.cdsdt.r2.impl.R2PackageImpl#getUid()
	 * @generated
	 */
	int UID = 59;

	/**
	 * The meta object id for the '<em>Uri</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.hl7.cdsdt.r2.impl.R2PackageImpl#getUri()
	 * @generated
	 */
	int URI = 60;


	/**
	 * Returns the meta object for class '{@link org.hl7.cdsdt.r2.AD <em>AD</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>AD</em>'.
	 * @see org.hl7.cdsdt.r2.AD
	 * @generated
	 */
	EClass getAD();

	/**
	 * Returns the meta object for the containment reference list '{@link org.hl7.cdsdt.r2.AD#getPart <em>Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Part</em>'.
	 * @see org.hl7.cdsdt.r2.AD#getPart()
	 * @see #getAD()
	 * @generated
	 */
	EReference getAD_Part();

	/**
	 * Returns the meta object for the attribute '{@link org.hl7.cdsdt.r2.AD#getUse <em>Use</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Use</em>'.
	 * @see org.hl7.cdsdt.r2.AD#getUse()
	 * @see #getAD()
	 * @generated
	 */
	EAttribute getAD_Use();

	/**
	 * Returns the meta object for class '{@link org.hl7.cdsdt.r2.ADXP <em>ADXP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ADXP</em>'.
	 * @see org.hl7.cdsdt.r2.ADXP
	 * @generated
	 */
	EClass getADXP();

	/**
	 * Returns the meta object for the attribute '{@link org.hl7.cdsdt.r2.ADXP#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.hl7.cdsdt.r2.ADXP#getType()
	 * @see #getADXP()
	 * @generated
	 */
	EAttribute getADXP_Type();

	/**
	 * Returns the meta object for class '{@link org.hl7.cdsdt.r2.ANY <em>ANY</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ANY</em>'.
	 * @see org.hl7.cdsdt.r2.ANY
	 * @generated
	 */
	EClass getANY();

	/**
	 * Returns the meta object for class '{@link org.hl7.cdsdt.r2.BL <em>BL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BL</em>'.
	 * @see org.hl7.cdsdt.r2.BL
	 * @generated
	 */
	EClass getBL();

	/**
	 * Returns the meta object for the attribute '{@link org.hl7.cdsdt.r2.BL#isValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.hl7.cdsdt.r2.BL#isValue()
	 * @see #getBL()
	 * @generated
	 */
	EAttribute getBL_Value();

	/**
	 * Returns the meta object for class '{@link org.hl7.cdsdt.r2.CD <em>CD</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CD</em>'.
	 * @see org.hl7.cdsdt.r2.CD
	 * @generated
	 */
	EClass getCD();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.cdsdt.r2.CD#getDisplayName <em>Display Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Display Name</em>'.
	 * @see org.hl7.cdsdt.r2.CD#getDisplayName()
	 * @see #getCD()
	 * @generated
	 */
	EReference getCD_DisplayName();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.cdsdt.r2.CD#getOriginalText <em>Original Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Original Text</em>'.
	 * @see org.hl7.cdsdt.r2.CD#getOriginalText()
	 * @see #getCD()
	 * @generated
	 */
	EReference getCD_OriginalText();

	/**
	 * Returns the meta object for the containment reference list '{@link org.hl7.cdsdt.r2.CD#getTranslation <em>Translation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Translation</em>'.
	 * @see org.hl7.cdsdt.r2.CD#getTranslation()
	 * @see #getCD()
	 * @generated
	 */
	EReference getCD_Translation();

	/**
	 * Returns the meta object for the attribute '{@link org.hl7.cdsdt.r2.CD#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see org.hl7.cdsdt.r2.CD#getCode()
	 * @see #getCD()
	 * @generated
	 */
	EAttribute getCD_Code();

	/**
	 * Returns the meta object for the attribute '{@link org.hl7.cdsdt.r2.CD#getCodeSystem <em>Code System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code System</em>'.
	 * @see org.hl7.cdsdt.r2.CD#getCodeSystem()
	 * @see #getCD()
	 * @generated
	 */
	EAttribute getCD_CodeSystem();

	/**
	 * Returns the meta object for the attribute '{@link org.hl7.cdsdt.r2.CD#getCodeSystemName <em>Code System Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code System Name</em>'.
	 * @see org.hl7.cdsdt.r2.CD#getCodeSystemName()
	 * @see #getCD()
	 * @generated
	 */
	EAttribute getCD_CodeSystemName();

	/**
	 * Returns the meta object for the attribute '{@link org.hl7.cdsdt.r2.CD#getCodeSystemVersion <em>Code System Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code System Version</em>'.
	 * @see org.hl7.cdsdt.r2.CD#getCodeSystemVersion()
	 * @see #getCD()
	 * @generated
	 */
	EAttribute getCD_CodeSystemVersion();

	/**
	 * Returns the meta object for the attribute '{@link org.hl7.cdsdt.r2.CD#getValueSet <em>Value Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value Set</em>'.
	 * @see org.hl7.cdsdt.r2.CD#getValueSet()
	 * @see #getCD()
	 * @generated
	 */
	EAttribute getCD_ValueSet();

	/**
	 * Returns the meta object for the attribute '{@link org.hl7.cdsdt.r2.CD#getValueSetVersion <em>Value Set Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value Set Version</em>'.
	 * @see org.hl7.cdsdt.r2.CD#getValueSetVersion()
	 * @see #getCD()
	 * @generated
	 */
	EAttribute getCD_ValueSetVersion();

	/**
	 * Returns the meta object for class '{@link org.hl7.cdsdt.r2.CO <em>CO</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CO</em>'.
	 * @see org.hl7.cdsdt.r2.CO
	 * @generated
	 */
	EClass getCO();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.cdsdt.r2.CO#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Code</em>'.
	 * @see org.hl7.cdsdt.r2.CO#getCode()
	 * @see #getCO()
	 * @generated
	 */
	EReference getCO_Code();

	/**
	 * Returns the meta object for the attribute '{@link org.hl7.cdsdt.r2.CO#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.hl7.cdsdt.r2.CO#getValue()
	 * @see #getCO()
	 * @generated
	 */
	EAttribute getCO_Value();

	/**
	 * Returns the meta object for class '{@link org.hl7.cdsdt.r2.CS <em>CS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CS</em>'.
	 * @see org.hl7.cdsdt.r2.CS
	 * @generated
	 */
	EClass getCS();

	/**
	 * Returns the meta object for the attribute '{@link org.hl7.cdsdt.r2.CS#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see org.hl7.cdsdt.r2.CS#getCode()
	 * @see #getCS()
	 * @generated
	 */
	EAttribute getCS_Code();

	/**
	 * Returns the meta object for class '{@link org.hl7.cdsdt.r2.ED <em>ED</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ED</em>'.
	 * @see org.hl7.cdsdt.r2.ED
	 * @generated
	 */
	EClass getED();

	/**
	 * Returns the meta object for the attribute '{@link org.hl7.cdsdt.r2.ED#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data</em>'.
	 * @see org.hl7.cdsdt.r2.ED#getData()
	 * @see #getED()
	 * @generated
	 */
	EAttribute getED_Data();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.cdsdt.r2.ED#getXml <em>Xml</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Xml</em>'.
	 * @see org.hl7.cdsdt.r2.ED#getXml()
	 * @see #getED()
	 * @generated
	 */
	EReference getED_Xml();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.cdsdt.r2.ED#getReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Reference</em>'.
	 * @see org.hl7.cdsdt.r2.ED#getReference()
	 * @see #getED()
	 * @generated
	 */
	EReference getED_Reference();

	/**
	 * Returns the meta object for the attribute '{@link org.hl7.cdsdt.r2.ED#getIntegrityCheck <em>Integrity Check</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Integrity Check</em>'.
	 * @see org.hl7.cdsdt.r2.ED#getIntegrityCheck()
	 * @see #getED()
	 * @generated
	 */
	EAttribute getED_IntegrityCheck();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.cdsdt.r2.ED#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see org.hl7.cdsdt.r2.ED#getDescription()
	 * @see #getED()
	 * @generated
	 */
	EReference getED_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.hl7.cdsdt.r2.ED#getCharset <em>Charset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Charset</em>'.
	 * @see org.hl7.cdsdt.r2.ED#getCharset()
	 * @see #getED()
	 * @generated
	 */
	EAttribute getED_Charset();

	/**
	 * Returns the meta object for the attribute '{@link org.hl7.cdsdt.r2.ED#getCompression <em>Compression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Compression</em>'.
	 * @see org.hl7.cdsdt.r2.ED#getCompression()
	 * @see #getED()
	 * @generated
	 */
	EAttribute getED_Compression();

	/**
	 * Returns the meta object for the attribute '{@link org.hl7.cdsdt.r2.ED#getIntegrityCheckAlgorithm <em>Integrity Check Algorithm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Integrity Check Algorithm</em>'.
	 * @see org.hl7.cdsdt.r2.ED#getIntegrityCheckAlgorithm()
	 * @see #getED()
	 * @generated
	 */
	EAttribute getED_IntegrityCheckAlgorithm();

	/**
	 * Returns the meta object for the attribute '{@link org.hl7.cdsdt.r2.ED#getLanguage <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Language</em>'.
	 * @see org.hl7.cdsdt.r2.ED#getLanguage()
	 * @see #getED()
	 * @generated
	 */
	EAttribute getED_Language();

	/**
	 * Returns the meta object for the attribute '{@link org.hl7.cdsdt.r2.ED#getMediaType <em>Media Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Media Type</em>'.
	 * @see org.hl7.cdsdt.r2.ED#getMediaType()
	 * @see #getED()
	 * @generated
	 */
	EAttribute getED_MediaType();

	/**
	 * Returns the meta object for the attribute '{@link org.hl7.cdsdt.r2.ED#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.hl7.cdsdt.r2.ED#getValue()
	 * @see #getED()
	 * @generated
	 */
	EAttribute getED_Value();

	/**
	 * Returns the meta object for class '{@link org.hl7.cdsdt.r2.EN <em>EN</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EN</em>'.
	 * @see org.hl7.cdsdt.r2.EN
	 * @generated
	 */
	EClass getEN();

	/**
	 * Returns the meta object for the containment reference list '{@link org.hl7.cdsdt.r2.EN#getPart <em>Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Part</em>'.
	 * @see org.hl7.cdsdt.r2.EN#getPart()
	 * @see #getEN()
	 * @generated
	 */
	EReference getEN_Part();

	/**
	 * Returns the meta object for the attribute '{@link org.hl7.cdsdt.r2.EN#getUse <em>Use</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Use</em>'.
	 * @see org.hl7.cdsdt.r2.EN#getUse()
	 * @see #getEN()
	 * @generated
	 */
	EAttribute getEN_Use();

	/**
	 * Returns the meta object for class '{@link org.hl7.cdsdt.r2.ENXP <em>ENXP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ENXP</em>'.
	 * @see org.hl7.cdsdt.r2.ENXP
	 * @generated
	 */
	EClass getENXP();

	/**
	 * Returns the meta object for the attribute '{@link org.hl7.cdsdt.r2.ENXP#getQualifier <em>Qualifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Qualifier</em>'.
	 * @see org.hl7.cdsdt.r2.ENXP#getQualifier()
	 * @see #getENXP()
	 * @generated
	 */
	EAttribute getENXP_Qualifier();

	/**
	 * Returns the meta object for the attribute '{@link org.hl7.cdsdt.r2.ENXP#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.hl7.cdsdt.r2.ENXP#getType()
	 * @see #getENXP()
	 * @generated
	 */
	EAttribute getENXP_Type();

	/**
	 * Returns the meta object for class '{@link org.hl7.cdsdt.r2.HXIT <em>HXIT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HXIT</em>'.
	 * @see org.hl7.cdsdt.r2.HXIT
	 * @generated
	 */
	EClass getHXIT();

	/**
	 * Returns the meta object for class '{@link org.hl7.cdsdt.r2.II <em>II</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>II</em>'.
	 * @see org.hl7.cdsdt.r2.II
	 * @generated
	 */
	EClass getII();

	/**
	 * Returns the meta object for the attribute '{@link org.hl7.cdsdt.r2.II#getExtension <em>Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Extension</em>'.
	 * @see org.hl7.cdsdt.r2.II#getExtension()
	 * @see #getII()
	 * @generated
	 */
	EAttribute getII_Extension();

	/**
	 * Returns the meta object for the attribute '{@link org.hl7.cdsdt.r2.II#getIdentifierName <em>Identifier Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier Name</em>'.
	 * @see org.hl7.cdsdt.r2.II#getIdentifierName()
	 * @see #getII()
	 * @generated
	 */
	EAttribute getII_IdentifierName();

	/**
	 * Returns the meta object for the attribute '{@link org.hl7.cdsdt.r2.II#getRoot <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Root</em>'.
	 * @see org.hl7.cdsdt.r2.II#getRoot()
	 * @see #getII()
	 * @generated
	 */
	EAttribute getII_Root();

	/**
	 * Returns the meta object for class '{@link org.hl7.cdsdt.r2.INT <em>INT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>INT</em>'.
	 * @see org.hl7.cdsdt.r2.INT
	 * @generated
	 */
	EClass getINT();

	/**
	 * Returns the meta object for the attribute '{@link org.hl7.cdsdt.r2.INT#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.hl7.cdsdt.r2.INT#getValue()
	 * @see #getINT()
	 * @generated
	 */
	EAttribute getINT_Value();

	/**
	 * Returns the meta object for class '{@link org.hl7.cdsdt.r2.IVL <em>IVL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IVL</em>'.
	 * @see org.hl7.cdsdt.r2.IVL
	 * @generated
	 */
	EClass getIVL();

	/**
	 * Returns the meta object for class '{@link org.hl7.cdsdt.r2.IVLCO <em>IVLCO</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IVLCO</em>'.
	 * @see org.hl7.cdsdt.r2.IVLCO
	 * @generated
	 */
	EClass getIVLCO();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.cdsdt.r2.IVLCO#getLow <em>Low</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Low</em>'.
	 * @see org.hl7.cdsdt.r2.IVLCO#getLow()
	 * @see #getIVLCO()
	 * @generated
	 */
	EReference getIVLCO_Low();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.cdsdt.r2.IVLCO#getHigh <em>High</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>High</em>'.
	 * @see org.hl7.cdsdt.r2.IVLCO#getHigh()
	 * @see #getIVLCO()
	 * @generated
	 */
	EReference getIVLCO_High();

	/**
	 * Returns the meta object for the attribute '{@link org.hl7.cdsdt.r2.IVLCO#isHighClosed <em>High Closed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>High Closed</em>'.
	 * @see org.hl7.cdsdt.r2.IVLCO#isHighClosed()
	 * @see #getIVLCO()
	 * @generated
	 */
	EAttribute getIVLCO_HighClosed();

	/**
	 * Returns the meta object for the attribute '{@link org.hl7.cdsdt.r2.IVLCO#isLowClosed <em>Low Closed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Low Closed</em>'.
	 * @see org.hl7.cdsdt.r2.IVLCO#isLowClosed()
	 * @see #getIVLCO()
	 * @generated
	 */
	EAttribute getIVLCO_LowClosed();

	/**
	 * Returns the meta object for class '{@link org.hl7.cdsdt.r2.IVLINT <em>IVLINT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IVLINT</em>'.
	 * @see org.hl7.cdsdt.r2.IVLINT
	 * @generated
	 */
	EClass getIVLINT();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.cdsdt.r2.IVLINT#getLow <em>Low</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Low</em>'.
	 * @see org.hl7.cdsdt.r2.IVLINT#getLow()
	 * @see #getIVLINT()
	 * @generated
	 */
	EReference getIVLINT_Low();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.cdsdt.r2.IVLINT#getHigh <em>High</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>High</em>'.
	 * @see org.hl7.cdsdt.r2.IVLINT#getHigh()
	 * @see #getIVLINT()
	 * @generated
	 */
	EReference getIVLINT_High();

	/**
	 * Returns the meta object for the attribute '{@link org.hl7.cdsdt.r2.IVLINT#isHighClosed <em>High Closed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>High Closed</em>'.
	 * @see org.hl7.cdsdt.r2.IVLINT#isHighClosed()
	 * @see #getIVLINT()
	 * @generated
	 */
	EAttribute getIVLINT_HighClosed();

	/**
	 * Returns the meta object for the attribute '{@link org.hl7.cdsdt.r2.IVLINT#isLowClosed <em>Low Closed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Low Closed</em>'.
	 * @see org.hl7.cdsdt.r2.IVLINT#isLowClosed()
	 * @see #getIVLINT()
	 * @generated
	 */
	EAttribute getIVLINT_LowClosed();

	/**
	 * Returns the meta object for class '{@link org.hl7.cdsdt.r2.IVLPQ <em>IVLPQ</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IVLPQ</em>'.
	 * @see org.hl7.cdsdt.r2.IVLPQ
	 * @generated
	 */
	EClass getIVLPQ();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.cdsdt.r2.IVLPQ#getLow <em>Low</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Low</em>'.
	 * @see org.hl7.cdsdt.r2.IVLPQ#getLow()
	 * @see #getIVLPQ()
	 * @generated
	 */
	EReference getIVLPQ_Low();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.cdsdt.r2.IVLPQ#getHigh <em>High</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>High</em>'.
	 * @see org.hl7.cdsdt.r2.IVLPQ#getHigh()
	 * @see #getIVLPQ()
	 * @generated
	 */
	EReference getIVLPQ_High();

	/**
	 * Returns the meta object for the attribute '{@link org.hl7.cdsdt.r2.IVLPQ#isHighClosed <em>High Closed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>High Closed</em>'.
	 * @see org.hl7.cdsdt.r2.IVLPQ#isHighClosed()
	 * @see #getIVLPQ()
	 * @generated
	 */
	EAttribute getIVLPQ_HighClosed();

	/**
	 * Returns the meta object for the attribute '{@link org.hl7.cdsdt.r2.IVLPQ#isLowClosed <em>Low Closed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Low Closed</em>'.
	 * @see org.hl7.cdsdt.r2.IVLPQ#isLowClosed()
	 * @see #getIVLPQ()
	 * @generated
	 */
	EAttribute getIVLPQ_LowClosed();

	/**
	 * Returns the meta object for class '{@link org.hl7.cdsdt.r2.IVLQTY <em>IVLQTY</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IVLQTY</em>'.
	 * @see org.hl7.cdsdt.r2.IVLQTY
	 * @generated
	 */
	EClass getIVLQTY();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.cdsdt.r2.IVLQTY#getLow <em>Low</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Low</em>'.
	 * @see org.hl7.cdsdt.r2.IVLQTY#getLow()
	 * @see #getIVLQTY()
	 * @generated
	 */
	EReference getIVLQTY_Low();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.cdsdt.r2.IVLQTY#getHigh <em>High</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>High</em>'.
	 * @see org.hl7.cdsdt.r2.IVLQTY#getHigh()
	 * @see #getIVLQTY()
	 * @generated
	 */
	EReference getIVLQTY_High();

	/**
	 * Returns the meta object for the attribute '{@link org.hl7.cdsdt.r2.IVLQTY#isHighClosed <em>High Closed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>High Closed</em>'.
	 * @see org.hl7.cdsdt.r2.IVLQTY#isHighClosed()
	 * @see #getIVLQTY()
	 * @generated
	 */
	EAttribute getIVLQTY_HighClosed();

	/**
	 * Returns the meta object for the attribute '{@link org.hl7.cdsdt.r2.IVLQTY#isLowClosed <em>Low Closed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Low Closed</em>'.
	 * @see org.hl7.cdsdt.r2.IVLQTY#isLowClosed()
	 * @see #getIVLQTY()
	 * @generated
	 */
	EAttribute getIVLQTY_LowClosed();

	/**
	 * Returns the meta object for class '{@link org.hl7.cdsdt.r2.IVLREAL <em>IVLREAL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IVLREAL</em>'.
	 * @see org.hl7.cdsdt.r2.IVLREAL
	 * @generated
	 */
	EClass getIVLREAL();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.cdsdt.r2.IVLREAL#getLow <em>Low</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Low</em>'.
	 * @see org.hl7.cdsdt.r2.IVLREAL#getLow()
	 * @see #getIVLREAL()
	 * @generated
	 */
	EReference getIVLREAL_Low();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.cdsdt.r2.IVLREAL#getHigh <em>High</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>High</em>'.
	 * @see org.hl7.cdsdt.r2.IVLREAL#getHigh()
	 * @see #getIVLREAL()
	 * @generated
	 */
	EReference getIVLREAL_High();

	/**
	 * Returns the meta object for the attribute '{@link org.hl7.cdsdt.r2.IVLREAL#isHighClosed <em>High Closed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>High Closed</em>'.
	 * @see org.hl7.cdsdt.r2.IVLREAL#isHighClosed()
	 * @see #getIVLREAL()
	 * @generated
	 */
	EAttribute getIVLREAL_HighClosed();

	/**
	 * Returns the meta object for the attribute '{@link org.hl7.cdsdt.r2.IVLREAL#isLowClosed <em>Low Closed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Low Closed</em>'.
	 * @see org.hl7.cdsdt.r2.IVLREAL#isLowClosed()
	 * @see #getIVLREAL()
	 * @generated
	 */
	EAttribute getIVLREAL_LowClosed();

	/**
	 * Returns the meta object for class '{@link org.hl7.cdsdt.r2.IVLTS <em>IVLTS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IVLTS</em>'.
	 * @see org.hl7.cdsdt.r2.IVLTS
	 * @generated
	 */
	EClass getIVLTS();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.cdsdt.r2.IVLTS#getLow <em>Low</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Low</em>'.
	 * @see org.hl7.cdsdt.r2.IVLTS#getLow()
	 * @see #getIVLTS()
	 * @generated
	 */
	EReference getIVLTS_Low();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.cdsdt.r2.IVLTS#getHigh <em>High</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>High</em>'.
	 * @see org.hl7.cdsdt.r2.IVLTS#getHigh()
	 * @see #getIVLTS()
	 * @generated
	 */
	EReference getIVLTS_High();

	/**
	 * Returns the meta object for the attribute '{@link org.hl7.cdsdt.r2.IVLTS#isHighClosed <em>High Closed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>High Closed</em>'.
	 * @see org.hl7.cdsdt.r2.IVLTS#isHighClosed()
	 * @see #getIVLTS()
	 * @generated
	 */
	EAttribute getIVLTS_HighClosed();

	/**
	 * Returns the meta object for the attribute '{@link org.hl7.cdsdt.r2.IVLTS#isLowClosed <em>Low Closed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Low Closed</em>'.
	 * @see org.hl7.cdsdt.r2.IVLTS#isLowClosed()
	 * @see #getIVLTS()
	 * @generated
	 */
	EAttribute getIVLTS_LowClosed();

	/**
	 * Returns the meta object for class '{@link org.hl7.cdsdt.r2.PIVLTS <em>PIVLTS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PIVLTS</em>'.
	 * @see org.hl7.cdsdt.r2.PIVLTS
	 * @generated
	 */
	EClass getPIVLTS();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.cdsdt.r2.PIVLTS#getPhase <em>Phase</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Phase</em>'.
	 * @see org.hl7.cdsdt.r2.PIVLTS#getPhase()
	 * @see #getPIVLTS()
	 * @generated
	 */
	EReference getPIVLTS_Phase();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.cdsdt.r2.PIVLTS#getPeriod <em>Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Period</em>'.
	 * @see org.hl7.cdsdt.r2.PIVLTS#getPeriod()
	 * @see #getPIVLTS()
	 * @generated
	 */
	EReference getPIVLTS_Period();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.cdsdt.r2.PIVLTS#getFrequency <em>Frequency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Frequency</em>'.
	 * @see org.hl7.cdsdt.r2.PIVLTS#getFrequency()
	 * @see #getPIVLTS()
	 * @generated
	 */
	EReference getPIVLTS_Frequency();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.cdsdt.r2.PIVLTS#getCount <em>Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Count</em>'.
	 * @see org.hl7.cdsdt.r2.PIVLTS#getCount()
	 * @see #getPIVLTS()
	 * @generated
	 */
	EReference getPIVLTS_Count();

	/**
	 * Returns the meta object for the attribute '{@link org.hl7.cdsdt.r2.PIVLTS#getAlignment <em>Alignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alignment</em>'.
	 * @see org.hl7.cdsdt.r2.PIVLTS#getAlignment()
	 * @see #getPIVLTS()
	 * @generated
	 */
	EAttribute getPIVLTS_Alignment();

	/**
	 * Returns the meta object for the attribute '{@link org.hl7.cdsdt.r2.PIVLTS#isIsFlexible <em>Is Flexible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Flexible</em>'.
	 * @see org.hl7.cdsdt.r2.PIVLTS#isIsFlexible()
	 * @see #getPIVLTS()
	 * @generated
	 */
	EAttribute getPIVLTS_IsFlexible();

	/**
	 * Returns the meta object for class '{@link org.hl7.cdsdt.r2.PQ <em>PQ</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PQ</em>'.
	 * @see org.hl7.cdsdt.r2.PQ
	 * @generated
	 */
	EClass getPQ();

	/**
	 * Returns the meta object for the attribute '{@link org.hl7.cdsdt.r2.PQ#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see org.hl7.cdsdt.r2.PQ#getUnit()
	 * @see #getPQ()
	 * @generated
	 */
	EAttribute getPQ_Unit();

	/**
	 * Returns the meta object for the attribute '{@link org.hl7.cdsdt.r2.PQ#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.hl7.cdsdt.r2.PQ#getValue()
	 * @see #getPQ()
	 * @generated
	 */
	EAttribute getPQ_Value();

	/**
	 * Returns the meta object for class '{@link org.hl7.cdsdt.r2.QSET <em>QSET</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>QSET</em>'.
	 * @see org.hl7.cdsdt.r2.QSET
	 * @generated
	 */
	EClass getQSET();

	/**
	 * Returns the meta object for class '{@link org.hl7.cdsdt.r2.QTY <em>QTY</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>QTY</em>'.
	 * @see org.hl7.cdsdt.r2.QTY
	 * @generated
	 */
	EClass getQTY();

	/**
	 * Returns the meta object for class '{@link org.hl7.cdsdt.r2.REAL <em>REAL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>REAL</em>'.
	 * @see org.hl7.cdsdt.r2.REAL
	 * @generated
	 */
	EClass getREAL();

	/**
	 * Returns the meta object for the attribute '{@link org.hl7.cdsdt.r2.REAL#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.hl7.cdsdt.r2.REAL#getValue()
	 * @see #getREAL()
	 * @generated
	 */
	EAttribute getREAL_Value();

	/**
	 * Returns the meta object for class '{@link org.hl7.cdsdt.r2.RTO <em>RTO</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RTO</em>'.
	 * @see org.hl7.cdsdt.r2.RTO
	 * @generated
	 */
	EClass getRTO();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.cdsdt.r2.RTO#getNumerator <em>Numerator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Numerator</em>'.
	 * @see org.hl7.cdsdt.r2.RTO#getNumerator()
	 * @see #getRTO()
	 * @generated
	 */
	EReference getRTO_Numerator();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.cdsdt.r2.RTO#getDenominator <em>Denominator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Denominator</em>'.
	 * @see org.hl7.cdsdt.r2.RTO#getDenominator()
	 * @see #getRTO()
	 * @generated
	 */
	EReference getRTO_Denominator();

	/**
	 * Returns the meta object for class '{@link org.hl7.cdsdt.r2.ST <em>ST</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ST</em>'.
	 * @see org.hl7.cdsdt.r2.ST
	 * @generated
	 */
	EClass getST();

	/**
	 * Returns the meta object for the attribute '{@link org.hl7.cdsdt.r2.ST#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.hl7.cdsdt.r2.ST#getValue()
	 * @see #getST()
	 * @generated
	 */
	EAttribute getST_Value();

	/**
	 * Returns the meta object for class '{@link org.hl7.cdsdt.r2.TEL <em>TEL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TEL</em>'.
	 * @see org.hl7.cdsdt.r2.TEL
	 * @generated
	 */
	EClass getTEL();

	/**
	 * Returns the meta object for the attribute '{@link org.hl7.cdsdt.r2.TEL#getCapabilities <em>Capabilities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Capabilities</em>'.
	 * @see org.hl7.cdsdt.r2.TEL#getCapabilities()
	 * @see #getTEL()
	 * @generated
	 */
	EAttribute getTEL_Capabilities();

	/**
	 * Returns the meta object for the attribute '{@link org.hl7.cdsdt.r2.TEL#getUse <em>Use</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Use</em>'.
	 * @see org.hl7.cdsdt.r2.TEL#getUse()
	 * @see #getTEL()
	 * @generated
	 */
	EAttribute getTEL_Use();

	/**
	 * Returns the meta object for the attribute '{@link org.hl7.cdsdt.r2.TEL#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.hl7.cdsdt.r2.TEL#getValue()
	 * @see #getTEL()
	 * @generated
	 */
	EAttribute getTEL_Value();

	/**
	 * Returns the meta object for class '{@link org.hl7.cdsdt.r2.TS <em>TS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TS</em>'.
	 * @see org.hl7.cdsdt.r2.TS
	 * @generated
	 */
	EClass getTS();

	/**
	 * Returns the meta object for the attribute '{@link org.hl7.cdsdt.r2.TS#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.hl7.cdsdt.r2.TS#getValue()
	 * @see #getTS()
	 * @generated
	 */
	EAttribute getTS_Value();

	/**
	 * Returns the meta object for class '{@link org.hl7.cdsdt.r2.XP <em>XP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XP</em>'.
	 * @see org.hl7.cdsdt.r2.XP
	 * @generated
	 */
	EClass getXP();

	/**
	 * Returns the meta object for the attribute '{@link org.hl7.cdsdt.r2.XP#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.hl7.cdsdt.r2.XP#getValue()
	 * @see #getXP()
	 * @generated
	 */
	EAttribute getXP_Value();

	/**
	 * Returns the meta object for enum '{@link org.hl7.cdsdt.r2.AddressPartType <em>Address Part Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Address Part Type</em>'.
	 * @see org.hl7.cdsdt.r2.AddressPartType
	 * @generated
	 */
	EEnum getAddressPartType();

	/**
	 * Returns the meta object for enum '{@link org.hl7.cdsdt.r2.CalendarCycle <em>Calendar Cycle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Calendar Cycle</em>'.
	 * @see org.hl7.cdsdt.r2.CalendarCycle
	 * @generated
	 */
	EEnum getCalendarCycle();

	/**
	 * Returns the meta object for enum '{@link org.hl7.cdsdt.r2.Compression <em>Compression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Compression</em>'.
	 * @see org.hl7.cdsdt.r2.Compression
	 * @generated
	 */
	EEnum getCompression();

	/**
	 * Returns the meta object for enum '{@link org.hl7.cdsdt.r2.EntityNamePartQualifier <em>Entity Name Part Qualifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Entity Name Part Qualifier</em>'.
	 * @see org.hl7.cdsdt.r2.EntityNamePartQualifier
	 * @generated
	 */
	EEnum getEntityNamePartQualifier();

	/**
	 * Returns the meta object for enum '{@link org.hl7.cdsdt.r2.EntityNamePartType <em>Entity Name Part Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Entity Name Part Type</em>'.
	 * @see org.hl7.cdsdt.r2.EntityNamePartType
	 * @generated
	 */
	EEnum getEntityNamePartType();

	/**
	 * Returns the meta object for enum '{@link org.hl7.cdsdt.r2.EntityNameUse <em>Entity Name Use</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Entity Name Use</em>'.
	 * @see org.hl7.cdsdt.r2.EntityNameUse
	 * @generated
	 */
	EEnum getEntityNameUse();

	/**
	 * Returns the meta object for enum '{@link org.hl7.cdsdt.r2.IntegrityCheckAlgorithm <em>Integrity Check Algorithm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Integrity Check Algorithm</em>'.
	 * @see org.hl7.cdsdt.r2.IntegrityCheckAlgorithm
	 * @generated
	 */
	EEnum getIntegrityCheckAlgorithm();

	/**
	 * Returns the meta object for enum '{@link org.hl7.cdsdt.r2.PostalAddressUse <em>Postal Address Use</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Postal Address Use</em>'.
	 * @see org.hl7.cdsdt.r2.PostalAddressUse
	 * @generated
	 */
	EEnum getPostalAddressUse();

	/**
	 * Returns the meta object for enum '{@link org.hl7.cdsdt.r2.TelecommunicationAddressUse <em>Telecommunication Address Use</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Telecommunication Address Use</em>'.
	 * @see org.hl7.cdsdt.r2.TelecommunicationAddressUse
	 * @generated
	 */
	EEnum getTelecommunicationAddressUse();

	/**
	 * Returns the meta object for enum '{@link org.hl7.cdsdt.r2.TelecommunicationCapability <em>Telecommunication Capability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Telecommunication Capability</em>'.
	 * @see org.hl7.cdsdt.r2.TelecommunicationCapability
	 * @generated
	 */
	EEnum getTelecommunicationCapability();

	/**
	 * Returns the meta object for data type '{@link org.hl7.cdsdt.r2.AddressPartType <em>Address Part Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Address Part Type Object</em>'.
	 * @see org.hl7.cdsdt.r2.AddressPartType
	 * @model instanceClass="org.hl7.cdsdt.r2.AddressPartType"
	 *        extendedMetaData="name='AddressPartType:Object' baseType='AddressPartType'"
	 * @generated
	 */
	EDataType getAddressPartTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.hl7.cdsdt.r2.CalendarCycle <em>Calendar Cycle Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Calendar Cycle Object</em>'.
	 * @see org.hl7.cdsdt.r2.CalendarCycle
	 * @model instanceClass="org.hl7.cdsdt.r2.CalendarCycle"
	 *        extendedMetaData="name='CalendarCycle:Object' baseType='CalendarCycle'"
	 * @generated
	 */
	EDataType getCalendarCycleObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Code</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='Code' baseType='http://www.eclipse.org/emf/2003/XMLType#string'"
	 * @generated
	 */
	EDataType getCode();

	/**
	 * Returns the meta object for data type '{@link org.hl7.cdsdt.r2.Compression <em>Compression Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Compression Object</em>'.
	 * @see org.hl7.cdsdt.r2.Compression
	 * @model instanceClass="org.hl7.cdsdt.r2.Compression"
	 *        extendedMetaData="name='Compression:Object' baseType='Compression'"
	 * @generated
	 */
	EDataType getCompressionObject();

	/**
	 * Returns the meta object for data type '<em>Decimal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Decimal</em>'.
	 * @model instanceClass="double"
	 *        extendedMetaData="name='Decimal' baseType='http://www.eclipse.org/emf/2003/XMLType#double'"
	 * @generated
	 */
	EDataType getDecimal();

	/**
	 * Returns the meta object for data type '{@link java.lang.Double <em>Decimal Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Decimal Object</em>'.
	 * @see java.lang.Double
	 * @model instanceClass="java.lang.Double"
	 *        extendedMetaData="name='Decimal:Object' baseType='Decimal'"
	 * @generated
	 */
	EDataType getDecimalObject();

	/**
	 * Returns the meta object for data type '{@link org.hl7.cdsdt.r2.EntityNamePartQualifier <em>Entity Name Part Qualifier Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Entity Name Part Qualifier Object</em>'.
	 * @see org.hl7.cdsdt.r2.EntityNamePartQualifier
	 * @model instanceClass="org.hl7.cdsdt.r2.EntityNamePartQualifier"
	 *        extendedMetaData="name='EntityNamePartQualifier:Object' baseType='EntityNamePartQualifier'"
	 * @generated
	 */
	EDataType getEntityNamePartQualifierObject();

	/**
	 * Returns the meta object for data type '{@link org.hl7.cdsdt.r2.EntityNamePartType <em>Entity Name Part Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Entity Name Part Type Object</em>'.
	 * @see org.hl7.cdsdt.r2.EntityNamePartType
	 * @model instanceClass="org.hl7.cdsdt.r2.EntityNamePartType"
	 *        extendedMetaData="name='EntityNamePartType:Object' baseType='EntityNamePartType'"
	 * @generated
	 */
	EDataType getEntityNamePartTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.hl7.cdsdt.r2.EntityNameUse <em>Entity Name Use Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Entity Name Use Object</em>'.
	 * @see org.hl7.cdsdt.r2.EntityNameUse
	 * @model instanceClass="org.hl7.cdsdt.r2.EntityNameUse"
	 *        extendedMetaData="name='EntityNameUse:Object' baseType='EntityNameUse'"
	 * @generated
	 */
	EDataType getEntityNameUseObject();

	/**
	 * Returns the meta object for data type '{@link org.hl7.cdsdt.r2.IntegrityCheckAlgorithm <em>Integrity Check Algorithm Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Integrity Check Algorithm Object</em>'.
	 * @see org.hl7.cdsdt.r2.IntegrityCheckAlgorithm
	 * @model instanceClass="org.hl7.cdsdt.r2.IntegrityCheckAlgorithm"
	 *        extendedMetaData="name='IntegrityCheckAlgorithm:Object' baseType='IntegrityCheckAlgorithm'"
	 * @generated
	 */
	EDataType getIntegrityCheckAlgorithmObject();

	/**
	 * Returns the meta object for data type '{@link org.hl7.cdsdt.r2.PostalAddressUse <em>Postal Address Use Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Postal Address Use Object</em>'.
	 * @see org.hl7.cdsdt.r2.PostalAddressUse
	 * @model instanceClass="org.hl7.cdsdt.r2.PostalAddressUse"
	 *        extendedMetaData="name='PostalAddressUse:Object' baseType='PostalAddressUse'"
	 * @generated
	 */
	EDataType getPostalAddressUseObject();

	/**
	 * Returns the meta object for data type '{@link java.util.List <em>Set Entity Name Part Qualifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Set Entity Name Part Qualifier</em>'.
	 * @see java.util.List
	 * @model instanceClass="java.util.List"
	 *        extendedMetaData="name='set_EntityNamePartQualifier' itemType='EntityNamePartQualifier'"
	 * @generated
	 */
	EDataType getSetEntityNamePartQualifier();

	/**
	 * Returns the meta object for data type '{@link java.util.List <em>Set Entity Name Use</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Set Entity Name Use</em>'.
	 * @see java.util.List
	 * @model instanceClass="java.util.List"
	 *        extendedMetaData="name='set_EntityNameUse' itemType='EntityNameUse'"
	 * @generated
	 */
	EDataType getSetEntityNameUse();

	/**
	 * Returns the meta object for data type '{@link java.util.List <em>Set Postal Address Use</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Set Postal Address Use</em>'.
	 * @see java.util.List
	 * @model instanceClass="java.util.List"
	 *        extendedMetaData="name='set_PostalAddressUse' itemType='PostalAddressUse'"
	 * @generated
	 */
	EDataType getSetPostalAddressUse();

	/**
	 * Returns the meta object for data type '{@link java.util.List <em>Set Telecommunication Address Use</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Set Telecommunication Address Use</em>'.
	 * @see java.util.List
	 * @model instanceClass="java.util.List"
	 *        extendedMetaData="name='set_TelecommunicationAddressUse' itemType='TelecommunicationAddressUse'"
	 * @generated
	 */
	EDataType getSetTelecommunicationAddressUse();

	/**
	 * Returns the meta object for data type '{@link java.util.List <em>Set Telecommunication Capability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Set Telecommunication Capability</em>'.
	 * @see java.util.List
	 * @model instanceClass="java.util.List"
	 *        extendedMetaData="name='set_TelecommunicationCapability' itemType='TelecommunicationCapability'"
	 * @generated
	 */
	EDataType getSetTelecommunicationCapability();

	/**
	 * Returns the meta object for data type '{@link org.hl7.cdsdt.r2.TelecommunicationAddressUse <em>Telecommunication Address Use Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Telecommunication Address Use Object</em>'.
	 * @see org.hl7.cdsdt.r2.TelecommunicationAddressUse
	 * @model instanceClass="org.hl7.cdsdt.r2.TelecommunicationAddressUse"
	 *        extendedMetaData="name='TelecommunicationAddressUse:Object' baseType='TelecommunicationAddressUse'"
	 * @generated
	 */
	EDataType getTelecommunicationAddressUseObject();

	/**
	 * Returns the meta object for data type '{@link org.hl7.cdsdt.r2.TelecommunicationCapability <em>Telecommunication Capability Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Telecommunication Capability Object</em>'.
	 * @see org.hl7.cdsdt.r2.TelecommunicationCapability
	 * @model instanceClass="org.hl7.cdsdt.r2.TelecommunicationCapability"
	 *        extendedMetaData="name='TelecommunicationCapability:Object' baseType='TelecommunicationCapability'"
	 * @generated
	 */
	EDataType getTelecommunicationCapabilityObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Time Stamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Time Stamp</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='TimeStamp' baseType='http://www.eclipse.org/emf/2003/XMLType#string' pattern='[1-2][0-9]{3,3}(((0[1-9])|(1[0-2]))(((0[1-9])|([1-2][0-9])|(3[0-1]))((([0-1][0-9])|(2[0-3]))(([0-5][0-9])(([0-5][0-9])(\\.[0-9]{1,4})?)?)?)?)?)?([+\\-](0[0-9]|1[0-3])([0-5][0-9]))?'"
	 * @generated
	 */
	EDataType getTimeStamp();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Uid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Uid</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='Uid' baseType='http://www.eclipse.org/emf/2003/XMLType#string'"
	 * @generated
	 */
	EDataType getUid();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Uri</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='Uri' baseType='http://www.eclipse.org/emf/2003/XMLType#string'"
	 * @generated
	 */
	EDataType getUri();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	R2Factory getR2Factory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.hl7.cdsdt.r2.impl.ADImpl <em>AD</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.cdsdt.r2.impl.ADImpl
		 * @see org.hl7.cdsdt.r2.impl.R2PackageImpl#getAD()
		 * @generated
		 */
		EClass AD = eINSTANCE.getAD();

		/**
		 * The meta object literal for the '<em><b>Part</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AD__PART = eINSTANCE.getAD_Part();

		/**
		 * The meta object literal for the '<em><b>Use</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AD__USE = eINSTANCE.getAD_Use();

		/**
		 * The meta object literal for the '{@link org.hl7.cdsdt.r2.impl.ADXPImpl <em>ADXP</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.cdsdt.r2.impl.ADXPImpl
		 * @see org.hl7.cdsdt.r2.impl.R2PackageImpl#getADXP()
		 * @generated
		 */
		EClass ADXP = eINSTANCE.getADXP();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADXP__TYPE = eINSTANCE.getADXP_Type();

		/**
		 * The meta object literal for the '{@link org.hl7.cdsdt.r2.impl.ANYImpl <em>ANY</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.cdsdt.r2.impl.ANYImpl
		 * @see org.hl7.cdsdt.r2.impl.R2PackageImpl#getANY()
		 * @generated
		 */
		EClass ANY = eINSTANCE.getANY();

		/**
		 * The meta object literal for the '{@link org.hl7.cdsdt.r2.impl.BLImpl <em>BL</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.cdsdt.r2.impl.BLImpl
		 * @see org.hl7.cdsdt.r2.impl.R2PackageImpl#getBL()
		 * @generated
		 */
		EClass BL = eINSTANCE.getBL();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BL__VALUE = eINSTANCE.getBL_Value();

		/**
		 * The meta object literal for the '{@link org.hl7.cdsdt.r2.impl.CDImpl <em>CD</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.cdsdt.r2.impl.CDImpl
		 * @see org.hl7.cdsdt.r2.impl.R2PackageImpl#getCD()
		 * @generated
		 */
		EClass CD = eINSTANCE.getCD();

		/**
		 * The meta object literal for the '<em><b>Display Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CD__DISPLAY_NAME = eINSTANCE.getCD_DisplayName();

		/**
		 * The meta object literal for the '<em><b>Original Text</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CD__ORIGINAL_TEXT = eINSTANCE.getCD_OriginalText();

		/**
		 * The meta object literal for the '<em><b>Translation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CD__TRANSLATION = eINSTANCE.getCD_Translation();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CD__CODE = eINSTANCE.getCD_Code();

		/**
		 * The meta object literal for the '<em><b>Code System</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CD__CODE_SYSTEM = eINSTANCE.getCD_CodeSystem();

		/**
		 * The meta object literal for the '<em><b>Code System Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CD__CODE_SYSTEM_NAME = eINSTANCE.getCD_CodeSystemName();

		/**
		 * The meta object literal for the '<em><b>Code System Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CD__CODE_SYSTEM_VERSION = eINSTANCE.getCD_CodeSystemVersion();

		/**
		 * The meta object literal for the '<em><b>Value Set</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CD__VALUE_SET = eINSTANCE.getCD_ValueSet();

		/**
		 * The meta object literal for the '<em><b>Value Set Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CD__VALUE_SET_VERSION = eINSTANCE.getCD_ValueSetVersion();

		/**
		 * The meta object literal for the '{@link org.hl7.cdsdt.r2.impl.COImpl <em>CO</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.cdsdt.r2.impl.COImpl
		 * @see org.hl7.cdsdt.r2.impl.R2PackageImpl#getCO()
		 * @generated
		 */
		EClass CO = eINSTANCE.getCO();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CO__CODE = eINSTANCE.getCO_Code();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CO__VALUE = eINSTANCE.getCO_Value();

		/**
		 * The meta object literal for the '{@link org.hl7.cdsdt.r2.impl.CSImpl <em>CS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.cdsdt.r2.impl.CSImpl
		 * @see org.hl7.cdsdt.r2.impl.R2PackageImpl#getCS()
		 * @generated
		 */
		EClass CS = eINSTANCE.getCS();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CS__CODE = eINSTANCE.getCS_Code();

		/**
		 * The meta object literal for the '{@link org.hl7.cdsdt.r2.impl.EDImpl <em>ED</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.cdsdt.r2.impl.EDImpl
		 * @see org.hl7.cdsdt.r2.impl.R2PackageImpl#getED()
		 * @generated
		 */
		EClass ED = eINSTANCE.getED();

		/**
		 * The meta object literal for the '<em><b>Data</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ED__DATA = eINSTANCE.getED_Data();

		/**
		 * The meta object literal for the '<em><b>Xml</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ED__XML = eINSTANCE.getED_Xml();

		/**
		 * The meta object literal for the '<em><b>Reference</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ED__REFERENCE = eINSTANCE.getED_Reference();

		/**
		 * The meta object literal for the '<em><b>Integrity Check</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ED__INTEGRITY_CHECK = eINSTANCE.getED_IntegrityCheck();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ED__DESCRIPTION = eINSTANCE.getED_Description();

		/**
		 * The meta object literal for the '<em><b>Charset</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ED__CHARSET = eINSTANCE.getED_Charset();

		/**
		 * The meta object literal for the '<em><b>Compression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ED__COMPRESSION = eINSTANCE.getED_Compression();

		/**
		 * The meta object literal for the '<em><b>Integrity Check Algorithm</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ED__INTEGRITY_CHECK_ALGORITHM = eINSTANCE.getED_IntegrityCheckAlgorithm();

		/**
		 * The meta object literal for the '<em><b>Language</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ED__LANGUAGE = eINSTANCE.getED_Language();

		/**
		 * The meta object literal for the '<em><b>Media Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ED__MEDIA_TYPE = eINSTANCE.getED_MediaType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ED__VALUE = eINSTANCE.getED_Value();

		/**
		 * The meta object literal for the '{@link org.hl7.cdsdt.r2.impl.ENImpl <em>EN</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.cdsdt.r2.impl.ENImpl
		 * @see org.hl7.cdsdt.r2.impl.R2PackageImpl#getEN()
		 * @generated
		 */
		EClass EN = eINSTANCE.getEN();

		/**
		 * The meta object literal for the '<em><b>Part</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EN__PART = eINSTANCE.getEN_Part();

		/**
		 * The meta object literal for the '<em><b>Use</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EN__USE = eINSTANCE.getEN_Use();

		/**
		 * The meta object literal for the '{@link org.hl7.cdsdt.r2.impl.ENXPImpl <em>ENXP</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.cdsdt.r2.impl.ENXPImpl
		 * @see org.hl7.cdsdt.r2.impl.R2PackageImpl#getENXP()
		 * @generated
		 */
		EClass ENXP = eINSTANCE.getENXP();

		/**
		 * The meta object literal for the '<em><b>Qualifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENXP__QUALIFIER = eINSTANCE.getENXP_Qualifier();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENXP__TYPE = eINSTANCE.getENXP_Type();

		/**
		 * The meta object literal for the '{@link org.hl7.cdsdt.r2.impl.HXITImpl <em>HXIT</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.cdsdt.r2.impl.HXITImpl
		 * @see org.hl7.cdsdt.r2.impl.R2PackageImpl#getHXIT()
		 * @generated
		 */
		EClass HXIT = eINSTANCE.getHXIT();

		/**
		 * The meta object literal for the '{@link org.hl7.cdsdt.r2.impl.IIImpl <em>II</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.cdsdt.r2.impl.IIImpl
		 * @see org.hl7.cdsdt.r2.impl.R2PackageImpl#getII()
		 * @generated
		 */
		EClass II = eINSTANCE.getII();

		/**
		 * The meta object literal for the '<em><b>Extension</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute II__EXTENSION = eINSTANCE.getII_Extension();

		/**
		 * The meta object literal for the '<em><b>Identifier Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute II__IDENTIFIER_NAME = eINSTANCE.getII_IdentifierName();

		/**
		 * The meta object literal for the '<em><b>Root</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute II__ROOT = eINSTANCE.getII_Root();

		/**
		 * The meta object literal for the '{@link org.hl7.cdsdt.r2.impl.INTImpl <em>INT</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.cdsdt.r2.impl.INTImpl
		 * @see org.hl7.cdsdt.r2.impl.R2PackageImpl#getINT()
		 * @generated
		 */
		EClass INT = eINSTANCE.getINT();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INT__VALUE = eINSTANCE.getINT_Value();

		/**
		 * The meta object literal for the '{@link org.hl7.cdsdt.r2.impl.IVLImpl <em>IVL</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.cdsdt.r2.impl.IVLImpl
		 * @see org.hl7.cdsdt.r2.impl.R2PackageImpl#getIVL()
		 * @generated
		 */
		EClass IVL = eINSTANCE.getIVL();

		/**
		 * The meta object literal for the '{@link org.hl7.cdsdt.r2.impl.IVLCOImpl <em>IVLCO</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.cdsdt.r2.impl.IVLCOImpl
		 * @see org.hl7.cdsdt.r2.impl.R2PackageImpl#getIVLCO()
		 * @generated
		 */
		EClass IVLCO = eINSTANCE.getIVLCO();

		/**
		 * The meta object literal for the '<em><b>Low</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IVLCO__LOW = eINSTANCE.getIVLCO_Low();

		/**
		 * The meta object literal for the '<em><b>High</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IVLCO__HIGH = eINSTANCE.getIVLCO_High();

		/**
		 * The meta object literal for the '<em><b>High Closed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IVLCO__HIGH_CLOSED = eINSTANCE.getIVLCO_HighClosed();

		/**
		 * The meta object literal for the '<em><b>Low Closed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IVLCO__LOW_CLOSED = eINSTANCE.getIVLCO_LowClosed();

		/**
		 * The meta object literal for the '{@link org.hl7.cdsdt.r2.impl.IVLINTImpl <em>IVLINT</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.cdsdt.r2.impl.IVLINTImpl
		 * @see org.hl7.cdsdt.r2.impl.R2PackageImpl#getIVLINT()
		 * @generated
		 */
		EClass IVLINT = eINSTANCE.getIVLINT();

		/**
		 * The meta object literal for the '<em><b>Low</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IVLINT__LOW = eINSTANCE.getIVLINT_Low();

		/**
		 * The meta object literal for the '<em><b>High</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IVLINT__HIGH = eINSTANCE.getIVLINT_High();

		/**
		 * The meta object literal for the '<em><b>High Closed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IVLINT__HIGH_CLOSED = eINSTANCE.getIVLINT_HighClosed();

		/**
		 * The meta object literal for the '<em><b>Low Closed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IVLINT__LOW_CLOSED = eINSTANCE.getIVLINT_LowClosed();

		/**
		 * The meta object literal for the '{@link org.hl7.cdsdt.r2.impl.IVLPQImpl <em>IVLPQ</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.cdsdt.r2.impl.IVLPQImpl
		 * @see org.hl7.cdsdt.r2.impl.R2PackageImpl#getIVLPQ()
		 * @generated
		 */
		EClass IVLPQ = eINSTANCE.getIVLPQ();

		/**
		 * The meta object literal for the '<em><b>Low</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IVLPQ__LOW = eINSTANCE.getIVLPQ_Low();

		/**
		 * The meta object literal for the '<em><b>High</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IVLPQ__HIGH = eINSTANCE.getIVLPQ_High();

		/**
		 * The meta object literal for the '<em><b>High Closed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IVLPQ__HIGH_CLOSED = eINSTANCE.getIVLPQ_HighClosed();

		/**
		 * The meta object literal for the '<em><b>Low Closed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IVLPQ__LOW_CLOSED = eINSTANCE.getIVLPQ_LowClosed();

		/**
		 * The meta object literal for the '{@link org.hl7.cdsdt.r2.impl.IVLQTYImpl <em>IVLQTY</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.cdsdt.r2.impl.IVLQTYImpl
		 * @see org.hl7.cdsdt.r2.impl.R2PackageImpl#getIVLQTY()
		 * @generated
		 */
		EClass IVLQTY = eINSTANCE.getIVLQTY();

		/**
		 * The meta object literal for the '<em><b>Low</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IVLQTY__LOW = eINSTANCE.getIVLQTY_Low();

		/**
		 * The meta object literal for the '<em><b>High</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IVLQTY__HIGH = eINSTANCE.getIVLQTY_High();

		/**
		 * The meta object literal for the '<em><b>High Closed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IVLQTY__HIGH_CLOSED = eINSTANCE.getIVLQTY_HighClosed();

		/**
		 * The meta object literal for the '<em><b>Low Closed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IVLQTY__LOW_CLOSED = eINSTANCE.getIVLQTY_LowClosed();

		/**
		 * The meta object literal for the '{@link org.hl7.cdsdt.r2.impl.IVLREALImpl <em>IVLREAL</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.cdsdt.r2.impl.IVLREALImpl
		 * @see org.hl7.cdsdt.r2.impl.R2PackageImpl#getIVLREAL()
		 * @generated
		 */
		EClass IVLREAL = eINSTANCE.getIVLREAL();

		/**
		 * The meta object literal for the '<em><b>Low</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IVLREAL__LOW = eINSTANCE.getIVLREAL_Low();

		/**
		 * The meta object literal for the '<em><b>High</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IVLREAL__HIGH = eINSTANCE.getIVLREAL_High();

		/**
		 * The meta object literal for the '<em><b>High Closed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IVLREAL__HIGH_CLOSED = eINSTANCE.getIVLREAL_HighClosed();

		/**
		 * The meta object literal for the '<em><b>Low Closed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IVLREAL__LOW_CLOSED = eINSTANCE.getIVLREAL_LowClosed();

		/**
		 * The meta object literal for the '{@link org.hl7.cdsdt.r2.impl.IVLTSImpl <em>IVLTS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.cdsdt.r2.impl.IVLTSImpl
		 * @see org.hl7.cdsdt.r2.impl.R2PackageImpl#getIVLTS()
		 * @generated
		 */
		EClass IVLTS = eINSTANCE.getIVLTS();

		/**
		 * The meta object literal for the '<em><b>Low</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IVLTS__LOW = eINSTANCE.getIVLTS_Low();

		/**
		 * The meta object literal for the '<em><b>High</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IVLTS__HIGH = eINSTANCE.getIVLTS_High();

		/**
		 * The meta object literal for the '<em><b>High Closed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IVLTS__HIGH_CLOSED = eINSTANCE.getIVLTS_HighClosed();

		/**
		 * The meta object literal for the '<em><b>Low Closed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IVLTS__LOW_CLOSED = eINSTANCE.getIVLTS_LowClosed();

		/**
		 * The meta object literal for the '{@link org.hl7.cdsdt.r2.impl.PIVLTSImpl <em>PIVLTS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.cdsdt.r2.impl.PIVLTSImpl
		 * @see org.hl7.cdsdt.r2.impl.R2PackageImpl#getPIVLTS()
		 * @generated
		 */
		EClass PIVLTS = eINSTANCE.getPIVLTS();

		/**
		 * The meta object literal for the '<em><b>Phase</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PIVLTS__PHASE = eINSTANCE.getPIVLTS_Phase();

		/**
		 * The meta object literal for the '<em><b>Period</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PIVLTS__PERIOD = eINSTANCE.getPIVLTS_Period();

		/**
		 * The meta object literal for the '<em><b>Frequency</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PIVLTS__FREQUENCY = eINSTANCE.getPIVLTS_Frequency();

		/**
		 * The meta object literal for the '<em><b>Count</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PIVLTS__COUNT = eINSTANCE.getPIVLTS_Count();

		/**
		 * The meta object literal for the '<em><b>Alignment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PIVLTS__ALIGNMENT = eINSTANCE.getPIVLTS_Alignment();

		/**
		 * The meta object literal for the '<em><b>Is Flexible</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PIVLTS__IS_FLEXIBLE = eINSTANCE.getPIVLTS_IsFlexible();

		/**
		 * The meta object literal for the '{@link org.hl7.cdsdt.r2.impl.PQImpl <em>PQ</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.cdsdt.r2.impl.PQImpl
		 * @see org.hl7.cdsdt.r2.impl.R2PackageImpl#getPQ()
		 * @generated
		 */
		EClass PQ = eINSTANCE.getPQ();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PQ__UNIT = eINSTANCE.getPQ_Unit();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PQ__VALUE = eINSTANCE.getPQ_Value();

		/**
		 * The meta object literal for the '{@link org.hl7.cdsdt.r2.impl.QSETImpl <em>QSET</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.cdsdt.r2.impl.QSETImpl
		 * @see org.hl7.cdsdt.r2.impl.R2PackageImpl#getQSET()
		 * @generated
		 */
		EClass QSET = eINSTANCE.getQSET();

		/**
		 * The meta object literal for the '{@link org.hl7.cdsdt.r2.impl.QTYImpl <em>QTY</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.cdsdt.r2.impl.QTYImpl
		 * @see org.hl7.cdsdt.r2.impl.R2PackageImpl#getQTY()
		 * @generated
		 */
		EClass QTY = eINSTANCE.getQTY();

		/**
		 * The meta object literal for the '{@link org.hl7.cdsdt.r2.impl.REALImpl <em>REAL</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.cdsdt.r2.impl.REALImpl
		 * @see org.hl7.cdsdt.r2.impl.R2PackageImpl#getREAL()
		 * @generated
		 */
		EClass REAL = eINSTANCE.getREAL();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REAL__VALUE = eINSTANCE.getREAL_Value();

		/**
		 * The meta object literal for the '{@link org.hl7.cdsdt.r2.impl.RTOImpl <em>RTO</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.cdsdt.r2.impl.RTOImpl
		 * @see org.hl7.cdsdt.r2.impl.R2PackageImpl#getRTO()
		 * @generated
		 */
		EClass RTO = eINSTANCE.getRTO();

		/**
		 * The meta object literal for the '<em><b>Numerator</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RTO__NUMERATOR = eINSTANCE.getRTO_Numerator();

		/**
		 * The meta object literal for the '<em><b>Denominator</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RTO__DENOMINATOR = eINSTANCE.getRTO_Denominator();

		/**
		 * The meta object literal for the '{@link org.hl7.cdsdt.r2.impl.STImpl <em>ST</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.cdsdt.r2.impl.STImpl
		 * @see org.hl7.cdsdt.r2.impl.R2PackageImpl#getST()
		 * @generated
		 */
		EClass ST = eINSTANCE.getST();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ST__VALUE = eINSTANCE.getST_Value();

		/**
		 * The meta object literal for the '{@link org.hl7.cdsdt.r2.impl.TELImpl <em>TEL</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.cdsdt.r2.impl.TELImpl
		 * @see org.hl7.cdsdt.r2.impl.R2PackageImpl#getTEL()
		 * @generated
		 */
		EClass TEL = eINSTANCE.getTEL();

		/**
		 * The meta object literal for the '<em><b>Capabilities</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEL__CAPABILITIES = eINSTANCE.getTEL_Capabilities();

		/**
		 * The meta object literal for the '<em><b>Use</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEL__USE = eINSTANCE.getTEL_Use();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEL__VALUE = eINSTANCE.getTEL_Value();

		/**
		 * The meta object literal for the '{@link org.hl7.cdsdt.r2.impl.TSImpl <em>TS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.cdsdt.r2.impl.TSImpl
		 * @see org.hl7.cdsdt.r2.impl.R2PackageImpl#getTS()
		 * @generated
		 */
		EClass TS = eINSTANCE.getTS();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TS__VALUE = eINSTANCE.getTS_Value();

		/**
		 * The meta object literal for the '{@link org.hl7.cdsdt.r2.impl.XPImpl <em>XP</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.cdsdt.r2.impl.XPImpl
		 * @see org.hl7.cdsdt.r2.impl.R2PackageImpl#getXP()
		 * @generated
		 */
		EClass XP = eINSTANCE.getXP();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XP__VALUE = eINSTANCE.getXP_Value();

		/**
		 * The meta object literal for the '{@link org.hl7.cdsdt.r2.AddressPartType <em>Address Part Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.cdsdt.r2.AddressPartType
		 * @see org.hl7.cdsdt.r2.impl.R2PackageImpl#getAddressPartType()
		 * @generated
		 */
		EEnum ADDRESS_PART_TYPE = eINSTANCE.getAddressPartType();

		/**
		 * The meta object literal for the '{@link org.hl7.cdsdt.r2.CalendarCycle <em>Calendar Cycle</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.cdsdt.r2.CalendarCycle
		 * @see org.hl7.cdsdt.r2.impl.R2PackageImpl#getCalendarCycle()
		 * @generated
		 */
		EEnum CALENDAR_CYCLE = eINSTANCE.getCalendarCycle();

		/**
		 * The meta object literal for the '{@link org.hl7.cdsdt.r2.Compression <em>Compression</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.cdsdt.r2.Compression
		 * @see org.hl7.cdsdt.r2.impl.R2PackageImpl#getCompression()
		 * @generated
		 */
		EEnum COMPRESSION = eINSTANCE.getCompression();

		/**
		 * The meta object literal for the '{@link org.hl7.cdsdt.r2.EntityNamePartQualifier <em>Entity Name Part Qualifier</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.cdsdt.r2.EntityNamePartQualifier
		 * @see org.hl7.cdsdt.r2.impl.R2PackageImpl#getEntityNamePartQualifier()
		 * @generated
		 */
		EEnum ENTITY_NAME_PART_QUALIFIER = eINSTANCE.getEntityNamePartQualifier();

		/**
		 * The meta object literal for the '{@link org.hl7.cdsdt.r2.EntityNamePartType <em>Entity Name Part Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.cdsdt.r2.EntityNamePartType
		 * @see org.hl7.cdsdt.r2.impl.R2PackageImpl#getEntityNamePartType()
		 * @generated
		 */
		EEnum ENTITY_NAME_PART_TYPE = eINSTANCE.getEntityNamePartType();

		/**
		 * The meta object literal for the '{@link org.hl7.cdsdt.r2.EntityNameUse <em>Entity Name Use</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.cdsdt.r2.EntityNameUse
		 * @see org.hl7.cdsdt.r2.impl.R2PackageImpl#getEntityNameUse()
		 * @generated
		 */
		EEnum ENTITY_NAME_USE = eINSTANCE.getEntityNameUse();

		/**
		 * The meta object literal for the '{@link org.hl7.cdsdt.r2.IntegrityCheckAlgorithm <em>Integrity Check Algorithm</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.cdsdt.r2.IntegrityCheckAlgorithm
		 * @see org.hl7.cdsdt.r2.impl.R2PackageImpl#getIntegrityCheckAlgorithm()
		 * @generated
		 */
		EEnum INTEGRITY_CHECK_ALGORITHM = eINSTANCE.getIntegrityCheckAlgorithm();

		/**
		 * The meta object literal for the '{@link org.hl7.cdsdt.r2.PostalAddressUse <em>Postal Address Use</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.cdsdt.r2.PostalAddressUse
		 * @see org.hl7.cdsdt.r2.impl.R2PackageImpl#getPostalAddressUse()
		 * @generated
		 */
		EEnum POSTAL_ADDRESS_USE = eINSTANCE.getPostalAddressUse();

		/**
		 * The meta object literal for the '{@link org.hl7.cdsdt.r2.TelecommunicationAddressUse <em>Telecommunication Address Use</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.cdsdt.r2.TelecommunicationAddressUse
		 * @see org.hl7.cdsdt.r2.impl.R2PackageImpl#getTelecommunicationAddressUse()
		 * @generated
		 */
		EEnum TELECOMMUNICATION_ADDRESS_USE = eINSTANCE.getTelecommunicationAddressUse();

		/**
		 * The meta object literal for the '{@link org.hl7.cdsdt.r2.TelecommunicationCapability <em>Telecommunication Capability</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.cdsdt.r2.TelecommunicationCapability
		 * @see org.hl7.cdsdt.r2.impl.R2PackageImpl#getTelecommunicationCapability()
		 * @generated
		 */
		EEnum TELECOMMUNICATION_CAPABILITY = eINSTANCE.getTelecommunicationCapability();

		/**
		 * The meta object literal for the '<em>Address Part Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.cdsdt.r2.AddressPartType
		 * @see org.hl7.cdsdt.r2.impl.R2PackageImpl#getAddressPartTypeObject()
		 * @generated
		 */
		EDataType ADDRESS_PART_TYPE_OBJECT = eINSTANCE.getAddressPartTypeObject();

		/**
		 * The meta object literal for the '<em>Calendar Cycle Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.cdsdt.r2.CalendarCycle
		 * @see org.hl7.cdsdt.r2.impl.R2PackageImpl#getCalendarCycleObject()
		 * @generated
		 */
		EDataType CALENDAR_CYCLE_OBJECT = eINSTANCE.getCalendarCycleObject();

		/**
		 * The meta object literal for the '<em>Code</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.hl7.cdsdt.r2.impl.R2PackageImpl#getCode()
		 * @generated
		 */
		EDataType CODE = eINSTANCE.getCode();

		/**
		 * The meta object literal for the '<em>Compression Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.cdsdt.r2.Compression
		 * @see org.hl7.cdsdt.r2.impl.R2PackageImpl#getCompressionObject()
		 * @generated
		 */
		EDataType COMPRESSION_OBJECT = eINSTANCE.getCompressionObject();

		/**
		 * The meta object literal for the '<em>Decimal</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.cdsdt.r2.impl.R2PackageImpl#getDecimal()
		 * @generated
		 */
		EDataType DECIMAL = eINSTANCE.getDecimal();

		/**
		 * The meta object literal for the '<em>Decimal Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Double
		 * @see org.hl7.cdsdt.r2.impl.R2PackageImpl#getDecimalObject()
		 * @generated
		 */
		EDataType DECIMAL_OBJECT = eINSTANCE.getDecimalObject();

		/**
		 * The meta object literal for the '<em>Entity Name Part Qualifier Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.cdsdt.r2.EntityNamePartQualifier
		 * @see org.hl7.cdsdt.r2.impl.R2PackageImpl#getEntityNamePartQualifierObject()
		 * @generated
		 */
		EDataType ENTITY_NAME_PART_QUALIFIER_OBJECT = eINSTANCE.getEntityNamePartQualifierObject();

		/**
		 * The meta object literal for the '<em>Entity Name Part Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.cdsdt.r2.EntityNamePartType
		 * @see org.hl7.cdsdt.r2.impl.R2PackageImpl#getEntityNamePartTypeObject()
		 * @generated
		 */
		EDataType ENTITY_NAME_PART_TYPE_OBJECT = eINSTANCE.getEntityNamePartTypeObject();

		/**
		 * The meta object literal for the '<em>Entity Name Use Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.cdsdt.r2.EntityNameUse
		 * @see org.hl7.cdsdt.r2.impl.R2PackageImpl#getEntityNameUseObject()
		 * @generated
		 */
		EDataType ENTITY_NAME_USE_OBJECT = eINSTANCE.getEntityNameUseObject();

		/**
		 * The meta object literal for the '<em>Integrity Check Algorithm Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.cdsdt.r2.IntegrityCheckAlgorithm
		 * @see org.hl7.cdsdt.r2.impl.R2PackageImpl#getIntegrityCheckAlgorithmObject()
		 * @generated
		 */
		EDataType INTEGRITY_CHECK_ALGORITHM_OBJECT = eINSTANCE.getIntegrityCheckAlgorithmObject();

		/**
		 * The meta object literal for the '<em>Postal Address Use Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.cdsdt.r2.PostalAddressUse
		 * @see org.hl7.cdsdt.r2.impl.R2PackageImpl#getPostalAddressUseObject()
		 * @generated
		 */
		EDataType POSTAL_ADDRESS_USE_OBJECT = eINSTANCE.getPostalAddressUseObject();

		/**
		 * The meta object literal for the '<em>Set Entity Name Part Qualifier</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.List
		 * @see org.hl7.cdsdt.r2.impl.R2PackageImpl#getSetEntityNamePartQualifier()
		 * @generated
		 */
		EDataType SET_ENTITY_NAME_PART_QUALIFIER = eINSTANCE.getSetEntityNamePartQualifier();

		/**
		 * The meta object literal for the '<em>Set Entity Name Use</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.List
		 * @see org.hl7.cdsdt.r2.impl.R2PackageImpl#getSetEntityNameUse()
		 * @generated
		 */
		EDataType SET_ENTITY_NAME_USE = eINSTANCE.getSetEntityNameUse();

		/**
		 * The meta object literal for the '<em>Set Postal Address Use</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.List
		 * @see org.hl7.cdsdt.r2.impl.R2PackageImpl#getSetPostalAddressUse()
		 * @generated
		 */
		EDataType SET_POSTAL_ADDRESS_USE = eINSTANCE.getSetPostalAddressUse();

		/**
		 * The meta object literal for the '<em>Set Telecommunication Address Use</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.List
		 * @see org.hl7.cdsdt.r2.impl.R2PackageImpl#getSetTelecommunicationAddressUse()
		 * @generated
		 */
		EDataType SET_TELECOMMUNICATION_ADDRESS_USE = eINSTANCE.getSetTelecommunicationAddressUse();

		/**
		 * The meta object literal for the '<em>Set Telecommunication Capability</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.List
		 * @see org.hl7.cdsdt.r2.impl.R2PackageImpl#getSetTelecommunicationCapability()
		 * @generated
		 */
		EDataType SET_TELECOMMUNICATION_CAPABILITY = eINSTANCE.getSetTelecommunicationCapability();

		/**
		 * The meta object literal for the '<em>Telecommunication Address Use Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.cdsdt.r2.TelecommunicationAddressUse
		 * @see org.hl7.cdsdt.r2.impl.R2PackageImpl#getTelecommunicationAddressUseObject()
		 * @generated
		 */
		EDataType TELECOMMUNICATION_ADDRESS_USE_OBJECT = eINSTANCE.getTelecommunicationAddressUseObject();

		/**
		 * The meta object literal for the '<em>Telecommunication Capability Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hl7.cdsdt.r2.TelecommunicationCapability
		 * @see org.hl7.cdsdt.r2.impl.R2PackageImpl#getTelecommunicationCapabilityObject()
		 * @generated
		 */
		EDataType TELECOMMUNICATION_CAPABILITY_OBJECT = eINSTANCE.getTelecommunicationCapabilityObject();

		/**
		 * The meta object literal for the '<em>Time Stamp</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.hl7.cdsdt.r2.impl.R2PackageImpl#getTimeStamp()
		 * @generated
		 */
		EDataType TIME_STAMP = eINSTANCE.getTimeStamp();

		/**
		 * The meta object literal for the '<em>Uid</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.hl7.cdsdt.r2.impl.R2PackageImpl#getUid()
		 * @generated
		 */
		EDataType UID = eINSTANCE.getUid();

		/**
		 * The meta object literal for the '<em>Uri</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.hl7.cdsdt.r2.impl.R2PackageImpl#getUri()
		 * @generated
		 */
		EDataType URI = eINSTANCE.getUri();

	}

} //R2Package
