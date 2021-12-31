package week1.assignment;

import java.util.Arrays;

public class SecondSmallestNumber {

	public static void main(String[] args) {
		int[] arr1= {23,45,67,32,98,22};
		Arrays.sort(arr1);
		int x=arr1.length;
		System.out.println("The second smallest element in a given array is "+arr1[1]);
		System.out.println("The second largest element in a given array is "+arr1[x-2]);
		

	}

}
