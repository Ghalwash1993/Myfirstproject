package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class secondprojectpage extends PageBase {
    public secondprojectpage(WebDriver driver) {
        super(driver);
    }

@FindBy(id = "u_0_m")
    WebElement firstnameTxt;

    @FindBy(id = "u_0_o")
    WebElement lastnameTxt;

    @FindBy(id = "u_0_r")
    WebElement emailTxt;

    @FindBy(id = "password_step_input")
    WebElement passwordTxt;



    @FindBy(id = "u_0_7")
    WebElement gendercheckbox;

    @FindBy(id = "u_0_u")
    WebElement reenteremailTxt;

    @FindBy(id = "u_0_12")
    WebElement signUpBtn;

    @FindBy(id = "year")
    WebElement optionlist;


    public void signup(String firstname , String lastname, String email ,String reenteremail, String password) throws InterruptedException {
        setTextElementText(firstnameTxt,firstname);
        setTextElementText(lastnameTxt,lastname);
        setTextElementText(emailTxt,email);
        Thread.sleep(2000);
        setTextElementText(reenteremailTxt,reenteremail);
        setTextElementText(passwordTxt,password);

        Select selectoption = new Select(optionlist);
        selectoption.selectByIndex(28);
        clickButton(gendercheckbox);
        clickButton(signUpBtn);

    }

}
