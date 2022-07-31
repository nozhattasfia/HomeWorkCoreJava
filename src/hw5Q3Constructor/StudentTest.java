package hw5Q3Constructor;

public class StudentTest {
	public static void main(String[] args) {
		// default Constructor initialized
		Student student = new Student();
		
		//Parameterized Constructor initialized
		Student student1 = new Student("Arman S", o137653, 'M', true);
		Student student2 = new Student("Sanjeeda T", 2237653, 'F', false);
		Student student3 = new Student("Arman S", 0137653, 'M', true);
		Student student4 = new Student("Arman S", 0137653, 'M', true);
		Student student5 = new Student("Arman S", 0137653, 'M', true);
	}

}
