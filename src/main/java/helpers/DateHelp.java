package helpers;

import java.time.LocalDate;
import java.util.Locale;

public interface DateHelp {
    static String getRandomDay() {
        LocalDate randomDate = LocalDate.of(0, 1, 21);
        String month = randomDate.getMonth().toString().toLowerCase(Locale.ROOT);
        int randomDay = randomDate.getDayOfMonth();
        return month + "  " + randomDay;

    }

//    public static void main(String[] args) {
//        System.out.println(getRandomDay());
//    }
}
