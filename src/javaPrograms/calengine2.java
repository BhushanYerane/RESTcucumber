package javaPrograms;

public class calengine2 {

	public static void main(String[] args) {
		double leftval[] = { 100.0d, 25.0d, 225.0d, 11.0d };
		double[] rightval = { 50.0d, 92.0d, 17.0d, 3.0d };
		char[] opCode = {'d','s','a','m'};
		
		double results[] = new double[opCode.length];
		
		for(int i=0; i<opCode.length; i++)
		{
			if(opCode[i]=='a')
				results[i] = leftval[i]+rightval[i];
			else if(opCode[i]=='s')
				results[i] = leftval[i]-rightval[i];
			else if(opCode[i]=='d')
				results[i] = leftval[i]/rightval[i];
			else if(opCode[i]=='m')
				results[i] = leftval[i]*rightval[i];
			else {
				System.out.println("Error - invalid opcode");
				results[i] = 0.0d;
			}
		}
		
		for(double result:results) {
			System.out.print("Result- ");
			System.out.println(result);
		}
		
		
		System.out.println("//--------------------");
		
		for(int i=0; i<opCode.length; i++)
		{
			switch(opCode[i]) 
			{
			case 'a' :
				results[i] = leftval[i]+rightval[i];
				break;
			case 's':
				results[i] = leftval[i]-rightval[i];
				break;
			case 'd':
				results[i] = leftval[i]/rightval[i];
				break;
			case 'm':
				results[i] = leftval[i]*rightval[i];
				break;
			default:
				System.out.println("Error - invalid opcode");
				results[i] = 0.0d;
				break;
			}
		}
		for(double result:results) {
			System.out.print("Result- ");
			System.out.println(result);
		}
			
	}
}
