/**
 */
package org.hl7.cdsdt.r2.impl;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.hl7.cdsdt.r2.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class R2FactoryImpl extends EFactoryImpl implements R2Factory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static R2Factory init() {
		try {
			R2Factory theR2Factory = (R2Factory)EPackage.Registry.INSTANCE.getEFactory(R2Package.eNS_URI);
			if (theR2Factory != null) {
				return theR2Factory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new R2FactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public R2FactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case R2Package.AD: return createAD();
			case R2Package.ADXP: return createADXP();
			case R2Package.BL: return createBL();
			case R2Package.CD: return createCD();
			case R2Package.CO: return createCO();
			case R2Package.CS: return createCS();
			case R2Package.ED: return createED();
			case R2Package.EN: return createEN();
			case R2Package.ENXP: return createENXP();
			case R2Package.II: return createII();
			case R2Package.INT: return createINT();
			case R2Package.IVL: return createIVL();
			case R2Package.IVLCO: return createIVLCO();
			case R2Package.IVLINT: return createIVLINT();
			case R2Package.IVLPQ: return createIVLPQ();
			case R2Package.IVLQTY: return createIVLQTY();
			case R2Package.IVLREAL: return createIVLREAL();
			case R2Package.IVLTS: return createIVLTS();
			case R2Package.PIVLTS: return createPIVLTS();
			case R2Package.PQ: return createPQ();
			case R2Package.REAL: return createREAL();
			case R2Package.RTO: return createRTO();
			case R2Package.ST: return createST();
			case R2Package.TEL: return createTEL();
			case R2Package.TS: return createTS();
			case R2Package.XP: return createXP();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case R2Package.ADDRESS_PART_TYPE:
				return createAddressPartTypeFromString(eDataType, initialValue);
			case R2Package.CALENDAR_CYCLE:
				return createCalendarCycleFromString(eDataType, initialValue);
			case R2Package.COMPRESSION:
				return createCompressionFromString(eDataType, initialValue);
			case R2Package.ENTITY_NAME_PART_QUALIFIER:
				return createEntityNamePartQualifierFromString(eDataType, initialValue);
			case R2Package.ENTITY_NAME_PART_TYPE:
				return createEntityNamePartTypeFromString(eDataType, initialValue);
			case R2Package.ENTITY_NAME_USE:
				return createEntityNameUseFromString(eDataType, initialValue);
			case R2Package.INTEGRITY_CHECK_ALGORITHM:
				return createIntegrityCheckAlgorithmFromString(eDataType, initialValue);
			case R2Package.POSTAL_ADDRESS_USE:
				return createPostalAddressUseFromString(eDataType, initialValue);
			case R2Package.TELECOMMUNICATION_ADDRESS_USE:
				return createTelecommunicationAddressUseFromString(eDataType, initialValue);
			case R2Package.TELECOMMUNICATION_CAPABILITY:
				return createTelecommunicationCapabilityFromString(eDataType, initialValue);
			case R2Package.ADDRESS_PART_TYPE_OBJECT:
				return createAddressPartTypeObjectFromString(eDataType, initialValue);
			case R2Package.CALENDAR_CYCLE_OBJECT:
				return createCalendarCycleObjectFromString(eDataType, initialValue);
			case R2Package.CODE:
				return createCodeFromString(eDataType, initialValue);
			case R2Package.COMPRESSION_OBJECT:
				return createCompressionObjectFromString(eDataType, initialValue);
			case R2Package.DECIMAL:
				return createDecimalFromString(eDataType, initialValue);
			case R2Package.DECIMAL_OBJECT:
				return createDecimalObjectFromString(eDataType, initialValue);
			case R2Package.ENTITY_NAME_PART_QUALIFIER_OBJECT:
				return createEntityNamePartQualifierObjectFromString(eDataType, initialValue);
			case R2Package.ENTITY_NAME_PART_TYPE_OBJECT:
				return createEntityNamePartTypeObjectFromString(eDataType, initialValue);
			case R2Package.ENTITY_NAME_USE_OBJECT:
				return createEntityNameUseObjectFromString(eDataType, initialValue);
			case R2Package.INTEGRITY_CHECK_ALGORITHM_OBJECT:
				return createIntegrityCheckAlgorithmObjectFromString(eDataType, initialValue);
			case R2Package.POSTAL_ADDRESS_USE_OBJECT:
				return createPostalAddressUseObjectFromString(eDataType, initialValue);
			case R2Package.SET_ENTITY_NAME_PART_QUALIFIER:
				return createSetEntityNamePartQualifierFromString(eDataType, initialValue);
			case R2Package.SET_ENTITY_NAME_USE:
				return createSetEntityNameUseFromString(eDataType, initialValue);
			case R2Package.SET_POSTAL_ADDRESS_USE:
				return createSetPostalAddressUseFromString(eDataType, initialValue);
			case R2Package.SET_TELECOMMUNICATION_ADDRESS_USE:
				return createSetTelecommunicationAddressUseFromString(eDataType, initialValue);
			case R2Package.SET_TELECOMMUNICATION_CAPABILITY:
				return createSetTelecommunicationCapabilityFromString(eDataType, initialValue);
			case R2Package.TELECOMMUNICATION_ADDRESS_USE_OBJECT:
				return createTelecommunicationAddressUseObjectFromString(eDataType, initialValue);
			case R2Package.TELECOMMUNICATION_CAPABILITY_OBJECT:
				return createTelecommunicationCapabilityObjectFromString(eDataType, initialValue);
			case R2Package.TIME_STAMP:
				return createTimeStampFromString(eDataType, initialValue);
			case R2Package.UID:
				return createUidFromString(eDataType, initialValue);
			case R2Package.URI:
				return createUriFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case R2Package.ADDRESS_PART_TYPE:
				return convertAddressPartTypeToString(eDataType, instanceValue);
			case R2Package.CALENDAR_CYCLE:
				return convertCalendarCycleToString(eDataType, instanceValue);
			case R2Package.COMPRESSION:
				return convertCompressionToString(eDataType, instanceValue);
			case R2Package.ENTITY_NAME_PART_QUALIFIER:
				return convertEntityNamePartQualifierToString(eDataType, instanceValue);
			case R2Package.ENTITY_NAME_PART_TYPE:
				return convertEntityNamePartTypeToString(eDataType, instanceValue);
			case R2Package.ENTITY_NAME_USE:
				return convertEntityNameUseToString(eDataType, instanceValue);
			case R2Package.INTEGRITY_CHECK_ALGORITHM:
				return convertIntegrityCheckAlgorithmToString(eDataType, instanceValue);
			case R2Package.POSTAL_ADDRESS_USE:
				return convertPostalAddressUseToString(eDataType, instanceValue);
			case R2Package.TELECOMMUNICATION_ADDRESS_USE:
				return convertTelecommunicationAddressUseToString(eDataType, instanceValue);
			case R2Package.TELECOMMUNICATION_CAPABILITY:
				return convertTelecommunicationCapabilityToString(eDataType, instanceValue);
			case R2Package.ADDRESS_PART_TYPE_OBJECT:
				return convertAddressPartTypeObjectToString(eDataType, instanceValue);
			case R2Package.CALENDAR_CYCLE_OBJECT:
				return convertCalendarCycleObjectToString(eDataType, instanceValue);
			case R2Package.CODE:
				return convertCodeToString(eDataType, instanceValue);
			case R2Package.COMPRESSION_OBJECT:
				return convertCompressionObjectToString(eDataType, instanceValue);
			case R2Package.DECIMAL:
				return convertDecimalToString(eDataType, instanceValue);
			case R2Package.DECIMAL_OBJECT:
				return convertDecimalObjectToString(eDataType, instanceValue);
			case R2Package.ENTITY_NAME_PART_QUALIFIER_OBJECT:
				return convertEntityNamePartQualifierObjectToString(eDataType, instanceValue);
			case R2Package.ENTITY_NAME_PART_TYPE_OBJECT:
				return convertEntityNamePartTypeObjectToString(eDataType, instanceValue);
			case R2Package.ENTITY_NAME_USE_OBJECT:
				return convertEntityNameUseObjectToString(eDataType, instanceValue);
			case R2Package.INTEGRITY_CHECK_ALGORITHM_OBJECT:
				return convertIntegrityCheckAlgorithmObjectToString(eDataType, instanceValue);
			case R2Package.POSTAL_ADDRESS_USE_OBJECT:
				return convertPostalAddressUseObjectToString(eDataType, instanceValue);
			case R2Package.SET_ENTITY_NAME_PART_QUALIFIER:
				return convertSetEntityNamePartQualifierToString(eDataType, instanceValue);
			case R2Package.SET_ENTITY_NAME_USE:
				return convertSetEntityNameUseToString(eDataType, instanceValue);
			case R2Package.SET_POSTAL_ADDRESS_USE:
				return convertSetPostalAddressUseToString(eDataType, instanceValue);
			case R2Package.SET_TELECOMMUNICATION_ADDRESS_USE:
				return convertSetTelecommunicationAddressUseToString(eDataType, instanceValue);
			case R2Package.SET_TELECOMMUNICATION_CAPABILITY:
				return convertSetTelecommunicationCapabilityToString(eDataType, instanceValue);
			case R2Package.TELECOMMUNICATION_ADDRESS_USE_OBJECT:
				return convertTelecommunicationAddressUseObjectToString(eDataType, instanceValue);
			case R2Package.TELECOMMUNICATION_CAPABILITY_OBJECT:
				return convertTelecommunicationCapabilityObjectToString(eDataType, instanceValue);
			case R2Package.TIME_STAMP:
				return convertTimeStampToString(eDataType, instanceValue);
			case R2Package.UID:
				return convertUidToString(eDataType, instanceValue);
			case R2Package.URI:
				return convertUriToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AD createAD() {
		ADImpl ad = new ADImpl();
		return ad;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ADXP createADXP() {
		ADXPImpl adxp = new ADXPImpl();
		return adxp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BL createBL() {
		BLImpl bl = new BLImpl();
		return bl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CD createCD() {
		CDImpl cd = new CDImpl();
		return cd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CO createCO() {
		COImpl co = new COImpl();
		return co;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CS createCS() {
		CSImpl cs = new CSImpl();
		return cs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ED createED() {
		EDImpl ed = new EDImpl();
		return ed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EN createEN() {
		ENImpl en = new ENImpl();
		return en;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENXP createENXP() {
		ENXPImpl enxp = new ENXPImpl();
		return enxp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public II createII() {
		IIImpl ii = new IIImpl();
		return ii;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public INT createINT() {
		INTImpl int_ = new INTImpl();
		return int_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IVL createIVL() {
		IVLImpl ivl = new IVLImpl();
		return ivl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IVLCO createIVLCO() {
		IVLCOImpl ivlco = new IVLCOImpl();
		return ivlco;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IVLINT createIVLINT() {
		IVLINTImpl ivlint = new IVLINTImpl();
		return ivlint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IVLPQ createIVLPQ() {
		IVLPQImpl ivlpq = new IVLPQImpl();
		return ivlpq;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IVLQTY createIVLQTY() {
		IVLQTYImpl ivlqty = new IVLQTYImpl();
		return ivlqty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IVLREAL createIVLREAL() {
		IVLREALImpl ivlreal = new IVLREALImpl();
		return ivlreal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IVLTS createIVLTS() {
		IVLTSImpl ivlts = new IVLTSImpl();
		return ivlts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PIVLTS createPIVLTS() {
		PIVLTSImpl pivlts = new PIVLTSImpl();
		return pivlts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PQ createPQ() {
		PQImpl pq = new PQImpl();
		return pq;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public REAL createREAL() {
		REALImpl real = new REALImpl();
		return real;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RTO createRTO() {
		RTOImpl rto = new RTOImpl();
		return rto;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ST createST() {
		STImpl st = new STImpl();
		return st;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TEL createTEL() {
		TELImpl tel = new TELImpl();
		return tel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TS createTS() {
		TSImpl ts = new TSImpl();
		return ts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XP createXP() {
		XPImpl xp = new XPImpl();
		return xp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddressPartType createAddressPartTypeFromString(EDataType eDataType, String initialValue) {
		AddressPartType result = AddressPartType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAddressPartTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CalendarCycle createCalendarCycleFromString(EDataType eDataType, String initialValue) {
		CalendarCycle result = CalendarCycle.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCalendarCycleToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Compression createCompressionFromString(EDataType eDataType, String initialValue) {
		Compression result = Compression.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCompressionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityNamePartQualifier createEntityNamePartQualifierFromString(EDataType eDataType, String initialValue) {
		EntityNamePartQualifier result = EntityNamePartQualifier.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEntityNamePartQualifierToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityNamePartType createEntityNamePartTypeFromString(EDataType eDataType, String initialValue) {
		EntityNamePartType result = EntityNamePartType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEntityNamePartTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityNameUse createEntityNameUseFromString(EDataType eDataType, String initialValue) {
		EntityNameUse result = EntityNameUse.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEntityNameUseToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegrityCheckAlgorithm createIntegrityCheckAlgorithmFromString(EDataType eDataType, String initialValue) {
		IntegrityCheckAlgorithm result = IntegrityCheckAlgorithm.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIntegrityCheckAlgorithmToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PostalAddressUse createPostalAddressUseFromString(EDataType eDataType, String initialValue) {
		PostalAddressUse result = PostalAddressUse.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPostalAddressUseToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TelecommunicationAddressUse createTelecommunicationAddressUseFromString(EDataType eDataType, String initialValue) {
		TelecommunicationAddressUse result = TelecommunicationAddressUse.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTelecommunicationAddressUseToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TelecommunicationCapability createTelecommunicationCapabilityFromString(EDataType eDataType, String initialValue) {
		TelecommunicationCapability result = TelecommunicationCapability.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTelecommunicationCapabilityToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddressPartType createAddressPartTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createAddressPartTypeFromString(R2Package.Literals.ADDRESS_PART_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAddressPartTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertAddressPartTypeToString(R2Package.Literals.ADDRESS_PART_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CalendarCycle createCalendarCycleObjectFromString(EDataType eDataType, String initialValue) {
		return createCalendarCycleFromString(R2Package.Literals.CALENDAR_CYCLE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCalendarCycleObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCalendarCycleToString(R2Package.Literals.CALENDAR_CYCLE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createCodeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCodeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Compression createCompressionObjectFromString(EDataType eDataType, String initialValue) {
		return createCompressionFromString(R2Package.Literals.COMPRESSION, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCompressionObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCompressionToString(R2Package.Literals.COMPRESSION, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createDecimalFromString(EDataType eDataType, String initialValue) {
		return (Double)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DOUBLE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDecimalToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DOUBLE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createDecimalObjectFromString(EDataType eDataType, String initialValue) {
		return createDecimalFromString(R2Package.Literals.DECIMAL, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDecimalObjectToString(EDataType eDataType, Object instanceValue) {
		return convertDecimalToString(R2Package.Literals.DECIMAL, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityNamePartQualifier createEntityNamePartQualifierObjectFromString(EDataType eDataType, String initialValue) {
		return createEntityNamePartQualifierFromString(R2Package.Literals.ENTITY_NAME_PART_QUALIFIER, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEntityNamePartQualifierObjectToString(EDataType eDataType, Object instanceValue) {
		return convertEntityNamePartQualifierToString(R2Package.Literals.ENTITY_NAME_PART_QUALIFIER, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityNamePartType createEntityNamePartTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createEntityNamePartTypeFromString(R2Package.Literals.ENTITY_NAME_PART_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEntityNamePartTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertEntityNamePartTypeToString(R2Package.Literals.ENTITY_NAME_PART_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityNameUse createEntityNameUseObjectFromString(EDataType eDataType, String initialValue) {
		return createEntityNameUseFromString(R2Package.Literals.ENTITY_NAME_USE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEntityNameUseObjectToString(EDataType eDataType, Object instanceValue) {
		return convertEntityNameUseToString(R2Package.Literals.ENTITY_NAME_USE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegrityCheckAlgorithm createIntegrityCheckAlgorithmObjectFromString(EDataType eDataType, String initialValue) {
		return createIntegrityCheckAlgorithmFromString(R2Package.Literals.INTEGRITY_CHECK_ALGORITHM, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIntegrityCheckAlgorithmObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIntegrityCheckAlgorithmToString(R2Package.Literals.INTEGRITY_CHECK_ALGORITHM, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PostalAddressUse createPostalAddressUseObjectFromString(EDataType eDataType, String initialValue) {
		return createPostalAddressUseFromString(R2Package.Literals.POSTAL_ADDRESS_USE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPostalAddressUseObjectToString(EDataType eDataType, Object instanceValue) {
		return convertPostalAddressUseToString(R2Package.Literals.POSTAL_ADDRESS_USE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<EntityNamePartQualifier> createSetEntityNamePartQualifierFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		List<EntityNamePartQualifier> result = new ArrayList<EntityNamePartQualifier>();
		for (String item : split(initialValue)) {
			result.add(createEntityNamePartQualifierFromString(R2Package.Literals.ENTITY_NAME_PART_QUALIFIER, item));
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSetEntityNamePartQualifierToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		List<?> list = (List<?>)instanceValue;
		if (list.isEmpty()) return "";
		StringBuffer result = new StringBuffer();
		for (Object item : list) {
			result.append(convertEntityNamePartQualifierToString(R2Package.Literals.ENTITY_NAME_PART_QUALIFIER, item));
			result.append(' ');
		}
		return result.substring(0, result.length() - 1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<EntityNameUse> createSetEntityNameUseFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		List<EntityNameUse> result = new ArrayList<EntityNameUse>();
		for (String item : split(initialValue)) {
			result.add(createEntityNameUseFromString(R2Package.Literals.ENTITY_NAME_USE, item));
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSetEntityNameUseToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		List<?> list = (List<?>)instanceValue;
		if (list.isEmpty()) return "";
		StringBuffer result = new StringBuffer();
		for (Object item : list) {
			result.append(convertEntityNameUseToString(R2Package.Literals.ENTITY_NAME_USE, item));
			result.append(' ');
		}
		return result.substring(0, result.length() - 1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<PostalAddressUse> createSetPostalAddressUseFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		List<PostalAddressUse> result = new ArrayList<PostalAddressUse>();
		for (String item : split(initialValue)) {
			result.add(createPostalAddressUseFromString(R2Package.Literals.POSTAL_ADDRESS_USE, item));
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSetPostalAddressUseToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		List<?> list = (List<?>)instanceValue;
		if (list.isEmpty()) return "";
		StringBuffer result = new StringBuffer();
		for (Object item : list) {
			result.append(convertPostalAddressUseToString(R2Package.Literals.POSTAL_ADDRESS_USE, item));
			result.append(' ');
		}
		return result.substring(0, result.length() - 1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<TelecommunicationAddressUse> createSetTelecommunicationAddressUseFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		List<TelecommunicationAddressUse> result = new ArrayList<TelecommunicationAddressUse>();
		for (String item : split(initialValue)) {
			result.add(createTelecommunicationAddressUseFromString(R2Package.Literals.TELECOMMUNICATION_ADDRESS_USE, item));
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSetTelecommunicationAddressUseToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		List<?> list = (List<?>)instanceValue;
		if (list.isEmpty()) return "";
		StringBuffer result = new StringBuffer();
		for (Object item : list) {
			result.append(convertTelecommunicationAddressUseToString(R2Package.Literals.TELECOMMUNICATION_ADDRESS_USE, item));
			result.append(' ');
		}
		return result.substring(0, result.length() - 1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<TelecommunicationCapability> createSetTelecommunicationCapabilityFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		List<TelecommunicationCapability> result = new ArrayList<TelecommunicationCapability>();
		for (String item : split(initialValue)) {
			result.add(createTelecommunicationCapabilityFromString(R2Package.Literals.TELECOMMUNICATION_CAPABILITY, item));
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSetTelecommunicationCapabilityToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		List<?> list = (List<?>)instanceValue;
		if (list.isEmpty()) return "";
		StringBuffer result = new StringBuffer();
		for (Object item : list) {
			result.append(convertTelecommunicationCapabilityToString(R2Package.Literals.TELECOMMUNICATION_CAPABILITY, item));
			result.append(' ');
		}
		return result.substring(0, result.length() - 1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TelecommunicationAddressUse createTelecommunicationAddressUseObjectFromString(EDataType eDataType, String initialValue) {
		return createTelecommunicationAddressUseFromString(R2Package.Literals.TELECOMMUNICATION_ADDRESS_USE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTelecommunicationAddressUseObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTelecommunicationAddressUseToString(R2Package.Literals.TELECOMMUNICATION_ADDRESS_USE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TelecommunicationCapability createTelecommunicationCapabilityObjectFromString(EDataType eDataType, String initialValue) {
		return createTelecommunicationCapabilityFromString(R2Package.Literals.TELECOMMUNICATION_CAPABILITY, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTelecommunicationCapabilityObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTelecommunicationCapabilityToString(R2Package.Literals.TELECOMMUNICATION_CAPABILITY, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createTimeStampFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTimeStampToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createUidFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUidToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createUriFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUriToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public R2Package getR2Package() {
		return (R2Package)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static R2Package getPackage() {
		return R2Package.eINSTANCE;
	}

} //R2FactoryImpl
