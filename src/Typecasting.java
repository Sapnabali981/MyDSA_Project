import java.util.Scanner;

public class Typecasting {

	
	public static void main(String[] args) {
		/*
		 * type casting is a process of converting one data's type into another
		 * for example
		 * let's take float value from user store it in float type variable
		 * let's take integer value from user and store it in float type variable
		 */
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter float value");
//		float f=sc.nextFloat();
//		System.out.println("Enter integer value");
//		float d=sc.nextFloat();
//		System.out.println(f);
//		System.out.println(d);
		/*
		 * can we take float value as input from user and assign it in integer variables
		 * let's see
		 */
//		System.out.println("Enter float value");
//	float f=sc.nextFloat();
//	int n=(int)f;
	/*
	 * here I'm typecasting the float type data into integer type data and store it in integer variable
	 */
		/*
		 * no we cannot store float value into integer variable
		 */
//		System.out.println(n);
		//creating an object
		Typecasting ty=new Typecasting ();
		Typecasting b;
		b=ty;
		/*
		 * now ty and b both are pointing to same object right.
		 */
		System.out.println(ty);
		System.out.println(b);
		
		/*
		 * what if I'm making some changes creating another object
		 * making ty to refer to a new object now
		 * then what happens to old object
		 * it will get garbage collected by java in order to take memory back as it is of no use
		 */
		ty=new Typecasting();
		System.out.println(ty);
		b=ty;
		System.out.println(b);
	}
}
