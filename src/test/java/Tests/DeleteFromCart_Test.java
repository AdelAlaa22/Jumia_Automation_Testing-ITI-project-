package Tests;

import Pages.DeleteFromCart;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.time.Duration;

public class DeleteFromCart_Test extends TestBase
{
    DeleteFromCart DeleteFromCartObject;
    @Test
    public void DeleteItemFromCartTest()
    {
        DeleteFromCartObject = new DeleteFromCart(driver);
        DeleteFromCartObject.RemoveItemFromCart();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
       wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"jm\"]/aside/div/div")));
        WebElement SuccessfullyMsg = driver.findElement(By.cssSelector("#jm > aside > div > div"));
        Assert.assertTrue(SuccessfullyMsg.getText().contains("Product was removed from cart"));
    }
}
