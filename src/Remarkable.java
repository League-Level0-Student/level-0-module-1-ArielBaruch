import javax.swing.JOptionPane;

public class Remarkable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	String sentence =JOptionPane.showInputDialog("What is your name.");
		
		if(sentence.equalsIgnoreCase("Ariel")) {
			JOptionPane.showMessageDialog(null, sentence + " Is remarkable");
			
		}
		String sentence1 = JOptionPane.showInputDialog("What is your name.");
		
		if(sentence.equalsIgnoreCase("Barak")) {
		
		
		JOptionPane.showMessageDialog(null, sentence1 + " Is remarkable");
		}
		String sentence2 = JOptionPane.showInputDialog("What is your name");
		
		if(sentence.equalsIgnoreCase("Dorite")) {
		
			JOptionPane.showMessageDialog(null, sentence2 + " Is remarkable");
			
			
		}
		
		
	

	
	
}
}
