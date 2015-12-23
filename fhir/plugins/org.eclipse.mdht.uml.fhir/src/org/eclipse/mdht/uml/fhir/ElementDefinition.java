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
package org.eclipse.mdht.uml.fhir;

import org.eclipse.emf.common.util.EList;

import org.eclipse.mdht.uml.fhir.types.DataType;

import org.eclipse.uml2.uml.Property;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.ElementDefinition#getBase_Property <em>Base Property</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.ElementDefinition#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.ElementDefinition#getLabel <em>Label</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.ElementDefinition#getMustSupport <em>Must Support</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.ElementDefinition#getIsModifier <em>Is Modifier</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.ElementDefinition#getIsSummary <em>Is Summary</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.ElementDefinition#getRepresentations <em>Representation</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.ElementDefinition#getDefault <em>Default</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.ElementDefinition#getMeaningWhenMissing <em>Meaning When Missing</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.ElementDefinition#getFixed <em>Fixed</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.ElementDefinition#getPattern <em>Pattern</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.ElementDefinition#getExample <em>Example</em>}</li>
 * </ul>
 *
 * @see org.eclipse.mdht.uml.fhir.FHIRPackage#getElementDefinition()
 * @model
 * @generated
 */
public interface ElementDefinition extends Element {
	/**
	 * Returns the value of the '<em><b>Base Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Property</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Property</em>' reference.
	 * @see #setBase_Property(Property)
	 * @see org.eclipse.mdht.uml.fhir.FHIRPackage#getElementDefinition_Base_Property()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Property getBase_Property();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.ElementDefinition#getBase_Property <em>Base Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Property</em>' reference.
	 * @see #getBase_Property()
	 * @generated
	 */
	void setBase_Property(Property value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eclipse.mdht.uml.fhir.FHIRPackage#getElementDefinition_Name()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.ElementDefinition#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see org.eclipse.mdht.uml.fhir.FHIRPackage#getElementDefinition_Label()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.ElementDefinition#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Returns the value of the '<em><b>Must Support</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Must Support</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Must Support</em>' attribute.
	 * @see #setMustSupport(Boolean)
	 * @see org.eclipse.mdht.uml.fhir.FHIRPackage#getElementDefinition_MustSupport()
	 * @model ordered="false"
	 * @generated
	 */
	Boolean getMustSupport();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.ElementDefinition#getMustSupport <em>Must Support</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Must Support</em>' attribute.
	 * @see #getMustSupport()
	 * @generated
	 */
	void setMustSupport(Boolean value);

	/**
	 * Returns the value of the '<em><b>Is Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Modifier</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Modifier</em>' attribute.
	 * @see #setIsModifier(Boolean)
	 * @see org.eclipse.mdht.uml.fhir.FHIRPackage#getElementDefinition_IsModifier()
	 * @model ordered="false"
	 * @generated
	 */
	Boolean getIsModifier();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.ElementDefinition#getIsModifier <em>Is Modifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Modifier</em>' attribute.
	 * @see #getIsModifier()
	 * @generated
	 */
	void setIsModifier(Boolean value);

	/**
	 * Returns the value of the '<em><b>Is Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Summary</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Summary</em>' attribute.
	 * @see #setIsSummary(Boolean)
	 * @see org.eclipse.mdht.uml.fhir.FHIRPackage#getElementDefinition_IsSummary()
	 * @model ordered="false"
	 * @generated
	 */
	Boolean getIsSummary();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.ElementDefinition#getIsSummary <em>Is Summary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Summary</em>' attribute.
	 * @see #getIsSummary()
	 * @generated
	 */
	void setIsSummary(Boolean value);

	/**
	 * Returns the value of the '<em><b>Representation</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.mdht.uml.fhir.PropertyRepresentationKind}.
	 * The literals are from the enumeration {@link org.eclipse.mdht.uml.fhir.PropertyRepresentationKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Representation</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Representation</em>' attribute list.
	 * @see org.eclipse.mdht.uml.fhir.PropertyRepresentationKind
	 * @see #isSetRepresentations()
	 * @see #unsetRepresentations()
	 * @see org.eclipse.mdht.uml.fhir.FHIRPackage#getElementDefinition_Representation()
	 * @model unsettable="true" ordered="false"
	 * @generated
	 */
	EList<PropertyRepresentationKind> getRepresentations();

	/**
	 * Unsets the value of the '{@link org.eclipse.mdht.uml.fhir.ElementDefinition#getRepresentations <em>Representation</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRepresentations()
	 * @see #getRepresentations()
	 * @generated
	 */
	void unsetRepresentations();

	/**
	 * Returns whether the value of the '{@link org.eclipse.mdht.uml.fhir.ElementDefinition#getRepresentations <em>Representation</em>}' attribute list is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Representation</em>' attribute list is set.
	 * @see #unsetRepresentations()
	 * @see #getRepresentations()
	 * @generated
	 */
	boolean isSetRepresentations();

	/**
	 * Returns the value of the '<em><b>Default</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default</em>' containment reference.
	 * @see #setDefault(DataType)
	 * @see org.eclipse.mdht.uml.fhir.FHIRPackage#getElementDefinition_Default()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	DataType getDefault();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.ElementDefinition#getDefault <em>Default</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default</em>' containment reference.
	 * @see #getDefault()
	 * @generated
	 */
	void setDefault(DataType value);

	/**
	 * Returns the value of the '<em><b>Meaning When Missing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Meaning When Missing</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Meaning When Missing</em>' attribute.
	 * @see #setMeaningWhenMissing(String)
	 * @see org.eclipse.mdht.uml.fhir.FHIRPackage#getElementDefinition_MeaningWhenMissing()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	String getMeaningWhenMissing();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.ElementDefinition#getMeaningWhenMissing <em>Meaning When Missing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Meaning When Missing</em>' attribute.
	 * @see #getMeaningWhenMissing()
	 * @generated
	 */
	void setMeaningWhenMissing(String value);

	/**
	 * Returns the value of the '<em><b>Fixed</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fixed</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fixed</em>' containment reference.
	 * @see #setFixed(DataType)
	 * @see org.eclipse.mdht.uml.fhir.FHIRPackage#getElementDefinition_Fixed()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	DataType getFixed();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.ElementDefinition#getFixed <em>Fixed</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fixed</em>' containment reference.
	 * @see #getFixed()
	 * @generated
	 */
	void setFixed(DataType value);

	/**
	 * Returns the value of the '<em><b>Pattern</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pattern</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pattern</em>' containment reference.
	 * @see #setPattern(DataType)
	 * @see org.eclipse.mdht.uml.fhir.FHIRPackage#getElementDefinition_Pattern()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	DataType getPattern();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.ElementDefinition#getPattern <em>Pattern</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pattern</em>' containment reference.
	 * @see #getPattern()
	 * @generated
	 */
	void setPattern(DataType value);

	/**
	 * Returns the value of the '<em><b>Example</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Example</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Example</em>' containment reference.
	 * @see #setExample(DataType)
	 * @see org.eclipse.mdht.uml.fhir.FHIRPackage#getElementDefinition_Example()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	DataType getExample();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.ElementDefinition#getExample <em>Example</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Example</em>' containment reference.
	 * @see #getExample()
	 * @generated
	 */
	void setExample(DataType value);

} // ElementDefinition
