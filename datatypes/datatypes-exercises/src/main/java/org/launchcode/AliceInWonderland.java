package org.launchcode;

import java.util.Scanner;

public class AliceInWonderland {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String firstSentence = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, ‘and what is the use of a book,’ thought Alice ‘without pictures or conversation?’";

        System.out.println("Search for a word:");
        String searchTerm = input.next();

        boolean searchResult = firstSentence.toLowerCase().contains(searchTerm.toLowerCase());

        System.out.println("It is " + searchResult + " that the term " + searchTerm.toLowerCase() + " can be found within the first sentence of Alice in Wonderland.");

        //String[] sentenceArray = firstSentence.split(" ");
        int stringIndex = firstSentence.indexOf(searchTerm);
        System.out.println("String index: " + stringIndex);

        String firstHalf = firstSentence.substring(0, stringIndex-1);
        String secondHalf = firstSentence.substring(stringIndex+searchTerm.length(), firstSentence.length()-1);
        String omittedWordSentence = firstHalf.concat(secondHalf);

        System.out.println(omittedWordSentence);
    }
}
