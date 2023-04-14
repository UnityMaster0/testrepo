import java.util.Scanner;

public class Converter {

    public static double gram(int value, String convertingTo) {
        if (convertingTo.equals("oz")) {
            return (value * 0.03527396);
        } else if (convertingTo.equals("lbs")) {
            return (value * 0.002204623);
        } else {
            System.out.println("Error");
            return 0;
        }
    }

    public static double ounce(int value, String convertingTo) {
        if (convertingTo.equals("g")) {
            return (value * 28.34952);
        } else if (convertingTo.equals("lbs")) {
            return (value * 0.0625);
        } else {
            System.out.println("Error");
            return 0;
        }
    }

    public static double meter(int value, String convertingTo) {
        if (convertingTo.equals("ft")) {
            return (value * 3.28084);
        } else if (convertingTo.equals("km")) {
            return (value * 0.001);
        } else {
            System.out.println("Error");
            return 0;
        }
    }

    public static void main(String[] arg) {
        Scanner scanner1 = new Scanner(System.in);

        System.out.println("What is your value?: ");
        String value = scanner1.nextLine();
        System.out.println("What is the unit?: ");
        String convertingFrom = scanner1.nextLine();
        System.out.println("What do you want to convert to?: ");
        String convertingTo = scanner1.nextLine();

        scanner1.close();

        int parsedValue = Integer.parseInt(value);

        if (convertingFrom.equals("g")) {
            System.out.println(gram(parsedValue, convertingTo));
        } else if (convertingFrom.equals("oz")) {
            System.out.println(ounce(parsedValue, convertingTo));
        } else if (convertingFrom.equals("m")) {
            System.out.println(meter(parsedValue, convertingTo));
        } else {
            System.out.println("Error");
        }
    }
}
