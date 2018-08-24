/*******************************************************************************
 * Copyright (c) 2012 Sean Muir
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

import org.apache.commons.lang.StringUtils;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.mdht.cda.xml.ui.editors.CDAAnalyzer;
import org.eclipse.mdht.uml.cda.CDAFactory;
import org.eclipse.mdht.uml.cda.Section;
import org.eclipse.mdht.uml.cda.util.CDAUtil;
import org.eclipse.swt.SWT;
import org.eclipse.swt.browser.Browser;
import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.events.DisposeListener;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.MenuItem;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.ui.IEditorReference;
import org.eclipse.ui.part.ViewPart;

public class NarrativeView extends ViewPart {

	public void addTableListener(Table table) {
		table.addDisposeListener(new DisposeListener() {

			public void widgetDisposed(DisposeEvent e) {

			}
		});

		table.addListener(SWT.Selection, new Listener() {

			public void handleEvent(Event event) {
				if (event.item.getData() instanceof Section) {
					Section section = (Section) event.item.getData();
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

					ByteArrayOutputStream fa = new ByteArrayOutputStream();
					;
					Section s = CDAFactory.eINSTANCE.createSection();
					s.setText(EcoreUtil.copy(section.getText()));

					try {
						CDAUtil.saveSnippet(EcoreUtil.copy(s), fa);
						String a = String.format(
							"<html><title>SOMETITLE</title><head></head><body>%s SECTION NARRATIVE (%s)<br/>%s</body></html>",
							sectionTitle, filename, fa).toString();
						browser.setText(a);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			}
		});

	}

	Browser browser; // = new Browser(parent,SWT.BORDER);

	public NarrativeView() {

	}

	public void clearView() {
		browser.setText("");
	}

	@Override
	public void createPartControl(Composite parent) {
		browser = new Browser(parent, SWT.BORDER);
		Menu menu = new Menu(browser);
		MenuItem printMenuItem = new MenuItem(menu, SWT.CASCADE);
		printMenuItem.setText("Print");
		printMenuItem.addListener(SWT.Selection, new Listener() {
			public void handleEvent(Event e) {
				browser.execute("window.print();");
			}
		});
		browser.setMenu(menu);
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
