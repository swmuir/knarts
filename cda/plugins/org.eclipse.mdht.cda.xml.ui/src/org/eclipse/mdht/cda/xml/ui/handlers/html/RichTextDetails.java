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

import java.util.Map;

import org.apache.poi.ss.usermodel.Font;

public class RichTextDetails {
	private String richText;

	private Map<Integer, Font> fontMap;

	public RichTextDetails(String richText, Map<Integer, Font> fontMap2) {
		this.richText = richText;
		this.fontMap = fontMap2;
	}

	public String getRichText() {
		return richText;
	}

	public void setRichText(String richText) {
		this.richText = richText;
	}

	public Map<Integer, Font> getFontMap() {
		return fontMap;
	}

	public void setFontMap(Map<Integer, Font> fontMap) {
		this.fontMap = fontMap;
	}

	@Override
	public int hashCode() {

		// The goal is to have a more efficient hashcode than standard one.
		return richText.hashCode();
	}
}
