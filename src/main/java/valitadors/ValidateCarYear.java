package valitadors;

import java.time.LocalDate;

public class ValidateCarYear {
    LocalDate now = LocalDate.now();

    public boolean isValid(Integer year){
        if (year > now.getYear())
            return false;
        if (year < (now.getYear() - 10))
            return false;
    return true;
    }
}
