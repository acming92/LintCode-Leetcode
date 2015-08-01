import java.util.*;

public class ValidParentheses {
	
	char[] font = {'(', '{', '['};
	char[] back = {')', '}', ']'};
	
	public boolean isValid(String s){
		
		if(s == null) return true;
		if(s.length() == 0) return true;
		
		Stack stack = new Stack();
		
		for(int i = 0; i < s.length(); ++i){
			if(isFront(s.charAt(i))){
				stack.push(s.charAt(i));
			}
			else if(isBack(s.charAt(i))){
				if(stack.isEmpty()) return false;
				char a = (char)stack.pop();
				if(!isEqual(a, s.charAt(i))){
					return false;
				}
			}
		}
		if(!stack.isEmpty()) return false;
		return true;
	}
	
	public boolean isEqual(char a, char b){
		if(a == '(' && b == ')') return true;
		if(a == '{' && b == '}') return true;
		if(a == '[' && b == ']') return true;
		return false;
	}
	
	public boolean isFront(char c){
		for(int i = 0; i < font.length; ++i){
			if(c == font[i]){
				return true;
			}
		}
		
		return false;
	}
	
	public boolean isBack(char c){
		for(int i = 0; i < back.length; ++i){
			if(c == back[i]){
				return true;
			}
		}
		
		return false;
	}
	
	
	public static void main(String[] args){
		ValidParentheses temp = new ValidParentheses();
		String a = "()";
		System.out.println(temp.isValid(a));
	}
}
