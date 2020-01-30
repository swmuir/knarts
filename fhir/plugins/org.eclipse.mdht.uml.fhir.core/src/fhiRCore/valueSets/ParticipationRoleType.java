/**
 */
package fhiRCore.valueSets;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Participation Role Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see fhiRCore.valueSets.ValueSetsPackage#getParticipationRoleType()
 * @model
 * @generated
 */
public enum ParticipationRoleType implements Enumerator {
	/**
	 * The '<em><b>Amender</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AMENDER_VALUE
	 * @generated
	 * @ordered
	 */
	AMENDER(0, "amender", "amender"),

	/**
	 * The '<em><b>Coauth</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COAUTH_VALUE
	 * @generated
	 * @ordered
	 */
	COAUTH(1, "coauth", "coauth"),

	/**
	 * The '<em><b>Cont</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONT_VALUE
	 * @generated
	 * @ordered
	 */
	CONT(2, "cont", "cont"),

	/**
	 * The '<em><b>Evtwit</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EVTWIT_VALUE
	 * @generated
	 * @ordered
	 */
	EVTWIT(3, "evtwit", "evtwit"),

	/**
	 * The '<em><b>Primauth</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRIMAUTH_VALUE
	 * @generated
	 * @ordered
	 */
	PRIMAUTH(4, "primauth", "primauth"),

	/**
	 * The '<em><b>Reviewer</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REVIEWER_VALUE
	 * @generated
	 * @ordered
	 */
	REVIEWER(5, "reviewer", "reviewer"),

	/**
	 * The '<em><b>Source</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SOURCE_VALUE
	 * @generated
	 * @ordered
	 */
	SOURCE(6, "source", "source"),

	/**
	 * The '<em><b>Trans</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRANS_VALUE
	 * @generated
	 * @ordered
	 */
	TRANS(7, "trans", "trans"),

	/**
	 * The '<em><b>Valid</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VALID_VALUE
	 * @generated
	 * @ordered
	 */
	VALID(8, "valid", "valid"),

	/**
	 * The '<em><b>Verf</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VERF_VALUE
	 * @generated
	 * @ordered
	 */
	VERF(9, "verf", "verf"),

	/**
	 * The '<em><b>Affl</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AFFL_VALUE
	 * @generated
	 * @ordered
	 */
	AFFL(10, "affl", "affl"),

	/**
	 * The '<em><b>Agnt</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AGNT_VALUE
	 * @generated
	 * @ordered
	 */
	AGNT(11, "agnt", "agnt"),

	/**
	 * The '<em><b>Assigned</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ASSIGNED_VALUE
	 * @generated
	 * @ordered
	 */
	ASSIGNED(12, "assigned", "assigned"),

	/**
	 * The '<em><b>Claim</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLAIM_VALUE
	 * @generated
	 * @ordered
	 */
	CLAIM(13, "claim", "claim"),

	/**
	 * The '<em><b>Covpty</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COVPTY_VALUE
	 * @generated
	 * @ordered
	 */
	COVPTY(14, "covpty", "covpty"),

	/**
	 * The '<em><b>Depen</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEPEN_VALUE
	 * @generated
	 * @ordered
	 */
	DEPEN(15, "depen", "depen"),

	/**
	 * The '<em><b>Econ</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ECON_VALUE
	 * @generated
	 * @ordered
	 */
	ECON(16, "econ", "econ"),

	/**
	 * The '<em><b>Emp</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EMP_VALUE
	 * @generated
	 * @ordered
	 */
	EMP(17, "emp", "emp"),

	/**
	 * The '<em><b>Guard</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GUARD_VALUE
	 * @generated
	 * @ordered
	 */
	GUARD(18, "guard", "guard"),

	/**
	 * The '<em><b>Invsbj</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INVSBJ_VALUE
	 * @generated
	 * @ordered
	 */
	INVSBJ(19, "invsbj", "invsbj"),

	/**
	 * The '<em><b>Named</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NAMED_VALUE
	 * @generated
	 * @ordered
	 */
	NAMED(20, "named", "named"),

	/**
	 * The '<em><b>Nok</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOK_VALUE
	 * @generated
	 * @ordered
	 */
	NOK(21, "nok", "nok"),

	/**
	 * The '<em><b>Pat</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PAT_VALUE
	 * @generated
	 * @ordered
	 */
	PAT(22, "pat", "pat"),

	/**
	 * The '<em><b>Prov</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROV_VALUE
	 * @generated
	 * @ordered
	 */
	PROV(23, "prov", "prov"),

	/**
	 * The '<em><b>Not</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOT_VALUE
	 * @generated
	 * @ordered
	 */
	NOT(24, "not", "not"),

	/**
	 * The '<em><b>Classifier</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLASSIFIER_VALUE
	 * @generated
	 * @ordered
	 */
	CLASSIFIER(25, "classifier", "classifier"),

	/**
	 * The '<em><b>Consenter</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONSENTER_VALUE
	 * @generated
	 * @ordered
	 */
	CONSENTER(26, "consenter", "consenter"),

	/**
	 * The '<em><b>Conswit</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONSWIT_VALUE
	 * @generated
	 * @ordered
	 */
	CONSWIT(27, "conswit", "conswit"),

	/**
	 * The '<em><b>Copart</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COPART_VALUE
	 * @generated
	 * @ordered
	 */
	COPART(28, "copart", "copart"),

	/**
	 * The '<em><b>Declassifier</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DECLASSIFIER_VALUE
	 * @generated
	 * @ordered
	 */
	DECLASSIFIER(29, "declassifier", "declassifier"),

	/**
	 * The '<em><b>Delegatee</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DELEGATEE_VALUE
	 * @generated
	 * @ordered
	 */
	DELEGATEE(30, "delegatee", "delegatee"),

	/**
	 * The '<em><b>Delegator</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DELEGATOR_VALUE
	 * @generated
	 * @ordered
	 */
	DELEGATOR(31, "delegator", "delegator"),

	/**
	 * The '<em><b>Downgrder</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOWNGRDER_VALUE
	 * @generated
	 * @ordered
	 */
	DOWNGRDER(32, "downgrder", "downgrder"),

	/**
	 * The '<em><b>Dpowatt</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DPOWATT_VALUE
	 * @generated
	 * @ordered
	 */
	DPOWATT(33, "dpowatt", "dpowatt"),

	/**
	 * The '<em><b>Excest</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXCEST_VALUE
	 * @generated
	 * @ordered
	 */
	EXCEST(34, "excest", "excest"),

	/**
	 * The '<em><b>Grantee</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GRANTEE_VALUE
	 * @generated
	 * @ordered
	 */
	GRANTEE(35, "grantee", "grantee"),

	/**
	 * The '<em><b>Grantor</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GRANTOR_VALUE
	 * @generated
	 * @ordered
	 */
	GRANTOR(36, "grantor", "grantor"),

	/**
	 * The '<em><b>Gt</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GT_VALUE
	 * @generated
	 * @ordered
	 */
	GT(37, "gt", "gt"),

	/**
	 * The '<em><b>Guadltm</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GUADLTM_VALUE
	 * @generated
	 * @ordered
	 */
	GUADLTM(38, "guadltm", "guadltm"),

	/**
	 * The '<em><b>Hpowatt</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HPOWATT_VALUE
	 * @generated
	 * @ordered
	 */
	HPOWATT(39, "hpowatt", "hpowatt"),

	/**
	 * The '<em><b>Intprter</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTPRTER_VALUE
	 * @generated
	 * @ordered
	 */
	INTPRTER(40, "intprter", "intprter"),

	/**
	 * The '<em><b>Powatt</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POWATT_VALUE
	 * @generated
	 * @ordered
	 */
	POWATT(41, "powatt", "powatt"),

	/**
	 * The '<em><b>Resprsn</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RESPRSN_VALUE
	 * @generated
	 * @ordered
	 */
	RESPRSN(42, "resprsn", "resprsn"),

	/**
	 * The '<em><b>Spowatt</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SPOWATT_VALUE
	 * @generated
	 * @ordered
	 */
	SPOWATT(43, "spowatt", "spowatt"),

	/**
	 * The '<em><b>Aucg</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AUCG_VALUE
	 * @generated
	 * @ordered
	 */
	AUCG(44, "aucg", "aucg"),

	/**
	 * The '<em><b>Aulr</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AULR_VALUE
	 * @generated
	 * @ordered
	 */
	AULR(45, "aulr", "aulr"),

	/**
	 * The '<em><b>Autm</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AUTM_VALUE
	 * @generated
	 * @ordered
	 */
	AUTM(46, "autm", "autm"),

	/**
	 * The '<em><b>Auwa</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AUWA_VALUE
	 * @generated
	 * @ordered
	 */
	AUWA(47, "auwa", "auwa"),

	/**
	 * The '<em><b>Promsk</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROMSK_VALUE
	 * @generated
	 * @ordered
	 */
	PROMSK(48, "promsk", "promsk"),

	/**
	 * The '<em><b>Aut</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AUT_VALUE
	 * @generated
	 * @ordered
	 */
	AUT(49, "aut", "aut"),

	/**
	 * The '<em><b>Cst</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CST_VALUE
	 * @generated
	 * @ordered
	 */
	CST(50, "cst", "cst"),

	/**
	 * The '<em><b>Inf</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INF_VALUE
	 * @generated
	 * @ordered
	 */
	INF(51, "inf", "inf"),

	/**
	 * The '<em><b>Ircp</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IRCP_VALUE
	 * @generated
	 * @ordered
	 */
	IRCP(52, "ircp", "ircp"),

	/**
	 * The '<em><b>La</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LA_VALUE
	 * @generated
	 * @ordered
	 */
	LA(53, "la", "la"),

	/**
	 * The '<em><b>Ircpa</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IRCPA_VALUE
	 * @generated
	 * @ordered
	 */
	IRCPA(54, "ircpa", "ircpa"),

	/**
	 * The '<em><b>Trc</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRC_VALUE
	 * @generated
	 * @ordered
	 */
	TRC(55, "trc", "trc"),

	/**
	 * The '<em><b>Wit</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WIT_VALUE
	 * @generated
	 * @ordered
	 */
	WIT(56, "wit", "wit"),

	/**
	 * The '<em><b>110150</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_110150_VALUE
	 * @generated
	 * @ordered
	 */
	_110150(57, "_110150", "_110150"),

	/**
	 * The '<em><b>110151</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_110151_VALUE
	 * @generated
	 * @ordered
	 */
	_110151(58, "_110151", "_110151"),

	/**
	 * The '<em><b>110152</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_110152_VALUE
	 * @generated
	 * @ordered
	 */
	_110152(59, "_110152", "_110152"),

	/**
	 * The '<em><b>110153</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_110153_VALUE
	 * @generated
	 * @ordered
	 */
	_110153(60, "_110153", "_110153"),

	/**
	 * The '<em><b>110154</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_110154_VALUE
	 * @generated
	 * @ordered
	 */
	_110154(61, "_110154", "_110154"),

	/**
	 * The '<em><b>110155</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_110155_VALUE
	 * @generated
	 * @ordered
	 */
	_110155(62, "_110155", "_110155");

	/**
	 * The '<em><b>Amender</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Amender</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #AMENDER
	 * @model name="amender"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='AMENDER'"
	 * @generated
	 * @ordered
	 */
	public static final int AMENDER_VALUE = 0;

	/**
	 * The '<em><b>Coauth</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Coauth</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COAUTH
	 * @model name="coauth"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='COAUTH'"
	 * @generated
	 * @ordered
	 */
	public static final int COAUTH_VALUE = 1;

	/**
	 * The '<em><b>Cont</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Cont</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONT
	 * @model name="cont"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='CONT'"
	 * @generated
	 * @ordered
	 */
	public static final int CONT_VALUE = 2;

	/**
	 * The '<em><b>Evtwit</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Evtwit</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EVTWIT
	 * @model name="evtwit"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='EVTWIT'"
	 * @generated
	 * @ordered
	 */
	public static final int EVTWIT_VALUE = 3;

	/**
	 * The '<em><b>Primauth</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Primauth</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PRIMAUTH
	 * @model name="primauth"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='PRIMAUTH'"
	 * @generated
	 * @ordered
	 */
	public static final int PRIMAUTH_VALUE = 4;

	/**
	 * The '<em><b>Reviewer</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Reviewer</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REVIEWER
	 * @model name="reviewer"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='REVIEWER'"
	 * @generated
	 * @ordered
	 */
	public static final int REVIEWER_VALUE = 5;

	/**
	 * The '<em><b>Source</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Source</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SOURCE
	 * @model name="source"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='SOURCE'"
	 * @generated
	 * @ordered
	 */
	public static final int SOURCE_VALUE = 6;

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
	public static final int TRANS_VALUE = 7;

	/**
	 * The '<em><b>Valid</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Valid</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #VALID
	 * @model name="valid"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='VALID'"
	 * @generated
	 * @ordered
	 */
	public static final int VALID_VALUE = 8;

	/**
	 * The '<em><b>Verf</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Verf</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #VERF
	 * @model name="verf"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='VERF'"
	 * @generated
	 * @ordered
	 */
	public static final int VERF_VALUE = 9;

	/**
	 * The '<em><b>Affl</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Affl</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #AFFL
	 * @model name="affl"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='AFFL'"
	 * @generated
	 * @ordered
	 */
	public static final int AFFL_VALUE = 10;

	/**
	 * The '<em><b>Agnt</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Agnt</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #AGNT
	 * @model name="agnt"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='AGNT'"
	 * @generated
	 * @ordered
	 */
	public static final int AGNT_VALUE = 11;

	/**
	 * The '<em><b>Assigned</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Assigned</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ASSIGNED
	 * @model name="assigned"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='ASSIGNED'"
	 * @generated
	 * @ordered
	 */
	public static final int ASSIGNED_VALUE = 12;

	/**
	 * The '<em><b>Claim</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Claim</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CLAIM
	 * @model name="claim"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='CLAIM'"
	 * @generated
	 * @ordered
	 */
	public static final int CLAIM_VALUE = 13;

	/**
	 * The '<em><b>Covpty</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Covpty</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COVPTY
	 * @model name="covpty"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='COVPTY'"
	 * @generated
	 * @ordered
	 */
	public static final int COVPTY_VALUE = 14;

	/**
	 * The '<em><b>Depen</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Depen</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DEPEN
	 * @model name="depen"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='DEPEN'"
	 * @generated
	 * @ordered
	 */
	public static final int DEPEN_VALUE = 15;

	/**
	 * The '<em><b>Econ</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Econ</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ECON
	 * @model name="econ"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='ECON'"
	 * @generated
	 * @ordered
	 */
	public static final int ECON_VALUE = 16;

	/**
	 * The '<em><b>Emp</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Emp</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EMP
	 * @model name="emp"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='EMP'"
	 * @generated
	 * @ordered
	 */
	public static final int EMP_VALUE = 17;

	/**
	 * The '<em><b>Guard</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Guard</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GUARD
	 * @model name="guard"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='GUARD'"
	 * @generated
	 * @ordered
	 */
	public static final int GUARD_VALUE = 18;

	/**
	 * The '<em><b>Invsbj</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Invsbj</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INVSBJ
	 * @model name="invsbj"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='INVSBJ'"
	 * @generated
	 * @ordered
	 */
	public static final int INVSBJ_VALUE = 19;

	/**
	 * The '<em><b>Named</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Named</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NAMED
	 * @model name="named"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='NAMED'"
	 * @generated
	 * @ordered
	 */
	public static final int NAMED_VALUE = 20;

	/**
	 * The '<em><b>Nok</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Nok</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NOK
	 * @model name="nok"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='NOK'"
	 * @generated
	 * @ordered
	 */
	public static final int NOK_VALUE = 21;

	/**
	 * The '<em><b>Pat</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Pat</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PAT
	 * @model name="pat"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='PAT'"
	 * @generated
	 * @ordered
	 */
	public static final int PAT_VALUE = 22;

	/**
	 * The '<em><b>Prov</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Prov</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PROV
	 * @model name="prov"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='PROV'"
	 * @generated
	 * @ordered
	 */
	public static final int PROV_VALUE = 23;

	/**
	 * The '<em><b>Not</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Not</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NOT
	 * @model name="not"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='NOT'"
	 * @generated
	 * @ordered
	 */
	public static final int NOT_VALUE = 24;

	/**
	 * The '<em><b>Classifier</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Classifier</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CLASSIFIER
	 * @model name="classifier"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='CLASSIFIER'"
	 * @generated
	 * @ordered
	 */
	public static final int CLASSIFIER_VALUE = 25;

	/**
	 * The '<em><b>Consenter</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Consenter</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONSENTER
	 * @model name="consenter"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='CONSENTER'"
	 * @generated
	 * @ordered
	 */
	public static final int CONSENTER_VALUE = 26;

	/**
	 * The '<em><b>Conswit</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Conswit</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONSWIT
	 * @model name="conswit"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='CONSWIT'"
	 * @generated
	 * @ordered
	 */
	public static final int CONSWIT_VALUE = 27;

	/**
	 * The '<em><b>Copart</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Copart</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COPART
	 * @model name="copart"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='COPART'"
	 * @generated
	 * @ordered
	 */
	public static final int COPART_VALUE = 28;

	/**
	 * The '<em><b>Declassifier</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Declassifier</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DECLASSIFIER
	 * @model name="declassifier"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='DECLASSIFIER'"
	 * @generated
	 * @ordered
	 */
	public static final int DECLASSIFIER_VALUE = 29;

	/**
	 * The '<em><b>Delegatee</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Delegatee</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DELEGATEE
	 * @model name="delegatee"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='DELEGATEE'"
	 * @generated
	 * @ordered
	 */
	public static final int DELEGATEE_VALUE = 30;

	/**
	 * The '<em><b>Delegator</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Delegator</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DELEGATOR
	 * @model name="delegator"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='DELEGATOR'"
	 * @generated
	 * @ordered
	 */
	public static final int DELEGATOR_VALUE = 31;

	/**
	 * The '<em><b>Downgrder</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Downgrder</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DOWNGRDER
	 * @model name="downgrder"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='DOWNGRDER'"
	 * @generated
	 * @ordered
	 */
	public static final int DOWNGRDER_VALUE = 32;

	/**
	 * The '<em><b>Dpowatt</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Dpowatt</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DPOWATT
	 * @model name="dpowatt"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='DPOWATT'"
	 * @generated
	 * @ordered
	 */
	public static final int DPOWATT_VALUE = 33;

	/**
	 * The '<em><b>Excest</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Excest</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EXCEST
	 * @model name="excest"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='EXCEST'"
	 * @generated
	 * @ordered
	 */
	public static final int EXCEST_VALUE = 34;

	/**
	 * The '<em><b>Grantee</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Grantee</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GRANTEE
	 * @model name="grantee"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='GRANTEE'"
	 * @generated
	 * @ordered
	 */
	public static final int GRANTEE_VALUE = 35;

	/**
	 * The '<em><b>Grantor</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Grantor</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GRANTOR
	 * @model name="grantor"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='GRANTOR'"
	 * @generated
	 * @ordered
	 */
	public static final int GRANTOR_VALUE = 36;

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
	public static final int GT_VALUE = 37;

	/**
	 * The '<em><b>Guadltm</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Guadltm</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GUADLTM
	 * @model name="guadltm"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='GUADLTM'"
	 * @generated
	 * @ordered
	 */
	public static final int GUADLTM_VALUE = 38;

	/**
	 * The '<em><b>Hpowatt</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Hpowatt</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HPOWATT
	 * @model name="hpowatt"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='HPOWATT'"
	 * @generated
	 * @ordered
	 */
	public static final int HPOWATT_VALUE = 39;

	/**
	 * The '<em><b>Intprter</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Intprter</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INTPRTER
	 * @model name="intprter"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='INTPRTER'"
	 * @generated
	 * @ordered
	 */
	public static final int INTPRTER_VALUE = 40;

	/**
	 * The '<em><b>Powatt</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Powatt</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #POWATT
	 * @model name="powatt"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='POWATT'"
	 * @generated
	 * @ordered
	 */
	public static final int POWATT_VALUE = 41;

	/**
	 * The '<em><b>Resprsn</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Resprsn</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RESPRSN
	 * @model name="resprsn"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='RESPRSN'"
	 * @generated
	 * @ordered
	 */
	public static final int RESPRSN_VALUE = 42;

	/**
	 * The '<em><b>Spowatt</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Spowatt</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SPOWATT
	 * @model name="spowatt"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='SPOWATT'"
	 * @generated
	 * @ordered
	 */
	public static final int SPOWATT_VALUE = 43;

	/**
	 * The '<em><b>Aucg</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Aucg</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #AUCG
	 * @model name="aucg"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='AUCG'"
	 * @generated
	 * @ordered
	 */
	public static final int AUCG_VALUE = 44;

	/**
	 * The '<em><b>Aulr</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Aulr</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #AULR
	 * @model name="aulr"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='AULR'"
	 * @generated
	 * @ordered
	 */
	public static final int AULR_VALUE = 45;

	/**
	 * The '<em><b>Autm</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Autm</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #AUTM
	 * @model name="autm"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='AUTM'"
	 * @generated
	 * @ordered
	 */
	public static final int AUTM_VALUE = 46;

	/**
	 * The '<em><b>Auwa</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Auwa</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #AUWA
	 * @model name="auwa"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='AUWA'"
	 * @generated
	 * @ordered
	 */
	public static final int AUWA_VALUE = 47;

	/**
	 * The '<em><b>Promsk</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Promsk</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PROMSK
	 * @model name="promsk"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='PROMSK'"
	 * @generated
	 * @ordered
	 */
	public static final int PROMSK_VALUE = 48;

	/**
	 * The '<em><b>Aut</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Aut</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #AUT
	 * @model name="aut"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='AUT'"
	 * @generated
	 * @ordered
	 */
	public static final int AUT_VALUE = 49;

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
	public static final int CST_VALUE = 50;

	/**
	 * The '<em><b>Inf</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Inf</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INF
	 * @model name="inf"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='INF'"
	 * @generated
	 * @ordered
	 */
	public static final int INF_VALUE = 51;

	/**
	 * The '<em><b>Ircp</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Ircp</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IRCP
	 * @model name="ircp"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='IRCP'"
	 * @generated
	 * @ordered
	 */
	public static final int IRCP_VALUE = 52;

	/**
	 * The '<em><b>La</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>La</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LA
	 * @model name="la"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='LA'"
	 * @generated
	 * @ordered
	 */
	public static final int LA_VALUE = 53;

	/**
	 * The '<em><b>Ircpa</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Ircpa</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IRCPA
	 * @model name="ircpa"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='IRCPA'"
	 * @generated
	 * @ordered
	 */
	public static final int IRCPA_VALUE = 54;

	/**
	 * The '<em><b>Trc</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Trc</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TRC
	 * @model name="trc"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='TRC'"
	 * @generated
	 * @ordered
	 */
	public static final int TRC_VALUE = 55;

	/**
	 * The '<em><b>Wit</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Wit</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WIT
	 * @model name="wit"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='WIT'"
	 * @generated
	 * @ordered
	 */
	public static final int WIT_VALUE = 56;

	/**
	 * The '<em><b>110150</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>110150</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #_110150
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='110150'"
	 * @generated
	 * @ordered
	 */
	public static final int _110150_VALUE = 57;

	/**
	 * The '<em><b>110151</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>110151</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #_110151
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='110151'"
	 * @generated
	 * @ordered
	 */
	public static final int _110151_VALUE = 58;

	/**
	 * The '<em><b>110152</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>110152</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #_110152
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='110152'"
	 * @generated
	 * @ordered
	 */
	public static final int _110152_VALUE = 59;

	/**
	 * The '<em><b>110153</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>110153</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #_110153
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='110153'"
	 * @generated
	 * @ordered
	 */
	public static final int _110153_VALUE = 60;

	/**
	 * The '<em><b>110154</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>110154</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #_110154
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='110154'"
	 * @generated
	 * @ordered
	 */
	public static final int _110154_VALUE = 61;

	/**
	 * The '<em><b>110155</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>110155</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #_110155
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='110155'"
	 * @generated
	 * @ordered
	 */
	public static final int _110155_VALUE = 62;

	/**
	 * An array of all the '<em><b>Participation Role Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ParticipationRoleType[] VALUES_ARRAY =
		new ParticipationRoleType[] {
			AMENDER,
			COAUTH,
			CONT,
			EVTWIT,
			PRIMAUTH,
			REVIEWER,
			SOURCE,
			TRANS,
			VALID,
			VERF,
			AFFL,
			AGNT,
			ASSIGNED,
			CLAIM,
			COVPTY,
			DEPEN,
			ECON,
			EMP,
			GUARD,
			INVSBJ,
			NAMED,
			NOK,
			PAT,
			PROV,
			NOT,
			CLASSIFIER,
			CONSENTER,
			CONSWIT,
			COPART,
			DECLASSIFIER,
			DELEGATEE,
			DELEGATOR,
			DOWNGRDER,
			DPOWATT,
			EXCEST,
			GRANTEE,
			GRANTOR,
			GT,
			GUADLTM,
			HPOWATT,
			INTPRTER,
			POWATT,
			RESPRSN,
			SPOWATT,
			AUCG,
			AULR,
			AUTM,
			AUWA,
			PROMSK,
			AUT,
			CST,
			INF,
			IRCP,
			LA,
			IRCPA,
			TRC,
			WIT,
			_110150,
			_110151,
			_110152,
			_110153,
			_110154,
			_110155,
		};

	/**
	 * A public read-only list of all the '<em><b>Participation Role Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ParticipationRoleType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Participation Role Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ParticipationRoleType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ParticipationRoleType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Participation Role Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ParticipationRoleType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ParticipationRoleType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Participation Role Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ParticipationRoleType get(int value) {
		switch (value) {
			case AMENDER_VALUE: return AMENDER;
			case COAUTH_VALUE: return COAUTH;
			case CONT_VALUE: return CONT;
			case EVTWIT_VALUE: return EVTWIT;
			case PRIMAUTH_VALUE: return PRIMAUTH;
			case REVIEWER_VALUE: return REVIEWER;
			case SOURCE_VALUE: return SOURCE;
			case TRANS_VALUE: return TRANS;
			case VALID_VALUE: return VALID;
			case VERF_VALUE: return VERF;
			case AFFL_VALUE: return AFFL;
			case AGNT_VALUE: return AGNT;
			case ASSIGNED_VALUE: return ASSIGNED;
			case CLAIM_VALUE: return CLAIM;
			case COVPTY_VALUE: return COVPTY;
			case DEPEN_VALUE: return DEPEN;
			case ECON_VALUE: return ECON;
			case EMP_VALUE: return EMP;
			case GUARD_VALUE: return GUARD;
			case INVSBJ_VALUE: return INVSBJ;
			case NAMED_VALUE: return NAMED;
			case NOK_VALUE: return NOK;
			case PAT_VALUE: return PAT;
			case PROV_VALUE: return PROV;
			case NOT_VALUE: return NOT;
			case CLASSIFIER_VALUE: return CLASSIFIER;
			case CONSENTER_VALUE: return CONSENTER;
			case CONSWIT_VALUE: return CONSWIT;
			case COPART_VALUE: return COPART;
			case DECLASSIFIER_VALUE: return DECLASSIFIER;
			case DELEGATEE_VALUE: return DELEGATEE;
			case DELEGATOR_VALUE: return DELEGATOR;
			case DOWNGRDER_VALUE: return DOWNGRDER;
			case DPOWATT_VALUE: return DPOWATT;
			case EXCEST_VALUE: return EXCEST;
			case GRANTEE_VALUE: return GRANTEE;
			case GRANTOR_VALUE: return GRANTOR;
			case GT_VALUE: return GT;
			case GUADLTM_VALUE: return GUADLTM;
			case HPOWATT_VALUE: return HPOWATT;
			case INTPRTER_VALUE: return INTPRTER;
			case POWATT_VALUE: return POWATT;
			case RESPRSN_VALUE: return RESPRSN;
			case SPOWATT_VALUE: return SPOWATT;
			case AUCG_VALUE: return AUCG;
			case AULR_VALUE: return AULR;
			case AUTM_VALUE: return AUTM;
			case AUWA_VALUE: return AUWA;
			case PROMSK_VALUE: return PROMSK;
			case AUT_VALUE: return AUT;
			case CST_VALUE: return CST;
			case INF_VALUE: return INF;
			case IRCP_VALUE: return IRCP;
			case LA_VALUE: return LA;
			case IRCPA_VALUE: return IRCPA;
			case TRC_VALUE: return TRC;
			case WIT_VALUE: return WIT;
			case _110150_VALUE: return _110150;
			case _110151_VALUE: return _110151;
			case _110152_VALUE: return _110152;
			case _110153_VALUE: return _110153;
			case _110154_VALUE: return _110154;
			case _110155_VALUE: return _110155;
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
	private ParticipationRoleType(int value, String name, String literal) {
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
	
} //ParticipationRoleType
