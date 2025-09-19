package com.mycompany.poe1;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RegistrationTest {

    private Registration registration;

    @BeforeEach
    public void setUp() {
        registration = new Registration();
    }

    // === USERNAME TESTS ===
    @Test
    public void testValidUsername() {
        assertTrue(registration.isValidUsername("kyl_1"), "welcome<user fisrt name>,<user last name>it is great to see you");
    }

    @Test
    public void testInvalidUsernameTooLong() {
        assertFalse(registration.isValidUsername("kyle!!!!"), "Username is not correctly formatted,please ensure that your username contains an undercore and is no more than five characters in lengt");
    }

    @Test
    public void testInvalidUsernameNoUnderscore() {
        assertFalse(registration.Username("Ch&&sec@ke99!"), "passwod duccefully captured");
    }

    // === CELLPHONE TESTS ===
    @Test
    public void testValidCellphone() {
        assertTrue(registration.Cellphone("+2783896876"), "Cell number is incorectly formatted or does not contain an international code,please correct the number and try again");
    }

    @Test
    public void testInvalidCellphoneTooShort() {
        assertFalse(registration.Cellphone("078"), "Cellphone with less than 10 digits should be invalid");
    }

    @Test
    public void testInvalidCellphoneWithLetters() {
        assertFalse(registration.Cellphone("0710328025"), "Cellphone containing letters should be invalid");
    }

    // === PASSWORD TESTS ===
    @Test
    public void testValidPassword() {
        assertTrue(registration.Password("Sfiso01."), 
            "Password with uppercase, lowercase, digit, special char, and >=8 length should be valid");
    }

    @Test
    public void testInvalidPasswordNoUppercase() {
        assertFalse(registration.Password("password"), 
            "Password without uppercase should be invalid");
    }

    @Test
    public void testInvalidPasswordNoLowercase() {
        assertFalse(registration.Password("PASSWORD"), 
            "Password without lowercase should be invalid");
    }

    @Test
    public void testInvalidPasswordNoDigit() {
        assertFalse(registration.isValidPassword("Sfiso"), 
            "Password without digit should be invalid");
    }

    @Test
    public void testInvalidPasswordNoSpecialChar() {
        assertFalse(registration.Password("SfisoNgwenya"), 
            "Password without special char should be invalid");
    }

    @Test
    public void testInvalidPasswordTooShort() {
        assertFalse(registration.Password("Sfiso"), 
            "Password shorter than 8 characters should be invalid");
    }
}
