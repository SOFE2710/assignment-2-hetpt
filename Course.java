import java.util.Vector;

public class Course {
    private Department dept;
    private String title; // title of the course (e.g. Intro to programming);
    private String code; // course code, e.g. SOFE, ELEE, MANE, etc.
    private int number; // course number, e.g. 1200, 2710, 2800, etc.
    private Vector<Student> classList; // contains all students registered in this course

    public Course(String code, int number, Department dept, String title) {

        // also initialize the classList;
        this.code = code;
        this.number = number;
        this.dept = dept;
        this.title = title;
        this.classList = new Vector<Student>();
    }

    // constructor
    public Course() {

        // TODO Auto-generated constructor stub
    }

    public String getCode() {

        return this.code;
    }

    public int getNumber() {

        return this.number;
    }

    public Department getDept() {

        return this.dept;
    }

    public String getTitle() {

        return this.title;
    }

    // returns a string with course code, number, tittle and number students registered in that course
    public String toString() {

        // return a string representation of the course with the course code,
        // name, and number of people registered in the course in the following
        // format:
        // SOFE 2710 Object-Oriented Programming and Design, Enrollment = 260

        String temp;
        temp = this.code + " " + this.number + " " + this.title + ", Enrollment = " + this.classList.size();

        return temp;
    }

    // adds students to the class he or she is taking
    public void addStudentToCourse(Student student) {

        if (!(classList.contains(classList))) {

            classList.add(student);
            getDept().offerCourse(this);
        }
    }

    // method calls the private vector classList to be used in the department class
    public Vector <Student> getClassList(){

        return classList;
    }
}

