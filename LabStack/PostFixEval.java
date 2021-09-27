import java.util.*;

public class PostFixEval {
    protected static double evalPostfix(String express) {
        Stack<Double> st = new Stack<>();

        for (int i = 0; i < express.length(); i++) {
            char ch = express.charAt(i);

            if (Character.isDigit(ch))
                st.push((double) (ch - '0'));

            else {
                double value1 = st.pop();
                double value2 = st.pop();

                switch (ch) {
                    case '+':
                        st.push(value2 + value1);
                        break;

                    case '-':
                        st.push(value2 - value1);
                        break;

                    case '*':
                        st.push(value2 * value1);
                        break;
                    case '/':
                        st.push(value2 / value1);
                        break;
                }
            }
        }
        return st.pop();
    }

    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
            System.out.println("Answer = " + evalPostfix((String) input()));
        }
    }

    private static Object input() {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        return s;
    }
}