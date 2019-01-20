import javax.swing.JOptionPane;

public class SecretMessageBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String pass = "Yelo";

String sentence = JOptionPane.showInputDialog(null, "Tell me secret message");

String sentence1 = JOptionPane.showInputDialog(null, "You can only see the secret message if you get the correct passcode");

if(sentence1.equalsIgnoreCase(pass)) {
	JOptionPane.showMessageDialog(null, sentence);
}
else {
	JOptionPane.showMessageDialog(null, "INTRUDER!!");
}














	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
