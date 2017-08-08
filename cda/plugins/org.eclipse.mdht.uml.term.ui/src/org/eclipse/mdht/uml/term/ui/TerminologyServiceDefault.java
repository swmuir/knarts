package org.eclipse.mdht.uml.term.ui;

import java.util.ArrayList;

public class TerminologyServiceDefault implements TerminologyService {

	public TerminologyServiceDefault() {

	}

	@Override
	public ArrayList<String> getValueSets() {
		ArrayList<String> results = new ArrayList<String>();
		results.add("asdfasdfasf");
		results.add("1asdfasdfasf");
		results.add("2asdfasdfasf");
		results.add("3asdfasdfasf");
		results.add("4asdfasdfasf");
		results.add("5asdfasdfasf");
		results.add("6asdfasdfasf");

		return results;
	}

}
