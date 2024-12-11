package javaPrograms;

public class staticexamp {
	
	int roll_no;
	String name;
	static String college = "DSE/ISE";
	
	public staticexamp(int r, String n)
	{
		roll_no = r;
		name = n;
	}
	
	void dispaly()
	{
		System.out.println(roll_no+"\t"+name+"\t"+college);
	}

	public static void main(String[] args) {
		staticexamp st1 = new staticexamp(111,"BHushan");
		staticexamp st2 = new staticexamp(222,"Bharat");
		
		st1.dispaly();
		st2.dispaly();
	}
}
