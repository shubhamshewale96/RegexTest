package com.bl.UserRegTest;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.bl.UserReg.UserRegistration;

public class UserRegistrationTest {
	UserRegistration userRegistration;
    @Before
    public void before() {
        userRegistration = new UserRegistration();
    }

    @Test
    public void givenFirstNameWhenProperShouldReturnTrue() {
        boolean result = userRegistration.firstName("Shubham");
        Assert.assertTrue(result);
    }

    @Test
    public void givenFirstNameWhenNotProperShouldReturnFalse() {
        boolean result = userRegistration.firstName("shubham");
        Assert.assertFalse(result);
    }
}
