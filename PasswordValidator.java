public class PasswordValidator {

    public boolean isStrongPassword(String password) {
        if (password == null || password.length() < 8) {
            return false;
        }
        for (char c : password.toCharArray()) {
            if (Character.isDigit(c)) {
                return true;
            }
        }
        return false;
    }
}
