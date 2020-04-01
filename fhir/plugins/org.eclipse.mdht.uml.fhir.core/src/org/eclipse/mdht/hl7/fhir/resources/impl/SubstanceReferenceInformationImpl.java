/**
 */
package org.eclipse.mdht.hl7.fhir.resources.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage;
import org.eclipse.mdht.hl7.fhir.resources.SubstanceReferenceInformation;
import org.eclipse.mdht.hl7.fhir.resources.SubstanceReferenceInformationClassification;
import org.eclipse.mdht.hl7.fhir.resources.SubstanceReferenceInformationGene;
import org.eclipse.mdht.hl7.fhir.resources.SubstanceReferenceInformationGeneElement;
import org.eclipse.mdht.hl7.fhir.resources.SubstanceReferenceInformationTarget;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Substance Reference Information</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.SubstanceReferenceInformationImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.SubstanceReferenceInformationImpl#getGenes <em>Gene</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.SubstanceReferenceInformationImpl#getGeneElements <em>Gene Element</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.SubstanceReferenceInformationImpl#getClassifications <em>Classification</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.SubstanceReferenceInformationImpl#getTargets <em>Target</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubstanceReferenceInformationImpl extends DomainResourceImpl implements SubstanceReferenceInformation {
	/**
	 * The cached value of the '{@link #getComment() <em>Comment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.hl7.fhir.dataTypes.String comment;

	/**
	 * The cached value of the '{@link #getGenes() <em>Gene</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenes()
	 * @generated
	 * @ordered
	 */
	protected EList<SubstanceReferenceInformationGene> genes;

	/**
	 * The cached value of the '{@link #getGeneElements() <em>Gene Element</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneElements()
	 * @generated
	 * @ordered
	 */
	protected EList<SubstanceReferenceInformationGeneElement> geneElements;

	/**
	 * The cached value of the '{@link #getClassifications() <em>Classification</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassifications()
	 * @generated
	 * @ordered
	 */
	protected EList<SubstanceReferenceInformationClassification> classifications;

	/**
	 * The cached value of the '{@link #getTargets() <em>Target</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargets()
	 * @generated
	 * @ordered
	 */
	protected EList<SubstanceReferenceInformationTarget> targets;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubstanceReferenceInformationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getSubstanceReferenceInformation();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.eclipse.mdht.hl7.fhir.dataTypes.String getComment() {
		return comment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComment(org.eclipse.mdht.hl7.fhir.dataTypes.String newComment, NotificationChain msgs) {
		org.eclipse.mdht.hl7.fhir.dataTypes.String oldComment = comment;
		comment = newComment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.SUBSTANCE_REFERENCE_INFORMATION__COMMENT, oldComment, newComment);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setComment(org.eclipse.mdht.hl7.fhir.dataTypes.String newComment) {
		if (newComment != comment) {
			NotificationChain msgs = null;
			if (comment != null)
				msgs = ((InternalEObject)comment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SUBSTANCE_REFERENCE_INFORMATION__COMMENT, null, msgs);
			if (newComment != null)
				msgs = ((InternalEObject)newComment).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SUBSTANCE_REFERENCE_INFORMATION__COMMENT, null, msgs);
			msgs = basicSetComment(newComment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.SUBSTANCE_REFERENCE_INFORMATION__COMMENT, newComment, newComment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SubstanceReferenceInformationGene> getGenes() {
		if (genes == null) {
			genes = new EObjectContainmentEList<SubstanceReferenceInformationGene>(SubstanceReferenceInformationGene.class, this, ResourcesPackage.SUBSTANCE_REFERENCE_INFORMATION__GENE);
		}
		return genes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SubstanceReferenceInformationGeneElement> getGeneElements() {
		if (geneElements == null) {
			geneElements = new EObjectContainmentEList<SubstanceReferenceInformationGeneElement>(SubstanceReferenceInformationGeneElement.class, this, ResourcesPackage.SUBSTANCE_REFERENCE_INFORMATION__GENE_ELEMENT);
		}
		return geneElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SubstanceReferenceInformationClassification> getClassifications() {
		if (classifications == null) {
			classifications = new EObjectContainmentEList<SubstanceReferenceInformationClassification>(SubstanceReferenceInformationClassification.class, this, ResourcesPackage.SUBSTANCE_REFERENCE_INFORMATION__CLASSIFICATION);
		}
		return classifications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SubstanceReferenceInformationTarget> getTargets() {
		if (targets == null) {
			targets = new EObjectContainmentEList<SubstanceReferenceInformationTarget>(SubstanceReferenceInformationTarget.class, this, ResourcesPackage.SUBSTANCE_REFERENCE_INFORMATION__TARGET);
		}
		return targets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.SUBSTANCE_REFERENCE_INFORMATION__COMMENT:
				return basicSetComment(null, msgs);
			case ResourcesPackage.SUBSTANCE_REFERENCE_INFORMATION__GENE:
				return ((InternalEList<?>)getGenes()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.SUBSTANCE_REFERENCE_INFORMATION__GENE_ELEMENT:
				return ((InternalEList<?>)getGeneElements()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.SUBSTANCE_REFERENCE_INFORMATION__CLASSIFICATION:
				return ((InternalEList<?>)getClassifications()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.SUBSTANCE_REFERENCE_INFORMATION__TARGET:
				return ((InternalEList<?>)getTargets()).basicRemove(otherEnd, msgs);
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
			case ResourcesPackage.SUBSTANCE_REFERENCE_INFORMATION__COMMENT:
				return getComment();
			case ResourcesPackage.SUBSTANCE_REFERENCE_INFORMATION__GENE:
				return getGenes();
			case ResourcesPackage.SUBSTANCE_REFERENCE_INFORMATION__GENE_ELEMENT:
				return getGeneElements();
			case ResourcesPackage.SUBSTANCE_REFERENCE_INFORMATION__CLASSIFICATION:
				return getClassifications();
			case ResourcesPackage.SUBSTANCE_REFERENCE_INFORMATION__TARGET:
				return getTargets();
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
			case ResourcesPackage.SUBSTANCE_REFERENCE_INFORMATION__COMMENT:
				setComment((org.eclipse.mdht.hl7.fhir.dataTypes.String)newValue);
				return;
			case ResourcesPackage.SUBSTANCE_REFERENCE_INFORMATION__GENE:
				getGenes().clear();
				getGenes().addAll((Collection<? extends SubstanceReferenceInformationGene>)newValue);
				return;
			case ResourcesPackage.SUBSTANCE_REFERENCE_INFORMATION__GENE_ELEMENT:
				getGeneElements().clear();
				getGeneElements().addAll((Collection<? extends SubstanceReferenceInformationGeneElement>)newValue);
				return;
			case ResourcesPackage.SUBSTANCE_REFERENCE_INFORMATION__CLASSIFICATION:
				getClassifications().clear();
				getClassifications().addAll((Collection<? extends SubstanceReferenceInformationClassification>)newValue);
				return;
			case ResourcesPackage.SUBSTANCE_REFERENCE_INFORMATION__TARGET:
				getTargets().clear();
				getTargets().addAll((Collection<? extends SubstanceReferenceInformationTarget>)newValue);
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
			case ResourcesPackage.SUBSTANCE_REFERENCE_INFORMATION__COMMENT:
				setComment((org.eclipse.mdht.hl7.fhir.dataTypes.String)null);
				return;
			case ResourcesPackage.SUBSTANCE_REFERENCE_INFORMATION__GENE:
				getGenes().clear();
				return;
			case ResourcesPackage.SUBSTANCE_REFERENCE_INFORMATION__GENE_ELEMENT:
				getGeneElements().clear();
				return;
			case ResourcesPackage.SUBSTANCE_REFERENCE_INFORMATION__CLASSIFICATION:
				getClassifications().clear();
				return;
			case ResourcesPackage.SUBSTANCE_REFERENCE_INFORMATION__TARGET:
				getTargets().clear();
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
			case ResourcesPackage.SUBSTANCE_REFERENCE_INFORMATION__COMMENT:
				return comment != null;
			case ResourcesPackage.SUBSTANCE_REFERENCE_INFORMATION__GENE:
				return genes != null && !genes.isEmpty();
			case ResourcesPackage.SUBSTANCE_REFERENCE_INFORMATION__GENE_ELEMENT:
				return geneElements != null && !geneElements.isEmpty();
			case ResourcesPackage.SUBSTANCE_REFERENCE_INFORMATION__CLASSIFICATION:
				return classifications != null && !classifications.isEmpty();
			case ResourcesPackage.SUBSTANCE_REFERENCE_INFORMATION__TARGET:
				return targets != null && !targets.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SubstanceReferenceInformationImpl
