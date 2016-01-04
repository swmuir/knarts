/*******************************************************************************
 * Copyright (c) 2016 David Carlson and others.
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
package org.eclipse.mdht.uml.fhir.core.datatype.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.mdht.uml.fhir.core.datatype.Code;
import org.eclipse.mdht.uml.fhir.core.datatype.Coding;
import org.eclipse.mdht.uml.fhir.core.datatype.DataType;
import org.eclipse.mdht.uml.fhir.core.datatype.ElementDefinition;
import org.eclipse.mdht.uml.fhir.core.datatype.ElementDefinitionElement1;
import org.eclipse.mdht.uml.fhir.core.datatype.ElementDefinitionElement2;
import org.eclipse.mdht.uml.fhir.core.datatype.ElementDefinitionElement3;
import org.eclipse.mdht.uml.fhir.core.datatype.ElementDefinitionElement4;
import org.eclipse.mdht.uml.fhir.core.datatype.ElementDefinitionElement5;
import org.eclipse.mdht.uml.fhir.core.datatype.ElementDefinitionElement6;
import org.eclipse.mdht.uml.fhir.core.datatype.FhirDatatypePackage;
import org.eclipse.mdht.uml.fhir.core.datatype.Id;
import org.eclipse.mdht.uml.fhir.core.datatype.Markdown;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Element Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.datatype.impl.ElementDefinitionImpl#getPath <em>Path</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.datatype.impl.ElementDefinitionImpl#getRepresentations <em>Representation</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.datatype.impl.ElementDefinitionImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.datatype.impl.ElementDefinitionImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.datatype.impl.ElementDefinitionImpl#getCodes <em>Code</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.datatype.impl.ElementDefinitionImpl#getSlicing <em>Slicing</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.datatype.impl.ElementDefinitionImpl#getShort <em>Short</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.datatype.impl.ElementDefinitionImpl#getDefinition <em>Definition</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.datatype.impl.ElementDefinitionImpl#getComments <em>Comments</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.datatype.impl.ElementDefinitionImpl#getRequirements <em>Requirements</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.datatype.impl.ElementDefinitionImpl#getAlias <em>Alias</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.datatype.impl.ElementDefinitionImpl#getMin <em>Min</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.datatype.impl.ElementDefinitionImpl#getMax <em>Max</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.datatype.impl.ElementDefinitionImpl#getBase <em>Base</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.datatype.impl.ElementDefinitionImpl#getTypes <em>Type</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.datatype.impl.ElementDefinitionImpl#getNameReference <em>Name Reference</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.datatype.impl.ElementDefinitionImpl#getDefaultValuex <em>Default Valuex</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.datatype.impl.ElementDefinitionImpl#getMeaningWhenMissing <em>Meaning When Missing</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.datatype.impl.ElementDefinitionImpl#getFixedx <em>Fixedx</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.datatype.impl.ElementDefinitionImpl#getPatternx <em>Patternx</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.datatype.impl.ElementDefinitionImpl#getExamplex <em>Examplex</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.datatype.impl.ElementDefinitionImpl#getMinValuex <em>Min Valuex</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.datatype.impl.ElementDefinitionImpl#getMaxValuex <em>Max Valuex</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.datatype.impl.ElementDefinitionImpl#getMaxLength <em>Max Length</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.datatype.impl.ElementDefinitionImpl#getConditions <em>Condition</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.datatype.impl.ElementDefinitionImpl#getConstraints <em>Constraint</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.datatype.impl.ElementDefinitionImpl#getMustSupport <em>Must Support</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.datatype.impl.ElementDefinitionImpl#getIsModifier <em>Is Modifier</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.datatype.impl.ElementDefinitionImpl#getIsSummary <em>Is Summary</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.datatype.impl.ElementDefinitionImpl#getBinding <em>Binding</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.datatype.impl.ElementDefinitionImpl#getMappings <em>Mapping</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ElementDefinitionImpl extends DataTypeImpl implements ElementDefinition {
	/**
	 * The cached value of the '{@link #getPath() <em>Path</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPath()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.datatype.String path;

	/**
	 * The cached value of the '{@link #getRepresentations() <em>Representation</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepresentations()
	 * @generated
	 * @ordered
	 */
	protected EList<Code> representations;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.datatype.String name;

	/**
	 * The cached value of the '{@link #getLabel() <em>Label</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.datatype.String label;

	/**
	 * The cached value of the '{@link #getCodes() <em>Code</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodes()
	 * @generated
	 * @ordered
	 */
	protected EList<Coding> codes;

	/**
	 * The cached value of the '{@link #getSlicing() <em>Slicing</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSlicing()
	 * @generated
	 * @ordered
	 */
	protected ElementDefinitionElement1 slicing;

	/**
	 * The cached value of the '{@link #getShort() <em>Short</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShort()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.datatype.String short_;

	/**
	 * The cached value of the '{@link #getDefinition() <em>Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefinition()
	 * @generated
	 * @ordered
	 */
	protected Markdown definition;

	/**
	 * The cached value of the '{@link #getComments() <em>Comments</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComments()
	 * @generated
	 * @ordered
	 */
	protected Markdown comments;

	/**
	 * The cached value of the '{@link #getRequirements() <em>Requirements</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequirements()
	 * @generated
	 * @ordered
	 */
	protected Markdown requirements;

	/**
	 * The cached value of the '{@link #getAlias() <em>Alias</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlias()
	 * @generated
	 * @ordered
	 */
	protected EList<org.eclipse.mdht.uml.fhir.core.datatype.String> alias;

	/**
	 * The cached value of the '{@link #getMin() <em>Min</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMin()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.datatype.Integer min;

	/**
	 * The cached value of the '{@link #getMax() <em>Max</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMax()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.datatype.String max;

	/**
	 * The cached value of the '{@link #getBase() <em>Base</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase()
	 * @generated
	 * @ordered
	 */
	protected ElementDefinitionElement2 base;

	/**
	 * The cached value of the '{@link #getTypes() <em>Type</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<ElementDefinitionElement3> types;

	/**
	 * The cached value of the '{@link #getNameReference() <em>Name Reference</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameReference()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.datatype.String nameReference;

	/**
	 * The cached value of the '{@link #getDefaultValuex() <em>Default Valuex</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValuex()
	 * @generated
	 * @ordered
	 */
	protected DataType defaultValuex;

	/**
	 * The cached value of the '{@link #getMeaningWhenMissing() <em>Meaning When Missing</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeaningWhenMissing()
	 * @generated
	 * @ordered
	 */
	protected Markdown meaningWhenMissing;

	/**
	 * The cached value of the '{@link #getFixedx() <em>Fixedx</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFixedx()
	 * @generated
	 * @ordered
	 */
	protected DataType fixedx;

	/**
	 * The cached value of the '{@link #getPatternx() <em>Patternx</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatternx()
	 * @generated
	 * @ordered
	 */
	protected DataType patternx;

	/**
	 * The cached value of the '{@link #getExamplex() <em>Examplex</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExamplex()
	 * @generated
	 * @ordered
	 */
	protected DataType examplex;

	/**
	 * The cached value of the '{@link #getMinValuex() <em>Min Valuex</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinValuex()
	 * @generated
	 * @ordered
	 */
	protected DataType minValuex;

	/**
	 * The cached value of the '{@link #getMaxValuex() <em>Max Valuex</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxValuex()
	 * @generated
	 * @ordered
	 */
	protected DataType maxValuex;

	/**
	 * The cached value of the '{@link #getMaxLength() <em>Max Length</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxLength()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.datatype.Integer maxLength;

	/**
	 * The cached value of the '{@link #getConditions() <em>Condition</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditions()
	 * @generated
	 * @ordered
	 */
	protected EList<Id> conditions;

	/**
	 * The cached value of the '{@link #getConstraints() <em>Constraint</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraints()
	 * @generated
	 * @ordered
	 */
	protected EList<ElementDefinitionElement4> constraints;

	/**
	 * The cached value of the '{@link #getMustSupport() <em>Must Support</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMustSupport()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.datatype.Boolean mustSupport;

	/**
	 * The cached value of the '{@link #getIsModifier() <em>Is Modifier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsModifier()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.datatype.Boolean isModifier;

	/**
	 * The cached value of the '{@link #getIsSummary() <em>Is Summary</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsSummary()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.datatype.Boolean isSummary;

	/**
	 * The cached value of the '{@link #getBinding() <em>Binding</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBinding()
	 * @generated
	 * @ordered
	 */
	protected ElementDefinitionElement5 binding;

	/**
	 * The cached value of the '{@link #getMappings() <em>Mapping</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMappings()
	 * @generated
	 * @ordered
	 */
	protected EList<ElementDefinitionElement6> mappings;

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
		return FhirDatatypePackage.Literals.ELEMENT_DEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.String getPath() {
		if (path != null && path.eIsProxy()) {
			InternalEObject oldPath = (InternalEObject)path;
			path = (org.eclipse.mdht.uml.fhir.core.datatype.String)eResolveProxy(oldPath);
			if (path != oldPath) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirDatatypePackage.ELEMENT_DEFINITION__PATH, oldPath, path));
			}
		}
		return path;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.String basicGetPath() {
		return path;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPath(org.eclipse.mdht.uml.fhir.core.datatype.String newPath) {
		org.eclipse.mdht.uml.fhir.core.datatype.String oldPath = path;
		path = newPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirDatatypePackage.ELEMENT_DEFINITION__PATH, oldPath, path));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Code> getRepresentations() {
		if (representations == null) {
			representations = new EObjectResolvingEList<Code>(Code.class, this, FhirDatatypePackage.ELEMENT_DEFINITION__REPRESENTATION);
		}
		return representations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.String getName() {
		if (name != null && name.eIsProxy()) {
			InternalEObject oldName = (InternalEObject)name;
			name = (org.eclipse.mdht.uml.fhir.core.datatype.String)eResolveProxy(oldName);
			if (name != oldName) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirDatatypePackage.ELEMENT_DEFINITION__NAME, oldName, name));
			}
		}
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.String basicGetName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(org.eclipse.mdht.uml.fhir.core.datatype.String newName) {
		org.eclipse.mdht.uml.fhir.core.datatype.String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirDatatypePackage.ELEMENT_DEFINITION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.String getLabel() {
		if (label != null && label.eIsProxy()) {
			InternalEObject oldLabel = (InternalEObject)label;
			label = (org.eclipse.mdht.uml.fhir.core.datatype.String)eResolveProxy(oldLabel);
			if (label != oldLabel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirDatatypePackage.ELEMENT_DEFINITION__LABEL, oldLabel, label));
			}
		}
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.String basicGetLabel() {
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabel(org.eclipse.mdht.uml.fhir.core.datatype.String newLabel) {
		org.eclipse.mdht.uml.fhir.core.datatype.String oldLabel = label;
		label = newLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirDatatypePackage.ELEMENT_DEFINITION__LABEL, oldLabel, label));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Coding> getCodes() {
		if (codes == null) {
			codes = new EObjectResolvingEList<Coding>(Coding.class, this, FhirDatatypePackage.ELEMENT_DEFINITION__CODE);
		}
		return codes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementDefinitionElement1 getSlicing() {
		if (slicing != null && slicing.eIsProxy()) {
			InternalEObject oldSlicing = (InternalEObject)slicing;
			slicing = (ElementDefinitionElement1)eResolveProxy(oldSlicing);
			if (slicing != oldSlicing) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirDatatypePackage.ELEMENT_DEFINITION__SLICING, oldSlicing, slicing));
			}
		}
		return slicing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementDefinitionElement1 basicGetSlicing() {
		return slicing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSlicing(ElementDefinitionElement1 newSlicing) {
		ElementDefinitionElement1 oldSlicing = slicing;
		slicing = newSlicing;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirDatatypePackage.ELEMENT_DEFINITION__SLICING, oldSlicing, slicing));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.String getShort() {
		if (short_ != null && short_.eIsProxy()) {
			InternalEObject oldShort = (InternalEObject)short_;
			short_ = (org.eclipse.mdht.uml.fhir.core.datatype.String)eResolveProxy(oldShort);
			if (short_ != oldShort) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirDatatypePackage.ELEMENT_DEFINITION__SHORT, oldShort, short_));
			}
		}
		return short_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.String basicGetShort() {
		return short_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShort(org.eclipse.mdht.uml.fhir.core.datatype.String newShort) {
		org.eclipse.mdht.uml.fhir.core.datatype.String oldShort = short_;
		short_ = newShort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirDatatypePackage.ELEMENT_DEFINITION__SHORT, oldShort, short_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Markdown getDefinition() {
		if (definition != null && definition.eIsProxy()) {
			InternalEObject oldDefinition = (InternalEObject)definition;
			definition = (Markdown)eResolveProxy(oldDefinition);
			if (definition != oldDefinition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirDatatypePackage.ELEMENT_DEFINITION__DEFINITION, oldDefinition, definition));
			}
		}
		return definition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Markdown basicGetDefinition() {
		return definition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefinition(Markdown newDefinition) {
		Markdown oldDefinition = definition;
		definition = newDefinition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirDatatypePackage.ELEMENT_DEFINITION__DEFINITION, oldDefinition, definition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Markdown getComments() {
		if (comments != null && comments.eIsProxy()) {
			InternalEObject oldComments = (InternalEObject)comments;
			comments = (Markdown)eResolveProxy(oldComments);
			if (comments != oldComments) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirDatatypePackage.ELEMENT_DEFINITION__COMMENTS, oldComments, comments));
			}
		}
		return comments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Markdown basicGetComments() {
		return comments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComments(Markdown newComments) {
		Markdown oldComments = comments;
		comments = newComments;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirDatatypePackage.ELEMENT_DEFINITION__COMMENTS, oldComments, comments));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Markdown getRequirements() {
		if (requirements != null && requirements.eIsProxy()) {
			InternalEObject oldRequirements = (InternalEObject)requirements;
			requirements = (Markdown)eResolveProxy(oldRequirements);
			if (requirements != oldRequirements) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirDatatypePackage.ELEMENT_DEFINITION__REQUIREMENTS, oldRequirements, requirements));
			}
		}
		return requirements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Markdown basicGetRequirements() {
		return requirements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequirements(Markdown newRequirements) {
		Markdown oldRequirements = requirements;
		requirements = newRequirements;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirDatatypePackage.ELEMENT_DEFINITION__REQUIREMENTS, oldRequirements, requirements));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<org.eclipse.mdht.uml.fhir.core.datatype.String> getAlias() {
		if (alias == null) {
			alias = new EObjectResolvingEList<org.eclipse.mdht.uml.fhir.core.datatype.String>(org.eclipse.mdht.uml.fhir.core.datatype.String.class, this, FhirDatatypePackage.ELEMENT_DEFINITION__ALIAS);
		}
		return alias;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.Integer getMin() {
		if (min != null && min.eIsProxy()) {
			InternalEObject oldMin = (InternalEObject)min;
			min = (org.eclipse.mdht.uml.fhir.core.datatype.Integer)eResolveProxy(oldMin);
			if (min != oldMin) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirDatatypePackage.ELEMENT_DEFINITION__MIN, oldMin, min));
			}
		}
		return min;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.Integer basicGetMin() {
		return min;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMin(org.eclipse.mdht.uml.fhir.core.datatype.Integer newMin) {
		org.eclipse.mdht.uml.fhir.core.datatype.Integer oldMin = min;
		min = newMin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirDatatypePackage.ELEMENT_DEFINITION__MIN, oldMin, min));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.String getMax() {
		if (max != null && max.eIsProxy()) {
			InternalEObject oldMax = (InternalEObject)max;
			max = (org.eclipse.mdht.uml.fhir.core.datatype.String)eResolveProxy(oldMax);
			if (max != oldMax) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirDatatypePackage.ELEMENT_DEFINITION__MAX, oldMax, max));
			}
		}
		return max;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.String basicGetMax() {
		return max;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMax(org.eclipse.mdht.uml.fhir.core.datatype.String newMax) {
		org.eclipse.mdht.uml.fhir.core.datatype.String oldMax = max;
		max = newMax;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirDatatypePackage.ELEMENT_DEFINITION__MAX, oldMax, max));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementDefinitionElement2 getBase() {
		if (base != null && base.eIsProxy()) {
			InternalEObject oldBase = (InternalEObject)base;
			base = (ElementDefinitionElement2)eResolveProxy(oldBase);
			if (base != oldBase) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirDatatypePackage.ELEMENT_DEFINITION__BASE, oldBase, base));
			}
		}
		return base;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementDefinitionElement2 basicGetBase() {
		return base;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase(ElementDefinitionElement2 newBase) {
		ElementDefinitionElement2 oldBase = base;
		base = newBase;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirDatatypePackage.ELEMENT_DEFINITION__BASE, oldBase, base));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ElementDefinitionElement3> getTypes() {
		if (types == null) {
			types = new EObjectResolvingEList<ElementDefinitionElement3>(ElementDefinitionElement3.class, this, FhirDatatypePackage.ELEMENT_DEFINITION__TYPE);
		}
		return types;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.String getNameReference() {
		if (nameReference != null && nameReference.eIsProxy()) {
			InternalEObject oldNameReference = (InternalEObject)nameReference;
			nameReference = (org.eclipse.mdht.uml.fhir.core.datatype.String)eResolveProxy(oldNameReference);
			if (nameReference != oldNameReference) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirDatatypePackage.ELEMENT_DEFINITION__NAME_REFERENCE, oldNameReference, nameReference));
			}
		}
		return nameReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.String basicGetNameReference() {
		return nameReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNameReference(org.eclipse.mdht.uml.fhir.core.datatype.String newNameReference) {
		org.eclipse.mdht.uml.fhir.core.datatype.String oldNameReference = nameReference;
		nameReference = newNameReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirDatatypePackage.ELEMENT_DEFINITION__NAME_REFERENCE, oldNameReference, nameReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType getDefaultValuex() {
		if (defaultValuex != null && defaultValuex.eIsProxy()) {
			InternalEObject oldDefaultValuex = (InternalEObject)defaultValuex;
			defaultValuex = (DataType)eResolveProxy(oldDefaultValuex);
			if (defaultValuex != oldDefaultValuex) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirDatatypePackage.ELEMENT_DEFINITION__DEFAULT_VALUEX, oldDefaultValuex, defaultValuex));
			}
		}
		return defaultValuex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType basicGetDefaultValuex() {
		return defaultValuex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultValuex(DataType newDefaultValuex) {
		DataType oldDefaultValuex = defaultValuex;
		defaultValuex = newDefaultValuex;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirDatatypePackage.ELEMENT_DEFINITION__DEFAULT_VALUEX, oldDefaultValuex, defaultValuex));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Markdown getMeaningWhenMissing() {
		if (meaningWhenMissing != null && meaningWhenMissing.eIsProxy()) {
			InternalEObject oldMeaningWhenMissing = (InternalEObject)meaningWhenMissing;
			meaningWhenMissing = (Markdown)eResolveProxy(oldMeaningWhenMissing);
			if (meaningWhenMissing != oldMeaningWhenMissing) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirDatatypePackage.ELEMENT_DEFINITION__MEANING_WHEN_MISSING, oldMeaningWhenMissing, meaningWhenMissing));
			}
		}
		return meaningWhenMissing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Markdown basicGetMeaningWhenMissing() {
		return meaningWhenMissing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMeaningWhenMissing(Markdown newMeaningWhenMissing) {
		Markdown oldMeaningWhenMissing = meaningWhenMissing;
		meaningWhenMissing = newMeaningWhenMissing;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirDatatypePackage.ELEMENT_DEFINITION__MEANING_WHEN_MISSING, oldMeaningWhenMissing, meaningWhenMissing));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType getFixedx() {
		if (fixedx != null && fixedx.eIsProxy()) {
			InternalEObject oldFixedx = (InternalEObject)fixedx;
			fixedx = (DataType)eResolveProxy(oldFixedx);
			if (fixedx != oldFixedx) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirDatatypePackage.ELEMENT_DEFINITION__FIXEDX, oldFixedx, fixedx));
			}
		}
		return fixedx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType basicGetFixedx() {
		return fixedx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFixedx(DataType newFixedx) {
		DataType oldFixedx = fixedx;
		fixedx = newFixedx;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirDatatypePackage.ELEMENT_DEFINITION__FIXEDX, oldFixedx, fixedx));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType getPatternx() {
		if (patternx != null && patternx.eIsProxy()) {
			InternalEObject oldPatternx = (InternalEObject)patternx;
			patternx = (DataType)eResolveProxy(oldPatternx);
			if (patternx != oldPatternx) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirDatatypePackage.ELEMENT_DEFINITION__PATTERNX, oldPatternx, patternx));
			}
		}
		return patternx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType basicGetPatternx() {
		return patternx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPatternx(DataType newPatternx) {
		DataType oldPatternx = patternx;
		patternx = newPatternx;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirDatatypePackage.ELEMENT_DEFINITION__PATTERNX, oldPatternx, patternx));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType getExamplex() {
		if (examplex != null && examplex.eIsProxy()) {
			InternalEObject oldExamplex = (InternalEObject)examplex;
			examplex = (DataType)eResolveProxy(oldExamplex);
			if (examplex != oldExamplex) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirDatatypePackage.ELEMENT_DEFINITION__EXAMPLEX, oldExamplex, examplex));
			}
		}
		return examplex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType basicGetExamplex() {
		return examplex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExamplex(DataType newExamplex) {
		DataType oldExamplex = examplex;
		examplex = newExamplex;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirDatatypePackage.ELEMENT_DEFINITION__EXAMPLEX, oldExamplex, examplex));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType getMinValuex() {
		if (minValuex != null && minValuex.eIsProxy()) {
			InternalEObject oldMinValuex = (InternalEObject)minValuex;
			minValuex = (DataType)eResolveProxy(oldMinValuex);
			if (minValuex != oldMinValuex) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirDatatypePackage.ELEMENT_DEFINITION__MIN_VALUEX, oldMinValuex, minValuex));
			}
		}
		return minValuex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType basicGetMinValuex() {
		return minValuex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinValuex(DataType newMinValuex) {
		DataType oldMinValuex = minValuex;
		minValuex = newMinValuex;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirDatatypePackage.ELEMENT_DEFINITION__MIN_VALUEX, oldMinValuex, minValuex));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType getMaxValuex() {
		if (maxValuex != null && maxValuex.eIsProxy()) {
			InternalEObject oldMaxValuex = (InternalEObject)maxValuex;
			maxValuex = (DataType)eResolveProxy(oldMaxValuex);
			if (maxValuex != oldMaxValuex) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirDatatypePackage.ELEMENT_DEFINITION__MAX_VALUEX, oldMaxValuex, maxValuex));
			}
		}
		return maxValuex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType basicGetMaxValuex() {
		return maxValuex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxValuex(DataType newMaxValuex) {
		DataType oldMaxValuex = maxValuex;
		maxValuex = newMaxValuex;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirDatatypePackage.ELEMENT_DEFINITION__MAX_VALUEX, oldMaxValuex, maxValuex));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.Integer getMaxLength() {
		if (maxLength != null && maxLength.eIsProxy()) {
			InternalEObject oldMaxLength = (InternalEObject)maxLength;
			maxLength = (org.eclipse.mdht.uml.fhir.core.datatype.Integer)eResolveProxy(oldMaxLength);
			if (maxLength != oldMaxLength) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirDatatypePackage.ELEMENT_DEFINITION__MAX_LENGTH, oldMaxLength, maxLength));
			}
		}
		return maxLength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.Integer basicGetMaxLength() {
		return maxLength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxLength(org.eclipse.mdht.uml.fhir.core.datatype.Integer newMaxLength) {
		org.eclipse.mdht.uml.fhir.core.datatype.Integer oldMaxLength = maxLength;
		maxLength = newMaxLength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirDatatypePackage.ELEMENT_DEFINITION__MAX_LENGTH, oldMaxLength, maxLength));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Id> getConditions() {
		if (conditions == null) {
			conditions = new EObjectResolvingEList<Id>(Id.class, this, FhirDatatypePackage.ELEMENT_DEFINITION__CONDITION);
		}
		return conditions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ElementDefinitionElement4> getConstraints() {
		if (constraints == null) {
			constraints = new EObjectResolvingEList<ElementDefinitionElement4>(ElementDefinitionElement4.class, this, FhirDatatypePackage.ELEMENT_DEFINITION__CONSTRAINT);
		}
		return constraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.Boolean getMustSupport() {
		if (mustSupport != null && mustSupport.eIsProxy()) {
			InternalEObject oldMustSupport = (InternalEObject)mustSupport;
			mustSupport = (org.eclipse.mdht.uml.fhir.core.datatype.Boolean)eResolveProxy(oldMustSupport);
			if (mustSupport != oldMustSupport) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirDatatypePackage.ELEMENT_DEFINITION__MUST_SUPPORT, oldMustSupport, mustSupport));
			}
		}
		return mustSupport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.Boolean basicGetMustSupport() {
		return mustSupport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMustSupport(org.eclipse.mdht.uml.fhir.core.datatype.Boolean newMustSupport) {
		org.eclipse.mdht.uml.fhir.core.datatype.Boolean oldMustSupport = mustSupport;
		mustSupport = newMustSupport;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirDatatypePackage.ELEMENT_DEFINITION__MUST_SUPPORT, oldMustSupport, mustSupport));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.Boolean getIsModifier() {
		if (isModifier != null && isModifier.eIsProxy()) {
			InternalEObject oldIsModifier = (InternalEObject)isModifier;
			isModifier = (org.eclipse.mdht.uml.fhir.core.datatype.Boolean)eResolveProxy(oldIsModifier);
			if (isModifier != oldIsModifier) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirDatatypePackage.ELEMENT_DEFINITION__IS_MODIFIER, oldIsModifier, isModifier));
			}
		}
		return isModifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.Boolean basicGetIsModifier() {
		return isModifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsModifier(org.eclipse.mdht.uml.fhir.core.datatype.Boolean newIsModifier) {
		org.eclipse.mdht.uml.fhir.core.datatype.Boolean oldIsModifier = isModifier;
		isModifier = newIsModifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirDatatypePackage.ELEMENT_DEFINITION__IS_MODIFIER, oldIsModifier, isModifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.Boolean getIsSummary() {
		if (isSummary != null && isSummary.eIsProxy()) {
			InternalEObject oldIsSummary = (InternalEObject)isSummary;
			isSummary = (org.eclipse.mdht.uml.fhir.core.datatype.Boolean)eResolveProxy(oldIsSummary);
			if (isSummary != oldIsSummary) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirDatatypePackage.ELEMENT_DEFINITION__IS_SUMMARY, oldIsSummary, isSummary));
			}
		}
		return isSummary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.Boolean basicGetIsSummary() {
		return isSummary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsSummary(org.eclipse.mdht.uml.fhir.core.datatype.Boolean newIsSummary) {
		org.eclipse.mdht.uml.fhir.core.datatype.Boolean oldIsSummary = isSummary;
		isSummary = newIsSummary;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirDatatypePackage.ELEMENT_DEFINITION__IS_SUMMARY, oldIsSummary, isSummary));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementDefinitionElement5 getBinding() {
		if (binding != null && binding.eIsProxy()) {
			InternalEObject oldBinding = (InternalEObject)binding;
			binding = (ElementDefinitionElement5)eResolveProxy(oldBinding);
			if (binding != oldBinding) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirDatatypePackage.ELEMENT_DEFINITION__BINDING, oldBinding, binding));
			}
		}
		return binding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementDefinitionElement5 basicGetBinding() {
		return binding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBinding(ElementDefinitionElement5 newBinding) {
		ElementDefinitionElement5 oldBinding = binding;
		binding = newBinding;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirDatatypePackage.ELEMENT_DEFINITION__BINDING, oldBinding, binding));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ElementDefinitionElement6> getMappings() {
		if (mappings == null) {
			mappings = new EObjectResolvingEList<ElementDefinitionElement6>(ElementDefinitionElement6.class, this, FhirDatatypePackage.ELEMENT_DEFINITION__MAPPING);
		}
		return mappings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FhirDatatypePackage.ELEMENT_DEFINITION__PATH:
				if (resolve) return getPath();
				return basicGetPath();
			case FhirDatatypePackage.ELEMENT_DEFINITION__REPRESENTATION:
				return getRepresentations();
			case FhirDatatypePackage.ELEMENT_DEFINITION__NAME:
				if (resolve) return getName();
				return basicGetName();
			case FhirDatatypePackage.ELEMENT_DEFINITION__LABEL:
				if (resolve) return getLabel();
				return basicGetLabel();
			case FhirDatatypePackage.ELEMENT_DEFINITION__CODE:
				return getCodes();
			case FhirDatatypePackage.ELEMENT_DEFINITION__SLICING:
				if (resolve) return getSlicing();
				return basicGetSlicing();
			case FhirDatatypePackage.ELEMENT_DEFINITION__SHORT:
				if (resolve) return getShort();
				return basicGetShort();
			case FhirDatatypePackage.ELEMENT_DEFINITION__DEFINITION:
				if (resolve) return getDefinition();
				return basicGetDefinition();
			case FhirDatatypePackage.ELEMENT_DEFINITION__COMMENTS:
				if (resolve) return getComments();
				return basicGetComments();
			case FhirDatatypePackage.ELEMENT_DEFINITION__REQUIREMENTS:
				if (resolve) return getRequirements();
				return basicGetRequirements();
			case FhirDatatypePackage.ELEMENT_DEFINITION__ALIAS:
				return getAlias();
			case FhirDatatypePackage.ELEMENT_DEFINITION__MIN:
				if (resolve) return getMin();
				return basicGetMin();
			case FhirDatatypePackage.ELEMENT_DEFINITION__MAX:
				if (resolve) return getMax();
				return basicGetMax();
			case FhirDatatypePackage.ELEMENT_DEFINITION__BASE:
				if (resolve) return getBase();
				return basicGetBase();
			case FhirDatatypePackage.ELEMENT_DEFINITION__TYPE:
				return getTypes();
			case FhirDatatypePackage.ELEMENT_DEFINITION__NAME_REFERENCE:
				if (resolve) return getNameReference();
				return basicGetNameReference();
			case FhirDatatypePackage.ELEMENT_DEFINITION__DEFAULT_VALUEX:
				if (resolve) return getDefaultValuex();
				return basicGetDefaultValuex();
			case FhirDatatypePackage.ELEMENT_DEFINITION__MEANING_WHEN_MISSING:
				if (resolve) return getMeaningWhenMissing();
				return basicGetMeaningWhenMissing();
			case FhirDatatypePackage.ELEMENT_DEFINITION__FIXEDX:
				if (resolve) return getFixedx();
				return basicGetFixedx();
			case FhirDatatypePackage.ELEMENT_DEFINITION__PATTERNX:
				if (resolve) return getPatternx();
				return basicGetPatternx();
			case FhirDatatypePackage.ELEMENT_DEFINITION__EXAMPLEX:
				if (resolve) return getExamplex();
				return basicGetExamplex();
			case FhirDatatypePackage.ELEMENT_DEFINITION__MIN_VALUEX:
				if (resolve) return getMinValuex();
				return basicGetMinValuex();
			case FhirDatatypePackage.ELEMENT_DEFINITION__MAX_VALUEX:
				if (resolve) return getMaxValuex();
				return basicGetMaxValuex();
			case FhirDatatypePackage.ELEMENT_DEFINITION__MAX_LENGTH:
				if (resolve) return getMaxLength();
				return basicGetMaxLength();
			case FhirDatatypePackage.ELEMENT_DEFINITION__CONDITION:
				return getConditions();
			case FhirDatatypePackage.ELEMENT_DEFINITION__CONSTRAINT:
				return getConstraints();
			case FhirDatatypePackage.ELEMENT_DEFINITION__MUST_SUPPORT:
				if (resolve) return getMustSupport();
				return basicGetMustSupport();
			case FhirDatatypePackage.ELEMENT_DEFINITION__IS_MODIFIER:
				if (resolve) return getIsModifier();
				return basicGetIsModifier();
			case FhirDatatypePackage.ELEMENT_DEFINITION__IS_SUMMARY:
				if (resolve) return getIsSummary();
				return basicGetIsSummary();
			case FhirDatatypePackage.ELEMENT_DEFINITION__BINDING:
				if (resolve) return getBinding();
				return basicGetBinding();
			case FhirDatatypePackage.ELEMENT_DEFINITION__MAPPING:
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
			case FhirDatatypePackage.ELEMENT_DEFINITION__PATH:
				setPath((org.eclipse.mdht.uml.fhir.core.datatype.String)newValue);
				return;
			case FhirDatatypePackage.ELEMENT_DEFINITION__REPRESENTATION:
				getRepresentations().clear();
				getRepresentations().addAll((Collection<? extends Code>)newValue);
				return;
			case FhirDatatypePackage.ELEMENT_DEFINITION__NAME:
				setName((org.eclipse.mdht.uml.fhir.core.datatype.String)newValue);
				return;
			case FhirDatatypePackage.ELEMENT_DEFINITION__LABEL:
				setLabel((org.eclipse.mdht.uml.fhir.core.datatype.String)newValue);
				return;
			case FhirDatatypePackage.ELEMENT_DEFINITION__CODE:
				getCodes().clear();
				getCodes().addAll((Collection<? extends Coding>)newValue);
				return;
			case FhirDatatypePackage.ELEMENT_DEFINITION__SLICING:
				setSlicing((ElementDefinitionElement1)newValue);
				return;
			case FhirDatatypePackage.ELEMENT_DEFINITION__SHORT:
				setShort((org.eclipse.mdht.uml.fhir.core.datatype.String)newValue);
				return;
			case FhirDatatypePackage.ELEMENT_DEFINITION__DEFINITION:
				setDefinition((Markdown)newValue);
				return;
			case FhirDatatypePackage.ELEMENT_DEFINITION__COMMENTS:
				setComments((Markdown)newValue);
				return;
			case FhirDatatypePackage.ELEMENT_DEFINITION__REQUIREMENTS:
				setRequirements((Markdown)newValue);
				return;
			case FhirDatatypePackage.ELEMENT_DEFINITION__ALIAS:
				getAlias().clear();
				getAlias().addAll((Collection<? extends org.eclipse.mdht.uml.fhir.core.datatype.String>)newValue);
				return;
			case FhirDatatypePackage.ELEMENT_DEFINITION__MIN:
				setMin((org.eclipse.mdht.uml.fhir.core.datatype.Integer)newValue);
				return;
			case FhirDatatypePackage.ELEMENT_DEFINITION__MAX:
				setMax((org.eclipse.mdht.uml.fhir.core.datatype.String)newValue);
				return;
			case FhirDatatypePackage.ELEMENT_DEFINITION__BASE:
				setBase((ElementDefinitionElement2)newValue);
				return;
			case FhirDatatypePackage.ELEMENT_DEFINITION__TYPE:
				getTypes().clear();
				getTypes().addAll((Collection<? extends ElementDefinitionElement3>)newValue);
				return;
			case FhirDatatypePackage.ELEMENT_DEFINITION__NAME_REFERENCE:
				setNameReference((org.eclipse.mdht.uml.fhir.core.datatype.String)newValue);
				return;
			case FhirDatatypePackage.ELEMENT_DEFINITION__DEFAULT_VALUEX:
				setDefaultValuex((DataType)newValue);
				return;
			case FhirDatatypePackage.ELEMENT_DEFINITION__MEANING_WHEN_MISSING:
				setMeaningWhenMissing((Markdown)newValue);
				return;
			case FhirDatatypePackage.ELEMENT_DEFINITION__FIXEDX:
				setFixedx((DataType)newValue);
				return;
			case FhirDatatypePackage.ELEMENT_DEFINITION__PATTERNX:
				setPatternx((DataType)newValue);
				return;
			case FhirDatatypePackage.ELEMENT_DEFINITION__EXAMPLEX:
				setExamplex((DataType)newValue);
				return;
			case FhirDatatypePackage.ELEMENT_DEFINITION__MIN_VALUEX:
				setMinValuex((DataType)newValue);
				return;
			case FhirDatatypePackage.ELEMENT_DEFINITION__MAX_VALUEX:
				setMaxValuex((DataType)newValue);
				return;
			case FhirDatatypePackage.ELEMENT_DEFINITION__MAX_LENGTH:
				setMaxLength((org.eclipse.mdht.uml.fhir.core.datatype.Integer)newValue);
				return;
			case FhirDatatypePackage.ELEMENT_DEFINITION__CONDITION:
				getConditions().clear();
				getConditions().addAll((Collection<? extends Id>)newValue);
				return;
			case FhirDatatypePackage.ELEMENT_DEFINITION__CONSTRAINT:
				getConstraints().clear();
				getConstraints().addAll((Collection<? extends ElementDefinitionElement4>)newValue);
				return;
			case FhirDatatypePackage.ELEMENT_DEFINITION__MUST_SUPPORT:
				setMustSupport((org.eclipse.mdht.uml.fhir.core.datatype.Boolean)newValue);
				return;
			case FhirDatatypePackage.ELEMENT_DEFINITION__IS_MODIFIER:
				setIsModifier((org.eclipse.mdht.uml.fhir.core.datatype.Boolean)newValue);
				return;
			case FhirDatatypePackage.ELEMENT_DEFINITION__IS_SUMMARY:
				setIsSummary((org.eclipse.mdht.uml.fhir.core.datatype.Boolean)newValue);
				return;
			case FhirDatatypePackage.ELEMENT_DEFINITION__BINDING:
				setBinding((ElementDefinitionElement5)newValue);
				return;
			case FhirDatatypePackage.ELEMENT_DEFINITION__MAPPING:
				getMappings().clear();
				getMappings().addAll((Collection<? extends ElementDefinitionElement6>)newValue);
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
			case FhirDatatypePackage.ELEMENT_DEFINITION__PATH:
				setPath((org.eclipse.mdht.uml.fhir.core.datatype.String)null);
				return;
			case FhirDatatypePackage.ELEMENT_DEFINITION__REPRESENTATION:
				getRepresentations().clear();
				return;
			case FhirDatatypePackage.ELEMENT_DEFINITION__NAME:
				setName((org.eclipse.mdht.uml.fhir.core.datatype.String)null);
				return;
			case FhirDatatypePackage.ELEMENT_DEFINITION__LABEL:
				setLabel((org.eclipse.mdht.uml.fhir.core.datatype.String)null);
				return;
			case FhirDatatypePackage.ELEMENT_DEFINITION__CODE:
				getCodes().clear();
				return;
			case FhirDatatypePackage.ELEMENT_DEFINITION__SLICING:
				setSlicing((ElementDefinitionElement1)null);
				return;
			case FhirDatatypePackage.ELEMENT_DEFINITION__SHORT:
				setShort((org.eclipse.mdht.uml.fhir.core.datatype.String)null);
				return;
			case FhirDatatypePackage.ELEMENT_DEFINITION__DEFINITION:
				setDefinition((Markdown)null);
				return;
			case FhirDatatypePackage.ELEMENT_DEFINITION__COMMENTS:
				setComments((Markdown)null);
				return;
			case FhirDatatypePackage.ELEMENT_DEFINITION__REQUIREMENTS:
				setRequirements((Markdown)null);
				return;
			case FhirDatatypePackage.ELEMENT_DEFINITION__ALIAS:
				getAlias().clear();
				return;
			case FhirDatatypePackage.ELEMENT_DEFINITION__MIN:
				setMin((org.eclipse.mdht.uml.fhir.core.datatype.Integer)null);
				return;
			case FhirDatatypePackage.ELEMENT_DEFINITION__MAX:
				setMax((org.eclipse.mdht.uml.fhir.core.datatype.String)null);
				return;
			case FhirDatatypePackage.ELEMENT_DEFINITION__BASE:
				setBase((ElementDefinitionElement2)null);
				return;
			case FhirDatatypePackage.ELEMENT_DEFINITION__TYPE:
				getTypes().clear();
				return;
			case FhirDatatypePackage.ELEMENT_DEFINITION__NAME_REFERENCE:
				setNameReference((org.eclipse.mdht.uml.fhir.core.datatype.String)null);
				return;
			case FhirDatatypePackage.ELEMENT_DEFINITION__DEFAULT_VALUEX:
				setDefaultValuex((DataType)null);
				return;
			case FhirDatatypePackage.ELEMENT_DEFINITION__MEANING_WHEN_MISSING:
				setMeaningWhenMissing((Markdown)null);
				return;
			case FhirDatatypePackage.ELEMENT_DEFINITION__FIXEDX:
				setFixedx((DataType)null);
				return;
			case FhirDatatypePackage.ELEMENT_DEFINITION__PATTERNX:
				setPatternx((DataType)null);
				return;
			case FhirDatatypePackage.ELEMENT_DEFINITION__EXAMPLEX:
				setExamplex((DataType)null);
				return;
			case FhirDatatypePackage.ELEMENT_DEFINITION__MIN_VALUEX:
				setMinValuex((DataType)null);
				return;
			case FhirDatatypePackage.ELEMENT_DEFINITION__MAX_VALUEX:
				setMaxValuex((DataType)null);
				return;
			case FhirDatatypePackage.ELEMENT_DEFINITION__MAX_LENGTH:
				setMaxLength((org.eclipse.mdht.uml.fhir.core.datatype.Integer)null);
				return;
			case FhirDatatypePackage.ELEMENT_DEFINITION__CONDITION:
				getConditions().clear();
				return;
			case FhirDatatypePackage.ELEMENT_DEFINITION__CONSTRAINT:
				getConstraints().clear();
				return;
			case FhirDatatypePackage.ELEMENT_DEFINITION__MUST_SUPPORT:
				setMustSupport((org.eclipse.mdht.uml.fhir.core.datatype.Boolean)null);
				return;
			case FhirDatatypePackage.ELEMENT_DEFINITION__IS_MODIFIER:
				setIsModifier((org.eclipse.mdht.uml.fhir.core.datatype.Boolean)null);
				return;
			case FhirDatatypePackage.ELEMENT_DEFINITION__IS_SUMMARY:
				setIsSummary((org.eclipse.mdht.uml.fhir.core.datatype.Boolean)null);
				return;
			case FhirDatatypePackage.ELEMENT_DEFINITION__BINDING:
				setBinding((ElementDefinitionElement5)null);
				return;
			case FhirDatatypePackage.ELEMENT_DEFINITION__MAPPING:
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
			case FhirDatatypePackage.ELEMENT_DEFINITION__PATH:
				return path != null;
			case FhirDatatypePackage.ELEMENT_DEFINITION__REPRESENTATION:
				return representations != null && !representations.isEmpty();
			case FhirDatatypePackage.ELEMENT_DEFINITION__NAME:
				return name != null;
			case FhirDatatypePackage.ELEMENT_DEFINITION__LABEL:
				return label != null;
			case FhirDatatypePackage.ELEMENT_DEFINITION__CODE:
				return codes != null && !codes.isEmpty();
			case FhirDatatypePackage.ELEMENT_DEFINITION__SLICING:
				return slicing != null;
			case FhirDatatypePackage.ELEMENT_DEFINITION__SHORT:
				return short_ != null;
			case FhirDatatypePackage.ELEMENT_DEFINITION__DEFINITION:
				return definition != null;
			case FhirDatatypePackage.ELEMENT_DEFINITION__COMMENTS:
				return comments != null;
			case FhirDatatypePackage.ELEMENT_DEFINITION__REQUIREMENTS:
				return requirements != null;
			case FhirDatatypePackage.ELEMENT_DEFINITION__ALIAS:
				return alias != null && !alias.isEmpty();
			case FhirDatatypePackage.ELEMENT_DEFINITION__MIN:
				return min != null;
			case FhirDatatypePackage.ELEMENT_DEFINITION__MAX:
				return max != null;
			case FhirDatatypePackage.ELEMENT_DEFINITION__BASE:
				return base != null;
			case FhirDatatypePackage.ELEMENT_DEFINITION__TYPE:
				return types != null && !types.isEmpty();
			case FhirDatatypePackage.ELEMENT_DEFINITION__NAME_REFERENCE:
				return nameReference != null;
			case FhirDatatypePackage.ELEMENT_DEFINITION__DEFAULT_VALUEX:
				return defaultValuex != null;
			case FhirDatatypePackage.ELEMENT_DEFINITION__MEANING_WHEN_MISSING:
				return meaningWhenMissing != null;
			case FhirDatatypePackage.ELEMENT_DEFINITION__FIXEDX:
				return fixedx != null;
			case FhirDatatypePackage.ELEMENT_DEFINITION__PATTERNX:
				return patternx != null;
			case FhirDatatypePackage.ELEMENT_DEFINITION__EXAMPLEX:
				return examplex != null;
			case FhirDatatypePackage.ELEMENT_DEFINITION__MIN_VALUEX:
				return minValuex != null;
			case FhirDatatypePackage.ELEMENT_DEFINITION__MAX_VALUEX:
				return maxValuex != null;
			case FhirDatatypePackage.ELEMENT_DEFINITION__MAX_LENGTH:
				return maxLength != null;
			case FhirDatatypePackage.ELEMENT_DEFINITION__CONDITION:
				return conditions != null && !conditions.isEmpty();
			case FhirDatatypePackage.ELEMENT_DEFINITION__CONSTRAINT:
				return constraints != null && !constraints.isEmpty();
			case FhirDatatypePackage.ELEMENT_DEFINITION__MUST_SUPPORT:
				return mustSupport != null;
			case FhirDatatypePackage.ELEMENT_DEFINITION__IS_MODIFIER:
				return isModifier != null;
			case FhirDatatypePackage.ELEMENT_DEFINITION__IS_SUMMARY:
				return isSummary != null;
			case FhirDatatypePackage.ELEMENT_DEFINITION__BINDING:
				return binding != null;
			case FhirDatatypePackage.ELEMENT_DEFINITION__MAPPING:
				return mappings != null && !mappings.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ElementDefinitionImpl
