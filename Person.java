public class Person {

   private String name;

   public Person(String initialName) {

      this.name = initialName;
   }

   // Constructors
   public Person() {
     
   }
   
   public void setName( String fullName) {

      this.name = fullName;
   }

   public String getName() {

      return this.name;
   }
 
   public String toString() {

      return "Student: " + this.name;
   }

   // Method calls the parent the object, which is Student object
   public void registerFor (Course course) {

   }

   // Method calls the parent the object, which is Student object
   public boolean isRegisteredInCourse(Course course) {

      return false;
   }

}
