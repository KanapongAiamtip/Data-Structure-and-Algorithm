import java.util.Scanner;

public class Lab1Task7 {
    public static void main(String[] args) {
        int arr[] = getData(10);

        System.out.println(printArr(arr));
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max > arr[i]) {
                max = arr[i];
            }
        }
        System.out.println("max = " + max);
    }

    private static String printArr(int[] a) {
        String ans = " ";
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