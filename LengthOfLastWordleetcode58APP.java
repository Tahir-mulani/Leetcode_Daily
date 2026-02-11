public class LengthOfLastWordleetcode58APP
{
	public static void main(String x[])
	{
		String s = "Hello World";
		int length = lengthOfLastWord(s);
		System.out.println("Length of Last Word = "+length);
	
		
	}
	public static int lengthOfLastWord(String s)
	{
        
       s = s.trim();
       int lastspace = s.lastIndexOf(" ");
       return s.length()-lastspace-1;
    }
}