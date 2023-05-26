package Data;

import javax.swing.*;
import java.awt.*;
import Graphic.poster_panel;


public class ConcertBooking {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Concert Booking");
		side_panel side = new side_panel();
		poster_panel poster = new poster_panel();

		frame.setLayout(new BorderLayout());
		frame.add(poster, BorderLayout.WEST);
		frame.add(side, BorderLayout.CENTER);
		
		frame.setSize(1000,500);
		frame.setVisible(true);
		frame.setLocationRelativeTo(null); 
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
}
