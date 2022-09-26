import org.joda.time.LocalDate;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    void getUsername() {
        Student student = new Student("John", 20, LocalDate.now(), 1);
        assertEquals("John20", student.username);
    }
}