/**
 */
package fhiRCore.resources.impl;

import fhiRCore.dataTypes.Code;
import fhiRCore.dataTypes.Markdown;

import fhiRCore.dataTypes.impl.BackboneElementImpl;

import fhiRCore.resources.CapabilityStatementRestResource;
import fhiRCore.resources.CapabilityStatementRestResourceOperation;
import fhiRCore.resources.CapabilityStatementRestResourceResourceInteraction;
import fhiRCore.resources.CapabilityStatementRestResourceSearchParam;
import fhiRCore.resources.ResourcesPackage;
import fhiRCore.resources.StructureDefinition;

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
 * An implementation of the model object '<em><b>Capability Statement Rest Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.impl.CapabilityStatementRestResourceImpl#getType <em>Type</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.CapabilityStatementRestResourceImpl#getProfile <em>Profile</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.CapabilityStatementRestResourceImpl#getSupportedProfiles <em>Supported Profile</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.CapabilityStatementRestResourceImpl#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.CapabilityStatementRestResourceImpl#getInteractions <em>Interaction</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.CapabilityStatementRestResourceImpl#getVersioning <em>Versioning</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.CapabilityStatementRestResourceImpl#getReadHistory <em>Read History</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.CapabilityStatementRestResourceImpl#getUpdateCreate <em>Update Create</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.CapabilityStatementRestResourceImpl#getConditionalCreate <em>Conditional Create</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.CapabilityStatementRestResourceImpl#getConditionalRead <em>Conditional Read</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.CapabilityStatementRestResourceImpl#getConditionalUpdate <em>Conditional Update</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.CapabilityStatementRestResourceImpl#getConditionalDelete <em>Conditional Delete</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.CapabilityStatementRestResourceImpl#getReferencePolicies <em>Reference Policy</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.CapabilityStatementRestResourceImpl#getSearchIncludes <em>Search Include</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.CapabilityStatementRestResourceImpl#getSearchRevIncludes <em>Search Rev Include</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.CapabilityStatementRestResourceImpl#getSearchParams <em>Search Param</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.CapabilityStatementRestResourceImpl#getOperations <em>Operation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CapabilityStatementRestResourceImpl extends BackboneElementImpl implements CapabilityStatementRestResource {
	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected Code type;

	/**
	 * The cached value of the '{@link #getProfile() <em>Profile</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProfile()
	 * @generated
	 * @ordered
	 */
	protected StructureDefinition profile;

	/**
	 * The cached value of the '{@link #getSupportedProfiles() <em>Supported Profile</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportedProfiles()
	 * @generated
	 * @ordered
	 */
	protected EList<StructureDefinition> supportedProfiles;

	/**
	 * The cached value of the '{@link #getDocumentation() <em>Documentation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentation()
	 * @generated
	 * @ordered
	 */
	protected Markdown documentation;

	/**
	 * The cached value of the '{@link #getInteractions() <em>Interaction</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInteractions()
	 * @generated
	 * @ordered
	 */
	protected EList<CapabilityStatementRestResourceResourceInteraction> interactions;

	/**
	 * The cached value of the '{@link #getVersioning() <em>Versioning</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersioning()
	 * @generated
	 * @ordered
	 */
	protected Code versioning;

	/**
	 * The cached value of the '{@link #getReadHistory() <em>Read History</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReadHistory()
	 * @generated
	 * @ordered
	 */
	protected fhiRCore.dataTypes.Boolean readHistory;

	/**
	 * The cached value of the '{@link #getUpdateCreate() <em>Update Create</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpdateCreate()
	 * @generated
	 * @ordered
	 */
	protected fhiRCore.dataTypes.Boolean updateCreate;

	/**
	 * The cached value of the '{@link #getConditionalCreate() <em>Conditional Create</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditionalCreate()
	 * @generated
	 * @ordered
	 */
	protected fhiRCore.dataTypes.Boolean conditionalCreate;

	/**
	 * The cached value of the '{@link #getConditionalRead() <em>Conditional Read</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditionalRead()
	 * @generated
	 * @ordered
	 */
	protected Code conditionalRead;

	/**
	 * The cached value of the '{@link #getConditionalUpdate() <em>Conditional Update</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditionalUpdate()
	 * @generated
	 * @ordered
	 */
	protected fhiRCore.dataTypes.Boolean conditionalUpdate;

	/**
	 * The cached value of the '{@link #getConditionalDelete() <em>Conditional Delete</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditionalDelete()
	 * @generated
	 * @ordered
	 */
	protected Code conditionalDelete;

	/**
	 * The cached value of the '{@link #getReferencePolicies() <em>Reference Policy</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencePolicies()
	 * @generated
	 * @ordered
	 */
	protected EList<Code> referencePolicies;

	/**
	 * The cached value of the '{@link #getSearchIncludes() <em>Search Include</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSearchIncludes()
	 * @generated
	 * @ordered
	 */
	protected EList<fhiRCore.dataTypes.String> searchIncludes;

	/**
	 * The cached value of the '{@link #getSearchRevIncludes() <em>Search Rev Include</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSearchRevIncludes()
	 * @generated
	 * @ordered
	 */
	protected EList<fhiRCore.dataTypes.String> searchRevIncludes;

	/**
	 * The cached value of the '{@link #getSearchParams() <em>Search Param</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSearchParams()
	 * @generated
	 * @ordered
	 */
	protected EList<CapabilityStatementRestResourceSearchParam> searchParams;

	/**
	 * The cached value of the '{@link #getOperations() <em>Operation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperations()
	 * @generated
	 * @ordered
	 */
	protected EList<CapabilityStatementRestResourceOperation> operations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CapabilityStatementRestResourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getCapabilityStatementRestResource();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetType(Code newType, NotificationChain msgs) {
		Code oldType = type;
		type = newType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.CAPABILITY_STATEMENT_REST_RESOURCE__TYPE, oldType, newType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(Code newType) {
		if (newType != type) {
			NotificationChain msgs = null;
			if (type != null)
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CAPABILITY_STATEMENT_REST_RESOURCE__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CAPABILITY_STATEMENT_REST_RESOURCE__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CAPABILITY_STATEMENT_REST_RESOURCE__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureDefinition getProfile() {
		return profile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProfile(StructureDefinition newProfile, NotificationChain msgs) {
		StructureDefinition oldProfile = profile;
		profile = newProfile;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.CAPABILITY_STATEMENT_REST_RESOURCE__PROFILE, oldProfile, newProfile);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProfile(StructureDefinition newProfile) {
		if (newProfile != profile) {
			NotificationChain msgs = null;
			if (profile != null)
				msgs = ((InternalEObject)profile).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CAPABILITY_STATEMENT_REST_RESOURCE__PROFILE, null, msgs);
			if (newProfile != null)
				msgs = ((InternalEObject)newProfile).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CAPABILITY_STATEMENT_REST_RESOURCE__PROFILE, null, msgs);
			msgs = basicSetProfile(newProfile, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CAPABILITY_STATEMENT_REST_RESOURCE__PROFILE, newProfile, newProfile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StructureDefinition> getSupportedProfiles() {
		if (supportedProfiles == null) {
			supportedProfiles = new EObjectContainmentEList<StructureDefinition>(StructureDefinition.class, this, ResourcesPackage.CAPABILITY_STATEMENT_REST_RESOURCE__SUPPORTED_PROFILE);
		}
		return supportedProfiles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Markdown getDocumentation() {
		return documentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDocumentation(Markdown newDocumentation, NotificationChain msgs) {
		Markdown oldDocumentation = documentation;
		documentation = newDocumentation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.CAPABILITY_STATEMENT_REST_RESOURCE__DOCUMENTATION, oldDocumentation, newDocumentation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDocumentation(Markdown newDocumentation) {
		if (newDocumentation != documentation) {
			NotificationChain msgs = null;
			if (documentation != null)
				msgs = ((InternalEObject)documentation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CAPABILITY_STATEMENT_REST_RESOURCE__DOCUMENTATION, null, msgs);
			if (newDocumentation != null)
				msgs = ((InternalEObject)newDocumentation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CAPABILITY_STATEMENT_REST_RESOURCE__DOCUMENTATION, null, msgs);
			msgs = basicSetDocumentation(newDocumentation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CAPABILITY_STATEMENT_REST_RESOURCE__DOCUMENTATION, newDocumentation, newDocumentation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CapabilityStatementRestResourceResourceInteraction> getInteractions() {
		if (interactions == null) {
			interactions = new EObjectContainmentEList<CapabilityStatementRestResourceResourceInteraction>(CapabilityStatementRestResourceResourceInteraction.class, this, ResourcesPackage.CAPABILITY_STATEMENT_REST_RESOURCE__INTERACTION);
		}
		return interactions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getVersioning() {
		return versioning;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVersioning(Code newVersioning, NotificationChain msgs) {
		Code oldVersioning = versioning;
		versioning = newVersioning;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.CAPABILITY_STATEMENT_REST_RESOURCE__VERSIONING, oldVersioning, newVersioning);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersioning(Code newVersioning) {
		if (newVersioning != versioning) {
			NotificationChain msgs = null;
			if (versioning != null)
				msgs = ((InternalEObject)versioning).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CAPABILITY_STATEMENT_REST_RESOURCE__VERSIONING, null, msgs);
			if (newVersioning != null)
				msgs = ((InternalEObject)newVersioning).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CAPABILITY_STATEMENT_REST_RESOURCE__VERSIONING, null, msgs);
			msgs = basicSetVersioning(newVersioning, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CAPABILITY_STATEMENT_REST_RESOURCE__VERSIONING, newVersioning, newVersioning));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public fhiRCore.dataTypes.Boolean getReadHistory() {
		return readHistory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReadHistory(fhiRCore.dataTypes.Boolean newReadHistory, NotificationChain msgs) {
		fhiRCore.dataTypes.Boolean oldReadHistory = readHistory;
		readHistory = newReadHistory;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.CAPABILITY_STATEMENT_REST_RESOURCE__READ_HISTORY, oldReadHistory, newReadHistory);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReadHistory(fhiRCore.dataTypes.Boolean newReadHistory) {
		if (newReadHistory != readHistory) {
			NotificationChain msgs = null;
			if (readHistory != null)
				msgs = ((InternalEObject)readHistory).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CAPABILITY_STATEMENT_REST_RESOURCE__READ_HISTORY, null, msgs);
			if (newReadHistory != null)
				msgs = ((InternalEObject)newReadHistory).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CAPABILITY_STATEMENT_REST_RESOURCE__READ_HISTORY, null, msgs);
			msgs = basicSetReadHistory(newReadHistory, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CAPABILITY_STATEMENT_REST_RESOURCE__READ_HISTORY, newReadHistory, newReadHistory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public fhiRCore.dataTypes.Boolean getUpdateCreate() {
		return updateCreate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUpdateCreate(fhiRCore.dataTypes.Boolean newUpdateCreate, NotificationChain msgs) {
		fhiRCore.dataTypes.Boolean oldUpdateCreate = updateCreate;
		updateCreate = newUpdateCreate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.CAPABILITY_STATEMENT_REST_RESOURCE__UPDATE_CREATE, oldUpdateCreate, newUpdateCreate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpdateCreate(fhiRCore.dataTypes.Boolean newUpdateCreate) {
		if (newUpdateCreate != updateCreate) {
			NotificationChain msgs = null;
			if (updateCreate != null)
				msgs = ((InternalEObject)updateCreate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CAPABILITY_STATEMENT_REST_RESOURCE__UPDATE_CREATE, null, msgs);
			if (newUpdateCreate != null)
				msgs = ((InternalEObject)newUpdateCreate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CAPABILITY_STATEMENT_REST_RESOURCE__UPDATE_CREATE, null, msgs);
			msgs = basicSetUpdateCreate(newUpdateCreate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CAPABILITY_STATEMENT_REST_RESOURCE__UPDATE_CREATE, newUpdateCreate, newUpdateCreate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public fhiRCore.dataTypes.Boolean getConditionalCreate() {
		return conditionalCreate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConditionalCreate(fhiRCore.dataTypes.Boolean newConditionalCreate, NotificationChain msgs) {
		fhiRCore.dataTypes.Boolean oldConditionalCreate = conditionalCreate;
		conditionalCreate = newConditionalCreate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.CAPABILITY_STATEMENT_REST_RESOURCE__CONDITIONAL_CREATE, oldConditionalCreate, newConditionalCreate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConditionalCreate(fhiRCore.dataTypes.Boolean newConditionalCreate) {
		if (newConditionalCreate != conditionalCreate) {
			NotificationChain msgs = null;
			if (conditionalCreate != null)
				msgs = ((InternalEObject)conditionalCreate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CAPABILITY_STATEMENT_REST_RESOURCE__CONDITIONAL_CREATE, null, msgs);
			if (newConditionalCreate != null)
				msgs = ((InternalEObject)newConditionalCreate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CAPABILITY_STATEMENT_REST_RESOURCE__CONDITIONAL_CREATE, null, msgs);
			msgs = basicSetConditionalCreate(newConditionalCreate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CAPABILITY_STATEMENT_REST_RESOURCE__CONDITIONAL_CREATE, newConditionalCreate, newConditionalCreate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getConditionalRead() {
		return conditionalRead;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConditionalRead(Code newConditionalRead, NotificationChain msgs) {
		Code oldConditionalRead = conditionalRead;
		conditionalRead = newConditionalRead;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.CAPABILITY_STATEMENT_REST_RESOURCE__CONDITIONAL_READ, oldConditionalRead, newConditionalRead);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConditionalRead(Code newConditionalRead) {
		if (newConditionalRead != conditionalRead) {
			NotificationChain msgs = null;
			if (conditionalRead != null)
				msgs = ((InternalEObject)conditionalRead).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CAPABILITY_STATEMENT_REST_RESOURCE__CONDITIONAL_READ, null, msgs);
			if (newConditionalRead != null)
				msgs = ((InternalEObject)newConditionalRead).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CAPABILITY_STATEMENT_REST_RESOURCE__CONDITIONAL_READ, null, msgs);
			msgs = basicSetConditionalRead(newConditionalRead, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CAPABILITY_STATEMENT_REST_RESOURCE__CONDITIONAL_READ, newConditionalRead, newConditionalRead));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public fhiRCore.dataTypes.Boolean getConditionalUpdate() {
		return conditionalUpdate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConditionalUpdate(fhiRCore.dataTypes.Boolean newConditionalUpdate, NotificationChain msgs) {
		fhiRCore.dataTypes.Boolean oldConditionalUpdate = conditionalUpdate;
		conditionalUpdate = newConditionalUpdate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.CAPABILITY_STATEMENT_REST_RESOURCE__CONDITIONAL_UPDATE, oldConditionalUpdate, newConditionalUpdate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConditionalUpdate(fhiRCore.dataTypes.Boolean newConditionalUpdate) {
		if (newConditionalUpdate != conditionalUpdate) {
			NotificationChain msgs = null;
			if (conditionalUpdate != null)
				msgs = ((InternalEObject)conditionalUpdate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CAPABILITY_STATEMENT_REST_RESOURCE__CONDITIONAL_UPDATE, null, msgs);
			if (newConditionalUpdate != null)
				msgs = ((InternalEObject)newConditionalUpdate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CAPABILITY_STATEMENT_REST_RESOURCE__CONDITIONAL_UPDATE, null, msgs);
			msgs = basicSetConditionalUpdate(newConditionalUpdate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CAPABILITY_STATEMENT_REST_RESOURCE__CONDITIONAL_UPDATE, newConditionalUpdate, newConditionalUpdate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getConditionalDelete() {
		return conditionalDelete;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConditionalDelete(Code newConditionalDelete, NotificationChain msgs) {
		Code oldConditionalDelete = conditionalDelete;
		conditionalDelete = newConditionalDelete;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.CAPABILITY_STATEMENT_REST_RESOURCE__CONDITIONAL_DELETE, oldConditionalDelete, newConditionalDelete);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConditionalDelete(Code newConditionalDelete) {
		if (newConditionalDelete != conditionalDelete) {
			NotificationChain msgs = null;
			if (conditionalDelete != null)
				msgs = ((InternalEObject)conditionalDelete).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CAPABILITY_STATEMENT_REST_RESOURCE__CONDITIONAL_DELETE, null, msgs);
			if (newConditionalDelete != null)
				msgs = ((InternalEObject)newConditionalDelete).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CAPABILITY_STATEMENT_REST_RESOURCE__CONDITIONAL_DELETE, null, msgs);
			msgs = basicSetConditionalDelete(newConditionalDelete, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CAPABILITY_STATEMENT_REST_RESOURCE__CONDITIONAL_DELETE, newConditionalDelete, newConditionalDelete));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Code> getReferencePolicies() {
		if (referencePolicies == null) {
			referencePolicies = new EObjectContainmentEList<Code>(Code.class, this, ResourcesPackage.CAPABILITY_STATEMENT_REST_RESOURCE__REFERENCE_POLICY);
		}
		return referencePolicies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<fhiRCore.dataTypes.String> getSearchIncludes() {
		if (searchIncludes == null) {
			searchIncludes = new EObjectContainmentEList<fhiRCore.dataTypes.String>(fhiRCore.dataTypes.String.class, this, ResourcesPackage.CAPABILITY_STATEMENT_REST_RESOURCE__SEARCH_INCLUDE);
		}
		return searchIncludes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<fhiRCore.dataTypes.String> getSearchRevIncludes() {
		if (searchRevIncludes == null) {
			searchRevIncludes = new EObjectContainmentEList<fhiRCore.dataTypes.String>(fhiRCore.dataTypes.String.class, this, ResourcesPackage.CAPABILITY_STATEMENT_REST_RESOURCE__SEARCH_REV_INCLUDE);
		}
		return searchRevIncludes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CapabilityStatementRestResourceSearchParam> getSearchParams() {
		if (searchParams == null) {
			searchParams = new EObjectContainmentEList<CapabilityStatementRestResourceSearchParam>(CapabilityStatementRestResourceSearchParam.class, this, ResourcesPackage.CAPABILITY_STATEMENT_REST_RESOURCE__SEARCH_PARAM);
		}
		return searchParams;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CapabilityStatementRestResourceOperation> getOperations() {
		if (operations == null) {
			operations = new EObjectContainmentEList<CapabilityStatementRestResourceOperation>(CapabilityStatementRestResourceOperation.class, this, ResourcesPackage.CAPABILITY_STATEMENT_REST_RESOURCE__OPERATION);
		}
		return operations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.CAPABILITY_STATEMENT_REST_RESOURCE__TYPE:
				return basicSetType(null, msgs);
			case ResourcesPackage.CAPABILITY_STATEMENT_REST_RESOURCE__PROFILE:
				return basicSetProfile(null, msgs);
			case ResourcesPackage.CAPABILITY_STATEMENT_REST_RESOURCE__SUPPORTED_PROFILE:
				return ((InternalEList<?>)getSupportedProfiles()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.CAPABILITY_STATEMENT_REST_RESOURCE__DOCUMENTATION:
				return basicSetDocumentation(null, msgs);
			case ResourcesPackage.CAPABILITY_STATEMENT_REST_RESOURCE__INTERACTION:
				return ((InternalEList<?>)getInteractions()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.CAPABILITY_STATEMENT_REST_RESOURCE__VERSIONING:
				return basicSetVersioning(null, msgs);
			case ResourcesPackage.CAPABILITY_STATEMENT_REST_RESOURCE__READ_HISTORY:
				return basicSetReadHistory(null, msgs);
			case ResourcesPackage.CAPABILITY_STATEMENT_REST_RESOURCE__UPDATE_CREATE:
				return basicSetUpdateCreate(null, msgs);
			case ResourcesPackage.CAPABILITY_STATEMENT_REST_RESOURCE__CONDITIONAL_CREATE:
				return basicSetConditionalCreate(null, msgs);
			case ResourcesPackage.CAPABILITY_STATEMENT_REST_RESOURCE__CONDITIONAL_READ:
				return basicSetConditionalRead(null, msgs);
			case ResourcesPackage.CAPABILITY_STATEMENT_REST_RESOURCE__CONDITIONAL_UPDATE:
				return basicSetConditionalUpdate(null, msgs);
			case ResourcesPackage.CAPABILITY_STATEMENT_REST_RESOURCE__CONDITIONAL_DELETE:
				return basicSetConditionalDelete(null, msgs);
			case ResourcesPackage.CAPABILITY_STATEMENT_REST_RESOURCE__REFERENCE_POLICY:
				return ((InternalEList<?>)getReferencePolicies()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.CAPABILITY_STATEMENT_REST_RESOURCE__SEARCH_INCLUDE:
				return ((InternalEList<?>)getSearchIncludes()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.CAPABILITY_STATEMENT_REST_RESOURCE__SEARCH_REV_INCLUDE:
				return ((InternalEList<?>)getSearchRevIncludes()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.CAPABILITY_STATEMENT_REST_RESOURCE__SEARCH_PARAM:
				return ((InternalEList<?>)getSearchParams()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.CAPABILITY_STATEMENT_REST_RESOURCE__OPERATION:
				return ((InternalEList<?>)getOperations()).basicRemove(otherEnd, msgs);
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
			case ResourcesPackage.CAPABILITY_STATEMENT_REST_RESOURCE__TYPE:
				return getType();
			case ResourcesPackage.CAPABILITY_STATEMENT_REST_RESOURCE__PROFILE:
				return getProfile();
			case ResourcesPackage.CAPABILITY_STATEMENT_REST_RESOURCE__SUPPORTED_PROFILE:
				return getSupportedProfiles();
			case ResourcesPackage.CAPABILITY_STATEMENT_REST_RESOURCE__DOCUMENTATION:
				return getDocumentation();
			case ResourcesPackage.CAPABILITY_STATEMENT_REST_RESOURCE__INTERACTION:
				return getInteractions();
			case ResourcesPackage.CAPABILITY_STATEMENT_REST_RESOURCE__VERSIONING:
				return getVersioning();
			case ResourcesPackage.CAPABILITY_STATEMENT_REST_RESOURCE__READ_HISTORY:
				return getReadHistory();
			case ResourcesPackage.CAPABILITY_STATEMENT_REST_RESOURCE__UPDATE_CREATE:
				return getUpdateCreate();
			case ResourcesPackage.CAPABILITY_STATEMENT_REST_RESOURCE__CONDITIONAL_CREATE:
				return getConditionalCreate();
			case ResourcesPackage.CAPABILITY_STATEMENT_REST_RESOURCE__CONDITIONAL_READ:
				return getConditionalRead();
			case ResourcesPackage.CAPABILITY_STATEMENT_REST_RESOURCE__CONDITIONAL_UPDATE:
				return getConditionalUpdate();
			case ResourcesPackage.CAPABILITY_STATEMENT_REST_RESOURCE__CONDITIONAL_DELETE:
				return getConditionalDelete();
			case ResourcesPackage.CAPABILITY_STATEMENT_REST_RESOURCE__REFERENCE_POLICY:
				return getReferencePolicies();
			case ResourcesPackage.CAPABILITY_STATEMENT_REST_RESOURCE__SEARCH_INCLUDE:
				return getSearchIncludes();
			case ResourcesPackage.CAPABILITY_STATEMENT_REST_RESOURCE__SEARCH_REV_INCLUDE:
				return getSearchRevIncludes();
			case ResourcesPackage.CAPABILITY_STATEMENT_REST_RESOURCE__SEARCH_PARAM:
				return getSearchParams();
			case ResourcesPackage.CAPABILITY_STATEMENT_REST_RESOURCE__OPERATION:
				return getOperations();
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
			case ResourcesPackage.CAPABILITY_STATEMENT_REST_RESOURCE__TYPE:
				setType((Code)newValue);
				return;
			case ResourcesPackage.CAPABILITY_STATEMENT_REST_RESOURCE__PROFILE:
				setProfile((StructureDefinition)newValue);
				return;
			case ResourcesPackage.CAPABILITY_STATEMENT_REST_RESOURCE__SUPPORTED_PROFILE:
				getSupportedProfiles().clear();
				getSupportedProfiles().addAll((Collection<? extends StructureDefinition>)newValue);
				return;
			case ResourcesPackage.CAPABILITY_STATEMENT_REST_RESOURCE__DOCUMENTATION:
				setDocumentation((Markdown)newValue);
				return;
			case ResourcesPackage.CAPABILITY_STATEMENT_REST_RESOURCE__INTERACTION:
				getInteractions().clear();
				getInteractions().addAll((Collection<? extends CapabilityStatementRestResourceResourceInteraction>)newValue);
				return;
			case ResourcesPackage.CAPABILITY_STATEMENT_REST_RESOURCE__VERSIONING:
				setVersioning((Code)newValue);
				return;
			case ResourcesPackage.CAPABILITY_STATEMENT_REST_RESOURCE__READ_HISTORY:
				setReadHistory((fhiRCore.dataTypes.Boolean)newValue);
				return;
			case ResourcesPackage.CAPABILITY_STATEMENT_REST_RESOURCE__UPDATE_CREATE:
				setUpdateCreate((fhiRCore.dataTypes.Boolean)newValue);
				return;
			case ResourcesPackage.CAPABILITY_STATEMENT_REST_RESOURCE__CONDITIONAL_CREATE:
				setConditionalCreate((fhiRCore.dataTypes.Boolean)newValue);
				return;
			case ResourcesPackage.CAPABILITY_STATEMENT_REST_RESOURCE__CONDITIONAL_READ:
				setConditionalRead((Code)newValue);
				return;
			case ResourcesPackage.CAPABILITY_STATEMENT_REST_RESOURCE__CONDITIONAL_UPDATE:
				setConditionalUpdate((fhiRCore.dataTypes.Boolean)newValue);
				return;
			case ResourcesPackage.CAPABILITY_STATEMENT_REST_RESOURCE__CONDITIONAL_DELETE:
				setConditionalDelete((Code)newValue);
				return;
			case ResourcesPackage.CAPABILITY_STATEMENT_REST_RESOURCE__REFERENCE_POLICY:
				getReferencePolicies().clear();
				getReferencePolicies().addAll((Collection<? extends Code>)newValue);
				return;
			case ResourcesPackage.CAPABILITY_STATEMENT_REST_RESOURCE__SEARCH_INCLUDE:
				getSearchIncludes().clear();
				getSearchIncludes().addAll((Collection<? extends fhiRCore.dataTypes.String>)newValue);
				return;
			case ResourcesPackage.CAPABILITY_STATEMENT_REST_RESOURCE__SEARCH_REV_INCLUDE:
				getSearchRevIncludes().clear();
				getSearchRevIncludes().addAll((Collection<? extends fhiRCore.dataTypes.String>)newValue);
				return;
			case ResourcesPackage.CAPABILITY_STATEMENT_REST_RESOURCE__SEARCH_PARAM:
				getSearchParams().clear();
				getSearchParams().addAll((Collection<? extends CapabilityStatementRestResourceSearchParam>)newValue);
				return;
			case ResourcesPackage.CAPABILITY_STATEMENT_REST_RESOURCE__OPERATION:
				getOperations().clear();
				getOperations().addAll((Collection<? extends CapabilityStatementRestResourceOperation>)newValue);
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
			case ResourcesPackage.CAPABILITY_STATEMENT_REST_RESOURCE__TYPE:
				setType((Code)null);
				return;
			case ResourcesPackage.CAPABILITY_STATEMENT_REST_RESOURCE__PROFILE:
				setProfile((StructureDefinition)null);
				return;
			case ResourcesPackage.CAPABILITY_STATEMENT_REST_RESOURCE__SUPPORTED_PROFILE:
				getSupportedProfiles().clear();
				return;
			case ResourcesPackage.CAPABILITY_STATEMENT_REST_RESOURCE__DOCUMENTATION:
				setDocumentation((Markdown)null);
				return;
			case ResourcesPackage.CAPABILITY_STATEMENT_REST_RESOURCE__INTERACTION:
				getInteractions().clear();
				return;
			case ResourcesPackage.CAPABILITY_STATEMENT_REST_RESOURCE__VERSIONING:
				setVersioning((Code)null);
				return;
			case ResourcesPackage.CAPABILITY_STATEMENT_REST_RESOURCE__READ_HISTORY:
				setReadHistory((fhiRCore.dataTypes.Boolean)null);
				return;
			case ResourcesPackage.CAPABILITY_STATEMENT_REST_RESOURCE__UPDATE_CREATE:
				setUpdateCreate((fhiRCore.dataTypes.Boolean)null);
				return;
			case ResourcesPackage.CAPABILITY_STATEMENT_REST_RESOURCE__CONDITIONAL_CREATE:
				setConditionalCreate((fhiRCore.dataTypes.Boolean)null);
				return;
			case ResourcesPackage.CAPABILITY_STATEMENT_REST_RESOURCE__CONDITIONAL_READ:
				setConditionalRead((Code)null);
				return;
			case ResourcesPackage.CAPABILITY_STATEMENT_REST_RESOURCE__CONDITIONAL_UPDATE:
				setConditionalUpdate((fhiRCore.dataTypes.Boolean)null);
				return;
			case ResourcesPackage.CAPABILITY_STATEMENT_REST_RESOURCE__CONDITIONAL_DELETE:
				setConditionalDelete((Code)null);
				return;
			case ResourcesPackage.CAPABILITY_STATEMENT_REST_RESOURCE__REFERENCE_POLICY:
				getReferencePolicies().clear();
				return;
			case ResourcesPackage.CAPABILITY_STATEMENT_REST_RESOURCE__SEARCH_INCLUDE:
				getSearchIncludes().clear();
				return;
			case ResourcesPackage.CAPABILITY_STATEMENT_REST_RESOURCE__SEARCH_REV_INCLUDE:
				getSearchRevIncludes().clear();
				return;
			case ResourcesPackage.CAPABILITY_STATEMENT_REST_RESOURCE__SEARCH_PARAM:
				getSearchParams().clear();
				return;
			case ResourcesPackage.CAPABILITY_STATEMENT_REST_RESOURCE__OPERATION:
				getOperations().clear();
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
			case ResourcesPackage.CAPABILITY_STATEMENT_REST_RESOURCE__TYPE:
				return type != null;
			case ResourcesPackage.CAPABILITY_STATEMENT_REST_RESOURCE__PROFILE:
				return profile != null;
			case ResourcesPackage.CAPABILITY_STATEMENT_REST_RESOURCE__SUPPORTED_PROFILE:
				return supportedProfiles != null && !supportedProfiles.isEmpty();
			case ResourcesPackage.CAPABILITY_STATEMENT_REST_RESOURCE__DOCUMENTATION:
				return documentation != null;
			case ResourcesPackage.CAPABILITY_STATEMENT_REST_RESOURCE__INTERACTION:
				return interactions != null && !interactions.isEmpty();
			case ResourcesPackage.CAPABILITY_STATEMENT_REST_RESOURCE__VERSIONING:
				return versioning != null;
			case ResourcesPackage.CAPABILITY_STATEMENT_REST_RESOURCE__READ_HISTORY:
				return readHistory != null;
			case ResourcesPackage.CAPABILITY_STATEMENT_REST_RESOURCE__UPDATE_CREATE:
				return updateCreate != null;
			case ResourcesPackage.CAPABILITY_STATEMENT_REST_RESOURCE__CONDITIONAL_CREATE:
				return conditionalCreate != null;
			case ResourcesPackage.CAPABILITY_STATEMENT_REST_RESOURCE__CONDITIONAL_READ:
				return conditionalRead != null;
			case ResourcesPackage.CAPABILITY_STATEMENT_REST_RESOURCE__CONDITIONAL_UPDATE:
				return conditionalUpdate != null;
			case ResourcesPackage.CAPABILITY_STATEMENT_REST_RESOURCE__CONDITIONAL_DELETE:
				return conditionalDelete != null;
			case ResourcesPackage.CAPABILITY_STATEMENT_REST_RESOURCE__REFERENCE_POLICY:
				return referencePolicies != null && !referencePolicies.isEmpty();
			case ResourcesPackage.CAPABILITY_STATEMENT_REST_RESOURCE__SEARCH_INCLUDE:
				return searchIncludes != null && !searchIncludes.isEmpty();
			case ResourcesPackage.CAPABILITY_STATEMENT_REST_RESOURCE__SEARCH_REV_INCLUDE:
				return searchRevIncludes != null && !searchRevIncludes.isEmpty();
			case ResourcesPackage.CAPABILITY_STATEMENT_REST_RESOURCE__SEARCH_PARAM:
				return searchParams != null && !searchParams.isEmpty();
			case ResourcesPackage.CAPABILITY_STATEMENT_REST_RESOURCE__OPERATION:
				return operations != null && !operations.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CapabilityStatementRestResourceImpl
