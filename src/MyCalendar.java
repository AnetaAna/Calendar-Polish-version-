import java.util.*;
import java.util.Calendar;
import java.util.Date;

public class MyCalendar {
		
	public static void main(String[] args) {
		
		Calendar cal = Calendar.getInstance();
		
		TodayCalendar today = new TodayCalendar();
		today.tellTheDay();
		
		System.out.println();
		System.out.println();
		System.out.println();
		
		MonthCalendar august = new MonthCalendar();
		
		System.out.println("Aktualny miesi¹c");
		System.out.println();
		august.makeCalendar();
		
		System.out.println();
		System.out.println();
		
		AnnualCalendar thisyear = new AnnualCalendar();
		thisyear.makeBigCalendar();
	
	}

}
