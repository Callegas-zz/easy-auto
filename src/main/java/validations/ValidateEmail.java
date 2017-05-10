package validations;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateEmail {

    public static boolean isValid(String txt) {

        String regx = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$";
        Pattern pattern = Pattern.compile(regx,Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(txt);
        return matcher.find();

    }
}
