/**
 * Copyright: NEHTA 2015
 * Author: Joerg Kiegeland, Distributed Models Pty Ltd 
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.mdht.api.transform;

import static org.eclipse.mdht.uml.transform.ecore.BaseEcoreTransformationBuilder.adapt;

import org.eclipse.mdht.transform.core.IRule;
import org.eclipse.mdht.transform.core.ITransformation;
import org.eclipse.mdht.transform.core.TransformationBuilder;
import org.eclipse.mdht.uml.cda.transform.CDAInitializeContextRule;
import org.eclipse.mdht.uml.cda.transform.EcoreTransformationBuilder;
import org.eclipse.mdht.uml.cda.transform.TransformClinicalDocument;
import org.eclipse.mdht.uml.cda.transform.TransformTemplateIdentifier;
import org.eclipse.mdht.uml.transform.ecore.BaseEcoreTransformationBuilder;
import org.eclipse.mdht.uml.transform.ecore.IEcoreTransformIDs;
import org.eclipse.mdht.uml.transform.ecore.ProcessDeletedElementsFragment;
import org.eclipse.mdht.uml.transform.ecore.TransformAssociation;
import org.eclipse.mdht.uml.transform.ecore.TransformConstraint;
import org.eclipse.mdht.uml.transform.ecore.TransformPackage;
import org.eclipse.mdht.uml.transform.ecore.TransformPropertyConstraint;
import org.eclipse.mdht.uml.transform.ecore.BaseEcoreTransformationBuilder.IRuleOverrideProvider;

/**
 * A transformation builder that has a parallel configuration to {@link EcoreTransformationBuilder} however particularly adjusts the OCL to accommodate requirements for Schematron and Facade generation later on.
 */
public class APITransformationBuilder extends TransformationBuilder {

	protected APITransformationBuilder(ITransformation product) {
		super(product);
	}

	public static TransformationBuilder create() {
		TransformationBuilder result = new APITransformationBuilder(BaseEcoreTransformationBuilder.create(overrides()) //

				.initialization() //
				.rule(new CDAInitializeContextRule()) //
				.done() // initialization phase

				.getPhase(IEcoreTransformIDs.TRANSFORM_ELEMENTS_PHASE) //
				.rule(adapt(TransformClinicalDocument.class)) //
				.rule(adapt(TransformTemplateIdentifier.class)) //
				.done() // customizing main transformation phase

				.finalization() //
				.rule(new APISaveModelRule()) //
				.done() // customizing main transformation phase

				.finalization() //
				// before we save the model, destroy all of the elements that we deleted
				.getRule(IRule.ID_SAVE_MODEL).before(new ProcessDeletedElementsFragment()) //
				.rule(new APISavePluginPropertiesRule()) //
				.done()

				.build()); //

		return result;
	}

	private static IRuleOverrideProvider overrides() {
		return new IRuleOverrideProvider() {

			public <T> Class<? extends T> override(Class<T> rule) {
				Class<? extends T> result = null;

				if (rule == TransformAssociation.class) {
					result = APITransformCDAAssociation.class.asSubclass(rule);
				} else if (rule == TransformPropertyConstraint.class) {
					result = APITransformCDAPropertyConstraint.class.asSubclass(rule);
				} else if (rule == TransformConstraint.class) {
					result = APITransformLogicalConstraint.class.asSubclass(rule);
				} else if (rule == TransformTemplateIdentifier.class || rule == TransformPackage.class) {
					result = rule;
				} else {
					result = (Class) APITransformNothing.class;
				}

				return result;
			}
		};
	}
}
