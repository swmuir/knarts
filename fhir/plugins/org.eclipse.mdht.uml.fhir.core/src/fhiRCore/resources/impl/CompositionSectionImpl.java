/**
 */
package fhiRCore.resources.impl;

import fhiRCore.dataTypes.Code;
import fhiRCore.dataTypes.CodeableConcept;
import fhiRCore.dataTypes.Narrative;
import fhiRCore.dataTypes.Reference;

import fhiRCore.dataTypes.impl.BackboneElementImpl;

import fhiRCore.resources.CompositionSection;
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
 * An implementation of the model object '<em><b>Composition Section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.impl.CompositionSectionImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.CompositionSectionImpl#getCode <em>Code</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.CompositionSectionImpl#getAuthors <em>Author</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.CompositionSectionImpl#getFocus <em>Focus</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.CompositionSectionImpl#getText <em>Text</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.CompositionSectionImpl#getMode <em>Mode</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.CompositionSectionImpl#getOrderedBy <em>Ordered By</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.CompositionSectionImpl#getEntries <em>Entry</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.CompositionSectionImpl#getEmptyReason <em>Empty Reason</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.CompositionSectionImpl#getSections <em>Section</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CompositionSectionImpl extends BackboneElementImpl implements CompositionSection {
	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected fhiRCore.dataTypes.String title;

	/**
	 * The cached value of the '{@link #getCode() <em>Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept code;

	/**
	 * The cached value of the '{@link #getAuthors() <em>Author</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthors()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> authors;

	/**
	 * The cached value of the '{@link #getFocus() <em>Focus</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFocus()
	 * @generated
	 * @ordered
	 */
	protected Reference focus;

	/**
	 * The cached value of the '{@link #getText() <em>Text</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected Narrative text;

	/**
	 * The cached value of the '{@link #getMode() <em>Mode</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMode()
	 * @generated
	 * @ordered
	 */
	protected Code mode;

	/**
	 * The cached value of the '{@link #getOrderedBy() <em>Ordered By</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderedBy()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept orderedBy;

	/**
	 * The cached value of the '{@link #getEntries() <em>Entry</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntries()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> entries;

	/**
	 * The cached value of the '{@link #getEmptyReason() <em>Empty Reason</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmptyReason()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept emptyReason;

	/**
	 * The cached value of the '{@link #getSections() <em>Section</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSections()
	 * @generated
	 * @ordered
	 */
	protected EList<CompositionSection> sections;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompositionSectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getCompositionSection();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public fhiRCore.dataTypes.String getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTitle(fhiRCore.dataTypes.String newTitle, NotificationChain msgs) {
		fhiRCore.dataTypes.String oldTitle = title;
		title = newTitle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.COMPOSITION_SECTION__TITLE, oldTitle, newTitle);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitle(fhiRCore.dataTypes.String newTitle) {
		if (newTitle != title) {
			NotificationChain msgs = null;
			if (title != null)
				msgs = ((InternalEObject)title).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.COMPOSITION_SECTION__TITLE, null, msgs);
			if (newTitle != null)
				msgs = ((InternalEObject)newTitle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.COMPOSITION_SECTION__TITLE, null, msgs);
			msgs = basicSetTitle(newTitle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.COMPOSITION_SECTION__TITLE, newTitle, newTitle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getCode() {
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCode(CodeableConcept newCode, NotificationChain msgs) {
		CodeableConcept oldCode = code;
		code = newCode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.COMPOSITION_SECTION__CODE, oldCode, newCode);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCode(CodeableConcept newCode) {
		if (newCode != code) {
			NotificationChain msgs = null;
			if (code != null)
				msgs = ((InternalEObject)code).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.COMPOSITION_SECTION__CODE, null, msgs);
			if (newCode != null)
				msgs = ((InternalEObject)newCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.COMPOSITION_SECTION__CODE, null, msgs);
			msgs = basicSetCode(newCode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.COMPOSITION_SECTION__CODE, newCode, newCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getAuthors() {
		if (authors == null) {
			authors = new EObjectContainmentEList<Reference>(Reference.class, this, ResourcesPackage.COMPOSITION_SECTION__AUTHOR);
		}
		return authors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getFocus() {
		return focus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFocus(Reference newFocus, NotificationChain msgs) {
		Reference oldFocus = focus;
		focus = newFocus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.COMPOSITION_SECTION__FOCUS, oldFocus, newFocus);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFocus(Reference newFocus) {
		if (newFocus != focus) {
			NotificationChain msgs = null;
			if (focus != null)
				msgs = ((InternalEObject)focus).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.COMPOSITION_SECTION__FOCUS, null, msgs);
			if (newFocus != null)
				msgs = ((InternalEObject)newFocus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.COMPOSITION_SECTION__FOCUS, null, msgs);
			msgs = basicSetFocus(newFocus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.COMPOSITION_SECTION__FOCUS, newFocus, newFocus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Narrative getText() {
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetText(Narrative newText, NotificationChain msgs) {
		Narrative oldText = text;
		text = newText;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.COMPOSITION_SECTION__TEXT, oldText, newText);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setText(Narrative newText) {
		if (newText != text) {
			NotificationChain msgs = null;
			if (text != null)
				msgs = ((InternalEObject)text).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.COMPOSITION_SECTION__TEXT, null, msgs);
			if (newText != null)
				msgs = ((InternalEObject)newText).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.COMPOSITION_SECTION__TEXT, null, msgs);
			msgs = basicSetText(newText, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.COMPOSITION_SECTION__TEXT, newText, newText));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getMode() {
		return mode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMode(Code newMode, NotificationChain msgs) {
		Code oldMode = mode;
		mode = newMode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.COMPOSITION_SECTION__MODE, oldMode, newMode);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMode(Code newMode) {
		if (newMode != mode) {
			NotificationChain msgs = null;
			if (mode != null)
				msgs = ((InternalEObject)mode).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.COMPOSITION_SECTION__MODE, null, msgs);
			if (newMode != null)
				msgs = ((InternalEObject)newMode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.COMPOSITION_SECTION__MODE, null, msgs);
			msgs = basicSetMode(newMode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.COMPOSITION_SECTION__MODE, newMode, newMode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getOrderedBy() {
		return orderedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOrderedBy(CodeableConcept newOrderedBy, NotificationChain msgs) {
		CodeableConcept oldOrderedBy = orderedBy;
		orderedBy = newOrderedBy;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.COMPOSITION_SECTION__ORDERED_BY, oldOrderedBy, newOrderedBy);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrderedBy(CodeableConcept newOrderedBy) {
		if (newOrderedBy != orderedBy) {
			NotificationChain msgs = null;
			if (orderedBy != null)
				msgs = ((InternalEObject)orderedBy).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.COMPOSITION_SECTION__ORDERED_BY, null, msgs);
			if (newOrderedBy != null)
				msgs = ((InternalEObject)newOrderedBy).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.COMPOSITION_SECTION__ORDERED_BY, null, msgs);
			msgs = basicSetOrderedBy(newOrderedBy, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.COMPOSITION_SECTION__ORDERED_BY, newOrderedBy, newOrderedBy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getEntries() {
		if (entries == null) {
			entries = new EObjectContainmentEList<Reference>(Reference.class, this, ResourcesPackage.COMPOSITION_SECTION__ENTRY);
		}
		return entries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getEmptyReason() {
		return emptyReason;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEmptyReason(CodeableConcept newEmptyReason, NotificationChain msgs) {
		CodeableConcept oldEmptyReason = emptyReason;
		emptyReason = newEmptyReason;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.COMPOSITION_SECTION__EMPTY_REASON, oldEmptyReason, newEmptyReason);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEmptyReason(CodeableConcept newEmptyReason) {
		if (newEmptyReason != emptyReason) {
			NotificationChain msgs = null;
			if (emptyReason != null)
				msgs = ((InternalEObject)emptyReason).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.COMPOSITION_SECTION__EMPTY_REASON, null, msgs);
			if (newEmptyReason != null)
				msgs = ((InternalEObject)newEmptyReason).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.COMPOSITION_SECTION__EMPTY_REASON, null, msgs);
			msgs = basicSetEmptyReason(newEmptyReason, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.COMPOSITION_SECTION__EMPTY_REASON, newEmptyReason, newEmptyReason));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CompositionSection> getSections() {
		if (sections == null) {
			sections = new EObjectContainmentEList<CompositionSection>(CompositionSection.class, this, ResourcesPackage.COMPOSITION_SECTION__SECTION);
		}
		return sections;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.COMPOSITION_SECTION__TITLE:
				return basicSetTitle(null, msgs);
			case ResourcesPackage.COMPOSITION_SECTION__CODE:
				return basicSetCode(null, msgs);
			case ResourcesPackage.COMPOSITION_SECTION__AUTHOR:
				return ((InternalEList<?>)getAuthors()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.COMPOSITION_SECTION__FOCUS:
				return basicSetFocus(null, msgs);
			case ResourcesPackage.COMPOSITION_SECTION__TEXT:
				return basicSetText(null, msgs);
			case ResourcesPackage.COMPOSITION_SECTION__MODE:
				return basicSetMode(null, msgs);
			case ResourcesPackage.COMPOSITION_SECTION__ORDERED_BY:
				return basicSetOrderedBy(null, msgs);
			case ResourcesPackage.COMPOSITION_SECTION__ENTRY:
				return ((InternalEList<?>)getEntries()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.COMPOSITION_SECTION__EMPTY_REASON:
				return basicSetEmptyReason(null, msgs);
			case ResourcesPackage.COMPOSITION_SECTION__SECTION:
				return ((InternalEList<?>)getSections()).basicRemove(otherEnd, msgs);
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
			case ResourcesPackage.COMPOSITION_SECTION__TITLE:
				return getTitle();
			case ResourcesPackage.COMPOSITION_SECTION__CODE:
				return getCode();
			case ResourcesPackage.COMPOSITION_SECTION__AUTHOR:
				return getAuthors();
			case ResourcesPackage.COMPOSITION_SECTION__FOCUS:
				return getFocus();
			case ResourcesPackage.COMPOSITION_SECTION__TEXT:
				return getText();
			case ResourcesPackage.COMPOSITION_SECTION__MODE:
				return getMode();
			case ResourcesPackage.COMPOSITION_SECTION__ORDERED_BY:
				return getOrderedBy();
			case ResourcesPackage.COMPOSITION_SECTION__ENTRY:
				return getEntries();
			case ResourcesPackage.COMPOSITION_SECTION__EMPTY_REASON:
				return getEmptyReason();
			case ResourcesPackage.COMPOSITION_SECTION__SECTION:
				return getSections();
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
			case ResourcesPackage.COMPOSITION_SECTION__TITLE:
				setTitle((fhiRCore.dataTypes.String)newValue);
				return;
			case ResourcesPackage.COMPOSITION_SECTION__CODE:
				setCode((CodeableConcept)newValue);
				return;
			case ResourcesPackage.COMPOSITION_SECTION__AUTHOR:
				getAuthors().clear();
				getAuthors().addAll((Collection<? extends Reference>)newValue);
				return;
			case ResourcesPackage.COMPOSITION_SECTION__FOCUS:
				setFocus((Reference)newValue);
				return;
			case ResourcesPackage.COMPOSITION_SECTION__TEXT:
				setText((Narrative)newValue);
				return;
			case ResourcesPackage.COMPOSITION_SECTION__MODE:
				setMode((Code)newValue);
				return;
			case ResourcesPackage.COMPOSITION_SECTION__ORDERED_BY:
				setOrderedBy((CodeableConcept)newValue);
				return;
			case ResourcesPackage.COMPOSITION_SECTION__ENTRY:
				getEntries().clear();
				getEntries().addAll((Collection<? extends Reference>)newValue);
				return;
			case ResourcesPackage.COMPOSITION_SECTION__EMPTY_REASON:
				setEmptyReason((CodeableConcept)newValue);
				return;
			case ResourcesPackage.COMPOSITION_SECTION__SECTION:
				getSections().clear();
				getSections().addAll((Collection<? extends CompositionSection>)newValue);
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
			case ResourcesPackage.COMPOSITION_SECTION__TITLE:
				setTitle((fhiRCore.dataTypes.String)null);
				return;
			case ResourcesPackage.COMPOSITION_SECTION__CODE:
				setCode((CodeableConcept)null);
				return;
			case ResourcesPackage.COMPOSITION_SECTION__AUTHOR:
				getAuthors().clear();
				return;
			case ResourcesPackage.COMPOSITION_SECTION__FOCUS:
				setFocus((Reference)null);
				return;
			case ResourcesPackage.COMPOSITION_SECTION__TEXT:
				setText((Narrative)null);
				return;
			case ResourcesPackage.COMPOSITION_SECTION__MODE:
				setMode((Code)null);
				return;
			case ResourcesPackage.COMPOSITION_SECTION__ORDERED_BY:
				setOrderedBy((CodeableConcept)null);
				return;
			case ResourcesPackage.COMPOSITION_SECTION__ENTRY:
				getEntries().clear();
				return;
			case ResourcesPackage.COMPOSITION_SECTION__EMPTY_REASON:
				setEmptyReason((CodeableConcept)null);
				return;
			case ResourcesPackage.COMPOSITION_SECTION__SECTION:
				getSections().clear();
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
			case ResourcesPackage.COMPOSITION_SECTION__TITLE:
				return title != null;
			case ResourcesPackage.COMPOSITION_SECTION__CODE:
				return code != null;
			case ResourcesPackage.COMPOSITION_SECTION__AUTHOR:
				return authors != null && !authors.isEmpty();
			case ResourcesPackage.COMPOSITION_SECTION__FOCUS:
				return focus != null;
			case ResourcesPackage.COMPOSITION_SECTION__TEXT:
				return text != null;
			case ResourcesPackage.COMPOSITION_SECTION__MODE:
				return mode != null;
			case ResourcesPackage.COMPOSITION_SECTION__ORDERED_BY:
				return orderedBy != null;
			case ResourcesPackage.COMPOSITION_SECTION__ENTRY:
				return entries != null && !entries.isEmpty();
			case ResourcesPackage.COMPOSITION_SECTION__EMPTY_REASON:
				return emptyReason != null;
			case ResourcesPackage.COMPOSITION_SECTION__SECTION:
				return sections != null && !sections.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CompositionSectionImpl
