package org.eclipse.mdht.uml.fhir.ui.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.mdht.uml.fhir.common.terminology.ConceptDescriptor;


/**
 * @author <a href="mailto:dcarlson@xmlmodeling.com">Dave Carlson (XMLmodeling.com)</a> 
 */
public class ConceptItem implements IAdaptable {
	private ConceptDescriptor conceptDescriptor = null;
	private ConceptItem parent = null;
	private String label = null;
	
	public ConceptItem(ConceptDescriptor concept, ConceptItem parent) {
		this.conceptDescriptor = concept;
		this.parent = parent;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof ConceptItem && ((ConceptItem)obj).getConceptDescriptor().getConceptId()
				.equals(conceptDescriptor.getConceptId())) {
			return true;
		}
		return super.equals(obj);
	}
	
	@Override
	public int hashCode() {
		return conceptDescriptor.getConceptId().hashCode();
	}
	
	public ConceptDescriptor getConceptDescriptor() {
		return conceptDescriptor;
	}

	public ConceptItem getParent() {
		return parent;
	}
	
	public String getLabel() {
		return label;
	}
	
	public void setLabel(String label) {
		this.label = label;
	}
	
	@SuppressWarnings("rawtypes")
	public Object getAdapter(Class key) {
		if (ConceptDescriptor.class.isAssignableFrom(key)) {
			return conceptDescriptor;
		}
		return null;
	}
	
	public void setConceptDescriptor(ConceptDescriptor concept) {
		this.conceptDescriptor = concept;
	}

}
