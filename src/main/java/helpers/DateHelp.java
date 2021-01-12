package helpers;

import java.time.LocalDate;
import java.util.Locale;
import java.util.Random;

public interface DateHelp {
    static String getSpecifiedDay() {
        Random random = new Random();
        LocalDate randomDate = LocalDate.ofEpochDay(random.nextInt());
        String month = randomDate.getMonth().toString().toLowerCase(Locale.ROOT);
        int randomDay = randomDate.getDayOfMonth();
        return month + "  " + randomDay;
    }
}
