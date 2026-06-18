//1. Valid Parentheses 
class Solution {
    public boolean isValid(String s) {
        Deque<Character> coll = new ArrayDeque<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                coll.push(c);
            } else if (coll.isEmpty() || !match(coll.pop(), c)) {
                return false;
            }
        }
        return coll.isEmpty();
    }

    private boolean match(char l, char r) {
        return (l == '(' && r == ')') || (l == '{' && r == '}') || (l == '[' && r == ']');
    }
}