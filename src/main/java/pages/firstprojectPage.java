package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class firstprojectPage extends PageBase{



    public firstprojectPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@id=\"menu-item-2322\"]/a")
    public WebElement HomeBtn;
}
