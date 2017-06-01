package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.ImplementationGuidePage;

@XmlRootElement(name = "ImplementationGuidePageRefElement")
public class ImplementationGuidePageRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public ImplementationGuidePage createInstance() {
		return FhirFactory.eINSTANCE.createImplementationGuidePage();
	}
	
	public static ImplementationGuidePageRef valueOf(String id) {
		ImplementationGuidePageRef result = new ImplementationGuidePageRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}