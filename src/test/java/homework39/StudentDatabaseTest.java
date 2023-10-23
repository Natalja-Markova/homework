package homework39;

import org.junit.Before;
import org.junit.Test;

import java.util.UUID;

import static org.junit.Assert.*;

public class StudentDatabaseTest {

    private StudentDatabase studentDatabase;

    @Before
    public void setUp() {
        studentDatabase = new StudentDatabase();
    }

    @Test
    public void testAddStudentSuccess() {
        Student student = new Student(UUID.randomUUID(), "Aleksandr Severin", 25);
        assertTrue(studentDatabase.addStudent(student));
    }

    @Test
    public void testAddStudentNoDuplicates() {
        UUID id = UUID.randomUUID();
        Student student1 = new Student(id, "Aleksej", 25);
        assertTrue(studentDatabase.addStudent(student1));

        Student student2 = new Student(id, "Aleksej", 25); // Тот же ID
        assertFalse(studentDatabase.addStudent(student2));
    }

    @Test
    public void testRemoveStudentSuccess() {
        UUID id = UUID.randomUUID();
        Student student = new Student(id, "Natalja", 25);
        studentDatabase.addStudent(student);
        assertTrue(studentDatabase.remove(student));
    }

    @Test
    public void testRemoveStudentNotInDatabase() {
        UUID id = UUID.randomUUID();
        Student student = new Student(id, "Natalja", 50);
        assertFalse(studentDatabase.remove(student));
    }

    @Test
    public void testContainsStudentExisting() {
        UUID id = UUID.randomUUID();
        Student student = new Student(id, "Aleksej", 25);
        studentDatabase.addStudent(student);
        assertTrue(studentDatabase.containsStudent (student));
    }

    @Test
    public void testContainsStudentNotExisting() {
        UUID id1 = UUID.randomUUID();
        UUID id2 = UUID.randomUUID();
        Student student1 = new Student(id1, "Alex", 23);
        Student student2 = new Student(id2, "Nata", 24);
        studentDatabase.addStudent(student1);
        assertFalse(studentDatabase.containsStudent(student2));
    }
}

