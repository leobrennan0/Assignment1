import java.time.LocalDate;

public class Lecturer {
    String name;
    int age;
    LocalDate dob;
    int id;
    String username;
    String[] courses;

    public Lecturer(String name, int age, LocalDate dob, int id)
    {
        this.name = name;
        this.age = age;
        this.dob = dob;
        username = "" + name + String.valueOf(age);
    }

    public String getUsername()
    {
        return username;
    }
}
