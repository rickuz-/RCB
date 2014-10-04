package com.example.test;

import javax.servlet.annotation.WebServlet;

import com.vaadin.annotations.Theme;
import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinServlet;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.GridLayout;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.InlineDateField;
import com.vaadin.ui.Label;
import com.vaadin.ui.Panel;
import com.vaadin.ui.TextField;
import com.vaadin.ui.Tree;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

@SuppressWarnings("serial")
@Theme("test")
public class TestUI extends UI {

	@WebServlet(value = "/*", asyncSupported = true)
	@VaadinServletConfiguration(productionMode = false, ui = TestUI.class)
	public static class Servlet extends VaadinServlet {
	}

	@Override
	protected void init(VaadinRequest request) {
		
		VerticalLayout content = new VerticalLayout();
		content.setSizeFull();
		setContent(content);
		
		content.addComponent(new Label("BBC Extrusion"));
		
		HorizontalLayout hor = new HorizontalLayout();
		hor.setSizeFull();
		
		//Costruzione menu
		/*Tree tree = new Tree("Menu");
		tree.addItem("Ordine");
		tree.addItem("Grezzo");
		tree.addItem("Verniciato");
		tree.addItem("Taglio termico");
		tree.addItem("Portafoglio");
		tree.addItem("Ecc.");
		tree.setParent("Grezzo", "Ordine");
		tree.setParent("Verniciato", "Ordine");
		tree.setParent("Taglio termico", "Ordine");
		tree.setChildrenAllowed("Grezzo", false);
		tree.setChildrenAllowed("Verniciato", false);
		tree.setChildrenAllowed("Taglio termico", false);
		hor.addComponent(tree);*/
		MenuTree menu = new MenuTree();
		hor.addComponent(menu);
		
		FormOrdineGrezzo fog = new FormOrdineGrezzo();
		hor.addComponent(fog);
		
		content.addComponent(hor);
		content.setExpandRatio(hor, 1);
		
		

	}

}