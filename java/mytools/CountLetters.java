package mytools;

public class CountLetters {

    private String word;

    public CountLetters() {
        word = "Hello World";
    }

    public CountLetters(String word) {
        this.word = word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public int countChars(char... testingFor) {

        char[] split_word = new char[word.length()];

        int count = 0;

        // Split word into chars
        for (int i = 0; i < word.length(); i++)
            split_word[i] = word.charAt(i);

        // Count letters
        for (int i = 0; i < word.length(); i++) {
            for (int u : testingFor)
                if (split_word[i] == u)
                    count++;
        }
        return count;
    }
}
