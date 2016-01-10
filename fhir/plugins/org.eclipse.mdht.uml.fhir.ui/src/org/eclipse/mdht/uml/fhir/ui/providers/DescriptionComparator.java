package org.eclipse.mdht.uml.fhir.ui.providers;

import java.util.Comparator;

import org.eclipse.mdht.uml.fhir.common.terminology.ConceptDescriptor;

public class DescriptionComparator implements Comparator<ConceptDescriptor> {

	private ConceptLabelProvider labelProvider = new ConceptLabelProvider();
	
	@Override
	public int compare(ConceptDescriptor c1, ConceptDescriptor c2) {
		String label1 = labelProvider.getText(c1);
		String label2 = labelProvider.getText(c2);
		
		if (label1 != null && label2 != null) {
			return label1.compareToIgnoreCase(label2);
		}
		
		return 0;
	}

}
