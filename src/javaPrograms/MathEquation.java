package javaPrograms;

public class MathEquation {

	// public double leftval;
	// public double rightval;
	// public char opCode;
	// public double results;

	private double leftval;
	private double rightval;
	private char opCode;
	private double results;

	public void setleftval(double leftval) {
		this.leftval = leftval;
	}

	public double getleftval() {
		return leftval;
	}

	public void setrighttval(double rightval) {
		this.rightval = rightval;
	}

	public double getrightval() {
		return rightval;
	}

	public void setopCode(char opCode) {
		this.opCode = opCode;
	}

	public char getopCode() {
		return opCode;
	}

	public double getresult() {
		return results;
	}

	public MathEquation() {

	}

	public MathEquation(char opcode) {
		this.opCode = opcode;
	}

	public MathEquation(char opcode, double leftval, double rightval) {
		this(opcode);
		this.leftval = leftval;
		this.rightval = rightval;
	}
	
	public void execute(double leftval, double rightval)
	{
		this.leftval = leftval;
		this.rightval = rightval;
		
		execute();
	}
	
	public void execute(int leftval, int rightval)
	{
		this.leftval = leftval;
		this.rightval = rightval;
		
		execute();
		
		results = (int) results;
	}
	
	public void execute() {
		switch (opCode) {
		case 'a':
			results = leftval + rightval;
			break;
		case 's':
			results = leftval - rightval;
			break;
		case 'd':
			results = leftval / rightval;
			break;
		case 'm':
			results = leftval * rightval;
			break;
		default:
			System.out.println("Error - invalid opcode");
			results = 0.0d;
			break;
		}
	}

}
