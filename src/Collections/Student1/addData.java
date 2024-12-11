package Collections.Student1;

import java.util.ArrayList;

public class addData {
	
	ArrayList<student> studentData()
	{
		student s1 = new student("Deep",123,1,35); 
		student s2 = new student("Shubh", 432, 2, 40 ); 
		student s3 = new student("Riddhi", 122, 3, 37); 
		student s4 = new student("Amul", 357,4, 33);
		student s5 = new student("dadush", 578,5, 30);
		
		ArrayList<student> studentlist = new ArrayList<student>();
		
		studentlist.add(s1); 
	    studentlist.add(s2); 
	    studentlist.add(s3); 
	    studentlist.add(s4);
	    studentlist.add(s5);
	    
	    return studentlist; 
	}
}
