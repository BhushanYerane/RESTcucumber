package javaPrograms;

public class avgArray {

	public static void main(String[] args) {
		
		double numArry[] = {12.3,56.9,34.09,-49.99,234.87,-98.47,67.66};
		double sum = 0;
		for(double element:numArry)
		{
			sum = sum + element;
		}
		
		double avg = sum/numArry.length;
		
		System.out.println("Total: "+sum+"\n Avarage: "+avg);
	}
}
