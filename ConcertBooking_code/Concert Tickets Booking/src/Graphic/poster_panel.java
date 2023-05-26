package Graphic;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

public class poster_panel extends JPanel implements ActionListener {
	
	//Properties
	JLabel event_label = new JLabel(" TREASURE 1st CONCERT - 'TRACE'");
	BufferedImage poster ;
	BufferedImage poster1 ;
	BufferedImage poster2 ;
	boolean shown = true ;
	Timer timer = new Timer(2000,this); // change poster every 2 second
	
	//Constructor
	public poster_panel(){
		timer.start();
		this.add(event_label);
		event_label.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC,20));
		event_label.setForeground(new Color(19,113,114));
		try {                
	          poster1 = ImageIO.read(new File("C:\\Users\\Stark\\Desktop\\java\\poster1.jpg"));
	          poster2 = ImageIO.read(new File("C:\\Users\\Stark\\Desktop\\java\\poster2.jpeg"));
	       } catch (IOException ex) {} 
		
	}
	
	//Draw Image
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		if(shown) {
			poster = poster1;
			shown = false;
		}
		else {
			poster = poster2;
			shown = true;
		}
		g.drawImage(poster, 35, 40, 280, 410, event_label);
	}
	
	//Timer
	public void actionPerformed(ActionEvent e) {
		repaint();
		
	}
	
	
}
