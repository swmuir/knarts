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
package org.eclipse.mdht.uml.fhir.core.datatype.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.mdht.uml.fhir.core.datatype.Address;
import org.eclipse.mdht.uml.fhir.core.datatype.Age;
import org.eclipse.mdht.uml.fhir.core.datatype.Annotation;
import org.eclipse.mdht.uml.fhir.core.datatype.Attachment;
import org.eclipse.mdht.uml.fhir.core.datatype.BackboneElement;
import org.eclipse.mdht.uml.fhir.core.datatype.Base64Binary;
import org.eclipse.mdht.uml.fhir.core.datatype.Code;
import org.eclipse.mdht.uml.fhir.core.datatype.CodeableConcept;
import org.eclipse.mdht.uml.fhir.core.datatype.Coding;
import org.eclipse.mdht.uml.fhir.core.datatype.ContactPoint;
import org.eclipse.mdht.uml.fhir.core.datatype.Count;
import org.eclipse.mdht.uml.fhir.core.datatype.Date;
import org.eclipse.mdht.uml.fhir.core.datatype.DateTime;
import org.eclipse.mdht.uml.fhir.core.datatype.Decimal;
import org.eclipse.mdht.uml.fhir.core.datatype.Distance;
import org.eclipse.mdht.uml.fhir.core.datatype.Duration;
import org.eclipse.mdht.uml.fhir.core.datatype.ElementDefinition;
import org.eclipse.mdht.uml.fhir.core.datatype.ElementDefinitionBase;
import org.eclipse.mdht.uml.fhir.core.datatype.ElementDefinitionBinding;
import org.eclipse.mdht.uml.fhir.core.datatype.ElementDefinitionConstraint;
import org.eclipse.mdht.uml.fhir.core.datatype.ElementDefinitionMapping;
import org.eclipse.mdht.uml.fhir.core.datatype.ElementDefinitionSlicing;
import org.eclipse.mdht.uml.fhir.core.datatype.ElementDefinitionTypeRef;
import org.eclipse.mdht.uml.fhir.core.datatype.Extension;
import org.eclipse.mdht.uml.fhir.core.datatype.FhirDatatypeFactory;
import org.eclipse.mdht.uml.fhir.core.datatype.FhirDatatypePackage;
import org.eclipse.mdht.uml.fhir.core.datatype.HumanName;
import org.eclipse.mdht.uml.fhir.core.datatype.Id;
import org.eclipse.mdht.uml.fhir.core.datatype.Identifier;
import org.eclipse.mdht.uml.fhir.core.datatype.Instant;
import org.eclipse.mdht.uml.fhir.core.datatype.Markdown;
import org.eclipse.mdht.uml.fhir.core.datatype.Meta;
import org.eclipse.mdht.uml.fhir.core.datatype.Money;
import org.eclipse.mdht.uml.fhir.core.datatype.Narrative;
import org.eclipse.mdht.uml.fhir.core.datatype.NarrativeDiv;
import org.eclipse.mdht.uml.fhir.core.datatype.Oid;
import org.eclipse.mdht.uml.fhir.core.datatype.Period;
import org.eclipse.mdht.uml.fhir.core.datatype.PositiveInt;
import org.eclipse.mdht.uml.fhir.core.datatype.Quantity;
import org.eclipse.mdht.uml.fhir.core.datatype.Range;
import org.eclipse.mdht.uml.fhir.core.datatype.Ratio;
import org.eclipse.mdht.uml.fhir.core.datatype.Reference;
import org.eclipse.mdht.uml.fhir.core.datatype.SampledData;
import org.eclipse.mdht.uml.fhir.core.datatype.Signature;
import org.eclipse.mdht.uml.fhir.core.datatype.SimpleQuantity;
import org.eclipse.mdht.uml.fhir.core.datatype.Time;
import org.eclipse.mdht.uml.fhir.core.datatype.Timing;
import org.eclipse.mdht.uml.fhir.core.datatype.TimingRepeat;
import org.eclipse.mdht.uml.fhir.core.datatype.UnsignedInt;
import org.eclipse.mdht.uml.fhir.core.datatype.Uri;
import org.eclipse.mdht.uml.fhir.core.datatype.Uuid;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FhirDatatypeFactoryImpl extends EFactoryImpl implements FhirDatatypeFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FhirDatatypeFactory init() {
		try {
			FhirDatatypeFactory theFhirDatatypeFactory = (FhirDatatypeFactory)EPackage.Registry.INSTANCE.getEFactory(FhirDatatypePackage.eNS_URI);
			if (theFhirDatatypeFactory != null) {
				return theFhirDatatypeFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new FhirDatatypeFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FhirDatatypeFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case FhirDatatypePackage.ID: return createId();
			case FhirDatatypePackage.STRING: return createString();
			case FhirDatatypePackage.EXTENSION: return createExtension();
			case FhirDatatypePackage.URI: return createUri();
			case FhirDatatypePackage.BOOLEAN: return createBoolean();
			case FhirDatatypePackage.INTEGER: return createInteger();
			case FhirDatatypePackage.DECIMAL: return createDecimal();
			case FhirDatatypePackage.BASE64_BINARY: return createBase64Binary();
			case FhirDatatypePackage.INSTANT: return createInstant();
			case FhirDatatypePackage.DATE: return createDate();
			case FhirDatatypePackage.DATE_TIME: return createDateTime();
			case FhirDatatypePackage.TIME: return createTime();
			case FhirDatatypePackage.CODE: return createCode();
			case FhirDatatypePackage.OID: return createOid();
			case FhirDatatypePackage.UNSIGNED_INT: return createUnsignedInt();
			case FhirDatatypePackage.POSITIVE_INT: return createPositiveInt();
			case FhirDatatypePackage.MARKDOWN: return createMarkdown();
			case FhirDatatypePackage.ANNOTATION: return createAnnotation();
			case FhirDatatypePackage.META: return createMeta();
			case FhirDatatypePackage.CODING: return createCoding();
			case FhirDatatypePackage.NARRATIVE: return createNarrative();
			case FhirDatatypePackage.NARRATIVE_DIV: return createNarrativeDiv();
			case FhirDatatypePackage.BACKBONE_ELEMENT: return createBackboneElement();
			case FhirDatatypePackage.IDENTIFIER: return createIdentifier();
			case FhirDatatypePackage.CODEABLE_CONCEPT: return createCodeableConcept();
			case FhirDatatypePackage.PERIOD: return createPeriod();
			case FhirDatatypePackage.HUMAN_NAME: return createHumanName();
			case FhirDatatypePackage.CONTACT_POINT: return createContactPoint();
			case FhirDatatypePackage.ADDRESS: return createAddress();
			case FhirDatatypePackage.ATTACHMENT: return createAttachment();
			case FhirDatatypePackage.MONEY: return createMoney();
			case FhirDatatypePackage.QUANTITY: return createQuantity();
			case FhirDatatypePackage.DURATION: return createDuration();
			case FhirDatatypePackage.SIMPLE_QUANTITY: return createSimpleQuantity();
			case FhirDatatypePackage.RATIO: return createRatio();
			case FhirDatatypePackage.RANGE: return createRange();
			case FhirDatatypePackage.TIMING: return createTiming();
			case FhirDatatypePackage.TIMING_REPEAT: return createTimingRepeat();
			case FhirDatatypePackage.ELEMENT_DEFINITION: return createElementDefinition();
			case FhirDatatypePackage.ELEMENT_DEFINITION_SLICING: return createElementDefinitionSlicing();
			case FhirDatatypePackage.ELEMENT_DEFINITION_BASE: return createElementDefinitionBase();
			case FhirDatatypePackage.ELEMENT_DEFINITION_TYPE_REF: return createElementDefinitionTypeRef();
			case FhirDatatypePackage.ELEMENT_DEFINITION_CONSTRAINT: return createElementDefinitionConstraint();
			case FhirDatatypePackage.ELEMENT_DEFINITION_BINDING: return createElementDefinitionBinding();
			case FhirDatatypePackage.ELEMENT_DEFINITION_MAPPING: return createElementDefinitionMapping();
			case FhirDatatypePackage.SIGNATURE: return createSignature();
			case FhirDatatypePackage.SAMPLED_DATA: return createSampledData();
			case FhirDatatypePackage.REFERENCE: return createReference();
			case FhirDatatypePackage.AGE: return createAge();
			case FhirDatatypePackage.COUNT: return createCount();
			case FhirDatatypePackage.DISTANCE: return createDistance();
			case FhirDatatypePackage.UUID: return createUuid();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Id createId() {
		IdImpl id = new IdImpl();
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.String createString() {
		StringImpl string = new StringImpl();
		return string;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Extension createExtension() {
		ExtensionImpl extension = new ExtensionImpl();
		return extension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Uri createUri() {
		UriImpl uri = new UriImpl();
		return uri;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.Boolean createBoolean() {
		BooleanImpl boolean_ = new BooleanImpl();
		return boolean_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.Integer createInteger() {
		IntegerImpl integer = new IntegerImpl();
		return integer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Decimal createDecimal() {
		DecimalImpl decimal = new DecimalImpl();
		return decimal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Base64Binary createBase64Binary() {
		Base64BinaryImpl base64Binary = new Base64BinaryImpl();
		return base64Binary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Instant createInstant() {
		InstantImpl instant = new InstantImpl();
		return instant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date createDate() {
		DateImpl date = new DateImpl();
		return date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime createDateTime() {
		DateTimeImpl dateTime = new DateTimeImpl();
		return dateTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Time createTime() {
		TimeImpl time = new TimeImpl();
		return time;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code createCode() {
		CodeImpl code = new CodeImpl();
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Oid createOid() {
		OidImpl oid = new OidImpl();
		return oid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnsignedInt createUnsignedInt() {
		UnsignedIntImpl unsignedInt = new UnsignedIntImpl();
		return unsignedInt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PositiveInt createPositiveInt() {
		PositiveIntImpl positiveInt = new PositiveIntImpl();
		return positiveInt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Markdown createMarkdown() {
		MarkdownImpl markdown = new MarkdownImpl();
		return markdown;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Annotation createAnnotation() {
		AnnotationImpl annotation = new AnnotationImpl();
		return annotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Meta createMeta() {
		MetaImpl meta = new MetaImpl();
		return meta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coding createCoding() {
		CodingImpl coding = new CodingImpl();
		return coding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Narrative createNarrative() {
		NarrativeImpl narrative = new NarrativeImpl();
		return narrative;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NarrativeDiv createNarrativeDiv() {
		NarrativeDivImpl narrativeDiv = new NarrativeDivImpl();
		return narrativeDiv;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BackboneElement createBackboneElement() {
		BackboneElementImpl backboneElement = new BackboneElementImpl();
		return backboneElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Identifier createIdentifier() {
		IdentifierImpl identifier = new IdentifierImpl();
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept createCodeableConcept() {
		CodeableConceptImpl codeableConcept = new CodeableConceptImpl();
		return codeableConcept;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Period createPeriod() {
		PeriodImpl period = new PeriodImpl();
		return period;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HumanName createHumanName() {
		HumanNameImpl humanName = new HumanNameImpl();
		return humanName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContactPoint createContactPoint() {
		ContactPointImpl contactPoint = new ContactPointImpl();
		return contactPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Address createAddress() {
		AddressImpl address = new AddressImpl();
		return address;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attachment createAttachment() {
		AttachmentImpl attachment = new AttachmentImpl();
		return attachment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Money createMoney() {
		MoneyImpl money = new MoneyImpl();
		return money;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Quantity createQuantity() {
		QuantityImpl quantity = new QuantityImpl();
		return quantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Duration createDuration() {
		DurationImpl duration = new DurationImpl();
		return duration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleQuantity createSimpleQuantity() {
		SimpleQuantityImpl simpleQuantity = new SimpleQuantityImpl();
		return simpleQuantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ratio createRatio() {
		RatioImpl ratio = new RatioImpl();
		return ratio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Range createRange() {
		RangeImpl range = new RangeImpl();
		return range;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Timing createTiming() {
		TimingImpl timing = new TimingImpl();
		return timing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimingRepeat createTimingRepeat() {
		TimingRepeatImpl timingRepeat = new TimingRepeatImpl();
		return timingRepeat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementDefinition createElementDefinition() {
		ElementDefinitionImpl elementDefinition = new ElementDefinitionImpl();
		return elementDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementDefinitionSlicing createElementDefinitionSlicing() {
		ElementDefinitionSlicingImpl elementDefinitionSlicing = new ElementDefinitionSlicingImpl();
		return elementDefinitionSlicing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementDefinitionBase createElementDefinitionBase() {
		ElementDefinitionBaseImpl elementDefinitionBase = new ElementDefinitionBaseImpl();
		return elementDefinitionBase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementDefinitionTypeRef createElementDefinitionTypeRef() {
		ElementDefinitionTypeRefImpl elementDefinitionTypeRef = new ElementDefinitionTypeRefImpl();
		return elementDefinitionTypeRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementDefinitionConstraint createElementDefinitionConstraint() {
		ElementDefinitionConstraintImpl elementDefinitionConstraint = new ElementDefinitionConstraintImpl();
		return elementDefinitionConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementDefinitionBinding createElementDefinitionBinding() {
		ElementDefinitionBindingImpl elementDefinitionBinding = new ElementDefinitionBindingImpl();
		return elementDefinitionBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementDefinitionMapping createElementDefinitionMapping() {
		ElementDefinitionMappingImpl elementDefinitionMapping = new ElementDefinitionMappingImpl();
		return elementDefinitionMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Signature createSignature() {
		SignatureImpl signature = new SignatureImpl();
		return signature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SampledData createSampledData() {
		SampledDataImpl sampledData = new SampledDataImpl();
		return sampledData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference createReference() {
		ReferenceImpl reference = new ReferenceImpl();
		return reference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Age createAge() {
		AgeImpl age = new AgeImpl();
		return age;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Count createCount() {
		CountImpl count = new CountImpl();
		return count;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Distance createDistance() {
		DistanceImpl distance = new DistanceImpl();
		return distance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Uuid createUuid() {
		UuidImpl uuid = new UuidImpl();
		return uuid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FhirDatatypePackage getFhirDatatypePackage() {
		return (FhirDatatypePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static FhirDatatypePackage getPackage() {
		return FhirDatatypePackage.eINSTANCE;
	}

} //FhirDatatypeFactoryImpl
