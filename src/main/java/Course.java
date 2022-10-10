import org.joda.time.LocalDate;
import org.springframework.cglib.core.Local;

public class Course {
    String name;
    Module[] modules;
    Student[] students;
    LocalDate startDate;
    LocalDate endDate;

    public Course(String name, LocalDate startDate, LocalDate endDate)
    {
        this.name = name;
        this.startDate = startDate;
        this.endDate = endDate;
    }
}
