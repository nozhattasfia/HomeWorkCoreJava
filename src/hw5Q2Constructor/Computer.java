package hw5Q2Constructor;

public class Computer {
//	variables are declared
	public String empName;
	public int empId;
	public char empSex; 
	public boolean fullTimeEmployee;
	
	public Computer() {
		System.out.println("This default constructor is from Computer Class");
		
		
	}
	
//	parameterized Constructor 01 declared
	public Computer(String empName) {
		this.empName = empName;
		System.out.println("The Employee Name is: " + empName + ", Employee Sex: " + empSex
				+ ", Employee Id"  + empId); 
		
		
	}
	
	
	}
	


