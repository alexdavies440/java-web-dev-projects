import java.util.ArrayList;
import java.util.Scanner;
public class FindByLength {


    public static ArrayList<String> returnWords(ArrayList<String> list, int length) {
        ArrayList<String> newList = new ArrayList<>();
        //int length = input.nextInt;
        for (String word : list) {
            if (word.length() == length) {
                newList.add(word);
            }
            }
        return newList;
        }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Search by word length: ");
        int length = input.nextInt();

        ArrayList<String> wordList = new ArrayList<>();
        {
            wordList.add("dog");
            wordList.add("kitchen");
            wordList.add("steak");
            wordList.add("carrot");
            wordList.add("seven");
        }
        System.out.println(returnWords(wordList, length));
    }
}
