import java.util.Scanner;

public class PrimeNumbers_program {

	public static void main(String[] args) {
		/*
		 * write a program to check whether the given number is prime or not
		 * basically prime numbers are those numbers which are divided by 1 and itself
		 * non prime numbers get divided by itself 1 and another numbers as well
		 * let suppose we have a number 6 
		 * 6 is basically divided by 2,3,6,1
		 * so in order to check whether given number is prime or not we will create an a certain range
		 * exclude 1 and 6 from these ranges
		 * so we have to check divisors ranging from 2 to n-1 which is 2 to 5.
		 * if some divisor is dividing my number 6 then the number 6 is non prime number
		 * so in this case yes 6 is a non prime number
		 * 
		 */
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		//creating a range for checking divisiblity of n which certain divisior
		int div=2;
		//unless and until the n is equal to div loop checking should happen
		while(n>div) {
			System.out.println("Iterations begans");
			if(n%div==0) {
				System.out.println("PRIME NUMBERS");
			}
			else {
				div=div+1;
			}
			
		}
		
		System.out.println("Prime numbers");
		
	}
}
