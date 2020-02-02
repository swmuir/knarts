/**
 */
package org.hl7.elm.r1;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Code System Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The CodeSystemDef type defines a code system identifier that can then be used to identify code systems involved in value set definitions.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.elm.r1.CodeSystemDef#getAccessLevel <em>Access Level</em>}</li>
 *   <li>{@link org.hl7.elm.r1.CodeSystemDef#getId <em>Id</em>}</li>
 *   <li>{@link org.hl7.elm.r1.CodeSystemDef#getName <em>Name</em>}</li>
 *   <li>{@link org.hl7.elm.r1.CodeSystemDef#getVersion <em>Version</em>}</li>
 * </ul>
 *
 * @see org.hl7.elm.r1.R1Package#getCodeSystemDef()
 * @model extendedMetaData="name='CodeSystemDef' kind='elementOnly'"
 * @generated
 */
public interface CodeSystemDef extends Element {
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
	 * @see org.hl7.elm.r1.R1Package#getCodeSystemDef_AccessLevel()
	 * @model default="Public" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='accessLevel'"
	 * @generated
	 */
	AccessModifier getAccessLevel();

	/**
	 * Sets the value of the '{@link org.hl7.elm.r1.CodeSystemDef#getAccessLevel <em>Access Level</em>}' attribute.
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
	 * Unsets the value of the '{@link org.hl7.elm.r1.CodeSystemDef#getAccessLevel <em>Access Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAccessLevel()
	 * @see #getAccessLevel()
	 * @see #setAccessLevel(AccessModifier)
	 * @generated
	 */
	void unsetAccessLevel();

	/**
	 * Returns whether the value of the '{@link org.hl7.elm.r1.CodeSystemDef#getAccessLevel <em>Access Level</em>}' attribute is set.
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
	 * The unique identifier of the code system.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see org.hl7.elm.r1.R1Package#getCodeSystemDef_Id()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.hl7.elm.r1.CodeSystemDef#getId <em>Id</em>}' attribute.
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
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The name of the code system used for reference.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.hl7.elm.r1.R1Package#getCodeSystemDef_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.hl7.elm.r1.CodeSystemDef#getName <em>Name</em>}' attribute.
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
	 * The version of the code system to be used. If no version is specified, the most current published version of the code system is assumed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see org.hl7.elm.r1.R1Package#getCodeSystemDef_Version()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='version'"
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link org.hl7.elm.r1.CodeSystemDef#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

} // CodeSystemDef
