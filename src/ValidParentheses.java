import java.util.Stack;
public class ValidParentheses {
    public boolean isValid(String s){
        Stack <Character> OnlyParentheses =  new Stack<>();
        for(int i=0;i<s.length();i++){
            char parentheses = s.charAt(i);
            if(parentheses== '('||parentheses=='{'||parentheses=='['){
                OnlyParentheses.push(parentheses);
            }
            else if(parentheses==')'&&!OnlyParentheses.isEmpty()&&OnlyParentheses.peek()=='('){
                OnlyParentheses.pop();
            }
            else if(parentheses=='}'&&!OnlyParentheses.isEmpty()&&OnlyParentheses.peek()=='{'){
                OnlyParentheses.pop();
            }
            else if(parentheses==']'&&!OnlyParentheses.isEmpty()&&OnlyParentheses.peek()=='['){
                OnlyParentheses.pop();
            }
            else{
                return false;
            }
        }
        return OnlyParentheses.isEmpty();
    }
}