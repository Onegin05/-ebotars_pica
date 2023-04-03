import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Izmers extends JFrame implements ActionListener{
	
	JButton size20 = new JButton("20cm");
	JButton size30 = new JButton("30cm");
	JButton size50 = new JButton("50cm");
	
	public Izmers() {
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		size20.setBounds(10,10, 250, 30);
		size30.setBounds(10,50, 250, 30);
		size50.setBounds(10,90, 250, 30);
		
		size20.addActionListener(this);
		size30.addActionListener(this);
		size50.addActionListener(this);
		
		panel.add(size20);
		panel.add(size30);
		panel.add(size50);
		
		add(panel);
		
		setVisible(true);
		int garums = 300;
		int platums =200;
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(garums,platums);
		setLocation(1920/2 - garums/2, 1080/2 - platums/2);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==size20) {
			MainFrame.summa += 8;
			Checkout.str += "Izmērs: "+20+"cm\n";
			new Topping();
		}else if(e.getSource()==size30) {
			MainFrame.summa += 10;
			Checkout.str += "Izmērs: "+30+"cm\n";
			new Topping();
		}else if(e.getSource()==size50) {
			MainFrame.summa += 14;
			new Topping();
			Checkout.str += "Izmērs: "+50+"cm\n";
		}
		
	}
}
