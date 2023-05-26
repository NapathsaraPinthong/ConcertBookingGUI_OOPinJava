package Data;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class info_panel extends JPanel implements ItemListener {
	
	//Name
	JPanel left_panel = new JPanel();
	JLabel name_label = new JLabel("          NAME :");
	JLabel surname_label = new JLabel("          SURNAME :");
	JLabel tel_label = new JLabel("          TELEPHONE :");
	JLabel email_label = new JLabel("          EMAIL :");
	JTextField name_tf = new JTextField("",17);
	JTextField surname_tf = new JTextField("",17);
	JTextField tel_tf = new JTextField("",17);
	JTextField email_tf = new JTextField("",17);
	
	//Zone
	JPanel right_panel = new JPanel();
	JLabel zone_label = new JLabel("  ZONE");
	JRadioButton a1_rdbt = new JRadioButton("  A1");
	JRadioButton a2_rdbt = new JRadioButton("  A2");
	JRadioButton b1_rdbt = new JRadioButton("  B1");
	JRadioButton b2_rdbt = new JRadioButton("  B2");
	String zone ;
	private int price ;
	
	//Amount
	JPanel top_panel = new JPanel();
	JLabel amount_label = new JLabel("AMOUNT  ");
	String amn[] = {"1","2","3","4"};
	JComboBox amn_cb = new JComboBox(amn);
	
	//Show
	JPanel bttm_panel = new JPanel();
	JLabel total_label = new JLabel("TOTAL : ");
	JLabel exfee_label = new JLabel("");
	JLabel fee_label = new JLabel("");
	JLabel cal_label = new JLabel("");
	JLabel space_label = new JLabel("  ");
	
	
	JPanel amn_panel = new JPanel();
	JPanel sel_panel = new JPanel();
	private int amn_int = 1 ;

	public info_panel(){	
		
		//Name
		left_panel.setLayout(new GridLayout(4,2));
		left_panel.add(name_label);
		left_panel.add(name_tf);
		left_panel.add(surname_label);
		left_panel.add(surname_tf);
		left_panel.add(tel_label);
		left_panel.add(tel_tf);
		left_panel.add(email_label);
		left_panel.add(email_tf);
		
		//Zone
		right_panel.setLayout(new GridLayout(5,1));
		right_panel.add(zone_label);
		right_panel.add(a1_rdbt);
		right_panel.add(a2_rdbt);;
		right_panel.add(b1_rdbt);
		right_panel.add(b2_rdbt);

		//Amount
		top_panel.add(amount_label);
		top_panel.add(amn_cb);
		
		space_label.setPreferredSize(new Dimension(0,60));
		
		//Show
		bttm_panel.setLayout(new BoxLayout(bttm_panel,BoxLayout.Y_AXIS));
		space_label.setAlignmentX(Component.CENTER_ALIGNMENT);
		total_label.setAlignmentX(Component.CENTER_ALIGNMENT);
		exfee_label.setAlignmentX(Component.CENTER_ALIGNMENT);
		fee_label.setAlignmentX(Component.CENTER_ALIGNMENT);
		cal_label.setAlignmentX(Component.CENTER_ALIGNMENT);
		total_label.setFont(new Font("Verdana", Font.BOLD,14));
		exfee_label.setFont(new Font("Verdana", Font.BOLD,14));
		fee_label.setFont(new Font("Verdana", Font.BOLD,14));
		cal_label.setFont(new Font("Verdana", Font.BOLD,14));
		bttm_panel.add(space_label);
		bttm_panel.add(total_label);
		bttm_panel.add(exfee_label);
		bttm_panel.add(fee_label);
		bttm_panel.add(cal_label);
		

		//Amount + Show
		amn_panel.setLayout(new BorderLayout());
		amn_panel.add(top_panel, BorderLayout.NORTH);
		amn_panel.add(bttm_panel, BorderLayout.CENTER);
		
		//Zone + Amount + Show
		sel_panel.setLayout(new BorderLayout());
		sel_panel.add(right_panel,BorderLayout.WEST);
		sel_panel.add(amn_panel, BorderLayout.CENTER);
		
		//Register
		a1_rdbt.addItemListener(this);
		a2_rdbt.addItemListener(this);
		b1_rdbt.addItemListener(this);
		b2_rdbt.addItemListener(this);
		amn_cb.addItemListener(this);
		
		
		
		this.setLayout(new BorderLayout());
		this.add(left_panel, BorderLayout.WEST);
		this.add(sel_panel, BorderLayout.CENTER);


	}
	
	public int getPrice() {
		return price;
	}
	public int getAmn() {
		return amn_int;
	}
	
	public void itemStateChanged(ItemEvent e) {
		
		//Select Zone
		if(e.getSource() == a1_rdbt && e.getStateChange() == 1) {
			a1_rdbt.setSelected(true);
			a2_rdbt.setSelected(false);
			b1_rdbt.setSelected(false);
			b2_rdbt.setSelected(false);
			price = 5000 ;
			zone = "A1" ;
		} 
		else if (e.getSource() == a2_rdbt && e.getStateChange() == 1) {
			a1_rdbt.setSelected(false);
			a2_rdbt.setSelected(true);
			b1_rdbt.setSelected(false);
			b2_rdbt.setSelected(false);
			price = 4500 ;
			zone = "A2" ;
		} 
		else if (e.getSource() == b1_rdbt && e.getStateChange() == 1) {
			a1_rdbt.setSelected(false);
			a2_rdbt.setSelected(false);
			b1_rdbt.setSelected(true);
			b2_rdbt.setSelected(false);
			price = 4000 ;
			zone = "B1" ;
		} 
		else if (e.getSource() == b2_rdbt && e.getStateChange() == 1){
			a1_rdbt.setSelected(false);
			a2_rdbt.setSelected(false);
			b1_rdbt.setSelected(false);
			b2_rdbt.setSelected(true);
			price = 3500 ;
			zone = "B2" ;
		}
		
		//Select Amount
		else if(amn_cb.getSelectedItem() == "1" && e.getStateChange() == 1) {
			amn_int = 1;
		} 
		else if (amn_cb.getSelectedItem() == "2"&& e.getStateChange() == 1) {
			amn_int = 2;
			System.out.println(amn_int);
		} 
		else if (amn_cb.getSelectedItem() == "3"&& e.getStateChange() == 1) {
			amn_int = 3;
		}
		else if (amn_cb.getSelectedItem() == "4"&& e.getStateChange() == 1) {
			amn_int = 4;
		}
		repaint();
	}
	
}

