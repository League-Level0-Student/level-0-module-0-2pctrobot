package _03_print_and_popups._4_quiz_game;

import javax.swing.JOptionPane;

public class QuizGame {
	public static void main(String[] args) {
		
		// Create a variable to hold the user's score. Set it equal to zero. 
		int score = 0;
		// ASK A QUESTION AND CHECK THE ANSWER
		String question = JOptionPane.showInputDialog("Who is the protagonist in Hollow Knight?");
				// 2.  Ask the user a question 
			if(question.equals("It goes unnamed.")) {
				score = score + 1;
			}
				// 3.  Use an if statement to check if their answer is correct
		String question2 = JOptionPane.showInputDialog("Who is the main antagonist in Hollow Kmight");		
				// 4.  if the user's answer was correct, add one to their score 
		if(question2.equals("The Radiance.")) {
			score = score + 1;
		}
		// MAKE MORE QUESTIONS. Ask more questions by repeating the above 
				// Option: Subtract a point from their score for a wrong answer
		String question3 = JOptionPane.showInputDialog("What is the carring capacity of a laden swallow?");
		if(question3.equals("African or Europian?")) {
			score = score + 1;
		}
		JOptionPane.showMessageDialog(null,""+ score);
		// After all the questions have been asked, tell the user their final score 
		
	}
}
