package contornos.ud3;

public class PasswordValidator {

    public static boolean isValid(String password) {
        if (password.length() < 8) {
            return false;
        }

        boolean hasUpperCase = false;
        boolean hasDigit = false;

        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) {
                hasUpperCase = true;
            }
            if (Character.isDigit(c)) {
                hasDigit = true;
            }
        }

        return hasUpperCase && hasDigit;
    }
}
// Se corrigió if password.legth() <=8 por if password.legth <8
// Se corrigió if (Character.isLowerCase(c)) por if (Character.isUpperCase(c))
// Se corrigió hasDigit = false por hasDigit = true
// Se corrigió return hasUpperCase || hasDigit por return hasUpperCase && hasDigit
