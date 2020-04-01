package gov.vha.knart.client;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.io.IOUtils;
import org.hl7.fhir.instance.model.api.IBaseBundle;
import org.hl7.fhir.instance.model.api.IBaseResource;
import org.hl7.fhir.r4.hapi.ctx.DefaultProfileValidationSupport;
import org.hl7.fhir.r4.hapi.validation.FhirInstanceValidator;
import org.hl7.fhir.r4.model.Bundle;
import org.hl7.fhir.r4.model.CodeSystem;
import org.hl7.fhir.r4.model.Bundle.BundleEntryComponent;
import org.hl7.fhir.r4.model.Bundle.HTTPVerb;
import org.hl7.fhir.r4.model.Observation;
import org.hl7.fhir.r4.model.OperationOutcome;
import org.hl7.fhir.r4.model.Observation.ObservationStatus;
import org.hl7.fhir.r4.model.OperationOutcome.OperationOutcomeIssueComponent;
import org.hl7.fhir.r4.model.Patient;
import org.hl7.fhir.r4.model.StructureDefinition;
import org.hl7.fhir.r4.model.ValueSet;

import ca.uhn.fhir.context.FhirContext;
import ca.uhn.fhir.context.support.IContextValidationSupport;
import ca.uhn.fhir.model.primitive.IdDt;
import ca.uhn.fhir.parser.IParser;
import ca.uhn.fhir.parser.IParserErrorHandler;
import ca.uhn.fhir.parser.XmlParser;
import ca.uhn.fhir.parser.json.JsonLikeValue.ScalarType;
import ca.uhn.fhir.parser.json.JsonLikeValue.ValueType;
import ca.uhn.fhir.rest.api.MethodOutcome;
import ca.uhn.fhir.rest.client.api.IGenericClient;
import ca.uhn.fhir.rest.gclient.ICreateTyped;
import ca.uhn.fhir.validation.FhirValidator;
import ca.uhn.fhir.validation.ValidationResult;

public class ClientTransactionExamples {

   public static void main(String[] args) throws FileNotFoundException, IOException {
	   File resourceDirectory = new File("/Users/seanmuir/mdhtcleanup/knarts/knarts/test/KNARTS/fhirbundles");

	      FhirContext ctx = FhirContext.forR4();
	      
//	      IContextValidationSupport<?, ?, ?, ?, ?, ?> theValidationSupport;
//		ctx.setValidationSupport(theValidationSupport);
	      
	      XmlParser xmlParser = (XmlParser) ctx.newXmlParser();


	      Map<String, StructureDefinition> structureDefinitions = new HashMap<String, StructureDefinition>();
	      Map<String, CodeSystem> codeSystems = new HashMap<String, CodeSystem>();
	      Map<String, ValueSet> valueSets = new HashMap<String, ValueSet>();

	 
//	      FhirInstanceValidator instanceValidator = new FhirInstanceValidator();
//
////	      ValidationSupportChain validationSupportChain = new ValidationSupportChain();
////	      validationSupportChain.addValidationSupport(new DefaultProfileValidationSupport());
////	      validationSupportChain.addValidationSupport(new PrePopulatedValidationSupport(structureDefinitions, valueSets, codeSystems));
//
//	      instanceValidator.setValidationSupport(new DefaultProfileValidationSupport());
//	      
//	      instanceValidator.setNoTerminologyChecks(true);
//	      
////	      instanceValidator.
//	      
////	      instanceValidator.set
//
//	      FhirValidator val = ctx.newValidator();
//	      val.registerValidatorModule(instanceValidator);
//	      
	      // Loop through the files in the validation directory and validate each one
	      for (File nextFile : resourceDirectory.listFiles()) {
	    	  
	    	  System.out.println(nextFile.getAbsolutePath());
	         
//	         if (nextFile.getAbsolutePath().toLowerCase().endsWith(".xml")) {
//	            ourLog.info("Going to validate: {}", nextFile.getName());
//	         } else if (nextFile.getAbsolutePath().toLowerCase().endsWith(".json")) {
//	            ourLog.info("Going to validate: {}", nextFile.getName());
//	         } else {
//	            ourLog.info("Ignoring file: {}", nextFile.getName());
//	            continue;
//	         }
	         
	         String input = IOUtils.toString(new FileReader(nextFile));
	         
//	         xmlParser.
	         
	       
	         
	         IParserErrorHandler nothing = new IParserErrorHandler() {

				public void containedResourceWithNoId(IParseLocation theLocation) {
					// TODO Auto-generated method stub
					
				}

				public void incorrectJsonType(IParseLocation theLocation, String theElementName,
						ValueType theExpectedValueType, ScalarType theExpectedScalarType, ValueType theFoundValueType,
						ScalarType theFoundScalarType) {
					// TODO Auto-generated method stub
					
				}

				public void invalidValue(IParseLocation theLocation, String theValue, String theError) {
					// TODO Auto-generated method stub
					
				}

				public void missingRequiredElement(IParseLocation theLocation, String theElementName) {
					// TODO Auto-generated method stub
					
				}

				public void unexpectedRepeatingElement(IParseLocation theLocation, String theElementName) {
					// TODO Auto-generated method stub
					
				}

				public void unknownAttribute(IParseLocation theLocation, String theAttributeName) {
					// TODO Auto-generated method stub
					
				}

				public void unknownElement(IParseLocation theLocation, String theElementName) {
					// TODO Auto-generated method stub
					
				}

				public void unknownReference(IParseLocation theLocation, String theReference) {
					// TODO Auto-generated method stub
					
				}};
//			xmlParser.setParserErrorHandler(nothing );
	         
	        
				  System.out.println("aaaaaaaaaaaaaaaaaa "+nextFile.getAbsolutePath());
				  System.out.println(nextFile.getAbsolutePath());
				  System.out.println(nextFile.getAbsolutePath());
				  System.out.println(input);
				  
			try {

				IGenericClient client = ctx.newRestfulGenericClient("https://api.logicahealth.org/KNART2FHIR/open");
				Bundle bundle = (Bundle) xmlParser.parseResource(input);

				System.out.println(bundle);
				
				for (BundleEntryComponent entry : bundle.getEntry()) {
					
					
					
					MethodOutcome foo = client.create().resource(entry.getResource()).execute();

					System.out.println(foo.getId().toString());
					
				}

				
				
		

				// IBaseBundle theBundleResource;
				MethodOutcome foo = client.create().resource(bundle).execute();

				System.out.println(foo);
			} catch (Exception e) {
System.err.println("ERROR ERROR "+e.getMessage());
			}
	         
//	         ValidationResult result = val.validateWithResult(input);
//	         OperationOutcome oo = (OperationOutcome) result.toOperationOutcome();
//	         
//	         for (OperationOutcomeIssueComponent issue : oo.getIssue()) {
//	        	 
////	        	 System.out.println(issue.getSeverity().toString());
//				if ("ERROR".equals(issue.getSeverity().toString())) {
//	        		 System.out.println(issue.getDiagnostics());
//	        	 }
//	        	 
//	         }
//	         
//	         
////	         oo.geti
////	         ourLog.info("Result:\n{}", xmlParser.setPrettyPrint(true).encodeResourceToString(oo));
	      }
   }

//   private static void conditionalCreate() {
//      
//      //START SNIPPET: conditional
//      // Create a patient object
//      Patient patient = new Patient();
//      patient.addIdentifier()
//         .setSystem("http://acme.org/mrns")
//         .setValue("12345");
//    
//      
//      // Give the patient a temporary UUID so that other resources in
//      // the transaction can refer to it
//      patient.setId(IdDt.newRandomUuid());
//      
//      // Create an observation object
//      Observation observation = new Observation();
//    
//	observation.setStatus(ObservationStatus.FINAL);
//      observation
//         .getCode()
//            .addCoding()
//               .setSystem("http://loinc.org")
//               .setCode("789-8")
//               .setDisplay("Erythrocytes [#/volume] in Blood by Automated count");
//       
//
//      // The observation refers to the patient using the ID, which is already
//      // set to a temporary UUID  
////      observation.sets
//
//      // Create a bundle that will be used as a transaction
//      Bundle bundle = new Bundle();
//     
//      
//     
//	// Add the patient as an entry. This entry is a POST with an 
//      // If-None-Exist header (conditional create) meaning that it
//      // will only be created if there isn't already a Patient with
//      // the identifier 12345
//      bundle.addEntry()
//         .setFullUrl(patient.getId())
//         .setResource(patient)
//         .getRequest()
//            .setUrl("Patient")
//            .setIfNoneExist("identifier=http://acme.org/mrns|12345")
//            .setMethod(HTTPVerb.POST);
//      
//      // Add the observation. This entry is a POST with no header
//      // (normal create) meaning that it will be created even if
//      // a similar resource already exists.
//      bundle.addEntry()
//         .setResource(observation)
//         .getRequest()
//            .setUrl("Observation")
//            .setMethod(HTTPVerb.POST);
//      
//      // Log the request
//      FhirContext ctx = FhirContext.forR4();
//      System.out.println(ctx.newXmlParser().setPrettyPrint(true).encodeResourceToString(bundle));
//      
//      
//      
//      // Create a client and post the transaction to the server
//      IGenericClient client = ctx.newRestfulGenericClient("https://api.logicahealth.org/KNART2FHIR/open");
//      
////      c
//      
//      Bundle resp = client.transaction().withBundle(bundle).execute();
//
//      // Log the response
//      System.out.println(ctx.newXmlParser().setPrettyPrint(true).encodeResourceToString(resp));
//      //END SNIPPET: conditional
//      
//   }
   
}
