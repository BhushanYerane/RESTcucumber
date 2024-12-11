package Collections.Student2;

import java.util.ArrayList;

public class retriveStudentData {

	void fetchStudentData() {
		studentdata stdata = new studentdata();

		ArrayList<student> listst = stdata.addData();

		for (student student : listst) {
			System.out.println("Name: " + student.name);
			System.out.println("Physics Marks: " + student.phyMarks);
			System.out.println("Maths Marks: " + student.mathsMarks);

			System.out.println("Chemistry Marks: " + student.chemMarks);
			System.out.println("Total Marks: " + student.total);
			System.out.println("Percentage:" + student.per);
			
			System.out.println("-----------------");
		}

	}
}
