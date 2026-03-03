import java.util.*;
public class ValidParentheses20APP {
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String Parentheses  (),[],{} ");
		String s = sc.nextLine();
		
		if(isValid(s)){
			System.out.println("Valid");
		}
		else{
			System.out.println("InValid");
		}
	}
    public static boolean isValid(String s) {
        
        Map<Character,Character> map = new HashMap<>();
        map.put(')','(');
        map.put('}','{');
        map.put(']','[');

        Stack<Character> stack = new Stack<>();
        
        if (s.length() % 2 != 0) return false;
		
        
        for(char ch: s.toCharArray()){
            if(map.containsValue(ch)){
                stack.push(ch);
            }
            else{
                if(stack.isEmpty() || stack.pop() != map.get(ch)){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}