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
import javax.swing.JLabel;
import javax.swing.JTextField;

public class AltaPartido extends PanelEstandar{
	
	VentanaPrincipal ventanaprincipal;
	
	public AltaPartido(VentanaPrincipal principal){
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
		
		JLabel partido = new JLabel("Nombre Partido:");
		partido.setForeground(Color.WHITE);
		JLabel fecha = new JLabel("Fecha:");
		fecha.setForeground(Color.WHITE);
		JLabel hora = new JLabel("Hora:");
		hora.setForeground(Color.WHITE);
		JLabel deporte = new JLabel("Deporte:");
		deporte.setForeground(Color.WHITE);
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
		
		alta.addActionListener(new ActionListener(){
		      public void actionPerformed(ActionEvent e){
		    	 
		    	  System.out.println("Partido dado de alta correctamente");
		    	  
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
