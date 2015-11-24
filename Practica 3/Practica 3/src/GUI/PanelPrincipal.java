package GUI;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class PanelPrincipal extends PanelEstandar{
	
	VentanaPrincipal ventanaprincipal;
	
	public PanelPrincipal(VentanaPrincipal principal){
		super();
		ventanaprincipal=principal;
		setLayout(new BorderLayout());
		PanelEstandar botonera = new PanelEstandar();
		botonera.setLayout(new GridLayout(2,2,2,2));
		JButton altapartido = new JButton("Dar alta partido");
		JButton altaapuesta = new JButton("Dar alta apuesta");
		JButton log = new JButton("Loggear usuario");
		JButton informes = new JButton("Gestion informes");
		
		altapartido.addActionListener(new ActionListener(){
		      public void actionPerformed(ActionEvent e){
		    	  ventanaprincipal.panelPadre.removeAll();
		    	  ventanaprincipal.panelPadre.add(ventanaprincipal.listaPaneles.get(1));
		    	  ventanaprincipal.revalidate();
		    	  ventanaprincipal.repaint();
		    	 
		      }
		});
		
		botonera.add(altapartido);
		botonera.add(altaapuesta);
		botonera.add(log);
		botonera.add(informes);
		
		add(botonera,BorderLayout.SOUTH);
		
		setVisible(true);
		
		
	}

}
