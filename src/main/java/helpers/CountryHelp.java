package helpers;

import enums.Countries;

public class CountryHelp {
    public static boolean isCountryPresent(String text) {
        for (Countries countries : Countries.values()) {
            if (countries.getCountryName().contains(text)) {
//                System.out.println("Country found " + countries.getCountryName());
                return true;
            }
        }
        return false;
    }

//    public static void main(String[] args) {
//        String str = "New York";
//        boolean isCountryPresent = isCountryPresent(str);
//    }
}
