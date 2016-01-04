/*******************************************************************************
 * Copyright (c) 2016 David Carlson and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David Carlson (Clinical Cloud Solutions, LLC) - initial API and implementation
 *******************************************************************************/
/**
 */
package org.eclipse.mdht.uml.fhir.core.valueset;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>V2 Specimen Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.mdht.uml.fhir.core.valueset.FhirValuesetPackage#getV2SpecimenType()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='v2 Specimen Type'"
 * @generated
 */
public enum V2SpecimenType implements Enumerator {
	/**
	 * The '<em><b></b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #__VALUE
	 * @generated
	 * @ordered
	 */
	_(0, "_", "_"),

	/**
	 * The '<em><b>Abs</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ABS_VALUE
	 * @generated
	 * @ordered
	 */
	ABS(1, "abs", "abs"),

	/**
	 * The '<em><b>Acne</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACNE_VALUE
	 * @generated
	 * @ordered
	 */
	ACNE(2, "acne", "acne"),

	/**
	 * The '<em><b>Acnfld</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACNFLD_VALUE
	 * @generated
	 * @ordered
	 */
	ACNFLD(3, "acnfld", "acnfld"),

	/**
	 * The '<em><b>Airs</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AIRS_VALUE
	 * @generated
	 * @ordered
	 */
	AIRS(4, "airs", "airs"),

	/**
	 * The '<em><b>All</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ALL_VALUE
	 * @generated
	 * @ordered
	 */
	ALL(5, "all", "all"),

	/**
	 * The '<em><b>Amn</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AMN_VALUE
	 * @generated
	 * @ordered
	 */
	AMN(6, "amn", "amn"),

	/**
	 * The '<em><b>Amp</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AMP_VALUE
	 * @generated
	 * @ordered
	 */
	AMP(7, "amp", "amp"),

	/**
	 * The '<em><b>Angi</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ANGI_VALUE
	 * @generated
	 * @ordered
	 */
	ANGI(8, "angi", "angi"),

	/**
	 * The '<em><b>Artc</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ARTC_VALUE
	 * @generated
	 * @ordered
	 */
	ARTC(9, "artc", "artc"),

	/**
	 * The '<em><b>Aseru</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ASERU_VALUE
	 * @generated
	 * @ordered
	 */
	ASERU(10, "aseru", "aseru"),

	/**
	 * The '<em><b>Asp</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ASP_VALUE
	 * @generated
	 * @ordered
	 */
	ASP(11, "asp", "asp"),

	/**
	 * The '<em><b>Atte</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ATTE_VALUE
	 * @generated
	 * @ordered
	 */
	ATTE(12, "atte", "atte"),

	/**
	 * The '<em><b>Autoa</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AUTOA_VALUE
	 * @generated
	 * @ordered
	 */
	AUTOA(13, "autoa", "autoa"),

	/**
	 * The '<em><b>Autoc</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AUTOC_VALUE
	 * @generated
	 * @ordered
	 */
	AUTOC(14, "autoc", "autoc"),

	/**
	 * The '<em><b>Autp</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AUTP_VALUE
	 * @generated
	 * @ordered
	 */
	AUTP(15, "autp", "autp"),

	/**
	 * The '<em><b>Bbl</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BBL_VALUE
	 * @generated
	 * @ordered
	 */
	BBL(16, "bbl", "bbl"),

	/**
	 * The '<em><b>Bcyst</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BCYST_VALUE
	 * @generated
	 * @ordered
	 */
	BCYST(17, "bcyst", "bcyst"),

	/**
	 * The '<em><b>Bdy</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BDY_VALUE
	 * @generated
	 * @ordered
	 */
	BDY(18, "bdy", "bdy"),

	/**
	 * The '<em><b>Bifl</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BIFL_VALUE
	 * @generated
	 * @ordered
	 */
	BIFL(19, "bifl", "bifl"),

	/**
	 * The '<em><b>Bite</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BITE_VALUE
	 * @generated
	 * @ordered
	 */
	BITE(20, "bite", "bite"),

	/**
	 * The '<em><b>Bld</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BLD_VALUE
	 * @generated
	 * @ordered
	 */
	BLD(21, "bld", "bld"),

	/**
	 * The '<em><b>Blda</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BLDA_VALUE
	 * @generated
	 * @ordered
	 */
	BLDA(22, "blda", "blda"),

	/**
	 * The '<em><b>Bldco</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BLDCO_VALUE
	 * @generated
	 * @ordered
	 */
	BLDCO(23, "bldco", "bldco"),

	/**
	 * The '<em><b>Bldv</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BLDV_VALUE
	 * @generated
	 * @ordered
	 */
	BLDV(24, "bldv", "bldv"),

	/**
	 * The '<em><b>Bleb</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BLEB_VALUE
	 * @generated
	 * @ordered
	 */
	BLEB(25, "bleb", "bleb"),

	/**
	 * The '<em><b>Blist</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BLIST_VALUE
	 * @generated
	 * @ordered
	 */
	BLIST(26, "blist", "blist"),

	/**
	 * The '<em><b>Boil</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BOIL_VALUE
	 * @generated
	 * @ordered
	 */
	BOIL(27, "boil", "boil"),

	/**
	 * The '<em><b>Bon</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BON_VALUE
	 * @generated
	 * @ordered
	 */
	BON(28, "bon", "bon"),

	/**
	 * The '<em><b>Bone</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BONE_VALUE
	 * @generated
	 * @ordered
	 */
	BONE(29, "bone", "bone"),

	/**
	 * The '<em><b>Bowl</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BOWL_VALUE
	 * @generated
	 * @ordered
	 */
	BOWL(30, "bowl", "bowl"),

	/**
	 * The '<em><b>Bph</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BPH_VALUE
	 * @generated
	 * @ordered
	 */
	BPH(31, "bph", "bph"),

	/**
	 * The '<em><b>Bpu</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BPU_VALUE
	 * @generated
	 * @ordered
	 */
	BPU(32, "bpu", "bpu"),

	/**
	 * The '<em><b>Brn</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BRN_VALUE
	 * @generated
	 * @ordered
	 */
	BRN(33, "brn", "brn"),

	/**
	 * The '<em><b>Brsh</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BRSH_VALUE
	 * @generated
	 * @ordered
	 */
	BRSH(34, "brsh", "brsh"),

	/**
	 * The '<em><b>Brth</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BRTH_VALUE
	 * @generated
	 * @ordered
	 */
	BRTH(35, "brth", "brth"),

	/**
	 * The '<em><b>Brus</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BRUS_VALUE
	 * @generated
	 * @ordered
	 */
	BRUS(36, "brus", "brus"),

	/**
	 * The '<em><b>Bub</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BUB_VALUE
	 * @generated
	 * @ordered
	 */
	BUB(37, "bub", "bub"),

	/**
	 * The '<em><b>Bulla</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BULLA_VALUE
	 * @generated
	 * @ordered
	 */
	BULLA(38, "bulla", "bulla"),

	/**
	 * The '<em><b>Bx</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BX_VALUE
	 * @generated
	 * @ordered
	 */
	BX(39, "bx", "bx"),

	/**
	 * The '<em><b>Calc</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CALC_VALUE
	 * @generated
	 * @ordered
	 */
	CALC(40, "calc", "calc"),

	/**
	 * The '<em><b>Carbu</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CARBU_VALUE
	 * @generated
	 * @ordered
	 */
	CARBU(41, "carbu", "carbu"),

	/**
	 * The '<em><b>Cat</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CAT_VALUE
	 * @generated
	 * @ordered
	 */
	CAT(42, "cat", "cat"),

	/**
	 * The '<em><b>Cbite</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CBITE_VALUE
	 * @generated
	 * @ordered
	 */
	CBITE(43, "cbite", "cbite"),

	/**
	 * The '<em><b>Cdm</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDM_VALUE
	 * @generated
	 * @ordered
	 */
	CDM(44, "cdm", "cdm"),

	/**
	 * The '<em><b>Clipp</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLIPP_VALUE
	 * @generated
	 * @ordered
	 */
	CLIPP(45, "clipp", "clipp"),

	/**
	 * The '<em><b>Cnjt</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CNJT_VALUE
	 * @generated
	 * @ordered
	 */
	CNJT(46, "cnjt", "cnjt"),

	/**
	 * The '<em><b>Cnl</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CNL_VALUE
	 * @generated
	 * @ordered
	 */
	CNL(47, "cnl", "cnl"),

	/**
	 * The '<em><b>Col</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COL_VALUE
	 * @generated
	 * @ordered
	 */
	COL(48, "col", "col"),

	/**
	 * The '<em><b>Cone</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONE_VALUE
	 * @generated
	 * @ordered
	 */
	CONE(49, "cone", "cone"),

	/**
	 * The '<em><b>Cscr</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CSCR_VALUE
	 * @generated
	 * @ordered
	 */
	CSCR(50, "cscr", "cscr"),

	/**
	 * The '<em><b>Cseru</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CSERU_VALUE
	 * @generated
	 * @ordered
	 */
	CSERU(51, "cseru", "cseru"),

	/**
	 * The '<em><b>Csf</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CSF_VALUE
	 * @generated
	 * @ordered
	 */
	CSF(52, "csf", "csf"),

	/**
	 * The '<em><b>Csite</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CSITE_VALUE
	 * @generated
	 * @ordered
	 */
	CSITE(53, "csite", "csite"),

	/**
	 * The '<em><b>Csmy</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CSMY_VALUE
	 * @generated
	 * @ordered
	 */
	CSMY(54, "csmy", "csmy"),

	/**
	 * The '<em><b>Cst</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CST_VALUE
	 * @generated
	 * @ordered
	 */
	CST(55, "cst", "cst"),

	/**
	 * The '<em><b>Csvr</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CSVR_VALUE
	 * @generated
	 * @ordered
	 */
	CSVR(56, "csvr", "csvr"),

	/**
	 * The '<em><b>Ctp</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CTP_VALUE
	 * @generated
	 * @ordered
	 */
	CTP(57, "ctp", "ctp"),

	/**
	 * The '<em><b>Cur</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CUR_VALUE
	 * @generated
	 * @ordered
	 */
	CUR(58, "cur", "cur"),

	/**
	 * The '<em><b>Cvm</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CVM_VALUE
	 * @generated
	 * @ordered
	 */
	CVM(59, "cvm", "cvm"),

	/**
	 * The '<em><b>Cvps</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CVPS_VALUE
	 * @generated
	 * @ordered
	 */
	CVPS(60, "cvps", "cvps"),

	/**
	 * The '<em><b>Cvpt</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CVPT_VALUE
	 * @generated
	 * @ordered
	 */
	CVPT(61, "cvpt", "cvpt"),

	/**
	 * The '<em><b>Cyn</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CYN_VALUE
	 * @generated
	 * @ordered
	 */
	CYN(62, "cyn", "cyn"),

	/**
	 * The '<em><b>Cyst</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CYST_VALUE
	 * @generated
	 * @ordered
	 */
	CYST(63, "cyst", "cyst"),

	/**
	 * The '<em><b>Dbite</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DBITE_VALUE
	 * @generated
	 * @ordered
	 */
	DBITE(64, "dbite", "dbite"),

	/**
	 * The '<em><b>Dcs</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DCS_VALUE
	 * @generated
	 * @ordered
	 */
	DCS(65, "dcs", "dcs"),

	/**
	 * The '<em><b>Dec</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEC_VALUE
	 * @generated
	 * @ordered
	 */
	DEC(66, "dec", "dec"),

	/**
	 * The '<em><b>Deion</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEION_VALUE
	 * @generated
	 * @ordered
	 */
	DEION(67, "deion", "deion"),

	/**
	 * The '<em><b>Dia</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DIA_VALUE
	 * @generated
	 * @ordered
	 */
	DIA(68, "dia", "dia"),

	/**
	 * The '<em><b>Diaf</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DIAF_VALUE
	 * @generated
	 * @ordered
	 */
	DIAF(69, "diaf", "diaf"),

	/**
	 * The '<em><b>Dischg</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISCHG_VALUE
	 * @generated
	 * @ordered
	 */
	DISCHG(70, "dischg", "dischg"),

	/**
	 * The '<em><b>Div</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DIV_VALUE
	 * @generated
	 * @ordered
	 */
	DIV(71, "div", "div"),

	/**
	 * The '<em><b>Drn</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DRN_VALUE
	 * @generated
	 * @ordered
	 */
	DRN(72, "drn", "drn"),

	/**
	 * The '<em><b>Drng</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DRNG_VALUE
	 * @generated
	 * @ordered
	 */
	DRNG(73, "drng", "drng"),

	/**
	 * The '<em><b>Drngp</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DRNGP_VALUE
	 * @generated
	 * @ordered
	 */
	DRNGP(74, "drngp", "drngp"),

	/**
	 * The '<em><b>Dufl</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DUFL_VALUE
	 * @generated
	 * @ordered
	 */
	DUFL(75, "dufl", "dufl"),

	/**
	 * The '<em><b>Earw</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EARW_VALUE
	 * @generated
	 * @ordered
	 */
	EARW(76, "earw", "earw"),

	/**
	 * The '<em><b>Ebrush</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EBRUSH_VALUE
	 * @generated
	 * @ordered
	 */
	EBRUSH(77, "ebrush", "ebrush"),

	/**
	 * The '<em><b>Eeye</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EEYE_VALUE
	 * @generated
	 * @ordered
	 */
	EEYE(78, "eeye", "eeye"),

	/**
	 * The '<em><b>Eff</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EFF_VALUE
	 * @generated
	 * @ordered
	 */
	EFF(79, "eff", "eff"),

	/**
	 * The '<em><b>Effus</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EFFUS_VALUE
	 * @generated
	 * @ordered
	 */
	EFFUS(80, "effus", "effus"),

	/**
	 * The '<em><b>Efod</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EFOD_VALUE
	 * @generated
	 * @ordered
	 */
	EFOD(81, "efod", "efod"),

	/**
	 * The '<em><b>Eiso</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EISO_VALUE
	 * @generated
	 * @ordered
	 */
	EISO(82, "eiso", "eiso"),

	/**
	 * The '<em><b>Elt</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ELT_VALUE
	 * @generated
	 * @ordered
	 */
	ELT(83, "elt", "elt"),

	/**
	 * The '<em><b>Envir</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENVIR_VALUE
	 * @generated
	 * @ordered
	 */
	ENVIR(84, "envir", "envir"),

	/**
	 * The '<em><b>Eos</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EOS_VALUE
	 * @generated
	 * @ordered
	 */
	EOS(85, "eos", "eos"),

	/**
	 * The '<em><b>Eoth</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EOTH_VALUE
	 * @generated
	 * @ordered
	 */
	EOTH(86, "eoth", "eoth"),

	/**
	 * The '<em><b>Esoi</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ESOI_VALUE
	 * @generated
	 * @ordered
	 */
	ESOI(87, "esoi", "esoi"),

	/**
	 * The '<em><b>Esos</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ESOS_VALUE
	 * @generated
	 * @ordered
	 */
	ESOS(88, "esos", "esos"),

	/**
	 * The '<em><b>Eta</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ETA_VALUE
	 * @generated
	 * @ordered
	 */
	ETA(89, "eta", "eta"),

	/**
	 * The '<em><b>Ettp</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ETTP_VALUE
	 * @generated
	 * @ordered
	 */
	ETTP(90, "ettp", "ettp"),

	/**
	 * The '<em><b>Ettub</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ETTUB_VALUE
	 * @generated
	 * @ordered
	 */
	ETTUB(91, "ettub", "ettub"),

	/**
	 * The '<em><b>Ewhi</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EWHI_VALUE
	 * @generated
	 * @ordered
	 */
	EWHI(92, "ewhi", "ewhi"),

	/**
	 * The '<em><b>Exg</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXG_VALUE
	 * @generated
	 * @ordered
	 */
	EXG(93, "exg", "exg"),

	/**
	 * The '<em><b>Exs</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXS_VALUE
	 * @generated
	 * @ordered
	 */
	EXS(94, "exs", "exs"),

	/**
	 * The '<em><b>Exudte</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXUDTE_VALUE
	 * @generated
	 * @ordered
	 */
	EXUDTE(95, "exudte", "exudte"),

	/**
	 * The '<em><b>Faw</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FAW_VALUE
	 * @generated
	 * @ordered
	 */
	FAW(96, "faw", "faw"),

	/**
	 * The '<em><b>Fblood</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FBLOOD_VALUE
	 * @generated
	 * @ordered
	 */
	FBLOOD(97, "fblood", "fblood"),

	/**
	 * The '<em><b>Fga</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FGA_VALUE
	 * @generated
	 * @ordered
	 */
	FGA(98, "fga", "fga"),

	/**
	 * The '<em><b>Fib</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FIB_VALUE
	 * @generated
	 * @ordered
	 */
	FIB(99, "fib", "fib"),

	/**
	 * The '<em><b>Fist</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FIST_VALUE
	 * @generated
	 * @ordered
	 */
	FIST(100, "fist", "fist"),

	/**
	 * The '<em><b>Fld</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FLD_VALUE
	 * @generated
	 * @ordered
	 */
	FLD(101, "fld", "fld"),

	/**
	 * The '<em><b>Flt</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FLT_VALUE
	 * @generated
	 * @ordered
	 */
	FLT(102, "flt", "flt"),

	/**
	 * The '<em><b>Flu</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FLU_VALUE
	 * @generated
	 * @ordered
	 */
	FLU(103, "flu", "flu"),

	/**
	 * The '<em><b>Fluid</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FLUID_VALUE
	 * @generated
	 * @ordered
	 */
	FLUID(104, "fluid", "fluid"),

	/**
	 * The '<em><b>Foley</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FOLEY_VALUE
	 * @generated
	 * @ordered
	 */
	FOLEY(105, "foley", "foley"),

	/**
	 * The '<em><b>Frs</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FRS_VALUE
	 * @generated
	 * @ordered
	 */
	FRS(106, "frs", "frs"),

	/**
	 * The '<em><b>Fsclp</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FSCLP_VALUE
	 * @generated
	 * @ordered
	 */
	FSCLP(107, "fsclp", "fsclp"),

	/**
	 * The '<em><b>Fur</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FUR_VALUE
	 * @generated
	 * @ordered
	 */
	FUR(108, "fur", "fur"),

	/**
	 * The '<em><b>Gas</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GAS_VALUE
	 * @generated
	 * @ordered
	 */
	GAS(109, "gas", "gas"),

	/**
	 * The '<em><b>Gasa</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GASA_VALUE
	 * @generated
	 * @ordered
	 */
	GASA(110, "gasa", "gasa"),

	/**
	 * The '<em><b>Gasan</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GASAN_VALUE
	 * @generated
	 * @ordered
	 */
	GASAN(111, "gasan", "gasan"),

	/**
	 * The '<em><b>Gasbr</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GASBR_VALUE
	 * @generated
	 * @ordered
	 */
	GASBR(112, "gasbr", "gasbr"),

	/**
	 * The '<em><b>Gasd</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GASD_VALUE
	 * @generated
	 * @ordered
	 */
	GASD(113, "gasd", "gasd"),

	/**
	 * The '<em><b>Gast</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GAST_VALUE
	 * @generated
	 * @ordered
	 */
	GAST(114, "gast", "gast"),

	/**
	 * The '<em><b>Genl</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GENL_VALUE
	 * @generated
	 * @ordered
	 */
	GENL(115, "genl", "genl"),

	/**
	 * The '<em><b>Genv</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GENV_VALUE
	 * @generated
	 * @ordered
	 */
	GENV(116, "genv", "genv"),

	/**
	 * The '<em><b>Graft</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GRAFT_VALUE
	 * @generated
	 * @ordered
	 */
	GRAFT(117, "graft", "graft"),

	/**
	 * The '<em><b>Grafts</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GRAFTS_VALUE
	 * @generated
	 * @ordered
	 */
	GRAFTS(118, "grafts", "grafts"),

	/**
	 * The '<em><b>Granu</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GRANU_VALUE
	 * @generated
	 * @ordered
	 */
	GRANU(119, "granu", "granu"),

	/**
	 * The '<em><b>Grosh</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GROSH_VALUE
	 * @generated
	 * @ordered
	 */
	GROSH(120, "grosh", "grosh"),

	/**
	 * The '<em><b>Gsol</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GSOL_VALUE
	 * @generated
	 * @ordered
	 */
	GSOL(121, "gsol", "gsol"),

	/**
	 * The '<em><b>Gspec</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GSPEC_VALUE
	 * @generated
	 * @ordered
	 */
	GSPEC(122, "gspec", "gspec"),

	/**
	 * The '<em><b>Gt</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GT_VALUE
	 * @generated
	 * @ordered
	 */
	GT(123, "gt", "gt"),

	/**
	 * The '<em><b>Gtube</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GTUBE_VALUE
	 * @generated
	 * @ordered
	 */
	GTUBE(124, "gtube", "gtube"),

	/**
	 * The '<em><b>Har</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HAR_VALUE
	 * @generated
	 * @ordered
	 */
	HAR(125, "har", "har"),

	/**
	 * The '<em><b>Hbite</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HBITE_VALUE
	 * @generated
	 * @ordered
	 */
	HBITE(126, "hbite", "hbite"),

	/**
	 * The '<em><b>Hblud</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HBLUD_VALUE
	 * @generated
	 * @ordered
	 */
	HBLUD(127, "hblud", "hblud"),

	/**
	 * The '<em><b>Hemaq</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HEMAQ_VALUE
	 * @generated
	 * @ordered
	 */
	HEMAQ(128, "hemaq", "hemaq"),

	/**
	 * The '<em><b>Hemo</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HEMO_VALUE
	 * @generated
	 * @ordered
	 */
	HEMO(129, "hemo", "hemo"),

	/**
	 * The '<em><b>Herni</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HERNI_VALUE
	 * @generated
	 * @ordered
	 */
	HERNI(130, "herni", "herni"),

	/**
	 * The '<em><b>Hev</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HEV_VALUE
	 * @generated
	 * @ordered
	 */
	HEV(131, "hev", "hev"),

	/**
	 * The '<em><b>Hic</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HIC_VALUE
	 * @generated
	 * @ordered
	 */
	HIC(132, "hic", "hic"),

	/**
	 * The '<em><b>Hydc</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HYDC_VALUE
	 * @generated
	 * @ordered
	 */
	HYDC(133, "hydc", "hydc"),

	/**
	 * The '<em><b>Ibite</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IBITE_VALUE
	 * @generated
	 * @ordered
	 */
	IBITE(134, "ibite", "ibite"),

	/**
	 * The '<em><b>Icyst</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ICYST_VALUE
	 * @generated
	 * @ordered
	 */
	ICYST(135, "icyst", "icyst"),

	/**
	 * The '<em><b>Idc</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IDC_VALUE
	 * @generated
	 * @ordered
	 */
	IDC(136, "idc", "idc"),

	/**
	 * The '<em><b>Ihg</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IHG_VALUE
	 * @generated
	 * @ordered
	 */
	IHG(137, "ihg", "ihg"),

	/**
	 * The '<em><b>Ileo</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ILEO_VALUE
	 * @generated
	 * @ordered
	 */
	ILEO(138, "ileo", "ileo"),

	/**
	 * The '<em><b>Illeg</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ILLEG_VALUE
	 * @generated
	 * @ordered
	 */
	ILLEG(139, "illeg", "illeg"),

	/**
	 * The '<em><b>Imp</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IMP_VALUE
	 * @generated
	 * @ordered
	 */
	IMP(140, "imp", "imp"),

	/**
	 * The '<em><b>Inci</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INCI_VALUE
	 * @generated
	 * @ordered
	 */
	INCI(141, "inci", "inci"),

	/**
	 * The '<em><b>Infil</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INFIL_VALUE
	 * @generated
	 * @ordered
	 */
	INFIL(142, "infil", "infil"),

	/**
	 * The '<em><b>Ins</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INS_VALUE
	 * @generated
	 * @ordered
	 */
	INS(143, "ins", "ins"),

	/**
	 * The '<em><b>Intrd</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTRD_VALUE
	 * @generated
	 * @ordered
	 */
	INTRD(144, "intrd", "intrd"),

	/**
	 * The '<em><b>Islt</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ISLT_VALUE
	 * @generated
	 * @ordered
	 */
	ISLT(145, "islt", "islt"),

	/**
	 * The '<em><b>It</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IT_VALUE
	 * @generated
	 * @ordered
	 */
	IT(146, "it", "it"),

	/**
	 * The '<em><b>Iud</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IUD_VALUE
	 * @generated
	 * @ordered
	 */
	IUD(147, "iud", "iud"),

	/**
	 * The '<em><b>Ivcat</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IVCAT_VALUE
	 * @generated
	 * @ordered
	 */
	IVCAT(148, "ivcat", "ivcat"),

	/**
	 * The '<em><b>Ivfld</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IVFLD_VALUE
	 * @generated
	 * @ordered
	 */
	IVFLD(149, "ivfld", "ivfld"),

	/**
	 * The '<em><b>Ivtip</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IVTIP_VALUE
	 * @generated
	 * @ordered
	 */
	IVTIP(150, "ivtip", "ivtip"),

	/**
	 * The '<em><b>Jeju</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #JEJU_VALUE
	 * @generated
	 * @ordered
	 */
	JEJU(151, "jeju", "jeju"),

	/**
	 * The '<em><b>Jntfld</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #JNTFLD_VALUE
	 * @generated
	 * @ordered
	 */
	JNTFLD(152, "jntfld", "jntfld"),

	/**
	 * The '<em><b>Jp</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #JP_VALUE
	 * @generated
	 * @ordered
	 */
	JP(153, "jp", "jp"),

	/**
	 * The '<em><b>Keloi</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KELOI_VALUE
	 * @generated
	 * @ordered
	 */
	KELOI(154, "keloi", "keloi"),

	/**
	 * The '<em><b>Kidfld</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KIDFLD_VALUE
	 * @generated
	 * @ordered
	 */
	KIDFLD(155, "kidfld", "kidfld"),

	/**
	 * The '<em><b>Lavg</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LAVG_VALUE
	 * @generated
	 * @ordered
	 */
	LAVG(156, "lavg", "lavg"),

	/**
	 * The '<em><b>Lavgg</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LAVGG_VALUE
	 * @generated
	 * @ordered
	 */
	LAVGG(157, "lavgg", "lavgg"),

	/**
	 * The '<em><b>Lavgp</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LAVGP_VALUE
	 * @generated
	 * @ordered
	 */
	LAVGP(158, "lavgp", "lavgp"),

	/**
	 * The '<em><b>Lavpg</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LAVPG_VALUE
	 * @generated
	 * @ordered
	 */
	LAVPG(159, "lavpg", "lavpg"),

	/**
	 * The '<em><b>Lens1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LENS1_VALUE
	 * @generated
	 * @ordered
	 */
	LENS1(160, "lens1", "lens1"),

	/**
	 * The '<em><b>Lens2</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LENS2_VALUE
	 * @generated
	 * @ordered
	 */
	LENS2(161, "lens2", "lens2"),

	/**
	 * The '<em><b>Lesn</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LESN_VALUE
	 * @generated
	 * @ordered
	 */
	LESN(162, "lesn", "lesn"),

	/**
	 * The '<em><b>Liq</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LIQ_VALUE
	 * @generated
	 * @ordered
	 */
	LIQ(163, "liq", "liq"),

	/**
	 * The '<em><b>Liqo</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LIQO_VALUE
	 * @generated
	 * @ordered
	 */
	LIQO(164, "liqo", "liqo"),

	/**
	 * The '<em><b>Lna</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LNA_VALUE
	 * @generated
	 * @ordered
	 */
	LNA(165, "lna", "lna"),

	/**
	 * The '<em><b>Lnv</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LNV_VALUE
	 * @generated
	 * @ordered
	 */
	LNV(166, "lnv", "lnv"),

	/**
	 * The '<em><b>Lsac</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LSAC_VALUE
	 * @generated
	 * @ordered
	 */
	LSAC(167, "lsac", "lsac"),

	/**
	 * The '<em><b>Lym</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LYM_VALUE
	 * @generated
	 * @ordered
	 */
	LYM(168, "lym", "lym"),

	/**
	 * The '<em><b>Mac</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MAC_VALUE
	 * @generated
	 * @ordered
	 */
	MAC(169, "mac", "mac"),

	/**
	 * The '<em><b>Mahur</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MAHUR_VALUE
	 * @generated
	 * @ordered
	 */
	MAHUR(170, "mahur", "mahur"),

	/**
	 * The '<em><b>Mar</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MAR_VALUE
	 * @generated
	 * @ordered
	 */
	MAR(171, "mar", "mar"),

	/**
	 * The '<em><b>Mass</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MASS_VALUE
	 * @generated
	 * @ordered
	 */
	MASS(172, "mass", "mass"),

	/**
	 * The '<em><b>Mbld</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MBLD_VALUE
	 * @generated
	 * @ordered
	 */
	MBLD(173, "mbld", "mbld"),

	/**
	 * The '<em><b>Mec</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MEC_VALUE
	 * @generated
	 * @ordered
	 */
	MEC(174, "mec", "mec"),

	/**
	 * The '<em><b>Milk</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MILK_VALUE
	 * @generated
	 * @ordered
	 */
	MILK(175, "milk", "milk"),

	/**
	 * The '<em><b>Mlk</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MLK_VALUE
	 * @generated
	 * @ordered
	 */
	MLK(176, "mlk", "mlk"),

	/**
	 * The '<em><b>Mucos</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MUCOS_VALUE
	 * @generated
	 * @ordered
	 */
	MUCOS(177, "mucos", "mucos"),

	/**
	 * The '<em><b>Mucus</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MUCUS_VALUE
	 * @generated
	 * @ordered
	 */
	MUCUS(178, "mucus", "mucus"),

	/**
	 * The '<em><b>Nail</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NAIL_VALUE
	 * @generated
	 * @ordered
	 */
	NAIL(179, "nail", "nail"),

	/**
	 * The '<em><b>Nasdr</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NASDR_VALUE
	 * @generated
	 * @ordered
	 */
	NASDR(180, "nasdr", "nasdr"),

	/**
	 * The '<em><b>Nedl</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NEDL_VALUE
	 * @generated
	 * @ordered
	 */
	NEDL(181, "nedl", "nedl"),

	/**
	 * The '<em><b>Neph</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NEPH_VALUE
	 * @generated
	 * @ordered
	 */
	NEPH(182, "neph", "neph"),

	/**
	 * The '<em><b>Ngasp</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NGASP_VALUE
	 * @generated
	 * @ordered
	 */
	NGASP(183, "ngasp", "ngasp"),

	/**
	 * The '<em><b>Ngast</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NGAST_VALUE
	 * @generated
	 * @ordered
	 */
	NGAST(184, "ngast", "ngast"),

	/**
	 * The '<em><b>Ngs</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NGS_VALUE
	 * @generated
	 * @ordered
	 */
	NGS(185, "ngs", "ngs"),

	/**
	 * The '<em><b>Nodul</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NODUL_VALUE
	 * @generated
	 * @ordered
	 */
	NODUL(186, "nodul", "nodul"),

	/**
	 * The '<em><b>Nsecr</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NSECR_VALUE
	 * @generated
	 * @ordered
	 */
	NSECR(187, "nsecr", "nsecr"),

	/**
	 * The '<em><b>Orh</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ORH_VALUE
	 * @generated
	 * @ordered
	 */
	ORH(188, "orh", "orh"),

	/**
	 * The '<em><b>Orl</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ORL_VALUE
	 * @generated
	 * @ordered
	 */
	ORL(189, "orl", "orl"),

	/**
	 * The '<em><b>Oth</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTH_VALUE
	 * @generated
	 * @ordered
	 */
	OTH(190, "oth", "oth"),

	/**
	 * The '<em><b>Pacem</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PACEM_VALUE
	 * @generated
	 * @ordered
	 */
	PACEM(191, "pacem", "pacem"),

	/**
	 * The '<em><b>Pafl</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PAFL_VALUE
	 * @generated
	 * @ordered
	 */
	PAFL(192, "pafl", "pafl"),

	/**
	 * The '<em><b>Pcfl</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PCFL_VALUE
	 * @generated
	 * @ordered
	 */
	PCFL(193, "pcfl", "pcfl"),

	/**
	 * The '<em><b>Pdsit</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PDSIT_VALUE
	 * @generated
	 * @ordered
	 */
	PDSIT(194, "pdsit", "pdsit"),

	/**
	 * The '<em><b>Pdts</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PDTS_VALUE
	 * @generated
	 * @ordered
	 */
	PDTS(195, "pdts", "pdts"),

	/**
	 * The '<em><b>Pelva</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PELVA_VALUE
	 * @generated
	 * @ordered
	 */
	PELVA(196, "pelva", "pelva"),

	/**
	 * The '<em><b>Penil</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PENIL_VALUE
	 * @generated
	 * @ordered
	 */
	PENIL(197, "penil", "penil"),

	/**
	 * The '<em><b>Peria</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PERIA_VALUE
	 * @generated
	 * @ordered
	 */
	PERIA(198, "peria", "peria"),

	/**
	 * The '<em><b>Piloc</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PILOC_VALUE
	 * @generated
	 * @ordered
	 */
	PILOC(199, "piloc", "piloc"),

	/**
	 * The '<em><b>Pins</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PINS_VALUE
	 * @generated
	 * @ordered
	 */
	PINS(200, "pins", "pins"),

	/**
	 * The '<em><b>Pis</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PIS_VALUE
	 * @generated
	 * @ordered
	 */
	PIS(201, "pis", "pis"),

	/**
	 * The '<em><b>Plan</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PLAN_VALUE
	 * @generated
	 * @ordered
	 */
	PLAN(202, "plan", "plan"),

	/**
	 * The '<em><b>Plas</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PLAS_VALUE
	 * @generated
	 * @ordered
	 */
	PLAS(203, "plas", "plas"),

	/**
	 * The '<em><b>Plb</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PLB_VALUE
	 * @generated
	 * @ordered
	 */
	PLB(204, "plb", "plb"),

	/**
	 * The '<em><b>Plc</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PLC_VALUE
	 * @generated
	 * @ordered
	 */
	PLC(205, "plc", "plc"),

	/**
	 * The '<em><b>Plevs</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PLEVS_VALUE
	 * @generated
	 * @ordered
	 */
	PLEVS(206, "plevs", "plevs"),

	/**
	 * The '<em><b>Plr</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PLR_VALUE
	 * @generated
	 * @ordered
	 */
	PLR(207, "plr", "plr"),

	/**
	 * The '<em><b>Pmn</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PMN_VALUE
	 * @generated
	 * @ordered
	 */
	PMN(208, "pmn", "pmn"),

	/**
	 * The '<em><b>Pnd</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PND_VALUE
	 * @generated
	 * @ordered
	 */
	PND(209, "pnd", "pnd"),

	/**
	 * The '<em><b>Pol</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POL_VALUE
	 * @generated
	 * @ordered
	 */
	POL(210, "pol", "pol"),

	/**
	 * The '<em><b>Popgs</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POPGS_VALUE
	 * @generated
	 * @ordered
	 */
	POPGS(211, "popgs", "popgs"),

	/**
	 * The '<em><b>Poplg</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POPLG_VALUE
	 * @generated
	 * @ordered
	 */
	POPLG(212, "poplg", "poplg"),

	/**
	 * The '<em><b>Poplv</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POPLV_VALUE
	 * @generated
	 * @ordered
	 */
	POPLV(213, "poplv", "poplv"),

	/**
	 * The '<em><b>Porta</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PORTA_VALUE
	 * @generated
	 * @ordered
	 */
	PORTA(214, "porta", "porta"),

	/**
	 * The '<em><b>Ppp</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PPP_VALUE
	 * @generated
	 * @ordered
	 */
	PPP(215, "ppp", "ppp"),

	/**
	 * The '<em><b>Prost</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROST_VALUE
	 * @generated
	 * @ordered
	 */
	PROST(216, "prost", "prost"),

	/**
	 * The '<em><b>Prp</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRP_VALUE
	 * @generated
	 * @ordered
	 */
	PRP(217, "prp", "prp"),

	/**
	 * The '<em><b>Psc</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PSC_VALUE
	 * @generated
	 * @ordered
	 */
	PSC(218, "psc", "psc"),

	/**
	 * The '<em><b>Punct</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PUNCT_VALUE
	 * @generated
	 * @ordered
	 */
	PUNCT(219, "punct", "punct"),

	/**
	 * The '<em><b>Pus</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PUS_VALUE
	 * @generated
	 * @ordered
	 */
	PUS(220, "pus", "pus"),

	/**
	 * The '<em><b>Pusfr</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PUSFR_VALUE
	 * @generated
	 * @ordered
	 */
	PUSFR(221, "pusfr", "pusfr"),

	/**
	 * The '<em><b>Pust</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PUST_VALUE
	 * @generated
	 * @ordered
	 */
	PUST(222, "pust", "pust"),

	/**
	 * The '<em><b>Qc3</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #QC3_VALUE
	 * @generated
	 * @ordered
	 */
	QC3(223, "qc3", "qc3"),

	/**
	 * The '<em><b>Randu</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RANDU_VALUE
	 * @generated
	 * @ordered
	 */
	RANDU(224, "randu", "randu"),

	/**
	 * The '<em><b>Rbc</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RBC_VALUE
	 * @generated
	 * @ordered
	 */
	RBC(225, "rbc", "rbc"),

	/**
	 * The '<em><b>Rbite</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RBITE_VALUE
	 * @generated
	 * @ordered
	 */
	RBITE(226, "rbite", "rbite"),

	/**
	 * The '<em><b>Rect</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RECT_VALUE
	 * @generated
	 * @ordered
	 */
	RECT(227, "rect", "rect"),

	/**
	 * The '<em><b>Recta</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RECTA_VALUE
	 * @generated
	 * @ordered
	 */
	RECTA(228, "recta", "recta"),

	/**
	 * The '<em><b>Renalc</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RENALC_VALUE
	 * @generated
	 * @ordered
	 */
	RENALC(229, "renalc", "renalc"),

	/**
	 * The '<em><b>Renc</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RENC_VALUE
	 * @generated
	 * @ordered
	 */
	RENC(230, "renc", "renc"),

	/**
	 * The '<em><b>Res</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RES_VALUE
	 * @generated
	 * @ordered
	 */
	RES(231, "res", "res"),

	/**
	 * The '<em><b>Sal</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SAL_VALUE
	 * @generated
	 * @ordered
	 */
	SAL(232, "sal", "sal"),

	/**
	 * The '<em><b>Scar</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SCAR_VALUE
	 * @generated
	 * @ordered
	 */
	SCAR(233, "scar", "scar"),

	/**
	 * The '<em><b>Sclv</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SCLV_VALUE
	 * @generated
	 * @ordered
	 */
	SCLV(234, "sclv", "sclv"),

	/**
	 * The '<em><b>Scroa</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SCROA_VALUE
	 * @generated
	 * @ordered
	 */
	SCROA(235, "scroa", "scroa"),

	/**
	 * The '<em><b>Secre</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SECRE_VALUE
	 * @generated
	 * @ordered
	 */
	SECRE(236, "secre", "secre"),

	/**
	 * The '<em><b>Ser</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SER_VALUE
	 * @generated
	 * @ordered
	 */
	SER(237, "ser", "ser"),

	/**
	 * The '<em><b>Shu</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SHU_VALUE
	 * @generated
	 * @ordered
	 */
	SHU(238, "shu", "shu"),

	/**
	 * The '<em><b>Shunf</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SHUNF_VALUE
	 * @generated
	 * @ordered
	 */
	SHUNF(239, "shunf", "shunf"),

	/**
	 * The '<em><b>Shunt</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SHUNT_VALUE
	 * @generated
	 * @ordered
	 */
	SHUNT(240, "shunt", "shunt"),

	/**
	 * The '<em><b>Site</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SITE_VALUE
	 * @generated
	 * @ordered
	 */
	SITE(241, "site", "site"),

	/**
	 * The '<em><b>Skbp</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SKBP_VALUE
	 * @generated
	 * @ordered
	 */
	SKBP(242, "skbp", "skbp"),

	/**
	 * The '<em><b>Skn</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SKN_VALUE
	 * @generated
	 * @ordered
	 */
	SKN(243, "skn", "skn"),

	/**
	 * The '<em><b>Smm</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SMM_VALUE
	 * @generated
	 * @ordered
	 */
	SMM(244, "smm", "smm"),

	/**
	 * The '<em><b>Smn</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SMN_VALUE
	 * @generated
	 * @ordered
	 */
	SMN(245, "smn", "smn"),

	/**
	 * The '<em><b>Snv</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SNV_VALUE
	 * @generated
	 * @ordered
	 */
	SNV(246, "snv", "snv"),

	/**
	 * The '<em><b>Sprm</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SPRM_VALUE
	 * @generated
	 * @ordered
	 */
	SPRM(247, "sprm", "sprm"),

	/**
	 * The '<em><b>Sprp</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SPRP_VALUE
	 * @generated
	 * @ordered
	 */
	SPRP(248, "sprp", "sprp"),

	/**
	 * The '<em><b>Sprpb</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SPRPB_VALUE
	 * @generated
	 * @ordered
	 */
	SPRPB(249, "sprpb", "sprpb"),

	/**
	 * The '<em><b>Sps</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SPS_VALUE
	 * @generated
	 * @ordered
	 */
	SPS(250, "sps", "sps"),

	/**
	 * The '<em><b>Spt</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SPT_VALUE
	 * @generated
	 * @ordered
	 */
	SPT(251, "spt", "spt"),

	/**
	 * The '<em><b>Sptc</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SPTC_VALUE
	 * @generated
	 * @ordered
	 */
	SPTC(252, "sptc", "sptc"),

	/**
	 * The '<em><b>Sptt</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SPTT_VALUE
	 * @generated
	 * @ordered
	 */
	SPTT(253, "sptt", "sptt"),

	/**
	 * The '<em><b>Sput1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SPUT1_VALUE
	 * @generated
	 * @ordered
	 */
	SPUT1(254, "sput1", "sput1"),

	/**
	 * The '<em><b>Sputin</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SPUTIN_VALUE
	 * @generated
	 * @ordered
	 */
	SPUTIN(255, "sputin", "sputin"),

	/**
	 * The '<em><b>Sputsp</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SPUTSP_VALUE
	 * @generated
	 * @ordered
	 */
	SPUTSP(256, "sputsp", "sputsp"),

	/**
	 * The '<em><b>Ster</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STER_VALUE
	 * @generated
	 * @ordered
	 */
	STER(257, "ster", "ster"),

	/**
	 * The '<em><b>Stl</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STL_VALUE
	 * @generated
	 * @ordered
	 */
	STL(258, "stl", "stl"),

	/**
	 * The '<em><b>Stone</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STONE_VALUE
	 * @generated
	 * @ordered
	 */
	STONE(259, "stone", "stone"),

	/**
	 * The '<em><b>Subma</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUBMA_VALUE
	 * @generated
	 * @ordered
	 */
	SUBMA(260, "subma", "subma"),

	/**
	 * The '<em><b>Submx</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUBMX_VALUE
	 * @generated
	 * @ordered
	 */
	SUBMX(261, "submx", "submx"),

	/**
	 * The '<em><b>Sump</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUMP_VALUE
	 * @generated
	 * @ordered
	 */
	SUMP(262, "sump", "sump"),

	/**
	 * The '<em><b>Sup</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUP_VALUE
	 * @generated
	 * @ordered
	 */
	SUP(263, "sup", "sup"),

	/**
	 * The '<em><b>Sutur</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUTUR_VALUE
	 * @generated
	 * @ordered
	 */
	SUTUR(264, "sutur", "sutur"),

	/**
	 * The '<em><b>Swgz</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SWGZ_VALUE
	 * @generated
	 * @ordered
	 */
	SWGZ(265, "swgz", "swgz"),

	/**
	 * The '<em><b>Swt</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SWT_VALUE
	 * @generated
	 * @ordered
	 */
	SWT(266, "swt", "swt"),

	/**
	 * The '<em><b>Tasp</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TASP_VALUE
	 * @generated
	 * @ordered
	 */
	TASP(267, "tasp", "tasp"),

	/**
	 * The '<em><b>Tear</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TEAR_VALUE
	 * @generated
	 * @ordered
	 */
	TEAR(268, "tear", "tear"),

	/**
	 * The '<em><b>Thrb</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #THRB_VALUE
	 * @generated
	 * @ordered
	 */
	THRB(269, "thrb", "thrb"),

	/**
	 * The '<em><b>Tiss</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TISS_VALUE
	 * @generated
	 * @ordered
	 */
	TISS(270, "tiss", "tiss"),

	/**
	 * The '<em><b>Tisu</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TISU_VALUE
	 * @generated
	 * @ordered
	 */
	TISU(271, "tisu", "tisu"),

	/**
	 * The '<em><b>Tlc</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TLC_VALUE
	 * @generated
	 * @ordered
	 */
	TLC(272, "tlc", "tlc"),

	/**
	 * The '<em><b>Trac</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRAC_VALUE
	 * @generated
	 * @ordered
	 */
	TRAC(273, "trac", "trac"),

	/**
	 * The '<em><b>Trans</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRANS_VALUE
	 * @generated
	 * @ordered
	 */
	TRANS(274, "trans", "trans"),

	/**
	 * The '<em><b>Tseru</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TSERU_VALUE
	 * @generated
	 * @ordered
	 */
	TSERU(275, "tseru", "tseru"),

	/**
	 * The '<em><b>Tstes</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TSTES_VALUE
	 * @generated
	 * @ordered
	 */
	TSTES(276, "tstes", "tstes"),

	/**
	 * The '<em><b>Ttra</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TTRA_VALUE
	 * @generated
	 * @ordered
	 */
	TTRA(277, "ttra", "ttra"),

	/**
	 * The '<em><b>Tubes</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TUBES_VALUE
	 * @generated
	 * @ordered
	 */
	TUBES(278, "tubes", "tubes"),

	/**
	 * The '<em><b>Tumor</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TUMOR_VALUE
	 * @generated
	 * @ordered
	 */
	TUMOR(279, "tumor", "tumor"),

	/**
	 * The '<em><b>Tzanc</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TZANC_VALUE
	 * @generated
	 * @ordered
	 */
	TZANC(280, "tzanc", "tzanc"),

	/**
	 * The '<em><b>Udent</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UDENT_VALUE
	 * @generated
	 * @ordered
	 */
	UDENT(281, "udent", "udent"),

	/**
	 * The '<em><b>Umed</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UMED_VALUE
	 * @generated
	 * @ordered
	 */
	UMED(282, "umed", "umed"),

	/**
	 * The '<em><b>Ur</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UR_VALUE
	 * @generated
	 * @ordered
	 */
	UR(283, "ur", "ur"),

	/**
	 * The '<em><b>Urc</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #URC_VALUE
	 * @generated
	 * @ordered
	 */
	URC(284, "urc", "urc"),

	/**
	 * The '<em><b>Urinb</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #URINB_VALUE
	 * @generated
	 * @ordered
	 */
	URINB(285, "urinb", "urinb"),

	/**
	 * The '<em><b>Urinc</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #URINC_VALUE
	 * @generated
	 * @ordered
	 */
	URINC(286, "urinc", "urinc"),

	/**
	 * The '<em><b>Urinm</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #URINM_VALUE
	 * @generated
	 * @ordered
	 */
	URINM(287, "urinm", "urinm"),

	/**
	 * The '<em><b>Urinn</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #URINN_VALUE
	 * @generated
	 * @ordered
	 */
	URINN(288, "urinn", "urinn"),

	/**
	 * The '<em><b>Urinp</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #URINP_VALUE
	 * @generated
	 * @ordered
	 */
	URINP(289, "urinp", "urinp"),

	/**
	 * The '<em><b>Urns</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #URNS_VALUE
	 * @generated
	 * @ordered
	 */
	URNS(290, "urns", "urns"),

	/**
	 * The '<em><b>Urt</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #URT_VALUE
	 * @generated
	 * @ordered
	 */
	URT(291, "urt", "urt"),

	/**
	 * The '<em><b>Uscop</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #USCOP_VALUE
	 * @generated
	 * @ordered
	 */
	USCOP(292, "uscop", "uscop"),

	/**
	 * The '<em><b>Uspec</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #USPEC_VALUE
	 * @generated
	 * @ordered
	 */
	USPEC(293, "uspec", "uspec"),

	/**
	 * The '<em><b>Usub</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #USUB_VALUE
	 * @generated
	 * @ordered
	 */
	USUB(294, "usub", "usub"),

	/**
	 * The '<em><b>Vastip</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VASTIP_VALUE
	 * @generated
	 * @ordered
	 */
	VASTIP(295, "vastip", "vastip"),

	/**
	 * The '<em><b>Vent</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VENT_VALUE
	 * @generated
	 * @ordered
	 */
	VENT(296, "vent", "vent"),

	/**
	 * The '<em><b>Vitf</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VITF_VALUE
	 * @generated
	 * @ordered
	 */
	VITF(297, "vitf", "vitf"),

	/**
	 * The '<em><b>Vom</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VOM_VALUE
	 * @generated
	 * @ordered
	 */
	VOM(298, "vom", "vom"),

	/**
	 * The '<em><b>Wash</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WASH_VALUE
	 * @generated
	 * @ordered
	 */
	WASH(299, "wash", "wash"),

	/**
	 * The '<em><b>Wasi</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WASI_VALUE
	 * @generated
	 * @ordered
	 */
	WASI(300, "wasi", "wasi"),

	/**
	 * The '<em><b>Wat</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WAT_VALUE
	 * @generated
	 * @ordered
	 */
	WAT(301, "wat", "wat"),

	/**
	 * The '<em><b>Wb</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WB_VALUE
	 * @generated
	 * @ordered
	 */
	WB(302, "wb", "wb"),

	/**
	 * The '<em><b>Wbc</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WBC_VALUE
	 * @generated
	 * @ordered
	 */
	WBC(303, "wbc", "wbc"),

	/**
	 * The '<em><b>Wen</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WEN_VALUE
	 * @generated
	 * @ordered
	 */
	WEN(304, "wen", "wen"),

	/**
	 * The '<em><b>Wick</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WICK_VALUE
	 * @generated
	 * @ordered
	 */
	WICK(305, "wick", "wick"),

	/**
	 * The '<em><b>Wnd</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WND_VALUE
	 * @generated
	 * @ordered
	 */
	WND(306, "wnd", "wnd"),

	/**
	 * The '<em><b>Wnda</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WNDA_VALUE
	 * @generated
	 * @ordered
	 */
	WNDA(307, "wnda", "wnda"),

	/**
	 * The '<em><b>Wndd</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WNDD_VALUE
	 * @generated
	 * @ordered
	 */
	WNDD(308, "wndd", "wndd"),

	/**
	 * The '<em><b>Wnde</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WNDE_VALUE
	 * @generated
	 * @ordered
	 */
	WNDE(309, "wnde", "wnde"),

	/**
	 * The '<em><b>Worm</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WORM_VALUE
	 * @generated
	 * @ordered
	 */
	WORM(310, "worm", "worm"),

	/**
	 * The '<em><b>Wrt</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WRT_VALUE
	 * @generated
	 * @ordered
	 */
	WRT(311, "wrt", "wrt"),

	/**
	 * The '<em><b>Wwa</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WWA_VALUE
	 * @generated
	 * @ordered
	 */
	WWA(312, "wwa", "wwa"),

	/**
	 * The '<em><b>Wwo</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WWO_VALUE
	 * @generated
	 * @ordered
	 */
	WWO(313, "wwo", "wwo"),

	/**
	 * The '<em><b>Wwt</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WWT_VALUE
	 * @generated
	 * @ordered
	 */
	WWT(314, "wwt", "wwt");

	/**
	 * The '<em><b></b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b></b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #_
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='...'"
	 * @generated
	 * @ordered
	 */
	public static final int __VALUE = 0;

	/**
	 * The '<em><b>Abs</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Abs</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ABS
	 * @model name="abs"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='ABS'"
	 * @generated
	 * @ordered
	 */
	public static final int ABS_VALUE = 1;

	/**
	 * The '<em><b>Acne</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Acne</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ACNE
	 * @model name="acne"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='ACNE'"
	 * @generated
	 * @ordered
	 */
	public static final int ACNE_VALUE = 2;

	/**
	 * The '<em><b>Acnfld</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Acnfld</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ACNFLD
	 * @model name="acnfld"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='ACNFLD'"
	 * @generated
	 * @ordered
	 */
	public static final int ACNFLD_VALUE = 3;

	/**
	 * The '<em><b>Airs</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Airs</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #AIRS
	 * @model name="airs"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='AIRS'"
	 * @generated
	 * @ordered
	 */
	public static final int AIRS_VALUE = 4;

	/**
	 * The '<em><b>All</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>All</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ALL
	 * @model name="all"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='ALL'"
	 * @generated
	 * @ordered
	 */
	public static final int ALL_VALUE = 5;

	/**
	 * The '<em><b>Amn</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Amn</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #AMN
	 * @model name="amn"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='AMN'"
	 * @generated
	 * @ordered
	 */
	public static final int AMN_VALUE = 6;

	/**
	 * The '<em><b>Amp</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Amp</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #AMP
	 * @model name="amp"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='AMP'"
	 * @generated
	 * @ordered
	 */
	public static final int AMP_VALUE = 7;

	/**
	 * The '<em><b>Angi</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Angi</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ANGI
	 * @model name="angi"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='ANGI'"
	 * @generated
	 * @ordered
	 */
	public static final int ANGI_VALUE = 8;

	/**
	 * The '<em><b>Artc</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Artc</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ARTC
	 * @model name="artc"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='ARTC'"
	 * @generated
	 * @ordered
	 */
	public static final int ARTC_VALUE = 9;

	/**
	 * The '<em><b>Aseru</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Aseru</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ASERU
	 * @model name="aseru"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='ASERU'"
	 * @generated
	 * @ordered
	 */
	public static final int ASERU_VALUE = 10;

	/**
	 * The '<em><b>Asp</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Asp</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ASP
	 * @model name="asp"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='ASP'"
	 * @generated
	 * @ordered
	 */
	public static final int ASP_VALUE = 11;

	/**
	 * The '<em><b>Atte</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Atte</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ATTE
	 * @model name="atte"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='ATTE'"
	 * @generated
	 * @ordered
	 */
	public static final int ATTE_VALUE = 12;

	/**
	 * The '<em><b>Autoa</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Autoa</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #AUTOA
	 * @model name="autoa"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='AUTOA'"
	 * @generated
	 * @ordered
	 */
	public static final int AUTOA_VALUE = 13;

	/**
	 * The '<em><b>Autoc</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Autoc</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #AUTOC
	 * @model name="autoc"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='AUTOC'"
	 * @generated
	 * @ordered
	 */
	public static final int AUTOC_VALUE = 14;

	/**
	 * The '<em><b>Autp</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Autp</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #AUTP
	 * @model name="autp"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='AUTP'"
	 * @generated
	 * @ordered
	 */
	public static final int AUTP_VALUE = 15;

	/**
	 * The '<em><b>Bbl</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Bbl</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BBL
	 * @model name="bbl"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='BBL'"
	 * @generated
	 * @ordered
	 */
	public static final int BBL_VALUE = 16;

	/**
	 * The '<em><b>Bcyst</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Bcyst</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BCYST
	 * @model name="bcyst"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='BCYST'"
	 * @generated
	 * @ordered
	 */
	public static final int BCYST_VALUE = 17;

	/**
	 * The '<em><b>Bdy</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Bdy</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BDY
	 * @model name="bdy"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='BDY'"
	 * @generated
	 * @ordered
	 */
	public static final int BDY_VALUE = 18;

	/**
	 * The '<em><b>Bifl</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Bifl</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BIFL
	 * @model name="bifl"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='BIFL'"
	 * @generated
	 * @ordered
	 */
	public static final int BIFL_VALUE = 19;

	/**
	 * The '<em><b>Bite</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Bite</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BITE
	 * @model name="bite"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='BITE'"
	 * @generated
	 * @ordered
	 */
	public static final int BITE_VALUE = 20;

	/**
	 * The '<em><b>Bld</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Bld</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BLD
	 * @model name="bld"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='BLD'"
	 * @generated
	 * @ordered
	 */
	public static final int BLD_VALUE = 21;

	/**
	 * The '<em><b>Blda</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Blda</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BLDA
	 * @model name="blda"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='BLDA'"
	 * @generated
	 * @ordered
	 */
	public static final int BLDA_VALUE = 22;

	/**
	 * The '<em><b>Bldco</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Bldco</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BLDCO
	 * @model name="bldco"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='BLDCO'"
	 * @generated
	 * @ordered
	 */
	public static final int BLDCO_VALUE = 23;

	/**
	 * The '<em><b>Bldv</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Bldv</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BLDV
	 * @model name="bldv"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='BLDV'"
	 * @generated
	 * @ordered
	 */
	public static final int BLDV_VALUE = 24;

	/**
	 * The '<em><b>Bleb</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Bleb</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BLEB
	 * @model name="bleb"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='BLEB'"
	 * @generated
	 * @ordered
	 */
	public static final int BLEB_VALUE = 25;

	/**
	 * The '<em><b>Blist</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Blist</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BLIST
	 * @model name="blist"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='BLIST'"
	 * @generated
	 * @ordered
	 */
	public static final int BLIST_VALUE = 26;

	/**
	 * The '<em><b>Boil</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Boil</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BOIL
	 * @model name="boil"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='BOIL'"
	 * @generated
	 * @ordered
	 */
	public static final int BOIL_VALUE = 27;

	/**
	 * The '<em><b>Bon</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Bon</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BON
	 * @model name="bon"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='BON'"
	 * @generated
	 * @ordered
	 */
	public static final int BON_VALUE = 28;

	/**
	 * The '<em><b>Bone</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Bone</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BONE
	 * @model name="bone"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='BONE'"
	 * @generated
	 * @ordered
	 */
	public static final int BONE_VALUE = 29;

	/**
	 * The '<em><b>Bowl</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Bowl</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BOWL
	 * @model name="bowl"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='BOWL'"
	 * @generated
	 * @ordered
	 */
	public static final int BOWL_VALUE = 30;

	/**
	 * The '<em><b>Bph</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Bph</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BPH
	 * @model name="bph"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='BPH'"
	 * @generated
	 * @ordered
	 */
	public static final int BPH_VALUE = 31;

	/**
	 * The '<em><b>Bpu</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Bpu</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BPU
	 * @model name="bpu"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='BPU'"
	 * @generated
	 * @ordered
	 */
	public static final int BPU_VALUE = 32;

	/**
	 * The '<em><b>Brn</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Brn</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BRN
	 * @model name="brn"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='BRN'"
	 * @generated
	 * @ordered
	 */
	public static final int BRN_VALUE = 33;

	/**
	 * The '<em><b>Brsh</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Brsh</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BRSH
	 * @model name="brsh"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='BRSH'"
	 * @generated
	 * @ordered
	 */
	public static final int BRSH_VALUE = 34;

	/**
	 * The '<em><b>Brth</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Brth</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BRTH
	 * @model name="brth"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='BRTH'"
	 * @generated
	 * @ordered
	 */
	public static final int BRTH_VALUE = 35;

	/**
	 * The '<em><b>Brus</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Brus</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BRUS
	 * @model name="brus"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='BRUS'"
	 * @generated
	 * @ordered
	 */
	public static final int BRUS_VALUE = 36;

	/**
	 * The '<em><b>Bub</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Bub</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BUB
	 * @model name="bub"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='BUB'"
	 * @generated
	 * @ordered
	 */
	public static final int BUB_VALUE = 37;

	/**
	 * The '<em><b>Bulla</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Bulla</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BULLA
	 * @model name="bulla"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='BULLA'"
	 * @generated
	 * @ordered
	 */
	public static final int BULLA_VALUE = 38;

	/**
	 * The '<em><b>Bx</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Bx</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BX
	 * @model name="bx"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='BX'"
	 * @generated
	 * @ordered
	 */
	public static final int BX_VALUE = 39;

	/**
	 * The '<em><b>Calc</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Calc</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CALC
	 * @model name="calc"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='CALC'"
	 * @generated
	 * @ordered
	 */
	public static final int CALC_VALUE = 40;

	/**
	 * The '<em><b>Carbu</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Carbu</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CARBU
	 * @model name="carbu"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='CARBU'"
	 * @generated
	 * @ordered
	 */
	public static final int CARBU_VALUE = 41;

	/**
	 * The '<em><b>Cat</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Cat</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CAT
	 * @model name="cat"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='CAT'"
	 * @generated
	 * @ordered
	 */
	public static final int CAT_VALUE = 42;

	/**
	 * The '<em><b>Cbite</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Cbite</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CBITE
	 * @model name="cbite"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='CBITE'"
	 * @generated
	 * @ordered
	 */
	public static final int CBITE_VALUE = 43;

	/**
	 * The '<em><b>Cdm</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Cdm</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CDM
	 * @model name="cdm"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='CDM'"
	 * @generated
	 * @ordered
	 */
	public static final int CDM_VALUE = 44;

	/**
	 * The '<em><b>Clipp</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Clipp</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CLIPP
	 * @model name="clipp"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='CLIPP'"
	 * @generated
	 * @ordered
	 */
	public static final int CLIPP_VALUE = 45;

	/**
	 * The '<em><b>Cnjt</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Cnjt</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CNJT
	 * @model name="cnjt"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='CNJT'"
	 * @generated
	 * @ordered
	 */
	public static final int CNJT_VALUE = 46;

	/**
	 * The '<em><b>Cnl</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Cnl</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CNL
	 * @model name="cnl"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='CNL'"
	 * @generated
	 * @ordered
	 */
	public static final int CNL_VALUE = 47;

	/**
	 * The '<em><b>Col</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Col</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COL
	 * @model name="col"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='COL'"
	 * @generated
	 * @ordered
	 */
	public static final int COL_VALUE = 48;

	/**
	 * The '<em><b>Cone</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Cone</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONE
	 * @model name="cone"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='CONE'"
	 * @generated
	 * @ordered
	 */
	public static final int CONE_VALUE = 49;

	/**
	 * The '<em><b>Cscr</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Cscr</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CSCR
	 * @model name="cscr"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='CSCR'"
	 * @generated
	 * @ordered
	 */
	public static final int CSCR_VALUE = 50;

	/**
	 * The '<em><b>Cseru</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Cseru</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CSERU
	 * @model name="cseru"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='CSERU'"
	 * @generated
	 * @ordered
	 */
	public static final int CSERU_VALUE = 51;

	/**
	 * The '<em><b>Csf</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Csf</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CSF
	 * @model name="csf"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='CSF'"
	 * @generated
	 * @ordered
	 */
	public static final int CSF_VALUE = 52;

	/**
	 * The '<em><b>Csite</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Csite</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CSITE
	 * @model name="csite"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='CSITE'"
	 * @generated
	 * @ordered
	 */
	public static final int CSITE_VALUE = 53;

	/**
	 * The '<em><b>Csmy</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Csmy</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CSMY
	 * @model name="csmy"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='CSMY'"
	 * @generated
	 * @ordered
	 */
	public static final int CSMY_VALUE = 54;

	/**
	 * The '<em><b>Cst</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Cst</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CST
	 * @model name="cst"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='CST'"
	 * @generated
	 * @ordered
	 */
	public static final int CST_VALUE = 55;

	/**
	 * The '<em><b>Csvr</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Csvr</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CSVR
	 * @model name="csvr"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='CSVR'"
	 * @generated
	 * @ordered
	 */
	public static final int CSVR_VALUE = 56;

	/**
	 * The '<em><b>Ctp</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Ctp</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CTP
	 * @model name="ctp"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='CTP'"
	 * @generated
	 * @ordered
	 */
	public static final int CTP_VALUE = 57;

	/**
	 * The '<em><b>Cur</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Cur</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CUR
	 * @model name="cur"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='CUR'"
	 * @generated
	 * @ordered
	 */
	public static final int CUR_VALUE = 58;

	/**
	 * The '<em><b>Cvm</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Cvm</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CVM
	 * @model name="cvm"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='CVM'"
	 * @generated
	 * @ordered
	 */
	public static final int CVM_VALUE = 59;

	/**
	 * The '<em><b>Cvps</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Cvps</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CVPS
	 * @model name="cvps"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='CVPS'"
	 * @generated
	 * @ordered
	 */
	public static final int CVPS_VALUE = 60;

	/**
	 * The '<em><b>Cvpt</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Cvpt</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CVPT
	 * @model name="cvpt"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='CVPT'"
	 * @generated
	 * @ordered
	 */
	public static final int CVPT_VALUE = 61;

	/**
	 * The '<em><b>Cyn</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Cyn</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CYN
	 * @model name="cyn"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='CYN'"
	 * @generated
	 * @ordered
	 */
	public static final int CYN_VALUE = 62;

	/**
	 * The '<em><b>Cyst</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Cyst</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CYST
	 * @model name="cyst"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='CYST'"
	 * @generated
	 * @ordered
	 */
	public static final int CYST_VALUE = 63;

	/**
	 * The '<em><b>Dbite</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Dbite</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DBITE
	 * @model name="dbite"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='DBITE'"
	 * @generated
	 * @ordered
	 */
	public static final int DBITE_VALUE = 64;

	/**
	 * The '<em><b>Dcs</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Dcs</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DCS
	 * @model name="dcs"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='DCS'"
	 * @generated
	 * @ordered
	 */
	public static final int DCS_VALUE = 65;

	/**
	 * The '<em><b>Dec</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Dec</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DEC
	 * @model name="dec"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='DEC'"
	 * @generated
	 * @ordered
	 */
	public static final int DEC_VALUE = 66;

	/**
	 * The '<em><b>Deion</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Deion</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DEION
	 * @model name="deion"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='DEION'"
	 * @generated
	 * @ordered
	 */
	public static final int DEION_VALUE = 67;

	/**
	 * The '<em><b>Dia</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Dia</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DIA
	 * @model name="dia"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='DIA'"
	 * @generated
	 * @ordered
	 */
	public static final int DIA_VALUE = 68;

	/**
	 * The '<em><b>Diaf</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Diaf</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DIAF
	 * @model name="diaf"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='DIAF'"
	 * @generated
	 * @ordered
	 */
	public static final int DIAF_VALUE = 69;

	/**
	 * The '<em><b>Dischg</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Dischg</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DISCHG
	 * @model name="dischg"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='DISCHG'"
	 * @generated
	 * @ordered
	 */
	public static final int DISCHG_VALUE = 70;

	/**
	 * The '<em><b>Div</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Div</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DIV
	 * @model name="div"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='DIV'"
	 * @generated
	 * @ordered
	 */
	public static final int DIV_VALUE = 71;

	/**
	 * The '<em><b>Drn</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Drn</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DRN
	 * @model name="drn"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='DRN'"
	 * @generated
	 * @ordered
	 */
	public static final int DRN_VALUE = 72;

	/**
	 * The '<em><b>Drng</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Drng</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DRNG
	 * @model name="drng"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='DRNG'"
	 * @generated
	 * @ordered
	 */
	public static final int DRNG_VALUE = 73;

	/**
	 * The '<em><b>Drngp</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Drngp</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DRNGP
	 * @model name="drngp"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='DRNGP'"
	 * @generated
	 * @ordered
	 */
	public static final int DRNGP_VALUE = 74;

	/**
	 * The '<em><b>Dufl</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Dufl</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DUFL
	 * @model name="dufl"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='DUFL'"
	 * @generated
	 * @ordered
	 */
	public static final int DUFL_VALUE = 75;

	/**
	 * The '<em><b>Earw</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Earw</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EARW
	 * @model name="earw"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='EARW'"
	 * @generated
	 * @ordered
	 */
	public static final int EARW_VALUE = 76;

	/**
	 * The '<em><b>Ebrush</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Ebrush</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EBRUSH
	 * @model name="ebrush"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='EBRUSH'"
	 * @generated
	 * @ordered
	 */
	public static final int EBRUSH_VALUE = 77;

	/**
	 * The '<em><b>Eeye</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Eeye</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EEYE
	 * @model name="eeye"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='EEYE'"
	 * @generated
	 * @ordered
	 */
	public static final int EEYE_VALUE = 78;

	/**
	 * The '<em><b>Eff</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Eff</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EFF
	 * @model name="eff"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='EFF'"
	 * @generated
	 * @ordered
	 */
	public static final int EFF_VALUE = 79;

	/**
	 * The '<em><b>Effus</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Effus</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EFFUS
	 * @model name="effus"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='EFFUS'"
	 * @generated
	 * @ordered
	 */
	public static final int EFFUS_VALUE = 80;

	/**
	 * The '<em><b>Efod</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Efod</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EFOD
	 * @model name="efod"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='EFOD'"
	 * @generated
	 * @ordered
	 */
	public static final int EFOD_VALUE = 81;

	/**
	 * The '<em><b>Eiso</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Eiso</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EISO
	 * @model name="eiso"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='EISO'"
	 * @generated
	 * @ordered
	 */
	public static final int EISO_VALUE = 82;

	/**
	 * The '<em><b>Elt</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Elt</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ELT
	 * @model name="elt"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='ELT'"
	 * @generated
	 * @ordered
	 */
	public static final int ELT_VALUE = 83;

	/**
	 * The '<em><b>Envir</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Envir</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ENVIR
	 * @model name="envir"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='ENVIR'"
	 * @generated
	 * @ordered
	 */
	public static final int ENVIR_VALUE = 84;

	/**
	 * The '<em><b>Eos</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Eos</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EOS
	 * @model name="eos"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='EOS'"
	 * @generated
	 * @ordered
	 */
	public static final int EOS_VALUE = 85;

	/**
	 * The '<em><b>Eoth</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Eoth</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EOTH
	 * @model name="eoth"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='EOTH'"
	 * @generated
	 * @ordered
	 */
	public static final int EOTH_VALUE = 86;

	/**
	 * The '<em><b>Esoi</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Esoi</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ESOI
	 * @model name="esoi"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='ESOI'"
	 * @generated
	 * @ordered
	 */
	public static final int ESOI_VALUE = 87;

	/**
	 * The '<em><b>Esos</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Esos</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ESOS
	 * @model name="esos"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='ESOS'"
	 * @generated
	 * @ordered
	 */
	public static final int ESOS_VALUE = 88;

	/**
	 * The '<em><b>Eta</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Eta</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ETA
	 * @model name="eta"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='ETA'"
	 * @generated
	 * @ordered
	 */
	public static final int ETA_VALUE = 89;

	/**
	 * The '<em><b>Ettp</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Ettp</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ETTP
	 * @model name="ettp"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='ETTP'"
	 * @generated
	 * @ordered
	 */
	public static final int ETTP_VALUE = 90;

	/**
	 * The '<em><b>Ettub</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Ettub</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ETTUB
	 * @model name="ettub"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='ETTUB'"
	 * @generated
	 * @ordered
	 */
	public static final int ETTUB_VALUE = 91;

	/**
	 * The '<em><b>Ewhi</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Ewhi</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EWHI
	 * @model name="ewhi"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='EWHI'"
	 * @generated
	 * @ordered
	 */
	public static final int EWHI_VALUE = 92;

	/**
	 * The '<em><b>Exg</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Exg</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EXG
	 * @model name="exg"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='EXG'"
	 * @generated
	 * @ordered
	 */
	public static final int EXG_VALUE = 93;

	/**
	 * The '<em><b>Exs</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Exs</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EXS
	 * @model name="exs"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='EXS'"
	 * @generated
	 * @ordered
	 */
	public static final int EXS_VALUE = 94;

	/**
	 * The '<em><b>Exudte</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Exudte</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EXUDTE
	 * @model name="exudte"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='EXUDTE'"
	 * @generated
	 * @ordered
	 */
	public static final int EXUDTE_VALUE = 95;

	/**
	 * The '<em><b>Faw</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Faw</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FAW
	 * @model name="faw"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='FAW'"
	 * @generated
	 * @ordered
	 */
	public static final int FAW_VALUE = 96;

	/**
	 * The '<em><b>Fblood</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Fblood</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FBLOOD
	 * @model name="fblood"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='FBLOOD'"
	 * @generated
	 * @ordered
	 */
	public static final int FBLOOD_VALUE = 97;

	/**
	 * The '<em><b>Fga</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Fga</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FGA
	 * @model name="fga"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='FGA'"
	 * @generated
	 * @ordered
	 */
	public static final int FGA_VALUE = 98;

	/**
	 * The '<em><b>Fib</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Fib</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FIB
	 * @model name="fib"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='FIB'"
	 * @generated
	 * @ordered
	 */
	public static final int FIB_VALUE = 99;

	/**
	 * The '<em><b>Fist</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Fist</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FIST
	 * @model name="fist"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='FIST'"
	 * @generated
	 * @ordered
	 */
	public static final int FIST_VALUE = 100;

	/**
	 * The '<em><b>Fld</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Fld</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FLD
	 * @model name="fld"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='FLD'"
	 * @generated
	 * @ordered
	 */
	public static final int FLD_VALUE = 101;

	/**
	 * The '<em><b>Flt</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Flt</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FLT
	 * @model name="flt"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='FLT'"
	 * @generated
	 * @ordered
	 */
	public static final int FLT_VALUE = 102;

	/**
	 * The '<em><b>Flu</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Flu</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FLU
	 * @model name="flu"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='FLU'"
	 * @generated
	 * @ordered
	 */
	public static final int FLU_VALUE = 103;

	/**
	 * The '<em><b>Fluid</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Fluid</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FLUID
	 * @model name="fluid"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='FLUID'"
	 * @generated
	 * @ordered
	 */
	public static final int FLUID_VALUE = 104;

	/**
	 * The '<em><b>Foley</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Foley</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FOLEY
	 * @model name="foley"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='FOLEY'"
	 * @generated
	 * @ordered
	 */
	public static final int FOLEY_VALUE = 105;

	/**
	 * The '<em><b>Frs</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Frs</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FRS
	 * @model name="frs"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='FRS'"
	 * @generated
	 * @ordered
	 */
	public static final int FRS_VALUE = 106;

	/**
	 * The '<em><b>Fsclp</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Fsclp</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FSCLP
	 * @model name="fsclp"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='FSCLP'"
	 * @generated
	 * @ordered
	 */
	public static final int FSCLP_VALUE = 107;

	/**
	 * The '<em><b>Fur</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Fur</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FUR
	 * @model name="fur"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='FUR'"
	 * @generated
	 * @ordered
	 */
	public static final int FUR_VALUE = 108;

	/**
	 * The '<em><b>Gas</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Gas</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GAS
	 * @model name="gas"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='GAS'"
	 * @generated
	 * @ordered
	 */
	public static final int GAS_VALUE = 109;

	/**
	 * The '<em><b>Gasa</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Gasa</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GASA
	 * @model name="gasa"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='GASA'"
	 * @generated
	 * @ordered
	 */
	public static final int GASA_VALUE = 110;

	/**
	 * The '<em><b>Gasan</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Gasan</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GASAN
	 * @model name="gasan"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='GASAN'"
	 * @generated
	 * @ordered
	 */
	public static final int GASAN_VALUE = 111;

	/**
	 * The '<em><b>Gasbr</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Gasbr</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GASBR
	 * @model name="gasbr"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='GASBR'"
	 * @generated
	 * @ordered
	 */
	public static final int GASBR_VALUE = 112;

	/**
	 * The '<em><b>Gasd</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Gasd</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GASD
	 * @model name="gasd"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='GASD'"
	 * @generated
	 * @ordered
	 */
	public static final int GASD_VALUE = 113;

	/**
	 * The '<em><b>Gast</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Gast</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GAST
	 * @model name="gast"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='GAST'"
	 * @generated
	 * @ordered
	 */
	public static final int GAST_VALUE = 114;

	/**
	 * The '<em><b>Genl</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Genl</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GENL
	 * @model name="genl"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='GENL'"
	 * @generated
	 * @ordered
	 */
	public static final int GENL_VALUE = 115;

	/**
	 * The '<em><b>Genv</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Genv</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GENV
	 * @model name="genv"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='GENV'"
	 * @generated
	 * @ordered
	 */
	public static final int GENV_VALUE = 116;

	/**
	 * The '<em><b>Graft</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Graft</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GRAFT
	 * @model name="graft"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='GRAFT'"
	 * @generated
	 * @ordered
	 */
	public static final int GRAFT_VALUE = 117;

	/**
	 * The '<em><b>Grafts</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Grafts</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GRAFTS
	 * @model name="grafts"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='GRAFTS'"
	 * @generated
	 * @ordered
	 */
	public static final int GRAFTS_VALUE = 118;

	/**
	 * The '<em><b>Granu</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Granu</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GRANU
	 * @model name="granu"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='GRANU'"
	 * @generated
	 * @ordered
	 */
	public static final int GRANU_VALUE = 119;

	/**
	 * The '<em><b>Grosh</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Grosh</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GROSH
	 * @model name="grosh"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='GROSH'"
	 * @generated
	 * @ordered
	 */
	public static final int GROSH_VALUE = 120;

	/**
	 * The '<em><b>Gsol</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Gsol</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GSOL
	 * @model name="gsol"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='GSOL'"
	 * @generated
	 * @ordered
	 */
	public static final int GSOL_VALUE = 121;

	/**
	 * The '<em><b>Gspec</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Gspec</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GSPEC
	 * @model name="gspec"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='GSPEC'"
	 * @generated
	 * @ordered
	 */
	public static final int GSPEC_VALUE = 122;

	/**
	 * The '<em><b>Gt</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Gt</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GT
	 * @model name="gt"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='GT'"
	 * @generated
	 * @ordered
	 */
	public static final int GT_VALUE = 123;

	/**
	 * The '<em><b>Gtube</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Gtube</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GTUBE
	 * @model name="gtube"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='GTUBE'"
	 * @generated
	 * @ordered
	 */
	public static final int GTUBE_VALUE = 124;

	/**
	 * The '<em><b>Har</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Har</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HAR
	 * @model name="har"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='HAR'"
	 * @generated
	 * @ordered
	 */
	public static final int HAR_VALUE = 125;

	/**
	 * The '<em><b>Hbite</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Hbite</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HBITE
	 * @model name="hbite"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='HBITE'"
	 * @generated
	 * @ordered
	 */
	public static final int HBITE_VALUE = 126;

	/**
	 * The '<em><b>Hblud</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Hblud</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HBLUD
	 * @model name="hblud"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='HBLUD'"
	 * @generated
	 * @ordered
	 */
	public static final int HBLUD_VALUE = 127;

	/**
	 * The '<em><b>Hemaq</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Hemaq</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HEMAQ
	 * @model name="hemaq"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='HEMAQ'"
	 * @generated
	 * @ordered
	 */
	public static final int HEMAQ_VALUE = 128;

	/**
	 * The '<em><b>Hemo</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Hemo</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HEMO
	 * @model name="hemo"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='HEMO'"
	 * @generated
	 * @ordered
	 */
	public static final int HEMO_VALUE = 129;

	/**
	 * The '<em><b>Herni</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Herni</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HERNI
	 * @model name="herni"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='HERNI'"
	 * @generated
	 * @ordered
	 */
	public static final int HERNI_VALUE = 130;

	/**
	 * The '<em><b>Hev</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Hev</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HEV
	 * @model name="hev"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='HEV'"
	 * @generated
	 * @ordered
	 */
	public static final int HEV_VALUE = 131;

	/**
	 * The '<em><b>Hic</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Hic</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HIC
	 * @model name="hic"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='HIC'"
	 * @generated
	 * @ordered
	 */
	public static final int HIC_VALUE = 132;

	/**
	 * The '<em><b>Hydc</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Hydc</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HYDC
	 * @model name="hydc"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='HYDC'"
	 * @generated
	 * @ordered
	 */
	public static final int HYDC_VALUE = 133;

	/**
	 * The '<em><b>Ibite</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Ibite</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IBITE
	 * @model name="ibite"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='IBITE'"
	 * @generated
	 * @ordered
	 */
	public static final int IBITE_VALUE = 134;

	/**
	 * The '<em><b>Icyst</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Icyst</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ICYST
	 * @model name="icyst"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='ICYST'"
	 * @generated
	 * @ordered
	 */
	public static final int ICYST_VALUE = 135;

	/**
	 * The '<em><b>Idc</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Idc</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IDC
	 * @model name="idc"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='IDC'"
	 * @generated
	 * @ordered
	 */
	public static final int IDC_VALUE = 136;

	/**
	 * The '<em><b>Ihg</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Ihg</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IHG
	 * @model name="ihg"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='IHG'"
	 * @generated
	 * @ordered
	 */
	public static final int IHG_VALUE = 137;

	/**
	 * The '<em><b>Ileo</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Ileo</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ILEO
	 * @model name="ileo"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='ILEO'"
	 * @generated
	 * @ordered
	 */
	public static final int ILEO_VALUE = 138;

	/**
	 * The '<em><b>Illeg</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Illeg</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ILLEG
	 * @model name="illeg"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='ILLEG'"
	 * @generated
	 * @ordered
	 */
	public static final int ILLEG_VALUE = 139;

	/**
	 * The '<em><b>Imp</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Imp</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IMP
	 * @model name="imp"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='IMP'"
	 * @generated
	 * @ordered
	 */
	public static final int IMP_VALUE = 140;

	/**
	 * The '<em><b>Inci</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Inci</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INCI
	 * @model name="inci"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='INCI'"
	 * @generated
	 * @ordered
	 */
	public static final int INCI_VALUE = 141;

	/**
	 * The '<em><b>Infil</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Infil</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INFIL
	 * @model name="infil"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='INFIL'"
	 * @generated
	 * @ordered
	 */
	public static final int INFIL_VALUE = 142;

	/**
	 * The '<em><b>Ins</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Ins</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INS
	 * @model name="ins"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='INS'"
	 * @generated
	 * @ordered
	 */
	public static final int INS_VALUE = 143;

	/**
	 * The '<em><b>Intrd</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Intrd</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INTRD
	 * @model name="intrd"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='INTRD'"
	 * @generated
	 * @ordered
	 */
	public static final int INTRD_VALUE = 144;

	/**
	 * The '<em><b>Islt</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Islt</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ISLT
	 * @model name="islt"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='ISLT'"
	 * @generated
	 * @ordered
	 */
	public static final int ISLT_VALUE = 145;

	/**
	 * The '<em><b>It</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>It</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IT
	 * @model name="it"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='IT'"
	 * @generated
	 * @ordered
	 */
	public static final int IT_VALUE = 146;

	/**
	 * The '<em><b>Iud</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Iud</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IUD
	 * @model name="iud"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='IUD'"
	 * @generated
	 * @ordered
	 */
	public static final int IUD_VALUE = 147;

	/**
	 * The '<em><b>Ivcat</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Ivcat</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IVCAT
	 * @model name="ivcat"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='IVCAT'"
	 * @generated
	 * @ordered
	 */
	public static final int IVCAT_VALUE = 148;

	/**
	 * The '<em><b>Ivfld</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Ivfld</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IVFLD
	 * @model name="ivfld"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='IVFLD'"
	 * @generated
	 * @ordered
	 */
	public static final int IVFLD_VALUE = 149;

	/**
	 * The '<em><b>Ivtip</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Ivtip</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IVTIP
	 * @model name="ivtip"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='IVTIP'"
	 * @generated
	 * @ordered
	 */
	public static final int IVTIP_VALUE = 150;

	/**
	 * The '<em><b>Jeju</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Jeju</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #JEJU
	 * @model name="jeju"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='JEJU'"
	 * @generated
	 * @ordered
	 */
	public static final int JEJU_VALUE = 151;

	/**
	 * The '<em><b>Jntfld</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Jntfld</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #JNTFLD
	 * @model name="jntfld"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='JNTFLD'"
	 * @generated
	 * @ordered
	 */
	public static final int JNTFLD_VALUE = 152;

	/**
	 * The '<em><b>Jp</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Jp</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #JP
	 * @model name="jp"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='JP'"
	 * @generated
	 * @ordered
	 */
	public static final int JP_VALUE = 153;

	/**
	 * The '<em><b>Keloi</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Keloi</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #KELOI
	 * @model name="keloi"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='KELOI'"
	 * @generated
	 * @ordered
	 */
	public static final int KELOI_VALUE = 154;

	/**
	 * The '<em><b>Kidfld</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Kidfld</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #KIDFLD
	 * @model name="kidfld"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='KIDFLD'"
	 * @generated
	 * @ordered
	 */
	public static final int KIDFLD_VALUE = 155;

	/**
	 * The '<em><b>Lavg</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Lavg</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LAVG
	 * @model name="lavg"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='LAVG'"
	 * @generated
	 * @ordered
	 */
	public static final int LAVG_VALUE = 156;

	/**
	 * The '<em><b>Lavgg</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Lavgg</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LAVGG
	 * @model name="lavgg"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='LAVGG'"
	 * @generated
	 * @ordered
	 */
	public static final int LAVGG_VALUE = 157;

	/**
	 * The '<em><b>Lavgp</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Lavgp</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LAVGP
	 * @model name="lavgp"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='LAVGP'"
	 * @generated
	 * @ordered
	 */
	public static final int LAVGP_VALUE = 158;

	/**
	 * The '<em><b>Lavpg</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Lavpg</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LAVPG
	 * @model name="lavpg"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='LAVPG'"
	 * @generated
	 * @ordered
	 */
	public static final int LAVPG_VALUE = 159;

	/**
	 * The '<em><b>Lens1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Lens1</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LENS1
	 * @model name="lens1"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='LENS1'"
	 * @generated
	 * @ordered
	 */
	public static final int LENS1_VALUE = 160;

	/**
	 * The '<em><b>Lens2</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Lens2</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LENS2
	 * @model name="lens2"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='LENS2'"
	 * @generated
	 * @ordered
	 */
	public static final int LENS2_VALUE = 161;

	/**
	 * The '<em><b>Lesn</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Lesn</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LESN
	 * @model name="lesn"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='LESN'"
	 * @generated
	 * @ordered
	 */
	public static final int LESN_VALUE = 162;

	/**
	 * The '<em><b>Liq</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Liq</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LIQ
	 * @model name="liq"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='LIQ'"
	 * @generated
	 * @ordered
	 */
	public static final int LIQ_VALUE = 163;

	/**
	 * The '<em><b>Liqo</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Liqo</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LIQO
	 * @model name="liqo"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='LIQO'"
	 * @generated
	 * @ordered
	 */
	public static final int LIQO_VALUE = 164;

	/**
	 * The '<em><b>Lna</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Lna</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LNA
	 * @model name="lna"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='LNA'"
	 * @generated
	 * @ordered
	 */
	public static final int LNA_VALUE = 165;

	/**
	 * The '<em><b>Lnv</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Lnv</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LNV
	 * @model name="lnv"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='LNV'"
	 * @generated
	 * @ordered
	 */
	public static final int LNV_VALUE = 166;

	/**
	 * The '<em><b>Lsac</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Lsac</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LSAC
	 * @model name="lsac"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='LSAC'"
	 * @generated
	 * @ordered
	 */
	public static final int LSAC_VALUE = 167;

	/**
	 * The '<em><b>Lym</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Lym</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LYM
	 * @model name="lym"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='LYM'"
	 * @generated
	 * @ordered
	 */
	public static final int LYM_VALUE = 168;

	/**
	 * The '<em><b>Mac</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Mac</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MAC
	 * @model name="mac"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='MAC'"
	 * @generated
	 * @ordered
	 */
	public static final int MAC_VALUE = 169;

	/**
	 * The '<em><b>Mahur</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Mahur</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MAHUR
	 * @model name="mahur"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='MAHUR'"
	 * @generated
	 * @ordered
	 */
	public static final int MAHUR_VALUE = 170;

	/**
	 * The '<em><b>Mar</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Mar</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MAR
	 * @model name="mar"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='MAR'"
	 * @generated
	 * @ordered
	 */
	public static final int MAR_VALUE = 171;

	/**
	 * The '<em><b>Mass</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Mass</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MASS
	 * @model name="mass"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='MASS'"
	 * @generated
	 * @ordered
	 */
	public static final int MASS_VALUE = 172;

	/**
	 * The '<em><b>Mbld</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Mbld</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MBLD
	 * @model name="mbld"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='MBLD'"
	 * @generated
	 * @ordered
	 */
	public static final int MBLD_VALUE = 173;

	/**
	 * The '<em><b>Mec</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Mec</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MEC
	 * @model name="mec"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='MEC'"
	 * @generated
	 * @ordered
	 */
	public static final int MEC_VALUE = 174;

	/**
	 * The '<em><b>Milk</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Milk</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MILK
	 * @model name="milk"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='MILK'"
	 * @generated
	 * @ordered
	 */
	public static final int MILK_VALUE = 175;

	/**
	 * The '<em><b>Mlk</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Mlk</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MLK
	 * @model name="mlk"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='MLK'"
	 * @generated
	 * @ordered
	 */
	public static final int MLK_VALUE = 176;

	/**
	 * The '<em><b>Mucos</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Mucos</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MUCOS
	 * @model name="mucos"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='MUCOS'"
	 * @generated
	 * @ordered
	 */
	public static final int MUCOS_VALUE = 177;

	/**
	 * The '<em><b>Mucus</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Mucus</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MUCUS
	 * @model name="mucus"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='MUCUS'"
	 * @generated
	 * @ordered
	 */
	public static final int MUCUS_VALUE = 178;

	/**
	 * The '<em><b>Nail</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Nail</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NAIL
	 * @model name="nail"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='NAIL'"
	 * @generated
	 * @ordered
	 */
	public static final int NAIL_VALUE = 179;

	/**
	 * The '<em><b>Nasdr</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Nasdr</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NASDR
	 * @model name="nasdr"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='NASDR'"
	 * @generated
	 * @ordered
	 */
	public static final int NASDR_VALUE = 180;

	/**
	 * The '<em><b>Nedl</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Nedl</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NEDL
	 * @model name="nedl"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='NEDL'"
	 * @generated
	 * @ordered
	 */
	public static final int NEDL_VALUE = 181;

	/**
	 * The '<em><b>Neph</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Neph</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NEPH
	 * @model name="neph"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='NEPH'"
	 * @generated
	 * @ordered
	 */
	public static final int NEPH_VALUE = 182;

	/**
	 * The '<em><b>Ngasp</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Ngasp</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NGASP
	 * @model name="ngasp"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='NGASP'"
	 * @generated
	 * @ordered
	 */
	public static final int NGASP_VALUE = 183;

	/**
	 * The '<em><b>Ngast</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Ngast</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NGAST
	 * @model name="ngast"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='NGAST'"
	 * @generated
	 * @ordered
	 */
	public static final int NGAST_VALUE = 184;

	/**
	 * The '<em><b>Ngs</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Ngs</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NGS
	 * @model name="ngs"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='NGS'"
	 * @generated
	 * @ordered
	 */
	public static final int NGS_VALUE = 185;

	/**
	 * The '<em><b>Nodul</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Nodul</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NODUL
	 * @model name="nodul"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='NODUL'"
	 * @generated
	 * @ordered
	 */
	public static final int NODUL_VALUE = 186;

	/**
	 * The '<em><b>Nsecr</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Nsecr</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NSECR
	 * @model name="nsecr"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='NSECR'"
	 * @generated
	 * @ordered
	 */
	public static final int NSECR_VALUE = 187;

	/**
	 * The '<em><b>Orh</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Orh</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ORH
	 * @model name="orh"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='ORH'"
	 * @generated
	 * @ordered
	 */
	public static final int ORH_VALUE = 188;

	/**
	 * The '<em><b>Orl</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Orl</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ORL
	 * @model name="orl"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='ORL'"
	 * @generated
	 * @ordered
	 */
	public static final int ORL_VALUE = 189;

	/**
	 * The '<em><b>Oth</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Oth</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OTH
	 * @model name="oth"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='OTH'"
	 * @generated
	 * @ordered
	 */
	public static final int OTH_VALUE = 190;

	/**
	 * The '<em><b>Pacem</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Pacem</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PACEM
	 * @model name="pacem"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='PACEM'"
	 * @generated
	 * @ordered
	 */
	public static final int PACEM_VALUE = 191;

	/**
	 * The '<em><b>Pafl</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Pafl</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PAFL
	 * @model name="pafl"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='PAFL'"
	 * @generated
	 * @ordered
	 */
	public static final int PAFL_VALUE = 192;

	/**
	 * The '<em><b>Pcfl</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Pcfl</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PCFL
	 * @model name="pcfl"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='PCFL'"
	 * @generated
	 * @ordered
	 */
	public static final int PCFL_VALUE = 193;

	/**
	 * The '<em><b>Pdsit</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Pdsit</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PDSIT
	 * @model name="pdsit"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='PDSIT'"
	 * @generated
	 * @ordered
	 */
	public static final int PDSIT_VALUE = 194;

	/**
	 * The '<em><b>Pdts</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Pdts</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PDTS
	 * @model name="pdts"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='PDTS'"
	 * @generated
	 * @ordered
	 */
	public static final int PDTS_VALUE = 195;

	/**
	 * The '<em><b>Pelva</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Pelva</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PELVA
	 * @model name="pelva"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='PELVA'"
	 * @generated
	 * @ordered
	 */
	public static final int PELVA_VALUE = 196;

	/**
	 * The '<em><b>Penil</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Penil</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PENIL
	 * @model name="penil"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='PENIL'"
	 * @generated
	 * @ordered
	 */
	public static final int PENIL_VALUE = 197;

	/**
	 * The '<em><b>Peria</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Peria</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PERIA
	 * @model name="peria"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='PERIA'"
	 * @generated
	 * @ordered
	 */
	public static final int PERIA_VALUE = 198;

	/**
	 * The '<em><b>Piloc</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Piloc</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PILOC
	 * @model name="piloc"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='PILOC'"
	 * @generated
	 * @ordered
	 */
	public static final int PILOC_VALUE = 199;

	/**
	 * The '<em><b>Pins</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Pins</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PINS
	 * @model name="pins"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='PINS'"
	 * @generated
	 * @ordered
	 */
	public static final int PINS_VALUE = 200;

	/**
	 * The '<em><b>Pis</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Pis</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PIS
	 * @model name="pis"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='PIS'"
	 * @generated
	 * @ordered
	 */
	public static final int PIS_VALUE = 201;

	/**
	 * The '<em><b>Plan</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Plan</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PLAN
	 * @model name="plan"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='PLAN'"
	 * @generated
	 * @ordered
	 */
	public static final int PLAN_VALUE = 202;

	/**
	 * The '<em><b>Plas</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Plas</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PLAS
	 * @model name="plas"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='PLAS'"
	 * @generated
	 * @ordered
	 */
	public static final int PLAS_VALUE = 203;

	/**
	 * The '<em><b>Plb</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Plb</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PLB
	 * @model name="plb"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='PLB'"
	 * @generated
	 * @ordered
	 */
	public static final int PLB_VALUE = 204;

	/**
	 * The '<em><b>Plc</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Plc</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PLC
	 * @model name="plc"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='PLC'"
	 * @generated
	 * @ordered
	 */
	public static final int PLC_VALUE = 205;

	/**
	 * The '<em><b>Plevs</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Plevs</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PLEVS
	 * @model name="plevs"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='PLEVS'"
	 * @generated
	 * @ordered
	 */
	public static final int PLEVS_VALUE = 206;

	/**
	 * The '<em><b>Plr</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Plr</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PLR
	 * @model name="plr"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='PLR'"
	 * @generated
	 * @ordered
	 */
	public static final int PLR_VALUE = 207;

	/**
	 * The '<em><b>Pmn</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Pmn</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PMN
	 * @model name="pmn"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='PMN'"
	 * @generated
	 * @ordered
	 */
	public static final int PMN_VALUE = 208;

	/**
	 * The '<em><b>Pnd</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Pnd</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PND
	 * @model name="pnd"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='PND'"
	 * @generated
	 * @ordered
	 */
	public static final int PND_VALUE = 209;

	/**
	 * The '<em><b>Pol</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Pol</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #POL
	 * @model name="pol"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='POL'"
	 * @generated
	 * @ordered
	 */
	public static final int POL_VALUE = 210;

	/**
	 * The '<em><b>Popgs</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Popgs</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #POPGS
	 * @model name="popgs"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='POPGS'"
	 * @generated
	 * @ordered
	 */
	public static final int POPGS_VALUE = 211;

	/**
	 * The '<em><b>Poplg</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Poplg</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #POPLG
	 * @model name="poplg"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='POPLG'"
	 * @generated
	 * @ordered
	 */
	public static final int POPLG_VALUE = 212;

	/**
	 * The '<em><b>Poplv</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Poplv</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #POPLV
	 * @model name="poplv"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='POPLV'"
	 * @generated
	 * @ordered
	 */
	public static final int POPLV_VALUE = 213;

	/**
	 * The '<em><b>Porta</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Porta</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PORTA
	 * @model name="porta"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='PORTA'"
	 * @generated
	 * @ordered
	 */
	public static final int PORTA_VALUE = 214;

	/**
	 * The '<em><b>Ppp</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Ppp</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PPP
	 * @model name="ppp"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='PPP'"
	 * @generated
	 * @ordered
	 */
	public static final int PPP_VALUE = 215;

	/**
	 * The '<em><b>Prost</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Prost</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PROST
	 * @model name="prost"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='PROST'"
	 * @generated
	 * @ordered
	 */
	public static final int PROST_VALUE = 216;

	/**
	 * The '<em><b>Prp</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Prp</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PRP
	 * @model name="prp"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='PRP'"
	 * @generated
	 * @ordered
	 */
	public static final int PRP_VALUE = 217;

	/**
	 * The '<em><b>Psc</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Psc</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PSC
	 * @model name="psc"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='PSC'"
	 * @generated
	 * @ordered
	 */
	public static final int PSC_VALUE = 218;

	/**
	 * The '<em><b>Punct</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Punct</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PUNCT
	 * @model name="punct"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='PUNCT'"
	 * @generated
	 * @ordered
	 */
	public static final int PUNCT_VALUE = 219;

	/**
	 * The '<em><b>Pus</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Pus</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PUS
	 * @model name="pus"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='PUS'"
	 * @generated
	 * @ordered
	 */
	public static final int PUS_VALUE = 220;

	/**
	 * The '<em><b>Pusfr</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Pusfr</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PUSFR
	 * @model name="pusfr"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='PUSFR'"
	 * @generated
	 * @ordered
	 */
	public static final int PUSFR_VALUE = 221;

	/**
	 * The '<em><b>Pust</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Pust</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PUST
	 * @model name="pust"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='PUST'"
	 * @generated
	 * @ordered
	 */
	public static final int PUST_VALUE = 222;

	/**
	 * The '<em><b>Qc3</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Qc3</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #QC3
	 * @model name="qc3"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='QC3'"
	 * @generated
	 * @ordered
	 */
	public static final int QC3_VALUE = 223;

	/**
	 * The '<em><b>Randu</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Randu</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RANDU
	 * @model name="randu"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='RANDU'"
	 * @generated
	 * @ordered
	 */
	public static final int RANDU_VALUE = 224;

	/**
	 * The '<em><b>Rbc</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Rbc</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RBC
	 * @model name="rbc"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='RBC'"
	 * @generated
	 * @ordered
	 */
	public static final int RBC_VALUE = 225;

	/**
	 * The '<em><b>Rbite</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Rbite</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RBITE
	 * @model name="rbite"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='RBITE'"
	 * @generated
	 * @ordered
	 */
	public static final int RBITE_VALUE = 226;

	/**
	 * The '<em><b>Rect</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Rect</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RECT
	 * @model name="rect"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='RECT'"
	 * @generated
	 * @ordered
	 */
	public static final int RECT_VALUE = 227;

	/**
	 * The '<em><b>Recta</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Recta</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RECTA
	 * @model name="recta"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='RECTA'"
	 * @generated
	 * @ordered
	 */
	public static final int RECTA_VALUE = 228;

	/**
	 * The '<em><b>Renalc</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Renalc</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RENALC
	 * @model name="renalc"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='RENALC'"
	 * @generated
	 * @ordered
	 */
	public static final int RENALC_VALUE = 229;

	/**
	 * The '<em><b>Renc</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Renc</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RENC
	 * @model name="renc"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='RENC'"
	 * @generated
	 * @ordered
	 */
	public static final int RENC_VALUE = 230;

	/**
	 * The '<em><b>Res</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Res</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RES
	 * @model name="res"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='RES'"
	 * @generated
	 * @ordered
	 */
	public static final int RES_VALUE = 231;

	/**
	 * The '<em><b>Sal</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Sal</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SAL
	 * @model name="sal"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='SAL'"
	 * @generated
	 * @ordered
	 */
	public static final int SAL_VALUE = 232;

	/**
	 * The '<em><b>Scar</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Scar</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SCAR
	 * @model name="scar"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='SCAR'"
	 * @generated
	 * @ordered
	 */
	public static final int SCAR_VALUE = 233;

	/**
	 * The '<em><b>Sclv</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Sclv</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SCLV
	 * @model name="sclv"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='SCLV'"
	 * @generated
	 * @ordered
	 */
	public static final int SCLV_VALUE = 234;

	/**
	 * The '<em><b>Scroa</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Scroa</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SCROA
	 * @model name="scroa"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='SCROA'"
	 * @generated
	 * @ordered
	 */
	public static final int SCROA_VALUE = 235;

	/**
	 * The '<em><b>Secre</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Secre</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SECRE
	 * @model name="secre"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='SECRE'"
	 * @generated
	 * @ordered
	 */
	public static final int SECRE_VALUE = 236;

	/**
	 * The '<em><b>Ser</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Ser</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SER
	 * @model name="ser"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='SER'"
	 * @generated
	 * @ordered
	 */
	public static final int SER_VALUE = 237;

	/**
	 * The '<em><b>Shu</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Shu</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SHU
	 * @model name="shu"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='SHU'"
	 * @generated
	 * @ordered
	 */
	public static final int SHU_VALUE = 238;

	/**
	 * The '<em><b>Shunf</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Shunf</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SHUNF
	 * @model name="shunf"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='SHUNF'"
	 * @generated
	 * @ordered
	 */
	public static final int SHUNF_VALUE = 239;

	/**
	 * The '<em><b>Shunt</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Shunt</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SHUNT
	 * @model name="shunt"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='SHUNT'"
	 * @generated
	 * @ordered
	 */
	public static final int SHUNT_VALUE = 240;

	/**
	 * The '<em><b>Site</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Site</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SITE
	 * @model name="site"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='SITE'"
	 * @generated
	 * @ordered
	 */
	public static final int SITE_VALUE = 241;

	/**
	 * The '<em><b>Skbp</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Skbp</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SKBP
	 * @model name="skbp"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='SKBP'"
	 * @generated
	 * @ordered
	 */
	public static final int SKBP_VALUE = 242;

	/**
	 * The '<em><b>Skn</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Skn</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SKN
	 * @model name="skn"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='SKN'"
	 * @generated
	 * @ordered
	 */
	public static final int SKN_VALUE = 243;

	/**
	 * The '<em><b>Smm</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Smm</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SMM
	 * @model name="smm"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='SMM'"
	 * @generated
	 * @ordered
	 */
	public static final int SMM_VALUE = 244;

	/**
	 * The '<em><b>Smn</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Smn</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SMN
	 * @model name="smn"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='SMN'"
	 * @generated
	 * @ordered
	 */
	public static final int SMN_VALUE = 245;

	/**
	 * The '<em><b>Snv</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Snv</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SNV
	 * @model name="snv"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='SNV'"
	 * @generated
	 * @ordered
	 */
	public static final int SNV_VALUE = 246;

	/**
	 * The '<em><b>Sprm</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Sprm</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SPRM
	 * @model name="sprm"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='SPRM'"
	 * @generated
	 * @ordered
	 */
	public static final int SPRM_VALUE = 247;

	/**
	 * The '<em><b>Sprp</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Sprp</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SPRP
	 * @model name="sprp"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='SPRP'"
	 * @generated
	 * @ordered
	 */
	public static final int SPRP_VALUE = 248;

	/**
	 * The '<em><b>Sprpb</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Sprpb</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SPRPB
	 * @model name="sprpb"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='SPRPB'"
	 * @generated
	 * @ordered
	 */
	public static final int SPRPB_VALUE = 249;

	/**
	 * The '<em><b>Sps</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Sps</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SPS
	 * @model name="sps"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='SPS'"
	 * @generated
	 * @ordered
	 */
	public static final int SPS_VALUE = 250;

	/**
	 * The '<em><b>Spt</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Spt</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SPT
	 * @model name="spt"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='SPT'"
	 * @generated
	 * @ordered
	 */
	public static final int SPT_VALUE = 251;

	/**
	 * The '<em><b>Sptc</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Sptc</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SPTC
	 * @model name="sptc"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='SPTC'"
	 * @generated
	 * @ordered
	 */
	public static final int SPTC_VALUE = 252;

	/**
	 * The '<em><b>Sptt</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Sptt</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SPTT
	 * @model name="sptt"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='SPTT'"
	 * @generated
	 * @ordered
	 */
	public static final int SPTT_VALUE = 253;

	/**
	 * The '<em><b>Sput1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Sput1</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SPUT1
	 * @model name="sput1"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='SPUT1'"
	 * @generated
	 * @ordered
	 */
	public static final int SPUT1_VALUE = 254;

	/**
	 * The '<em><b>Sputin</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Sputin</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SPUTIN
	 * @model name="sputin"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='SPUTIN'"
	 * @generated
	 * @ordered
	 */
	public static final int SPUTIN_VALUE = 255;

	/**
	 * The '<em><b>Sputsp</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Sputsp</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SPUTSP
	 * @model name="sputsp"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='SPUTSP'"
	 * @generated
	 * @ordered
	 */
	public static final int SPUTSP_VALUE = 256;

	/**
	 * The '<em><b>Ster</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Ster</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #STER
	 * @model name="ster"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='STER'"
	 * @generated
	 * @ordered
	 */
	public static final int STER_VALUE = 257;

	/**
	 * The '<em><b>Stl</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Stl</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #STL
	 * @model name="stl"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='STL'"
	 * @generated
	 * @ordered
	 */
	public static final int STL_VALUE = 258;

	/**
	 * The '<em><b>Stone</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Stone</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #STONE
	 * @model name="stone"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='STONE'"
	 * @generated
	 * @ordered
	 */
	public static final int STONE_VALUE = 259;

	/**
	 * The '<em><b>Subma</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Subma</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SUBMA
	 * @model name="subma"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='SUBMA'"
	 * @generated
	 * @ordered
	 */
	public static final int SUBMA_VALUE = 260;

	/**
	 * The '<em><b>Submx</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Submx</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SUBMX
	 * @model name="submx"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='SUBMX'"
	 * @generated
	 * @ordered
	 */
	public static final int SUBMX_VALUE = 261;

	/**
	 * The '<em><b>Sump</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Sump</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SUMP
	 * @model name="sump"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='SUMP'"
	 * @generated
	 * @ordered
	 */
	public static final int SUMP_VALUE = 262;

	/**
	 * The '<em><b>Sup</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Sup</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SUP
	 * @model name="sup"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='SUP'"
	 * @generated
	 * @ordered
	 */
	public static final int SUP_VALUE = 263;

	/**
	 * The '<em><b>Sutur</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Sutur</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SUTUR
	 * @model name="sutur"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='SUTUR'"
	 * @generated
	 * @ordered
	 */
	public static final int SUTUR_VALUE = 264;

	/**
	 * The '<em><b>Swgz</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Swgz</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SWGZ
	 * @model name="swgz"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='SWGZ'"
	 * @generated
	 * @ordered
	 */
	public static final int SWGZ_VALUE = 265;

	/**
	 * The '<em><b>Swt</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Swt</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SWT
	 * @model name="swt"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='SWT'"
	 * @generated
	 * @ordered
	 */
	public static final int SWT_VALUE = 266;

	/**
	 * The '<em><b>Tasp</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Tasp</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TASP
	 * @model name="tasp"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='TASP'"
	 * @generated
	 * @ordered
	 */
	public static final int TASP_VALUE = 267;

	/**
	 * The '<em><b>Tear</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Tear</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TEAR
	 * @model name="tear"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='TEAR'"
	 * @generated
	 * @ordered
	 */
	public static final int TEAR_VALUE = 268;

	/**
	 * The '<em><b>Thrb</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Thrb</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #THRB
	 * @model name="thrb"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='THRB'"
	 * @generated
	 * @ordered
	 */
	public static final int THRB_VALUE = 269;

	/**
	 * The '<em><b>Tiss</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Tiss</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TISS
	 * @model name="tiss"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='TISS'"
	 * @generated
	 * @ordered
	 */
	public static final int TISS_VALUE = 270;

	/**
	 * The '<em><b>Tisu</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Tisu</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TISU
	 * @model name="tisu"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='TISU'"
	 * @generated
	 * @ordered
	 */
	public static final int TISU_VALUE = 271;

	/**
	 * The '<em><b>Tlc</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Tlc</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TLC
	 * @model name="tlc"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='TLC'"
	 * @generated
	 * @ordered
	 */
	public static final int TLC_VALUE = 272;

	/**
	 * The '<em><b>Trac</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Trac</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TRAC
	 * @model name="trac"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='TRAC'"
	 * @generated
	 * @ordered
	 */
	public static final int TRAC_VALUE = 273;

	/**
	 * The '<em><b>Trans</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Trans</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TRANS
	 * @model name="trans"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='TRANS'"
	 * @generated
	 * @ordered
	 */
	public static final int TRANS_VALUE = 274;

	/**
	 * The '<em><b>Tseru</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Tseru</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TSERU
	 * @model name="tseru"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='TSERU'"
	 * @generated
	 * @ordered
	 */
	public static final int TSERU_VALUE = 275;

	/**
	 * The '<em><b>Tstes</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Tstes</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TSTES
	 * @model name="tstes"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='TSTES'"
	 * @generated
	 * @ordered
	 */
	public static final int TSTES_VALUE = 276;

	/**
	 * The '<em><b>Ttra</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Ttra</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TTRA
	 * @model name="ttra"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='TTRA'"
	 * @generated
	 * @ordered
	 */
	public static final int TTRA_VALUE = 277;

	/**
	 * The '<em><b>Tubes</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Tubes</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TUBES
	 * @model name="tubes"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='TUBES'"
	 * @generated
	 * @ordered
	 */
	public static final int TUBES_VALUE = 278;

	/**
	 * The '<em><b>Tumor</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Tumor</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TUMOR
	 * @model name="tumor"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='TUMOR'"
	 * @generated
	 * @ordered
	 */
	public static final int TUMOR_VALUE = 279;

	/**
	 * The '<em><b>Tzanc</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Tzanc</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TZANC
	 * @model name="tzanc"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='TZANC'"
	 * @generated
	 * @ordered
	 */
	public static final int TZANC_VALUE = 280;

	/**
	 * The '<em><b>Udent</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Udent</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UDENT
	 * @model name="udent"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='UDENT'"
	 * @generated
	 * @ordered
	 */
	public static final int UDENT_VALUE = 281;

	/**
	 * The '<em><b>Umed</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Umed</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UMED
	 * @model name="umed"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='UMED'"
	 * @generated
	 * @ordered
	 */
	public static final int UMED_VALUE = 282;

	/**
	 * The '<em><b>Ur</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Ur</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UR
	 * @model name="ur"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='UR'"
	 * @generated
	 * @ordered
	 */
	public static final int UR_VALUE = 283;

	/**
	 * The '<em><b>Urc</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Urc</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #URC
	 * @model name="urc"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='URC'"
	 * @generated
	 * @ordered
	 */
	public static final int URC_VALUE = 284;

	/**
	 * The '<em><b>Urinb</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Urinb</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #URINB
	 * @model name="urinb"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='URINB'"
	 * @generated
	 * @ordered
	 */
	public static final int URINB_VALUE = 285;

	/**
	 * The '<em><b>Urinc</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Urinc</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #URINC
	 * @model name="urinc"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='URINC'"
	 * @generated
	 * @ordered
	 */
	public static final int URINC_VALUE = 286;

	/**
	 * The '<em><b>Urinm</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Urinm</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #URINM
	 * @model name="urinm"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='URINM'"
	 * @generated
	 * @ordered
	 */
	public static final int URINM_VALUE = 287;

	/**
	 * The '<em><b>Urinn</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Urinn</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #URINN
	 * @model name="urinn"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='URINN'"
	 * @generated
	 * @ordered
	 */
	public static final int URINN_VALUE = 288;

	/**
	 * The '<em><b>Urinp</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Urinp</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #URINP
	 * @model name="urinp"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='URINP'"
	 * @generated
	 * @ordered
	 */
	public static final int URINP_VALUE = 289;

	/**
	 * The '<em><b>Urns</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Urns</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #URNS
	 * @model name="urns"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='URNS'"
	 * @generated
	 * @ordered
	 */
	public static final int URNS_VALUE = 290;

	/**
	 * The '<em><b>Urt</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Urt</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #URT
	 * @model name="urt"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='URT'"
	 * @generated
	 * @ordered
	 */
	public static final int URT_VALUE = 291;

	/**
	 * The '<em><b>Uscop</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Uscop</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #USCOP
	 * @model name="uscop"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='USCOP'"
	 * @generated
	 * @ordered
	 */
	public static final int USCOP_VALUE = 292;

	/**
	 * The '<em><b>Uspec</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Uspec</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #USPEC
	 * @model name="uspec"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='USPEC'"
	 * @generated
	 * @ordered
	 */
	public static final int USPEC_VALUE = 293;

	/**
	 * The '<em><b>Usub</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Usub</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #USUB
	 * @model name="usub"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='USUB'"
	 * @generated
	 * @ordered
	 */
	public static final int USUB_VALUE = 294;

	/**
	 * The '<em><b>Vastip</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Vastip</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #VASTIP
	 * @model name="vastip"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='VASTIP'"
	 * @generated
	 * @ordered
	 */
	public static final int VASTIP_VALUE = 295;

	/**
	 * The '<em><b>Vent</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Vent</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #VENT
	 * @model name="vent"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='VENT'"
	 * @generated
	 * @ordered
	 */
	public static final int VENT_VALUE = 296;

	/**
	 * The '<em><b>Vitf</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Vitf</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #VITF
	 * @model name="vitf"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='VITF'"
	 * @generated
	 * @ordered
	 */
	public static final int VITF_VALUE = 297;

	/**
	 * The '<em><b>Vom</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Vom</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #VOM
	 * @model name="vom"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='VOM'"
	 * @generated
	 * @ordered
	 */
	public static final int VOM_VALUE = 298;

	/**
	 * The '<em><b>Wash</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Wash</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WASH
	 * @model name="wash"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='WASH'"
	 * @generated
	 * @ordered
	 */
	public static final int WASH_VALUE = 299;

	/**
	 * The '<em><b>Wasi</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Wasi</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WASI
	 * @model name="wasi"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='WASI'"
	 * @generated
	 * @ordered
	 */
	public static final int WASI_VALUE = 300;

	/**
	 * The '<em><b>Wat</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Wat</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WAT
	 * @model name="wat"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='WAT'"
	 * @generated
	 * @ordered
	 */
	public static final int WAT_VALUE = 301;

	/**
	 * The '<em><b>Wb</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Wb</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WB
	 * @model name="wb"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='WB'"
	 * @generated
	 * @ordered
	 */
	public static final int WB_VALUE = 302;

	/**
	 * The '<em><b>Wbc</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Wbc</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WBC
	 * @model name="wbc"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='WBC'"
	 * @generated
	 * @ordered
	 */
	public static final int WBC_VALUE = 303;

	/**
	 * The '<em><b>Wen</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Wen</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WEN
	 * @model name="wen"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='WEN'"
	 * @generated
	 * @ordered
	 */
	public static final int WEN_VALUE = 304;

	/**
	 * The '<em><b>Wick</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Wick</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WICK
	 * @model name="wick"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='WICK'"
	 * @generated
	 * @ordered
	 */
	public static final int WICK_VALUE = 305;

	/**
	 * The '<em><b>Wnd</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Wnd</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WND
	 * @model name="wnd"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='WND'"
	 * @generated
	 * @ordered
	 */
	public static final int WND_VALUE = 306;

	/**
	 * The '<em><b>Wnda</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Wnda</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WNDA
	 * @model name="wnda"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='WNDA'"
	 * @generated
	 * @ordered
	 */
	public static final int WNDA_VALUE = 307;

	/**
	 * The '<em><b>Wndd</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Wndd</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WNDD
	 * @model name="wndd"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='WNDD'"
	 * @generated
	 * @ordered
	 */
	public static final int WNDD_VALUE = 308;

	/**
	 * The '<em><b>Wnde</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Wnde</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WNDE
	 * @model name="wnde"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='WNDE'"
	 * @generated
	 * @ordered
	 */
	public static final int WNDE_VALUE = 309;

	/**
	 * The '<em><b>Worm</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Worm</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WORM
	 * @model name="worm"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='WORM'"
	 * @generated
	 * @ordered
	 */
	public static final int WORM_VALUE = 310;

	/**
	 * The '<em><b>Wrt</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Wrt</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WRT
	 * @model name="wrt"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='WRT'"
	 * @generated
	 * @ordered
	 */
	public static final int WRT_VALUE = 311;

	/**
	 * The '<em><b>Wwa</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Wwa</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WWA
	 * @model name="wwa"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='WWA'"
	 * @generated
	 * @ordered
	 */
	public static final int WWA_VALUE = 312;

	/**
	 * The '<em><b>Wwo</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Wwo</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WWO
	 * @model name="wwo"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='WWO'"
	 * @generated
	 * @ordered
	 */
	public static final int WWO_VALUE = 313;

	/**
	 * The '<em><b>Wwt</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Wwt</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WWT
	 * @model name="wwt"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='WWT'"
	 * @generated
	 * @ordered
	 */
	public static final int WWT_VALUE = 314;

	/**
	 * An array of all the '<em><b>V2 Specimen Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final V2SpecimenType[] VALUES_ARRAY =
		new V2SpecimenType[] {
			_,
			ABS,
			ACNE,
			ACNFLD,
			AIRS,
			ALL,
			AMN,
			AMP,
			ANGI,
			ARTC,
			ASERU,
			ASP,
			ATTE,
			AUTOA,
			AUTOC,
			AUTP,
			BBL,
			BCYST,
			BDY,
			BIFL,
			BITE,
			BLD,
			BLDA,
			BLDCO,
			BLDV,
			BLEB,
			BLIST,
			BOIL,
			BON,
			BONE,
			BOWL,
			BPH,
			BPU,
			BRN,
			BRSH,
			BRTH,
			BRUS,
			BUB,
			BULLA,
			BX,
			CALC,
			CARBU,
			CAT,
			CBITE,
			CDM,
			CLIPP,
			CNJT,
			CNL,
			COL,
			CONE,
			CSCR,
			CSERU,
			CSF,
			CSITE,
			CSMY,
			CST,
			CSVR,
			CTP,
			CUR,
			CVM,
			CVPS,
			CVPT,
			CYN,
			CYST,
			DBITE,
			DCS,
			DEC,
			DEION,
			DIA,
			DIAF,
			DISCHG,
			DIV,
			DRN,
			DRNG,
			DRNGP,
			DUFL,
			EARW,
			EBRUSH,
			EEYE,
			EFF,
			EFFUS,
			EFOD,
			EISO,
			ELT,
			ENVIR,
			EOS,
			EOTH,
			ESOI,
			ESOS,
			ETA,
			ETTP,
			ETTUB,
			EWHI,
			EXG,
			EXS,
			EXUDTE,
			FAW,
			FBLOOD,
			FGA,
			FIB,
			FIST,
			FLD,
			FLT,
			FLU,
			FLUID,
			FOLEY,
			FRS,
			FSCLP,
			FUR,
			GAS,
			GASA,
			GASAN,
			GASBR,
			GASD,
			GAST,
			GENL,
			GENV,
			GRAFT,
			GRAFTS,
			GRANU,
			GROSH,
			GSOL,
			GSPEC,
			GT,
			GTUBE,
			HAR,
			HBITE,
			HBLUD,
			HEMAQ,
			HEMO,
			HERNI,
			HEV,
			HIC,
			HYDC,
			IBITE,
			ICYST,
			IDC,
			IHG,
			ILEO,
			ILLEG,
			IMP,
			INCI,
			INFIL,
			INS,
			INTRD,
			ISLT,
			IT,
			IUD,
			IVCAT,
			IVFLD,
			IVTIP,
			JEJU,
			JNTFLD,
			JP,
			KELOI,
			KIDFLD,
			LAVG,
			LAVGG,
			LAVGP,
			LAVPG,
			LENS1,
			LENS2,
			LESN,
			LIQ,
			LIQO,
			LNA,
			LNV,
			LSAC,
			LYM,
			MAC,
			MAHUR,
			MAR,
			MASS,
			MBLD,
			MEC,
			MILK,
			MLK,
			MUCOS,
			MUCUS,
			NAIL,
			NASDR,
			NEDL,
			NEPH,
			NGASP,
			NGAST,
			NGS,
			NODUL,
			NSECR,
			ORH,
			ORL,
			OTH,
			PACEM,
			PAFL,
			PCFL,
			PDSIT,
			PDTS,
			PELVA,
			PENIL,
			PERIA,
			PILOC,
			PINS,
			PIS,
			PLAN,
			PLAS,
			PLB,
			PLC,
			PLEVS,
			PLR,
			PMN,
			PND,
			POL,
			POPGS,
			POPLG,
			POPLV,
			PORTA,
			PPP,
			PROST,
			PRP,
			PSC,
			PUNCT,
			PUS,
			PUSFR,
			PUST,
			QC3,
			RANDU,
			RBC,
			RBITE,
			RECT,
			RECTA,
			RENALC,
			RENC,
			RES,
			SAL,
			SCAR,
			SCLV,
			SCROA,
			SECRE,
			SER,
			SHU,
			SHUNF,
			SHUNT,
			SITE,
			SKBP,
			SKN,
			SMM,
			SMN,
			SNV,
			SPRM,
			SPRP,
			SPRPB,
			SPS,
			SPT,
			SPTC,
			SPTT,
			SPUT1,
			SPUTIN,
			SPUTSP,
			STER,
			STL,
			STONE,
			SUBMA,
			SUBMX,
			SUMP,
			SUP,
			SUTUR,
			SWGZ,
			SWT,
			TASP,
			TEAR,
			THRB,
			TISS,
			TISU,
			TLC,
			TRAC,
			TRANS,
			TSERU,
			TSTES,
			TTRA,
			TUBES,
			TUMOR,
			TZANC,
			UDENT,
			UMED,
			UR,
			URC,
			URINB,
			URINC,
			URINM,
			URINN,
			URINP,
			URNS,
			URT,
			USCOP,
			USPEC,
			USUB,
			VASTIP,
			VENT,
			VITF,
			VOM,
			WASH,
			WASI,
			WAT,
			WB,
			WBC,
			WEN,
			WICK,
			WND,
			WNDA,
			WNDD,
			WNDE,
			WORM,
			WRT,
			WWA,
			WWO,
			WWT,
		};

	/**
	 * A public read-only list of all the '<em><b>V2 Specimen Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<V2SpecimenType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>V2 Specimen Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static V2SpecimenType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			V2SpecimenType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>V2 Specimen Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static V2SpecimenType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			V2SpecimenType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>V2 Specimen Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static V2SpecimenType get(int value) {
		switch (value) {
			case __VALUE: return _;
			case ABS_VALUE: return ABS;
			case ACNE_VALUE: return ACNE;
			case ACNFLD_VALUE: return ACNFLD;
			case AIRS_VALUE: return AIRS;
			case ALL_VALUE: return ALL;
			case AMN_VALUE: return AMN;
			case AMP_VALUE: return AMP;
			case ANGI_VALUE: return ANGI;
			case ARTC_VALUE: return ARTC;
			case ASERU_VALUE: return ASERU;
			case ASP_VALUE: return ASP;
			case ATTE_VALUE: return ATTE;
			case AUTOA_VALUE: return AUTOA;
			case AUTOC_VALUE: return AUTOC;
			case AUTP_VALUE: return AUTP;
			case BBL_VALUE: return BBL;
			case BCYST_VALUE: return BCYST;
			case BDY_VALUE: return BDY;
			case BIFL_VALUE: return BIFL;
			case BITE_VALUE: return BITE;
			case BLD_VALUE: return BLD;
			case BLDA_VALUE: return BLDA;
			case BLDCO_VALUE: return BLDCO;
			case BLDV_VALUE: return BLDV;
			case BLEB_VALUE: return BLEB;
			case BLIST_VALUE: return BLIST;
			case BOIL_VALUE: return BOIL;
			case BON_VALUE: return BON;
			case BONE_VALUE: return BONE;
			case BOWL_VALUE: return BOWL;
			case BPH_VALUE: return BPH;
			case BPU_VALUE: return BPU;
			case BRN_VALUE: return BRN;
			case BRSH_VALUE: return BRSH;
			case BRTH_VALUE: return BRTH;
			case BRUS_VALUE: return BRUS;
			case BUB_VALUE: return BUB;
			case BULLA_VALUE: return BULLA;
			case BX_VALUE: return BX;
			case CALC_VALUE: return CALC;
			case CARBU_VALUE: return CARBU;
			case CAT_VALUE: return CAT;
			case CBITE_VALUE: return CBITE;
			case CDM_VALUE: return CDM;
			case CLIPP_VALUE: return CLIPP;
			case CNJT_VALUE: return CNJT;
			case CNL_VALUE: return CNL;
			case COL_VALUE: return COL;
			case CONE_VALUE: return CONE;
			case CSCR_VALUE: return CSCR;
			case CSERU_VALUE: return CSERU;
			case CSF_VALUE: return CSF;
			case CSITE_VALUE: return CSITE;
			case CSMY_VALUE: return CSMY;
			case CST_VALUE: return CST;
			case CSVR_VALUE: return CSVR;
			case CTP_VALUE: return CTP;
			case CUR_VALUE: return CUR;
			case CVM_VALUE: return CVM;
			case CVPS_VALUE: return CVPS;
			case CVPT_VALUE: return CVPT;
			case CYN_VALUE: return CYN;
			case CYST_VALUE: return CYST;
			case DBITE_VALUE: return DBITE;
			case DCS_VALUE: return DCS;
			case DEC_VALUE: return DEC;
			case DEION_VALUE: return DEION;
			case DIA_VALUE: return DIA;
			case DIAF_VALUE: return DIAF;
			case DISCHG_VALUE: return DISCHG;
			case DIV_VALUE: return DIV;
			case DRN_VALUE: return DRN;
			case DRNG_VALUE: return DRNG;
			case DRNGP_VALUE: return DRNGP;
			case DUFL_VALUE: return DUFL;
			case EARW_VALUE: return EARW;
			case EBRUSH_VALUE: return EBRUSH;
			case EEYE_VALUE: return EEYE;
			case EFF_VALUE: return EFF;
			case EFFUS_VALUE: return EFFUS;
			case EFOD_VALUE: return EFOD;
			case EISO_VALUE: return EISO;
			case ELT_VALUE: return ELT;
			case ENVIR_VALUE: return ENVIR;
			case EOS_VALUE: return EOS;
			case EOTH_VALUE: return EOTH;
			case ESOI_VALUE: return ESOI;
			case ESOS_VALUE: return ESOS;
			case ETA_VALUE: return ETA;
			case ETTP_VALUE: return ETTP;
			case ETTUB_VALUE: return ETTUB;
			case EWHI_VALUE: return EWHI;
			case EXG_VALUE: return EXG;
			case EXS_VALUE: return EXS;
			case EXUDTE_VALUE: return EXUDTE;
			case FAW_VALUE: return FAW;
			case FBLOOD_VALUE: return FBLOOD;
			case FGA_VALUE: return FGA;
			case FIB_VALUE: return FIB;
			case FIST_VALUE: return FIST;
			case FLD_VALUE: return FLD;
			case FLT_VALUE: return FLT;
			case FLU_VALUE: return FLU;
			case FLUID_VALUE: return FLUID;
			case FOLEY_VALUE: return FOLEY;
			case FRS_VALUE: return FRS;
			case FSCLP_VALUE: return FSCLP;
			case FUR_VALUE: return FUR;
			case GAS_VALUE: return GAS;
			case GASA_VALUE: return GASA;
			case GASAN_VALUE: return GASAN;
			case GASBR_VALUE: return GASBR;
			case GASD_VALUE: return GASD;
			case GAST_VALUE: return GAST;
			case GENL_VALUE: return GENL;
			case GENV_VALUE: return GENV;
			case GRAFT_VALUE: return GRAFT;
			case GRAFTS_VALUE: return GRAFTS;
			case GRANU_VALUE: return GRANU;
			case GROSH_VALUE: return GROSH;
			case GSOL_VALUE: return GSOL;
			case GSPEC_VALUE: return GSPEC;
			case GT_VALUE: return GT;
			case GTUBE_VALUE: return GTUBE;
			case HAR_VALUE: return HAR;
			case HBITE_VALUE: return HBITE;
			case HBLUD_VALUE: return HBLUD;
			case HEMAQ_VALUE: return HEMAQ;
			case HEMO_VALUE: return HEMO;
			case HERNI_VALUE: return HERNI;
			case HEV_VALUE: return HEV;
			case HIC_VALUE: return HIC;
			case HYDC_VALUE: return HYDC;
			case IBITE_VALUE: return IBITE;
			case ICYST_VALUE: return ICYST;
			case IDC_VALUE: return IDC;
			case IHG_VALUE: return IHG;
			case ILEO_VALUE: return ILEO;
			case ILLEG_VALUE: return ILLEG;
			case IMP_VALUE: return IMP;
			case INCI_VALUE: return INCI;
			case INFIL_VALUE: return INFIL;
			case INS_VALUE: return INS;
			case INTRD_VALUE: return INTRD;
			case ISLT_VALUE: return ISLT;
			case IT_VALUE: return IT;
			case IUD_VALUE: return IUD;
			case IVCAT_VALUE: return IVCAT;
			case IVFLD_VALUE: return IVFLD;
			case IVTIP_VALUE: return IVTIP;
			case JEJU_VALUE: return JEJU;
			case JNTFLD_VALUE: return JNTFLD;
			case JP_VALUE: return JP;
			case KELOI_VALUE: return KELOI;
			case KIDFLD_VALUE: return KIDFLD;
			case LAVG_VALUE: return LAVG;
			case LAVGG_VALUE: return LAVGG;
			case LAVGP_VALUE: return LAVGP;
			case LAVPG_VALUE: return LAVPG;
			case LENS1_VALUE: return LENS1;
			case LENS2_VALUE: return LENS2;
			case LESN_VALUE: return LESN;
			case LIQ_VALUE: return LIQ;
			case LIQO_VALUE: return LIQO;
			case LNA_VALUE: return LNA;
			case LNV_VALUE: return LNV;
			case LSAC_VALUE: return LSAC;
			case LYM_VALUE: return LYM;
			case MAC_VALUE: return MAC;
			case MAHUR_VALUE: return MAHUR;
			case MAR_VALUE: return MAR;
			case MASS_VALUE: return MASS;
			case MBLD_VALUE: return MBLD;
			case MEC_VALUE: return MEC;
			case MILK_VALUE: return MILK;
			case MLK_VALUE: return MLK;
			case MUCOS_VALUE: return MUCOS;
			case MUCUS_VALUE: return MUCUS;
			case NAIL_VALUE: return NAIL;
			case NASDR_VALUE: return NASDR;
			case NEDL_VALUE: return NEDL;
			case NEPH_VALUE: return NEPH;
			case NGASP_VALUE: return NGASP;
			case NGAST_VALUE: return NGAST;
			case NGS_VALUE: return NGS;
			case NODUL_VALUE: return NODUL;
			case NSECR_VALUE: return NSECR;
			case ORH_VALUE: return ORH;
			case ORL_VALUE: return ORL;
			case OTH_VALUE: return OTH;
			case PACEM_VALUE: return PACEM;
			case PAFL_VALUE: return PAFL;
			case PCFL_VALUE: return PCFL;
			case PDSIT_VALUE: return PDSIT;
			case PDTS_VALUE: return PDTS;
			case PELVA_VALUE: return PELVA;
			case PENIL_VALUE: return PENIL;
			case PERIA_VALUE: return PERIA;
			case PILOC_VALUE: return PILOC;
			case PINS_VALUE: return PINS;
			case PIS_VALUE: return PIS;
			case PLAN_VALUE: return PLAN;
			case PLAS_VALUE: return PLAS;
			case PLB_VALUE: return PLB;
			case PLC_VALUE: return PLC;
			case PLEVS_VALUE: return PLEVS;
			case PLR_VALUE: return PLR;
			case PMN_VALUE: return PMN;
			case PND_VALUE: return PND;
			case POL_VALUE: return POL;
			case POPGS_VALUE: return POPGS;
			case POPLG_VALUE: return POPLG;
			case POPLV_VALUE: return POPLV;
			case PORTA_VALUE: return PORTA;
			case PPP_VALUE: return PPP;
			case PROST_VALUE: return PROST;
			case PRP_VALUE: return PRP;
			case PSC_VALUE: return PSC;
			case PUNCT_VALUE: return PUNCT;
			case PUS_VALUE: return PUS;
			case PUSFR_VALUE: return PUSFR;
			case PUST_VALUE: return PUST;
			case QC3_VALUE: return QC3;
			case RANDU_VALUE: return RANDU;
			case RBC_VALUE: return RBC;
			case RBITE_VALUE: return RBITE;
			case RECT_VALUE: return RECT;
			case RECTA_VALUE: return RECTA;
			case RENALC_VALUE: return RENALC;
			case RENC_VALUE: return RENC;
			case RES_VALUE: return RES;
			case SAL_VALUE: return SAL;
			case SCAR_VALUE: return SCAR;
			case SCLV_VALUE: return SCLV;
			case SCROA_VALUE: return SCROA;
			case SECRE_VALUE: return SECRE;
			case SER_VALUE: return SER;
			case SHU_VALUE: return SHU;
			case SHUNF_VALUE: return SHUNF;
			case SHUNT_VALUE: return SHUNT;
			case SITE_VALUE: return SITE;
			case SKBP_VALUE: return SKBP;
			case SKN_VALUE: return SKN;
			case SMM_VALUE: return SMM;
			case SMN_VALUE: return SMN;
			case SNV_VALUE: return SNV;
			case SPRM_VALUE: return SPRM;
			case SPRP_VALUE: return SPRP;
			case SPRPB_VALUE: return SPRPB;
			case SPS_VALUE: return SPS;
			case SPT_VALUE: return SPT;
			case SPTC_VALUE: return SPTC;
			case SPTT_VALUE: return SPTT;
			case SPUT1_VALUE: return SPUT1;
			case SPUTIN_VALUE: return SPUTIN;
			case SPUTSP_VALUE: return SPUTSP;
			case STER_VALUE: return STER;
			case STL_VALUE: return STL;
			case STONE_VALUE: return STONE;
			case SUBMA_VALUE: return SUBMA;
			case SUBMX_VALUE: return SUBMX;
			case SUMP_VALUE: return SUMP;
			case SUP_VALUE: return SUP;
			case SUTUR_VALUE: return SUTUR;
			case SWGZ_VALUE: return SWGZ;
			case SWT_VALUE: return SWT;
			case TASP_VALUE: return TASP;
			case TEAR_VALUE: return TEAR;
			case THRB_VALUE: return THRB;
			case TISS_VALUE: return TISS;
			case TISU_VALUE: return TISU;
			case TLC_VALUE: return TLC;
			case TRAC_VALUE: return TRAC;
			case TRANS_VALUE: return TRANS;
			case TSERU_VALUE: return TSERU;
			case TSTES_VALUE: return TSTES;
			case TTRA_VALUE: return TTRA;
			case TUBES_VALUE: return TUBES;
			case TUMOR_VALUE: return TUMOR;
			case TZANC_VALUE: return TZANC;
			case UDENT_VALUE: return UDENT;
			case UMED_VALUE: return UMED;
			case UR_VALUE: return UR;
			case URC_VALUE: return URC;
			case URINB_VALUE: return URINB;
			case URINC_VALUE: return URINC;
			case URINM_VALUE: return URINM;
			case URINN_VALUE: return URINN;
			case URINP_VALUE: return URINP;
			case URNS_VALUE: return URNS;
			case URT_VALUE: return URT;
			case USCOP_VALUE: return USCOP;
			case USPEC_VALUE: return USPEC;
			case USUB_VALUE: return USUB;
			case VASTIP_VALUE: return VASTIP;
			case VENT_VALUE: return VENT;
			case VITF_VALUE: return VITF;
			case VOM_VALUE: return VOM;
			case WASH_VALUE: return WASH;
			case WASI_VALUE: return WASI;
			case WAT_VALUE: return WAT;
			case WB_VALUE: return WB;
			case WBC_VALUE: return WBC;
			case WEN_VALUE: return WEN;
			case WICK_VALUE: return WICK;
			case WND_VALUE: return WND;
			case WNDA_VALUE: return WNDA;
			case WNDD_VALUE: return WNDD;
			case WNDE_VALUE: return WNDE;
			case WORM_VALUE: return WORM;
			case WRT_VALUE: return WRT;
			case WWA_VALUE: return WWA;
			case WWO_VALUE: return WWO;
			case WWT_VALUE: return WWT;
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
	private V2SpecimenType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
	
} //V2SpecimenType
