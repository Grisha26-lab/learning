package learning;

public class BubbleSort {

    public static void main(String[] args) {
        //order relation
        //stable

        int arr[] = new int[] { 1, 5, 1, 3, 8, 4 };
        sort(arr);

        for (int e : arr) {
            System.out.println(e);
        }

        // 1 5 1 3 8 4
        // 1 5 1 3 4 8
        // 1 1 3 4 5 8
        // 1 1 3 4 5 8

        //memory: O(N)
        //complex: O(N^2)
    }

    static void sort(int[] arr) {
        boolean hadSwaps = true;
        while (hadSwaps) {
            hadSwaps = false;
            int index = 0;
            while (index < arr.length - 1) {
                int current = arr[index];
                int next = arr[index + 1];
                if (current > next) { //stable
                    arr[index] = next;
                    arr[index + 1] = current;
                    hadSwaps = true;
                }
                index++;
            }
        }

    }

}
