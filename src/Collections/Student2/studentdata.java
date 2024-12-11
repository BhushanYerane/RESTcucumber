package Collections.Student2;

import java.util.ArrayList;

public class studentdata {

	ArrayList<student> addData() 
	{
		student s1 = new student();
		s1.name = "Shubh";
		s1.phyMarks = 95;
		s1.mathsMarks = 100;
		s1.chemMarks = 90;
		s1.total = 95 + 100 + 90;
		s1.per = ((s1.total) * 100) / 300;

		student s2 = new student();
		s2.name = "Deep";
		s2.phyMarks = 80;
		s2.mathsMarks = 85;
		s2.chemMarks = 90;
		s2.total = 80 + 85 + 90;
		s2.per = ((s2.total) * 100) / 300;
		
		student s3 = new student();
		s3.name = "Dadus";
		s3.phyMarks = 90;
		s3.mathsMarks = 97;
		s3.chemMarks = 78;
		s3.total = 90+ 97 + 78;
		s3.per = ((s3.total) * 100) / 300;
		
		ArrayList<student> al = new ArrayList<student>(); 
		
		al.add(s1); 
	    al.add(s2);
	    al.add(s3);
	    return al; 

	}
}
