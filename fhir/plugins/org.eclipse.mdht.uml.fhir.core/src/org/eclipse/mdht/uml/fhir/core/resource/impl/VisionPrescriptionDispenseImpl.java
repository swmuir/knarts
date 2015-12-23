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
package org.eclipse.mdht.uml.fhir.core.resource.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.mdht.uml.fhir.core.datatype.Code;
import org.eclipse.mdht.uml.fhir.core.datatype.Coding;
import org.eclipse.mdht.uml.fhir.core.datatype.Decimal;
import org.eclipse.mdht.uml.fhir.core.datatype.SimpleQuantity;

import org.eclipse.mdht.uml.fhir.core.datatype.impl.BackboneElementImpl;

import org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage;
import org.eclipse.mdht.uml.fhir.core.resource.VisionPrescriptionDispense;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Vision Prescription Dispense</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.VisionPrescriptionDispenseImpl#getProduct <em>Product</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.VisionPrescriptionDispenseImpl#getEye <em>Eye</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.VisionPrescriptionDispenseImpl#getSphere <em>Sphere</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.VisionPrescriptionDispenseImpl#getCylinder <em>Cylinder</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.VisionPrescriptionDispenseImpl#getAxis <em>Axis</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.VisionPrescriptionDispenseImpl#getPrism <em>Prism</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.VisionPrescriptionDispenseImpl#getBase <em>Base</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.VisionPrescriptionDispenseImpl#getAdd <em>Add</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.VisionPrescriptionDispenseImpl#getPower <em>Power</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.VisionPrescriptionDispenseImpl#getBackCurve <em>Back Curve</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.VisionPrescriptionDispenseImpl#getDiameter <em>Diameter</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.VisionPrescriptionDispenseImpl#getDuration <em>Duration</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.VisionPrescriptionDispenseImpl#getColor <em>Color</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.VisionPrescriptionDispenseImpl#getBrand <em>Brand</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.VisionPrescriptionDispenseImpl#getNotes <em>Notes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VisionPrescriptionDispenseImpl extends BackboneElementImpl implements VisionPrescriptionDispense {
	/**
	 * The cached value of the '{@link #getProduct() <em>Product</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProduct()
	 * @generated
	 * @ordered
	 */
	protected Coding product;

	/**
	 * The cached value of the '{@link #getEye() <em>Eye</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEye()
	 * @generated
	 * @ordered
	 */
	protected Code eye;

	/**
	 * The cached value of the '{@link #getSphere() <em>Sphere</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSphere()
	 * @generated
	 * @ordered
	 */
	protected Decimal sphere;

	/**
	 * The cached value of the '{@link #getCylinder() <em>Cylinder</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCylinder()
	 * @generated
	 * @ordered
	 */
	protected Decimal cylinder;

	/**
	 * The cached value of the '{@link #getAxis() <em>Axis</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAxis()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.datatype.Integer axis;

	/**
	 * The cached value of the '{@link #getPrism() <em>Prism</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrism()
	 * @generated
	 * @ordered
	 */
	protected Decimal prism;

	/**
	 * The cached value of the '{@link #getBase() <em>Base</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase()
	 * @generated
	 * @ordered
	 */
	protected Code base;

	/**
	 * The cached value of the '{@link #getAdd() <em>Add</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdd()
	 * @generated
	 * @ordered
	 */
	protected Decimal add;

	/**
	 * The cached value of the '{@link #getPower() <em>Power</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPower()
	 * @generated
	 * @ordered
	 */
	protected Decimal power;

	/**
	 * The cached value of the '{@link #getBackCurve() <em>Back Curve</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackCurve()
	 * @generated
	 * @ordered
	 */
	protected Decimal backCurve;

	/**
	 * The cached value of the '{@link #getDiameter() <em>Diameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiameter()
	 * @generated
	 * @ordered
	 */
	protected Decimal diameter;

	/**
	 * The cached value of the '{@link #getDuration() <em>Duration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected SimpleQuantity duration;

	/**
	 * The cached value of the '{@link #getColor() <em>Color</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColor()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.datatype.String color;

	/**
	 * The cached value of the '{@link #getBrand() <em>Brand</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBrand()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.datatype.String brand;

	/**
	 * The cached value of the '{@link #getNotes() <em>Notes</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotes()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.datatype.String notes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VisionPrescriptionDispenseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirResourcePackage.eINSTANCE.getVisionPrescriptionDispense();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coding getProduct() {
		if (product != null && product.eIsProxy()) {
			InternalEObject oldProduct = (InternalEObject)product;
			product = (Coding)eResolveProxy(oldProduct);
			if (product != oldProduct) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.VISION_PRESCRIPTION_DISPENSE__PRODUCT, oldProduct, product));
			}
		}
		return product;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coding basicGetProduct() {
		return product;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProduct(Coding newProduct) {
		Coding oldProduct = product;
		product = newProduct;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.VISION_PRESCRIPTION_DISPENSE__PRODUCT, oldProduct, product));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getEye() {
		if (eye != null && eye.eIsProxy()) {
			InternalEObject oldEye = (InternalEObject)eye;
			eye = (Code)eResolveProxy(oldEye);
			if (eye != oldEye) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.VISION_PRESCRIPTION_DISPENSE__EYE, oldEye, eye));
			}
		}
		return eye;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code basicGetEye() {
		return eye;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEye(Code newEye) {
		Code oldEye = eye;
		eye = newEye;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.VISION_PRESCRIPTION_DISPENSE__EYE, oldEye, eye));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Decimal getSphere() {
		if (sphere != null && sphere.eIsProxy()) {
			InternalEObject oldSphere = (InternalEObject)sphere;
			sphere = (Decimal)eResolveProxy(oldSphere);
			if (sphere != oldSphere) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.VISION_PRESCRIPTION_DISPENSE__SPHERE, oldSphere, sphere));
			}
		}
		return sphere;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Decimal basicGetSphere() {
		return sphere;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSphere(Decimal newSphere) {
		Decimal oldSphere = sphere;
		sphere = newSphere;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.VISION_PRESCRIPTION_DISPENSE__SPHERE, oldSphere, sphere));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Decimal getCylinder() {
		if (cylinder != null && cylinder.eIsProxy()) {
			InternalEObject oldCylinder = (InternalEObject)cylinder;
			cylinder = (Decimal)eResolveProxy(oldCylinder);
			if (cylinder != oldCylinder) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.VISION_PRESCRIPTION_DISPENSE__CYLINDER, oldCylinder, cylinder));
			}
		}
		return cylinder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Decimal basicGetCylinder() {
		return cylinder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCylinder(Decimal newCylinder) {
		Decimal oldCylinder = cylinder;
		cylinder = newCylinder;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.VISION_PRESCRIPTION_DISPENSE__CYLINDER, oldCylinder, cylinder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.Integer getAxis() {
		if (axis != null && axis.eIsProxy()) {
			InternalEObject oldAxis = (InternalEObject)axis;
			axis = (org.eclipse.mdht.uml.fhir.core.datatype.Integer)eResolveProxy(oldAxis);
			if (axis != oldAxis) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.VISION_PRESCRIPTION_DISPENSE__AXIS, oldAxis, axis));
			}
		}
		return axis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.Integer basicGetAxis() {
		return axis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAxis(org.eclipse.mdht.uml.fhir.core.datatype.Integer newAxis) {
		org.eclipse.mdht.uml.fhir.core.datatype.Integer oldAxis = axis;
		axis = newAxis;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.VISION_PRESCRIPTION_DISPENSE__AXIS, oldAxis, axis));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Decimal getPrism() {
		if (prism != null && prism.eIsProxy()) {
			InternalEObject oldPrism = (InternalEObject)prism;
			prism = (Decimal)eResolveProxy(oldPrism);
			if (prism != oldPrism) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.VISION_PRESCRIPTION_DISPENSE__PRISM, oldPrism, prism));
			}
		}
		return prism;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Decimal basicGetPrism() {
		return prism;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrism(Decimal newPrism) {
		Decimal oldPrism = prism;
		prism = newPrism;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.VISION_PRESCRIPTION_DISPENSE__PRISM, oldPrism, prism));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getBase() {
		if (base != null && base.eIsProxy()) {
			InternalEObject oldBase = (InternalEObject)base;
			base = (Code)eResolveProxy(oldBase);
			if (base != oldBase) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.VISION_PRESCRIPTION_DISPENSE__BASE, oldBase, base));
			}
		}
		return base;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code basicGetBase() {
		return base;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase(Code newBase) {
		Code oldBase = base;
		base = newBase;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.VISION_PRESCRIPTION_DISPENSE__BASE, oldBase, base));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Decimal getAdd() {
		if (add != null && add.eIsProxy()) {
			InternalEObject oldAdd = (InternalEObject)add;
			add = (Decimal)eResolveProxy(oldAdd);
			if (add != oldAdd) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.VISION_PRESCRIPTION_DISPENSE__ADD, oldAdd, add));
			}
		}
		return add;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Decimal basicGetAdd() {
		return add;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAdd(Decimal newAdd) {
		Decimal oldAdd = add;
		add = newAdd;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.VISION_PRESCRIPTION_DISPENSE__ADD, oldAdd, add));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Decimal getPower() {
		if (power != null && power.eIsProxy()) {
			InternalEObject oldPower = (InternalEObject)power;
			power = (Decimal)eResolveProxy(oldPower);
			if (power != oldPower) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.VISION_PRESCRIPTION_DISPENSE__POWER, oldPower, power));
			}
		}
		return power;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Decimal basicGetPower() {
		return power;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPower(Decimal newPower) {
		Decimal oldPower = power;
		power = newPower;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.VISION_PRESCRIPTION_DISPENSE__POWER, oldPower, power));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Decimal getBackCurve() {
		if (backCurve != null && backCurve.eIsProxy()) {
			InternalEObject oldBackCurve = (InternalEObject)backCurve;
			backCurve = (Decimal)eResolveProxy(oldBackCurve);
			if (backCurve != oldBackCurve) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.VISION_PRESCRIPTION_DISPENSE__BACK_CURVE, oldBackCurve, backCurve));
			}
		}
		return backCurve;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Decimal basicGetBackCurve() {
		return backCurve;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBackCurve(Decimal newBackCurve) {
		Decimal oldBackCurve = backCurve;
		backCurve = newBackCurve;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.VISION_PRESCRIPTION_DISPENSE__BACK_CURVE, oldBackCurve, backCurve));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Decimal getDiameter() {
		if (diameter != null && diameter.eIsProxy()) {
			InternalEObject oldDiameter = (InternalEObject)diameter;
			diameter = (Decimal)eResolveProxy(oldDiameter);
			if (diameter != oldDiameter) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.VISION_PRESCRIPTION_DISPENSE__DIAMETER, oldDiameter, diameter));
			}
		}
		return diameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Decimal basicGetDiameter() {
		return diameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiameter(Decimal newDiameter) {
		Decimal oldDiameter = diameter;
		diameter = newDiameter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.VISION_PRESCRIPTION_DISPENSE__DIAMETER, oldDiameter, diameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleQuantity getDuration() {
		if (duration != null && duration.eIsProxy()) {
			InternalEObject oldDuration = (InternalEObject)duration;
			duration = (SimpleQuantity)eResolveProxy(oldDuration);
			if (duration != oldDuration) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.VISION_PRESCRIPTION_DISPENSE__DURATION, oldDuration, duration));
			}
		}
		return duration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleQuantity basicGetDuration() {
		return duration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDuration(SimpleQuantity newDuration) {
		SimpleQuantity oldDuration = duration;
		duration = newDuration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.VISION_PRESCRIPTION_DISPENSE__DURATION, oldDuration, duration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.String getColor() {
		if (color != null && color.eIsProxy()) {
			InternalEObject oldColor = (InternalEObject)color;
			color = (org.eclipse.mdht.uml.fhir.core.datatype.String)eResolveProxy(oldColor);
			if (color != oldColor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.VISION_PRESCRIPTION_DISPENSE__COLOR, oldColor, color));
			}
		}
		return color;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.String basicGetColor() {
		return color;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColor(org.eclipse.mdht.uml.fhir.core.datatype.String newColor) {
		org.eclipse.mdht.uml.fhir.core.datatype.String oldColor = color;
		color = newColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.VISION_PRESCRIPTION_DISPENSE__COLOR, oldColor, color));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.String getBrand() {
		if (brand != null && brand.eIsProxy()) {
			InternalEObject oldBrand = (InternalEObject)brand;
			brand = (org.eclipse.mdht.uml.fhir.core.datatype.String)eResolveProxy(oldBrand);
			if (brand != oldBrand) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.VISION_PRESCRIPTION_DISPENSE__BRAND, oldBrand, brand));
			}
		}
		return brand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.String basicGetBrand() {
		return brand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBrand(org.eclipse.mdht.uml.fhir.core.datatype.String newBrand) {
		org.eclipse.mdht.uml.fhir.core.datatype.String oldBrand = brand;
		brand = newBrand;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.VISION_PRESCRIPTION_DISPENSE__BRAND, oldBrand, brand));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.String getNotes() {
		if (notes != null && notes.eIsProxy()) {
			InternalEObject oldNotes = (InternalEObject)notes;
			notes = (org.eclipse.mdht.uml.fhir.core.datatype.String)eResolveProxy(oldNotes);
			if (notes != oldNotes) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.VISION_PRESCRIPTION_DISPENSE__NOTES, oldNotes, notes));
			}
		}
		return notes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.String basicGetNotes() {
		return notes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNotes(org.eclipse.mdht.uml.fhir.core.datatype.String newNotes) {
		org.eclipse.mdht.uml.fhir.core.datatype.String oldNotes = notes;
		notes = newNotes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.VISION_PRESCRIPTION_DISPENSE__NOTES, oldNotes, notes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FhirResourcePackage.VISION_PRESCRIPTION_DISPENSE__PRODUCT:
				if (resolve) return getProduct();
				return basicGetProduct();
			case FhirResourcePackage.VISION_PRESCRIPTION_DISPENSE__EYE:
				if (resolve) return getEye();
				return basicGetEye();
			case FhirResourcePackage.VISION_PRESCRIPTION_DISPENSE__SPHERE:
				if (resolve) return getSphere();
				return basicGetSphere();
			case FhirResourcePackage.VISION_PRESCRIPTION_DISPENSE__CYLINDER:
				if (resolve) return getCylinder();
				return basicGetCylinder();
			case FhirResourcePackage.VISION_PRESCRIPTION_DISPENSE__AXIS:
				if (resolve) return getAxis();
				return basicGetAxis();
			case FhirResourcePackage.VISION_PRESCRIPTION_DISPENSE__PRISM:
				if (resolve) return getPrism();
				return basicGetPrism();
			case FhirResourcePackage.VISION_PRESCRIPTION_DISPENSE__BASE:
				if (resolve) return getBase();
				return basicGetBase();
			case FhirResourcePackage.VISION_PRESCRIPTION_DISPENSE__ADD:
				if (resolve) return getAdd();
				return basicGetAdd();
			case FhirResourcePackage.VISION_PRESCRIPTION_DISPENSE__POWER:
				if (resolve) return getPower();
				return basicGetPower();
			case FhirResourcePackage.VISION_PRESCRIPTION_DISPENSE__BACK_CURVE:
				if (resolve) return getBackCurve();
				return basicGetBackCurve();
			case FhirResourcePackage.VISION_PRESCRIPTION_DISPENSE__DIAMETER:
				if (resolve) return getDiameter();
				return basicGetDiameter();
			case FhirResourcePackage.VISION_PRESCRIPTION_DISPENSE__DURATION:
				if (resolve) return getDuration();
				return basicGetDuration();
			case FhirResourcePackage.VISION_PRESCRIPTION_DISPENSE__COLOR:
				if (resolve) return getColor();
				return basicGetColor();
			case FhirResourcePackage.VISION_PRESCRIPTION_DISPENSE__BRAND:
				if (resolve) return getBrand();
				return basicGetBrand();
			case FhirResourcePackage.VISION_PRESCRIPTION_DISPENSE__NOTES:
				if (resolve) return getNotes();
				return basicGetNotes();
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
			case FhirResourcePackage.VISION_PRESCRIPTION_DISPENSE__PRODUCT:
				setProduct((Coding)newValue);
				return;
			case FhirResourcePackage.VISION_PRESCRIPTION_DISPENSE__EYE:
				setEye((Code)newValue);
				return;
			case FhirResourcePackage.VISION_PRESCRIPTION_DISPENSE__SPHERE:
				setSphere((Decimal)newValue);
				return;
			case FhirResourcePackage.VISION_PRESCRIPTION_DISPENSE__CYLINDER:
				setCylinder((Decimal)newValue);
				return;
			case FhirResourcePackage.VISION_PRESCRIPTION_DISPENSE__AXIS:
				setAxis((org.eclipse.mdht.uml.fhir.core.datatype.Integer)newValue);
				return;
			case FhirResourcePackage.VISION_PRESCRIPTION_DISPENSE__PRISM:
				setPrism((Decimal)newValue);
				return;
			case FhirResourcePackage.VISION_PRESCRIPTION_DISPENSE__BASE:
				setBase((Code)newValue);
				return;
			case FhirResourcePackage.VISION_PRESCRIPTION_DISPENSE__ADD:
				setAdd((Decimal)newValue);
				return;
			case FhirResourcePackage.VISION_PRESCRIPTION_DISPENSE__POWER:
				setPower((Decimal)newValue);
				return;
			case FhirResourcePackage.VISION_PRESCRIPTION_DISPENSE__BACK_CURVE:
				setBackCurve((Decimal)newValue);
				return;
			case FhirResourcePackage.VISION_PRESCRIPTION_DISPENSE__DIAMETER:
				setDiameter((Decimal)newValue);
				return;
			case FhirResourcePackage.VISION_PRESCRIPTION_DISPENSE__DURATION:
				setDuration((SimpleQuantity)newValue);
				return;
			case FhirResourcePackage.VISION_PRESCRIPTION_DISPENSE__COLOR:
				setColor((org.eclipse.mdht.uml.fhir.core.datatype.String)newValue);
				return;
			case FhirResourcePackage.VISION_PRESCRIPTION_DISPENSE__BRAND:
				setBrand((org.eclipse.mdht.uml.fhir.core.datatype.String)newValue);
				return;
			case FhirResourcePackage.VISION_PRESCRIPTION_DISPENSE__NOTES:
				setNotes((org.eclipse.mdht.uml.fhir.core.datatype.String)newValue);
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
			case FhirResourcePackage.VISION_PRESCRIPTION_DISPENSE__PRODUCT:
				setProduct((Coding)null);
				return;
			case FhirResourcePackage.VISION_PRESCRIPTION_DISPENSE__EYE:
				setEye((Code)null);
				return;
			case FhirResourcePackage.VISION_PRESCRIPTION_DISPENSE__SPHERE:
				setSphere((Decimal)null);
				return;
			case FhirResourcePackage.VISION_PRESCRIPTION_DISPENSE__CYLINDER:
				setCylinder((Decimal)null);
				return;
			case FhirResourcePackage.VISION_PRESCRIPTION_DISPENSE__AXIS:
				setAxis((org.eclipse.mdht.uml.fhir.core.datatype.Integer)null);
				return;
			case FhirResourcePackage.VISION_PRESCRIPTION_DISPENSE__PRISM:
				setPrism((Decimal)null);
				return;
			case FhirResourcePackage.VISION_PRESCRIPTION_DISPENSE__BASE:
				setBase((Code)null);
				return;
			case FhirResourcePackage.VISION_PRESCRIPTION_DISPENSE__ADD:
				setAdd((Decimal)null);
				return;
			case FhirResourcePackage.VISION_PRESCRIPTION_DISPENSE__POWER:
				setPower((Decimal)null);
				return;
			case FhirResourcePackage.VISION_PRESCRIPTION_DISPENSE__BACK_CURVE:
				setBackCurve((Decimal)null);
				return;
			case FhirResourcePackage.VISION_PRESCRIPTION_DISPENSE__DIAMETER:
				setDiameter((Decimal)null);
				return;
			case FhirResourcePackage.VISION_PRESCRIPTION_DISPENSE__DURATION:
				setDuration((SimpleQuantity)null);
				return;
			case FhirResourcePackage.VISION_PRESCRIPTION_DISPENSE__COLOR:
				setColor((org.eclipse.mdht.uml.fhir.core.datatype.String)null);
				return;
			case FhirResourcePackage.VISION_PRESCRIPTION_DISPENSE__BRAND:
				setBrand((org.eclipse.mdht.uml.fhir.core.datatype.String)null);
				return;
			case FhirResourcePackage.VISION_PRESCRIPTION_DISPENSE__NOTES:
				setNotes((org.eclipse.mdht.uml.fhir.core.datatype.String)null);
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
			case FhirResourcePackage.VISION_PRESCRIPTION_DISPENSE__PRODUCT:
				return product != null;
			case FhirResourcePackage.VISION_PRESCRIPTION_DISPENSE__EYE:
				return eye != null;
			case FhirResourcePackage.VISION_PRESCRIPTION_DISPENSE__SPHERE:
				return sphere != null;
			case FhirResourcePackage.VISION_PRESCRIPTION_DISPENSE__CYLINDER:
				return cylinder != null;
			case FhirResourcePackage.VISION_PRESCRIPTION_DISPENSE__AXIS:
				return axis != null;
			case FhirResourcePackage.VISION_PRESCRIPTION_DISPENSE__PRISM:
				return prism != null;
			case FhirResourcePackage.VISION_PRESCRIPTION_DISPENSE__BASE:
				return base != null;
			case FhirResourcePackage.VISION_PRESCRIPTION_DISPENSE__ADD:
				return add != null;
			case FhirResourcePackage.VISION_PRESCRIPTION_DISPENSE__POWER:
				return power != null;
			case FhirResourcePackage.VISION_PRESCRIPTION_DISPENSE__BACK_CURVE:
				return backCurve != null;
			case FhirResourcePackage.VISION_PRESCRIPTION_DISPENSE__DIAMETER:
				return diameter != null;
			case FhirResourcePackage.VISION_PRESCRIPTION_DISPENSE__DURATION:
				return duration != null;
			case FhirResourcePackage.VISION_PRESCRIPTION_DISPENSE__COLOR:
				return color != null;
			case FhirResourcePackage.VISION_PRESCRIPTION_DISPENSE__BRAND:
				return brand != null;
			case FhirResourcePackage.VISION_PRESCRIPTION_DISPENSE__NOTES:
				return notes != null;
		}
		return super.eIsSet(featureID);
	}

} //VisionPrescriptionDispenseImpl
