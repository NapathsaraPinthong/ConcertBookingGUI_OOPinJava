package Data;

import javax.swing.*;
import java.awt.*;

public class receipt_frame extends JFrame {
		JPanel popup_panel = new JPanel();
		String name;
		String surname;
		String tel ;
		String email ;
		String fullname = "" ;
		JLabel receipt_label = new JLabel("- RECEIPT -");
		JLabel showname_label = new JLabel();
		JLabel showtel_label = new JLabel();
		JLabel showemail_label = new JLabel();
		JLabel showdt_label = new JLabel();
		JLabel showtt_label = new JLabel();
		JButton ok_bt = new JButton("OK");
		JLabel space_label2 = new JLabel("    ");
		JLabel space_label3 = new JLabel("    ");
		JLabel dash_label = new JLabel("------------------------------------");
		ImageIcon imglogo = new ImageIcon(new ImageIcon("C:\\Users\\Stark\\Desktop\\java\\TREASURE_logo.png").getImage().getScaledInstance(170, 120, Image.SCALE_DEFAULT));
		JLabel img_label = new JLabel();
		
		public receipt_frame(){
			super("Receipt");
			
			receipt_label.setFont(new Font("Verdana", Font.BOLD| Font.ITALIC,16));
			dash_label.setFont(new Font("Verdana", Font.PLAIN,14));
			showname_label.setFont(new Font("Verdana", Font.PLAIN,14));
			showtel_label.setFont(new Font("Verdana", Font.PLAIN,14));
			showemail_label.setFont(new Font("Verdana", Font.PLAIN,14));
			showdt_label.setFont(new Font("Verdana", Font.PLAIN,14));
			showtt_label.setFont(new Font("Verdana", Font.BOLD,14));
			
			ok_bt.setPreferredSize(new Dimension(200,20));
			ok_bt.setBackground(new Color(19,113,114));
			ok_bt.setForeground(Color.white);
			ok_bt.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC,14));
			
			img_label.setIcon(imglogo);
			
			popup_panel.setLayout(new BoxLayout(popup_panel,BoxLayout.Y_AXIS));
			popup_panel.add(receipt_label);
			popup_panel.add(dash_label);
			popup_panel.add(showname_label);
			popup_panel.add(showtel_label);
			popup_panel.add(showemail_label);
			popup_panel.add(showdt_label);
			popup_panel.add(showtt_label);
			popup_panel.add(space_label2);
			popup_panel.add(ok_bt);
			popup_panel.add(space_label3);
			popup_panel.add(img_label);
			
			
			receipt_label.setAlignmentX(Component.CENTER_ALIGNMENT);
			dash_label.setAlignmentX(Component.CENTER_ALIGNMENT);
			showname_label.setAlignmentX(Component.CENTER_ALIGNMENT);
			showtel_label.setAlignmentX(Component.CENTER_ALIGNMENT);
			showemail_label.setAlignmentX(Component.CENTER_ALIGNMENT);
			showdt_label.setAlignmentX(Component.CENTER_ALIGNMENT);
			showtt_label.setAlignmentX(Component.CENTER_ALIGNMENT);
			ok_bt.setAlignmentX(Component.CENTER_ALIGNMENT);
			img_label.setAlignmentX(Component.CENTER_ALIGNMENT);

			
			popup_panel.setBackground(Color.white);
			
			this.add(popup_panel,BorderLayout.CENTER);
			this.setSize(300,400);
			this.setLocationRelativeTo(null); 
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
}
