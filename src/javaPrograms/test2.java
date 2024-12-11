package javaPrograms;

public class test2 {
	
	class factExample2 {
		static int factorial(int n)
		{
			if(n==0)
				return 1;
			else
				return(n*factorial(n-1));
		}
	}

	public static void main(String[] args) {
		int i,fact=1;
		int number=5;
		for(i=1;i<=number;i++)
		{
			fact=fact*i;
		}
		System.out.println(fact);
		
		System.out.println("/---------/");
		
		int num = 5;
		//fact = factorial(num);
		System.out.println(fact);
	}
}
