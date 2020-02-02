/**
 */
package org.hl7.elm.r1.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.hl7.elm.r1.AliasedQuerySource;
import org.hl7.elm.r1.DefineClause;
import org.hl7.elm.r1.Expression;
import org.hl7.elm.r1.Query;
import org.hl7.elm.r1.R1Package;
import org.hl7.elm.r1.RelationshipClause;
import org.hl7.elm.r1.ReturnClause;
import org.hl7.elm.r1.SortClause;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Query</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.elm.r1.impl.QueryImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.hl7.elm.r1.impl.QueryImpl#getDefine <em>Define</em>}</li>
 *   <li>{@link org.hl7.elm.r1.impl.QueryImpl#getRelationship <em>Relationship</em>}</li>
 *   <li>{@link org.hl7.elm.r1.impl.QueryImpl#getWhere <em>Where</em>}</li>
 *   <li>{@link org.hl7.elm.r1.impl.QueryImpl#getReturn <em>Return</em>}</li>
 *   <li>{@link org.hl7.elm.r1.impl.QueryImpl#getSort <em>Sort</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QueryImpl extends ExpressionImpl implements Query {
	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected EList<AliasedQuerySource> source;

	/**
	 * The cached value of the '{@link #getDefine() <em>Define</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefine()
	 * @generated
	 * @ordered
	 */
	protected EList<DefineClause> define;

	/**
	 * The cached value of the '{@link #getRelationship() <em>Relationship</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelationship()
	 * @generated
	 * @ordered
	 */
	protected EList<RelationshipClause> relationship;

	/**
	 * The cached value of the '{@link #getWhere() <em>Where</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhere()
	 * @generated
	 * @ordered
	 */
	protected Expression where;

	/**
	 * The cached value of the '{@link #getReturn() <em>Return</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturn()
	 * @generated
	 * @ordered
	 */
	protected ReturnClause return_;

	/**
	 * The cached value of the '{@link #getSort() <em>Sort</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSort()
	 * @generated
	 * @ordered
	 */
	protected SortClause sort;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QueryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return R1Package.eINSTANCE.getQuery();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AliasedQuerySource> getSource() {
		if (source == null) {
			source = new EObjectContainmentEList<AliasedQuerySource>(AliasedQuerySource.class, this, R1Package.QUERY__SOURCE);
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DefineClause> getDefine() {
		if (define == null) {
			define = new EObjectContainmentEList<DefineClause>(DefineClause.class, this, R1Package.QUERY__DEFINE);
		}
		return define;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RelationshipClause> getRelationship() {
		if (relationship == null) {
			relationship = new EObjectContainmentEList<RelationshipClause>(RelationshipClause.class, this, R1Package.QUERY__RELATIONSHIP);
		}
		return relationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getWhere() {
		return where;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWhere(Expression newWhere, NotificationChain msgs) {
		Expression oldWhere = where;
		where = newWhere;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, R1Package.QUERY__WHERE, oldWhere, newWhere);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWhere(Expression newWhere) {
		if (newWhere != where) {
			NotificationChain msgs = null;
			if (where != null)
				msgs = ((InternalEObject)where).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - R1Package.QUERY__WHERE, null, msgs);
			if (newWhere != null)
				msgs = ((InternalEObject)newWhere).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - R1Package.QUERY__WHERE, null, msgs);
			msgs = basicSetWhere(newWhere, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, R1Package.QUERY__WHERE, newWhere, newWhere));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReturnClause getReturn() {
		return return_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReturn(ReturnClause newReturn, NotificationChain msgs) {
		ReturnClause oldReturn = return_;
		return_ = newReturn;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, R1Package.QUERY__RETURN, oldReturn, newReturn);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReturn(ReturnClause newReturn) {
		if (newReturn != return_) {
			NotificationChain msgs = null;
			if (return_ != null)
				msgs = ((InternalEObject)return_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - R1Package.QUERY__RETURN, null, msgs);
			if (newReturn != null)
				msgs = ((InternalEObject)newReturn).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - R1Package.QUERY__RETURN, null, msgs);
			msgs = basicSetReturn(newReturn, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, R1Package.QUERY__RETURN, newReturn, newReturn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SortClause getSort() {
		return sort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSort(SortClause newSort, NotificationChain msgs) {
		SortClause oldSort = sort;
		sort = newSort;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, R1Package.QUERY__SORT, oldSort, newSort);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSort(SortClause newSort) {
		if (newSort != sort) {
			NotificationChain msgs = null;
			if (sort != null)
				msgs = ((InternalEObject)sort).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - R1Package.QUERY__SORT, null, msgs);
			if (newSort != null)
				msgs = ((InternalEObject)newSort).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - R1Package.QUERY__SORT, null, msgs);
			msgs = basicSetSort(newSort, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, R1Package.QUERY__SORT, newSort, newSort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case R1Package.QUERY__SOURCE:
				return ((InternalEList<?>)getSource()).basicRemove(otherEnd, msgs);
			case R1Package.QUERY__DEFINE:
				return ((InternalEList<?>)getDefine()).basicRemove(otherEnd, msgs);
			case R1Package.QUERY__RELATIONSHIP:
				return ((InternalEList<?>)getRelationship()).basicRemove(otherEnd, msgs);
			case R1Package.QUERY__WHERE:
				return basicSetWhere(null, msgs);
			case R1Package.QUERY__RETURN:
				return basicSetReturn(null, msgs);
			case R1Package.QUERY__SORT:
				return basicSetSort(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case R1Package.QUERY__SOURCE:
				return getSource();
			case R1Package.QUERY__DEFINE:
				return getDefine();
			case R1Package.QUERY__RELATIONSHIP:
				return getRelationship();
			case R1Package.QUERY__WHERE:
				return getWhere();
			case R1Package.QUERY__RETURN:
				return getReturn();
			case R1Package.QUERY__SORT:
				return getSort();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case R1Package.QUERY__SOURCE:
				getSource().clear();
				getSource().addAll((Collection<? extends AliasedQuerySource>)newValue);
				return;
			case R1Package.QUERY__DEFINE:
				getDefine().clear();
				getDefine().addAll((Collection<? extends DefineClause>)newValue);
				return;
			case R1Package.QUERY__RELATIONSHIP:
				getRelationship().clear();
				getRelationship().addAll((Collection<? extends RelationshipClause>)newValue);
				return;
			case R1Package.QUERY__WHERE:
				setWhere((Expression)newValue);
				return;
			case R1Package.QUERY__RETURN:
				setReturn((ReturnClause)newValue);
				return;
			case R1Package.QUERY__SORT:
				setSort((SortClause)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case R1Package.QUERY__SOURCE:
				getSource().clear();
				return;
			case R1Package.QUERY__DEFINE:
				getDefine().clear();
				return;
			case R1Package.QUERY__RELATIONSHIP:
				getRelationship().clear();
				return;
			case R1Package.QUERY__WHERE:
				setWhere((Expression)null);
				return;
			case R1Package.QUERY__RETURN:
				setReturn((ReturnClause)null);
				return;
			case R1Package.QUERY__SORT:
				setSort((SortClause)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case R1Package.QUERY__SOURCE:
				return source != null && !source.isEmpty();
			case R1Package.QUERY__DEFINE:
				return define != null && !define.isEmpty();
			case R1Package.QUERY__RELATIONSHIP:
				return relationship != null && !relationship.isEmpty();
			case R1Package.QUERY__WHERE:
				return where != null;
			case R1Package.QUERY__RETURN:
				return return_ != null;
			case R1Package.QUERY__SORT:
				return sort != null;
		}
		return super.eIsSet(featureID);
	}

} //QueryImpl
