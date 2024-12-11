package javaPrograms;

public class typeCast2 {

	public static void main(String[] args) {
		byte byteval = 6;
		short shortval = 8;
		int intval = 10;
		
		float floatval = 15.5f;
		double doubleval = 1000;
		long longval = 91990;
		
		short result1 = byteval;
		byte result2 = (byte) shortval;
		
		int result3 = byteval;
		int result4 = shortval;
		
		byte result31 = (byte) intval;
		short result41 = (short) intval;
		
		short result11 = (short) (byteval - longval);
		
		//long result5 = longval - floatval; // error in type conversion float to long
		float result5 = longval - floatval;
		
		long result6 = (long) (shortval - longval + floatval + doubleval);
		double result61 = shortval * longval / floatval - doubleval + intval;  // change long to double result61
		long result62 = (long) (shortval * longval - floatval / doubleval + intval);
		
		
		System.out.println("Success");

	}

}
