package valitadors;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateName {

    public static boolean isValid(String txt) {

        String regx = "^[\\p{L} .'-]+$";
        Pattern pattern = Pattern.compile(regx,Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(txt);
        return matcher.find();

    }
}
