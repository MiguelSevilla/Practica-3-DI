package GUI;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

public class OpcionesUsuario  extends PanelEstandar{
VentanaPrincipal ventanaprincipal;
	
	public OpcionesUsuario(VentanaPrincipal principal){
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
		botonera.setLayout(new FlowLayout());
		
				
		JButton apostar = new JButton("Apostar");
		JButton ingresar = new JButton("Ingresar Dinero");
		JButton atras = new JButton("Salir");
		
		apostar.addActionListener(new ActionListener(){
		      public void actionPerformed(ActionEvent e){
		    	  
		    	  ventanaprincipal.panelPadre.removeAll();
		    	  ventanaprincipal.panelPadre.add(ventanaprincipal.listaPaneles.get(8));
		    	  ventanaprincipal.revalidate();
		    	  ventanaprincipal.repaint();
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
		    	  
		    	  ventanaprincipal.panelPadre.removeAll();
		    	  ventanaprincipal.panelPadre.add(ventanaprincipal.listaPaneles.get(7));
		    	  ventanaprincipal.revalidate();
		    	  ventanaprincipal.repaint();
		    	 
		      }
		});
		
		botonera.add(apostar);
		botonera.add(ingresar);

		PanelEstandar panelatras = new PanelEstandar();
		panelatras.setLayout(new FlowLayout());
		panelatras.add(atras);
		
		add(encabezado,BorderLayout.NORTH);
		add(botonera,BorderLayout.CENTER);
		add(panelatras,BorderLayout.SOUTH);
		
		setSize(500,600);
		
		setVisible(true);
		
		
	}

}
