/**
 */
package fhiRCore.dataTypes.util;

import fhiRCore.dataTypes.Address;
import fhiRCore.dataTypes.Age;
import fhiRCore.dataTypes.Annotation;
import fhiRCore.dataTypes.Attachment;
import fhiRCore.dataTypes.BackboneElement;
import fhiRCore.dataTypes.Base;
import fhiRCore.dataTypes.Base64Binary;
import fhiRCore.dataTypes.Canonical;
import fhiRCore.dataTypes.Code;
import fhiRCore.dataTypes.CodeableConcept;
import fhiRCore.dataTypes.Coding;
import fhiRCore.dataTypes.ContactDetail;
import fhiRCore.dataTypes.ContactPoint;
import fhiRCore.dataTypes.Contributor;
import fhiRCore.dataTypes.Count;
import fhiRCore.dataTypes.DataRequirement;
import fhiRCore.dataTypes.DataRequirementElement1;
import fhiRCore.dataTypes.DataRequirementElement2;
import fhiRCore.dataTypes.DataRequirementElement3;
import fhiRCore.dataTypes.DataType;
import fhiRCore.dataTypes.DataTypesPackage;
import fhiRCore.dataTypes.Date;
import fhiRCore.dataTypes.DateTime;
import fhiRCore.dataTypes.Decimal;
import fhiRCore.dataTypes.Distance;
import fhiRCore.dataTypes.Dosage;
import fhiRCore.dataTypes.DosageElement1;
import fhiRCore.dataTypes.Duration;
import fhiRCore.dataTypes.Element;
import fhiRCore.dataTypes.ElementDefinition;
import fhiRCore.dataTypes.ElementDefinitionElement1;
import fhiRCore.dataTypes.ElementDefinitionElement1Element1;
import fhiRCore.dataTypes.ElementDefinitionElement2;
import fhiRCore.dataTypes.ElementDefinitionElement3;
import fhiRCore.dataTypes.ElementDefinitionElement4;
import fhiRCore.dataTypes.ElementDefinitionElement5;
import fhiRCore.dataTypes.ElementDefinitionElement6;
import fhiRCore.dataTypes.ElementDefinitionElement7;
import fhiRCore.dataTypes.ElementId;
import fhiRCore.dataTypes.Expression;
import fhiRCore.dataTypes.Extension;
import fhiRCore.dataTypes.ExtensionUrl;
import fhiRCore.dataTypes.HumanName;
import fhiRCore.dataTypes.Id;
import fhiRCore.dataTypes.Identifier;
import fhiRCore.dataTypes.Instant;
import fhiRCore.dataTypes.Markdown;
import fhiRCore.dataTypes.MarketingStatus;
import fhiRCore.dataTypes.Meta;
import fhiRCore.dataTypes.Money;
import fhiRCore.dataTypes.MoneyQuantity;
import fhiRCore.dataTypes.Narrative;
import fhiRCore.dataTypes.Oid;
import fhiRCore.dataTypes.ParameterDefinition;
import fhiRCore.dataTypes.Period;
import fhiRCore.dataTypes.Population;
import fhiRCore.dataTypes.PositiveInt;
import fhiRCore.dataTypes.ProdCharacteristic;
import fhiRCore.dataTypes.ProductShelfLife;
import fhiRCore.dataTypes.Quantity;
import fhiRCore.dataTypes.Range;
import fhiRCore.dataTypes.Ratio;
import fhiRCore.dataTypes.Reference;
import fhiRCore.dataTypes.ReferenceRange;
import fhiRCore.dataTypes.RelatedArtifact;
import fhiRCore.dataTypes.SampledData;
import fhiRCore.dataTypes.Signature;
import fhiRCore.dataTypes.SimpleQuantity;
import fhiRCore.dataTypes.SubstanceAmount;
import fhiRCore.dataTypes.SubstanceAmountElement1;
import fhiRCore.dataTypes.Time;
import fhiRCore.dataTypes.Timing;
import fhiRCore.dataTypes.TimingElement1;
import fhiRCore.dataTypes.TriggerDefinition;
import fhiRCore.dataTypes.UnsignedInt;
import fhiRCore.dataTypes.Uri;
import fhiRCore.dataTypes.Url;
import fhiRCore.dataTypes.UsageContext;
import fhiRCore.dataTypes.Uuid;
import fhiRCore.dataTypes.Xhtml;
import fhiRCore.dataTypes.XhtmlValue;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see fhiRCore.dataTypes.DataTypesPackage
 * @generated
 */
public class DataTypesSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DataTypesPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataTypesSwitch() {
		if (modelPackage == null) {
			modelPackage = DataTypesPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case DataTypesPackage.ELEMENT: {
				Element element = (Element)theEObject;
				T result = caseElement(element);
				if (result == null) result = caseBase(element);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataTypesPackage.BASE: {
				Base base = (Base)theEObject;
				T result = caseBase(base);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataTypesPackage.ELEMENT_ID: {
				ElementId elementId = (ElementId)theEObject;
				T result = caseElementId(elementId);
				if (result == null) result = caseBackboneElement(elementId);
				if (result == null) result = caseDataType(elementId);
				if (result == null) result = caseElement(elementId);
				if (result == null) result = caseBase(elementId);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataTypesPackage.BACKBONE_ELEMENT: {
				BackboneElement backboneElement = (BackboneElement)theEObject;
				T result = caseBackboneElement(backboneElement);
				if (result == null) result = caseDataType(backboneElement);
				if (result == null) result = caseElement(backboneElement);
				if (result == null) result = caseBase(backboneElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataTypesPackage.DATA_TYPE: {
				DataType dataType = (DataType)theEObject;
				T result = caseDataType(dataType);
				if (result == null) result = caseElement(dataType);
				if (result == null) result = caseBase(dataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataTypesPackage.EXTENSION: {
				Extension extension = (Extension)theEObject;
				T result = caseExtension(extension);
				if (result == null) result = caseDataType(extension);
				if (result == null) result = caseElement(extension);
				if (result == null) result = caseBase(extension);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataTypesPackage.EXTENSION_URL: {
				ExtensionUrl extensionUrl = (ExtensionUrl)theEObject;
				T result = caseExtensionUrl(extensionUrl);
				if (result == null) result = caseBackboneElement(extensionUrl);
				if (result == null) result = caseDataType(extensionUrl);
				if (result == null) result = caseElement(extensionUrl);
				if (result == null) result = caseBase(extensionUrl);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataTypesPackage.BASE64_BINARY: {
				Base64Binary base64Binary = (Base64Binary)theEObject;
				T result = caseBase64Binary(base64Binary);
				if (result == null) result = caseDataType(base64Binary);
				if (result == null) result = caseElement(base64Binary);
				if (result == null) result = caseBase(base64Binary);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataTypesPackage.BOOLEAN: {
				fhiRCore.dataTypes.Boolean boolean_ = (fhiRCore.dataTypes.Boolean)theEObject;
				T result = caseBoolean(boolean_);
				if (result == null) result = caseDataType(boolean_);
				if (result == null) result = caseElement(boolean_);
				if (result == null) result = caseBase(boolean_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataTypesPackage.CANONICAL: {
				Canonical canonical = (Canonical)theEObject;
				T result = caseCanonical(canonical);
				if (result == null) result = caseUri(canonical);
				if (result == null) result = caseDataType(canonical);
				if (result == null) result = caseElement(canonical);
				if (result == null) result = caseBase(canonical);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataTypesPackage.URI: {
				Uri uri = (Uri)theEObject;
				T result = caseUri(uri);
				if (result == null) result = caseDataType(uri);
				if (result == null) result = caseElement(uri);
				if (result == null) result = caseBase(uri);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataTypesPackage.CODE: {
				Code code = (Code)theEObject;
				T result = caseCode(code);
				if (result == null) result = caseString(code);
				if (result == null) result = caseDataType(code);
				if (result == null) result = caseElement(code);
				if (result == null) result = caseBase(code);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataTypesPackage.STRING: {
				fhiRCore.dataTypes.String string = (fhiRCore.dataTypes.String)theEObject;
				T result = caseString(string);
				if (result == null) result = caseDataType(string);
				if (result == null) result = caseElement(string);
				if (result == null) result = caseBase(string);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataTypesPackage.DATE: {
				Date date = (Date)theEObject;
				T result = caseDate(date);
				if (result == null) result = caseDataType(date);
				if (result == null) result = caseElement(date);
				if (result == null) result = caseBase(date);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataTypesPackage.DATE_TIME: {
				DateTime dateTime = (DateTime)theEObject;
				T result = caseDateTime(dateTime);
				if (result == null) result = caseDataType(dateTime);
				if (result == null) result = caseElement(dateTime);
				if (result == null) result = caseBase(dateTime);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataTypesPackage.DECIMAL: {
				Decimal decimal = (Decimal)theEObject;
				T result = caseDecimal(decimal);
				if (result == null) result = caseDataType(decimal);
				if (result == null) result = caseElement(decimal);
				if (result == null) result = caseBase(decimal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataTypesPackage.ID: {
				Id id = (Id)theEObject;
				T result = caseId(id);
				if (result == null) result = caseString(id);
				if (result == null) result = caseDataType(id);
				if (result == null) result = caseElement(id);
				if (result == null) result = caseBase(id);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataTypesPackage.INSTANT: {
				Instant instant = (Instant)theEObject;
				T result = caseInstant(instant);
				if (result == null) result = caseDataType(instant);
				if (result == null) result = caseElement(instant);
				if (result == null) result = caseBase(instant);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataTypesPackage.INTEGER: {
				fhiRCore.dataTypes.Integer integer = (fhiRCore.dataTypes.Integer)theEObject;
				T result = caseInteger(integer);
				if (result == null) result = caseDataType(integer);
				if (result == null) result = caseElement(integer);
				if (result == null) result = caseBase(integer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataTypesPackage.MARKDOWN: {
				Markdown markdown = (Markdown)theEObject;
				T result = caseMarkdown(markdown);
				if (result == null) result = caseString(markdown);
				if (result == null) result = caseDataType(markdown);
				if (result == null) result = caseElement(markdown);
				if (result == null) result = caseBase(markdown);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataTypesPackage.OID: {
				Oid oid = (Oid)theEObject;
				T result = caseOid(oid);
				if (result == null) result = caseUri(oid);
				if (result == null) result = caseDataType(oid);
				if (result == null) result = caseElement(oid);
				if (result == null) result = caseBase(oid);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataTypesPackage.POSITIVE_INT: {
				PositiveInt positiveInt = (PositiveInt)theEObject;
				T result = casePositiveInt(positiveInt);
				if (result == null) result = caseInteger(positiveInt);
				if (result == null) result = caseDataType(positiveInt);
				if (result == null) result = caseElement(positiveInt);
				if (result == null) result = caseBase(positiveInt);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataTypesPackage.TIME: {
				Time time = (Time)theEObject;
				T result = caseTime(time);
				if (result == null) result = caseDataType(time);
				if (result == null) result = caseElement(time);
				if (result == null) result = caseBase(time);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataTypesPackage.UNSIGNED_INT: {
				UnsignedInt unsignedInt = (UnsignedInt)theEObject;
				T result = caseUnsignedInt(unsignedInt);
				if (result == null) result = caseInteger(unsignedInt);
				if (result == null) result = caseDataType(unsignedInt);
				if (result == null) result = caseElement(unsignedInt);
				if (result == null) result = caseBase(unsignedInt);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataTypesPackage.URL: {
				Url url = (Url)theEObject;
				T result = caseUrl(url);
				if (result == null) result = caseUri(url);
				if (result == null) result = caseDataType(url);
				if (result == null) result = caseElement(url);
				if (result == null) result = caseBase(url);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataTypesPackage.UUID: {
				Uuid uuid = (Uuid)theEObject;
				T result = caseUuid(uuid);
				if (result == null) result = caseUri(uuid);
				if (result == null) result = caseDataType(uuid);
				if (result == null) result = caseElement(uuid);
				if (result == null) result = caseBase(uuid);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataTypesPackage.ADDRESS: {
				Address address = (Address)theEObject;
				T result = caseAddress(address);
				if (result == null) result = caseDataType(address);
				if (result == null) result = caseElement(address);
				if (result == null) result = caseBase(address);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataTypesPackage.PERIOD: {
				Period period = (Period)theEObject;
				T result = casePeriod(period);
				if (result == null) result = caseDataType(period);
				if (result == null) result = caseElement(period);
				if (result == null) result = caseBase(period);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataTypesPackage.AGE: {
				Age age = (Age)theEObject;
				T result = caseAge(age);
				if (result == null) result = caseQuantity(age);
				if (result == null) result = caseDataType(age);
				if (result == null) result = caseElement(age);
				if (result == null) result = caseBase(age);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataTypesPackage.QUANTITY: {
				Quantity quantity = (Quantity)theEObject;
				T result = caseQuantity(quantity);
				if (result == null) result = caseDataType(quantity);
				if (result == null) result = caseElement(quantity);
				if (result == null) result = caseBase(quantity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataTypesPackage.ANNOTATION: {
				Annotation annotation = (Annotation)theEObject;
				T result = caseAnnotation(annotation);
				if (result == null) result = caseDataType(annotation);
				if (result == null) result = caseElement(annotation);
				if (result == null) result = caseBase(annotation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataTypesPackage.REFERENCE: {
				Reference reference = (Reference)theEObject;
				T result = caseReference(reference);
				if (result == null) result = caseDataType(reference);
				if (result == null) result = caseElement(reference);
				if (result == null) result = caseBase(reference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataTypesPackage.IDENTIFIER: {
				Identifier identifier = (Identifier)theEObject;
				T result = caseIdentifier(identifier);
				if (result == null) result = caseDataType(identifier);
				if (result == null) result = caseElement(identifier);
				if (result == null) result = caseBase(identifier);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataTypesPackage.CODEABLE_CONCEPT: {
				CodeableConcept codeableConcept = (CodeableConcept)theEObject;
				T result = caseCodeableConcept(codeableConcept);
				if (result == null) result = caseDataType(codeableConcept);
				if (result == null) result = caseElement(codeableConcept);
				if (result == null) result = caseBase(codeableConcept);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataTypesPackage.CODING: {
				Coding coding = (Coding)theEObject;
				T result = caseCoding(coding);
				if (result == null) result = caseDataType(coding);
				if (result == null) result = caseElement(coding);
				if (result == null) result = caseBase(coding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataTypesPackage.META: {
				Meta meta = (Meta)theEObject;
				T result = caseMeta(meta);
				if (result == null) result = caseDataType(meta);
				if (result == null) result = caseElement(meta);
				if (result == null) result = caseBase(meta);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataTypesPackage.NARRATIVE: {
				Narrative narrative = (Narrative)theEObject;
				T result = caseNarrative(narrative);
				if (result == null) result = caseDataType(narrative);
				if (result == null) result = caseElement(narrative);
				if (result == null) result = caseBase(narrative);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataTypesPackage.XHTML: {
				Xhtml xhtml = (Xhtml)theEObject;
				T result = caseXhtml(xhtml);
				if (result == null) result = caseDataType(xhtml);
				if (result == null) result = caseElement(xhtml);
				if (result == null) result = caseBase(xhtml);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataTypesPackage.XHTML_VALUE: {
				XhtmlValue xhtmlValue = (XhtmlValue)theEObject;
				T result = caseXhtmlValue(xhtmlValue);
				if (result == null) result = caseBackboneElement(xhtmlValue);
				if (result == null) result = caseDataType(xhtmlValue);
				if (result == null) result = caseElement(xhtmlValue);
				if (result == null) result = caseBase(xhtmlValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataTypesPackage.CONTACT_POINT: {
				ContactPoint contactPoint = (ContactPoint)theEObject;
				T result = caseContactPoint(contactPoint);
				if (result == null) result = caseDataType(contactPoint);
				if (result == null) result = caseElement(contactPoint);
				if (result == null) result = caseBase(contactPoint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataTypesPackage.HUMAN_NAME: {
				HumanName humanName = (HumanName)theEObject;
				T result = caseHumanName(humanName);
				if (result == null) result = caseDataType(humanName);
				if (result == null) result = caseElement(humanName);
				if (result == null) result = caseBase(humanName);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataTypesPackage.ATTACHMENT: {
				Attachment attachment = (Attachment)theEObject;
				T result = caseAttachment(attachment);
				if (result == null) result = caseDataType(attachment);
				if (result == null) result = caseElement(attachment);
				if (result == null) result = caseBase(attachment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataTypesPackage.CONTACT_DETAIL: {
				ContactDetail contactDetail = (ContactDetail)theEObject;
				T result = caseContactDetail(contactDetail);
				if (result == null) result = caseDataType(contactDetail);
				if (result == null) result = caseElement(contactDetail);
				if (result == null) result = caseBase(contactDetail);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataTypesPackage.USAGE_CONTEXT: {
				UsageContext usageContext = (UsageContext)theEObject;
				T result = caseUsageContext(usageContext);
				if (result == null) result = caseDataType(usageContext);
				if (result == null) result = caseElement(usageContext);
				if (result == null) result = caseBase(usageContext);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataTypesPackage.RANGE: {
				Range range = (Range)theEObject;
				T result = caseRange(range);
				if (result == null) result = caseDataType(range);
				if (result == null) result = caseElement(range);
				if (result == null) result = caseBase(range);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataTypesPackage.RELATED_ARTIFACT: {
				RelatedArtifact relatedArtifact = (RelatedArtifact)theEObject;
				T result = caseRelatedArtifact(relatedArtifact);
				if (result == null) result = caseDataType(relatedArtifact);
				if (result == null) result = caseElement(relatedArtifact);
				if (result == null) result = caseBase(relatedArtifact);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataTypesPackage.PARAMETER_DEFINITION: {
				ParameterDefinition parameterDefinition = (ParameterDefinition)theEObject;
				T result = caseParameterDefinition(parameterDefinition);
				if (result == null) result = caseDataType(parameterDefinition);
				if (result == null) result = caseElement(parameterDefinition);
				if (result == null) result = caseBase(parameterDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataTypesPackage.DATA_REQUIREMENT: {
				DataRequirement dataRequirement = (DataRequirement)theEObject;
				T result = caseDataRequirement(dataRequirement);
				if (result == null) result = caseDataType(dataRequirement);
				if (result == null) result = caseElement(dataRequirement);
				if (result == null) result = caseBase(dataRequirement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataTypesPackage.DATA_REQUIREMENT_ELEMENT1: {
				DataRequirementElement1 dataRequirementElement1 = (DataRequirementElement1)theEObject;
				T result = caseDataRequirementElement1(dataRequirementElement1);
				if (result == null) result = caseElement(dataRequirementElement1);
				if (result == null) result = caseBase(dataRequirementElement1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataTypesPackage.DATA_REQUIREMENT_ELEMENT2: {
				DataRequirementElement2 dataRequirementElement2 = (DataRequirementElement2)theEObject;
				T result = caseDataRequirementElement2(dataRequirementElement2);
				if (result == null) result = caseElement(dataRequirementElement2);
				if (result == null) result = caseBase(dataRequirementElement2);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataTypesPackage.DATA_REQUIREMENT_ELEMENT3: {
				DataRequirementElement3 dataRequirementElement3 = (DataRequirementElement3)theEObject;
				T result = caseDataRequirementElement3(dataRequirementElement3);
				if (result == null) result = caseElement(dataRequirementElement3);
				if (result == null) result = caseBase(dataRequirementElement3);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataTypesPackage.EXPRESSION: {
				Expression expression = (Expression)theEObject;
				T result = caseExpression(expression);
				if (result == null) result = caseDataType(expression);
				if (result == null) result = caseElement(expression);
				if (result == null) result = caseBase(expression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataTypesPackage.DURATION: {
				Duration duration = (Duration)theEObject;
				T result = caseDuration(duration);
				if (result == null) result = caseQuantity(duration);
				if (result == null) result = caseDataType(duration);
				if (result == null) result = caseElement(duration);
				if (result == null) result = caseBase(duration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataTypesPackage.TRIGGER_DEFINITION: {
				TriggerDefinition triggerDefinition = (TriggerDefinition)theEObject;
				T result = caseTriggerDefinition(triggerDefinition);
				if (result == null) result = caseDataType(triggerDefinition);
				if (result == null) result = caseElement(triggerDefinition);
				if (result == null) result = caseBase(triggerDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataTypesPackage.DOSAGE: {
				Dosage dosage = (Dosage)theEObject;
				T result = caseDosage(dosage);
				if (result == null) result = caseBackboneElement(dosage);
				if (result == null) result = caseDataType(dosage);
				if (result == null) result = caseElement(dosage);
				if (result == null) result = caseBase(dosage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataTypesPackage.TIMING: {
				Timing timing = (Timing)theEObject;
				T result = caseTiming(timing);
				if (result == null) result = caseBackboneElement(timing);
				if (result == null) result = caseDataType(timing);
				if (result == null) result = caseElement(timing);
				if (result == null) result = caseBase(timing);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataTypesPackage.TIMING_ELEMENT1: {
				TimingElement1 timingElement1 = (TimingElement1)theEObject;
				T result = caseTimingElement1(timingElement1);
				if (result == null) result = caseElement(timingElement1);
				if (result == null) result = caseBase(timingElement1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataTypesPackage.DOSAGE_ELEMENT1: {
				DosageElement1 dosageElement1 = (DosageElement1)theEObject;
				T result = caseDosageElement1(dosageElement1);
				if (result == null) result = caseElement(dosageElement1);
				if (result == null) result = caseBase(dosageElement1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataTypesPackage.RATIO: {
				Ratio ratio = (Ratio)theEObject;
				T result = caseRatio(ratio);
				if (result == null) result = caseDataType(ratio);
				if (result == null) result = caseElement(ratio);
				if (result == null) result = caseBase(ratio);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataTypesPackage.MONEY: {
				Money money = (Money)theEObject;
				T result = caseMoney(money);
				if (result == null) result = caseDataType(money);
				if (result == null) result = caseElement(money);
				if (result == null) result = caseBase(money);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataTypesPackage.SIGNATURE: {
				Signature signature = (Signature)theEObject;
				T result = caseSignature(signature);
				if (result == null) result = caseDataType(signature);
				if (result == null) result = caseElement(signature);
				if (result == null) result = caseBase(signature);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataTypesPackage.PRODUCT_SHELF_LIFE: {
				ProductShelfLife productShelfLife = (ProductShelfLife)theEObject;
				T result = caseProductShelfLife(productShelfLife);
				if (result == null) result = caseBackboneElement(productShelfLife);
				if (result == null) result = caseDataType(productShelfLife);
				if (result == null) result = caseElement(productShelfLife);
				if (result == null) result = caseBase(productShelfLife);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataTypesPackage.PROD_CHARACTERISTIC: {
				ProdCharacteristic prodCharacteristic = (ProdCharacteristic)theEObject;
				T result = caseProdCharacteristic(prodCharacteristic);
				if (result == null) result = caseBackboneElement(prodCharacteristic);
				if (result == null) result = caseDataType(prodCharacteristic);
				if (result == null) result = caseElement(prodCharacteristic);
				if (result == null) result = caseBase(prodCharacteristic);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataTypesPackage.MARKETING_STATUS: {
				MarketingStatus marketingStatus = (MarketingStatus)theEObject;
				T result = caseMarketingStatus(marketingStatus);
				if (result == null) result = caseBackboneElement(marketingStatus);
				if (result == null) result = caseDataType(marketingStatus);
				if (result == null) result = caseElement(marketingStatus);
				if (result == null) result = caseBase(marketingStatus);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataTypesPackage.POPULATION: {
				Population population = (Population)theEObject;
				T result = casePopulation(population);
				if (result == null) result = caseBackboneElement(population);
				if (result == null) result = caseDataType(population);
				if (result == null) result = caseElement(population);
				if (result == null) result = caseBase(population);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataTypesPackage.SUBSTANCE_AMOUNT: {
				SubstanceAmount substanceAmount = (SubstanceAmount)theEObject;
				T result = caseSubstanceAmount(substanceAmount);
				if (result == null) result = caseBackboneElement(substanceAmount);
				if (result == null) result = caseDataType(substanceAmount);
				if (result == null) result = caseElement(substanceAmount);
				if (result == null) result = caseBase(substanceAmount);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataTypesPackage.SUBSTANCE_AMOUNT_ELEMENT1: {
				SubstanceAmountElement1 substanceAmountElement1 = (SubstanceAmountElement1)theEObject;
				T result = caseSubstanceAmountElement1(substanceAmountElement1);
				if (result == null) result = caseElement(substanceAmountElement1);
				if (result == null) result = caseBase(substanceAmountElement1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataTypesPackage.ELEMENT_DEFINITION: {
				ElementDefinition elementDefinition = (ElementDefinition)theEObject;
				T result = caseElementDefinition(elementDefinition);
				if (result == null) result = caseBackboneElement(elementDefinition);
				if (result == null) result = caseDataType(elementDefinition);
				if (result == null) result = caseElement(elementDefinition);
				if (result == null) result = caseBase(elementDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataTypesPackage.ELEMENT_DEFINITION_ELEMENT1: {
				ElementDefinitionElement1 elementDefinitionElement1 = (ElementDefinitionElement1)theEObject;
				T result = caseElementDefinitionElement1(elementDefinitionElement1);
				if (result == null) result = caseElement(elementDefinitionElement1);
				if (result == null) result = caseBase(elementDefinitionElement1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataTypesPackage.ELEMENT_DEFINITION_ELEMENT1_ELEMENT1: {
				ElementDefinitionElement1Element1 elementDefinitionElement1Element1 = (ElementDefinitionElement1Element1)theEObject;
				T result = caseElementDefinitionElement1Element1(elementDefinitionElement1Element1);
				if (result == null) result = caseElement(elementDefinitionElement1Element1);
				if (result == null) result = caseBase(elementDefinitionElement1Element1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataTypesPackage.ELEMENT_DEFINITION_ELEMENT2: {
				ElementDefinitionElement2 elementDefinitionElement2 = (ElementDefinitionElement2)theEObject;
				T result = caseElementDefinitionElement2(elementDefinitionElement2);
				if (result == null) result = caseElement(elementDefinitionElement2);
				if (result == null) result = caseBase(elementDefinitionElement2);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataTypesPackage.ELEMENT_DEFINITION_ELEMENT3: {
				ElementDefinitionElement3 elementDefinitionElement3 = (ElementDefinitionElement3)theEObject;
				T result = caseElementDefinitionElement3(elementDefinitionElement3);
				if (result == null) result = caseElement(elementDefinitionElement3);
				if (result == null) result = caseBase(elementDefinitionElement3);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataTypesPackage.ELEMENT_DEFINITION_ELEMENT4: {
				ElementDefinitionElement4 elementDefinitionElement4 = (ElementDefinitionElement4)theEObject;
				T result = caseElementDefinitionElement4(elementDefinitionElement4);
				if (result == null) result = caseElement(elementDefinitionElement4);
				if (result == null) result = caseBase(elementDefinitionElement4);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataTypesPackage.ELEMENT_DEFINITION_ELEMENT5: {
				ElementDefinitionElement5 elementDefinitionElement5 = (ElementDefinitionElement5)theEObject;
				T result = caseElementDefinitionElement5(elementDefinitionElement5);
				if (result == null) result = caseElement(elementDefinitionElement5);
				if (result == null) result = caseBase(elementDefinitionElement5);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataTypesPackage.ELEMENT_DEFINITION_ELEMENT6: {
				ElementDefinitionElement6 elementDefinitionElement6 = (ElementDefinitionElement6)theEObject;
				T result = caseElementDefinitionElement6(elementDefinitionElement6);
				if (result == null) result = caseElement(elementDefinitionElement6);
				if (result == null) result = caseBase(elementDefinitionElement6);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataTypesPackage.ELEMENT_DEFINITION_ELEMENT7: {
				ElementDefinitionElement7 elementDefinitionElement7 = (ElementDefinitionElement7)theEObject;
				T result = caseElementDefinitionElement7(elementDefinitionElement7);
				if (result == null) result = caseElement(elementDefinitionElement7);
				if (result == null) result = caseBase(elementDefinitionElement7);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataTypesPackage.COUNT: {
				Count count = (Count)theEObject;
				T result = caseCount(count);
				if (result == null) result = caseQuantity(count);
				if (result == null) result = caseDataType(count);
				if (result == null) result = caseElement(count);
				if (result == null) result = caseBase(count);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataTypesPackage.DISTANCE: {
				Distance distance = (Distance)theEObject;
				T result = caseDistance(distance);
				if (result == null) result = caseQuantity(distance);
				if (result == null) result = caseDataType(distance);
				if (result == null) result = caseElement(distance);
				if (result == null) result = caseBase(distance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataTypesPackage.SAMPLED_DATA: {
				SampledData sampledData = (SampledData)theEObject;
				T result = caseSampledData(sampledData);
				if (result == null) result = caseDataType(sampledData);
				if (result == null) result = caseElement(sampledData);
				if (result == null) result = caseBase(sampledData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataTypesPackage.CONTRIBUTOR: {
				Contributor contributor = (Contributor)theEObject;
				T result = caseContributor(contributor);
				if (result == null) result = caseDataType(contributor);
				if (result == null) result = caseElement(contributor);
				if (result == null) result = caseBase(contributor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataTypesPackage.SIMPLE_QUANTITY: {
				SimpleQuantity simpleQuantity = (SimpleQuantity)theEObject;
				T result = caseSimpleQuantity(simpleQuantity);
				if (result == null) result = caseQuantity(simpleQuantity);
				if (result == null) result = caseDataType(simpleQuantity);
				if (result == null) result = caseElement(simpleQuantity);
				if (result == null) result = caseBase(simpleQuantity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataTypesPackage.MONEY_QUANTITY: {
				MoneyQuantity moneyQuantity = (MoneyQuantity)theEObject;
				T result = caseMoneyQuantity(moneyQuantity);
				if (result == null) result = caseQuantity(moneyQuantity);
				if (result == null) result = caseDataType(moneyQuantity);
				if (result == null) result = caseElement(moneyQuantity);
				if (result == null) result = caseBase(moneyQuantity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataTypesPackage.REFERENCE_RANGE: {
				ReferenceRange referenceRange = (ReferenceRange)theEObject;
				T result = caseReferenceRange(referenceRange);
				if (result == null) result = caseDataType(referenceRange);
				if (result == null) result = caseElement(referenceRange);
				if (result == null) result = caseBase(referenceRange);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElement(Element object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Base</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Base</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBase(Base object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element Id</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element Id</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElementId(ElementId object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Backbone Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Backbone Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBackboneElement(BackboneElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataType(DataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Extension</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Extension</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExtension(Extension object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Extension Url</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Extension Url</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExtensionUrl(ExtensionUrl object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Base64 Binary</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Base64 Binary</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBase64Binary(Base64Binary object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBoolean(fhiRCore.dataTypes.Boolean object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Canonical</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Canonical</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCanonical(Canonical object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Uri</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Uri</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUri(Uri object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Code</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Code</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCode(Code object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseString(fhiRCore.dataTypes.String object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Date</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Date</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDate(Date object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Date Time</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Date Time</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDateTime(DateTime object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Decimal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Decimal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDecimal(Decimal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Id</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Id</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseId(Id object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Instant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Instant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInstant(Instant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInteger(fhiRCore.dataTypes.Integer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Markdown</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Markdown</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMarkdown(Markdown object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Oid</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Oid</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOid(Oid object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Positive Int</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Positive Int</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePositiveInt(PositiveInt object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTime(Time object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unsigned Int</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unsigned Int</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnsignedInt(UnsignedInt object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Url</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Url</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUrl(Url object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Uuid</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Uuid</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUuid(Uuid object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Address</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Address</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAddress(Address object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Period</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Period</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePeriod(Period object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Age</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Age</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAge(Age object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Quantity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Quantity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQuantity(Quantity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Annotation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnnotation(Annotation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReference(Reference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Identifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Identifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIdentifier(Identifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Codeable Concept</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Codeable Concept</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCodeableConcept(CodeableConcept object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Coding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Coding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCoding(Coding object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Meta</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Meta</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMeta(Meta object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Narrative</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Narrative</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNarrative(Narrative object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Xhtml</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Xhtml</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXhtml(Xhtml object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Xhtml Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Xhtml Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXhtmlValue(XhtmlValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Contact Point</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Contact Point</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContactPoint(ContactPoint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Human Name</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Human Name</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHumanName(HumanName object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attachment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attachment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttachment(Attachment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Contact Detail</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Contact Detail</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContactDetail(ContactDetail object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Usage Context</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Usage Context</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUsageContext(UsageContext object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Range</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Range</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRange(Range object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Related Artifact</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Related Artifact</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelatedArtifact(RelatedArtifact object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameterDefinition(ParameterDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Requirement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataRequirement(DataRequirement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Requirement Element1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Requirement Element1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataRequirementElement1(DataRequirementElement1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Requirement Element2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Requirement Element2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataRequirementElement2(DataRequirementElement2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Requirement Element3</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Requirement Element3</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataRequirementElement3(DataRequirementElement3 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpression(Expression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Duration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Duration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDuration(Duration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trigger Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trigger Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTriggerDefinition(TriggerDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dosage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dosage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDosage(Dosage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Timing</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Timing</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTiming(Timing object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Timing Element1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Timing Element1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimingElement1(TimingElement1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dosage Element1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dosage Element1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDosageElement1(DosageElement1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ratio</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ratio</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRatio(Ratio object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Money</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Money</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMoney(Money object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Signature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Signature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSignature(Signature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Product Shelf Life</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Product Shelf Life</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProductShelfLife(ProductShelfLife object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Prod Characteristic</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Prod Characteristic</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProdCharacteristic(ProdCharacteristic object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Marketing Status</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Marketing Status</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMarketingStatus(MarketingStatus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Population</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Population</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePopulation(Population object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Substance Amount</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Substance Amount</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubstanceAmount(SubstanceAmount object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Substance Amount Element1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Substance Amount Element1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubstanceAmountElement1(SubstanceAmountElement1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElementDefinition(ElementDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element Definition Element1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element Definition Element1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElementDefinitionElement1(ElementDefinitionElement1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element Definition Element1 Element1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element Definition Element1 Element1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElementDefinitionElement1Element1(ElementDefinitionElement1Element1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element Definition Element2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element Definition Element2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElementDefinitionElement2(ElementDefinitionElement2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element Definition Element3</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element Definition Element3</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElementDefinitionElement3(ElementDefinitionElement3 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element Definition Element4</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element Definition Element4</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElementDefinitionElement4(ElementDefinitionElement4 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element Definition Element5</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element Definition Element5</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElementDefinitionElement5(ElementDefinitionElement5 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element Definition Element6</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element Definition Element6</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElementDefinitionElement6(ElementDefinitionElement6 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element Definition Element7</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element Definition Element7</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElementDefinitionElement7(ElementDefinitionElement7 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Count</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Count</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCount(Count object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Distance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Distance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDistance(Distance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sampled Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sampled Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSampledData(SampledData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Contributor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Contributor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContributor(Contributor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Simple Quantity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Simple Quantity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSimpleQuantity(SimpleQuantity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Money Quantity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Money Quantity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMoneyQuantity(MoneyQuantity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reference Range</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reference Range</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReferenceRange(ReferenceRange object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //DataTypesSwitch
