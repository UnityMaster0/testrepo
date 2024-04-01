package encryption;

import java.util.Scanner;

public class Encryptor {

    public void test(char message, long encrypted, char decrypted) {
        System.out.println("Message - " + message);
        System.out.println("Encrypted - " + encrypted);
        System.out.println("Decrypted - " + decrypted);
    }

    public static void main(String[] args) {

        User user1 = new User();
        User user2 = new User();

        user1.private_key = 3;
        user2.private_key = 6;

        user1.generateSharedKey(user2.generatePublicKey());
        user2.generateSharedKey(user1.generatePublicKey());

        String select;
        String message = null;

        char[] split_message = null;

        long encrypted[] = null;
        char decrypted[] = null;

        Scanner input = new Scanner(System.in);

        boolean running = true;
        while (running) {

            System.out.println("What do you want to do?: ");
            select = input.nextLine();

            if (select.equals("encrypt")) {

                System.out.println("What is your message?: ");
                message = input.nextLine();

                split_message = new char[message.length()];

                for (int i = 0; i < message.length(); i++) {
                    split_message[i] = message.charAt(i);
                }

                encrypted = new long[message.length()];
                for (int i = 0; i < message.length(); i++) {
                    encrypted[i] = user1.encrypt(split_message[i]);
                }
            } else if (select.equals("decrypt")) {

                decrypted = new char[message.length()];

                StringBuilder sb = new StringBuilder();

                for (int i = 0; i < message.length(); i++) {

                    decrypted[i] = user2.decrypt(encrypted[i]);
                    sb.append(decrypted[i]);
                }
                System.out.println(sb);
            } else if (select.equals("read")) {

                for (int i = 0; i < message.length(); i++) {

                    if (message.length() > (i - 1)) {
                        System.out.println(encrypted[i]);
                    } else if (message.length() < i) {
                        System.out.println(encrypted[i] + ", ");
                    }
                }
            } else if (select.equals("quit")) {
                running = false;
            } else {
                System.out.println("Error");
            }
        }

        input.close();

    }

}