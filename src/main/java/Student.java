import java.time.LocalDate;

public class Student {
    String name;
    int age;
    LocalDate dob;
    int id;
    String username;
    String[] courses;

    public Student(String name, int age, LocalDate dob, int id)
    {
        name = this.name;
        age = this.age;
        dob = this.dob;
        username = "" + name + String.valueOf(age);
    }

    public String getUsername()
    {
        return username;
    }
}
