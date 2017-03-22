
/*
 * application having a Generic HashMap with
 *  Empcode as key and EmpName as value
 */
//importing the util package
import java.util.*;

//defining the class Employee
public class Employee {
	// main method
	public static void main(String args[]) {
		// using hash map function
		// imteger = key and String =value
		HashMap<Integer, String> n = new HashMap<Integer, String>();
		// putting the value
		n.put(101, "rahul");
		n.put(105, "azman");
		n.put(106, "rahul");
		n.put(103, "rajat");
		n.put(109, "vimal");
		n.put(100, "sakib");
		// mapping key with the value
		for (Map.Entry m : n.entrySet()) {
			// printing hte value
			System.out.println(m.getValue());
		}
	}

}
