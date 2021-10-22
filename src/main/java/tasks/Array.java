package tasks;

import java.util.Arrays;

public class Array {

    public static void main(String[] args) {
        sorted(new int[]{1, 2, 3, 1, 2, 1});
    }

    public static void sorted(int[] array) {
        int[] b = Arrays.stream(array).sorted().toArray();
        int a = b[0];
        int c = b[b.length - 2];
        System.out.println(c);
        for (int i : b) {
            if (i != a && i != c) {
                System.out.println(i);
            }
        }
    }


}
