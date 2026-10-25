/*
leetcode 1456 Maximum Number Of Vowels In Substring Of Given Length
Given a string s and an integer k, return the maximum number of vowel 
letters in any substring of s with length k.
Vowel letters in English are 'a', 'e', 'i', 'o', and 'u'.
Example 1:
Input: s = "abciiidef", k = 3
Output: 3
Explanation: The substring "iii" contains 3 vowel letters.
*/
import java.util.*;
public class Maximum_Number_Of_Vowels_In_Substring_Of_Given_Length
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String s = sc.nextLine();
		System.out.println("Enter k");
		int k=sc.nextInt();
		System.out.println(maxVowels(s,k));		
	}
	public static int maxVowels(String s, int k)
	{
		int count=0;
		int max=0;
		for(int i=0;i<k;i++)
		{
			char ch = s.charAt(i);
			if(ch == 'A' || ch == 'a' || ch == 'E' || ch == 'e'|| 
			   ch == 'i' || ch == 'I' || ch == 'o' || ch == 'O'|| 
			   ch == 'u' || ch == 'U'){
				 count++;	
			}
		}
		max = count;
		for(int i=k;i<s.length();i++)
		{
			char remove = 	s.charAt(i-k);
			if(remove == 'A' || remove == 'a' || remove == 'E' || remove == 'e'|| 
			   remove == 'i' || remove == 'I' || remove == 'o' || remove == 'O'|| 
			   remove == 'u' || remove == 'U'){
				 count--;	
			}
			char ch=s.charAt(i);
			if(ch == 'A' || ch == 'a' || ch == 'E' || ch == 'e'|| 
			   ch == 'i' || ch == 'I' || ch == 'o' || ch == 'O'|| 
			   ch == 'u' || ch == 'U'){
				 count++;	
			}
			
			max = Math.max(max,count);
		}
		return max;
    }
}

