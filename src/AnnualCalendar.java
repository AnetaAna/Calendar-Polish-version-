import java.time.LocalDate;
import java.util.Calendar;
import java.util.TimeZone;

public class AnnualCalendar {

	int Y = 2021;   
    int startDayOfMonth = 4;
    int spaces = startDayOfMonth;
    Calendar cal = Calendar.getInstance();

  public void makeBigCalendar() {
	  
    // months[i] = name of month i
    String[] months = { "", 
             // leave it empty so that we start with months[1] = "Styczeñ" ("January")
            "Styczeñ", "Luty", "Marzec", "Kwiecieñ", "Maj", "Czerwiec", "Lipiec", "Sierpieñ", "Wrzesieñ","PaŸdziernik", "Listopad", "Grudzieñ" };
                        
              // days[i] = number of days in month i
        int[] days = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        
        for (int M = 1; M <= 12; M++) {

        // check for leap year
        if  ((((Y % 4 == 0) && (Y % 100 != 0)) ||  (Y % 400 == 0)))
  
            days[M = 2] = 29;

        
        // print calendar header
        // display month and year
        System.out.println();
        System.out.println();
        System.out.println("          "+ months[M] + " " + Y);

        // display lines and names of weekdays
        System.out.println("_____________________________________");
        System.out.println("  Pn   Wt   Œr  Czw   Pt   So   Nd ");

        // spaces required
           spaces = (days[M-1] + spaces)%7;
        
         	 
       	// print the calendar
            for (int i = 0; i < spaces; i++)
                System.out.print("     "); 
            
            for (int i = 1; i <= days[M]; i++) {
                System.out.printf(" %3d ", i);
                
                if (((i + spaces) % 7 == 0) || (i == days[M])) System.out.println();
             }
    
        }
     }
  }

