import java.util.Arrays;
import java.util.Scanner;

public class Arrays_ID {
	public static void main(String[] args) {
		/*
		 * Arrays are used to store multiple values of same data type..
		 * Arrays can be of following types 1D 2D and 3D
		 * We can fetch the array elements based on index value..
		 */
		//when we are already aware about the values then we can make use following below syntax to create an array
		int a[]= {3,2,4,6,5};
		//based on index value we can fetch the element of an Array..
		//let suppose I want to fetch the value of an array at index 2
		System.out.println(a[2]);
		//let suppose I'm not aware about the values then How can I create an array
		//in this case we will be specifying the size of an array..
		int b[]=new int[4];
		//so size is 4 then we can store 4 elements in an given array which is of type int..
		//assigning values in a array from taking user input..
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<b.length;i++) {
			b[i]=sc.nextInt();
		}
		for(int j=0;j<b.length;j++) {
			System.out.println(b[j]);
		}
		/*
		 * if we want to display an array elements in the form of String we can do that
		 */
		System.out.println(Arrays.toString(b));
		/*
		 * if we want to create an array of type String can be do that
		 * yes we can here String is basically a predefined class which will following inbuilt methods as well
		 */
		String str[]=new String[3];
		System.out.println(str[1]);//null
		/*
		 * by default value of string is null and integer is 0
		 */
	}

}
