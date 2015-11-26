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

public class IngresoDinero extends PanelEstandar{
	
VentanaPrincipal ventanaprincipal;
	
	public IngresoDinero(VentanaPrincipal principal){
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
		
		JLabel ingreso = new JLabel("Tipo Ingreso:");
		ingreso.setForeground(Color.WHITE);
		JLabel tarjeta = new JLabel("Numero de Tarjeta:");
		tarjeta.setForeground(Color.WHITE);
		JLabel cantidad = new JLabel("Cantidad:");
		cantidad.setForeground(Color.WHITE);

		String[] tipos = { "Tarjeta", "Transferencia", "Efectivo" };
		JComboBox<String> jcingreso = new JComboBox<String>(tipos);
		JTextField jttarjeta = new JTextField();
		JTextField jtcantidad = new JTextField();
		
		

		
		
		formulario.add(ingreso);
		formulario.add(jcingreso);
		formulario.add(tarjeta);
		formulario.add(jttarjeta);
		formulario.add(cantidad);
		formulario.add(jtcantidad);
		
		
		PanelEstandar botonera = new PanelEstandar();
		botonera.setLayout(new FlowLayout());
		
		JButton atras = new JButton("Salir");
		JButton ingresar = new JButton("Ingresar");
		
		
		jcingreso.addActionListener (new ActionListener () {
		    public void actionPerformed(ActionEvent e) {
		        if(jcingreso.getSelectedIndex()==2){
		        	tarjeta.setVisible(false);
		        	jttarjeta.setVisible(false);
		        }else{
		        	tarjeta.setVisible(true);
		        	jttarjeta.setVisible(true);
		        }
		    }
		});
		
		atras.addActionListener(new ActionListener(){
		      public void actionPerformed(ActionEvent e){
		    	 
		    	  ventanaprincipal.panelPadre.removeAll();
		    	  ventanaprincipal.panelPadre.add(ventanaprincipal.listaPaneles.get(0));
		    	  ventanaprincipal.revalidate();
		    	  ventanaprincipal.repaint();

		      }
		});
		
		ingresar.addActionListener(new ActionListener(){
		      public void actionPerformed(ActionEvent e){
		    	 
		    	  System.out.println("Dinero Ingresado");
		    	  
		      }
		});
		
		
		botonera.add(atras);
		botonera.add(ingresar);
		
		
		add(encabezado,BorderLayout.NORTH);
		add(formulario,BorderLayout.CENTER);
		add(botonera,BorderLayout.SOUTH);
		
		this.setVisible(true);
		
		
	}

}
