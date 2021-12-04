 import java.util.HashSet;
import java.util.Vector;

public class Department {
   private String name; // the name of school Dept of Computing and Info Science
   private String id; // short name for courses SOFE, ELEE, STAT, etc
   private Vector<Course> courseList; // all courses offered by the department
   private Vector<Student> registerList; // all students taking courses in the department.

   public Department(String name, String id) {

      // also initialize the vectors
      this.name = name;
      this.id = id;
      courseList = new Vector<>();
      registerList = new Vector<>();
   }

   public String getName() {

      return name;
   }

   public String getId() {

      return id;
   }

   // adding courses to the courseList of the department
   public void offerCourse(Course course){

      if (!(courseList.contains(course))) {
         courseList.add(course);

      }
   }

   // prints all the courses that is offered by the department.
   public void printCoursesOffered(){

      for (Course course : courseList){            //iterates the courses that is offered in that department.

         System.out.println(course.toString());
      }
   }

   // prints all the students that is registered in the department.
   public void printStudentsByName(){

      for (Student student : registerList){        //iterates the students that is registered in that department.

         student.toString();
      }
   }

   // checking if the given student is registered
   public boolean isStudentRegistered(Student student){

      return registerList.contains(student);
   }

   // checking if the given student is registered
   public Vector<Student> studentsRegisteredInCourse(int number){

      for (Course course : courseList){

         if (course.getNumber() == number){        //iterates the students that is registered in that course.

            return course.getClassList();
         }
      }

      return null;
   }

   // printing students registered in a course using the course number
   public void printStudentsRegisteredInCourse(int number){

      // if there are no students registered in the given course, printing "There are None!."
      if (studentsRegisteredInCourse(number).isEmpty()){

         System.out.println("There are None!.");
      }

      // if the student is registered in that courses than it prints the id and the name of the student
      for (Student student : studentsRegisteredInCourse(number)){

         System.out.println(student.getId() + ", " + student.getName());
      }
   }

   // returning the course with the highest number of students
   public Course largestCourse(){

      int maxNumOfStudents = 0;

      Course largeCourse = new Course();        // stores the course with the highest # of students

      for (Course course : courseList){

         // if the new course has more # of students than the previous one, then it returns the new course as the highest # of students.
         if (course.getClassList().size() > maxNumOfStudents){

            maxNumOfStudents = course.getClassList().size();
            largeCourse = course;
         }
      }

      return largeCourse;
   }

   // formats the string with the department name and the # of courses that are in that department and the # students registered in that department
   public String toString() {
      // returns a string representation of department name, number 
      // of courses offered and number of students registered in the
      // department. Use the format:
      // ECSE: 53 courses, 460 students

      String temp;

      temp = id + ": " + courseList.size() + " courses, " + registerList.size() + " students.";

      return temp;
   }

   // registers the student in the department and the course for that department
   public void registerStudentCourseInDepartment(Student student, Course course){

      if (!(registerList.contains(student))){

         registerList.add(student);
      }

      if (!courseList.contains(course)){

         courseList.add(course);
         offerCourse(course);
      }
   }

   // method calls the private vector registerList that can be used in different classes.
   public Vector<Student> getRegisterList() {

      return registerList;
   }
}
