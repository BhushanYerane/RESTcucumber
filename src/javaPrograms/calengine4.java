package javaPrograms;

public class calengine4 {

	public static void main(String[] args) {
//		MathEquation testEquation = new MathEquation();
//		testEquation.execute();
//		System.out.print("Test- ");
//		System.out.println(testEquation.getresult());
		
		MathEquation[] equations = new MathEquation[4];
		equations[0] = new MathEquation('d', 100.0d, 50.0d);
		equations[1] = new MathEquation('a', 25.0d, 92.0d);
		equations[2] = new MathEquation('s', 225.0d, 17.0d);
		equations[3] = new MathEquation('m',11.0d, 3.0d);
		
		for(MathEquation equation:equations)
		{
			equation.execute();
			System.out.print("Result- ");
			System.out.println(equation.getresult());
		}	
		
		System.out.println("//------------------");
		
		double leftDouble = 22.0d;
		double rightDouble = 7.0d;
		
		int leftint = 25;
		int rightint = 7;
		
		MathEquation equationOverload = new MathEquation('d');
		equationOverload.execute(leftDouble,rightDouble);
		System.out.print("Result: ");
		System.out.println(equationOverload.getresult());
		
		equationOverload.execute(leftint,rightint);
		System.out.print("Result: ");
		System.out.println(equationOverload.getresult());

	}
	
	
	
	public static MathEquation create(double leftval, double rightval, char opcode)
	{
		MathEquation equation = new MathEquation();
//		equation.leftval = leftval;
//		equation.rightval = rightval;
//		equation.opCode = opcode;
		
		equation.setleftval(leftval);
		equation.setrighttval(rightval);
		equation.setopCode(opcode);


		return equation;
	}

}
