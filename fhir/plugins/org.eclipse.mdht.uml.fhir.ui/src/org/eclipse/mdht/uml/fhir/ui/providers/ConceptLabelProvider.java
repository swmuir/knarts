package org.eclipse.mdht.uml.fhir.ui.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.mdht.uml.fhir.common.terminology.Concept;
import org.eclipse.mdht.uml.fhir.common.terminology.ConceptDescriptor;
import org.eclipse.mdht.uml.fhir.common.terminology.Description;
import org.eclipse.mdht.uml.fhir.transform.TerminologyUtil;
import org.eclipse.mdht.uml.fhir.ui.Activator;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.statushandlers.StatusManager;

/**
 * @author <a href="mailto:dcarlson@xmlmodeling.com">Dave Carlson (XMLmodeling.com)</a> 
 */

public class ConceptLabelProvider extends LabelProvider implements ITableLabelProvider {

	private boolean useFSN = false;

	public ConceptLabelProvider() {
		
	}

	public ConceptLabelProvider(boolean useFSN) {
		this.useFSN = useFSN;
	}

	protected Object unwrap(Object object) {
		ConceptDescriptor concept = null;
		Object value = null;
		
		if (object instanceof ConceptDescriptor) {
			concept = (ConceptDescriptor) object;
		} else if (object instanceof IAdaptable) {
			concept = (ConceptDescriptor) ((IAdaptable) object).getAdapter(ConceptDescriptor.class);
		} else {
			value = object;
		}
		
		return value != null ? value : concept;
	}
	
	@Override
	public String getText(Object obj) {
		String text = null;
		
		if (obj instanceof ConceptItem && ((ConceptItem)obj).getLabel() != null) {
			text = ((ConceptItem)obj).getLabel();
		}
		
		if (text == null) {
			Object element = unwrap(obj);
	
			try {
				if (element instanceof Concept) {
					if (useFSN) {
						text = ((Concept) element).getFsn();
					}
					else {
						text = TerminologyUtil.getPreferredSynonym((Concept) element);
					}
					
					if (text == null) {
						text = ((Concept) element).getFsn();
					}
					
				}
				else if (element instanceof ConceptDescriptor) {
					text = ((ConceptDescriptor)element).getDefaultTerm();
//					text = TerminologyUtil.removeSemanticTag(text);
					
				} else if (element instanceof Description) {
					text = ((Description) element).getTerm();
				}

				if (obj instanceof ConceptItem) {
					((ConceptItem)obj).setLabel(text);
				}
			} catch (Exception e) {
				StatusManager.getManager().handle(new Status(IStatus.ERROR, Activator.PLUGIN_ID, "Cannot get label text", e), 
						StatusManager.SHOW | StatusManager.LOG);
			}
		}

		return text;
	}

	@Override
	public Image getImage(Object obj) {
		Object element = unwrap(obj);

		if (element instanceof ConceptDescriptor) {
			return Activator.getDefault().getBundledImage("icons/obj16/Concept.gif");
		}
		else if (element instanceof Description) {
			return Activator.getDefault().getBundledImage("icons/obj16/Description.gif");
		}
//		else if (element instanceof Relationship) {
//			return Activator.getDefault().getBundledImage("icons/obj16/Relationship.gif");
//		}
		return null;
	}

	@Override
	public Image getColumnImage(Object obj, int columnIndex) {
		Object element = unwrap(obj);
		if (element instanceof Description) {
			Description description = (Description) element;
			
		}
//		else if (element instanceof Relationship) {
//			Relationship relationship = (Relationship) element;
//			switch (columnIndex) {
//			case 1: {
//				return getImage(relationship.getTarget());
//			}
//			default:
//				return  null;
//			}
//		}
//		else if (element instanceof RefsetMembership) {
//			RefsetMembership membership = (RefsetMembership) element;
//			switch (columnIndex) {
//			case 0: {
//				return getImage(membership.getRefset());
//			}
//			default:
//				return null;
//			}
//		}
		else if (element instanceof ConceptDescriptor) {
			ConceptDescriptor concept = (ConceptDescriptor) element;

			switch (columnIndex) {
				case 0: {
					return getImage(concept);
				}
				default:
					return null;
			}
		}
		
		return null;
	}

	@Override
	public String getColumnText(Object obj, int columnIndex) {
		Object element = unwrap(obj);
		
		try {
			/*
			if (element instanceof Description) {
				Description description = (Description) element;
	
				switch (columnIndex) {
					case 0: {
						return description.getTerm();
					}
					case 1: {
						// Type
						Concept type = TerminologyCache.getInstance().getConcept(description.getType().getConceptId());
						return TerminologyUtil.getPreferredSynonym(type);
					}
					case 2: {
						//TODO get acceptability for getLang()
						// Acceptability
						if (description.getLangMemberships() != null) {
							for (LangMembership langMembership : description.getLangMemberships()) {
								Concept acceptability = TerminologyCache.getInstance().getConcept(langMembership.getAcceptability().getConceptId());
								return TerminologyUtil.getPreferredSynonym(acceptability);
							}
						}
						return null;
					}
					case 3: {
						// Language
						return description.getLang();
					}
					default:
						return null;
				}
			}
			else 
			*/
			if (element instanceof ConceptDescriptor) {
				ConceptDescriptor concept = (ConceptDescriptor) element;
	
				switch (columnIndex) {
					case 0: {
						return concept.getDefaultTerm();
					}
					default:
						return null;
				}
			}
		}
		catch(Exception e) {
			StatusManager.getManager().handle(new Status(IStatus.ERROR, Activator.PLUGIN_ID, "Cannot get column label text", e), 
					StatusManager.SHOW | StatusManager.LOG);
		}
		
		return getText(element);
	}

}