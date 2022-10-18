import org.joda.time.DateTime;
import org.joda.time.LocalDate;

public class Student {
    String name;
    int age;
    org.joda.time.LocalDate  dob;
    int id;
    String username;
    Course course;
    Module[] modules;

    public Student(String name, int age, org.joda.time.LocalDate dob, final int id)
    {
        this.name = name;
        this.dob = dob;
        this.age = age;

        username = "" + name + String.valueOf(age);
    }

    //returns username
    public String getUsername()
    {
        return username;
    }

}