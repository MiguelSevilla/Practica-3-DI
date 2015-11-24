package GUI;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class AltaPartido extends PanelEstandar{
	
	VentanaPrincipal ventanaprincipal;
	
	public AltaPartido(VentanaPrincipal principal){
		super();
		
		ventanaprincipal = principal;
		
		setLayout(new BorderLayout());
		
		PanelEstandar formulario = new PanelEstandar();
		
		formulario.setLayout(new GridLayout(4,2,2,2));
		
		JLabel partido = new JLabel("Nombre Partido:");
		JLabel fecha = new JLabel("Fecha:");
		JLabel hora = new JLabel("Hora:");
		JLabel deporte = new JLabel("Deporte:");
		JTextField jtpartido = new JTextField();
		JTextField jtfecha = new JTextField();
		JTextField jthora = new JTextField();
		JTextField jtdeporte = new JTextField();
		
		formulario.add(partido);
		formulario.add(jtpartido);
		formulario.add(deporte);
		formulario.add(jtdeporte);
		formulario.add(fecha);
		formulario.add(jtfecha);
		formulario.add(hora);
		formulario.add(jthora);
		
		
		PanelEstandar botonera = new PanelEstandar();
		botonera.setLayout(new FlowLayout());
		
		JButton atras = new JButton("Atras");
		JButton alta = new JButton("Dar alta");
		
		
		atras.addActionListener(new ActionListener(){
		      public void actionPerformed(ActionEvent e){
		    	 
		    	  ventanaprincipal.panelPadre.removeAll();
		    	  ventanaprincipal.panelPadre.add(ventanaprincipal.listaPaneles.get(0));
		    	  ventanaprincipal.revalidate();
		    	  ventanaprincipal.repaint();

		    	 
		      }
		});
		
		
		botonera.add(atras);
		botonera.add(alta);
		
		add(formulario,BorderLayout.CENTER);
		add(botonera,BorderLayout.SOUTH);
		
		this.setVisible(true);
		
		
	}

}
