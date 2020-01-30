/**
 */
package fhiRCore.profiles;

import fhiRCore.dataTypes.DataTypesPackage;

import fhiRCore.resources.ResourcesPackage;

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
 * @see fhiRCore.profiles.ProfilesFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Profiles'"
 * @generated
 */
public interface ProfilesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "profiles";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///fhiRCore/profiles.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "fhiRCore.profiles";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ProfilesPackage eINSTANCE = fhiRCore.profiles.impl.ProfilesPackageImpl.init();

	/**
	 * The meta object id for the '{@link fhiRCore.profiles.impl.PicoelementImpl <em>Picoelement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.profiles.impl.PicoelementImpl
	 * @see fhiRCore.profiles.impl.ProfilesPackageImpl#getPicoelement()
	 * @generated
	 */
	int PICOELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICOELEMENT__ID = ResourcesPackage.EVIDENCE_VARIABLE__ID;

	/**
	 * The feature id for the '<em><b>Meta</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICOELEMENT__META = ResourcesPackage.EVIDENCE_VARIABLE__META;

	/**
	 * The feature id for the '<em><b>Implicit Rules</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICOELEMENT__IMPLICIT_RULES = ResourcesPackage.EVIDENCE_VARIABLE__IMPLICIT_RULES;

	/**
	 * The feature id for the '<em><b>Language</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICOELEMENT__LANGUAGE = ResourcesPackage.EVIDENCE_VARIABLE__LANGUAGE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICOELEMENT__TEXT = ResourcesPackage.EVIDENCE_VARIABLE__TEXT;

	/**
	 * The feature id for the '<em><b>Contained</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICOELEMENT__CONTAINED = ResourcesPackage.EVIDENCE_VARIABLE__CONTAINED;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICOELEMENT__EXTENSION = ResourcesPackage.EVIDENCE_VARIABLE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Modifier Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICOELEMENT__MODIFIER_EXTENSION = ResourcesPackage.EVIDENCE_VARIABLE__MODIFIER_EXTENSION;

	/**
	 * The feature id for the '<em><b>Url</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICOELEMENT__URL = ResourcesPackage.EVIDENCE_VARIABLE__URL;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICOELEMENT__IDENTIFIER = ResourcesPackage.EVIDENCE_VARIABLE__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Version</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICOELEMENT__VERSION = ResourcesPackage.EVIDENCE_VARIABLE__VERSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICOELEMENT__NAME = ResourcesPackage.EVIDENCE_VARIABLE__NAME;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICOELEMENT__TITLE = ResourcesPackage.EVIDENCE_VARIABLE__TITLE;

	/**
	 * The feature id for the '<em><b>Short Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICOELEMENT__SHORT_TITLE = ResourcesPackage.EVIDENCE_VARIABLE__SHORT_TITLE;

	/**
	 * The feature id for the '<em><b>Subtitle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICOELEMENT__SUBTITLE = ResourcesPackage.EVIDENCE_VARIABLE__SUBTITLE;

	/**
	 * The feature id for the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICOELEMENT__STATUS = ResourcesPackage.EVIDENCE_VARIABLE__STATUS;

	/**
	 * The feature id for the '<em><b>Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICOELEMENT__DATE = ResourcesPackage.EVIDENCE_VARIABLE__DATE;

	/**
	 * The feature id for the '<em><b>Publisher</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICOELEMENT__PUBLISHER = ResourcesPackage.EVIDENCE_VARIABLE__PUBLISHER;

	/**
	 * The feature id for the '<em><b>Contact</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICOELEMENT__CONTACT = ResourcesPackage.EVIDENCE_VARIABLE__CONTACT;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICOELEMENT__DESCRIPTION = ResourcesPackage.EVIDENCE_VARIABLE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Note</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICOELEMENT__NOTE = ResourcesPackage.EVIDENCE_VARIABLE__NOTE;

	/**
	 * The feature id for the '<em><b>Use Context</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICOELEMENT__USE_CONTEXT = ResourcesPackage.EVIDENCE_VARIABLE__USE_CONTEXT;

	/**
	 * The feature id for the '<em><b>Jurisdiction</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICOELEMENT__JURISDICTION = ResourcesPackage.EVIDENCE_VARIABLE__JURISDICTION;

	/**
	 * The feature id for the '<em><b>Copyright</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICOELEMENT__COPYRIGHT = ResourcesPackage.EVIDENCE_VARIABLE__COPYRIGHT;

	/**
	 * The feature id for the '<em><b>Approval Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICOELEMENT__APPROVAL_DATE = ResourcesPackage.EVIDENCE_VARIABLE__APPROVAL_DATE;

	/**
	 * The feature id for the '<em><b>Last Review Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICOELEMENT__LAST_REVIEW_DATE = ResourcesPackage.EVIDENCE_VARIABLE__LAST_REVIEW_DATE;

	/**
	 * The feature id for the '<em><b>Effective Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICOELEMENT__EFFECTIVE_PERIOD = ResourcesPackage.EVIDENCE_VARIABLE__EFFECTIVE_PERIOD;

	/**
	 * The feature id for the '<em><b>Topic</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICOELEMENT__TOPIC = ResourcesPackage.EVIDENCE_VARIABLE__TOPIC;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICOELEMENT__AUTHOR = ResourcesPackage.EVIDENCE_VARIABLE__AUTHOR;

	/**
	 * The feature id for the '<em><b>Editor</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICOELEMENT__EDITOR = ResourcesPackage.EVIDENCE_VARIABLE__EDITOR;

	/**
	 * The feature id for the '<em><b>Reviewer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICOELEMENT__REVIEWER = ResourcesPackage.EVIDENCE_VARIABLE__REVIEWER;

	/**
	 * The feature id for the '<em><b>Endorser</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICOELEMENT__ENDORSER = ResourcesPackage.EVIDENCE_VARIABLE__ENDORSER;

	/**
	 * The feature id for the '<em><b>Related Artifact</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICOELEMENT__RELATED_ARTIFACT = ResourcesPackage.EVIDENCE_VARIABLE__RELATED_ARTIFACT;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICOELEMENT__TYPE = ResourcesPackage.EVIDENCE_VARIABLE__TYPE;

	/**
	 * The feature id for the '<em><b>Characteristic</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICOELEMENT__CHARACTERISTIC = ResourcesPackage.EVIDENCE_VARIABLE__CHARACTERISTIC;

	/**
	 * The number of structural features of the '<em>Picoelement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICOELEMENT_FEATURE_COUNT = ResourcesPackage.EVIDENCE_VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Picoelement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICOELEMENT_OPERATION_COUNT = ResourcesPackage.EVIDENCE_VARIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fhiRCore.profiles.impl.PicoelementCharacteristic1Impl <em>Picoelement Characteristic1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.profiles.impl.PicoelementCharacteristic1Impl
	 * @see fhiRCore.profiles.impl.ProfilesPackageImpl#getPicoelementCharacteristic1()
	 * @generated
	 */
	int PICOELEMENT_CHARACTERISTIC1 = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICOELEMENT_CHARACTERISTIC1__ID = ResourcesPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__ID;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICOELEMENT_CHARACTERISTIC1__EXTENSION = ResourcesPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__EXTENSION;

	/**
	 * The feature id for the '<em><b>Modifier Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICOELEMENT_CHARACTERISTIC1__MODIFIER_EXTENSION = ResourcesPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__MODIFIER_EXTENSION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICOELEMENT_CHARACTERISTIC1__DESCRIPTION = ResourcesPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Definitionx</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICOELEMENT_CHARACTERISTIC1__DEFINITIONX = ResourcesPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__DEFINITIONX;

	/**
	 * The feature id for the '<em><b>Usage Context</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICOELEMENT_CHARACTERISTIC1__USAGE_CONTEXT = ResourcesPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__USAGE_CONTEXT;

	/**
	 * The feature id for the '<em><b>Exclude</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICOELEMENT_CHARACTERISTIC1__EXCLUDE = ResourcesPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__EXCLUDE;

	/**
	 * The feature id for the '<em><b>Participant Effectivex</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICOELEMENT_CHARACTERISTIC1__PARTICIPANT_EFFECTIVEX = ResourcesPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__PARTICIPANT_EFFECTIVEX;

	/**
	 * The feature id for the '<em><b>Time From Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICOELEMENT_CHARACTERISTIC1__TIME_FROM_START = ResourcesPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__TIME_FROM_START;

	/**
	 * The feature id for the '<em><b>Group Measure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICOELEMENT_CHARACTERISTIC1__GROUP_MEASURE = ResourcesPackage.EVIDENCE_VARIABLE_CHARACTERISTIC__GROUP_MEASURE;

	/**
	 * The number of structural features of the '<em>Picoelement Characteristic1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICOELEMENT_CHARACTERISTIC1_FEATURE_COUNT = ResourcesPackage.EVIDENCE_VARIABLE_CHARACTERISTIC_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Picoelement Characteristic1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICOELEMENT_CHARACTERISTIC1_OPERATION_COUNT = ResourcesPackage.EVIDENCE_VARIABLE_CHARACTERISTIC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fhiRCore.profiles.impl.VitalsignsImpl <em>Vitalsigns</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.profiles.impl.VitalsignsImpl
	 * @see fhiRCore.profiles.impl.ProfilesPackageImpl#getVitalsigns()
	 * @generated
	 */
	int VITALSIGNS = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITALSIGNS__ID = ResourcesPackage.OBSERVATION__ID;

	/**
	 * The feature id for the '<em><b>Meta</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITALSIGNS__META = ResourcesPackage.OBSERVATION__META;

	/**
	 * The feature id for the '<em><b>Implicit Rules</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITALSIGNS__IMPLICIT_RULES = ResourcesPackage.OBSERVATION__IMPLICIT_RULES;

	/**
	 * The feature id for the '<em><b>Language</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITALSIGNS__LANGUAGE = ResourcesPackage.OBSERVATION__LANGUAGE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITALSIGNS__TEXT = ResourcesPackage.OBSERVATION__TEXT;

	/**
	 * The feature id for the '<em><b>Contained</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITALSIGNS__CONTAINED = ResourcesPackage.OBSERVATION__CONTAINED;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITALSIGNS__EXTENSION = ResourcesPackage.OBSERVATION__EXTENSION;

	/**
	 * The feature id for the '<em><b>Modifier Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITALSIGNS__MODIFIER_EXTENSION = ResourcesPackage.OBSERVATION__MODIFIER_EXTENSION;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITALSIGNS__IDENTIFIER = ResourcesPackage.OBSERVATION__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Based On</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITALSIGNS__BASED_ON = ResourcesPackage.OBSERVATION__BASED_ON;

	/**
	 * The feature id for the '<em><b>Part Of</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITALSIGNS__PART_OF = ResourcesPackage.OBSERVATION__PART_OF;

	/**
	 * The feature id for the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITALSIGNS__STATUS = ResourcesPackage.OBSERVATION__STATUS;

	/**
	 * The feature id for the '<em><b>Category</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITALSIGNS__CATEGORY = ResourcesPackage.OBSERVATION__CATEGORY;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITALSIGNS__CODE = ResourcesPackage.OBSERVATION__CODE;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITALSIGNS__SUBJECT = ResourcesPackage.OBSERVATION__SUBJECT;

	/**
	 * The feature id for the '<em><b>Focus</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITALSIGNS__FOCUS = ResourcesPackage.OBSERVATION__FOCUS;

	/**
	 * The feature id for the '<em><b>Encounter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITALSIGNS__ENCOUNTER = ResourcesPackage.OBSERVATION__ENCOUNTER;

	/**
	 * The feature id for the '<em><b>Effectivex</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITALSIGNS__EFFECTIVEX = ResourcesPackage.OBSERVATION__EFFECTIVEX;

	/**
	 * The feature id for the '<em><b>Issued</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITALSIGNS__ISSUED = ResourcesPackage.OBSERVATION__ISSUED;

	/**
	 * The feature id for the '<em><b>Performer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITALSIGNS__PERFORMER = ResourcesPackage.OBSERVATION__PERFORMER;

	/**
	 * The feature id for the '<em><b>Valuex</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITALSIGNS__VALUEX = ResourcesPackage.OBSERVATION__VALUEX;

	/**
	 * The feature id for the '<em><b>Data Absent Reason</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITALSIGNS__DATA_ABSENT_REASON = ResourcesPackage.OBSERVATION__DATA_ABSENT_REASON;

	/**
	 * The feature id for the '<em><b>Interpretation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITALSIGNS__INTERPRETATION = ResourcesPackage.OBSERVATION__INTERPRETATION;

	/**
	 * The feature id for the '<em><b>Note</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITALSIGNS__NOTE = ResourcesPackage.OBSERVATION__NOTE;

	/**
	 * The feature id for the '<em><b>Body Site</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITALSIGNS__BODY_SITE = ResourcesPackage.OBSERVATION__BODY_SITE;

	/**
	 * The feature id for the '<em><b>Method</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITALSIGNS__METHOD = ResourcesPackage.OBSERVATION__METHOD;

	/**
	 * The feature id for the '<em><b>Specimen</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITALSIGNS__SPECIMEN = ResourcesPackage.OBSERVATION__SPECIMEN;

	/**
	 * The feature id for the '<em><b>Device</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITALSIGNS__DEVICE = ResourcesPackage.OBSERVATION__DEVICE;

	/**
	 * The feature id for the '<em><b>Has Member</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITALSIGNS__HAS_MEMBER = ResourcesPackage.OBSERVATION__HAS_MEMBER;

	/**
	 * The feature id for the '<em><b>Derived From</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITALSIGNS__DERIVED_FROM = ResourcesPackage.OBSERVATION__DERIVED_FROM;

	/**
	 * The feature id for the '<em><b>Component</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITALSIGNS__COMPONENT = ResourcesPackage.OBSERVATION__COMPONENT;

	/**
	 * The feature id for the '<em><b>Reference Range</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITALSIGNS__REFERENCE_RANGE = ResourcesPackage.OBSERVATION__REFERENCE_RANGE;

	/**
	 * The feature id for the '<em><b>Vs Cat</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITALSIGNS__VS_CAT = ResourcesPackage.OBSERVATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Vitalsigns</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITALSIGNS_FEATURE_COUNT = ResourcesPackage.OBSERVATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Vitalsigns</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITALSIGNS_OPERATION_COUNT = ResourcesPackage.OBSERVATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fhiRCore.profiles.impl.BmiImpl <em>Bmi</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.profiles.impl.BmiImpl
	 * @see fhiRCore.profiles.impl.ProfilesPackageImpl#getBmi()
	 * @generated
	 */
	int BMI = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BMI__ID = VITALSIGNS__ID;

	/**
	 * The feature id for the '<em><b>Meta</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BMI__META = VITALSIGNS__META;

	/**
	 * The feature id for the '<em><b>Implicit Rules</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BMI__IMPLICIT_RULES = VITALSIGNS__IMPLICIT_RULES;

	/**
	 * The feature id for the '<em><b>Language</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BMI__LANGUAGE = VITALSIGNS__LANGUAGE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BMI__TEXT = VITALSIGNS__TEXT;

	/**
	 * The feature id for the '<em><b>Contained</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BMI__CONTAINED = VITALSIGNS__CONTAINED;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BMI__EXTENSION = VITALSIGNS__EXTENSION;

	/**
	 * The feature id for the '<em><b>Modifier Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BMI__MODIFIER_EXTENSION = VITALSIGNS__MODIFIER_EXTENSION;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BMI__IDENTIFIER = VITALSIGNS__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Based On</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BMI__BASED_ON = VITALSIGNS__BASED_ON;

	/**
	 * The feature id for the '<em><b>Part Of</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BMI__PART_OF = VITALSIGNS__PART_OF;

	/**
	 * The feature id for the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BMI__STATUS = VITALSIGNS__STATUS;

	/**
	 * The feature id for the '<em><b>Category</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BMI__CATEGORY = VITALSIGNS__CATEGORY;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BMI__CODE = VITALSIGNS__CODE;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BMI__SUBJECT = VITALSIGNS__SUBJECT;

	/**
	 * The feature id for the '<em><b>Focus</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BMI__FOCUS = VITALSIGNS__FOCUS;

	/**
	 * The feature id for the '<em><b>Encounter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BMI__ENCOUNTER = VITALSIGNS__ENCOUNTER;

	/**
	 * The feature id for the '<em><b>Effectivex</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BMI__EFFECTIVEX = VITALSIGNS__EFFECTIVEX;

	/**
	 * The feature id for the '<em><b>Issued</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BMI__ISSUED = VITALSIGNS__ISSUED;

	/**
	 * The feature id for the '<em><b>Performer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BMI__PERFORMER = VITALSIGNS__PERFORMER;

	/**
	 * The feature id for the '<em><b>Valuex</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BMI__VALUEX = VITALSIGNS__VALUEX;

	/**
	 * The feature id for the '<em><b>Data Absent Reason</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BMI__DATA_ABSENT_REASON = VITALSIGNS__DATA_ABSENT_REASON;

	/**
	 * The feature id for the '<em><b>Interpretation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BMI__INTERPRETATION = VITALSIGNS__INTERPRETATION;

	/**
	 * The feature id for the '<em><b>Note</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BMI__NOTE = VITALSIGNS__NOTE;

	/**
	 * The feature id for the '<em><b>Body Site</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BMI__BODY_SITE = VITALSIGNS__BODY_SITE;

	/**
	 * The feature id for the '<em><b>Method</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BMI__METHOD = VITALSIGNS__METHOD;

	/**
	 * The feature id for the '<em><b>Specimen</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BMI__SPECIMEN = VITALSIGNS__SPECIMEN;

	/**
	 * The feature id for the '<em><b>Device</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BMI__DEVICE = VITALSIGNS__DEVICE;

	/**
	 * The feature id for the '<em><b>Has Member</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BMI__HAS_MEMBER = VITALSIGNS__HAS_MEMBER;

	/**
	 * The feature id for the '<em><b>Derived From</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BMI__DERIVED_FROM = VITALSIGNS__DERIVED_FROM;

	/**
	 * The feature id for the '<em><b>Component</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BMI__COMPONENT = VITALSIGNS__COMPONENT;

	/**
	 * The feature id for the '<em><b>Reference Range</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BMI__REFERENCE_RANGE = VITALSIGNS__REFERENCE_RANGE;

	/**
	 * The feature id for the '<em><b>Vs Cat</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BMI__VS_CAT = VITALSIGNS__VS_CAT;

	/**
	 * The feature id for the '<em><b>Value Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BMI__VALUE_QUANTITY = VITALSIGNS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Bmi</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BMI_FEATURE_COUNT = VITALSIGNS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Bmi</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BMI_OPERATION_COUNT = VITALSIGNS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fhiRCore.profiles.impl.VitalsignsCodeableConcept1Impl <em>Vitalsigns Codeable Concept1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.profiles.impl.VitalsignsCodeableConcept1Impl
	 * @see fhiRCore.profiles.impl.ProfilesPackageImpl#getVitalsignsCodeableConcept1()
	 * @generated
	 */
	int VITALSIGNS_CODEABLE_CONCEPT1 = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITALSIGNS_CODEABLE_CONCEPT1__ID = DataTypesPackage.CODEABLE_CONCEPT__ID;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITALSIGNS_CODEABLE_CONCEPT1__EXTENSION = DataTypesPackage.CODEABLE_CONCEPT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Coding</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITALSIGNS_CODEABLE_CONCEPT1__CODING = DataTypesPackage.CODEABLE_CONCEPT__CODING;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITALSIGNS_CODEABLE_CONCEPT1__TEXT = DataTypesPackage.CODEABLE_CONCEPT__TEXT;

	/**
	 * The number of structural features of the '<em>Vitalsigns Codeable Concept1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITALSIGNS_CODEABLE_CONCEPT1_FEATURE_COUNT = DataTypesPackage.CODEABLE_CONCEPT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Vitalsigns Codeable Concept1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITALSIGNS_CODEABLE_CONCEPT1_OPERATION_COUNT = DataTypesPackage.CODEABLE_CONCEPT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fhiRCore.profiles.impl.VitalsignsCodeableConcept1Coding1Impl <em>Vitalsigns Codeable Concept1 Coding1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.profiles.impl.VitalsignsCodeableConcept1Coding1Impl
	 * @see fhiRCore.profiles.impl.ProfilesPackageImpl#getVitalsignsCodeableConcept1Coding1()
	 * @generated
	 */
	int VITALSIGNS_CODEABLE_CONCEPT1_CODING1 = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITALSIGNS_CODEABLE_CONCEPT1_CODING1__ID = DataTypesPackage.CODING__ID;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITALSIGNS_CODEABLE_CONCEPT1_CODING1__EXTENSION = DataTypesPackage.CODING__EXTENSION;

	/**
	 * The feature id for the '<em><b>System</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITALSIGNS_CODEABLE_CONCEPT1_CODING1__SYSTEM = DataTypesPackage.CODING__SYSTEM;

	/**
	 * The feature id for the '<em><b>Version</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITALSIGNS_CODEABLE_CONCEPT1_CODING1__VERSION = DataTypesPackage.CODING__VERSION;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITALSIGNS_CODEABLE_CONCEPT1_CODING1__CODE = DataTypesPackage.CODING__CODE;

	/**
	 * The feature id for the '<em><b>Display</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITALSIGNS_CODEABLE_CONCEPT1_CODING1__DISPLAY = DataTypesPackage.CODING__DISPLAY;

	/**
	 * The feature id for the '<em><b>User Selected</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITALSIGNS_CODEABLE_CONCEPT1_CODING1__USER_SELECTED = DataTypesPackage.CODING__USER_SELECTED;

	/**
	 * The number of structural features of the '<em>Vitalsigns Codeable Concept1 Coding1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITALSIGNS_CODEABLE_CONCEPT1_CODING1_FEATURE_COUNT = DataTypesPackage.CODING_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Vitalsigns Codeable Concept1 Coding1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITALSIGNS_CODEABLE_CONCEPT1_CODING1_OPERATION_COUNT = DataTypesPackage.CODING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fhiRCore.profiles.impl.VitalsignsComponent1Impl <em>Vitalsigns Component1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.profiles.impl.VitalsignsComponent1Impl
	 * @see fhiRCore.profiles.impl.ProfilesPackageImpl#getVitalsignsComponent1()
	 * @generated
	 */
	int VITALSIGNS_COMPONENT1 = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITALSIGNS_COMPONENT1__ID = ResourcesPackage.OBSERVATION_COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITALSIGNS_COMPONENT1__EXTENSION = ResourcesPackage.OBSERVATION_COMPONENT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Modifier Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITALSIGNS_COMPONENT1__MODIFIER_EXTENSION = ResourcesPackage.OBSERVATION_COMPONENT__MODIFIER_EXTENSION;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITALSIGNS_COMPONENT1__CODE = ResourcesPackage.OBSERVATION_COMPONENT__CODE;

	/**
	 * The feature id for the '<em><b>Valuex</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITALSIGNS_COMPONENT1__VALUEX = ResourcesPackage.OBSERVATION_COMPONENT__VALUEX;

	/**
	 * The feature id for the '<em><b>Data Absent Reason</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITALSIGNS_COMPONENT1__DATA_ABSENT_REASON = ResourcesPackage.OBSERVATION_COMPONENT__DATA_ABSENT_REASON;

	/**
	 * The feature id for the '<em><b>Interpretation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITALSIGNS_COMPONENT1__INTERPRETATION = ResourcesPackage.OBSERVATION_COMPONENT__INTERPRETATION;

	/**
	 * The feature id for the '<em><b>Reference Range</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITALSIGNS_COMPONENT1__REFERENCE_RANGE = ResourcesPackage.OBSERVATION_COMPONENT__REFERENCE_RANGE;

	/**
	 * The number of structural features of the '<em>Vitalsigns Component1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITALSIGNS_COMPONENT1_FEATURE_COUNT = ResourcesPackage.OBSERVATION_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Vitalsigns Component1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITALSIGNS_COMPONENT1_OPERATION_COUNT = ResourcesPackage.OBSERVATION_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fhiRCore.profiles.impl.BmiCodeableConcept1Impl <em>Bmi Codeable Concept1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.profiles.impl.BmiCodeableConcept1Impl
	 * @see fhiRCore.profiles.impl.ProfilesPackageImpl#getBmiCodeableConcept1()
	 * @generated
	 */
	int BMI_CODEABLE_CONCEPT1 = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BMI_CODEABLE_CONCEPT1__ID = DataTypesPackage.CODEABLE_CONCEPT__ID;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BMI_CODEABLE_CONCEPT1__EXTENSION = DataTypesPackage.CODEABLE_CONCEPT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Coding</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BMI_CODEABLE_CONCEPT1__CODING = DataTypesPackage.CODEABLE_CONCEPT__CODING;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BMI_CODEABLE_CONCEPT1__TEXT = DataTypesPackage.CODEABLE_CONCEPT__TEXT;

	/**
	 * The feature id for the '<em><b>Bmi Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BMI_CODEABLE_CONCEPT1__BMI_CODE = DataTypesPackage.CODEABLE_CONCEPT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Bmi Codeable Concept1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BMI_CODEABLE_CONCEPT1_FEATURE_COUNT = DataTypesPackage.CODEABLE_CONCEPT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Bmi Codeable Concept1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BMI_CODEABLE_CONCEPT1_OPERATION_COUNT = DataTypesPackage.CODEABLE_CONCEPT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fhiRCore.profiles.impl.BmiCodeableConcept1Coding1Impl <em>Bmi Codeable Concept1 Coding1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.profiles.impl.BmiCodeableConcept1Coding1Impl
	 * @see fhiRCore.profiles.impl.ProfilesPackageImpl#getBmiCodeableConcept1Coding1()
	 * @generated
	 */
	int BMI_CODEABLE_CONCEPT1_CODING1 = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BMI_CODEABLE_CONCEPT1_CODING1__ID = DataTypesPackage.CODING__ID;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BMI_CODEABLE_CONCEPT1_CODING1__EXTENSION = DataTypesPackage.CODING__EXTENSION;

	/**
	 * The feature id for the '<em><b>System</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BMI_CODEABLE_CONCEPT1_CODING1__SYSTEM = DataTypesPackage.CODING__SYSTEM;

	/**
	 * The feature id for the '<em><b>Version</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BMI_CODEABLE_CONCEPT1_CODING1__VERSION = DataTypesPackage.CODING__VERSION;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BMI_CODEABLE_CONCEPT1_CODING1__CODE = DataTypesPackage.CODING__CODE;

	/**
	 * The feature id for the '<em><b>Display</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BMI_CODEABLE_CONCEPT1_CODING1__DISPLAY = DataTypesPackage.CODING__DISPLAY;

	/**
	 * The feature id for the '<em><b>User Selected</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BMI_CODEABLE_CONCEPT1_CODING1__USER_SELECTED = DataTypesPackage.CODING__USER_SELECTED;

	/**
	 * The number of structural features of the '<em>Bmi Codeable Concept1 Coding1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BMI_CODEABLE_CONCEPT1_CODING1_FEATURE_COUNT = DataTypesPackage.CODING_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Bmi Codeable Concept1 Coding1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BMI_CODEABLE_CONCEPT1_CODING1_OPERATION_COUNT = DataTypesPackage.CODING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fhiRCore.profiles.impl.BmiQuantity1Impl <em>Bmi Quantity1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.profiles.impl.BmiQuantity1Impl
	 * @see fhiRCore.profiles.impl.ProfilesPackageImpl#getBmiQuantity1()
	 * @generated
	 */
	int BMI_QUANTITY1 = 9;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BMI_QUANTITY1__ID = DataTypesPackage.QUANTITY__ID;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BMI_QUANTITY1__EXTENSION = DataTypesPackage.QUANTITY__EXTENSION;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BMI_QUANTITY1__VALUE = DataTypesPackage.QUANTITY__VALUE;

	/**
	 * The feature id for the '<em><b>Comparator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BMI_QUANTITY1__COMPARATOR = DataTypesPackage.QUANTITY__COMPARATOR;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BMI_QUANTITY1__UNIT = DataTypesPackage.QUANTITY__UNIT;

	/**
	 * The feature id for the '<em><b>System</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BMI_QUANTITY1__SYSTEM = DataTypesPackage.QUANTITY__SYSTEM;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BMI_QUANTITY1__CODE = DataTypesPackage.QUANTITY__CODE;

	/**
	 * The number of structural features of the '<em>Bmi Quantity1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BMI_QUANTITY1_FEATURE_COUNT = DataTypesPackage.QUANTITY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Bmi Quantity1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BMI_QUANTITY1_OPERATION_COUNT = DataTypesPackage.QUANTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fhiRCore.profiles.impl.DevicemetricobservationImpl <em>Devicemetricobservation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.profiles.impl.DevicemetricobservationImpl
	 * @see fhiRCore.profiles.impl.ProfilesPackageImpl#getDevicemetricobservation()
	 * @generated
	 */
	int DEVICEMETRICOBSERVATION = 10;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICEMETRICOBSERVATION__ID = ResourcesPackage.OBSERVATION__ID;

	/**
	 * The feature id for the '<em><b>Meta</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICEMETRICOBSERVATION__META = ResourcesPackage.OBSERVATION__META;

	/**
	 * The feature id for the '<em><b>Implicit Rules</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICEMETRICOBSERVATION__IMPLICIT_RULES = ResourcesPackage.OBSERVATION__IMPLICIT_RULES;

	/**
	 * The feature id for the '<em><b>Language</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICEMETRICOBSERVATION__LANGUAGE = ResourcesPackage.OBSERVATION__LANGUAGE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICEMETRICOBSERVATION__TEXT = ResourcesPackage.OBSERVATION__TEXT;

	/**
	 * The feature id for the '<em><b>Contained</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICEMETRICOBSERVATION__CONTAINED = ResourcesPackage.OBSERVATION__CONTAINED;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICEMETRICOBSERVATION__EXTENSION = ResourcesPackage.OBSERVATION__EXTENSION;

	/**
	 * The feature id for the '<em><b>Modifier Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICEMETRICOBSERVATION__MODIFIER_EXTENSION = ResourcesPackage.OBSERVATION__MODIFIER_EXTENSION;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICEMETRICOBSERVATION__IDENTIFIER = ResourcesPackage.OBSERVATION__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Based On</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICEMETRICOBSERVATION__BASED_ON = ResourcesPackage.OBSERVATION__BASED_ON;

	/**
	 * The feature id for the '<em><b>Part Of</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICEMETRICOBSERVATION__PART_OF = ResourcesPackage.OBSERVATION__PART_OF;

	/**
	 * The feature id for the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICEMETRICOBSERVATION__STATUS = ResourcesPackage.OBSERVATION__STATUS;

	/**
	 * The feature id for the '<em><b>Category</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICEMETRICOBSERVATION__CATEGORY = ResourcesPackage.OBSERVATION__CATEGORY;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICEMETRICOBSERVATION__CODE = ResourcesPackage.OBSERVATION__CODE;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICEMETRICOBSERVATION__SUBJECT = ResourcesPackage.OBSERVATION__SUBJECT;

	/**
	 * The feature id for the '<em><b>Focus</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICEMETRICOBSERVATION__FOCUS = ResourcesPackage.OBSERVATION__FOCUS;

	/**
	 * The feature id for the '<em><b>Encounter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICEMETRICOBSERVATION__ENCOUNTER = ResourcesPackage.OBSERVATION__ENCOUNTER;

	/**
	 * The feature id for the '<em><b>Effectivex</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICEMETRICOBSERVATION__EFFECTIVEX = ResourcesPackage.OBSERVATION__EFFECTIVEX;

	/**
	 * The feature id for the '<em><b>Issued</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICEMETRICOBSERVATION__ISSUED = ResourcesPackage.OBSERVATION__ISSUED;

	/**
	 * The feature id for the '<em><b>Performer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICEMETRICOBSERVATION__PERFORMER = ResourcesPackage.OBSERVATION__PERFORMER;

	/**
	 * The feature id for the '<em><b>Valuex</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICEMETRICOBSERVATION__VALUEX = ResourcesPackage.OBSERVATION__VALUEX;

	/**
	 * The feature id for the '<em><b>Data Absent Reason</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICEMETRICOBSERVATION__DATA_ABSENT_REASON = ResourcesPackage.OBSERVATION__DATA_ABSENT_REASON;

	/**
	 * The feature id for the '<em><b>Interpretation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICEMETRICOBSERVATION__INTERPRETATION = ResourcesPackage.OBSERVATION__INTERPRETATION;

	/**
	 * The feature id for the '<em><b>Note</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICEMETRICOBSERVATION__NOTE = ResourcesPackage.OBSERVATION__NOTE;

	/**
	 * The feature id for the '<em><b>Body Site</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICEMETRICOBSERVATION__BODY_SITE = ResourcesPackage.OBSERVATION__BODY_SITE;

	/**
	 * The feature id for the '<em><b>Method</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICEMETRICOBSERVATION__METHOD = ResourcesPackage.OBSERVATION__METHOD;

	/**
	 * The feature id for the '<em><b>Specimen</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICEMETRICOBSERVATION__SPECIMEN = ResourcesPackage.OBSERVATION__SPECIMEN;

	/**
	 * The feature id for the '<em><b>Device</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICEMETRICOBSERVATION__DEVICE = ResourcesPackage.OBSERVATION__DEVICE;

	/**
	 * The feature id for the '<em><b>Has Member</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICEMETRICOBSERVATION__HAS_MEMBER = ResourcesPackage.OBSERVATION__HAS_MEMBER;

	/**
	 * The feature id for the '<em><b>Derived From</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICEMETRICOBSERVATION__DERIVED_FROM = ResourcesPackage.OBSERVATION__DERIVED_FROM;

	/**
	 * The feature id for the '<em><b>Component</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICEMETRICOBSERVATION__COMPONENT = ResourcesPackage.OBSERVATION__COMPONENT;

	/**
	 * The feature id for the '<em><b>Reference Range</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICEMETRICOBSERVATION__REFERENCE_RANGE = ResourcesPackage.OBSERVATION__REFERENCE_RANGE;

	/**
	 * The feature id for the '<em><b>Effective Date Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICEMETRICOBSERVATION__EFFECTIVE_DATE_TIME = ResourcesPackage.OBSERVATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Devicemetricobservation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICEMETRICOBSERVATION_FEATURE_COUNT = ResourcesPackage.OBSERVATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Devicemetricobservation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICEMETRICOBSERVATION_OPERATION_COUNT = ResourcesPackage.OBSERVATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fhiRCore.profiles.impl.CdshooksserviceplandefinitionImpl <em>Cdshooksserviceplandefinition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.profiles.impl.CdshooksserviceplandefinitionImpl
	 * @see fhiRCore.profiles.impl.ProfilesPackageImpl#getCdshooksserviceplandefinition()
	 * @generated
	 */
	int CDSHOOKSSERVICEPLANDEFINITION = 11;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDSHOOKSSERVICEPLANDEFINITION__ID = ResourcesPackage.PLAN_DEFINITION__ID;

	/**
	 * The feature id for the '<em><b>Meta</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDSHOOKSSERVICEPLANDEFINITION__META = ResourcesPackage.PLAN_DEFINITION__META;

	/**
	 * The feature id for the '<em><b>Implicit Rules</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDSHOOKSSERVICEPLANDEFINITION__IMPLICIT_RULES = ResourcesPackage.PLAN_DEFINITION__IMPLICIT_RULES;

	/**
	 * The feature id for the '<em><b>Language</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDSHOOKSSERVICEPLANDEFINITION__LANGUAGE = ResourcesPackage.PLAN_DEFINITION__LANGUAGE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDSHOOKSSERVICEPLANDEFINITION__TEXT = ResourcesPackage.PLAN_DEFINITION__TEXT;

	/**
	 * The feature id for the '<em><b>Contained</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDSHOOKSSERVICEPLANDEFINITION__CONTAINED = ResourcesPackage.PLAN_DEFINITION__CONTAINED;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDSHOOKSSERVICEPLANDEFINITION__EXTENSION = ResourcesPackage.PLAN_DEFINITION__EXTENSION;

	/**
	 * The feature id for the '<em><b>Modifier Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDSHOOKSSERVICEPLANDEFINITION__MODIFIER_EXTENSION = ResourcesPackage.PLAN_DEFINITION__MODIFIER_EXTENSION;

	/**
	 * The feature id for the '<em><b>Url</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDSHOOKSSERVICEPLANDEFINITION__URL = ResourcesPackage.PLAN_DEFINITION__URL;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDSHOOKSSERVICEPLANDEFINITION__IDENTIFIER = ResourcesPackage.PLAN_DEFINITION__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Version</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDSHOOKSSERVICEPLANDEFINITION__VERSION = ResourcesPackage.PLAN_DEFINITION__VERSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDSHOOKSSERVICEPLANDEFINITION__NAME = ResourcesPackage.PLAN_DEFINITION__NAME;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDSHOOKSSERVICEPLANDEFINITION__TITLE = ResourcesPackage.PLAN_DEFINITION__TITLE;

	/**
	 * The feature id for the '<em><b>Subtitle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDSHOOKSSERVICEPLANDEFINITION__SUBTITLE = ResourcesPackage.PLAN_DEFINITION__SUBTITLE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDSHOOKSSERVICEPLANDEFINITION__TYPE = ResourcesPackage.PLAN_DEFINITION__TYPE;

	/**
	 * The feature id for the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDSHOOKSSERVICEPLANDEFINITION__STATUS = ResourcesPackage.PLAN_DEFINITION__STATUS;

	/**
	 * The feature id for the '<em><b>Experimental</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDSHOOKSSERVICEPLANDEFINITION__EXPERIMENTAL = ResourcesPackage.PLAN_DEFINITION__EXPERIMENTAL;

	/**
	 * The feature id for the '<em><b>Subjectx</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDSHOOKSSERVICEPLANDEFINITION__SUBJECTX = ResourcesPackage.PLAN_DEFINITION__SUBJECTX;

	/**
	 * The feature id for the '<em><b>Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDSHOOKSSERVICEPLANDEFINITION__DATE = ResourcesPackage.PLAN_DEFINITION__DATE;

	/**
	 * The feature id for the '<em><b>Publisher</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDSHOOKSSERVICEPLANDEFINITION__PUBLISHER = ResourcesPackage.PLAN_DEFINITION__PUBLISHER;

	/**
	 * The feature id for the '<em><b>Contact</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDSHOOKSSERVICEPLANDEFINITION__CONTACT = ResourcesPackage.PLAN_DEFINITION__CONTACT;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDSHOOKSSERVICEPLANDEFINITION__DESCRIPTION = ResourcesPackage.PLAN_DEFINITION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Use Context</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDSHOOKSSERVICEPLANDEFINITION__USE_CONTEXT = ResourcesPackage.PLAN_DEFINITION__USE_CONTEXT;

	/**
	 * The feature id for the '<em><b>Jurisdiction</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDSHOOKSSERVICEPLANDEFINITION__JURISDICTION = ResourcesPackage.PLAN_DEFINITION__JURISDICTION;

	/**
	 * The feature id for the '<em><b>Purpose</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDSHOOKSSERVICEPLANDEFINITION__PURPOSE = ResourcesPackage.PLAN_DEFINITION__PURPOSE;

	/**
	 * The feature id for the '<em><b>Usage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDSHOOKSSERVICEPLANDEFINITION__USAGE = ResourcesPackage.PLAN_DEFINITION__USAGE;

	/**
	 * The feature id for the '<em><b>Copyright</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDSHOOKSSERVICEPLANDEFINITION__COPYRIGHT = ResourcesPackage.PLAN_DEFINITION__COPYRIGHT;

	/**
	 * The feature id for the '<em><b>Approval Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDSHOOKSSERVICEPLANDEFINITION__APPROVAL_DATE = ResourcesPackage.PLAN_DEFINITION__APPROVAL_DATE;

	/**
	 * The feature id for the '<em><b>Last Review Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDSHOOKSSERVICEPLANDEFINITION__LAST_REVIEW_DATE = ResourcesPackage.PLAN_DEFINITION__LAST_REVIEW_DATE;

	/**
	 * The feature id for the '<em><b>Effective Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDSHOOKSSERVICEPLANDEFINITION__EFFECTIVE_PERIOD = ResourcesPackage.PLAN_DEFINITION__EFFECTIVE_PERIOD;

	/**
	 * The feature id for the '<em><b>Topic</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDSHOOKSSERVICEPLANDEFINITION__TOPIC = ResourcesPackage.PLAN_DEFINITION__TOPIC;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDSHOOKSSERVICEPLANDEFINITION__AUTHOR = ResourcesPackage.PLAN_DEFINITION__AUTHOR;

	/**
	 * The feature id for the '<em><b>Editor</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDSHOOKSSERVICEPLANDEFINITION__EDITOR = ResourcesPackage.PLAN_DEFINITION__EDITOR;

	/**
	 * The feature id for the '<em><b>Reviewer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDSHOOKSSERVICEPLANDEFINITION__REVIEWER = ResourcesPackage.PLAN_DEFINITION__REVIEWER;

	/**
	 * The feature id for the '<em><b>Endorser</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDSHOOKSSERVICEPLANDEFINITION__ENDORSER = ResourcesPackage.PLAN_DEFINITION__ENDORSER;

	/**
	 * The feature id for the '<em><b>Related Artifact</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDSHOOKSSERVICEPLANDEFINITION__RELATED_ARTIFACT = ResourcesPackage.PLAN_DEFINITION__RELATED_ARTIFACT;

	/**
	 * The feature id for the '<em><b>Library</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDSHOOKSSERVICEPLANDEFINITION__LIBRARY = ResourcesPackage.PLAN_DEFINITION__LIBRARY;

	/**
	 * The feature id for the '<em><b>Goal</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDSHOOKSSERVICEPLANDEFINITION__GOAL = ResourcesPackage.PLAN_DEFINITION__GOAL;

	/**
	 * The feature id for the '<em><b>Action</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDSHOOKSSERVICEPLANDEFINITION__ACTION = ResourcesPackage.PLAN_DEFINITION__ACTION;

	/**
	 * The number of structural features of the '<em>Cdshooksserviceplandefinition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDSHOOKSSERVICEPLANDEFINITION_FEATURE_COUNT = ResourcesPackage.PLAN_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Cdshooksserviceplandefinition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDSHOOKSSERVICEPLANDEFINITION_OPERATION_COUNT = ResourcesPackage.PLAN_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fhiRCore.profiles.impl.CdshooksserviceplandefinitionAction1Impl <em>Cdshooksserviceplandefinition Action1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.profiles.impl.CdshooksserviceplandefinitionAction1Impl
	 * @see fhiRCore.profiles.impl.ProfilesPackageImpl#getCdshooksserviceplandefinitionAction1()
	 * @generated
	 */
	int CDSHOOKSSERVICEPLANDEFINITION_ACTION1 = 12;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDSHOOKSSERVICEPLANDEFINITION_ACTION1__ID = ResourcesPackage.PLAN_DEFINITION_ACTION__ID;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDSHOOKSSERVICEPLANDEFINITION_ACTION1__EXTENSION = ResourcesPackage.PLAN_DEFINITION_ACTION__EXTENSION;

	/**
	 * The feature id for the '<em><b>Modifier Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDSHOOKSSERVICEPLANDEFINITION_ACTION1__MODIFIER_EXTENSION = ResourcesPackage.PLAN_DEFINITION_ACTION__MODIFIER_EXTENSION;

	/**
	 * The feature id for the '<em><b>Prefix</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDSHOOKSSERVICEPLANDEFINITION_ACTION1__PREFIX = ResourcesPackage.PLAN_DEFINITION_ACTION__PREFIX;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDSHOOKSSERVICEPLANDEFINITION_ACTION1__TITLE = ResourcesPackage.PLAN_DEFINITION_ACTION__TITLE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDSHOOKSSERVICEPLANDEFINITION_ACTION1__DESCRIPTION = ResourcesPackage.PLAN_DEFINITION_ACTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Text Equivalent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDSHOOKSSERVICEPLANDEFINITION_ACTION1__TEXT_EQUIVALENT = ResourcesPackage.PLAN_DEFINITION_ACTION__TEXT_EQUIVALENT;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDSHOOKSSERVICEPLANDEFINITION_ACTION1__PRIORITY = ResourcesPackage.PLAN_DEFINITION_ACTION__PRIORITY;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDSHOOKSSERVICEPLANDEFINITION_ACTION1__CODE = ResourcesPackage.PLAN_DEFINITION_ACTION__CODE;

	/**
	 * The feature id for the '<em><b>Reason</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDSHOOKSSERVICEPLANDEFINITION_ACTION1__REASON = ResourcesPackage.PLAN_DEFINITION_ACTION__REASON;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDSHOOKSSERVICEPLANDEFINITION_ACTION1__DOCUMENTATION = ResourcesPackage.PLAN_DEFINITION_ACTION__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Goal Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDSHOOKSSERVICEPLANDEFINITION_ACTION1__GOAL_ID = ResourcesPackage.PLAN_DEFINITION_ACTION__GOAL_ID;

	/**
	 * The feature id for the '<em><b>Subjectx</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDSHOOKSSERVICEPLANDEFINITION_ACTION1__SUBJECTX = ResourcesPackage.PLAN_DEFINITION_ACTION__SUBJECTX;

	/**
	 * The feature id for the '<em><b>Trigger</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDSHOOKSSERVICEPLANDEFINITION_ACTION1__TRIGGER = ResourcesPackage.PLAN_DEFINITION_ACTION__TRIGGER;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDSHOOKSSERVICEPLANDEFINITION_ACTION1__CONDITION = ResourcesPackage.PLAN_DEFINITION_ACTION__CONDITION;

	/**
	 * The feature id for the '<em><b>Input</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDSHOOKSSERVICEPLANDEFINITION_ACTION1__INPUT = ResourcesPackage.PLAN_DEFINITION_ACTION__INPUT;

	/**
	 * The feature id for the '<em><b>Output</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDSHOOKSSERVICEPLANDEFINITION_ACTION1__OUTPUT = ResourcesPackage.PLAN_DEFINITION_ACTION__OUTPUT;

	/**
	 * The feature id for the '<em><b>Related Action</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDSHOOKSSERVICEPLANDEFINITION_ACTION1__RELATED_ACTION = ResourcesPackage.PLAN_DEFINITION_ACTION__RELATED_ACTION;

	/**
	 * The feature id for the '<em><b>Timingx</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDSHOOKSSERVICEPLANDEFINITION_ACTION1__TIMINGX = ResourcesPackage.PLAN_DEFINITION_ACTION__TIMINGX;

	/**
	 * The feature id for the '<em><b>Participant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDSHOOKSSERVICEPLANDEFINITION_ACTION1__PARTICIPANT = ResourcesPackage.PLAN_DEFINITION_ACTION__PARTICIPANT;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDSHOOKSSERVICEPLANDEFINITION_ACTION1__TYPE = ResourcesPackage.PLAN_DEFINITION_ACTION__TYPE;

	/**
	 * The feature id for the '<em><b>Grouping Behavior</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDSHOOKSSERVICEPLANDEFINITION_ACTION1__GROUPING_BEHAVIOR = ResourcesPackage.PLAN_DEFINITION_ACTION__GROUPING_BEHAVIOR;

	/**
	 * The feature id for the '<em><b>Selection Behavior</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDSHOOKSSERVICEPLANDEFINITION_ACTION1__SELECTION_BEHAVIOR = ResourcesPackage.PLAN_DEFINITION_ACTION__SELECTION_BEHAVIOR;

	/**
	 * The feature id for the '<em><b>Required Behavior</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDSHOOKSSERVICEPLANDEFINITION_ACTION1__REQUIRED_BEHAVIOR = ResourcesPackage.PLAN_DEFINITION_ACTION__REQUIRED_BEHAVIOR;

	/**
	 * The feature id for the '<em><b>Precheck Behavior</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDSHOOKSSERVICEPLANDEFINITION_ACTION1__PRECHECK_BEHAVIOR = ResourcesPackage.PLAN_DEFINITION_ACTION__PRECHECK_BEHAVIOR;

	/**
	 * The feature id for the '<em><b>Cardinality Behavior</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDSHOOKSSERVICEPLANDEFINITION_ACTION1__CARDINALITY_BEHAVIOR = ResourcesPackage.PLAN_DEFINITION_ACTION__CARDINALITY_BEHAVIOR;

	/**
	 * The feature id for the '<em><b>Definition Canonical</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDSHOOKSSERVICEPLANDEFINITION_ACTION1__DEFINITION_CANONICAL = ResourcesPackage.PLAN_DEFINITION_ACTION__DEFINITION_CANONICAL;

	/**
	 * The feature id for the '<em><b>Transform</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDSHOOKSSERVICEPLANDEFINITION_ACTION1__TRANSFORM = ResourcesPackage.PLAN_DEFINITION_ACTION__TRANSFORM;

	/**
	 * The feature id for the '<em><b>Dynamic Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDSHOOKSSERVICEPLANDEFINITION_ACTION1__DYNAMIC_VALUE = ResourcesPackage.PLAN_DEFINITION_ACTION__DYNAMIC_VALUE;

	/**
	 * The feature id for the '<em><b>Action</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDSHOOKSSERVICEPLANDEFINITION_ACTION1__ACTION = ResourcesPackage.PLAN_DEFINITION_ACTION__ACTION;

	/**
	 * The feature id for the '<em><b>Definitionx</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDSHOOKSSERVICEPLANDEFINITION_ACTION1__DEFINITIONX = ResourcesPackage.PLAN_DEFINITION_ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Cdshooksserviceplandefinition Action1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDSHOOKSSERVICEPLANDEFINITION_ACTION1_FEATURE_COUNT = ResourcesPackage.PLAN_DEFINITION_ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Cdshooksserviceplandefinition Action1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDSHOOKSSERVICEPLANDEFINITION_ACTION1_OPERATION_COUNT = ResourcesPackage.PLAN_DEFINITION_ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fhiRCore.profiles.impl.CqfquestionnaireImpl <em>Cqfquestionnaire</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.profiles.impl.CqfquestionnaireImpl
	 * @see fhiRCore.profiles.impl.ProfilesPackageImpl#getCqfquestionnaire()
	 * @generated
	 */
	int CQFQUESTIONNAIRE = 13;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CQFQUESTIONNAIRE__ID = ResourcesPackage.QUESTIONNAIRE__ID;

	/**
	 * The feature id for the '<em><b>Meta</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CQFQUESTIONNAIRE__META = ResourcesPackage.QUESTIONNAIRE__META;

	/**
	 * The feature id for the '<em><b>Implicit Rules</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CQFQUESTIONNAIRE__IMPLICIT_RULES = ResourcesPackage.QUESTIONNAIRE__IMPLICIT_RULES;

	/**
	 * The feature id for the '<em><b>Language</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CQFQUESTIONNAIRE__LANGUAGE = ResourcesPackage.QUESTIONNAIRE__LANGUAGE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CQFQUESTIONNAIRE__TEXT = ResourcesPackage.QUESTIONNAIRE__TEXT;

	/**
	 * The feature id for the '<em><b>Contained</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CQFQUESTIONNAIRE__CONTAINED = ResourcesPackage.QUESTIONNAIRE__CONTAINED;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CQFQUESTIONNAIRE__EXTENSION = ResourcesPackage.QUESTIONNAIRE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Modifier Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CQFQUESTIONNAIRE__MODIFIER_EXTENSION = ResourcesPackage.QUESTIONNAIRE__MODIFIER_EXTENSION;

	/**
	 * The feature id for the '<em><b>Url</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CQFQUESTIONNAIRE__URL = ResourcesPackage.QUESTIONNAIRE__URL;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CQFQUESTIONNAIRE__IDENTIFIER = ResourcesPackage.QUESTIONNAIRE__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Version</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CQFQUESTIONNAIRE__VERSION = ResourcesPackage.QUESTIONNAIRE__VERSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CQFQUESTIONNAIRE__NAME = ResourcesPackage.QUESTIONNAIRE__NAME;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CQFQUESTIONNAIRE__TITLE = ResourcesPackage.QUESTIONNAIRE__TITLE;

	/**
	 * The feature id for the '<em><b>Derived From</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CQFQUESTIONNAIRE__DERIVED_FROM = ResourcesPackage.QUESTIONNAIRE__DERIVED_FROM;

	/**
	 * The feature id for the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CQFQUESTIONNAIRE__STATUS = ResourcesPackage.QUESTIONNAIRE__STATUS;

	/**
	 * The feature id for the '<em><b>Experimental</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CQFQUESTIONNAIRE__EXPERIMENTAL = ResourcesPackage.QUESTIONNAIRE__EXPERIMENTAL;

	/**
	 * The feature id for the '<em><b>Subject Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CQFQUESTIONNAIRE__SUBJECT_TYPE = ResourcesPackage.QUESTIONNAIRE__SUBJECT_TYPE;

	/**
	 * The feature id for the '<em><b>Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CQFQUESTIONNAIRE__DATE = ResourcesPackage.QUESTIONNAIRE__DATE;

	/**
	 * The feature id for the '<em><b>Publisher</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CQFQUESTIONNAIRE__PUBLISHER = ResourcesPackage.QUESTIONNAIRE__PUBLISHER;

	/**
	 * The feature id for the '<em><b>Contact</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CQFQUESTIONNAIRE__CONTACT = ResourcesPackage.QUESTIONNAIRE__CONTACT;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CQFQUESTIONNAIRE__DESCRIPTION = ResourcesPackage.QUESTIONNAIRE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Use Context</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CQFQUESTIONNAIRE__USE_CONTEXT = ResourcesPackage.QUESTIONNAIRE__USE_CONTEXT;

	/**
	 * The feature id for the '<em><b>Jurisdiction</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CQFQUESTIONNAIRE__JURISDICTION = ResourcesPackage.QUESTIONNAIRE__JURISDICTION;

	/**
	 * The feature id for the '<em><b>Purpose</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CQFQUESTIONNAIRE__PURPOSE = ResourcesPackage.QUESTIONNAIRE__PURPOSE;

	/**
	 * The feature id for the '<em><b>Copyright</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CQFQUESTIONNAIRE__COPYRIGHT = ResourcesPackage.QUESTIONNAIRE__COPYRIGHT;

	/**
	 * The feature id for the '<em><b>Approval Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CQFQUESTIONNAIRE__APPROVAL_DATE = ResourcesPackage.QUESTIONNAIRE__APPROVAL_DATE;

	/**
	 * The feature id for the '<em><b>Last Review Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CQFQUESTIONNAIRE__LAST_REVIEW_DATE = ResourcesPackage.QUESTIONNAIRE__LAST_REVIEW_DATE;

	/**
	 * The feature id for the '<em><b>Effective Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CQFQUESTIONNAIRE__EFFECTIVE_PERIOD = ResourcesPackage.QUESTIONNAIRE__EFFECTIVE_PERIOD;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CQFQUESTIONNAIRE__CODE = ResourcesPackage.QUESTIONNAIRE__CODE;

	/**
	 * The feature id for the '<em><b>Item</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CQFQUESTIONNAIRE__ITEM = ResourcesPackage.QUESTIONNAIRE__ITEM;

	/**
	 * The number of structural features of the '<em>Cqfquestionnaire</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CQFQUESTIONNAIRE_FEATURE_COUNT = ResourcesPackage.QUESTIONNAIRE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Cqfquestionnaire</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CQFQUESTIONNAIRE_OPERATION_COUNT = ResourcesPackage.QUESTIONNAIRE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fhiRCore.profiles.impl.ComputableplandefinitionImpl <em>Computableplandefinition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.profiles.impl.ComputableplandefinitionImpl
	 * @see fhiRCore.profiles.impl.ProfilesPackageImpl#getComputableplandefinition()
	 * @generated
	 */
	int COMPUTABLEPLANDEFINITION = 14;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTABLEPLANDEFINITION__ID = ResourcesPackage.PLAN_DEFINITION__ID;

	/**
	 * The feature id for the '<em><b>Meta</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTABLEPLANDEFINITION__META = ResourcesPackage.PLAN_DEFINITION__META;

	/**
	 * The feature id for the '<em><b>Implicit Rules</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTABLEPLANDEFINITION__IMPLICIT_RULES = ResourcesPackage.PLAN_DEFINITION__IMPLICIT_RULES;

	/**
	 * The feature id for the '<em><b>Language</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTABLEPLANDEFINITION__LANGUAGE = ResourcesPackage.PLAN_DEFINITION__LANGUAGE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTABLEPLANDEFINITION__TEXT = ResourcesPackage.PLAN_DEFINITION__TEXT;

	/**
	 * The feature id for the '<em><b>Contained</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTABLEPLANDEFINITION__CONTAINED = ResourcesPackage.PLAN_DEFINITION__CONTAINED;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTABLEPLANDEFINITION__EXTENSION = ResourcesPackage.PLAN_DEFINITION__EXTENSION;

	/**
	 * The feature id for the '<em><b>Modifier Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTABLEPLANDEFINITION__MODIFIER_EXTENSION = ResourcesPackage.PLAN_DEFINITION__MODIFIER_EXTENSION;

	/**
	 * The feature id for the '<em><b>Url</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTABLEPLANDEFINITION__URL = ResourcesPackage.PLAN_DEFINITION__URL;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTABLEPLANDEFINITION__IDENTIFIER = ResourcesPackage.PLAN_DEFINITION__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Version</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTABLEPLANDEFINITION__VERSION = ResourcesPackage.PLAN_DEFINITION__VERSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTABLEPLANDEFINITION__NAME = ResourcesPackage.PLAN_DEFINITION__NAME;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTABLEPLANDEFINITION__TITLE = ResourcesPackage.PLAN_DEFINITION__TITLE;

	/**
	 * The feature id for the '<em><b>Subtitle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTABLEPLANDEFINITION__SUBTITLE = ResourcesPackage.PLAN_DEFINITION__SUBTITLE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTABLEPLANDEFINITION__TYPE = ResourcesPackage.PLAN_DEFINITION__TYPE;

	/**
	 * The feature id for the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTABLEPLANDEFINITION__STATUS = ResourcesPackage.PLAN_DEFINITION__STATUS;

	/**
	 * The feature id for the '<em><b>Experimental</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTABLEPLANDEFINITION__EXPERIMENTAL = ResourcesPackage.PLAN_DEFINITION__EXPERIMENTAL;

	/**
	 * The feature id for the '<em><b>Subjectx</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTABLEPLANDEFINITION__SUBJECTX = ResourcesPackage.PLAN_DEFINITION__SUBJECTX;

	/**
	 * The feature id for the '<em><b>Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTABLEPLANDEFINITION__DATE = ResourcesPackage.PLAN_DEFINITION__DATE;

	/**
	 * The feature id for the '<em><b>Publisher</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTABLEPLANDEFINITION__PUBLISHER = ResourcesPackage.PLAN_DEFINITION__PUBLISHER;

	/**
	 * The feature id for the '<em><b>Contact</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTABLEPLANDEFINITION__CONTACT = ResourcesPackage.PLAN_DEFINITION__CONTACT;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTABLEPLANDEFINITION__DESCRIPTION = ResourcesPackage.PLAN_DEFINITION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Use Context</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTABLEPLANDEFINITION__USE_CONTEXT = ResourcesPackage.PLAN_DEFINITION__USE_CONTEXT;

	/**
	 * The feature id for the '<em><b>Jurisdiction</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTABLEPLANDEFINITION__JURISDICTION = ResourcesPackage.PLAN_DEFINITION__JURISDICTION;

	/**
	 * The feature id for the '<em><b>Purpose</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTABLEPLANDEFINITION__PURPOSE = ResourcesPackage.PLAN_DEFINITION__PURPOSE;

	/**
	 * The feature id for the '<em><b>Usage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTABLEPLANDEFINITION__USAGE = ResourcesPackage.PLAN_DEFINITION__USAGE;

	/**
	 * The feature id for the '<em><b>Copyright</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTABLEPLANDEFINITION__COPYRIGHT = ResourcesPackage.PLAN_DEFINITION__COPYRIGHT;

	/**
	 * The feature id for the '<em><b>Approval Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTABLEPLANDEFINITION__APPROVAL_DATE = ResourcesPackage.PLAN_DEFINITION__APPROVAL_DATE;

	/**
	 * The feature id for the '<em><b>Last Review Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTABLEPLANDEFINITION__LAST_REVIEW_DATE = ResourcesPackage.PLAN_DEFINITION__LAST_REVIEW_DATE;

	/**
	 * The feature id for the '<em><b>Effective Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTABLEPLANDEFINITION__EFFECTIVE_PERIOD = ResourcesPackage.PLAN_DEFINITION__EFFECTIVE_PERIOD;

	/**
	 * The feature id for the '<em><b>Topic</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTABLEPLANDEFINITION__TOPIC = ResourcesPackage.PLAN_DEFINITION__TOPIC;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTABLEPLANDEFINITION__AUTHOR = ResourcesPackage.PLAN_DEFINITION__AUTHOR;

	/**
	 * The feature id for the '<em><b>Editor</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTABLEPLANDEFINITION__EDITOR = ResourcesPackage.PLAN_DEFINITION__EDITOR;

	/**
	 * The feature id for the '<em><b>Reviewer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTABLEPLANDEFINITION__REVIEWER = ResourcesPackage.PLAN_DEFINITION__REVIEWER;

	/**
	 * The feature id for the '<em><b>Endorser</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTABLEPLANDEFINITION__ENDORSER = ResourcesPackage.PLAN_DEFINITION__ENDORSER;

	/**
	 * The feature id for the '<em><b>Related Artifact</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTABLEPLANDEFINITION__RELATED_ARTIFACT = ResourcesPackage.PLAN_DEFINITION__RELATED_ARTIFACT;

	/**
	 * The feature id for the '<em><b>Library</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTABLEPLANDEFINITION__LIBRARY = ResourcesPackage.PLAN_DEFINITION__LIBRARY;

	/**
	 * The feature id for the '<em><b>Goal</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTABLEPLANDEFINITION__GOAL = ResourcesPackage.PLAN_DEFINITION__GOAL;

	/**
	 * The feature id for the '<em><b>Action</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTABLEPLANDEFINITION__ACTION = ResourcesPackage.PLAN_DEFINITION__ACTION;

	/**
	 * The number of structural features of the '<em>Computableplandefinition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTABLEPLANDEFINITION_FEATURE_COUNT = ResourcesPackage.PLAN_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Computableplandefinition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTABLEPLANDEFINITION_OPERATION_COUNT = ResourcesPackage.PLAN_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fhiRCore.profiles.impl.ShareablelibraryImpl <em>Shareablelibrary</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.profiles.impl.ShareablelibraryImpl
	 * @see fhiRCore.profiles.impl.ProfilesPackageImpl#getShareablelibrary()
	 * @generated
	 */
	int SHAREABLELIBRARY = 15;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAREABLELIBRARY__ID = ResourcesPackage.LIBRARY__ID;

	/**
	 * The feature id for the '<em><b>Meta</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAREABLELIBRARY__META = ResourcesPackage.LIBRARY__META;

	/**
	 * The feature id for the '<em><b>Implicit Rules</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAREABLELIBRARY__IMPLICIT_RULES = ResourcesPackage.LIBRARY__IMPLICIT_RULES;

	/**
	 * The feature id for the '<em><b>Language</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAREABLELIBRARY__LANGUAGE = ResourcesPackage.LIBRARY__LANGUAGE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAREABLELIBRARY__TEXT = ResourcesPackage.LIBRARY__TEXT;

	/**
	 * The feature id for the '<em><b>Contained</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAREABLELIBRARY__CONTAINED = ResourcesPackage.LIBRARY__CONTAINED;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAREABLELIBRARY__EXTENSION = ResourcesPackage.LIBRARY__EXTENSION;

	/**
	 * The feature id for the '<em><b>Modifier Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAREABLELIBRARY__MODIFIER_EXTENSION = ResourcesPackage.LIBRARY__MODIFIER_EXTENSION;

	/**
	 * The feature id for the '<em><b>Url</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAREABLELIBRARY__URL = ResourcesPackage.LIBRARY__URL;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAREABLELIBRARY__IDENTIFIER = ResourcesPackage.LIBRARY__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Version</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAREABLELIBRARY__VERSION = ResourcesPackage.LIBRARY__VERSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAREABLELIBRARY__NAME = ResourcesPackage.LIBRARY__NAME;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAREABLELIBRARY__TITLE = ResourcesPackage.LIBRARY__TITLE;

	/**
	 * The feature id for the '<em><b>Subtitle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAREABLELIBRARY__SUBTITLE = ResourcesPackage.LIBRARY__SUBTITLE;

	/**
	 * The feature id for the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAREABLELIBRARY__STATUS = ResourcesPackage.LIBRARY__STATUS;

	/**
	 * The feature id for the '<em><b>Experimental</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAREABLELIBRARY__EXPERIMENTAL = ResourcesPackage.LIBRARY__EXPERIMENTAL;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAREABLELIBRARY__TYPE = ResourcesPackage.LIBRARY__TYPE;

	/**
	 * The feature id for the '<em><b>Subjectx</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAREABLELIBRARY__SUBJECTX = ResourcesPackage.LIBRARY__SUBJECTX;

	/**
	 * The feature id for the '<em><b>Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAREABLELIBRARY__DATE = ResourcesPackage.LIBRARY__DATE;

	/**
	 * The feature id for the '<em><b>Publisher</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAREABLELIBRARY__PUBLISHER = ResourcesPackage.LIBRARY__PUBLISHER;

	/**
	 * The feature id for the '<em><b>Contact</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAREABLELIBRARY__CONTACT = ResourcesPackage.LIBRARY__CONTACT;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAREABLELIBRARY__DESCRIPTION = ResourcesPackage.LIBRARY__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Use Context</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAREABLELIBRARY__USE_CONTEXT = ResourcesPackage.LIBRARY__USE_CONTEXT;

	/**
	 * The feature id for the '<em><b>Jurisdiction</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAREABLELIBRARY__JURISDICTION = ResourcesPackage.LIBRARY__JURISDICTION;

	/**
	 * The feature id for the '<em><b>Purpose</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAREABLELIBRARY__PURPOSE = ResourcesPackage.LIBRARY__PURPOSE;

	/**
	 * The feature id for the '<em><b>Usage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAREABLELIBRARY__USAGE = ResourcesPackage.LIBRARY__USAGE;

	/**
	 * The feature id for the '<em><b>Copyright</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAREABLELIBRARY__COPYRIGHT = ResourcesPackage.LIBRARY__COPYRIGHT;

	/**
	 * The feature id for the '<em><b>Approval Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAREABLELIBRARY__APPROVAL_DATE = ResourcesPackage.LIBRARY__APPROVAL_DATE;

	/**
	 * The feature id for the '<em><b>Last Review Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAREABLELIBRARY__LAST_REVIEW_DATE = ResourcesPackage.LIBRARY__LAST_REVIEW_DATE;

	/**
	 * The feature id for the '<em><b>Effective Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAREABLELIBRARY__EFFECTIVE_PERIOD = ResourcesPackage.LIBRARY__EFFECTIVE_PERIOD;

	/**
	 * The feature id for the '<em><b>Topic</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAREABLELIBRARY__TOPIC = ResourcesPackage.LIBRARY__TOPIC;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAREABLELIBRARY__AUTHOR = ResourcesPackage.LIBRARY__AUTHOR;

	/**
	 * The feature id for the '<em><b>Editor</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAREABLELIBRARY__EDITOR = ResourcesPackage.LIBRARY__EDITOR;

	/**
	 * The feature id for the '<em><b>Reviewer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAREABLELIBRARY__REVIEWER = ResourcesPackage.LIBRARY__REVIEWER;

	/**
	 * The feature id for the '<em><b>Endorser</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAREABLELIBRARY__ENDORSER = ResourcesPackage.LIBRARY__ENDORSER;

	/**
	 * The feature id for the '<em><b>Related Artifact</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAREABLELIBRARY__RELATED_ARTIFACT = ResourcesPackage.LIBRARY__RELATED_ARTIFACT;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAREABLELIBRARY__PARAMETER = ResourcesPackage.LIBRARY__PARAMETER;

	/**
	 * The feature id for the '<em><b>Data Requirement</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAREABLELIBRARY__DATA_REQUIREMENT = ResourcesPackage.LIBRARY__DATA_REQUIREMENT;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAREABLELIBRARY__CONTENT = ResourcesPackage.LIBRARY__CONTENT;

	/**
	 * The number of structural features of the '<em>Shareablelibrary</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAREABLELIBRARY_FEATURE_COUNT = ResourcesPackage.LIBRARY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Shareablelibrary</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAREABLELIBRARY_OPERATION_COUNT = ResourcesPackage.LIBRARY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fhiRCore.profiles.impl.CdshooksguidanceresponseImpl <em>Cdshooksguidanceresponse</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.profiles.impl.CdshooksguidanceresponseImpl
	 * @see fhiRCore.profiles.impl.ProfilesPackageImpl#getCdshooksguidanceresponse()
	 * @generated
	 */
	int CDSHOOKSGUIDANCERESPONSE = 16;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDSHOOKSGUIDANCERESPONSE__ID = ResourcesPackage.GUIDANCE_RESPONSE__ID;

	/**
	 * The feature id for the '<em><b>Meta</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDSHOOKSGUIDANCERESPONSE__META = ResourcesPackage.GUIDANCE_RESPONSE__META;

	/**
	 * The feature id for the '<em><b>Implicit Rules</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDSHOOKSGUIDANCERESPONSE__IMPLICIT_RULES = ResourcesPackage.GUIDANCE_RESPONSE__IMPLICIT_RULES;

	/**
	 * The feature id for the '<em><b>Language</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDSHOOKSGUIDANCERESPONSE__LANGUAGE = ResourcesPackage.GUIDANCE_RESPONSE__LANGUAGE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDSHOOKSGUIDANCERESPONSE__TEXT = ResourcesPackage.GUIDANCE_RESPONSE__TEXT;

	/**
	 * The feature id for the '<em><b>Contained</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDSHOOKSGUIDANCERESPONSE__CONTAINED = ResourcesPackage.GUIDANCE_RESPONSE__CONTAINED;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDSHOOKSGUIDANCERESPONSE__EXTENSION = ResourcesPackage.GUIDANCE_RESPONSE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Modifier Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDSHOOKSGUIDANCERESPONSE__MODIFIER_EXTENSION = ResourcesPackage.GUIDANCE_RESPONSE__MODIFIER_EXTENSION;

	/**
	 * The feature id for the '<em><b>Request Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDSHOOKSGUIDANCERESPONSE__REQUEST_IDENTIFIER = ResourcesPackage.GUIDANCE_RESPONSE__REQUEST_IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDSHOOKSGUIDANCERESPONSE__IDENTIFIER = ResourcesPackage.GUIDANCE_RESPONSE__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Modulex</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDSHOOKSGUIDANCERESPONSE__MODULEX = ResourcesPackage.GUIDANCE_RESPONSE__MODULEX;

	/**
	 * The feature id for the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDSHOOKSGUIDANCERESPONSE__STATUS = ResourcesPackage.GUIDANCE_RESPONSE__STATUS;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDSHOOKSGUIDANCERESPONSE__SUBJECT = ResourcesPackage.GUIDANCE_RESPONSE__SUBJECT;

	/**
	 * The feature id for the '<em><b>Encounter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDSHOOKSGUIDANCERESPONSE__ENCOUNTER = ResourcesPackage.GUIDANCE_RESPONSE__ENCOUNTER;

	/**
	 * The feature id for the '<em><b>Occurrence Date Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDSHOOKSGUIDANCERESPONSE__OCCURRENCE_DATE_TIME = ResourcesPackage.GUIDANCE_RESPONSE__OCCURRENCE_DATE_TIME;

	/**
	 * The feature id for the '<em><b>Performer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDSHOOKSGUIDANCERESPONSE__PERFORMER = ResourcesPackage.GUIDANCE_RESPONSE__PERFORMER;

	/**
	 * The feature id for the '<em><b>Reason Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDSHOOKSGUIDANCERESPONSE__REASON_CODE = ResourcesPackage.GUIDANCE_RESPONSE__REASON_CODE;

	/**
	 * The feature id for the '<em><b>Reason Reference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDSHOOKSGUIDANCERESPONSE__REASON_REFERENCE = ResourcesPackage.GUIDANCE_RESPONSE__REASON_REFERENCE;

	/**
	 * The feature id for the '<em><b>Note</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDSHOOKSGUIDANCERESPONSE__NOTE = ResourcesPackage.GUIDANCE_RESPONSE__NOTE;

	/**
	 * The feature id for the '<em><b>Evaluation Message</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDSHOOKSGUIDANCERESPONSE__EVALUATION_MESSAGE = ResourcesPackage.GUIDANCE_RESPONSE__EVALUATION_MESSAGE;

	/**
	 * The feature id for the '<em><b>Output Parameters</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDSHOOKSGUIDANCERESPONSE__OUTPUT_PARAMETERS = ResourcesPackage.GUIDANCE_RESPONSE__OUTPUT_PARAMETERS;

	/**
	 * The feature id for the '<em><b>Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDSHOOKSGUIDANCERESPONSE__RESULT = ResourcesPackage.GUIDANCE_RESPONSE__RESULT;

	/**
	 * The feature id for the '<em><b>Data Requirement</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDSHOOKSGUIDANCERESPONSE__DATA_REQUIREMENT = ResourcesPackage.GUIDANCE_RESPONSE__DATA_REQUIREMENT;

	/**
	 * The feature id for the '<em><b>Module Uri</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDSHOOKSGUIDANCERESPONSE__MODULE_URI = ResourcesPackage.GUIDANCE_RESPONSE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Cdshooksguidanceresponse</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDSHOOKSGUIDANCERESPONSE_FEATURE_COUNT = ResourcesPackage.GUIDANCE_RESPONSE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Cdshooksguidanceresponse</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDSHOOKSGUIDANCERESPONSE_OPERATION_COUNT = ResourcesPackage.GUIDANCE_RESPONSE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fhiRCore.profiles.impl.ShareableactivitydefinitionImpl <em>Shareableactivitydefinition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.profiles.impl.ShareableactivitydefinitionImpl
	 * @see fhiRCore.profiles.impl.ProfilesPackageImpl#getShareableactivitydefinition()
	 * @generated
	 */
	int SHAREABLEACTIVITYDEFINITION = 17;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAREABLEACTIVITYDEFINITION__ID = ResourcesPackage.ACTIVITY_DEFINITION__ID;

	/**
	 * The feature id for the '<em><b>Meta</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAREABLEACTIVITYDEFINITION__META = ResourcesPackage.ACTIVITY_DEFINITION__META;

	/**
	 * The feature id for the '<em><b>Implicit Rules</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAREABLEACTIVITYDEFINITION__IMPLICIT_RULES = ResourcesPackage.ACTIVITY_DEFINITION__IMPLICIT_RULES;

	/**
	 * The feature id for the '<em><b>Language</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAREABLEACTIVITYDEFINITION__LANGUAGE = ResourcesPackage.ACTIVITY_DEFINITION__LANGUAGE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAREABLEACTIVITYDEFINITION__TEXT = ResourcesPackage.ACTIVITY_DEFINITION__TEXT;

	/**
	 * The feature id for the '<em><b>Contained</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAREABLEACTIVITYDEFINITION__CONTAINED = ResourcesPackage.ACTIVITY_DEFINITION__CONTAINED;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAREABLEACTIVITYDEFINITION__EXTENSION = ResourcesPackage.ACTIVITY_DEFINITION__EXTENSION;

	/**
	 * The feature id for the '<em><b>Modifier Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAREABLEACTIVITYDEFINITION__MODIFIER_EXTENSION = ResourcesPackage.ACTIVITY_DEFINITION__MODIFIER_EXTENSION;

	/**
	 * The feature id for the '<em><b>Url</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAREABLEACTIVITYDEFINITION__URL = ResourcesPackage.ACTIVITY_DEFINITION__URL;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAREABLEACTIVITYDEFINITION__IDENTIFIER = ResourcesPackage.ACTIVITY_DEFINITION__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Version</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAREABLEACTIVITYDEFINITION__VERSION = ResourcesPackage.ACTIVITY_DEFINITION__VERSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAREABLEACTIVITYDEFINITION__NAME = ResourcesPackage.ACTIVITY_DEFINITION__NAME;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAREABLEACTIVITYDEFINITION__TITLE = ResourcesPackage.ACTIVITY_DEFINITION__TITLE;

	/**
	 * The feature id for the '<em><b>Subtitle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAREABLEACTIVITYDEFINITION__SUBTITLE = ResourcesPackage.ACTIVITY_DEFINITION__SUBTITLE;

	/**
	 * The feature id for the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAREABLEACTIVITYDEFINITION__STATUS = ResourcesPackage.ACTIVITY_DEFINITION__STATUS;

	/**
	 * The feature id for the '<em><b>Experimental</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAREABLEACTIVITYDEFINITION__EXPERIMENTAL = ResourcesPackage.ACTIVITY_DEFINITION__EXPERIMENTAL;

	/**
	 * The feature id for the '<em><b>Subjectx</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAREABLEACTIVITYDEFINITION__SUBJECTX = ResourcesPackage.ACTIVITY_DEFINITION__SUBJECTX;

	/**
	 * The feature id for the '<em><b>Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAREABLEACTIVITYDEFINITION__DATE = ResourcesPackage.ACTIVITY_DEFINITION__DATE;

	/**
	 * The feature id for the '<em><b>Publisher</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAREABLEACTIVITYDEFINITION__PUBLISHER = ResourcesPackage.ACTIVITY_DEFINITION__PUBLISHER;

	/**
	 * The feature id for the '<em><b>Contact</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAREABLEACTIVITYDEFINITION__CONTACT = ResourcesPackage.ACTIVITY_DEFINITION__CONTACT;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAREABLEACTIVITYDEFINITION__DESCRIPTION = ResourcesPackage.ACTIVITY_DEFINITION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Use Context</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAREABLEACTIVITYDEFINITION__USE_CONTEXT = ResourcesPackage.ACTIVITY_DEFINITION__USE_CONTEXT;

	/**
	 * The feature id for the '<em><b>Jurisdiction</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAREABLEACTIVITYDEFINITION__JURISDICTION = ResourcesPackage.ACTIVITY_DEFINITION__JURISDICTION;

	/**
	 * The feature id for the '<em><b>Purpose</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAREABLEACTIVITYDEFINITION__PURPOSE = ResourcesPackage.ACTIVITY_DEFINITION__PURPOSE;

	/**
	 * The feature id for the '<em><b>Usage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAREABLEACTIVITYDEFINITION__USAGE = ResourcesPackage.ACTIVITY_DEFINITION__USAGE;

	/**
	 * The feature id for the '<em><b>Copyright</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAREABLEACTIVITYDEFINITION__COPYRIGHT = ResourcesPackage.ACTIVITY_DEFINITION__COPYRIGHT;

	/**
	 * The feature id for the '<em><b>Approval Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAREABLEACTIVITYDEFINITION__APPROVAL_DATE = ResourcesPackage.ACTIVITY_DEFINITION__APPROVAL_DATE;

	/**
	 * The feature id for the '<em><b>Last Review Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAREABLEACTIVITYDEFINITION__LAST_REVIEW_DATE = ResourcesPackage.ACTIVITY_DEFINITION__LAST_REVIEW_DATE;

	/**
	 * The feature id for the '<em><b>Effective Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAREABLEACTIVITYDEFINITION__EFFECTIVE_PERIOD = ResourcesPackage.ACTIVITY_DEFINITION__EFFECTIVE_PERIOD;

	/**
	 * The feature id for the '<em><b>Topic</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAREABLEACTIVITYDEFINITION__TOPIC = ResourcesPackage.ACTIVITY_DEFINITION__TOPIC;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAREABLEACTIVITYDEFINITION__AUTHOR = ResourcesPackage.ACTIVITY_DEFINITION__AUTHOR;

	/**
	 * The feature id for the '<em><b>Editor</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAREABLEACTIVITYDEFINITION__EDITOR = ResourcesPackage.ACTIVITY_DEFINITION__EDITOR;

	/**
	 * The feature id for the '<em><b>Reviewer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAREABLEACTIVITYDEFINITION__REVIEWER = ResourcesPackage.ACTIVITY_DEFINITION__REVIEWER;

	/**
	 * The feature id for the '<em><b>Endorser</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAREABLEACTIVITYDEFINITION__ENDORSER = ResourcesPackage.ACTIVITY_DEFINITION__ENDORSER;

	/**
	 * The feature id for the '<em><b>Related Artifact</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAREABLEACTIVITYDEFINITION__RELATED_ARTIFACT = ResourcesPackage.ACTIVITY_DEFINITION__RELATED_ARTIFACT;

	/**
	 * The feature id for the '<em><b>Library</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAREABLEACTIVITYDEFINITION__LIBRARY = ResourcesPackage.ACTIVITY_DEFINITION__LIBRARY;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAREABLEACTIVITYDEFINITION__KIND = ResourcesPackage.ACTIVITY_DEFINITION__KIND;

	/**
	 * The feature id for the '<em><b>Profile</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAREABLEACTIVITYDEFINITION__PROFILE = ResourcesPackage.ACTIVITY_DEFINITION__PROFILE;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAREABLEACTIVITYDEFINITION__CODE = ResourcesPackage.ACTIVITY_DEFINITION__CODE;

	/**
	 * The feature id for the '<em><b>Intent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAREABLEACTIVITYDEFINITION__INTENT = ResourcesPackage.ACTIVITY_DEFINITION__INTENT;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAREABLEACTIVITYDEFINITION__PRIORITY = ResourcesPackage.ACTIVITY_DEFINITION__PRIORITY;

	/**
	 * The feature id for the '<em><b>Do Not Perform</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAREABLEACTIVITYDEFINITION__DO_NOT_PERFORM = ResourcesPackage.ACTIVITY_DEFINITION__DO_NOT_PERFORM;

	/**
	 * The feature id for the '<em><b>Timingx</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAREABLEACTIVITYDEFINITION__TIMINGX = ResourcesPackage.ACTIVITY_DEFINITION__TIMINGX;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAREABLEACTIVITYDEFINITION__LOCATION = ResourcesPackage.ACTIVITY_DEFINITION__LOCATION;

	/**
	 * The feature id for the '<em><b>Participant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAREABLEACTIVITYDEFINITION__PARTICIPANT = ResourcesPackage.ACTIVITY_DEFINITION__PARTICIPANT;

	/**
	 * The feature id for the '<em><b>Productx</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAREABLEACTIVITYDEFINITION__PRODUCTX = ResourcesPackage.ACTIVITY_DEFINITION__PRODUCTX;

	/**
	 * The feature id for the '<em><b>Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAREABLEACTIVITYDEFINITION__QUANTITY = ResourcesPackage.ACTIVITY_DEFINITION__QUANTITY;

	/**
	 * The feature id for the '<em><b>Dosage</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAREABLEACTIVITYDEFINITION__DOSAGE = ResourcesPackage.ACTIVITY_DEFINITION__DOSAGE;

	/**
	 * The feature id for the '<em><b>Body Site</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAREABLEACTIVITYDEFINITION__BODY_SITE = ResourcesPackage.ACTIVITY_DEFINITION__BODY_SITE;

	/**
	 * The feature id for the '<em><b>Specimen Requirement</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAREABLEACTIVITYDEFINITION__SPECIMEN_REQUIREMENT = ResourcesPackage.ACTIVITY_DEFINITION__SPECIMEN_REQUIREMENT;

	/**
	 * The feature id for the '<em><b>Observation Requirement</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAREABLEACTIVITYDEFINITION__OBSERVATION_REQUIREMENT = ResourcesPackage.ACTIVITY_DEFINITION__OBSERVATION_REQUIREMENT;

	/**
	 * The feature id for the '<em><b>Observation Result Requirement</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAREABLEACTIVITYDEFINITION__OBSERVATION_RESULT_REQUIREMENT = ResourcesPackage.ACTIVITY_DEFINITION__OBSERVATION_RESULT_REQUIREMENT;

	/**
	 * The feature id for the '<em><b>Transform</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAREABLEACTIVITYDEFINITION__TRANSFORM = ResourcesPackage.ACTIVITY_DEFINITION__TRANSFORM;

	/**
	 * The feature id for the '<em><b>Dynamic Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAREABLEACTIVITYDEFINITION__DYNAMIC_VALUE = ResourcesPackage.ACTIVITY_DEFINITION__DYNAMIC_VALUE;

	/**
	 * The number of structural features of the '<em>Shareableactivitydefinition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAREABLEACTIVITYDEFINITION_FEATURE_COUNT = ResourcesPackage.ACTIVITY_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Shareableactivitydefinition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAREABLEACTIVITYDEFINITION_OPERATION_COUNT = ResourcesPackage.ACTIVITY_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fhiRCore.profiles.impl.ShareablemeasureImpl <em>Shareablemeasure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.profiles.impl.ShareablemeasureImpl
	 * @see fhiRCore.profiles.impl.ProfilesPackageImpl#getShareablemeasure()
	 * @generated
	 */
	int SHAREABLEMEASURE = 18;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAREABLEMEASURE__ID = ResourcesPackage.MEASURE__ID;

	/**
	 * The feature id for the '<em><b>Meta</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAREABLEMEASURE__META = ResourcesPackage.MEASURE__META;

	/**
	 * The feature id for the '<em><b>Implicit Rules</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAREABLEMEASURE__IMPLICIT_RULES = ResourcesPackage.MEASURE__IMPLICIT_RULES;

	/**
	 * The feature id for the '<em><b>Language</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAREABLEMEASURE__LANGUAGE = ResourcesPackage.MEASURE__LANGUAGE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAREABLEMEASURE__TEXT = ResourcesPackage.MEASURE__TEXT;

	/**
	 * The feature id for the '<em><b>Contained</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAREABLEMEASURE__CONTAINED = ResourcesPackage.MEASURE__CONTAINED;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAREABLEMEASURE__EXTENSION = ResourcesPackage.MEASURE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Modifier Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAREABLEMEASURE__MODIFIER_EXTENSION = ResourcesPackage.MEASURE__MODIFIER_EXTENSION;

	/**
	 * The feature id for the '<em><b>Url</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAREABLEMEASURE__URL = ResourcesPackage.MEASURE__URL;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAREABLEMEASURE__IDENTIFIER = ResourcesPackage.MEASURE__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Version</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAREABLEMEASURE__VERSION = ResourcesPackage.MEASURE__VERSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAREABLEMEASURE__NAME = ResourcesPackage.MEASURE__NAME;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAREABLEMEASURE__TITLE = ResourcesPackage.MEASURE__TITLE;

	/**
	 * The feature id for the '<em><b>Subtitle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAREABLEMEASURE__SUBTITLE = ResourcesPackage.MEASURE__SUBTITLE;

	/**
	 * The feature id for the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAREABLEMEASURE__STATUS = ResourcesPackage.MEASURE__STATUS;

	/**
	 * The feature id for the '<em><b>Experimental</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAREABLEMEASURE__EXPERIMENTAL = ResourcesPackage.MEASURE__EXPERIMENTAL;

	/**
	 * The feature id for the '<em><b>Subjectx</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAREABLEMEASURE__SUBJECTX = ResourcesPackage.MEASURE__SUBJECTX;

	/**
	 * The feature id for the '<em><b>Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAREABLEMEASURE__DATE = ResourcesPackage.MEASURE__DATE;

	/**
	 * The feature id for the '<em><b>Publisher</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAREABLEMEASURE__PUBLISHER = ResourcesPackage.MEASURE__PUBLISHER;

	/**
	 * The feature id for the '<em><b>Contact</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAREABLEMEASURE__CONTACT = ResourcesPackage.MEASURE__CONTACT;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAREABLEMEASURE__DESCRIPTION = ResourcesPackage.MEASURE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Use Context</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAREABLEMEASURE__USE_CONTEXT = ResourcesPackage.MEASURE__USE_CONTEXT;

	/**
	 * The feature id for the '<em><b>Jurisdiction</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAREABLEMEASURE__JURISDICTION = ResourcesPackage.MEASURE__JURISDICTION;

	/**
	 * The feature id for the '<em><b>Purpose</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAREABLEMEASURE__PURPOSE = ResourcesPackage.MEASURE__PURPOSE;

	/**
	 * The feature id for the '<em><b>Usage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAREABLEMEASURE__USAGE = ResourcesPackage.MEASURE__USAGE;

	/**
	 * The feature id for the '<em><b>Copyright</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAREABLEMEASURE__COPYRIGHT = ResourcesPackage.MEASURE__COPYRIGHT;

	/**
	 * The feature id for the '<em><b>Approval Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAREABLEMEASURE__APPROVAL_DATE = ResourcesPackage.MEASURE__APPROVAL_DATE;

	/**
	 * The feature id for the '<em><b>Last Review Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAREABLEMEASURE__LAST_REVIEW_DATE = ResourcesPackage.MEASURE__LAST_REVIEW_DATE;

	/**
	 * The feature id for the '<em><b>Effective Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAREABLEMEASURE__EFFECTIVE_PERIOD = ResourcesPackage.MEASURE__EFFECTIVE_PERIOD;

	/**
	 * The feature id for the '<em><b>Topic</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAREABLEMEASURE__TOPIC = ResourcesPackage.MEASURE__TOPIC;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAREABLEMEASURE__AUTHOR = ResourcesPackage.MEASURE__AUTHOR;

	/**
	 * The feature id for the '<em><b>Editor</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAREABLEMEASURE__EDITOR = ResourcesPackage.MEASURE__EDITOR;

	/**
	 * The feature id for the '<em><b>Reviewer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAREABLEMEASURE__REVIEWER = ResourcesPackage.MEASURE__REVIEWER;

	/**
	 * The feature id for the '<em><b>Endorser</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAREABLEMEASURE__ENDORSER = ResourcesPackage.MEASURE__ENDORSER;

	/**
	 * The feature id for the '<em><b>Related Artifact</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAREABLEMEASURE__RELATED_ARTIFACT = ResourcesPackage.MEASURE__RELATED_ARTIFACT;

	/**
	 * The feature id for the '<em><b>Library</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAREABLEMEASURE__LIBRARY = ResourcesPackage.MEASURE__LIBRARY;

	/**
	 * The feature id for the '<em><b>Disclaimer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAREABLEMEASURE__DISCLAIMER = ResourcesPackage.MEASURE__DISCLAIMER;

	/**
	 * The feature id for the '<em><b>Scoring</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAREABLEMEASURE__SCORING = ResourcesPackage.MEASURE__SCORING;

	/**
	 * The feature id for the '<em><b>Composite Scoring</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAREABLEMEASURE__COMPOSITE_SCORING = ResourcesPackage.MEASURE__COMPOSITE_SCORING;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAREABLEMEASURE__TYPE = ResourcesPackage.MEASURE__TYPE;

	/**
	 * The feature id for the '<em><b>Risk Adjustment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAREABLEMEASURE__RISK_ADJUSTMENT = ResourcesPackage.MEASURE__RISK_ADJUSTMENT;

	/**
	 * The feature id for the '<em><b>Rate Aggregation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAREABLEMEASURE__RATE_AGGREGATION = ResourcesPackage.MEASURE__RATE_AGGREGATION;

	/**
	 * The feature id for the '<em><b>Rationale</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAREABLEMEASURE__RATIONALE = ResourcesPackage.MEASURE__RATIONALE;

	/**
	 * The feature id for the '<em><b>Clinical Recommendation Statement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAREABLEMEASURE__CLINICAL_RECOMMENDATION_STATEMENT = ResourcesPackage.MEASURE__CLINICAL_RECOMMENDATION_STATEMENT;

	/**
	 * The feature id for the '<em><b>Improvement Notation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAREABLEMEASURE__IMPROVEMENT_NOTATION = ResourcesPackage.MEASURE__IMPROVEMENT_NOTATION;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAREABLEMEASURE__DEFINITION = ResourcesPackage.MEASURE__DEFINITION;

	/**
	 * The feature id for the '<em><b>Guidance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAREABLEMEASURE__GUIDANCE = ResourcesPackage.MEASURE__GUIDANCE;

	/**
	 * The feature id for the '<em><b>Group</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAREABLEMEASURE__GROUP = ResourcesPackage.MEASURE__GROUP;

	/**
	 * The feature id for the '<em><b>Supplemental Data</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAREABLEMEASURE__SUPPLEMENTAL_DATA = ResourcesPackage.MEASURE__SUPPLEMENTAL_DATA;

	/**
	 * The number of structural features of the '<em>Shareablemeasure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAREABLEMEASURE_FEATURE_COUNT = ResourcesPackage.MEASURE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Shareablemeasure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAREABLEMEASURE_OPERATION_COUNT = ResourcesPackage.MEASURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fhiRCore.profiles.impl.ResprateImpl <em>Resprate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.profiles.impl.ResprateImpl
	 * @see fhiRCore.profiles.impl.ProfilesPackageImpl#getResprate()
	 * @generated
	 */
	int RESPRATE = 19;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPRATE__ID = VITALSIGNS__ID;

	/**
	 * The feature id for the '<em><b>Meta</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPRATE__META = VITALSIGNS__META;

	/**
	 * The feature id for the '<em><b>Implicit Rules</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPRATE__IMPLICIT_RULES = VITALSIGNS__IMPLICIT_RULES;

	/**
	 * The feature id for the '<em><b>Language</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPRATE__LANGUAGE = VITALSIGNS__LANGUAGE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPRATE__TEXT = VITALSIGNS__TEXT;

	/**
	 * The feature id for the '<em><b>Contained</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPRATE__CONTAINED = VITALSIGNS__CONTAINED;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPRATE__EXTENSION = VITALSIGNS__EXTENSION;

	/**
	 * The feature id for the '<em><b>Modifier Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPRATE__MODIFIER_EXTENSION = VITALSIGNS__MODIFIER_EXTENSION;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPRATE__IDENTIFIER = VITALSIGNS__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Based On</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPRATE__BASED_ON = VITALSIGNS__BASED_ON;

	/**
	 * The feature id for the '<em><b>Part Of</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPRATE__PART_OF = VITALSIGNS__PART_OF;

	/**
	 * The feature id for the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPRATE__STATUS = VITALSIGNS__STATUS;

	/**
	 * The feature id for the '<em><b>Category</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPRATE__CATEGORY = VITALSIGNS__CATEGORY;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPRATE__CODE = VITALSIGNS__CODE;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPRATE__SUBJECT = VITALSIGNS__SUBJECT;

	/**
	 * The feature id for the '<em><b>Focus</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPRATE__FOCUS = VITALSIGNS__FOCUS;

	/**
	 * The feature id for the '<em><b>Encounter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPRATE__ENCOUNTER = VITALSIGNS__ENCOUNTER;

	/**
	 * The feature id for the '<em><b>Effectivex</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPRATE__EFFECTIVEX = VITALSIGNS__EFFECTIVEX;

	/**
	 * The feature id for the '<em><b>Issued</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPRATE__ISSUED = VITALSIGNS__ISSUED;

	/**
	 * The feature id for the '<em><b>Performer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPRATE__PERFORMER = VITALSIGNS__PERFORMER;

	/**
	 * The feature id for the '<em><b>Valuex</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPRATE__VALUEX = VITALSIGNS__VALUEX;

	/**
	 * The feature id for the '<em><b>Data Absent Reason</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPRATE__DATA_ABSENT_REASON = VITALSIGNS__DATA_ABSENT_REASON;

	/**
	 * The feature id for the '<em><b>Interpretation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPRATE__INTERPRETATION = VITALSIGNS__INTERPRETATION;

	/**
	 * The feature id for the '<em><b>Note</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPRATE__NOTE = VITALSIGNS__NOTE;

	/**
	 * The feature id for the '<em><b>Body Site</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPRATE__BODY_SITE = VITALSIGNS__BODY_SITE;

	/**
	 * The feature id for the '<em><b>Method</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPRATE__METHOD = VITALSIGNS__METHOD;

	/**
	 * The feature id for the '<em><b>Specimen</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPRATE__SPECIMEN = VITALSIGNS__SPECIMEN;

	/**
	 * The feature id for the '<em><b>Device</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPRATE__DEVICE = VITALSIGNS__DEVICE;

	/**
	 * The feature id for the '<em><b>Has Member</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPRATE__HAS_MEMBER = VITALSIGNS__HAS_MEMBER;

	/**
	 * The feature id for the '<em><b>Derived From</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPRATE__DERIVED_FROM = VITALSIGNS__DERIVED_FROM;

	/**
	 * The feature id for the '<em><b>Component</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPRATE__COMPONENT = VITALSIGNS__COMPONENT;

	/**
	 * The feature id for the '<em><b>Reference Range</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPRATE__REFERENCE_RANGE = VITALSIGNS__REFERENCE_RANGE;

	/**
	 * The feature id for the '<em><b>Vs Cat</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPRATE__VS_CAT = VITALSIGNS__VS_CAT;

	/**
	 * The feature id for the '<em><b>Value Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPRATE__VALUE_QUANTITY = VITALSIGNS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Resprate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPRATE_FEATURE_COUNT = VITALSIGNS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Resprate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPRATE_OPERATION_COUNT = VITALSIGNS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fhiRCore.profiles.impl.ResprateCodeableConcept1Impl <em>Resprate Codeable Concept1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.profiles.impl.ResprateCodeableConcept1Impl
	 * @see fhiRCore.profiles.impl.ProfilesPackageImpl#getResprateCodeableConcept1()
	 * @generated
	 */
	int RESPRATE_CODEABLE_CONCEPT1 = 20;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPRATE_CODEABLE_CONCEPT1__ID = DataTypesPackage.CODEABLE_CONCEPT__ID;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPRATE_CODEABLE_CONCEPT1__EXTENSION = DataTypesPackage.CODEABLE_CONCEPT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Coding</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPRATE_CODEABLE_CONCEPT1__CODING = DataTypesPackage.CODEABLE_CONCEPT__CODING;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPRATE_CODEABLE_CONCEPT1__TEXT = DataTypesPackage.CODEABLE_CONCEPT__TEXT;

	/**
	 * The feature id for the '<em><b>Resp Rate Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPRATE_CODEABLE_CONCEPT1__RESP_RATE_CODE = DataTypesPackage.CODEABLE_CONCEPT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Resprate Codeable Concept1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPRATE_CODEABLE_CONCEPT1_FEATURE_COUNT = DataTypesPackage.CODEABLE_CONCEPT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Resprate Codeable Concept1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPRATE_CODEABLE_CONCEPT1_OPERATION_COUNT = DataTypesPackage.CODEABLE_CONCEPT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fhiRCore.profiles.impl.ResprateCodeableConcept1Coding1Impl <em>Resprate Codeable Concept1 Coding1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.profiles.impl.ResprateCodeableConcept1Coding1Impl
	 * @see fhiRCore.profiles.impl.ProfilesPackageImpl#getResprateCodeableConcept1Coding1()
	 * @generated
	 */
	int RESPRATE_CODEABLE_CONCEPT1_CODING1 = 21;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPRATE_CODEABLE_CONCEPT1_CODING1__ID = DataTypesPackage.CODING__ID;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPRATE_CODEABLE_CONCEPT1_CODING1__EXTENSION = DataTypesPackage.CODING__EXTENSION;

	/**
	 * The feature id for the '<em><b>System</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPRATE_CODEABLE_CONCEPT1_CODING1__SYSTEM = DataTypesPackage.CODING__SYSTEM;

	/**
	 * The feature id for the '<em><b>Version</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPRATE_CODEABLE_CONCEPT1_CODING1__VERSION = DataTypesPackage.CODING__VERSION;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPRATE_CODEABLE_CONCEPT1_CODING1__CODE = DataTypesPackage.CODING__CODE;

	/**
	 * The feature id for the '<em><b>Display</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPRATE_CODEABLE_CONCEPT1_CODING1__DISPLAY = DataTypesPackage.CODING__DISPLAY;

	/**
	 * The feature id for the '<em><b>User Selected</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPRATE_CODEABLE_CONCEPT1_CODING1__USER_SELECTED = DataTypesPackage.CODING__USER_SELECTED;

	/**
	 * The number of structural features of the '<em>Resprate Codeable Concept1 Coding1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPRATE_CODEABLE_CONCEPT1_CODING1_FEATURE_COUNT = DataTypesPackage.CODING_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Resprate Codeable Concept1 Coding1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPRATE_CODEABLE_CONCEPT1_CODING1_OPERATION_COUNT = DataTypesPackage.CODING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fhiRCore.profiles.impl.ResprateQuantity1Impl <em>Resprate Quantity1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.profiles.impl.ResprateQuantity1Impl
	 * @see fhiRCore.profiles.impl.ProfilesPackageImpl#getResprateQuantity1()
	 * @generated
	 */
	int RESPRATE_QUANTITY1 = 22;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPRATE_QUANTITY1__ID = DataTypesPackage.QUANTITY__ID;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPRATE_QUANTITY1__EXTENSION = DataTypesPackage.QUANTITY__EXTENSION;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPRATE_QUANTITY1__VALUE = DataTypesPackage.QUANTITY__VALUE;

	/**
	 * The feature id for the '<em><b>Comparator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPRATE_QUANTITY1__COMPARATOR = DataTypesPackage.QUANTITY__COMPARATOR;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPRATE_QUANTITY1__UNIT = DataTypesPackage.QUANTITY__UNIT;

	/**
	 * The feature id for the '<em><b>System</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPRATE_QUANTITY1__SYSTEM = DataTypesPackage.QUANTITY__SYSTEM;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPRATE_QUANTITY1__CODE = DataTypesPackage.QUANTITY__CODE;

	/**
	 * The number of structural features of the '<em>Resprate Quantity1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPRATE_QUANTITY1_FEATURE_COUNT = DataTypesPackage.QUANTITY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Resprate Quantity1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPRATE_QUANTITY1_OPERATION_COUNT = DataTypesPackage.QUANTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fhiRCore.profiles.impl.FamilymemberhistorygeneticImpl <em>Familymemberhistorygenetic</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.profiles.impl.FamilymemberhistorygeneticImpl
	 * @see fhiRCore.profiles.impl.ProfilesPackageImpl#getFamilymemberhistorygenetic()
	 * @generated
	 */
	int FAMILYMEMBERHISTORYGENETIC = 23;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILYMEMBERHISTORYGENETIC__ID = ResourcesPackage.FAMILY_MEMBER_HISTORY__ID;

	/**
	 * The feature id for the '<em><b>Meta</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILYMEMBERHISTORYGENETIC__META = ResourcesPackage.FAMILY_MEMBER_HISTORY__META;

	/**
	 * The feature id for the '<em><b>Implicit Rules</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILYMEMBERHISTORYGENETIC__IMPLICIT_RULES = ResourcesPackage.FAMILY_MEMBER_HISTORY__IMPLICIT_RULES;

	/**
	 * The feature id for the '<em><b>Language</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILYMEMBERHISTORYGENETIC__LANGUAGE = ResourcesPackage.FAMILY_MEMBER_HISTORY__LANGUAGE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILYMEMBERHISTORYGENETIC__TEXT = ResourcesPackage.FAMILY_MEMBER_HISTORY__TEXT;

	/**
	 * The feature id for the '<em><b>Contained</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILYMEMBERHISTORYGENETIC__CONTAINED = ResourcesPackage.FAMILY_MEMBER_HISTORY__CONTAINED;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILYMEMBERHISTORYGENETIC__EXTENSION = ResourcesPackage.FAMILY_MEMBER_HISTORY__EXTENSION;

	/**
	 * The feature id for the '<em><b>Modifier Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILYMEMBERHISTORYGENETIC__MODIFIER_EXTENSION = ResourcesPackage.FAMILY_MEMBER_HISTORY__MODIFIER_EXTENSION;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILYMEMBERHISTORYGENETIC__IDENTIFIER = ResourcesPackage.FAMILY_MEMBER_HISTORY__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Instantiates Canonical</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILYMEMBERHISTORYGENETIC__INSTANTIATES_CANONICAL = ResourcesPackage.FAMILY_MEMBER_HISTORY__INSTANTIATES_CANONICAL;

	/**
	 * The feature id for the '<em><b>Instantiates Uri</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILYMEMBERHISTORYGENETIC__INSTANTIATES_URI = ResourcesPackage.FAMILY_MEMBER_HISTORY__INSTANTIATES_URI;

	/**
	 * The feature id for the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILYMEMBERHISTORYGENETIC__STATUS = ResourcesPackage.FAMILY_MEMBER_HISTORY__STATUS;

	/**
	 * The feature id for the '<em><b>Data Absent Reason</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILYMEMBERHISTORYGENETIC__DATA_ABSENT_REASON = ResourcesPackage.FAMILY_MEMBER_HISTORY__DATA_ABSENT_REASON;

	/**
	 * The feature id for the '<em><b>Patient</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILYMEMBERHISTORYGENETIC__PATIENT = ResourcesPackage.FAMILY_MEMBER_HISTORY__PATIENT;

	/**
	 * The feature id for the '<em><b>Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILYMEMBERHISTORYGENETIC__DATE = ResourcesPackage.FAMILY_MEMBER_HISTORY__DATE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILYMEMBERHISTORYGENETIC__NAME = ResourcesPackage.FAMILY_MEMBER_HISTORY__NAME;

	/**
	 * The feature id for the '<em><b>Relationship</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILYMEMBERHISTORYGENETIC__RELATIONSHIP = ResourcesPackage.FAMILY_MEMBER_HISTORY__RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Sex</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILYMEMBERHISTORYGENETIC__SEX = ResourcesPackage.FAMILY_MEMBER_HISTORY__SEX;

	/**
	 * The feature id for the '<em><b>Bornx</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILYMEMBERHISTORYGENETIC__BORNX = ResourcesPackage.FAMILY_MEMBER_HISTORY__BORNX;

	/**
	 * The feature id for the '<em><b>Agex</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILYMEMBERHISTORYGENETIC__AGEX = ResourcesPackage.FAMILY_MEMBER_HISTORY__AGEX;

	/**
	 * The feature id for the '<em><b>Estimated Age</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILYMEMBERHISTORYGENETIC__ESTIMATED_AGE = ResourcesPackage.FAMILY_MEMBER_HISTORY__ESTIMATED_AGE;

	/**
	 * The feature id for the '<em><b>Deceasedx</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILYMEMBERHISTORYGENETIC__DECEASEDX = ResourcesPackage.FAMILY_MEMBER_HISTORY__DECEASEDX;

	/**
	 * The feature id for the '<em><b>Reason Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILYMEMBERHISTORYGENETIC__REASON_CODE = ResourcesPackage.FAMILY_MEMBER_HISTORY__REASON_CODE;

	/**
	 * The feature id for the '<em><b>Reason Reference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILYMEMBERHISTORYGENETIC__REASON_REFERENCE = ResourcesPackage.FAMILY_MEMBER_HISTORY__REASON_REFERENCE;

	/**
	 * The feature id for the '<em><b>Note</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILYMEMBERHISTORYGENETIC__NOTE = ResourcesPackage.FAMILY_MEMBER_HISTORY__NOTE;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILYMEMBERHISTORYGENETIC__CONDITION = ResourcesPackage.FAMILY_MEMBER_HISTORY__CONDITION;

	/**
	 * The number of structural features of the '<em>Familymemberhistorygenetic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILYMEMBERHISTORYGENETIC_FEATURE_COUNT = ResourcesPackage.FAMILY_MEMBER_HISTORY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Familymemberhistorygenetic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILYMEMBERHISTORYGENETIC_OPERATION_COUNT = ResourcesPackage.FAMILY_MEMBER_HISTORY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fhiRCore.profiles.impl.FamilymemberhistorygeneticCondition1Impl <em>Familymemberhistorygenetic Condition1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.profiles.impl.FamilymemberhistorygeneticCondition1Impl
	 * @see fhiRCore.profiles.impl.ProfilesPackageImpl#getFamilymemberhistorygeneticCondition1()
	 * @generated
	 */
	int FAMILYMEMBERHISTORYGENETIC_CONDITION1 = 24;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILYMEMBERHISTORYGENETIC_CONDITION1__ID = ResourcesPackage.FAMILY_MEMBER_HISTORY_CONDITION__ID;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILYMEMBERHISTORYGENETIC_CONDITION1__EXTENSION = ResourcesPackage.FAMILY_MEMBER_HISTORY_CONDITION__EXTENSION;

	/**
	 * The feature id for the '<em><b>Modifier Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILYMEMBERHISTORYGENETIC_CONDITION1__MODIFIER_EXTENSION = ResourcesPackage.FAMILY_MEMBER_HISTORY_CONDITION__MODIFIER_EXTENSION;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILYMEMBERHISTORYGENETIC_CONDITION1__CODE = ResourcesPackage.FAMILY_MEMBER_HISTORY_CONDITION__CODE;

	/**
	 * The feature id for the '<em><b>Outcome</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILYMEMBERHISTORYGENETIC_CONDITION1__OUTCOME = ResourcesPackage.FAMILY_MEMBER_HISTORY_CONDITION__OUTCOME;

	/**
	 * The feature id for the '<em><b>Contributed To Death</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILYMEMBERHISTORYGENETIC_CONDITION1__CONTRIBUTED_TO_DEATH = ResourcesPackage.FAMILY_MEMBER_HISTORY_CONDITION__CONTRIBUTED_TO_DEATH;

	/**
	 * The feature id for the '<em><b>Onsetx</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILYMEMBERHISTORYGENETIC_CONDITION1__ONSETX = ResourcesPackage.FAMILY_MEMBER_HISTORY_CONDITION__ONSETX;

	/**
	 * The feature id for the '<em><b>Note</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILYMEMBERHISTORYGENETIC_CONDITION1__NOTE = ResourcesPackage.FAMILY_MEMBER_HISTORY_CONDITION__NOTE;

	/**
	 * The number of structural features of the '<em>Familymemberhistorygenetic Condition1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILYMEMBERHISTORYGENETIC_CONDITION1_FEATURE_COUNT = ResourcesPackage.FAMILY_MEMBER_HISTORY_CONDITION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Familymemberhistorygenetic Condition1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILYMEMBERHISTORYGENETIC_CONDITION1_OPERATION_COUNT = ResourcesPackage.FAMILY_MEMBER_HISTORY_CONDITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fhiRCore.profiles.impl.HdlcholesterolImpl <em>Hdlcholesterol</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.profiles.impl.HdlcholesterolImpl
	 * @see fhiRCore.profiles.impl.ProfilesPackageImpl#getHdlcholesterol()
	 * @generated
	 */
	int HDLCHOLESTEROL = 25;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDLCHOLESTEROL__ID = ResourcesPackage.OBSERVATION__ID;

	/**
	 * The feature id for the '<em><b>Meta</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDLCHOLESTEROL__META = ResourcesPackage.OBSERVATION__META;

	/**
	 * The feature id for the '<em><b>Implicit Rules</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDLCHOLESTEROL__IMPLICIT_RULES = ResourcesPackage.OBSERVATION__IMPLICIT_RULES;

	/**
	 * The feature id for the '<em><b>Language</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDLCHOLESTEROL__LANGUAGE = ResourcesPackage.OBSERVATION__LANGUAGE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDLCHOLESTEROL__TEXT = ResourcesPackage.OBSERVATION__TEXT;

	/**
	 * The feature id for the '<em><b>Contained</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDLCHOLESTEROL__CONTAINED = ResourcesPackage.OBSERVATION__CONTAINED;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDLCHOLESTEROL__EXTENSION = ResourcesPackage.OBSERVATION__EXTENSION;

	/**
	 * The feature id for the '<em><b>Modifier Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDLCHOLESTEROL__MODIFIER_EXTENSION = ResourcesPackage.OBSERVATION__MODIFIER_EXTENSION;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDLCHOLESTEROL__IDENTIFIER = ResourcesPackage.OBSERVATION__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Based On</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDLCHOLESTEROL__BASED_ON = ResourcesPackage.OBSERVATION__BASED_ON;

	/**
	 * The feature id for the '<em><b>Part Of</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDLCHOLESTEROL__PART_OF = ResourcesPackage.OBSERVATION__PART_OF;

	/**
	 * The feature id for the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDLCHOLESTEROL__STATUS = ResourcesPackage.OBSERVATION__STATUS;

	/**
	 * The feature id for the '<em><b>Category</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDLCHOLESTEROL__CATEGORY = ResourcesPackage.OBSERVATION__CATEGORY;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDLCHOLESTEROL__CODE = ResourcesPackage.OBSERVATION__CODE;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDLCHOLESTEROL__SUBJECT = ResourcesPackage.OBSERVATION__SUBJECT;

	/**
	 * The feature id for the '<em><b>Focus</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDLCHOLESTEROL__FOCUS = ResourcesPackage.OBSERVATION__FOCUS;

	/**
	 * The feature id for the '<em><b>Encounter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDLCHOLESTEROL__ENCOUNTER = ResourcesPackage.OBSERVATION__ENCOUNTER;

	/**
	 * The feature id for the '<em><b>Effectivex</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDLCHOLESTEROL__EFFECTIVEX = ResourcesPackage.OBSERVATION__EFFECTIVEX;

	/**
	 * The feature id for the '<em><b>Issued</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDLCHOLESTEROL__ISSUED = ResourcesPackage.OBSERVATION__ISSUED;

	/**
	 * The feature id for the '<em><b>Performer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDLCHOLESTEROL__PERFORMER = ResourcesPackage.OBSERVATION__PERFORMER;

	/**
	 * The feature id for the '<em><b>Valuex</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDLCHOLESTEROL__VALUEX = ResourcesPackage.OBSERVATION__VALUEX;

	/**
	 * The feature id for the '<em><b>Data Absent Reason</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDLCHOLESTEROL__DATA_ABSENT_REASON = ResourcesPackage.OBSERVATION__DATA_ABSENT_REASON;

	/**
	 * The feature id for the '<em><b>Interpretation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDLCHOLESTEROL__INTERPRETATION = ResourcesPackage.OBSERVATION__INTERPRETATION;

	/**
	 * The feature id for the '<em><b>Note</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDLCHOLESTEROL__NOTE = ResourcesPackage.OBSERVATION__NOTE;

	/**
	 * The feature id for the '<em><b>Body Site</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDLCHOLESTEROL__BODY_SITE = ResourcesPackage.OBSERVATION__BODY_SITE;

	/**
	 * The feature id for the '<em><b>Method</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDLCHOLESTEROL__METHOD = ResourcesPackage.OBSERVATION__METHOD;

	/**
	 * The feature id for the '<em><b>Specimen</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDLCHOLESTEROL__SPECIMEN = ResourcesPackage.OBSERVATION__SPECIMEN;

	/**
	 * The feature id for the '<em><b>Device</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDLCHOLESTEROL__DEVICE = ResourcesPackage.OBSERVATION__DEVICE;

	/**
	 * The feature id for the '<em><b>Has Member</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDLCHOLESTEROL__HAS_MEMBER = ResourcesPackage.OBSERVATION__HAS_MEMBER;

	/**
	 * The feature id for the '<em><b>Derived From</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDLCHOLESTEROL__DERIVED_FROM = ResourcesPackage.OBSERVATION__DERIVED_FROM;

	/**
	 * The feature id for the '<em><b>Component</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDLCHOLESTEROL__COMPONENT = ResourcesPackage.OBSERVATION__COMPONENT;

	/**
	 * The feature id for the '<em><b>Reference Range</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDLCHOLESTEROL__REFERENCE_RANGE = ResourcesPackage.OBSERVATION__REFERENCE_RANGE;

	/**
	 * The feature id for the '<em><b>Value Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDLCHOLESTEROL__VALUE_QUANTITY = ResourcesPackage.OBSERVATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Hdlcholesterol</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDLCHOLESTEROL_FEATURE_COUNT = ResourcesPackage.OBSERVATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Hdlcholesterol</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDLCHOLESTEROL_OPERATION_COUNT = ResourcesPackage.OBSERVATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fhiRCore.profiles.impl.HdlcholesterolReferenceRange1Impl <em>Hdlcholesterol Reference Range1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.profiles.impl.HdlcholesterolReferenceRange1Impl
	 * @see fhiRCore.profiles.impl.ProfilesPackageImpl#getHdlcholesterolReferenceRange1()
	 * @generated
	 */
	int HDLCHOLESTEROL_REFERENCE_RANGE1 = 26;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDLCHOLESTEROL_REFERENCE_RANGE1__ID = ResourcesPackage.OBSERVATION_REFERENCE_RANGE__ID;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDLCHOLESTEROL_REFERENCE_RANGE1__EXTENSION = ResourcesPackage.OBSERVATION_REFERENCE_RANGE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Modifier Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDLCHOLESTEROL_REFERENCE_RANGE1__MODIFIER_EXTENSION = ResourcesPackage.OBSERVATION_REFERENCE_RANGE__MODIFIER_EXTENSION;

	/**
	 * The feature id for the '<em><b>Low</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDLCHOLESTEROL_REFERENCE_RANGE1__LOW = ResourcesPackage.OBSERVATION_REFERENCE_RANGE__LOW;

	/**
	 * The feature id for the '<em><b>High</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDLCHOLESTEROL_REFERENCE_RANGE1__HIGH = ResourcesPackage.OBSERVATION_REFERENCE_RANGE__HIGH;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDLCHOLESTEROL_REFERENCE_RANGE1__TYPE = ResourcesPackage.OBSERVATION_REFERENCE_RANGE__TYPE;

	/**
	 * The feature id for the '<em><b>Applies To</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDLCHOLESTEROL_REFERENCE_RANGE1__APPLIES_TO = ResourcesPackage.OBSERVATION_REFERENCE_RANGE__APPLIES_TO;

	/**
	 * The feature id for the '<em><b>Age</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDLCHOLESTEROL_REFERENCE_RANGE1__AGE = ResourcesPackage.OBSERVATION_REFERENCE_RANGE__AGE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDLCHOLESTEROL_REFERENCE_RANGE1__TEXT = ResourcesPackage.OBSERVATION_REFERENCE_RANGE__TEXT;

	/**
	 * The number of structural features of the '<em>Hdlcholesterol Reference Range1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDLCHOLESTEROL_REFERENCE_RANGE1_FEATURE_COUNT = ResourcesPackage.OBSERVATION_REFERENCE_RANGE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Hdlcholesterol Reference Range1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDLCHOLESTEROL_REFERENCE_RANGE1_OPERATION_COUNT = ResourcesPackage.OBSERVATION_REFERENCE_RANGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fhiRCore.profiles.impl.ShareableplandefinitionImpl <em>Shareableplandefinition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.profiles.impl.ShareableplandefinitionImpl
	 * @see fhiRCore.profiles.impl.ProfilesPackageImpl#getShareableplandefinition()
	 * @generated
	 */
	int SHAREABLEPLANDEFINITION = 27;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAREABLEPLANDEFINITION__ID = ResourcesPackage.PLAN_DEFINITION__ID;

	/**
	 * The feature id for the '<em><b>Meta</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAREABLEPLANDEFINITION__META = ResourcesPackage.PLAN_DEFINITION__META;

	/**
	 * The feature id for the '<em><b>Implicit Rules</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAREABLEPLANDEFINITION__IMPLICIT_RULES = ResourcesPackage.PLAN_DEFINITION__IMPLICIT_RULES;

	/**
	 * The feature id for the '<em><b>Language</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAREABLEPLANDEFINITION__LANGUAGE = ResourcesPackage.PLAN_DEFINITION__LANGUAGE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAREABLEPLANDEFINITION__TEXT = ResourcesPackage.PLAN_DEFINITION__TEXT;

	/**
	 * The feature id for the '<em><b>Contained</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAREABLEPLANDEFINITION__CONTAINED = ResourcesPackage.PLAN_DEFINITION__CONTAINED;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAREABLEPLANDEFINITION__EXTENSION = ResourcesPackage.PLAN_DEFINITION__EXTENSION;

	/**
	 * The feature id for the '<em><b>Modifier Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAREABLEPLANDEFINITION__MODIFIER_EXTENSION = ResourcesPackage.PLAN_DEFINITION__MODIFIER_EXTENSION;

	/**
	 * The feature id for the '<em><b>Url</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAREABLEPLANDEFINITION__URL = ResourcesPackage.PLAN_DEFINITION__URL;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAREABLEPLANDEFINITION__IDENTIFIER = ResourcesPackage.PLAN_DEFINITION__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Version</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAREABLEPLANDEFINITION__VERSION = ResourcesPackage.PLAN_DEFINITION__VERSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAREABLEPLANDEFINITION__NAME = ResourcesPackage.PLAN_DEFINITION__NAME;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAREABLEPLANDEFINITION__TITLE = ResourcesPackage.PLAN_DEFINITION__TITLE;

	/**
	 * The feature id for the '<em><b>Subtitle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAREABLEPLANDEFINITION__SUBTITLE = ResourcesPackage.PLAN_DEFINITION__SUBTITLE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAREABLEPLANDEFINITION__TYPE = ResourcesPackage.PLAN_DEFINITION__TYPE;

	/**
	 * The feature id for the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAREABLEPLANDEFINITION__STATUS = ResourcesPackage.PLAN_DEFINITION__STATUS;

	/**
	 * The feature id for the '<em><b>Experimental</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAREABLEPLANDEFINITION__EXPERIMENTAL = ResourcesPackage.PLAN_DEFINITION__EXPERIMENTAL;

	/**
	 * The feature id for the '<em><b>Subjectx</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAREABLEPLANDEFINITION__SUBJECTX = ResourcesPackage.PLAN_DEFINITION__SUBJECTX;

	/**
	 * The feature id for the '<em><b>Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAREABLEPLANDEFINITION__DATE = ResourcesPackage.PLAN_DEFINITION__DATE;

	/**
	 * The feature id for the '<em><b>Publisher</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAREABLEPLANDEFINITION__PUBLISHER = ResourcesPackage.PLAN_DEFINITION__PUBLISHER;

	/**
	 * The feature id for the '<em><b>Contact</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAREABLEPLANDEFINITION__CONTACT = ResourcesPackage.PLAN_DEFINITION__CONTACT;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAREABLEPLANDEFINITION__DESCRIPTION = ResourcesPackage.PLAN_DEFINITION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Use Context</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAREABLEPLANDEFINITION__USE_CONTEXT = ResourcesPackage.PLAN_DEFINITION__USE_CONTEXT;

	/**
	 * The feature id for the '<em><b>Jurisdiction</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAREABLEPLANDEFINITION__JURISDICTION = ResourcesPackage.PLAN_DEFINITION__JURISDICTION;

	/**
	 * The feature id for the '<em><b>Purpose</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAREABLEPLANDEFINITION__PURPOSE = ResourcesPackage.PLAN_DEFINITION__PURPOSE;

	/**
	 * The feature id for the '<em><b>Usage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAREABLEPLANDEFINITION__USAGE = ResourcesPackage.PLAN_DEFINITION__USAGE;

	/**
	 * The feature id for the '<em><b>Copyright</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAREABLEPLANDEFINITION__COPYRIGHT = ResourcesPackage.PLAN_DEFINITION__COPYRIGHT;

	/**
	 * The feature id for the '<em><b>Approval Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAREABLEPLANDEFINITION__APPROVAL_DATE = ResourcesPackage.PLAN_DEFINITION__APPROVAL_DATE;

	/**
	 * The feature id for the '<em><b>Last Review Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAREABLEPLANDEFINITION__LAST_REVIEW_DATE = ResourcesPackage.PLAN_DEFINITION__LAST_REVIEW_DATE;

	/**
	 * The feature id for the '<em><b>Effective Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAREABLEPLANDEFINITION__EFFECTIVE_PERIOD = ResourcesPackage.PLAN_DEFINITION__EFFECTIVE_PERIOD;

	/**
	 * The feature id for the '<em><b>Topic</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAREABLEPLANDEFINITION__TOPIC = ResourcesPackage.PLAN_DEFINITION__TOPIC;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAREABLEPLANDEFINITION__AUTHOR = ResourcesPackage.PLAN_DEFINITION__AUTHOR;

	/**
	 * The feature id for the '<em><b>Editor</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAREABLEPLANDEFINITION__EDITOR = ResourcesPackage.PLAN_DEFINITION__EDITOR;

	/**
	 * The feature id for the '<em><b>Reviewer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAREABLEPLANDEFINITION__REVIEWER = ResourcesPackage.PLAN_DEFINITION__REVIEWER;

	/**
	 * The feature id for the '<em><b>Endorser</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAREABLEPLANDEFINITION__ENDORSER = ResourcesPackage.PLAN_DEFINITION__ENDORSER;

	/**
	 * The feature id for the '<em><b>Related Artifact</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAREABLEPLANDEFINITION__RELATED_ARTIFACT = ResourcesPackage.PLAN_DEFINITION__RELATED_ARTIFACT;

	/**
	 * The feature id for the '<em><b>Library</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAREABLEPLANDEFINITION__LIBRARY = ResourcesPackage.PLAN_DEFINITION__LIBRARY;

	/**
	 * The feature id for the '<em><b>Goal</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAREABLEPLANDEFINITION__GOAL = ResourcesPackage.PLAN_DEFINITION__GOAL;

	/**
	 * The feature id for the '<em><b>Action</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAREABLEPLANDEFINITION__ACTION = ResourcesPackage.PLAN_DEFINITION__ACTION;

	/**
	 * The number of structural features of the '<em>Shareableplandefinition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAREABLEPLANDEFINITION_FEATURE_COUNT = ResourcesPackage.PLAN_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Shareableplandefinition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAREABLEPLANDEFINITION_OPERATION_COUNT = ResourcesPackage.PLAN_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fhiRCore.profiles.impl.LipidprofileImpl <em>Lipidprofile</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.profiles.impl.LipidprofileImpl
	 * @see fhiRCore.profiles.impl.ProfilesPackageImpl#getLipidprofile()
	 * @generated
	 */
	int LIPIDPROFILE = 28;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIPIDPROFILE__ID = ResourcesPackage.DIAGNOSTIC_REPORT__ID;

	/**
	 * The feature id for the '<em><b>Meta</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIPIDPROFILE__META = ResourcesPackage.DIAGNOSTIC_REPORT__META;

	/**
	 * The feature id for the '<em><b>Implicit Rules</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIPIDPROFILE__IMPLICIT_RULES = ResourcesPackage.DIAGNOSTIC_REPORT__IMPLICIT_RULES;

	/**
	 * The feature id for the '<em><b>Language</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIPIDPROFILE__LANGUAGE = ResourcesPackage.DIAGNOSTIC_REPORT__LANGUAGE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIPIDPROFILE__TEXT = ResourcesPackage.DIAGNOSTIC_REPORT__TEXT;

	/**
	 * The feature id for the '<em><b>Contained</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIPIDPROFILE__CONTAINED = ResourcesPackage.DIAGNOSTIC_REPORT__CONTAINED;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIPIDPROFILE__EXTENSION = ResourcesPackage.DIAGNOSTIC_REPORT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Modifier Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIPIDPROFILE__MODIFIER_EXTENSION = ResourcesPackage.DIAGNOSTIC_REPORT__MODIFIER_EXTENSION;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIPIDPROFILE__IDENTIFIER = ResourcesPackage.DIAGNOSTIC_REPORT__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Based On</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIPIDPROFILE__BASED_ON = ResourcesPackage.DIAGNOSTIC_REPORT__BASED_ON;

	/**
	 * The feature id for the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIPIDPROFILE__STATUS = ResourcesPackage.DIAGNOSTIC_REPORT__STATUS;

	/**
	 * The feature id for the '<em><b>Category</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIPIDPROFILE__CATEGORY = ResourcesPackage.DIAGNOSTIC_REPORT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIPIDPROFILE__CODE = ResourcesPackage.DIAGNOSTIC_REPORT__CODE;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIPIDPROFILE__SUBJECT = ResourcesPackage.DIAGNOSTIC_REPORT__SUBJECT;

	/**
	 * The feature id for the '<em><b>Encounter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIPIDPROFILE__ENCOUNTER = ResourcesPackage.DIAGNOSTIC_REPORT__ENCOUNTER;

	/**
	 * The feature id for the '<em><b>Effectivex</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIPIDPROFILE__EFFECTIVEX = ResourcesPackage.DIAGNOSTIC_REPORT__EFFECTIVEX;

	/**
	 * The feature id for the '<em><b>Issued</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIPIDPROFILE__ISSUED = ResourcesPackage.DIAGNOSTIC_REPORT__ISSUED;

	/**
	 * The feature id for the '<em><b>Performer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIPIDPROFILE__PERFORMER = ResourcesPackage.DIAGNOSTIC_REPORT__PERFORMER;

	/**
	 * The feature id for the '<em><b>Results Interpreter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIPIDPROFILE__RESULTS_INTERPRETER = ResourcesPackage.DIAGNOSTIC_REPORT__RESULTS_INTERPRETER;

	/**
	 * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIPIDPROFILE__SPECIMEN = ResourcesPackage.DIAGNOSTIC_REPORT__SPECIMEN;

	/**
	 * The feature id for the '<em><b>Result</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIPIDPROFILE__RESULT = ResourcesPackage.DIAGNOSTIC_REPORT__RESULT;

	/**
	 * The feature id for the '<em><b>Imaging Study</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIPIDPROFILE__IMAGING_STUDY = ResourcesPackage.DIAGNOSTIC_REPORT__IMAGING_STUDY;

	/**
	 * The feature id for the '<em><b>Media</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIPIDPROFILE__MEDIA = ResourcesPackage.DIAGNOSTIC_REPORT__MEDIA;

	/**
	 * The feature id for the '<em><b>Conclusion</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIPIDPROFILE__CONCLUSION = ResourcesPackage.DIAGNOSTIC_REPORT__CONCLUSION;

	/**
	 * The feature id for the '<em><b>Conclusion Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIPIDPROFILE__CONCLUSION_CODE = ResourcesPackage.DIAGNOSTIC_REPORT__CONCLUSION_CODE;

	/**
	 * The feature id for the '<em><b>Presented Form</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIPIDPROFILE__PRESENTED_FORM = ResourcesPackage.DIAGNOSTIC_REPORT__PRESENTED_FORM;

	/**
	 * The feature id for the '<em><b>Cholesterol</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIPIDPROFILE__CHOLESTEROL = ResourcesPackage.DIAGNOSTIC_REPORT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Triglyceride</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIPIDPROFILE__TRIGLYCERIDE = ResourcesPackage.DIAGNOSTIC_REPORT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Hdl Cholesterol</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIPIDPROFILE__HDL_CHOLESTEROL = ResourcesPackage.DIAGNOSTIC_REPORT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Ldl Cholesterol</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIPIDPROFILE__LDL_CHOLESTEROL = ResourcesPackage.DIAGNOSTIC_REPORT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Lipidprofile</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIPIDPROFILE_FEATURE_COUNT = ResourcesPackage.DIAGNOSTIC_REPORT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Lipidprofile</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIPIDPROFILE_OPERATION_COUNT = ResourcesPackage.DIAGNOSTIC_REPORT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fhiRCore.profiles.impl.CholesterolImpl <em>Cholesterol</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.profiles.impl.CholesterolImpl
	 * @see fhiRCore.profiles.impl.ProfilesPackageImpl#getCholesterol()
	 * @generated
	 */
	int CHOLESTEROL = 29;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOLESTEROL__ID = ResourcesPackage.OBSERVATION__ID;

	/**
	 * The feature id for the '<em><b>Meta</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOLESTEROL__META = ResourcesPackage.OBSERVATION__META;

	/**
	 * The feature id for the '<em><b>Implicit Rules</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOLESTEROL__IMPLICIT_RULES = ResourcesPackage.OBSERVATION__IMPLICIT_RULES;

	/**
	 * The feature id for the '<em><b>Language</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOLESTEROL__LANGUAGE = ResourcesPackage.OBSERVATION__LANGUAGE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOLESTEROL__TEXT = ResourcesPackage.OBSERVATION__TEXT;

	/**
	 * The feature id for the '<em><b>Contained</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOLESTEROL__CONTAINED = ResourcesPackage.OBSERVATION__CONTAINED;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOLESTEROL__EXTENSION = ResourcesPackage.OBSERVATION__EXTENSION;

	/**
	 * The feature id for the '<em><b>Modifier Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOLESTEROL__MODIFIER_EXTENSION = ResourcesPackage.OBSERVATION__MODIFIER_EXTENSION;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOLESTEROL__IDENTIFIER = ResourcesPackage.OBSERVATION__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Based On</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOLESTEROL__BASED_ON = ResourcesPackage.OBSERVATION__BASED_ON;

	/**
	 * The feature id for the '<em><b>Part Of</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOLESTEROL__PART_OF = ResourcesPackage.OBSERVATION__PART_OF;

	/**
	 * The feature id for the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOLESTEROL__STATUS = ResourcesPackage.OBSERVATION__STATUS;

	/**
	 * The feature id for the '<em><b>Category</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOLESTEROL__CATEGORY = ResourcesPackage.OBSERVATION__CATEGORY;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOLESTEROL__CODE = ResourcesPackage.OBSERVATION__CODE;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOLESTEROL__SUBJECT = ResourcesPackage.OBSERVATION__SUBJECT;

	/**
	 * The feature id for the '<em><b>Focus</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOLESTEROL__FOCUS = ResourcesPackage.OBSERVATION__FOCUS;

	/**
	 * The feature id for the '<em><b>Encounter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOLESTEROL__ENCOUNTER = ResourcesPackage.OBSERVATION__ENCOUNTER;

	/**
	 * The feature id for the '<em><b>Effectivex</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOLESTEROL__EFFECTIVEX = ResourcesPackage.OBSERVATION__EFFECTIVEX;

	/**
	 * The feature id for the '<em><b>Issued</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOLESTEROL__ISSUED = ResourcesPackage.OBSERVATION__ISSUED;

	/**
	 * The feature id for the '<em><b>Performer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOLESTEROL__PERFORMER = ResourcesPackage.OBSERVATION__PERFORMER;

	/**
	 * The feature id for the '<em><b>Valuex</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOLESTEROL__VALUEX = ResourcesPackage.OBSERVATION__VALUEX;

	/**
	 * The feature id for the '<em><b>Data Absent Reason</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOLESTEROL__DATA_ABSENT_REASON = ResourcesPackage.OBSERVATION__DATA_ABSENT_REASON;

	/**
	 * The feature id for the '<em><b>Interpretation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOLESTEROL__INTERPRETATION = ResourcesPackage.OBSERVATION__INTERPRETATION;

	/**
	 * The feature id for the '<em><b>Note</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOLESTEROL__NOTE = ResourcesPackage.OBSERVATION__NOTE;

	/**
	 * The feature id for the '<em><b>Body Site</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOLESTEROL__BODY_SITE = ResourcesPackage.OBSERVATION__BODY_SITE;

	/**
	 * The feature id for the '<em><b>Method</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOLESTEROL__METHOD = ResourcesPackage.OBSERVATION__METHOD;

	/**
	 * The feature id for the '<em><b>Specimen</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOLESTEROL__SPECIMEN = ResourcesPackage.OBSERVATION__SPECIMEN;

	/**
	 * The feature id for the '<em><b>Device</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOLESTEROL__DEVICE = ResourcesPackage.OBSERVATION__DEVICE;

	/**
	 * The feature id for the '<em><b>Has Member</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOLESTEROL__HAS_MEMBER = ResourcesPackage.OBSERVATION__HAS_MEMBER;

	/**
	 * The feature id for the '<em><b>Derived From</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOLESTEROL__DERIVED_FROM = ResourcesPackage.OBSERVATION__DERIVED_FROM;

	/**
	 * The feature id for the '<em><b>Component</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOLESTEROL__COMPONENT = ResourcesPackage.OBSERVATION__COMPONENT;

	/**
	 * The feature id for the '<em><b>Reference Range</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOLESTEROL__REFERENCE_RANGE = ResourcesPackage.OBSERVATION__REFERENCE_RANGE;

	/**
	 * The feature id for the '<em><b>Value Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOLESTEROL__VALUE_QUANTITY = ResourcesPackage.OBSERVATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Cholesterol</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOLESTEROL_FEATURE_COUNT = ResourcesPackage.OBSERVATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Cholesterol</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOLESTEROL_OPERATION_COUNT = ResourcesPackage.OBSERVATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fhiRCore.profiles.impl.CholesterolQuantity1Impl <em>Cholesterol Quantity1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.profiles.impl.CholesterolQuantity1Impl
	 * @see fhiRCore.profiles.impl.ProfilesPackageImpl#getCholesterolQuantity1()
	 * @generated
	 */
	int CHOLESTEROL_QUANTITY1 = 30;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOLESTEROL_QUANTITY1__ID = DataTypesPackage.QUANTITY__ID;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOLESTEROL_QUANTITY1__EXTENSION = DataTypesPackage.QUANTITY__EXTENSION;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOLESTEROL_QUANTITY1__VALUE = DataTypesPackage.QUANTITY__VALUE;

	/**
	 * The feature id for the '<em><b>Comparator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOLESTEROL_QUANTITY1__COMPARATOR = DataTypesPackage.QUANTITY__COMPARATOR;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOLESTEROL_QUANTITY1__UNIT = DataTypesPackage.QUANTITY__UNIT;

	/**
	 * The feature id for the '<em><b>System</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOLESTEROL_QUANTITY1__SYSTEM = DataTypesPackage.QUANTITY__SYSTEM;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOLESTEROL_QUANTITY1__CODE = DataTypesPackage.QUANTITY__CODE;

	/**
	 * The number of structural features of the '<em>Cholesterol Quantity1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOLESTEROL_QUANTITY1_FEATURE_COUNT = DataTypesPackage.QUANTITY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Cholesterol Quantity1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOLESTEROL_QUANTITY1_OPERATION_COUNT = DataTypesPackage.QUANTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fhiRCore.profiles.impl.CholesterolReferenceRange1Impl <em>Cholesterol Reference Range1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.profiles.impl.CholesterolReferenceRange1Impl
	 * @see fhiRCore.profiles.impl.ProfilesPackageImpl#getCholesterolReferenceRange1()
	 * @generated
	 */
	int CHOLESTEROL_REFERENCE_RANGE1 = 31;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOLESTEROL_REFERENCE_RANGE1__ID = ResourcesPackage.OBSERVATION_REFERENCE_RANGE__ID;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOLESTEROL_REFERENCE_RANGE1__EXTENSION = ResourcesPackage.OBSERVATION_REFERENCE_RANGE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Modifier Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOLESTEROL_REFERENCE_RANGE1__MODIFIER_EXTENSION = ResourcesPackage.OBSERVATION_REFERENCE_RANGE__MODIFIER_EXTENSION;

	/**
	 * The feature id for the '<em><b>Low</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOLESTEROL_REFERENCE_RANGE1__LOW = ResourcesPackage.OBSERVATION_REFERENCE_RANGE__LOW;

	/**
	 * The feature id for the '<em><b>High</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOLESTEROL_REFERENCE_RANGE1__HIGH = ResourcesPackage.OBSERVATION_REFERENCE_RANGE__HIGH;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOLESTEROL_REFERENCE_RANGE1__TYPE = ResourcesPackage.OBSERVATION_REFERENCE_RANGE__TYPE;

	/**
	 * The feature id for the '<em><b>Applies To</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOLESTEROL_REFERENCE_RANGE1__APPLIES_TO = ResourcesPackage.OBSERVATION_REFERENCE_RANGE__APPLIES_TO;

	/**
	 * The feature id for the '<em><b>Age</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOLESTEROL_REFERENCE_RANGE1__AGE = ResourcesPackage.OBSERVATION_REFERENCE_RANGE__AGE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOLESTEROL_REFERENCE_RANGE1__TEXT = ResourcesPackage.OBSERVATION_REFERENCE_RANGE__TEXT;

	/**
	 * The number of structural features of the '<em>Cholesterol Reference Range1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOLESTEROL_REFERENCE_RANGE1_FEATURE_COUNT = ResourcesPackage.OBSERVATION_REFERENCE_RANGE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Cholesterol Reference Range1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOLESTEROL_REFERENCE_RANGE1_OPERATION_COUNT = ResourcesPackage.OBSERVATION_REFERENCE_RANGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fhiRCore.profiles.impl.TriglycerideImpl <em>Triglyceride</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.profiles.impl.TriglycerideImpl
	 * @see fhiRCore.profiles.impl.ProfilesPackageImpl#getTriglyceride()
	 * @generated
	 */
	int TRIGLYCERIDE = 32;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGLYCERIDE__ID = ResourcesPackage.OBSERVATION__ID;

	/**
	 * The feature id for the '<em><b>Meta</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGLYCERIDE__META = ResourcesPackage.OBSERVATION__META;

	/**
	 * The feature id for the '<em><b>Implicit Rules</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGLYCERIDE__IMPLICIT_RULES = ResourcesPackage.OBSERVATION__IMPLICIT_RULES;

	/**
	 * The feature id for the '<em><b>Language</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGLYCERIDE__LANGUAGE = ResourcesPackage.OBSERVATION__LANGUAGE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGLYCERIDE__TEXT = ResourcesPackage.OBSERVATION__TEXT;

	/**
	 * The feature id for the '<em><b>Contained</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGLYCERIDE__CONTAINED = ResourcesPackage.OBSERVATION__CONTAINED;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGLYCERIDE__EXTENSION = ResourcesPackage.OBSERVATION__EXTENSION;

	/**
	 * The feature id for the '<em><b>Modifier Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGLYCERIDE__MODIFIER_EXTENSION = ResourcesPackage.OBSERVATION__MODIFIER_EXTENSION;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGLYCERIDE__IDENTIFIER = ResourcesPackage.OBSERVATION__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Based On</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGLYCERIDE__BASED_ON = ResourcesPackage.OBSERVATION__BASED_ON;

	/**
	 * The feature id for the '<em><b>Part Of</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGLYCERIDE__PART_OF = ResourcesPackage.OBSERVATION__PART_OF;

	/**
	 * The feature id for the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGLYCERIDE__STATUS = ResourcesPackage.OBSERVATION__STATUS;

	/**
	 * The feature id for the '<em><b>Category</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGLYCERIDE__CATEGORY = ResourcesPackage.OBSERVATION__CATEGORY;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGLYCERIDE__CODE = ResourcesPackage.OBSERVATION__CODE;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGLYCERIDE__SUBJECT = ResourcesPackage.OBSERVATION__SUBJECT;

	/**
	 * The feature id for the '<em><b>Focus</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGLYCERIDE__FOCUS = ResourcesPackage.OBSERVATION__FOCUS;

	/**
	 * The feature id for the '<em><b>Encounter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGLYCERIDE__ENCOUNTER = ResourcesPackage.OBSERVATION__ENCOUNTER;

	/**
	 * The feature id for the '<em><b>Effectivex</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGLYCERIDE__EFFECTIVEX = ResourcesPackage.OBSERVATION__EFFECTIVEX;

	/**
	 * The feature id for the '<em><b>Issued</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGLYCERIDE__ISSUED = ResourcesPackage.OBSERVATION__ISSUED;

	/**
	 * The feature id for the '<em><b>Performer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGLYCERIDE__PERFORMER = ResourcesPackage.OBSERVATION__PERFORMER;

	/**
	 * The feature id for the '<em><b>Valuex</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGLYCERIDE__VALUEX = ResourcesPackage.OBSERVATION__VALUEX;

	/**
	 * The feature id for the '<em><b>Data Absent Reason</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGLYCERIDE__DATA_ABSENT_REASON = ResourcesPackage.OBSERVATION__DATA_ABSENT_REASON;

	/**
	 * The feature id for the '<em><b>Interpretation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGLYCERIDE__INTERPRETATION = ResourcesPackage.OBSERVATION__INTERPRETATION;

	/**
	 * The feature id for the '<em><b>Note</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGLYCERIDE__NOTE = ResourcesPackage.OBSERVATION__NOTE;

	/**
	 * The feature id for the '<em><b>Body Site</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGLYCERIDE__BODY_SITE = ResourcesPackage.OBSERVATION__BODY_SITE;

	/**
	 * The feature id for the '<em><b>Method</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGLYCERIDE__METHOD = ResourcesPackage.OBSERVATION__METHOD;

	/**
	 * The feature id for the '<em><b>Specimen</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGLYCERIDE__SPECIMEN = ResourcesPackage.OBSERVATION__SPECIMEN;

	/**
	 * The feature id for the '<em><b>Device</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGLYCERIDE__DEVICE = ResourcesPackage.OBSERVATION__DEVICE;

	/**
	 * The feature id for the '<em><b>Has Member</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGLYCERIDE__HAS_MEMBER = ResourcesPackage.OBSERVATION__HAS_MEMBER;

	/**
	 * The feature id for the '<em><b>Derived From</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGLYCERIDE__DERIVED_FROM = ResourcesPackage.OBSERVATION__DERIVED_FROM;

	/**
	 * The feature id for the '<em><b>Component</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGLYCERIDE__COMPONENT = ResourcesPackage.OBSERVATION__COMPONENT;

	/**
	 * The feature id for the '<em><b>Reference Range</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGLYCERIDE__REFERENCE_RANGE = ResourcesPackage.OBSERVATION__REFERENCE_RANGE;

	/**
	 * The feature id for the '<em><b>Value Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGLYCERIDE__VALUE_QUANTITY = ResourcesPackage.OBSERVATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Triglyceride</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGLYCERIDE_FEATURE_COUNT = ResourcesPackage.OBSERVATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Triglyceride</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGLYCERIDE_OPERATION_COUNT = ResourcesPackage.OBSERVATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fhiRCore.profiles.impl.TriglycerideReferenceRange1Impl <em>Triglyceride Reference Range1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.profiles.impl.TriglycerideReferenceRange1Impl
	 * @see fhiRCore.profiles.impl.ProfilesPackageImpl#getTriglycerideReferenceRange1()
	 * @generated
	 */
	int TRIGLYCERIDE_REFERENCE_RANGE1 = 33;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGLYCERIDE_REFERENCE_RANGE1__ID = ResourcesPackage.OBSERVATION_REFERENCE_RANGE__ID;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGLYCERIDE_REFERENCE_RANGE1__EXTENSION = ResourcesPackage.OBSERVATION_REFERENCE_RANGE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Modifier Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGLYCERIDE_REFERENCE_RANGE1__MODIFIER_EXTENSION = ResourcesPackage.OBSERVATION_REFERENCE_RANGE__MODIFIER_EXTENSION;

	/**
	 * The feature id for the '<em><b>Low</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGLYCERIDE_REFERENCE_RANGE1__LOW = ResourcesPackage.OBSERVATION_REFERENCE_RANGE__LOW;

	/**
	 * The feature id for the '<em><b>High</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGLYCERIDE_REFERENCE_RANGE1__HIGH = ResourcesPackage.OBSERVATION_REFERENCE_RANGE__HIGH;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGLYCERIDE_REFERENCE_RANGE1__TYPE = ResourcesPackage.OBSERVATION_REFERENCE_RANGE__TYPE;

	/**
	 * The feature id for the '<em><b>Applies To</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGLYCERIDE_REFERENCE_RANGE1__APPLIES_TO = ResourcesPackage.OBSERVATION_REFERENCE_RANGE__APPLIES_TO;

	/**
	 * The feature id for the '<em><b>Age</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGLYCERIDE_REFERENCE_RANGE1__AGE = ResourcesPackage.OBSERVATION_REFERENCE_RANGE__AGE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGLYCERIDE_REFERENCE_RANGE1__TEXT = ResourcesPackage.OBSERVATION_REFERENCE_RANGE__TEXT;

	/**
	 * The number of structural features of the '<em>Triglyceride Reference Range1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGLYCERIDE_REFERENCE_RANGE1_FEATURE_COUNT = ResourcesPackage.OBSERVATION_REFERENCE_RANGE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Triglyceride Reference Range1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGLYCERIDE_REFERENCE_RANGE1_OPERATION_COUNT = ResourcesPackage.OBSERVATION_REFERENCE_RANGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fhiRCore.profiles.impl.LdlcholesterolImpl <em>Ldlcholesterol</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.profiles.impl.LdlcholesterolImpl
	 * @see fhiRCore.profiles.impl.ProfilesPackageImpl#getLdlcholesterol()
	 * @generated
	 */
	int LDLCHOLESTEROL = 34;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LDLCHOLESTEROL__ID = ResourcesPackage.OBSERVATION__ID;

	/**
	 * The feature id for the '<em><b>Meta</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LDLCHOLESTEROL__META = ResourcesPackage.OBSERVATION__META;

	/**
	 * The feature id for the '<em><b>Implicit Rules</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LDLCHOLESTEROL__IMPLICIT_RULES = ResourcesPackage.OBSERVATION__IMPLICIT_RULES;

	/**
	 * The feature id for the '<em><b>Language</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LDLCHOLESTEROL__LANGUAGE = ResourcesPackage.OBSERVATION__LANGUAGE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LDLCHOLESTEROL__TEXT = ResourcesPackage.OBSERVATION__TEXT;

	/**
	 * The feature id for the '<em><b>Contained</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LDLCHOLESTEROL__CONTAINED = ResourcesPackage.OBSERVATION__CONTAINED;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LDLCHOLESTEROL__EXTENSION = ResourcesPackage.OBSERVATION__EXTENSION;

	/**
	 * The feature id for the '<em><b>Modifier Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LDLCHOLESTEROL__MODIFIER_EXTENSION = ResourcesPackage.OBSERVATION__MODIFIER_EXTENSION;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LDLCHOLESTEROL__IDENTIFIER = ResourcesPackage.OBSERVATION__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Based On</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LDLCHOLESTEROL__BASED_ON = ResourcesPackage.OBSERVATION__BASED_ON;

	/**
	 * The feature id for the '<em><b>Part Of</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LDLCHOLESTEROL__PART_OF = ResourcesPackage.OBSERVATION__PART_OF;

	/**
	 * The feature id for the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LDLCHOLESTEROL__STATUS = ResourcesPackage.OBSERVATION__STATUS;

	/**
	 * The feature id for the '<em><b>Category</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LDLCHOLESTEROL__CATEGORY = ResourcesPackage.OBSERVATION__CATEGORY;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LDLCHOLESTEROL__CODE = ResourcesPackage.OBSERVATION__CODE;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LDLCHOLESTEROL__SUBJECT = ResourcesPackage.OBSERVATION__SUBJECT;

	/**
	 * The feature id for the '<em><b>Focus</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LDLCHOLESTEROL__FOCUS = ResourcesPackage.OBSERVATION__FOCUS;

	/**
	 * The feature id for the '<em><b>Encounter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LDLCHOLESTEROL__ENCOUNTER = ResourcesPackage.OBSERVATION__ENCOUNTER;

	/**
	 * The feature id for the '<em><b>Effectivex</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LDLCHOLESTEROL__EFFECTIVEX = ResourcesPackage.OBSERVATION__EFFECTIVEX;

	/**
	 * The feature id for the '<em><b>Issued</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LDLCHOLESTEROL__ISSUED = ResourcesPackage.OBSERVATION__ISSUED;

	/**
	 * The feature id for the '<em><b>Performer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LDLCHOLESTEROL__PERFORMER = ResourcesPackage.OBSERVATION__PERFORMER;

	/**
	 * The feature id for the '<em><b>Valuex</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LDLCHOLESTEROL__VALUEX = ResourcesPackage.OBSERVATION__VALUEX;

	/**
	 * The feature id for the '<em><b>Data Absent Reason</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LDLCHOLESTEROL__DATA_ABSENT_REASON = ResourcesPackage.OBSERVATION__DATA_ABSENT_REASON;

	/**
	 * The feature id for the '<em><b>Interpretation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LDLCHOLESTEROL__INTERPRETATION = ResourcesPackage.OBSERVATION__INTERPRETATION;

	/**
	 * The feature id for the '<em><b>Note</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LDLCHOLESTEROL__NOTE = ResourcesPackage.OBSERVATION__NOTE;

	/**
	 * The feature id for the '<em><b>Body Site</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LDLCHOLESTEROL__BODY_SITE = ResourcesPackage.OBSERVATION__BODY_SITE;

	/**
	 * The feature id for the '<em><b>Method</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LDLCHOLESTEROL__METHOD = ResourcesPackage.OBSERVATION__METHOD;

	/**
	 * The feature id for the '<em><b>Specimen</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LDLCHOLESTEROL__SPECIMEN = ResourcesPackage.OBSERVATION__SPECIMEN;

	/**
	 * The feature id for the '<em><b>Device</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LDLCHOLESTEROL__DEVICE = ResourcesPackage.OBSERVATION__DEVICE;

	/**
	 * The feature id for the '<em><b>Has Member</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LDLCHOLESTEROL__HAS_MEMBER = ResourcesPackage.OBSERVATION__HAS_MEMBER;

	/**
	 * The feature id for the '<em><b>Derived From</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LDLCHOLESTEROL__DERIVED_FROM = ResourcesPackage.OBSERVATION__DERIVED_FROM;

	/**
	 * The feature id for the '<em><b>Component</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LDLCHOLESTEROL__COMPONENT = ResourcesPackage.OBSERVATION__COMPONENT;

	/**
	 * The feature id for the '<em><b>Reference Range</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LDLCHOLESTEROL__REFERENCE_RANGE = ResourcesPackage.OBSERVATION__REFERENCE_RANGE;

	/**
	 * The feature id for the '<em><b>Value Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LDLCHOLESTEROL__VALUE_QUANTITY = ResourcesPackage.OBSERVATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ldlcholesterol</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LDLCHOLESTEROL_FEATURE_COUNT = ResourcesPackage.OBSERVATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Ldlcholesterol</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LDLCHOLESTEROL_OPERATION_COUNT = ResourcesPackage.OBSERVATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fhiRCore.profiles.impl.LdlcholesterolReferenceRange1Impl <em>Ldlcholesterol Reference Range1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.profiles.impl.LdlcholesterolReferenceRange1Impl
	 * @see fhiRCore.profiles.impl.ProfilesPackageImpl#getLdlcholesterolReferenceRange1()
	 * @generated
	 */
	int LDLCHOLESTEROL_REFERENCE_RANGE1 = 35;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LDLCHOLESTEROL_REFERENCE_RANGE1__ID = ResourcesPackage.OBSERVATION_REFERENCE_RANGE__ID;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LDLCHOLESTEROL_REFERENCE_RANGE1__EXTENSION = ResourcesPackage.OBSERVATION_REFERENCE_RANGE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Modifier Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LDLCHOLESTEROL_REFERENCE_RANGE1__MODIFIER_EXTENSION = ResourcesPackage.OBSERVATION_REFERENCE_RANGE__MODIFIER_EXTENSION;

	/**
	 * The feature id for the '<em><b>Low</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LDLCHOLESTEROL_REFERENCE_RANGE1__LOW = ResourcesPackage.OBSERVATION_REFERENCE_RANGE__LOW;

	/**
	 * The feature id for the '<em><b>High</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LDLCHOLESTEROL_REFERENCE_RANGE1__HIGH = ResourcesPackage.OBSERVATION_REFERENCE_RANGE__HIGH;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LDLCHOLESTEROL_REFERENCE_RANGE1__TYPE = ResourcesPackage.OBSERVATION_REFERENCE_RANGE__TYPE;

	/**
	 * The feature id for the '<em><b>Applies To</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LDLCHOLESTEROL_REFERENCE_RANGE1__APPLIES_TO = ResourcesPackage.OBSERVATION_REFERENCE_RANGE__APPLIES_TO;

	/**
	 * The feature id for the '<em><b>Age</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LDLCHOLESTEROL_REFERENCE_RANGE1__AGE = ResourcesPackage.OBSERVATION_REFERENCE_RANGE__AGE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LDLCHOLESTEROL_REFERENCE_RANGE1__TEXT = ResourcesPackage.OBSERVATION_REFERENCE_RANGE__TEXT;

	/**
	 * The number of structural features of the '<em>Ldlcholesterol Reference Range1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LDLCHOLESTEROL_REFERENCE_RANGE1_FEATURE_COUNT = ResourcesPackage.OBSERVATION_REFERENCE_RANGE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Ldlcholesterol Reference Range1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LDLCHOLESTEROL_REFERENCE_RANGE1_OPERATION_COUNT = ResourcesPackage.OBSERVATION_REFERENCE_RANGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fhiRCore.profiles.impl.BodytempImpl <em>Bodytemp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.profiles.impl.BodytempImpl
	 * @see fhiRCore.profiles.impl.ProfilesPackageImpl#getBodytemp()
	 * @generated
	 */
	int BODYTEMP = 36;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODYTEMP__ID = VITALSIGNS__ID;

	/**
	 * The feature id for the '<em><b>Meta</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODYTEMP__META = VITALSIGNS__META;

	/**
	 * The feature id for the '<em><b>Implicit Rules</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODYTEMP__IMPLICIT_RULES = VITALSIGNS__IMPLICIT_RULES;

	/**
	 * The feature id for the '<em><b>Language</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODYTEMP__LANGUAGE = VITALSIGNS__LANGUAGE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODYTEMP__TEXT = VITALSIGNS__TEXT;

	/**
	 * The feature id for the '<em><b>Contained</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODYTEMP__CONTAINED = VITALSIGNS__CONTAINED;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODYTEMP__EXTENSION = VITALSIGNS__EXTENSION;

	/**
	 * The feature id for the '<em><b>Modifier Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODYTEMP__MODIFIER_EXTENSION = VITALSIGNS__MODIFIER_EXTENSION;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODYTEMP__IDENTIFIER = VITALSIGNS__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Based On</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODYTEMP__BASED_ON = VITALSIGNS__BASED_ON;

	/**
	 * The feature id for the '<em><b>Part Of</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODYTEMP__PART_OF = VITALSIGNS__PART_OF;

	/**
	 * The feature id for the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODYTEMP__STATUS = VITALSIGNS__STATUS;

	/**
	 * The feature id for the '<em><b>Category</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODYTEMP__CATEGORY = VITALSIGNS__CATEGORY;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODYTEMP__CODE = VITALSIGNS__CODE;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODYTEMP__SUBJECT = VITALSIGNS__SUBJECT;

	/**
	 * The feature id for the '<em><b>Focus</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODYTEMP__FOCUS = VITALSIGNS__FOCUS;

	/**
	 * The feature id for the '<em><b>Encounter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODYTEMP__ENCOUNTER = VITALSIGNS__ENCOUNTER;

	/**
	 * The feature id for the '<em><b>Effectivex</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODYTEMP__EFFECTIVEX = VITALSIGNS__EFFECTIVEX;

	/**
	 * The feature id for the '<em><b>Issued</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODYTEMP__ISSUED = VITALSIGNS__ISSUED;

	/**
	 * The feature id for the '<em><b>Performer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODYTEMP__PERFORMER = VITALSIGNS__PERFORMER;

	/**
	 * The feature id for the '<em><b>Valuex</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODYTEMP__VALUEX = VITALSIGNS__VALUEX;

	/**
	 * The feature id for the '<em><b>Data Absent Reason</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODYTEMP__DATA_ABSENT_REASON = VITALSIGNS__DATA_ABSENT_REASON;

	/**
	 * The feature id for the '<em><b>Interpretation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODYTEMP__INTERPRETATION = VITALSIGNS__INTERPRETATION;

	/**
	 * The feature id for the '<em><b>Note</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODYTEMP__NOTE = VITALSIGNS__NOTE;

	/**
	 * The feature id for the '<em><b>Body Site</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODYTEMP__BODY_SITE = VITALSIGNS__BODY_SITE;

	/**
	 * The feature id for the '<em><b>Method</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODYTEMP__METHOD = VITALSIGNS__METHOD;

	/**
	 * The feature id for the '<em><b>Specimen</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODYTEMP__SPECIMEN = VITALSIGNS__SPECIMEN;

	/**
	 * The feature id for the '<em><b>Device</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODYTEMP__DEVICE = VITALSIGNS__DEVICE;

	/**
	 * The feature id for the '<em><b>Has Member</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODYTEMP__HAS_MEMBER = VITALSIGNS__HAS_MEMBER;

	/**
	 * The feature id for the '<em><b>Derived From</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODYTEMP__DERIVED_FROM = VITALSIGNS__DERIVED_FROM;

	/**
	 * The feature id for the '<em><b>Component</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODYTEMP__COMPONENT = VITALSIGNS__COMPONENT;

	/**
	 * The feature id for the '<em><b>Reference Range</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODYTEMP__REFERENCE_RANGE = VITALSIGNS__REFERENCE_RANGE;

	/**
	 * The feature id for the '<em><b>Vs Cat</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODYTEMP__VS_CAT = VITALSIGNS__VS_CAT;

	/**
	 * The feature id for the '<em><b>Value Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODYTEMP__VALUE_QUANTITY = VITALSIGNS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Bodytemp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODYTEMP_FEATURE_COUNT = VITALSIGNS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Bodytemp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODYTEMP_OPERATION_COUNT = VITALSIGNS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fhiRCore.profiles.impl.BodytempCodeableConcept1Impl <em>Bodytemp Codeable Concept1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.profiles.impl.BodytempCodeableConcept1Impl
	 * @see fhiRCore.profiles.impl.ProfilesPackageImpl#getBodytempCodeableConcept1()
	 * @generated
	 */
	int BODYTEMP_CODEABLE_CONCEPT1 = 37;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODYTEMP_CODEABLE_CONCEPT1__ID = DataTypesPackage.CODEABLE_CONCEPT__ID;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODYTEMP_CODEABLE_CONCEPT1__EXTENSION = DataTypesPackage.CODEABLE_CONCEPT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Coding</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODYTEMP_CODEABLE_CONCEPT1__CODING = DataTypesPackage.CODEABLE_CONCEPT__CODING;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODYTEMP_CODEABLE_CONCEPT1__TEXT = DataTypesPackage.CODEABLE_CONCEPT__TEXT;

	/**
	 * The feature id for the '<em><b>Body Temp Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODYTEMP_CODEABLE_CONCEPT1__BODY_TEMP_CODE = DataTypesPackage.CODEABLE_CONCEPT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Bodytemp Codeable Concept1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODYTEMP_CODEABLE_CONCEPT1_FEATURE_COUNT = DataTypesPackage.CODEABLE_CONCEPT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Bodytemp Codeable Concept1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODYTEMP_CODEABLE_CONCEPT1_OPERATION_COUNT = DataTypesPackage.CODEABLE_CONCEPT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fhiRCore.profiles.impl.BodytempCodeableConcept1Coding1Impl <em>Bodytemp Codeable Concept1 Coding1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.profiles.impl.BodytempCodeableConcept1Coding1Impl
	 * @see fhiRCore.profiles.impl.ProfilesPackageImpl#getBodytempCodeableConcept1Coding1()
	 * @generated
	 */
	int BODYTEMP_CODEABLE_CONCEPT1_CODING1 = 38;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODYTEMP_CODEABLE_CONCEPT1_CODING1__ID = DataTypesPackage.CODING__ID;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODYTEMP_CODEABLE_CONCEPT1_CODING1__EXTENSION = DataTypesPackage.CODING__EXTENSION;

	/**
	 * The feature id for the '<em><b>System</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODYTEMP_CODEABLE_CONCEPT1_CODING1__SYSTEM = DataTypesPackage.CODING__SYSTEM;

	/**
	 * The feature id for the '<em><b>Version</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODYTEMP_CODEABLE_CONCEPT1_CODING1__VERSION = DataTypesPackage.CODING__VERSION;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODYTEMP_CODEABLE_CONCEPT1_CODING1__CODE = DataTypesPackage.CODING__CODE;

	/**
	 * The feature id for the '<em><b>Display</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODYTEMP_CODEABLE_CONCEPT1_CODING1__DISPLAY = DataTypesPackage.CODING__DISPLAY;

	/**
	 * The feature id for the '<em><b>User Selected</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODYTEMP_CODEABLE_CONCEPT1_CODING1__USER_SELECTED = DataTypesPackage.CODING__USER_SELECTED;

	/**
	 * The number of structural features of the '<em>Bodytemp Codeable Concept1 Coding1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODYTEMP_CODEABLE_CONCEPT1_CODING1_FEATURE_COUNT = DataTypesPackage.CODING_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Bodytemp Codeable Concept1 Coding1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODYTEMP_CODEABLE_CONCEPT1_CODING1_OPERATION_COUNT = DataTypesPackage.CODING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fhiRCore.profiles.impl.BodytempQuantity1Impl <em>Bodytemp Quantity1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.profiles.impl.BodytempQuantity1Impl
	 * @see fhiRCore.profiles.impl.ProfilesPackageImpl#getBodytempQuantity1()
	 * @generated
	 */
	int BODYTEMP_QUANTITY1 = 39;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODYTEMP_QUANTITY1__ID = DataTypesPackage.QUANTITY__ID;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODYTEMP_QUANTITY1__EXTENSION = DataTypesPackage.QUANTITY__EXTENSION;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODYTEMP_QUANTITY1__VALUE = DataTypesPackage.QUANTITY__VALUE;

	/**
	 * The feature id for the '<em><b>Comparator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODYTEMP_QUANTITY1__COMPARATOR = DataTypesPackage.QUANTITY__COMPARATOR;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODYTEMP_QUANTITY1__UNIT = DataTypesPackage.QUANTITY__UNIT;

	/**
	 * The feature id for the '<em><b>System</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODYTEMP_QUANTITY1__SYSTEM = DataTypesPackage.QUANTITY__SYSTEM;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODYTEMP_QUANTITY1__CODE = DataTypesPackage.QUANTITY__CODE;

	/**
	 * The number of structural features of the '<em>Bodytemp Quantity1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODYTEMP_QUANTITY1_FEATURE_COUNT = DataTypesPackage.QUANTITY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Bodytemp Quantity1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODYTEMP_QUANTITY1_OPERATION_COUNT = DataTypesPackage.QUANTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fhiRCore.profiles.impl.MetadataResourceImpl <em>Metadata Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.profiles.impl.MetadataResourceImpl
	 * @see fhiRCore.profiles.impl.ProfilesPackageImpl#getMetadataResource()
	 * @generated
	 */
	int METADATA_RESOURCE = 40;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA_RESOURCE__ID = ResourcesPackage.DOMAIN_RESOURCE__ID;

	/**
	 * The feature id for the '<em><b>Meta</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA_RESOURCE__META = ResourcesPackage.DOMAIN_RESOURCE__META;

	/**
	 * The feature id for the '<em><b>Implicit Rules</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA_RESOURCE__IMPLICIT_RULES = ResourcesPackage.DOMAIN_RESOURCE__IMPLICIT_RULES;

	/**
	 * The feature id for the '<em><b>Language</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA_RESOURCE__LANGUAGE = ResourcesPackage.DOMAIN_RESOURCE__LANGUAGE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA_RESOURCE__TEXT = ResourcesPackage.DOMAIN_RESOURCE__TEXT;

	/**
	 * The feature id for the '<em><b>Contained</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA_RESOURCE__CONTAINED = ResourcesPackage.DOMAIN_RESOURCE__CONTAINED;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA_RESOURCE__EXTENSION = ResourcesPackage.DOMAIN_RESOURCE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Modifier Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA_RESOURCE__MODIFIER_EXTENSION = ResourcesPackage.DOMAIN_RESOURCE__MODIFIER_EXTENSION;

	/**
	 * The feature id for the '<em><b>Url</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA_RESOURCE__URL = ResourcesPackage.DOMAIN_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Version</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA_RESOURCE__VERSION = ResourcesPackage.DOMAIN_RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA_RESOURCE__NAME = ResourcesPackage.DOMAIN_RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA_RESOURCE__TITLE = ResourcesPackage.DOMAIN_RESOURCE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA_RESOURCE__STATUS = ResourcesPackage.DOMAIN_RESOURCE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Experimental</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA_RESOURCE__EXPERIMENTAL = ResourcesPackage.DOMAIN_RESOURCE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA_RESOURCE__DATE = ResourcesPackage.DOMAIN_RESOURCE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Publisher</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA_RESOURCE__PUBLISHER = ResourcesPackage.DOMAIN_RESOURCE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Contact</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA_RESOURCE__CONTACT = ResourcesPackage.DOMAIN_RESOURCE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA_RESOURCE__DESCRIPTION = ResourcesPackage.DOMAIN_RESOURCE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Use Context</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA_RESOURCE__USE_CONTEXT = ResourcesPackage.DOMAIN_RESOURCE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Jurisdiction</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA_RESOURCE__JURISDICTION = ResourcesPackage.DOMAIN_RESOURCE_FEATURE_COUNT + 11;

	/**
	 * The number of structural features of the '<em>Metadata Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA_RESOURCE_FEATURE_COUNT = ResourcesPackage.DOMAIN_RESOURCE_FEATURE_COUNT + 12;

	/**
	 * The number of operations of the '<em>Metadata Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA_RESOURCE_OPERATION_COUNT = ResourcesPackage.DOMAIN_RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fhiRCore.profiles.impl.HeartrateImpl <em>Heartrate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.profiles.impl.HeartrateImpl
	 * @see fhiRCore.profiles.impl.ProfilesPackageImpl#getHeartrate()
	 * @generated
	 */
	int HEARTRATE = 41;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEARTRATE__ID = VITALSIGNS__ID;

	/**
	 * The feature id for the '<em><b>Meta</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEARTRATE__META = VITALSIGNS__META;

	/**
	 * The feature id for the '<em><b>Implicit Rules</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEARTRATE__IMPLICIT_RULES = VITALSIGNS__IMPLICIT_RULES;

	/**
	 * The feature id for the '<em><b>Language</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEARTRATE__LANGUAGE = VITALSIGNS__LANGUAGE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEARTRATE__TEXT = VITALSIGNS__TEXT;

	/**
	 * The feature id for the '<em><b>Contained</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEARTRATE__CONTAINED = VITALSIGNS__CONTAINED;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEARTRATE__EXTENSION = VITALSIGNS__EXTENSION;

	/**
	 * The feature id for the '<em><b>Modifier Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEARTRATE__MODIFIER_EXTENSION = VITALSIGNS__MODIFIER_EXTENSION;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEARTRATE__IDENTIFIER = VITALSIGNS__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Based On</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEARTRATE__BASED_ON = VITALSIGNS__BASED_ON;

	/**
	 * The feature id for the '<em><b>Part Of</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEARTRATE__PART_OF = VITALSIGNS__PART_OF;

	/**
	 * The feature id for the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEARTRATE__STATUS = VITALSIGNS__STATUS;

	/**
	 * The feature id for the '<em><b>Category</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEARTRATE__CATEGORY = VITALSIGNS__CATEGORY;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEARTRATE__CODE = VITALSIGNS__CODE;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEARTRATE__SUBJECT = VITALSIGNS__SUBJECT;

	/**
	 * The feature id for the '<em><b>Focus</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEARTRATE__FOCUS = VITALSIGNS__FOCUS;

	/**
	 * The feature id for the '<em><b>Encounter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEARTRATE__ENCOUNTER = VITALSIGNS__ENCOUNTER;

	/**
	 * The feature id for the '<em><b>Effectivex</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEARTRATE__EFFECTIVEX = VITALSIGNS__EFFECTIVEX;

	/**
	 * The feature id for the '<em><b>Issued</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEARTRATE__ISSUED = VITALSIGNS__ISSUED;

	/**
	 * The feature id for the '<em><b>Performer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEARTRATE__PERFORMER = VITALSIGNS__PERFORMER;

	/**
	 * The feature id for the '<em><b>Valuex</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEARTRATE__VALUEX = VITALSIGNS__VALUEX;

	/**
	 * The feature id for the '<em><b>Data Absent Reason</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEARTRATE__DATA_ABSENT_REASON = VITALSIGNS__DATA_ABSENT_REASON;

	/**
	 * The feature id for the '<em><b>Interpretation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEARTRATE__INTERPRETATION = VITALSIGNS__INTERPRETATION;

	/**
	 * The feature id for the '<em><b>Note</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEARTRATE__NOTE = VITALSIGNS__NOTE;

	/**
	 * The feature id for the '<em><b>Body Site</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEARTRATE__BODY_SITE = VITALSIGNS__BODY_SITE;

	/**
	 * The feature id for the '<em><b>Method</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEARTRATE__METHOD = VITALSIGNS__METHOD;

	/**
	 * The feature id for the '<em><b>Specimen</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEARTRATE__SPECIMEN = VITALSIGNS__SPECIMEN;

	/**
	 * The feature id for the '<em><b>Device</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEARTRATE__DEVICE = VITALSIGNS__DEVICE;

	/**
	 * The feature id for the '<em><b>Has Member</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEARTRATE__HAS_MEMBER = VITALSIGNS__HAS_MEMBER;

	/**
	 * The feature id for the '<em><b>Derived From</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEARTRATE__DERIVED_FROM = VITALSIGNS__DERIVED_FROM;

	/**
	 * The feature id for the '<em><b>Component</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEARTRATE__COMPONENT = VITALSIGNS__COMPONENT;

	/**
	 * The feature id for the '<em><b>Reference Range</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEARTRATE__REFERENCE_RANGE = VITALSIGNS__REFERENCE_RANGE;

	/**
	 * The feature id for the '<em><b>Vs Cat</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEARTRATE__VS_CAT = VITALSIGNS__VS_CAT;

	/**
	 * The feature id for the '<em><b>Value Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEARTRATE__VALUE_QUANTITY = VITALSIGNS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Heartrate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEARTRATE_FEATURE_COUNT = VITALSIGNS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Heartrate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEARTRATE_OPERATION_COUNT = VITALSIGNS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fhiRCore.profiles.impl.HeartrateCodeableConcept1Impl <em>Heartrate Codeable Concept1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.profiles.impl.HeartrateCodeableConcept1Impl
	 * @see fhiRCore.profiles.impl.ProfilesPackageImpl#getHeartrateCodeableConcept1()
	 * @generated
	 */
	int HEARTRATE_CODEABLE_CONCEPT1 = 42;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEARTRATE_CODEABLE_CONCEPT1__ID = DataTypesPackage.CODEABLE_CONCEPT__ID;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEARTRATE_CODEABLE_CONCEPT1__EXTENSION = DataTypesPackage.CODEABLE_CONCEPT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Coding</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEARTRATE_CODEABLE_CONCEPT1__CODING = DataTypesPackage.CODEABLE_CONCEPT__CODING;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEARTRATE_CODEABLE_CONCEPT1__TEXT = DataTypesPackage.CODEABLE_CONCEPT__TEXT;

	/**
	 * The feature id for the '<em><b>Heart Rate Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEARTRATE_CODEABLE_CONCEPT1__HEART_RATE_CODE = DataTypesPackage.CODEABLE_CONCEPT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Heartrate Codeable Concept1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEARTRATE_CODEABLE_CONCEPT1_FEATURE_COUNT = DataTypesPackage.CODEABLE_CONCEPT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Heartrate Codeable Concept1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEARTRATE_CODEABLE_CONCEPT1_OPERATION_COUNT = DataTypesPackage.CODEABLE_CONCEPT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fhiRCore.profiles.impl.HeartrateCodeableConcept1Coding1Impl <em>Heartrate Codeable Concept1 Coding1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.profiles.impl.HeartrateCodeableConcept1Coding1Impl
	 * @see fhiRCore.profiles.impl.ProfilesPackageImpl#getHeartrateCodeableConcept1Coding1()
	 * @generated
	 */
	int HEARTRATE_CODEABLE_CONCEPT1_CODING1 = 43;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEARTRATE_CODEABLE_CONCEPT1_CODING1__ID = DataTypesPackage.CODING__ID;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEARTRATE_CODEABLE_CONCEPT1_CODING1__EXTENSION = DataTypesPackage.CODING__EXTENSION;

	/**
	 * The feature id for the '<em><b>System</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEARTRATE_CODEABLE_CONCEPT1_CODING1__SYSTEM = DataTypesPackage.CODING__SYSTEM;

	/**
	 * The feature id for the '<em><b>Version</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEARTRATE_CODEABLE_CONCEPT1_CODING1__VERSION = DataTypesPackage.CODING__VERSION;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEARTRATE_CODEABLE_CONCEPT1_CODING1__CODE = DataTypesPackage.CODING__CODE;

	/**
	 * The feature id for the '<em><b>Display</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEARTRATE_CODEABLE_CONCEPT1_CODING1__DISPLAY = DataTypesPackage.CODING__DISPLAY;

	/**
	 * The feature id for the '<em><b>User Selected</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEARTRATE_CODEABLE_CONCEPT1_CODING1__USER_SELECTED = DataTypesPackage.CODING__USER_SELECTED;

	/**
	 * The number of structural features of the '<em>Heartrate Codeable Concept1 Coding1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEARTRATE_CODEABLE_CONCEPT1_CODING1_FEATURE_COUNT = DataTypesPackage.CODING_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Heartrate Codeable Concept1 Coding1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEARTRATE_CODEABLE_CONCEPT1_CODING1_OPERATION_COUNT = DataTypesPackage.CODING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fhiRCore.profiles.impl.HeartrateQuantity1Impl <em>Heartrate Quantity1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.profiles.impl.HeartrateQuantity1Impl
	 * @see fhiRCore.profiles.impl.ProfilesPackageImpl#getHeartrateQuantity1()
	 * @generated
	 */
	int HEARTRATE_QUANTITY1 = 44;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEARTRATE_QUANTITY1__ID = DataTypesPackage.QUANTITY__ID;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEARTRATE_QUANTITY1__EXTENSION = DataTypesPackage.QUANTITY__EXTENSION;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEARTRATE_QUANTITY1__VALUE = DataTypesPackage.QUANTITY__VALUE;

	/**
	 * The feature id for the '<em><b>Comparator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEARTRATE_QUANTITY1__COMPARATOR = DataTypesPackage.QUANTITY__COMPARATOR;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEARTRATE_QUANTITY1__UNIT = DataTypesPackage.QUANTITY__UNIT;

	/**
	 * The feature id for the '<em><b>System</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEARTRATE_QUANTITY1__SYSTEM = DataTypesPackage.QUANTITY__SYSTEM;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEARTRATE_QUANTITY1__CODE = DataTypesPackage.QUANTITY__CODE;

	/**
	 * The number of structural features of the '<em>Heartrate Quantity1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEARTRATE_QUANTITY1_FEATURE_COUNT = DataTypesPackage.QUANTITY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Heartrate Quantity1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEARTRATE_QUANTITY1_OPERATION_COUNT = DataTypesPackage.QUANTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fhiRCore.profiles.impl.BodyheightImpl <em>Bodyheight</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.profiles.impl.BodyheightImpl
	 * @see fhiRCore.profiles.impl.ProfilesPackageImpl#getBodyheight()
	 * @generated
	 */
	int BODYHEIGHT = 45;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODYHEIGHT__ID = VITALSIGNS__ID;

	/**
	 * The feature id for the '<em><b>Meta</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODYHEIGHT__META = VITALSIGNS__META;

	/**
	 * The feature id for the '<em><b>Implicit Rules</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODYHEIGHT__IMPLICIT_RULES = VITALSIGNS__IMPLICIT_RULES;

	/**
	 * The feature id for the '<em><b>Language</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODYHEIGHT__LANGUAGE = VITALSIGNS__LANGUAGE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODYHEIGHT__TEXT = VITALSIGNS__TEXT;

	/**
	 * The feature id for the '<em><b>Contained</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODYHEIGHT__CONTAINED = VITALSIGNS__CONTAINED;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODYHEIGHT__EXTENSION = VITALSIGNS__EXTENSION;

	/**
	 * The feature id for the '<em><b>Modifier Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODYHEIGHT__MODIFIER_EXTENSION = VITALSIGNS__MODIFIER_EXTENSION;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODYHEIGHT__IDENTIFIER = VITALSIGNS__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Based On</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODYHEIGHT__BASED_ON = VITALSIGNS__BASED_ON;

	/**
	 * The feature id for the '<em><b>Part Of</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODYHEIGHT__PART_OF = VITALSIGNS__PART_OF;

	/**
	 * The feature id for the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODYHEIGHT__STATUS = VITALSIGNS__STATUS;

	/**
	 * The feature id for the '<em><b>Category</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODYHEIGHT__CATEGORY = VITALSIGNS__CATEGORY;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODYHEIGHT__CODE = VITALSIGNS__CODE;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODYHEIGHT__SUBJECT = VITALSIGNS__SUBJECT;

	/**
	 * The feature id for the '<em><b>Focus</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODYHEIGHT__FOCUS = VITALSIGNS__FOCUS;

	/**
	 * The feature id for the '<em><b>Encounter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODYHEIGHT__ENCOUNTER = VITALSIGNS__ENCOUNTER;

	/**
	 * The feature id for the '<em><b>Effectivex</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODYHEIGHT__EFFECTIVEX = VITALSIGNS__EFFECTIVEX;

	/**
	 * The feature id for the '<em><b>Issued</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODYHEIGHT__ISSUED = VITALSIGNS__ISSUED;

	/**
	 * The feature id for the '<em><b>Performer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODYHEIGHT__PERFORMER = VITALSIGNS__PERFORMER;

	/**
	 * The feature id for the '<em><b>Valuex</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODYHEIGHT__VALUEX = VITALSIGNS__VALUEX;

	/**
	 * The feature id for the '<em><b>Data Absent Reason</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODYHEIGHT__DATA_ABSENT_REASON = VITALSIGNS__DATA_ABSENT_REASON;

	/**
	 * The feature id for the '<em><b>Interpretation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODYHEIGHT__INTERPRETATION = VITALSIGNS__INTERPRETATION;

	/**
	 * The feature id for the '<em><b>Note</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODYHEIGHT__NOTE = VITALSIGNS__NOTE;

	/**
	 * The feature id for the '<em><b>Body Site</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODYHEIGHT__BODY_SITE = VITALSIGNS__BODY_SITE;

	/**
	 * The feature id for the '<em><b>Method</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODYHEIGHT__METHOD = VITALSIGNS__METHOD;

	/**
	 * The feature id for the '<em><b>Specimen</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODYHEIGHT__SPECIMEN = VITALSIGNS__SPECIMEN;

	/**
	 * The feature id for the '<em><b>Device</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODYHEIGHT__DEVICE = VITALSIGNS__DEVICE;

	/**
	 * The feature id for the '<em><b>Has Member</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODYHEIGHT__HAS_MEMBER = VITALSIGNS__HAS_MEMBER;

	/**
	 * The feature id for the '<em><b>Derived From</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODYHEIGHT__DERIVED_FROM = VITALSIGNS__DERIVED_FROM;

	/**
	 * The feature id for the '<em><b>Component</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODYHEIGHT__COMPONENT = VITALSIGNS__COMPONENT;

	/**
	 * The feature id for the '<em><b>Reference Range</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODYHEIGHT__REFERENCE_RANGE = VITALSIGNS__REFERENCE_RANGE;

	/**
	 * The feature id for the '<em><b>Vs Cat</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODYHEIGHT__VS_CAT = VITALSIGNS__VS_CAT;

	/**
	 * The feature id for the '<em><b>Value Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODYHEIGHT__VALUE_QUANTITY = VITALSIGNS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Bodyheight</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODYHEIGHT_FEATURE_COUNT = VITALSIGNS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Bodyheight</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODYHEIGHT_OPERATION_COUNT = VITALSIGNS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fhiRCore.profiles.impl.BodyheightCodeableConcept1Impl <em>Bodyheight Codeable Concept1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.profiles.impl.BodyheightCodeableConcept1Impl
	 * @see fhiRCore.profiles.impl.ProfilesPackageImpl#getBodyheightCodeableConcept1()
	 * @generated
	 */
	int BODYHEIGHT_CODEABLE_CONCEPT1 = 46;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODYHEIGHT_CODEABLE_CONCEPT1__ID = DataTypesPackage.CODEABLE_CONCEPT__ID;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODYHEIGHT_CODEABLE_CONCEPT1__EXTENSION = DataTypesPackage.CODEABLE_CONCEPT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Coding</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODYHEIGHT_CODEABLE_CONCEPT1__CODING = DataTypesPackage.CODEABLE_CONCEPT__CODING;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODYHEIGHT_CODEABLE_CONCEPT1__TEXT = DataTypesPackage.CODEABLE_CONCEPT__TEXT;

	/**
	 * The feature id for the '<em><b>Body Height Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODYHEIGHT_CODEABLE_CONCEPT1__BODY_HEIGHT_CODE = DataTypesPackage.CODEABLE_CONCEPT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Bodyheight Codeable Concept1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODYHEIGHT_CODEABLE_CONCEPT1_FEATURE_COUNT = DataTypesPackage.CODEABLE_CONCEPT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Bodyheight Codeable Concept1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODYHEIGHT_CODEABLE_CONCEPT1_OPERATION_COUNT = DataTypesPackage.CODEABLE_CONCEPT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fhiRCore.profiles.impl.BodyheightCodeableConcept1Coding1Impl <em>Bodyheight Codeable Concept1 Coding1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.profiles.impl.BodyheightCodeableConcept1Coding1Impl
	 * @see fhiRCore.profiles.impl.ProfilesPackageImpl#getBodyheightCodeableConcept1Coding1()
	 * @generated
	 */
	int BODYHEIGHT_CODEABLE_CONCEPT1_CODING1 = 47;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODYHEIGHT_CODEABLE_CONCEPT1_CODING1__ID = DataTypesPackage.CODING__ID;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODYHEIGHT_CODEABLE_CONCEPT1_CODING1__EXTENSION = DataTypesPackage.CODING__EXTENSION;

	/**
	 * The feature id for the '<em><b>System</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODYHEIGHT_CODEABLE_CONCEPT1_CODING1__SYSTEM = DataTypesPackage.CODING__SYSTEM;

	/**
	 * The feature id for the '<em><b>Version</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODYHEIGHT_CODEABLE_CONCEPT1_CODING1__VERSION = DataTypesPackage.CODING__VERSION;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODYHEIGHT_CODEABLE_CONCEPT1_CODING1__CODE = DataTypesPackage.CODING__CODE;

	/**
	 * The feature id for the '<em><b>Display</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODYHEIGHT_CODEABLE_CONCEPT1_CODING1__DISPLAY = DataTypesPackage.CODING__DISPLAY;

	/**
	 * The feature id for the '<em><b>User Selected</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODYHEIGHT_CODEABLE_CONCEPT1_CODING1__USER_SELECTED = DataTypesPackage.CODING__USER_SELECTED;

	/**
	 * The number of structural features of the '<em>Bodyheight Codeable Concept1 Coding1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODYHEIGHT_CODEABLE_CONCEPT1_CODING1_FEATURE_COUNT = DataTypesPackage.CODING_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Bodyheight Codeable Concept1 Coding1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODYHEIGHT_CODEABLE_CONCEPT1_CODING1_OPERATION_COUNT = DataTypesPackage.CODING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fhiRCore.profiles.impl.BodyheightQuantity1Impl <em>Bodyheight Quantity1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.profiles.impl.BodyheightQuantity1Impl
	 * @see fhiRCore.profiles.impl.ProfilesPackageImpl#getBodyheightQuantity1()
	 * @generated
	 */
	int BODYHEIGHT_QUANTITY1 = 48;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODYHEIGHT_QUANTITY1__ID = DataTypesPackage.QUANTITY__ID;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODYHEIGHT_QUANTITY1__EXTENSION = DataTypesPackage.QUANTITY__EXTENSION;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODYHEIGHT_QUANTITY1__VALUE = DataTypesPackage.QUANTITY__VALUE;

	/**
	 * The feature id for the '<em><b>Comparator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODYHEIGHT_QUANTITY1__COMPARATOR = DataTypesPackage.QUANTITY__COMPARATOR;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODYHEIGHT_QUANTITY1__UNIT = DataTypesPackage.QUANTITY__UNIT;

	/**
	 * The feature id for the '<em><b>System</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODYHEIGHT_QUANTITY1__SYSTEM = DataTypesPackage.QUANTITY__SYSTEM;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODYHEIGHT_QUANTITY1__CODE = DataTypesPackage.QUANTITY__CODE;

	/**
	 * The number of structural features of the '<em>Bodyheight Quantity1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODYHEIGHT_QUANTITY1_FEATURE_COUNT = DataTypesPackage.QUANTITY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Bodyheight Quantity1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODYHEIGHT_QUANTITY1_OPERATION_COUNT = DataTypesPackage.QUANTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fhiRCore.profiles.impl.ElementdefinitiondeImpl <em>Elementdefinitionde</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.profiles.impl.ElementdefinitiondeImpl
	 * @see fhiRCore.profiles.impl.ProfilesPackageImpl#getElementdefinitionde()
	 * @generated
	 */
	int ELEMENTDEFINITIONDE = 49;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTDEFINITIONDE__ID = DataTypesPackage.ELEMENT_DEFINITION__ID;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTDEFINITIONDE__EXTENSION = DataTypesPackage.ELEMENT_DEFINITION__EXTENSION;

	/**
	 * The feature id for the '<em><b>Modifier Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTDEFINITIONDE__MODIFIER_EXTENSION = DataTypesPackage.ELEMENT_DEFINITION__MODIFIER_EXTENSION;

	/**
	 * The feature id for the '<em><b>Path</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTDEFINITIONDE__PATH = DataTypesPackage.ELEMENT_DEFINITION__PATH;

	/**
	 * The feature id for the '<em><b>Representation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTDEFINITIONDE__REPRESENTATION = DataTypesPackage.ELEMENT_DEFINITION__REPRESENTATION;

	/**
	 * The feature id for the '<em><b>Slice Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTDEFINITIONDE__SLICE_NAME = DataTypesPackage.ELEMENT_DEFINITION__SLICE_NAME;

	/**
	 * The feature id for the '<em><b>Slice Is Constraining</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTDEFINITIONDE__SLICE_IS_CONSTRAINING = DataTypesPackage.ELEMENT_DEFINITION__SLICE_IS_CONSTRAINING;

	/**
	 * The feature id for the '<em><b>Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTDEFINITIONDE__LABEL = DataTypesPackage.ELEMENT_DEFINITION__LABEL;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTDEFINITIONDE__CODE = DataTypesPackage.ELEMENT_DEFINITION__CODE;

	/**
	 * The feature id for the '<em><b>Slicing</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTDEFINITIONDE__SLICING = DataTypesPackage.ELEMENT_DEFINITION__SLICING;

	/**
	 * The feature id for the '<em><b>Short</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTDEFINITIONDE__SHORT = DataTypesPackage.ELEMENT_DEFINITION__SHORT;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTDEFINITIONDE__DEFINITION = DataTypesPackage.ELEMENT_DEFINITION__DEFINITION;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTDEFINITIONDE__COMMENT = DataTypesPackage.ELEMENT_DEFINITION__COMMENT;

	/**
	 * The feature id for the '<em><b>Requirements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTDEFINITIONDE__REQUIREMENTS = DataTypesPackage.ELEMENT_DEFINITION__REQUIREMENTS;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTDEFINITIONDE__ALIAS = DataTypesPackage.ELEMENT_DEFINITION__ALIAS;

	/**
	 * The feature id for the '<em><b>Min</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTDEFINITIONDE__MIN = DataTypesPackage.ELEMENT_DEFINITION__MIN;

	/**
	 * The feature id for the '<em><b>Max</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTDEFINITIONDE__MAX = DataTypesPackage.ELEMENT_DEFINITION__MAX;

	/**
	 * The feature id for the '<em><b>Base</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTDEFINITIONDE__BASE = DataTypesPackage.ELEMENT_DEFINITION__BASE;

	/**
	 * The feature id for the '<em><b>Content Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTDEFINITIONDE__CONTENT_REFERENCE = DataTypesPackage.ELEMENT_DEFINITION__CONTENT_REFERENCE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTDEFINITIONDE__TYPE = DataTypesPackage.ELEMENT_DEFINITION__TYPE;

	/**
	 * The feature id for the '<em><b>Default Valuex</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTDEFINITIONDE__DEFAULT_VALUEX = DataTypesPackage.ELEMENT_DEFINITION__DEFAULT_VALUEX;

	/**
	 * The feature id for the '<em><b>Meaning When Missing</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTDEFINITIONDE__MEANING_WHEN_MISSING = DataTypesPackage.ELEMENT_DEFINITION__MEANING_WHEN_MISSING;

	/**
	 * The feature id for the '<em><b>Order Meaning</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTDEFINITIONDE__ORDER_MEANING = DataTypesPackage.ELEMENT_DEFINITION__ORDER_MEANING;

	/**
	 * The feature id for the '<em><b>Fixedx</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTDEFINITIONDE__FIXEDX = DataTypesPackage.ELEMENT_DEFINITION__FIXEDX;

	/**
	 * The feature id for the '<em><b>Patternx</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTDEFINITIONDE__PATTERNX = DataTypesPackage.ELEMENT_DEFINITION__PATTERNX;

	/**
	 * The feature id for the '<em><b>Example</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTDEFINITIONDE__EXAMPLE = DataTypesPackage.ELEMENT_DEFINITION__EXAMPLE;

	/**
	 * The feature id for the '<em><b>Min Valuex</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTDEFINITIONDE__MIN_VALUEX = DataTypesPackage.ELEMENT_DEFINITION__MIN_VALUEX;

	/**
	 * The feature id for the '<em><b>Max Valuex</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTDEFINITIONDE__MAX_VALUEX = DataTypesPackage.ELEMENT_DEFINITION__MAX_VALUEX;

	/**
	 * The feature id for the '<em><b>Max Length</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTDEFINITIONDE__MAX_LENGTH = DataTypesPackage.ELEMENT_DEFINITION__MAX_LENGTH;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTDEFINITIONDE__CONDITION = DataTypesPackage.ELEMENT_DEFINITION__CONDITION;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTDEFINITIONDE__CONSTRAINT = DataTypesPackage.ELEMENT_DEFINITION__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Must Support</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTDEFINITIONDE__MUST_SUPPORT = DataTypesPackage.ELEMENT_DEFINITION__MUST_SUPPORT;

	/**
	 * The feature id for the '<em><b>Is Modifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTDEFINITIONDE__IS_MODIFIER = DataTypesPackage.ELEMENT_DEFINITION__IS_MODIFIER;

	/**
	 * The feature id for the '<em><b>Is Modifier Reason</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTDEFINITIONDE__IS_MODIFIER_REASON = DataTypesPackage.ELEMENT_DEFINITION__IS_MODIFIER_REASON;

	/**
	 * The feature id for the '<em><b>Is Summary</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTDEFINITIONDE__IS_SUMMARY = DataTypesPackage.ELEMENT_DEFINITION__IS_SUMMARY;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTDEFINITIONDE__BINDING = DataTypesPackage.ELEMENT_DEFINITION__BINDING;

	/**
	 * The feature id for the '<em><b>Mapping</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTDEFINITIONDE__MAPPING = DataTypesPackage.ELEMENT_DEFINITION__MAPPING;

	/**
	 * The number of structural features of the '<em>Elementdefinitionde</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTDEFINITIONDE_FEATURE_COUNT = DataTypesPackage.ELEMENT_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Elementdefinitionde</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTDEFINITIONDE_OPERATION_COUNT = DataTypesPackage.ELEMENT_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fhiRCore.profiles.impl.ElementdefinitiondeElement31Impl <em>Elementdefinitionde Element31</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.profiles.impl.ElementdefinitiondeElement31Impl
	 * @see fhiRCore.profiles.impl.ProfilesPackageImpl#getElementdefinitiondeElement31()
	 * @generated
	 */
	int ELEMENTDEFINITIONDE_ELEMENT31 = 50;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTDEFINITIONDE_ELEMENT31__ID = DataTypesPackage.ELEMENT_DEFINITION_ELEMENT3__ID;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTDEFINITIONDE_ELEMENT31__EXTENSION = DataTypesPackage.ELEMENT_DEFINITION_ELEMENT3__EXTENSION;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTDEFINITIONDE_ELEMENT31__CODE = DataTypesPackage.ELEMENT_DEFINITION_ELEMENT3__CODE;

	/**
	 * The feature id for the '<em><b>Profile</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTDEFINITIONDE_ELEMENT31__PROFILE = DataTypesPackage.ELEMENT_DEFINITION_ELEMENT3__PROFILE;

	/**
	 * The feature id for the '<em><b>Target Profile</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTDEFINITIONDE_ELEMENT31__TARGET_PROFILE = DataTypesPackage.ELEMENT_DEFINITION_ELEMENT3__TARGET_PROFILE;

	/**
	 * The feature id for the '<em><b>Aggregation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTDEFINITIONDE_ELEMENT31__AGGREGATION = DataTypesPackage.ELEMENT_DEFINITION_ELEMENT3__AGGREGATION;

	/**
	 * The feature id for the '<em><b>Versioning</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTDEFINITIONDE_ELEMENT31__VERSIONING = DataTypesPackage.ELEMENT_DEFINITION_ELEMENT3__VERSIONING;

	/**
	 * The number of structural features of the '<em>Elementdefinitionde Element31</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTDEFINITIONDE_ELEMENT31_FEATURE_COUNT = DataTypesPackage.ELEMENT_DEFINITION_ELEMENT3_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Elementdefinitionde Element31</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTDEFINITIONDE_ELEMENT31_OPERATION_COUNT = DataTypesPackage.ELEMENT_DEFINITION_ELEMENT3_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fhiRCore.profiles.impl.DiagnosticreportgeneticsImpl <em>Diagnosticreportgenetics</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.profiles.impl.DiagnosticreportgeneticsImpl
	 * @see fhiRCore.profiles.impl.ProfilesPackageImpl#getDiagnosticreportgenetics()
	 * @generated
	 */
	int DIAGNOSTICREPORTGENETICS = 51;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGNOSTICREPORTGENETICS__ID = ResourcesPackage.DIAGNOSTIC_REPORT__ID;

	/**
	 * The feature id for the '<em><b>Meta</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGNOSTICREPORTGENETICS__META = ResourcesPackage.DIAGNOSTIC_REPORT__META;

	/**
	 * The feature id for the '<em><b>Implicit Rules</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGNOSTICREPORTGENETICS__IMPLICIT_RULES = ResourcesPackage.DIAGNOSTIC_REPORT__IMPLICIT_RULES;

	/**
	 * The feature id for the '<em><b>Language</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGNOSTICREPORTGENETICS__LANGUAGE = ResourcesPackage.DIAGNOSTIC_REPORT__LANGUAGE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGNOSTICREPORTGENETICS__TEXT = ResourcesPackage.DIAGNOSTIC_REPORT__TEXT;

	/**
	 * The feature id for the '<em><b>Contained</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGNOSTICREPORTGENETICS__CONTAINED = ResourcesPackage.DIAGNOSTIC_REPORT__CONTAINED;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGNOSTICREPORTGENETICS__EXTENSION = ResourcesPackage.DIAGNOSTIC_REPORT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Modifier Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGNOSTICREPORTGENETICS__MODIFIER_EXTENSION = ResourcesPackage.DIAGNOSTIC_REPORT__MODIFIER_EXTENSION;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGNOSTICREPORTGENETICS__IDENTIFIER = ResourcesPackage.DIAGNOSTIC_REPORT__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Based On</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGNOSTICREPORTGENETICS__BASED_ON = ResourcesPackage.DIAGNOSTIC_REPORT__BASED_ON;

	/**
	 * The feature id for the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGNOSTICREPORTGENETICS__STATUS = ResourcesPackage.DIAGNOSTIC_REPORT__STATUS;

	/**
	 * The feature id for the '<em><b>Category</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGNOSTICREPORTGENETICS__CATEGORY = ResourcesPackage.DIAGNOSTIC_REPORT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGNOSTICREPORTGENETICS__CODE = ResourcesPackage.DIAGNOSTIC_REPORT__CODE;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGNOSTICREPORTGENETICS__SUBJECT = ResourcesPackage.DIAGNOSTIC_REPORT__SUBJECT;

	/**
	 * The feature id for the '<em><b>Encounter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGNOSTICREPORTGENETICS__ENCOUNTER = ResourcesPackage.DIAGNOSTIC_REPORT__ENCOUNTER;

	/**
	 * The feature id for the '<em><b>Effectivex</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGNOSTICREPORTGENETICS__EFFECTIVEX = ResourcesPackage.DIAGNOSTIC_REPORT__EFFECTIVEX;

	/**
	 * The feature id for the '<em><b>Issued</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGNOSTICREPORTGENETICS__ISSUED = ResourcesPackage.DIAGNOSTIC_REPORT__ISSUED;

	/**
	 * The feature id for the '<em><b>Performer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGNOSTICREPORTGENETICS__PERFORMER = ResourcesPackage.DIAGNOSTIC_REPORT__PERFORMER;

	/**
	 * The feature id for the '<em><b>Results Interpreter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGNOSTICREPORTGENETICS__RESULTS_INTERPRETER = ResourcesPackage.DIAGNOSTIC_REPORT__RESULTS_INTERPRETER;

	/**
	 * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGNOSTICREPORTGENETICS__SPECIMEN = ResourcesPackage.DIAGNOSTIC_REPORT__SPECIMEN;

	/**
	 * The feature id for the '<em><b>Result</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGNOSTICREPORTGENETICS__RESULT = ResourcesPackage.DIAGNOSTIC_REPORT__RESULT;

	/**
	 * The feature id for the '<em><b>Imaging Study</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGNOSTICREPORTGENETICS__IMAGING_STUDY = ResourcesPackage.DIAGNOSTIC_REPORT__IMAGING_STUDY;

	/**
	 * The feature id for the '<em><b>Media</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGNOSTICREPORTGENETICS__MEDIA = ResourcesPackage.DIAGNOSTIC_REPORT__MEDIA;

	/**
	 * The feature id for the '<em><b>Conclusion</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGNOSTICREPORTGENETICS__CONCLUSION = ResourcesPackage.DIAGNOSTIC_REPORT__CONCLUSION;

	/**
	 * The feature id for the '<em><b>Conclusion Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGNOSTICREPORTGENETICS__CONCLUSION_CODE = ResourcesPackage.DIAGNOSTIC_REPORT__CONCLUSION_CODE;

	/**
	 * The feature id for the '<em><b>Presented Form</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGNOSTICREPORTGENETICS__PRESENTED_FORM = ResourcesPackage.DIAGNOSTIC_REPORT__PRESENTED_FORM;

	/**
	 * The number of structural features of the '<em>Diagnosticreportgenetics</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGNOSTICREPORTGENETICS_FEATURE_COUNT = ResourcesPackage.DIAGNOSTIC_REPORT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Diagnosticreportgenetics</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGNOSTICREPORTGENETICS_OPERATION_COUNT = ResourcesPackage.DIAGNOSTIC_REPORT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fhiRCore.profiles.impl.ShareablecodesystemImpl <em>Shareablecodesystem</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.profiles.impl.ShareablecodesystemImpl
	 * @see fhiRCore.profiles.impl.ProfilesPackageImpl#getShareablecodesystem()
	 * @generated
	 */
	int SHAREABLECODESYSTEM = 52;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAREABLECODESYSTEM__ID = ResourcesPackage.CODE_SYSTEM__ID;

	/**
	 * The feature id for the '<em><b>Meta</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAREABLECODESYSTEM__META = ResourcesPackage.CODE_SYSTEM__META;

	/**
	 * The feature id for the '<em><b>Implicit Rules</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAREABLECODESYSTEM__IMPLICIT_RULES = ResourcesPackage.CODE_SYSTEM__IMPLICIT_RULES;

	/**
	 * The feature id for the '<em><b>Language</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAREABLECODESYSTEM__LANGUAGE = ResourcesPackage.CODE_SYSTEM__LANGUAGE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAREABLECODESYSTEM__TEXT = ResourcesPackage.CODE_SYSTEM__TEXT;

	/**
	 * The feature id for the '<em><b>Contained</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAREABLECODESYSTEM__CONTAINED = ResourcesPackage.CODE_SYSTEM__CONTAINED;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAREABLECODESYSTEM__EXTENSION = ResourcesPackage.CODE_SYSTEM__EXTENSION;

	/**
	 * The feature id for the '<em><b>Modifier Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAREABLECODESYSTEM__MODIFIER_EXTENSION = ResourcesPackage.CODE_SYSTEM__MODIFIER_EXTENSION;

	/**
	 * The feature id for the '<em><b>Url</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAREABLECODESYSTEM__URL = ResourcesPackage.CODE_SYSTEM__URL;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAREABLECODESYSTEM__IDENTIFIER = ResourcesPackage.CODE_SYSTEM__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Version</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAREABLECODESYSTEM__VERSION = ResourcesPackage.CODE_SYSTEM__VERSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAREABLECODESYSTEM__NAME = ResourcesPackage.CODE_SYSTEM__NAME;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAREABLECODESYSTEM__TITLE = ResourcesPackage.CODE_SYSTEM__TITLE;

	/**
	 * The feature id for the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAREABLECODESYSTEM__STATUS = ResourcesPackage.CODE_SYSTEM__STATUS;

	/**
	 * The feature id for the '<em><b>Experimental</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAREABLECODESYSTEM__EXPERIMENTAL = ResourcesPackage.CODE_SYSTEM__EXPERIMENTAL;

	/**
	 * The feature id for the '<em><b>Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAREABLECODESYSTEM__DATE = ResourcesPackage.CODE_SYSTEM__DATE;

	/**
	 * The feature id for the '<em><b>Publisher</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAREABLECODESYSTEM__PUBLISHER = ResourcesPackage.CODE_SYSTEM__PUBLISHER;

	/**
	 * The feature id for the '<em><b>Contact</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAREABLECODESYSTEM__CONTACT = ResourcesPackage.CODE_SYSTEM__CONTACT;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAREABLECODESYSTEM__DESCRIPTION = ResourcesPackage.CODE_SYSTEM__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Use Context</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAREABLECODESYSTEM__USE_CONTEXT = ResourcesPackage.CODE_SYSTEM__USE_CONTEXT;

	/**
	 * The feature id for the '<em><b>Jurisdiction</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAREABLECODESYSTEM__JURISDICTION = ResourcesPackage.CODE_SYSTEM__JURISDICTION;

	/**
	 * The feature id for the '<em><b>Purpose</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAREABLECODESYSTEM__PURPOSE = ResourcesPackage.CODE_SYSTEM__PURPOSE;

	/**
	 * The feature id for the '<em><b>Copyright</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAREABLECODESYSTEM__COPYRIGHT = ResourcesPackage.CODE_SYSTEM__COPYRIGHT;

	/**
	 * The feature id for the '<em><b>Case Sensitive</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAREABLECODESYSTEM__CASE_SENSITIVE = ResourcesPackage.CODE_SYSTEM__CASE_SENSITIVE;

	/**
	 * The feature id for the '<em><b>Value Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAREABLECODESYSTEM__VALUE_SET = ResourcesPackage.CODE_SYSTEM__VALUE_SET;

	/**
	 * The feature id for the '<em><b>Hierarchy Meaning</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAREABLECODESYSTEM__HIERARCHY_MEANING = ResourcesPackage.CODE_SYSTEM__HIERARCHY_MEANING;

	/**
	 * The feature id for the '<em><b>Compositional</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAREABLECODESYSTEM__COMPOSITIONAL = ResourcesPackage.CODE_SYSTEM__COMPOSITIONAL;

	/**
	 * The feature id for the '<em><b>Version Needed</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAREABLECODESYSTEM__VERSION_NEEDED = ResourcesPackage.CODE_SYSTEM__VERSION_NEEDED;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAREABLECODESYSTEM__CONTENT = ResourcesPackage.CODE_SYSTEM__CONTENT;

	/**
	 * The feature id for the '<em><b>Supplements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAREABLECODESYSTEM__SUPPLEMENTS = ResourcesPackage.CODE_SYSTEM__SUPPLEMENTS;

	/**
	 * The feature id for the '<em><b>Count</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAREABLECODESYSTEM__COUNT = ResourcesPackage.CODE_SYSTEM__COUNT;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAREABLECODESYSTEM__FILTER = ResourcesPackage.CODE_SYSTEM__FILTER;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAREABLECODESYSTEM__PROPERTY = ResourcesPackage.CODE_SYSTEM__PROPERTY;

	/**
	 * The feature id for the '<em><b>Concept</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAREABLECODESYSTEM__CONCEPT = ResourcesPackage.CODE_SYSTEM__CONCEPT;

	/**
	 * The number of structural features of the '<em>Shareablecodesystem</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAREABLECODESYSTEM_FEATURE_COUNT = ResourcesPackage.CODE_SYSTEM_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Shareablecodesystem</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAREABLECODESYSTEM_OPERATION_COUNT = ResourcesPackage.CODE_SYSTEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fhiRCore.profiles.impl.ShareablecodesystemConceptDefinition1Impl <em>Shareablecodesystem Concept Definition1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.profiles.impl.ShareablecodesystemConceptDefinition1Impl
	 * @see fhiRCore.profiles.impl.ProfilesPackageImpl#getShareablecodesystemConceptDefinition1()
	 * @generated
	 */
	int SHAREABLECODESYSTEM_CONCEPT_DEFINITION1 = 53;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAREABLECODESYSTEM_CONCEPT_DEFINITION1__ID = ResourcesPackage.CODE_SYSTEM_CONCEPT_DEFINITION__ID;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAREABLECODESYSTEM_CONCEPT_DEFINITION1__EXTENSION = ResourcesPackage.CODE_SYSTEM_CONCEPT_DEFINITION__EXTENSION;

	/**
	 * The feature id for the '<em><b>Modifier Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAREABLECODESYSTEM_CONCEPT_DEFINITION1__MODIFIER_EXTENSION = ResourcesPackage.CODE_SYSTEM_CONCEPT_DEFINITION__MODIFIER_EXTENSION;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAREABLECODESYSTEM_CONCEPT_DEFINITION1__CODE = ResourcesPackage.CODE_SYSTEM_CONCEPT_DEFINITION__CODE;

	/**
	 * The feature id for the '<em><b>Display</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAREABLECODESYSTEM_CONCEPT_DEFINITION1__DISPLAY = ResourcesPackage.CODE_SYSTEM_CONCEPT_DEFINITION__DISPLAY;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAREABLECODESYSTEM_CONCEPT_DEFINITION1__DEFINITION = ResourcesPackage.CODE_SYSTEM_CONCEPT_DEFINITION__DEFINITION;

	/**
	 * The feature id for the '<em><b>Designation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAREABLECODESYSTEM_CONCEPT_DEFINITION1__DESIGNATION = ResourcesPackage.CODE_SYSTEM_CONCEPT_DEFINITION__DESIGNATION;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAREABLECODESYSTEM_CONCEPT_DEFINITION1__PROPERTY = ResourcesPackage.CODE_SYSTEM_CONCEPT_DEFINITION__PROPERTY;

	/**
	 * The feature id for the '<em><b>Concept</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAREABLECODESYSTEM_CONCEPT_DEFINITION1__CONCEPT = ResourcesPackage.CODE_SYSTEM_CONCEPT_DEFINITION__CONCEPT;

	/**
	 * The number of structural features of the '<em>Shareablecodesystem Concept Definition1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAREABLECODESYSTEM_CONCEPT_DEFINITION1_FEATURE_COUNT = ResourcesPackage.CODE_SYSTEM_CONCEPT_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Shareablecodesystem Concept Definition1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAREABLECODESYSTEM_CONCEPT_DEFINITION1_OPERATION_COUNT = ResourcesPackage.CODE_SYSTEM_CONCEPT_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fhiRCore.profiles.impl.OxygensatImpl <em>Oxygensat</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.profiles.impl.OxygensatImpl
	 * @see fhiRCore.profiles.impl.ProfilesPackageImpl#getOxygensat()
	 * @generated
	 */
	int OXYGENSAT = 54;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OXYGENSAT__ID = VITALSIGNS__ID;

	/**
	 * The feature id for the '<em><b>Meta</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OXYGENSAT__META = VITALSIGNS__META;

	/**
	 * The feature id for the '<em><b>Implicit Rules</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OXYGENSAT__IMPLICIT_RULES = VITALSIGNS__IMPLICIT_RULES;

	/**
	 * The feature id for the '<em><b>Language</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OXYGENSAT__LANGUAGE = VITALSIGNS__LANGUAGE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OXYGENSAT__TEXT = VITALSIGNS__TEXT;

	/**
	 * The feature id for the '<em><b>Contained</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OXYGENSAT__CONTAINED = VITALSIGNS__CONTAINED;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OXYGENSAT__EXTENSION = VITALSIGNS__EXTENSION;

	/**
	 * The feature id for the '<em><b>Modifier Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OXYGENSAT__MODIFIER_EXTENSION = VITALSIGNS__MODIFIER_EXTENSION;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OXYGENSAT__IDENTIFIER = VITALSIGNS__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Based On</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OXYGENSAT__BASED_ON = VITALSIGNS__BASED_ON;

	/**
	 * The feature id for the '<em><b>Part Of</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OXYGENSAT__PART_OF = VITALSIGNS__PART_OF;

	/**
	 * The feature id for the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OXYGENSAT__STATUS = VITALSIGNS__STATUS;

	/**
	 * The feature id for the '<em><b>Category</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OXYGENSAT__CATEGORY = VITALSIGNS__CATEGORY;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OXYGENSAT__CODE = VITALSIGNS__CODE;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OXYGENSAT__SUBJECT = VITALSIGNS__SUBJECT;

	/**
	 * The feature id for the '<em><b>Focus</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OXYGENSAT__FOCUS = VITALSIGNS__FOCUS;

	/**
	 * The feature id for the '<em><b>Encounter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OXYGENSAT__ENCOUNTER = VITALSIGNS__ENCOUNTER;

	/**
	 * The feature id for the '<em><b>Effectivex</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OXYGENSAT__EFFECTIVEX = VITALSIGNS__EFFECTIVEX;

	/**
	 * The feature id for the '<em><b>Issued</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OXYGENSAT__ISSUED = VITALSIGNS__ISSUED;

	/**
	 * The feature id for the '<em><b>Performer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OXYGENSAT__PERFORMER = VITALSIGNS__PERFORMER;

	/**
	 * The feature id for the '<em><b>Valuex</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OXYGENSAT__VALUEX = VITALSIGNS__VALUEX;

	/**
	 * The feature id for the '<em><b>Data Absent Reason</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OXYGENSAT__DATA_ABSENT_REASON = VITALSIGNS__DATA_ABSENT_REASON;

	/**
	 * The feature id for the '<em><b>Interpretation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OXYGENSAT__INTERPRETATION = VITALSIGNS__INTERPRETATION;

	/**
	 * The feature id for the '<em><b>Note</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OXYGENSAT__NOTE = VITALSIGNS__NOTE;

	/**
	 * The feature id for the '<em><b>Body Site</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OXYGENSAT__BODY_SITE = VITALSIGNS__BODY_SITE;

	/**
	 * The feature id for the '<em><b>Method</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OXYGENSAT__METHOD = VITALSIGNS__METHOD;

	/**
	 * The feature id for the '<em><b>Specimen</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OXYGENSAT__SPECIMEN = VITALSIGNS__SPECIMEN;

	/**
	 * The feature id for the '<em><b>Device</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OXYGENSAT__DEVICE = VITALSIGNS__DEVICE;

	/**
	 * The feature id for the '<em><b>Has Member</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OXYGENSAT__HAS_MEMBER = VITALSIGNS__HAS_MEMBER;

	/**
	 * The feature id for the '<em><b>Derived From</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OXYGENSAT__DERIVED_FROM = VITALSIGNS__DERIVED_FROM;

	/**
	 * The feature id for the '<em><b>Component</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OXYGENSAT__COMPONENT = VITALSIGNS__COMPONENT;

	/**
	 * The feature id for the '<em><b>Reference Range</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OXYGENSAT__REFERENCE_RANGE = VITALSIGNS__REFERENCE_RANGE;

	/**
	 * The feature id for the '<em><b>Vs Cat</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OXYGENSAT__VS_CAT = VITALSIGNS__VS_CAT;

	/**
	 * The feature id for the '<em><b>Value Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OXYGENSAT__VALUE_QUANTITY = VITALSIGNS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Oxygensat</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OXYGENSAT_FEATURE_COUNT = VITALSIGNS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Oxygensat</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OXYGENSAT_OPERATION_COUNT = VITALSIGNS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fhiRCore.profiles.impl.OxygensatCodeableConcept1Impl <em>Oxygensat Codeable Concept1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.profiles.impl.OxygensatCodeableConcept1Impl
	 * @see fhiRCore.profiles.impl.ProfilesPackageImpl#getOxygensatCodeableConcept1()
	 * @generated
	 */
	int OXYGENSAT_CODEABLE_CONCEPT1 = 55;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OXYGENSAT_CODEABLE_CONCEPT1__ID = DataTypesPackage.CODEABLE_CONCEPT__ID;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OXYGENSAT_CODEABLE_CONCEPT1__EXTENSION = DataTypesPackage.CODEABLE_CONCEPT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Coding</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OXYGENSAT_CODEABLE_CONCEPT1__CODING = DataTypesPackage.CODEABLE_CONCEPT__CODING;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OXYGENSAT_CODEABLE_CONCEPT1__TEXT = DataTypesPackage.CODEABLE_CONCEPT__TEXT;

	/**
	 * The feature id for the '<em><b>Oxygen Sat Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OXYGENSAT_CODEABLE_CONCEPT1__OXYGEN_SAT_CODE = DataTypesPackage.CODEABLE_CONCEPT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Oxygensat Codeable Concept1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OXYGENSAT_CODEABLE_CONCEPT1_FEATURE_COUNT = DataTypesPackage.CODEABLE_CONCEPT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Oxygensat Codeable Concept1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OXYGENSAT_CODEABLE_CONCEPT1_OPERATION_COUNT = DataTypesPackage.CODEABLE_CONCEPT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fhiRCore.profiles.impl.OxygensatCodeableConcept1Coding1Impl <em>Oxygensat Codeable Concept1 Coding1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.profiles.impl.OxygensatCodeableConcept1Coding1Impl
	 * @see fhiRCore.profiles.impl.ProfilesPackageImpl#getOxygensatCodeableConcept1Coding1()
	 * @generated
	 */
	int OXYGENSAT_CODEABLE_CONCEPT1_CODING1 = 56;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OXYGENSAT_CODEABLE_CONCEPT1_CODING1__ID = DataTypesPackage.CODING__ID;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OXYGENSAT_CODEABLE_CONCEPT1_CODING1__EXTENSION = DataTypesPackage.CODING__EXTENSION;

	/**
	 * The feature id for the '<em><b>System</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OXYGENSAT_CODEABLE_CONCEPT1_CODING1__SYSTEM = DataTypesPackage.CODING__SYSTEM;

	/**
	 * The feature id for the '<em><b>Version</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OXYGENSAT_CODEABLE_CONCEPT1_CODING1__VERSION = DataTypesPackage.CODING__VERSION;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OXYGENSAT_CODEABLE_CONCEPT1_CODING1__CODE = DataTypesPackage.CODING__CODE;

	/**
	 * The feature id for the '<em><b>Display</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OXYGENSAT_CODEABLE_CONCEPT1_CODING1__DISPLAY = DataTypesPackage.CODING__DISPLAY;

	/**
	 * The feature id for the '<em><b>User Selected</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OXYGENSAT_CODEABLE_CONCEPT1_CODING1__USER_SELECTED = DataTypesPackage.CODING__USER_SELECTED;

	/**
	 * The number of structural features of the '<em>Oxygensat Codeable Concept1 Coding1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OXYGENSAT_CODEABLE_CONCEPT1_CODING1_FEATURE_COUNT = DataTypesPackage.CODING_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Oxygensat Codeable Concept1 Coding1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OXYGENSAT_CODEABLE_CONCEPT1_CODING1_OPERATION_COUNT = DataTypesPackage.CODING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fhiRCore.profiles.impl.OxygensatQuantity1Impl <em>Oxygensat Quantity1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.profiles.impl.OxygensatQuantity1Impl
	 * @see fhiRCore.profiles.impl.ProfilesPackageImpl#getOxygensatQuantity1()
	 * @generated
	 */
	int OXYGENSAT_QUANTITY1 = 57;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OXYGENSAT_QUANTITY1__ID = DataTypesPackage.QUANTITY__ID;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OXYGENSAT_QUANTITY1__EXTENSION = DataTypesPackage.QUANTITY__EXTENSION;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OXYGENSAT_QUANTITY1__VALUE = DataTypesPackage.QUANTITY__VALUE;

	/**
	 * The feature id for the '<em><b>Comparator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OXYGENSAT_QUANTITY1__COMPARATOR = DataTypesPackage.QUANTITY__COMPARATOR;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OXYGENSAT_QUANTITY1__UNIT = DataTypesPackage.QUANTITY__UNIT;

	/**
	 * The feature id for the '<em><b>System</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OXYGENSAT_QUANTITY1__SYSTEM = DataTypesPackage.QUANTITY__SYSTEM;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OXYGENSAT_QUANTITY1__CODE = DataTypesPackage.QUANTITY__CODE;

	/**
	 * The number of structural features of the '<em>Oxygensat Quantity1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OXYGENSAT_QUANTITY1_FEATURE_COUNT = DataTypesPackage.QUANTITY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Oxygensat Quantity1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OXYGENSAT_QUANTITY1_OPERATION_COUNT = DataTypesPackage.QUANTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fhiRCore.profiles.impl.ClinicaldocumentImpl <em>Clinicaldocument</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.profiles.impl.ClinicaldocumentImpl
	 * @see fhiRCore.profiles.impl.ProfilesPackageImpl#getClinicaldocument()
	 * @generated
	 */
	int CLINICALDOCUMENT = 58;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLINICALDOCUMENT__ID = ResourcesPackage.COMPOSITION__ID;

	/**
	 * The feature id for the '<em><b>Meta</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLINICALDOCUMENT__META = ResourcesPackage.COMPOSITION__META;

	/**
	 * The feature id for the '<em><b>Implicit Rules</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLINICALDOCUMENT__IMPLICIT_RULES = ResourcesPackage.COMPOSITION__IMPLICIT_RULES;

	/**
	 * The feature id for the '<em><b>Language</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLINICALDOCUMENT__LANGUAGE = ResourcesPackage.COMPOSITION__LANGUAGE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLINICALDOCUMENT__TEXT = ResourcesPackage.COMPOSITION__TEXT;

	/**
	 * The feature id for the '<em><b>Contained</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLINICALDOCUMENT__CONTAINED = ResourcesPackage.COMPOSITION__CONTAINED;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLINICALDOCUMENT__EXTENSION = ResourcesPackage.COMPOSITION__EXTENSION;

	/**
	 * The feature id for the '<em><b>Modifier Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLINICALDOCUMENT__MODIFIER_EXTENSION = ResourcesPackage.COMPOSITION__MODIFIER_EXTENSION;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLINICALDOCUMENT__IDENTIFIER = ResourcesPackage.COMPOSITION__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLINICALDOCUMENT__STATUS = ResourcesPackage.COMPOSITION__STATUS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLINICALDOCUMENT__TYPE = ResourcesPackage.COMPOSITION__TYPE;

	/**
	 * The feature id for the '<em><b>Category</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLINICALDOCUMENT__CATEGORY = ResourcesPackage.COMPOSITION__CATEGORY;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLINICALDOCUMENT__SUBJECT = ResourcesPackage.COMPOSITION__SUBJECT;

	/**
	 * The feature id for the '<em><b>Encounter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLINICALDOCUMENT__ENCOUNTER = ResourcesPackage.COMPOSITION__ENCOUNTER;

	/**
	 * The feature id for the '<em><b>Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLINICALDOCUMENT__DATE = ResourcesPackage.COMPOSITION__DATE;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLINICALDOCUMENT__AUTHOR = ResourcesPackage.COMPOSITION__AUTHOR;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLINICALDOCUMENT__TITLE = ResourcesPackage.COMPOSITION__TITLE;

	/**
	 * The feature id for the '<em><b>Confidentiality</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLINICALDOCUMENT__CONFIDENTIALITY = ResourcesPackage.COMPOSITION__CONFIDENTIALITY;

	/**
	 * The feature id for the '<em><b>Attester</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLINICALDOCUMENT__ATTESTER = ResourcesPackage.COMPOSITION__ATTESTER;

	/**
	 * The feature id for the '<em><b>Custodian</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLINICALDOCUMENT__CUSTODIAN = ResourcesPackage.COMPOSITION__CUSTODIAN;

	/**
	 * The feature id for the '<em><b>Relates To</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLINICALDOCUMENT__RELATES_TO = ResourcesPackage.COMPOSITION__RELATES_TO;

	/**
	 * The feature id for the '<em><b>Event</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLINICALDOCUMENT__EVENT = ResourcesPackage.COMPOSITION__EVENT;

	/**
	 * The feature id for the '<em><b>Section</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLINICALDOCUMENT__SECTION = ResourcesPackage.COMPOSITION__SECTION;

	/**
	 * The number of structural features of the '<em>Clinicaldocument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLINICALDOCUMENT_FEATURE_COUNT = ResourcesPackage.COMPOSITION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Clinicaldocument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLINICALDOCUMENT_OPERATION_COUNT = ResourcesPackage.COMPOSITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fhiRCore.profiles.impl.CqllibraryImpl <em>Cqllibrary</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.profiles.impl.CqllibraryImpl
	 * @see fhiRCore.profiles.impl.ProfilesPackageImpl#getCqllibrary()
	 * @generated
	 */
	int CQLLIBRARY = 59;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CQLLIBRARY__ID = ResourcesPackage.LIBRARY__ID;

	/**
	 * The feature id for the '<em><b>Meta</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CQLLIBRARY__META = ResourcesPackage.LIBRARY__META;

	/**
	 * The feature id for the '<em><b>Implicit Rules</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CQLLIBRARY__IMPLICIT_RULES = ResourcesPackage.LIBRARY__IMPLICIT_RULES;

	/**
	 * The feature id for the '<em><b>Language</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CQLLIBRARY__LANGUAGE = ResourcesPackage.LIBRARY__LANGUAGE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CQLLIBRARY__TEXT = ResourcesPackage.LIBRARY__TEXT;

	/**
	 * The feature id for the '<em><b>Contained</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CQLLIBRARY__CONTAINED = ResourcesPackage.LIBRARY__CONTAINED;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CQLLIBRARY__EXTENSION = ResourcesPackage.LIBRARY__EXTENSION;

	/**
	 * The feature id for the '<em><b>Modifier Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CQLLIBRARY__MODIFIER_EXTENSION = ResourcesPackage.LIBRARY__MODIFIER_EXTENSION;

	/**
	 * The feature id for the '<em><b>Url</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CQLLIBRARY__URL = ResourcesPackage.LIBRARY__URL;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CQLLIBRARY__IDENTIFIER = ResourcesPackage.LIBRARY__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Version</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CQLLIBRARY__VERSION = ResourcesPackage.LIBRARY__VERSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CQLLIBRARY__NAME = ResourcesPackage.LIBRARY__NAME;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CQLLIBRARY__TITLE = ResourcesPackage.LIBRARY__TITLE;

	/**
	 * The feature id for the '<em><b>Subtitle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CQLLIBRARY__SUBTITLE = ResourcesPackage.LIBRARY__SUBTITLE;

	/**
	 * The feature id for the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CQLLIBRARY__STATUS = ResourcesPackage.LIBRARY__STATUS;

	/**
	 * The feature id for the '<em><b>Experimental</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CQLLIBRARY__EXPERIMENTAL = ResourcesPackage.LIBRARY__EXPERIMENTAL;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CQLLIBRARY__TYPE = ResourcesPackage.LIBRARY__TYPE;

	/**
	 * The feature id for the '<em><b>Subjectx</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CQLLIBRARY__SUBJECTX = ResourcesPackage.LIBRARY__SUBJECTX;

	/**
	 * The feature id for the '<em><b>Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CQLLIBRARY__DATE = ResourcesPackage.LIBRARY__DATE;

	/**
	 * The feature id for the '<em><b>Publisher</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CQLLIBRARY__PUBLISHER = ResourcesPackage.LIBRARY__PUBLISHER;

	/**
	 * The feature id for the '<em><b>Contact</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CQLLIBRARY__CONTACT = ResourcesPackage.LIBRARY__CONTACT;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CQLLIBRARY__DESCRIPTION = ResourcesPackage.LIBRARY__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Use Context</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CQLLIBRARY__USE_CONTEXT = ResourcesPackage.LIBRARY__USE_CONTEXT;

	/**
	 * The feature id for the '<em><b>Jurisdiction</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CQLLIBRARY__JURISDICTION = ResourcesPackage.LIBRARY__JURISDICTION;

	/**
	 * The feature id for the '<em><b>Purpose</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CQLLIBRARY__PURPOSE = ResourcesPackage.LIBRARY__PURPOSE;

	/**
	 * The feature id for the '<em><b>Usage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CQLLIBRARY__USAGE = ResourcesPackage.LIBRARY__USAGE;

	/**
	 * The feature id for the '<em><b>Copyright</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CQLLIBRARY__COPYRIGHT = ResourcesPackage.LIBRARY__COPYRIGHT;

	/**
	 * The feature id for the '<em><b>Approval Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CQLLIBRARY__APPROVAL_DATE = ResourcesPackage.LIBRARY__APPROVAL_DATE;

	/**
	 * The feature id for the '<em><b>Last Review Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CQLLIBRARY__LAST_REVIEW_DATE = ResourcesPackage.LIBRARY__LAST_REVIEW_DATE;

	/**
	 * The feature id for the '<em><b>Effective Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CQLLIBRARY__EFFECTIVE_PERIOD = ResourcesPackage.LIBRARY__EFFECTIVE_PERIOD;

	/**
	 * The feature id for the '<em><b>Topic</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CQLLIBRARY__TOPIC = ResourcesPackage.LIBRARY__TOPIC;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CQLLIBRARY__AUTHOR = ResourcesPackage.LIBRARY__AUTHOR;

	/**
	 * The feature id for the '<em><b>Editor</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CQLLIBRARY__EDITOR = ResourcesPackage.LIBRARY__EDITOR;

	/**
	 * The feature id for the '<em><b>Reviewer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CQLLIBRARY__REVIEWER = ResourcesPackage.LIBRARY__REVIEWER;

	/**
	 * The feature id for the '<em><b>Endorser</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CQLLIBRARY__ENDORSER = ResourcesPackage.LIBRARY__ENDORSER;

	/**
	 * The feature id for the '<em><b>Related Artifact</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CQLLIBRARY__RELATED_ARTIFACT = ResourcesPackage.LIBRARY__RELATED_ARTIFACT;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CQLLIBRARY__PARAMETER = ResourcesPackage.LIBRARY__PARAMETER;

	/**
	 * The feature id for the '<em><b>Data Requirement</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CQLLIBRARY__DATA_REQUIREMENT = ResourcesPackage.LIBRARY__DATA_REQUIREMENT;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CQLLIBRARY__CONTENT = ResourcesPackage.LIBRARY__CONTENT;

	/**
	 * The number of structural features of the '<em>Cqllibrary</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CQLLIBRARY_FEATURE_COUNT = ResourcesPackage.LIBRARY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Cqllibrary</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CQLLIBRARY_OPERATION_COUNT = ResourcesPackage.LIBRARY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fhiRCore.profiles.impl.HeadcircumImpl <em>Headcircum</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.profiles.impl.HeadcircumImpl
	 * @see fhiRCore.profiles.impl.ProfilesPackageImpl#getHeadcircum()
	 * @generated
	 */
	int HEADCIRCUM = 60;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADCIRCUM__ID = VITALSIGNS__ID;

	/**
	 * The feature id for the '<em><b>Meta</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADCIRCUM__META = VITALSIGNS__META;

	/**
	 * The feature id for the '<em><b>Implicit Rules</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADCIRCUM__IMPLICIT_RULES = VITALSIGNS__IMPLICIT_RULES;

	/**
	 * The feature id for the '<em><b>Language</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADCIRCUM__LANGUAGE = VITALSIGNS__LANGUAGE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADCIRCUM__TEXT = VITALSIGNS__TEXT;

	/**
	 * The feature id for the '<em><b>Contained</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADCIRCUM__CONTAINED = VITALSIGNS__CONTAINED;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADCIRCUM__EXTENSION = VITALSIGNS__EXTENSION;

	/**
	 * The feature id for the '<em><b>Modifier Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADCIRCUM__MODIFIER_EXTENSION = VITALSIGNS__MODIFIER_EXTENSION;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADCIRCUM__IDENTIFIER = VITALSIGNS__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Based On</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADCIRCUM__BASED_ON = VITALSIGNS__BASED_ON;

	/**
	 * The feature id for the '<em><b>Part Of</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADCIRCUM__PART_OF = VITALSIGNS__PART_OF;

	/**
	 * The feature id for the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADCIRCUM__STATUS = VITALSIGNS__STATUS;

	/**
	 * The feature id for the '<em><b>Category</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADCIRCUM__CATEGORY = VITALSIGNS__CATEGORY;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADCIRCUM__CODE = VITALSIGNS__CODE;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADCIRCUM__SUBJECT = VITALSIGNS__SUBJECT;

	/**
	 * The feature id for the '<em><b>Focus</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADCIRCUM__FOCUS = VITALSIGNS__FOCUS;

	/**
	 * The feature id for the '<em><b>Encounter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADCIRCUM__ENCOUNTER = VITALSIGNS__ENCOUNTER;

	/**
	 * The feature id for the '<em><b>Effectivex</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADCIRCUM__EFFECTIVEX = VITALSIGNS__EFFECTIVEX;

	/**
	 * The feature id for the '<em><b>Issued</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADCIRCUM__ISSUED = VITALSIGNS__ISSUED;

	/**
	 * The feature id for the '<em><b>Performer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADCIRCUM__PERFORMER = VITALSIGNS__PERFORMER;

	/**
	 * The feature id for the '<em><b>Valuex</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADCIRCUM__VALUEX = VITALSIGNS__VALUEX;

	/**
	 * The feature id for the '<em><b>Data Absent Reason</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADCIRCUM__DATA_ABSENT_REASON = VITALSIGNS__DATA_ABSENT_REASON;

	/**
	 * The feature id for the '<em><b>Interpretation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADCIRCUM__INTERPRETATION = VITALSIGNS__INTERPRETATION;

	/**
	 * The feature id for the '<em><b>Note</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADCIRCUM__NOTE = VITALSIGNS__NOTE;

	/**
	 * The feature id for the '<em><b>Body Site</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADCIRCUM__BODY_SITE = VITALSIGNS__BODY_SITE;

	/**
	 * The feature id for the '<em><b>Method</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADCIRCUM__METHOD = VITALSIGNS__METHOD;

	/**
	 * The feature id for the '<em><b>Specimen</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADCIRCUM__SPECIMEN = VITALSIGNS__SPECIMEN;

	/**
	 * The feature id for the '<em><b>Device</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADCIRCUM__DEVICE = VITALSIGNS__DEVICE;

	/**
	 * The feature id for the '<em><b>Has Member</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADCIRCUM__HAS_MEMBER = VITALSIGNS__HAS_MEMBER;

	/**
	 * The feature id for the '<em><b>Derived From</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADCIRCUM__DERIVED_FROM = VITALSIGNS__DERIVED_FROM;

	/**
	 * The feature id for the '<em><b>Component</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADCIRCUM__COMPONENT = VITALSIGNS__COMPONENT;

	/**
	 * The feature id for the '<em><b>Reference Range</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADCIRCUM__REFERENCE_RANGE = VITALSIGNS__REFERENCE_RANGE;

	/**
	 * The feature id for the '<em><b>Vs Cat</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADCIRCUM__VS_CAT = VITALSIGNS__VS_CAT;

	/**
	 * The feature id for the '<em><b>Value Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADCIRCUM__VALUE_QUANTITY = VITALSIGNS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Headcircum</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADCIRCUM_FEATURE_COUNT = VITALSIGNS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Headcircum</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADCIRCUM_OPERATION_COUNT = VITALSIGNS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fhiRCore.profiles.impl.HeadcircumCodeableConcept1Impl <em>Headcircum Codeable Concept1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.profiles.impl.HeadcircumCodeableConcept1Impl
	 * @see fhiRCore.profiles.impl.ProfilesPackageImpl#getHeadcircumCodeableConcept1()
	 * @generated
	 */
	int HEADCIRCUM_CODEABLE_CONCEPT1 = 61;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADCIRCUM_CODEABLE_CONCEPT1__ID = DataTypesPackage.CODEABLE_CONCEPT__ID;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADCIRCUM_CODEABLE_CONCEPT1__EXTENSION = DataTypesPackage.CODEABLE_CONCEPT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Coding</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADCIRCUM_CODEABLE_CONCEPT1__CODING = DataTypesPackage.CODEABLE_CONCEPT__CODING;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADCIRCUM_CODEABLE_CONCEPT1__TEXT = DataTypesPackage.CODEABLE_CONCEPT__TEXT;

	/**
	 * The feature id for the '<em><b>Head Circum Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADCIRCUM_CODEABLE_CONCEPT1__HEAD_CIRCUM_CODE = DataTypesPackage.CODEABLE_CONCEPT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Headcircum Codeable Concept1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADCIRCUM_CODEABLE_CONCEPT1_FEATURE_COUNT = DataTypesPackage.CODEABLE_CONCEPT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Headcircum Codeable Concept1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADCIRCUM_CODEABLE_CONCEPT1_OPERATION_COUNT = DataTypesPackage.CODEABLE_CONCEPT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fhiRCore.profiles.impl.HeadcircumCodeableConcept1Coding1Impl <em>Headcircum Codeable Concept1 Coding1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.profiles.impl.HeadcircumCodeableConcept1Coding1Impl
	 * @see fhiRCore.profiles.impl.ProfilesPackageImpl#getHeadcircumCodeableConcept1Coding1()
	 * @generated
	 */
	int HEADCIRCUM_CODEABLE_CONCEPT1_CODING1 = 62;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADCIRCUM_CODEABLE_CONCEPT1_CODING1__ID = DataTypesPackage.CODING__ID;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADCIRCUM_CODEABLE_CONCEPT1_CODING1__EXTENSION = DataTypesPackage.CODING__EXTENSION;

	/**
	 * The feature id for the '<em><b>System</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADCIRCUM_CODEABLE_CONCEPT1_CODING1__SYSTEM = DataTypesPackage.CODING__SYSTEM;

	/**
	 * The feature id for the '<em><b>Version</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADCIRCUM_CODEABLE_CONCEPT1_CODING1__VERSION = DataTypesPackage.CODING__VERSION;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADCIRCUM_CODEABLE_CONCEPT1_CODING1__CODE = DataTypesPackage.CODING__CODE;

	/**
	 * The feature id for the '<em><b>Display</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADCIRCUM_CODEABLE_CONCEPT1_CODING1__DISPLAY = DataTypesPackage.CODING__DISPLAY;

	/**
	 * The feature id for the '<em><b>User Selected</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADCIRCUM_CODEABLE_CONCEPT1_CODING1__USER_SELECTED = DataTypesPackage.CODING__USER_SELECTED;

	/**
	 * The number of structural features of the '<em>Headcircum Codeable Concept1 Coding1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADCIRCUM_CODEABLE_CONCEPT1_CODING1_FEATURE_COUNT = DataTypesPackage.CODING_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Headcircum Codeable Concept1 Coding1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADCIRCUM_CODEABLE_CONCEPT1_CODING1_OPERATION_COUNT = DataTypesPackage.CODING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fhiRCore.profiles.impl.HeadcircumQuantity1Impl <em>Headcircum Quantity1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.profiles.impl.HeadcircumQuantity1Impl
	 * @see fhiRCore.profiles.impl.ProfilesPackageImpl#getHeadcircumQuantity1()
	 * @generated
	 */
	int HEADCIRCUM_QUANTITY1 = 63;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADCIRCUM_QUANTITY1__ID = DataTypesPackage.QUANTITY__ID;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADCIRCUM_QUANTITY1__EXTENSION = DataTypesPackage.QUANTITY__EXTENSION;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADCIRCUM_QUANTITY1__VALUE = DataTypesPackage.QUANTITY__VALUE;

	/**
	 * The feature id for the '<em><b>Comparator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADCIRCUM_QUANTITY1__COMPARATOR = DataTypesPackage.QUANTITY__COMPARATOR;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADCIRCUM_QUANTITY1__UNIT = DataTypesPackage.QUANTITY__UNIT;

	/**
	 * The feature id for the '<em><b>System</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADCIRCUM_QUANTITY1__SYSTEM = DataTypesPackage.QUANTITY__SYSTEM;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADCIRCUM_QUANTITY1__CODE = DataTypesPackage.QUANTITY__CODE;

	/**
	 * The number of structural features of the '<em>Headcircum Quantity1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADCIRCUM_QUANTITY1_FEATURE_COUNT = DataTypesPackage.QUANTITY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Headcircum Quantity1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADCIRCUM_QUANTITY1_OPERATION_COUNT = DataTypesPackage.QUANTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fhiRCore.profiles.impl.SynchronizationplandefinitionImpl <em>Synchronizationplandefinition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.profiles.impl.SynchronizationplandefinitionImpl
	 * @see fhiRCore.profiles.impl.ProfilesPackageImpl#getSynchronizationplandefinition()
	 * @generated
	 */
	int SYNCHRONIZATIONPLANDEFINITION = 64;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZATIONPLANDEFINITION__ID = ResourcesPackage.PLAN_DEFINITION__ID;

	/**
	 * The feature id for the '<em><b>Meta</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZATIONPLANDEFINITION__META = ResourcesPackage.PLAN_DEFINITION__META;

	/**
	 * The feature id for the '<em><b>Implicit Rules</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZATIONPLANDEFINITION__IMPLICIT_RULES = ResourcesPackage.PLAN_DEFINITION__IMPLICIT_RULES;

	/**
	 * The feature id for the '<em><b>Language</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZATIONPLANDEFINITION__LANGUAGE = ResourcesPackage.PLAN_DEFINITION__LANGUAGE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZATIONPLANDEFINITION__TEXT = ResourcesPackage.PLAN_DEFINITION__TEXT;

	/**
	 * The feature id for the '<em><b>Contained</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZATIONPLANDEFINITION__CONTAINED = ResourcesPackage.PLAN_DEFINITION__CONTAINED;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZATIONPLANDEFINITION__EXTENSION = ResourcesPackage.PLAN_DEFINITION__EXTENSION;

	/**
	 * The feature id for the '<em><b>Modifier Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZATIONPLANDEFINITION__MODIFIER_EXTENSION = ResourcesPackage.PLAN_DEFINITION__MODIFIER_EXTENSION;

	/**
	 * The feature id for the '<em><b>Url</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZATIONPLANDEFINITION__URL = ResourcesPackage.PLAN_DEFINITION__URL;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZATIONPLANDEFINITION__IDENTIFIER = ResourcesPackage.PLAN_DEFINITION__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Version</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZATIONPLANDEFINITION__VERSION = ResourcesPackage.PLAN_DEFINITION__VERSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZATIONPLANDEFINITION__NAME = ResourcesPackage.PLAN_DEFINITION__NAME;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZATIONPLANDEFINITION__TITLE = ResourcesPackage.PLAN_DEFINITION__TITLE;

	/**
	 * The feature id for the '<em><b>Subtitle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZATIONPLANDEFINITION__SUBTITLE = ResourcesPackage.PLAN_DEFINITION__SUBTITLE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZATIONPLANDEFINITION__TYPE = ResourcesPackage.PLAN_DEFINITION__TYPE;

	/**
	 * The feature id for the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZATIONPLANDEFINITION__STATUS = ResourcesPackage.PLAN_DEFINITION__STATUS;

	/**
	 * The feature id for the '<em><b>Experimental</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZATIONPLANDEFINITION__EXPERIMENTAL = ResourcesPackage.PLAN_DEFINITION__EXPERIMENTAL;

	/**
	 * The feature id for the '<em><b>Subjectx</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZATIONPLANDEFINITION__SUBJECTX = ResourcesPackage.PLAN_DEFINITION__SUBJECTX;

	/**
	 * The feature id for the '<em><b>Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZATIONPLANDEFINITION__DATE = ResourcesPackage.PLAN_DEFINITION__DATE;

	/**
	 * The feature id for the '<em><b>Publisher</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZATIONPLANDEFINITION__PUBLISHER = ResourcesPackage.PLAN_DEFINITION__PUBLISHER;

	/**
	 * The feature id for the '<em><b>Contact</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZATIONPLANDEFINITION__CONTACT = ResourcesPackage.PLAN_DEFINITION__CONTACT;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZATIONPLANDEFINITION__DESCRIPTION = ResourcesPackage.PLAN_DEFINITION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Use Context</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZATIONPLANDEFINITION__USE_CONTEXT = ResourcesPackage.PLAN_DEFINITION__USE_CONTEXT;

	/**
	 * The feature id for the '<em><b>Jurisdiction</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZATIONPLANDEFINITION__JURISDICTION = ResourcesPackage.PLAN_DEFINITION__JURISDICTION;

	/**
	 * The feature id for the '<em><b>Purpose</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZATIONPLANDEFINITION__PURPOSE = ResourcesPackage.PLAN_DEFINITION__PURPOSE;

	/**
	 * The feature id for the '<em><b>Usage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZATIONPLANDEFINITION__USAGE = ResourcesPackage.PLAN_DEFINITION__USAGE;

	/**
	 * The feature id for the '<em><b>Copyright</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZATIONPLANDEFINITION__COPYRIGHT = ResourcesPackage.PLAN_DEFINITION__COPYRIGHT;

	/**
	 * The feature id for the '<em><b>Approval Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZATIONPLANDEFINITION__APPROVAL_DATE = ResourcesPackage.PLAN_DEFINITION__APPROVAL_DATE;

	/**
	 * The feature id for the '<em><b>Last Review Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZATIONPLANDEFINITION__LAST_REVIEW_DATE = ResourcesPackage.PLAN_DEFINITION__LAST_REVIEW_DATE;

	/**
	 * The feature id for the '<em><b>Effective Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZATIONPLANDEFINITION__EFFECTIVE_PERIOD = ResourcesPackage.PLAN_DEFINITION__EFFECTIVE_PERIOD;

	/**
	 * The feature id for the '<em><b>Topic</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZATIONPLANDEFINITION__TOPIC = ResourcesPackage.PLAN_DEFINITION__TOPIC;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZATIONPLANDEFINITION__AUTHOR = ResourcesPackage.PLAN_DEFINITION__AUTHOR;

	/**
	 * The feature id for the '<em><b>Editor</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZATIONPLANDEFINITION__EDITOR = ResourcesPackage.PLAN_DEFINITION__EDITOR;

	/**
	 * The feature id for the '<em><b>Reviewer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZATIONPLANDEFINITION__REVIEWER = ResourcesPackage.PLAN_DEFINITION__REVIEWER;

	/**
	 * The feature id for the '<em><b>Endorser</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZATIONPLANDEFINITION__ENDORSER = ResourcesPackage.PLAN_DEFINITION__ENDORSER;

	/**
	 * The feature id for the '<em><b>Related Artifact</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZATIONPLANDEFINITION__RELATED_ARTIFACT = ResourcesPackage.PLAN_DEFINITION__RELATED_ARTIFACT;

	/**
	 * The feature id for the '<em><b>Library</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZATIONPLANDEFINITION__LIBRARY = ResourcesPackage.PLAN_DEFINITION__LIBRARY;

	/**
	 * The feature id for the '<em><b>Goal</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZATIONPLANDEFINITION__GOAL = ResourcesPackage.PLAN_DEFINITION__GOAL;

	/**
	 * The feature id for the '<em><b>Action</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZATIONPLANDEFINITION__ACTION = ResourcesPackage.PLAN_DEFINITION__ACTION;

	/**
	 * The number of structural features of the '<em>Synchronizationplandefinition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZATIONPLANDEFINITION_FEATURE_COUNT = ResourcesPackage.PLAN_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Synchronizationplandefinition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZATIONPLANDEFINITION_OPERATION_COUNT = ResourcesPackage.PLAN_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fhiRCore.profiles.impl.VitalspanelImpl <em>Vitalspanel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.profiles.impl.VitalspanelImpl
	 * @see fhiRCore.profiles.impl.ProfilesPackageImpl#getVitalspanel()
	 * @generated
	 */
	int VITALSPANEL = 65;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITALSPANEL__ID = VITALSIGNS__ID;

	/**
	 * The feature id for the '<em><b>Meta</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITALSPANEL__META = VITALSIGNS__META;

	/**
	 * The feature id for the '<em><b>Implicit Rules</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITALSPANEL__IMPLICIT_RULES = VITALSIGNS__IMPLICIT_RULES;

	/**
	 * The feature id for the '<em><b>Language</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITALSPANEL__LANGUAGE = VITALSIGNS__LANGUAGE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITALSPANEL__TEXT = VITALSIGNS__TEXT;

	/**
	 * The feature id for the '<em><b>Contained</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITALSPANEL__CONTAINED = VITALSIGNS__CONTAINED;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITALSPANEL__EXTENSION = VITALSIGNS__EXTENSION;

	/**
	 * The feature id for the '<em><b>Modifier Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITALSPANEL__MODIFIER_EXTENSION = VITALSIGNS__MODIFIER_EXTENSION;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITALSPANEL__IDENTIFIER = VITALSIGNS__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Based On</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITALSPANEL__BASED_ON = VITALSIGNS__BASED_ON;

	/**
	 * The feature id for the '<em><b>Part Of</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITALSPANEL__PART_OF = VITALSIGNS__PART_OF;

	/**
	 * The feature id for the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITALSPANEL__STATUS = VITALSIGNS__STATUS;

	/**
	 * The feature id for the '<em><b>Category</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITALSPANEL__CATEGORY = VITALSIGNS__CATEGORY;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITALSPANEL__CODE = VITALSIGNS__CODE;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITALSPANEL__SUBJECT = VITALSIGNS__SUBJECT;

	/**
	 * The feature id for the '<em><b>Focus</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITALSPANEL__FOCUS = VITALSIGNS__FOCUS;

	/**
	 * The feature id for the '<em><b>Encounter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITALSPANEL__ENCOUNTER = VITALSIGNS__ENCOUNTER;

	/**
	 * The feature id for the '<em><b>Effectivex</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITALSPANEL__EFFECTIVEX = VITALSIGNS__EFFECTIVEX;

	/**
	 * The feature id for the '<em><b>Issued</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITALSPANEL__ISSUED = VITALSIGNS__ISSUED;

	/**
	 * The feature id for the '<em><b>Performer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITALSPANEL__PERFORMER = VITALSIGNS__PERFORMER;

	/**
	 * The feature id for the '<em><b>Valuex</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITALSPANEL__VALUEX = VITALSIGNS__VALUEX;

	/**
	 * The feature id for the '<em><b>Data Absent Reason</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITALSPANEL__DATA_ABSENT_REASON = VITALSIGNS__DATA_ABSENT_REASON;

	/**
	 * The feature id for the '<em><b>Interpretation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITALSPANEL__INTERPRETATION = VITALSIGNS__INTERPRETATION;

	/**
	 * The feature id for the '<em><b>Note</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITALSPANEL__NOTE = VITALSIGNS__NOTE;

	/**
	 * The feature id for the '<em><b>Body Site</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITALSPANEL__BODY_SITE = VITALSIGNS__BODY_SITE;

	/**
	 * The feature id for the '<em><b>Method</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITALSPANEL__METHOD = VITALSIGNS__METHOD;

	/**
	 * The feature id for the '<em><b>Specimen</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITALSPANEL__SPECIMEN = VITALSIGNS__SPECIMEN;

	/**
	 * The feature id for the '<em><b>Device</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITALSPANEL__DEVICE = VITALSIGNS__DEVICE;

	/**
	 * The feature id for the '<em><b>Has Member</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITALSPANEL__HAS_MEMBER = VITALSIGNS__HAS_MEMBER;

	/**
	 * The feature id for the '<em><b>Derived From</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITALSPANEL__DERIVED_FROM = VITALSIGNS__DERIVED_FROM;

	/**
	 * The feature id for the '<em><b>Component</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITALSPANEL__COMPONENT = VITALSIGNS__COMPONENT;

	/**
	 * The feature id for the '<em><b>Reference Range</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITALSPANEL__REFERENCE_RANGE = VITALSIGNS__REFERENCE_RANGE;

	/**
	 * The feature id for the '<em><b>Vs Cat</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITALSPANEL__VS_CAT = VITALSIGNS__VS_CAT;

	/**
	 * The number of structural features of the '<em>Vitalspanel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITALSPANEL_FEATURE_COUNT = VITALSIGNS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Vitalspanel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITALSPANEL_OPERATION_COUNT = VITALSIGNS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fhiRCore.profiles.impl.VitalspanelCodeableConcept1Impl <em>Vitalspanel Codeable Concept1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.profiles.impl.VitalspanelCodeableConcept1Impl
	 * @see fhiRCore.profiles.impl.ProfilesPackageImpl#getVitalspanelCodeableConcept1()
	 * @generated
	 */
	int VITALSPANEL_CODEABLE_CONCEPT1 = 66;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITALSPANEL_CODEABLE_CONCEPT1__ID = DataTypesPackage.CODEABLE_CONCEPT__ID;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITALSPANEL_CODEABLE_CONCEPT1__EXTENSION = DataTypesPackage.CODEABLE_CONCEPT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Coding</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITALSPANEL_CODEABLE_CONCEPT1__CODING = DataTypesPackage.CODEABLE_CONCEPT__CODING;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITALSPANEL_CODEABLE_CONCEPT1__TEXT = DataTypesPackage.CODEABLE_CONCEPT__TEXT;

	/**
	 * The feature id for the '<em><b>Vitals Panel Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITALSPANEL_CODEABLE_CONCEPT1__VITALS_PANEL_CODE = DataTypesPackage.CODEABLE_CONCEPT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Vitalspanel Codeable Concept1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITALSPANEL_CODEABLE_CONCEPT1_FEATURE_COUNT = DataTypesPackage.CODEABLE_CONCEPT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Vitalspanel Codeable Concept1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITALSPANEL_CODEABLE_CONCEPT1_OPERATION_COUNT = DataTypesPackage.CODEABLE_CONCEPT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fhiRCore.profiles.impl.VitalspanelCodeableConcept1Coding1Impl <em>Vitalspanel Codeable Concept1 Coding1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.profiles.impl.VitalspanelCodeableConcept1Coding1Impl
	 * @see fhiRCore.profiles.impl.ProfilesPackageImpl#getVitalspanelCodeableConcept1Coding1()
	 * @generated
	 */
	int VITALSPANEL_CODEABLE_CONCEPT1_CODING1 = 67;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITALSPANEL_CODEABLE_CONCEPT1_CODING1__ID = DataTypesPackage.CODING__ID;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITALSPANEL_CODEABLE_CONCEPT1_CODING1__EXTENSION = DataTypesPackage.CODING__EXTENSION;

	/**
	 * The feature id for the '<em><b>System</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITALSPANEL_CODEABLE_CONCEPT1_CODING1__SYSTEM = DataTypesPackage.CODING__SYSTEM;

	/**
	 * The feature id for the '<em><b>Version</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITALSPANEL_CODEABLE_CONCEPT1_CODING1__VERSION = DataTypesPackage.CODING__VERSION;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITALSPANEL_CODEABLE_CONCEPT1_CODING1__CODE = DataTypesPackage.CODING__CODE;

	/**
	 * The feature id for the '<em><b>Display</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITALSPANEL_CODEABLE_CONCEPT1_CODING1__DISPLAY = DataTypesPackage.CODING__DISPLAY;

	/**
	 * The feature id for the '<em><b>User Selected</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITALSPANEL_CODEABLE_CONCEPT1_CODING1__USER_SELECTED = DataTypesPackage.CODING__USER_SELECTED;

	/**
	 * The number of structural features of the '<em>Vitalspanel Codeable Concept1 Coding1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITALSPANEL_CODEABLE_CONCEPT1_CODING1_FEATURE_COUNT = DataTypesPackage.CODING_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Vitalspanel Codeable Concept1 Coding1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITALSPANEL_CODEABLE_CONCEPT1_CODING1_OPERATION_COUNT = DataTypesPackage.CODING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fhiRCore.profiles.impl.SynthesisImpl <em>Synthesis</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.profiles.impl.SynthesisImpl
	 * @see fhiRCore.profiles.impl.ProfilesPackageImpl#getSynthesis()
	 * @generated
	 */
	int SYNTHESIS = 68;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNTHESIS__ID = ResourcesPackage.EVIDENCE__ID;

	/**
	 * The feature id for the '<em><b>Meta</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNTHESIS__META = ResourcesPackage.EVIDENCE__META;

	/**
	 * The feature id for the '<em><b>Implicit Rules</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNTHESIS__IMPLICIT_RULES = ResourcesPackage.EVIDENCE__IMPLICIT_RULES;

	/**
	 * The feature id for the '<em><b>Language</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNTHESIS__LANGUAGE = ResourcesPackage.EVIDENCE__LANGUAGE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNTHESIS__TEXT = ResourcesPackage.EVIDENCE__TEXT;

	/**
	 * The feature id for the '<em><b>Contained</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNTHESIS__CONTAINED = ResourcesPackage.EVIDENCE__CONTAINED;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNTHESIS__EXTENSION = ResourcesPackage.EVIDENCE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Modifier Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNTHESIS__MODIFIER_EXTENSION = ResourcesPackage.EVIDENCE__MODIFIER_EXTENSION;

	/**
	 * The feature id for the '<em><b>Url</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNTHESIS__URL = ResourcesPackage.EVIDENCE__URL;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNTHESIS__IDENTIFIER = ResourcesPackage.EVIDENCE__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Version</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNTHESIS__VERSION = ResourcesPackage.EVIDENCE__VERSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNTHESIS__NAME = ResourcesPackage.EVIDENCE__NAME;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNTHESIS__TITLE = ResourcesPackage.EVIDENCE__TITLE;

	/**
	 * The feature id for the '<em><b>Short Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNTHESIS__SHORT_TITLE = ResourcesPackage.EVIDENCE__SHORT_TITLE;

	/**
	 * The feature id for the '<em><b>Subtitle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNTHESIS__SUBTITLE = ResourcesPackage.EVIDENCE__SUBTITLE;

	/**
	 * The feature id for the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNTHESIS__STATUS = ResourcesPackage.EVIDENCE__STATUS;

	/**
	 * The feature id for the '<em><b>Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNTHESIS__DATE = ResourcesPackage.EVIDENCE__DATE;

	/**
	 * The feature id for the '<em><b>Publisher</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNTHESIS__PUBLISHER = ResourcesPackage.EVIDENCE__PUBLISHER;

	/**
	 * The feature id for the '<em><b>Contact</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNTHESIS__CONTACT = ResourcesPackage.EVIDENCE__CONTACT;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNTHESIS__DESCRIPTION = ResourcesPackage.EVIDENCE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Note</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNTHESIS__NOTE = ResourcesPackage.EVIDENCE__NOTE;

	/**
	 * The feature id for the '<em><b>Use Context</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNTHESIS__USE_CONTEXT = ResourcesPackage.EVIDENCE__USE_CONTEXT;

	/**
	 * The feature id for the '<em><b>Jurisdiction</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNTHESIS__JURISDICTION = ResourcesPackage.EVIDENCE__JURISDICTION;

	/**
	 * The feature id for the '<em><b>Copyright</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNTHESIS__COPYRIGHT = ResourcesPackage.EVIDENCE__COPYRIGHT;

	/**
	 * The feature id for the '<em><b>Approval Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNTHESIS__APPROVAL_DATE = ResourcesPackage.EVIDENCE__APPROVAL_DATE;

	/**
	 * The feature id for the '<em><b>Last Review Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNTHESIS__LAST_REVIEW_DATE = ResourcesPackage.EVIDENCE__LAST_REVIEW_DATE;

	/**
	 * The feature id for the '<em><b>Effective Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNTHESIS__EFFECTIVE_PERIOD = ResourcesPackage.EVIDENCE__EFFECTIVE_PERIOD;

	/**
	 * The feature id for the '<em><b>Topic</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNTHESIS__TOPIC = ResourcesPackage.EVIDENCE__TOPIC;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNTHESIS__AUTHOR = ResourcesPackage.EVIDENCE__AUTHOR;

	/**
	 * The feature id for the '<em><b>Editor</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNTHESIS__EDITOR = ResourcesPackage.EVIDENCE__EDITOR;

	/**
	 * The feature id for the '<em><b>Reviewer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNTHESIS__REVIEWER = ResourcesPackage.EVIDENCE__REVIEWER;

	/**
	 * The feature id for the '<em><b>Endorser</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNTHESIS__ENDORSER = ResourcesPackage.EVIDENCE__ENDORSER;

	/**
	 * The feature id for the '<em><b>Related Artifact</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNTHESIS__RELATED_ARTIFACT = ResourcesPackage.EVIDENCE__RELATED_ARTIFACT;

	/**
	 * The feature id for the '<em><b>Exposure Background</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNTHESIS__EXPOSURE_BACKGROUND = ResourcesPackage.EVIDENCE__EXPOSURE_BACKGROUND;

	/**
	 * The feature id for the '<em><b>Exposure Variant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNTHESIS__EXPOSURE_VARIANT = ResourcesPackage.EVIDENCE__EXPOSURE_VARIANT;

	/**
	 * The feature id for the '<em><b>Outcome</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNTHESIS__OUTCOME = ResourcesPackage.EVIDENCE__OUTCOME;

	/**
	 * The number of structural features of the '<em>Synthesis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNTHESIS_FEATURE_COUNT = ResourcesPackage.EVIDENCE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Synthesis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNTHESIS_OPERATION_COUNT = ResourcesPackage.EVIDENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fhiRCore.profiles.impl.SubstanceDefinitionImpl <em>Substance Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.profiles.impl.SubstanceDefinitionImpl
	 * @see fhiRCore.profiles.impl.ProfilesPackageImpl#getSubstanceDefinition()
	 * @generated
	 */
	int SUBSTANCE_DEFINITION = 69;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTANCE_DEFINITION__ID = ResourcesPackage.DOMAIN_RESOURCE__ID;

	/**
	 * The feature id for the '<em><b>Meta</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTANCE_DEFINITION__META = ResourcesPackage.DOMAIN_RESOURCE__META;

	/**
	 * The feature id for the '<em><b>Implicit Rules</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTANCE_DEFINITION__IMPLICIT_RULES = ResourcesPackage.DOMAIN_RESOURCE__IMPLICIT_RULES;

	/**
	 * The feature id for the '<em><b>Language</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTANCE_DEFINITION__LANGUAGE = ResourcesPackage.DOMAIN_RESOURCE__LANGUAGE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTANCE_DEFINITION__TEXT = ResourcesPackage.DOMAIN_RESOURCE__TEXT;

	/**
	 * The feature id for the '<em><b>Contained</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTANCE_DEFINITION__CONTAINED = ResourcesPackage.DOMAIN_RESOURCE__CONTAINED;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTANCE_DEFINITION__EXTENSION = ResourcesPackage.DOMAIN_RESOURCE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Modifier Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTANCE_DEFINITION__MODIFIER_EXTENSION = ResourcesPackage.DOMAIN_RESOURCE__MODIFIER_EXTENSION;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTANCE_DEFINITION__IDENTIFIER = ResourcesPackage.DOMAIN_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTANCE_DEFINITION__TYPE = ResourcesPackage.DOMAIN_RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTANCE_DEFINITION__STATUS = ResourcesPackage.DOMAIN_RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Domain</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTANCE_DEFINITION__DOMAIN = ResourcesPackage.DOMAIN_RESOURCE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTANCE_DEFINITION__DESCRIPTION = ResourcesPackage.DOMAIN_RESOURCE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTANCE_DEFINITION__SOURCE = ResourcesPackage.DOMAIN_RESOURCE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTANCE_DEFINITION__COMMENT = ResourcesPackage.DOMAIN_RESOURCE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Moiety</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTANCE_DEFINITION__MOIETY = ResourcesPackage.DOMAIN_RESOURCE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTANCE_DEFINITION__PROPERTY = ResourcesPackage.DOMAIN_RESOURCE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Reference Information</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTANCE_DEFINITION__REFERENCE_INFORMATION = ResourcesPackage.DOMAIN_RESOURCE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Structure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTANCE_DEFINITION__STRUCTURE = ResourcesPackage.DOMAIN_RESOURCE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTANCE_DEFINITION__CODE = ResourcesPackage.DOMAIN_RESOURCE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTANCE_DEFINITION__NAME = ResourcesPackage.DOMAIN_RESOURCE_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Molecular Weight</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTANCE_DEFINITION__MOLECULAR_WEIGHT = ResourcesPackage.DOMAIN_RESOURCE_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Relationship</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTANCE_DEFINITION__RELATIONSHIP = ResourcesPackage.DOMAIN_RESOURCE_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Nucleic Acid</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTANCE_DEFINITION__NUCLEIC_ACID = ResourcesPackage.DOMAIN_RESOURCE_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Polymer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTANCE_DEFINITION__POLYMER = ResourcesPackage.DOMAIN_RESOURCE_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Protein</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTANCE_DEFINITION__PROTEIN = ResourcesPackage.DOMAIN_RESOURCE_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Source Material</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTANCE_DEFINITION__SOURCE_MATERIAL = ResourcesPackage.DOMAIN_RESOURCE_FEATURE_COUNT + 18;

	/**
	 * The number of structural features of the '<em>Substance Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTANCE_DEFINITION_FEATURE_COUNT = ResourcesPackage.DOMAIN_RESOURCE_FEATURE_COUNT + 19;

	/**
	 * The number of operations of the '<em>Substance Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTANCE_DEFINITION_OPERATION_COUNT = ResourcesPackage.DOMAIN_RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fhiRCore.profiles.impl.SubstanceDefinitionMoietyImpl <em>Substance Definition Moiety</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.profiles.impl.SubstanceDefinitionMoietyImpl
	 * @see fhiRCore.profiles.impl.ProfilesPackageImpl#getSubstanceDefinitionMoiety()
	 * @generated
	 */
	int SUBSTANCE_DEFINITION_MOIETY = 70;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTANCE_DEFINITION_MOIETY__ID = DataTypesPackage.BACKBONE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTANCE_DEFINITION_MOIETY__EXTENSION = DataTypesPackage.BACKBONE_ELEMENT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Modifier Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTANCE_DEFINITION_MOIETY__MODIFIER_EXTENSION = DataTypesPackage.BACKBONE_ELEMENT__MODIFIER_EXTENSION;

	/**
	 * The feature id for the '<em><b>Role</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTANCE_DEFINITION_MOIETY__ROLE = DataTypesPackage.BACKBONE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTANCE_DEFINITION_MOIETY__IDENTIFIER = DataTypesPackage.BACKBONE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTANCE_DEFINITION_MOIETY__NAME = DataTypesPackage.BACKBONE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Stereochemistry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTANCE_DEFINITION_MOIETY__STEREOCHEMISTRY = DataTypesPackage.BACKBONE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Optical Activity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTANCE_DEFINITION_MOIETY__OPTICAL_ACTIVITY = DataTypesPackage.BACKBONE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Molecular Formula</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTANCE_DEFINITION_MOIETY__MOLECULAR_FORMULA = DataTypesPackage.BACKBONE_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Amountx</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTANCE_DEFINITION_MOIETY__AMOUNTX = DataTypesPackage.BACKBONE_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Substance Definition Moiety</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTANCE_DEFINITION_MOIETY_FEATURE_COUNT = DataTypesPackage.BACKBONE_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Substance Definition Moiety</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTANCE_DEFINITION_MOIETY_OPERATION_COUNT = DataTypesPackage.BACKBONE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fhiRCore.profiles.impl.SubstanceDefinitionPropertyImpl <em>Substance Definition Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.profiles.impl.SubstanceDefinitionPropertyImpl
	 * @see fhiRCore.profiles.impl.ProfilesPackageImpl#getSubstanceDefinitionProperty()
	 * @generated
	 */
	int SUBSTANCE_DEFINITION_PROPERTY = 71;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTANCE_DEFINITION_PROPERTY__ID = DataTypesPackage.BACKBONE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTANCE_DEFINITION_PROPERTY__EXTENSION = DataTypesPackage.BACKBONE_ELEMENT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Modifier Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTANCE_DEFINITION_PROPERTY__MODIFIER_EXTENSION = DataTypesPackage.BACKBONE_ELEMENT__MODIFIER_EXTENSION;

	/**
	 * The feature id for the '<em><b>Category</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTANCE_DEFINITION_PROPERTY__CATEGORY = DataTypesPackage.BACKBONE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTANCE_DEFINITION_PROPERTY__CODE = DataTypesPackage.BACKBONE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTANCE_DEFINITION_PROPERTY__PARAMETERS = DataTypesPackage.BACKBONE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Defining Substancex</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTANCE_DEFINITION_PROPERTY__DEFINING_SUBSTANCEX = DataTypesPackage.BACKBONE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Amountx</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTANCE_DEFINITION_PROPERTY__AMOUNTX = DataTypesPackage.BACKBONE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Substance Definition Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTANCE_DEFINITION_PROPERTY_FEATURE_COUNT = DataTypesPackage.BACKBONE_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Substance Definition Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTANCE_DEFINITION_PROPERTY_OPERATION_COUNT = DataTypesPackage.BACKBONE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fhiRCore.profiles.impl.SubstanceDefinitionStructureImpl <em>Substance Definition Structure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.profiles.impl.SubstanceDefinitionStructureImpl
	 * @see fhiRCore.profiles.impl.ProfilesPackageImpl#getSubstanceDefinitionStructure()
	 * @generated
	 */
	int SUBSTANCE_DEFINITION_STRUCTURE = 72;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTANCE_DEFINITION_STRUCTURE__ID = DataTypesPackage.BACKBONE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTANCE_DEFINITION_STRUCTURE__EXTENSION = DataTypesPackage.BACKBONE_ELEMENT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Modifier Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTANCE_DEFINITION_STRUCTURE__MODIFIER_EXTENSION = DataTypesPackage.BACKBONE_ELEMENT__MODIFIER_EXTENSION;

	/**
	 * The feature id for the '<em><b>Stereochemistry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTANCE_DEFINITION_STRUCTURE__STEREOCHEMISTRY = DataTypesPackage.BACKBONE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Optical Activity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTANCE_DEFINITION_STRUCTURE__OPTICAL_ACTIVITY = DataTypesPackage.BACKBONE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Molecular Formula</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTANCE_DEFINITION_STRUCTURE__MOLECULAR_FORMULA = DataTypesPackage.BACKBONE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Molecular Formula By Moiety</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTANCE_DEFINITION_STRUCTURE__MOLECULAR_FORMULA_BY_MOIETY = DataTypesPackage.BACKBONE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Isotope</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTANCE_DEFINITION_STRUCTURE__ISOTOPE = DataTypesPackage.BACKBONE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Molecular Weight</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTANCE_DEFINITION_STRUCTURE__MOLECULAR_WEIGHT = DataTypesPackage.BACKBONE_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTANCE_DEFINITION_STRUCTURE__SOURCE = DataTypesPackage.BACKBONE_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Representation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTANCE_DEFINITION_STRUCTURE__REPRESENTATION = DataTypesPackage.BACKBONE_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Substance Definition Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTANCE_DEFINITION_STRUCTURE_FEATURE_COUNT = DataTypesPackage.BACKBONE_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Substance Definition Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTANCE_DEFINITION_STRUCTURE_OPERATION_COUNT = DataTypesPackage.BACKBONE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fhiRCore.profiles.impl.SubstanceDefinitionStructureIsotopeImpl <em>Substance Definition Structure Isotope</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.profiles.impl.SubstanceDefinitionStructureIsotopeImpl
	 * @see fhiRCore.profiles.impl.ProfilesPackageImpl#getSubstanceDefinitionStructureIsotope()
	 * @generated
	 */
	int SUBSTANCE_DEFINITION_STRUCTURE_ISOTOPE = 73;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTANCE_DEFINITION_STRUCTURE_ISOTOPE__ID = DataTypesPackage.BACKBONE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTANCE_DEFINITION_STRUCTURE_ISOTOPE__EXTENSION = DataTypesPackage.BACKBONE_ELEMENT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Modifier Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTANCE_DEFINITION_STRUCTURE_ISOTOPE__MODIFIER_EXTENSION = DataTypesPackage.BACKBONE_ELEMENT__MODIFIER_EXTENSION;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTANCE_DEFINITION_STRUCTURE_ISOTOPE__IDENTIFIER = DataTypesPackage.BACKBONE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTANCE_DEFINITION_STRUCTURE_ISOTOPE__NAME = DataTypesPackage.BACKBONE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Substitution</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTANCE_DEFINITION_STRUCTURE_ISOTOPE__SUBSTITUTION = DataTypesPackage.BACKBONE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Half Life</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTANCE_DEFINITION_STRUCTURE_ISOTOPE__HALF_LIFE = DataTypesPackage.BACKBONE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Molecular Weight</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTANCE_DEFINITION_STRUCTURE_ISOTOPE__MOLECULAR_WEIGHT = DataTypesPackage.BACKBONE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Substance Definition Structure Isotope</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTANCE_DEFINITION_STRUCTURE_ISOTOPE_FEATURE_COUNT = DataTypesPackage.BACKBONE_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Substance Definition Structure Isotope</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTANCE_DEFINITION_STRUCTURE_ISOTOPE_OPERATION_COUNT = DataTypesPackage.BACKBONE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fhiRCore.profiles.impl.SubstanceDefinitionStructureIsotopeMolecularWeightImpl <em>Substance Definition Structure Isotope Molecular Weight</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.profiles.impl.SubstanceDefinitionStructureIsotopeMolecularWeightImpl
	 * @see fhiRCore.profiles.impl.ProfilesPackageImpl#getSubstanceDefinitionStructureIsotopeMolecularWeight()
	 * @generated
	 */
	int SUBSTANCE_DEFINITION_STRUCTURE_ISOTOPE_MOLECULAR_WEIGHT = 74;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTANCE_DEFINITION_STRUCTURE_ISOTOPE_MOLECULAR_WEIGHT__ID = DataTypesPackage.BACKBONE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTANCE_DEFINITION_STRUCTURE_ISOTOPE_MOLECULAR_WEIGHT__EXTENSION = DataTypesPackage.BACKBONE_ELEMENT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Modifier Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTANCE_DEFINITION_STRUCTURE_ISOTOPE_MOLECULAR_WEIGHT__MODIFIER_EXTENSION = DataTypesPackage.BACKBONE_ELEMENT__MODIFIER_EXTENSION;

	/**
	 * The feature id for the '<em><b>Method</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTANCE_DEFINITION_STRUCTURE_ISOTOPE_MOLECULAR_WEIGHT__METHOD = DataTypesPackage.BACKBONE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTANCE_DEFINITION_STRUCTURE_ISOTOPE_MOLECULAR_WEIGHT__TYPE = DataTypesPackage.BACKBONE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Amount</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTANCE_DEFINITION_STRUCTURE_ISOTOPE_MOLECULAR_WEIGHT__AMOUNT = DataTypesPackage.BACKBONE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Substance Definition Structure Isotope Molecular Weight</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTANCE_DEFINITION_STRUCTURE_ISOTOPE_MOLECULAR_WEIGHT_FEATURE_COUNT = DataTypesPackage.BACKBONE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Substance Definition Structure Isotope Molecular Weight</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTANCE_DEFINITION_STRUCTURE_ISOTOPE_MOLECULAR_WEIGHT_OPERATION_COUNT = DataTypesPackage.BACKBONE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fhiRCore.profiles.impl.SubstanceDefinitionStructureRepresentationImpl <em>Substance Definition Structure Representation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.profiles.impl.SubstanceDefinitionStructureRepresentationImpl
	 * @see fhiRCore.profiles.impl.ProfilesPackageImpl#getSubstanceDefinitionStructureRepresentation()
	 * @generated
	 */
	int SUBSTANCE_DEFINITION_STRUCTURE_REPRESENTATION = 75;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTANCE_DEFINITION_STRUCTURE_REPRESENTATION__ID = DataTypesPackage.BACKBONE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTANCE_DEFINITION_STRUCTURE_REPRESENTATION__EXTENSION = DataTypesPackage.BACKBONE_ELEMENT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Modifier Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTANCE_DEFINITION_STRUCTURE_REPRESENTATION__MODIFIER_EXTENSION = DataTypesPackage.BACKBONE_ELEMENT__MODIFIER_EXTENSION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTANCE_DEFINITION_STRUCTURE_REPRESENTATION__TYPE = DataTypesPackage.BACKBONE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Representation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTANCE_DEFINITION_STRUCTURE_REPRESENTATION__REPRESENTATION = DataTypesPackage.BACKBONE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Attachment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTANCE_DEFINITION_STRUCTURE_REPRESENTATION__ATTACHMENT = DataTypesPackage.BACKBONE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Substance Definition Structure Representation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTANCE_DEFINITION_STRUCTURE_REPRESENTATION_FEATURE_COUNT = DataTypesPackage.BACKBONE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Substance Definition Structure Representation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTANCE_DEFINITION_STRUCTURE_REPRESENTATION_OPERATION_COUNT = DataTypesPackage.BACKBONE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fhiRCore.profiles.impl.SubstanceDefinitionCodeImpl <em>Substance Definition Code</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.profiles.impl.SubstanceDefinitionCodeImpl
	 * @see fhiRCore.profiles.impl.ProfilesPackageImpl#getSubstanceDefinitionCode()
	 * @generated
	 */
	int SUBSTANCE_DEFINITION_CODE = 76;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTANCE_DEFINITION_CODE__ID = DataTypesPackage.BACKBONE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTANCE_DEFINITION_CODE__EXTENSION = DataTypesPackage.BACKBONE_ELEMENT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Modifier Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTANCE_DEFINITION_CODE__MODIFIER_EXTENSION = DataTypesPackage.BACKBONE_ELEMENT__MODIFIER_EXTENSION;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTANCE_DEFINITION_CODE__CODE = DataTypesPackage.BACKBONE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTANCE_DEFINITION_CODE__STATUS = DataTypesPackage.BACKBONE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Status Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTANCE_DEFINITION_CODE__STATUS_DATE = DataTypesPackage.BACKBONE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTANCE_DEFINITION_CODE__COMMENT = DataTypesPackage.BACKBONE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTANCE_DEFINITION_CODE__SOURCE = DataTypesPackage.BACKBONE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Substance Definition Code</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTANCE_DEFINITION_CODE_FEATURE_COUNT = DataTypesPackage.BACKBONE_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Substance Definition Code</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTANCE_DEFINITION_CODE_OPERATION_COUNT = DataTypesPackage.BACKBONE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fhiRCore.profiles.impl.SubstanceDefinitionNameImpl <em>Substance Definition Name</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.profiles.impl.SubstanceDefinitionNameImpl
	 * @see fhiRCore.profiles.impl.ProfilesPackageImpl#getSubstanceDefinitionName()
	 * @generated
	 */
	int SUBSTANCE_DEFINITION_NAME = 77;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTANCE_DEFINITION_NAME__ID = DataTypesPackage.BACKBONE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTANCE_DEFINITION_NAME__EXTENSION = DataTypesPackage.BACKBONE_ELEMENT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Modifier Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTANCE_DEFINITION_NAME__MODIFIER_EXTENSION = DataTypesPackage.BACKBONE_ELEMENT__MODIFIER_EXTENSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTANCE_DEFINITION_NAME__NAME = DataTypesPackage.BACKBONE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTANCE_DEFINITION_NAME__TYPE = DataTypesPackage.BACKBONE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTANCE_DEFINITION_NAME__STATUS = DataTypesPackage.BACKBONE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Preferred</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTANCE_DEFINITION_NAME__PREFERRED = DataTypesPackage.BACKBONE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Language</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTANCE_DEFINITION_NAME__LANGUAGE = DataTypesPackage.BACKBONE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Domain</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTANCE_DEFINITION_NAME__DOMAIN = DataTypesPackage.BACKBONE_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Jurisdiction</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTANCE_DEFINITION_NAME__JURISDICTION = DataTypesPackage.BACKBONE_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Synonym</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTANCE_DEFINITION_NAME__SYNONYM = DataTypesPackage.BACKBONE_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Translation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTANCE_DEFINITION_NAME__TRANSLATION = DataTypesPackage.BACKBONE_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Official</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTANCE_DEFINITION_NAME__OFFICIAL = DataTypesPackage.BACKBONE_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTANCE_DEFINITION_NAME__SOURCE = DataTypesPackage.BACKBONE_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>Substance Definition Name</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTANCE_DEFINITION_NAME_FEATURE_COUNT = DataTypesPackage.BACKBONE_ELEMENT_FEATURE_COUNT + 11;

	/**
	 * The number of operations of the '<em>Substance Definition Name</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTANCE_DEFINITION_NAME_OPERATION_COUNT = DataTypesPackage.BACKBONE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fhiRCore.profiles.impl.SubstanceDefinitionNameOfficialImpl <em>Substance Definition Name Official</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.profiles.impl.SubstanceDefinitionNameOfficialImpl
	 * @see fhiRCore.profiles.impl.ProfilesPackageImpl#getSubstanceDefinitionNameOfficial()
	 * @generated
	 */
	int SUBSTANCE_DEFINITION_NAME_OFFICIAL = 78;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTANCE_DEFINITION_NAME_OFFICIAL__ID = DataTypesPackage.BACKBONE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTANCE_DEFINITION_NAME_OFFICIAL__EXTENSION = DataTypesPackage.BACKBONE_ELEMENT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Modifier Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTANCE_DEFINITION_NAME_OFFICIAL__MODIFIER_EXTENSION = DataTypesPackage.BACKBONE_ELEMENT__MODIFIER_EXTENSION;

	/**
	 * The feature id for the '<em><b>Authority</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTANCE_DEFINITION_NAME_OFFICIAL__AUTHORITY = DataTypesPackage.BACKBONE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTANCE_DEFINITION_NAME_OFFICIAL__STATUS = DataTypesPackage.BACKBONE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTANCE_DEFINITION_NAME_OFFICIAL__DATE = DataTypesPackage.BACKBONE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Substance Definition Name Official</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTANCE_DEFINITION_NAME_OFFICIAL_FEATURE_COUNT = DataTypesPackage.BACKBONE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Substance Definition Name Official</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTANCE_DEFINITION_NAME_OFFICIAL_OPERATION_COUNT = DataTypesPackage.BACKBONE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fhiRCore.profiles.impl.SubstanceDefinitionRelationshipImpl <em>Substance Definition Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.profiles.impl.SubstanceDefinitionRelationshipImpl
	 * @see fhiRCore.profiles.impl.ProfilesPackageImpl#getSubstanceDefinitionRelationship()
	 * @generated
	 */
	int SUBSTANCE_DEFINITION_RELATIONSHIP = 79;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTANCE_DEFINITION_RELATIONSHIP__ID = DataTypesPackage.BACKBONE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTANCE_DEFINITION_RELATIONSHIP__EXTENSION = DataTypesPackage.BACKBONE_ELEMENT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Modifier Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTANCE_DEFINITION_RELATIONSHIP__MODIFIER_EXTENSION = DataTypesPackage.BACKBONE_ELEMENT__MODIFIER_EXTENSION;

	/**
	 * The feature id for the '<em><b>Substancex</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTANCE_DEFINITION_RELATIONSHIP__SUBSTANCEX = DataTypesPackage.BACKBONE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Relationship</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTANCE_DEFINITION_RELATIONSHIP__RELATIONSHIP = DataTypesPackage.BACKBONE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Defining</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTANCE_DEFINITION_RELATIONSHIP__IS_DEFINING = DataTypesPackage.BACKBONE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Amountx</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTANCE_DEFINITION_RELATIONSHIP__AMOUNTX = DataTypesPackage.BACKBONE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Amount Ratio Low Limit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTANCE_DEFINITION_RELATIONSHIP__AMOUNT_RATIO_LOW_LIMIT = DataTypesPackage.BACKBONE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Amount Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTANCE_DEFINITION_RELATIONSHIP__AMOUNT_TYPE = DataTypesPackage.BACKBONE_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTANCE_DEFINITION_RELATIONSHIP__SOURCE = DataTypesPackage.BACKBONE_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Substance Definition Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTANCE_DEFINITION_RELATIONSHIP_FEATURE_COUNT = DataTypesPackage.BACKBONE_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Substance Definition Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTANCE_DEFINITION_RELATIONSHIP_OPERATION_COUNT = DataTypesPackage.BACKBONE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fhiRCore.profiles.impl.ProvenancerelevanthistoryImpl <em>Provenancerelevanthistory</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.profiles.impl.ProvenancerelevanthistoryImpl
	 * @see fhiRCore.profiles.impl.ProfilesPackageImpl#getProvenancerelevanthistory()
	 * @generated
	 */
	int PROVENANCERELEVANTHISTORY = 80;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVENANCERELEVANTHISTORY__ID = ResourcesPackage.PROVENANCE__ID;

	/**
	 * The feature id for the '<em><b>Meta</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVENANCERELEVANTHISTORY__META = ResourcesPackage.PROVENANCE__META;

	/**
	 * The feature id for the '<em><b>Implicit Rules</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVENANCERELEVANTHISTORY__IMPLICIT_RULES = ResourcesPackage.PROVENANCE__IMPLICIT_RULES;

	/**
	 * The feature id for the '<em><b>Language</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVENANCERELEVANTHISTORY__LANGUAGE = ResourcesPackage.PROVENANCE__LANGUAGE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVENANCERELEVANTHISTORY__TEXT = ResourcesPackage.PROVENANCE__TEXT;

	/**
	 * The feature id for the '<em><b>Contained</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVENANCERELEVANTHISTORY__CONTAINED = ResourcesPackage.PROVENANCE__CONTAINED;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVENANCERELEVANTHISTORY__EXTENSION = ResourcesPackage.PROVENANCE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Modifier Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVENANCERELEVANTHISTORY__MODIFIER_EXTENSION = ResourcesPackage.PROVENANCE__MODIFIER_EXTENSION;

	/**
	 * The feature id for the '<em><b>Target</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVENANCERELEVANTHISTORY__TARGET = ResourcesPackage.PROVENANCE__TARGET;

	/**
	 * The feature id for the '<em><b>Occurredx</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVENANCERELEVANTHISTORY__OCCURREDX = ResourcesPackage.PROVENANCE__OCCURREDX;

	/**
	 * The feature id for the '<em><b>Recorded</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVENANCERELEVANTHISTORY__RECORDED = ResourcesPackage.PROVENANCE__RECORDED;

	/**
	 * The feature id for the '<em><b>Policy</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVENANCERELEVANTHISTORY__POLICY = ResourcesPackage.PROVENANCE__POLICY;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVENANCERELEVANTHISTORY__LOCATION = ResourcesPackage.PROVENANCE__LOCATION;

	/**
	 * The feature id for the '<em><b>Reason</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVENANCERELEVANTHISTORY__REASON = ResourcesPackage.PROVENANCE__REASON;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVENANCERELEVANTHISTORY__ACTIVITY = ResourcesPackage.PROVENANCE__ACTIVITY;

	/**
	 * The feature id for the '<em><b>Agent</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVENANCERELEVANTHISTORY__AGENT = ResourcesPackage.PROVENANCE__AGENT;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVENANCERELEVANTHISTORY__ENTITY = ResourcesPackage.PROVENANCE__ENTITY;

	/**
	 * The feature id for the '<em><b>Signature</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVENANCERELEVANTHISTORY__SIGNATURE = ResourcesPackage.PROVENANCE__SIGNATURE;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVENANCERELEVANTHISTORY__AUTHOR = ResourcesPackage.PROVENANCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Provenancerelevanthistory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVENANCERELEVANTHISTORY_FEATURE_COUNT = ResourcesPackage.PROVENANCE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Provenancerelevanthistory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVENANCERELEVANTHISTORY_OPERATION_COUNT = ResourcesPackage.PROVENANCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fhiRCore.profiles.impl.ProvenancerelevanthistoryAgent1Impl <em>Provenancerelevanthistory Agent1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.profiles.impl.ProvenancerelevanthistoryAgent1Impl
	 * @see fhiRCore.profiles.impl.ProfilesPackageImpl#getProvenancerelevanthistoryAgent1()
	 * @generated
	 */
	int PROVENANCERELEVANTHISTORY_AGENT1 = 81;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVENANCERELEVANTHISTORY_AGENT1__ID = ResourcesPackage.PROVENANCE_AGENT__ID;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVENANCERELEVANTHISTORY_AGENT1__EXTENSION = ResourcesPackage.PROVENANCE_AGENT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Modifier Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVENANCERELEVANTHISTORY_AGENT1__MODIFIER_EXTENSION = ResourcesPackage.PROVENANCE_AGENT__MODIFIER_EXTENSION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVENANCERELEVANTHISTORY_AGENT1__TYPE = ResourcesPackage.PROVENANCE_AGENT__TYPE;

	/**
	 * The feature id for the '<em><b>Role</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVENANCERELEVANTHISTORY_AGENT1__ROLE = ResourcesPackage.PROVENANCE_AGENT__ROLE;

	/**
	 * The feature id for the '<em><b>Who</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVENANCERELEVANTHISTORY_AGENT1__WHO = ResourcesPackage.PROVENANCE_AGENT__WHO;

	/**
	 * The feature id for the '<em><b>On Behalf Of</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVENANCERELEVANTHISTORY_AGENT1__ON_BEHALF_OF = ResourcesPackage.PROVENANCE_AGENT__ON_BEHALF_OF;

	/**
	 * The number of structural features of the '<em>Provenancerelevanthistory Agent1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVENANCERELEVANTHISTORY_AGENT1_FEATURE_COUNT = ResourcesPackage.PROVENANCE_AGENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Provenancerelevanthistory Agent1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVENANCERELEVANTHISTORY_AGENT1_OPERATION_COUNT = ResourcesPackage.PROVENANCE_AGENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fhiRCore.profiles.impl.CatalogImpl <em>Catalog</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.profiles.impl.CatalogImpl
	 * @see fhiRCore.profiles.impl.ProfilesPackageImpl#getCatalog()
	 * @generated
	 */
	int CATALOG = 82;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG__ID = ResourcesPackage.COMPOSITION__ID;

	/**
	 * The feature id for the '<em><b>Meta</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG__META = ResourcesPackage.COMPOSITION__META;

	/**
	 * The feature id for the '<em><b>Implicit Rules</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG__IMPLICIT_RULES = ResourcesPackage.COMPOSITION__IMPLICIT_RULES;

	/**
	 * The feature id for the '<em><b>Language</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG__LANGUAGE = ResourcesPackage.COMPOSITION__LANGUAGE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG__TEXT = ResourcesPackage.COMPOSITION__TEXT;

	/**
	 * The feature id for the '<em><b>Contained</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG__CONTAINED = ResourcesPackage.COMPOSITION__CONTAINED;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG__EXTENSION = ResourcesPackage.COMPOSITION__EXTENSION;

	/**
	 * The feature id for the '<em><b>Modifier Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG__MODIFIER_EXTENSION = ResourcesPackage.COMPOSITION__MODIFIER_EXTENSION;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG__IDENTIFIER = ResourcesPackage.COMPOSITION__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG__STATUS = ResourcesPackage.COMPOSITION__STATUS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG__TYPE = ResourcesPackage.COMPOSITION__TYPE;

	/**
	 * The feature id for the '<em><b>Category</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG__CATEGORY = ResourcesPackage.COMPOSITION__CATEGORY;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG__SUBJECT = ResourcesPackage.COMPOSITION__SUBJECT;

	/**
	 * The feature id for the '<em><b>Encounter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG__ENCOUNTER = ResourcesPackage.COMPOSITION__ENCOUNTER;

	/**
	 * The feature id for the '<em><b>Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG__DATE = ResourcesPackage.COMPOSITION__DATE;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG__AUTHOR = ResourcesPackage.COMPOSITION__AUTHOR;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG__TITLE = ResourcesPackage.COMPOSITION__TITLE;

	/**
	 * The feature id for the '<em><b>Confidentiality</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG__CONFIDENTIALITY = ResourcesPackage.COMPOSITION__CONFIDENTIALITY;

	/**
	 * The feature id for the '<em><b>Attester</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG__ATTESTER = ResourcesPackage.COMPOSITION__ATTESTER;

	/**
	 * The feature id for the '<em><b>Custodian</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG__CUSTODIAN = ResourcesPackage.COMPOSITION__CUSTODIAN;

	/**
	 * The feature id for the '<em><b>Relates To</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG__RELATES_TO = ResourcesPackage.COMPOSITION__RELATES_TO;

	/**
	 * The feature id for the '<em><b>Event</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG__EVENT = ResourcesPackage.COMPOSITION__EVENT;

	/**
	 * The feature id for the '<em><b>Section</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG__SECTION = ResourcesPackage.COMPOSITION__SECTION;

	/**
	 * The number of structural features of the '<em>Catalog</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG_FEATURE_COUNT = ResourcesPackage.COMPOSITION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Catalog</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG_OPERATION_COUNT = ResourcesPackage.COMPOSITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fhiRCore.profiles.impl.CatalogSection1Impl <em>Catalog Section1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.profiles.impl.CatalogSection1Impl
	 * @see fhiRCore.profiles.impl.ProfilesPackageImpl#getCatalogSection1()
	 * @generated
	 */
	int CATALOG_SECTION1 = 83;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG_SECTION1__ID = ResourcesPackage.COMPOSITION_SECTION__ID;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG_SECTION1__EXTENSION = ResourcesPackage.COMPOSITION_SECTION__EXTENSION;

	/**
	 * The feature id for the '<em><b>Modifier Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG_SECTION1__MODIFIER_EXTENSION = ResourcesPackage.COMPOSITION_SECTION__MODIFIER_EXTENSION;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG_SECTION1__TITLE = ResourcesPackage.COMPOSITION_SECTION__TITLE;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG_SECTION1__CODE = ResourcesPackage.COMPOSITION_SECTION__CODE;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG_SECTION1__AUTHOR = ResourcesPackage.COMPOSITION_SECTION__AUTHOR;

	/**
	 * The feature id for the '<em><b>Focus</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG_SECTION1__FOCUS = ResourcesPackage.COMPOSITION_SECTION__FOCUS;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG_SECTION1__TEXT = ResourcesPackage.COMPOSITION_SECTION__TEXT;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG_SECTION1__MODE = ResourcesPackage.COMPOSITION_SECTION__MODE;

	/**
	 * The feature id for the '<em><b>Ordered By</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG_SECTION1__ORDERED_BY = ResourcesPackage.COMPOSITION_SECTION__ORDERED_BY;

	/**
	 * The feature id for the '<em><b>Entry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG_SECTION1__ENTRY = ResourcesPackage.COMPOSITION_SECTION__ENTRY;

	/**
	 * The feature id for the '<em><b>Empty Reason</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG_SECTION1__EMPTY_REASON = ResourcesPackage.COMPOSITION_SECTION__EMPTY_REASON;

	/**
	 * The feature id for the '<em><b>Section</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG_SECTION1__SECTION = ResourcesPackage.COMPOSITION_SECTION__SECTION;

	/**
	 * The number of structural features of the '<em>Catalog Section1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG_SECTION1_FEATURE_COUNT = ResourcesPackage.COMPOSITION_SECTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Catalog Section1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG_SECTION1_OPERATION_COUNT = ResourcesPackage.COMPOSITION_SECTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fhiRCore.profiles.impl.BodyweightImpl <em>Bodyweight</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.profiles.impl.BodyweightImpl
	 * @see fhiRCore.profiles.impl.ProfilesPackageImpl#getBodyweight()
	 * @generated
	 */
	int BODYWEIGHT = 84;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODYWEIGHT__ID = VITALSIGNS__ID;

	/**
	 * The feature id for the '<em><b>Meta</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODYWEIGHT__META = VITALSIGNS__META;

	/**
	 * The feature id for the '<em><b>Implicit Rules</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODYWEIGHT__IMPLICIT_RULES = VITALSIGNS__IMPLICIT_RULES;

	/**
	 * The feature id for the '<em><b>Language</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODYWEIGHT__LANGUAGE = VITALSIGNS__LANGUAGE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODYWEIGHT__TEXT = VITALSIGNS__TEXT;

	/**
	 * The feature id for the '<em><b>Contained</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODYWEIGHT__CONTAINED = VITALSIGNS__CONTAINED;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODYWEIGHT__EXTENSION = VITALSIGNS__EXTENSION;

	/**
	 * The feature id for the '<em><b>Modifier Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODYWEIGHT__MODIFIER_EXTENSION = VITALSIGNS__MODIFIER_EXTENSION;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODYWEIGHT__IDENTIFIER = VITALSIGNS__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Based On</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODYWEIGHT__BASED_ON = VITALSIGNS__BASED_ON;

	/**
	 * The feature id for the '<em><b>Part Of</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODYWEIGHT__PART_OF = VITALSIGNS__PART_OF;

	/**
	 * The feature id for the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODYWEIGHT__STATUS = VITALSIGNS__STATUS;

	/**
	 * The feature id for the '<em><b>Category</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODYWEIGHT__CATEGORY = VITALSIGNS__CATEGORY;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODYWEIGHT__CODE = VITALSIGNS__CODE;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODYWEIGHT__SUBJECT = VITALSIGNS__SUBJECT;

	/**
	 * The feature id for the '<em><b>Focus</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODYWEIGHT__FOCUS = VITALSIGNS__FOCUS;

	/**
	 * The feature id for the '<em><b>Encounter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODYWEIGHT__ENCOUNTER = VITALSIGNS__ENCOUNTER;

	/**
	 * The feature id for the '<em><b>Effectivex</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODYWEIGHT__EFFECTIVEX = VITALSIGNS__EFFECTIVEX;

	/**
	 * The feature id for the '<em><b>Issued</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODYWEIGHT__ISSUED = VITALSIGNS__ISSUED;

	/**
	 * The feature id for the '<em><b>Performer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODYWEIGHT__PERFORMER = VITALSIGNS__PERFORMER;

	/**
	 * The feature id for the '<em><b>Valuex</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODYWEIGHT__VALUEX = VITALSIGNS__VALUEX;

	/**
	 * The feature id for the '<em><b>Data Absent Reason</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODYWEIGHT__DATA_ABSENT_REASON = VITALSIGNS__DATA_ABSENT_REASON;

	/**
	 * The feature id for the '<em><b>Interpretation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODYWEIGHT__INTERPRETATION = VITALSIGNS__INTERPRETATION;

	/**
	 * The feature id for the '<em><b>Note</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODYWEIGHT__NOTE = VITALSIGNS__NOTE;

	/**
	 * The feature id for the '<em><b>Body Site</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODYWEIGHT__BODY_SITE = VITALSIGNS__BODY_SITE;

	/**
	 * The feature id for the '<em><b>Method</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODYWEIGHT__METHOD = VITALSIGNS__METHOD;

	/**
	 * The feature id for the '<em><b>Specimen</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODYWEIGHT__SPECIMEN = VITALSIGNS__SPECIMEN;

	/**
	 * The feature id for the '<em><b>Device</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODYWEIGHT__DEVICE = VITALSIGNS__DEVICE;

	/**
	 * The feature id for the '<em><b>Has Member</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODYWEIGHT__HAS_MEMBER = VITALSIGNS__HAS_MEMBER;

	/**
	 * The feature id for the '<em><b>Derived From</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODYWEIGHT__DERIVED_FROM = VITALSIGNS__DERIVED_FROM;

	/**
	 * The feature id for the '<em><b>Component</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODYWEIGHT__COMPONENT = VITALSIGNS__COMPONENT;

	/**
	 * The feature id for the '<em><b>Reference Range</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODYWEIGHT__REFERENCE_RANGE = VITALSIGNS__REFERENCE_RANGE;

	/**
	 * The feature id for the '<em><b>Vs Cat</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODYWEIGHT__VS_CAT = VITALSIGNS__VS_CAT;

	/**
	 * The feature id for the '<em><b>Value Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODYWEIGHT__VALUE_QUANTITY = VITALSIGNS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Bodyweight</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODYWEIGHT_FEATURE_COUNT = VITALSIGNS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Bodyweight</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODYWEIGHT_OPERATION_COUNT = VITALSIGNS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fhiRCore.profiles.impl.BodyweightCodeableConcept1Impl <em>Bodyweight Codeable Concept1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.profiles.impl.BodyweightCodeableConcept1Impl
	 * @see fhiRCore.profiles.impl.ProfilesPackageImpl#getBodyweightCodeableConcept1()
	 * @generated
	 */
	int BODYWEIGHT_CODEABLE_CONCEPT1 = 85;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODYWEIGHT_CODEABLE_CONCEPT1__ID = DataTypesPackage.CODEABLE_CONCEPT__ID;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODYWEIGHT_CODEABLE_CONCEPT1__EXTENSION = DataTypesPackage.CODEABLE_CONCEPT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Coding</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODYWEIGHT_CODEABLE_CONCEPT1__CODING = DataTypesPackage.CODEABLE_CONCEPT__CODING;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODYWEIGHT_CODEABLE_CONCEPT1__TEXT = DataTypesPackage.CODEABLE_CONCEPT__TEXT;

	/**
	 * The feature id for the '<em><b>Body Weight Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODYWEIGHT_CODEABLE_CONCEPT1__BODY_WEIGHT_CODE = DataTypesPackage.CODEABLE_CONCEPT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Bodyweight Codeable Concept1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODYWEIGHT_CODEABLE_CONCEPT1_FEATURE_COUNT = DataTypesPackage.CODEABLE_CONCEPT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Bodyweight Codeable Concept1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODYWEIGHT_CODEABLE_CONCEPT1_OPERATION_COUNT = DataTypesPackage.CODEABLE_CONCEPT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fhiRCore.profiles.impl.BodyweightCodeableConcept1Coding1Impl <em>Bodyweight Codeable Concept1 Coding1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.profiles.impl.BodyweightCodeableConcept1Coding1Impl
	 * @see fhiRCore.profiles.impl.ProfilesPackageImpl#getBodyweightCodeableConcept1Coding1()
	 * @generated
	 */
	int BODYWEIGHT_CODEABLE_CONCEPT1_CODING1 = 86;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODYWEIGHT_CODEABLE_CONCEPT1_CODING1__ID = DataTypesPackage.CODING__ID;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODYWEIGHT_CODEABLE_CONCEPT1_CODING1__EXTENSION = DataTypesPackage.CODING__EXTENSION;

	/**
	 * The feature id for the '<em><b>System</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODYWEIGHT_CODEABLE_CONCEPT1_CODING1__SYSTEM = DataTypesPackage.CODING__SYSTEM;

	/**
	 * The feature id for the '<em><b>Version</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODYWEIGHT_CODEABLE_CONCEPT1_CODING1__VERSION = DataTypesPackage.CODING__VERSION;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODYWEIGHT_CODEABLE_CONCEPT1_CODING1__CODE = DataTypesPackage.CODING__CODE;

	/**
	 * The feature id for the '<em><b>Display</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODYWEIGHT_CODEABLE_CONCEPT1_CODING1__DISPLAY = DataTypesPackage.CODING__DISPLAY;

	/**
	 * The feature id for the '<em><b>User Selected</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODYWEIGHT_CODEABLE_CONCEPT1_CODING1__USER_SELECTED = DataTypesPackage.CODING__USER_SELECTED;

	/**
	 * The number of structural features of the '<em>Bodyweight Codeable Concept1 Coding1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODYWEIGHT_CODEABLE_CONCEPT1_CODING1_FEATURE_COUNT = DataTypesPackage.CODING_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Bodyweight Codeable Concept1 Coding1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODYWEIGHT_CODEABLE_CONCEPT1_CODING1_OPERATION_COUNT = DataTypesPackage.CODING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fhiRCore.profiles.impl.BodyweightQuantity1Impl <em>Bodyweight Quantity1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.profiles.impl.BodyweightQuantity1Impl
	 * @see fhiRCore.profiles.impl.ProfilesPackageImpl#getBodyweightQuantity1()
	 * @generated
	 */
	int BODYWEIGHT_QUANTITY1 = 87;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODYWEIGHT_QUANTITY1__ID = DataTypesPackage.QUANTITY__ID;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODYWEIGHT_QUANTITY1__EXTENSION = DataTypesPackage.QUANTITY__EXTENSION;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODYWEIGHT_QUANTITY1__VALUE = DataTypesPackage.QUANTITY__VALUE;

	/**
	 * The feature id for the '<em><b>Comparator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODYWEIGHT_QUANTITY1__COMPARATOR = DataTypesPackage.QUANTITY__COMPARATOR;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODYWEIGHT_QUANTITY1__UNIT = DataTypesPackage.QUANTITY__UNIT;

	/**
	 * The feature id for the '<em><b>System</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODYWEIGHT_QUANTITY1__SYSTEM = DataTypesPackage.QUANTITY__SYSTEM;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODYWEIGHT_QUANTITY1__CODE = DataTypesPackage.QUANTITY__CODE;

	/**
	 * The number of structural features of the '<em>Bodyweight Quantity1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODYWEIGHT_QUANTITY1_FEATURE_COUNT = DataTypesPackage.QUANTITY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Bodyweight Quantity1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODYWEIGHT_QUANTITY1_OPERATION_COUNT = DataTypesPackage.QUANTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fhiRCore.profiles.impl.BpImpl <em>Bp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.profiles.impl.BpImpl
	 * @see fhiRCore.profiles.impl.ProfilesPackageImpl#getBp()
	 * @generated
	 */
	int BP = 88;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP__ID = VITALSIGNS__ID;

	/**
	 * The feature id for the '<em><b>Meta</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP__META = VITALSIGNS__META;

	/**
	 * The feature id for the '<em><b>Implicit Rules</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP__IMPLICIT_RULES = VITALSIGNS__IMPLICIT_RULES;

	/**
	 * The feature id for the '<em><b>Language</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP__LANGUAGE = VITALSIGNS__LANGUAGE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP__TEXT = VITALSIGNS__TEXT;

	/**
	 * The feature id for the '<em><b>Contained</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP__CONTAINED = VITALSIGNS__CONTAINED;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP__EXTENSION = VITALSIGNS__EXTENSION;

	/**
	 * The feature id for the '<em><b>Modifier Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP__MODIFIER_EXTENSION = VITALSIGNS__MODIFIER_EXTENSION;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP__IDENTIFIER = VITALSIGNS__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Based On</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP__BASED_ON = VITALSIGNS__BASED_ON;

	/**
	 * The feature id for the '<em><b>Part Of</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP__PART_OF = VITALSIGNS__PART_OF;

	/**
	 * The feature id for the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP__STATUS = VITALSIGNS__STATUS;

	/**
	 * The feature id for the '<em><b>Category</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP__CATEGORY = VITALSIGNS__CATEGORY;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP__CODE = VITALSIGNS__CODE;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP__SUBJECT = VITALSIGNS__SUBJECT;

	/**
	 * The feature id for the '<em><b>Focus</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP__FOCUS = VITALSIGNS__FOCUS;

	/**
	 * The feature id for the '<em><b>Encounter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP__ENCOUNTER = VITALSIGNS__ENCOUNTER;

	/**
	 * The feature id for the '<em><b>Effectivex</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP__EFFECTIVEX = VITALSIGNS__EFFECTIVEX;

	/**
	 * The feature id for the '<em><b>Issued</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP__ISSUED = VITALSIGNS__ISSUED;

	/**
	 * The feature id for the '<em><b>Performer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP__PERFORMER = VITALSIGNS__PERFORMER;

	/**
	 * The feature id for the '<em><b>Valuex</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP__VALUEX = VITALSIGNS__VALUEX;

	/**
	 * The feature id for the '<em><b>Data Absent Reason</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP__DATA_ABSENT_REASON = VITALSIGNS__DATA_ABSENT_REASON;

	/**
	 * The feature id for the '<em><b>Interpretation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP__INTERPRETATION = VITALSIGNS__INTERPRETATION;

	/**
	 * The feature id for the '<em><b>Note</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP__NOTE = VITALSIGNS__NOTE;

	/**
	 * The feature id for the '<em><b>Body Site</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP__BODY_SITE = VITALSIGNS__BODY_SITE;

	/**
	 * The feature id for the '<em><b>Method</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP__METHOD = VITALSIGNS__METHOD;

	/**
	 * The feature id for the '<em><b>Specimen</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP__SPECIMEN = VITALSIGNS__SPECIMEN;

	/**
	 * The feature id for the '<em><b>Device</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP__DEVICE = VITALSIGNS__DEVICE;

	/**
	 * The feature id for the '<em><b>Has Member</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP__HAS_MEMBER = VITALSIGNS__HAS_MEMBER;

	/**
	 * The feature id for the '<em><b>Derived From</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP__DERIVED_FROM = VITALSIGNS__DERIVED_FROM;

	/**
	 * The feature id for the '<em><b>Component</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP__COMPONENT = VITALSIGNS__COMPONENT;

	/**
	 * The feature id for the '<em><b>Reference Range</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP__REFERENCE_RANGE = VITALSIGNS__REFERENCE_RANGE;

	/**
	 * The feature id for the '<em><b>Vs Cat</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP__VS_CAT = VITALSIGNS__VS_CAT;

	/**
	 * The feature id for the '<em><b>Systolic Bp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP__SYSTOLIC_BP = VITALSIGNS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Diastolic Bp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP__DIASTOLIC_BP = VITALSIGNS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Bp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP_FEATURE_COUNT = VITALSIGNS_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Bp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP_OPERATION_COUNT = VITALSIGNS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fhiRCore.profiles.impl.BpCodeableConcept1Impl <em>Bp Codeable Concept1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.profiles.impl.BpCodeableConcept1Impl
	 * @see fhiRCore.profiles.impl.ProfilesPackageImpl#getBpCodeableConcept1()
	 * @generated
	 */
	int BP_CODEABLE_CONCEPT1 = 89;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP_CODEABLE_CONCEPT1__ID = DataTypesPackage.CODEABLE_CONCEPT__ID;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP_CODEABLE_CONCEPT1__EXTENSION = DataTypesPackage.CODEABLE_CONCEPT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Coding</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP_CODEABLE_CONCEPT1__CODING = DataTypesPackage.CODEABLE_CONCEPT__CODING;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP_CODEABLE_CONCEPT1__TEXT = DataTypesPackage.CODEABLE_CONCEPT__TEXT;

	/**
	 * The feature id for the '<em><b>Bp Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP_CODEABLE_CONCEPT1__BP_CODE = DataTypesPackage.CODEABLE_CONCEPT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Bp Codeable Concept1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP_CODEABLE_CONCEPT1_FEATURE_COUNT = DataTypesPackage.CODEABLE_CONCEPT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Bp Codeable Concept1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP_CODEABLE_CONCEPT1_OPERATION_COUNT = DataTypesPackage.CODEABLE_CONCEPT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fhiRCore.profiles.impl.BpCodeableConcept1Coding1Impl <em>Bp Codeable Concept1 Coding1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.profiles.impl.BpCodeableConcept1Coding1Impl
	 * @see fhiRCore.profiles.impl.ProfilesPackageImpl#getBpCodeableConcept1Coding1()
	 * @generated
	 */
	int BP_CODEABLE_CONCEPT1_CODING1 = 90;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP_CODEABLE_CONCEPT1_CODING1__ID = DataTypesPackage.CODING__ID;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP_CODEABLE_CONCEPT1_CODING1__EXTENSION = DataTypesPackage.CODING__EXTENSION;

	/**
	 * The feature id for the '<em><b>System</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP_CODEABLE_CONCEPT1_CODING1__SYSTEM = DataTypesPackage.CODING__SYSTEM;

	/**
	 * The feature id for the '<em><b>Version</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP_CODEABLE_CONCEPT1_CODING1__VERSION = DataTypesPackage.CODING__VERSION;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP_CODEABLE_CONCEPT1_CODING1__CODE = DataTypesPackage.CODING__CODE;

	/**
	 * The feature id for the '<em><b>Display</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP_CODEABLE_CONCEPT1_CODING1__DISPLAY = DataTypesPackage.CODING__DISPLAY;

	/**
	 * The feature id for the '<em><b>User Selected</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP_CODEABLE_CONCEPT1_CODING1__USER_SELECTED = DataTypesPackage.CODING__USER_SELECTED;

	/**
	 * The number of structural features of the '<em>Bp Codeable Concept1 Coding1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP_CODEABLE_CONCEPT1_CODING1_FEATURE_COUNT = DataTypesPackage.CODING_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Bp Codeable Concept1 Coding1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP_CODEABLE_CONCEPT1_CODING1_OPERATION_COUNT = DataTypesPackage.CODING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fhiRCore.profiles.impl.BpComponent11Impl <em>Bp Component11</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.profiles.impl.BpComponent11Impl
	 * @see fhiRCore.profiles.impl.ProfilesPackageImpl#getBpComponent11()
	 * @generated
	 */
	int BP_COMPONENT11 = 91;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP_COMPONENT11__ID = VITALSIGNS_COMPONENT1__ID;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP_COMPONENT11__EXTENSION = VITALSIGNS_COMPONENT1__EXTENSION;

	/**
	 * The feature id for the '<em><b>Modifier Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP_COMPONENT11__MODIFIER_EXTENSION = VITALSIGNS_COMPONENT1__MODIFIER_EXTENSION;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP_COMPONENT11__CODE = VITALSIGNS_COMPONENT1__CODE;

	/**
	 * The feature id for the '<em><b>Valuex</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP_COMPONENT11__VALUEX = VITALSIGNS_COMPONENT1__VALUEX;

	/**
	 * The feature id for the '<em><b>Data Absent Reason</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP_COMPONENT11__DATA_ABSENT_REASON = VITALSIGNS_COMPONENT1__DATA_ABSENT_REASON;

	/**
	 * The feature id for the '<em><b>Interpretation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP_COMPONENT11__INTERPRETATION = VITALSIGNS_COMPONENT1__INTERPRETATION;

	/**
	 * The feature id for the '<em><b>Reference Range</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP_COMPONENT11__REFERENCE_RANGE = VITALSIGNS_COMPONENT1__REFERENCE_RANGE;

	/**
	 * The feature id for the '<em><b>Value Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP_COMPONENT11__VALUE_QUANTITY = VITALSIGNS_COMPONENT1_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Bp Component11</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP_COMPONENT11_FEATURE_COUNT = VITALSIGNS_COMPONENT1_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Bp Component11</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP_COMPONENT11_OPERATION_COUNT = VITALSIGNS_COMPONENT1_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fhiRCore.profiles.impl.BpComponent11CodeableConcept1Impl <em>Bp Component11 Codeable Concept1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.profiles.impl.BpComponent11CodeableConcept1Impl
	 * @see fhiRCore.profiles.impl.ProfilesPackageImpl#getBpComponent11CodeableConcept1()
	 * @generated
	 */
	int BP_COMPONENT11_CODEABLE_CONCEPT1 = 92;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP_COMPONENT11_CODEABLE_CONCEPT1__ID = DataTypesPackage.CODEABLE_CONCEPT__ID;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP_COMPONENT11_CODEABLE_CONCEPT1__EXTENSION = DataTypesPackage.CODEABLE_CONCEPT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Coding</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP_COMPONENT11_CODEABLE_CONCEPT1__CODING = DataTypesPackage.CODEABLE_CONCEPT__CODING;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP_COMPONENT11_CODEABLE_CONCEPT1__TEXT = DataTypesPackage.CODEABLE_CONCEPT__TEXT;

	/**
	 * The feature id for the '<em><b>Sbp Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP_COMPONENT11_CODEABLE_CONCEPT1__SBP_CODE = DataTypesPackage.CODEABLE_CONCEPT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Bp Component11 Codeable Concept1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP_COMPONENT11_CODEABLE_CONCEPT1_FEATURE_COUNT = DataTypesPackage.CODEABLE_CONCEPT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Bp Component11 Codeable Concept1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP_COMPONENT11_CODEABLE_CONCEPT1_OPERATION_COUNT = DataTypesPackage.CODEABLE_CONCEPT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fhiRCore.profiles.impl.BpComponent11CodeableConcept1Coding1Impl <em>Bp Component11 Codeable Concept1 Coding1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.profiles.impl.BpComponent11CodeableConcept1Coding1Impl
	 * @see fhiRCore.profiles.impl.ProfilesPackageImpl#getBpComponent11CodeableConcept1Coding1()
	 * @generated
	 */
	int BP_COMPONENT11_CODEABLE_CONCEPT1_CODING1 = 93;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP_COMPONENT11_CODEABLE_CONCEPT1_CODING1__ID = DataTypesPackage.CODING__ID;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP_COMPONENT11_CODEABLE_CONCEPT1_CODING1__EXTENSION = DataTypesPackage.CODING__EXTENSION;

	/**
	 * The feature id for the '<em><b>System</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP_COMPONENT11_CODEABLE_CONCEPT1_CODING1__SYSTEM = DataTypesPackage.CODING__SYSTEM;

	/**
	 * The feature id for the '<em><b>Version</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP_COMPONENT11_CODEABLE_CONCEPT1_CODING1__VERSION = DataTypesPackage.CODING__VERSION;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP_COMPONENT11_CODEABLE_CONCEPT1_CODING1__CODE = DataTypesPackage.CODING__CODE;

	/**
	 * The feature id for the '<em><b>Display</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP_COMPONENT11_CODEABLE_CONCEPT1_CODING1__DISPLAY = DataTypesPackage.CODING__DISPLAY;

	/**
	 * The feature id for the '<em><b>User Selected</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP_COMPONENT11_CODEABLE_CONCEPT1_CODING1__USER_SELECTED = DataTypesPackage.CODING__USER_SELECTED;

	/**
	 * The number of structural features of the '<em>Bp Component11 Codeable Concept1 Coding1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP_COMPONENT11_CODEABLE_CONCEPT1_CODING1_FEATURE_COUNT = DataTypesPackage.CODING_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Bp Component11 Codeable Concept1 Coding1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP_COMPONENT11_CODEABLE_CONCEPT1_CODING1_OPERATION_COUNT = DataTypesPackage.CODING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fhiRCore.profiles.impl.BpComponent11Quantity1Impl <em>Bp Component11 Quantity1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.profiles.impl.BpComponent11Quantity1Impl
	 * @see fhiRCore.profiles.impl.ProfilesPackageImpl#getBpComponent11Quantity1()
	 * @generated
	 */
	int BP_COMPONENT11_QUANTITY1 = 94;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP_COMPONENT11_QUANTITY1__ID = DataTypesPackage.QUANTITY__ID;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP_COMPONENT11_QUANTITY1__EXTENSION = DataTypesPackage.QUANTITY__EXTENSION;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP_COMPONENT11_QUANTITY1__VALUE = DataTypesPackage.QUANTITY__VALUE;

	/**
	 * The feature id for the '<em><b>Comparator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP_COMPONENT11_QUANTITY1__COMPARATOR = DataTypesPackage.QUANTITY__COMPARATOR;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP_COMPONENT11_QUANTITY1__UNIT = DataTypesPackage.QUANTITY__UNIT;

	/**
	 * The feature id for the '<em><b>System</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP_COMPONENT11_QUANTITY1__SYSTEM = DataTypesPackage.QUANTITY__SYSTEM;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP_COMPONENT11_QUANTITY1__CODE = DataTypesPackage.QUANTITY__CODE;

	/**
	 * The number of structural features of the '<em>Bp Component11 Quantity1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP_COMPONENT11_QUANTITY1_FEATURE_COUNT = DataTypesPackage.QUANTITY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Bp Component11 Quantity1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP_COMPONENT11_QUANTITY1_OPERATION_COUNT = DataTypesPackage.QUANTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fhiRCore.profiles.impl.BpComponent12Impl <em>Bp Component12</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.profiles.impl.BpComponent12Impl
	 * @see fhiRCore.profiles.impl.ProfilesPackageImpl#getBpComponent12()
	 * @generated
	 */
	int BP_COMPONENT12 = 95;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP_COMPONENT12__ID = VITALSIGNS_COMPONENT1__ID;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP_COMPONENT12__EXTENSION = VITALSIGNS_COMPONENT1__EXTENSION;

	/**
	 * The feature id for the '<em><b>Modifier Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP_COMPONENT12__MODIFIER_EXTENSION = VITALSIGNS_COMPONENT1__MODIFIER_EXTENSION;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP_COMPONENT12__CODE = VITALSIGNS_COMPONENT1__CODE;

	/**
	 * The feature id for the '<em><b>Valuex</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP_COMPONENT12__VALUEX = VITALSIGNS_COMPONENT1__VALUEX;

	/**
	 * The feature id for the '<em><b>Data Absent Reason</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP_COMPONENT12__DATA_ABSENT_REASON = VITALSIGNS_COMPONENT1__DATA_ABSENT_REASON;

	/**
	 * The feature id for the '<em><b>Interpretation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP_COMPONENT12__INTERPRETATION = VITALSIGNS_COMPONENT1__INTERPRETATION;

	/**
	 * The feature id for the '<em><b>Reference Range</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP_COMPONENT12__REFERENCE_RANGE = VITALSIGNS_COMPONENT1__REFERENCE_RANGE;

	/**
	 * The feature id for the '<em><b>Value Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP_COMPONENT12__VALUE_QUANTITY = VITALSIGNS_COMPONENT1_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Bp Component12</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP_COMPONENT12_FEATURE_COUNT = VITALSIGNS_COMPONENT1_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Bp Component12</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP_COMPONENT12_OPERATION_COUNT = VITALSIGNS_COMPONENT1_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fhiRCore.profiles.impl.BpComponent12CodeableConcept1Impl <em>Bp Component12 Codeable Concept1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.profiles.impl.BpComponent12CodeableConcept1Impl
	 * @see fhiRCore.profiles.impl.ProfilesPackageImpl#getBpComponent12CodeableConcept1()
	 * @generated
	 */
	int BP_COMPONENT12_CODEABLE_CONCEPT1 = 96;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP_COMPONENT12_CODEABLE_CONCEPT1__ID = DataTypesPackage.CODEABLE_CONCEPT__ID;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP_COMPONENT12_CODEABLE_CONCEPT1__EXTENSION = DataTypesPackage.CODEABLE_CONCEPT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Coding</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP_COMPONENT12_CODEABLE_CONCEPT1__CODING = DataTypesPackage.CODEABLE_CONCEPT__CODING;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP_COMPONENT12_CODEABLE_CONCEPT1__TEXT = DataTypesPackage.CODEABLE_CONCEPT__TEXT;

	/**
	 * The feature id for the '<em><b>Dbp Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP_COMPONENT12_CODEABLE_CONCEPT1__DBP_CODE = DataTypesPackage.CODEABLE_CONCEPT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Bp Component12 Codeable Concept1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP_COMPONENT12_CODEABLE_CONCEPT1_FEATURE_COUNT = DataTypesPackage.CODEABLE_CONCEPT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Bp Component12 Codeable Concept1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP_COMPONENT12_CODEABLE_CONCEPT1_OPERATION_COUNT = DataTypesPackage.CODEABLE_CONCEPT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fhiRCore.profiles.impl.BpComponent12CodeableConcept1Coding1Impl <em>Bp Component12 Codeable Concept1 Coding1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.profiles.impl.BpComponent12CodeableConcept1Coding1Impl
	 * @see fhiRCore.profiles.impl.ProfilesPackageImpl#getBpComponent12CodeableConcept1Coding1()
	 * @generated
	 */
	int BP_COMPONENT12_CODEABLE_CONCEPT1_CODING1 = 97;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP_COMPONENT12_CODEABLE_CONCEPT1_CODING1__ID = DataTypesPackage.CODING__ID;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP_COMPONENT12_CODEABLE_CONCEPT1_CODING1__EXTENSION = DataTypesPackage.CODING__EXTENSION;

	/**
	 * The feature id for the '<em><b>System</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP_COMPONENT12_CODEABLE_CONCEPT1_CODING1__SYSTEM = DataTypesPackage.CODING__SYSTEM;

	/**
	 * The feature id for the '<em><b>Version</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP_COMPONENT12_CODEABLE_CONCEPT1_CODING1__VERSION = DataTypesPackage.CODING__VERSION;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP_COMPONENT12_CODEABLE_CONCEPT1_CODING1__CODE = DataTypesPackage.CODING__CODE;

	/**
	 * The feature id for the '<em><b>Display</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP_COMPONENT12_CODEABLE_CONCEPT1_CODING1__DISPLAY = DataTypesPackage.CODING__DISPLAY;

	/**
	 * The feature id for the '<em><b>User Selected</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP_COMPONENT12_CODEABLE_CONCEPT1_CODING1__USER_SELECTED = DataTypesPackage.CODING__USER_SELECTED;

	/**
	 * The number of structural features of the '<em>Bp Component12 Codeable Concept1 Coding1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP_COMPONENT12_CODEABLE_CONCEPT1_CODING1_FEATURE_COUNT = DataTypesPackage.CODING_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Bp Component12 Codeable Concept1 Coding1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP_COMPONENT12_CODEABLE_CONCEPT1_CODING1_OPERATION_COUNT = DataTypesPackage.CODING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fhiRCore.profiles.impl.BpComponent12Quantity1Impl <em>Bp Component12 Quantity1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.profiles.impl.BpComponent12Quantity1Impl
	 * @see fhiRCore.profiles.impl.ProfilesPackageImpl#getBpComponent12Quantity1()
	 * @generated
	 */
	int BP_COMPONENT12_QUANTITY1 = 98;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP_COMPONENT12_QUANTITY1__ID = DataTypesPackage.QUANTITY__ID;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP_COMPONENT12_QUANTITY1__EXTENSION = DataTypesPackage.QUANTITY__EXTENSION;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP_COMPONENT12_QUANTITY1__VALUE = DataTypesPackage.QUANTITY__VALUE;

	/**
	 * The feature id for the '<em><b>Comparator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP_COMPONENT12_QUANTITY1__COMPARATOR = DataTypesPackage.QUANTITY__COMPARATOR;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP_COMPONENT12_QUANTITY1__UNIT = DataTypesPackage.QUANTITY__UNIT;

	/**
	 * The feature id for the '<em><b>System</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP_COMPONENT12_QUANTITY1__SYSTEM = DataTypesPackage.QUANTITY__SYSTEM;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP_COMPONENT12_QUANTITY1__CODE = DataTypesPackage.QUANTITY__CODE;

	/**
	 * The number of structural features of the '<em>Bp Component12 Quantity1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP_COMPONENT12_QUANTITY1_FEATURE_COUNT = DataTypesPackage.QUANTITY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Bp Component12 Quantity1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP_COMPONENT12_QUANTITY1_OPERATION_COUNT = DataTypesPackage.QUANTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fhiRCore.profiles.impl.ServicerequestgeneticsImpl <em>Servicerequestgenetics</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.profiles.impl.ServicerequestgeneticsImpl
	 * @see fhiRCore.profiles.impl.ProfilesPackageImpl#getServicerequestgenetics()
	 * @generated
	 */
	int SERVICEREQUESTGENETICS = 99;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICEREQUESTGENETICS__ID = ResourcesPackage.SERVICE_REQUEST__ID;

	/**
	 * The feature id for the '<em><b>Meta</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICEREQUESTGENETICS__META = ResourcesPackage.SERVICE_REQUEST__META;

	/**
	 * The feature id for the '<em><b>Implicit Rules</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICEREQUESTGENETICS__IMPLICIT_RULES = ResourcesPackage.SERVICE_REQUEST__IMPLICIT_RULES;

	/**
	 * The feature id for the '<em><b>Language</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICEREQUESTGENETICS__LANGUAGE = ResourcesPackage.SERVICE_REQUEST__LANGUAGE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICEREQUESTGENETICS__TEXT = ResourcesPackage.SERVICE_REQUEST__TEXT;

	/**
	 * The feature id for the '<em><b>Contained</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICEREQUESTGENETICS__CONTAINED = ResourcesPackage.SERVICE_REQUEST__CONTAINED;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICEREQUESTGENETICS__EXTENSION = ResourcesPackage.SERVICE_REQUEST__EXTENSION;

	/**
	 * The feature id for the '<em><b>Modifier Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICEREQUESTGENETICS__MODIFIER_EXTENSION = ResourcesPackage.SERVICE_REQUEST__MODIFIER_EXTENSION;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICEREQUESTGENETICS__IDENTIFIER = ResourcesPackage.SERVICE_REQUEST__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Instantiates Canonical</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICEREQUESTGENETICS__INSTANTIATES_CANONICAL = ResourcesPackage.SERVICE_REQUEST__INSTANTIATES_CANONICAL;

	/**
	 * The feature id for the '<em><b>Instantiates Uri</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICEREQUESTGENETICS__INSTANTIATES_URI = ResourcesPackage.SERVICE_REQUEST__INSTANTIATES_URI;

	/**
	 * The feature id for the '<em><b>Based On</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICEREQUESTGENETICS__BASED_ON = ResourcesPackage.SERVICE_REQUEST__BASED_ON;

	/**
	 * The feature id for the '<em><b>Replaces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICEREQUESTGENETICS__REPLACES = ResourcesPackage.SERVICE_REQUEST__REPLACES;

	/**
	 * The feature id for the '<em><b>Requisition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICEREQUESTGENETICS__REQUISITION = ResourcesPackage.SERVICE_REQUEST__REQUISITION;

	/**
	 * The feature id for the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICEREQUESTGENETICS__STATUS = ResourcesPackage.SERVICE_REQUEST__STATUS;

	/**
	 * The feature id for the '<em><b>Intent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICEREQUESTGENETICS__INTENT = ResourcesPackage.SERVICE_REQUEST__INTENT;

	/**
	 * The feature id for the '<em><b>Category</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICEREQUESTGENETICS__CATEGORY = ResourcesPackage.SERVICE_REQUEST__CATEGORY;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICEREQUESTGENETICS__PRIORITY = ResourcesPackage.SERVICE_REQUEST__PRIORITY;

	/**
	 * The feature id for the '<em><b>Do Not Perform</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICEREQUESTGENETICS__DO_NOT_PERFORM = ResourcesPackage.SERVICE_REQUEST__DO_NOT_PERFORM;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICEREQUESTGENETICS__CODE = ResourcesPackage.SERVICE_REQUEST__CODE;

	/**
	 * The feature id for the '<em><b>Order Detail</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICEREQUESTGENETICS__ORDER_DETAIL = ResourcesPackage.SERVICE_REQUEST__ORDER_DETAIL;

	/**
	 * The feature id for the '<em><b>Quantityx</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICEREQUESTGENETICS__QUANTITYX = ResourcesPackage.SERVICE_REQUEST__QUANTITYX;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICEREQUESTGENETICS__SUBJECT = ResourcesPackage.SERVICE_REQUEST__SUBJECT;

	/**
	 * The feature id for the '<em><b>Encounter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICEREQUESTGENETICS__ENCOUNTER = ResourcesPackage.SERVICE_REQUEST__ENCOUNTER;

	/**
	 * The feature id for the '<em><b>Occurrencex</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICEREQUESTGENETICS__OCCURRENCEX = ResourcesPackage.SERVICE_REQUEST__OCCURRENCEX;

	/**
	 * The feature id for the '<em><b>As Neededx</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICEREQUESTGENETICS__AS_NEEDEDX = ResourcesPackage.SERVICE_REQUEST__AS_NEEDEDX;

	/**
	 * The feature id for the '<em><b>Authored On</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICEREQUESTGENETICS__AUTHORED_ON = ResourcesPackage.SERVICE_REQUEST__AUTHORED_ON;

	/**
	 * The feature id for the '<em><b>Requester</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICEREQUESTGENETICS__REQUESTER = ResourcesPackage.SERVICE_REQUEST__REQUESTER;

	/**
	 * The feature id for the '<em><b>Performer Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICEREQUESTGENETICS__PERFORMER_TYPE = ResourcesPackage.SERVICE_REQUEST__PERFORMER_TYPE;

	/**
	 * The feature id for the '<em><b>Performer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICEREQUESTGENETICS__PERFORMER = ResourcesPackage.SERVICE_REQUEST__PERFORMER;

	/**
	 * The feature id for the '<em><b>Location Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICEREQUESTGENETICS__LOCATION_CODE = ResourcesPackage.SERVICE_REQUEST__LOCATION_CODE;

	/**
	 * The feature id for the '<em><b>Location Reference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICEREQUESTGENETICS__LOCATION_REFERENCE = ResourcesPackage.SERVICE_REQUEST__LOCATION_REFERENCE;

	/**
	 * The feature id for the '<em><b>Reason Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICEREQUESTGENETICS__REASON_CODE = ResourcesPackage.SERVICE_REQUEST__REASON_CODE;

	/**
	 * The feature id for the '<em><b>Reason Reference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICEREQUESTGENETICS__REASON_REFERENCE = ResourcesPackage.SERVICE_REQUEST__REASON_REFERENCE;

	/**
	 * The feature id for the '<em><b>Insurance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICEREQUESTGENETICS__INSURANCE = ResourcesPackage.SERVICE_REQUEST__INSURANCE;

	/**
	 * The feature id for the '<em><b>Supporting Info</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICEREQUESTGENETICS__SUPPORTING_INFO = ResourcesPackage.SERVICE_REQUEST__SUPPORTING_INFO;

	/**
	 * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICEREQUESTGENETICS__SPECIMEN = ResourcesPackage.SERVICE_REQUEST__SPECIMEN;

	/**
	 * The feature id for the '<em><b>Body Site</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICEREQUESTGENETICS__BODY_SITE = ResourcesPackage.SERVICE_REQUEST__BODY_SITE;

	/**
	 * The feature id for the '<em><b>Note</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICEREQUESTGENETICS__NOTE = ResourcesPackage.SERVICE_REQUEST__NOTE;

	/**
	 * The feature id for the '<em><b>Patient Instruction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICEREQUESTGENETICS__PATIENT_INSTRUCTION = ResourcesPackage.SERVICE_REQUEST__PATIENT_INSTRUCTION;

	/**
	 * The feature id for the '<em><b>Relevant History</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICEREQUESTGENETICS__RELEVANT_HISTORY = ResourcesPackage.SERVICE_REQUEST__RELEVANT_HISTORY;

	/**
	 * The number of structural features of the '<em>Servicerequestgenetics</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICEREQUESTGENETICS_FEATURE_COUNT = ResourcesPackage.SERVICE_REQUEST_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Servicerequestgenetics</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICEREQUESTGENETICS_OPERATION_COUNT = ResourcesPackage.SERVICE_REQUEST_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fhiRCore.profiles.impl.ShareablevaluesetImpl <em>Shareablevalueset</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.profiles.impl.ShareablevaluesetImpl
	 * @see fhiRCore.profiles.impl.ProfilesPackageImpl#getShareablevalueset()
	 * @generated
	 */
	int SHAREABLEVALUESET = 100;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAREABLEVALUESET__ID = ResourcesPackage.VALUE_SET__ID;

	/**
	 * The feature id for the '<em><b>Meta</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAREABLEVALUESET__META = ResourcesPackage.VALUE_SET__META;

	/**
	 * The feature id for the '<em><b>Implicit Rules</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAREABLEVALUESET__IMPLICIT_RULES = ResourcesPackage.VALUE_SET__IMPLICIT_RULES;

	/**
	 * The feature id for the '<em><b>Language</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAREABLEVALUESET__LANGUAGE = ResourcesPackage.VALUE_SET__LANGUAGE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAREABLEVALUESET__TEXT = ResourcesPackage.VALUE_SET__TEXT;

	/**
	 * The feature id for the '<em><b>Contained</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAREABLEVALUESET__CONTAINED = ResourcesPackage.VALUE_SET__CONTAINED;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAREABLEVALUESET__EXTENSION = ResourcesPackage.VALUE_SET__EXTENSION;

	/**
	 * The feature id for the '<em><b>Modifier Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAREABLEVALUESET__MODIFIER_EXTENSION = ResourcesPackage.VALUE_SET__MODIFIER_EXTENSION;

	/**
	 * The feature id for the '<em><b>Url</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAREABLEVALUESET__URL = ResourcesPackage.VALUE_SET__URL;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAREABLEVALUESET__IDENTIFIER = ResourcesPackage.VALUE_SET__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Version</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAREABLEVALUESET__VERSION = ResourcesPackage.VALUE_SET__VERSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAREABLEVALUESET__NAME = ResourcesPackage.VALUE_SET__NAME;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAREABLEVALUESET__TITLE = ResourcesPackage.VALUE_SET__TITLE;

	/**
	 * The feature id for the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAREABLEVALUESET__STATUS = ResourcesPackage.VALUE_SET__STATUS;

	/**
	 * The feature id for the '<em><b>Experimental</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAREABLEVALUESET__EXPERIMENTAL = ResourcesPackage.VALUE_SET__EXPERIMENTAL;

	/**
	 * The feature id for the '<em><b>Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAREABLEVALUESET__DATE = ResourcesPackage.VALUE_SET__DATE;

	/**
	 * The feature id for the '<em><b>Publisher</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAREABLEVALUESET__PUBLISHER = ResourcesPackage.VALUE_SET__PUBLISHER;

	/**
	 * The feature id for the '<em><b>Contact</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAREABLEVALUESET__CONTACT = ResourcesPackage.VALUE_SET__CONTACT;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAREABLEVALUESET__DESCRIPTION = ResourcesPackage.VALUE_SET__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Use Context</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAREABLEVALUESET__USE_CONTEXT = ResourcesPackage.VALUE_SET__USE_CONTEXT;

	/**
	 * The feature id for the '<em><b>Jurisdiction</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAREABLEVALUESET__JURISDICTION = ResourcesPackage.VALUE_SET__JURISDICTION;

	/**
	 * The feature id for the '<em><b>Immutable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAREABLEVALUESET__IMMUTABLE = ResourcesPackage.VALUE_SET__IMMUTABLE;

	/**
	 * The feature id for the '<em><b>Purpose</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAREABLEVALUESET__PURPOSE = ResourcesPackage.VALUE_SET__PURPOSE;

	/**
	 * The feature id for the '<em><b>Copyright</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAREABLEVALUESET__COPYRIGHT = ResourcesPackage.VALUE_SET__COPYRIGHT;

	/**
	 * The feature id for the '<em><b>Compose</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAREABLEVALUESET__COMPOSE = ResourcesPackage.VALUE_SET__COMPOSE;

	/**
	 * The feature id for the '<em><b>Expansion</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAREABLEVALUESET__EXPANSION = ResourcesPackage.VALUE_SET__EXPANSION;

	/**
	 * The number of structural features of the '<em>Shareablevalueset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAREABLEVALUESET_FEATURE_COUNT = ResourcesPackage.VALUE_SET_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Shareablevalueset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAREABLEVALUESET_OPERATION_COUNT = ResourcesPackage.VALUE_SET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fhiRCore.profiles.impl.GroupdefinitionImpl <em>Groupdefinition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.profiles.impl.GroupdefinitionImpl
	 * @see fhiRCore.profiles.impl.ProfilesPackageImpl#getGroupdefinition()
	 * @generated
	 */
	int GROUPDEFINITION = 101;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUPDEFINITION__ID = ResourcesPackage.GROUP__ID;

	/**
	 * The feature id for the '<em><b>Meta</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUPDEFINITION__META = ResourcesPackage.GROUP__META;

	/**
	 * The feature id for the '<em><b>Implicit Rules</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUPDEFINITION__IMPLICIT_RULES = ResourcesPackage.GROUP__IMPLICIT_RULES;

	/**
	 * The feature id for the '<em><b>Language</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUPDEFINITION__LANGUAGE = ResourcesPackage.GROUP__LANGUAGE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUPDEFINITION__TEXT = ResourcesPackage.GROUP__TEXT;

	/**
	 * The feature id for the '<em><b>Contained</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUPDEFINITION__CONTAINED = ResourcesPackage.GROUP__CONTAINED;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUPDEFINITION__EXTENSION = ResourcesPackage.GROUP__EXTENSION;

	/**
	 * The feature id for the '<em><b>Modifier Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUPDEFINITION__MODIFIER_EXTENSION = ResourcesPackage.GROUP__MODIFIER_EXTENSION;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUPDEFINITION__IDENTIFIER = ResourcesPackage.GROUP__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Active</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUPDEFINITION__ACTIVE = ResourcesPackage.GROUP__ACTIVE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUPDEFINITION__TYPE = ResourcesPackage.GROUP__TYPE;

	/**
	 * The feature id for the '<em><b>Actual</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUPDEFINITION__ACTUAL = ResourcesPackage.GROUP__ACTUAL;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUPDEFINITION__CODE = ResourcesPackage.GROUP__CODE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUPDEFINITION__NAME = ResourcesPackage.GROUP__NAME;

	/**
	 * The feature id for the '<em><b>Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUPDEFINITION__QUANTITY = ResourcesPackage.GROUP__QUANTITY;

	/**
	 * The feature id for the '<em><b>Managing Entity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUPDEFINITION__MANAGING_ENTITY = ResourcesPackage.GROUP__MANAGING_ENTITY;

	/**
	 * The feature id for the '<em><b>Characteristic</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUPDEFINITION__CHARACTERISTIC = ResourcesPackage.GROUP__CHARACTERISTIC;

	/**
	 * The feature id for the '<em><b>Member</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUPDEFINITION__MEMBER = ResourcesPackage.GROUP__MEMBER;

	/**
	 * The number of structural features of the '<em>Groupdefinition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUPDEFINITION_FEATURE_COUNT = ResourcesPackage.GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Groupdefinition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUPDEFINITION_OPERATION_COUNT = ResourcesPackage.GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fhiRCore.profiles.impl.ActualgroupImpl <em>Actualgroup</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.profiles.impl.ActualgroupImpl
	 * @see fhiRCore.profiles.impl.ProfilesPackageImpl#getActualgroup()
	 * @generated
	 */
	int ACTUALGROUP = 102;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUALGROUP__ID = ResourcesPackage.GROUP__ID;

	/**
	 * The feature id for the '<em><b>Meta</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUALGROUP__META = ResourcesPackage.GROUP__META;

	/**
	 * The feature id for the '<em><b>Implicit Rules</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUALGROUP__IMPLICIT_RULES = ResourcesPackage.GROUP__IMPLICIT_RULES;

	/**
	 * The feature id for the '<em><b>Language</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUALGROUP__LANGUAGE = ResourcesPackage.GROUP__LANGUAGE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUALGROUP__TEXT = ResourcesPackage.GROUP__TEXT;

	/**
	 * The feature id for the '<em><b>Contained</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUALGROUP__CONTAINED = ResourcesPackage.GROUP__CONTAINED;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUALGROUP__EXTENSION = ResourcesPackage.GROUP__EXTENSION;

	/**
	 * The feature id for the '<em><b>Modifier Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUALGROUP__MODIFIER_EXTENSION = ResourcesPackage.GROUP__MODIFIER_EXTENSION;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUALGROUP__IDENTIFIER = ResourcesPackage.GROUP__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Active</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUALGROUP__ACTIVE = ResourcesPackage.GROUP__ACTIVE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUALGROUP__TYPE = ResourcesPackage.GROUP__TYPE;

	/**
	 * The feature id for the '<em><b>Actual</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUALGROUP__ACTUAL = ResourcesPackage.GROUP__ACTUAL;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUALGROUP__CODE = ResourcesPackage.GROUP__CODE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUALGROUP__NAME = ResourcesPackage.GROUP__NAME;

	/**
	 * The feature id for the '<em><b>Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUALGROUP__QUANTITY = ResourcesPackage.GROUP__QUANTITY;

	/**
	 * The feature id for the '<em><b>Managing Entity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUALGROUP__MANAGING_ENTITY = ResourcesPackage.GROUP__MANAGING_ENTITY;

	/**
	 * The feature id for the '<em><b>Characteristic</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUALGROUP__CHARACTERISTIC = ResourcesPackage.GROUP__CHARACTERISTIC;

	/**
	 * The feature id for the '<em><b>Member</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUALGROUP__MEMBER = ResourcesPackage.GROUP__MEMBER;

	/**
	 * The number of structural features of the '<em>Actualgroup</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUALGROUP_FEATURE_COUNT = ResourcesPackage.GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Actualgroup</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUALGROUP_OPERATION_COUNT = ResourcesPackage.GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fhiRCore.profiles.impl.HlaresultImpl <em>Hlaresult</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.profiles.impl.HlaresultImpl
	 * @see fhiRCore.profiles.impl.ProfilesPackageImpl#getHlaresult()
	 * @generated
	 */
	int HLARESULT = 103;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLARESULT__ID = ResourcesPackage.DIAGNOSTIC_REPORT__ID;

	/**
	 * The feature id for the '<em><b>Meta</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLARESULT__META = ResourcesPackage.DIAGNOSTIC_REPORT__META;

	/**
	 * The feature id for the '<em><b>Implicit Rules</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLARESULT__IMPLICIT_RULES = ResourcesPackage.DIAGNOSTIC_REPORT__IMPLICIT_RULES;

	/**
	 * The feature id for the '<em><b>Language</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLARESULT__LANGUAGE = ResourcesPackage.DIAGNOSTIC_REPORT__LANGUAGE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLARESULT__TEXT = ResourcesPackage.DIAGNOSTIC_REPORT__TEXT;

	/**
	 * The feature id for the '<em><b>Contained</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLARESULT__CONTAINED = ResourcesPackage.DIAGNOSTIC_REPORT__CONTAINED;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLARESULT__EXTENSION = ResourcesPackage.DIAGNOSTIC_REPORT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Modifier Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLARESULT__MODIFIER_EXTENSION = ResourcesPackage.DIAGNOSTIC_REPORT__MODIFIER_EXTENSION;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLARESULT__IDENTIFIER = ResourcesPackage.DIAGNOSTIC_REPORT__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Based On</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLARESULT__BASED_ON = ResourcesPackage.DIAGNOSTIC_REPORT__BASED_ON;

	/**
	 * The feature id for the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLARESULT__STATUS = ResourcesPackage.DIAGNOSTIC_REPORT__STATUS;

	/**
	 * The feature id for the '<em><b>Category</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLARESULT__CATEGORY = ResourcesPackage.DIAGNOSTIC_REPORT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLARESULT__CODE = ResourcesPackage.DIAGNOSTIC_REPORT__CODE;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLARESULT__SUBJECT = ResourcesPackage.DIAGNOSTIC_REPORT__SUBJECT;

	/**
	 * The feature id for the '<em><b>Encounter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLARESULT__ENCOUNTER = ResourcesPackage.DIAGNOSTIC_REPORT__ENCOUNTER;

	/**
	 * The feature id for the '<em><b>Effectivex</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLARESULT__EFFECTIVEX = ResourcesPackage.DIAGNOSTIC_REPORT__EFFECTIVEX;

	/**
	 * The feature id for the '<em><b>Issued</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLARESULT__ISSUED = ResourcesPackage.DIAGNOSTIC_REPORT__ISSUED;

	/**
	 * The feature id for the '<em><b>Performer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLARESULT__PERFORMER = ResourcesPackage.DIAGNOSTIC_REPORT__PERFORMER;

	/**
	 * The feature id for the '<em><b>Results Interpreter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLARESULT__RESULTS_INTERPRETER = ResourcesPackage.DIAGNOSTIC_REPORT__RESULTS_INTERPRETER;

	/**
	 * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLARESULT__SPECIMEN = ResourcesPackage.DIAGNOSTIC_REPORT__SPECIMEN;

	/**
	 * The feature id for the '<em><b>Result</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLARESULT__RESULT = ResourcesPackage.DIAGNOSTIC_REPORT__RESULT;

	/**
	 * The feature id for the '<em><b>Imaging Study</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLARESULT__IMAGING_STUDY = ResourcesPackage.DIAGNOSTIC_REPORT__IMAGING_STUDY;

	/**
	 * The feature id for the '<em><b>Media</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLARESULT__MEDIA = ResourcesPackage.DIAGNOSTIC_REPORT__MEDIA;

	/**
	 * The feature id for the '<em><b>Conclusion</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLARESULT__CONCLUSION = ResourcesPackage.DIAGNOSTIC_REPORT__CONCLUSION;

	/**
	 * The feature id for the '<em><b>Conclusion Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLARESULT__CONCLUSION_CODE = ResourcesPackage.DIAGNOSTIC_REPORT__CONCLUSION_CODE;

	/**
	 * The feature id for the '<em><b>Presented Form</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLARESULT__PRESENTED_FORM = ResourcesPackage.DIAGNOSTIC_REPORT__PRESENTED_FORM;

	/**
	 * The number of structural features of the '<em>Hlaresult</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLARESULT_FEATURE_COUNT = ResourcesPackage.DIAGNOSTIC_REPORT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Hlaresult</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLARESULT_OPERATION_COUNT = ResourcesPackage.DIAGNOSTIC_REPORT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fhiRCore.profiles.impl.CdshooksrequestgroupImpl <em>Cdshooksrequestgroup</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.profiles.impl.CdshooksrequestgroupImpl
	 * @see fhiRCore.profiles.impl.ProfilesPackageImpl#getCdshooksrequestgroup()
	 * @generated
	 */
	int CDSHOOKSREQUESTGROUP = 104;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDSHOOKSREQUESTGROUP__ID = ResourcesPackage.REQUEST_GROUP__ID;

	/**
	 * The feature id for the '<em><b>Meta</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDSHOOKSREQUESTGROUP__META = ResourcesPackage.REQUEST_GROUP__META;

	/**
	 * The feature id for the '<em><b>Implicit Rules</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDSHOOKSREQUESTGROUP__IMPLICIT_RULES = ResourcesPackage.REQUEST_GROUP__IMPLICIT_RULES;

	/**
	 * The feature id for the '<em><b>Language</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDSHOOKSREQUESTGROUP__LANGUAGE = ResourcesPackage.REQUEST_GROUP__LANGUAGE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDSHOOKSREQUESTGROUP__TEXT = ResourcesPackage.REQUEST_GROUP__TEXT;

	/**
	 * The feature id for the '<em><b>Contained</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDSHOOKSREQUESTGROUP__CONTAINED = ResourcesPackage.REQUEST_GROUP__CONTAINED;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDSHOOKSREQUESTGROUP__EXTENSION = ResourcesPackage.REQUEST_GROUP__EXTENSION;

	/**
	 * The feature id for the '<em><b>Modifier Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDSHOOKSREQUESTGROUP__MODIFIER_EXTENSION = ResourcesPackage.REQUEST_GROUP__MODIFIER_EXTENSION;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDSHOOKSREQUESTGROUP__IDENTIFIER = ResourcesPackage.REQUEST_GROUP__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Instantiates Canonical</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDSHOOKSREQUESTGROUP__INSTANTIATES_CANONICAL = ResourcesPackage.REQUEST_GROUP__INSTANTIATES_CANONICAL;

	/**
	 * The feature id for the '<em><b>Instantiates Uri</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDSHOOKSREQUESTGROUP__INSTANTIATES_URI = ResourcesPackage.REQUEST_GROUP__INSTANTIATES_URI;

	/**
	 * The feature id for the '<em><b>Based On</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDSHOOKSREQUESTGROUP__BASED_ON = ResourcesPackage.REQUEST_GROUP__BASED_ON;

	/**
	 * The feature id for the '<em><b>Replaces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDSHOOKSREQUESTGROUP__REPLACES = ResourcesPackage.REQUEST_GROUP__REPLACES;

	/**
	 * The feature id for the '<em><b>Group Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDSHOOKSREQUESTGROUP__GROUP_IDENTIFIER = ResourcesPackage.REQUEST_GROUP__GROUP_IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDSHOOKSREQUESTGROUP__STATUS = ResourcesPackage.REQUEST_GROUP__STATUS;

	/**
	 * The feature id for the '<em><b>Intent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDSHOOKSREQUESTGROUP__INTENT = ResourcesPackage.REQUEST_GROUP__INTENT;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDSHOOKSREQUESTGROUP__PRIORITY = ResourcesPackage.REQUEST_GROUP__PRIORITY;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDSHOOKSREQUESTGROUP__CODE = ResourcesPackage.REQUEST_GROUP__CODE;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDSHOOKSREQUESTGROUP__SUBJECT = ResourcesPackage.REQUEST_GROUP__SUBJECT;

	/**
	 * The feature id for the '<em><b>Encounter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDSHOOKSREQUESTGROUP__ENCOUNTER = ResourcesPackage.REQUEST_GROUP__ENCOUNTER;

	/**
	 * The feature id for the '<em><b>Authored On</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDSHOOKSREQUESTGROUP__AUTHORED_ON = ResourcesPackage.REQUEST_GROUP__AUTHORED_ON;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDSHOOKSREQUESTGROUP__AUTHOR = ResourcesPackage.REQUEST_GROUP__AUTHOR;

	/**
	 * The feature id for the '<em><b>Reason Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDSHOOKSREQUESTGROUP__REASON_CODE = ResourcesPackage.REQUEST_GROUP__REASON_CODE;

	/**
	 * The feature id for the '<em><b>Reason Reference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDSHOOKSREQUESTGROUP__REASON_REFERENCE = ResourcesPackage.REQUEST_GROUP__REASON_REFERENCE;

	/**
	 * The feature id for the '<em><b>Note</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDSHOOKSREQUESTGROUP__NOTE = ResourcesPackage.REQUEST_GROUP__NOTE;

	/**
	 * The feature id for the '<em><b>Action</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDSHOOKSREQUESTGROUP__ACTION = ResourcesPackage.REQUEST_GROUP__ACTION;

	/**
	 * The number of structural features of the '<em>Cdshooksrequestgroup</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDSHOOKSREQUESTGROUP_FEATURE_COUNT = ResourcesPackage.REQUEST_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Cdshooksrequestgroup</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDSHOOKSREQUESTGROUP_OPERATION_COUNT = ResourcesPackage.REQUEST_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fhiRCore.profiles.impl.CdshooksrequestgroupAction1Impl <em>Cdshooksrequestgroup Action1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.profiles.impl.CdshooksrequestgroupAction1Impl
	 * @see fhiRCore.profiles.impl.ProfilesPackageImpl#getCdshooksrequestgroupAction1()
	 * @generated
	 */
	int CDSHOOKSREQUESTGROUP_ACTION1 = 105;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDSHOOKSREQUESTGROUP_ACTION1__ID = ResourcesPackage.REQUEST_GROUP_ACTION__ID;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDSHOOKSREQUESTGROUP_ACTION1__EXTENSION = ResourcesPackage.REQUEST_GROUP_ACTION__EXTENSION;

	/**
	 * The feature id for the '<em><b>Modifier Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDSHOOKSREQUESTGROUP_ACTION1__MODIFIER_EXTENSION = ResourcesPackage.REQUEST_GROUP_ACTION__MODIFIER_EXTENSION;

	/**
	 * The feature id for the '<em><b>Prefix</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDSHOOKSREQUESTGROUP_ACTION1__PREFIX = ResourcesPackage.REQUEST_GROUP_ACTION__PREFIX;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDSHOOKSREQUESTGROUP_ACTION1__TITLE = ResourcesPackage.REQUEST_GROUP_ACTION__TITLE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDSHOOKSREQUESTGROUP_ACTION1__DESCRIPTION = ResourcesPackage.REQUEST_GROUP_ACTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Text Equivalent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDSHOOKSREQUESTGROUP_ACTION1__TEXT_EQUIVALENT = ResourcesPackage.REQUEST_GROUP_ACTION__TEXT_EQUIVALENT;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDSHOOKSREQUESTGROUP_ACTION1__PRIORITY = ResourcesPackage.REQUEST_GROUP_ACTION__PRIORITY;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDSHOOKSREQUESTGROUP_ACTION1__CODE = ResourcesPackage.REQUEST_GROUP_ACTION__CODE;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDSHOOKSREQUESTGROUP_ACTION1__DOCUMENTATION = ResourcesPackage.REQUEST_GROUP_ACTION__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDSHOOKSREQUESTGROUP_ACTION1__CONDITION = ResourcesPackage.REQUEST_GROUP_ACTION__CONDITION;

	/**
	 * The feature id for the '<em><b>Related Action</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDSHOOKSREQUESTGROUP_ACTION1__RELATED_ACTION = ResourcesPackage.REQUEST_GROUP_ACTION__RELATED_ACTION;

	/**
	 * The feature id for the '<em><b>Timingx</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDSHOOKSREQUESTGROUP_ACTION1__TIMINGX = ResourcesPackage.REQUEST_GROUP_ACTION__TIMINGX;

	/**
	 * The feature id for the '<em><b>Participant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDSHOOKSREQUESTGROUP_ACTION1__PARTICIPANT = ResourcesPackage.REQUEST_GROUP_ACTION__PARTICIPANT;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDSHOOKSREQUESTGROUP_ACTION1__TYPE = ResourcesPackage.REQUEST_GROUP_ACTION__TYPE;

	/**
	 * The feature id for the '<em><b>Grouping Behavior</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDSHOOKSREQUESTGROUP_ACTION1__GROUPING_BEHAVIOR = ResourcesPackage.REQUEST_GROUP_ACTION__GROUPING_BEHAVIOR;

	/**
	 * The feature id for the '<em><b>Selection Behavior</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDSHOOKSREQUESTGROUP_ACTION1__SELECTION_BEHAVIOR = ResourcesPackage.REQUEST_GROUP_ACTION__SELECTION_BEHAVIOR;

	/**
	 * The feature id for the '<em><b>Required Behavior</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDSHOOKSREQUESTGROUP_ACTION1__REQUIRED_BEHAVIOR = ResourcesPackage.REQUEST_GROUP_ACTION__REQUIRED_BEHAVIOR;

	/**
	 * The feature id for the '<em><b>Precheck Behavior</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDSHOOKSREQUESTGROUP_ACTION1__PRECHECK_BEHAVIOR = ResourcesPackage.REQUEST_GROUP_ACTION__PRECHECK_BEHAVIOR;

	/**
	 * The feature id for the '<em><b>Cardinality Behavior</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDSHOOKSREQUESTGROUP_ACTION1__CARDINALITY_BEHAVIOR = ResourcesPackage.REQUEST_GROUP_ACTION__CARDINALITY_BEHAVIOR;

	/**
	 * The feature id for the '<em><b>Resource</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDSHOOKSREQUESTGROUP_ACTION1__RESOURCE = ResourcesPackage.REQUEST_GROUP_ACTION__RESOURCE;

	/**
	 * The feature id for the '<em><b>Action</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDSHOOKSREQUESTGROUP_ACTION1__ACTION = ResourcesPackage.REQUEST_GROUP_ACTION__ACTION;

	/**
	 * The number of structural features of the '<em>Cdshooksrequestgroup Action1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDSHOOKSREQUESTGROUP_ACTION1_FEATURE_COUNT = ResourcesPackage.REQUEST_GROUP_ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Cdshooksrequestgroup Action1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDSHOOKSREQUESTGROUP_ACTION1_OPERATION_COUNT = ResourcesPackage.REQUEST_GROUP_ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fhiRCore.profiles.impl.ObservationgeneticsImpl <em>Observationgenetics</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fhiRCore.profiles.impl.ObservationgeneticsImpl
	 * @see fhiRCore.profiles.impl.ProfilesPackageImpl#getObservationgenetics()
	 * @generated
	 */
	int OBSERVATIONGENETICS = 106;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVATIONGENETICS__ID = ResourcesPackage.OBSERVATION__ID;

	/**
	 * The feature id for the '<em><b>Meta</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVATIONGENETICS__META = ResourcesPackage.OBSERVATION__META;

	/**
	 * The feature id for the '<em><b>Implicit Rules</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVATIONGENETICS__IMPLICIT_RULES = ResourcesPackage.OBSERVATION__IMPLICIT_RULES;

	/**
	 * The feature id for the '<em><b>Language</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVATIONGENETICS__LANGUAGE = ResourcesPackage.OBSERVATION__LANGUAGE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVATIONGENETICS__TEXT = ResourcesPackage.OBSERVATION__TEXT;

	/**
	 * The feature id for the '<em><b>Contained</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVATIONGENETICS__CONTAINED = ResourcesPackage.OBSERVATION__CONTAINED;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVATIONGENETICS__EXTENSION = ResourcesPackage.OBSERVATION__EXTENSION;

	/**
	 * The feature id for the '<em><b>Modifier Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVATIONGENETICS__MODIFIER_EXTENSION = ResourcesPackage.OBSERVATION__MODIFIER_EXTENSION;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVATIONGENETICS__IDENTIFIER = ResourcesPackage.OBSERVATION__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Based On</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVATIONGENETICS__BASED_ON = ResourcesPackage.OBSERVATION__BASED_ON;

	/**
	 * The feature id for the '<em><b>Part Of</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVATIONGENETICS__PART_OF = ResourcesPackage.OBSERVATION__PART_OF;

	/**
	 * The feature id for the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVATIONGENETICS__STATUS = ResourcesPackage.OBSERVATION__STATUS;

	/**
	 * The feature id for the '<em><b>Category</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVATIONGENETICS__CATEGORY = ResourcesPackage.OBSERVATION__CATEGORY;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVATIONGENETICS__CODE = ResourcesPackage.OBSERVATION__CODE;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVATIONGENETICS__SUBJECT = ResourcesPackage.OBSERVATION__SUBJECT;

	/**
	 * The feature id for the '<em><b>Focus</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVATIONGENETICS__FOCUS = ResourcesPackage.OBSERVATION__FOCUS;

	/**
	 * The feature id for the '<em><b>Encounter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVATIONGENETICS__ENCOUNTER = ResourcesPackage.OBSERVATION__ENCOUNTER;

	/**
	 * The feature id for the '<em><b>Effectivex</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVATIONGENETICS__EFFECTIVEX = ResourcesPackage.OBSERVATION__EFFECTIVEX;

	/**
	 * The feature id for the '<em><b>Issued</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVATIONGENETICS__ISSUED = ResourcesPackage.OBSERVATION__ISSUED;

	/**
	 * The feature id for the '<em><b>Performer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVATIONGENETICS__PERFORMER = ResourcesPackage.OBSERVATION__PERFORMER;

	/**
	 * The feature id for the '<em><b>Valuex</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVATIONGENETICS__VALUEX = ResourcesPackage.OBSERVATION__VALUEX;

	/**
	 * The feature id for the '<em><b>Data Absent Reason</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVATIONGENETICS__DATA_ABSENT_REASON = ResourcesPackage.OBSERVATION__DATA_ABSENT_REASON;

	/**
	 * The feature id for the '<em><b>Interpretation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVATIONGENETICS__INTERPRETATION = ResourcesPackage.OBSERVATION__INTERPRETATION;

	/**
	 * The feature id for the '<em><b>Note</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVATIONGENETICS__NOTE = ResourcesPackage.OBSERVATION__NOTE;

	/**
	 * The feature id for the '<em><b>Body Site</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVATIONGENETICS__BODY_SITE = ResourcesPackage.OBSERVATION__BODY_SITE;

	/**
	 * The feature id for the '<em><b>Method</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVATIONGENETICS__METHOD = ResourcesPackage.OBSERVATION__METHOD;

	/**
	 * The feature id for the '<em><b>Specimen</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVATIONGENETICS__SPECIMEN = ResourcesPackage.OBSERVATION__SPECIMEN;

	/**
	 * The feature id for the '<em><b>Device</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVATIONGENETICS__DEVICE = ResourcesPackage.OBSERVATION__DEVICE;

	/**
	 * The feature id for the '<em><b>Has Member</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVATIONGENETICS__HAS_MEMBER = ResourcesPackage.OBSERVATION__HAS_MEMBER;

	/**
	 * The feature id for the '<em><b>Derived From</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVATIONGENETICS__DERIVED_FROM = ResourcesPackage.OBSERVATION__DERIVED_FROM;

	/**
	 * The feature id for the '<em><b>Component</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVATIONGENETICS__COMPONENT = ResourcesPackage.OBSERVATION__COMPONENT;

	/**
	 * The feature id for the '<em><b>Reference Range</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVATIONGENETICS__REFERENCE_RANGE = ResourcesPackage.OBSERVATION__REFERENCE_RANGE;

	/**
	 * The number of structural features of the '<em>Observationgenetics</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVATIONGENETICS_FEATURE_COUNT = ResourcesPackage.OBSERVATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Observationgenetics</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVATIONGENETICS_OPERATION_COUNT = ResourcesPackage.OBSERVATION_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link fhiRCore.profiles.Picoelement <em>Picoelement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Picoelement</em>'.
	 * @see fhiRCore.profiles.Picoelement
	 * @generated
	 */
	EClass getPicoelement();

	/**
	 * Returns the meta object for class '{@link fhiRCore.profiles.PicoelementCharacteristic1 <em>Picoelement Characteristic1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Picoelement Characteristic1</em>'.
	 * @see fhiRCore.profiles.PicoelementCharacteristic1
	 * @generated
	 */
	EClass getPicoelementCharacteristic1();

	/**
	 * Returns the meta object for class '{@link fhiRCore.profiles.Bmi <em>Bmi</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bmi</em>'.
	 * @see fhiRCore.profiles.Bmi
	 * @generated
	 */
	EClass getBmi();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.profiles.Bmi#getValueQuantity <em>Value Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value Quantity</em>'.
	 * @see fhiRCore.profiles.Bmi#getValueQuantity()
	 * @see #getBmi()
	 * @generated
	 */
	EReference getBmi_ValueQuantity();

	/**
	 * Returns the meta object for class '{@link fhiRCore.profiles.Vitalsigns <em>Vitalsigns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vitalsigns</em>'.
	 * @see fhiRCore.profiles.Vitalsigns
	 * @generated
	 */
	EClass getVitalsigns();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.profiles.Vitalsigns#getVsCat <em>Vs Cat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Vs Cat</em>'.
	 * @see fhiRCore.profiles.Vitalsigns#getVsCat()
	 * @see #getVitalsigns()
	 * @generated
	 */
	EReference getVitalsigns_VsCat();

	/**
	 * Returns the meta object for class '{@link fhiRCore.profiles.VitalsignsCodeableConcept1 <em>Vitalsigns Codeable Concept1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vitalsigns Codeable Concept1</em>'.
	 * @see fhiRCore.profiles.VitalsignsCodeableConcept1
	 * @generated
	 */
	EClass getVitalsignsCodeableConcept1();

	/**
	 * Returns the meta object for class '{@link fhiRCore.profiles.VitalsignsCodeableConcept1Coding1 <em>Vitalsigns Codeable Concept1 Coding1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vitalsigns Codeable Concept1 Coding1</em>'.
	 * @see fhiRCore.profiles.VitalsignsCodeableConcept1Coding1
	 * @generated
	 */
	EClass getVitalsignsCodeableConcept1Coding1();

	/**
	 * Returns the meta object for class '{@link fhiRCore.profiles.VitalsignsComponent1 <em>Vitalsigns Component1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vitalsigns Component1</em>'.
	 * @see fhiRCore.profiles.VitalsignsComponent1
	 * @generated
	 */
	EClass getVitalsignsComponent1();

	/**
	 * Returns the meta object for class '{@link fhiRCore.profiles.BmiCodeableConcept1 <em>Bmi Codeable Concept1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bmi Codeable Concept1</em>'.
	 * @see fhiRCore.profiles.BmiCodeableConcept1
	 * @generated
	 */
	EClass getBmiCodeableConcept1();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.profiles.BmiCodeableConcept1#getBmiCode <em>Bmi Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bmi Code</em>'.
	 * @see fhiRCore.profiles.BmiCodeableConcept1#getBmiCode()
	 * @see #getBmiCodeableConcept1()
	 * @generated
	 */
	EReference getBmiCodeableConcept1_BmiCode();

	/**
	 * Returns the meta object for class '{@link fhiRCore.profiles.BmiCodeableConcept1Coding1 <em>Bmi Codeable Concept1 Coding1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bmi Codeable Concept1 Coding1</em>'.
	 * @see fhiRCore.profiles.BmiCodeableConcept1Coding1
	 * @generated
	 */
	EClass getBmiCodeableConcept1Coding1();

	/**
	 * Returns the meta object for class '{@link fhiRCore.profiles.BmiQuantity1 <em>Bmi Quantity1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bmi Quantity1</em>'.
	 * @see fhiRCore.profiles.BmiQuantity1
	 * @generated
	 */
	EClass getBmiQuantity1();

	/**
	 * Returns the meta object for class '{@link fhiRCore.profiles.Devicemetricobservation <em>Devicemetricobservation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Devicemetricobservation</em>'.
	 * @see fhiRCore.profiles.Devicemetricobservation
	 * @generated
	 */
	EClass getDevicemetricobservation();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.profiles.Devicemetricobservation#getEffectiveDateTime <em>Effective Date Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Effective Date Time</em>'.
	 * @see fhiRCore.profiles.Devicemetricobservation#getEffectiveDateTime()
	 * @see #getDevicemetricobservation()
	 * @generated
	 */
	EReference getDevicemetricobservation_EffectiveDateTime();

	/**
	 * Returns the meta object for class '{@link fhiRCore.profiles.Cdshooksserviceplandefinition <em>Cdshooksserviceplandefinition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cdshooksserviceplandefinition</em>'.
	 * @see fhiRCore.profiles.Cdshooksserviceplandefinition
	 * @generated
	 */
	EClass getCdshooksserviceplandefinition();

	/**
	 * Returns the meta object for class '{@link fhiRCore.profiles.CdshooksserviceplandefinitionAction1 <em>Cdshooksserviceplandefinition Action1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cdshooksserviceplandefinition Action1</em>'.
	 * @see fhiRCore.profiles.CdshooksserviceplandefinitionAction1
	 * @generated
	 */
	EClass getCdshooksserviceplandefinitionAction1();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.profiles.CdshooksserviceplandefinitionAction1#getDefinitionx <em>Definitionx</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Definitionx</em>'.
	 * @see fhiRCore.profiles.CdshooksserviceplandefinitionAction1#getDefinitionx()
	 * @see #getCdshooksserviceplandefinitionAction1()
	 * @generated
	 */
	EReference getCdshooksserviceplandefinitionAction1_Definitionx();

	/**
	 * Returns the meta object for class '{@link fhiRCore.profiles.Cqfquestionnaire <em>Cqfquestionnaire</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cqfquestionnaire</em>'.
	 * @see fhiRCore.profiles.Cqfquestionnaire
	 * @generated
	 */
	EClass getCqfquestionnaire();

	/**
	 * Returns the meta object for class '{@link fhiRCore.profiles.Computableplandefinition <em>Computableplandefinition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Computableplandefinition</em>'.
	 * @see fhiRCore.profiles.Computableplandefinition
	 * @generated
	 */
	EClass getComputableplandefinition();

	/**
	 * Returns the meta object for class '{@link fhiRCore.profiles.Shareablelibrary <em>Shareablelibrary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Shareablelibrary</em>'.
	 * @see fhiRCore.profiles.Shareablelibrary
	 * @generated
	 */
	EClass getShareablelibrary();

	/**
	 * Returns the meta object for class '{@link fhiRCore.profiles.Cdshooksguidanceresponse <em>Cdshooksguidanceresponse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cdshooksguidanceresponse</em>'.
	 * @see fhiRCore.profiles.Cdshooksguidanceresponse
	 * @generated
	 */
	EClass getCdshooksguidanceresponse();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.profiles.Cdshooksguidanceresponse#getModuleUri <em>Module Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Module Uri</em>'.
	 * @see fhiRCore.profiles.Cdshooksguidanceresponse#getModuleUri()
	 * @see #getCdshooksguidanceresponse()
	 * @generated
	 */
	EReference getCdshooksguidanceresponse_ModuleUri();

	/**
	 * Returns the meta object for class '{@link fhiRCore.profiles.Shareableactivitydefinition <em>Shareableactivitydefinition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Shareableactivitydefinition</em>'.
	 * @see fhiRCore.profiles.Shareableactivitydefinition
	 * @generated
	 */
	EClass getShareableactivitydefinition();

	/**
	 * Returns the meta object for class '{@link fhiRCore.profiles.Shareablemeasure <em>Shareablemeasure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Shareablemeasure</em>'.
	 * @see fhiRCore.profiles.Shareablemeasure
	 * @generated
	 */
	EClass getShareablemeasure();

	/**
	 * Returns the meta object for class '{@link fhiRCore.profiles.Resprate <em>Resprate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resprate</em>'.
	 * @see fhiRCore.profiles.Resprate
	 * @generated
	 */
	EClass getResprate();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.profiles.Resprate#getValueQuantity <em>Value Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value Quantity</em>'.
	 * @see fhiRCore.profiles.Resprate#getValueQuantity()
	 * @see #getResprate()
	 * @generated
	 */
	EReference getResprate_ValueQuantity();

	/**
	 * Returns the meta object for class '{@link fhiRCore.profiles.ResprateCodeableConcept1 <em>Resprate Codeable Concept1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resprate Codeable Concept1</em>'.
	 * @see fhiRCore.profiles.ResprateCodeableConcept1
	 * @generated
	 */
	EClass getResprateCodeableConcept1();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.profiles.ResprateCodeableConcept1#getRespRateCode <em>Resp Rate Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Resp Rate Code</em>'.
	 * @see fhiRCore.profiles.ResprateCodeableConcept1#getRespRateCode()
	 * @see #getResprateCodeableConcept1()
	 * @generated
	 */
	EReference getResprateCodeableConcept1_RespRateCode();

	/**
	 * Returns the meta object for class '{@link fhiRCore.profiles.ResprateCodeableConcept1Coding1 <em>Resprate Codeable Concept1 Coding1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resprate Codeable Concept1 Coding1</em>'.
	 * @see fhiRCore.profiles.ResprateCodeableConcept1Coding1
	 * @generated
	 */
	EClass getResprateCodeableConcept1Coding1();

	/**
	 * Returns the meta object for class '{@link fhiRCore.profiles.ResprateQuantity1 <em>Resprate Quantity1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resprate Quantity1</em>'.
	 * @see fhiRCore.profiles.ResprateQuantity1
	 * @generated
	 */
	EClass getResprateQuantity1();

	/**
	 * Returns the meta object for class '{@link fhiRCore.profiles.Familymemberhistorygenetic <em>Familymemberhistorygenetic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Familymemberhistorygenetic</em>'.
	 * @see fhiRCore.profiles.Familymemberhistorygenetic
	 * @generated
	 */
	EClass getFamilymemberhistorygenetic();

	/**
	 * Returns the meta object for class '{@link fhiRCore.profiles.FamilymemberhistorygeneticCondition1 <em>Familymemberhistorygenetic Condition1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Familymemberhistorygenetic Condition1</em>'.
	 * @see fhiRCore.profiles.FamilymemberhistorygeneticCondition1
	 * @generated
	 */
	EClass getFamilymemberhistorygeneticCondition1();

	/**
	 * Returns the meta object for class '{@link fhiRCore.profiles.Hdlcholesterol <em>Hdlcholesterol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hdlcholesterol</em>'.
	 * @see fhiRCore.profiles.Hdlcholesterol
	 * @generated
	 */
	EClass getHdlcholesterol();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.profiles.Hdlcholesterol#getValueQuantity <em>Value Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value Quantity</em>'.
	 * @see fhiRCore.profiles.Hdlcholesterol#getValueQuantity()
	 * @see #getHdlcholesterol()
	 * @generated
	 */
	EReference getHdlcholesterol_ValueQuantity();

	/**
	 * Returns the meta object for class '{@link fhiRCore.profiles.HdlcholesterolReferenceRange1 <em>Hdlcholesterol Reference Range1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hdlcholesterol Reference Range1</em>'.
	 * @see fhiRCore.profiles.HdlcholesterolReferenceRange1
	 * @generated
	 */
	EClass getHdlcholesterolReferenceRange1();

	/**
	 * Returns the meta object for class '{@link fhiRCore.profiles.Shareableplandefinition <em>Shareableplandefinition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Shareableplandefinition</em>'.
	 * @see fhiRCore.profiles.Shareableplandefinition
	 * @generated
	 */
	EClass getShareableplandefinition();

	/**
	 * Returns the meta object for class '{@link fhiRCore.profiles.Lipidprofile <em>Lipidprofile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lipidprofile</em>'.
	 * @see fhiRCore.profiles.Lipidprofile
	 * @generated
	 */
	EClass getLipidprofile();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.profiles.Lipidprofile#getCholesterol <em>Cholesterol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cholesterol</em>'.
	 * @see fhiRCore.profiles.Lipidprofile#getCholesterol()
	 * @see #getLipidprofile()
	 * @generated
	 */
	EReference getLipidprofile_Cholesterol();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.profiles.Lipidprofile#getTriglyceride <em>Triglyceride</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Triglyceride</em>'.
	 * @see fhiRCore.profiles.Lipidprofile#getTriglyceride()
	 * @see #getLipidprofile()
	 * @generated
	 */
	EReference getLipidprofile_Triglyceride();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.profiles.Lipidprofile#getHdlCholesterol <em>Hdl Cholesterol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Hdl Cholesterol</em>'.
	 * @see fhiRCore.profiles.Lipidprofile#getHdlCholesterol()
	 * @see #getLipidprofile()
	 * @generated
	 */
	EReference getLipidprofile_HdlCholesterol();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.profiles.Lipidprofile#getLdlCholesterol <em>Ldl Cholesterol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ldl Cholesterol</em>'.
	 * @see fhiRCore.profiles.Lipidprofile#getLdlCholesterol()
	 * @see #getLipidprofile()
	 * @generated
	 */
	EReference getLipidprofile_LdlCholesterol();

	/**
	 * Returns the meta object for class '{@link fhiRCore.profiles.Cholesterol <em>Cholesterol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cholesterol</em>'.
	 * @see fhiRCore.profiles.Cholesterol
	 * @generated
	 */
	EClass getCholesterol();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.profiles.Cholesterol#getValueQuantity <em>Value Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value Quantity</em>'.
	 * @see fhiRCore.profiles.Cholesterol#getValueQuantity()
	 * @see #getCholesterol()
	 * @generated
	 */
	EReference getCholesterol_ValueQuantity();

	/**
	 * Returns the meta object for class '{@link fhiRCore.profiles.CholesterolQuantity1 <em>Cholesterol Quantity1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cholesterol Quantity1</em>'.
	 * @see fhiRCore.profiles.CholesterolQuantity1
	 * @generated
	 */
	EClass getCholesterolQuantity1();

	/**
	 * Returns the meta object for class '{@link fhiRCore.profiles.CholesterolReferenceRange1 <em>Cholesterol Reference Range1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cholesterol Reference Range1</em>'.
	 * @see fhiRCore.profiles.CholesterolReferenceRange1
	 * @generated
	 */
	EClass getCholesterolReferenceRange1();

	/**
	 * Returns the meta object for class '{@link fhiRCore.profiles.Triglyceride <em>Triglyceride</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Triglyceride</em>'.
	 * @see fhiRCore.profiles.Triglyceride
	 * @generated
	 */
	EClass getTriglyceride();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.profiles.Triglyceride#getValueQuantity <em>Value Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value Quantity</em>'.
	 * @see fhiRCore.profiles.Triglyceride#getValueQuantity()
	 * @see #getTriglyceride()
	 * @generated
	 */
	EReference getTriglyceride_ValueQuantity();

	/**
	 * Returns the meta object for class '{@link fhiRCore.profiles.TriglycerideReferenceRange1 <em>Triglyceride Reference Range1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Triglyceride Reference Range1</em>'.
	 * @see fhiRCore.profiles.TriglycerideReferenceRange1
	 * @generated
	 */
	EClass getTriglycerideReferenceRange1();

	/**
	 * Returns the meta object for class '{@link fhiRCore.profiles.Ldlcholesterol <em>Ldlcholesterol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ldlcholesterol</em>'.
	 * @see fhiRCore.profiles.Ldlcholesterol
	 * @generated
	 */
	EClass getLdlcholesterol();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.profiles.Ldlcholesterol#getValueQuantity <em>Value Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value Quantity</em>'.
	 * @see fhiRCore.profiles.Ldlcholesterol#getValueQuantity()
	 * @see #getLdlcholesterol()
	 * @generated
	 */
	EReference getLdlcholesterol_ValueQuantity();

	/**
	 * Returns the meta object for class '{@link fhiRCore.profiles.LdlcholesterolReferenceRange1 <em>Ldlcholesterol Reference Range1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ldlcholesterol Reference Range1</em>'.
	 * @see fhiRCore.profiles.LdlcholesterolReferenceRange1
	 * @generated
	 */
	EClass getLdlcholesterolReferenceRange1();

	/**
	 * Returns the meta object for class '{@link fhiRCore.profiles.Bodytemp <em>Bodytemp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bodytemp</em>'.
	 * @see fhiRCore.profiles.Bodytemp
	 * @generated
	 */
	EClass getBodytemp();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.profiles.Bodytemp#getValueQuantity <em>Value Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value Quantity</em>'.
	 * @see fhiRCore.profiles.Bodytemp#getValueQuantity()
	 * @see #getBodytemp()
	 * @generated
	 */
	EReference getBodytemp_ValueQuantity();

	/**
	 * Returns the meta object for class '{@link fhiRCore.profiles.BodytempCodeableConcept1 <em>Bodytemp Codeable Concept1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bodytemp Codeable Concept1</em>'.
	 * @see fhiRCore.profiles.BodytempCodeableConcept1
	 * @generated
	 */
	EClass getBodytempCodeableConcept1();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.profiles.BodytempCodeableConcept1#getBodyTempCode <em>Body Temp Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Body Temp Code</em>'.
	 * @see fhiRCore.profiles.BodytempCodeableConcept1#getBodyTempCode()
	 * @see #getBodytempCodeableConcept1()
	 * @generated
	 */
	EReference getBodytempCodeableConcept1_BodyTempCode();

	/**
	 * Returns the meta object for class '{@link fhiRCore.profiles.BodytempCodeableConcept1Coding1 <em>Bodytemp Codeable Concept1 Coding1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bodytemp Codeable Concept1 Coding1</em>'.
	 * @see fhiRCore.profiles.BodytempCodeableConcept1Coding1
	 * @generated
	 */
	EClass getBodytempCodeableConcept1Coding1();

	/**
	 * Returns the meta object for class '{@link fhiRCore.profiles.BodytempQuantity1 <em>Bodytemp Quantity1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bodytemp Quantity1</em>'.
	 * @see fhiRCore.profiles.BodytempQuantity1
	 * @generated
	 */
	EClass getBodytempQuantity1();

	/**
	 * Returns the meta object for class '{@link fhiRCore.profiles.MetadataResource <em>Metadata Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Metadata Resource</em>'.
	 * @see fhiRCore.profiles.MetadataResource
	 * @generated
	 */
	EClass getMetadataResource();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.profiles.MetadataResource#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Url</em>'.
	 * @see fhiRCore.profiles.MetadataResource#getUrl()
	 * @see #getMetadataResource()
	 * @generated
	 */
	EReference getMetadataResource_Url();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.profiles.MetadataResource#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Version</em>'.
	 * @see fhiRCore.profiles.MetadataResource#getVersion()
	 * @see #getMetadataResource()
	 * @generated
	 */
	EReference getMetadataResource_Version();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.profiles.MetadataResource#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Name</em>'.
	 * @see fhiRCore.profiles.MetadataResource#getName()
	 * @see #getMetadataResource()
	 * @generated
	 */
	EReference getMetadataResource_Name();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.profiles.MetadataResource#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Title</em>'.
	 * @see fhiRCore.profiles.MetadataResource#getTitle()
	 * @see #getMetadataResource()
	 * @generated
	 */
	EReference getMetadataResource_Title();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.profiles.MetadataResource#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Status</em>'.
	 * @see fhiRCore.profiles.MetadataResource#getStatus()
	 * @see #getMetadataResource()
	 * @generated
	 */
	EReference getMetadataResource_Status();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.profiles.MetadataResource#getExperimental <em>Experimental</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Experimental</em>'.
	 * @see fhiRCore.profiles.MetadataResource#getExperimental()
	 * @see #getMetadataResource()
	 * @generated
	 */
	EReference getMetadataResource_Experimental();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.profiles.MetadataResource#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Date</em>'.
	 * @see fhiRCore.profiles.MetadataResource#getDate()
	 * @see #getMetadataResource()
	 * @generated
	 */
	EReference getMetadataResource_Date();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.profiles.MetadataResource#getPublisher <em>Publisher</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Publisher</em>'.
	 * @see fhiRCore.profiles.MetadataResource#getPublisher()
	 * @see #getMetadataResource()
	 * @generated
	 */
	EReference getMetadataResource_Publisher();

	/**
	 * Returns the meta object for the containment reference list '{@link fhiRCore.profiles.MetadataResource#getContacts <em>Contact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contact</em>'.
	 * @see fhiRCore.profiles.MetadataResource#getContacts()
	 * @see #getMetadataResource()
	 * @generated
	 */
	EReference getMetadataResource_Contact();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.profiles.MetadataResource#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see fhiRCore.profiles.MetadataResource#getDescription()
	 * @see #getMetadataResource()
	 * @generated
	 */
	EReference getMetadataResource_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link fhiRCore.profiles.MetadataResource#getUseContexts <em>Use Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Use Context</em>'.
	 * @see fhiRCore.profiles.MetadataResource#getUseContexts()
	 * @see #getMetadataResource()
	 * @generated
	 */
	EReference getMetadataResource_UseContext();

	/**
	 * Returns the meta object for the containment reference list '{@link fhiRCore.profiles.MetadataResource#getJurisdictions <em>Jurisdiction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Jurisdiction</em>'.
	 * @see fhiRCore.profiles.MetadataResource#getJurisdictions()
	 * @see #getMetadataResource()
	 * @generated
	 */
	EReference getMetadataResource_Jurisdiction();

	/**
	 * Returns the meta object for class '{@link fhiRCore.profiles.Heartrate <em>Heartrate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Heartrate</em>'.
	 * @see fhiRCore.profiles.Heartrate
	 * @generated
	 */
	EClass getHeartrate();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.profiles.Heartrate#getValueQuantity <em>Value Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value Quantity</em>'.
	 * @see fhiRCore.profiles.Heartrate#getValueQuantity()
	 * @see #getHeartrate()
	 * @generated
	 */
	EReference getHeartrate_ValueQuantity();

	/**
	 * Returns the meta object for class '{@link fhiRCore.profiles.HeartrateCodeableConcept1 <em>Heartrate Codeable Concept1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Heartrate Codeable Concept1</em>'.
	 * @see fhiRCore.profiles.HeartrateCodeableConcept1
	 * @generated
	 */
	EClass getHeartrateCodeableConcept1();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.profiles.HeartrateCodeableConcept1#getHeartRateCode <em>Heart Rate Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Heart Rate Code</em>'.
	 * @see fhiRCore.profiles.HeartrateCodeableConcept1#getHeartRateCode()
	 * @see #getHeartrateCodeableConcept1()
	 * @generated
	 */
	EReference getHeartrateCodeableConcept1_HeartRateCode();

	/**
	 * Returns the meta object for class '{@link fhiRCore.profiles.HeartrateCodeableConcept1Coding1 <em>Heartrate Codeable Concept1 Coding1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Heartrate Codeable Concept1 Coding1</em>'.
	 * @see fhiRCore.profiles.HeartrateCodeableConcept1Coding1
	 * @generated
	 */
	EClass getHeartrateCodeableConcept1Coding1();

	/**
	 * Returns the meta object for class '{@link fhiRCore.profiles.HeartrateQuantity1 <em>Heartrate Quantity1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Heartrate Quantity1</em>'.
	 * @see fhiRCore.profiles.HeartrateQuantity1
	 * @generated
	 */
	EClass getHeartrateQuantity1();

	/**
	 * Returns the meta object for class '{@link fhiRCore.profiles.Bodyheight <em>Bodyheight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bodyheight</em>'.
	 * @see fhiRCore.profiles.Bodyheight
	 * @generated
	 */
	EClass getBodyheight();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.profiles.Bodyheight#getValueQuantity <em>Value Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value Quantity</em>'.
	 * @see fhiRCore.profiles.Bodyheight#getValueQuantity()
	 * @see #getBodyheight()
	 * @generated
	 */
	EReference getBodyheight_ValueQuantity();

	/**
	 * Returns the meta object for class '{@link fhiRCore.profiles.BodyheightCodeableConcept1 <em>Bodyheight Codeable Concept1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bodyheight Codeable Concept1</em>'.
	 * @see fhiRCore.profiles.BodyheightCodeableConcept1
	 * @generated
	 */
	EClass getBodyheightCodeableConcept1();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.profiles.BodyheightCodeableConcept1#getBodyHeightCode <em>Body Height Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Body Height Code</em>'.
	 * @see fhiRCore.profiles.BodyheightCodeableConcept1#getBodyHeightCode()
	 * @see #getBodyheightCodeableConcept1()
	 * @generated
	 */
	EReference getBodyheightCodeableConcept1_BodyHeightCode();

	/**
	 * Returns the meta object for class '{@link fhiRCore.profiles.BodyheightCodeableConcept1Coding1 <em>Bodyheight Codeable Concept1 Coding1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bodyheight Codeable Concept1 Coding1</em>'.
	 * @see fhiRCore.profiles.BodyheightCodeableConcept1Coding1
	 * @generated
	 */
	EClass getBodyheightCodeableConcept1Coding1();

	/**
	 * Returns the meta object for class '{@link fhiRCore.profiles.BodyheightQuantity1 <em>Bodyheight Quantity1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bodyheight Quantity1</em>'.
	 * @see fhiRCore.profiles.BodyheightQuantity1
	 * @generated
	 */
	EClass getBodyheightQuantity1();

	/**
	 * Returns the meta object for class '{@link fhiRCore.profiles.Elementdefinitionde <em>Elementdefinitionde</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Elementdefinitionde</em>'.
	 * @see fhiRCore.profiles.Elementdefinitionde
	 * @generated
	 */
	EClass getElementdefinitionde();

	/**
	 * Returns the meta object for class '{@link fhiRCore.profiles.ElementdefinitiondeElement31 <em>Elementdefinitionde Element31</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Elementdefinitionde Element31</em>'.
	 * @see fhiRCore.profiles.ElementdefinitiondeElement31
	 * @generated
	 */
	EClass getElementdefinitiondeElement31();

	/**
	 * Returns the meta object for class '{@link fhiRCore.profiles.Diagnosticreportgenetics <em>Diagnosticreportgenetics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diagnosticreportgenetics</em>'.
	 * @see fhiRCore.profiles.Diagnosticreportgenetics
	 * @generated
	 */
	EClass getDiagnosticreportgenetics();

	/**
	 * Returns the meta object for class '{@link fhiRCore.profiles.Shareablecodesystem <em>Shareablecodesystem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Shareablecodesystem</em>'.
	 * @see fhiRCore.profiles.Shareablecodesystem
	 * @generated
	 */
	EClass getShareablecodesystem();

	/**
	 * Returns the meta object for class '{@link fhiRCore.profiles.ShareablecodesystemConceptDefinition1 <em>Shareablecodesystem Concept Definition1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Shareablecodesystem Concept Definition1</em>'.
	 * @see fhiRCore.profiles.ShareablecodesystemConceptDefinition1
	 * @generated
	 */
	EClass getShareablecodesystemConceptDefinition1();

	/**
	 * Returns the meta object for class '{@link fhiRCore.profiles.Oxygensat <em>Oxygensat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Oxygensat</em>'.
	 * @see fhiRCore.profiles.Oxygensat
	 * @generated
	 */
	EClass getOxygensat();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.profiles.Oxygensat#getValueQuantity <em>Value Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value Quantity</em>'.
	 * @see fhiRCore.profiles.Oxygensat#getValueQuantity()
	 * @see #getOxygensat()
	 * @generated
	 */
	EReference getOxygensat_ValueQuantity();

	/**
	 * Returns the meta object for class '{@link fhiRCore.profiles.OxygensatCodeableConcept1 <em>Oxygensat Codeable Concept1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Oxygensat Codeable Concept1</em>'.
	 * @see fhiRCore.profiles.OxygensatCodeableConcept1
	 * @generated
	 */
	EClass getOxygensatCodeableConcept1();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.profiles.OxygensatCodeableConcept1#getOxygenSatCode <em>Oxygen Sat Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Oxygen Sat Code</em>'.
	 * @see fhiRCore.profiles.OxygensatCodeableConcept1#getOxygenSatCode()
	 * @see #getOxygensatCodeableConcept1()
	 * @generated
	 */
	EReference getOxygensatCodeableConcept1_OxygenSatCode();

	/**
	 * Returns the meta object for class '{@link fhiRCore.profiles.OxygensatCodeableConcept1Coding1 <em>Oxygensat Codeable Concept1 Coding1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Oxygensat Codeable Concept1 Coding1</em>'.
	 * @see fhiRCore.profiles.OxygensatCodeableConcept1Coding1
	 * @generated
	 */
	EClass getOxygensatCodeableConcept1Coding1();

	/**
	 * Returns the meta object for class '{@link fhiRCore.profiles.OxygensatQuantity1 <em>Oxygensat Quantity1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Oxygensat Quantity1</em>'.
	 * @see fhiRCore.profiles.OxygensatQuantity1
	 * @generated
	 */
	EClass getOxygensatQuantity1();

	/**
	 * Returns the meta object for class '{@link fhiRCore.profiles.Clinicaldocument <em>Clinicaldocument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Clinicaldocument</em>'.
	 * @see fhiRCore.profiles.Clinicaldocument
	 * @generated
	 */
	EClass getClinicaldocument();

	/**
	 * Returns the meta object for class '{@link fhiRCore.profiles.Cqllibrary <em>Cqllibrary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cqllibrary</em>'.
	 * @see fhiRCore.profiles.Cqllibrary
	 * @generated
	 */
	EClass getCqllibrary();

	/**
	 * Returns the meta object for class '{@link fhiRCore.profiles.Headcircum <em>Headcircum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Headcircum</em>'.
	 * @see fhiRCore.profiles.Headcircum
	 * @generated
	 */
	EClass getHeadcircum();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.profiles.Headcircum#getValueQuantity <em>Value Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value Quantity</em>'.
	 * @see fhiRCore.profiles.Headcircum#getValueQuantity()
	 * @see #getHeadcircum()
	 * @generated
	 */
	EReference getHeadcircum_ValueQuantity();

	/**
	 * Returns the meta object for class '{@link fhiRCore.profiles.HeadcircumCodeableConcept1 <em>Headcircum Codeable Concept1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Headcircum Codeable Concept1</em>'.
	 * @see fhiRCore.profiles.HeadcircumCodeableConcept1
	 * @generated
	 */
	EClass getHeadcircumCodeableConcept1();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.profiles.HeadcircumCodeableConcept1#getHeadCircumCode <em>Head Circum Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Head Circum Code</em>'.
	 * @see fhiRCore.profiles.HeadcircumCodeableConcept1#getHeadCircumCode()
	 * @see #getHeadcircumCodeableConcept1()
	 * @generated
	 */
	EReference getHeadcircumCodeableConcept1_HeadCircumCode();

	/**
	 * Returns the meta object for class '{@link fhiRCore.profiles.HeadcircumCodeableConcept1Coding1 <em>Headcircum Codeable Concept1 Coding1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Headcircum Codeable Concept1 Coding1</em>'.
	 * @see fhiRCore.profiles.HeadcircumCodeableConcept1Coding1
	 * @generated
	 */
	EClass getHeadcircumCodeableConcept1Coding1();

	/**
	 * Returns the meta object for class '{@link fhiRCore.profiles.HeadcircumQuantity1 <em>Headcircum Quantity1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Headcircum Quantity1</em>'.
	 * @see fhiRCore.profiles.HeadcircumQuantity1
	 * @generated
	 */
	EClass getHeadcircumQuantity1();

	/**
	 * Returns the meta object for class '{@link fhiRCore.profiles.Synchronizationplandefinition <em>Synchronizationplandefinition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Synchronizationplandefinition</em>'.
	 * @see fhiRCore.profiles.Synchronizationplandefinition
	 * @generated
	 */
	EClass getSynchronizationplandefinition();

	/**
	 * Returns the meta object for class '{@link fhiRCore.profiles.Vitalspanel <em>Vitalspanel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vitalspanel</em>'.
	 * @see fhiRCore.profiles.Vitalspanel
	 * @generated
	 */
	EClass getVitalspanel();

	/**
	 * Returns the meta object for class '{@link fhiRCore.profiles.VitalspanelCodeableConcept1 <em>Vitalspanel Codeable Concept1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vitalspanel Codeable Concept1</em>'.
	 * @see fhiRCore.profiles.VitalspanelCodeableConcept1
	 * @generated
	 */
	EClass getVitalspanelCodeableConcept1();

	/**
	 * Returns the meta object for the containment reference list '{@link fhiRCore.profiles.VitalspanelCodeableConcept1#getVitalsPanelCodes <em>Vitals Panel Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Vitals Panel Code</em>'.
	 * @see fhiRCore.profiles.VitalspanelCodeableConcept1#getVitalsPanelCodes()
	 * @see #getVitalspanelCodeableConcept1()
	 * @generated
	 */
	EReference getVitalspanelCodeableConcept1_VitalsPanelCode();

	/**
	 * Returns the meta object for class '{@link fhiRCore.profiles.VitalspanelCodeableConcept1Coding1 <em>Vitalspanel Codeable Concept1 Coding1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vitalspanel Codeable Concept1 Coding1</em>'.
	 * @see fhiRCore.profiles.VitalspanelCodeableConcept1Coding1
	 * @generated
	 */
	EClass getVitalspanelCodeableConcept1Coding1();

	/**
	 * Returns the meta object for class '{@link fhiRCore.profiles.Synthesis <em>Synthesis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Synthesis</em>'.
	 * @see fhiRCore.profiles.Synthesis
	 * @generated
	 */
	EClass getSynthesis();

	/**
	 * Returns the meta object for class '{@link fhiRCore.profiles.SubstanceDefinition <em>Substance Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Substance Definition</em>'.
	 * @see fhiRCore.profiles.SubstanceDefinition
	 * @generated
	 */
	EClass getSubstanceDefinition();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.profiles.SubstanceDefinition#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Identifier</em>'.
	 * @see fhiRCore.profiles.SubstanceDefinition#getIdentifier()
	 * @see #getSubstanceDefinition()
	 * @generated
	 */
	EReference getSubstanceDefinition_Identifier();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.profiles.SubstanceDefinition#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see fhiRCore.profiles.SubstanceDefinition#getType()
	 * @see #getSubstanceDefinition()
	 * @generated
	 */
	EReference getSubstanceDefinition_Type();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.profiles.SubstanceDefinition#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Status</em>'.
	 * @see fhiRCore.profiles.SubstanceDefinition#getStatus()
	 * @see #getSubstanceDefinition()
	 * @generated
	 */
	EReference getSubstanceDefinition_Status();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.profiles.SubstanceDefinition#getDomain <em>Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Domain</em>'.
	 * @see fhiRCore.profiles.SubstanceDefinition#getDomain()
	 * @see #getSubstanceDefinition()
	 * @generated
	 */
	EReference getSubstanceDefinition_Domain();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.profiles.SubstanceDefinition#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see fhiRCore.profiles.SubstanceDefinition#getDescription()
	 * @see #getSubstanceDefinition()
	 * @generated
	 */
	EReference getSubstanceDefinition_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link fhiRCore.profiles.SubstanceDefinition#getSources <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Source</em>'.
	 * @see fhiRCore.profiles.SubstanceDefinition#getSources()
	 * @see #getSubstanceDefinition()
	 * @generated
	 */
	EReference getSubstanceDefinition_Source();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.profiles.SubstanceDefinition#getComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Comment</em>'.
	 * @see fhiRCore.profiles.SubstanceDefinition#getComment()
	 * @see #getSubstanceDefinition()
	 * @generated
	 */
	EReference getSubstanceDefinition_Comment();

	/**
	 * Returns the meta object for the containment reference list '{@link fhiRCore.profiles.SubstanceDefinition#getMoieties <em>Moiety</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Moiety</em>'.
	 * @see fhiRCore.profiles.SubstanceDefinition#getMoieties()
	 * @see #getSubstanceDefinition()
	 * @generated
	 */
	EReference getSubstanceDefinition_Moiety();

	/**
	 * Returns the meta object for the containment reference list '{@link fhiRCore.profiles.SubstanceDefinition#getProperties <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Property</em>'.
	 * @see fhiRCore.profiles.SubstanceDefinition#getProperties()
	 * @see #getSubstanceDefinition()
	 * @generated
	 */
	EReference getSubstanceDefinition_Property();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.profiles.SubstanceDefinition#getReferenceInformation <em>Reference Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Reference Information</em>'.
	 * @see fhiRCore.profiles.SubstanceDefinition#getReferenceInformation()
	 * @see #getSubstanceDefinition()
	 * @generated
	 */
	EReference getSubstanceDefinition_ReferenceInformation();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.profiles.SubstanceDefinition#getStructure <em>Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Structure</em>'.
	 * @see fhiRCore.profiles.SubstanceDefinition#getStructure()
	 * @see #getSubstanceDefinition()
	 * @generated
	 */
	EReference getSubstanceDefinition_Structure();

	/**
	 * Returns the meta object for the containment reference list '{@link fhiRCore.profiles.SubstanceDefinition#getCodes <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Code</em>'.
	 * @see fhiRCore.profiles.SubstanceDefinition#getCodes()
	 * @see #getSubstanceDefinition()
	 * @generated
	 */
	EReference getSubstanceDefinition_Code();

	/**
	 * Returns the meta object for the containment reference list '{@link fhiRCore.profiles.SubstanceDefinition#getNames <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Name</em>'.
	 * @see fhiRCore.profiles.SubstanceDefinition#getNames()
	 * @see #getSubstanceDefinition()
	 * @generated
	 */
	EReference getSubstanceDefinition_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link fhiRCore.profiles.SubstanceDefinition#getMolecularWeights <em>Molecular Weight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Molecular Weight</em>'.
	 * @see fhiRCore.profiles.SubstanceDefinition#getMolecularWeights()
	 * @see #getSubstanceDefinition()
	 * @generated
	 */
	EReference getSubstanceDefinition_MolecularWeight();

	/**
	 * Returns the meta object for the containment reference list '{@link fhiRCore.profiles.SubstanceDefinition#getRelationships <em>Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Relationship</em>'.
	 * @see fhiRCore.profiles.SubstanceDefinition#getRelationships()
	 * @see #getSubstanceDefinition()
	 * @generated
	 */
	EReference getSubstanceDefinition_Relationship();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.profiles.SubstanceDefinition#getNucleicAcid <em>Nucleic Acid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Nucleic Acid</em>'.
	 * @see fhiRCore.profiles.SubstanceDefinition#getNucleicAcid()
	 * @see #getSubstanceDefinition()
	 * @generated
	 */
	EReference getSubstanceDefinition_NucleicAcid();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.profiles.SubstanceDefinition#getPolymer <em>Polymer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Polymer</em>'.
	 * @see fhiRCore.profiles.SubstanceDefinition#getPolymer()
	 * @see #getSubstanceDefinition()
	 * @generated
	 */
	EReference getSubstanceDefinition_Polymer();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.profiles.SubstanceDefinition#getProtein <em>Protein</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Protein</em>'.
	 * @see fhiRCore.profiles.SubstanceDefinition#getProtein()
	 * @see #getSubstanceDefinition()
	 * @generated
	 */
	EReference getSubstanceDefinition_Protein();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.profiles.SubstanceDefinition#getSourceMaterial <em>Source Material</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Source Material</em>'.
	 * @see fhiRCore.profiles.SubstanceDefinition#getSourceMaterial()
	 * @see #getSubstanceDefinition()
	 * @generated
	 */
	EReference getSubstanceDefinition_SourceMaterial();

	/**
	 * Returns the meta object for class '{@link fhiRCore.profiles.SubstanceDefinitionMoiety <em>Substance Definition Moiety</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Substance Definition Moiety</em>'.
	 * @see fhiRCore.profiles.SubstanceDefinitionMoiety
	 * @generated
	 */
	EClass getSubstanceDefinitionMoiety();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.profiles.SubstanceDefinitionMoiety#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Role</em>'.
	 * @see fhiRCore.profiles.SubstanceDefinitionMoiety#getRole()
	 * @see #getSubstanceDefinitionMoiety()
	 * @generated
	 */
	EReference getSubstanceDefinitionMoiety_Role();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.profiles.SubstanceDefinitionMoiety#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Identifier</em>'.
	 * @see fhiRCore.profiles.SubstanceDefinitionMoiety#getIdentifier()
	 * @see #getSubstanceDefinitionMoiety()
	 * @generated
	 */
	EReference getSubstanceDefinitionMoiety_Identifier();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.profiles.SubstanceDefinitionMoiety#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Name</em>'.
	 * @see fhiRCore.profiles.SubstanceDefinitionMoiety#getName()
	 * @see #getSubstanceDefinitionMoiety()
	 * @generated
	 */
	EReference getSubstanceDefinitionMoiety_Name();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.profiles.SubstanceDefinitionMoiety#getStereochemistry <em>Stereochemistry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Stereochemistry</em>'.
	 * @see fhiRCore.profiles.SubstanceDefinitionMoiety#getStereochemistry()
	 * @see #getSubstanceDefinitionMoiety()
	 * @generated
	 */
	EReference getSubstanceDefinitionMoiety_Stereochemistry();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.profiles.SubstanceDefinitionMoiety#getOpticalActivity <em>Optical Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Optical Activity</em>'.
	 * @see fhiRCore.profiles.SubstanceDefinitionMoiety#getOpticalActivity()
	 * @see #getSubstanceDefinitionMoiety()
	 * @generated
	 */
	EReference getSubstanceDefinitionMoiety_OpticalActivity();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.profiles.SubstanceDefinitionMoiety#getMolecularFormula <em>Molecular Formula</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Molecular Formula</em>'.
	 * @see fhiRCore.profiles.SubstanceDefinitionMoiety#getMolecularFormula()
	 * @see #getSubstanceDefinitionMoiety()
	 * @generated
	 */
	EReference getSubstanceDefinitionMoiety_MolecularFormula();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.profiles.SubstanceDefinitionMoiety#getAmountx <em>Amountx</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Amountx</em>'.
	 * @see fhiRCore.profiles.SubstanceDefinitionMoiety#getAmountx()
	 * @see #getSubstanceDefinitionMoiety()
	 * @generated
	 */
	EReference getSubstanceDefinitionMoiety_Amountx();

	/**
	 * Returns the meta object for class '{@link fhiRCore.profiles.SubstanceDefinitionProperty <em>Substance Definition Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Substance Definition Property</em>'.
	 * @see fhiRCore.profiles.SubstanceDefinitionProperty
	 * @generated
	 */
	EClass getSubstanceDefinitionProperty();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.profiles.SubstanceDefinitionProperty#getCategory <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Category</em>'.
	 * @see fhiRCore.profiles.SubstanceDefinitionProperty#getCategory()
	 * @see #getSubstanceDefinitionProperty()
	 * @generated
	 */
	EReference getSubstanceDefinitionProperty_Category();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.profiles.SubstanceDefinitionProperty#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Code</em>'.
	 * @see fhiRCore.profiles.SubstanceDefinitionProperty#getCode()
	 * @see #getSubstanceDefinitionProperty()
	 * @generated
	 */
	EReference getSubstanceDefinitionProperty_Code();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.profiles.SubstanceDefinitionProperty#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Parameters</em>'.
	 * @see fhiRCore.profiles.SubstanceDefinitionProperty#getParameters()
	 * @see #getSubstanceDefinitionProperty()
	 * @generated
	 */
	EReference getSubstanceDefinitionProperty_Parameters();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.profiles.SubstanceDefinitionProperty#getDefiningSubstancex <em>Defining Substancex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Defining Substancex</em>'.
	 * @see fhiRCore.profiles.SubstanceDefinitionProperty#getDefiningSubstancex()
	 * @see #getSubstanceDefinitionProperty()
	 * @generated
	 */
	EReference getSubstanceDefinitionProperty_DefiningSubstancex();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.profiles.SubstanceDefinitionProperty#getAmountx <em>Amountx</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Amountx</em>'.
	 * @see fhiRCore.profiles.SubstanceDefinitionProperty#getAmountx()
	 * @see #getSubstanceDefinitionProperty()
	 * @generated
	 */
	EReference getSubstanceDefinitionProperty_Amountx();

	/**
	 * Returns the meta object for class '{@link fhiRCore.profiles.SubstanceDefinitionStructure <em>Substance Definition Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Substance Definition Structure</em>'.
	 * @see fhiRCore.profiles.SubstanceDefinitionStructure
	 * @generated
	 */
	EClass getSubstanceDefinitionStructure();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.profiles.SubstanceDefinitionStructure#getStereochemistry <em>Stereochemistry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Stereochemistry</em>'.
	 * @see fhiRCore.profiles.SubstanceDefinitionStructure#getStereochemistry()
	 * @see #getSubstanceDefinitionStructure()
	 * @generated
	 */
	EReference getSubstanceDefinitionStructure_Stereochemistry();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.profiles.SubstanceDefinitionStructure#getOpticalActivity <em>Optical Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Optical Activity</em>'.
	 * @see fhiRCore.profiles.SubstanceDefinitionStructure#getOpticalActivity()
	 * @see #getSubstanceDefinitionStructure()
	 * @generated
	 */
	EReference getSubstanceDefinitionStructure_OpticalActivity();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.profiles.SubstanceDefinitionStructure#getMolecularFormula <em>Molecular Formula</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Molecular Formula</em>'.
	 * @see fhiRCore.profiles.SubstanceDefinitionStructure#getMolecularFormula()
	 * @see #getSubstanceDefinitionStructure()
	 * @generated
	 */
	EReference getSubstanceDefinitionStructure_MolecularFormula();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.profiles.SubstanceDefinitionStructure#getMolecularFormulaByMoiety <em>Molecular Formula By Moiety</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Molecular Formula By Moiety</em>'.
	 * @see fhiRCore.profiles.SubstanceDefinitionStructure#getMolecularFormulaByMoiety()
	 * @see #getSubstanceDefinitionStructure()
	 * @generated
	 */
	EReference getSubstanceDefinitionStructure_MolecularFormulaByMoiety();

	/**
	 * Returns the meta object for the containment reference list '{@link fhiRCore.profiles.SubstanceDefinitionStructure#getIsotopes <em>Isotope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Isotope</em>'.
	 * @see fhiRCore.profiles.SubstanceDefinitionStructure#getIsotopes()
	 * @see #getSubstanceDefinitionStructure()
	 * @generated
	 */
	EReference getSubstanceDefinitionStructure_Isotope();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.profiles.SubstanceDefinitionStructure#getMolecularWeight <em>Molecular Weight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Molecular Weight</em>'.
	 * @see fhiRCore.profiles.SubstanceDefinitionStructure#getMolecularWeight()
	 * @see #getSubstanceDefinitionStructure()
	 * @generated
	 */
	EReference getSubstanceDefinitionStructure_MolecularWeight();

	/**
	 * Returns the meta object for the containment reference list '{@link fhiRCore.profiles.SubstanceDefinitionStructure#getSources <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Source</em>'.
	 * @see fhiRCore.profiles.SubstanceDefinitionStructure#getSources()
	 * @see #getSubstanceDefinitionStructure()
	 * @generated
	 */
	EReference getSubstanceDefinitionStructure_Source();

	/**
	 * Returns the meta object for the containment reference list '{@link fhiRCore.profiles.SubstanceDefinitionStructure#getRepresentations <em>Representation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Representation</em>'.
	 * @see fhiRCore.profiles.SubstanceDefinitionStructure#getRepresentations()
	 * @see #getSubstanceDefinitionStructure()
	 * @generated
	 */
	EReference getSubstanceDefinitionStructure_Representation();

	/**
	 * Returns the meta object for class '{@link fhiRCore.profiles.SubstanceDefinitionStructureIsotope <em>Substance Definition Structure Isotope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Substance Definition Structure Isotope</em>'.
	 * @see fhiRCore.profiles.SubstanceDefinitionStructureIsotope
	 * @generated
	 */
	EClass getSubstanceDefinitionStructureIsotope();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.profiles.SubstanceDefinitionStructureIsotope#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Identifier</em>'.
	 * @see fhiRCore.profiles.SubstanceDefinitionStructureIsotope#getIdentifier()
	 * @see #getSubstanceDefinitionStructureIsotope()
	 * @generated
	 */
	EReference getSubstanceDefinitionStructureIsotope_Identifier();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.profiles.SubstanceDefinitionStructureIsotope#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Name</em>'.
	 * @see fhiRCore.profiles.SubstanceDefinitionStructureIsotope#getName()
	 * @see #getSubstanceDefinitionStructureIsotope()
	 * @generated
	 */
	EReference getSubstanceDefinitionStructureIsotope_Name();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.profiles.SubstanceDefinitionStructureIsotope#getSubstitution <em>Substitution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Substitution</em>'.
	 * @see fhiRCore.profiles.SubstanceDefinitionStructureIsotope#getSubstitution()
	 * @see #getSubstanceDefinitionStructureIsotope()
	 * @generated
	 */
	EReference getSubstanceDefinitionStructureIsotope_Substitution();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.profiles.SubstanceDefinitionStructureIsotope#getHalfLife <em>Half Life</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Half Life</em>'.
	 * @see fhiRCore.profiles.SubstanceDefinitionStructureIsotope#getHalfLife()
	 * @see #getSubstanceDefinitionStructureIsotope()
	 * @generated
	 */
	EReference getSubstanceDefinitionStructureIsotope_HalfLife();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.profiles.SubstanceDefinitionStructureIsotope#getMolecularWeight <em>Molecular Weight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Molecular Weight</em>'.
	 * @see fhiRCore.profiles.SubstanceDefinitionStructureIsotope#getMolecularWeight()
	 * @see #getSubstanceDefinitionStructureIsotope()
	 * @generated
	 */
	EReference getSubstanceDefinitionStructureIsotope_MolecularWeight();

	/**
	 * Returns the meta object for class '{@link fhiRCore.profiles.SubstanceDefinitionStructureIsotopeMolecularWeight <em>Substance Definition Structure Isotope Molecular Weight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Substance Definition Structure Isotope Molecular Weight</em>'.
	 * @see fhiRCore.profiles.SubstanceDefinitionStructureIsotopeMolecularWeight
	 * @generated
	 */
	EClass getSubstanceDefinitionStructureIsotopeMolecularWeight();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.profiles.SubstanceDefinitionStructureIsotopeMolecularWeight#getMethod <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Method</em>'.
	 * @see fhiRCore.profiles.SubstanceDefinitionStructureIsotopeMolecularWeight#getMethod()
	 * @see #getSubstanceDefinitionStructureIsotopeMolecularWeight()
	 * @generated
	 */
	EReference getSubstanceDefinitionStructureIsotopeMolecularWeight_Method();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.profiles.SubstanceDefinitionStructureIsotopeMolecularWeight#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see fhiRCore.profiles.SubstanceDefinitionStructureIsotopeMolecularWeight#getType()
	 * @see #getSubstanceDefinitionStructureIsotopeMolecularWeight()
	 * @generated
	 */
	EReference getSubstanceDefinitionStructureIsotopeMolecularWeight_Type();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.profiles.SubstanceDefinitionStructureIsotopeMolecularWeight#getAmount <em>Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Amount</em>'.
	 * @see fhiRCore.profiles.SubstanceDefinitionStructureIsotopeMolecularWeight#getAmount()
	 * @see #getSubstanceDefinitionStructureIsotopeMolecularWeight()
	 * @generated
	 */
	EReference getSubstanceDefinitionStructureIsotopeMolecularWeight_Amount();

	/**
	 * Returns the meta object for class '{@link fhiRCore.profiles.SubstanceDefinitionStructureRepresentation <em>Substance Definition Structure Representation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Substance Definition Structure Representation</em>'.
	 * @see fhiRCore.profiles.SubstanceDefinitionStructureRepresentation
	 * @generated
	 */
	EClass getSubstanceDefinitionStructureRepresentation();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.profiles.SubstanceDefinitionStructureRepresentation#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see fhiRCore.profiles.SubstanceDefinitionStructureRepresentation#getType()
	 * @see #getSubstanceDefinitionStructureRepresentation()
	 * @generated
	 */
	EReference getSubstanceDefinitionStructureRepresentation_Type();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.profiles.SubstanceDefinitionStructureRepresentation#getRepresentation <em>Representation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Representation</em>'.
	 * @see fhiRCore.profiles.SubstanceDefinitionStructureRepresentation#getRepresentation()
	 * @see #getSubstanceDefinitionStructureRepresentation()
	 * @generated
	 */
	EReference getSubstanceDefinitionStructureRepresentation_Representation();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.profiles.SubstanceDefinitionStructureRepresentation#getAttachment <em>Attachment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Attachment</em>'.
	 * @see fhiRCore.profiles.SubstanceDefinitionStructureRepresentation#getAttachment()
	 * @see #getSubstanceDefinitionStructureRepresentation()
	 * @generated
	 */
	EReference getSubstanceDefinitionStructureRepresentation_Attachment();

	/**
	 * Returns the meta object for class '{@link fhiRCore.profiles.SubstanceDefinitionCode <em>Substance Definition Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Substance Definition Code</em>'.
	 * @see fhiRCore.profiles.SubstanceDefinitionCode
	 * @generated
	 */
	EClass getSubstanceDefinitionCode();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.profiles.SubstanceDefinitionCode#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Code</em>'.
	 * @see fhiRCore.profiles.SubstanceDefinitionCode#getCode()
	 * @see #getSubstanceDefinitionCode()
	 * @generated
	 */
	EReference getSubstanceDefinitionCode_Code();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.profiles.SubstanceDefinitionCode#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Status</em>'.
	 * @see fhiRCore.profiles.SubstanceDefinitionCode#getStatus()
	 * @see #getSubstanceDefinitionCode()
	 * @generated
	 */
	EReference getSubstanceDefinitionCode_Status();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.profiles.SubstanceDefinitionCode#getStatusDate <em>Status Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Status Date</em>'.
	 * @see fhiRCore.profiles.SubstanceDefinitionCode#getStatusDate()
	 * @see #getSubstanceDefinitionCode()
	 * @generated
	 */
	EReference getSubstanceDefinitionCode_StatusDate();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.profiles.SubstanceDefinitionCode#getComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Comment</em>'.
	 * @see fhiRCore.profiles.SubstanceDefinitionCode#getComment()
	 * @see #getSubstanceDefinitionCode()
	 * @generated
	 */
	EReference getSubstanceDefinitionCode_Comment();

	/**
	 * Returns the meta object for the containment reference list '{@link fhiRCore.profiles.SubstanceDefinitionCode#getSources <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Source</em>'.
	 * @see fhiRCore.profiles.SubstanceDefinitionCode#getSources()
	 * @see #getSubstanceDefinitionCode()
	 * @generated
	 */
	EReference getSubstanceDefinitionCode_Source();

	/**
	 * Returns the meta object for class '{@link fhiRCore.profiles.SubstanceDefinitionName <em>Substance Definition Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Substance Definition Name</em>'.
	 * @see fhiRCore.profiles.SubstanceDefinitionName
	 * @generated
	 */
	EClass getSubstanceDefinitionName();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.profiles.SubstanceDefinitionName#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Name</em>'.
	 * @see fhiRCore.profiles.SubstanceDefinitionName#getName()
	 * @see #getSubstanceDefinitionName()
	 * @generated
	 */
	EReference getSubstanceDefinitionName_Name();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.profiles.SubstanceDefinitionName#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see fhiRCore.profiles.SubstanceDefinitionName#getType()
	 * @see #getSubstanceDefinitionName()
	 * @generated
	 */
	EReference getSubstanceDefinitionName_Type();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.profiles.SubstanceDefinitionName#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Status</em>'.
	 * @see fhiRCore.profiles.SubstanceDefinitionName#getStatus()
	 * @see #getSubstanceDefinitionName()
	 * @generated
	 */
	EReference getSubstanceDefinitionName_Status();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.profiles.SubstanceDefinitionName#getPreferred <em>Preferred</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Preferred</em>'.
	 * @see fhiRCore.profiles.SubstanceDefinitionName#getPreferred()
	 * @see #getSubstanceDefinitionName()
	 * @generated
	 */
	EReference getSubstanceDefinitionName_Preferred();

	/**
	 * Returns the meta object for the containment reference list '{@link fhiRCore.profiles.SubstanceDefinitionName#getLanguages <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Language</em>'.
	 * @see fhiRCore.profiles.SubstanceDefinitionName#getLanguages()
	 * @see #getSubstanceDefinitionName()
	 * @generated
	 */
	EReference getSubstanceDefinitionName_Language();

	/**
	 * Returns the meta object for the containment reference list '{@link fhiRCore.profiles.SubstanceDefinitionName#getDomains <em>Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Domain</em>'.
	 * @see fhiRCore.profiles.SubstanceDefinitionName#getDomains()
	 * @see #getSubstanceDefinitionName()
	 * @generated
	 */
	EReference getSubstanceDefinitionName_Domain();

	/**
	 * Returns the meta object for the containment reference list '{@link fhiRCore.profiles.SubstanceDefinitionName#getJurisdictions <em>Jurisdiction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Jurisdiction</em>'.
	 * @see fhiRCore.profiles.SubstanceDefinitionName#getJurisdictions()
	 * @see #getSubstanceDefinitionName()
	 * @generated
	 */
	EReference getSubstanceDefinitionName_Jurisdiction();

	/**
	 * Returns the meta object for the containment reference list '{@link fhiRCore.profiles.SubstanceDefinitionName#getSynonyms <em>Synonym</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Synonym</em>'.
	 * @see fhiRCore.profiles.SubstanceDefinitionName#getSynonyms()
	 * @see #getSubstanceDefinitionName()
	 * @generated
	 */
	EReference getSubstanceDefinitionName_Synonym();

	/**
	 * Returns the meta object for the containment reference list '{@link fhiRCore.profiles.SubstanceDefinitionName#getTranslations <em>Translation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Translation</em>'.
	 * @see fhiRCore.profiles.SubstanceDefinitionName#getTranslations()
	 * @see #getSubstanceDefinitionName()
	 * @generated
	 */
	EReference getSubstanceDefinitionName_Translation();

	/**
	 * Returns the meta object for the containment reference list '{@link fhiRCore.profiles.SubstanceDefinitionName#getOfficials <em>Official</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Official</em>'.
	 * @see fhiRCore.profiles.SubstanceDefinitionName#getOfficials()
	 * @see #getSubstanceDefinitionName()
	 * @generated
	 */
	EReference getSubstanceDefinitionName_Official();

	/**
	 * Returns the meta object for the containment reference list '{@link fhiRCore.profiles.SubstanceDefinitionName#getSources <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Source</em>'.
	 * @see fhiRCore.profiles.SubstanceDefinitionName#getSources()
	 * @see #getSubstanceDefinitionName()
	 * @generated
	 */
	EReference getSubstanceDefinitionName_Source();

	/**
	 * Returns the meta object for class '{@link fhiRCore.profiles.SubstanceDefinitionNameOfficial <em>Substance Definition Name Official</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Substance Definition Name Official</em>'.
	 * @see fhiRCore.profiles.SubstanceDefinitionNameOfficial
	 * @generated
	 */
	EClass getSubstanceDefinitionNameOfficial();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.profiles.SubstanceDefinitionNameOfficial#getAuthority <em>Authority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Authority</em>'.
	 * @see fhiRCore.profiles.SubstanceDefinitionNameOfficial#getAuthority()
	 * @see #getSubstanceDefinitionNameOfficial()
	 * @generated
	 */
	EReference getSubstanceDefinitionNameOfficial_Authority();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.profiles.SubstanceDefinitionNameOfficial#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Status</em>'.
	 * @see fhiRCore.profiles.SubstanceDefinitionNameOfficial#getStatus()
	 * @see #getSubstanceDefinitionNameOfficial()
	 * @generated
	 */
	EReference getSubstanceDefinitionNameOfficial_Status();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.profiles.SubstanceDefinitionNameOfficial#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Date</em>'.
	 * @see fhiRCore.profiles.SubstanceDefinitionNameOfficial#getDate()
	 * @see #getSubstanceDefinitionNameOfficial()
	 * @generated
	 */
	EReference getSubstanceDefinitionNameOfficial_Date();

	/**
	 * Returns the meta object for class '{@link fhiRCore.profiles.SubstanceDefinitionRelationship <em>Substance Definition Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Substance Definition Relationship</em>'.
	 * @see fhiRCore.profiles.SubstanceDefinitionRelationship
	 * @generated
	 */
	EClass getSubstanceDefinitionRelationship();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.profiles.SubstanceDefinitionRelationship#getSubstancex <em>Substancex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Substancex</em>'.
	 * @see fhiRCore.profiles.SubstanceDefinitionRelationship#getSubstancex()
	 * @see #getSubstanceDefinitionRelationship()
	 * @generated
	 */
	EReference getSubstanceDefinitionRelationship_Substancex();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.profiles.SubstanceDefinitionRelationship#getRelationship <em>Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Relationship</em>'.
	 * @see fhiRCore.profiles.SubstanceDefinitionRelationship#getRelationship()
	 * @see #getSubstanceDefinitionRelationship()
	 * @generated
	 */
	EReference getSubstanceDefinitionRelationship_Relationship();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.profiles.SubstanceDefinitionRelationship#getIsDefining <em>Is Defining</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Is Defining</em>'.
	 * @see fhiRCore.profiles.SubstanceDefinitionRelationship#getIsDefining()
	 * @see #getSubstanceDefinitionRelationship()
	 * @generated
	 */
	EReference getSubstanceDefinitionRelationship_IsDefining();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.profiles.SubstanceDefinitionRelationship#getAmountx <em>Amountx</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Amountx</em>'.
	 * @see fhiRCore.profiles.SubstanceDefinitionRelationship#getAmountx()
	 * @see #getSubstanceDefinitionRelationship()
	 * @generated
	 */
	EReference getSubstanceDefinitionRelationship_Amountx();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.profiles.SubstanceDefinitionRelationship#getAmountRatioLowLimit <em>Amount Ratio Low Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Amount Ratio Low Limit</em>'.
	 * @see fhiRCore.profiles.SubstanceDefinitionRelationship#getAmountRatioLowLimit()
	 * @see #getSubstanceDefinitionRelationship()
	 * @generated
	 */
	EReference getSubstanceDefinitionRelationship_AmountRatioLowLimit();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.profiles.SubstanceDefinitionRelationship#getAmountType <em>Amount Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Amount Type</em>'.
	 * @see fhiRCore.profiles.SubstanceDefinitionRelationship#getAmountType()
	 * @see #getSubstanceDefinitionRelationship()
	 * @generated
	 */
	EReference getSubstanceDefinitionRelationship_AmountType();

	/**
	 * Returns the meta object for the containment reference list '{@link fhiRCore.profiles.SubstanceDefinitionRelationship#getSources <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Source</em>'.
	 * @see fhiRCore.profiles.SubstanceDefinitionRelationship#getSources()
	 * @see #getSubstanceDefinitionRelationship()
	 * @generated
	 */
	EReference getSubstanceDefinitionRelationship_Source();

	/**
	 * Returns the meta object for class '{@link fhiRCore.profiles.Provenancerelevanthistory <em>Provenancerelevanthistory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Provenancerelevanthistory</em>'.
	 * @see fhiRCore.profiles.Provenancerelevanthistory
	 * @generated
	 */
	EClass getProvenancerelevanthistory();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.profiles.Provenancerelevanthistory#getAuthor <em>Author</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Author</em>'.
	 * @see fhiRCore.profiles.Provenancerelevanthistory#getAuthor()
	 * @see #getProvenancerelevanthistory()
	 * @generated
	 */
	EReference getProvenancerelevanthistory_Author();

	/**
	 * Returns the meta object for class '{@link fhiRCore.profiles.ProvenancerelevanthistoryAgent1 <em>Provenancerelevanthistory Agent1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Provenancerelevanthistory Agent1</em>'.
	 * @see fhiRCore.profiles.ProvenancerelevanthistoryAgent1
	 * @generated
	 */
	EClass getProvenancerelevanthistoryAgent1();

	/**
	 * Returns the meta object for class '{@link fhiRCore.profiles.Catalog <em>Catalog</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Catalog</em>'.
	 * @see fhiRCore.profiles.Catalog
	 * @generated
	 */
	EClass getCatalog();

	/**
	 * Returns the meta object for class '{@link fhiRCore.profiles.CatalogSection1 <em>Catalog Section1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Catalog Section1</em>'.
	 * @see fhiRCore.profiles.CatalogSection1
	 * @generated
	 */
	EClass getCatalogSection1();

	/**
	 * Returns the meta object for class '{@link fhiRCore.profiles.Bodyweight <em>Bodyweight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bodyweight</em>'.
	 * @see fhiRCore.profiles.Bodyweight
	 * @generated
	 */
	EClass getBodyweight();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.profiles.Bodyweight#getValueQuantity <em>Value Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value Quantity</em>'.
	 * @see fhiRCore.profiles.Bodyweight#getValueQuantity()
	 * @see #getBodyweight()
	 * @generated
	 */
	EReference getBodyweight_ValueQuantity();

	/**
	 * Returns the meta object for class '{@link fhiRCore.profiles.BodyweightCodeableConcept1 <em>Bodyweight Codeable Concept1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bodyweight Codeable Concept1</em>'.
	 * @see fhiRCore.profiles.BodyweightCodeableConcept1
	 * @generated
	 */
	EClass getBodyweightCodeableConcept1();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.profiles.BodyweightCodeableConcept1#getBodyWeightCode <em>Body Weight Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Body Weight Code</em>'.
	 * @see fhiRCore.profiles.BodyweightCodeableConcept1#getBodyWeightCode()
	 * @see #getBodyweightCodeableConcept1()
	 * @generated
	 */
	EReference getBodyweightCodeableConcept1_BodyWeightCode();

	/**
	 * Returns the meta object for class '{@link fhiRCore.profiles.BodyweightCodeableConcept1Coding1 <em>Bodyweight Codeable Concept1 Coding1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bodyweight Codeable Concept1 Coding1</em>'.
	 * @see fhiRCore.profiles.BodyweightCodeableConcept1Coding1
	 * @generated
	 */
	EClass getBodyweightCodeableConcept1Coding1();

	/**
	 * Returns the meta object for class '{@link fhiRCore.profiles.BodyweightQuantity1 <em>Bodyweight Quantity1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bodyweight Quantity1</em>'.
	 * @see fhiRCore.profiles.BodyweightQuantity1
	 * @generated
	 */
	EClass getBodyweightQuantity1();

	/**
	 * Returns the meta object for class '{@link fhiRCore.profiles.Bp <em>Bp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bp</em>'.
	 * @see fhiRCore.profiles.Bp
	 * @generated
	 */
	EClass getBp();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.profiles.Bp#getSystolicBp <em>Systolic Bp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Systolic Bp</em>'.
	 * @see fhiRCore.profiles.Bp#getSystolicBp()
	 * @see #getBp()
	 * @generated
	 */
	EReference getBp_SystolicBp();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.profiles.Bp#getDiastolicBp <em>Diastolic Bp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Diastolic Bp</em>'.
	 * @see fhiRCore.profiles.Bp#getDiastolicBp()
	 * @see #getBp()
	 * @generated
	 */
	EReference getBp_DiastolicBp();

	/**
	 * Returns the meta object for class '{@link fhiRCore.profiles.BpCodeableConcept1 <em>Bp Codeable Concept1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bp Codeable Concept1</em>'.
	 * @see fhiRCore.profiles.BpCodeableConcept1
	 * @generated
	 */
	EClass getBpCodeableConcept1();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.profiles.BpCodeableConcept1#getBpCode <em>Bp Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bp Code</em>'.
	 * @see fhiRCore.profiles.BpCodeableConcept1#getBpCode()
	 * @see #getBpCodeableConcept1()
	 * @generated
	 */
	EReference getBpCodeableConcept1_BpCode();

	/**
	 * Returns the meta object for class '{@link fhiRCore.profiles.BpCodeableConcept1Coding1 <em>Bp Codeable Concept1 Coding1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bp Codeable Concept1 Coding1</em>'.
	 * @see fhiRCore.profiles.BpCodeableConcept1Coding1
	 * @generated
	 */
	EClass getBpCodeableConcept1Coding1();

	/**
	 * Returns the meta object for class '{@link fhiRCore.profiles.BpComponent11 <em>Bp Component11</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bp Component11</em>'.
	 * @see fhiRCore.profiles.BpComponent11
	 * @generated
	 */
	EClass getBpComponent11();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.profiles.BpComponent11#getValueQuantity <em>Value Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value Quantity</em>'.
	 * @see fhiRCore.profiles.BpComponent11#getValueQuantity()
	 * @see #getBpComponent11()
	 * @generated
	 */
	EReference getBpComponent11_ValueQuantity();

	/**
	 * Returns the meta object for class '{@link fhiRCore.profiles.BpComponent11CodeableConcept1 <em>Bp Component11 Codeable Concept1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bp Component11 Codeable Concept1</em>'.
	 * @see fhiRCore.profiles.BpComponent11CodeableConcept1
	 * @generated
	 */
	EClass getBpComponent11CodeableConcept1();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.profiles.BpComponent11CodeableConcept1#getSbpCode <em>Sbp Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sbp Code</em>'.
	 * @see fhiRCore.profiles.BpComponent11CodeableConcept1#getSbpCode()
	 * @see #getBpComponent11CodeableConcept1()
	 * @generated
	 */
	EReference getBpComponent11CodeableConcept1_SbpCode();

	/**
	 * Returns the meta object for class '{@link fhiRCore.profiles.BpComponent11CodeableConcept1Coding1 <em>Bp Component11 Codeable Concept1 Coding1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bp Component11 Codeable Concept1 Coding1</em>'.
	 * @see fhiRCore.profiles.BpComponent11CodeableConcept1Coding1
	 * @generated
	 */
	EClass getBpComponent11CodeableConcept1Coding1();

	/**
	 * Returns the meta object for class '{@link fhiRCore.profiles.BpComponent11Quantity1 <em>Bp Component11 Quantity1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bp Component11 Quantity1</em>'.
	 * @see fhiRCore.profiles.BpComponent11Quantity1
	 * @generated
	 */
	EClass getBpComponent11Quantity1();

	/**
	 * Returns the meta object for class '{@link fhiRCore.profiles.BpComponent12 <em>Bp Component12</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bp Component12</em>'.
	 * @see fhiRCore.profiles.BpComponent12
	 * @generated
	 */
	EClass getBpComponent12();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.profiles.BpComponent12#getValueQuantity <em>Value Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value Quantity</em>'.
	 * @see fhiRCore.profiles.BpComponent12#getValueQuantity()
	 * @see #getBpComponent12()
	 * @generated
	 */
	EReference getBpComponent12_ValueQuantity();

	/**
	 * Returns the meta object for class '{@link fhiRCore.profiles.BpComponent12CodeableConcept1 <em>Bp Component12 Codeable Concept1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bp Component12 Codeable Concept1</em>'.
	 * @see fhiRCore.profiles.BpComponent12CodeableConcept1
	 * @generated
	 */
	EClass getBpComponent12CodeableConcept1();

	/**
	 * Returns the meta object for the containment reference '{@link fhiRCore.profiles.BpComponent12CodeableConcept1#getDbpCode <em>Dbp Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Dbp Code</em>'.
	 * @see fhiRCore.profiles.BpComponent12CodeableConcept1#getDbpCode()
	 * @see #getBpComponent12CodeableConcept1()
	 * @generated
	 */
	EReference getBpComponent12CodeableConcept1_DbpCode();

	/**
	 * Returns the meta object for class '{@link fhiRCore.profiles.BpComponent12CodeableConcept1Coding1 <em>Bp Component12 Codeable Concept1 Coding1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bp Component12 Codeable Concept1 Coding1</em>'.
	 * @see fhiRCore.profiles.BpComponent12CodeableConcept1Coding1
	 * @generated
	 */
	EClass getBpComponent12CodeableConcept1Coding1();

	/**
	 * Returns the meta object for class '{@link fhiRCore.profiles.BpComponent12Quantity1 <em>Bp Component12 Quantity1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bp Component12 Quantity1</em>'.
	 * @see fhiRCore.profiles.BpComponent12Quantity1
	 * @generated
	 */
	EClass getBpComponent12Quantity1();

	/**
	 * Returns the meta object for class '{@link fhiRCore.profiles.Servicerequestgenetics <em>Servicerequestgenetics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Servicerequestgenetics</em>'.
	 * @see fhiRCore.profiles.Servicerequestgenetics
	 * @generated
	 */
	EClass getServicerequestgenetics();

	/**
	 * Returns the meta object for class '{@link fhiRCore.profiles.Shareablevalueset <em>Shareablevalueset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Shareablevalueset</em>'.
	 * @see fhiRCore.profiles.Shareablevalueset
	 * @generated
	 */
	EClass getShareablevalueset();

	/**
	 * Returns the meta object for class '{@link fhiRCore.profiles.Groupdefinition <em>Groupdefinition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Groupdefinition</em>'.
	 * @see fhiRCore.profiles.Groupdefinition
	 * @generated
	 */
	EClass getGroupdefinition();

	/**
	 * Returns the meta object for class '{@link fhiRCore.profiles.Actualgroup <em>Actualgroup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Actualgroup</em>'.
	 * @see fhiRCore.profiles.Actualgroup
	 * @generated
	 */
	EClass getActualgroup();

	/**
	 * Returns the meta object for class '{@link fhiRCore.profiles.Hlaresult <em>Hlaresult</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hlaresult</em>'.
	 * @see fhiRCore.profiles.Hlaresult
	 * @generated
	 */
	EClass getHlaresult();

	/**
	 * Returns the meta object for class '{@link fhiRCore.profiles.Cdshooksrequestgroup <em>Cdshooksrequestgroup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cdshooksrequestgroup</em>'.
	 * @see fhiRCore.profiles.Cdshooksrequestgroup
	 * @generated
	 */
	EClass getCdshooksrequestgroup();

	/**
	 * Returns the meta object for class '{@link fhiRCore.profiles.CdshooksrequestgroupAction1 <em>Cdshooksrequestgroup Action1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cdshooksrequestgroup Action1</em>'.
	 * @see fhiRCore.profiles.CdshooksrequestgroupAction1
	 * @generated
	 */
	EClass getCdshooksrequestgroupAction1();

	/**
	 * Returns the meta object for class '{@link fhiRCore.profiles.Observationgenetics <em>Observationgenetics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Observationgenetics</em>'.
	 * @see fhiRCore.profiles.Observationgenetics
	 * @generated
	 */
	EClass getObservationgenetics();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ProfilesFactory getProfilesFactory();

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
		 * The meta object literal for the '{@link fhiRCore.profiles.impl.PicoelementImpl <em>Picoelement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fhiRCore.profiles.impl.PicoelementImpl
		 * @see fhiRCore.profiles.impl.ProfilesPackageImpl#getPicoelement()
		 * @generated
		 */
		EClass PICOELEMENT = eINSTANCE.getPicoelement();

		/**
		 * The meta object literal for the '{@link fhiRCore.profiles.impl.PicoelementCharacteristic1Impl <em>Picoelement Characteristic1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fhiRCore.profiles.impl.PicoelementCharacteristic1Impl
		 * @see fhiRCore.profiles.impl.ProfilesPackageImpl#getPicoelementCharacteristic1()
		 * @generated
		 */
		EClass PICOELEMENT_CHARACTERISTIC1 = eINSTANCE.getPicoelementCharacteristic1();

		/**
		 * The meta object literal for the '{@link fhiRCore.profiles.impl.BmiImpl <em>Bmi</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fhiRCore.profiles.impl.BmiImpl
		 * @see fhiRCore.profiles.impl.ProfilesPackageImpl#getBmi()
		 * @generated
		 */
		EClass BMI = eINSTANCE.getBmi();

		/**
		 * The meta object literal for the '<em><b>Value Quantity</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BMI__VALUE_QUANTITY = eINSTANCE.getBmi_ValueQuantity();

		/**
		 * The meta object literal for the '{@link fhiRCore.profiles.impl.VitalsignsImpl <em>Vitalsigns</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fhiRCore.profiles.impl.VitalsignsImpl
		 * @see fhiRCore.profiles.impl.ProfilesPackageImpl#getVitalsigns()
		 * @generated
		 */
		EClass VITALSIGNS = eINSTANCE.getVitalsigns();

		/**
		 * The meta object literal for the '<em><b>Vs Cat</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VITALSIGNS__VS_CAT = eINSTANCE.getVitalsigns_VsCat();

		/**
		 * The meta object literal for the '{@link fhiRCore.profiles.impl.VitalsignsCodeableConcept1Impl <em>Vitalsigns Codeable Concept1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fhiRCore.profiles.impl.VitalsignsCodeableConcept1Impl
		 * @see fhiRCore.profiles.impl.ProfilesPackageImpl#getVitalsignsCodeableConcept1()
		 * @generated
		 */
		EClass VITALSIGNS_CODEABLE_CONCEPT1 = eINSTANCE.getVitalsignsCodeableConcept1();

		/**
		 * The meta object literal for the '{@link fhiRCore.profiles.impl.VitalsignsCodeableConcept1Coding1Impl <em>Vitalsigns Codeable Concept1 Coding1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fhiRCore.profiles.impl.VitalsignsCodeableConcept1Coding1Impl
		 * @see fhiRCore.profiles.impl.ProfilesPackageImpl#getVitalsignsCodeableConcept1Coding1()
		 * @generated
		 */
		EClass VITALSIGNS_CODEABLE_CONCEPT1_CODING1 = eINSTANCE.getVitalsignsCodeableConcept1Coding1();

		/**
		 * The meta object literal for the '{@link fhiRCore.profiles.impl.VitalsignsComponent1Impl <em>Vitalsigns Component1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fhiRCore.profiles.impl.VitalsignsComponent1Impl
		 * @see fhiRCore.profiles.impl.ProfilesPackageImpl#getVitalsignsComponent1()
		 * @generated
		 */
		EClass VITALSIGNS_COMPONENT1 = eINSTANCE.getVitalsignsComponent1();

		/**
		 * The meta object literal for the '{@link fhiRCore.profiles.impl.BmiCodeableConcept1Impl <em>Bmi Codeable Concept1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fhiRCore.profiles.impl.BmiCodeableConcept1Impl
		 * @see fhiRCore.profiles.impl.ProfilesPackageImpl#getBmiCodeableConcept1()
		 * @generated
		 */
		EClass BMI_CODEABLE_CONCEPT1 = eINSTANCE.getBmiCodeableConcept1();

		/**
		 * The meta object literal for the '<em><b>Bmi Code</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BMI_CODEABLE_CONCEPT1__BMI_CODE = eINSTANCE.getBmiCodeableConcept1_BmiCode();

		/**
		 * The meta object literal for the '{@link fhiRCore.profiles.impl.BmiCodeableConcept1Coding1Impl <em>Bmi Codeable Concept1 Coding1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fhiRCore.profiles.impl.BmiCodeableConcept1Coding1Impl
		 * @see fhiRCore.profiles.impl.ProfilesPackageImpl#getBmiCodeableConcept1Coding1()
		 * @generated
		 */
		EClass BMI_CODEABLE_CONCEPT1_CODING1 = eINSTANCE.getBmiCodeableConcept1Coding1();

		/**
		 * The meta object literal for the '{@link fhiRCore.profiles.impl.BmiQuantity1Impl <em>Bmi Quantity1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fhiRCore.profiles.impl.BmiQuantity1Impl
		 * @see fhiRCore.profiles.impl.ProfilesPackageImpl#getBmiQuantity1()
		 * @generated
		 */
		EClass BMI_QUANTITY1 = eINSTANCE.getBmiQuantity1();

		/**
		 * The meta object literal for the '{@link fhiRCore.profiles.impl.DevicemetricobservationImpl <em>Devicemetricobservation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fhiRCore.profiles.impl.DevicemetricobservationImpl
		 * @see fhiRCore.profiles.impl.ProfilesPackageImpl#getDevicemetricobservation()
		 * @generated
		 */
		EClass DEVICEMETRICOBSERVATION = eINSTANCE.getDevicemetricobservation();

		/**
		 * The meta object literal for the '<em><b>Effective Date Time</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICEMETRICOBSERVATION__EFFECTIVE_DATE_TIME = eINSTANCE.getDevicemetricobservation_EffectiveDateTime();

		/**
		 * The meta object literal for the '{@link fhiRCore.profiles.impl.CdshooksserviceplandefinitionImpl <em>Cdshooksserviceplandefinition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fhiRCore.profiles.impl.CdshooksserviceplandefinitionImpl
		 * @see fhiRCore.profiles.impl.ProfilesPackageImpl#getCdshooksserviceplandefinition()
		 * @generated
		 */
		EClass CDSHOOKSSERVICEPLANDEFINITION = eINSTANCE.getCdshooksserviceplandefinition();

		/**
		 * The meta object literal for the '{@link fhiRCore.profiles.impl.CdshooksserviceplandefinitionAction1Impl <em>Cdshooksserviceplandefinition Action1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fhiRCore.profiles.impl.CdshooksserviceplandefinitionAction1Impl
		 * @see fhiRCore.profiles.impl.ProfilesPackageImpl#getCdshooksserviceplandefinitionAction1()
		 * @generated
		 */
		EClass CDSHOOKSSERVICEPLANDEFINITION_ACTION1 = eINSTANCE.getCdshooksserviceplandefinitionAction1();

		/**
		 * The meta object literal for the '<em><b>Definitionx</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CDSHOOKSSERVICEPLANDEFINITION_ACTION1__DEFINITIONX = eINSTANCE.getCdshooksserviceplandefinitionAction1_Definitionx();

		/**
		 * The meta object literal for the '{@link fhiRCore.profiles.impl.CqfquestionnaireImpl <em>Cqfquestionnaire</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fhiRCore.profiles.impl.CqfquestionnaireImpl
		 * @see fhiRCore.profiles.impl.ProfilesPackageImpl#getCqfquestionnaire()
		 * @generated
		 */
		EClass CQFQUESTIONNAIRE = eINSTANCE.getCqfquestionnaire();

		/**
		 * The meta object literal for the '{@link fhiRCore.profiles.impl.ComputableplandefinitionImpl <em>Computableplandefinition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fhiRCore.profiles.impl.ComputableplandefinitionImpl
		 * @see fhiRCore.profiles.impl.ProfilesPackageImpl#getComputableplandefinition()
		 * @generated
		 */
		EClass COMPUTABLEPLANDEFINITION = eINSTANCE.getComputableplandefinition();

		/**
		 * The meta object literal for the '{@link fhiRCore.profiles.impl.ShareablelibraryImpl <em>Shareablelibrary</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fhiRCore.profiles.impl.ShareablelibraryImpl
		 * @see fhiRCore.profiles.impl.ProfilesPackageImpl#getShareablelibrary()
		 * @generated
		 */
		EClass SHAREABLELIBRARY = eINSTANCE.getShareablelibrary();

		/**
		 * The meta object literal for the '{@link fhiRCore.profiles.impl.CdshooksguidanceresponseImpl <em>Cdshooksguidanceresponse</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fhiRCore.profiles.impl.CdshooksguidanceresponseImpl
		 * @see fhiRCore.profiles.impl.ProfilesPackageImpl#getCdshooksguidanceresponse()
		 * @generated
		 */
		EClass CDSHOOKSGUIDANCERESPONSE = eINSTANCE.getCdshooksguidanceresponse();

		/**
		 * The meta object literal for the '<em><b>Module Uri</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CDSHOOKSGUIDANCERESPONSE__MODULE_URI = eINSTANCE.getCdshooksguidanceresponse_ModuleUri();

		/**
		 * The meta object literal for the '{@link fhiRCore.profiles.impl.ShareableactivitydefinitionImpl <em>Shareableactivitydefinition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fhiRCore.profiles.impl.ShareableactivitydefinitionImpl
		 * @see fhiRCore.profiles.impl.ProfilesPackageImpl#getShareableactivitydefinition()
		 * @generated
		 */
		EClass SHAREABLEACTIVITYDEFINITION = eINSTANCE.getShareableactivitydefinition();

		/**
		 * The meta object literal for the '{@link fhiRCore.profiles.impl.ShareablemeasureImpl <em>Shareablemeasure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fhiRCore.profiles.impl.ShareablemeasureImpl
		 * @see fhiRCore.profiles.impl.ProfilesPackageImpl#getShareablemeasure()
		 * @generated
		 */
		EClass SHAREABLEMEASURE = eINSTANCE.getShareablemeasure();

		/**
		 * The meta object literal for the '{@link fhiRCore.profiles.impl.ResprateImpl <em>Resprate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fhiRCore.profiles.impl.ResprateImpl
		 * @see fhiRCore.profiles.impl.ProfilesPackageImpl#getResprate()
		 * @generated
		 */
		EClass RESPRATE = eINSTANCE.getResprate();

		/**
		 * The meta object literal for the '<em><b>Value Quantity</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESPRATE__VALUE_QUANTITY = eINSTANCE.getResprate_ValueQuantity();

		/**
		 * The meta object literal for the '{@link fhiRCore.profiles.impl.ResprateCodeableConcept1Impl <em>Resprate Codeable Concept1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fhiRCore.profiles.impl.ResprateCodeableConcept1Impl
		 * @see fhiRCore.profiles.impl.ProfilesPackageImpl#getResprateCodeableConcept1()
		 * @generated
		 */
		EClass RESPRATE_CODEABLE_CONCEPT1 = eINSTANCE.getResprateCodeableConcept1();

		/**
		 * The meta object literal for the '<em><b>Resp Rate Code</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESPRATE_CODEABLE_CONCEPT1__RESP_RATE_CODE = eINSTANCE.getResprateCodeableConcept1_RespRateCode();

		/**
		 * The meta object literal for the '{@link fhiRCore.profiles.impl.ResprateCodeableConcept1Coding1Impl <em>Resprate Codeable Concept1 Coding1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fhiRCore.profiles.impl.ResprateCodeableConcept1Coding1Impl
		 * @see fhiRCore.profiles.impl.ProfilesPackageImpl#getResprateCodeableConcept1Coding1()
		 * @generated
		 */
		EClass RESPRATE_CODEABLE_CONCEPT1_CODING1 = eINSTANCE.getResprateCodeableConcept1Coding1();

		/**
		 * The meta object literal for the '{@link fhiRCore.profiles.impl.ResprateQuantity1Impl <em>Resprate Quantity1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fhiRCore.profiles.impl.ResprateQuantity1Impl
		 * @see fhiRCore.profiles.impl.ProfilesPackageImpl#getResprateQuantity1()
		 * @generated
		 */
		EClass RESPRATE_QUANTITY1 = eINSTANCE.getResprateQuantity1();

		/**
		 * The meta object literal for the '{@link fhiRCore.profiles.impl.FamilymemberhistorygeneticImpl <em>Familymemberhistorygenetic</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fhiRCore.profiles.impl.FamilymemberhistorygeneticImpl
		 * @see fhiRCore.profiles.impl.ProfilesPackageImpl#getFamilymemberhistorygenetic()
		 * @generated
		 */
		EClass FAMILYMEMBERHISTORYGENETIC = eINSTANCE.getFamilymemberhistorygenetic();

		/**
		 * The meta object literal for the '{@link fhiRCore.profiles.impl.FamilymemberhistorygeneticCondition1Impl <em>Familymemberhistorygenetic Condition1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fhiRCore.profiles.impl.FamilymemberhistorygeneticCondition1Impl
		 * @see fhiRCore.profiles.impl.ProfilesPackageImpl#getFamilymemberhistorygeneticCondition1()
		 * @generated
		 */
		EClass FAMILYMEMBERHISTORYGENETIC_CONDITION1 = eINSTANCE.getFamilymemberhistorygeneticCondition1();

		/**
		 * The meta object literal for the '{@link fhiRCore.profiles.impl.HdlcholesterolImpl <em>Hdlcholesterol</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fhiRCore.profiles.impl.HdlcholesterolImpl
		 * @see fhiRCore.profiles.impl.ProfilesPackageImpl#getHdlcholesterol()
		 * @generated
		 */
		EClass HDLCHOLESTEROL = eINSTANCE.getHdlcholesterol();

		/**
		 * The meta object literal for the '<em><b>Value Quantity</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HDLCHOLESTEROL__VALUE_QUANTITY = eINSTANCE.getHdlcholesterol_ValueQuantity();

		/**
		 * The meta object literal for the '{@link fhiRCore.profiles.impl.HdlcholesterolReferenceRange1Impl <em>Hdlcholesterol Reference Range1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fhiRCore.profiles.impl.HdlcholesterolReferenceRange1Impl
		 * @see fhiRCore.profiles.impl.ProfilesPackageImpl#getHdlcholesterolReferenceRange1()
		 * @generated
		 */
		EClass HDLCHOLESTEROL_REFERENCE_RANGE1 = eINSTANCE.getHdlcholesterolReferenceRange1();

		/**
		 * The meta object literal for the '{@link fhiRCore.profiles.impl.ShareableplandefinitionImpl <em>Shareableplandefinition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fhiRCore.profiles.impl.ShareableplandefinitionImpl
		 * @see fhiRCore.profiles.impl.ProfilesPackageImpl#getShareableplandefinition()
		 * @generated
		 */
		EClass SHAREABLEPLANDEFINITION = eINSTANCE.getShareableplandefinition();

		/**
		 * The meta object literal for the '{@link fhiRCore.profiles.impl.LipidprofileImpl <em>Lipidprofile</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fhiRCore.profiles.impl.LipidprofileImpl
		 * @see fhiRCore.profiles.impl.ProfilesPackageImpl#getLipidprofile()
		 * @generated
		 */
		EClass LIPIDPROFILE = eINSTANCE.getLipidprofile();

		/**
		 * The meta object literal for the '<em><b>Cholesterol</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIPIDPROFILE__CHOLESTEROL = eINSTANCE.getLipidprofile_Cholesterol();

		/**
		 * The meta object literal for the '<em><b>Triglyceride</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIPIDPROFILE__TRIGLYCERIDE = eINSTANCE.getLipidprofile_Triglyceride();

		/**
		 * The meta object literal for the '<em><b>Hdl Cholesterol</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIPIDPROFILE__HDL_CHOLESTEROL = eINSTANCE.getLipidprofile_HdlCholesterol();

		/**
		 * The meta object literal for the '<em><b>Ldl Cholesterol</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIPIDPROFILE__LDL_CHOLESTEROL = eINSTANCE.getLipidprofile_LdlCholesterol();

		/**
		 * The meta object literal for the '{@link fhiRCore.profiles.impl.CholesterolImpl <em>Cholesterol</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fhiRCore.profiles.impl.CholesterolImpl
		 * @see fhiRCore.profiles.impl.ProfilesPackageImpl#getCholesterol()
		 * @generated
		 */
		EClass CHOLESTEROL = eINSTANCE.getCholesterol();

		/**
		 * The meta object literal for the '<em><b>Value Quantity</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHOLESTEROL__VALUE_QUANTITY = eINSTANCE.getCholesterol_ValueQuantity();

		/**
		 * The meta object literal for the '{@link fhiRCore.profiles.impl.CholesterolQuantity1Impl <em>Cholesterol Quantity1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fhiRCore.profiles.impl.CholesterolQuantity1Impl
		 * @see fhiRCore.profiles.impl.ProfilesPackageImpl#getCholesterolQuantity1()
		 * @generated
		 */
		EClass CHOLESTEROL_QUANTITY1 = eINSTANCE.getCholesterolQuantity1();

		/**
		 * The meta object literal for the '{@link fhiRCore.profiles.impl.CholesterolReferenceRange1Impl <em>Cholesterol Reference Range1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fhiRCore.profiles.impl.CholesterolReferenceRange1Impl
		 * @see fhiRCore.profiles.impl.ProfilesPackageImpl#getCholesterolReferenceRange1()
		 * @generated
		 */
		EClass CHOLESTEROL_REFERENCE_RANGE1 = eINSTANCE.getCholesterolReferenceRange1();

		/**
		 * The meta object literal for the '{@link fhiRCore.profiles.impl.TriglycerideImpl <em>Triglyceride</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fhiRCore.profiles.impl.TriglycerideImpl
		 * @see fhiRCore.profiles.impl.ProfilesPackageImpl#getTriglyceride()
		 * @generated
		 */
		EClass TRIGLYCERIDE = eINSTANCE.getTriglyceride();

		/**
		 * The meta object literal for the '<em><b>Value Quantity</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRIGLYCERIDE__VALUE_QUANTITY = eINSTANCE.getTriglyceride_ValueQuantity();

		/**
		 * The meta object literal for the '{@link fhiRCore.profiles.impl.TriglycerideReferenceRange1Impl <em>Triglyceride Reference Range1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fhiRCore.profiles.impl.TriglycerideReferenceRange1Impl
		 * @see fhiRCore.profiles.impl.ProfilesPackageImpl#getTriglycerideReferenceRange1()
		 * @generated
		 */
		EClass TRIGLYCERIDE_REFERENCE_RANGE1 = eINSTANCE.getTriglycerideReferenceRange1();

		/**
		 * The meta object literal for the '{@link fhiRCore.profiles.impl.LdlcholesterolImpl <em>Ldlcholesterol</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fhiRCore.profiles.impl.LdlcholesterolImpl
		 * @see fhiRCore.profiles.impl.ProfilesPackageImpl#getLdlcholesterol()
		 * @generated
		 */
		EClass LDLCHOLESTEROL = eINSTANCE.getLdlcholesterol();

		/**
		 * The meta object literal for the '<em><b>Value Quantity</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LDLCHOLESTEROL__VALUE_QUANTITY = eINSTANCE.getLdlcholesterol_ValueQuantity();

		/**
		 * The meta object literal for the '{@link fhiRCore.profiles.impl.LdlcholesterolReferenceRange1Impl <em>Ldlcholesterol Reference Range1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fhiRCore.profiles.impl.LdlcholesterolReferenceRange1Impl
		 * @see fhiRCore.profiles.impl.ProfilesPackageImpl#getLdlcholesterolReferenceRange1()
		 * @generated
		 */
		EClass LDLCHOLESTEROL_REFERENCE_RANGE1 = eINSTANCE.getLdlcholesterolReferenceRange1();

		/**
		 * The meta object literal for the '{@link fhiRCore.profiles.impl.BodytempImpl <em>Bodytemp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fhiRCore.profiles.impl.BodytempImpl
		 * @see fhiRCore.profiles.impl.ProfilesPackageImpl#getBodytemp()
		 * @generated
		 */
		EClass BODYTEMP = eINSTANCE.getBodytemp();

		/**
		 * The meta object literal for the '<em><b>Value Quantity</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BODYTEMP__VALUE_QUANTITY = eINSTANCE.getBodytemp_ValueQuantity();

		/**
		 * The meta object literal for the '{@link fhiRCore.profiles.impl.BodytempCodeableConcept1Impl <em>Bodytemp Codeable Concept1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fhiRCore.profiles.impl.BodytempCodeableConcept1Impl
		 * @see fhiRCore.profiles.impl.ProfilesPackageImpl#getBodytempCodeableConcept1()
		 * @generated
		 */
		EClass BODYTEMP_CODEABLE_CONCEPT1 = eINSTANCE.getBodytempCodeableConcept1();

		/**
		 * The meta object literal for the '<em><b>Body Temp Code</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BODYTEMP_CODEABLE_CONCEPT1__BODY_TEMP_CODE = eINSTANCE.getBodytempCodeableConcept1_BodyTempCode();

		/**
		 * The meta object literal for the '{@link fhiRCore.profiles.impl.BodytempCodeableConcept1Coding1Impl <em>Bodytemp Codeable Concept1 Coding1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fhiRCore.profiles.impl.BodytempCodeableConcept1Coding1Impl
		 * @see fhiRCore.profiles.impl.ProfilesPackageImpl#getBodytempCodeableConcept1Coding1()
		 * @generated
		 */
		EClass BODYTEMP_CODEABLE_CONCEPT1_CODING1 = eINSTANCE.getBodytempCodeableConcept1Coding1();

		/**
		 * The meta object literal for the '{@link fhiRCore.profiles.impl.BodytempQuantity1Impl <em>Bodytemp Quantity1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fhiRCore.profiles.impl.BodytempQuantity1Impl
		 * @see fhiRCore.profiles.impl.ProfilesPackageImpl#getBodytempQuantity1()
		 * @generated
		 */
		EClass BODYTEMP_QUANTITY1 = eINSTANCE.getBodytempQuantity1();

		/**
		 * The meta object literal for the '{@link fhiRCore.profiles.impl.MetadataResourceImpl <em>Metadata Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fhiRCore.profiles.impl.MetadataResourceImpl
		 * @see fhiRCore.profiles.impl.ProfilesPackageImpl#getMetadataResource()
		 * @generated
		 */
		EClass METADATA_RESOURCE = eINSTANCE.getMetadataResource();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METADATA_RESOURCE__URL = eINSTANCE.getMetadataResource_Url();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METADATA_RESOURCE__VERSION = eINSTANCE.getMetadataResource_Version();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METADATA_RESOURCE__NAME = eINSTANCE.getMetadataResource_Name();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METADATA_RESOURCE__TITLE = eINSTANCE.getMetadataResource_Title();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METADATA_RESOURCE__STATUS = eINSTANCE.getMetadataResource_Status();

		/**
		 * The meta object literal for the '<em><b>Experimental</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METADATA_RESOURCE__EXPERIMENTAL = eINSTANCE.getMetadataResource_Experimental();

		/**
		 * The meta object literal for the '<em><b>Date</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METADATA_RESOURCE__DATE = eINSTANCE.getMetadataResource_Date();

		/**
		 * The meta object literal for the '<em><b>Publisher</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METADATA_RESOURCE__PUBLISHER = eINSTANCE.getMetadataResource_Publisher();

		/**
		 * The meta object literal for the '<em><b>Contact</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METADATA_RESOURCE__CONTACT = eINSTANCE.getMetadataResource_Contact();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METADATA_RESOURCE__DESCRIPTION = eINSTANCE.getMetadataResource_Description();

		/**
		 * The meta object literal for the '<em><b>Use Context</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METADATA_RESOURCE__USE_CONTEXT = eINSTANCE.getMetadataResource_UseContext();

		/**
		 * The meta object literal for the '<em><b>Jurisdiction</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METADATA_RESOURCE__JURISDICTION = eINSTANCE.getMetadataResource_Jurisdiction();

		/**
		 * The meta object literal for the '{@link fhiRCore.profiles.impl.HeartrateImpl <em>Heartrate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fhiRCore.profiles.impl.HeartrateImpl
		 * @see fhiRCore.profiles.impl.ProfilesPackageImpl#getHeartrate()
		 * @generated
		 */
		EClass HEARTRATE = eINSTANCE.getHeartrate();

		/**
		 * The meta object literal for the '<em><b>Value Quantity</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HEARTRATE__VALUE_QUANTITY = eINSTANCE.getHeartrate_ValueQuantity();

		/**
		 * The meta object literal for the '{@link fhiRCore.profiles.impl.HeartrateCodeableConcept1Impl <em>Heartrate Codeable Concept1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fhiRCore.profiles.impl.HeartrateCodeableConcept1Impl
		 * @see fhiRCore.profiles.impl.ProfilesPackageImpl#getHeartrateCodeableConcept1()
		 * @generated
		 */
		EClass HEARTRATE_CODEABLE_CONCEPT1 = eINSTANCE.getHeartrateCodeableConcept1();

		/**
		 * The meta object literal for the '<em><b>Heart Rate Code</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HEARTRATE_CODEABLE_CONCEPT1__HEART_RATE_CODE = eINSTANCE.getHeartrateCodeableConcept1_HeartRateCode();

		/**
		 * The meta object literal for the '{@link fhiRCore.profiles.impl.HeartrateCodeableConcept1Coding1Impl <em>Heartrate Codeable Concept1 Coding1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fhiRCore.profiles.impl.HeartrateCodeableConcept1Coding1Impl
		 * @see fhiRCore.profiles.impl.ProfilesPackageImpl#getHeartrateCodeableConcept1Coding1()
		 * @generated
		 */
		EClass HEARTRATE_CODEABLE_CONCEPT1_CODING1 = eINSTANCE.getHeartrateCodeableConcept1Coding1();

		/**
		 * The meta object literal for the '{@link fhiRCore.profiles.impl.HeartrateQuantity1Impl <em>Heartrate Quantity1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fhiRCore.profiles.impl.HeartrateQuantity1Impl
		 * @see fhiRCore.profiles.impl.ProfilesPackageImpl#getHeartrateQuantity1()
		 * @generated
		 */
		EClass HEARTRATE_QUANTITY1 = eINSTANCE.getHeartrateQuantity1();

		/**
		 * The meta object literal for the '{@link fhiRCore.profiles.impl.BodyheightImpl <em>Bodyheight</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fhiRCore.profiles.impl.BodyheightImpl
		 * @see fhiRCore.profiles.impl.ProfilesPackageImpl#getBodyheight()
		 * @generated
		 */
		EClass BODYHEIGHT = eINSTANCE.getBodyheight();

		/**
		 * The meta object literal for the '<em><b>Value Quantity</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BODYHEIGHT__VALUE_QUANTITY = eINSTANCE.getBodyheight_ValueQuantity();

		/**
		 * The meta object literal for the '{@link fhiRCore.profiles.impl.BodyheightCodeableConcept1Impl <em>Bodyheight Codeable Concept1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fhiRCore.profiles.impl.BodyheightCodeableConcept1Impl
		 * @see fhiRCore.profiles.impl.ProfilesPackageImpl#getBodyheightCodeableConcept1()
		 * @generated
		 */
		EClass BODYHEIGHT_CODEABLE_CONCEPT1 = eINSTANCE.getBodyheightCodeableConcept1();

		/**
		 * The meta object literal for the '<em><b>Body Height Code</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BODYHEIGHT_CODEABLE_CONCEPT1__BODY_HEIGHT_CODE = eINSTANCE.getBodyheightCodeableConcept1_BodyHeightCode();

		/**
		 * The meta object literal for the '{@link fhiRCore.profiles.impl.BodyheightCodeableConcept1Coding1Impl <em>Bodyheight Codeable Concept1 Coding1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fhiRCore.profiles.impl.BodyheightCodeableConcept1Coding1Impl
		 * @see fhiRCore.profiles.impl.ProfilesPackageImpl#getBodyheightCodeableConcept1Coding1()
		 * @generated
		 */
		EClass BODYHEIGHT_CODEABLE_CONCEPT1_CODING1 = eINSTANCE.getBodyheightCodeableConcept1Coding1();

		/**
		 * The meta object literal for the '{@link fhiRCore.profiles.impl.BodyheightQuantity1Impl <em>Bodyheight Quantity1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fhiRCore.profiles.impl.BodyheightQuantity1Impl
		 * @see fhiRCore.profiles.impl.ProfilesPackageImpl#getBodyheightQuantity1()
		 * @generated
		 */
		EClass BODYHEIGHT_QUANTITY1 = eINSTANCE.getBodyheightQuantity1();

		/**
		 * The meta object literal for the '{@link fhiRCore.profiles.impl.ElementdefinitiondeImpl <em>Elementdefinitionde</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fhiRCore.profiles.impl.ElementdefinitiondeImpl
		 * @see fhiRCore.profiles.impl.ProfilesPackageImpl#getElementdefinitionde()
		 * @generated
		 */
		EClass ELEMENTDEFINITIONDE = eINSTANCE.getElementdefinitionde();

		/**
		 * The meta object literal for the '{@link fhiRCore.profiles.impl.ElementdefinitiondeElement31Impl <em>Elementdefinitionde Element31</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fhiRCore.profiles.impl.ElementdefinitiondeElement31Impl
		 * @see fhiRCore.profiles.impl.ProfilesPackageImpl#getElementdefinitiondeElement31()
		 * @generated
		 */
		EClass ELEMENTDEFINITIONDE_ELEMENT31 = eINSTANCE.getElementdefinitiondeElement31();

		/**
		 * The meta object literal for the '{@link fhiRCore.profiles.impl.DiagnosticreportgeneticsImpl <em>Diagnosticreportgenetics</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fhiRCore.profiles.impl.DiagnosticreportgeneticsImpl
		 * @see fhiRCore.profiles.impl.ProfilesPackageImpl#getDiagnosticreportgenetics()
		 * @generated
		 */
		EClass DIAGNOSTICREPORTGENETICS = eINSTANCE.getDiagnosticreportgenetics();

		/**
		 * The meta object literal for the '{@link fhiRCore.profiles.impl.ShareablecodesystemImpl <em>Shareablecodesystem</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fhiRCore.profiles.impl.ShareablecodesystemImpl
		 * @see fhiRCore.profiles.impl.ProfilesPackageImpl#getShareablecodesystem()
		 * @generated
		 */
		EClass SHAREABLECODESYSTEM = eINSTANCE.getShareablecodesystem();

		/**
		 * The meta object literal for the '{@link fhiRCore.profiles.impl.ShareablecodesystemConceptDefinition1Impl <em>Shareablecodesystem Concept Definition1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fhiRCore.profiles.impl.ShareablecodesystemConceptDefinition1Impl
		 * @see fhiRCore.profiles.impl.ProfilesPackageImpl#getShareablecodesystemConceptDefinition1()
		 * @generated
		 */
		EClass SHAREABLECODESYSTEM_CONCEPT_DEFINITION1 = eINSTANCE.getShareablecodesystemConceptDefinition1();

		/**
		 * The meta object literal for the '{@link fhiRCore.profiles.impl.OxygensatImpl <em>Oxygensat</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fhiRCore.profiles.impl.OxygensatImpl
		 * @see fhiRCore.profiles.impl.ProfilesPackageImpl#getOxygensat()
		 * @generated
		 */
		EClass OXYGENSAT = eINSTANCE.getOxygensat();

		/**
		 * The meta object literal for the '<em><b>Value Quantity</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OXYGENSAT__VALUE_QUANTITY = eINSTANCE.getOxygensat_ValueQuantity();

		/**
		 * The meta object literal for the '{@link fhiRCore.profiles.impl.OxygensatCodeableConcept1Impl <em>Oxygensat Codeable Concept1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fhiRCore.profiles.impl.OxygensatCodeableConcept1Impl
		 * @see fhiRCore.profiles.impl.ProfilesPackageImpl#getOxygensatCodeableConcept1()
		 * @generated
		 */
		EClass OXYGENSAT_CODEABLE_CONCEPT1 = eINSTANCE.getOxygensatCodeableConcept1();

		/**
		 * The meta object literal for the '<em><b>Oxygen Sat Code</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OXYGENSAT_CODEABLE_CONCEPT1__OXYGEN_SAT_CODE = eINSTANCE.getOxygensatCodeableConcept1_OxygenSatCode();

		/**
		 * The meta object literal for the '{@link fhiRCore.profiles.impl.OxygensatCodeableConcept1Coding1Impl <em>Oxygensat Codeable Concept1 Coding1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fhiRCore.profiles.impl.OxygensatCodeableConcept1Coding1Impl
		 * @see fhiRCore.profiles.impl.ProfilesPackageImpl#getOxygensatCodeableConcept1Coding1()
		 * @generated
		 */
		EClass OXYGENSAT_CODEABLE_CONCEPT1_CODING1 = eINSTANCE.getOxygensatCodeableConcept1Coding1();

		/**
		 * The meta object literal for the '{@link fhiRCore.profiles.impl.OxygensatQuantity1Impl <em>Oxygensat Quantity1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fhiRCore.profiles.impl.OxygensatQuantity1Impl
		 * @see fhiRCore.profiles.impl.ProfilesPackageImpl#getOxygensatQuantity1()
		 * @generated
		 */
		EClass OXYGENSAT_QUANTITY1 = eINSTANCE.getOxygensatQuantity1();

		/**
		 * The meta object literal for the '{@link fhiRCore.profiles.impl.ClinicaldocumentImpl <em>Clinicaldocument</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fhiRCore.profiles.impl.ClinicaldocumentImpl
		 * @see fhiRCore.profiles.impl.ProfilesPackageImpl#getClinicaldocument()
		 * @generated
		 */
		EClass CLINICALDOCUMENT = eINSTANCE.getClinicaldocument();

		/**
		 * The meta object literal for the '{@link fhiRCore.profiles.impl.CqllibraryImpl <em>Cqllibrary</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fhiRCore.profiles.impl.CqllibraryImpl
		 * @see fhiRCore.profiles.impl.ProfilesPackageImpl#getCqllibrary()
		 * @generated
		 */
		EClass CQLLIBRARY = eINSTANCE.getCqllibrary();

		/**
		 * The meta object literal for the '{@link fhiRCore.profiles.impl.HeadcircumImpl <em>Headcircum</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fhiRCore.profiles.impl.HeadcircumImpl
		 * @see fhiRCore.profiles.impl.ProfilesPackageImpl#getHeadcircum()
		 * @generated
		 */
		EClass HEADCIRCUM = eINSTANCE.getHeadcircum();

		/**
		 * The meta object literal for the '<em><b>Value Quantity</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HEADCIRCUM__VALUE_QUANTITY = eINSTANCE.getHeadcircum_ValueQuantity();

		/**
		 * The meta object literal for the '{@link fhiRCore.profiles.impl.HeadcircumCodeableConcept1Impl <em>Headcircum Codeable Concept1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fhiRCore.profiles.impl.HeadcircumCodeableConcept1Impl
		 * @see fhiRCore.profiles.impl.ProfilesPackageImpl#getHeadcircumCodeableConcept1()
		 * @generated
		 */
		EClass HEADCIRCUM_CODEABLE_CONCEPT1 = eINSTANCE.getHeadcircumCodeableConcept1();

		/**
		 * The meta object literal for the '<em><b>Head Circum Code</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HEADCIRCUM_CODEABLE_CONCEPT1__HEAD_CIRCUM_CODE = eINSTANCE.getHeadcircumCodeableConcept1_HeadCircumCode();

		/**
		 * The meta object literal for the '{@link fhiRCore.profiles.impl.HeadcircumCodeableConcept1Coding1Impl <em>Headcircum Codeable Concept1 Coding1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fhiRCore.profiles.impl.HeadcircumCodeableConcept1Coding1Impl
		 * @see fhiRCore.profiles.impl.ProfilesPackageImpl#getHeadcircumCodeableConcept1Coding1()
		 * @generated
		 */
		EClass HEADCIRCUM_CODEABLE_CONCEPT1_CODING1 = eINSTANCE.getHeadcircumCodeableConcept1Coding1();

		/**
		 * The meta object literal for the '{@link fhiRCore.profiles.impl.HeadcircumQuantity1Impl <em>Headcircum Quantity1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fhiRCore.profiles.impl.HeadcircumQuantity1Impl
		 * @see fhiRCore.profiles.impl.ProfilesPackageImpl#getHeadcircumQuantity1()
		 * @generated
		 */
		EClass HEADCIRCUM_QUANTITY1 = eINSTANCE.getHeadcircumQuantity1();

		/**
		 * The meta object literal for the '{@link fhiRCore.profiles.impl.SynchronizationplandefinitionImpl <em>Synchronizationplandefinition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fhiRCore.profiles.impl.SynchronizationplandefinitionImpl
		 * @see fhiRCore.profiles.impl.ProfilesPackageImpl#getSynchronizationplandefinition()
		 * @generated
		 */
		EClass SYNCHRONIZATIONPLANDEFINITION = eINSTANCE.getSynchronizationplandefinition();

		/**
		 * The meta object literal for the '{@link fhiRCore.profiles.impl.VitalspanelImpl <em>Vitalspanel</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fhiRCore.profiles.impl.VitalspanelImpl
		 * @see fhiRCore.profiles.impl.ProfilesPackageImpl#getVitalspanel()
		 * @generated
		 */
		EClass VITALSPANEL = eINSTANCE.getVitalspanel();

		/**
		 * The meta object literal for the '{@link fhiRCore.profiles.impl.VitalspanelCodeableConcept1Impl <em>Vitalspanel Codeable Concept1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fhiRCore.profiles.impl.VitalspanelCodeableConcept1Impl
		 * @see fhiRCore.profiles.impl.ProfilesPackageImpl#getVitalspanelCodeableConcept1()
		 * @generated
		 */
		EClass VITALSPANEL_CODEABLE_CONCEPT1 = eINSTANCE.getVitalspanelCodeableConcept1();

		/**
		 * The meta object literal for the '<em><b>Vitals Panel Code</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VITALSPANEL_CODEABLE_CONCEPT1__VITALS_PANEL_CODE = eINSTANCE.getVitalspanelCodeableConcept1_VitalsPanelCode();

		/**
		 * The meta object literal for the '{@link fhiRCore.profiles.impl.VitalspanelCodeableConcept1Coding1Impl <em>Vitalspanel Codeable Concept1 Coding1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fhiRCore.profiles.impl.VitalspanelCodeableConcept1Coding1Impl
		 * @see fhiRCore.profiles.impl.ProfilesPackageImpl#getVitalspanelCodeableConcept1Coding1()
		 * @generated
		 */
		EClass VITALSPANEL_CODEABLE_CONCEPT1_CODING1 = eINSTANCE.getVitalspanelCodeableConcept1Coding1();

		/**
		 * The meta object literal for the '{@link fhiRCore.profiles.impl.SynthesisImpl <em>Synthesis</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fhiRCore.profiles.impl.SynthesisImpl
		 * @see fhiRCore.profiles.impl.ProfilesPackageImpl#getSynthesis()
		 * @generated
		 */
		EClass SYNTHESIS = eINSTANCE.getSynthesis();

		/**
		 * The meta object literal for the '{@link fhiRCore.profiles.impl.SubstanceDefinitionImpl <em>Substance Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fhiRCore.profiles.impl.SubstanceDefinitionImpl
		 * @see fhiRCore.profiles.impl.ProfilesPackageImpl#getSubstanceDefinition()
		 * @generated
		 */
		EClass SUBSTANCE_DEFINITION = eINSTANCE.getSubstanceDefinition();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBSTANCE_DEFINITION__IDENTIFIER = eINSTANCE.getSubstanceDefinition_Identifier();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBSTANCE_DEFINITION__TYPE = eINSTANCE.getSubstanceDefinition_Type();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBSTANCE_DEFINITION__STATUS = eINSTANCE.getSubstanceDefinition_Status();

		/**
		 * The meta object literal for the '<em><b>Domain</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBSTANCE_DEFINITION__DOMAIN = eINSTANCE.getSubstanceDefinition_Domain();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBSTANCE_DEFINITION__DESCRIPTION = eINSTANCE.getSubstanceDefinition_Description();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBSTANCE_DEFINITION__SOURCE = eINSTANCE.getSubstanceDefinition_Source();

		/**
		 * The meta object literal for the '<em><b>Comment</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBSTANCE_DEFINITION__COMMENT = eINSTANCE.getSubstanceDefinition_Comment();

		/**
		 * The meta object literal for the '<em><b>Moiety</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBSTANCE_DEFINITION__MOIETY = eINSTANCE.getSubstanceDefinition_Moiety();

		/**
		 * The meta object literal for the '<em><b>Property</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBSTANCE_DEFINITION__PROPERTY = eINSTANCE.getSubstanceDefinition_Property();

		/**
		 * The meta object literal for the '<em><b>Reference Information</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBSTANCE_DEFINITION__REFERENCE_INFORMATION = eINSTANCE.getSubstanceDefinition_ReferenceInformation();

		/**
		 * The meta object literal for the '<em><b>Structure</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBSTANCE_DEFINITION__STRUCTURE = eINSTANCE.getSubstanceDefinition_Structure();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBSTANCE_DEFINITION__CODE = eINSTANCE.getSubstanceDefinition_Code();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBSTANCE_DEFINITION__NAME = eINSTANCE.getSubstanceDefinition_Name();

		/**
		 * The meta object literal for the '<em><b>Molecular Weight</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBSTANCE_DEFINITION__MOLECULAR_WEIGHT = eINSTANCE.getSubstanceDefinition_MolecularWeight();

		/**
		 * The meta object literal for the '<em><b>Relationship</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBSTANCE_DEFINITION__RELATIONSHIP = eINSTANCE.getSubstanceDefinition_Relationship();

		/**
		 * The meta object literal for the '<em><b>Nucleic Acid</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBSTANCE_DEFINITION__NUCLEIC_ACID = eINSTANCE.getSubstanceDefinition_NucleicAcid();

		/**
		 * The meta object literal for the '<em><b>Polymer</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBSTANCE_DEFINITION__POLYMER = eINSTANCE.getSubstanceDefinition_Polymer();

		/**
		 * The meta object literal for the '<em><b>Protein</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBSTANCE_DEFINITION__PROTEIN = eINSTANCE.getSubstanceDefinition_Protein();

		/**
		 * The meta object literal for the '<em><b>Source Material</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBSTANCE_DEFINITION__SOURCE_MATERIAL = eINSTANCE.getSubstanceDefinition_SourceMaterial();

		/**
		 * The meta object literal for the '{@link fhiRCore.profiles.impl.SubstanceDefinitionMoietyImpl <em>Substance Definition Moiety</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fhiRCore.profiles.impl.SubstanceDefinitionMoietyImpl
		 * @see fhiRCore.profiles.impl.ProfilesPackageImpl#getSubstanceDefinitionMoiety()
		 * @generated
		 */
		EClass SUBSTANCE_DEFINITION_MOIETY = eINSTANCE.getSubstanceDefinitionMoiety();

		/**
		 * The meta object literal for the '<em><b>Role</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBSTANCE_DEFINITION_MOIETY__ROLE = eINSTANCE.getSubstanceDefinitionMoiety_Role();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBSTANCE_DEFINITION_MOIETY__IDENTIFIER = eINSTANCE.getSubstanceDefinitionMoiety_Identifier();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBSTANCE_DEFINITION_MOIETY__NAME = eINSTANCE.getSubstanceDefinitionMoiety_Name();

		/**
		 * The meta object literal for the '<em><b>Stereochemistry</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBSTANCE_DEFINITION_MOIETY__STEREOCHEMISTRY = eINSTANCE.getSubstanceDefinitionMoiety_Stereochemistry();

		/**
		 * The meta object literal for the '<em><b>Optical Activity</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBSTANCE_DEFINITION_MOIETY__OPTICAL_ACTIVITY = eINSTANCE.getSubstanceDefinitionMoiety_OpticalActivity();

		/**
		 * The meta object literal for the '<em><b>Molecular Formula</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBSTANCE_DEFINITION_MOIETY__MOLECULAR_FORMULA = eINSTANCE.getSubstanceDefinitionMoiety_MolecularFormula();

		/**
		 * The meta object literal for the '<em><b>Amountx</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBSTANCE_DEFINITION_MOIETY__AMOUNTX = eINSTANCE.getSubstanceDefinitionMoiety_Amountx();

		/**
		 * The meta object literal for the '{@link fhiRCore.profiles.impl.SubstanceDefinitionPropertyImpl <em>Substance Definition Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fhiRCore.profiles.impl.SubstanceDefinitionPropertyImpl
		 * @see fhiRCore.profiles.impl.ProfilesPackageImpl#getSubstanceDefinitionProperty()
		 * @generated
		 */
		EClass SUBSTANCE_DEFINITION_PROPERTY = eINSTANCE.getSubstanceDefinitionProperty();

		/**
		 * The meta object literal for the '<em><b>Category</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBSTANCE_DEFINITION_PROPERTY__CATEGORY = eINSTANCE.getSubstanceDefinitionProperty_Category();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBSTANCE_DEFINITION_PROPERTY__CODE = eINSTANCE.getSubstanceDefinitionProperty_Code();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBSTANCE_DEFINITION_PROPERTY__PARAMETERS = eINSTANCE.getSubstanceDefinitionProperty_Parameters();

		/**
		 * The meta object literal for the '<em><b>Defining Substancex</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBSTANCE_DEFINITION_PROPERTY__DEFINING_SUBSTANCEX = eINSTANCE.getSubstanceDefinitionProperty_DefiningSubstancex();

		/**
		 * The meta object literal for the '<em><b>Amountx</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBSTANCE_DEFINITION_PROPERTY__AMOUNTX = eINSTANCE.getSubstanceDefinitionProperty_Amountx();

		/**
		 * The meta object literal for the '{@link fhiRCore.profiles.impl.SubstanceDefinitionStructureImpl <em>Substance Definition Structure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fhiRCore.profiles.impl.SubstanceDefinitionStructureImpl
		 * @see fhiRCore.profiles.impl.ProfilesPackageImpl#getSubstanceDefinitionStructure()
		 * @generated
		 */
		EClass SUBSTANCE_DEFINITION_STRUCTURE = eINSTANCE.getSubstanceDefinitionStructure();

		/**
		 * The meta object literal for the '<em><b>Stereochemistry</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBSTANCE_DEFINITION_STRUCTURE__STEREOCHEMISTRY = eINSTANCE.getSubstanceDefinitionStructure_Stereochemistry();

		/**
		 * The meta object literal for the '<em><b>Optical Activity</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBSTANCE_DEFINITION_STRUCTURE__OPTICAL_ACTIVITY = eINSTANCE.getSubstanceDefinitionStructure_OpticalActivity();

		/**
		 * The meta object literal for the '<em><b>Molecular Formula</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBSTANCE_DEFINITION_STRUCTURE__MOLECULAR_FORMULA = eINSTANCE.getSubstanceDefinitionStructure_MolecularFormula();

		/**
		 * The meta object literal for the '<em><b>Molecular Formula By Moiety</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBSTANCE_DEFINITION_STRUCTURE__MOLECULAR_FORMULA_BY_MOIETY = eINSTANCE.getSubstanceDefinitionStructure_MolecularFormulaByMoiety();

		/**
		 * The meta object literal for the '<em><b>Isotope</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBSTANCE_DEFINITION_STRUCTURE__ISOTOPE = eINSTANCE.getSubstanceDefinitionStructure_Isotope();

		/**
		 * The meta object literal for the '<em><b>Molecular Weight</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBSTANCE_DEFINITION_STRUCTURE__MOLECULAR_WEIGHT = eINSTANCE.getSubstanceDefinitionStructure_MolecularWeight();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBSTANCE_DEFINITION_STRUCTURE__SOURCE = eINSTANCE.getSubstanceDefinitionStructure_Source();

		/**
		 * The meta object literal for the '<em><b>Representation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBSTANCE_DEFINITION_STRUCTURE__REPRESENTATION = eINSTANCE.getSubstanceDefinitionStructure_Representation();

		/**
		 * The meta object literal for the '{@link fhiRCore.profiles.impl.SubstanceDefinitionStructureIsotopeImpl <em>Substance Definition Structure Isotope</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fhiRCore.profiles.impl.SubstanceDefinitionStructureIsotopeImpl
		 * @see fhiRCore.profiles.impl.ProfilesPackageImpl#getSubstanceDefinitionStructureIsotope()
		 * @generated
		 */
		EClass SUBSTANCE_DEFINITION_STRUCTURE_ISOTOPE = eINSTANCE.getSubstanceDefinitionStructureIsotope();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBSTANCE_DEFINITION_STRUCTURE_ISOTOPE__IDENTIFIER = eINSTANCE.getSubstanceDefinitionStructureIsotope_Identifier();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBSTANCE_DEFINITION_STRUCTURE_ISOTOPE__NAME = eINSTANCE.getSubstanceDefinitionStructureIsotope_Name();

		/**
		 * The meta object literal for the '<em><b>Substitution</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBSTANCE_DEFINITION_STRUCTURE_ISOTOPE__SUBSTITUTION = eINSTANCE.getSubstanceDefinitionStructureIsotope_Substitution();

		/**
		 * The meta object literal for the '<em><b>Half Life</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBSTANCE_DEFINITION_STRUCTURE_ISOTOPE__HALF_LIFE = eINSTANCE.getSubstanceDefinitionStructureIsotope_HalfLife();

		/**
		 * The meta object literal for the '<em><b>Molecular Weight</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBSTANCE_DEFINITION_STRUCTURE_ISOTOPE__MOLECULAR_WEIGHT = eINSTANCE.getSubstanceDefinitionStructureIsotope_MolecularWeight();

		/**
		 * The meta object literal for the '{@link fhiRCore.profiles.impl.SubstanceDefinitionStructureIsotopeMolecularWeightImpl <em>Substance Definition Structure Isotope Molecular Weight</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fhiRCore.profiles.impl.SubstanceDefinitionStructureIsotopeMolecularWeightImpl
		 * @see fhiRCore.profiles.impl.ProfilesPackageImpl#getSubstanceDefinitionStructureIsotopeMolecularWeight()
		 * @generated
		 */
		EClass SUBSTANCE_DEFINITION_STRUCTURE_ISOTOPE_MOLECULAR_WEIGHT = eINSTANCE.getSubstanceDefinitionStructureIsotopeMolecularWeight();

		/**
		 * The meta object literal for the '<em><b>Method</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBSTANCE_DEFINITION_STRUCTURE_ISOTOPE_MOLECULAR_WEIGHT__METHOD = eINSTANCE.getSubstanceDefinitionStructureIsotopeMolecularWeight_Method();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBSTANCE_DEFINITION_STRUCTURE_ISOTOPE_MOLECULAR_WEIGHT__TYPE = eINSTANCE.getSubstanceDefinitionStructureIsotopeMolecularWeight_Type();

		/**
		 * The meta object literal for the '<em><b>Amount</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBSTANCE_DEFINITION_STRUCTURE_ISOTOPE_MOLECULAR_WEIGHT__AMOUNT = eINSTANCE.getSubstanceDefinitionStructureIsotopeMolecularWeight_Amount();

		/**
		 * The meta object literal for the '{@link fhiRCore.profiles.impl.SubstanceDefinitionStructureRepresentationImpl <em>Substance Definition Structure Representation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fhiRCore.profiles.impl.SubstanceDefinitionStructureRepresentationImpl
		 * @see fhiRCore.profiles.impl.ProfilesPackageImpl#getSubstanceDefinitionStructureRepresentation()
		 * @generated
		 */
		EClass SUBSTANCE_DEFINITION_STRUCTURE_REPRESENTATION = eINSTANCE.getSubstanceDefinitionStructureRepresentation();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBSTANCE_DEFINITION_STRUCTURE_REPRESENTATION__TYPE = eINSTANCE.getSubstanceDefinitionStructureRepresentation_Type();

		/**
		 * The meta object literal for the '<em><b>Representation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBSTANCE_DEFINITION_STRUCTURE_REPRESENTATION__REPRESENTATION = eINSTANCE.getSubstanceDefinitionStructureRepresentation_Representation();

		/**
		 * The meta object literal for the '<em><b>Attachment</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBSTANCE_DEFINITION_STRUCTURE_REPRESENTATION__ATTACHMENT = eINSTANCE.getSubstanceDefinitionStructureRepresentation_Attachment();

		/**
		 * The meta object literal for the '{@link fhiRCore.profiles.impl.SubstanceDefinitionCodeImpl <em>Substance Definition Code</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fhiRCore.profiles.impl.SubstanceDefinitionCodeImpl
		 * @see fhiRCore.profiles.impl.ProfilesPackageImpl#getSubstanceDefinitionCode()
		 * @generated
		 */
		EClass SUBSTANCE_DEFINITION_CODE = eINSTANCE.getSubstanceDefinitionCode();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBSTANCE_DEFINITION_CODE__CODE = eINSTANCE.getSubstanceDefinitionCode_Code();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBSTANCE_DEFINITION_CODE__STATUS = eINSTANCE.getSubstanceDefinitionCode_Status();

		/**
		 * The meta object literal for the '<em><b>Status Date</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBSTANCE_DEFINITION_CODE__STATUS_DATE = eINSTANCE.getSubstanceDefinitionCode_StatusDate();

		/**
		 * The meta object literal for the '<em><b>Comment</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBSTANCE_DEFINITION_CODE__COMMENT = eINSTANCE.getSubstanceDefinitionCode_Comment();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBSTANCE_DEFINITION_CODE__SOURCE = eINSTANCE.getSubstanceDefinitionCode_Source();

		/**
		 * The meta object literal for the '{@link fhiRCore.profiles.impl.SubstanceDefinitionNameImpl <em>Substance Definition Name</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fhiRCore.profiles.impl.SubstanceDefinitionNameImpl
		 * @see fhiRCore.profiles.impl.ProfilesPackageImpl#getSubstanceDefinitionName()
		 * @generated
		 */
		EClass SUBSTANCE_DEFINITION_NAME = eINSTANCE.getSubstanceDefinitionName();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBSTANCE_DEFINITION_NAME__NAME = eINSTANCE.getSubstanceDefinitionName_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBSTANCE_DEFINITION_NAME__TYPE = eINSTANCE.getSubstanceDefinitionName_Type();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBSTANCE_DEFINITION_NAME__STATUS = eINSTANCE.getSubstanceDefinitionName_Status();

		/**
		 * The meta object literal for the '<em><b>Preferred</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBSTANCE_DEFINITION_NAME__PREFERRED = eINSTANCE.getSubstanceDefinitionName_Preferred();

		/**
		 * The meta object literal for the '<em><b>Language</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBSTANCE_DEFINITION_NAME__LANGUAGE = eINSTANCE.getSubstanceDefinitionName_Language();

		/**
		 * The meta object literal for the '<em><b>Domain</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBSTANCE_DEFINITION_NAME__DOMAIN = eINSTANCE.getSubstanceDefinitionName_Domain();

		/**
		 * The meta object literal for the '<em><b>Jurisdiction</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBSTANCE_DEFINITION_NAME__JURISDICTION = eINSTANCE.getSubstanceDefinitionName_Jurisdiction();

		/**
		 * The meta object literal for the '<em><b>Synonym</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBSTANCE_DEFINITION_NAME__SYNONYM = eINSTANCE.getSubstanceDefinitionName_Synonym();

		/**
		 * The meta object literal for the '<em><b>Translation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBSTANCE_DEFINITION_NAME__TRANSLATION = eINSTANCE.getSubstanceDefinitionName_Translation();

		/**
		 * The meta object literal for the '<em><b>Official</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBSTANCE_DEFINITION_NAME__OFFICIAL = eINSTANCE.getSubstanceDefinitionName_Official();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBSTANCE_DEFINITION_NAME__SOURCE = eINSTANCE.getSubstanceDefinitionName_Source();

		/**
		 * The meta object literal for the '{@link fhiRCore.profiles.impl.SubstanceDefinitionNameOfficialImpl <em>Substance Definition Name Official</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fhiRCore.profiles.impl.SubstanceDefinitionNameOfficialImpl
		 * @see fhiRCore.profiles.impl.ProfilesPackageImpl#getSubstanceDefinitionNameOfficial()
		 * @generated
		 */
		EClass SUBSTANCE_DEFINITION_NAME_OFFICIAL = eINSTANCE.getSubstanceDefinitionNameOfficial();

		/**
		 * The meta object literal for the '<em><b>Authority</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBSTANCE_DEFINITION_NAME_OFFICIAL__AUTHORITY = eINSTANCE.getSubstanceDefinitionNameOfficial_Authority();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBSTANCE_DEFINITION_NAME_OFFICIAL__STATUS = eINSTANCE.getSubstanceDefinitionNameOfficial_Status();

		/**
		 * The meta object literal for the '<em><b>Date</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBSTANCE_DEFINITION_NAME_OFFICIAL__DATE = eINSTANCE.getSubstanceDefinitionNameOfficial_Date();

		/**
		 * The meta object literal for the '{@link fhiRCore.profiles.impl.SubstanceDefinitionRelationshipImpl <em>Substance Definition Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fhiRCore.profiles.impl.SubstanceDefinitionRelationshipImpl
		 * @see fhiRCore.profiles.impl.ProfilesPackageImpl#getSubstanceDefinitionRelationship()
		 * @generated
		 */
		EClass SUBSTANCE_DEFINITION_RELATIONSHIP = eINSTANCE.getSubstanceDefinitionRelationship();

		/**
		 * The meta object literal for the '<em><b>Substancex</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBSTANCE_DEFINITION_RELATIONSHIP__SUBSTANCEX = eINSTANCE.getSubstanceDefinitionRelationship_Substancex();

		/**
		 * The meta object literal for the '<em><b>Relationship</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBSTANCE_DEFINITION_RELATIONSHIP__RELATIONSHIP = eINSTANCE.getSubstanceDefinitionRelationship_Relationship();

		/**
		 * The meta object literal for the '<em><b>Is Defining</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBSTANCE_DEFINITION_RELATIONSHIP__IS_DEFINING = eINSTANCE.getSubstanceDefinitionRelationship_IsDefining();

		/**
		 * The meta object literal for the '<em><b>Amountx</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBSTANCE_DEFINITION_RELATIONSHIP__AMOUNTX = eINSTANCE.getSubstanceDefinitionRelationship_Amountx();

		/**
		 * The meta object literal for the '<em><b>Amount Ratio Low Limit</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBSTANCE_DEFINITION_RELATIONSHIP__AMOUNT_RATIO_LOW_LIMIT = eINSTANCE.getSubstanceDefinitionRelationship_AmountRatioLowLimit();

		/**
		 * The meta object literal for the '<em><b>Amount Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBSTANCE_DEFINITION_RELATIONSHIP__AMOUNT_TYPE = eINSTANCE.getSubstanceDefinitionRelationship_AmountType();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBSTANCE_DEFINITION_RELATIONSHIP__SOURCE = eINSTANCE.getSubstanceDefinitionRelationship_Source();

		/**
		 * The meta object literal for the '{@link fhiRCore.profiles.impl.ProvenancerelevanthistoryImpl <em>Provenancerelevanthistory</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fhiRCore.profiles.impl.ProvenancerelevanthistoryImpl
		 * @see fhiRCore.profiles.impl.ProfilesPackageImpl#getProvenancerelevanthistory()
		 * @generated
		 */
		EClass PROVENANCERELEVANTHISTORY = eINSTANCE.getProvenancerelevanthistory();

		/**
		 * The meta object literal for the '<em><b>Author</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROVENANCERELEVANTHISTORY__AUTHOR = eINSTANCE.getProvenancerelevanthistory_Author();

		/**
		 * The meta object literal for the '{@link fhiRCore.profiles.impl.ProvenancerelevanthistoryAgent1Impl <em>Provenancerelevanthistory Agent1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fhiRCore.profiles.impl.ProvenancerelevanthistoryAgent1Impl
		 * @see fhiRCore.profiles.impl.ProfilesPackageImpl#getProvenancerelevanthistoryAgent1()
		 * @generated
		 */
		EClass PROVENANCERELEVANTHISTORY_AGENT1 = eINSTANCE.getProvenancerelevanthistoryAgent1();

		/**
		 * The meta object literal for the '{@link fhiRCore.profiles.impl.CatalogImpl <em>Catalog</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fhiRCore.profiles.impl.CatalogImpl
		 * @see fhiRCore.profiles.impl.ProfilesPackageImpl#getCatalog()
		 * @generated
		 */
		EClass CATALOG = eINSTANCE.getCatalog();

		/**
		 * The meta object literal for the '{@link fhiRCore.profiles.impl.CatalogSection1Impl <em>Catalog Section1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fhiRCore.profiles.impl.CatalogSection1Impl
		 * @see fhiRCore.profiles.impl.ProfilesPackageImpl#getCatalogSection1()
		 * @generated
		 */
		EClass CATALOG_SECTION1 = eINSTANCE.getCatalogSection1();

		/**
		 * The meta object literal for the '{@link fhiRCore.profiles.impl.BodyweightImpl <em>Bodyweight</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fhiRCore.profiles.impl.BodyweightImpl
		 * @see fhiRCore.profiles.impl.ProfilesPackageImpl#getBodyweight()
		 * @generated
		 */
		EClass BODYWEIGHT = eINSTANCE.getBodyweight();

		/**
		 * The meta object literal for the '<em><b>Value Quantity</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BODYWEIGHT__VALUE_QUANTITY = eINSTANCE.getBodyweight_ValueQuantity();

		/**
		 * The meta object literal for the '{@link fhiRCore.profiles.impl.BodyweightCodeableConcept1Impl <em>Bodyweight Codeable Concept1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fhiRCore.profiles.impl.BodyweightCodeableConcept1Impl
		 * @see fhiRCore.profiles.impl.ProfilesPackageImpl#getBodyweightCodeableConcept1()
		 * @generated
		 */
		EClass BODYWEIGHT_CODEABLE_CONCEPT1 = eINSTANCE.getBodyweightCodeableConcept1();

		/**
		 * The meta object literal for the '<em><b>Body Weight Code</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BODYWEIGHT_CODEABLE_CONCEPT1__BODY_WEIGHT_CODE = eINSTANCE.getBodyweightCodeableConcept1_BodyWeightCode();

		/**
		 * The meta object literal for the '{@link fhiRCore.profiles.impl.BodyweightCodeableConcept1Coding1Impl <em>Bodyweight Codeable Concept1 Coding1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fhiRCore.profiles.impl.BodyweightCodeableConcept1Coding1Impl
		 * @see fhiRCore.profiles.impl.ProfilesPackageImpl#getBodyweightCodeableConcept1Coding1()
		 * @generated
		 */
		EClass BODYWEIGHT_CODEABLE_CONCEPT1_CODING1 = eINSTANCE.getBodyweightCodeableConcept1Coding1();

		/**
		 * The meta object literal for the '{@link fhiRCore.profiles.impl.BodyweightQuantity1Impl <em>Bodyweight Quantity1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fhiRCore.profiles.impl.BodyweightQuantity1Impl
		 * @see fhiRCore.profiles.impl.ProfilesPackageImpl#getBodyweightQuantity1()
		 * @generated
		 */
		EClass BODYWEIGHT_QUANTITY1 = eINSTANCE.getBodyweightQuantity1();

		/**
		 * The meta object literal for the '{@link fhiRCore.profiles.impl.BpImpl <em>Bp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fhiRCore.profiles.impl.BpImpl
		 * @see fhiRCore.profiles.impl.ProfilesPackageImpl#getBp()
		 * @generated
		 */
		EClass BP = eINSTANCE.getBp();

		/**
		 * The meta object literal for the '<em><b>Systolic Bp</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BP__SYSTOLIC_BP = eINSTANCE.getBp_SystolicBp();

		/**
		 * The meta object literal for the '<em><b>Diastolic Bp</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BP__DIASTOLIC_BP = eINSTANCE.getBp_DiastolicBp();

		/**
		 * The meta object literal for the '{@link fhiRCore.profiles.impl.BpCodeableConcept1Impl <em>Bp Codeable Concept1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fhiRCore.profiles.impl.BpCodeableConcept1Impl
		 * @see fhiRCore.profiles.impl.ProfilesPackageImpl#getBpCodeableConcept1()
		 * @generated
		 */
		EClass BP_CODEABLE_CONCEPT1 = eINSTANCE.getBpCodeableConcept1();

		/**
		 * The meta object literal for the '<em><b>Bp Code</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BP_CODEABLE_CONCEPT1__BP_CODE = eINSTANCE.getBpCodeableConcept1_BpCode();

		/**
		 * The meta object literal for the '{@link fhiRCore.profiles.impl.BpCodeableConcept1Coding1Impl <em>Bp Codeable Concept1 Coding1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fhiRCore.profiles.impl.BpCodeableConcept1Coding1Impl
		 * @see fhiRCore.profiles.impl.ProfilesPackageImpl#getBpCodeableConcept1Coding1()
		 * @generated
		 */
		EClass BP_CODEABLE_CONCEPT1_CODING1 = eINSTANCE.getBpCodeableConcept1Coding1();

		/**
		 * The meta object literal for the '{@link fhiRCore.profiles.impl.BpComponent11Impl <em>Bp Component11</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fhiRCore.profiles.impl.BpComponent11Impl
		 * @see fhiRCore.profiles.impl.ProfilesPackageImpl#getBpComponent11()
		 * @generated
		 */
		EClass BP_COMPONENT11 = eINSTANCE.getBpComponent11();

		/**
		 * The meta object literal for the '<em><b>Value Quantity</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BP_COMPONENT11__VALUE_QUANTITY = eINSTANCE.getBpComponent11_ValueQuantity();

		/**
		 * The meta object literal for the '{@link fhiRCore.profiles.impl.BpComponent11CodeableConcept1Impl <em>Bp Component11 Codeable Concept1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fhiRCore.profiles.impl.BpComponent11CodeableConcept1Impl
		 * @see fhiRCore.profiles.impl.ProfilesPackageImpl#getBpComponent11CodeableConcept1()
		 * @generated
		 */
		EClass BP_COMPONENT11_CODEABLE_CONCEPT1 = eINSTANCE.getBpComponent11CodeableConcept1();

		/**
		 * The meta object literal for the '<em><b>Sbp Code</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BP_COMPONENT11_CODEABLE_CONCEPT1__SBP_CODE = eINSTANCE.getBpComponent11CodeableConcept1_SbpCode();

		/**
		 * The meta object literal for the '{@link fhiRCore.profiles.impl.BpComponent11CodeableConcept1Coding1Impl <em>Bp Component11 Codeable Concept1 Coding1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fhiRCore.profiles.impl.BpComponent11CodeableConcept1Coding1Impl
		 * @see fhiRCore.profiles.impl.ProfilesPackageImpl#getBpComponent11CodeableConcept1Coding1()
		 * @generated
		 */
		EClass BP_COMPONENT11_CODEABLE_CONCEPT1_CODING1 = eINSTANCE.getBpComponent11CodeableConcept1Coding1();

		/**
		 * The meta object literal for the '{@link fhiRCore.profiles.impl.BpComponent11Quantity1Impl <em>Bp Component11 Quantity1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fhiRCore.profiles.impl.BpComponent11Quantity1Impl
		 * @see fhiRCore.profiles.impl.ProfilesPackageImpl#getBpComponent11Quantity1()
		 * @generated
		 */
		EClass BP_COMPONENT11_QUANTITY1 = eINSTANCE.getBpComponent11Quantity1();

		/**
		 * The meta object literal for the '{@link fhiRCore.profiles.impl.BpComponent12Impl <em>Bp Component12</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fhiRCore.profiles.impl.BpComponent12Impl
		 * @see fhiRCore.profiles.impl.ProfilesPackageImpl#getBpComponent12()
		 * @generated
		 */
		EClass BP_COMPONENT12 = eINSTANCE.getBpComponent12();

		/**
		 * The meta object literal for the '<em><b>Value Quantity</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BP_COMPONENT12__VALUE_QUANTITY = eINSTANCE.getBpComponent12_ValueQuantity();

		/**
		 * The meta object literal for the '{@link fhiRCore.profiles.impl.BpComponent12CodeableConcept1Impl <em>Bp Component12 Codeable Concept1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fhiRCore.profiles.impl.BpComponent12CodeableConcept1Impl
		 * @see fhiRCore.profiles.impl.ProfilesPackageImpl#getBpComponent12CodeableConcept1()
		 * @generated
		 */
		EClass BP_COMPONENT12_CODEABLE_CONCEPT1 = eINSTANCE.getBpComponent12CodeableConcept1();

		/**
		 * The meta object literal for the '<em><b>Dbp Code</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BP_COMPONENT12_CODEABLE_CONCEPT1__DBP_CODE = eINSTANCE.getBpComponent12CodeableConcept1_DbpCode();

		/**
		 * The meta object literal for the '{@link fhiRCore.profiles.impl.BpComponent12CodeableConcept1Coding1Impl <em>Bp Component12 Codeable Concept1 Coding1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fhiRCore.profiles.impl.BpComponent12CodeableConcept1Coding1Impl
		 * @see fhiRCore.profiles.impl.ProfilesPackageImpl#getBpComponent12CodeableConcept1Coding1()
		 * @generated
		 */
		EClass BP_COMPONENT12_CODEABLE_CONCEPT1_CODING1 = eINSTANCE.getBpComponent12CodeableConcept1Coding1();

		/**
		 * The meta object literal for the '{@link fhiRCore.profiles.impl.BpComponent12Quantity1Impl <em>Bp Component12 Quantity1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fhiRCore.profiles.impl.BpComponent12Quantity1Impl
		 * @see fhiRCore.profiles.impl.ProfilesPackageImpl#getBpComponent12Quantity1()
		 * @generated
		 */
		EClass BP_COMPONENT12_QUANTITY1 = eINSTANCE.getBpComponent12Quantity1();

		/**
		 * The meta object literal for the '{@link fhiRCore.profiles.impl.ServicerequestgeneticsImpl <em>Servicerequestgenetics</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fhiRCore.profiles.impl.ServicerequestgeneticsImpl
		 * @see fhiRCore.profiles.impl.ProfilesPackageImpl#getServicerequestgenetics()
		 * @generated
		 */
		EClass SERVICEREQUESTGENETICS = eINSTANCE.getServicerequestgenetics();

		/**
		 * The meta object literal for the '{@link fhiRCore.profiles.impl.ShareablevaluesetImpl <em>Shareablevalueset</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fhiRCore.profiles.impl.ShareablevaluesetImpl
		 * @see fhiRCore.profiles.impl.ProfilesPackageImpl#getShareablevalueset()
		 * @generated
		 */
		EClass SHAREABLEVALUESET = eINSTANCE.getShareablevalueset();

		/**
		 * The meta object literal for the '{@link fhiRCore.profiles.impl.GroupdefinitionImpl <em>Groupdefinition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fhiRCore.profiles.impl.GroupdefinitionImpl
		 * @see fhiRCore.profiles.impl.ProfilesPackageImpl#getGroupdefinition()
		 * @generated
		 */
		EClass GROUPDEFINITION = eINSTANCE.getGroupdefinition();

		/**
		 * The meta object literal for the '{@link fhiRCore.profiles.impl.ActualgroupImpl <em>Actualgroup</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fhiRCore.profiles.impl.ActualgroupImpl
		 * @see fhiRCore.profiles.impl.ProfilesPackageImpl#getActualgroup()
		 * @generated
		 */
		EClass ACTUALGROUP = eINSTANCE.getActualgroup();

		/**
		 * The meta object literal for the '{@link fhiRCore.profiles.impl.HlaresultImpl <em>Hlaresult</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fhiRCore.profiles.impl.HlaresultImpl
		 * @see fhiRCore.profiles.impl.ProfilesPackageImpl#getHlaresult()
		 * @generated
		 */
		EClass HLARESULT = eINSTANCE.getHlaresult();

		/**
		 * The meta object literal for the '{@link fhiRCore.profiles.impl.CdshooksrequestgroupImpl <em>Cdshooksrequestgroup</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fhiRCore.profiles.impl.CdshooksrequestgroupImpl
		 * @see fhiRCore.profiles.impl.ProfilesPackageImpl#getCdshooksrequestgroup()
		 * @generated
		 */
		EClass CDSHOOKSREQUESTGROUP = eINSTANCE.getCdshooksrequestgroup();

		/**
		 * The meta object literal for the '{@link fhiRCore.profiles.impl.CdshooksrequestgroupAction1Impl <em>Cdshooksrequestgroup Action1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fhiRCore.profiles.impl.CdshooksrequestgroupAction1Impl
		 * @see fhiRCore.profiles.impl.ProfilesPackageImpl#getCdshooksrequestgroupAction1()
		 * @generated
		 */
		EClass CDSHOOKSREQUESTGROUP_ACTION1 = eINSTANCE.getCdshooksrequestgroupAction1();

		/**
		 * The meta object literal for the '{@link fhiRCore.profiles.impl.ObservationgeneticsImpl <em>Observationgenetics</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fhiRCore.profiles.impl.ObservationgeneticsImpl
		 * @see fhiRCore.profiles.impl.ProfilesPackageImpl#getObservationgenetics()
		 * @generated
		 */
		EClass OBSERVATIONGENETICS = eINSTANCE.getObservationgenetics();

	}

} //ProfilesPackage
