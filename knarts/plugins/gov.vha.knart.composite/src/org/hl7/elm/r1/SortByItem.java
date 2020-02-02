/**
 */
package org.hl7.elm.r1;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sort By Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.elm.r1.SortByItem#getDirection <em>Direction</em>}</li>
 * </ul>
 *
 * @see org.hl7.elm.r1.R1Package#getSortByItem()
 * @model abstract="true"
 *        extendedMetaData="name='SortByItem' kind='elementOnly'"
 * @generated
 */
public interface SortByItem extends Element {
	/**
	 * Returns the value of the '<em><b>Direction</b></em>' attribute.
	 * The literals are from the enumeration {@link org.hl7.elm.r1.SortDirection}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Direction</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Direction</em>' attribute.
	 * @see org.hl7.elm.r1.SortDirection
	 * @see #isSetDirection()
	 * @see #unsetDirection()
	 * @see #setDirection(SortDirection)
	 * @see org.hl7.elm.r1.R1Package#getSortByItem_Direction()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='direction'"
	 * @generated
	 */
	SortDirection getDirection();

	/**
	 * Sets the value of the '{@link org.hl7.elm.r1.SortByItem#getDirection <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direction</em>' attribute.
	 * @see org.hl7.elm.r1.SortDirection
	 * @see #isSetDirection()
	 * @see #unsetDirection()
	 * @see #getDirection()
	 * @generated
	 */
	void setDirection(SortDirection value);

	/**
	 * Unsets the value of the '{@link org.hl7.elm.r1.SortByItem#getDirection <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDirection()
	 * @see #getDirection()
	 * @see #setDirection(SortDirection)
	 * @generated
	 */
	void unsetDirection();

	/**
	 * Returns whether the value of the '{@link org.hl7.elm.r1.SortByItem#getDirection <em>Direction</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Direction</em>' attribute is set.
	 * @see #unsetDirection()
	 * @see #getDirection()
	 * @see #setDirection(SortDirection)
	 * @generated
	 */
	boolean isSetDirection();

} // SortByItem
