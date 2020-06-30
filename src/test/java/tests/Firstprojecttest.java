package tests;

import io.cucumber.java.nl.Stel;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.firstprojectPage;

public class Firstprojecttest extends TestBase {

    firstprojectPage firstprojectPageObj;
    @Test
    public void assertrightpage()

    {
        firstprojectPageObj = new firstprojectPage(driver);
        Assert.assertTrue(firstprojectPageObj.HomeBtn.getTagName().equals("a"));
        driver.navigate().to("https://www.facebook.com");
        driver.navigate().back();
        String currentUrl= driver.getCurrentUrl();
        System.out.println(currentUrl);
        driver.navigate().forward();
        driver.navigate().refresh();


    }



}
