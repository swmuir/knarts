/*******************************************************************************
 * Copyright (c) 2016 David Carlson and others.
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

import org.eclipse.mdht.uml.fhir.core.datatype.CodeableConcept;

import org.eclipse.mdht.uml.fhir.core.datatype.impl.BackboneElementImpl;

import org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage;
import org.eclipse.mdht.uml.fhir.core.resource.SequenceCoordinate;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sequence Coordinate</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.SequenceCoordinateImpl#getChromosome <em>Chromosome</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.SequenceCoordinateImpl#getStart <em>Start</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.SequenceCoordinateImpl#getEnd <em>End</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.SequenceCoordinateImpl#getGenomeBuild <em>Genome Build</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SequenceCoordinateImpl extends BackboneElementImpl implements SequenceCoordinate {
	/**
	 * The cached value of the '{@link #getChromosome() <em>Chromosome</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChromosome()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept chromosome;

	/**
	 * The cached value of the '{@link #getStart() <em>Start</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStart()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.datatype.Integer start;

	/**
	 * The cached value of the '{@link #getEnd() <em>End</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnd()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.datatype.Integer end;

	/**
	 * The cached value of the '{@link #getGenomeBuild() <em>Genome Build</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenomeBuild()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept genomeBuild;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SequenceCoordinateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirResourcePackage.eINSTANCE.getSequenceCoordinate();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getChromosome() {
		if (chromosome != null && chromosome.eIsProxy()) {
			InternalEObject oldChromosome = (InternalEObject)chromosome;
			chromosome = (CodeableConcept)eResolveProxy(oldChromosome);
			if (chromosome != oldChromosome) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.SEQUENCE_COORDINATE__CHROMOSOME, oldChromosome, chromosome));
			}
		}
		return chromosome;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept basicGetChromosome() {
		return chromosome;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChromosome(CodeableConcept newChromosome) {
		CodeableConcept oldChromosome = chromosome;
		chromosome = newChromosome;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.SEQUENCE_COORDINATE__CHROMOSOME, oldChromosome, chromosome));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.Integer getStart() {
		if (start != null && start.eIsProxy()) {
			InternalEObject oldStart = (InternalEObject)start;
			start = (org.eclipse.mdht.uml.fhir.core.datatype.Integer)eResolveProxy(oldStart);
			if (start != oldStart) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.SEQUENCE_COORDINATE__START, oldStart, start));
			}
		}
		return start;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.Integer basicGetStart() {
		return start;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStart(org.eclipse.mdht.uml.fhir.core.datatype.Integer newStart) {
		org.eclipse.mdht.uml.fhir.core.datatype.Integer oldStart = start;
		start = newStart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.SEQUENCE_COORDINATE__START, oldStart, start));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.Integer getEnd() {
		if (end != null && end.eIsProxy()) {
			InternalEObject oldEnd = (InternalEObject)end;
			end = (org.eclipse.mdht.uml.fhir.core.datatype.Integer)eResolveProxy(oldEnd);
			if (end != oldEnd) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.SEQUENCE_COORDINATE__END, oldEnd, end));
			}
		}
		return end;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.Integer basicGetEnd() {
		return end;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnd(org.eclipse.mdht.uml.fhir.core.datatype.Integer newEnd) {
		org.eclipse.mdht.uml.fhir.core.datatype.Integer oldEnd = end;
		end = newEnd;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.SEQUENCE_COORDINATE__END, oldEnd, end));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getGenomeBuild() {
		if (genomeBuild != null && genomeBuild.eIsProxy()) {
			InternalEObject oldGenomeBuild = (InternalEObject)genomeBuild;
			genomeBuild = (CodeableConcept)eResolveProxy(oldGenomeBuild);
			if (genomeBuild != oldGenomeBuild) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.SEQUENCE_COORDINATE__GENOME_BUILD, oldGenomeBuild, genomeBuild));
			}
		}
		return genomeBuild;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept basicGetGenomeBuild() {
		return genomeBuild;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenomeBuild(CodeableConcept newGenomeBuild) {
		CodeableConcept oldGenomeBuild = genomeBuild;
		genomeBuild = newGenomeBuild;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.SEQUENCE_COORDINATE__GENOME_BUILD, oldGenomeBuild, genomeBuild));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FhirResourcePackage.SEQUENCE_COORDINATE__CHROMOSOME:
				if (resolve) return getChromosome();
				return basicGetChromosome();
			case FhirResourcePackage.SEQUENCE_COORDINATE__START:
				if (resolve) return getStart();
				return basicGetStart();
			case FhirResourcePackage.SEQUENCE_COORDINATE__END:
				if (resolve) return getEnd();
				return basicGetEnd();
			case FhirResourcePackage.SEQUENCE_COORDINATE__GENOME_BUILD:
				if (resolve) return getGenomeBuild();
				return basicGetGenomeBuild();
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
			case FhirResourcePackage.SEQUENCE_COORDINATE__CHROMOSOME:
				setChromosome((CodeableConcept)newValue);
				return;
			case FhirResourcePackage.SEQUENCE_COORDINATE__START:
				setStart((org.eclipse.mdht.uml.fhir.core.datatype.Integer)newValue);
				return;
			case FhirResourcePackage.SEQUENCE_COORDINATE__END:
				setEnd((org.eclipse.mdht.uml.fhir.core.datatype.Integer)newValue);
				return;
			case FhirResourcePackage.SEQUENCE_COORDINATE__GENOME_BUILD:
				setGenomeBuild((CodeableConcept)newValue);
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
			case FhirResourcePackage.SEQUENCE_COORDINATE__CHROMOSOME:
				setChromosome((CodeableConcept)null);
				return;
			case FhirResourcePackage.SEQUENCE_COORDINATE__START:
				setStart((org.eclipse.mdht.uml.fhir.core.datatype.Integer)null);
				return;
			case FhirResourcePackage.SEQUENCE_COORDINATE__END:
				setEnd((org.eclipse.mdht.uml.fhir.core.datatype.Integer)null);
				return;
			case FhirResourcePackage.SEQUENCE_COORDINATE__GENOME_BUILD:
				setGenomeBuild((CodeableConcept)null);
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
			case FhirResourcePackage.SEQUENCE_COORDINATE__CHROMOSOME:
				return chromosome != null;
			case FhirResourcePackage.SEQUENCE_COORDINATE__START:
				return start != null;
			case FhirResourcePackage.SEQUENCE_COORDINATE__END:
				return end != null;
			case FhirResourcePackage.SEQUENCE_COORDINATE__GENOME_BUILD:
				return genomeBuild != null;
		}
		return super.eIsSet(featureID);
	}

} //SequenceCoordinateImpl
