package contornos.ud3;
public class StringUtils {

    public static boolean isPalindrome(String str) {
        
        str = str.toLowerCase().replaceAll(" ", "");

        
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
                return false;
            }
        }

        return true;
    }
}
// Se corrigió if (str.charAt(i) == por if (str.charAt(i) !=