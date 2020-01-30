/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.BackboneElement;
import fhiRCore.dataTypes.Period;
import fhiRCore.dataTypes.PositiveInt;
import fhiRCore.dataTypes.Reference;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task Restriction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.TaskRestriction#getRepetitions <em>Repetitions</em>}</li>
 *   <li>{@link fhiRCore.resources.TaskRestriction#getPeriod <em>Period</em>}</li>
 *   <li>{@link fhiRCore.resources.TaskRestriction#getRecipients <em>Recipient</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getTaskRestriction()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Task_Restriction'"
 * @generated
 */
public interface TaskRestriction extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Repetitions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Repetitions</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Repetitions</em>' containment reference.
	 * @see #setRepetitions(PositiveInt)
	 * @see fhiRCore.resources.ResourcesPackage#getTaskRestriction_Repetitions()
	 * @model containment="true"
	 * @generated
	 */
	PositiveInt getRepetitions();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.TaskRestriction#getRepetitions <em>Repetitions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Repetitions</em>' containment reference.
	 * @see #getRepetitions()
	 * @generated
	 */
	void setRepetitions(PositiveInt value);

	/**
	 * Returns the value of the '<em><b>Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Period</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Period</em>' containment reference.
	 * @see #setPeriod(Period)
	 * @see fhiRCore.resources.ResourcesPackage#getTaskRestriction_Period()
	 * @model containment="true"
	 * @generated
	 */
	Period getPeriod();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.TaskRestriction#getPeriod <em>Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Period</em>' containment reference.
	 * @see #getPeriod()
	 * @generated
	 */
	void setPeriod(Period value);

	/**
	 * Returns the value of the '<em><b>Recipient</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.Reference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Recipient</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Recipient</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getTaskRestriction_Recipient()
	 * @model containment="true"
	 * @generated
	 */
	EList<Reference> getRecipients();

} // TaskRestriction
