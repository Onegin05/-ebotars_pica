import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Checkout extends JFrame implements ActionListener{
	
	
	public static String str = "";
	
	JButton stop = new JButton("Apturçt programmu");
	JButton addNew = new JButton("Pievienot vçl vienu picu");
	
	public Checkout() {
		JTextArea receipt = new JTextArea();
		JScrollPane scroll = new JScrollPane(receipt);
		JPanel panel = new JPanel();
		panel.setLayout(null);
		receipt.setText(str);
		scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		
		receipt.setEditable(false);
		scroll.setBounds(50,50, 300,300);
		panel.add(scroll);
		
		stop.setBounds(370, 230, 100, 30);

		addNew.setBounds(370, 310, 100, 30);
		
		panel.add(addNew);
		panel.add(stop);
		
		addNew.addActionListener(this);
		stop.addActionListener(this);
		
		add(panel);
		
		setVisible(true);
		int garums = 500;
		int platums =600;
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(garums,platums);
		setLocation(1920/2 - garums/2, 1080/2 - platums/2);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==stop) {
			
			System.exit(0);
		}else if(e.getSource()==addNew) {
			MainFrame.writeFile();
			new Pizzaz();
		}
	}
	
	
}
