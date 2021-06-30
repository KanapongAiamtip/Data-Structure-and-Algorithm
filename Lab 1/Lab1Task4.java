import java.util.Scanner;

public class Lab1Task4 {

    public static void main(String[] args) {
        int arr[] = getData(5);

        System.out.println(printArr(arr));
    }

    private static String printArr(int[] a) {
        String ans = "";
        for (int i = 0; i < a.length; i++) {
            ans += a[i] + " ";
        }
        return ans;
    }

    private static int[] getData(int a) {
        Scanner sc = new Scanner(System.in);
        int x[] = new int[a];
        for (int i = 0; i < a; i++) {
            x[i] = sc.nextInt();
        }
        return x;
    }
}