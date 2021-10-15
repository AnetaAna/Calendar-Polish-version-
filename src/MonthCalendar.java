import java.time.DayOfWeek;
import java.time.LocalDate;

public class MonthCalendar {

	// create current month calendar
	public void makeCalendar() {
	
	// set current date and month	
	LocalDate date = LocalDate.now();
	int month = date.getMonthValue();
	int today = date.getDayOfMonth();
	
	// set beginning of the month and weekday
	date = date.minusDays(today - 1);
	DayOfWeek weekday = date.getDayOfWeek();
	int value = weekday.getValue();	
	
	// print names of weekdays and first line indent
	System.out.println(" Pn  Wt  Œr Czw  Pt  So  Nd");
	for (int i = 1; i < value; i++)
		System.out.print("    ");
	
	// print the calendar
	while (date.getMonthValue() == month) {
		System.out.printf("%3d", date.getDayOfMonth());
		if (date.getDayOfMonth() == today) 
			System.out.print("*");
		else
			System.out.print(" ");
		date = date.plusDays(1);
		if (date.getDayOfWeek().getValue() == 1)
			System.out.println();
	}
	
	}
}
