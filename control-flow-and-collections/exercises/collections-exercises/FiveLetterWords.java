import java.util.ArrayList;

public class FiveLetterWords {

    public static ArrayList<String> hasFiveLetters(ArrayList<String> list) {
        ArrayList<String> newList = new ArrayList<>();
        for (String word : list) {
            if (word.length() == 5) {
                newList.add(word);
            }
        }
        return newList;
    }
    static public void main(String[] args) {
        ArrayList<String> wordList = new ArrayList<>();
        {
            wordList.add("dog");
            wordList.add("kitchen");
            wordList.add("steak");
            wordList.add("carrot");
            wordList.add("seven");
        }
        System.out.println(hasFiveLetters(wordList));
    }
}
