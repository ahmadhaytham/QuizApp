import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Quiz {
    private ArrayList<Question> questions;
    private int grade;
    private ArrayList<Question> database = new ArrayList<>();
    public Quiz(){
        questions = new ArrayList<>();
        grade = 0;
        generateDatabase();
        generateQuiz();
    }

    private void generateDatabase(){
        database.add(new Question("What is the capital of France?", "B", new ArrayList<>(List.of("Berlin", "Paris", "Madrid", "Rome"))));
        database.add(new Question("What planet is known as the Red Planet?", "B", new ArrayList<>(List.of("Earth", "Mars", "Jupiter", "Venus"))));
        database.add(new Question("Which ocean is the largest?", "D", new ArrayList<>(List.of("Atlantic", "Indian", "Arctic", "Pacific"))));
        database.add(new Question("Who painted the Mona Lisa?", "A", new ArrayList<>(List.of("Leonardo da Vinci", "Picasso", "Michelangelo", "Van Gogh"))));
        database.add(new Question("What gas do plants absorb from the atmosphere?", "C", new ArrayList<>(List.of("Oxygen", "Hydrogen", "Carbon dioxide", "Nitrogen"))));
        database.add(new Question("Which animal is known as the King of the Jungle?", "B", new ArrayList<>(List.of("Elephant", "Lion", "Tiger", "Gorilla"))));
        database.add(new Question("How many continents are there on Earth?", "C", new ArrayList<>(List.of("5", "6", "7", "8"))));
        database.add(new Question("Which country invented pizza?", "C", new ArrayList<>(List.of("Greece", "USA", "Italy", "France"))));
        database.add(new Question("What do bees produce?", "C", new ArrayList<>(List.of("Milk", "Pollen", "Honey", "Wax"))));
        database.add(new Question("Which instrument has keys, pedals, and strings?", "C", new ArrayList<>(List.of("Guitar", "Drums", "Piano", "Violin"))));

        database.add(new Question("What is the boiling point of water in Celsius?", "B", new ArrayList<>(List.of("90", "100", "80", "120"))));
        database.add(new Question("How many legs does a spider have?", "B", new ArrayList<>(List.of("6", "8", "10", "12"))));
        database.add(new Question("Which planet is closest to the sun?", "C", new ArrayList<>(List.of("Venus", "Mars", "Mercury", "Earth"))));
        database.add(new Question("Who is the author of Harry Potter?", "A", new ArrayList<>(List.of("J.K. Rowling", "Suzanne Collins", "Stephen King", "Rick Riordan"))));
        database.add(new Question("Which color is made by mixing red and blue?", "B", new ArrayList<>(List.of("Green", "Purple", "Orange", "Pink"))));
        database.add(new Question("What is the largest mammal?", "B", new ArrayList<>(List.of("Elephant", "Blue whale", "Giraffe", "Polar bear"))));
        database.add(new Question("How many hours are in a day?", "B", new ArrayList<>(List.of("12", "24", "48", "60"))));
        database.add(new Question("Which shape has three sides?", "C", new ArrayList<>(List.of("Square", "Rectangle", "Triangle", "Circle"))));
        database.add(new Question("Which country is known for the Great Wall?", "B", new ArrayList<>(List.of("India", "China", "Japan", "Thailand"))));
        database.add(new Question("How many colors are in a rainbow?", "C", new ArrayList<>(List.of("5", "6", "7", "8"))));

        database.add(new Question("Which language is the most spoken worldwide?", "B", new ArrayList<>(List.of("Spanish", "English", "Hindi", "Mandarin"))));
        database.add(new Question("How many days are in a leap year?", "C", new ArrayList<>(List.of("365", "364", "366", "360"))));
        database.add(new Question("What is the smallest prime number?", "C", new ArrayList<>(List.of("0", "1", "2", "3"))));
        database.add(new Question("Which part of the plant conducts photosynthesis?", "C", new ArrayList<>(List.of("Roots", "Stems", "Leaves", "Flowers"))));
        database.add(new Question("Who wrote 'Romeo and Juliet'?", "B", new ArrayList<>(List.of("Charles Dickens", "William Shakespeare", "Jane Austen", "Mark Twain"))));
        database.add(new Question("How many minutes are there in one hour?", "A", new ArrayList<>(List.of("60", "100", "30", "90"))));
        database.add(new Question("Which is the largest planet in our solar system?", "D", new ArrayList<>(List.of("Earth", "Saturn", "Mars", "Jupiter"))));
        database.add(new Question("What do you call an animal that eats only plants?", "C", new ArrayList<>(List.of("Carnivore", "Omnivore", "Herbivore", "Insectivore"))));
        database.add(new Question("Which color is a mix of yellow and blue?", "B", new ArrayList<>(List.of("Purple", "Green", "Orange", "Brown"))));
        database.add(new Question("What is the freezing point of water in Celsius?", "A", new ArrayList<>(List.of("0", "32", "10", "-5"))));
    }

    public void addQuestion(Question question){
        questions.add(question);
    }
    public void displayQuestions(){
        for(Question q:questions){
            System.out.println(q);
        }
    }
    public int getGrade(){
        return grade;
    }
    public void generateQuiz(){
        Collections.shuffle(database);
        questions=new ArrayList<>();
        for(int i=0;i<5;i++){
            questions.add(database.get(i));
        }
    }

    public ArrayList<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(ArrayList<Question> questions) {
        this.questions = questions;
    }
}
