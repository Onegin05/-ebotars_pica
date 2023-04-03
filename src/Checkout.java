import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Checkout extends JFrame implements ActionListener {

	public static String str = "";

	JButton stop = new JButton("Apturēt programmu");
	JButton addNew = new JButton("Pievienot vēl vienu picu");
	JButton seeAll = new JButton("Apskatit visus pasutijumus");

	public Checkout() {
		JTextArea receipt = new JTextArea();
		JScrollPane scroll = new JScrollPane(receipt);
		JPanel panel = new JPanel();
		panel.setLayout(null);
		receipt.setText(str);
		scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

		receipt.setEditable(false);
		scroll.setBounds(50, 50, 300, 300);
		panel.add(scroll);

		stop.setBounds(370, 230, 100, 30);

		addNew.setBounds(370, 310, 100, 30);

		seeAll.setBounds(370, 390, 100, 30);

		panel.add(addNew);
		panel.add(stop);
		panel.add(seeAll);

		addNew.addActionListener(this);
		stop.addActionListener(this);
		seeAll.addActionListener(this);
		add(panel);

		setVisible(true);
		int garums = 500;
		int platums = 600;
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(garums, platums);
		setLocation(1920 / 2 - garums / 2, 1080 / 2 - platums / 2);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == stop) {
			MainFrame.writeFile();
			System.exit(0);

		} else if (e.getSource() == addNew) {
			MainFrame.writeFile();
			new Pizzaz();
		} else if (e.getSource() == seeAll) {
			readFile();
		}
	}
	
	public void readFile() {
		try {
			FileReader fr = new FileReader("Checkout.txt");
			BufferedReader reader = new BufferedReader(fr);
			String line, str="";
			while( (line = reader.readLine()) != null ) {
				str += line + "\n";
			}
			JFrame frame = new JFrame("dati");
			JTextArea text = new JTextArea();
			JScrollPane scroll = new JScrollPane(text);
			text.setText(str);
			scroll.setBounds(50,50, 200, 200);
			frame.add(scroll);
			frame.setSize(300,300);
			frame.setVisible(true);
			frame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
			reader.close();
		}catch(Exception e) {
			JOptionPane.showMessageDialog(null, "Kļūda lasot failu", "Kļūda", JOptionPane.ERROR_MESSAGE);
		}
	}

}
