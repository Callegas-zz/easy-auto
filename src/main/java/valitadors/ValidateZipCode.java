package valitadors;

public class ValidateZipCode {


    public static boolean isValid(String zipCode) {
        return zipCode.matches("^\\d{5}[-]\\d{3}$");
    }

}
