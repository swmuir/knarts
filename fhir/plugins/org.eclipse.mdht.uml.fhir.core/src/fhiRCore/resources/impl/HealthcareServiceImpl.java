/**
 */
package fhiRCore.resources.impl;

import fhiRCore.dataTypes.Attachment;
import fhiRCore.dataTypes.CodeableConcept;
import fhiRCore.dataTypes.ContactPoint;
import fhiRCore.dataTypes.Identifier;
import fhiRCore.dataTypes.Markdown;
import fhiRCore.dataTypes.Reference;

import fhiRCore.resources.HealthcareService;
import fhiRCore.resources.HealthcareServiceAvailableTime;
import fhiRCore.resources.HealthcareServiceEligibility;
import fhiRCore.resources.HealthcareServiceNotAvailable;
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
 * An implementation of the model object '<em><b>Healthcare Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.impl.HealthcareServiceImpl#getIdentifiers <em>Identifier</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.HealthcareServiceImpl#getActive <em>Active</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.HealthcareServiceImpl#getProvidedBy <em>Provided By</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.HealthcareServiceImpl#getCategories <em>Category</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.HealthcareServiceImpl#getTypes <em>Type</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.HealthcareServiceImpl#getSpecialties <em>Specialty</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.HealthcareServiceImpl#getLocations <em>Location</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.HealthcareServiceImpl#getName <em>Name</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.HealthcareServiceImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.HealthcareServiceImpl#getExtraDetails <em>Extra Details</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.HealthcareServiceImpl#getPhoto <em>Photo</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.HealthcareServiceImpl#getTelecoms <em>Telecom</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.HealthcareServiceImpl#getCoverageAreas <em>Coverage Area</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.HealthcareServiceImpl#getServiceProvisionCodes <em>Service Provision Code</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.HealthcareServiceImpl#getEligibilities <em>Eligibility</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.HealthcareServiceImpl#getPrograms <em>Program</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.HealthcareServiceImpl#getCharacteristics <em>Characteristic</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.HealthcareServiceImpl#getCommunications <em>Communication</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.HealthcareServiceImpl#getReferralMethods <em>Referral Method</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.HealthcareServiceImpl#getAppointmentRequired <em>Appointment Required</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.HealthcareServiceImpl#getAvailableTimes <em>Available Time</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.HealthcareServiceImpl#getNotAvailables <em>Not Available</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.HealthcareServiceImpl#getAvailabilityExceptions <em>Availability Exceptions</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.HealthcareServiceImpl#getEndpoints <em>Endpoint</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HealthcareServiceImpl extends DomainResourceImpl implements HealthcareService {
	/**
	 * The cached value of the '{@link #getIdentifiers() <em>Identifier</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifiers()
	 * @generated
	 * @ordered
	 */
	protected EList<Identifier> identifiers;

	/**
	 * The cached value of the '{@link #getActive() <em>Active</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActive()
	 * @generated
	 * @ordered
	 */
	protected fhiRCore.dataTypes.Boolean active;

	/**
	 * The cached value of the '{@link #getProvidedBy() <em>Provided By</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvidedBy()
	 * @generated
	 * @ordered
	 */
	protected Reference providedBy;

	/**
	 * The cached value of the '{@link #getCategories() <em>Category</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategories()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> categories;

	/**
	 * The cached value of the '{@link #getTypes() <em>Type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> types;

	/**
	 * The cached value of the '{@link #getSpecialties() <em>Specialty</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecialties()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> specialties;

	/**
	 * The cached value of the '{@link #getLocations() <em>Location</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocations()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> locations;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected fhiRCore.dataTypes.String name;

	/**
	 * The cached value of the '{@link #getComment() <em>Comment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected fhiRCore.dataTypes.String comment;

	/**
	 * The cached value of the '{@link #getExtraDetails() <em>Extra Details</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtraDetails()
	 * @generated
	 * @ordered
	 */
	protected Markdown extraDetails;

	/**
	 * The cached value of the '{@link #getPhoto() <em>Photo</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhoto()
	 * @generated
	 * @ordered
	 */
	protected Attachment photo;

	/**
	 * The cached value of the '{@link #getTelecoms() <em>Telecom</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTelecoms()
	 * @generated
	 * @ordered
	 */
	protected EList<ContactPoint> telecoms;

	/**
	 * The cached value of the '{@link #getCoverageAreas() <em>Coverage Area</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoverageAreas()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> coverageAreas;

	/**
	 * The cached value of the '{@link #getServiceProvisionCodes() <em>Service Provision Code</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceProvisionCodes()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> serviceProvisionCodes;

	/**
	 * The cached value of the '{@link #getEligibilities() <em>Eligibility</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEligibilities()
	 * @generated
	 * @ordered
	 */
	protected EList<HealthcareServiceEligibility> eligibilities;

	/**
	 * The cached value of the '{@link #getPrograms() <em>Program</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrograms()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> programs;

	/**
	 * The cached value of the '{@link #getCharacteristics() <em>Characteristic</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCharacteristics()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> characteristics;

	/**
	 * The cached value of the '{@link #getCommunications() <em>Communication</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommunications()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> communications;

	/**
	 * The cached value of the '{@link #getReferralMethods() <em>Referral Method</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferralMethods()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> referralMethods;

	/**
	 * The cached value of the '{@link #getAppointmentRequired() <em>Appointment Required</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAppointmentRequired()
	 * @generated
	 * @ordered
	 */
	protected fhiRCore.dataTypes.Boolean appointmentRequired;

	/**
	 * The cached value of the '{@link #getAvailableTimes() <em>Available Time</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvailableTimes()
	 * @generated
	 * @ordered
	 */
	protected EList<HealthcareServiceAvailableTime> availableTimes;

	/**
	 * The cached value of the '{@link #getNotAvailables() <em>Not Available</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotAvailables()
	 * @generated
	 * @ordered
	 */
	protected EList<HealthcareServiceNotAvailable> notAvailables;

	/**
	 * The cached value of the '{@link #getAvailabilityExceptions() <em>Availability Exceptions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvailabilityExceptions()
	 * @generated
	 * @ordered
	 */
	protected fhiRCore.dataTypes.String availabilityExceptions;

	/**
	 * The cached value of the '{@link #getEndpoints() <em>Endpoint</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndpoints()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> endpoints;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HealthcareServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getHealthcareService();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Identifier> getIdentifiers() {
		if (identifiers == null) {
			identifiers = new EObjectContainmentEList<Identifier>(Identifier.class, this, ResourcesPackage.HEALTHCARE_SERVICE__IDENTIFIER);
		}
		return identifiers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public fhiRCore.dataTypes.Boolean getActive() {
		return active;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetActive(fhiRCore.dataTypes.Boolean newActive, NotificationChain msgs) {
		fhiRCore.dataTypes.Boolean oldActive = active;
		active = newActive;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.HEALTHCARE_SERVICE__ACTIVE, oldActive, newActive);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActive(fhiRCore.dataTypes.Boolean newActive) {
		if (newActive != active) {
			NotificationChain msgs = null;
			if (active != null)
				msgs = ((InternalEObject)active).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.HEALTHCARE_SERVICE__ACTIVE, null, msgs);
			if (newActive != null)
				msgs = ((InternalEObject)newActive).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.HEALTHCARE_SERVICE__ACTIVE, null, msgs);
			msgs = basicSetActive(newActive, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.HEALTHCARE_SERVICE__ACTIVE, newActive, newActive));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getProvidedBy() {
		return providedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProvidedBy(Reference newProvidedBy, NotificationChain msgs) {
		Reference oldProvidedBy = providedBy;
		providedBy = newProvidedBy;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.HEALTHCARE_SERVICE__PROVIDED_BY, oldProvidedBy, newProvidedBy);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProvidedBy(Reference newProvidedBy) {
		if (newProvidedBy != providedBy) {
			NotificationChain msgs = null;
			if (providedBy != null)
				msgs = ((InternalEObject)providedBy).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.HEALTHCARE_SERVICE__PROVIDED_BY, null, msgs);
			if (newProvidedBy != null)
				msgs = ((InternalEObject)newProvidedBy).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.HEALTHCARE_SERVICE__PROVIDED_BY, null, msgs);
			msgs = basicSetProvidedBy(newProvidedBy, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.HEALTHCARE_SERVICE__PROVIDED_BY, newProvidedBy, newProvidedBy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getCategories() {
		if (categories == null) {
			categories = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, ResourcesPackage.HEALTHCARE_SERVICE__CATEGORY);
		}
		return categories;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getTypes() {
		if (types == null) {
			types = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, ResourcesPackage.HEALTHCARE_SERVICE__TYPE);
		}
		return types;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getSpecialties() {
		if (specialties == null) {
			specialties = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, ResourcesPackage.HEALTHCARE_SERVICE__SPECIALTY);
		}
		return specialties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getLocations() {
		if (locations == null) {
			locations = new EObjectContainmentEList<Reference>(Reference.class, this, ResourcesPackage.HEALTHCARE_SERVICE__LOCATION);
		}
		return locations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public fhiRCore.dataTypes.String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetName(fhiRCore.dataTypes.String newName, NotificationChain msgs) {
		fhiRCore.dataTypes.String oldName = name;
		name = newName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.HEALTHCARE_SERVICE__NAME, oldName, newName);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(fhiRCore.dataTypes.String newName) {
		if (newName != name) {
			NotificationChain msgs = null;
			if (name != null)
				msgs = ((InternalEObject)name).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.HEALTHCARE_SERVICE__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject)newName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.HEALTHCARE_SERVICE__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.HEALTHCARE_SERVICE__NAME, newName, newName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public fhiRCore.dataTypes.String getComment() {
		return comment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComment(fhiRCore.dataTypes.String newComment, NotificationChain msgs) {
		fhiRCore.dataTypes.String oldComment = comment;
		comment = newComment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.HEALTHCARE_SERVICE__COMMENT, oldComment, newComment);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComment(fhiRCore.dataTypes.String newComment) {
		if (newComment != comment) {
			NotificationChain msgs = null;
			if (comment != null)
				msgs = ((InternalEObject)comment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.HEALTHCARE_SERVICE__COMMENT, null, msgs);
			if (newComment != null)
				msgs = ((InternalEObject)newComment).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.HEALTHCARE_SERVICE__COMMENT, null, msgs);
			msgs = basicSetComment(newComment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.HEALTHCARE_SERVICE__COMMENT, newComment, newComment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Markdown getExtraDetails() {
		return extraDetails;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExtraDetails(Markdown newExtraDetails, NotificationChain msgs) {
		Markdown oldExtraDetails = extraDetails;
		extraDetails = newExtraDetails;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.HEALTHCARE_SERVICE__EXTRA_DETAILS, oldExtraDetails, newExtraDetails);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtraDetails(Markdown newExtraDetails) {
		if (newExtraDetails != extraDetails) {
			NotificationChain msgs = null;
			if (extraDetails != null)
				msgs = ((InternalEObject)extraDetails).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.HEALTHCARE_SERVICE__EXTRA_DETAILS, null, msgs);
			if (newExtraDetails != null)
				msgs = ((InternalEObject)newExtraDetails).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.HEALTHCARE_SERVICE__EXTRA_DETAILS, null, msgs);
			msgs = basicSetExtraDetails(newExtraDetails, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.HEALTHCARE_SERVICE__EXTRA_DETAILS, newExtraDetails, newExtraDetails));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attachment getPhoto() {
		return photo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPhoto(Attachment newPhoto, NotificationChain msgs) {
		Attachment oldPhoto = photo;
		photo = newPhoto;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.HEALTHCARE_SERVICE__PHOTO, oldPhoto, newPhoto);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhoto(Attachment newPhoto) {
		if (newPhoto != photo) {
			NotificationChain msgs = null;
			if (photo != null)
				msgs = ((InternalEObject)photo).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.HEALTHCARE_SERVICE__PHOTO, null, msgs);
			if (newPhoto != null)
				msgs = ((InternalEObject)newPhoto).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.HEALTHCARE_SERVICE__PHOTO, null, msgs);
			msgs = basicSetPhoto(newPhoto, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.HEALTHCARE_SERVICE__PHOTO, newPhoto, newPhoto));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ContactPoint> getTelecoms() {
		if (telecoms == null) {
			telecoms = new EObjectContainmentEList<ContactPoint>(ContactPoint.class, this, ResourcesPackage.HEALTHCARE_SERVICE__TELECOM);
		}
		return telecoms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getCoverageAreas() {
		if (coverageAreas == null) {
			coverageAreas = new EObjectContainmentEList<Reference>(Reference.class, this, ResourcesPackage.HEALTHCARE_SERVICE__COVERAGE_AREA);
		}
		return coverageAreas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getServiceProvisionCodes() {
		if (serviceProvisionCodes == null) {
			serviceProvisionCodes = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, ResourcesPackage.HEALTHCARE_SERVICE__SERVICE_PROVISION_CODE);
		}
		return serviceProvisionCodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HealthcareServiceEligibility> getEligibilities() {
		if (eligibilities == null) {
			eligibilities = new EObjectContainmentEList<HealthcareServiceEligibility>(HealthcareServiceEligibility.class, this, ResourcesPackage.HEALTHCARE_SERVICE__ELIGIBILITY);
		}
		return eligibilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getPrograms() {
		if (programs == null) {
			programs = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, ResourcesPackage.HEALTHCARE_SERVICE__PROGRAM);
		}
		return programs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getCharacteristics() {
		if (characteristics == null) {
			characteristics = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, ResourcesPackage.HEALTHCARE_SERVICE__CHARACTERISTIC);
		}
		return characteristics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getCommunications() {
		if (communications == null) {
			communications = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, ResourcesPackage.HEALTHCARE_SERVICE__COMMUNICATION);
		}
		return communications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getReferralMethods() {
		if (referralMethods == null) {
			referralMethods = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, ResourcesPackage.HEALTHCARE_SERVICE__REFERRAL_METHOD);
		}
		return referralMethods;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public fhiRCore.dataTypes.Boolean getAppointmentRequired() {
		return appointmentRequired;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAppointmentRequired(fhiRCore.dataTypes.Boolean newAppointmentRequired, NotificationChain msgs) {
		fhiRCore.dataTypes.Boolean oldAppointmentRequired = appointmentRequired;
		appointmentRequired = newAppointmentRequired;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.HEALTHCARE_SERVICE__APPOINTMENT_REQUIRED, oldAppointmentRequired, newAppointmentRequired);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAppointmentRequired(fhiRCore.dataTypes.Boolean newAppointmentRequired) {
		if (newAppointmentRequired != appointmentRequired) {
			NotificationChain msgs = null;
			if (appointmentRequired != null)
				msgs = ((InternalEObject)appointmentRequired).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.HEALTHCARE_SERVICE__APPOINTMENT_REQUIRED, null, msgs);
			if (newAppointmentRequired != null)
				msgs = ((InternalEObject)newAppointmentRequired).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.HEALTHCARE_SERVICE__APPOINTMENT_REQUIRED, null, msgs);
			msgs = basicSetAppointmentRequired(newAppointmentRequired, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.HEALTHCARE_SERVICE__APPOINTMENT_REQUIRED, newAppointmentRequired, newAppointmentRequired));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HealthcareServiceAvailableTime> getAvailableTimes() {
		if (availableTimes == null) {
			availableTimes = new EObjectContainmentEList<HealthcareServiceAvailableTime>(HealthcareServiceAvailableTime.class, this, ResourcesPackage.HEALTHCARE_SERVICE__AVAILABLE_TIME);
		}
		return availableTimes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HealthcareServiceNotAvailable> getNotAvailables() {
		if (notAvailables == null) {
			notAvailables = new EObjectContainmentEList<HealthcareServiceNotAvailable>(HealthcareServiceNotAvailable.class, this, ResourcesPackage.HEALTHCARE_SERVICE__NOT_AVAILABLE);
		}
		return notAvailables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public fhiRCore.dataTypes.String getAvailabilityExceptions() {
		return availabilityExceptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAvailabilityExceptions(fhiRCore.dataTypes.String newAvailabilityExceptions, NotificationChain msgs) {
		fhiRCore.dataTypes.String oldAvailabilityExceptions = availabilityExceptions;
		availabilityExceptions = newAvailabilityExceptions;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.HEALTHCARE_SERVICE__AVAILABILITY_EXCEPTIONS, oldAvailabilityExceptions, newAvailabilityExceptions);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAvailabilityExceptions(fhiRCore.dataTypes.String newAvailabilityExceptions) {
		if (newAvailabilityExceptions != availabilityExceptions) {
			NotificationChain msgs = null;
			if (availabilityExceptions != null)
				msgs = ((InternalEObject)availabilityExceptions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.HEALTHCARE_SERVICE__AVAILABILITY_EXCEPTIONS, null, msgs);
			if (newAvailabilityExceptions != null)
				msgs = ((InternalEObject)newAvailabilityExceptions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.HEALTHCARE_SERVICE__AVAILABILITY_EXCEPTIONS, null, msgs);
			msgs = basicSetAvailabilityExceptions(newAvailabilityExceptions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.HEALTHCARE_SERVICE__AVAILABILITY_EXCEPTIONS, newAvailabilityExceptions, newAvailabilityExceptions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getEndpoints() {
		if (endpoints == null) {
			endpoints = new EObjectContainmentEList<Reference>(Reference.class, this, ResourcesPackage.HEALTHCARE_SERVICE__ENDPOINT);
		}
		return endpoints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.HEALTHCARE_SERVICE__IDENTIFIER:
				return ((InternalEList<?>)getIdentifiers()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.HEALTHCARE_SERVICE__ACTIVE:
				return basicSetActive(null, msgs);
			case ResourcesPackage.HEALTHCARE_SERVICE__PROVIDED_BY:
				return basicSetProvidedBy(null, msgs);
			case ResourcesPackage.HEALTHCARE_SERVICE__CATEGORY:
				return ((InternalEList<?>)getCategories()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.HEALTHCARE_SERVICE__TYPE:
				return ((InternalEList<?>)getTypes()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.HEALTHCARE_SERVICE__SPECIALTY:
				return ((InternalEList<?>)getSpecialties()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.HEALTHCARE_SERVICE__LOCATION:
				return ((InternalEList<?>)getLocations()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.HEALTHCARE_SERVICE__NAME:
				return basicSetName(null, msgs);
			case ResourcesPackage.HEALTHCARE_SERVICE__COMMENT:
				return basicSetComment(null, msgs);
			case ResourcesPackage.HEALTHCARE_SERVICE__EXTRA_DETAILS:
				return basicSetExtraDetails(null, msgs);
			case ResourcesPackage.HEALTHCARE_SERVICE__PHOTO:
				return basicSetPhoto(null, msgs);
			case ResourcesPackage.HEALTHCARE_SERVICE__TELECOM:
				return ((InternalEList<?>)getTelecoms()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.HEALTHCARE_SERVICE__COVERAGE_AREA:
				return ((InternalEList<?>)getCoverageAreas()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.HEALTHCARE_SERVICE__SERVICE_PROVISION_CODE:
				return ((InternalEList<?>)getServiceProvisionCodes()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.HEALTHCARE_SERVICE__ELIGIBILITY:
				return ((InternalEList<?>)getEligibilities()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.HEALTHCARE_SERVICE__PROGRAM:
				return ((InternalEList<?>)getPrograms()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.HEALTHCARE_SERVICE__CHARACTERISTIC:
				return ((InternalEList<?>)getCharacteristics()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.HEALTHCARE_SERVICE__COMMUNICATION:
				return ((InternalEList<?>)getCommunications()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.HEALTHCARE_SERVICE__REFERRAL_METHOD:
				return ((InternalEList<?>)getReferralMethods()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.HEALTHCARE_SERVICE__APPOINTMENT_REQUIRED:
				return basicSetAppointmentRequired(null, msgs);
			case ResourcesPackage.HEALTHCARE_SERVICE__AVAILABLE_TIME:
				return ((InternalEList<?>)getAvailableTimes()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.HEALTHCARE_SERVICE__NOT_AVAILABLE:
				return ((InternalEList<?>)getNotAvailables()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.HEALTHCARE_SERVICE__AVAILABILITY_EXCEPTIONS:
				return basicSetAvailabilityExceptions(null, msgs);
			case ResourcesPackage.HEALTHCARE_SERVICE__ENDPOINT:
				return ((InternalEList<?>)getEndpoints()).basicRemove(otherEnd, msgs);
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
			case ResourcesPackage.HEALTHCARE_SERVICE__IDENTIFIER:
				return getIdentifiers();
			case ResourcesPackage.HEALTHCARE_SERVICE__ACTIVE:
				return getActive();
			case ResourcesPackage.HEALTHCARE_SERVICE__PROVIDED_BY:
				return getProvidedBy();
			case ResourcesPackage.HEALTHCARE_SERVICE__CATEGORY:
				return getCategories();
			case ResourcesPackage.HEALTHCARE_SERVICE__TYPE:
				return getTypes();
			case ResourcesPackage.HEALTHCARE_SERVICE__SPECIALTY:
				return getSpecialties();
			case ResourcesPackage.HEALTHCARE_SERVICE__LOCATION:
				return getLocations();
			case ResourcesPackage.HEALTHCARE_SERVICE__NAME:
				return getName();
			case ResourcesPackage.HEALTHCARE_SERVICE__COMMENT:
				return getComment();
			case ResourcesPackage.HEALTHCARE_SERVICE__EXTRA_DETAILS:
				return getExtraDetails();
			case ResourcesPackage.HEALTHCARE_SERVICE__PHOTO:
				return getPhoto();
			case ResourcesPackage.HEALTHCARE_SERVICE__TELECOM:
				return getTelecoms();
			case ResourcesPackage.HEALTHCARE_SERVICE__COVERAGE_AREA:
				return getCoverageAreas();
			case ResourcesPackage.HEALTHCARE_SERVICE__SERVICE_PROVISION_CODE:
				return getServiceProvisionCodes();
			case ResourcesPackage.HEALTHCARE_SERVICE__ELIGIBILITY:
				return getEligibilities();
			case ResourcesPackage.HEALTHCARE_SERVICE__PROGRAM:
				return getPrograms();
			case ResourcesPackage.HEALTHCARE_SERVICE__CHARACTERISTIC:
				return getCharacteristics();
			case ResourcesPackage.HEALTHCARE_SERVICE__COMMUNICATION:
				return getCommunications();
			case ResourcesPackage.HEALTHCARE_SERVICE__REFERRAL_METHOD:
				return getReferralMethods();
			case ResourcesPackage.HEALTHCARE_SERVICE__APPOINTMENT_REQUIRED:
				return getAppointmentRequired();
			case ResourcesPackage.HEALTHCARE_SERVICE__AVAILABLE_TIME:
				return getAvailableTimes();
			case ResourcesPackage.HEALTHCARE_SERVICE__NOT_AVAILABLE:
				return getNotAvailables();
			case ResourcesPackage.HEALTHCARE_SERVICE__AVAILABILITY_EXCEPTIONS:
				return getAvailabilityExceptions();
			case ResourcesPackage.HEALTHCARE_SERVICE__ENDPOINT:
				return getEndpoints();
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
			case ResourcesPackage.HEALTHCARE_SERVICE__IDENTIFIER:
				getIdentifiers().clear();
				getIdentifiers().addAll((Collection<? extends Identifier>)newValue);
				return;
			case ResourcesPackage.HEALTHCARE_SERVICE__ACTIVE:
				setActive((fhiRCore.dataTypes.Boolean)newValue);
				return;
			case ResourcesPackage.HEALTHCARE_SERVICE__PROVIDED_BY:
				setProvidedBy((Reference)newValue);
				return;
			case ResourcesPackage.HEALTHCARE_SERVICE__CATEGORY:
				getCategories().clear();
				getCategories().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case ResourcesPackage.HEALTHCARE_SERVICE__TYPE:
				getTypes().clear();
				getTypes().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case ResourcesPackage.HEALTHCARE_SERVICE__SPECIALTY:
				getSpecialties().clear();
				getSpecialties().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case ResourcesPackage.HEALTHCARE_SERVICE__LOCATION:
				getLocations().clear();
				getLocations().addAll((Collection<? extends Reference>)newValue);
				return;
			case ResourcesPackage.HEALTHCARE_SERVICE__NAME:
				setName((fhiRCore.dataTypes.String)newValue);
				return;
			case ResourcesPackage.HEALTHCARE_SERVICE__COMMENT:
				setComment((fhiRCore.dataTypes.String)newValue);
				return;
			case ResourcesPackage.HEALTHCARE_SERVICE__EXTRA_DETAILS:
				setExtraDetails((Markdown)newValue);
				return;
			case ResourcesPackage.HEALTHCARE_SERVICE__PHOTO:
				setPhoto((Attachment)newValue);
				return;
			case ResourcesPackage.HEALTHCARE_SERVICE__TELECOM:
				getTelecoms().clear();
				getTelecoms().addAll((Collection<? extends ContactPoint>)newValue);
				return;
			case ResourcesPackage.HEALTHCARE_SERVICE__COVERAGE_AREA:
				getCoverageAreas().clear();
				getCoverageAreas().addAll((Collection<? extends Reference>)newValue);
				return;
			case ResourcesPackage.HEALTHCARE_SERVICE__SERVICE_PROVISION_CODE:
				getServiceProvisionCodes().clear();
				getServiceProvisionCodes().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case ResourcesPackage.HEALTHCARE_SERVICE__ELIGIBILITY:
				getEligibilities().clear();
				getEligibilities().addAll((Collection<? extends HealthcareServiceEligibility>)newValue);
				return;
			case ResourcesPackage.HEALTHCARE_SERVICE__PROGRAM:
				getPrograms().clear();
				getPrograms().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case ResourcesPackage.HEALTHCARE_SERVICE__CHARACTERISTIC:
				getCharacteristics().clear();
				getCharacteristics().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case ResourcesPackage.HEALTHCARE_SERVICE__COMMUNICATION:
				getCommunications().clear();
				getCommunications().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case ResourcesPackage.HEALTHCARE_SERVICE__REFERRAL_METHOD:
				getReferralMethods().clear();
				getReferralMethods().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case ResourcesPackage.HEALTHCARE_SERVICE__APPOINTMENT_REQUIRED:
				setAppointmentRequired((fhiRCore.dataTypes.Boolean)newValue);
				return;
			case ResourcesPackage.HEALTHCARE_SERVICE__AVAILABLE_TIME:
				getAvailableTimes().clear();
				getAvailableTimes().addAll((Collection<? extends HealthcareServiceAvailableTime>)newValue);
				return;
			case ResourcesPackage.HEALTHCARE_SERVICE__NOT_AVAILABLE:
				getNotAvailables().clear();
				getNotAvailables().addAll((Collection<? extends HealthcareServiceNotAvailable>)newValue);
				return;
			case ResourcesPackage.HEALTHCARE_SERVICE__AVAILABILITY_EXCEPTIONS:
				setAvailabilityExceptions((fhiRCore.dataTypes.String)newValue);
				return;
			case ResourcesPackage.HEALTHCARE_SERVICE__ENDPOINT:
				getEndpoints().clear();
				getEndpoints().addAll((Collection<? extends Reference>)newValue);
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
			case ResourcesPackage.HEALTHCARE_SERVICE__IDENTIFIER:
				getIdentifiers().clear();
				return;
			case ResourcesPackage.HEALTHCARE_SERVICE__ACTIVE:
				setActive((fhiRCore.dataTypes.Boolean)null);
				return;
			case ResourcesPackage.HEALTHCARE_SERVICE__PROVIDED_BY:
				setProvidedBy((Reference)null);
				return;
			case ResourcesPackage.HEALTHCARE_SERVICE__CATEGORY:
				getCategories().clear();
				return;
			case ResourcesPackage.HEALTHCARE_SERVICE__TYPE:
				getTypes().clear();
				return;
			case ResourcesPackage.HEALTHCARE_SERVICE__SPECIALTY:
				getSpecialties().clear();
				return;
			case ResourcesPackage.HEALTHCARE_SERVICE__LOCATION:
				getLocations().clear();
				return;
			case ResourcesPackage.HEALTHCARE_SERVICE__NAME:
				setName((fhiRCore.dataTypes.String)null);
				return;
			case ResourcesPackage.HEALTHCARE_SERVICE__COMMENT:
				setComment((fhiRCore.dataTypes.String)null);
				return;
			case ResourcesPackage.HEALTHCARE_SERVICE__EXTRA_DETAILS:
				setExtraDetails((Markdown)null);
				return;
			case ResourcesPackage.HEALTHCARE_SERVICE__PHOTO:
				setPhoto((Attachment)null);
				return;
			case ResourcesPackage.HEALTHCARE_SERVICE__TELECOM:
				getTelecoms().clear();
				return;
			case ResourcesPackage.HEALTHCARE_SERVICE__COVERAGE_AREA:
				getCoverageAreas().clear();
				return;
			case ResourcesPackage.HEALTHCARE_SERVICE__SERVICE_PROVISION_CODE:
				getServiceProvisionCodes().clear();
				return;
			case ResourcesPackage.HEALTHCARE_SERVICE__ELIGIBILITY:
				getEligibilities().clear();
				return;
			case ResourcesPackage.HEALTHCARE_SERVICE__PROGRAM:
				getPrograms().clear();
				return;
			case ResourcesPackage.HEALTHCARE_SERVICE__CHARACTERISTIC:
				getCharacteristics().clear();
				return;
			case ResourcesPackage.HEALTHCARE_SERVICE__COMMUNICATION:
				getCommunications().clear();
				return;
			case ResourcesPackage.HEALTHCARE_SERVICE__REFERRAL_METHOD:
				getReferralMethods().clear();
				return;
			case ResourcesPackage.HEALTHCARE_SERVICE__APPOINTMENT_REQUIRED:
				setAppointmentRequired((fhiRCore.dataTypes.Boolean)null);
				return;
			case ResourcesPackage.HEALTHCARE_SERVICE__AVAILABLE_TIME:
				getAvailableTimes().clear();
				return;
			case ResourcesPackage.HEALTHCARE_SERVICE__NOT_AVAILABLE:
				getNotAvailables().clear();
				return;
			case ResourcesPackage.HEALTHCARE_SERVICE__AVAILABILITY_EXCEPTIONS:
				setAvailabilityExceptions((fhiRCore.dataTypes.String)null);
				return;
			case ResourcesPackage.HEALTHCARE_SERVICE__ENDPOINT:
				getEndpoints().clear();
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
			case ResourcesPackage.HEALTHCARE_SERVICE__IDENTIFIER:
				return identifiers != null && !identifiers.isEmpty();
			case ResourcesPackage.HEALTHCARE_SERVICE__ACTIVE:
				return active != null;
			case ResourcesPackage.HEALTHCARE_SERVICE__PROVIDED_BY:
				return providedBy != null;
			case ResourcesPackage.HEALTHCARE_SERVICE__CATEGORY:
				return categories != null && !categories.isEmpty();
			case ResourcesPackage.HEALTHCARE_SERVICE__TYPE:
				return types != null && !types.isEmpty();
			case ResourcesPackage.HEALTHCARE_SERVICE__SPECIALTY:
				return specialties != null && !specialties.isEmpty();
			case ResourcesPackage.HEALTHCARE_SERVICE__LOCATION:
				return locations != null && !locations.isEmpty();
			case ResourcesPackage.HEALTHCARE_SERVICE__NAME:
				return name != null;
			case ResourcesPackage.HEALTHCARE_SERVICE__COMMENT:
				return comment != null;
			case ResourcesPackage.HEALTHCARE_SERVICE__EXTRA_DETAILS:
				return extraDetails != null;
			case ResourcesPackage.HEALTHCARE_SERVICE__PHOTO:
				return photo != null;
			case ResourcesPackage.HEALTHCARE_SERVICE__TELECOM:
				return telecoms != null && !telecoms.isEmpty();
			case ResourcesPackage.HEALTHCARE_SERVICE__COVERAGE_AREA:
				return coverageAreas != null && !coverageAreas.isEmpty();
			case ResourcesPackage.HEALTHCARE_SERVICE__SERVICE_PROVISION_CODE:
				return serviceProvisionCodes != null && !serviceProvisionCodes.isEmpty();
			case ResourcesPackage.HEALTHCARE_SERVICE__ELIGIBILITY:
				return eligibilities != null && !eligibilities.isEmpty();
			case ResourcesPackage.HEALTHCARE_SERVICE__PROGRAM:
				return programs != null && !programs.isEmpty();
			case ResourcesPackage.HEALTHCARE_SERVICE__CHARACTERISTIC:
				return characteristics != null && !characteristics.isEmpty();
			case ResourcesPackage.HEALTHCARE_SERVICE__COMMUNICATION:
				return communications != null && !communications.isEmpty();
			case ResourcesPackage.HEALTHCARE_SERVICE__REFERRAL_METHOD:
				return referralMethods != null && !referralMethods.isEmpty();
			case ResourcesPackage.HEALTHCARE_SERVICE__APPOINTMENT_REQUIRED:
				return appointmentRequired != null;
			case ResourcesPackage.HEALTHCARE_SERVICE__AVAILABLE_TIME:
				return availableTimes != null && !availableTimes.isEmpty();
			case ResourcesPackage.HEALTHCARE_SERVICE__NOT_AVAILABLE:
				return notAvailables != null && !notAvailables.isEmpty();
			case ResourcesPackage.HEALTHCARE_SERVICE__AVAILABILITY_EXCEPTIONS:
				return availabilityExceptions != null;
			case ResourcesPackage.HEALTHCARE_SERVICE__ENDPOINT:
				return endpoints != null && !endpoints.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //HealthcareServiceImpl
