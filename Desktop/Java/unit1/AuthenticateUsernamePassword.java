/**
 * 
 * Name: Evan Baker, 
 * Email: emb27391@email.vccs.edu, 
 * Description: This asks for the user's username and password, and if the username(Or
 *  password) is correct, print Welcome Username! and if incorrect, Wrong Username or
 *   Password!
 * 
 */

/*
 * Pseudocode:
 * 
 * Set a boolean to one setting
 * Create username and password
 * Create loop for boolean
 * 		->This loop will ask for the user to enter his username and password
 * 		->This loop will then calculate if the entered username and password are equal
 * 				to the original
 * 				->If so, show the welcome message
 * 				->Disable the loop from the boolean
 * 
 * 				->If else, show the try again message
 * 				->Keep the loop from the boolean running
 */

import javax.swing.JOptionPane;
import javax.swing.JFrame;

public class AuthenticateUsernamePassword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String usernameA, usernameB, passwordA, passwordB;
		boolean booleanMain = true;

		//Make JFrame(jf) pop up in front of all other windows, in the center of the
		//screen.
		JFrame jf = new JFrame();
		jf.setLocationRelativeTo(null);
		jf.setTitle("Assignment 2");
		jf.toFront();
		jf.setAlwaysOnTop(true);
		
		//Ask for what the user wants his username and password to be
		usernameA = JOptionPane.showInputDialog(jf,
				"Create a username:\n\n");
		String usernameC = usernameA;
		
		passwordA = JOptionPane.showInputDialog(jf,
				"Create a password:\n\n");
		String passwordC = passwordA;

		//Create loop, saying that it won't be until "booleanString" is set to something
		//other than 1 that this loop will stop
		while (booleanMain)
		{
			//Have user enter username and password that he chose
			usernameB = JOptionPane.showInputDialog(jf,
					"Type in your username:\n\n");
		
			passwordB = JOptionPane.showInputDialog(jf,
					"Type in your password:\n\n");
			
			//Say that if the re-entered username and password are identical to the
			//originals, show the Welcome message and disable the while loop
			if (usernameB.equals(usernameC))
			{
				if (passwordB.equals(passwordC))
				{
					JOptionPane.showMessageDialog(jf,
							"Welcome, " + usernameA + "!");
					booleanMain = false;
				}
			}

			//Say that if anything other than the proper username and password are
			//typed in, display the "Try again" message and keep the input loop running
			else
			{
				JOptionPane.showMessageDialog(jf,
						"Wrong username or password! Please try again!\n\n");
			}
			
		}
		
		System.exit(0);

	}

}
