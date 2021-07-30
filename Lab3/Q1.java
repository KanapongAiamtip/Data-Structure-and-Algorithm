public class Q1 {
    public static void main(String[] args) {
        int data[] = { 4, 2, 15, 9, 12, 5, 10, 1 };
        int tmp = 0;
        for (int i = 0; i < data.length; i++) {
            for (int j = data.length - 2; j >= 0; j--) {
                if (data[j + 1] > data[j]) {
                    tmp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = tmp;
                } // if
            } // for j
            printArray(data);
        } // for i
    }// main

    public static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}// class