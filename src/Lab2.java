import java.util.Scanner;

import javax.swing.JOptionPane;

public class Lab2
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		int user = 0;
		int computer;
		String repeat;
		
		do {
			String userInput =
					JOptionPane.showInputDialog("Rock, paper or scissors?: ");
			
			userInput = userInput.toUpperCase();
			
			if (userInput.equals("ROCK") || userInput.equals("PAPER") || userInput.equals("SCISSORS"))
			{
				if (userInput.equals("ROCK"))
					user = 1;
				else if (userInput.equals("PAPER"))
					user = 2; 
				else if (userInput.equals("SCISSORS"))
					user = 3;
					
				
				computer = 1 + (int)(Math.random() * 3);
					if (computer==1)
						JOptionPane.showMessageDialog(null,  "Computer: Rock\n\nPress enter to continue");
					else if (computer==2)
						JOptionPane.showMessageDialog(null,  "Computer: Paper\n\nPress enter to continue");
					else if (computer==3)
						JOptionPane.showMessageDialog(null,  "Computer: Scissors\n\nPress enter to continue");
				
				if (user==computer)
					JOptionPane.showMessageDialog(null, "It's a tie!");
				else if ((user==1 && computer==2)||(user==2 && computer==3)||(user==3 && computer==1))
					JOptionPane.showMessageDialog(null, "The computer wins!");
				else if ((user==1 && computer==3)||(user==2 && computer==1)||(user==3 && computer==2))
					JOptionPane.showMessageDialog(null, "You win!");
		
			}
			else 
				System.out.println("Invalid selection");
			
			
		repeat = 
				JOptionPane.showInputDialog("Do you want to play again? (yes or no");
		
		repeat = repeat.toUpperCase();
	
			}
		while (repeat.equals("YES")); 
		
		if (repeat != ("YES"))
			JOptionPane.showMessageDialog(null, "Game over");

} }