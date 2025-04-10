import java.util.ArrayList;

public class User {
    private String name;
    private int grade;
    private static int counter = 1;
    private int id;
    private static ArrayList<User> results;

    public User(String name){
        this.name = name;
        this.id = counter++;
        results = new ArrayList<>();
    }
    public String toString(){
        return name + " " + grade;
    }
    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }
    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getId() {
        return id;
    }


}
