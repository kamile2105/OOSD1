// Student Name:    Kamile Kacinskaite
// Student ID:      C00312390
// Purpose:         Lab3 Q1
// Date:            07/10/25


//Driver program to test the CLock class.

import java.util.Calendar; // importing package Calendar 

public class Clock
{
	public static void main (String args[])
	{
		Calendar cal = Calendar.getInstance(); // getting current time using Calendar
        int  minute = cal.get(Calendar.MINUTE);

        Time t = new Time (cal.get(Calendar.HOUR_OF_DAY), cal.get(Calendar.MINUTE)); // time object created using current hour and minute from caldendar

        int startMinute = minute; // store starting minute so we can see when the minute changes

        while (t.getMinute() == startMinute) // loop that will run unil  minute changes
        {
            long startTime = System.currentTimeMillis(); // record the current time in milliseconds

            t.tick(); // advance time by one second
            System.out.println(t); // print the time after ticking

            while (System.currentTimeMillis() - startTime < 1000) // wait until 1 second has passed
            {
                // wait loop
            }
        }

        System.out.println("Minute has changed. Program Exiting."); // terminates when minute is up and prints a message
        
	}
}