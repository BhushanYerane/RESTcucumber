package javaPrograms;

class Employee
{
	public String name;
	public int salary;
	public static int count = 0;

	Employee(String name, int salary)  
	{  
		this.name= name;  
		this.salary= salary; 
		
		count++;
	}	
}

public class countEmps {

	public static void main(String[] args) {
		
		Employee emp1 = new Employee("John", 20000);  
		Employee emp2 = new Employee("Tom", 60000);  
		Employee emp3 = new Employee("Andrew",29000);  
		Employee emp4 = new Employee("Mathew", 50000);  
		
		System.out.println ("There are " + Employee.count + " objects in this class.");  	
	}
}
