package valitadors;

public class ValidateAddressNumber {

    public boolean isValid(int addressNumber){
        if (addressNumber <= 0)
            return false;
        else
            return true;
    }
}
