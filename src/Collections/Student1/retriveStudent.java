package Collections.Student1;

import java.util.ArrayList;

public class retriveStudent {

	public static void main(String[] args) {
		
		addData data = new addData();
		ArrayList<student> listst = data.studentData(); 
		
		for(student st:listst)
		   { 
		     System.out.println("Student's name: " +st.name); 
		     System.out.println("Student ID " +st.id); 
		     System.out.println("Roll number: " +st.rollno); 
		     System.out.println("Marks: "+st.marks);
		     
		     System.out.println("--------------");
		   } 
		
	}

}
