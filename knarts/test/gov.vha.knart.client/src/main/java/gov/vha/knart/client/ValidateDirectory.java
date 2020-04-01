package gov.vha.knart.client;

import java.io.File;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.io.IOUtils;
import org.hl7.fhir.r4.hapi.ctx.DefaultProfileValidationSupport;
import org.hl7.fhir.r4.hapi.validation.FhirInstanceValidator;
import org.hl7.fhir.r4.hapi.validation.PrePopulatedValidationSupport;
import org.hl7.fhir.r4.hapi.validation.ValidationSupportChain;
import org.hl7.fhir.r4.model.CodeSystem;
import org.hl7.fhir.r4.model.OperationOutcome;
import org.hl7.fhir.r4.model.OperationOutcome.OperationOutcomeIssueComponent;
import org.hl7.fhir.r4.model.StructureDefinition;
import org.hl7.fhir.r4.model.ValueSet;
import org.hl7.fhir.r4.model.codesystems.IssueSeverity;
import org.hl7.fhir.instance.model.api.IBaseOperationOutcome;

import ca.uhn.fhir.context.FhirContext;
import ca.uhn.fhir.parser.IParser;
import ca.uhn.fhir.validation.FhirValidator;
import ca.uhn.fhir.validation.ValidationResult;

public class ValidateDirectory {
   private static final org.slf4j.Logger ourLog = org.slf4j.LoggerFactory.getLogger(ValidateDirectory.class);

   public static void main(String[] args) throws Exception {

	   File resourceDirectory = new File("/Users/seanmuir/mdhtcleanup/knarts/knarts/test/KNARTS/fhirbundles");

      FhirContext ctx = FhirContext.forR4();
      IParser xmlParser = ctx.newXmlParser();


      Map<String, StructureDefinition> structureDefinitions = new HashMap<String, StructureDefinition>();
      Map<String, CodeSystem> codeSystems = new HashMap<String, CodeSystem>();
      Map<String, ValueSet> valueSets = new HashMap<String, ValueSet>();

 
      FhirInstanceValidator instanceValidator = new FhirInstanceValidator();

//      ValidationSupportChain validationSupportChain = new ValidationSupportChain();
//      validationSupportChain.addValidationSupport(new DefaultProfileValidationSupport());
//      validationSupportChain.addValidationSupport(new PrePopulatedValidationSupport(structureDefinitions, valueSets, codeSystems));

      instanceValidator.setValidationSupport(new DefaultProfileValidationSupport());
      
      instanceValidator.setNoTerminologyChecks(true);
      
//      instanceValidator.
      
//      instanceValidator.set

      FhirValidator val = ctx.newValidator();
      val.registerValidatorModule(instanceValidator);
      
      // Loop through the files in the validation directory and validate each one
      for (File nextFile : resourceDirectory.listFiles()) {
         
         if (nextFile.getAbsolutePath().toLowerCase().endsWith(".xml")) {
            ourLog.info("Going to validate: {}", nextFile.getName());
         } else if (nextFile.getAbsolutePath().toLowerCase().endsWith(".json")) {
            ourLog.info("Going to validate: {}", nextFile.getName());
         } else {
            ourLog.info("Ignoring file: {}", nextFile.getName());
            continue;
         }
         
         String input = IOUtils.toString(new FileReader(nextFile));
         ValidationResult result = val.validateWithResult(input);
         OperationOutcome oo = (OperationOutcome) result.toOperationOutcome();
         
         for (OperationOutcomeIssueComponent issue : oo.getIssue()) {
        	 
//        	 System.out.println(issue.getSeverity().toString());
			if ("ERROR".equals(issue.getSeverity().toString())) {
        		 System.out.println(issue.getDiagnostics());
        	 }
        	 
         }
         
         
//         oo.geti
//         ourLog.info("Result:\n{}", xmlParser.setPrettyPrint(true).encodeResourceToString(oo));
      }
      
   }

}
