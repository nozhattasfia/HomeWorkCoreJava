package hw5Q3Constructor;

public class Student {
	public String empName;
	public int empId;
	public char empSex;
	public boolean fullTimeEmployee;
	
	public Student() {
		System.out.println("This default constructor is from Student Class");
	}
	
	public Student(String empName, int empId, char empSex, boolean fullTimeEmployee) {
		super();
		this.empName = empName;
		this.empId = empId;
		this.empSex = empSex;
		this.fullTimeEmployee = fullTimeEmployee;
		
	}
	

}
