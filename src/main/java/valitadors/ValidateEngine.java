package valitadors;

public class ValidateEngine {
    public boolean isValid(Double engine){
        if (engine < 1.0 || engine > 6.0)
            return false;
        return true;
    }
}
