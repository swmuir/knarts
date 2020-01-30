/**
 */
package fhiRCore.dataTypes.impl;

import fhiRCore.dataTypes.Attachment;
import fhiRCore.dataTypes.CodeableConcept;
import fhiRCore.dataTypes.DataTypesPackage;
import fhiRCore.dataTypes.ProdCharacteristic;
import fhiRCore.dataTypes.Quantity;

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
 * An implementation of the model object '<em><b>Prod Characteristic</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.dataTypes.impl.ProdCharacteristicImpl#getHeight <em>Height</em>}</li>
 *   <li>{@link fhiRCore.dataTypes.impl.ProdCharacteristicImpl#getWidth <em>Width</em>}</li>
 *   <li>{@link fhiRCore.dataTypes.impl.ProdCharacteristicImpl#getDepth <em>Depth</em>}</li>
 *   <li>{@link fhiRCore.dataTypes.impl.ProdCharacteristicImpl#getWeight <em>Weight</em>}</li>
 *   <li>{@link fhiRCore.dataTypes.impl.ProdCharacteristicImpl#getNominalVolume <em>Nominal Volume</em>}</li>
 *   <li>{@link fhiRCore.dataTypes.impl.ProdCharacteristicImpl#getExternalDiameter <em>External Diameter</em>}</li>
 *   <li>{@link fhiRCore.dataTypes.impl.ProdCharacteristicImpl#getShape <em>Shape</em>}</li>
 *   <li>{@link fhiRCore.dataTypes.impl.ProdCharacteristicImpl#getColors <em>Color</em>}</li>
 *   <li>{@link fhiRCore.dataTypes.impl.ProdCharacteristicImpl#getImprints <em>Imprint</em>}</li>
 *   <li>{@link fhiRCore.dataTypes.impl.ProdCharacteristicImpl#getImages <em>Image</em>}</li>
 *   <li>{@link fhiRCore.dataTypes.impl.ProdCharacteristicImpl#getScoring <em>Scoring</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProdCharacteristicImpl extends BackboneElementImpl implements ProdCharacteristic {
	/**
	 * The cached value of the '{@link #getHeight() <em>Height</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected Quantity height;

	/**
	 * The cached value of the '{@link #getWidth() <em>Width</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected Quantity width;

	/**
	 * The cached value of the '{@link #getDepth() <em>Depth</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDepth()
	 * @generated
	 * @ordered
	 */
	protected Quantity depth;

	/**
	 * The cached value of the '{@link #getWeight() <em>Weight</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeight()
	 * @generated
	 * @ordered
	 */
	protected Quantity weight;

	/**
	 * The cached value of the '{@link #getNominalVolume() <em>Nominal Volume</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNominalVolume()
	 * @generated
	 * @ordered
	 */
	protected Quantity nominalVolume;

	/**
	 * The cached value of the '{@link #getExternalDiameter() <em>External Diameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalDiameter()
	 * @generated
	 * @ordered
	 */
	protected Quantity externalDiameter;

	/**
	 * The cached value of the '{@link #getShape() <em>Shape</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShape()
	 * @generated
	 * @ordered
	 */
	protected fhiRCore.dataTypes.String shape;

	/**
	 * The cached value of the '{@link #getColors() <em>Color</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColors()
	 * @generated
	 * @ordered
	 */
	protected EList<fhiRCore.dataTypes.String> colors;

	/**
	 * The cached value of the '{@link #getImprints() <em>Imprint</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImprints()
	 * @generated
	 * @ordered
	 */
	protected EList<fhiRCore.dataTypes.String> imprints;

	/**
	 * The cached value of the '{@link #getImages() <em>Image</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImages()
	 * @generated
	 * @ordered
	 */
	protected EList<Attachment> images;

	/**
	 * The cached value of the '{@link #getScoring() <em>Scoring</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScoring()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept scoring;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProdCharacteristicImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataTypesPackage.Literals.PROD_CHARACTERISTIC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Quantity getHeight() {
		return height;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHeight(Quantity newHeight, NotificationChain msgs) {
		Quantity oldHeight = height;
		height = newHeight;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DataTypesPackage.PROD_CHARACTERISTIC__HEIGHT, oldHeight, newHeight);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeight(Quantity newHeight) {
		if (newHeight != height) {
			NotificationChain msgs = null;
			if (height != null)
				msgs = ((InternalEObject)height).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.PROD_CHARACTERISTIC__HEIGHT, null, msgs);
			if (newHeight != null)
				msgs = ((InternalEObject)newHeight).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.PROD_CHARACTERISTIC__HEIGHT, null, msgs);
			msgs = basicSetHeight(newHeight, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataTypesPackage.PROD_CHARACTERISTIC__HEIGHT, newHeight, newHeight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Quantity getWidth() {
		return width;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWidth(Quantity newWidth, NotificationChain msgs) {
		Quantity oldWidth = width;
		width = newWidth;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DataTypesPackage.PROD_CHARACTERISTIC__WIDTH, oldWidth, newWidth);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWidth(Quantity newWidth) {
		if (newWidth != width) {
			NotificationChain msgs = null;
			if (width != null)
				msgs = ((InternalEObject)width).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.PROD_CHARACTERISTIC__WIDTH, null, msgs);
			if (newWidth != null)
				msgs = ((InternalEObject)newWidth).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.PROD_CHARACTERISTIC__WIDTH, null, msgs);
			msgs = basicSetWidth(newWidth, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataTypesPackage.PROD_CHARACTERISTIC__WIDTH, newWidth, newWidth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Quantity getDepth() {
		return depth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDepth(Quantity newDepth, NotificationChain msgs) {
		Quantity oldDepth = depth;
		depth = newDepth;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DataTypesPackage.PROD_CHARACTERISTIC__DEPTH, oldDepth, newDepth);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDepth(Quantity newDepth) {
		if (newDepth != depth) {
			NotificationChain msgs = null;
			if (depth != null)
				msgs = ((InternalEObject)depth).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.PROD_CHARACTERISTIC__DEPTH, null, msgs);
			if (newDepth != null)
				msgs = ((InternalEObject)newDepth).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.PROD_CHARACTERISTIC__DEPTH, null, msgs);
			msgs = basicSetDepth(newDepth, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataTypesPackage.PROD_CHARACTERISTIC__DEPTH, newDepth, newDepth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Quantity getWeight() {
		return weight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWeight(Quantity newWeight, NotificationChain msgs) {
		Quantity oldWeight = weight;
		weight = newWeight;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DataTypesPackage.PROD_CHARACTERISTIC__WEIGHT, oldWeight, newWeight);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWeight(Quantity newWeight) {
		if (newWeight != weight) {
			NotificationChain msgs = null;
			if (weight != null)
				msgs = ((InternalEObject)weight).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.PROD_CHARACTERISTIC__WEIGHT, null, msgs);
			if (newWeight != null)
				msgs = ((InternalEObject)newWeight).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.PROD_CHARACTERISTIC__WEIGHT, null, msgs);
			msgs = basicSetWeight(newWeight, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataTypesPackage.PROD_CHARACTERISTIC__WEIGHT, newWeight, newWeight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Quantity getNominalVolume() {
		return nominalVolume;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNominalVolume(Quantity newNominalVolume, NotificationChain msgs) {
		Quantity oldNominalVolume = nominalVolume;
		nominalVolume = newNominalVolume;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DataTypesPackage.PROD_CHARACTERISTIC__NOMINAL_VOLUME, oldNominalVolume, newNominalVolume);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNominalVolume(Quantity newNominalVolume) {
		if (newNominalVolume != nominalVolume) {
			NotificationChain msgs = null;
			if (nominalVolume != null)
				msgs = ((InternalEObject)nominalVolume).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.PROD_CHARACTERISTIC__NOMINAL_VOLUME, null, msgs);
			if (newNominalVolume != null)
				msgs = ((InternalEObject)newNominalVolume).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.PROD_CHARACTERISTIC__NOMINAL_VOLUME, null, msgs);
			msgs = basicSetNominalVolume(newNominalVolume, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataTypesPackage.PROD_CHARACTERISTIC__NOMINAL_VOLUME, newNominalVolume, newNominalVolume));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Quantity getExternalDiameter() {
		return externalDiameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExternalDiameter(Quantity newExternalDiameter, NotificationChain msgs) {
		Quantity oldExternalDiameter = externalDiameter;
		externalDiameter = newExternalDiameter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DataTypesPackage.PROD_CHARACTERISTIC__EXTERNAL_DIAMETER, oldExternalDiameter, newExternalDiameter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExternalDiameter(Quantity newExternalDiameter) {
		if (newExternalDiameter != externalDiameter) {
			NotificationChain msgs = null;
			if (externalDiameter != null)
				msgs = ((InternalEObject)externalDiameter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.PROD_CHARACTERISTIC__EXTERNAL_DIAMETER, null, msgs);
			if (newExternalDiameter != null)
				msgs = ((InternalEObject)newExternalDiameter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.PROD_CHARACTERISTIC__EXTERNAL_DIAMETER, null, msgs);
			msgs = basicSetExternalDiameter(newExternalDiameter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataTypesPackage.PROD_CHARACTERISTIC__EXTERNAL_DIAMETER, newExternalDiameter, newExternalDiameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public fhiRCore.dataTypes.String getShape() {
		return shape;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetShape(fhiRCore.dataTypes.String newShape, NotificationChain msgs) {
		fhiRCore.dataTypes.String oldShape = shape;
		shape = newShape;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DataTypesPackage.PROD_CHARACTERISTIC__SHAPE, oldShape, newShape);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShape(fhiRCore.dataTypes.String newShape) {
		if (newShape != shape) {
			NotificationChain msgs = null;
			if (shape != null)
				msgs = ((InternalEObject)shape).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.PROD_CHARACTERISTIC__SHAPE, null, msgs);
			if (newShape != null)
				msgs = ((InternalEObject)newShape).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.PROD_CHARACTERISTIC__SHAPE, null, msgs);
			msgs = basicSetShape(newShape, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataTypesPackage.PROD_CHARACTERISTIC__SHAPE, newShape, newShape));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<fhiRCore.dataTypes.String> getColors() {
		if (colors == null) {
			colors = new EObjectContainmentEList<fhiRCore.dataTypes.String>(fhiRCore.dataTypes.String.class, this, DataTypesPackage.PROD_CHARACTERISTIC__COLOR);
		}
		return colors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<fhiRCore.dataTypes.String> getImprints() {
		if (imprints == null) {
			imprints = new EObjectContainmentEList<fhiRCore.dataTypes.String>(fhiRCore.dataTypes.String.class, this, DataTypesPackage.PROD_CHARACTERISTIC__IMPRINT);
		}
		return imprints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Attachment> getImages() {
		if (images == null) {
			images = new EObjectContainmentEList<Attachment>(Attachment.class, this, DataTypesPackage.PROD_CHARACTERISTIC__IMAGE);
		}
		return images;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getScoring() {
		return scoring;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetScoring(CodeableConcept newScoring, NotificationChain msgs) {
		CodeableConcept oldScoring = scoring;
		scoring = newScoring;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DataTypesPackage.PROD_CHARACTERISTIC__SCORING, oldScoring, newScoring);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScoring(CodeableConcept newScoring) {
		if (newScoring != scoring) {
			NotificationChain msgs = null;
			if (scoring != null)
				msgs = ((InternalEObject)scoring).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.PROD_CHARACTERISTIC__SCORING, null, msgs);
			if (newScoring != null)
				msgs = ((InternalEObject)newScoring).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.PROD_CHARACTERISTIC__SCORING, null, msgs);
			msgs = basicSetScoring(newScoring, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataTypesPackage.PROD_CHARACTERISTIC__SCORING, newScoring, newScoring));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DataTypesPackage.PROD_CHARACTERISTIC__HEIGHT:
				return basicSetHeight(null, msgs);
			case DataTypesPackage.PROD_CHARACTERISTIC__WIDTH:
				return basicSetWidth(null, msgs);
			case DataTypesPackage.PROD_CHARACTERISTIC__DEPTH:
				return basicSetDepth(null, msgs);
			case DataTypesPackage.PROD_CHARACTERISTIC__WEIGHT:
				return basicSetWeight(null, msgs);
			case DataTypesPackage.PROD_CHARACTERISTIC__NOMINAL_VOLUME:
				return basicSetNominalVolume(null, msgs);
			case DataTypesPackage.PROD_CHARACTERISTIC__EXTERNAL_DIAMETER:
				return basicSetExternalDiameter(null, msgs);
			case DataTypesPackage.PROD_CHARACTERISTIC__SHAPE:
				return basicSetShape(null, msgs);
			case DataTypesPackage.PROD_CHARACTERISTIC__COLOR:
				return ((InternalEList<?>)getColors()).basicRemove(otherEnd, msgs);
			case DataTypesPackage.PROD_CHARACTERISTIC__IMPRINT:
				return ((InternalEList<?>)getImprints()).basicRemove(otherEnd, msgs);
			case DataTypesPackage.PROD_CHARACTERISTIC__IMAGE:
				return ((InternalEList<?>)getImages()).basicRemove(otherEnd, msgs);
			case DataTypesPackage.PROD_CHARACTERISTIC__SCORING:
				return basicSetScoring(null, msgs);
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
			case DataTypesPackage.PROD_CHARACTERISTIC__HEIGHT:
				return getHeight();
			case DataTypesPackage.PROD_CHARACTERISTIC__WIDTH:
				return getWidth();
			case DataTypesPackage.PROD_CHARACTERISTIC__DEPTH:
				return getDepth();
			case DataTypesPackage.PROD_CHARACTERISTIC__WEIGHT:
				return getWeight();
			case DataTypesPackage.PROD_CHARACTERISTIC__NOMINAL_VOLUME:
				return getNominalVolume();
			case DataTypesPackage.PROD_CHARACTERISTIC__EXTERNAL_DIAMETER:
				return getExternalDiameter();
			case DataTypesPackage.PROD_CHARACTERISTIC__SHAPE:
				return getShape();
			case DataTypesPackage.PROD_CHARACTERISTIC__COLOR:
				return getColors();
			case DataTypesPackage.PROD_CHARACTERISTIC__IMPRINT:
				return getImprints();
			case DataTypesPackage.PROD_CHARACTERISTIC__IMAGE:
				return getImages();
			case DataTypesPackage.PROD_CHARACTERISTIC__SCORING:
				return getScoring();
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
			case DataTypesPackage.PROD_CHARACTERISTIC__HEIGHT:
				setHeight((Quantity)newValue);
				return;
			case DataTypesPackage.PROD_CHARACTERISTIC__WIDTH:
				setWidth((Quantity)newValue);
				return;
			case DataTypesPackage.PROD_CHARACTERISTIC__DEPTH:
				setDepth((Quantity)newValue);
				return;
			case DataTypesPackage.PROD_CHARACTERISTIC__WEIGHT:
				setWeight((Quantity)newValue);
				return;
			case DataTypesPackage.PROD_CHARACTERISTIC__NOMINAL_VOLUME:
				setNominalVolume((Quantity)newValue);
				return;
			case DataTypesPackage.PROD_CHARACTERISTIC__EXTERNAL_DIAMETER:
				setExternalDiameter((Quantity)newValue);
				return;
			case DataTypesPackage.PROD_CHARACTERISTIC__SHAPE:
				setShape((fhiRCore.dataTypes.String)newValue);
				return;
			case DataTypesPackage.PROD_CHARACTERISTIC__COLOR:
				getColors().clear();
				getColors().addAll((Collection<? extends fhiRCore.dataTypes.String>)newValue);
				return;
			case DataTypesPackage.PROD_CHARACTERISTIC__IMPRINT:
				getImprints().clear();
				getImprints().addAll((Collection<? extends fhiRCore.dataTypes.String>)newValue);
				return;
			case DataTypesPackage.PROD_CHARACTERISTIC__IMAGE:
				getImages().clear();
				getImages().addAll((Collection<? extends Attachment>)newValue);
				return;
			case DataTypesPackage.PROD_CHARACTERISTIC__SCORING:
				setScoring((CodeableConcept)newValue);
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
			case DataTypesPackage.PROD_CHARACTERISTIC__HEIGHT:
				setHeight((Quantity)null);
				return;
			case DataTypesPackage.PROD_CHARACTERISTIC__WIDTH:
				setWidth((Quantity)null);
				return;
			case DataTypesPackage.PROD_CHARACTERISTIC__DEPTH:
				setDepth((Quantity)null);
				return;
			case DataTypesPackage.PROD_CHARACTERISTIC__WEIGHT:
				setWeight((Quantity)null);
				return;
			case DataTypesPackage.PROD_CHARACTERISTIC__NOMINAL_VOLUME:
				setNominalVolume((Quantity)null);
				return;
			case DataTypesPackage.PROD_CHARACTERISTIC__EXTERNAL_DIAMETER:
				setExternalDiameter((Quantity)null);
				return;
			case DataTypesPackage.PROD_CHARACTERISTIC__SHAPE:
				setShape((fhiRCore.dataTypes.String)null);
				return;
			case DataTypesPackage.PROD_CHARACTERISTIC__COLOR:
				getColors().clear();
				return;
			case DataTypesPackage.PROD_CHARACTERISTIC__IMPRINT:
				getImprints().clear();
				return;
			case DataTypesPackage.PROD_CHARACTERISTIC__IMAGE:
				getImages().clear();
				return;
			case DataTypesPackage.PROD_CHARACTERISTIC__SCORING:
				setScoring((CodeableConcept)null);
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
			case DataTypesPackage.PROD_CHARACTERISTIC__HEIGHT:
				return height != null;
			case DataTypesPackage.PROD_CHARACTERISTIC__WIDTH:
				return width != null;
			case DataTypesPackage.PROD_CHARACTERISTIC__DEPTH:
				return depth != null;
			case DataTypesPackage.PROD_CHARACTERISTIC__WEIGHT:
				return weight != null;
			case DataTypesPackage.PROD_CHARACTERISTIC__NOMINAL_VOLUME:
				return nominalVolume != null;
			case DataTypesPackage.PROD_CHARACTERISTIC__EXTERNAL_DIAMETER:
				return externalDiameter != null;
			case DataTypesPackage.PROD_CHARACTERISTIC__SHAPE:
				return shape != null;
			case DataTypesPackage.PROD_CHARACTERISTIC__COLOR:
				return colors != null && !colors.isEmpty();
			case DataTypesPackage.PROD_CHARACTERISTIC__IMPRINT:
				return imprints != null && !imprints.isEmpty();
			case DataTypesPackage.PROD_CHARACTERISTIC__IMAGE:
				return images != null && !images.isEmpty();
			case DataTypesPackage.PROD_CHARACTERISTIC__SCORING:
				return scoring != null;
		}
		return super.eIsSet(featureID);
	}

} //ProdCharacteristicImpl
