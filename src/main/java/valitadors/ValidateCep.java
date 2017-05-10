package valitadors;

public class ValidateCep {


    public static boolean isValid(String cep) {
        return cep.matches("^\\d{5}[-]\\d{3}$");
    }

}
