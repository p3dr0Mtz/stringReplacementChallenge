package com.bitso.pedrochallenge;

import org.testng.annotations.DataProvider;

import java.lang.reflect.Method;

public class DataProviderClass {
    @DataProvider(name = "positiveValidationString")
    public Object[][] positiveValidationString(Method testCase) {
        return new Object[][]{
                {" a "},
                {" z"},
                {"abc"}
        };
    }

    @DataProvider(name = "negativeValidationString")
    public Object[][] negativeValidationString(Method testCase) {
        return new Object[][]{
                {"1234567890"},
                {"˜˜@#$%ˆˆ*()_+"},
                {"pl pl"},
                {"ñ"},
                {" "}
        };
    }

    @DataProvider(name = "validateStringResult")
    public Object[][] validateStringResult(Method testCase) {
        return new Object[][]{
                {" test ", "uftu"},
                {"a", "b"},
                {"z", "a"},
        };
    }
}
