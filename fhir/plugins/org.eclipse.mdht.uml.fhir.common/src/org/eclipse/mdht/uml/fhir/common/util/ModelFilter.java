/*******************************************************************************
 * Copyright (c) 2015 David A Carlson.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David A Carlson (Clinical Cloud Solutions, LLC) - initial API and implementation
 *******************************************************************************/
package org.eclipse.mdht.uml.fhir.common.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ModelFilter {
	
	public enum DefinitionType {
		DefinedType,
		ConstraintProfile,		// omit core defined type structure definitions
		Extension,
		StructureDefinition,	// any structure definition resource
		ValueSet,
//		DataElement,
		ImplementationGuide
	}

	public static DefinitionType[] ALL_TYPES = {DefinitionType.DefinedType, DefinitionType.ConstraintProfile, 
			DefinitionType.Extension, DefinitionType.ValueSet, /*DefinitionType.DataElement, */DefinitionType.ImplementationGuide};

	public static DefinitionType[] DEFINED_TYPES = {DefinitionType.DefinedType};
	
	public static DefinitionType[] PROFILE_TYPES = {DefinitionType.ConstraintProfile};

	private List<DefinitionType> filterTypes = new ArrayList<DefinitionType>();
	
	private ModelIndexer modelIndexer;
	
	private boolean includeReferencedValueSets = false;
	
	/*
	 * The default filter selects everything.
	 */
	public ModelFilter() {
	}

	public ModelFilter(List<DefinitionType> types) {
		this();
		filterTypes.addAll(types);
	}

	public ModelFilter(DefinitionType[] types) {
		this(Arrays.asList(types));
	}

	public boolean isIncludeReferencedValueSets() {
		return includeReferencedValueSets;
	}

	public void setIncludeReferencedValueSets(boolean includeReferencedValueSets) {
		this.includeReferencedValueSets = includeReferencedValueSets;
	}

	public List<DefinitionType> getFilterTypes() {
		return filterTypes;
	}
	
	public void setModelIndexer(ModelIndexer indexer) {
		this.modelIndexer = indexer;
	}
	
	public boolean select(DefinitionType type) {
		// empty filter list accepts everything
		return filterTypes.isEmpty() || filterTypes.contains(type);
	}
	
	public boolean select(Object element) {
		if (modelIndexer != null) {
			
		}
		
		return false;
	}
	
}
