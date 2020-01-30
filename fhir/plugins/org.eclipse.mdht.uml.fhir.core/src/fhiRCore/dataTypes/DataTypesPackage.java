/**
 */
package fhiRCore.dataTypes;

import java.lang.String;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see fhiRCore.dataTypes.DataTypesFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='DataTypes'"
 * @generated
 */
public interface DataTypesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "dataTypes";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///fhiRCore/dataTypes.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "fhiRCore.dataTypes";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DataTypesPackage eINSTANCE = fhiRCore.dataTypes.impl.DataTypesPackageImpl.init();

	/**
	 * The meta object id for the '{@link fhiRCore.dataTypes.impl.BaseImpl <em>Base</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.dataTypes.impl.BaseImpl
	 * @see fhiRCore.dataTypes.impl.DataTypesPackageImpl#getBase()
	 * @generated
	 */
	int BASE = 1;

	/**
	 * The number of structural features of the '<em>Base</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Base</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fhiRCore.dataTypes.impl.ElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.dataTypes.impl.ElementImpl
	 * @see fhiRCore.dataTypes.impl.DataTypesPackageImpl#getElement()
	 * @generated
	 */
	int ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__ID = BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__EXTENSION = BASE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_FEATURE_COUNT = BASE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_OPERATION_COUNT = BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fhiRCore.dataTypes.impl.DataTypeImpl <em>Data Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.dataTypes.impl.DataTypeImpl
	 * @see fhiRCore.dataTypes.impl.DataTypesPackageImpl#getDataType()
	 * @generated
	 */
	int DATA_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__ID = ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__EXTENSION = ELEMENT__EXTENSION;

	/**
	 * The number of structural features of the '<em>Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fhiRCore.dataTypes.impl.BackboneElementImpl <em>Backbone Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.dataTypes.impl.BackboneElementImpl
	 * @see fhiRCore.dataTypes.impl.DataTypesPackageImpl#getBackboneElement()
	 * @generated
	 */
	int BACKBONE_ELEMENT = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACKBONE_ELEMENT__ID = DATA_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACKBONE_ELEMENT__EXTENSION = DATA_TYPE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Modifier Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACKBONE_ELEMENT__MODIFIER_EXTENSION = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Backbone Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACKBONE_ELEMENT_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Backbone Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACKBONE_ELEMENT_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fhiRCore.dataTypes.impl.ElementIdImpl <em>Element Id</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.dataTypes.impl.ElementIdImpl
	 * @see fhiRCore.dataTypes.impl.DataTypesPackageImpl#getElementId()
	 * @generated
	 */
	int ELEMENT_ID = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_ID__ID = BACKBONE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_ID__EXTENSION = BACKBONE_ELEMENT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Modifier Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_ID__MODIFIER_EXTENSION = BACKBONE_ELEMENT__MODIFIER_EXTENSION;

	/**
	 * The number of structural features of the '<em>Element Id</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_ID_FEATURE_COUNT = BACKBONE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Element Id</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_ID_OPERATION_COUNT = BACKBONE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fhiRCore.dataTypes.impl.ExtensionImpl <em>Extension</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.dataTypes.impl.ExtensionImpl
	 * @see fhiRCore.dataTypes.impl.DataTypesPackageImpl#getExtension()
	 * @generated
	 */
	int EXTENSION = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION__ID = DATA_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION__EXTENSION = DATA_TYPE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Url</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION__URL = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Valuex</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION__VALUEX = DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Extension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Extension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fhiRCore.dataTypes.impl.ExtensionUrlImpl <em>Extension Url</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.dataTypes.impl.ExtensionUrlImpl
	 * @see fhiRCore.dataTypes.impl.DataTypesPackageImpl#getExtensionUrl()
	 * @generated
	 */
	int EXTENSION_URL = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_URL__ID = BACKBONE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_URL__EXTENSION = BACKBONE_ELEMENT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Modifier Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_URL__MODIFIER_EXTENSION = BACKBONE_ELEMENT__MODIFIER_EXTENSION;

	/**
	 * The number of structural features of the '<em>Extension Url</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_URL_FEATURE_COUNT = BACKBONE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Extension Url</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_URL_OPERATION_COUNT = BACKBONE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fhiRCore.dataTypes.impl.Base64BinaryImpl <em>Base64 Binary</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.dataTypes.impl.Base64BinaryImpl
	 * @see fhiRCore.dataTypes.impl.DataTypesPackageImpl#getBase64Binary()
	 * @generated
	 */
	int BASE64_BINARY = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE64_BINARY__ID = DATA_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE64_BINARY__EXTENSION = DATA_TYPE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE64_BINARY__VALUE = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Base64 Binary</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE64_BINARY_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Base64 Binary</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE64_BINARY_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fhiRCore.dataTypes.impl.BooleanImpl <em>Boolean</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.dataTypes.impl.BooleanImpl
	 * @see fhiRCore.dataTypes.impl.DataTypesPackageImpl#getBoolean()
	 * @generated
	 */
	int BOOLEAN = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN__ID = DATA_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN__EXTENSION = DATA_TYPE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN__VALUE = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Boolean</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Boolean</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fhiRCore.dataTypes.impl.UriImpl <em>Uri</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.dataTypes.impl.UriImpl
	 * @see fhiRCore.dataTypes.impl.DataTypesPackageImpl#getUri()
	 * @generated
	 */
	int URI = 10;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URI__ID = DATA_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URI__EXTENSION = DATA_TYPE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URI__VALUE = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Uri</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URI_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Uri</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URI_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fhiRCore.dataTypes.impl.CanonicalImpl <em>Canonical</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.dataTypes.impl.CanonicalImpl
	 * @see fhiRCore.dataTypes.impl.DataTypesPackageImpl#getCanonical()
	 * @generated
	 */
	int CANONICAL = 9;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANONICAL__ID = URI__ID;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANONICAL__EXTENSION = URI__EXTENSION;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANONICAL__VALUE = URI__VALUE;

	/**
	 * The number of structural features of the '<em>Canonical</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANONICAL_FEATURE_COUNT = URI_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Canonical</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANONICAL_OPERATION_COUNT = URI_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fhiRCore.dataTypes.impl.StringImpl <em>String</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.dataTypes.impl.StringImpl
	 * @see fhiRCore.dataTypes.impl.DataTypesPackageImpl#getString()
	 * @generated
	 */
	int STRING = 12;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING__ID = DATA_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING__EXTENSION = DATA_TYPE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING__VALUE = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fhiRCore.dataTypes.impl.CodeImpl <em>Code</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.dataTypes.impl.CodeImpl
	 * @see fhiRCore.dataTypes.impl.DataTypesPackageImpl#getCode()
	 * @generated
	 */
	int CODE = 11;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE__ID = STRING__ID;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE__EXTENSION = STRING__EXTENSION;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE__VALUE = STRING__VALUE;

	/**
	 * The number of structural features of the '<em>Code</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_FEATURE_COUNT = STRING_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Code</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_OPERATION_COUNT = STRING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fhiRCore.dataTypes.impl.DateImpl <em>Date</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.dataTypes.impl.DateImpl
	 * @see fhiRCore.dataTypes.impl.DataTypesPackageImpl#getDate()
	 * @generated
	 */
	int DATE = 13;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE__ID = DATA_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE__EXTENSION = DATA_TYPE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE__VALUE = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Date</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Date</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fhiRCore.dataTypes.impl.DateTimeImpl <em>Date Time</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.dataTypes.impl.DateTimeImpl
	 * @see fhiRCore.dataTypes.impl.DataTypesPackageImpl#getDateTime()
	 * @generated
	 */
	int DATE_TIME = 14;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME__ID = DATA_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME__EXTENSION = DATA_TYPE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME__VALUE = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Date Time</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Date Time</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fhiRCore.dataTypes.impl.DecimalImpl <em>Decimal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.dataTypes.impl.DecimalImpl
	 * @see fhiRCore.dataTypes.impl.DataTypesPackageImpl#getDecimal()
	 * @generated
	 */
	int DECIMAL = 15;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECIMAL__ID = DATA_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECIMAL__EXTENSION = DATA_TYPE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECIMAL__VALUE = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Decimal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECIMAL_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Decimal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECIMAL_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fhiRCore.dataTypes.impl.IdImpl <em>Id</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.dataTypes.impl.IdImpl
	 * @see fhiRCore.dataTypes.impl.DataTypesPackageImpl#getId()
	 * @generated
	 */
	int ID = 16;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID__ID = STRING__ID;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID__EXTENSION = STRING__EXTENSION;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID__VALUE = STRING__VALUE;

	/**
	 * The number of structural features of the '<em>Id</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_FEATURE_COUNT = STRING_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Id</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_OPERATION_COUNT = STRING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fhiRCore.dataTypes.impl.InstantImpl <em>Instant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.dataTypes.impl.InstantImpl
	 * @see fhiRCore.dataTypes.impl.DataTypesPackageImpl#getInstant()
	 * @generated
	 */
	int INSTANT = 17;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANT__ID = DATA_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANT__EXTENSION = DATA_TYPE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANT__VALUE = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Instant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANT_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Instant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANT_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fhiRCore.dataTypes.impl.IntegerImpl <em>Integer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.dataTypes.impl.IntegerImpl
	 * @see fhiRCore.dataTypes.impl.DataTypesPackageImpl#getInteger()
	 * @generated
	 */
	int INTEGER = 18;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER__ID = DATA_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER__EXTENSION = DATA_TYPE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER__VALUE = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Integer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Integer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fhiRCore.dataTypes.impl.MarkdownImpl <em>Markdown</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.dataTypes.impl.MarkdownImpl
	 * @see fhiRCore.dataTypes.impl.DataTypesPackageImpl#getMarkdown()
	 * @generated
	 */
	int MARKDOWN = 19;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKDOWN__ID = STRING__ID;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKDOWN__EXTENSION = STRING__EXTENSION;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKDOWN__VALUE = STRING__VALUE;

	/**
	 * The number of structural features of the '<em>Markdown</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKDOWN_FEATURE_COUNT = STRING_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Markdown</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKDOWN_OPERATION_COUNT = STRING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fhiRCore.dataTypes.impl.OidImpl <em>Oid</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.dataTypes.impl.OidImpl
	 * @see fhiRCore.dataTypes.impl.DataTypesPackageImpl#getOid()
	 * @generated
	 */
	int OID = 20;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OID__ID = URI__ID;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OID__EXTENSION = URI__EXTENSION;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OID__VALUE = URI__VALUE;

	/**
	 * The number of structural features of the '<em>Oid</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OID_FEATURE_COUNT = URI_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Oid</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OID_OPERATION_COUNT = URI_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fhiRCore.dataTypes.impl.PositiveIntImpl <em>Positive Int</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.dataTypes.impl.PositiveIntImpl
	 * @see fhiRCore.dataTypes.impl.DataTypesPackageImpl#getPositiveInt()
	 * @generated
	 */
	int POSITIVE_INT = 21;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIVE_INT__ID = INTEGER__ID;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIVE_INT__EXTENSION = INTEGER__EXTENSION;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIVE_INT__VALUE = INTEGER__VALUE;

	/**
	 * The number of structural features of the '<em>Positive Int</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIVE_INT_FEATURE_COUNT = INTEGER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Positive Int</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIVE_INT_OPERATION_COUNT = INTEGER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fhiRCore.dataTypes.impl.TimeImpl <em>Time</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.dataTypes.impl.TimeImpl
	 * @see fhiRCore.dataTypes.impl.DataTypesPackageImpl#getTime()
	 * @generated
	 */
	int TIME = 22;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME__ID = DATA_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME__EXTENSION = DATA_TYPE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME__VALUE = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Time</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Time</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fhiRCore.dataTypes.impl.UnsignedIntImpl <em>Unsigned Int</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.dataTypes.impl.UnsignedIntImpl
	 * @see fhiRCore.dataTypes.impl.DataTypesPackageImpl#getUnsignedInt()
	 * @generated
	 */
	int UNSIGNED_INT = 23;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSIGNED_INT__ID = INTEGER__ID;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSIGNED_INT__EXTENSION = INTEGER__EXTENSION;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSIGNED_INT__VALUE = INTEGER__VALUE;

	/**
	 * The number of structural features of the '<em>Unsigned Int</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSIGNED_INT_FEATURE_COUNT = INTEGER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Unsigned Int</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSIGNED_INT_OPERATION_COUNT = INTEGER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fhiRCore.dataTypes.impl.UrlImpl <em>Url</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.dataTypes.impl.UrlImpl
	 * @see fhiRCore.dataTypes.impl.DataTypesPackageImpl#getUrl()
	 * @generated
	 */
	int URL = 24;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL__ID = URI__ID;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL__EXTENSION = URI__EXTENSION;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL__VALUE = URI__VALUE;

	/**
	 * The number of structural features of the '<em>Url</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_FEATURE_COUNT = URI_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Url</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_OPERATION_COUNT = URI_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fhiRCore.dataTypes.impl.UuidImpl <em>Uuid</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.dataTypes.impl.UuidImpl
	 * @see fhiRCore.dataTypes.impl.DataTypesPackageImpl#getUuid()
	 * @generated
	 */
	int UUID = 25;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UUID__ID = URI__ID;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UUID__EXTENSION = URI__EXTENSION;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UUID__VALUE = URI__VALUE;

	/**
	 * The number of structural features of the '<em>Uuid</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UUID_FEATURE_COUNT = URI_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Uuid</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UUID_OPERATION_COUNT = URI_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fhiRCore.dataTypes.impl.AddressImpl <em>Address</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.dataTypes.impl.AddressImpl
	 * @see fhiRCore.dataTypes.impl.DataTypesPackageImpl#getAddress()
	 * @generated
	 */
	int ADDRESS = 26;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS__ID = DATA_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS__EXTENSION = DATA_TYPE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Use</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS__USE = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS__TYPE = DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS__TEXT = DATA_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Line</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS__LINE = DATA_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>City</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS__CITY = DATA_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>District</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS__DISTRICT = DATA_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>State</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS__STATE = DATA_TYPE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Postal Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS__POSTAL_CODE = DATA_TYPE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Country</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS__COUNTRY = DATA_TYPE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS__PERIOD = DATA_TYPE_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Address</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 10;

	/**
	 * The number of operations of the '<em>Address</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fhiRCore.dataTypes.impl.PeriodImpl <em>Period</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.dataTypes.impl.PeriodImpl
	 * @see fhiRCore.dataTypes.impl.DataTypesPackageImpl#getPeriod()
	 * @generated
	 */
	int PERIOD = 27;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIOD__ID = DATA_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIOD__EXTENSION = DATA_TYPE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIOD__START = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIOD__END = DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Period</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIOD_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Period</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIOD_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fhiRCore.dataTypes.impl.QuantityImpl <em>Quantity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.dataTypes.impl.QuantityImpl
	 * @see fhiRCore.dataTypes.impl.DataTypesPackageImpl#getQuantity()
	 * @generated
	 */
	int QUANTITY = 29;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY__ID = DATA_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY__EXTENSION = DATA_TYPE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY__VALUE = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Comparator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY__COMPARATOR = DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY__UNIT = DATA_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>System</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY__SYSTEM = DATA_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY__CODE = DATA_TYPE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Quantity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Quantity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fhiRCore.dataTypes.impl.AgeImpl <em>Age</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.dataTypes.impl.AgeImpl
	 * @see fhiRCore.dataTypes.impl.DataTypesPackageImpl#getAge()
	 * @generated
	 */
	int AGE = 28;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGE__ID = QUANTITY__ID;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGE__EXTENSION = QUANTITY__EXTENSION;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGE__VALUE = QUANTITY__VALUE;

	/**
	 * The feature id for the '<em><b>Comparator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGE__COMPARATOR = QUANTITY__COMPARATOR;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGE__UNIT = QUANTITY__UNIT;

	/**
	 * The feature id for the '<em><b>System</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGE__SYSTEM = QUANTITY__SYSTEM;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGE__CODE = QUANTITY__CODE;

	/**
	 * The number of structural features of the '<em>Age</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGE_FEATURE_COUNT = QUANTITY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Age</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGE_OPERATION_COUNT = QUANTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fhiRCore.dataTypes.impl.AnnotationImpl <em>Annotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.dataTypes.impl.AnnotationImpl
	 * @see fhiRCore.dataTypes.impl.DataTypesPackageImpl#getAnnotation()
	 * @generated
	 */
	int ANNOTATION = 30;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION__ID = DATA_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION__EXTENSION = DATA_TYPE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Authorx</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION__AUTHORX = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION__TIME = DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION__TEXT = DATA_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fhiRCore.dataTypes.impl.ReferenceImpl <em>Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.dataTypes.impl.ReferenceImpl
	 * @see fhiRCore.dataTypes.impl.DataTypesPackageImpl#getReference()
	 * @generated
	 */
	int REFERENCE = 31;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__ID = DATA_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__EXTENSION = DATA_TYPE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__REFERENCE = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__TYPE = DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__IDENTIFIER = DATA_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Display</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__DISPLAY = DATA_TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fhiRCore.dataTypes.impl.IdentifierImpl <em>Identifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.dataTypes.impl.IdentifierImpl
	 * @see fhiRCore.dataTypes.impl.DataTypesPackageImpl#getIdentifier()
	 * @generated
	 */
	int IDENTIFIER = 32;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER__ID = DATA_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER__EXTENSION = DATA_TYPE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Use</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER__USE = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER__TYPE = DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>System</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER__SYSTEM = DATA_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER__VALUE = DATA_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER__PERIOD = DATA_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Assigner</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER__ASSIGNER = DATA_TYPE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Identifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Identifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fhiRCore.dataTypes.impl.CodeableConceptImpl <em>Codeable Concept</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.dataTypes.impl.CodeableConceptImpl
	 * @see fhiRCore.dataTypes.impl.DataTypesPackageImpl#getCodeableConcept()
	 * @generated
	 */
	int CODEABLE_CONCEPT = 33;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODEABLE_CONCEPT__ID = DATA_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODEABLE_CONCEPT__EXTENSION = DATA_TYPE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Coding</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODEABLE_CONCEPT__CODING = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODEABLE_CONCEPT__TEXT = DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Codeable Concept</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODEABLE_CONCEPT_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Codeable Concept</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODEABLE_CONCEPT_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fhiRCore.dataTypes.impl.CodingImpl <em>Coding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.dataTypes.impl.CodingImpl
	 * @see fhiRCore.dataTypes.impl.DataTypesPackageImpl#getCoding()
	 * @generated
	 */
	int CODING = 34;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODING__ID = DATA_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODING__EXTENSION = DATA_TYPE__EXTENSION;

	/**
	 * The feature id for the '<em><b>System</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODING__SYSTEM = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Version</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODING__VERSION = DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODING__CODE = DATA_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Display</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODING__DISPLAY = DATA_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>User Selected</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODING__USER_SELECTED = DATA_TYPE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Coding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODING_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Coding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODING_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fhiRCore.dataTypes.impl.MetaImpl <em>Meta</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.dataTypes.impl.MetaImpl
	 * @see fhiRCore.dataTypes.impl.DataTypesPackageImpl#getMeta()
	 * @generated
	 */
	int META = 35;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META__ID = DATA_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META__EXTENSION = DATA_TYPE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Version Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META__VERSION_ID = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Last Updated</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META__LAST_UPDATED = DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META__SOURCE = DATA_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Profile</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META__PROFILE = DATA_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Security</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META__SECURITY = DATA_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META__TAG = DATA_TYPE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Meta</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Meta</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fhiRCore.dataTypes.impl.NarrativeImpl <em>Narrative</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.dataTypes.impl.NarrativeImpl
	 * @see fhiRCore.dataTypes.impl.DataTypesPackageImpl#getNarrative()
	 * @generated
	 */
	int NARRATIVE = 36;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NARRATIVE__ID = DATA_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NARRATIVE__EXTENSION = DATA_TYPE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NARRATIVE__STATUS = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Div</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NARRATIVE__DIV = DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Narrative</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NARRATIVE_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Narrative</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NARRATIVE_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fhiRCore.dataTypes.impl.XhtmlImpl <em>Xhtml</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.dataTypes.impl.XhtmlImpl
	 * @see fhiRCore.dataTypes.impl.DataTypesPackageImpl#getXhtml()
	 * @generated
	 */
	int XHTML = 37;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML__ID = DATA_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML__EXTENSION = DATA_TYPE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML__VALUE = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Xhtml</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Xhtml</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fhiRCore.dataTypes.impl.XhtmlValueImpl <em>Xhtml Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.dataTypes.impl.XhtmlValueImpl
	 * @see fhiRCore.dataTypes.impl.DataTypesPackageImpl#getXhtmlValue()
	 * @generated
	 */
	int XHTML_VALUE = 38;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_VALUE__ID = BACKBONE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_VALUE__EXTENSION = BACKBONE_ELEMENT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Modifier Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_VALUE__MODIFIER_EXTENSION = BACKBONE_ELEMENT__MODIFIER_EXTENSION;

	/**
	 * The number of structural features of the '<em>Xhtml Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_VALUE_FEATURE_COUNT = BACKBONE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Xhtml Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_VALUE_OPERATION_COUNT = BACKBONE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fhiRCore.dataTypes.impl.ContactPointImpl <em>Contact Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.dataTypes.impl.ContactPointImpl
	 * @see fhiRCore.dataTypes.impl.DataTypesPackageImpl#getContactPoint()
	 * @generated
	 */
	int CONTACT_POINT = 39;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_POINT__ID = DATA_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_POINT__EXTENSION = DATA_TYPE__EXTENSION;

	/**
	 * The feature id for the '<em><b>System</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_POINT__SYSTEM = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_POINT__VALUE = DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Use</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_POINT__USE = DATA_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Rank</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_POINT__RANK = DATA_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_POINT__PERIOD = DATA_TYPE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Contact Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_POINT_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Contact Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_POINT_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fhiRCore.dataTypes.impl.HumanNameImpl <em>Human Name</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.dataTypes.impl.HumanNameImpl
	 * @see fhiRCore.dataTypes.impl.DataTypesPackageImpl#getHumanName()
	 * @generated
	 */
	int HUMAN_NAME = 40;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUMAN_NAME__ID = DATA_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUMAN_NAME__EXTENSION = DATA_TYPE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Use</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUMAN_NAME__USE = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUMAN_NAME__TEXT = DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Family</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUMAN_NAME__FAMILY = DATA_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Given</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUMAN_NAME__GIVEN = DATA_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Prefix</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUMAN_NAME__PREFIX = DATA_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Suffix</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUMAN_NAME__SUFFIX = DATA_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUMAN_NAME__PERIOD = DATA_TYPE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Human Name</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUMAN_NAME_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Human Name</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUMAN_NAME_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fhiRCore.dataTypes.impl.AttachmentImpl <em>Attachment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.dataTypes.impl.AttachmentImpl
	 * @see fhiRCore.dataTypes.impl.DataTypesPackageImpl#getAttachment()
	 * @generated
	 */
	int ATTACHMENT = 41;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT__ID = DATA_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT__EXTENSION = DATA_TYPE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Content Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT__CONTENT_TYPE = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Language</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT__LANGUAGE = DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT__DATA = DATA_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Url</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT__URL = DATA_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT__SIZE = DATA_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Hash</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT__HASH = DATA_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT__TITLE = DATA_TYPE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Creation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT__CREATION = DATA_TYPE_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Attachment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Attachment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fhiRCore.dataTypes.impl.ContactDetailImpl <em>Contact Detail</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.dataTypes.impl.ContactDetailImpl
	 * @see fhiRCore.dataTypes.impl.DataTypesPackageImpl#getContactDetail()
	 * @generated
	 */
	int CONTACT_DETAIL = 42;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_DETAIL__ID = DATA_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_DETAIL__EXTENSION = DATA_TYPE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_DETAIL__NAME = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Telecom</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_DETAIL__TELECOM = DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Contact Detail</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_DETAIL_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Contact Detail</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_DETAIL_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fhiRCore.dataTypes.impl.UsageContextImpl <em>Usage Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.dataTypes.impl.UsageContextImpl
	 * @see fhiRCore.dataTypes.impl.DataTypesPackageImpl#getUsageContext()
	 * @generated
	 */
	int USAGE_CONTEXT = 43;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USAGE_CONTEXT__ID = DATA_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USAGE_CONTEXT__EXTENSION = DATA_TYPE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USAGE_CONTEXT__CODE = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value Codeable Concept</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USAGE_CONTEXT__VALUE_CODEABLE_CONCEPT = DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Value Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USAGE_CONTEXT__VALUE_QUANTITY = DATA_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Value Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USAGE_CONTEXT__VALUE_RANGE = DATA_TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Usage Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USAGE_CONTEXT_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Usage Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USAGE_CONTEXT_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fhiRCore.dataTypes.impl.RangeImpl <em>Range</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.dataTypes.impl.RangeImpl
	 * @see fhiRCore.dataTypes.impl.DataTypesPackageImpl#getRange()
	 * @generated
	 */
	int RANGE = 44;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE__ID = DATA_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE__EXTENSION = DATA_TYPE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Low</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE__LOW = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>High</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE__HIGH = DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Range</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Range</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fhiRCore.dataTypes.impl.RelatedArtifactImpl <em>Related Artifact</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.dataTypes.impl.RelatedArtifactImpl
	 * @see fhiRCore.dataTypes.impl.DataTypesPackageImpl#getRelatedArtifact()
	 * @generated
	 */
	int RELATED_ARTIFACT = 45;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATED_ARTIFACT__ID = DATA_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATED_ARTIFACT__EXTENSION = DATA_TYPE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATED_ARTIFACT__TYPE = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATED_ARTIFACT__LABEL = DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Display</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATED_ARTIFACT__DISPLAY = DATA_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Citation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATED_ARTIFACT__CITATION = DATA_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Url</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATED_ARTIFACT__URL = DATA_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Document</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATED_ARTIFACT__DOCUMENT = DATA_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Resource</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATED_ARTIFACT__RESOURCE = DATA_TYPE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Related Artifact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATED_ARTIFACT_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Related Artifact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATED_ARTIFACT_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fhiRCore.dataTypes.impl.ParameterDefinitionImpl <em>Parameter Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.dataTypes.impl.ParameterDefinitionImpl
	 * @see fhiRCore.dataTypes.impl.DataTypesPackageImpl#getParameterDefinition()
	 * @generated
	 */
	int PARAMETER_DEFINITION = 46;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_DEFINITION__ID = DATA_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_DEFINITION__EXTENSION = DATA_TYPE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_DEFINITION__NAME = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Use</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_DEFINITION__USE = DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Min</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_DEFINITION__MIN = DATA_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Max</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_DEFINITION__MAX = DATA_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_DEFINITION__DOCUMENTATION = DATA_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_DEFINITION__TYPE = DATA_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Profile</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_DEFINITION__PROFILE = DATA_TYPE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Parameter Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_DEFINITION_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Parameter Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_DEFINITION_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fhiRCore.dataTypes.impl.DataRequirementImpl <em>Data Requirement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.dataTypes.impl.DataRequirementImpl
	 * @see fhiRCore.dataTypes.impl.DataTypesPackageImpl#getDataRequirement()
	 * @generated
	 */
	int DATA_REQUIREMENT = 47;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_REQUIREMENT__ID = DATA_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_REQUIREMENT__EXTENSION = DATA_TYPE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_REQUIREMENT__TYPE = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Profile</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_REQUIREMENT__PROFILE = DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Subjectx</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_REQUIREMENT__SUBJECTX = DATA_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Must Support</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_REQUIREMENT__MUST_SUPPORT = DATA_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Code Filter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_REQUIREMENT__CODE_FILTER = DATA_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Date Filter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_REQUIREMENT__DATE_FILTER = DATA_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Limit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_REQUIREMENT__LIMIT = DATA_TYPE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Sort</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_REQUIREMENT__SORT = DATA_TYPE_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Data Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_REQUIREMENT_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Data Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_REQUIREMENT_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fhiRCore.dataTypes.impl.DataRequirementElement1Impl <em>Data Requirement Element1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.dataTypes.impl.DataRequirementElement1Impl
	 * @see fhiRCore.dataTypes.impl.DataTypesPackageImpl#getDataRequirementElement1()
	 * @generated
	 */
	int DATA_REQUIREMENT_ELEMENT1 = 48;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_REQUIREMENT_ELEMENT1__ID = ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_REQUIREMENT_ELEMENT1__EXTENSION = ELEMENT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Path</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_REQUIREMENT_ELEMENT1__PATH = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Search Param</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_REQUIREMENT_ELEMENT1__SEARCH_PARAM = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Value Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_REQUIREMENT_ELEMENT1__VALUE_SET = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_REQUIREMENT_ELEMENT1__CODE = ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Data Requirement Element1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_REQUIREMENT_ELEMENT1_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Data Requirement Element1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_REQUIREMENT_ELEMENT1_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fhiRCore.dataTypes.impl.DataRequirementElement2Impl <em>Data Requirement Element2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.dataTypes.impl.DataRequirementElement2Impl
	 * @see fhiRCore.dataTypes.impl.DataTypesPackageImpl#getDataRequirementElement2()
	 * @generated
	 */
	int DATA_REQUIREMENT_ELEMENT2 = 49;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_REQUIREMENT_ELEMENT2__ID = ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_REQUIREMENT_ELEMENT2__EXTENSION = ELEMENT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Path</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_REQUIREMENT_ELEMENT2__PATH = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Search Param</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_REQUIREMENT_ELEMENT2__SEARCH_PARAM = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Valuex</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_REQUIREMENT_ELEMENT2__VALUEX = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Data Requirement Element2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_REQUIREMENT_ELEMENT2_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Data Requirement Element2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_REQUIREMENT_ELEMENT2_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fhiRCore.dataTypes.impl.DataRequirementElement3Impl <em>Data Requirement Element3</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.dataTypes.impl.DataRequirementElement3Impl
	 * @see fhiRCore.dataTypes.impl.DataTypesPackageImpl#getDataRequirementElement3()
	 * @generated
	 */
	int DATA_REQUIREMENT_ELEMENT3 = 50;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_REQUIREMENT_ELEMENT3__ID = ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_REQUIREMENT_ELEMENT3__EXTENSION = ELEMENT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Path</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_REQUIREMENT_ELEMENT3__PATH = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_REQUIREMENT_ELEMENT3__DIRECTION = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Data Requirement Element3</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_REQUIREMENT_ELEMENT3_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Data Requirement Element3</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_REQUIREMENT_ELEMENT3_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fhiRCore.dataTypes.impl.ExpressionImpl <em>Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.dataTypes.impl.ExpressionImpl
	 * @see fhiRCore.dataTypes.impl.DataTypesPackageImpl#getExpression()
	 * @generated
	 */
	int EXPRESSION = 51;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__ID = DATA_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__EXTENSION = DATA_TYPE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__DESCRIPTION = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__NAME = DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Language</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__LANGUAGE = DATA_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__EXPRESSION = DATA_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__REFERENCE = DATA_TYPE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fhiRCore.dataTypes.impl.DurationImpl <em>Duration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.dataTypes.impl.DurationImpl
	 * @see fhiRCore.dataTypes.impl.DataTypesPackageImpl#getDuration()
	 * @generated
	 */
	int DURATION = 52;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION__ID = QUANTITY__ID;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION__EXTENSION = QUANTITY__EXTENSION;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION__VALUE = QUANTITY__VALUE;

	/**
	 * The feature id for the '<em><b>Comparator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION__COMPARATOR = QUANTITY__COMPARATOR;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION__UNIT = QUANTITY__UNIT;

	/**
	 * The feature id for the '<em><b>System</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION__SYSTEM = QUANTITY__SYSTEM;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION__CODE = QUANTITY__CODE;

	/**
	 * The number of structural features of the '<em>Duration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION_FEATURE_COUNT = QUANTITY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Duration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION_OPERATION_COUNT = QUANTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fhiRCore.dataTypes.impl.TriggerDefinitionImpl <em>Trigger Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.dataTypes.impl.TriggerDefinitionImpl
	 * @see fhiRCore.dataTypes.impl.DataTypesPackageImpl#getTriggerDefinition()
	 * @generated
	 */
	int TRIGGER_DEFINITION = 53;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_DEFINITION__ID = DATA_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_DEFINITION__EXTENSION = DATA_TYPE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_DEFINITION__TYPE = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_DEFINITION__NAME = DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Timingx</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_DEFINITION__TIMINGX = DATA_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Data</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_DEFINITION__DATA = DATA_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_DEFINITION__CONDITION = DATA_TYPE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Trigger Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_DEFINITION_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Trigger Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_DEFINITION_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fhiRCore.dataTypes.impl.DosageImpl <em>Dosage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.dataTypes.impl.DosageImpl
	 * @see fhiRCore.dataTypes.impl.DataTypesPackageImpl#getDosage()
	 * @generated
	 */
	int DOSAGE = 54;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOSAGE__ID = BACKBONE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOSAGE__EXTENSION = BACKBONE_ELEMENT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Modifier Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOSAGE__MODIFIER_EXTENSION = BACKBONE_ELEMENT__MODIFIER_EXTENSION;

	/**
	 * The feature id for the '<em><b>Sequence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOSAGE__SEQUENCE = BACKBONE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOSAGE__TEXT = BACKBONE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Additional Instruction</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOSAGE__ADDITIONAL_INSTRUCTION = BACKBONE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Patient Instruction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOSAGE__PATIENT_INSTRUCTION = BACKBONE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Timing</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOSAGE__TIMING = BACKBONE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>As Neededx</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOSAGE__AS_NEEDEDX = BACKBONE_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Site</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOSAGE__SITE = BACKBONE_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Route</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOSAGE__ROUTE = BACKBONE_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Method</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOSAGE__METHOD = BACKBONE_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Dose And Rate</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOSAGE__DOSE_AND_RATE = BACKBONE_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Max Dose Per Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOSAGE__MAX_DOSE_PER_PERIOD = BACKBONE_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Max Dose Per Administration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOSAGE__MAX_DOSE_PER_ADMINISTRATION = BACKBONE_ELEMENT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Max Dose Per Lifetime</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOSAGE__MAX_DOSE_PER_LIFETIME = BACKBONE_ELEMENT_FEATURE_COUNT + 12;

	/**
	 * The number of structural features of the '<em>Dosage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOSAGE_FEATURE_COUNT = BACKBONE_ELEMENT_FEATURE_COUNT + 13;

	/**
	 * The number of operations of the '<em>Dosage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOSAGE_OPERATION_COUNT = BACKBONE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fhiRCore.dataTypes.impl.TimingImpl <em>Timing</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.dataTypes.impl.TimingImpl
	 * @see fhiRCore.dataTypes.impl.DataTypesPackageImpl#getTiming()
	 * @generated
	 */
	int TIMING = 55;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING__ID = BACKBONE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING__EXTENSION = BACKBONE_ELEMENT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Modifier Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING__MODIFIER_EXTENSION = BACKBONE_ELEMENT__MODIFIER_EXTENSION;

	/**
	 * The feature id for the '<em><b>Event</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING__EVENT = BACKBONE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Repeat</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING__REPEAT = BACKBONE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING__CODE = BACKBONE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Timing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_FEATURE_COUNT = BACKBONE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Timing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_OPERATION_COUNT = BACKBONE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fhiRCore.dataTypes.impl.TimingElement1Impl <em>Timing Element1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.dataTypes.impl.TimingElement1Impl
	 * @see fhiRCore.dataTypes.impl.DataTypesPackageImpl#getTimingElement1()
	 * @generated
	 */
	int TIMING_ELEMENT1 = 56;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_ELEMENT1__ID = ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_ELEMENT1__EXTENSION = ELEMENT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Boundsx</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_ELEMENT1__BOUNDSX = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Count</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_ELEMENT1__COUNT = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Count Max</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_ELEMENT1__COUNT_MAX = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_ELEMENT1__DURATION = ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Duration Max</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_ELEMENT1__DURATION_MAX = ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Duration Unit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_ELEMENT1__DURATION_UNIT = ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Frequency</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_ELEMENT1__FREQUENCY = ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Frequency Max</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_ELEMENT1__FREQUENCY_MAX = ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_ELEMENT1__PERIOD = ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Period Max</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_ELEMENT1__PERIOD_MAX = ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Period Unit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_ELEMENT1__PERIOD_UNIT = ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Day Of Week</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_ELEMENT1__DAY_OF_WEEK = ELEMENT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Time Of Day</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_ELEMENT1__TIME_OF_DAY = ELEMENT_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>When</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_ELEMENT1__WHEN = ELEMENT_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Offset</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_ELEMENT1__OFFSET = ELEMENT_FEATURE_COUNT + 14;

	/**
	 * The number of structural features of the '<em>Timing Element1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_ELEMENT1_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 15;

	/**
	 * The number of operations of the '<em>Timing Element1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_ELEMENT1_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fhiRCore.dataTypes.impl.DosageElement1Impl <em>Dosage Element1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.dataTypes.impl.DosageElement1Impl
	 * @see fhiRCore.dataTypes.impl.DataTypesPackageImpl#getDosageElement1()
	 * @generated
	 */
	int DOSAGE_ELEMENT1 = 57;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOSAGE_ELEMENT1__ID = ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOSAGE_ELEMENT1__EXTENSION = ELEMENT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOSAGE_ELEMENT1__TYPE = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Dosex</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOSAGE_ELEMENT1__DOSEX = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Ratex</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOSAGE_ELEMENT1__RATEX = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Dosage Element1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOSAGE_ELEMENT1_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Dosage Element1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOSAGE_ELEMENT1_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fhiRCore.dataTypes.impl.RatioImpl <em>Ratio</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.dataTypes.impl.RatioImpl
	 * @see fhiRCore.dataTypes.impl.DataTypesPackageImpl#getRatio()
	 * @generated
	 */
	int RATIO = 58;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO__ID = DATA_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO__EXTENSION = DATA_TYPE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Numerator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO__NUMERATOR = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Denominator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO__DENOMINATOR = DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Ratio</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Ratio</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fhiRCore.dataTypes.impl.MoneyImpl <em>Money</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.dataTypes.impl.MoneyImpl
	 * @see fhiRCore.dataTypes.impl.DataTypesPackageImpl#getMoney()
	 * @generated
	 */
	int MONEY = 59;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONEY__ID = DATA_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONEY__EXTENSION = DATA_TYPE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONEY__VALUE = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Currency</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONEY__CURRENCY = DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Money</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONEY_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Money</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONEY_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fhiRCore.dataTypes.impl.SignatureImpl <em>Signature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.dataTypes.impl.SignatureImpl
	 * @see fhiRCore.dataTypes.impl.DataTypesPackageImpl#getSignature()
	 * @generated
	 */
	int SIGNATURE = 60;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE__ID = DATA_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE__EXTENSION = DATA_TYPE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE__TYPE = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>When</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE__WHEN = DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Who</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE__WHO = DATA_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>On Behalf Of</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE__ON_BEHALF_OF = DATA_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Target Format</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE__TARGET_FORMAT = DATA_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Sig Format</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE__SIG_FORMAT = DATA_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE__DATA = DATA_TYPE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Signature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Signature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fhiRCore.dataTypes.impl.ProductShelfLifeImpl <em>Product Shelf Life</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.dataTypes.impl.ProductShelfLifeImpl
	 * @see fhiRCore.dataTypes.impl.DataTypesPackageImpl#getProductShelfLife()
	 * @generated
	 */
	int PRODUCT_SHELF_LIFE = 61;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_SHELF_LIFE__ID = BACKBONE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_SHELF_LIFE__EXTENSION = BACKBONE_ELEMENT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Modifier Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_SHELF_LIFE__MODIFIER_EXTENSION = BACKBONE_ELEMENT__MODIFIER_EXTENSION;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_SHELF_LIFE__IDENTIFIER = BACKBONE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_SHELF_LIFE__TYPE = BACKBONE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_SHELF_LIFE__PERIOD = BACKBONE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Special Precautions For Storage</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_SHELF_LIFE__SPECIAL_PRECAUTIONS_FOR_STORAGE = BACKBONE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Product Shelf Life</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_SHELF_LIFE_FEATURE_COUNT = BACKBONE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Product Shelf Life</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_SHELF_LIFE_OPERATION_COUNT = BACKBONE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fhiRCore.dataTypes.impl.ProdCharacteristicImpl <em>Prod Characteristic</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.dataTypes.impl.ProdCharacteristicImpl
	 * @see fhiRCore.dataTypes.impl.DataTypesPackageImpl#getProdCharacteristic()
	 * @generated
	 */
	int PROD_CHARACTERISTIC = 62;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROD_CHARACTERISTIC__ID = BACKBONE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROD_CHARACTERISTIC__EXTENSION = BACKBONE_ELEMENT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Modifier Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROD_CHARACTERISTIC__MODIFIER_EXTENSION = BACKBONE_ELEMENT__MODIFIER_EXTENSION;

	/**
	 * The feature id for the '<em><b>Height</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROD_CHARACTERISTIC__HEIGHT = BACKBONE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Width</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROD_CHARACTERISTIC__WIDTH = BACKBONE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Depth</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROD_CHARACTERISTIC__DEPTH = BACKBONE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROD_CHARACTERISTIC__WEIGHT = BACKBONE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Nominal Volume</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROD_CHARACTERISTIC__NOMINAL_VOLUME = BACKBONE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>External Diameter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROD_CHARACTERISTIC__EXTERNAL_DIAMETER = BACKBONE_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Shape</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROD_CHARACTERISTIC__SHAPE = BACKBONE_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Color</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROD_CHARACTERISTIC__COLOR = BACKBONE_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Imprint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROD_CHARACTERISTIC__IMPRINT = BACKBONE_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Image</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROD_CHARACTERISTIC__IMAGE = BACKBONE_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Scoring</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROD_CHARACTERISTIC__SCORING = BACKBONE_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>Prod Characteristic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROD_CHARACTERISTIC_FEATURE_COUNT = BACKBONE_ELEMENT_FEATURE_COUNT + 11;

	/**
	 * The number of operations of the '<em>Prod Characteristic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROD_CHARACTERISTIC_OPERATION_COUNT = BACKBONE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fhiRCore.dataTypes.impl.MarketingStatusImpl <em>Marketing Status</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.dataTypes.impl.MarketingStatusImpl
	 * @see fhiRCore.dataTypes.impl.DataTypesPackageImpl#getMarketingStatus()
	 * @generated
	 */
	int MARKETING_STATUS = 63;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKETING_STATUS__ID = BACKBONE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKETING_STATUS__EXTENSION = BACKBONE_ELEMENT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Modifier Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKETING_STATUS__MODIFIER_EXTENSION = BACKBONE_ELEMENT__MODIFIER_EXTENSION;

	/**
	 * The feature id for the '<em><b>Country</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKETING_STATUS__COUNTRY = BACKBONE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Jurisdiction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKETING_STATUS__JURISDICTION = BACKBONE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKETING_STATUS__STATUS = BACKBONE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Date Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKETING_STATUS__DATE_RANGE = BACKBONE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Restore Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKETING_STATUS__RESTORE_DATE = BACKBONE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Marketing Status</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKETING_STATUS_FEATURE_COUNT = BACKBONE_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Marketing Status</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKETING_STATUS_OPERATION_COUNT = BACKBONE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fhiRCore.dataTypes.impl.PopulationImpl <em>Population</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.dataTypes.impl.PopulationImpl
	 * @see fhiRCore.dataTypes.impl.DataTypesPackageImpl#getPopulation()
	 * @generated
	 */
	int POPULATION = 64;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POPULATION__ID = BACKBONE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POPULATION__EXTENSION = BACKBONE_ELEMENT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Modifier Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POPULATION__MODIFIER_EXTENSION = BACKBONE_ELEMENT__MODIFIER_EXTENSION;

	/**
	 * The feature id for the '<em><b>Agex</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POPULATION__AGEX = BACKBONE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Gender</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POPULATION__GENDER = BACKBONE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Race</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POPULATION__RACE = BACKBONE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Physiological Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POPULATION__PHYSIOLOGICAL_CONDITION = BACKBONE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Population</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POPULATION_FEATURE_COUNT = BACKBONE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Population</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POPULATION_OPERATION_COUNT = BACKBONE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fhiRCore.dataTypes.impl.SubstanceAmountImpl <em>Substance Amount</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.dataTypes.impl.SubstanceAmountImpl
	 * @see fhiRCore.dataTypes.impl.DataTypesPackageImpl#getSubstanceAmount()
	 * @generated
	 */
	int SUBSTANCE_AMOUNT = 65;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTANCE_AMOUNT__ID = BACKBONE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTANCE_AMOUNT__EXTENSION = BACKBONE_ELEMENT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Modifier Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTANCE_AMOUNT__MODIFIER_EXTENSION = BACKBONE_ELEMENT__MODIFIER_EXTENSION;

	/**
	 * The feature id for the '<em><b>Amountx</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTANCE_AMOUNT__AMOUNTX = BACKBONE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Amount Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTANCE_AMOUNT__AMOUNT_TYPE = BACKBONE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Amount Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTANCE_AMOUNT__AMOUNT_TEXT = BACKBONE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Reference Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTANCE_AMOUNT__REFERENCE_RANGE = BACKBONE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Substance Amount</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTANCE_AMOUNT_FEATURE_COUNT = BACKBONE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Substance Amount</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTANCE_AMOUNT_OPERATION_COUNT = BACKBONE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fhiRCore.dataTypes.impl.SubstanceAmountElement1Impl <em>Substance Amount Element1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.dataTypes.impl.SubstanceAmountElement1Impl
	 * @see fhiRCore.dataTypes.impl.DataTypesPackageImpl#getSubstanceAmountElement1()
	 * @generated
	 */
	int SUBSTANCE_AMOUNT_ELEMENT1 = 66;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTANCE_AMOUNT_ELEMENT1__ID = ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTANCE_AMOUNT_ELEMENT1__EXTENSION = ELEMENT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Low Limit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTANCE_AMOUNT_ELEMENT1__LOW_LIMIT = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>High Limit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTANCE_AMOUNT_ELEMENT1__HIGH_LIMIT = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Substance Amount Element1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTANCE_AMOUNT_ELEMENT1_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Substance Amount Element1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTANCE_AMOUNT_ELEMENT1_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fhiRCore.dataTypes.impl.ElementDefinitionImpl <em>Element Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.dataTypes.impl.ElementDefinitionImpl
	 * @see fhiRCore.dataTypes.impl.DataTypesPackageImpl#getElementDefinition()
	 * @generated
	 */
	int ELEMENT_DEFINITION = 67;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION__ID = BACKBONE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION__EXTENSION = BACKBONE_ELEMENT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Modifier Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION__MODIFIER_EXTENSION = BACKBONE_ELEMENT__MODIFIER_EXTENSION;

	/**
	 * The feature id for the '<em><b>Path</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION__PATH = BACKBONE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Representation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION__REPRESENTATION = BACKBONE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Slice Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION__SLICE_NAME = BACKBONE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Slice Is Constraining</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION__SLICE_IS_CONSTRAINING = BACKBONE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION__LABEL = BACKBONE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION__CODE = BACKBONE_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Slicing</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION__SLICING = BACKBONE_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Short</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION__SHORT = BACKBONE_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION__DEFINITION = BACKBONE_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION__COMMENT = BACKBONE_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Requirements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION__REQUIREMENTS = BACKBONE_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION__ALIAS = BACKBONE_ELEMENT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Min</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION__MIN = BACKBONE_ELEMENT_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Max</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION__MAX = BACKBONE_ELEMENT_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Base</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION__BASE = BACKBONE_ELEMENT_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Content Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION__CONTENT_REFERENCE = BACKBONE_ELEMENT_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION__TYPE = BACKBONE_ELEMENT_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Default Valuex</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION__DEFAULT_VALUEX = BACKBONE_ELEMENT_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Meaning When Missing</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION__MEANING_WHEN_MISSING = BACKBONE_ELEMENT_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Order Meaning</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION__ORDER_MEANING = BACKBONE_ELEMENT_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Fixedx</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION__FIXEDX = BACKBONE_ELEMENT_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Patternx</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION__PATTERNX = BACKBONE_ELEMENT_FEATURE_COUNT + 21;

	/**
	 * The feature id for the '<em><b>Example</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION__EXAMPLE = BACKBONE_ELEMENT_FEATURE_COUNT + 22;

	/**
	 * The feature id for the '<em><b>Min Valuex</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION__MIN_VALUEX = BACKBONE_ELEMENT_FEATURE_COUNT + 23;

	/**
	 * The feature id for the '<em><b>Max Valuex</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION__MAX_VALUEX = BACKBONE_ELEMENT_FEATURE_COUNT + 24;

	/**
	 * The feature id for the '<em><b>Max Length</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION__MAX_LENGTH = BACKBONE_ELEMENT_FEATURE_COUNT + 25;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION__CONDITION = BACKBONE_ELEMENT_FEATURE_COUNT + 26;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION__CONSTRAINT = BACKBONE_ELEMENT_FEATURE_COUNT + 27;

	/**
	 * The feature id for the '<em><b>Must Support</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION__MUST_SUPPORT = BACKBONE_ELEMENT_FEATURE_COUNT + 28;

	/**
	 * The feature id for the '<em><b>Is Modifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION__IS_MODIFIER = BACKBONE_ELEMENT_FEATURE_COUNT + 29;

	/**
	 * The feature id for the '<em><b>Is Modifier Reason</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION__IS_MODIFIER_REASON = BACKBONE_ELEMENT_FEATURE_COUNT + 30;

	/**
	 * The feature id for the '<em><b>Is Summary</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION__IS_SUMMARY = BACKBONE_ELEMENT_FEATURE_COUNT + 31;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION__BINDING = BACKBONE_ELEMENT_FEATURE_COUNT + 32;

	/**
	 * The feature id for the '<em><b>Mapping</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION__MAPPING = BACKBONE_ELEMENT_FEATURE_COUNT + 33;

	/**
	 * The number of structural features of the '<em>Element Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION_FEATURE_COUNT = BACKBONE_ELEMENT_FEATURE_COUNT + 34;

	/**
	 * The number of operations of the '<em>Element Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION_OPERATION_COUNT = BACKBONE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fhiRCore.dataTypes.impl.ElementDefinitionElement1Impl <em>Element Definition Element1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.dataTypes.impl.ElementDefinitionElement1Impl
	 * @see fhiRCore.dataTypes.impl.DataTypesPackageImpl#getElementDefinitionElement1()
	 * @generated
	 */
	int ELEMENT_DEFINITION_ELEMENT1 = 68;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION_ELEMENT1__ID = ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION_ELEMENT1__EXTENSION = ELEMENT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Discriminator</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION_ELEMENT1__DISCRIMINATOR = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION_ELEMENT1__DESCRIPTION = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Ordered</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION_ELEMENT1__ORDERED = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Rules</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION_ELEMENT1__RULES = ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Element Definition Element1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION_ELEMENT1_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Element Definition Element1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION_ELEMENT1_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fhiRCore.dataTypes.impl.ElementDefinitionElement1Element1Impl <em>Element Definition Element1 Element1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.dataTypes.impl.ElementDefinitionElement1Element1Impl
	 * @see fhiRCore.dataTypes.impl.DataTypesPackageImpl#getElementDefinitionElement1Element1()
	 * @generated
	 */
	int ELEMENT_DEFINITION_ELEMENT1_ELEMENT1 = 69;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION_ELEMENT1_ELEMENT1__ID = ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION_ELEMENT1_ELEMENT1__EXTENSION = ELEMENT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION_ELEMENT1_ELEMENT1__TYPE = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Path</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION_ELEMENT1_ELEMENT1__PATH = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Element Definition Element1 Element1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION_ELEMENT1_ELEMENT1_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Element Definition Element1 Element1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION_ELEMENT1_ELEMENT1_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fhiRCore.dataTypes.impl.ElementDefinitionElement2Impl <em>Element Definition Element2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.dataTypes.impl.ElementDefinitionElement2Impl
	 * @see fhiRCore.dataTypes.impl.DataTypesPackageImpl#getElementDefinitionElement2()
	 * @generated
	 */
	int ELEMENT_DEFINITION_ELEMENT2 = 70;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION_ELEMENT2__ID = ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION_ELEMENT2__EXTENSION = ELEMENT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Path</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION_ELEMENT2__PATH = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Min</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION_ELEMENT2__MIN = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Max</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION_ELEMENT2__MAX = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Element Definition Element2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION_ELEMENT2_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Element Definition Element2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION_ELEMENT2_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fhiRCore.dataTypes.impl.ElementDefinitionElement3Impl <em>Element Definition Element3</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.dataTypes.impl.ElementDefinitionElement3Impl
	 * @see fhiRCore.dataTypes.impl.DataTypesPackageImpl#getElementDefinitionElement3()
	 * @generated
	 */
	int ELEMENT_DEFINITION_ELEMENT3 = 71;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION_ELEMENT3__ID = ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION_ELEMENT3__EXTENSION = ELEMENT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION_ELEMENT3__CODE = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Profile</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION_ELEMENT3__PROFILE = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Target Profile</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION_ELEMENT3__TARGET_PROFILE = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Aggregation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION_ELEMENT3__AGGREGATION = ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Versioning</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION_ELEMENT3__VERSIONING = ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Element Definition Element3</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION_ELEMENT3_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Element Definition Element3</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION_ELEMENT3_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fhiRCore.dataTypes.impl.ElementDefinitionElement4Impl <em>Element Definition Element4</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.dataTypes.impl.ElementDefinitionElement4Impl
	 * @see fhiRCore.dataTypes.impl.DataTypesPackageImpl#getElementDefinitionElement4()
	 * @generated
	 */
	int ELEMENT_DEFINITION_ELEMENT4 = 72;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION_ELEMENT4__ID = ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION_ELEMENT4__EXTENSION = ELEMENT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION_ELEMENT4__LABEL = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Valuex</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION_ELEMENT4__VALUEX = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Element Definition Element4</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION_ELEMENT4_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Element Definition Element4</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION_ELEMENT4_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fhiRCore.dataTypes.impl.ElementDefinitionElement5Impl <em>Element Definition Element5</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.dataTypes.impl.ElementDefinitionElement5Impl
	 * @see fhiRCore.dataTypes.impl.DataTypesPackageImpl#getElementDefinitionElement5()
	 * @generated
	 */
	int ELEMENT_DEFINITION_ELEMENT5 = 73;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION_ELEMENT5__ID = ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION_ELEMENT5__EXTENSION = ELEMENT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION_ELEMENT5__KEY = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Requirements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION_ELEMENT5__REQUIREMENTS = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Severity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION_ELEMENT5__SEVERITY = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Human</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION_ELEMENT5__HUMAN = ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION_ELEMENT5__EXPRESSION = ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Xpath</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION_ELEMENT5__XPATH = ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION_ELEMENT5__SOURCE = ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Element Definition Element5</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION_ELEMENT5_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Element Definition Element5</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION_ELEMENT5_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fhiRCore.dataTypes.impl.ElementDefinitionElement6Impl <em>Element Definition Element6</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.dataTypes.impl.ElementDefinitionElement6Impl
	 * @see fhiRCore.dataTypes.impl.DataTypesPackageImpl#getElementDefinitionElement6()
	 * @generated
	 */
	int ELEMENT_DEFINITION_ELEMENT6 = 74;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION_ELEMENT6__ID = ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION_ELEMENT6__EXTENSION = ELEMENT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Strength</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION_ELEMENT6__STRENGTH = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION_ELEMENT6__DESCRIPTION = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Value Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION_ELEMENT6__VALUE_SET = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Element Definition Element6</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION_ELEMENT6_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Element Definition Element6</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION_ELEMENT6_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fhiRCore.dataTypes.impl.ElementDefinitionElement7Impl <em>Element Definition Element7</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.dataTypes.impl.ElementDefinitionElement7Impl
	 * @see fhiRCore.dataTypes.impl.DataTypesPackageImpl#getElementDefinitionElement7()
	 * @generated
	 */
	int ELEMENT_DEFINITION_ELEMENT7 = 75;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION_ELEMENT7__ID = ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION_ELEMENT7__EXTENSION = ELEMENT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Identity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION_ELEMENT7__IDENTITY = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Language</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION_ELEMENT7__LANGUAGE = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Map</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION_ELEMENT7__MAP = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION_ELEMENT7__COMMENT = ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Element Definition Element7</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION_ELEMENT7_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Element Definition Element7</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION_ELEMENT7_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fhiRCore.dataTypes.impl.CountImpl <em>Count</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.dataTypes.impl.CountImpl
	 * @see fhiRCore.dataTypes.impl.DataTypesPackageImpl#getCount()
	 * @generated
	 */
	int COUNT = 76;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT__ID = QUANTITY__ID;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT__EXTENSION = QUANTITY__EXTENSION;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT__VALUE = QUANTITY__VALUE;

	/**
	 * The feature id for the '<em><b>Comparator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT__COMPARATOR = QUANTITY__COMPARATOR;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT__UNIT = QUANTITY__UNIT;

	/**
	 * The feature id for the '<em><b>System</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT__SYSTEM = QUANTITY__SYSTEM;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT__CODE = QUANTITY__CODE;

	/**
	 * The number of structural features of the '<em>Count</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_FEATURE_COUNT = QUANTITY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Count</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_OPERATION_COUNT = QUANTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fhiRCore.dataTypes.impl.DistanceImpl <em>Distance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.dataTypes.impl.DistanceImpl
	 * @see fhiRCore.dataTypes.impl.DataTypesPackageImpl#getDistance()
	 * @generated
	 */
	int DISTANCE = 77;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTANCE__ID = QUANTITY__ID;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTANCE__EXTENSION = QUANTITY__EXTENSION;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTANCE__VALUE = QUANTITY__VALUE;

	/**
	 * The feature id for the '<em><b>Comparator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTANCE__COMPARATOR = QUANTITY__COMPARATOR;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTANCE__UNIT = QUANTITY__UNIT;

	/**
	 * The feature id for the '<em><b>System</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTANCE__SYSTEM = QUANTITY__SYSTEM;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTANCE__CODE = QUANTITY__CODE;

	/**
	 * The number of structural features of the '<em>Distance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTANCE_FEATURE_COUNT = QUANTITY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Distance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTANCE_OPERATION_COUNT = QUANTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fhiRCore.dataTypes.impl.SampledDataImpl <em>Sampled Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.dataTypes.impl.SampledDataImpl
	 * @see fhiRCore.dataTypes.impl.DataTypesPackageImpl#getSampledData()
	 * @generated
	 */
	int SAMPLED_DATA = 78;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMPLED_DATA__ID = DATA_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMPLED_DATA__EXTENSION = DATA_TYPE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Origin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMPLED_DATA__ORIGIN = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMPLED_DATA__PERIOD = DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Factor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMPLED_DATA__FACTOR = DATA_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Lower Limit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMPLED_DATA__LOWER_LIMIT = DATA_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Upper Limit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMPLED_DATA__UPPER_LIMIT = DATA_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Dimensions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMPLED_DATA__DIMENSIONS = DATA_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMPLED_DATA__DATA = DATA_TYPE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Sampled Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMPLED_DATA_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Sampled Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMPLED_DATA_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fhiRCore.dataTypes.impl.ContributorImpl <em>Contributor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.dataTypes.impl.ContributorImpl
	 * @see fhiRCore.dataTypes.impl.DataTypesPackageImpl#getContributor()
	 * @generated
	 */
	int CONTRIBUTOR = 79;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRIBUTOR__ID = DATA_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRIBUTOR__EXTENSION = DATA_TYPE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRIBUTOR__TYPE = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRIBUTOR__NAME = DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Contact</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRIBUTOR__CONTACT = DATA_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Contributor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRIBUTOR_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Contributor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRIBUTOR_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fhiRCore.dataTypes.impl.SimpleQuantityImpl <em>Simple Quantity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.dataTypes.impl.SimpleQuantityImpl
	 * @see fhiRCore.dataTypes.impl.DataTypesPackageImpl#getSimpleQuantity()
	 * @generated
	 */
	int SIMPLE_QUANTITY = 80;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_QUANTITY__ID = QUANTITY__ID;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_QUANTITY__EXTENSION = QUANTITY__EXTENSION;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_QUANTITY__VALUE = QUANTITY__VALUE;

	/**
	 * The feature id for the '<em><b>Comparator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_QUANTITY__COMPARATOR = QUANTITY__COMPARATOR;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_QUANTITY__UNIT = QUANTITY__UNIT;

	/**
	 * The feature id for the '<em><b>System</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_QUANTITY__SYSTEM = QUANTITY__SYSTEM;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_QUANTITY__CODE = QUANTITY__CODE;

	/**
	 * The number of structural features of the '<em>Simple Quantity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_QUANTITY_FEATURE_COUNT = QUANTITY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Simple Quantity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_QUANTITY_OPERATION_COUNT = QUANTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fhiRCore.dataTypes.impl.MoneyQuantityImpl <em>Money Quantity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.dataTypes.impl.MoneyQuantityImpl
	 * @see fhiRCore.dataTypes.impl.DataTypesPackageImpl#getMoneyQuantity()
	 * @generated
	 */
	int MONEY_QUANTITY = 81;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONEY_QUANTITY__ID = QUANTITY__ID;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONEY_QUANTITY__EXTENSION = QUANTITY__EXTENSION;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONEY_QUANTITY__VALUE = QUANTITY__VALUE;

	/**
	 * The feature id for the '<em><b>Comparator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONEY_QUANTITY__COMPARATOR = QUANTITY__COMPARATOR;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONEY_QUANTITY__UNIT = QUANTITY__UNIT;

	/**
	 * The feature id for the '<em><b>System</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONEY_QUANTITY__SYSTEM = QUANTITY__SYSTEM;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONEY_QUANTITY__CODE = QUANTITY__CODE;

	/**
	 * The number of structural features of the '<em>Money Quantity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONEY_QUANTITY_FEATURE_COUNT = QUANTITY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Money Quantity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONEY_QUANTITY_OPERATION_COUNT = QUANTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fhiRCore.dataTypes.impl.ReferenceRangeImpl <em>Reference Range</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.dataTypes.impl.ReferenceRangeImpl
	 * @see fhiRCore.dataTypes.impl.DataTypesPackageImpl#getReferenceRange()
	 * @generated
	 */
	int REFERENCE_RANGE = 82;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_RANGE__ID = DATA_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_RANGE__EXTENSION = DATA_TYPE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Low</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_RANGE__LOW = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>High</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_RANGE__HIGH = DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_RANGE__TYPE = DATA_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Applies To</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_RANGE__APPLIES_TO = DATA_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Age</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_RANGE__AGE = DATA_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_RANGE__TEXT = DATA_TYPE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Reference Range</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_RANGE_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Reference Range</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_RANGE_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link fhiRCore.dataTypes.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see fhiRCore.dataTypes.Element
	 * @generated
	 */
	EClass getElement();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.dataTypes.Element#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Id</em>'.
	 * @see fhiRCore.dataTypes.Element#getId()
	 * @see #getElement()
	 * @generated
	 */
	EReference getElement_Id();

	/**
	 * Returns the meta object for the containment reference list '{@link fhiRCore.dataTypes.Element#getExtensions <em>Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Extension</em>'.
	 * @see fhiRCore.dataTypes.Element#getExtensions()
	 * @see #getElement()
	 * @generated
	 */
	EReference getElement_Extension();

	/**
	 * Returns the meta object for class '{@link fhiRCore.dataTypes.Base <em>Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Base</em>'.
	 * @see fhiRCore.dataTypes.Base
	 * @generated
	 */
	EClass getBase();

	/**
	 * Returns the meta object for class '{@link fhiRCore.dataTypes.ElementId <em>Element Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element Id</em>'.
	 * @see fhiRCore.dataTypes.ElementId
	 * @generated
	 */
	EClass getElementId();

	/**
	 * Returns the meta object for class '{@link fhiRCore.dataTypes.BackboneElement <em>Backbone Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Backbone Element</em>'.
	 * @see fhiRCore.dataTypes.BackboneElement
	 * @generated
	 */
	EClass getBackboneElement();

	/**
	 * Returns the meta object for the containment reference list '{@link fhiRCore.dataTypes.BackboneElement#getModifierExtensions <em>Modifier Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Modifier Extension</em>'.
	 * @see fhiRCore.dataTypes.BackboneElement#getModifierExtensions()
	 * @see #getBackboneElement()
	 * @generated
	 */
	EReference getBackboneElement_ModifierExtension();

	/**
	 * Returns the meta object for class '{@link fhiRCore.dataTypes.DataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Type</em>'.
	 * @see fhiRCore.dataTypes.DataType
	 * @generated
	 */
	EClass getDataType();

	/**
	 * Returns the meta object for class '{@link fhiRCore.dataTypes.Extension <em>Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Extension</em>'.
	 * @see fhiRCore.dataTypes.Extension
	 * @generated
	 */
	EClass getExtension();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.dataTypes.Extension#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Url</em>'.
	 * @see fhiRCore.dataTypes.Extension#getUrl()
	 * @see #getExtension()
	 * @generated
	 */
	EReference getExtension_Url();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.dataTypes.Extension#getValuex <em>Valuex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Valuex</em>'.
	 * @see fhiRCore.dataTypes.Extension#getValuex()
	 * @see #getExtension()
	 * @generated
	 */
	EReference getExtension_Valuex();

	/**
	 * Returns the meta object for class '{@link fhiRCore.dataTypes.ExtensionUrl <em>Extension Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Extension Url</em>'.
	 * @see fhiRCore.dataTypes.ExtensionUrl
	 * @generated
	 */
	EClass getExtensionUrl();

	/**
	 * Returns the meta object for class '{@link fhiRCore.dataTypes.Base64Binary <em>Base64 Binary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Base64 Binary</em>'.
	 * @see fhiRCore.dataTypes.Base64Binary
	 * @generated
	 */
	EClass getBase64Binary();

	/**
	 * Returns the meta object for the attribute '{@link fhiRCore.dataTypes.Base64Binary#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see fhiRCore.dataTypes.Base64Binary#getValue()
	 * @see #getBase64Binary()
	 * @generated
	 */
	EAttribute getBase64Binary_Value();

	/**
	 * Returns the meta object for class '{@link fhiRCore.dataTypes.Boolean <em>Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean</em>'.
	 * @see fhiRCore.dataTypes.Boolean
	 * @generated
	 */
	EClass getBoolean();

	/**
	 * Returns the meta object for the attribute '{@link fhiRCore.dataTypes.Boolean#isValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see fhiRCore.dataTypes.Boolean#isValue()
	 * @see #getBoolean()
	 * @generated
	 */
	EAttribute getBoolean_Value();

	/**
	 * Returns the meta object for class '{@link fhiRCore.dataTypes.Canonical <em>Canonical</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Canonical</em>'.
	 * @see fhiRCore.dataTypes.Canonical
	 * @generated
	 */
	EClass getCanonical();

	/**
	 * Returns the meta object for class '{@link fhiRCore.dataTypes.Uri <em>Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Uri</em>'.
	 * @see fhiRCore.dataTypes.Uri
	 * @generated
	 */
	EClass getUri();

	/**
	 * Returns the meta object for the attribute '{@link fhiRCore.dataTypes.Uri#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see fhiRCore.dataTypes.Uri#getValue()
	 * @see #getUri()
	 * @generated
	 */
	EAttribute getUri_Value();

	/**
	 * Returns the meta object for class '{@link fhiRCore.dataTypes.Code <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Code</em>'.
	 * @see fhiRCore.dataTypes.Code
	 * @generated
	 */
	EClass getCode();

	/**
	 * Returns the meta object for class '{@link fhiRCore.dataTypes.String <em>String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String</em>'.
	 * @see fhiRCore.dataTypes.String
	 * @generated
	 */
	EClass getString();

	/**
	 * Returns the meta object for the attribute '{@link fhiRCore.dataTypes.String#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see fhiRCore.dataTypes.String#getValue()
	 * @see #getString()
	 * @generated
	 */
	EAttribute getString_Value();

	/**
	 * Returns the meta object for class '{@link fhiRCore.dataTypes.Date <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Date</em>'.
	 * @see fhiRCore.dataTypes.Date
	 * @generated
	 */
	EClass getDate();

	/**
	 * Returns the meta object for the attribute '{@link fhiRCore.dataTypes.Date#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see fhiRCore.dataTypes.Date#getValue()
	 * @see #getDate()
	 * @generated
	 */
	EAttribute getDate_Value();

	/**
	 * Returns the meta object for class '{@link fhiRCore.dataTypes.DateTime <em>Date Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Date Time</em>'.
	 * @see fhiRCore.dataTypes.DateTime
	 * @generated
	 */
	EClass getDateTime();

	/**
	 * Returns the meta object for the attribute '{@link fhiRCore.dataTypes.DateTime#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see fhiRCore.dataTypes.DateTime#getValue()
	 * @see #getDateTime()
	 * @generated
	 */
	EAttribute getDateTime_Value();

	/**
	 * Returns the meta object for class '{@link fhiRCore.dataTypes.Decimal <em>Decimal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Decimal</em>'.
	 * @see fhiRCore.dataTypes.Decimal
	 * @generated
	 */
	EClass getDecimal();

	/**
	 * Returns the meta object for the attribute '{@link fhiRCore.dataTypes.Decimal#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see fhiRCore.dataTypes.Decimal#getValue()
	 * @see #getDecimal()
	 * @generated
	 */
	EAttribute getDecimal_Value();

	/**
	 * Returns the meta object for class '{@link fhiRCore.dataTypes.Id <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Id</em>'.
	 * @see fhiRCore.dataTypes.Id
	 * @generated
	 */
	EClass getId();

	/**
	 * Returns the meta object for class '{@link fhiRCore.dataTypes.Instant <em>Instant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instant</em>'.
	 * @see fhiRCore.dataTypes.Instant
	 * @generated
	 */
	EClass getInstant();

	/**
	 * Returns the meta object for the attribute '{@link fhiRCore.dataTypes.Instant#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see fhiRCore.dataTypes.Instant#getValue()
	 * @see #getInstant()
	 * @generated
	 */
	EAttribute getInstant_Value();

	/**
	 * Returns the meta object for class '{@link fhiRCore.dataTypes.Integer <em>Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer</em>'.
	 * @see fhiRCore.dataTypes.Integer
	 * @generated
	 */
	EClass getInteger();

	/**
	 * Returns the meta object for the attribute '{@link fhiRCore.dataTypes.Integer#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see fhiRCore.dataTypes.Integer#getValue()
	 * @see #getInteger()
	 * @generated
	 */
	EAttribute getInteger_Value();

	/**
	 * Returns the meta object for class '{@link fhiRCore.dataTypes.Markdown <em>Markdown</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Markdown</em>'.
	 * @see fhiRCore.dataTypes.Markdown
	 * @generated
	 */
	EClass getMarkdown();

	/**
	 * Returns the meta object for class '{@link fhiRCore.dataTypes.Oid <em>Oid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Oid</em>'.
	 * @see fhiRCore.dataTypes.Oid
	 * @generated
	 */
	EClass getOid();

	/**
	 * Returns the meta object for class '{@link fhiRCore.dataTypes.PositiveInt <em>Positive Int</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Positive Int</em>'.
	 * @see fhiRCore.dataTypes.PositiveInt
	 * @generated
	 */
	EClass getPositiveInt();

	/**
	 * Returns the meta object for class '{@link fhiRCore.dataTypes.Time <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time</em>'.
	 * @see fhiRCore.dataTypes.Time
	 * @generated
	 */
	EClass getTime();

	/**
	 * Returns the meta object for the attribute '{@link fhiRCore.dataTypes.Time#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see fhiRCore.dataTypes.Time#getValue()
	 * @see #getTime()
	 * @generated
	 */
	EAttribute getTime_Value();

	/**
	 * Returns the meta object for class '{@link fhiRCore.dataTypes.UnsignedInt <em>Unsigned Int</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unsigned Int</em>'.
	 * @see fhiRCore.dataTypes.UnsignedInt
	 * @generated
	 */
	EClass getUnsignedInt();

	/**
	 * Returns the meta object for class '{@link fhiRCore.dataTypes.Url <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Url</em>'.
	 * @see fhiRCore.dataTypes.Url
	 * @generated
	 */
	EClass getUrl();

	/**
	 * Returns the meta object for class '{@link fhiRCore.dataTypes.Uuid <em>Uuid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Uuid</em>'.
	 * @see fhiRCore.dataTypes.Uuid
	 * @generated
	 */
	EClass getUuid();

	/**
	 * Returns the meta object for class '{@link fhiRCore.dataTypes.Address <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Address</em>'.
	 * @see fhiRCore.dataTypes.Address
	 * @generated
	 */
	EClass getAddress();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.dataTypes.Address#getUse <em>Use</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Use</em>'.
	 * @see fhiRCore.dataTypes.Address#getUse()
	 * @see #getAddress()
	 * @generated
	 */
	EReference getAddress_Use();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.dataTypes.Address#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see fhiRCore.dataTypes.Address#getType()
	 * @see #getAddress()
	 * @generated
	 */
	EReference getAddress_Type();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.dataTypes.Address#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Text</em>'.
	 * @see fhiRCore.dataTypes.Address#getText()
	 * @see #getAddress()
	 * @generated
	 */
	EReference getAddress_Text();

	/**
	 * Returns the meta object for the containment reference list '{@link fhiRCore.dataTypes.Address#getLines <em>Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Line</em>'.
	 * @see fhiRCore.dataTypes.Address#getLines()
	 * @see #getAddress()
	 * @generated
	 */
	EReference getAddress_Line();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.dataTypes.Address#getCity <em>City</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>City</em>'.
	 * @see fhiRCore.dataTypes.Address#getCity()
	 * @see #getAddress()
	 * @generated
	 */
	EReference getAddress_City();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.dataTypes.Address#getDistrict <em>District</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>District</em>'.
	 * @see fhiRCore.dataTypes.Address#getDistrict()
	 * @see #getAddress()
	 * @generated
	 */
	EReference getAddress_District();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.dataTypes.Address#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>State</em>'.
	 * @see fhiRCore.dataTypes.Address#getState()
	 * @see #getAddress()
	 * @generated
	 */
	EReference getAddress_State();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.dataTypes.Address#getPostalCode <em>Postal Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Postal Code</em>'.
	 * @see fhiRCore.dataTypes.Address#getPostalCode()
	 * @see #getAddress()
	 * @generated
	 */
	EReference getAddress_PostalCode();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.dataTypes.Address#getCountry <em>Country</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Country</em>'.
	 * @see fhiRCore.dataTypes.Address#getCountry()
	 * @see #getAddress()
	 * @generated
	 */
	EReference getAddress_Country();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.dataTypes.Address#getPeriod <em>Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Period</em>'.
	 * @see fhiRCore.dataTypes.Address#getPeriod()
	 * @see #getAddress()
	 * @generated
	 */
	EReference getAddress_Period();

	/**
	 * Returns the meta object for class '{@link fhiRCore.dataTypes.Period <em>Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Period</em>'.
	 * @see fhiRCore.dataTypes.Period
	 * @generated
	 */
	EClass getPeriod();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.dataTypes.Period#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Start</em>'.
	 * @see fhiRCore.dataTypes.Period#getStart()
	 * @see #getPeriod()
	 * @generated
	 */
	EReference getPeriod_Start();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.dataTypes.Period#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>End</em>'.
	 * @see fhiRCore.dataTypes.Period#getEnd()
	 * @see #getPeriod()
	 * @generated
	 */
	EReference getPeriod_End();

	/**
	 * Returns the meta object for class '{@link fhiRCore.dataTypes.Age <em>Age</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Age</em>'.
	 * @see fhiRCore.dataTypes.Age
	 * @generated
	 */
	EClass getAge();

	/**
	 * Returns the meta object for class '{@link fhiRCore.dataTypes.Quantity <em>Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Quantity</em>'.
	 * @see fhiRCore.dataTypes.Quantity
	 * @generated
	 */
	EClass getQuantity();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.dataTypes.Quantity#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see fhiRCore.dataTypes.Quantity#getValue()
	 * @see #getQuantity()
	 * @generated
	 */
	EReference getQuantity_Value();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.dataTypes.Quantity#getComparator <em>Comparator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Comparator</em>'.
	 * @see fhiRCore.dataTypes.Quantity#getComparator()
	 * @see #getQuantity()
	 * @generated
	 */
	EReference getQuantity_Comparator();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.dataTypes.Quantity#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Unit</em>'.
	 * @see fhiRCore.dataTypes.Quantity#getUnit()
	 * @see #getQuantity()
	 * @generated
	 */
	EReference getQuantity_Unit();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.dataTypes.Quantity#getSystem <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>System</em>'.
	 * @see fhiRCore.dataTypes.Quantity#getSystem()
	 * @see #getQuantity()
	 * @generated
	 */
	EReference getQuantity_System();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.dataTypes.Quantity#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Code</em>'.
	 * @see fhiRCore.dataTypes.Quantity#getCode()
	 * @see #getQuantity()
	 * @generated
	 */
	EReference getQuantity_Code();

	/**
	 * Returns the meta object for class '{@link fhiRCore.dataTypes.Annotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Annotation</em>'.
	 * @see fhiRCore.dataTypes.Annotation
	 * @generated
	 */
	EClass getAnnotation();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.dataTypes.Annotation#getAuthorx <em>Authorx</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Authorx</em>'.
	 * @see fhiRCore.dataTypes.Annotation#getAuthorx()
	 * @see #getAnnotation()
	 * @generated
	 */
	EReference getAnnotation_Authorx();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.dataTypes.Annotation#getTime <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Time</em>'.
	 * @see fhiRCore.dataTypes.Annotation#getTime()
	 * @see #getAnnotation()
	 * @generated
	 */
	EReference getAnnotation_Time();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.dataTypes.Annotation#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Text</em>'.
	 * @see fhiRCore.dataTypes.Annotation#getText()
	 * @see #getAnnotation()
	 * @generated
	 */
	EReference getAnnotation_Text();

	/**
	 * Returns the meta object for class '{@link fhiRCore.dataTypes.Reference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reference</em>'.
	 * @see fhiRCore.dataTypes.Reference
	 * @generated
	 */
	EClass getReference();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.dataTypes.Reference#getReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Reference</em>'.
	 * @see fhiRCore.dataTypes.Reference#getReference()
	 * @see #getReference()
	 * @generated
	 */
	EReference getReference_Reference();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.dataTypes.Reference#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see fhiRCore.dataTypes.Reference#getType()
	 * @see #getReference()
	 * @generated
	 */
	EReference getReference_Type();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.dataTypes.Reference#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Identifier</em>'.
	 * @see fhiRCore.dataTypes.Reference#getIdentifier()
	 * @see #getReference()
	 * @generated
	 */
	EReference getReference_Identifier();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.dataTypes.Reference#getDisplay <em>Display</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Display</em>'.
	 * @see fhiRCore.dataTypes.Reference#getDisplay()
	 * @see #getReference()
	 * @generated
	 */
	EReference getReference_Display();

	/**
	 * Returns the meta object for class '{@link fhiRCore.dataTypes.Identifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Identifier</em>'.
	 * @see fhiRCore.dataTypes.Identifier
	 * @generated
	 */
	EClass getIdentifier();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.dataTypes.Identifier#getUse <em>Use</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Use</em>'.
	 * @see fhiRCore.dataTypes.Identifier#getUse()
	 * @see #getIdentifier()
	 * @generated
	 */
	EReference getIdentifier_Use();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.dataTypes.Identifier#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see fhiRCore.dataTypes.Identifier#getType()
	 * @see #getIdentifier()
	 * @generated
	 */
	EReference getIdentifier_Type();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.dataTypes.Identifier#getSystem <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>System</em>'.
	 * @see fhiRCore.dataTypes.Identifier#getSystem()
	 * @see #getIdentifier()
	 * @generated
	 */
	EReference getIdentifier_System();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.dataTypes.Identifier#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see fhiRCore.dataTypes.Identifier#getValue()
	 * @see #getIdentifier()
	 * @generated
	 */
	EReference getIdentifier_Value();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.dataTypes.Identifier#getPeriod <em>Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Period</em>'.
	 * @see fhiRCore.dataTypes.Identifier#getPeriod()
	 * @see #getIdentifier()
	 * @generated
	 */
	EReference getIdentifier_Period();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.dataTypes.Identifier#getAssigner <em>Assigner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Assigner</em>'.
	 * @see fhiRCore.dataTypes.Identifier#getAssigner()
	 * @see #getIdentifier()
	 * @generated
	 */
	EReference getIdentifier_Assigner();

	/**
	 * Returns the meta object for class '{@link fhiRCore.dataTypes.CodeableConcept <em>Codeable Concept</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Codeable Concept</em>'.
	 * @see fhiRCore.dataTypes.CodeableConcept
	 * @generated
	 */
	EClass getCodeableConcept();

	/**
	 * Returns the meta object for the containment reference list '{@link fhiRCore.dataTypes.CodeableConcept#getCodings <em>Coding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Coding</em>'.
	 * @see fhiRCore.dataTypes.CodeableConcept#getCodings()
	 * @see #getCodeableConcept()
	 * @generated
	 */
	EReference getCodeableConcept_Coding();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.dataTypes.CodeableConcept#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Text</em>'.
	 * @see fhiRCore.dataTypes.CodeableConcept#getText()
	 * @see #getCodeableConcept()
	 * @generated
	 */
	EReference getCodeableConcept_Text();

	/**
	 * Returns the meta object for class '{@link fhiRCore.dataTypes.Coding <em>Coding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Coding</em>'.
	 * @see fhiRCore.dataTypes.Coding
	 * @generated
	 */
	EClass getCoding();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.dataTypes.Coding#getSystem <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>System</em>'.
	 * @see fhiRCore.dataTypes.Coding#getSystem()
	 * @see #getCoding()
	 * @generated
	 */
	EReference getCoding_System();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.dataTypes.Coding#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Version</em>'.
	 * @see fhiRCore.dataTypes.Coding#getVersion()
	 * @see #getCoding()
	 * @generated
	 */
	EReference getCoding_Version();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.dataTypes.Coding#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Code</em>'.
	 * @see fhiRCore.dataTypes.Coding#getCode()
	 * @see #getCoding()
	 * @generated
	 */
	EReference getCoding_Code();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.dataTypes.Coding#getDisplay <em>Display</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Display</em>'.
	 * @see fhiRCore.dataTypes.Coding#getDisplay()
	 * @see #getCoding()
	 * @generated
	 */
	EReference getCoding_Display();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.dataTypes.Coding#getUserSelected <em>User Selected</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>User Selected</em>'.
	 * @see fhiRCore.dataTypes.Coding#getUserSelected()
	 * @see #getCoding()
	 * @generated
	 */
	EReference getCoding_UserSelected();

	/**
	 * Returns the meta object for class '{@link fhiRCore.dataTypes.Meta <em>Meta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Meta</em>'.
	 * @see fhiRCore.dataTypes.Meta
	 * @generated
	 */
	EClass getMeta();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.dataTypes.Meta#getVersionId <em>Version Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Version Id</em>'.
	 * @see fhiRCore.dataTypes.Meta#getVersionId()
	 * @see #getMeta()
	 * @generated
	 */
	EReference getMeta_VersionId();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.dataTypes.Meta#getLastUpdated <em>Last Updated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Last Updated</em>'.
	 * @see fhiRCore.dataTypes.Meta#getLastUpdated()
	 * @see #getMeta()
	 * @generated
	 */
	EReference getMeta_LastUpdated();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.dataTypes.Meta#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Source</em>'.
	 * @see fhiRCore.dataTypes.Meta#getSource()
	 * @see #getMeta()
	 * @generated
	 */
	EReference getMeta_Source();

	/**
	 * Returns the meta object for the containment reference list '{@link fhiRCore.dataTypes.Meta#getProfiles <em>Profile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Profile</em>'.
	 * @see fhiRCore.dataTypes.Meta#getProfiles()
	 * @see #getMeta()
	 * @generated
	 */
	EReference getMeta_Profile();

	/**
	 * Returns the meta object for the containment reference list '{@link fhiRCore.dataTypes.Meta#getSecurities <em>Security</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Security</em>'.
	 * @see fhiRCore.dataTypes.Meta#getSecurities()
	 * @see #getMeta()
	 * @generated
	 */
	EReference getMeta_Security();

	/**
	 * Returns the meta object for the containment reference list '{@link fhiRCore.dataTypes.Meta#getTags <em>Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tag</em>'.
	 * @see fhiRCore.dataTypes.Meta#getTags()
	 * @see #getMeta()
	 * @generated
	 */
	EReference getMeta_Tag();

	/**
	 * Returns the meta object for class '{@link fhiRCore.dataTypes.Narrative <em>Narrative</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Narrative</em>'.
	 * @see fhiRCore.dataTypes.Narrative
	 * @generated
	 */
	EClass getNarrative();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.dataTypes.Narrative#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Status</em>'.
	 * @see fhiRCore.dataTypes.Narrative#getStatus()
	 * @see #getNarrative()
	 * @generated
	 */
	EReference getNarrative_Status();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.dataTypes.Narrative#getDiv <em>Div</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Div</em>'.
	 * @see fhiRCore.dataTypes.Narrative#getDiv()
	 * @see #getNarrative()
	 * @generated
	 */
	EReference getNarrative_Div();

	/**
	 * Returns the meta object for class '{@link fhiRCore.dataTypes.Xhtml <em>Xhtml</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Xhtml</em>'.
	 * @see fhiRCore.dataTypes.Xhtml
	 * @generated
	 */
	EClass getXhtml();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.dataTypes.Xhtml#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see fhiRCore.dataTypes.Xhtml#getValue()
	 * @see #getXhtml()
	 * @generated
	 */
	EReference getXhtml_Value();

	/**
	 * Returns the meta object for class '{@link fhiRCore.dataTypes.XhtmlValue <em>Xhtml Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Xhtml Value</em>'.
	 * @see fhiRCore.dataTypes.XhtmlValue
	 * @generated
	 */
	EClass getXhtmlValue();

	/**
	 * Returns the meta object for class '{@link fhiRCore.dataTypes.ContactPoint <em>Contact Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contact Point</em>'.
	 * @see fhiRCore.dataTypes.ContactPoint
	 * @generated
	 */
	EClass getContactPoint();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.dataTypes.ContactPoint#getSystem <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>System</em>'.
	 * @see fhiRCore.dataTypes.ContactPoint#getSystem()
	 * @see #getContactPoint()
	 * @generated
	 */
	EReference getContactPoint_System();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.dataTypes.ContactPoint#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see fhiRCore.dataTypes.ContactPoint#getValue()
	 * @see #getContactPoint()
	 * @generated
	 */
	EReference getContactPoint_Value();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.dataTypes.ContactPoint#getUse <em>Use</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Use</em>'.
	 * @see fhiRCore.dataTypes.ContactPoint#getUse()
	 * @see #getContactPoint()
	 * @generated
	 */
	EReference getContactPoint_Use();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.dataTypes.ContactPoint#getRank <em>Rank</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rank</em>'.
	 * @see fhiRCore.dataTypes.ContactPoint#getRank()
	 * @see #getContactPoint()
	 * @generated
	 */
	EReference getContactPoint_Rank();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.dataTypes.ContactPoint#getPeriod <em>Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Period</em>'.
	 * @see fhiRCore.dataTypes.ContactPoint#getPeriod()
	 * @see #getContactPoint()
	 * @generated
	 */
	EReference getContactPoint_Period();

	/**
	 * Returns the meta object for class '{@link fhiRCore.dataTypes.HumanName <em>Human Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Human Name</em>'.
	 * @see fhiRCore.dataTypes.HumanName
	 * @generated
	 */
	EClass getHumanName();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.dataTypes.HumanName#getUse <em>Use</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Use</em>'.
	 * @see fhiRCore.dataTypes.HumanName#getUse()
	 * @see #getHumanName()
	 * @generated
	 */
	EReference getHumanName_Use();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.dataTypes.HumanName#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Text</em>'.
	 * @see fhiRCore.dataTypes.HumanName#getText()
	 * @see #getHumanName()
	 * @generated
	 */
	EReference getHumanName_Text();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.dataTypes.HumanName#getFamily <em>Family</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Family</em>'.
	 * @see fhiRCore.dataTypes.HumanName#getFamily()
	 * @see #getHumanName()
	 * @generated
	 */
	EReference getHumanName_Family();

	/**
	 * Returns the meta object for the containment reference list '{@link fhiRCore.dataTypes.HumanName#getGivens <em>Given</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Given</em>'.
	 * @see fhiRCore.dataTypes.HumanName#getGivens()
	 * @see #getHumanName()
	 * @generated
	 */
	EReference getHumanName_Given();

	/**
	 * Returns the meta object for the containment reference list '{@link fhiRCore.dataTypes.HumanName#getPrefixes <em>Prefix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Prefix</em>'.
	 * @see fhiRCore.dataTypes.HumanName#getPrefixes()
	 * @see #getHumanName()
	 * @generated
	 */
	EReference getHumanName_Prefix();

	/**
	 * Returns the meta object for the containment reference list '{@link fhiRCore.dataTypes.HumanName#getSuffixes <em>Suffix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Suffix</em>'.
	 * @see fhiRCore.dataTypes.HumanName#getSuffixes()
	 * @see #getHumanName()
	 * @generated
	 */
	EReference getHumanName_Suffix();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.dataTypes.HumanName#getPeriod <em>Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Period</em>'.
	 * @see fhiRCore.dataTypes.HumanName#getPeriod()
	 * @see #getHumanName()
	 * @generated
	 */
	EReference getHumanName_Period();

	/**
	 * Returns the meta object for class '{@link fhiRCore.dataTypes.Attachment <em>Attachment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attachment</em>'.
	 * @see fhiRCore.dataTypes.Attachment
	 * @generated
	 */
	EClass getAttachment();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.dataTypes.Attachment#getContentType <em>Content Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Content Type</em>'.
	 * @see fhiRCore.dataTypes.Attachment#getContentType()
	 * @see #getAttachment()
	 * @generated
	 */
	EReference getAttachment_ContentType();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.dataTypes.Attachment#getLanguage <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Language</em>'.
	 * @see fhiRCore.dataTypes.Attachment#getLanguage()
	 * @see #getAttachment()
	 * @generated
	 */
	EReference getAttachment_Language();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.dataTypes.Attachment#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data</em>'.
	 * @see fhiRCore.dataTypes.Attachment#getData()
	 * @see #getAttachment()
	 * @generated
	 */
	EReference getAttachment_Data();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.dataTypes.Attachment#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Url</em>'.
	 * @see fhiRCore.dataTypes.Attachment#getUrl()
	 * @see #getAttachment()
	 * @generated
	 */
	EReference getAttachment_Url();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.dataTypes.Attachment#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Size</em>'.
	 * @see fhiRCore.dataTypes.Attachment#getSize()
	 * @see #getAttachment()
	 * @generated
	 */
	EReference getAttachment_Size();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.dataTypes.Attachment#getHash <em>Hash</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Hash</em>'.
	 * @see fhiRCore.dataTypes.Attachment#getHash()
	 * @see #getAttachment()
	 * @generated
	 */
	EReference getAttachment_Hash();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.dataTypes.Attachment#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Title</em>'.
	 * @see fhiRCore.dataTypes.Attachment#getTitle()
	 * @see #getAttachment()
	 * @generated
	 */
	EReference getAttachment_Title();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.dataTypes.Attachment#getCreation <em>Creation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Creation</em>'.
	 * @see fhiRCore.dataTypes.Attachment#getCreation()
	 * @see #getAttachment()
	 * @generated
	 */
	EReference getAttachment_Creation();

	/**
	 * Returns the meta object for class '{@link fhiRCore.dataTypes.ContactDetail <em>Contact Detail</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contact Detail</em>'.
	 * @see fhiRCore.dataTypes.ContactDetail
	 * @generated
	 */
	EClass getContactDetail();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.dataTypes.ContactDetail#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Name</em>'.
	 * @see fhiRCore.dataTypes.ContactDetail#getName()
	 * @see #getContactDetail()
	 * @generated
	 */
	EReference getContactDetail_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link fhiRCore.dataTypes.ContactDetail#getTelecoms <em>Telecom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Telecom</em>'.
	 * @see fhiRCore.dataTypes.ContactDetail#getTelecoms()
	 * @see #getContactDetail()
	 * @generated
	 */
	EReference getContactDetail_Telecom();

	/**
	 * Returns the meta object for class '{@link fhiRCore.dataTypes.UsageContext <em>Usage Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Usage Context</em>'.
	 * @see fhiRCore.dataTypes.UsageContext
	 * @generated
	 */
	EClass getUsageContext();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.dataTypes.UsageContext#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Code</em>'.
	 * @see fhiRCore.dataTypes.UsageContext#getCode()
	 * @see #getUsageContext()
	 * @generated
	 */
	EReference getUsageContext_Code();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.dataTypes.UsageContext#getValueCodeableConcept <em>Value Codeable Concept</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value Codeable Concept</em>'.
	 * @see fhiRCore.dataTypes.UsageContext#getValueCodeableConcept()
	 * @see #getUsageContext()
	 * @generated
	 */
	EReference getUsageContext_ValueCodeableConcept();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.dataTypes.UsageContext#getValueQuantity <em>Value Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value Quantity</em>'.
	 * @see fhiRCore.dataTypes.UsageContext#getValueQuantity()
	 * @see #getUsageContext()
	 * @generated
	 */
	EReference getUsageContext_ValueQuantity();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.dataTypes.UsageContext#getValueRange <em>Value Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value Range</em>'.
	 * @see fhiRCore.dataTypes.UsageContext#getValueRange()
	 * @see #getUsageContext()
	 * @generated
	 */
	EReference getUsageContext_ValueRange();

	/**
	 * Returns the meta object for class '{@link fhiRCore.dataTypes.Range <em>Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Range</em>'.
	 * @see fhiRCore.dataTypes.Range
	 * @generated
	 */
	EClass getRange();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.dataTypes.Range#getLow <em>Low</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Low</em>'.
	 * @see fhiRCore.dataTypes.Range#getLow()
	 * @see #getRange()
	 * @generated
	 */
	EReference getRange_Low();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.dataTypes.Range#getHigh <em>High</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>High</em>'.
	 * @see fhiRCore.dataTypes.Range#getHigh()
	 * @see #getRange()
	 * @generated
	 */
	EReference getRange_High();

	/**
	 * Returns the meta object for class '{@link fhiRCore.dataTypes.RelatedArtifact <em>Related Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Related Artifact</em>'.
	 * @see fhiRCore.dataTypes.RelatedArtifact
	 * @generated
	 */
	EClass getRelatedArtifact();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.dataTypes.RelatedArtifact#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see fhiRCore.dataTypes.RelatedArtifact#getType()
	 * @see #getRelatedArtifact()
	 * @generated
	 */
	EReference getRelatedArtifact_Type();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.dataTypes.RelatedArtifact#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Label</em>'.
	 * @see fhiRCore.dataTypes.RelatedArtifact#getLabel()
	 * @see #getRelatedArtifact()
	 * @generated
	 */
	EReference getRelatedArtifact_Label();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.dataTypes.RelatedArtifact#getDisplay <em>Display</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Display</em>'.
	 * @see fhiRCore.dataTypes.RelatedArtifact#getDisplay()
	 * @see #getRelatedArtifact()
	 * @generated
	 */
	EReference getRelatedArtifact_Display();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.dataTypes.RelatedArtifact#getCitation <em>Citation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Citation</em>'.
	 * @see fhiRCore.dataTypes.RelatedArtifact#getCitation()
	 * @see #getRelatedArtifact()
	 * @generated
	 */
	EReference getRelatedArtifact_Citation();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.dataTypes.RelatedArtifact#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Url</em>'.
	 * @see fhiRCore.dataTypes.RelatedArtifact#getUrl()
	 * @see #getRelatedArtifact()
	 * @generated
	 */
	EReference getRelatedArtifact_Url();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.dataTypes.RelatedArtifact#getDocument <em>Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Document</em>'.
	 * @see fhiRCore.dataTypes.RelatedArtifact#getDocument()
	 * @see #getRelatedArtifact()
	 * @generated
	 */
	EReference getRelatedArtifact_Document();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.dataTypes.RelatedArtifact#getResource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Resource</em>'.
	 * @see fhiRCore.dataTypes.RelatedArtifact#getResource()
	 * @see #getRelatedArtifact()
	 * @generated
	 */
	EReference getRelatedArtifact_Resource();

	/**
	 * Returns the meta object for class '{@link fhiRCore.dataTypes.ParameterDefinition <em>Parameter Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Definition</em>'.
	 * @see fhiRCore.dataTypes.ParameterDefinition
	 * @generated
	 */
	EClass getParameterDefinition();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.dataTypes.ParameterDefinition#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Name</em>'.
	 * @see fhiRCore.dataTypes.ParameterDefinition#getName()
	 * @see #getParameterDefinition()
	 * @generated
	 */
	EReference getParameterDefinition_Name();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.dataTypes.ParameterDefinition#getUse <em>Use</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Use</em>'.
	 * @see fhiRCore.dataTypes.ParameterDefinition#getUse()
	 * @see #getParameterDefinition()
	 * @generated
	 */
	EReference getParameterDefinition_Use();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.dataTypes.ParameterDefinition#getMin <em>Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Min</em>'.
	 * @see fhiRCore.dataTypes.ParameterDefinition#getMin()
	 * @see #getParameterDefinition()
	 * @generated
	 */
	EReference getParameterDefinition_Min();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.dataTypes.ParameterDefinition#getMax <em>Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Max</em>'.
	 * @see fhiRCore.dataTypes.ParameterDefinition#getMax()
	 * @see #getParameterDefinition()
	 * @generated
	 */
	EReference getParameterDefinition_Max();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.dataTypes.ParameterDefinition#getDocumentation <em>Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Documentation</em>'.
	 * @see fhiRCore.dataTypes.ParameterDefinition#getDocumentation()
	 * @see #getParameterDefinition()
	 * @generated
	 */
	EReference getParameterDefinition_Documentation();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.dataTypes.ParameterDefinition#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see fhiRCore.dataTypes.ParameterDefinition#getType()
	 * @see #getParameterDefinition()
	 * @generated
	 */
	EReference getParameterDefinition_Type();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.dataTypes.ParameterDefinition#getProfile <em>Profile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Profile</em>'.
	 * @see fhiRCore.dataTypes.ParameterDefinition#getProfile()
	 * @see #getParameterDefinition()
	 * @generated
	 */
	EReference getParameterDefinition_Profile();

	/**
	 * Returns the meta object for class '{@link fhiRCore.dataTypes.DataRequirement <em>Data Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Requirement</em>'.
	 * @see fhiRCore.dataTypes.DataRequirement
	 * @generated
	 */
	EClass getDataRequirement();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.dataTypes.DataRequirement#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see fhiRCore.dataTypes.DataRequirement#getType()
	 * @see #getDataRequirement()
	 * @generated
	 */
	EReference getDataRequirement_Type();

	/**
	 * Returns the meta object for the containment reference list '{@link fhiRCore.dataTypes.DataRequirement#getProfiles <em>Profile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Profile</em>'.
	 * @see fhiRCore.dataTypes.DataRequirement#getProfiles()
	 * @see #getDataRequirement()
	 * @generated
	 */
	EReference getDataRequirement_Profile();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.dataTypes.DataRequirement#getSubjectx <em>Subjectx</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Subjectx</em>'.
	 * @see fhiRCore.dataTypes.DataRequirement#getSubjectx()
	 * @see #getDataRequirement()
	 * @generated
	 */
	EReference getDataRequirement_Subjectx();

	/**
	 * Returns the meta object for the containment reference list '{@link fhiRCore.dataTypes.DataRequirement#getMustSupports <em>Must Support</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Must Support</em>'.
	 * @see fhiRCore.dataTypes.DataRequirement#getMustSupports()
	 * @see #getDataRequirement()
	 * @generated
	 */
	EReference getDataRequirement_MustSupport();

	/**
	 * Returns the meta object for the containment reference list '{@link fhiRCore.dataTypes.DataRequirement#getCodeFilters <em>Code Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Code Filter</em>'.
	 * @see fhiRCore.dataTypes.DataRequirement#getCodeFilters()
	 * @see #getDataRequirement()
	 * @generated
	 */
	EReference getDataRequirement_CodeFilter();

	/**
	 * Returns the meta object for the containment reference list '{@link fhiRCore.dataTypes.DataRequirement#getDateFilters <em>Date Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Date Filter</em>'.
	 * @see fhiRCore.dataTypes.DataRequirement#getDateFilters()
	 * @see #getDataRequirement()
	 * @generated
	 */
	EReference getDataRequirement_DateFilter();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.dataTypes.DataRequirement#getLimit <em>Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Limit</em>'.
	 * @see fhiRCore.dataTypes.DataRequirement#getLimit()
	 * @see #getDataRequirement()
	 * @generated
	 */
	EReference getDataRequirement_Limit();

	/**
	 * Returns the meta object for the containment reference list '{@link fhiRCore.dataTypes.DataRequirement#getSorts <em>Sort</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sort</em>'.
	 * @see fhiRCore.dataTypes.DataRequirement#getSorts()
	 * @see #getDataRequirement()
	 * @generated
	 */
	EReference getDataRequirement_Sort();

	/**
	 * Returns the meta object for class '{@link fhiRCore.dataTypes.DataRequirementElement1 <em>Data Requirement Element1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Requirement Element1</em>'.
	 * @see fhiRCore.dataTypes.DataRequirementElement1
	 * @generated
	 */
	EClass getDataRequirementElement1();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.dataTypes.DataRequirementElement1#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Path</em>'.
	 * @see fhiRCore.dataTypes.DataRequirementElement1#getPath()
	 * @see #getDataRequirementElement1()
	 * @generated
	 */
	EReference getDataRequirementElement1_Path();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.dataTypes.DataRequirementElement1#getSearchParam <em>Search Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Search Param</em>'.
	 * @see fhiRCore.dataTypes.DataRequirementElement1#getSearchParam()
	 * @see #getDataRequirementElement1()
	 * @generated
	 */
	EReference getDataRequirementElement1_SearchParam();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.dataTypes.DataRequirementElement1#getValueSet <em>Value Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value Set</em>'.
	 * @see fhiRCore.dataTypes.DataRequirementElement1#getValueSet()
	 * @see #getDataRequirementElement1()
	 * @generated
	 */
	EReference getDataRequirementElement1_ValueSet();

	/**
	 * Returns the meta object for the containment reference list '{@link fhiRCore.dataTypes.DataRequirementElement1#getCodes <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Code</em>'.
	 * @see fhiRCore.dataTypes.DataRequirementElement1#getCodes()
	 * @see #getDataRequirementElement1()
	 * @generated
	 */
	EReference getDataRequirementElement1_Code();

	/**
	 * Returns the meta object for class '{@link fhiRCore.dataTypes.DataRequirementElement2 <em>Data Requirement Element2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Requirement Element2</em>'.
	 * @see fhiRCore.dataTypes.DataRequirementElement2
	 * @generated
	 */
	EClass getDataRequirementElement2();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.dataTypes.DataRequirementElement2#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Path</em>'.
	 * @see fhiRCore.dataTypes.DataRequirementElement2#getPath()
	 * @see #getDataRequirementElement2()
	 * @generated
	 */
	EReference getDataRequirementElement2_Path();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.dataTypes.DataRequirementElement2#getSearchParam <em>Search Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Search Param</em>'.
	 * @see fhiRCore.dataTypes.DataRequirementElement2#getSearchParam()
	 * @see #getDataRequirementElement2()
	 * @generated
	 */
	EReference getDataRequirementElement2_SearchParam();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.dataTypes.DataRequirementElement2#getValuex <em>Valuex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Valuex</em>'.
	 * @see fhiRCore.dataTypes.DataRequirementElement2#getValuex()
	 * @see #getDataRequirementElement2()
	 * @generated
	 */
	EReference getDataRequirementElement2_Valuex();

	/**
	 * Returns the meta object for class '{@link fhiRCore.dataTypes.DataRequirementElement3 <em>Data Requirement Element3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Requirement Element3</em>'.
	 * @see fhiRCore.dataTypes.DataRequirementElement3
	 * @generated
	 */
	EClass getDataRequirementElement3();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.dataTypes.DataRequirementElement3#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Path</em>'.
	 * @see fhiRCore.dataTypes.DataRequirementElement3#getPath()
	 * @see #getDataRequirementElement3()
	 * @generated
	 */
	EReference getDataRequirementElement3_Path();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.dataTypes.DataRequirementElement3#getDirection <em>Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Direction</em>'.
	 * @see fhiRCore.dataTypes.DataRequirementElement3#getDirection()
	 * @see #getDataRequirementElement3()
	 * @generated
	 */
	EReference getDataRequirementElement3_Direction();

	/**
	 * Returns the meta object for class '{@link fhiRCore.dataTypes.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression</em>'.
	 * @see fhiRCore.dataTypes.Expression
	 * @generated
	 */
	EClass getExpression();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.dataTypes.Expression#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see fhiRCore.dataTypes.Expression#getDescription()
	 * @see #getExpression()
	 * @generated
	 */
	EReference getExpression_Description();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.dataTypes.Expression#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Name</em>'.
	 * @see fhiRCore.dataTypes.Expression#getName()
	 * @see #getExpression()
	 * @generated
	 */
	EReference getExpression_Name();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.dataTypes.Expression#getLanguage <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Language</em>'.
	 * @see fhiRCore.dataTypes.Expression#getLanguage()
	 * @see #getExpression()
	 * @generated
	 */
	EReference getExpression_Language();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.dataTypes.Expression#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see fhiRCore.dataTypes.Expression#getExpression()
	 * @see #getExpression()
	 * @generated
	 */
	EReference getExpression_Expression();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.dataTypes.Expression#getReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Reference</em>'.
	 * @see fhiRCore.dataTypes.Expression#getReference()
	 * @see #getExpression()
	 * @generated
	 */
	EReference getExpression_Reference();

	/**
	 * Returns the meta object for class '{@link fhiRCore.dataTypes.Duration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Duration</em>'.
	 * @see fhiRCore.dataTypes.Duration
	 * @generated
	 */
	EClass getDuration();

	/**
	 * Returns the meta object for class '{@link fhiRCore.dataTypes.TriggerDefinition <em>Trigger Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trigger Definition</em>'.
	 * @see fhiRCore.dataTypes.TriggerDefinition
	 * @generated
	 */
	EClass getTriggerDefinition();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.dataTypes.TriggerDefinition#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see fhiRCore.dataTypes.TriggerDefinition#getType()
	 * @see #getTriggerDefinition()
	 * @generated
	 */
	EReference getTriggerDefinition_Type();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.dataTypes.TriggerDefinition#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Name</em>'.
	 * @see fhiRCore.dataTypes.TriggerDefinition#getName()
	 * @see #getTriggerDefinition()
	 * @generated
	 */
	EReference getTriggerDefinition_Name();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.dataTypes.TriggerDefinition#getTimingx <em>Timingx</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Timingx</em>'.
	 * @see fhiRCore.dataTypes.TriggerDefinition#getTimingx()
	 * @see #getTriggerDefinition()
	 * @generated
	 */
	EReference getTriggerDefinition_Timingx();

	/**
	 * Returns the meta object for the containment reference list '{@link fhiRCore.dataTypes.TriggerDefinition#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data</em>'.
	 * @see fhiRCore.dataTypes.TriggerDefinition#getData()
	 * @see #getTriggerDefinition()
	 * @generated
	 */
	EReference getTriggerDefinition_Data();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.dataTypes.TriggerDefinition#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see fhiRCore.dataTypes.TriggerDefinition#getCondition()
	 * @see #getTriggerDefinition()
	 * @generated
	 */
	EReference getTriggerDefinition_Condition();

	/**
	 * Returns the meta object for class '{@link fhiRCore.dataTypes.Dosage <em>Dosage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dosage</em>'.
	 * @see fhiRCore.dataTypes.Dosage
	 * @generated
	 */
	EClass getDosage();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.dataTypes.Dosage#getSequence <em>Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sequence</em>'.
	 * @see fhiRCore.dataTypes.Dosage#getSequence()
	 * @see #getDosage()
	 * @generated
	 */
	EReference getDosage_Sequence();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.dataTypes.Dosage#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Text</em>'.
	 * @see fhiRCore.dataTypes.Dosage#getText()
	 * @see #getDosage()
	 * @generated
	 */
	EReference getDosage_Text();

	/**
	 * Returns the meta object for the containment reference list '{@link fhiRCore.dataTypes.Dosage#getAdditionalInstructions <em>Additional Instruction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Additional Instruction</em>'.
	 * @see fhiRCore.dataTypes.Dosage#getAdditionalInstructions()
	 * @see #getDosage()
	 * @generated
	 */
	EReference getDosage_AdditionalInstruction();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.dataTypes.Dosage#getPatientInstruction <em>Patient Instruction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Patient Instruction</em>'.
	 * @see fhiRCore.dataTypes.Dosage#getPatientInstruction()
	 * @see #getDosage()
	 * @generated
	 */
	EReference getDosage_PatientInstruction();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.dataTypes.Dosage#getTiming <em>Timing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Timing</em>'.
	 * @see fhiRCore.dataTypes.Dosage#getTiming()
	 * @see #getDosage()
	 * @generated
	 */
	EReference getDosage_Timing();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.dataTypes.Dosage#getAsNeededx <em>As Neededx</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>As Neededx</em>'.
	 * @see fhiRCore.dataTypes.Dosage#getAsNeededx()
	 * @see #getDosage()
	 * @generated
	 */
	EReference getDosage_AsNeededx();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.dataTypes.Dosage#getSite <em>Site</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Site</em>'.
	 * @see fhiRCore.dataTypes.Dosage#getSite()
	 * @see #getDosage()
	 * @generated
	 */
	EReference getDosage_Site();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.dataTypes.Dosage#getRoute <em>Route</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Route</em>'.
	 * @see fhiRCore.dataTypes.Dosage#getRoute()
	 * @see #getDosage()
	 * @generated
	 */
	EReference getDosage_Route();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.dataTypes.Dosage#getMethod <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Method</em>'.
	 * @see fhiRCore.dataTypes.Dosage#getMethod()
	 * @see #getDosage()
	 * @generated
	 */
	EReference getDosage_Method();

	/**
	 * Returns the meta object for the containment reference list '{@link fhiRCore.dataTypes.Dosage#getDoseAndRates <em>Dose And Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dose And Rate</em>'.
	 * @see fhiRCore.dataTypes.Dosage#getDoseAndRates()
	 * @see #getDosage()
	 * @generated
	 */
	EReference getDosage_DoseAndRate();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.dataTypes.Dosage#getMaxDosePerPeriod <em>Max Dose Per Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Max Dose Per Period</em>'.
	 * @see fhiRCore.dataTypes.Dosage#getMaxDosePerPeriod()
	 * @see #getDosage()
	 * @generated
	 */
	EReference getDosage_MaxDosePerPeriod();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.dataTypes.Dosage#getMaxDosePerAdministration <em>Max Dose Per Administration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Max Dose Per Administration</em>'.
	 * @see fhiRCore.dataTypes.Dosage#getMaxDosePerAdministration()
	 * @see #getDosage()
	 * @generated
	 */
	EReference getDosage_MaxDosePerAdministration();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.dataTypes.Dosage#getMaxDosePerLifetime <em>Max Dose Per Lifetime</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Max Dose Per Lifetime</em>'.
	 * @see fhiRCore.dataTypes.Dosage#getMaxDosePerLifetime()
	 * @see #getDosage()
	 * @generated
	 */
	EReference getDosage_MaxDosePerLifetime();

	/**
	 * Returns the meta object for class '{@link fhiRCore.dataTypes.Timing <em>Timing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Timing</em>'.
	 * @see fhiRCore.dataTypes.Timing
	 * @generated
	 */
	EClass getTiming();

	/**
	 * Returns the meta object for the containment reference list '{@link fhiRCore.dataTypes.Timing#getEvents <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Event</em>'.
	 * @see fhiRCore.dataTypes.Timing#getEvents()
	 * @see #getTiming()
	 * @generated
	 */
	EReference getTiming_Event();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.dataTypes.Timing#getRepeat <em>Repeat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Repeat</em>'.
	 * @see fhiRCore.dataTypes.Timing#getRepeat()
	 * @see #getTiming()
	 * @generated
	 */
	EReference getTiming_Repeat();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.dataTypes.Timing#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Code</em>'.
	 * @see fhiRCore.dataTypes.Timing#getCode()
	 * @see #getTiming()
	 * @generated
	 */
	EReference getTiming_Code();

	/**
	 * Returns the meta object for class '{@link fhiRCore.dataTypes.TimingElement1 <em>Timing Element1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Timing Element1</em>'.
	 * @see fhiRCore.dataTypes.TimingElement1
	 * @generated
	 */
	EClass getTimingElement1();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.dataTypes.TimingElement1#getBoundsx <em>Boundsx</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Boundsx</em>'.
	 * @see fhiRCore.dataTypes.TimingElement1#getBoundsx()
	 * @see #getTimingElement1()
	 * @generated
	 */
	EReference getTimingElement1_Boundsx();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.dataTypes.TimingElement1#getCount <em>Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Count</em>'.
	 * @see fhiRCore.dataTypes.TimingElement1#getCount()
	 * @see #getTimingElement1()
	 * @generated
	 */
	EReference getTimingElement1_Count();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.dataTypes.TimingElement1#getCountMax <em>Count Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Count Max</em>'.
	 * @see fhiRCore.dataTypes.TimingElement1#getCountMax()
	 * @see #getTimingElement1()
	 * @generated
	 */
	EReference getTimingElement1_CountMax();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.dataTypes.TimingElement1#getDuration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Duration</em>'.
	 * @see fhiRCore.dataTypes.TimingElement1#getDuration()
	 * @see #getTimingElement1()
	 * @generated
	 */
	EReference getTimingElement1_Duration();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.dataTypes.TimingElement1#getDurationMax <em>Duration Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Duration Max</em>'.
	 * @see fhiRCore.dataTypes.TimingElement1#getDurationMax()
	 * @see #getTimingElement1()
	 * @generated
	 */
	EReference getTimingElement1_DurationMax();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.dataTypes.TimingElement1#getDurationUnit <em>Duration Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Duration Unit</em>'.
	 * @see fhiRCore.dataTypes.TimingElement1#getDurationUnit()
	 * @see #getTimingElement1()
	 * @generated
	 */
	EReference getTimingElement1_DurationUnit();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.dataTypes.TimingElement1#getFrequency <em>Frequency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Frequency</em>'.
	 * @see fhiRCore.dataTypes.TimingElement1#getFrequency()
	 * @see #getTimingElement1()
	 * @generated
	 */
	EReference getTimingElement1_Frequency();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.dataTypes.TimingElement1#getFrequencyMax <em>Frequency Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Frequency Max</em>'.
	 * @see fhiRCore.dataTypes.TimingElement1#getFrequencyMax()
	 * @see #getTimingElement1()
	 * @generated
	 */
	EReference getTimingElement1_FrequencyMax();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.dataTypes.TimingElement1#getPeriod <em>Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Period</em>'.
	 * @see fhiRCore.dataTypes.TimingElement1#getPeriod()
	 * @see #getTimingElement1()
	 * @generated
	 */
	EReference getTimingElement1_Period();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.dataTypes.TimingElement1#getPeriodMax <em>Period Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Period Max</em>'.
	 * @see fhiRCore.dataTypes.TimingElement1#getPeriodMax()
	 * @see #getTimingElement1()
	 * @generated
	 */
	EReference getTimingElement1_PeriodMax();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.dataTypes.TimingElement1#getPeriodUnit <em>Period Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Period Unit</em>'.
	 * @see fhiRCore.dataTypes.TimingElement1#getPeriodUnit()
	 * @see #getTimingElement1()
	 * @generated
	 */
	EReference getTimingElement1_PeriodUnit();

	/**
	 * Returns the meta object for the containment reference list '{@link fhiRCore.dataTypes.TimingElement1#getDayOfWeeks <em>Day Of Week</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Day Of Week</em>'.
	 * @see fhiRCore.dataTypes.TimingElement1#getDayOfWeeks()
	 * @see #getTimingElement1()
	 * @generated
	 */
	EReference getTimingElement1_DayOfWeek();

	/**
	 * Returns the meta object for the containment reference list '{@link fhiRCore.dataTypes.TimingElement1#getTimeOfDaies <em>Time Of Day</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Time Of Day</em>'.
	 * @see fhiRCore.dataTypes.TimingElement1#getTimeOfDaies()
	 * @see #getTimingElement1()
	 * @generated
	 */
	EReference getTimingElement1_TimeOfDay();

	/**
	 * Returns the meta object for the containment reference list '{@link fhiRCore.dataTypes.TimingElement1#getWhens <em>When</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>When</em>'.
	 * @see fhiRCore.dataTypes.TimingElement1#getWhens()
	 * @see #getTimingElement1()
	 * @generated
	 */
	EReference getTimingElement1_When();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.dataTypes.TimingElement1#getOffset <em>Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Offset</em>'.
	 * @see fhiRCore.dataTypes.TimingElement1#getOffset()
	 * @see #getTimingElement1()
	 * @generated
	 */
	EReference getTimingElement1_Offset();

	/**
	 * Returns the meta object for class '{@link fhiRCore.dataTypes.DosageElement1 <em>Dosage Element1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dosage Element1</em>'.
	 * @see fhiRCore.dataTypes.DosageElement1
	 * @generated
	 */
	EClass getDosageElement1();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.dataTypes.DosageElement1#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see fhiRCore.dataTypes.DosageElement1#getType()
	 * @see #getDosageElement1()
	 * @generated
	 */
	EReference getDosageElement1_Type();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.dataTypes.DosageElement1#getDosex <em>Dosex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Dosex</em>'.
	 * @see fhiRCore.dataTypes.DosageElement1#getDosex()
	 * @see #getDosageElement1()
	 * @generated
	 */
	EReference getDosageElement1_Dosex();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.dataTypes.DosageElement1#getRatex <em>Ratex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ratex</em>'.
	 * @see fhiRCore.dataTypes.DosageElement1#getRatex()
	 * @see #getDosageElement1()
	 * @generated
	 */
	EReference getDosageElement1_Ratex();

	/**
	 * Returns the meta object for class '{@link fhiRCore.dataTypes.Ratio <em>Ratio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ratio</em>'.
	 * @see fhiRCore.dataTypes.Ratio
	 * @generated
	 */
	EClass getRatio();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.dataTypes.Ratio#getNumerator <em>Numerator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Numerator</em>'.
	 * @see fhiRCore.dataTypes.Ratio#getNumerator()
	 * @see #getRatio()
	 * @generated
	 */
	EReference getRatio_Numerator();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.dataTypes.Ratio#getDenominator <em>Denominator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Denominator</em>'.
	 * @see fhiRCore.dataTypes.Ratio#getDenominator()
	 * @see #getRatio()
	 * @generated
	 */
	EReference getRatio_Denominator();

	/**
	 * Returns the meta object for class '{@link fhiRCore.dataTypes.Money <em>Money</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Money</em>'.
	 * @see fhiRCore.dataTypes.Money
	 * @generated
	 */
	EClass getMoney();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.dataTypes.Money#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see fhiRCore.dataTypes.Money#getValue()
	 * @see #getMoney()
	 * @generated
	 */
	EReference getMoney_Value();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.dataTypes.Money#getCurrency <em>Currency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Currency</em>'.
	 * @see fhiRCore.dataTypes.Money#getCurrency()
	 * @see #getMoney()
	 * @generated
	 */
	EReference getMoney_Currency();

	/**
	 * Returns the meta object for class '{@link fhiRCore.dataTypes.Signature <em>Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Signature</em>'.
	 * @see fhiRCore.dataTypes.Signature
	 * @generated
	 */
	EClass getSignature();

	/**
	 * Returns the meta object for the containment reference list '{@link fhiRCore.dataTypes.Signature#getTypes <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Type</em>'.
	 * @see fhiRCore.dataTypes.Signature#getTypes()
	 * @see #getSignature()
	 * @generated
	 */
	EReference getSignature_Type();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.dataTypes.Signature#getWhen <em>When</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>When</em>'.
	 * @see fhiRCore.dataTypes.Signature#getWhen()
	 * @see #getSignature()
	 * @generated
	 */
	EReference getSignature_When();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.dataTypes.Signature#getWho <em>Who</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Who</em>'.
	 * @see fhiRCore.dataTypes.Signature#getWho()
	 * @see #getSignature()
	 * @generated
	 */
	EReference getSignature_Who();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.dataTypes.Signature#getOnBehalfOf <em>On Behalf Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>On Behalf Of</em>'.
	 * @see fhiRCore.dataTypes.Signature#getOnBehalfOf()
	 * @see #getSignature()
	 * @generated
	 */
	EReference getSignature_OnBehalfOf();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.dataTypes.Signature#getTargetFormat <em>Target Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Target Format</em>'.
	 * @see fhiRCore.dataTypes.Signature#getTargetFormat()
	 * @see #getSignature()
	 * @generated
	 */
	EReference getSignature_TargetFormat();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.dataTypes.Signature#getSigFormat <em>Sig Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sig Format</em>'.
	 * @see fhiRCore.dataTypes.Signature#getSigFormat()
	 * @see #getSignature()
	 * @generated
	 */
	EReference getSignature_SigFormat();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.dataTypes.Signature#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data</em>'.
	 * @see fhiRCore.dataTypes.Signature#getData()
	 * @see #getSignature()
	 * @generated
	 */
	EReference getSignature_Data();

	/**
	 * Returns the meta object for class '{@link fhiRCore.dataTypes.ProductShelfLife <em>Product Shelf Life</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product Shelf Life</em>'.
	 * @see fhiRCore.dataTypes.ProductShelfLife
	 * @generated
	 */
	EClass getProductShelfLife();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.dataTypes.ProductShelfLife#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Identifier</em>'.
	 * @see fhiRCore.dataTypes.ProductShelfLife#getIdentifier()
	 * @see #getProductShelfLife()
	 * @generated
	 */
	EReference getProductShelfLife_Identifier();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.dataTypes.ProductShelfLife#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see fhiRCore.dataTypes.ProductShelfLife#getType()
	 * @see #getProductShelfLife()
	 * @generated
	 */
	EReference getProductShelfLife_Type();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.dataTypes.ProductShelfLife#getPeriod <em>Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Period</em>'.
	 * @see fhiRCore.dataTypes.ProductShelfLife#getPeriod()
	 * @see #getProductShelfLife()
	 * @generated
	 */
	EReference getProductShelfLife_Period();

	/**
	 * Returns the meta object for the containment reference list '{@link fhiRCore.dataTypes.ProductShelfLife#getSpecialPrecautionsForStorages <em>Special Precautions For Storage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Special Precautions For Storage</em>'.
	 * @see fhiRCore.dataTypes.ProductShelfLife#getSpecialPrecautionsForStorages()
	 * @see #getProductShelfLife()
	 * @generated
	 */
	EReference getProductShelfLife_SpecialPrecautionsForStorage();

	/**
	 * Returns the meta object for class '{@link fhiRCore.dataTypes.ProdCharacteristic <em>Prod Characteristic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Prod Characteristic</em>'.
	 * @see fhiRCore.dataTypes.ProdCharacteristic
	 * @generated
	 */
	EClass getProdCharacteristic();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.dataTypes.ProdCharacteristic#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Height</em>'.
	 * @see fhiRCore.dataTypes.ProdCharacteristic#getHeight()
	 * @see #getProdCharacteristic()
	 * @generated
	 */
	EReference getProdCharacteristic_Height();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.dataTypes.ProdCharacteristic#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Width</em>'.
	 * @see fhiRCore.dataTypes.ProdCharacteristic#getWidth()
	 * @see #getProdCharacteristic()
	 * @generated
	 */
	EReference getProdCharacteristic_Width();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.dataTypes.ProdCharacteristic#getDepth <em>Depth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Depth</em>'.
	 * @see fhiRCore.dataTypes.ProdCharacteristic#getDepth()
	 * @see #getProdCharacteristic()
	 * @generated
	 */
	EReference getProdCharacteristic_Depth();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.dataTypes.ProdCharacteristic#getWeight <em>Weight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Weight</em>'.
	 * @see fhiRCore.dataTypes.ProdCharacteristic#getWeight()
	 * @see #getProdCharacteristic()
	 * @generated
	 */
	EReference getProdCharacteristic_Weight();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.dataTypes.ProdCharacteristic#getNominalVolume <em>Nominal Volume</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Nominal Volume</em>'.
	 * @see fhiRCore.dataTypes.ProdCharacteristic#getNominalVolume()
	 * @see #getProdCharacteristic()
	 * @generated
	 */
	EReference getProdCharacteristic_NominalVolume();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.dataTypes.ProdCharacteristic#getExternalDiameter <em>External Diameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>External Diameter</em>'.
	 * @see fhiRCore.dataTypes.ProdCharacteristic#getExternalDiameter()
	 * @see #getProdCharacteristic()
	 * @generated
	 */
	EReference getProdCharacteristic_ExternalDiameter();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.dataTypes.ProdCharacteristic#getShape <em>Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Shape</em>'.
	 * @see fhiRCore.dataTypes.ProdCharacteristic#getShape()
	 * @see #getProdCharacteristic()
	 * @generated
	 */
	EReference getProdCharacteristic_Shape();

	/**
	 * Returns the meta object for the containment reference list '{@link fhiRCore.dataTypes.ProdCharacteristic#getColors <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Color</em>'.
	 * @see fhiRCore.dataTypes.ProdCharacteristic#getColors()
	 * @see #getProdCharacteristic()
	 * @generated
	 */
	EReference getProdCharacteristic_Color();

	/**
	 * Returns the meta object for the containment reference list '{@link fhiRCore.dataTypes.ProdCharacteristic#getImprints <em>Imprint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Imprint</em>'.
	 * @see fhiRCore.dataTypes.ProdCharacteristic#getImprints()
	 * @see #getProdCharacteristic()
	 * @generated
	 */
	EReference getProdCharacteristic_Imprint();

	/**
	 * Returns the meta object for the containment reference list '{@link fhiRCore.dataTypes.ProdCharacteristic#getImages <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Image</em>'.
	 * @see fhiRCore.dataTypes.ProdCharacteristic#getImages()
	 * @see #getProdCharacteristic()
	 * @generated
	 */
	EReference getProdCharacteristic_Image();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.dataTypes.ProdCharacteristic#getScoring <em>Scoring</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Scoring</em>'.
	 * @see fhiRCore.dataTypes.ProdCharacteristic#getScoring()
	 * @see #getProdCharacteristic()
	 * @generated
	 */
	EReference getProdCharacteristic_Scoring();

	/**
	 * Returns the meta object for class '{@link fhiRCore.dataTypes.MarketingStatus <em>Marketing Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Marketing Status</em>'.
	 * @see fhiRCore.dataTypes.MarketingStatus
	 * @generated
	 */
	EClass getMarketingStatus();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.dataTypes.MarketingStatus#getCountry <em>Country</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Country</em>'.
	 * @see fhiRCore.dataTypes.MarketingStatus#getCountry()
	 * @see #getMarketingStatus()
	 * @generated
	 */
	EReference getMarketingStatus_Country();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.dataTypes.MarketingStatus#getJurisdiction <em>Jurisdiction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Jurisdiction</em>'.
	 * @see fhiRCore.dataTypes.MarketingStatus#getJurisdiction()
	 * @see #getMarketingStatus()
	 * @generated
	 */
	EReference getMarketingStatus_Jurisdiction();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.dataTypes.MarketingStatus#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Status</em>'.
	 * @see fhiRCore.dataTypes.MarketingStatus#getStatus()
	 * @see #getMarketingStatus()
	 * @generated
	 */
	EReference getMarketingStatus_Status();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.dataTypes.MarketingStatus#getDateRange <em>Date Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Date Range</em>'.
	 * @see fhiRCore.dataTypes.MarketingStatus#getDateRange()
	 * @see #getMarketingStatus()
	 * @generated
	 */
	EReference getMarketingStatus_DateRange();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.dataTypes.MarketingStatus#getRestoreDate <em>Restore Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Restore Date</em>'.
	 * @see fhiRCore.dataTypes.MarketingStatus#getRestoreDate()
	 * @see #getMarketingStatus()
	 * @generated
	 */
	EReference getMarketingStatus_RestoreDate();

	/**
	 * Returns the meta object for class '{@link fhiRCore.dataTypes.Population <em>Population</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Population</em>'.
	 * @see fhiRCore.dataTypes.Population
	 * @generated
	 */
	EClass getPopulation();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.dataTypes.Population#getAgex <em>Agex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Agex</em>'.
	 * @see fhiRCore.dataTypes.Population#getAgex()
	 * @see #getPopulation()
	 * @generated
	 */
	EReference getPopulation_Agex();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.dataTypes.Population#getGender <em>Gender</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Gender</em>'.
	 * @see fhiRCore.dataTypes.Population#getGender()
	 * @see #getPopulation()
	 * @generated
	 */
	EReference getPopulation_Gender();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.dataTypes.Population#getRace <em>Race</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Race</em>'.
	 * @see fhiRCore.dataTypes.Population#getRace()
	 * @see #getPopulation()
	 * @generated
	 */
	EReference getPopulation_Race();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.dataTypes.Population#getPhysiologicalCondition <em>Physiological Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Physiological Condition</em>'.
	 * @see fhiRCore.dataTypes.Population#getPhysiologicalCondition()
	 * @see #getPopulation()
	 * @generated
	 */
	EReference getPopulation_PhysiologicalCondition();

	/**
	 * Returns the meta object for class '{@link fhiRCore.dataTypes.SubstanceAmount <em>Substance Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Substance Amount</em>'.
	 * @see fhiRCore.dataTypes.SubstanceAmount
	 * @generated
	 */
	EClass getSubstanceAmount();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.dataTypes.SubstanceAmount#getAmountx <em>Amountx</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Amountx</em>'.
	 * @see fhiRCore.dataTypes.SubstanceAmount#getAmountx()
	 * @see #getSubstanceAmount()
	 * @generated
	 */
	EReference getSubstanceAmount_Amountx();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.dataTypes.SubstanceAmount#getAmountType <em>Amount Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Amount Type</em>'.
	 * @see fhiRCore.dataTypes.SubstanceAmount#getAmountType()
	 * @see #getSubstanceAmount()
	 * @generated
	 */
	EReference getSubstanceAmount_AmountType();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.dataTypes.SubstanceAmount#getAmountText <em>Amount Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Amount Text</em>'.
	 * @see fhiRCore.dataTypes.SubstanceAmount#getAmountText()
	 * @see #getSubstanceAmount()
	 * @generated
	 */
	EReference getSubstanceAmount_AmountText();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.dataTypes.SubstanceAmount#getReferenceRange <em>Reference Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Reference Range</em>'.
	 * @see fhiRCore.dataTypes.SubstanceAmount#getReferenceRange()
	 * @see #getSubstanceAmount()
	 * @generated
	 */
	EReference getSubstanceAmount_ReferenceRange();

	/**
	 * Returns the meta object for class '{@link fhiRCore.dataTypes.SubstanceAmountElement1 <em>Substance Amount Element1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Substance Amount Element1</em>'.
	 * @see fhiRCore.dataTypes.SubstanceAmountElement1
	 * @generated
	 */
	EClass getSubstanceAmountElement1();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.dataTypes.SubstanceAmountElement1#getLowLimit <em>Low Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Low Limit</em>'.
	 * @see fhiRCore.dataTypes.SubstanceAmountElement1#getLowLimit()
	 * @see #getSubstanceAmountElement1()
	 * @generated
	 */
	EReference getSubstanceAmountElement1_LowLimit();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.dataTypes.SubstanceAmountElement1#getHighLimit <em>High Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>High Limit</em>'.
	 * @see fhiRCore.dataTypes.SubstanceAmountElement1#getHighLimit()
	 * @see #getSubstanceAmountElement1()
	 * @generated
	 */
	EReference getSubstanceAmountElement1_HighLimit();

	/**
	 * Returns the meta object for class '{@link fhiRCore.dataTypes.ElementDefinition <em>Element Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element Definition</em>'.
	 * @see fhiRCore.dataTypes.ElementDefinition
	 * @generated
	 */
	EClass getElementDefinition();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.dataTypes.ElementDefinition#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Path</em>'.
	 * @see fhiRCore.dataTypes.ElementDefinition#getPath()
	 * @see #getElementDefinition()
	 * @generated
	 */
	EReference getElementDefinition_Path();

	/**
	 * Returns the meta object for the containment reference list '{@link fhiRCore.dataTypes.ElementDefinition#getRepresentations <em>Representation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Representation</em>'.
	 * @see fhiRCore.dataTypes.ElementDefinition#getRepresentations()
	 * @see #getElementDefinition()
	 * @generated
	 */
	EReference getElementDefinition_Representation();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.dataTypes.ElementDefinition#getSliceName <em>Slice Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Slice Name</em>'.
	 * @see fhiRCore.dataTypes.ElementDefinition#getSliceName()
	 * @see #getElementDefinition()
	 * @generated
	 */
	EReference getElementDefinition_SliceName();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.dataTypes.ElementDefinition#getSliceIsConstraining <em>Slice Is Constraining</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Slice Is Constraining</em>'.
	 * @see fhiRCore.dataTypes.ElementDefinition#getSliceIsConstraining()
	 * @see #getElementDefinition()
	 * @generated
	 */
	EReference getElementDefinition_SliceIsConstraining();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.dataTypes.ElementDefinition#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Label</em>'.
	 * @see fhiRCore.dataTypes.ElementDefinition#getLabel()
	 * @see #getElementDefinition()
	 * @generated
	 */
	EReference getElementDefinition_Label();

	/**
	 * Returns the meta object for the containment reference list '{@link fhiRCore.dataTypes.ElementDefinition#getCodes <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Code</em>'.
	 * @see fhiRCore.dataTypes.ElementDefinition#getCodes()
	 * @see #getElementDefinition()
	 * @generated
	 */
	EReference getElementDefinition_Code();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.dataTypes.ElementDefinition#getSlicing <em>Slicing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Slicing</em>'.
	 * @see fhiRCore.dataTypes.ElementDefinition#getSlicing()
	 * @see #getElementDefinition()
	 * @generated
	 */
	EReference getElementDefinition_Slicing();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.dataTypes.ElementDefinition#getShort <em>Short</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Short</em>'.
	 * @see fhiRCore.dataTypes.ElementDefinition#getShort()
	 * @see #getElementDefinition()
	 * @generated
	 */
	EReference getElementDefinition_Short();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.dataTypes.ElementDefinition#getDefinition <em>Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Definition</em>'.
	 * @see fhiRCore.dataTypes.ElementDefinition#getDefinition()
	 * @see #getElementDefinition()
	 * @generated
	 */
	EReference getElementDefinition_Definition();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.dataTypes.ElementDefinition#getComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Comment</em>'.
	 * @see fhiRCore.dataTypes.ElementDefinition#getComment()
	 * @see #getElementDefinition()
	 * @generated
	 */
	EReference getElementDefinition_Comment();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.dataTypes.ElementDefinition#getRequirements <em>Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Requirements</em>'.
	 * @see fhiRCore.dataTypes.ElementDefinition#getRequirements()
	 * @see #getElementDefinition()
	 * @generated
	 */
	EReference getElementDefinition_Requirements();

	/**
	 * Returns the meta object for the containment reference list '{@link fhiRCore.dataTypes.ElementDefinition#getAlias <em>Alias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Alias</em>'.
	 * @see fhiRCore.dataTypes.ElementDefinition#getAlias()
	 * @see #getElementDefinition()
	 * @generated
	 */
	EReference getElementDefinition_Alias();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.dataTypes.ElementDefinition#getMin <em>Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Min</em>'.
	 * @see fhiRCore.dataTypes.ElementDefinition#getMin()
	 * @see #getElementDefinition()
	 * @generated
	 */
	EReference getElementDefinition_Min();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.dataTypes.ElementDefinition#getMax <em>Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Max</em>'.
	 * @see fhiRCore.dataTypes.ElementDefinition#getMax()
	 * @see #getElementDefinition()
	 * @generated
	 */
	EReference getElementDefinition_Max();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.dataTypes.ElementDefinition#getBase <em>Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Base</em>'.
	 * @see fhiRCore.dataTypes.ElementDefinition#getBase()
	 * @see #getElementDefinition()
	 * @generated
	 */
	EReference getElementDefinition_Base();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.dataTypes.ElementDefinition#getContentReference <em>Content Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Content Reference</em>'.
	 * @see fhiRCore.dataTypes.ElementDefinition#getContentReference()
	 * @see #getElementDefinition()
	 * @generated
	 */
	EReference getElementDefinition_ContentReference();

	/**
	 * Returns the meta object for the containment reference list '{@link fhiRCore.dataTypes.ElementDefinition#getTypes <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Type</em>'.
	 * @see fhiRCore.dataTypes.ElementDefinition#getTypes()
	 * @see #getElementDefinition()
	 * @generated
	 */
	EReference getElementDefinition_Type();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.dataTypes.ElementDefinition#getDefaultValuex <em>Default Valuex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Default Valuex</em>'.
	 * @see fhiRCore.dataTypes.ElementDefinition#getDefaultValuex()
	 * @see #getElementDefinition()
	 * @generated
	 */
	EReference getElementDefinition_DefaultValuex();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.dataTypes.ElementDefinition#getMeaningWhenMissing <em>Meaning When Missing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Meaning When Missing</em>'.
	 * @see fhiRCore.dataTypes.ElementDefinition#getMeaningWhenMissing()
	 * @see #getElementDefinition()
	 * @generated
	 */
	EReference getElementDefinition_MeaningWhenMissing();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.dataTypes.ElementDefinition#getOrderMeaning <em>Order Meaning</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Order Meaning</em>'.
	 * @see fhiRCore.dataTypes.ElementDefinition#getOrderMeaning()
	 * @see #getElementDefinition()
	 * @generated
	 */
	EReference getElementDefinition_OrderMeaning();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.dataTypes.ElementDefinition#getFixedx <em>Fixedx</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Fixedx</em>'.
	 * @see fhiRCore.dataTypes.ElementDefinition#getFixedx()
	 * @see #getElementDefinition()
	 * @generated
	 */
	EReference getElementDefinition_Fixedx();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.dataTypes.ElementDefinition#getPatternx <em>Patternx</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Patternx</em>'.
	 * @see fhiRCore.dataTypes.ElementDefinition#getPatternx()
	 * @see #getElementDefinition()
	 * @generated
	 */
	EReference getElementDefinition_Patternx();

	/**
	 * Returns the meta object for the containment reference list '{@link fhiRCore.dataTypes.ElementDefinition#getExamples <em>Example</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Example</em>'.
	 * @see fhiRCore.dataTypes.ElementDefinition#getExamples()
	 * @see #getElementDefinition()
	 * @generated
	 */
	EReference getElementDefinition_Example();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.dataTypes.ElementDefinition#getMinValuex <em>Min Valuex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Min Valuex</em>'.
	 * @see fhiRCore.dataTypes.ElementDefinition#getMinValuex()
	 * @see #getElementDefinition()
	 * @generated
	 */
	EReference getElementDefinition_MinValuex();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.dataTypes.ElementDefinition#getMaxValuex <em>Max Valuex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Max Valuex</em>'.
	 * @see fhiRCore.dataTypes.ElementDefinition#getMaxValuex()
	 * @see #getElementDefinition()
	 * @generated
	 */
	EReference getElementDefinition_MaxValuex();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.dataTypes.ElementDefinition#getMaxLength <em>Max Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Max Length</em>'.
	 * @see fhiRCore.dataTypes.ElementDefinition#getMaxLength()
	 * @see #getElementDefinition()
	 * @generated
	 */
	EReference getElementDefinition_MaxLength();

	/**
	 * Returns the meta object for the containment reference list '{@link fhiRCore.dataTypes.ElementDefinition#getConditions <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Condition</em>'.
	 * @see fhiRCore.dataTypes.ElementDefinition#getConditions()
	 * @see #getElementDefinition()
	 * @generated
	 */
	EReference getElementDefinition_Condition();

	/**
	 * Returns the meta object for the containment reference list '{@link fhiRCore.dataTypes.ElementDefinition#getConstraints <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Constraint</em>'.
	 * @see fhiRCore.dataTypes.ElementDefinition#getConstraints()
	 * @see #getElementDefinition()
	 * @generated
	 */
	EReference getElementDefinition_Constraint();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.dataTypes.ElementDefinition#getMustSupport <em>Must Support</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Must Support</em>'.
	 * @see fhiRCore.dataTypes.ElementDefinition#getMustSupport()
	 * @see #getElementDefinition()
	 * @generated
	 */
	EReference getElementDefinition_MustSupport();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.dataTypes.ElementDefinition#getIsModifier <em>Is Modifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Is Modifier</em>'.
	 * @see fhiRCore.dataTypes.ElementDefinition#getIsModifier()
	 * @see #getElementDefinition()
	 * @generated
	 */
	EReference getElementDefinition_IsModifier();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.dataTypes.ElementDefinition#getIsModifierReason <em>Is Modifier Reason</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Is Modifier Reason</em>'.
	 * @see fhiRCore.dataTypes.ElementDefinition#getIsModifierReason()
	 * @see #getElementDefinition()
	 * @generated
	 */
	EReference getElementDefinition_IsModifierReason();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.dataTypes.ElementDefinition#getIsSummary <em>Is Summary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Is Summary</em>'.
	 * @see fhiRCore.dataTypes.ElementDefinition#getIsSummary()
	 * @see #getElementDefinition()
	 * @generated
	 */
	EReference getElementDefinition_IsSummary();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.dataTypes.ElementDefinition#getBinding <em>Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Binding</em>'.
	 * @see fhiRCore.dataTypes.ElementDefinition#getBinding()
	 * @see #getElementDefinition()
	 * @generated
	 */
	EReference getElementDefinition_Binding();

	/**
	 * Returns the meta object for the containment reference list '{@link fhiRCore.dataTypes.ElementDefinition#getMappings <em>Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Mapping</em>'.
	 * @see fhiRCore.dataTypes.ElementDefinition#getMappings()
	 * @see #getElementDefinition()
	 * @generated
	 */
	EReference getElementDefinition_Mapping();

	/**
	 * Returns the meta object for class '{@link fhiRCore.dataTypes.ElementDefinitionElement1 <em>Element Definition Element1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element Definition Element1</em>'.
	 * @see fhiRCore.dataTypes.ElementDefinitionElement1
	 * @generated
	 */
	EClass getElementDefinitionElement1();

	/**
	 * Returns the meta object for the containment reference list '{@link fhiRCore.dataTypes.ElementDefinitionElement1#getDiscriminators <em>Discriminator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Discriminator</em>'.
	 * @see fhiRCore.dataTypes.ElementDefinitionElement1#getDiscriminators()
	 * @see #getElementDefinitionElement1()
	 * @generated
	 */
	EReference getElementDefinitionElement1_Discriminator();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.dataTypes.ElementDefinitionElement1#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see fhiRCore.dataTypes.ElementDefinitionElement1#getDescription()
	 * @see #getElementDefinitionElement1()
	 * @generated
	 */
	EReference getElementDefinitionElement1_Description();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.dataTypes.ElementDefinitionElement1#getOrdered <em>Ordered</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ordered</em>'.
	 * @see fhiRCore.dataTypes.ElementDefinitionElement1#getOrdered()
	 * @see #getElementDefinitionElement1()
	 * @generated
	 */
	EReference getElementDefinitionElement1_Ordered();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.dataTypes.ElementDefinitionElement1#getRules <em>Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rules</em>'.
	 * @see fhiRCore.dataTypes.ElementDefinitionElement1#getRules()
	 * @see #getElementDefinitionElement1()
	 * @generated
	 */
	EReference getElementDefinitionElement1_Rules();

	/**
	 * Returns the meta object for class '{@link fhiRCore.dataTypes.ElementDefinitionElement1Element1 <em>Element Definition Element1 Element1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element Definition Element1 Element1</em>'.
	 * @see fhiRCore.dataTypes.ElementDefinitionElement1Element1
	 * @generated
	 */
	EClass getElementDefinitionElement1Element1();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.dataTypes.ElementDefinitionElement1Element1#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see fhiRCore.dataTypes.ElementDefinitionElement1Element1#getType()
	 * @see #getElementDefinitionElement1Element1()
	 * @generated
	 */
	EReference getElementDefinitionElement1Element1_Type();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.dataTypes.ElementDefinitionElement1Element1#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Path</em>'.
	 * @see fhiRCore.dataTypes.ElementDefinitionElement1Element1#getPath()
	 * @see #getElementDefinitionElement1Element1()
	 * @generated
	 */
	EReference getElementDefinitionElement1Element1_Path();

	/**
	 * Returns the meta object for class '{@link fhiRCore.dataTypes.ElementDefinitionElement2 <em>Element Definition Element2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element Definition Element2</em>'.
	 * @see fhiRCore.dataTypes.ElementDefinitionElement2
	 * @generated
	 */
	EClass getElementDefinitionElement2();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.dataTypes.ElementDefinitionElement2#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Path</em>'.
	 * @see fhiRCore.dataTypes.ElementDefinitionElement2#getPath()
	 * @see #getElementDefinitionElement2()
	 * @generated
	 */
	EReference getElementDefinitionElement2_Path();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.dataTypes.ElementDefinitionElement2#getMin <em>Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Min</em>'.
	 * @see fhiRCore.dataTypes.ElementDefinitionElement2#getMin()
	 * @see #getElementDefinitionElement2()
	 * @generated
	 */
	EReference getElementDefinitionElement2_Min();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.dataTypes.ElementDefinitionElement2#getMax <em>Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Max</em>'.
	 * @see fhiRCore.dataTypes.ElementDefinitionElement2#getMax()
	 * @see #getElementDefinitionElement2()
	 * @generated
	 */
	EReference getElementDefinitionElement2_Max();

	/**
	 * Returns the meta object for class '{@link fhiRCore.dataTypes.ElementDefinitionElement3 <em>Element Definition Element3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element Definition Element3</em>'.
	 * @see fhiRCore.dataTypes.ElementDefinitionElement3
	 * @generated
	 */
	EClass getElementDefinitionElement3();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.dataTypes.ElementDefinitionElement3#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Code</em>'.
	 * @see fhiRCore.dataTypes.ElementDefinitionElement3#getCode()
	 * @see #getElementDefinitionElement3()
	 * @generated
	 */
	EReference getElementDefinitionElement3_Code();

	/**
	 * Returns the meta object for the containment reference list '{@link fhiRCore.dataTypes.ElementDefinitionElement3#getProfiles <em>Profile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Profile</em>'.
	 * @see fhiRCore.dataTypes.ElementDefinitionElement3#getProfiles()
	 * @see #getElementDefinitionElement3()
	 * @generated
	 */
	EReference getElementDefinitionElement3_Profile();

	/**
	 * Returns the meta object for the containment reference list '{@link fhiRCore.dataTypes.ElementDefinitionElement3#getTargetProfiles <em>Target Profile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Target Profile</em>'.
	 * @see fhiRCore.dataTypes.ElementDefinitionElement3#getTargetProfiles()
	 * @see #getElementDefinitionElement3()
	 * @generated
	 */
	EReference getElementDefinitionElement3_TargetProfile();

	/**
	 * Returns the meta object for the containment reference list '{@link fhiRCore.dataTypes.ElementDefinitionElement3#getAggregations <em>Aggregation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Aggregation</em>'.
	 * @see fhiRCore.dataTypes.ElementDefinitionElement3#getAggregations()
	 * @see #getElementDefinitionElement3()
	 * @generated
	 */
	EReference getElementDefinitionElement3_Aggregation();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.dataTypes.ElementDefinitionElement3#getVersioning <em>Versioning</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Versioning</em>'.
	 * @see fhiRCore.dataTypes.ElementDefinitionElement3#getVersioning()
	 * @see #getElementDefinitionElement3()
	 * @generated
	 */
	EReference getElementDefinitionElement3_Versioning();

	/**
	 * Returns the meta object for class '{@link fhiRCore.dataTypes.ElementDefinitionElement4 <em>Element Definition Element4</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element Definition Element4</em>'.
	 * @see fhiRCore.dataTypes.ElementDefinitionElement4
	 * @generated
	 */
	EClass getElementDefinitionElement4();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.dataTypes.ElementDefinitionElement4#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Label</em>'.
	 * @see fhiRCore.dataTypes.ElementDefinitionElement4#getLabel()
	 * @see #getElementDefinitionElement4()
	 * @generated
	 */
	EReference getElementDefinitionElement4_Label();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.dataTypes.ElementDefinitionElement4#getValuex <em>Valuex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Valuex</em>'.
	 * @see fhiRCore.dataTypes.ElementDefinitionElement4#getValuex()
	 * @see #getElementDefinitionElement4()
	 * @generated
	 */
	EReference getElementDefinitionElement4_Valuex();

	/**
	 * Returns the meta object for class '{@link fhiRCore.dataTypes.ElementDefinitionElement5 <em>Element Definition Element5</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element Definition Element5</em>'.
	 * @see fhiRCore.dataTypes.ElementDefinitionElement5
	 * @generated
	 */
	EClass getElementDefinitionElement5();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.dataTypes.ElementDefinitionElement5#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Key</em>'.
	 * @see fhiRCore.dataTypes.ElementDefinitionElement5#getKey()
	 * @see #getElementDefinitionElement5()
	 * @generated
	 */
	EReference getElementDefinitionElement5_Key();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.dataTypes.ElementDefinitionElement5#getRequirements <em>Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Requirements</em>'.
	 * @see fhiRCore.dataTypes.ElementDefinitionElement5#getRequirements()
	 * @see #getElementDefinitionElement5()
	 * @generated
	 */
	EReference getElementDefinitionElement5_Requirements();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.dataTypes.ElementDefinitionElement5#getSeverity <em>Severity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Severity</em>'.
	 * @see fhiRCore.dataTypes.ElementDefinitionElement5#getSeverity()
	 * @see #getElementDefinitionElement5()
	 * @generated
	 */
	EReference getElementDefinitionElement5_Severity();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.dataTypes.ElementDefinitionElement5#getHuman <em>Human</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Human</em>'.
	 * @see fhiRCore.dataTypes.ElementDefinitionElement5#getHuman()
	 * @see #getElementDefinitionElement5()
	 * @generated
	 */
	EReference getElementDefinitionElement5_Human();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.dataTypes.ElementDefinitionElement5#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see fhiRCore.dataTypes.ElementDefinitionElement5#getExpression()
	 * @see #getElementDefinitionElement5()
	 * @generated
	 */
	EReference getElementDefinitionElement5_Expression();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.dataTypes.ElementDefinitionElement5#getXpath <em>Xpath</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Xpath</em>'.
	 * @see fhiRCore.dataTypes.ElementDefinitionElement5#getXpath()
	 * @see #getElementDefinitionElement5()
	 * @generated
	 */
	EReference getElementDefinitionElement5_Xpath();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.dataTypes.ElementDefinitionElement5#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Source</em>'.
	 * @see fhiRCore.dataTypes.ElementDefinitionElement5#getSource()
	 * @see #getElementDefinitionElement5()
	 * @generated
	 */
	EReference getElementDefinitionElement5_Source();

	/**
	 * Returns the meta object for class '{@link fhiRCore.dataTypes.ElementDefinitionElement6 <em>Element Definition Element6</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element Definition Element6</em>'.
	 * @see fhiRCore.dataTypes.ElementDefinitionElement6
	 * @generated
	 */
	EClass getElementDefinitionElement6();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.dataTypes.ElementDefinitionElement6#getStrength <em>Strength</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Strength</em>'.
	 * @see fhiRCore.dataTypes.ElementDefinitionElement6#getStrength()
	 * @see #getElementDefinitionElement6()
	 * @generated
	 */
	EReference getElementDefinitionElement6_Strength();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.dataTypes.ElementDefinitionElement6#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see fhiRCore.dataTypes.ElementDefinitionElement6#getDescription()
	 * @see #getElementDefinitionElement6()
	 * @generated
	 */
	EReference getElementDefinitionElement6_Description();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.dataTypes.ElementDefinitionElement6#getValueSet <em>Value Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value Set</em>'.
	 * @see fhiRCore.dataTypes.ElementDefinitionElement6#getValueSet()
	 * @see #getElementDefinitionElement6()
	 * @generated
	 */
	EReference getElementDefinitionElement6_ValueSet();

	/**
	 * Returns the meta object for class '{@link fhiRCore.dataTypes.ElementDefinitionElement7 <em>Element Definition Element7</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element Definition Element7</em>'.
	 * @see fhiRCore.dataTypes.ElementDefinitionElement7
	 * @generated
	 */
	EClass getElementDefinitionElement7();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.dataTypes.ElementDefinitionElement7#getIdentity <em>Identity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Identity</em>'.
	 * @see fhiRCore.dataTypes.ElementDefinitionElement7#getIdentity()
	 * @see #getElementDefinitionElement7()
	 * @generated
	 */
	EReference getElementDefinitionElement7_Identity();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.dataTypes.ElementDefinitionElement7#getLanguage <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Language</em>'.
	 * @see fhiRCore.dataTypes.ElementDefinitionElement7#getLanguage()
	 * @see #getElementDefinitionElement7()
	 * @generated
	 */
	EReference getElementDefinitionElement7_Language();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.dataTypes.ElementDefinitionElement7#getMap <em>Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Map</em>'.
	 * @see fhiRCore.dataTypes.ElementDefinitionElement7#getMap()
	 * @see #getElementDefinitionElement7()
	 * @generated
	 */
	EReference getElementDefinitionElement7_Map();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.dataTypes.ElementDefinitionElement7#getComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Comment</em>'.
	 * @see fhiRCore.dataTypes.ElementDefinitionElement7#getComment()
	 * @see #getElementDefinitionElement7()
	 * @generated
	 */
	EReference getElementDefinitionElement7_Comment();

	/**
	 * Returns the meta object for class '{@link fhiRCore.dataTypes.Count <em>Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Count</em>'.
	 * @see fhiRCore.dataTypes.Count
	 * @generated
	 */
	EClass getCount();

	/**
	 * Returns the meta object for class '{@link fhiRCore.dataTypes.Distance <em>Distance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Distance</em>'.
	 * @see fhiRCore.dataTypes.Distance
	 * @generated
	 */
	EClass getDistance();

	/**
	 * Returns the meta object for class '{@link fhiRCore.dataTypes.SampledData <em>Sampled Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sampled Data</em>'.
	 * @see fhiRCore.dataTypes.SampledData
	 * @generated
	 */
	EClass getSampledData();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.dataTypes.SampledData#getOrigin <em>Origin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Origin</em>'.
	 * @see fhiRCore.dataTypes.SampledData#getOrigin()
	 * @see #getSampledData()
	 * @generated
	 */
	EReference getSampledData_Origin();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.dataTypes.SampledData#getPeriod <em>Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Period</em>'.
	 * @see fhiRCore.dataTypes.SampledData#getPeriod()
	 * @see #getSampledData()
	 * @generated
	 */
	EReference getSampledData_Period();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.dataTypes.SampledData#getFactor <em>Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Factor</em>'.
	 * @see fhiRCore.dataTypes.SampledData#getFactor()
	 * @see #getSampledData()
	 * @generated
	 */
	EReference getSampledData_Factor();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.dataTypes.SampledData#getLowerLimit <em>Lower Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lower Limit</em>'.
	 * @see fhiRCore.dataTypes.SampledData#getLowerLimit()
	 * @see #getSampledData()
	 * @generated
	 */
	EReference getSampledData_LowerLimit();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.dataTypes.SampledData#getUpperLimit <em>Upper Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Upper Limit</em>'.
	 * @see fhiRCore.dataTypes.SampledData#getUpperLimit()
	 * @see #getSampledData()
	 * @generated
	 */
	EReference getSampledData_UpperLimit();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.dataTypes.SampledData#getDimensions <em>Dimensions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Dimensions</em>'.
	 * @see fhiRCore.dataTypes.SampledData#getDimensions()
	 * @see #getSampledData()
	 * @generated
	 */
	EReference getSampledData_Dimensions();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.dataTypes.SampledData#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data</em>'.
	 * @see fhiRCore.dataTypes.SampledData#getData()
	 * @see #getSampledData()
	 * @generated
	 */
	EReference getSampledData_Data();

	/**
	 * Returns the meta object for class '{@link fhiRCore.dataTypes.Contributor <em>Contributor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contributor</em>'.
	 * @see fhiRCore.dataTypes.Contributor
	 * @generated
	 */
	EClass getContributor();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.dataTypes.Contributor#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see fhiRCore.dataTypes.Contributor#getType()
	 * @see #getContributor()
	 * @generated
	 */
	EReference getContributor_Type();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.dataTypes.Contributor#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Name</em>'.
	 * @see fhiRCore.dataTypes.Contributor#getName()
	 * @see #getContributor()
	 * @generated
	 */
	EReference getContributor_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link fhiRCore.dataTypes.Contributor#getContacts <em>Contact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contact</em>'.
	 * @see fhiRCore.dataTypes.Contributor#getContacts()
	 * @see #getContributor()
	 * @generated
	 */
	EReference getContributor_Contact();

	/**
	 * Returns the meta object for class '{@link fhiRCore.dataTypes.SimpleQuantity <em>Simple Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Quantity</em>'.
	 * @see fhiRCore.dataTypes.SimpleQuantity
	 * @generated
	 */
	EClass getSimpleQuantity();

	/**
	 * Returns the meta object for class '{@link fhiRCore.dataTypes.MoneyQuantity <em>Money Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Money Quantity</em>'.
	 * @see fhiRCore.dataTypes.MoneyQuantity
	 * @generated
	 */
	EClass getMoneyQuantity();

	/**
	 * Returns the meta object for class '{@link fhiRCore.dataTypes.ReferenceRange <em>Reference Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reference Range</em>'.
	 * @see fhiRCore.dataTypes.ReferenceRange
	 * @generated
	 */
	EClass getReferenceRange();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.dataTypes.ReferenceRange#getLow <em>Low</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Low</em>'.
	 * @see fhiRCore.dataTypes.ReferenceRange#getLow()
	 * @see #getReferenceRange()
	 * @generated
	 */
	EReference getReferenceRange_Low();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.dataTypes.ReferenceRange#getHigh <em>High</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>High</em>'.
	 * @see fhiRCore.dataTypes.ReferenceRange#getHigh()
	 * @see #getReferenceRange()
	 * @generated
	 */
	EReference getReferenceRange_High();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.dataTypes.ReferenceRange#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see fhiRCore.dataTypes.ReferenceRange#getType()
	 * @see #getReferenceRange()
	 * @generated
	 */
	EReference getReferenceRange_Type();

	/**
	 * Returns the meta object for the containment reference list '{@link fhiRCore.dataTypes.ReferenceRange#getAppliesTos <em>Applies To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Applies To</em>'.
	 * @see fhiRCore.dataTypes.ReferenceRange#getAppliesTos()
	 * @see #getReferenceRange()
	 * @generated
	 */
	EReference getReferenceRange_AppliesTo();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.dataTypes.ReferenceRange#getAge <em>Age</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Age</em>'.
	 * @see fhiRCore.dataTypes.ReferenceRange#getAge()
	 * @see #getReferenceRange()
	 * @generated
	 */
	EReference getReferenceRange_Age();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.dataTypes.ReferenceRange#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Text</em>'.
	 * @see fhiRCore.dataTypes.ReferenceRange#getText()
	 * @see #getReferenceRange()
	 * @generated
	 */
	EReference getReferenceRange_Text();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DataTypesFactory getDataTypesFactory();

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
		 * The meta object literal for the '{@link fhiRCore.dataTypes.impl.ElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fhiRCore.dataTypes.impl.ElementImpl
		 * @see fhiRCore.dataTypes.impl.DataTypesPackageImpl#getElement()
		 * @generated
		 */
		EClass ELEMENT = eINSTANCE.getElement();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT__ID = eINSTANCE.getElement_Id();

		/**
		 * The meta object literal for the '<em><b>Extension</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT__EXTENSION = eINSTANCE.getElement_Extension();

		/**
		 * The meta object literal for the '{@link fhiRCore.dataTypes.impl.BaseImpl <em>Base</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fhiRCore.dataTypes.impl.BaseImpl
		 * @see fhiRCore.dataTypes.impl.DataTypesPackageImpl#getBase()
		 * @generated
		 */
		EClass BASE = eINSTANCE.getBase();

		/**
		 * The meta object literal for the '{@link fhiRCore.dataTypes.impl.ElementIdImpl <em>Element Id</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fhiRCore.dataTypes.impl.ElementIdImpl
		 * @see fhiRCore.dataTypes.impl.DataTypesPackageImpl#getElementId()
		 * @generated
		 */
		EClass ELEMENT_ID = eINSTANCE.getElementId();

		/**
		 * The meta object literal for the '{@link fhiRCore.dataTypes.impl.BackboneElementImpl <em>Backbone Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fhiRCore.dataTypes.impl.BackboneElementImpl
		 * @see fhiRCore.dataTypes.impl.DataTypesPackageImpl#getBackboneElement()
		 * @generated
		 */
		EClass BACKBONE_ELEMENT = eINSTANCE.getBackboneElement();

		/**
		 * The meta object literal for the '<em><b>Modifier Extension</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BACKBONE_ELEMENT__MODIFIER_EXTENSION = eINSTANCE.getBackboneElement_ModifierExtension();

		/**
		 * The meta object literal for the '{@link fhiRCore.dataTypes.impl.DataTypeImpl <em>Data Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fhiRCore.dataTypes.impl.DataTypeImpl
		 * @see fhiRCore.dataTypes.impl.DataTypesPackageImpl#getDataType()
		 * @generated
		 */
		EClass DATA_TYPE = eINSTANCE.getDataType();

		/**
		 * The meta object literal for the '{@link fhiRCore.dataTypes.impl.ExtensionImpl <em>Extension</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fhiRCore.dataTypes.impl.ExtensionImpl
		 * @see fhiRCore.dataTypes.impl.DataTypesPackageImpl#getExtension()
		 * @generated
		 */
		EClass EXTENSION = eINSTANCE.getExtension();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTENSION__URL = eINSTANCE.getExtension_Url();

		/**
		 * The meta object literal for the '<em><b>Valuex</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTENSION__VALUEX = eINSTANCE.getExtension_Valuex();

		/**
		 * The meta object literal for the '{@link fhiRCore.dataTypes.impl.ExtensionUrlImpl <em>Extension Url</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fhiRCore.dataTypes.impl.ExtensionUrlImpl
		 * @see fhiRCore.dataTypes.impl.DataTypesPackageImpl#getExtensionUrl()
		 * @generated
		 */
		EClass EXTENSION_URL = eINSTANCE.getExtensionUrl();

		/**
		 * The meta object literal for the '{@link fhiRCore.dataTypes.impl.Base64BinaryImpl <em>Base64 Binary</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fhiRCore.dataTypes.impl.Base64BinaryImpl
		 * @see fhiRCore.dataTypes.impl.DataTypesPackageImpl#getBase64Binary()
		 * @generated
		 */
		EClass BASE64_BINARY = eINSTANCE.getBase64Binary();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASE64_BINARY__VALUE = eINSTANCE.getBase64Binary_Value();

		/**
		 * The meta object literal for the '{@link fhiRCore.dataTypes.impl.BooleanImpl <em>Boolean</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fhiRCore.dataTypes.impl.BooleanImpl
		 * @see fhiRCore.dataTypes.impl.DataTypesPackageImpl#getBoolean()
		 * @generated
		 */
		EClass BOOLEAN = eINSTANCE.getBoolean();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOLEAN__VALUE = eINSTANCE.getBoolean_Value();

		/**
		 * The meta object literal for the '{@link fhiRCore.dataTypes.impl.CanonicalImpl <em>Canonical</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fhiRCore.dataTypes.impl.CanonicalImpl
		 * @see fhiRCore.dataTypes.impl.DataTypesPackageImpl#getCanonical()
		 * @generated
		 */
		EClass CANONICAL = eINSTANCE.getCanonical();

		/**
		 * The meta object literal for the '{@link fhiRCore.dataTypes.impl.UriImpl <em>Uri</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fhiRCore.dataTypes.impl.UriImpl
		 * @see fhiRCore.dataTypes.impl.DataTypesPackageImpl#getUri()
		 * @generated
		 */
		EClass URI = eINSTANCE.getUri();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute URI__VALUE = eINSTANCE.getUri_Value();

		/**
		 * The meta object literal for the '{@link fhiRCore.dataTypes.impl.CodeImpl <em>Code</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fhiRCore.dataTypes.impl.CodeImpl
		 * @see fhiRCore.dataTypes.impl.DataTypesPackageImpl#getCode()
		 * @generated
		 */
		EClass CODE = eINSTANCE.getCode();

		/**
		 * The meta object literal for the '{@link fhiRCore.dataTypes.impl.StringImpl <em>String</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fhiRCore.dataTypes.impl.StringImpl
		 * @see fhiRCore.dataTypes.impl.DataTypesPackageImpl#getString()
		 * @generated
		 */
		EClass STRING = eINSTANCE.getString();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING__VALUE = eINSTANCE.getString_Value();

		/**
		 * The meta object literal for the '{@link fhiRCore.dataTypes.impl.DateImpl <em>Date</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fhiRCore.dataTypes.impl.DateImpl
		 * @see fhiRCore.dataTypes.impl.DataTypesPackageImpl#getDate()
		 * @generated
		 */
		EClass DATE = eINSTANCE.getDate();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATE__VALUE = eINSTANCE.getDate_Value();

		/**
		 * The meta object literal for the '{@link fhiRCore.dataTypes.impl.DateTimeImpl <em>Date Time</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fhiRCore.dataTypes.impl.DateTimeImpl
		 * @see fhiRCore.dataTypes.impl.DataTypesPackageImpl#getDateTime()
		 * @generated
		 */
		EClass DATE_TIME = eINSTANCE.getDateTime();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATE_TIME__VALUE = eINSTANCE.getDateTime_Value();

		/**
		 * The meta object literal for the '{@link fhiRCore.dataTypes.impl.DecimalImpl <em>Decimal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fhiRCore.dataTypes.impl.DecimalImpl
		 * @see fhiRCore.dataTypes.impl.DataTypesPackageImpl#getDecimal()
		 * @generated
		 */
		EClass DECIMAL = eINSTANCE.getDecimal();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DECIMAL__VALUE = eINSTANCE.getDecimal_Value();

		/**
		 * The meta object literal for the '{@link fhiRCore.dataTypes.impl.IdImpl <em>Id</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fhiRCore.dataTypes.impl.IdImpl
		 * @see fhiRCore.dataTypes.impl.DataTypesPackageImpl#getId()
		 * @generated
		 */
		EClass ID = eINSTANCE.getId();

		/**
		 * The meta object literal for the '{@link fhiRCore.dataTypes.impl.InstantImpl <em>Instant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fhiRCore.dataTypes.impl.InstantImpl
		 * @see fhiRCore.dataTypes.impl.DataTypesPackageImpl#getInstant()
		 * @generated
		 */
		EClass INSTANT = eINSTANCE.getInstant();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTANT__VALUE = eINSTANCE.getInstant_Value();

		/**
		 * The meta object literal for the '{@link fhiRCore.dataTypes.impl.IntegerImpl <em>Integer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fhiRCore.dataTypes.impl.IntegerImpl
		 * @see fhiRCore.dataTypes.impl.DataTypesPackageImpl#getInteger()
		 * @generated
		 */
		EClass INTEGER = eINSTANCE.getInteger();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTEGER__VALUE = eINSTANCE.getInteger_Value();

		/**
		 * The meta object literal for the '{@link fhiRCore.dataTypes.impl.MarkdownImpl <em>Markdown</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fhiRCore.dataTypes.impl.MarkdownImpl
		 * @see fhiRCore.dataTypes.impl.DataTypesPackageImpl#getMarkdown()
		 * @generated
		 */
		EClass MARKDOWN = eINSTANCE.getMarkdown();

		/**
		 * The meta object literal for the '{@link fhiRCore.dataTypes.impl.OidImpl <em>Oid</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fhiRCore.dataTypes.impl.OidImpl
		 * @see fhiRCore.dataTypes.impl.DataTypesPackageImpl#getOid()
		 * @generated
		 */
		EClass OID = eINSTANCE.getOid();

		/**
		 * The meta object literal for the '{@link fhiRCore.dataTypes.impl.PositiveIntImpl <em>Positive Int</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fhiRCore.dataTypes.impl.PositiveIntImpl
		 * @see fhiRCore.dataTypes.impl.DataTypesPackageImpl#getPositiveInt()
		 * @generated
		 */
		EClass POSITIVE_INT = eINSTANCE.getPositiveInt();

		/**
		 * The meta object literal for the '{@link fhiRCore.dataTypes.impl.TimeImpl <em>Time</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fhiRCore.dataTypes.impl.TimeImpl
		 * @see fhiRCore.dataTypes.impl.DataTypesPackageImpl#getTime()
		 * @generated
		 */
		EClass TIME = eINSTANCE.getTime();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME__VALUE = eINSTANCE.getTime_Value();

		/**
		 * The meta object literal for the '{@link fhiRCore.dataTypes.impl.UnsignedIntImpl <em>Unsigned Int</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fhiRCore.dataTypes.impl.UnsignedIntImpl
		 * @see fhiRCore.dataTypes.impl.DataTypesPackageImpl#getUnsignedInt()
		 * @generated
		 */
		EClass UNSIGNED_INT = eINSTANCE.getUnsignedInt();

		/**
		 * The meta object literal for the '{@link fhiRCore.dataTypes.impl.UrlImpl <em>Url</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fhiRCore.dataTypes.impl.UrlImpl
		 * @see fhiRCore.dataTypes.impl.DataTypesPackageImpl#getUrl()
		 * @generated
		 */
		EClass URL = eINSTANCE.getUrl();

		/**
		 * The meta object literal for the '{@link fhiRCore.dataTypes.impl.UuidImpl <em>Uuid</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fhiRCore.dataTypes.impl.UuidImpl
		 * @see fhiRCore.dataTypes.impl.DataTypesPackageImpl#getUuid()
		 * @generated
		 */
		EClass UUID = eINSTANCE.getUuid();

		/**
		 * The meta object literal for the '{@link fhiRCore.dataTypes.impl.AddressImpl <em>Address</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fhiRCore.dataTypes.impl.AddressImpl
		 * @see fhiRCore.dataTypes.impl.DataTypesPackageImpl#getAddress()
		 * @generated
		 */
		EClass ADDRESS = eINSTANCE.getAddress();

		/**
		 * The meta object literal for the '<em><b>Use</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADDRESS__USE = eINSTANCE.getAddress_Use();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADDRESS__TYPE = eINSTANCE.getAddress_Type();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADDRESS__TEXT = eINSTANCE.getAddress_Text();

		/**
		 * The meta object literal for the '<em><b>Line</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADDRESS__LINE = eINSTANCE.getAddress_Line();

		/**
		 * The meta object literal for the '<em><b>City</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADDRESS__CITY = eINSTANCE.getAddress_City();

		/**
		 * The meta object literal for the '<em><b>District</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADDRESS__DISTRICT = eINSTANCE.getAddress_District();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADDRESS__STATE = eINSTANCE.getAddress_State();

		/**
		 * The meta object literal for the '<em><b>Postal Code</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADDRESS__POSTAL_CODE = eINSTANCE.getAddress_PostalCode();

		/**
		 * The meta object literal for the '<em><b>Country</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADDRESS__COUNTRY = eINSTANCE.getAddress_Country();

		/**
		 * The meta object literal for the '<em><b>Period</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADDRESS__PERIOD = eINSTANCE.getAddress_Period();

		/**
		 * The meta object literal for the '{@link fhiRCore.dataTypes.impl.PeriodImpl <em>Period</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fhiRCore.dataTypes.impl.PeriodImpl
		 * @see fhiRCore.dataTypes.impl.DataTypesPackageImpl#getPeriod()
		 * @generated
		 */
		EClass PERIOD = eINSTANCE.getPeriod();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERIOD__START = eINSTANCE.getPeriod_Start();

		/**
		 * The meta object literal for the '<em><b>End</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERIOD__END = eINSTANCE.getPeriod_End();

		/**
		 * The meta object literal for the '{@link fhiRCore.dataTypes.impl.AgeImpl <em>Age</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fhiRCore.dataTypes.impl.AgeImpl
		 * @see fhiRCore.dataTypes.impl.DataTypesPackageImpl#getAge()
		 * @generated
		 */
		EClass AGE = eINSTANCE.getAge();

		/**
		 * The meta object literal for the '{@link fhiRCore.dataTypes.impl.QuantityImpl <em>Quantity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fhiRCore.dataTypes.impl.QuantityImpl
		 * @see fhiRCore.dataTypes.impl.DataTypesPackageImpl#getQuantity()
		 * @generated
		 */
		EClass QUANTITY = eINSTANCE.getQuantity();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUANTITY__VALUE = eINSTANCE.getQuantity_Value();

		/**
		 * The meta object literal for the '<em><b>Comparator</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUANTITY__COMPARATOR = eINSTANCE.getQuantity_Comparator();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUANTITY__UNIT = eINSTANCE.getQuantity_Unit();

		/**
		 * The meta object literal for the '<em><b>System</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUANTITY__SYSTEM = eINSTANCE.getQuantity_System();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUANTITY__CODE = eINSTANCE.getQuantity_Code();

		/**
		 * The meta object literal for the '{@link fhiRCore.dataTypes.impl.AnnotationImpl <em>Annotation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fhiRCore.dataTypes.impl.AnnotationImpl
		 * @see fhiRCore.dataTypes.impl.DataTypesPackageImpl#getAnnotation()
		 * @generated
		 */
		EClass ANNOTATION = eINSTANCE.getAnnotation();

		/**
		 * The meta object literal for the '<em><b>Authorx</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANNOTATION__AUTHORX = eINSTANCE.getAnnotation_Authorx();

		/**
		 * The meta object literal for the '<em><b>Time</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANNOTATION__TIME = eINSTANCE.getAnnotation_Time();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANNOTATION__TEXT = eINSTANCE.getAnnotation_Text();

		/**
		 * The meta object literal for the '{@link fhiRCore.dataTypes.impl.ReferenceImpl <em>Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fhiRCore.dataTypes.impl.ReferenceImpl
		 * @see fhiRCore.dataTypes.impl.DataTypesPackageImpl#getReference()
		 * @generated
		 */
		EClass REFERENCE = eINSTANCE.getReference();

		/**
		 * The meta object literal for the '<em><b>Reference</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERENCE__REFERENCE = eINSTANCE.getReference_Reference();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERENCE__TYPE = eINSTANCE.getReference_Type();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERENCE__IDENTIFIER = eINSTANCE.getReference_Identifier();

		/**
		 * The meta object literal for the '<em><b>Display</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERENCE__DISPLAY = eINSTANCE.getReference_Display();

		/**
		 * The meta object literal for the '{@link fhiRCore.dataTypes.impl.IdentifierImpl <em>Identifier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fhiRCore.dataTypes.impl.IdentifierImpl
		 * @see fhiRCore.dataTypes.impl.DataTypesPackageImpl#getIdentifier()
		 * @generated
		 */
		EClass IDENTIFIER = eINSTANCE.getIdentifier();

		/**
		 * The meta object literal for the '<em><b>Use</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IDENTIFIER__USE = eINSTANCE.getIdentifier_Use();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IDENTIFIER__TYPE = eINSTANCE.getIdentifier_Type();

		/**
		 * The meta object literal for the '<em><b>System</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IDENTIFIER__SYSTEM = eINSTANCE.getIdentifier_System();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IDENTIFIER__VALUE = eINSTANCE.getIdentifier_Value();

		/**
		 * The meta object literal for the '<em><b>Period</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IDENTIFIER__PERIOD = eINSTANCE.getIdentifier_Period();

		/**
		 * The meta object literal for the '<em><b>Assigner</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IDENTIFIER__ASSIGNER = eINSTANCE.getIdentifier_Assigner();

		/**
		 * The meta object literal for the '{@link fhiRCore.dataTypes.impl.CodeableConceptImpl <em>Codeable Concept</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fhiRCore.dataTypes.impl.CodeableConceptImpl
		 * @see fhiRCore.dataTypes.impl.DataTypesPackageImpl#getCodeableConcept()
		 * @generated
		 */
		EClass CODEABLE_CONCEPT = eINSTANCE.getCodeableConcept();

		/**
		 * The meta object literal for the '<em><b>Coding</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CODEABLE_CONCEPT__CODING = eINSTANCE.getCodeableConcept_Coding();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CODEABLE_CONCEPT__TEXT = eINSTANCE.getCodeableConcept_Text();

		/**
		 * The meta object literal for the '{@link fhiRCore.dataTypes.impl.CodingImpl <em>Coding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fhiRCore.dataTypes.impl.CodingImpl
		 * @see fhiRCore.dataTypes.impl.DataTypesPackageImpl#getCoding()
		 * @generated
		 */
		EClass CODING = eINSTANCE.getCoding();

		/**
		 * The meta object literal for the '<em><b>System</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CODING__SYSTEM = eINSTANCE.getCoding_System();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CODING__VERSION = eINSTANCE.getCoding_Version();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CODING__CODE = eINSTANCE.getCoding_Code();

		/**
		 * The meta object literal for the '<em><b>Display</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CODING__DISPLAY = eINSTANCE.getCoding_Display();

		/**
		 * The meta object literal for the '<em><b>User Selected</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CODING__USER_SELECTED = eINSTANCE.getCoding_UserSelected();

		/**
		 * The meta object literal for the '{@link fhiRCore.dataTypes.impl.MetaImpl <em>Meta</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fhiRCore.dataTypes.impl.MetaImpl
		 * @see fhiRCore.dataTypes.impl.DataTypesPackageImpl#getMeta()
		 * @generated
		 */
		EClass META = eINSTANCE.getMeta();

		/**
		 * The meta object literal for the '<em><b>Version Id</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference META__VERSION_ID = eINSTANCE.getMeta_VersionId();

		/**
		 * The meta object literal for the '<em><b>Last Updated</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference META__LAST_UPDATED = eINSTANCE.getMeta_LastUpdated();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference META__SOURCE = eINSTANCE.getMeta_Source();

		/**
		 * The meta object literal for the '<em><b>Profile</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference META__PROFILE = eINSTANCE.getMeta_Profile();

		/**
		 * The meta object literal for the '<em><b>Security</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference META__SECURITY = eINSTANCE.getMeta_Security();

		/**
		 * The meta object literal for the '<em><b>Tag</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference META__TAG = eINSTANCE.getMeta_Tag();

		/**
		 * The meta object literal for the '{@link fhiRCore.dataTypes.impl.NarrativeImpl <em>Narrative</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fhiRCore.dataTypes.impl.NarrativeImpl
		 * @see fhiRCore.dataTypes.impl.DataTypesPackageImpl#getNarrative()
		 * @generated
		 */
		EClass NARRATIVE = eINSTANCE.getNarrative();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NARRATIVE__STATUS = eINSTANCE.getNarrative_Status();

		/**
		 * The meta object literal for the '<em><b>Div</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NARRATIVE__DIV = eINSTANCE.getNarrative_Div();

		/**
		 * The meta object literal for the '{@link fhiRCore.dataTypes.impl.XhtmlImpl <em>Xhtml</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fhiRCore.dataTypes.impl.XhtmlImpl
		 * @see fhiRCore.dataTypes.impl.DataTypesPackageImpl#getXhtml()
		 * @generated
		 */
		EClass XHTML = eINSTANCE.getXhtml();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XHTML__VALUE = eINSTANCE.getXhtml_Value();

		/**
		 * The meta object literal for the '{@link fhiRCore.dataTypes.impl.XhtmlValueImpl <em>Xhtml Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fhiRCore.dataTypes.impl.XhtmlValueImpl
		 * @see fhiRCore.dataTypes.impl.DataTypesPackageImpl#getXhtmlValue()
		 * @generated
		 */
		EClass XHTML_VALUE = eINSTANCE.getXhtmlValue();

		/**
		 * The meta object literal for the '{@link fhiRCore.dataTypes.impl.ContactPointImpl <em>Contact Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fhiRCore.dataTypes.impl.ContactPointImpl
		 * @see fhiRCore.dataTypes.impl.DataTypesPackageImpl#getContactPoint()
		 * @generated
		 */
		EClass CONTACT_POINT = eINSTANCE.getContactPoint();

		/**
		 * The meta object literal for the '<em><b>System</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTACT_POINT__SYSTEM = eINSTANCE.getContactPoint_System();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTACT_POINT__VALUE = eINSTANCE.getContactPoint_Value();

		/**
		 * The meta object literal for the '<em><b>Use</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTACT_POINT__USE = eINSTANCE.getContactPoint_Use();

		/**
		 * The meta object literal for the '<em><b>Rank</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTACT_POINT__RANK = eINSTANCE.getContactPoint_Rank();

		/**
		 * The meta object literal for the '<em><b>Period</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTACT_POINT__PERIOD = eINSTANCE.getContactPoint_Period();

		/**
		 * The meta object literal for the '{@link fhiRCore.dataTypes.impl.HumanNameImpl <em>Human Name</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fhiRCore.dataTypes.impl.HumanNameImpl
		 * @see fhiRCore.dataTypes.impl.DataTypesPackageImpl#getHumanName()
		 * @generated
		 */
		EClass HUMAN_NAME = eINSTANCE.getHumanName();

		/**
		 * The meta object literal for the '<em><b>Use</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HUMAN_NAME__USE = eINSTANCE.getHumanName_Use();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HUMAN_NAME__TEXT = eINSTANCE.getHumanName_Text();

		/**
		 * The meta object literal for the '<em><b>Family</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HUMAN_NAME__FAMILY = eINSTANCE.getHumanName_Family();

		/**
		 * The meta object literal for the '<em><b>Given</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HUMAN_NAME__GIVEN = eINSTANCE.getHumanName_Given();

		/**
		 * The meta object literal for the '<em><b>Prefix</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HUMAN_NAME__PREFIX = eINSTANCE.getHumanName_Prefix();

		/**
		 * The meta object literal for the '<em><b>Suffix</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HUMAN_NAME__SUFFIX = eINSTANCE.getHumanName_Suffix();

		/**
		 * The meta object literal for the '<em><b>Period</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HUMAN_NAME__PERIOD = eINSTANCE.getHumanName_Period();

		/**
		 * The meta object literal for the '{@link fhiRCore.dataTypes.impl.AttachmentImpl <em>Attachment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fhiRCore.dataTypes.impl.AttachmentImpl
		 * @see fhiRCore.dataTypes.impl.DataTypesPackageImpl#getAttachment()
		 * @generated
		 */
		EClass ATTACHMENT = eINSTANCE.getAttachment();

		/**
		 * The meta object literal for the '<em><b>Content Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTACHMENT__CONTENT_TYPE = eINSTANCE.getAttachment_ContentType();

		/**
		 * The meta object literal for the '<em><b>Language</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTACHMENT__LANGUAGE = eINSTANCE.getAttachment_Language();

		/**
		 * The meta object literal for the '<em><b>Data</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTACHMENT__DATA = eINSTANCE.getAttachment_Data();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTACHMENT__URL = eINSTANCE.getAttachment_Url();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTACHMENT__SIZE = eINSTANCE.getAttachment_Size();

		/**
		 * The meta object literal for the '<em><b>Hash</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTACHMENT__HASH = eINSTANCE.getAttachment_Hash();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTACHMENT__TITLE = eINSTANCE.getAttachment_Title();

		/**
		 * The meta object literal for the '<em><b>Creation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTACHMENT__CREATION = eINSTANCE.getAttachment_Creation();

		/**
		 * The meta object literal for the '{@link fhiRCore.dataTypes.impl.ContactDetailImpl <em>Contact Detail</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fhiRCore.dataTypes.impl.ContactDetailImpl
		 * @see fhiRCore.dataTypes.impl.DataTypesPackageImpl#getContactDetail()
		 * @generated
		 */
		EClass CONTACT_DETAIL = eINSTANCE.getContactDetail();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTACT_DETAIL__NAME = eINSTANCE.getContactDetail_Name();

		/**
		 * The meta object literal for the '<em><b>Telecom</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTACT_DETAIL__TELECOM = eINSTANCE.getContactDetail_Telecom();

		/**
		 * The meta object literal for the '{@link fhiRCore.dataTypes.impl.UsageContextImpl <em>Usage Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fhiRCore.dataTypes.impl.UsageContextImpl
		 * @see fhiRCore.dataTypes.impl.DataTypesPackageImpl#getUsageContext()
		 * @generated
		 */
		EClass USAGE_CONTEXT = eINSTANCE.getUsageContext();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USAGE_CONTEXT__CODE = eINSTANCE.getUsageContext_Code();

		/**
		 * The meta object literal for the '<em><b>Value Codeable Concept</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USAGE_CONTEXT__VALUE_CODEABLE_CONCEPT = eINSTANCE.getUsageContext_ValueCodeableConcept();

		/**
		 * The meta object literal for the '<em><b>Value Quantity</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USAGE_CONTEXT__VALUE_QUANTITY = eINSTANCE.getUsageContext_ValueQuantity();

		/**
		 * The meta object literal for the '<em><b>Value Range</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USAGE_CONTEXT__VALUE_RANGE = eINSTANCE.getUsageContext_ValueRange();

		/**
		 * The meta object literal for the '{@link fhiRCore.dataTypes.impl.RangeImpl <em>Range</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fhiRCore.dataTypes.impl.RangeImpl
		 * @see fhiRCore.dataTypes.impl.DataTypesPackageImpl#getRange()
		 * @generated
		 */
		EClass RANGE = eINSTANCE.getRange();

		/**
		 * The meta object literal for the '<em><b>Low</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RANGE__LOW = eINSTANCE.getRange_Low();

		/**
		 * The meta object literal for the '<em><b>High</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RANGE__HIGH = eINSTANCE.getRange_High();

		/**
		 * The meta object literal for the '{@link fhiRCore.dataTypes.impl.RelatedArtifactImpl <em>Related Artifact</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fhiRCore.dataTypes.impl.RelatedArtifactImpl
		 * @see fhiRCore.dataTypes.impl.DataTypesPackageImpl#getRelatedArtifact()
		 * @generated
		 */
		EClass RELATED_ARTIFACT = eINSTANCE.getRelatedArtifact();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATED_ARTIFACT__TYPE = eINSTANCE.getRelatedArtifact_Type();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATED_ARTIFACT__LABEL = eINSTANCE.getRelatedArtifact_Label();

		/**
		 * The meta object literal for the '<em><b>Display</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATED_ARTIFACT__DISPLAY = eINSTANCE.getRelatedArtifact_Display();

		/**
		 * The meta object literal for the '<em><b>Citation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATED_ARTIFACT__CITATION = eINSTANCE.getRelatedArtifact_Citation();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATED_ARTIFACT__URL = eINSTANCE.getRelatedArtifact_Url();

		/**
		 * The meta object literal for the '<em><b>Document</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATED_ARTIFACT__DOCUMENT = eINSTANCE.getRelatedArtifact_Document();

		/**
		 * The meta object literal for the '<em><b>Resource</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATED_ARTIFACT__RESOURCE = eINSTANCE.getRelatedArtifact_Resource();

		/**
		 * The meta object literal for the '{@link fhiRCore.dataTypes.impl.ParameterDefinitionImpl <em>Parameter Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fhiRCore.dataTypes.impl.ParameterDefinitionImpl
		 * @see fhiRCore.dataTypes.impl.DataTypesPackageImpl#getParameterDefinition()
		 * @generated
		 */
		EClass PARAMETER_DEFINITION = eINSTANCE.getParameterDefinition();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER_DEFINITION__NAME = eINSTANCE.getParameterDefinition_Name();

		/**
		 * The meta object literal for the '<em><b>Use</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER_DEFINITION__USE = eINSTANCE.getParameterDefinition_Use();

		/**
		 * The meta object literal for the '<em><b>Min</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER_DEFINITION__MIN = eINSTANCE.getParameterDefinition_Min();

		/**
		 * The meta object literal for the '<em><b>Max</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER_DEFINITION__MAX = eINSTANCE.getParameterDefinition_Max();

		/**
		 * The meta object literal for the '<em><b>Documentation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER_DEFINITION__DOCUMENTATION = eINSTANCE.getParameterDefinition_Documentation();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER_DEFINITION__TYPE = eINSTANCE.getParameterDefinition_Type();

		/**
		 * The meta object literal for the '<em><b>Profile</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER_DEFINITION__PROFILE = eINSTANCE.getParameterDefinition_Profile();

		/**
		 * The meta object literal for the '{@link fhiRCore.dataTypes.impl.DataRequirementImpl <em>Data Requirement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fhiRCore.dataTypes.impl.DataRequirementImpl
		 * @see fhiRCore.dataTypes.impl.DataTypesPackageImpl#getDataRequirement()
		 * @generated
		 */
		EClass DATA_REQUIREMENT = eINSTANCE.getDataRequirement();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_REQUIREMENT__TYPE = eINSTANCE.getDataRequirement_Type();

		/**
		 * The meta object literal for the '<em><b>Profile</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_REQUIREMENT__PROFILE = eINSTANCE.getDataRequirement_Profile();

		/**
		 * The meta object literal for the '<em><b>Subjectx</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_REQUIREMENT__SUBJECTX = eINSTANCE.getDataRequirement_Subjectx();

		/**
		 * The meta object literal for the '<em><b>Must Support</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_REQUIREMENT__MUST_SUPPORT = eINSTANCE.getDataRequirement_MustSupport();

		/**
		 * The meta object literal for the '<em><b>Code Filter</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_REQUIREMENT__CODE_FILTER = eINSTANCE.getDataRequirement_CodeFilter();

		/**
		 * The meta object literal for the '<em><b>Date Filter</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_REQUIREMENT__DATE_FILTER = eINSTANCE.getDataRequirement_DateFilter();

		/**
		 * The meta object literal for the '<em><b>Limit</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_REQUIREMENT__LIMIT = eINSTANCE.getDataRequirement_Limit();

		/**
		 * The meta object literal for the '<em><b>Sort</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_REQUIREMENT__SORT = eINSTANCE.getDataRequirement_Sort();

		/**
		 * The meta object literal for the '{@link fhiRCore.dataTypes.impl.DataRequirementElement1Impl <em>Data Requirement Element1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fhiRCore.dataTypes.impl.DataRequirementElement1Impl
		 * @see fhiRCore.dataTypes.impl.DataTypesPackageImpl#getDataRequirementElement1()
		 * @generated
		 */
		EClass DATA_REQUIREMENT_ELEMENT1 = eINSTANCE.getDataRequirementElement1();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_REQUIREMENT_ELEMENT1__PATH = eINSTANCE.getDataRequirementElement1_Path();

		/**
		 * The meta object literal for the '<em><b>Search Param</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_REQUIREMENT_ELEMENT1__SEARCH_PARAM = eINSTANCE.getDataRequirementElement1_SearchParam();

		/**
		 * The meta object literal for the '<em><b>Value Set</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_REQUIREMENT_ELEMENT1__VALUE_SET = eINSTANCE.getDataRequirementElement1_ValueSet();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_REQUIREMENT_ELEMENT1__CODE = eINSTANCE.getDataRequirementElement1_Code();

		/**
		 * The meta object literal for the '{@link fhiRCore.dataTypes.impl.DataRequirementElement2Impl <em>Data Requirement Element2</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fhiRCore.dataTypes.impl.DataRequirementElement2Impl
		 * @see fhiRCore.dataTypes.impl.DataTypesPackageImpl#getDataRequirementElement2()
		 * @generated
		 */
		EClass DATA_REQUIREMENT_ELEMENT2 = eINSTANCE.getDataRequirementElement2();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_REQUIREMENT_ELEMENT2__PATH = eINSTANCE.getDataRequirementElement2_Path();

		/**
		 * The meta object literal for the '<em><b>Search Param</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_REQUIREMENT_ELEMENT2__SEARCH_PARAM = eINSTANCE.getDataRequirementElement2_SearchParam();

		/**
		 * The meta object literal for the '<em><b>Valuex</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_REQUIREMENT_ELEMENT2__VALUEX = eINSTANCE.getDataRequirementElement2_Valuex();

		/**
		 * The meta object literal for the '{@link fhiRCore.dataTypes.impl.DataRequirementElement3Impl <em>Data Requirement Element3</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fhiRCore.dataTypes.impl.DataRequirementElement3Impl
		 * @see fhiRCore.dataTypes.impl.DataTypesPackageImpl#getDataRequirementElement3()
		 * @generated
		 */
		EClass DATA_REQUIREMENT_ELEMENT3 = eINSTANCE.getDataRequirementElement3();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_REQUIREMENT_ELEMENT3__PATH = eINSTANCE.getDataRequirementElement3_Path();

		/**
		 * The meta object literal for the '<em><b>Direction</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_REQUIREMENT_ELEMENT3__DIRECTION = eINSTANCE.getDataRequirementElement3_Direction();

		/**
		 * The meta object literal for the '{@link fhiRCore.dataTypes.impl.ExpressionImpl <em>Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fhiRCore.dataTypes.impl.ExpressionImpl
		 * @see fhiRCore.dataTypes.impl.DataTypesPackageImpl#getExpression()
		 * @generated
		 */
		EClass EXPRESSION = eINSTANCE.getExpression();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSION__DESCRIPTION = eINSTANCE.getExpression_Description();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSION__NAME = eINSTANCE.getExpression_Name();

		/**
		 * The meta object literal for the '<em><b>Language</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSION__LANGUAGE = eINSTANCE.getExpression_Language();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSION__EXPRESSION = eINSTANCE.getExpression_Expression();

		/**
		 * The meta object literal for the '<em><b>Reference</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSION__REFERENCE = eINSTANCE.getExpression_Reference();

		/**
		 * The meta object literal for the '{@link fhiRCore.dataTypes.impl.DurationImpl <em>Duration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fhiRCore.dataTypes.impl.DurationImpl
		 * @see fhiRCore.dataTypes.impl.DataTypesPackageImpl#getDuration()
		 * @generated
		 */
		EClass DURATION = eINSTANCE.getDuration();

		/**
		 * The meta object literal for the '{@link fhiRCore.dataTypes.impl.TriggerDefinitionImpl <em>Trigger Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fhiRCore.dataTypes.impl.TriggerDefinitionImpl
		 * @see fhiRCore.dataTypes.impl.DataTypesPackageImpl#getTriggerDefinition()
		 * @generated
		 */
		EClass TRIGGER_DEFINITION = eINSTANCE.getTriggerDefinition();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRIGGER_DEFINITION__TYPE = eINSTANCE.getTriggerDefinition_Type();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRIGGER_DEFINITION__NAME = eINSTANCE.getTriggerDefinition_Name();

		/**
		 * The meta object literal for the '<em><b>Timingx</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRIGGER_DEFINITION__TIMINGX = eINSTANCE.getTriggerDefinition_Timingx();

		/**
		 * The meta object literal for the '<em><b>Data</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRIGGER_DEFINITION__DATA = eINSTANCE.getTriggerDefinition_Data();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRIGGER_DEFINITION__CONDITION = eINSTANCE.getTriggerDefinition_Condition();

		/**
		 * The meta object literal for the '{@link fhiRCore.dataTypes.impl.DosageImpl <em>Dosage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fhiRCore.dataTypes.impl.DosageImpl
		 * @see fhiRCore.dataTypes.impl.DataTypesPackageImpl#getDosage()
		 * @generated
		 */
		EClass DOSAGE = eINSTANCE.getDosage();

		/**
		 * The meta object literal for the '<em><b>Sequence</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOSAGE__SEQUENCE = eINSTANCE.getDosage_Sequence();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOSAGE__TEXT = eINSTANCE.getDosage_Text();

		/**
		 * The meta object literal for the '<em><b>Additional Instruction</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOSAGE__ADDITIONAL_INSTRUCTION = eINSTANCE.getDosage_AdditionalInstruction();

		/**
		 * The meta object literal for the '<em><b>Patient Instruction</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOSAGE__PATIENT_INSTRUCTION = eINSTANCE.getDosage_PatientInstruction();

		/**
		 * The meta object literal for the '<em><b>Timing</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOSAGE__TIMING = eINSTANCE.getDosage_Timing();

		/**
		 * The meta object literal for the '<em><b>As Neededx</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOSAGE__AS_NEEDEDX = eINSTANCE.getDosage_AsNeededx();

		/**
		 * The meta object literal for the '<em><b>Site</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOSAGE__SITE = eINSTANCE.getDosage_Site();

		/**
		 * The meta object literal for the '<em><b>Route</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOSAGE__ROUTE = eINSTANCE.getDosage_Route();

		/**
		 * The meta object literal for the '<em><b>Method</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOSAGE__METHOD = eINSTANCE.getDosage_Method();

		/**
		 * The meta object literal for the '<em><b>Dose And Rate</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOSAGE__DOSE_AND_RATE = eINSTANCE.getDosage_DoseAndRate();

		/**
		 * The meta object literal for the '<em><b>Max Dose Per Period</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOSAGE__MAX_DOSE_PER_PERIOD = eINSTANCE.getDosage_MaxDosePerPeriod();

		/**
		 * The meta object literal for the '<em><b>Max Dose Per Administration</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOSAGE__MAX_DOSE_PER_ADMINISTRATION = eINSTANCE.getDosage_MaxDosePerAdministration();

		/**
		 * The meta object literal for the '<em><b>Max Dose Per Lifetime</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOSAGE__MAX_DOSE_PER_LIFETIME = eINSTANCE.getDosage_MaxDosePerLifetime();

		/**
		 * The meta object literal for the '{@link fhiRCore.dataTypes.impl.TimingImpl <em>Timing</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fhiRCore.dataTypes.impl.TimingImpl
		 * @see fhiRCore.dataTypes.impl.DataTypesPackageImpl#getTiming()
		 * @generated
		 */
		EClass TIMING = eINSTANCE.getTiming();

		/**
		 * The meta object literal for the '<em><b>Event</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIMING__EVENT = eINSTANCE.getTiming_Event();

		/**
		 * The meta object literal for the '<em><b>Repeat</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIMING__REPEAT = eINSTANCE.getTiming_Repeat();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIMING__CODE = eINSTANCE.getTiming_Code();

		/**
		 * The meta object literal for the '{@link fhiRCore.dataTypes.impl.TimingElement1Impl <em>Timing Element1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fhiRCore.dataTypes.impl.TimingElement1Impl
		 * @see fhiRCore.dataTypes.impl.DataTypesPackageImpl#getTimingElement1()
		 * @generated
		 */
		EClass TIMING_ELEMENT1 = eINSTANCE.getTimingElement1();

		/**
		 * The meta object literal for the '<em><b>Boundsx</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIMING_ELEMENT1__BOUNDSX = eINSTANCE.getTimingElement1_Boundsx();

		/**
		 * The meta object literal for the '<em><b>Count</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIMING_ELEMENT1__COUNT = eINSTANCE.getTimingElement1_Count();

		/**
		 * The meta object literal for the '<em><b>Count Max</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIMING_ELEMENT1__COUNT_MAX = eINSTANCE.getTimingElement1_CountMax();

		/**
		 * The meta object literal for the '<em><b>Duration</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIMING_ELEMENT1__DURATION = eINSTANCE.getTimingElement1_Duration();

		/**
		 * The meta object literal for the '<em><b>Duration Max</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIMING_ELEMENT1__DURATION_MAX = eINSTANCE.getTimingElement1_DurationMax();

		/**
		 * The meta object literal for the '<em><b>Duration Unit</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIMING_ELEMENT1__DURATION_UNIT = eINSTANCE.getTimingElement1_DurationUnit();

		/**
		 * The meta object literal for the '<em><b>Frequency</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIMING_ELEMENT1__FREQUENCY = eINSTANCE.getTimingElement1_Frequency();

		/**
		 * The meta object literal for the '<em><b>Frequency Max</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIMING_ELEMENT1__FREQUENCY_MAX = eINSTANCE.getTimingElement1_FrequencyMax();

		/**
		 * The meta object literal for the '<em><b>Period</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIMING_ELEMENT1__PERIOD = eINSTANCE.getTimingElement1_Period();

		/**
		 * The meta object literal for the '<em><b>Period Max</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIMING_ELEMENT1__PERIOD_MAX = eINSTANCE.getTimingElement1_PeriodMax();

		/**
		 * The meta object literal for the '<em><b>Period Unit</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIMING_ELEMENT1__PERIOD_UNIT = eINSTANCE.getTimingElement1_PeriodUnit();

		/**
		 * The meta object literal for the '<em><b>Day Of Week</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIMING_ELEMENT1__DAY_OF_WEEK = eINSTANCE.getTimingElement1_DayOfWeek();

		/**
		 * The meta object literal for the '<em><b>Time Of Day</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIMING_ELEMENT1__TIME_OF_DAY = eINSTANCE.getTimingElement1_TimeOfDay();

		/**
		 * The meta object literal for the '<em><b>When</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIMING_ELEMENT1__WHEN = eINSTANCE.getTimingElement1_When();

		/**
		 * The meta object literal for the '<em><b>Offset</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIMING_ELEMENT1__OFFSET = eINSTANCE.getTimingElement1_Offset();

		/**
		 * The meta object literal for the '{@link fhiRCore.dataTypes.impl.DosageElement1Impl <em>Dosage Element1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fhiRCore.dataTypes.impl.DosageElement1Impl
		 * @see fhiRCore.dataTypes.impl.DataTypesPackageImpl#getDosageElement1()
		 * @generated
		 */
		EClass DOSAGE_ELEMENT1 = eINSTANCE.getDosageElement1();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOSAGE_ELEMENT1__TYPE = eINSTANCE.getDosageElement1_Type();

		/**
		 * The meta object literal for the '<em><b>Dosex</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOSAGE_ELEMENT1__DOSEX = eINSTANCE.getDosageElement1_Dosex();

		/**
		 * The meta object literal for the '<em><b>Ratex</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOSAGE_ELEMENT1__RATEX = eINSTANCE.getDosageElement1_Ratex();

		/**
		 * The meta object literal for the '{@link fhiRCore.dataTypes.impl.RatioImpl <em>Ratio</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fhiRCore.dataTypes.impl.RatioImpl
		 * @see fhiRCore.dataTypes.impl.DataTypesPackageImpl#getRatio()
		 * @generated
		 */
		EClass RATIO = eINSTANCE.getRatio();

		/**
		 * The meta object literal for the '<em><b>Numerator</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RATIO__NUMERATOR = eINSTANCE.getRatio_Numerator();

		/**
		 * The meta object literal for the '<em><b>Denominator</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RATIO__DENOMINATOR = eINSTANCE.getRatio_Denominator();

		/**
		 * The meta object literal for the '{@link fhiRCore.dataTypes.impl.MoneyImpl <em>Money</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fhiRCore.dataTypes.impl.MoneyImpl
		 * @see fhiRCore.dataTypes.impl.DataTypesPackageImpl#getMoney()
		 * @generated
		 */
		EClass MONEY = eINSTANCE.getMoney();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MONEY__VALUE = eINSTANCE.getMoney_Value();

		/**
		 * The meta object literal for the '<em><b>Currency</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MONEY__CURRENCY = eINSTANCE.getMoney_Currency();

		/**
		 * The meta object literal for the '{@link fhiRCore.dataTypes.impl.SignatureImpl <em>Signature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fhiRCore.dataTypes.impl.SignatureImpl
		 * @see fhiRCore.dataTypes.impl.DataTypesPackageImpl#getSignature()
		 * @generated
		 */
		EClass SIGNATURE = eINSTANCE.getSignature();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIGNATURE__TYPE = eINSTANCE.getSignature_Type();

		/**
		 * The meta object literal for the '<em><b>When</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIGNATURE__WHEN = eINSTANCE.getSignature_When();

		/**
		 * The meta object literal for the '<em><b>Who</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIGNATURE__WHO = eINSTANCE.getSignature_Who();

		/**
		 * The meta object literal for the '<em><b>On Behalf Of</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIGNATURE__ON_BEHALF_OF = eINSTANCE.getSignature_OnBehalfOf();

		/**
		 * The meta object literal for the '<em><b>Target Format</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIGNATURE__TARGET_FORMAT = eINSTANCE.getSignature_TargetFormat();

		/**
		 * The meta object literal for the '<em><b>Sig Format</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIGNATURE__SIG_FORMAT = eINSTANCE.getSignature_SigFormat();

		/**
		 * The meta object literal for the '<em><b>Data</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIGNATURE__DATA = eINSTANCE.getSignature_Data();

		/**
		 * The meta object literal for the '{@link fhiRCore.dataTypes.impl.ProductShelfLifeImpl <em>Product Shelf Life</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fhiRCore.dataTypes.impl.ProductShelfLifeImpl
		 * @see fhiRCore.dataTypes.impl.DataTypesPackageImpl#getProductShelfLife()
		 * @generated
		 */
		EClass PRODUCT_SHELF_LIFE = eINSTANCE.getProductShelfLife();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_SHELF_LIFE__IDENTIFIER = eINSTANCE.getProductShelfLife_Identifier();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_SHELF_LIFE__TYPE = eINSTANCE.getProductShelfLife_Type();

		/**
		 * The meta object literal for the '<em><b>Period</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_SHELF_LIFE__PERIOD = eINSTANCE.getProductShelfLife_Period();

		/**
		 * The meta object literal for the '<em><b>Special Precautions For Storage</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_SHELF_LIFE__SPECIAL_PRECAUTIONS_FOR_STORAGE = eINSTANCE.getProductShelfLife_SpecialPrecautionsForStorage();

		/**
		 * The meta object literal for the '{@link fhiRCore.dataTypes.impl.ProdCharacteristicImpl <em>Prod Characteristic</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fhiRCore.dataTypes.impl.ProdCharacteristicImpl
		 * @see fhiRCore.dataTypes.impl.DataTypesPackageImpl#getProdCharacteristic()
		 * @generated
		 */
		EClass PROD_CHARACTERISTIC = eINSTANCE.getProdCharacteristic();

		/**
		 * The meta object literal for the '<em><b>Height</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROD_CHARACTERISTIC__HEIGHT = eINSTANCE.getProdCharacteristic_Height();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROD_CHARACTERISTIC__WIDTH = eINSTANCE.getProdCharacteristic_Width();

		/**
		 * The meta object literal for the '<em><b>Depth</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROD_CHARACTERISTIC__DEPTH = eINSTANCE.getProdCharacteristic_Depth();

		/**
		 * The meta object literal for the '<em><b>Weight</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROD_CHARACTERISTIC__WEIGHT = eINSTANCE.getProdCharacteristic_Weight();

		/**
		 * The meta object literal for the '<em><b>Nominal Volume</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROD_CHARACTERISTIC__NOMINAL_VOLUME = eINSTANCE.getProdCharacteristic_NominalVolume();

		/**
		 * The meta object literal for the '<em><b>External Diameter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROD_CHARACTERISTIC__EXTERNAL_DIAMETER = eINSTANCE.getProdCharacteristic_ExternalDiameter();

		/**
		 * The meta object literal for the '<em><b>Shape</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROD_CHARACTERISTIC__SHAPE = eINSTANCE.getProdCharacteristic_Shape();

		/**
		 * The meta object literal for the '<em><b>Color</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROD_CHARACTERISTIC__COLOR = eINSTANCE.getProdCharacteristic_Color();

		/**
		 * The meta object literal for the '<em><b>Imprint</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROD_CHARACTERISTIC__IMPRINT = eINSTANCE.getProdCharacteristic_Imprint();

		/**
		 * The meta object literal for the '<em><b>Image</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROD_CHARACTERISTIC__IMAGE = eINSTANCE.getProdCharacteristic_Image();

		/**
		 * The meta object literal for the '<em><b>Scoring</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROD_CHARACTERISTIC__SCORING = eINSTANCE.getProdCharacteristic_Scoring();

		/**
		 * The meta object literal for the '{@link fhiRCore.dataTypes.impl.MarketingStatusImpl <em>Marketing Status</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fhiRCore.dataTypes.impl.MarketingStatusImpl
		 * @see fhiRCore.dataTypes.impl.DataTypesPackageImpl#getMarketingStatus()
		 * @generated
		 */
		EClass MARKETING_STATUS = eINSTANCE.getMarketingStatus();

		/**
		 * The meta object literal for the '<em><b>Country</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MARKETING_STATUS__COUNTRY = eINSTANCE.getMarketingStatus_Country();

		/**
		 * The meta object literal for the '<em><b>Jurisdiction</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MARKETING_STATUS__JURISDICTION = eINSTANCE.getMarketingStatus_Jurisdiction();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MARKETING_STATUS__STATUS = eINSTANCE.getMarketingStatus_Status();

		/**
		 * The meta object literal for the '<em><b>Date Range</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MARKETING_STATUS__DATE_RANGE = eINSTANCE.getMarketingStatus_DateRange();

		/**
		 * The meta object literal for the '<em><b>Restore Date</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MARKETING_STATUS__RESTORE_DATE = eINSTANCE.getMarketingStatus_RestoreDate();

		/**
		 * The meta object literal for the '{@link fhiRCore.dataTypes.impl.PopulationImpl <em>Population</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fhiRCore.dataTypes.impl.PopulationImpl
		 * @see fhiRCore.dataTypes.impl.DataTypesPackageImpl#getPopulation()
		 * @generated
		 */
		EClass POPULATION = eINSTANCE.getPopulation();

		/**
		 * The meta object literal for the '<em><b>Agex</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POPULATION__AGEX = eINSTANCE.getPopulation_Agex();

		/**
		 * The meta object literal for the '<em><b>Gender</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POPULATION__GENDER = eINSTANCE.getPopulation_Gender();

		/**
		 * The meta object literal for the '<em><b>Race</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POPULATION__RACE = eINSTANCE.getPopulation_Race();

		/**
		 * The meta object literal for the '<em><b>Physiological Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POPULATION__PHYSIOLOGICAL_CONDITION = eINSTANCE.getPopulation_PhysiologicalCondition();

		/**
		 * The meta object literal for the '{@link fhiRCore.dataTypes.impl.SubstanceAmountImpl <em>Substance Amount</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fhiRCore.dataTypes.impl.SubstanceAmountImpl
		 * @see fhiRCore.dataTypes.impl.DataTypesPackageImpl#getSubstanceAmount()
		 * @generated
		 */
		EClass SUBSTANCE_AMOUNT = eINSTANCE.getSubstanceAmount();

		/**
		 * The meta object literal for the '<em><b>Amountx</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBSTANCE_AMOUNT__AMOUNTX = eINSTANCE.getSubstanceAmount_Amountx();

		/**
		 * The meta object literal for the '<em><b>Amount Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBSTANCE_AMOUNT__AMOUNT_TYPE = eINSTANCE.getSubstanceAmount_AmountType();

		/**
		 * The meta object literal for the '<em><b>Amount Text</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBSTANCE_AMOUNT__AMOUNT_TEXT = eINSTANCE.getSubstanceAmount_AmountText();

		/**
		 * The meta object literal for the '<em><b>Reference Range</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBSTANCE_AMOUNT__REFERENCE_RANGE = eINSTANCE.getSubstanceAmount_ReferenceRange();

		/**
		 * The meta object literal for the '{@link fhiRCore.dataTypes.impl.SubstanceAmountElement1Impl <em>Substance Amount Element1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fhiRCore.dataTypes.impl.SubstanceAmountElement1Impl
		 * @see fhiRCore.dataTypes.impl.DataTypesPackageImpl#getSubstanceAmountElement1()
		 * @generated
		 */
		EClass SUBSTANCE_AMOUNT_ELEMENT1 = eINSTANCE.getSubstanceAmountElement1();

		/**
		 * The meta object literal for the '<em><b>Low Limit</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBSTANCE_AMOUNT_ELEMENT1__LOW_LIMIT = eINSTANCE.getSubstanceAmountElement1_LowLimit();

		/**
		 * The meta object literal for the '<em><b>High Limit</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBSTANCE_AMOUNT_ELEMENT1__HIGH_LIMIT = eINSTANCE.getSubstanceAmountElement1_HighLimit();

		/**
		 * The meta object literal for the '{@link fhiRCore.dataTypes.impl.ElementDefinitionImpl <em>Element Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fhiRCore.dataTypes.impl.ElementDefinitionImpl
		 * @see fhiRCore.dataTypes.impl.DataTypesPackageImpl#getElementDefinition()
		 * @generated
		 */
		EClass ELEMENT_DEFINITION = eINSTANCE.getElementDefinition();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_DEFINITION__PATH = eINSTANCE.getElementDefinition_Path();

		/**
		 * The meta object literal for the '<em><b>Representation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_DEFINITION__REPRESENTATION = eINSTANCE.getElementDefinition_Representation();

		/**
		 * The meta object literal for the '<em><b>Slice Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_DEFINITION__SLICE_NAME = eINSTANCE.getElementDefinition_SliceName();

		/**
		 * The meta object literal for the '<em><b>Slice Is Constraining</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_DEFINITION__SLICE_IS_CONSTRAINING = eINSTANCE.getElementDefinition_SliceIsConstraining();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_DEFINITION__LABEL = eINSTANCE.getElementDefinition_Label();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_DEFINITION__CODE = eINSTANCE.getElementDefinition_Code();

		/**
		 * The meta object literal for the '<em><b>Slicing</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_DEFINITION__SLICING = eINSTANCE.getElementDefinition_Slicing();

		/**
		 * The meta object literal for the '<em><b>Short</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_DEFINITION__SHORT = eINSTANCE.getElementDefinition_Short();

		/**
		 * The meta object literal for the '<em><b>Definition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_DEFINITION__DEFINITION = eINSTANCE.getElementDefinition_Definition();

		/**
		 * The meta object literal for the '<em><b>Comment</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_DEFINITION__COMMENT = eINSTANCE.getElementDefinition_Comment();

		/**
		 * The meta object literal for the '<em><b>Requirements</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_DEFINITION__REQUIREMENTS = eINSTANCE.getElementDefinition_Requirements();

		/**
		 * The meta object literal for the '<em><b>Alias</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_DEFINITION__ALIAS = eINSTANCE.getElementDefinition_Alias();

		/**
		 * The meta object literal for the '<em><b>Min</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_DEFINITION__MIN = eINSTANCE.getElementDefinition_Min();

		/**
		 * The meta object literal for the '<em><b>Max</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_DEFINITION__MAX = eINSTANCE.getElementDefinition_Max();

		/**
		 * The meta object literal for the '<em><b>Base</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_DEFINITION__BASE = eINSTANCE.getElementDefinition_Base();

		/**
		 * The meta object literal for the '<em><b>Content Reference</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_DEFINITION__CONTENT_REFERENCE = eINSTANCE.getElementDefinition_ContentReference();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_DEFINITION__TYPE = eINSTANCE.getElementDefinition_Type();

		/**
		 * The meta object literal for the '<em><b>Default Valuex</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_DEFINITION__DEFAULT_VALUEX = eINSTANCE.getElementDefinition_DefaultValuex();

		/**
		 * The meta object literal for the '<em><b>Meaning When Missing</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_DEFINITION__MEANING_WHEN_MISSING = eINSTANCE.getElementDefinition_MeaningWhenMissing();

		/**
		 * The meta object literal for the '<em><b>Order Meaning</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_DEFINITION__ORDER_MEANING = eINSTANCE.getElementDefinition_OrderMeaning();

		/**
		 * The meta object literal for the '<em><b>Fixedx</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_DEFINITION__FIXEDX = eINSTANCE.getElementDefinition_Fixedx();

		/**
		 * The meta object literal for the '<em><b>Patternx</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_DEFINITION__PATTERNX = eINSTANCE.getElementDefinition_Patternx();

		/**
		 * The meta object literal for the '<em><b>Example</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_DEFINITION__EXAMPLE = eINSTANCE.getElementDefinition_Example();

		/**
		 * The meta object literal for the '<em><b>Min Valuex</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_DEFINITION__MIN_VALUEX = eINSTANCE.getElementDefinition_MinValuex();

		/**
		 * The meta object literal for the '<em><b>Max Valuex</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_DEFINITION__MAX_VALUEX = eINSTANCE.getElementDefinition_MaxValuex();

		/**
		 * The meta object literal for the '<em><b>Max Length</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_DEFINITION__MAX_LENGTH = eINSTANCE.getElementDefinition_MaxLength();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_DEFINITION__CONDITION = eINSTANCE.getElementDefinition_Condition();

		/**
		 * The meta object literal for the '<em><b>Constraint</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_DEFINITION__CONSTRAINT = eINSTANCE.getElementDefinition_Constraint();

		/**
		 * The meta object literal for the '<em><b>Must Support</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_DEFINITION__MUST_SUPPORT = eINSTANCE.getElementDefinition_MustSupport();

		/**
		 * The meta object literal for the '<em><b>Is Modifier</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_DEFINITION__IS_MODIFIER = eINSTANCE.getElementDefinition_IsModifier();

		/**
		 * The meta object literal for the '<em><b>Is Modifier Reason</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_DEFINITION__IS_MODIFIER_REASON = eINSTANCE.getElementDefinition_IsModifierReason();

		/**
		 * The meta object literal for the '<em><b>Is Summary</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_DEFINITION__IS_SUMMARY = eINSTANCE.getElementDefinition_IsSummary();

		/**
		 * The meta object literal for the '<em><b>Binding</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_DEFINITION__BINDING = eINSTANCE.getElementDefinition_Binding();

		/**
		 * The meta object literal for the '<em><b>Mapping</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_DEFINITION__MAPPING = eINSTANCE.getElementDefinition_Mapping();

		/**
		 * The meta object literal for the '{@link fhiRCore.dataTypes.impl.ElementDefinitionElement1Impl <em>Element Definition Element1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fhiRCore.dataTypes.impl.ElementDefinitionElement1Impl
		 * @see fhiRCore.dataTypes.impl.DataTypesPackageImpl#getElementDefinitionElement1()
		 * @generated
		 */
		EClass ELEMENT_DEFINITION_ELEMENT1 = eINSTANCE.getElementDefinitionElement1();

		/**
		 * The meta object literal for the '<em><b>Discriminator</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_DEFINITION_ELEMENT1__DISCRIMINATOR = eINSTANCE.getElementDefinitionElement1_Discriminator();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_DEFINITION_ELEMENT1__DESCRIPTION = eINSTANCE.getElementDefinitionElement1_Description();

		/**
		 * The meta object literal for the '<em><b>Ordered</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_DEFINITION_ELEMENT1__ORDERED = eINSTANCE.getElementDefinitionElement1_Ordered();

		/**
		 * The meta object literal for the '<em><b>Rules</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_DEFINITION_ELEMENT1__RULES = eINSTANCE.getElementDefinitionElement1_Rules();

		/**
		 * The meta object literal for the '{@link fhiRCore.dataTypes.impl.ElementDefinitionElement1Element1Impl <em>Element Definition Element1 Element1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fhiRCore.dataTypes.impl.ElementDefinitionElement1Element1Impl
		 * @see fhiRCore.dataTypes.impl.DataTypesPackageImpl#getElementDefinitionElement1Element1()
		 * @generated
		 */
		EClass ELEMENT_DEFINITION_ELEMENT1_ELEMENT1 = eINSTANCE.getElementDefinitionElement1Element1();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_DEFINITION_ELEMENT1_ELEMENT1__TYPE = eINSTANCE.getElementDefinitionElement1Element1_Type();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_DEFINITION_ELEMENT1_ELEMENT1__PATH = eINSTANCE.getElementDefinitionElement1Element1_Path();

		/**
		 * The meta object literal for the '{@link fhiRCore.dataTypes.impl.ElementDefinitionElement2Impl <em>Element Definition Element2</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fhiRCore.dataTypes.impl.ElementDefinitionElement2Impl
		 * @see fhiRCore.dataTypes.impl.DataTypesPackageImpl#getElementDefinitionElement2()
		 * @generated
		 */
		EClass ELEMENT_DEFINITION_ELEMENT2 = eINSTANCE.getElementDefinitionElement2();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_DEFINITION_ELEMENT2__PATH = eINSTANCE.getElementDefinitionElement2_Path();

		/**
		 * The meta object literal for the '<em><b>Min</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_DEFINITION_ELEMENT2__MIN = eINSTANCE.getElementDefinitionElement2_Min();

		/**
		 * The meta object literal for the '<em><b>Max</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_DEFINITION_ELEMENT2__MAX = eINSTANCE.getElementDefinitionElement2_Max();

		/**
		 * The meta object literal for the '{@link fhiRCore.dataTypes.impl.ElementDefinitionElement3Impl <em>Element Definition Element3</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fhiRCore.dataTypes.impl.ElementDefinitionElement3Impl
		 * @see fhiRCore.dataTypes.impl.DataTypesPackageImpl#getElementDefinitionElement3()
		 * @generated
		 */
		EClass ELEMENT_DEFINITION_ELEMENT3 = eINSTANCE.getElementDefinitionElement3();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_DEFINITION_ELEMENT3__CODE = eINSTANCE.getElementDefinitionElement3_Code();

		/**
		 * The meta object literal for the '<em><b>Profile</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_DEFINITION_ELEMENT3__PROFILE = eINSTANCE.getElementDefinitionElement3_Profile();

		/**
		 * The meta object literal for the '<em><b>Target Profile</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_DEFINITION_ELEMENT3__TARGET_PROFILE = eINSTANCE.getElementDefinitionElement3_TargetProfile();

		/**
		 * The meta object literal for the '<em><b>Aggregation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_DEFINITION_ELEMENT3__AGGREGATION = eINSTANCE.getElementDefinitionElement3_Aggregation();

		/**
		 * The meta object literal for the '<em><b>Versioning</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_DEFINITION_ELEMENT3__VERSIONING = eINSTANCE.getElementDefinitionElement3_Versioning();

		/**
		 * The meta object literal for the '{@link fhiRCore.dataTypes.impl.ElementDefinitionElement4Impl <em>Element Definition Element4</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fhiRCore.dataTypes.impl.ElementDefinitionElement4Impl
		 * @see fhiRCore.dataTypes.impl.DataTypesPackageImpl#getElementDefinitionElement4()
		 * @generated
		 */
		EClass ELEMENT_DEFINITION_ELEMENT4 = eINSTANCE.getElementDefinitionElement4();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_DEFINITION_ELEMENT4__LABEL = eINSTANCE.getElementDefinitionElement4_Label();

		/**
		 * The meta object literal for the '<em><b>Valuex</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_DEFINITION_ELEMENT4__VALUEX = eINSTANCE.getElementDefinitionElement4_Valuex();

		/**
		 * The meta object literal for the '{@link fhiRCore.dataTypes.impl.ElementDefinitionElement5Impl <em>Element Definition Element5</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fhiRCore.dataTypes.impl.ElementDefinitionElement5Impl
		 * @see fhiRCore.dataTypes.impl.DataTypesPackageImpl#getElementDefinitionElement5()
		 * @generated
		 */
		EClass ELEMENT_DEFINITION_ELEMENT5 = eINSTANCE.getElementDefinitionElement5();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_DEFINITION_ELEMENT5__KEY = eINSTANCE.getElementDefinitionElement5_Key();

		/**
		 * The meta object literal for the '<em><b>Requirements</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_DEFINITION_ELEMENT5__REQUIREMENTS = eINSTANCE.getElementDefinitionElement5_Requirements();

		/**
		 * The meta object literal for the '<em><b>Severity</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_DEFINITION_ELEMENT5__SEVERITY = eINSTANCE.getElementDefinitionElement5_Severity();

		/**
		 * The meta object literal for the '<em><b>Human</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_DEFINITION_ELEMENT5__HUMAN = eINSTANCE.getElementDefinitionElement5_Human();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_DEFINITION_ELEMENT5__EXPRESSION = eINSTANCE.getElementDefinitionElement5_Expression();

		/**
		 * The meta object literal for the '<em><b>Xpath</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_DEFINITION_ELEMENT5__XPATH = eINSTANCE.getElementDefinitionElement5_Xpath();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_DEFINITION_ELEMENT5__SOURCE = eINSTANCE.getElementDefinitionElement5_Source();

		/**
		 * The meta object literal for the '{@link fhiRCore.dataTypes.impl.ElementDefinitionElement6Impl <em>Element Definition Element6</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fhiRCore.dataTypes.impl.ElementDefinitionElement6Impl
		 * @see fhiRCore.dataTypes.impl.DataTypesPackageImpl#getElementDefinitionElement6()
		 * @generated
		 */
		EClass ELEMENT_DEFINITION_ELEMENT6 = eINSTANCE.getElementDefinitionElement6();

		/**
		 * The meta object literal for the '<em><b>Strength</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_DEFINITION_ELEMENT6__STRENGTH = eINSTANCE.getElementDefinitionElement6_Strength();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_DEFINITION_ELEMENT6__DESCRIPTION = eINSTANCE.getElementDefinitionElement6_Description();

		/**
		 * The meta object literal for the '<em><b>Value Set</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_DEFINITION_ELEMENT6__VALUE_SET = eINSTANCE.getElementDefinitionElement6_ValueSet();

		/**
		 * The meta object literal for the '{@link fhiRCore.dataTypes.impl.ElementDefinitionElement7Impl <em>Element Definition Element7</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fhiRCore.dataTypes.impl.ElementDefinitionElement7Impl
		 * @see fhiRCore.dataTypes.impl.DataTypesPackageImpl#getElementDefinitionElement7()
		 * @generated
		 */
		EClass ELEMENT_DEFINITION_ELEMENT7 = eINSTANCE.getElementDefinitionElement7();

		/**
		 * The meta object literal for the '<em><b>Identity</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_DEFINITION_ELEMENT7__IDENTITY = eINSTANCE.getElementDefinitionElement7_Identity();

		/**
		 * The meta object literal for the '<em><b>Language</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_DEFINITION_ELEMENT7__LANGUAGE = eINSTANCE.getElementDefinitionElement7_Language();

		/**
		 * The meta object literal for the '<em><b>Map</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_DEFINITION_ELEMENT7__MAP = eINSTANCE.getElementDefinitionElement7_Map();

		/**
		 * The meta object literal for the '<em><b>Comment</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_DEFINITION_ELEMENT7__COMMENT = eINSTANCE.getElementDefinitionElement7_Comment();

		/**
		 * The meta object literal for the '{@link fhiRCore.dataTypes.impl.CountImpl <em>Count</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fhiRCore.dataTypes.impl.CountImpl
		 * @see fhiRCore.dataTypes.impl.DataTypesPackageImpl#getCount()
		 * @generated
		 */
		EClass COUNT = eINSTANCE.getCount();

		/**
		 * The meta object literal for the '{@link fhiRCore.dataTypes.impl.DistanceImpl <em>Distance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fhiRCore.dataTypes.impl.DistanceImpl
		 * @see fhiRCore.dataTypes.impl.DataTypesPackageImpl#getDistance()
		 * @generated
		 */
		EClass DISTANCE = eINSTANCE.getDistance();

		/**
		 * The meta object literal for the '{@link fhiRCore.dataTypes.impl.SampledDataImpl <em>Sampled Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fhiRCore.dataTypes.impl.SampledDataImpl
		 * @see fhiRCore.dataTypes.impl.DataTypesPackageImpl#getSampledData()
		 * @generated
		 */
		EClass SAMPLED_DATA = eINSTANCE.getSampledData();

		/**
		 * The meta object literal for the '<em><b>Origin</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SAMPLED_DATA__ORIGIN = eINSTANCE.getSampledData_Origin();

		/**
		 * The meta object literal for the '<em><b>Period</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SAMPLED_DATA__PERIOD = eINSTANCE.getSampledData_Period();

		/**
		 * The meta object literal for the '<em><b>Factor</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SAMPLED_DATA__FACTOR = eINSTANCE.getSampledData_Factor();

		/**
		 * The meta object literal for the '<em><b>Lower Limit</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SAMPLED_DATA__LOWER_LIMIT = eINSTANCE.getSampledData_LowerLimit();

		/**
		 * The meta object literal for the '<em><b>Upper Limit</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SAMPLED_DATA__UPPER_LIMIT = eINSTANCE.getSampledData_UpperLimit();

		/**
		 * The meta object literal for the '<em><b>Dimensions</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SAMPLED_DATA__DIMENSIONS = eINSTANCE.getSampledData_Dimensions();

		/**
		 * The meta object literal for the '<em><b>Data</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SAMPLED_DATA__DATA = eINSTANCE.getSampledData_Data();

		/**
		 * The meta object literal for the '{@link fhiRCore.dataTypes.impl.ContributorImpl <em>Contributor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fhiRCore.dataTypes.impl.ContributorImpl
		 * @see fhiRCore.dataTypes.impl.DataTypesPackageImpl#getContributor()
		 * @generated
		 */
		EClass CONTRIBUTOR = eINSTANCE.getContributor();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTRIBUTOR__TYPE = eINSTANCE.getContributor_Type();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTRIBUTOR__NAME = eINSTANCE.getContributor_Name();

		/**
		 * The meta object literal for the '<em><b>Contact</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTRIBUTOR__CONTACT = eINSTANCE.getContributor_Contact();

		/**
		 * The meta object literal for the '{@link fhiRCore.dataTypes.impl.SimpleQuantityImpl <em>Simple Quantity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fhiRCore.dataTypes.impl.SimpleQuantityImpl
		 * @see fhiRCore.dataTypes.impl.DataTypesPackageImpl#getSimpleQuantity()
		 * @generated
		 */
		EClass SIMPLE_QUANTITY = eINSTANCE.getSimpleQuantity();

		/**
		 * The meta object literal for the '{@link fhiRCore.dataTypes.impl.MoneyQuantityImpl <em>Money Quantity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fhiRCore.dataTypes.impl.MoneyQuantityImpl
		 * @see fhiRCore.dataTypes.impl.DataTypesPackageImpl#getMoneyQuantity()
		 * @generated
		 */
		EClass MONEY_QUANTITY = eINSTANCE.getMoneyQuantity();

		/**
		 * The meta object literal for the '{@link fhiRCore.dataTypes.impl.ReferenceRangeImpl <em>Reference Range</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fhiRCore.dataTypes.impl.ReferenceRangeImpl
		 * @see fhiRCore.dataTypes.impl.DataTypesPackageImpl#getReferenceRange()
		 * @generated
		 */
		EClass REFERENCE_RANGE = eINSTANCE.getReferenceRange();

		/**
		 * The meta object literal for the '<em><b>Low</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERENCE_RANGE__LOW = eINSTANCE.getReferenceRange_Low();

		/**
		 * The meta object literal for the '<em><b>High</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERENCE_RANGE__HIGH = eINSTANCE.getReferenceRange_High();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERENCE_RANGE__TYPE = eINSTANCE.getReferenceRange_Type();

		/**
		 * The meta object literal for the '<em><b>Applies To</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERENCE_RANGE__APPLIES_TO = eINSTANCE.getReferenceRange_AppliesTo();

		/**
		 * The meta object literal for the '<em><b>Age</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERENCE_RANGE__AGE = eINSTANCE.getReferenceRange_Age();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERENCE_RANGE__TEXT = eINSTANCE.getReferenceRange_Text();

	}

} //DataTypesPackage
