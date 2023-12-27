import java.util.Scanner;

public class String_Concatenation {
	public static void main(String[] args) {
		/*
		 * we can concate string value with an integer
		 * take input roll no from user
		 * and print output in console.
		 */
		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter your roll no");
//		int rollNo=sc.nextInt();
//		System.out.println("Your roll no is:"+ (rollNo));
		/*
		 * the range of byte is 256
		 * can we assign values more than 256 in byte type variable
		 * yes we can
		 */
//		int a1=258;
//		byte b1=(byte)a1;
//		System.out.println("The value of b1 is"+b1);
		/*
		 * here byte can only store values upto 256 so if we are trying to store values more than 256 then 
		 * 258 gets divided by 256 then 2 will get stored inside the b1
		 */
		/*
		 * can we store character value in integer type variable let's see
		 */
//		int var='A';
//		System.out.println(var);
		/*
		 * here java follows unicode approach and converts A to 65
		 */
		/*
		 * how to take a string word input from user
		 */
//		System.out.println("Enter your string word");
//		String str=sc.next();
//		
//		System.out.println("value of string word is:"+str);
		/*
		 * in order to take entire string sentences as a input from the user
		 * kindly make use of nextLine function of scanner class
		 */
		System.out.println("Enter your sentences");
		String sen=sc.nextLine();
		System.out.println(sen);
	}
	

}
