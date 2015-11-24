package GUI;

import java.awt.BorderLayout;
import java.util.ArrayList;

import javax.swing.JFrame;

public class VentanaPrincipal extends JFrame{

	ArrayList<PanelEstandar> listaPaneles;
	PanelEstandar panelPadre;
	
	public VentanaPrincipal(){
		super("Apuestium");
		listaPaneles = new ArrayList<PanelEstandar>();
		
		
		/*Añadimos todos los paneles al ArrayList*/
		listaPaneles.add(new PanelPrincipal(this));
		listaPaneles.add(new AltaPartido(this));
		listaPaneles.add(new AltaApuesta(this));
		
		
		
		
		
		/*Padre del panel creado para poder remover los otros paneles, ya que ese metodo no funciona directamente sobre la clase JFrame*/
		panelPadre = new PanelEstandar();
		panelPadre.setLayout(new BorderLayout());
		/*Añadimos el primer panel al panel padre*/
		panelPadre.add(listaPaneles.get(0));
		
		add(panelPadre);
		setSize(300,300);
		
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
}
