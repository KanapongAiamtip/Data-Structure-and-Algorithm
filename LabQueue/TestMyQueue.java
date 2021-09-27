import java.util.*;

public class TestMyQueue {
    public static void main(String[] args) {
        MyQueue q = new MyQueue(10);
        q.enqueue(input());
        q.enqueue(input());
        q.enqueue(input());
        q.enqueue(input());
        System.out.println(q.toString());
        q.dequeue();
        System.out.println(q.toString());
    }

    private static Object input() {
        Scanner in = new Scanner(System.in);
        System.out.print("input string to MyQueue:");
        String s = in.nextLine();
        return s;
    }
}
