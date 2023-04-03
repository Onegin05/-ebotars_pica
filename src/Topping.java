import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
@SuppressWarnings("serial")
public class Topping extends JFrame implements ActionListener{
	JButton peperoni = new JButton("PEPERONI");
	JButton bacon = new JButton("BACON");
	JButton cheese = new JButton("EXTRA CHEESE");
	JButton bbq = new JButton("CRISPY ONIONS");
	JButton noTopping = new JButton("Without Toppings");
  	public Topping() {
		JPanel panel = new JPanel();
		panel.setLayout(null);
		JLabel picerijaName = new JLabel("Topping");
		
		Font font1 = new Font(Font.SANS_SERIF,  Font.BOLD, 35);
		picerijaName.setFont(font1);
		picerijaName.setBounds(300, 10, 700, 70);
		panel.add(picerijaName);
		add(panel);
      
		JLabel beconTop = new JLabel(new ImageIcon("bacon.jpg"));
		panel.add(beconTop);
		beconTop.setBounds(50,70,300,300);
		
		JLabel peperoniTop = new JLabel(new ImageIcon("desa.jpg"));
		panel.add(peperoniTop);
		peperoniTop.setBounds(350,70,300,300);
		
		JLabel cheeseTop = new JLabel(new ImageIcon("cheese.jpg"));
		panel.add(cheeseTop);
		cheeseTop.setBounds(50,400,300,300);
		
		JLabel onion = new JLabel(new ImageIcon("onion.jpg"));
		panel.add(onion);
		onion.setBounds(350,400,300,300);
		
		noTopping.setBounds(150, 750, 300, 30);
		panel.add(noTopping);
		
		panel.add(bacon);
		panel.add(peperoni);
		panel.add(cheese);
		panel.add(bbq);
		
		bacon.addActionListener(this);
		peperoni.addActionListener(this);
		cheese.addActionListener(this);
		bbq.addActionListener(this);
		noTopping.addActionListener(this);
		
		bacon.setBounds(50, 370, 300, 30);
		peperoni.setBounds(350, 370, 300, 30);
		cheese.setBounds(50, 700, 300, 30);
		bbq.setBounds(350,700, 300, 30);
		
		setVisible(true);
		int garums = 700;
		int platums =1000;
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(garums,platums);
		setLocation(1920/2 - garums/2, 1080/2 - platums/2);
  	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==bacon) {
			MainFrame.summa += 2.00;
			Checkout.str += "Piedevas: bekons\n";
			Checkout.str += "Kopā: "+MainFrame.summa+"€\n\n";
			MainFrame.summa = 0;
			new Checkout();
		}else if(e.getSource()==peperoni) {
			MainFrame.summa += 2.00;
			Checkout.str += "Piedevas: Desa peperoni\n";
			Checkout.str += "Kopā: "+MainFrame.summa+"€\n\n";
			MainFrame.summa = 0;
			new Checkout();
		}else if(e.getSource()==cheese) {
			MainFrame.summa += 2.00;
			Checkout.str += "Piedevas: Siers\n";
			Checkout.str += "Kopā: "+MainFrame.summa+"€\n\n";
			MainFrame.summa = 0;
			new Checkout();
		}else if(e.getSource()==bbq) {
			MainFrame.summa += 2.00;
			Checkout.str += "Piedevas: Sīpoli\n";
			Checkout.str += "Kopā: "+MainFrame.summa+"€\n\n";
			MainFrame.summa = 0;
			new Checkout();
		}else if(e.getSource()==noTopping) {
			Checkout.str += "Kopā: "+MainFrame.summa+"€\n\n";
			MainFrame.summa = 0;
			new Checkout();
		}
	}
}