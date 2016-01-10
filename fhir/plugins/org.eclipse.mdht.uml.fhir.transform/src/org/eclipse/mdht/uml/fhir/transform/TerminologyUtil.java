package org.eclipse.mdht.uml.fhir.transform;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.mdht.uml.fhir.common.terminology.Concept;
import org.eclipse.mdht.uml.fhir.common.terminology.ConceptDescriptor;

/**
 * @author <a href="mailto:dcarlson@xmlmodeling.com">Dave Carlson (XMLmodeling.com)</a> 
 */
public class TerminologyUtil {
	public static final String ISA_ID = "116680003";
	public static final String SYNONYM_ID = "900000000000013009";
	public static final String FSN_ID = "900000000000003001";
	public static final String ACCEPTABILITY_PREFERRED_ID = "900000000000548007";

	/**
	 * Recursively collect all parents of given concept, but only first if multiple parents.
	 */
	public static List<ConceptDescriptor> getParentPath(ConceptDescriptor conceptDescriptor) throws IOException {
		return getParentPath(conceptDescriptor.getConceptId());
	}

	/**
	 * Recursively collect all parents of given concept ID, but only first if multiple parents.
	 */
	public static List<ConceptDescriptor> getParentPath(String conceptId) throws IOException {
		List<ConceptDescriptor> parents = new ArrayList<ConceptDescriptor>();
		Concept concept = TerminologyCache.getInstance().getConcept(conceptId);
		for (ConceptDescriptor parent : concept.getParents()) {
			ConceptDescriptor parentConcept = TerminologyCache.getInstance().getConceptDescriptor(parent.getConceptId());
			parents.add(parentConcept);
			parents.addAll(getParentPath(parent));
			break;
		}
		
		return parents;
	}
	
	public static String getPreferredSynonym(Concept concept) {
		//TODO
		return removeSemanticTag(concept.getFsn());
	}

	public static String getSemanticTag(Concept concept) {
		return getSemanticTag(concept.getFsn());
	}

	public static String getSemanticTag(ConceptDescriptor concept) {
		return getSemanticTag(concept.getDefaultTerm());
	}

	public static String getSemanticTag(String fsn) {
		String semTag = "";
		int startIdx = fsn.indexOf("(");
		int endIdx = fsn.indexOf(")");
		if (startIdx != -1 && endIdx != -1) {
			semTag = fsn.substring(startIdx+1, endIdx);
		}
		
		return semTag;
	}

	public static String removeSemanticTag(String fsn) {
		String name = fsn;
		int startIdx = fsn.indexOf("(");
		if (startIdx != -1) {
			name = fsn.substring(0, startIdx-1);
		}
		
		return name;
	}
}
