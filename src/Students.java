import java.util.ArrayList;

public class Students {
    private static ArrayList<Student> studentList = new ArrayList<Student>();

    public static void addStudent(Student student){
        studentList.add(student);
    }
    public static void displayInfoAboutAllStudents(){
        for(Student student : studentList){
            student.displayStudent();
        }
    }
    public static void promoteAllStudents(){
        for(Student student : studentList){
            student.promoteStudent();
        }
    }

}

