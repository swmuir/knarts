package org.eclipse.mdht.uml.fhir.transform;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceFactoryImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.mdht.uml.fhir.common.terminology.CodeSystem;
import org.eclipse.mdht.uml.fhir.common.terminology.Concept;
import org.eclipse.mdht.uml.fhir.common.terminology.ConceptDescriptor;
import org.eclipse.mdht.uml.fhir.common.util.FHIRModelFactory;
import org.eclipse.uml2.uml.Enumeration;
import org.eclipse.uml2.uml.Package;
import org.hl7.fhir.ParametersParameter;
import org.hl7.fhir.ValueSet;
import org.hl7.fhir.ValueSetContains;
import org.hl7.fhir.util.FhirResourceFactoryImpl;

/**
 * @author <a href="mailto:dcarlson@xmlmodeling.com">Dave Carlson (XMLmodeling.com)</a> 
 */
public class TerminologyCache {
	private static TerminologyCache INSTANCE = null;
	
	private boolean licenseAgreement = false;

//	private static String SERVICE_URL = "http://fhir2.healthintersections.com.au/open/";
//	private static String SERVICE_URL = "http://54.226.90.249/open/";
	private static String SERVICE_URL = "http://fhir3.healthintersections.com.au/open/";
	
//	private String codeSystem = "http://snomed.info/sct";
	private  CodeSystem snomedCodeSystem;
	private static String SNOMED_ROOT_ID = "138875005";
	
	private String serviceURL = SERVICE_URL;
	
	/* key = code system URI */
//	private Map<String,CodeSystem> codeSystemMap = new HashMap<String,CodeSystem>();

	private List<CodeSystem> codeSystems = new ArrayList<CodeSystem>();

	/* key = conceptId for all maps */
	private Map<String,ConceptDescriptor> conceptDescriptorMap = new HashMap<String,ConceptDescriptor>();
	private Map<String,Concept> conceptMap = new HashMap<String,Concept>();
	
	private TerminologyCache() {
		initializeCodeSystems();
	}

	public static TerminologyCache getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new TerminologyCache();
		}
		return INSTANCE;
	}

	public void clear() {
		conceptDescriptorMap = new HashMap<String,ConceptDescriptor>();
		conceptMap = new HashMap<String,Concept>();
	}
	
	protected void initializeCodeSystems() {
		snomedCodeSystem = new CodeSystem("SNOMED CT", "http://snomed.info/sct", "138875005", "http://snomed.info/sct");
		CodeSystem loinc = new CodeSystem("LOINC", "http://loinc.org", null, "http://loinc.org/vs");
		CodeSystem ucum = new CodeSystem("UCUM", "http://unitsofmeasure.org/vs", null, "http://unitsofmeasure.org/vs");

		codeSystems.add(snomedCodeSystem);
		codeSystems.add(loinc);
		codeSystems.add(ucum);
		
//		codeSystemMap.put(snomedCodeSystem.getUri(), snomedCodeSystem);
	}

	public void setServiceURL(String serviceURL) {
		this.serviceURL = serviceURL;
	}

	public boolean isLicenseAgreement() {
		return licenseAgreement;
	}

	public void setLicenseAgreement(boolean licenseAgreement) {
		this.licenseAgreement = licenseAgreement;
	}

	public String getBaseURL() {
		return serviceURL;
	}
	
	public List<CodeSystem> getCodeSystems() {
		return codeSystems;
	}

	public List<Concept> getRootConcepts() throws IOException {
		return getRootConcepts(snomedCodeSystem);
	}
	
	public List<Concept> getRootConcepts(CodeSystem codeSystem) throws IOException {
		List<Concept> rootConcepts = new ArrayList<Concept>();
		if (codeSystem.getRootConceptCode() != null) {
			rootConcepts.add(getConcept(codeSystem.getRootConceptCode()));
		}
		return rootConcepts;
	}

	public ConceptDescriptor getSharedDescriptor(ConceptDescriptor descriptor) throws IOException {
		if (descriptor == null) {
			return null;
		}
		ConceptDescriptor shared = conceptDescriptorMap.get(descriptor.getConceptId());
		if (shared == null) {
			conceptDescriptorMap.put(descriptor.getConceptId(), descriptor);
			shared = descriptor;
		}
		return shared;
	}
	
	public ConceptDescriptor getConceptDescriptor(String conceptId) throws IOException {
		ConceptDescriptor conceptDescriptor = conceptDescriptorMap.get(conceptId);
		
		if (conceptDescriptor == null) {
			conceptDescriptor = getConcept(conceptId);
			conceptDescriptorMap.put(conceptId, conceptDescriptor);
		}
		return conceptDescriptor;
	}

	public Concept getConcept(String conceptId) throws IOException {
		return getConcept(snomedCodeSystem, conceptId);
	}
	
	public Concept getConcept(CodeSystem codeSystem, String conceptId) throws IOException {
		Concept concept = conceptMap.get(conceptId);
		if (concept != null) {
			return concept;
		}

			String serviceURL = getBaseURL() + "CodeSystem/$lookup?_format=xml&system=" + codeSystem.getUri() + "&code=" + conceptId;
			System.out.println(serviceURL);
			
			// create Ecore URI and load resource
			InputStream inputStream = getInputStream(serviceURL);

			URI resourceURI = URI.createURI(serviceURL);
			ResourceFactoryImpl resourceFactory = new FhirResourceFactoryImpl();
			Resource resource = resourceFactory.createResource(resourceURI);
			try {
				resource.load(inputStream, new HashMap<String,String>());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			inputStream.close();
			
			concept = new Concept();
			concept.setConceptId(conceptId);
			concept.setCodeSystem(codeSystem.getUri());
			conceptMap.put(conceptId, concept);

			TreeIterator<?> iterator = EcoreUtil.getAllContents(Collections.singletonList(resource));
			while (iterator != null && iterator.hasNext()) {
				Object element = iterator.next();
				if (element instanceof ParametersParameter) {
					ParametersParameter parameter = (ParametersParameter) element;
					if ("display".equals(parameter.getName().getValue())) {
						concept.setDefaultTerm(parameter.getValueString().getValue());
						concept.setFsn(parameter.getValueString().getValue());
					}
					else if ("Parent".equals(parameter.getName().getValue())) {
						ConceptDescriptor parent = createDescriptor(parameter);
						concept.getParents().add(parent);
					}
					else if ("Child".equals(parameter.getName().getValue())) {
						ConceptDescriptor child = createDescriptor(parameter);
						concept.getChildren().add(child);
					}
				}
			}
		
		return concept;
	}
	
	private ConceptDescriptor createDescriptor(ParametersParameter parameter) {
		ConceptDescriptor concept = new ConceptDescriptor();
		for (ParametersParameter part : parameter.getPart()) {
			String value = part.getValueString().getValue();
			if ("Code".equals(part.getName().getValue())) {
				concept.setConceptId(value);
			}
			if ("Display".equals(part.getName().getValue())) {
				concept.setDefaultTerm(value);
			}
		}
		
		return concept;
	}

	public List<ConceptDescriptor> searchDescriptions(CodeSystem codeSystem, String parentConceptId, String matchText) throws IOException {
		List<ConceptDescriptor> results = new ArrayList<ConceptDescriptor>();
		
		if (matchText == null || matchText.trim().length() == 0) {
			return results;
		}
		
		String identifier = null;
		if (snomedCodeSystem.getUri().equals(codeSystem.getUri())) {
			if (parentConceptId == null || parentConceptId.length() == 0) {
				parentConceptId = SNOMED_ROOT_ID;
			}
			identifier = snomedCodeSystem.getUri() + "?fhir_vs=isa/" + parentConceptId;
		}
		else {
			identifier = codeSystem.getAllConceptsValueSetURI();
		}

		// /ValueSet$expand?identifier=http://snomed.info/sct?fhir_vs=isa/404684003&filter=blood pressure
		String serviceURL = getBaseURL() + "ValueSet/$expand?_format=xml&";
		String expandArgs = "identifier=" + encodeURL(identifier) +"&filter=" + encodeURL(matchText.trim());
		serviceURL += expandArgs;
		
		// create Ecore URI and load resource
		InputStream inputStream = getInputStream(serviceURL);

		URI resourceURI = URI.createURI(serviceURL);
		ResourceFactoryImpl resourceFactory = new FhirResourceFactoryImpl();
		Resource resource = resourceFactory.createResource(resourceURI);
		try {
			resource.load(inputStream, new HashMap<String,String>());
			inputStream.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// returns a ValueSet with expansion containing the search results
		TreeIterator<?> iterator = EcoreUtil.getAllContents(Collections.singletonList(resource));
		while (iterator != null && iterator.hasNext()) {
			Object element = iterator.next();
			if (element instanceof ValueSet && ((ValueSet) element).getExpansion() != null) {
				for (ValueSetContains coding : ((ValueSet) element).getExpansion().getContains()) {
					ConceptDescriptor concept = new ConceptDescriptor();
					if (coding.getSystem() != null) {
						concept.setCodeSystem(coding.getSystem().getValue());
					}
					if (coding.getCode() != null) {
						concept.setConceptId(coding.getCode().getValue());
					}
					if (coding.getDisplay() != null) {
						concept.setDefaultTerm(coding.getDisplay().getValue());
					}
					
					results.add(concept);
				}
			}
		}
		
		/*
		//remove duplicates (match multiple descriptions from same concept)
		Set<String> conceptIds = new HashSet<String>();
		for (ConceptDescriptor searchConcept : searchResult.getMatches()) {
			if (!conceptIds.contains(searchConcept.getConceptId())) {
				conceptIds.add(searchConcept.getConceptId());
				results.add(searchConcept);
			}
		}
		*/

		return results;
	}

	public Enumeration expandValueSetWithId(String valueSetId) throws IOException {
		Enumeration umlEnumeration = null;

		String serviceURL = getBaseURL() + "ValueSet/" + valueSetId + "/$expand?_format=xml&limitedExpansion=true";

		// create Ecore URI and load resource
		InputStream inputStream = getInputStream(serviceURL);

		URI resourceURI = URI.createURI(serviceURL);
		ResourceFactoryImpl resourceFactory = new FhirResourceFactoryImpl();
		Resource resource = resourceFactory.createResource(resourceURI);
	
		resource.load(inputStream, new HashMap<String,String>());
		inputStream.close();

		// returns a ValueSet with expansion
		TreeIterator<?> iterator = EcoreUtil.getAllContents(Collections.singletonList(resource));
		while (iterator != null && iterator.hasNext()) {
			Object element = iterator.next();
			if (element instanceof ValueSet && ((ValueSet) element).getExpansion() != null) {
				ValueSet fhirValueSet = (ValueSet) element;
				Package umlPackage = FHIRModelFactory.createFHIRModel();
				
				ModelImporter modelImporter = new ModelImporter(umlPackage);
				umlEnumeration = modelImporter.importValueSet(fhirValueSet);
				
//				umlEnumeration = umlPackage.createOwnedEnumeration(fhirValueSet.getName().getValue());
//				for (ValueSetContains contains : fhirValueSet.getExpansion().getContains()) {
//					if (contains.getCode() != null) {
//						EnumerationLiteral member = umlEnumeration.createOwnedLiteral(contains.getCode().getValue());
//					}
//				}
			}
		}
		
		return umlEnumeration;
	}

	public Enumeration expandValueSetWithUri(String valueSetURI) throws IOException {
		Enumeration umlEnumeration = null;

		String serviceURL = getBaseURL() + "ValueSet/$expand?_format=xml&limitedExpansion=true&";
		String expandArgs = "identifier=" + encodeURL(valueSetURI);
		serviceURL += expandArgs;

		// create Ecore URI and load resource
		InputStream inputStream = getInputStream(serviceURL);

		URI resourceURI = URI.createURI(serviceURL);
		ResourceFactoryImpl resourceFactory = new FhirResourceFactoryImpl();
		Resource resource = resourceFactory.createResource(resourceURI);
	
		resource.load(inputStream, new HashMap<String,String>());
		inputStream.close();

		// returns a ValueSet with expansion
		TreeIterator<?> iterator = EcoreUtil.getAllContents(Collections.singletonList(resource));
		while (iterator != null && iterator.hasNext()) {
			Object element = iterator.next();
			if (element instanceof ValueSet && ((ValueSet) element).getExpansion() != null) {
				ValueSet fhirValueSet = (ValueSet) element;
				Package umlPackage = FHIRModelFactory.createFHIRModel();
				
				ModelImporter modelImporter = new ModelImporter(umlPackage);
				umlEnumeration = modelImporter.importValueSet(fhirValueSet);
				
//				umlEnumeration = umlPackage.createOwnedEnumeration(fhirValueSet.getName().getValue());
//				for (ValueSetContains contains : fhirValueSet.getExpansion().getContains()) {
//					if (contains.getCode() != null) {
//						EnumerationLiteral member = umlEnumeration.createOwnedLiteral(contains.getCode().getValue());
//					}
//				}
			}
		}
		
		return umlEnumeration;
	}

	private static InputStream getInputStream(String urlString) throws IOException {
		URL url = new URL(urlString);
		HttpURLConnection connection =  (HttpURLConnection) url.openConnection();
		InputStream inputStream = connection.getInputStream();
        return inputStream;
	}

	private static Reader getReader(String urlString) throws IOException {
		InputStream inputStream = getInputStream(urlString);
        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
        return reader;
	}

	private String encodeURL(String text) {
		try {
			return URLEncoder.encode(text, "UTF-8");
		} catch (UnsupportedEncodingException e) {
			// should not occur, but use original matchText
			return "";
		}
	}
}
