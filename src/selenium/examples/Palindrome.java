package selenium.examples;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n=s.nextInt();
		
		int r,sum=0,temp;
		temp = n;
		while (n>0)
		{
			r=n%10; 
			sum=(sum*10)+r;
			n=n/10;
		}
		if (temp==sum) {
			System.out.println("Number is Palindrome");
		}
		else
		{
			System.out.println("Number is not Palindrome");
		}
		s.close();
			
	}

}
