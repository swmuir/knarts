/**
 */
package org.hl7.cdsdt.r2.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.hl7.cdsdt.r2.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.hl7.cdsdt.r2.R2Package
 * @generated
 */
public class R2Switch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static R2Package modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public R2Switch() {
		if (modelPackage == null) {
			modelPackage = R2Package.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case R2Package.AD: {
				AD ad = (AD)theEObject;
				T result = caseAD(ad);
				if (result == null) result = caseANY(ad);
				if (result == null) result = caseHXIT(ad);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R2Package.ADXP: {
				ADXP adxp = (ADXP)theEObject;
				T result = caseADXP(adxp);
				if (result == null) result = caseXP(adxp);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R2Package.ANY: {
				ANY any = (ANY)theEObject;
				T result = caseANY(any);
				if (result == null) result = caseHXIT(any);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R2Package.BL: {
				BL bl = (BL)theEObject;
				T result = caseBL(bl);
				if (result == null) result = caseANY(bl);
				if (result == null) result = caseHXIT(bl);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R2Package.CD: {
				CD cd = (CD)theEObject;
				T result = caseCD(cd);
				if (result == null) result = caseANY(cd);
				if (result == null) result = caseHXIT(cd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R2Package.CO: {
				CO co = (CO)theEObject;
				T result = caseCO(co);
				if (result == null) result = caseQTY(co);
				if (result == null) result = caseANY(co);
				if (result == null) result = caseHXIT(co);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R2Package.CS: {
				CS cs = (CS)theEObject;
				T result = caseCS(cs);
				if (result == null) result = caseANY(cs);
				if (result == null) result = caseHXIT(cs);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R2Package.ED: {
				ED ed = (ED)theEObject;
				T result = caseED(ed);
				if (result == null) result = caseANY(ed);
				if (result == null) result = caseHXIT(ed);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R2Package.EN: {
				EN en = (EN)theEObject;
				T result = caseEN(en);
				if (result == null) result = caseANY(en);
				if (result == null) result = caseHXIT(en);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R2Package.ENXP: {
				ENXP enxp = (ENXP)theEObject;
				T result = caseENXP(enxp);
				if (result == null) result = caseXP(enxp);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R2Package.HXIT: {
				HXIT hxit = (HXIT)theEObject;
				T result = caseHXIT(hxit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R2Package.II: {
				II ii = (II)theEObject;
				T result = caseII(ii);
				if (result == null) result = caseANY(ii);
				if (result == null) result = caseHXIT(ii);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R2Package.INT: {
				INT int_ = (INT)theEObject;
				T result = caseINT(int_);
				if (result == null) result = caseQTY(int_);
				if (result == null) result = caseANY(int_);
				if (result == null) result = caseHXIT(int_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R2Package.IVL: {
				IVL ivl = (IVL)theEObject;
				T result = caseIVL(ivl);
				if (result == null) result = caseQSET(ivl);
				if (result == null) result = caseANY(ivl);
				if (result == null) result = caseHXIT(ivl);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R2Package.IVLCO: {
				IVLCO ivlco = (IVLCO)theEObject;
				T result = caseIVLCO(ivlco);
				if (result == null) result = caseIVL(ivlco);
				if (result == null) result = caseQSET(ivlco);
				if (result == null) result = caseANY(ivlco);
				if (result == null) result = caseHXIT(ivlco);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R2Package.IVLINT: {
				IVLINT ivlint = (IVLINT)theEObject;
				T result = caseIVLINT(ivlint);
				if (result == null) result = caseIVL(ivlint);
				if (result == null) result = caseQSET(ivlint);
				if (result == null) result = caseANY(ivlint);
				if (result == null) result = caseHXIT(ivlint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R2Package.IVLPQ: {
				IVLPQ ivlpq = (IVLPQ)theEObject;
				T result = caseIVLPQ(ivlpq);
				if (result == null) result = caseIVL(ivlpq);
				if (result == null) result = caseQSET(ivlpq);
				if (result == null) result = caseANY(ivlpq);
				if (result == null) result = caseHXIT(ivlpq);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R2Package.IVLQTY: {
				IVLQTY ivlqty = (IVLQTY)theEObject;
				T result = caseIVLQTY(ivlqty);
				if (result == null) result = caseIVL(ivlqty);
				if (result == null) result = caseQSET(ivlqty);
				if (result == null) result = caseANY(ivlqty);
				if (result == null) result = caseHXIT(ivlqty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R2Package.IVLREAL: {
				IVLREAL ivlreal = (IVLREAL)theEObject;
				T result = caseIVLREAL(ivlreal);
				if (result == null) result = caseIVL(ivlreal);
				if (result == null) result = caseQSET(ivlreal);
				if (result == null) result = caseANY(ivlreal);
				if (result == null) result = caseHXIT(ivlreal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R2Package.IVLTS: {
				IVLTS ivlts = (IVLTS)theEObject;
				T result = caseIVLTS(ivlts);
				if (result == null) result = caseIVL(ivlts);
				if (result == null) result = caseQSET(ivlts);
				if (result == null) result = caseANY(ivlts);
				if (result == null) result = caseHXIT(ivlts);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R2Package.PIVLTS: {
				PIVLTS pivlts = (PIVLTS)theEObject;
				T result = casePIVLTS(pivlts);
				if (result == null) result = caseQTY(pivlts);
				if (result == null) result = caseANY(pivlts);
				if (result == null) result = caseHXIT(pivlts);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R2Package.PQ: {
				PQ pq = (PQ)theEObject;
				T result = casePQ(pq);
				if (result == null) result = caseQTY(pq);
				if (result == null) result = caseANY(pq);
				if (result == null) result = caseHXIT(pq);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R2Package.QSET: {
				QSET qset = (QSET)theEObject;
				T result = caseQSET(qset);
				if (result == null) result = caseANY(qset);
				if (result == null) result = caseHXIT(qset);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R2Package.QTY: {
				QTY qty = (QTY)theEObject;
				T result = caseQTY(qty);
				if (result == null) result = caseANY(qty);
				if (result == null) result = caseHXIT(qty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R2Package.REAL: {
				REAL real = (REAL)theEObject;
				T result = caseREAL(real);
				if (result == null) result = caseQTY(real);
				if (result == null) result = caseANY(real);
				if (result == null) result = caseHXIT(real);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R2Package.RTO: {
				RTO rto = (RTO)theEObject;
				T result = caseRTO(rto);
				if (result == null) result = caseQTY(rto);
				if (result == null) result = caseANY(rto);
				if (result == null) result = caseHXIT(rto);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R2Package.ST: {
				ST st = (ST)theEObject;
				T result = caseST(st);
				if (result == null) result = caseANY(st);
				if (result == null) result = caseHXIT(st);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R2Package.TEL: {
				TEL tel = (TEL)theEObject;
				T result = caseTEL(tel);
				if (result == null) result = caseANY(tel);
				if (result == null) result = caseHXIT(tel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R2Package.TS: {
				TS ts = (TS)theEObject;
				T result = caseTS(ts);
				if (result == null) result = caseQTY(ts);
				if (result == null) result = caseANY(ts);
				if (result == null) result = caseHXIT(ts);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R2Package.XP: {
				XP xp = (XP)theEObject;
				T result = caseXP(xp);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>AD</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>AD</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAD(AD object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ADXP</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ADXP</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseADXP(ADXP object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ANY</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ANY</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseANY(ANY object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BL</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BL</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBL(BL object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CD</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CD</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCD(CD object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CO</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CO</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCO(CO object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCS(CS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ED</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ED</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseED(ED object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EN</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EN</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEN(EN object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ENXP</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ENXP</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseENXP(ENXP object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>HXIT</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>HXIT</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHXIT(HXIT object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>II</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>II</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseII(II object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>INT</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>INT</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseINT(INT object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IVL</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IVL</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIVL(IVL object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IVLCO</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IVLCO</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIVLCO(IVLCO object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IVLINT</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IVLINT</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIVLINT(IVLINT object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IVLPQ</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IVLPQ</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIVLPQ(IVLPQ object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IVLQTY</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IVLQTY</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIVLQTY(IVLQTY object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IVLREAL</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IVLREAL</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIVLREAL(IVLREAL object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IVLTS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IVLTS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIVLTS(IVLTS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PIVLTS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PIVLTS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePIVLTS(PIVLTS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PQ</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PQ</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePQ(PQ object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>QSET</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>QSET</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQSET(QSET object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>QTY</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>QTY</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQTY(QTY object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>REAL</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>REAL</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseREAL(REAL object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>RTO</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>RTO</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRTO(RTO object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ST</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ST</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseST(ST object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TEL</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TEL</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTEL(TEL object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTS(TS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>XP</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>XP</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXP(XP object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //R2Switch
