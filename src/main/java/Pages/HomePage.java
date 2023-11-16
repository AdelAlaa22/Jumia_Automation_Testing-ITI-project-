package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class HomePage extends PageBase
{
    public HomePage(WebDriver driver)
    {
        super(driver);
    }
        By ClickToClosePopUpMessage = By.cssSelector("#pop > div > section > button > svg > use");
        By ClickOnRegisterLink = By.xpath("//*[@id=\"jm\"]/header/section/div[2]/div[1]/label");
        By ClickOnAccount = By.xpath("//*[@id=\"dpdw-login-box\"]/div/a[1]");
    public void ClickOnRegister()
    {
        driver.findElement(ClickToClosePopUpMessage).click();
        driver.findElement(ClickOnRegisterLink).click();
        driver.findElement(ClickOnAccount).click();
    }
}


