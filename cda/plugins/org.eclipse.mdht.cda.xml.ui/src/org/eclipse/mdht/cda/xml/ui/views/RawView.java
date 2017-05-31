/*******************************************************************************
 * Copyright (c) 2017 Sean Muir
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Sean Muir (JKM Software) - initial API and implementation
 *
 *******************************************************************************/
package org.eclipse.mdht.cda.xml.ui.views;

import java.io.ByteArrayOutputStream;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

import javax.xml.parsers.DocumentBuilderFactory;

import org.apache.commons.lang.StringEscapeUtils;
import org.apache.commons.lang.StringUtils;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.mdht.cda.xml.ui.editors.CDAAnalyzer;
import org.eclipse.mdht.uml.cda.Section;
import org.eclipse.mdht.uml.cda.util.CDAUtil;
import org.eclipse.swt.SWT;
import org.eclipse.swt.browser.Browser;
import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.events.DisposeListener;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.ui.IEditorReference;
import org.eclipse.ui.part.ViewPart;
import org.w3c.dom.Attr;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.bootstrap.DOMImplementationRegistry;
import org.w3c.dom.ls.DOMImplementationLS;
import org.w3c.dom.ls.LSSerializer;
import org.xml.sax.InputSource;

/**
 * @author seanmuir
 *
 */
public class RawView extends ViewPart {

	Browser browser;

	public static class StringComparator implements Comparator<String> {

		/*
		 * (non-Javadoc)
		 *
		 * @see java.util.Comparator#compare(java.lang.Object, java.lang.Object)
		 */
		@Override
		public int compare(String o1, String o2) {
			if (o1.length() > o2.length())
				return -1;

			if (o2.length() > o1.length())
				return 1;

			return 0;
		}
	};

	StringComparator stringComparator = new StringComparator();

	private String formatTagsAndAttributes(String xml, Set<String> tags, Set<String> attributes, Set<String> contents) {
		String newXML = xml;

		ArrayList<String> orderedTags = new ArrayList<String>();
		ArrayList<String> orderedAttributes = new ArrayList<String>();
		ArrayList<String> orderedContents = new ArrayList<String>();
		orderedTags.addAll(tags);
		orderedAttributes.addAll(attributes);
		orderedContents.addAll(contents);
		Collections.sort(orderedTags, stringComparator);
		Collections.sort(orderedAttributes, stringComparator);
		Collections.sort(orderedContents, stringComparator);

		newXML = newXML.replace("=&quot;", "=<span style=\"color:DodgerBlue\">&quot;").replace(
			"&quot;/&gt;", "&quot;</span>/&gt;").replace("&quot;&gt;", "&quot;</span>&gt;").replace(
				"&quot; ", "&quot;</span> ");

		for (String tag : orderedTags) {
			newXML = newXML.replace("&lt;" + tag, "<span style=\"color:green\">&lt;" + tag + "</span>").replace(
				"&lt;/" + tag + "&gt;", "<span style=\"color:green\">&lt;/" + tag + "&gt;</span>");
		}

		for (String attribute : orderedAttributes) {
			newXML = newXML.replace(attribute + "=", "<span style=\"color:IndianRed\">" + attribute + "=</span>");
		}

		// for (String content : orderedContents) {
		// if (!StringUtils.isEmpty(content)) {
		// newXML = newXML.replace(content, "<span style=\"color:DodgerBlue\">" + content + "</span>");
		// }
		// }

		return newXML;

	}

	private void populate(Node node, Set<String> nodes, Set<String> attributes, Set<String> contents) {
		NodeList nl = node.getChildNodes();

		NamedNodeMap nodeMap = node.getAttributes();

		if (nodeMap != null) {
			int numAttrs = nodeMap.getLength();

			for (int i = 0; i < numAttrs; i++) {
				Attr attr = (Attr) nodeMap.item(i);

				String attrName = attr.getNodeName();

				attributes.add(attrName);
			}
		}

		for (int i = 0; i < nl.getLength(); i++) {
			if ("#text".equals(nl.item(i).getNodeName())) {
				contents.add(nl.item(i).getTextContent().trim());
			}
			nodes.add(nl.item(i).getNodeName());
			populate(nl.item(i), nodes, attributes, contents);
		}
	}

	private String formatSection(String sectionxml, Set<String> nodes, Set<String> attributes, Set<String> contents) {
		try {
			final InputSource inputSource = new InputSource(new StringReader(sectionxml));
			final Node document = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(
				inputSource).getDocumentElement();
			final Boolean keepDeclaration = Boolean.valueOf(sectionxml.startsWith("<?xml"));
			final DOMImplementationRegistry registry = DOMImplementationRegistry.newInstance();
			final DOMImplementationLS impl = (DOMImplementationLS) registry.getDOMImplementation("LS");
			final LSSerializer writer = impl.createLSSerializer();
			writer.getDomConfig().setParameter("format-pretty-print", Boolean.TRUE);
			writer.getDomConfig().setParameter("xml-declaration", keepDeclaration);
			populate(document, nodes, attributes, contents);
			return writer.writeToString(document);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	public RawView() {

	}

	public void addTableListener(Table table) {
		table.addDisposeListener(new DisposeListener() {

			public void widgetDisposed(DisposeEvent e) {

			}
		});

		table.addListener(SWT.Selection, new Listener() {

			public void handleEvent(Event event) {
				if (event.item.getData() instanceof Section) {
					Section section = (Section) event.item.getData();

					ByteArrayOutputStream fa = new ByteArrayOutputStream();
					try {
						CDAUtil.saveSnippet(EcoreUtil.copy(section), fa);
						Set<String> nodes = new HashSet<String>();
						Set<String> attributes = new HashSet<String>();
						Set<String> contents = new HashSet<String>();
						String sectionContent = StringEscapeUtils.escapeHtml(
							formatSection(fa.toString(), nodes, attributes, contents));
						sectionContent = formatTagsAndAttributes(sectionContent, nodes, attributes, contents);
						String filename = "";
						if (event.item instanceof TableItem) {
							TableItem ti = (TableItem) event.item;
							if (!StringUtils.isEmpty(ti.getParent().getToolTipText())) {
								filename = ti.getParent().getToolTipText();
							}
						}
						String sectionTitle = "";
						if (section.getTitle() != null && section.getTitle().getText() != null) {
							sectionTitle = section.getTitle().getText().toUpperCase();
						}
						sectionContent = String.format(
							"<html><head><style>p { text-align: center; color: red;} </style></head><body>%s SECTION CONTENT (%s)<br/><span style=\"color:green\"><pre>%s</pre></span></body></html>",
							sectionTitle, filename, sectionContent);
						browser.setText(sectionContent);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			}
		});

	}

	public void clearView() {
		browser.setText("");
	}

	@Override
	public void createPartControl(Composite parent) {
		browser = new Browser(parent, SWT.BORDER);
		if (getSite().getPage().getPerspective() != null) {
			for (IEditorReference editorReference : getSite().getPage().getEditorReferences()) {
				if ("org.eclipse.mdht.cda.xml.ui.editors.CDAAnalyzer".equals(editorReference.getId())) {
					CDAAnalyzer analyzer = (CDAAnalyzer) editorReference.getEditor(false);
					if (analyzer != null) {
						this.addTableListener(analyzer.getTable());
					}
				}
			}
		}
	}

	@Override
	public void setFocus() {

	}

}
