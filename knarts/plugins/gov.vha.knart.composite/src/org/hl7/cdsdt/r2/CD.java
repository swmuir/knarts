/**
 */
package org.hl7.cdsdt.r2;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CD</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A CD is a reference to a concept defined in an external code system, terminology, or ontology.
 * 
 * A CD may also contain an original text or phrase that served as the basis of the coding.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.cdsdt.r2.CD#getDisplayName <em>Display Name</em>}</li>
 *   <li>{@link org.hl7.cdsdt.r2.CD#getOriginalText <em>Original Text</em>}</li>
 *   <li>{@link org.hl7.cdsdt.r2.CD#getTranslation <em>Translation</em>}</li>
 *   <li>{@link org.hl7.cdsdt.r2.CD#getCode <em>Code</em>}</li>
 *   <li>{@link org.hl7.cdsdt.r2.CD#getCodeSystem <em>Code System</em>}</li>
 *   <li>{@link org.hl7.cdsdt.r2.CD#getCodeSystemName <em>Code System Name</em>}</li>
 *   <li>{@link org.hl7.cdsdt.r2.CD#getCodeSystemVersion <em>Code System Version</em>}</li>
 *   <li>{@link org.hl7.cdsdt.r2.CD#getValueSet <em>Value Set</em>}</li>
 *   <li>{@link org.hl7.cdsdt.r2.CD#getValueSetVersion <em>Value Set Version</em>}</li>
 * </ul>
 *
 * @see org.hl7.cdsdt.r2.R2Package#getCD()
 * @model extendedMetaData="name='CD' kind='elementOnly'"
 * @generated
 */
public interface CD extends ANY {
	/**
	 * Returns the value of the '<em><b>Display Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A name, title, or representation for the code or expression as it exists in the code system.
	 * If populated, the displayName SHALL be a valid human readable representation of the concept as defined by the code system at the time of data entry. The displayName SHALL conform to any rules defined by the codingSystem; if the codeSystem does not define a human representation for the code or expression, then none can be provided. displayName is included both as a courtesy to an unaided human interpreter of a code value and as a documentation of the name used to display the concept to the user. The display name has no functional meaning; it SHALL never exist without a code; and it SHALL never modify the meaning of the code. A display name may not be present if the code is an expression for which no display name has been assigned or can be derived. Information Processing Entities claiming direct or indirect conformance MAY choose not to implement displayName but SHALL NOT reject instances because displayName is present.
	 * Display names SHALL not alter the meaning of the code value. Therefore, display names SHOULD NOT be presented to the user on a receiving application system without ascertaining that the display name adequately represents the concept referred to by the code value. Communication SHALL NOT simply rely on the display name. The display name's main purpose is to support implementation debugging.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Display Name</em>' containment reference.
	 * @see #setDisplayName(ST)
	 * @see org.hl7.cdsdt.r2.R2Package#getCD_DisplayName()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='displayName' namespace='##targetNamespace'"
	 * @generated
	 */
	ST getDisplayName();

	/**
	 * Sets the value of the '{@link org.hl7.cdsdt.r2.CD#getDisplayName <em>Display Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Display Name</em>' containment reference.
	 * @see #getDisplayName()
	 * @generated
	 */
	void setDisplayName(ST value);

	/**
	 * Returns the value of the '<em><b>Original Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The text as seen and/or selected by the user who entered the data which represents the intended meaning of the user.  
	 * 
	 * Note: Local implementations may influence what is required to represent that original text.
	 * 
	 * Original text can be used in a structured user interface to capture what the user saw as a representation of the code on the data input screen, or in a situation where the user dictates or directly enters text, it is the text entered or uttered by the user. 
	 * 
	 * It is valid to use the CD datatype to store only the text that the user entered or uttered. In this situation, original text will exist without a code. In a situation where the code is assigned sometime after the text was entered, originalText is the text or phrase used as the basis for assigning the code. 
	 * 
	 * The original text SHALL be an excerpt of the relevant information in the original sources, rather than a pointer or exact reproduction. Thus the original text SHALL be represented in plain text form. In specific circumstances, when clearly descirbed the context of use, the originalText may be a reference to some other text artefact for which the resolution scope is clearly described.
	 * 
	 * Values of type CD MAY have a original text despite not having a code. Any CD value with no code signifies a coding exception. In this case, originalText is a name or description of the concept that was not coded. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Original Text</em>' containment reference.
	 * @see #setOriginalText(ST)
	 * @see org.hl7.cdsdt.r2.R2Package#getCD_OriginalText()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='originalText' namespace='##targetNamespace'"
	 * @generated
	 */
	ST getOriginalText();

	/**
	 * Sets the value of the '{@link org.hl7.cdsdt.r2.CD#getOriginalText <em>Original Text</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Original Text</em>' containment reference.
	 * @see #getOriginalText()
	 * @generated
	 */
	void setOriginalText(ST value);

	/**
	 * Returns the value of the '<em><b>Translation</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.cdsdt.r2.CD}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Translation of the base code / codeSystem to other codeSystems.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Translation</em>' containment reference list.
	 * @see org.hl7.cdsdt.r2.R2Package#getCD_Translation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='translation' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CD> getTranslation();

	/**
	 * Returns the value of the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The plain code symbol defined by the code system, or an expression in a syntax defined by the code system which describes the concept. 
	 * Code SHALL be an exact match to a plain code symbol or expression defined by the code system. If the code system defines a code or expression that includes whitespace, the code SHALL include the whitespace. An expression can only be used where the codeSystem either defines an expression syntax, or there is a generally accepted syntax for the codeSystem. A code system may be defined that only defines an expression syntax with bindings to other code Systems for the elements of the expression. 
	 * It is at the discretion of the interpreting system whether to check for an expression instead of a simple code and evaluate the expression instead of treating the expression as a code. In some cases, it may be unclear or ambiguous whether the code represents a single symbol or an expression. This usually arises where the code system defines an expression language and then defines pre-coordinated concepts with symbols which match their expression, e.g. UCUM. In other cases, it is safe to treat the expression as a symbol. There is no guarantee that this is always safe: the definitions of the codeSystem should always be consulted to determine how to handle potential expressions.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Code</em>' attribute.
	 * @see #setCode(String)
	 * @see org.hl7.cdsdt.r2.R2Package#getCD_Code()
	 * @model dataType="org.hl7.cdsdt.r2.Code"
	 *        extendedMetaData="kind='attribute' name='code'"
	 * @generated
	 */
	String getCode();

	/**
	 * Sets the value of the '{@link org.hl7.cdsdt.r2.CD#getCode <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' attribute.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(String value);

	/**
	 * Returns the value of the '<em><b>Code System</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The code system that defines the code, or if no code was found, the codeSystem in which no code was found. 
	 * Code systems SHALL be referred to by a UID, which allows unambiguous reference to standard code systems and other local codesystems. Where either ISO or HL7 have assigned UID to code Systems, then these UIDs SHALL be used. Otherwise implementations SHALL use an appropriate ISO Object Identifier (OID) or UUID to construct a globally unique local coding system identifier.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Code System</em>' attribute.
	 * @see #setCodeSystem(String)
	 * @see org.hl7.cdsdt.r2.R2Package#getCD_CodeSystem()
	 * @model dataType="org.hl7.cdsdt.r2.Uid"
	 *        extendedMetaData="kind='attribute' name='codeSystem'"
	 * @generated
	 */
	String getCodeSystem();

	/**
	 * Sets the value of the '{@link org.hl7.cdsdt.r2.CD#getCodeSystem <em>Code System</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code System</em>' attribute.
	 * @see #getCodeSystem()
	 * @generated
	 */
	void setCodeSystem(String value);

	/**
	 * Returns the value of the '<em><b>Code System Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The common name of the coding system. 
	 * 
	 * The code system name has no computational value. codeSystemName can never modify the meaning of codeSystem and cannot exist without codeSystem.
	 * 
	 * Information Processing Entities claiming direct or indirect conformance SHALL NOT functionally rely on codeSystemName. In addition, they MAY choose not to implement codeSystemName; but SHALL NOT reject instances because codeSystemName is present.
	 * 
	 * Note:  The purpose of a code system name is to assist an unaided human interpreter of a code value to interpret codeSystem.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Code System Name</em>' attribute.
	 * @see #setCodeSystemName(String)
	 * @see org.hl7.cdsdt.r2.R2Package#getCD_CodeSystemName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='codeSystemName'"
	 * @generated
	 */
	String getCodeSystemName();

	/**
	 * Sets the value of the '{@link org.hl7.cdsdt.r2.CD#getCodeSystemName <em>Code System Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code System Name</em>' attribute.
	 * @see #getCodeSystemName()
	 * @generated
	 */
	void setCodeSystemName(String value);

	/**
	 * Returns the value of the '<em><b>Code System Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If applicable, a version descriptor defined specifically for the given code system.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Code System Version</em>' attribute.
	 * @see #setCodeSystemVersion(String)
	 * @see org.hl7.cdsdt.r2.R2Package#getCD_CodeSystemVersion()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='codeSystemVersion'"
	 * @generated
	 */
	String getCodeSystemVersion();

	/**
	 * Sets the value of the '{@link org.hl7.cdsdt.r2.CD#getCodeSystemVersion <em>Code System Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code System Version</em>' attribute.
	 * @see #getCodeSystemVersion()
	 * @generated
	 */
	void setCodeSystemVersion(String value);

	/**
	 * Returns the value of the '<em><b>Value Set</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The value set that applied when this CD was created.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Value Set</em>' attribute.
	 * @see #setValueSet(String)
	 * @see org.hl7.cdsdt.r2.R2Package#getCD_ValueSet()
	 * @model dataType="org.hl7.cdsdt.r2.Uid"
	 *        extendedMetaData="kind='attribute' name='valueSet'"
	 * @generated
	 */
	String getValueSet();

	/**
	 * Sets the value of the '{@link org.hl7.cdsdt.r2.CD#getValueSet <em>Value Set</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Set</em>' attribute.
	 * @see #getValueSet()
	 * @generated
	 */
	void setValueSet(String value);

	/**
	 * Returns the value of the '<em><b>Value Set Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The version of the valueSet in which the code was found.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Value Set Version</em>' attribute.
	 * @see #setValueSetVersion(String)
	 * @see org.hl7.cdsdt.r2.R2Package#getCD_ValueSetVersion()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='valueSetVersion'"
	 * @generated
	 */
	String getValueSetVersion();

	/**
	 * Sets the value of the '{@link org.hl7.cdsdt.r2.CD#getValueSetVersion <em>Value Set Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Set Version</em>' attribute.
	 * @see #getValueSetVersion()
	 * @generated
	 */
	void setValueSetVersion(String value);

} // CD
