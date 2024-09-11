package counting.characters.src.main.java;

import java.sql.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class CountCharacters {
    public static void main(String[] args) {
        String str = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";
        HashMap<Character, Integer> characterWithCount = new HashMap<>();
        Character ch;
        int[] arr = new int[3];

        ArrayList<Character> uniqueCharacters = new ArrayList<>();
        ArrayList<Integer> characterCount = new ArrayList<>();
        //set up characters as keys:
        for (int i = 0; i < str.length(); i++) {

            if (i == str.indexOf(str.charAt(i))) {
                ch = str.charAt(i);
                uniqueCharacters.add(ch);
            }
        }


        //set up count as values:
        for (int i = 0; i < uniqueCharacters.size(); i++) {
            Integer count = 0;
            for (int j = 0; j < str.length(); j++) {

                if (str.charAt(j) == uniqueCharacters.get(i)) {
                    count++;
                }

            }
            characterCount.add(count);
        }
        //add to HashMap:
        for (int i = 0; i < uniqueCharacters.size(); i++) {
            characterWithCount.put(uniqueCharacters.get(i), characterCount.get(i));

        }
        for (Map.Entry<Character, Integer> C : characterWithCount.entrySet()) {
            System.out.println(C.getKey() + ": " + C.getValue());
        }
    }

}
