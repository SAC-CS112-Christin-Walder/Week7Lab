import java.util.Scanner;

public class Lab3
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		int user = 0;
		int computer;
		String repeat;
		
		String computerWin = "The computer wins!";
		String userWin = "The user wins!";
		String result="";
		
		do {
			System.out.print("Rock, paper or scissors?: ");
			String userInput=input.next();
			
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
						System.out.println("Computer: Rock");
					else if (computer==2)
						System.out.println("Computer: Paper");
					else if (computer==3)
						System.out.println("Computer: Scissors");
				
				if (user==computer)
					System.out.println("It's a tie!");
				
				else 
					{ switch (user) {
					case 1:
						switch (computer) {
						case 2:
							result = computerWin;
							break;
						case 3:
							result = userWin;
							break; }
					case 2:
						switch (computer) {
						case 1:
							result = userWin;
							break;
						case 3:
							result = computerWin;
							break; }
					case 3:
						switch (computer) {
						case 1:
							result = computerWin;
							break;
						case 2:
							result = userWin;
							break; }
				}
				
				System.out.println(result); }
							
			}
						
			else 
				System.out.println("Invalid selection");
			
			System.out.printf("Do you want to play again? (yes or no): ");
			repeat=input.next();
			repeat = repeat.toUpperCase();
		}
		while (repeat.equals("YES")); 
			if (repeat != ("YES"))
				System.out.print("Game over");
			}

}