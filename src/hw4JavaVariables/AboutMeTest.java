package hw4JavaVariables;

public class AboutMeTest {
	
		public static void main(String[] args) {
			AboutMe aboutme = new AboutMe(); //Constructor Initialized
			aboutme.name = "Sharon"; // variables initialized
			aboutme.age = 127;
			aboutme.myCarNote = 32767;
			aboutme.myAnualIncome = 1176573468;
			aboutme.mySavingsAccount = 6374365687965847658l;
			aboutme.myBackYard = 4.5678901f;
			aboutme.myCarSpeed = 3.76485687348767;
			aboutme.sex = 'F';
			aboutme.favoriteSodaIsDietCoke = true; // method initialized
			
//			call the method by object
			aboutme.aboutme();
			
			AboutMe info2 = new AboutMe();
			info2.name = "Alex"; // variables initialized
			info2.age = 127;
			info2.myCarNote = 32767;
			info2.myAnualIncome = 1176573468;
			info2.mySavingsAccount = 6374365687965847658l;
			info2.myBackYard = 4.5678901f;
			info2.myCarSpeed = 3.76485687348767;
			info2.sex = 'F';
			info2.favoriteSodaIsDietCoke = true; //method initialized
			info2.aboutme(); 
			
		
	}

}
