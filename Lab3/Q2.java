public class Q2 {
    public static void main(String[] args) {
        int data[] = { 4, 2, 15, 9, 12, 5, 10, 1 };
        int out[] = new int[data.length];
        for (int i = 0; i < data.length; i++){
            out[i] = 0;
        }
        int id = 0;
        for (int i = 0; i < data.length; i++) {
            id = findMin(data);
            out[i] = data[id];
            data[id] = 99999999;
            printArray(out);
        }
    }// main

    public static int findMin(int[] d) {
        int min = d[0];
        int id = 0;
        for (int i = 1; i < d.length; i++) {
            if (d[i] < min) {
                min = d[i];
                id = i;
            }
        }
        return id;
    }

    public static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }    
}// class