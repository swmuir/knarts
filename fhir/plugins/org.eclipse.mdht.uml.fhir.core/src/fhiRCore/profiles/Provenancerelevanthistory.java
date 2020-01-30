/**
 */
package fhiRCore.profiles;

import fhiRCore.resources.Provenance;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Provenancerelevanthistory</b></em>'.
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
 *   <li>{@link fhiRCore.profiles.Provenancerelevanthistory#getAuthor <em>Author</em>}</li>
 * </ul>
 *
 * @see fhiRCore.profiles.ProfilesPackage#getProvenancerelevanthistory()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='provenance-relevant-history'"
 * @generated
 */
public interface Provenancerelevanthistory extends Provenance {
	/**
	 * Returns the value of the '<em><b>Author</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Author</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Author</em>' containment reference.
	 * @see #setAuthor(ProvenancerelevanthistoryAgent1)
	 * @see fhiRCore.profiles.ProfilesPackage#getProvenancerelevanthistory_Author()
	 * @model containment="true"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Author'"
	 * @generated
	 */
	ProvenancerelevanthistoryAgent1 getAuthor();

	/**
	 * Sets the value of the '{@link fhiRCore.profiles.Provenancerelevanthistory#getAuthor <em>Author</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Author</em>' containment reference.
	 * @see #getAuthor()
	 * @generated
	 */
	void setAuthor(ProvenancerelevanthistoryAgent1 value);

} // Provenancerelevanthistory
