package valitadors;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidatePhone {

    public static boolean isValid(String phone) {
        return phone.matches(".((10)|([1-9][1-9]).)\\s9?[6-9][0-9]{3}-[0-9]{4}") ||
                phone.matches(".((10)|([1-9][1-9]).)\\s[2-5][0-9]{3}-[0-9]{4}");

    }

}


