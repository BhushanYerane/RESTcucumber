package Collections.employees;

import java.util.ArrayList;

public class employeeShow {

	int eNo;
	String name, address;

	employeeShow(int empno, String empnm, String empaddress) {
		this.eNo = empno;
		this.name = empnm;
		this.address = empaddress;
	}

	public employeeShow() {

	}

	void displayData(ArrayList<employeeShow> list) {
		System.out.println("Employee Detail");
		for (employeeShow emp : list) {
			System.out.println("Employee number: " + emp.eNo);
			System.out.println("Employee Name: " + emp.name);
			System.out.println("Employee Address: " + emp.address);
			
			System.out.println("-----------------");
		}
	}
}
