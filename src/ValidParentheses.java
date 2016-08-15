import java.util.Stack;

/**
 * Created by lld on 16/8/2.
 * tips: when searching in a stack, firstly make sure it is not empty.
 */
public class ValidParentheses {
    public boolean isValid(String s) {
        Stack stack = new Stack();

        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '('||s.charAt(i) == '['||s.charAt(i) == '{') {
                    stack.push(s.charAt(i));
            } else if (s.charAt(i) == ')'||s.charAt(i) == ']'||s.charAt(i) == '}') {
                switch(s.charAt(i)) {
                    case ')':
                        if (stack.empty()) {
                            return false;
                        }
                        else if ((char)stack.pop() != '(') {
                            return false;
                        }
                        break;
                    case ']':
                        if (stack.empty()) {
                            return false;
                        }
                        else if ((char)stack.pop() != '[') {
                            return false;
                        }
                        break;
                    case '}':
                        if (stack.empty()) {
                            return false;
                        }
                        else if ((char)stack.pop() != '{') {
                            return false;
                        }
                        break;
                }
            }else {
                return false;
            }

        }
        if (stack.empty()) {
            return true;
        } else {
            return false;
        }
    }
}
