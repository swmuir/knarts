/**
 */
package fhiRCore.resources.impl;

import fhiRCore.dataTypes.Code;
import fhiRCore.dataTypes.Coding;
import fhiRCore.dataTypes.Uri;

import fhiRCore.dataTypes.impl.BackboneElementImpl;

import fhiRCore.resources.QuestionnaireItem;
import fhiRCore.resources.QuestionnaireItemAnswerOption;
import fhiRCore.resources.QuestionnaireItemEnableWhen;
import fhiRCore.resources.QuestionnaireItemInitial;
import fhiRCore.resources.ResourcesPackage;
import fhiRCore.resources.ValueSet;

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
 * An implementation of the model object '<em><b>Questionnaire Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.impl.QuestionnaireItemImpl#getLinkId <em>Link Id</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.QuestionnaireItemImpl#getDefinition <em>Definition</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.QuestionnaireItemImpl#getCodes <em>Code</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.QuestionnaireItemImpl#getPrefix <em>Prefix</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.QuestionnaireItemImpl#getText <em>Text</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.QuestionnaireItemImpl#getType <em>Type</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.QuestionnaireItemImpl#getEnableWhens <em>Enable When</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.QuestionnaireItemImpl#getEnableBehavior <em>Enable Behavior</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.QuestionnaireItemImpl#getRequired <em>Required</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.QuestionnaireItemImpl#getRepeats <em>Repeats</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.QuestionnaireItemImpl#getReadOnly <em>Read Only</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.QuestionnaireItemImpl#getMaxLength <em>Max Length</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.QuestionnaireItemImpl#getAnswerValueSet <em>Answer Value Set</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.QuestionnaireItemImpl#getAnswerOptions <em>Answer Option</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.QuestionnaireItemImpl#getInitials <em>Initial</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.QuestionnaireItemImpl#getItems <em>Item</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QuestionnaireItemImpl extends BackboneElementImpl implements QuestionnaireItem {
	/**
	 * The cached value of the '{@link #getLinkId() <em>Link Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkId()
	 * @generated
	 * @ordered
	 */
	protected fhiRCore.dataTypes.String linkId;

	/**
	 * The cached value of the '{@link #getDefinition() <em>Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefinition()
	 * @generated
	 * @ordered
	 */
	protected Uri definition;

	/**
	 * The cached value of the '{@link #getCodes() <em>Code</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodes()
	 * @generated
	 * @ordered
	 */
	protected EList<Coding> codes;

	/**
	 * The cached value of the '{@link #getPrefix() <em>Prefix</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrefix()
	 * @generated
	 * @ordered
	 */
	protected fhiRCore.dataTypes.String prefix;

	/**
	 * The cached value of the '{@link #getText() <em>Text</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected fhiRCore.dataTypes.String text;

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
	 * The cached value of the '{@link #getEnableWhens() <em>Enable When</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnableWhens()
	 * @generated
	 * @ordered
	 */
	protected EList<QuestionnaireItemEnableWhen> enableWhens;

	/**
	 * The cached value of the '{@link #getEnableBehavior() <em>Enable Behavior</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnableBehavior()
	 * @generated
	 * @ordered
	 */
	protected Code enableBehavior;

	/**
	 * The cached value of the '{@link #getRequired() <em>Required</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequired()
	 * @generated
	 * @ordered
	 */
	protected fhiRCore.dataTypes.Boolean required;

	/**
	 * The cached value of the '{@link #getRepeats() <em>Repeats</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepeats()
	 * @generated
	 * @ordered
	 */
	protected fhiRCore.dataTypes.Boolean repeats;

	/**
	 * The cached value of the '{@link #getReadOnly() <em>Read Only</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReadOnly()
	 * @generated
	 * @ordered
	 */
	protected fhiRCore.dataTypes.Boolean readOnly;

	/**
	 * The cached value of the '{@link #getMaxLength() <em>Max Length</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxLength()
	 * @generated
	 * @ordered
	 */
	protected fhiRCore.dataTypes.Integer maxLength;

	/**
	 * The cached value of the '{@link #getAnswerValueSet() <em>Answer Value Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnswerValueSet()
	 * @generated
	 * @ordered
	 */
	protected ValueSet answerValueSet;

	/**
	 * The cached value of the '{@link #getAnswerOptions() <em>Answer Option</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnswerOptions()
	 * @generated
	 * @ordered
	 */
	protected EList<QuestionnaireItemAnswerOption> answerOptions;

	/**
	 * The cached value of the '{@link #getInitials() <em>Initial</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitials()
	 * @generated
	 * @ordered
	 */
	protected EList<QuestionnaireItemInitial> initials;

	/**
	 * The cached value of the '{@link #getItems() <em>Item</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItems()
	 * @generated
	 * @ordered
	 */
	protected EList<QuestionnaireItem> items;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QuestionnaireItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getQuestionnaireItem();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public fhiRCore.dataTypes.String getLinkId() {
		return linkId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLinkId(fhiRCore.dataTypes.String newLinkId, NotificationChain msgs) {
		fhiRCore.dataTypes.String oldLinkId = linkId;
		linkId = newLinkId;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.QUESTIONNAIRE_ITEM__LINK_ID, oldLinkId, newLinkId);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLinkId(fhiRCore.dataTypes.String newLinkId) {
		if (newLinkId != linkId) {
			NotificationChain msgs = null;
			if (linkId != null)
				msgs = ((InternalEObject)linkId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.QUESTIONNAIRE_ITEM__LINK_ID, null, msgs);
			if (newLinkId != null)
				msgs = ((InternalEObject)newLinkId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.QUESTIONNAIRE_ITEM__LINK_ID, null, msgs);
			msgs = basicSetLinkId(newLinkId, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.QUESTIONNAIRE_ITEM__LINK_ID, newLinkId, newLinkId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Uri getDefinition() {
		return definition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefinition(Uri newDefinition, NotificationChain msgs) {
		Uri oldDefinition = definition;
		definition = newDefinition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.QUESTIONNAIRE_ITEM__DEFINITION, oldDefinition, newDefinition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefinition(Uri newDefinition) {
		if (newDefinition != definition) {
			NotificationChain msgs = null;
			if (definition != null)
				msgs = ((InternalEObject)definition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.QUESTIONNAIRE_ITEM__DEFINITION, null, msgs);
			if (newDefinition != null)
				msgs = ((InternalEObject)newDefinition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.QUESTIONNAIRE_ITEM__DEFINITION, null, msgs);
			msgs = basicSetDefinition(newDefinition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.QUESTIONNAIRE_ITEM__DEFINITION, newDefinition, newDefinition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Coding> getCodes() {
		if (codes == null) {
			codes = new EObjectContainmentEList<Coding>(Coding.class, this, ResourcesPackage.QUESTIONNAIRE_ITEM__CODE);
		}
		return codes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public fhiRCore.dataTypes.String getPrefix() {
		return prefix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPrefix(fhiRCore.dataTypes.String newPrefix, NotificationChain msgs) {
		fhiRCore.dataTypes.String oldPrefix = prefix;
		prefix = newPrefix;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.QUESTIONNAIRE_ITEM__PREFIX, oldPrefix, newPrefix);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrefix(fhiRCore.dataTypes.String newPrefix) {
		if (newPrefix != prefix) {
			NotificationChain msgs = null;
			if (prefix != null)
				msgs = ((InternalEObject)prefix).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.QUESTIONNAIRE_ITEM__PREFIX, null, msgs);
			if (newPrefix != null)
				msgs = ((InternalEObject)newPrefix).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.QUESTIONNAIRE_ITEM__PREFIX, null, msgs);
			msgs = basicSetPrefix(newPrefix, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.QUESTIONNAIRE_ITEM__PREFIX, newPrefix, newPrefix));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public fhiRCore.dataTypes.String getText() {
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetText(fhiRCore.dataTypes.String newText, NotificationChain msgs) {
		fhiRCore.dataTypes.String oldText = text;
		text = newText;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.QUESTIONNAIRE_ITEM__TEXT, oldText, newText);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setText(fhiRCore.dataTypes.String newText) {
		if (newText != text) {
			NotificationChain msgs = null;
			if (text != null)
				msgs = ((InternalEObject)text).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.QUESTIONNAIRE_ITEM__TEXT, null, msgs);
			if (newText != null)
				msgs = ((InternalEObject)newText).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.QUESTIONNAIRE_ITEM__TEXT, null, msgs);
			msgs = basicSetText(newText, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.QUESTIONNAIRE_ITEM__TEXT, newText, newText));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.QUESTIONNAIRE_ITEM__TYPE, oldType, newType);
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
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.QUESTIONNAIRE_ITEM__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.QUESTIONNAIRE_ITEM__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.QUESTIONNAIRE_ITEM__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<QuestionnaireItemEnableWhen> getEnableWhens() {
		if (enableWhens == null) {
			enableWhens = new EObjectContainmentEList<QuestionnaireItemEnableWhen>(QuestionnaireItemEnableWhen.class, this, ResourcesPackage.QUESTIONNAIRE_ITEM__ENABLE_WHEN);
		}
		return enableWhens;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getEnableBehavior() {
		return enableBehavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnableBehavior(Code newEnableBehavior, NotificationChain msgs) {
		Code oldEnableBehavior = enableBehavior;
		enableBehavior = newEnableBehavior;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.QUESTIONNAIRE_ITEM__ENABLE_BEHAVIOR, oldEnableBehavior, newEnableBehavior);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnableBehavior(Code newEnableBehavior) {
		if (newEnableBehavior != enableBehavior) {
			NotificationChain msgs = null;
			if (enableBehavior != null)
				msgs = ((InternalEObject)enableBehavior).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.QUESTIONNAIRE_ITEM__ENABLE_BEHAVIOR, null, msgs);
			if (newEnableBehavior != null)
				msgs = ((InternalEObject)newEnableBehavior).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.QUESTIONNAIRE_ITEM__ENABLE_BEHAVIOR, null, msgs);
			msgs = basicSetEnableBehavior(newEnableBehavior, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.QUESTIONNAIRE_ITEM__ENABLE_BEHAVIOR, newEnableBehavior, newEnableBehavior));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public fhiRCore.dataTypes.Boolean getRequired() {
		return required;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRequired(fhiRCore.dataTypes.Boolean newRequired, NotificationChain msgs) {
		fhiRCore.dataTypes.Boolean oldRequired = required;
		required = newRequired;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.QUESTIONNAIRE_ITEM__REQUIRED, oldRequired, newRequired);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequired(fhiRCore.dataTypes.Boolean newRequired) {
		if (newRequired != required) {
			NotificationChain msgs = null;
			if (required != null)
				msgs = ((InternalEObject)required).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.QUESTIONNAIRE_ITEM__REQUIRED, null, msgs);
			if (newRequired != null)
				msgs = ((InternalEObject)newRequired).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.QUESTIONNAIRE_ITEM__REQUIRED, null, msgs);
			msgs = basicSetRequired(newRequired, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.QUESTIONNAIRE_ITEM__REQUIRED, newRequired, newRequired));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public fhiRCore.dataTypes.Boolean getRepeats() {
		return repeats;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRepeats(fhiRCore.dataTypes.Boolean newRepeats, NotificationChain msgs) {
		fhiRCore.dataTypes.Boolean oldRepeats = repeats;
		repeats = newRepeats;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.QUESTIONNAIRE_ITEM__REPEATS, oldRepeats, newRepeats);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRepeats(fhiRCore.dataTypes.Boolean newRepeats) {
		if (newRepeats != repeats) {
			NotificationChain msgs = null;
			if (repeats != null)
				msgs = ((InternalEObject)repeats).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.QUESTIONNAIRE_ITEM__REPEATS, null, msgs);
			if (newRepeats != null)
				msgs = ((InternalEObject)newRepeats).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.QUESTIONNAIRE_ITEM__REPEATS, null, msgs);
			msgs = basicSetRepeats(newRepeats, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.QUESTIONNAIRE_ITEM__REPEATS, newRepeats, newRepeats));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public fhiRCore.dataTypes.Boolean getReadOnly() {
		return readOnly;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReadOnly(fhiRCore.dataTypes.Boolean newReadOnly, NotificationChain msgs) {
		fhiRCore.dataTypes.Boolean oldReadOnly = readOnly;
		readOnly = newReadOnly;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.QUESTIONNAIRE_ITEM__READ_ONLY, oldReadOnly, newReadOnly);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReadOnly(fhiRCore.dataTypes.Boolean newReadOnly) {
		if (newReadOnly != readOnly) {
			NotificationChain msgs = null;
			if (readOnly != null)
				msgs = ((InternalEObject)readOnly).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.QUESTIONNAIRE_ITEM__READ_ONLY, null, msgs);
			if (newReadOnly != null)
				msgs = ((InternalEObject)newReadOnly).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.QUESTIONNAIRE_ITEM__READ_ONLY, null, msgs);
			msgs = basicSetReadOnly(newReadOnly, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.QUESTIONNAIRE_ITEM__READ_ONLY, newReadOnly, newReadOnly));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public fhiRCore.dataTypes.Integer getMaxLength() {
		return maxLength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMaxLength(fhiRCore.dataTypes.Integer newMaxLength, NotificationChain msgs) {
		fhiRCore.dataTypes.Integer oldMaxLength = maxLength;
		maxLength = newMaxLength;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.QUESTIONNAIRE_ITEM__MAX_LENGTH, oldMaxLength, newMaxLength);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxLength(fhiRCore.dataTypes.Integer newMaxLength) {
		if (newMaxLength != maxLength) {
			NotificationChain msgs = null;
			if (maxLength != null)
				msgs = ((InternalEObject)maxLength).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.QUESTIONNAIRE_ITEM__MAX_LENGTH, null, msgs);
			if (newMaxLength != null)
				msgs = ((InternalEObject)newMaxLength).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.QUESTIONNAIRE_ITEM__MAX_LENGTH, null, msgs);
			msgs = basicSetMaxLength(newMaxLength, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.QUESTIONNAIRE_ITEM__MAX_LENGTH, newMaxLength, newMaxLength));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSet getAnswerValueSet() {
		return answerValueSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnswerValueSet(ValueSet newAnswerValueSet, NotificationChain msgs) {
		ValueSet oldAnswerValueSet = answerValueSet;
		answerValueSet = newAnswerValueSet;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.QUESTIONNAIRE_ITEM__ANSWER_VALUE_SET, oldAnswerValueSet, newAnswerValueSet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnswerValueSet(ValueSet newAnswerValueSet) {
		if (newAnswerValueSet != answerValueSet) {
			NotificationChain msgs = null;
			if (answerValueSet != null)
				msgs = ((InternalEObject)answerValueSet).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.QUESTIONNAIRE_ITEM__ANSWER_VALUE_SET, null, msgs);
			if (newAnswerValueSet != null)
				msgs = ((InternalEObject)newAnswerValueSet).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.QUESTIONNAIRE_ITEM__ANSWER_VALUE_SET, null, msgs);
			msgs = basicSetAnswerValueSet(newAnswerValueSet, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.QUESTIONNAIRE_ITEM__ANSWER_VALUE_SET, newAnswerValueSet, newAnswerValueSet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<QuestionnaireItemAnswerOption> getAnswerOptions() {
		if (answerOptions == null) {
			answerOptions = new EObjectContainmentEList<QuestionnaireItemAnswerOption>(QuestionnaireItemAnswerOption.class, this, ResourcesPackage.QUESTIONNAIRE_ITEM__ANSWER_OPTION);
		}
		return answerOptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<QuestionnaireItemInitial> getInitials() {
		if (initials == null) {
			initials = new EObjectContainmentEList<QuestionnaireItemInitial>(QuestionnaireItemInitial.class, this, ResourcesPackage.QUESTIONNAIRE_ITEM__INITIAL);
		}
		return initials;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<QuestionnaireItem> getItems() {
		if (items == null) {
			items = new EObjectContainmentEList<QuestionnaireItem>(QuestionnaireItem.class, this, ResourcesPackage.QUESTIONNAIRE_ITEM__ITEM);
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
			case ResourcesPackage.QUESTIONNAIRE_ITEM__LINK_ID:
				return basicSetLinkId(null, msgs);
			case ResourcesPackage.QUESTIONNAIRE_ITEM__DEFINITION:
				return basicSetDefinition(null, msgs);
			case ResourcesPackage.QUESTIONNAIRE_ITEM__CODE:
				return ((InternalEList<?>)getCodes()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.QUESTIONNAIRE_ITEM__PREFIX:
				return basicSetPrefix(null, msgs);
			case ResourcesPackage.QUESTIONNAIRE_ITEM__TEXT:
				return basicSetText(null, msgs);
			case ResourcesPackage.QUESTIONNAIRE_ITEM__TYPE:
				return basicSetType(null, msgs);
			case ResourcesPackage.QUESTIONNAIRE_ITEM__ENABLE_WHEN:
				return ((InternalEList<?>)getEnableWhens()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.QUESTIONNAIRE_ITEM__ENABLE_BEHAVIOR:
				return basicSetEnableBehavior(null, msgs);
			case ResourcesPackage.QUESTIONNAIRE_ITEM__REQUIRED:
				return basicSetRequired(null, msgs);
			case ResourcesPackage.QUESTIONNAIRE_ITEM__REPEATS:
				return basicSetRepeats(null, msgs);
			case ResourcesPackage.QUESTIONNAIRE_ITEM__READ_ONLY:
				return basicSetReadOnly(null, msgs);
			case ResourcesPackage.QUESTIONNAIRE_ITEM__MAX_LENGTH:
				return basicSetMaxLength(null, msgs);
			case ResourcesPackage.QUESTIONNAIRE_ITEM__ANSWER_VALUE_SET:
				return basicSetAnswerValueSet(null, msgs);
			case ResourcesPackage.QUESTIONNAIRE_ITEM__ANSWER_OPTION:
				return ((InternalEList<?>)getAnswerOptions()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.QUESTIONNAIRE_ITEM__INITIAL:
				return ((InternalEList<?>)getInitials()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.QUESTIONNAIRE_ITEM__ITEM:
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
			case ResourcesPackage.QUESTIONNAIRE_ITEM__LINK_ID:
				return getLinkId();
			case ResourcesPackage.QUESTIONNAIRE_ITEM__DEFINITION:
				return getDefinition();
			case ResourcesPackage.QUESTIONNAIRE_ITEM__CODE:
				return getCodes();
			case ResourcesPackage.QUESTIONNAIRE_ITEM__PREFIX:
				return getPrefix();
			case ResourcesPackage.QUESTIONNAIRE_ITEM__TEXT:
				return getText();
			case ResourcesPackage.QUESTIONNAIRE_ITEM__TYPE:
				return getType();
			case ResourcesPackage.QUESTIONNAIRE_ITEM__ENABLE_WHEN:
				return getEnableWhens();
			case ResourcesPackage.QUESTIONNAIRE_ITEM__ENABLE_BEHAVIOR:
				return getEnableBehavior();
			case ResourcesPackage.QUESTIONNAIRE_ITEM__REQUIRED:
				return getRequired();
			case ResourcesPackage.QUESTIONNAIRE_ITEM__REPEATS:
				return getRepeats();
			case ResourcesPackage.QUESTIONNAIRE_ITEM__READ_ONLY:
				return getReadOnly();
			case ResourcesPackage.QUESTIONNAIRE_ITEM__MAX_LENGTH:
				return getMaxLength();
			case ResourcesPackage.QUESTIONNAIRE_ITEM__ANSWER_VALUE_SET:
				return getAnswerValueSet();
			case ResourcesPackage.QUESTIONNAIRE_ITEM__ANSWER_OPTION:
				return getAnswerOptions();
			case ResourcesPackage.QUESTIONNAIRE_ITEM__INITIAL:
				return getInitials();
			case ResourcesPackage.QUESTIONNAIRE_ITEM__ITEM:
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
			case ResourcesPackage.QUESTIONNAIRE_ITEM__LINK_ID:
				setLinkId((fhiRCore.dataTypes.String)newValue);
				return;
			case ResourcesPackage.QUESTIONNAIRE_ITEM__DEFINITION:
				setDefinition((Uri)newValue);
				return;
			case ResourcesPackage.QUESTIONNAIRE_ITEM__CODE:
				getCodes().clear();
				getCodes().addAll((Collection<? extends Coding>)newValue);
				return;
			case ResourcesPackage.QUESTIONNAIRE_ITEM__PREFIX:
				setPrefix((fhiRCore.dataTypes.String)newValue);
				return;
			case ResourcesPackage.QUESTIONNAIRE_ITEM__TEXT:
				setText((fhiRCore.dataTypes.String)newValue);
				return;
			case ResourcesPackage.QUESTIONNAIRE_ITEM__TYPE:
				setType((Code)newValue);
				return;
			case ResourcesPackage.QUESTIONNAIRE_ITEM__ENABLE_WHEN:
				getEnableWhens().clear();
				getEnableWhens().addAll((Collection<? extends QuestionnaireItemEnableWhen>)newValue);
				return;
			case ResourcesPackage.QUESTIONNAIRE_ITEM__ENABLE_BEHAVIOR:
				setEnableBehavior((Code)newValue);
				return;
			case ResourcesPackage.QUESTIONNAIRE_ITEM__REQUIRED:
				setRequired((fhiRCore.dataTypes.Boolean)newValue);
				return;
			case ResourcesPackage.QUESTIONNAIRE_ITEM__REPEATS:
				setRepeats((fhiRCore.dataTypes.Boolean)newValue);
				return;
			case ResourcesPackage.QUESTIONNAIRE_ITEM__READ_ONLY:
				setReadOnly((fhiRCore.dataTypes.Boolean)newValue);
				return;
			case ResourcesPackage.QUESTIONNAIRE_ITEM__MAX_LENGTH:
				setMaxLength((fhiRCore.dataTypes.Integer)newValue);
				return;
			case ResourcesPackage.QUESTIONNAIRE_ITEM__ANSWER_VALUE_SET:
				setAnswerValueSet((ValueSet)newValue);
				return;
			case ResourcesPackage.QUESTIONNAIRE_ITEM__ANSWER_OPTION:
				getAnswerOptions().clear();
				getAnswerOptions().addAll((Collection<? extends QuestionnaireItemAnswerOption>)newValue);
				return;
			case ResourcesPackage.QUESTIONNAIRE_ITEM__INITIAL:
				getInitials().clear();
				getInitials().addAll((Collection<? extends QuestionnaireItemInitial>)newValue);
				return;
			case ResourcesPackage.QUESTIONNAIRE_ITEM__ITEM:
				getItems().clear();
				getItems().addAll((Collection<? extends QuestionnaireItem>)newValue);
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
			case ResourcesPackage.QUESTIONNAIRE_ITEM__LINK_ID:
				setLinkId((fhiRCore.dataTypes.String)null);
				return;
			case ResourcesPackage.QUESTIONNAIRE_ITEM__DEFINITION:
				setDefinition((Uri)null);
				return;
			case ResourcesPackage.QUESTIONNAIRE_ITEM__CODE:
				getCodes().clear();
				return;
			case ResourcesPackage.QUESTIONNAIRE_ITEM__PREFIX:
				setPrefix((fhiRCore.dataTypes.String)null);
				return;
			case ResourcesPackage.QUESTIONNAIRE_ITEM__TEXT:
				setText((fhiRCore.dataTypes.String)null);
				return;
			case ResourcesPackage.QUESTIONNAIRE_ITEM__TYPE:
				setType((Code)null);
				return;
			case ResourcesPackage.QUESTIONNAIRE_ITEM__ENABLE_WHEN:
				getEnableWhens().clear();
				return;
			case ResourcesPackage.QUESTIONNAIRE_ITEM__ENABLE_BEHAVIOR:
				setEnableBehavior((Code)null);
				return;
			case ResourcesPackage.QUESTIONNAIRE_ITEM__REQUIRED:
				setRequired((fhiRCore.dataTypes.Boolean)null);
				return;
			case ResourcesPackage.QUESTIONNAIRE_ITEM__REPEATS:
				setRepeats((fhiRCore.dataTypes.Boolean)null);
				return;
			case ResourcesPackage.QUESTIONNAIRE_ITEM__READ_ONLY:
				setReadOnly((fhiRCore.dataTypes.Boolean)null);
				return;
			case ResourcesPackage.QUESTIONNAIRE_ITEM__MAX_LENGTH:
				setMaxLength((fhiRCore.dataTypes.Integer)null);
				return;
			case ResourcesPackage.QUESTIONNAIRE_ITEM__ANSWER_VALUE_SET:
				setAnswerValueSet((ValueSet)null);
				return;
			case ResourcesPackage.QUESTIONNAIRE_ITEM__ANSWER_OPTION:
				getAnswerOptions().clear();
				return;
			case ResourcesPackage.QUESTIONNAIRE_ITEM__INITIAL:
				getInitials().clear();
				return;
			case ResourcesPackage.QUESTIONNAIRE_ITEM__ITEM:
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
			case ResourcesPackage.QUESTIONNAIRE_ITEM__LINK_ID:
				return linkId != null;
			case ResourcesPackage.QUESTIONNAIRE_ITEM__DEFINITION:
				return definition != null;
			case ResourcesPackage.QUESTIONNAIRE_ITEM__CODE:
				return codes != null && !codes.isEmpty();
			case ResourcesPackage.QUESTIONNAIRE_ITEM__PREFIX:
				return prefix != null;
			case ResourcesPackage.QUESTIONNAIRE_ITEM__TEXT:
				return text != null;
			case ResourcesPackage.QUESTIONNAIRE_ITEM__TYPE:
				return type != null;
			case ResourcesPackage.QUESTIONNAIRE_ITEM__ENABLE_WHEN:
				return enableWhens != null && !enableWhens.isEmpty();
			case ResourcesPackage.QUESTIONNAIRE_ITEM__ENABLE_BEHAVIOR:
				return enableBehavior != null;
			case ResourcesPackage.QUESTIONNAIRE_ITEM__REQUIRED:
				return required != null;
			case ResourcesPackage.QUESTIONNAIRE_ITEM__REPEATS:
				return repeats != null;
			case ResourcesPackage.QUESTIONNAIRE_ITEM__READ_ONLY:
				return readOnly != null;
			case ResourcesPackage.QUESTIONNAIRE_ITEM__MAX_LENGTH:
				return maxLength != null;
			case ResourcesPackage.QUESTIONNAIRE_ITEM__ANSWER_VALUE_SET:
				return answerValueSet != null;
			case ResourcesPackage.QUESTIONNAIRE_ITEM__ANSWER_OPTION:
				return answerOptions != null && !answerOptions.isEmpty();
			case ResourcesPackage.QUESTIONNAIRE_ITEM__INITIAL:
				return initials != null && !initials.isEmpty();
			case ResourcesPackage.QUESTIONNAIRE_ITEM__ITEM:
				return items != null && !items.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //QuestionnaireItemImpl
