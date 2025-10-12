// Student Name:    Kamile Kacinskaite
// Student ID:      C00312390
// Purpose:         Lab3 Q1
// Date: 


//Driver program to test the Time class.
public class TimeTest
{
	public static void main (String args[])
	{
		Time t = new Time (23, 59, 59);
		System.out.println(t.toMilitaryString());
		System.out.println(t.toString());
		t.tick();
		System.out.println(t.toMilitaryString());
		System.out.println(t.toString());
	}
}