/// CPSC_1110_Rectangle.JAVA_Morris - class implementing a rectangle
// Author: Markay Morris 
// Date: 7/17/2021 

public class Data {
	//WHAT IT DOES: retrives data for the rectangle 
	//HOW IT WORKS: imolements if/for loop statments in order to consume the initialization and be entered repetatively
	public static double average(Object[] objects, Measurer meas) {
		double sum = 0;
		for (Object obj : objects) {
			sum = sum + meas.measure(obj);
		}
		if (objects.length > 0) {
			return sum / objects.length;
		} else {
			return 0;
		}
	}

}
