/**
 */
package org.hl7.cdsdt.r2.util;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import org.eclipse.emf.ecore.xml.type.util.XMLTypeUtil;
import org.eclipse.emf.ecore.xml.type.util.XMLTypeValidator;

import org.hl7.cdsdt.r2.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.hl7.cdsdt.r2.R2Package
 * @generated
 */
public class R2Validator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final R2Validator INSTANCE = new R2Validator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "org.hl7.cdsdt.r2";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * The cached base package validator.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XMLTypeValidator xmlTypeValidator;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public R2Validator() {
		super();
		xmlTypeValidator = XMLTypeValidator.INSTANCE;
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return R2Package.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case R2Package.AD:
				return validateAD((AD)value, diagnostics, context);
			case R2Package.ADXP:
				return validateADXP((ADXP)value, diagnostics, context);
			case R2Package.ANY:
				return validateANY((ANY)value, diagnostics, context);
			case R2Package.BL:
				return validateBL((BL)value, diagnostics, context);
			case R2Package.CD:
				return validateCD((CD)value, diagnostics, context);
			case R2Package.CO:
				return validateCO((CO)value, diagnostics, context);
			case R2Package.CS:
				return validateCS((CS)value, diagnostics, context);
			case R2Package.ED:
				return validateED((ED)value, diagnostics, context);
			case R2Package.EN:
				return validateEN((EN)value, diagnostics, context);
			case R2Package.ENXP:
				return validateENXP((ENXP)value, diagnostics, context);
			case R2Package.HXIT:
				return validateHXIT((HXIT)value, diagnostics, context);
			case R2Package.II:
				return validateII((II)value, diagnostics, context);
			case R2Package.INT:
				return validateINT((INT)value, diagnostics, context);
			case R2Package.IVL:
				return validateIVL((IVL)value, diagnostics, context);
			case R2Package.IVLCO:
				return validateIVLCO((IVLCO)value, diagnostics, context);
			case R2Package.IVLINT:
				return validateIVLINT((IVLINT)value, diagnostics, context);
			case R2Package.IVLPQ:
				return validateIVLPQ((IVLPQ)value, diagnostics, context);
			case R2Package.IVLQTY:
				return validateIVLQTY((IVLQTY)value, diagnostics, context);
			case R2Package.IVLREAL:
				return validateIVLREAL((IVLREAL)value, diagnostics, context);
			case R2Package.IVLTS:
				return validateIVLTS((IVLTS)value, diagnostics, context);
			case R2Package.PIVLTS:
				return validatePIVLTS((PIVLTS)value, diagnostics, context);
			case R2Package.PQ:
				return validatePQ((PQ)value, diagnostics, context);
			case R2Package.QSET:
				return validateQSET((QSET)value, diagnostics, context);
			case R2Package.QTY:
				return validateQTY((QTY)value, diagnostics, context);
			case R2Package.REAL:
				return validateREAL((REAL)value, diagnostics, context);
			case R2Package.RTO:
				return validateRTO((RTO)value, diagnostics, context);
			case R2Package.ST:
				return validateST((ST)value, diagnostics, context);
			case R2Package.TEL:
				return validateTEL((TEL)value, diagnostics, context);
			case R2Package.TS:
				return validateTS((TS)value, diagnostics, context);
			case R2Package.XP:
				return validateXP((XP)value, diagnostics, context);
			case R2Package.ADDRESS_PART_TYPE:
				return validateAddressPartType((AddressPartType)value, diagnostics, context);
			case R2Package.CALENDAR_CYCLE:
				return validateCalendarCycle((CalendarCycle)value, diagnostics, context);
			case R2Package.COMPRESSION:
				return validateCompression((Compression)value, diagnostics, context);
			case R2Package.ENTITY_NAME_PART_QUALIFIER:
				return validateEntityNamePartQualifier((EntityNamePartQualifier)value, diagnostics, context);
			case R2Package.ENTITY_NAME_PART_TYPE:
				return validateEntityNamePartType((EntityNamePartType)value, diagnostics, context);
			case R2Package.ENTITY_NAME_USE:
				return validateEntityNameUse((EntityNameUse)value, diagnostics, context);
			case R2Package.INTEGRITY_CHECK_ALGORITHM:
				return validateIntegrityCheckAlgorithm((IntegrityCheckAlgorithm)value, diagnostics, context);
			case R2Package.POSTAL_ADDRESS_USE:
				return validatePostalAddressUse((PostalAddressUse)value, diagnostics, context);
			case R2Package.TELECOMMUNICATION_ADDRESS_USE:
				return validateTelecommunicationAddressUse((TelecommunicationAddressUse)value, diagnostics, context);
			case R2Package.TELECOMMUNICATION_CAPABILITY:
				return validateTelecommunicationCapability((TelecommunicationCapability)value, diagnostics, context);
			case R2Package.ADDRESS_PART_TYPE_OBJECT:
				return validateAddressPartTypeObject((AddressPartType)value, diagnostics, context);
			case R2Package.CALENDAR_CYCLE_OBJECT:
				return validateCalendarCycleObject((CalendarCycle)value, diagnostics, context);
			case R2Package.CODE:
				return validateCode((String)value, diagnostics, context);
			case R2Package.COMPRESSION_OBJECT:
				return validateCompressionObject((Compression)value, diagnostics, context);
			case R2Package.DECIMAL:
				return validateDecimal((Double)value, diagnostics, context);
			case R2Package.DECIMAL_OBJECT:
				return validateDecimalObject((Double)value, diagnostics, context);
			case R2Package.ENTITY_NAME_PART_QUALIFIER_OBJECT:
				return validateEntityNamePartQualifierObject((EntityNamePartQualifier)value, diagnostics, context);
			case R2Package.ENTITY_NAME_PART_TYPE_OBJECT:
				return validateEntityNamePartTypeObject((EntityNamePartType)value, diagnostics, context);
			case R2Package.ENTITY_NAME_USE_OBJECT:
				return validateEntityNameUseObject((EntityNameUse)value, diagnostics, context);
			case R2Package.INTEGRITY_CHECK_ALGORITHM_OBJECT:
				return validateIntegrityCheckAlgorithmObject((IntegrityCheckAlgorithm)value, diagnostics, context);
			case R2Package.POSTAL_ADDRESS_USE_OBJECT:
				return validatePostalAddressUseObject((PostalAddressUse)value, diagnostics, context);
			case R2Package.SET_ENTITY_NAME_PART_QUALIFIER:
				return validateSetEntityNamePartQualifier((List<?>)value, diagnostics, context);
			case R2Package.SET_ENTITY_NAME_USE:
				return validateSetEntityNameUse((List<?>)value, diagnostics, context);
			case R2Package.SET_POSTAL_ADDRESS_USE:
				return validateSetPostalAddressUse((List<?>)value, diagnostics, context);
			case R2Package.SET_TELECOMMUNICATION_ADDRESS_USE:
				return validateSetTelecommunicationAddressUse((List<?>)value, diagnostics, context);
			case R2Package.SET_TELECOMMUNICATION_CAPABILITY:
				return validateSetTelecommunicationCapability((List<?>)value, diagnostics, context);
			case R2Package.TELECOMMUNICATION_ADDRESS_USE_OBJECT:
				return validateTelecommunicationAddressUseObject((TelecommunicationAddressUse)value, diagnostics, context);
			case R2Package.TELECOMMUNICATION_CAPABILITY_OBJECT:
				return validateTelecommunicationCapabilityObject((TelecommunicationCapability)value, diagnostics, context);
			case R2Package.TIME_STAMP:
				return validateTimeStamp((String)value, diagnostics, context);
			case R2Package.UID:
				return validateUid((String)value, diagnostics, context);
			case R2Package.URI:
				return validateUri((String)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAD(AD ad, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ad, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateADXP(ADXP adxp, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(adxp, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateANY(ANY any, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(any, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBL(BL bl, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bl, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCD(CD cd, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(cd, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCO(CO co, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(co, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCS(CS cs, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(cs, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateED(ED ed, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ed, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEN(EN en, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(en, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENXP(ENXP enxp, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(enxp, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHXIT(HXIT hxit, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(hxit, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateII(II ii, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ii, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateINT(INT int_, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(int_, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIVL(IVL ivl, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ivl, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIVLCO(IVLCO ivlco, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ivlco, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIVLINT(IVLINT ivlint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ivlint, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIVLPQ(IVLPQ ivlpq, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ivlpq, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIVLQTY(IVLQTY ivlqty, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ivlqty, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIVLREAL(IVLREAL ivlreal, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ivlreal, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIVLTS(IVLTS ivlts, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ivlts, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePIVLTS(PIVLTS pivlts, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(pivlts, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePQ(PQ pq, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(pq, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQSET(QSET qset, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(qset, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQTY(QTY qty, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(qty, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateREAL(REAL real, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(real, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRTO(RTO rto, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(rto, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateST(ST st, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(st, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTEL(TEL tel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tel, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTS(TS ts, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ts, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateXP(XP xp, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(xp, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAddressPartType(AddressPartType addressPartType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCalendarCycle(CalendarCycle calendarCycle, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCompression(Compression compression, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEntityNamePartQualifier(EntityNamePartQualifier entityNamePartQualifier, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEntityNamePartType(EntityNamePartType entityNamePartType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEntityNameUse(EntityNameUse entityNameUse, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIntegrityCheckAlgorithm(IntegrityCheckAlgorithm integrityCheckAlgorithm, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePostalAddressUse(PostalAddressUse postalAddressUse, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTelecommunicationAddressUse(TelecommunicationAddressUse telecommunicationAddressUse, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTelecommunicationCapability(TelecommunicationCapability telecommunicationCapability, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAddressPartTypeObject(AddressPartType addressPartTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCalendarCycleObject(CalendarCycle calendarCycleObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCode(String code, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCompressionObject(Compression compressionObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDecimal(double decimal, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDecimalObject(Double decimalObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEntityNamePartQualifierObject(EntityNamePartQualifier entityNamePartQualifierObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEntityNamePartTypeObject(EntityNamePartType entityNamePartTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEntityNameUseObject(EntityNameUse entityNameUseObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIntegrityCheckAlgorithmObject(IntegrityCheckAlgorithm integrityCheckAlgorithmObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePostalAddressUseObject(PostalAddressUse postalAddressUseObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSetEntityNamePartQualifier(List<?> setEntityNamePartQualifier, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateSetEntityNamePartQualifier_ItemType(setEntityNamePartQualifier, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ItemType constraint of '<em>Set Entity Name Part Qualifier</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSetEntityNamePartQualifier_ItemType(List<?> setEntityNamePartQualifier, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = true;
		for (Iterator<?> i = setEntityNamePartQualifier.iterator(); i.hasNext() && (result || diagnostics != null); ) {
			Object item = i.next();
			if (R2Package.Literals.ENTITY_NAME_PART_QUALIFIER.isInstance(item)) {
				result &= validateEntityNamePartQualifier((EntityNamePartQualifier)item, diagnostics, context);
			}
			else {
				result = false;
				reportDataValueTypeViolation(R2Package.Literals.ENTITY_NAME_PART_QUALIFIER, item, diagnostics, context);
			}
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSetEntityNameUse(List<?> setEntityNameUse, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateSetEntityNameUse_ItemType(setEntityNameUse, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ItemType constraint of '<em>Set Entity Name Use</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSetEntityNameUse_ItemType(List<?> setEntityNameUse, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = true;
		for (Iterator<?> i = setEntityNameUse.iterator(); i.hasNext() && (result || diagnostics != null); ) {
			Object item = i.next();
			if (R2Package.Literals.ENTITY_NAME_USE.isInstance(item)) {
				result &= validateEntityNameUse((EntityNameUse)item, diagnostics, context);
			}
			else {
				result = false;
				reportDataValueTypeViolation(R2Package.Literals.ENTITY_NAME_USE, item, diagnostics, context);
			}
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSetPostalAddressUse(List<?> setPostalAddressUse, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateSetPostalAddressUse_ItemType(setPostalAddressUse, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ItemType constraint of '<em>Set Postal Address Use</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSetPostalAddressUse_ItemType(List<?> setPostalAddressUse, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = true;
		for (Iterator<?> i = setPostalAddressUse.iterator(); i.hasNext() && (result || diagnostics != null); ) {
			Object item = i.next();
			if (R2Package.Literals.POSTAL_ADDRESS_USE.isInstance(item)) {
				result &= validatePostalAddressUse((PostalAddressUse)item, diagnostics, context);
			}
			else {
				result = false;
				reportDataValueTypeViolation(R2Package.Literals.POSTAL_ADDRESS_USE, item, diagnostics, context);
			}
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSetTelecommunicationAddressUse(List<?> setTelecommunicationAddressUse, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateSetTelecommunicationAddressUse_ItemType(setTelecommunicationAddressUse, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ItemType constraint of '<em>Set Telecommunication Address Use</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSetTelecommunicationAddressUse_ItemType(List<?> setTelecommunicationAddressUse, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = true;
		for (Iterator<?> i = setTelecommunicationAddressUse.iterator(); i.hasNext() && (result || diagnostics != null); ) {
			Object item = i.next();
			if (R2Package.Literals.TELECOMMUNICATION_ADDRESS_USE.isInstance(item)) {
				result &= validateTelecommunicationAddressUse((TelecommunicationAddressUse)item, diagnostics, context);
			}
			else {
				result = false;
				reportDataValueTypeViolation(R2Package.Literals.TELECOMMUNICATION_ADDRESS_USE, item, diagnostics, context);
			}
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSetTelecommunicationCapability(List<?> setTelecommunicationCapability, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateSetTelecommunicationCapability_ItemType(setTelecommunicationCapability, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ItemType constraint of '<em>Set Telecommunication Capability</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSetTelecommunicationCapability_ItemType(List<?> setTelecommunicationCapability, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = true;
		for (Iterator<?> i = setTelecommunicationCapability.iterator(); i.hasNext() && (result || diagnostics != null); ) {
			Object item = i.next();
			if (R2Package.Literals.TELECOMMUNICATION_CAPABILITY.isInstance(item)) {
				result &= validateTelecommunicationCapability((TelecommunicationCapability)item, diagnostics, context);
			}
			else {
				result = false;
				reportDataValueTypeViolation(R2Package.Literals.TELECOMMUNICATION_CAPABILITY, item, diagnostics, context);
			}
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTelecommunicationAddressUseObject(TelecommunicationAddressUse telecommunicationAddressUseObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTelecommunicationCapabilityObject(TelecommunicationCapability telecommunicationCapabilityObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimeStamp(String timeStamp, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateTimeStamp_Pattern(timeStamp, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateTimeStamp_Pattern
	 */
	public static final  PatternMatcher [][] TIME_STAMP__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[1-2][0-9]{3,3}(((0[1-9])|(1[0-2]))(((0[1-9])|([1-2][0-9])|(3[0-1]))((([0-1][0-9])|(2[0-3]))(([0-5][0-9])(([0-5][0-9])(\\.[0-9]{1,4})?)?)?)?)?)?([+\\-](0[0-9]|1[0-3])([0-5][0-9]))?")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Time Stamp</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimeStamp_Pattern(String timeStamp, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(R2Package.Literals.TIME_STAMP, timeStamp, TIME_STAMP__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUid(String uid, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUri(String uri, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //R2Validator
