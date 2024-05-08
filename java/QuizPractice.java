public class QuizPractice {

    // Practice string methods

    public static void main(String[] args)
    {
        // Basic String Functions
        
        String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        
        System.out.println("The length of the txt string is: " + txt.length());

        System.out.println(txt.toUpperCase());
        System.out.println(txt.toLowerCase());

        System.out.println(txt.indexOf("X"));

        // Concatenation Example

        String firstName = "John ";
        String lastName = "Doe";
        String fullName = firstName + lastName;

        System.out.println(firstName + lastName);
        System.out.println(firstName.concat(lastName));
        System.out.println(fullName);

        // Comparing Strings

        String test = new String();
        test = "test";

        System.out.println(test.equals("test"));
    }
}