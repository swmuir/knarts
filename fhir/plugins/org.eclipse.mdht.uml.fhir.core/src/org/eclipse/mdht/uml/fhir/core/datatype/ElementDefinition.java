/*******************************************************************************
 * Copyright (c) 2015 David Carlson and others.
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
package org.eclipse.mdht.uml.fhir.core.datatype;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.datatype.ElementDefinition#getPath <em>Path</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.datatype.ElementDefinition#getRepresentations <em>Representation</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.datatype.ElementDefinition#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.datatype.ElementDefinition#getLabel <em>Label</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.datatype.ElementDefinition#getCodes <em>Code</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.datatype.ElementDefinition#getSlicing <em>Slicing</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.datatype.ElementDefinition#getShort <em>Short</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.datatype.ElementDefinition#getDefinition <em>Definition</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.datatype.ElementDefinition#getComments <em>Comments</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.datatype.ElementDefinition#getRequirements <em>Requirements</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.datatype.ElementDefinition#getAlias <em>Alias</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.datatype.ElementDefinition#getMin <em>Min</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.datatype.ElementDefinition#getMax <em>Max</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.datatype.ElementDefinition#getBase <em>Base</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.datatype.ElementDefinition#getTypes <em>Type</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.datatype.ElementDefinition#getNameReference <em>Name Reference</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.datatype.ElementDefinition#getDefaultValuex <em>Default Valuex</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.datatype.ElementDefinition#getMeaningWhenMissing <em>Meaning When Missing</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.datatype.ElementDefinition#getFixedx <em>Fixedx</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.datatype.ElementDefinition#getPatternx <em>Patternx</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.datatype.ElementDefinition#getExamplex <em>Examplex</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.datatype.ElementDefinition#getMinValuex <em>Min Valuex</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.datatype.ElementDefinition#getMaxValuex <em>Max Valuex</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.datatype.ElementDefinition#getMaxLength <em>Max Length</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.datatype.ElementDefinition#getConditions <em>Condition</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.datatype.ElementDefinition#getConstraints <em>Constraint</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.datatype.ElementDefinition#getMustSupport <em>Must Support</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.datatype.ElementDefinition#getIsModifier <em>Is Modifier</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.datatype.ElementDefinition#getIsSummary <em>Is Summary</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.datatype.ElementDefinition#getBinding <em>Binding</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.datatype.ElementDefinition#getMappings <em>Mapping</em>}</li>
 * </ul>
 *
 * @see org.eclipse.mdht.uml.fhir.core.datatype.FhirDatatypePackage#getElementDefinition()
 * @model
 * @generated
 */
public interface ElementDefinition extends DataType {
	/**
	 * Returns the value of the '<em><b>Path</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Path</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path</em>' reference.
	 * @see #setPath(org.eclipse.mdht.uml.fhir.core.datatype.String)
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.FhirDatatypePackage#getElementDefinition_Path()
	 * @model required="true"
	 * @generated
	 */
	org.eclipse.mdht.uml.fhir.core.datatype.String getPath();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.datatype.ElementDefinition#getPath <em>Path</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path</em>' reference.
	 * @see #getPath()
	 * @generated
	 */
	void setPath(org.eclipse.mdht.uml.fhir.core.datatype.String value);

	/**
	 * Returns the value of the '<em><b>Representation</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.mdht.uml.fhir.core.datatype.Code}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Representation</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Representation</em>' reference list.
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.FhirDatatypePackage#getElementDefinition_Representation()
	 * @model
	 * @generated
	 */
	EList<Code> getRepresentations();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' reference.
	 * @see #setName(org.eclipse.mdht.uml.fhir.core.datatype.String)
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.FhirDatatypePackage#getElementDefinition_Name()
	 * @model
	 * @generated
	 */
	org.eclipse.mdht.uml.fhir.core.datatype.String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.datatype.ElementDefinition#getName <em>Name</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' reference.
	 * @see #getName()
	 * @generated
	 */
	void setName(org.eclipse.mdht.uml.fhir.core.datatype.String value);

	/**
	 * Returns the value of the '<em><b>Label</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' reference.
	 * @see #setLabel(org.eclipse.mdht.uml.fhir.core.datatype.String)
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.FhirDatatypePackage#getElementDefinition_Label()
	 * @model
	 * @generated
	 */
	org.eclipse.mdht.uml.fhir.core.datatype.String getLabel();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.datatype.ElementDefinition#getLabel <em>Label</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' reference.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(org.eclipse.mdht.uml.fhir.core.datatype.String value);

	/**
	 * Returns the value of the '<em><b>Code</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.mdht.uml.fhir.core.datatype.Coding}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' reference list.
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.FhirDatatypePackage#getElementDefinition_Code()
	 * @model
	 * @generated
	 */
	EList<Coding> getCodes();

	/**
	 * Returns the value of the '<em><b>Slicing</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Slicing</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Slicing</em>' containment reference.
	 * @see #setSlicing(ElementDefinitionSlicing)
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.FhirDatatypePackage#getElementDefinition_Slicing()
	 * @model containment="true"
	 * @generated
	 */
	ElementDefinitionSlicing getSlicing();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.datatype.ElementDefinition#getSlicing <em>Slicing</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Slicing</em>' containment reference.
	 * @see #getSlicing()
	 * @generated
	 */
	void setSlicing(ElementDefinitionSlicing value);

	/**
	 * Returns the value of the '<em><b>Short</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Short</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Short</em>' reference.
	 * @see #setShort(org.eclipse.mdht.uml.fhir.core.datatype.String)
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.FhirDatatypePackage#getElementDefinition_Short()
	 * @model
	 * @generated
	 */
	org.eclipse.mdht.uml.fhir.core.datatype.String getShort();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.datatype.ElementDefinition#getShort <em>Short</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Short</em>' reference.
	 * @see #getShort()
	 * @generated
	 */
	void setShort(org.eclipse.mdht.uml.fhir.core.datatype.String value);

	/**
	 * Returns the value of the '<em><b>Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Definition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Definition</em>' reference.
	 * @see #setDefinition(Markdown)
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.FhirDatatypePackage#getElementDefinition_Definition()
	 * @model
	 * @generated
	 */
	Markdown getDefinition();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.datatype.ElementDefinition#getDefinition <em>Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Definition</em>' reference.
	 * @see #getDefinition()
	 * @generated
	 */
	void setDefinition(Markdown value);

	/**
	 * Returns the value of the '<em><b>Comments</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comments</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comments</em>' reference.
	 * @see #setComments(Markdown)
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.FhirDatatypePackage#getElementDefinition_Comments()
	 * @model
	 * @generated
	 */
	Markdown getComments();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.datatype.ElementDefinition#getComments <em>Comments</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comments</em>' reference.
	 * @see #getComments()
	 * @generated
	 */
	void setComments(Markdown value);

	/**
	 * Returns the value of the '<em><b>Requirements</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Requirements</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requirements</em>' reference.
	 * @see #setRequirements(Markdown)
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.FhirDatatypePackage#getElementDefinition_Requirements()
	 * @model
	 * @generated
	 */
	Markdown getRequirements();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.datatype.ElementDefinition#getRequirements <em>Requirements</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Requirements</em>' reference.
	 * @see #getRequirements()
	 * @generated
	 */
	void setRequirements(Markdown value);

	/**
	 * Returns the value of the '<em><b>Alias</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.mdht.uml.fhir.core.datatype.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alias</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alias</em>' reference list.
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.FhirDatatypePackage#getElementDefinition_Alias()
	 * @model
	 * @generated
	 */
	EList<org.eclipse.mdht.uml.fhir.core.datatype.String> getAlias();

	/**
	 * Returns the value of the '<em><b>Min</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min</em>' reference.
	 * @see #setMin(org.eclipse.mdht.uml.fhir.core.datatype.Integer)
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.FhirDatatypePackage#getElementDefinition_Min()
	 * @model
	 * @generated
	 */
	org.eclipse.mdht.uml.fhir.core.datatype.Integer getMin();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.datatype.ElementDefinition#getMin <em>Min</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min</em>' reference.
	 * @see #getMin()
	 * @generated
	 */
	void setMin(org.eclipse.mdht.uml.fhir.core.datatype.Integer value);

	/**
	 * Returns the value of the '<em><b>Max</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max</em>' reference.
	 * @see #setMax(org.eclipse.mdht.uml.fhir.core.datatype.String)
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.FhirDatatypePackage#getElementDefinition_Max()
	 * @model
	 * @generated
	 */
	org.eclipse.mdht.uml.fhir.core.datatype.String getMax();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.datatype.ElementDefinition#getMax <em>Max</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max</em>' reference.
	 * @see #getMax()
	 * @generated
	 */
	void setMax(org.eclipse.mdht.uml.fhir.core.datatype.String value);

	/**
	 * Returns the value of the '<em><b>Base</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base</em>' containment reference.
	 * @see #setBase(ElementDefinitionBase)
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.FhirDatatypePackage#getElementDefinition_Base()
	 * @model containment="true"
	 * @generated
	 */
	ElementDefinitionBase getBase();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.datatype.ElementDefinition#getBase <em>Base</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base</em>' containment reference.
	 * @see #getBase()
	 * @generated
	 */
	void setBase(ElementDefinitionBase value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.mdht.uml.fhir.core.datatype.ElementDefinitionTypeRef}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' containment reference list.
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.FhirDatatypePackage#getElementDefinition_Type()
	 * @model containment="true"
	 * @generated
	 */
	EList<ElementDefinitionTypeRef> getTypes();

	/**
	 * Returns the value of the '<em><b>Name Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name Reference</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name Reference</em>' reference.
	 * @see #setNameReference(org.eclipse.mdht.uml.fhir.core.datatype.String)
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.FhirDatatypePackage#getElementDefinition_NameReference()
	 * @model
	 * @generated
	 */
	org.eclipse.mdht.uml.fhir.core.datatype.String getNameReference();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.datatype.ElementDefinition#getNameReference <em>Name Reference</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name Reference</em>' reference.
	 * @see #getNameReference()
	 * @generated
	 */
	void setNameReference(org.eclipse.mdht.uml.fhir.core.datatype.String value);

	/**
	 * Returns the value of the '<em><b>Default Valuex</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Valuex</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Valuex</em>' reference.
	 * @see #setDefaultValuex(DataType)
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.FhirDatatypePackage#getElementDefinition_DefaultValuex()
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='defaultValue[x]'"
	 * @generated
	 */
	DataType getDefaultValuex();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.datatype.ElementDefinition#getDefaultValuex <em>Default Valuex</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Valuex</em>' reference.
	 * @see #getDefaultValuex()
	 * @generated
	 */
	void setDefaultValuex(DataType value);

	/**
	 * Returns the value of the '<em><b>Meaning When Missing</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Meaning When Missing</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Meaning When Missing</em>' reference.
	 * @see #setMeaningWhenMissing(Markdown)
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.FhirDatatypePackage#getElementDefinition_MeaningWhenMissing()
	 * @model
	 * @generated
	 */
	Markdown getMeaningWhenMissing();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.datatype.ElementDefinition#getMeaningWhenMissing <em>Meaning When Missing</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Meaning When Missing</em>' reference.
	 * @see #getMeaningWhenMissing()
	 * @generated
	 */
	void setMeaningWhenMissing(Markdown value);

	/**
	 * Returns the value of the '<em><b>Fixedx</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fixedx</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fixedx</em>' reference.
	 * @see #setFixedx(DataType)
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.FhirDatatypePackage#getElementDefinition_Fixedx()
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='fixed[x]'"
	 * @generated
	 */
	DataType getFixedx();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.datatype.ElementDefinition#getFixedx <em>Fixedx</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fixedx</em>' reference.
	 * @see #getFixedx()
	 * @generated
	 */
	void setFixedx(DataType value);

	/**
	 * Returns the value of the '<em><b>Patternx</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Patternx</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Patternx</em>' reference.
	 * @see #setPatternx(DataType)
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.FhirDatatypePackage#getElementDefinition_Patternx()
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='pattern[x]'"
	 * @generated
	 */
	DataType getPatternx();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.datatype.ElementDefinition#getPatternx <em>Patternx</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Patternx</em>' reference.
	 * @see #getPatternx()
	 * @generated
	 */
	void setPatternx(DataType value);

	/**
	 * Returns the value of the '<em><b>Examplex</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Examplex</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Examplex</em>' reference.
	 * @see #setExamplex(DataType)
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.FhirDatatypePackage#getElementDefinition_Examplex()
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='example[x]'"
	 * @generated
	 */
	DataType getExamplex();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.datatype.ElementDefinition#getExamplex <em>Examplex</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Examplex</em>' reference.
	 * @see #getExamplex()
	 * @generated
	 */
	void setExamplex(DataType value);

	/**
	 * Returns the value of the '<em><b>Min Valuex</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Valuex</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Valuex</em>' reference.
	 * @see #setMinValuex(DataType)
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.FhirDatatypePackage#getElementDefinition_MinValuex()
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='minValue[x]'"
	 * @generated
	 */
	DataType getMinValuex();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.datatype.ElementDefinition#getMinValuex <em>Min Valuex</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Valuex</em>' reference.
	 * @see #getMinValuex()
	 * @generated
	 */
	void setMinValuex(DataType value);

	/**
	 * Returns the value of the '<em><b>Max Valuex</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Valuex</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Valuex</em>' reference.
	 * @see #setMaxValuex(DataType)
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.FhirDatatypePackage#getElementDefinition_MaxValuex()
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='maxValue[x]'"
	 * @generated
	 */
	DataType getMaxValuex();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.datatype.ElementDefinition#getMaxValuex <em>Max Valuex</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Valuex</em>' reference.
	 * @see #getMaxValuex()
	 * @generated
	 */
	void setMaxValuex(DataType value);

	/**
	 * Returns the value of the '<em><b>Max Length</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Length</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Length</em>' reference.
	 * @see #setMaxLength(org.eclipse.mdht.uml.fhir.core.datatype.Integer)
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.FhirDatatypePackage#getElementDefinition_MaxLength()
	 * @model
	 * @generated
	 */
	org.eclipse.mdht.uml.fhir.core.datatype.Integer getMaxLength();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.datatype.ElementDefinition#getMaxLength <em>Max Length</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Length</em>' reference.
	 * @see #getMaxLength()
	 * @generated
	 */
	void setMaxLength(org.eclipse.mdht.uml.fhir.core.datatype.Integer value);

	/**
	 * Returns the value of the '<em><b>Condition</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.mdht.uml.fhir.core.datatype.Id}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' reference list.
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.FhirDatatypePackage#getElementDefinition_Condition()
	 * @model
	 * @generated
	 */
	EList<Id> getConditions();

	/**
	 * Returns the value of the '<em><b>Constraint</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.mdht.uml.fhir.core.datatype.ElementDefinitionConstraint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constraint</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraint</em>' containment reference list.
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.FhirDatatypePackage#getElementDefinition_Constraint()
	 * @model containment="true"
	 * @generated
	 */
	EList<ElementDefinitionConstraint> getConstraints();

	/**
	 * Returns the value of the '<em><b>Must Support</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Must Support</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Must Support</em>' reference.
	 * @see #setMustSupport(org.eclipse.mdht.uml.fhir.core.datatype.Boolean)
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.FhirDatatypePackage#getElementDefinition_MustSupport()
	 * @model
	 * @generated
	 */
	org.eclipse.mdht.uml.fhir.core.datatype.Boolean getMustSupport();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.datatype.ElementDefinition#getMustSupport <em>Must Support</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Must Support</em>' reference.
	 * @see #getMustSupport()
	 * @generated
	 */
	void setMustSupport(org.eclipse.mdht.uml.fhir.core.datatype.Boolean value);

	/**
	 * Returns the value of the '<em><b>Is Modifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Modifier</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Modifier</em>' reference.
	 * @see #setIsModifier(org.eclipse.mdht.uml.fhir.core.datatype.Boolean)
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.FhirDatatypePackage#getElementDefinition_IsModifier()
	 * @model
	 * @generated
	 */
	org.eclipse.mdht.uml.fhir.core.datatype.Boolean getIsModifier();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.datatype.ElementDefinition#getIsModifier <em>Is Modifier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Modifier</em>' reference.
	 * @see #getIsModifier()
	 * @generated
	 */
	void setIsModifier(org.eclipse.mdht.uml.fhir.core.datatype.Boolean value);

	/**
	 * Returns the value of the '<em><b>Is Summary</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Summary</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Summary</em>' reference.
	 * @see #setIsSummary(org.eclipse.mdht.uml.fhir.core.datatype.Boolean)
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.FhirDatatypePackage#getElementDefinition_IsSummary()
	 * @model
	 * @generated
	 */
	org.eclipse.mdht.uml.fhir.core.datatype.Boolean getIsSummary();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.datatype.ElementDefinition#getIsSummary <em>Is Summary</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Summary</em>' reference.
	 * @see #getIsSummary()
	 * @generated
	 */
	void setIsSummary(org.eclipse.mdht.uml.fhir.core.datatype.Boolean value);

	/**
	 * Returns the value of the '<em><b>Binding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Binding</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Binding</em>' containment reference.
	 * @see #setBinding(ElementDefinitionBinding)
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.FhirDatatypePackage#getElementDefinition_Binding()
	 * @model containment="true"
	 * @generated
	 */
	ElementDefinitionBinding getBinding();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.datatype.ElementDefinition#getBinding <em>Binding</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Binding</em>' containment reference.
	 * @see #getBinding()
	 * @generated
	 */
	void setBinding(ElementDefinitionBinding value);

	/**
	 * Returns the value of the '<em><b>Mapping</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.mdht.uml.fhir.core.datatype.ElementDefinitionMapping}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mapping</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mapping</em>' containment reference list.
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.FhirDatatypePackage#getElementDefinition_Mapping()
	 * @model containment="true"
	 * @generated
	 */
	EList<ElementDefinitionMapping> getMappings();

} // ElementDefinition
