import java.util.Scanner;

public class BasicArray4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test[] = new int[10];
        for (int i = 0; i < test.length; i++) {
            test[i] = sc.nextInt();
        }
        for (int i = 0; i < test.length; i++) {
            System.out.print(test[i]);
        }
    }
}
