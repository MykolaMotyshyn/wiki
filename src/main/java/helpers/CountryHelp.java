package helpers;

import enums.Countries;

public class CountryHelp {
    public static boolean isCountryPresent(String text) {
        for (Countries countries : Countries.values()) {
            if (countries.getCountryName().contains(text)) {
                return true;
            }
        }
        return false;
    }
}
