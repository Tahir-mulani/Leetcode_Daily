//Longest Substring Without Repeatating Characters
import java.util.Scanner;
public class Longest_substring_Without_RepeatatingAPP
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String str = sc.nextLine();
        int result = lengthOfLongestSubstring(str);
        System.out.println(result);
    }
	public static int lengthOfLongestSubstring(String s)
	{
        int left = 0,right=0; //two pointers

        int arr[] = new int[256];
		int maxLength = 0;
        while(right < s.length())
        {
            char currentChar = s.charAt(right);
            int currentCharAscii = (int)currentChar;
            arr[currentCharAscii] = arr[currentCharAscii]+1;

            while(arr[currentCharAscii] > 1)
            {
               char leftChar = s.charAt(left);
               int leftCharAcii = (int)leftChar;

               arr[leftCharAcii] = arr[leftCharAcii]-1;
               left++;
            }

            int currentWindow = right - left +1;
            if(currentWindow > maxLength)
            {
               maxLength = currentWindow;
            }
            right++;
        }
        return maxLength;
    }
}