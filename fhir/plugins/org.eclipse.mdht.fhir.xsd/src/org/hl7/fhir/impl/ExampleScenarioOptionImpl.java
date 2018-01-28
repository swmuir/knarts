/**
 */
package org.hl7.fhir.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.hl7.fhir.ExampleScenarioOption;
import org.hl7.fhir.ExampleScenarioStep;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Markdown;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Example Scenario Option</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.ExampleScenarioOptionImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ExampleScenarioOptionImpl#getStep <em>Step</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ExampleScenarioOptionImpl#getPause <em>Pause</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExampleScenarioOptionImpl extends BackboneElementImpl implements ExampleScenarioOption {
	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected Markdown description;

	/**
	 * The cached value of the '{@link #getStep() <em>Step</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStep()
	 * @generated
	 * @ordered
	 */
	protected EList<ExampleScenarioStep> step;

	/**
	 * The cached value of the '{@link #getPause() <em>Pause</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPause()
	 * @generated
	 * @ordered
	 */
	protected EList<org.hl7.fhir.Boolean> pause;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExampleScenarioOptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getExampleScenarioOption();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Markdown getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDescription(Markdown newDescription, NotificationChain msgs) {
		Markdown oldDescription = description;
		description = newDescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EXAMPLE_SCENARIO_OPTION__DESCRIPTION, oldDescription, newDescription);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(Markdown newDescription) {
		if (newDescription != description) {
			NotificationChain msgs = null;
			if (description != null)
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXAMPLE_SCENARIO_OPTION__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXAMPLE_SCENARIO_OPTION__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EXAMPLE_SCENARIO_OPTION__DESCRIPTION, newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExampleScenarioStep> getStep() {
		if (step == null) {
			step = new EObjectContainmentEList<ExampleScenarioStep>(ExampleScenarioStep.class, this, FhirPackage.EXAMPLE_SCENARIO_OPTION__STEP);
		}
		return step;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<org.hl7.fhir.Boolean> getPause() {
		if (pause == null) {
			pause = new EObjectContainmentEList<org.hl7.fhir.Boolean>(org.hl7.fhir.Boolean.class, this, FhirPackage.EXAMPLE_SCENARIO_OPTION__PAUSE);
		}
		return pause;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.EXAMPLE_SCENARIO_OPTION__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case FhirPackage.EXAMPLE_SCENARIO_OPTION__STEP:
				return ((InternalEList<?>)getStep()).basicRemove(otherEnd, msgs);
			case FhirPackage.EXAMPLE_SCENARIO_OPTION__PAUSE:
				return ((InternalEList<?>)getPause()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.EXAMPLE_SCENARIO_OPTION__DESCRIPTION:
				return getDescription();
			case FhirPackage.EXAMPLE_SCENARIO_OPTION__STEP:
				return getStep();
			case FhirPackage.EXAMPLE_SCENARIO_OPTION__PAUSE:
				return getPause();
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
			case FhirPackage.EXAMPLE_SCENARIO_OPTION__DESCRIPTION:
				setDescription((Markdown)newValue);
				return;
			case FhirPackage.EXAMPLE_SCENARIO_OPTION__STEP:
				getStep().clear();
				getStep().addAll((Collection<? extends ExampleScenarioStep>)newValue);
				return;
			case FhirPackage.EXAMPLE_SCENARIO_OPTION__PAUSE:
				getPause().clear();
				getPause().addAll((Collection<? extends org.hl7.fhir.Boolean>)newValue);
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
			case FhirPackage.EXAMPLE_SCENARIO_OPTION__DESCRIPTION:
				setDescription((Markdown)null);
				return;
			case FhirPackage.EXAMPLE_SCENARIO_OPTION__STEP:
				getStep().clear();
				return;
			case FhirPackage.EXAMPLE_SCENARIO_OPTION__PAUSE:
				getPause().clear();
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
			case FhirPackage.EXAMPLE_SCENARIO_OPTION__DESCRIPTION:
				return description != null;
			case FhirPackage.EXAMPLE_SCENARIO_OPTION__STEP:
				return step != null && !step.isEmpty();
			case FhirPackage.EXAMPLE_SCENARIO_OPTION__PAUSE:
				return pause != null && !pause.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ExampleScenarioOptionImpl
