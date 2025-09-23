// Student Name 	: Kamile Kacinskaite
// Student Id Number: C00312390
// Date 			: 16/09/2025
// Purpose 			: Lab1q1

public class ThermTest
{ // begin class ThermTest
	public static void main(String args[]) 
	{ // being main method

		Thermometer thermA = new Thermometer();									// Create an instance of our Thermometer class

		System.out.println("Temp. of Thermometer A is " + thermA.getCelsius() ); // print temp of thermA (should be 0.0)
		thermA.setCelsius(20.0);											// set a new temp for thermA
		System.out.println("Temp. of Thermometer A is " + thermA.getCelsius() ); // print updated temp of thermA

		Thermometer thermB = new Thermometer(10.0); 						// second instance of the Thermometer class with 
																				// initial temp of 10.0 degrees celsius

		double tempB = thermB.getCelsius(); 									// retrieve temp of thermB using getter method
		System.out.println("Temp. of Thermometer B is " + tempB); 				// print temp of thermB
		
		
	} // end main
} // end class ThermTest