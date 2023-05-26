package Graphic;
import javax.swing.*;
import java.awt.*;

public class zone_panel extends JPanel{
	
	//Properties color for each zones
	public Color ca1 = new Color(136,140,156) ;
	public Color ca2 = new Color(136,140,156);
	public Color cb1 = new Color(136,140,156);
	public Color cb2  = new Color(136,140,156);

	protected void paintComponent(Graphics g) {
		super.paintComponents(g);
		
		//Background
		g.setColor(Color.white);
		g.fillRoundRect(10,35, 550, 200, 30, 30); 
		
		//Stage
		g.setColor(new Color(56,183,174));
		g.fillOval(185,45, 200, 70);
		
		//Zone
		g.setColor(ca1);
		g.fillRect(185, 125, 200, 50); //a1
		g.setColor(ca2);
		g.fillRect(185, 175, 200, 50); //a2
		g.setColor(cb1);
		g.fillRect(70, 45, 100, 180); //b1
		g.setColor(cb2);
		g.fillRect(405, 45, 100, 180); //b2
		
		//Border
		g.setColor(Color.black);
		g.drawOval(185,45, 200, 70); //stage
		g.drawRect(70, 45, 100, 180); //b1
		g.drawRect(405, 45, 100, 180); //b2
		g.drawRect(185, 125, 200, 50); //a1
		g.drawRect(185, 175, 200, 50); //a2
		
		//Label
		g.setColor(new Color(10,68,78));
		g.setFont(new Font("Verdana", Font.BOLD,18));
		g.drawString("STAGE", 252, 85);
		g.setColor(Color.white);
		g.drawString("A1", 270, 155);
		g.drawString("A2", 270, 205);
		g.drawString("B1", 105, 145);
		g.drawString("B2", 440, 145);
	}
	

}
