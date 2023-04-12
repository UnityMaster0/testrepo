import java.util.Scanner;

public class Main {

    public static double add() {
        System.out.println("Hello, World");
        
        Scanner listener1 = new Scanner(System.in);
        System.out.println("What is your first value?: ");
        String s1 = listener1.nextLine();
        System.out.println("What is your second value?: ");
        String s2 = listener1.nextLine();
        listener1.close();

        double v1 = Double.parseDouble(s1);
        double v2 = Double.parseDouble(s2);

        var sum = v1 + v2;
        return sum;
    }
    
    public static void main(String[] arg) {
        System.out.println(add());
    }
}