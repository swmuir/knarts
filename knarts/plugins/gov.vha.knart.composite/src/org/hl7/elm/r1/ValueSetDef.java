/**
 */
package org.hl7.elm.r1;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Value Set Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The ValueSetDef type defines a value set identifier that can be referenced by name anywhere within an expression.
 * 
 * The id specifies the globally unique identifier for the value set. This may be an HL7 OID, a FHIR URL, or a CTS2 value set URL.
 * 
 * If version is specified, it will be used to resolve the version of the value set definition to be used. Otherwise, the most current published version of the value set is assumed. 
 * 
 * If codeSystems are specified, they will be used to resolve the code systems used within the value set definition to construct the expansion set.
 * Note that the recommended approach to statically binding to an expansion set is to use a value set definition that specifies the version of each code system used. The codeSystemVersions attribute is provided only to ensure static binding can be achieved when the value set definition does not specify code system versions as part of the definition header.			
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.elm.r1.ValueSetDef#getCodeSystem <em>Code System</em>}</li>
 *   <li>{@link org.hl7.elm.r1.ValueSetDef#getAccessLevel <em>Access Level</em>}</li>
 *   <li>{@link org.hl7.elm.r1.ValueSetDef#getId <em>Id</em>}</li>
 *   <li>{@link org.hl7.elm.r1.ValueSetDef#getName <em>Name</em>}</li>
 *   <li>{@link org.hl7.elm.r1.ValueSetDef#getVersion <em>Version</em>}</li>
 * </ul>
 *
 * @see org.hl7.elm.r1.R1Package#getValueSetDef()
 * @model extendedMetaData="name='ValueSetDef' kind='elementOnly'"
 * @generated
 */
public interface ValueSetDef extends Element {
	/**
	 * Returns the value of the '<em><b>Code System</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.elm.r1.CodeSystemRef}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The code system that should be used to construct the expansion set. Note that the recommended approach to statically binding to an expansion set is to use a value set definition that specifies the version of each code system used. The codeSystem elements are provided only to ensure static binding can be achieved when the value set definition does not specify code system versions as part of the definition header.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Code System</em>' containment reference list.
	 * @see org.hl7.elm.r1.R1Package#getValueSetDef_CodeSystem()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='codeSystem' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeSystemRef> getCodeSystem();

	/**
	 * Returns the value of the '<em><b>Access Level</b></em>' attribute.
	 * The default value is <code>"Public"</code>.
	 * The literals are from the enumeration {@link org.hl7.elm.r1.AccessModifier}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Access Level</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Access Level</em>' attribute.
	 * @see org.hl7.elm.r1.AccessModifier
	 * @see #isSetAccessLevel()
	 * @see #unsetAccessLevel()
	 * @see #setAccessLevel(AccessModifier)
	 * @see org.hl7.elm.r1.R1Package#getValueSetDef_AccessLevel()
	 * @model default="Public" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='accessLevel'"
	 * @generated
	 */
	AccessModifier getAccessLevel();

	/**
	 * Sets the value of the '{@link org.hl7.elm.r1.ValueSetDef#getAccessLevel <em>Access Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Access Level</em>' attribute.
	 * @see org.hl7.elm.r1.AccessModifier
	 * @see #isSetAccessLevel()
	 * @see #unsetAccessLevel()
	 * @see #getAccessLevel()
	 * @generated
	 */
	void setAccessLevel(AccessModifier value);

	/**
	 * Unsets the value of the '{@link org.hl7.elm.r1.ValueSetDef#getAccessLevel <em>Access Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAccessLevel()
	 * @see #getAccessLevel()
	 * @see #setAccessLevel(AccessModifier)
	 * @generated
	 */
	void unsetAccessLevel();

	/**
	 * Returns whether the value of the '{@link org.hl7.elm.r1.ValueSetDef#getAccessLevel <em>Access Level</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Access Level</em>' attribute is set.
	 * @see #unsetAccessLevel()
	 * @see #getAccessLevel()
	 * @see #setAccessLevel(AccessModifier)
	 * @generated
	 */
	boolean isSetAccessLevel();

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The unique identifier of the value set to be retrieved.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see org.hl7.elm.r1.R1Package#getValueSetDef_Id()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.hl7.elm.r1.ValueSetDef#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.hl7.elm.r1.R1Package#getValueSetDef_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.hl7.elm.r1.ValueSetDef#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The version of the value set to be retrieved. If no version is provided, the most current published version of the value set is assumed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see org.hl7.elm.r1.R1Package#getValueSetDef_Version()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='version'"
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link org.hl7.elm.r1.ValueSetDef#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

} // ValueSetDef
