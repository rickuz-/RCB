package com.example.test;

import com.vaadin.ui.CustomComponent;
import com.vaadin.ui.Panel;
import com.vaadin.ui.Tree;
import com.vaadin.ui.VerticalLayout;

public class MenuTree extends CustomComponent {
	
	public MenuTree() {
		
		Panel pan = new Panel();
		VerticalLayout vl = new VerticalLayout();
		pan.setContent(vl);
	
		Tree tree = new Tree("Menu");
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
		
		vl.addComponent(tree);
	
		// Set the size as undefined at all levels
		pan.getContent().setSizeUndefined();
		pan.setSizeUndefined();
		setSizeUndefined();
			
		// The composition root MUST be set
		setCompositionRoot(pan);
	
	}

}
