package week1.assignment;

import java.util.Arrays;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		int[] arr1= {1,2,3,4,7,6,8};
		Arrays.sort(arr1);
		for(int i=arr1[0];i<arr1.length;i++)
			{
			if((i+1)!=arr1[i])
				{
				System.out.println("The Missing element is "+(i+1));
		         break;}
		         }
		         
		    

	}

}
