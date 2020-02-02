/**
 */
package org.hl7.cdsdt.r2.impl;

import java.util.List;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.namespace.XMLNamespacePackage;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.hl7.cdsdt.r2.AddressPartType;
import org.hl7.cdsdt.r2.CalendarCycle;
import org.hl7.cdsdt.r2.Compression;
import org.hl7.cdsdt.r2.EntityNamePartQualifier;
import org.hl7.cdsdt.r2.EntityNamePartType;
import org.hl7.cdsdt.r2.EntityNameUse;
import org.hl7.cdsdt.r2.IntegrityCheckAlgorithm;
import org.hl7.cdsdt.r2.PostalAddressUse;
import org.hl7.cdsdt.r2.R2Factory;
import org.hl7.cdsdt.r2.R2Package;
import org.hl7.cdsdt.r2.TelecommunicationAddressUse;
import org.hl7.cdsdt.r2.TelecommunicationCapability;

import org.hl7.cdsdt.r2.util.R2Validator;

import org.hl7.knowledgeartifact.r1.R1Package;

import org.hl7.knowledgeartifact.r1.impl.R1PackageImpl;

import org.w3._1999.xhtml.XhtmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class R2PackageImpl extends EPackageImpl implements R2Package {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass adEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass adxpEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass anyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass blEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cdEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass coEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass csEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass edEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enxpEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hxitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iiEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass intEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ivlEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ivlcoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ivlintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ivlpqEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ivlqtyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ivlrealEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ivltsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pivltsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pqEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass qsetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass qtyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass realEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rtoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass telEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xpEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum addressPartTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum calendarCycleEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum compressionEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum entityNamePartQualifierEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum entityNamePartTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum entityNameUseEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum integrityCheckAlgorithmEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum postalAddressUseEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum telecommunicationAddressUseEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum telecommunicationCapabilityEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType addressPartTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType calendarCycleObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType codeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType compressionObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType decimalEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType decimalObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType entityNamePartQualifierObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType entityNamePartTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType entityNameUseObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType integrityCheckAlgorithmObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType postalAddressUseObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType setEntityNamePartQualifierEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType setEntityNameUseEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType setPostalAddressUseEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType setTelecommunicationAddressUseEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType setTelecommunicationCapabilityEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType telecommunicationAddressUseObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType telecommunicationCapabilityObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType timeStampEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType uidEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType uriEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.hl7.cdsdt.r2.R2Package#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private R2PackageImpl() {
		super(eNS_URI, R2Factory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link R2Package#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static R2Package init() {
		if (isInited) return (R2Package)EPackage.Registry.INSTANCE.getEPackage(R2Package.eNS_URI);

		// Obtain or create and register package
		R2PackageImpl theR2Package = (R2PackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof R2PackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new R2PackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XhtmlPackage.eINSTANCE.eClass();
		XMLNamespacePackage.eINSTANCE.eClass();
		XMLTypePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		R1PackageImpl theR1Package = (R1PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(R1Package.eNS_URI) instanceof R1PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(R1Package.eNS_URI) : R1Package.eINSTANCE);
		org.hl7.elm.r1.impl.R1PackageImpl theR1Package_1 = (org.hl7.elm.r1.impl.R1PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(org.hl7.elm.r1.R1Package.eNS_URI) instanceof org.hl7.elm.r1.impl.R1PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(org.hl7.elm.r1.R1Package.eNS_URI) : org.hl7.elm.r1.R1Package.eINSTANCE);

		// Load packages
		theR1Package_1.loadPackage();

		// Create package meta-data objects
		theR2Package.createPackageContents();
		theR1Package.createPackageContents();

		// Initialize created meta-data
		theR2Package.initializePackageContents();
		theR1Package.initializePackageContents();

		// Fix loaded packages
		theR1Package_1.fixPackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theR2Package, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return R2Validator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theR2Package.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(R2Package.eNS_URI, theR2Package);
		return theR2Package;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAD() {
		return adEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAD_Part() {
		return (EReference)adEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAD_Use() {
		return (EAttribute)adEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getADXP() {
		return adxpEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getADXP_Type() {
		return (EAttribute)adxpEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getANY() {
		return anyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBL() {
		return blEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBL_Value() {
		return (EAttribute)blEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCD() {
		return cdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCD_DisplayName() {
		return (EReference)cdEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCD_OriginalText() {
		return (EReference)cdEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCD_Translation() {
		return (EReference)cdEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCD_Code() {
		return (EAttribute)cdEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCD_CodeSystem() {
		return (EAttribute)cdEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCD_CodeSystemName() {
		return (EAttribute)cdEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCD_CodeSystemVersion() {
		return (EAttribute)cdEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCD_ValueSet() {
		return (EAttribute)cdEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCD_ValueSetVersion() {
		return (EAttribute)cdEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCO() {
		return coEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCO_Code() {
		return (EReference)coEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCO_Value() {
		return (EAttribute)coEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCS() {
		return csEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCS_Code() {
		return (EAttribute)csEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getED() {
		return edEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getED_Data() {
		return (EAttribute)edEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getED_Xml() {
		return (EReference)edEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getED_Reference() {
		return (EReference)edEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getED_IntegrityCheck() {
		return (EAttribute)edEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getED_Description() {
		return (EReference)edEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getED_Charset() {
		return (EAttribute)edEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getED_Compression() {
		return (EAttribute)edEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getED_IntegrityCheckAlgorithm() {
		return (EAttribute)edEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getED_Language() {
		return (EAttribute)edEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getED_MediaType() {
		return (EAttribute)edEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getED_Value() {
		return (EAttribute)edEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEN() {
		return enEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEN_Part() {
		return (EReference)enEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEN_Use() {
		return (EAttribute)enEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getENXP() {
		return enxpEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getENXP_Qualifier() {
		return (EAttribute)enxpEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getENXP_Type() {
		return (EAttribute)enxpEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHXIT() {
		return hxitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getII() {
		return iiEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getII_Extension() {
		return (EAttribute)iiEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getII_IdentifierName() {
		return (EAttribute)iiEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getII_Root() {
		return (EAttribute)iiEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getINT() {
		return intEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getINT_Value() {
		return (EAttribute)intEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIVL() {
		return ivlEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIVLCO() {
		return ivlcoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIVLCO_Low() {
		return (EReference)ivlcoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIVLCO_High() {
		return (EReference)ivlcoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIVLCO_HighClosed() {
		return (EAttribute)ivlcoEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIVLCO_LowClosed() {
		return (EAttribute)ivlcoEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIVLINT() {
		return ivlintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIVLINT_Low() {
		return (EReference)ivlintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIVLINT_High() {
		return (EReference)ivlintEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIVLINT_HighClosed() {
		return (EAttribute)ivlintEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIVLINT_LowClosed() {
		return (EAttribute)ivlintEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIVLPQ() {
		return ivlpqEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIVLPQ_Low() {
		return (EReference)ivlpqEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIVLPQ_High() {
		return (EReference)ivlpqEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIVLPQ_HighClosed() {
		return (EAttribute)ivlpqEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIVLPQ_LowClosed() {
		return (EAttribute)ivlpqEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIVLQTY() {
		return ivlqtyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIVLQTY_Low() {
		return (EReference)ivlqtyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIVLQTY_High() {
		return (EReference)ivlqtyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIVLQTY_HighClosed() {
		return (EAttribute)ivlqtyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIVLQTY_LowClosed() {
		return (EAttribute)ivlqtyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIVLREAL() {
		return ivlrealEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIVLREAL_Low() {
		return (EReference)ivlrealEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIVLREAL_High() {
		return (EReference)ivlrealEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIVLREAL_HighClosed() {
		return (EAttribute)ivlrealEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIVLREAL_LowClosed() {
		return (EAttribute)ivlrealEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIVLTS() {
		return ivltsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIVLTS_Low() {
		return (EReference)ivltsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIVLTS_High() {
		return (EReference)ivltsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIVLTS_HighClosed() {
		return (EAttribute)ivltsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIVLTS_LowClosed() {
		return (EAttribute)ivltsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPIVLTS() {
		return pivltsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPIVLTS_Phase() {
		return (EReference)pivltsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPIVLTS_Period() {
		return (EReference)pivltsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPIVLTS_Frequency() {
		return (EReference)pivltsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPIVLTS_Count() {
		return (EReference)pivltsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPIVLTS_Alignment() {
		return (EAttribute)pivltsEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPIVLTS_IsFlexible() {
		return (EAttribute)pivltsEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPQ() {
		return pqEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPQ_Unit() {
		return (EAttribute)pqEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPQ_Value() {
		return (EAttribute)pqEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQSET() {
		return qsetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQTY() {
		return qtyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getREAL() {
		return realEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getREAL_Value() {
		return (EAttribute)realEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRTO() {
		return rtoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRTO_Numerator() {
		return (EReference)rtoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRTO_Denominator() {
		return (EReference)rtoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getST() {
		return stEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getST_Value() {
		return (EAttribute)stEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTEL() {
		return telEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTEL_Capabilities() {
		return (EAttribute)telEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTEL_Use() {
		return (EAttribute)telEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTEL_Value() {
		return (EAttribute)telEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTS() {
		return tsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTS_Value() {
		return (EAttribute)tsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXP() {
		return xpEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXP_Value() {
		return (EAttribute)xpEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAddressPartType() {
		return addressPartTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCalendarCycle() {
		return calendarCycleEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCompression() {
		return compressionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEntityNamePartQualifier() {
		return entityNamePartQualifierEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEntityNamePartType() {
		return entityNamePartTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEntityNameUse() {
		return entityNameUseEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getIntegrityCheckAlgorithm() {
		return integrityCheckAlgorithmEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPostalAddressUse() {
		return postalAddressUseEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTelecommunicationAddressUse() {
		return telecommunicationAddressUseEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTelecommunicationCapability() {
		return telecommunicationCapabilityEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getAddressPartTypeObject() {
		return addressPartTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCalendarCycleObject() {
		return calendarCycleObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCode() {
		return codeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCompressionObject() {
		return compressionObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDecimal() {
		return decimalEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDecimalObject() {
		return decimalObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getEntityNamePartQualifierObject() {
		return entityNamePartQualifierObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getEntityNamePartTypeObject() {
		return entityNamePartTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getEntityNameUseObject() {
		return entityNameUseObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getIntegrityCheckAlgorithmObject() {
		return integrityCheckAlgorithmObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getPostalAddressUseObject() {
		return postalAddressUseObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSetEntityNamePartQualifier() {
		return setEntityNamePartQualifierEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSetEntityNameUse() {
		return setEntityNameUseEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSetPostalAddressUse() {
		return setPostalAddressUseEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSetTelecommunicationAddressUse() {
		return setTelecommunicationAddressUseEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSetTelecommunicationCapability() {
		return setTelecommunicationCapabilityEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTelecommunicationAddressUseObject() {
		return telecommunicationAddressUseObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTelecommunicationCapabilityObject() {
		return telecommunicationCapabilityObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTimeStamp() {
		return timeStampEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getUid() {
		return uidEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getUri() {
		return uriEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public R2Factory getR2Factory() {
		return (R2Factory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		adEClass = createEClass(AD);
		createEReference(adEClass, AD__PART);
		createEAttribute(adEClass, AD__USE);

		adxpEClass = createEClass(ADXP);
		createEAttribute(adxpEClass, ADXP__TYPE);

		anyEClass = createEClass(ANY);

		blEClass = createEClass(BL);
		createEAttribute(blEClass, BL__VALUE);

		cdEClass = createEClass(CD);
		createEReference(cdEClass, CD__DISPLAY_NAME);
		createEReference(cdEClass, CD__ORIGINAL_TEXT);
		createEReference(cdEClass, CD__TRANSLATION);
		createEAttribute(cdEClass, CD__CODE);
		createEAttribute(cdEClass, CD__CODE_SYSTEM);
		createEAttribute(cdEClass, CD__CODE_SYSTEM_NAME);
		createEAttribute(cdEClass, CD__CODE_SYSTEM_VERSION);
		createEAttribute(cdEClass, CD__VALUE_SET);
		createEAttribute(cdEClass, CD__VALUE_SET_VERSION);

		coEClass = createEClass(CO);
		createEReference(coEClass, CO__CODE);
		createEAttribute(coEClass, CO__VALUE);

		csEClass = createEClass(CS);
		createEAttribute(csEClass, CS__CODE);

		edEClass = createEClass(ED);
		createEAttribute(edEClass, ED__DATA);
		createEReference(edEClass, ED__XML);
		createEReference(edEClass, ED__REFERENCE);
		createEAttribute(edEClass, ED__INTEGRITY_CHECK);
		createEReference(edEClass, ED__DESCRIPTION);
		createEAttribute(edEClass, ED__CHARSET);
		createEAttribute(edEClass, ED__COMPRESSION);
		createEAttribute(edEClass, ED__INTEGRITY_CHECK_ALGORITHM);
		createEAttribute(edEClass, ED__LANGUAGE);
		createEAttribute(edEClass, ED__MEDIA_TYPE);
		createEAttribute(edEClass, ED__VALUE);

		enEClass = createEClass(EN);
		createEReference(enEClass, EN__PART);
		createEAttribute(enEClass, EN__USE);

		enxpEClass = createEClass(ENXP);
		createEAttribute(enxpEClass, ENXP__QUALIFIER);
		createEAttribute(enxpEClass, ENXP__TYPE);

		hxitEClass = createEClass(HXIT);

		iiEClass = createEClass(II);
		createEAttribute(iiEClass, II__EXTENSION);
		createEAttribute(iiEClass, II__IDENTIFIER_NAME);
		createEAttribute(iiEClass, II__ROOT);

		intEClass = createEClass(INT);
		createEAttribute(intEClass, INT__VALUE);

		ivlEClass = createEClass(IVL);

		ivlcoEClass = createEClass(IVLCO);
		createEReference(ivlcoEClass, IVLCO__LOW);
		createEReference(ivlcoEClass, IVLCO__HIGH);
		createEAttribute(ivlcoEClass, IVLCO__HIGH_CLOSED);
		createEAttribute(ivlcoEClass, IVLCO__LOW_CLOSED);

		ivlintEClass = createEClass(IVLINT);
		createEReference(ivlintEClass, IVLINT__LOW);
		createEReference(ivlintEClass, IVLINT__HIGH);
		createEAttribute(ivlintEClass, IVLINT__HIGH_CLOSED);
		createEAttribute(ivlintEClass, IVLINT__LOW_CLOSED);

		ivlpqEClass = createEClass(IVLPQ);
		createEReference(ivlpqEClass, IVLPQ__LOW);
		createEReference(ivlpqEClass, IVLPQ__HIGH);
		createEAttribute(ivlpqEClass, IVLPQ__HIGH_CLOSED);
		createEAttribute(ivlpqEClass, IVLPQ__LOW_CLOSED);

		ivlqtyEClass = createEClass(IVLQTY);
		createEReference(ivlqtyEClass, IVLQTY__LOW);
		createEReference(ivlqtyEClass, IVLQTY__HIGH);
		createEAttribute(ivlqtyEClass, IVLQTY__HIGH_CLOSED);
		createEAttribute(ivlqtyEClass, IVLQTY__LOW_CLOSED);

		ivlrealEClass = createEClass(IVLREAL);
		createEReference(ivlrealEClass, IVLREAL__LOW);
		createEReference(ivlrealEClass, IVLREAL__HIGH);
		createEAttribute(ivlrealEClass, IVLREAL__HIGH_CLOSED);
		createEAttribute(ivlrealEClass, IVLREAL__LOW_CLOSED);

		ivltsEClass = createEClass(IVLTS);
		createEReference(ivltsEClass, IVLTS__LOW);
		createEReference(ivltsEClass, IVLTS__HIGH);
		createEAttribute(ivltsEClass, IVLTS__HIGH_CLOSED);
		createEAttribute(ivltsEClass, IVLTS__LOW_CLOSED);

		pivltsEClass = createEClass(PIVLTS);
		createEReference(pivltsEClass, PIVLTS__PHASE);
		createEReference(pivltsEClass, PIVLTS__PERIOD);
		createEReference(pivltsEClass, PIVLTS__FREQUENCY);
		createEReference(pivltsEClass, PIVLTS__COUNT);
		createEAttribute(pivltsEClass, PIVLTS__ALIGNMENT);
		createEAttribute(pivltsEClass, PIVLTS__IS_FLEXIBLE);

		pqEClass = createEClass(PQ);
		createEAttribute(pqEClass, PQ__UNIT);
		createEAttribute(pqEClass, PQ__VALUE);

		qsetEClass = createEClass(QSET);

		qtyEClass = createEClass(QTY);

		realEClass = createEClass(REAL);
		createEAttribute(realEClass, REAL__VALUE);

		rtoEClass = createEClass(RTO);
		createEReference(rtoEClass, RTO__NUMERATOR);
		createEReference(rtoEClass, RTO__DENOMINATOR);

		stEClass = createEClass(ST);
		createEAttribute(stEClass, ST__VALUE);

		telEClass = createEClass(TEL);
		createEAttribute(telEClass, TEL__CAPABILITIES);
		createEAttribute(telEClass, TEL__USE);
		createEAttribute(telEClass, TEL__VALUE);

		tsEClass = createEClass(TS);
		createEAttribute(tsEClass, TS__VALUE);

		xpEClass = createEClass(XP);
		createEAttribute(xpEClass, XP__VALUE);

		// Create enums
		addressPartTypeEEnum = createEEnum(ADDRESS_PART_TYPE);
		calendarCycleEEnum = createEEnum(CALENDAR_CYCLE);
		compressionEEnum = createEEnum(COMPRESSION);
		entityNamePartQualifierEEnum = createEEnum(ENTITY_NAME_PART_QUALIFIER);
		entityNamePartTypeEEnum = createEEnum(ENTITY_NAME_PART_TYPE);
		entityNameUseEEnum = createEEnum(ENTITY_NAME_USE);
		integrityCheckAlgorithmEEnum = createEEnum(INTEGRITY_CHECK_ALGORITHM);
		postalAddressUseEEnum = createEEnum(POSTAL_ADDRESS_USE);
		telecommunicationAddressUseEEnum = createEEnum(TELECOMMUNICATION_ADDRESS_USE);
		telecommunicationCapabilityEEnum = createEEnum(TELECOMMUNICATION_CAPABILITY);

		// Create data types
		addressPartTypeObjectEDataType = createEDataType(ADDRESS_PART_TYPE_OBJECT);
		calendarCycleObjectEDataType = createEDataType(CALENDAR_CYCLE_OBJECT);
		codeEDataType = createEDataType(CODE);
		compressionObjectEDataType = createEDataType(COMPRESSION_OBJECT);
		decimalEDataType = createEDataType(DECIMAL);
		decimalObjectEDataType = createEDataType(DECIMAL_OBJECT);
		entityNamePartQualifierObjectEDataType = createEDataType(ENTITY_NAME_PART_QUALIFIER_OBJECT);
		entityNamePartTypeObjectEDataType = createEDataType(ENTITY_NAME_PART_TYPE_OBJECT);
		entityNameUseObjectEDataType = createEDataType(ENTITY_NAME_USE_OBJECT);
		integrityCheckAlgorithmObjectEDataType = createEDataType(INTEGRITY_CHECK_ALGORITHM_OBJECT);
		postalAddressUseObjectEDataType = createEDataType(POSTAL_ADDRESS_USE_OBJECT);
		setEntityNamePartQualifierEDataType = createEDataType(SET_ENTITY_NAME_PART_QUALIFIER);
		setEntityNameUseEDataType = createEDataType(SET_ENTITY_NAME_USE);
		setPostalAddressUseEDataType = createEDataType(SET_POSTAL_ADDRESS_USE);
		setTelecommunicationAddressUseEDataType = createEDataType(SET_TELECOMMUNICATION_ADDRESS_USE);
		setTelecommunicationCapabilityEDataType = createEDataType(SET_TELECOMMUNICATION_CAPABILITY);
		telecommunicationAddressUseObjectEDataType = createEDataType(TELECOMMUNICATION_ADDRESS_USE_OBJECT);
		telecommunicationCapabilityObjectEDataType = createEDataType(TELECOMMUNICATION_CAPABILITY_OBJECT);
		timeStampEDataType = createEDataType(TIME_STAMP);
		uidEDataType = createEDataType(UID);
		uriEDataType = createEDataType(URI);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		adEClass.getESuperTypes().add(this.getANY());
		adxpEClass.getESuperTypes().add(this.getXP());
		anyEClass.getESuperTypes().add(this.getHXIT());
		blEClass.getESuperTypes().add(this.getANY());
		cdEClass.getESuperTypes().add(this.getANY());
		coEClass.getESuperTypes().add(this.getQTY());
		csEClass.getESuperTypes().add(this.getANY());
		edEClass.getESuperTypes().add(this.getANY());
		enEClass.getESuperTypes().add(this.getANY());
		enxpEClass.getESuperTypes().add(this.getXP());
		iiEClass.getESuperTypes().add(this.getANY());
		intEClass.getESuperTypes().add(this.getQTY());
		ivlEClass.getESuperTypes().add(this.getQSET());
		ivlcoEClass.getESuperTypes().add(this.getIVL());
		ivlintEClass.getESuperTypes().add(this.getIVL());
		ivlpqEClass.getESuperTypes().add(this.getIVL());
		ivlqtyEClass.getESuperTypes().add(this.getIVL());
		ivlrealEClass.getESuperTypes().add(this.getIVL());
		ivltsEClass.getESuperTypes().add(this.getIVL());
		pivltsEClass.getESuperTypes().add(this.getQTY());
		pqEClass.getESuperTypes().add(this.getQTY());
		qsetEClass.getESuperTypes().add(this.getANY());
		qtyEClass.getESuperTypes().add(this.getANY());
		realEClass.getESuperTypes().add(this.getQTY());
		rtoEClass.getESuperTypes().add(this.getQTY());
		stEClass.getESuperTypes().add(this.getANY());
		telEClass.getESuperTypes().add(this.getANY());
		tsEClass.getESuperTypes().add(this.getQTY());

		// Initialize classes, features, and operations; add parameters
		initEClass(adEClass, org.hl7.cdsdt.r2.AD.class, "AD", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAD_Part(), this.getADXP(), null, "part", null, 1, -1, org.hl7.cdsdt.r2.AD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAD_Use(), this.getSetPostalAddressUse(), "use", null, 0, 1, org.hl7.cdsdt.r2.AD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(adxpEClass, org.hl7.cdsdt.r2.ADXP.class, "ADXP", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getADXP_Type(), this.getAddressPartType(), "type", null, 1, 1, org.hl7.cdsdt.r2.ADXP.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(anyEClass, org.hl7.cdsdt.r2.ANY.class, "ANY", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(blEClass, org.hl7.cdsdt.r2.BL.class, "BL", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBL_Value(), theXMLTypePackage.getBoolean(), "value", null, 1, 1, org.hl7.cdsdt.r2.BL.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cdEClass, org.hl7.cdsdt.r2.CD.class, "CD", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCD_DisplayName(), this.getST(), null, "displayName", null, 0, 1, org.hl7.cdsdt.r2.CD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCD_OriginalText(), this.getST(), null, "originalText", null, 0, 1, org.hl7.cdsdt.r2.CD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCD_Translation(), this.getCD(), null, "translation", null, 0, -1, org.hl7.cdsdt.r2.CD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCD_Code(), this.getCode(), "code", null, 0, 1, org.hl7.cdsdt.r2.CD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCD_CodeSystem(), this.getUid(), "codeSystem", null, 0, 1, org.hl7.cdsdt.r2.CD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCD_CodeSystemName(), theXMLTypePackage.getString(), "codeSystemName", null, 0, 1, org.hl7.cdsdt.r2.CD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCD_CodeSystemVersion(), theXMLTypePackage.getString(), "codeSystemVersion", null, 0, 1, org.hl7.cdsdt.r2.CD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCD_ValueSet(), this.getUid(), "valueSet", null, 0, 1, org.hl7.cdsdt.r2.CD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCD_ValueSetVersion(), theXMLTypePackage.getString(), "valueSetVersion", null, 0, 1, org.hl7.cdsdt.r2.CD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(coEClass, org.hl7.cdsdt.r2.CO.class, "CO", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCO_Code(), this.getCD(), null, "code", null, 0, 1, org.hl7.cdsdt.r2.CO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCO_Value(), this.getDecimal(), "value", null, 0, 1, org.hl7.cdsdt.r2.CO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(csEClass, org.hl7.cdsdt.r2.CS.class, "CS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCS_Code(), theXMLTypePackage.getString(), "code", null, 1, 1, org.hl7.cdsdt.r2.CS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(edEClass, org.hl7.cdsdt.r2.ED.class, "ED", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getED_Data(), theXMLTypePackage.getBase64Binary(), "data", null, 0, 1, org.hl7.cdsdt.r2.ED.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getED_Xml(), ecorePackage.getEObject(), null, "xml", null, 0, 1, org.hl7.cdsdt.r2.ED.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getED_Reference(), this.getTEL(), null, "reference", null, 0, 1, org.hl7.cdsdt.r2.ED.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getED_IntegrityCheck(), theXMLTypePackage.getBase64Binary(), "integrityCheck", null, 0, 1, org.hl7.cdsdt.r2.ED.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getED_Description(), this.getST(), null, "description", null, 0, 1, org.hl7.cdsdt.r2.ED.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getED_Charset(), this.getCode(), "charset", null, 0, 1, org.hl7.cdsdt.r2.ED.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getED_Compression(), this.getCompression(), "compression", null, 0, 1, org.hl7.cdsdt.r2.ED.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getED_IntegrityCheckAlgorithm(), this.getIntegrityCheckAlgorithm(), "integrityCheckAlgorithm", null, 0, 1, org.hl7.cdsdt.r2.ED.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getED_Language(), this.getCode(), "language", null, 0, 1, org.hl7.cdsdt.r2.ED.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getED_MediaType(), this.getCode(), "mediaType", "text/plain", 0, 1, org.hl7.cdsdt.r2.ED.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getED_Value(), theXMLTypePackage.getString(), "value", null, 0, 1, org.hl7.cdsdt.r2.ED.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(enEClass, org.hl7.cdsdt.r2.EN.class, "EN", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEN_Part(), this.getENXP(), null, "part", null, 1, -1, org.hl7.cdsdt.r2.EN.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEN_Use(), this.getSetEntityNameUse(), "use", null, 0, 1, org.hl7.cdsdt.r2.EN.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(enxpEClass, org.hl7.cdsdt.r2.ENXP.class, "ENXP", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getENXP_Qualifier(), this.getSetEntityNamePartQualifier(), "qualifier", null, 0, 1, org.hl7.cdsdt.r2.ENXP.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getENXP_Type(), this.getEntityNamePartType(), "type", null, 1, 1, org.hl7.cdsdt.r2.ENXP.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hxitEClass, org.hl7.cdsdt.r2.HXIT.class, "HXIT", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(iiEClass, org.hl7.cdsdt.r2.II.class, "II", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getII_Extension(), theXMLTypePackage.getString(), "extension", null, 0, 1, org.hl7.cdsdt.r2.II.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getII_IdentifierName(), theXMLTypePackage.getString(), "identifierName", null, 0, 1, org.hl7.cdsdt.r2.II.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getII_Root(), this.getUid(), "root", null, 1, 1, org.hl7.cdsdt.r2.II.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(intEClass, org.hl7.cdsdt.r2.INT.class, "INT", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getINT_Value(), theXMLTypePackage.getInteger(), "value", null, 1, 1, org.hl7.cdsdt.r2.INT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ivlEClass, org.hl7.cdsdt.r2.IVL.class, "IVL", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(ivlcoEClass, org.hl7.cdsdt.r2.IVLCO.class, "IVLCO", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIVLCO_Low(), this.getCO(), null, "low", null, 0, 1, org.hl7.cdsdt.r2.IVLCO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIVLCO_High(), this.getCO(), null, "high", null, 0, 1, org.hl7.cdsdt.r2.IVLCO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIVLCO_HighClosed(), theXMLTypePackage.getBoolean(), "highClosed", null, 0, 1, org.hl7.cdsdt.r2.IVLCO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIVLCO_LowClosed(), theXMLTypePackage.getBoolean(), "lowClosed", null, 0, 1, org.hl7.cdsdt.r2.IVLCO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ivlintEClass, org.hl7.cdsdt.r2.IVLINT.class, "IVLINT", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIVLINT_Low(), this.getINT(), null, "low", null, 0, 1, org.hl7.cdsdt.r2.IVLINT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIVLINT_High(), this.getINT(), null, "high", null, 0, 1, org.hl7.cdsdt.r2.IVLINT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIVLINT_HighClosed(), theXMLTypePackage.getBoolean(), "highClosed", null, 0, 1, org.hl7.cdsdt.r2.IVLINT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIVLINT_LowClosed(), theXMLTypePackage.getBoolean(), "lowClosed", null, 0, 1, org.hl7.cdsdt.r2.IVLINT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ivlpqEClass, org.hl7.cdsdt.r2.IVLPQ.class, "IVLPQ", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIVLPQ_Low(), this.getPQ(), null, "low", null, 0, 1, org.hl7.cdsdt.r2.IVLPQ.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIVLPQ_High(), this.getPQ(), null, "high", null, 0, 1, org.hl7.cdsdt.r2.IVLPQ.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIVLPQ_HighClosed(), theXMLTypePackage.getBoolean(), "highClosed", null, 0, 1, org.hl7.cdsdt.r2.IVLPQ.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIVLPQ_LowClosed(), theXMLTypePackage.getBoolean(), "lowClosed", null, 0, 1, org.hl7.cdsdt.r2.IVLPQ.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ivlqtyEClass, org.hl7.cdsdt.r2.IVLQTY.class, "IVLQTY", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIVLQTY_Low(), this.getQTY(), null, "low", null, 0, 1, org.hl7.cdsdt.r2.IVLQTY.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIVLQTY_High(), this.getQTY(), null, "high", null, 0, 1, org.hl7.cdsdt.r2.IVLQTY.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIVLQTY_HighClosed(), theXMLTypePackage.getBoolean(), "highClosed", null, 0, 1, org.hl7.cdsdt.r2.IVLQTY.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIVLQTY_LowClosed(), theXMLTypePackage.getBoolean(), "lowClosed", null, 0, 1, org.hl7.cdsdt.r2.IVLQTY.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ivlrealEClass, org.hl7.cdsdt.r2.IVLREAL.class, "IVLREAL", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIVLREAL_Low(), this.getREAL(), null, "low", null, 0, 1, org.hl7.cdsdt.r2.IVLREAL.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIVLREAL_High(), this.getREAL(), null, "high", null, 0, 1, org.hl7.cdsdt.r2.IVLREAL.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIVLREAL_HighClosed(), theXMLTypePackage.getBoolean(), "highClosed", null, 0, 1, org.hl7.cdsdt.r2.IVLREAL.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIVLREAL_LowClosed(), theXMLTypePackage.getBoolean(), "lowClosed", null, 0, 1, org.hl7.cdsdt.r2.IVLREAL.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ivltsEClass, org.hl7.cdsdt.r2.IVLTS.class, "IVLTS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIVLTS_Low(), this.getTS(), null, "low", null, 0, 1, org.hl7.cdsdt.r2.IVLTS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIVLTS_High(), this.getTS(), null, "high", null, 0, 1, org.hl7.cdsdt.r2.IVLTS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIVLTS_HighClosed(), theXMLTypePackage.getBoolean(), "highClosed", null, 0, 1, org.hl7.cdsdt.r2.IVLTS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIVLTS_LowClosed(), theXMLTypePackage.getBoolean(), "lowClosed", null, 0, 1, org.hl7.cdsdt.r2.IVLTS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pivltsEClass, org.hl7.cdsdt.r2.PIVLTS.class, "PIVLTS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPIVLTS_Phase(), this.getIVLTS(), null, "phase", null, 0, 1, org.hl7.cdsdt.r2.PIVLTS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPIVLTS_Period(), this.getPQ(), null, "period", null, 0, 1, org.hl7.cdsdt.r2.PIVLTS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPIVLTS_Frequency(), this.getRTO(), null, "frequency", null, 0, 1, org.hl7.cdsdt.r2.PIVLTS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPIVLTS_Count(), this.getINT(), null, "count", null, 0, 1, org.hl7.cdsdt.r2.PIVLTS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPIVLTS_Alignment(), this.getCalendarCycle(), "alignment", null, 0, 1, org.hl7.cdsdt.r2.PIVLTS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPIVLTS_IsFlexible(), theXMLTypePackage.getBoolean(), "isFlexible", null, 0, 1, org.hl7.cdsdt.r2.PIVLTS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pqEClass, org.hl7.cdsdt.r2.PQ.class, "PQ", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPQ_Unit(), this.getCode(), "unit", null, 1, 1, org.hl7.cdsdt.r2.PQ.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPQ_Value(), this.getDecimal(), "value", null, 1, 1, org.hl7.cdsdt.r2.PQ.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(qsetEClass, org.hl7.cdsdt.r2.QSET.class, "QSET", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(qtyEClass, org.hl7.cdsdt.r2.QTY.class, "QTY", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(realEClass, org.hl7.cdsdt.r2.REAL.class, "REAL", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getREAL_Value(), this.getDecimal(), "value", null, 1, 1, org.hl7.cdsdt.r2.REAL.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rtoEClass, org.hl7.cdsdt.r2.RTO.class, "RTO", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRTO_Numerator(), this.getQTY(), null, "numerator", null, 1, 1, org.hl7.cdsdt.r2.RTO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRTO_Denominator(), this.getQTY(), null, "denominator", null, 1, 1, org.hl7.cdsdt.r2.RTO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stEClass, org.hl7.cdsdt.r2.ST.class, "ST", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getST_Value(), theXMLTypePackage.getString(), "value", null, 1, 1, org.hl7.cdsdt.r2.ST.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(telEClass, org.hl7.cdsdt.r2.TEL.class, "TEL", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTEL_Capabilities(), this.getSetTelecommunicationCapability(), "capabilities", null, 0, 1, org.hl7.cdsdt.r2.TEL.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTEL_Use(), this.getSetTelecommunicationAddressUse(), "use", null, 0, 1, org.hl7.cdsdt.r2.TEL.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTEL_Value(), theXMLTypePackage.getAnyURI(), "value", null, 1, 1, org.hl7.cdsdt.r2.TEL.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tsEClass, org.hl7.cdsdt.r2.TS.class, "TS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTS_Value(), this.getTimeStamp(), "value", null, 1, 1, org.hl7.cdsdt.r2.TS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(xpEClass, org.hl7.cdsdt.r2.XP.class, "XP", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getXP_Value(), theXMLTypePackage.getString(), "value", null, 1, 1, org.hl7.cdsdt.r2.XP.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(addressPartTypeEEnum, AddressPartType.class, "AddressPartType");
		addEEnumLiteral(addressPartTypeEEnum, AddressPartType.AL);
		addEEnumLiteral(addressPartTypeEEnum, AddressPartType.ADL);
		addEEnumLiteral(addressPartTypeEEnum, AddressPartType.UNID);
		addEEnumLiteral(addressPartTypeEEnum, AddressPartType.UNIT);
		addEEnumLiteral(addressPartTypeEEnum, AddressPartType.DAL);
		addEEnumLiteral(addressPartTypeEEnum, AddressPartType.DINST);
		addEEnumLiteral(addressPartTypeEEnum, AddressPartType.DINSTA);
		addEEnumLiteral(addressPartTypeEEnum, AddressPartType.DINSTQ);
		addEEnumLiteral(addressPartTypeEEnum, AddressPartType.DMOD);
		addEEnumLiteral(addressPartTypeEEnum, AddressPartType.DMODID);
		addEEnumLiteral(addressPartTypeEEnum, AddressPartType.SAL);
		addEEnumLiteral(addressPartTypeEEnum, AddressPartType.BNR);
		addEEnumLiteral(addressPartTypeEEnum, AddressPartType.BNN);
		addEEnumLiteral(addressPartTypeEEnum, AddressPartType.BNS);
		addEEnumLiteral(addressPartTypeEEnum, AddressPartType.STR);
		addEEnumLiteral(addressPartTypeEEnum, AddressPartType.STB);
		addEEnumLiteral(addressPartTypeEEnum, AddressPartType.STTYP);
		addEEnumLiteral(addressPartTypeEEnum, AddressPartType.DIR);
		addEEnumLiteral(addressPartTypeEEnum, AddressPartType.INT);
		addEEnumLiteral(addressPartTypeEEnum, AddressPartType.CAR);
		addEEnumLiteral(addressPartTypeEEnum, AddressPartType.CEN);
		addEEnumLiteral(addressPartTypeEEnum, AddressPartType.CNT);
		addEEnumLiteral(addressPartTypeEEnum, AddressPartType.CPA);
		addEEnumLiteral(addressPartTypeEEnum, AddressPartType.CTY);
		addEEnumLiteral(addressPartTypeEEnum, AddressPartType.DEL);
		addEEnumLiteral(addressPartTypeEEnum, AddressPartType.POB);
		addEEnumLiteral(addressPartTypeEEnum, AddressPartType.PRE);
		addEEnumLiteral(addressPartTypeEEnum, AddressPartType.STA);
		addEEnumLiteral(addressPartTypeEEnum, AddressPartType.ZIP);
		addEEnumLiteral(addressPartTypeEEnum, AddressPartType.DPID);

		initEEnum(calendarCycleEEnum, CalendarCycle.class, "CalendarCycle");
		addEEnumLiteral(calendarCycleEEnum, CalendarCycle.CY);
		addEEnumLiteral(calendarCycleEEnum, CalendarCycle.MY);
		addEEnumLiteral(calendarCycleEEnum, CalendarCycle.CM);
		addEEnumLiteral(calendarCycleEEnum, CalendarCycle.CW);
		addEEnumLiteral(calendarCycleEEnum, CalendarCycle.WM);
		addEEnumLiteral(calendarCycleEEnum, CalendarCycle.WY);
		addEEnumLiteral(calendarCycleEEnum, CalendarCycle.DM);
		addEEnumLiteral(calendarCycleEEnum, CalendarCycle.CD);
		addEEnumLiteral(calendarCycleEEnum, CalendarCycle.DY);
		addEEnumLiteral(calendarCycleEEnum, CalendarCycle.DW);
		addEEnumLiteral(calendarCycleEEnum, CalendarCycle.HD);
		addEEnumLiteral(calendarCycleEEnum, CalendarCycle.CH);
		addEEnumLiteral(calendarCycleEEnum, CalendarCycle.NH);
		addEEnumLiteral(calendarCycleEEnum, CalendarCycle.CN);
		addEEnumLiteral(calendarCycleEEnum, CalendarCycle.SN);
		addEEnumLiteral(calendarCycleEEnum, CalendarCycle.CS);

		initEEnum(compressionEEnum, Compression.class, "Compression");
		addEEnumLiteral(compressionEEnum, Compression.DF);
		addEEnumLiteral(compressionEEnum, Compression.GZ);
		addEEnumLiteral(compressionEEnum, Compression.ZL);
		addEEnumLiteral(compressionEEnum, Compression.Z);
		addEEnumLiteral(compressionEEnum, Compression.BZ);
		addEEnumLiteral(compressionEEnum, Compression.Z7);

		initEEnum(entityNamePartQualifierEEnum, EntityNamePartQualifier.class, "EntityNamePartQualifier");
		addEEnumLiteral(entityNamePartQualifierEEnum, EntityNamePartQualifier.LS);
		addEEnumLiteral(entityNamePartQualifierEEnum, EntityNamePartQualifier.AC);
		addEEnumLiteral(entityNamePartQualifierEEnum, EntityNamePartQualifier.NB);
		addEEnumLiteral(entityNamePartQualifierEEnum, EntityNamePartQualifier.PR);
		addEEnumLiteral(entityNamePartQualifierEEnum, EntityNamePartQualifier.HON);
		addEEnumLiteral(entityNamePartQualifierEEnum, EntityNamePartQualifier.BR);
		addEEnumLiteral(entityNamePartQualifierEEnum, EntityNamePartQualifier.AD);
		addEEnumLiteral(entityNamePartQualifierEEnum, EntityNamePartQualifier.SP);
		addEEnumLiteral(entityNamePartQualifierEEnum, EntityNamePartQualifier.MID);
		addEEnumLiteral(entityNamePartQualifierEEnum, EntityNamePartQualifier.CL);
		addEEnumLiteral(entityNamePartQualifierEEnum, EntityNamePartQualifier.IN);
		addEEnumLiteral(entityNamePartQualifierEEnum, EntityNamePartQualifier.PFX);
		addEEnumLiteral(entityNamePartQualifierEEnum, EntityNamePartQualifier.SFX);

		initEEnum(entityNamePartTypeEEnum, EntityNamePartType.class, "EntityNamePartType");
		addEEnumLiteral(entityNamePartTypeEEnum, EntityNamePartType.FAM);
		addEEnumLiteral(entityNamePartTypeEEnum, EntityNamePartType.GIV);
		addEEnumLiteral(entityNamePartTypeEEnum, EntityNamePartType.TITLE);
		addEEnumLiteral(entityNamePartTypeEEnum, EntityNamePartType.DEL);

		initEEnum(entityNameUseEEnum, EntityNameUse.class, "EntityNameUse");
		addEEnumLiteral(entityNameUseEEnum, EntityNameUse.ABC);
		addEEnumLiteral(entityNameUseEEnum, EntityNameUse.IDE);
		addEEnumLiteral(entityNameUseEEnum, EntityNameUse.SYL);
		addEEnumLiteral(entityNameUseEEnum, EntityNameUse.C);
		addEEnumLiteral(entityNameUseEEnum, EntityNameUse.OR);
		addEEnumLiteral(entityNameUseEEnum, EntityNameUse.T);
		addEEnumLiteral(entityNameUseEEnum, EntityNameUse.I);
		addEEnumLiteral(entityNameUseEEnum, EntityNameUse.P);
		addEEnumLiteral(entityNameUseEEnum, EntityNameUse.ANON);
		addEEnumLiteral(entityNameUseEEnum, EntityNameUse.A);
		addEEnumLiteral(entityNameUseEEnum, EntityNameUse.R);
		addEEnumLiteral(entityNameUseEEnum, EntityNameUse.OLD);
		addEEnumLiteral(entityNameUseEEnum, EntityNameUse.DN);
		addEEnumLiteral(entityNameUseEEnum, EntityNameUse.M);
		addEEnumLiteral(entityNameUseEEnum, EntityNameUse.PHON);
		addEEnumLiteral(entityNameUseEEnum, EntityNameUse.SRCH);

		initEEnum(integrityCheckAlgorithmEEnum, IntegrityCheckAlgorithm.class, "IntegrityCheckAlgorithm");
		addEEnumLiteral(integrityCheckAlgorithmEEnum, IntegrityCheckAlgorithm.SHA1);
		addEEnumLiteral(integrityCheckAlgorithmEEnum, IntegrityCheckAlgorithm.SHA256);

		initEEnum(postalAddressUseEEnum, PostalAddressUse.class, "PostalAddressUse");
		addEEnumLiteral(postalAddressUseEEnum, PostalAddressUse.H);
		addEEnumLiteral(postalAddressUseEEnum, PostalAddressUse.HP);
		addEEnumLiteral(postalAddressUseEEnum, PostalAddressUse.HV);
		addEEnumLiteral(postalAddressUseEEnum, PostalAddressUse.WP);
		addEEnumLiteral(postalAddressUseEEnum, PostalAddressUse.DIR);
		addEEnumLiteral(postalAddressUseEEnum, PostalAddressUse.PUB);
		addEEnumLiteral(postalAddressUseEEnum, PostalAddressUse.BAD);
		addEEnumLiteral(postalAddressUseEEnum, PostalAddressUse.PHYS);
		addEEnumLiteral(postalAddressUseEEnum, PostalAddressUse.PST);
		addEEnumLiteral(postalAddressUseEEnum, PostalAddressUse.TMP);
		addEEnumLiteral(postalAddressUseEEnum, PostalAddressUse.ABC);
		addEEnumLiteral(postalAddressUseEEnum, PostalAddressUse.IDE);
		addEEnumLiteral(postalAddressUseEEnum, PostalAddressUse.SYL);
		addEEnumLiteral(postalAddressUseEEnum, PostalAddressUse.SRCH);
		addEEnumLiteral(postalAddressUseEEnum, PostalAddressUse.SNDX);
		addEEnumLiteral(postalAddressUseEEnum, PostalAddressUse.PHON);

		initEEnum(telecommunicationAddressUseEEnum, TelecommunicationAddressUse.class, "TelecommunicationAddressUse");
		addEEnumLiteral(telecommunicationAddressUseEEnum, TelecommunicationAddressUse.H);
		addEEnumLiteral(telecommunicationAddressUseEEnum, TelecommunicationAddressUse.HP);
		addEEnumLiteral(telecommunicationAddressUseEEnum, TelecommunicationAddressUse.HV);
		addEEnumLiteral(telecommunicationAddressUseEEnum, TelecommunicationAddressUse.WP);
		addEEnumLiteral(telecommunicationAddressUseEEnum, TelecommunicationAddressUse.DIR);
		addEEnumLiteral(telecommunicationAddressUseEEnum, TelecommunicationAddressUse.PUB);
		addEEnumLiteral(telecommunicationAddressUseEEnum, TelecommunicationAddressUse.BAD);
		addEEnumLiteral(telecommunicationAddressUseEEnum, TelecommunicationAddressUse.TMP);
		addEEnumLiteral(telecommunicationAddressUseEEnum, TelecommunicationAddressUse.AS);
		addEEnumLiteral(telecommunicationAddressUseEEnum, TelecommunicationAddressUse.EC);
		addEEnumLiteral(telecommunicationAddressUseEEnum, TelecommunicationAddressUse.MC);
		addEEnumLiteral(telecommunicationAddressUseEEnum, TelecommunicationAddressUse.PG);

		initEEnum(telecommunicationCapabilityEEnum, TelecommunicationCapability.class, "TelecommunicationCapability");
		addEEnumLiteral(telecommunicationCapabilityEEnum, TelecommunicationCapability.VOICE);
		addEEnumLiteral(telecommunicationCapabilityEEnum, TelecommunicationCapability.FAX);
		addEEnumLiteral(telecommunicationCapabilityEEnum, TelecommunicationCapability.DATA);
		addEEnumLiteral(telecommunicationCapabilityEEnum, TelecommunicationCapability.TTY);
		addEEnumLiteral(telecommunicationCapabilityEEnum, TelecommunicationCapability.SMS);

		// Initialize data types
		initEDataType(addressPartTypeObjectEDataType, AddressPartType.class, "AddressPartTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(calendarCycleObjectEDataType, CalendarCycle.class, "CalendarCycleObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(codeEDataType, String.class, "Code", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(compressionObjectEDataType, Compression.class, "CompressionObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(decimalEDataType, double.class, "Decimal", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(decimalObjectEDataType, Double.class, "DecimalObject", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(entityNamePartQualifierObjectEDataType, EntityNamePartQualifier.class, "EntityNamePartQualifierObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(entityNamePartTypeObjectEDataType, EntityNamePartType.class, "EntityNamePartTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(entityNameUseObjectEDataType, EntityNameUse.class, "EntityNameUseObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(integrityCheckAlgorithmObjectEDataType, IntegrityCheckAlgorithm.class, "IntegrityCheckAlgorithmObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(postalAddressUseObjectEDataType, PostalAddressUse.class, "PostalAddressUseObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(setEntityNamePartQualifierEDataType, List.class, "SetEntityNamePartQualifier", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(setEntityNameUseEDataType, List.class, "SetEntityNameUse", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(setPostalAddressUseEDataType, List.class, "SetPostalAddressUse", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(setTelecommunicationAddressUseEDataType, List.class, "SetTelecommunicationAddressUse", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(setTelecommunicationCapabilityEDataType, List.class, "SetTelecommunicationCapability", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(telecommunicationAddressUseObjectEDataType, TelecommunicationAddressUse.class, "TelecommunicationAddressUseObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(telecommunicationCapabilityObjectEDataType, TelecommunicationCapability.class, "TelecommunicationCapabilityObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(timeStampEDataType, String.class, "TimeStamp", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(uidEDataType, String.class, "Uid", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(uriEDataType, String.class, "Uri", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";	
		addAnnotation
		  (adEClass, 
		   source, 
		   new String[] {
			 "name", "AD",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getAD_Part(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "part",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getAD_Use(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "use"
		   });	
		addAnnotation
		  (addressPartTypeEEnum, 
		   source, 
		   new String[] {
			 "name", "AddressPartType"
		   });	
		addAnnotation
		  (addressPartTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "AddressPartType:Object",
			 "baseType", "AddressPartType"
		   });	
		addAnnotation
		  (adxpEClass, 
		   source, 
		   new String[] {
			 "name", "ADXP",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getADXP_Type(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "type"
		   });	
		addAnnotation
		  (anyEClass, 
		   source, 
		   new String[] {
			 "name", "ANY",
			 "kind", "empty"
		   });	
		addAnnotation
		  (blEClass, 
		   source, 
		   new String[] {
			 "name", "BL",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getBL_Value(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "value"
		   });	
		addAnnotation
		  (calendarCycleEEnum, 
		   source, 
		   new String[] {
			 "name", "CalendarCycle"
		   });	
		addAnnotation
		  (calendarCycleObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "CalendarCycle:Object",
			 "baseType", "CalendarCycle"
		   });	
		addAnnotation
		  (cdEClass, 
		   source, 
		   new String[] {
			 "name", "CD",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getCD_DisplayName(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "displayName",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getCD_OriginalText(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "originalText",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getCD_Translation(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "translation",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getCD_Code(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "code"
		   });	
		addAnnotation
		  (getCD_CodeSystem(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "codeSystem"
		   });	
		addAnnotation
		  (getCD_CodeSystemName(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "codeSystemName"
		   });	
		addAnnotation
		  (getCD_CodeSystemVersion(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "codeSystemVersion"
		   });	
		addAnnotation
		  (getCD_ValueSet(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "valueSet"
		   });	
		addAnnotation
		  (getCD_ValueSetVersion(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "valueSetVersion"
		   });	
		addAnnotation
		  (coEClass, 
		   source, 
		   new String[] {
			 "name", "CO",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getCO_Code(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "code",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getCO_Value(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "value"
		   });	
		addAnnotation
		  (codeEDataType, 
		   source, 
		   new String[] {
			 "name", "Code",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#string"
		   });	
		addAnnotation
		  (compressionEEnum, 
		   source, 
		   new String[] {
			 "name", "Compression"
		   });	
		addAnnotation
		  (compressionObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "Compression:Object",
			 "baseType", "Compression"
		   });	
		addAnnotation
		  (csEClass, 
		   source, 
		   new String[] {
			 "name", "CS",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getCS_Code(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "code"
		   });	
		addAnnotation
		  (decimalEDataType, 
		   source, 
		   new String[] {
			 "name", "Decimal",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#double"
		   });	
		addAnnotation
		  (decimalObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "Decimal:Object",
			 "baseType", "Decimal"
		   });	
		addAnnotation
		  (edEClass, 
		   source, 
		   new String[] {
			 "name", "ED",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getED_Data(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "data",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getED_Xml(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "xml",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getED_Reference(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "reference",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getED_IntegrityCheck(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "integrityCheck",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getED_Description(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "description",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getED_Charset(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "charset"
		   });	
		addAnnotation
		  (getED_Compression(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "compression"
		   });	
		addAnnotation
		  (getED_IntegrityCheckAlgorithm(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "integrityCheckAlgorithm"
		   });	
		addAnnotation
		  (getED_Language(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "language"
		   });	
		addAnnotation
		  (getED_MediaType(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "mediaType"
		   });	
		addAnnotation
		  (getED_Value(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "value"
		   });	
		addAnnotation
		  (enEClass, 
		   source, 
		   new String[] {
			 "name", "EN",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getEN_Part(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "part",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getEN_Use(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "use"
		   });	
		addAnnotation
		  (entityNamePartQualifierEEnum, 
		   source, 
		   new String[] {
			 "name", "EntityNamePartQualifier"
		   });	
		addAnnotation
		  (entityNamePartQualifierObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "EntityNamePartQualifier:Object",
			 "baseType", "EntityNamePartQualifier"
		   });	
		addAnnotation
		  (entityNamePartTypeEEnum, 
		   source, 
		   new String[] {
			 "name", "EntityNamePartType"
		   });	
		addAnnotation
		  (entityNamePartTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "EntityNamePartType:Object",
			 "baseType", "EntityNamePartType"
		   });	
		addAnnotation
		  (entityNameUseEEnum, 
		   source, 
		   new String[] {
			 "name", "EntityNameUse"
		   });	
		addAnnotation
		  (entityNameUseObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "EntityNameUse:Object",
			 "baseType", "EntityNameUse"
		   });	
		addAnnotation
		  (enxpEClass, 
		   source, 
		   new String[] {
			 "name", "ENXP",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getENXP_Qualifier(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "qualifier"
		   });	
		addAnnotation
		  (getENXP_Type(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "type"
		   });	
		addAnnotation
		  (hxitEClass, 
		   source, 
		   new String[] {
			 "name", "HXIT",
			 "kind", "empty"
		   });	
		addAnnotation
		  (iiEClass, 
		   source, 
		   new String[] {
			 "name", "II",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getII_Extension(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "extension"
		   });	
		addAnnotation
		  (getII_IdentifierName(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "identifierName"
		   });	
		addAnnotation
		  (getII_Root(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "root"
		   });	
		addAnnotation
		  (intEClass, 
		   source, 
		   new String[] {
			 "name", "INT",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getINT_Value(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "value"
		   });	
		addAnnotation
		  (integrityCheckAlgorithmEEnum, 
		   source, 
		   new String[] {
			 "name", "IntegrityCheckAlgorithm"
		   });	
		addAnnotation
		  (integrityCheckAlgorithmObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "IntegrityCheckAlgorithm:Object",
			 "baseType", "IntegrityCheckAlgorithm"
		   });	
		addAnnotation
		  (ivlEClass, 
		   source, 
		   new String[] {
			 "name", "IVL",
			 "kind", "empty"
		   });	
		addAnnotation
		  (ivlcoEClass, 
		   source, 
		   new String[] {
			 "name", "IVL_CO",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getIVLCO_Low(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "low",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getIVLCO_High(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "high",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getIVLCO_HighClosed(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "highClosed"
		   });	
		addAnnotation
		  (getIVLCO_LowClosed(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "lowClosed"
		   });	
		addAnnotation
		  (ivlintEClass, 
		   source, 
		   new String[] {
			 "name", "IVL_INT",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getIVLINT_Low(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "low",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getIVLINT_High(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "high",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getIVLINT_HighClosed(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "highClosed"
		   });	
		addAnnotation
		  (getIVLINT_LowClosed(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "lowClosed"
		   });	
		addAnnotation
		  (ivlpqEClass, 
		   source, 
		   new String[] {
			 "name", "IVL_PQ",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getIVLPQ_Low(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "low",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getIVLPQ_High(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "high",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getIVLPQ_HighClosed(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "highClosed"
		   });	
		addAnnotation
		  (getIVLPQ_LowClosed(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "lowClosed"
		   });	
		addAnnotation
		  (ivlqtyEClass, 
		   source, 
		   new String[] {
			 "name", "IVL_QTY",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getIVLQTY_Low(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "low",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getIVLQTY_High(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "high",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getIVLQTY_HighClosed(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "highClosed"
		   });	
		addAnnotation
		  (getIVLQTY_LowClosed(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "lowClosed"
		   });	
		addAnnotation
		  (ivlrealEClass, 
		   source, 
		   new String[] {
			 "name", "IVL_REAL",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getIVLREAL_Low(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "low",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getIVLREAL_High(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "high",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getIVLREAL_HighClosed(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "highClosed"
		   });	
		addAnnotation
		  (getIVLREAL_LowClosed(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "lowClosed"
		   });	
		addAnnotation
		  (ivltsEClass, 
		   source, 
		   new String[] {
			 "name", "IVL_TS",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getIVLTS_Low(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "low",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getIVLTS_High(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "high",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getIVLTS_HighClosed(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "highClosed"
		   });	
		addAnnotation
		  (getIVLTS_LowClosed(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "lowClosed"
		   });	
		addAnnotation
		  (pivltsEClass, 
		   source, 
		   new String[] {
			 "name", "PIVL_TS",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getPIVLTS_Phase(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "phase",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getPIVLTS_Period(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "period",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getPIVLTS_Frequency(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "frequency",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getPIVLTS_Count(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "count",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getPIVLTS_Alignment(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "alignment"
		   });	
		addAnnotation
		  (getPIVLTS_IsFlexible(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "isFlexible"
		   });	
		addAnnotation
		  (postalAddressUseEEnum, 
		   source, 
		   new String[] {
			 "name", "PostalAddressUse"
		   });	
		addAnnotation
		  (postalAddressUseObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "PostalAddressUse:Object",
			 "baseType", "PostalAddressUse"
		   });	
		addAnnotation
		  (pqEClass, 
		   source, 
		   new String[] {
			 "name", "PQ",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getPQ_Unit(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "unit"
		   });	
		addAnnotation
		  (getPQ_Value(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "value"
		   });	
		addAnnotation
		  (qsetEClass, 
		   source, 
		   new String[] {
			 "name", "QSET",
			 "kind", "empty"
		   });	
		addAnnotation
		  (qtyEClass, 
		   source, 
		   new String[] {
			 "name", "QTY",
			 "kind", "empty"
		   });	
		addAnnotation
		  (realEClass, 
		   source, 
		   new String[] {
			 "name", "REAL",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getREAL_Value(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "value"
		   });	
		addAnnotation
		  (rtoEClass, 
		   source, 
		   new String[] {
			 "name", "RTO",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getRTO_Numerator(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "numerator",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getRTO_Denominator(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "denominator",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (setEntityNamePartQualifierEDataType, 
		   source, 
		   new String[] {
			 "name", "set_EntityNamePartQualifier",
			 "itemType", "EntityNamePartQualifier"
		   });	
		addAnnotation
		  (setEntityNameUseEDataType, 
		   source, 
		   new String[] {
			 "name", "set_EntityNameUse",
			 "itemType", "EntityNameUse"
		   });	
		addAnnotation
		  (setPostalAddressUseEDataType, 
		   source, 
		   new String[] {
			 "name", "set_PostalAddressUse",
			 "itemType", "PostalAddressUse"
		   });	
		addAnnotation
		  (setTelecommunicationAddressUseEDataType, 
		   source, 
		   new String[] {
			 "name", "set_TelecommunicationAddressUse",
			 "itemType", "TelecommunicationAddressUse"
		   });	
		addAnnotation
		  (setTelecommunicationCapabilityEDataType, 
		   source, 
		   new String[] {
			 "name", "set_TelecommunicationCapability",
			 "itemType", "TelecommunicationCapability"
		   });	
		addAnnotation
		  (stEClass, 
		   source, 
		   new String[] {
			 "name", "ST",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getST_Value(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "value"
		   });	
		addAnnotation
		  (telEClass, 
		   source, 
		   new String[] {
			 "name", "TEL",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getTEL_Capabilities(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "capabilities"
		   });	
		addAnnotation
		  (getTEL_Use(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "use"
		   });	
		addAnnotation
		  (getTEL_Value(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "value"
		   });	
		addAnnotation
		  (telecommunicationAddressUseEEnum, 
		   source, 
		   new String[] {
			 "name", "TelecommunicationAddressUse"
		   });	
		addAnnotation
		  (telecommunicationAddressUseObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "TelecommunicationAddressUse:Object",
			 "baseType", "TelecommunicationAddressUse"
		   });	
		addAnnotation
		  (telecommunicationCapabilityEEnum, 
		   source, 
		   new String[] {
			 "name", "TelecommunicationCapability"
		   });	
		addAnnotation
		  (telecommunicationCapabilityObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "TelecommunicationCapability:Object",
			 "baseType", "TelecommunicationCapability"
		   });	
		addAnnotation
		  (timeStampEDataType, 
		   source, 
		   new String[] {
			 "name", "TimeStamp",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
			 "pattern", "[1-2][0-9]{3,3}(((0[1-9])|(1[0-2]))(((0[1-9])|([1-2][0-9])|(3[0-1]))((([0-1][0-9])|(2[0-3]))(([0-5][0-9])(([0-5][0-9])(\\.[0-9]{1,4})?)?)?)?)?)?([+\\-](0[0-9]|1[0-3])([0-5][0-9]))?"
		   });	
		addAnnotation
		  (tsEClass, 
		   source, 
		   new String[] {
			 "name", "TS",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getTS_Value(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "value"
		   });	
		addAnnotation
		  (uidEDataType, 
		   source, 
		   new String[] {
			 "name", "Uid",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#string"
		   });	
		addAnnotation
		  (uriEDataType, 
		   source, 
		   new String[] {
			 "name", "Uri",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#string"
		   });	
		addAnnotation
		  (xpEClass, 
		   source, 
		   new String[] {
			 "name", "XP",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getXP_Value(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "value"
		   });
	}

} //R2PackageImpl
