import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.PrintWriter;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MainFrame extends JFrame implements ActionListener{
	static JTextField userText = new JTextField();
	static JTextField nText = new JTextField();
	static JTextField adressText = new JTextField();
	public MainFrame() { /// public void, string , int 
		int garums = 700;
		int platums= 400;
		setVisible(true);
		setName("Picerija");
		JPanel panel = new JPanel();
		setSize(350,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add(panel);
		JLabel picerijaName = new JLabel("Picerija \"Artjomèiks\"");
		Font  font1  = new Font(Font.SANS_SERIF,  Font.BOLD, 35);
		picerijaName.setFont(font1);
		JLabel picture = new JLabel(new ImageIcon("images.png"));
		panel.setLayout(null);
		//user
		picerijaName.setBounds(170, 10, 700, 70);
		panel.add(picerijaName);
	    JLabel userLabel = new JLabel("Vards");
		userLabel.setBounds(10, 80, 80, 25);
		panel.add(userLabel);
		
	    userText.setBounds(100, 80 , 165, 25);	
		panel.add(userText);
		
		//number
		JLabel nLabel = new JLabel("Talrunis");
	    nLabel.setBounds(10, 110, 80, 25);
		panel.add(nLabel);
		 	
		
		nText.setBounds(100, 110 , 165, 25);	
	    panel.add(nText);
	    
	    //number
	  	JLabel adressLabel = new JLabel("Adresse");
	    adressLabel.setBounds(10, 140, 80, 25);
	  	panel.add(adressLabel);
	  	 	
	  	
	  	adressText.setBounds(100, 140, 165, 25);	
	    panel.add(adressText);
		
		//Button
	    poga.setBounds(10, 230, 300, 60);
		poga.addActionListener(this);
		panel.add(poga);
			
		//Picture
		picture.setBounds(350, 60, 300,300);
		panel.add(picture);
		
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(garums,platums);
		setLocation(1920/2 - garums/2, 1080/2 - platums/2);
	}
	static JButton poga = new JButton(" MENU "); 
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==poga) {
			new Pizzaz();
		}
	}
	public static void writeFile() {
		try {
			PrintWriter writer = new PrintWriter(new FileWriter("Checkout.txt", true));
			
			String str = "Vârds: "+userText.getText()+"\nNumurs: "+nText.getText()+"\nAdrese: "+adressText.getText()+"\n";
			str += Checkout.str;
			
			writer.println(str);
			
			writer.close();
		}catch(Exception e) {
			JOptionPane.showMessageDialog(null, "Kïûda ierakstot datus failâ", "Kïûda", JOptionPane.ERROR_MESSAGE);
		}
	}
	
	
	public static double summa = 0;
}