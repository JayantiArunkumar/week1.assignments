package week1.assignment;

public class Palindrome {

	public static void main(String[] args) {
		int num=12345, count=0;
		String s=Integer.toString(num);
		int x=s.length();
		int y=s.length()-1;
		for(int i=0;i<(x/2);i++)
		{
			if(s.charAt(i)==s.charAt(y))
			{ y--;
			  count++;
			  }
		}
		if(count==(x/2))
			System.out.println("Given number "+num+"is a palindrome");
		else
			System.out.println("Given number "+num+"is not a palindrome");







	}

}
