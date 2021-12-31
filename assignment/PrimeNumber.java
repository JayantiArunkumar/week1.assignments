package week1.assignment;

public class PrimeNumber {

	public static void main(String[] args) {
		int x=13;
		boolean isprime=true;
		if(x>0) 
		{ for(int i=2;i<x;i++)
		{
			if(x%i==0)
				isprime=false;
			 break;
		}
		if(isprime)	
			System.out.println("Given number "+x+" is a prime number");
		else
			System.out.println("Given number "+x+" is a  not prime number");	
		
		}
		else
			System.out.println("Given number is invalid");

	}

}
