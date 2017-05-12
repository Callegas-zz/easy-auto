package valitadors;

public class ValidateCarPlaces {

    public boolean isValid(byte places){
        if (places >= 2 && places <=7)
            return true;
        else
            return false;
    }
}
