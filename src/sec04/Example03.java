package sec04;

import java.util.Date;
import java.util.GregorianCalendar;

class Example03 {

	public static void main(String[] args) {
		Date passedDay = new Date (1383404400000L);
		System.out.println(passedDay);
		GregorianCalendar calender = new GregorianCalendar();
		Date today = calender.getTime();
		System.out.println("今日は"+today);

	}

}
