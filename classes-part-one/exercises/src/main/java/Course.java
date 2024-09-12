import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

public class Course {
    private String topic;
    private Teacher instructor;
    private ArrayList<Student> roster;

    public Course(String topic, Teacher instructor, ArrayList<Student> roster) {
        this.topic = topic;
        this.instructor = instructor;
        this.roster = roster;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public void setInstructor(Teacher instructor) {
        this.instructor = instructor;
    }

    public void setRoster(ArrayList<Student> roster) {
        this.roster = roster;
    }

}


