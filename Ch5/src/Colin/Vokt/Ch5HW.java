package Colin.Vokt;

import java.util.Scanner;

public class Ch5HW {

	public static void main(String[] args) {
		
		//Project #1 character for ASCII
		Scanner input = new Scanner(System.in);
		System.out.println("Input a Integer");
		int number = input.nextInt();
		System.out.println((char)number);
		
		System.out.println("--------------------------------");

		//Project #2 Unicode of a character
		Scanner input1 = new Scanner(System.in);
		System.out.println("Input a Character");
		char letter = input1.nextLine().charAt(0);
		int x = (int)letter;
		System.out.println(x);
		
		System.out.println("--------------------------------");
		
		//Project #3 Integer into hex digit
		Scanner input2 = new Scanner(System.in);
		
		System.out.println("Enter 3 hex digits 0-9 or A-F");
		String hexString = input.nextLine();
		
		int value1 = 0;
		int value2 = 0;
		int value3 = 0;
		if (hexString.length() != 3) {
			System.out.println("You must enter exactly three character");
			System.exit(3);
		}
		char ch1 = Character.toUpperCase(hexString.charAt(0));
		char ch2 = Character.toUpperCase(hexString.charAt(1));
		char ch3 = Character.toUpperCase(hexString.charAt(2));
		if (ch1 <= 'F' && ch1>='A') {
			 value1 = ch1 -'A'+10;
			
		}
		else if (Character.isDigit(ch1)) {
			value1 = ch1;
			
		}
		if (ch2 <= 'F' && ch2>='A') {
			value2 = ch2 -'A'+10;
			
		}
		else if (Character.isDigit(ch2)) {
			value2 = ch2;
			
		}
		if (ch3 <= 'F' && ch3>='A') {
			value3 = ch3 -'A'+10;
			
		}
		else if (Character.isDigit(ch3)) {
			value3 = ch3;
			
		}
		
		else {
			System.out.println( " is an invalid input");
		}
		System.out.print(value1);
		System.out.print(value2);
		System.out.print(value3);
		
		//Project #4
		
	}

}
