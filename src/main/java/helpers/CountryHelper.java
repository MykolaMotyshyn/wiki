package helpers;

import enums.Countries;

public class CountryHelper implements CountryHelp {

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
//        String str = "Great Britain";
//        boolean isCountryPresent = isLinkContainsCountry(str);
//    }

}
