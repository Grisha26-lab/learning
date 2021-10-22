package learning;

public class ArrayTasks {

    public static void main(String[] args) {
        System.out.println(maxOrZero(new int[]{0, 0, -1, 2})); //O(N)

    }

    static int maxOrZero(int[] arr) {
        if (arr.length == 0) {
            return 0;
        }
        int index = 0;
        int maxValue = arr[0];
        while (index < arr.length) {
            if (arr[index] > maxValue) {
                maxValue = arr[index];
            }
            index++;
        }
        return maxValue;
    }



}
