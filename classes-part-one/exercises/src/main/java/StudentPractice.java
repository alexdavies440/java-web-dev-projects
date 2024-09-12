import java.util.ArrayList;

public class StudentPractice {
    public static void main(String[] args){
        //instantiate your Student class below

Student alex = new Student("Alex", 7777, 1, 4.0);
ArrayList studentAlex = new ArrayList();
studentAlex.add(alex.getName());
studentAlex.add(alex.getStudentId());
studentAlex.add(alex.getNumberOfCredits());
studentAlex.add(alex.getGpa());
Teacher shawn = new Teacher("Shawn", "IA", "Unit 2", 500);
Course launchcode = new Course("LaunchCode", shawn, studentAlex);
for (int i = 0; i < studentAlex.size(); i++) {
    System.out.println(studentAlex.get(i));

}
    }
}
