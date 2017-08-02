import java.util.Stack;
public class Solution{

	public static boolean check(String s){
		Stack<Character> stack = new Stack<>(); 
		int len = s.length();
		char[] source = s.toCharArray(); // transfer string to a char array.

		for(int i = 0; i < len; i++){
			if(source[i] == '(') stack.push(')');
			else if(source[i] == '[') stack.push(']');
			else if(source[i] == '{') stack.push('}');
			else if(stack.isEmpty() || stack.pop() != source[i]) return false; //That either condition is true will lead the result to become false.  
		}

		return stack.isEmpty();
	}

	public static void main(String[] args){
		String source = "[()]{}{[()()]()}";
		System.out.println(check(source));
	}
}