public class Q3 {
    public static void main(String[] args) {
        int data[]= {4,2,15,9,12,5,10,1};
        insertionSort(data);
    }
    
    public static void insertionSort(int array[]) {
        for (int j = 1; j < array.length; j++) {
            int current = array[j];
            int i = j-1;
            while ((i > -1) && (array[i] > current)) {
                array[i+1] = array[i];
                i--;
            }
            array[i+1] = current;
            printArray(array);
        }
    }

    private static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}