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
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class ApostarDinero extends PanelEstandar{
	
VentanaPrincipal ventanaprincipal;
	
	public ApostarDinero(VentanaPrincipal principal){
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
		
		formulario.setLayout(new GridLayout(5,2,2,2));
		
		JLabel deporte = new JLabel("Deporte:");
		deporte.setForeground(Color.WHITE);
		JLabel partido = new JLabel("Partido:");
		partido.setForeground(Color.WHITE);
		JLabel apuesta = new JLabel("Apuesta:");
		apuesta.setForeground(Color.WHITE);
		JLabel cuota = new JLabel("Cuota:");
		cuota.setForeground(Color.WHITE);
		JLabel cantidad = new JLabel("Cantidad:");
		cantidad.setForeground(Color.WHITE);
		

		String[] deportes = { "Futbol", "Baloncesto", "Petanca" };
		JComboBox<String> jcdeporte = new JComboBox<String>(deportes);
		String[] partidos = { "Madrid-Barcelona", "Betis-Sevilla", "Alcoyano-Albacete" };
		JComboBox<String> jcpartido = new JComboBox<String>(partidos);
		String[] apuestas = { "Gana Local", "Empate", "Gana Visitante" };
		JComboBox<String> jcapuesta = new JComboBox<String>(apuestas);
		
		JLabel jlcuota = new JLabel("1.15");
		jlcuota.setForeground(Color.CYAN);
		JTextField jtcantidad = new JTextField();
		
		
		formulario.add(deporte);
		formulario.add(jcdeporte);
		formulario.add(partido);
		formulario.add(jcpartido);
		formulario.add(apuesta);
		formulario.add(jcapuesta);
		formulario.add(cuota);
		formulario.add(jlcuota);
		formulario.add(cantidad);
		formulario.add(jtcantidad);
		
		
		PanelEstandar botonera = new PanelEstandar();
		botonera.setLayout(new FlowLayout());
		
		JButton atras = new JButton("Salir");
		JButton apostar = new JButton("Apostar");
		
		
		atras.addActionListener(new ActionListener(){
		      public void actionPerformed(ActionEvent e){
		    	 
		    	  ventanaprincipal.panelPadre.removeAll();
		    	  ventanaprincipal.panelPadre.add(ventanaprincipal.listaPaneles.get(0));
		    	  ventanaprincipal.revalidate();
		    	  ventanaprincipal.repaint();

		      }
		});
		
		apostar.addActionListener(new ActionListener(){
		      public void actionPerformed(ActionEvent e){
		    	  
		    	  JOptionPane.showMessageDialog(null,"La bolsa de la casa de apuestas está casi vacía"); 
		    	 
		    	  System.out.println("Apuesta realizada con exito");
		    	  
		      }
		});
		
		
		botonera.add(atras);
		botonera.add(apostar);
		
		
		add(encabezado,BorderLayout.NORTH);
		add(formulario,BorderLayout.CENTER);
		add(botonera,BorderLayout.SOUTH);
		
		this.setVisible(true);
		
		
	}


}
