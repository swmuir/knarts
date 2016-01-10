package org.eclipse.mdht.uml.fhir.ui.dialogs;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.viewers.IFilter;
import org.eclipse.mdht.uml.fhir.common.terminology.ConceptDescriptor;
import org.eclipse.mdht.uml.fhir.ui.Activator;
import org.eclipse.mdht.uml.fhir.ui.internal.l10n.Messages;
import org.eclipse.mdht.uml.fhir.ui.providers.ConceptLabelProvider;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.dialogs.ElementListSelectionDialog;
import org.eclipse.ui.statushandlers.StatusManager;

/**
 * A dialog to select a concept from a list of concepts. The dialog does not allow
 * multiple selections.
 * 
 * @author <a href="mailto:dcarlson@xmlmodeling.com">Dave Carlson (XMLmodeling.com)</a> 
 */
public class ConceptListDialog extends ElementListSelectionDialog {
	
	private String inputTitle;
	private String inputMessage;
	
	private List<ConceptDescriptor> concepts = null;
	
	private IFilter filter = null;

	public ConceptListDialog(Shell shell) {
		this(shell, Messages.ConceptSelection_input_title, Messages.ConceptSelection_input_message, null);
	}

	public ConceptListDialog(Shell shell, String inputTitle, String inputMessage) {
		this(shell, inputTitle, inputMessage, null);
	}

	public ConceptListDialog(Shell shell, String inputTitle, String inputMessage, IFilter filter) {
		super(shell, new ConceptLabelProvider(true));

		setMultipleSelection(false);
		setTitle(Messages.ConceptSelection_dialog_title);
		setMessage(Messages.ConceptSelection_dialog_message);
		this.inputTitle = inputTitle;
		this.inputMessage = inputMessage;
		this.filter = filter;
	}
	
	public void setConceptList(List<ConceptDescriptor> concepts) {
		this.concepts = concepts;
	}

	/*
	 * @see Window#open()
	 */
	@Override
	public int open() {
		if (concepts == null) {
			try {
				ConceptSearchDialog searchDialog = new ConceptSearchDialog(getParentShell());
				searchDialog.open();
				concepts = searchDialog.getResults();
	
			} catch (Exception e) {
				StatusManager.getManager().handle(new Status(IStatus.ERROR, Activator.PLUGIN_ID, "Error in Query Services", e), 
						StatusManager.SHOW | StatusManager.LOG);
			}
		}
		
		if (concepts == null || concepts.isEmpty()) {
			return Dialog.CANCEL;
		}
			
		List<ConceptDescriptor> filteredConcepts = new ArrayList<ConceptDescriptor>();
		if (filter != null) {
			for (ConceptDescriptor searchConcept : concepts) {
				if (filter.select(searchConcept)) {
					filteredConcepts.add(searchConcept);
				}
			}
		}
		else {
			filteredConcepts = concepts;
		}

		setElements(filteredConcepts.toArray());
		
		return super.open();
	}

}
