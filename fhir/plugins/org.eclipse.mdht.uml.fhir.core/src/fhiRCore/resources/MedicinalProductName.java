/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.BackboneElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Medicinal Product Name</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.MedicinalProductName#getProductName <em>Product Name</em>}</li>
 *   <li>{@link fhiRCore.resources.MedicinalProductName#getNameParts <em>Name Part</em>}</li>
 *   <li>{@link fhiRCore.resources.MedicinalProductName#getCountryLanguages <em>Country Language</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getMedicinalProductName()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='MedicinalProduct_Name'"
 * @generated
 */
public interface MedicinalProductName extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Product Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Name</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Name</em>' containment reference.
	 * @see #setProductName(fhiRCore.dataTypes.String)
	 * @see fhiRCore.resources.ResourcesPackage#getMedicinalProductName_ProductName()
	 * @model containment="true" required="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getProductName();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.MedicinalProductName#getProductName <em>Product Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Name</em>' containment reference.
	 * @see #getProductName()
	 * @generated
	 */
	void setProductName(fhiRCore.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Name Part</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.resources.MedicinalProductNameNamePart}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name Part</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name Part</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getMedicinalProductName_NamePart()
	 * @model containment="true"
	 * @generated
	 */
	EList<MedicinalProductNameNamePart> getNameParts();

	/**
	 * Returns the value of the '<em><b>Country Language</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.resources.MedicinalProductNameCountryLanguage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Country Language</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Country Language</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getMedicinalProductName_CountryLanguage()
	 * @model containment="true"
	 * @generated
	 */
	EList<MedicinalProductNameCountryLanguage> getCountryLanguages();

} // MedicinalProductName
