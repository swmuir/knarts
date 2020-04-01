package gov.knart2fhir.transformation.service.web;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.core.Context;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage;
import org.hl7.elm.r1.R1Package;
import org.hl7.knowledgeartifact.r1.util.R1ResourceFactoryImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.w3._1999.xhtml.XhtmlPackage;

@RestController
@RequestMapping("/knart2fhir/transformation")
public class Knart2FHIRTransformation {

	@Autowired
	ServletContext context;

	private static Logger logger = LoggerFactory.getLogger(Knart2FHIRTransformation.class);

	@PostMapping(consumes = MediaType.MULTIPART_FORM_DATA_VALUE, produces = {
			MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE })
	public String transformation(@Context HttpServletRequest req,
			@RequestPart("message") MultipartFile uploadedInputStream) throws Exception {
		logger.debug("DEBUG Start transformation ");

		// final URL url = context.getResource("/WEB-INF/Knart2FHIR.qvto");

		Knart2FhirAPI knart2FhirAPI = new Knart2FhirAPI();

		XhtmlPackage.eINSTANCE.eClass();

		ResourcesPackage.eINSTANCE.getAccount();

		R1Package.eINSTANCE.getAbs();

		// EPackage fromEPackage = testEcore.readEPackage("/MMA.ecore");
		// System.out.println("NSURI is " + fromEPackage.getNsURI());
		// testEcore.registerEPackage(fromEPackage);
		// EPackage toEPackage = testEcore.readEPackage("/MMB.ecore");
		// System.out.println("NSURI is " + toEPackage.getNsURI());

		org.hl7.knowledgeartifact.r1.R1Package.eINSTANCE.getActionBase();

		knart2FhirAPI.registerEPackage(org.hl7.knowledgeartifact.r1.R1Package.eINSTANCE);

		R1ResourceFactoryImpl r = new R1ResourceFactoryImpl();

		Resource theResource = r.createResource(null);

		theResource.load(uploadedInputStream.getInputStream(), null);

		String result = knart2FhirAPI.transform("Knart2FHIR.qvto", theResource);

		// final URL url = new ClassPathResource("Knart2FHIR.qvto").getURL();

		// "";
		return "aaaa " + result;
	}

}
