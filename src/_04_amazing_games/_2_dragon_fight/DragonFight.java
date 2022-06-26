package _04_amazing_games._2_dragon_fight;

import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

public class DragonFight {

	public static void main(String[] args) {

		Random ran = new Random();    //This will be used later to make random numbers. 

		ImageIcon dragon = new ImageIcon("src/_04_amazing_games/_2_dragon_fight/The_Hollow_Knight_Idle.png");
		JOptionPane.showMessageDialog(null, "Defeat the Hollow Knight and destroy the Infection!", "Dragon Fighter", 0, dragon);

		// 1. Create some variables to hold health levels
		int dragonHealth = 100;
			// playerHealth to store your health - set it equal to 100
		int playerHealth = 100;
			// dragonHealth to store the dragon's health - set it equal to 100

		// 2. Create some variables to hold the attack strengths. These will be given different values later. 
		int dragonAttack = 0;
			// playerAttack to store the damage the player's attack will do - set it equal
			// to 0 for now.
		int playerAttack = 0;
			// dragonAttack to store the damage the dragon's attack will do - set it equal
			// to 0 for now.

		
		//  This while statement will cause the game attack code to repeat
		while (true) {

			// THE PLAYER ATTACKS THE DRAGON
String attack = JOptionPane.showInputDialog("Attack the Hollow Knight!");
				// 3. Ask the player in a pop-up if they want to attack the dragon with a yell
				// or a kick
	if(attack.equals("Slash")) {
		playerAttack=ran.nextInt(11);
		dragonHealth -= playerAttack;
	}
	
	if(attack.equals("Spell"))	{			
		playerAttack=ran.nextInt(26);
		dragonHealth -= playerAttack;
	}			
	
	if(attack.equals("Focus"))	{
		playerAttack=ran.nextInt(10);
		playerHealth += playerAttack;
	}			

	dragonAttack = ran.nextInt(16);
	playerHealth -= dragonAttack;	

				// 9. If the player's health is less than or equal to 0, the game is over,
				//    call the playerLost() method
	if(playerHealth<=(0))	{
		playerLost();	
	}			// 10. If the dragon's health is less than or equal to 0, the game is over,
				//     call the dragonLost() method
	if(dragonHealth<=(0)) {
		dragonLost();	
	}			// 11.  Pop up a message that tells us how much health the player and
				// 		dragon have left.
	JOptionPane.showMessageDialog(null,"THK Health: " + dragonHealth + " Player Health: " + playerHealth);
			
			
			

		} // this is the end of the while loop

	}

	static void playerLost() {
		// 11. Tell the player that they have been defeated by the dragon and have no treasure
		JOptionPane.showMessageDialog(null, "You are dead. You couldn't do it. Sad.");

		System.exit(0);   //This code ends the program
	}

	static void dragonLost() {
		// 12. Tell the user that the dragon has been defeated and they get a ton of gold!
		JOptionPane.showMessageDialog(null,"You have slain the Hollow Knight.");
		System.exit(0);   //This code ends the program
	}

}
