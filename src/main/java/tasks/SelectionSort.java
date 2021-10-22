package tasks;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        int[] array = {222, 11, 42, 560, 88, 9, 11, 55, 65, 33, 889, 44};
        for (int step  = 0; step  <array.length ; step ++) {
            int index = searchMinIndex(array,step);

            int temp = array[step];
            array[step] = array[index];
            array[index] = temp;

            System.out.println(Arrays.toString(array));
        }
    }

    public static int searchMinIndex(int[] array, int start) {
        int minValue = array[start];
        int minIndex = start;
        for (int i = start + 1; i < array.length; i++) {
            if (array[i] < minValue) {
                minValue = array[i];
                minIndex = i;
            }
        }
        return minIndex;
    }
}
