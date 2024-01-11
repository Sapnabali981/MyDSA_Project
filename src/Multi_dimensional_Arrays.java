import java.util.Scanner;

public class Multi_dimensional_Arrays {
	public static void main(String[] args) {
		/*
		 * multi dimensional array is a array where elements are arranged in form of row and columns..
		 * arrays of array is called as 2d array
		 * here one big array is going to have multiple small arrays.
		 * in order to fetch the elements of array we will make use of index value.. 
		 */
		//creating 2d array
		int a[][]= {{2,3,4,5},{4,6,7,8},{4,5,6,7}};
		//accessing element 3 with the help of index value
		System.out.println(a[0][1]);
		/*
		 * creating a 2d array and taking input from user storing value in array..
		 * here we are not aware about the values of an array so we will be providing size of rows and columns.
		 */
		int b[][]=new int[3][3];
		//using scanner class object to take input from user
		Scanner sc=new Scanner(System.in);
		System.out.println("Input all the array elements");
		//this outer for loop is for rows
	for(int i=0;i<b.length;i++) {
		//inner for loop is for columns..
		for(int j=0;j<b[i].length;j++){
		b[i][j]=sc.nextInt();
		/*
		 * with every iteration value entered by user will get stored inside the specified index value of an array..
		 */
	}
		System.out.println();
	
		//after every rows I want my cursor to be in next line..
		
	}
	
//showing output of an array elements to user
	for(int i=0;i<b.length;i++) {
		for(int j=0;j<b.length;j++) {
			System.out.print(b[i][j] + " ");
		}
		System.out.println();
	}
	}
	
}