import javax.swing.JOptionPane;

public class TheRiddler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int score = 0;
	
String sentence = JOptionPane.showInputDialog("Here is a riddle. The more you take away from me, the bigger I shall get. What am I?");
	
if(sentence.equalsIgnoreCase("A Hole")) {
	JOptionPane.showMessageDialog(null, "You are correct");
}
else { JOptionPane.showMessageDialog(null, "Sorry you are wrong");
JOptionPane.showMessageDialog(null, "The answer is A HOLE");	
}

}
}