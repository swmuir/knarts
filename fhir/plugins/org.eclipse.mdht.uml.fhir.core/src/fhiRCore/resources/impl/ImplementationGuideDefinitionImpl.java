/**
 */
package fhiRCore.resources.impl;

import fhiRCore.dataTypes.impl.BackboneElementImpl;

import fhiRCore.resources.ImplementationGuideDefinition;
import fhiRCore.resources.ImplementationGuideDefinitionGrouping;
import fhiRCore.resources.ImplementationGuideDefinitionPage;
import fhiRCore.resources.ImplementationGuideDefinitionParameter;
import fhiRCore.resources.ImplementationGuideDefinitionResource;
import fhiRCore.resources.ImplementationGuideDefinitionTemplate;
import fhiRCore.resources.ResourcesPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Implementation Guide Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.impl.ImplementationGuideDefinitionImpl#getGroupings <em>Grouping</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ImplementationGuideDefinitionImpl#getResources <em>Resource</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ImplementationGuideDefinitionImpl#getPage <em>Page</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ImplementationGuideDefinitionImpl#getParameters <em>Parameter</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ImplementationGuideDefinitionImpl#getTemplates <em>Template</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ImplementationGuideDefinitionImpl extends BackboneElementImpl implements ImplementationGuideDefinition {
	/**
	 * The cached value of the '{@link #getGroupings() <em>Grouping</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupings()
	 * @generated
	 * @ordered
	 */
	protected EList<ImplementationGuideDefinitionGrouping> groupings;

	/**
	 * The cached value of the '{@link #getResources() <em>Resource</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResources()
	 * @generated
	 * @ordered
	 */
	protected EList<ImplementationGuideDefinitionResource> resources;

	/**
	 * The cached value of the '{@link #getPage() <em>Page</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPage()
	 * @generated
	 * @ordered
	 */
	protected ImplementationGuideDefinitionPage page;

	/**
	 * The cached value of the '{@link #getParameters() <em>Parameter</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<ImplementationGuideDefinitionParameter> parameters;

	/**
	 * The cached value of the '{@link #getTemplates() <em>Template</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemplates()
	 * @generated
	 * @ordered
	 */
	protected EList<ImplementationGuideDefinitionTemplate> templates;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImplementationGuideDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getImplementationGuideDefinition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ImplementationGuideDefinitionGrouping> getGroupings() {
		if (groupings == null) {
			groupings = new EObjectContainmentEList<ImplementationGuideDefinitionGrouping>(ImplementationGuideDefinitionGrouping.class, this, ResourcesPackage.IMPLEMENTATION_GUIDE_DEFINITION__GROUPING);
		}
		return groupings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ImplementationGuideDefinitionResource> getResources() {
		if (resources == null) {
			resources = new EObjectContainmentEList<ImplementationGuideDefinitionResource>(ImplementationGuideDefinitionResource.class, this, ResourcesPackage.IMPLEMENTATION_GUIDE_DEFINITION__RESOURCE);
		}
		return resources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImplementationGuideDefinitionPage getPage() {
		return page;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPage(ImplementationGuideDefinitionPage newPage, NotificationChain msgs) {
		ImplementationGuideDefinitionPage oldPage = page;
		page = newPage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.IMPLEMENTATION_GUIDE_DEFINITION__PAGE, oldPage, newPage);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPage(ImplementationGuideDefinitionPage newPage) {
		if (newPage != page) {
			NotificationChain msgs = null;
			if (page != null)
				msgs = ((InternalEObject)page).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.IMPLEMENTATION_GUIDE_DEFINITION__PAGE, null, msgs);
			if (newPage != null)
				msgs = ((InternalEObject)newPage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.IMPLEMENTATION_GUIDE_DEFINITION__PAGE, null, msgs);
			msgs = basicSetPage(newPage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.IMPLEMENTATION_GUIDE_DEFINITION__PAGE, newPage, newPage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ImplementationGuideDefinitionParameter> getParameters() {
		if (parameters == null) {
			parameters = new EObjectContainmentEList<ImplementationGuideDefinitionParameter>(ImplementationGuideDefinitionParameter.class, this, ResourcesPackage.IMPLEMENTATION_GUIDE_DEFINITION__PARAMETER);
		}
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ImplementationGuideDefinitionTemplate> getTemplates() {
		if (templates == null) {
			templates = new EObjectContainmentEList<ImplementationGuideDefinitionTemplate>(ImplementationGuideDefinitionTemplate.class, this, ResourcesPackage.IMPLEMENTATION_GUIDE_DEFINITION__TEMPLATE);
		}
		return templates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.IMPLEMENTATION_GUIDE_DEFINITION__GROUPING:
				return ((InternalEList<?>)getGroupings()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.IMPLEMENTATION_GUIDE_DEFINITION__RESOURCE:
				return ((InternalEList<?>)getResources()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.IMPLEMENTATION_GUIDE_DEFINITION__PAGE:
				return basicSetPage(null, msgs);
			case ResourcesPackage.IMPLEMENTATION_GUIDE_DEFINITION__PARAMETER:
				return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.IMPLEMENTATION_GUIDE_DEFINITION__TEMPLATE:
				return ((InternalEList<?>)getTemplates()).basicRemove(otherEnd, msgs);
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
			case ResourcesPackage.IMPLEMENTATION_GUIDE_DEFINITION__GROUPING:
				return getGroupings();
			case ResourcesPackage.IMPLEMENTATION_GUIDE_DEFINITION__RESOURCE:
				return getResources();
			case ResourcesPackage.IMPLEMENTATION_GUIDE_DEFINITION__PAGE:
				return getPage();
			case ResourcesPackage.IMPLEMENTATION_GUIDE_DEFINITION__PARAMETER:
				return getParameters();
			case ResourcesPackage.IMPLEMENTATION_GUIDE_DEFINITION__TEMPLATE:
				return getTemplates();
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
			case ResourcesPackage.IMPLEMENTATION_GUIDE_DEFINITION__GROUPING:
				getGroupings().clear();
				getGroupings().addAll((Collection<? extends ImplementationGuideDefinitionGrouping>)newValue);
				return;
			case ResourcesPackage.IMPLEMENTATION_GUIDE_DEFINITION__RESOURCE:
				getResources().clear();
				getResources().addAll((Collection<? extends ImplementationGuideDefinitionResource>)newValue);
				return;
			case ResourcesPackage.IMPLEMENTATION_GUIDE_DEFINITION__PAGE:
				setPage((ImplementationGuideDefinitionPage)newValue);
				return;
			case ResourcesPackage.IMPLEMENTATION_GUIDE_DEFINITION__PARAMETER:
				getParameters().clear();
				getParameters().addAll((Collection<? extends ImplementationGuideDefinitionParameter>)newValue);
				return;
			case ResourcesPackage.IMPLEMENTATION_GUIDE_DEFINITION__TEMPLATE:
				getTemplates().clear();
				getTemplates().addAll((Collection<? extends ImplementationGuideDefinitionTemplate>)newValue);
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
			case ResourcesPackage.IMPLEMENTATION_GUIDE_DEFINITION__GROUPING:
				getGroupings().clear();
				return;
			case ResourcesPackage.IMPLEMENTATION_GUIDE_DEFINITION__RESOURCE:
				getResources().clear();
				return;
			case ResourcesPackage.IMPLEMENTATION_GUIDE_DEFINITION__PAGE:
				setPage((ImplementationGuideDefinitionPage)null);
				return;
			case ResourcesPackage.IMPLEMENTATION_GUIDE_DEFINITION__PARAMETER:
				getParameters().clear();
				return;
			case ResourcesPackage.IMPLEMENTATION_GUIDE_DEFINITION__TEMPLATE:
				getTemplates().clear();
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
			case ResourcesPackage.IMPLEMENTATION_GUIDE_DEFINITION__GROUPING:
				return groupings != null && !groupings.isEmpty();
			case ResourcesPackage.IMPLEMENTATION_GUIDE_DEFINITION__RESOURCE:
				return resources != null && !resources.isEmpty();
			case ResourcesPackage.IMPLEMENTATION_GUIDE_DEFINITION__PAGE:
				return page != null;
			case ResourcesPackage.IMPLEMENTATION_GUIDE_DEFINITION__PARAMETER:
				return parameters != null && !parameters.isEmpty();
			case ResourcesPackage.IMPLEMENTATION_GUIDE_DEFINITION__TEMPLATE:
				return templates != null && !templates.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ImplementationGuideDefinitionImpl
