package hw3JavaVariables;

public class AboutMe {
	public String name = "Nozhat Tasfia";
	public byte age = 127;
	public short myCarNote = 32767;
	public int myAnualIncome = 1176573468;
	public long mySavingsAccount = 6374365687965847658l;
	public float myBackYard = 4.5678901f;
	public double myCarSpeed = 3.76485687348767;
	public char sex = 'F';
	public boolean favoriteSodaIsDietCoke = true;

	public static void main(String[] args) {
		AboutMe aboutme = new AboutMe();
		System.out.println(aboutme.name);
		System.out.println(aboutme.age);
		System.out.println(aboutme.myCarNote);
		System.out.println(aboutme.myAnualIncome);
		System.out.println(aboutme.mySavingsAccount);
		System.out.println(aboutme.myBackYard);
		System.out.println(aboutme.myCarSpeed);
		System.out.println(aboutme.sex);
		System.out.println(aboutme.favoriteSodaIsDietCoke);
		System.out.println("My Name: " + aboutme.name + "\nMy Age: " + aboutme.age);
//		Variable declared in char because we did not assign value
//		Variable initialized in name because string is inside double quotation

	}

}
