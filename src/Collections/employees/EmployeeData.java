package Collections.employees;

import java.util.ArrayList;

public class EmployeeData {

	public static void main(String[] args) {

		employeeShow emp1 = new employeeShow(102, "Shubh", "Nagpur");
		employeeShow emp2 = new employeeShow(205, "Anjali", "Dhanbad");
		employeeShow emp3 = new employeeShow(333, "Shanjna", "Mumbai");

		ArrayList<employeeShow> list = new ArrayList<employeeShow>();
		list.add(emp1);
		list.add(emp2);
		list.add(emp3);
		employeeShow temp = new employeeShow();

		temp.displayData(list);

	}

}
