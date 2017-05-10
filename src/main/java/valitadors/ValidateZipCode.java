package valitadors;

public class ValidateZipCode {


    public static boolean isValid(String zipCode) {
        return zipCode.matches("[A-Z]{5}[-]\\d{3}$");
    }

}
