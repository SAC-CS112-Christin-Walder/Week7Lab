import java.util.Scanner;

import javax.swing.JOptionPane;

public class Lab1
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		int randomNum = 0 + (int)(Math.random() * 10);
		
		String message;
		
		String userInput =
			JOptionPane.showInputDialog("Guess an integer (0-10): ");
				
		int userNum = Integer.parseInt(userInput);
			
		if((userNum<0)||(userNum>10)) { 
			message = String.format("Your input is invalid");
			JOptionPane.showMessageDialog(null, message); }
		
		else {
		
			if (userNum > randomNum) {
				message = String.format("Your integer is too big!\n\nYour guess: %d\nCorrect integer: %d", userNum, randomNum);
				JOptionPane.showMessageDialog(null, message);}
			
			else if (userNum < randomNum) {
				message = String.format("Your integer is too small!\n\nYour guess: %d\nCorrect integer: %d", userNum, randomNum);
				JOptionPane.showMessageDialog(null, message); }
			
			else if (userNum==randomNum) {
				message = String.format("Your integer is correct!\n\nYour guess: %d\nCorrect integer: %d", userNum, randomNum);
				JOptionPane.showMessageDialog(null, message); }
		
		}
	}

}