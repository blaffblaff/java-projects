package org.Mont;

public class EnumTest {
	
		Day day;
		
	public EnumTest(Day day) {
		
		this.day = day;
		
	}
		
	public enum Day {
		
		Sunday,Monday,Tuesday,Wednesday,Thursday,Friday,Saturday
		
	}
	

	public void whatYouFeelAbout() {
		
		switch(day) {
		
		case Monday :
			
		System.out.println("I personally hate Mondays!");
			
		break;
		
		case Friday :
			
		System.out.println("Well,It's pretty good,because It's almost Weekends...");	
			
		break;
		
		case Saturday : case Sunday :
			
		System.out.println("Weekends are the best ! ");
		
		break;
		
		default :
			
		System.out.println("Midweek days are so-so.");
			
		break;
			
		
		
		
		}		
	}

	
	public static void main(String [] args) {
		
		EnumTest firstDay = new EnumTest(Day.Monday);
		firstDay.whatYouFeelAbout();
		
			
	}
	
	
	
	
	
}
