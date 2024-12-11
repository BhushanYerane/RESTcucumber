package javaPrograms;

public class largeNum {

	public static void main(String[] args) {

		double numArry[] = { 12, 45, 98, -36.5, 37.89, -99.25, 100 };
		double smalnum = numArry[0];
		double largnum = numArry[0];
		
		for (int i = 0; i < numArry.length; i++) {
			if(numArry[i]>largnum)
			{
				largnum = numArry[i];
			} else if(numArry[i]<smalnum)
			{
				smalnum = numArry[i];
			}
		}	
		System.out.println("Smallest Number is : " + smalnum);
		System.out.println("Largest Number is : " + largnum);
	}
}
