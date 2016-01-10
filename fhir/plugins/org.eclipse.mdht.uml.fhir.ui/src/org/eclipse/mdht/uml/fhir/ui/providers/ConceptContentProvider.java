package org.eclipse.mdht.uml.fhir.ui.providers;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.mdht.uml.fhir.common.terminology.Concept;
import org.eclipse.mdht.uml.fhir.common.terminology.ConceptDescriptor;
import org.eclipse.mdht.uml.fhir.transform.TerminologyCache;
import org.eclipse.mdht.uml.fhir.ui.Activator;
import org.eclipse.ui.IViewSite;
import org.eclipse.ui.statushandlers.StatusManager;

public class ConceptContentProvider implements IStructuredContentProvider, ITreeContentProvider {
	public ConceptContentProvider() {
	}
	
	public void inputChanged(Viewer v, Object oldInput, Object newInput) {
	}

	public void dispose() {
	}

	public Object[] getElements(Object parent) {
		if (parent instanceof IViewSite || parent == null) {
			List<ConceptItem> rootItems = new ArrayList<ConceptItem>();
			try {
				List<Concept> rootConcepts = TerminologyCache.getInstance().getRootConcepts();
				for (Concept rootConcept : rootConcepts) {
					rootItems.add(new ConceptItem(rootConcept, null));
				}
			}
			catch (IOException e) {
				StatusManager.getManager().handle(new Status(IStatus.ERROR, Activator.PLUGIN_ID, "Cannot get root concepts", e), 
						StatusManager.SHOW | StatusManager.LOG);
			}
			return rootItems.toArray();
		}
		return getChildren(parent);
	}

	public Object getParent(Object child) {
		if (child instanceof ConceptItem) {
			return ((ConceptItem) child).getParent();
		}
		return null;
	}

	public Object[] getChildren(Object parent) {
		if (parent instanceof ConceptItem) {
			ConceptDescriptor conceptDescriptor = ((ConceptItem) parent).getConceptDescriptor();
			if (conceptDescriptor != null) {
				try {
					Concept concept = TerminologyCache.getInstance().getConcept(conceptDescriptor.getConceptId());
					if (concept != null) {
						List<ConceptItem> childItems = new ArrayList<ConceptItem>();
						for (ConceptDescriptor child : concept.getChildren()) {
							ConceptItem item = new ConceptItem(child, (ConceptItem) parent);
							childItems.add(item);
						}
						return childItems.toArray();
					}
				} catch (Exception e) {
					StatusManager.getManager().handle(new Status(IStatus.ERROR, Activator.PLUGIN_ID, "Cannot get concept children", e), 
							StatusManager.SHOW | StatusManager.LOG);
				}
			}
		}
		return new Object[0];
	}

	public boolean hasChildren(Object parent) {
		boolean hasChildren = false;
		if (parent instanceof ConceptItem) {
			ConceptDescriptor concept = ((ConceptItem) parent).getConceptDescriptor();
			if (concept instanceof Concept) {
				hasChildren = ((Concept)concept).getChildren().size() > 0;
			}
			else {
				hasChildren = true;
			}
		}
		return hasChildren;
	}

}
