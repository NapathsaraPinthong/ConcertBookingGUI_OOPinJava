package Data;

import javax.swing.*;
import java.awt.event.*;
import java.text.NumberFormat;
import java.awt.*;

public class calculate_panel extends info_panel implements ActionListener {
	
	//Button
	JPanel button_panel = new JPanel();
	JButton cf_bt = new JButton("CONFIRM");
	JLabel space_label = new JLabel("  ");
	double exfee ;
	double fee ;
	int total ;
	int calfee ;
	Timer timer2 = new Timer(100,this);
	NumberFormat myFormat = NumberFormat.getInstance();
	
	//Error
	JFrame error = new JFrame("Invalid Input");
	
	//Receipt
	receipt_frame receipt = new receipt_frame();
	
	
	
	//Constructor
	public calculate_panel(){
		
		timer2.start(); //to update price
		
		//Button
		space_label.setPreferredSize(new Dimension(0,60));
		cf_bt.setPreferredSize(new Dimension(450,40));
		cf_bt.setBackground(new Color(68,71,90));
		cf_bt.setForeground(Color.white);
		cf_bt.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC,16));
		
		button_panel.add(space_label);
		button_panel.add(cf_bt);
		
		myFormat.setGroupingUsed(true);
		cf_bt.addActionListener(this);  
		this.add(button_panel, BorderLayout.SOUTH);
		
		receipt.ok_bt.addActionListener(this);


	}
	
	public void actionPerformed(ActionEvent e) {
		int amount_int = super.getAmn();
		double amount = amount_int; //Implicit casting
		
		int price_int = super.getPrice(); //Implicit casting
		double price = price_int;
		
		exfee = price*amount ; 
		fee = exfee * 0.55 /100 ; 
		
		if(fee>=50) {
			calfee = (int)Math.floor(fee); //Math Function
		}
		else {
			calfee = (int)Math.ceil(fee); //Math Function
		}
		total = (int)exfee + calfee ; //Explicit casting
		
		super.fee_label.setText(""+myFormat.format(price_int)+" x "+""+ amount_int);
		super.cal_label.setText(" + "+calfee+" = "+myFormat.format(total) +" ß ");
		
		
		if(e.getSource() == cf_bt) {	
			
			//Incomplete information
			if(name_tf.getText().isBlank() || surname_tf.getText().isBlank() ||
					tel_tf.getText().isBlank() || email_tf.getText().isBlank()
					|| (!a1_rdbt.isSelected() && !a2_rdbt.isSelected() 
							&& !b1_rdbt.isSelected() && !b2_rdbt.isSelected())) {
				JOptionPane.showMessageDialog(error, "Please fill out  the information");
			}
			else {
				receipt.name = name_tf.getText();
				receipt.surname = surname_tf.getText();
				receipt.tel = tel_tf.getText();
				receipt.email = email_tf.getText();
				
				receipt.fullname = "Name : " +receipt.name+ " "+receipt.surname ;
				receipt.showname_label.setText(receipt.fullname);
				receipt.showtel_label.setText("Telephone : "+receipt.tel);
				receipt.showemail_label.setText("Email : "+receipt.email);
				receipt.showdt_label.setText("Zone : " +zone+ " Amount : "+ amount_int);
				receipt.showtt_label.setText("Total : "+myFormat.format(total)+" ß");
				
				receipt.setVisible(true);
			}
			
	
		}
		else if (e.getSource()== receipt.ok_bt) {
			System.exit(0); //Close program
		}
		repaint();

		
		
	}
}
