public class Main {
    public static void main(String[] args) {

        String[] choices = {"1","2","3","4"};
        MultipleChoice test = new MultipleChoice("What is 2+2?",choices, "d");

        System.out.println(test.checkAnswer("d"));
    }
}
