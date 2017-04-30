package org.eclipse.mdht.api.schematron;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.mdht.api.OCLConstraintSection;
import org.eclipse.mdht.transformation.ocl2xpath.OCL2XPathTransformationForUML;

public class Activator extends AbstractUIPlugin {

	public Activator() {
		OCLConstraintSection.OCL_TRANSFORMATIONS.put("XPath", new OCL2XPathTransformationForUML(null));
	}

}
