package javaPrograms;

public class countObj {
	private static int count;
	
	public countObj()
	{
		count++;
	}

	public static void main(String[] args) {
		
		countObj obj1 = new countObj();
		countObj obj2 = new countObj();
		countObj obj3 = new countObj();
		countObj obj4 = new countObj();
		countObj obj5 = new countObj();
		
		System.out.print("Total Number of Objects: " + countObj.count);  
	}
}
