import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public  class Topping extends JFrame implements ActionListener {
		JButton bB = new JButton("Becons");
		JButton pB = new JButton("Peperoni");
		JButton sB = new JButton("Extra siers");
		JButton oB = new JButton("Sîpols");
		
		public Topping() {
			JPanel panel = new JPanel();
			panel.setLayout(null);
			JLabel topName = new JLabel("Papildinâjumi picai");
			
			Font font1 = new Font(Font.SANS_SERIF,  Font.BOLD, 35);
			topName.setFont(font1);
			topName.setBounds(300, 10, 700, 70);
			panel.add(topName);
			add(panel);		
			
			JLabel becons = new JLabel(new ImageIcon("Becons.jpg"));
			panel.add(becons);
			becons.setBounds(50,70,300,300);
			
			JLabel peperoni = new JLabel(new ImageIcon("Peperoni.jpg"));
			panel.add(peperoni);
			peperoni.setBounds(350,70,300,300);
			
			JLabel siers = new JLabel(new ImageIcon("Extra siers.jpg"));
			panel.add(siers);
			siers.setBounds(50,400,300,300);
			
			JLabel sipols = new JLabel(new ImageIcon("Sîpols.jpg"));
			panel.add(sipols);
			sipols.setBounds(350,400,300,300);
			
			
			
			
			panel.add(bB);
			panel.add(pB);
			panel.add(sB);
			panel.add(oB);
			
			bB.setBounds(50, 370, 300, 30);
			pB.setBounds(350, 370, 300, 30);
			sB.setBounds(50, 700, 300, 30);
			oB.setBounds(350,700, 300, 30);
			
			setVisible(true);
			int garums = 700;
			int platums =1000;
			setDefaultCloseOperation(EXIT_ON_CLOSE);
			setSize(garums,platums);
			setLocation(1920/2 - garums/2, 1080/2 - platums/2);
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
		}
}

