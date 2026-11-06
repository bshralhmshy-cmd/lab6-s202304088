public class PasswordValidatorTest {

    public static void main(String[] args) {
        PasswordValidator validator = new PasswordValidator();

        if (validator.isStrongPassword("abc")) {
            System.out.println("Test PASSED");
        } else {
            System.out.println("Test FAILED");
            System.exit(1);
        }
    }
}
