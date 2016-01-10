package org.eclipse.mdht.uml.fhir.common.terminology;

import java.util.ArrayList;
import java.util.List;

public class Concept extends ConceptDescriptor {

	String fsn;
	boolean isLeaf;
	List<Description> descriptions = new ArrayList<Description>();
	List<ConceptDescriptor> parents = new ArrayList<ConceptDescriptor>();
	List<ConceptDescriptor> children = new ArrayList<ConceptDescriptor>();

	public Concept() {
	}

	public String getFsn() {
		return fsn;
	}

	public void setFsn(String fsn) {
		this.fsn = fsn;
	}

	public boolean isLeaf() {
		return isLeaf;
	}

	public void setLeaf(boolean isLeaf) {
		this.isLeaf = isLeaf;
	}

	public List<Description> getDescriptions() {
		return descriptions;
	}

	public void setDescriptions(List<Description> descriptions) {
		this.descriptions = descriptions;
	}

	public List<ConceptDescriptor> getParents() {
		return parents;
	}

	public void setParents(List<ConceptDescriptor> parents) {
		this.parents = parents;
	}

	public List<ConceptDescriptor> getChildren() {
		return children;
	}

	public void setChildren(List<ConceptDescriptor> children) {
		this.children = children;
	}

}
