package GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.util.ArrayList;

import javax.swing.JFrame;

public class VentanaPrincipal extends JFrame{

	ArrayList<PanelEstandar> listaPaneles;
	PanelEstandar panelPadre;
	
	public VentanaPrincipal(){
		super("Apuestium");
		listaPaneles = new ArrayList<PanelEstandar>();
		
		listaPaneles.add(new PanelPrincipal(this));
		listaPaneles.add(new AltaPartido(this));
		
		
		panelPadre = new PanelBase();
		
		panelPadre.add(listaPaneles.get(0));
		
		add(panelPadre);
		setSize(500,600);
		
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
}
