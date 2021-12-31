package week1.assignment;

public class ConvertNumber {

	public static void main(String[] args) {
		int x=-20;
		if(x>0)
			System.out.println("Given number "+x+" is a positive number");
		else
			if(x<0)
			System.out.println("Given number "+x+" is a negative number. "+"The conversion :"+(x*-1));
			else
				System.out.println("Given number "+x+" is neither positive nor a negative number");
	
	}

}
