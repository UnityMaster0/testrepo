public class ForLabel {

    // Using a label to break a for loop

    public static void main(String[] args) {

        test:
            for (int i = 0; i < 2; i++) {
                
                System.out.println("First");

                for (int v = 0; v < 2; v++) {
                    System.out.println("Second");
                    break test;
                }
            }
    }
}
