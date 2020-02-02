import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.hl7.knowledgeartifact.r1.KnowledgeDocument;
import org.hl7.knowledgeartifact.r1.R1Factory;
import org.hl7.knowledgeartifact.r1.util.R1ResourceFactoryImpl;

public class TestKNART {

	public static void main(String[] args) {

		
		R1ResourceFactoryImpl R1ResourceFactoryImpl = new R1ResourceFactoryImpl();
		
		

		ResourceSet resourceSet = new ResourceSetImpl();
//		R1ResourceFactoryImpl.

		URI uri = URI.createURI("afile.r1");
		
		Resource resource = R1ResourceFactoryImpl.createResource(uri);
//		R1Factory.
		

		KnowledgeDocument kd = R1Factory.eINSTANCE.createKnowledgeDocument();
		
//		Resource xtextResource = resourceSet.getResource(uri, true);

//		EcoreUtil.resolveAll(xtextResource);

		 
		resource.getContents().add(kd);
		try {
			resource.save(null);
//			System.out.println("Saved " + outputM);
	    	System.out.println("QueryIT file converted successfully to XMI");
	    	System.out.println("-------------------------------------");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
