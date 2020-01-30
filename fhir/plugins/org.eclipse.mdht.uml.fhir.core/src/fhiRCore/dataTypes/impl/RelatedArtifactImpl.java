/**
 */
package fhiRCore.dataTypes.impl;

import fhiRCore.dataTypes.Attachment;
import fhiRCore.dataTypes.Code;
import fhiRCore.dataTypes.DataTypesPackage;
import fhiRCore.dataTypes.Markdown;
import fhiRCore.dataTypes.RelatedArtifact;
import fhiRCore.dataTypes.Url;

import fhiRCore.resources.Resource;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Related Artifact</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.dataTypes.impl.RelatedArtifactImpl#getType <em>Type</em>}</li>
 *   <li>{@link fhiRCore.dataTypes.impl.RelatedArtifactImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link fhiRCore.dataTypes.impl.RelatedArtifactImpl#getDisplay <em>Display</em>}</li>
 *   <li>{@link fhiRCore.dataTypes.impl.RelatedArtifactImpl#getCitation <em>Citation</em>}</li>
 *   <li>{@link fhiRCore.dataTypes.impl.RelatedArtifactImpl#getUrl <em>Url</em>}</li>
 *   <li>{@link fhiRCore.dataTypes.impl.RelatedArtifactImpl#getDocument <em>Document</em>}</li>
 *   <li>{@link fhiRCore.dataTypes.impl.RelatedArtifactImpl#getResource <em>Resource</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RelatedArtifactImpl extends DataTypeImpl implements RelatedArtifact {
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
	 * The cached value of the '{@link #getLabel() <em>Label</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected fhiRCore.dataTypes.String label;

	/**
	 * The cached value of the '{@link #getDisplay() <em>Display</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplay()
	 * @generated
	 * @ordered
	 */
	protected fhiRCore.dataTypes.String display;

	/**
	 * The cached value of the '{@link #getCitation() <em>Citation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCitation()
	 * @generated
	 * @ordered
	 */
	protected Markdown citation;

	/**
	 * The cached value of the '{@link #getUrl() <em>Url</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrl()
	 * @generated
	 * @ordered
	 */
	protected Url url;

	/**
	 * The cached value of the '{@link #getDocument() <em>Document</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocument()
	 * @generated
	 * @ordered
	 */
	protected Attachment document;

	/**
	 * The cached value of the '{@link #getResource() <em>Resource</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResource()
	 * @generated
	 * @ordered
	 */
	protected Resource resource;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelatedArtifactImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataTypesPackage.Literals.RELATED_ARTIFACT;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DataTypesPackage.RELATED_ARTIFACT__TYPE, oldType, newType);
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
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.RELATED_ARTIFACT__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.RELATED_ARTIFACT__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataTypesPackage.RELATED_ARTIFACT__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public fhiRCore.dataTypes.String getLabel() {
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLabel(fhiRCore.dataTypes.String newLabel, NotificationChain msgs) {
		fhiRCore.dataTypes.String oldLabel = label;
		label = newLabel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DataTypesPackage.RELATED_ARTIFACT__LABEL, oldLabel, newLabel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabel(fhiRCore.dataTypes.String newLabel) {
		if (newLabel != label) {
			NotificationChain msgs = null;
			if (label != null)
				msgs = ((InternalEObject)label).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.RELATED_ARTIFACT__LABEL, null, msgs);
			if (newLabel != null)
				msgs = ((InternalEObject)newLabel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.RELATED_ARTIFACT__LABEL, null, msgs);
			msgs = basicSetLabel(newLabel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataTypesPackage.RELATED_ARTIFACT__LABEL, newLabel, newLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public fhiRCore.dataTypes.String getDisplay() {
		return display;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDisplay(fhiRCore.dataTypes.String newDisplay, NotificationChain msgs) {
		fhiRCore.dataTypes.String oldDisplay = display;
		display = newDisplay;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DataTypesPackage.RELATED_ARTIFACT__DISPLAY, oldDisplay, newDisplay);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisplay(fhiRCore.dataTypes.String newDisplay) {
		if (newDisplay != display) {
			NotificationChain msgs = null;
			if (display != null)
				msgs = ((InternalEObject)display).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.RELATED_ARTIFACT__DISPLAY, null, msgs);
			if (newDisplay != null)
				msgs = ((InternalEObject)newDisplay).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.RELATED_ARTIFACT__DISPLAY, null, msgs);
			msgs = basicSetDisplay(newDisplay, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataTypesPackage.RELATED_ARTIFACT__DISPLAY, newDisplay, newDisplay));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Markdown getCitation() {
		return citation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCitation(Markdown newCitation, NotificationChain msgs) {
		Markdown oldCitation = citation;
		citation = newCitation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DataTypesPackage.RELATED_ARTIFACT__CITATION, oldCitation, newCitation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCitation(Markdown newCitation) {
		if (newCitation != citation) {
			NotificationChain msgs = null;
			if (citation != null)
				msgs = ((InternalEObject)citation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.RELATED_ARTIFACT__CITATION, null, msgs);
			if (newCitation != null)
				msgs = ((InternalEObject)newCitation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.RELATED_ARTIFACT__CITATION, null, msgs);
			msgs = basicSetCitation(newCitation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataTypesPackage.RELATED_ARTIFACT__CITATION, newCitation, newCitation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Url getUrl() {
		return url;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUrl(Url newUrl, NotificationChain msgs) {
		Url oldUrl = url;
		url = newUrl;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DataTypesPackage.RELATED_ARTIFACT__URL, oldUrl, newUrl);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUrl(Url newUrl) {
		if (newUrl != url) {
			NotificationChain msgs = null;
			if (url != null)
				msgs = ((InternalEObject)url).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.RELATED_ARTIFACT__URL, null, msgs);
			if (newUrl != null)
				msgs = ((InternalEObject)newUrl).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.RELATED_ARTIFACT__URL, null, msgs);
			msgs = basicSetUrl(newUrl, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataTypesPackage.RELATED_ARTIFACT__URL, newUrl, newUrl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attachment getDocument() {
		return document;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDocument(Attachment newDocument, NotificationChain msgs) {
		Attachment oldDocument = document;
		document = newDocument;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DataTypesPackage.RELATED_ARTIFACT__DOCUMENT, oldDocument, newDocument);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDocument(Attachment newDocument) {
		if (newDocument != document) {
			NotificationChain msgs = null;
			if (document != null)
				msgs = ((InternalEObject)document).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.RELATED_ARTIFACT__DOCUMENT, null, msgs);
			if (newDocument != null)
				msgs = ((InternalEObject)newDocument).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.RELATED_ARTIFACT__DOCUMENT, null, msgs);
			msgs = basicSetDocument(newDocument, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataTypesPackage.RELATED_ARTIFACT__DOCUMENT, newDocument, newDocument));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource getResource() {
		return resource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResource(Resource newResource, NotificationChain msgs) {
		Resource oldResource = resource;
		resource = newResource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DataTypesPackage.RELATED_ARTIFACT__RESOURCE, oldResource, newResource);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResource(Resource newResource) {
		if (newResource != resource) {
			NotificationChain msgs = null;
			if (resource != null)
				msgs = ((InternalEObject)resource).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.RELATED_ARTIFACT__RESOURCE, null, msgs);
			if (newResource != null)
				msgs = ((InternalEObject)newResource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.RELATED_ARTIFACT__RESOURCE, null, msgs);
			msgs = basicSetResource(newResource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataTypesPackage.RELATED_ARTIFACT__RESOURCE, newResource, newResource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DataTypesPackage.RELATED_ARTIFACT__TYPE:
				return basicSetType(null, msgs);
			case DataTypesPackage.RELATED_ARTIFACT__LABEL:
				return basicSetLabel(null, msgs);
			case DataTypesPackage.RELATED_ARTIFACT__DISPLAY:
				return basicSetDisplay(null, msgs);
			case DataTypesPackage.RELATED_ARTIFACT__CITATION:
				return basicSetCitation(null, msgs);
			case DataTypesPackage.RELATED_ARTIFACT__URL:
				return basicSetUrl(null, msgs);
			case DataTypesPackage.RELATED_ARTIFACT__DOCUMENT:
				return basicSetDocument(null, msgs);
			case DataTypesPackage.RELATED_ARTIFACT__RESOURCE:
				return basicSetResource(null, msgs);
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
			case DataTypesPackage.RELATED_ARTIFACT__TYPE:
				return getType();
			case DataTypesPackage.RELATED_ARTIFACT__LABEL:
				return getLabel();
			case DataTypesPackage.RELATED_ARTIFACT__DISPLAY:
				return getDisplay();
			case DataTypesPackage.RELATED_ARTIFACT__CITATION:
				return getCitation();
			case DataTypesPackage.RELATED_ARTIFACT__URL:
				return getUrl();
			case DataTypesPackage.RELATED_ARTIFACT__DOCUMENT:
				return getDocument();
			case DataTypesPackage.RELATED_ARTIFACT__RESOURCE:
				return getResource();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DataTypesPackage.RELATED_ARTIFACT__TYPE:
				setType((Code)newValue);
				return;
			case DataTypesPackage.RELATED_ARTIFACT__LABEL:
				setLabel((fhiRCore.dataTypes.String)newValue);
				return;
			case DataTypesPackage.RELATED_ARTIFACT__DISPLAY:
				setDisplay((fhiRCore.dataTypes.String)newValue);
				return;
			case DataTypesPackage.RELATED_ARTIFACT__CITATION:
				setCitation((Markdown)newValue);
				return;
			case DataTypesPackage.RELATED_ARTIFACT__URL:
				setUrl((Url)newValue);
				return;
			case DataTypesPackage.RELATED_ARTIFACT__DOCUMENT:
				setDocument((Attachment)newValue);
				return;
			case DataTypesPackage.RELATED_ARTIFACT__RESOURCE:
				setResource((Resource)newValue);
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
			case DataTypesPackage.RELATED_ARTIFACT__TYPE:
				setType((Code)null);
				return;
			case DataTypesPackage.RELATED_ARTIFACT__LABEL:
				setLabel((fhiRCore.dataTypes.String)null);
				return;
			case DataTypesPackage.RELATED_ARTIFACT__DISPLAY:
				setDisplay((fhiRCore.dataTypes.String)null);
				return;
			case DataTypesPackage.RELATED_ARTIFACT__CITATION:
				setCitation((Markdown)null);
				return;
			case DataTypesPackage.RELATED_ARTIFACT__URL:
				setUrl((Url)null);
				return;
			case DataTypesPackage.RELATED_ARTIFACT__DOCUMENT:
				setDocument((Attachment)null);
				return;
			case DataTypesPackage.RELATED_ARTIFACT__RESOURCE:
				setResource((Resource)null);
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
			case DataTypesPackage.RELATED_ARTIFACT__TYPE:
				return type != null;
			case DataTypesPackage.RELATED_ARTIFACT__LABEL:
				return label != null;
			case DataTypesPackage.RELATED_ARTIFACT__DISPLAY:
				return display != null;
			case DataTypesPackage.RELATED_ARTIFACT__CITATION:
				return citation != null;
			case DataTypesPackage.RELATED_ARTIFACT__URL:
				return url != null;
			case DataTypesPackage.RELATED_ARTIFACT__DOCUMENT:
				return document != null;
			case DataTypesPackage.RELATED_ARTIFACT__RESOURCE:
				return resource != null;
		}
		return super.eIsSet(featureID);
	}

} //RelatedArtifactImpl
