
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListBonus {

        public static ArrayList<String> returnWords(ArrayList<String> list, int length) {
            ArrayList<String> newList = new ArrayList<>();

            for (String word : list) {
                //Filter out punctuation before evaluation length:
                if (word.contains(".")) {
                    word = word.substring(0, word.indexOf("."));
                }
                if (word.contains(",")) {
                    word = word.substring(0, word.indexOf(","));
                }
                if (word.length() == length) {
                    newList.add(word);
                }
            }
            return newList;
        }

        public static void main(String[] args) {
            String excerpt = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
            ArrayList<String> wordList = new ArrayList<>();

            String[] words = excerpt.split(" ");
            for (String wrd : words) {
                wordList.add(wrd);
            }

                //ArrayList<String> wordList = new ArrayList<>();
            Scanner input = new Scanner(System.in);

            System.out.println("Search by word length: ");
            int length = input.nextInt();

            wordList = (returnWords(wordList, length));
            System.out.println("There are " + wordList.size() + " words that match your search: ");
            for (int i = 0; i < wordList.size(); i++) {
                System.out.println(wordList.get(i));
            }
        }
    }


