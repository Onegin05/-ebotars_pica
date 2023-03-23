import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Pizzaz extends JFrame implements ActionListener{
	JButton dB = new JButton("Desu pica");
	JButton mB = new JButton("Margarita pica");
	JButton rB = new JButton("Rikkota pica");
	JButton hB = new JButton("Havaiju pica");
	public Pizzaz() {
		JPanel panel = new JPanel();
		panel.setLayout(null);
		JLabel picerijaName = new JLabel("Picas");
		
		Font font1 = new Font(Font.SANS_SERIF,  Font.BOLD, 35);
		picerijaName.setFont(font1);
		picerijaName.setBounds(300, 10, 700, 70);
		panel.add(picerijaName);
		add(panel);
		/*
		 * images
		 */
		JLabel desuPica = new JLabel(new ImageIcon("desu.jpg"));
		panel.add(desuPica);
		desuPica.setBounds(50,70,300,300);
		
		JLabel margaritaPica = new JLabel(new ImageIcon("margarita.jpg"));
		panel.add(margaritaPica);
		margaritaPica.setBounds(350,70,300,300);
		
		JLabel hawaiiPica = new JLabel(new ImageIcon("hawaii.jpg"));
		panel.add(hawaiiPica);
		hawaiiPica.setBounds(50,400,300,300);
		
		JLabel riccotaPica = new JLabel(new ImageIcon("riccota.jpg"));
		panel.add(riccotaPica);
		riccotaPica.setBounds(350,400,300,300);
		
		panel.add(dB);
		panel.add(mB);
		panel.add(hB);
		panel.add(rB);
		
		dB.setBounds(50, 370, 300, 30);
		mB.setBounds(350, 370, 300, 30);
		hB.setBounds(50, 700, 300, 30);
		rB.setBounds(350,700, 300, 30);
		
		dB.addActionListener(this);
		rB.addActionListener(this);
		mB.addActionListener(this);
		hB.addActionListener(this);
		
		setVisible(true);
		int garums = 700;
		int platums =1000;
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(garums,platums);
		setLocation(1920/2 - garums/2, 1080/2 - platums/2);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==dB) {
			Checkout.str += "Pica: Desu pica\n";
			new Izmers();
		}else if(e.getSource()==mB) {
			Checkout.str += "Pica: Margarita pica\n";
			new Izmers();
		}else if(e.getSource()==hB) {
			Checkout.str += "Pica: Havaiju pica\n";
			new Izmers();
		}else if(e.getSource()==rB) {
			Checkout.str += "Pica: Rikkota pica\n";
			new Izmers();
		}
	}
}
