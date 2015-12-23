/*******************************************************************************
 * Copyright (c) 2015 David Carlson and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David Carlson (Clinical Cloud Solutions, LLC) - initial API and implementation
 *******************************************************************************/
/**
 */
package org.eclipse.mdht.uml.fhir.core.resource;

import org.eclipse.mdht.uml.fhir.core.datatype.BackboneElement;
import org.eclipse.mdht.uml.fhir.core.datatype.Decimal;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Location Position</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.LocationPosition#getLongitude <em>Longitude</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.LocationPosition#getLatitude <em>Latitude</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.LocationPosition#getAltitude <em>Altitude</em>}</li>
 * </ul>
 *
 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getLocationPosition()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Location_Position'"
 * @generated
 */
public interface LocationPosition extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Longitude</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Longitude</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Longitude</em>' reference.
	 * @see #setLongitude(Decimal)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getLocationPosition_Longitude()
	 * @model required="true"
	 * @generated
	 */
	Decimal getLongitude();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.LocationPosition#getLongitude <em>Longitude</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Longitude</em>' reference.
	 * @see #getLongitude()
	 * @generated
	 */
	void setLongitude(Decimal value);

	/**
	 * Returns the value of the '<em><b>Latitude</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Latitude</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Latitude</em>' reference.
	 * @see #setLatitude(Decimal)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getLocationPosition_Latitude()
	 * @model required="true"
	 * @generated
	 */
	Decimal getLatitude();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.LocationPosition#getLatitude <em>Latitude</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Latitude</em>' reference.
	 * @see #getLatitude()
	 * @generated
	 */
	void setLatitude(Decimal value);

	/**
	 * Returns the value of the '<em><b>Altitude</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Altitude</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Altitude</em>' reference.
	 * @see #setAltitude(Decimal)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getLocationPosition_Altitude()
	 * @model
	 * @generated
	 */
	Decimal getAltitude();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.LocationPosition#getAltitude <em>Altitude</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Altitude</em>' reference.
	 * @see #getAltitude()
	 * @generated
	 */
	void setAltitude(Decimal value);

} // LocationPosition
