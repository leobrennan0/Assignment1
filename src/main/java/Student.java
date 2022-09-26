import org.joda.time.LocalDate;

public class Student {
    String name;
    int age;
    org.joda.time.LocalDate dob;
    int id;
    String username;
    String[] courses;

    public Student(String name, int age, LocalDate dob, int id)
    {
        this.name = name;
        this.age =age;
        this.dob = dob;
        username = "" + name + String.valueOf(age);
    }

    //returns username
    public String getUsername()
    {
        return username;
    }

}
