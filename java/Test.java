import java.util.Scanner;
import mytools.Constructor;
import mytools.CountLetters;

public class Test {
    public static void main(String[] arg) {

        CountLetters testWord = new CountLetters("Word Up");

        System.out.println(testWord.countChars('o', 'W', 'd'));
    }
}
