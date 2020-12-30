package helpers;

import java.time.LocalDate;
import java.util.Locale;

public class DateHelper implements DateHelp {
    public static String getTodayDay() {
        LocalDate currentdate = LocalDate.now();

        String currentMonth = currentdate.getMonth().toString().toLowerCase(Locale.ROOT);
        int currentDay = currentdate.getDayOfMonth();
//        System.out.println("Current month: " + currentMonth + "_" + currentDay);
        return currentMonth + "_" + currentDay;
    }

}






