package GUI;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class PanelEstandar extends JPanel{
	
	private BufferedImage imgbackground;
	
	
	public PanelEstandar(){
		
		try {
			imgbackground = ImageIO.read(new File("img/cesped.jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		repaint();
	}
	
	
	
	public void paintComponent(Graphics g) {
	    g.drawImage(imgbackground, 0, 0, null);
	  }
	
	
	
	

}
