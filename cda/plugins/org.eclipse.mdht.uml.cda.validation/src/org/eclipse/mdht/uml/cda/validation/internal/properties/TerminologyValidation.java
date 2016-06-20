/*******************************************************************************
 * Copyright (c) 2016 seanmuir.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     seanmuir - initial API and implementation
 *
 *******************************************************************************/
package org.eclipse.mdht.uml.cda.validation.internal.properties;

import org.apache.commons.lang.StringUtils;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.validation.IValidationContext;
import org.eclipse.mdht.uml.term.core.profile.CodeSystemConstraint;
import org.eclipse.mdht.uml.term.core.profile.ValueSetConstraint;
import org.eclipse.mdht.uml.term.core.util.TermProfileUtil;
import org.eclipse.mdht.uml.validation.provider.AbstractMultiConstraint;
import org.eclipse.uml2.uml.Property;;

/**
 * @author seanmuir
 *
 */
public class TerminologyValidation extends AbstractMultiConstraint {

	public IStatus validateTerminologyValidation(IValidationContext context) {
		IStatus result = null;

		if (context.getTarget() instanceof Property) {
			Property property = (Property) context.getTarget();

			CodeSystemConstraint codeSystemConstraint = TermProfileUtil.getCodeSystemConstraint(property);

			if ((codeSystemConstraint != null) && (codeSystemConstraint.getReference() != null) &&
					(codeSystemConstraint.getReference().getBase_Enumeration() == null)) {

				if (StringUtils.isEmpty(codeSystemConstraint.getCode())) {
					result = context.createFailureStatus(property, property.getQualifiedName());
				}

			}

			ValueSetConstraint valuesetConstraint = TermProfileUtil.getValueSetConstraint(property);

			if ((valuesetConstraint != null) && (valuesetConstraint.getReference() != null) &&
					valuesetConstraint.getReference().getBase_Enumeration() == null) {

				result = context.createFailureStatus(property, property.getQualifiedName());
			}

		}

		return (result == null)
				? context.createSuccessStatus()
				: result;
	}

}
