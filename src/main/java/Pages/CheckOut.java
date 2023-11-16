package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
public class CheckOut extends PageBase {
    public CheckOut(WebDriver driver)
    {
        super(driver);
    }
    By ClickOnCheckOutButton =By.xpath("//*[@id=\"jm\"]/main/div/div[2]/div/article/div[2]/a");
    By ClickOnConfirmDeliveryDetails = By.xpath("//*[@id=\"shippingForm\"]/button");
    By ClickOnCashOnDeliveryButton =By.cssSelector("#pmnt-5-0");
    By ClickOnChange = By.xpath("//*[@id=\"jm\"]/main/div[1]/article[2]/header/a");
    By ClickOnConfirmDeliveryDetailsAgain = By.xpath("//*[@id=\"shippingForm\"]/button");
    By ClickOnConfirmOrder = By.xpath("//*[@id=\"summaryForm\"]/button");
    public void CheckOutItem()
    {
        driver.findElement(ClickOnCheckOutButton).click();
        driver.findElement(ClickOnConfirmDeliveryDetails).click();
        driver.findElement(ClickOnCashOnDeliveryButton).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"pmntForm\"]/article[1]/div/article/div[2]/div/h4")));
        driver.findElement(ClickOnChange).click();
        driver.findElement(ClickOnConfirmDeliveryDetailsAgain).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"jm\"]/header/section/h1")));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"summaryForm\"]/button")));
        driver.findElement(ClickOnConfirmOrder).click();
    }

}
