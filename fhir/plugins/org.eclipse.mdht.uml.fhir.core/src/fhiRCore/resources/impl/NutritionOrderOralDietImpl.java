/**
 */
package fhiRCore.resources.impl;

import fhiRCore.dataTypes.CodeableConcept;
import fhiRCore.dataTypes.Timing;

import fhiRCore.dataTypes.impl.BackboneElementImpl;

import fhiRCore.resources.NutritionOrderOralDiet;
import fhiRCore.resources.NutritionOrderOralDietNutrient;
import fhiRCore.resources.NutritionOrderOralDietTexture;
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
 * An implementation of the model object '<em><b>Nutrition Order Oral Diet</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.impl.NutritionOrderOralDietImpl#getTypes <em>Type</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.NutritionOrderOralDietImpl#getSchedules <em>Schedule</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.NutritionOrderOralDietImpl#getNutrients <em>Nutrient</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.NutritionOrderOralDietImpl#getTextures <em>Texture</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.NutritionOrderOralDietImpl#getFluidConsistencyTypes <em>Fluid Consistency Type</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.NutritionOrderOralDietImpl#getInstruction <em>Instruction</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NutritionOrderOralDietImpl extends BackboneElementImpl implements NutritionOrderOralDiet {
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
	 * The cached value of the '{@link #getSchedules() <em>Schedule</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchedules()
	 * @generated
	 * @ordered
	 */
	protected EList<Timing> schedules;

	/**
	 * The cached value of the '{@link #getNutrients() <em>Nutrient</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNutrients()
	 * @generated
	 * @ordered
	 */
	protected EList<NutritionOrderOralDietNutrient> nutrients;

	/**
	 * The cached value of the '{@link #getTextures() <em>Texture</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextures()
	 * @generated
	 * @ordered
	 */
	protected EList<NutritionOrderOralDietTexture> textures;

	/**
	 * The cached value of the '{@link #getFluidConsistencyTypes() <em>Fluid Consistency Type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFluidConsistencyTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> fluidConsistencyTypes;

	/**
	 * The cached value of the '{@link #getInstruction() <em>Instruction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstruction()
	 * @generated
	 * @ordered
	 */
	protected fhiRCore.dataTypes.String instruction;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NutritionOrderOralDietImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getNutritionOrderOralDiet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getTypes() {
		if (types == null) {
			types = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, ResourcesPackage.NUTRITION_ORDER_ORAL_DIET__TYPE);
		}
		return types;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Timing> getSchedules() {
		if (schedules == null) {
			schedules = new EObjectContainmentEList<Timing>(Timing.class, this, ResourcesPackage.NUTRITION_ORDER_ORAL_DIET__SCHEDULE);
		}
		return schedules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NutritionOrderOralDietNutrient> getNutrients() {
		if (nutrients == null) {
			nutrients = new EObjectContainmentEList<NutritionOrderOralDietNutrient>(NutritionOrderOralDietNutrient.class, this, ResourcesPackage.NUTRITION_ORDER_ORAL_DIET__NUTRIENT);
		}
		return nutrients;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NutritionOrderOralDietTexture> getTextures() {
		if (textures == null) {
			textures = new EObjectContainmentEList<NutritionOrderOralDietTexture>(NutritionOrderOralDietTexture.class, this, ResourcesPackage.NUTRITION_ORDER_ORAL_DIET__TEXTURE);
		}
		return textures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getFluidConsistencyTypes() {
		if (fluidConsistencyTypes == null) {
			fluidConsistencyTypes = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, ResourcesPackage.NUTRITION_ORDER_ORAL_DIET__FLUID_CONSISTENCY_TYPE);
		}
		return fluidConsistencyTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public fhiRCore.dataTypes.String getInstruction() {
		return instruction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInstruction(fhiRCore.dataTypes.String newInstruction, NotificationChain msgs) {
		fhiRCore.dataTypes.String oldInstruction = instruction;
		instruction = newInstruction;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.NUTRITION_ORDER_ORAL_DIET__INSTRUCTION, oldInstruction, newInstruction);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInstruction(fhiRCore.dataTypes.String newInstruction) {
		if (newInstruction != instruction) {
			NotificationChain msgs = null;
			if (instruction != null)
				msgs = ((InternalEObject)instruction).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.NUTRITION_ORDER_ORAL_DIET__INSTRUCTION, null, msgs);
			if (newInstruction != null)
				msgs = ((InternalEObject)newInstruction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.NUTRITION_ORDER_ORAL_DIET__INSTRUCTION, null, msgs);
			msgs = basicSetInstruction(newInstruction, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.NUTRITION_ORDER_ORAL_DIET__INSTRUCTION, newInstruction, newInstruction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.NUTRITION_ORDER_ORAL_DIET__TYPE:
				return ((InternalEList<?>)getTypes()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.NUTRITION_ORDER_ORAL_DIET__SCHEDULE:
				return ((InternalEList<?>)getSchedules()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.NUTRITION_ORDER_ORAL_DIET__NUTRIENT:
				return ((InternalEList<?>)getNutrients()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.NUTRITION_ORDER_ORAL_DIET__TEXTURE:
				return ((InternalEList<?>)getTextures()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.NUTRITION_ORDER_ORAL_DIET__FLUID_CONSISTENCY_TYPE:
				return ((InternalEList<?>)getFluidConsistencyTypes()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.NUTRITION_ORDER_ORAL_DIET__INSTRUCTION:
				return basicSetInstruction(null, msgs);
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
			case ResourcesPackage.NUTRITION_ORDER_ORAL_DIET__TYPE:
				return getTypes();
			case ResourcesPackage.NUTRITION_ORDER_ORAL_DIET__SCHEDULE:
				return getSchedules();
			case ResourcesPackage.NUTRITION_ORDER_ORAL_DIET__NUTRIENT:
				return getNutrients();
			case ResourcesPackage.NUTRITION_ORDER_ORAL_DIET__TEXTURE:
				return getTextures();
			case ResourcesPackage.NUTRITION_ORDER_ORAL_DIET__FLUID_CONSISTENCY_TYPE:
				return getFluidConsistencyTypes();
			case ResourcesPackage.NUTRITION_ORDER_ORAL_DIET__INSTRUCTION:
				return getInstruction();
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
			case ResourcesPackage.NUTRITION_ORDER_ORAL_DIET__TYPE:
				getTypes().clear();
				getTypes().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case ResourcesPackage.NUTRITION_ORDER_ORAL_DIET__SCHEDULE:
				getSchedules().clear();
				getSchedules().addAll((Collection<? extends Timing>)newValue);
				return;
			case ResourcesPackage.NUTRITION_ORDER_ORAL_DIET__NUTRIENT:
				getNutrients().clear();
				getNutrients().addAll((Collection<? extends NutritionOrderOralDietNutrient>)newValue);
				return;
			case ResourcesPackage.NUTRITION_ORDER_ORAL_DIET__TEXTURE:
				getTextures().clear();
				getTextures().addAll((Collection<? extends NutritionOrderOralDietTexture>)newValue);
				return;
			case ResourcesPackage.NUTRITION_ORDER_ORAL_DIET__FLUID_CONSISTENCY_TYPE:
				getFluidConsistencyTypes().clear();
				getFluidConsistencyTypes().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case ResourcesPackage.NUTRITION_ORDER_ORAL_DIET__INSTRUCTION:
				setInstruction((fhiRCore.dataTypes.String)newValue);
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
			case ResourcesPackage.NUTRITION_ORDER_ORAL_DIET__TYPE:
				getTypes().clear();
				return;
			case ResourcesPackage.NUTRITION_ORDER_ORAL_DIET__SCHEDULE:
				getSchedules().clear();
				return;
			case ResourcesPackage.NUTRITION_ORDER_ORAL_DIET__NUTRIENT:
				getNutrients().clear();
				return;
			case ResourcesPackage.NUTRITION_ORDER_ORAL_DIET__TEXTURE:
				getTextures().clear();
				return;
			case ResourcesPackage.NUTRITION_ORDER_ORAL_DIET__FLUID_CONSISTENCY_TYPE:
				getFluidConsistencyTypes().clear();
				return;
			case ResourcesPackage.NUTRITION_ORDER_ORAL_DIET__INSTRUCTION:
				setInstruction((fhiRCore.dataTypes.String)null);
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
			case ResourcesPackage.NUTRITION_ORDER_ORAL_DIET__TYPE:
				return types != null && !types.isEmpty();
			case ResourcesPackage.NUTRITION_ORDER_ORAL_DIET__SCHEDULE:
				return schedules != null && !schedules.isEmpty();
			case ResourcesPackage.NUTRITION_ORDER_ORAL_DIET__NUTRIENT:
				return nutrients != null && !nutrients.isEmpty();
			case ResourcesPackage.NUTRITION_ORDER_ORAL_DIET__TEXTURE:
				return textures != null && !textures.isEmpty();
			case ResourcesPackage.NUTRITION_ORDER_ORAL_DIET__FLUID_CONSISTENCY_TYPE:
				return fluidConsistencyTypes != null && !fluidConsistencyTypes.isEmpty();
			case ResourcesPackage.NUTRITION_ORDER_ORAL_DIET__INSTRUCTION:
				return instruction != null;
		}
		return super.eIsSet(featureID);
	}

} //NutritionOrderOralDietImpl
