package com.example.test;

import com.vaadin.ui.Button;
import com.vaadin.ui.CustomComponent;
import com.vaadin.ui.Label;
import com.vaadin.ui.Panel;
import com.vaadin.ui.VerticalLayout;

class TryCustom extends CustomComponent {
	
		public TryCustom(String message) {
		// A layout structure used for composition
		Panel panel = new Panel("My Custom Component");
		VerticalLayout vl = new VerticalLayout();
		panel.setContent(vl);
		
		// Compose from multiple components
		Label label = new Label(message);
		label.setSizeUndefined(); // Shrink
		vl.addComponent(label);
		vl.addComponent(new Button("Ok"));
		
		// Set the size as undefined at all levels
		panel.getContent().setSizeUndefined();
		panel.setSizeUndefined();
		setSizeUndefined();
		
		// The composition root MUST be set
		setCompositionRoot(panel);
		}

}
