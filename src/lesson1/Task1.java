package lesson1;

public class Task1 {
    public static void main(String[] args) {
        int a = 2;
        int b = 2;
        int c = 4;
        int d = 2;
        double e = a * (b + (c / d));
        double g = myResult();
        System.out.println("e = " + e);
        System.out.println("g = " + g);
    }

    public static double myResult () {
        int a = 2;
        int b = 2;
        int c = 4;
        int d = 2;
        return (a * (b + (c / d)));
    }
}
