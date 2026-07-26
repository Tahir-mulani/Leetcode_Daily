//String compression	LC 443
import java.util.*;
public class StringCompression443
{
	public static void main(String x[])
	{	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length of Character array");
		int len = sc.nextInt();
		
		System.out.println("Enter length of Character element");
		char ch[] = new char[len];
		for(int i=0;i<len;i++)
		{
			ch[i] = sc.next().charAt(0);
		}
		
		int result = compress(ch);
		System.out.println(result);
	}
	public static int compress(char ch[])
	{
		int i=0; //write pointer
		int j=0; //read pointer
		
		while(j<ch.length)
		{
			char current = ch[j];
			
			int count=0;
			
			// Count consecutive same characters
			while(j<ch.length && ch[j] == current){
					j++;
					count++;
			}
			
			 // Write the character
			ch[i++] = current;
			
			 // Write count only if greater than 1
			if(count > 1)
			{
				String cnt = String.valueOf(count);
				
				for(char chars:cnt.toCharArray()){
					ch[i++] = chars;
				}
			}
		}
		return i;
			
	}
}
		
		
