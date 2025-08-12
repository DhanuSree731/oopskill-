package oop_skill;
import java.util.Calendar;
import java.util.Date;

public class Calendar_{
    public static void main(String[] args) {
  
        Calendar c = Calendar.getInstance();

       
        Date d = c.getTime();
        System.out.println("Current Date: " + d);

        c.set(2023, Calendar.SEPTEMBER, 13);
        System.out.println("Updated Date: " + c.getTime());

  
        int year = c.getWeekYear();
        System.out.println("Week Year: " + year);

        int h = c.getFirstDayOfWeek();
        System.out.println("First Day of Week: " + h);
    }
}