package homework39;

import java.util.*;
public class StudentDatabase {

    Set<Student> studentsList = new HashSet<>();

    public boolean addStudent(Student student) {
        if (student == null || containsStudent(student) == true) {
            return false;
        }
        studentsList.add(student);
        return true;
    }

    public boolean containsStudent(Student student) {
        for (Student std:studentsList) {
           if(std.equals(student))
           {return true;}
        }
        return false;
    }

    public boolean remove(Student student) {
        if (student != null) {
            return studentsList.remove(student);
        }
        return false;
    }

    public void printAllStudents() {
        Iterator<Student> it=studentsList.iterator();
        if (studentsList.isEmpty()) {
            System.out.println("Список  имен пуст");
        } else {
            System.out.println("Студенты: ");
            while (it.hasNext()){
                System.out.println(it.next().toString());
            }
        }

    }
}


