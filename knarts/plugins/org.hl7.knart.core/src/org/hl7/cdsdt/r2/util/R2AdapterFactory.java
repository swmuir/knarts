/**
 */
package org.hl7.cdsdt.r2.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.hl7.cdsdt.r2.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.hl7.cdsdt.r2.R2Package
 * @generated
 */
public class R2AdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static R2Package modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public R2AdapterFactory() {
		if (modelPackage == null) {
			modelPackage = R2Package.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected R2Switch<Adapter> modelSwitch =
		new R2Switch<Adapter>() {
			@Override
			public Adapter caseAD(AD object) {
				return createADAdapter();
			}
			@Override
			public Adapter caseADXP(ADXP object) {
				return createADXPAdapter();
			}
			@Override
			public Adapter caseANY(ANY object) {
				return createANYAdapter();
			}
			@Override
			public Adapter caseBL(BL object) {
				return createBLAdapter();
			}
			@Override
			public Adapter caseCD(CD object) {
				return createCDAdapter();
			}
			@Override
			public Adapter caseCO(CO object) {
				return createCOAdapter();
			}
			@Override
			public Adapter caseCS(CS object) {
				return createCSAdapter();
			}
			@Override
			public Adapter caseED(ED object) {
				return createEDAdapter();
			}
			@Override
			public Adapter caseEN(EN object) {
				return createENAdapter();
			}
			@Override
			public Adapter caseENXP(ENXP object) {
				return createENXPAdapter();
			}
			@Override
			public Adapter caseHXIT(HXIT object) {
				return createHXITAdapter();
			}
			@Override
			public Adapter caseII(II object) {
				return createIIAdapter();
			}
			@Override
			public Adapter caseINT(INT object) {
				return createINTAdapter();
			}
			@Override
			public Adapter caseIVL(IVL object) {
				return createIVLAdapter();
			}
			@Override
			public Adapter caseIVLCO(IVLCO object) {
				return createIVLCOAdapter();
			}
			@Override
			public Adapter caseIVLINT(IVLINT object) {
				return createIVLINTAdapter();
			}
			@Override
			public Adapter caseIVLPQ(IVLPQ object) {
				return createIVLPQAdapter();
			}
			@Override
			public Adapter caseIVLQTY(IVLQTY object) {
				return createIVLQTYAdapter();
			}
			@Override
			public Adapter caseIVLREAL(IVLREAL object) {
				return createIVLREALAdapter();
			}
			@Override
			public Adapter caseIVLTS(IVLTS object) {
				return createIVLTSAdapter();
			}
			@Override
			public Adapter casePIVLTS(PIVLTS object) {
				return createPIVLTSAdapter();
			}
			@Override
			public Adapter casePQ(PQ object) {
				return createPQAdapter();
			}
			@Override
			public Adapter caseQSET(QSET object) {
				return createQSETAdapter();
			}
			@Override
			public Adapter caseQTY(QTY object) {
				return createQTYAdapter();
			}
			@Override
			public Adapter caseREAL(REAL object) {
				return createREALAdapter();
			}
			@Override
			public Adapter caseRTO(RTO object) {
				return createRTOAdapter();
			}
			@Override
			public Adapter caseST(ST object) {
				return createSTAdapter();
			}
			@Override
			public Adapter caseTEL(TEL object) {
				return createTELAdapter();
			}
			@Override
			public Adapter caseTS(TS object) {
				return createTSAdapter();
			}
			@Override
			public Adapter caseXP(XP object) {
				return createXPAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.cdsdt.r2.AD <em>AD</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.cdsdt.r2.AD
	 * @generated
	 */
	public Adapter createADAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.cdsdt.r2.ADXP <em>ADXP</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.cdsdt.r2.ADXP
	 * @generated
	 */
	public Adapter createADXPAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.cdsdt.r2.ANY <em>ANY</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.cdsdt.r2.ANY
	 * @generated
	 */
	public Adapter createANYAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.cdsdt.r2.BL <em>BL</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.cdsdt.r2.BL
	 * @generated
	 */
	public Adapter createBLAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.cdsdt.r2.CD <em>CD</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.cdsdt.r2.CD
	 * @generated
	 */
	public Adapter createCDAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.cdsdt.r2.CO <em>CO</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.cdsdt.r2.CO
	 * @generated
	 */
	public Adapter createCOAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.cdsdt.r2.CS <em>CS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.cdsdt.r2.CS
	 * @generated
	 */
	public Adapter createCSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.cdsdt.r2.ED <em>ED</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.cdsdt.r2.ED
	 * @generated
	 */
	public Adapter createEDAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.cdsdt.r2.EN <em>EN</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.cdsdt.r2.EN
	 * @generated
	 */
	public Adapter createENAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.cdsdt.r2.ENXP <em>ENXP</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.cdsdt.r2.ENXP
	 * @generated
	 */
	public Adapter createENXPAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.cdsdt.r2.HXIT <em>HXIT</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.cdsdt.r2.HXIT
	 * @generated
	 */
	public Adapter createHXITAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.cdsdt.r2.II <em>II</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.cdsdt.r2.II
	 * @generated
	 */
	public Adapter createIIAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.cdsdt.r2.INT <em>INT</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.cdsdt.r2.INT
	 * @generated
	 */
	public Adapter createINTAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.cdsdt.r2.IVL <em>IVL</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.cdsdt.r2.IVL
	 * @generated
	 */
	public Adapter createIVLAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.cdsdt.r2.IVLCO <em>IVLCO</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.cdsdt.r2.IVLCO
	 * @generated
	 */
	public Adapter createIVLCOAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.cdsdt.r2.IVLINT <em>IVLINT</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.cdsdt.r2.IVLINT
	 * @generated
	 */
	public Adapter createIVLINTAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.cdsdt.r2.IVLPQ <em>IVLPQ</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.cdsdt.r2.IVLPQ
	 * @generated
	 */
	public Adapter createIVLPQAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.cdsdt.r2.IVLQTY <em>IVLQTY</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.cdsdt.r2.IVLQTY
	 * @generated
	 */
	public Adapter createIVLQTYAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.cdsdt.r2.IVLREAL <em>IVLREAL</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.cdsdt.r2.IVLREAL
	 * @generated
	 */
	public Adapter createIVLREALAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.cdsdt.r2.IVLTS <em>IVLTS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.cdsdt.r2.IVLTS
	 * @generated
	 */
	public Adapter createIVLTSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.cdsdt.r2.PIVLTS <em>PIVLTS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.cdsdt.r2.PIVLTS
	 * @generated
	 */
	public Adapter createPIVLTSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.cdsdt.r2.PQ <em>PQ</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.cdsdt.r2.PQ
	 * @generated
	 */
	public Adapter createPQAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.cdsdt.r2.QSET <em>QSET</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.cdsdt.r2.QSET
	 * @generated
	 */
	public Adapter createQSETAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.cdsdt.r2.QTY <em>QTY</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.cdsdt.r2.QTY
	 * @generated
	 */
	public Adapter createQTYAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.cdsdt.r2.REAL <em>REAL</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.cdsdt.r2.REAL
	 * @generated
	 */
	public Adapter createREALAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.cdsdt.r2.RTO <em>RTO</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.cdsdt.r2.RTO
	 * @generated
	 */
	public Adapter createRTOAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.cdsdt.r2.ST <em>ST</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.cdsdt.r2.ST
	 * @generated
	 */
	public Adapter createSTAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.cdsdt.r2.TEL <em>TEL</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.cdsdt.r2.TEL
	 * @generated
	 */
	public Adapter createTELAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.cdsdt.r2.TS <em>TS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.cdsdt.r2.TS
	 * @generated
	 */
	public Adapter createTSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.cdsdt.r2.XP <em>XP</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.cdsdt.r2.XP
	 * @generated
	 */
	public Adapter createXPAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //R2AdapterFactory
