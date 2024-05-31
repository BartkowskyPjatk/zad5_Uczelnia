import java.util.ArrayList;
import java.util.Objects;

public class Student {
    private String fname, lname, email, address, telNumber;
    private Date birthday;
    private ArrayList<Grade> Grades;
    private static int indexNumber = 1;
    private String studentIndexNumber;
    private int currentSemester;
    private String studentStatus;

    public Student(String fname, String lname, String email, String address, String telNumber, Date date){
        this.fname = fname;
        this.lname = lname;
        this.email = email;
        this.address = address;
        this.telNumber = telNumber;
        this.birthday = date;
        //nadanie idexu
        studentIndexNumber = "s"+indexNumber;
        indexNumber++;
        //nadanie statusu studenta
        studentStatus = "candidate";

    }

    public void displayStudent(){
        System.out.println("First Name: "+this.fname);
        System.out.println("Last Name: "+this.lname);
        System.out.println("Student's Index Number: "+this.studentIndexNumber);
        //sprawdzanie statusu studenta
        if (Objects.equals(this.studentStatus, "candidate") || Objects.equals(this.studentStatus, "graduate")) {
            System.out.println("Student status: " + this.studentStatus);
        }else if (Objects.equals(this.studentStatus, "student")) {
            System.out.println("Student status: " + this.studentStatus);
            System.out.println("Student status: " + this.currentSemester);
        }
        System.out.println("Email: "+this.email);
        System.out.println("Address: "+this.address);
        System.out.println("Telephone number: "+this.telNumber);

    }
}
