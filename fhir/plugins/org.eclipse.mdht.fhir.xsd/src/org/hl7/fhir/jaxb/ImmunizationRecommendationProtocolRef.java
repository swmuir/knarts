package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.ImmunizationRecommendationProtocol;

@XmlRootElement(name = "ImmunizationRecommendationProtocolRefElement")
public class ImmunizationRecommendationProtocolRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public ImmunizationRecommendationProtocol createInstance() {
		return FhirFactory.eINSTANCE.createImmunizationRecommendationProtocol();
	}
	
	public static ImmunizationRecommendationProtocolRef valueOf(String id) {
		ImmunizationRecommendationProtocolRef result = new ImmunizationRecommendationProtocolRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}