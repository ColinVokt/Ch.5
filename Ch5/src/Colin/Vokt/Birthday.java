package Colin.Vokt;
/*
 * Colin Vokt
 * 11/18
 */
import java.util.Scanner;
public class Birthday {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		final int num128 = 128;
		final int num64 = 64;
		final int num32 = 32;
		final int num16 = 16;
		final int num8 = 8;
		final int num4 = 4;
		final int num2 = 2;
		final int num1 = 1;
		
		//sets of numbers
		
		String set1 = "";
		String set2 = "";
		String set3 = "";
		String set4 = "";
		String set5 = "";
		String set6 = "";
		String set7 = "";
		
		//input number
		
		int inputnum = 0;
		
		//Conversion placeholder
		int whatsLeft;
		
		
		
		
		
			//input
		for(int i=0 ; i<127;i++) {
			String biannum = "";
			
			inputnum = inputnum+1;
			
			
			whatsLeft = inputnum;
			//if statement
			
			if (inputnum >= num128) {
				whatsLeft = inputnum - num128;
				biannum = biannum +"1";
			}
			else {
				biannum = biannum+"0";
				
			}
			if (whatsLeft >= num64) {
				whatsLeft = whatsLeft - num64;
				biannum = biannum+"1";
			}
			else {
				biannum = biannum+"0";
			}
			if (whatsLeft >= num32) {
				whatsLeft = whatsLeft - num32;
				biannum = biannum+"1";
			}
			else {
				biannum = biannum+"0";
			}
			if (whatsLeft >= num16) {
				whatsLeft = whatsLeft - num16;
				biannum = biannum+"1";
			}
			else {
				biannum = biannum+"0";
			}
			if (whatsLeft >= num8) {
				whatsLeft = whatsLeft - num8;
				biannum = biannum+"1";
			}
			else {
				biannum = biannum+"0";
			}
			if (whatsLeft >= num4) {
				whatsLeft = whatsLeft - num4;
				biannum = biannum+"1";
			}
			else {
				biannum = biannum+"0";
			}
			if (whatsLeft >= num2) {
				whatsLeft = whatsLeft - num2;
				biannum = biannum+"1";
			}
			else {
				biannum = biannum+"0";
			}
			if (whatsLeft >= num1) {
				whatsLeft = whatsLeft - num1;
				biannum = biannum+"1";
			}
			else {
				biannum = biannum+"0";
			}
			//display
			//System.out.println("The binary number for " +inputnum+ " is "+ biannum);
			
			
			//Check indexing of binary number
			char xnum7 = biannum.charAt(7);
			char xnum6 = biannum.charAt(6);
			char xnum5 = biannum.charAt(5);
			char xnum4 = biannum.charAt(4);
			char xnum3 = biannum.charAt(3);
			char xnum2 = biannum.charAt(2);
			char xnum1 = biannum.charAt(1);
			
			
			//assign to sets
			if (xnum7=='1') {
				set1=set1+inputnum+" ";
			}
			if (xnum6=='1' ) {
				set2=set2+inputnum+" ";
			}
			if (xnum5=='1') {
				set3=set3+inputnum+" ";
			}
			if (xnum4=='1') {
				set4=set4+inputnum+" ";
			}
			if (xnum3=='1') {
				set5=set5+inputnum+" ";
			}
			if (xnum2 == '1') {
				set6=set6+inputnum+" ";
			}
			if (xnum1 == '1') {
				set7=set7+inputnum+" ";
			}
			
			}
		
			// Display the sets
			System.out.println("Set 1: "+set1);
			System.out.println("Set 2: "+set2);
			System.out.println("Set 3: "+set3);
			System.out.println("Set 4: "+set4);
			System.out.println("Set 5: "+set5);
			System.out.println("Set 6: "+set6);
			System.out.println("Set 7: "+set7);
			
			// Get user input for birthday
			System.out.println("\n0: No\n1: Yes\n");
			System.out.print("Is your birthday in Set 1?: ");
			int guess1 = input.nextInt();
			
			System.out.print("Is your birthday in Set 2?: ");
			int guess2 = input.nextInt();
			
			System.out.print("Is your birthday in Set 3?: ");
			int guess3 = input.nextInt();
			
			System.out.print("Is your birthday in Set 4?: ");
			int guess4 = input.nextInt();
			
			System.out.print("Is your birthday in Set 5?: ");
			int guess5 = input.nextInt();
			
			// Calculate birthday based on info
			int finalnum = 0;
			if (guess1 == 1) {
				finalnum +=1;
			}
			if (guess2 == 1) {
				finalnum +=2;
			}
			if (guess3 == 1) {
				finalnum +=4;
			}
			if (guess4 == 1) {
				finalnum +=8;
			}
			if (guess5 == 1) {
				finalnum +=16;
			}
			
			// Determine month
			System.out.print("\nIs your birth month in Set 1?: ");
			int month1 = input.nextInt();
			System.out.print("Is your birth month in Set 2?: ");
			int month2 = input.nextInt();
			System.out.print("Is your birth month in Set 3?: ");
			int month3 = input.nextInt();
			
			int finalmonth = 0;
			if (month1 == 1) {
				finalmonth +=1;
			}
			if (month2 == 1) {
				finalmonth +=2;
			}
			if (month3 == 1) {
				finalmonth +=4;
			}
			
			// Determine year
			System.out.print("\nAre the last 2 digits of your birth year in list 1?: ");
			int year1 = input.nextInt();
			System.out.print("Are the last 2 digits of your birth year in list 2?: ");
			int year2 = input.nextInt();
			System.out.print("Are the last 2 digits of your birth year in list 3?: ");
			int year3 = input.nextInt();
			System.out.print("Are the last 2 digits of your birth year in list 4?: ");
			int year4 = input.nextInt();
			System.out.print("Are the last 2 digits of your birth year in list 5?: ");
			int year5 = input.nextInt();
			System.out.print("Are the last 2 digits of your birth year in list 6?: ");
			int year6 = input.nextInt();
			System.out.print("Are the last 2 digits of your birth year in list 7?: ");
			int year7 = input.nextInt();
			
			int finalyear = 0;
			if (year1 == 1) {
				finalyear += 1;
			}
			if (year2 == 1) {
				finalyear += 2;
			}
			if (year3 == 1) {
				finalyear += 4;
			}
			if (year4 == 1) {
				finalyear += 8;
			}
			if (year5 == 1) {
				finalyear += 16;
			}
			if (year6 == 1) {
				finalyear += 32;
			}
			if (year7 == 1) {
				finalyear += 64;
			}
			
			String finalyearstr;
			
			if (finalyear == 0) {
				finalyearstr = "00";
			}
			else if (finalyear == 1) {
				finalyearstr = "01";
			}
			else if (finalyear == 2) {
				finalyearstr = "02";
			}
			else if (finalyear == 3) {
				finalyearstr = "03";
			}
			else if (finalyear == 4) {
				finalyearstr = "04";
			}
			else if (finalyear == 5) {
				finalyearstr = "05";
			}
			else if (finalyear == 6) {
				finalyearstr = "06";
			}
			else if (finalyear == 7) {
				finalyearstr = "07";
			}
			else if (finalyear == 8) {
				finalyearstr = "08";
			}
			else if (finalyear == 9) {
				finalyearstr = "09";
			}
			
			
			
		
			// Display birthday		
			System.out.println("\nYour birthday is on " + finalmonth + "/" + finalnum + "/" + finalyear);
			
	}

}
