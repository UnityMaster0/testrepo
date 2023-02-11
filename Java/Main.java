import java.util.Scanner;

public class Main {

    public static double func(double value1, double value2) {
        var sum = value1 + value2;
        return sum;
    }

    public static void main(String[] arg) {
        System.out.println("Hello, World");
        
        Scanner listener1 = new Scanner(System.in);
        System.out.println("What is your first value?: ");
        String s1 = listener1.nextLine();
        System.out.println("What is your second value?: ");
        String s2 = listener1.nextLine();

        float v1 = Float.parseFloat(s1);
        float v2 = Float.parseFloat(s2);

        System.out.println(func(v1, v2));
        listener1.close();
    }
}