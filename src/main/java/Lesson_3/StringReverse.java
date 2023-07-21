package Lesson_3;


import Lesson_3.stack.Stack;
import Lesson_3.stack.StackImpl;

public class StringReverse {
    public static String stringReverse(String string){
        int length = string.length();
        Stack<Character> stack = new StackImpl<>(length);
        for (int i = 0; i < length; i++) {
            stack.push(string.charAt(i));
            
        }
        StringBuilder result = new StringBuilder();
        while (!stack.isEmpty()){
            result.append(stack.pop());
        }

        return result.toString();
        
    }
    
}
