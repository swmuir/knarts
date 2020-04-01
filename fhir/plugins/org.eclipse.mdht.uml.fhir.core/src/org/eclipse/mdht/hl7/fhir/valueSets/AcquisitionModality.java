/**
 */
package org.eclipse.mdht.hl7.fhir.valueSets;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Acquisition Modality</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.mdht.hl7.fhir.valueSets.ValueSetsPackage#getAcquisitionModality()
 * @model
 * @generated
 */
public enum AcquisitionModality implements Enumerator {
	/**
	 * The '<em><b>Opv</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OPV_VALUE
	 * @generated
	 * @ordered
	 */
	OPV(0, "opv", "opv"),

	/**
	 * The '<em><b>Dx</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DX_VALUE
	 * @generated
	 * @ordered
	 */
	DX(1, "dx", "dx"),

	/**
	 * The '<em><b>Opt</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OPT_VALUE
	 * @generated
	 * @ordered
	 */
	OPT(2, "opt", "opt"),

	/**
	 * The '<em><b>Bmd</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BMD_VALUE
	 * @generated
	 * @ordered
	 */
	BMD(3, "bmd", "bmd"),

	/**
	 * The '<em><b>Mg</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MG_VALUE
	 * @generated
	 * @ordered
	 */
	MG(4, "mg", "mg"),

	/**
	 * The '<em><b>Sm</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SM_VALUE
	 * @generated
	 * @ordered
	 */
	SM(5, "sm", "sm"),

	/**
	 * The '<em><b>Us</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #US_VALUE
	 * @generated
	 * @ordered
	 */
	US(6, "us", "us"),

	/**
	 * The '<em><b>Op</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OP_VALUE
	 * @generated
	 * @ordered
	 */
	OP(7, "op", "op"),

	/**
	 * The '<em><b>Ivoct</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IVOCT_VALUE
	 * @generated
	 * @ordered
	 */
	IVOCT(8, "ivoct", "ivoct"),

	/**
	 * The '<em><b>Mr</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MR_VALUE
	 * @generated
	 * @ordered
	 */
	MR(9, "mr", "mr"),

	/**
	 * The '<em><b>Ecg</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ECG_VALUE
	 * @generated
	 * @ordered
	 */
	ECG(10, "ecg", "ecg"),

	/**
	 * The '<em><b>Gm</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GM_VALUE
	 * @generated
	 * @ordered
	 */
	GM(11, "gm", "gm"),

	/**
	 * The '<em><b>Io</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IO_VALUE
	 * @generated
	 * @ordered
	 */
	IO(12, "io", "io"),

	/**
	 * The '<em><b>Xa</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #XA_VALUE
	 * @generated
	 * @ordered
	 */
	XA(13, "xa", "xa"),

	/**
	 * The '<em><b>Xc</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #XC_VALUE
	 * @generated
	 * @ordered
	 */
	XC(14, "xc", "xc"),

	/**
	 * The '<em><b>Va</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VA_VALUE
	 * @generated
	 * @ordered
	 */
	VA(15, "va", "va"),

	/**
	 * The '<em><b>Ivus</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IVUS_VALUE
	 * @generated
	 * @ordered
	 */
	IVUS(16, "ivus", "ivus"),

	/**
	 * The '<em><b>Cr</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CR_VALUE
	 * @generated
	 * @ordered
	 */
	CR(17, "cr", "cr"),

	/**
	 * The '<em><b>Es</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ES_VALUE
	 * @generated
	 * @ordered
	 */
	ES(18, "es", "es"),

	/**
	 * The '<em><b>Ar</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AR_VALUE
	 * @generated
	 * @ordered
	 */
	AR(19, "ar", "ar"),

	/**
	 * The '<em><b>Ct</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CT_VALUE
	 * @generated
	 * @ordered
	 */
	CT(20, "ct", "ct"),

	/**
	 * The '<em><b>Oss</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OSS_VALUE
	 * @generated
	 * @ordered
	 */
	OSS(21, "oss", "oss"),

	/**
	 * The '<em><b>Len</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LEN_VALUE
	 * @generated
	 * @ordered
	 */
	LEN(22, "len", "len"),

	/**
	 * The '<em><b>Rg</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RG_VALUE
	 * @generated
	 * @ordered
	 */
	RG(23, "rg", "rg"),

	/**
	 * The '<em><b>Rf</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RF_VALUE
	 * @generated
	 * @ordered
	 */
	RF(24, "rf", "rf"),

	/**
	 * The '<em><b>Ker</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KER_VALUE
	 * @generated
	 * @ordered
	 */
	KER(25, "ker", "ker"),

	/**
	 * The '<em><b>Hd</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HD_VALUE
	 * @generated
	 * @ordered
	 */
	HD(26, "hd", "hd"),

	/**
	 * The '<em><b>Oam</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OAM_VALUE
	 * @generated
	 * @ordered
	 */
	OAM(27, "oam", "oam"),

	/**
	 * The '<em><b>Nm</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NM_VALUE
	 * @generated
	 * @ordered
	 */
	NM(28, "nm", "nm"),

	/**
	 * The '<em><b>Oct</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OCT_VALUE
	 * @generated
	 * @ordered
	 */
	OCT(29, "oct", "oct"),

	/**
	 * The '<em><b>Bdus</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BDUS_VALUE
	 * @generated
	 * @ordered
	 */
	BDUS(30, "bdus", "bdus"),

	/**
	 * The '<em><b>Pt</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PT_VALUE
	 * @generated
	 * @ordered
	 */
	PT(31, "pt", "pt"),

	/**
	 * The '<em><b>Eps</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EPS_VALUE
	 * @generated
	 * @ordered
	 */
	EPS(32, "eps", "eps"),

	/**
	 * The '<em><b>Px</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PX_VALUE
	 * @generated
	 * @ordered
	 */
	PX(33, "px", "px"),

	/**
	 * The '<em><b>Srf</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SRF_VALUE
	 * @generated
	 * @ordered
	 */
	SRF(34, "srf", "srf"),

	/**
	 * The '<em><b>Opm</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OPM_VALUE
	 * @generated
	 * @ordered
	 */
	OPM(35, "opm", "opm"),

	/**
	 * The '<em><b>Opr</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OPR_VALUE
	 * @generated
	 * @ordered
	 */
	OPR(36, "opr", "opr");

	/**
	 * The '<em><b>Opv</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OPV
	 * @model name="opv"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='OPV'"
	 * @generated
	 * @ordered
	 */
	public static final int OPV_VALUE = 0;

	/**
	 * The '<em><b>Dx</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DX
	 * @model name="dx"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='DX'"
	 * @generated
	 * @ordered
	 */
	public static final int DX_VALUE = 1;

	/**
	 * The '<em><b>Opt</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OPT
	 * @model name="opt"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='OPT'"
	 * @generated
	 * @ordered
	 */
	public static final int OPT_VALUE = 2;

	/**
	 * The '<em><b>Bmd</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BMD
	 * @model name="bmd"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='BMD'"
	 * @generated
	 * @ordered
	 */
	public static final int BMD_VALUE = 3;

	/**
	 * The '<em><b>Mg</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MG
	 * @model name="mg"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='MG'"
	 * @generated
	 * @ordered
	 */
	public static final int MG_VALUE = 4;

	/**
	 * The '<em><b>Sm</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SM
	 * @model name="sm"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='SM'"
	 * @generated
	 * @ordered
	 */
	public static final int SM_VALUE = 5;

	/**
	 * The '<em><b>Us</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #US
	 * @model name="us"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='US'"
	 * @generated
	 * @ordered
	 */
	public static final int US_VALUE = 6;

	/**
	 * The '<em><b>Op</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OP
	 * @model name="op"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='OP'"
	 * @generated
	 * @ordered
	 */
	public static final int OP_VALUE = 7;

	/**
	 * The '<em><b>Ivoct</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IVOCT
	 * @model name="ivoct"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='IVOCT'"
	 * @generated
	 * @ordered
	 */
	public static final int IVOCT_VALUE = 8;

	/**
	 * The '<em><b>Mr</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MR
	 * @model name="mr"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='MR'"
	 * @generated
	 * @ordered
	 */
	public static final int MR_VALUE = 9;

	/**
	 * The '<em><b>Ecg</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ECG
	 * @model name="ecg"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='ECG'"
	 * @generated
	 * @ordered
	 */
	public static final int ECG_VALUE = 10;

	/**
	 * The '<em><b>Gm</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GM
	 * @model name="gm"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='GM'"
	 * @generated
	 * @ordered
	 */
	public static final int GM_VALUE = 11;

	/**
	 * The '<em><b>Io</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IO
	 * @model name="io"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='IO'"
	 * @generated
	 * @ordered
	 */
	public static final int IO_VALUE = 12;

	/**
	 * The '<em><b>Xa</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #XA
	 * @model name="xa"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='XA'"
	 * @generated
	 * @ordered
	 */
	public static final int XA_VALUE = 13;

	/**
	 * The '<em><b>Xc</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #XC
	 * @model name="xc"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='XC'"
	 * @generated
	 * @ordered
	 */
	public static final int XC_VALUE = 14;

	/**
	 * The '<em><b>Va</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VA
	 * @model name="va"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='VA'"
	 * @generated
	 * @ordered
	 */
	public static final int VA_VALUE = 15;

	/**
	 * The '<em><b>Ivus</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IVUS
	 * @model name="ivus"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='IVUS'"
	 * @generated
	 * @ordered
	 */
	public static final int IVUS_VALUE = 16;

	/**
	 * The '<em><b>Cr</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CR
	 * @model name="cr"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='CR'"
	 * @generated
	 * @ordered
	 */
	public static final int CR_VALUE = 17;

	/**
	 * The '<em><b>Es</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ES
	 * @model name="es"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='ES'"
	 * @generated
	 * @ordered
	 */
	public static final int ES_VALUE = 18;

	/**
	 * The '<em><b>Ar</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AR
	 * @model name="ar"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='AR'"
	 * @generated
	 * @ordered
	 */
	public static final int AR_VALUE = 19;

	/**
	 * The '<em><b>Ct</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CT
	 * @model name="ct"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='CT'"
	 * @generated
	 * @ordered
	 */
	public static final int CT_VALUE = 20;

	/**
	 * The '<em><b>Oss</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OSS
	 * @model name="oss"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='OSS'"
	 * @generated
	 * @ordered
	 */
	public static final int OSS_VALUE = 21;

	/**
	 * The '<em><b>Len</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LEN
	 * @model name="len"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='LEN'"
	 * @generated
	 * @ordered
	 */
	public static final int LEN_VALUE = 22;

	/**
	 * The '<em><b>Rg</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RG
	 * @model name="rg"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='RG'"
	 * @generated
	 * @ordered
	 */
	public static final int RG_VALUE = 23;

	/**
	 * The '<em><b>Rf</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RF
	 * @model name="rf"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='RF'"
	 * @generated
	 * @ordered
	 */
	public static final int RF_VALUE = 24;

	/**
	 * The '<em><b>Ker</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KER
	 * @model name="ker"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='KER'"
	 * @generated
	 * @ordered
	 */
	public static final int KER_VALUE = 25;

	/**
	 * The '<em><b>Hd</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HD
	 * @model name="hd"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='HD'"
	 * @generated
	 * @ordered
	 */
	public static final int HD_VALUE = 26;

	/**
	 * The '<em><b>Oam</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OAM
	 * @model name="oam"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='OAM'"
	 * @generated
	 * @ordered
	 */
	public static final int OAM_VALUE = 27;

	/**
	 * The '<em><b>Nm</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NM
	 * @model name="nm"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='NM'"
	 * @generated
	 * @ordered
	 */
	public static final int NM_VALUE = 28;

	/**
	 * The '<em><b>Oct</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OCT
	 * @model name="oct"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='OCT'"
	 * @generated
	 * @ordered
	 */
	public static final int OCT_VALUE = 29;

	/**
	 * The '<em><b>Bdus</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BDUS
	 * @model name="bdus"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='BDUS'"
	 * @generated
	 * @ordered
	 */
	public static final int BDUS_VALUE = 30;

	/**
	 * The '<em><b>Pt</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PT
	 * @model name="pt"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='PT'"
	 * @generated
	 * @ordered
	 */
	public static final int PT_VALUE = 31;

	/**
	 * The '<em><b>Eps</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EPS
	 * @model name="eps"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='EPS'"
	 * @generated
	 * @ordered
	 */
	public static final int EPS_VALUE = 32;

	/**
	 * The '<em><b>Px</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PX
	 * @model name="px"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='PX'"
	 * @generated
	 * @ordered
	 */
	public static final int PX_VALUE = 33;

	/**
	 * The '<em><b>Srf</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SRF
	 * @model name="srf"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='SRF'"
	 * @generated
	 * @ordered
	 */
	public static final int SRF_VALUE = 34;

	/**
	 * The '<em><b>Opm</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OPM
	 * @model name="opm"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='OPM'"
	 * @generated
	 * @ordered
	 */
	public static final int OPM_VALUE = 35;

	/**
	 * The '<em><b>Opr</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OPR
	 * @model name="opr"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='OPR'"
	 * @generated
	 * @ordered
	 */
	public static final int OPR_VALUE = 36;

	/**
	 * An array of all the '<em><b>Acquisition Modality</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final AcquisitionModality[] VALUES_ARRAY =
		new AcquisitionModality[] {
			OPV,
			DX,
			OPT,
			BMD,
			MG,
			SM,
			US,
			OP,
			IVOCT,
			MR,
			ECG,
			GM,
			IO,
			XA,
			XC,
			VA,
			IVUS,
			CR,
			ES,
			AR,
			CT,
			OSS,
			LEN,
			RG,
			RF,
			KER,
			HD,
			OAM,
			NM,
			OCT,
			BDUS,
			PT,
			EPS,
			PX,
			SRF,
			OPM,
			OPR,
		};

	/**
	 * A public read-only list of all the '<em><b>Acquisition Modality</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<AcquisitionModality> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Acquisition Modality</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AcquisitionModality get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AcquisitionModality result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Acquisition Modality</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AcquisitionModality getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AcquisitionModality result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Acquisition Modality</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AcquisitionModality get(int value) {
		switch (value) {
			case OPV_VALUE: return OPV;
			case DX_VALUE: return DX;
			case OPT_VALUE: return OPT;
			case BMD_VALUE: return BMD;
			case MG_VALUE: return MG;
			case SM_VALUE: return SM;
			case US_VALUE: return US;
			case OP_VALUE: return OP;
			case IVOCT_VALUE: return IVOCT;
			case MR_VALUE: return MR;
			case ECG_VALUE: return ECG;
			case GM_VALUE: return GM;
			case IO_VALUE: return IO;
			case XA_VALUE: return XA;
			case XC_VALUE: return XC;
			case VA_VALUE: return VA;
			case IVUS_VALUE: return IVUS;
			case CR_VALUE: return CR;
			case ES_VALUE: return ES;
			case AR_VALUE: return AR;
			case CT_VALUE: return CT;
			case OSS_VALUE: return OSS;
			case LEN_VALUE: return LEN;
			case RG_VALUE: return RG;
			case RF_VALUE: return RF;
			case KER_VALUE: return KER;
			case HD_VALUE: return HD;
			case OAM_VALUE: return OAM;
			case NM_VALUE: return NM;
			case OCT_VALUE: return OCT;
			case BDUS_VALUE: return BDUS;
			case PT_VALUE: return PT;
			case EPS_VALUE: return EPS;
			case PX_VALUE: return PX;
			case SRF_VALUE: return SRF;
			case OPM_VALUE: return OPM;
			case OPR_VALUE: return OPR;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private AcquisitionModality(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //AcquisitionModality
