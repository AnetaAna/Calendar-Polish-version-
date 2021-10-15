
public class TodayCalendar extends MyCalendar {
	
	String s;
	
	public void tellTheDay() {
		
	java.util.Date date = new java.util.Date();

	String s = String.format("%tA, %td %tB %tY, %tR", date, date, date, date, date);
	
	// print current date and time
	System.out.println(s);
	
	
	}	
	
}