package gov.knart2fhir.transformation.service.web;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.BasicExtendedMetaData;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.ExtendedMetaData;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceImpl;
import org.eclipse.m2m.qvt.oml.BasicModelExtent;
import org.eclipse.m2m.qvt.oml.ExecutionContext;
import org.eclipse.m2m.qvt.oml.ExecutionContextImpl;
import org.eclipse.m2m.qvt.oml.ExecutionDiagnostic;
import org.eclipse.m2m.qvt.oml.ModelExtent;
import org.eclipse.m2m.qvt.oml.TransformationExecutor;
import org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage;
import org.hl7.elm.r1.R1Package;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.io.ClassPathResource;
import org.w3._1999.xhtml.XhtmlPackage;

public class Knart2FhirAPI {

	private static Logger logger = LoggerFactory.getLogger(Knart2FhirAPI.class);

	public static void main3(String[] args) {

		// DatatypesPackage.eINSTANCE.getDataType();

		ResourcesPackage.eINSTANCE.getAccount();

		R1Package.eINSTANCE.getAbs();

		URI foo = URI.createFileURI(
			"/Users/seanmuir/mdhtcleanup/knarts/knarts/plugins/gov.hl7.knart2fhir.transformation/transforms/Knart2FHIR.qvto");

		TransformationExecutor executor = new TransformationExecutor(foo);

		// executor.

		Diagnostic diagnostic = executor.loadTransformation();

		ExecutionContext executionContext = new ExecutionContextImpl();

		// executionContext.

		ModelExtent modelParameters = new BasicModelExtent();
		;
		executor.execute(executionContext, modelParameters);

		System.out.println(diagnostic);

	}

	private URI getUri(final String filename) {
		URL url;
		try {
			url = new ClassPathResource(filename).getURL();
			return URI.createURI(url.toString());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		// URI foo = URI.createFileURI(filename);
		// return foo;
	}

	public EPackage readEPackage(final String ecoreFilename) {
		final ResourceSet resourceSet = new ResourceSetImpl();
		final ExtendedMetaData extendedMetaData = new BasicExtendedMetaData(resourceSet.getPackageRegistry());
		resourceSet.getLoadOptions().put(XMLResource.OPTION_EXTENDED_META_DATA, extendedMetaData);
		final Resource resource = resourceSet.getResource(getUri(ecoreFilename), true);
		final EObject eObject = resource.getContents().get(0);

		return (EPackage) eObject;
	}

	public void registerEPackage(EPackage ePackage) {
		EPackage.Registry.INSTANCE.put(ePackage.getNsURI(), ePackage);

		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(
			"*.r1", new org.hl7.knowledgeartifact.r1.util.R1ResourceFactoryImpl());
	}

	public String transform(final String transformFilename, final Resource resource) {

		// URIUnitResolver asdf = new URIUnitResolver();;

		// getClass().getResource(GAME_FILE);

		logger.info("START transform");

		// URI fURI = URI.createURI(transformFilename, false); // .createFileURI("foobar");
		// UnitProxy proxy = UnitResolverFactory.Registry.INSTANCE.getUnit(fURI);

		// URI unitURI = URI.createURI(transformFilename).resolve(URI.createURI(""));

		// URI.createHierarchicalURI(scheme, authority, device, query, fragment)
		// final URI transformUri = URI.createURI(this.getClass().getResource("/" + transformFilename).toString());

		// jar:file:/gov.knart2fhir.transformation.service.jar!/BOOT-INF/classes!/Knart2FHIR.qvto

		final URI transformUri = URI.createURI("file:/transformation/Knart2FHIR.qvto");

		// URL xxx = transformUri.getClass().getResource("classpath:/" + transformFilename);
		//
		// URL yyy = this.getClass().getResource("/" + transformFilename);

		// BasicRegistry asdf;

		// logger.info(BasicRegistry.INSTANCE.getUnit(transformUri).toString());

		// logger.info("START yyy = " + yyy.toString());

		logger.info("START transformUri = " + transformUri.toString());

		logger.info("START transformUri = " + transformUri.toFileString());

		// getUri("classpath:" + transformFilename);
		final TransformationExecutor executor = new TransformationExecutor(transformUri, EPackage.Registry.INSTANCE);
		final ExecutionContextImpl executionContext = new ExecutionContextImpl();
		// final URI mmaInstance = getUri(theResource);
		final ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(
			"r1", new org.hl7.knowledgeartifact.r1.util.R1ResourceFactoryImpl());

		// final Resource resource = resourceSet.getResource(mmaInstance, true);
		final EList<EObject> inputEObjectList = resource.getContents();
		final ModelExtent input = new BasicModelExtent(inputEObjectList);
		final ModelExtent output = new BasicModelExtent();
		executionContext.setConfigProperty("keepModeling", true);
		final ExecutionDiagnostic result = executor.execute(executionContext, input, output);
		if (result.getSeverity() == Diagnostic.OK) {

			//

			String serializedModel = null;

			//// ResourceSet resourceSet = new ResourceSetImpl();
			// resourceSet.getResourceFactoryRegistry().getProtocolToFactor yMap().put
			// ("*", new XMIResourceFactoryImpl());
			//
			// Resource resource =
			// resourceSet.createResource(URI.createURI("file://c:/somewhere/somefile.extension"));

			XMLResource fhirResource = new XMLResourceImpl(URI.createURI("bundle.xml"));

			// fhirResource.getContents().addAll(output.getContents());

			fhirResource.getContents().addAll(0, output.getContents());

			EcoreUtil.resolveAll(fhirResource);

			ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
			try {
				Map<String, Object> options = new HashMap<String, Object>();
				options.put(XMLResource.OPTION_ENCODING, "UTF8");

				options.put(XMLResource.OPTION_EXTENDED_META_DATA, Boolean.TRUE);
				// result.getDefaultLoadOptions().put(XMLResource.OPTION_EXTENDED_META_DATA, Boolean.TRUE);

				options.put(XMLResource.OPTION_SCHEMA_LOCATION, Boolean.TRUE);

				// result.getDefaultLoadOptions().put(XMLResource.OPTION_USE_ENCODED_ATTRIBUTE_STYLE, Boolean.TRUE);
				options.put(XMLResource.OPTION_USE_ENCODED_ATTRIBUTE_STYLE, Boolean.TRUE);

				// result.getDefaultLoadOptions().put(XMLResource.OPTION_USE_LEXICAL_HANDLER, Boolean.TRUE);

				// options.put( XMLResource.
				fhirResource.save(outputStream, options);
			} catch (IOException ioe) {
				ioe.printStackTrace();
			}

			serializedModel = outputStream.toString();

			serializedModel = serializedModel.replaceAll("fhiRCore.resources:", "");
			serializedModel = serializedModel.replaceAll("fhiRCore.dataTypes:Url", "");
			serializedModel = serializedModel.replaceAll("fhiRCore.dataTypes:Code", "");

			serializedModel = serializedModel.replaceAll("fhiRCore.dataTypes:Code", "");

			serializedModel = serializedModel.replaceAll(
				"xmlns:fhiRCore.dataTypes=\"http:///fhiRCore/dataTypes.ecore\"", "");

			serializedModel = serializedModel.replaceAll(
				"xmlns:fhiRCore.resources=\"http:///fhiRCore/resources.ecore\"", "");

			// xmlns:fhiRCore.dataTypes="http:///fhiRCore/dataTypes.ecore" xmlns:fhiRCore.resources:="http:///fhiRCore/resources.ecore"' value="" >
			/*
			 *
			 * <replace dir="fhirbundles" token="fhiRCore.resources:" value="" >
			 * <include name="*.xml"/>
			 *
			 * </replace>
			 *
			 * <replace dir="fhirbundles" token='xsi:type="fhiRCore.dataTypes:Url"' value="" >
			 * <include name="*.xml"/>
			 *
			 * </replace>
			 *
			 * <replace dir="fhirbundles" token='xsi:type="fhiRCore.dataTypes:Code"' value="" >
			 * <include name="*.xml"/>
			 *
			 * </replace>
			 *
			 * <replace dir="fhirbundles" token='xmlns:fhiRCore.dataTypes="http:///fhiRCore/dataTypes.ecore"
			 * xmlns:fhiRCore.resources:="http:///fhiRCore/resources.ecore"' value="" >
			 * <include name="*.xml"/>
			 *
			 * </replace>
			 *
			 * <replace dir="fhirbundles" token='xmlns:fhiRCore.resources:="http:///fhiRCore/resources.ecore"' value="" >
			 * <include name="*.xml"/>
			 *
			 * </replace>
			 *
			 * <replace dir="fhirbundles" token='&lt;xmi:XMI xmi:version="2.0" xmlns:xmi="http://www.omg.org/XMI" &gt;' value="" >
			 * <include name="*.xml"/>
			 *
			 * </replace>
			 *
			 *
			 * <replace dir="fhirbundles" token='xmlns:fhiRCore.dataTypes="http:///fhiRCore/dataTypes.ecore"' value="" >
			 * <include name="*.xml"/>
			 *
			 * </replace>
			 *
			 * <replace dir="fhirbundles" token='xmlns:fhiRCore.resources="http:///fhiRCore/resources.ecore"' value="" >
			 * <include name="*.xml"/>
			 *
			 * </replace>
			 *
			 *
			 *
			 */
			return serializedModel;

			// System.out.println(serializedModel);

			//
			// XMLResource fhirResource = new XMLResourceImpl();
			// List<EObject> outputEObjectList = output.getContents();
			// for (EObject eObject : outputEObjectList) {
			// fhirResource.getContents().add(eObject);
			//// eObject.getClass();
			// }
			//
			//
			//// ResourceSet resourceSet = new ResourceSetImpl();
			//// Resource resource = resourceSet.createResource( uri );
			//// resource.getContents().add( this.jsdlDR );
			// Map<String, Object> options = new HashMap<String, Object>();
			// options.put( XMLResource.OPTION_ENCODING, "UTF8" ); //$NON-NLS-1$
			//// ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
			//// try {
			//// resource.save(options);
			//// } catch( IOException e ) {
			//// Activator.logException( e );
			//// }
			//
			//
			// StringWriter stringWriter = new StringWriter();
			// try {
			// fhirResource.save(new URIConverter.WriteableOutputStream(stringWriter, fhirResource.getEncoding()), options);
			// } catch( IOException e ) {
			//// Activator.logException( e );
			// }
			// String aaa = stringWriter.getBuffer().toString();
			// System.out.println(aaa);
			////
			//
			//

		}

		return "";
	}

	public static void initTestEcore() {
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("ecore", new EcoreResourceFactoryImpl());
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("mma", new XMIResourceFactoryImpl());
	}

	public static void main(String[] args) {
		// initTestEcore();
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
		// knart2FhirAPI.transform("Knart2FHIR.qvto", "test/EyeKNART.r1");
	}
}
