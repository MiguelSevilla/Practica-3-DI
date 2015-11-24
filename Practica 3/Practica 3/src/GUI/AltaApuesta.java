package GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class AltaApuesta extends PanelEstandar{
	
VentanaPrincipal ventanaprincipal;
	
	public AltaApuesta(VentanaPrincipal principal){
		super();
		
		ventanaprincipal = principal;
		
		setLayout(new BorderLayout());
		
		
		PanelEstandar encabezado = new PanelEstandar();
		encabezado.setLayout(new FlowLayout());
		
		BufferedImage imgtitulo=null;
		try {
			imgtitulo = ImageIO.read(new File("img/titulo.png"));
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		JLabel picLabel = new JLabel(new ImageIcon(imgtitulo));
		encabezado.add(picLabel);	
		
		
		
		
		
		
		PanelEstandar formulario = new PanelEstandar();
		
		formulario.setLayout(new GridLayout(4,2,2,2));
		
		JLabel partido = new JLabel("Partido:");
		partido.setForeground(Color.WHITE);
		JLabel descripcion = new JLabel("Descripción:");
		descripcion.setForeground(Color.WHITE);
		JLabel cuota = new JLabel("Cuota:");
		cuota.setForeground(Color.WHITE);
		JLabel deporte = new JLabel("Deporte:");
		deporte.setForeground(Color.WHITE);
		String[] apuestas = { "Madrid-Barcelona", "Betis-Sevilla", "Alcoyano-Albacete" };
		JComboBox<String> jcpartido = new JComboBox<String>(apuestas);
		JTextField jtdescripcion = new JTextField();
		JTextField jtcuota = new JTextField();
		String[] deportes = { "Futbol", "Baloncesto", "Petanca" };
		JComboBox<String> jcdeporte = new JComboBox<String>(deportes);
		

		
		
		formulario.add(deporte);
		formulario.add(jcdeporte);
		formulario.add(partido);
		formulario.add(jcpartido);
		formulario.add(descripcion);
		formulario.add(jtdescripcion);
		formulario.add(cuota);
		formulario.add(jtcuota);
		
		
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
		
		alta.addActionListener(new ActionListener(){
		      public void actionPerformed(ActionEvent e){
		    	 
		    	  System.out.println("Apuesta dada de alta correctamente");
		    	  
		      }
		});
		
		
		botonera.add(atras);
		botonera.add(alta);
		
		
		add(encabezado,BorderLayout.NORTH);
		add(formulario,BorderLayout.CENTER);
		add(botonera,BorderLayout.SOUTH);
		
		this.setVisible(true);
		
		
	}

}
