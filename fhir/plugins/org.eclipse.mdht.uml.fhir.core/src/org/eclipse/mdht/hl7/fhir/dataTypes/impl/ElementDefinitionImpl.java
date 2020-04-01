/**
 */
package org.eclipse.mdht.hl7.fhir.dataTypes.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.mdht.hl7.fhir.dataTypes.Code;
import org.eclipse.mdht.hl7.fhir.dataTypes.Coding;
import org.eclipse.mdht.hl7.fhir.dataTypes.DataType;
import org.eclipse.mdht.hl7.fhir.dataTypes.DataTypesPackage;
import org.eclipse.mdht.hl7.fhir.dataTypes.ElementDefinition;
import org.eclipse.mdht.hl7.fhir.dataTypes.ElementDefinitionElement1;
import org.eclipse.mdht.hl7.fhir.dataTypes.ElementDefinitionElement2;
import org.eclipse.mdht.hl7.fhir.dataTypes.ElementDefinitionElement3;
import org.eclipse.mdht.hl7.fhir.dataTypes.ElementDefinitionElement4;
import org.eclipse.mdht.hl7.fhir.dataTypes.ElementDefinitionElement5;
import org.eclipse.mdht.hl7.fhir.dataTypes.ElementDefinitionElement6;
import org.eclipse.mdht.hl7.fhir.dataTypes.ElementDefinitionElement7;
import org.eclipse.mdht.hl7.fhir.dataTypes.Id;
import org.eclipse.mdht.hl7.fhir.dataTypes.Markdown;
import org.eclipse.mdht.hl7.fhir.dataTypes.UnsignedInt;
import org.eclipse.mdht.hl7.fhir.dataTypes.Uri;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Element Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.dataTypes.impl.ElementDefinitionImpl#getPath <em>Path</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.dataTypes.impl.ElementDefinitionImpl#getRepresentations <em>Representation</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.dataTypes.impl.ElementDefinitionImpl#getSliceName <em>Slice Name</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.dataTypes.impl.ElementDefinitionImpl#getSliceIsConstraining <em>Slice Is Constraining</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.dataTypes.impl.ElementDefinitionImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.dataTypes.impl.ElementDefinitionImpl#getCodes <em>Code</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.dataTypes.impl.ElementDefinitionImpl#getSlicing <em>Slicing</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.dataTypes.impl.ElementDefinitionImpl#getShort <em>Short</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.dataTypes.impl.ElementDefinitionImpl#getDefinition <em>Definition</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.dataTypes.impl.ElementDefinitionImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.dataTypes.impl.ElementDefinitionImpl#getRequirements <em>Requirements</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.dataTypes.impl.ElementDefinitionImpl#getAlias <em>Alias</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.dataTypes.impl.ElementDefinitionImpl#getMin <em>Min</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.dataTypes.impl.ElementDefinitionImpl#getMax <em>Max</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.dataTypes.impl.ElementDefinitionImpl#getBase <em>Base</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.dataTypes.impl.ElementDefinitionImpl#getContentReference <em>Content Reference</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.dataTypes.impl.ElementDefinitionImpl#getTypes <em>Type</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.dataTypes.impl.ElementDefinitionImpl#getDefaultValuex <em>Default Valuex</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.dataTypes.impl.ElementDefinitionImpl#getMeaningWhenMissing <em>Meaning When Missing</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.dataTypes.impl.ElementDefinitionImpl#getOrderMeaning <em>Order Meaning</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.dataTypes.impl.ElementDefinitionImpl#getFixedx <em>Fixedx</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.dataTypes.impl.ElementDefinitionImpl#getPatternx <em>Patternx</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.dataTypes.impl.ElementDefinitionImpl#getExamples <em>Example</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.dataTypes.impl.ElementDefinitionImpl#getMinValuex <em>Min Valuex</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.dataTypes.impl.ElementDefinitionImpl#getMaxValuex <em>Max Valuex</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.dataTypes.impl.ElementDefinitionImpl#getMaxLength <em>Max Length</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.dataTypes.impl.ElementDefinitionImpl#getConditions <em>Condition</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.dataTypes.impl.ElementDefinitionImpl#getConstraints <em>Constraint</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.dataTypes.impl.ElementDefinitionImpl#getMustSupport <em>Must Support</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.dataTypes.impl.ElementDefinitionImpl#getIsModifier <em>Is Modifier</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.dataTypes.impl.ElementDefinitionImpl#getIsModifierReason <em>Is Modifier Reason</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.dataTypes.impl.ElementDefinitionImpl#getIsSummary <em>Is Summary</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.dataTypes.impl.ElementDefinitionImpl#getBinding <em>Binding</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.dataTypes.impl.ElementDefinitionImpl#getMappings <em>Mapping</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ElementDefinitionImpl extends BackboneElementImpl implements ElementDefinition {
	/**
	 * The cached value of the '{@link #getPath() <em>Path</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPath()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.hl7.fhir.dataTypes.String path;

	/**
	 * The cached value of the '{@link #getRepresentations() <em>Representation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepresentations()
	 * @generated
	 * @ordered
	 */
	protected EList<Code> representations;

	/**
	 * The cached value of the '{@link #getSliceName() <em>Slice Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSliceName()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.hl7.fhir.dataTypes.String sliceName;

	/**
	 * The cached value of the '{@link #getSliceIsConstraining() <em>Slice Is Constraining</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSliceIsConstraining()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.hl7.fhir.dataTypes.Boolean sliceIsConstraining;

	/**
	 * The cached value of the '{@link #getLabel() <em>Label</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.hl7.fhir.dataTypes.String label;

	/**
	 * The cached value of the '{@link #getCodes() <em>Code</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodes()
	 * @generated
	 * @ordered
	 */
	protected EList<Coding> codes;

	/**
	 * The cached value of the '{@link #getSlicing() <em>Slicing</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSlicing()
	 * @generated
	 * @ordered
	 */
	protected ElementDefinitionElement1 slicing;

	/**
	 * The cached value of the '{@link #getShort() <em>Short</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShort()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.hl7.fhir.dataTypes.String short_;

	/**
	 * The cached value of the '{@link #getDefinition() <em>Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefinition()
	 * @generated
	 * @ordered
	 */
	protected Markdown definition;

	/**
	 * The cached value of the '{@link #getComment() <em>Comment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected Markdown comment;

	/**
	 * The cached value of the '{@link #getRequirements() <em>Requirements</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequirements()
	 * @generated
	 * @ordered
	 */
	protected Markdown requirements;

	/**
	 * The cached value of the '{@link #getAlias() <em>Alias</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlias()
	 * @generated
	 * @ordered
	 */
	protected EList<org.eclipse.mdht.hl7.fhir.dataTypes.String> alias;

	/**
	 * The cached value of the '{@link #getMin() <em>Min</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMin()
	 * @generated
	 * @ordered
	 */
	protected UnsignedInt min;

	/**
	 * The cached value of the '{@link #getMax() <em>Max</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMax()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.hl7.fhir.dataTypes.String max;

	/**
	 * The cached value of the '{@link #getBase() <em>Base</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase()
	 * @generated
	 * @ordered
	 */
	protected ElementDefinitionElement2 base;

	/**
	 * The cached value of the '{@link #getContentReference() <em>Content Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentReference()
	 * @generated
	 * @ordered
	 */
	protected Uri contentReference;

	/**
	 * The cached value of the '{@link #getTypes() <em>Type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<ElementDefinitionElement3> types;

	/**
	 * The cached value of the '{@link #getDefaultValuex() <em>Default Valuex</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValuex()
	 * @generated
	 * @ordered
	 */
	protected DataType defaultValuex;

	/**
	 * The cached value of the '{@link #getMeaningWhenMissing() <em>Meaning When Missing</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeaningWhenMissing()
	 * @generated
	 * @ordered
	 */
	protected Markdown meaningWhenMissing;

	/**
	 * The cached value of the '{@link #getOrderMeaning() <em>Order Meaning</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderMeaning()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.hl7.fhir.dataTypes.String orderMeaning;

	/**
	 * The cached value of the '{@link #getFixedx() <em>Fixedx</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFixedx()
	 * @generated
	 * @ordered
	 */
	protected DataType fixedx;

	/**
	 * The cached value of the '{@link #getPatternx() <em>Patternx</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatternx()
	 * @generated
	 * @ordered
	 */
	protected DataType patternx;

	/**
	 * The cached value of the '{@link #getExamples() <em>Example</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExamples()
	 * @generated
	 * @ordered
	 */
	protected EList<ElementDefinitionElement4> examples;

	/**
	 * The cached value of the '{@link #getMinValuex() <em>Min Valuex</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinValuex()
	 * @generated
	 * @ordered
	 */
	protected DataType minValuex;

	/**
	 * The cached value of the '{@link #getMaxValuex() <em>Max Valuex</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxValuex()
	 * @generated
	 * @ordered
	 */
	protected DataType maxValuex;

	/**
	 * The cached value of the '{@link #getMaxLength() <em>Max Length</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxLength()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.hl7.fhir.dataTypes.Integer maxLength;

	/**
	 * The cached value of the '{@link #getConditions() <em>Condition</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditions()
	 * @generated
	 * @ordered
	 */
	protected EList<Id> conditions;

	/**
	 * The cached value of the '{@link #getConstraints() <em>Constraint</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraints()
	 * @generated
	 * @ordered
	 */
	protected EList<ElementDefinitionElement5> constraints;

	/**
	 * The cached value of the '{@link #getMustSupport() <em>Must Support</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMustSupport()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.hl7.fhir.dataTypes.Boolean mustSupport;

	/**
	 * The cached value of the '{@link #getIsModifier() <em>Is Modifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsModifier()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.hl7.fhir.dataTypes.Boolean isModifier;

	/**
	 * The cached value of the '{@link #getIsModifierReason() <em>Is Modifier Reason</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsModifierReason()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.hl7.fhir.dataTypes.String isModifierReason;

	/**
	 * The cached value of the '{@link #getIsSummary() <em>Is Summary</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsSummary()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.hl7.fhir.dataTypes.Boolean isSummary;

	/**
	 * The cached value of the '{@link #getBinding() <em>Binding</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBinding()
	 * @generated
	 * @ordered
	 */
	protected ElementDefinitionElement6 binding;

	/**
	 * The cached value of the '{@link #getMappings() <em>Mapping</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMappings()
	 * @generated
	 * @ordered
	 */
	protected EList<ElementDefinitionElement7> mappings;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ElementDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataTypesPackage.Literals.ELEMENT_DEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.eclipse.mdht.hl7.fhir.dataTypes.String getPath() {
		return path;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPath(org.eclipse.mdht.hl7.fhir.dataTypes.String newPath, NotificationChain msgs) {
		org.eclipse.mdht.hl7.fhir.dataTypes.String oldPath = path;
		path = newPath;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DataTypesPackage.ELEMENT_DEFINITION__PATH, oldPath, newPath);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPath(org.eclipse.mdht.hl7.fhir.dataTypes.String newPath) {
		if (newPath != path) {
			NotificationChain msgs = null;
			if (path != null)
				msgs = ((InternalEObject)path).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.ELEMENT_DEFINITION__PATH, null, msgs);
			if (newPath != null)
				msgs = ((InternalEObject)newPath).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.ELEMENT_DEFINITION__PATH, null, msgs);
			msgs = basicSetPath(newPath, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataTypesPackage.ELEMENT_DEFINITION__PATH, newPath, newPath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Code> getRepresentations() {
		if (representations == null) {
			representations = new EObjectContainmentEList<Code>(Code.class, this, DataTypesPackage.ELEMENT_DEFINITION__REPRESENTATION);
		}
		return representations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.eclipse.mdht.hl7.fhir.dataTypes.String getSliceName() {
		return sliceName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSliceName(org.eclipse.mdht.hl7.fhir.dataTypes.String newSliceName, NotificationChain msgs) {
		org.eclipse.mdht.hl7.fhir.dataTypes.String oldSliceName = sliceName;
		sliceName = newSliceName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DataTypesPackage.ELEMENT_DEFINITION__SLICE_NAME, oldSliceName, newSliceName);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSliceName(org.eclipse.mdht.hl7.fhir.dataTypes.String newSliceName) {
		if (newSliceName != sliceName) {
			NotificationChain msgs = null;
			if (sliceName != null)
				msgs = ((InternalEObject)sliceName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.ELEMENT_DEFINITION__SLICE_NAME, null, msgs);
			if (newSliceName != null)
				msgs = ((InternalEObject)newSliceName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.ELEMENT_DEFINITION__SLICE_NAME, null, msgs);
			msgs = basicSetSliceName(newSliceName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataTypesPackage.ELEMENT_DEFINITION__SLICE_NAME, newSliceName, newSliceName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.eclipse.mdht.hl7.fhir.dataTypes.Boolean getSliceIsConstraining() {
		return sliceIsConstraining;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSliceIsConstraining(org.eclipse.mdht.hl7.fhir.dataTypes.Boolean newSliceIsConstraining, NotificationChain msgs) {
		org.eclipse.mdht.hl7.fhir.dataTypes.Boolean oldSliceIsConstraining = sliceIsConstraining;
		sliceIsConstraining = newSliceIsConstraining;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DataTypesPackage.ELEMENT_DEFINITION__SLICE_IS_CONSTRAINING, oldSliceIsConstraining, newSliceIsConstraining);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSliceIsConstraining(org.eclipse.mdht.hl7.fhir.dataTypes.Boolean newSliceIsConstraining) {
		if (newSliceIsConstraining != sliceIsConstraining) {
			NotificationChain msgs = null;
			if (sliceIsConstraining != null)
				msgs = ((InternalEObject)sliceIsConstraining).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.ELEMENT_DEFINITION__SLICE_IS_CONSTRAINING, null, msgs);
			if (newSliceIsConstraining != null)
				msgs = ((InternalEObject)newSliceIsConstraining).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.ELEMENT_DEFINITION__SLICE_IS_CONSTRAINING, null, msgs);
			msgs = basicSetSliceIsConstraining(newSliceIsConstraining, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataTypesPackage.ELEMENT_DEFINITION__SLICE_IS_CONSTRAINING, newSliceIsConstraining, newSliceIsConstraining));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.eclipse.mdht.hl7.fhir.dataTypes.String getLabel() {
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLabel(org.eclipse.mdht.hl7.fhir.dataTypes.String newLabel, NotificationChain msgs) {
		org.eclipse.mdht.hl7.fhir.dataTypes.String oldLabel = label;
		label = newLabel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DataTypesPackage.ELEMENT_DEFINITION__LABEL, oldLabel, newLabel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLabel(org.eclipse.mdht.hl7.fhir.dataTypes.String newLabel) {
		if (newLabel != label) {
			NotificationChain msgs = null;
			if (label != null)
				msgs = ((InternalEObject)label).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.ELEMENT_DEFINITION__LABEL, null, msgs);
			if (newLabel != null)
				msgs = ((InternalEObject)newLabel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.ELEMENT_DEFINITION__LABEL, null, msgs);
			msgs = basicSetLabel(newLabel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataTypesPackage.ELEMENT_DEFINITION__LABEL, newLabel, newLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Coding> getCodes() {
		if (codes == null) {
			codes = new EObjectContainmentEList<Coding>(Coding.class, this, DataTypesPackage.ELEMENT_DEFINITION__CODE);
		}
		return codes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ElementDefinitionElement1 getSlicing() {
		return slicing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSlicing(ElementDefinitionElement1 newSlicing, NotificationChain msgs) {
		ElementDefinitionElement1 oldSlicing = slicing;
		slicing = newSlicing;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DataTypesPackage.ELEMENT_DEFINITION__SLICING, oldSlicing, newSlicing);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSlicing(ElementDefinitionElement1 newSlicing) {
		if (newSlicing != slicing) {
			NotificationChain msgs = null;
			if (slicing != null)
				msgs = ((InternalEObject)slicing).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.ELEMENT_DEFINITION__SLICING, null, msgs);
			if (newSlicing != null)
				msgs = ((InternalEObject)newSlicing).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.ELEMENT_DEFINITION__SLICING, null, msgs);
			msgs = basicSetSlicing(newSlicing, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataTypesPackage.ELEMENT_DEFINITION__SLICING, newSlicing, newSlicing));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.eclipse.mdht.hl7.fhir.dataTypes.String getShort() {
		return short_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetShort(org.eclipse.mdht.hl7.fhir.dataTypes.String newShort, NotificationChain msgs) {
		org.eclipse.mdht.hl7.fhir.dataTypes.String oldShort = short_;
		short_ = newShort;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DataTypesPackage.ELEMENT_DEFINITION__SHORT, oldShort, newShort);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setShort(org.eclipse.mdht.hl7.fhir.dataTypes.String newShort) {
		if (newShort != short_) {
			NotificationChain msgs = null;
			if (short_ != null)
				msgs = ((InternalEObject)short_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.ELEMENT_DEFINITION__SHORT, null, msgs);
			if (newShort != null)
				msgs = ((InternalEObject)newShort).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.ELEMENT_DEFINITION__SHORT, null, msgs);
			msgs = basicSetShort(newShort, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataTypesPackage.ELEMENT_DEFINITION__SHORT, newShort, newShort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Markdown getDefinition() {
		return definition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefinition(Markdown newDefinition, NotificationChain msgs) {
		Markdown oldDefinition = definition;
		definition = newDefinition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DataTypesPackage.ELEMENT_DEFINITION__DEFINITION, oldDefinition, newDefinition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefinition(Markdown newDefinition) {
		if (newDefinition != definition) {
			NotificationChain msgs = null;
			if (definition != null)
				msgs = ((InternalEObject)definition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.ELEMENT_DEFINITION__DEFINITION, null, msgs);
			if (newDefinition != null)
				msgs = ((InternalEObject)newDefinition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.ELEMENT_DEFINITION__DEFINITION, null, msgs);
			msgs = basicSetDefinition(newDefinition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataTypesPackage.ELEMENT_DEFINITION__DEFINITION, newDefinition, newDefinition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Markdown getComment() {
		return comment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComment(Markdown newComment, NotificationChain msgs) {
		Markdown oldComment = comment;
		comment = newComment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DataTypesPackage.ELEMENT_DEFINITION__COMMENT, oldComment, newComment);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setComment(Markdown newComment) {
		if (newComment != comment) {
			NotificationChain msgs = null;
			if (comment != null)
				msgs = ((InternalEObject)comment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.ELEMENT_DEFINITION__COMMENT, null, msgs);
			if (newComment != null)
				msgs = ((InternalEObject)newComment).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.ELEMENT_DEFINITION__COMMENT, null, msgs);
			msgs = basicSetComment(newComment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataTypesPackage.ELEMENT_DEFINITION__COMMENT, newComment, newComment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Markdown getRequirements() {
		return requirements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRequirements(Markdown newRequirements, NotificationChain msgs) {
		Markdown oldRequirements = requirements;
		requirements = newRequirements;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DataTypesPackage.ELEMENT_DEFINITION__REQUIREMENTS, oldRequirements, newRequirements);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRequirements(Markdown newRequirements) {
		if (newRequirements != requirements) {
			NotificationChain msgs = null;
			if (requirements != null)
				msgs = ((InternalEObject)requirements).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.ELEMENT_DEFINITION__REQUIREMENTS, null, msgs);
			if (newRequirements != null)
				msgs = ((InternalEObject)newRequirements).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.ELEMENT_DEFINITION__REQUIREMENTS, null, msgs);
			msgs = basicSetRequirements(newRequirements, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataTypesPackage.ELEMENT_DEFINITION__REQUIREMENTS, newRequirements, newRequirements));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<org.eclipse.mdht.hl7.fhir.dataTypes.String> getAlias() {
		if (alias == null) {
			alias = new EObjectContainmentEList<org.eclipse.mdht.hl7.fhir.dataTypes.String>(org.eclipse.mdht.hl7.fhir.dataTypes.String.class, this, DataTypesPackage.ELEMENT_DEFINITION__ALIAS);
		}
		return alias;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnsignedInt getMin() {
		return min;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMin(UnsignedInt newMin, NotificationChain msgs) {
		UnsignedInt oldMin = min;
		min = newMin;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DataTypesPackage.ELEMENT_DEFINITION__MIN, oldMin, newMin);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMin(UnsignedInt newMin) {
		if (newMin != min) {
			NotificationChain msgs = null;
			if (min != null)
				msgs = ((InternalEObject)min).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.ELEMENT_DEFINITION__MIN, null, msgs);
			if (newMin != null)
				msgs = ((InternalEObject)newMin).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.ELEMENT_DEFINITION__MIN, null, msgs);
			msgs = basicSetMin(newMin, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataTypesPackage.ELEMENT_DEFINITION__MIN, newMin, newMin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.eclipse.mdht.hl7.fhir.dataTypes.String getMax() {
		return max;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMax(org.eclipse.mdht.hl7.fhir.dataTypes.String newMax, NotificationChain msgs) {
		org.eclipse.mdht.hl7.fhir.dataTypes.String oldMax = max;
		max = newMax;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DataTypesPackage.ELEMENT_DEFINITION__MAX, oldMax, newMax);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMax(org.eclipse.mdht.hl7.fhir.dataTypes.String newMax) {
		if (newMax != max) {
			NotificationChain msgs = null;
			if (max != null)
				msgs = ((InternalEObject)max).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.ELEMENT_DEFINITION__MAX, null, msgs);
			if (newMax != null)
				msgs = ((InternalEObject)newMax).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.ELEMENT_DEFINITION__MAX, null, msgs);
			msgs = basicSetMax(newMax, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataTypesPackage.ELEMENT_DEFINITION__MAX, newMax, newMax));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ElementDefinitionElement2 getBase() {
		return base;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBase(ElementDefinitionElement2 newBase, NotificationChain msgs) {
		ElementDefinitionElement2 oldBase = base;
		base = newBase;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DataTypesPackage.ELEMENT_DEFINITION__BASE, oldBase, newBase);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBase(ElementDefinitionElement2 newBase) {
		if (newBase != base) {
			NotificationChain msgs = null;
			if (base != null)
				msgs = ((InternalEObject)base).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.ELEMENT_DEFINITION__BASE, null, msgs);
			if (newBase != null)
				msgs = ((InternalEObject)newBase).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.ELEMENT_DEFINITION__BASE, null, msgs);
			msgs = basicSetBase(newBase, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataTypesPackage.ELEMENT_DEFINITION__BASE, newBase, newBase));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Uri getContentReference() {
		return contentReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContentReference(Uri newContentReference, NotificationChain msgs) {
		Uri oldContentReference = contentReference;
		contentReference = newContentReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DataTypesPackage.ELEMENT_DEFINITION__CONTENT_REFERENCE, oldContentReference, newContentReference);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContentReference(Uri newContentReference) {
		if (newContentReference != contentReference) {
			NotificationChain msgs = null;
			if (contentReference != null)
				msgs = ((InternalEObject)contentReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.ELEMENT_DEFINITION__CONTENT_REFERENCE, null, msgs);
			if (newContentReference != null)
				msgs = ((InternalEObject)newContentReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.ELEMENT_DEFINITION__CONTENT_REFERENCE, null, msgs);
			msgs = basicSetContentReference(newContentReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataTypesPackage.ELEMENT_DEFINITION__CONTENT_REFERENCE, newContentReference, newContentReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ElementDefinitionElement3> getTypes() {
		if (types == null) {
			types = new EObjectContainmentEList<ElementDefinitionElement3>(ElementDefinitionElement3.class, this, DataTypesPackage.ELEMENT_DEFINITION__TYPE);
		}
		return types;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataType getDefaultValuex() {
		return defaultValuex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefaultValuex(DataType newDefaultValuex, NotificationChain msgs) {
		DataType oldDefaultValuex = defaultValuex;
		defaultValuex = newDefaultValuex;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DataTypesPackage.ELEMENT_DEFINITION__DEFAULT_VALUEX, oldDefaultValuex, newDefaultValuex);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefaultValuex(DataType newDefaultValuex) {
		if (newDefaultValuex != defaultValuex) {
			NotificationChain msgs = null;
			if (defaultValuex != null)
				msgs = ((InternalEObject)defaultValuex).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.ELEMENT_DEFINITION__DEFAULT_VALUEX, null, msgs);
			if (newDefaultValuex != null)
				msgs = ((InternalEObject)newDefaultValuex).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.ELEMENT_DEFINITION__DEFAULT_VALUEX, null, msgs);
			msgs = basicSetDefaultValuex(newDefaultValuex, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataTypesPackage.ELEMENT_DEFINITION__DEFAULT_VALUEX, newDefaultValuex, newDefaultValuex));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Markdown getMeaningWhenMissing() {
		return meaningWhenMissing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMeaningWhenMissing(Markdown newMeaningWhenMissing, NotificationChain msgs) {
		Markdown oldMeaningWhenMissing = meaningWhenMissing;
		meaningWhenMissing = newMeaningWhenMissing;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DataTypesPackage.ELEMENT_DEFINITION__MEANING_WHEN_MISSING, oldMeaningWhenMissing, newMeaningWhenMissing);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMeaningWhenMissing(Markdown newMeaningWhenMissing) {
		if (newMeaningWhenMissing != meaningWhenMissing) {
			NotificationChain msgs = null;
			if (meaningWhenMissing != null)
				msgs = ((InternalEObject)meaningWhenMissing).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.ELEMENT_DEFINITION__MEANING_WHEN_MISSING, null, msgs);
			if (newMeaningWhenMissing != null)
				msgs = ((InternalEObject)newMeaningWhenMissing).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.ELEMENT_DEFINITION__MEANING_WHEN_MISSING, null, msgs);
			msgs = basicSetMeaningWhenMissing(newMeaningWhenMissing, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataTypesPackage.ELEMENT_DEFINITION__MEANING_WHEN_MISSING, newMeaningWhenMissing, newMeaningWhenMissing));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.eclipse.mdht.hl7.fhir.dataTypes.String getOrderMeaning() {
		return orderMeaning;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOrderMeaning(org.eclipse.mdht.hl7.fhir.dataTypes.String newOrderMeaning, NotificationChain msgs) {
		org.eclipse.mdht.hl7.fhir.dataTypes.String oldOrderMeaning = orderMeaning;
		orderMeaning = newOrderMeaning;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DataTypesPackage.ELEMENT_DEFINITION__ORDER_MEANING, oldOrderMeaning, newOrderMeaning);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrderMeaning(org.eclipse.mdht.hl7.fhir.dataTypes.String newOrderMeaning) {
		if (newOrderMeaning != orderMeaning) {
			NotificationChain msgs = null;
			if (orderMeaning != null)
				msgs = ((InternalEObject)orderMeaning).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.ELEMENT_DEFINITION__ORDER_MEANING, null, msgs);
			if (newOrderMeaning != null)
				msgs = ((InternalEObject)newOrderMeaning).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.ELEMENT_DEFINITION__ORDER_MEANING, null, msgs);
			msgs = basicSetOrderMeaning(newOrderMeaning, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataTypesPackage.ELEMENT_DEFINITION__ORDER_MEANING, newOrderMeaning, newOrderMeaning));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataType getFixedx() {
		return fixedx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFixedx(DataType newFixedx, NotificationChain msgs) {
		DataType oldFixedx = fixedx;
		fixedx = newFixedx;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DataTypesPackage.ELEMENT_DEFINITION__FIXEDX, oldFixedx, newFixedx);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFixedx(DataType newFixedx) {
		if (newFixedx != fixedx) {
			NotificationChain msgs = null;
			if (fixedx != null)
				msgs = ((InternalEObject)fixedx).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.ELEMENT_DEFINITION__FIXEDX, null, msgs);
			if (newFixedx != null)
				msgs = ((InternalEObject)newFixedx).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.ELEMENT_DEFINITION__FIXEDX, null, msgs);
			msgs = basicSetFixedx(newFixedx, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataTypesPackage.ELEMENT_DEFINITION__FIXEDX, newFixedx, newFixedx));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataType getPatternx() {
		return patternx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPatternx(DataType newPatternx, NotificationChain msgs) {
		DataType oldPatternx = patternx;
		patternx = newPatternx;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DataTypesPackage.ELEMENT_DEFINITION__PATTERNX, oldPatternx, newPatternx);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPatternx(DataType newPatternx) {
		if (newPatternx != patternx) {
			NotificationChain msgs = null;
			if (patternx != null)
				msgs = ((InternalEObject)patternx).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.ELEMENT_DEFINITION__PATTERNX, null, msgs);
			if (newPatternx != null)
				msgs = ((InternalEObject)newPatternx).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.ELEMENT_DEFINITION__PATTERNX, null, msgs);
			msgs = basicSetPatternx(newPatternx, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataTypesPackage.ELEMENT_DEFINITION__PATTERNX, newPatternx, newPatternx));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ElementDefinitionElement4> getExamples() {
		if (examples == null) {
			examples = new EObjectContainmentEList<ElementDefinitionElement4>(ElementDefinitionElement4.class, this, DataTypesPackage.ELEMENT_DEFINITION__EXAMPLE);
		}
		return examples;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataType getMinValuex() {
		return minValuex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMinValuex(DataType newMinValuex, NotificationChain msgs) {
		DataType oldMinValuex = minValuex;
		minValuex = newMinValuex;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DataTypesPackage.ELEMENT_DEFINITION__MIN_VALUEX, oldMinValuex, newMinValuex);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMinValuex(DataType newMinValuex) {
		if (newMinValuex != minValuex) {
			NotificationChain msgs = null;
			if (minValuex != null)
				msgs = ((InternalEObject)minValuex).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.ELEMENT_DEFINITION__MIN_VALUEX, null, msgs);
			if (newMinValuex != null)
				msgs = ((InternalEObject)newMinValuex).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.ELEMENT_DEFINITION__MIN_VALUEX, null, msgs);
			msgs = basicSetMinValuex(newMinValuex, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataTypesPackage.ELEMENT_DEFINITION__MIN_VALUEX, newMinValuex, newMinValuex));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataType getMaxValuex() {
		return maxValuex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMaxValuex(DataType newMaxValuex, NotificationChain msgs) {
		DataType oldMaxValuex = maxValuex;
		maxValuex = newMaxValuex;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DataTypesPackage.ELEMENT_DEFINITION__MAX_VALUEX, oldMaxValuex, newMaxValuex);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxValuex(DataType newMaxValuex) {
		if (newMaxValuex != maxValuex) {
			NotificationChain msgs = null;
			if (maxValuex != null)
				msgs = ((InternalEObject)maxValuex).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.ELEMENT_DEFINITION__MAX_VALUEX, null, msgs);
			if (newMaxValuex != null)
				msgs = ((InternalEObject)newMaxValuex).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.ELEMENT_DEFINITION__MAX_VALUEX, null, msgs);
			msgs = basicSetMaxValuex(newMaxValuex, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataTypesPackage.ELEMENT_DEFINITION__MAX_VALUEX, newMaxValuex, newMaxValuex));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.eclipse.mdht.hl7.fhir.dataTypes.Integer getMaxLength() {
		return maxLength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMaxLength(org.eclipse.mdht.hl7.fhir.dataTypes.Integer newMaxLength, NotificationChain msgs) {
		org.eclipse.mdht.hl7.fhir.dataTypes.Integer oldMaxLength = maxLength;
		maxLength = newMaxLength;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DataTypesPackage.ELEMENT_DEFINITION__MAX_LENGTH, oldMaxLength, newMaxLength);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxLength(org.eclipse.mdht.hl7.fhir.dataTypes.Integer newMaxLength) {
		if (newMaxLength != maxLength) {
			NotificationChain msgs = null;
			if (maxLength != null)
				msgs = ((InternalEObject)maxLength).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.ELEMENT_DEFINITION__MAX_LENGTH, null, msgs);
			if (newMaxLength != null)
				msgs = ((InternalEObject)newMaxLength).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.ELEMENT_DEFINITION__MAX_LENGTH, null, msgs);
			msgs = basicSetMaxLength(newMaxLength, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataTypesPackage.ELEMENT_DEFINITION__MAX_LENGTH, newMaxLength, newMaxLength));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Id> getConditions() {
		if (conditions == null) {
			conditions = new EObjectContainmentEList<Id>(Id.class, this, DataTypesPackage.ELEMENT_DEFINITION__CONDITION);
		}
		return conditions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ElementDefinitionElement5> getConstraints() {
		if (constraints == null) {
			constraints = new EObjectContainmentEList<ElementDefinitionElement5>(ElementDefinitionElement5.class, this, DataTypesPackage.ELEMENT_DEFINITION__CONSTRAINT);
		}
		return constraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.eclipse.mdht.hl7.fhir.dataTypes.Boolean getMustSupport() {
		return mustSupport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMustSupport(org.eclipse.mdht.hl7.fhir.dataTypes.Boolean newMustSupport, NotificationChain msgs) {
		org.eclipse.mdht.hl7.fhir.dataTypes.Boolean oldMustSupport = mustSupport;
		mustSupport = newMustSupport;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DataTypesPackage.ELEMENT_DEFINITION__MUST_SUPPORT, oldMustSupport, newMustSupport);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMustSupport(org.eclipse.mdht.hl7.fhir.dataTypes.Boolean newMustSupport) {
		if (newMustSupport != mustSupport) {
			NotificationChain msgs = null;
			if (mustSupport != null)
				msgs = ((InternalEObject)mustSupport).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.ELEMENT_DEFINITION__MUST_SUPPORT, null, msgs);
			if (newMustSupport != null)
				msgs = ((InternalEObject)newMustSupport).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.ELEMENT_DEFINITION__MUST_SUPPORT, null, msgs);
			msgs = basicSetMustSupport(newMustSupport, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataTypesPackage.ELEMENT_DEFINITION__MUST_SUPPORT, newMustSupport, newMustSupport));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.eclipse.mdht.hl7.fhir.dataTypes.Boolean getIsModifier() {
		return isModifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIsModifier(org.eclipse.mdht.hl7.fhir.dataTypes.Boolean newIsModifier, NotificationChain msgs) {
		org.eclipse.mdht.hl7.fhir.dataTypes.Boolean oldIsModifier = isModifier;
		isModifier = newIsModifier;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DataTypesPackage.ELEMENT_DEFINITION__IS_MODIFIER, oldIsModifier, newIsModifier);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsModifier(org.eclipse.mdht.hl7.fhir.dataTypes.Boolean newIsModifier) {
		if (newIsModifier != isModifier) {
			NotificationChain msgs = null;
			if (isModifier != null)
				msgs = ((InternalEObject)isModifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.ELEMENT_DEFINITION__IS_MODIFIER, null, msgs);
			if (newIsModifier != null)
				msgs = ((InternalEObject)newIsModifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.ELEMENT_DEFINITION__IS_MODIFIER, null, msgs);
			msgs = basicSetIsModifier(newIsModifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataTypesPackage.ELEMENT_DEFINITION__IS_MODIFIER, newIsModifier, newIsModifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.eclipse.mdht.hl7.fhir.dataTypes.String getIsModifierReason() {
		return isModifierReason;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIsModifierReason(org.eclipse.mdht.hl7.fhir.dataTypes.String newIsModifierReason, NotificationChain msgs) {
		org.eclipse.mdht.hl7.fhir.dataTypes.String oldIsModifierReason = isModifierReason;
		isModifierReason = newIsModifierReason;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DataTypesPackage.ELEMENT_DEFINITION__IS_MODIFIER_REASON, oldIsModifierReason, newIsModifierReason);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsModifierReason(org.eclipse.mdht.hl7.fhir.dataTypes.String newIsModifierReason) {
		if (newIsModifierReason != isModifierReason) {
			NotificationChain msgs = null;
			if (isModifierReason != null)
				msgs = ((InternalEObject)isModifierReason).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.ELEMENT_DEFINITION__IS_MODIFIER_REASON, null, msgs);
			if (newIsModifierReason != null)
				msgs = ((InternalEObject)newIsModifierReason).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.ELEMENT_DEFINITION__IS_MODIFIER_REASON, null, msgs);
			msgs = basicSetIsModifierReason(newIsModifierReason, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataTypesPackage.ELEMENT_DEFINITION__IS_MODIFIER_REASON, newIsModifierReason, newIsModifierReason));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.eclipse.mdht.hl7.fhir.dataTypes.Boolean getIsSummary() {
		return isSummary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIsSummary(org.eclipse.mdht.hl7.fhir.dataTypes.Boolean newIsSummary, NotificationChain msgs) {
		org.eclipse.mdht.hl7.fhir.dataTypes.Boolean oldIsSummary = isSummary;
		isSummary = newIsSummary;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DataTypesPackage.ELEMENT_DEFINITION__IS_SUMMARY, oldIsSummary, newIsSummary);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsSummary(org.eclipse.mdht.hl7.fhir.dataTypes.Boolean newIsSummary) {
		if (newIsSummary != isSummary) {
			NotificationChain msgs = null;
			if (isSummary != null)
				msgs = ((InternalEObject)isSummary).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.ELEMENT_DEFINITION__IS_SUMMARY, null, msgs);
			if (newIsSummary != null)
				msgs = ((InternalEObject)newIsSummary).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.ELEMENT_DEFINITION__IS_SUMMARY, null, msgs);
			msgs = basicSetIsSummary(newIsSummary, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataTypesPackage.ELEMENT_DEFINITION__IS_SUMMARY, newIsSummary, newIsSummary));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ElementDefinitionElement6 getBinding() {
		return binding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBinding(ElementDefinitionElement6 newBinding, NotificationChain msgs) {
		ElementDefinitionElement6 oldBinding = binding;
		binding = newBinding;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DataTypesPackage.ELEMENT_DEFINITION__BINDING, oldBinding, newBinding);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBinding(ElementDefinitionElement6 newBinding) {
		if (newBinding != binding) {
			NotificationChain msgs = null;
			if (binding != null)
				msgs = ((InternalEObject)binding).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.ELEMENT_DEFINITION__BINDING, null, msgs);
			if (newBinding != null)
				msgs = ((InternalEObject)newBinding).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.ELEMENT_DEFINITION__BINDING, null, msgs);
			msgs = basicSetBinding(newBinding, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataTypesPackage.ELEMENT_DEFINITION__BINDING, newBinding, newBinding));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ElementDefinitionElement7> getMappings() {
		if (mappings == null) {
			mappings = new EObjectContainmentEList<ElementDefinitionElement7>(ElementDefinitionElement7.class, this, DataTypesPackage.ELEMENT_DEFINITION__MAPPING);
		}
		return mappings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DataTypesPackage.ELEMENT_DEFINITION__PATH:
				return basicSetPath(null, msgs);
			case DataTypesPackage.ELEMENT_DEFINITION__REPRESENTATION:
				return ((InternalEList<?>)getRepresentations()).basicRemove(otherEnd, msgs);
			case DataTypesPackage.ELEMENT_DEFINITION__SLICE_NAME:
				return basicSetSliceName(null, msgs);
			case DataTypesPackage.ELEMENT_DEFINITION__SLICE_IS_CONSTRAINING:
				return basicSetSliceIsConstraining(null, msgs);
			case DataTypesPackage.ELEMENT_DEFINITION__LABEL:
				return basicSetLabel(null, msgs);
			case DataTypesPackage.ELEMENT_DEFINITION__CODE:
				return ((InternalEList<?>)getCodes()).basicRemove(otherEnd, msgs);
			case DataTypesPackage.ELEMENT_DEFINITION__SLICING:
				return basicSetSlicing(null, msgs);
			case DataTypesPackage.ELEMENT_DEFINITION__SHORT:
				return basicSetShort(null, msgs);
			case DataTypesPackage.ELEMENT_DEFINITION__DEFINITION:
				return basicSetDefinition(null, msgs);
			case DataTypesPackage.ELEMENT_DEFINITION__COMMENT:
				return basicSetComment(null, msgs);
			case DataTypesPackage.ELEMENT_DEFINITION__REQUIREMENTS:
				return basicSetRequirements(null, msgs);
			case DataTypesPackage.ELEMENT_DEFINITION__ALIAS:
				return ((InternalEList<?>)getAlias()).basicRemove(otherEnd, msgs);
			case DataTypesPackage.ELEMENT_DEFINITION__MIN:
				return basicSetMin(null, msgs);
			case DataTypesPackage.ELEMENT_DEFINITION__MAX:
				return basicSetMax(null, msgs);
			case DataTypesPackage.ELEMENT_DEFINITION__BASE:
				return basicSetBase(null, msgs);
			case DataTypesPackage.ELEMENT_DEFINITION__CONTENT_REFERENCE:
				return basicSetContentReference(null, msgs);
			case DataTypesPackage.ELEMENT_DEFINITION__TYPE:
				return ((InternalEList<?>)getTypes()).basicRemove(otherEnd, msgs);
			case DataTypesPackage.ELEMENT_DEFINITION__DEFAULT_VALUEX:
				return basicSetDefaultValuex(null, msgs);
			case DataTypesPackage.ELEMENT_DEFINITION__MEANING_WHEN_MISSING:
				return basicSetMeaningWhenMissing(null, msgs);
			case DataTypesPackage.ELEMENT_DEFINITION__ORDER_MEANING:
				return basicSetOrderMeaning(null, msgs);
			case DataTypesPackage.ELEMENT_DEFINITION__FIXEDX:
				return basicSetFixedx(null, msgs);
			case DataTypesPackage.ELEMENT_DEFINITION__PATTERNX:
				return basicSetPatternx(null, msgs);
			case DataTypesPackage.ELEMENT_DEFINITION__EXAMPLE:
				return ((InternalEList<?>)getExamples()).basicRemove(otherEnd, msgs);
			case DataTypesPackage.ELEMENT_DEFINITION__MIN_VALUEX:
				return basicSetMinValuex(null, msgs);
			case DataTypesPackage.ELEMENT_DEFINITION__MAX_VALUEX:
				return basicSetMaxValuex(null, msgs);
			case DataTypesPackage.ELEMENT_DEFINITION__MAX_LENGTH:
				return basicSetMaxLength(null, msgs);
			case DataTypesPackage.ELEMENT_DEFINITION__CONDITION:
				return ((InternalEList<?>)getConditions()).basicRemove(otherEnd, msgs);
			case DataTypesPackage.ELEMENT_DEFINITION__CONSTRAINT:
				return ((InternalEList<?>)getConstraints()).basicRemove(otherEnd, msgs);
			case DataTypesPackage.ELEMENT_DEFINITION__MUST_SUPPORT:
				return basicSetMustSupport(null, msgs);
			case DataTypesPackage.ELEMENT_DEFINITION__IS_MODIFIER:
				return basicSetIsModifier(null, msgs);
			case DataTypesPackage.ELEMENT_DEFINITION__IS_MODIFIER_REASON:
				return basicSetIsModifierReason(null, msgs);
			case DataTypesPackage.ELEMENT_DEFINITION__IS_SUMMARY:
				return basicSetIsSummary(null, msgs);
			case DataTypesPackage.ELEMENT_DEFINITION__BINDING:
				return basicSetBinding(null, msgs);
			case DataTypesPackage.ELEMENT_DEFINITION__MAPPING:
				return ((InternalEList<?>)getMappings()).basicRemove(otherEnd, msgs);
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
			case DataTypesPackage.ELEMENT_DEFINITION__PATH:
				return getPath();
			case DataTypesPackage.ELEMENT_DEFINITION__REPRESENTATION:
				return getRepresentations();
			case DataTypesPackage.ELEMENT_DEFINITION__SLICE_NAME:
				return getSliceName();
			case DataTypesPackage.ELEMENT_DEFINITION__SLICE_IS_CONSTRAINING:
				return getSliceIsConstraining();
			case DataTypesPackage.ELEMENT_DEFINITION__LABEL:
				return getLabel();
			case DataTypesPackage.ELEMENT_DEFINITION__CODE:
				return getCodes();
			case DataTypesPackage.ELEMENT_DEFINITION__SLICING:
				return getSlicing();
			case DataTypesPackage.ELEMENT_DEFINITION__SHORT:
				return getShort();
			case DataTypesPackage.ELEMENT_DEFINITION__DEFINITION:
				return getDefinition();
			case DataTypesPackage.ELEMENT_DEFINITION__COMMENT:
				return getComment();
			case DataTypesPackage.ELEMENT_DEFINITION__REQUIREMENTS:
				return getRequirements();
			case DataTypesPackage.ELEMENT_DEFINITION__ALIAS:
				return getAlias();
			case DataTypesPackage.ELEMENT_DEFINITION__MIN:
				return getMin();
			case DataTypesPackage.ELEMENT_DEFINITION__MAX:
				return getMax();
			case DataTypesPackage.ELEMENT_DEFINITION__BASE:
				return getBase();
			case DataTypesPackage.ELEMENT_DEFINITION__CONTENT_REFERENCE:
				return getContentReference();
			case DataTypesPackage.ELEMENT_DEFINITION__TYPE:
				return getTypes();
			case DataTypesPackage.ELEMENT_DEFINITION__DEFAULT_VALUEX:
				return getDefaultValuex();
			case DataTypesPackage.ELEMENT_DEFINITION__MEANING_WHEN_MISSING:
				return getMeaningWhenMissing();
			case DataTypesPackage.ELEMENT_DEFINITION__ORDER_MEANING:
				return getOrderMeaning();
			case DataTypesPackage.ELEMENT_DEFINITION__FIXEDX:
				return getFixedx();
			case DataTypesPackage.ELEMENT_DEFINITION__PATTERNX:
				return getPatternx();
			case DataTypesPackage.ELEMENT_DEFINITION__EXAMPLE:
				return getExamples();
			case DataTypesPackage.ELEMENT_DEFINITION__MIN_VALUEX:
				return getMinValuex();
			case DataTypesPackage.ELEMENT_DEFINITION__MAX_VALUEX:
				return getMaxValuex();
			case DataTypesPackage.ELEMENT_DEFINITION__MAX_LENGTH:
				return getMaxLength();
			case DataTypesPackage.ELEMENT_DEFINITION__CONDITION:
				return getConditions();
			case DataTypesPackage.ELEMENT_DEFINITION__CONSTRAINT:
				return getConstraints();
			case DataTypesPackage.ELEMENT_DEFINITION__MUST_SUPPORT:
				return getMustSupport();
			case DataTypesPackage.ELEMENT_DEFINITION__IS_MODIFIER:
				return getIsModifier();
			case DataTypesPackage.ELEMENT_DEFINITION__IS_MODIFIER_REASON:
				return getIsModifierReason();
			case DataTypesPackage.ELEMENT_DEFINITION__IS_SUMMARY:
				return getIsSummary();
			case DataTypesPackage.ELEMENT_DEFINITION__BINDING:
				return getBinding();
			case DataTypesPackage.ELEMENT_DEFINITION__MAPPING:
				return getMappings();
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
			case DataTypesPackage.ELEMENT_DEFINITION__PATH:
				setPath((org.eclipse.mdht.hl7.fhir.dataTypes.String)newValue);
				return;
			case DataTypesPackage.ELEMENT_DEFINITION__REPRESENTATION:
				getRepresentations().clear();
				getRepresentations().addAll((Collection<? extends Code>)newValue);
				return;
			case DataTypesPackage.ELEMENT_DEFINITION__SLICE_NAME:
				setSliceName((org.eclipse.mdht.hl7.fhir.dataTypes.String)newValue);
				return;
			case DataTypesPackage.ELEMENT_DEFINITION__SLICE_IS_CONSTRAINING:
				setSliceIsConstraining((org.eclipse.mdht.hl7.fhir.dataTypes.Boolean)newValue);
				return;
			case DataTypesPackage.ELEMENT_DEFINITION__LABEL:
				setLabel((org.eclipse.mdht.hl7.fhir.dataTypes.String)newValue);
				return;
			case DataTypesPackage.ELEMENT_DEFINITION__CODE:
				getCodes().clear();
				getCodes().addAll((Collection<? extends Coding>)newValue);
				return;
			case DataTypesPackage.ELEMENT_DEFINITION__SLICING:
				setSlicing((ElementDefinitionElement1)newValue);
				return;
			case DataTypesPackage.ELEMENT_DEFINITION__SHORT:
				setShort((org.eclipse.mdht.hl7.fhir.dataTypes.String)newValue);
				return;
			case DataTypesPackage.ELEMENT_DEFINITION__DEFINITION:
				setDefinition((Markdown)newValue);
				return;
			case DataTypesPackage.ELEMENT_DEFINITION__COMMENT:
				setComment((Markdown)newValue);
				return;
			case DataTypesPackage.ELEMENT_DEFINITION__REQUIREMENTS:
				setRequirements((Markdown)newValue);
				return;
			case DataTypesPackage.ELEMENT_DEFINITION__ALIAS:
				getAlias().clear();
				getAlias().addAll((Collection<? extends org.eclipse.mdht.hl7.fhir.dataTypes.String>)newValue);
				return;
			case DataTypesPackage.ELEMENT_DEFINITION__MIN:
				setMin((UnsignedInt)newValue);
				return;
			case DataTypesPackage.ELEMENT_DEFINITION__MAX:
				setMax((org.eclipse.mdht.hl7.fhir.dataTypes.String)newValue);
				return;
			case DataTypesPackage.ELEMENT_DEFINITION__BASE:
				setBase((ElementDefinitionElement2)newValue);
				return;
			case DataTypesPackage.ELEMENT_DEFINITION__CONTENT_REFERENCE:
				setContentReference((Uri)newValue);
				return;
			case DataTypesPackage.ELEMENT_DEFINITION__TYPE:
				getTypes().clear();
				getTypes().addAll((Collection<? extends ElementDefinitionElement3>)newValue);
				return;
			case DataTypesPackage.ELEMENT_DEFINITION__DEFAULT_VALUEX:
				setDefaultValuex((DataType)newValue);
				return;
			case DataTypesPackage.ELEMENT_DEFINITION__MEANING_WHEN_MISSING:
				setMeaningWhenMissing((Markdown)newValue);
				return;
			case DataTypesPackage.ELEMENT_DEFINITION__ORDER_MEANING:
				setOrderMeaning((org.eclipse.mdht.hl7.fhir.dataTypes.String)newValue);
				return;
			case DataTypesPackage.ELEMENT_DEFINITION__FIXEDX:
				setFixedx((DataType)newValue);
				return;
			case DataTypesPackage.ELEMENT_DEFINITION__PATTERNX:
				setPatternx((DataType)newValue);
				return;
			case DataTypesPackage.ELEMENT_DEFINITION__EXAMPLE:
				getExamples().clear();
				getExamples().addAll((Collection<? extends ElementDefinitionElement4>)newValue);
				return;
			case DataTypesPackage.ELEMENT_DEFINITION__MIN_VALUEX:
				setMinValuex((DataType)newValue);
				return;
			case DataTypesPackage.ELEMENT_DEFINITION__MAX_VALUEX:
				setMaxValuex((DataType)newValue);
				return;
			case DataTypesPackage.ELEMENT_DEFINITION__MAX_LENGTH:
				setMaxLength((org.eclipse.mdht.hl7.fhir.dataTypes.Integer)newValue);
				return;
			case DataTypesPackage.ELEMENT_DEFINITION__CONDITION:
				getConditions().clear();
				getConditions().addAll((Collection<? extends Id>)newValue);
				return;
			case DataTypesPackage.ELEMENT_DEFINITION__CONSTRAINT:
				getConstraints().clear();
				getConstraints().addAll((Collection<? extends ElementDefinitionElement5>)newValue);
				return;
			case DataTypesPackage.ELEMENT_DEFINITION__MUST_SUPPORT:
				setMustSupport((org.eclipse.mdht.hl7.fhir.dataTypes.Boolean)newValue);
				return;
			case DataTypesPackage.ELEMENT_DEFINITION__IS_MODIFIER:
				setIsModifier((org.eclipse.mdht.hl7.fhir.dataTypes.Boolean)newValue);
				return;
			case DataTypesPackage.ELEMENT_DEFINITION__IS_MODIFIER_REASON:
				setIsModifierReason((org.eclipse.mdht.hl7.fhir.dataTypes.String)newValue);
				return;
			case DataTypesPackage.ELEMENT_DEFINITION__IS_SUMMARY:
				setIsSummary((org.eclipse.mdht.hl7.fhir.dataTypes.Boolean)newValue);
				return;
			case DataTypesPackage.ELEMENT_DEFINITION__BINDING:
				setBinding((ElementDefinitionElement6)newValue);
				return;
			case DataTypesPackage.ELEMENT_DEFINITION__MAPPING:
				getMappings().clear();
				getMappings().addAll((Collection<? extends ElementDefinitionElement7>)newValue);
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
			case DataTypesPackage.ELEMENT_DEFINITION__PATH:
				setPath((org.eclipse.mdht.hl7.fhir.dataTypes.String)null);
				return;
			case DataTypesPackage.ELEMENT_DEFINITION__REPRESENTATION:
				getRepresentations().clear();
				return;
			case DataTypesPackage.ELEMENT_DEFINITION__SLICE_NAME:
				setSliceName((org.eclipse.mdht.hl7.fhir.dataTypes.String)null);
				return;
			case DataTypesPackage.ELEMENT_DEFINITION__SLICE_IS_CONSTRAINING:
				setSliceIsConstraining((org.eclipse.mdht.hl7.fhir.dataTypes.Boolean)null);
				return;
			case DataTypesPackage.ELEMENT_DEFINITION__LABEL:
				setLabel((org.eclipse.mdht.hl7.fhir.dataTypes.String)null);
				return;
			case DataTypesPackage.ELEMENT_DEFINITION__CODE:
				getCodes().clear();
				return;
			case DataTypesPackage.ELEMENT_DEFINITION__SLICING:
				setSlicing((ElementDefinitionElement1)null);
				return;
			case DataTypesPackage.ELEMENT_DEFINITION__SHORT:
				setShort((org.eclipse.mdht.hl7.fhir.dataTypes.String)null);
				return;
			case DataTypesPackage.ELEMENT_DEFINITION__DEFINITION:
				setDefinition((Markdown)null);
				return;
			case DataTypesPackage.ELEMENT_DEFINITION__COMMENT:
				setComment((Markdown)null);
				return;
			case DataTypesPackage.ELEMENT_DEFINITION__REQUIREMENTS:
				setRequirements((Markdown)null);
				return;
			case DataTypesPackage.ELEMENT_DEFINITION__ALIAS:
				getAlias().clear();
				return;
			case DataTypesPackage.ELEMENT_DEFINITION__MIN:
				setMin((UnsignedInt)null);
				return;
			case DataTypesPackage.ELEMENT_DEFINITION__MAX:
				setMax((org.eclipse.mdht.hl7.fhir.dataTypes.String)null);
				return;
			case DataTypesPackage.ELEMENT_DEFINITION__BASE:
				setBase((ElementDefinitionElement2)null);
				return;
			case DataTypesPackage.ELEMENT_DEFINITION__CONTENT_REFERENCE:
				setContentReference((Uri)null);
				return;
			case DataTypesPackage.ELEMENT_DEFINITION__TYPE:
				getTypes().clear();
				return;
			case DataTypesPackage.ELEMENT_DEFINITION__DEFAULT_VALUEX:
				setDefaultValuex((DataType)null);
				return;
			case DataTypesPackage.ELEMENT_DEFINITION__MEANING_WHEN_MISSING:
				setMeaningWhenMissing((Markdown)null);
				return;
			case DataTypesPackage.ELEMENT_DEFINITION__ORDER_MEANING:
				setOrderMeaning((org.eclipse.mdht.hl7.fhir.dataTypes.String)null);
				return;
			case DataTypesPackage.ELEMENT_DEFINITION__FIXEDX:
				setFixedx((DataType)null);
				return;
			case DataTypesPackage.ELEMENT_DEFINITION__PATTERNX:
				setPatternx((DataType)null);
				return;
			case DataTypesPackage.ELEMENT_DEFINITION__EXAMPLE:
				getExamples().clear();
				return;
			case DataTypesPackage.ELEMENT_DEFINITION__MIN_VALUEX:
				setMinValuex((DataType)null);
				return;
			case DataTypesPackage.ELEMENT_DEFINITION__MAX_VALUEX:
				setMaxValuex((DataType)null);
				return;
			case DataTypesPackage.ELEMENT_DEFINITION__MAX_LENGTH:
				setMaxLength((org.eclipse.mdht.hl7.fhir.dataTypes.Integer)null);
				return;
			case DataTypesPackage.ELEMENT_DEFINITION__CONDITION:
				getConditions().clear();
				return;
			case DataTypesPackage.ELEMENT_DEFINITION__CONSTRAINT:
				getConstraints().clear();
				return;
			case DataTypesPackage.ELEMENT_DEFINITION__MUST_SUPPORT:
				setMustSupport((org.eclipse.mdht.hl7.fhir.dataTypes.Boolean)null);
				return;
			case DataTypesPackage.ELEMENT_DEFINITION__IS_MODIFIER:
				setIsModifier((org.eclipse.mdht.hl7.fhir.dataTypes.Boolean)null);
				return;
			case DataTypesPackage.ELEMENT_DEFINITION__IS_MODIFIER_REASON:
				setIsModifierReason((org.eclipse.mdht.hl7.fhir.dataTypes.String)null);
				return;
			case DataTypesPackage.ELEMENT_DEFINITION__IS_SUMMARY:
				setIsSummary((org.eclipse.mdht.hl7.fhir.dataTypes.Boolean)null);
				return;
			case DataTypesPackage.ELEMENT_DEFINITION__BINDING:
				setBinding((ElementDefinitionElement6)null);
				return;
			case DataTypesPackage.ELEMENT_DEFINITION__MAPPING:
				getMappings().clear();
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
			case DataTypesPackage.ELEMENT_DEFINITION__PATH:
				return path != null;
			case DataTypesPackage.ELEMENT_DEFINITION__REPRESENTATION:
				return representations != null && !representations.isEmpty();
			case DataTypesPackage.ELEMENT_DEFINITION__SLICE_NAME:
				return sliceName != null;
			case DataTypesPackage.ELEMENT_DEFINITION__SLICE_IS_CONSTRAINING:
				return sliceIsConstraining != null;
			case DataTypesPackage.ELEMENT_DEFINITION__LABEL:
				return label != null;
			case DataTypesPackage.ELEMENT_DEFINITION__CODE:
				return codes != null && !codes.isEmpty();
			case DataTypesPackage.ELEMENT_DEFINITION__SLICING:
				return slicing != null;
			case DataTypesPackage.ELEMENT_DEFINITION__SHORT:
				return short_ != null;
			case DataTypesPackage.ELEMENT_DEFINITION__DEFINITION:
				return definition != null;
			case DataTypesPackage.ELEMENT_DEFINITION__COMMENT:
				return comment != null;
			case DataTypesPackage.ELEMENT_DEFINITION__REQUIREMENTS:
				return requirements != null;
			case DataTypesPackage.ELEMENT_DEFINITION__ALIAS:
				return alias != null && !alias.isEmpty();
			case DataTypesPackage.ELEMENT_DEFINITION__MIN:
				return min != null;
			case DataTypesPackage.ELEMENT_DEFINITION__MAX:
				return max != null;
			case DataTypesPackage.ELEMENT_DEFINITION__BASE:
				return base != null;
			case DataTypesPackage.ELEMENT_DEFINITION__CONTENT_REFERENCE:
				return contentReference != null;
			case DataTypesPackage.ELEMENT_DEFINITION__TYPE:
				return types != null && !types.isEmpty();
			case DataTypesPackage.ELEMENT_DEFINITION__DEFAULT_VALUEX:
				return defaultValuex != null;
			case DataTypesPackage.ELEMENT_DEFINITION__MEANING_WHEN_MISSING:
				return meaningWhenMissing != null;
			case DataTypesPackage.ELEMENT_DEFINITION__ORDER_MEANING:
				return orderMeaning != null;
			case DataTypesPackage.ELEMENT_DEFINITION__FIXEDX:
				return fixedx != null;
			case DataTypesPackage.ELEMENT_DEFINITION__PATTERNX:
				return patternx != null;
			case DataTypesPackage.ELEMENT_DEFINITION__EXAMPLE:
				return examples != null && !examples.isEmpty();
			case DataTypesPackage.ELEMENT_DEFINITION__MIN_VALUEX:
				return minValuex != null;
			case DataTypesPackage.ELEMENT_DEFINITION__MAX_VALUEX:
				return maxValuex != null;
			case DataTypesPackage.ELEMENT_DEFINITION__MAX_LENGTH:
				return maxLength != null;
			case DataTypesPackage.ELEMENT_DEFINITION__CONDITION:
				return conditions != null && !conditions.isEmpty();
			case DataTypesPackage.ELEMENT_DEFINITION__CONSTRAINT:
				return constraints != null && !constraints.isEmpty();
			case DataTypesPackage.ELEMENT_DEFINITION__MUST_SUPPORT:
				return mustSupport != null;
			case DataTypesPackage.ELEMENT_DEFINITION__IS_MODIFIER:
				return isModifier != null;
			case DataTypesPackage.ELEMENT_DEFINITION__IS_MODIFIER_REASON:
				return isModifierReason != null;
			case DataTypesPackage.ELEMENT_DEFINITION__IS_SUMMARY:
				return isSummary != null;
			case DataTypesPackage.ELEMENT_DEFINITION__BINDING:
				return binding != null;
			case DataTypesPackage.ELEMENT_DEFINITION__MAPPING:
				return mappings != null && !mappings.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ElementDefinitionImpl
