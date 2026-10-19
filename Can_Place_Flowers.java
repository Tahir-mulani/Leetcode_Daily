/*
leetcode 605 Can Place Flowers
You have a long flowerbed in which some of the plots are planted, and some are not. However, flowers cannot be planted in adjacent plots.

Given an integer array flowerbed containing 0's and 1's, where 0 means empty and 1 means not empty, and an integer n, return true if n new flowers can be planted in the flowerbed without violating the no-adjacent-flowers rule and false otherwise.
Example 1:

Input: flowerbed = [1,0,0,0,1], n = 1
Output: true
*/
import java.util.*;
public class Can_Place_Flowers
{
   public static void main(String x[])
   {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter array size");
	int size = sc.nextInt();
	System.out.println("Enter array element");
	int flowerbed[] = new int[size];
	for(int i=0;i<size;i++)
	{
	    flowerbed[i] = sc.nextInt();
	}
	System.out.println("Enter New Flowers");
	int n = sc.nextInt();
	System.out.println(canPlaceFlowers(flowerbed,n));
	
   }
   public static boolean canPlaceFlowers(int[] flowerbed, int n)
   {
	for(int i=0;i<flowerbed.length;i++)
	{
	    if(flowerbed[i] == 0)
	    {
		boolean leftEmpty = (i == 0 || flowerbed[i - 1] == 0);
                boolean rightEmpty = (i == flowerbed.length - 1 || flowerbed[i + 1] == 0);
                
                if (leftEmpty && rightEmpty) {
                    flowerbed[i] = 1;
                    n--;
                }
	    }
	}
	return n<=0;        
   }
}
