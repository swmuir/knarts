/**
 */
package fhiRCore.resources.impl;

import fhiRCore.dataTypes.Code;

import fhiRCore.dataTypes.impl.BackboneElementImpl;

import fhiRCore.resources.CodeSystemConceptDefinition;
import fhiRCore.resources.CodeSystemConceptDefinitionConceptProperty;
import fhiRCore.resources.CodeSystemConceptDefinitionDesignation;
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
 * An implementation of the model object '<em><b>Code System Concept Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.impl.CodeSystemConceptDefinitionImpl#getCode <em>Code</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.CodeSystemConceptDefinitionImpl#getDisplay <em>Display</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.CodeSystemConceptDefinitionImpl#getDefinition <em>Definition</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.CodeSystemConceptDefinitionImpl#getDesignations <em>Designation</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.CodeSystemConceptDefinitionImpl#getProperties <em>Property</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.CodeSystemConceptDefinitionImpl#getConcepts <em>Concept</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CodeSystemConceptDefinitionImpl extends BackboneElementImpl implements CodeSystemConceptDefinition {
	/**
	 * The cached value of the '{@link #getCode() <em>Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected Code code;

	/**
	 * The cached value of the '{@link #getDisplay() <em>Display</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplay()
	 * @generated
	 * @ordered
	 */
	protected fhiRCore.dataTypes.String display;

	/**
	 * The cached value of the '{@link #getDefinition() <em>Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefinition()
	 * @generated
	 * @ordered
	 */
	protected fhiRCore.dataTypes.String definition;

	/**
	 * The cached value of the '{@link #getDesignations() <em>Designation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDesignations()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeSystemConceptDefinitionDesignation> designations;

	/**
	 * The cached value of the '{@link #getProperties() <em>Property</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperties()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeSystemConceptDefinitionConceptProperty> properties;

	/**
	 * The cached value of the '{@link #getConcepts() <em>Concept</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcepts()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeSystemConceptDefinition> concepts;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CodeSystemConceptDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getCodeSystemConceptDefinition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getCode() {
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCode(Code newCode, NotificationChain msgs) {
		Code oldCode = code;
		code = newCode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.CODE_SYSTEM_CONCEPT_DEFINITION__CODE, oldCode, newCode);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCode(Code newCode) {
		if (newCode != code) {
			NotificationChain msgs = null;
			if (code != null)
				msgs = ((InternalEObject)code).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CODE_SYSTEM_CONCEPT_DEFINITION__CODE, null, msgs);
			if (newCode != null)
				msgs = ((InternalEObject)newCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CODE_SYSTEM_CONCEPT_DEFINITION__CODE, null, msgs);
			msgs = basicSetCode(newCode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CODE_SYSTEM_CONCEPT_DEFINITION__CODE, newCode, newCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public fhiRCore.dataTypes.String getDisplay() {
		return display;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDisplay(fhiRCore.dataTypes.String newDisplay, NotificationChain msgs) {
		fhiRCore.dataTypes.String oldDisplay = display;
		display = newDisplay;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.CODE_SYSTEM_CONCEPT_DEFINITION__DISPLAY, oldDisplay, newDisplay);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisplay(fhiRCore.dataTypes.String newDisplay) {
		if (newDisplay != display) {
			NotificationChain msgs = null;
			if (display != null)
				msgs = ((InternalEObject)display).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CODE_SYSTEM_CONCEPT_DEFINITION__DISPLAY, null, msgs);
			if (newDisplay != null)
				msgs = ((InternalEObject)newDisplay).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CODE_SYSTEM_CONCEPT_DEFINITION__DISPLAY, null, msgs);
			msgs = basicSetDisplay(newDisplay, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CODE_SYSTEM_CONCEPT_DEFINITION__DISPLAY, newDisplay, newDisplay));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public fhiRCore.dataTypes.String getDefinition() {
		return definition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefinition(fhiRCore.dataTypes.String newDefinition, NotificationChain msgs) {
		fhiRCore.dataTypes.String oldDefinition = definition;
		definition = newDefinition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.CODE_SYSTEM_CONCEPT_DEFINITION__DEFINITION, oldDefinition, newDefinition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefinition(fhiRCore.dataTypes.String newDefinition) {
		if (newDefinition != definition) {
			NotificationChain msgs = null;
			if (definition != null)
				msgs = ((InternalEObject)definition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CODE_SYSTEM_CONCEPT_DEFINITION__DEFINITION, null, msgs);
			if (newDefinition != null)
				msgs = ((InternalEObject)newDefinition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CODE_SYSTEM_CONCEPT_DEFINITION__DEFINITION, null, msgs);
			msgs = basicSetDefinition(newDefinition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CODE_SYSTEM_CONCEPT_DEFINITION__DEFINITION, newDefinition, newDefinition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeSystemConceptDefinitionDesignation> getDesignations() {
		if (designations == null) {
			designations = new EObjectContainmentEList<CodeSystemConceptDefinitionDesignation>(CodeSystemConceptDefinitionDesignation.class, this, ResourcesPackage.CODE_SYSTEM_CONCEPT_DEFINITION__DESIGNATION);
		}
		return designations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeSystemConceptDefinitionConceptProperty> getProperties() {
		if (properties == null) {
			properties = new EObjectContainmentEList<CodeSystemConceptDefinitionConceptProperty>(CodeSystemConceptDefinitionConceptProperty.class, this, ResourcesPackage.CODE_SYSTEM_CONCEPT_DEFINITION__PROPERTY);
		}
		return properties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeSystemConceptDefinition> getConcepts() {
		if (concepts == null) {
			concepts = new EObjectContainmentEList<CodeSystemConceptDefinition>(CodeSystemConceptDefinition.class, this, ResourcesPackage.CODE_SYSTEM_CONCEPT_DEFINITION__CONCEPT);
		}
		return concepts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.CODE_SYSTEM_CONCEPT_DEFINITION__CODE:
				return basicSetCode(null, msgs);
			case ResourcesPackage.CODE_SYSTEM_CONCEPT_DEFINITION__DISPLAY:
				return basicSetDisplay(null, msgs);
			case ResourcesPackage.CODE_SYSTEM_CONCEPT_DEFINITION__DEFINITION:
				return basicSetDefinition(null, msgs);
			case ResourcesPackage.CODE_SYSTEM_CONCEPT_DEFINITION__DESIGNATION:
				return ((InternalEList<?>)getDesignations()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.CODE_SYSTEM_CONCEPT_DEFINITION__PROPERTY:
				return ((InternalEList<?>)getProperties()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.CODE_SYSTEM_CONCEPT_DEFINITION__CONCEPT:
				return ((InternalEList<?>)getConcepts()).basicRemove(otherEnd, msgs);
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
			case ResourcesPackage.CODE_SYSTEM_CONCEPT_DEFINITION__CODE:
				return getCode();
			case ResourcesPackage.CODE_SYSTEM_CONCEPT_DEFINITION__DISPLAY:
				return getDisplay();
			case ResourcesPackage.CODE_SYSTEM_CONCEPT_DEFINITION__DEFINITION:
				return getDefinition();
			case ResourcesPackage.CODE_SYSTEM_CONCEPT_DEFINITION__DESIGNATION:
				return getDesignations();
			case ResourcesPackage.CODE_SYSTEM_CONCEPT_DEFINITION__PROPERTY:
				return getProperties();
			case ResourcesPackage.CODE_SYSTEM_CONCEPT_DEFINITION__CONCEPT:
				return getConcepts();
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
			case ResourcesPackage.CODE_SYSTEM_CONCEPT_DEFINITION__CODE:
				setCode((Code)newValue);
				return;
			case ResourcesPackage.CODE_SYSTEM_CONCEPT_DEFINITION__DISPLAY:
				setDisplay((fhiRCore.dataTypes.String)newValue);
				return;
			case ResourcesPackage.CODE_SYSTEM_CONCEPT_DEFINITION__DEFINITION:
				setDefinition((fhiRCore.dataTypes.String)newValue);
				return;
			case ResourcesPackage.CODE_SYSTEM_CONCEPT_DEFINITION__DESIGNATION:
				getDesignations().clear();
				getDesignations().addAll((Collection<? extends CodeSystemConceptDefinitionDesignation>)newValue);
				return;
			case ResourcesPackage.CODE_SYSTEM_CONCEPT_DEFINITION__PROPERTY:
				getProperties().clear();
				getProperties().addAll((Collection<? extends CodeSystemConceptDefinitionConceptProperty>)newValue);
				return;
			case ResourcesPackage.CODE_SYSTEM_CONCEPT_DEFINITION__CONCEPT:
				getConcepts().clear();
				getConcepts().addAll((Collection<? extends CodeSystemConceptDefinition>)newValue);
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
			case ResourcesPackage.CODE_SYSTEM_CONCEPT_DEFINITION__CODE:
				setCode((Code)null);
				return;
			case ResourcesPackage.CODE_SYSTEM_CONCEPT_DEFINITION__DISPLAY:
				setDisplay((fhiRCore.dataTypes.String)null);
				return;
			case ResourcesPackage.CODE_SYSTEM_CONCEPT_DEFINITION__DEFINITION:
				setDefinition((fhiRCore.dataTypes.String)null);
				return;
			case ResourcesPackage.CODE_SYSTEM_CONCEPT_DEFINITION__DESIGNATION:
				getDesignations().clear();
				return;
			case ResourcesPackage.CODE_SYSTEM_CONCEPT_DEFINITION__PROPERTY:
				getProperties().clear();
				return;
			case ResourcesPackage.CODE_SYSTEM_CONCEPT_DEFINITION__CONCEPT:
				getConcepts().clear();
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
			case ResourcesPackage.CODE_SYSTEM_CONCEPT_DEFINITION__CODE:
				return code != null;
			case ResourcesPackage.CODE_SYSTEM_CONCEPT_DEFINITION__DISPLAY:
				return display != null;
			case ResourcesPackage.CODE_SYSTEM_CONCEPT_DEFINITION__DEFINITION:
				return definition != null;
			case ResourcesPackage.CODE_SYSTEM_CONCEPT_DEFINITION__DESIGNATION:
				return designations != null && !designations.isEmpty();
			case ResourcesPackage.CODE_SYSTEM_CONCEPT_DEFINITION__PROPERTY:
				return properties != null && !properties.isEmpty();
			case ResourcesPackage.CODE_SYSTEM_CONCEPT_DEFINITION__CONCEPT:
				return concepts != null && !concepts.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CodeSystemConceptDefinitionImpl
