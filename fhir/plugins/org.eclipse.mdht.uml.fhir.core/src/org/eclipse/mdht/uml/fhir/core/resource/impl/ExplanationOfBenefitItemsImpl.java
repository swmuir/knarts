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
package org.eclipse.mdht.uml.fhir.core.resource.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.mdht.uml.fhir.core.datatype.Coding;
import org.eclipse.mdht.uml.fhir.core.datatype.DataType;
import org.eclipse.mdht.uml.fhir.core.datatype.Decimal;
import org.eclipse.mdht.uml.fhir.core.datatype.Money;
import org.eclipse.mdht.uml.fhir.core.datatype.PositiveInt;
import org.eclipse.mdht.uml.fhir.core.datatype.SimpleQuantity;

import org.eclipse.mdht.uml.fhir.core.datatype.impl.BackboneElementImpl;

import org.eclipse.mdht.uml.fhir.core.resource.ExplanationOfBenefitItems;
import org.eclipse.mdht.uml.fhir.core.resource.ExplanationOfBenefitItemsDetail;
import org.eclipse.mdht.uml.fhir.core.resource.ExplanationOfBenefitItemsItemAdjudication;
import org.eclipse.mdht.uml.fhir.core.resource.ExplanationOfBenefitItemsProsthesis;
import org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage;
import org.eclipse.mdht.uml.fhir.core.resource.Practitioner;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Explanation Of Benefit Items</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ExplanationOfBenefitItemsImpl#getSequence <em>Sequence</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ExplanationOfBenefitItemsImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ExplanationOfBenefitItemsImpl#getProvider <em>Provider</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ExplanationOfBenefitItemsImpl#getDiagnosisLinkIds <em>Diagnosis Link Id</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ExplanationOfBenefitItemsImpl#getService <em>Service</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ExplanationOfBenefitItemsImpl#getServicedx <em>Servicedx</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ExplanationOfBenefitItemsImpl#getPlace <em>Place</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ExplanationOfBenefitItemsImpl#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ExplanationOfBenefitItemsImpl#getUnitPrice <em>Unit Price</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ExplanationOfBenefitItemsImpl#getFactor <em>Factor</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ExplanationOfBenefitItemsImpl#getPoints <em>Points</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ExplanationOfBenefitItemsImpl#getNet <em>Net</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ExplanationOfBenefitItemsImpl#getUdi <em>Udi</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ExplanationOfBenefitItemsImpl#getBodySite <em>Body Site</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ExplanationOfBenefitItemsImpl#getSubSites <em>Sub Site</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ExplanationOfBenefitItemsImpl#getModifiers <em>Modifier</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ExplanationOfBenefitItemsImpl#getNoteNumbers <em>Note Number</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ExplanationOfBenefitItemsImpl#getAdjudications <em>Adjudication</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ExplanationOfBenefitItemsImpl#getDetails <em>Detail</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ExplanationOfBenefitItemsImpl#getProsthesis <em>Prosthesis</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExplanationOfBenefitItemsImpl extends BackboneElementImpl implements ExplanationOfBenefitItems {
	/**
	 * The cached value of the '{@link #getSequence() <em>Sequence</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequence()
	 * @generated
	 * @ordered
	 */
	protected PositiveInt sequence;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected Coding type;

	/**
	 * The cached value of the '{@link #getProvider() <em>Provider</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvider()
	 * @generated
	 * @ordered
	 */
	protected Practitioner provider;

	/**
	 * The cached value of the '{@link #getDiagnosisLinkIds() <em>Diagnosis Link Id</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiagnosisLinkIds()
	 * @generated
	 * @ordered
	 */
	protected EList<PositiveInt> diagnosisLinkIds;

	/**
	 * The cached value of the '{@link #getService() <em>Service</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getService()
	 * @generated
	 * @ordered
	 */
	protected Coding service;

	/**
	 * The cached value of the '{@link #getServicedx() <em>Servicedx</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServicedx()
	 * @generated
	 * @ordered
	 */
	protected DataType servicedx;

	/**
	 * The cached value of the '{@link #getPlace() <em>Place</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlace()
	 * @generated
	 * @ordered
	 */
	protected Coding place;

	/**
	 * The cached value of the '{@link #getQuantity() <em>Quantity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantity()
	 * @generated
	 * @ordered
	 */
	protected SimpleQuantity quantity;

	/**
	 * The cached value of the '{@link #getUnitPrice() <em>Unit Price</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnitPrice()
	 * @generated
	 * @ordered
	 */
	protected Money unitPrice;

	/**
	 * The cached value of the '{@link #getFactor() <em>Factor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFactor()
	 * @generated
	 * @ordered
	 */
	protected Decimal factor;

	/**
	 * The cached value of the '{@link #getPoints() <em>Points</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPoints()
	 * @generated
	 * @ordered
	 */
	protected Decimal points;

	/**
	 * The cached value of the '{@link #getNet() <em>Net</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNet()
	 * @generated
	 * @ordered
	 */
	protected Money net;

	/**
	 * The cached value of the '{@link #getUdi() <em>Udi</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUdi()
	 * @generated
	 * @ordered
	 */
	protected Coding udi;

	/**
	 * The cached value of the '{@link #getBodySite() <em>Body Site</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBodySite()
	 * @generated
	 * @ordered
	 */
	protected Coding bodySite;

	/**
	 * The cached value of the '{@link #getSubSites() <em>Sub Site</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubSites()
	 * @generated
	 * @ordered
	 */
	protected EList<Coding> subSites;

	/**
	 * The cached value of the '{@link #getModifiers() <em>Modifier</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModifiers()
	 * @generated
	 * @ordered
	 */
	protected EList<Coding> modifiers;

	/**
	 * The cached value of the '{@link #getNoteNumbers() <em>Note Number</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNoteNumbers()
	 * @generated
	 * @ordered
	 */
	protected EList<PositiveInt> noteNumbers;

	/**
	 * The cached value of the '{@link #getAdjudications() <em>Adjudication</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdjudications()
	 * @generated
	 * @ordered
	 */
	protected EList<ExplanationOfBenefitItemsItemAdjudication> adjudications;

	/**
	 * The cached value of the '{@link #getDetails() <em>Detail</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDetails()
	 * @generated
	 * @ordered
	 */
	protected EList<ExplanationOfBenefitItemsDetail> details;

	/**
	 * The cached value of the '{@link #getProsthesis() <em>Prosthesis</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProsthesis()
	 * @generated
	 * @ordered
	 */
	protected ExplanationOfBenefitItemsProsthesis prosthesis;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExplanationOfBenefitItemsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirResourcePackage.eINSTANCE.getExplanationOfBenefitItems();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PositiveInt getSequence() {
		if (sequence != null && sequence.eIsProxy()) {
			InternalEObject oldSequence = (InternalEObject)sequence;
			sequence = (PositiveInt)eResolveProxy(oldSequence);
			if (sequence != oldSequence) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.EXPLANATION_OF_BENEFIT_ITEMS__SEQUENCE, oldSequence, sequence));
			}
		}
		return sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PositiveInt basicGetSequence() {
		return sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSequence(PositiveInt newSequence) {
		PositiveInt oldSequence = sequence;
		sequence = newSequence;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.EXPLANATION_OF_BENEFIT_ITEMS__SEQUENCE, oldSequence, sequence));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coding getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject)type;
			type = (Coding)eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.EXPLANATION_OF_BENEFIT_ITEMS__TYPE, oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coding basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(Coding newType) {
		Coding oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.EXPLANATION_OF_BENEFIT_ITEMS__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Practitioner getProvider() {
		if (provider != null && provider.eIsProxy()) {
			InternalEObject oldProvider = (InternalEObject)provider;
			provider = (Practitioner)eResolveProxy(oldProvider);
			if (provider != oldProvider) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.EXPLANATION_OF_BENEFIT_ITEMS__PROVIDER, oldProvider, provider));
			}
		}
		return provider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Practitioner basicGetProvider() {
		return provider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProvider(Practitioner newProvider) {
		Practitioner oldProvider = provider;
		provider = newProvider;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.EXPLANATION_OF_BENEFIT_ITEMS__PROVIDER, oldProvider, provider));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PositiveInt> getDiagnosisLinkIds() {
		if (diagnosisLinkIds == null) {
			diagnosisLinkIds = new EObjectResolvingEList<PositiveInt>(PositiveInt.class, this, FhirResourcePackage.EXPLANATION_OF_BENEFIT_ITEMS__DIAGNOSIS_LINK_ID);
		}
		return diagnosisLinkIds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coding getService() {
		if (service != null && service.eIsProxy()) {
			InternalEObject oldService = (InternalEObject)service;
			service = (Coding)eResolveProxy(oldService);
			if (service != oldService) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.EXPLANATION_OF_BENEFIT_ITEMS__SERVICE, oldService, service));
			}
		}
		return service;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coding basicGetService() {
		return service;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setService(Coding newService) {
		Coding oldService = service;
		service = newService;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.EXPLANATION_OF_BENEFIT_ITEMS__SERVICE, oldService, service));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType getServicedx() {
		if (servicedx != null && servicedx.eIsProxy()) {
			InternalEObject oldServicedx = (InternalEObject)servicedx;
			servicedx = (DataType)eResolveProxy(oldServicedx);
			if (servicedx != oldServicedx) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.EXPLANATION_OF_BENEFIT_ITEMS__SERVICEDX, oldServicedx, servicedx));
			}
		}
		return servicedx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType basicGetServicedx() {
		return servicedx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServicedx(DataType newServicedx) {
		DataType oldServicedx = servicedx;
		servicedx = newServicedx;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.EXPLANATION_OF_BENEFIT_ITEMS__SERVICEDX, oldServicedx, servicedx));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coding getPlace() {
		if (place != null && place.eIsProxy()) {
			InternalEObject oldPlace = (InternalEObject)place;
			place = (Coding)eResolveProxy(oldPlace);
			if (place != oldPlace) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.EXPLANATION_OF_BENEFIT_ITEMS__PLACE, oldPlace, place));
			}
		}
		return place;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coding basicGetPlace() {
		return place;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlace(Coding newPlace) {
		Coding oldPlace = place;
		place = newPlace;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.EXPLANATION_OF_BENEFIT_ITEMS__PLACE, oldPlace, place));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleQuantity getQuantity() {
		if (quantity != null && quantity.eIsProxy()) {
			InternalEObject oldQuantity = (InternalEObject)quantity;
			quantity = (SimpleQuantity)eResolveProxy(oldQuantity);
			if (quantity != oldQuantity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.EXPLANATION_OF_BENEFIT_ITEMS__QUANTITY, oldQuantity, quantity));
			}
		}
		return quantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleQuantity basicGetQuantity() {
		return quantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuantity(SimpleQuantity newQuantity) {
		SimpleQuantity oldQuantity = quantity;
		quantity = newQuantity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.EXPLANATION_OF_BENEFIT_ITEMS__QUANTITY, oldQuantity, quantity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Money getUnitPrice() {
		if (unitPrice != null && unitPrice.eIsProxy()) {
			InternalEObject oldUnitPrice = (InternalEObject)unitPrice;
			unitPrice = (Money)eResolveProxy(oldUnitPrice);
			if (unitPrice != oldUnitPrice) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.EXPLANATION_OF_BENEFIT_ITEMS__UNIT_PRICE, oldUnitPrice, unitPrice));
			}
		}
		return unitPrice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Money basicGetUnitPrice() {
		return unitPrice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnitPrice(Money newUnitPrice) {
		Money oldUnitPrice = unitPrice;
		unitPrice = newUnitPrice;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.EXPLANATION_OF_BENEFIT_ITEMS__UNIT_PRICE, oldUnitPrice, unitPrice));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Decimal getFactor() {
		if (factor != null && factor.eIsProxy()) {
			InternalEObject oldFactor = (InternalEObject)factor;
			factor = (Decimal)eResolveProxy(oldFactor);
			if (factor != oldFactor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.EXPLANATION_OF_BENEFIT_ITEMS__FACTOR, oldFactor, factor));
			}
		}
		return factor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Decimal basicGetFactor() {
		return factor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFactor(Decimal newFactor) {
		Decimal oldFactor = factor;
		factor = newFactor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.EXPLANATION_OF_BENEFIT_ITEMS__FACTOR, oldFactor, factor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Decimal getPoints() {
		if (points != null && points.eIsProxy()) {
			InternalEObject oldPoints = (InternalEObject)points;
			points = (Decimal)eResolveProxy(oldPoints);
			if (points != oldPoints) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.EXPLANATION_OF_BENEFIT_ITEMS__POINTS, oldPoints, points));
			}
		}
		return points;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Decimal basicGetPoints() {
		return points;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPoints(Decimal newPoints) {
		Decimal oldPoints = points;
		points = newPoints;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.EXPLANATION_OF_BENEFIT_ITEMS__POINTS, oldPoints, points));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Money getNet() {
		if (net != null && net.eIsProxy()) {
			InternalEObject oldNet = (InternalEObject)net;
			net = (Money)eResolveProxy(oldNet);
			if (net != oldNet) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.EXPLANATION_OF_BENEFIT_ITEMS__NET, oldNet, net));
			}
		}
		return net;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Money basicGetNet() {
		return net;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNet(Money newNet) {
		Money oldNet = net;
		net = newNet;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.EXPLANATION_OF_BENEFIT_ITEMS__NET, oldNet, net));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coding getUdi() {
		if (udi != null && udi.eIsProxy()) {
			InternalEObject oldUdi = (InternalEObject)udi;
			udi = (Coding)eResolveProxy(oldUdi);
			if (udi != oldUdi) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.EXPLANATION_OF_BENEFIT_ITEMS__UDI, oldUdi, udi));
			}
		}
		return udi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coding basicGetUdi() {
		return udi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUdi(Coding newUdi) {
		Coding oldUdi = udi;
		udi = newUdi;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.EXPLANATION_OF_BENEFIT_ITEMS__UDI, oldUdi, udi));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coding getBodySite() {
		if (bodySite != null && bodySite.eIsProxy()) {
			InternalEObject oldBodySite = (InternalEObject)bodySite;
			bodySite = (Coding)eResolveProxy(oldBodySite);
			if (bodySite != oldBodySite) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.EXPLANATION_OF_BENEFIT_ITEMS__BODY_SITE, oldBodySite, bodySite));
			}
		}
		return bodySite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coding basicGetBodySite() {
		return bodySite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBodySite(Coding newBodySite) {
		Coding oldBodySite = bodySite;
		bodySite = newBodySite;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.EXPLANATION_OF_BENEFIT_ITEMS__BODY_SITE, oldBodySite, bodySite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Coding> getSubSites() {
		if (subSites == null) {
			subSites = new EObjectResolvingEList<Coding>(Coding.class, this, FhirResourcePackage.EXPLANATION_OF_BENEFIT_ITEMS__SUB_SITE);
		}
		return subSites;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Coding> getModifiers() {
		if (modifiers == null) {
			modifiers = new EObjectResolvingEList<Coding>(Coding.class, this, FhirResourcePackage.EXPLANATION_OF_BENEFIT_ITEMS__MODIFIER);
		}
		return modifiers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PositiveInt> getNoteNumbers() {
		if (noteNumbers == null) {
			noteNumbers = new EObjectResolvingEList<PositiveInt>(PositiveInt.class, this, FhirResourcePackage.EXPLANATION_OF_BENEFIT_ITEMS__NOTE_NUMBER);
		}
		return noteNumbers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExplanationOfBenefitItemsItemAdjudication> getAdjudications() {
		if (adjudications == null) {
			adjudications = new EObjectContainmentEList<ExplanationOfBenefitItemsItemAdjudication>(ExplanationOfBenefitItemsItemAdjudication.class, this, FhirResourcePackage.EXPLANATION_OF_BENEFIT_ITEMS__ADJUDICATION);
		}
		return adjudications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExplanationOfBenefitItemsDetail> getDetails() {
		if (details == null) {
			details = new EObjectContainmentEList<ExplanationOfBenefitItemsDetail>(ExplanationOfBenefitItemsDetail.class, this, FhirResourcePackage.EXPLANATION_OF_BENEFIT_ITEMS__DETAIL);
		}
		return details;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExplanationOfBenefitItemsProsthesis getProsthesis() {
		return prosthesis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProsthesis(ExplanationOfBenefitItemsProsthesis newProsthesis, NotificationChain msgs) {
		ExplanationOfBenefitItemsProsthesis oldProsthesis = prosthesis;
		prosthesis = newProsthesis;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirResourcePackage.EXPLANATION_OF_BENEFIT_ITEMS__PROSTHESIS, oldProsthesis, newProsthesis);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProsthesis(ExplanationOfBenefitItemsProsthesis newProsthesis) {
		if (newProsthesis != prosthesis) {
			NotificationChain msgs = null;
			if (prosthesis != null)
				msgs = ((InternalEObject)prosthesis).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirResourcePackage.EXPLANATION_OF_BENEFIT_ITEMS__PROSTHESIS, null, msgs);
			if (newProsthesis != null)
				msgs = ((InternalEObject)newProsthesis).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirResourcePackage.EXPLANATION_OF_BENEFIT_ITEMS__PROSTHESIS, null, msgs);
			msgs = basicSetProsthesis(newProsthesis, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.EXPLANATION_OF_BENEFIT_ITEMS__PROSTHESIS, newProsthesis, newProsthesis));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT_ITEMS__ADJUDICATION:
				return ((InternalEList<?>)getAdjudications()).basicRemove(otherEnd, msgs);
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT_ITEMS__DETAIL:
				return ((InternalEList<?>)getDetails()).basicRemove(otherEnd, msgs);
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT_ITEMS__PROSTHESIS:
				return basicSetProsthesis(null, msgs);
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
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT_ITEMS__SEQUENCE:
				if (resolve) return getSequence();
				return basicGetSequence();
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT_ITEMS__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT_ITEMS__PROVIDER:
				if (resolve) return getProvider();
				return basicGetProvider();
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT_ITEMS__DIAGNOSIS_LINK_ID:
				return getDiagnosisLinkIds();
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT_ITEMS__SERVICE:
				if (resolve) return getService();
				return basicGetService();
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT_ITEMS__SERVICEDX:
				if (resolve) return getServicedx();
				return basicGetServicedx();
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT_ITEMS__PLACE:
				if (resolve) return getPlace();
				return basicGetPlace();
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT_ITEMS__QUANTITY:
				if (resolve) return getQuantity();
				return basicGetQuantity();
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT_ITEMS__UNIT_PRICE:
				if (resolve) return getUnitPrice();
				return basicGetUnitPrice();
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT_ITEMS__FACTOR:
				if (resolve) return getFactor();
				return basicGetFactor();
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT_ITEMS__POINTS:
				if (resolve) return getPoints();
				return basicGetPoints();
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT_ITEMS__NET:
				if (resolve) return getNet();
				return basicGetNet();
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT_ITEMS__UDI:
				if (resolve) return getUdi();
				return basicGetUdi();
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT_ITEMS__BODY_SITE:
				if (resolve) return getBodySite();
				return basicGetBodySite();
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT_ITEMS__SUB_SITE:
				return getSubSites();
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT_ITEMS__MODIFIER:
				return getModifiers();
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT_ITEMS__NOTE_NUMBER:
				return getNoteNumbers();
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT_ITEMS__ADJUDICATION:
				return getAdjudications();
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT_ITEMS__DETAIL:
				return getDetails();
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT_ITEMS__PROSTHESIS:
				return getProsthesis();
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
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT_ITEMS__SEQUENCE:
				setSequence((PositiveInt)newValue);
				return;
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT_ITEMS__TYPE:
				setType((Coding)newValue);
				return;
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT_ITEMS__PROVIDER:
				setProvider((Practitioner)newValue);
				return;
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT_ITEMS__DIAGNOSIS_LINK_ID:
				getDiagnosisLinkIds().clear();
				getDiagnosisLinkIds().addAll((Collection<? extends PositiveInt>)newValue);
				return;
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT_ITEMS__SERVICE:
				setService((Coding)newValue);
				return;
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT_ITEMS__SERVICEDX:
				setServicedx((DataType)newValue);
				return;
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT_ITEMS__PLACE:
				setPlace((Coding)newValue);
				return;
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT_ITEMS__QUANTITY:
				setQuantity((SimpleQuantity)newValue);
				return;
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT_ITEMS__UNIT_PRICE:
				setUnitPrice((Money)newValue);
				return;
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT_ITEMS__FACTOR:
				setFactor((Decimal)newValue);
				return;
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT_ITEMS__POINTS:
				setPoints((Decimal)newValue);
				return;
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT_ITEMS__NET:
				setNet((Money)newValue);
				return;
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT_ITEMS__UDI:
				setUdi((Coding)newValue);
				return;
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT_ITEMS__BODY_SITE:
				setBodySite((Coding)newValue);
				return;
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT_ITEMS__SUB_SITE:
				getSubSites().clear();
				getSubSites().addAll((Collection<? extends Coding>)newValue);
				return;
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT_ITEMS__MODIFIER:
				getModifiers().clear();
				getModifiers().addAll((Collection<? extends Coding>)newValue);
				return;
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT_ITEMS__NOTE_NUMBER:
				getNoteNumbers().clear();
				getNoteNumbers().addAll((Collection<? extends PositiveInt>)newValue);
				return;
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT_ITEMS__ADJUDICATION:
				getAdjudications().clear();
				getAdjudications().addAll((Collection<? extends ExplanationOfBenefitItemsItemAdjudication>)newValue);
				return;
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT_ITEMS__DETAIL:
				getDetails().clear();
				getDetails().addAll((Collection<? extends ExplanationOfBenefitItemsDetail>)newValue);
				return;
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT_ITEMS__PROSTHESIS:
				setProsthesis((ExplanationOfBenefitItemsProsthesis)newValue);
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
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT_ITEMS__SEQUENCE:
				setSequence((PositiveInt)null);
				return;
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT_ITEMS__TYPE:
				setType((Coding)null);
				return;
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT_ITEMS__PROVIDER:
				setProvider((Practitioner)null);
				return;
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT_ITEMS__DIAGNOSIS_LINK_ID:
				getDiagnosisLinkIds().clear();
				return;
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT_ITEMS__SERVICE:
				setService((Coding)null);
				return;
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT_ITEMS__SERVICEDX:
				setServicedx((DataType)null);
				return;
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT_ITEMS__PLACE:
				setPlace((Coding)null);
				return;
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT_ITEMS__QUANTITY:
				setQuantity((SimpleQuantity)null);
				return;
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT_ITEMS__UNIT_PRICE:
				setUnitPrice((Money)null);
				return;
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT_ITEMS__FACTOR:
				setFactor((Decimal)null);
				return;
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT_ITEMS__POINTS:
				setPoints((Decimal)null);
				return;
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT_ITEMS__NET:
				setNet((Money)null);
				return;
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT_ITEMS__UDI:
				setUdi((Coding)null);
				return;
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT_ITEMS__BODY_SITE:
				setBodySite((Coding)null);
				return;
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT_ITEMS__SUB_SITE:
				getSubSites().clear();
				return;
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT_ITEMS__MODIFIER:
				getModifiers().clear();
				return;
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT_ITEMS__NOTE_NUMBER:
				getNoteNumbers().clear();
				return;
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT_ITEMS__ADJUDICATION:
				getAdjudications().clear();
				return;
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT_ITEMS__DETAIL:
				getDetails().clear();
				return;
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT_ITEMS__PROSTHESIS:
				setProsthesis((ExplanationOfBenefitItemsProsthesis)null);
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
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT_ITEMS__SEQUENCE:
				return sequence != null;
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT_ITEMS__TYPE:
				return type != null;
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT_ITEMS__PROVIDER:
				return provider != null;
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT_ITEMS__DIAGNOSIS_LINK_ID:
				return diagnosisLinkIds != null && !diagnosisLinkIds.isEmpty();
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT_ITEMS__SERVICE:
				return service != null;
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT_ITEMS__SERVICEDX:
				return servicedx != null;
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT_ITEMS__PLACE:
				return place != null;
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT_ITEMS__QUANTITY:
				return quantity != null;
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT_ITEMS__UNIT_PRICE:
				return unitPrice != null;
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT_ITEMS__FACTOR:
				return factor != null;
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT_ITEMS__POINTS:
				return points != null;
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT_ITEMS__NET:
				return net != null;
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT_ITEMS__UDI:
				return udi != null;
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT_ITEMS__BODY_SITE:
				return bodySite != null;
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT_ITEMS__SUB_SITE:
				return subSites != null && !subSites.isEmpty();
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT_ITEMS__MODIFIER:
				return modifiers != null && !modifiers.isEmpty();
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT_ITEMS__NOTE_NUMBER:
				return noteNumbers != null && !noteNumbers.isEmpty();
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT_ITEMS__ADJUDICATION:
				return adjudications != null && !adjudications.isEmpty();
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT_ITEMS__DETAIL:
				return details != null && !details.isEmpty();
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT_ITEMS__PROSTHESIS:
				return prosthesis != null;
		}
		return super.eIsSet(featureID);
	}

} //ExplanationOfBenefitItemsImpl
