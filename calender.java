import java.util.Calendar;
import java.util.GregorianCalendar;

public class calender {
    public static void main(String[] args) {
        Calendar c=Calendar.getInstance();
        System.out.println(c.getCalendarType());
        System.out.println(c.get(Calendar.DATE));
        System.out.println(c.get(Calendar.SECOND));
        System.out.println(c.get(Calendar.HOUR));
        System.out.println(c.get(Calendar.HOUR_OF_DAY)+ " : "+ c.get(Calendar.MINUTE));
        GregorianCalendar cal =new GregorianCalendar();
        System.out.println(cal.isLeapYear(2020));
    }
}
