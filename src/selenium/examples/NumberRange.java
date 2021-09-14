package selenium.examples;

import java.util.Scanner;

public class NumberRange {
	
	public static void main(String[] args) {
		
		
		Scanner s = new Scanner(System.in);
		for (int i = 0; i < 3; i++) {
		
		System.out.println("Enter a Number: ");
		int num = s.nextInt();
		if (num > 99 && num < 1000) 
		{
			System.out.println("Number of digits : 3");
		}
		else if (num > 0 && num < 100)
		{
			System.out.println("Number of digits : 2");
		}
		else if (num > 999 && num <10000)
		{
			System.out.println("Number of digits : 4");
		}
		else if (num > 9999 && num <100000)
		{
			System.out.println("Number of digits : 5");
		}
		else
		{
			System.out.println("Out of range");
		}
			
	  }
	}

}
