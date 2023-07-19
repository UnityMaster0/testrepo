import java.util.Scanner;

public class Adder {

    public static int add() {

        Scanner listener1 = new Scanner(System.in);

        System.out.println("What is your first value?: ");
        String s1 = listener1.nextLine();

        System.out.println("What is your second value?: ");
        String s2 = listener1.nextLine();

        listener1.close();

        int v1 = Integer.parseInt(s1);
        int v2 = Integer.parseInt(s2);

        var sum = v1 + v2;
        return sum;
    }

    public static void main(String[] args) {

        System.out.println("The sum of thoses two values is: " + add());
    }
}