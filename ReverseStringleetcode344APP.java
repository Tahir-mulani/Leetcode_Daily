import java.util.*;

public class ReverseStringleetcode344APP {
    public static void main(String x[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter String");
    
        String input = sc.nextLine();

        char s[] = input.toCharArray();
         
        reverseString(s);
        sc.close();
    }

    public static void reverseString(char[] s) {
        for (int i = 0; i < s.length / 2; i++) {
            char temp = s[i];
            s[i] = s[s.length - 1 - i];
            s[s.length - 1 - i] = temp;
        }
        System.out.println(s);
        
    }
    
}
