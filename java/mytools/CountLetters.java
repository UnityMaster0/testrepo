package mytools;
public class CountLetters {

    private String word;
    
    public CountLetters() {
        word = "Hello World";
    }

    public CountLetters(String word) {
        this.word = word;
    }

    public void setWord(String newWord) {
        word = newWord;
    }

    public int countChars(char... testingFor) {

        char[] split_word = new char[word.length()];

        int count = 0;

        // Split word into chars
        for (int i = 0; i < word.length(); i++)
            split_word[i] = word.charAt(i);

        // Count letters
        for (int i = 0; i < word.length(); i++) {
            for (int u = 0; u < testingFor.length; u++)
                if (split_word[i] == testingFor[u])
                    count++;
        }      
        return count;
    }
}
