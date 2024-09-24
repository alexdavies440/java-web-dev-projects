public abstract class Question {
//    int id;
//    String name;
    private String question;
    private String answer;

    public Question(String question, String answer) {
        //this.name = name;
        this.question = question;
        this.answer = answer;
    }



//    public String getName() {
//        return name;
//    }

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
        int result = answer.equalsIgnoreCase(userAnswer) ? 1 : 0;
        return result;
    }
}
