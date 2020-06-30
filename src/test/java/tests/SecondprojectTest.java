package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.secondprojectpage;

public class SecondprojectTest extends TestBase{


   secondprojectpage secondprojectpageObj ;



    @Test
    public void sighingupfb() throws InterruptedException {
        Assert.assertEquals(driver.getCurrentUrl(),"https://www.facebook.com/");

        secondprojectpageObj = new secondprojectpage(driver);
        secondprojectpageObj.signup("Ahmed","hassan","Ahmedgghalwash@gmail.com","Ahmedgghalwash@gmail.com","Soso@1234567");


    }
}
