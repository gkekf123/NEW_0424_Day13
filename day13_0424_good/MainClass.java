package day13_0424_good;

public class MainClass {

	public static void main(String[] args) {
		
		MyDate me = new MyDate();
		//me.day = 2022;
		me.setYear(2022);
		me.setMonth(12);
		me.setDay(30);
		me.setSsn("123123-1231231");
			
		
		int year = me.getYear();
		System.out.println(year);
		
		String ssn = me.getSsn();
		System.out.println(ssn);
		
		
		
	}
}
