// Implements a Thermometer class.
// Stores the current temperature in Celcius
public class Thermometer
{ // begin Thermometer
	private double celsius;	// more about private later
							// celsius is accessible to all methods in this class
	
	public Thermometer()			// constructor method #1
	{
		setCelsius(0);		
	}
		
	public Thermometer(double cel)	// constructor method #2 
									// overloaded constructor 
									// allows setting an initial temperature when creating a Thermometer
									// object.

	{
		setCelsius(cel);			// calls the setCelsius method to assign the input value
	}

	public void setCelsius(double cel) // setter method
										// sets the temperature in celsius to the given value
	{
		celsius = cel;		
	}

	public double getCelsius() // getter method
								// returns the current temperature in Celsius
	{
		return celsius;
	}
} // end class Thermometer