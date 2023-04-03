import javax.swing.JOptionPane;
import javax.swing.JTable;

public class Main{

	public static void main(String[] args) {
		start();
	}
	
	public static void start() {
		String[] options = {"Saņemt restauranā","Piegāde līdz mājām"};
		int izvele = JOptionPane.showOptionDialog(null, "Izvēlies piegādes veidu", "Izvēle", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
		switch(izvele) {
		case 1: // pieg
			new MainFrame();
			Checkout.str += "Piegāde: piegāde līdz mājām\n";
			
			break;
		case 0: //sanemt rest
			Checkout.str += "Piegāde: saņemt restauranā\n";
			new Pizzaz();
			MainFrame.summa += 5;
			break;
			
		}
	}
	

}
