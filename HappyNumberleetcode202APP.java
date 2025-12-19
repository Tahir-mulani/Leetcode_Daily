import java.util.*;
public class HappyNumberleetcode202APP
{
	public static void main(String x[])
	{	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int n = sc.nextInt();
		
		int temp = n;
		int sum = 0 ;
		
		while(temp !=1 && temp !=4)
		{
			sum=0;
			
			while(temp>0)
			{
				int digit = temp %10;
				sum =sum + (digit * digit);
				temp = temp/10;
			}
			temp = sum;
		}
		
		if(temp == 1)
		{
			System.out.println(n+" is Happy number");
		}
		else
		{
			System.out.println(n+" is not Happy Number");
		}
	}
}	
		
/*
//Solved on leetcode.
    public boolean isHappy(int n) {
      int slow = n;
      int fast =n;

      do{
        slow = squareSum(slow);
        fast = squareSum(squareSum(fast));

      }while(slow != fast);
      return slow == 1; 
    }
    private int squareSum(int n){
        int sum = 0;
        while(n > 0){
            int d = n% 10;
            sum += d* d;
            n /=10;
        }
        return sum;
    }
}
*/