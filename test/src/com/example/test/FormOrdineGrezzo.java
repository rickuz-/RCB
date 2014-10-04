package com.example.test;

import java.awt.TextField;
import java.util.Date;

import com.vaadin.ui.Button;
import com.vaadin.ui.CustomComponent;
import com.vaadin.ui.DateField;
import com.vaadin.ui.FormLayout;
import com.vaadin.ui.Panel;
import com.vaadin.ui.TextArea;
import com.vaadin.ui.VerticalLayout;

public class FormOrdineGrezzo extends CustomComponent {
	
	public FormOrdineGrezzo() {
		
		FormLayout fl = new FormLayout();
		fl.setSizeUndefined();
				
		TextField cliente = new TextField("Cliente");
		fl.addComponent(cliente);
		
		TextField matrice = new TextField("Matrice");
		
		TextField dim = new TextField("Dimensione");
		
		TextField quant = new TextField("Quantita");
		
		TextField peso = new TextField("Peso");
		
		TextArea note = new TextArea("Note");
		
		DateField date = new DateField();
		date.setValue(new Date());
		
		Button button = new Button("Add new order");
		

		
		
		// Set the size as undefined at all levels
		setSizeUndefined();
				
		setCompositionRoot(fl);		
		
	}

}
