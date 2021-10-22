package tasks;

public class QuadraticEquation {

    public static void main(String[] args) {

        double a, b, c;
        a = 1;
        b = 20;
        c = 13;
        double disc = b * b - 4 * a * c;
        double x1, x2;


        if (disc == 0) {
            x1 = (-b) / (2 * a);
            x2 = x1;
            System.out.println(x1);
            System.out.println(x2);


        } else if (disc > 0) {
            x1 = (-b + Math.sqrt(disc)) / (2 * a);
            x2 = (-b - Math.sqrt(disc)) / (2 * a);
            System.out.println(x1);
            System.out.println(x2);



        } else {
            System.out.println("Нет целого решения  !");
        }

    }

}
