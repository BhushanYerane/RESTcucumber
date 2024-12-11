package javaPrograms;

public class calengine {

	public static void main(String[] args) {
		double val1 = 100.0;
		double val2 = 20.0;
		double result;
		char opcode = 'd';

		if (opcode == 'a')
			result = val1 + val2;
		else if (opcode == 's')
			result = val1 - val2;
		else if (opcode == 'm')
			result = val1 * val2;
		else if (opcode == 'd') {
			result = val2 != 0 ? val1 / val2 : 0.0d;
//			if (val2 != 0)
//				result = val1 / val2;
//			else
//				result = 0.0d;
		} else {
			System.out.println("Error - invalid opcode");
			result = 0.0d;
		}
		System.out.println(result);
	}

}
