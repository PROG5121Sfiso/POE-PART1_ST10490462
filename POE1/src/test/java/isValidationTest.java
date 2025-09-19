import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class isValidationTest {

    private YourValidationClass validator; // Replace with the class name that contains your methods

    @BeforeEach
    public void setUp() {
        validator = new YourValidationClass();
    }

    // ================= Username Tests =================
    @Test
    public void testValidUsername() {
        assertTrue(validator.isValidUsername("abc_"));
    }

    @Test
    public void testInvalidUsername_NoUnderscore() {
        assertFalse(validator.isValidUsername("abcde"));
    }

    @Test
    public void testInvalidUsername_TooLong() {
        assertFalse(validator.isValidUsername("abcd_ef"));
    }

    // ================= Password Tests =================
    @Test
    public void testValidPassword() {
        assertTrue(validator.isValidPassword("Abcdef1!"));
    }

    @Test
    public void testInvalidPassword_Short() {
        assertFalse(validator.isValidPassword("Ab1!"));
    }

    @Test
    public void testInvalidPassword_NoUppercase() {
        assertFalse(validator.isValidPassword("abcdef1!"));
    }

    @Test
    public void testInvalidPassword_NoLowercase() {
        assertFalse(validator.isValidPassword("ABCDEF1!"));
    }

    @Test
    public void testInvalidPassword_NoDigit() {
        assertFalse(validator.isValidPassword("Abcdefg!"));
    }

    @Test
    public void testInvalidPassword_NoSpecialChar() {
        assertFalse(validator.isValidPassword("Abcdef12"));
    }

    // ================= Cellphone Tests =================
    @Test
    public void testValidCellphone() {
        assertTrue(validator.isValidCellphone("+1234567890"));
    }

    @Test
    public void testInvalidCellphone_NoPlus() {
        assertFalse(validator.isValidCellphone("1234567890"));
    }

    @Test
    public void testInvalidCellphone_TooLong() {
        assertFalse(validator.isValidCellphone("+1234567890123456"));
    }

    @Test
    public void testInvalidCellphone_InvalidChars() {
        assertFalse(validator.isValidCellphone("+12abc3456"));
    }
}
