public abstract class Question {

    private String question;
    private String answer;
    private String[] answers;
    private String[] choiceKeys;

    public Question(String question, String answer) {
        this.choiceKeys = getChoiceKeys();
        this.question = question;
        this.answer = answer;
    }

    public Question(String question, String[] answers) {
        this.choiceKeys = getChoiceKeys();
        this.question = question;
        this.answers = getAnswers();
    }

    public String[] getAnswers() {
        return answers;
    }
    public String getQuestion() {
        return question;
    }

    public void askQuestion() {
        System.out.println(question);
    }
    public String getAnswer() {
        return answer;
    }

    public int checkAnswer(String userAnswer) {
        return answer.equalsIgnoreCase(userAnswer) ? 1 : 0;
    }

    public String[] getChoiceKeys() {
        return choiceKeys;
    }
}
