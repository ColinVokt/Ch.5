package Colin.Vokt;

import java.util.Scanner;

public class Cities {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		
		String city1;
		String city2;
		String city3;
		String city4;
		String city5;
		String temp;
		
		//User prompt city one
		
		System.out.print("Enter the first city:");
		
		//User input city one
		
		city1 = input.nextLine();
		
		//User prompt city two
		
		System.out.print("Enter the second city:");
		
		//User input city two
		
		city2 = input.nextLine();
		
		//User prompt city 3
		
		System.out.print("Enter the third city:");
		
		//User input city 3
		
		city3 = input.nextLine();
		
		//User prompt city 4
		
		System.out.print("Enter the fourth city:");
		
		//User input city 4
		
		city4 = input.nextLine();
		
		//User prompt city 5
		
		System.out.print("Enter the fifth city:");
		
		//User input city 5
		
		city5 = input.nextLine();
		
		
		//if
		if (city1.compareTo(city2)>0) {
			temp = city1;
			city1 = city2;
			city2 = temp;
			
			
		}
		if (city2.compareTo(city3)>0) {
			temp = city2;
			city2 = city3;
			city3 = temp;	
				if (city1.compareTo(city2)>0) {
				temp = city1;
				city1 = city2;
				city2 = temp;
			}
			
		}
		if (city3.compareTo(city4)>0) {
			temp = city3;
			city3 = city4;
			city4 = temp;
			if (city2.compareTo(city3)>0) {
				temp = city2;
				city2 = city3;
				city3 = temp;	
					if (city1.compareTo(city2)>0) {
					temp = city1;
					city1 = city2;
					city2 = temp;
				}
				
			}
			
		}
		if (city4.compareTo(city5)>0) {
			temp = city4;
			city4 = city5;
			city5 = temp;
			if (city3.compareTo(city4)>0) {
				temp = city3;
				city3 = city4;
				city4 = temp;
				if (city2.compareTo(city3)>0) {
					temp = city2;
					city2 = city3;
					city3 = temp;	
						if (city1.compareTo(city2)>0) {
						temp = city1;
						city1 = city2;
						city2 = temp;
					}
					
				}
				
			}
		}
		System.out.println("The cities are sorted in this order "
		+ city1 + " " + city2 +
		" " + city3 + " " +
		city4 + " " + city5);
	}

}
