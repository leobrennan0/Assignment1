public class Module {
    String name;
    int id;
    Student[] students;
    Lecturer lecturer;
    Course[] courses;

    public Module(String name, int id, Lecturer lecturer)
    {
        this.name = name;
        this.id = id;
        this.lecturer = lecturer;
    }
}
