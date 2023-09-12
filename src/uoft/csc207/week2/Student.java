package uoft.csc207.week2;

public class Student extends Person {
    private final String studentid;
    //final: you can only assign it once at constructor; private: accessibility modifer,
    // specifies where in the program this name can be used

    public Student(String[] name, String utorid, String studentid) {

        super(name, utorid); // super() calls parent constructor
        this.studentid = studentid;
    }
}
