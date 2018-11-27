package Colin.Vokt;

import java.util.Scanner;

public class Lotterystrings {

	public static void main(String[] args) {
		
		//Generate a lottery #
		String lottery =""+ (int)(Math.random() * 10)+(int)(Math.random() * 10);
		
		//Ask for a guess
		Scanner input = new Scanner(System.in);
		System.out.println("enter your lottery pick (2 digits): ");
		String guess = input.nextLine();
		
		// Get digits from lottery
		char lotteryDigit1 = Character.toUpperCase(lottery.charAt(0));
		char lotteryDigit2 = Character.toUpperCase(lottery.charAt(1));
		
		// Get digits from guess
		char guessDigit1 = Character.toUpperCase(guess.charAt(0));
		char guessDigit2 = Character.toUpperCase(guess.charAt(1));
		
		
		
		
		System.out.println("The lottery number is " + lottery);
		System.out.println(lottery + " " + guess);
		//Print
		if (guess == lottery) {
			System.out.println("Exact match : you win $10,000!");
		}
		else if(guessDigit2 == lotteryDigit1
				&& guessDigit1 == lotteryDigit2) {
			System.out.println("Match all digits: you win $3,000");
		}
		
		else if(guessDigit2 == lotteryDigit1
				|| guessDigit1 == lotteryDigit2 
				|| guessDigit2 == lotteryDigit1 
				|| guessDigit2 == lotteryDigit2) {
			System.out.println("Match one digit: you win $1,000");
		}
		else {
			System.out.println(" You didn't match any of the numbers ");
		}

	}

}
