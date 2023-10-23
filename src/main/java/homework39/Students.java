package homework39;

import java.util.UUID;

public class Students {
    public static void main(String[] args) {
        StudentDatabase stdDB=new StudentDatabase();
        stdDB.addStudent(new Student(UUID.randomUUID(),"Natalja Markova",25));
        stdDB.addStudent(new Student(UUID.randomUUID(),"Natalja Markova",50));
        stdDB.addStudent(new Student(UUID.randomUUID(),"Aleksandr Severin",25));
        stdDB.addStudent(new Student(UUID.randomUUID(),"Aleksej Severin ",25));

        stdDB.printAllStudents();
    }
}
