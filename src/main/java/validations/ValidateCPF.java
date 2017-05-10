package validations;

import java.util.InputMismatchException;

public class ValidateCPF {

    public static boolean isValid(String CPF) {
        if (CPF.equals("00000000000") || CPF.equals("11111111111") ||
                CPF.equals("22222222222") || CPF.equals("33333333333") ||
                CPF.equals("44444444444") || CPF.equals("55555555555") ||
                CPF.equals("66666666666") || CPF.equals("77777777777") ||
                CPF.equals("88888888888") || CPF.equals("99999999999") ||
                (CPF.length() != 11))
            return(false);

        char digit10, digit11;
        int sm, i, r, number, weight;

        try {
            sm = 0;
            weight = 10;
            for (i=0; i<9; i++) {
                number = (int)(CPF.charAt(i) - 48);
                sm = sm + (number * weight);
                weight = weight - 1;
            }
            r = 11 - (sm % 11);
            if ((r == 10) || (r == 11))
                digit10 = '0';
            else digit10 = (char)(r + 48);
            sm = 0;
            weight = 11;
            for(i=0; i<10; i++) {
                number = (int)(CPF.charAt(i) - 48);
                sm = sm + (number * weight);
                weight = weight - 1;
            }
            r = 11 - (sm % 11);
            if ((r == 10) || (r == 11))
                digit11 = '0';
            else digit11 = (char)(r + 48);

            if ((digit10 == CPF.charAt(9)) && (digit11 == CPF.charAt(10)))
                return(true);
            else return(false);
        } catch (InputMismatchException e) {
            return(false);
        }
    }

    public static String printCPF(String CPF) {
        return(CPF.substring(0, 3) + "." + CPF.substring(3, 6) + "." +
                CPF.substring(6, 9) + "-" + CPF.substring(9, 11));
    }

}
