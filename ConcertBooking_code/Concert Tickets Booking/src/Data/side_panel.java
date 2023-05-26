package Data;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import Graphic.zone_panel;

public class side_panel extends JPanel implements MouseListener, ItemListener{

	zone_panel zone = new zone_panel();
	calculate_panel cal = new calculate_panel();
	int x;
	int y;

	public side_panel(){
		cal.a1_rdbt.addItemListener(this);
		cal.a2_rdbt.addItemListener(this);
		cal.b1_rdbt.addItemListener(this);
		cal.b2_rdbt.addItemListener(this);

		this.addMouseListener(this);
		this.setLayout(new BorderLayout());
		this.add(zone, BorderLayout.CENTER);
		this.add(cal, BorderLayout.SOUTH);
		
	}
	public void select_a1() {
		zone.ca1 = new Color(159,41,42);
		zone.ca2 = new Color(136,140,156);
		zone.cb1 = new Color(136,140,156);
		zone.cb2 = new Color(136,140,156);
	}
	public void select_a2() {
		zone.ca2 = new Color(159,41,42);
		zone.ca1 = new Color(136,140,156);
		zone.cb1 = new Color(136,140,156);
		zone.cb2 = new Color(136,140,156);
	}
	public void select_b1() {
		zone.cb1 = new Color(159,41,42);
		zone.ca2 = new Color(136,140,156);
		zone.ca1 = new Color(136,140,156);
		zone.cb2 = new Color(136,140,156);
	}
	public void select_b2() {
		zone.cb2 = new Color(159,41,42);
		zone.ca2 = new Color(136,140,156);
		zone.cb1 = new Color(136,140,156);
		zone.ca1 = new Color(136,140,156);
	}
	
	//Select Zone by radio button
	public void itemStateChanged(ItemEvent e) {
		if(e.getSource() == cal.a1_rdbt && e.getStateChange() == 1) {
			select_a1();
		} 
		else if (e.getSource() == cal.a2_rdbt && e.getStateChange() == 1) {
			select_a2();
		} 
		else if (e.getSource() == cal.b1_rdbt && e.getStateChange() == 1) {
			select_b1();
		} 
		else if (e.getSource() == cal.b2_rdbt && e.getStateChange() == 1){
			select_b2();
		}
		repaint();
	}

	//Select zone by clicking
	public void mouseClicked(MouseEvent e) {
		x = e.getX();
		y = e.getY();
		if(185 <= x && x <= 385 && 125 <= y && y <= 175) {
			select_a1();
			cal.a1_rdbt.setSelected(true);
			
		}
		else if(185 <= x && x <= 385 && 175 <= y && y <= 225) {
			select_a2();
			cal.a2_rdbt.setSelected(true);
		}
		else if(70 <= x && x <= 170 && 45 <= y && y <= 225) {
			select_b1();
			cal.b1_rdbt.setSelected(true);
		}
		else if(405 <= x && x <= 505 && 45 <= y && y <= 225) {
			select_b1();
			cal.b2_rdbt.setSelected(true);
		}
		repaint();
		
		
	}
	public void mouseReleased(MouseEvent e) {
		
	}
	public void mouseExited(MouseEvent e) {
		
	}
	public void mouseEntered(MouseEvent e) {
				
	}
	public void mousePressed(MouseEvent e) {
		
	}
	


		
	
}

		


