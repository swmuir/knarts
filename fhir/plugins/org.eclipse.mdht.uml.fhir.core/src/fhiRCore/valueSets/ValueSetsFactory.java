/**
 */
package fhiRCore.valueSets;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see fhiRCore.valueSets.ValueSetsPackage
 * @generated
 */
public interface ValueSetsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ValueSetsFactory eINSTANCE = fhiRCore.valueSets.impl.ValueSetsFactoryImpl.init();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ValueSetsPackage getValueSetsPackage();

} //ValueSetsFactory
