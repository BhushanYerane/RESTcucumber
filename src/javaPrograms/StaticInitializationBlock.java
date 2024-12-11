package javaPrograms;

public class StaticInitializationBlock {
	
	static {
		int a=10;
		float b=10.1f;
		System.out.println("class without a main method");
		float c = a+b;
		System.out.println(c);
		
	   System.exit(0);
	}

}
