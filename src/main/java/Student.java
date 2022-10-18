import org.joda.time.DateTime;
import org.joda.time.LocalDate;

public class Student {
    String name;
    int age;
    LocalDate  dob;
    int id;
    String username;
    Course course;
    Module[] modules;

    public Student(String name, int age, LocalDate dob, final int id)
    {
        this.name = name;
        this.age = age;
        this.dob = dob;
        username = "" + name + String.valueOf(age);
    }

    //returns username
    public String getUsername()
    {
        return username;
    }

}
