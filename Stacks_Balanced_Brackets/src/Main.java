import java.util.*;

public class Main {

    private static boolean isBalanced(String expression) {
        HashMap<Character, Character> brackets = new HashMap<>();
        brackets.put('{', '}');
        brackets.put('[', ']');
        brackets.put('(', ')');
        Stack<Character> st = new Stack<>();
        for(char brack : expression.toCharArray()){
            if(brackets.containsKey(brack)){
                st.push(brack);
            }else{
                if(st.empty() || brackets.get(st.peek()) != brack){
                    return false;
                }
                st.pop();
            }
        }

        return st.empty();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int a0 = 0; a0 < t; a0++) {
            String expression = in.next();
            System.out.println( (isBalanced(expression)) ? "YES" : "NO" );
        }
    }
}
/*
1
boolean empty()

Tests if this stack is empty. Returns true if the stack is empty, and returns false if the stack contains elements.

2
Object peek( )

Returns the element on the top of the stack, but does not remove it.

3
Object pop( )

Returns the element on the top of the stack, removing it in the process.

4
Object push(Object element)

Pushes the element onto the stack. Element is also returned.

5
int search(Object element)

Searches for element in the stack. If found, its offset from the top of the stack is returned. Otherwise, .1 is returned.
*/