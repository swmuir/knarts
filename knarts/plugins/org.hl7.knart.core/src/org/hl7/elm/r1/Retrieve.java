/**
 */
package org.hl7.elm.r1;

import javax.xml.namespace.QName;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Retrieve</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The retrieve expression defines clinical data that will be used by the artifact. This expression allows clinically relevant filtering criteria to be provided in well-defined and computable way. This operation defines the integration boundary for artifacts. The result of a retrieve is defined to return the same data for subsequent invocations within the same evaluation request. This means in particular that patient data updates made during the evaluation request are not visible to the artifact. In effect, the patient data is a snapshot of the data as of the start of the evaluation. This ensures strict deterministic and functional behavior of the artifact, and allows the implementation engine freedom to cache intermediate results in order to improve performance.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.elm.r1.Retrieve#getCodes <em>Codes</em>}</li>
 *   <li>{@link org.hl7.elm.r1.Retrieve#getDateRange <em>Date Range</em>}</li>
 *   <li>{@link org.hl7.elm.r1.Retrieve#getCodeProperty <em>Code Property</em>}</li>
 *   <li>{@link org.hl7.elm.r1.Retrieve#getDataType <em>Data Type</em>}</li>
 *   <li>{@link org.hl7.elm.r1.Retrieve#getDateHighProperty <em>Date High Property</em>}</li>
 *   <li>{@link org.hl7.elm.r1.Retrieve#getDateLowProperty <em>Date Low Property</em>}</li>
 *   <li>{@link org.hl7.elm.r1.Retrieve#getDateProperty <em>Date Property</em>}</li>
 *   <li>{@link org.hl7.elm.r1.Retrieve#getIdProperty <em>Id Property</em>}</li>
 *   <li>{@link org.hl7.elm.r1.Retrieve#getScope <em>Scope</em>}</li>
 *   <li>{@link org.hl7.elm.r1.Retrieve#getTemplateId <em>Template Id</em>}</li>
 * </ul>
 *
 * @see org.hl7.elm.r1.R1Package#getRetrieve()
 * @model extendedMetaData="name='Retrieve' kind='elementOnly'"
 * @generated
 */
public interface Retrieve extends Expression {
	/**
	 * Returns the value of the '<em><b>Codes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The codes element optionally allows a set of codes to be provided. The codes list restricts the set of clinical statements returned to only those clinical statements that matched some code in the set.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Codes</em>' containment reference.
	 * @see #setCodes(Expression)
	 * @see org.hl7.elm.r1.R1Package#getRetrieve_Codes()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='codes' namespace='##targetNamespace'"
	 * @generated
	 */
	Expression getCodes();

	/**
	 * Sets the value of the '{@link org.hl7.elm.r1.Retrieve#getCodes <em>Codes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Codes</em>' containment reference.
	 * @see #getCodes()
	 * @generated
	 */
	void setCodes(Expression value);

	/**
	 * Returns the value of the '<em><b>Date Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The dateRange element optionally allows a date range to be provided. The clinical statements returned would be only those clinical statements whose date fell within the range specified.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Date Range</em>' containment reference.
	 * @see #setDateRange(Expression)
	 * @see org.hl7.elm.r1.R1Package#getRetrieve_DateRange()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='dateRange' namespace='##targetNamespace'"
	 * @generated
	 */
	Expression getDateRange();

	/**
	 * Sets the value of the '{@link org.hl7.elm.r1.Retrieve#getDateRange <em>Date Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Range</em>' containment reference.
	 * @see #getDateRange()
	 * @generated
	 */
	void setDateRange(Expression value);

	/**
	 * Returns the value of the '<em><b>Code Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The codeProperty attribute optionally specifies which property of the model contains the Code or Codes for the clinical statement.
	 * 						
	 * Note that this property could potentially be specified elsewhere as part of an implementation catalog, rather than on each Retrieve expression, but allowing them at the retrieve expression level gives the most flexibility.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Code Property</em>' attribute.
	 * @see #setCodeProperty(String)
	 * @see org.hl7.elm.r1.R1Package#getRetrieve_CodeProperty()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='codeProperty'"
	 * @generated
	 */
	String getCodeProperty();

	/**
	 * Sets the value of the '{@link org.hl7.elm.r1.Retrieve#getCodeProperty <em>Code Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code Property</em>' attribute.
	 * @see #getCodeProperty()
	 * @generated
	 */
	void setCodeProperty(String value);

	/**
	 * Returns the value of the '<em><b>Data Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The dataType attribute specifies the type of data being requested.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Data Type</em>' attribute.
	 * @see #setDataType(QName)
	 * @see org.hl7.elm.r1.R1Package#getRetrieve_DataType()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.QName" required="true"
	 *        extendedMetaData="kind='attribute' name='dataType'"
	 * @generated
	 */
	QName getDataType();

	/**
	 * Sets the value of the '{@link org.hl7.elm.r1.Retrieve#getDataType <em>Data Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Type</em>' attribute.
	 * @see #getDataType()
	 * @generated
	 */
	void setDataType(QName value);

	/**
	 * Returns the value of the '<em><b>Date High Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The dateHighProperty attribute optionally specifies which property of the model contains the high component of the clinically relevant date for the clinical statement.
	 * 
	 * Note that if the dateProperty is specified, the dateLowProperty and dateHighProperty attributes must not be present. And conversely, if the dateLowProperty and dateHighProperty attributes are specified, the dateProperty must not be present.
	 * 
	 * If the dateHighProperty is present, the dateLowProperty must also be present, and will be used to determine the date range value of instances. Filtering using the specified date range occurs as described in the dateProperty.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Date High Property</em>' attribute.
	 * @see #setDateHighProperty(String)
	 * @see org.hl7.elm.r1.R1Package#getRetrieve_DateHighProperty()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='dateHighProperty'"
	 * @generated
	 */
	String getDateHighProperty();

	/**
	 * Sets the value of the '{@link org.hl7.elm.r1.Retrieve#getDateHighProperty <em>Date High Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date High Property</em>' attribute.
	 * @see #getDateHighProperty()
	 * @generated
	 */
	void setDateHighProperty(String value);

	/**
	 * Returns the value of the '<em><b>Date Low Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The dateLowProperty attribute optionally specifies which property of the model contains the low component of the clinically relevant date for the clinical statement.
	 * 						
	 * Note that if the dateProperty is specified, the dateLowProperty and dateHighProperty attributes must not be present. And conversely, if the dateLowProperty and dateHighProperty attributes are specified, the dateProperty must not be present.
	 * 
	 * If the dateLowProperty is present, the dateHighProperty must also be present, and will be used to determine the date range value of instances. Filtering using the specified date range occurs as described in the dateProperty.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Date Low Property</em>' attribute.
	 * @see #setDateLowProperty(String)
	 * @see org.hl7.elm.r1.R1Package#getRetrieve_DateLowProperty()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='dateLowProperty'"
	 * @generated
	 */
	String getDateLowProperty();

	/**
	 * Sets the value of the '{@link org.hl7.elm.r1.Retrieve#getDateLowProperty <em>Date Low Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Low Property</em>' attribute.
	 * @see #getDateLowProperty()
	 * @generated
	 */
	void setDateLowProperty(String value);

	/**
	 * Returns the value of the '<em><b>Date Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The dateProperty attribute optionally specifies which property of the model contains the clinically relevant date for the clinical statement.
	 * 						
	 * This property is expected to reference a property that is either a DateTime, or an interval of DateTime. In either case, the result set will only include instances where the value of the dateProperty is during the date range. For date/time values, this means the date is both the same or after the beginning of the range, and the same or before the end of the range. For date/time interval values, this means that the entire interval is included in the date range.
	 * 
	 * Instances with no value for the dateProperty will not be included in the result set if a date range is specified.
	 * 
	 * Note that if the dateProperty is specified, the dateLowProperty and dateHighProperty attributes must not be present. And conversely, if the dateLowProperty and dateHighProperty attributes are specified, the dateProperty must not be present.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Date Property</em>' attribute.
	 * @see #setDateProperty(String)
	 * @see org.hl7.elm.r1.R1Package#getRetrieve_DateProperty()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='dateProperty'"
	 * @generated
	 */
	String getDateProperty();

	/**
	 * Sets the value of the '{@link org.hl7.elm.r1.Retrieve#getDateProperty <em>Date Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Property</em>' attribute.
	 * @see #getDateProperty()
	 * @generated
	 */
	void setDateProperty(String value);

	/**
	 * Returns the value of the '<em><b>Id Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The idProperty attribute specifies which property of the model contains the Id for the clinical statement.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Id Property</em>' attribute.
	 * @see #setIdProperty(String)
	 * @see org.hl7.elm.r1.R1Package#getRetrieve_IdProperty()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='idProperty'"
	 * @generated
	 */
	String getIdProperty();

	/**
	 * Sets the value of the '{@link org.hl7.elm.r1.Retrieve#getIdProperty <em>Id Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id Property</em>' attribute.
	 * @see #getIdProperty()
	 * @generated
	 */
	void setIdProperty(String value);

	/**
	 * Returns the value of the '<em><b>Scope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The scope attribute optionally specifies a name for the scope for this operator that can be used within expressions to reference the current element.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Scope</em>' attribute.
	 * @see #setScope(String)
	 * @see org.hl7.elm.r1.R1Package#getRetrieve_Scope()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='scope'"
	 * @generated
	 */
	String getScope();

	/**
	 * Sets the value of the '{@link org.hl7.elm.r1.Retrieve#getScope <em>Scope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scope</em>' attribute.
	 * @see #getScope()
	 * @generated
	 */
	void setScope(String value);

	/**
	 * Returns the value of the '<em><b>Template Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The templateId attribute specifies an optional template to be used. If specified, the retrieve is defined to return only objects that conform to the template.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Template Id</em>' attribute.
	 * @see #setTemplateId(String)
	 * @see org.hl7.elm.r1.R1Package#getRetrieve_TemplateId()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='templateId'"
	 * @generated
	 */
	String getTemplateId();

	/**
	 * Sets the value of the '{@link org.hl7.elm.r1.Retrieve#getTemplateId <em>Template Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Template Id</em>' attribute.
	 * @see #getTemplateId()
	 * @generated
	 */
	void setTemplateId(String value);

} // Retrieve
