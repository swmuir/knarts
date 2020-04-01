/**
 */
package org.eclipse.mdht.hl7.fhir.profiles;

import org.eclipse.mdht.hl7.fhir.dataTypes.Reference;

import org.eclipse.mdht.hl7.fhir.resources.DiagnosticReport;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lipidprofile</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.profiles.Lipidprofile#getCholesterol <em>Cholesterol</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.profiles.Lipidprofile#getTriglyceride <em>Triglyceride</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.profiles.Lipidprofile#getHdlCholesterol <em>Hdl Cholesterol</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.profiles.Lipidprofile#getLdlCholesterol <em>Ldl Cholesterol</em>}</li>
 * </ul>
 *
 * @see org.eclipse.mdht.hl7.fhir.profiles.ProfilesPackage#getLipidprofile()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='lipidprofile'"
 * @generated
 */
public interface Lipidprofile extends DiagnosticReport {
	/**
	 * Returns the value of the '<em><b>Cholesterol</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cholesterol</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cholesterol</em>' containment reference.
	 * @see #setCholesterol(Reference)
	 * @see org.eclipse.mdht.hl7.fhir.profiles.ProfilesPackage#getLipidprofile_Cholesterol()
	 * @model containment="true" required="true"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Cholesterol'"
	 * @generated
	 */
	Reference getCholesterol();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.profiles.Lipidprofile#getCholesterol <em>Cholesterol</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cholesterol</em>' containment reference.
	 * @see #getCholesterol()
	 * @generated
	 */
	void setCholesterol(Reference value);

	/**
	 * Returns the value of the '<em><b>Triglyceride</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Triglyceride</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Triglyceride</em>' containment reference.
	 * @see #setTriglyceride(Reference)
	 * @see org.eclipse.mdht.hl7.fhir.profiles.ProfilesPackage#getLipidprofile_Triglyceride()
	 * @model containment="true" required="true"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Triglyceride'"
	 * @generated
	 */
	Reference getTriglyceride();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.profiles.Lipidprofile#getTriglyceride <em>Triglyceride</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Triglyceride</em>' containment reference.
	 * @see #getTriglyceride()
	 * @generated
	 */
	void setTriglyceride(Reference value);

	/**
	 * Returns the value of the '<em><b>Hdl Cholesterol</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hdl Cholesterol</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hdl Cholesterol</em>' containment reference.
	 * @see #setHdlCholesterol(Reference)
	 * @see org.eclipse.mdht.hl7.fhir.profiles.ProfilesPackage#getLipidprofile_HdlCholesterol()
	 * @model containment="true" required="true"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='HDLCholesterol'"
	 * @generated
	 */
	Reference getHdlCholesterol();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.profiles.Lipidprofile#getHdlCholesterol <em>Hdl Cholesterol</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hdl Cholesterol</em>' containment reference.
	 * @see #getHdlCholesterol()
	 * @generated
	 */
	void setHdlCholesterol(Reference value);

	/**
	 * Returns the value of the '<em><b>Ldl Cholesterol</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ldl Cholesterol</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ldl Cholesterol</em>' containment reference.
	 * @see #setLdlCholesterol(Reference)
	 * @see org.eclipse.mdht.hl7.fhir.profiles.ProfilesPackage#getLipidprofile_LdlCholesterol()
	 * @model containment="true"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='LDLCholesterol'"
	 * @generated
	 */
	Reference getLdlCholesterol();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.profiles.Lipidprofile#getLdlCholesterol <em>Ldl Cholesterol</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ldl Cholesterol</em>' containment reference.
	 * @see #getLdlCholesterol()
	 * @generated
	 */
	void setLdlCholesterol(Reference value);

} // Lipidprofile
