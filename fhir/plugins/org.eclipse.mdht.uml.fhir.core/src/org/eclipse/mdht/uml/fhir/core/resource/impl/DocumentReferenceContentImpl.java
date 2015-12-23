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

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.mdht.uml.fhir.core.datatype.Attachment;
import org.eclipse.mdht.uml.fhir.core.datatype.Coding;

import org.eclipse.mdht.uml.fhir.core.datatype.impl.BackboneElementImpl;

import org.eclipse.mdht.uml.fhir.core.resource.DocumentReferenceContent;
import org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document Reference Content</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.DocumentReferenceContentImpl#getAttachment <em>Attachment</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.DocumentReferenceContentImpl#getFormats <em>Format</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DocumentReferenceContentImpl extends BackboneElementImpl implements DocumentReferenceContent {
	/**
	 * The cached value of the '{@link #getAttachment() <em>Attachment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttachment()
	 * @generated
	 * @ordered
	 */
	protected Attachment attachment;

	/**
	 * The cached value of the '{@link #getFormats() <em>Format</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormats()
	 * @generated
	 * @ordered
	 */
	protected EList<Coding> formats;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocumentReferenceContentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirResourcePackage.eINSTANCE.getDocumentReferenceContent();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attachment getAttachment() {
		if (attachment != null && attachment.eIsProxy()) {
			InternalEObject oldAttachment = (InternalEObject)attachment;
			attachment = (Attachment)eResolveProxy(oldAttachment);
			if (attachment != oldAttachment) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.DOCUMENT_REFERENCE_CONTENT__ATTACHMENT, oldAttachment, attachment));
			}
		}
		return attachment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attachment basicGetAttachment() {
		return attachment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttachment(Attachment newAttachment) {
		Attachment oldAttachment = attachment;
		attachment = newAttachment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.DOCUMENT_REFERENCE_CONTENT__ATTACHMENT, oldAttachment, attachment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Coding> getFormats() {
		if (formats == null) {
			formats = new EObjectResolvingEList<Coding>(Coding.class, this, FhirResourcePackage.DOCUMENT_REFERENCE_CONTENT__FORMAT);
		}
		return formats;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FhirResourcePackage.DOCUMENT_REFERENCE_CONTENT__ATTACHMENT:
				if (resolve) return getAttachment();
				return basicGetAttachment();
			case FhirResourcePackage.DOCUMENT_REFERENCE_CONTENT__FORMAT:
				return getFormats();
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
			case FhirResourcePackage.DOCUMENT_REFERENCE_CONTENT__ATTACHMENT:
				setAttachment((Attachment)newValue);
				return;
			case FhirResourcePackage.DOCUMENT_REFERENCE_CONTENT__FORMAT:
				getFormats().clear();
				getFormats().addAll((Collection<? extends Coding>)newValue);
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
			case FhirResourcePackage.DOCUMENT_REFERENCE_CONTENT__ATTACHMENT:
				setAttachment((Attachment)null);
				return;
			case FhirResourcePackage.DOCUMENT_REFERENCE_CONTENT__FORMAT:
				getFormats().clear();
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
			case FhirResourcePackage.DOCUMENT_REFERENCE_CONTENT__ATTACHMENT:
				return attachment != null;
			case FhirResourcePackage.DOCUMENT_REFERENCE_CONTENT__FORMAT:
				return formats != null && !formats.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DocumentReferenceContentImpl
