package learn.danya.chapter1;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Date;

public class GregorianCalendarTest {
    public static void main(String[] args) {
        new Date();

        System.out.println(new Date());

        LocalDate.now();
        LocalDate newYearsEve = LocalDate.of(1999, 12, 31);

        int year = newYearsEve.getYear();
        int month = newYearsEve.getMonthValue();
        int day = newYearsEve.getDayOfMonth();

        System.out.println(year + " " + month + " " + day);

        LocalDate aThousandDaysLater = newYearsEve.plusDays(1000);

        year = aThousandDaysLater.getYear();
        month = aThousandDaysLater.getMonthValue();
        day = aThousandDaysLater.getDayOfMonth();

        System.out.println(year + " " + month + " " + day);

        GregorianCalendar someDay = new GregorianCalendar(1999, Calendar.DECEMBER, 31);

        someDay.add(GregorianCalendar.DAY_OF_MONTH, 1000);
    }
}
