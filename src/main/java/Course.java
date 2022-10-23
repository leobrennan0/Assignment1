import org.joda.time.LocalDate;
import org.springframework.cglib.core.Local;

import java.util.ArrayList;

public class Course {
    String name;
    ArrayList<Module> modules;
    ArrayList<Student> students;
    LocalDate startDate;
    LocalDate endDate;

    public Course(String name, LocalDate startDate, LocalDate endDate)
    {
        this.name = name;
        this.startDate = startDate;
        this.endDate = endDate;
    }
}
