package javaPrograms;

public class calengine3 {

	public static void main(String[] args) {

		MathEquation[] equations = new MathEquation[4];
		equations[0] = create(100.0d, 50.0d, 'd');
		equations[1] = create(25.0d, 92.0d, 'a');
		equations[2] = create(225.0d, 17.0d, 's');
		equations[3] = create(11.0d, 3.0d, 'm');

		for(MathEquation equation:equations)
		{
			equation.execute();
			System.out.print("Result- ");
			System.out.println(equation.getresult());
		}

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
