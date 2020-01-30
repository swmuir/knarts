/**
 */
package fhiRCore.dataTypes;

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
 *   <li>{@link fhiRCore.dataTypes.ElementDefinition#getPath <em>Path</em>}</li>
 *   <li>{@link fhiRCore.dataTypes.ElementDefinition#getRepresentations <em>Representation</em>}</li>
 *   <li>{@link fhiRCore.dataTypes.ElementDefinition#getSliceName <em>Slice Name</em>}</li>
 *   <li>{@link fhiRCore.dataTypes.ElementDefinition#getSliceIsConstraining <em>Slice Is Constraining</em>}</li>
 *   <li>{@link fhiRCore.dataTypes.ElementDefinition#getLabel <em>Label</em>}</li>
 *   <li>{@link fhiRCore.dataTypes.ElementDefinition#getCodes <em>Code</em>}</li>
 *   <li>{@link fhiRCore.dataTypes.ElementDefinition#getSlicing <em>Slicing</em>}</li>
 *   <li>{@link fhiRCore.dataTypes.ElementDefinition#getShort <em>Short</em>}</li>
 *   <li>{@link fhiRCore.dataTypes.ElementDefinition#getDefinition <em>Definition</em>}</li>
 *   <li>{@link fhiRCore.dataTypes.ElementDefinition#getComment <em>Comment</em>}</li>
 *   <li>{@link fhiRCore.dataTypes.ElementDefinition#getRequirements <em>Requirements</em>}</li>
 *   <li>{@link fhiRCore.dataTypes.ElementDefinition#getAlias <em>Alias</em>}</li>
 *   <li>{@link fhiRCore.dataTypes.ElementDefinition#getMin <em>Min</em>}</li>
 *   <li>{@link fhiRCore.dataTypes.ElementDefinition#getMax <em>Max</em>}</li>
 *   <li>{@link fhiRCore.dataTypes.ElementDefinition#getBase <em>Base</em>}</li>
 *   <li>{@link fhiRCore.dataTypes.ElementDefinition#getContentReference <em>Content Reference</em>}</li>
 *   <li>{@link fhiRCore.dataTypes.ElementDefinition#getTypes <em>Type</em>}</li>
 *   <li>{@link fhiRCore.dataTypes.ElementDefinition#getDefaultValuex <em>Default Valuex</em>}</li>
 *   <li>{@link fhiRCore.dataTypes.ElementDefinition#getMeaningWhenMissing <em>Meaning When Missing</em>}</li>
 *   <li>{@link fhiRCore.dataTypes.ElementDefinition#getOrderMeaning <em>Order Meaning</em>}</li>
 *   <li>{@link fhiRCore.dataTypes.ElementDefinition#getFixedx <em>Fixedx</em>}</li>
 *   <li>{@link fhiRCore.dataTypes.ElementDefinition#getPatternx <em>Patternx</em>}</li>
 *   <li>{@link fhiRCore.dataTypes.ElementDefinition#getExamples <em>Example</em>}</li>
 *   <li>{@link fhiRCore.dataTypes.ElementDefinition#getMinValuex <em>Min Valuex</em>}</li>
 *   <li>{@link fhiRCore.dataTypes.ElementDefinition#getMaxValuex <em>Max Valuex</em>}</li>
 *   <li>{@link fhiRCore.dataTypes.ElementDefinition#getMaxLength <em>Max Length</em>}</li>
 *   <li>{@link fhiRCore.dataTypes.ElementDefinition#getConditions <em>Condition</em>}</li>
 *   <li>{@link fhiRCore.dataTypes.ElementDefinition#getConstraints <em>Constraint</em>}</li>
 *   <li>{@link fhiRCore.dataTypes.ElementDefinition#getMustSupport <em>Must Support</em>}</li>
 *   <li>{@link fhiRCore.dataTypes.ElementDefinition#getIsModifier <em>Is Modifier</em>}</li>
 *   <li>{@link fhiRCore.dataTypes.ElementDefinition#getIsModifierReason <em>Is Modifier Reason</em>}</li>
 *   <li>{@link fhiRCore.dataTypes.ElementDefinition#getIsSummary <em>Is Summary</em>}</li>
 *   <li>{@link fhiRCore.dataTypes.ElementDefinition#getBinding <em>Binding</em>}</li>
 *   <li>{@link fhiRCore.dataTypes.ElementDefinition#getMappings <em>Mapping</em>}</li>
 * </ul>
 *
 * @see fhiRCore.dataTypes.DataTypesPackage#getElementDefinition()
 * @model
 * @generated
 */
public interface ElementDefinition extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Path</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Path</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path</em>' containment reference.
	 * @see #setPath(fhiRCore.dataTypes.String)
	 * @see fhiRCore.dataTypes.DataTypesPackage#getElementDefinition_Path()
	 * @model containment="true" required="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getPath();

	/**
	 * Sets the value of the '{@link fhiRCore.dataTypes.ElementDefinition#getPath <em>Path</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path</em>' containment reference.
	 * @see #getPath()
	 * @generated
	 */
	void setPath(fhiRCore.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Representation</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.Code}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Representation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Representation</em>' containment reference list.
	 * @see fhiRCore.dataTypes.DataTypesPackage#getElementDefinition_Representation()
	 * @model containment="true"
	 * @generated
	 */
	EList<Code> getRepresentations();

	/**
	 * Returns the value of the '<em><b>Slice Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Slice Name</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Slice Name</em>' containment reference.
	 * @see #setSliceName(fhiRCore.dataTypes.String)
	 * @see fhiRCore.dataTypes.DataTypesPackage#getElementDefinition_SliceName()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getSliceName();

	/**
	 * Sets the value of the '{@link fhiRCore.dataTypes.ElementDefinition#getSliceName <em>Slice Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Slice Name</em>' containment reference.
	 * @see #getSliceName()
	 * @generated
	 */
	void setSliceName(fhiRCore.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Slice Is Constraining</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Slice Is Constraining</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Slice Is Constraining</em>' containment reference.
	 * @see #setSliceIsConstraining(fhiRCore.dataTypes.Boolean)
	 * @see fhiRCore.dataTypes.DataTypesPackage#getElementDefinition_SliceIsConstraining()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.Boolean getSliceIsConstraining();

	/**
	 * Sets the value of the '{@link fhiRCore.dataTypes.ElementDefinition#getSliceIsConstraining <em>Slice Is Constraining</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Slice Is Constraining</em>' containment reference.
	 * @see #getSliceIsConstraining()
	 * @generated
	 */
	void setSliceIsConstraining(fhiRCore.dataTypes.Boolean value);

	/**
	 * Returns the value of the '<em><b>Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' containment reference.
	 * @see #setLabel(fhiRCore.dataTypes.String)
	 * @see fhiRCore.dataTypes.DataTypesPackage#getElementDefinition_Label()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getLabel();

	/**
	 * Sets the value of the '{@link fhiRCore.dataTypes.ElementDefinition#getLabel <em>Label</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' containment reference.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(fhiRCore.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Code</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.Coding}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' containment reference list.
	 * @see fhiRCore.dataTypes.DataTypesPackage#getElementDefinition_Code()
	 * @model containment="true"
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
	 * @see #setSlicing(ElementDefinitionElement1)
	 * @see fhiRCore.dataTypes.DataTypesPackage#getElementDefinition_Slicing()
	 * @model containment="true"
	 * @generated
	 */
	ElementDefinitionElement1 getSlicing();

	/**
	 * Sets the value of the '{@link fhiRCore.dataTypes.ElementDefinition#getSlicing <em>Slicing</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Slicing</em>' containment reference.
	 * @see #getSlicing()
	 * @generated
	 */
	void setSlicing(ElementDefinitionElement1 value);

	/**
	 * Returns the value of the '<em><b>Short</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Short</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Short</em>' containment reference.
	 * @see #setShort(fhiRCore.dataTypes.String)
	 * @see fhiRCore.dataTypes.DataTypesPackage#getElementDefinition_Short()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getShort();

	/**
	 * Sets the value of the '{@link fhiRCore.dataTypes.ElementDefinition#getShort <em>Short</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Short</em>' containment reference.
	 * @see #getShort()
	 * @generated
	 */
	void setShort(fhiRCore.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Definition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Definition</em>' containment reference.
	 * @see #setDefinition(Markdown)
	 * @see fhiRCore.dataTypes.DataTypesPackage#getElementDefinition_Definition()
	 * @model containment="true"
	 * @generated
	 */
	Markdown getDefinition();

	/**
	 * Sets the value of the '{@link fhiRCore.dataTypes.ElementDefinition#getDefinition <em>Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Definition</em>' containment reference.
	 * @see #getDefinition()
	 * @generated
	 */
	void setDefinition(Markdown value);

	/**
	 * Returns the value of the '<em><b>Comment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comment</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comment</em>' containment reference.
	 * @see #setComment(Markdown)
	 * @see fhiRCore.dataTypes.DataTypesPackage#getElementDefinition_Comment()
	 * @model containment="true"
	 * @generated
	 */
	Markdown getComment();

	/**
	 * Sets the value of the '{@link fhiRCore.dataTypes.ElementDefinition#getComment <em>Comment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comment</em>' containment reference.
	 * @see #getComment()
	 * @generated
	 */
	void setComment(Markdown value);

	/**
	 * Returns the value of the '<em><b>Requirements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Requirements</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requirements</em>' containment reference.
	 * @see #setRequirements(Markdown)
	 * @see fhiRCore.dataTypes.DataTypesPackage#getElementDefinition_Requirements()
	 * @model containment="true"
	 * @generated
	 */
	Markdown getRequirements();

	/**
	 * Sets the value of the '{@link fhiRCore.dataTypes.ElementDefinition#getRequirements <em>Requirements</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Requirements</em>' containment reference.
	 * @see #getRequirements()
	 * @generated
	 */
	void setRequirements(Markdown value);

	/**
	 * Returns the value of the '<em><b>Alias</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alias</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alias</em>' containment reference list.
	 * @see fhiRCore.dataTypes.DataTypesPackage#getElementDefinition_Alias()
	 * @model containment="true"
	 * @generated
	 */
	EList<fhiRCore.dataTypes.String> getAlias();

	/**
	 * Returns the value of the '<em><b>Min</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min</em>' containment reference.
	 * @see #setMin(UnsignedInt)
	 * @see fhiRCore.dataTypes.DataTypesPackage#getElementDefinition_Min()
	 * @model containment="true"
	 * @generated
	 */
	UnsignedInt getMin();

	/**
	 * Sets the value of the '{@link fhiRCore.dataTypes.ElementDefinition#getMin <em>Min</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min</em>' containment reference.
	 * @see #getMin()
	 * @generated
	 */
	void setMin(UnsignedInt value);

	/**
	 * Returns the value of the '<em><b>Max</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max</em>' containment reference.
	 * @see #setMax(fhiRCore.dataTypes.String)
	 * @see fhiRCore.dataTypes.DataTypesPackage#getElementDefinition_Max()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getMax();

	/**
	 * Sets the value of the '{@link fhiRCore.dataTypes.ElementDefinition#getMax <em>Max</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max</em>' containment reference.
	 * @see #getMax()
	 * @generated
	 */
	void setMax(fhiRCore.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Base</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base</em>' containment reference.
	 * @see #setBase(ElementDefinitionElement2)
	 * @see fhiRCore.dataTypes.DataTypesPackage#getElementDefinition_Base()
	 * @model containment="true"
	 * @generated
	 */
	ElementDefinitionElement2 getBase();

	/**
	 * Sets the value of the '{@link fhiRCore.dataTypes.ElementDefinition#getBase <em>Base</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base</em>' containment reference.
	 * @see #getBase()
	 * @generated
	 */
	void setBase(ElementDefinitionElement2 value);

	/**
	 * Returns the value of the '<em><b>Content Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content Reference</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content Reference</em>' containment reference.
	 * @see #setContentReference(Uri)
	 * @see fhiRCore.dataTypes.DataTypesPackage#getElementDefinition_ContentReference()
	 * @model containment="true"
	 * @generated
	 */
	Uri getContentReference();

	/**
	 * Sets the value of the '{@link fhiRCore.dataTypes.ElementDefinition#getContentReference <em>Content Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content Reference</em>' containment reference.
	 * @see #getContentReference()
	 * @generated
	 */
	void setContentReference(Uri value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.ElementDefinitionElement3}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' containment reference list.
	 * @see fhiRCore.dataTypes.DataTypesPackage#getElementDefinition_Type()
	 * @model containment="true"
	 * @generated
	 */
	EList<ElementDefinitionElement3> getTypes();

	/**
	 * Returns the value of the '<em><b>Default Valuex</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Valuex</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Valuex</em>' containment reference.
	 * @see #setDefaultValuex(DataType)
	 * @see fhiRCore.dataTypes.DataTypesPackage#getElementDefinition_DefaultValuex()
	 * @model containment="true"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='defaultValue[x]'"
	 * @generated
	 */
	DataType getDefaultValuex();

	/**
	 * Sets the value of the '{@link fhiRCore.dataTypes.ElementDefinition#getDefaultValuex <em>Default Valuex</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Valuex</em>' containment reference.
	 * @see #getDefaultValuex()
	 * @generated
	 */
	void setDefaultValuex(DataType value);

	/**
	 * Returns the value of the '<em><b>Meaning When Missing</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Meaning When Missing</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Meaning When Missing</em>' containment reference.
	 * @see #setMeaningWhenMissing(Markdown)
	 * @see fhiRCore.dataTypes.DataTypesPackage#getElementDefinition_MeaningWhenMissing()
	 * @model containment="true"
	 * @generated
	 */
	Markdown getMeaningWhenMissing();

	/**
	 * Sets the value of the '{@link fhiRCore.dataTypes.ElementDefinition#getMeaningWhenMissing <em>Meaning When Missing</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Meaning When Missing</em>' containment reference.
	 * @see #getMeaningWhenMissing()
	 * @generated
	 */
	void setMeaningWhenMissing(Markdown value);

	/**
	 * Returns the value of the '<em><b>Order Meaning</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Order Meaning</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order Meaning</em>' containment reference.
	 * @see #setOrderMeaning(fhiRCore.dataTypes.String)
	 * @see fhiRCore.dataTypes.DataTypesPackage#getElementDefinition_OrderMeaning()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getOrderMeaning();

	/**
	 * Sets the value of the '{@link fhiRCore.dataTypes.ElementDefinition#getOrderMeaning <em>Order Meaning</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order Meaning</em>' containment reference.
	 * @see #getOrderMeaning()
	 * @generated
	 */
	void setOrderMeaning(fhiRCore.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Fixedx</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fixedx</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fixedx</em>' containment reference.
	 * @see #setFixedx(DataType)
	 * @see fhiRCore.dataTypes.DataTypesPackage#getElementDefinition_Fixedx()
	 * @model containment="true"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='fixed[x]'"
	 * @generated
	 */
	DataType getFixedx();

	/**
	 * Sets the value of the '{@link fhiRCore.dataTypes.ElementDefinition#getFixedx <em>Fixedx</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fixedx</em>' containment reference.
	 * @see #getFixedx()
	 * @generated
	 */
	void setFixedx(DataType value);

	/**
	 * Returns the value of the '<em><b>Patternx</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Patternx</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Patternx</em>' containment reference.
	 * @see #setPatternx(DataType)
	 * @see fhiRCore.dataTypes.DataTypesPackage#getElementDefinition_Patternx()
	 * @model containment="true"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='pattern[x]'"
	 * @generated
	 */
	DataType getPatternx();

	/**
	 * Sets the value of the '{@link fhiRCore.dataTypes.ElementDefinition#getPatternx <em>Patternx</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Patternx</em>' containment reference.
	 * @see #getPatternx()
	 * @generated
	 */
	void setPatternx(DataType value);

	/**
	 * Returns the value of the '<em><b>Example</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.ElementDefinitionElement4}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Example</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Example</em>' containment reference list.
	 * @see fhiRCore.dataTypes.DataTypesPackage#getElementDefinition_Example()
	 * @model containment="true"
	 * @generated
	 */
	EList<ElementDefinitionElement4> getExamples();

	/**
	 * Returns the value of the '<em><b>Min Valuex</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Valuex</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Valuex</em>' containment reference.
	 * @see #setMinValuex(DataType)
	 * @see fhiRCore.dataTypes.DataTypesPackage#getElementDefinition_MinValuex()
	 * @model containment="true"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='minValue[x]'"
	 * @generated
	 */
	DataType getMinValuex();

	/**
	 * Sets the value of the '{@link fhiRCore.dataTypes.ElementDefinition#getMinValuex <em>Min Valuex</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Valuex</em>' containment reference.
	 * @see #getMinValuex()
	 * @generated
	 */
	void setMinValuex(DataType value);

	/**
	 * Returns the value of the '<em><b>Max Valuex</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Valuex</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Valuex</em>' containment reference.
	 * @see #setMaxValuex(DataType)
	 * @see fhiRCore.dataTypes.DataTypesPackage#getElementDefinition_MaxValuex()
	 * @model containment="true"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='maxValue[x]'"
	 * @generated
	 */
	DataType getMaxValuex();

	/**
	 * Sets the value of the '{@link fhiRCore.dataTypes.ElementDefinition#getMaxValuex <em>Max Valuex</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Valuex</em>' containment reference.
	 * @see #getMaxValuex()
	 * @generated
	 */
	void setMaxValuex(DataType value);

	/**
	 * Returns the value of the '<em><b>Max Length</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Length</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Length</em>' containment reference.
	 * @see #setMaxLength(fhiRCore.dataTypes.Integer)
	 * @see fhiRCore.dataTypes.DataTypesPackage#getElementDefinition_MaxLength()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.Integer getMaxLength();

	/**
	 * Sets the value of the '{@link fhiRCore.dataTypes.ElementDefinition#getMaxLength <em>Max Length</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Length</em>' containment reference.
	 * @see #getMaxLength()
	 * @generated
	 */
	void setMaxLength(fhiRCore.dataTypes.Integer value);

	/**
	 * Returns the value of the '<em><b>Condition</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.Id}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' containment reference list.
	 * @see fhiRCore.dataTypes.DataTypesPackage#getElementDefinition_Condition()
	 * @model containment="true"
	 * @generated
	 */
	EList<Id> getConditions();

	/**
	 * Returns the value of the '<em><b>Constraint</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.ElementDefinitionElement5}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constraint</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraint</em>' containment reference list.
	 * @see fhiRCore.dataTypes.DataTypesPackage#getElementDefinition_Constraint()
	 * @model containment="true"
	 * @generated
	 */
	EList<ElementDefinitionElement5> getConstraints();

	/**
	 * Returns the value of the '<em><b>Must Support</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Must Support</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Must Support</em>' containment reference.
	 * @see #setMustSupport(fhiRCore.dataTypes.Boolean)
	 * @see fhiRCore.dataTypes.DataTypesPackage#getElementDefinition_MustSupport()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.Boolean getMustSupport();

	/**
	 * Sets the value of the '{@link fhiRCore.dataTypes.ElementDefinition#getMustSupport <em>Must Support</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Must Support</em>' containment reference.
	 * @see #getMustSupport()
	 * @generated
	 */
	void setMustSupport(fhiRCore.dataTypes.Boolean value);

	/**
	 * Returns the value of the '<em><b>Is Modifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Modifier</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Modifier</em>' containment reference.
	 * @see #setIsModifier(fhiRCore.dataTypes.Boolean)
	 * @see fhiRCore.dataTypes.DataTypesPackage#getElementDefinition_IsModifier()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.Boolean getIsModifier();

	/**
	 * Sets the value of the '{@link fhiRCore.dataTypes.ElementDefinition#getIsModifier <em>Is Modifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Modifier</em>' containment reference.
	 * @see #getIsModifier()
	 * @generated
	 */
	void setIsModifier(fhiRCore.dataTypes.Boolean value);

	/**
	 * Returns the value of the '<em><b>Is Modifier Reason</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Modifier Reason</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Modifier Reason</em>' containment reference.
	 * @see #setIsModifierReason(fhiRCore.dataTypes.String)
	 * @see fhiRCore.dataTypes.DataTypesPackage#getElementDefinition_IsModifierReason()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getIsModifierReason();

	/**
	 * Sets the value of the '{@link fhiRCore.dataTypes.ElementDefinition#getIsModifierReason <em>Is Modifier Reason</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Modifier Reason</em>' containment reference.
	 * @see #getIsModifierReason()
	 * @generated
	 */
	void setIsModifierReason(fhiRCore.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Is Summary</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Summary</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Summary</em>' containment reference.
	 * @see #setIsSummary(fhiRCore.dataTypes.Boolean)
	 * @see fhiRCore.dataTypes.DataTypesPackage#getElementDefinition_IsSummary()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.Boolean getIsSummary();

	/**
	 * Sets the value of the '{@link fhiRCore.dataTypes.ElementDefinition#getIsSummary <em>Is Summary</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Summary</em>' containment reference.
	 * @see #getIsSummary()
	 * @generated
	 */
	void setIsSummary(fhiRCore.dataTypes.Boolean value);

	/**
	 * Returns the value of the '<em><b>Binding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Binding</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Binding</em>' containment reference.
	 * @see #setBinding(ElementDefinitionElement6)
	 * @see fhiRCore.dataTypes.DataTypesPackage#getElementDefinition_Binding()
	 * @model containment="true"
	 * @generated
	 */
	ElementDefinitionElement6 getBinding();

	/**
	 * Sets the value of the '{@link fhiRCore.dataTypes.ElementDefinition#getBinding <em>Binding</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Binding</em>' containment reference.
	 * @see #getBinding()
	 * @generated
	 */
	void setBinding(ElementDefinitionElement6 value);

	/**
	 * Returns the value of the '<em><b>Mapping</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.ElementDefinitionElement7}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mapping</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mapping</em>' containment reference list.
	 * @see fhiRCore.dataTypes.DataTypesPackage#getElementDefinition_Mapping()
	 * @model containment="true"
	 * @generated
	 */
	EList<ElementDefinitionElement7> getMappings();

} // ElementDefinition
