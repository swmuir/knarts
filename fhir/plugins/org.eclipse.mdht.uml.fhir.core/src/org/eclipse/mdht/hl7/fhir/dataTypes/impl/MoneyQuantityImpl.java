/**
 */
package org.eclipse.mdht.hl7.fhir.dataTypes.impl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.mdht.hl7.fhir.dataTypes.DataTypesPackage;
import org.eclipse.mdht.hl7.fhir.dataTypes.MoneyQuantity;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Money Quantity</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class MoneyQuantityImpl extends QuantityImpl implements MoneyQuantity {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MoneyQuantityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataTypesPackage.Literals.MONEY_QUANTITY;
	}

} //MoneyQuantityImpl
