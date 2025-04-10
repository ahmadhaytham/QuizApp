import java.util.ArrayList;

public class Question {
    private String question;
    private String answer;
    private ArrayList<String> choices;

    public Question(String question, String answer, ArrayList<String> choices) {
        this.question = question;
        this.answer = answer;
        this.choices = choices;
    }
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Question: ").append(question).append("\n");
        for (int i = 0; i < choices.size(); i++) {
            sb.append((char) ('A' + i)).append(". ").append(choices.get(i)).append("\n");
        }
        return sb.toString();
    }
    public boolean answerQuestion(String s){
        if(s.equalsIgnoreCase(answer)){
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args) {
        ArrayList<Question> questions = new ArrayList<>();

        // Sample questions
        ArrayList<String> choices1 = new ArrayList<>();
        choices1.add("Berlin");
        choices1.add("Paris");
        choices1.add("Madrid");
        choices1.add("Rome");

        Question q1 = new Question("What is the capital of France?", "Paris", choices1);

        ArrayList<String> choices2 = new ArrayList<>();
        choices2.add("3");
        choices2.add("4");
        choices2.add("5");
        choices2.add("6");

        Question q2 = new Question("What is 2 + 2?", "4", choices2);

        // Add questions to the list
        questions.add(q1);
        questions.add(q2);

        // Print all questions (without the answer)
        for (Question q : questions) {
            System.out.println(q); // calls toString() of Question
            System.out.println("----------");
        }
    }

}
