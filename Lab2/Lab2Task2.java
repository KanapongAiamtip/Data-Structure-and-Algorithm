import java.util.Arrays;

public class Lab2Task2 {
    public static void main(String[] args) {
        int x[][] = { { 10, 12, 50 }, { 45, 98, 32, 2 }, { 78, 10 }, { 48, 45, 80 } };
        System.out.println(Arrays.binarySearch(x[1], 2));
        Arrays.sort(x[1]);
        System.out.println(printArr(x[1]));
        System.out.println(Arrays.binarySearch(x[1], 2));
    }

    static String printArr(int[] arr) {
        String ans = "";
        for (int i = 0; i < arr.length; i++) {
            ans += arr[i] + "";
        }
        return ans;
    }
}
