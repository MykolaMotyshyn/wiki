package helpers;

import enums.Countries;

public class CountryHelper {

    public static boolean isLinkContainsCountry(String linkText) {
        for (Countries ct : Countries.values()) {
            if (ct.getCountryName().contains(linkText)) {
//                System.out.println("Country found : " + ct.getCountryName());
                return true;
            }
        }
        return false;
    }


//    public static void main(String[] args) {
//        String str = "Spain";
//        boolean isCountryPresent = isLinkContainsCountry(str);
//    }

}
