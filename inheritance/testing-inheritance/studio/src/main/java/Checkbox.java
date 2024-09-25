import java.util.Arrays;

public class Checkbox extends Question {
    private String[] choiceKeys = {"a", "b", "c", "d"};
    private String[] choices = new String[4];
    private String[] answers;

//    public Checkbox(String question, String[] choices,String[] answers) {
//       super();
//    }

    public Checkbox(String question, String[] choices, String[] answers) {
        super(question, answers);
        this.choiceKeys = getChoices();
        this.choices = choices;
    }

    //@Override
    public String[] getChoiceKeys() {
        return choiceKeys;
    }

    public String[] getChoices() {
        return choices;
    }

   // @Override
    public String[] getAnswers() {
        return answers;
    }

    public int checkAnswers(String[] userAnswers) {

        int result = 0;
        for (int i = 0; i < answers.length; i++) {
            if (userAnswers[i].equalsIgnoreCase(answers[i])) {
                result ++;
            }
        }
        return result/answers.length == 1 ? 1 : 0;
    }
}
