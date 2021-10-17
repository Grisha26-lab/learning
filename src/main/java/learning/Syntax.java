package learning;

public class Syntax {

    public static void main(String[] args) {
        //declaration
        int x;
        //assignation, initialization
        //System.out.println(x);
        x = 1; //operator, operands
        System.out.println(x);

        {
            int y = 2;
        }
        //System.out.println(y);

        boolean b = true;
        int[] arr = new int[10];
        arr = new int[] { 1, 2, 3};

        if (b) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }

        while (b) {
            System.out.println("....");
            b = false;
        }

        int a = 10;
        System.out.println(square(a));
        System.out.println(a); //10 vs -1

        int[] arr2 = new int[] {1, 2, 3};
        increaseElement(arr2);
    }

    //method
    static int square(int x) { //sign: name + param types
        int result = x * x;
        x = -1;
        return result;
    }

    static void increaseElement(int[] arr) {
        int index = 0;
        while (index < arr.length) {
            int value = arr[index];
            value++;
            arr[index] = value;
            index++;
        }
    }

}
