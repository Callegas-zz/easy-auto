package valitadors;

public class ValidateLicencePlate {

    public static boolean isValid(String licencePlate) {
        return licencePlate.matches("[A-Z]{3}[-]\\d{4}");
    }

}
