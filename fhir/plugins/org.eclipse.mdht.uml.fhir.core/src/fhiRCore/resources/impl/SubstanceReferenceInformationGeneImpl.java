/**
 */
package fhiRCore.resources.impl;

import fhiRCore.dataTypes.CodeableConcept;
import fhiRCore.dataTypes.Reference;

import fhiRCore.dataTypes.impl.BackboneElementImpl;

import fhiRCore.resources.ResourcesPackage;
import fhiRCore.resources.SubstanceReferenceInformationGene;

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
 * An implementation of the model object '<em><b>Substance Reference Information Gene</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.impl.SubstanceReferenceInformationGeneImpl#getGeneSequenceOrigin <em>Gene Sequence Origin</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.SubstanceReferenceInformationGeneImpl#getGene <em>Gene</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.SubstanceReferenceInformationGeneImpl#getSources <em>Source</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubstanceReferenceInformationGeneImpl extends BackboneElementImpl implements SubstanceReferenceInformationGene {
	/**
	 * The cached value of the '{@link #getGeneSequenceOrigin() <em>Gene Sequence Origin</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneSequenceOrigin()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept geneSequenceOrigin;

	/**
	 * The cached value of the '{@link #getGene() <em>Gene</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGene()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept gene;

	/**
	 * The cached value of the '{@link #getSources() <em>Source</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSources()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> sources;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubstanceReferenceInformationGeneImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getSubstanceReferenceInformationGene();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getGeneSequenceOrigin() {
		return geneSequenceOrigin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGeneSequenceOrigin(CodeableConcept newGeneSequenceOrigin, NotificationChain msgs) {
		CodeableConcept oldGeneSequenceOrigin = geneSequenceOrigin;
		geneSequenceOrigin = newGeneSequenceOrigin;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.SUBSTANCE_REFERENCE_INFORMATION_GENE__GENE_SEQUENCE_ORIGIN, oldGeneSequenceOrigin, newGeneSequenceOrigin);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGeneSequenceOrigin(CodeableConcept newGeneSequenceOrigin) {
		if (newGeneSequenceOrigin != geneSequenceOrigin) {
			NotificationChain msgs = null;
			if (geneSequenceOrigin != null)
				msgs = ((InternalEObject)geneSequenceOrigin).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SUBSTANCE_REFERENCE_INFORMATION_GENE__GENE_SEQUENCE_ORIGIN, null, msgs);
			if (newGeneSequenceOrigin != null)
				msgs = ((InternalEObject)newGeneSequenceOrigin).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SUBSTANCE_REFERENCE_INFORMATION_GENE__GENE_SEQUENCE_ORIGIN, null, msgs);
			msgs = basicSetGeneSequenceOrigin(newGeneSequenceOrigin, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.SUBSTANCE_REFERENCE_INFORMATION_GENE__GENE_SEQUENCE_ORIGIN, newGeneSequenceOrigin, newGeneSequenceOrigin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getGene() {
		return gene;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGene(CodeableConcept newGene, NotificationChain msgs) {
		CodeableConcept oldGene = gene;
		gene = newGene;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.SUBSTANCE_REFERENCE_INFORMATION_GENE__GENE, oldGene, newGene);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGene(CodeableConcept newGene) {
		if (newGene != gene) {
			NotificationChain msgs = null;
			if (gene != null)
				msgs = ((InternalEObject)gene).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SUBSTANCE_REFERENCE_INFORMATION_GENE__GENE, null, msgs);
			if (newGene != null)
				msgs = ((InternalEObject)newGene).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SUBSTANCE_REFERENCE_INFORMATION_GENE__GENE, null, msgs);
			msgs = basicSetGene(newGene, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.SUBSTANCE_REFERENCE_INFORMATION_GENE__GENE, newGene, newGene));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getSources() {
		if (sources == null) {
			sources = new EObjectContainmentEList<Reference>(Reference.class, this, ResourcesPackage.SUBSTANCE_REFERENCE_INFORMATION_GENE__SOURCE);
		}
		return sources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.SUBSTANCE_REFERENCE_INFORMATION_GENE__GENE_SEQUENCE_ORIGIN:
				return basicSetGeneSequenceOrigin(null, msgs);
			case ResourcesPackage.SUBSTANCE_REFERENCE_INFORMATION_GENE__GENE:
				return basicSetGene(null, msgs);
			case ResourcesPackage.SUBSTANCE_REFERENCE_INFORMATION_GENE__SOURCE:
				return ((InternalEList<?>)getSources()).basicRemove(otherEnd, msgs);
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
			case ResourcesPackage.SUBSTANCE_REFERENCE_INFORMATION_GENE__GENE_SEQUENCE_ORIGIN:
				return getGeneSequenceOrigin();
			case ResourcesPackage.SUBSTANCE_REFERENCE_INFORMATION_GENE__GENE:
				return getGene();
			case ResourcesPackage.SUBSTANCE_REFERENCE_INFORMATION_GENE__SOURCE:
				return getSources();
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
			case ResourcesPackage.SUBSTANCE_REFERENCE_INFORMATION_GENE__GENE_SEQUENCE_ORIGIN:
				setGeneSequenceOrigin((CodeableConcept)newValue);
				return;
			case ResourcesPackage.SUBSTANCE_REFERENCE_INFORMATION_GENE__GENE:
				setGene((CodeableConcept)newValue);
				return;
			case ResourcesPackage.SUBSTANCE_REFERENCE_INFORMATION_GENE__SOURCE:
				getSources().clear();
				getSources().addAll((Collection<? extends Reference>)newValue);
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
			case ResourcesPackage.SUBSTANCE_REFERENCE_INFORMATION_GENE__GENE_SEQUENCE_ORIGIN:
				setGeneSequenceOrigin((CodeableConcept)null);
				return;
			case ResourcesPackage.SUBSTANCE_REFERENCE_INFORMATION_GENE__GENE:
				setGene((CodeableConcept)null);
				return;
			case ResourcesPackage.SUBSTANCE_REFERENCE_INFORMATION_GENE__SOURCE:
				getSources().clear();
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
			case ResourcesPackage.SUBSTANCE_REFERENCE_INFORMATION_GENE__GENE_SEQUENCE_ORIGIN:
				return geneSequenceOrigin != null;
			case ResourcesPackage.SUBSTANCE_REFERENCE_INFORMATION_GENE__GENE:
				return gene != null;
			case ResourcesPackage.SUBSTANCE_REFERENCE_INFORMATION_GENE__SOURCE:
				return sources != null && !sources.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SubstanceReferenceInformationGeneImpl
