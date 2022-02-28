package lab4;
import java.util.GregorianCalendar;
import java.util.Date;
public class lab4_pro2 {
    
    public static void main(String[] args) {
    GregorianCalendar calender = new GregorianCalendar();
    Date now = new Date();

    System.out.println("Current year, month, date, and day of week ");
    System.out.println("Year is " + calender.get(calender.YEAR));
    System.out.println("Month is " + calender.get(calender.MONTH));
    System.out.println("Date is " + calender.get(calender.DATE));
    System.out.println("Day of week is " + calender.get(calender.DAY_OF_WEEK));
    System.out.println("------------");

    calender.add(GregorianCalendar.DATE, 1);

    System.out.println("After specified the elapsed time of one day after current day");
    System.out.println("Year is " + calender.get(calender.YEAR));
    System.out.println("Month is " + calender.get(calender.MONTH));
    System.out.println("Date is " + calender.get(calender.DATE));
    System.out.println("Day of week is " + calender.get(calender.DAY_OF_WEEK));

    System.out.println(now);
}

}


