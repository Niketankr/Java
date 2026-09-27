class Solution {
    public String reverseParentheses(String s) {
        java.util.Stack<StringBuilder> stack = new java.util.Stack<>();
        StringBuilder current = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (c == '(') {
                stack.push(current);
                current = new StringBuilder();
            } 
            else if (c == ')') {
                current.reverse();
                StringBuilder previous = stack.pop();
                previous.append(current);
                current = previous;
            } 
            else {
                current.append(c);
            }
        }

        return current.toString();
    }
}