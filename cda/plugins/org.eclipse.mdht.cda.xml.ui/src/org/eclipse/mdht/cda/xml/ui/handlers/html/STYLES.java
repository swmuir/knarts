/*******************************************************************************
 *
 * Copyright (c) 2018 michaelcgood
 * https://github.com/michaelcgood/HTML-to-Apache-POI-RichTextString/blob/master/LICENSE.
  *
 * Contributors:
 *     michaelcgood - initial API and implementation
 *
 *******************************************************************************/
package org.eclipse.mdht.cda.xml.ui.handlers.html;

public enum STYLES {
	BOLD("b"), EM("em"), STRONG("strong"), COLOR("color"), UNDERLINE("u"), SPAN("span"), ITALLICS("i"), UNKNOWN(
			"unknown"), PRE("pre");

	private String type;

	private STYLES(String type) {
		this.type = type;
	}

	public String getType() {
		return type;
	}

	public static STYLES fromValue(String type) {
		for (STYLES style : values()) {
			if (style.type.equalsIgnoreCase(type)) {
				return style;
			}
		}
		return UNKNOWN;
	}
}
