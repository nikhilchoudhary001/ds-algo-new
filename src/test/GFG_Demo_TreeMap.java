package test;

//Java Program to Illustrate Addition of Elements
//in TreeMap using put() Method

//Importing required classes
import java.util.*;

//Main class
class GFG_Demo_TreeMap {

	// Main driver method
	public static void main(String args[])
	{

		// Initialization of a TreeMap using Generics
		TreeMap<Integer, String> tm2
			= new TreeMap<Integer, String>();

		// Inserting the elements in TreeMap
		// again using put() method
		tm2.put(3, "Geeks");
		tm2.put(0, "Geeks");
		tm2.put(2, "For");
		tm2.put(1, "Geeks");

		// Printing the elements of both TreeMap
		// Map 2
		System.out.println(tm2.firstEntry());
	}
}

