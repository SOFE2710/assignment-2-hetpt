import java.util.Vector;

public class Student extends Person {
	private String id;
	private String name;
  	private Vector <Course> courses; // contains all courses the student is registered in

	public Student(String stdName, String stdId) {

		this.name = stdName;
		this.id = stdId;
		this.courses = new Vector<Course>();
	}

	// Constructors
  	public String getName() {

		return this.name;
  	}

	// Constructors
  	public String getId() {

		return this.id;
  	}

	// registering the student in the given course
	public void registerFor (Course course) {

		if (!(courses.contains(course))){		// check if the student is already registered in the course or not,

			courses.add(course); //if not then course is added to the student
		}
	}

	// checks if the student is already registered in the course
	public boolean isRegisteredInCourse(Course course) {

		return courses.contains(course);
	}


	// returns a string with student id and name of the student with the courses that he is registered in
    public String toString() {
     	// return a string representation of a student using the following format:
     	// 100234546 John McDonald
     	// Registered courses: ELEE 2110, ELEE 2790, SOFE 2710, SOFE 2800, SOFE 2850

		String course_s = "";

		for(Course course: this.courses) { //iterates the string for all the courses the student is registered in

			course_s += course.getCode() + " " + course.getNumber() + ", ";
		}

		String temp = this.id + " " + this.name + "\nRegistered courses: " + course_s; //combines the string
		System.out.print(temp);
		System.out.println("\n");

		return  "";
  	}
}
