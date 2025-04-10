import java.util.ArrayList;
import java.util.Scanner;

public class QuizApp {
    private Scanner scanner;
    private User currentUser;
    private Quiz quiz;
    private ArrayList<User>users;
    public QuizApp() {
        scanner = new Scanner(System.in);
        quiz = new Quiz();
        users = new ArrayList<>();
    }

    public void start(){
        System.out.println("Welcome to the Quiz App!");
        System.out.print("Please enter your name to start: ");
        while (true) {
            System.out.print("Please enter your name to start (or type 'exit' to quit): ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("exit")) {
                System.out.println("👋 Goodbye!");
                break;
            }

            currentUser = new User(input);
            System.out.println("Hi " + currentUser.getName() + "! Your user ID is: " + currentUser.getId());
            System.out.println("Would you like to start a new quiz? (Y/N)");
            String answer = scanner.nextLine();
            if(currentUser.getId()>1){
                quiz.generateQuiz();
            }
            if (answer.equalsIgnoreCase("y")) {
                System.out.println("to answer a question just type in the answer as provided in the possible answers list");
                System.out.println("--------------------------------------------------------------------------------------");
                ArrayList<Question> questions = quiz.getQuestions();
//                System.out.println(questions);
//                System.out.println(questions.size());
                for (Question question : questions) {
                    System.out.println(question);
                    String ans=scanner.nextLine();
                    if(question.answerQuestion(ans)){
                        currentUser.setGrade(currentUser.getGrade()+1);
                    }
                }
                System.out.println("Quiz finished!");
                System.out.println("Your grade is: " + currentUser.getGrade());
                users.add(currentUser);
            }
            System.out.println("Would you like to view all results? (Y/N)");
            answer = scanner.nextLine();
            if (answer.equalsIgnoreCase("y")) {
                for (User user : users) {
                    System.out.println(user);
                }
            }
            System.out.println(); // Blank line before asking again
        }
    }
    public static void main(String[] args) {
        QuizApp app = new QuizApp();
        app.start();
    }
}
