import java.util.ArrayList;

public class Student {
    private String fname, lname, email, address, telNumber;
    private Date birthday;
    private ArrayList<Grade> Grades;
    private static int indexNumber = 1;
    private String studentIndexNumber;

    public Student(String fname, String lname, String email, String address, String telNumber, Date date){
        this.fname = fname;
        this.lname = lname;
        this.email = email;
        this.address = address;
        this.telNumber = telNumber;
        this.birthday = date;
        studentIndexNumber = "s"+indexNumber;
        indexNumber++;
    }

    public void displayStudent(){
        System.out.println("First Name: "+this.fname);
        System.out.println("Last Name: "+this.lname);
        System.out.println("Student's Index Number: "+this.studentIndexNumber);
        System.out.println("Email: "+this.email);
        System.out.println("Address: "+this.address);
        System.out.println("Telephone number: "+this.telNumber);

    }
}
