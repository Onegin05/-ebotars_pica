import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Pirmaislogs extends JFrame implements ActionListener{
	public Pirmaislogs() {
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
	    JLabel userLabel = new JLabel("Name");
		userLabel.setBounds(10, 80, 80, 25);
		panel.add(userLabel);
		
		JTextField userText = new JTextField();
	    userText.setBounds(100, 80 , 165, 25);	
		panel.add(userText);
		
		//number
		JLabel nLabel = new JLabel("Number");
	    nLabel.setBounds(10, 110, 80, 25);
		panel.add(nLabel);
		 	
		JTextField nText = new JTextField();
		nText.setBounds(100, 110 , 165, 25);	
	    panel.add(nText);
	    
	    //number
	  	JLabel adressLabel = new JLabel("Adress");
	    adressLabel.setBounds(10, 140, 80, 25);
	  	panel.add(adressLabel);
	  	 	
	  	JTextField adressText = new JTextField();
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
			new Picas();
		}
	}
	
}
