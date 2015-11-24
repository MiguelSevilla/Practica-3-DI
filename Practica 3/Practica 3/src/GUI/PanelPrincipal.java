package GUI;

import java.awt.BorderLayout;
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
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelPrincipal extends PanelEstandar{
	
	VentanaPrincipal ventanaprincipal;
	
	public PanelPrincipal(VentanaPrincipal principal){
		super();
		ventanaprincipal=principal;
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
				
		
		PanelEstandar botonera = new PanelEstandar();
		botonera.setLayout(new GridLayout(2,2,0,0));
		
		PanelEstandar botonaislado = new PanelEstandar();
		botonaislado.setLayout(new BorderLayout());

		
		JButton altausuario = new JButton("Dar alta usuario");
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
		
		altaapuesta.addActionListener(new ActionListener(){
		      public void actionPerformed(ActionEvent e){
		    	  ventanaprincipal.panelPadre.removeAll();
		    	  ventanaprincipal.panelPadre.add(ventanaprincipal.listaPaneles.get(2));
		    	  ventanaprincipal.revalidate();
		    	  ventanaprincipal.repaint();
		    	 
		      }
		});
		
		botonera.add(altapartido);
		botonera.add(altaapuesta);
		botonera.add(log);
		botonera.add(informes);
		botonaislado.add(altausuario,BorderLayout.SOUTH);
		
		add(botonaislado,BorderLayout.CENTER);
		add(encabezado,BorderLayout.NORTH);
		add(botonera,BorderLayout.SOUTH);
		
		setSize(500,600);
		
		setVisible(true);
		
		
	}

}
