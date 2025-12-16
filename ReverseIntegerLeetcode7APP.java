import java.util.*;
public class ReverseIntegerLeetcode7APP
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		int x = sc.nextInt();
		
		System.out.println("Before Reverse "+x);
		
		System.out.println("After Reverse "+reverse(x));
	}
	public static int reverse(int x)
	{
		long rev=0;
		while(x!=0)
		{
			long rem = x % 10;
			rev = rev * 10 + rem;
			x  = x / 10;
		}
		if((rev > Integer.MAX_VALUE) || (rev < Integer.MIN_VALUE))
		{
			return 0;
		}
		
		return (int)rev;
	}
}
			
		