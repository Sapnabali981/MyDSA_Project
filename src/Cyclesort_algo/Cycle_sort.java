package Cyclesort_algo;

import java.util.Arrays;

public class Cycle_sort {
	public static void main(String[] args) {
		
		int arr[]={5,4,3,2,1};
		
		CycleSort(arr);
		System.out.println(Arrays.toString(arr));
		
	}
	
	static void CycleSort(int arr[]) {
		System.out.println("sorting begans");
		
		int i=0;
		
		while(i<arr.length) {
			/*
			 * I need to find the correct index of an every element while i is iteraing
			 * as well as need to find the every single index is holding correct element or not.
			 */
			int correctIndex=arr[i]-1;
			System.out.println("iterations started..");
			if(arr[i]!=arr[correctIndex]) {
				System.out.println("inside if else.");
				swap(i,correctIndex,arr);
				}
			else {
				System.out.println("the value of i is incremented");
				i++;
				
			}
		}
		
	}
	 static void swap(int i, int correctIndex, int[] arr) {
		// TODO Auto-generated method stub
		System.out.println("Swapping");
		int temp;
		temp=arr[i];
		arr[i]=arr[correctIndex];
		arr[correctIndex]=temp;
		
	}

}
