import java.util.Arrays;

public class Teacher extends Person // subclass of superclass Person
{
    // variables
    private int numCourses;
    private String [] courses;
    public static final int max = 10;

    // constructor
    public Teacher(String name, String address )
    {
        super(name, address); // calling the superclass constructor
        numCourses = 0; // initialising number of courses to zero 
        courses = new String [max]; // array to store the names of courses teacher teaches
       
    }

    public boolean removeCourse(String course) // removeCourse method
    {
       int i;
       int courseIndex = numCourses; // default value assuming course was not found 
       for(i =0; i <numCourses; i++) // search for the course
        {
            if(courses[i].equals(course))
            {
                courseIndex = i; // found it at the given index
                break; // exit loop
            }
        }
        if(courseIndex == numCourses) // if courseindex was not changed course doesnt exist
        {
            return false;
        }
        else{
            
            for(i = courseIndex; i < numCourses; i++) // shift all courses one space to the left after removing one
            {
                courses[i] = courses[i + 1];
            }
            numCourses --; // decrease number of courses
            return true;
        }
    }

    public boolean addCourse(String course) // adding new course method
    {
        int i;
        for(i =0; i <numCourses; i++) // check if course already exists 
        {
            if(courses[i].equals(course))
            {
                return false; // duplicate course, not added 
            }
        }
        courses[numCourses] = course; // add new course
        numCourses ++; // increment 
        return true;
    }


    // string representation of the object Teacher using toString method
    public String toString()
    {
        return "Teacher: Name = " + getName() + ", Address = " + getAddress() + ", Number of courses = " + numCourses + 
        " Courses = " + Arrays.toString(courses) + " ";
    }
}
