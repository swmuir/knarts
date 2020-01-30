/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.BackboneElement;
import fhiRCore.dataTypes.Identifier;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Substance Nucleic Acid Subunit Sugar</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.SubstanceNucleicAcidSubunitSugar#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link fhiRCore.resources.SubstanceNucleicAcidSubunitSugar#getName <em>Name</em>}</li>
 *   <li>{@link fhiRCore.resources.SubstanceNucleicAcidSubunitSugar#getResidueSite <em>Residue Site</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getSubstanceNucleicAcidSubunitSugar()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Subunit_Sugar'"
 * @generated
 */
public interface SubstanceNucleicAcidSubunitSugar extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Identifier</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference.
	 * @see #setIdentifier(Identifier)
	 * @see fhiRCore.resources.ResourcesPackage#getSubstanceNucleicAcidSubunitSugar_Identifier()
	 * @model containment="true"
	 * @generated
	 */
	Identifier getIdentifier();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.SubstanceNucleicAcidSubunitSugar#getIdentifier <em>Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identifier</em>' containment reference.
	 * @see #getIdentifier()
	 * @generated
	 */
	void setIdentifier(Identifier value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(fhiRCore.dataTypes.String)
	 * @see fhiRCore.resources.ResourcesPackage#getSubstanceNucleicAcidSubunitSugar_Name()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getName();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.SubstanceNucleicAcidSubunitSugar#getName <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' containment reference.
	 * @see #getName()
	 * @generated
	 */
	void setName(fhiRCore.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Residue Site</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Residue Site</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Residue Site</em>' containment reference.
	 * @see #setResidueSite(fhiRCore.dataTypes.String)
	 * @see fhiRCore.resources.ResourcesPackage#getSubstanceNucleicAcidSubunitSugar_ResidueSite()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getResidueSite();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.SubstanceNucleicAcidSubunitSugar#getResidueSite <em>Residue Site</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Residue Site</em>' containment reference.
	 * @see #getResidueSite()
	 * @generated
	 */
	void setResidueSite(fhiRCore.dataTypes.String value);

} // SubstanceNucleicAcidSubunitSugar
