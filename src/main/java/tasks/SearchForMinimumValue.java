package tasks;

public class SearchForMinimumValue {
    public static void main(String[] args) {
        int[] array = {4, 5, 2, 11, 33, 44, 667, 889, 90, 21};
        search(array);
    }

    public static void search(int[] array) {
        int minValue = array[0];
        int minIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < minValue) {
                minValue = array[i];
                minIndex = i;
            }
        }
        System.out.println("minValue = " + minValue);
        System.out.println("index = " + minIndex);
    }


}
