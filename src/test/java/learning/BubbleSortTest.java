package learning;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BubbleSortTest {

    @Test
    public void test() {
        int arr[] = new int[]{1, 5, 1, 3, 8, 4};
        BubbleSort.sort(arr);
        Assertions.assertArrayEquals(new int[]{1, 1, 3, 4, 5, 8}, arr);
    }

}
