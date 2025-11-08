import java.util.Arrays;

public class Student extends Person // subclass of superclass Person
{
    // variables
    private int numCourses;
    private String [] courses;
    private int [] grades;
    public static final int max = 10;

    // constructor
    public Student(String name, String address)
    {
        super(name, address); // calling the superclass constructor
        courses = new String[max]; // store names of courses the student takes
        grades = new int[max]; // store the grades for course
    }

    public void addCourseGrade(String course, int grade) //addCourse method
    {
        courses[numCourses] = course; // store course name at the current index
        grades[numCourses] = grade; // store the corressponding grade along with the name 
        numCourses ++; // increment number of courses after adding a new one
    }

    public void printGrades() // printGrades method
    {
        System.out.println(this); // print students basic information 
        for(int i =0; i < courses.length; i ++) // loop through the array and print each course with the grade
        System.out.println("Course: " + courses[i] + " Grade: " + grades[i]);
    }

    public double getAverageGrade() // getAverageGrade method, return students average grade 
    {
        int sum = 0; // store sum of total grades 
        for(int G : grades) sum += G; //for loop to sum up all grades
        return sum / numCourses;// return average by dividing total sum by number of courses
    }

    public String toString() // method that returns a string representation of the student object 
    {
        return "Student: Name = "+ getName() +", Address = " + getAddress() + ", Number of courses = " 
        + numCourses + " Courses = " +Arrays.toString(courses) + " Grades = " + Arrays.toString(grades);
    }

    
}
