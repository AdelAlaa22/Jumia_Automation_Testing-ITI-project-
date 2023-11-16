package Tests;

import Pages.AddToCart;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class AddToCart_Test extends TestBase {

    AddToCart AddToCartObject;
    @Test
    public void AddItemToCartTest()
    {
     AddToCartObject=new AddToCart(driver);
     AddToCartObject.AddItemsToCart();
     WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
     wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"jm\"]/aside/div/div")));
     WebElement SuccessfullyMsg = driver.findElement(By.cssSelector("#jm > aside > div > div"));
     Assert.assertTrue(SuccessfullyMsg.getText().contains("Product added successfully"));
    }

}
