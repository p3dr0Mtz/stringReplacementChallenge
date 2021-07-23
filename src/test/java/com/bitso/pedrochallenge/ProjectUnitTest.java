package com.bitso.pedrochallenge;

import lombok.extern.log4j.Log4j2;
import org.testng.Assert;
import org.testng.annotations.Test;

@Log4j2
public class ProjectUnitTest {
    @Test(dataProvider = "positiveValidationString", dataProviderClass = DataProviderClass.class)
    public void positiveValidationStringTest(String inputString) {
        log.debug("Check that \"{}\" is a valid input", inputString);
        Assert.assertTrue(ProjectUtils.validateFormat(inputString));
    }

    @Test(dataProvider = "negativeValidationString", dataProviderClass = DataProviderClass.class)
    public void negativeValidationStringTest(String inputString) {
        log.debug("Check that \"{}\" is an invalid input", inputString);
        Assert.assertFalse(ProjectUtils.validateFormat(inputString));
    }

    @Test(dataProvider = "validateStringResult", dataProviderClass = DataProviderClass.class)
    public void validateStringResultTest(String inputString, String expectedResult) {
        log.debug("Check the replacement of \"{}\" is \"{}\".", inputString, expectedResult);
        Assert.assertEquals(ProjectUtils.getReplacedString(inputString), expectedResult);
    }

}
