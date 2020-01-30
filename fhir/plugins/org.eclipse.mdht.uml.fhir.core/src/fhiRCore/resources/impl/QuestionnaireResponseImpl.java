/**
 */
package fhiRCore.resources.impl;

import fhiRCore.dataTypes.Code;
import fhiRCore.dataTypes.DateTime;
import fhiRCore.dataTypes.Identifier;
import fhiRCore.dataTypes.Reference;

import fhiRCore.resources.Questionnaire;
import fhiRCore.resources.QuestionnaireResponse;
import fhiRCore.resources.QuestionnaireResponseItem;
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
 * An implementation of the model object '<em><b>Questionnaire Response</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.impl.QuestionnaireResponseImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.QuestionnaireResponseImpl#getBasedOns <em>Based On</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.QuestionnaireResponseImpl#getPartOfs <em>Part Of</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.QuestionnaireResponseImpl#getQuestionnaire <em>Questionnaire</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.QuestionnaireResponseImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.QuestionnaireResponseImpl#getSubject <em>Subject</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.QuestionnaireResponseImpl#getEncounter <em>Encounter</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.QuestionnaireResponseImpl#getAuthored <em>Authored</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.QuestionnaireResponseImpl#getAuthor <em>Author</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.QuestionnaireResponseImpl#getSource <em>Source</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.QuestionnaireResponseImpl#getItems <em>Item</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QuestionnaireResponseImpl extends DomainResourceImpl implements QuestionnaireResponse {
	/**
	 * The cached value of the '{@link #getIdentifier() <em>Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected Identifier identifier;

	/**
	 * The cached value of the '{@link #getBasedOns() <em>Based On</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBasedOns()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> basedOns;

	/**
	 * The cached value of the '{@link #getPartOfs() <em>Part Of</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartOfs()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> partOfs;

	/**
	 * The cached value of the '{@link #getQuestionnaire() <em>Questionnaire</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuestionnaire()
	 * @generated
	 * @ordered
	 */
	protected Questionnaire questionnaire;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected Code status;

	/**
	 * The cached value of the '{@link #getSubject() <em>Subject</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubject()
	 * @generated
	 * @ordered
	 */
	protected Reference subject;

	/**
	 * The cached value of the '{@link #getEncounter() <em>Encounter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncounter()
	 * @generated
	 * @ordered
	 */
	protected Reference encounter;

	/**
	 * The cached value of the '{@link #getAuthored() <em>Authored</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthored()
	 * @generated
	 * @ordered
	 */
	protected DateTime authored;

	/**
	 * The cached value of the '{@link #getAuthor() <em>Author</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthor()
	 * @generated
	 * @ordered
	 */
	protected Reference author;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected Reference source;

	/**
	 * The cached value of the '{@link #getItems() <em>Item</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItems()
	 * @generated
	 * @ordered
	 */
	protected EList<QuestionnaireResponseItem> items;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QuestionnaireResponseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getQuestionnaireResponse();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Identifier getIdentifier() {
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIdentifier(Identifier newIdentifier, NotificationChain msgs) {
		Identifier oldIdentifier = identifier;
		identifier = newIdentifier;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.QUESTIONNAIRE_RESPONSE__IDENTIFIER, oldIdentifier, newIdentifier);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdentifier(Identifier newIdentifier) {
		if (newIdentifier != identifier) {
			NotificationChain msgs = null;
			if (identifier != null)
				msgs = ((InternalEObject)identifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.QUESTIONNAIRE_RESPONSE__IDENTIFIER, null, msgs);
			if (newIdentifier != null)
				msgs = ((InternalEObject)newIdentifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.QUESTIONNAIRE_RESPONSE__IDENTIFIER, null, msgs);
			msgs = basicSetIdentifier(newIdentifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.QUESTIONNAIRE_RESPONSE__IDENTIFIER, newIdentifier, newIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getBasedOns() {
		if (basedOns == null) {
			basedOns = new EObjectContainmentEList<Reference>(Reference.class, this, ResourcesPackage.QUESTIONNAIRE_RESPONSE__BASED_ON);
		}
		return basedOns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getPartOfs() {
		if (partOfs == null) {
			partOfs = new EObjectContainmentEList<Reference>(Reference.class, this, ResourcesPackage.QUESTIONNAIRE_RESPONSE__PART_OF);
		}
		return partOfs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Questionnaire getQuestionnaire() {
		return questionnaire;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQuestionnaire(Questionnaire newQuestionnaire, NotificationChain msgs) {
		Questionnaire oldQuestionnaire = questionnaire;
		questionnaire = newQuestionnaire;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.QUESTIONNAIRE_RESPONSE__QUESTIONNAIRE, oldQuestionnaire, newQuestionnaire);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuestionnaire(Questionnaire newQuestionnaire) {
		if (newQuestionnaire != questionnaire) {
			NotificationChain msgs = null;
			if (questionnaire != null)
				msgs = ((InternalEObject)questionnaire).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.QUESTIONNAIRE_RESPONSE__QUESTIONNAIRE, null, msgs);
			if (newQuestionnaire != null)
				msgs = ((InternalEObject)newQuestionnaire).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.QUESTIONNAIRE_RESPONSE__QUESTIONNAIRE, null, msgs);
			msgs = basicSetQuestionnaire(newQuestionnaire, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.QUESTIONNAIRE_RESPONSE__QUESTIONNAIRE, newQuestionnaire, newQuestionnaire));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatus(Code newStatus, NotificationChain msgs) {
		Code oldStatus = status;
		status = newStatus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.QUESTIONNAIRE_RESPONSE__STATUS, oldStatus, newStatus);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(Code newStatus) {
		if (newStatus != status) {
			NotificationChain msgs = null;
			if (status != null)
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.QUESTIONNAIRE_RESPONSE__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.QUESTIONNAIRE_RESPONSE__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.QUESTIONNAIRE_RESPONSE__STATUS, newStatus, newStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getSubject() {
		return subject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubject(Reference newSubject, NotificationChain msgs) {
		Reference oldSubject = subject;
		subject = newSubject;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.QUESTIONNAIRE_RESPONSE__SUBJECT, oldSubject, newSubject);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubject(Reference newSubject) {
		if (newSubject != subject) {
			NotificationChain msgs = null;
			if (subject != null)
				msgs = ((InternalEObject)subject).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.QUESTIONNAIRE_RESPONSE__SUBJECT, null, msgs);
			if (newSubject != null)
				msgs = ((InternalEObject)newSubject).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.QUESTIONNAIRE_RESPONSE__SUBJECT, null, msgs);
			msgs = basicSetSubject(newSubject, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.QUESTIONNAIRE_RESPONSE__SUBJECT, newSubject, newSubject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getEncounter() {
		return encounter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEncounter(Reference newEncounter, NotificationChain msgs) {
		Reference oldEncounter = encounter;
		encounter = newEncounter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.QUESTIONNAIRE_RESPONSE__ENCOUNTER, oldEncounter, newEncounter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEncounter(Reference newEncounter) {
		if (newEncounter != encounter) {
			NotificationChain msgs = null;
			if (encounter != null)
				msgs = ((InternalEObject)encounter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.QUESTIONNAIRE_RESPONSE__ENCOUNTER, null, msgs);
			if (newEncounter != null)
				msgs = ((InternalEObject)newEncounter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.QUESTIONNAIRE_RESPONSE__ENCOUNTER, null, msgs);
			msgs = basicSetEncounter(newEncounter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.QUESTIONNAIRE_RESPONSE__ENCOUNTER, newEncounter, newEncounter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime getAuthored() {
		return authored;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAuthored(DateTime newAuthored, NotificationChain msgs) {
		DateTime oldAuthored = authored;
		authored = newAuthored;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.QUESTIONNAIRE_RESPONSE__AUTHORED, oldAuthored, newAuthored);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuthored(DateTime newAuthored) {
		if (newAuthored != authored) {
			NotificationChain msgs = null;
			if (authored != null)
				msgs = ((InternalEObject)authored).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.QUESTIONNAIRE_RESPONSE__AUTHORED, null, msgs);
			if (newAuthored != null)
				msgs = ((InternalEObject)newAuthored).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.QUESTIONNAIRE_RESPONSE__AUTHORED, null, msgs);
			msgs = basicSetAuthored(newAuthored, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.QUESTIONNAIRE_RESPONSE__AUTHORED, newAuthored, newAuthored));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getAuthor() {
		return author;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAuthor(Reference newAuthor, NotificationChain msgs) {
		Reference oldAuthor = author;
		author = newAuthor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.QUESTIONNAIRE_RESPONSE__AUTHOR, oldAuthor, newAuthor);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuthor(Reference newAuthor) {
		if (newAuthor != author) {
			NotificationChain msgs = null;
			if (author != null)
				msgs = ((InternalEObject)author).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.QUESTIONNAIRE_RESPONSE__AUTHOR, null, msgs);
			if (newAuthor != null)
				msgs = ((InternalEObject)newAuthor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.QUESTIONNAIRE_RESPONSE__AUTHOR, null, msgs);
			msgs = basicSetAuthor(newAuthor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.QUESTIONNAIRE_RESPONSE__AUTHOR, newAuthor, newAuthor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSource(Reference newSource, NotificationChain msgs) {
		Reference oldSource = source;
		source = newSource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.QUESTIONNAIRE_RESPONSE__SOURCE, oldSource, newSource);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(Reference newSource) {
		if (newSource != source) {
			NotificationChain msgs = null;
			if (source != null)
				msgs = ((InternalEObject)source).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.QUESTIONNAIRE_RESPONSE__SOURCE, null, msgs);
			if (newSource != null)
				msgs = ((InternalEObject)newSource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.QUESTIONNAIRE_RESPONSE__SOURCE, null, msgs);
			msgs = basicSetSource(newSource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.QUESTIONNAIRE_RESPONSE__SOURCE, newSource, newSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<QuestionnaireResponseItem> getItems() {
		if (items == null) {
			items = new EObjectContainmentEList<QuestionnaireResponseItem>(QuestionnaireResponseItem.class, this, ResourcesPackage.QUESTIONNAIRE_RESPONSE__ITEM);
		}
		return items;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.QUESTIONNAIRE_RESPONSE__IDENTIFIER:
				return basicSetIdentifier(null, msgs);
			case ResourcesPackage.QUESTIONNAIRE_RESPONSE__BASED_ON:
				return ((InternalEList<?>)getBasedOns()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.QUESTIONNAIRE_RESPONSE__PART_OF:
				return ((InternalEList<?>)getPartOfs()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.QUESTIONNAIRE_RESPONSE__QUESTIONNAIRE:
				return basicSetQuestionnaire(null, msgs);
			case ResourcesPackage.QUESTIONNAIRE_RESPONSE__STATUS:
				return basicSetStatus(null, msgs);
			case ResourcesPackage.QUESTIONNAIRE_RESPONSE__SUBJECT:
				return basicSetSubject(null, msgs);
			case ResourcesPackage.QUESTIONNAIRE_RESPONSE__ENCOUNTER:
				return basicSetEncounter(null, msgs);
			case ResourcesPackage.QUESTIONNAIRE_RESPONSE__AUTHORED:
				return basicSetAuthored(null, msgs);
			case ResourcesPackage.QUESTIONNAIRE_RESPONSE__AUTHOR:
				return basicSetAuthor(null, msgs);
			case ResourcesPackage.QUESTIONNAIRE_RESPONSE__SOURCE:
				return basicSetSource(null, msgs);
			case ResourcesPackage.QUESTIONNAIRE_RESPONSE__ITEM:
				return ((InternalEList<?>)getItems()).basicRemove(otherEnd, msgs);
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
			case ResourcesPackage.QUESTIONNAIRE_RESPONSE__IDENTIFIER:
				return getIdentifier();
			case ResourcesPackage.QUESTIONNAIRE_RESPONSE__BASED_ON:
				return getBasedOns();
			case ResourcesPackage.QUESTIONNAIRE_RESPONSE__PART_OF:
				return getPartOfs();
			case ResourcesPackage.QUESTIONNAIRE_RESPONSE__QUESTIONNAIRE:
				return getQuestionnaire();
			case ResourcesPackage.QUESTIONNAIRE_RESPONSE__STATUS:
				return getStatus();
			case ResourcesPackage.QUESTIONNAIRE_RESPONSE__SUBJECT:
				return getSubject();
			case ResourcesPackage.QUESTIONNAIRE_RESPONSE__ENCOUNTER:
				return getEncounter();
			case ResourcesPackage.QUESTIONNAIRE_RESPONSE__AUTHORED:
				return getAuthored();
			case ResourcesPackage.QUESTIONNAIRE_RESPONSE__AUTHOR:
				return getAuthor();
			case ResourcesPackage.QUESTIONNAIRE_RESPONSE__SOURCE:
				return getSource();
			case ResourcesPackage.QUESTIONNAIRE_RESPONSE__ITEM:
				return getItems();
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
			case ResourcesPackage.QUESTIONNAIRE_RESPONSE__IDENTIFIER:
				setIdentifier((Identifier)newValue);
				return;
			case ResourcesPackage.QUESTIONNAIRE_RESPONSE__BASED_ON:
				getBasedOns().clear();
				getBasedOns().addAll((Collection<? extends Reference>)newValue);
				return;
			case ResourcesPackage.QUESTIONNAIRE_RESPONSE__PART_OF:
				getPartOfs().clear();
				getPartOfs().addAll((Collection<? extends Reference>)newValue);
				return;
			case ResourcesPackage.QUESTIONNAIRE_RESPONSE__QUESTIONNAIRE:
				setQuestionnaire((Questionnaire)newValue);
				return;
			case ResourcesPackage.QUESTIONNAIRE_RESPONSE__STATUS:
				setStatus((Code)newValue);
				return;
			case ResourcesPackage.QUESTIONNAIRE_RESPONSE__SUBJECT:
				setSubject((Reference)newValue);
				return;
			case ResourcesPackage.QUESTIONNAIRE_RESPONSE__ENCOUNTER:
				setEncounter((Reference)newValue);
				return;
			case ResourcesPackage.QUESTIONNAIRE_RESPONSE__AUTHORED:
				setAuthored((DateTime)newValue);
				return;
			case ResourcesPackage.QUESTIONNAIRE_RESPONSE__AUTHOR:
				setAuthor((Reference)newValue);
				return;
			case ResourcesPackage.QUESTIONNAIRE_RESPONSE__SOURCE:
				setSource((Reference)newValue);
				return;
			case ResourcesPackage.QUESTIONNAIRE_RESPONSE__ITEM:
				getItems().clear();
				getItems().addAll((Collection<? extends QuestionnaireResponseItem>)newValue);
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
			case ResourcesPackage.QUESTIONNAIRE_RESPONSE__IDENTIFIER:
				setIdentifier((Identifier)null);
				return;
			case ResourcesPackage.QUESTIONNAIRE_RESPONSE__BASED_ON:
				getBasedOns().clear();
				return;
			case ResourcesPackage.QUESTIONNAIRE_RESPONSE__PART_OF:
				getPartOfs().clear();
				return;
			case ResourcesPackage.QUESTIONNAIRE_RESPONSE__QUESTIONNAIRE:
				setQuestionnaire((Questionnaire)null);
				return;
			case ResourcesPackage.QUESTIONNAIRE_RESPONSE__STATUS:
				setStatus((Code)null);
				return;
			case ResourcesPackage.QUESTIONNAIRE_RESPONSE__SUBJECT:
				setSubject((Reference)null);
				return;
			case ResourcesPackage.QUESTIONNAIRE_RESPONSE__ENCOUNTER:
				setEncounter((Reference)null);
				return;
			case ResourcesPackage.QUESTIONNAIRE_RESPONSE__AUTHORED:
				setAuthored((DateTime)null);
				return;
			case ResourcesPackage.QUESTIONNAIRE_RESPONSE__AUTHOR:
				setAuthor((Reference)null);
				return;
			case ResourcesPackage.QUESTIONNAIRE_RESPONSE__SOURCE:
				setSource((Reference)null);
				return;
			case ResourcesPackage.QUESTIONNAIRE_RESPONSE__ITEM:
				getItems().clear();
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
			case ResourcesPackage.QUESTIONNAIRE_RESPONSE__IDENTIFIER:
				return identifier != null;
			case ResourcesPackage.QUESTIONNAIRE_RESPONSE__BASED_ON:
				return basedOns != null && !basedOns.isEmpty();
			case ResourcesPackage.QUESTIONNAIRE_RESPONSE__PART_OF:
				return partOfs != null && !partOfs.isEmpty();
			case ResourcesPackage.QUESTIONNAIRE_RESPONSE__QUESTIONNAIRE:
				return questionnaire != null;
			case ResourcesPackage.QUESTIONNAIRE_RESPONSE__STATUS:
				return status != null;
			case ResourcesPackage.QUESTIONNAIRE_RESPONSE__SUBJECT:
				return subject != null;
			case ResourcesPackage.QUESTIONNAIRE_RESPONSE__ENCOUNTER:
				return encounter != null;
			case ResourcesPackage.QUESTIONNAIRE_RESPONSE__AUTHORED:
				return authored != null;
			case ResourcesPackage.QUESTIONNAIRE_RESPONSE__AUTHOR:
				return author != null;
			case ResourcesPackage.QUESTIONNAIRE_RESPONSE__SOURCE:
				return source != null;
			case ResourcesPackage.QUESTIONNAIRE_RESPONSE__ITEM:
				return items != null && !items.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //QuestionnaireResponseImpl
