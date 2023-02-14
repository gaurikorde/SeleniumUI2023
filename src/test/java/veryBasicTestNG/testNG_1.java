package veryBasicTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class testNG_1 {


    @Test
    public void assertDemo() {

        System.out.println("First");
        String actTitle = "Yahoo";
        String exptitle = "Gmail";

        SoftAssert sa = new SoftAssert();

        sa.assertEquals(actTitle, exptitle);
        // Assert.assertTrue(isElementPresent("xpath")); can do sort of
      //  Assert.fail("Forcefully failing test");

        System.out.println("Last");

        sa.assertAll();
    }

}