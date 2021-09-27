import java.util.*;

public class Bracket {

    public static boolean checkBalance(String brac) {
        if (brac.charAt(0) == '{')
            return false;

        Stack<Character> stack = new Stack<Character>();

        char c;
        for (int i = 0; i < brac.length(); i++) {
            c = brac.charAt(i);

            if (c == '(')
                stack.push(c);
            else if (c == '{')
                stack.push(c);
            else if (c == ')')
                if (stack.empty())
                    return false;
                else if (stack.peek() == '(')
                    stack.pop();
                else
                    return false;
            else if (c == '}')
                if (stack.empty())
                    return false;
                else if (stack.peek() == '{')
                    stack.pop();
                else
                    return false;
        }
        return stack.empty();
    }

    public static void main(String[] args) {
        String brac = (String) input();
        if (checkBalance(brac)) {
            System.out.println("correct");
        } else {
            System.out.println("incorrect");
        }
    }

    private static Object input() {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        return s;
    }
}
