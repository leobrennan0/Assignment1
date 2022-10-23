import java.util.ArrayList;

public class Module {
    String name;
    int id;
    Student[] students;
    Lecturer lecturer;
    ArrayList<Course> courses;

    public Module(String name, int id, Lecturer lecturer)
    {
        this.name = name;
        this.lecturer = lecturer;
        this.id = id;

    }
}
