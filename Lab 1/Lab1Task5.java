import java.util.Scanner;

public class Lab1Task5 {
    public static void main(String[] args) {
        int arr[] = getData(3);
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println(printArr(arr));
        System.out.println("sum = " + sum);
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