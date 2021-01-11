package helpers;

import java.time.LocalDate;
import java.util.Locale;

public interface DateHelp {
    static String getSpecifiedDay() {
        LocalDate randomDate = LocalDate.of(0, 1, 9);
        String month = randomDate.getMonth().toString().toLowerCase(Locale.ROOT);
        int randomDay = randomDate.getDayOfMonth();
        return month + "  " + randomDay;
    }
}
