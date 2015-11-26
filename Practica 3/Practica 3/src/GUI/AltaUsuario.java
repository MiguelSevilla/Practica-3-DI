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

public class AltaUsuario extends PanelEstandar{
VentanaPrincipal ventanaprincipal;
	
	public AltaUsuario(VentanaPrincipal principal){
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
		
		JLabel nombre = new JLabel("Nombre:");
		nombre.setForeground(Color.WHITE);
		JLabel apellidos = new JLabel("Apellidos:");
		apellidos.setForeground(Color.WHITE);
		JLabel telefono = new JLabel("Teléfono:");
		telefono.setForeground(Color.WHITE);
		JLabel dni = new JLabel("DNI:");
		dni.setForeground(Color.WHITE);
		JTextField jtnombre = new JTextField();
		JTextField jtapellidos = new JTextField();
		JTextField jttelefono = new JTextField();
		JTextField jtdni = new JTextField();
		
		formulario.add(nombre);
		formulario.add(jtnombre);
		formulario.add(apellidos);
		formulario.add(jtapellidos);
		formulario.add(telefono);
		formulario.add(jttelefono);
		formulario.add(dni);
		formulario.add(jtdni);
		
		
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
		    	 
		    	  System.out.println("Usuario dado de alta correctamente");
		    	  
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
