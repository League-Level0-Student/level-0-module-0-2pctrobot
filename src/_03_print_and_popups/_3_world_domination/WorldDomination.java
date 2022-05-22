package _03_print_and_popups._3_world_domination;


import javax.swing.JOptionPane;

public class WorldDomination {
	
	public static void main(String[] args) {
		
	
		// 1. Ask the user if they know how to write code.
String question = JOptionPane.showInputDialog("Do you know how to code?");
		// 2. If they say "yes", tell them they will rule the world.
if(question.equals("Yes")) {
JOptionPane.showMessageDialog(null, "Yay! The world needs more people like you. Spread your knowlage")	;
}
else {
	JOptionPane.showMessageDialog(null, "I'm supposed to say to sign up at The League, but I'm not going to. Do whatever you want");
}
		// 3. Otherwise, tell them to sign up for classes at The League.

	}

}