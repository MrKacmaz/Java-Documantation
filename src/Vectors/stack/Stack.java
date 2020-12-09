package Vectors.stack;

import java.util.Arrays;

public class Stack {
    /**
     * LAST IN FIRST OUT
     * <p>
     * push , pop , peek , top , size , isEmpty , elementAt
     */

    public static void main(String[] args) {


        java.util.Stack<Integer> integerStack = new java.util.Stack<>();
        integerStack.push(8);
        integerStack.push(88);
        integerStack.push(80);
        System.out.println(Arrays.toString(integerStack.toArray()));
        integerStack.pop();
        integerStack.push(68);
        System.out.println(integerStack.peek()); // return last element
        System.out.println(Arrays.toString(integerStack.toArray()));
        System.out.println(integerStack.elementAt(0));

    }

    public static boolean isMatched(String expression) {
        final String open = "{([";
        final String close = "])}";
        java.util.Stack<Character> stack = new java.util.Stack<>();
        for (char c : expression.toCharArray()) {
            if (open.indexOf(c) != -1) {
                stack.push(c);
            } else if (close.indexOf(c) != -1) {
                if (stack.isEmpty()) {
                    return false;
                }
            }
            if (close.indexOf(c) != open.indexOf(stack.pop())) {
                return false;
            }
        }
        return stack.isEmpty();
    }
}

